import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class http {
  private static HttpURLConnection con;


  public static void main(String[] args) throws IOException {
  //https://jsonmock.hackerrank.com/api/movies/search/?Title=spiderman
//    var url = "https://jsonmock.hackerrank.com/api/movies/search/?Title="+"spiderman";

    try {

      URL url =  new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title="+"spiderman");
      con = (HttpURLConnection) url.openConnection();

      con.setRequestMethod("GET");

      StringBuilder content;

      try (BufferedReader in = new BufferedReader(
              new InputStreamReader(con.getInputStream()))) {

        String line;
        content = new StringBuilder();

        while ((line = in.readLine()) != null) {

          content.append(line);
          content.append(System.lineSeparator());
        }
      }

      System.out.println(content.toString());

    } finally {

      con.disconnect();
    }
  }
}
