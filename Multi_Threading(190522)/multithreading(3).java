import java.io.*;

public class CustomThread extends Thread{
  public CustomThread(char ch) {this.ch = ch;}
  public char ch;
  public boolean stop = false;
  public void run(){
    for(int i = 0; i < 100; i++){ System.out.print("(" + i + "," + ch + ") ");
   }
  }
};

public class Welcome{
  public static void main(String[] args){
    CustomThread ct = new CustomThread('a');
    CustomThread ct1 = new CustomThread('b');
    Thread t = new Thread( ct );
    Thread t1 = new Thread ( ct1 );

    t.start();
    t1.start();

    try { Thread.sleep(1000); } catch (InterruptedException e) {}

    ct.stop = true;
    ct1.stop = true;
  }
}
