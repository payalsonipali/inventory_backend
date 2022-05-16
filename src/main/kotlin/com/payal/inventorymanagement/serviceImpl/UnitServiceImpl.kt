package com.payal.inventorymanagement.serviceImpl

import com.payal.inventorymanagement.model.Unit
import com.payal.inventorymanagement.repository.UnitRepository
import com.payal.inventorymanagement.service.UnitService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UnitServiceImpl : UnitService{
    @Autowired
    lateinit var unitRepository: UnitRepository

    override fun getUnits(): MutableIterable<Unit> {
        setUnits()
        return unitRepository.findAll()
    }

    fun setUnits(){
        unitRepository.save(Unit("gr"))
        unitRepository.save(Unit("ml"))
        unitRepository.save(Unit("Kg"))
    }
}