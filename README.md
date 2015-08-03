gradle init --type java-library












# Things to go through
- Setting context on Groovy. Trends on Google and GitHub
- Tools that use Groovy
- Where does Groovy live in the TW tech radar
- What's a normal stack in Groovy
- What's the TDD stack in Groovy (Spock, JUnit, whatevs)
- Evolution of Groovy (meta object and static compilation)
- What is considered idiomatic Groovy (mention interesting things as we write Groovy)
- Installing groovy with GVM
- Creating a new project with Gradle
- AST (Abstract syntax tree)
    - Delegate, Immutable, Grab annotations
- Assertions
- Inline list, map declaration
- Object instantiation
    - What happens with no privacy modifier?
- Manipulation of collections
- Java interop
- Deciding what method to run: compile time vs runtime
-  Groovy strings
- Benchmarking
        - Runtime binding vs static binding



# AGENDA
- INTRODUCTION (John)
------------------
- Set context. What is Groovym trends (github, google), TechRadar
- Tech/Testing stack. GVM/Gradle, discuss tools. 

- DEMONSTRATION
------------------

- Install GVM, Groovy and Gradle. Do gradle init (Fendy)

  http://gvmtool.net/
  curl -s get.gvmtool.net | bash

  gradle init --type groovy-library

- Copy java class over to Groovy project and rename it to .groovy (Fendy)
    - Keep old java class. Gradle can co-compile Java & Groovy

    - Java class to include:
    - Show POJO. Convert to POGO (Fendy)
        - Talk about default access. Java is package, Groovy is private with getter/setter
        - Talk about Groovy aliases for getting/setting. object.thing -> object.getThing()

    - Take a list of key value pair and create a map (John)

    - Taking a map and instansiating an object from it (Fendy)

    - Finding elemens in a collection matching a condition (John)
        - Talk about closure in Groovy. Functions as first class citizens
        - Use method that takes a person and tells you if the person exists in the collection (to demo @EqualsAndHashCode)

    - Generate formatted string "Blah blah {number/object}" (Fendy)


    - A demo of run vs compile time method calls (John)
        - Lead into performance discussion/comparison

- Start converting methods into Groovy one by one.
