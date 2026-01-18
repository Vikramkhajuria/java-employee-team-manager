package se.company.resource;

import java.util.ArrayList;

public class Team {

    private ArrayList<Employee> member = new ArrayList<>();

    public Team(){

    }
    public void add(Employee emp){
        member.add(emp);

    }
    public String toString(){
        if(member.isEmpty()){
            return "# TEAM:\n (empty team)";
        }
        String result = "# TEAM:\n";
        for(Employee e: member){
            result += " " + e.toString() + "\n";
        }
        return result;

    }
    public String work(){
        if (member.isEmpty()) {
            return "# TEAM:\n  (no employees in team)";
        }
        String result = "# TEAM is working:\n";
        for(Employee e: member){
            String w = e.work();
            if(!w.isEmpty()){
                result += " " + w + "\n";
            }
            if (e instanceof SuperEmployee) {
                SuperEmployee sup = (SuperEmployee) e;
                for (SuperPower p : sup.getPowers()){
                    result += "    " + p.usePower() + "\n";
                }
            }
        }
        return result;
    }
}
