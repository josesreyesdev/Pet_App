package com.jsrdev.petcrud.data.repository

import com.jsrdev.petcrud.data.local.PetDao
import com.jsrdev.petcrud.domain.model.Pet
import com.jsrdev.petcrud.domain.repository.PetRepository
import com.jsrdev.petcrud.domain.repository.Pets
import kotlinx.coroutines.flow.Flow

class PetRepositoryImpl (private val petDao: PetDao): PetRepository {

    override fun getPetsFromRoom(): Flow<Pets> = petDao.getPets()

    override fun addPetToRoom(pet: Pet) = petDao.addPet(pet)

}