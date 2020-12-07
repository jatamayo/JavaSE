public class Doctor {

    // Attributes
    static int id = 0;
    String name;
    String speciality;

    // Constructor
    Doctor(){
        id++;
    }

    // Methods
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

}
