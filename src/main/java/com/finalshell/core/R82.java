package com.finalshell.core;

import java.awt.Image;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.TransferHandler;
import javax.swing.TransferHandler.TransferSupport;

public class R82 extends TransferHandler {
   @Override
   public boolean canImport(TransferSupport var1) {
      return this.M();
   }

   @Override
   public boolean importData(TransferSupport var1) {
      int var2 = EY.G();
      boolean var10000 = var1.isDrop();
      if (var2 != 0) {
         if (!var10000) {
            return false;
         }

         var10000 = this.x(var1.getTransferable());
      }

      return var2 == 0 ? var10000 : var10000;
   }

   public boolean x(Transferable var1) {
      int var2 = EY.G();
      boolean var10000 = this.M();
      if (var2 != 0) {
         if (var10000) {
            ArrayList var3;
            label55: {
               var3 = new ArrayList();
               List var4 = PG.s(var1);
               List var8 = var4;
               if (var2 != 0) {
                  if (var4 == null) {
                     break label55;
                  }

                  var8 = var4;
               }

               for (File var6 : var8) {
                  var3.add(new ImageIcon(var6.getAbsolutePath()));
                  if (var2 == 0) {
                     break;
                  }
               }
            }

            Image var7 = PG.T(var1);
            if (var7 != null) {
               var3.add(new ImageIcon(var7));
            }

            var10000 = this.M();
            if (var2 != 0) {
               if (!var10000) {
                  return false;
               }

               var10000 = this.h(var3);
            }

            if (var2 == 0) {
               return var10000;
            }

            if (var10000) {
               return true;
            }

            return false;
         }

         var10000 = false;
      }

      return var10000;
   }

   protected boolean M() {
      return true;
   }

   protected boolean h(List var1) {
      return true;
   }
}





