package org.v;

import java.util.Set;

class _Q extends org.H.k_2 {
   final Set h;
   final Set V;

   _Q(Set var1, Set var2) {
      this.h = var1;
      this.V = var2;
   }

   @Override
   public void b(RX var1) {
      Rq_2[] var3 = var1.p;
      String[] var10000 = RG.C();
      int var4 = var3.length;
      String[] var2 = var10000;
      int var5 = 0;

      while (true) {
         if (var5 < var4) {
            Rq_2 var6 = var3[var5];
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
      String[] var10000 = RG.C();
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





