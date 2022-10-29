package kz.narxoz.patterns.adapter;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.SQLException;

public class JsonParserExecutor {
    public static void main(String[] args) throws IOException, ParseException, ParserConfigurationException, SAXException, SQLException, ClassNotFoundException {
        System.out.println("JSON READER");
        String filePath = "src/main/java/kz/narxoz/patterns/adapter/input.json";
        JSONReader jsonReader = new JSONReader(filePath);
        jsonReader.printAllUsers();

        System.out.println("XML TO JSON ADAPTOR : ");
        String xmlFile = "src/main/java/kz/narxoz/patterns/adapter/input.xml";
        JSONReaderXMLAdapter adapter = new JSONReaderXMLAdapter(xmlFile);
        adapter.printAllUsers();

        JSONObject jsonObject = jsonReader.getUserById(1);
        System.out.println(jsonObject);

        JSONObject jsonObject1 = jsonReader.getUserByName("Will");
        System.out.println(jsonObject1);

        JSONObject jsonObject2 = adapter.getUserByName("Will");
        System.out.println(jsonObject2);

        JSONObject jsonObject3 = adapter.getUserById(1);
        System.out.println(jsonObject3);

        DBReader dbReader = DBReader.getInstance();
        dbReader.getUserByName("John");
        dbReader.getUserById(1);
    }
}