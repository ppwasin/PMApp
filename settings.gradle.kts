pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        jcenter()
        mavenCentral()
    }
//    val androidGradle: String by settings
//    resolutionStrategy {
//        eachPlugin {
//            if (requested.id.namespace == "com.android" || requested.id.name == "kotlin-android-extensions") {
//                useModule(androidGradle)
//            }
//        }
//    }
}
rootProject.name = "PMApp"


include(":androidApp")
include(":shared")

