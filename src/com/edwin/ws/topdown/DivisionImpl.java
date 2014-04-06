package com.edwin.ws.topdown;

import javax.jws.WebService;

@WebService(portName="divicion_Port", serviceName="DivicionServices", endpointInterface="com.edwin.ws.topdown.Division_PortType", targetNamespace="http://www.example.org/divicion/")
public class DivisionImpl implements Division_PortType {

	@Override
	public Integer division(Integer numeroPar, Integer divisorPar) {
		return numeroPar/divisorPar;
	}

}
