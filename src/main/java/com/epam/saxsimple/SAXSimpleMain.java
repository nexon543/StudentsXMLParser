package com.epam.saxsimple;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;

public class SAXSimpleMain {
    public static void main(String[] args) {
        try
        {
            XMLReader reader = XMLReaderFactory.createXMLReader();
            SimpleStudentsHandler handler=new SimpleStudentsHandler();
            reader.setContentHandler(handler);
            reader.parse("data/students.xml");
        }
        catch (SAXException ex){
            System.err.println("XML parser error: "+ex);
        }
        catch (IOException e){
            System.err.println("IO error: "+e);
        }
    }

}
