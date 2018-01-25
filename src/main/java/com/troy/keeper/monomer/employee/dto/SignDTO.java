package com.troy.keeper.monomer.employee.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.Instant;

/**
 * Date:     2018/1/23 16:22<br/>
 *
 * @author work_tl
 * @see
 * @since JDK 1.8
 */
public class SignDTO implements Serializable {
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Instant signDateTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Instant signDateTimeStart;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Instant signDateTimeEnd;

    private Long signUser;

    private String signUserName;

    private String signType;

    private String signTypeName;

    private String signClientType;

    private String signClientTypeName;

    private Double longitude;

    private Double latitude;

    public Instant getSignDateTime() {
        return signDateTime;
    }

    public void setSignDateTime(Instant signDateTime) {
        this.signDateTime = signDateTime;
    }

    public Instant getSignDateTimeStart() {
        return signDateTimeStart;
    }

    public void setSignDateTimeStart(Instant signDateTimeStart) {
        this.signDateTimeStart = signDateTimeStart;
    }

    public Instant getSignDateTimeEnd() {
        return signDateTimeEnd;
    }

    public void setSignDateTimeEnd(Instant signDateTimeEnd) {
        this.signDateTimeEnd = signDateTimeEnd;
    }

    public Long getSignUser() {
        return signUser;
    }

    public void setSignUser(Long signUser) {
        this.signUser = signUser;
    }

    public String getSignUserName() {
        return signUserName;
    }

    public void setSignUserName(String signUserName) {
        this.signUserName = signUserName;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getSignTypeName() {
        return signTypeName;
    }

    public void setSignTypeName(String signTypeName) {
        this.signTypeName = signTypeName;
    }

    public String getSignClientType() {
        return signClientType;
    }

    public void setSignClientType(String signClientType) {
        this.signClientType = signClientType;
    }

    public String getSignClientTypeName() {
        return signClientTypeName;
    }

    public void setSignClientTypeName(String signClientTypeName) {
        this.signClientTypeName = signClientTypeName;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}
