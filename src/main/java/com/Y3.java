package com;

import javax.swing.table.DefaultTableModel;

class Y3 extends com.YO {
   final PQ V;
   final DefaultTableModel y;
   final xD_3 x;

   Y3(xD_3 var1, PQ var2, DefaultTableModel var3) {
      this.x = var1;
      this.V = var2;
      this.y = var3;
   }

   @Override
   public void T() {
      int[] var2 = this.V.getSelectedRows();
      this.y.setColumnIdentifiers(xD_3.d(this.x));
      String[] var10000 = xD_3.U();
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





