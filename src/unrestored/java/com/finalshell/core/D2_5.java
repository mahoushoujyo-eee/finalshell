package com.finalshell.core;

import java.io.File;

public abstract class D2_5 extends U2_3 {
   @C_9
   @Override
   public final N_6 J(String var1) {
      File var2 = this.C(var1);
      return var2 == null ? null : new D_2_3(var2);
   }

   @C_9
   public abstract File C(String var1);
}





