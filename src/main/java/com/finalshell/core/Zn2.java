package com.finalshell.core;

import com.finalshell.task.DY_2;
import com.finalshell.ui.model.CB3;
import com.finalshell.ui.model.Ux2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

public class Zn2 extends L4_2 {
   public final Object E = new Object();
   public final List O = new ArrayList(1);
   public com.finalshell.ui.panel.Us2 q;
   public boolean x = true;
   public R72 c;
   public CB3 B = null;
   public final Object f = new Object();
   public final Map g = new HashMap();
   public final Map i = new HashMap();
   public final Eo4 L = new Eo4();
   public final Object K = new Object();

   public Zn2(com.finalshell.ui.panel.Us2 var1, R72 var2) {
      super(null);
      this.q = var1;
      this.c = var2;
   }

   public boolean z() {
      return this.x;
   }

   public void g(boolean var1) {
      this.x = var1;
   }

   public R72 t() {
      return this.c;
   }

   public CB3 F() {
      String[] var1 = CB3.C$arrString();
      CB3 var10000 = this.B;
      if (var1 != null) {
         if (this.B == null) {
            this.B = this.c.z();
            this.j(this.B);
            this.a(this.B);
         }

         var10000 = this.B;
      }

      return var10000;
   }

   @Override
   public boolean isLeaf(Object var1) {
      return this.c.y((CB3)var1);
   }

   @Override
   public int getChildCount(Object var1) {
      String[] var10000 = CB3.C$arrString();
      CB3 var3 = (CB3)var1;
      String[] var2 = var10000;
      int var4 = (this.isLeaf(var3)) ? 1 : 0;
      if (var2 != null) {
         if (var4 != 0) {
            return 0;
         }

         var4 = (this.L(var3)) ? 1 : 0;
      }

      if (var2 != null) {
         if (var4 != 0) {
            return super.getChildCount(var1);
         }

         var4 = this.s(var3);
      }

      return var4;
   }

