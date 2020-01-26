package me.bristermitten.testaspect

import dagger.Component

@Component(modules = [CommandModule::class])
interface TestAspect {
    fun getCommands() : Set<Command>
}
