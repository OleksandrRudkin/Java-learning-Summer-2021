package main.java.ua.rudkin.helloworldmvc;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setMessage(inputHelloWorldWithScanner(sc));
        view.printTwoMessages(View.CORRECT_INPUT, model.getMessage());
        sc.close();
    }

    public String inputHelloWorldWithScanner(Scanner sc) {
        String firstString = "";
        String secondString = "";
        String result = "";
        view.printMessage(View.INPUT_HELLO);
        while (sc.hasNextLine()) {
            firstString = sc.nextLine().trim();
            if(firstString.equalsIgnoreCase("Hello")) {
                break;
            } else {
                view.printMessage(View.WRONG_INPUT + View.INPUT_HELLO);
            }
        }
        view.printMessage(View.INPUT_WORLD);
        while (sc.hasNextLine()) {
            secondString = sc.nextLine().trim();
            if(secondString.equalsIgnoreCase("World!")) {
                break;
            } else {
                view.printMessage(View.WRONG_INPUT + View.INPUT_WORLD);
            }
        }
        return result = firstString + " " + secondString;
    }
}

