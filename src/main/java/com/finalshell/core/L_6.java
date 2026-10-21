package com.finalshell.core;

import java.lang.reflect.Method;

public abstract class L_6 {
   public static java.lang.Class r;
   public static Method F;

   void l(Object var1);

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static void __vfClinit__() {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "t~\u0019\u0013;1vwsA\u0014`*ajv\u0000\u001c;\u0007mpl\u001a\u001fp6\u0006\u007f|\f\u0017e0";
      int var5 = "t~\u0019\u0013;1vwsA\u0014`*ajv\u0000\u001c;\u0007mpl\u001a\u001fp6\u0006\u007f|\f\u0017e0".length();
      char var2 = 27;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 39;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 39;
               var10006 = var6;
            } else {
               var13 = 39;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 39;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 57;
                     break;
                  case 1:
                     var29 = 56;
                     break;
                  case 2:
                     var29 = 72;
                     break;
                  case 3:
                     var29 = 85;
                     break;
                  case 4:
                     var29 = 50;
                     break;
                  case 5:
                     var29 = 99;
                     break;
                  default:
                     var29 = 37;
               }

               var10005[var10006] = (char)(var28 ^ var16 ^ var29);
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var0[var4++] = var15;
         if ((var1 += var2) >= var5) {
            r = D_8.Z(var0[0]);
            F = D_8.z(r, var0[1], new java.lang.Class[]{Object.class});
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}






