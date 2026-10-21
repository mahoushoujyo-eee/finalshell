package com;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JComponent;
import javax.swing.TransferHandler;
import javax.swing.TransferHandler.TransferSupport;

public class Se_2 extends TransferHandler {
   private Component w;

   public Se_2(Component var1) {
      this.w = var1;
   }

   @Override
   public boolean canImport(TransferSupport var1) {
      int var10000 = EY.P();
      TransferHandler var3 = this.B();
      int var2 = var10000;
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
      int var10000 = EY.P();
      TransferHandler var3 = this.B();
      int var2 = var10000;
      TransferHandler var4 = var3;
      if (var2 == 0) {
         if (var3 == null) {
            return false;
         }

         var4 = var3;
      }

      boolean var5 = var4.importData(var1);
      return var2 != 0 ? var5 : var5;
   }

   private TransferHandler B() {
      return this.U(this.w.getParent());
   }

   private TransferHandler U(Container var1) {
      int var2;
      Object var10000;
      var2 = EY.P();
      var10000 = var1;
      label34:
      if (var2 == 0) {
         if (var1 != null) {
            var10000 = var1;
            if (var2 != 0) {
               break label34;
            }

            if (var1 instanceof JComponent) {
               var10000 = (JComponent)var1;
               if (var2 != 0) {
                  break label34;
               }

               if (var10000.getTransferHandler() != null) {
                  return ((JComponent)var1).getTransferHandler();
               }
            }
         }

         var10000 = var1;
      }

      if (var2 == 0) {
         if (var10000 == null) {
            return null;
         }

         var10000 = var1.getParent();
      }

      return var10000 != null ? this.U(var1.getParent()) : null;
   }
}





