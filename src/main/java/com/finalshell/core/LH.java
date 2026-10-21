package com.finalshell.core;

public class LH extends Lr2_2 {
   public static String c;

   @Override
   String X() {
      return c;
   }

   @Override
   public boolean g(byte[] var1) throws Exception {
      return super.g(var1);
   }

   @Override
   public void d(byte[] var1) throws Exception {
      super.d(var1);
   }

   @Override
   public byte[] k$arrbyte() throws Exception {
      return super.k$arrbyte();
   }

   @Override
   public void N(byte[] var1) throws Exception {
      super.N(var1);
   }

   @Override
   public void T(byte[] var1, byte[] var2) throws Exception {
      super.T(var1, var2);
   }

   @Override
   public void k$void() throws Exception {
      super.k$void();
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "b;;{`\u0007?o9m%oC?s(m=7".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 64;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 64;
         var10006 = var0;
      } else {
         var6 = 64;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            c = var9;
            return;
         }

         var10005 = var10003;
         var10 = 64;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 71;
               break;
            case 1:
               var23 = 24;
               break;
            case 2:
               var23 = 31;
               break;
            case 3:
               var23 = 72;
               break;
            case 4:
               var23 = 65;
               break;
            case 5:
               var23 = 106;
               break;
            default:
               var23 = 12;
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
               c = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





