package com.github.uuidecode

data class Project(var projectId: Long? = null,
                   var name: String? = null,
                   var stageList: List<Stage>? = null) {

    var person: Person? = null
}