package com.pacreau.teamm.player.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "player")
data class Player(
        val name: String,
        val email: String,
        val phone: String,
        val address: String,
        val cleanTShirtCount: Int = 0)  {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 1

    override fun toString(): String = id.toString() + name + email + phone + address + cleanTShirtCount

}