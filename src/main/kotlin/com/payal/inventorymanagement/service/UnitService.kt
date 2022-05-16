package com.payal.inventorymanagement.service

import com.payal.inventorymanagement.model.Unit

interface UnitService {
    fun getUnits(): MutableIterable<Unit>
}