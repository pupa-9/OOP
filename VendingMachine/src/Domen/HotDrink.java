package Domen;

public class HotDrink extends Bottle {
    
    private int temperature;

    public HotDrink(String name, int price, double bottleVolume, int temperature) {
        super(name, price, bottleVolume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString()
    {
        // return super.toString()+" volume="+ bottleVolume;
        return super.toString()+" temperature="+this.temperature;
    }   
}
