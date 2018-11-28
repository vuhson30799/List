package RegularExpression;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlData {
    public static String REGEX_SONG = "name_song\".*?\"(.*?)\">(.*?) - (.*?)</a>";

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("<a class=\"name_song\" href=\"nct.com/concobebe\">Con co be be - Dung</a>");
        arr.add("<a class=\"name_song\" href=\"nct.com/backimthang\">Bac kim thang - Dung</a>");
        arr.add("<a class=\"name_song\" href=\"nct.com/hongkong1\">Hongkong1 - Son</a>");
        arr.add("<a class=\"name_song\" href=\"nct.com/lactroi\">Lac Troi - Loc</a>");
        arr.add("<a class=\"name_song\" href=\"nct.com/yeu\">Yeu - Vu</a>");
        for (String x :
                arr) {
            Pattern p = Pattern.compile(REGEX_SONG);
            Matcher m = p.matcher(x);
            while (m.find()){
                System.out.println(m.group(1) + " - " + m.group(2) + " - " + m.group(3));
            }
        }
    }
}
