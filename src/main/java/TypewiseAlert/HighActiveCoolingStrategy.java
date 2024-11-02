public class HighActiveCoolingStrategy implements TemperatureClassificationStrategy {
    @Override
    public BreachType classifyTemperatureBreach(double temperatureInC) {
        return TypewiseAlert.inferBreach(temperatureInC, 0, 45);
    }
}
