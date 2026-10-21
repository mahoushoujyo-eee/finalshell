package com.finalshell.core;

import com.finalshell.ui.panel.Kz4;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public class Ex2 extends EY {
   public final Kz4 K;

   public Ex2(Kz4 var1) {
      this.K = var1;
   }

   @Override
   public boolean A() {
      return this.K.y;
   }

   @Override
   public boolean d(List var1) {
      V3 var3 = this.K.O$V();
      String var10000 = Kz4.M();
      Iterator var4 = var1.iterator();
      String var2 = var10000;

      while (true) {
         if (var4.hasNext()) {
            label42: {
               File var5 = (File)var4.next();
               File var7 = var5;
               if (var2 != null) {
                  boolean var8 = var5.isDirectory();
                  if (var2 == null) {
                     return var8;
                  }

                  if (var8) {
      File var9;
                     var9 = var5;
                     break label42;
                  }

                  var7 = var5;
               }

               var9 = var7.getParentFile();
            }

            File var6 = var9;
            if (var2 == null) {
               break;
            }

            if (var3 != null) {
               boolean var10 = var3.accept(var6);
               if (var2 == null) {
                  return var10;
               }

               if (!var10) {
                  if (var2 != null) {
                     continue;
                  }

                  return false;
               }
            }

            this.K.X(var6);
            break;
         }

         return false;
      }

      return true;
   }
}





