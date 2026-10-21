package com.finalshell.core;

import com.finalshell.connection.DelayedAckSACK;
import java.util.HashMap;

public class Fm4 {
   HashMap A = new HashMap();
   public static String a;

   public DelayedAckSACK d(String var1, int var2) {
      return (DelayedAckSACK)this.A.get(var1 + ":" + var2);
   }

   public void l(DelayedAckSACK var1) {
      String var2 = var1.H().getHostAddress() + ":" + var1.c();
      System.out.println(a + var2);
      this.A.put(var2, var1);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0013/gSQ9\u0017\u0017(wyQ9Y".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 98;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 98;
         var10006 = var0;
      } else {
         var6 = 98;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 98;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 16;
               break;
            case 1:
               var23 = 41;
               break;
            case 2:
               var23 = 97;
               break;
            case 3:
               var23 = 114;
               break;
            case 4:
               var23 = 92;
               break;
            case 5:
               var23 = 53;
               break;
            default:
               var23 = 27;
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





