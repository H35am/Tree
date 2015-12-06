/**
 * 
 *
 */
public class Student {
    int studentnummer;
    String name;

    public Student(int studentnummer, String name){
        this.studentnummer = studentnummer;
        this.name = name;
    }

    public String toString(){
        return name + "heeft studenten nummer: " + studentnummer;
    }

}
