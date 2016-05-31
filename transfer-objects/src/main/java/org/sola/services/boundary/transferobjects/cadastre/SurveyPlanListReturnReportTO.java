/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.transferobjects.cadastre;

import java.util.Date;
import org.sola.services.common.contracts.AbstractIdTO;
/**
 *
 * @author soladev
 */
public class SurveyPlanListReturnReportTO extends AbstractIdTO{
    
//Member Variables representing the Fields from the SOLA-SL DB
//We used almost the same columns in the database for simplicity even though not necessarily

//    private String id;

    private String LSNo;
   
    private String nameofOwner;

    private String address;

    private String landtype;

    private double areaOfLand;

    private String eastNeighborPlotHolder;

    private String westNeighborPlotHolder;

    private String northNeighborPlotHolder;

    private String southNeighborPlotHolder;

    private String surveyingMethod;

    private Date DateSurveyed;
    
    private String nameofLicenseSurveyor;

    private String surveyType;
    
    private String rfSurvey;
    
    private String surveyNumber;
    
    private Date dslDate;
    
   
//    GETTERS

    public String getLSNo() {
        return LSNo;
    }

    public String getNameofOwner() {
        return nameofOwner;
    }

    public String getAddress() {
        return address;
    }

    public String getLandtype() {
        return landtype;
    }

    public double getAreaOfLand() {
        return areaOfLand;
    }

    public String getEastNeighborPlotHolder() {
        return eastNeighborPlotHolder;
    }

    public String getWestNeighborPlotHolder() {
        return westNeighborPlotHolder;
    }

    public String getNorthNeighborPlotHolder() {
        return northNeighborPlotHolder;
    }

    public String getSouthNeighborPlotHolder() {
        return southNeighborPlotHolder;
    }

    public String getSurveyingMethod() {
        return surveyingMethod;
    }

    public Date getDateSurveyed() {
        return DateSurveyed;
    }

    public String getNameofLicenseSurveyor() {
        return nameofLicenseSurveyor;
    }

    public String getSurveyType() {
        return surveyType;
    }

    public String getRfSurvey() {
        return rfSurvey;
    }

    public String getSurveyNumber() {
        return surveyNumber;
    }

    public Date getDslDate() {
        return dslDate;
    }

    public void setLSNo(String LSNo) {
        this.LSNo = LSNo;
    }

    public void setNameofOwner(String nameofOwner) {
        this.nameofOwner = nameofOwner;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLandtype(String landtype) {
        this.landtype = landtype;
    }

    public void setAreaOfLand(double areaOfLand) {
        this.areaOfLand = areaOfLand;
    }

    public void setEastNeighborPlotHolder(String eastNeighborPlotHolder) {
        this.eastNeighborPlotHolder = eastNeighborPlotHolder;
    }

    public void setWestNeighborPlotHolder(String westNeighborPlotHolder) {
        this.westNeighborPlotHolder = westNeighborPlotHolder;
    }

    public void setNorthNeighborPlotHolder(String northNeighborPlotHolder) {
        this.northNeighborPlotHolder = northNeighborPlotHolder;
    }

    public void setSouthNeighborPlotHolder(String southNeighborPlotHolder) {
        this.southNeighborPlotHolder = southNeighborPlotHolder;
    }

    public void setSurveyingMethod(String surveyingMethod) {
        this.surveyingMethod = surveyingMethod;
    }

    public void setDateSurveyed(Date DateSurveyed) {
        this.DateSurveyed = DateSurveyed;
    }

    public void setNameofLicenseSurveyor(String nameofLicenseSurveyor) {
        this.nameofLicenseSurveyor = nameofLicenseSurveyor;
    }

    public void setSurveyType(String surveyType) {
        this.surveyType = surveyType;
    }

    public void setRfSurvey(String rfSurvey) {
        this.rfSurvey = rfSurvey;
    }

    public void setSurveyNumber(String surveyNumber) {
        this.surveyNumber = surveyNumber;
    }

    public void setDslDate(Date dslDate) {
        this.dslDate = dslDate;
    }
    
    
}
