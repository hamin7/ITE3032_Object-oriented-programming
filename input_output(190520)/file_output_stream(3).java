import java.io.*;

public class Welcome {
  static Bufferreader in = new Bufferreader (new InputStreamReader(System.in), 1);
  public static String scanf(){
    try{
      String s = in.readLine;
      return s;
    }
  }catch(IOException e){System.out.println("IO Error");
  return "";
}
  public static int scanfInt(){
    String input = scanf();
    return Integer.parseInt(input);
  }
  public static void main(String[] args){
    int i = scanfInt();
    System.out.println(i);
    }
}
