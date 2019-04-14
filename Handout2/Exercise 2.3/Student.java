import java.util.Date;      // Date 클래스임.
import java.util.Scanner;       // scanner 클래스.

public class Student extends Person{      // Person을 상속.
  private String identificationNumber;        // string 타입으로 id번호 정의. private으로
  private Date absentTime;        // Date타입으로 private변수 absentTime정의
  private double scoresMidtermExam = 0;     // double 타입 private변수 scoresMidtermExam을 0으로 초기화.
  private double scoresFinalExam = 0;     // double 타입 private변수 scoresFinalExam을 0으로 초기화.

  public double getScoresMidtermExam(){     // get매소드 getScoresMidtermExam.
    return scoresMidtermExam;     // scoresMidtermExam을 리턴해줌.
  }

  // set매소드, setScoresMidtermExam, 즉 중간고사 점수를 세팅해줌.
  public void setScoresMidtermExam(double scoresMidtermExam){     // scoresMidtermExam을 파라미터로 받음.
    this.scoresMidtermExam = scoresMidtermExam;     // 이 객체의 scoresMidtermExam에 scoresMidtermExam을 대입.
    while(this.scoresMidtermExam>50 || this.scoresMidtermExam<0){     // 점수가 50점 보다 크거나 0점보다 작다면.
      System.out.println("Write score 0~50");     // 0에서 50점 사이의 점수를 적으라고 출력.
      Scanner sc = new Scanner(System.in);      // 입력된 점수를 스캔(입력).
      this.scoresMidtermExam = sc.nextDouble();     // 스캔한 double타입 숫자를 scoresMidtermExam에 대입.
    }
    this.scoresMidtermExam = scoresMidtermExam;     // while문에 걸리지 않고 올바른 숫자가 입력 됬다면 그대로 scoresMidtermExam에 대입.
  }

  public double getScoresFinalExam(){     // scoresFinalExam을 get.
    return scoresFinalExam;     // scoresFinalExam을 리턴.
  }

  // scoresFinalExam을 set.
  public void setScoresFinalExam(double scoresFinalExam){     // 매개변수는 double타입 scoresFinalExam.
    this.scoresFinalExam = scoresFinalExam;     // 이 객체의 scoresFinalExam에 scoresFinalExam을 대입.
    while(this.scoresMidtermExam>50 || this.scoresMidtermExam<0){     //이 객체의 scoresFinalExam이 50보다 크거나 0보다 작다면.
      System.out.println("Write score 0~50");     // 0~50 점수를 입력하라고 출력.
      Scanner sc = new Scanner(System.in);      // Scanner객체를 이용하여 입력된 문자를 스캔.
      this.scoresMidtermExam = sc.nextDouble();     // Scanner 객체에 입력된 double타입 input을 이 객체의 scoresMidtermExam에 대입.
    }
    this.scoresFinalExam = scoresFinalExam;     // scoresFinalExam을 이 객체의 scoresFinalExam에 대입.
  }

  // scoresMidtermExam과 scoresFinalExam을 합치자.
  public double scoresAltogether(){
    return this.scoresMidtermExam+this.scoresFinalExam;     // 이 객체의 scoresMidtermExam과 scoresFinalExam을 합쳐서 리턴.
  }

  // pass or fail여부를 판별하자.
  public boolean pass(){
    double sum = scoresAltogether();      // double타입 scoresAltogether의 값을 sum에 대입.
    if(sum>60){
      return true;      // 60점 넘는다면 true.
    }
    else{
      return false;     // 60점 이하라면 false.
    }
  }
}
