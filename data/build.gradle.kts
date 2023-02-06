plugins {
    kotlin("android")
    id("com.android.library")
}

android {
    namespace = "kr.android.bughotfix.data"
    compileSdk = 33
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":local"))
    implementation(project(":remote"))
}