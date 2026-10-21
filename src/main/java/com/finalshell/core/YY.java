package com.finalshell.core;

public class YY extends YZ {
   public static String c;

   @Override
   public String d() {
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
   public void i(byte[] var1, byte[] var2) throws Exception {
      super.i(var1, var2);
   }

   @Override
   public void Q(byte[] var1, byte[] var2) throws Exception {
      super.Q(var1, var2);
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
      char[] var10003 = "\u0016O\u0003w`E\\HO\u0003;!\u000e\t%O\u00182<UR\b".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 12;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 12;
         var10006 = var0;
      } else {
         var6 = 12;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            c = var9;
            return;
         }

         var10005 = var10003;
         var10 = 12;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 105;
               break;
            case 1:
               var23 = 48;
               break;
            case 2:
               var23 = 103;
               break;
            case 3:
               var23 = 86;
               break;
            case 4:
               var23 = 30;
               break;
            case 5:
               var23 = 58;
               break;
            default:
               var23 = 49;
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





