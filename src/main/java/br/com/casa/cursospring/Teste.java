package br.com.casa.cursospring;

import br.com.casa.cursospring.domain.security.JWTUtil;

public class Teste {
	
	
	public static void main(String[] args) {
		JWTUtil jtw = new JWTUtil();
		System.out.println("TOKEN GERADO - " + jtw.generationToken("Banco do Brasil"));	
	}

}
