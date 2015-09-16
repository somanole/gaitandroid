package com.gaitproject.gait;

public class Acceleration {

    private long userid;
    private long timestamp;
    private double x;
    private double y;
    private double z;

    public Acceleration(float x_value, float y_value, float z_value, long timestamp, long userid) {
        x= new Double(""+x_value);
        y= new Double(""+y_value);
        z= new Double(""+z_value);
        this.timestamp = timestamp;
        this.userid = userid;
    }

    public long getUserid() { return userid; }

    public long getTimestamp() {
        return timestamp;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}

