package com.company.lesson_1;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Quiz {
    public static void say() throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes(StandardCharsets.UTF_8));
        for (byte b: digest) {
            System.out.printf("%02x", b);
        }
    }
}
