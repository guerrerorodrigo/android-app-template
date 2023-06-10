# Android App Starter Template

This template includes several libraries and startup configurations that can be used by most Android apps. 

## App Configuration

You can find the app configuration (`applicationId`, `versionCode`, `versionName`, etc) in [AppConfig.kt](./build-logic/convention/src/main/kotlin/com/rodrigoguerrero/buildlogic/convention/AppConfig.kt).

## Convention Plugins

This template follows the `gradle` convention plugins to share `gradle` logic between modules. These are the convention plugins available in this template:

### [AndroidApplicationComposeConventionPlugin](./build-logic/convention/src/main/kotlin/AndroidApplicationComposeConventionPlugin.kt)

This plugin configures a compose application. Use it in your `application` `build.gradle` file, like [this](./app/build.gradle.kts): `id("my.android.compose.application")`.

### [AndroidApplicationConventionPlugin](./build-logic/convention/src/main/kotlin/AndroidApplicationConventionPlugin.kt)

This plugin configures an Android application. Use it in your `application` `build.gradle` file, like [this](./app/build.gradle.kts): `id("my.android.application")`.


### [AndroidApplicationJacocoConventionPlugin](./build-logic/convention/src/main/kotlin/AndroidApplicationJacocoConventionPlugin.kt)

This plugin configures Jacoco in the application module. Use it in your `application` `build.gradle` file, like [this](./app/build.gradle.kts): `id("my.android.jacoco.application")`.


### [AndroidFeatureConventionPlugin](./build-logic/convention/src/main/kotlin/AndroidFeatureConventionPlugin.kt)

This plugin configures a feature module. It includes [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) for dependency injection. Use it in your `application` `build.gradle` file, like [this](./app/build.gradle.kts): `id("my.android.jacoco.application")`.

### [AndroidHiltConventionPlugin](./build-logic/convention/src/main/kotlin/AndroidHiltConventionPlugin.kt)

This plugin configures a [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) for the app module. Use it in your `application` `build.gradle` file, like [this](./app/build.gradle.kts): `id("my.android.hilt")`.


### [AndroidLibraryComposeConventionPlugin](./build-logic/convention/src/main/kotlin/AndroidLibraryComposeConventionPlugin.kt)

This plugin configures a compose library module. Use it in any `build.gradle` module file where you need `compose`, like [this](./ui/feature/home/build.gradle.kts): `id("my.android.library.compose")`.


### [AndroidLibraryConventionPlugin](./build-logic/convention/src/main/kotlin/AndroidLibraryConventionPlugin.kt)

This plugin configures a non-compose library module. Use it in any `build.gradle` Android module file, like this: `id("my.android.library")`.


### [AndroidLibraryJacocoConventionPlugin](./build-logic/convention/src/main/kotlin/AndroidLibraryJacocoConventionPlugin.kt)

This plugin configures Jacoco for an Android library module. Use it in any `build.gradle` library module where you want to have `Jacoco` coverage, like [this](./ui/feature/home/build.gradle.kts): `id("my.android.jacoco.library")`.


### [AndroidLibraryTestConventionPlugin](./build-logic/convention/src/main/kotlin/AndroidLibraryTestConventionPlugin.kt)

This plugin configures test dependencies for an Android library module. Use it in any `build.gradle` where you need to add tests, like [this](./ui/feature/home/build.gradle.kts): `id("my.android.library.test")`.


### [AndroidRoomLibraryConventionPlugin](./build-logic/convention/src/main/kotlin/AndroidRoomLibraryConventionPlugin.kt)

This plugin configures `Room` for a library module. Use it in any `build.gradle` where you need a `Room` database, like this: `id("my.android.room.library")`.

### [KotlinLibraryConventionPlugin](./build-logic/convention/src/main/kotlin/KotlinLibraryConventionPlugin.kt)

This plugin configures a pure `Kotlin` library module. Use it in any `build.gradle` where you want a pure `Kotlin` module, like this: `id("my.kotlin.library")`.


### [KotlinLibraryTestConventionPlugin](./build-logic/convention/src/main/kotlin/KotlinLibraryTestConventionPlugin.kt)

