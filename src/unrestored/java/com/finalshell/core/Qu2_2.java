package com.finalshell.core;

import com.finalshell.crypto.ConnectHost;

public class Qu2_2 extends Qi2 {
   public static String a;
   public static long d;

   @Override
   public void Q(ConnectHost var1, Dm4 var2) throws Exception {
      UJ var7;
      boolean var10000 = Dm4.F$boolean();
      super.Q(var1, var2);
      UJ var4 = new UJ();
      YU var5 = new YU(var4);
      var5.M();
      var4.V((byte)((int)d));
      var4.u(var2.J$int());
      boolean var3 = var10000;

      byte var10001;
      label22: {
         label21: {
            try {
               var4.q(E8.J(a));
               var7 = var4;
               var10001 = (byte)((this.K()) ? 1 : 0);
               if (!var3) {
                  break label22;
               }

               if (var10001 != 0) {
                  break label21;
               }
            } catch (Exception var6) {
               throw new RuntimeException(b(var6));
            }

            var10001 = 0;
            break label22;
         }

         var10001 = 1;
      }

      var7.V((byte)var10001);
      this.C(var5);
   }

   public static Exception b(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "SLEeT".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 59;
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
         var10007 = 59;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 27;
               break;
            case 1:
               var21 = 31;
               break;
            case 2:
               var21 = 27;
               break;
            case 3:
               var21 = 50;
               break;
            case 4:
               var21 = 3;
               break;
            case 5:
               var21 = 20;
               break;
            default:
               var21 = 31;
         }
      } else {
         var13 = 59;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 7867881429633501509L;
            long var12 = -2802334118510950105L ^ var3;
            var8 = -1;
            d = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 59;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 27;
               break;
            case 1:
               var21 = 31;
               break;
            case 2:
               var21 = 27;
               break;
            case 3:
               var21 = 50;
               break;
            case 4:
               var21 = 3;
               break;
            case 5:
               var21 = 20;
               break;
            default:
               var21 = 31;
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
                  var21 = 27;
                  break;
               case 1:
                  var21 = 31;
                  break;
               case 2:
                  var21 = 27;
                  break;
               case 3:
                  var21 = 50;
                  break;
               case 4:
                  var21 = 3;
                  break;
               case 5:
                  var21 = 20;
                  break;
               default:
                  var21 = 31;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 7867881429633501509L;
               long var11 = -2802334118510950105L ^ var0;
               var6 = -1;
               d = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 27;
                  break;
               case 1:
                  var21 = 31;
                  break;
               case 2:
                  var21 = 27;
                  break;
               case 3:
                  var21 = 50;
                  break;
               case 4:
                  var21 = 3;
                  break;
               case 5:
                  var21 = 20;
                  break;
               default:
                  var21 = 31;
            }
         }
      }
   }
}





