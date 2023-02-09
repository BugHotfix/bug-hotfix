plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "kr.android.bughotfix.di"
    compileSdk = Integer.parseInt(libs.versions.compileSdk.orNull)
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":data"))
    implementation(project(":local"))
    implementation(project(":remote"))
    implementation(project(":core"))
}
