package skate.bogota.authgoskatebogota.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import skate.bogota.authgoskatebogota.R

class newUserGoSkate : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.new_user, container, false)
    }

    companion object {
        fun startActivity(context: Context) {
            context.startActivity(Intent(context, newUserGoSkate::class.java))
        }
    }
}