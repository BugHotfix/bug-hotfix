plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "kr.android.bughotfix.designsystem"
    compileSdk = Integer.parseInt(libs.versions.compileSdk.orNull)

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.orNull
    }
}

dependencies {}