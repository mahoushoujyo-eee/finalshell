package com.finalshell.ui.listener;

import com.finalshell.ui.panel.K32;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JButton;

public class PW implements PropertyChangeListener {
   final com.finalshell.ui.panel.K22 c;

   PW(com.finalshell.ui.panel.K22 var1) {
      this.c = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      int[] var10000 = K32.L$arrint();
      Object var3 = var1.getSource();
      int[] var2 = var10000;
      var10000 = (int[])var3;
      if (var2 != null) {
         if (!(var3 instanceof JButton)) {
            return;
         }

         var10000 = (int[])var3;
      }

      JButton var4 = (JButton)var10000;
      int var5 = this.c.getComponentZOrder(var4);
      int var7 = var5;
      if (var2 != null) {
         if (var5 == -1) {
            return;
         }

         var7 = var5;
      }

      if (var2 != null) {
         if (var7 > 0) {
            this.c.getComponent(var5 - 1).repaint();
         }

         var7 = var5;
      }

      if (var7 < this.c.getComponentCount() - 1) {
         this.c.getComponent(var5 + 1).repaint();
      }
   }
}





