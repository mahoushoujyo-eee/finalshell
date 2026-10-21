package com.finalshell.core;

import java.io.DataOutputStream;
import java.io.IOException;

public class CV implements Y2_3 {
   public static String a;

   @Override
   public int u() {
      return 1;
   }

   @Override
   public void H(DataOutputStream var1) throws IOException {
      var1.writeByte(1);
   }

   @Override
   public String toString() {
      return a;
   }

   @Override
   public int hashCode() {
      return 1;
   }

   @Override
   public boolean equals(@C_9 Object var1) {
      return var1 == this;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "H\u001f_".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 122;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 122;
         var10006 = var0;
      } else {
         var6 = 122;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 122;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 91;
               break;
            case 1:
               var23 = 11;
               break;
            case 2:
               var23 = 81;
               break;
            case 3:
               var23 = 127;
               break;
            case 4:
               var23 = 82;
               break;
            case 5:
               var23 = 64;
               break;
            default:
               var23 = 2;
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
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





