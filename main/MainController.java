package main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import login.WelcomeController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MainController implements Initializable
{
    @FXML
    private Button ask_button;

    @FXML
    private TextField question_field;

    @FXML
    private Text answer_text;

    private MainMOdel model;

    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        model = new MainMOdel();
    }
    public void setStage(Stage stage)
    {
        this.stage = stage;
    }
    public static void show(Stage stage)
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("main.fxml"));
            Parent root = fxmlLoader.load();

            //get controller which is connected to this fxml file
            MainController ctrl = fxmlLoader.getController();
            ctrl.setStage(stage);

            stage.setTitle("Magische Miesmuschel");
            stage.setScene(new Scene(root, 400, 400));
            stage.show();
        }
        catch (IOException ex) {
            Logger.getLogger(WelcomeController.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Something wrong with welcome.fxml!");
            ex.printStackTrace(System.err);
            System.exit(1);
        }
    }
    public void text()
    {
        answer_text.setText(model.getAnswer(question_field.getText()));
    }
}
