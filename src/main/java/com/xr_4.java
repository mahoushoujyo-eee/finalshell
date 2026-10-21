package com;

@com.O4(
   Z = "MultiPoint",
   Z = {"type", "bbox", "coordinates"}
)
public class xr_4 extends xY_3 {
   private double[][] w;
   private static final String a;

   public xr_4() {
      super(a);
   }

   public double[][] m() {
      return this.w;
   }

   public void V(double[][] var1) {
      this.w = var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "l\u0012\u0011-o?QH\t\t".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 39;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 39;
         var10006 = var0;
      } else {
         var6 = 39;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 39;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 6;
               break;
            case 1:
               var23 = 64;
               break;
            case 2:
               var23 = 90;
               break;
            case 3:
               var23 = 126;
               break;
            case 4:
               var23 = 33;
               break;
            case 5:
               var23 = 72;
               break;
            default:
               var23 = 25;
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





