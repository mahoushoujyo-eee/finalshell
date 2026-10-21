package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.SwingUtilities;

public class H2 extends MouseAdapter {
   public final com.finalshell.ui.panel.T h;
   public static String a;

   public H2(com.finalshell.ui.panel.T var1) {
      this.h = var1;
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

            var4 = this.h.E;
            if (var2 != null) {
               break label45;
            }

            var10000 = this.h.E.getSelectedIndex();
         }

         if (var10000 == -1) {
            return;
         }

         var4 = this.h.E;
      }

      label25: {
         File var3 = var4.J();
         if (var2 == null) {
            if (!var3.isDirectory()) {
               break label25;
            }

            this.h.M(var3, com.finalshell.ui.model.D2.list);
         }

         if (var2 == null) {
            return;
         }
      }

      this.h.v(new ActionEvent(this.h.E, var1.getID(), a, var1.getWhen(), var1.getModifiers()));
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0011\u0015xHW,\u00142\u0010qNPi\u0003".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 77;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 77;
         var10006 = var0;
      } else {
         var6 = 77;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 77;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 26;
               break;
            case 1:
               var23 = 49;
               break;
            case 2:
               var23 = 89;
               break;
            case 3:
               var23 = 96;
               break;
            case 4:
               var23 = 105;
               break;
            case 5:
               var23 = 65;
               break;
            default:
               var23 = 42;
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





