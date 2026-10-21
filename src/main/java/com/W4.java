package com;

public class W4 implements Comparable {
   private String c;
   private String N;
   private _p_2 I;

   W4(String var1, String var2, _p_2 var3) {
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

   public _p_2 x() {
      return this.I;
   }

   void E(_p_2 var1) {
      this.I = var1;
   }

   @Override
   public String toString() {
      return this.N;
   }

   public int A(com.W4 var1) {
      return this.c.compareTo(var1.z());
   }

   @Override
   public int compareTo(Object var1) {
      return this.A((com.W4)var1);
   }
}





