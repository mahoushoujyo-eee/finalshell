package com.finalshell.core;

@O4(
   w = {Xe4.class, Xx4.class, Xa4.class, X12.class, Xr4.class, X92.class, XH3.class, XQ3.class, Xg4.class},
   W = "type"
)
public abstract class XY3 {
   public final String S;
   public double[] r;
   public static String[] u;

   public XY3(String var1) {
      this.S = var1;
   }

   public String b() {
      return this.S;
   }

   public double[] a() {
      return this.r;
   }

   public void C(double[] var1) {
      this.r = var1;
   }

   public static void P(String[] var0) {
      u = var0;
   }

   public static String[] q() {
      return u;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (q() != null) {
         P(new String[1]);
      }
   }
}





