package com.finalshell.core;

public final class N0_2 extends NV_2 {
   public final Nt2_2 v;
   public final NV_2 t;
   public static String a;
   public static long d;

   public N0_2(com.finalshell.ui.model.I var1, Nt2_2 var2, NV_2 var3) {
      super(var1);
      this.v = var2;
      this.t = var3;
   }

   @Override
   public String toString() {
      return (int)d + this.v.toString() + a + this.t.toString();
   }

   @C_9
   @Override
   public Object i(C_w_2 var1) throws Throwable {
      return var1.c(this);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "P)".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 82;
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
         var10007 = 82;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 43;
               break;
            case 1:
               var21 = 91;
               break;
            case 2:
               var21 = 57;
               break;
            case 3:
               var21 = 102;
               break;
            case 4:
               var21 = 67;
               break;
            case 5:
               var21 = 31;
               break;
            default:
               var21 = 11;
         }
      } else {
         var13 = 82;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 1535141921142941290L;
            long var12 = -3379316558390548926L ^ var3;
            var8 = -1;
            d = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 82;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 43;
               break;
            case 1:
               var21 = 91;
               break;
            case 2:
               var21 = 57;
               break;
            case 3:
               var21 = 102;
               break;
            case 4:
               var21 = 67;
               break;
            case 5:
               var21 = 31;
               break;
            default:
               var21 = 11;
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
                  var21 = 43;
                  break;
               case 1:
                  var21 = 91;
                  break;
               case 2:
                  var21 = 57;
                  break;
               case 3:
                  var21 = 102;
                  break;
               case 4:
                  var21 = 67;
                  break;
               case 5:
                  var21 = 31;
                  break;
               default:
                  var21 = 11;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 1535141921142941290L;
               long var11 = -3379316558390548926L ^ var0;
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
                  var21 = 43;
                  break;
               case 1:
                  var21 = 91;
                  break;
               case 2:
                  var21 = 57;
                  break;
               case 3:
                  var21 = 102;
                  break;
               case 4:
                  var21 = 67;
                  break;
               case 5:
                  var21 = 31;
                  break;
               default:
                  var21 = 11;
            }
         }
      }
   }
}





