package cn.xyy.domain;

import java.io.Serializable;

public class City implements Serializable {
    private Integer id;

    private String cityCode;

    private String cityName;

    private String fkProvinceCode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getFkProvinceCode() {
        return fkProvinceCode;
    }

    public void setFkProvinceCode(String fkProvinceCode) {
        this.fkProvinceCode = fkProvinceCode;
    }
}