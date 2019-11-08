package lab6.AnimalRescue;

public abstract class Animal {

    private String name;
    private char sex;
    private int age;

    public void setName (String newname){
        this.name = newname;
    }
    public String getName(){
        return name;
    }
    public void setSex (char newsex){
        this.sex = newsex;
    }
    public char getSex(){
        return sex;
    }
    public void setAge (int newage){
        this.age = newage;
    }
    public int getAge(){
        return age;
    }


    public abstract void talk ();

    public abstract void move ();

    public abstract void eat ();

}
