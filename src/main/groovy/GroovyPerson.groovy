class GroovyPerson {
  String name
  String dob
  String gender
  private Map<String, Integer> timesVisited;

   GroovyPerson() {}

  public void addLocationVisited(String location){
    timesVisited.put(location,timesVisitedLocation(location)+1);
  }

  public int timesVisitedLocation(String location){
    Integer toReturn = timesVisited.get(location);
    return toReturn == null ? 0 : toReturn;
  }

}

