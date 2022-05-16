package com.payal.inventorymanagement.service

import com.payal.inventorymanagement.model.Item

interface ItemService {
    fun saveItem(item : Item): Item
}