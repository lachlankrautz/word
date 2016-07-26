package co.notime.word;

import org.apache.poi.xwpf.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Author: Lachlan Krautz
 * Date:   26/07/16
 */
class FileTest {

    private String filePath;

    FileTest(String filePath) {
        this.filePath = filePath;
    }

    void run() throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        XWPFDocument docx   = new XWPFDocument(fis);

        for (XWPFParagraph p: docx.getParagraphs()) {
            showLine(p.getText().trim());
        }

        for (XWPFTable t: docx.getTables()) {
            for (XWPFTableRow r: t.getRows()) {
                for (XWPFTableCell c: r.getTableCells()) {
                    showLine(c.getText().trim());
                }
            }
        }
    }

    private void showLine (String line) {
        if (line.isEmpty()) {
            return;
        }
        System.out.println(line);
    }
}
