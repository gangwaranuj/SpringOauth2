package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Encoder implements PasswordEncoder {
 
	 @Override
   public String encode(CharSequence rawPassword) {
       return rawPassword.toString();
   }
   @Override
   public boolean matches(CharSequence rawPassword, String encodedPassword) {
       return  rawPassword.toString().equals(encodedPassword);
   }
	
//	 @Override
//     public String encode(CharSequence rawPassword) {
//
//         return BCrypt.hashpw(rawPassword.toString(), BCrypt.gensalt(16));
//     }
//
//     @Override
//     public boolean matches(CharSequence rawPassword, String encodedPassword) {
//
//         return BCrypt.checkpw(rawPassword.toString(), encodedPassword);
//     }
//  
}
