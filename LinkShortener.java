package Program1;


import java.util.HashMap;
import java.util.Scanner;

public class LinkShortener {
    private static final String BASE62_CHARS = "ruhithakochuri1234567890123455qwertyuibmnkjoueqwtyuhjncghjkotd";
    private static final int BASE = BASE62_CHARS.length();

    private static HashMap<String, String> urlMap = new HashMap<>();
    private static long counter = 1;

    public static String shortenLink(String longUrl) {
        long urlId = generateUniqueId(longUrl);
        String shortUrl = base62Encode(urlId);
        urlMap.put(shortUrl, longUrl);
        return "http://short.url/" + shortUrl;  
    }

    public static String getLongUrl(String shortUrl) {
        return urlMap.get(shortUrl);
    }

    private static long generateUniqueId(String longUrl) {
        return longUrl.hashCode();
    }

    private static String base62Encode(long num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.insert(0, BASE62_CHARS.charAt((int) (num % BASE)));
            num /= BASE;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a long URL (or type 'exit' to quit): ");
            String longUrl = scanner.nextLine();

            if ("exit".equalsIgnoreCase(longUrl)) {
                break;
            }

            String shortUrl = shortenLink(longUrl);
            System.out.println("Shortened URL: " + shortUrl);
            System.out.println("Original URL: " + getLongUrl(shortUrl));
        }

        scanner.close();
    }
}

