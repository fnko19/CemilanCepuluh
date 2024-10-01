// Top-level build script for InformasiMakanan

plugins {
    alias(libs.plugins.android.application) // Android Application Plugin
    alias(libs.plugins.jetbrains.kotlin.android) // Kotlin Android Plugin
}

// Define extra properties for SDK versions
val compileSdkVersion: Int by extra
val targetSdkVersion: Int by extra

// Assign values to the extra properties
extra["compileSdkVersion"] = 34 // Define your compile SDK version
extra["targetSdkVersion"] = 34 // Define your target SDK version

android {
    compileSdk = (extra["compileSdkVersion"] as Int) // Cast the extra property to Int

    namespace = "com.example.informasimakanan" // Specify your namespace here

    defaultConfig {
        applicationId = "com.example.informasimakanan" // Set your app's unique ID
        minSdk = 21 // Minimum SDK level supported
        targetSdk = (extra["targetSdkVersion"] as Int) // Cast to Int
        versionCode = 1 // Version code for APK
        versionName = "1.0" // Version name
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false // Disable minification in release build
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

// Dependencies block to include libraries
dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
}
