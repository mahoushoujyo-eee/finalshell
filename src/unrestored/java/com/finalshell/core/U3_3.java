package com.finalshell.core;

public abstract class U3_3 implements P3_2 {
   public final Hd2 u;

   public U3_3(Hd2 var1) {
      this.u = var1;
   }

   @Override
   public abstract com.finalshell.ui.model.S_3 p();

   @Override
   public Hd2 o() {
      return this.u;
   }

   public abstract boolean b();

   public abstract Hd2 P() throws B2_5;

   public abstract String h();

   public String F() throws B2_5 {
      return Hd2.R(this.P()).z$String();
   }

   @C_9
   public abstract Object J() throws B2_5;

   @Override
   public String toString() {
      return this.o().toString() + "." + this.h();
   }
}





