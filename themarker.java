import java.util.Scanner;

public class themarker {
    //combine themarker {by liadk07}
    //הוראות הפעלה: העתק את המספרים שבאים אחרי ה-1 בURL )מצורפת תמונה( והכנס בתוך התרגיל 

        public static void main(String[] args) {
            Scanner read=new Scanner(System.in);
            String link;
            String number;
            link="www.themarker.com/misc/themarkersmartphoneapp/.premium-1";
            String Sum;
            System.out.println("please enter the numbers");
            number=read.next();
            System.out.println("the link is: "+(link+number));

        }
    }

