package com.payal.inventorymanagement.model

import javax.persistence.*

@Entity
class Manufacturer(
    val name: String,
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int = -1) {
    private constructor() : this("")
}