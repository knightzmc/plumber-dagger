package me.bristermitten

import me.bristermitten.dagger.DaggerRunner
import me.bristermitten.guice.GuiceRunner
import kotlin.system.measureTimeMillis

fun main() {
//    val guiceTime = measureTimeMillis {
//        for (i in 0..100000)
//            GuiceRunner().run()
//    }

//    println("Guice: $guiceTime ms")

    val daggerTime = measureTimeMillis {
//        for (i in 0..100000)
            DaggerRunner().run()
    }

    println("Dagger Time: $daggerTime ms")
}
