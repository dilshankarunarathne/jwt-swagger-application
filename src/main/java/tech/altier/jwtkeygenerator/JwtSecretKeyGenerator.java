package tech.altier.jwtkeygenerator;

import java.security.SecureRandom;
import java.util.Base64;

public class JwtSecretKeyGenerator {

    public static void main(String[] args) {
        // Generate a 256-bit (32-byte) random key
        byte[] keyBytes = new byte[32];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(keyBytes);

        // Convert the key to a Base64-encoded string
        String secretKey = Base64.getEncoder().encodeToString(keyBytes);

        System.out.println("JWT Secret Key: " + secretKey);
    }
}

