package observers.claudeExercicio1;

public class AlertaTemperatura implements Observer{
//  Desafio extra: adicione um AlertaTemperatura que só notifica o usuário se a temperatura passar de 40°C.

    @Override
    public void update(double temperaturaCelsius) {
        if (temperaturaCelsius >= 40) {
            System.out.println(">> Alerta de Temperatura Alta - Tome água, utilize protetor solar e se previna!");
        } else if (temperaturaCelsius <= 8) {
            System.out.println(">> Alerta de Temperatura Baixa - Utilize casaco, luvas, permaneça aquecido e se previna!");
        }
    }
}
