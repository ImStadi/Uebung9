package login;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.MainController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WelcomeController implements Initializable
{
    @FXML
    private TextField name_field;

    @FXML
    private PasswordField password_field;

    private Login model = new Login();

    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

    }
    public void setStage(Stage stage)
    {
        this.stage = stage;
    }
    public static void show(Stage stage)
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(WelcomeController.class.getResource("welcome.fxml"));
            Parent root = fxmlLoader.load();

            //get controller which is connected to this fxml file
            WelcomeController ctrl = fxmlLoader.getController();
            ctrl.setStage(stage);

            stage.setTitle("Login");
            stage.setScene(new Scene(root, 250, 250));
            stage.show();
        }
        catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Expetion bei start von welcome.fxml!");
            ex.printStackTrace(System.err);
            System.exit(1);
        }
    }
    @FXML
    private void next()
    {
        MainController.show(new Stage());

        stage.close();
    }
    public void loginFunction()
    {
        boolean login = model.CorrectLogin(name_field.getText(), password_field.getText());
        if (login)
        {
            System.out.println("angemeldet");
            next();
        }
        else{
            System.out.println("Wrong PWD");
        }
    }
}