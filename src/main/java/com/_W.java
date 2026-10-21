package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Arrays;

class _W implements ActionListener {
   final File a;
   final com.KR r;
   final com.kd_4 T;
   private static final String b;

   _W(com.kd_4 var1, File var2, com.KR var3) {
      this.T = var1;
      this.a = var2;
      this.r = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      label27: {
         String var10000 = com.kE_3.v();
         File[] var3 = this.a.listFiles();
         String var2 = var10000;
         File[] var4 = var3;
         if (var2 == null) {
            if (var3 == null) {
               break label27;
            }

            var4 = var3;
         }

         if (var2 == null) {
            if (var4.length <= 0) {
               break label27;
            }

            var4 = var3;
         }

         Arrays.sort(var4, new py_4());
         com.kd_4.I(this.T, var3, this.r);
         if (var2 == null) {
            return;
         }
      }

      com.ac_2.V(this.r, null, b);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u001aq\u0010QXi\u001b<|UMRi\u001c'u\u0010P\u001d \u0014=p\u0011F".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 93;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 93;
         var10006 = var0;
      } else {
         var6 = 93;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            return;
         }

         var10005 = var10003;
         var10 = 93;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 19;
               break;
            case 1:
               var23 = 68;
               break;
            case 2:
               var23 = 40;
               break;
            case 3:
               var23 = 126;
               break;
            case 4:
               var23 = 96;
               break;
            case 5:
               var23 = 20;
               break;
            default:
               var23 = 39;
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





