package kz.narxoz.patterns.adapter;

import org.json.simple.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class JSONReaderXMLAdapter implements JSONReaderTemplate{

    private NodeList users = null;
    public JSONReaderXMLAdapter(String filename) throws ParserConfigurationException, IOException, SAXException {
        File inputFile = new File(filename);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();
        //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
        users = doc.getElementsByTagName("user");
    }

    @Override
    public JSONObject getUserByName(String firstName) {
        JSONObject jsonObject = new JSONObject();

        for (int temp = 0; temp < users.getLength(); temp++) {
            Node nNode = users.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                String foundName = eElement.getElementsByTagName("firstname").item(0).getTextContent();
                if (foundName.equals(firstName)) {
                    jsonObject.put("id",eElement.getAttribute("id"));
                    jsonObject.put("firstname",foundName);
                    jsonObject.put("lastname",eElement.getElementsByTagName("lastname").item(0).getTextContent());
                    jsonObject.put("nickname",eElement.getElementsByTagName("nickname").item(0).getTextContent());
                    jsonObject.put("age",eElement.getElementsByTagName("age").item(0).getTextContent());
                    return jsonObject;
                }
            }
        }
        return null;
    }

    @Override
    public JSONObject getUserById(int id) {
        JSONObject jsonObject = new JSONObject();

        for (int temp = 0; temp < users.getLength(); temp++) {
            Node nNode = users.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                int foundId = Integer.parseInt(eElement.getAttribute("id"));
                if (foundId==id) {
                    jsonObject.put("id",foundId);
                    jsonObject.put("firstname",eElement.getElementsByTagName("firstname").item(0).getTextContent());
                    jsonObject.put("lastname",eElement.getElementsByTagName("lastname").item(0).getTextContent());
                    jsonObject.put("nickname",eElement.getElementsByTagName("nickname").item(0).getTextContent());
                    jsonObject.put("age",eElement.getElementsByTagName("age").item(0).getTextContent());
                    return jsonObject;
                }
            }
        }
        return null;
    }

    @Override
    public void printAllUsers() {
        for (int temp = 0; temp < users.getLength(); temp++) {
            Node nNode = users.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                System.out.println("ID\t\t\t:\t" + eElement.getAttribute("id"));
                System.out.println("FirstName\t:\t" + eElement.getElementsByTagName("firstname").item(0).getTextContent());
                System.out.println("LastName\t:\t" + eElement.getElementsByTagName("lastname").item(0).getTextContent());
                System.out.println("NickName\t:\t" + eElement.getElementsByTagName("nickname").item(0).getTextContent());
                System.out.println("Age\t\t\t:\t" + eElement.getElementsByTagName("age").item(0).getTextContent());
                System.out.println();
            }
        }
    }
}