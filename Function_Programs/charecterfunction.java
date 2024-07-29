package Function_Programs;

public class charecterfunction {
   public static void main(String[] args) {
    char a[]={'b','g','6',' ','D',};
    for(int i=0;i<a.length;i++){
        if(Character.isDigit(a[i]))
        {
            System.out.println(a[i] +" Is A Digit\n");
        }
        else if(Character.isLetter(a[i]))
        {
            System.out.println(a[i] +" Is A Letter\n");
        }
        else if(Character.isWhitespace(a[i]))
        {
            System.out.println(a[i] +"Is A Whitespace\n");
        }
        else if(Character.isUpperCase(a[i]))
        {
            System.out.println(a[i] +"\n Is A UpperCase \n ");
        }
        else if(Character.isAlphabetic(a[i]))
        {
            System.out.println(a[i] +"\n Is A Alphabetic \n  ");
        }
        else if(Character.isUnicodeIdentifierPart(a[i]))
        {
            System.out.println(a[i] +"\n Is A UnicodeIdentifierPart \n  ");
        }

        
    }
   } 
}
