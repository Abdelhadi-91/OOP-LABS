public class Taxi extends Vehicle {
    private boolean meterOn;
    private double pricePerKm;

    public Taxi(String plateNumber,int maxSpeed, int currentSpeed, boolean meterOn, double pricePerKm){
        super(plateNumber, maxSpeed);
        this.meterOn=meterOn;
        this.pricePerKm = pricePerKm;
    }

    public void startMeter() {
        meterOn=true;
    }
    public void stopMeter() {
        meterOn=false;
    }
    public String info() {
        return super.info()+", meter status: "+(meterOn ? "on":"off")+", price per meter: "+pricePerKm;
    }
}
