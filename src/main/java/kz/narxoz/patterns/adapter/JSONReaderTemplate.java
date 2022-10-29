package kz.narxoz.patterns.adapter;

import org.json.simple.JSONObject;

public interface JSONReaderTemplate {
    public JSONObject getUserByName(String firstName);
    public JSONObject getUserById(int id);
    public void printAllUsers();
}