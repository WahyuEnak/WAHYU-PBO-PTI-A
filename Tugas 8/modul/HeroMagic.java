public class HeroMagic extends Hero {
    private String power;

    public HeroMagic(String name, double health) {
        super(name, health);
        this.power = "Magic";
    }

    public String getPower() {
        return this.power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}

