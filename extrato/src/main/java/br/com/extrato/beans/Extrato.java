package br.com.extrato.beans;

/**
 * Classe referente ao objeto Extrato com os dados do extrato de lancamentos em conta
 * 
 * @author Eduardo Moreira de Sousa
 * 
 * @version 1.0
 * 
 * @since 28-04-2019
 * 
 * */
public class Extrato {
	

	private  String dataLancamento;
	private  String nomeTipoOperacao;
	private  String numeroRemessaBanco;
	private  String nomeSituacaoRemessa;
	private  String dataEfetivaLancamento;
	private  String domicilioBancario;
	private  String valorLancamentoRemessa;
	
	public Extrato() {}
	 
	public Extrato(Extrato extrato) {
	    	
    	this.dataLancamento = extrato.getDataLancamento();
    	this.nomeTipoOperacao = extrato.getNomeTipoOperacao();
    	this.numeroRemessaBanco = extrato.getNumeroRemessaBanco();
    	this.nomeSituacaoRemessa = extrato.getNomeSituacaoRemessa();
    	this.domicilioBancario = extrato.getDomicilioBancario();
    	this.valorLancamentoRemessa = extrato.getValorLancamentoRemessa();
    	
	}
	
	/**
	 * @return the dataLancamento
	 */
	public String getDataLancamento() {
		return dataLancamento;
	}
	/**
	 * @param dataLancamento the dataLancamento to set
	 */
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	/**
	 * @return the nomeTipoOperacao
	 */
	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}
	/**
	 * @param nomeTipoOperacao the nomeTipoOperacao to set
	 */
	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}
	/**
	 * @return the numeroRemessaBanco
	 */
	public String getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}
	/**
	 * @param numeroRemessaBanco the numeroRemessaBanco to set
	 */
	public void setNumeroRemessaBanco(String numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}
	/**
	 * @return the nomeSituacaoRemessa
	 */
	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}
	/**
	 * @param nomeSituacaoRemessa the nomeSituacaoRemessa to set
	 */
	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}
	/**
	 * @return the dataEfetivaLancamento
	 */
	public String getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}
	/**
	 * @param dataEfetivaLancamento the dataEfetivaLancamento to set
	 */
	public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}
	
	/**
	 * @return the valorLancamentoRemessa
	 */
	public String getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}
	/**
	 * @param valorLancamentoRemessa the valorLancamentoRemessa to set
	 */
	public void setValorLancamentoRemessa(String valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}

	/**
	 * @return the domicilioBancario
	 */
	public String getDomicilioBancario() {
		return domicilioBancario;
	}

	/**
	 * @param domicilioBancario the domicilioBancario to set
	 */
	public void setDomicilioBancario(String domicilioBancario) {
		this.domicilioBancario = domicilioBancario;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Extrato [dataLancamento=" + dataLancamento + ", nomeTipoOperacao=" + nomeTipoOperacao
				+ ", numeroRemessaBanco=" + numeroRemessaBanco + ", nomeSituacaoRemessa=" + nomeSituacaoRemessa
				+ ", dataEfetivaLancamento=" + dataEfetivaLancamento + ", domicilioBancario=" + domicilioBancario
				+ ", valorLancamentoRemessa=" + valorLancamentoRemessa + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataEfetivaLancamento == null) ? 0 : dataEfetivaLancamento.hashCode());
		result = prime * result + ((dataLancamento == null) ? 0 : dataLancamento.hashCode());
		result = prime * result + ((domicilioBancario == null) ? 0 : domicilioBancario.hashCode());
		result = prime * result + ((nomeSituacaoRemessa == null) ? 0 : nomeSituacaoRemessa.hashCode());
		result = prime * result + ((nomeTipoOperacao == null) ? 0 : nomeTipoOperacao.hashCode());
		result = prime * result + ((numeroRemessaBanco == null) ? 0 : numeroRemessaBanco.hashCode());
		result = prime * result + ((valorLancamentoRemessa == null) ? 0 : valorLancamentoRemessa.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Extrato other = (Extrato) obj;
		if (dataEfetivaLancamento == null) {
			if (other.dataEfetivaLancamento != null)
				return false;
		} else if (!dataEfetivaLancamento.equals(other.dataEfetivaLancamento))
			return false;
		if (dataLancamento == null) {
			if (other.dataLancamento != null)
				return false;
		} else if (!dataLancamento.equals(other.dataLancamento))
			return false;
		if (domicilioBancario == null) {
			if (other.domicilioBancario != null)
				return false;
		} else if (!domicilioBancario.equals(other.domicilioBancario))
			return false;
		if (nomeSituacaoRemessa == null) {
			if (other.nomeSituacaoRemessa != null)
				return false;
		} else if (!nomeSituacaoRemessa.equals(other.nomeSituacaoRemessa))
			return false;
		if (nomeTipoOperacao == null) {
			if (other.nomeTipoOperacao != null)
				return false;
		} else if (!nomeTipoOperacao.equals(other.nomeTipoOperacao))
			return false;
		if (numeroRemessaBanco == null) {
			if (other.numeroRemessaBanco != null)
				return false;
		} else if (!numeroRemessaBanco.equals(other.numeroRemessaBanco))
			return false;
		if (valorLancamentoRemessa == null) {
			if (other.valorLancamentoRemessa != null)
				return false;
		} else if (!valorLancamentoRemessa.equals(other.valorLancamentoRemessa))
			return false;
		return true;
	}
}
