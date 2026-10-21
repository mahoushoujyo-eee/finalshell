package com.finalshell.ui.panel;

import com.finalshell.core.AL_2;
import com.finalshell.core.C_7;
import com.finalshell.core.FN;
import com.finalshell.core.N62;
import com.finalshell.core.OO;
import com.finalshell.core.TK;
import com.finalshell.task.Cu2_2;
import com.finalshell.task.Si2;
import com.finalshell.ui.listener.RF;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Qj2 extends Ky4 {
   protected List E;
   protected boolean x;
   protected boolean k;
   protected XW p;
   protected List F;
   protected Component o;
   public static String a;

   public Qj2() {
      this((Component)null);
   }

   public Qj2(Component var1) {
      this(var1, null);
   }

   public Qj2(N62 var1) {
      this(null, var1);
   }

   public Qj2(Component var1, N62 var2) {
      super(new TK());
      String[] var10000 = XW.w();
      this.E = new ArrayList(1);
      this.x = true;
      this.k = false;
      String[] var3 = var10000;
      this.p = null;
      this.F = null;
      this.setFocusable(false);
      this.N(var2);
      this.o = var1;
      if (var3 == null && var1 != null) {
         this.add(var1);
      }
   }

   public boolean L() {
      return this.x;
   }

   public void a(boolean var1) {
      this.x = var1;
   }

   public Component j() {
      String[] var1 = XW.w();
      Object var10000 = this;
      if (var1 == null) {
         var10000 = this.getComponentCount() > 0 ? this.getComponent(0) : null;
      }

      return (Component)var10000;
   }

   public void M(Component var1) {
      String[] var2 = XW.w();
      Qj2 var10000 = this;
      if (var2 == null) {
         if (this.n()) {
            return;
         }

         this.o = var1;
         this.removeAll();
         this.add(var1);
         this.revalidate();
         var10000 = this;
      }

      var10000.repaint();
   }

   public void L(Component var1) {
      FN.p(new Si2(this, var1));
   }

   public void A(long var1, Component var3) {
      FN.u(var1, new Cu2_2(this, var3));
   }

   protected void W(Component var1) {
      String[] var2 = XW.w();
      Qj2 var10000 = this;
      if (var2 == null) {
         if (this.o == var1) {
            return;
         }

         this.o = var1;
         var10000 = this;
      }

      if (var2 == null) {
         if (!var10000.y$boolean()) {
            this.I(var1);
            return;
         }

         var10000 = this;
      }

      if (var2 == null) {
         label80:
         if (var10000.p != null) {
            var10000 = this;
            if (var2 == null) {
               if (this.n()) {
                  this.p.d();
                  if (var2 == null) {
                     break label80;
                  }
               }

               var10000 = this;
            }

            var10000.p.b(true);
         }

         this.k = true;
         var10000 = this;
      }

      int var3;
      int var4;
      BufferedImage var5;
      label90: {
         var3 = var10000.getWidth();
         var4 = this.getHeight();
         var10000 = this;
         if (var2 == null) {
            if (this.p != null) {
               var5 = this.p.y();
               if (var2 == null) {
                  break label90;
               }
            }

            var10000 = this;
         }

         if (var2 == null) {
            var10000 = var10000.getComponentCount() > 0 ? this.getComponent(0) : null;
         }

         Object var6 = var10000;
         var5 = FN.O((Component)var6, var3, var4);
      }

      this.setFocusable(true);
      var10000 = this;
      label64:
      if (var2 == null) {
         if (this.x) {
            var10000 = this;
            if (var2 != null) {
               break label64;
            }

            if (FN.l((Component)this)) {
               label58: {
                  RF var7 = new RF(this, var1, var3, var4, var5);
                  this.addFocusListener(var7);
                  var10000 = this;
                  if (var2 == null) {
                     if (this.requestFocusInWindow()) {
                        break label58;
                     }

                     this.removeFocusListener(var7);
                     var10000 = this;
                  }

                  var10000.I(var1, var3, var4, var5);
               }

               if (var2 == null) {
                  return;
               }
            }
         }

         var10000 = this;
      }

      var10000.I(var1, var3, var4, var5);
   }

   protected boolean y$boolean() {
      String[] var1 = XW.w();
      Qj2 var10000 = this;
      if (var1 == null) {
         if (this.N() == null) {
            return false;
         }

         var10000 = this;
      }

      boolean var2 = var10000.isShowing();
      return var1 != null ? var2 : var2;
   }

   protected void I(Component var1, int var2, int var3, BufferedImage var4) {
      String[] var10000 = XW.w();
      this.removeAll();
      String[] var5 = var10000;
      Component var7 = var1;
      if (var5 == null) {
         if (var1 != null) {
            this.add(var1, a);
         }

         var7 = var1;
      }

      BufferedImage var6 = FN.O(var7, var2, var3);
      this.removeAll();
      this.p = new XW(var4, var6);
      this.p.C(this.F);
      this.add(this.p);
      this.revalidate();
      this.repaint();
      this.p.s(new OO(this, var1));
      this.p.x();
      if (Ky4.F$arrString() != null) {
         XW.N(new String[4]);
      }
   }

   protected void I(Component var1) {
      String[] var10000 = XW.w();
      this.removeAll();
      String[] var2 = var10000;
      if (var2 == null) {
         if (var1 != null) {
            this.add(var1);
         }

         this.revalidate();
         this.repaint();
         this.k = false;
      }

      Qj2 var3 = this;
      if (var2 == null) {
         if (this.isFocusOwner()) {
            this.transferFocus();
         }

         this.setFocusable(false);
         var3 = this;
      }

      if (var2 == null) {
         if (var3.p != null) {
            this.p.R$void();
            this.p = null;
         }

         var3 = this;
      }

      var3.y$void();
   }

   public boolean n() {
      return this.k;
   }

   public List u() {
      return this.F;
   }

   public N62 N() {
      String[] var1 = XW.w();
      List var10000 = this.F;
      if (var1 == null) {
         if (this.F == null) {
            return null;
         }

         var10000 = this.F;
      }

      if (var1 != null) {
         return (N62)var10000;
      } else {
         return var10000.size() > 0 ? (N62)this.F.get(0) : null;
      }
   }

   public void J(N62 var1) {
      String[] var2 = XW.w();
      List var10000 = this.F;
      if (var2 == null) {
         if (this.F == null) {
            this.F = new ArrayList();
         }

         var10000 = this.F;
      }

      var10000.add(var1);
   }

   public void P() {
      String[] var1 = XW.w();
      Qj2 var10000 = this;
      if (var1 == null) {
         if (this.F == null) {
            return;
         }

         var10000 = this;
      }

      var10000.F = null;
   }

   public void Y(N62 var1) {
      String[] var2 = XW.w();
      List var10000 = this.F;
      if (var2 == null) {
         if (this.F == null) {
            return;
         }

         var10000 = this.F;
      }

      var10000.remove(var1);
   }

   public void N(N62 var1) {
      this.F = var1 != null ? AL_2.e(new N62[]{var1}) : null;
   }

   public void v(List var1) {
      this.F = var1;
   }

   public void A(N62[] var1) {
      ArrayList var3;
      label14: {
         String[] var2 = XW.w();
         N62[] var10001 = var1;
         if (var2 == null) {
            if (var1 == null) {
               var3 = null;
               break label14;
            }

            var10001 = var1;
         }

         var3 = AL_2.e(var10001);
      }

      this.F = var3;
   }

   public void R(C_7 var1) {
      this.E.add(var1);
   }

   public void n(C_7 var1) {
      this.E.remove(var1);
   }

   public void g() {
      String[] var10000 = XW.w();
      Iterator var2 = AL_2.J((Collection)this.E).iterator();
      String[] var1 = var10000;

      while (var2.hasNext()) {
         C_7 var3 = (C_7)var2.next();
         var3.X();
         if (var1 != null) {
            break;
         }
      }
   }

   public void y$void() {
      String[] var10000 = XW.w();
      Iterator var2 = AL_2.J((Collection)this.E).iterator();
      String[] var1 = var10000;

      while (var2.hasNext()) {
         C_7 var3 = (C_7)var2.next();
         var3.L();
         if (var1 != null) {
            break;
         }
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "b%\\\u0011%\u0007".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 1;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 1;
         var10006 = var0;
      } else {
         var6 = 1;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 1;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 43;
               break;
            case 1:
               var23 = 109;
               break;
            case 2:
               var23 = 25;
               break;
            case 3:
               var23 = 84;
               break;
            case 4:
               var23 = 97;
               break;
            case 5:
               var23 = 72;
               break;
            default:
               var23 = 39;
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





