package me.bristermitten.testaspect

import dagger.Subcomponent

@Subcomponent
interface ChildTestAspect : TestAspect {
    fun provideInt(): Int
}
