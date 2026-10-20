/*
 * Decompiled with CFR 0.152.
 */
package com.apple.eawt.event;

import com.apple.eawt.event.GestureEvent;

public class PressureEvent
extends GestureEvent {
    private double pressure;
    private double stage;

    public double getPressure() {
        return this.pressure;
    }

    public double getStage() {
        return this.stage;
    }

    PressureEvent(double pressure, double stage) {
        this.pressure = pressure;
        this.stage = stage;
    }
}

