package Code;

import Code.Handler;
import Code.Request;

public class DriveBHandler extends Handler {
	private String status;

	public DriveBHandler(String status) {
		this.status = status;
	}


	/* (non-Javadoc)
	 * @see code.Handler#handleRequest(code.Request)
	 */
	@Override
	public Boolean handleRequest(Request request) {
		String resource = "Drive B";

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















