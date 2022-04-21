import javax.swing.text.Document;

import javafx.application.Application;
import javafx.geometry.HorizontalDirection;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class assignment3a extends Application{
    public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }

    @Override
    public void start(Stage stage) {
        Image image = new Image("file:java.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(true);
        Text docunation = new Text("Docunation");
        Text download = new Text("Downloads");
        Text what_java = new Text("What is Java?");
        Text help =  new Text("Help");
        Text language = new Text("Language");

        HBox textBox = new HBox(20, docunation, download, what_java, help, language);
        textBox.setStyle("-fx-font-size: 16px; -fx-font-weight: medium");
        textBox.setPadding(new Insets(25, 25, 25, 400));

        HBox hbox = new HBox(500, imageView, textBox);
        hbox.setPadding(new Insets(20,20,20,200));
        hbox.setBackground(new Background(new BackgroundFill(Color.web("#C4C4C4"), null, null)));

        Text largeText = new Text("Write once,\nTest everywhere");
        largeText.setStyle("-fx-font-size: 64px; -fx-font-weight: bold");
        Text intro = new Text("Java is a high-level, class-based, object-oriented programming\nlanguage that is designed to have as few implementation\ndependencies as possible [1]");
        intro.setStyle("-fx-font-size: 16px; -fx-font-weight: medium");

        Button download_java_18 = new Button("Downlaod Java 18");
        Button learn_java = new Button("Learn Java");

        HBox download_button_box = new HBox(20, download_java_18, learn_java);

        VBox introVbox = new VBox(20, largeText, intro, download_button_box);
        introVbox.setPadding(new Insets(10, 200, 10, 200));

        HBox introductionBox = new HBox(10, introVbox);

        VBox box = new VBox(50, hbox, introductionBox);

        final Scene scene = new Scene(box,300, 250);
        scene.setFill(Color.WHITE);
        stage.setScene(scene);

        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX((primScreenBounds.getWidth() - stage.getWidth()) / 2); 
        stage.setY((primScreenBounds.getHeight() - stage.getHeight()) / 4); 
        stage.show();
        
    }
}