package br.com.extrato.service;

import java.util.List;

import br.com.extrato.beans.Extrato;

/**
 * Interface de classe ExtratoService 
 * 
 * @author Eduardo Moreira de Sousa
 * 
 * @version 1.0
 * 
 * @since 28-04-2019
 * 
 */
public interface ExtratoService {
	
	/**
	 * Metodo utilizado para retornar uma lista de extratos
	 * 
	 * @return listaExtrato - lista de extratos
	 * 
	 */
	public List<Extrato> getExtratoLancamentos();
}
