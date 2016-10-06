/**
 * ******************************************************************************************
 * Copyright (C) 2014 - Food and Agriculture Organization of the United Nations (FAO).
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice,this list
 *       of conditions and the following disclaimer.
 *    2. Redistributions in binary form must reproduce the above copyright notice,this list
 *       of conditions and the following disclaimer in the documentation and/or other
 *       materials provided with the distribution.
 *    3. Neither the name of FAO nor the names of its contributors may be used to endorse or
 *       promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 * SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,PROCUREMENT
 * OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,STRICT LIABILITY,OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * *********************************************************************************************
 */
package org.sola.services.boundary.transferobjects.cadastre;

import java.util.Date;
import org.sola.services.common.contracts.AbstractIdTO;

/**
 * TO for CadastreObject entity
 */
public class CadastreObjectTO extends AbstractIdTO {

    private String landUseCode;
    private String typeCode;
    private Date approvalDatetime;
    private Date historicDatetime;
    private String sourceReference;
    private String nameFirstpart;
    private String nameLastpart;
    private String statusCode;
    private String transactionId;
    private byte[] geomPolygon;
    private String ownerName;
    private String address;
    private String landTypeCode;
    private double parcelArea;
    private String licensedSurveyorId;
    private String eastNeighbour;
    private String westNeighbour;
    private String southNeighbour;
    private String northNeighbour;
    private String surveyMethodCode;
    private Date surveyDate;
    private String beaconNumber;
    private String chartingOfficerId;
    private String stateLandClearingOfficerId;
    private PartySummaryTO stateLandClearingOfficer;
    private PartySummaryTO chartingOfficer;
    private PartySummaryTO licensedSurveyor;
    private String chiefdomTypeCode;
    private String surveyTypeCode;
    private String refNameFirstpart;
    private String refNameLastpart;
    private String surveyNumber;
    private String correspondenceFile;
    private String computationFile;
    private String drawnBy;
    private String checkedBy;
    private Date checkingDate;
    private String dwgOffNumber;
    private boolean stateLandClearance;
    private boolean planningClearance;
    private boolean environmentClearance;
    
    public CadastreObjectTO() {
        super();
    }

    public String getLandUseCode() {
        return landUseCode;
    }

    public void setLandUseCode(String landUseCode) {
        this.landUseCode = landUseCode;
    }

    public Date getApprovalDatetime() {
        return approvalDatetime;
    }

    public void setApprovalDatetime(Date approvalDatetime) {
        this.approvalDatetime = approvalDatetime;
    }

    public Date getHistoricDatetime() {
        return historicDatetime;
    }

    public void setHistoricDatetime(Date historicDatetime) {
        this.historicDatetime = historicDatetime;
    }

    public String getNameFirstpart() {
        return nameFirstpart;
    }

    public void setNameFirstpart(String nameFirstpart) {
        this.nameFirstpart = nameFirstpart;
    }

    public String getNameLastpart() {
        return nameLastpart;
    }

    public void setNameLastpart(String nameLastpart) {
        this.nameLastpart = nameLastpart;
    }

    public String getSourceReference() {
        return sourceReference;
    }

