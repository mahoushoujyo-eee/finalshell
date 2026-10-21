package com;

import com.b.V;
import java.io.File;
import java.util.Iterator;
import java.util.List;

class Ex_2 extends EY {
   final com.kz_4 K;

   Ex_2(com.kz_4 var1) {
      this.K = var1;
   }

   @Override
   public boolean A() {
      return this.K.y;
   }

   @Override
   public boolean d(List var1) {
      V var3 = this.K.O();
      String var10000 = com.kz_4.M();
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





