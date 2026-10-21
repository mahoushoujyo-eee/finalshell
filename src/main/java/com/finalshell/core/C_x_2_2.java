package com.finalshell.core;

import java.util.Set;

public class C_x_2_2 extends K2_3 {
   public final Set e;

   public C_x_2_2(Set var1) {
      this.e = var1;
   }

   @Override
   public void w(NQ var1) {
      String[] var10000 = RG_2.C();
      String[] var3 = var1.z;
      int var4 = var3.length;
      String[] var2 = var10000;
      int var5 = 0;

      while (true) {
         if (var5 < var4) {
            String var6 = var3[var5];
            if (var2 != null) {
               boolean var7 = Character.isUpperCase(var6.charAt(0));
               if (var2 == null) {
                  break;
               }

               if (var7) {
                  return;
               }

               var5++;
            }

            if (var2 != null) {
               continue;
            }
         }

         this.e.add(var1.z[0]);
         break;
      }
   }
}





