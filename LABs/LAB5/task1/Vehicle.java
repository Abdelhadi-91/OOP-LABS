public class Vehicle {
    private String plateNumber;
    private int maxSpeed;
    private int currentSpeed;

    public Vehicle(String plateNumber, int maxSpeed){
        this.plateNumber = plateNumber;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    public void accelerate(int delta){
        if (delta>0) {
            currentSpeed+=delta;
            System.out.println("Speed: "+(currentSpeed-delta)+"Km/h --> "+currentSpeed+"Km/h");
        }
    }
    public void brake(int delta){
        if (currentSpeed>0 && delta<=currentSpeed) {
            currentSpeed-=delta;
            System.out.println("Speed: "+(currentSpeed+delta)+"Km/h --> "+currentSpeed+"Km/h");
        }
    }
    public String info() {
        return "plate number: "+plateNumber+", max speed: "+maxSpeed+", current speed: "+currentSpeed;
    }
}
