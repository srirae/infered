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
    implementation("com.composables:composeunstyled:2.10.2")
    implementation("com.composables:ripple-indication:1.1.1")
    implementation("com.composables:google-fonts:0.3.0")
    implementation("com.composables:systembars:1.0.0")
    implementation("com.composables:compose-uri-painter:1.4.0")
    implementation("io.github.vinceglb:filekit-dialogs-compose:0.14.1")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.7.1")
}
