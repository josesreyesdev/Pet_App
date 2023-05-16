package com.jsrdev.petcrud.domain.repository

import com.jsrdev.petcrud.domain.model.Pet
import kotlinx.coroutines.flow.Flow

typealias Pets = List<Pet> //tipo de dato mascota que es un listado
interface PetRepository {

    //fun getPetFromRoom(id: Int): Pet

    fun getPetsFromRoom(): Flow<Pets>

    fun addPetToRoom(pet: Pet)

    //fun updatePetToRoom(pet: Pet)

    //fun deletePetToRoom(pet: Pet)
}