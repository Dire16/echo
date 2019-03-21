package com.geely.echo.pojo;

public class Heroavatar {
    private int id;
    private String cn_name;
    private String en_name;
    private String img;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCn_name() {
        return cn_name;
    }

    public void setCn_name(String cn_name) {
        this.cn_name = cn_name;
    }

    public String getEn_name() {
        return en_name;
    }

    public void setEn_name(String en_name) {
        this.en_name = en_name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Heroavatar{" +
                "id='" + id + '\'' +
                ", cn_name='" + cn_name + '\'' +
                ", en_name='" + en_name + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
