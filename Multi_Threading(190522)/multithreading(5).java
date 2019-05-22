import java.io.*;

public class CustomThread extends Thread{
  public CustomThread(char ch) {this.ch = ch;}
  public char ch;
  public boolean stop = false;
  public void run(){
    for(int i = 0; i < 100; i++){
      System.out.print("(" + i + "," + ch + ") ");
      try { Thread.sleep(1000); } catch (InterruptedException e) {}
   }
  }
};

public class Welcome{
  public static void main(String[] args){
    ThreadGroup g = new ThreadGroup('Group');
    CustomThread ct = new CustomThread('a');
    CustomThread ct1 = new CustomThread('b');

    Thread t = new Thread( g, ct );
    Thread t1 = new Thread ( g, ct1 );

    t.start();
    t1.start();

    while(g, activeCount() > 0){
        try {
          Thread.sleep(10);   // not nessesary
        } catch (InterruptedException e) {
        }
      }

    // try { Thread.sleep(1000); } catch (InterruptedException e) {}

    System.out.print("Main threaded finished ... ");
  }
}
