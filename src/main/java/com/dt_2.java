package com;

import java.io.File;
import java.io.FileFilter;
import javax.swing.ImageIcon;

class Dt_2 extends com.b.b {
   final FileFilter x;

   Dt_2(ImageIcon var1, String var2, FileFilter var3) {
      super(var1, var2);
      this.x = var3;
   }

   @Override
   public boolean accept(File var1) {
      String var2 = com.FV.D();
      FileFilter var10000 = this.x;
      if (var2 == null) {
         if (this.x == null) {
            return true;
         }

         var10000 = this.x;
      }

      boolean var3 = var10000.accept(var1);
      return var2 != null ? var3 : var3;
   }

   @Override
   public boolean n(Object var1) {
      return this.accept((File)var1);
   }
}





