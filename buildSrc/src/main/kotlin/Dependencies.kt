import org.gradle.kotlin.dsl.DependencyHandlerScope


fun DependencyHandlerScope.jaicf(module: String): String = "com.justai.jaicf:$module" version { jaicf }

fun DependencyHandlerScope.kotlinx(module: String): String = "org.jetbrains.kotlinx:$module"
