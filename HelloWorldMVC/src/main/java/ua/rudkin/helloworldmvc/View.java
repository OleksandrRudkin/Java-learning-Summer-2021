package main.java.ua.rudkin.helloworldmvc;

public class View {
    public static final String INPUT_HELLO = "Input: \"Hello\"";
    public static final String INPUT_WORLD = "Input: \"World!\"";
    public static final String WRONG_INPUT = "Wrong input! Repeat please! ";
    public static final String CORRECT_INPUT = "You entered: ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printTwoMessages(String message1, String message2) {
        System.out.println(message1 + message2);
    }
}
