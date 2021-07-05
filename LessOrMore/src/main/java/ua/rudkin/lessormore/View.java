package main.java.ua.rudkin.lessormore;

public class View {

    public static final String GREETINGS = "Hello! Lets Play A Game";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please!";
    public static final String INPUT_INT_DATA = "Input INT value ";

    public static final String TRY_LIST = "Your list of tries: ";
    public static final String CONGRATULATION = "Bullseye! You guessed it, good job! Mystery number was: ";
    public static final String ATTEMPTS_COUNT = "total attempts: ";

    public static final String EQUAL_SING = "=";
    public static final String SPACE_SING = " ";
    public static final String OPENS_SQUARE_BRACKET = "[";
    public static final String CLOSING_SQUARE_BRACKET = "]";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concatenationString (String... message){
        int i = 0;
        StringBuilder concatString = new StringBuilder();
        for (String v : message){
            i++;
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }
}

