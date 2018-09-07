package com.pacreau.teamm.app.service

import android.arch.persistence.room.Room
import android.content.Context
import com.pacreau.teamm.player.model.PlayerDao
import dagger.Module
import dagger.Provides

/**
 * Module which provides all dependecies about databases
 * @property DATABASE_NAME The name of the database of the application
 */
@Module(includes = [(ContextModule::class)])
// Safe here as we are dealing with a Dagger 2 module
@Suppress("unused")
object DaoModule {

    private const val DATABASE_NAME = "player-database"

    /**
     * Returns the database of the application.
     * @param context Context in which the application is running
     * @return the database of the application
     */
    @Provides
    @JvmStatic
    internal fun provideAppDatabase(context: Context): AppDatabase {
        return Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, DATABASE_NAME).build()
    }

    /**
     * Returns the Dao of Posts.
     * @param db the database of the application
     * @return the Dao of Posts
     */
    @Provides
    @JvmStatic
    internal fun providePlayerDao(db:AppDatabase): PlayerDao {
        return db.playerDao()
    }
}