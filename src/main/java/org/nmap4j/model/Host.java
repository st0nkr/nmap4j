package org.nmap4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Host {

	
	private ArrayList<Port> portData = new ArrayList<Port>() ;

	public ArrayList<Port> getPortData() {
		return portData;
	}

	public void setPortData(ArrayList<Port> portData) {
		this.portData = portData;
	}
	
	public void addPortData( Port port ) {
		portData.add( port ) ;
	}
}
