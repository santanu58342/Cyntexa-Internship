import java.util.*;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter character:- ");
        char c=sc.next().charAt(0);
        if( (c>='a' && c<='z') || (c>='A' && c<='Z')){
            System.out.println(c+" is an alphabet.");
            if(Character.isUpperCase(c)){
                System.out.println(c+" is Uppercase");
                if(c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U')
                    System.out.println(c+" is vowel");
                else
                    System.out.println(c+" is consonant");
            }
            else{
                System.out.println(c+" is Lowercase");
                if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
                    System.out.println(c+" is vowel");
                else
                    System.out.println(c+" is consonant");
            }
        }
        else
            System.out.println(c + " is not an alphabet.");
    }
}