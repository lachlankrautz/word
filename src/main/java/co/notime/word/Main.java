package co.notime.word;

import java.io.File;

/**
 * Author: Lachlan Krautz
 * Date:   26/07/16
 */
public class Main {

    public static void main (String[] args) {
        if (args.length > 0) {
            File file = new File(args[0]);
            if (!file.exists()) {
                System.out.println("File not found: " + args[0]);
                return;
            }
            FileTest test = new FileTest(file);
            test.run();
        }
        else {
            System.out.println("Please specify file to open");
        }
    }

}
