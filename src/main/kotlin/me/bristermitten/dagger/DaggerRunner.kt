package me.bristermitten.dagger

import dagger.Component
import dagger.Module
import dagger.Provides
import me.bristermitten.testaspect.DaggerChildTestAspect
import me.bristermitten.testaspect.DaggerTestAspect
import javax.inject.Inject

class DaggerRunner {
    fun run() {
        DaggerClassMaker.create().createClass3()
        DaggerTestAspect.create().getCommands().forEach {
            println(it)
        }
    }

}

@Component(modules = [IntModule::class])
interface ClassMaker {
    fun createClass3(): Class3
}

@Module
class IntModule {
    @Provides
    fun provideInt(): Int = 3
}

class Class1 @Inject constructor(val x: Int)
class Class2 @Inject constructor(val x: Class1)
class Class3 @Inject constructor(val x: Class2, y: Int)
