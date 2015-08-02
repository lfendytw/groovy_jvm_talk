import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Utils {

  public static Map<String, String> listToMap(List<String> list) {
    Map<String, String> result = new HashMap<String, String>();
    result.put(list.get(0), list.get(1));
    for (int i = 0; i < list.size() - 1; i += 2) {
      result.put(list.get(i), list.get(i + 1));
    }
    return result;
  }

}
