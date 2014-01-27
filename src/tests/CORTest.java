package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Code.DriveAHandler;
import Code.DriveBHandler;
import Code.Handler;
import Code.Request;

public class CORTest {

	@Test
	public void test() {
        Request request = new Request("Drive A","Format");
        
        Handler headDriveAHandler = new DriveAHandler("Fail");
        Handler driveBHandler = new DriveBHandler("Active"); 
       
        headDriveAHandler.setHandler(driveBHandler);
        
        Boolean actualOutput = headDriveAHandler.handleRequest(request);
        
        assertTrue("Handler failed to grab",actualOutput);
	}

}
