package com.C;

import com.GA;
import com.GO;
import com.RV;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Paint;
import java.awt.Rectangle;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.text.View;

public class v_2 extends com.Lz_2 implements com.lJ_3 {
   protected boolean P = com.o__2.U;
   protected Color B = com.o__2.v;
   protected Float L = com.o__2.l;
   protected com.og_4 e = com.o__2.j;
   protected Rectangle M = new Rectangle();
   protected Rectangle f = new Rectangle();
   private static final String a;
   private static final long g;

   public v_2() {
   }

   public v_2(com.og_4 var1) {
      this.w(var1);
   }

   public boolean E() {
      return this.P;
   }

   @Override
   public void l(boolean var1) {
      this.P = var1;
   }

   public Color z() {
      return this.B;
   }

   public void t(Color var1) {
      this.B = var1;
   }

   public Float S() {
      return this.L;
   }

   public void A(Float var1) {
      this.L = var1;
   }

   public com.og_4 J() {
      return this.e;
   }

   public void w(com.og_4 var1) {
      this.e = var1;
      this.Z();
   }

   public Boolean A(JLabel var1) {
      return null;
   }

   public Insets Q(JLabel var1) {
      int[] var2 = com.C.W.B();
      v_2 var10000 = this;
      if (var2 == null) {
         if (this.e != null) {
            return this.e.B(var1);
         }

         var10000 = this;
      }

      return var10000.B(var1);
   }

   public void u(Graphics2D var1, Rectangle var2, JLabel var3) {
      int[] var4;
      Composite var5;
      Font var7;
      Map var8;
      Paint var9;
      String var10;
      Icon var17;
      label88: {
         var4 = com.C.W.B();
         var5 = RV.a(var1, this.L, this.L != null);
         Map var6 = this.P ? GO.FQ : GO.e;
         var7 = RV.b(var1, var3.getFont());
         var8 = com.FN.d(var1, var6);
         var9 = var1.getPaint();
         var10 = var3.getText();
         JLabel var10000 = var3;
         if (var4 == null) {
            if (var3.isEnabled()) {
               var17 = var3.getIcon();
               break label88;
            }

            var10000 = var3;
         }

         var17 = var10000.getDisabledIcon();
      }

      Icon var11;
      label82: {
         var11 = var17;
         com.og_4 var18 = this.e;
         if (var4 == null) {
            if (this.e == null) {
               break label82;
            }

            var18 = this.e;
         }

         var18.u(var1, var2, var3);
      }

      if (var11 != null || var10 != null) {
         FontMetrics var12;
         String var13;
         label75: {
            var12 = var3.getFontMetrics(var3.getFont());
            var13 = this.i(var3, var12, var3.getWidth(), var3.getHeight());
            var17 = var11;
            if (var4 == null) {
               if (var11 == null) {
                  break label75;
               }

               var17 = var11;
            }

            var17.paintIcon(var3, var1, this.M.x, this.M.y);
         }

         label92: {
            var17 = var10;
            if (var4 == null) {
               if (var10 == null) {
                  break label92;
               }

               var17 = (Icon)var3.getClientProperty(a);
            }

            label63: {
               View var14 = (View)var17;
               View var21 = var14;
               if (var4 == null) {
                  if (var14 == null) {
                     break label63;
                  }

                  var21 = var14;
               }

               var21.paint(var1, this.f);
               if (var4 == null) {
                  break label92;
               }
            }

            int var15;
            int var16;
            label55: {
               var15 = this.f.x;
               var16 = this.f.y + var12.getAscent();
               if (var4 == null) {
                  if (!var3.isEnabled()) {
                     break label55;
                  }

                  this.u(var3, var1, var13, var15, var16);
               }

               if (var4 == null) {
                  break label92;
               }
            }

            this.O(var3, var1, var13, var15, var16);
         }

         var1.setPaint(var9);
         com.FN.k(var1, var8);
         RV.j(var1, var7);
         RV.E(var1, var5, this.L != null);
      }
   }

   protected String i(JLabel var1, FontMetrics var2, int var3, int var4) {
      Insets var6;
      String var7;
      Icon var11;
      label14: {
         int[] var10000 = com.C.W.B();
         var6 = var1.getInsets(null);
         var7 = var1.getText();
         int[] var5 = var10000;
         JLabel var10 = var1;
         if (var5 == null) {
            if (var1.isEnabled()) {
               var11 = var1.getIcon();
               break label14;
            }

            var10 = var1;
         }

         var11 = var10.getDisabledIcon();
      }

      Icon var8 = var11;
      Rectangle var9 = new Rectangle();
      var9.x = var6.left;
      var9.y = var6.top;
      var9.width = var3 - (var6.left + var6.right);
      var9.height = var4 - (var6.top + var6.bottom);
      this.M.x = this.M.y = this.M.width = this.M.height = 0;
      this.f.x = this.f.y = this.f.width = this.f.height = 0;
      return this.d(var1, var2, var7, var8, var9, this.M, this.f);
   }

   protected String d(JLabel var1, FontMetrics var2, String var3, Icon var4, Rectangle var5, Rectangle var6, Rectangle var7) {
      return SwingUtilities.layoutCompoundLabel(
         var1,
         var2,
         var3,
         var4,
         var1.getVerticalAlignment(),
         var1.getHorizontalAlignment(),
         var1.getVerticalTextPosition(),
         var1.getHorizontalTextPosition(),
         var5,
         var6,
         var7,
         var1.getIconTextGap()
      );
   }

