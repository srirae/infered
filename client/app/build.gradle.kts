
plugins {

    id("com.android.application")

    id("org.jetbrains.kotlin.plugin.compose")

}



android {

    namespace = "com.infered"

    compileSdk = 37

    defaultConfig {

        applicationId = "com.infered"

        minSdk = 26

        targetSdk = 37

        versionCode = 1

        versionName = "0.1"

    }

    buildFeatures { compose = true }

}



dependencies {

    implementation(platform("androidx.compose:compose-bom:2026.09.00"))

    implementation("androidx.compose.ui:ui")

    implementation("androidx.compose.material3:material3")

    implementation("androidx.activity:activity-compose:1.11.0")

}

