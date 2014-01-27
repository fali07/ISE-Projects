/**
 * 
 */
package Code;

/**
 * @author Oded
 *
 */
public class DriveAHandler extends Handler {

	private String status;

	public DriveAHandler(String status) {
		this.status = status;
	}

	/* (non-Javadoc)
	 * @see code.Handler#handleRequest(code.Request)
	 */
	@Override
	public Boolean handleRequest(Request request) {
		String resource = "Drive A";

		if (resource.equals(request.getResource())){
			request.setAnswer(status);
			return true;
		} else {
			if(handler != null){
				return this.handler.handleRequest(request);
			}
		}
		return false;
	}

}
