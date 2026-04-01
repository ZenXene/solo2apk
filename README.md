# TRAE SOLO Android App

## 项目简介

这是一个基于 Capacitor 构建的 Android 应用，用于访问 TRAE SOLO 网站 (`https://solo.trae.cn/`)。

## 功能特性

- 完整访问 TRAE SOLO 网站内容
- 原生 Android 应用体验
- 响应式设计，适配不同屏幕尺寸
- 使用 TRAE SOLO 官方图标

## 技术栈

- Capacitor 6.x
- Android SDK
- Java 21

## 构建步骤

### 前置要求

- Java 21
- Android SDK
- Node.js

### 本地构建

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
   # 设置环境变量
   export JAVA_HOME=/path/to/java21
   export ANDROID_HOME=/path/to/android-sdk
   
   # 构建调试版本
   cd android
   ./gradlew assembleDebug
   
   # 构建发布版本
   ./gradlew assembleRelease
   ```

### GitHub Actions 构建

1. **推送代码**到 GitHub 仓库
2. **访问** GitHub 仓库的 Actions 标签页
3. **下载**构建完成的 APK 文件

## 安装说明

1. **启用** Android 设备的 "未知来源" 安装选项
2. **下载** APK 文件到设备
3. **点击** APK 文件进行安装
4. **打开** TRAE SOLO 应用

## 项目结构

```
solo2apk/
├── android/           # Android 项目
├── dist/              # Web 资源
├── .github/           # GitHub Actions 配置
├── .gitignore         # Git 忽略文件
├── capacitor.config.json  # Capacitor 配置
├── package.json       # 项目配置
└── README.md          # 项目说明
```

## 注意事项

- 应用需要网络连接才能访问 TRAE SOLO 网站
- 首次启动可能需要一些时间加载网站内容
- 请确保设备有足够的存储空间

## 许可证

MIT License

---

# TRAE SOLO Android App

## Project Introduction

This is an Android app built with Capacitor for accessing the TRAE SOLO website (`https://solo.trae.cn/`).

## Features

- Full access to TRAE SOLO website content
- Native Android app experience
- Responsive design, adapting to different screen sizes
- Uses official TRAE SOLO icon

## Tech Stack

- Capacitor 6.x
- Android SDK
- Java 21

## Build Steps

### Prerequisites

- Java 21
- Android SDK
- Node.js

### Local Build

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
   # Set environment variables
   export JAVA_HOME=/path/to/java21
   export ANDROID_HOME=/path/to/android-sdk
   
   # Build debug version
   cd android
   ./gradlew assembleDebug
   
   # Build release version
   ./gradlew assembleRelease
   ```

### GitHub Actions Build

1. **Push code** to GitHub repository
2. **Visit** the Actions tab of the GitHub repository
3. **Download** the built APK file

## Installation Instructions

1. **Enable** "Unknown sources" installation option on your Android device
2. **Download** the APK file to your device
3. **Tap** the APK file to install
4. **Open** the TRAE SOLO app

## Project Structure

```
solo2apk/
├── android/           # Android project
├── dist/              # Web resources
├── .github/           # GitHub Actions configuration
├── .gitignore         # Git ignore file
├── capacitor.config.json  # Capacitor configuration
├── package.json       # Project configuration
└── README.md          # Project documentation
```

## Notes

- The app requires network connection to access the TRAE SOLO website
- First launch may take some time to load website content
- Ensure your device has enough storage space

## License

MIT License