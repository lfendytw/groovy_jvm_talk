import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {

  public static Map<String, String> listToMap(List<String> list) {
    Map<String, String> result = new HashMap<String, String>();
    result.put(list.get(0), list.get(1));
    for (int i = 0; i < list.size() - 1; i += 2) {
      result.put(list.get(i), list.get(i + 1));
    }
    return result;
  }

  public static Person findJim(List<Person> people) {
    Person jim = people.stream().filter(x -> {return x.getName().equals("James Kirk");}).findFirst().get();
    return jim;
  }

}
