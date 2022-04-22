import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
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
        ScrollPane scroll = new ScrollPane();

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
        largeText.getStyleClass().add("largeText");
        Text intro = new Text("Java is a high-level, class-based, object-oriented programming\nlanguage that is designed to have as few implementation\ndependencies as possible [1]");
        intro.getStyleClass().add("intro");

        Button download_java_18 = new Button("Downlaod Java 18");
        Button learn_java = new Button("Learn Java");

        HBox download_button_box = new HBox(20, download_java_18, learn_java);

        VBox introVbox = new VBox(20, largeText, intro, download_button_box);
        introVbox.setPadding(new Insets(10, 200, 10, 200));

        Image next_to_intro_image = new Image("file:java_replace.png");
        ImageView next_to_intro_imageview = new ImageView(next_to_intro_image);
        next_to_intro_imageview.setFitWidth(300);
        next_to_intro_imageview.setPreserveRatio(true);

        HBox introductionBox = new HBox(50, introVbox, next_to_intro_imageview);
        introductionBox.setPadding(new Insets(10, 200, 10, 200));

        Image replace2_image = new Image("file:replace2.jpg");
        ImageView replace2_imageView = new ImageView(replace2_image);
        replace2_imageView.setFitWidth(900);
        replace2_imageView.setPreserveRatio(true);
        replace2_imageView.getStyleClass().add("replace2_imageView");
        Text explore = new Text("Explore");
        explore.getStyleClass().add("explore");

        VBox replace2_container = new VBox(20, replace2_imageView, explore);
        replace2_container.setPadding(new Insets(10, 500, 10, 500));
        replace2_container.setAlignment(Pos.CENTER);

        List<Image> under_explore_image_array = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            under_explore_image_array.add(new Image(getClass().getResource(i + ".jpg").toExternalForm()));
        }

        HBox array_image_container = new HBox();
        array_image_container.setSpacing(40);
        array_image_container.setPadding(new Insets(10, 100, 10, 100));
        array_image_container.setAlignment(Pos.CENTER);
        List<ImageView> under_explore_imageview_array = new ArrayList<>();

        // ScrollPane sc = new ScrollPane();

        for (int i = 0; i < under_explore_image_array.size(); i++) {
            under_explore_imageview_array.add(new ImageView(under_explore_image_array.get(i)));
            array_image_container.getChildren().add(under_explore_imageview_array.get(i));
            // sc.getChildrenUnmodifiable().add(under_explore_imageview_array.get(i));
        }


        // ScrollBar scrollbar = new ScrollBar();
        // scrollbar.setMin(0);
        // scrollbar.setOrientation(Orientation.HORIZONTAL);
        // VBox image_scroll_container = new VBox(array_image_container, scrollbar);

        // sc.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
        // sc.setVbarPolicy(ScrollBarPolicy.NEVER);
        // sc.setContent(array_image_container);

        Text event = new Text("Events");
        Text news = new Text("News");
        event.getStyleClass().add("explore");
        news.getStyleClass().add("explore");

        Image events_image = new Image("file:events.jpg");
        ImageView events_imageView = new ImageView(events_image);

        Image news_image = new Image("file:news.jpg");
        ImageView news_imageView = new ImageView(news_image);

        VBox events_box = new VBox(10, event, events_imageView);
        events_box.setPadding(new Insets(10, 50, 10, 50));
        VBox news_box = new VBox(10, news, news_imageView);
        news_box.setPadding(new Insets(10, 50, 10, 50));

        HBox event_news_container = new HBox(50, events_box, news_box);
        event_news_container.setAlignment(Pos.CENTER);

        VBox box = new VBox(50, hbox, introductionBox, replace2_container, array_image_container, event_news_container);
        scroll.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
        scroll.setHbarPolicy(ScrollBarPolicy.NEVER);
        scroll.setContent(box);

        final Scene scene = new Scene(scroll, 300, 250);
        scene.getStylesheets().add("assignment3a.css");
        scene.setFill(Color.WHITE);
        stage.setScene(scene);

        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX((primScreenBounds.getWidth() - stage.getWidth()) / 2); 
        stage.setY((primScreenBounds.getHeight() - stage.getHeight()) / 4); 
        stage.show();
        
    }
}