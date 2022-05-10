package chapters1to4;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/*
TODO: Quick Notes
 */

public class PenisEstimator {

    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(System.in);

        System.out.println("What's your name? ");
        System.out.print(">>>: ");
        String name = cin.next();

        System.out.println("What's the length of your penis?");
        System.out.print(">>>: ");
        double len = cin.nextDouble();

        System.out.printf("Impressive! %s's penis on %te/%<tb/%<ty is %.2f cm long!", name, new Date(), len);
        PrintWriter out = new PrintWriter("output.txt", StandardCharsets.UTF_16);
        out.printf("Impressive! %s's penis on %te/%<tb/%<ty is %.2f cm long!", name, new Date(), len).close();
    }


}


