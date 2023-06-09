plugins {
    id("my.kotlin.library")
    id("my.kotlin.library.test")
}

dependencies {
    compileOnly(libs.bundles.lint)
    testImplementation(libs.bundles.lint.test)
}