import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxml files/start.fxml"));
        //primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();

    }

    /*
    public class Main extends Application {

    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("My First JavaFX GUI");

//Scene 1
        Label label1= new Label("This is the first scene");
        Button button1= new Button("Go to scene 2");

        button1.setLayoutY(100);
        button1.setOnAction(e -> primaryStage.setScene(scene2));
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 300, 250);

//Scene 2
        Label label2= new Label("This is the second scene");
        Button button2= new Button("Go to scene 1");
        button2.setOnAction(e -> primaryStage.setScene(scene1));
        VBox layout2= new VBox(20);
        layout2.getChildren().addAll(label2, button2);
        scene2= new Scene(layout2,300,250);


        primaryStage.setScene(scene1);
        primaryStage.show();
    }

     */

    public static void main(String[] args) { launch(args); }


}
