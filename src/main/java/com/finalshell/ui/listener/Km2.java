package com.finalshell.ui.listener;

import com.finalshell.core.Yc2_2;
import com.finalshell.ui.panel.CI;
import java.awt.Rectangle;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Km2 implements ListSelectionListener {
   final Yc2_2 O;

   Km2(Yc2_2 var1) {
      this.O = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      String[] var2 = CI.c();
      int var10000 = this.O.V;
      if (var2 == null) {
         if (!this.O.V) {
            return;
         }

         var10000 = Yc2_2.o(this.O).getSelectedIndex();
      }

      if (var2 == null) {
         if (var10000 == -1) {
            return;
         }

         var10000 = Yc2_2.W(this.O).getLeadSelectionIndex();
      }

      int var3 = var10000;
      Rectangle var4 = this.O.getCellBounds(Yc2_2.i(this.O), var3, var3);
      Rectangle var5 = var4;
      if (var2 == null) {
         if (var4 == null) {
            return;
         }

         var5 = var4;
      }

      if (!var5.intersects(Yc2_2.b(this.O).getVisibleRect())) {
         Yc2_2.O(this.O).scrollRectToVisible(var4);
      }
   }
}





