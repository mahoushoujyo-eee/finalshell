package com.finalshell.core;

public class YB extends YZ {
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
      char[] var10003 = "\rg3E=\u0016ZSg3\t}P\r>g(\u0000a\u0006T\u0013".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 26;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 26;
         var10006 = var0;
      } else {
         var6 = 26;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            c = var9;
            return;
         }

         var10005 = var10003;
         var10 = 26;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 100;
               break;
            case 1:
               var23 = 14;
               break;
            case 2:
               var23 = 65;
               break;
            case 3:
               var23 = 114;
               break;
            case 4:
               var23 = 85;
               break;
            case 5:
               var23 = 127;
               break;
            default:
               var23 = 33;
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





