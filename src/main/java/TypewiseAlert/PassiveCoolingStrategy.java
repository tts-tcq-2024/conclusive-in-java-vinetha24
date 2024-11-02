public class PassiveCoolingStrategy implements ITemperatureClassificationStrategy {
    @Override
    public BreachType classifyTemperatureBreach(double temperatureInC) {
        return TypewiseAlert.inferBreach(temperatureInC, 0, 35);
    }
}
