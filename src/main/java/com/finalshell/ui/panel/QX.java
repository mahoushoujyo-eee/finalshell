package com.finalshell.ui.panel;

import com.finalshell.core.AL_2;
import com.finalshell.core.C42;
import com.finalshell.core.CD3_2;
import com.finalshell.core.C_k_2;
import com.finalshell.core.Cg4;
import com.finalshell.core.E_2;
import com.finalshell.core.FN;
import com.finalshell.core.NC;
import com.finalshell.core.ON;
import com.finalshell.core.Og4;
import com.finalshell.core.RV;
import com.finalshell.core.WC_2;
import com.finalshell.core.Wu4;
import com.finalshell.ui.listener.Fd_2;
import com.finalshell.ui.listener.Ff2;
import com.finalshell.ui.listener.Fi2;
import com.finalshell.ui.listener.IW3;
import com.finalshell.ui.listener.NQ3;
import com.finalshell.ui.listener.X7;
import com.finalshell.ui.model.IC3;
import com.finalshell.ui.model.TM;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ComponentListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.event.AncestorListener;

public class QX extends Ky4 {
   public List w = new ArrayList(2);
   public boolean i = false;
   public boolean s = false;
   public boolean h = true;
   public Component v = null;
   public List u = new ArrayList();
   public Component b = null;
   public ComponentListener f = null;
   public AncestorListener V = null;
   public boolean p = false;
   public IC3 M;
   public float F = 0.0F;
   public WC_2 C;
   public C42 o;
   public static String[] c;
   public static String g;
   public static long z;

   public QX() {
      this(NC.P());
   }

   public QX(TM var1) {
      this(var1.F());
   }

   public QX(Og4 var1) {
      super(var1);
      this.P$void();
   }

   public QX(String var1) {
      super(var1);
      this.P$void();
   }

   public void P$void() {
      this.setOpaque(false);
      this.setFocusCycleRoot(true);
      NQ3.S(this);
      this.C = new WC_2(g, z);
      this.C.q(new IW3(this));
      this.addAncestorListener(new Fd_2(this));
      this.o = new CD3_2(this, true);
      ON.b(this, this.o);
   }

   public void j(boolean var1) {
      String[] var2 = Y();
      boolean var10000 = this.isShowing();
      if (var2 == null) {
         if (!var10000) {
            return;
         }

         var10000 = var1;
      }

      if (var2 == null) {
         if (var10000) {
            return;
         }

         var10000 = this.y();
      }

      label41: {
         if (var2 == null) {
            if (var10000) {
               return;
            }

            var3 = this;
            if (var2 != null) {
               break label41;
            }

            var10000 = this.s;
         }

         if (!var10000) {
            return;
         }

         var3 = this;
      }

      var3.V();
   }

   public Qt2 D() {
      return (Qt2)this.getParent();
   }

   public void k(TM var1) {
      this.L(var1.F());
   }

   public boolean P$boolean() {
      return this.i;
   }

   public void c(boolean var1) {
      this.i = var1;
   }

   public boolean q() {
      return this.s;
   }

   public void U(boolean var1) {
      this.s = var1;
   }

   public boolean G() {
      return this.h;
   }

   public void O(boolean var1) {
      this.h = var1;
   }

   public Component E() {
      return this.v;
   }

   public void f(Component var1) {
      this.v = var1;
   }

   public List N() {
      String[] var10000 = Y();
      ArrayList var2 = new ArrayList(this.u.size());
      String[] var1 = var10000;

      for (WeakReference var4 : this.u) {
         Component var5 = (Component)var4.get();
         if (var5 != null) {
            var2.add(var5);
         }

         if (var1 != null) {
            break;
         }
      }

      return var2;
   }

   public void G(Component var1) {
      this.u.add(new WeakReference<>(var1));
   }

   public void E(Component var1) {
      this.u.remove(var1);
   }

   public boolean y() {
      String[] var10000 = Y();
      Iterator var2 = this.u.iterator();
      String[] var1 = var10000;

      while (var2.hasNext()) {
         label37: {
            WeakReference var3 = (WeakReference)var2.next();
            Component var4 = (Component)var3.get();
            Component var5 = var4;
            if (var1 == null) {
               if (var4 == null) {
                  break label37;
               }

               var5 = var4;
            }

            boolean var6 = FN.l(var5);
            if (var1 != null) {
               return var6;
            }

            if (var6) {
               return true;
            }
         }

         if (var1 != null) {
            break;
         }
      }

      return false;
   }

