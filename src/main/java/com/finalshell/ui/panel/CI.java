package com.finalshell.ui.panel;

import com.finalshell.core.AL_2;
import com.finalshell.core.Az2;
import com.finalshell.core.ED3;
import com.finalshell.core.FN;
import com.finalshell.core.Fs2_2;
import com.finalshell.core.K3_2;
import com.finalshell.core.Kd2;
import com.finalshell.core.O5;
import com.finalshell.core.Os4;
import com.finalshell.core.PY;
import com.finalshell.core.Pp2;
import com.finalshell.core.Rq2;
import com.finalshell.core.Sa2;
import com.finalshell.core.Sr2;
import com.finalshell.core.W32;
import com.finalshell.core.Yb4;
import com.finalshell.core.Yc2_2;
import com.finalshell.ui.listener.CI_3;
import com.finalshell.ui.model.Cs2;
import com.finalshell.ui.model.HT;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListDataListener;

public class CI extends JList implements Pp2, Yb4, Sa2 {
   public List U = new ArrayList(1);
   public boolean k = false;
   public K3_2 D = null;
   public Rq2 t = null;
   public int x = -1;
   public boolean X = true;
   public static String[] B;

   public CI() {
   }

   public CI(List var1) {
      super(var1.toArray());
   }

   public CI(Vector var1) {
      super(var1);
   }

   public CI(Object[] var1) {
      super(var1);
   }

   public CI(ListModel var1) {
      super(var1);
   }

   public void A(boolean var1) {
      String[] var2 = c();
      int var10001 = (var1) ? 1 : 0;
      if (var2 == null) {
         var10001 = var1 != 0 ? 2 : 0;
      }

      this.setSelectionMode(var10001);
   }

   public Oq2 f$Oq_2() {
      String[] var10000 = c();
      ListCellRenderer var2 = this.getCellRenderer();
      String[] var1 = var10000;
      ListCellRenderer var3 = var2;
      if (var1 == null) {
         if (!(var2 instanceof Oq2)) {
            return null;
         }

         var3 = var2;
      }

      return (Oq2)var3;
   }

   public ED3 A$eD_3() {
      String[] var10000 = c();
      ListModel var2 = this.getModel();
      String[] var1 = var10000;
      ListModel var3 = var2;
      if (var1 == null) {
         if (!(var2 instanceof ED3)) {
            return null;
         }

         var3 = var2;
      }

      return (ED3)var3;
   }

   public void s(Object var1) {
      this.setSelectedValue(var1, true);
   }

   public void N(Object[] var1) {
      this.I(AL_2.o(var1));
   }

   public void x(Collection var1) {
      this.I(new ArrayList(var1));
   }

   public void I(List var1) {
      String[] var10000 = c();
      ArrayList var3 = new ArrayList();
      String[] var2 = var10000;
      ListModel var4 = this.getModel();
      int var5 = 0;

      while (true) {
         if (var5 < var4.getSize()) {
            if (var2 != null) {
               break;
            }

            if (var2 == null && var1.contains(var4.getElementAt(var5))) {
               var3.add(var5);
            }

            var5++;
            if (var2 == null) {
               continue;
            }
         }

         this.setSelectedIndices(AL_2.J((List)var3));
         break;
      }
   }

   public boolean z() {
      return this.k;
   }

   public void M(boolean var1) {
      String[] var2 = c();
      CI var10000 = this;
      if (var2 == null) {
         this.k = var1;
         if (!var1) {
            return;
         }

         var10000 = this;
      }

      if (var2 == null) {
         if (var10000.D != null) {
            return;
         }

         var10000 = this;
      }

      var10000.J(this.O());
   }

   public boolean f$boolean() {
      return CI_3.V(this);
   }

   public void d(boolean var1) {
      CI var4;
      label33: {
         String[] var2 = c();
         boolean var10000 = var1;
         if (var2 == null) {
            if (var1) {
               var4 = this;
               if (var2 == null) {
                  if (this.f$boolean()) {
                     return;
                  }

                  this.L(false);
                  var4 = this;
               }

               CI_3.w(var4);
               if (var2 == null) {
                  return;
               }
            }

            var4 = this;
            if (var2 != null) {
               break label33;
            }

            var10000 = this.f$boolean();
         }

         if (!var10000) {
            return;
         }

         var4 = this;
      }

      CI_3.z(var4);
   }

