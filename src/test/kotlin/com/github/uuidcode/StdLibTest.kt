package test.kotlin.com.github.uuidcode

import com.github.uuidecode.Project
import com.github.uuidecode.Stage
import org.junit.Test
import java.io.StringWriter

class StdLibTest {
    @Test
    fun test() {
        var project = Project()
        project.apply {
            this.stageList = arrayListOf(Stage(stageId = 3))
            this.name = "test"
        }

        var stage = project.let {
            it.stageList?.get(0)
        }

        var displayName = with(stage!!) {
            getDisplayName()
        }

        println(displayName)

        displayName = stage.run {
            getDisplayName()
        }

        println(displayName)

        var stringWriter = StringWriter()
        stringWriter.use {
            it.write("Hello")
        }

        println(stringWriter.toString())

        var newStage = Stage()

        displayName = newStage.run {
            getDisplayName()
        }
    }
}