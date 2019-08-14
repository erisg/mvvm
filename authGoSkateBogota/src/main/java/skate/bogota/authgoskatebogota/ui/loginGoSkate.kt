package skate.bogota.authgoskatebogota.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat.startActivity
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.login.view.*
import skate.bogota.authgoskatebogota.R

class loginGoSkate @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet?,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {


    val SHARED_PREFERENCES = "GOSKATEAPP"
    private val sp by lazy { context.getSharedPreferences(SHARED_PREFERENCES, 0) }

    init {
        initView()
    }


    private fun initView() {
        inflate(context, R.layout.login, this)
        initNewUser()
    }


    private fun initNewUser() {
        new_user_btn.setOnClickListener {
          newUserGoSkate.startActivity(context)
        }
    }

    private fun replaceFragment() {

    }
}