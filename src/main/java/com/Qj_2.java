package com;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Qj_2 extends com.ky_4 {
   protected List E;
   protected boolean x;
   protected boolean k;
   protected XW p;
   protected List F;
   protected Component o;
   private static final String a;

   public Qj_2() {
      this((Component)null);
   }

   public Qj_2(Component var1) {
      this(var1, null);
   }

   public Qj_2(n6_2 var1) {
      this(null, var1);
   }

   public Qj_2(Component var1, n6_2 var2) {
      super(new com.TK());
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
      com.Qj_2 var10000 = this;
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
      com.FN.p(new Si_2(this, var1));
   }

   public void A(long var1, Component var3) {
      com.FN.u(var1, new com.Cu_2(this, var3));
   }

   protected void W(Component var1) {
      String[] var2 = XW.w();
      com.Qj_2 var10000 = this;
      if (var2 == null) {
         if (this.o == var1) {
            return;
         }

         this.o = var1;
         var10000 = this;
      }

      if (var2 == null) {
         if (!var10000.y()) {
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
         var5 = com.FN.O((Component)var6, var3, var4);
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

            if (com.FN.l((Component)this)) {
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

   protected boolean y() {
      String[] var1 = XW.w();
      com.Qj_2 var10000 = this;
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

      BufferedImage var6 = com.FN.O(var7, var2, var3);
      this.removeAll();
      this.p = new XW(var4, var6);
      this.p.C(this.F);
      this.add(this.p);
      this.revalidate();
      this.repaint();
      this.p.s(new com.OO(this, var1));
      this.p.x();
      if (com.ky_4.F() != null) {
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

      com.Qj_2 var3 = this;
      if (var2 == null) {
         if (this.isFocusOwner()) {
            this.transferFocus();
         }

         this.setFocusable(false);
         var3 = this;
      }

      if (var2 == null) {
         if (var3.p != null) {
            this.p.R();
            this.p = null;
         }

         var3 = this;
      }

      var3.y();
   }

   public boolean n() {
      return this.k;
   }

   public List u() {
      return this.F;
   }

   public n6_2 N() {
      String[] var1 = XW.w();
      List var10000 = this.F;
      if (var1 == null) {
         if (this.F == null) {
            return null;
         }

         var10000 = this.F;
      }

      if (var1 != null) {
         return (n6_2)var10000;
      } else {
         return var10000.size() > 0 ? (n6_2)this.F.get(0) : null;
      }
   }

   public void J(n6_2 var1) {
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
      com.Qj_2 var10000 = this;
      if (var1 == null) {
         if (this.F == null) {
            return;
         }

         var10000 = this;
      }

      var10000.F = null;
   }

   public void Y(n6_2 var1) {
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

   public void N(n6_2 var1) {
      this.F = var1 != null ? com.aL.e(new n6_2[]{var1}) : null;
   }

   public void v(List var1) {
      this.F = var1;
   }

   public void A(n6_2[] var1) {
      ArrayList var3;
      label14: {
         String[] var2 = XW.w();
         n6_2[] var10001 = var1;
         if (var2 == null) {
            if (var1 == null) {
               var3 = null;
               break label14;
            }

            var10001 = var1;
         }

         var3 = com.aL.e(var10001);
      }

      this.F = var3;
   }

   public void R(_7 var1) {
      this.E.add(var1);
   }

   public void n(_7 var1) {
      this.E.remove(var1);
   }

   public void g() {
      String[] var10000 = XW.w();
      Iterator var2 = com.aL.J((Collection)this.E).iterator();
      String[] var1 = var10000;

      while (var2.hasNext()) {
         _7 var3 = (_7)var2.next();
         var3.X();
         if (var1 != null) {
            break;
         }
      }
   }

   public void y$void() {
      String[] var10000 = XW.w();
      Iterator var2 = com.aL.J((Collection)this.E).iterator();
      String[] var1 = var10000;

      while (var2.hasNext()) {
         _7 var3 = (_7)var2.next();
         var3.L();
         if (var1 != null) {
            break;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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





