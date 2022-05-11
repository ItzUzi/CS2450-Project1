import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
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
        imageView.setFitWidth(200);
        imageView.setPreserveRatio(true);
        Text documentation = new Text("Documentation");
        Text download = new Text("Downloads");
        ChoiceBox<String> fontSelector= new ChoiceBox<>();
        String[] fontSizes = {"Medium (Default)", "Small", "Large"};
        fontSelector.getItems().addAll(fontSizes);
        fontSelector.setValue("Select Font Size");
        fontSelector.setPrefSize(175, 30);
        Text help =  new Text("Help");
        ChoiceBox<String> language = new ChoiceBox<>();
        String[] languages = {"English (Default)", "Español", "简体中文"};
        language.setValue("Select Language");
        language.getItems().addAll(languages);
        language.setOnAction(e-> setLanguage(language, stage));

        HBox textBox = new HBox(20, documentation, download, help, fontSelector, language);
        textBox.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        textBox.setPadding(new Insets(25, 25, 25, 400));

        HBox hbox = new HBox(500, imageView, textBox);
        hbox.setPadding(new Insets(20,20,20,200));
        hbox.setBackground(new Background(new BackgroundFill(Color.web("#C4C4C4"), null, null)));

        Text largeText = new Text("Write once,\nTest everywhere");
        largeText.getStyleClass().add("largeText");
        Text intro = new Text("""
                Java is a high-level, class-based, object-oriented programming
                language that is designed to have as few implementation
                dependencies as possible [1]""");
        intro.getStyleClass().add("intro");

        Button download_java_18 = new Button("Download Java 18");
        download_java_18.setOnAction(e->
        {
            String downloadLinks = "-fx-font-size: 14px; -fx-text-fill: Blue; -fx-font-weight: normal";
            String space = "-fx-font-size: 14px; -fx-text-fill: Black; -fx-font-weight: bolder";
            Label downloadJava = new Label("Java Downloads:");
            Label java18 = new Label("Java 18 download");
            Label java17 = new Label("Java 17 download");
            Label java16 = new Label("Java 16 download");
            Label java15 = new Label("Java 15 download");
            Label java14 = new Label("Java 14 download");
            Label changelog18 = new Label("[changelog]");
            Label changelog17 = new Label("[changelog]");
            Label changelog16 = new Label("[changelog]");
            Label changelog15 = new Label("[changelog]");
            Label changelog14 = new Label("[changelog]");
            Label space18 = new Label(".   .   .   .   .   .   .   .   .");
            Label space17 = new Label(".   .   .   .   .   .   .   .   .");
            Label space16 = new Label(".   .   .   .   .   .   .   .   .");
            Label space15 = new Label(".   .   .   .   .   .   .   .   .");
            Label space14 = new Label(".   .   .   .   .   .   .   .   .");

            java18.setStyle(downloadLinks);
            java17.setStyle(downloadLinks);
            java16.setStyle(downloadLinks);
            java15.setStyle(downloadLinks);
            java14.setStyle(downloadLinks);

            changelog18.setStyle(downloadLinks);
            changelog17.setStyle(downloadLinks);
            changelog16.setStyle(downloadLinks);
            changelog15.setStyle(downloadLinks);
            changelog14.setStyle(downloadLinks);

            space18.setStyle(space);
            space17.setStyle(space);
            space16.setStyle(space);
            space15.setStyle(space);
            space14.setStyle(space);

            downloadJava.setStyle("-fx-font-size: 16px; -fx-font-weight: bold");

            Stage newWindow = new Stage();
            newWindow.setTitle("Java Downloads");

            VBox left = new VBox(downloadJava, java18, java17, java16, java15, java14);
            left.setSpacing(10);
            VBox mid = new VBox(space18, space17, space16, space15, space14);
            mid.setPadding(new Insets(35));
            mid.setSpacing(10);
            VBox right = new VBox(changelog18, changelog17, changelog16, changelog15, changelog14);
            right.setPadding(new Insets(35));
            right.setSpacing(10);

            GridPane grid = new GridPane();
            grid.add(left, 0, 0);
            grid.add(mid, 1,0);
            grid.add(right, 2, 0);

            grid.setVgap(10);
            grid.setHgap(5);
            grid.setPadding(new Insets(10, 40, 10, 40));
            grid.setAlignment(Pos.CENTER);
            Scene scene = new Scene(grid);
            newWindow.setScene(scene);
            newWindow.show();
        });
        Button learn_java = new Button("What is Java?");
        learn_java.setOnAction(e->
        {
            Label about = new Label("What is Java:");
            Text about_content = new Text("""
                   Java is a programming language and computing platform first released by Sun Microsystems in 1995.
                   It has evolved from humble beginnings to power a large share of today’s digital world, by providing
                   the reliable platform upon which many services and applications are built. New, innovative products
                   and digital services designed for the future continue to rely on Java, as well.
                   
                   There are many applications and even some websites that will not function unless you have
                    Java installed. Java.com, this website, is intended for consumers who require Java for their 
                    desktop applications – specifically applications targeting Java 8. Developers as well as users that 
                    would like to learn Java programming should visit the dev.java website instead and business users 
                    should visit oracle.com/java for more information.
                   """);
            Text reference = new Text("from java.com What is java page");

            about_content.getStyleClass().add("intro");
            reference.getStyleClass().add("reference");
            about.getStyleClass().add("about");

            Stage newWindow = new Stage();
            newWindow.setTitle("About Java");
            GridPane grid = new GridPane();
            grid.add(about, 0, 0);
            grid.add(about_content, 1, 1);
            grid.add(reference, 2, 2);
            grid.setHgap(20);
            grid.setVgap(20);
            grid.setAlignment(Pos.CENTER);
            Scene scene = new Scene(grid, newWindow.getHeight(), newWindow.getWidth());
            scene.getStylesheets().add("assignment3a.css");
            newWindow.setScene(scene);
            newWindow.show();
        }
        );
        HBox download_button_box = new HBox(20, download_java_18, learn_java);

        VBox introVbox = new VBox(20, largeText, intro, download_button_box);
        introVbox.setPadding(new Insets(10, 200, 10, 200));

        Image next_to_intro_image = new Image("file:java_replace.png");
        ImageView next_to_intro_imageview = new ImageView(next_to_intro_image);
        next_to_intro_imageview.setFitWidth(500);
        next_to_intro_imageview.setPreserveRatio(true);

        HBox introductionBox = new HBox(50, introVbox, next_to_intro_imageview);
        introductionBox.setPadding(new Insets(10, 200, 10, 200));

        Image replace2_image = new Image("file:helloJava.png");
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


        for (int i = 0; i < under_explore_image_array.size(); i++) {
            under_explore_imageview_array.add(new ImageView(under_explore_image_array.get(i)));
            array_image_container.getChildren().add(under_explore_imageview_array.get(i));
        }

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

        Text about = new Text("About");
        Text about_java = new Text("About Java");
        Text about_openJDK = new Text("About OpenJDK");
        Text getting_started = new Text("Getting Started");
        Text oracle_se = new Text("Oracle Java SE Subscription");
        about.getStyleClass().add("about");
        about_java.getStyleClass().add("about_content");
        about_openJDK.getStyleClass().add("about_content");
        getting_started.getStyleClass().add("about_content");
        oracle_se.getStyleClass().add("about_content");

        VBox about_box = new VBox(10, about, about_java, about_openJDK, getting_started, oracle_se);
        about_box.setPadding(new Insets(10, 20, 10, 20));
        about_box.setAlignment(Pos.CENTER_LEFT);

        Text foot_download = new Text("Downloads");
        Text all_release = new Text("All Releases");
        Text source_code = new Text("Source Code");
        foot_download.getStyleClass().add("about");
        all_release.getStyleClass().add("about_content");
        source_code.getStyleClass().add("about_content");

        VBox download_box = new VBox(10, foot_download, all_release, source_code);
        download_box.setPadding(new Insets(10, 20, 10, 20));
        download_box.setAlignment(Pos.TOP_LEFT);

        Text follow_us = new Text("Follow us");

        Image ins = new Image("file:ins.png");
        ImageView ins_view = new ImageView(ins);
        ins_view.setFitWidth(24);
        ins_view.setPreserveRatio(true);
        Image facebook = new Image("file:facebook.png");
        ImageView  facebook_view = new ImageView(facebook);
        facebook_view.setFitWidth(24);
        facebook_view.setPreserveRatio(true);
        Image github = new Image("file:github.png");
        ImageView github_view = new ImageView(github);
        github_view.setFitWidth(24);
        github_view.setPreserveRatio(true);
        follow_us.getStyleClass().add("about");
        HBox social_box = new HBox(20, ins_view, facebook_view, github_view);

        VBox follow_us_box = new VBox(50, follow_us, social_box);
        follow_us_box.setPadding(new Insets(10, 20, 10, 20));
        follow_us_box.setAlignment(Pos.TOP_LEFT);

        HBox footer = new HBox(80, about_box, download_box, follow_us_box);
        footer.getStyleClass().add("footer_box");
        footer.setAlignment(Pos.CENTER);

        VBox box = new VBox(50, hbox, introductionBox, replace2_container, array_image_container, event_news_container, footer);
        scroll.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
        scroll.setHbarPolicy(ScrollBarPolicy.NEVER);
        scroll.setContent(box);

        final Scene scene = new Scene(scroll, 300, 250);
        scene.getStylesheets().add("assignment3a.css");
        scene.setFill(Color.WHITE);
        stage.setScene(scene);

        fontSelector.setOnAction(e->setFont(fontSelector, stage, scene, fontSizes));

        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX((primScreenBounds.getWidth() - stage.getWidth()) / 2); 
        stage.setY((primScreenBounds.getHeight() - stage.getHeight()) / 4); 
        stage.show();
        
    }

    public static void setLanguage(ChoiceBox<String> choiceBox, Stage stage) {
        SetLang lang = new SetLang();
        if (choiceBox.getValue().equals("Español")) {
            stage.close();
            stage.setTitle("Java en Español");
            lang.setSpanish(stage);
        } else if (choiceBox.getValue().equals("简体中文")) {
            stage.close();
            stage.setTitle("Java");
            lang.setChinese(stage);
        } else {
            stage.close();
            stage.setTitle("Java");
            lang.setEnglish(stage);
        }
    }

    public static void setFont(ChoiceBox <String> choiceBox, Stage stage, Scene scene, String[] fonts) {
        stage.close();
        scene.getStylesheets().clear();

        if (choiceBox.getValue().equals(fonts[0]))
            scene.getStylesheets().add("assignment3a.css");
         else if (choiceBox.getValue().equals(fonts[1]))
            scene.getStylesheets().add("SmallText.css");
         else
            scene.getStylesheets().add("LargeText.css");

        stage.setScene(scene);
        stage.show();
    }
}
