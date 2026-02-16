package com.example.csc311assignment3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Labels
        Label label1 = new Label("Annual Interest Rate:");
        Label label2 = new Label("Number of Years:");
        Label label3 = new Label("Loan Amount:");
        Label label4 = new Label("Monthly Payment:");
        Label label5 = new Label("Total Payment:");

        // TextFields
        TextField air = new TextField();
        TextField yrs = new TextField();
        TextField loan = new TextField();

        TextField monthly = new TextField();
        monthly.setEditable(false);

        TextField total = new TextField();
        total.setEditable(false);

        // Button
        Button button = new Button("Calculate");

        // Set positions
        GridPane.setConstraints(label1, 0, 0);
        GridPane.setConstraints(air, 1, 0);

        GridPane.setConstraints(label2, 0, 1);
        GridPane.setConstraints(yrs, 1, 1);

        GridPane.setConstraints(label3, 0, 2);
        GridPane.setConstraints(loan, 1, 2);

        GridPane.setConstraints(label4, 0, 3);
        GridPane.setConstraints(monthly, 1, 3);

        GridPane.setConstraints(label5, 0, 4);
        GridPane.setConstraints(total, 1, 4);

        GridPane.setConstraints(button, 1, 5);

        // Button action (calculation)
        button.setOnAction(e -> {

            try {

                double annualRate = Double.parseDouble(air.getText());
                double years = Double.parseDouble(yrs.getText());
                double loanAmount = Double.parseDouble(loan.getText());

                double monthlyRate = annualRate / 100 / 12;
                double numberOfPayments = years * 12;

                double monthlyPayment =
                        loanAmount * monthlyRate /
                                (1 - Math.pow(1 + monthlyRate, -numberOfPayments));

                double totalPayment = monthlyPayment * numberOfPayments;

                monthly.setText(String.format("%.2f", monthlyPayment));
                total.setText(String.format("%.2f", totalPayment));

            } catch (Exception ex) {
                monthly.setText("Invalid input");
                total.setText("Invalid input");
            }

        });

        gridPane.getChildren().addAll(
                label1, air,
                label2, yrs,
                label3, loan,
                label4, monthly,
                label5, total,
                button
        );

        Scene scene = new Scene(gridPane, 350, 250);

        stage.setTitle("Loan Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}