package com.edwin.ws.topdown;

import javax.jws.WebService;

@WebService(portName="holamundoSOAP", serviceName="holamundoServices", targetNamespace="http://www.example.org/holamundo/", endpointInterface="com.edwin.ws.topdown.Holamundo_PortType", wsdlLocation="../wsdl/holamundo.wsdl")
public class HolaMundoImpl implements Holamundo_PortType {

	@Override
	public String mensaje(String mensajeParameter) {
		return "klk";
	}

}
