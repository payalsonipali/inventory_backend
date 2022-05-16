package com.payal.inventorymanagement.repository

import com.payal.inventorymanagement.model.Item
import org.springframework.data.repository.CrudRepository

interface ItemRepository : CrudRepository<Item, String> {
    fun existsByCode(code: String): Boolean
}