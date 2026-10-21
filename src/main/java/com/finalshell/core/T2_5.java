package com.finalshell.core;

import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class T2_5 extends J_5 {
   public final ZipFile g;
   public static String b;

   public T2_5(ZipFile var1) {
      this.g = var1;
   }

   @Override
   public final String toString() {
      return b + this.g.getName();
   }

   @C_9
   @Override
   public final N_6 J(String var1) {
      ZipEntry var2 = this.g.getEntry(var1);
      return var2 == null ? null : new H2_4(this, var1, var2);
   }

   static ZipFile S(T2_5 var0) {
      return var0.g;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0015>6.".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 84;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 84;
         var10006 = var0;
      } else {
         var6 = 84;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            return;
         }

         var10005 = var10003;
         var10 = 84;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 59;
               break;
            case 1:
               var23 = 3;
               break;
            case 2:
               var23 = 18;
               break;
            case 3:
               var23 = 64;
               break;
            case 4:
               var23 = 113;
               break;
            case 5:
               var23 = 119;
               break;
            default:
               var23 = 15;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               b = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





