package com.meituan.lianmeng;

import com.alibaba.fastjson.JSON;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author: zhangfd
 * @date: 2022/7/16 22:23
 * @version: 1.0
 * @describe:
 */
public class Test {


    public static void main(String[] args) {


        String url = "https://openapi.meituan.com/api/generateLink";

        TreeMap<String,Object> map = new TreeMap();
        map.putIfAbsent("actId",143);
        map.putIfAbsent("sid","123abc");
        map.putIfAbsent("linkType",1);
        map.putIfAbsent("appkey","测试1");

        String sign = SignUtil.genSign(map);

        StringBuffer sb  = new StringBuffer(10);

        for (Map.Entry entry:map.entrySet()){
            sb.append(entry.getKey()+"="+entry.getValue()+"&");
        }
        sb.append("sign="+sign);

        System.out.println(sb.toString());
        String s = HttpRequest.sendGet(url, sb.toString());

        System.out.println(s);
    }
}
