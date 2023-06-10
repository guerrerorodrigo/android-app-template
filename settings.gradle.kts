pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "android-app-template"
include(":analysis")
include(":analysis:lint-custom-rules")
include(":app")
include(":ui:core:theme")
include(":ui:feature")
include(":ui:feature:home")
