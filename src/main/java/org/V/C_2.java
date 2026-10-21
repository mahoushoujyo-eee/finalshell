package org.v;

import java.util.Map;

class C_2 implements h4 {
   final Map o;
   final Nt_2 s;
   final hT u;

   C_2(hT var1, Map var2, Nt_2 var3) {
      this.u = var1;
      this.o = var2;
      this.s = var3;
   }

   @Override
   public Object y(String var1) {
      return this.o.get(var1);
   }

   @Override
   public q_4 I() throws org.b_2 {
      return H_3.v(this.u.T, this.s);
   }
}





