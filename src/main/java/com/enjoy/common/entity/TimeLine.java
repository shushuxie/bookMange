package com.enjoy.common.entity;

public class TimeLine {
    private String id;

    private String dateId;

    private String eventTitle;

    private String eventPicture;

    private String eventDescrible;

    private String editable;

    private String addnewable;

    private String createtime;

    private String updatetime;

    private String creator;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDateId() {
        return dateId;
    }

    public void setDateId(String dateId) {
        this.dateId = dateId == null ? null : dateId.trim();
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle == null ? null : eventTitle.trim();
    }

    public String getEventPicture() {
        return eventPicture;
    }

    public void setEventPicture(String eventPicture) {
        this.eventPicture = eventPicture == null ? null : eventPicture.trim();
    }

    public String getEventDescrible() {
        return eventDescrible;
    }

    public void setEventDescrible(String eventDescrible) {
        this.eventDescrible = eventDescrible == null ? null : eventDescrible.trim();
    }

    public String getEditable() {
        return editable;
    }

    public void setEditable(String editable) {
        this.editable = editable == null ? null : editable.trim();
    }

    public String getAddnewable() {
        return addnewable;
    }

    public void setAddnewable(String addnewable) {
        this.addnewable = addnewable == null ? null : addnewable.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }
}