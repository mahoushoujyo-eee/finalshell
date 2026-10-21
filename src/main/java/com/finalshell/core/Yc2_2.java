package com.finalshell.core;

import com.finalshell.ui.listener.NN3;
import com.finalshell.ui.panel.Ky4;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.geom.RoundRectangle2D.Double;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.LookAndFeel;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicListUI;

public class Yc2_2 extends BasicListUI {
   public boolean O = Wx4.S;
   public boolean H = Wx4.a;
   public int l = Wx4.n;
   public int g = Wx4.y;
   public boolean b = Wx4.H;
   public Color u = Wx4.Q;
   public Color d = Wx4.F;
   public boolean V = Wx4.r;
   public MouseAdapter X;
   public ListSelectionListener x;
   public int h = -1;
   public static String a;

   public static ComponentUI createUI(JComponent var0) {
      return new Yc2_2();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      FN.Y(this.list);
      com.finalshell.ui.panel.CI.c();
      LookAndFeel.installProperty(this.list, a, Boolean.TRUE);
      this.list.setBackground(new ColorUIResource(Wx4.X));
      this.list.setForeground(new ColorUIResource(Wx4.K));
      this.X = new NN3(this);
      this.list.addMouseListener(this.X);
      this.list.addMouseMotionListener(this.X);
      this.x = new com.finalshell.ui.listener.Km2(this);
      this.list.addListSelectionListener(this.x);
      if (Ky4.F$arrString() != null) {
         com.finalshell.ui.panel.CI.p(new String[5]);
      }
   }

   @Override
   public void uninstallUI(JComponent var1) {
      this.list.removeMouseListener(this.X);
      this.list.removeMouseMotionListener(this.X);
      this.list.removeListSelectionListener(this.x);
      super.uninstallUI(var1);
   }

   public Rq2 A() {
      String[] var1 = com.finalshell.ui.panel.CI.c();
      JList var10000 = this.list;
      if (var1 == null) {
         if (this.list == null) {
            return null;
         }

         var10000 = this.list;
      }

      if (var1 != null) {
         return ((com.finalshell.ui.panel.CI)var10000).m$Rq_2();
      } else {
         return var10000 instanceof com.finalshell.ui.panel.CI ? ((com.finalshell.ui.panel.CI)this.list).m$Rq_2() : null;
      }
   }

   public boolean e() {
      return this.O;
   }

   public void C(boolean var1) {
      this.O = var1;
   }

   public boolean u() {
      return this.H;
   }

   public void q(boolean var1) {
      this.H = var1;
   }

   public int j() {
      return this.l;
   }

   public void l(int var1) {
      this.l = var1;
   }

   public int y() {
      return this.g;
   }

   public void o(int var1) {
      this.g = var1;
   }

   public boolean L() {
      return this.b;
   }

   public void l(boolean var1) {
      this.b = var1;
   }

   public Color f() {
      return this.u;
   }

   public void h(Color var1) {
      this.u = var1;
   }

   public Color w() {
      return this.d;
   }

   public void E(Color var1) {
      this.d = var1;
   }

   public boolean M() {
      return this.V;
   }

   public void t(boolean var1) {
      this.V = var1;
   }

   @Override
   public void paintCell(Graphics var1, int var2, Rectangle var3, ListCellRenderer var4, ListModel var5, ListSelectionModel var6, int var7) {
      String[] var8;
      Object var9;
      byte var10;
      int var16;
      String[] var10000 = com.finalshell.ui.panel.CI.c();
      var9 = var5.getElementAt(var2);
      var8 = var10000;
      var10 = (var6.isSelectedIndex(var2)) ? 1 : 0;
      var16 = (this.O) ? 1 : 0;
      label78:
      if (var8 == null) {
         label76:
         if (this.O) {
            label82: {
               var16 = var10;
               if (var8 == null) {
                  if (var10 != 0) {
                     break label82;
                  }

                  var16 = var2;
               }

               if (var8 != null) {
                  break label78;
               }

               if (var16 != this.h) {
                  break label76;
               }
            }

            Graphics2D var11 = (Graphics2D)var1;
            Float var10001 = 0.35F;
            int var10002 = var10;
            if (var8 == null) {
               var10002 = var10 == 0 ? 1 : 0;
            }

            Composite var12 = RV.a(var11, var10001, (boolean)var10002);
            Rectangle var13 = new Rectangle(var3);
            var13.x = var13.x + this.g;
            var13.y = var13.y + this.g;
            var10002 = this.g;
            int var10003 = 2;
            if (var8 == null) {
               var10002 = this.g * 2;
               var10003 = this.u != null ? 1 : 0;
            }

            var13.width -= var10002 + var10003;
            var10002 = this.g;
            var10003 = 2;
            if (var8 == null) {
               var10002 = this.g * 2;
               var10003 = this.u != null ? 1 : 0;
            }

            var13.height -= var10002 + var10003;
            GA.R(
               var11,
               this.list,
               new Double((double)var13.x, (double)var13.y, (double)var13.width, (double)var13.height, (double)(this.l * 2), (double)(this.l * 2)),
               GO.r,
               this.g,
               true,
               this.b,
               this.u,
               this.u,
               this.d
            );
            var10002 = var10;
            if (var8 == null) {
               var10002 = var10 == 0 ? 1 : 0;
            }

            RV.E(var11, var12, (boolean)var10002);
         }

         var16 = (this.list.hasFocus()) ? 1 : 0;
      }

      label63: {
         label83: {
            if (var8 == null) {
               if (var16 == 0) {
                  break label83;
               }

               var16 = var2;
            }

            if (var8 != null) {
               break label63;
            }

            if (var16 == var7) {
               var16 = 1;
               break label63;
            }
         }

         var16 = 0;
      }

      int var14 = var16;
      Component var15 = var4.getListCellRendererComponent(this.list, var9, var2, (boolean)var10, (boolean)((((var14 != 0) != 0) != 0) != 0));
      this.rendererPane.paintComponent(var1, var15, this.list, var3.x, var3.y, var3.width, var3.height, true);
   }

   public static JList q(Yc2_2 var0) {
      return var0.list;
   }

   public static JList V(Yc2_2 var0) {
      return var0.list;
   }

   public static JList k(Yc2_2 var0) {
      return var0.list;
   }

   public static JList C(Yc2_2 var0) {
      return var0.list;
   }

   public static JList Q(Yc2_2 var0) {
      return var0.list;
   }

   public static JList T(Yc2_2 var0) {
      return var0.list;
   }

   public static JList l(Yc2_2 var0) {
      return var0.list;
   }

   public static JList o(Yc2_2 var0) {
      return var0.list;
   }

   public static JList W(Yc2_2 var0) {
      return var0.list;
   }

   public static JList i(Yc2_2 var0) {
      return var0.list;
   }

   public static JList b(Yc2_2 var0) {
      return var0.list;
   }

   public static JList O(Yc2_2 var0) {
      return var0.list;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u001a9*' 6".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 82;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 82;
         var10006 = var0;
      } else {
         var6 = 82;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 82;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 39;
               break;
            case 1:
               var23 = 27;
               break;
            case 2:
               var23 = 25;
               break;
            case 3:
               var23 = 4;
               break;
            case 4:
               var23 = 7;
               break;
            case 5:
               var23 = 1;
               break;
            default:
               var23 = 60;
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





