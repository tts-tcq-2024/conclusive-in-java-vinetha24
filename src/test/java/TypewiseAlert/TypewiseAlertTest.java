import static org.junit.jupiter.api.Assertions.assertEquals;

public class TypewiseAlertTest {

    @Test
    public void testPassiveCoolingStrategy() {
        TypewiseAlert typewiseAlert = new TypewiseAlert();
        assertEquals(BreachType.NORMAL, typewiseAlert.classifyTemperatureBreach(CoolingType.PASSIVE_COOLING, 25));
        assertEquals(BreachType.TOO_LOW, typewiseAlert.classifyTemperatureBreach(CoolingType.PASSIVE_COOLING, -5));
        assertEquals(BreachType.TOO_HIGH, typewiseAlert.classifyTemperatureBreach(CoolingType.PASSIVE_COOLING, 40));
    }

    @Test
    public void testHighActiveCoolingStrategy() {
        TypewiseAlert typewiseAlert = new TypewiseAlert();
        assertEquals(BreachType.NORMAL, typewiseAlert.classifyTemperatureBreach(CoolingType.HI_ACTIVE_COOLING, 35));
        assertEquals(BreachType.TOO_LOW, typewiseAlert.classifyTemperatureBreach(CoolingType.HI_ACTIVE_COOLING, -10));
        assertEquals(BreachType.TOO_HIGH, typewiseAlert.classifyTemperatureBreach(CoolingType.HI_ACTIVE_COOLING, 50));
    }

    @Test
    public void testMediumActiveCoolingStrategy() {
        TypewiseAlert typewiseAlert = new TypewiseAlert();
        assertEquals(BreachType.NORMAL, typewiseAlert.classifyTemperatureBreach(CoolingType.MED_ACTIVE_COOLING, 30));
        assertEquals(BreachType.TOO_LOW, typewiseAlert.classifyTemperatureBreach(CoolingType.MED_ACTIVE_COOLING, -8));
        assertEquals(BreachType.TOO_HIGH, typewiseAlert.classifyTemperatureBreach(CoolingType.MED_ACTIVE_COOLING, 45));
    }
}
