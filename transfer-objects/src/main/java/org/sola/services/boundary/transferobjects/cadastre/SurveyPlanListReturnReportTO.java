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
    public SurveyPlanListReturnReportTO() {
        super();
    }

    //Getters
    public String getSurveyPlanid() {
        return surveyPlanid;
    }

    public String getlSNo() {
        return lSNo;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public String getPropertyNameOfStreet() {
        return propertyNameOfStreet;
    }

    public String getPropertyAddressNo() {
        return propertyAddressNo;
    }

    public String getLandtype() {
        return landtype;
    }

    public String getAreaOfLand() {
        return areaOfLand;
    }

    public String getLandManagement() {
        return landManagement;
    }

    public String getNameOfLicenseSurveyor() {
        return nameOfLicenseSurveyor;
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

    public String getDirectorOfSurveys() {
        return directorOfSurveys;
    }

    public Date getDateSurveyed() {
        return dateSurveyed;
    }

    public String getBeaconnumber() {
        return beaconnumber;
    }

    public String getNameOfCO() {
        return nameOfCO;
    }

    public String getNameOfSLCO() {
        return nameOfSLCO;
    }
    
}
