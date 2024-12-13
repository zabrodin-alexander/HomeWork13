package classes;

import java.util.Objects;

public class Hogwarts {

    protected final String firstName;
    protected final String lastName;
    protected int powerofMagic;
    protected int distanceOfTransgression;

    public Hogwarts(String firstName, String lastName, int powerofMagic, int distanceOfTransgression) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.powerofMagic = powerofMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPowerofMagic() {
        return powerofMagic;
    }

    public void setPowerofMagic(int powerofMagic) {
        this.powerofMagic = powerofMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", powerofMagic=" + powerofMagic +
                ", distanceOfTransgression=" + distanceOfTransgression +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return powerofMagic == hogwarts.powerofMagic && distanceOfTransgression == hogwarts.distanceOfTransgression && Objects.equals(firstName, hogwarts.firstName) && Objects.equals(lastName, hogwarts.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, powerofMagic, distanceOfTransgression);
    }

    private int getTotalPoints() {
        return powerofMagic + distanceOfTransgression;
    }

    public static void comparingStudents(Hogwarts studentOne, Hogwarts studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne.getLastName() + " Обладает мощностью магии больше чем " + studentTwo.getLastName());
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo.getLastName() + " Обладает мощностью магии больше чем " + studentOne.getLastName());
        } else {
            System.out.println("Студенты по силе равны");
        }
    }

}
