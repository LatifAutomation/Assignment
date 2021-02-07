package Assignment.Assignment;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

	public static void main(String[] args) {
		 <!-- https://mvnrepository.com/artifact/io.rest-assured/rest-assured -->
		<dependency>
		    <groupId>io.rest-assured</groupId>
		    <artifactId>rest-assured</artifactId>
		    <version>4.0.0</version>
		    <scope>test</scope>
		</dependency>
		    
		    <!-- https://mvnrepository.com/artifact/org.testng/testng -->
		<dependency>
		    <groupId>org.testng</groupId>
		    <artifactId>testng</artifactId>
		    <version>6.14.3</version>
		    <scope>test</scope>
		</dependency>
		<!-- https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple -->
		<dependency>
		    <groupId>com.googlecode.json-simple</groupId>
		    <artifactId>json-simple</artifactId>
		    <version>1.1.1</version>
		</dependency>
		
		    <!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
		<dependency>
		    <groupId>org.apache.poi</groupId>
		    <artifactId>poi</artifactId>
		    <version>4.1.0</version>
		</dependency>
		    <!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
		<dependency>
		    <groupId>org.apache.poi</groupId>
		    <artifactId>poi-ooxml</artifactId>
		    <version>4.1.0</version>
		</dependency>
		    
	}
}
