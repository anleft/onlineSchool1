package onlineSchool;

public class Lecture {
   public String lectureOne;
    public String lectureTwo;
    public String lectureThree;
    public static long ID=0;
  //  String lectureOne = new Lecture();
    //String lectureTwo = new Lecture();
   // Lecture lectureTree = new Lecture();
    public Lecture() {

        ID++;

        System.out.println(Lecture.ID);

    }




    public Lecture(String lectureOne, String lectureTwo, String lectureThree) {
        this.lectureOne = lectureOne;
        this.lectureTwo = lectureTwo;
        this.lectureThree = lectureThree;
    }

}
