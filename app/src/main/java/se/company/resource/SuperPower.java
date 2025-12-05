package se.company.resource;
import java.util.ArrayList;
import java.util.List;


public class SuperPower {
    private String type;
    private String description;

    private List<SuperPower> powers = new ArrayList<>();

    public SuperPower(String type, String description) {
        this.type = type;
        this.description = description;

    }

    public String usePower() {
        return "Using superpower: " + type + " - " + description + ".";
    }
    public String gettype() {
        return type;
    }

    public void addPower(SuperPower power) {
        powers.add(power);
    }
    public List<SuperPower> getPowers() {
        return powers;
    }


}
