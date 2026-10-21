package com;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileFilter;

class DZ extends com.b.b {
   final FileFilter r;

   DZ(ImageIcon var1, String var2, FileFilter var3) {
      super(var1, var2);
      this.r = var3;
   }

   @Override
   public boolean accept(File var1) {
      String var2 = com.FV.D();
      FileFilter var10000 = this.r;
      if (var2 == null) {
         if (this.r == null) {
            return true;
         }

         var10000 = this.r;
      }

      boolean var3 = var10000.accept(var1);
      return var2 != null ? var3 : var3;
   }

   @Override
   public boolean n(Object var1) {
      return this.accept((File)var1);
   }
}





