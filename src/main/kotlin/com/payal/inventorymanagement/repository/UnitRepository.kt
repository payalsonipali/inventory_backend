package com.payal.inventorymanagement.repository

import com.payal.inventorymanagement.model.Unit
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UnitRepository : CrudRepository<Unit, Long> {

}