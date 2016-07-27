package co.notime.word;

import java.io.IOException;

/**
 * Author: Lachlan Krautz
 * Date:   26/07/16
 */
public class Main {

    public static void main (String[] args) {
        if (args.length > 1) {
            try {
                String file   = args[0];
                FileTest test = new FileTest(file);
                for (String action: args) {
                    if (action.equals("paragraphs")) {
                        test.showParagraphs();
                    }
                    else if (action.equals("tables")) {
                        test.showTables();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Please specify file to open");
        }
    }

}
