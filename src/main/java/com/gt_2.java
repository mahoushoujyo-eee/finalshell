package com;

import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseWheelEvent;

class Gt_2 implements AWTEventListener {
   @Override
   public void eventDispatched(AWTEvent var1) {
      if (var1 instanceof MouseWheelEvent) {
         com.ac_2.q();
      }
   }
}





