package com.pacreau.teamm.app.service

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.pacreau.teamm.player.model.Player
import android.arch.persistence.room.Room
import android.content.Context
import com.pacreau.teamm.player.model.PlayerDao


@Database(entities = [(Player::class)] , version = 1 , exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    private var INSTANCE: AppDatabase? = null

    abstract fun playerDao(): PlayerDao

    fun getAppDatabase(context: Context): AppDatabase {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), AppDatabase::class.java, "player-database")
                    // allow queries on the main thread.
                    // Don't do this on a real app! See PersistenceBasicSample for an example.
                    .allowMainThreadQueries()
                    .build()
        }
        return INSTANCE as AppDatabase
    }

    fun destroyInstance() {
        INSTANCE = null
    }
}