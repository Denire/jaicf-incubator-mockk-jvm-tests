plugins {
    kotlin("jvm") version "1.4.21"
}

group = "com.denire.jaicf"
version = "release-0.13.1"

allprojects {
    repositories {
        mavenCentral()
        jcenter()
    }
}

dependencies {
    implementation(kotlin("stdlib"))
}
