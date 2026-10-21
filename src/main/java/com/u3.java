package com;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class u3 extends com.m.s {
   protected Boolean r = com.Bt_2.k;
   protected Integer j = com.Bt_2.N;
   protected Boolean T = com.Bt_2.O;
   protected Boolean E = com.Bt_2.Y;
   protected Boolean Y = com.Bt_2.E;
   protected SV M;
   protected P6 o;
   protected TreeCellRenderer B;
   protected com.Oh_2 u;
   protected com.Oh_2 d;
   protected com.WA G;
   protected List n = new ArrayList(1);

   public u3() {
   }

   public u3(Object[] var1) {
      super(var1);
   }

   public u3(Vector var1) {
      super(var1);
   }

   public u3(Hashtable var1) {
      super(var1);
   }

   public u3(DefaultMutableTreeNode var1) {
      super(var1);
   }

   public u3(DefaultMutableTreeNode var1, boolean var2) {
      super(var1, var2);
   }

   public u3(TreeModel var1) {
      super(var1);
   }

   @Override
   protected void B() {
      this.M = this.p(this);
      this.G = new com.WA(this);
      this.addMouseListener(this.G);
      this.addKeyListener(this.G);
   }

   public P6 d() {
      return this.o;
   }

   public TreeCellRenderer h() {
      return this.B;
   }

   @Override
   public void setCellRenderer(TreeCellRenderer var1) {
      String[] var10000 = com.cB_3.C();
      this.B = var1;
      String[] var2 = var10000;
      u3 var3 = this;
      if (var2 != null) {
         if (this.o == null) {
            this.o = this.h();
            this.o.M(this.U());
         }

         var3 = this;
      }

      var3.setCellRenderer(this.o);
   }

   public void T(P6 var1) {
      this.o = var1;
      this.o.M(this.U());
      super.setCellRenderer(this.o);
   }

   protected com.Q6 h$comQ6() {
      return new com.Q6(this);
   }

   public int U() {
      String[] var1 = com.cB_3.C();
      Integer var10000 = this.j;
      if (var1 != null) {
         if (this.j == null) {
            return com.Bt_2.N;
         }

         var10000 = this.j;
      }

      return var10000;
   }

   public void V(int var1) {
      this.j = var1;
   }

   public Pt_2 j(DefaultMutableTreeNode var1) {
      String[] var2 = com.cB_3.C();
      SV var10000 = this.M;
      if (var2 != null) {
         if (this.M == null) {
            return Pt_2.unchecked;
         }

         var10000 = this.M;
      }

      return var10000.P(var1);
   }

   public boolean z(DefaultMutableTreeNode var1) {
      String[] var2 = com.cB_3.C();
      SV var10000 = this.M;
      if (var2 != null) {
         if (this.M == null) {
            return false;
         }

         var10000 = this.M;
      }

      return var10000.P(var1) == Pt_2.unchecked;
   }

   public boolean O(DefaultMutableTreeNode var1) {
      String[] var2 = com.cB_3.C();
      SV var10000 = this.M;
      if (var2 != null) {
         if (this.M == null) {
            return false;
         }

         var10000 = this.M;
      }

      return var10000.P(var1) == Pt_2.checked;
   }

   public boolean A(DefaultMutableTreeNode var1) {
      String[] var2 = com.cB_3.C();
      SV var10000 = this.M;
      if (var2 != null) {
         if (this.M == null) {
            return false;
         }

         var10000 = this.M;
      }

      return var10000.P(var1) == Pt_2.mixed;
   }

   public List T() {
      return this.x(true);
   }

   public List x(boolean var1) {
      String[] var2 = com.cB_3.C();
      SV var10000 = this.M;
      if (var2 != null) {
         if (this.M == null) {
            return new ArrayList(0);
         }

         var10000 = this.M;
      }

      return var10000.p(var1);
   }

   public List c() {
      String[] var1 = com.cB_3.C();
      SV var10000 = this.M;
      if (var1 != null) {
         if (this.M == null) {
            return new ArrayList(0);
         }

         var10000 = this.M;
      }

      return var10000.O();
   }

   public void R(Collection var1, boolean var2) {
      String[] var3 = com.cB_3.C();
      SV var10000 = this.M;
      if (var3 != null) {
         if (this.M == null) {
            return;
         }

         var10000 = this.M;
      }

      var10000.g(var1, var2);
   }

   public void P(DefaultMutableTreeNode var1, boolean var2) {
      String[] var3 = com.cB_3.C();
      SV var10000 = this.M;
      if (var3 != null) {
         if (this.M == null) {
            return;
         }

         var10000 = this.M;
      }

      var10000.s(var1, var2);
   }

   public void E(DefaultMutableTreeNode var1) {
      String[] var2 = com.cB_3.C();
      SV var10000 = this.M;
      if (var2 != null) {
         if (this.M == null) {
            return;
         }

         var10000 = this.M;
      }

      var10000.j(var1);
   }

   public void i(List var1) {
      String[] var2 = com.cB_3.C();
      SV var10000 = this.M;
      if (var2 != null) {
         if (this.M == null) {
            return;
         }

         var10000 = this.M;
      }

      var10000.I(var1);
   }

   public void x() {
      String[] var1 = com.cB_3.C();
      SV var10000 = this.M;
      if (var1 != null) {
         if (this.M == null) {
            return;
         }

         var10000 = this.M;
      }

      var10000.c();
   }

   public void n() {
      String[] var1 = com.cB_3.C();
      SV var10000 = this.M;
      if (var1 != null) {
         if (this.M == null) {
            return;
         }

         var10000 = this.M;
      }

      var10000.h();
   }

   public SV I() {
      return this.M;
   }

   public void I(SV var1) {
      String[] var10000 = com.cB_3.C();
      Iterator var3 = this.n.iterator();
      String[] var2 = var10000;

      while (true) {
         if (var3.hasNext()) {
            Nb_2 var4 = (Nb_2)var3.next();
            this.M.e(var4);
            if (var2 == null) {
               break;
            }

            if (var2 != null) {
               continue;
            }
         }

         this.M = var1;
         this.M();
         break;
      }

      for (Nb_2 var6 : this.n) {
         var1.J(var6);
         if (var2 == null) {
            break;
         }
      }
   }

   protected SV p(u3 var1) {
      return new com.D5(var1);
   }

   public boolean N(DefaultMutableTreeNode var1) {
      String[] var2 = com.cB_3.C();
      com.Oh_2 var10000 = this.u;
      if (var2 != null) {
         if (this.u == null) {
            return true;
         }

         var10000 = this.u;
      }

      boolean var3 = var10000.q(var1);
      return var2 == null ? var3 : var3;
   }

   public void I(com.Oh_2 var1) {
      this.u = var1;
   }

   public boolean R(DefaultMutableTreeNode var1) {
      String[] var2 = com.cB_3.C();
      com.Oh_2 var10000 = this.d;
      if (var2 != null) {
         if (this.d == null) {
            return true;
         }

         var10000 = this.d;
      }

      boolean var3 = var10000.q(var1);
      return var2 == null ? var3 : var3;
   }

   public void c(com.Oh_2 var1) {
      this.d = var1;
   }

   public boolean e() {
      String[] var1 = com.cB_3.C();
      Boolean var10000 = this.r;
      if (var1 != null) {
         if (this.r == null) {
            return true;
         }

         var10000 = this.r;
      }

      return var10000;
   }

   public void J(boolean var1) {
      String[] var2 = com.cB_3.C();
      boolean var10000 = this.r;
      if (var2 != null) {
         var10000 = var10000 != var1;
      }

      boolean var3 = var10000;
      u3 var4 = this;
      if (var2 != null) {
         this.r = var1;
         if (!var3) {
            return;
         }

         var4 = this;
      }

      SV var5 = var4.M;
      if (var2 != null) {
         if (var4.M == null) {
            return;
         }

         var5 = this.M;
      }

      var5.y(this.r);
   }

   public boolean A() {
      String[] var1 = com.cB_3.C();
      Boolean var10000 = this.T;
      if (var1 != null) {
         if (this.T == null) {
            return com.Bt_2.O;
         }

         var10000 = this.T;
      }

      return var10000;
   }

   public void I(boolean var1) {
      this.T = var1;
      this.M();
   }

   public boolean v() {
      String[] var1 = com.cB_3.C();
      Boolean var10000 = this.E;
      if (var1 != null) {
         if (this.E == null) {
            return com.Bt_2.Y;
         }

         var10000 = this.E;
      }

      return var10000;
   }

   public void C(boolean var1) {
      this.E = var1;
      this.repaint();
   }

   public boolean X() {
      String[] var1 = com.cB_3.C();
      Boolean var10000 = this.Y;
      if (var1 != null) {
         if (this.Y == null) {
            return com.Bt_2.E;
         }

         var10000 = this.Y;
      }

      return var10000;
   }

   public void m(boolean var1) {
      this.Y = var1;
   }

   public Rectangle O$Rectangle(DefaultMutableTreeNode var1) {
      return this.C(this.N(var1));
   }

   public Rectangle C(TreePath var1) {
      String[] var2 = com.cB_3.C();
      P6 var10000 = this.o;
      if (var2 != null) {
         if (this.o == null) {
            return null;
         }

         var10000 = this.o;
      }

      int var3 = var10000.N();
      Rectangle var4 = this.getPathBounds(var1);
      if (var2 != null) {
         if (this.getComponentOrientation().isLeftToRight()) {
            var4.width = var3;
            if (var2 != null) {
               return var4;
            }
         }

         var4.x = var4.x + (var4.width - var3);
      }

      var4.width = var3;
      return var4;
   }

   public boolean b() {
      String[] var1 = com.cB_3.C();
      boolean var10000 = this.isEnabled();
      if (var1 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = this.A();
      }

      if (var1 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = this.v();
      }

      return var1 == null ? var10000 : var10000;
   }

   public void e(Nb_2 var1) {
      String[] var10000 = com.cB_3.C();
      this.n.add(var1);
      String[] var2 = var10000;
      SV var3 = this.M;
      if (var2 != null) {
         if (this.M == null) {
            return;
         }

         var3 = this.M;
      }

      var3.J(var1);
   }

   public void x(Nb_2 var1) {
      String[] var10000 = com.cB_3.C();
      this.n.remove(var1);
      String[] var2 = var10000;
      SV var3 = this.M;
      if (var2 != null) {
         if (this.M == null) {
            return;
         }

         var3 = this.M;
      }

      var3.e(var1);
   }

   public void s(List var1) {
      String[] var10000 = com.cB_3.C();
      Iterator var3 = com.aL.J((Collection)this.n).iterator();
      String[] var2 = var10000;

      while (var3.hasNext()) {
         Nb_2 var4 = (Nb_2)var3.next();
         var4.f(var1);
         if (var2 == null) {
            break;
         }
      }
   }
}





