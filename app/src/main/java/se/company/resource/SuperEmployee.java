package se.company.resource;

import java.util.ArrayList;

public class SuperEmployee extends Employee {

    private ArrayList<SuperPower> power = new ArrayList<>();

    public SuperEmployee(String name, String work) {
        super(name, work, 0);

    }

    @Override
    public String toString() {
        if (power.isEmpty()) {
            return "Sup: " + name + " (" + work + ")";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < power.size(); i++) {
            sb.append(power.get(i).gettype());
            if (i < power.size() - 1) {
                sb.append(", ");
            }
        }

        return "Sup: " + name + " (" + work + ") - " + sb;
    }

    @Override
    public String work() {
        return "Sup: " + name + " is saving the day in " + work + ".";
    }
    public void addPower(SuperPower power) {
        this.power.add(power);
    }
    public ArrayList<SuperPower> getPowers() {
        return power;
    }


}
