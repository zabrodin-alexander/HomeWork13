package classes;

public class Hufflepuff extends Hogwarts {

    protected int hardworking;
    protected int loyalty;
    protected int honesty;

    public Hufflepuff(String firstName, String lastName, int powerofMagic, int distanceOfTransgression, int hardworking, int loyalty, int honesty) {
        super(firstName, lastName, powerofMagic, distanceOfTransgression);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    private int getTotalPoints() {
        return hardworking + loyalty + honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" + "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", powerofMagic=" + powerofMagic +
                ", distanceOfTransgression=" + distanceOfTransgression +
                "hardworking=" + hardworking +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    public static void comparingStudents(Hufflepuff studentOne, Hufflepuff studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne.getLastName() + " Обладает мощностью магии больше чем " + studentTwo.getLastName());
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo.getLastName() + " Обладает мощностью магии больше чем " + studentOne.getLastName());
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}
