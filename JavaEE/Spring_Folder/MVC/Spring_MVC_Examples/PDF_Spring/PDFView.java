package mypack;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import mypack.Employee;

public class PDFView extends AbstractPdfView {
 protected void buildPdfDocument(Map model,
   Document document, PdfWriter writer, HttpServletRequest req,
   HttpServletResponse resp) throws Exception {
  
  List<Employee> emplist = (List<Employee>) model.get("mylist");
  
  Paragraph header = new Paragraph(new Chunk("Generate Pdf USing Spring Mvc",FontFactory.getFont(FontFactory.HELVETICA, 30)));
  document.add(header);
  Iterator<Employee> itr=emplist.iterator();
  
  while(itr.hasNext())
  {
	  Employee temp=(Employee)itr.next();
	  Paragraph by1 = new Paragraph(new Chunk("First_Name       "+temp.getFirstName(),FontFactory.getFont(FontFactory.HELVETICA, 20)));
  Paragraph by2 = new Paragraph(new Chunk("Second_Name      "+temp.getLastName(),FontFactory.getFont(FontFactory.HELVETICA, 20)));
     
  document.add(by1);
  document.add(by2);
  document.add(Chunk.NEWLINE);
  }

 }

}
