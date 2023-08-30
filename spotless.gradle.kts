val ktlintVersion = "0.48.1"

initscript {
    val spotlessVersion = "6.21.0"

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("com.diffplug.spotless:spotless-plugin-gradle:$spotlessVersion")
    }
}

rootProject {
    subprojects {
        apply<com.diffplug.gradle.spotless.SpotlessPlugin>()
        extensions.configure<com.diffplug.gradle.spotless.SpotlessExtension> {
            kotlin {
                target("**/*.kt")
                targetExclude("**/build/**/*.kt")
                ktlint().userData(mapOf("android" to "true"))
                indentWithSpaces()
                trimTrailingWhitespace()
                endWithNewline()
            }
            format("kts") {
                target("**/*.kts")
                targetExclude("**/build/**/*.kts")
                indentWithSpaces()
                trimTrailingWhitespace()
                endWithNewline()
            }
            format("xml") {
                target("**/*.xml")
                targetExclude("**/build/**/*.xml")
                indentWithSpaces()
                trimTrailingWhitespace()
                endWithNewline()
            }
        }
    }
}
