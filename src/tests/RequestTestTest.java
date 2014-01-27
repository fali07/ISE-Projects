package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Code.Request;

public class RequestTestTest {

	@Test
	public void testTest() {
		
			String requestResource = "Drive A";
			String requestCommand = "Format";
			Request myRequest = new Request(requestResource, requestCommand);
			
			String requestCommandReturned = myRequest.getCommand();
			
			assertEquals("Command corrupt", requestCommand, requestCommandReturned);
		}
		
	}


