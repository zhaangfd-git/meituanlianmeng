package com.meituan.lianmeng;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.binary.StringUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * @author: zhangfd
 * @date: 2022/7/16 22:04
 * @version: 1.0
 * @describe:
 */
public class SignUtil {
   private static String apiToken = "e5cbeb802546d1b7fbfeefab96608f18";
    public static String genSign(TreeMap<String, Object> params) {
        params.remove("sign");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(apiToken)
                     .append(params.entrySet().stream().map(entry -> entry.getKey() + entry.getValue()).collect(Collectors.joining()))
                     .append(apiToken);
        return md5(stringBuilder.toString());
    }
    public static String md5(String source) {
        String md5Result = null;
        try {
            byte[] hash = StringUtils.getBytesUtf8(source);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(hash);
            hash = messageDigest.digest();
            md5Result = Hex.encodeHexString(hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return md5Result;
    }
}
