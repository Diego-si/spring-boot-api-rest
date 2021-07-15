package br.com.alura.forum.controller.dto;

/**
 * @author Diego Almeida Da Silva
 *
 * 14 de jul. de 2021
 */
public class TokenDto {

	private String token;
	private String tipo;

	public TokenDto(String token, String tipo) {
		this.token = token;
		this.tipo = tipo;
	}

	public String getToken() {
		return token;
	}

	public String getTipo() {
		return tipo;
	}

}