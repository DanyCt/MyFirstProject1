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
    public class SumaValores {
        public static void main(String[] args) {
            // Crear un objeto Scanner para leer la entrada del usuario
            Scanner input = new Scanner(System.in);

            // Solicitar el primer número al usuario
            System.out.print("Ingresa el primer número: ");
            int numero1 = input.nextInt();

            // Solicitar el segundo número al usuario
            System.out.print("Ingresa el segundo número: ");
            int numero2 = input.nextInt();

            // Calcular la suma de los dos números
            int suma = numero1 + numero2;

            // Imprimir el resultado
            System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

            // Cerrar el objeto Scanner
            scanner.close();
        }
    }
    public static void main(String[] args) {
        launch();
    }
}