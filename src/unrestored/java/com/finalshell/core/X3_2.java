package com.finalshell.core;

import java.lang.reflect.Method;

public class X3_2 {
   public static java.lang.Class J;
   public static Method t;
   public final Object C;
   public static String[] v;

   public X3_2(Object var1) {
      this.C = var1;
   }

   public Object l() {
      return J_6.o(t, this.C, new Object[0]);
   }

   static {
      __vfClinit__();
   }

   public static void e(String[] var0) {
      v = var0;
   }

   public static String[] s() {
      return v;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "4MZ\u00129IX!l\fT:D\u0000\u000f2\rI<FO,";
      int var5 = "4MZ\u00129IX!l\fT:D\u0000\u000f2\rI<FO,".length();
      char var2 = 3;
      String[] var10000 = new String[1];
      int var1 = -1;
      e(var10000);

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 82;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 82;
               var10006 = var6;
            } else {
               var13 = 82;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 82;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 1;
                     break;
                  case 1:
                     var29 = 122;
                     break;
                  case 2:
                     var29 = 124;
                     break;
                  case 3:
                     var29 = 18;
                     break;
                  case 4:
                     var29 = 16;
                     break;
                  case 5:
                     var29 = 43;
                     break;
                  default:
                     var29 = 114;
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
            J = D_8.Z(var0[1]);
            t = D_8.z(J, var0[0], new java.lang.Class[0]);
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}





