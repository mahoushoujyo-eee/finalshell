package com.finalshell.core;

public class HK2 extends Hd2 {
   final Hd2 a;
   final C_L Q;
   public static String c;
   public static long j;

   HK2(C_L var1, Hd2 var2) {
      this.Q = var1;
      this.a = var2;
   }

   @Override
   protected C_J[] V$arr_J() {
      return new C_J[0];
   }

   @Override
   public Hv2_2[] C() {
      return new Hv2_2[0];
   }

   @Override
   public HP_2[] H() {
      return new HP_2[]{new HX_2(this)};
   }

   @Override
   public U3_3[] A$arru_3() {
      return new U3_3[0];
   }

   @Override
   public Hd2[] j$arrhd_2() {
      return new Hd2[0];
   }

   @C_9
   @Override
   public Hd2 V$hd_2() {
      return null;
   }

   @C_9
   @Override
   public Hd2 l$hd_2() {
      return null;
   }

   @Override
   public Hd2 g() {
      return this.Q.P;
   }

   @Override
   public Hd2[] l$arrhd_2() {
      return new Hd2[0];
   }

   @Override
   public String J() {
      return (int)j + this.a.z$String();
   }

   @Override
   public com.finalshell.ui.model.S_3 r() {
      return this.a.r();
   }

   @Override
   public boolean M() {
      return true;
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean P$boolean() {
      return false;
   }

   @Override
   public boolean B() {
      return false;
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public boolean o() {
      return false;
   }

   @Override
   public boolean p$boolean() {
      return false;
   }

   @Override
   public Hd2 G() {
      return this.a;
   }

   @Override
   public String toString() {
      return this.a.toString() + c;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = ",H".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 101;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 101;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 18;
               break;
            case 1:
               var21 = 112;
               break;
            case 2:
               var21 = 60;
               break;
            case 3:
               var21 = 89;
               break;
            case 4:
               var21 = 104;
               break;
            case 5:
               var21 = 39;
               break;
            default:
               var21 = 99;
         }
      } else {
         var13 = 101;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            c = var16;
            long var3 = 989244416118431113L;
            long var12 = -3384939707660558894L ^ var3;
            var8 = -1;
            j = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 101;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 18;
               break;
            case 1:
               var21 = 112;
               break;
            case 2:
               var21 = 60;
               break;
            case 3:
               var21 = 89;
               break;
            case 4:
               var21 = 104;
               break;
            case 5:
               var21 = 39;
               break;
            default:
               var21 = 99;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 18;
                  break;
               case 1:
                  var21 = 112;
                  break;
               case 2:
                  var21 = 60;
                  break;
               case 3:
                  var21 = 89;
                  break;
               case 4:
                  var21 = 104;
                  break;
               case 5:
                  var21 = 39;
                  break;
               default:
                  var21 = 99;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               c = var15;
               long var0 = 989244416118431113L;
               long var11 = -3384939707660558894L ^ var0;
               var6 = -1;
               j = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 18;
                  break;
               case 1:
                  var21 = 112;
                  break;
               case 2:
                  var21 = 60;
                  break;
               case 3:
                  var21 = 89;
                  break;
               case 4:
                  var21 = 104;
                  break;
               case 5:
                  var21 = 39;
                  break;
               default:
                  var21 = 99;
            }
         }
      }
   }
}





