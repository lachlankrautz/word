package co.notime.word;

import org.apache.poi.xwpf.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.stream.Collectors;

/**
 * Author: Lachlan Krautz
 * Date:   26/07/16
 */
class FileTest {

    private XWPFDocument docx;

    FileTest(String filePath) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        docx = new XWPFDocument(fis);
    }

    void showParagraphs () {
        String text = docx.getParagraphs().stream()
                .map(p -> p.getText().trim())
                .filter(s -> !s.isEmpty())
                .collect(Collectors.joining("\n"));

        System.out.println(text);
    }

    void showTables () {
        String text = docx.getTables().stream()
                .flatMap(t -> t.getRows().stream())
                .flatMap(r -> r.getTableCells().stream())
                .map(c -> c.getText().trim())
                .filter(s -> !s.isEmpty())
                .collect(Collectors.joining("\n"));

        System.out.println(text);
    }
}
