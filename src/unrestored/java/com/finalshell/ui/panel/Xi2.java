package com.finalshell.ui.panel;

import com.finalshell.core.Ac2;
import com.finalshell.core.Au2;
import com.finalshell.core.Az2;
import com.finalshell.core.FN;
import com.finalshell.core.Fs2_2;
import com.finalshell.core.I22;
import com.finalshell.core.Ld4;
import com.finalshell.core.O5;
import com.finalshell.core.Pp2;
import com.finalshell.core.RF3;
import com.finalshell.core.Sr2;
import com.finalshell.core.Yb4;
import com.finalshell.ui.listener.Wv4;
import com.finalshell.ui.model.Cs2;
import com.finalshell.ui.model.HT;
import com.finalshell.ui.model.WF;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Xi2 extends JLabel implements Pp2, RF3, Au2, Yb4 {
   public static String a;
   public static long b;

   public Xi2() {
   }

   public Xi2(Icon var1) {
      super(var1);
   }

   public Xi2(Icon var1, int var2) {
      super(var1, var2);
   }

   public Xi2(String var1) {
      super(var1);
   }

   public Xi2(String var1, int var2) {
      super(var1, var2);
   }

   public Xi2(String var1, Icon var2) {
      super(var1, var2, (int)b);
   }

   public Xi2(String var1, Icon var2, int var3) {
      super(var1, var2, var3);
   }

   public boolean c() {
      return this.d().Z();
   }

   public void p(boolean var1) {
      this.d().B(var1);
   }

   public Color D$Color() {
      return this.d().F();
   }

   public void x(Color var1) {
      this.d().l(var1);
   }

   public Wv4 d() {
      return (Wv4)this.getUI();
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
      // 00: invokestatic com/finalshell/ui/panel/Oj2.V ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 33
      // 09: invokevirtual com/finalshell/ui/panel/Xi2.getUI ()Ljavax/swing/plaf/LabelUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/Xi2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/Xi2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/ui/panel/Xi2.getUI ()Ljavax/swing/plaf/LabelUI;
      // 25: instanceof com/finalshell/ui/listener/Wv4
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/ui/panel/Xi2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.a Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 86
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/ui/listener/Wv4
      // 40: invokevirtual com/finalshell/ui/panel/Xi2.setUI (Ljavax/swing/plaf/LabelUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/ui/listener/Wv4
      // 50: dup
      // 51: invokespecial com/finalshell/ui/listener/Wv4.<init> ()V
      // 54: invokevirtual com/finalshell/ui/panel/Xi2.setUI (Ljavax/swing/plaf/LabelUI;)V
      // 57: iload 1
      // 58: ifeq 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/ui/panel/Xi2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/ui/panel/Xi2.getUI ()Ljavax/swing/plaf/LabelUI;
      // 67: invokevirtual com/finalshell/ui/panel/Xi2.setUI (Ljavax/swing/plaf/LabelUI;)V
      // 6a: return
   }

   @Override
   public String getUIClassID() {
      return a;
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

   @Override
   public void M() {
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

   @Override
   public void i() {
      I22.o(this);
   }

   public Xi2 w() {
      return (Xi2)FN.A(this);
   }

   public Xi2 D(boolean var1) {
      return (Xi2)FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return FN.k(this);
   }

   public Xi2 J() {
      return (Xi2)FN.u(this);
   }

   public Xi2 F(boolean var1) {
      return (Xi2)FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return FN.U(this);
   }

   public Xi2 j() {
      return (Xi2)FN.C(this);
   }

   public Xi2 y(boolean var1) {
      return (Xi2)FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return FN.G(this);
   }

   public Xi2 h(boolean var1, boolean var2) {
      return (Xi2)FN.K(this, var1, var2);
   }

   public Xi2 w(int var1) {
      return (Xi2)FN.p(this, var1);
   }

   public Xi2 i$Xi_2(int var1) {
      return (Xi2)FN.O(this, var1);
   }

   public Xi2 M(int var1) {
      return (Xi2)FN.K(this, var1);
   }

   @Override
   public int Y() {
      return FN.r$int(this);
   }

   public Xi2 c(int var1, boolean var2, boolean var3) {
      return (Xi2)FN.d(this, var1, var2, var3);
   }

   public Xi2 V(int var1, int var2) {
      return (Xi2)FN.m(this, var1, var2);
   }

   public Xi2 g(String var1) {
      return (Xi2)FN.s(this, var1);
   }

   public String D$String() {
      return FN.b$String(this);
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
      return this.i$Xi_2(var1);
   }

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

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
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





