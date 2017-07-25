package com.dounine.qssc.core

import org.springframework.stereotype.Component

@Component
class ProjectImpl : IProject {
    override fun getName(): String {
        return "lake"
    }
}