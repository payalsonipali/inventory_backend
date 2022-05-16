package com.payal.inventorymanagement.service

import com.payal.inventorymanagement.dto.ManufactureNameDto
import com.payal.inventorymanagement.model.Manufacturer

interface ManufactureService {
    fun saveManufacturer(manufactorNameDto : ManufactureNameDto): Manufacturer
    fun getManufectures() : MutableIterable<Manufacturer>
}