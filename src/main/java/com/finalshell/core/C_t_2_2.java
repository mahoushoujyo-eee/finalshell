package com.finalshell.core;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class C_t_2_2 implements C_J {
   public final TypeVariable G;
   public final HA l;

   public C_t_2_2(HA var1, TypeVariable var2) {
      this.l = var1;
      this.G = var2;
   }

   @Override
   public String K() {
      return this.G.getName();
   }

   @Override
   public C_f_2[] t() throws B2_5 {
      Q4_3[] var1 = HA.f(this.l, this.G.getBounds());
      return Arrays.copyOf(var1, var1.length, C_f_2[].class);
   }
}





