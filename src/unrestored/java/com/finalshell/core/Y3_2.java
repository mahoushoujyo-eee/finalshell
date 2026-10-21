package com.finalshell.core;

import com.finalshell.ui.frame.XD3;
import javax.swing.table.DefaultTableModel;

public class Y3_2 extends YO {
   public final PQ V;
   public final DefaultTableModel y;
   public final XD3 x;

   public Y3_2(XD3 var1, PQ var2, DefaultTableModel var3) {
      this.x = var1;
      this.V = var2;
      this.y = var3;
   }

   @Override
   public void T() {
      int[] var2 = this.V.getSelectedRows();
      this.y.setColumnIdentifiers(XD3.d(this.x));
      String[] var10000 = XD3.U();
      int[] var3 = var2;
      int var4 = var2.length;
      String[] var1 = var10000;
      int var5 = 0;

      while (var5 < var4) {
         int var6 = var3[var5];
         this.V.addRowSelectionInterval(var6, var6);
         var5++;
         if (var1 != null) {
            break;
         }
      }
   }
}





