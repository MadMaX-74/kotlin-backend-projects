plugins {
    kotlin("jvm") version "2.0.0"
}

group = "ru.otus"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libraries.kotlin.stdlib)
    testImplementation(libraries.junit.jupiter)
}

kotlin {
    jvmToolchain(21)
}