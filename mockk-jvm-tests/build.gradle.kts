plugins {
    kotlin("jvm")
}

group = "com.denire.jaicf"
version = "release-0.13.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(jaicf("core"))
    implementation("org.slf4j:slf4j-api" version { slf4j })

    api(kotlinx("atomicfu") version { atomicfu })
    api("io.mockk:mockk" version { mockk })
    api("org.junit.jupiter:junit-jupiter-api" version { jUnit })
}
