package com;

import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import javax.swing.SwingUtilities;

class eT_3 implements HierarchyListener {
   final pA_3 g;
   private static final long a;

   eT_3(pA_3 var1) {
      this.g = var1;
   }

   @Override
   public void hierarchyChanged(HierarchyEvent var1) {
      pA_3 var3;
      label24: {
         int var2 = _y_2.M();
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

            var10000 = this.g.isShowing();
         }

         if (!var10000) {
            return;
         }

         SwingUtilities.invokeLater(this::lambda$hierarchyChanged$0);
         var3 = this.g;
      }

      var3.removeHierarchyListener(this);
   }

   private void lambda$hierarchyChanged$0() {
      pA_3.I(this.g);
   }

   static {
      long var0 = 672374342924409146L;
      long var10002 = 672374342924409150L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





