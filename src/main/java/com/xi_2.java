package com;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Xi_2 extends JLabel implements Pp_2, rF_3, com.au_2, com.yb_4 {
   private static final String a;
   private static final long b;

   public Xi_2() {
   }

   public Xi_2(Icon var1) {
      super(var1);
   }

   public Xi_2(Icon var1, int var2) {
      super(var1, var2);
   }

   public Xi_2(String var1) {
      super(var1);
   }

   public Xi_2(String var1, int var2) {
      super(var1, var2);
   }

   public Xi_2(String var1, Icon var2) {
      super(var1, var2, (int)b);
   }

   public Xi_2(String var1, Icon var2, int var3) {
      super(var1, var2, var3);
   }

   public boolean c() {
      return this.d().Z();
   }

   public void p(boolean var1) {
      this.d().B(var1);
   }

   public Color D() {
      return this.d().F();
   }

   public void x(Color var1) {
      this.d().l(var1);
   }

   public wv_4 d() {
      return (wv_4)this.getUI();
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
      // 00: invokestatic com/Oj_2.V ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 33
      // 09: invokevirtual com/Xi_2.getUI ()Ljavax/swing/plaf/LabelUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/Xi_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 63
      // 1b: goto 22
      // 1e: invokestatic com/Xi_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/Xi_2.getUI ()Ljavax/swing/plaf/LabelUI;
      // 25: instanceof com/wv_4
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/Xi_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.a Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 86
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/wv_4
      // 40: invokevirtual com/Xi_2.setUI (Ljavax/swing/plaf/LabelUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/wv_4
      // 50: dup
      // 51: invokespecial com/wv_4.<init> ()V
      // 54: invokevirtual com/Xi_2.setUI (Ljavax/swing/plaf/LabelUI;)V
      // 57: iload 1
      // 58: ifeq 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/Xi_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/Xi_2.getUI ()Ljavax/swing/plaf/LabelUI;
      // 67: invokevirtual com/Xi_2.setUI (Ljavax/swing/plaf/LabelUI;)V
      // 6a: return
   }

   @Override
   public String getUIClassID() {
      return a;
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

   public Xi_2 w() {
      return (Xi_2)com.FN.A(this);
   }

   public Xi_2 D(boolean var1) {
      return (Xi_2)com.FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return com.FN.k(this);
   }

   public Xi_2 J() {
      return (Xi_2)com.FN.u(this);
   }

   public Xi_2 F(boolean var1) {
      return (Xi_2)com.FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return com.FN.U(this);
   }

   public Xi_2 j() {
      return (Xi_2)com.FN.C(this);
   }

   public Xi_2 y(boolean var1) {
      return (Xi_2)com.FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return com.FN.G(this);
   }

   public Xi_2 h(boolean var1, boolean var2) {
      return (Xi_2)com.FN.K(this, var1, var2);
   }

   public Xi_2 w(int var1) {
      return (Xi_2)com.FN.p(this, var1);
   }

   public Xi_2 i(int var1) {
      return (Xi_2)com.FN.O(this, var1);
   }

   public Xi_2 M(int var1) {
      return (Xi_2)com.FN.K(this, var1);
   }

   @Override
   public int Y() {
      return com.FN.r(this);
   }

   public Xi_2 c(int var1, boolean var2, boolean var3) {
      return (Xi_2)com.FN.d(this, var1, var2, var3);
   }

   public Xi_2 V(int var1, int var2) {
      return (Xi_2)com.FN.m(this, var1, var2);
   }

   public Xi_2 g(String var1) {
      return (Xi_2)com.FN.s(this, var1);
   }

   @Override
   public String D$String() {
      return com.FN.b(this);
   }

   @Override
   public Component N(String var1) {
      return this.g(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.V(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.c(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.M(var1);
   }

   @Override
   public Component o(int var1) {
      return this.i(var1);
   }

   @Override
   public Component i$Component(int var1) {
      return this.w(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.h(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.y(var1);
   }

   @Override
   public Component Q() {
      return this.j();
   }

   @Override
   public Component u(boolean var1) {
      return this.F(var1);
   }

   @Override
   public Component R() {
      return this.J();
   }

   @Override
   public Component c(boolean var1) {
      return this.D(var1);
   }

   @Override
   public Component a() {
      return this.w();
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = ")\u001f|U\u0006-\u001c\n\u000f\\@\r\u0004\u00191#".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 115;
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
         var10007 = 115;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 23;
               break;
            case 1:
               var21 = 25;
               break;
            case 2:
               var21 = 99;
               break;
            case 3:
               var21 = 82;
               break;
            case 4:
               var21 = 28;
               break;
            case 5:
               var21 = 18;
               break;
            default:
               var21 = 6;
         }
      } else {
         var13 = 115;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 148688673252694591L;
            long var12 = 6525997981418248757L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 115;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 23;
               break;
            case 1:
               var21 = 25;
               break;
            case 2:
               var21 = 99;
               break;
            case 3:
               var21 = 82;
               break;
            case 4:
               var21 = 28;
               break;
            case 5:
               var21 = 18;
               break;
            default:
               var21 = 6;
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
                  var21 = 23;
                  break;
               case 1:
                  var21 = 25;
                  break;
               case 2:
                  var21 = 99;
                  break;
               case 3:
                  var21 = 82;
                  break;
               case 4:
                  var21 = 28;
                  break;
               case 5:
                  var21 = 18;
                  break;
               default:
                  var21 = 6;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 148688673252694591L;
               long var11 = 6525997981418248757L ^ var0;
               var6 = -1;
               b = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 23;
                  break;
               case 1:
                  var21 = 25;
                  break;
               case 2:
                  var21 = 99;
                  break;
               case 3:
                  var21 = 82;
                  break;
               case 4:
                  var21 = 28;
                  break;
               case 5:
                  var21 = 18;
                  break;
               default:
                  var21 = 6;
            }
         }
      }
   }
}





