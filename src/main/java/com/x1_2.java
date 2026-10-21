package com;

@com.O4(
   Z = "Point",
   Z = {"type", "bbox", "coordinates"}
)
public class x1_2 extends xY_3 {
   private double i;
   private double e;
   private static final String a;

   public x1_2() {
      super(a);
   }

   public double[] d() {
      String[] var1 = xY_3.q();
      double[] var10000 = new double[]{this.i, this.e};
      if (var1 != null) {
         com.ky_4.K(new String[4]);
      }

      return var10000;
   }

   public void I(double[] var1) {
      String[] var2 = xY_3.q();
      if (var2 == null) {
         label28:
         if (var1 != null) {
            int var10000 = var1.length;
            if (var2 == null) {
               if (var10000 == 0) {
                  break label28;
               }

               var10000 = var1.length;
            }

            if (var10000 == 1) {
               this.i = var1[0];
               return;
            }

            this.i = var1[0];
            this.e = var1[1];
            if (com.ky_4.F() != null) {
               xY_3.P(new String[5]);
            }

            return;
         }

         this.i = 0.0;
         this.e = 0.0;
      }
   }

   @E6(
      W = false
   )
   public double c() {
      return this.i;
   }

   @E6(
      W = false
   )
   public double G() {
      return this.e;
   }

   @E6(
      Y = false
   )
   public void I(double var1) {
      this.i = var1;
   }

   @E6(
      Y = false
   )
   public void L(double var1) {
      this.e = var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "H\b\u0015\u0015^".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 84;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 84;
         var10006 = var0;
      } else {
         var6 = 84;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 84;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 76;
               break;
            case 1:
               var23 = 51;
               break;
            case 2:
               var23 = 40;
               break;
            case 3:
               var23 = 47;
               break;
            case 4:
               var23 = 126;
               break;
            case 5:
               var23 = 57;
               break;
            default:
               var23 = 40;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





