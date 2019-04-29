/**
 * 
 */
package br.com.extrato.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Classe Controller para acessar a pagina de extrato de lancamentos em conta
 * 
 * @author Eduardo Moreira de Sousa
 * 
 * @version 1.0
 * 
 * @since 28-04-2019
 * 
 */
@Controller
public class MainController {

	/**
	 * Metodo utilizado para o abrir pagina de extrato
	 * 
	 * @return listaExtrato - lista de extratos
	 * 
	 */
	@RequestMapping("/")
	public String extrato() {
		return "index";
	}
}
