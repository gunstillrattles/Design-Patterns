package kz.narxoz.patterns.adapter;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReader implements JSONReaderTemplate{

    private JSONParser jsonParser = null;
    private JSONObject jsonObject = null;
    private JSONArray users = null;

    JSONReader(String filename) throws IOException, ParseException {
        FileReader reader = new FileReader(new File(filename));
        jsonParser = new JSONParser();
        jsonObject = (JSONObject) jsonParser.parse(reader);
        users = (JSONArray) jsonObject.get("users");

    }
    @Override
    public JSONObject getUserByName(String firstName) {
        for (int i = 0; i < users.size(); i++) {
            JSONObject user = (JSONObject) users.get(i);
            String foundName = (String)user.get("firstname");
            if (foundName.equals(firstName)) {
                return user;
            }
        }
        return null;
    }
    @Override
    public JSONObject getUserById(int id) {
        for (int i = 0; i < users.size(); i++) {
            JSONObject user = (JSONObject) users.get(i);
            long foundId = (long)user.get("id");
            if ((int)foundId == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void printAllUsers(){
        for (int i = 0; i < users.size(); i++) {
            JSONObject user = (JSONObject) users.get(i);
            System.out.println("ID\t\t\t:\t" + user.get("id"));
            System.out.println("FirstName\t:\t" + user.get("firstname"));
            System.out.println("LastName\t:\t" + user.get("lastname"));
            System.out.println("Age\t\t\t:\t" + user.get("age"));
            System.out.println();
        }
    }
}