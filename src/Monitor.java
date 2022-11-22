//Monitor method of on off details
public class Monitor {
    
	public boolean isOn;
	//monitor On 
	public void start() {
		isOn=true;
	}
	//monitor off
    public void shutdown() {
    	isOn=false;
}
}