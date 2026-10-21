package com.finalshell.core;

public class HC_2 extends HP_2 {
   public final HA Z;
   public static String b;

   public HC_2(HA var1) {
      super(var1);
      this.Z = var1;
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
      return false;
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
      return new Hd2[0];
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
      return HA.v(this.Z).P;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "t.(Je".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 63;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 63;
         var10006 = var0;
      } else {
         var6 = 63;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            return;
         }

         var10005 = var10003;
         var10 = 63;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 40;
               break;
            case 1:
               var23 = 125;
               break;
            case 2:
               var23 = 120;
               break;
            case 3:
               var23 = 27;
               break;
            case 4:
               var23 = 63;
               break;
            case 5:
               var23 = 3;
               break;
            default:
               var23 = 110;
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
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





