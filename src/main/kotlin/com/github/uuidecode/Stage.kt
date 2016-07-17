package com.github.uuidecode

data class Stage(var stageId: Long? = null,
                 var nodeList: List<Node>? = null) {
    fun getDisplayName(): String {
        return "TEST"
    }
}