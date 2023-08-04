package tech.thdev.gradle.dependencies

object Dependency {

    object Base {
        const val buildToolsVersion = "31.0.0"
        const val compileVersion = 31
        const val targetSdk = 31
        const val minSdk = 21
    }

    object Kotlin {
        // https://github.com/JetBrains/kotlin
        const val version: String = "1.5.32"

        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib:$version"
    }

    object Coroutines {
        // https://github.com/Kotlin/kotlinx.coroutines
        private const val version: String = "1.5.2"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"

        // https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-test/
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"

    }

    object AndroidX {
        // https://developer.android.com/jetpack/androidx/releases/core
        const val coreKtx = "androidx.core:core-ktx:1.6.0"

        // https://developer.android.com/jetpack/androidx/releases/appcompat
        const val appCompat = "androidx.appcompat:appcompat:1.3.1"

        // https://developer.android.com/jetpack/androidx/releases/activity
        const val activity = "androidx.activity:activity-ktx:1.3.1"

        // https://developer.android.com/jetpack/androidx/releases/constraintlayout
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.1"

        // https://developer.android.com/jetpack/androidx/releases/vectordrawable
        const val vectorDrawable = "androidx.vectordrawable:vectordrawable:1.1.0"
    }

    object Google {
        // https://github.com/material-components/material-components-android/releases
        const val material = "com.google.android.material:material:1.4.0"
    }

    object Network {
        // https://square.github.io/okhttp/
        const val okhttpVersion = "4.9.0"
        const val okhttp = "com.squareup.okhttp3:okhttp:$okhttpVersion"
        const val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:$okhttpVersion"

        // https://github.com/square/retrofit
        const val retrofitVersion = "2.9.0"
        const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"

        // https://github.com/square/okhttp/tree/master/mockwebserver
        const val okhttp3MockWebServer = "com.squareup.okhttp3:mockwebserver:4.9.3"
    }


}