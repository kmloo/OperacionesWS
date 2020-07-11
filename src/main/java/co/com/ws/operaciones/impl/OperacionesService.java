/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ws.operaciones.impl;

import org.apache.log4j.Logger;

import co.com.ws.operaciones.dto.OperacionesResponse;
import co.com.ws.util.Constantes;

/**
 *
 * @author desar
 */
public class OperacionesService {

    /**
     * Variable para el log de la aplicacion
     */
    private static Logger logger = Logger.getLogger(OperacionesService.class.getName());

    /**
     * Metodo que ejecuta la logica de la suma
     *
     * @param uno
     * @param dos
     * @param opcion
     * @return
     */
    protected OperacionesResponse operaciones(Double uno, Double dos, String opcion) {
        OperacionesResponse response = new OperacionesResponse();
        try {
        	switch(opcion) {
                case (Constantes.SUMA): {
                    response.setRespuesta((uno + dos));
                    response.setMensaje("Suma exitosa.");
                    response.setCodigo("200");
                    break;
                }
                case (Constantes.RESTA): {
                    response.setRespuesta((uno - dos));
                    response.setMensaje("Resta exitosa.");
                    response.setCodigo("200");
                    break;
                }
                case (Constantes.DIVISION): {
                    response.setRespuesta((Double)(uno / dos));
                    response.setMensaje("División exitosa.");
                    response.setCodigo("200");
                    break;
                }
                case (Constantes.MULTIPLICACION): {
                    response.setRespuesta((uno * dos));
                    response.setMensaje("Multiplicación exitosa.");
                    response.setCodigo("200");
                    break;
                }
                default: {
                    break;
                }
            }
        } catch (Exception ex) {
            logger.error("Error ejecutando la  " + opcion, ex);
            response.setMensaje("Ha ocurrido un problema ejecutando la " + opcion + ". " + ex.getMessage());
            response.setCodigo("500");
        }
        return response;
    }

}
