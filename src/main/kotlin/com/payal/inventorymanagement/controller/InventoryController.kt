package com.payal.inventorymanagement.controller

import com.payal.inventorymanagement.dto.CustomExceptionDto
import com.payal.inventorymanagement.dto.ManufactureNameDto
import com.payal.inventorymanagement.exception.CustomException
import com.payal.inventorymanagement.model.Item
import com.payal.inventorymanagement.service.ItemService
import com.payal.inventorymanagement.service.ManufactureService
import com.payal.inventorymanagement.service.UnitService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
class InventoryController {
    @Autowired
    lateinit var manufactureService: ManufactureService

    @Autowired
    lateinit var itemService: ItemService

    @Autowired
    lateinit var unitService: UnitService

    @RequestMapping("manufacturers/new")
    fun saveManufacturer(@RequestBody manufactorNameDto: ManufactureNameDto): ResponseEntity<Any> {
        try {
            return ResponseEntity.ok(manufactureService.saveManufacturer(manufactorNameDto))
        } catch (e: CustomException) {
            return ResponseEntity.badRequest().body(CustomExceptionDto(e.message))
        } catch (e: Exception) {
            return ResponseEntity.badRequest().body("Some error occure")
        }
    }

    @RequestMapping("/manufacturers")
    fun getManufectures() = manufactureService.getManufectures()

    @RequestMapping("/units")
    fun getUnits() = unitService.getUnits()

    @RequestMapping("items/new")
    fun saveItem(@RequestBody item: Item): ResponseEntity<Any> {
        try {
            return ResponseEntity.ok(itemService.saveItem(item))
        } catch (e: CustomException) {
            return ResponseEntity.badRequest().body(CustomExceptionDto(e.message))
        } catch (e: Exception) {
            return ResponseEntity.badRequest().body("Some error occure")
        }
    }
}
     