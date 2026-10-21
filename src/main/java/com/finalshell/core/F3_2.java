package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;

public class F3_2 extends V3 {
   protected com.finalshell.ui.model.A_3 O;
   protected V3 t;
   protected List k;

   public F3_2(FileFilter[] var1) {
      this(com.finalshell.ui.model.A_3.AND, var1);
   }

   public F3_2(com.finalshell.ui.model.A_3 var1, FileFilter[] var2) {
      this(var2 != null && var2.length > 0 && var2[0] instanceof V3 ? (V3)var2[0] : null, var1, var2);
   }

   public F3_2(V3 var1, com.finalshell.ui.model.A_3 var2, FileFilter[] var3) {
      this.O = var2;
      this.t = var1;
      this.k = new ArrayList();
      if (var3 != null) {
         Collections.addAll(this.k, var3);
      }
   }

   @Override
   public ImageIcon b() {
      Ky4[] var1 = V3.L();
      V3 var10000 = this.t;
      if (var1 != null) {
         if (this.t == null) {
            return null;
         }

         var10000 = this.t;
      }

      return var10000.b();
   }

   @Override
   public String getDescription() {
      Ky4[] var1 = V3.L();
      V3 var10000 = this.t;
      if (var1 != null) {
         if (this.t == null) {
            return null;
         }

         var10000 = this.t;
      }

      return var10000.getDescription();
   }

   @Override
   public boolean accept(File var1) {
      Ky4[] var2 = V3.L();
      F3_2 var10000 = this;
      if (var2 != null) {
         if (this.O.equals(com.finalshell.ui.model.A_3.AND)) {
            for (FileFilter var6 : this.k) {
               label78: {
                  FileFilter var9 = var6;
                  if (var2 != null) {
                     if (var6 == null) {
                        break label78;
                     }

                     var9 = var6;
                  }

                  boolean var10 = var9.accept(var1);
                  if (var2 == null) {
                     return var10;
                  }

                  if (!var10) {
                     return false;
                  }
               }

               if (var2 == null) {
                  Ky4.K(new String[5]);
                  break;
               }
            }

            return true;
         }

         var10000 = this;
      }

      for (FileFilter var4 : var10000.k) {
         FileFilter var7 = var4;
         if (var2 != null) {
            if (var4 == null) {
               return true;
            }

            var7 = var4;
         }

         boolean var8 = var7.accept(var1);
         if (var2 == null) {
            return var8;
         }

         if (!var8) {
            if (var2 != null) {
               continue;
            }
            break;
         }

         return true;
      }

      return false;
   }

   @Override
   public boolean n(Object var1) {
      return this.accept((File)var1);
   }
}





