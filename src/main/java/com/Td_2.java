package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class Td_2 implements PropertyChangeListener {
   final com.Wb_2 d;

   Td_2(com.Wb_2 var1) {
      this.d = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      String var2 = com.Wb_2.m();
      com.Wb_2 var10000 = this.d;
      if (var2 != null) {
         if (!this.d.isEnabled()) {
            this.d.c();
            this.d.repaint();
            if (var2 != null) {
               return;
            }
         }

         com.Wb_2.O(this.d);
         var10000 = this.d;
      }

      var10000.repaint();
   }
}





