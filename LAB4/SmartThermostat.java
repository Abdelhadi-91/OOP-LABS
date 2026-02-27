public class SmartThermostat {
    
    String location;
    double currentTemp;
    double targetTemp;
    boolean ecoMode;
    boolean isOn;

    public SmartThermostat(String location, double currentTemp, double targetTemp, boolean ecoMode, boolean isOn) {
        this.location = location;
        this.currentTemp = currentTemp;
        this.targetTemp = targetTemp;
        this.ecoMode = ecoMode;
        this.isOn = isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void setTargetTemp(double t) {
        targetTemp = t;
    }

    public void toggleEcoMode() {
        ecoMode = !ecoMode;
    }

    public void step(double outsideTemp) {
        double rate;
        if (isOn) {
            rate = ecoMode ? 0.2 : 0.5;
            if (currentTemp<targetTemp) {
                currentTemp += rate;
            } else if (currentTemp>targetTemp) {
                currentTemp -=rate;
            }
        } else {
            double drift = 0.1;
            if (currentTemp<outsideTemp) {
                currentTemp += drift;
            } else if (currentTemp>outsideTemp) {
                currentTemp -=drift;
            }
        }
    }

    public String status() {
        return String.format("Loc: %s, Current: %.2f, Target: %.2f, Eco: %s, On: %s",location,currentTemp,targetTemp,ecoMode,isOn);
    }

    public static void main(String[] args) {
        SmartThermostat thermo = new SmartThermostat("Home", 36, 22, true, true);
        System.out.println(thermo.status());
        double outsideTemp = 38;
        for (int i = 0; i < 20; i++) {
            if (i==10) {
                thermo.toggleEcoMode();
            }
            if (i==15) {
                thermo.turnOff();
            }
            thermo.step(outsideTemp);
            System.out.println(thermo.status());
        }
    }
}
