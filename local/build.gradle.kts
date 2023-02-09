plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "kr.android.bughotfix.local"
    compileSdk = Integer.parseInt(libs.versions.compileSdk.orNull)
}

dependencies {
    implementation(project(":core"))
}