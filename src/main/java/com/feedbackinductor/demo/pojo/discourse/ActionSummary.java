package com.feedbackinductor.demo.pojo.discourse;

public class ActionSummary {
    private int id;
    private int count;
    private boolean acted;
    private boolean can_undo;
    private boolean can_act;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isActed() {
        return acted;
    }

    public void setActed(boolean acted) {
        this.acted = acted;
    }

    public boolean isCan_undo() {
        return can_undo;
    }

    public void setCan_undo(boolean can_undo) {
        this.can_undo = can_undo;
    }

    public boolean isCan_act() {
        return can_act;
    }

    public void setCan_act(boolean can_act) {
        this.can_act = can_act;
    }
}

