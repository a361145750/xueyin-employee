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

    private Long singUser;

    private Long singUserName;

    private String singType;

    private String singTypeName;

    private String singClientType;

    private String singClientTypeName;

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

    public Long getSingUser() {
        return singUser;
    }

    public void setSingUser(Long singUser) {
        this.singUser = singUser;
    }

    public Long getSingUserName() {
        return singUserName;
    }

    public void setSingUserName(Long singUserName) {
        this.singUserName = singUserName;
    }

    public String getSingType() {
        return singType;
    }

    public void setSingType(String singType) {
        this.singType = singType;
    }

    public String getSingTypeName() {
        return singTypeName;
    }

    public void setSingTypeName(String singTypeName) {
        this.singTypeName = singTypeName;
    }

    public String getSingClientType() {
        return singClientType;
    }

    public void setSingClientType(String singClientType) {
        this.singClientType = singClientType;
    }

    public String getSingClientTypeName() {
        return singClientTypeName;
    }

    public void setSingClientTypeName(String singClientTypeName) {
        this.singClientTypeName = singClientTypeName;
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
