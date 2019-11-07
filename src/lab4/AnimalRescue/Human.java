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

    //In proiectul AnimalRescue, folosind principiul polimorphismului, creati comportamente comune in clasele mai generale,
    // iar pe urma suprascrieti-le in clasele care mostenesc acele clase generale.
    //
    //Spre exemplu, avem clasa Animal, care contine comportamente si atribute comune animalelor. Dog va extinde Animal,
    // deci va mosteni toate atributele si comportamentele. Unele comportamente din Animal nu se potrivesc perfect si pentru Dog,
    // si de aceea e necesar suprascrierea lor. Folosind principiul polimorfismului, suprascrieti metodele,
    // pentru ca ele sa se potriveasca fiecarui obiect.
    //
    //Publicati ca raspuns la aceasta tema link-ul repository-ului din GitHub.

}