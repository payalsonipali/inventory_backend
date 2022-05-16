package com.payal.inventorymanagement.exception

import com.payal.inventorymanagement.dto.CustomExceptionDto
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.MissingPathVariableException
import org.springframework.web.bind.MissingServletRequestParameterException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

//@RestControllerAdvice
class CustomExceptionHandler {

//    override fun handleMissingServletRequestParameter(
//        ex: MissingServletRequestParameterException,
//        headers: HttpHeaders,
//        status: HttpStatus,
//        request: WebRequest
//    ): ResponseEntity<Any> {
//        return ResponseEntity.badRequest().body(CustomExceptionDto("this is message"))
//    }
//
//    override fun handleMissingPathVariable(
//        ex: MissingPathVariableException,
//        headers: HttpHeaders,
//        status: HttpStatus,
//        request: WebRequest
//    ): ResponseEntity<Any> {
//        return ResponseEntity.badRequest().body(CustomExceptionDto("Fill all mandatory feilds"))
//    }
//
//    override fun handleMethodArgumentNotValid(
//        ex: MethodArgumentNotValidException,
//        headers: HttpHeaders,
//        status: HttpStatus,
//        request: WebRequest
//    ): ResponseEntity<Any> {
//        return ResponseEntity.badRequest().body(CustomExceptionDto("e.message"))
//    }
}