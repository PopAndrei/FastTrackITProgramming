package lab4.AnimalRescue;

public class Human {
    private String name;
    private String ocupation;
    private float age;
    private char sex;


    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public void setAge(float newAge) {
        this.age = newAge;
    }

    public float getAge() {
        return age;
    }

    public void setSex(char newSex) {
        this.sex = newSex;
    }

    public char getSex() {
        return sex;
    }


    public void setOcupation(String newOcupation) {
        this.ocupation = newOcupation;
    }
    public String getOcupation(){
        return ocupation;
    }

}