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
public class ReportDTO implements Serializable {
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Instant reportDateTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Instant reportDateTimeStart;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Instant reportDateTimeEnd;

    private Long reportUser;

    private String reportUserName;

    private String reportType;

    private String reportTypeName;

    private String reportStatus;

    private String reportStatusName;

    private String reportTitle;

    private String reportContent;

    public Instant getReportDateTime() {
        return reportDateTime;
    }

    public void setReportDateTime(Instant reportDateTime) {
        this.reportDateTime = reportDateTime;
    }

    public Instant getReportDateTimeStart() {
        return reportDateTimeStart;
    }

    public void setReportDateTimeStart(Instant reportDateTimeStart) {
        this.reportDateTimeStart = reportDateTimeStart;
    }

    public Instant getReportDateTimeEnd() {
        return reportDateTimeEnd;
    }

    public void setReportDateTimeEnd(Instant reportDateTimeEnd) {
        this.reportDateTimeEnd = reportDateTimeEnd;
    }

    public Long getReportUser() {
        return reportUser;
    }

    public void setReportUser(Long reportUser) {
        this.reportUser = reportUser;
    }

    public String getReportUserName() {
        return reportUserName;
    }

    public void setReportUserName(String reportUserName) {
        this.reportUserName = reportUserName;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportTypeName() {
        return reportTypeName;
    }

    public void setReportTypeName(String reportTypeName) {
        this.reportTypeName = reportTypeName;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

    public String getReportStatusName() {
        return reportStatusName;
    }

    public void setReportStatusName(String reportStatusName) {
        this.reportStatusName = reportStatusName;
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
}
