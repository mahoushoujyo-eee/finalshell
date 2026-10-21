package org.v;

public abstract class u_3 implements p_3 {
   final hd_2 u;

   public u_3(hd_2 var1) {
      this.u = var1;
   }

   @Override
   public abstract _S p();

   @Override
   public hd_2 o() {
      return this.u;
   }

   public abstract boolean b();

   public abstract hd_2 P() throws org.b_2;

   public abstract String h();

   public String F() throws org.b_2 {
      return hd_2.R(this.P()).z();
   }

   @org.F.c
   public abstract Object J() throws org.b_2;

   @Override
   public String toString() {
      return this.o().toString() + "." + this.h();
   }
}





