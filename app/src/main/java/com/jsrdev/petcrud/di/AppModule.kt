package com.jsrdev.petcrud.di

import android.content.Context
import com.jsrdev.petcrud.data.local.PetDB
import com.jsrdev.petcrud.data.local.PetDao
import com.jsrdev.petcrud.data.repository.PetRepositoryImpl
import com.jsrdev.petcrud.domain.repository.PetRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    fun providePetDb(@ApplicationContext context: Context): PetDB {
        return PetDB.getDatabase(context)
    }

    @Provides
    fun providePetDao(petDB: PetDB): PetDao {
        return petDB.petDao()
    }

    @Provides
    fun providePetRepository(petDao: PetDao): PetRepository {
        return PetRepositoryImpl(petDao = petDao)
    }
}