package main.java.com.rudkin.registrationform;

import main.java.com.rudkin.registrationform.controller.Controller;
import main.java.com.rudkin.registrationform.model.Model;
import main.java.com.rudkin.registrationform.view.View;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Controller controller =
                new Controller(new Model(), new View());
        // Run
        controller.processUser();
    }
}