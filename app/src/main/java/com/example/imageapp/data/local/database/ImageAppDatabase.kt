package com.example.imageapp.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.imageapp.data.local.EditorialFeedDao
import com.example.imageapp.data.local.FavoriteImagesDao
import com.example.imageapp.data.local.entity.FavoriteImageEntity
import com.example.imageapp.data.local.entity.UnsplashImageEntity


@Database(
        entities = [FavoriteImageEntity::class,UnsplashImageEntity::class],
        version = 1,
        exportSchema = false
)
abstract class ImageVistaDatabase: RoomDatabase() {

    abstract fun favoriteImagesDao(): FavoriteImagesDao

    abstract fun feedImageDao():EditorialFeedDao
        // this is laude sit

//    this is commite 2


}
