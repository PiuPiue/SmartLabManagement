//package com.hao.lzlglab.utils;
//
//import com.hao.lzlglab.entity.SysUser;
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.JwtBuilder;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.util.DigestUtils;
//
//import java.util.Date;
//
//public class JwtUtils {
//	private static final SignatureAlgorithm ALGORITHM = SignatureAlgorithm.HS256;
//	private static final String TOKEN_TYPE = "jwt";
//
//	//过期时间，设置60分钟。
//	private static final long EXPIRTAION = 60*60*1000;
//
//	private static final String SIGN_KEY = DigestUtils.md5DigestAsHex("smart-labs".getBytes());
//
//	public static String generateJwtStr(UserDetails user) {
//		JwtBuilder builder  = Jwts.builder();
//		builder.setHeaderParam("alg", ALGORITHM.getValue());
//		builder.setHeaderParam("type", TOKEN_TYPE);
//		builder.claim("username", user.getUsername())
//			   .setIssuedAt(new Date())
//			   .setExpiration(new Date(System.currentTimeMillis()+EXPIRTAION));
//		builder.signWith(ALGORITHM, SIGN_KEY.getBytes());
//		return builder.compact();
//	}
//
//	public static String generateJwtStr(SysUser user) {
//		JwtBuilder builder  = Jwts.builder();
//		builder.setHeaderParam("alg", ALGORITHM.getValue());
//		builder.setHeaderParam("type", TOKEN_TYPE);
//		builder.claim("userId", user.getUserId())
//			   .claim("username", user.getUsername())
//			   .setIssuedAt(new Date())
//			   .setExpiration(new Date(System.currentTimeMillis()+EXPIRTAION));
//		builder.signWith(ALGORITHM, SIGN_KEY.getBytes());
//		return builder.compact();
//	}
//
//	private static Claims parse(String token) {
//		return Jwts.parser().setSigningKey(SIGN_KEY.getBytes()).parseClaimsJws(token).getBody();
//	}
//
//	public static String getUsername(String token) {
//		Claims claims = parse(token);
//		return claims.get("username",String.class);
//	}
//}
