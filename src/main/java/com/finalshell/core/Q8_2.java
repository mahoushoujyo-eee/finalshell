package com.finalshell.core;

import com.finalshell.crypto.ConnectHost;

public class Q8_2 extends Qi2 {
   byte[] a = new byte[0];
   byte[] t = new byte[0];
   public static String d;
   public static long e;

   Q8_2() {
   }

   void r(byte[] var1, byte[] var2) {
      this.a = var1;
      this.t = var2;
   }

   @Override
   public void Q(ConnectHost var1, Dm4 var2) throws Exception {
      super.Q(var1, var2);
      this.T(false);
      UJ var3 = new UJ();
      YU var4 = new YU(var3);
      var4.M();
      var3.V((byte)((int)e));
      var3.u(var2.J$int());
      var3.q(E8.J(d));
      var3.V((byte)0);
      var3.q(this.a);
      var3.q(this.t);
      this.C(var4);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "9vL".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 52;
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
         var10007 = 52;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 104;
               break;
            case 1:
               var21 = 44;
               break;
            case 2:
               var21 = 14;
               break;
            case 3:
               var21 = 20;
               break;
            case 4:
               var21 = 82;
               break;
            case 5:
               var21 = 28;
               break;
            default:
               var21 = 20;
         }
      } else {
         var13 = 52;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            d = var16;
            long var3 = 7151579847413521239L;
            long var12 = -6550290640659489995L ^ var3;
            var8 = -1;
            e = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 52;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 104;
               break;
            case 1:
               var21 = 44;
               break;
            case 2:
               var21 = 14;
               break;
            case 3:
               var21 = 20;
               break;
            case 4:
               var21 = 82;
               break;
            case 5:
               var21 = 28;
               break;
            default:
               var21 = 20;
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
                  var21 = 104;
                  break;
               case 1:
                  var21 = 44;
                  break;
               case 2:
                  var21 = 14;
                  break;
               case 3:
                  var21 = 20;
                  break;
               case 4:
                  var21 = 82;
                  break;
               case 5:
                  var21 = 28;
                  break;
               default:
                  var21 = 20;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               d = var15;
               long var0 = 7151579847413521239L;
               long var11 = -6550290640659489995L ^ var0;
               var6 = -1;
               e = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 104;
                  break;
               case 1:
                  var21 = 44;
                  break;
               case 2:
                  var21 = 14;
                  break;
               case 3:
                  var21 = 20;
                  break;
               case 4:
                  var21 = 82;
                  break;
               case 5:
                  var21 = 28;
                  break;
               default:
                  var21 = 20;
            }
         }
      }
   }
}





