//Name: Chen Xue
//CS 2450
//Assignment 2 Task A
//March 07, 2022

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;

public class TaskA extends Application
{
    //Fields
    private TextField subtotal;
    private Label taxFee, tipsFee, totalFee;
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create a Label to display a prompt.
      Label promptLabel = new Label("Enter the subtotal to calculate your fee:");

      // Create a TextField for input.
      subtotal = new TextField();
      
      // Create a Button control.
      Button calcButton = new Button("Calculate");
      
      // Register the event handler
      calcButton.setOnAction(new CalcButtonHandler());

      // Create empty labels to display result
      taxFee = new Label();
      tipsFee = new Label(); 
      totalFee = new Label();

      HBox hbox = new HBox(10, promptLabel, subtotal);

      // put HBox, and etc, in a VBox
      VBox vbox = new VBox(10, hbox, calcButton, taxFee, tipsFee, totalFee);
      
      // set the alignmeny to center
      vbox.setAlignment(Pos.CENTER);

      // change the background color
      vbox.setStyle("-fx-background-color: #F5F5DC;");
      
      // Create a Scene
      Scene scene = new Scene(vbox);

      // Add scene to stagec
      primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("Fee Calculate");
      
      // Show the window.
      primaryStage.show();
   }

   class CalcButtonHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
         Double total = Double.parseDouble(subtotal.getText());

         // Convert the kilometers to miles.
         Double tax = total * 0.07;

         Double tips = total * 0.18;

         Double needToPay = total + tax + tips;

         // Display the results.
         taxFee.setText(String.format("Tax is $ %,.2f", tax));
         tipsFee.setText(String.format("Tips is $ %,.2f ", tips));
         totalFee.setText(String.format("Total is $ %,.2f", needToPay));
      }
   }
}
