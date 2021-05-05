package id.deval.soppengapp.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.selayar.history.R
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import io.realm.Realm
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    @Inject
    lateinit var realm: Realm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)
//        ActivityCompat.requestPermissions(
//            this,
//            arrayOf(android.Manifest.permission.CAMERA), 50
//        )
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return androidInjector
    }
}