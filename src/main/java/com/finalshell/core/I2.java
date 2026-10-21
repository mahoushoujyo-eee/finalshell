package com.finalshell.core;

import java.io.File;
import javax.swing.ImageIcon;

public class I2 extends R2_2 {
   public final com.finalshell.ui.panel.T G;

   public I2(com.finalshell.ui.panel.T var1) {
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
      String var2 = com.finalshell.ui.panel.T.v$String();
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





