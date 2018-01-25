package com.troy.keeper.monomer.employee.domain;

import com.troy.keeper.core.base.entity.BaseAuditingEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *  日报
 * Date:     2018/1/25 9:55<br/>
 *
 * @author work_tl
 * @see
 * @since JDK 1.8
 */
@Entity
@Table(name = "report")
public class Report extends BaseAuditingEntity {
    /**
     *  报告人员
     */
    @Column(name = "report_user")
    private Long reportUser;

    /**
     *  报告类型  1 日报 2 周报 3 月报
     */
    @Column(name = "report_type")
    private String reportType;

    /**
     *  报告标题
     */
    @Column(name = "report_title")
    private String reportTitle;

    /**
     *  报告内容
     */
    @Column(name = "report_content")
    private String reportContent;

    /**
     *  报告状态 0 草稿 1 已发布 2 已删除
     */
    @Column(name = "report_status")
    private String reportStatus;

    public Long getReportUser() {
        return reportUser;
    }

    public void setReportUser(Long reportUser) {
        this.reportUser = reportUser;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }
}
