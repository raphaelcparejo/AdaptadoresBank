package br.com.adaptadores.model;

public class ParametrizacaoModel {

	private String nomeCampoMainframe;
	private String descricaoCampo;
	private String tipoDeDadoMainFrame;
	private String regraExtratorArquivo;
	private String descricaoFuncionalidadeCampo;
	private String classificadorAvro;
	private String tipoDeDadoDistribuida;
	private String tamanho;
	private String classificadorDePara;
	private String componenteLayout;

	public String getNomeCampoMainframe() {
		return nomeCampoMainframe;
	}

	public void setNomeCampoMainframe(String nomeCampoMainframe) {
		this.nomeCampoMainframe = nomeCampoMainframe;
	}

	public String getDescricaoCampo() {
		return descricaoCampo;
	}

	public void setDescricaoCampo(String descricaoCampo) {
		this.descricaoCampo = descricaoCampo;
	}

	public String getTipoDeDadoMainFrame() {
		return tipoDeDadoMainFrame;
	}

	public void setTipoDeDadoMainFrame(String tipoDeDadoMainFrame) {
		this.tipoDeDadoMainFrame = tipoDeDadoMainFrame;
	}

	public String getRegraExtratorArquivo() {
		return regraExtratorArquivo;
	}

	public void setRegraExtratorArquivo(String regraExtratorArquivo) {
		this.regraExtratorArquivo = regraExtratorArquivo;
	}

	public String getDescricaoFuncionalidadeCampo() {
		return descricaoFuncionalidadeCampo;
	}

	public void setDescricaoFuncionalidadeCampo(String descricaoFuncionalidadeCampo) {
		this.descricaoFuncionalidadeCampo = descricaoFuncionalidadeCampo;
	}

	public String getClassificadorAvro() {
		return classificadorAvro;
	}

	public void setClassificadorAvro(String classificadorAvro) {
		this.classificadorAvro = classificadorAvro;
	}

	public String getTipoDeDadoDistribuida() {
		return tipoDeDadoDistribuida;
	}

	public void setTipoDeDadoDistribuida(String tipoDeDadoDistribuida) {
		this.tipoDeDadoDistribuida = tipoDeDadoDistribuida;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getClassificadorDePara() {
		return classificadorDePara;
	}

	public void setClassificadorDePara(String classificadorDePara) {
		this.classificadorDePara = classificadorDePara;
	}

	public String getComponenteLayout() {
		return componenteLayout;
	}

	public void setComponenteLayout(String componenteLayout) {
		this.componenteLayout = componenteLayout;
	}

	public ParametrizacaoModel(String nomeCampoMainframe, String descricaoCampo, String tipoDeDadoMainFrame,
			String regraExtratorArquivo, String descricaoFuncionalidadeCampo, String classificadorAvro,
			String tipoDeDadoDistribuida, String tamanho, String classificadorDePara, String componenteLayout) {
		super();
		this.nomeCampoMainframe = nomeCampoMainframe;
		this.descricaoCampo = descricaoCampo;
		this.tipoDeDadoMainFrame = tipoDeDadoMainFrame;
		this.regraExtratorArquivo = regraExtratorArquivo;
		this.descricaoFuncionalidadeCampo = descricaoFuncionalidadeCampo;
		this.classificadorAvro = classificadorAvro;
		this.tipoDeDadoDistribuida = tipoDeDadoDistribuida;
		this.tamanho = tamanho;
		this.classificadorDePara = classificadorDePara;
		this.componenteLayout = componenteLayout;
	}

}