This plugin configures a tests for a pure `Kotlin` library module. Use it in any `build.gradle` where you want a pure `Kotlin` module, like this: `id("my.kotlin.library.test")`.

## Github Actions
The template includes a [`Build.yaml`](./.github/workflows/Build.yaml) file that executes the following tasks when pushing a commit to master or when creating a pull request:
- `./gradlew spotlessCheck --init-script spotless.gradle.kts --no-configuration-cache`
- `./gradlew lintDebug`
- `./gradlew assembleDebug`
- `./gradlew testDebug testDebugUnitTest`

## Git Hooks
The [`commit-msg`](./analysis/git-hooks/commit-msg) `Git Hook` is included. It enforces [conventional commits](https://www.conventionalcommits.org/en/v1.0.0/).

## Lint
You can add your custom `lint` rules in `analysis/lint-custom-rules`. Also you can modify the default `lint` configuration in [`lint.config.xml`](./analysis/lint/lint-config.xml).

To run `lint` you can use `./gradlew lintDebug`.

## Version Catalogue

The [version catalogue](./gradle/libs.version.toml) contains definitions and bundles for the following libraries:

### Android Core
- [CoreKtx](https://developer.android.com/kotlin/ktx)
- [Lifecycle](https://developer.android.com/jetpack/androidx/releases/lifecycle)
- [OkHttp3](https://square.github.io/okhttp/)
- [Ktor](https://ktor.io/)
- [Kotlin Serialization](https://github.com/Kotlin/kotlinx.serialization)
- [Kotlin Immutable Collections](https://github.com/Kotlin/kotlinx.collections.immutable)
- [Kotlin Coroutines](https://github.com/Kotlin/kotlinx.coroutines)
- [Kotlin DateTime](https://github.com/Kotlin/kotlinx-datetime)

### Android Components
- [SplashScreen](https://developer.android.com/develop/ui/views/launch/splash-screen)
- [DataStore](https://developer.android.com/topic/libraries/architecture/datastore)
- [Hilt](https://developer.android.com/training/dependency-injection/hilt-android)
- [Room](https://developer.android.com/training/data-storage/room)
- [Startup](https://developer.android.com/topic/libraries/app-startup)
- [WorkManager](https://developer.android.com/topic/libraries/architecture/workmanager) 
- [Protobuf](https://developer.android.com/codelabs/android-proto-datastore#1)

### Android UI
- [Compose](https://developer.android.com/jetpack/compose)
- [Compose Navigation](https://developer.android.com/jetpack/compose/navigation)
- [Accompanist](https://github.com/google/accompanist)
- [Coil](https://coil-kt.github.io/coil/)

### Benchmarking
- [Macrobenchmark](https://developer.android.com/topic/performance/benchmarking/macrobenchmark-overview)
- [ProfileInstaller](https://developer.android.com/jetpack/androidx/releases/profileinstaller)

### Testing
- [AndroidX Arch Core Testing](https://developer.android.com/jetpack/androidx/releases/arch-core)
- [Core Testing](https://developer.android.com/jetpack/androidx/releases/test)
- [Espresso](https://developer.android.com/training/testing/espresso)
- [jUnit](https://developer.android.com/training/testing/local-tests)
- [Paparazzi](https://github.com/cashapp/paparazzi)
- [Turbine](https://github.com/cashapp/turbine)
- [Mockk](https://mockk.io/)
- [Strikt](https://strikt.io/)
- [Coroutines Testing](https://developer.android.com/kotlin/coroutines/test)

### Code Analysis & Coverage
- [Lint](https://developer.android.com/studio/write/lint)
- [Spotless](https://github.com/diffplug/spotless)
- [Slack Compose Lint](https://github.com/slackhq/compose-lints)
- [Detekt](https://detekt.dev/)
- [Jacoco](https://www.eclemma.org/jacoco/)

## UI
You can find a custom theme definition based on `Material3` for `compose` in [Theme.kt](./ui/core/theme). This custom definition consists of dark and light theme colors, custom typography, custom shapes and a `Padding` class with predefined values.



