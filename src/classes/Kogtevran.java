package classes;

public class Kogtevran extends Hogwarts {

    protected int mind;
    protected int wit;
    protected int creation;

    public Kogtevran(String firstName, String lastName, int powerofMagic, int distanceOfTransgression, int mind, int wit, int creation) {
        super(firstName, lastName, powerofMagic, distanceOfTransgression);
        this.mind = mind;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    private int getTotalPoints() {
        return mind + wit + creation;
    }

    @Override
    public String toString() {
        return "Kogtevran{" + "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", powerofMagic=" + powerofMagic +
                ", distanceOfTransgression=" + distanceOfTransgression +
                "mind=" + mind +
                ", wit=" + wit +
                ", creation=" + creation +
                '}';
    }

    public static void comparingStudents(Kogtevran studentOne, Kogtevran studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne.getLastName() + " Обладает мощностью магии больше чем " + studentTwo.getLastName());
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo.getLastName() + " Обладает мощностью магии больше чем " + studentOne.getLastName());
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}
