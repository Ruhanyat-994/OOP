public class Main{
    public static void main(String[] args) {
        Student ibnTanvin = new Student(32,"ibn tanvin hassan",18F);
//        ibnTanvin.nameOfStudent="Ibn Tnavin Hassan Sakib";
//        ibnTanvin.rollNumber = 2330187;
//        ibnTanvin.marksOfCt = 18F;

        System.out.println(ibnTanvin.nameOfStudent);
    }

}
class Student {
    int rollNumber;
    String nameOfStudent;
    float marksOfCt;
    Student(){
//        this.marksOfCt=18F ;
//        this.nameOfStudent = "ibn";
//        this.rollNumber=01;
    }
    Student(int rollNumber,String nameOfStudent,float marksOfCt){
        this.marksOfCt = marksOfCt;
        this.rollNumber= rollNumber;
        this.nameOfStudent = nameOfStudent;
    }
}