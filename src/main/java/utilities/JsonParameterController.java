package utilities;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonParameterController {

    public static String SetCreateAndLinkJsonParameter(String key, String value){

        String jsonPath = "PayLoads/ChequesPayLoads/CreateAndLinkAccount.json";
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get("PayLoads/ChequesPayLoads/CreateAndLinkAccount.json")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONObject jsonObject = new JSONObject(content);
        JSONObject parameterJsonObject = jsonObject.getJSONObject("CQS411I").getJSONObject("CQN411I_INPUT_AREA");
        parameterJsonObject.put(key, value);
        WriteToJsonFile(jsonObject.toString(), jsonPath);
        return jsonObject.toString();
    }

    public static String SetCreateAndLinkJsonParameter(String key, int value){

        String jsonPath = "PayLoads/ChequesPayLoads/CreateAndLinkAccount.json";
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(jsonPath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONObject jsonObject = new JSONObject(content);
        JSONObject parameterJsonObject = jsonObject.getJSONObject("CQS411I").getJSONObject("CQN411I_INPUT_AREA");
        parameterJsonObject.put(key, value);
        WriteToJsonFile(jsonObject.toString(), jsonPath);
        return jsonObject.toString();
    }

    private static void WriteToJsonFile(String jsonObject, String path){

        try {
            FileWriter file = new FileWriter(path);
            file.write(jsonObject);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String ReadResponseMessage(String responseBody){

        JSONObject jsonObject = new JSONObject(responseBody);
        JSONArray jsonParameter = jsonObject.getJSONObject("MSGO").getJSONObject("NBSMSGO3").getJSONArray("NBNMSGO3_MSG_ENTRY");
        JSONObject responseMessageIndex = jsonParameter.getJSONObject(0);
        return responseMessageIndex.getString("NBNMSGO3_MSG_TXT");
    }


    public static String JsonBody(){

        String jsonPath = "PayLoads/CombiPayLoads/Combi.json";
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
