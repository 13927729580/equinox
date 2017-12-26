package org.equinoxosgi.toast.client.emergency;

import org.equinoxosgi.toast.dev.airbag.IAirbag;
import org.equinoxosgi.toast.dev.airbag.IAirbagListener;
import org.equinoxosgi.toast.dev.gps.IGps;

public class EmergencyMonitor implements IAirbagListener {
	private IAirbag airbag;
	private IGps gps;

	@Override
	public void deployed() {

		System.out.println("Emergency occurrd at lat=" + gps.getLatitude() + " lon=" + gps.getLongitude() + " Heading="
				+ gps.getHeading() + " speed=" + gps.getSpeed());

	}
	
	public void setAirbag(IAirbag value) {
		airbag=value;
	}
	
	public void setGps(IGps value) {
		gps=value;
	}
	
	public void shutdown() {
		airbag.removeListener(this);
	}
	
	public void startup() {
		airbag.addListener(this);
	}
}
