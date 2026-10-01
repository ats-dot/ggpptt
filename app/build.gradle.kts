plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.ats_tsalatsah.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ats_tsalatsah.app"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation("com.google.android.material:material:1.12.0")
}
