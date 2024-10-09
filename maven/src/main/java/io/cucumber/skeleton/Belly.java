package io.cucumber.skeleton;

public class Belly {
    private int cukes;
    private Integer hoursToWait;
    public void eat(int cukes) {
this.cukes = cukes;
    }

    public void waitHour(final Integer hoursToWait) {
this.hoursToWait = hoursToWait;
    }

    public String growl() {
        return "GROWWWLLLLL";
    }
}
