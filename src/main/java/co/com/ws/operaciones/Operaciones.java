/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ws.operaciones;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.apache.log4j.Logger;

import co.com.ws.operaciones.dto.OperacionesResponse;
import co.com.ws.operaciones.impl.OperacionesService;
import co.com.ws.util.Constantes;

/**
 *
 * @author kmlo
 */
@WebService(serviceName = "Operaciones")
public class Operaciones extends OperacionesService {

    private static Logger logger = Logger.getLogger(Operaciones.class.getName());

    /**
     * Metodo qu elleva acabo la suma de dos variables
     *
     * @param parametro1
     * @param parametro2
     * @return
     */
    @WebMethod(operationName = "suma")
    public OperacionesResponse suma(@WebParam(name = "parametro1") Double parametro1, @WebParam(name = "parametro2") Double parametro2) {
        logger.info("Ejecucion metodo suma con parametros: [parametro1: " + parametro1 + ", parametro2: " + parametro2 + "]");
        return super.operaciones(parametro1, parametro2, Constantes.SUMA);
    }

    /**
     * Metodo qu elleva acabo la suma de dos variables
     *
     * @param parametro1
     * @param parametro2
     * @return
     */
    @WebMethod(operationName = "resta")
    public OperacionesResponse resta(@WebParam(name = "parametro1") Double parametro1, @WebParam(name = "parametro2") Double parametro2) {
        logger.info("Ejecucion metodo suma con parametros: [parametro1: " + parametro1 + ", parametro2: " + parametro2 + "]");
        return super.operaciones(parametro1, parametro2, Constantes.RESTA);
    }

    /**
     * Metodo qu elleva acabo la suma de dos variables
     *
     * @param parametro1
     * @param parametro2
     * @return
     */
    @WebMethod(operationName = "division")
    public OperacionesResponse division(@WebParam(name = "parametro1") Double parametro1, @WebParam(name = "parametro2") Double parametro2) {
        logger.info("Ejecucion metodo suma con parametros: [parametro1: " + parametro1 + ", parametro2: " + parametro2 + "]");
        return super.operaciones(parametro1, parametro2, Constantes.DIVISION);
    }

    /**
     * Metodo qu elleva acabo la suma de dos variables
     *
     * @param parametro1
     * @param parametro2
     * @return
     */
    @WebMethod(operationName = "multiplicacion")
    public OperacionesResponse multiplicacion(@WebParam(name = "parametro1") Double parametro1, @WebParam(name = "parametro2") Double parametro2) {
        logger.info("Ejecucion metodo suma con parametros: [parametro1: " + parametro1 + ", parametro2: " + parametro2 + "]");
        return super.operaciones(parametro1, parametro2, Constantes.MULTIPLICACION);
    }
}
