package id.deval.skeletonproject.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import id.deval.skeletonproject.Util.MyApp
import id.deval.skeletonproject.Util.Session
import id.deval.skeletonproject.di.module.ActivityBuildersModule
import id.deval.skeletonproject.di.module.AppModule
import id.deval.skeletonproject.di.module.FragmentBuildersModule
import id.deval.skeletonproject.di.module.NetworkModule
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
