/**
 * 
 */
package Code;

/**
 * @author oded
 *
 */
public class Request {
	
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getResource() {
		return resource;
	}

	public String getCommand() {
		return command;
	}

	private String resource;
	private String command;
	private String answer;

	public Request(String requestResource, String requestCommand) {
		this.resource = requestResource;
		this.command = requestCommand;
	}
}
