package com.finalshell.ui.dialog;

import com.finalshell.core.Au2;
import com.finalshell.core.C42;
import com.finalshell.core.CX3_2;
import com.finalshell.core.Cl4_2;
import com.finalshell.core.D;
import com.finalshell.core.E4;
import com.finalshell.core.E_;
import com.finalshell.core.E__2;
import com.finalshell.core.Eh2;
import com.finalshell.core.Fs2_2;
import com.finalshell.core.I22;
import com.finalshell.core.IB;
import com.finalshell.core.Ld4;
import com.finalshell.core.O2_2;
import com.finalshell.core.ON;
import com.finalshell.core.Pj2;
import com.finalshell.core.SN;
import com.finalshell.core.W_3;
import com.finalshell.ui.listener.AJ;
import com.finalshell.ui.panel.K22;
import com.finalshell.ui.panel.M2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;
import java.awt.Dialog.ModalityType;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JDialog;

public class Y2 extends JDialog implements Pj2, Au2, CX3_2, Eh2, W_3 {
   protected boolean a = false;
   protected C42 l;
   public static int[] D;

   public Y2() {
      this.j$void();
   }

   public Y2(Frame var1) {
      super(var1);
      this.j$void();
   }

   public Y2(Frame var1, boolean var2) {
      super(var1, var2);
      this.j$void();
   }

   public Y2(Frame var1, String var2) {
      super(var1, E4.y(var2, new Object[0]));
      E4.a(this, var2, new Object[0]);
      this.j$void();
   }

   public Y2(Frame var1, String var2, boolean var3) {
      super(var1, E4.y(var2, new Object[0]), var3);
      E4.a(this, var2, new Object[0]);
      this.j$void();
   }

   public Y2(Frame var1, String var2, boolean var3, GraphicsConfiguration var4) {
      super(var1, E4.y(var2, new Object[0]), var3, var4);
      E4.a(this, var2, new Object[0]);
      this.j$void();
   }

   public Y2(Dialog var1) {
      super(var1);
      this.j$void();
   }

   public Y2(Dialog var1, boolean var2) {
      super(var1, var2);
      this.j$void();
   }

   public Y2(Dialog var1, String var2) {
      super(var1, E4.y(var2, new Object[0]));
      E4.a(this, var2, new Object[0]);
      this.j$void();
   }

   public Y2(Dialog var1, String var2, boolean var3) {
      super(var1, E4.y(var2, new Object[0]), var3);
      E4.a(this, var2, new Object[0]);
      this.j$void();
   }

   public Y2(Dialog var1, String var2, boolean var3, GraphicsConfiguration var4) {
      super(var1, E4.y(var2, new Object[0]), var3, var4);
      E4.a(this, var2, new Object[0]);
      this.j$void();
   }

   public Y2(Component var1) {
      super(com.finalshell.core.FN.L(var1));
      this.j$void();
   }

   public Y2(Component var1, String var2) {
      super(com.finalshell.core.FN.L(var1), E4.y(var2, new Object[0]));
      E4.a(this, var2, new Object[0]);
      this.j$void();
   }

   public Y2(Window var1) {
      super(var1);
      this.j$void();
   }

   public Y2(Window var1, ModalityType var2) {
      super(var1, var2);
      this.j$void();
   }

   public Y2(Window var1, String var2) {
      super(var1, E4.y(var2, new Object[0]));
      E4.a(this, var2, new Object[0]);
      this.j$void();
   }

   public Y2(Window var1, String var2, ModalityType var3) {
      super(var1, E4.y(var2, new Object[0]), var3);
      E4.a(this, var2, new Object[0]);
      this.j$void();
   }

   public Y2(Window var1, String var2, ModalityType var3, GraphicsConfiguration var4) {
      super(var1, E4.y(var2, new Object[0]), var3, var4);
      E4.a(this, var2, new Object[0]);
      this.j$void();
   }

   protected void j$void() {
      com.finalshell.core.FN.Y(this);
      this.setDefaultCloseOperation(2);
      this.l = new O2_2(this, true);
      ON.b(this, this.l);
   }

