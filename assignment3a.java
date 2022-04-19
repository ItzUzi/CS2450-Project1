import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
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
        imageView.setFitWidth(200);
        imageView.setPreserveRatio(true);

        HBox hbox = new HBox(imageView);
        hbox.setPadding(new Insets(50));
        hbox.setBackground(new Background(new BackgroundFill(Color.web("#F7F6B0"), null, null)));

        VBox box = new VBox(hbox);
        final Scene scene = new Scene(box,300, 250);
        scene.setFill(Color.WHITE);
        stage.setScene(scene);

        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX((primScreenBounds.getWidth() - stage.getWidth()) / 2); 
        stage.setY((primScreenBounds.getHeight() - stage.getHeight()) / 4); 
        stage.show();
        
    }
}