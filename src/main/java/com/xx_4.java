package com;

@com.O4(
   Z = "LineString",
   Z = {"type", "bbox", "coordinates"}
)
public class xx_4 extends xY_3 {
   private double[][] n;
   private static final String a;

   public xx_4() {
      super(a);
   }

   public double[][] L() {
      return this.n;
   }

   public void E(double[][] var1) {
      this.n = var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "6L[z7\u0014\u0000\u0013KR".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 105;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 105;
         var10006 = var0;
      } else {
         var6 = 105;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 105;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 19;
               break;
            case 1:
               var23 = 76;
               break;
            case 2:
               var23 = 92;
               break;
            case 3:
               var23 = 118;
               break;
            case 4:
               var23 = 13;
               break;
            case 5:
               var23 = 9;
               break;
            default:
               var23 = 27;
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





