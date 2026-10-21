package com;

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

public class O_ extends JLabel implements com.D7, Pp_2, rF_3, com.au_2, com.yb_4, Sa_2 {
   boolean P = false;
   private static int[] R;
   private static final long[] ab;
   private static final Integer[] bb;

   public O_() {
   }

   public O_(Insets var1) {
      this.S(var1);
   }

   public O_(Icon var1) {
      super(var1);
   }

   public O_(Icon var1, Insets var2) {
      super(var1);
      this.S(var2);
   }

   public O_(int var1) {
      this.setHorizontalAlignment(var1);
   }

   public O_(int var1, Insets var2) {
      this.setHorizontalAlignment(var1);
      this.S(var2);
   }

   public O_(Icon var1, int var2) {
      super(var1, var2);
   }

   public O_(Icon var1, int var2, Insets var3) {
      super(var1, var2);
      this.S(var3);
   }

   public O_(String var1) {
      super(E4.y(var1, new Object[0]));
      E4.a(this, var1, new Object[0]);
   }

   public O_(String var1, Insets var2, Object[] var3) {
      super(E4.y(var1, var3));
      E4.a(this, var1, var3);
      this.S(var2);
   }

   public O_(String var1, int var2, Object[] var3) {
      super(E4.y(var1, var3), var2);
      E4.a(this, var1, var3);
   }

   public O_(String var1, int var2, Insets var3, Object[] var4) {
      super(E4.y(var1, var4), var2);
      E4.a(this, var1, var4);
      this.S(var3);
   }

   public O_(String var1, Icon var2) {
      super(E4.y(var1, new Object[0]), var2, a(20961, 4942332477712218965L));
      E4.a(this, var1, new Object[0]);
   }

   public O_(String var1, Icon var2, Insets var3, Object[] var4) {
      super(E4.y(var1, var4), var2, a(15683, 4766077141184894966L));
      E4.a(this, var1, var4);
      this.S(var3);
   }

   public O_(String var1, Icon var2, int var3, Object[] var4) {
      super(E4.y(var1, var4), var2, var3);
      E4.a(this, var1, var4);
   }

   public O_(String var1, Icon var2, int var3, Insets var4, Object[] var5) {
      super(E4.y(var1, var5), var2, var3);
      E4.a(this, var1, var5);
      this.S(var4);
   }

   public Insets N() {
      return this.R().C();
   }

   public com.O_ S(Insets var1) {
      this.R().q(var1);
      return this;
   }

   public com.O_ G(int var1, int var2, int var3, int var4) {
      this.S(new Insets(var1, var2, var3, var4));
      return this;
   }

   public com.O_ x(int var1) {
      return this.G(var1, var1, var1, var1);
   }

   public com.og_4 Y() {
      return com.ox_4.y(this);
   }

   public com.O_ V(com.og_4 var1) {
      com.ox_4.b(this, var1);
      return this;
   }

   public boolean f() {
      return this.R().f();
   }

   public com.O_ D(boolean var1) {
      this.R().E(var1);
      return this;
   }

   public Color T() {
      return this.R().q();
   }

   public com.O_ q(Color var1) {
      this.R().h(var1);
      return this;
   }

   public Float x() {
      return this.R().I();
   }

   public com.O_ c(Float var1) {
      this.R().c(var1);
      return this;
   }

   @Override
   public String A() {
      return this.R().A();
   }

   @Override
   public void S(String var1) {
      this.R().S(var1);
   }

   public i1_2 R() {
      return (i1_2)this.getUI();
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
      // 00: invokestatic com/O_.D ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 33
      // 09: invokevirtual com/O_.getUI ()Ljavax/swing/plaf/LabelUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/O_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnull 63
      // 1b: goto 22
      // 1e: invokestatic com/O_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/O_.getUI ()Ljavax/swing/plaf/LabelUI;
      // 25: instanceof com/i1_2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/O_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.zW Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 52
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/i1_2
      // 40: invokevirtual com/O_.setUI (Ljavax/swing/plaf/LabelUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/i1_2
      // 50: dup
      // 51: invokespecial com/i1_2.<init> ()V
      // 54: invokevirtual com/O_.setUI (Ljavax/swing/plaf/LabelUI;)V
      // 57: aload 1
      // 58: ifnonnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/O_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/O_.getUI ()Ljavax/swing/plaf/LabelUI;
      // 67: invokevirtual com/O_.setUI (Ljavax/swing/plaf/LabelUI;)V
      // 6a: return
   }

   @Override
   public MouseAdapter o(com.O5 var1) {
      return com.Fs_2.F(this, var1);
   }

   @Override
   public MouseAdapter j(HT var1, com.O5 var2) {
      return com.Fs_2.h(this, var1, var2);
   }

   @Override
   public MouseAdapter e(com.O5 var1) {
      return com.Fs_2.P(this, var1);
   }

   @Override
   public MouseAdapter N(com.O5 var1) {
      return com.Fs_2.H(this, var1);
   }

