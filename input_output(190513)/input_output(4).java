import java.io.*;

public class Welcome {
  public static void main(String[] args){
    try{
      BufferedInputStream in = new BufferedInputStream(new FileInputstream("out.bin"), 4096);
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
