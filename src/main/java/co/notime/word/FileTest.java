package co.notime.word;

import java.io.File;

/**
 * Author: Lachlan Krautz
 * Date:   26/07/16
 */
class FileTest {

    private File file;

    FileTest(File file) {
        this.file = file;
    }

    void run() {
        System.out.println("Running: " + file.getName());
        
    }
}
