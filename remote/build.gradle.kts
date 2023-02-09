plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "kr.android.bughotfix.remote"
    compileSdk = Integer.parseInt(libs.versions.compileSdk.orNull)
}

dependencies {
    implementation(project(":core"))
}