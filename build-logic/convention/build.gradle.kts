plugins {
    `kotlin-dsl`
}

group = "com.rodrigoguerrero.buildconvention"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(libs.com.android.tools.build.gradle)
    compileOnly(libs.org.jetbrains.kotlin.gradle.plugin)
    compileOnly(libs.io.gitlab.arturbosch.detekt)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "my.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidComposeApplication") {
            id = "my.android.compose.application"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
        register("androidHilt") {
            id = "my.android.hilt"
            implementationClass = "AndroidHiltConventionPlugin"
        }
        register("androidLibrary") {
            id = "my.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidLibraryCompose") {
            id = "my.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }
        register("androidLibraryTest") {
            id = "my.android.library.test"
            implementationClass = "AndroidLibraryTestConventionPlugin"
        }
        register("kotlinLibrary") {
            id = "my.kotlin.library"
            implementationClass = "KotlinLibraryConventionPlugin"
        }
    }
}