   @Override
   public MouseAdapter a(com.O5 var1) {
      return com.Fs_2.W(this, var1);
   }

   @Override
   public MouseAdapter L(HT var1, com.O5 var2) {
      return com.Fs_2.W(this, var1, var2);
   }

   @Override
   public MouseAdapter h(com.O5 var1) {
      return com.Fs_2.J(this, var1);
   }

   @Override
   public MouseAdapter d(HT var1, com.O5 var2) {
      return com.Fs_2.O(this, var1, var2);
   }

   @Override
   public MouseAdapter F(com.O5 var1) {
      return com.Fs_2.q(this, var1);
   }

   @Override
   public MouseAdapter v(com.O5 var1) {
      return com.Fs_2.o(this, var1);
   }

   @Override
   public KeyAdapter i(Sr_2 var1) {
      return com.Fs_2.G(this, var1);
   }

   @Override
   public KeyAdapter I(com.Cs_2 var1, Sr_2 var2) {
      return com.Fs_2.O(this, var1, var2);
   }

   @Override
   public KeyAdapter g(Sr_2 var1) {
      return com.Fs_2.Q(this, var1);
   }

   @Override
   public KeyAdapter U(com.Cs_2 var1, Sr_2 var2) {
      return com.Fs_2.R(this, var1, var2);
   }

   @Override
   public KeyAdapter e(Sr_2 var1) {
      return com.Fs_2.u(this, var1);
   }

   @Override
   public KeyAdapter j(com.Cs_2 var1, Sr_2 var2) {
      return com.Fs_2.I(this, var1, var2);
   }

   @Override
   public FocusAdapter u(com.az_2 var1) {
      return com.Fs_2.K(this, var1);
   }

   @Override
   public FocusAdapter e(com.az_2 var1) {
      return com.Fs_2.t(this, var1);
   }

   @Override
   public com.Wd_2 p(String var1) {
      return com.ac_2.I(this, var1);
   }

   @Override
   public com.Wd_2 d(Icon var1, String var2) {
      return com.ac_2.d(this, var1, var2);
   }

   @Override
   public com.Wd_2 V(String var1, com.WF var2) {
      return com.ac_2.B(this, var1, var2);
   }

   @Override
   public com.Wd_2 X(Icon var1, String var2, com.WF var3) {
      return com.ac_2.g(this, var1, var2, var3);
   }

   @Override
   public com.Wd_2 y(String var1, com.WF var2, int var3) {
      return com.ac_2.l(this, var1, var2, var3);
   }

   @Override
   public com.Wd_2 Y(Icon var1, String var2, com.WF var3, int var4) {
      return com.ac_2.R(this, var1, var2, var3, var4);
   }

   @Override
   public com.Wd_2 g(JComponent var1) {
      return com.ac_2.k(this, var1);
   }

   @Override
   public com.Wd_2 I(JComponent var1, int var2) {
      return com.ac_2.o(this, var1, var2);
   }

   @Override
   public com.Wd_2 j(JComponent var1, com.WF var2) {
      return com.ac_2.R(this, var1, var2);
   }

   @Override
   public com.Wd_2 g(JComponent var1, com.WF var2, int var3) {
      return com.ac_2.B(this, var1, var2, var3);
   }

   @Override
   public com.Wd_2 s(String var1) {
      return com.ac_2.Q(this, var1);
   }

   @Override
   public com.Wd_2 u(Icon var1, String var2) {
      return com.ac_2.o(this, var1, var2);
   }

   @Override
   public com.Wd_2 u(String var1, com.WF var2) {
      return com.ac_2.q(this, var1, var2);
   }

   @Override
   public com.Wd_2 h(Icon var1, String var2, com.WF var3) {
      return com.ac_2.P(this, var1, var2, var3);
   }

   @Override
   public com.Wd_2 f(String var1, com.WF var2, int var3) {
      return com.ac_2.r(this, var1, var2, var3);
   }

   @Override
   public com.Wd_2 o(Icon var1, String var2, com.WF var3, int var4) {
      return com.ac_2.V(this, var1, var2, var3, var4);
   }

   @Override
   public com.Wd_2 B(JComponent var1) {
      return com.ac_2.Q(this, var1);
   }

   @Override
   public com.Wd_2 p(JComponent var1, int var2) {
      return com.ac_2.S(this, var1, var2);
   }

   @Override
   public com.Wd_2 n(JComponent var1, com.WF var2) {
      return com.ac_2.I(this, var1, var2);
   }

   @Override
   public com.Wd_2 X(JComponent var1, com.WF var2, int var3) {
      return com.ac_2.U(this, var1, var2, var3);
   }

   @Override
   public void Q(com.Wd_2 var1) {
      com.ac_2.s(this, var1);
   }

   @Override
   public void O() {
      com.ac_2.o(this);
   }

