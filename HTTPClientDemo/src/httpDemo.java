import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class httpDemo {

  public static void main(String[] args) throws IOException, InterruptedException {
    System.out.println(getMovies());
  }

  public static String getMovies() throws IOException, InterruptedException {
    String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title="+"spiderman";

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .header("Content-Type", "application/json")
            .uri(URI.create(url))
            .build();
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

    return response.body();
  }

}
