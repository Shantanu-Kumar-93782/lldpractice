package com.practice.fascade;



/* *
 * Here we have hidden all the internal implementations from the outside world
 * 
 * Caller just needs to message and target, this is loosely coupled as caller is not
 * 
 * dependent on AuthToken, Message Class
 * 
 * Only one method is exposed for sending the communication.
 * */
public class NotificationService {

	public String send(String message, String target) {
		Connection connection = new Connection();
		AuthToken authToken = new AuthToken(connection.connect(target));
		send(authToken, new Message(message), target);
		connection.disconnect(target);
		return "Completed";

	}

	private void send(AuthToken authToken, Message message, String target) {
		System.out.println("sending");
	}
}
