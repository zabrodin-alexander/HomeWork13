package classes;

public class Gryffindor extends Hogwarts {
    protected int nobility;
    protected int honor;
    protected int bravery;

    public Gryffindor(String firstName, String lastName, int powerofMagic, int distanceOfTransgression, int nobility, int honor, int bravery) {
        super(firstName, lastName, powerofMagic, distanceOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" + "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", powerofMagic=" + powerofMagic +
                ", distanceOfTransgression=" + distanceOfTransgression +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    private int getTotalPoints() {
        return nobility + honor + bravery;
    }


    public static void comparingStudents(Gryffindor studentOne, Gryffindor studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne.getLastName() + " лучший Гриффиндорец, чем " + studentTwo.getLastName());
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo.getLastName() +  " лучший Гриффиндорец, чем " + studentOne.getLastName());
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}