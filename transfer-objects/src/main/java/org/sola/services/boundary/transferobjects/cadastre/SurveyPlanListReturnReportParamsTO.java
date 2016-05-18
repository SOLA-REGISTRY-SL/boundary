/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.transferobjects.cadastre;

import java.util.Date;
import org.sola.services.common.contracts.AbstractTO;

/**
 *
 * @author soladev
 */
public class SurveyPlanListReturnReportParamsTO extends AbstractTO {

    private Date fromDate;
    private Date toDate;

    //COnstructor
    public SurveyPlanListReturnReportParamsTO() {
        super();
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

}
