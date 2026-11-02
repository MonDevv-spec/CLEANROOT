# CleanRoot

CleanRoot is a root-aware Android maintenance app scaffold. The project uses Kotlin, Jetpack Compose, Material 3, Navigation Compose, and libsu.

## Phase 1 foundation

- Android application module with `minSdk 28`, `compileSdk 35`, and `targetSdk 35`.
- Kotlin/JVM target 17, AGP 8.7.3, and Gradle wrapper 8.13.
- Material 3 theme with Android 12+ dynamic colors and a teal/cyan fallback palette.
- Bottom navigation shell for Dashboard, Storage, System, and Settings.
- Version catalog for Compose, Navigation, Coil, Coroutines, and libsu.
- libsu `core` and `io` dependencies declared; root operations are intentionally not implemented until Phase 2.

## Open in Android Studio

Open this directory as a project. Android Studio should use the included Gradle wrapper and prompt you to install Android SDK Platform 35 if it is not already installed. Then run the `app` configuration on an emulator or device.

Root-dependent functions must only be tested on a device where the user has enabled root access. This scaffold does not run root commands or request storage permissions yet.

## Project structure

```text
app/src/main/java/com/cleanroot/app/
  MainActivity.kt
  ui/
    navigation/CleanRootApp.kt
    theme/Theme.kt
```
