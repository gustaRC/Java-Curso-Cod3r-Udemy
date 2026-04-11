package observers.claudeExercicio1;

public class DisplayCelsius implements Observer {
//    Requisito 4: Dois observers: DisplayCelsius e DisplayFahrenheit (que converte e exibe em Fahrenheit)

    @Override
    public void update(double temperaturaCelsius) {
        System.out.println("Temperatural atual (Celsius): " +  temperaturaCelsius);
    }
}
