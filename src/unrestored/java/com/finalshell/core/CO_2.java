package com.finalshell.core;

import java.io.DataOutputStream;
import java.io.IOException;

public class CO_2 extends CM_2 {
   public static String a;

   public CO_2(int var1) {
      super(var1);
   }

   @Override
   public void e(DataOutputStream var1) throws IOException {
      var1.writeByte(this.X);
   }

   @Override
   public Object r(U2_2 var1) {
      return var1.o(this);
   }

   @Override
   public String toString() {
      return a + this.X + ")";
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "w\u0004<4\u00117\u001be\b4qf>\u000fb\u00164%\n4\u0005p\u0004l".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 61;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 61;
         var10006 = var0;
      } else {
         var6 = 61;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 61;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 57;
               break;
            case 1:
               var23 = 88;
               break;
            case 2:
               var23 = 108;
               break;
            case 3:
               var23 = 108;
               break;
            case 4:
               var23 = 115;
               break;
            case 5:
               var23 = 108;
               break;
            default:
               var23 = 84;
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





