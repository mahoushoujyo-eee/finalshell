package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class G_ extends MouseAdapter {
   final com.O5 K;

   G_(com.O5 var1) {
      this.K = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (com.FN.L(var1)) {
         this.K.r(var1);
      }
   }
}





