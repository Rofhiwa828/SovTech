package utilities;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static utilities.HelperMethods.WriteToJsonFile;

public class CardIssuanceJsonController {


    private static final String jsonPath = "PayLoads/CombiPayLoads/Combi.json";
    public static void SetParameter(String key, String value){


        JSONObject parameterJsonObject = null;
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(jsonPath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONObject jsonObject = new JSONObject(content);
        if (key.equalsIgnoreCase("clientCode")){
            parameterJsonObject = jsonObject.getJSONObject("CCS884I").getJSONObject("inputArea").getJSONObject("genericInput");
        }
        else if (key.equalsIgnoreCase("nominatedCQAccount")){
            parameterJsonObject = jsonObject.getJSONObject("CCS884I").getJSONObject("inputArea").getJSONObject("newIssuanceInput");
        }
        assert parameterJsonObject != null;
        parameterJsonObject.put(key, value);
        WriteToJsonFile(jsonObject.toString(), jsonPath);
    }

    public static String ReadCombiOutPut(String responseBody){

        JSONObject jsonObject = new JSONObject(responseBody);
        JSONArray jsonParameter = jsonObject.getJSONObject("CCS884O").getJSONObject("outputArea").getJSONArray("combiDataList");
        JSONObject responseMessageIndex = jsonParameter.getJSONObject(0);
        return String.valueOf(responseMessageIndex.getLong("outCombiNumber"));
    }

    public static String ReadErrorMessage(String responseBody){

        JSONObject jsonObject = new JSONObject(responseBody);
        JSONArray jsonParameter = jsonObject.getJSONObject("NBSMSGO3").getJSONObject("outputErrorMessage").getJSONArray("messageEntry");
        JSONObject responseMessageIndex = jsonParameter.getJSONObject(0);
        return responseMessageIndex.getString("messageText");
    }

    public static String JsonBody(){

        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(jsonPath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONObject jsonObject = new JSONObject(content);
        return jsonObject.toString();
    }
}
