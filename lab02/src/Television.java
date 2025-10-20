public class Television {
    private String brand;
    private double screenDiagonal;
    private int resolution;
    private boolean isSmartTV;
    private double prize;

    public Television(String brand, double screenDiagonal, int resolution, boolean isSmartTV, double prize) {
        this.brand = brand;
        this.screenDiagonal = screenDiagonal;
        this.resolution = resolution;
        this.isSmartTV = isSmartTV;
        this.prize = prize;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public void setSmartTV(boolean smartTV) {
        isSmartTV = smartTV;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public String getBrand() {
        return brand;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public int getResolution() {
        return resolution;
    }

    public boolean isSmartTV() {
        return isSmartTV;
    }

    public double getPrize() {
        return prize;
    }

    public void showInformation(){
        System.out.printf("Marka: %s, wyswietlacz: %.2f, rozdzielczosc: %d, SmartTV: %b, cena: %f", brand,screenDiagonal,resolution,isSmartTV,prize);
    }
}
