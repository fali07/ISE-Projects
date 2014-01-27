/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Code.Handler;
import Code.DriveAHandler;
import Code.Request;

/**
 * @author Oded
 *
 */
public class DriveAHandlerTest {

	@Test
	public void test() {
		Handler classUnderTest = new DriveAHandler("Fail");

		Request request = new Request("Drive A","Format");

		Boolean actualOutput = classUnderTest.handleRequest(request);

		assertTrue("Handler failed to grab",actualOutput);
		
	}
	@Test
	public void test2(){
		
		Handler classUnderTest = new DriveAHandler("Fail");

		Request request = new Request("Drive B","Format");

		Boolean actualOutput = classUnderTest.handleRequest(request);

		assertTrue("Handler failed to grab",actualOutput);
		
	}

}
