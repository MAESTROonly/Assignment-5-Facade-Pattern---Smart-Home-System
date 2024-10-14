public class SmartHomeFacade {
    private Light lights;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade(Light lights, Thermostat thermostat, SecuritySystem securitySystem, EntertainmentSystem entertainmentSystem) {
        this.lights = lights;
        this.thermostat = thermostat;
        this.securitySystem = securitySystem;
        this.entertainmentSystem = entertainmentSystem;
    }

    public void leaveHome() {
        System.out.println("\nLeaving Home...");
        lights.turnOff();
        thermostat.setTemperature(18);
        securitySystem.arm();
        entertainmentSystem.turnOff();
    }

    public void arriveHome() {
        System.out.println("\nArriving Home...");
        lights.turnOn();
        thermostat.setTemperature(22);
        securitySystem.disarm();
    }


    public void nightMode() {
        System.out.println("\nActivating Night Mode...");
        lights.dim();
        thermostat.setTemperature(21);
        securitySystem.activateNightMode();
        entertainmentSystem.turnOff();
    }

    public void movieMode() {
        System.out.println("\nActivating Movie Mode...");
        lights.dim();
        entertainmentSystem.setMovieMode();
        thermostat.setTemperature(22);
    }
}
