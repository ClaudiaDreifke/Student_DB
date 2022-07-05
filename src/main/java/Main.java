import model.ComputerScienceStudent;
import model.PhysicsStudent;

public class Main {

    public static void main(String[] args) {

        ComputerScienceStudent student1 = new ComputerScienceStudent("Timo", "234", "Java", "Phyton");
        PhysicsStudent student2 = new PhysicsStudent("Lars", "464", "e=mc2");
        System.out.println(student1.toString());
        System.out.println(student2.toString());

        System.out.println(student1.getStudies());
        System.out.println(student2.getStudies());

        System.out.println("Adresse: " + student1.getAdress() + " ID: " + student1.getIdentityCardNumber());
        System.out.println("Adresse: " + student2.getAdress() + " ID: " + student2.getIdentityCardNumber());


    }


}
