package com;

import java.util.concurrent.Callable;

public class XJ {
   private static boolean C;

   public static Object L(Callable var0) {
      if (C) {
         try {
            return var0.call();
         } catch (Exception var2) {
            throw new RuntimeException(var2);
         }
      } else {
         return null;
      }
   }

   public static Object w(wE_3 var0, Object var1) {
      try {
         return C ? var0.N(var1) : null;
      } catch (RuntimeException var2) {
         throw a(var2);
      }
   }

   public static Object h(pK_3 var0, Object var1, Object var2) {
      try {
         return C ? var0.h(var1, var2) : null;
      } catch (RuntimeException var3) {
         throw a(var3);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\")yb\nw\u001a$f[jIa".toCharArray();
      int var10004 = var10003.length;
      int var1 = 0;
      byte var11 = 14;
      char[] var10002 = var10003;
      int var6 = var10004;
      char[] var15;
      byte var19;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var15 = var10003;
         var10005 = var1;
         char var10008 = var10003[var1];
         var10007 = 14;
         var10006 = var10008;
         switch (var1 % 7) {
            case 0:
               var19 = 70;
               break;
            case 1:
               var19 = 70;
               break;
            case 2:
               var19 = 1;
               break;
            case 3:
               var19 = 13;
               break;
            case 4:
               var19 = 42;
               break;
            case 5:
               var19 = 10;
               break;
            default:
               var19 = 101;
         }
      } else {
         var11 = 14;
         var6 = var10004;
         if (var10004 <= var1) {
            String var14 = new String(var10003).intern();
            byte var9 = -1;
            String var5 = var14;
            C = false;

            try {
               Class.forName(var5);
               C = true;
            } catch (Throwable var4) {
               C = false;
            }

            return;
         }

         var15 = var10003;
         var10005 = var1;
         char var20 = var10003[var1];
         var10007 = 14;
         var10006 = var20;
         switch (var1 % 7) {
            case 0:
               var19 = 70;
               break;
            case 1:
               var19 = 70;
               break;
            case 2:
               var19 = 1;
               break;
            case 3:
               var19 = 13;
               break;
            case 4:
               var19 = 42;
               break;
            case 5:
               var19 = 10;
               break;
            default:
               var19 = 101;
         }
      }

      while (true) {
         var15[var10005] = (char)(var10006 ^ var10007 ^ var19);
         var1++;
         if (var11 == 0) {
            var15 = var10002;
            var10005 = var11;
            char var22 = var10002[var11];
            var10007 = var11;
            var10006 = var22;
            switch (var1 % 7) {
               case 0:
                  var19 = 70;
                  break;
               case 1:
                  var19 = 70;
                  break;
               case 2:
                  var19 = 1;
                  break;
               case 3:
                  var19 = 13;
                  break;
               case 4:
                  var19 = 42;
                  break;
               case 5:
                  var19 = 10;
                  break;
               default:
                  var19 = 101;
            }
         } else {
            if (var6 <= var1) {
               String var13 = new String(var10002).intern();
               byte var8 = -1;
               String var0 = var13;
               C = false;

               try {
                  Class.forName(var0);
                  C = true;
               } catch (Throwable var3) {
                  C = false;
               }

               return;
            }

            var15 = var10002;
            var10005 = var1;
            char var21 = var10002[var1];
            var10007 = var11;
            var10006 = var21;
            switch (var1 % 7) {
               case 0:
                  var19 = 70;
                  break;
               case 1:
                  var19 = 70;
                  break;
               case 2:
                  var19 = 1;
                  break;
               case 3:
                  var19 = 13;
                  break;
               case 4:
                  var19 = 42;
                  break;
               case 5:
                  var19 = 10;
                  break;
               default:
                  var19 = 101;
            }
         }
      }
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}





