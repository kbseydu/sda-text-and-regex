package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample4 {
    public static void main(String[] args) {
        String text = "How much wood should I buy?";
        Pattern pattern = Pattern.compile(".*([wW]\\w*)(.*)");
        Matcher matcher = pattern.matcher(text);

        if(matcher.matches()){
            int groupCount = matcher.groupCount();
            for(int i=0;i<=groupCount;i++){
                System.out.printf("grupa nr %d: %s\n",i,matcher.group(i));
            }
        }
    }
}
