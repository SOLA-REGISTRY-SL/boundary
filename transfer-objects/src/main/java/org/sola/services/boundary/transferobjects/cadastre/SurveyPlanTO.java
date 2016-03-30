/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.transferobjects.cadastre;

import java.math.BigDecimal;
import java.util.Date;
import org.sola.services.common.contracts.AbstractIdTO;

/**
 *
 * @author Moses VB Transfer object representing structure of SurveyPlan entity.
 */
public class SurveyPlanTO extends AbstractIdTO {
//Member Variables representing the Fields from the SOLA-SL DB
//We used almost the same columns in the database for simplicity even though not necessarily

    private String surveyPlanid; //= id
    private String lSNo;
    private String nameOfOwner;
    private String propertyNameOfStreet;
    private String propertyAddressNo;
    private String landtype;
    private String areaOfLand;
    private String landManagement;
    private String nameOfLicenseSurveyor;
    private String eastNeighborPlotHolder;
    private String westNeighborPlotHolder;
    private String northNeighborPlotHolder;
    private String southNeighborPlotHolder;
    private String surveyingMethod;
    private String directorOfSurveys;
    private Date dateSurveyed;
    private String beaconnumber;
    private String nameOfCO;
    private String nameOfSLCO;
    
    //COnstructor
    public SurveyPlanTO() {
        super();
    }
/*
    public String getSurveyPlanID() {
        return surveyPlanid;
    }
    public void setSurveyPlanID(String surveyPlanID){
        this.surveyPlanid=surveyPlanID;
    }
    
     public String getLSNo() {
        return lSNo;
    }
    public void setLSNo(String lSNo){
        this.lSNo=lSNo;
    }*/
    ///////////////////////

    public String getSurveyPlanid() {
        return surveyPlanid;
    }

    public void setSurveyPlanid(String surveyPlanid) {
        this.surveyPlanid = surveyPlanid;
    }

    public String getlSNo() {
        return lSNo;
    }

    public void setlSNo(String lSNo) {
        this.lSNo = lSNo;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public String getPropertyNameOfStreet() {
        return propertyNameOfStreet;
    }

    public void setPropertyNameOfStreet(String propertyNameOfStreet) {
        this.propertyNameOfStreet = propertyNameOfStreet;
    }

    public String getPropertyAddressNo() {
        return propertyAddressNo;
    }

    public void setPropertyAddressNo(String propertyAddressNo) {
        this.propertyAddressNo = propertyAddressNo;
    }

    public String getLandType() {
        return landtype;
    }

    public void setLandType(String landtype) {
        this.landtype = landtype;
    }
    
    public String getAreaOfLand() {
        return areaOfLand;
    }

    public void setAreaOfLand(String areaOfLand) {
        this.areaOfLand = areaOfLand;
    }

    public String getLandManagement() {
        return landManagement;
    }

    public void setLandManagement(String landManagement) {
        this.landManagement = landManagement;
    }

    public String getNameOfLicenseSurveyor() {
        return nameOfLicenseSurveyor;
    }

    public void setNameOfLicenseSurveyor(String nameOfLicenseSurveyor) {
        this.nameOfLicenseSurveyor = nameOfLicenseSurveyor;
    }

    public String getEastNeighborPlotHolder() {
        return eastNeighborPlotHolder;
    }

    public void setEastNeighborPlotHolder(String eastNeighborPlotHolder) {
        this.eastNeighborPlotHolder = eastNeighborPlotHolder;
    }

    public String getWestNeighborPlotHolder() {
        return westNeighborPlotHolder;
    }

    public void setWestNeighborPlotHolder(String westNeighborPlotHolder) {
        this.westNeighborPlotHolder = westNeighborPlotHolder;
    }

    public String getNorthNeighborPlotHolder() {
        return northNeighborPlotHolder;
    }

    public void setNorthNeighborPlotHolder(String northNeighborPlotHolder) {
        this.northNeighborPlotHolder = northNeighborPlotHolder;
    }

    public String getSouthNeighborPlotHolder() {
        return southNeighborPlotHolder;
    }

    public void setSouthNeighborPlotHolder(String southNeighborPlotHolder) {
        this.southNeighborPlotHolder = southNeighborPlotHolder;
    }

    public String getSurveyingMethod() {
        return surveyingMethod;
    }

    public void setSurveyingMethod(String surveyingMethod) {
        this.surveyingMethod = surveyingMethod;
    }

    public String getDirectorOfSurveys() {
        return directorOfSurveys;
    }

    public void setDirectorOfSurveys(String directorOfSurveys) {
        this.directorOfSurveys = directorOfSurveys;
    }

    public Date getDateSurveyed() {
        return dateSurveyed;
    }

    public void setDateSurveyed(Date dateSurveyed) {
        this.dateSurveyed = dateSurveyed;
    }

    public String getBeaconnumber() {
        return beaconnumber;
    }

    public void setBeaconnumber(String beaconnumber) {
        this.beaconnumber = beaconnumber;
    }

    public String getNameOfCO() {
        return nameOfCO;
    }

    public void setNameOfCO(String nameOfCO) {
        this.nameOfCO = nameOfCO;
    }
  
     public String getNameOfSLCO() {
        return nameOfSLCO;
    }

    public void setNameOfSLCO(String nameOfSLCO) {
        this.nameOfSLCO = nameOfSLCO;
    }
    
}
