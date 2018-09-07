package com.pacreau.teamm.app.service

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * Module which provides all required dependencies about Context
 */
@Module
// Safe here as we are dealing with a Dagger 2 module
@Suppress("unused")
object ContextModule {

    /**
     * Provides the Application Context
     * @param context Context in which the application is running
     * @return the Application Context to be provided
     */
    @Provides
    @JvmStatic
    internal fun provideApplication(context: Context): Application {
        return context.applicationContext as Application
    }
}