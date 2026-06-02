import java.io.FileInputStream
import java.io.InputStreamReader
import java.util.Properties

plugins {
    alias(libs.plugins.android.library)

    `maven-publish`
    signing
}


android {
    namespace = "top.limuyang2.photolibrary"

    compileSdk = 36

    defaultConfig {
        minSdk = 21

        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
    }
    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlin {
        jvmToolchain(17)
    }

    publishing {
        singleVariant("release") {
            // if you don't want sources/javadoc, remove these lines
            withSourcesJar()
//            withJavadocJar()
        }
    }
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.exifinterface)
    implementation(libs.androidx.lifecycle.runtime.ktx)

    implementation(libs.realtimeblurview)
    compileOnly(libs.renderscrip.toolkit)
    compileOnly(libs.glide)

    implementation(libs.subsampling.scale.image.view)
    implementation(libs.kotlinx.coroutines.android)

}



//---------- maven upload info -----------------------------------

val versionName = "3.2"