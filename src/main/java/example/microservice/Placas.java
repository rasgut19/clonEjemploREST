package example.microservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name ="placas")
public class Placas {

	@WebMethod()
	public String sayHello(String name) {
	    System.out.println("Hello: " + name);
	    return "Hello " + name + "!";
	}
	
	@WebMethod()
	public String verificarPlaca(@WebParam(name="placa") String placa) {
	    System.out.println("Placa ingresada: " + placa);
	    String mensajeRetorno = "OK";
	    if("1234".equals(placa)){	
	    	mensajeRetorno = "La placa "+placa +" es robada";
	    }
	    return mensajeRetorno;
	}
}
