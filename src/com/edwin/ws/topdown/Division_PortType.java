package com.edwin.ws.topdown;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;

@WebService(name="Divicion_PortType", targetNamespace="http://www.example.org/divicion/", wsdlLocation="../wsdl.division.xml")
@SOAPBinding(parameterStyle = ParameterStyle.WRAPPED)
public interface Division_PortType {
	
	@WebMethod(action="http://www.example.org/divicion/NewOperation", operationName="division")
	@WebResult(name="result", partName="resultado")
	public Integer division(@WebParam(name="numero", partName="numeroPar")Integer numeroPar, 
			@WebParam(name="divisor", partName="divisorPar")Integer divisorPar);
	
}