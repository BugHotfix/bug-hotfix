plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "kr.android.bughotfix.data"
    compileSdk = Integer.parseInt(libs.versions.compileSdk.orNull)
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":local"))
    implementation(project(":remote"))
    implementation(project(":core"))
}