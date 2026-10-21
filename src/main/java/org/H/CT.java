package org.H;

import org.v.NJ;
import org.v.NV;
import org.v.fo_2;

class CT implements fo_2 {
   final org.H.k_2 r;

   CT(org.H.k_2 var1) {
      this.r = var1;
   }

   @org.F.c
   public Void R(NJ var1) throws Throwable {
      com.ky_4[] var10000 = org.H.Cr_2.q();
      org.v.M[] var3 = var1.n;
      com.ky_4[] var2 = var10000;

      for (org.v.M var6 : var3) {
         this.r.c(var6);
         if (var2 != null) {
            break;
         }
      }

      return null;
   }

   @org.F.c
   public Void B(NV var1) throws Throwable {
      this.r.d(var1);
      return null;
   }

   @org.F.c
   @Override
   public Object q(NV var1) throws Throwable {
      return this.B(var1);
   }

   @org.F.c
   @Override
   public Object u(NJ var1) throws Throwable {
      return this.R(var1);
   }
}





