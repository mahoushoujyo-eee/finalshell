package com.finalshell.core;

import java.lang.reflect.Type;

public class Gg2 implements X4 {
   public final java.lang.Class X;
   public static String a;
   public static long b;

   public Gg2(java.lang.Class var1) {
      this.X = var1;
   }

   @Override
   public Object z(Yn4 var1, Type var2, Object var3) {
      Ev4 var4;
      try {
         var4 = (Ev4)this.X.newInstance();
      } catch (Exception var6) {
         throw new Hi2(a);
      }

      return var1.T(var4, var3);
   }

   @Override
   public int j() {
      return (int)b;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "U%F`\u0005n$_9Tq\u0010egSwBw\u0003dv".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 19;
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
         var10007 = 19;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 37;
               break;
            case 1:
               var21 = 68;
               break;
            case 2:
               var21 = 52;
               break;
            case 3:
               var21 = 22;
               break;
            case 4:
               var21 = 98;
               break;
            case 5:
               var21 = 24;
               break;
            default:
               var21 = 23;
         }
      } else {
         var13 = 19;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 5290744250019118495L;
            long var12 = -6097401096268644973L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 19;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 37;
               break;
            case 1:
               var21 = 68;
               break;
            case 2:
               var21 = 52;
               break;
            case 3:
               var21 = 22;
               break;
            case 4:
               var21 = 98;
               break;
            case 5:
               var21 = 24;
               break;
            default:
               var21 = 23;
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
                  var21 = 37;
                  break;
               case 1:
                  var21 = 68;
                  break;
               case 2:
                  var21 = 52;
                  break;
               case 3:
                  var21 = 22;
                  break;
               case 4:
                  var21 = 98;
                  break;
               case 5:
                  var21 = 24;
                  break;
               default:
                  var21 = 23;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 5290744250019118495L;
               long var11 = -6097401096268644973L ^ var0;
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
                  var21 = 37;
                  break;
               case 1:
                  var21 = 68;
                  break;
               case 2:
                  var21 = 52;
                  break;
               case 3:
                  var21 = 22;
                  break;
               case 4:
                  var21 = 98;
                  break;
               case 5:
                  var21 = 24;
                  break;
               default:
                  var21 = 23;
            }
         }
      }
   }
}





