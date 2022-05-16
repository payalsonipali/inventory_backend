package com.payal.inventorymanagement.serviceImpl

import com.payal.inventorymanagement.exception.CustomException
import com.payal.inventorymanagement.model.Item
import com.payal.inventorymanagement.repository.ItemRepository
import com.payal.inventorymanagement.repository.ManufactureRepository
import com.payal.inventorymanagement.service.ItemService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ItemServiceImpl : ItemService{
    @Autowired
    lateinit var itemRepository: ItemRepository
    @Autowired
    lateinit var manufactureRepository: ManufactureRepository

    override fun saveItem(item : Item): Item {
        validateItemCode(item.code)
        validateItemName(item.name)
        validateManufacturerId(item.manufacturerId)
        validateItemQuantity(item.qty)
        return itemRepository.save(Item(item.code, item.name, item.manufacturerId, item.qty))
    }

    fun validateItemCode(itemCode : String) : Boolean{
        if(itemRepository.existsByCode(itemCode))
            throw CustomException("Duplicate item code")
        if(itemCode.length<5 || itemCode.length>20 || itemCode==null)
            throw CustomException("Item code length should be atleaset 5 or atmost 20")
        if(!isAlphaNumeric(itemCode))
            throw CustomException("Item code should be atleaset 5 or atmost 20")
        return true
    }

    fun validateItemName(itemName : String) : Boolean{
        if(itemName.length<3 || itemName.length>256 || itemName==null)
            throw CustomException("Item name length should be atleaset 3 or atmost 256")
        return true
    }

    fun validateManufacturerId(manufacturerId : Int) : Boolean{
        if(!manufactureRepository.existsById(manufacturerId)){
            throw CustomException("manufacturerId not exist")
        }
        return true
    }

    fun validateItemQuantity(itemQuantity : Int) : Boolean{
        if(itemQuantity<0)
            throw CustomException("Item quantity should not be negative")
        return true
    }

    fun isAlphaNumeric(chars: String): Boolean {
        return chars.filter { it in 'A'..'Z' || it in 'a'..'z'}
            .length == chars.length
    }
}