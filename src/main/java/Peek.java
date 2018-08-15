import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class Peek {

    private boolean isPublic (String url){
        String content = null;
        URLConnection connection = null;
        try {
            connection =  new URL(url).openConnection();
            Scanner scanner = new Scanner(connection.getInputStream());
            scanner.useDelimiter("\\Z");
            content = scanner.next();
        }catch ( Exception ex ) {
            ex.printStackTrace();
        }
        return content.contains("is_private\":true");
    }

}
