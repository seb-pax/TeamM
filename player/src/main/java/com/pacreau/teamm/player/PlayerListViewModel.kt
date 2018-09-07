package com.pacreau.teamm.player

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.pacreau.teamm.player.model.Player
import com.pacreau.teamm.player.model.PlayerDao
import javax.inject.Inject

class PlayerListViewModel : ViewModel() {

    @Inject
    lateinit var playerDao: PlayerDao

    private val playersList = MutableLiveData<List<Player>>();

    init {
        //playersList.receiverDcCharacterList { it ->
        //    playersList.postValue(it)
        //}
    }

    fun getPlayersList() = playersList
}