package com.finalshell.core;

import java.util.Set;

public class C_Q_2 extends K2_3 {
   public final Set h;
   public final Set V;

   public C_Q_2(Set var1, Set var2) {
      this.h = var1;
      this.V = var2;
   }

   @Override
   public void b(RX_2 var1) {
      Rq2_2[] var3 = var1.p;
      String[] var10000 = RG_2.C();
      int var4 = var3.length;
      String[] var2 = var10000;
      int var5 = 0;

      while (true) {
         if (var5 < var4) {
            Rq2_2 var6 = var3[var5];
            this.h.add(var6.S);
            var5++;
            if (var2 == null) {
               break;
            }

            if (var2 != null) {
               continue;
            }
         }

         super.b(var1);
         break;
      }
   }

   @Override
   public void w(NQ var1) {
      String[] var10000 = RG_2.C();
      int var3 = 0;
      String[] var2 = var10000;

      while (true) {
         if (var3 < var1.z.length) {
            var4 = Character.isUpperCase(var1.z[var3].charAt(0));
            if (var2 == null) {
               break;
            }

            if (var4) {
               return;
            }

            var3++;
            if (var2 != null) {
               continue;
            }
         }

         var4 = this.h.contains(var1.z[0]);
         break;
      }

      if (var2 != null) {
         if (var4) {
            return;
         }

         this.V.add(var1.z[0]);
      }
   }
}





