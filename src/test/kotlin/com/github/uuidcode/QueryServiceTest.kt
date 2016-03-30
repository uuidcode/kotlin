package test.kotlin.com.github.uuidcode

import main.kotlin.com.github.uuidecode.ObjectService
import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class QueryServiceTest {
    @Test
    fun test() {
        assertThat(ObjectService.getName(), `is`("TEST"))
    }
}