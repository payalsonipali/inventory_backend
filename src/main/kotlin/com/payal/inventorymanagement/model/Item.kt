package com.payal.inventorymanagement.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Item (
    @Id
    val code: String,
    val name: String,
    val manufacturerId: Int,
    val qty: Int,
    ){
    private constructor() : this("","",0,0)
}