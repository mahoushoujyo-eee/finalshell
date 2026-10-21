package com.finalshell.task;

import com.finalshell.core.PK;

public class BA implements Runnable {
   public final String d;
   public static String a;

   public BA(String var1) {
      this.d = var1;
   }

   @Override
   public void run() {
      try {
         PK.Z(a + this.d);
      } catch (Throwable var2) {
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "7\u000f8OP?\"(\f;\u0011\fqn:\u0019#P\u0001>n0\u0016cL\u0002q\u007f:\tbO\u0002`2*F".toCharArray();
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
               var23 = 37;
               break;
            case 1:
               var23 = 1;
               break;
            case 2:
               var23 = 54;
               break;
            case 3:
               var23 = 69;
               break;
            case 4:
               var23 = 16;
               break;
            case 5:
               var23 = 106;
               break;
            default:
               var23 = 119;
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





