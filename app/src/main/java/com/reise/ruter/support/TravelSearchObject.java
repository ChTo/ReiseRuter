package com.reise.ruter.support;

/**
 * Created by Tony Chau on 24/01/2015.
 */
public class TravelSearchObject{
    private String fromplace;
    private String toplace;
    private String isafter;
    private String time;
    private String changemargin;
    private String changepunish;
    private String walkingfactor;
    private String proposals;
    private String transporttypes;
    private String maxwalkingminutes;
    private String linenames;

    public TravelSearchObject(){
        fromplace = null;
        toplace = null;
        isafter = null;
        time = null;
        changemargin = null;
        changepunish = null;
        walkingfactor = null;
        proposals = null;
        transporttypes = null;
        maxwalkingminutes = null;
        linenames = null;
    }

    public String getFromplace() {
        return fromplace;
    }

    public void setFromplace(String fromplace) {
        this.fromplace = fromplace;
    }

    public String getToplace() {
        return toplace;
    }

    public void setToplace(String toplace) {
        this.toplace = toplace;
    }

    public Boolean getIsafter() {
        if(isafter.equalsIgnoreCase("True"))
            return true;
        else
            return false;
    }

    public void setIsafter(Boolean isafter) {
        if(isafter)
            this.isafter = "True";
        else
            this.isafter = "False";
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getChangemargin() {
        return changemargin;
    }

    public void setChangemargin(String changemargin) {
        this.changemargin = changemargin;
    }

    public String getChangepunish() {
        return changepunish;
    }

    public void setChangepunish(String changepunish) {
        this.changepunish = changepunish;
    }

    public String getWalkingfactor() {
        return walkingfactor;
    }

    public void setWalkingfactor(String walkingfactor) {
        this.walkingfactor = walkingfactor;
    }

    public String getProposals() {
        return proposals;
    }

    public void setProposals(String proposals) {
        this.proposals = proposals;
    }

    public String getTransporttypes() {
        return transporttypes;
    }

    public void setTransporttypes(String transporttypes) {
        this.transporttypes = transporttypes;
    }

    public String getMaxwalkingminutes() {
        return maxwalkingminutes;
    }

    public void setMaxwalkingminutes(String maxwalkingminutes) {
        this.maxwalkingminutes = maxwalkingminutes;
    }

    public String getLinenames() {
        return linenames;
    }

    public void setLinenames(String linenames) {
        this.linenames = linenames;
    }

}
