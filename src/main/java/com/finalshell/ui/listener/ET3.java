package com.finalshell.ui.listener;

import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import javax.swing.SwingUtilities;

public class ET3 implements HierarchyListener {
   final SetBackgroundImagePanel g;
   public static long a;

   ET3(SetBackgroundImagePanel var1) {
      this.g = var1;
   }

   @Override
   public void hierarchyChanged(HierarchyEvent var1) {
      SetBackgroundImagePanel var3;
      label24: {
         int var2 = ConnectionProperty.M$int();
         long var4;
         int var10000 = (var4 = (var1.getChangeFlags() & a) - 0L) == 0L ? 0 : (var4 < 0L ? -1 : 1);
         if (var2 != 0) {
            if (!var10000) {
               return;
            }

            var3 = this.g;
            if (var2 == 0) {
               break label24;
            }

            var10000 = (this.g.isShowing()) ? 1 : 0;
         }

         if (!var10000) {
            return;
         }

         SwingUtilities.invokeLater(this::lambda$hierarchyChanged$0);
         var3 = this.g;
      }

      var3.removeHierarchyListener(this);
   }

   public void lambda$hierarchyChanged$0() {
      SetBackgroundImagePanel.I(this.g);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 672374342924409146L;
      long var10002 = 672374342924409150L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





