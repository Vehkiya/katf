package app.kerrlab.hooks

import io.cucumber.java.After
import io.cucumber.java.Before
import io.cucumber.java.Scenario

class Hooks {

    @Before
    fun setUp() {
        println("Test Started")
    }

    @After
    fun tearDown(scenario: Scenario) {
        println("Scenario [${scenario.name}] finished with status [${scenario.status}]")
    }

}