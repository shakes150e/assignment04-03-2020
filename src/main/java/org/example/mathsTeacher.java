package org.example;

class Teacher {
    String designation = "Teacher";
    String collegeName = "Beginnersbook";
    void does(){
        System.out.println("Teaching");
    }
}

public class mathsTeacher extends Teacher{ //inheritance
    String mainSubject = "maths";
    public static void main(String args[]){
        mathsTeacher teach = new mathsTeacher();
        System.out.println(teach.collegeName);
        System.out.println(teach.designation);
        System.out.println(teach.mainSubject);
        teach.does();
    }
}

