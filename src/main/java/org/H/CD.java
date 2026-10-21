package org.H;

import org.v.NL;
import org.v.Nm_2;
import org.v.Ns_2;
import org.v.V_2;

class CD implements V_2 {
   final org.H.Cs_2 e;

   CD(org.H.Cs_2 var1) {
      this.e = var1;
   }

   public NL W(Nm_2 var1) throws org.b_2 {
      return this.e.J(var1);
   }

   public NL s(Ns_2 var1) throws org.b_2 {
      return this.e.c(var1);
   }

   @Override
   public Object a(Ns_2 var1) throws Throwable {
      return this.s(var1);
   }

   @Override
   public Object e(Nm_2 var1) throws Throwable {
      return this.W(var1);
   }
}





