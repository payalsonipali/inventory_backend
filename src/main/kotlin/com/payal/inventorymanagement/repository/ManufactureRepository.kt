package com.payal.inventorymanagement.repository

import com.payal.inventorymanagement.model.Manufacturer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ManufactureRepository : CrudRepository<Manufacturer, Int> {
    fun existsByName(name: String): Boolean
}