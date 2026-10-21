package com.finalshell.core;

import com.finalshell.crypto.ConnectHost;

public class Q4 extends Qi2 {
   public String U = null;
   public static String a;
   public static long d;

   public void J(ConnectHost var1, Dm4 var2, String var3, boolean var4) throws Exception {
      this.T(var4);
      this.U = var3;
      this.Q(var1, var2);
   }

   @Override
   public void Q(ConnectHost var1, Dm4 var2) throws Exception {
      UJ var7;
      super.Q(var1, var2);
      UJ var4 = new UJ();
      boolean var10000 = Dm4.F$boolean();
      YU var5 = new YU(var4);
      boolean var3 = var10000;

      byte var10001;
      label22: {
         label21: {
            try {
               var5.M();
               var4.V((byte)((int)d));
               var4.u(var2.J$int());
               var4.q(E8.J(a));
               var7 = (var4) ? 1 : 0;
               var10001 = (this.K()) ? 1 : 0;
               if (!var3) {
                  break label22;
               }

               if (var10001 != 0) {
                  break label21;
               }
            } catch (Exception var6) {
               throw b(var6);
            }

            var10001 = 0;
            break label22;
         }

         var10001 = 1;
      }

      var7.V((byte)var10001);
      var4.q(E8.J(this.U));
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
      char[] var10003 = ",$F\u000b%_n:<".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 1;
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
         var10007 = 1;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 94;
               break;
            case 1:
               var21 = 80;
               break;
            case 2:
               var21 = 37;
               break;
            case 3:
               var21 = 121;
               break;
            case 4:
               var21 = 93;
               break;
            case 5:
               var21 = 45;
               break;
            default:
               var21 = 27;
         }
      } else {
         var13 = 1;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 2462140786726028969L;
            long var12 = 1629127765088159435L ^ var3;
            var8 = -1;
            d = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 1;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 94;
               break;
            case 1:
               var21 = 80;
               break;
            case 2:
               var21 = 37;
               break;
            case 3:
               var21 = 121;
               break;
            case 4:
               var21 = 93;
               break;
            case 5:
               var21 = 45;
               break;
            default:
               var21 = 27;
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
                  var21 = 94;
                  break;
               case 1:
                  var21 = 80;
                  break;
               case 2:
                  var21 = 37;
                  break;
               case 3:
                  var21 = 121;
                  break;
               case 4:
                  var21 = 93;
                  break;
               case 5:
                  var21 = 45;
                  break;
               default:
                  var21 = 27;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 2462140786726028969L;
               long var11 = 1629127765088159435L ^ var0;
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
                  var21 = 94;
                  break;
               case 1:
                  var21 = 80;
                  break;
               case 2:
                  var21 = 37;
                  break;
               case 3:
                  var21 = 121;
                  break;
               case 4:
                  var21 = 93;
                  break;
               case 5:
                  var21 = 45;
                  break;
               default:
                  var21 = 27;
            }
         }
      }
   }
}





