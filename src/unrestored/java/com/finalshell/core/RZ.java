package com.finalshell.core;

public final class RZ extends R8_2 {
   public final NV_2 k;
   public static String d;
   public static long e;

   public RZ(com.finalshell.ui.model.I var1, NV_2 var2) {
      super(var1);
      (this.k = var2).d(this);
   }

   @Override
   public String toString() {
      return d + this.k + (int)e;
   }

   @C_9
   @Override
   public Object R(H_4_2 var1) throws Throwable {
      return var1.x(this);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u001cR|]PZ".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 95;
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
         var10007 = 95;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 55;
               break;
            case 1:
               var21 = 101;
               break;
            case 2:
               var21 = 81;
               break;
            case 3:
               var21 = 109;
               break;
            case 4:
               var21 = 120;
               break;
            case 5:
               var21 = 37;
               break;
            default:
               var21 = 106;
         }
      } else {
         var13 = 95;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            d = var16;
            long var3 = 6114893832187819498L;
            long var12 = 8674867200152581585L ^ var3;
            var8 = -1;
            e = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 95;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 55;
               break;
            case 1:
               var21 = 101;
               break;
            case 2:
               var21 = 81;
               break;
            case 3:
               var21 = 109;
               break;
            case 4:
               var21 = 120;
               break;
            case 5:
               var21 = 37;
               break;
            default:
               var21 = 106;
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
                  var21 = 55;
                  break;
               case 1:
                  var21 = 101;
                  break;
               case 2:
                  var21 = 81;
                  break;
               case 3:
                  var21 = 109;
                  break;
               case 4:
                  var21 = 120;
                  break;
               case 5:
                  var21 = 37;
                  break;
               default:
                  var21 = 106;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               d = var15;
               long var0 = 6114893832187819498L;
               long var11 = 8674867200152581585L ^ var0;
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
                  var21 = 55;
                  break;
               case 1:
                  var21 = 101;
                  break;
               case 2:
                  var21 = 81;
                  break;
               case 3:
                  var21 = 109;
                  break;
               case 4:
                  var21 = 120;
                  break;
               case 5:
                  var21 = 37;
                  break;
               default:
                  var21 = 106;
            }
         }
      }
   }
}





