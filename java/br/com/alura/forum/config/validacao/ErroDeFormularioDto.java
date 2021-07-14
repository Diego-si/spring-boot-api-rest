package br.com.alura.forum.config.validacao;

/**
 * @author Diego Almeida Da Silva
 *
 * 14 de jul. de 2021
 */
public class ErroDeFormularioDto {

	private String campo;
	private String erro;
	
	public ErroDeFormularioDto(String campo, String erro) {
		this.campo = campo;
		this.erro = erro;
	}

	public String getCampo() {
		return campo;
	}

	public String getErro() {
		return erro;
	}
	
	
}
