package com.L;

import com.GA;
import com.Xm_2;
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

class c extends BasicComboPopup {
   final m Z;
   private static final String a;

   c(m var1, JComboBox var2) {
      super(var2);
      this.Z = var1;
   }

   @Override
   protected JScrollPane createScroller() {
      com.ky_4[] var1;
      JScrollPane var2;
      label27: {
         com.ky_4[] var10000 = m.X();
         var2 = super.createScroller();
         var1 = var10000;
         if (var1 == null) {
            if (!com.a9.H()) {
               break label27;
            }

            var2.setOpaque(false);
         }

         var2.getViewport().setOpaque(false);
      }

      ScrollPaneUI var3 = var2.getUI();
      if (var1 == null) {
         if (var3 instanceof com.Y9) {
            com.Y9 var4 = (com.Y9)var3;
            var4.Y(false);
            ScrollBarUI var5 = var2.getVerticalScrollBar().getUI();
            if (var1 != null) {
               return var2;
            }

            if (var5 instanceof Xm_2) {
               Xm_2 var6 = (Xm_2)var5;
               var6.i(com.L.Z.k);
               var6.R(com.L.Z.m);
               var6.Y(com.L.Z.K);
            }
         }

         GA.B(var2, a);
      }

      return var2;
   }

   @Override
   protected JList createList() {
      com.ky_4[] var10000 = m.X();
      JList var2 = super.createList();
      com.ky_4[] var1 = var10000;
      ListUI var3 = var2.getUI();
      if (var1 == null) {
         if (var3 instanceof com.Yc_2) {
            com.Yc_2 var4 = (com.Yc_2)var3;
            var4.q(false);
            var4.C(false);
         }

         var2.addListSelectionListener(new j_2(this));
      }

      return var2;
   }

   @Override
   protected void configurePopup() {
      super.configurePopup();
      this.addPopupMenuListener(new com.L.N(this));
   }

   @Override
   public void show() {
      this.comboBox.firePopupMenuWillBecomeVisible();
      this.b(this.comboBox.getSelectedIndex());
      Point var1 = this.z();
      this.show(this.comboBox, var1.x + com.c.c(555492858326697961L).getInt(null), var1.y + com.c.c(270204899580921298L).getInt(null));
   }

   private void b(int var1) {
      com.ky_4[] var2 = m.X();
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

   private Point z() {
      com.ky_4[] var10000 = m.X();
      Dimension var2 = this.comboBox.getSize();
      com.ky_4[] var1 = var10000;
      com.L.c var6 = this;
      if (var1 == null) {
         label17: {
            if (this.Z.f) {
               Dimension var3 = this.comboBox.getPreferredSize();
               var7 = var3;
               if (var1 != null) {
                  break label17;
               }

               if (var3.width > var2.width) {
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

   static JComboBox L(com.L.c var0) {
      return var0.comboBox;
   }

   static JComboBox O(com.L.c var0) {
      return var0.comboBox;
   }

   static JComboBox C(com.L.c var0) {
      return var0.comboBox;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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





