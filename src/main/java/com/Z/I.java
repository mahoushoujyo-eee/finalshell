package com.Z;

import java.io.File;
import javax.swing.ImageIcon;

public class I extends com.b.R {
   final com.Z.T G;

   protected I(com.Z.T var1) {
      this.G = var1;
   }

   @Override
   public ImageIcon b() {
      return null;
   }

   @Override
   public String getDescription() {
      return null;
   }

   @Override
   public boolean accept(File var1) {
      String var2 = com.Z.T.v();
      boolean var10000 = this.G.v;
      if (var2 == null) {
         if (!this.G.v) {
            var10000 = var1.isHidden();
            if (var2 != null) {
               return var10000;
            }

            if (var10000) {
               return false;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   @Override
   public boolean n(Object var1) {
      return this.accept((File)var1);
   }
}





