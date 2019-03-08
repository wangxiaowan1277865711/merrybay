package com.zh.program.Common.encrypt;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class HmacSHA512 {
    public static String HmacSHA512(String data, String secretKey){
        String Sign = "";
        try {
            SecretKeySpec key = null;
            Mac mac = null;
            key = new SecretKeySpec(secretKey.getBytes("UTF-8"), "HmacSHA512");
            mac = Mac.getInstance("HmacSHA512");
            mac.init(key);
            byte[] digest = mac.doFinal(data.getBytes("UTF-8"));
            for (int i = 0; i < digest.length; i++) {
                int b = digest[i] & 0xff;
                if (Integer.toHexString(b).length() == 1) {
                    Sign = Sign + "0";
                }
                Sign = Sign + Integer.toHexString(b);
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return Sign;
    }
}
