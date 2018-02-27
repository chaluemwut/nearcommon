package nsc.nearcommon;

import java.io.Serializable;
import java.math.BigDecimal;

public class LocationMapping implements Serializable {
    private int locId;
    private String locName;
    private double distance;

    public int getLocId() {
        return locId;
    }

    public void setLocId(int locId) {
        this.locId = locId;
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
