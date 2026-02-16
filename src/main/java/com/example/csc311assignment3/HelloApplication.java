package com.example.csc311assignment3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Label label1 = new Label("Annual Interest Rate: ");
        GridPane.setConstraints(label1, 0, 0);

        TextField air = new TextField();
        GridPane.setConstraints(air, 1, 0);

        Label label2 = new Label("Annual Interest Rate: ");
        GridPane.setConstraints(label2, 0, 1);

        TextField yrs = new TextField();
        GridPane.setConstraints(yrs, 1, 1);

        Label label3 = new Label("Annual Interest Rate: ");
        GridPane.setConstraints(label3, 0, 2);

        TextField loan = new TextField();
        GridPane.setConstraints(loan, 1, 2);

        Label label4 = new Label("Annual Interest Rate: ");
        GridPane.setConstraints(label4, 0, 3);

        TextField monthly = new TextField();
        GridPane.setConstraints(monthly, 1, 3);

        Label label5 = new Label("Annual Interest Rate: ");
        GridPane.setConstraints(label5, 0, 3);

        TextField total = new TextField();
        GridPane.setConstraints(total, 1, 3);

        Button button = new Button("Enter");
        GridPane.setConstraints(button, 1, 4);

        gridPane.getChildren().addAll(label1, air, label2, yrs, label3, loan, label4, monthly, label5, total, button);
        Scene scene = new Scene(gridPane, 300, 200);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) { launch(); }
}