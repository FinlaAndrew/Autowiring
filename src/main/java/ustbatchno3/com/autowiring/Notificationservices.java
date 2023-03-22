package ustbatchno3.com.autowiring;

public class Notificationservices {
	private Messageservices messageservices ;
	public void Notify(){
		messageservices.sendmessages("Hey I'am Autowired.");
		}
	
	@Override
	public String toString() {
		return "Notificationservices [messageservices=" + messageservices + "]";
	}

	public void setMessageservices(Messageservices messageservices) {
		this.messageservices = messageservices;
	}
	

}
