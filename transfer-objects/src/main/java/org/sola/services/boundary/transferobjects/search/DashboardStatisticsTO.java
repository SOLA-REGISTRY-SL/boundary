package org.sola.services.boundary.transferobjects.search;

import org.sola.services.common.contracts.AbstractTO;

public class DashboardStatisticsTO extends AbstractTO {
    private long assignedAll;
    private long unassignedAll;
    private long myApps;
    private long plLodged;
    private long slLodged;
    private long plForCapture;
    private long slForCapture;
    private long plForApproval;
    private long slForApproval;
    private long plForStateClearance;
    private long plForPlanningClearance;
    private long plForEnvClearance;
    private long plForCompletion;
    private long slForCompletion;
    private long plApproved;
    private long slApproved;
    
    public DashboardStatisticsTO(){
        super();
    }

    public long getAssignedAll() {
        return assignedAll;
    }

    public void setAssignedAll(long assignedAll) {
        this.assignedAll = assignedAll;
    }

    public long getUnassignedAll() {
        return unassignedAll;
    }

    public void setUnassignedAll(long unassignedAll) {
        this.unassignedAll = unassignedAll;
    }

    public long getMyApps() {
        return myApps;
    }

    public void setMyApps(long myApps) {
        this.myApps = myApps;
    }

    public long getPlLodged() {
        return plLodged;
    }

    public void setPlLodged(long plLodged) {
        this.plLodged = plLodged;
    }

    public long getSlLodged() {
        return slLodged;
    }

    public void setSlLodged(long slLodged) {
        this.slLodged = slLodged;
    }

    public long getPlForCapture() {
        return plForCapture;
    }

    public void setPlForCapture(long plForCapture) {
        this.plForCapture = plForCapture;
    }

    public long getSlForCapture() {
        return slForCapture;
    }

    public void setSlForCapture(long slForCapture) {
        this.slForCapture = slForCapture;
    }

    public long getPlForApproval() {
        return plForApproval;
    }

    public void setPlForApproval(long plForApproval) {
        this.plForApproval = plForApproval;
    }

    public long getSlForApproval() {
        return slForApproval;
    }

    public void setSlForApproval(long slForApproval) {
        this.slForApproval = slForApproval;
    }

    public long getPlForStateClearance() {
        return plForStateClearance;
    }

    public void setPlForStateClearance(long plForStateClearance) {
        this.plForStateClearance = plForStateClearance;
    }

    public long getPlForPlanningClearance() {
        return plForPlanningClearance;
    }

    public void setPlForPlanningClearance(long plForPlanningClearance) {
        this.plForPlanningClearance = plForPlanningClearance;
    }

    public long getPlForEnvClearance() {
        return plForEnvClearance;
    }

    public void setPlForEnvClearance(long plForEnvClearance) {
        this.plForEnvClearance = plForEnvClearance;
    }

    public long getPlForCompletion() {
        return plForCompletion;
    }

    public void setPlForCompletion(long plForCompletion) {
        this.plForCompletion = plForCompletion;
    }

    public long getSlForCompletion() {
        return slForCompletion;
    }

    public void setSlForCompletion(long slForCompletion) {
        this.slForCompletion = slForCompletion;
    }

    public long getPlApproved() {
        return plApproved;
    }

    public void setPlApproved(long plApproved) {
        this.plApproved = plApproved;
    }

    public long getSlApproved() {
        return slApproved;
    }

    public void setSlApproved(long slApproved) {
        this.slApproved = slApproved;
    }
}
