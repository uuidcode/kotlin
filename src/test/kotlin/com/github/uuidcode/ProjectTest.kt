package com.github.uuidcode

import com.github.uuidecode.Node
import com.github.uuidecode.Project
import com.github.uuidecode.Stage
import org.hamcrest.CoreMatchers.nullValue
import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class ProjectTest {
    @Test
    fun test() {
        var node = Node(name = "TEST")
        var stage = Stage()

        stage.nodeList =
            arrayListOf(node,
            Node().apply {
                name = "ABC"
                nodeId = 1
            },
            Node(3L),
            Node(null, "abc"))

        var stageList = arrayListOf(stage)
        var project = Project()
        project.stageList = stageList

        var cloneProject = project.copy()

        assertThat(project?.stageList?.size, `is`(1))
        assertThat(cloneProject?.stageList?.size, `is`(1))


        var p: Project? = Project()
        println(p?.person?.name)
        p = null
        assertThat(p?.person?.name, `is`(nullValue()))


        Project.index++
        assertThat(Project.create(), `is`("OK"))
        assertThat(Project.index, `is`(2))

        with(project) {
            projectId = 1
        }

        project.apply {
            projectId = 1
        }
        println(p?.person?.name)
    }

    @Test
    fun htmlTest() {
        var project = Project(name = "test", projectId = 1000L)

        var html =
        """
            <div id="${project.projectId}">
                ${project.name}
            </div>
        """

        println(html)
    }

}
