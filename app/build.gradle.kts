plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")

}

android {
    namespace = "kr.android.bughotfix"
    compileSdk = 33

    defaultConfig {
        applicationId = "kr.android.bughotfix"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.2"
    }
    packagingOptions {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}

dependencies {
    implementation(project(":di"))
    implementation(project(":domain"))
    implementation(project(":core"))
    implementation(project(":design-system"))

    implementation(libs.androidx.activity.compose)
    implementation(libs.bundles.compose.ui)
}