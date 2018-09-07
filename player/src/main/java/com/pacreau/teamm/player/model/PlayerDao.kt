package com.pacreau.teamm.player.model

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface PlayerDao {

    @Query("SELECT * FROM player")
    fun getAll(): List<Player>

    @Query("SELECT * FROM player where name LIKE  :name")
    fun findByName(name: String): Player

    @Query("SELECT * FROM player where id = :id")
    fun findById(id: Int): Player

    @Query("SELECT COUNT(*) from player")
    fun countUsers(): Int

    @Insert
    fun insertAll(vararg users: Player)

    @Delete
    fun delete(user: Player)
}