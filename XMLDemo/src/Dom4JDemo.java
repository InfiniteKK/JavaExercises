import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class Dom4JDemo {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("XML//xml-schema.xml"));
        Element rootEle = document.getRootElement();
        List<Element> beanElements =  rootEle.elements();
        for (Element beanElement:beanElements){
            String idValue = beanElement.attributeValue("id");
            String classNameValue = beanElement.attributeValue("className");
            System.out.println(idValue +"==>"+ classNameValue);
            List<Element> propertyElements = beanElement.elements();
            for (Element propertyElement:propertyElements) {
                String valueValue = propertyElement.attributeValue("value");
                System.out.println(valueValue);

            }

        }
    }
}
