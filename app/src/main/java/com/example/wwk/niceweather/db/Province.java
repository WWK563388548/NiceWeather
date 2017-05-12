package com.example.wwk.niceweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wwk on 17/5/12.
 */

public class Province extends DataSupport {

    private int id;
    // Record name of province
    private String provinceName;
    // Record code of province
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
