package com.finalshell.core;

@O4(
   Z$String = "MultiPolygon",
   Z$arrString = {"type", "bbox", "coordinates"}
)
public class XH3 extends XY3 {
   public double[][][][] t;
   public static String a;

   public XH3() {
      super(a);
   }

   public double[][][][] K() {
      return this.t;
   }

   public void c(double[][][][] var1) {
      this.t = var1;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "7\u00123\bF5P\u0016\u001e8\u0013A".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 48;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 48;
         var10006 = var0;
      } else {
         var6 = 48;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 48;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 74;
               break;
            case 1:
               var23 = 87;
               break;
            case 2:
               var23 = 111;
               break;
            case 3:
               var23 = 76;
               break;
            case 4:
               var23 = 31;
               break;
            case 5:
               var23 = 85;
               break;
            default:
               var23 = 15;
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