   public CB3 f(Object var1, int var2) {
      String[] var10000 = CB3.C$arrString();
      CB3 var4 = (CB3)var1;
      String[] var3 = var10000;
      Zn2 var5 = this;
      Object var10001 = var4;
      if (var3 != null) {
         if (!this.L(var4)) {
            return null;
         }

         var5 = this;
         var10001 = var1;
      }

      return (CB3)var5.getChild(var10001, var2);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean L(CB3 var1) {
      String[] var10000 = CB3.C$arrString();
      Object var3 = this.f;
      synchronized (this.f){} // $VF: monitorenter 
      String[] var2 = var10000;

      try {
         label45: {
            label49: {
               Boolean var4 = (Boolean)this.g.get(var1.H());
               Boolean var8 = var4;
               if (var2 != null) {
                  if (var4 == null) {
      Boolean var9;
      Boolean var9;
                     break label49;
                  }

                  var8 = var4;
               }

               var9 = var8;
               if (var2 == null) {
                  break label45;
               }

               if (var9) {
                  var9 = true;
                  break label45;
               }
            }

            var9 = false;
         }

         // $VF: monitorexit
         return var9;
      } finally {
         // $VF: monitorexit
      }
   }

   @Override
   public void reload(TreeNode var1) {
      this.q.cancelEditing();
      this.I((CB3)var1, false);
      super.reload(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void I(CB3 var1, boolean var2) {
      String[] var10000 = CB3.C$arrString();
      Object var4 = this.f;
      synchronized (this.f){} // $VF: monitorenter 
      String[] var3 = var10000;

      try {
         if (var3 != null) {
            if (var2) {
               this.L.remove(var1.H());
            }

            this.g.remove(var1.H());
         }

         List var5 = (List)this.i.remove(var1.H());
         var10000 = var5;
         if (var3 != null) {
            if (var5 != null) {
               for (CB3 var7 : var5) {
                  this.I(var7, true);
                  if (var3 == null) {
                     return;
                  }

                  if (var3 == null) {
                     break;
                  }
               }
            }

            var10000 = (String[])var4;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void N(List var1, boolean var2) {
      String[] var10000 = CB3.C$arrString();
      Object var4 = this.f;
      synchronized (this.f){} // $VF: monitorenter 
      String[] var3 = var10000;

      try {
         Iterator var5 = var1.iterator();

         while (true) {
            if (var5.hasNext()) {
               CB3 var6 = (CB3)var5.next();
               this.I(var6, var2);
               if (var3 == null) {
                  break;
               }

               if (var3 != null) {
                  continue;
               }
            }

            // $VF: monitorexit
            break;
         }
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void b(CB3[] var1, boolean var2) {
      String[] var10000 = CB3.C$arrString();
      Object var4 = this.f;
      synchronized (this.f){} // $VF: monitorenter 
      String[] var3 = var10000;

      try {
         CB3[] var5 = var1;
         int var6 = var1.length;
         int var7 = 0;

         while (true) {
            if (var7 < var6) {
               CB3 var8 = var5[var7];
               this.I(var8, var2);
               var7++;
               if (var3 == null) {
                  break;
               }

               if (var3 != null) {
                  continue;
               }
            }

            // $VF: monitorexit
            break;
         }
      } finally {
         // $VF: monitorexit
      }
   }

   public void j(CB3 var1) {
      synchronized (this.f) {
         this.L.put(var1.H(), var1);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void g(List var1) {
      String[] var10000 = CB3.C$arrString();
      Object var3 = this.f;
      synchronized (this.f){} // $VF: monitorenter 
      String[] var2 = var10000;

      try {
         Iterator var4 = var1.iterator();

         while (true) {
            if (var4.hasNext()) {
               CB3 var5 = (CB3)var4.next();
               this.L.put(var5.H(), var5);
               if (var2 == null) {
                  break;
               }

               if (var2 != null) {
                  continue;
               }
            }

            // $VF: monitorexit
            break;
         }
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int s(CB3 var1) {
      String[] var10000 = CB3.C$arrString();
      Object var3 = this.K;
      synchronized (this.K){} // $VF: monitorenter 
      String[] var2 = var10000;
      boolean var8 = false /* VF: Semaphore variable */;

      try {
         var8 = true;
         var10000 = var1;
         if (var2 != null) {
            if (var1.d()) {
               // $VF: monitorexit
               return 0;
            }

            var1.Y(Ux2.loading);
            this.nodeChanged(var1);
            var10000 = (String[])var3;
         }

         // $VF: monitorexit
         var8 = false;
      } finally {
         if (var8) {
            // $VF: monitorexit
         }
      }

      this.r(var1);
      int var10 = var1.getChildCount();
      int var14 = var10;
      if (var2 != null) {
         label73:
         if (var10 > 0) {
            int[] var4 = new int[var10];
            Object[] var5 = new Object[var10];
            int var6 = var10 - 1;

            while (var6 >= 0) {
               var4[var6] = var6;
               var5[var6] = var1.T(var6);
               var1.remove(var6);
               var6--;
               if (var2 == null) {
                  break label73;
               }

               if (var2 == null) {
                  break;
               }
            }

            this.nodesWereRemoved(var1, var4, var5);
         }

         var14 = this.x;
      }

      if (var2 != null) {
         if (var14 != 0) {
            O22.P(this.q, new com.finalshell.task.Um2(this, var1));
            return 0;
         }

         this.c.w(var1, new Nm2(this, var1));
         var14 = var1.getChildCount();
      }

      return var14;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void h(CB3 var1, List var2) {
      String[] var10000 = CB3.C$arrString();
      Object var4 = this.K;
      synchronized (this.K){} // $VF: monitorenter 
      String[] var3 = var10000;
      boolean var11 = false /* VF: Semaphore variable */;

      try {
         var11 = true;
         var10000 = var1;
         if (var3 != null) {
            if (var1.d()) {
               // $VF: monitorexit
               return;
            }

            var1.Y(Ux2.loading);
            this.nodeChanged(var1);
            var10000 = (String[])var4;
         }

         // $VF: monitorexit
         var11 = false;
      } finally {
         if (var11) {
            // $VF: monitorexit
         }
      }

      synchronized (this.f) {
         this.i.put(var1.H(), var2);
         this.g(var2);
      }

      var4 = this.Y$List(var1, var2);
      synchronized (this.f) {
         this.g.put(var1.H(), true);
      }

      FN.p(new DY_2(this, (List)var4, var2, var1));
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Y$void(CB3 var1, List var2) {
      String[] var3 = CB3.C$arrString();
      Object var10000 = var1;
      if (var3 != null) {
         if (!var1.g$boolean()) {
            return;
         }

         var10000 = this.f;
      }

      Object var4 = var10000;
      synchronized (var10000) {
         Object var5 = (List)this.i.get(var1.H());
         var10000 = var5;
         if (var3 != null) {
            if (var5 == null) {
               var5 = new ArrayList(var2.size());
               this.i.put(var1.H(), var5);
            }

            var5.addAll(var2);
            this.g(var2);
            var10000 = var4;
         }

         // $VF: monitorexit
      }

      this.N(var2, false);
      this.o(var2, var1, var1.getChildCount());
      this.c(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void removeNodeFromParent(MutableTreeNode var1) {
      String[] var2 = CB3.C$arrString();
      MutableTreeNode var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return;
         }

         var10000 = var1;
      }

      CB3 var3 = (CB3)var10000;
      CB3 var4 = var3.C$cB_3();
      var10000 = var4;
      if (var2 != null) {
         if (var4 == null) {
            return;
         }

         var10000 = var4;
      }

      if (var2 != null) {
         if (!var10000.g$boolean()) {
            return;
         }

         var10000 = (MutableTreeNode)this.f;
      }

      Object var5 = var10000;
      synchronized (var10000) {
         List var6 = (List)this.i.get(var4.H());
         var10000 = var6;
         if (var2 != null) {
            if (var6 != null) {
               var6.remove(var3);
            }

            var10000 = (MutableTreeNode)var5;
         }

         // $VF: monitorexit
      }

      this.I(var3, true);
      super.removeNodeFromParent(var1);
      this.c(var4);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void insertNodeInto(MutableTreeNode var1, MutableTreeNode var2, int var3) {
      String[] var10000 = CB3.C$arrString();
      CB3 var5 = (CB3)var1;
      String[] var4 = var10000;
      CB3 var6 = (CB3)var2;
      var10000 = var6;
      if (var4 != null) {
         if (!var6.g$boolean()) {
            return;
         }

         var10000 = (String[])this.f;
      }

      Object var7 = var10000;
      synchronized (var10000) {
         Object var8 = (List)this.i.get(var6.H());
         var10000 = (String[])var8;
         if (var4 != null) {
            if (var8 == null) {
               var8 = new ArrayList(1);
               this.i.put(var6.H(), var8);
            }

            var8.add(var5);
            var10000 = (String[])var7;
         }

         // $VF: monitorexit
      }

      this.I(var5, false);
      super.insertNodeInto(var1, var2, var3);
      this.a(var5);
      this.c(var6);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void u(List var1, CB3 var2, int var3) {
      String[] var4 = CB3.C$arrString();
      Object var10000 = var2;
      if (var4 != null) {
         if (!var2.g$boolean()) {
            return;
         }

         var10000 = this.f;
      }

      Object var5 = var10000;
      synchronized (var10000) {
         Object var6 = (List)this.i.get(var2.H());
         var10000 = var6;
         if (var4 != null) {
            if (var6 == null) {
               var6 = new ArrayList(1);
               this.i.put(var2.H(), var6);
            }

            var6.addAll(var3, var1);
            var10000 = var5;
         }

         // $VF: monitorexit
      }

      this.N(var1, false);
      this.o(var1, var2, var3);
      this.c(var2);
   }

   public void o(List var1, CB3 var2, int var3) {
      super.F(var1, var2, var3);
      this.Q(var1);
   }

   public void K(CB3[] var1, CB3 var2, int var3) {
      String[] var4 = CB3.C$arrString();
      Object var10000 = var2;
      if (var4 != null) {
         if (!var2.g$boolean()) {
            return;
         }

         var10000 = this.f;
      }

      synchronized (var10000) {
         Object var6 = (List)this.i.get(var2.H());
         if (var6 == null) {
            var6 = new ArrayList(1);
            this.i.put(var2.H(), var6);
         }

         for (int var7 = var1.length - 1; var7 >= 0; var7--) {
            var6.add(var3, var1[var7]);
            if (var4 != null && var4 != null) {
               continue;
            }
            break;
         }
      }

      this.b(var1, false);
      super.d(var1, var2, var3);
      this.W(var1);
      this.c(var2);
   }

   public void E() {
      this.F(this.F(), true);
   }

   public void c(CB3 var1) {
      this.F(var1, false);
   }

   public void F(CB3 var1, boolean var2) {
      String[] var3 = CB3.C$arrString();
      CB3 var10000 = var1;
      if (var3 != null) {
         if (var1 == null) {
            return;
         }

         var10000 = var1;
      }

      var4 = var10000.g$boolean();
      label25:
      if (var3 != null) {
         if (var4) {
            var4 = this.i.containsKey(var1.H());
            if (var3 == null) {
               break label25;
            }

            if (var4) {
               this.v(var1, var2);
               if (var3 != null) {
                  return;
               }
            }
         }

         var4 = var1.d();
      }

      if (var4) {
         this.h(new OP3(this, var1, var2));
      }
   }

   public void v(CB3 var1, boolean var2) {
      com.finalshell.ui.model.P2 var4;
      label17: {
         label16: {
            String[] var10000 = CB3.C$arrString();
            var4 = this.q.B();
            String[] var3 = var10000;
            if (var3 != null) {
               if (!var2) {
                  break label16;
               }

               this.Z(var1);
            }

            if (var3 != null) {
               break label17;
            }
         }

         this.e(var1);
      }

      this.nodeStructureChanged(var1);
      this.q.P(var4);
   }

   public void Z(CB3 var1) {
      String[] var10000 = CB3.C$arrString();
      this.e(var1);
      int var3 = 0;
      String[] var2 = var10000;

      while (var3 < var1.getChildCount()) {
         this.Z(var1.T(var3));
         var3++;
         if (var2 == null) {
            break;
         }
      }
   }

   public void e(CB3 var1) {
      String[] var10000 = CB3.C$arrString();
      List var3 = (List)this.i.get(var1.H());
      String[] var2 = var10000;
      List var7 = var3;
      if (var2 != null) {
         if (var3 == null) {
            return;
         }

         var1.removeAllChildren();
         var7 = this.Y$List(var1, var3);
      }

      for (CB3 var6 : var7) {
         var1.add(var6);
         if (var2 == null) {
            break;
         }
      }
   }

   public List Y$List(CB3 var1, List var2) {
      String[] var3 = CB3.C$arrString();
      Object var10000 = var2;
      if (var3 != null) {
         if (var2 == null) {
            return new ArrayList(0);
         }

         var10000 = var2;
      }

      if (var10000.size() != 0) {
         On2 var4 = this.c.h(var1);
         Comparator var5 = this.c.H(var1);
         if (var4 != null) {
            ArrayList var6 = AL_2.E((Collection)var2, var4);
            if (var5 != null) {
               Collections.sort(var6, var5);
            }

            return var6;
         } else {
            if (var5 != null) {
               var2 = AL_2.J((Collection)var2);
               Collections.sort((List)var2, var5);
            }

            return (List)var2;
         }
      } else {
         return new ArrayList(0);
      }
   }

   public CB3 c(String var1) {
      return (CB3)this.L.get(var1);
   }

   public Eo4 N() {
      return RT3.T(this.L);
   }

   public void Q(List var1) {
      String[] var10000 = CB3.C$arrString();
      Iterator var3 = var1.iterator();
      String[] var2 = var10000;

      while (var3.hasNext()) {
         CB3 var4 = (CB3)var3.next();
         this.a(var4);
         if (var2 == null) {
            break;
         }
      }
   }

   public void W(CB3[] var1) {
      String[] var2 = CB3.C$arrString();

      for (CB3 var6 : var1) {
         this.a(var6);
         if (var2 == null) {
            break;
         }
      }
   }

   public void a(CB3 var1) {
      String[] var10000 = CB3.C$arrString();
      ImageIcon var3 = var1.Y();
      String[] var2 = var10000;
      ImageIcon var4 = var3;
      if (var2 != null) {
         if (var3 == null) {
            return;
         }

         var4 = var3;
      }

      var4.setImageObserver(new Wm2_2(this.q, var1));
   }

   public List L() {
      synchronized (this.E) {
         return AL_2.J((Collection)this.O);
      }
   }

   public void h(Ig4 var1) {
      synchronized (this.E) {
         this.O.add(var1);
      }
   }

   public void B(Ig4 var1) {
      synchronized (this.E) {
         this.O.remove(var1);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void r(CB3 var1) {
      String[] var10000 = CB3.C$arrString();
      Object var4 = this.E;
      synchronized (this.E){} // $VF: monitorenter 
      String[] var2 = var10000;
      boolean var7 = false /* VF: Semaphore variable */;

      ArrayList var3;
      try {
         var7 = true;
         var3 = AL_2.J((Collection)this.O);
         // $VF: monitorexit
         var7 = false;
      } finally {
         if (var7) {
            // $VF: monitorexit
         }
      }

      for (Ig4 var5 : var3) {
         var5.C(var1);
         if (var2 == null) {
            break;
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void s(CB3 var1, List var2) {
      String[] var10000 = CB3.C$arrString();
      Object var5 = this.E;
      synchronized (this.E){} // $VF: monitorenter 
      String[] var3 = var10000;
      boolean var8 = false /* VF: Semaphore variable */;

      ArrayList var4;
      try {
         var8 = true;
         var4 = AL_2.J((Collection)this.O);
         // $VF: monitorexit
         var8 = false;
      } finally {
         if (var8) {
            // $VF: monitorexit
         }
      }

      for (Ig4 var6 : var4) {
         var6.r(var1, var2);
         if (var3 == null) {
            break;
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void r(CB3 var1, Throwable var2) {
      String[] var10000 = CB3.C$arrString();
      Object var5 = this.E;
      synchronized (this.E){} // $VF: monitorenter 
      String[] var3 = var10000;
      boolean var8 = false /* VF: Semaphore variable */;

      ArrayList var4;
      try {
         var8 = true;
         var4 = AL_2.J((Collection)this.O);
         // $VF: monitorexit
         var8 = false;
      } finally {
         if (var8) {
            // $VF: monitorexit
         }
      }

      for (Ig4 var6 : var4) {
         var6.N(var1, var2);
         if (var3 == null) {
            break;
         }
      }
   }

   @Override
   public void d(DefaultMutableTreeNode[] var1, DefaultMutableTreeNode var2, int var3) {
      this.K((CB3[])var1, (CB3)var2, var3);
   }

   @Override
   public void F(List var1, DefaultMutableTreeNode var2, int var3) {
      this.u(var1, (CB3)var2, var3);
   }

   @Override
   public Object getChild(Object var1, int var2) {
      return this.f(var1, var2);
   }

   @Override
   public Object getRoot() {
      return this.F();
   }
}






