
import java.util.Scanner;
public class WhiteSpace {
    String space = "";


    void strinput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input       A      Line         for      remove          whitespace");
        space = sc.nextLine();
    }


    void remove() {
        char str[] = space.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <= str.length; i++)
        {
              if(str[i]!=' ')
              {
                  sb.append(str[i]);
              }
        }
            String out = str.toString();
        System.out.println(out);
    }
}
