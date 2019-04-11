import java.util.Date;
import java.util.Scanner;

public class Student extends Person{
  private String identificationNumber;
  private Date absentTime;
  private double scoresMidtermExam = 0;
  private double scoresFinalExam = 0;
  public double getScoresMidtermExam(){
    return scoresMidtermExam;
  }
  //
  public void setScoresMidtermExam(double scoresMidtermExam){
    this.scoresMidtermExam = scoresMidtermExam;
    while(this.scoresMidtermExam>50 || this.scoresMidtermExam<0){
      System.out.println("Write score 0~50");
      Scanner sc = new Scanner(System.in);
      this.scoresMidtermExam = sc.nextDouble();
    }
    this.scoresMidtermExam = scoresMidtermExam;
  }

  public double getScoresFinalExam(){
    return scoresFinalExam;
  }
  //
  public void setScoresFinalExam(double scoresFinalExam){
    this.scoresFinalExam = scoresFinalExam;
    while(this.scoresMidtermExam>50 || this.scoresMidtermExam<0){
      System.out.println("Write score 0~50");
      Scanner sc = new Scanner(System.in);
      this.scoresMidtermExam = sc.nextDouble();
    }
    this.scoresFinalExam = scoresFinalExam;
  }

  //
  public double scoresAltogether(){
    return this.scoresMidtermExam+this.scoresFinalExam;
  }
  //
  public boolean pass(){
    double sum = scoresAltogether();
    if(sum>60){
      return true;
    }
    else{
      return false;
    }
  }
}
