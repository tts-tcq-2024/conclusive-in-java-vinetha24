package TypewiseAlert
public class MediumActiveCoolingStrategy implements TemperatureClassificationStrategy {
    @Override
    public BreachType classifyTemperatureBreach(double temperatureInC) {
        return TypewiseAlert.inferBreach(temperatureInC, 0, 40);
    }
}
