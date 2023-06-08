plugins {
    id("my.android.application")
    id("my.android.compose.application")
    id("my.android.hilt")
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
    implementation(project(":ui:feature:home"))
}
