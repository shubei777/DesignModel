package Model.Bri;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class XMLUtilPen {
    public static Object getBean(String args) {
        try {
            // 读取 XML 配置文件
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(new File("D:\\idea\\practice\\src\\Model\\Bri\\config.xml"));

            NodeList nl = doc.getElementsByTagName("bean");
            String className = null;

            // 遍历 XML 找到对应的 bean
            for (int i = 0; i < nl.getLength(); i++) {
                Element element = (Element) nl.item(i);
                if (element.getAttribute("id").equals(args)) {
                    className = element.getAttribute("class");
                    break;
                }
            }

            // 反射创建对象
            Class<?> c = Class.forName(className);
            return c.getDeclaredConstructor().newInstance();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
