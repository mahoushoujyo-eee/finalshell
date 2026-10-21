package com.m;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JTree.DropLocation;

class P implements PropertyChangeListener {
   final com.m.K K;

   P(com.m.K var1) {
      this.K = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      String var10000 = com.m.s.d();
      DropLocation var3 = (DropLocation)var1.getOldValue();
      String var2 = var10000;
      DropLocation var5 = var3;
      if (var2 != null) {
         if (var3 != null) {
            com.m.K.B(this.K).repaint(this.K.p(var3.getPath()));
         }

         var5 = (DropLocation)var1.getNewValue();
      }

      DropLocation var4 = var5;
      if (var4 != null) {
         com.m.K.K(this.K).repaint(this.K.p(var4.getPath()));
      }
   }
}





