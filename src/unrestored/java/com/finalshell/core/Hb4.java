package com.finalshell.core;

public class Hb4 extends HN3 {
   public static String a;
   public static long b;

   @Override
   public int C(int var1, int var2, int var3) {
      String[] var4 = W5.q();
      int var10000 = var1 & 1;
      if (var4 != null) {
         if (var10000 == (var2 & 1)) {
            return var3;
         }

         var10000 = NM.n(0.25F, (int)b, var3);
      }

      return var10000;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "BL{'\u000e[\u000b>rc=\u0006\u0001\"7~\"\u0018\u0013H\u001eaTg".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 15;
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
         var10007 = 15;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 30;
               break;
            case 1:
               var21 = 55;
               break;
            case 2:
               var21 = 13;
               break;
            case 3:
               var21 = 68;
               break;
            case 4:
               var21 = 104;
               break;
            case 5:
               var21 = 46;
               break;
            default:
               var21 = 97;
         }
      } else {
         var13 = 15;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 1732358864890347191L;
            long var12 = -5075140312321480914L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 15;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 30;
               break;
            case 1:
               var21 = 55;
               break;
            case 2:
               var21 = 13;
               break;
            case 3:
               var21 = 68;
               break;
            case 4:
               var21 = 104;
               break;
            case 5:
               var21 = 46;
               break;
            default:
               var21 = 97;
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
                  var21 = 30;
                  break;
               case 1:
                  var21 = 55;
                  break;
               case 2:
                  var21 = 13;
                  break;
               case 3:
                  var21 = 68;
                  break;
               case 4:
                  var21 = 104;
                  break;
               case 5:
                  var21 = 46;
                  break;
               default:
                  var21 = 97;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 1732358864890347191L;
               long var11 = -5075140312321480914L ^ var0;
               var6 = -1;
               b = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 30;
                  break;
               case 1:
                  var21 = 55;
                  break;
               case 2:
                  var21 = 13;
                  break;
               case 3:
                  var21 = 68;
                  break;
               case 4:
                  var21 = 104;
                  break;
               case 5:
                  var21 = 46;
                  break;
               default:
                  var21 = 97;
            }
         }
      }
   }
}





