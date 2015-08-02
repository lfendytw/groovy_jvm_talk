import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class Person {
  private String name;
  private String dob;
  private String gender;
  private Map<String, Integer> timesVisited;

  public Person(String name, String dob, String gender){
    this.name = name;
    this.dob = dob;
    this.gender = gender;
    this.timesVisited = new HashMap<String, Integer>();
    this.timesVisited.put("Melbourne",5);
    this.timesVisited.put("Sydney",2);
    this.timesVisited.put("Brisbane",7);
    this.timesVisited.put("Adelaide",3);
    /*
    this.timesVisited = new HashMap<String, Integer>(){{
      put("Melbourne",5);
      put("Sydney",2);
      put("Brisbane",7);
      put("Adelaide",3);
    }};
     * */
  }

  public String getName(){
    return this.name;
  }

  public String getDob(){
    return this.dob;
  }

  public String getGender(){
    return this.gender;
  }

  public void addLocationVisited(String location){
    timesVisited.put(location,timesVisitedLocation(location)+1);
  }

  public int timesVisitedLocation(String location){
    Integer toReturn = timesVisited.get(location);
    return toReturn == null ? 0 : toReturn;
  }

  public Set<String> locationsVisitedMoreThan(int limit){
    Map<String, Integer> collect = timesVisited.entrySet()
      .parallelStream()
      .filter(e -> e.getValue() > limit)
      .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    return collect.keySet();
  }
}