   public boolean i$boolean() {
      return this.a;
   }

   public void r$void(boolean var1) {
      this.a = var1;
   }

   public List s() {
      return this.l.t();
   }

   public void q(Component var1) {
      this.l.p(var1);
   }

   public void t(Component var1) {
      this.l.C(var1);
   }

   public Color D$Color() {
      return this.d().q$Color();
   }

   public void X(Color var1) {
      this.d().R(var1);
   }

   public Color N$Color() {
      return this.d().V();
   }

   public void K(Color var1) {
      this.d().k(var1);
   }

   public int G() {
      return this.d().x();
   }

   public void L(int var1) {
      this.d().f(var1);
   }

   public int X$int() {
      return this.d().d$int();
   }

   public void t(int var1) {
      this.d().b(var1);
   }

   public int S() {
      return this.d().u$int();
   }

   public void U$void(int var1) {
      this.d().Q(var1);
   }

   public boolean y() {
      return this.d().C();
   }

   public void y(boolean var1) {
      this.d().H(var1);
   }

   public ImageIcon E() {
      return this.d().l();
   }

   public void L(ImageIcon var1) {
      this.d().g(var1);
   }

   public int j$int() {
      return this.d().R$int();
   }

   public void Y(int var1) {
      this.d().q(var1);
   }

   public String D$String() {
      return this.d().D();
   }

   public void r(String var1) {
      this.d().S(var1);
   }

   public JComponent e$JComponent() {
      return this.d().R$JComponent();
   }

   public void P(JComponent var1) {
      this.d().B(var1);
   }

   public K22 T$k2_2() {
      return this.d().M$k2_2();
   }

   public M2 A$m_2() {
      return this.d().F();
   }

   public boolean l$boolean() {
      return this.d().i$boolean();
   }

   public void j(boolean var1) {
      this.d().m(var1);
   }

   public boolean Q() {
      return this.d().A$boolean();
   }

   public void s(boolean var1) {
      this.d().V(var1);
   }

   public boolean B$boolean() {
      return this.d().y();
   }

   public void T(boolean var1) {
      this.d().r(var1);
   }

   public boolean R() {
      return this.d().k$boolean();
   }

   public void O(boolean var1) {
      this.d().v(var1);
   }

   public boolean K() {
      return this.d().t$boolean();
   }

   public void n(boolean var1) {
      this.d().L(var1);
   }

   public boolean o() {
      return this.d().w();
   }

   public void V(boolean var1) {
      this.d().E(var1);
   }

   public boolean A$boolean() {
      return this.d().v();
   }

   public void k(boolean var1) {
      this.d().f(var1);
   }

   public boolean I$boolean() {
      return this.d().z();
   }

   public void a(boolean var1) {
      this.d().O(var1);
   }

   public boolean T$boolean() {
      return this.d().s$boolean();
   }

   public void L(boolean var1) {
      this.d().C(var1);
   }

   public D d() {
      return (D)super.getRootPane().getUI();
   }

   @Override
   public WindowAdapter H(E_ var1) {
      return Fs2_2.G(this, var1);
   }

   @Override
   public AJ K(E__2 var1) {
      return Fs2_2.c(this, var1);
   }

   @Override
   public void u(String var1, Object[] var2) {
      I22.n(this.getRootPane(), var1, var2);
   }

   @Override
   public void F(Object[] var1) {
      I22.U(this.getRootPane(), var1);
   }

   @Override
   public void N(String var1, Object[] var2) {
      I22.q(this.getRootPane(), var1, var2);
   }

   public void M$void() {
      I22.L(this.getRootPane());
   }

   @Override
   public boolean k() {
      return I22.Z(this.getRootPane());
   }

   @Override
   public void M(Ld4 var1) {
      I22.g(this.getRootPane(), var1);
   }

   public void i$void() {
      I22.o(this.getRootPane());
   }

   @Override
   public void o(String var1) {
      I22.f(this, var1);
   }

   public void I$void() {
      I22.p(this);
   }

   public String q$String() {
      return I22.O(this);
   }

   @Override
   public void p(String var1) {
      Cl4_2.c(this.getRootPane(), var1);
   }