   @Override
   public void q(com.Wd_2[] var1) {
      com.ac_2.Y(this, var1);
   }

   @Override
   public void W(List var1) {
      com.ac_2.S(this, var1);
   }

   @Override
   public void u(String var1, Object[] var2) {
      i2_2.n(this, var1, var2);
   }

   @Override
   public void F(Object[] var1) {
      i2_2.U(this, var1);
   }

   @Override
   public void N(String var1, Object[] var2) {
      i2_2.q(this, var1, var2);
   }

   @Override
   public void M() {
      i2_2.L(this);
   }

   @Override
   public boolean k() {
      return i2_2.Z(this);
   }

   @Override
   public void M(com.ld_4 var1) {
      i2_2.g(this, var1);
   }

   @Override
   public void i() {
      i2_2.o(this);
   }

   public com.O_ g() {
      return (com.O_)com.FN.A(this);
   }

   public com.O_ e(boolean var1) {
      return (com.O_)com.FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return com.FN.k(this);
   }

   public com.O_ A$comO_() {
      return (com.O_)com.FN.u(this);
   }

   public com.O_ B(boolean var1) {
      return (com.O_)com.FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return com.FN.U(this);
   }

   public com.O_ b() {
      return (com.O_)com.FN.C(this);
   }

   public com.O_ u(boolean var1) {
      return (com.O_)com.FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return com.FN.G(this);
   }

   public com.O_ Q(boolean var1, boolean var2) {
      return (com.O_)com.FN.K(this, var1, var2);
   }

   public com.O_ U(int var1) {
      return (com.O_)com.FN.p(this, var1);
   }

   public com.O_ N(int var1) {
      return (com.O_)com.FN.O(this, var1);
   }

   public com.O_ h(int var1) {
      return (com.O_)com.FN.K(this, var1);
   }

   @Override
   public int Y$int() {
      return com.FN.r(this);
   }

   public com.O_ B(int var1, boolean var2, boolean var3) {
      return (com.O_)com.FN.d(this, var1, var2, var3);
   }

   public com.O_ E(int var1, int var2) {
      return (com.O_)com.FN.m(this, var1, var2);
   }

   public com.O_ S$comO_(String var1) {
      return (com.O_)com.FN.s(this, var1);
   }

   @Override
   public String D() {
      return com.FN.b(this);
   }

   @Override
   public int M$int() {
      return PY.f(this);
   }

   public com.O_ i(int var1) {
      return (com.O_)PY.Q(this, var1);
   }

   @Override
   public int m() {
      return PY.m(this);
   }

   public com.O_ V(int var1) {
      return (com.O_)PY.j(this, var1);
   }

   @Override
   public int A$int() {
      return PY.S(this);
   }

   public com.O_ a(int var1) {
      return (com.O_)PY.N(this, var1);
   }

   @Override
   public int Q() {
      return PY.Z(this);
   }

   public com.O_ m(int var1) {
      return (com.O_)PY.w(this, var1);
   }

   @Override
   public int i$int() {
      return PY.J(this);
   }

   public com.O_ r(int var1) {
      return (com.O_)PY.b(this, var1);
   }

   @Override
   public int a() {
      return PY.i(this);
   }

   public com.O_ G(int var1) {
      return (com.O_)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public com.O_ u(int var1, int var2) {
      return (com.O_)PY.O(this, var1, var2);
   }

   public boolean Y$boolean() {
      return this.P;
   }

   public void d(boolean var1) {
      this.P = var1;
   }

   @Override
   public Component N(String var1) {
      return this.S(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.E(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.B(var1, var2, var3);
   }

   @Override
   public Component G$Component(int var1) {
      return this.h(var1);
   }

   @Override
   public Component o(int var1) {
      return this.N(var1);
   }

   @Override
   public Component i$Component(int var1) {
      return this.U(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.Q(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.u(var1);
   }

   @Override
   public Component Q$Component() {
      return this.b();
   }

   @Override
   public Component u$Component(boolean var1) {
      return this.B(var1);
   }

   @Override
   public Component R$Component() {
      return this.A();
   }

   @Override
   public Component c(boolean var1) {
      return this.e(var1);
   }

   @Override
   public Component a$Component() {
      return this.g();
   }

   @Override
   public Component W(int var1, int var2) {
      return this.u(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.G(var1);
   }

   @Override
   public Component p(int var1) {
      return this.r(var1);
   }

   @Override
   public Component D(int var1) {
      return this.m(var1);
   }

   @Override
   public Component V$Component(int var1) {
      return this.a(var1);
   }

   @Override
   public Component x$Component(int var1) {
      return this.V(var1);
   }

   @Override
   public Component O(int var1) {
      return this.i(var1);
   }

   public static void J(int[] var0) {
      R = var0;
   }

   public static int[] D$int() {
      return R;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   static {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27317;
      if (bb[var3] == null) {
         bb[var3] = (int)(ab[var3] ^ var1);
      }

      return bb[var3];
   }
}





