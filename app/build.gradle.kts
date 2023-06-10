plugins {
    id("my.android.application")
    id("my.android.compose.application")
    id("my.android.hilt")
    id("my.android.jacoco.application")
}

android {
    namespace = "com.rodrigoguerrero.myapp"

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(":ui:core:theme"))
    implementation(project(":ui:feature:home"))
}

afterEvaluate {
    tasks
        .filter { task ->
            task.name.equals("clean", ignoreCase = true) ||
                    task.name.contains("assemble", ignoreCase = true)
        }.forEach { task ->
            task.dependsOn(":analysis:installGitHooks")
        }
}
