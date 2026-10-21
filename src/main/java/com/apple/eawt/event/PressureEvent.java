package com.apple.eawt.event;

public class PressureEvent extends GestureEvent {
   public double pressure;
   public double stage;

   public double getPressure() {
      return this.pressure;
   }

   public double getStage() {
      return this.stage;
   }

   public PressureEvent(double pressure, double stage) {
      this.pressure = pressure;
      this.stage = stage;
   }
}





