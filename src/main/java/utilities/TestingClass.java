package utilities;

import org.json.JSONArray;
import org.json.JSONObject;
import utilities.HelperMethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;

public class TestingClass {


    public static void main(String[] args) throws ParseException {


       System.out.println(HelperMethods.Get8DaysBeforeCurrentDate());

    }

    public static void ReadResponseMessageMessage(){

        String jsonPath = "PayLoads/CreateAndLinkAccountOutPut.json";
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(jsonPath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONObject jsonObject = new JSONObject(content);
        JSONObject parameterJsonObject = jsonObject.getJSONObject("MSGO").getJSONObject("NBSMSGO3");
        JSONArray recs = parameterJsonObject.getJSONArray("NBNMSGO3_MSG_ENTRY");

        JSONObject rec = recs.getJSONObject(0);
        String loc = rec.getString("NBNMSGO3_MSG_TXT");

        System.out.println(loc);
    }
}
