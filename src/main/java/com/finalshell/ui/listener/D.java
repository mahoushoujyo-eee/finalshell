package com.finalshell.ui.listener;

import com.finalshell.core.E2_2;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import javax.swing.JButton;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;

public class D implements HierarchyListener {
   final com.finalshell.core.S_2 y;

   D(com.finalshell.core.S_2 var1) {
      this.y = var1;
   }

   @Override
   public void hierarchyChanged(HierarchyEvent var1) {
      int var2 = E2_2.D();
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





