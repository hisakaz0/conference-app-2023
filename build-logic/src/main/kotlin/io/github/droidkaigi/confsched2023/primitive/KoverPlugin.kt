package io.github.droidkaigi.confsched2023.primitive

import kotlinx.kover.gradle.plugin.dsl.KoverProjectExtension
import kotlinx.kover.gradle.plugin.dsl.KoverReportExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

@Suppress("unused")
class KoverPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with (target) {
            pluginManager.apply("org.jetbrains.kotlinx.kover")
            extensions.configure<KoverProjectExtension>("kover") { }
            extensions.configure<KoverReportExtension>("koverReport") {
                filters {
                    excludes {
                        packages(
                            "com.airbnb.android.showkase",
                            "hilt_aggregated_deps",
                        )
                    }
                }
                defaults {
                    verify {
                        rule { }
                    }
                }
            }
        }
    }
}
