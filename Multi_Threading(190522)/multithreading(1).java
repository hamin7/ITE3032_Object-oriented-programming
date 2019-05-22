import java.io.*;

public class CustomThread extends Thread{
  public CustomThread(char ch) {this.ch = ch;}
  public char ch;
  public void run(){
    for(int i = 0; i < 100; i++){ System.out.print("(" + i + "," + ch + ") "); }
  }
};

public class Welcome{
  public static void main(String[] args){
    CustomThread t = new CustomThread('a');
    CustomThread t1 = new CustomThread('b');
    CustomThread t2 = new CustomThread('c');
    t.start();
    t1.start();
    t2.start();
  }
}
