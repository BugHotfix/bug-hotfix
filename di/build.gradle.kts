plugins {
    kotlin("android")
    id("com.android.library")
}

android {
    namespace = "kr.android.bughotfix.di"
    compileSdk = 33
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":data"))
    implementation(project(":local"))
    implementation(project(":remote"))
}
