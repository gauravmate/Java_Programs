import java.util.StringTokenizer;
public class stringtokenizer {
    public static void main(String[] args) {
       String str="hello java";
       StringTokenizer word=new StringTokenizer(str);
       while(word.hasMoreTokens())
       {
          System.out.println(word.nextToken());
       }
      System.out.println("total token"+word.countTokens() );
    }
}
