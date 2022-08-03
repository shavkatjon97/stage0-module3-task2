package lang.print.gaps.task2;

public class AdvancedNamingConvention {
    private static final int ADULT_AGE = 18;

    private int age;
    private int phoneNumber;

    void callToFriend() {
        this.age=ADULT_AGE;
    }

    void callByNumber(int number) {
       this.phoneNumber=number;
    }
}
