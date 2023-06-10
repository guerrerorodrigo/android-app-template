plugins {
    id("my.android.feature")
    id("my.android.library.compose")
    id("my.android.library.test")
    id("my.android.jacoco.library")
}

android {
    namespace = "com.rodrigoguerrero.home"
}

dependencies {
    implementation(project(":ui:core:theme"))
}
