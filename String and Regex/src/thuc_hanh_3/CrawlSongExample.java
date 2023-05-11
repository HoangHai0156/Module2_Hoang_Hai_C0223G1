package thuc_hanh_3;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    private static final String SONG_REGEX = "name_song\"\\stitle=\"(.*?)\"\\sonclick";
//    private static final String SONG_REGEX = "name_song\">(.*?)</a>";
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
        try(Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));) {
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            content = content.replace("\\n+","");
            Pattern pattern = Pattern.compile(SONG_REGEX);
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()){
                System.out.println(matcher.group(1));
            }
        }

    }

}