   protected void u(JLabel var1, Graphics2D var2, String var3, int var4, int var5) {
      int[] var6 = com.C.W.B();
      int var10000 = this.P;
      if (var6 == null) {
         if (this.P) {
            var2.setColor(var1.getForeground());
            this.V(var2, var3, var4, var5);
            if (var6 == null) {
               return;
            }
         }

         var10000 = var1.getDisplayedMnemonicIndex();
      }

      int var7 = var10000;
      var2.setColor(var1.getForeground());
      com.FN.W(var2, var3, var7, var4, var5);
   }

   protected void O(JLabel var1, Graphics2D var2, String var3, int var4, int var5) {
      int var10000;
      int[] var6 = com.C.W.B();
      var10000 = var1.isEnabled();
      label20:
      if (var6 == null) {
         if (var10000 != 0) {
            var10000 = this.P;
            if (var6 != null) {
               break label20;
            }

            if (this.P) {
               var2.setColor(var1.getBackground().darker());
               this.V(var2, var3, var4, var5);
               if (var6 == null) {
                  return;
               }
            }
         }

         var10000 = var1.getDisplayedMnemonicIndex();
      }

      int var7 = var10000;
      Color var8 = var1.getBackground();
      var2.setColor(var8.brighter());
      com.FN.W(var2, var3, var7, var4 + 1, var5 + 1);
      var2.setColor(var8.darker());
      com.FN.W(var2, var3, var7, var4, var5);
   }

   protected void V(Graphics2D var1, String var2, int var3, int var4) {
      var1.translate(var3, var4);
      GA.v(var1, var2, this.B);
      var1.translate(-var3, -var4);
   }

   public Dimension K(JLabel var1) {
      int[] var2;
      String var3;
      Icon var19;
      label50: {
         int[] var10000 = com.C.W.B();
         var3 = var1.getText();
         var2 = var10000;
         JLabel var18 = var1;
         if (var2 == null) {
            if (var1.isEnabled()) {
               var19 = var1.getIcon();
               break label50;
            }

            var18 = var1;
         }

         var19 = var18.getDisabledIcon();
      }

      Icon var4;
      Font var6;
      int var7;
      int var8;
      label43: {
         var4 = var19;
         Insets var5 = var1.getInsets(null);
         var6 = var1.getFont();
         var7 = var5.left + var5.right;
         var8 = var5.top + var5.bottom;
         if (var4 == null) {
            var20 = var3;
            if (var2 == null) {
               if (var3 == null) {
                  return new Dimension(var7, var8);
               }

               var20 = var3;
            }

            if (var2 != null) {
               break label43;
            }

            if (var20 != null && var6 == null) {
               return new Dimension(var7, var8);
            }
         }

         var20 = var3;
      }

      if (var20 != null && (var4 == null || var6 != null)) {
         FontMetrics var9 = var1.getFontMetrics(var6);
         Rectangle var10 = new Rectangle();
         Rectangle var11 = new Rectangle();
         Rectangle var12 = new Rectangle();
         var10.x = var10.y = var10.width = var10.height = 0;
         var11.x = var11.y = var11.width = var11.height = 0;
         var12.x = var7;
         var12.y = var8;
         var12.width = var12.height = (int)g;
         this.d(var1, var9, var3, var4, var12, var10, var11);
         int var13 = Math.min(var10.x, var11.x);
         int var14 = Math.max(var10.x + var10.width, var11.x + var11.width);
         int var15 = Math.min(var10.y, var11.y);
         int var16 = Math.max(var10.y + var10.height, var11.y + var11.height);
         Dimension var17 = new Dimension(var14 - var13, var16 - var15);
         var17.width += var7;
         var17.height += var8;
         return var17;
      } else {
         return new Dimension(var4.getIconWidth() + var7, var4.getIconHeight() + var8);
      }
   }

   @Override
   public Insets B(JComponent var1) {
      return this.Q((JLabel)var1);
   }

   @Override
   public Dimension d(JComponent var1) {
      return this.K((JLabel)var1);
   }

   @Override
   public Boolean d$Boolean(JComponent var1) {
      return this.A((JLabel)var1);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.u(var1, var2, (JLabel)var3);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\r[?\u000e".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 35;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 35;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 70;
               break;
            case 1:
               var21 = 12;
               break;
            case 2:
               var21 = 113;
               break;
            case 3:
               var21 = 65;
               break;
            case 4:
               var21 = 91;
               break;
            case 5:
               var21 = 110;
               break;
            default:
               var21 = 97;
         }
      } else {
         var13 = 35;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 6720792543983592695L;
            long var12 = 7528628256878893832L ^ var3;
            var8 = -1;
            g = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 35;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 70;
               break;
            case 1:
               var21 = 12;
               break;
            case 2:
               var21 = 113;
               break;
            case 3:
               var21 = 65;
               break;
            case 4:
               var21 = 91;
               break;
            case 5:
               var21 = 110;
               break;
            default:
               var21 = 97;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 70;
                  break;
               case 1:
                  var21 = 12;
                  break;
               case 2:
                  var21 = 113;
                  break;
               case 3:
                  var21 = 65;
                  break;
               case 4:
                  var21 = 91;
                  break;
               case 5:
                  var21 = 110;
                  break;
               default:
                  var21 = 97;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 6720792543983592695L;
               long var11 = 7528628256878893832L ^ var0;
               var6 = -1;
               g = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 70;
                  break;
               case 1:
                  var21 = 12;
                  break;
               case 2:
                  var21 = 113;
                  break;
               case 3:
                  var21 = 65;
                  break;
               case 4:
                  var21 = 91;
                  break;
               case 5:
                  var21 = 110;
                  break;
               default:
                  var21 = 97;
            }
         }
      }
   }
}





