package com.finalshell.task;

import com.finalshell.core.PK;

public class Kt2 implements Runnable {
   final String K;
   public static String a;

   Kt2(String var1) {
      this.K = var1;
   }

   @Override
   public void run() {
      try {
         PK.Z(a + this.K);
      } catch (Throwable var2) {
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "~n\u0019F-%|`q\u0002Xck8b\u007fCDb% ~{\u001fS9z;f%\u0018D{7".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 43;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 43;
         var10006 = var0;
      } else {
         var6 = 43;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 43;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 61;
               break;
            case 1:
               var23 = 49;
               break;
            case 2:
               var23 = 70;
               break;
            case 3:
               var23 = 29;
               break;
            case 4:
               var23 = 60;
               break;
            case 5:
               var23 = 33;
               break;
            default:
               var23 = 120;
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





