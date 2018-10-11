package com.form.pdf;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.*;
import java.io.File;
import java.util.*;

public class PdfFormFiller {

    public static void listFields(PDDocument doc) throws Exception {
        PDDocumentCatalog catalog = doc.getDocumentCatalog();
        PDAcroForm form = catalog.getAcroForm();
        List<PDField> fields = form.getFields();

        for(PDField field: fields) {
            System.out.println(field.getKids()+"\t\t"+field.getFullyQualifiedName()+"\t\t"+field.getValue());
        }
    }

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\nkumar136\\Downloads\\fw7.pdf");
        PDDocument doc = PDDocument.load(file);
        listFields(doc);
    }

}
