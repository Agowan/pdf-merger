import java.io.*;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfCopyFields;
import com.lowagie.text.Document;
import java.util.*;

// http://api.itextpdf.com/itext/com/itextpdf/text/pdf/PdfReader.html

public class PdfMerger
{
  public static void main(String [] args) throws Exception
  {
    // Parse the paths from Std in
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF8"));

    StringBuilder input = new StringBuilder();

    String line;
    while( (line=br.readLine()) != null) { input.append(line); }

    String [] paths = input.toString().split("\\s|\\,|\\;|\\:");

    //And now to the actual pdf merger

    Document document = new Document();

    PdfCopyFields copy = new PdfCopyFields(System.out);

    for(String path : paths)
      copy.addDocument(new PdfReader(path));

    copy.close();
  }
}