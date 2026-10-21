package com.C;

import com.Gi_2;
import com._V;
import com.ex_4;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.GeneralPath;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.plaf.ButtonUI;

public class g_2 extends com.Lz_2 implements com.aC {
   protected Color x = _V.C;
   protected Color S;
   protected Color l;
   protected Color e;
   protected Color z;
   protected Color Q;
   protected Color B;
   protected Color T;
   protected ex_4 J;
   protected JScrollBar O;
   private static final String a;

   public g_2() {
      this.S = _V.z;
      this.l = _V.O;
      this.e = _V.e;
      this.z = _V.G;
      this.Q = _V.M;
      this.B = _V.h;
      this.T = _V.a;
      this.M(new Dimension(_V.s));
   }

   public Color Q() {
      return this.x;
   }

   public void k(Color var1) {
      int[] var2 = com.C.W.B();
      com.C.g_2 var10000 = this;
      if (var2 == null) {
         if (this.x == var1) {
            return;
         }

         this.x = var1;
         var10000 = this;
      }

      var10000.l();
   }

   public Color p() {
      return this.S;
   }

   public void C(Color var1) {
      int[] var2 = com.C.W.B();
      com.C.g_2 var10000 = this;
      if (var2 == null) {
         if (this.S == var1) {
            return;
         }

         this.S = var1;
         var10000 = this;
      }

      var10000.l();
   }

   public Color U() {
      return this.l;
   }

   public void w(Color var1) {
      int[] var2 = com.C.W.B();
      com.C.g_2 var10000 = this;
      if (var2 == null) {
         if (this.l == var1) {
            return;
         }

         this.l = var1;
         var10000 = this;
      }

      var10000.l();
   }

   public Color T() {
      return this.e;
   }

   public void f(Color var1) {
      int[] var2 = com.C.W.B();
      com.C.g_2 var10000 = this;
      if (var2 == null) {
         if (this.e == var1) {
            return;
         }

         this.e = var1;
         var10000 = this;
      }

      var10000.l();
   }

   public Color N() {
      return this.z;
   }

   public void d(Color var1) {
      int[] var2 = com.C.W.B();
      com.C.g_2 var10000 = this;
      if (var2 == null) {
         if (this.z == var1) {
            return;
         }

         this.z = var1;
         var10000 = this;
      }

      var10000.l();
   }

   public Color g() {
      return this.Q;
   }

   public void G(Color var1) {
      int[] var2 = com.C.W.B();
      com.C.g_2 var10000 = this;
      if (var2 == null) {
         if (this.Q == var1) {
            return;
         }

         this.Q = var1;
         var10000 = this;
      }

      var10000.l();
   }

   public Color K() {
      return this.B;
   }

   public void s(Color var1) {
      int[] var2 = com.C.W.B();
      com.C.g_2 var10000 = this;
      if (var2 == null) {
         if (this.B == var1) {
            return;
         }

         this.B = var1;
         var10000 = this;
      }

      var10000.l();
   }

   public Color d() {
      return this.T;
   }

   public void V(Color var1) {
      int[] var2 = com.C.W.B();
      com.C.g_2 var10000 = this;
      if (var2 == null) {
         if (this.T == var1) {
            return;
         }

         this.T = var1;
         var10000 = this;
      }

      var10000.l();
   }

   @Override
   public void I(ex_4 var1) {
      this.J = var1;
   }

   @Override
   public void g(JScrollBar var1) {
      this.O = var1;
   }

   public Insets N(AbstractButton var1) {
      int[] var2 = com.C.W.B();
      int var10000 = this.O.getOrientation();
      if (var2 == null) {
         var10000 = var10000 == 1 ? 1 : 0;
      }

      int var3 = var10000;
      boolean var4 = this.J == ex_4.decrease;
      return var3 != 0 ? new Insets(var4 ? 1 : 0, 1, var4 ? 0 : 1, 1) : new Insets(1, var4 ? 1 : 0, 1, var4 ? 0 : 1);
   }

