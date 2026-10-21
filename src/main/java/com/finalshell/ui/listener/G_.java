package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class G_ extends MouseAdapter {
   final com.finalshell.core.O5 K;

   G_(com.finalshell.core.O5 var1) {
      this.K = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (FN.L(var1)) {
         this.K.r(var1);
      }
   }
}





