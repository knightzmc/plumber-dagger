package me.bristermitten.guice

import com.google.inject.AbstractModule
import com.google.inject.Guice
import com.google.inject.Inject

class GuiceRunner {


    fun run() {
        val injector = Guice.createInjector(GuiceModule())

        injector.getInstance(Class3::class.java)
    }
}

class Class1 @Inject constructor(val x: Int)
class Class2 @Inject constructor(val x: Class1)
class Class3 @Inject constructor(val x: Class2, y: Int)

class GuiceModule : AbstractModule() {
    override fun configure() {
        bind(Int::class.java).toInstance(3)
    }
}