   public void S(Component var1) {
      this.h(var1, new C_k_2(this, var1));
   }

   public void l(Component var1) {
      NC.b(var1, this, this.h);
      this.k();
   }

   public void I(Component var1, Rectangle var2) {
      this.P(var1, var2.x, var2.y, var2.width, var2.height);
   }

   public void P(Component var1, int var2, int var3, int var4, int var5) {
      this.k(var1, var2, var3, var4, var5);
      NC.b(var1, this, this.h);
      this.m(var1, var2, var3, var4, var5);
   }

   public void E(Component var1, Point var2) {
      this.m(var1, var2.x, var2.y);
   }

   public void m(Component var1, int var2, int var3) {
      this.h(var1, new Wu4(this, var2, var3));
   }

   public void h(Component var1, E_2 var2) {
      this.A(var1, (Rectangle)var2.J());
      NC.b(var1, this, this.h);
      this.I(var1, var2);
   }

   public void A(Component var1, Rectangle var2) {
      this.k(var1, var2.x, var2.y, var2.width, var2.height);
   }

   public void k(Component var1, int var2, int var3, int var4, int var5) {
      String[] var6 = Y();
      Component var10000 = var1;
      if (var6 == null) {
         if (!var1.isShowing()) {
            return;
         }

         var10000 = var1;
      }

      Rectangle var7 = FN.O$Rectangle(var10000);
      this.setBounds(var7.x + var2, var7.y + var3, var4, var5);
      this.revalidate();
      this.repaint();
   }

   public void m(Component var1, int var2, int var3, int var4, int var5) {
      this.k();
      String[] var10000 = Y();
      this.b = var1;
      String[] var6 = var10000;
      Component var7 = var1;
      if (var6 == null) {
         if (!(var1 instanceof JComponent)) {
            return;
         }

         this.V = new Fi2(this, var1, var2, var3, var4, var5);
         var7 = this.b;
      }

      ((JComponent)var7).addAncestorListener(this.V);
   }

   public void I(Component var1, E_2 var2) {
      this.k();
      this.b = var1;
      String[] var10000 = Y();
      this.f = new X7(this, var1, var2);
      this.b.addComponentListener(this.f);
      String[] var3 = var10000;
      Component var4 = var1;
      if (var3 == null) {
         if (!(var1 instanceof JComponent)) {
            return;
         }

         this.V = new Ff2(this, var1, var2);
         var4 = this.b;
      }

      ((JComponent)var4).addAncestorListener(this.V);
   }

   public void k() {
      String[] var1 = Y();
      Object var10000 = this;
      if (var1 == null) {
         if (this.b == null) {
            return;
         }

         var10000 = this;
      }

      if (var1 == null) {
         if (((QX)var10000).f != null) {
            this.b.removeComponentListener(this.f);
         }

         var10000 = this;
      }

      if (var1 == null) {
         if (((QX)var10000).V == null) {
            return;
         }

         var10000 = this.b;
      }

      if (var1 == null) {
         if (!(var10000 instanceof JComponent)) {
            return;
         }

         var10000 = this.b;
      }

      ((JComponent)var10000).removeAncestorListener(this.V);
   }

   public void A(Component var1) {
      this.c(var1, false, false);
   }

   public void c(Component var1, boolean var2, boolean var3) {
      NC.z(var1, this, var2, var3);
   }

