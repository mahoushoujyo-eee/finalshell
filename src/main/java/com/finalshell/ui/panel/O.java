package com.finalshell.ui.panel;

import com.finalshell.core.Ac2;
import com.finalshell.core.Au2;
import com.finalshell.core.Az2;
import com.finalshell.core.D7;
import com.finalshell.core.E4;
import com.finalshell.core.FN;
import com.finalshell.core.Fs2_2;
import com.finalshell.core.I12;
import com.finalshell.core.I22;
import com.finalshell.core.Ld4;
import com.finalshell.core.O5;
import com.finalshell.core.Og4;
import com.finalshell.core.Ox4;
import com.finalshell.core.PY;
import com.finalshell.core.Pp2;
import com.finalshell.core.RF3;
import com.finalshell.core.Sa2;
import com.finalshell.core.Sr2;
import com.finalshell.core.Yb4;
import com.finalshell.ui.model.Cs2;
import com.finalshell.ui.model.HT;
import com.finalshell.ui.model.WF;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class O extends JLabel implements D7, Pp2, RF3, Au2, Yb4, Sa2 {
   public boolean P = false;
   public static int[] R;
   public static long[] ab;
   public static Integer[] bb;

   public O() {
   }

   public O(Insets var1) {
      this.S(var1);
   }

   public O(Icon var1) {
      super(var1);
   }

   public O(Icon var1, Insets var2) {
      super(var1);
      this.S(var2);
   }

   public O(int var1) {
      this.setHorizontalAlignment(var1);
   }

   public O(int var1, Insets var2) {
      this.setHorizontalAlignment(var1);
      this.S(var2);
   }

   public O(Icon var1, int var2) {
      super(var1, var2);
   }

   public O(Icon var1, int var2, Insets var3) {
      super(var1, var2);
      this.S(var3);
   }

   public O(String var1) {
      super(E4.y(var1, new Object[0]));
      E4.a(this, var1, new Object[0]);
   }

   public O(String var1, Insets var2, Object[] var3) {
      super(E4.y(var1, var3));
      E4.a(this, var1, var3);
      this.S(var2);
   }

   public O(String var1, int var2, Object[] var3) {
      super(E4.y(var1, var3), var2);
      E4.a(this, var1, var3);
   }

   public O(String var1, int var2, Insets var3, Object[] var4) {
      super(E4.y(var1, var4), var2);
      E4.a(this, var1, var4);
      this.S(var3);
   }

   public O(String var1, Icon var2) {
      super(E4.y(var1, new Object[0]), var2, a(20961, 4942332477712218965L));
      E4.a(this, var1, new Object[0]);
   }

   public O(String var1, Icon var2, Insets var3, Object[] var4) {
      super(E4.y(var1, var4), var2, a(15683, 4766077141184894966L));
      E4.a(this, var1, var4);
      this.S(var3);
   }

   public O(String var1, Icon var2, int var3, Object[] var4) {
      super(E4.y(var1, var4), var2, var3);
      E4.a(this, var1, var4);
   }

   public O(String var1, Icon var2, int var3, Insets var4, Object[] var5) {
      super(E4.y(var1, var5), var2, var3);
      E4.a(this, var1, var5);
      this.S(var4);
   }

   public Insets N() {
      return this.R$i1_2().C();
   }

   public O S(Insets var1) {
      this.R$i1_2().q(var1);
      return this;
   }

   public O G(int var1, int var2, int var3, int var4) {
      this.S(new Insets(var1, var2, var3, var4));
      return this;
   }

   public O x$O_(int var1) {
      return this.G(var1, var1, var1, var1);
   }

   public Og4 Y$og_4() {
      return Ox4.y(this);
   }

   public O V(Og4 var1) {
      Ox4.b(this, var1);
      return this;
   }

   public boolean f() {
      return this.R$i1_2().f();
   }

   public O D(boolean var1) {
      this.R$i1_2().E(var1);
      return this;
   }

   public Color T() {
      return this.R$i1_2().q();
   }

   public O q(Color var1) {
      this.R$i1_2().h(var1);
      return this;
   }

   public Float x() {
      return this.R$i1_2().I();
   }

   public O c(Float var1) {
      this.R$i1_2().c(var1);
      return this;
   }

   public String A$String() {
      return this.R$i1_2().A();
   }

   public void S$void(String var1) {
      this.R$i1_2().S(var1);
   }

   public I12 R$i1_2() {
      return (I12)this.getUI();
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
      // 00: invokestatic com/finalshell/ui/panel/O.D$arrint ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 33
      // 09: invokevirtual com/finalshell/ui/panel/O.getUI ()Ljavax/swing/plaf/LabelUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/O.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnull 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/O.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/ui/panel/O.getUI ()Ljavax/swing/plaf/LabelUI;
      // 25: instanceof com/finalshell/core/I12
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/ui/panel/O.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.zW Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 52
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/I12
      // 40: invokevirtual com/finalshell/ui/panel/O.setUI (Ljavax/swing/plaf/LabelUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/I12
      // 50: dup
      // 51: invokespecial com/finalshell/core/I12.<init> ()V
      // 54: invokevirtual com/finalshell/ui/panel/O.setUI (Ljavax/swing/plaf/LabelUI;)V
      // 57: aload 1
      // 58: ifnonnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/ui/panel/O.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/ui/panel/O.getUI ()Ljavax/swing/plaf/LabelUI;
      // 67: invokevirtual com/finalshell/ui/panel/O.setUI (Ljavax/swing/plaf/LabelUI;)V
      // 6a: return
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

   @Override
   public Wd2 p(String var1) {
      return Ac2.I(this, var1);
   }

   @Override
   public Wd2 d(Icon var1, String var2) {
      return Ac2.d(this, var1, var2);
   }

   @Override
   public Wd2 V(String var1, WF var2) {
      return Ac2.B(this, var1, var2);
   }

   @Override
   public Wd2 X(Icon var1, String var2, WF var3) {
      return Ac2.g(this, var1, var2, var3);
   }

   @Override
   public Wd2 y(String var1, WF var2, int var3) {
      return Ac2.l(this, var1, var2, var3);
   }

   @Override
   public Wd2 Y(Icon var1, String var2, WF var3, int var4) {
      return Ac2.R(this, var1, var2, var3, var4);
   }

   @Override
   public Wd2 g(JComponent var1) {
      return Ac2.k(this, var1);
   }

   @Override
   public Wd2 I(JComponent var1, int var2) {
      return Ac2.o(this, var1, var2);
   }

   @Override
   public Wd2 j(JComponent var1, WF var2) {
      return Ac2.R(this, var1, var2);
   }

   @Override
   public Wd2 g(JComponent var1, WF var2, int var3) {
      return Ac2.B(this, var1, var2, var3);
   }

   @Override
   public Wd2 s(String var1) {
      return Ac2.Q(this, var1);
   }

   @Override
   public Wd2 u(Icon var1, String var2) {
      return Ac2.o(this, var1, var2);
   }

   @Override
   public Wd2 u(String var1, WF var2) {
      return Ac2.q(this, var1, var2);
   }

   @Override
   public Wd2 h(Icon var1, String var2, WF var3) {
      return Ac2.P(this, var1, var2, var3);
   }

   @Override
   public Wd2 f(String var1, WF var2, int var3) {
      return Ac2.r(this, var1, var2, var3);
   }

   @Override
   public Wd2 o(Icon var1, String var2, WF var3, int var4) {
      return Ac2.V(this, var1, var2, var3, var4);
   }

   @Override
   public Wd2 B(JComponent var1) {
      return Ac2.Q(this, var1);
   }

   @Override
   public Wd2 p(JComponent var1, int var2) {
      return Ac2.S(this, var1, var2);
   }

   @Override
   public Wd2 n(JComponent var1, WF var2) {
      return Ac2.I(this, var1, var2);
   }

   @Override
   public Wd2 X(JComponent var1, WF var2, int var3) {
      return Ac2.U(this, var1, var2, var3);
   }

   @Override
   public void Q(Wd2 var1) {
      Ac2.s(this, var1);
   }

   @Override
   public void O() {
      Ac2.o(this);
   }

   @Override
   public void q(Wd2[] var1) {
      Ac2.Y(this, var1);
   }

   @Override
   public void W(List var1) {
      Ac2.S(this, var1);
   }

   @Override
   public void u(String var1, Object[] var2) {
      I22.n(this, var1, var2);
   }

   @Override
   public void F(Object[] var1) {
      I22.U(this, var1);
   }

   @Override
   public void N(String var1, Object[] var2) {
      I22.q(this, var1, var2);
   }

   public void M$void() {
      I22.L(this);
   }

   @Override
   public boolean k() {
      return I22.Z(this);
   }

   @Override
   public void M(Ld4 var1) {
      I22.g(this, var1);
   }

   public void i$void() {
      I22.o(this);
   }

   public O g() {
      return (O)FN.A(this);
   }

   public O e(boolean var1) {
      return (O)FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return FN.k(this);
   }

   public O A$O_() {
      return (O)FN.u(this);
   }

   public O B(boolean var1) {
      return (O)FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return FN.U(this);
   }

   public O b() {
      return (O)FN.C(this);
   }

   public O u$O_(boolean var1) {
      return (O)FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return FN.G(this);
   }

   public O Q(boolean var1, boolean var2) {
      return (O)FN.K(this, var1, var2);
   }

   public O U(int var1) {
      return (O)FN.p(this, var1);
   }

   public O N(int var1) {
      return (O)FN.O(this, var1);
   }

   public O h(int var1) {
      return (O)FN.K(this, var1);
   }

   public int Y$int() {
      return FN.r$int(this);
   }

   public O B(int var1, boolean var2, boolean var3) {
      return (O)FN.d(this, var1, var2, var3);
   }

   public O E(int var1, int var2) {
      return (O)FN.m(this, var1, var2);
   }

   public O S$O_(String var1) {
      return (O)FN.s(this, var1);
   }

   public String D$String() {
      return FN.b$String(this);
   }

   public int M$int() {
      return PY.f(this);
   }

   public O i$O_(int var1) {
      return (O)PY.Q(this, var1);
   }

   @Override
   public int m() {
      return PY.m(this);
   }

   public O V$O_(int var1) {
      return (O)PY.j(this, var1);
   }

   public int A$int() {
      return PY.S(this);
   }

   public O a(int var1) {
      return (O)PY.N(this, var1);
   }

   public int Q$int() {
      return PY.Z(this);
   }

   public O m(int var1) {
      return (O)PY.w(this, var1);
   }

   public int i$int() {
      return PY.J(this);
   }

   public O r(int var1) {
      return (O)PY.b(this, var1);
   }

   public int a$int() {
      return PY.i(this);
   }

   public O G$O_(int var1) {
      return (O)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public O u(int var1, int var2) {
      return (O)PY.O(this, var1, var2);
   }

   public boolean Y$boolean() {
      return this.P;
   }

   public void d(boolean var1) {
      this.P = var1;
   }

   @Override
   public Component N(String var1) {
      return this.S$O_(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.E(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.B(var1, var2, var3);
   }

   public Component G$Component(int var1) {
      return this.h(var1);
   }

   @Override
   public Component o(int var1) {
      return this.N(var1);
   }

   public Component i$Component(int var1) {
      return this.U(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.Q(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.u$O_(var1);
   }

   public Component Q$Component() {
      return this.b();
   }

   public Component u$Component(boolean var1) {
      return this.B(var1);
   }

   public Component R$Component() {
      return this.A$O_();
   }

   @Override
   public Component c(boolean var1) {
      return this.e(var1);
   }

   public Component a$Component() {
      return this.g();
   }

   @Override
   public Component W(int var1, int var2) {
      return this.u(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.G$O_(var1);
   }

   @Override
   public Component p(int var1) {
      return this.r(var1);
   }

   @Override
   public Component D(int var1) {
      return this.m(var1);
   }

   public Component V$Component(int var1) {
      return this.a(var1);
   }

   public Component x$Component(int var1) {
      return this.V$O_(var1);
   }

   @Override
   public Component O(int var1) {
      return this.i$O_(var1);
   }

   public static void J(int[] var0) {
      R = var0;
   }

   public static int[] D$arrint() {
      return R;
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27317;
      if (bb[var3] == null) {
         bb[var3] = (int)(ab[var3] ^ var1);
      }

      return bb[var3];
   }

   public static void __vfClinit__() {
      long var0 = 5917306803444411442L;
      long[] var6 = new long[2];
      int[] var10000 = new int[5];
      int var3 = 0;
      J(var10000);
      String var4 = "\u0006ª\u0003#Â!;Î\u0092ùÉéQ§×m";
      int var5 = "\u0006ª\u0003#Â!;Î\u0092ùÉéQ§×m".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      ab = var6;
      bb = new Integer[2];
   }
}





