package com;

public class uN extends uV {
   private static final String a;

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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\">J%f6(\u001b\bi)Me\u001c!4@P".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 38;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 38;
         var10006 = var0;
      } else {
         var6 = 38;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 38;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 84;
               break;
            case 1:
               var23 = 90;
               break;
            case 2:
               var23 = 39;
               break;
            case 3:
               var23 = 71;
               break;
            case 4:
               var23 = 6;
               break;
            case 5:
               var23 = 34;
               break;
            default:
               var23 = 89;
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





