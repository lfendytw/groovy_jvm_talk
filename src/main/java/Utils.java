import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {

  public static Map<String, String> listToMap(List<String> list) {
    Map<String, String> result = new HashMap<String, String>();
    for (int i = 0; i < list.size() - 1; i += 2) {
      result.put(list.get(i), list.get(i + 1));
    }

    if (list.size() % 2 == 1) {
      result.put(list.get(list.size() - 1), null);
    }

    return result;
  }

  public static Person findJim(List<Person> people) {
    Person jim = people.stream().filter(x -> {return x.getName().equals("James Kirk");}).findFirst().get();
    return jim;
  }

  public static Integer doTheOverload(Object o) {
    System.out.println("Hey, I'm the object version of the method");
    return 1;
  }

  public static Integer doTheOverload(String s) {
    System.out.println("Hey, I'm the string version of the method");
    return 2;
  }

}
