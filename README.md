# TRAE SOLO Android App

## 项目简介

这是一个基于 Capacitor 构建的 Android 应用，用于访问 TRAE SOLO 网站 (`https://solo.trae.cn/`)。该应用提供了原生 Android 体验，让用户可以直接在手机上访问 TRAE SOLO 的全部功能。

## 功能特性

- ✅ 完整访问 TRAE SOLO 网站所有内容
- ✅ 原生 Android 应用体验
- ✅ 响应式设计，适配不同屏幕尺寸
- ✅ 使用 TRAE SOLO 官方图标
- ✅ 快速加载和流畅运行

## 技术栈

- Capacitor 6.x（跨平台移动应用框架）
- Android SDK
- Java 21

## 如何使用

### 直接下载 APK

1. **下载 APK**：从项目根目录下载 `solo-app.apk` 文件
2. **安装到设备**：
   - 启用 Android 设备的 "未知来源" 安装选项（设置 → 安全 → 未知来源）
   - 将 APK 文件传输到设备（可通过 USB、蓝牙或云存储）
   - 点击 APK 文件进行安装
3. **打开应用**：安装完成后，点击应用图标启动

### 本地构建

如果您需要自定义或修改应用，可以按照以下步骤本地构建：

1. **克隆仓库**
   ```bash
   git clone https://github.com/ZenXene/solo2apk.git
   cd solo2apk
   ```

2. **安装依赖**
   ```bash
   npm install
   ```

3. **构建 APK**
   ```bash
   # 设置环境变量（根据您的系统配置）
   export JAVA_HOME=/path/to/java21
   export ANDROID_HOME=/path/to/android-sdk
   
   # 构建调试版本
   cd android
   ./gradlew assembleDebug
   
   # 构建发布版本
   ./gradlew assembleRelease
   ```

## 项目结构

```
solo2apk/
├── android/           # Android 项目源码
├── dist/              # Web 资源文件
├── resources/         # 应用资源（如图标）
├── .github/           # GitHub 配置文件
├── .gitignore         # Git 忽略文件配置
├── capacitor.config.json  # Capacitor 配置文件
├── package.json       # 项目依赖和配置
├── README.md          # 项目说明文档
└── solo-app.apk       # 预构建的 APK 文件
```

## 构建说明

### 前置要求

- Java 21（必须，Android 构建工具要求）
- Android SDK（包含最新的构建工具和平台）
- Node.js（用于运行 Capacitor）

### 构建流程

1. **初始化项目**：创建 Capacitor 项目并配置基本信息
2. **配置应用**：设置应用名称、图标和网站 URL
3. **构建 Web 资源**：生成需要嵌入的 Web 内容
4. **同步到 Android**：将 Web 资源同步到 Android 项目
5. **构建 APK**：使用 Gradle 构建 Android 应用
6. **验证构建**：检查 APK 文件是否生成成功

## 注意事项

- 应用需要网络连接才能访问 TRAE SOLO 网站
- 首次启动可能需要一些时间加载网站内容
- 请确保设备有足够的存储空间（至少 50MB）
- 此 APK 为调试版本，用于测试和开发
- 如需发布版本，请按照 Android 发布流程进行签名和优化

## 常见问题

**Q: 安装时提示 "安装被阻止"？**
A: 请在设备设置中启用 "未知来源" 安装选项。

**Q: 应用启动后白屏？**
A: 请检查网络连接，确保设备可以正常访问 `https://solo.trae.cn/`。

**Q: 应用运行缓慢？**
A: 首次启动需要加载网站资源，后续使用会更流畅。

## 许可证

MIT License

---

# TRAE SOLO Android App

## Project Introduction

This is an Android app built with Capacitor for accessing the TRAE SOLO website (`https://solo.trae.cn/`). The app provides a native Android experience, allowing users to access all TRAE SOLO features directly on their mobile devices.

## Features

- ✅ Full access to all TRAE SOLO website content
- ✅ Native Android app experience
- ✅ Responsive design, adapting to different screen sizes
- ✅ Uses official TRAE SOLO icon
- ✅ Fast loading and smooth operation

## Tech Stack

- Capacitor 6.x (cross-platform mobile app framework)
- Android SDK
- Java 21

## How to Use

### Direct APK Download

1. **Download APK**：Download `solo-app.apk` from the project root directory
2. **Install to device**：
   - Enable "Unknown sources" installation option on your Android device (Settings → Security → Unknown sources)
   - Transfer the APK file to your device (via USB, Bluetooth, or cloud storage)
   - Tap the APK file to install
3. **Open the app**：After installation, tap the app icon to launch

### Local Build

If you need to customize or modify the app, you can build it locally following these steps：

1. **Clone the repository**
   ```bash
   git clone https://github.com/ZenXene/solo2apk.git
   cd solo2apk
   ```

2. **Install dependencies**
   ```bash
   npm install
   ```

3. **Build APK**
   ```bash
   # Set environment variables (according to your system configuration)
   export JAVA_HOME=/path/to/java21
   export ANDROID_HOME=/path/to/android-sdk
   
   # Build debug version
   cd android
   ./gradlew assembleDebug
   
   # Build release version
   ./gradlew assembleRelease
   ```

## Project Structure

```
solo2apk/
├── android/           # Android project source code
├── dist/              # Web resource files
├── resources/         # App resources (e.g., icons)
├── .github/           # GitHub configuration files
├── .gitignore         # Git ignore file configuration
├── capacitor.config.json  # Capacitor configuration file
├── package.json       # Project dependencies and configuration
├── README.md          # Project documentation
└── solo-app.apk       # Pre-built APK file
```

## Build Instructions

### Prerequisites

- Java 21 (required for Android build tools)
- Android SDK (with latest build tools and platforms)
- Node.js (for running Capacitor)

### Build Process

1. **Initialize project**：Create Capacitor project and configure basic information
2. **Configure app**：Set app name, icon, and website URL
3. **Build web resources**：Generate web content to be embedded
4. **Sync to Android**：Sync web resources to Android project
5. **Build APK**：Build Android app using Gradle
6. **Verify build**：Check if APK file is generated successfully

## Notes

- The app requires network connection to access the TRAE SOLO website
- First launch may take some time to load website content
- Ensure your device has enough storage space (at least 50MB)
- This APK is a debug version for testing and development
- For release version, follow Android release process for signing and optimization

## Frequently Asked Questions

**Q: Installation blocked?**
A: Please enable "Unknown sources" installation option in device settings.

**Q: White screen after launch?**
A: Check network connection and ensure device can access `https://solo.trae.cn/`.

**Q: App running slowly?**
A: First launch needs to load website resources, subsequent use will be smoother.

## License

MIT License