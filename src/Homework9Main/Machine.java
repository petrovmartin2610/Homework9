package Homework9Main;

/**
 * Класът съдържа getters/setters за задаване ст-ст на Machine Power, Machine Height, Machine Color и
 * Machine Engine Production през main метода
 * @author Martin Petrov
 */

public class Machine extends Engine  {
    private int power;
    private String height;
    private String color;

    public void setMachinePower(int machinePower) {
        this.power = machinePower;
    }

    public int getMachinePower() {
        return power;
    }

    public void setMachineHeight(String machineHeight) {
        this.height = machineHeight;
    }

    public String getMachineHeight() {
        return height;
    }

    public void setMachineColor(String machineColor) {
        this.color = machineColor;
    }

    public String getMachineColor() {
        return color;
    }




}
