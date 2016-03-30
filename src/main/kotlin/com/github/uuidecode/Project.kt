package com.github.uuidecode

data class Project(var projectId: Long? = null,
                   var stageList: MutableList<Stage>? = null) {

    var person: Person? = null

    companion object Test {
        var index = 1

        fun create(): String {
            return "OK"
        }
    }
}