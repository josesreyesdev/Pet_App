package com.jsrdev.petcrud.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jsrdev.petcrud.core.Constants.Companion.PET_TABLE
import com.jsrdev.petcrud.domain.model.Pet

@Database(entities = [Pet::class], version = 1, exportSchema = false)
abstract class PetDB: RoomDatabase() {

    abstract fun petDao(): PetDao

    companion object {

        @Volatile
        private var INSTANCE : PetDB? = null

        fun getDatabase( context: Context): PetDB {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PetDB::class.java,
                    PET_TABLE
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}