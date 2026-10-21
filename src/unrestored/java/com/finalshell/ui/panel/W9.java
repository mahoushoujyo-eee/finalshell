package com.finalshell.ui.panel;

import com.finalshell.core.W2_3;
import com.finalshell.core.Zl2;
import com.finalshell.ui.model.Bj2;
import java.awt.Color;
import java.awt.Shape;
import javax.swing.JMenuBar;

public class W9 extends JMenuBar implements W2_3 {
   public W9() {
   }

   public W9(Bj2 var1) {
      this.E(var1);
   }

   public boolean d() {
      return this.D().O$boolean();
   }

   public void t(boolean var1) {
      this.D().j(var1);
   }

   public Bj2 x() {
      return this.D().w();
   }

   public void E(Bj2 var1) {
      this.D().v(var1);
   }

   public Color t() {
      return this.D().O$Color();
   }

   public void C(Color var1) {
      this.D().w(var1);
   }

   public int e() {
      return this.D().K();
   }

   public void Q(int var1) {
      this.D().N(var1);
   }

   public int b() {
      return this.D().g();
   }

   public void S(int var1) {
      this.D().g(var1);
   }

   @Override
   public Shape B() {
      return this.D().B();
   }

   public Zl2 D() {
      return (Zl2)this.getUI();
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
      // 00: invokestatic com/finalshell/ui/panel/Pb4.g ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 33
      // 09: invokevirtual com/finalshell/ui/panel/W9.getUI ()Ljavax/swing/plaf/MenuBarUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/W9.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnull 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/W9.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/ui/panel/W9.getUI ()Ljavax/swing/plaf/MenuBarUI;
      // 25: instanceof com/finalshell/core/Zl2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/ui/panel/W9.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.s Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 92
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/Zl2
      // 40: invokevirtual com/finalshell/ui/panel/W9.setUI (Ljavax/swing/plaf/MenuBarUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/Zl2
      // 50: dup
      // 51: invokespecial com/finalshell/core/Zl2.<init> ()V
      // 54: invokevirtual com/finalshell/ui/panel/W9.setUI (Ljavax/swing/plaf/MenuBarUI;)V
      // 57: aload 1
      // 58: ifnonnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/ui/panel/W9.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/ui/panel/W9.getUI ()Ljavax/swing/plaf/MenuBarUI;
      // 67: invokevirtual com/finalshell/ui/panel/W9.setUI (Ljavax/swing/plaf/MenuBarUI;)V
      // 6a: return
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }
}





