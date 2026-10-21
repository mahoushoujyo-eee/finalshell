package com.finalshell.core;

public class Hf2_2 extends HP_2 {
   static boolean F;
   final Hg2_2 i;
   public static String b;

   Hf2_2(Hg2_2 var1) {
      super(var1);
      this.i = var1;
   }

   @Override
   public H4_2[] f() {
      return new H4_2[0];
   }

   public com.finalshell.ui.model.S_3 p$_S() {
      return com.finalshell.ui.model.S_3.PUBLIC;
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public boolean F() {
      return false;
   }

   @Override
   public String K() {
      return b;
   }

   @Override
   public Hd2[] d() {
      return new Hd2[]{H3_2.Q(this.i.j).N};
   }

   @Override
   public boolean c() {
      return false;
   }

   @Override
   public Hd2[] S() {
      return new Hd2[0];
   }

   public Hd2 p$hd_2() {
      String[] var10000 = RG_2.C();
      Hd2 var2 = this.i.J.m;
      String[] var1 = var10000;
      if (!F) {
         if (var1 == null) {
            return var2;
         }

         if (var2 == null) {
            throw new AssertionError();
         }
      }

      return var2;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "I]F\u000e\u0013JK".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 106;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 106;
         var10006 = var0;
      } else {
         var6 = 106;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            F = !H3_2.class.desiredAssertionStatus();
            return;
         }

         var10005 = var10003;
         var10 = 106;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 85;
               break;
            case 1:
               var23 = 86;
               break;
            case 2:
               var23 = 64;
               break;
            case 3:
               var23 = 17;
               break;
            case 4:
               var23 = 28;
               break;
            case 5:
               var23 = 111;
               break;
            default:
               var23 = 71;
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
               b = var8;
               F = !H3_2.class.desiredAssertionStatus();
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





