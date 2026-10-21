package com;

@com.O4(
   w = {xe_4.class, xx_4.class, xa_4.class, x1_2.class, xr_4.class, x9_2.class, xH_3.class, xQ_3.class, xg_4.class},
   W = "type"
)
public abstract class xY_3 {
   private final String S;
   private double[] r;
   private static String[] u;

   protected xY_3(String var1) {
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
      if (q() != null) {
         P(new String[1]);
      }
   }
}





