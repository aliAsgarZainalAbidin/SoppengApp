package id.deval.soppengapp.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import id.deval.soppengapp.Util.MyApp
import id.deval.soppengapp.Util.Session
import id.deval.soppengapp.di.module.ActivityBuildersModule
import id.deval.soppengapp.di.module.AppModule
import id.deval.soppengapp.di.module.FragmentBuildersModule
import id.deval.soppengapp.di.module.NetworkModule
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class, ActivityBuildersModule::class, NetworkModule::class, FragmentBuildersModule::class])
interface AppComponent {
    fun inject(myApp: MyApp)

    //provide untuk dipakai di modul lain
    val sessionCore : Session
    val retrofit : Retrofit

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }
}
