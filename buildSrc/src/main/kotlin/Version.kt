object Version {
    // Kotlin
    const val kotlin = "1.4.21"
    const val stdLib = "1.4.21"

    const val jaicf = "0.14.0-BETA"

    const val mockk = "1.10.2"
    const val atomicfu = "0.15.0"

    const val slf4j = "1.7.30"
    const val jUnit = "5.6.0"
}

infix fun String.version(versionProvider: Version.() -> String) = "$this:${versionProvider(Version)}"