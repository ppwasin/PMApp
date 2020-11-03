plugins {
    moduleApp()
    kotlinAndroid()
    kotlinKapt()
}

android {
    configureApp("com.adoptx.pmapp") {
        addRoomConfig(projectDir)
    }
    setupLocalSign()
    buildTypes {
        getByName("release") {
            signingConfig = signingConfigs.getByName(localSigningConfigs) //TODO move to FastFile
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.txt")
        }
    }

    configureCompose()
}

dependencies {
    implementation(fileTree(mapOf("include" to listOf("*.jar"), "dir" to "libs")))
    implementation(project(":shared"))
    testImplementation(Libs.jUnit)
    androidTestImplementation(Libs.androidTextExt)
    androidTestImplementation(Libs.expresso)
    implementation(Libs.kotlinStd)
    implementation(Libs.playCore)
    implementation(Libs.rxJava)
    implementation(Libs.rxAndroid)
    implementation(Libs.coroutineCore)
    implementation(Libs.coroutineAndroid)
    implementation(Libs.coroutineRx)
    implementation(Libs.coroutineReactive)

    implementation(Libs.timber)
    addImplementation(Libs.room)
    addImplementation(Libs.roomKtx)
    addKapt(Libs.roomKapt)
    addDate()
    addDagger()
    addNetwork()

    implementation(Libs.appCompat)
    implementation(Libs.constraintLayout)
    implementation(Libs.navDynamicFeature)
    implementation(Libs.navFragment)
    implementation(Libs.navKtx)


    implementation(Libs.googleMaterial)
    addComposeDeps()
}
