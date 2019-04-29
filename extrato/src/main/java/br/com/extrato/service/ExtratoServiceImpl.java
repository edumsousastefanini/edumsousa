package br.com.extrato.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.extrato.beans.Extrato;
import br.com.extrato.legado.ExtratoLegadoJSON;

/**
 * Classe de servico responsavel por acessar os dados do legado em json
 * 
 * @author Eduardo Moreira de Sousa
 * 
 * @version 1.0
 * 
 * @since 28-04-2019
 * 
 */
@Service
public class ExtratoServiceImpl implements ExtratoService{

	@Autowired
    private ExtratoLegadoJSON extratoLegado;
    
	/**
	 * Metodo utilizado para retornar uma lista de extratos
	 * 
	 * @return listaExtrato - lista de extratos
	 * 
	 */
    @Override
    public List<Extrato> getExtratoLancamentos(){
    	return extratoLegado.getExtratoLancamentos();
    }

}
