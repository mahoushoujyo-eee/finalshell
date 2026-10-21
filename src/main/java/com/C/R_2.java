package com.c;

import com.GA;
import com.GO;
import com.RV;
import com.p6_2;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.geom.RoundRectangle2D.Double;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class R_2 extends BasicInternalFrameUI {
   protected Color t = com.c.H.e;
   protected int X = 1;
   protected p6_2 m;
   protected boolean Q = false;
   private static final String a;

   public static ComponentUI createUI(JComponent var0) {
      return new R_2((JInternalFrame)var0);
   }

   public R_2(JInternalFrame var1) {
      super(var1);
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      com.FN.Y(this.frame);
      LookAndFeel.installProperty(this.frame, a, Boolean.FALSE);
      this.frame.setBackground(this.t);
      this.frame.setBorder(GA.C(0, 0, 0, 0));
      this.m = new m_4(this);
      com.ON.b(this.frame, this.m);
   }

   @Override
   public void uninstallUI(JComponent var1) {
      com.ON.i(this.m);
      super.uninstallUI(var1);
   }

   @Override
   protected JComponent createNorthPane(JInternalFrame var1) {
      this.titlePane = new D_2(var1);
      return this.titlePane;
   }

   @Override
   protected JComponent createWestPane(JInternalFrame var1) {
      return new J_2(this);
   }

   @Override
   protected JComponent createEastPane(JInternalFrame var1) {
      return new N_2(this);
   }

   @Override
   protected JComponent createSouthPane(JInternalFrame var1) {
      return new U_2(this);
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      int[] var3;
      Graphics2D var4;
      Object var5;
      Color var12;
      label22: {
         label21: {
            int[] var10000 = D_2.W();
            var4 = (Graphics2D)var1;
            var3 = var10000;
            var5 = RV.X(var4);
            boolean var10002 = var2.isEnabled();
            if (var3 == null) {
               if (!var10002) {
                  break label21;
               }

               var10002 = this.Q;
            }

            if (var10002) {
               var12 = GO.c;
               break label22;
            }
         }

         var12 = GO.r;
      }

      GA.r(var4, var2, var12, GO.FG, GO.FT, true, false);
      Insets var6 = var2.getInsets();
      int var7 = var6.left + 3 + this.X;
      int var8 = var6.top + this.titlePane.getHeight() - 1;
      int var9 = var2.getWidth() - 1 - var6.left - 3 - this.X - var6.right - 3 - this.X;
      int var10 = var2.getHeight() - 1 - var6.top - this.titlePane.getHeight() + 1 - var6.bottom - 3 - this.X;
      int var11 = (GO.FT - 1) * 2;
      var4.setPaint(Color.GRAY);
      var4.draw(new Double((double)var7, (double)var8, (double)var9, (double)var10, (double)var11, (double)var11));
      RV.X(var4, var5);
      if (var3 != null) {
         com.ky_4.K(new String[2]);
      }
   }

   static JInternalFrame D(R_2 var0) {
      return var0.frame;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u001a?|5\u0000>".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 114;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 114;
         var10006 = var0;
      } else {
         var6 = 114;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 114;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 7;
               break;
            case 1:
               var23 = 61;
               break;
            case 2:
               var23 = 111;
               break;
            case 3:
               var23 = 54;
               break;
            case 4:
               var23 = 7;
               break;
            case 5:
               var23 = 41;
               break;
            default:
               var23 = 4;
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





