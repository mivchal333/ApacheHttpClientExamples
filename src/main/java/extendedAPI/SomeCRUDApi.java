package extendedAPI;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Optional;

public class SomeCRUDApi {
    public String mainApiURL = "https://reqres.in";

    public static void main(String[] args) throws IOException {
//        System.out.println(getUserById(2).isPresent());

    }

//    private static Optional<User> getUserById(Integer userId) throws IOException {
//        Optional<User> optUser;
//        User user = null;
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//        HttpGet httpGet = new HttpGet("https://reqres.in/api/users/" + userId);
//        try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
//            int statusCode = response.getStatusLine().getStatusCode();
//            if (statusCode != 200) return Optional.empty();
//            String jsonString = EntityUtils.toString(response.getEntity());
//            JSONObject jsonObject = new JSONObject(jsonString);
//            user = new User(jsonObject);
//            return Optional.ofNullable(user);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return Optional.empty();
//    }
}
