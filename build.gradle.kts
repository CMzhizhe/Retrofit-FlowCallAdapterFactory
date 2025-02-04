buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(tech.thdev.gradle.dependencies.Gradle.android)
        classpath(tech.thdev.gradle.dependencies.Gradle.kotlin)
        classpath("com.android.tools.build:gradle:7.2.0")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"

        kotlinOptions.allWarningsAsErrors = false

        kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
        kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.Experimental"
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}