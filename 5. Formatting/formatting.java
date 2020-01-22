// formatting.java

// --------- Vertical Density ---------

// TODO: Refactore in order to increase density and readability

public class ReporterConfig {
  /**
  * The class name of the reporter listener
  */
  private String m_className;
  /**
  * The properties of the reporter listener
  */
  private List<Property> m_properties = new ArrayList<Property>();
 
  public void addProperty(Property property) {
    m_properties.add(property);
 }
}

// --------- Instance variables ---------

// TODO: Refactore in order to increase readability
// All variables should be declared at the top of the class. Everybody should know 
// where to go to see the declaration

public class TestSuite implements Test {
  static public Test createTest(Class << ? extends TestCase > theClass,
      String name) {
       //...
  }

  public static Constructor <? extends TestCase >
  getTestConstructor(Class << ? extends TestCase > theClass)
  throws NoSuchMethodException {  
    //...
  }

  public static Test warning(final String message) {  
    //...
  }

  private static String exceptionToString(Throwable t) {  
    //...
  }

  private String fName;
  private Vector <Test> fTests = new Vector <Test>(10);

  public TestSuite() {}

  public TestSuite(final Class << ? extends TestCase > theClass) {  
    //...
  }

  public TestSuite(Class << ? extends TestCase > theClass, String name){  
    //...
  } 
  //...............
}
