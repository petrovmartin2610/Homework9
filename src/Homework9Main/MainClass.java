
package Homework9Main;

public class MainClass {

    /**
     * main метода създава нови обекти със определени ст-сти на съответните им атрибути, записва ги в масив
     * с име machinesArray и ги принтира в конзолата
     * @author Martin Petrov
     */
    public static void main(String[] args){
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setPersonName("Ivan");
        person2.setPersonName("Cecka");

        Machine machine1 = new Machine();
        Machine machine2 = new Machine();
        machine1.setMachinePower(300);
        machine1.setMachineColor("black");
        machine1.setMachineHeight("150");
        machine1.setMachineEnginePower(500);
        machine1.setMachineEngineProduction(345);

        machine2.setMachinePower(230);
        machine2.setMachineColor("white");
        machine2.setMachineHeight("175");
        machine2.setMachineEnginePower(670);
        machine2.setMachineEngineProduction(654);


        String[] machinesArray = new String[2];
        machinesArray[0]="Machine 1, operated by " + person1.getPersonName() + ", has power of " + machine1.getMachinePower() + ", engine power of "
                + machine1.getMachineEnginePower() + ", height of " + machine1.getMachineHeight() + ", production of " + machine1.getMachineEngineProduction() +
                " and color " + machine1.getMachineColor();

        machinesArray[1]="Machine 2, operated by " + person2.getPersonName() + ", has power of " + machine2.getMachinePower() + ", engine power of "
                + machine2.getMachineEnginePower() + ", height of " + machine2.getMachineHeight() + ", production of " + machine2.getMachineEngineProduction() +
                " and color " + machine2.getMachineColor();

        for (String s : machinesArray) {
            System.out.println(s);
        }




    }


}
