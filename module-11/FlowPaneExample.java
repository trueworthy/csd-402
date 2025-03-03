// Lea Trueworthy
// March 1, 2025
// M11 Programming assignment
// Description: Provide an example using FlowPane
// This example demonstrates how to use a FlowPane to arrange buttons horizontally and automatically wrap them when space runs out.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Creating buttons to be added to FlowPane
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");

        // Creating a FlowPane with horizontal orientation
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().addAll(btn1, btn2, btn3, btn4, btn5);

        // Creating a scene and setting it to the stage
        Scene scene = new Scene(flowPane, 300, 250);
        primaryStage.setTitle("FlowPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

