import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        String richardImagePath = "file:C:/Users/User/Downloads/Richard.jpeg";
        String lexieImagePath = "file:C:/Users/User/Downloads/Lexie.jpeg";
        String arizonaImagePath = "file:C:/Users/User/Downloads/Arizona.jpeg";
        String calliopeImagePath = "file:C:/Users/User/Downloads/Calliope.png";
        String meredithImagePath = "file:C:/Users/User/Downloads/Meredith.jpeg";
        String alexImagePath = "file:C:/Users/User/Downloads/Alex.jpeg";

        
        AnchorPane anchorPane = new AnchorPane();

        
        ImageView imageView1 = new ImageView(new Image(richardImagePath));
        imageView1.setFitHeight(44);
        imageView1.setFitWidth(50);
        imageView1.setLayoutX(58);
        imageView1.setLayoutY(24);

        ImageView imageView2 = new ImageView(new Image(lexieImagePath));
        imageView2.setFitHeight(44);
        imageView2.setFitWidth(50);
        imageView2.setLayoutX(58);
        imageView2.setLayoutY(76);

        ImageView imageView3 = new ImageView(new Image(arizonaImagePath));
        imageView3.setFitHeight(44);
        imageView3.setFitWidth(50);
        imageView3.setLayoutX(58);
        imageView3.setLayoutY(131);

        ImageView imageView4 = new ImageView(new Image(calliopeImagePath));
        imageView4.setFitHeight(44);
        imageView4.setFitWidth(50);
        imageView4.setLayoutX(58);
        imageView4.setLayoutY(188);

        ImageView imageView5 = new ImageView(new Image(meredithImagePath));
        imageView5.setFitHeight(44);
        imageView5.setFitWidth(50);
        imageView5.setLayoutX(58);
        imageView5.setLayoutY(247);

        ImageView imageView6 = new ImageView(new Image(alexImagePath));
        imageView6.setFitHeight(60);
        imageView6.setFitWidth(70);
        imageView6.setLayoutX(37);
        imageView6.setLayoutY(307);

        ListView<String> listView = new ListView<>();
        listView.setLayoutX(242);
        listView.setLayoutY(31);
        listView.setPrefHeight(257);
        listView.setPrefWidth(263);
        listView.setStyle("-fx-background-color: #000000;");

        TextField textField = new TextField();
        textField.setLayoutX(242);
        textField.setLayoutY(307);
        textField.setPrefHeight(26);
        textField.setPrefWidth(263);
        textField.setStyle("-fx-background-color: #0000FF;");

        Label label1 = new Label("Richard Webber");
        label1.setLayoutX(110);
        label1.setLayoutY(37);

        Label label2 = new Label("Lexie Grey");
        label2.setLayoutX(110);
        label2.setLayoutY(89);

        Label label3 = new Label("Arizona Robbins");
        label3.setLayoutX(110);
        label3.setLayoutY(145);

        Label label4 = new Label("Calliope Torres");
        label4.setLayoutX(110);
        label4.setLayoutY(202);

        Label label5 = new Label("Meredith Grey");
        label5.setLayoutX(110);
        label5.setLayoutY(261);

        Label label6 = new Label("Alex Karev");
        label6.setLayoutX(110);
        label6.setLayoutY(320);


        anchorPane.getChildren().addAll(
            imageView1, imageView2, imageView3, imageView4,
            imageView5, imageView6, listView, textField,
            label1, label2, label3, label4, label5, label6
        );


        Scene scene = new Scene(anchorPane, 556, 397);
        primaryStage.setScene(scene);
        primaryStage.setTitle("TAREA");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
