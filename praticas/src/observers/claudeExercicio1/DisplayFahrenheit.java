package observers.claudeExercicio1;

public class DisplayFahrenheit implements Observer{
//    Requisito 4: Dois observers: DisplayCelsius e DisplayFahrenheit (que converte e exibe em Fahrenheit)

    @Override
    public void update(double temperaturaCelsius) {
        System.out.println("Temperatural atual (Fahrenheit): " +  converterCelsiusParaFahrenheit(temperaturaCelsius));
    }

    private double converterCelsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 1.8) + 32;
    }
}
