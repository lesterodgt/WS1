/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author lesterod
 */
@WebService(serviceName = "WS1")
public class WS1 {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "nombre") String nombre,@WebParam(name = "edad") int edad) {
        return "Hello " + nombre +edad+ " !";
    }
}
