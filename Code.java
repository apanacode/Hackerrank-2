import java.util.*;

class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        // StringBuffer sb=new StringBuffer();
        String s1 = sc.nextLine();
        String s2 = "";
        s1 = s1 + ' ';
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch != ' ') {
                s2 = s2 + ch;
            } else {
                s2 = Character.toUpperCase(s2.charAt(0)) + s2.substring(1);
                System.out.print(s2 + " ");
                s2 = "";
            }
        }
        sc.close();
    }
}