package model;

public class ComputerScienceStudent extends Student implements Citizen{

    String favouriteProgrammingLanguage;
    String leastFavouriteProgrammingLanguage;

    public ComputerScienceStudent(String name, String id, String favouriteProgrammingLanguage, String leastFavouriteProgrammingLanguage) {
        super(name, id);
        this.favouriteProgrammingLanguage = favouriteProgrammingLanguage;
        this.leastFavouriteProgrammingLanguage = leastFavouriteProgrammingLanguage;
    }

    @Override
    public String getStudies() {
        return "Computer Science";
    }

    @Override
    public String toString() {
        return "name: " + name + " id: " + id + " favourite Programming Language:" + favouriteProgrammingLanguage + " Least Favourite Programming language: " + leastFavouriteProgrammingLanguage;
    }

    @Override
    public String getAdress() {
        return "Kurze Str. 12";
    }

    @Override
    public int getIdentityCardNumber() {
        return 898;
    }
}
