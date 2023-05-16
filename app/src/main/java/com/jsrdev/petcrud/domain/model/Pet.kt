package com.jsrdev.petcrud.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.jsrdev.petcrud.core.Constants.Companion.PET_TABLE

@Entity(tableName = PET_TABLE)
data class Pet(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val animal: String,
    val breed: String
)
