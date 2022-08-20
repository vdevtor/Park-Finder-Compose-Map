package com.example.parkfinder.di

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.parkfinder.data.ParkingSpotDao
import com.example.parkfinder.data.ParkingSpotDatabase
import com.example.parkfinder.data.ParkingSpotRepositoryImpl
import com.example.parkfinder.domain.repository.ParkingSpotRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideParkingSpotDatabase(app: Application) : ParkingSpotDatabase{
        return Room.databaseBuilder(
            app,
            ParkingSpotDatabase::class.java,
            "parking_spots_db"
        ).build()
    }

    @Singleton
    @Provides
    fun provideParkingSpotRepository(db : ParkingSpotDatabase) : ParkingSpotRepository{
        return ParkingSpotRepositoryImpl(db.dao)
    }
}