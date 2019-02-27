package br.com.casa.cursospring.domain.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTUtil {
	
	@Value("${jwt.secretEncoder}")
	private String secretEnconder;
	
	@Value("${jwt.secretExpiration}")
	private Long secretExpiration;
	
	public String generationToken(String empresa)
	{
		return Jwts.builder().setSubject(empresa)
		.setExpiration(new Date(System.currentTimeMillis() + secretExpiration))
		.signWith(SignatureAlgorithm.HS512, secretEnconder.getBytes())
		.compact();
	}

}
