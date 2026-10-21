package com.finalshell.core;

import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseWheelEvent;

public class Gt2 implements AWTEventListener {
   Gt2() {
   }

   @Override
   public void eventDispatched(AWTEvent var1) {
      if (var1 instanceof MouseWheelEvent) {
         Ac2.q();
      }
   }
}





