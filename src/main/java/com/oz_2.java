package com;

import javax.swing.JComponent;
import javax.swing.TransferHandler;
import javax.swing.TransferHandler.TransferSupport;

public class Oz_2 extends TransferHandler {
   private JComponent X;

   public Oz_2() {
      this.X = null;
   }

   public Oz_2(JComponent var1) {
      this.X = var1;
   }

   public JComponent Z() {
      return this.X;
   }

   public void Z(JComponent var1) {
      this.X = var1;
   }

   @Override
   public boolean canImport(TransferSupport var1) {
      int var2 = EY.P();
      JComponent var10000 = this.X;
      if (var2 == 0) {
         if (this.X == null) {
            return PG.q(var1);
         }

         var10000 = this.X;
      }

      TransferHandler var3 = var10000.getTransferHandler();
      TransferHandler var4 = var3;
      if (var2 == 0) {
         if (var3 == null) {
            return false;
         }

         var4 = var3;
      }

      boolean var5 = var4.canImport(var1);
      return var2 != 0 ? var5 : var5;
   }

   @Override
   public boolean importData(TransferSupport var1) {
      int var2 = EY.G();
      JComponent var10000 = this.X;
      if (var2 != 0) {
         if (this.X == null) {
            return PG.u(var1);
         }

         var10000 = this.X;
      }

      TransferHandler var3 = var10000.getTransferHandler();
      TransferHandler var4 = var3;
      if (var2 != 0) {
         if (var3 == null) {
            return false;
         }

         var4 = var3;
      }

      boolean var5 = var4.importData(var1);
      return var2 == 0 ? var5 : var5;
   }
}





