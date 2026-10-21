package com.finalshell.core;

public class W4_2 implements Comparable {
   public String c;
   public String N;
   public C_p_2 I;

   W4_2(String var1, String var2, C_p_2 var3) {
      this.G(var1);
      this.h(var2);
      this.E(var3);
   }

   public String z() {
      return this.c;
   }

   void G(String var1) {
      this.c = var1;
   }

   public String P() {
      return this.N;
   }

   void h(String var1) {
      this.N = var1;
   }

   public C_p_2 x() {
      return this.I;
   }

   void E(C_p_2 var1) {
      this.I = var1;
   }

   @Override
   public String toString() {
      return this.N;
   }

   public int A(W4_2 var1) {
      return this.c.compareTo(var1.z());
   }

   @Override
   public int compareTo(Object var1) {
      return this.A((W4_2)var1);
   }
}





