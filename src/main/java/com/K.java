package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class K extends MouseAdapter {
   final _e_2 j;
   final com.QY W;
   private static final String a;

   K(com.QY var1, _e_2 var2) {
      this.W = var1;
      this.j = var2;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int[] var10000 = _e_2.P();
      ActionListener var3 = this.j.V();
      int[] var2 = var10000;
      if (var2 == null) {
         if (var3 != null) {
            var3.actionPerformed(new ActionEvent(var1.getSource(), 0, a));
         }

         this.W.U(this.W.getComponentZOrder(this.j));
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u0003_\b\u007fq^z2Y\u000epqB7'X".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 121;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 121;
         var10006 = var0;
      } else {
         var6 = 121;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 121;
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
               var23 = 69;
               break;
            case 2:
               var23 = 5;
               break;
            case 3:
               var23 = 111;
               break;
            case 4:
               var23 = 103;
               break;
            case 5:
               var23 = 73;
               break;
            default:
               var23 = 35;
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





