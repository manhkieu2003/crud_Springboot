package com.example.xyz.untils;

import org.mindrot.jbcrypt.BCrypt;

// class thực hiện mã hóa
public class HashUntil {
    public static String hash(String plain)      // nhận vào 1 chuooi gốc trả ra 1 chuỗi mã hóa
    {
       String satl= BCrypt.gensalt();
       return BCrypt.hashpw(plain,satl);
    }
    public static boolean verify (String plain , String hash)
    {
        return true;
    }
}
