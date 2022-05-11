import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class SetLang {
    public void setSpanish(Stage stage){

        ScrollPane scroll = new ScrollPane();

        Image image = new Image("file:java.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200);
        imageView.setPreserveRatio(true);
        Text documentation = new Text("Documentación");
        Text download = new Text("Descargar");
        ChoiceBox<String> fontSelector= new ChoiceBox<>();
        String[] fontSizes = {"Mediano (Defecto)", "Chico", "Grande"};
        fontSelector.getItems().addAll(fontSizes);
        fontSelector.setValue("Tamaño de la letra");
        fontSelector.setPrefSize(175, 30);
        Text help =  new Text("Ayuda");
        ChoiceBox<String> language = new ChoiceBox<>();
        String[] languages = {"English (Default)", "Español", "简体中文"};
        language.setValue("Seleccione Idoma");
        language.getItems().addAll(languages);
        language.setOnAction(e-> assignment3a.setLanguage(language, stage));

        HBox textBox = new HBox(20, documentation, download, help, fontSelector, language);
        textBox.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        textBox.setPadding(new Insets(25, 25, 25, 400));

        HBox hbox = new HBox(500, imageView, textBox);
        hbox.setPadding(new Insets(20,20,20,200));
        hbox.setBackground(new Background(new BackgroundFill(Color.web("#C4C4C4"), null, null)));

        Text largeText = new Text("Escribe una vez\nprueba en todas partes");
        largeText.getStyleClass().add("largeText");
        Text intro = new Text("""
                Java es un lenguaje de programación de alto nivel, basado en clases 
                y orientado a objetos que está diseñado para tener la menor cantidad
                posible de dependencias de implementación. [1]""");
        intro.getStyleClass().add("intro");

        Button download_java_18 = new Button("Descargar Java 18");
        download_java_18.setOnAction(e->
        {
            String downloadLinks = "-fx-font-size: 14px; -fx-text-fill: Blue; -fx-font-weight: normal";
            String space = "-fx-font-size: 14px; -fx-text-fill: Black; -fx-font-weight: bolder";
            Label downloadJava = new Label("Descargar Java:");
            Label java18 = new Label("Descargar Java 18");
            Label java17 = new Label("Descargar Java 17");
            Label java16 = new Label("Descargar Java 16");
            Label java15 = new Label("Descargar Java 15");
            Label java14 = new Label("Descargar Java 14");
            Label changelog18 = new Label("[registro de cambios]");
            Label changelog17 = new Label("[registro de cambios]");
            Label changelog16 = new Label("[registro de cambios]");
            Label changelog15 = new Label("[registro de cambios]");
            Label changelog14 = new Label("[registro de cambios]");
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
            newWindow.setTitle("Descargar Java");

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
        Button learn_java = new Button("Que es Java?");
        learn_java.setOnAction(e->
                {
                    Label about = new Label("Que es Java:");
                    Text about_content = new Text("""
                   Java es un lenguaje de programación y una plataforma informática comercializada por primera vez
                   en 1995 por Sun Microsystems. Hay muchas aplicaciones y sitios web que no funcionarán a menos que 
                   tenga Java instalado y cada día se crean más. Java es rápido, seguro y fiable. Desde portátiles hasta
                   centros de datos, desde consolas para juegos hasta súper computadoras, desde teléfonos móviles hasta 
                   Internet, Java está en todas partes.
                   """);
                    Text reference = new Text("de java.com página de 'Que es Java'");

                    about_content.getStyleClass().add("intro");
                    reference.getStyleClass().add("reference");
                    about.getStyleClass().add("about");

                    Stage newWindow = new Stage();
                    newWindow.setTitle("Que es Java");
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
        Text explore = new Text("Explorar");
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

        Text event = new Text("Eventos");
        Text news = new Text("Noticias");
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

        Text about = new Text("Acerca de:");
        Text about_java = new Text("Acerca de java");
        Text about_openJDK = new Text("Acerca de OpenJDK");
        Text getting_started = new Text("Empezando con Java");
        Text oracle_se = new Text("Suscripción de Oracle Java SE");
        about.getStyleClass().add("about");
        about_java.getStyleClass().add("about_content");
        about_openJDK.getStyleClass().add("about_content");
        getting_started.getStyleClass().add("about_content");
        oracle_se.getStyleClass().add("about_content");

        VBox about_box = new VBox(10, about, about_java, about_openJDK, getting_started, oracle_se);
        about_box.setPadding(new Insets(10, 20, 10, 20));
        about_box.setAlignment(Pos.CENTER_LEFT);

        Text foot_download = new Text("Descargar");
        Text all_release = new Text("Todos los lanzamientos");
        Text source_code = new Text("Código fuente");
        foot_download.getStyleClass().add("about");
        all_release.getStyleClass().add("about_content");
        source_code.getStyleClass().add("about_content");

        VBox download_box = new VBox(10, foot_download, all_release, source_code);
        download_box.setPadding(new Insets(10, 20, 10, 20));
        download_box.setAlignment(Pos.TOP_LEFT);

        Text follow_us = new Text("Síguenos");

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
        scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scroll.setContent(box);

        final Scene scene = new Scene(scroll, 300, 250);
        scene.getStylesheets().add("assignment3a.css");
        scene.setFill(Color.WHITE);
        stage.setScene(scene);
        stage.show();
    }

    public void setEnglish(Stage stage) {
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
        language.setOnAction(e-> assignment3a.setLanguage(language, stage));

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
        scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scroll.setContent(box);

        final Scene scene = new Scene(scroll, 300, 250);
        scene.getStylesheets().add("assignment3a.css");
        scene.setFill(Color.WHITE);
        stage.setScene(scene);
        stage.show();
    }

    public void setChinese(Stage stage) {
        ScrollPane scroll = new ScrollPane();

        Image image = new Image("file:java.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200);
        imageView.setPreserveRatio(true);
        Text documentation = new Text("開發文件");
        Text download = new Text("下載");
        ChoiceBox<String> fontSelector= new ChoiceBox<>();
        String[] fontSizes = {"Medium (Default)", "Small", "Large"};
        fontSelector.getItems().addAll(fontSizes);
        fontSelector.setValue("Select Font Size");
        fontSelector.setPrefSize(175, 30);
        Text help =  new Text("幫助");
        ChoiceBox<String> language = new ChoiceBox<>();
        String[] languages = {"English (Default)", "Español", "简体中文"};
        language.setValue("选择语言");
        language.getItems().addAll(languages);
        language.setOnAction(e-> assignment3a.setLanguage(language, stage));

        HBox textBox = new HBox(20, documentation, download, help, fontSelector, language);
        textBox.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        textBox.setPadding(new Insets(25, 25, 25, 400));

        HBox hbox = new HBox(500, imageView, textBox);
        hbox.setPadding(new Insets(20,20,20,200));
        hbox.setBackground(new Background(new BackgroundFill(Color.web("#C4C4C4"), null, null)));

        Text largeText = new Text("一次編譯\n到處調試");
        largeText.getStyleClass().add("largeText");
        Text intro = new Text("""
                Java 擁有跨平台、物件導向、泛型程式設計的特性，廣泛
                應用於企業級Web應用開發和移動應用開發。
                """);
        intro.getStyleClass().add("intro");

        Button download_java_18 = new Button("下載 Java 18");
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
        Button learn_java = new Button("什么是 Java？");
        learn_java.setOnAction(e->
                {
                    Label about = new Label("什么是 Java？:");
                    Text about_content = new Text("""
                   Java 是由 Sun Microsystems 在 1995 年首先发布的编程语言和计算平台。有许多应用程序和 Web 站点只有在安装 Java
                   后才能正常工作，而且这样的应用程序和 Web 站点日益增多。Java 快速、安全、可靠。从笔记本电脑到数据中心, 
                   从游戏控制台到科学超级计算机，从手机到互联网，Java 无处不在
                   """);
                    Text reference = new Text("from java.com What is java page");

                    about_content.getStyleClass().add("intro");
                    reference.getStyleClass().add("reference");
                    about.getStyleClass().add("about");

                    Stage newWindow = new Stage();
                    newWindow.setTitle("关于 Java");
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
        Text explore = new Text("探索");
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

        Text event = new Text("活動");
        Text news = new Text("新聞");
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

        Text about = new Text("關於");
        Text about_java = new Text("關於 Java");
        Text about_openJDK = new Text("關於 OpenJDK");
        Text getting_started = new Text("開始學習Java");
        Text oracle_se = new Text("訂閱 Oracle Java SE");
        about.getStyleClass().add("about");
        about_java.getStyleClass().add("about_content");
        about_openJDK.getStyleClass().add("about_content");
        getting_started.getStyleClass().add("about_content");
        oracle_se.getStyleClass().add("about_content");

        VBox about_box = new VBox(10, about, about_java, about_openJDK, getting_started, oracle_se);
        about_box.setPadding(new Insets(10, 20, 10, 20));
        about_box.setAlignment(Pos.CENTER_LEFT);

        Text foot_download = new Text("下載");
        Text all_release = new Text("所有版本");
        Text source_code = new Text("原始碼");
        foot_download.getStyleClass().add("about");
        all_release.getStyleClass().add("about_content");
        source_code.getStyleClass().add("about_content");

        VBox download_box = new VBox(10, foot_download, all_release, source_code);
        download_box.setPadding(new Insets(10, 20, 10, 20));
        download_box.setAlignment(Pos.TOP_LEFT);

        Text follow_us = new Text("追隨我們");

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
        scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scroll.setContent(box);

        final Scene scene = new Scene(scroll, 300, 250);
        scene.getStylesheets().add("assignment3a.css");
        scene.setFill(Color.WHITE);
        stage.setScene(scene);
        stage.show();
    }

}
