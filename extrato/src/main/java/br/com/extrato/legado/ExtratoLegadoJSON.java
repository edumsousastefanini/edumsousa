package br.com.extrato.legado;

import java.util.List;

import br.com.extrato.beans.Extrato;

/**
 * Interface de classe ExtratoLegadoJSON 
 * 
 * @author Eduardo Moreira de Sousa
 * 
 * @version 1.0
 * 
 * @since 28-04-2019
 * 
 */
public interface ExtratoLegadoJSON {
	
	/**
	 * Metodo utilizado para retornar uma lista de extratos
	 * 
	 * @return listaExtrato - lista de extratos
	 * 
	 */
	public List<Extrato> getExtratoLancamentos();
}
