package skate.bogota.goskate


import android.Manifest
import android.Manifest.permission.READ_PHONE_STATE
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import skate.bogota.authgoskatebogota.ui.customizedviews.INotifyLogin
import skate.bogota.authgoskatebogota.ui.loginGoSkate


class MainActivity : AppCompatActivity() , INotifyLogin {

    override fun validateLogin(user: String, pass: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object {
        //obtener estos permisos al inicio de la aplicacion
        val permissions = arrayOf(
            READ_PHONE_STATE,
            Manifest.permission.CAMERA,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.ACCESS_FINE_LOCATION
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}

