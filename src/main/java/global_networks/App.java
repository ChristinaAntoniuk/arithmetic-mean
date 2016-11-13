package global_networks;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // Initialization
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        // Run
        controller.process();
    }
}
