package TypewiseAlert;

import java.util.HashMap;
import java.util.Map;

public class TypewiseAlert {
    private final Map<CoolingType, ITemperatureClassificationStrategy> strategyMap = new HashMap<>();

    public TypewiseAlert() {
        strategyMap.put(CoolingType.PASSIVE_COOLING, new PassiveCoolingStrategy());
        strategyMap.put(CoolingType.HI_ACTIVE_COOLING, new HighActiveCoolingStrategy());
        strategyMap.put(CoolingType.MED_ACTIVE_COOLING, new MediumActiveCoolingStrategy());
    }
    public BreachType classifyTemperatureBreach(CoolingType coolingType, double temperatureInC) {
        return strategyMap.get(coolingType).classifyTemperatureBreach(temperatureInC);
    }

    public static BreachType inferBreach(double value, double lowerLimit, double upperLimit) {
        if (value < lowerLimit) {
            return BreachType.TOO_LOW;
        }
        if (value > upperLimit) {
            return BreachType.TOO_HIGH;
        }
        return BreachType.NORMAL;
    }
}
