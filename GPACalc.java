//gpa calc
import java.util.Scanner;
public class GPACalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of subjects : ");
        int n;
        double Grade,GPA = 0;
        int Hours;
        double TotalHours=0;
        double TotalGPA=0;
        n= scan.nextInt();
        if (n<=7&&n>=5){
          for(int i=1; i<=n ;i++){
              System.out.print("Enter Your Grade of subject "+ i +" in %  : ");
              Grade= scan.nextDouble() ;
              System.out.print("Enter Hours of The subject :");
              Hours= scan.nextInt();
              if(Grade<60){
                  GPA=0 ;
                  System.out.println("(F)---->\tGPA "+GPA);
              }
              else if (Grade>=60&&Grade<64) {
                  GPA=1 ;
                  System.out.println("(D)---->\tGPA "+GPA);
              }
              else if (Grade>=64&&Grade<67) {
                  GPA=1.3 ;
                  System.out.println("(D+)---->\tGPA "+GPA);
              }
              else if (Grade>=67&&Grade<70) {
                  GPA=1.7;
                  System.out.println("(C-)---->\tGPA "+GPA);
              }
              else if (Grade>=70&&Grade<73) {
                  GPA=2;
                  System.out.println("(C)---->\tGPA "+GPA);
              }
              else if (Grade>=73&&Grade<76) {
                  GPA=2.3;
                  System.out.println("(C+)---->\tGPA "+GPA);
              }
              else if (Grade>=76&&Grade<80) {
                  GPA=2.7;
                  System.out.println("(B-)---->\tGPA "+GPA);
              }
              else if (Grade>=80&&Grade<84) {
                  GPA=3;
                  System.out.println("(B)---->\tGPA "+GPA);
              }
              else if (Grade>=84&&Grade<89) {
                  GPA=3.3;
                  System.out.println("(B+)---->\tGPA "+GPA);
              }
              else if (Grade>=89&&Grade<93) {
                  GPA=3.7;
                  System.out.println("(A-)---->\tGPA "+GPA);
              }
              else if (Grade>=93&&Grade<97) {
                  GPA=4;
                  System.out.println("(A)---->\tGPA "+GPA);
              }
              else if (Grade>=97&&Grade<=100) {
                  GPA=4;
                  System.out.println("(A+)---->\tGPA "+GPA);
              }
              else {
                  System.out.println("Invalid grade");
              }
              GPA *= Hours;
              TotalGPA=TotalGPA+GPA;
              TotalHours=TotalHours+Hours;
          }
            TotalGPA=TotalGPA/TotalHours ;
          System.out.println("Total Credit Hours : "+ TotalHours);
          System.out.println("Total GPA : "+ TotalGPA);
        }
        else {
            System.out.println("invalid number of subjects");
        }
    }
}