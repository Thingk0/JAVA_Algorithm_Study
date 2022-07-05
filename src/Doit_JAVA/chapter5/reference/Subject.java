package Doit_JAVA.chapter5.reference;

public class Subject {

    String subjectName;
    int score;

    public Subject(String subjectName){
        this.subjectName = subjectName;
    }

    public String getSubjectName(){
        return subjectName;
    }

    public void setSubjectName(String name){
        this.subjectName = name;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score = score;
    }

}
