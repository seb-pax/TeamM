package com.pacreau.teamm.player.model

import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object PlayerContent {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<Player> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<Int, Player> = HashMap()

    private val COUNT = 25

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createPlayerItem(i))
        }
    }

    private fun addItem(item: Player) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createPlayerItem(position: Int): Player {
        return Player("seb " + position , "spa@sss.com"  + position, "01010101", "nantes " , 1 )
    }


    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }
}