    public void setSourceReference(String sourceReference) {
        this.sourceReference = sourceReference;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public byte[] getGeomPolygon() {
        return geomPolygon;
    }

    public void setGeomPolygon(byte[] geomPolygon) { //NOSONAR
        this.geomPolygon = geomPolygon; //NOSONAR
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLandTypeCode() {
        return landTypeCode;
    }

    public void setLandTypeCode(String landTypeCode) {
        this.landTypeCode = landTypeCode;
    }

    public double getParcelArea() {
        return parcelArea;
    }

    public void setParcelArea(double parcelArea) {
        this.parcelArea = parcelArea;
    }

    public String getEastNeighbour() {
        return eastNeighbour;
    }

    public void setEastNeighbour(String eastNeighbour) {
        this.eastNeighbour = eastNeighbour;
    }

    public String getWestNeighbour() {
        return westNeighbour;
    }

    public void setWestNeighbour(String westNeighbour) {
        this.westNeighbour = westNeighbour;
    }

    public String getSouthNeighbour() {
        return southNeighbour;
    }

    public void setSouthNeighbour(String southNeighbour) {
        this.southNeighbour = southNeighbour;
    }

    public String getNorthNeighbour() {
        return northNeighbour;
    }

    public void setNorthNeighbour(String northNeighbour) {
        this.northNeighbour = northNeighbour;
    }

    public String getSurveyMethodCode() {
        return surveyMethodCode;
    }

    public void setSurveyMethodCode(String surveyMethodCode) {
        this.surveyMethodCode = surveyMethodCode;
    }

    public Date getSurveyDate() {
        return surveyDate;
    }

    public void setSurveyDate(Date surveyDate) {
        this.surveyDate = surveyDate;
    }

    public String getBeaconNumber() {
        return beaconNumber;
    }

    public void setBeaconNumber(String beaconNumber) {
        this.beaconNumber = beaconNumber;
    }

    public String getLicensedSurveyorId() {
        return licensedSurveyorId;
    }

    public void setLicensedSurveyorId(String licensedSurveyorId) {
        this.licensedSurveyorId = licensedSurveyorId;
    }

    public String getChartingOfficerId() {
        return chartingOfficerId;
    }

    public void setChartingOfficerId(String chartingOfficerId) {
        this.chartingOfficerId = chartingOfficerId;
    }

    public String getStateLandClearingOfficerId() {
        return stateLandClearingOfficerId;
    }

    public void setStateLandClearingOfficerId(String stateLandClearingOfficerId) {
        this.stateLandClearingOfficerId = stateLandClearingOfficerId;
    }

    public PartySummaryTO getStateLandClearingOfficer() {
        return stateLandClearingOfficer;
    }

    public void setStateLandClearingOfficer(PartySummaryTO stateLandClearingOfficer) {
        this.stateLandClearingOfficer = stateLandClearingOfficer;
    }

    public PartySummaryTO getChartingOfficer() {
        return chartingOfficer;
    }

    public void setChartingOfficer(PartySummaryTO chartingOfficer) {
        this.chartingOfficer = chartingOfficer;
    }

    public PartySummaryTO getLicensedSurveyor() {
        return licensedSurveyor;
    }

    public void setLicensedSurveyor(PartySummaryTO licensedSurveyor) {
        this.licensedSurveyor = licensedSurveyor;
    }

    public String getChiefdomTypeCode() {
        return chiefdomTypeCode;
    }

    public void setChiefdomTypeCode(String chiefdomTypeCode) {
        this.chiefdomTypeCode = chiefdomTypeCode;
    }

    public String getSurveyTypeCode() {
        return surveyTypeCode;
    }

    public void setSurveyTypeCode(String surveyTypeCode) {
        this.surveyTypeCode = surveyTypeCode;
    }

    public String getRefNameFirstpart() {
        return refNameFirstpart;
    }

    public void setRefNameFirstpart(String refNameFirstpart) {
        this.refNameFirstpart = refNameFirstpart;
    }

    public String getRefNameLastpart() {
        return refNameLastpart;
    }

    public void setRefNameLastpart(String refNameLastpart) {
        this.refNameLastpart = refNameLastpart;
    }

    public String getSurveyNumber() {
        return surveyNumber;
    }

    public void setSurveyNumber(String surveyNumber) {
        this.surveyNumber = surveyNumber;
    }

    public String getCorrespondenceFile() {
        return correspondenceFile;
    }

    public void setCorrespondenceFile(String correspondenceFile) {
        this.correspondenceFile = correspondenceFile;
    }

    public String getComputationFile() {
        return computationFile;
    }

    public void setComputationFile(String computationFile) {
        this.computationFile = computationFile;
    }

    public String getDrawnBy() {
        return drawnBy;
    }

    public void setDrawnBy(String drawnBy) {
        this.drawnBy = drawnBy;
    }

    public String getCheckedBy() {
        return checkedBy;
    }

    public void setCheckedBy(String checkedBy) {
        this.checkedBy = checkedBy;
    }

    public Date getCheckingDate() {
        return checkingDate;
    }

    public void setCheckingDate(Date checkingDate) {
        this.checkingDate = checkingDate;
    }

    public String getDwgOffNumber() {
        return dwgOffNumber;
    }

    public void setDwgOffNumber(String dwgOffNumber) {
        this.dwgOffNumber = dwgOffNumber;
    }

    public boolean isStateLandClearance() {
        return stateLandClearance;
    }

    public void setStateLandClearance(boolean stateLandClearance) {
        this.stateLandClearance = stateLandClearance;
    }

    public boolean isPlanningClearance() {
        return planningClearance;
    }

    public void setPlanningClearance(boolean planningClearance) {
        this.planningClearance = planningClearance;
    }

    public boolean isEnvironmentClearance() {
        return environmentClearance;
    }

    public void setEnvironmentClearance(boolean environmentClearance) {
        this.environmentClearance = environmentClearance;
    }
    
}
