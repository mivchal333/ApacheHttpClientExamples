import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;


public class SimpleJsonGet {
    public static void main(String[] args) throws IOException {
        String apiURL = "https://restcountries.eu/rest/v2/name/poland";

        String jsonString = IOUtils.toString(new URL(apiURL), Charset.forName("UTF-8"));
        jsonString = jsonString.substring(1, jsonString.length() - 1);

        JSONObject obj = new JSONObject(jsonString);
        String area = obj.get("area").toString();
        System.out.println("Polska ma " + area + " km2 powierzchni!");
        JSONArray languagesArr = (JSONArray) obj.get("languages");
        JSONObject languages = (JSONObject) languagesArr.get(0);
        String nativeLanguage = languages.get("nativeName").toString();
        System.out.println("Natywnym językiem w Polsce jest: " + nativeLanguage);
    }
}
