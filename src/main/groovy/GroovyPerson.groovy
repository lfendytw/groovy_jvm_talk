 class GroovyPerson {
   String name
   String dob
   String gender

   GroovyPerson(String name, String dob, String gender){
    this.name = name
    this.dob = dob
    this.gender = gender
  }

   String getName(){
    return this.name
  }

   String getDob(){
    return this.dob
  }

   String getGender(){
    return this.gender
  }
}

