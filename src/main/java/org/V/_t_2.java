package org.v;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

class _t_2 implements _J {
   final TypeVariable G;
   final hA l;

   _t_2(hA var1, TypeVariable var2) {
      this.l = var1;
      this.G = var2;
   }

   @Override
   public String K() {
      return this.G.getName();
   }

   @Override
   public _f_2[] t() throws org.b_2 {
      q_4[] var1 = hA.f(this.l, this.G.getBounds());
      return Arrays.copyOf(var1, var1.length, _f_2[].class);
   }
}





