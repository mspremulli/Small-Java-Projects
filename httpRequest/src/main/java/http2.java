import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.*;

public class http2 {
  private static HttpURLConnection conn;

  public static void main(String[] args) throws IOException {
    System.out.println(Arrays.toString(getMovieTitles("spiderman")));
  }

  public static int getTotalPages(String json){
    JSONObject testJson = new JSONObject(json);
    return (int) testJson.get("total_pages");
//    int totalPages = Integer.parseInt(json.split("total_pages\":")[1].split(",")[0]);
//    System.out.println(totalPages);
//
//    return totalPages;
  }

  public static String[] getMovieTitles(String substr) throws ProtocolException, MalformedURLException {
    ArrayList<String> movieTitles = new ArrayList<>();
    String line = "";

    try{
      URL url = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr);

      conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod("GET");
      conn.setRequestProperty("Content-Type", "application/json");

      try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
        line = in.readLine();
        int totalPages = getTotalPages(line);

//        for (int pageNumber = 1; pageNumber <= totalPages; pageNumber++) {

//          url = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr + "&pagenumber="+ pageNumber);
//          conn = (HttpURLConnection) url.openConnection();
//          conn.setRequestMethod("GET");
//          conn.setRequestProperty("Content-Type", "application/json");

//          line = in.readLine();
//          System.out.println(line);

          String[] titleList = line.split("Title\":\"");
          for (int i = 1; i < titleList.length; i++) {
            movieTitles.add(titleList[i].split("\"")[0]);
          }
//        }

      }

      finally{
        conn.disconnect();
      }

    } catch (IOException e) {
      e.printStackTrace();
    }

    String[] answer = new String[movieTitles.size()];
    for (int i = 0; i < movieTitles.size(); i++) {
      answer[i] = movieTitles.get(i);
    }

    Arrays.sort(answer);
    System.out.println(answer.length);
    return answer;

  }


}
