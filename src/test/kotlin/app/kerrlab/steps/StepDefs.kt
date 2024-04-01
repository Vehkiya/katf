package app.kerrlab.steps

import io.cucumber.java.en.Given

class StepDefs {

    @Given("{int} pickles")
    fun givenSomePickles(number: Int) {
        println("I got $number pickles")
    }
}