package model;

import java.util.Objects;

public class PhysicsStudent extends Student implements Citizen {

    String favouriteFormula;

    public PhysicsStudent(String name, String id, String favouriteFormula) {
        super(name, id);
        this.favouriteFormula = favouriteFormula;
    }

    @Override
    public String getStudies() {
        return "Physics";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PhysicsStudent that = (PhysicsStudent) o;
        return favouriteFormula.equals(that.favouriteFormula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), favouriteFormula);
    }

    @Override
    public String toString() {
        return "name: " + name + " id: "+id +" favourite formula: " + favouriteFormula;
    }

    public String getFavouriteFormula() {
        return favouriteFormula;
    }

    public void setFavouriteFormula(String favouriteFormula) {
        this.favouriteFormula = favouriteFormula;
    }

    @Override
    public String getAdress() {
        return "Hauptstr. 3";
    }

    @Override
    public int getIdentityCardNumber() {
        return 76287;
    }
}