   public void J(K3_2 var1) {
      this.L$void();
      this.D = var1;
      var1.V(this);
   }

   public K3_2 O() {
      return new W32();
   }

   public K3_2 S() {
      return this.D;
   }

   public void L$void() {
      String[] var1 = c();
      K3_2 var10000 = this.D;
      if (var1 == null) {
         if (this.D == null) {
            return;
         }

         var10000 = this.D;
      }

      var10000.S(this);
      this.D = null;
   }

   public void R$void() {
      this.z$void(this.getSelectedIndex());
   }

   public void z$void(int var1) {
      String[] var10000 = c();
      K3_2 var3 = this.S();
      String[] var2 = var10000;
      if (var1 != -1) {
         K3_2 var4 = var3;
         if (var2 == null) {
            if (var3 == null) {
               return;
            }

            this.setSelectedIndex(var1);
            var4 = var3;
         }

         var4.N(this, var1);
      }
   }

   public boolean X() {
      String[] var10000 = c();
      K3_2 var2 = this.S();
      String[] var1 = var10000;
      K3_2 var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return false;
         }

         var3 = var2;
      }

      boolean var4 = var3.D();
      if (var1 == null) {
         if (!var4) {
            return false;
         }

         var4 = var2.C(this);
      }

      return var1 != null ? var4 : var4;
   }

   public boolean k() {
      String[] var10000 = c();
      K3_2 var2 = this.S();
      String[] var1 = var10000;
      K3_2 var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return false;
         }

         var3 = var2;
      }

      boolean var4 = var3.D();
      return var1 != null ? var4 : var4;
   }

   public Rq2 m$Rq_2() {
      return this.t;
   }

   public void G(Rq2 var1) {
      this.t = var1;
   }

   public boolean b() {
      return this.X;
   }

   public void Y(boolean var1) {
      this.X = var1;
      int var2 = this.getLeadSelectionIndex();
      int[] var3 = this.getSelectedIndices();
      this.setSelectionModel((ListSelectionModel)(var1 ? new DefaultListSelectionModel() : new Kd2()));
      this.setSelectedIndices(var3);
      this.getSelectionModel().setLeadSelectionIndex(var2);
   }

   public int J$int() {
      return this.getModel().getSize();
   }

   public Object D$Object(int var1) {
      return this.getModel().getElementAt(var1);
   }

   public void R(ListDataListener var1) {
      this.getModel().addListDataListener(var1);
   }

   public void g(ListDataListener var1) {
      this.getModel().removeListDataListener(var1);
   }

   public void k(int var1) {
      if (var1 != -1) {
         Rectangle var2 = this.getCellBounds(var1, var1);
         if (var2 != null) {
            this.scrollRectToVisible(var2);
         }
      }
   }

   public boolean e() {
      return this.B().e();
   }

   public void e(boolean var1) {
      this.B().C(var1);
   }

   public boolean q() {
      return this.B().u();
   }

   public void L(boolean var1) {
      this.B().q(var1);
   }

   public int R$int() {
      return this.B().j();
   }

   public void L(int var1) {
      this.B().l(var1);
   }

   public int D$int() {
      return this.B().y();
   }

   public void a(int var1) {
      this.B().o(var1);
   }

   public boolean L$boolean() {
      return this.B().L();
   }

   public void Z(boolean var1) {
      this.B().l(var1);
   }

   public Color s() {
      return this.B().f();
   }

   public void B(Color var1) {
      this.B().h(var1);
   }

   public Color A$Color() {
      return this.B().w();
   }

   public void j(Color var1) {
      this.B().E(var1);
   }

   public boolean J$boolean() {
      return this.B().M();
   }

   public void s(boolean var1) {
      this.B().t(var1);
   }

   public Yc2_2 B() {
      return (Yc2_2)this.getUI();
   }

   @Override
   public void updateUI() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/CI.c ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 33
      // 09: invokevirtual com/finalshell/ui/panel/CI.getUI ()Ljavax/swing/plaf/ListUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/CI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/CI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/ui/panel/CI.getUI ()Ljavax/swing/plaf/ListUI;
      // 25: instanceof com/finalshell/core/Yc2_2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/ui/panel/CI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.v Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 322
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/Yc2_2
      // 40: invokevirtual com/finalshell/ui/panel/CI.setUI (Ljavax/swing/plaf/ListUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/Yc2_2
      // 50: dup
      // 51: invokespecial com/finalshell/core/Yc2_2.<init> ()V
      // 54: invokevirtual com/finalshell/ui/panel/CI.setUI (Ljavax/swing/plaf/ListUI;)V
      // 57: aload 1
      // 58: ifnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/ui/panel/CI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/ui/panel/CI.getUI ()Ljavax/swing/plaf/ListUI;
      // 67: invokevirtual com/finalshell/ui/panel/CI.setUI (Ljavax/swing/plaf/ListUI;)V
      // 6a: return
   }

   public void O(Object var1) {
      String[] var10000 = c();
      ListModel var3 = this.getModel();
      String[] var2 = var10000;
      byte var5 = (var3 instanceof ED3) ? 1 : 0;
      if (var2 == null) {
         if (var5 != 0) {
            this.T(((ED3)var3).J(var1));
            if (var2 == null) {
               return;
            }
         }

         var5 = 0;
      }

      int var4 = var5;

      while (var4 < var3.getSize()) {
         if (var3.getElementAt(var4) == var1) {
            this.T(var4);
            if (var2 == null) {
               break;
            }
         }

         var4++;
         if (var2 != null) {
            break;
         }
      }
   }

   public void T(int var1) {
      this.s(var1, var1);
   }

   public void s(int var1, int var2) {
      Rectangle var3 = this.getCellBounds(var1, var2);
      if (var3 != null) {
         this.repaint(var3);
      }
   }

   public int K$int() {
      return this.x;
   }

   public void c(Os4 var1) {
      this.U.add(var1);
   }

   public void r(Os4 var1) {
      this.U.remove(var1);
   }

   public void D$void(int var1) {
      this.x = var1;
      String[] var10000 = c();
      Iterator var3 = AL_2.J((Collection)this.U).iterator();
      String[] var2 = var10000;

      while (var3.hasNext()) {
         Os4 var4 = (Os4)var3.next();
         var4.r(var1);
         if (var2 != null) {
            break;
         }
      }
   }

   public void h(int var1, Object var2, Object var3) {
      String[] var10000 = c();
      this.x = -1;
      Iterator var5 = AL_2.J((Collection)this.U).iterator();
      String[] var4 = var10000;

      while (var5.hasNext()) {
         Os4 var6 = (Os4)var5.next();
         var6.u(var1, var2, var3);
         if (var4 != null) {
            break;
         }
      }
   }

   public void M(int var1) {
      String[] var10000 = c();
      this.x = -1;
      String[] var2 = var10000;

      for (Os4 var4 : AL_2.J((Collection)this.U)) {
         var4.V(var1);
         if (var2 != null) {
            break;
         }
      }
   }

   @Override
   public MouseAdapter o(O5 var1) {
      return Fs2_2.F(this, var1);
   }

   @Override
   public MouseAdapter j(HT var1, O5 var2) {
      return Fs2_2.h(this, var1, var2);
   }

   @Override
   public MouseAdapter e(O5 var1) {
      return Fs2_2.P(this, var1);
   }

   @Override
   public MouseAdapter N(O5 var1) {
      return Fs2_2.H(this, var1);
   }

   @Override
   public MouseAdapter a(O5 var1) {
      return Fs2_2.W(this, var1);
   }

   @Override
   public MouseAdapter L(HT var1, O5 var2) {
      return Fs2_2.W(this, var1, var2);
   }

   @Override
   public MouseAdapter h(O5 var1) {
      return Fs2_2.J(this, var1);
   }

   @Override
   public MouseAdapter d(HT var1, O5 var2) {
      return Fs2_2.O(this, var1, var2);
   }

   @Override
   public MouseAdapter F(O5 var1) {
      return Fs2_2.q(this, var1);
   }

   @Override
   public MouseAdapter v(O5 var1) {
      return Fs2_2.o(this, var1);
   }

   @Override
   public KeyAdapter i(Sr2 var1) {
      return Fs2_2.G(this, var1);
   }

   @Override
   public KeyAdapter I(Cs2 var1, Sr2 var2) {
      return Fs2_2.O(this, var1, var2);
   }

   @Override
   public KeyAdapter g(Sr2 var1) {
      return Fs2_2.Q(this, var1);
   }

   @Override
   public KeyAdapter U(Cs2 var1, Sr2 var2) {
      return Fs2_2.R(this, var1, var2);
   }

   @Override
   public KeyAdapter e(Sr2 var1) {
      return Fs2_2.u(this, var1);
   }

   @Override
   public KeyAdapter j(Cs2 var1, Sr2 var2) {
      return Fs2_2.I(this, var1, var2);
   }

   @Override
   public FocusAdapter u(Az2 var1) {
      return Fs2_2.K(this, var1);
   }

   @Override
   public FocusAdapter e(Az2 var1) {
      return Fs2_2.t(this, var1);
   }

   public CI G() {
      return (CI)FN.A(this);
   }

   public CI Q(boolean var1) {
      return (CI)FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return FN.k(this);
   }

   public CI w() {
      return (CI)FN.u(this);
   }

   public CI q(boolean var1) {
      return (CI)FN.D(this, var1);
   }

   public boolean K$boolean() {
      return FN.U(this);
   }

   public CI A$CI() {
      return (CI)FN.C(this);
   }

   public CI R(boolean var1) {
      return (CI)FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return FN.G(this);
   }

   public CI y(boolean var1, boolean var2) {
      return (CI)FN.K(this, var1, var2);
   }

   public CI j(int var1) {
      return (CI)FN.p(this, var1);
   }

   public CI z$CI(int var1) {
      return (CI)FN.O(this, var1);
   }

   public CI h(int var1) {
      return (CI)FN.K(this, var1);
   }

   @Override
   public int Y() {
      return FN.r$int(this);
   }

   public CI J(int var1, boolean var2, boolean var3) {
      return (CI)FN.d(this, var1, var2, var3);
   }

   public CI v(int var1, int var2) {
      return (CI)FN.m(this, var1, var2);
   }

   public CI z(String var1) {
      return (CI)FN.s(this, var1);
   }

   public String D$String() {
      return FN.b$String(this);
   }

   @Override
   public int M() {
      return PY.f(this);
   }

   public CI s(int var1) {
      return (CI)PY.Q(this, var1);
   }

   public int m$int() {
      return PY.m(this);
   }

   public CI D$CI(int var1) {
      return (CI)PY.j(this, var1);
   }

   public int A$int() {
      return PY.S(this);
   }

   public CI f(int var1) {
      return (CI)PY.N(this, var1);
   }

   public int Q$int() {
      return PY.Z(this);
   }

   public CI t(int var1) {
      return (CI)PY.w(this, var1);
   }

   @Override
   public int i() {
      return PY.J(this);
   }

   public CI G$CI(int var1) {
      return (CI)PY.b(this, var1);
   }

   public int a$int() {
      return PY.i(this);
   }

   public CI o$CI(int var1) {
      return (CI)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public CI X(int var1, int var2) {
      return (CI)PY.O(this, var1, var2);
   }

   @Override
   public Component N(String var1) {
      return this.z(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.v(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.J(var1, var2, var3);
   }

   public Component G$Component(int var1) {
      return this.h(var1);
   }

   public Component o$Component(int var1) {
      return this.z$CI(var1);
   }

   @Override
   public Component i(int var1) {
      return this.j(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.y(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.R(var1);
   }

   public Component Q$Component() {
      return this.A$CI();
   }

   @Override
   public Component u(boolean var1) {
      return this.q(var1);
   }

   public Component R$Component() {
      return this.w();
   }

   @Override
   public Component c(boolean var1) {
      return this.Q(var1);
   }

   public Component a$Component() {
      return this.G();
   }

   @Override
   public Component W(int var1, int var2) {
      return this.X(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.o$CI(var1);
   }

   @Override
   public Component p(int var1) {
      return this.G$CI(var1);
   }

   public Component D$Component(int var1) {
      return this.t(var1);
   }

   @Override
   public Component V(int var1) {
      return this.f(var1);
   }

   @Override
   public Component x(int var1) {
      return this.D$CI(var1);
   }

   @Override
   public Component O(int var1) {
      return this.s(var1);
   }

   public static void p(String[] var0) {
      B = var0;
   }

   public static String[] c() {
      return B;
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (c() != null) {
         p(new String[4]);
      }
   }
}





