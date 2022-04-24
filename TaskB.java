package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TaskB extends Application {
    private Label text; 
    public static void main(String[] args)
    {
       // Launch the application.
       launch(args);
    }

    @Override
   public void start(Stage primaryStage)
   {
        Button b1 = new Button("sinister");
        Button b2 = new Button("dexter");
        Button b3 = new Button("medium");

        GridPane  g = new GridPane();
        g.add(b1, 0, 0);
        g.add(b2, 0, 1);
        g.add(b3, 0, 2);
        text = new Label();
        g.add(text, 1, 1);

        b1.setOnAction(e -> {
            text.setText("Left");
        });
        b2.setOnAction(e -> {
            text.setText("right");
        });
        b3.setOnAction(e -> {
            text.setText("center");
        });

        Scene s = new Scene(g);
        primaryStage.setScene(s);
        primaryStage.show();

   }

}