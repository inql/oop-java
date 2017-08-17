/**
 * Created by Dawid on 10.07.2017.
 */
public class StringUtils {

    public static boolean included(String word, String searched)
    {
        searched = searched.trim();
        searched = searched.toUpperCase();
        word = word.toUpperCase();
        if(word.contains(searched))
            return true;
        else if(word.isEmpty() || searched.isEmpty())
            return false;
        else
            return false;
    }

}
