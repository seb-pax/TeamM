package com.pacreau.teamm.player

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pacreau.teamm.player.model.Player
import com.pacreau.teamm.player.model.PlayerContent
import kotlinx.android.synthetic.main.activity_player_detail.*
import kotlinx.android.synthetic.main.player_detail.view.*

/**
 * A fragment representing a single Player detail screen.
 * This fragment is either contained in a [PlayerListActivity]
 * in two-pane mode (on tablets) or a [PlayerDetailActivity]
 * on handsets.
 */
class PlayerDetailFragment : Fragment() {

    /**
     * The dummy content this fragment is presenting.
     */
    private var item: Player? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            if (it.containsKey(ARG_ITEM_ID)) {
                // Load the dummy content specified by the fragment
                // arguments. In a real-world scenario, use a Loader
                // to load content from a content provider.
                item = PlayerContent.ITEM_MAP[it.getInt(ARG_ITEM_ID)]
                activity?.toolbar_layout?.title = item?.name
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.player_detail, container, false)

        // Show the dummy content as text in a TextView.
        item?.let {
            rootView.player_name.text = it.name
            rootView.player_phone.text = it.phone
            rootView.player_email.text = it.email
            rootView.player_address.text = it.address
        }

        return rootView
    }

    companion object {
        /**
         * The fragment argument representing the item ID that this fragment
         * represents.
         */
        const val ARG_ITEM_ID = "item_id"
    }
}
