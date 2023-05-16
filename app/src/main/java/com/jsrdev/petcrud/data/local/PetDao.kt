package com.jsrdev.petcrud.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.jsrdev.petcrud.core.Constants.Companion.PET_TABLE
import com.jsrdev.petcrud.domain.model.Pet
import com.jsrdev.petcrud.domain.repository.Pets
import kotlinx.coroutines.flow.Flow

@Dao
interface PetDao {

    @Query("SELECT * FROM $PET_TABLE WHERE id = :id")
    fun getPetById(id: Int): Flow<Pet>

    @Query("SELECT * FROM $PET_TABLE ORDER BY id ASC")
    fun getPets(): Flow<Pets>

    @Insert (onConflict = OnConflictStrategy.IGNORE)
    fun addPet(pet: Pet)

    @Update
    suspend fun updatePet(pet: Pet)

    @Delete
    suspend fun deletePet(pet: Pet)
}