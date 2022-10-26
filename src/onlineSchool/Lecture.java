package onlineSchool;

public class Lecture {
   public String lectureOne;
    public String lectureTwo;
    public String lectureThree;
    public String lectureFour4;
    public String lectureFive5;
    public String lectureSix6;

    public static long ID=0;
  //  String lectureOne = new Lecture();
    //String lectureTwo = new Lecture();
   // Lecture lectureTree = new Lecture();
    public Lecture() {

        ID++;

        System.out.println(Lecture.ID);

    }





    public Lecture(String lectureOne, String lectureTwo, String lectureThree, String lectureFour4, String lectureFive5, String lectureSix6) {
        this.lectureOne = lectureOne;
        this.lectureTwo = lectureTwo;
        this.lectureThree = lectureThree;

        this.lectureFour4 = lectureFour4;
        this.lectureFive5 = lectureFive5;
        this.lectureSix6 = lectureSix6;


    }
}
