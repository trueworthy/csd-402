// Lea Trueworthy
// March 1, 2025
// M11 Programming assignment
// Description: Provide an example using GridPane
// This example demonstrates to organize labels and text fields in a form-like layout.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Creating labels and text fields for the form
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        // Creating a GridPane
        GridPane gridPane = new GridPane();
        gridPane.add(nameLabel, 0, 0);  // Adding nameLabel at (0, 0)
        gridPane.add(nameField, 1, 0);  // Adding nameField at (1, 0)
        gridPane.add(emailLabel, 0, 1); // Adding emailLabel at (0, 1)
        gridPane.add(emailField, 1, 1); // Adding emailField at (1, 1)

        // Setting gaps and padding
        gridPane.setHgap(10); // Horizontal gap between columns
        gridPane.setVgap(10); // Vertical gap between rows
        gridPane.setPadding(new javafx.geometry.Insets(10, 10, 10, 10));

        // Creating a scene and setting it to the stage
        Scene scene = new Scene(gridPane, 300, 150);
        primaryStage.setTitle("GridPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}