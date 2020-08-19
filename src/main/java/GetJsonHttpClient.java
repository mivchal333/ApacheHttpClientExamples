import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class GetJsonHttpClient {
    public static void main(String[] args) throws IOException {
        String apiURL = "https://restcountries.eu/rest/v2/name/poland";

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(apiURL);
        CloseableHttpResponse response = httpClient.execute(httpGet);
        String jsonString = EntityUtils.toString(response.getEntity());

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
