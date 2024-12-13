package classes;

public class Slytherin extends Hogwarts {

    protected int cunning;
    protected int determination;
    protected int ambition;
    protected int resourcefulness;
    protected int lustOfPower;

    public Slytherin(String firstName, String lastName, int powerofMagic, int distanceOfTransgression, int cunning, int determination, int ambition, int resourcefulness, int lustOfPower) {
        super(firstName, lastName, powerofMagic, distanceOfTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustOfPower = lustOfPower;
    }


    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustOfPower() {
        return lustOfPower;
    }

    public void setLustOfPower(int lustOfPower) {
        this.lustOfPower = lustOfPower;
    }

    private int getTotalPoints() {
        return cunning + determination + ambition + resourcefulness + lustOfPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" + "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", powerofMagic=" + powerofMagic +
                ", distanceOfTransgression=" + distanceOfTransgression +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustOfPower=" + lustOfPower +
                '}';
    }

    public static void comparingStudents(Slytherin studentOne, Slytherin studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne.getLastName() + " Обладает мощностью магии больше чем " + studentTwo.getLastName());
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo.getLastName() + " Обладает мощностью магии больше чем " + studentOne.getLastName());
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}
