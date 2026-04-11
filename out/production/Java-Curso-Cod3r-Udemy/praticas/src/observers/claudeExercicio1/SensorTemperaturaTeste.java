package observers.claudeExercicio1;

import java.util.Scanner;

public class SensorTemperaturaTeste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DisplayCelsius dCelsius = new DisplayCelsius();
        DisplayFahrenheit dFahrenheit = new DisplayFahrenheit();
        AlertaTemperatura alertaTemperatura = new AlertaTemperatura();

        SensorTemperatura sensorTemperatura = new SensorTemperatura();
        sensorTemperatura.addObserver(dCelsius);
        sensorTemperatura.addObserver(dFahrenheit);
        sensorTemperatura.addObserver(alertaTemperatura);

        System.out.println(">> Iniciando aplicação de notificação da temperatura atual");
        System.out.println(">> Para sair da aplicação digite: 'sair'");
        String valorDigitado = "";

        do {
            System.out.print("\nDigite a temperatura atual (Celsius): ");

            try {
                valorDigitado = scanner.nextLine().trim().replace(",", ".");
                sensorTemperatura.notifyObservers(Double.parseDouble(valorDigitado));
            } catch (NumberFormatException e) {
                if (!valorDigitado.equalsIgnoreCase("sair")) {
                    System.out.println(">> Valor digitado invalido!");
                }
            }
        } while (!valorDigitado.equalsIgnoreCase("sair"));

        System.out.println("\n>> Encerrando aplicação...");

        scanner.close();
    }
}