   public void Q(Graphics2D var1, Rectangle var2, AbstractButton var3) {
      int[] var4;
      ButtonModel var5;
      ButtonUI var6;
      boolean var7;
      boolean var11;
      int[] var10000 = com.C.W.B();
      var5 = var3.getModel();
      var4 = var10000;
      var6 = var3.getUI();
      var7 = var3.isEnabled();
      var11 = var5.isPressed();
      label72:
      if (var4 == null) {
         if (!var11) {
            var11 = var5.isSelected();
            if (var4 != null) {
               break label72;
            }

            if (!var11) {
               var11 = false;
               break label72;
            }
         }

         var11 = true;
      }

      boolean var8 = var11;
      var11 = var6 instanceof Gi_2;
      if (var4 == null) {
         var11 = var11 ? ((Gi_2)var6).X() : var5.isRollover();
      }

      boolean var9;
      Shape var10;
      Color var13;
      label75: {
         var9 = var11;
         var10 = this.v(var2, var3);
         boolean var10001 = var7;
         if (var4 == null) {
            if (!var7) {
               var13 = this.e;
               break label75;
            }

            var10001 = var8;
         }

         if (var4 == null) {
            if (var10001) {
               var13 = this.T;
               break label75;
            }

            var10001 = var9;
         }

         var13 = var10001 ? this.Q : this.S;
      }

      label76: {
         var1.setPaint(var13);
         var1.fill(var10);
         boolean var14 = var7;
         if (var4 == null) {
            if (!var7) {
               var13 = this.l;
               break label76;
            }

            var14 = var8;
         }

         if (var4 == null) {
            if (var14) {
               var13 = this.B;
               break label76;
            }

            var14 = var9;
         }

         var13 = var14 ? this.z : this.x;
      }

      var1.setPaint(var13);
      var1.draw(var10);
   }

   protected Shape v(Rectangle var1, AbstractButton var2) {
      return com.o4_2.k(var2, a, new com.C.R(this, var1, var2), this.W(var2));
   }

   protected Object[] W(AbstractButton var1) {
      return new Object[]{var1.getSize(), var1.getInsets(), this.J, var1.getComponentOrientation().isLeftToRight(), this.O.getOrientation()};
   }

   protected Shape d(Rectangle var1, AbstractButton var2) {
      int[] var10000 = com.C.W.B();
      int var4 = this.O.getOrientation();
      Insets var5 = var2.getInsets();
      int var6 = var1.x + var5.left;
      int[] var3 = var10000;
      int var7 = var1.y + var5.top;
      int var8 = var1.width - var5.left - var5.right - 1;
      int var9 = var1.height - var5.top - var5.bottom - 1;
      int var12 = var4;
      if (var3 == null) {
         if (var4 == 1) {
            if (this.J == ex_4.decrease) {
               GeneralPath var10 = new GeneralPath(0);
               var10.moveTo((float)var6, (float)(var7 + var9));
               var10.quadTo((float)var6 + (float)var8 / 2.0F, (float)var7 + (float)(var9 * 2) / 3.0F, (float)(var6 + var8), (float)(var7 + var9));
               var10.lineTo((float)var6 + (float)var8 / 2.0F, (float)var7);
               var10.closePath();
               if (var3 == null) {
                  return var10;
               }
            }

            GeneralPath var13 = new GeneralPath(0);
            var13.moveTo((float)var6, (float)var7);
            var13.quadTo((float)var6 + (float)var8 / 2.0F, (float)var7 + (float)var9 / 3.0F, (float)(var6 + var8), (float)var7);
            var13.lineTo((float)var6 + (float)var8 / 2.0F, (float)(var7 + var9));
            var13.closePath();
            if (var3 == null) {
               return var13;
            }
         }

         var12 = this.O.getComponentOrientation().isLeftToRight();
      }

      int var11 = var12;
      if (var11 != 0 ? this.J == ex_4.decrease : this.J == ex_4.increase) {
         GeneralPath var14 = new GeneralPath(0);
         var14.moveTo((float)(var6 + var8), (float)var7);
         var14.quadTo((float)var6 + (float)(var8 * 2) / 3.0F, (float)var7 + (float)var9 / 2.0F, (float)(var6 + var8), (float)(var7 + var9));
         var14.lineTo((float)var6, (float)var7 + (float)var9 / 2.0F);
         var14.closePath();
         if (var3 == null) {
            return var14;
         }
      }

      GeneralPath var15 = new GeneralPath(0);
      var15.moveTo((float)var6, (float)var7);
      var15.quadTo((float)var6 + (float)var8 / 3.0F, (float)var7 + (float)var9 / 2.0F, (float)var6, (float)(var7 + var9));
      var15.lineTo((float)(var6 + var8), (float)var7 + (float)var9 / 2.0F);
      var15.closePath();
      return var15;
   }

   @Override
   public Insets B(JComponent var1) {
      return this.N((AbstractButton)var1);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.Q(var1, var2, (AbstractButton)var3);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "A\u001c@\u0011\u0015z0U\u001aF\u0011\f".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 66;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 66;
         var10006 = var0;
      } else {
         var6 = 66;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 66;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 98;
               break;
            case 1:
               var23 = 44;
               break;
            case 2:
               var23 = 112;
               break;
            case 3:
               var23 = 60;
               break;
            case 4:
               var23 = 32;
               break;
            case 5:
               var23 = 21;
               break;
            default:
               var23 = 16;
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





