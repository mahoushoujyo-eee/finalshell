package com.finalshell.core;

public class Dn2_2 extends Exception {
   public int Y;
   public static String a;

   public Dn2_2(int var1, String var2) {
      super(var2);
      this.Y = var1;
   }

   public Dn2_2(int var1, String var2, Throwable var3) {
      super(var2, var3);
      this.Y = var1;
   }

   @Override
   public String toString() {
      return this.Y + a + this.getMessage();
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "mR".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 83;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 83;
         var10006 = var0;
      } else {
         var6 = 83;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 83;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 4;
               break;
            case 1:
               var23 = 33;
               break;
            case 2:
               var23 = 61;
               break;
            case 3:
               var23 = 65;
               break;
            case 4:
               var23 = 86;
               break;
            case 5:
               var23 = 119;
               break;
            default:
               var23 = 32;
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





