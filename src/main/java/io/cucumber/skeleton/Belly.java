package io.cucumber.skeleton;

public class Belly {
    private int cukes;
    private Integer hours;

    public void eat(int cukes) {
        this.cukes = cukes;
    }

    public void waitHours(Integer hours) {
        this.hours = hours;
    }

    public String makesNoise() {
        return "grrowwll";
    }
}
