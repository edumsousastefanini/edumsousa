package br.com.extrato.legado;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.extrato.beans.Extrato;

/**
 * Classe resnposavel por simular a massa de dados de um sistema legado
 * 
 * @author Eduardo Moreira de Sousa
 * 
 * @version 1.0
 * 
 * @since 28-04-2019
 * 
 */
@Repository
public class ExtratoLegadoJSONImpl implements ExtratoLegadoJSON {

	/**
	 * Metodo utilizado para retornar uma lista de extratos
	 * 
	 * @return listaExtrato - lista de extratos
	 * 
	 */
	public List<Extrato> getExtratoLancamentos() {

		ObjectMapper mapper = new ObjectMapper();
		List<Extrato> listaExtrato = new ArrayList<Extrato>();
		Extrato extratoJson = new Extrato();
		String banco = new String();
		String agencia = new String();
		String conta = new String();

		try {

			InputStream arquivoJson = ExtratoLegadoJSONImpl.class.getClassLoader().getResourceAsStream("lancamento-conta-legado.json");

			JsonNode rootNode = mapper.readTree(arquivoJson);

			for (JsonNode root : rootNode) {

				List<JsonNode> lancamentoContaCorrenteCliente = root.findParents("lancamentoContaCorrenteCliente");

				if (!lancamentoContaCorrenteCliente.isEmpty()) {

					for (JsonNode lancamentos : lancamentoContaCorrenteCliente) {

						extratoJson = new Extrato();

						extratoJson.setDataLancamento(lancamentos.path("dataLancamentoContaCorrenteCliente").asText());
						extratoJson.setNomeTipoOperacao(lancamentos.path("lancamentoContaCorrenteCliente").path("nomeTipoOperacao").asText());
						extratoJson.setNumeroRemessaBanco(lancamentos.path("lancamentoContaCorrenteCliente").path("numeroRemessaBanco").asText());
						extratoJson.setNomeSituacaoRemessa(lancamentos.path("lancamentoContaCorrenteCliente").path("nomeSituacaoRemessa").asText());
						extratoJson.setDataEfetivaLancamento(lancamentos.path("dataEfetivaLancamento").asText());
						extratoJson.setValorLancamentoRemessa(getValorLancamentoMoeda(lancamentos.path("valorLancamentoRemessa").asText()));
						banco = lancamentos.path("nomeBanco").asText();
						agencia = lancamentos.path("lancamentoContaCorrenteCliente").path("dadosDomicilioBancario").path("numeroAgencia").asText();
						conta = lancamentos.path("lancamentoContaCorrenteCliente").path("dadosDomicilioBancario").path("numeroContaCorrente").asText();
						extratoJson.setDomicilioBancario(getDomicilioBancario(banco, agencia, conta));

						listaExtrato.add(extratoJson);
					}
				}
			}

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return listaExtrato;
	}

	/**
	 * Metodo utilizado para retornar um domicilio bancario concatenado
	 * 
	 * @param banco
	 * @param agencia
	 * @param conta
	 * 
	 * @return domincilio bancario
	 * 
	 */
	private String getDomicilioBancario(String banco, String agencia, String conta) {

		StringBuffer sb = new StringBuffer();

		sb.append(banco).append(" AG ").append(agencia).append(" CC ").append(conta);

		return sb.toString();
	}
	
	/**
	 * Metodo utilizado para retornar o valor de lancamento em moeda
	 * 
	 * @param valorLancamento
	 * @return domincilio bancario
	 * 
	 */
	private String getValorLancamentoMoeda(String valorLancamento) {
		
		BigDecimal valor = new BigDecimal (valorLancamento);  
		NumberFormat nf = NumberFormat.getCurrencyInstance();  
		
		return nf.format (valor);
	}

}
