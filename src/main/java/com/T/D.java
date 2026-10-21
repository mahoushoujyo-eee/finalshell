package com.T;

import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import javax.swing.JButton;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;

class D implements HierarchyListener {
   final com.T.s y;

   D(com.T.s var1) {
      this.y = var1;
   }

   @Override
   public void hierarchyChanged(HierarchyEvent var1) {
      int var2 = com.T.E.D();
      HierarchyEvent var10000 = var1;
      if (var2 != 0) {
         if ((var1.getChangeFlags() & 1L) == 0L) {
            return;
         }

         var10000 = var1;
      }

      JButton var3 = (JButton)var10000.getComponent();
      JRootPane var4 = SwingUtilities.getRootPane(var3);
      JRootPane var5 = var4;
      if (var2 != 0) {
         if (var4 == null) {
            return;
         }

         var5 = var4;
      }

      var5.setDefaultButton(var3);
   }
}





