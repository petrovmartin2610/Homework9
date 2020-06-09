package Homework9Main;

/**
 * Класът съдържа getters/setters за задаване ст-ст на Person Name през main метода
 * @author Martin Petrov
 */
public class Person {
    private String name;

    public void setPersonName(String newName) {
        this.name = newName;
    }

    public String getPersonName() {
        return name;
    }
}
