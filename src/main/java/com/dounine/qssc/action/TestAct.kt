package com.dounine.qssc.action

import com.dounine.qssc.core.IProject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestAct {

    @Value("\${db.driver}")
    lateinit var foo: String
    @Autowired
    lateinit var project: IProject

    @GetMapping("test")
    fun test(): String {
        println("success")
        return project.getName()+foo
    }
}