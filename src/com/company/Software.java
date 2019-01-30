package com.company;

import com.company.Product;

public class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    public Software() {
    }

    public Software(String programmer, String platform, String os) {
        this.programmer = programmer;
        this.platform = platform;
        this.os = os;
    }

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Software)) return false;
        if (!super.equals(o)) return false;

        Software software = (Software) o;

        if (!getProgrammer().equals(software.getProgrammer())) return false;
        if (!getPlatform().equals(software.getPlatform())) return false;
        return getOs().equals(software.getOs());
    }
}