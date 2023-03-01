/**
 * 'val Project.libs: LibrariesForLibs' can't be called in this context by implicit receiver. Use the explicit one if necessary
 * -> https://github.com/gradle/gradle/issues/18107
 */
plugins {
    alias(libs.plugins.kotlin.android) apply(false)
    alias(libs.plugins.kotlin.jvm) apply(false)

    alias(libs.plugins.android.application) apply(false)
    alias(libs.plugins.android.library) apply(false)

    alias(libs.plugins.google.service) apply(false)
}
