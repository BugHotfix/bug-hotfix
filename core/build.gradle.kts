plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "kr.android.bughotfix.core"
    compileSdk = Integer.parseInt(libs.versions.compileSdk.orNull)
}

dependencies {}