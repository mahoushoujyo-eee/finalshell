package com.finalshell.ui.panel;

import com.finalshell.core.AL_2;
import com.finalshell.core.FN;
import com.finalshell.core.Fk2;
import com.finalshell.core.Hc2;
import com.finalshell.core.PF3;
import com.finalshell.core.PY;
import com.finalshell.core.Sa2;
import com.finalshell.core.Xg2;
import com.finalshell.ui.listener.YW;
import com.finalshell.ui.model.EZ;
import com.finalshell.ui.model.IX3;
import com.finalshell.ui.model.RT;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class BM extends JComponent implements Sa2 {
   public static Color b;
   public static Color C;
   public static Color M;
   public static Color K;
   public static Color j;
   public static Color N;
   public static Color T;
   public final List h = new ArrayList(1);
   public final List u;
   public final List D;
   public int e;
   public BufferedImage E;
   public PF3 p;
   public boolean m;
   public boolean a;
   public boolean G;
   public boolean R;
   public boolean U;
   public boolean i;
   public int I;
   public final SZ x;
   public boolean g;
   public boolean V;
   public static long[] c;
   public static Integer[] d;

   public BM() {
      KD3.u();
      this.u = new ArrayList(1);
      this.D = new ArrayList();
      this.e = -1;
      this.m = true;
      this.a = true;
      this.G = true;
      this.R = true;
      this.U = true;
      this.i = false;
      this.I = a(11494, 1686835258013324302L);
      this.g = false;
      this.V = false;
      this.E = null;
      this.p = null;
      FN.Y(this);
      this.setFocusable(true);
      this.setLayout(new IX3(new double[][]{{20.0, -2.0, -1.0}, {20.0, -2.0, -1.0}}));
      this.setFont(new JLabel().getFont().deriveFont(10.0F));
      this.x = new SZ(this, false);
      YW var2 = new YW(this, null);

      try {
         this.addMouseListener(var2);
         this.addMouseMotionListener(var2);
         this.addMouseWheelListener(var2);
         if (Ky4.F$arrString() != null) {
            KD3.p(new int[4]);
         }
      } catch (IllegalArgumentException var3) {
         throw a(var3);
      }
   }

   public SZ U() {
      return this.x;
   }

   public boolean R$boolean() {
      return this.V;
   }

   public boolean l() {
      return this.g;
   }

   public void M(boolean var1) {
      this.g = var1;
   }

   public int F() {
      return this.I;
   }

   public void b(int var1) {
      this.I = Math.max(1, Math.min(var1, a(10203, 9020220613021441851L)));
      this.revalidate();
      this.repaint();
      this.w$void();
   }

   public boolean A$boolean() {
      return this.G;
   }

   public void T(boolean var1) {
      this.G = var1;
      this.repaint();
   }

   public boolean j$boolean() {
      return this.R;
   }

   public void h(boolean var1) {
      this.R = var1;
      this.repaint();
   }

   public boolean u() {
      return this.U;
   }

   public void E(boolean var1) {
      this.U = var1;
      this.repaint();
   }

   public boolean y$boolean() {
      return this.i;
   }

   public void C(boolean var1) {
      this.i = var1;
      this.repaint();
   }

   public boolean P() {
      return this.m;
   }

   public void U(boolean var1) {
      this.m = var1;
      this.repaint();
   }

   public boolean b$boolean() {
      return this.a;
   }

   public void k(boolean var1) {
      this.a = var1;
      this.repaint();
   }

   public BufferedImage O() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/KD3.u ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifnull 27
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20: athrow
      // 21: invokevirtual com/finalshell/core/PF3.G ()Ljava/awt/image/BufferedImage;
      // 24: goto 28
      // 27: aconst_null
      // 28: areturn
   }

   public BufferedImage X$BufferedImage() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/KD3.u ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 22
      // 09: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 0c: ifnull 26
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: invokespecial com/finalshell/ui/panel/BM.r ()V
      // 1a: aload 0
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21: athrow
      // 22: getfield com/finalshell/ui/panel/BM.E Ljava/awt/image/BufferedImage;
      // 25: areturn
      // 26: aconst_null
      // 27: areturn
   }

   public void F(BufferedImage param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/KD3.u ()[I
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 3a
      // 09: invokevirtual com/finalshell/ui/panel/BM.R$boolean ()Z
      // 0c: ifeq 1b
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: return
      // 17: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 1
      // 1d: invokespecial com/finalshell/ui/panel/BM.t (Ljava/awt/image/BufferedImage;)V
      // 20: aload 0
      // 21: invokespecial com/finalshell/ui/panel/BM.M$void ()V
      // 24: aload 0
      // 25: invokevirtual com/finalshell/ui/panel/BM.revalidate ()V
      // 28: aload 0
      // 29: invokevirtual com/finalshell/ui/panel/BM.repaint ()V
      // 2c: aload 0
      // 2d: invokespecial com/finalshell/ui/panel/BM.E ()V
      // 30: aload 0
      // 31: invokespecial com/finalshell/ui/panel/BM.a$void ()V
      // 34: aload 0
      // 35: bipush 0
      // 36: putfield com/finalshell/ui/panel/BM.g Z
      // 39: aload 0
      // 3a: invokespecial com/finalshell/ui/panel/BM.C ()V
      // 3d: return
   }

   public void g(PF3 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/KD3.u ()[I
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 3a
      // 09: invokevirtual com/finalshell/ui/panel/BM.R$boolean ()Z
      // 0c: ifeq 1b
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: return
      // 17: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 1
      // 1d: putfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 20: aload 0
      // 21: invokespecial com/finalshell/ui/panel/BM.M$void ()V
      // 24: aload 0
      // 25: invokevirtual com/finalshell/ui/panel/BM.revalidate ()V
      // 28: aload 0
      // 29: invokevirtual com/finalshell/ui/panel/BM.repaint ()V
      // 2c: aload 0
      // 2d: invokespecial com/finalshell/ui/panel/BM.E ()V
      // 30: aload 0
      // 31: invokespecial com/finalshell/ui/panel/BM.a$void ()V
      // 34: aload 0
      // 35: bipush 0
      // 36: putfield com/finalshell/ui/panel/BM.g Z
      // 39: aload 0
      // 3a: invokespecial com/finalshell/ui/panel/BM.C ()V
      // 3d: return
   }

   public void O(RT param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/KD3.u ()[I
      // 03: astore 2
      // 04: aload 0
      // 05: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 08: ifnull 4c
      // 0b: aload 1
      // 0c: ifnull 4c
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual com/finalshell/ui/panel/BM.R$boolean ()Z
      // 1a: aload 2
      // 1b: ifnonnull 49
      // 1e: goto 25
      // 21: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24: athrow
      // 25: ifne 4c
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2e: athrow
      // 2f: aload 0
      // 30: aload 2
      // 31: ifnonnull 87
      // 34: goto 3b
      // 37: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a: athrow
      // 3b: invokevirtual com/finalshell/ui/panel/BM.w$RT ()Lcom/finalshell/ui/model/RT;
      // 3e: aload 1
      // 3f: invokevirtual com/finalshell/ui/model/RT.equals (Ljava/lang/Object;)Z
      // 42: goto 49
      // 45: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 48: athrow
      // 49: ifeq 4d
      // 4c: return
      // 4d: aload 0
      // 4e: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 51: aload 1
      // 52: invokevirtual com/finalshell/ui/model/RT.o ()Ljava/util/List;
      // 55: invokevirtual com/finalshell/core/PF3.e (Ljava/util/List;)V
      // 58: aload 0
      // 59: invokespecial com/finalshell/ui/panel/BM.j$void ()V
      // 5c: aload 0
      // 5d: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 60: aload 1
      // 61: invokevirtual com/finalshell/ui/model/RT.k ()Ljava/util/List;
      // 64: invokevirtual com/finalshell/core/PF3.f (Ljava/util/List;)V
      // 67: aload 0
      // 68: invokespecial com/finalshell/ui/panel/BM.X$void ()V
      // 6b: aload 0
      // 6c: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 6f: aload 1
      // 70: invokevirtual com/finalshell/ui/model/RT.W ()Ljava/awt/Insets;
      // 73: invokevirtual com/finalshell/core/PF3.H (Ljava/awt/Insets;)V
      // 76: aload 0
      // 77: invokespecial com/finalshell/ui/panel/BM.I ()V
      // 7a: aload 0
      // 7b: invokespecial com/finalshell/ui/panel/BM.M$void ()V
      // 7e: aload 0
      // 7f: invokevirtual com/finalshell/ui/panel/BM.revalidate ()V
      // 82: aload 0
      // 83: invokevirtual com/finalshell/ui/panel/BM.repaint ()V
      // 86: aload 0
      // 87: invokespecial com/finalshell/ui/panel/BM.a$void ()V
      // 8a: return
   }

   public RT w$RT() {
      try {
         if (this.p == null) {
            return null;
         }
      } catch (IllegalArgumentException var2) {
         throw a(var2);
      }

      RT var1 = new RT();
      var1.x(this.p.s());
      var1.S(this.p.U$List());
      var1.V(this.p.g());
      var1.Y(this.p.U$Insets());
      return var1;
   }

   public PF3 T() {
      return this.p;
   }

   public void R$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/KD3.u ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: invokevirtual com/finalshell/ui/panel/BM.R$boolean ()Z
      // 08: aload 1
      // 09: ifnonnull 2c
      // 0c: ifne 54
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 41
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21: athrow
      // 22: getfield com/finalshell/ui/panel/BM.e I
      // 25: goto 2c
      // 28: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2b: athrow
      // 2c: ifle 54
      // 2f: aload 0
      // 30: aload 0
      // 31: getfield com/finalshell/ui/panel/BM.e I
      // 34: bipush 1
      // 35: isub
      // 36: putfield com/finalshell/ui/panel/BM.e I
      // 39: aload 0
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 40: athrow
      // 41: aload 0
      // 42: getfield com/finalshell/ui/panel/BM.D Ljava/util/List;
      // 45: aload 0
      // 46: getfield com/finalshell/ui/panel/BM.e I
      // 49: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 4e: checkcast com/finalshell/ui/model/RT
      // 51: invokespecial com/finalshell/ui/panel/BM.l (Lcom/finalshell/ui/model/RT;)V
      // 54: return
   }

   public void Q$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/KD3.u ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: invokevirtual com/finalshell/ui/panel/BM.R$boolean ()Z
      // 08: aload 1
      // 09: ifnonnull 2c
      // 0c: ifne 5f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 4c
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21: athrow
      // 22: getfield com/finalshell/ui/panel/BM.e I
      // 25: goto 2c
      // 28: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield com/finalshell/ui/panel/BM.D Ljava/util/List;
      // 30: invokeinterface java/util/List.size ()I 1
      // 35: bipush 1
      // 36: isub
      // 37: if_icmpge 5f
      // 3a: aload 0
      // 3b: aload 0
      // 3c: getfield com/finalshell/ui/panel/BM.e I
      // 3f: bipush 1
      // 40: iadd
      // 41: putfield com/finalshell/ui/panel/BM.e I
      // 44: aload 0
      // 45: goto 4c
      // 48: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4b: athrow
      // 4c: aload 0
      // 4d: getfield com/finalshell/ui/panel/BM.D Ljava/util/List;
      // 50: aload 0
      // 51: getfield com/finalshell/ui/panel/BM.e I
      // 54: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 59: checkcast com/finalshell/ui/model/RT
      // 5c: invokespecial com/finalshell/ui/panel/BM.l (Lcom/finalshell/ui/model/RT;)V
      // 5f: return
   }

   public void l(RT param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/KD3.u ()[I
      // 03: astore 2
      // 04: aload 2
      // 05: ifnonnull 5f
      // 08: aload 1
      // 09: invokevirtual com/finalshell/ui/model/RT.g ()Ljava/awt/Dimension;
      // 0c: aload 0
      // 0d: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 10: invokevirtual com/finalshell/core/PF3.s ()Ljava/awt/Dimension;
      // 13: invokevirtual java/awt/Dimension.equals (Ljava/lang/Object;)Z
      // 16: ifne 25
      // 19: goto 20
      // 1c: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f: athrow
      // 20: return
      // 21: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24: athrow
      // 25: aload 0
      // 26: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 29: aload 1
      // 2a: invokevirtual com/finalshell/ui/model/RT.W ()Ljava/awt/Insets;
      // 2d: invokestatic com/finalshell/core/FN.K (Ljava/awt/Insets;)Ljava/awt/Insets;
      // 30: invokevirtual com/finalshell/core/PF3.H (Ljava/awt/Insets;)V
      // 33: aload 0
      // 34: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 37: aload 1
      // 38: invokevirtual com/finalshell/ui/model/RT.k ()Ljava/util/List;
      // 3b: invokestatic com/finalshell/core/AL_2.y (Ljava/util/Collection;)Ljava/util/ArrayList;
      // 3e: invokevirtual com/finalshell/core/PF3.f (Ljava/util/List;)V
      // 41: aload 0
      // 42: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 45: aload 1
      // 46: invokevirtual com/finalshell/ui/model/RT.o ()Ljava/util/List;
      // 49: invokestatic com/finalshell/core/AL_2.y (Ljava/util/Collection;)Ljava/util/ArrayList;
      // 4c: invokevirtual com/finalshell/core/PF3.e (Ljava/util/List;)V
      // 4f: aload 0
      // 50: invokespecial com/finalshell/ui/panel/BM.M$void ()V
      // 53: aload 0
      // 54: invokevirtual com/finalshell/ui/panel/BM.revalidate ()V
      // 57: aload 0
      // 58: invokevirtual com/finalshell/ui/panel/BM.repaint ()V
      // 5b: aload 0
      // 5c: invokespecial com/finalshell/ui/panel/BM.C ()V
      // 5f: aload 0
      // 60: aload 0
      // 61: getfield com/finalshell/ui/panel/BM.e I
      // 64: aload 2
      // 65: ifnonnull 73
      // 68: ifle 76
      // 6b: goto 72
      // 6e: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 71: athrow
      // 72: bipush 1
      // 73: goto 77
      // 76: bipush 0
      // 77: putfield com/finalshell/ui/panel/BM.g Z
      // 7a: return
   }

   public void a$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/KD3.u ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 1e
      // 09: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 0c: ifnull aa
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d: athrow
      // 1e: getfield com/finalshell/ui/panel/BM.D Ljava/util/List;
      // 21: invokeinterface java/util/List.size ()I 1
      // 26: bipush 1
      // 27: isub
      // 28: istore 2
      // 29: iload 2
      // 2a: aload 0
      // 2b: getfield com/finalshell/ui/panel/BM.e I
      // 2e: if_icmple 4e
      // 31: aload 0
      // 32: getfield com/finalshell/ui/panel/BM.D Ljava/util/List;
      // 35: iload 2
      // 36: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 3b: pop
      // 3c: iinc 2 -1
      // 3f: aload 1
      // 40: ifnonnull aa
      // 43: aload 1
      // 44: ifnull 29
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4d: athrow
      // 4e: new com/finalshell/ui/model/RT
      // 51: dup
      // 52: invokespecial com/finalshell/ui/model/RT.<init> ()V
      // 55: astore 2
      // 56: aload 2
      // 57: aload 0
      // 58: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 5b: invokevirtual com/finalshell/core/PF3.s ()Ljava/awt/Dimension;
      // 5e: invokevirtual com/finalshell/ui/model/RT.x (Ljava/awt/Dimension;)V
      // 61: aload 2
      // 62: aload 0
      // 63: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 66: invokevirtual com/finalshell/core/PF3.U$Insets ()Ljava/awt/Insets;
      // 69: invokestatic com/finalshell/core/FN.K (Ljava/awt/Insets;)Ljava/awt/Insets;
      // 6c: invokevirtual com/finalshell/ui/model/RT.Y (Ljava/awt/Insets;)V
      // 6f: aload 2
      // 70: aload 0
      // 71: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 74: invokevirtual com/finalshell/core/PF3.U$List ()Ljava/util/List;
      // 77: invokestatic com/finalshell/core/AL_2.y (Ljava/util/Collection;)Ljava/util/ArrayList;
      // 7a: invokevirtual com/finalshell/ui/model/RT.S (Ljava/util/List;)V
      // 7d: aload 2
      // 7e: aload 0
      // 7f: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 82: invokevirtual com/finalshell/core/PF3.g ()Ljava/util/List;
      // 85: invokestatic com/finalshell/core/AL_2.y (Ljava/util/Collection;)Ljava/util/ArrayList;
      // 88: invokevirtual com/finalshell/ui/model/RT.V (Ljava/util/List;)V
      // 8b: aload 0
      // 8c: getfield com/finalshell/ui/panel/BM.D Ljava/util/List;
      // 8f: aload 2
      // 90: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 95: pop
      // 96: aload 0
      // 97: aload 0
      // 98: getfield com/finalshell/ui/panel/BM.D Ljava/util/List;
      // 9b: invokeinterface java/util/List.size ()I 1
      // a0: bipush 1
      // a1: isub
      // a2: putfield com/finalshell/ui/panel/BM.e I
      // a5: aload 0
      // a6: bipush 1
      // a7: putfield com/finalshell/ui/panel/BM.g Z
      // aa: return
   }

   public void E() {
      this.D.clear();
      this.e = -1;
   }

   public void M$void() {
   }

   public int h() {
      return Math.max(3, this.I / 2);
   }

   public void X$void() {
      boolean[] var1 = this.b$arrboolean();
      this.p.f(Fk2.h(var1));
   }

   public boolean[] b$arrboolean() {
      int[] var10000 = KD3.u();
      boolean[] var2 = new boolean[this.O().getWidth()];
      Iterator var3 = this.p.U$List().iterator();
      int[] var1 = var10000;

      label52:
      while (true) {
         int var8 = (var3.hasNext()) ? 1 : 0;

         label50:
         while (var8 != 0) {
            EZ var4 = (EZ)var3.next();
            int var5 = var4.x();

            while (var5 <= var4.f()) {
               var8 = (var4.C()) ? 1 : 0;
               if (var1 != null) {
                  continue label50;
               }

               label44: {
                  label43: {
                     try {
                        if (var1 != null) {
                           break label43;
                        }

                        if (var8 != 0) {
                           break label44;
                        }
                     } catch (IllegalArgumentException var7) {
                        throw a(var7);
                     }

                     var8 = var5;
                  }

                  try {
                     if (var8 < var2.length) {
                        var2[var5] = true;
                     }
                  } catch (IllegalArgumentException var6) {
                     throw a(var6);
                  }
               }

               var5++;
               if (var1 != null) {
                  break;
               }
            }

            if (var1 != null) {
               return var2;
            }
            continue label52;
         }

         return var2;
      }
   }

   public void j$void() {
      boolean[] var1 = this.c();
      this.p.e(Fk2.h(var1));
   }

   public boolean[] c() {
      int[] var10000 = KD3.u();
      boolean[] var2 = new boolean[this.O().getHeight()];
      int[] var1 = var10000;
      Iterator var3 = this.p.g().iterator();

      label52:
      while (true) {
         int var8 = (var3.hasNext()) ? 1 : 0;

         label50:
         while (var8 != 0) {
            EZ var4 = (EZ)var3.next();
            int var5 = var4.x();

            while (var5 <= var4.f()) {
               var8 = (var4.C()) ? 1 : 0;
               if (var1 != null) {
                  continue label50;
               }

               label44: {
                  label43: {
                     try {
                        if (var1 != null) {
                           break label43;
                        }

                        if (var8 != 0) {
                           break label44;
                        }
                     } catch (IllegalArgumentException var7) {
                        throw a(var7);
                     }

                     var8 = var5;
                  }

                  try {
                     if (var8 < var2.length) {
                        var2[var5] = true;
                     }
                  } catch (IllegalArgumentException var6) {
                     throw a(var6);
                  }
               }

               var5++;
               if (var1 != null) {
                  break;
               }
            }

            if (var1 != null) {
               return var2;
            }
            continue label52;
         }

         return var2;
      }
   }

   public void I() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/KD3.u ()[I
      // 03: aload 0
      // 04: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 07: invokevirtual com/finalshell/core/PF3.U$Insets ()Ljava/awt/Insets;
      // 0a: astore 2
      // 0b: astore 1
      // 0c: aload 0
      // 0d: invokevirtual com/finalshell/ui/panel/BM.O ()Ljava/awt/image/BufferedImage;
      // 10: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 13: bipush 1
      // 14: isub
      // 15: istore 3
      // 16: aload 2
      // 17: getfield java/awt/Insets.top I
      // 1a: iload 3
      // 1b: aload 1
      // 1c: ifnonnull 3f
      // 1f: if_icmple 35
      // 22: goto 29
      // 25: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 28: athrow
      // 29: aload 2
      // 2a: iload 3
      // 2b: putfield java/awt/Insets.top I
      // 2e: goto 35
      // 31: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34: athrow
      // 35: aload 2
      // 36: getfield java/awt/Insets.bottom I
      // 39: aload 2
      // 3a: getfield java/awt/Insets.top I
      // 3d: iadd
      // 3e: iload 3
      // 3f: aload 1
      // 40: ifnonnull 66
      // 43: if_icmple 5e
      // 46: goto 4d
      // 49: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4c: athrow
      // 4d: aload 2
      // 4e: iload 3
      // 4f: aload 2
      // 50: getfield java/awt/Insets.top I
      // 53: isub
      // 54: putfield java/awt/Insets.bottom I
      // 57: goto 5e
      // 5a: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5d: athrow
      // 5e: aload 0
      // 5f: invokevirtual com/finalshell/ui/panel/BM.O ()Ljava/awt/image/BufferedImage;
      // 62: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 65: bipush 1
      // 66: isub
      // 67: istore 4
      // 69: aload 2
      // 6a: getfield java/awt/Insets.left I
      // 6d: iload 4
      // 6f: aload 1
      // 70: ifnonnull a0
      // 73: if_icmple 8a
      // 76: goto 7d
      // 79: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7c: athrow
      // 7d: aload 2
      // 7e: iload 4
      // 80: putfield java/awt/Insets.left I
      // 83: goto 8a
      // 86: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 89: athrow
      // 8a: aload 2
      // 8b: aload 1
      // 8c: ifnonnull a4
      // 8f: getfield java/awt/Insets.right I
      // 92: aload 2
      // 93: getfield java/awt/Insets.left I
      // 96: iadd
      // 97: iload 4
      // 99: goto a0
      // 9c: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 9f: athrow
      // a0: if_icmple ae
      // a3: aload 2
      // a4: iload 4
      // a6: aload 2
      // a7: getfield java/awt/Insets.left I
      // aa: isub
      // ab: putfield java/awt/Insets.right I
      // ae: return
   }

   public void t(BufferedImage var1) {
      try {
         this.p = new PF3(var1);
         this.E = var1;
      } catch (IllegalArgumentException var5) {
         BufferedImage var3 = Xg2.g(var1.getWidth() + 2, var1.getHeight() + 2, 3);
         Graphics2D var4 = var3.createGraphics();
         var4.drawImage(var1, 1, 1, null);
         var4.setPaint(Color.BLACK);
         var4.drawLine(1, 0, var3.getWidth() - 2, 0);
         var4.drawLine(0, 1, 0, var3.getHeight() - 2);
         var4.dispose();
         this.p = new PF3(var3);
         this.E = var3;
      }
   }

   public void r() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/KD3.u ()[I
      // 003: aload 0
      // 004: invokevirtual com/finalshell/ui/panel/BM.O ()Ljava/awt/image/BufferedImage;
      // 007: astore 2
      // 008: aload 0
      // 009: aload 2
      // 00a: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 00d: bipush 2
      // 00e: iadd
      // 00f: aload 2
      // 010: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 013: bipush 2
      // 014: iadd
      // 015: bipush 3
      // 016: invokestatic com/finalshell/core/Xg2.g (III)Ljava/awt/image/BufferedImage;
      // 019: putfield com/finalshell/ui/panel/BM.E Ljava/awt/image/BufferedImage;
      // 01c: aload 0
      // 01d: getfield com/finalshell/ui/panel/BM.E Ljava/awt/image/BufferedImage;
      // 020: invokevirtual java/awt/image/BufferedImage.createGraphics ()Ljava/awt/Graphics2D;
      // 023: astore 3
      // 024: aload 3
      // 025: aload 2
      // 026: bipush 1
      // 027: bipush 1
      // 028: aconst_null
      // 029: invokevirtual java/awt/Graphics2D.drawImage (Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
      // 02c: pop
      // 02d: astore 1
      // 02e: aload 3
      // 02f: invokevirtual java/awt/Graphics2D.dispose ()V
      // 032: getstatic java/awt/Color.BLACK Ljava/awt/Color;
      // 035: invokevirtual java/awt/Color.getRGB ()I
      // 038: istore 4
      // 03a: aload 0
      // 03b: invokespecial com/finalshell/ui/panel/BM.b$arrboolean ()[Z
      // 03e: astore 5
      // 040: bipush 0
      // 041: istore 6
      // 043: iload 6
      // 045: aload 2
      // 046: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 049: if_icmpge 07b
      // 04c: aload 5
      // 04e: aload 1
      // 04f: ifnonnull 07f
      // 052: iload 6
      // 054: baload
      // 055: ifeq 074
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05e: athrow
      // 05f: aload 0
      // 060: getfield com/finalshell/ui/panel/BM.E Ljava/awt/image/BufferedImage;
      // 063: iload 6
      // 065: bipush 1
      // 066: iadd
      // 067: bipush 0
      // 068: iload 4
      // 06a: invokevirtual java/awt/image/BufferedImage.setRGB (III)V
      // 06d: goto 074
      // 070: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 073: athrow
      // 074: iinc 6 1
      // 077: aload 1
      // 078: ifnull 043
      // 07b: aload 0
      // 07c: invokespecial com/finalshell/ui/panel/BM.c ()[Z
      // 07f: astore 6
      // 081: bipush 0
      // 082: istore 7
      // 084: iload 7
      // 086: aload 2
      // 087: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 08a: if_icmpge 0b1
      // 08d: aload 6
      // 08f: iload 7
      // 091: baload
      // 092: ifeq 0aa
      // 095: aload 0
      // 096: getfield com/finalshell/ui/panel/BM.E Ljava/awt/image/BufferedImage;
      // 099: bipush 0
      // 09a: iload 7
      // 09c: bipush 1
      // 09d: iadd
      // 09e: iload 4
      // 0a0: invokevirtual java/awt/image/BufferedImage.setRGB (III)V
      // 0a3: goto 0aa
      // 0a6: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a9: athrow
      // 0aa: iinc 7 1
      // 0ad: aload 1
      // 0ae: ifnull 084
      // 0b1: aload 0
      // 0b2: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 0b5: invokevirtual com/finalshell/core/PF3.U$Insets ()Ljava/awt/Insets;
      // 0b8: astore 7
      // 0ba: aload 7
      // 0bc: getfield java/awt/Insets.left I
      // 0bf: istore 8
      // 0c1: iload 8
      // 0c3: aload 2
      // 0c4: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 0c7: aload 7
      // 0c9: getfield java/awt/Insets.right I
      // 0cc: isub
      // 0cd: if_icmpge 0f8
      // 0d0: aload 0
      // 0d1: getfield com/finalshell/ui/panel/BM.E Ljava/awt/image/BufferedImage;
      // 0d4: iload 8
      // 0d6: bipush 1
      // 0d7: iadd
      // 0d8: aload 0
      // 0d9: getfield com/finalshell/ui/panel/BM.E Ljava/awt/image/BufferedImage;
      // 0dc: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 0df: bipush 1
      // 0e0: isub
      // 0e1: iload 4
      // 0e3: invokevirtual java/awt/image/BufferedImage.setRGB (III)V
      // 0e6: iinc 8 1
      // 0e9: aload 1
      // 0ea: ifnonnull 0ff
      // 0ed: aload 1
      // 0ee: ifnull 0c1
      // 0f1: goto 0f8
      // 0f4: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f7: athrow
      // 0f8: aload 7
      // 0fa: getfield java/awt/Insets.top I
      // 0fd: istore 8
      // 0ff: iload 8
      // 101: aload 2
      // 102: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 105: aload 7
      // 107: getfield java/awt/Insets.bottom I
      // 10a: isub
      // 10b: if_icmpge 132
      // 10e: aload 0
      // 10f: getfield com/finalshell/ui/panel/BM.E Ljava/awt/image/BufferedImage;
      // 112: aload 0
      // 113: getfield com/finalshell/ui/panel/BM.E Ljava/awt/image/BufferedImage;
      // 116: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 119: bipush 1
      // 11a: isub
      // 11b: iload 8
      // 11d: bipush 1
      // 11e: iadd
      // 11f: iload 4
      // 121: invokevirtual java/awt/image/BufferedImage.setRGB (III)V
      // 124: iinc 8 1
      // 127: aload 1
      // 128: ifnull 0ff
      // 12b: goto 132
      // 12e: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 131: athrow
      // 132: return
   }

   @Override
   protected void paintComponent(Graphics param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/KD3.u ()[I
      // 003: aload 0
      // 004: aload 1
      // 005: invokespecial javax/swing/JComponent.paintComponent (Ljava/awt/Graphics;)V
      // 008: astore 2
      // 009: aload 0
      // 00a: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 00d: ifnull 66e
      // 010: aload 1
      // 011: checkcast java/awt/Graphics2D
      // 014: astore 3
      // 015: aload 3
      // 016: invokevirtual java/awt/Graphics2D.getFontMetrics ()Ljava/awt/FontMetrics;
      // 019: astore 4
      // 01b: aload 0
      // 01c: invokevirtual com/finalshell/ui/panel/BM.O ()Ljava/awt/image/BufferedImage;
      // 01f: astore 5
      // 021: aload 0
      // 022: invokevirtual com/finalshell/ui/panel/BM.getWidth ()I
      // 025: istore 6
      // 027: aload 0
      // 028: invokevirtual com/finalshell/ui/panel/BM.getHeight ()I
      // 02b: istore 7
      // 02d: aload 5
      // 02f: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 032: aload 0
      // 033: getfield com/finalshell/ui/panel/BM.I I
      // 036: imul
      // 037: istore 8
      // 039: aload 5
      // 03b: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 03e: aload 0
      // 03f: getfield com/finalshell/ui/panel/BM.I I
      // 042: imul
      // 043: istore 9
      // 045: aload 0
      // 046: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 049: invokevirtual com/finalshell/core/PF3.U$Insets ()Ljava/awt/Insets;
      // 04c: astore 10
      // 04e: iload 6
      // 050: aload 0
      // 051: getfield com/finalshell/ui/panel/BM.a Z
      // 054: aload 2
      // 055: ifnonnull 06b
      // 058: ifeq 06e
      // 05b: goto 062
      // 05e: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 061: athrow
      // 062: sipush 23435
      // 065: ldc2_w 3919341184167535476
      // 068: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 06b: goto 06f
      // 06e: bipush 0
      // 06f: iadd
      // 070: bipush 2
      // 071: idiv
      // 072: iload 8
      // 074: bipush 2
      // 075: idiv
      // 076: isub
      // 077: istore 11
      // 079: iload 7
      // 07b: aload 0
      // 07c: getfield com/finalshell/ui/panel/BM.a Z
      // 07f: aload 2
      // 080: ifnonnull 096
      // 083: ifeq 099
      // 086: goto 08d
      // 089: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08c: athrow
      // 08d: sipush 23435
      // 090: ldc2_w 3919341184167535476
      // 093: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 096: goto 09a
      // 099: bipush 0
      // 09a: iadd
      // 09b: bipush 2
      // 09c: idiv
      // 09d: iload 9
      // 09f: bipush 2
      // 0a0: idiv
      // 0a1: isub
      // 0a2: istore 12
      // 0a4: aload 3
      // 0a5: invokevirtual java/awt/Graphics2D.getStroke ()Ljava/awt/Stroke;
      // 0a8: astore 13
      // 0aa: aload 3
      // 0ab: iload 11
      // 0ad: iload 12
      // 0af: iload 8
      // 0b1: iload 9
      // 0b3: invokestatic com/finalshell/core/GA.o (Ljava/awt/Graphics2D;IIII)V
      // 0b6: aload 3
      // 0b7: getstatic java/awt/Color.DARK_GRAY Ljava/awt/Color;
      // 0ba: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 0bd: aload 3
      // 0be: iload 11
      // 0c0: iload 12
      // 0c2: iload 8
      // 0c4: iload 9
      // 0c6: invokevirtual java/awt/Graphics2D.drawRect (IIII)V
      // 0c9: aload 1
      // 0ca: aload 5
      // 0cc: iload 11
      // 0ce: iload 12
      // 0d0: iload 8
      // 0d2: iload 9
      // 0d4: aconst_null
      // 0d5: invokevirtual java/awt/Graphics.drawImage (Ljava/awt/Image;IIIILjava/awt/image/ImageObserver;)Z
      // 0d8: pop
      // 0d9: aload 3
      // 0da: getstatic com/finalshell/core/GO.Fk Ljava/awt/Stroke;
      // 0dd: invokevirtual java/awt/Graphics2D.setStroke (Ljava/awt/Stroke;)V
      // 0e0: aload 0
      // 0e1: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 0e4: invokevirtual com/finalshell/core/PF3.U$List ()Ljava/util/List;
      // 0e7: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0ec: astore 14
      // 0ee: aload 14
      // 0f0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0f5: ifeq 1f9
      // 0f8: aload 14
      // 0fa: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ff: checkcast com/finalshell/ui/model/EZ
      // 102: astore 15
      // 104: aload 15
      // 106: invokevirtual com/finalshell/ui/model/EZ.C ()Z
      // 109: aload 2
      // 10a: ifnonnull 20e
      // 10d: aload 2
      // 10e: ifnonnull 12d
      // 111: goto 118
      // 114: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 117: athrow
      // 118: ifne 1f5
      // 11b: goto 122
      // 11e: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 121: athrow
      // 122: aload 0
      // 123: getfield com/finalshell/ui/panel/BM.G Z
      // 126: goto 12d
      // 129: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12c: athrow
      // 12d: ifeq 165
      // 130: aload 3
      // 131: getstatic com/finalshell/ui/panel/BM.C Ljava/awt/Color;
      // 134: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 137: aload 3
      // 138: iload 11
      // 13a: aload 15
      // 13c: invokevirtual com/finalshell/ui/model/EZ.x ()I
      // 13f: aload 0
      // 140: getfield com/finalshell/ui/panel/BM.I I
      // 143: imul
      // 144: iadd
      // 145: iload 12
      // 147: aload 15
      // 149: invokevirtual com/finalshell/ui/model/EZ.f ()I
      // 14c: aload 15
      // 14e: invokevirtual com/finalshell/ui/model/EZ.x ()I
      // 151: isub
      // 152: bipush 1
      // 153: iadd
      // 154: aload 0
      // 155: getfield com/finalshell/ui/panel/BM.I I
      // 158: imul
      // 159: iload 9
      // 15b: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 15e: goto 165
      // 161: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 164: athrow
      // 165: aload 3
      // 166: getstatic com/finalshell/ui/panel/BM.b Ljava/awt/Color;
      // 169: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 16c: aload 3
      // 16d: iload 11
      // 16f: aload 15
      // 171: invokevirtual com/finalshell/ui/model/EZ.x ()I
      // 174: aload 0
      // 175: getfield com/finalshell/ui/panel/BM.I I
      // 178: imul
      // 179: iadd
      // 17a: bipush 0
      // 17b: iload 11
      // 17d: aload 15
      // 17f: invokevirtual com/finalshell/ui/model/EZ.x ()I
      // 182: aload 0
      // 183: getfield com/finalshell/ui/panel/BM.I I
      // 186: imul
      // 187: iadd
      // 188: iload 12
      // 18a: iload 9
      // 18c: iadd
      // 18d: bipush 1
      // 18e: isub
      // 18f: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 192: aload 3
      // 193: iload 11
      // 195: aload 15
      // 197: invokevirtual com/finalshell/ui/model/EZ.f ()I
      // 19a: bipush 1
      // 19b: iadd
      // 19c: aload 0
      // 19d: getfield com/finalshell/ui/panel/BM.I I
      // 1a0: imul
      // 1a1: iadd
      // 1a2: bipush 0
      // 1a3: iload 11
      // 1a5: aload 15
      // 1a7: invokevirtual com/finalshell/ui/model/EZ.f ()I
      // 1aa: bipush 1
      // 1ab: iadd
      // 1ac: aload 0
      // 1ad: getfield com/finalshell/ui/panel/BM.I I
      // 1b0: imul
      // 1b1: iadd
      // 1b2: iload 12
      // 1b4: iload 9
      // 1b6: iadd
      // 1b7: bipush 1
      // 1b8: isub
      // 1b9: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 1bc: aload 3
      // 1bd: getstatic java/awt/Color.BLACK Ljava/awt/Color;
      // 1c0: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 1c3: aload 3
      // 1c4: iload 11
      // 1c6: aload 15
      // 1c8: invokevirtual com/finalshell/ui/model/EZ.x ()I
      // 1cb: aload 0
      // 1cc: getfield com/finalshell/ui/panel/BM.I I
      // 1cf: imul
      // 1d0: iadd
      // 1d1: bipush 1
      // 1d2: iadd
      // 1d3: iload 12
      // 1d5: aload 0
      // 1d6: getfield com/finalshell/ui/panel/BM.I I
      // 1d9: isub
      // 1da: aload 15
      // 1dc: invokevirtual com/finalshell/ui/model/EZ.f ()I
      // 1df: aload 15
      // 1e1: invokevirtual com/finalshell/ui/model/EZ.x ()I
      // 1e4: isub
      // 1e5: bipush 1
      // 1e6: iadd
      // 1e7: aload 0
      // 1e8: getfield com/finalshell/ui/panel/BM.I I
      // 1eb: imul
      // 1ec: bipush 1
      // 1ed: isub
      // 1ee: aload 0
      // 1ef: getfield com/finalshell/ui/panel/BM.I I
      // 1f2: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 1f5: aload 2
      // 1f6: ifnull 0ee
      // 1f9: aload 0
      // 1fa: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 1fd: invokevirtual com/finalshell/core/PF3.g ()Ljava/util/List;
      // 200: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 205: astore 14
      // 207: aload 14
      // 209: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 20e: ifeq 312
      // 211: aload 14
      // 213: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 218: checkcast com/finalshell/ui/model/EZ
      // 21b: astore 15
      // 21d: aload 15
      // 21f: invokevirtual com/finalshell/ui/model/EZ.C ()Z
      // 222: aload 2
      // 223: ifnonnull 31a
      // 226: aload 2
      // 227: ifnonnull 246
      // 22a: goto 231
      // 22d: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 230: athrow
      // 231: ifne 30e
      // 234: goto 23b
      // 237: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23a: athrow
      // 23b: aload 0
      // 23c: getfield com/finalshell/ui/panel/BM.G Z
      // 23f: goto 246
      // 242: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 245: athrow
      // 246: ifeq 27e
      // 249: aload 3
      // 24a: getstatic com/finalshell/ui/panel/BM.C Ljava/awt/Color;
      // 24d: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 250: aload 3
      // 251: iload 11
      // 253: iload 12
      // 255: aload 15
      // 257: invokevirtual com/finalshell/ui/model/EZ.x ()I
      // 25a: aload 0
      // 25b: getfield com/finalshell/ui/panel/BM.I I
      // 25e: imul
      // 25f: iadd
      // 260: iload 8
      // 262: aload 15
      // 264: invokevirtual com/finalshell/ui/model/EZ.f ()I
      // 267: aload 15
      // 269: invokevirtual com/finalshell/ui/model/EZ.x ()I
      // 26c: isub
      // 26d: bipush 1
      // 26e: iadd
      // 26f: aload 0
      // 270: getfield com/finalshell/ui/panel/BM.I I
      // 273: imul
      // 274: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 277: goto 27e
      // 27a: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27d: athrow
      // 27e: aload 3
      // 27f: getstatic com/finalshell/ui/panel/BM.b Ljava/awt/Color;
      // 282: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 285: aload 3
      // 286: bipush 0
      // 287: iload 12
      // 289: aload 15
      // 28b: invokevirtual com/finalshell/ui/model/EZ.x ()I
      // 28e: aload 0
      // 28f: getfield com/finalshell/ui/panel/BM.I I
      // 292: imul
      // 293: iadd
      // 294: iload 11
      // 296: iload 8
      // 298: iadd
      // 299: bipush 1
      // 29a: isub
      // 29b: iload 12
      // 29d: aload 15
      // 29f: invokevirtual com/finalshell/ui/model/EZ.x ()I
      // 2a2: aload 0
      // 2a3: getfield com/finalshell/ui/panel/BM.I I
      // 2a6: imul
      // 2a7: iadd
      // 2a8: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 2ab: aload 3
      // 2ac: bipush 0
      // 2ad: iload 12
      // 2af: aload 15
      // 2b1: invokevirtual com/finalshell/ui/model/EZ.f ()I
      // 2b4: bipush 1
      // 2b5: iadd
      // 2b6: aload 0
      // 2b7: getfield com/finalshell/ui/panel/BM.I I
      // 2ba: imul
      // 2bb: iadd
      // 2bc: iload 11
      // 2be: iload 8
      // 2c0: iadd
      // 2c1: bipush 1
      // 2c2: isub
      // 2c3: iload 12
      // 2c5: aload 15
      // 2c7: invokevirtual com/finalshell/ui/model/EZ.f ()I
      // 2ca: bipush 1
      // 2cb: iadd
      // 2cc: aload 0
      // 2cd: getfield com/finalshell/ui/panel/BM.I I
      // 2d0: imul
      // 2d1: iadd
      // 2d2: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 2d5: aload 3
      // 2d6: getstatic java/awt/Color.BLACK Ljava/awt/Color;
      // 2d9: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 2dc: aload 3
      // 2dd: iload 11
      // 2df: aload 0
      // 2e0: getfield com/finalshell/ui/panel/BM.I I
      // 2e3: isub
      // 2e4: iload 12
      // 2e6: aload 15
      // 2e8: invokevirtual com/finalshell/ui/model/EZ.x ()I
      // 2eb: aload 0
      // 2ec: getfield com/finalshell/ui/panel/BM.I I
      // 2ef: imul
      // 2f0: iadd
      // 2f1: bipush 1
      // 2f2: iadd
      // 2f3: aload 0
      // 2f4: getfield com/finalshell/ui/panel/BM.I I
      // 2f7: aload 15
      // 2f9: invokevirtual com/finalshell/ui/model/EZ.f ()I
      // 2fc: aload 15
      // 2fe: invokevirtual com/finalshell/ui/model/EZ.x ()I
      // 301: isub
      // 302: bipush 1
      // 303: iadd
      // 304: aload 0
      // 305: getfield com/finalshell/ui/panel/BM.I I
      // 308: imul
      // 309: bipush 1
      // 30a: isub
      // 30b: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 30e: aload 2
      // 30f: ifnull 207
      // 312: aload 0
      // 313: iload 11
      // 315: aload 10
      // 317: invokespecial com/finalshell/ui/panel/BM.Z (ILjava/awt/Insets;)I
      // 31a: istore 14
      // 31c: aload 0
      // 31d: iload 11
      // 31f: iload 8
      // 321: aload 10
      // 323: invokespecial com/finalshell/ui/panel/BM.x (IILjava/awt/Insets;)I
      // 326: istore 15
      // 328: aload 0
      // 329: iload 12
      // 32b: aload 10
      // 32d: invokespecial com/finalshell/ui/panel/BM.I (ILjava/awt/Insets;)I
      // 330: istore 16
      // 332: aload 0
      // 333: iload 12
      // 335: iload 9
      // 337: aload 10
      // 339: invokespecial com/finalshell/ui/panel/BM.M (IILjava/awt/Insets;)I
      // 33c: istore 17
      // 33e: aload 0
      // 33f: getfield com/finalshell/ui/panel/BM.R Z
      // 342: aload 2
      // 343: ifnonnull 410
      // 346: ifeq 394
      // 349: goto 350
      // 34c: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34f: athrow
      // 350: aload 3
      // 351: getstatic com/finalshell/ui/panel/BM.K Ljava/awt/Color;
      // 354: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 357: aload 3
      // 358: iload 14
      // 35a: bipush 1
      // 35b: iadd
      // 35c: iload 16
      // 35e: bipush 1
      // 35f: iadd
      // 360: iload 8
      // 362: aload 10
      // 364: getfield java/awt/Insets.left I
      // 367: aload 10
      // 369: getfield java/awt/Insets.right I
      // 36c: iadd
      // 36d: aload 0
      // 36e: getfield com/finalshell/ui/panel/BM.I I
      // 371: imul
      // 372: isub
      // 373: bipush 1
      // 374: isub
      // 375: iload 9
      // 377: aload 10
      // 379: getfield java/awt/Insets.top I
      // 37c: aload 10
      // 37e: getfield java/awt/Insets.bottom I
      // 381: iadd
      // 382: aload 0
      // 383: getfield com/finalshell/ui/panel/BM.I I
      // 386: imul
      // 387: isub
      // 388: bipush 1
      // 389: isub
      // 38a: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 38d: goto 394
      // 390: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 393: athrow
      // 394: aload 3
      // 395: getstatic com/finalshell/ui/panel/BM.M Ljava/awt/Color;
      // 398: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 39b: aload 3
      // 39c: iload 14
      // 39e: iload 12
      // 3a0: iload 14
      // 3a2: iload 7
      // 3a4: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 3a7: aload 3
      // 3a8: iload 15
      // 3aa: iload 12
      // 3ac: iload 15
      // 3ae: iload 7
      // 3b0: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 3b3: aload 3
      // 3b4: iload 11
      // 3b6: iload 16
      // 3b8: iload 6
      // 3ba: iload 16
      // 3bc: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 3bf: aload 3
      // 3c0: iload 11
      // 3c2: iload 17
      // 3c4: iload 6
      // 3c6: iload 17
      // 3c8: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 3cb: aload 3
      // 3cc: getstatic java/awt/Color.BLACK Ljava/awt/Color;
      // 3cf: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 3d2: aload 3
      // 3d3: iload 11
      // 3d5: iload 8
      // 3d7: iadd
      // 3d8: bipush 1
      // 3d9: iadd
      // 3da: iload 16
      // 3dc: bipush 1
      // 3dd: iadd
      // 3de: aload 0
      // 3df: getfield com/finalshell/ui/panel/BM.I I
      // 3e2: iload 17
      // 3e4: iload 16
      // 3e6: isub
      // 3e7: bipush 1
      // 3e8: isub
      // 3e9: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 3ec: aload 3
      // 3ed: iload 14
      // 3ef: bipush 1
      // 3f0: iadd
      // 3f1: iload 12
      // 3f3: iload 9
      // 3f5: iadd
      // 3f6: bipush 1
      // 3f7: iadd
      // 3f8: iload 15
      // 3fa: iload 14
      // 3fc: isub
      // 3fd: bipush 1
      // 3fe: isub
      // 3ff: aload 0
      // 400: getfield com/finalshell/ui/panel/BM.I I
      // 403: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 406: aload 3
      // 407: aload 13
      // 409: invokevirtual java/awt/Graphics2D.setStroke (Ljava/awt/Stroke;)V
      // 40c: aload 0
      // 40d: getfield com/finalshell/ui/panel/BM.m Z
      // 410: aload 2
      // 411: ifnonnull 653
      // 414: ifeq 644
      // 417: goto 41e
      // 41a: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 41d: athrow
      // 41e: aload 3
      // 41f: getstatic java/awt/Color.BLACK Ljava/awt/Color;
      // 422: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 425: aload 0
      // 426: invokespecial com/finalshell/ui/panel/BM.j$List ()Ljava/util/List;
      // 429: astore 18
      // 42b: bipush 0
      // 42c: istore 19
      // 42e: iload 19
      // 430: aload 18
      // 432: invokeinterface java/util/List.size ()I 1
      // 437: bipush 1
      // 438: isub
      // 439: if_icmpge 538
      // 43c: aload 18
      // 43e: iload 19
      // 440: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 445: checkcast java/lang/Integer
      // 448: astore 20
      // 44a: aload 18
      // 44c: iload 19
      // 44e: bipush 1
      // 44f: iadd
      // 450: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 455: checkcast java/lang/Integer
      // 458: astore 21
      // 45a: iload 11
      // 45c: aload 20
      // 45e: invokevirtual java/lang/Integer.intValue ()I
      // 461: aload 0
      // 462: getfield com/finalshell/ui/panel/BM.I I
      // 465: imul
      // 466: iadd
      // 467: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 46a: astore 22
      // 46c: iload 11
      // 46e: aload 21
      // 470: invokevirtual java/lang/Integer.intValue ()I
      // 473: aload 0
      // 474: getfield com/finalshell/ui/panel/BM.I I
      // 477: imul
      // 478: iadd
      // 479: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 47c: astore 23
      // 47e: iload 12
      // 480: aload 0
      // 481: getfield com/finalshell/ui/panel/BM.I I
      // 484: isub
      // 485: sipush 22076
      // 488: ldc2_w 8149415100917051097
      // 48b: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 48e: isub
      // 48f: istore 24
      // 491: iload 12
      // 493: aload 0
      // 494: getfield com/finalshell/ui/panel/BM.I I
      // 497: isub
      // 498: sipush 6494
      // 49b: ldc2_w 5525480869336555952
      // 49e: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 4a1: isub
      // 4a2: istore 25
      // 4a4: aload 3
      // 4a5: aload 22
      // 4a7: invokevirtual java/lang/Integer.intValue ()I
      // 4aa: iload 24
      // 4ac: aload 23
      // 4ae: invokevirtual java/lang/Integer.intValue ()I
      // 4b1: iload 24
      // 4b3: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 4b6: aload 3
      // 4b7: aload 22
      // 4b9: invokevirtual java/lang/Integer.intValue ()I
      // 4bc: iload 24
      // 4be: aload 22
      // 4c0: invokevirtual java/lang/Integer.intValue ()I
      // 4c3: iload 25
      // 4c5: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 4c8: aload 3
      // 4c9: aload 23
      // 4cb: invokevirtual java/lang/Integer.intValue ()I
      // 4ce: iload 24
      // 4d0: aload 23
      // 4d2: invokevirtual java/lang/Integer.intValue ()I
      // 4d5: iload 25
      // 4d7: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 4da: new java/lang/StringBuilder
      // 4dd: dup
      // 4de: invokespecial java/lang/StringBuilder.<init> ()V
      // 4e1: ldc_w ""
      // 4e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4e7: aload 21
      // 4e9: invokevirtual java/lang/Integer.intValue ()I
      // 4ec: aload 20
      // 4ee: invokevirtual java/lang/Integer.intValue ()I
      // 4f1: isub
      // 4f2: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 4f5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4f8: astore 26
      // 4fa: aload 3
      // 4fb: aload 26
      // 4fd: aload 22
      // 4ff: invokevirtual java/lang/Integer.intValue ()I
      // 502: aload 23
      // 504: invokevirtual java/lang/Integer.intValue ()I
      // 507: iadd
      // 508: bipush 2
      // 509: idiv
      // 50a: aload 4
      // 50c: aload 26
      // 50e: invokestatic com/finalshell/core/GA.C (Ljava/awt/FontMetrics;Ljava/lang/String;)I
      // 511: iadd
      // 512: iload 12
      // 514: aload 0
      // 515: getfield com/finalshell/ui/panel/BM.I I
      // 518: isub
      // 519: sipush 21813
      // 51c: ldc2_w 4553651928792264132
      // 51f: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 522: isub
      // 523: invokevirtual java/awt/Graphics2D.drawString (Ljava/lang/String;II)V
      // 526: iinc 19 1
      // 529: aload 2
      // 52a: ifnonnull 644
      // 52d: aload 2
      // 52e: ifnull 42e
      // 531: goto 538
      // 534: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 537: athrow
      // 538: aload 0
      // 539: invokespecial com/finalshell/ui/panel/BM.H ()Ljava/util/List;
      // 53c: astore 19
      // 53e: bipush 0
      // 53f: istore 20
      // 541: iload 20
      // 543: aload 19
      // 545: invokeinterface java/util/List.size ()I 1
      // 54a: bipush 1
      // 54b: isub
      // 54c: if_icmpge 644
      // 54f: aload 19
      // 551: iload 20
      // 553: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 558: checkcast java/lang/Integer
      // 55b: astore 21
      // 55d: aload 19
      // 55f: iload 20
      // 561: bipush 1
      // 562: iadd
      // 563: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 568: checkcast java/lang/Integer
      // 56b: astore 22
      // 56d: iload 12
      // 56f: aload 21
      // 571: invokevirtual java/lang/Integer.intValue ()I
      // 574: aload 0
      // 575: getfield com/finalshell/ui/panel/BM.I I
      // 578: imul
      // 579: iadd
      // 57a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 57d: astore 23
      // 57f: iload 12
      // 581: aload 22
      // 583: invokevirtual java/lang/Integer.intValue ()I
      // 586: aload 0
      // 587: getfield com/finalshell/ui/panel/BM.I I
      // 58a: imul
      // 58b: iadd
      // 58c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 58f: astore 24
      // 591: iload 11
      // 593: aload 0
      // 594: getfield com/finalshell/ui/panel/BM.I I
      // 597: isub
      // 598: sipush 22076
      // 59b: ldc2_w 8149415100917051097
      // 59e: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 5a1: isub
      // 5a2: istore 25
      // 5a4: iload 11
      // 5a6: aload 0
      // 5a7: getfield com/finalshell/ui/panel/BM.I I
      // 5aa: isub
      // 5ab: sipush 16783
      // 5ae: ldc2_w 3498272914205604200
      // 5b1: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 5b4: isub
      // 5b5: istore 26
      // 5b7: aload 3
      // 5b8: iload 25
      // 5ba: aload 23
      // 5bc: invokevirtual java/lang/Integer.intValue ()I
      // 5bf: iload 25
      // 5c1: aload 24
      // 5c3: invokevirtual java/lang/Integer.intValue ()I
      // 5c6: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 5c9: aload 3
      // 5ca: iload 25
      // 5cc: aload 23
      // 5ce: invokevirtual java/lang/Integer.intValue ()I
      // 5d1: iload 26
      // 5d3: aload 23
      // 5d5: invokevirtual java/lang/Integer.intValue ()I
      // 5d8: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 5db: aload 3
      // 5dc: iload 25
      // 5de: aload 24
      // 5e0: invokevirtual java/lang/Integer.intValue ()I
      // 5e3: iload 26
      // 5e5: aload 24
      // 5e7: invokevirtual java/lang/Integer.intValue ()I
      // 5ea: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 5ed: new java/lang/StringBuilder
      // 5f0: dup
      // 5f1: invokespecial java/lang/StringBuilder.<init> ()V
      // 5f4: ldc_w ""
      // 5f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5fa: aload 22
      // 5fc: invokevirtual java/lang/Integer.intValue ()I
      // 5ff: aload 21
      // 601: invokevirtual java/lang/Integer.intValue ()I
      // 604: isub
      // 605: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 608: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 60b: astore 27
      // 60d: aload 3
      // 60e: aload 27
      // 610: iload 25
      // 612: aload 4
      // 614: aload 27
      // 616: invokevirtual java/awt/FontMetrics.stringWidth (Ljava/lang/String;)I
      // 619: isub
      // 61a: bipush 5
      // 61b: isub
      // 61c: aload 23
      // 61e: invokevirtual java/lang/Integer.intValue ()I
      // 621: aload 24
      // 623: invokevirtual java/lang/Integer.intValue ()I
      // 626: iadd
      // 627: bipush 2
      // 628: idiv
      // 629: aload 4
      // 62b: invokestatic com/finalshell/core/GA.d (Ljava/awt/FontMetrics;)I
      // 62e: iadd
      // 62f: invokevirtual java/awt/Graphics2D.drawString (Ljava/lang/String;II)V
      // 632: iinc 20 1
      // 635: aload 2
      // 636: ifnonnull 66e
      // 639: aload 2
      // 63a: ifnull 541
      // 63d: goto 644
      // 640: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 643: athrow
      // 644: aload 0
      // 645: aload 2
      // 646: ifnonnull 657
      // 649: getfield com/finalshell/ui/panel/BM.a Z
      // 64c: goto 653
      // 64f: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 652: athrow
      // 653: ifeq 66e
      // 656: aload 0
      // 657: aload 3
      // 658: new java/awt/Point
      // 65b: dup
      // 65c: iload 11
      // 65e: bipush 1
      // 65f: isub
      // 660: iload 12
      // 662: bipush 1
      // 663: isub
      // 664: invokespecial java/awt/Point.<init> (II)V
      // 667: iload 11
      // 669: iload 12
      // 66b: invokespecial com/finalshell/ui/panel/BM.A (Ljava/awt/Graphics2D;Ljava/awt/Point;II)V
      // 66e: return
   }

   public void A(Graphics2D param1, Point param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual com/finalshell/ui/panel/BM.getVisibleRect ()Ljava/awt/Rectangle;
      // 004: astore 6
      // 006: aload 0
      // 007: invokespecial com/finalshell/ui/panel/BM.d$int ()I
      // 00a: istore 7
      // 00c: aload 0
      // 00d: invokespecial com/finalshell/ui/panel/BM.j$int ()I
      // 010: istore 8
      // 012: aload 0
      // 013: getfield com/finalshell/ui/panel/BM.I I
      // 016: istore 9
      // 018: invokestatic com/finalshell/ui/panel/KD3.u ()[I
      // 01b: aload 1
      // 01c: new java/awt/GradientPaint
      // 01f: dup
      // 020: aload 6
      // 022: getfield java/awt/Rectangle.x I
      // 025: i2f
      // 026: aload 6
      // 028: getfield java/awt/Rectangle.y I
      // 02b: i2f
      // 02c: getstatic com/finalshell/ui/panel/BM.N Ljava/awt/Color;
      // 02f: aload 6
      // 031: getfield java/awt/Rectangle.x I
      // 034: i2f
      // 035: aload 6
      // 037: getfield java/awt/Rectangle.y I
      // 03a: sipush 31764
      // 03d: ldc2_w 7349090917823628530
      // 040: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 043: iadd
      // 044: i2f
      // 045: getstatic com/finalshell/ui/panel/BM.T Ljava/awt/Color;
      // 048: invokespecial java/awt/GradientPaint.<init> (FFLjava/awt/Color;FFLjava/awt/Color;)V
      // 04b: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 04e: astore 5
      // 050: aload 1
      // 051: aload 6
      // 053: getfield java/awt/Rectangle.x I
      // 056: aload 6
      // 058: getfield java/awt/Rectangle.y I
      // 05b: aload 6
      // 05d: getfield java/awt/Rectangle.width I
      // 060: sipush 23435
      // 063: ldc2_w 3919341184167535476
      // 066: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 069: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 06c: aload 1
      // 06d: new java/awt/GradientPaint
      // 070: dup
      // 071: aload 6
      // 073: getfield java/awt/Rectangle.x I
      // 076: i2f
      // 077: aload 6
      // 079: getfield java/awt/Rectangle.y I
      // 07c: i2f
      // 07d: getstatic com/finalshell/ui/panel/BM.N Ljava/awt/Color;
      // 080: aload 6
      // 082: getfield java/awt/Rectangle.x I
      // 085: sipush 23435
      // 088: ldc2_w 3919341184167535476
      // 08b: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 08e: iadd
      // 08f: i2f
      // 090: aload 6
      // 092: getfield java/awt/Rectangle.y I
      // 095: i2f
      // 096: getstatic com/finalshell/ui/panel/BM.T Ljava/awt/Color;
      // 099: invokespecial java/awt/GradientPaint.<init> (FFLjava/awt/Color;FFLjava/awt/Color;)V
      // 09c: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 09f: aload 1
      // 0a0: aload 6
      // 0a2: getfield java/awt/Rectangle.x I
      // 0a5: aload 6
      // 0a7: getfield java/awt/Rectangle.y I
      // 0aa: sipush 23435
      // 0ad: ldc2_w 3919341184167535476
      // 0b0: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 0b3: aload 6
      // 0b5: getfield java/awt/Rectangle.height I
      // 0b8: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 0bb: aload 0
      // 0bc: aload 5
      // 0be: ifnonnull 0e9
      // 0c1: getfield com/finalshell/ui/panel/BM.U Z
      // 0c4: ifne 0e8
      // 0c7: goto 0ce
      // 0ca: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: getfield com/finalshell/ui/panel/BM.i Z
      // 0d2: aload 5
      // 0d4: ifnonnull 314
      // 0d7: goto 0de
      // 0da: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0dd: athrow
      // 0de: ifeq 2fa
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: invokestatic com/finalshell/core/FN.f$Point (Ljava/awt/Component;)Ljava/awt/Point;
      // 0ec: astore 10
      // 0ee: aload 10
      // 0f0: getfield java/awt/Point.x I
      // 0f3: aload 6
      // 0f5: getfield java/awt/Rectangle.x I
      // 0f8: sipush 23435
      // 0fb: ldc2_w 3919341184167535476
      // 0fe: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 101: iadd
      // 102: aload 5
      // 104: ifnonnull 313
      // 107: if_icmple 2fa
      // 10a: goto 111
      // 10d: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 110: athrow
      // 111: aload 10
      // 113: getfield java/awt/Point.x I
      // 116: aload 6
      // 118: getfield java/awt/Rectangle.x I
      // 11b: aload 6
      // 11d: getfield java/awt/Rectangle.width I
      // 120: iadd
      // 121: aload 5
      // 123: ifnonnull 313
      // 126: goto 12d
      // 129: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12c: athrow
      // 12d: if_icmpge 2fa
      // 130: goto 137
      // 133: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 136: athrow
      // 137: aload 10
      // 139: getfield java/awt/Point.y I
      // 13c: aload 6
      // 13e: getfield java/awt/Rectangle.y I
      // 141: sipush 23435
      // 144: ldc2_w 3919341184167535476
      // 147: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 14a: iadd
      // 14b: aload 5
      // 14d: ifnonnull 313
      // 150: goto 157
      // 153: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 156: athrow
      // 157: if_icmple 2fa
      // 15a: goto 161
      // 15d: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 160: athrow
      // 161: aload 10
      // 163: getfield java/awt/Point.y I
      // 166: aload 6
      // 168: getfield java/awt/Rectangle.y I
      // 16b: aload 6
      // 16d: getfield java/awt/Rectangle.height I
      // 170: iadd
      // 171: aload 5
      // 173: ifnonnull 313
      // 176: goto 17d
      // 179: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17c: athrow
      // 17d: if_icmpge 2fa
      // 180: goto 187
      // 183: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 186: athrow
      // 187: aload 10
      // 189: getfield java/awt/Point.x I
      // 18c: iload 3
      // 18d: isub
      // 18e: aload 0
      // 18f: getfield com/finalshell/ui/panel/BM.I I
      // 192: idiv
      // 193: aload 10
      // 195: getfield java/awt/Point.x I
      // 198: aload 5
      // 19a: ifnonnull 1b7
      // 19d: goto 1a4
      // 1a0: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a3: athrow
      // 1a4: iload 3
      // 1a5: if_icmplt 1ba
      // 1a8: goto 1af
      // 1ab: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ae: athrow
      // 1af: bipush 0
      // 1b0: goto 1b7
      // 1b3: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b6: athrow
      // 1b7: goto 1bb
      // 1ba: bipush 1
      // 1bb: isub
      // 1bc: istore 11
      // 1be: aload 10
      // 1c0: getfield java/awt/Point.y I
      // 1c3: iload 4
      // 1c5: isub
      // 1c6: aload 0
      // 1c7: getfield com/finalshell/ui/panel/BM.I I
      // 1ca: idiv
      // 1cb: aload 10
      // 1cd: getfield java/awt/Point.y I
      // 1d0: aload 5
      // 1d2: ifnonnull 1e9
      // 1d5: iload 4
      // 1d7: if_icmplt 1ec
      // 1da: goto 1e1
      // 1dd: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e0: athrow
      // 1e1: bipush 0
      // 1e2: goto 1e9
      // 1e5: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e8: athrow
      // 1e9: goto 1ed
      // 1ec: bipush 1
      // 1ed: isub
      // 1ee: istore 12
      // 1f0: aload 1
      // 1f1: ldc_w 0.5
      // 1f4: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 1f7: invokestatic com/finalshell/core/RV.p (Ljava/awt/Graphics2D;Ljava/lang/Float;)Ljava/awt/Composite;
      // 1fa: astore 13
      // 1fc: aload 0
      // 1fd: getfield com/finalshell/ui/panel/BM.U Z
      // 200: aload 5
      // 202: ifnonnull 260
      // 205: ifeq 25c
      // 208: goto 20f
      // 20b: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20e: athrow
      // 20f: aload 1
      // 210: getstatic java/awt/Color.RED Ljava/awt/Color;
      // 213: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 216: aload 1
      // 217: iload 3
      // 218: iload 11
      // 21a: aload 0
      // 21b: getfield com/finalshell/ui/panel/BM.I I
      // 21e: imul
      // 21f: iadd
      // 220: aload 6
      // 222: getfield java/awt/Rectangle.y I
      // 225: aload 0
      // 226: getfield com/finalshell/ui/panel/BM.I I
      // 229: sipush 23435
      // 22c: ldc2_w 3919341184167535476
      // 22f: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 232: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 235: aload 1
      // 236: aload 6
      // 238: getfield java/awt/Rectangle.x I
      // 23b: iload 4
      // 23d: iload 12
      // 23f: aload 0
      // 240: getfield com/finalshell/ui/panel/BM.I I
      // 243: imul
      // 244: iadd
      // 245: sipush 23435
      // 248: ldc2_w 3919341184167535476
      // 24b: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 24e: aload 0
      // 24f: getfield com/finalshell/ui/panel/BM.I I
      // 252: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 255: goto 25c
      // 258: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25b: athrow
      // 25c: aload 0
      // 25d: getfield com/finalshell/ui/panel/BM.i Z
      // 260: ifeq 2f4
      // 263: aload 1
      // 264: new java/awt/Rectangle
      // 267: dup
      // 268: aload 6
      // 26a: getfield java/awt/Rectangle.x I
      // 26d: sipush 23435
      // 270: ldc2_w 3919341184167535476
      // 273: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 276: iadd
      // 277: aload 6
      // 279: getfield java/awt/Rectangle.y I
      // 27c: sipush 23435
      // 27f: ldc2_w 3919341184167535476
      // 282: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 285: iadd
      // 286: aload 6
      // 288: getfield java/awt/Rectangle.width I
      // 28b: sipush 23435
      // 28e: ldc2_w 3919341184167535476
      // 291: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 294: isub
      // 295: aload 6
      // 297: getfield java/awt/Rectangle.height I
      // 29a: sipush 23435
      // 29d: ldc2_w 3919341184167535476
      // 2a0: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 2a3: isub
      // 2a4: invokespecial java/awt/Rectangle.<init> (IIII)V
      // 2a7: aload 0
      // 2a8: getfield com/finalshell/ui/panel/BM.i Z
      // 2ab: invokestatic com/finalshell/core/RV.I (Ljava/awt/Graphics2D;Ljava/awt/Shape;Z)Ljava/awt/Shape;
      // 2ae: astore 14
      // 2b0: aload 1
      // 2b1: getstatic java/awt/Color.RED Ljava/awt/Color;
      // 2b4: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 2b7: aload 1
      // 2b8: iload 3
      // 2b9: iload 11
      // 2bb: aload 0
      // 2bc: getfield com/finalshell/ui/panel/BM.I I
      // 2bf: imul
      // 2c0: iadd
      // 2c1: aload 6
      // 2c3: getfield java/awt/Rectangle.y I
      // 2c6: aload 0
      // 2c7: getfield com/finalshell/ui/panel/BM.I I
      // 2ca: aload 6
      // 2cc: getfield java/awt/Rectangle.height I
      // 2cf: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 2d2: aload 1
      // 2d3: aload 6
      // 2d5: getfield java/awt/Rectangle.x I
      // 2d8: iload 4
      // 2da: iload 12
      // 2dc: aload 0
      // 2dd: getfield com/finalshell/ui/panel/BM.I I
      // 2e0: imul
      // 2e1: iadd
      // 2e2: aload 6
      // 2e4: getfield java/awt/Rectangle.width I
      // 2e7: aload 0
      // 2e8: getfield com/finalshell/ui/panel/BM.I I
      // 2eb: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 2ee: aload 1
      // 2ef: aload 14
      // 2f1: invokestatic com/finalshell/core/RV.w (Ljava/awt/Graphics2D;Ljava/awt/Shape;)V
      // 2f4: aload 1
      // 2f5: aload 13
      // 2f7: invokestatic com/finalshell/core/RV.c (Ljava/awt/Graphics2D;Ljava/awt/Composite;)V
      // 2fa: aload 1
      // 2fb: getstatic java/awt/Color.BLACK Ljava/awt/Color;
      // 2fe: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 301: aload 6
      // 303: getfield java/awt/Rectangle.x I
      // 306: aload 2
      // 307: getfield java/awt/Point.x I
      // 30a: aload 6
      // 30c: getfield java/awt/Rectangle.x I
      // 30f: isub
      // 310: iload 7
      // 312: irem
      // 313: iadd
      // 314: istore 11
      // 316: iload 11
      // 318: istore 12
      // 31a: iload 12
      // 31c: aload 6
      // 31e: getfield java/awt/Rectangle.x I
      // 321: aload 6
      // 323: getfield java/awt/Rectangle.width I
      // 326: iadd
      // 327: if_icmpgt 372
      // 32a: aload 1
      // 32b: iload 12
      // 32d: aload 6
      // 32f: getfield java/awt/Rectangle.y I
      // 332: sipush 23435
      // 335: ldc2_w 3919341184167535476
      // 338: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 33b: iadd
      // 33c: sipush 4765
      // 33f: ldc2_w 7423047014936652387
      // 342: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 345: isub
      // 346: iload 12
      // 348: aload 6
      // 34a: getfield java/awt/Rectangle.y I
      // 34d: sipush 23435
      // 350: ldc2_w 3919341184167535476
      // 353: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 356: iadd
      // 357: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 35a: iload 12
      // 35c: iload 7
      // 35e: iadd
      // 35f: istore 12
      // 361: aload 5
      // 363: ifnonnull 387
      // 366: aload 5
      // 368: ifnull 31a
      // 36b: goto 372
      // 36e: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 371: athrow
      // 372: aload 6
      // 374: getfield java/awt/Rectangle.x I
      // 377: aload 2
      // 378: getfield java/awt/Point.x I
      // 37b: aload 6
      // 37d: getfield java/awt/Rectangle.x I
      // 380: isub
      // 381: iload 8
      // 383: irem
      // 384: iadd
      // 385: istore 11
      // 387: iload 11
      // 389: istore 12
      // 38b: iload 12
      // 38d: aload 6
      // 38f: getfield java/awt/Rectangle.x I
      // 392: aload 6
      // 394: getfield java/awt/Rectangle.width I
      // 397: iadd
      // 398: if_icmpgt 425
      // 39b: aload 1
      // 39c: iload 12
      // 39e: aload 6
      // 3a0: getfield java/awt/Rectangle.y I
      // 3a3: sipush 23435
      // 3a6: ldc2_w 3919341184167535476
      // 3a9: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 3ac: iadd
      // 3ad: sipush 15911
      // 3b0: ldc2_w 1081976759275587272
      // 3b3: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 3b6: isub
      // 3b7: iload 12
      // 3b9: aload 6
      // 3bb: getfield java/awt/Rectangle.y I
      // 3be: sipush 23435
      // 3c1: ldc2_w 3919341184167535476
      // 3c4: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 3c7: iadd
      // 3c8: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 3cb: new java/lang/StringBuilder
      // 3ce: dup
      // 3cf: invokespecial java/lang/StringBuilder.<init> ()V
      // 3d2: ldc_w ""
      // 3d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d8: iload 12
      // 3da: aload 2
      // 3db: getfield java/awt/Point.x I
      // 3de: isub
      // 3df: iload 9
      // 3e1: idiv
      // 3e2: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 3e5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3e8: astore 10
      // 3ea: aload 1
      // 3eb: aload 10
      // 3ed: iload 12
      // 3ef: bipush 2
      // 3f0: iadd
      // 3f1: aload 6
      // 3f3: getfield java/awt/Rectangle.y I
      // 3f6: sipush 23435
      // 3f9: ldc2_w 3919341184167535476
      // 3fc: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 3ff: iadd
      // 400: sipush 26546
      // 403: ldc2_w 7026889799891279681
      // 406: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 409: isub
      // 40a: invokevirtual java/awt/Graphics2D.drawString (Ljava/lang/String;II)V
      // 40d: iload 12
      // 40f: iload 8
      // 411: iadd
      // 412: istore 12
      // 414: aload 5
      // 416: ifnonnull 47d
      // 419: aload 5
      // 41b: ifnull 38b
      // 41e: goto 425
      // 421: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 424: athrow
      // 425: aload 1
      // 426: getstatic java/awt/Color.BLACK Ljava/awt/Color;
      // 429: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 42c: aload 1
      // 42d: aload 6
      // 42f: getfield java/awt/Rectangle.x I
      // 432: sipush 23435
      // 435: ldc2_w 3919341184167535476
      // 438: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 43b: iadd
      // 43c: aload 6
      // 43e: getfield java/awt/Rectangle.y I
      // 441: sipush 23435
      // 444: ldc2_w 3919341184167535476
      // 447: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 44a: iadd
      // 44b: aload 6
      // 44d: getfield java/awt/Rectangle.x I
      // 450: aload 6
      // 452: getfield java/awt/Rectangle.width I
      // 455: iadd
      // 456: aload 6
      // 458: getfield java/awt/Rectangle.y I
      // 45b: sipush 23435
      // 45e: ldc2_w 3919341184167535476
      // 461: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 464: iadd
      // 465: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 468: aload 6
      // 46a: getfield java/awt/Rectangle.y I
      // 46d: aload 2
      // 46e: getfield java/awt/Point.y I
      // 471: aload 6
      // 473: getfield java/awt/Rectangle.y I
      // 476: isub
      // 477: iload 7
      // 479: irem
      // 47a: iadd
      // 47b: istore 11
      // 47d: iload 11
      // 47f: istore 12
      // 481: iload 12
      // 483: aload 6
      // 485: getfield java/awt/Rectangle.y I
      // 488: aload 6
      // 48a: getfield java/awt/Rectangle.height I
      // 48d: iadd
      // 48e: if_icmpgt 4d9
      // 491: aload 1
      // 492: aload 6
      // 494: getfield java/awt/Rectangle.x I
      // 497: sipush 23435
      // 49a: ldc2_w 3919341184167535476
      // 49d: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 4a0: iadd
      // 4a1: sipush 9526
      // 4a4: ldc2_w 8753084625105821123
      // 4a7: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 4aa: isub
      // 4ab: iload 12
      // 4ad: aload 6
      // 4af: getfield java/awt/Rectangle.x I
      // 4b2: sipush 23435
      // 4b5: ldc2_w 3919341184167535476
      // 4b8: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 4bb: iadd
      // 4bc: iload 12
      // 4be: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 4c1: iload 12
      // 4c3: iload 7
      // 4c5: iadd
      // 4c6: istore 12
      // 4c8: aload 5
      // 4ca: ifnonnull 4ee
      // 4cd: aload 5
      // 4cf: ifnull 481
      // 4d2: goto 4d9
      // 4d5: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4d8: athrow
      // 4d9: aload 6
      // 4db: getfield java/awt/Rectangle.y I
      // 4de: aload 2
      // 4df: getfield java/awt/Point.y I
      // 4e2: aload 6
      // 4e4: getfield java/awt/Rectangle.y I
      // 4e7: isub
      // 4e8: iload 8
      // 4ea: irem
      // 4eb: iadd
      // 4ec: istore 11
      // 4ee: iload 11
      // 4f0: istore 12
      // 4f2: iload 12
      // 4f4: aload 6
      // 4f6: getfield java/awt/Rectangle.y I
      // 4f9: aload 6
      // 4fb: getfield java/awt/Rectangle.height I
      // 4fe: iadd
      // 4ff: if_icmpgt 5b0
      // 502: aload 1
      // 503: aload 6
      // 505: getfield java/awt/Rectangle.x I
      // 508: sipush 23435
      // 50b: ldc2_w 3919341184167535476
      // 50e: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 511: iadd
      // 512: sipush 21813
      // 515: ldc2_w 4553651928792264132
      // 518: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 51b: isub
      // 51c: iload 12
      // 51e: aload 6
      // 520: getfield java/awt/Rectangle.x I
      // 523: sipush 23435
      // 526: ldc2_w 3919341184167535476
      // 529: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 52c: iadd
      // 52d: iload 12
      // 52f: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 532: new java/lang/StringBuilder
      // 535: dup
      // 536: invokespecial java/lang/StringBuilder.<init> ()V
      // 539: ldc_w ""
      // 53c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 53f: iload 12
      // 541: aload 2
      // 542: getfield java/awt/Point.y I
      // 545: isub
      // 546: iload 9
      // 548: idiv
      // 549: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 54c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 54f: astore 10
      // 551: aload 1
      // 552: ldc2_w -90.0
      // 555: invokestatic java/lang/Math.toRadians (D)D
      // 558: invokevirtual java/awt/Graphics2D.rotate (D)V
      // 55b: aload 1
      // 55c: aload 10
      // 55e: bipush 1
      // 55f: iload 12
      // 561: isub
      // 562: aload 0
      // 563: aload 0
      // 564: invokevirtual com/finalshell/ui/panel/BM.getFont ()Ljava/awt/Font;
      // 567: invokevirtual com/finalshell/ui/panel/BM.getFontMetrics (Ljava/awt/Font;)Ljava/awt/FontMetrics;
      // 56a: aload 10
      // 56c: invokevirtual java/awt/FontMetrics.stringWidth (Ljava/lang/String;)I
      // 56f: isub
      // 570: bipush 2
      // 571: isub
      // 572: aload 6
      // 574: getfield java/awt/Rectangle.x I
      // 577: sipush 23435
      // 57a: ldc2_w 3919341184167535476
      // 57d: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 580: iadd
      // 581: sipush 22076
      // 584: ldc2_w 8149415100917051097
      // 587: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 58a: isub
      // 58b: invokevirtual java/awt/Graphics2D.drawString (Ljava/lang/String;II)V
      // 58e: aload 1
      // 58f: ldc2_w 90.0
      // 592: invokestatic java/lang/Math.toRadians (D)D
      // 595: invokevirtual java/awt/Graphics2D.rotate (D)V
      // 598: iload 12
      // 59a: iload 8
      // 59c: iadd
      // 59d: istore 12
      // 59f: aload 5
      // 5a1: ifnonnull 61a
      // 5a4: aload 5
      // 5a6: ifnull 4f2
      // 5a9: goto 5b0
      // 5ac: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5af: athrow
      // 5b0: aload 1
      // 5b1: getstatic java/awt/Color.BLACK Ljava/awt/Color;
      // 5b4: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 5b7: aload 1
      // 5b8: aload 6
      // 5ba: getfield java/awt/Rectangle.x I
      // 5bd: sipush 23435
      // 5c0: ldc2_w 3919341184167535476
      // 5c3: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 5c6: iadd
      // 5c7: aload 6
      // 5c9: getfield java/awt/Rectangle.y I
      // 5cc: sipush 23435
      // 5cf: ldc2_w 3919341184167535476
      // 5d2: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 5d5: iadd
      // 5d6: aload 6
      // 5d8: getfield java/awt/Rectangle.x I
      // 5db: sipush 23435
      // 5de: ldc2_w 3919341184167535476
      // 5e1: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 5e4: iadd
      // 5e5: aload 6
      // 5e7: getfield java/awt/Rectangle.y I
      // 5ea: aload 6
      // 5ec: getfield java/awt/Rectangle.height I
      // 5ef: iadd
      // 5f0: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 5f3: aload 1
      // 5f4: getstatic java/awt/Color.WHITE Ljava/awt/Color;
      // 5f7: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 5fa: aload 1
      // 5fb: aload 6
      // 5fd: getfield java/awt/Rectangle.x I
      // 600: aload 6
      // 602: getfield java/awt/Rectangle.y I
      // 605: sipush 23435
      // 608: ldc2_w 3919341184167535476
      // 60b: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 60e: sipush 23435
      // 611: ldc2_w 3919341184167535476
      // 614: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 617: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 61a: new java/lang/StringBuilder
      // 61d: dup
      // 61e: invokespecial java/lang/StringBuilder.<init> ()V
      // 621: aload 0
      // 622: getfield com/finalshell/ui/panel/BM.I I
      // 625: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 628: ldc_w "x"
      // 62b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 62e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 631: astore 12
      // 633: aload 1
      // 634: invokevirtual java/awt/Graphics2D.getFontMetrics ()Ljava/awt/FontMetrics;
      // 637: aload 12
      // 639: invokestatic com/finalshell/core/GA.A (Ljava/awt/FontMetrics;Ljava/lang/String;)Ljava/awt/Point;
      // 63c: astore 13
      // 63e: aload 1
      // 63f: getstatic java/awt/Color.DARK_GRAY Ljava/awt/Color;
      // 642: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 645: aload 1
      // 646: aload 12
      // 648: aload 6
      // 64a: getfield java/awt/Rectangle.x I
      // 64d: sipush 22076
      // 650: ldc2_w 8149415100917051097
      // 653: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 656: iadd
      // 657: aload 13
      // 659: getfield java/awt/Point.x I
      // 65c: iadd
      // 65d: aload 6
      // 65f: getfield java/awt/Rectangle.y I
      // 662: sipush 22076
      // 665: ldc2_w 8149415100917051097
      // 668: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 66b: iadd
      // 66c: aload 13
      // 66e: getfield java/awt/Point.y I
      // 671: iadd
      // 672: invokevirtual java/awt/Graphics2D.drawString (Ljava/lang/String;II)V
      // 675: aload 1
      // 676: getstatic java/awt/Color.BLACK Ljava/awt/Color;
      // 679: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 67c: aload 1
      // 67d: aload 6
      // 67f: getfield java/awt/Rectangle.x I
      // 682: sipush 23435
      // 685: ldc2_w 3919341184167535476
      // 688: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 68b: iadd
      // 68c: aload 6
      // 68e: getfield java/awt/Rectangle.y I
      // 691: aload 6
      // 693: getfield java/awt/Rectangle.x I
      // 696: sipush 23435
      // 699: ldc2_w 3919341184167535476
      // 69c: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 69f: iadd
      // 6a0: aload 6
      // 6a2: getfield java/awt/Rectangle.y I
      // 6a5: sipush 23435
      // 6a8: ldc2_w 3919341184167535476
      // 6ab: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 6ae: iadd
      // 6af: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 6b2: aload 1
      // 6b3: aload 6
      // 6b5: getfield java/awt/Rectangle.x I
      // 6b8: aload 6
      // 6ba: getfield java/awt/Rectangle.y I
      // 6bd: sipush 23435
      // 6c0: ldc2_w 3919341184167535476
      // 6c3: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 6c6: iadd
      // 6c7: aload 6
      // 6c9: getfield java/awt/Rectangle.x I
      // 6cc: sipush 23435
      // 6cf: ldc2_w 3919341184167535476
      // 6d2: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 6d5: iadd
      // 6d6: aload 6
      // 6d8: getfield java/awt/Rectangle.y I
      // 6db: sipush 23435
      // 6de: ldc2_w 3919341184167535476
      // 6e1: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 6e4: iadd
      // 6e5: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 6e8: return
   }

   public int j$int() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/KD3.u ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/ui/panel/BM.I I
      // 08: aload 1
      // 09: ifnonnull 9c
      // 0c: tableswitch 138 1 6 44 63 78 93 108 123
      // 34: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 37: athrow
      // 38: aload 0
      // 39: getfield com/finalshell/ui/panel/BM.I I
      // 3c: sipush 14849
      // 3f: ldc2_w 8130857217250263805
      // 42: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 45: imul
      // 46: ireturn
      // 47: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield com/finalshell/ui/panel/BM.I I
      // 4f: sipush 23435
      // 52: ldc2_w 3919341184167535476
      // 55: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 58: imul
      // 59: ireturn
      // 5a: aload 0
      // 5b: getfield com/finalshell/ui/panel/BM.I I
      // 5e: sipush 23435
      // 61: ldc2_w 3919341184167535476
      // 64: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 67: imul
      // 68: ireturn
      // 69: aload 0
      // 6a: getfield com/finalshell/ui/panel/BM.I I
      // 6d: sipush 22076
      // 70: ldc2_w 8149415100917051097
      // 73: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 76: imul
      // 77: ireturn
      // 78: aload 0
      // 79: getfield com/finalshell/ui/panel/BM.I I
      // 7c: sipush 22076
      // 7f: ldc2_w 8149415100917051097
      // 82: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 85: imul
      // 86: ireturn
      // 87: aload 0
      // 88: getfield com/finalshell/ui/panel/BM.I I
      // 8b: sipush 22076
      // 8e: ldc2_w 8149415100917051097
      // 91: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 94: imul
      // 95: ireturn
      // 96: aload 0
      // 97: getfield com/finalshell/ui/panel/BM.I I
      // 9a: bipush 5
      // 9b: imul
      // 9c: ireturn
   }

   public int d$int() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/KD3.u ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/ui/panel/BM.I I
      // 08: aload 1
      // 09: ifnonnull 66
      // 0c: tableswitch 86 1 6 44 55 62 69 76 81
      // 34: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 37: athrow
      // 38: aload 0
      // 39: getfield com/finalshell/ui/panel/BM.I I
      // 3c: bipush 5
      // 3d: imul
      // 3e: ireturn
      // 3f: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42: athrow
      // 43: aload 0
      // 44: getfield com/finalshell/ui/panel/BM.I I
      // 47: bipush 5
      // 48: imul
      // 49: ireturn
      // 4a: aload 0
      // 4b: getfield com/finalshell/ui/panel/BM.I I
      // 4e: bipush 2
      // 4f: imul
      // 50: ireturn
      // 51: aload 0
      // 52: getfield com/finalshell/ui/panel/BM.I I
      // 55: bipush 2
      // 56: imul
      // 57: ireturn
      // 58: aload 0
      // 59: getfield com/finalshell/ui/panel/BM.I I
      // 5c: ireturn
      // 5d: aload 0
      // 5e: getfield com/finalshell/ui/panel/BM.I I
      // 61: ireturn
      // 62: aload 0
      // 63: getfield com/finalshell/ui/panel/BM.I I
      // 66: ireturn
   }

   public List j$List() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/KD3.u ()[I
      // 003: new java/util/ArrayList
      // 006: dup
      // 007: invokespecial java/util/ArrayList.<init> ()V
      // 00a: astore 2
      // 00b: astore 1
      // 00c: aload 0
      // 00d: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 010: invokevirtual com/finalshell/core/PF3.U$List ()Ljava/util/List;
      // 013: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 018: astore 3
      // 019: aload 3
      // 01a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 01f: ifeq 099
      // 022: aload 3
      // 023: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 028: checkcast com/finalshell/ui/model/EZ
      // 02b: astore 4
      // 02d: aload 2
      // 02e: aload 4
      // 030: invokevirtual com/finalshell/ui/model/EZ.x ()I
      // 033: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 036: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 03b: aload 1
      // 03c: ifnonnull 06f
      // 03f: ifne 05f
      // 042: goto 049
      // 045: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 048: athrow
      // 049: aload 2
      // 04a: aload 4
      // 04c: invokevirtual com/finalshell/ui/model/EZ.x ()I
      // 04f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 052: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 057: pop
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05e: athrow
      // 05f: aload 2
      // 060: aload 4
      // 062: invokevirtual com/finalshell/ui/model/EZ.f ()I
      // 065: bipush 1
      // 066: iadd
      // 067: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 06a: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 06f: aload 1
      // 070: ifnonnull 094
      // 073: ifne 095
      // 076: goto 07d
      // 079: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07c: athrow
      // 07d: aload 2
      // 07e: aload 4
      // 080: invokevirtual com/finalshell/ui/model/EZ.f ()I
      // 083: bipush 1
      // 084: iadd
      // 085: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 088: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 08d: goto 094
      // 090: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 093: athrow
      // 094: pop
      // 095: aload 1
      // 096: ifnull 019
      // 099: aload 0
      // 09a: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 09d: invokevirtual com/finalshell/core/PF3.U$Insets ()Ljava/awt/Insets;
      // 0a0: astore 3
      // 0a1: aload 2
      // 0a2: aload 3
      // 0a3: getfield java/awt/Insets.left I
      // 0a6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a9: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 0ae: aload 1
      // 0af: ifnonnull 0f1
      // 0b2: ifne 0d1
      // 0b5: goto 0bc
      // 0b8: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bb: athrow
      // 0bc: aload 2
      // 0bd: aload 3
      // 0be: getfield java/awt/Insets.left I
      // 0c1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0c9: pop
      // 0ca: goto 0d1
      // 0cd: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d0: athrow
      // 0d1: aload 2
      // 0d2: aload 1
      // 0d3: ifnonnull 116
      // 0d6: aload 0
      // 0d7: invokevirtual com/finalshell/ui/panel/BM.O ()Ljava/awt/image/BufferedImage;
      // 0da: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 0dd: aload 3
      // 0de: getfield java/awt/Insets.right I
      // 0e1: isub
      // 0e2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e5: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f0: athrow
      // 0f1: ifne 111
      // 0f4: aload 2
      // 0f5: aload 0
      // 0f6: invokevirtual com/finalshell/ui/panel/BM.O ()Ljava/awt/image/BufferedImage;
      // 0f9: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 0fc: aload 3
      // 0fd: getfield java/awt/Insets.right I
      // 100: isub
      // 101: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 104: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 109: pop
      // 10a: goto 111
      // 10d: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 110: athrow
      // 111: aload 2
      // 112: invokestatic java/util/Collections.sort (Ljava/util/List;)V
      // 115: aload 2
      // 116: areturn
   }

   public List H() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new java/util/ArrayList
      // 003: dup
      // 004: invokespecial java/util/ArrayList.<init> ()V
      // 007: astore 2
      // 008: invokestatic com/finalshell/ui/panel/KD3.u ()[I
      // 00b: aload 0
      // 00c: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 00f: invokevirtual com/finalshell/core/PF3.g ()Ljava/util/List;
      // 012: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 017: astore 3
      // 018: astore 1
      // 019: aload 3
      // 01a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 01f: ifeq 099
      // 022: aload 3
      // 023: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 028: checkcast com/finalshell/ui/model/EZ
      // 02b: astore 4
      // 02d: aload 2
      // 02e: aload 4
      // 030: invokevirtual com/finalshell/ui/model/EZ.x ()I
      // 033: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 036: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 03b: aload 1
      // 03c: ifnonnull 06f
      // 03f: ifne 05f
      // 042: goto 049
      // 045: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 048: athrow
      // 049: aload 2
      // 04a: aload 4
      // 04c: invokevirtual com/finalshell/ui/model/EZ.x ()I
      // 04f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 052: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 057: pop
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05e: athrow
      // 05f: aload 2
      // 060: aload 4
      // 062: invokevirtual com/finalshell/ui/model/EZ.f ()I
      // 065: bipush 1
      // 066: iadd
      // 067: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 06a: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 06f: aload 1
      // 070: ifnonnull 094
      // 073: ifne 095
      // 076: goto 07d
      // 079: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07c: athrow
      // 07d: aload 2
      // 07e: aload 4
      // 080: invokevirtual com/finalshell/ui/model/EZ.f ()I
      // 083: bipush 1
      // 084: iadd
      // 085: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 088: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 08d: goto 094
      // 090: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 093: athrow
      // 094: pop
      // 095: aload 1
      // 096: ifnull 019
      // 099: aload 0
      // 09a: getfield com/finalshell/ui/panel/BM.p Lcom/finalshell/core/PF3;
      // 09d: invokevirtual com/finalshell/core/PF3.U$Insets ()Ljava/awt/Insets;
      // 0a0: astore 3
      // 0a1: aload 2
      // 0a2: aload 3
      // 0a3: getfield java/awt/Insets.top I
      // 0a6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a9: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 0ae: aload 1
      // 0af: ifnonnull 0f1
      // 0b2: ifne 0d1
      // 0b5: goto 0bc
      // 0b8: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bb: athrow
      // 0bc: aload 2
      // 0bd: aload 3
      // 0be: getfield java/awt/Insets.top I
      // 0c1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0c9: pop
      // 0ca: goto 0d1
      // 0cd: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d0: athrow
      // 0d1: aload 2
      // 0d2: aload 1
      // 0d3: ifnonnull 116
      // 0d6: aload 0
      // 0d7: invokevirtual com/finalshell/ui/panel/BM.O ()Ljava/awt/image/BufferedImage;
      // 0da: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 0dd: aload 3
      // 0de: getfield java/awt/Insets.bottom I
      // 0e1: isub
      // 0e2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e5: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f0: athrow
      // 0f1: ifne 111
      // 0f4: aload 2
      // 0f5: aload 0
      // 0f6: invokevirtual com/finalshell/ui/panel/BM.O ()Ljava/awt/image/BufferedImage;
      // 0f9: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 0fc: aload 3
      // 0fd: getfield java/awt/Insets.bottom I
      // 100: isub
      // 101: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 104: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 109: pop
      // 10a: goto 111
      // 10d: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 110: athrow
      // 111: aload 2
      // 112: invokestatic java/util/Collections.sort (Ljava/util/List;)V
      // 115: aload 2
      // 116: areturn
   }

   public int Z(int var1, Insets var2) {
      return var1 + var2.left * this.I;
   }

   public int x(int var1, int var2, Insets var3) {
      return var1 + var2 - var3.right * this.I;
   }

   public int I(int var1, Insets var2) {
      return var1 + var2.top * this.I;
   }

   public int M(int var1, int var2, Insets var3) {
      return var1 + var2 - var3.bottom * this.I;
   }

   public List A$List() {
      return this.h;
   }

   public void Q(ChangeListener var1) {
      this.h.add(var1);
   }

   public void i(ChangeListener var1) {
      this.h.add(var1);
   }

   public void C() {
      int[] var10000 = KD3.u();
      ChangeEvent var2 = new ChangeEvent(this);
      int[] var1 = var10000;

      for (ChangeListener var4 : AL_2.J((Collection)this.h)) {
         var4.stateChanged(var2);
         if (var1 != null) {
            break;
         }
      }
   }

   public List d$List() {
      return this.u;
   }

   public void u(Hc2 var1) {
      this.u.add(var1);
   }

   public void h(Hc2 var1) {
      this.u.add(var1);
   }

   public void w$void() {
      int[] var10000 = KD3.u();
      Iterator var2 = AL_2.J((Collection)this.u).iterator();
      int[] var1 = var10000;

      while (var2.hasNext()) {
         Hc2 var3 = (Hc2)var2.next();
         var3.X();
         if (var1 != null) {
            break;
         }
      }
   }

   public int M$int() {
      return PY.f(this);
   }

   public BM C(int var1) {
      return (BM)PY.Q(this, var1);
   }

   @Override
   public int m() {
      return PY.m(this);
   }

   public BM X(int var1) {
      return (BM)PY.j(this, var1);
   }

   public int A$int() {
      return PY.S(this);
   }

   public BM N(int var1) {
      return (BM)PY.N(this, var1);
   }

   public int Q$int() {
      return PY.Z(this);
   }

   public BM h(int var1) {
      return (BM)PY.w(this, var1);
   }

   @Override
   public int i() {
      return PY.J(this);
   }

   public BM Q(int var1) {
      return (BM)PY.b(this, var1);
   }

   public int a$int() {
      return PY.i(this);
   }

   public BM q(int var1) {
      return (BM)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, this.y$Dimension());
   }

   public BM U(int var1, int var2) {
      return (BM)PY.O(this, var1, var2);
   }

   public Dimension y$Dimension() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/KD3.u ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/ui/panel/BM.E Ljava/awt/image/BufferedImage;
      // 08: ifnull 13
      // 0b: bipush 1
      // 0c: goto 14
      // 0f: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12: athrow
      // 13: bipush 0
      // 14: istore 2
      // 15: iload 2
      // 16: aload 1
      // 17: ifnonnull 39
      // 1a: ifeq 3c
      // 1d: goto 24
      // 20: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23: athrow
      // 24: aload 0
      // 25: getfield com/finalshell/ui/panel/BM.E Ljava/awt/image/BufferedImage;
      // 28: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 2b: bipush 2
      // 2c: iadd
      // 2d: aload 0
      // 2e: getfield com/finalshell/ui/panel/BM.I I
      // 31: imul
      // 32: goto 39
      // 35: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 38: athrow
      // 39: goto 45
      // 3c: sipush 21574
      // 3f: ldc2_w 3785569963478412468
      // 42: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 45: istore 3
      // 46: iload 2
      // 47: aload 1
      // 48: ifnonnull 6a
      // 4b: ifeq 6d
      // 4e: goto 55
      // 51: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 54: athrow
      // 55: aload 0
      // 56: getfield com/finalshell/ui/panel/BM.E Ljava/awt/image/BufferedImage;
      // 59: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 5c: bipush 2
      // 5d: iadd
      // 5e: aload 0
      // 5f: getfield com/finalshell/ui/panel/BM.I I
      // 62: imul
      // 63: goto 6a
      // 66: invokestatic com/finalshell/ui/panel/BM.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 69: athrow
      // 6a: goto 76
      // 6d: sipush 6976
      // 70: ldc2_w 2105711136051176361
      // 73: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 76: istore 4
      // 78: new java/awt/Dimension
      // 7b: dup
      // 7c: sipush 23435
      // 7f: ldc2_w 3919341184167535476
      // 82: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 85: iload 3
      // 86: iadd
      // 87: sipush 6267
      // 8a: ldc2_w 8931649703959437452
      // 8d: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 90: iadd
      // 91: sipush 23435
      // 94: ldc2_w 3919341184167535476
      // 97: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // 9a: iload 4
      // 9c: iadd
      // 9d: sipush 6267
      // a0: ldc2_w 8931649703959437452
      // a3: invokestatic com/finalshell/ui/panel/BM.a (IJ)I
      // a6: iadd
      // a7: invokespecial java/awt/Dimension.<init> (II)V
      // aa: areturn
   }

   @Override
   public Component W(int var1, int var2) {
      return this.U(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.q(var1);
   }

   @Override
   public Component p(int var1) {
      return this.Q(var1);
   }

   @Override
   public Component D(int var1) {
      return this.h(var1);
   }

   @Override
   public Component V(int var1) {
      return this.N(var1);
   }

   @Override
   public Component x(int var1) {
      return this.X(var1);
   }

   @Override
   public Component O(int var1) {
      return this.C(var1);
   }

   static int B(BM var0) {
      return var0.I;
   }

   static PF3 v(BM var0) {
      return var0.p;
   }

   static boolean C(BM var0) {
      return var0.a;
   }

   static int q(BM var0, int var1, Insets var2) {
      return var0.Z(var1, var2);
   }

   static int Y(BM var0, int var1, int var2, Insets var3) {
      return var0.x(var1, var2, var3);
   }

   static int P(BM var0, int var1, Insets var2) {
      return var0.I(var1, var2);
   }

   static int w(BM var0, int var1, int var2, Insets var3) {
      return var0.M(var1, var2, var3);
   }

   static boolean D(BM var0) {
      return var0.U;
   }

   static boolean x(BM var0) {
      return var0.i;
   }

   static boolean w(BM var0) {
      return var0.V;
   }

   static boolean Z(BM var0, boolean var1) {
      return var0.V = var1;
   }

   static SZ t(BM var0) {
      return var0.x;
   }

   static BufferedImage E(BM var0) {
      return var0.E;
   }

   static void A(BM var0) {
      var0.C();
   }

   static void U(BM var0) {
      var0.a$void();
   }

   static int g$int(BM var0) {
      return var0.h();
   }

   static boolean K(BM var0) {
      return var0.G;
   }

   static void W(BM var0) {
      var0.X$void();
   }

   static void F(BM var0) {
      var0.j$void();
   }

   static boolean z(BM var0) {
      return var0.R;
   }

   static boolean[] Y(BM var0) {
      return var0.b$arrboolean();
   }

   static void g$void(BM var0) {
      var0.M$void();
   }

   static boolean[] P(BM var0) {
      return var0.c();
   }

   static {
      __vfClinit__();
   }

   public static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14571;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3393708222217126505L;
      long[] var6 = new long[31];
      int var3 = 0;
      String var4 = "± î^\u001fj´ªüDoÃQÓî-mo8Éçy P\u0092\u0085\u0099k\u001cî\u0016boÝÒB\u0087J\u0084®\u0017\u0089Ù\u0091\u008e\u0096£Þ\u0012¯bG!Â)Í\u0099\u0011\u0002\u0000fVE¿\u000e±\u0082÷ ±¿úÂB\u001c\u0087\u007f¯$\u0098\u000b\u0085íÃàÅêm¬ÏT\u0088ú_\u009dr¬h\u001fë\u008a\u000b{\u0006ë²÷\u0098j~F\u008fV*òð\u0099Îlºþiè)%\u0002½Ü2ÝAÁ.YY5ö\u0006g?\u009d\u000e,uÇ=1\u0086X1¡\u000b\u0015ûSÏ¨0\u0011 \u007f\nÓK[Na\teÝÒB\u009cÁ¨\f~tDò\fÓx,\u0002\u0005üX\u0099\f\u0080¦¢ø.¾>ÆÝ\"©Äf7ñ\u0017ïM\u0093à§\u0092Nüo¢\u0081\u0095ZªTÆ«=v¢\u0011í¶*¢µ";
      int var5 = "± î^\u001fj´ªüDoÃQÓî-mo8Éçy P\u0092\u0085\u0099k\u001cî\u0016boÝÒB\u0087J\u0084®\u0017\u0089Ù\u0091\u008e\u0096£Þ\u0012¯bG!Â)Í\u0099\u0011\u0002\u0000fVE¿\u000e±\u0082÷ ±¿úÂB\u001c\u0087\u007f¯$\u0098\u000b\u0085íÃàÅêm¬ÏT\u0088ú_\u009dr¬h\u001fë\u008a\u000b{\u0006ë²÷\u0098j~F\u008fV*òð\u0099Îlºþiè)%\u0002½Ü2ÝAÁ.YY5ö\u0006g?\u009d\u000e,uÇ=1\u0086X1¡\u000b\u0015ûSÏ¨0\u0011 \u007f\nÓK[Na\teÝÒB\u009cÁ¨\f~tDò\fÓx,\u0002\u0005üX\u0099\f\u0080¦¢ø.¾>ÆÝ\"©Äf7ñ\u0017ïM\u0093à§\u0092Nüo¢\u0081\u0095ZªTÆ«=v¢\u0011í¶*¢µ"
         .length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     c = var6;
                     d = new Integer[31];
                     b = new Color(a(3604, 1285508351382894335L), a(32684, 8481945231347238720L), 0);
                     C = new Color(a(25591, 5005383585441143564L), a(21560, 21883582364576978L), 0, a(1300, 8526628996167941623L));
                     M = new Color(a(6267, 8931649703959437452L), a(6267, 8931649703959437452L), a(6267, 8931649703959437452L), a(5678, 6220988206857137876L));
                     K = new Color(a(1803, 3227234663379615727L), a(4883, 3838736327202909182L), a(4443, 6604677307277093291L), a(7799, 5909121351708059285L));
                     j = new Color(a(6948, 6775764954468492253L), a(16903, 3601239173844990714L), a(16903, 3601239173844990714L));
                     N = Color.WHITE;
                     T = new Color(a(20480, 311120984718895329L), a(11224, 1388510942268166944L), a(12108, 5393318221883840442L));
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "M+n\u00adÈ\u0094\u0015=©z:&øÎ\u009f¬";
                  var5 = "M+n\u00adÈ\u0094\u0015=©z:&øÎ\u009f¬".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





