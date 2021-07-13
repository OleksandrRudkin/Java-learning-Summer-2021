package main.java.com.rudkin.immutableobject;

public class Main {
    public static void main(String[] args) {
        Age catAge = new Age(1,2,2020);
        ImmutableCat schrodingerCat =
                new ImmutableCat("Paradox", "hypothetical", catAge);


        System.out.println("Cat in the box: " + schrodingerCat);

        System.out.println("Trying make some changes with our little cat");
        schrodingerCat.getAge().setYear(2019);

        System.out.println("Is our cat getting old?: " + schrodingerCat);
    }
}
