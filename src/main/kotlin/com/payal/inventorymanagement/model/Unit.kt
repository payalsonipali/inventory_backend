package com.payal.inventorymanagement.model

import com.sun.istack.NotNull
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Unit (
    @Id
    @NotNull
    val name: String,
    ) {
    private constructor() : this("")
}