package com.trae.solo;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        WebView.setWebContentsDebuggingEnabled(true);
        super.onCreate(savedInstanceState);
        
        WebView webView = this.getBridge().getWebView();
        if (webView != null) {
            webView.setWebViewClient(new CustomWebViewClient());
        }
    }
    
    private class CustomWebViewClient extends WebViewClient {
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            
            // 直接修复：弹窗必须在最上层
            String js = 
                "(function() {" +
                "    var style = document.createElement('style');" +
                "    style.textContent = '" +
                
                // 降低所有侧边栏的 z-index
                "aside, nav, [class*=sidebar], [class*=Sidebar], [class*=side-panel], [class*=left-panel] { z-index: 100 !important; }" +
                
                // 提高所有弹窗的 z-index
                "[role=dialog], [data-testid*=modal], .ant-modal-wrap, .ant-modal, [class*=modal], [class*=Modal], [class*=dialog], [class*=Dialog], [class*=popup], [class*=Popup] { z-index: 99999 !important; }" +
                
                // 遮罩层
                ".ant-modal-mask, [class*=mask], [class*=overlay], [class*=backdrop] { z-index: 99998 !important; }" +
                
                // 弹窗内容
                ".ant-modal-content { z-index: 100000 !important; position: relative !important; }" +
                
                // 关闭按钮
                ".ant-modal-close, [aria-label=Close], button[class*=close] { position: absolute !important; top: 16px !important; right: 16px !important; z-index: 100001 !important; }" +
                
                "';" +
                "    document.head.appendChild(style);" +
                "    console.log('✓ CSS injected');" +
                "})();";
            
            view.evaluateJavascript(js, null);
        }
    }
}
