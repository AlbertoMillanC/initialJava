import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherAPIConsumer {
    public static void main(String[] args) {
        String apiUrl = "https://api.weatherapi.com/v1/current.json?key=YOUR_API_KEY&q=Bogota";
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .build();
        
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                String responseBody = response.body();
                System.out.println(responseBody);
                // Process the weather data as needed
            } else {
                System.out.println("Error: " + response.statusCode());
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

