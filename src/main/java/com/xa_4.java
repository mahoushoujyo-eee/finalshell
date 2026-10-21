package com;

@com.O4(
   Z = "MultiLineString",
   Z = {"type", "bbox", "coordinates"}
)
public class xa_4 extends xY_3 {
   private double[][][] K;
   private static final String a;

   public xa_4() {
      super(a);
   }

   public double[][][] R() {
      return this.K;
   }

   public void h(double[][][] var1) {
      this.K = var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u0012xh\u000bL]\u001c1hW\u000bWx\u001b8".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 74;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 74;
         var10006 = var0;
      } else {
         var6 = 74;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 74;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 21;
               break;
            case 1:
               var23 = 71;
               break;
            case 2:
               var23 = 78;
               break;
            case 3:
               var23 = 53;
               break;
            case 4:
               var23 = 111;
               break;
            case 5:
               var23 = 91;
               break;
            default:
               var23 = 63;
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





