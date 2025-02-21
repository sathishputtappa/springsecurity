package com.security.Security;

import io.jsonwebtoken.Jwts;
import jakarta.xml.bind.DatatypeConverter;
import org.junit.jupiter.api.Test;

import javax.crypto.SecretKey;
import java.util.Arrays;

public class JwtSecretMakerTest {

    @Test
    public void generateSecretKey(){

        SecretKey key = Jwts.SIG.HS512.key().build();

        String out = DatatypeConverter.printHexBinary(key.getEncoded());
        System.out.println(out);

    }
}
