const val kotlinVersion = "1.3.21"


object BuildPlugins {

    object Versions {
        const val buildToolsVersion = "3.3.1"
        const val navigation = "2.0.0"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val navigationGradlePlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val kapt = "kotlin-kapt"
    const val navigationSafeArgs = "androidx.navigation.safeargs.kotlin"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"

}

object AndroidSdk {
    const val min = 15
    const val compile = 28
    const val target = compile
}

object Libraries {
    private object Versions {
        const val jetpack = "1.0.2"
        const val constraintLayout = "1.1.3"
        const val ktx = "1.0.2"
        const val koinVersion = "2.0.1"
        const val navigation = "2.0.0"
        const val lifecycle_version = "2.0.0"
    }

    const val kotlinStdLib     = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    const val appCompat        = "androidx.appcompat:appcompat:${Versions.jetpack}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore          = "androidx.core:core-ktx:${Versions.ktx}"
//    const val koinAndroid      = "org.koin:koin-android:${Versions.koinVersion}"
    const val koinScope        = "org.koin:koin-android-scope:${Versions.koinVersion}"
    const val koinViewModel    = "org.koin:koin-android-viewmodel:${Versions.koinVersion}"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle_version}"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle_version}"
}

object TestLibraries {
    private object Versions {
        const val junit4 = "4.12"
        const val testRunner = "1.1.1"
        const val espresso = "3.1.1"
    }
    const val junit4     = "junit:junit:${Versions.junit4}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espresso   = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}