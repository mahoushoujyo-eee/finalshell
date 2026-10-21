package com.finalshell.core;

import java.util.Map;

public class C22_3 implements H4_2 {
   final Map o;
   final Nt2_2 s;
   final HT u;

   C22_3(HT var1, Map var2, Nt2_2 var3) {
      this.u = var1;
      this.o = var2;
      this.s = var3;
   }

   @Override
   public Object y(String var1) {
      return this.o.get(var1);
   }

   @Override
   public Q4_3 I() throws B2_5 {
      return H3_2.v(this.u.T, this.s);
   }
}





