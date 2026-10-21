package com.finalshell.core;

import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.plaf.ListUI;
import javax.swing.plaf.ScrollBarUI;
import javax.swing.plaf.ScrollPaneUI;
import javax.swing.plaf.basic.BasicComboPopup;

public class C_4 extends BasicComboPopup {
   final M3 Z;
   public static String a;

   C_4(M3 var1, JComboBox var2) {
      super(var2);
      this.Z = var1;
   }

   @Override
   protected JScrollPane createScroller() {
      Ky4[] var1;
      JScrollPane var2;
      label27: {
         Ky4[] var10000 = M3.X();
         var2 = super.createScroller();
         var1 = var10000;
         if (var1 == null) {
            if (!A9.H()) {
               break label27;
            }

            var2.setOpaque(false);
         }

         var2.getViewport().setOpaque(false);
      }

      ScrollPaneUI var3 = var2.getUI();
      if (var1 == null) {
         if (var3 instanceof Y9_2) {
            Y9_2 var4 = (Y9_2)var3;
            var4.Y(false);
            ScrollBarUI var5 = var2.getVerticalScrollBar().getUI();
            if (var1 != null) {
               return var2;
            }

            if (var5 instanceof Xm2) {
               Xm2 var6 = (Xm2)var5;
               var6.i(com.finalshell.core.Z.k);
               var6.R(com.finalshell.core.Z.m);
               var6.Y(com.finalshell.core.Z.K);
            }
         }

         GA.B(var2, a);
      }

      return var2;
   }

   @Override
   protected JList createList() {
      Ky4[] var10000 = M3.X();
      JList var2 = super.createList();
      Ky4[] var1 = var10000;
      ListUI var3 = var2.getUI();
      if (var1 == null) {
         if (var3 instanceof Yc2_2) {
            Yc2_2 var4 = (Yc2_2)var3;
            var4.q(false);
            var4.C(false);
         }

         var2.addListSelectionListener(new com.finalshell.ui.listener.J_2(this));
      }

      return var2;
   }

   @Override
   protected void configurePopup() {
      super.configurePopup();
      this.addPopupMenuListener(new com.finalshell.ui.listener.N2(this));
   }

   @Override
   public void show() {
      this.comboBox.firePopupMenuWillBecomeVisible();
      this.b(this.comboBox.getSelectedIndex());
      Point var1 = this.z();
      this.show(this.comboBox, var1.x + Registry.lookupField(555492858326697961L).getInt(null), var1.y + Registry.lookupField(270204899580921298L).getInt(null));
   }

   public void b(int var1) {
      Ky4[] var2 = M3.X();
      if (var2 == null) {
         if (var1 == -1) {
            this.list.clearSelection();
            if (var2 == null) {
               return;
            }
         }

         this.list.setSelectedIndex(var1);
      }

      this.list.ensureIndexIsVisible(var1);
   }

   public Point z() {
      Ky4[] var10000 = M3.X();
      Dimension var2 = this.comboBox.getSize();
      Ky4[] var1 = var10000;
      C_4 var6 = this;
      if (var1 == null) {
         label17: {
            if (this.Z.f) {
      ScrollPaneUI var7;
               Dimension var3 = this.comboBox.getPreferredSize();
               var7 = var3;
               if (var1 != null) {
                  break label17;
               }

               if (var3.width > var2.width) {
      JScrollPane var7;
                  var2.width = var3.width;
               }
            }

            var7 = var2;
         }

         var7.setSize(var2.width - 2, this.getPopupHeightForRowCount(this.comboBox.getMaximumRowCount()));
         var6 = this;
      }

      Rectangle var5 = var6.computePopupBounds(0, this.comboBox.getBounds().height, var2.width, var2.height);
      Dimension var4 = var5.getSize();
      this.scroller.setMaximumSize(var4);
      this.scroller.setPreferredSize(var4);
      this.scroller.setMinimumSize(var4);
      this.list.revalidate();
      return var5.getLocation();
   }

   static JComboBox L(C_4 var0) {
      return var0.comboBox;
   }

   static JComboBox O(C_4 var0) {
      return var0.comboBox;
   }

   static JComboBox C(C_4 var0) {
      return var0.comboBox;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "b\u0015@ \u0016O$n\u0002".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 74;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 74;
         var10006 = var0;
      } else {
         var6 = 74;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 74;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 75;
               break;
            case 1:
               var23 = 48;
               break;
            case 2:
               var23 = 103;
               break;
            case 3:
               var23 = 8;
               break;
            case 4:
               var23 = 51;
               break;
            case 5:
               var23 = 40;
               break;
            default:
               var23 = 12;
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






