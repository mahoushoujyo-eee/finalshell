package com.apple.eawt.event;

public class PressureEvent extends GestureEvent {
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