   @Override
   public void a(String var1, Class var2) {
      Cl4_2.x(this.getRootPane(), var1, var2);
   }

   @Override
   public void E(String var1, Object var2) {
      Cl4_2.e(this.getRootPane(), var1, var2);
   }

   @Override
   public void n(String var1, String var2) {
      Cl4_2.B(this.getRootPane(), var1, var2);
   }

   @Override
   public void I(String var1, String var2, Class var3) {
      Cl4_2.t(this.getRootPane(), var1, var2, var3);
   }

   @Override
   public void H(String var1, String var2, Object var3) {
      Cl4_2.a(this.getRootPane(), var1, var2, var3);
   }

   @Override
   public void S(String var1, boolean var2, boolean var3) {
      Cl4_2.l(this.getRootPane(), var1, var2, var3);
   }

   @Override
   public void O(String var1, Class var2, boolean var3, boolean var4) {
      Cl4_2.X(this.getRootPane(), var1, var2, var3, var4);
   }

   @Override
   public void h(String var1, Object var2, boolean var3, boolean var4) {
      Cl4_2.A(this.getRootPane(), var1, var2, var3, var4);
   }

   @Override
   public void e(String var1, String var2, Class var3, boolean var4, boolean var5) {
      Cl4_2.L(this.getRootPane(), var1, var2, var3, var4, var5);
   }

   @Override
   public void D(String var1, String var2, Object var3, boolean var4, boolean var5) {
      Cl4_2.y(this.getRootPane(), var1, var2, var3, var4, var5);
   }

   @Override
   public void z(IB var1) {
      Cl4_2.a(this.getRootPane(), var1);
   }

   @Override
   public void w() {
      Cl4_2.O(this.getRootPane());
   }

   @Override
   public void m() {
      Cl4_2.G(this.getRootPane());
   }

   public void e$void() {
      Cl4_2.H(this.getRootPane());
   }

   public Y2 Z(boolean var1) {
      return (Y2)SN.N(this, var1);
   }

   public boolean N$boolean() {
      return SN.B(this);
   }

   public Y2 v(float var1) {
      return (Y2)SN.s(this, var1);
   }

   public float B$float() {
      return SN.A(this);
   }

   public Y2 l$y_2() {
      return (Y2)SN.v(this);
   }

   public Y2 u(Component var1) {
      return (Y2)SN.u(this, var1);
   }

   public Y2 N(int var1, int var2) {
      return (Y2)SN.H(this, var1, var2);
   }

   public Y2 a(Component var1, int var2, int var3) {
      return (Y2)SN.Q(this, var1, var2, var3);
   }

   public Y2 y(int var1) {
      return (Y2)SN.W(this, var1);
   }

   public Y2 o$y_2(int var1) {
      return (Y2)SN.G(this, var1);
   }

   public Y2 q$y_2() {
      return (Y2)SN.D(this);
   }

   public Y2 r$y_2(boolean var1) {
      return (Y2)SN.g(this, var1);
   }

   @Override
   public Window S(boolean var1) {
      return this.r$y_2(var1);
   }

   public Window X$Window() {
      return this.q$y_2();
   }

   public Window o$Window(int var1) {
      return this.o$y_2(var1);
   }

   public Window U$Window(int var1) {
      return this.y(var1);
   }

   @Override
   public Window A(Component var1, int var2, int var3) {
      return this.a(var1, var2, var3);
   }

   @Override
   public Window q(int var1, int var2) {
      return this.N(var1, var2);
   }

   @Override
   public Window I(Component var1) {
      return this.u(var1);
   }

   @Override
   public Window F() {
      return this.l$y_2();
   }

   @Override
   public Window D(float var1) {
      return this.v(var1);
   }

   @Override
   public Window h(boolean var1) {
      return this.Z(var1);
   }

   static void X(Y2 var0, WindowEvent var1) {
      var0.processWindowEvent(var1);
   }

   public static void s(int[] var0) {
      D = var0;
   }

   public static int[] M$arrint() {
      return D;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (M$arrint() == null) {
         s(new int[3]);
      }
   }
}





