package skate.bogota.authgoskatebogota.ui

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.login.*
import skate.bogota.authgoskatebogota.R

class loginGoSkate : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.login, container, false)
        initNewUser()
    }

    private fun initNewUser() {
        new_user_btn.setOnClickListener {

        }
    }

    private fun replaceFragment(){

    }
}