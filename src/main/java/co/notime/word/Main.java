package co.notime.word;

import java.io.IOException;

/**
 * Author: Lachlan Krautz
 * Date:   26/07/16
 */
public class Main {

    public static void main (String[] args) {
        if (args.length > 0) {
            FileTest test = new FileTest(args[0]);
            try {
                test.run();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Please specify file to open");
        }
    }

}
