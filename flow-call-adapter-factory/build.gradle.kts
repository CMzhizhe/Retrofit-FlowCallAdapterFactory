import tech.thdev.gradle.dependencies.Dependency
import tech.thdev.gradle.locals.apis


plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}



android {
    compileSdk = Dependency.Base.compileVersion
    buildToolsVersion = Dependency.Base.buildToolsVersion

    defaultConfig {
        minSdk = Dependency.Base.minSdk
        targetSdk = Dependency.Base.targetSdk
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("debug") {
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }

        getByName("release") {
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    // buildconfig 생성하지 않기
    libraryVariants.all {
        generateBuildConfigProvider.configure {
            enabled = false
        }
    }

}

dependencies {
    apis(
        Dependency.Kotlin.stdLib,
        Dependency.Network.retrofit,
        Dependency.Coroutines.core,
    )


}