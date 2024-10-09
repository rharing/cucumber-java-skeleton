package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    private Belly belly;

    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        belly = new Belly();
        belly.eat(cukes);
    }
    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) {
        belly.waitHours(int1);
    }
    @Then("my belly should growl")
    public void my_belly_should_growl() {
        String makesNoise = belly.makesNoise();
        assertEquals(makesNoise,"grrowwll");
    }

}
