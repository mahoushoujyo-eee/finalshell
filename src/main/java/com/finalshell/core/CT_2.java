package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;

public class CT_2 implements Fo2_2 {
   final K2_3 r;

   CT_2(K2_3 var1) {
      this.r = var1;
   }

   @C_9
   public Void R(NJ_3 var1) throws Throwable {
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      M3_2[] var3 = var1.n;
      Ky4[] var2 = var10000;

      for (M3_2 var6 : var3) {
         this.r.c(var6);
         if (var2 != null) {
            break;
         }
      }

      return null;
   }

   @C_9
   public Void B(NV_2 var1) throws Throwable {
      this.r.d(var1);
      return null;
   }

   @C_9
   @Override
   public Object q(NV_2 var1) throws Throwable {
      return this.B(var1);
   }

   @C_9
   @Override
   public Object u(NJ_3 var1) throws Throwable {
      return this.R(var1);
   }
}





