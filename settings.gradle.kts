pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }

    plugins {
        kotlin("multiplatform") version "1.8.10" apply false
        id("com.vanniktech.maven.publish") version "0.25.1" apply false
        id("com.vanniktech.maven.publish")
        id("org.jetbrains.dokka") version "1.7.20"
    }
}

rootProject.name = "si-units"

include(":kotunil")
include(":kotunil-generators")
include(":apps:jvm:kotlin-console")
include(":apps:jvm:java-console")

