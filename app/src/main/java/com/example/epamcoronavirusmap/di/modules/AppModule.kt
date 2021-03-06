package com.example.epamcoronavirusmap.di.modules

import com.example.epamcoronavirusmap.api.CoronavirusApi
import com.example.epamcoronavirusmap.ui.map.MapPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/*
    Когда вы напишите свои презентеры, нужно будет их написать, как в этом примере
 */

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideMapPresenter(api : CoronavirusApi) : MapPresenter = MapPresenter(api)


}