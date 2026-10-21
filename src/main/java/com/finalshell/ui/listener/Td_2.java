package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Wb2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Td_2 implements PropertyChangeListener {
   final Wb2 d;

   Td_2(Wb2 var1) {
      this.d = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      String var2 = Wb2.m$String();
      Wb2 var10000 = this.d;
      if (var2 != null) {
         if (!this.d.isEnabled()) {
            this.d.c();
            this.d.repaint();
            if (var2 != null) {
               return;
            }
         }

         Wb2.O(this.d);
         var10000 = this.d;
      }

      var10000.repaint();
   }
}





