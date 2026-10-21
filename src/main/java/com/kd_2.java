package com;

import javax.swing.DefaultListSelectionModel;

public class Kd_2 extends DefaultListSelectionModel {
   @Override
   public void clearSelection() {
   }

   @Override
   public void removeSelectionInterval(int var1, int var2) {
      label16: {
         String[] var3 = com.CI.c();
         int var10000 = var1;
         int var10001 = this.getMinSelectionIndex();
         if (var3 == null) {
            if (var1 > var10001) {
               break label16;
            }

            var10000 = var2;
            var10001 = this.getMaxSelectionIndex();
         }

         if (var10000 >= var10001) {
            return;
         }
      }

      super.removeSelectionInterval(var1, var2);
   }
}





