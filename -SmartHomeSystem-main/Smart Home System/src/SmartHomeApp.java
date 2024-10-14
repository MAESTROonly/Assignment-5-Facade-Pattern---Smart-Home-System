public class SmartHomeApp {
    public static void main(String[] args) {
        Light lights = new Light();
        Thermostat thermostat = new Thermostat();
        SecuritySystem securitySystem = new SecuritySystem();
        EntertainmentSystem entertainmentSystem = new EntertainmentSystem();

        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(lights, thermostat, securitySystem, entertainmentSystem);

        smartHomeFacade.arriveHome();
        smartHomeFacade.movieMode();
        smartHomeFacade.nightMode();
        smartHomeFacade.leaveHome();
    }
}
