package Threads.Questiontwo;

public enum light {
    red(9000),
    yellow (4000),
    Green(2000),
    ;

    private final int milleSeconde ;

    public int getMilleSeconde() {
        return milleSeconde;
    }

    light(int milleSeconde) {
        this.milleSeconde = milleSeconde;
    }
}
