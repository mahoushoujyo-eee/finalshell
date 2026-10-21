package com.finalshell.ui.listener;

import com.finalshell.core.Og4;
import com.finalshell.ui.panel.Pb4;
import java.awt.Container;
import java.awt.Rectangle;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.PopupMenuUI;

public class XN implements ChangeListener {
   public JMenuItem U;
   public static String a;

   public static XN y(JMenuItem var0) {
      XN var1 = new XN(var0);
      var0.getModel().addChangeListener(var1);
      var0.addPropertyChangeListener(a, new Dl4(var1, var0));
      return var1;
   }

   public static void s(XN var0, JMenuItem var1) {
      var1.getModel().removeChangeListener(var0);
   }

   public XN(JMenuItem var1) {
      this.U = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      int[] var10000 = Pb4.g();
      Container var3 = this.U.getParent();
      int[] var2 = var10000;
      Container var11 = var3;
      if (var2 != null) {
         if (!(var3 instanceof JPopupMenu)) {
            return;
         }

         var11 = var3;
      }

      JPopupMenu var4 = (JPopupMenu)var11;
      PopupMenuUI var12 = var4.getUI();
      if (var2 != null) {
         if (!(var12 instanceof com.finalshell.core.FJ)) {
            return;
         }

         var12 = var4.getUI();
      }

      com.finalshell.core.FJ var5 = (com.finalshell.core.FJ)var12;
      Og4 var6 = var5.a();
      Og4 var13 = var6;
      if (var2 != null) {
         if (!(var6 instanceof com.finalshell.core.L)) {
            return;
         }

         var13 = var6;
      }

      com.finalshell.core.L var7 = (com.finalshell.core.L)var13;
      if (var7.M() == com.finalshell.ui.model.M.dropdown) {
         int var8 = var4.getComponentZOrder(this.U);
         int var14 = var7.I();
         int var10001 = 1;
         if (var2 != null) {
            label40: {
               if (var14 == 1) {
                  var14 = var8;
                  if (var2 == null) {
                     break label40;
                  }

                  if (var8 == 0) {
                     var4.repaint(0, 0, var4.getWidth(), this.U.getBounds().y);
                     if (var2 != null) {
                        return;
                     }
                  }
               }

               var14 = var7.I();
            }

            var10001 = 5;
         }

         if (var2 != null) {
            if (var14 != var10001) {
               return;
            }

            var14 = var8;
            var10001 = var4.getComponentCount() - 1;
         }

         if (var14 == var10001) {
            Rectangle var9 = this.U.getBounds();
            int var10 = var9.y + var9.height;
            var4.repaint(0, var10, var4.getWidth(), var4.getHeight() - var10);
         }
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u00130Ri\u0010".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 9;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 9;
         var10006 = var0;
      } else {
         var6 = 9;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 9;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 119;
               break;
            case 1:
               var23 = 86;
               break;
            case 2:
               var23 = 63;
               break;
            case 3:
               var23 = 5;
               break;
            case 4:
               var23 = 117;
               break;
            case 5:
               var23 = 14;
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





