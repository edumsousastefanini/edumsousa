package br.com.extrato.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.extrato.beans.Extrato;
import br.com.extrato.service.ExtratoService;

/**
 * Classe RestController para expor o serviço de extrato de lancamentos em conta
 * de lancamentos em conta
 * 
 * @author Eduardo Moreira de Sousa
 * 
 * @version 1.0
 * 
 * @since 28-04-2019
 * 
 */
@RestController
public class ExtratoController {

	@Autowired
	private ExtratoService extratoService;

	/**
	 * Metodo utilizado para o serviço de extrato ser exposto que retorna uma lista de extratos
	 * 
	 * @return listaExtrato - lista de extratos
	 * 
	 */
	@RequestMapping(value = "/extrato/lancamentos", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	List<Extrato> getExtratoLancamentos() {
		// lista de extratos de lancamentos em conta
		List<Extrato> listaExtrato = extratoService.getExtratoLancamentos();

		return listaExtrato;
	}

}
