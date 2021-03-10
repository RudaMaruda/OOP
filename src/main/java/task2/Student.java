package task2;

import task2.Person;

public class Student extends Person {
    protected String typeStudies;
    protected int yearOfStudies;
    protected int priceOfStudies;

    public String getTypeStudies() {
        return typeStudies;
    }

    public void setTypeStudies(String typeStudies) {
        this.typeStudies = typeStudies;
    }

    public int getYearOfStudies() {
        return yearOfStudies;
    }

    public void setYearOfStudies(int yearOfStudies) {
        this.yearOfStudies = yearOfStudies;
    }

    public int getPriceOfStudies() {
        return priceOfStudies;
    }

    public void setPriceOfStudies(int priceOfStudies) {
        this.priceOfStudies = priceOfStudies;
    }

    public Student(String name, String address, String typeStudies, int yearOfStudies, int priceOfStudies ){
        super (name,address);
        this.priceOfStudies =priceOfStudies;
        this.typeStudies=typeStudies;
        this.yearOfStudies = yearOfStudies;

    }
    public Student(String typeStudies,int yearOfStudies,int priceOfStudies ){
        this.priceOfStudies =priceOfStudies;
        this.typeStudies=typeStudies;
        this.yearOfStudies = yearOfStudies;
    }

    @Override
    public String toString(){
        return name+" live in "+address+". He/She is on "+typeStudies+". This is "+yearOfStudies+" year of him/his studies."+
                "This studies is really expensive, cost is "+priceOfStudies+" USD per year.";
    }


}
