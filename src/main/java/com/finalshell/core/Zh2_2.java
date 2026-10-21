package com.finalshell.core;

public class Zh2_2 {
   String r;
   String O;
   String T;
   String d;
   String Z;
   public static int[] F;

   public String l() {
      int[] var10000 = n();
      String var2 = "";
      int[] var1 = var10000;
      String var4 = this.J();
      if (var1 != null) {
         label22:
         if (var4 != null) {
            String var3 = this.R();
            if (var3.startsWith(this.J())) {
            }

            String var5 = this.A();
            if (var1 != null) {
               if (var5.equals(this.k())) {
                  var2 = this.J() + " " + this.A() + " " + var3;
                  if (var1 != null) {
                     break label22;
                  }
               }

               var5 = this.J() + " " + this.A() + this.k() + " " + var3;
            }

            var2 = var5;
         }

         var4 = var2;
      }

      return var4;
   }

   public void f(String var1) {
      this.Z = var1;
   }

   public String J() {
      return this.r;
   }

   public void B(String var1) {
      this.r = var1;
   }

   public String k() {
      return this.O;
   }

   public void M(String var1) {
      this.O = var1;
   }

   public String A() {
      return this.T;
   }

   public void n(String var1) {
      this.T = var1;
   }

   public String R() {
      return this.d;
   }

   public void y(String var1) {
      this.d = var1;
   }

   public static void T(int[] var0) {
      F = var0;
   }

   public static int[] n() {
      return F;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (n() == null) {
         T(new int[1]);
      }
   }
}





