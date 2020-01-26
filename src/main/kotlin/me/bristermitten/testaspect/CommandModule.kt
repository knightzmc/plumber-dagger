package me.bristermitten.testaspect

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
class CommandModule {
    @Provides @IntoSet fun provideCommand(): Command = TestCommand()
}

class TestCommand : Command
