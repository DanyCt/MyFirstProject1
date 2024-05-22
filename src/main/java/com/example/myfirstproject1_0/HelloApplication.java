package com.example.myfirstproject1_0;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Scanner;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
    }
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

              System.out.print("Enter the first value: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Enter the second value: ");
        double numero2 = scanner.nextDouble();
        // Sumar los dos números
        double suma = numero1 + numero2;
        double divit = numero1 / numero2;
        // Mostrar el resultado de la suma y division
        System.out.println("The sum is => " + numero1 + " y " + numero2 + " es: " + suma);
        System.out.println("The divtion is => " + numero1 + " and " + numero2 + " is: " + divit);
        // Cerrar el scanner
        scanner.close();
    }
}