package com.cc.entity;

import java.io.Serializable;

public class Image implements Serializable {
    private Integer id;

    private String aera;

    private String coordinate;

    private String createuser;

    private String datetime;

    private String description;

    private String imagename;

    private String imagepath;

    private Double imagesize;

    private String imagetype;

    private String attachname;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAera() {
        return aera;
    }

    public void setAera(String aera) {
        this.aera = aera == null ? null : aera.trim();
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate == null ? null : coordinate.trim();
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime == null ? null : datetime.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename == null ? null : imagename.trim();
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath == null ? null : imagepath.trim();
    }

    public Double getImagesize() {
        return imagesize;
    }

    public void setImagesize(Double imagesize) {
        this.imagesize = imagesize;
    }

    public String getImagetype() {
        return imagetype;
    }

    public void setImagetype(String imagetype) {
        this.imagetype = imagetype == null ? null : imagetype.trim();
    }

    public String getAttachname() {
        return attachname;
    }

    public void setAttachname(String attachname) {
        this.attachname = attachname == null ? null : attachname.trim();
    }
}