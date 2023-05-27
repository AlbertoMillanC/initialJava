import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomWordGenerator {

    private static final String API_KEY = "YOUR_API_KEY";
    private static final int WORDS_COUNT = 100;

    private List<String> words;

    public RandomWordGenerator() {
        words = new ArrayList<>();
    }

    public void fetchWordsFromAPI() throws IOException {
        URL url = new URL("https://wordsapiv1.p.rapidapi.com/words/?random=true&hasDetails=definitions&limit=" + WORDS_COUNT);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("X-RapidAPI-Key", API_KEY);

        int responseCode = conn.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            Scanner scanner = new Scanner(conn.getInputStream());
            StringBuilder response = new StringBuilder();
            while (scanner.hasNextLine()) {
                response.append(scanner.nextLine());
            }
            scanner.close();

            String jsonResponse = response.toString();

            // Parse the JSON response to extract words
            // Modify this code depending on the JSON structure returned by the API
            // This is just an example assuming the JSON response is an array of words
            // with "word" as the key
            jsonResponse = jsonResponse.substring(1, jsonResponse.length() - 1);
            String[] wordArray = jsonResponse.split(",");
            for (String word : wordArray) {
                words.add(word.trim().replaceAll("\"", ""));
            }
        }

        conn.disconnect();
    }

    public String generateRandomWord() {
        if (words.isEmpty()) {
            throw new IllegalStateException("The word list is empty. Load a dictionary before generating random words.");
        }
        Random random = new Random();
        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }

    public static void main(String[] args) {
        RandomWordGenerator generator = new RandomWordGenerator();

        try {
            generator.fetchWordsFromAPI();

            String randomWord = generator.generateRandomWord();
            System.out.println("Random word: " + randomWord);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
