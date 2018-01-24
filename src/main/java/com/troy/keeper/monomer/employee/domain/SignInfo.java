package com.troy.keeper.monomer.employee.domain;

import com.troy.keeper.core.base.entity.BaseAuditingEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *  签到签退表
 * Date:     2018/1/23 11:17<br/>
 *
 * @author work_tl
 * @see
 * @since JDK 1.8
 */
@Entity
@Table(name = "sign_info")
public class SignInfo extends BaseAuditingEntity {
    /**
     *  签到人员
     */
    @Column(name = "sing_user")
    private Long singUser;

    /**
     *  签到方式 1 签到 2 签退
     */
    @Column(name = "sing_type")
    private String singType;

    /**
     *  签到终端 1 pc 2 移动端
     */
    @Column(name = "sing_client_type")
    private String singClientType;

    /**
     *  签到经度
     */
    @Column(name = "longitude")
    private Double longitude;

    /**
     *  签到纬度
     */
    @Column(name = "latitude")
    private Double latitude;

    public Long getSingUser() {
        return singUser;
    }

    public void setSingUser(Long singUser) {
        this.singUser = singUser;
    }

    public String getSingType() {
        return singType;
    }

    public void setSingType(String singType) {
        this.singType = singType;
    }

    public String getSingClientType() {
        return singClientType;
    }

    public void setSingClientType(String singClientType) {
        this.singClientType = singClientType;
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
