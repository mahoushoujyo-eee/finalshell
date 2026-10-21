package com;

import java.security.PrivilegedAction;

class wn_4 implements PrivilegedAction {
   private static final String a;

   public String u() {
      return System.getProperty(a);
   }

   @Override
   public Object run() {
      return this.u();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "[K\u0002\u007f,R?".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 111;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 111;
         var10006 = var0;
      } else {
         var6 = 111;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 111;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 91;
               break;
            case 1:
               var23 = 87;
               break;
            case 2:
               var23 = 67;
               break;
            case 3:
               var23 = 126;
               break;
            case 4:
               var23 = 34;
               break;
            case 5:
               var23 = 80;
               break;
            default:
               var23 = 53;
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