   public void V() {
      String[] var1 = Y();
      QX var10000 = this;
      if (var1 == null) {
         if (this.i) {
            this.M = IC3.fadeOut;
            if (var1 == null) {
               if (this.C.i()) {
                  return;
               }

               this.C.u$WC();
            }

            if (var1 == null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.Z();
   }

   public void Z() {
      String[] var10000 = Y();
      this.k();
      Qt2 var2 = (Qt2)this.getParent();
      String[] var1 = var10000;
      Qt2 var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return;
         }

         var3 = var2;
      }

      var3.S(this);
   }

   public void T() {
      this.setSize(this.getPreferredSize());
   }

   public void R() {
      String[] var1 = Y();
      AncestorListener var10000 = this.V;
      if (var1 == null) {
         if (this.V == null) {
            return;
         }

         var10000 = this.V;
      }

      var10000.ancestorMoved(null);
   }

   @Override
   public boolean contains(int var1, int var2) {
      String[] var3 = Y();
      QX var10000 = this;
      if (var3 == null) {
         if (this.M == IC3.fadeOut) {
            return false;
         }

         var10000 = this;
      }

      boolean var4 = var10000.B().contains((double)var1, (double)var2);
      return var3 != null ? var4 : var4;
   }

   public void W(Cg4 var1) {
      this.w.add(var1);
   }

   public void j(Cg4 var1) {
      this.w.remove(var1);
   }

   public void X() {
      String[] var10000 = Y();
      Iterator var2 = AL_2.J((Collection)this.w).iterator();
      String[] var1 = var10000;

      while (var2.hasNext()) {
         Cg4 var3 = (Cg4)var2.next();
         var3.Y();
         if (var1 != null) {
            break;
         }
      }
   }

   public void C() {
      String[] var10000 = Y();
      Iterator var2 = AL_2.J((Collection)this.w).iterator();
      String[] var1 = var10000;

      while (var2.hasNext()) {
         Cg4 var3 = (Cg4)var2.next();
         var3.h();
         if (var1 != null) {
            break;
         }
      }
   }

   public void e() {
      String[] var10000 = Y();
      Iterator var2 = AL_2.J((Collection)this.w).iterator();
      String[] var1 = var10000;

      while (var2.hasNext()) {
         Cg4 var3 = (Cg4)var2.next();
         var3.T();
         if (var1 != null) {
            break;
         }
      }
   }

   public void H() {
      String[] var10000 = Y();
      Iterator var2 = AL_2.J((Collection)this.w).iterator();
      String[] var1 = var10000;

      while (var2.hasNext()) {
         Cg4 var3 = (Cg4)var2.next();
         var3.H();
         if (var1 != null) {
            break;
         }
      }
   }

   @Override
   public void paintComponent(Graphics var1) {
      String[] var2 = Y();
      QX var10000 = this;
      if (var2 == null) {
         if (this.F < 1.0F) {
            RV.p((Graphics2D)var1, this.F);
         }

         var10000 = this;
      }

      var10000.paintComponent(var1);
   }

   public static void f(String[] var0) {
      c = var0;
   }

   public static String[] Y() {
      return c;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      if (Y() != null) {
         f(new String[4]);
      }

      char[] var10003 = "j3%QP_(Mx!`[J".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 74;
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
         var10007 = 74;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 119;
               break;
            case 1:
               var21 = 28;
               break;
            case 2:
               var21 = 13;
               break;
            case 3:
               var21 = 75;
               break;
            case 4:
               var21 = 117;
               break;
            case 5:
               var21 = 101;
               break;
            default:
               var21 = 23;
         }
      } else {
         var13 = 74;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            g = var16;
            long var3 = 2846792827234914634L;
            long var12 = 2846792827234914659L ^ var3;
            var8 = -1;
            z = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 74;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 119;
               break;
            case 1:
               var21 = 28;
               break;
            case 2:
               var21 = 13;
               break;
            case 3:
               var21 = 75;
               break;
            case 4:
               var21 = 117;
               break;
            case 5:
               var21 = 101;
               break;
            default:
               var21 = 23;
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
                  var21 = 119;
                  break;
               case 1:
                  var21 = 28;
                  break;
               case 2:
                  var21 = 13;
                  break;
               case 3:
                  var21 = 75;
                  break;
               case 4:
                  var21 = 117;
                  break;
               case 5:
                  var21 = 101;
                  break;
               default:
                  var21 = 23;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               g = var15;
               long var0 = 2846792827234914634L;
               long var11 = 2846792827234914659L ^ var0;
               var6 = -1;
               z = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 119;
                  break;
               case 1:
                  var21 = 28;
                  break;
               case 2:
                  var21 = 13;
                  break;
               case 3:
                  var21 = 75;
                  break;
               case 4:
                  var21 = 117;
                  break;
               case 5:
                  var21 = 101;
                  break;
               default:
                  var21 = 23;
            }
         }
      }
   }
}





