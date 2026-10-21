package com.finalshell.core;

public class U4_2 extends UV_2 {
   public static String a;

   @Override
   String y() {
      return a;
   }

   @Override
   public byte[] m(byte[] var1, int var2) {
      return super.m(var1, var2);
   }

   @Override
   public void l(byte[] var1, int var2) throws Exception {
      super.l(var1, var2);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u001b\u001cw.\u001a\tW\"*T\"1Zc\u0018\u0016}Yd\u000f".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 87;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 87;
         var10006 = var0;
      } else {
         var6 = 87;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 87;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 28;
               break;
            case 1:
               var23 = 9;
               break;
            case 2:
               var23 = 107;
               break;
            case 3:
               var23 = 61;
               break;
            case 4:
               var23 = 11;
               break;
            case 5:
               var23 = 108;
               break;
            default:
               var23 = 87;
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





