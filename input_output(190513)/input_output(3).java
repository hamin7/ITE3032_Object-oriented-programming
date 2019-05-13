import java.io.*;

public class Welcome {
  public static void main(String[] args){
    try{
      FileInputstream in = new FileInputstream("out.bin");
      int i;
      i = in.read();
      System.out.println(i);
      i = in.read();
      System.out.println(i);
      in.close();
    }
    catch( IOException e){
      System.out.println("Something went wrong with I/O ...");
    }
  }
}
