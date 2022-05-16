package com.payal.inventorymanagement.serviceImpl

import com.payal.inventorymanagement.dto.ManufactureNameDto
import com.payal.inventorymanagement.exception.CustomException
import com.payal.inventorymanagement.model.Manufacturer
import com.payal.inventorymanagement.repository.ManufactureRepository
import com.payal.inventorymanagement.service.ManufactureService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ManufactureServiceImpl : ManufactureService{

    @Autowired
    lateinit var manufactureRepository: ManufactureRepository

    override fun saveManufacturer(manufactorNameDto : ManufactureNameDto): Manufacturer {
        if(manufactureRepository.existsByName(manufactorNameDto.name)){
            throw CustomException("Duplicate manufacturer name")
        }
        return manufactureRepository.save(Manufacturer(manufactorNameDto.name))
    }

    override fun getManufectures() = manufactureRepository.findAll()
}