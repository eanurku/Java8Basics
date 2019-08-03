package com.eanurku.Base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Example {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String string="abc?xyz";

        String basicEncodedstring = Base64.getEncoder().encodeToString(string.getBytes("utf-8"));
        System.out.println(basicEncodedstring);
        byte[]  basicdecodeString = Base64.getDecoder().decode(basicEncodedstring);
        System.out.println(new String(basicdecodeString,"utf-8"));
        System.out.println();

        String urlencodedstring = Base64.getUrlEncoder().encodeToString(string.getBytes("utf-8"));
        System.out.println(urlencodedstring);
        byte[] urlDecodedString=Base64.getUrlDecoder().decode(urlencodedstring);
        System.out.println(new String(urlDecodedString));
        System.out.println();

        String mimeEncodedString = Base64.getMimeEncoder().encodeToString(string.getBytes("utf-8"));
        System.out.println(mimeEncodedString);
        byte[] mimeDecodedString = Base64.getMimeDecoder().decode(mimeEncodedString);
        System.out.println(new String(mimeDecodedString));



    }
}
