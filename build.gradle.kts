buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(libs.com.android.tools.build.gradle)
        classpath(libs.org.jetbrains.kotlin.gradle.plugin)
        classpath(libs.com.google.dagger.hilt.android.gradle.plugin)
        classpath(libs.app.cash.paparazzi.gradle.plugin)
    }
}

plugins {
    alias(libs.plugins.io.gitlab.arturbosch.detekt.plugin)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
