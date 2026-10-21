package com.finalshell.core;

public class O extends Exception {
   public String m;
   public static String a;

   O(String var1) {
      super(var1);
      this.m = var1;
   }

   O(String var1, int var2) {
      super(a + var2);
      this.m = var1;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "41\"ZOR7q~m\u0014".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 15;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 15;
         var10006 = var0;
      } else {
         var6 = 15;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 15;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 94;
               break;
            case 1:
               var23 = 76;
               break;
            case 2:
               var23 = 95;
               break;
            case 3:
               var23 = 59;
               break;
            case 4:
               var23 = 47;
               break;
            case 5:
               var23 = 117;
               break;
            default:
               var23 = 17;
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





