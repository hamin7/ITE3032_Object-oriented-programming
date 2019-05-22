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
    Thread t = new Thread( new CustomThread('a'));
    Thread t1 = new Thread (new CustomThread('b'));

    t.start();
    t1.start();
  }
}
