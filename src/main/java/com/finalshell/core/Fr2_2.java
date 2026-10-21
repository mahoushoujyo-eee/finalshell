package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;

public abstract class Fr2_2 implements C_u_2 {
   public static Fr2_2 X;
   public final com.finalshell.ui.model.I y;
   public static Ky4[] c;

   protected Fr2_2(com.finalshell.ui.model.I var1) {
      this.y = var1;
   }

   @Override
   public com.finalshell.ui.model.I Q() {
      return this.y;
   }

   @Override
   public void M(String var1) throws B2_5 {
      throw new B2_5(var1, this.y);
   }

   static {
      __vfClinit__();
   }

   public static void v(Ky4[] var0) {
      c = var0;
   }

   public static Ky4[] M() {
      return c;
   }

   public static void __vfClinit__() {
      Ky4[] var10000 = new Ky4[4];
      X = new R_(com.finalshell.ui.model.I.z);
      v(var10000);
   }
}





