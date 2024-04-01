package app.kerrlab.steps

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions

class StepDefs {

    private var pickles = 0

    @Given("{int} pickles")
    fun givenSomePickles(number: Int) {
        println("I got $number pickles")
        pickles = number
    }

    @When("{int} more pickles are added")
    fun picklesAreAdded(number: Int) {
        println("I add $number more pickles")
        pickles += number
    }

    @Then("I have {int} pickles in total")
    fun totalPickles(total: Int) {
        println("I have ${total} pickles total")
        Assertions.assertEquals(total, pickles, "I expected $total pickles but I only have $pickles pickles")
    }
}