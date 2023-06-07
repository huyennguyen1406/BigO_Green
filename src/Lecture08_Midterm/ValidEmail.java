package Lecture08_Midterm;

import java.util.Scanner;

public class ValidEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();

        int atPos = email.indexOf('@');
        if (atPos == -1) {
            System.out.println("INVALID");
            return;
        }
        String localPart = email.substring(0, atPos);
        String domainName = email.substring(atPos + 1);

        if (localPart.isEmpty() || domainName.isEmpty()) {
            System.out.println("INVALID");
            return;
        }

        for (int i = 0; i < localPart.length(); i++) {
            char ch = localPart.charAt(i);
            if (!((ch >= 'A' && ch <= 'Z')
                    || (ch >= 'a' && ch <= 'z')
                    || (ch >= '0' && ch <= '9')
                    || ch == '.' || ch == '_')) {
                System.out.println("INVALID");
                return;
            }
        }

        for (int i = 0; i < domainName.length(); i++) {
            char ch = domainName.charAt(i);
            if (!((ch >= 'A' && ch <= 'Z')
                    || (ch >= 'a' && ch <= 'z')
                    || ch == '.')) {
                System.out.println("INVALID");
                return;
            }
        }
        if (domainName.indexOf('.') == -1 || domainName.contains("..")) {
            System.out.println("INVALID");
            return;
        }
        System.out.println("VALID");
        sc.close();
    }
}
