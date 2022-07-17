package com.meituan.lianmeng;

/**
 * @author: zhangfd
 * @date: 2022/7/16 22:24
 * @version: 1.0
 * @describe:
 */
public class Bean1 {

    private int actId;

    private String appkey;

    private  String sid;

    private int linkType;

    private String sign;

    public int getActId() {
        return actId;
    }

    public void setActId(int actId) {
        this.actId = actId;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public int getLinkType() {
        return linkType;
    }

    public void setLinkType(int linkType) {
        this.linkType = linkType;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
