package com.github.uuidcode

import com.github.uuidecode.Person
import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class PersonTest {
    @Test
    fun test() {
        var person = Person("A", Integer(10))
        var (name, age) = person

        assertThat(name, `is`("A"))
        assertThat(age, `is`(Integer(10)))

        assertThat(person.component1(), `is`("A"))
        assertThat(person.component2(), `is`(Integer(10)))
    }
}