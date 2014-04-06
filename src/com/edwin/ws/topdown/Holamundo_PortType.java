package com.edwin.ws.topdown;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;


@WebService(name="Holamundo_PortType", targetNamespace="http://www.example.org/holamundo/")
@SOAPBinding(parameterStyle = ParameterStyle.WRAPPED)
public interface Holamundo_PortType {
	
	@WebMethod(action="http://www.example.org/holamundo/NewOperation")
	@WebResult(name="result", partName="result", targetNamespace="http://www.example.org/holamundo/")
	public String mensaje(@WebParam(name="mensajeParameter") String mensajeParameter);

}
