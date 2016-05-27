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

    private String id;

    private String LSNo;
   
    private String nameofOwner;

    private String address;

    private String landtype;

    private String areaOfLand;

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
    
    //COnstructor
    public SurveyPlanListReturnReportTO() {
        super();
    }

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

    public String getAreaOfLand() {
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
}
