package example.microservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="miServicio")
public class micro {

	@WebMethod()
	public String sayHello(@WebParam(name="nombre") String name) {
	    System.out.println("Hello: " + name);
	    return "Hello " + name + "!";
	}
	
	@WebMethod()
	public int sumar(@WebParam(name="valor1") int a,@WebParam(name="valor2") int b) {
	    System.out.println("sumar: " + (a+b));
	    return (a+b);
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
