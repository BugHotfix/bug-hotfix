pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }

    defaultLibrariesExtensionName.set("projectLibs")

    versionCatalogs {
        create("libs") {
            from(files("gradle/libs.versions.toml"))
        }
    }
}

rootProject.name = "bug-hotfix"

include(":app")
include(":domain")
include(":data")
include(":core")
include(":local")
include(":remote")
include(":design-system")
include(":di")
