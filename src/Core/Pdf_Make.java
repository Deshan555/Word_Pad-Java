package Core;

import com.itextpdf.text.Document;

import com.itextpdf.text.Paragraph;

import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class Pdf_Make
{
    static String display_data;
    
    public static void PDF(String author,String subject,String title,String file_name,String data_)
    {
        Document document = new Document();

        try
        {
            PdfWriter pdfWriter = PdfWriter.getInstance(document,new FileOutputStream(file_name+".pdf"));

            document.open();

            String data = data_;

            Paragraph paragraph = new Paragraph(data);

            document.add(paragraph);

            document.addAuthor(author);

            document.addSubject(subject);

            document.addCreationDate();

            document.addTitle(title);
                        
            document.close();

            System.out.println("OK!!");
        }
        catch(Exception Error)
        {

        }
    }
}