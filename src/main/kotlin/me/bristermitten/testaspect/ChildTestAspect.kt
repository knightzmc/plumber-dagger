package me.bristermitten.testaspect

import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Component(dependencies = [TestAspect::class], modules = [IntProvider::class])
interface ChildTestAspect {
    fun provideInt(): Int
}

@Module
class IntProvider {
    @Provides
    fun getInt() = 3

    @Provides @IntoSet fun getCommand2() = object : Command {}
}
