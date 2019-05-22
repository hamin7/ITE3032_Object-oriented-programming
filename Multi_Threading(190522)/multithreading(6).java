import java.io.*;

public class CustomThread implements Runnable{
  public CustomThread(char ch, Welcome w) {this.ch = ch; this.w = w;}
  public char ch;
  public Welcome w;
  // public boolean stop = false;
  public void run(){
    for(int i = 0; i < 100; i++){
      System.out.print("(" + i + "," + ch + ") ");
      
   }
  }
};
class Thread{
  public int counter = 0;
};

public class Welcome{
  public static void main(String[] args){

    ThreadGroup g = new ThreadGroup('Group');
    Shread s = new Shread();
    CustomThread ct = new CustomThread('a', this);
    CustomThread ct1 = new CustomThread('b', this);

    Thread t = new Thread( g, ct );
    Thread t1 = new Thread ( g, ct1 );

    t.start();
    t1.start();

    // Thread.join(t);

    while(g.activeCount() > 0);

    System.out.print("Main threaded finished ... ", s.counter);
  }
}
