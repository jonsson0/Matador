import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerPlayerSetup {

    @FXML
    void startGameButton (ActionEvent event) throws IOException {
        Parent homePageStartGame = FXMLLoader.load(getClass().getResource("fxml files/game.fxml"));
        Scene homePageStartGameScene = new Scene(homePageStartGame);
        Stage stageWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageWindow.setScene(homePageStartGameScene);
        stageWindow.show();
        System.out.println("go to game");

    }


}
