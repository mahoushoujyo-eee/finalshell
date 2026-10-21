package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.SwingUtilities;

public class W2 extends MouseAdapter {
   final com.finalshell.ui.panel.T L;
   public static String a;

   W2(com.finalshell.ui.panel.T var1) {
      this.L = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      String var2 = com.finalshell.ui.panel.T.v$String();
      int var10000 = (SwingUtilities.isLeftMouseButton(var1)) ? 1 : 0;
      if (var2 == null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var1.getClickCount() % 2;
      }

      label45: {
         if (var2 == null) {
            if (var10000 != 0) {
               return;
            }

            var4 = this.L.hD;
            if (var2 != null) {
               break label45;
            }

            var10000 = this.L.hD.getSelectedRow();
         }

         if (var10000 == -1) {
            return;
         }

         var4 = this.L.hD;
      }

      label25: {
         File var3 = var4.S();
         if (var2 == null) {
            if (!var3.isDirectory()) {
               break label25;
            }

            this.L.M(var3, com.finalshell.ui.model.D2.table);
         }

         if (var2 == null) {
            return;
         }
      }

      this.L.v(new ActionEvent(this.L.hD, var1.getID(), a, var1.getWhen(), var1.getModifiers()));
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "yg\ttj\u00146Zb\u0000rmQ!".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 99;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 99;
         var10006 = var0;
      } else {
         var6 = 99;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 99;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 92;
               break;
            case 1:
               var23 = 109;
               break;
            case 2:
               var23 = 6;
               break;
            case 3:
               var23 = 114;
               break;
            case 4:
               var23 = 122;
               break;
            case 5:
               var23 = 87;
               break;
            default:
               var23 = 38;
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





