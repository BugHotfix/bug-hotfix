plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    namespace = "kr.android.bughotfix"
    compileSdk = Integer.parseInt(libs.versions.compileSdk.orNull)

    defaultConfig {
        applicationId = "kr.android.bughotfix"
        minSdk = Integer.parseInt(libs.versions.minSdk.orNull)
        targetSdk = Integer.parseInt(libs.versions.targetSdk.orNull)
        versionCode = Integer.parseInt(libs.versions.versionCode.orNull)
        versionName = libs.versions.versionName.orNull
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
        jvmTarget = libs.versions.jvmTarget.orNull
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.orNull
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
}