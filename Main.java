import javafx.application.Application;
import javafx.stage.Stage;
import login.WelcomeController;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        WelcomeController.show(primaryStage);
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
