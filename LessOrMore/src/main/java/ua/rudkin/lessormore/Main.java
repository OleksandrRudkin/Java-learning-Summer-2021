package main.java.ua.rudkin.lessormore;

public class Main {
    public static void main(String[] args) {

        Model model = new Model(GlobalConstants.PRIMARY_MIN_BARRIER, GlobalConstants.PRIMARY_MAX_BARRIER);
        Controller controller = new Controller(model, new View());

        controller.processUser();
    }
}
