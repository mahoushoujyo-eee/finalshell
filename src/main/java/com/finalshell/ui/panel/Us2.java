package com.finalshell.ui.panel;

import com.finalshell.core.AL_2;
import com.finalshell.core.Ig4;
import com.finalshell.core.NX3;
import com.finalshell.core.O22;
import com.finalshell.core.On2;
import com.finalshell.core.R72;
import com.finalshell.core.RG3;
import com.finalshell.core.RQ3;
import com.finalshell.core.Rp4;
import com.finalshell.core.S5;
import com.finalshell.core.SK;
import com.finalshell.core.Sb2;
import com.finalshell.core.T8_2;
import com.finalshell.core.Th2;
import com.finalshell.core.V5_2;
import com.finalshell.ui.model.CB3;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import javax.swing.tree.TreeCellEditor;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class Us2 extends S implements Ig4 {
   public static Object F;
   public final Object c = new Object();
   public List X = new ArrayList(1);
   public final Object x = new Object();
   public boolean S = true;
   public Comparator M;
   public On2 u;
   public T8_2 Q;

   public Us2() {
      this.N(new RG3());
      this.q(true);
      this.setCellRenderer(new Of2());
      this.setCellEditor(new RQ3());
   }

   public Us2(R72 var1) {
      this.N(var1);
      this.setCellRenderer(new Od2());
      this.setCellEditor(new V5_2());
   }

   public Us2(com.finalshell.core.Zn2 var1) {
      super(var1);
      this.setModel(var1);
      this.setCellRenderer(new Od2());
      this.setCellEditor(new V5_2());
   }

   public boolean w$boolean() {
      return this.S;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void q(boolean var1) {
      Object var10000;
      String[] var2 = CB3.C$arrString();
      var10000 = this.x;
      if (var2 != null) {
         var10000 = this.x != null ? this.x : F;
      }

      Object var3 = var10000;
      synchronized (var10000) {
         this.S = var1;
         var10000 = this;
         if (var2 != null) {
            if (this.H$boolean()) {
               this.D$zn_2().g(var1);
            }

            var10000 = var3;
         }

         // $VF: monitorexit
      }
   }

   public R72 W() {
      return this.D$zn_2().t();
   }

   public void N(R72 var1) {
      if (var1 != null) {
         this.setModel(new com.finalshell.core.Zn2(this, var1));
      }
   }

   public Comparator D$Comparator() {
      return this.M;
   }

   public void T(Comparator var1) {
      String[] var10000;
      var10000 = CB3.C$arrString();
      this.M = var1;
      R72 var3 = this.W();
      String[] var2 = var10000;
      R72 var4 = var3;
      if (var2 != null) {
         if (!(var3 instanceof Rp4)) {
            return;
         }

         var4 = var3;
      }

      ((Rp4)var4).L(var1);
      this.R();
   }

   public void g() {
      this.T(null);
   }

   public On2 a() {
      return this.u;
   }

   public void S(On2 var1) {
      String[] var10000;
      this.u = var1;
      var10000 = CB3.C$arrString();
      R72 var3 = this.W();
      String[] var2 = var10000;
      R72 var4 = var3;
      if (var2 != null) {
         if (!(var3 instanceof Rp4)) {
            return;
         }

         var4 = var3;
      }

      ((Rp4)var4).P(var1);
      this.R();
   }

   public void h() {
      this.S(null);
   }

   public void R() {
      this.D$zn_2().E();
   }

   public void O(CB3 var1) {
      this.D$zn_2().c(var1);
   }

   @Override
   public void setModel(TreeModel var1) {
      boolean var10000;
      label41: {
         String[] var2;
         Object var7;
         label42: {
            var2 = CB3.C$arrString();
            var10000 = this.getModel() instanceof com.finalshell.core.Zn2;
            if (var2 != null) {
               if (var10000) {
                  this.D$zn_2().B(this);
               }

               var7 = var1;
               if (var2 == null) {
                  break label42;
               }

               var10000 = var1 instanceof com.finalshell.core.Zn2;
            }

            if (!var10000) {
               break label41;
            }

            var7 = this.x;
         }

         if (var2 != null) {
            var7 = var7 != null ? this.x : F;
         }

         synchronized (var7) {
            com.finalshell.core.Zn2 var4 = (com.finalshell.core.Zn2)var1;
            var4.g(this.S);
            var4.h(this);
         }
      }

      super.setModel(var1);
   }

   @Override
   public void setCellEditor(TreeCellEditor var1) {
      TreeCellEditor var10000;
      String[] var2 = CB3.C$arrString();
      var10000 = this.cellEditor;
      if (var2 != null) {
         if (this.cellEditor != null) {
            this.cellEditor.removeCellEditorListener(this.Q);
         }

         super.setCellEditor(var1);
         var10000 = var1;
      }

      if (var2 != null) {
         if (var10000 == null) {
            return;
         }

         this.Q = new Th2(this, var1);
         var10000 = var1;
      }

      var10000.addCellEditorListener(this.Q);
   }

   public com.finalshell.core.Zn2 D$zn_2() {
      return (com.finalshell.core.Zn2)this.getModel();
   }

   public boolean H$boolean() {
      String[] var10000;
      var10000 = CB3.C$arrString();
      TreeModel var2 = this.getModel();
      String[] var1 = var10000;
      TreeModel var3 = var2;
      if (var1 != null) {
         if (var2 == null) {
            return false;
         }

         var3 = var2;
      }

      return var1 == null ? var3 instanceof com.finalshell.core.Zn2 : var3 instanceof com.finalshell.core.Zn2;
   }

   public void e(int var1) {
      O22.y(this, var1);
   }

   public void N(CB3 var1, List var2) {
      this.D$zn_2().h(var1, var2);
   }

   public void m(CB3 var1, CB3 var2) {
      this.D$zn_2().Y$void(var1, Arrays.asList(var2));
   }

   public void z(CB3 var1, List var2) {
      this.D$zn_2().Y$void(var1, var2);
   }

   public void r(List var1, CB3 var2, int var3) {
      this.D$zn_2().u(var1, var2, var3);
   }

   public void y(CB3[] var1, CB3 var2, int var3) {
      this.D$zn_2().K(var1, var2, var3);
   }

   public boolean O(String var1) {
      return this.c(this.A(var1));
   }

   public boolean c(CB3 var1) {
      CB3 var10000;
      String[] var2;
      boolean var4;
      label26: {
         label25: {
            var2 = CB3.C$arrString();
            var10000 = var1;
            if (var2 != null) {
               if (var1 == null) {
                  break label25;
               }

               var10000 = var1.C$cB_3();
            }

            if (var10000 != null) {
               var4 = true;
               break label26;
            }
         }

         var4 = false;
      }

      boolean var3 = var4;
      var4 = var3;
      if (var2 != null) {
         if (var3) {
            this.D$zn_2().removeNodeFromParent(var1);
         }

         var4 = var3;
      }

      return var4;
   }

   public void s(List var1) {
      this.D$zn_2().a(var1);
   }

   public void L(CB3[] var1) {
      this.D$zn_2().l(var1);
   }

   public boolean j(CB3 var1) {
      return this.D$zn_2().L(var1);
   }

   public CB3 A(String var1) {
      return this.D$zn_2().c(var1);
   }

   public void a(String var1) {
      this.Q(this.A(var1));
   }

   public void Q(CB3 var1) {
      this.D$zn_2().B(var1);
   }

   public void Z(String var1) {
      this.k(this.A(var1));
   }

   public void k(CB3 var1) {
      this.D$zn_2().L(var1);
   }

   public void i() {
      String[] var1 = CB3.C$arrString();
      Object var10000 = this.x;
      if (var1 != null) {
         var10000 = this.x != null ? this.x : F;
      }

      synchronized (var10000) {
         boolean var3 = this.w$boolean();
         this.q(false);
         this.u();
         this.q(var3);
      }
   }

   public void u() {
      String[] var10000;
      var10000 = CB3.C$arrString();
      TreePath[] var2 = this.getSelectionPaths();
      String[] var1 = var10000;
      TreePath[] var8 = var2;
      if (var1 != null) {
         if (var2 == null) {
            return;
         }

         var8 = var2;
      }

      TreePath[] var3 = var8;
      int var4 = var3.length;
      int var5 = 0;

      while (var5 < var4) {
         TreePath var6 = var3[var5];
         CB3 var7 = (CB3)this.b(var6);
         if (var1 != null) {
            if (var7 != null && !var7.d()) {
               this.r(var7, var6, false);
            }

            var5++;
         }

         if (var1 == null) {
            break;
         }
      }
   }

   public CB3 M(Point var1) {
      return this.P(var1.x, var1.y);
   }

   public CB3 P(int var1, int var2) {
      return this.a(this.getPathForLocation(var1, var2));
   }

   public CB3 h(String var1) {
      return this.w(this.A(var1));
   }

   public CB3 w(CB3 var1) {
      return this.S(var1, false);
   }

   public CB3 S(CB3 var1, boolean var2) {
      String[] var3 = CB3.C$arrString();
      Object var10000 = this.x;
      if (var3 != null) {
         var10000 = this.x != null ? this.x : F;
      }

      synchronized (var10000) {
         boolean var5 = this.w$boolean();
         this.q(false);
         this.B(var1, var2);
         this.q(var5);
         return var1;
      }
   }

   public CB3 T() {
      return this.K((CB3)this.M());
   }

   public CB3 g(String var1) {
      return this.K(this.A(var1));
   }

   public CB3 K(CB3 var1) {
      return this.B(var1, false);
   }

   public CB3 B(CB3 var1, boolean var2) {
      String[] var3 = CB3.C$arrString();
      CB3 var10000 = var1;
      if (var3 != null) {
         if (var1 == null) {
            return null;
         }

         var10000 = var1;
      }

      if (var3 == null) {
         return var10000;
      } else if (!var10000.d()) {
         this.r(var1, this.N(var1), var2);
         return var1;
      } else {
         return null;
      }
   }

   public CB3 r(TreePath var1) {
      return this.M(var1, false);
   }

   public CB3 M(TreePath var1, boolean var2) {
      String[] var3 = CB3.C$arrString();
      Object var10000 = this.x;
      if (var3 != null) {
         var10000 = this.x != null ? this.x : F;
      }

      synchronized (var10000) {
         boolean var5 = this.w$boolean();
         this.q(false);
         CB3 var6 = this.l(var1, var2);
         this.q(var5);
         return var6;
      }
   }

   public CB3 a(TreePath var1) {
      return this.l(var1, false);
   }

   public CB3 l(TreePath var1, boolean var2) {
      String[] var3 = CB3.C$arrString();
      if (var1 != null) {
         CB3 var4 = (CB3)this.b(var1);
         CB3 var10000 = var4;
         if (var3 != null) {
            if (var4 == null) {
               return null;
            }

            var10000 = var4;
         }

         if (var3 == null) {
            return var10000;
         }

         if (!var10000.d()) {
            this.r(var4, var1, var2);
            return var4;
         }
      }

      return null;
   }

   public void r(CB3 var1, TreePath var2, boolean var3) {
      boolean var10000;
      String[] var4;
      label41: {
         Us2 var5;
         TreePath var10001;
         label44: {
            var4 = CB3.C$arrString();
            var10000 = var3;
            label39:
            if (var4 != null) {
               if (var3) {
                  var10000 = this.isPathSelected(var2);
                  if (var4 == null) {
                     break label39;
                  }

                  if (!var10000) {
                     this.setSelectionPath(var2);
                  }
               }

               var5 = this;
               var10001 = var2;
               if (var4 == null) {
                  break label44;
               }

               var10000 = this.isExpanded(var2);
            }

            if (var10000) {
               break label41;
            }

            var5 = this;
            var10001 = var2;
         }

         var5.expandPath(var10001);
      }

      CB3 var6 = var1;
      if (var4 != null) {
         if (var1 == null) {
            return;
         }

         var6 = var1;
      }

      if (!var6.d()) {
         this.D$zn_2().reload(var1);
      }
   }

   public List w$List() {
      synchronized (this.c) {
         return AL_2.J((Collection)this.X);
      }
   }

   public void d(NX3 var1) {
      synchronized (this.c) {
         this.X.add(var1);
      }
   }

   public void C(NX3 var1) {
      synchronized (this.c) {
         this.X.remove(var1);
      }
   }

   @Override
   public void C(CB3 var1) {
      this.P(var1);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void P(CB3 var1) {
      String[] var10000;
      var10000 = CB3.C$arrString();
      Object var4 = this.c;
      synchronized (this.c){} // $VF: monitorenter 
      String[] var2 = var10000;
      boolean var7 = false /* VF: Semaphore variable */;

      ArrayList var3;
      try {
         var7 = true;
         var3 = AL_2.J((Collection)this.X);
         // $VF: monitorexit
         var7 = false;
      } finally {
         if (var7) {
            // $VF: monitorexit
         }
      }

      for (NX3 var5 : var3) {
         var5.o(var1);
         if (var2 == null) {
            break;
         }
      }
   }

   @Override
   public void r(CB3 var1, List var2) {
      this.b(var1, var2);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void b(CB3 var1, List var2) {
      String[] var10000;
      var10000 = CB3.C$arrString();
      Object var5 = this.c;
      synchronized (this.c){} // $VF: monitorenter 
      String[] var3 = var10000;
      boolean var8 = false /* VF: Semaphore variable */;

      ArrayList var4;
      try {
         var8 = true;
         var4 = AL_2.J((Collection)this.X);
         // $VF: monitorexit
         var8 = false;
      } finally {
         if (var8) {
            // $VF: monitorexit
         }
      }

      for (NX3 var6 : var4) {
         var6.y(var1, var2);
         if (var3 == null) {
            break;
         }
      }
   }

   @Override
   public void N(CB3 var1, Throwable var2) {
      this.V(var1, var2);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void V(CB3 var1, Throwable var2) {
      String[] var10000;
      var10000 = CB3.C$arrString();
      Object var5 = this.c;
      synchronized (this.c){} // $VF: monitorenter 
      String[] var3 = var10000;
      boolean var8 = false /* VF: Semaphore variable */;

      ArrayList var4;
      try {
         var8 = true;
         var4 = AL_2.J((Collection)this.X);
         // $VF: monitorexit
         var8 = false;
      } finally {
         if (var8) {
            // $VF: monitorexit
         }
      }

      for (NX3 var6 : var4) {
         var6.X(var1, var2);
         if (var3 == null) {
            break;
         }
      }
   }

   public void F(String var1) {
      this.P(this.A(var1));
   }

   public void Y(List var1) {
      this.L(var1, true, true, null);
   }

   public void S(List var1, S5 var2) {
      this.L(var1, true, true, var2);
   }

   public void W(List var1, boolean var2) {
      this.L(var1, var2, true, null);
   }

   public void w(List var1, boolean var2, S5 var3) {
      this.L(var1, var2, true, var3);
   }

   public void f(List var1, boolean var2, boolean var3) {
      this.L(var1, var2, var3, null);
   }

   public void L(List var1, boolean var2, boolean var3, S5 var4) {
      String[] var10000;
      ArrayList var6 = AL_2.J((Collection)var1);
      var10000 = CB3.C$arrString();
      int var7 = 0;
      String[] var5 = var10000;

      while (true) {
         if (var7 < var6.size()) {
            CB3 var8 = this.A((String)var6.get(var7));
            if (var5 == null) {
               break;
            }

            if (var5 != null) {
               if (var8 != null) {
                  int var9 = 0;

                  while (true) {
                     if (var9 <= var7) {
                        var6.remove(var9);
                        var9++;
                        if (var5 == null) {
                           break;
                        }

                        if (var5 != null) {
                           continue;
                        }
                     }

                     if (var6.size() > 0) {
                        this.k(var8, var6, var2, var3, var4);
                     }
                     break;
                  }

                  return;
               }

               var7++;
            }

            if (var5 != null) {
               continue;
            }
         }

         S5 var10 = var4;
         if (var5 != null) {
            if (var4 == null) {
               break;
            }

            var10 = var4;
         }

         var10.f();
         break;
      }
   }

   public void k(CB3 var1, List var2, boolean var3, boolean var4, S5 var5) {
      Us2 var10000;
      String[] var6 = CB3.C$arrString();
      if (var6 != null) {
         if (var2.size() > 0) {
            if (var1.g$boolean()) {
               var10000 = this;
               Object var10001 = var1;
               if (var6 != null) {
                  this.P(var1);
                  if (var5 != null) {
                     var5.T(var1);
                  }

                  var10000 = this;
                  var10001 = var2.get(0);
               }

               label62: {
                  CB3 var7 = var10000.A((String)var10001);
                  var2.remove(0);
                  if (var6 != null) {
                     if (var7 != null) {
                        this.k(var7, var2, var3, var4, var5);
                        if (var6 != null) {
                           break label62;
                        }
                     }

                     this.r(var1, var3, var4);
                  }

                  S5 var8 = var5;
                  if (var6 != null) {
                     if (var5 == null) {
                        break label62;
                     }

                     var8 = var5;
                  }

                  var8.K(var1);
               }

               if (var6 != null) {
                  return;
               }
            }

            this.d(new Sb2(this, var1, var5, var2, var3, var4));
            this.P(var1);
            if (var6 != null) {
               return;
            }
         }

         this.r(var1, var3, var4);
      }

      S5 var9 = var5;
      if (var6 != null) {
         if (var5 == null) {
            return;
         }

         var9 = var5;
      }

      var9.t(var1);
   }

   public void r(CB3 var1, boolean var2, boolean var3) {
      boolean var10000;
      String[] var4 = CB3.C$arrString();
      var10000 = var3;
      if (var4 != null) {
         if (var3) {
            this.s(var1);
         }

         var10000 = var2;
      }

      if (var10000) {
         this.P(var1);
      }
   }

   @Override
   public final void H$void() {
      Us2 var10000;
      String[] var1 = CB3.C$arrString();
      var10000 = this;
      if (var1 != null) {
         if (this.w$boolean()) {
            int var2 = this.getRowCount() - 1;

            while (var2 >= 0) {
               TreePath var3 = this.getPathForRow(var2);
               if (var1 == null) {
                  return;
               }

               if (var1 != null) {
                  if (!this.getModel().isLeaf(this.b(var3))) {
                     this.z(var3);
                  }

                  var2--;
               }

               if (var1 == null) {
                  break;
               }
            }

            if (var1 != null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.H$void();
   }

   public void z(TreePath var1) {
      Us2 var10000;
      String[] var2 = CB3.C$arrString();
      var10000 = this;
      TreePath var10001 = var1;
      if (var2 != null) {
         if (this.hasBeenExpanded(var1)) {
            this.t(var1);
            if (var2 != null) {
               return;
            }
         }

         var10000 = this;
         var10001 = var1;
      }

      var10000.b(var10001);
   }

   public void t(TreePath var1) {
      String[] var10000;
      var10000 = CB3.C$arrString();
      this.expandPath(var1);
      String[] var2 = var10000;
      CB3 var3 = (CB3)this.b(var1);
      int var4 = 0;

      while (var4 < var3.getChildCount()) {
         this.z(this.N(var3.T(var4)));
         var4++;
         if (var2 == null) {
            break;
         }
      }
   }

   public void b(TreePath var1) {
      this.d(new SK(this, var1));
      this.expandPath(var1);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      F = new Object();
   }
}





