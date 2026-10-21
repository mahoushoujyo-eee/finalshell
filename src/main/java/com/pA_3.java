package com;

import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.im.InputMethodRequests;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.text.AttributedCharacterIterator;
import java.text.BreakIterator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.BoundedRangeModel;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollBar;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class pA_3 extends JComponent implements com.dV_3, com.cS_3, ClipboardOwner, D2 {
   private static Logger cl;
   public static double z;
   private Font c_;
   private Font ck;
   private Font cL;
   private Font Z;
   private int cW = 0;
   private int cJ = 0;
   public Dimension c4 = new Dimension();
   private boolean cd;
   public com.OT N;
   private boolean cq = false;
   private E0 cc = null;
   private com.YT x = com.YT.MOUSE_REPORTING_NONE;
   private XE c0 = null;
   private rU_3 u = null;
   private com.a6 v;
   private xn_4 c;
   private rx_4 t;
   private im_4 V;
   private com.ov_4 cY;
   private com.d__2 w = new com.d__2(this);
   private BoundedRangeModel i = new DefaultBoundedRangeModel(0, a(5921, 385034442389622210L), 0, a(5921, 385034442389622210L));
   private boolean X = true;
   protected int P;
   List cT = new CopyOnWriteArrayList();
   private String j = a(8956, -13003);
   private com.cS_3 R;
   private String cf;
   private Timer cF;
   private AtomicInteger D;
   private AtomicBoolean Q;
   private int cK;
   private int c5;
   private com.ab_2 cE;
   private com.WZ l;
   private com.yA_3 cV;
   private int Y;
   private I_ c2;
   private com.oX_3 B;
   private com.Wq_2 W;
   private volatile boolean r;
   private boolean T;
   private boolean cz;
   @Nullable
   private com.YP a;
   @Nullable
   private com.YP cp;
   private rU_3 e;
   private int F;
   private int cy;
   IR s;
   zB cv;
   boolean n;
   int c6;
   String cH;
   _y_2 L;
   kx_4 O;
   nY cM;
   K3 d;
   KeyEvent cr;
   long E;
   boolean g;
   boolean o;
   Object f;
   StringBuffer cs;
   long M;
   XE K;
   boolean cj;
   com.DI S;
   Y3 q;
   lt_4 m;
   int cw;
   long h;
   boolean cQ;
   static HashMap J;
   Pr_2 H;
   boolean k;
   boolean c8;
   boolean A;
   ChangeListener p;
   Clipboard G;
   boolean cS;
   int U;
   gH b;
   int I;
   long C;
   public long ce;
   float y;
   long cb;
   boolean ca;
   private static final String[] ab;
   private static final String[] bb;
   private static final long[] db;
   private static final Integer[] eb;
   private static final long[] fb;
   private static final Long[] gb;

   public pA_3(@NotNull rx_4 var1, @NotNull im_4 var2, @NotNull com.ov_4 var3) {
      int var10000 = _y_2.M();
      this.D = new AtomicInteger(0);
      this.Q = new AtomicBoolean(true);
      this.cK = a(1039, 8977415319888338665L);
      this.c5 = a(24345, 3875527706677560814L);
      this.cV = null;
      this.Y = 0;
      this.c2 = new I_(this);
      this.T = false;
      this.e = null;
      this.F = 0;
      this.cy = 0;
      this.n = false;
      this.c6 = -1;
      int var4 = var10000;

      try {
         this.cH = "";
         this.g = false;
         this.o = false;
         this.f = new Object();
         this.cs = new StringBuffer();
         this.cj = false;
         this.H = new Pr_2(this);
         this.k = false;
         this.c8 = false;
         this.A = false;
         Object[] var10001 = com.c.f();
         Method var12 = com.c.d(270389152141252877L);
         Object[] var22 = var10001;
         Object var18 = null;

         try {
            var10001 = (Object[])var12.invoke(var18, var22);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         var18 = com.c.f();
         Method var10004 = com.c.d(399585344452154517L);
         var22 = (Object[])var18;
         var18 = var10001;
         Method var14 = var10004;

         try {
            var10001 = (kx_4)var14.invoke(var18, var22);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         this.O = var10001;
         this.cS = false;
         this.U = 0;
         this.I = -1;
         this.y = 1.0F;
         this.ca = true;
         this.t = var1;
         this.V = var2;
         this.cY = var3;
         this.N = new com.OT(var2.B(), var2.O());
         this.cK = this.t.n();
         this.v = this.U();
         this.l(true);
         this.enableEvents(b(14408, 3559354844437830389L));
         this.enableInputMethods(true);
         var2.P(this::repaint);
         var2.Y(this::repaint);
         this.m = new lt_4(this, this);
         lt_4 var10 = this.m;
         var10001 = com.c.a(true);
         Method var24 = com.c.d(117930650841340028L);
         var18 = var10001;
         lt_4 var17 = var10;
         Method var11 = var24;

         try {
            var11.invoke(var17, (Object[])var18);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         if (com.ky_4.F() != null) {
            _y_2.W(++var4);
         }
      } catch (IllegalStateException var8) {
         throw a(var8);
      }
   }

   public void k() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: new java/util/ArrayList
      // 06: dup
      // 07: invokespecial java/util/ArrayList.<init> ()V
      // 0a: astore 2
      // 0b: istore 1
      // 0c: aload 0
      // 0d: getfield com/pA_3.cT Ljava/util/List;
      // 10: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 15: astore 3
      // 16: aload 3
      // 17: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1c: ifeq 60
      // 1f: aload 3
      // 20: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 25: checkcast java/awt/event/KeyListener
      // 28: astore 4
      // 2a: aload 4
      // 2c: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2f: ldc_w com/I_
      // 32: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 35: iload 1
      // 36: ifeq 6a
      // 39: iload 1
      // 3a: ifeq 5b
      // 3d: goto 44
      // 40: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: ifeq 5c
      // 47: goto 4e
      // 4a: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: aload 2
      // 4f: aload 4
      // 51: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 54: goto 5b
      // 57: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: pop
      // 5c: iload 1
      // 5d: ifne 16
      // 60: aload 0
      // 61: getfield com/pA_3.cT Ljava/util/List;
      // 64: aload 2
      // 65: invokeinterface java/util/List.removeAll (Ljava/util/Collection;)Z 2
      // 6a: pop
      // 6b: aload 0
      // 6c: new com/I_
      // 6f: dup
      // 70: aload 0
      // 71: invokespecial com/I_.<init> (Lcom/pA_3;)V
      // 74: invokevirtual com/pA_3.addKeyListener (Ljava/awt/event/KeyListener;)V
      // 77: return
   }

   public com.OT v() {
      return this.N;
   }

   public boolean V() {
      return this.g;
   }

   public void e(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 1
      // 06: iload 2
      // 07: ifeq 21
      // 0a: putfield com/pA_3.g Z
      // 0d: iload 1
      // 0e: ifne 24
      // 11: goto 18
      // 14: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 0
      // 19: bipush 0
      // 1a: goto 21
      // 1d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: putfield com/pA_3.o Z
      // 24: return
   }

   public boolean g() {
      return this.o;
   }

   public void b(boolean var1) {
      if (var1) {
      }

      this.o = var1;
      if (!var1) {
      }
   }

   public Y3 Z() {
      return this.q;
   }

   public void F(Y3 var1) {
      this.q = var1;
   }

   public KeyEvent c() {
      return this.cr;
   }

   public void X(KeyEvent var1) {
      this.cr = var1;
   }

   public long Z$long() {
      return this.E;
   }

   public void u(long var1) {
      this.E = var1;
   }

   public void C() {
      this.cr = null;
      this.E = 0L;
      this.g = false;
      this.o = false;
      this.cq = false;
   }

   public void l() {
      this.G();
   }

   public void D() {
      this.b();
      this.Q();
      this.setPreferredSize(new Dimension(this.g(), this.J()));
      this.setFocusable(true);
      this.enableInputMethods(true);
      this.setDoubleBuffered(true);
      this.setFocusTraversalKeysEnabled(false);
      this.addMouseMotionListener(new Hb_2(this));
      this.addMouseWheelListener(new com.B9(this));
      this.addMouseListener(new com.yU_3(this));
      this.addComponentListener(new Sc_2(this));
      this.addFocusListener(new com.CV(this));
      this.p = new com.Wg_2(this);
      this.i.addChangeListener(this.p);
      this.J();
   }

   void z(int var1, int var2) {
      JPopupMenu var3 = this.C();
      var3.show(this, var1, var2);
   }

   JPopupMenu C$JPopupMenu() {
      JPopupMenu var1 = new JPopupMenu();
      Object[] var10001 = com.c.a(com.c.c(518223218338208363L).getInt(null), new com.Oo_2(this, a(8954, -25906)));
      Method var8 = com.c.d(458639668206483981L);
      Object[] var31 = var10001;
      Object var22 = null;

      try {
         var10001 = (JMenuItem)var8.invoke(var22, var31);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var1.add(var10001);
      var10001 = com.c.a(com.c.c(263914437926532128L).getInt(null), new com.Yk_2(this, a(8947, -25754)));
      Method var11 = com.c.d(458639668206483981L);
      var31 = var10001;
      var22 = null;

      try {
         var10001 = (JMenuItem)var11.invoke(var22, var31);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var1.add(var10001);
      var10001 = com.c.a(0, new com.oq_4(this, a(8958, 28867)));
      Method var14 = com.c.d(458639668206483981L);
      var31 = var10001;
      var22 = null;

      try {
         var10001 = (JMenuItem)var14.invoke(var22, var31);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var1.add(var10001);
      var1.addSeparator();
      var10001 = com.c.a(com.c.c(460316126853161418L).getInt(null), new com.Q9(this, a(8944, -26558)));
      Method var17 = com.c.d(458639668206483981L);
      var31 = var10001;
      var22 = null;

      try {
         var10001 = (JMenuItem)var17.invoke(var22, var31);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var1.add(var10001);
      var1.addSeparator();
      var10001 = com.c.a(com.c.c(519772657709926580L).getInt(null), new GD(this, a(8957, 24712)));
      Method var20 = com.c.d(458639668206483981L);
      var31 = var10001;
      var22 = null;

      try {
         var10001 = (JMenuItem)var20.invoke(var22, var31);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var1.add(var10001);
      var1.addSeparator();
      JMenuItem var2 = new JMenuItem(a(8949, 5939));
      var2.setForeground(new Color(a(5895, 7533047664870002152L), 0, a(17063, 1733742218729281603L)));
      var1.add(var2);
      var2.addActionListener(new com.Lt_2(this));
      return var1;
   }

   public void v$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: aload 0
      // 04: getfield com/pA_3.L Lcom/_y_2;
      // 07: invokevirtual com/_y_2.Q ()V
      // 0a: istore 1
      // 0b: aload 0
      // 0c: iload 1
      // 0d: ifne 25
      // 10: getfield com/pA_3.u Lcom/rU_3;
      // 13: ifnull 3c
      // 16: goto 1d
      // 19: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: aload 0
      // 1e: goto 25
      // 21: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: invokevirtual com/pA_3.J ()Ljava/lang/String;
      // 28: astore 2
      // 29: aload 2
      // 2a: ifnull 3c
      // 2d: aload 0
      // 2e: getfield com/pA_3.L Lcom/_y_2;
      // 31: aload 2
      // 32: invokevirtual com/_y_2.l (Ljava/lang/String;)V
      // 35: goto 3c
      // 38: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: return
   }

   public void r() {
      this.requestFocus();
      this.r(this.C());
   }

   public void y() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: aload 0
      // 04: invokevirtual com/pA_3.requestFocus ()V
      // 07: istore 1
      // 08: aload 0
      // 09: bipush 0
      // 0a: invokevirtual com/pA_3.A (Z)Z
      // 0d: pop
      // 0e: aload 0
      // 0f: invokevirtual com/pA_3.J ()Ljava/lang/String;
      // 12: astore 2
      // 13: aload 2
      // 14: iload 1
      // 15: ifne 3d
      // 18: ifnull 32
      // 1b: goto 22
      // 1e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 0
      // 23: aload 2
      // 24: invokevirtual com/pA_3.r (Ljava/lang/String;)V
      // 27: iload 1
      // 28: ifeq 43
      // 2b: goto 32
      // 2e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: aload 0
      // 33: invokespecial com/pA_3.C ()Ljava/lang/String;
      // 36: goto 3d
      // 39: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: astore 2
      // 3e: aload 0
      // 3f: aload 2
      // 40: invokevirtual com/pA_3.r (Ljava/lang/String;)V
      // 43: return
   }

   public boolean A(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: aload 0
      // 04: invokevirtual com/pA_3.requestFocus ()V
      // 07: istore 2
      // 08: aload 0
      // 09: getfield com/pA_3.u Lcom/rU_3;
      // 0c: iload 2
      // 0d: ifeq 25
      // 10: ifnull 62
      // 13: goto 1a
      // 16: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield com/pA_3.u Lcom/rU_3;
      // 1e: goto 25
      // 21: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 0
      // 26: getfield com/pA_3.N Lcom/OT;
      // 29: invokevirtual com/OT.R ()I
      // 2c: invokevirtual com/rU_3.K (I)Lcom/KB;
      // 2f: astore 3
      // 30: aload 0
      // 31: aload 3
      // 32: getfield com/KB.X Ljava/lang/Object;
      // 35: checkcast com/XE
      // 38: aload 3
      // 39: getfield com/KB.S Ljava/lang/Object;
      // 3c: checkcast com/XE
      // 3f: invokevirtual com/pA_3.r (Lcom/XE;Lcom/XE;)V
      // 42: iload 1
      // 43: iload 2
      // 44: ifeq 61
      // 47: ifeq 60
      // 4a: goto 51
      // 4d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: aload 0
      // 52: invokevirtual com/pA_3.V ()V
      // 55: aload 0
      // 56: invokevirtual com/pA_3.repaint ()V
      // 59: goto 60
      // 5c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f: athrow
      // 60: bipush 1
      // 61: ireturn
      // 62: bipush 0
      // 63: ireturn
   }

   void e() {
      SwingUtilities.invokeLater(new com.Lg_2(this));
   }

   void V$void() {
      this.u = null;
      this.N();
   }

   public void N() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/_y_2.y ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifne 160
      // 009: invokevirtual com/pA_3.isShowing ()Z
      // 00c: ifeq 158
      // 00f: goto 016
      // 012: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: aload 0
      // 017: iload 1
      // 018: ifne 160
      // 01b: goto 022
      // 01e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 021: athrow
      // 022: getfield com/pA_3.u Lcom/rU_3;
      // 025: ifnull 158
      // 028: goto 02f
      // 02b: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 0
      // 030: getfield com/pA_3.u Lcom/rU_3;
      // 033: invokevirtual com/rU_3.e ()Lcom/XE;
      // 036: getfield com/XE.r I
      // 039: aload 0
      // 03a: getfield com/pA_3.i Ljavax/swing/BoundedRangeModel;
      // 03d: invokeinterface javax/swing/BoundedRangeModel.getValue ()I 1
      // 042: isub
      // 043: bipush 1
      // 044: iadd
      // 045: istore 2
      // 046: new com/XE
      // 049: dup
      // 04a: aload 0
      // 04b: getfield com/pA_3.u Lcom/rU_3;
      // 04e: invokevirtual com/rU_3.e ()Lcom/XE;
      // 051: getfield com/XE.q I
      // 054: aload 0
      // 055: getfield com/pA_3.c4 Ljava/awt/Dimension;
      // 058: getfield java/awt/Dimension.width I
      // 05b: imul
      // 05c: iload 2
      // 05d: aload 0
      // 05e: getfield com/pA_3.c4 Ljava/awt/Dimension;
      // 061: getfield java/awt/Dimension.height I
      // 064: imul
      // 065: invokespecial com/XE.<init> (II)V
      // 068: astore 3
      // 069: new com/XE
      // 06c: dup
      // 06d: aload 0
      // 06e: getfield com/pA_3.K Lcom/XE;
      // 071: getfield com/XE.q I
      // 074: sipush 18426
      // 077: ldc2_w 2303050399558163741
      // 07a: invokestatic com/pA_3.a (IJ)I
      // 07d: iadd
      // 07e: aload 3
      // 07f: getfield com/XE.r I
      // 082: sipush 12242
      // 085: ldc2_w 1489795501300364599
      // 088: invokestatic com/pA_3.a (IJ)I
      // 08b: iadd
      // 08c: invokespecial com/XE.<init> (II)V
      // 08f: astore 4
      // 091: new java/awt/Rectangle
      // 094: dup
      // 095: invokespecial java/awt/Rectangle.<init> ()V
      // 098: astore 5
      // 09a: aload 5
      // 09c: aload 4
      // 09e: getfield com/XE.q I
      // 0a1: putfield java/awt/Rectangle.x I
      // 0a4: aload 5
      // 0a6: aload 4
      // 0a8: getfield com/XE.r I
      // 0ab: putfield java/awt/Rectangle.y I
      // 0ae: aload 5
      // 0b0: aload 0
      // 0b1: getfield com/pA_3.q LY3;
      // 0b4: invokevirtual Y3.getPreferredSize ()Ljava/awt/Dimension;
      // 0b7: getfield java/awt/Dimension.width I
      // 0ba: putfield java/awt/Rectangle.width I
      // 0bd: aload 5
      // 0bf: aload 0
      // 0c0: getfield com/pA_3.q LY3;
      // 0c3: invokevirtual Y3.getPreferredSize ()Ljava/awt/Dimension;
      // 0c6: getfield java/awt/Dimension.height I
      // 0c9: putfield java/awt/Rectangle.height I
      // 0cc: aload 0
      // 0cd: astore 6
      // 0cf: aload 5
      // 0d1: getfield java/awt/Rectangle.x I
      // 0d4: aload 5
      // 0d6: getfield java/awt/Rectangle.width I
      // 0d9: iadd
      // 0da: aload 6
      // 0dc: invokevirtual java/awt/Container.getWidth ()I
      // 0df: iload 1
      // 0e0: ifne 10c
      // 0e3: if_icmple 104
      // 0e6: goto 0ed
      // 0e9: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ec: athrow
      // 0ed: aload 5
      // 0ef: aload 6
      // 0f1: invokevirtual java/awt/Container.getWidth ()I
      // 0f4: aload 5
      // 0f6: getfield java/awt/Rectangle.width I
      // 0f9: isub
      // 0fa: putfield java/awt/Rectangle.x I
      // 0fd: goto 104
      // 100: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 103: athrow
      // 104: iload 2
      // 105: aload 0
      // 106: getfield com/pA_3.N Lcom/OT;
      // 109: invokevirtual com/OT.c ()I
      // 10c: if_icmpne 134
      // 10f: aload 5
      // 111: dup
      // 112: getfield java/awt/Rectangle.y I
      // 115: aload 0
      // 116: getfield com/pA_3.c4 Ljava/awt/Dimension;
      // 119: getfield java/awt/Dimension.height I
      // 11c: aload 0
      // 11d: getfield com/pA_3.q LY3;
      // 120: invokevirtual Y3.getPreferredSize ()Ljava/awt/Dimension;
      // 123: getfield java/awt/Dimension.height I
      // 126: iadd
      // 127: bipush 3
      // 128: iadd
      // 129: isub
      // 12a: putfield java/awt/Rectangle.y I
      // 12d: goto 134
      // 130: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 133: athrow
      // 134: aload 0
      // 135: getfield com/pA_3.q LY3;
      // 138: aload 5
      // 13a: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 13d: ldc2_w 603812236548708747
      // 140: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 143: dup_x2
      // 144: pop
      // 145: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 148: pop
      // 149: goto 150
      // 14c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 14f: athrow
      // 150: aload 0
      // 151: invokevirtual com/pA_3.W ()V
      // 154: iload 1
      // 155: ifeq 163
      // 158: aload 0
      // 159: goto 160
      // 15c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15f: athrow
      // 160: invokevirtual com/pA_3.x ()V
      // 163: return
   }

   void x() {
      this.q.setVisible(false);
      this.cj = false;
   }

   void W() {
      this.q.setVisible(true);
   }

   void Q() {
      this.G = Toolkit.getDefaultToolkit().getSystemClipboard();
   }

   String J() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: aconst_null
      // 04: astore 2
      // 05: istore 1
      // 06: aload 0
      // 07: getfield com/pA_3.u Lcom/rU_3;
      // 0a: iload 1
      // 0b: ifeq 23
      // 0e: ifnull 76
      // 11: goto 18
      // 14: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 0
      // 19: getfield com/pA_3.u Lcom/rU_3;
      // 1c: goto 23
      // 1f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: aload 0
      // 24: getfield com/pA_3.N Lcom/OT;
      // 27: invokevirtual com/OT.R ()I
      // 2a: invokevirtual com/rU_3.K (I)Lcom/KB;
      // 2d: astore 3
      // 2e: aload 3
      // 2f: getfield com/KB.X Ljava/lang/Object;
      // 32: iload 1
      // 33: ifeq 4b
      // 36: ifnull 76
      // 39: goto 40
      // 3c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 3
      // 41: getfield com/KB.S Ljava/lang/Object;
      // 44: goto 4b
      // 47: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: iload 1
      // 4c: ifeq 64
      // 4f: ifnull 76
      // 52: goto 59
      // 55: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58: athrow
      // 59: aload 3
      // 5a: getfield com/KB.X Ljava/lang/Object;
      // 5d: goto 64
      // 60: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 63: athrow
      // 64: checkcast com/XE
      // 67: aload 3
      // 68: getfield com/KB.S Ljava/lang/Object;
      // 6b: checkcast com/XE
      // 6e: aload 0
      // 6f: getfield com/pA_3.V Lcom/im_4;
      // 72: invokestatic com/a7.v (Lcom/XE;Lcom/XE;Lcom/im_4;)Ljava/lang/String;
      // 75: astore 2
      // 76: aload 2
      // 77: areturn
   }

   protected void r(XE var1, XE var2) {
      int var3 = _y_2.y();

      XE var10000;
      label53: {
         try {
            var10000 = var1;
            if (var3 != 0) {
               break label53;
            }

            if (var1 == null) {
               return;
            }
         } catch (IllegalStateException var9) {
            throw a(var9);
         }

         var10000 = var2;
      }

      label47: {
         try {
            if (var3 != 0) {
               break label47;
            }

            if (var10000 == null) {
               return;
            }
         } catch (IllegalStateException var8) {
            throw a(var8);
         }

         var10000 = var1;
      }

      String var4 = com.a7.v(var10000, var2, this.V);

      try {
         if (var3 != 0 || var4.length() == 0) {
            return;
         }
      } catch (IllegalStateException var7) {
         throw a(var7);
      }

      try {
         this.C(new StringSelection(var4));
      } catch (IllegalStateException var6) {
         cl.error(a(8946, -25108), (Throwable)var6);
      }
   }

   protected void C(StringSelection param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: invokestatic java/awt/Toolkit.getDefaultToolkit ()Ljava/awt/Toolkit;
      // 06: invokevirtual java/awt/Toolkit.getSystemClipboard ()Ljava/awt/datatransfer/Clipboard;
      // 09: astore 3
      // 0a: istore 2
      // 0b: aload 3
      // 0c: iload 2
      // 0d: ifeq 2d
      // 10: ifnull 27
      // 13: goto 1a
      // 16: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: aload 3
      // 1b: aload 1
      // 1c: aload 0
      // 1d: invokevirtual java/awt/datatransfer/Clipboard.setContents (Ljava/awt/datatransfer/Transferable;Ljava/awt/datatransfer/ClipboardOwner;)V
      // 20: goto 27
      // 23: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: invokestatic java/awt/Toolkit.getDefaultToolkit ()Ljava/awt/Toolkit;
      // 2a: invokevirtual java/awt/Toolkit.getSystemSelection ()Ljava/awt/datatransfer/Clipboard;
      // 2d: astore 4
      // 2f: aload 4
      // 31: iload 2
      // 32: ifeq 41
      // 35: ifnull 46
      // 38: goto 3f
      // 3b: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: aload 4
      // 41: aload 1
      // 42: aload 0
      // 43: invokevirtual java/awt/datatransfer/Clipboard.setContents (Ljava/awt/datatransfer/Transferable;Ljava/awt/datatransfer/ClipboardOwner;)V
      // 46: return
   }

   void K() {
      KeyEvent var1 = new KeyEvent(
         this, a(22342, 1641791032517774729L), System.currentTimeMillis(), 0, a(3818, 4017640413363442733L), (char)a(3818, 4017640413363442733L)
      );
      this.dispatchEvent(var1);
   }

   protected void r(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: aload 1
      // 04: astore 3
      // 05: istore 2
      // 06: iload 2
      // 07: ifne 22
      // 0a: aload 3
      // 0b: ifnonnull 1a
      // 0e: goto 15
      // 11: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: return
      // 16: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield com/pA_3.cc Lcom/E0;
      // 1e: aload 3
      // 1f: invokevirtual com/E0.D (Ljava/lang/String;)V
      // 22: goto 27
      // 25: astore 4
      // 27: return
   }

   public void x(String var1, boolean var2) {
      this.v(var1, var2, true);
   }

   public void v(String var1, boolean var2, boolean var3) {
      Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
      Object[] var10001 = com.c.a(new wZ_3(this, var1, var3, var2));
      Method var10003 = com.c.d(434592463220957006L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   protected String A() throws IOException, UnsupportedFlavorException {
      try {
         return (String)this.G.getData(DataFlavor.stringFlavor);
      } catch (Exception var2) {
         return null;
      }
   }

   @Override
   public void addKeyListener(KeyListener param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield com/pA_3.cT Ljava/util/List;
      // 08: iload 2
      // 09: ifeq 21
      // 0c: ifnull 28
      // 0f: goto 16
      // 12: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/pA_3.cT Ljava/util/List;
      // 1a: goto 21
      // 1d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 1
      // 22: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 27: pop
      // 28: return
   }

   public void b() {
      int var10000 = _y_2.y();
      Iterator var2 = J.keySet().iterator();
      int var1 = var10000;

      while (true) {
         if (var2.hasNext()) {
            BufferedImage var3 = (BufferedImage)J.get(var2.next());

            try {
               var3.getGraphics().dispose();
               if (var1 != 0) {
                  break;
               }

               if (var1 == 0) {
                  continue;
               }
            } catch (IllegalStateException var4) {
               throw a(var4);
            }
         }

         J.clear();
         this.m();
         this.A();
         break;
      }
   }

   private void m() {
      Object[] var10000 = com.c.a(1, 1);
      Method var18 = com.c.d(225394079158613941L);
      Object[] var50 = var10000;
      Method var35 = null;

      try {
         var10000 = (BufferedImage)var18.invoke(var35, var50);
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      BufferedImage var1 = var10000;
      Graphics2D var2 = var1.createGraphics();
      var10000 = com.c.f();
      Method var21 = com.c.d(270389152141252877L);
      var50 = var10000;
      var35 = null;

      try {
         var10000 = (Object[])var21.invoke(var35, var50);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      var35 = com.c.f();
      Method var10003 = com.c.d(121346227073341697L);
      var50 = (Object[])var35;
      var35 = var10000;
      Method var23 = var10003;

      try {
         var10000 = (nl_2)var23.invoke(var35, var50);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      nl_2 var3 = var10000;
      var50 = com.c.f();
      Method var10004 = com.c.d(446211275215857466L);
      Object[] var60 = var50;
      nl_2 var55 = var3;
      var35 = var10004;

      try {
         var41 = (K3)var35.invoke(var55, var60);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      this.d = var41;
      K3 var25 = this.d;
      Object[] var42 = com.c.f();
      var10003 = com.c.d(570146297653439641L);
      var50 = var42;
      K3 var43 = var25;
      Method var26 = var10003;

      try {
         var10000 = (Object[])var26.invoke(var43, var50);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      Object[] var44 = com.c.f();
      var10003 = com.c.d(419129657143452339L);
      var50 = var44;
      var35 = var10000;
      Method var28 = var10003;

      try {
         var10000 = (Font)var28.invoke(var35, var50);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      Font var4 = var10000;
      var2.setFont(var4);
      FontMetrics var5 = var2.getFontMetrics();
      float var6 = 1.0F;
      this.c4.width = var5.charWidth((char)a(18708, 7183158727673697250L));
      int var7 = var5.getHeight();
      this.c4.height = (int)Math.ceil((double)((float)var7 * var6));
      this.cJ = Math.max(0, (this.c4.height - var7) / 2 * 2);
      this.F = var5.getDescent();
      this.F = (int)((float)this.F + var6);
      this.F++;
      K3 var30 = this.d;
      Object[] var46 = com.c.f();
      var10003 = com.c.d(381284008132314530L);
      var50 = var46;
      K3 var47 = var30;
      Method var31 = var10003;

      try {
         var10000 = (Object[])var31.invoke(var47, var50);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      Object[] var48 = com.c.f();
      var10003 = com.c.d(419129657143452339L);
      var50 = var48;
      var35 = var10000;
      Method var33 = var10003;

      try {
         var10000 = (Font)var33.invoke(var35, var50);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      Font var8 = var10000;
      var2.setFont(var8);
      this.cy = var5.getDescent();
      byte var9 = 2;
      this.F += var9;
      this.cy += var9;
      this.cd = g(var5);
      if (!this.cd) {
      }

      var1.flush();
      var2.dispose();
   }

   void k(@NotNull com.Wq_2 var1) {
      this.W = var1;
   }

   @NotNull
   protected com.a6 U() {
      return new com.KI();
   }

   public xn_4 q() {
      return this.c;
   }

   @Override
   public void repaint() {
      this.Q.set(true);
   }

   private void h() {
      super.repaint();
   }

   protected void d() {
      this.L();
      this.A();
   }

   protected void L() {
      this.c_ = this.s();
      this.cL = this.c_.deriveFont(1);
      this.ck = this.c_.deriveFont(2);
      this.Z = this.c_.deriveFont(3);
      this.m();
   }

   public void A(@NotNull JScrollBar var1) {
      this.b();
      this.Q();
      this.L();
      this.setPreferredSize(new Dimension(this.g(), this.J()));
      this.setFocusable(true);
      this.enableInputMethods(true);
      this.setDoubleBuffered(true);
      this.setFocusTraversalKeysEnabled(false);
      this.addMouseMotionListener(new XH(this));
      this.addMouseWheelListener(this::lambda$init$0);
      this.addMouseListener(new com.Wu_2(this));
      this.addComponentListener(new com.dz_4(this));
      this.addHierarchyListener(new eT_3(this));
      this.cz = this.t.w();
      this.addFocusListener(new com.FK(this));
      this.i.addChangeListener(this::lambda$init$1);
      this.J();
   }

   private boolean B(@NotNull MouseEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield com/pA_3.Y I
      // 08: sipush 13238
      // 0b: ldc2_w 1922841304603175238
      // 0e: invokestatic com/pA_3.a (IJ)I
      // 11: iload 2
      // 12: ifne 36
      // 15: if_icmpne 3d
      // 18: goto 1f
      // 1b: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 1
      // 20: invokevirtual java/awt/event/MouseEvent.getButton ()I
      // 23: iload 2
      // 24: ifne 3a
      // 27: goto 2e
      // 2a: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: bipush 1
      // 2f: goto 36
      // 32: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: if_icmpne 3d
      // 39: bipush 1
      // 3a: goto 3e
      // 3d: bipush 0
      // 3e: ireturn
   }

   protected void i(@NotNull MouseWheelEvent param1, @NotNull JScrollBar param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: istore 3
      // 04: aload 1
      // 05: invokevirtual java/awt/event/MouseWheelEvent.isShiftDown ()Z
      // 08: iload 3
      // 09: ifne 21
      // 0c: ifne 4f
      // 0f: goto 16
      // 12: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual java/awt/event/MouseWheelEvent.getUnitsToScroll ()I
      // 1a: goto 21
      // 1d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: iload 3
      // 22: ifne 4c
      // 25: ifeq 4f
      // 28: goto 2f
      // 2b: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 1
      // 30: iload 3
      // 31: ifne 59
      // 34: goto 3b
      // 37: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: invokevirtual java/awt/event/MouseWheelEvent.getPreciseWheelRotation ()D
      // 3e: invokestatic java/lang/Math.abs (D)D
      // 41: ldc2_w 0.01
      // 44: dcmpg
      // 45: goto 4c
      // 48: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: ifge 50
      // 4f: return
      // 50: aload 0
      // 51: aload 1
      // 52: invokevirtual java/awt/event/MouseWheelEvent.getUnitsToScroll ()I
      // 55: invokespecial com/pA_3.b (I)V
      // 58: aload 1
      // 59: invokevirtual java/awt/event/MouseWheelEvent.consume ()V
      // 5c: return
   }

   private void u(@NotNull Point param1, boolean param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/_y_2.M ()I
      // 003: aload 0
      // 004: aload 1
      // 005: invokespecial com/pA_3.t (Ljava/awt/Point;)Lcom/Le_2;
      // 008: astore 4
      // 00a: aload 0
      // 00b: aload 4
      // 00d: invokespecial com/pA_3.S (Lcom/Le_2;)Lcom/Yw_2;
      // 010: astore 5
      // 012: istore 3
      // 013: aload 5
      // 015: iload 3
      // 016: ifeq 025
      // 019: ifnull 02b
      // 01c: goto 023
      // 01f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: aload 5
      // 025: invokevirtual com/Yw_2.g ()Lcom/yA_3;
      // 028: goto 02c
      // 02b: aconst_null
      // 02c: astore 6
      // 02e: aload 6
      // 030: invokestatic com/yO_3.e (Lcom/yA_3;)Lcom/oX_3;
      // 033: astore 7
      // 035: iload 3
      // 036: ifeq 095
      // 039: aload 7
      // 03b: aload 0
      // 03c: getfield com/pA_3.B Lcom/oX_3;
      // 03f: if_acmpeq 08f
      // 042: goto 049
      // 045: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 048: athrow
      // 049: aload 0
      // 04a: getfield com/pA_3.B Lcom/oX_3;
      // 04d: iload 3
      // 04e: ifeq 074
      // 051: goto 058
      // 054: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: ifnull 072
      // 05b: goto 062
      // 05e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: aload 0
      // 063: getfield com/pA_3.B Lcom/oX_3;
      // 066: invokeinterface com/oX_3.a ()V 1
      // 06b: goto 072
      // 06e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071: athrow
      // 072: aload 7
      // 074: ifnull 08f
      // 077: aload 0
      // 078: aload 4
      // 07a: aload 5
      // 07c: invokespecial com/pA_3.j (Lcom/Le_2;Lcom/Yw_2;)Lcom/Ws_2;
      // 07f: astore 8
      // 081: aload 7
      // 083: aload 0
      // 084: aload 0
      // 085: aload 8
      // 087: invokespecial com/pA_3.C (Lcom/Ws_2;)Ljava/awt/Rectangle;
      // 08a: invokeinterface com/oX_3.a (Ljavax/swing/JComponent;Ljava/awt/Rectangle;)V 3
      // 08f: aload 0
      // 090: aload 7
      // 092: putfield com/pA_3.B Lcom/oX_3;
      // 095: iload 3
      // 096: ifeq 10a
      // 099: aload 5
      // 09b: ifnull 105
      // 09e: goto 0a5
      // 0a1: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: aload 5
      // 0a7: invokevirtual com/Yw_2.i ()Lcom/KO;
      // 0aa: getstatic com/KO.ALWAYS Lcom/KO;
      // 0ad: iload 3
      // 0ae: ifeq 0d1
      // 0b1: goto 0b8
      // 0b4: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b7: athrow
      // 0b8: if_acmpeq 0ea
      // 0bb: goto 0c2
      // 0be: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c1: athrow
      // 0c2: aload 5
      // 0c4: invokevirtual com/Yw_2.i ()Lcom/KO;
      // 0c7: getstatic com/KO.HOVER Lcom/KO;
      // 0ca: goto 0d1
      // 0cd: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d0: athrow
      // 0d1: if_acmpne 105
      // 0d4: iload 2
      // 0d5: iload 3
      // 0d6: ifeq 119
      // 0d9: goto 0e0
      // 0dc: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df: athrow
      // 0e0: ifeq 105
      // 0e3: goto 0ea
      // 0e6: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9: athrow
      // 0ea: aload 0
      // 0eb: sipush 19833
      // 0ee: ldc2_w 335476109381261230
      // 0f1: invokestatic com/pA_3.a (IJ)I
      // 0f4: invokespecial com/pA_3.x (I)V
      // 0f7: aload 0
      // 0f8: aload 5
      // 0fa: invokevirtual com/Yw_2.g ()Lcom/yA_3;
      // 0fd: putfield com/pA_3.cV Lcom/yA_3;
      // 100: return
      // 101: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 104: athrow
      // 105: aload 0
      // 106: aconst_null
      // 107: putfield com/pA_3.cV Lcom/yA_3;
      // 10a: aload 0
      // 10b: iload 3
      // 10c: ifeq 129
      // 10f: getfield com/pA_3.Y I
      // 112: goto 119
      // 115: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 118: athrow
      // 119: ifeq 12c
      // 11c: aload 0
      // 11d: bipush 0
      // 11e: invokespecial com/pA_3.x (I)V
      // 121: aload 0
      // 122: goto 129
      // 125: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 128: athrow
      // 129: invokevirtual com/pA_3.repaint ()V
      // 12c: return
   }

   @NotNull
   private com.Ws_2 j(@NotNull com.Le_2 var1, @NotNull com.Yw_2 var2) {
      int var10000 = _y_2.y();
      int var4 = var1.N();
      int var3 = var10000;

      while (var4 > 0) {
         try {
            if (var2 != this.V.l(var4 - 1, var1.G())) {
               break;
            }

            var4--;
            if (var3 != 0) {
               break;
            }
         } catch (IllegalStateException var7) {
            throw a(var7);
         }
      }

      int var5 = var1.N();

      while (var5 < this.V.B() - 1) {
         try {
            if (var2 != this.V.l(var5 + 1, var1.G())) {
               break;
            }

            var5++;
            if (var3 != 0) {
               break;
            }
         } catch (IllegalStateException var6) {
            throw a(var6);
         }
      }

      return new com.Ws_2(var1.G(), var4, var5);
   }

   private void J(Component var1, boolean var2) {
      int var10000 = _y_2.M();
      PointerInfo var4 = MouseInfo.getPointerInfo();
      int var3 = var10000;

      label20: {
         try {
            var7 = var4;
            if (var3 == 0) {
               break label20;
            }

            if (var4 == null) {
               return;
            }
         } catch (IllegalStateException var6) {
            throw a(var6);
         }

         var7 = var4;
      }

      Point var5 = var7.getLocation();
      SwingUtilities.convertPointFromScreen(var5, var1);
      this.u(var5, var2);
   }

   @Nullable
   private com.Yw_2 s(@NotNull Point var1) {
      return this.S(this.t(var1));
   }

   @Nullable
   private com.Yw_2 S(@Nullable com.Le_2 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 14
      // 09: ifnull a9
      // 0c: goto 13
      // 0f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 1
      // 14: invokevirtual com/Le_2.N ()I
      // 17: iload 2
      // 18: ifne 30
      // 1b: iflt a9
      // 1e: goto 25
      // 21: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 1
      // 26: invokevirtual com/Le_2.N ()I
      // 29: goto 30
      // 2c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: aload 0
      // 31: getfield com/pA_3.V Lcom/im_4;
      // 34: invokevirtual com/im_4.B ()I
      // 37: iload 2
      // 38: ifne 58
      // 3b: if_icmpge a9
      // 3e: goto 45
      // 41: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: aload 1
      // 46: invokevirtual com/Le_2.G ()I
      // 49: aload 0
      // 4a: getfield com/pA_3.V Lcom/im_4;
      // 4d: invokevirtual com/im_4.H ()I
      // 50: ineg
      // 51: goto 58
      // 54: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: iload 2
      // 59: ifne 78
      // 5c: if_icmplt a9
      // 5f: goto 66
      // 62: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: aload 1
      // 67: invokevirtual com/Le_2.G ()I
      // 6a: aload 0
      // 6b: getfield com/pA_3.V Lcom/im_4;
      // 6e: invokevirtual com/im_4.O ()I
      // 71: goto 78
      // 74: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 77: athrow
      // 78: if_icmpgt a9
      // 7b: aload 0
      // 7c: getfield com/pA_3.V Lcom/im_4;
      // 7f: aload 1
      // 80: invokevirtual com/Le_2.N ()I
      // 83: aload 1
      // 84: invokevirtual com/Le_2.G ()I
      // 87: invokevirtual com/im_4.l (II)Lcom/YP;
      // 8a: astore 3
      // 8b: aload 3
      // 8c: iload 2
      // 8d: ifne a5
      // 90: instanceof com/Yw_2
      // 93: ifeq a9
      // 96: goto 9d
      // 99: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9c: athrow
      // 9d: aload 3
      // 9e: goto a5
      // a1: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a4: athrow
      // a5: checkcast com/Yw_2
      // a8: areturn
      // a9: aconst_null
      // aa: areturn
   }

   private void x(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: istore 2
      // 04: iload 2
      // 05: ifne 23
      // 08: iload 1
      // 09: aload 0
      // 0a: getfield com/pA_3.Y I
      // 0d: if_icmpeq 32
      // 10: goto 17
      // 13: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 0
      // 18: iload 1
      // 19: putfield com/pA_3.Y I
      // 1c: goto 23
      // 1f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: aload 0
      // 24: new java/awt/Cursor
      // 27: dup
      // 28: aload 0
      // 29: getfield com/pA_3.Y I
      // 2c: invokespecial java/awt/Cursor.<init> (I)V
      // 2f: invokevirtual com/pA_3.setCursor (Ljava/awt/Cursor;)V
      // 32: return
   }

   private void J$void() {
      Method var10001 = (Method)com.c.c(388376917454860932L).get(null);
      Object[] var10002 = com.c.a(new com.Bl_2(this), a(10759, 3200006095109402836L) / this.cK);
      Method var10004 = com.c.d(201859364639460244L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var3 = (gH)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      this.b = var3;
   }

   public boolean m(MouseEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield com/pA_3.t Lcom/rx_4;
      // 08: invokeinterface com/rx_4.Z ()Z 1
      // 0d: iload 2
      // 0e: ifeq 40
      // 11: ifne 38
      // 14: goto 1b
      // 17: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 0
      // 1c: invokespecial com/pA_3.X ()Z
      // 1f: iload 2
      // 20: ifeq 40
      // 23: goto 2a
      // 26: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 1
      // 2b: invokevirtual java/awt/event/MouseEvent.isShiftDown ()Z
      // 2e: if_icmpne 43
      // 31: goto 38
      // 34: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: bipush 1
      // 39: goto 40
      // 3c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: goto 44
      // 43: bipush 0
      // 44: ireturn
   }

   public boolean b(MouseEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: istore 2
      // 04: aload 0
      // 05: invokespecial com/pA_3.X ()Z
      // 08: iload 2
      // 09: ifeq 21
      // 0c: ifeq 33
      // 0f: goto 16
      // 12: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual java/awt/event/MouseEvent.isShiftDown ()Z
      // 1a: goto 21
      // 1d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: iload 2
      // 22: ifeq 30
      // 25: ifne 33
      // 28: goto 2f
      // 2b: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   protected boolean W$boolean() {
      return com.QP.D();
   }

   public void V(int var1) {
      this.c5 = var1;
   }

   public void t(com.ab_2 var1) {
      this.cE = var1;
   }

   public void z(com.WZ var1) {
      this.l = var1;
      this.repaint();
   }

   public com.WZ f() {
      return this.l;
   }

   @Nullable
   public com.WZ I() {
      return this.b(false);
   }

   @Nullable
   public com.WZ e$comWZ() {
      return this.b(true);
   }

   @Nullable
   protected com.WZ b$comWZ(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield com/pA_3.l Lcom/WZ;
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifnull f9
      // 0f: goto 16
      // 12: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/pA_3.l Lcom/WZ;
      // 1a: goto 21
      // 1d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: invokevirtual com/WZ.B ()Ljava/util/List;
      // 24: invokeinterface java/util/List.isEmpty ()Z 1
      // 29: iload 2
      // 2a: ifne 38
      // 2d: ifne f9
      // 30: goto 37
      // 33: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: iload 1
      // 38: ifeq 49
      // 3b: aload 0
      // 3c: getfield com/pA_3.l Lcom/WZ;
      // 3f: invokevirtual com/WZ.T ()Lcom/pE_3;
      // 42: goto 50
      // 45: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48: athrow
      // 49: aload 0
      // 4a: getfield com/pA_3.l Lcom/WZ;
      // 4d: invokevirtual com/WZ.U ()Lcom/pE_3;
      // 50: astore 3
      // 51: aload 0
      // 52: new com/rU_3
      // 55: dup
      // 56: new com/XE
      // 59: dup
      // 5a: aload 3
      // 5b: invokevirtual com/pE_3.s ()Lcom/XE;
      // 5e: getfield com/XE.q I
      // 61: aload 3
      // 62: invokevirtual com/pE_3.s ()Lcom/XE;
      // 65: getfield com/XE.r I
      // 68: aload 0
      // 69: getfield com/pA_3.V Lcom/im_4;
      // 6c: invokevirtual com/im_4.H ()I
      // 6f: isub
      // 70: invokespecial com/XE.<init> (II)V
      // 73: new com/XE
      // 76: dup
      // 77: aload 3
      // 78: invokevirtual com/pE_3.E ()Lcom/XE;
      // 7b: getfield com/XE.q I
      // 7e: aload 3
      // 7f: invokevirtual com/pE_3.E ()Lcom/XE;
      // 82: getfield com/XE.r I
      // 85: aload 0
      // 86: getfield com/pA_3.V Lcom/im_4;
      // 89: invokevirtual com/im_4.H ()I
      // 8c: isub
      // 8d: invokespecial com/XE.<init> (II)V
      // 90: invokespecial com/rU_3.<init> (Lcom/XE;Lcom/XE;)V
      // 93: putfield com/pA_3.e Lcom/rU_3;
      // 96: aload 0
      // 97: iload 2
      // 98: ifne e7
      // 9b: getfield com/pA_3.e Lcom/rU_3;
      // 9e: invokevirtual com/rU_3.N ()Lcom/XE;
      // a1: getfield com/XE.r I
      // a4: aload 0
      // a5: invokevirtual com/pA_3.H ()Lcom/im_4;
      // a8: invokevirtual com/im_4.O ()I
      // ab: bipush 2
      // ac: idiv
      // ad: if_icmpge df
      // b0: goto b7
      // b3: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b6: athrow
      // b7: aload 0
      // b8: getfield com/pA_3.i Ljavax/swing/BoundedRangeModel;
      // bb: aload 0
      // bc: getfield com/pA_3.e Lcom/rU_3;
      // bf: invokevirtual com/rU_3.N ()Lcom/XE;
      // c2: getfield com/XE.r I
      // c5: aload 0
      // c6: invokevirtual com/pA_3.H ()Lcom/im_4;
      // c9: invokevirtual com/im_4.O ()I
      // cc: bipush 2
      // cd: idiv
      // ce: isub
      // cf: invokeinterface javax/swing/BoundedRangeModel.setValue (I)V 2
      // d4: iload 2
      // d5: ifeq f0
      // d8: goto df
      // db: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // de: athrow
      // df: aload 0
      // e0: goto e7
      // e3: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e6: athrow
      // e7: getfield com/pA_3.i Ljavax/swing/BoundedRangeModel;
      // ea: bipush 0
      // eb: invokeinterface javax/swing/BoundedRangeModel.setValue (I)V 2
      // f0: aload 0
      // f1: invokevirtual com/pA_3.repaint ()V
      // f4: aload 0
      // f5: getfield com/pA_3.l Lcom/WZ;
      // f8: areturn
      // f9: aconst_null
      // fa: areturn
   }

   @Override
   public void W(com.YT var1) {
      this.x = var1;
   }

   private boolean X() {
      try {
         if (this.x != com.YT.MOUSE_REPORTING_NONE) {
            return true;
         }
      } catch (IllegalStateException var1) {
         throw a(var1);
      }

      return false;
   }

   private void R() {
      byte var1 = 1;
      int var2 = this.w.T.r - 1;

      try {
         if (var2 + var1 >= this.i.getValue() + this.i.getExtent()) {
            this.i.setValue(0);
         }
      } catch (IllegalStateException var3) {
         throw a(var3);
      }
   }

   private void f$void() {
      this.b(-this.N.c());
   }

   private void q$void() {
      this.b(this.N.c());
   }

   private void p() {
      this.b(-1);
   }

   private void t() {
      this.b(1);
   }

   private void b(int var1) {
      this.i.setValue(this.i.getValue() + var1);
   }

   protected Font s() {
      return this.t.Z();
   }

   @NotNull
   private XE z(Point var1) {
      com.Le_2 var2 = this.t(var1);
      return new XE(var2.N(), var2.G());
   }

   @NotNull
   private com.Le_2 t(@NotNull Point var1) {
      int var2 = Math.min((var1.x - this.p()) / this.c4.width, this.U() - 1);
      var2 = Math.max(0, var2);
      int var3 = Math.min(var1.y / this.c4.height, this.L() - 1) + this.P;
      return new com.Le_2(var3, var2);
   }

   private void u(@Nullable XE var1, @Nullable XE var2, boolean var3) {
      int var4 = _y_2.M();

      XE var10000;
      label44: {
         try {
            var10000 = var1;
            if (var4 == 0) {
               break label44;
            }

            if (var1 == null) {
               return;
            }
         } catch (IllegalStateException var8) {
            throw a(var8);
         }

         var10000 = var2;
      }

      label38: {
         try {
            if (var4 == 0) {
               break label38;
            }

            if (var10000 == null) {
               return;
            }
         } catch (IllegalStateException var7) {
            throw a(var7);
         }

         var10000 = var1;
      }

      String var5 = com.a7.v(var10000, var2, this.V);

      try {
         if (var5.length() != 0) {
            this.v.L(var5, var3);
         }
      } catch (IllegalStateException var6) {
         throw a(var6);
      }
   }

   private void w(boolean var1) {
      int var10000 = _y_2.y();
      String var3 = this.v.y(var1);
      int var2 = var10000;

      try {
         if (var3 == null) {
            return;
         }
      } catch (RuntimeException var5) {
         throw a(var5);
      }

      try {
         label54: {
            label55: {
               label46: {
                  try {
                     var9 = com.QP.l;
                     if (var2 != 0) {
                        break label55;
                     }

                     if (com.QP.l) {
                        break label46;
                     }
                  } catch (RuntimeException var7) {
                     throw a(var7);
                  }

                  var3 = var3.replace(a(8959, -23958), "\n");
               }

               var3 = var3.replace((char)a(3818, 4017640413363442733L), (char)a(17557, 477768683314601593L));

               try {
                  var10 = this;
                  if (var2 != 0) {
                     break label54;
                  }

                  var9 = this.r;
               } catch (RuntimeException var6) {
                  throw a(var6);
               }
            }

            if (var9) {
               var3 = a(8952, -12528) + var3 + a(8955, -25606);
            }

            var10 = this;
         }

         var10.cc.s(var3, true);
      } catch (RuntimeException var8) {
         cl.info("", (Throwable)var8);
      }
   }

   @Nullable
   private String C$String() {
      return this.v.y(false);
   }

   protected void l(Graphics2D var1, BufferedImage var2, int var3, int var4, ImageObserver var5) {
      var1.drawImage(var2, var3, var4, var2.getWidth(), var2.getHeight(), var5);
   }

   protected BufferedImage L(int var1, int var2) {
      return new BufferedImage(var1, var2, 1);
   }

   @Nullable
   public com.OT n() {
      int var10000 = _y_2.y();
      int var2 = (this.getWidth() - this.p()) / this.c4.width;
      int var3 = this.getHeight() / this.c4.height;
      int var1 = var10000;

      label27: {
         try {
            var10000 = var3;
            if (var1 != 0) {
               break label27;
            }

            if (var3 <= 0) {
               return null;
            }
         } catch (IllegalStateException var5) {
            throw a(var5);
         }

         var10000 = var2;
      }

      try {
         if (var10000 > 0) {
            return new com.OT(var2, var3);
         }
      } catch (IllegalStateException var4) {
         throw a(var4);
      }

      return null;
   }

   private void G() {
      SwingUtilities.invokeLater(new ny_4(this));
   }

   private void A$void() {
      SwingUtilities.invokeLater(new com.Yu_2(this));
   }

   public void v(E0 var1) {
      this.cc = var1;
      this.A();
   }

   public void G(@NotNull KeyListener var1) {
      this.cT.add(var1);
   }

   public void q(@NotNull KeyListener var1) {
      this.cT.remove(var1);
   }

   @Override
   public void c(@NotNull com.OT param1, wF_3 param2, int param3, int param4, nO_3 param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: istore 6
      // 05: iload 6
      // 07: ifne 4d
      // 0a: aload 1
      // 0b: aload 0
      // 0c: getfield com/pA_3.N Lcom/OT;
      // 0f: invokevirtual com/OT.equals (Ljava/lang/Object;)Z
      // 12: ifne 7a
      // 15: goto 1c
      // 18: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield com/pA_3.V Lcom/im_4;
      // 20: aload 1
      // 21: aload 2
      // 22: iload 3
      // 23: iload 4
      // 25: aload 5
      // 27: aload 0
      // 28: getfield com/pA_3.u Lcom/rU_3;
      // 2b: invokevirtual com/im_4.h (Lcom/OT;Lcom/wF_3;IILcom/nO_3;Lcom/rU_3;)V
      // 2e: aload 0
      // 2f: aload 1
      // 30: putfield com/pA_3.N Lcom/OT;
      // 33: aload 0
      // 34: new java/awt/Dimension
      // 37: dup
      // 38: aload 0
      // 39: invokevirtual com/pA_3.g ()I
      // 3c: aload 0
      // 3d: invokevirtual com/pA_3.J ()I
      // 40: invokespecial java/awt/Dimension.<init> (II)V
      // 43: invokevirtual com/pA_3.setPreferredSize (Ljava/awt/Dimension;)V
      // 46: goto 4d
      // 49: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: aload 0
      // 4e: iload 6
      // 50: ifne 72
      // 53: getfield com/pA_3.c Lcom/xn_4;
      // 56: ifnull 71
      // 59: goto 60
      // 5c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f: athrow
      // 60: aload 0
      // 61: aload 2
      // 62: invokedynamic run (Lcom/pA_3;Lcom/wF_3;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/pA_3.lambda$requestResize$2 (Lcom/wF_3;)V, ()V ]
      // 67: invokestatic javax/swing/SwingUtilities.invokeLater (Ljava/lang/Runnable;)V
      // 6a: goto 71
      // 6d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 70: athrow
      // 71: aload 0
      // 72: invokedynamic run (Lcom/pA_3;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/pA_3.lambda$requestResize$3 ()V, ()V ]
      // 77: invokestatic javax/swing/SwingUtilities.invokeLater (Ljava/lang/Runnable;)V
      // 7a: return
   }

   public void H(xn_4 var1) {
      this.c = var1;
   }

   private float S() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 3e
      // 09: getfield com/pA_3.V Lcom/im_4;
      // 0c: invokevirtual com/im_4.T ()Z
      // 0f: ifeq 3d
      // 12: goto 19
      // 15: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield com/pA_3.t Lcom/rx_4;
      // 1d: iload 1
      // 1e: ifeq 41
      // 21: goto 28
      // 24: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: invokeinterface com/rx_4.a ()Z 1
      // 2d: ifeq 3d
      // 30: goto 37
      // 33: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: fconst_1
      // 38: freturn
      // 39: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield com/pA_3.t Lcom/rx_4;
      // 41: invokeinterface com/rx_4.N ()F 1
      // 46: freturn
   }

   private static boolean g(FontMetrics param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 1
      // 01: istore 2
      // 02: invokestatic com/_y_2.y ()I
      // 05: bipush -1
      // 06: istore 3
      // 07: bipush 0
      // 08: istore 4
      // 0a: istore 1
      // 0b: iload 4
      // 0d: sipush 20807
      // 10: ldc2_w 1566352125640494002
      // 13: invokestatic com/pA_3.a (IJ)I
      // 16: if_icmpge a4
      // 19: iload 4
      // 1b: invokestatic java/lang/Character.isValidCodePoint (I)Z
      // 1e: iload 1
      // 1f: ifne a5
      // 22: iload 1
      // 23: ifne 41
      // 26: goto 2d
      // 29: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: ifeq 9d
      // 30: goto 37
      // 33: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: iload 4
      // 39: i2c
      // 3a: goto 41
      // 3d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: istore 5
      // 43: iload 1
      // 44: ifne a0
      // 47: iload 5
      // 49: invokestatic com/pA_3.p (C)Z
      // 4c: ifeq 9d
      // 4f: goto 56
      // 52: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: aload 0
      // 57: iload 5
      // 59: invokevirtual java/awt/FontMetrics.charWidth (C)I
      // 5c: istore 6
      // 5e: iload 3
      // 5f: iload 1
      // 60: ifne 9c
      // 63: bipush -1
      // 64: if_icmpeq 93
      // 67: goto 6e
      // 6a: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d: athrow
      // 6e: iload 6
      // 70: iload 1
      // 71: ifne 8e
      // 74: goto 7b
      // 77: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a: athrow
      // 7b: iload 3
      // 7c: if_icmpeq 9d
      // 7f: goto 86
      // 82: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 85: athrow
      // 86: bipush 0
      // 87: goto 8e
      // 8a: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8d: athrow
      // 8e: istore 2
      // 8f: iload 1
      // 90: ifeq a4
      // 93: iload 6
      // 95: goto 9c
      // 98: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9b: athrow
      // 9c: istore 3
      // 9d: iinc 4 1
      // a0: iload 1
      // a1: ifeq 0b
      // a4: iload 2
      // a5: ireturn
   }

   private static boolean p(char var0) {
      return Character.isLetterOrDigit(var0);
   }

   protected void W(Graphics param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 1e
      // 09: instanceof java/awt/Graphics2D
      // 0c: ifeq 5f
      // 0f: goto 16
      // 12: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 1
      // 17: goto 1e
      // 1a: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: checkcast java/awt/Graphics2D
      // 21: astore 3
      // 22: aload 0
      // 23: getfield com/pA_3.t Lcom/rx_4;
      // 26: iload 2
      // 27: ifne 43
      // 2a: invokeinterface com/rx_4.D ()Z 1
      // 2f: ifeq 46
      // 32: goto 39
      // 35: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: getstatic java/awt/RenderingHints.VALUE_TEXT_ANTIALIAS_ON Ljava/lang/Object;
      // 3c: goto 43
      // 3f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: goto 49
      // 46: getstatic java/awt/RenderingHints.VALUE_TEXT_ANTIALIAS_OFF Ljava/lang/Object;
      // 49: astore 4
      // 4b: new java/awt/RenderingHints
      // 4e: dup
      // 4f: getstatic java/awt/RenderingHints.KEY_TEXT_ANTIALIASING Ljava/awt/RenderingHints$Key;
      // 52: aload 4
      // 54: invokespecial java/awt/RenderingHints.<init> (Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
      // 57: astore 5
      // 59: aload 3
      // 5a: aload 5
      // 5c: invokevirtual java/awt/Graphics2D.setRenderingHints (Ljava/util/Map;)V
      // 5f: return
   }

   @NotNull
   @Override
   public Color getBackground() {
      return this.r(this.cY.c());
   }

   @NotNull
   private Color r(@NotNull Et_2 var1) {
      return com.lG_3.H(this.R().o(var1));
   }

   @NotNull
   @Override
   public Color getForeground() {
      return this.s(this.cY.A());
   }

   @NotNull
   private Color s$Color(@NotNull Et_2 var1) {
      return com.lG_3.H(this.R().Y(var1));
   }

   @Override
   public void paintComponent(Graphics param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: invokestatic java/lang/System.currentTimeMillis ()J
      // 06: lstore 3
      // 07: istore 2
      // 08: iload 2
      // 09: ifne 42
      // 0c: ldc2_w 413132319533195410
      // 0f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 12: aconst_null
      // 13: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 16: ifeq 46
      // 19: goto 20
      // 1c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield com/pA_3.m Llt_4;
      // 24: aload 1
      // 25: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 28: ldc2_w 478374544918577864
      // 2b: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2e: dup_x2
      // 2f: pop
      // 30: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 33: pop
      // 34: goto 3b
      // 37: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: goto 42
      // 3e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: iload 2
      // 43: ifeq 52
      // 46: aload 0
      // 47: aload 1
      // 48: invokevirtual com/pA_3.h (Ljava/awt/Graphics;)V
      // 4b: goto 52
      // 4e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51: athrow
      // 52: aload 0
      // 53: iload 2
      // 54: ifne 88
      // 57: getfield com/pA_3.V Lcom/im_4;
      // 5a: invokevirtual com/im_4.u ()Z
      // 5d: ifne 80
      // 60: goto 67
      // 63: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 66: athrow
      // 67: aload 0
      // 68: iload 2
      // 69: ifne 88
      // 6c: goto 73
      // 6f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72: athrow
      // 73: getfield com/pA_3.cS Z
      // 76: ifeq b4
      // 79: goto 80
      // 7c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f: athrow
      // 80: aload 0
      // 81: goto 88
      // 84: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 87: athrow
      // 88: iload 2
      // 89: ifne b0
      // 8c: getfield com/pA_3.L Lcom/_y_2;
      // 8f: ifnull a7
      // 92: goto 99
      // 95: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 98: athrow
      // 99: aload 0
      // 9a: getfield com/pA_3.L Lcom/_y_2;
      // 9d: invokevirtual com/_y_2.l ()V
      // a0: goto a7
      // a3: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a6: athrow
      // a7: aload 0
      // a8: getfield com/pA_3.V Lcom/im_4;
      // ab: bipush 0
      // ac: invokevirtual com/im_4.d (Z)V
      // af: aload 0
      // b0: bipush 0
      // b1: putfield com/pA_3.cS Z
      // b4: return
   }

   private void g$void() {
      this.a = null;
      this.cp = null;
   }

   @NotNull
   private com.YP Y(@NotNull com.YP param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 23
      // 09: getfield com/pA_3.t Lcom/rx_4;
      // 0c: invokeinterface com/rx_4.m ()Z 1
      // 11: ifeq 28
      // 14: goto 1b
      // 17: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 0
      // 1c: goto 23
      // 1f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: aload 1
      // 24: invokespecial com/pA_3.y (Lcom/YP;)Lcom/YP;
      // 27: areturn
      // 28: aload 1
      // 29: invokevirtual com/YP.n ()Lcom/aG;
      // 2c: astore 3
      // 2d: aload 0
      // 2e: invokespecial com/pA_3.J ()Lcom/YP;
      // 31: astore 4
      // 33: aload 3
      // 34: aload 4
      // 36: invokevirtual com/YP.s ()Lcom/Et_2;
      // 39: invokevirtual com/aG.j (Lcom/Et_2;)Lcom/aG;
      // 3c: pop
      // 3d: aload 3
      // 3e: aload 4
      // 40: invokevirtual com/YP.K ()Lcom/Et_2;
      // 43: invokevirtual com/aG.c (Lcom/Et_2;)Lcom/aG;
      // 46: pop
      // 47: aload 3
      // 48: iload 2
      // 49: ifeq 67
      // 4c: instanceof com/am_2
      // 4f: ifeq 66
      // 52: goto 59
      // 55: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58: athrow
      // 59: aload 3
      // 5a: checkcast com/am_2
      // 5d: bipush 1
      // 5e: invokevirtual com/am_2.I (Z)Lcom/Yw_2;
      // 61: areturn
      // 62: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: aload 3
      // 67: invokevirtual com/aG.y ()Lcom/YP;
      // 6a: areturn
   }

   @NotNull
   private com.YP J$comYP() {
      int var10000 = _y_2.M();
      com.YP var2 = this.a;
      int var1 = var10000;

      try {
         if (var1 == 0) {
            return var2;
         }

         if (var2 != null) {
            return var2;
         }
      } catch (IllegalStateException var3) {
         throw a(var3);
      }

      var2 = this.t.z();
      this.a = var2;
      return var2;
   }

   @NotNull
   private com.YP m$comYP() {
      int var10000 = _y_2.M();
      com.YP var2 = this.cp;
      int var1 = var10000;

      try {
         if (var1 == 0) {
            return var2;
         }

         if (var2 != null) {
            return var2;
         }
      } catch (IllegalStateException var3) {
         throw a(var3);
      }

      var2 = this.t.i();
      this.cp = var2;
      return var2;
   }

   @NotNull
   private com.YP Z(@NotNull com.YP var1) {
      com.YP var2 = var1.q();
      com.YP var3 = this.t.i();
      var2.d(var3.s());
      var2.p(var3.K());
      var2.t(true);
      return var2;
   }

   private void d(Graphics2D param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: istore 2
      // 04: aload 0
      // 05: invokespecial com/pA_3.e ()Z
      // 08: iload 2
      // 09: ifeq 33
      // 0c: ifeq dd
      // 0f: goto 16
      // 12: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/pA_3.w Lcom/d__2;
      // 1a: invokevirtual com/d__2.Q ()I
      // 1d: bipush 1
      // 1e: iadd
      // 1f: aload 0
      // 20: getfield com/pA_3.c4 Ljava/awt/Dimension;
      // 23: getfield java/awt/Dimension.width I
      // 26: imul
      // 27: aload 0
      // 28: invokevirtual com/pA_3.p ()I
      // 2b: iadd
      // 2c: goto 33
      // 2f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: istore 3
      // 34: aload 0
      // 35: getfield com/pA_3.w Lcom/d__2;
      // 38: invokevirtual com/d__2.O ()I
      // 3b: bipush 1
      // 3c: iadd
      // 3d: istore 4
      // 3f: iload 4
      // 41: aload 0
      // 42: getfield com/pA_3.c4 Ljava/awt/Dimension;
      // 45: getfield java/awt/Dimension.height I
      // 48: imul
      // 49: bipush 3
      // 4a: isub
      // 4b: istore 5
      // 4d: aload 0
      // 4e: getfield com/pA_3.cf Ljava/lang/String;
      // 51: invokevirtual java/lang/String.length ()I
      // 54: aload 0
      // 55: getfield com/pA_3.c4 Ljava/awt/Dimension;
      // 58: getfield java/awt/Dimension.width I
      // 5b: imul
      // 5c: istore 6
      // 5e: aload 1
      // 5f: aload 0
      // 60: invokevirtual com/pA_3.getBackground ()Ljava/awt/Color;
      // 63: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 66: aload 1
      // 67: iload 3
      // 68: iload 4
      // 6a: bipush 1
      // 6b: isub
      // 6c: aload 0
      // 6d: getfield com/pA_3.c4 Ljava/awt/Dimension;
      // 70: getfield java/awt/Dimension.height I
      // 73: imul
      // 74: bipush 3
      // 75: isub
      // 76: iload 6
      // 78: aload 0
      // 79: getfield com/pA_3.c4 Ljava/awt/Dimension;
      // 7c: getfield java/awt/Dimension.height I
      // 7f: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 82: aload 1
      // 83: aload 0
      // 84: invokevirtual com/pA_3.getForeground ()Ljava/awt/Color;
      // 87: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 8a: aload 1
      // 8b: aload 0
      // 8c: getfield com/pA_3.c_ Ljava/awt/Font;
      // 8f: invokevirtual java/awt/Graphics2D.setFont (Ljava/awt/Font;)V
      // 92: aload 1
      // 93: aload 0
      // 94: getfield com/pA_3.cf Ljava/lang/String;
      // 97: iload 3
      // 98: iload 5
      // 9a: invokevirtual java/awt/Graphics2D.drawString (Ljava/lang/String;II)V
      // 9d: aload 1
      // 9e: invokevirtual java/awt/Graphics2D.getStroke ()Ljava/awt/Stroke;
      // a1: astore 7
      // a3: new java/awt/BasicStroke
      // a6: dup
      // a7: fconst_1
      // a8: bipush 1
      // a9: bipush 1
      // aa: fconst_0
      // ab: bipush 4
      // ac: newarray 6
      // ae: dup
      // af: bipush 0
      // b0: fconst_0
      // b1: fastore
      // b2: dup
      // b3: bipush 1
      // b4: fconst_2
      // b5: fastore
      // b6: dup
      // b7: bipush 2
      // b8: fconst_0
      // b9: fastore
      // ba: dup
      // bb: bipush 3
      // bc: fconst_2
      // bd: fastore
      // be: fconst_0
      // bf: invokespecial java/awt/BasicStroke.<init> (FIIF[FF)V
      // c2: astore 8
      // c4: aload 1
      // c5: aload 8
      // c7: invokevirtual java/awt/Graphics2D.setStroke (Ljava/awt/Stroke;)V
      // ca: aload 1
      // cb: iload 3
      // cc: iload 5
      // ce: iload 3
      // cf: iload 6
      // d1: iadd
      // d2: iload 5
      // d4: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // d7: aload 1
      // d8: aload 7
      // da: invokevirtual java/awt/Graphics2D.setStroke (Ljava/awt/Stroke;)V
      // dd: return
   }

   private boolean e$boolean() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/pA_3.cf Ljava/lang/String;
      // 08: iload 1
      // 09: ifne 21
      // 0c: ifnull 36
      // 0f: goto 16
      // 12: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/pA_3.cf Ljava/lang/String;
      // 1a: goto 21
      // 1d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: invokevirtual java/lang/String.length ()I
      // 24: iload 1
      // 25: ifne 33
      // 28: ifle 36
      // 2b: goto 32
      // 2e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   private boolean l(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield com/pA_3.u Lcom/rU_3;
      // 08: iload 3
      // 09: ifeq 21
      // 0c: ifnull 3f
      // 0f: goto 16
      // 12: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/pA_3.u Lcom/rU_3;
      // 1a: goto 21
      // 1d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: new com/XE
      // 24: dup
      // 25: iload 1
      // 26: iload 2
      // 27: invokespecial com/XE.<init> (II)V
      // 2a: invokevirtual com/rU_3.s (Lcom/XE;)Z
      // 2d: iload 3
      // 2e: ifeq 3c
      // 31: ifeq 3f
      // 34: goto 3b
      // 37: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: bipush 1
      // 3c: goto 40
      // 3f: bipush 0
      // 40: ireturn
   }

   @Override
   public void processKeyEvent(KeyEvent var1) {
      this.T(var1);
      this.J(var1.getComponent(), var1.isControlDown());
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void T(@NotNull KeyEvent var1) {
      int var10000 = _y_2.M();
      int var3 = var1.getID();
      int var2 = var10000;

      int var10001;
      label124: {
         label113: {
            try {
               var10000 = var3;
               var10001 = a(24511, 3000836296369685831L);
               if (var2 == 0) {
                  break label124;
               }

               if (var3 != var10001) {
                  break label113;
               }
            } catch (IllegalStateException var12) {
               throw a(var12);
            }

            Iterator var4 = this.cT.iterator();

            while (true) {
               if (var4.hasNext()) {
                  KeyListener var5 = (KeyListener)var4.next();

                  try {
                     var5.keyPressed(var1);
                     if (var2 == 0) {
                        return;
                     }

                     if (var2 != 0) {
                        continue;
                     }
                  } catch (IllegalStateException var13) {
                     throw a(var13);
                  }
               }

               try {
                  if (var2 != 0) {
                     return;
                  }
                  break;
               } catch (IllegalStateException var11) {
                  boolean var21 = false;
                  throw a(var11);
               }
            }
         }

         try {
            var10000 = var3;
            var10001 = a(16267, 2428879593885115768L);
         } catch (IllegalStateException var10) {
            boolean var22 = false;
            throw a(var10);
         }
      }

      label125: {
         label114: {
            try {
               if (var2 == 0) {
                  break label125;
               }

               if (var10000 != var10001) {
                  break label114;
               }
            } catch (IllegalStateException var8) {
               throw a(var8);
            }

            Iterator var14 = this.cT.iterator();

            while (true) {
               if (var14.hasNext()) {
                  KeyListener var16 = (KeyListener)var14.next();

                  try {
                     var16.keyTyped(var1);
                     if (var2 == 0) {
                        return;
                     }

                     if (var2 != 0) {
                        continue;
                     }
                  } catch (IllegalStateException var9) {
                     throw a(var9);
                  }
               }

               try {
                  if (var2 != 0) {
                     return;
                  }
                  break;
               } catch (IllegalStateException var7) {
                  boolean var23 = false;
                  throw a(var7);
               }
            }
         }

         try {
            var10000 = var3;
            var10001 = a(4335, 3355617550698351165L);
         } catch (IllegalStateException var6) {
            boolean var24 = false;
            throw a(var6);
         }
      }

      if (var10000 == var10001) {
         for (KeyListener var17 : this.cT) {
            var17.keyReleased(var1);
            if (var2 == 0) {
               break;
            }
         }
      }
   }

   public int g$int() {
      return this.c4.width * this.N.R() + this.p();
   }

   public int J$int() {
      return this.c4.height * this.N.c();
   }

   @Override
   public int U$int() {
      return this.N.R();
   }

   @Override
   public int L$int() {
      return this.N.c();
   }

   @Override
   public String U$String() {
      return this.j;
   }

   @Nullable
   @Override
   public xF_3 k$xF_3() {
      return com.lG_3.l(this.getForeground());
   }

   @Nullable
   @Override
   public xF_3 T() {
      return com.lG_3.l(this.getBackground());
   }

   protected int p$int() {
      return 0;
   }

   public void N(iY_3 var1) {
      this.addMouseListener(new SU(this, var1));
      this.addMouseWheelListener(this::lambda$addTerminalMouseListener$4);
      this.addMouseMotionListener(new SB(this, var1));
   }

   @NotNull
   KeyListener I$KeyListener() {
      return this.c2;
   }

   private int P() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/pA_3.c5 I
      // 08: iload 1
      // 09: ifne 37
      // 0c: aload 0
      // 0d: getfield com/pA_3.t Lcom/rx_4;
      // 10: invokeinterface com/rx_4.b ()I 1
      // 15: if_icmpeq 33
      // 18: goto 1f
      // 1b: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 0
      // 21: getfield com/pA_3.t Lcom/rx_4;
      // 24: invokeinterface com/rx_4.b ()I 1
      // 29: invokevirtual com/pA_3.V (I)V
      // 2c: goto 33
      // 2f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: aload 0
      // 34: getfield com/pA_3.c5 I
      // 37: ireturn
   }

   protected void w(Graphics2D var1, BufferedImage var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      var1.drawImage(var2, var3, var4, var5, var6, var7, var8, var9, var10, null);
   }

   @NotNull
   private com.YP y(@NotNull com.YP param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: new com/aG
      // 06: dup
      // 07: aload 1
      // 08: invokespecial com/aG.<init> (Lcom/YP;)V
      // 0b: astore 3
      // 0c: istore 2
      // 0d: aload 3
      // 0e: getstatic com/SY.INVERSE Lcom/SY;
      // 11: aload 1
      // 12: getstatic com/SY.INVERSE Lcom/SY;
      // 15: invokevirtual com/YP.v (Lcom/SY;)Z
      // 18: iload 2
      // 19: ifeq 27
      // 1c: ifne 2a
      // 1f: goto 26
      // 22: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: bipush 1
      // 27: goto 2b
      // 2a: bipush 0
      // 2b: invokevirtual com/aG.c (Lcom/SY;Z)Lcom/aG;
      // 2e: pop
      // 2f: aload 1
      // 30: invokevirtual com/YP.K ()Lcom/Et_2;
      // 33: iload 2
      // 34: ifeq 63
      // 37: ifnonnull 54
      // 3a: goto 41
      // 3d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 3
      // 42: aload 0
      // 43: getfield com/pA_3.cY Lcom/ov_4;
      // 46: invokevirtual com/ov_4.A ()Lcom/Et_2;
      // 49: invokevirtual com/aG.c (Lcom/Et_2;)Lcom/aG;
      // 4c: pop
      // 4d: goto 54
      // 50: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: aload 1
      // 55: iload 2
      // 56: ifeq 7d
      // 59: invokevirtual com/YP.s ()Lcom/Et_2;
      // 5c: goto 63
      // 5f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62: athrow
      // 63: ifnonnull 79
      // 66: aload 3
      // 67: aload 0
      // 68: getfield com/pA_3.cY Lcom/ov_4;
      // 6b: invokevirtual com/ov_4.c ()Lcom/Et_2;
      // 6e: invokevirtual com/aG.j (Lcom/Et_2;)Lcom/aG;
      // 71: pop
      // 72: goto 79
      // 75: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78: athrow
      // 79: aload 3
      // 7a: invokevirtual com/aG.y ()Lcom/YP;
      // 7d: areturn
   }

   private void I(int var1, int var2, com.YP var3, j_2 var4, Graphics2D var5, boolean var6) {
      this.z(var1, var2, var3, var4, var5, true, var6, true);
   }

   private void r(int var1, int var2, com.YP var3, j_2 var4, Graphics2D var5) {
      this.I(var1, var2, var3, var4, var5, false);
   }

   private void z(int param1, int param2, com.YP param3, j_2 param4, Graphics2D param5, boolean param6, boolean param7, boolean param8) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/_y_2.y ()I
      // 003: iload 1
      // 004: aload 0
      // 005: getfield com/pA_3.c4 Ljava/awt/Dimension;
      // 008: getfield java/awt/Dimension.width I
      // 00b: imul
      // 00c: istore 10
      // 00e: istore 9
      // 010: iload 2
      // 011: aload 0
      // 012: getfield com/pA_3.c4 Ljava/awt/Dimension;
      // 015: getfield java/awt/Dimension.height I
      // 018: imul
      // 019: iload 6
      // 01b: iload 9
      // 01d: ifne 036
      // 020: ifeq 032
      // 023: goto 02a
      // 026: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 029: athrow
      // 02a: bipush 0
      // 02b: goto 038
      // 02e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: aload 0
      // 033: getfield com/pA_3.cJ I
      // 036: bipush 2
      // 037: idiv
      // 038: iadd
      // 039: istore 11
      // 03b: aload 4
      // 03d: invokevirtual com/j_2.r ()[C
      // 040: aload 4
      // 042: invokevirtual com/j_2.o ()I
      // 045: aload 4
      // 047: invokevirtual com/j_2.length ()I
      // 04a: aload 0
      // 04b: getfield com/pA_3.t Lcom/rx_4;
      // 04e: invokeinterface com/rx_4.L ()Z 1
      // 053: invokestatic com/Sd_2.s ([CIIZ)I
      // 056: istore 12
      // 058: aload 0
      // 059: getfield com/pA_3.c4 Ljava/awt/Dimension;
      // 05c: getfield java/awt/Dimension.height I
      // 05f: iload 6
      // 061: iload 9
      // 063: ifne 071
      // 066: ifeq 074
      // 069: goto 070
      // 06c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06f: athrow
      // 070: bipush 0
      // 071: goto 078
      // 074: aload 0
      // 075: getfield com/pA_3.cJ I
      // 078: isub
      // 079: aload 0
      // 07a: invokevirtual com/pA_3.getHeight ()I
      // 07d: iload 11
      // 07f: isub
      // 080: invokestatic java/lang/Math.min (II)I
      // 083: istore 13
      // 085: iload 12
      // 087: aload 0
      // 088: getfield com/pA_3.c4 Ljava/awt/Dimension;
      // 08b: getfield java/awt/Dimension.width I
      // 08e: imul
      // 08f: aload 0
      // 090: invokevirtual com/pA_3.getWidth ()I
      // 093: iload 10
      // 095: isub
      // 096: invokestatic java/lang/Math.min (II)I
      // 099: istore 14
      // 09b: aload 3
      // 09c: instanceof com/Yw_2
      // 09f: iload 9
      // 0a1: ifne 114
      // 0a4: ifeq 112
      // 0a7: goto 0ae
      // 0aa: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ad: athrow
      // 0ae: aload 3
      // 0af: checkcast com/Yw_2
      // 0b2: astore 15
      // 0b4: aload 15
      // 0b6: iload 9
      // 0b8: ifne 111
      // 0bb: invokevirtual com/Yw_2.i ()Lcom/KO;
      // 0be: getstatic com/KO.ALWAYS Lcom/KO;
      // 0c1: if_acmpeq 105
      // 0c4: goto 0cb
      // 0c7: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: aload 15
      // 0ce: invokespecial com/pA_3.e (Lcom/Yw_2;)Z
      // 0d1: iload 9
      // 0d3: ifne 114
      // 0d6: goto 0dd
      // 0d9: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc: athrow
      // 0dd: ifeq 112
      // 0e0: goto 0e7
      // 0e3: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e6: athrow
      // 0e7: aload 15
      // 0e9: iload 9
      // 0eb: ifne 111
      // 0ee: goto 0f5
      // 0f1: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f4: athrow
      // 0f5: invokevirtual com/Yw_2.i ()Lcom/KO;
      // 0f8: getstatic com/KO.HOVER Lcom/KO;
      // 0fb: if_acmpne 112
      // 0fe: goto 105
      // 101: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 104: athrow
      // 105: aload 15
      // 107: invokevirtual com/Yw_2.k ()Lcom/YP;
      // 10a: goto 111
      // 10d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 110: athrow
      // 111: astore 3
      // 112: iload 10
      // 114: iload 9
      // 116: ifne 125
      // 119: iflt 165
      // 11c: goto 123
      // 11f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 122: athrow
      // 123: iload 10
      // 125: iload 9
      // 127: ifne 141
      // 12a: aload 0
      // 12b: invokevirtual com/pA_3.getWidth ()I
      // 12e: if_icmpgt 165
      // 131: goto 138
      // 134: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 137: athrow
      // 138: iload 11
      // 13a: goto 141
      // 13d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 140: athrow
      // 141: iload 9
      // 143: ifne 152
      // 146: iflt 165
      // 149: goto 150
      // 14c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14f: athrow
      // 150: iload 11
      // 152: iload 9
      // 154: ifne 18c
      // 157: aload 0
      // 158: invokevirtual com/pA_3.getHeight ()I
      // 15b: if_icmple 16a
      // 15e: goto 165
      // 161: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 164: athrow
      // 165: return
      // 166: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 169: athrow
      // 16a: aload 5
      // 16c: aload 0
      // 16d: getfield com/pA_3.cM LnY;
      // 170: invokestatic com/c.f ()[Ljava/lang/Object;
      // 173: ldc2_w 345089686683358688
      // 176: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 179: dup_x2
      // 17a: pop
      // 17b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 17e: checkcast java/awt/Color
      // 181: goto 188
      // 184: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 187: athrow
      // 188: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 18b: bipush 0
      // 18c: istore 15
      // 18e: bipush 1
      // 18f: istore 16
      // 191: aload 3
      // 192: getstatic com/SY.INVERSE Lcom/SY;
      // 195: invokevirtual com/YP.v (Lcom/SY;)Z
      // 198: iload 9
      // 19a: ifne 211
      // 19d: ifeq 28f
      // 1a0: goto 1a7
      // 1a3: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a6: athrow
      // 1a7: bipush 1
      // 1a8: istore 15
      // 1aa: aload 5
      // 1ac: aload 0
      // 1ad: getfield com/pA_3.cM LnY;
      // 1b0: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1b3: ldc2_w 454783995894914749
      // 1b6: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1b9: dup_x2
      // 1ba: pop
      // 1bb: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1be: checkcast java/awt/Color
      // 1c1: goto 1c8
      // 1c4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c7: athrow
      // 1c8: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 1cb: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1ce: ldc2_w 270389152141252877
      // 1d1: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1d4: swap
      // 1d5: aconst_null
      // 1d6: swap
      // 1d7: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1da: goto 1e1
      // 1dd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e0: athrow
      // 1e1: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1e4: ldc2_w 306266403902896148
      // 1e7: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1ea: dup_x2
      // 1eb: pop
      // 1ec: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1ef: goto 1f6
      // 1f2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1f5: athrow
      // 1f6: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1f9: ldc2_w 224406316798891066
      // 1fc: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1ff: dup_x2
      // 200: pop
      // 201: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 204: checkcast java/lang/Boolean
      // 207: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 20a: goto 211
      // 20d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 210: athrow
      // 211: iload 9
      // 213: ifne 23e
      // 216: ifeq 23a
      // 219: goto 220
      // 21c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21f: athrow
      // 220: aload 5
      // 222: invokevirtual java/awt/Graphics2D.getColor ()Ljava/awt/Color;
      // 225: astore 17
      // 227: aload 5
      // 229: aload 17
      // 22b: sipush 6012
      // 22e: ldc2_w 5448107624863829411
      // 231: invokestatic com/pA_3.a (IJ)I
      // 234: invokestatic com/pA_3.C (Ljava/awt/Color;I)Ljava/awt/Color;
      // 237: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 23a: aload 3
      // 23b: invokevirtual com/YP.r ()Z
      // 23e: iload 9
      // 240: ifne 43b
      // 243: ifeq 439
      // 246: goto 24d
      // 249: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24c: athrow
      // 24d: new java/awt/Color
      // 250: dup
      // 251: aload 0
      // 252: invokespecial com/pA_3.R ()Lcom/S3;
      // 255: aload 0
      // 256: getfield com/pA_3.cY Lcom/ov_4;
      // 259: aload 3
      // 25a: invokevirtual com/YP.K ()Lcom/Et_2;
      // 25d: invokevirtual com/ov_4.A (Lcom/Et_2;)Lcom/Et_2;
      // 260: invokevirtual com/S3.Q (Lcom/Et_2;)Lcom/xF_3;
      // 263: invokevirtual com/xF_3.p ()I
      // 266: invokespecial java/awt/Color.<init> (I)V
      // 269: sipush 15929
      // 26c: ldc2_w 2442573579829159122
      // 26f: invokestatic com/pA_3.a (IJ)I
      // 272: invokestatic com/pA_3.C (Ljava/awt/Color;I)Ljava/awt/Color;
      // 275: astore 17
      // 277: aload 5
      // 279: aload 17
      // 27b: sipush 3619
      // 27e: ldc2_w 8118941228298376377
      // 281: invokestatic com/pA_3.a (IJ)I
      // 284: invokestatic com/pA_3.C (Ljava/awt/Color;I)Ljava/awt/Color;
      // 287: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 28a: iload 9
      // 28c: ifeq 439
      // 28f: new java/awt/Color
      // 292: dup
      // 293: aload 0
      // 294: invokespecial com/pA_3.R ()Lcom/S3;
      // 297: aload 0
      // 298: getfield com/pA_3.cY Lcom/ov_4;
      // 29b: aload 3
      // 29c: invokevirtual com/YP.Z ()Lcom/Et_2;
      // 29f: invokevirtual com/ov_4.R (Lcom/Et_2;)Lcom/Et_2;
      // 2a2: invokevirtual com/S3.Q (Lcom/Et_2;)Lcom/xF_3;
      // 2a5: invokevirtual com/xF_3.p ()I
      // 2a8: invokespecial java/awt/Color.<init> (I)V
      // 2ab: sipush 3619
      // 2ae: ldc2_w 8118941228298376377
      // 2b1: invokestatic com/pA_3.a (IJ)I
      // 2b4: invokestatic com/pA_3.C (Ljava/awt/Color;I)Ljava/awt/Color;
      // 2b7: astore 17
      // 2b9: invokestatic com/c.f ()[Ljava/lang/Object;
      // 2bc: ldc2_w 270389152141252877
      // 2bf: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2c2: swap
      // 2c3: aconst_null
      // 2c4: swap
      // 2c5: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2c8: goto 2cf
      // 2cb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2ce: athrow
      // 2cf: invokestatic com/c.f ()[Ljava/lang/Object;
      // 2d2: ldc2_w 306266403902896148
      // 2d5: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2d8: dup_x2
      // 2d9: pop
      // 2da: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2dd: goto 2e4
      // 2e0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2e3: athrow
      // 2e4: invokestatic com/c.f ()[Ljava/lang/Object;
      // 2e7: ldc2_w 224406316798891066
      // 2ea: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2ed: dup_x2
      // 2ee: pop
      // 2ef: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2f2: checkcast java/lang/Boolean
      // 2f5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2f8: goto 2ff
      // 2fb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2fe: athrow
      // 2ff: ifne 3a7
      // 302: aload 3
      // 303: invokevirtual com/YP.Z ()Lcom/Et_2;
      // 306: astore 18
      // 308: aload 3
      // 309: invokevirtual com/YP.w ()Z
      // 30c: iload 9
      // 30e: ifne 36d
      // 311: ifne 366
      // 314: goto 31b
      // 317: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31a: athrow
      // 31b: aload 18
      // 31d: iload 9
      // 31f: ifne 335
      // 322: goto 329
      // 325: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 328: athrow
      // 329: ifnull 366
      // 32c: goto 333
      // 32f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 332: athrow
      // 333: aload 18
      // 335: invokevirtual com/Et_2.q ()I
      // 338: iload 9
      // 33a: ifne 36d
      // 33d: bipush -1
      // 33e: if_icmpne 366
      // 341: goto 348
      // 344: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 347: athrow
      // 348: aload 0
      // 349: getfield com/pA_3.cM LnY;
      // 34c: invokestatic com/c.f ()[Ljava/lang/Object;
      // 34f: ldc2_w 345089686683358688
      // 352: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 355: dup_x2
      // 356: pop
      // 357: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 35a: checkcast java/awt/Color
      // 35d: goto 364
      // 360: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 363: athrow
      // 364: astore 17
      // 366: aload 3
      // 367: getstatic com/YP.r Lcom/YP;
      // 36a: invokevirtual com/YP.equals (Ljava/lang/Object;)Z
      // 36d: ifeq 38e
      // 370: aload 0
      // 371: getfield com/pA_3.cM LnY;
      // 374: invokestatic com/c.f ()[Ljava/lang/Object;
      // 377: ldc2_w 345089686683358688
      // 37a: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 37d: dup_x2
      // 37e: pop
      // 37f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 382: checkcast java/awt/Color
      // 385: goto 38c
      // 388: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 38b: athrow
      // 38c: astore 17
      // 38e: aload 5
      // 390: aload 17
      // 392: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 395: aload 5
      // 397: iload 10
      // 399: iload 11
      // 39b: iload 14
      // 39d: iload 13
      // 39f: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 3a2: iload 9
      // 3a4: ifeq 439
      // 3a7: aload 3
      // 3a8: invokevirtual com/YP.Z ()Lcom/Et_2;
      // 3ab: astore 18
      // 3ad: aload 18
      // 3af: iload 9
      // 3b1: ifne 3c0
      // 3b4: ifnull 3d3
      // 3b7: goto 3be
      // 3ba: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3bd: athrow
      // 3be: aload 18
      // 3c0: invokevirtual com/Et_2.q ()I
      // 3c3: iload 9
      // 3c5: ifne 40f
      // 3c8: bipush -1
      // 3c9: if_icmpeq 40b
      // 3cc: goto 3d3
      // 3cf: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d2: athrow
      // 3d3: aload 3
      // 3d4: getstatic com/YP.r Lcom/YP;
      // 3d7: invokevirtual com/YP.equals (Ljava/lang/Object;)Z
      // 3da: iload 9
      // 3dc: ifne 40f
      // 3df: goto 3e6
      // 3e2: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e5: athrow
      // 3e6: ifne 40b
      // 3e9: goto 3f0
      // 3ec: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ef: athrow
      // 3f0: aload 5
      // 3f2: aload 17
      // 3f4: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 3f7: aload 5
      // 3f9: iload 10
      // 3fb: iload 11
      // 3fd: iload 14
      // 3ff: iload 13
      // 401: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 404: goto 40b
      // 407: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40a: athrow
      // 40b: aload 3
      // 40c: invokevirtual com/YP.w ()Z
      // 40f: iload 9
      // 411: ifne 43b
      // 414: ifeq 439
      // 417: goto 41e
      // 41a: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41d: athrow
      // 41e: aload 5
      // 420: aload 17
      // 422: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 425: aload 5
      // 427: iload 10
      // 429: iload 11
      // 42b: iload 14
      // 42d: iload 13
      // 42f: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 432: goto 439
      // 435: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 438: athrow
      // 439: iload 7
      // 43b: iload 9
      // 43d: ifne 506
      // 440: ifne 501
      // 443: goto 44a
      // 446: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 449: athrow
      // 44a: aload 3
      // 44b: invokevirtual com/YP.u ()Z
      // 44e: iload 9
      // 450: ifne 4ca
      // 453: goto 45a
      // 456: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 459: athrow
      // 45a: ifeq 47d
      // 45d: goto 464
      // 460: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 463: athrow
      // 464: aload 5
      // 466: iload 10
      // 468: iload 11
      // 46a: iload 14
      // 46c: iload 13
      // 46e: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 471: iload 9
      // 473: ifeq 501
      // 476: goto 47d
      // 479: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47c: athrow
      // 47d: invokestatic com/c.f ()[Ljava/lang/Object;
      // 480: ldc2_w 270389152141252877
      // 483: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 486: swap
      // 487: aconst_null
      // 488: swap
      // 489: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 48c: goto 493
      // 48f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 492: athrow
      // 493: invokestatic com/c.f ()[Ljava/lang/Object;
      // 496: ldc2_w 306266403902896148
      // 499: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 49c: dup_x2
      // 49d: pop
      // 49e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 4a1: goto 4a8
      // 4a4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4a7: athrow
      // 4a8: invokestatic com/c.f ()[Ljava/lang/Object;
      // 4ab: ldc2_w 224406316798891066
      // 4ae: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 4b1: dup_x2
      // 4b2: pop
      // 4b3: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 4b6: checkcast java/lang/Boolean
      // 4b9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4bc: goto 4c3
      // 4bf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4c2: athrow
      // 4c3: goto 4ca
      // 4c6: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c9: athrow
      // 4ca: iload 9
      // 4cc: ifne 4f2
      // 4cf: ifeq 4f1
      // 4d2: goto 4d9
      // 4d5: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d8: athrow
      // 4d9: iload 15
      // 4db: iload 9
      // 4dd: ifne 506
      // 4e0: goto 4e7
      // 4e3: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e6: athrow
      // 4e7: ifeq 501
      // 4ea: goto 4f1
      // 4ed: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f0: athrow
      // 4f1: bipush 0
      // 4f2: istore 16
      // 4f4: aload 5
      // 4f6: iload 10
      // 4f8: iload 11
      // 4fa: iload 14
      // 4fc: iload 13
      // 4fe: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 501: aload 4
      // 503: invokevirtual com/j_2.Y ()Z
      // 506: ifeq 50a
      // 509: return
      // 50a: new java/awt/Color
      // 50d: dup
      // 50e: aload 0
      // 50f: invokespecial com/pA_3.R ()Lcom/S3;
      // 512: aload 0
      // 513: getfield com/pA_3.cY Lcom/ov_4;
      // 516: aload 3
      // 517: invokevirtual com/YP.K ()Lcom/Et_2;
      // 51a: invokevirtual com/ov_4.A (Lcom/Et_2;)Lcom/Et_2;
      // 51d: invokevirtual com/S3.Q (Lcom/Et_2;)Lcom/xF_3;
      // 520: invokevirtual com/xF_3.p ()I
      // 523: invokespecial java/awt/Color.<init> (I)V
      // 526: sipush 3619
      // 529: ldc2_w 8118941228298376377
      // 52c: invokestatic com/pA_3.a (IJ)I
      // 52f: invokestatic com/pA_3.C (Ljava/awt/Color;I)Ljava/awt/Color;
      // 532: astore 17
      // 534: aload 5
      // 536: aload 17
      // 538: sipush 3619
      // 53b: ldc2_w 8118941228298376377
      // 53e: invokestatic com/pA_3.a (IJ)I
      // 541: invokestatic com/pA_3.C (Ljava/awt/Color;I)Ljava/awt/Color;
      // 544: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 547: aload 0
      // 548: iload 1
      // 549: iload 2
      // 54a: aload 4
      // 54c: aload 3
      // 54d: aload 5
      // 54f: iload 16
      // 551: iload 8
      // 553: invokespecial com/pA_3.R (IILcom/j_2;Lcom/YP;Ljava/awt/Graphics2D;ZZ)V
      // 556: aload 3
      // 557: getstatic com/SY.UNDERLINED Lcom/SY;
      // 55a: invokevirtual com/YP.v (Lcom/SY;)Z
      // 55d: iload 9
      // 55f: ifne 58a
      // 562: ifeq 5ae
      // 565: goto 56c
      // 568: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56b: athrow
      // 56c: iload 2
      // 56d: bipush 1
      // 56e: iadd
      // 56f: aload 0
      // 570: getfield com/pA_3.c4 Ljava/awt/Dimension;
      // 573: getfield java/awt/Dimension.height I
      // 576: imul
      // 577: aload 0
      // 578: getfield com/pA_3.cJ I
      // 57b: bipush 2
      // 57c: idiv
      // 57d: isub
      // 57e: aload 0
      // 57f: getfield com/pA_3.cW I
      // 582: isub
      // 583: goto 58a
      // 586: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 589: athrow
      // 58a: istore 18
      // 58c: iload 18
      // 58e: bipush 2
      // 58f: isub
      // 590: istore 19
      // 592: aload 5
      // 594: iload 10
      // 596: iload 19
      // 598: iload 1
      // 599: iload 12
      // 59b: iadd
      // 59c: aload 0
      // 59d: getfield com/pA_3.c4 Ljava/awt/Dimension;
      // 5a0: getfield java/awt/Dimension.width I
      // 5a3: imul
      // 5a4: aload 0
      // 5a5: invokevirtual com/pA_3.p ()I
      // 5a8: iadd
      // 5a9: iload 19
      // 5ab: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 5ae: return
   }

   static Color F(xF_3 var0, int var1) {
      return new Color(var0.U(), var0.K(), var0.E(), var1);
   }

   static Color C(Color var0, int var1) {
      return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), var1);
   }

   private boolean e(@NotNull com.Yw_2 var1) {
      try {
         if (this.cV == var1.g()) {
            return true;
         }
      } catch (IllegalStateException var2) {
         throw a(var2);
      }

      return false;
   }

   private void R(int param1, int param2, @NotNull j_2 param3, @NotNull com.YP param4, @NotNull Graphics2D param5, boolean param6, boolean param7) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/_y_2.y ()I
      // 003: bipush 1
      // 004: istore 9
      // 006: bipush 0
      // 007: istore 10
      // 009: istore 8
      // 00b: bipush 0
      // 00c: istore 11
      // 00e: aload 0
      // 00f: getfield com/pA_3.t Lcom/rx_4;
      // 012: invokeinterface com/rx_4.s ()Z 1
      // 017: iload 8
      // 019: ifne 035
      // 01c: ifeq 043
      // 01f: goto 026
      // 022: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025: athrow
      // 026: aload 4
      // 028: getstatic com/SY.BOLD Lcom/SY;
      // 02b: invokevirtual com/YP.v (Lcom/SY;)Z
      // 02e: goto 035
      // 031: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 034: athrow
      // 035: ifeq 043
      // 038: aload 3
      // 039: invokestatic com/Sd_2.G (Lcom/j_2;)Lcom/j_2;
      // 03c: astore 12
      // 03e: iload 8
      // 040: ifeq 046
      // 043: aload 3
      // 044: astore 12
      // 046: aload 5
      // 048: aload 0
      // 049: getfield com/pA_3.cM LnY;
      // 04c: invokestatic com/c.f ()[Ljava/lang/Object;
      // 04f: ldc2_w 357445816026915918
      // 052: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 055: dup_x2
      // 056: pop
      // 057: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 05a: checkcast java/awt/Color
      // 05d: goto 064
      // 060: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 063: athrow
      // 064: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 067: aload 4
      // 069: getstatic com/SY.INVERSE Lcom/SY;
      // 06c: invokevirtual com/YP.v (Lcom/SY;)Z
      // 06f: iload 8
      // 071: ifne 13f
      // 074: ifeq 133
      // 077: goto 07e
      // 07a: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07d: athrow
      // 07e: aload 4
      // 080: invokevirtual com/YP.a ()Z
      // 083: iload 8
      // 085: ifne 0f7
      // 088: goto 08f
      // 08b: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08e: athrow
      // 08f: ifeq 0eb
      // 092: goto 099
      // 095: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 098: athrow
      // 099: aload 4
      // 09b: invokevirtual com/YP.r ()Z
      // 09e: iload 8
      // 0a0: ifne 1a0
      // 0a3: goto 0aa
      // 0a6: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a9: athrow
      // 0aa: ifeq 19b
      // 0ad: goto 0b4
      // 0b0: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: new java/awt/Color
      // 0b7: dup
      // 0b8: aload 0
      // 0b9: invokespecial com/pA_3.R ()Lcom/S3;
      // 0bc: aload 0
      // 0bd: getfield com/pA_3.cY Lcom/ov_4;
      // 0c0: aload 4
      // 0c2: invokevirtual com/YP.s ()Lcom/Et_2;
      // 0c5: invokevirtual com/ov_4.A (Lcom/Et_2;)Lcom/Et_2;
      // 0c8: invokevirtual com/S3.Q (Lcom/Et_2;)Lcom/xF_3;
      // 0cb: invokevirtual com/xF_3.p ()I
      // 0ce: invokespecial java/awt/Color.<init> (I)V
      // 0d1: sipush 3619
      // 0d4: ldc2_w 8118941228298376377
      // 0d7: invokestatic com/pA_3.a (IJ)I
      // 0da: invokestatic com/pA_3.C (Ljava/awt/Color;I)Ljava/awt/Color;
      // 0dd: astore 13
      // 0df: aload 5
      // 0e1: aload 13
      // 0e3: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 0e6: iload 8
      // 0e8: ifeq 19b
      // 0eb: aload 4
      // 0ed: invokevirtual com/YP.r ()Z
      // 0f0: goto 0f7
      // 0f3: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f6: athrow
      // 0f7: iload 8
      // 0f9: ifne 1a0
      // 0fc: ifeq 19b
      // 0ff: goto 106
      // 102: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: aload 5
      // 108: aload 0
      // 109: getfield com/pA_3.cM LnY;
      // 10c: invokestatic com/c.f ()[Ljava/lang/Object;
      // 10f: ldc2_w 345089686683358688
      // 112: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 115: dup_x2
      // 116: pop
      // 117: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 11a: checkcast java/awt/Color
      // 11d: goto 124
      // 120: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 123: athrow
      // 124: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 127: iload 8
      // 129: ifeq 19b
      // 12c: goto 133
      // 12f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 132: athrow
      // 133: aload 4
      // 135: invokevirtual com/YP.r ()Z
      // 138: goto 13f
      // 13b: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13e: athrow
      // 13f: iload 8
      // 141: ifne 15a
      // 144: ifne 169
      // 147: goto 14e
      // 14a: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14d: athrow
      // 14e: aload 4
      // 150: invokevirtual com/YP.w ()Z
      // 153: goto 15a
      // 156: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 159: athrow
      // 15a: iload 8
      // 15c: ifne 1a0
      // 15f: ifeq 19b
      // 162: goto 169
      // 165: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 168: athrow
      // 169: new java/awt/Color
      // 16c: dup
      // 16d: aload 0
      // 16e: invokespecial com/pA_3.R ()Lcom/S3;
      // 171: aload 0
      // 172: getfield com/pA_3.cY Lcom/ov_4;
      // 175: aload 4
      // 177: invokevirtual com/YP.K ()Lcom/Et_2;
      // 17a: invokevirtual com/ov_4.A (Lcom/Et_2;)Lcom/Et_2;
      // 17d: invokevirtual com/S3.Q (Lcom/Et_2;)Lcom/xF_3;
      // 180: invokevirtual com/xF_3.p ()I
      // 183: invokespecial java/awt/Color.<init> (I)V
      // 186: sipush 3619
      // 189: ldc2_w 8118941228298376377
      // 18c: invokestatic com/pA_3.a (IJ)I
      // 18f: invokestatic com/pA_3.C (Ljava/awt/Color;I)Ljava/awt/Color;
      // 192: astore 13
      // 194: aload 5
      // 196: aload 13
      // 198: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 19b: iload 10
      // 19d: iload 9
      // 19f: iadd
      // 1a0: aload 3
      // 1a1: invokevirtual com/j_2.length ()I
      // 1a4: if_icmpgt 614
      // 1a7: bipush 0
      // 1a8: istore 13
      // 1aa: aload 12
      // 1ac: invokevirtual com/j_2.r ()[C
      // 1af: aload 3
      // 1b0: invokevirtual com/j_2.o ()I
      // 1b3: iload 10
      // 1b5: iadd
      // 1b6: caload
      // 1b7: istore 14
      // 1b9: iload 8
      // 1bb: ifne 61a
      // 1be: aload 12
      // 1c0: invokevirtual com/j_2.r ()[C
      // 1c3: aload 3
      // 1c4: invokevirtual com/j_2.o ()I
      // 1c7: iload 10
      // 1c9: iadd
      // 1ca: caload
      // 1cb: iload 8
      // 1cd: ifne 1fd
      // 1d0: goto 1d7
      // 1d3: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d6: athrow
      // 1d7: sipush 15592
      // 1da: ldc2_w 5014524581788788246
      // 1dd: invokestatic com/pA_3.a (IJ)I
      // 1e0: if_icmpne 1fb
      // 1e3: goto 1ea
      // 1e6: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e9: athrow
      // 1ea: iload 10
      // 1ec: iload 9
      // 1ee: iadd
      // 1ef: istore 10
      // 1f1: iload 11
      // 1f3: iload 9
      // 1f5: iadd
      // 1f6: istore 11
      // 1f8: bipush 1
      // 1f9: istore 13
      // 1fb: iload 13
      // 1fd: iload 8
      // 1ff: ifne 228
      // 202: ifeq 218
      // 205: goto 20c
      // 208: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20b: athrow
      // 20c: iload 8
      // 20e: ifeq 19b
      // 211: goto 218
      // 214: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 217: athrow
      // 218: aload 0
      // 219: iload 8
      // 21b: ifne 26d
      // 21e: getfield com/pA_3.k Z
      // 221: goto 228
      // 224: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 227: athrow
      // 228: ifne 26c
      // 22b: aload 0
      // 22c: iload 8
      // 22e: ifne 26d
      // 231: goto 238
      // 234: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 237: athrow
      // 238: getfield com/pA_3.c8 Z
      // 23b: ifne 26c
      // 23e: goto 245
      // 241: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 244: athrow
      // 245: iload 7
      // 247: ifeq 26c
      // 24a: goto 251
      // 24d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 250: athrow
      // 251: aload 0
      // 252: getfield com/pA_3.H Lcom/Pr_2;
      // 255: iload 14
      // 257: iload 1
      // 258: iload 11
      // 25a: iadd
      // 25b: iload 2
      // 25c: iload 14
      // 25e: bipush 0
      // 25f: invokestatic com/Sd_2.U (IZ)Z
      // 262: invokevirtual com/Pr_2.h (CIIZ)V
      // 265: goto 26c
      // 268: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26b: athrow
      // 26c: aload 0
      // 26d: aload 3
      // 26e: iload 10
      // 270: iload 9
      // 272: iadd
      // 273: bipush 1
      // 274: isub
      // 275: invokevirtual com/j_2.charAt (I)C
      // 278: aload 4
      // 27a: invokevirtual com/pA_3.q (CLcom/YP;)Ljava/awt/Font;
      // 27d: astore 15
      // 27f: aload 5
      // 281: aload 15
      // 283: invokevirtual java/awt/Graphics2D.setFont (Ljava/awt/Font;)V
      // 286: aload 5
      // 288: aload 15
      // 28a: invokevirtual java/awt/Graphics2D.getFontMetrics (Ljava/awt/Font;)Ljava/awt/FontMetrics;
      // 28d: invokevirtual java/awt/FontMetrics.getDescent ()I
      // 290: istore 16
      // 292: aload 0
      // 293: getfield com/pA_3.F I
      // 296: istore 16
      // 298: aload 15
      // 29a: invokevirtual java/awt/Font.getName ()Ljava/lang/String;
      // 29d: aload 0
      // 29e: getfield com/pA_3.d LK3;
      // 2a1: invokestatic com/c.f ()[Ljava/lang/Object;
      // 2a4: ldc2_w 570146297653439641
      // 2a7: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2aa: dup_x2
      // 2ab: pop
      // 2ac: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2af: goto 2b6
      // 2b2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2b5: athrow
      // 2b6: invokestatic com/c.f ()[Ljava/lang/Object;
      // 2b9: ldc2_w 141793837555606825
      // 2bc: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2bf: dup_x2
      // 2c0: pop
      // 2c1: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2c4: checkcast java/awt/Font
      // 2c7: goto 2ce
      // 2ca: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2cd: athrow
      // 2ce: invokevirtual java/awt/Font.getName ()Ljava/lang/String;
      // 2d1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2d4: iload 8
      // 2d6: ifne 333
      // 2d9: ifeq 31c
      // 2dc: goto 2e3
      // 2df: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e2: athrow
      // 2e3: aload 0
      // 2e4: getfield com/pA_3.d LK3;
      // 2e7: invokestatic com/c.f ()[Ljava/lang/Object;
      // 2ea: ldc2_w 570146297653439641
      // 2ed: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2f0: dup_x2
      // 2f1: pop
      // 2f2: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2f5: goto 2fc
      // 2f8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2fb: athrow
      // 2fc: invokestatic com/c.f ()[Ljava/lang/Object;
      // 2ff: ldc2_w 191936527957858294
      // 302: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 305: dup_x2
      // 306: pop
      // 307: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 30a: checkcast java/lang/Integer
      // 30d: invokevirtual java/lang/Integer.intValue ()I
      // 310: goto 317
      // 313: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 316: athrow
      // 317: istore 16
      // 319: iinc 16 1
      // 31c: iload 2
      // 31d: bipush 1
      // 31e: iadd
      // 31f: aload 0
      // 320: getfield com/pA_3.c4 Ljava/awt/Dimension;
      // 323: getfield java/awt/Dimension.height I
      // 326: imul
      // 327: aload 0
      // 328: getfield com/pA_3.cJ I
      // 32b: bipush 2
      // 32c: idiv
      // 32d: isub
      // 32e: iload 16
      // 330: isub
      // 331: bipush 4
      // 332: iadd
      // 333: istore 17
      // 335: iload 1
      // 336: iload 11
      // 338: iadd
      // 339: aload 0
      // 33a: getfield com/pA_3.c4 Ljava/awt/Dimension;
      // 33d: getfield java/awt/Dimension.width I
      // 340: imul
      // 341: istore 18
      // 343: iload 6
      // 345: iload 8
      // 347: ifne 5ce
      // 34a: ifeq 5cc
      // 34d: goto 354
      // 350: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 353: athrow
      // 354: aload 5
      // 356: invokevirtual java/awt/Graphics2D.getColor ()Ljava/awt/Color;
      // 359: astore 19
      // 35b: aload 5
      // 35d: invokevirtual java/awt/Graphics2D.getFontMetrics ()Ljava/awt/FontMetrics;
      // 360: astore 20
      // 362: aload 20
      // 364: iload 14
      // 366: invokevirtual java/awt/FontMetrics.charWidth (C)I
      // 369: istore 21
      // 36b: aload 20
      // 36d: invokevirtual java/awt/FontMetrics.getHeight ()I
      // 370: istore 22
      // 372: iload 14
      // 374: sipush 17162
      // 377: ldc2_w 6332241477127166453
      // 37a: invokestatic com/pA_3.a (IJ)I
      // 37d: if_icmpeq 5c5
      // 380: aload 19
      // 382: invokestatic com/pA_3.s (Ljava/awt/Color;)Ljava/awt/Color;
      // 385: astore 23
      // 387: new java/awt/Color
      // 38a: dup
      // 38b: aload 23
      // 38d: invokevirtual java/awt/Color.getRed ()I
      // 390: aload 23
      // 392: invokevirtual java/awt/Color.getGreen ()I
      // 395: aload 23
      // 397: invokevirtual java/awt/Color.getBlue ()I
      // 39a: sipush 3619
      // 39d: ldc2_w 8118941228298376377
      // 3a0: invokestatic com/pA_3.a (IJ)I
      // 3a3: invokespecial java/awt/Color.<init> (IIII)V
      // 3a6: astore 23
      // 3a8: aload 23
      // 3aa: astore 24
      // 3ac: aload 23
      // 3ae: invokevirtual java/awt/Color.getRed ()I
      // 3b1: aload 23
      // 3b3: invokevirtual java/awt/Color.getGreen ()I
      // 3b6: imul
      // 3b7: aload 23
      // 3b9: invokevirtual java/awt/Color.getBlue ()I
      // 3bc: imul
      // 3bd: istore 25
      // 3bf: new java/lang/StringBuilder
      // 3c2: dup
      // 3c3: invokespecial java/lang/StringBuilder.<init> ()V
      // 3c6: iload 14
      // 3c8: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 3cb: aload 15
      // 3cd: invokevirtual java/awt/Font.getName ()Ljava/lang/String;
      // 3d0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d3: ldc_w ""
      // 3d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d9: aload 15
      // 3db: invokevirtual java/awt/Font.getStyle ()I
      // 3de: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 3e1: ldc_w ""
      // 3e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e7: aload 15
      // 3e9: invokevirtual java/awt/Font.getSize ()I
      // 3ec: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 3ef: iload 25
      // 3f1: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 3f4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3f7: astore 26
      // 3f9: iload 10
      // 3fb: istore 27
      // 3fd: bipush 4
      // 3fe: istore 28
      // 400: aconst_null
      // 401: astore 29
      // 403: getstatic com/pA_3.J Ljava/util/HashMap;
      // 406: aload 26
      // 408: iload 8
      // 40a: ifne 54e
      // 40d: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
      // 410: ifne 549
      // 413: goto 41a
      // 416: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 419: athrow
      // 41a: iload 21
      // 41c: iload 28
      // 41e: bipush 2
      // 41f: imul
      // 420: iadd
      // 421: i2f
      // 422: aload 0
      // 423: getfield com/pA_3.y F
      // 426: fmul
      // 427: f2i
      // 428: iload 22
      // 42a: iload 28
      // 42c: bipush 2
      // 42d: imul
      // 42e: iadd
      // 42f: i2f
      // 430: aload 0
      // 431: getfield com/pA_3.y F
      // 434: fmul
      // 435: f2i
      // 436: invokestatic com/c.a (II)[Ljava/lang/Object;
      // 439: ldc2_w 401056956354921780
      // 43c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 43f: swap
      // 440: aconst_null
      // 441: swap
      // 442: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 445: checkcast java/awt/image/BufferedImage
      // 448: goto 44f
      // 44b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 44e: athrow
      // 44f: astore 29
      // 451: new com/XC
      // 454: dup
      // 455: aload 0
      // 456: aload 24
      // 458: aload 15
      // 45a: iload 22
      // 45c: iload 28
      // 45e: aload 12
      // 460: aload 3
      // 461: iload 27
      // 463: iload 9
      // 465: invokespecial com/XC.<init> (Lcom/pA_3;Ljava/awt/Color;Ljava/awt/Font;IILcom/j_2;Lcom/j_2;II)V
      // 468: astore 30
      // 46a: aload 29
      // 46c: invokevirtual java/awt/image/BufferedImage.createGraphics ()Ljava/awt/Graphics2D;
      // 46f: astore 31
      // 471: new lt_4
      // 474: dup
      // 475: aconst_null
      // 476: aload 30
      // 478: invokespecial lt_4.<init> (Ljava/awt/Component;LD2;)V
      // 47b: astore 32
      // 47d: aload 32
      // 47f: bipush 1
      // 480: invokestatic com/c.a (Z)[Ljava/lang/Object;
      // 483: ldc2_w 117930650841340028
      // 486: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 489: dup_x2
      // 48a: pop
      // 48b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 48e: pop
      // 48f: goto 496
      // 492: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 495: athrow
      // 496: aload 32
      // 498: aload 31
      // 49a: aload 0
      // 49b: getfield com/pA_3.y F
      // 49e: aload 29
      // 4a0: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 4a3: aload 29
      // 4a5: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 4a8: invokestatic com/c.a (Ljava/lang/Object;FII)[Ljava/lang/Object;
      // 4ab: ldc2_w 319180977424850283
      // 4ae: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 4b1: dup_x2
      // 4b2: pop
      // 4b3: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 4b6: pop
      // 4b7: goto 4be
      // 4ba: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4bd: athrow
      // 4be: aload 29
      // 4c0: iload 28
      // 4c2: i2f
      // 4c3: invokestatic com/c.a (Ljava/lang/Object;F)[Ljava/lang/Object;
      // 4c6: ldc2_w 470093029960713275
      // 4c9: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 4cc: swap
      // 4cd: aconst_null
      // 4ce: swap
      // 4cf: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 4d2: checkcast java/awt/image/BufferedImage
      // 4d5: goto 4dc
      // 4d8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4db: athrow
      // 4dc: astore 29
      // 4de: aload 29
      // 4e0: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 4e3: aload 29
      // 4e5: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 4e8: invokestatic com/c.a (II)[Ljava/lang/Object;
      // 4eb: ldc2_w 401056956354921780
      // 4ee: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 4f1: swap
      // 4f2: aconst_null
      // 4f3: swap
      // 4f4: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 4f7: checkcast java/awt/image/BufferedImage
      // 4fa: goto 501
      // 4fd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 500: athrow
      // 501: astore 33
      // 503: aload 33
      // 505: invokevirtual java/awt/image/BufferedImage.createGraphics ()Ljava/awt/Graphics2D;
      // 508: astore 34
      // 50a: bipush 0
      // 50b: istore 35
      // 50d: iload 35
      // 50f: bipush 4
      // 510: if_icmpge 532
      // 513: aload 34
      // 515: aload 29
      // 517: bipush 0
      // 518: bipush 0
      // 519: aconst_null
      // 51a: invokevirtual java/awt/Graphics2D.drawImage (Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
      // 51d: pop
      // 51e: iinc 35 1
      // 521: iload 8
      // 523: ifne 546
      // 526: iload 8
      // 528: ifeq 50d
      // 52b: goto 532
      // 52e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 531: athrow
      // 532: aload 34
      // 534: invokevirtual java/awt/Graphics2D.dispose ()V
      // 537: aload 33
      // 539: astore 29
      // 53b: getstatic com/pA_3.J Ljava/util/HashMap;
      // 53e: aload 26
      // 540: aload 29
      // 542: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 545: pop
      // 546: goto 556
      // 549: getstatic com/pA_3.J Ljava/util/HashMap;
      // 54c: aload 26
      // 54e: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 551: checkcast java/awt/image/BufferedImage
      // 554: astore 29
      // 556: aload 5
      // 558: invokevirtual java/awt/Graphics2D.getTransform ()Ljava/awt/geom/AffineTransform;
      // 55b: astore 30
      // 55d: new java/awt/geom/AffineTransform
      // 560: dup
      // 561: dconst_1
      // 562: dconst_0
      // 563: dconst_0
      // 564: dconst_1
      // 565: aload 30
      // 567: invokevirtual java/awt/geom/AffineTransform.getTranslateX ()D
      // 56a: aload 30
      // 56c: invokevirtual java/awt/geom/AffineTransform.getTranslateY ()D
      // 56f: invokespecial java/awt/geom/AffineTransform.<init> (DDDDDD)V
      // 572: astore 31
      // 574: aload 5
      // 576: aload 31
      // 578: invokevirtual java/awt/Graphics2D.setTransform (Ljava/awt/geom/AffineTransform;)V
      // 57b: aload 5
      // 57d: aload 29
      // 57f: iload 18
      // 581: iload 28
      // 583: isub
      // 584: i2f
      // 585: aload 0
      // 586: getfield com/pA_3.y F
      // 589: fmul
      // 58a: f2i
      // 58b: iload 17
      // 58d: iload 22
      // 58f: isub
      // 590: iload 28
      // 592: isub
      // 593: i2f
      // 594: aload 0
      // 595: getfield com/pA_3.y F
      // 598: fmul
      // 599: f2i
      // 59a: aconst_null
      // 59b: invokevirtual java/awt/Graphics2D.drawImage (Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
      // 59e: pop
      // 59f: new java/awt/geom/AffineTransform
      // 5a2: dup
      // 5a3: aload 0
      // 5a4: getfield com/pA_3.y F
      // 5a7: f2d
      // 5a8: dconst_0
      // 5a9: dconst_0
      // 5aa: aload 0
      // 5ab: getfield com/pA_3.y F
      // 5ae: f2d
      // 5af: aload 30
      // 5b1: invokevirtual java/awt/geom/AffineTransform.getTranslateX ()D
      // 5b4: aload 30
      // 5b6: invokevirtual java/awt/geom/AffineTransform.getTranslateY ()D
      // 5b9: invokespecial java/awt/geom/AffineTransform.<init> (DDDDDD)V
      // 5bc: astore 32
      // 5be: aload 5
      // 5c0: aload 32
      // 5c2: invokevirtual java/awt/Graphics2D.setTransform (Ljava/awt/geom/AffineTransform;)V
      // 5c5: aload 5
      // 5c7: aload 19
      // 5c9: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 5cc: iload 14
      // 5ce: sipush 17162
      // 5d1: ldc2_w 6332241477127166453
      // 5d4: invokestatic com/pA_3.a (IJ)I
      // 5d7: iload 8
      // 5d9: ifne 60c
      // 5dc: if_icmpeq 601
      // 5df: goto 5e6
      // 5e2: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e5: athrow
      // 5e6: iload 18
      // 5e8: istore 19
      // 5ea: aload 5
      // 5ec: aload 12
      // 5ee: invokevirtual com/j_2.r ()[C
      // 5f1: aload 3
      // 5f2: invokevirtual com/j_2.o ()I
      // 5f5: iload 10
      // 5f7: iadd
      // 5f8: iload 9
      // 5fa: iload 19
      // 5fc: iload 17
      // 5fe: invokevirtual java/awt/Graphics2D.drawChars ([CIIII)V
      // 601: iload 11
      // 603: iload 9
      // 605: iadd
      // 606: istore 11
      // 608: iload 10
      // 60a: iload 9
      // 60c: iadd
      // 60d: istore 10
      // 60f: iload 8
      // 611: ifeq 19b
      // 614: aload 5
      // 616: aconst_null
      // 617: invokevirtual java/awt/Graphics2D.setClip (Ljava/awt/Shape;)V
      // 61a: return
   }

   public static Color s(Color var0) {
      float var1 = (float)(var0.getRed() + var0.getGreen() + var0.getBlue()) / 3.0F;

      try {
         if (var1 < 90.0F) {
            return Color.white;
         }
      } catch (IllegalStateException var3) {
         throw a(var3);
      }

      return Color.black;
   }

   public static boolean B(char param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: istore 1
      // 04: iload 0
      // 05: sipush 22270
      // 08: ldc2_w 4742328348634565651
      // 0b: invokestatic com/pA_3.a (IJ)I
      // 0e: iload 1
      // 0f: ifne 38
      // 12: if_icmplt 3f
      // 15: goto 1c
      // 18: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: iload 0
      // 1d: iload 1
      // 1e: ifne 3c
      // 21: goto 28
      // 24: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: sipush 29844
      // 2b: ldc2_w 6503920570390933088
      // 2e: invokestatic com/pA_3.a (IJ)I
      // 31: goto 38
      // 34: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: if_icmpgt 3f
      // 3b: bipush 1
      // 3c: goto 40
      // 3f: bipush 0
      // 40: ireturn
   }

   protected Font q(char param1, com.YP param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield com/pA_3.d LK3;
      // 004: invokestatic com/c.f ()[Ljava/lang/Object;
      // 007: ldc2_w 570146297653439641
      // 00a: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 00d: dup_x2
      // 00e: pop
      // 00f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 012: checkcast um_4
      // 015: goto 01c
      // 018: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 01b: athrow
      // 01c: astore 4
      // 01e: invokestatic com/_y_2.M ()I
      // 021: aload 0
      // 022: getfield com/pA_3.d LK3;
      // 025: invokestatic com/c.f ()[Ljava/lang/Object;
      // 028: ldc2_w 381284008132314530
      // 02b: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 02e: dup_x2
      // 02f: pop
      // 030: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 033: checkcast um_4
      // 036: goto 03d
      // 039: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: astore 5
      // 03f: istore 3
      // 040: aload 0
      // 041: getfield com/pA_3.d LK3;
      // 044: invokestatic com/c.f ()[Ljava/lang/Object;
      // 047: ldc2_w 483859120374051683
      // 04a: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 04d: dup_x2
      // 04e: pop
      // 04f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 052: checkcast um_4
      // 055: goto 05c
      // 058: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05b: athrow
      // 05c: astore 6
      // 05e: aconst_null
      // 05f: astore 7
      // 061: aconst_null
      // 062: astore 8
      // 064: bipush 0
      // 065: istore 9
      // 067: iload 1
      // 068: istore 10
      // 06a: aload 4
      // 06c: iload 3
      // 06d: ifeq 09f
      // 070: invokestatic com/c.f ()[Ljava/lang/Object;
      // 073: ldc2_w 439979510325483015
      // 076: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 079: dup_x2
      // 07a: pop
      // 07b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 07e: checkcast java/awt/Font
      // 081: goto 088
      // 084: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 087: athrow
      // 088: iload 1
      // 089: invokevirtual java/awt/Font.canDisplay (C)Z
      // 08c: ifeq 09d
      // 08f: goto 096
      // 092: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 095: athrow
      // 096: aload 4
      // 098: astore 7
      // 09a: goto 0a1
      // 09d: aload 6
      // 09f: astore 7
      // 0a1: iload 1
      // 0a2: invokestatic com/pA_3.B (C)Z
      // 0a5: iload 3
      // 0a6: ifeq 0eb
      // 0a9: ifeq 0ea
      // 0ac: goto 0b3
      // 0af: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b2: athrow
      // 0b3: aload 5
      // 0b5: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0b8: ldc2_w 439979510325483015
      // 0bb: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0be: dup_x2
      // 0bf: pop
      // 0c0: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0c3: checkcast java/awt/Font
      // 0c6: goto 0cd
      // 0c9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0cc: athrow
      // 0cd: iload 1
      // 0ce: invokevirtual java/awt/Font.canDisplay (C)Z
      // 0d1: iload 3
      // 0d2: ifeq 0eb
      // 0d5: goto 0dc
      // 0d8: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0db: athrow
      // 0dc: ifeq 0ea
      // 0df: goto 0e6
      // 0e2: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5: athrow
      // 0e6: aload 5
      // 0e8: astore 7
      // 0ea: iload 1
      // 0eb: iload 3
      // 0ec: ifeq 10a
      // 0ef: sipush 21066
      // 0f2: ldc2_w 5011282699961747627
      // 0f5: invokestatic com/pA_3.a (IJ)I
      // 0f8: if_icmpne 110
      // 0fb: goto 102
      // 0fe: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 101: athrow
      // 102: bipush 0
      // 103: goto 10a
      // 106: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 109: athrow
      // 10a: istore 9
      // 10c: aload 6
      // 10e: astore 7
      // 110: aconst_null
      // 111: astore 11
      // 113: aconst_null
      // 114: astore 12
      // 116: aconst_null
      // 117: astore 13
      // 119: aconst_null
      // 11a: astore 14
      // 11c: iload 9
      // 11e: ifeq 194
      // 121: aload 4
      // 123: invokestatic com/c.f ()[Ljava/lang/Object;
      // 126: ldc2_w 141793837555606825
      // 129: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 12c: dup_x2
      // 12d: pop
      // 12e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 131: checkcast java/awt/Font
      // 134: goto 13b
      // 137: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 13a: athrow
      // 13b: astore 11
      // 13d: aload 4
      // 13f: invokestatic com/c.f ()[Ljava/lang/Object;
      // 142: ldc2_w 141793837555606825
      // 145: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 148: dup_x2
      // 149: pop
      // 14a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 14d: checkcast java/awt/Font
      // 150: goto 157
      // 153: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 156: athrow
      // 157: astore 12
      // 159: aload 4
      // 15b: invokestatic com/c.f ()[Ljava/lang/Object;
      // 15e: ldc2_w 141793837555606825
      // 161: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 164: dup_x2
      // 165: pop
      // 166: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 169: checkcast java/awt/Font
      // 16c: goto 173
      // 16f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 172: athrow
      // 173: astore 13
      // 175: aload 4
      // 177: invokestatic com/c.f ()[Ljava/lang/Object;
      // 17a: ldc2_w 141793837555606825
      // 17d: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 180: dup_x2
      // 181: pop
      // 182: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 185: checkcast java/awt/Font
      // 188: goto 18f
      // 18b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 18e: athrow
      // 18f: astore 14
      // 191: goto 204
      // 194: aload 7
      // 196: invokestatic com/c.f ()[Ljava/lang/Object;
      // 199: ldc2_w 439979510325483015
      // 19c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 19f: dup_x2
      // 1a0: pop
      // 1a1: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1a4: checkcast java/awt/Font
      // 1a7: goto 1ae
      // 1aa: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ad: athrow
      // 1ae: astore 11
      // 1b0: aload 7
      // 1b2: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1b5: ldc2_w 419129657143452339
      // 1b8: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1bb: dup_x2
      // 1bc: pop
      // 1bd: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1c0: checkcast java/awt/Font
      // 1c3: goto 1ca
      // 1c6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c9: athrow
      // 1ca: astore 12
      // 1cc: aload 7
      // 1ce: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1d1: ldc2_w 623013086778579706
      // 1d4: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1d7: dup_x2
      // 1d8: pop
      // 1d9: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1dc: checkcast java/awt/Font
      // 1df: goto 1e6
      // 1e2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e5: athrow
      // 1e6: astore 13
      // 1e8: aload 7
      // 1ea: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1ed: ldc2_w 185524484641884370
      // 1f0: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1f3: dup_x2
      // 1f4: pop
      // 1f5: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1f8: checkcast java/awt/Font
      // 1fb: goto 202
      // 1fe: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 201: athrow
      // 202: astore 14
      // 204: aload 2
      // 205: getstatic com/SY.BOLD Lcom/SY;
      // 208: invokevirtual com/YP.v (Lcom/SY;)Z
      // 20b: istore 15
      // 20d: aload 2
      // 20e: getstatic com/SY.ITALIC Lcom/SY;
      // 211: invokevirtual com/YP.v (Lcom/SY;)Z
      // 214: istore 16
      // 216: iload 15
      // 218: iload 3
      // 219: ifeq 23e
      // 21c: ifeq 23c
      // 21f: goto 226
      // 222: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 225: athrow
      // 226: iload 16
      // 228: ifeq 239
      // 22b: goto 232
      // 22e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 231: athrow
      // 232: aload 14
      // 234: areturn
      // 235: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 238: athrow
      // 239: aload 12
      // 23b: areturn
      // 23c: iload 16
      // 23e: ifeq 248
      // 241: aload 13
      // 243: areturn
      // 244: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 247: athrow
      // 248: aload 11
      // 24a: areturn
   }

   private static int P(char[] param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: istore 4
      // 03: invokestatic com/_y_2.y ()I
      // 06: iload 1
      // 07: istore 5
      // 09: istore 3
      // 0a: iload 5
      // 0c: iload 2
      // 0d: if_icmpge 4f
      // 10: aload 0
      // 11: iload 5
      // 13: iload 3
      // 14: ifne 43
      // 17: caload
      // 18: iload 3
      // 19: ifne 61
      // 1c: goto 23
      // 1f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: sipush 15592
      // 26: ldc2_w 5014524581788788246
      // 29: invokestatic com/pA_3.a (IJ)I
      // 2c: if_icmpeq 48
      // 2f: goto 36
      // 32: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: aload 0
      // 37: iload 4
      // 39: iinc 4 1
      // 3c: goto 43
      // 3f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: aload 0
      // 44: iload 5
      // 46: caload
      // 47: castore
      // 48: iinc 5 1
      // 4b: iload 3
      // 4c: ifeq 0a
      // 4f: aload 0
      // 50: iload 4
      // 52: iload 2
      // 53: sipush 15592
      // 56: ldc2_w 5014524581788788246
      // 59: invokestatic com/pA_3.a (IJ)I
      // 5c: invokestatic java/util/Arrays.fill ([CIIC)V
      // 5f: iload 4
      // 61: ireturn
   }

   private static int C(char[] param0, @NotNull BreakIterator param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 2
      // 07: iload 3
      // 08: invokestatic com/pA_3.g ([CII)Z
      // 0b: ifeq 8f
      // 0e: aload 1
      // 0f: invokevirtual java/text/BreakIterator.next ()I
      // 12: istore 5
      // 14: iload 5
      // 16: iload 4
      // 18: ifeq 90
      // 1b: bipush -1
      // 1c: iload 4
      // 1e: ifeq 56
      // 21: goto 28
      // 24: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: if_icmpne 3e
      // 2b: goto 32
      // 2e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: iload 4
      // 34: ifne 8f
      // 37: goto 3e
      // 3a: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: iload 5
      // 40: iload 3
      // 41: isub
      // 42: iload 4
      // 44: ifeq 89
      // 47: goto 4e
      // 4a: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: bipush 1
      // 4f: goto 56
      // 52: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: if_icmpne 85
      // 59: aload 0
      // 5a: iload 3
      // 5b: invokestatic com/pA_3.z ([CI)Z
      // 5e: iload 4
      // 60: ifeq 89
      // 63: goto 6a
      // 66: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69: athrow
      // 6a: ifne 85
      // 6d: goto 74
      // 70: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73: athrow
      // 74: aload 1
      // 75: invokevirtual java/text/BreakIterator.previous ()I
      // 78: pop
      // 79: iload 4
      // 7b: ifne 8f
      // 7e: goto 85
      // 81: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 84: athrow
      // 85: iload 3
      // 86: istore 2
      // 87: iload 5
      // 89: istore 3
      // 8a: iload 4
      // 8c: ifne 05
      // 8f: iload 3
      // 90: ireturn
   }

   private static boolean g(char[] param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: istore 3
      // 04: iload 2
      // 05: iload 1
      // 06: isub
      // 07: iload 3
      // 08: ifeq 22
      // 0b: bipush 1
      // 0c: if_icmple 1c
      // 0f: goto 16
      // 12: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: bipush 1
      // 17: ireturn
      // 18: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: iload 1
      // 1e: iload 2
      // 1f: invokestatic com/pA_3.T ([CII)Z
      // 22: iload 3
      // 23: ifeq 37
      // 26: ifeq 36
      // 29: goto 30
      // 2c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: bipush 1
      // 31: ireturn
      // 32: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: iload 2
      // 37: aload 0
      // 38: arraylength
      // 39: iload 3
      // 3a: ifeq 65
      // 3d: if_icmpge 6c
      // 40: goto 47
      // 43: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: aload 0
      // 48: iload 2
      // 49: caload
      // 4a: iload 3
      // 4b: ifeq 69
      // 4e: goto 55
      // 51: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: sipush 29388
      // 58: ldc2_w 6863381746941913136
      // 5b: invokestatic com/pA_3.a (IJ)I
      // 5e: goto 65
      // 61: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: if_icmpne 6c
      // 68: bipush 1
      // 69: goto 6d
      // 6c: bipush 0
      // 6d: ireturn
   }

   private static boolean z(char[] param0, int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 1
      // 06: iload 1
      // 07: bipush 1
      // 08: iadd
      // 09: invokestatic com/pA_3.T ([CII)Z
      // 0c: iload 2
      // 0d: ifne 23
      // 10: ifeq 20
      // 13: goto 1a
      // 16: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: bipush 1
      // 1b: ireturn
      // 1c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: iload 1
      // 22: caload
      // 23: iload 2
      // 24: ifne 43
      // 27: sipush 15592
      // 2a: ldc2_w 5014524581788788246
      // 2d: invokestatic com/pA_3.a (IJ)I
      // 30: if_icmpne 40
      // 33: goto 3a
      // 36: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: bipush 1
      // 3b: ireturn
      // 3c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 0
      // 41: iload 1
      // 42: caload
      // 43: iload 2
      // 44: ifne 5f
      // 47: invokestatic java/lang/Character$UnicodeBlock.of (C)Ljava/lang/Character$UnicodeBlock;
      // 4a: getstatic java/lang/Character$UnicodeBlock.MISCELLANEOUS_SYMBOLS_AND_ARROWS Ljava/lang/Character$UnicodeBlock;
      // 4d: if_acmpne 62
      // 50: goto 57
      // 53: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56: athrow
      // 57: bipush 1
      // 58: goto 5f
      // 5b: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: goto 63
      // 62: bipush 0
      // 63: ireturn
   }

   private static boolean T(char[] param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: istore 3
      // 04: iload 2
      // 05: iload 1
      // 06: isub
      // 07: iload 3
      // 08: ifne de
      // 0b: bipush 1
      // 0c: if_icmpne dd
      // 0f: goto 16
      // 12: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: caload
      // 19: istore 4
      // 1b: iload 4
      // 1d: iload 3
      // 1e: ifne de
      // 21: sipush 15264
      // 24: ldc2_w 3501731966444118345
      // 27: invokestatic com/pA_3.a (IJ)I
      // 2a: if_icmplt dd
      // 2d: goto 34
      // 30: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: iload 4
      // 36: iload 3
      // 37: ifne dc
      // 3a: goto 41
      // 3d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: sipush 16451
      // 44: ldc2_w 1099435533531568775
      // 47: invokestatic com/pA_3.a (IJ)I
      // 4a: if_icmple d4
      // 4d: goto 54
      // 50: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: iload 4
      // 56: sipush 10783
      // 59: ldc2_w 1332219417578647807
      // 5c: invokestatic com/pA_3.a (IJ)I
      // 5f: iload 3
      // 60: ifne b1
      // 63: goto 6a
      // 66: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69: athrow
      // 6a: if_icmplt 94
      // 6d: goto 74
      // 70: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73: athrow
      // 74: iload 4
      // 76: iload 3
      // 77: ifne dc
      // 7a: goto 81
      // 7d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80: athrow
      // 81: sipush 3208
      // 84: ldc2_w 8849915831524169288
      // 87: invokestatic com/pA_3.a (IJ)I
      // 8a: if_icmple d4
      // 8d: goto 94
      // 90: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 93: athrow
      // 94: iload 4
      // 96: iload 3
      // 97: ifne de
      // 9a: goto a1
      // 9d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a0: athrow
      // a1: sipush 9989
      // a4: ldc2_w 5082574847427919325
      // a7: invokestatic com/pA_3.a (IJ)I
      // aa: goto b1
      // ad: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b0: athrow
      // b1: if_icmplt dd
      // b4: iload 4
      // b6: iload 3
      // b7: ifne de
      // ba: goto c1
      // bd: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c0: athrow
      // c1: sipush 8697
      // c4: ldc2_w 3217464807087094578
      // c7: invokestatic com/pA_3.a (IJ)I
      // ca: if_icmpgt dd
      // cd: goto d4
      // d0: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d3: athrow
      // d4: bipush 1
      // d5: goto dc
      // d8: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // db: athrow
      // dc: ireturn
      // dd: bipush 0
      // de: ireturn
   }

   @NotNull
   private Color p(@NotNull com.YP var1) {
      Color var2 = this.s(this.cY.A(var1.O()));
      if (var1.v(SY.DIM)) {
         Color var3 = this.r(this.cY.R(var1.Z()));
         var2 = new Color((var2.getRed() + var3.getRed()) / 2, (var2.getGreen() + var3.getGreen()) / 2, (var2.getBlue() + var3.getBlue()) / 2, var2.getAlpha());
      }

      return var2;
   }

   @NotNull
   protected Font h(char[] param1, int param2, int param3, @NotNull com.YP param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: aload 4
      // 05: getstatic com/SY.BOLD Lcom/SY;
      // 08: invokevirtual com/YP.v (Lcom/SY;)Z
      // 0b: istore 6
      // 0d: istore 5
      // 0f: aload 4
      // 11: getstatic com/SY.ITALIC Lcom/SY;
      // 14: invokevirtual com/YP.v (Lcom/SY;)Z
      // 17: istore 7
      // 19: iload 6
      // 1b: iload 5
      // 1d: ifeq 70
      // 20: ifeq 6e
      // 23: goto 2a
      // 26: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield com/pA_3.t Lcom/rx_4;
      // 2e: invokeinterface com/rx_4.s ()Z 1
      // 33: iload 5
      // 35: ifeq 70
      // 38: goto 3f
      // 3b: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: ifeq 6e
      // 42: goto 49
      // 45: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48: athrow
      // 49: aload 1
      // 4a: iload 2
      // 4b: caload
      // 4c: invokestatic com/XP.U (C)Z
      // 4f: iload 5
      // 51: ifeq 70
      // 54: goto 5b
      // 57: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: ifeq 6e
      // 5e: goto 65
      // 61: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: aload 0
      // 66: getfield com/pA_3.c_ Ljava/awt/Font;
      // 69: areturn
      // 6a: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d: athrow
      // 6e: iload 6
      // 70: iload 5
      // 72: ifeq 9f
      // 75: ifeq 9d
      // 78: goto 7f
      // 7b: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: iload 7
      // 81: ifeq 96
      // 84: goto 8b
      // 87: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8a: athrow
      // 8b: aload 0
      // 8c: getfield com/pA_3.Z Ljava/awt/Font;
      // 8f: goto b1
      // 92: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 95: athrow
      // 96: aload 0
      // 97: getfield com/pA_3.cL Ljava/awt/Font;
      // 9a: goto b1
      // 9d: iload 7
      // 9f: ifeq ad
      // a2: aload 0
      // a3: getfield com/pA_3.ck Ljava/awt/Font;
      // a6: goto b1
      // a9: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ac: athrow
      // ad: aload 0
      // ae: getfield com/pA_3.c_ Ljava/awt/Font;
      // b1: areturn
   }

   private S3 R$S3() {
      Object[] var10000 = com.c.f();
      Method var5 = com.c.d(270389152141252877L);
      Object[] var19 = var10000;
      Object var12 = null;

      try {
         var10000 = (Object[])var5.invoke(var12, var19);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var12 = com.c.f();
      Method var10003 = com.c.d(399585344452154517L);
      var19 = (Object[])var12;
      var12 = var10000;
      Method var7 = var10003;

      try {
         var10000 = (Object[])var7.invoke(var12, var19);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var12 = com.c.f();
      var10003 = com.c.d(149968465491171480L);
      var19 = (Object[])var12;
      var12 = var10000;
      Method var9 = var10003;

      try {
         var10000 = (Object[])var9.invoke(var12, var19);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var12 = com.c.f();
      var10003 = com.c.d(371660004622157698L);
      var19 = (Object[])var12;
      var12 = var10000;
      Method var11 = var10003;

      try {
         return (S3)var11.invoke(var12, var19);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   private void D(Graphics2D var1, int var2, int var3) {
      var1.setColor(this.getBackground());
      var1.fillRect(0, var3, this.getWidth(), this.getHeight() - var3);
      var1.fillRect(var2, 0, this.getWidth() - var2, this.getHeight());
   }

   @Override
   public void l(int var1, int var2, int var3) {
      this.D.addAndGet(var3);
      this.u = null;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void S$void() {
      int var10000 = _y_2.M();
      this.V.w();
      int var1 = var10000;
      boolean var8 = false /* VF: Semaphore variable */;

      try {
         label51: {
            var8 = true;
            int var2 = this.V.H();

            try {
               if (var1 == 0) {
                  var8 = false;
                  return;
               }

               if (var2 <= 0) {
                  var8 = false;
                  break label51;
               }
            } catch (IllegalStateException var9) {
               throw a(var9);
            }

            int var3 = this.N.c();
            this.i.setRangeProperties(-var2, var2 + var3, -var2, var3, false);
            Nt_2 var4 = new Nt_2(this, var2, var3);
            this.V.P(var4);
            this.i.addChangeListener(new com.ly_4(this, var4));
            var8 = false;
         }
      } finally {
         if (var8) {
            this.V.h();
         }
      }

      this.V.h();
   }

   private void l(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: aload 0
      // 04: getfield com/pA_3.D Ljava/util/concurrent/atomic/AtomicInteger;
      // 07: bipush 0
      // 08: invokevirtual java/util/concurrent/atomic/AtomicInteger.getAndSet (I)I
      // 0b: istore 3
      // 0c: istore 2
      // 0d: iload 3
      // 0e: iload 2
      // 0f: ifne 42
      // 12: ifne 33
      // 15: goto 1c
      // 18: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: iload 1
      // 1d: iload 2
      // 1e: ifne 42
      // 21: goto 28
      // 24: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: ifne 33
      // 2b: goto 32
      // 2e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: return
      // 33: aload 0
      // 34: iload 2
      // 35: ifne d2
      // 38: getfield com/pA_3.X Z
      // 3b: goto 42
      // 3e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: ifeq ca
      // 45: aload 0
      // 46: getfield com/pA_3.i Ljavax/swing/BoundedRangeModel;
      // 49: invokeinterface javax/swing/BoundedRangeModel.getValue ()I 1
      // 4e: istore 4
      // 50: aload 0
      // 51: getfield com/pA_3.V Lcom/im_4;
      // 54: invokevirtual com/im_4.H ()I
      // 57: istore 5
      // 59: iload 2
      // 5a: ifne 8c
      // 5d: iload 4
      // 5f: ifne 90
      // 62: goto 69
      // 65: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68: athrow
      // 69: aload 0
      // 6a: getfield com/pA_3.i Ljavax/swing/BoundedRangeModel;
      // 6d: bipush 0
      // 6e: aload 0
      // 6f: getfield com/pA_3.N Lcom/OT;
      // 72: invokevirtual com/OT.c ()I
      // 75: iload 5
      // 77: ineg
      // 78: aload 0
      // 79: getfield com/pA_3.N Lcom/OT;
      // 7c: invokevirtual com/OT.c ()I
      // 7f: bipush 0
      // 80: invokeinterface javax/swing/BoundedRangeModel.setRangeProperties (IIIIZ)V 6
      // 85: goto 8c
      // 88: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8b: athrow
      // 8c: iload 2
      // 8d: ifeq c6
      // 90: aload 0
      // 91: getfield com/pA_3.i Ljavax/swing/BoundedRangeModel;
      // 94: iload 4
      // 96: iload 3
      // 97: iadd
      // 98: iload 5
      // 9a: ineg
      // 9b: invokestatic java/lang/Math.max (II)I
      // 9e: aload 0
      // 9f: getfield com/pA_3.N Lcom/OT;
      // a2: invokevirtual com/OT.c ()I
      // a5: invokestatic java/lang/Math.min (II)I
      // a8: aload 0
      // a9: getfield com/pA_3.N Lcom/OT;
      // ac: invokevirtual com/OT.c ()I
      // af: iload 5
      // b1: ineg
      // b2: aload 0
      // b3: getfield com/pA_3.N Lcom/OT;
      // b6: invokevirtual com/OT.c ()I
      // b9: bipush 0
      // ba: invokeinterface javax/swing/BoundedRangeModel.setRangeProperties (IIIIZ)V 6
      // bf: goto c6
      // c2: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c5: athrow
      // c6: iload 2
      // c7: ifeq eb
      // ca: aload 0
      // cb: goto d2
      // ce: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d1: athrow
      // d2: getfield com/pA_3.i Ljavax/swing/BoundedRangeModel;
      // d5: bipush 0
      // d6: aload 0
      // d7: getfield com/pA_3.N Lcom/OT;
      // da: invokevirtual com/OT.c ()I
      // dd: bipush 0
      // de: aload 0
      // df: getfield com/pA_3.N Lcom/OT;
      // e2: invokevirtual com/OT.c ()I
      // e5: bipush 0
      // e6: invokeinterface javax/swing/BoundedRangeModel.setRangeProperties (IIIIZ)V 6
      // eb: return
   }

   @Override
   public void x(int var1, int var2) {
      this.w.z(var1);
      this.w.J(var2);
   }

   @Override
   public void e(rP_3 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: aload 0
      // 04: getfield com/pA_3.w Lcom/d__2;
      // 07: aload 1
      // 08: invokevirtual com/d__2.p (Lcom/rP_3;)V
      // 0b: istore 2
      // 0c: getstatic com/o9_2.Q [I
      // 0f: aload 1
      // 10: invokevirtual com/rP_3.ordinal ()I
      // 13: iaload
      // 14: iload 2
      // 15: ifeq 53
      // 18: tableswitch 80 1 6 64 44 64 44 64 44
      // 40: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: aload 0
      // 45: getfield com/pA_3.w Lcom/d__2;
      // 48: bipush 0
      // 49: invokestatic com/d__2.p (Lcom/d__2;Z)Z
      // 4c: goto 53
      // 4f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: pop
      // 54: iload 2
      // 55: ifne 68
      // 58: aload 0
      // 59: getfield com/pA_3.w Lcom/d__2;
      // 5c: bipush 1
      // 5d: invokestatic com/d__2.p (Lcom/d__2;Z)Z
      // 60: pop
      // 61: goto 68
      // 64: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67: athrow
      // 68: return
   }

   @Override
   public void I$void() {
      try {
         if (this.t.p()) {
            Toolkit.getDefaultToolkit().beep();
         }
      } catch (IllegalStateException var1) {
         throw a(var1);
      }
   }

   @Nullable
   public Rectangle u(@NotNull com.Bs_2 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: aload 1
      // 04: invokevirtual com/Bs_2.A ()Lcom/dC_3;
      // 07: astore 3
      // 08: istore 2
      // 09: aload 0
      // 0a: getfield com/pA_3.V Lcom/im_4;
      // 0d: aload 3
      // 0e: invokevirtual com/im_4.R (Lcom/dC_3;)I
      // 11: istore 4
      // 13: iload 4
      // 15: iload 2
      // 16: ifne 2e
      // 19: iflt 4d
      // 1c: goto 23
      // 1f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: aload 1
      // 24: invokevirtual com/Bs_2.L ()Z
      // 27: goto 2e
      // 2a: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: ifne 4d
      // 31: aload 0
      // 32: new com/Ws_2
      // 35: dup
      // 36: iload 4
      // 38: aload 1
      // 39: invokevirtual com/Bs_2.m ()I
      // 3c: aload 1
      // 3d: invokevirtual com/Bs_2.r ()I
      // 40: bipush 1
      // 41: iadd
      // 42: invokespecial com/Ws_2.<init> (III)V
      // 45: invokespecial com/pA_3.C (Lcom/Ws_2;)Ljava/awt/Rectangle;
      // 48: areturn
      // 49: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: aconst_null
      // 4e: areturn
   }

   @NotNull
   private Rectangle C(@NotNull com.Ws_2 var1) {
      Point var2 = new Point(var1.I() * this.c4.width + this.p(), var1.k() * this.c4.height);
      return new Rectangle(var2, new Dimension(this.c4.width * var1.j(), this.c4.height));
   }

   @Deprecated
   public BoundedRangeModel B() {
      return this.i;
   }

   @NotNull
   public BoundedRangeModel u() {
      return this.i;
   }

   public im_4 H() {
      return this.V;
   }

   public rU_3 f$rU_3() {
      return this.u;
   }

   @Override
   public boolean H$boolean() {
      return this.t.L();
   }

   @Override
   public void z(boolean var1) {
      this.r = var1;
   }

   public ua_2 k$ua_2() {
      return this.V.x();
   }

   @Override
   public void G(boolean var1) {
      this.w.d(var1);
   }

   @NotNull
   protected JPopupMenu S(@NotNull com.cS_3 var1) {
      JPopupMenu var2 = new JPopupMenu();
      com.aD.m(var2, var1);
      return var2;
   }

   @NotNull
   private com.cS_3 A(@Nullable com.yA_3 var1, @NotNull MouseEvent var2) {
      com.ca_4 var3 = com.yO_3.G(var1);

      try {
         return (com.cS_3)(var3 != null ? new Gj_2(this, var3, var2) : this);
      } catch (IllegalStateException var4) {
         throw a(var4);
      }
   }

   @Override
   public void x(boolean var1) {
      this.X = var1;
      if (this.X) {
      }

      SwingUtilities.invokeLater(this::lambda$setScrollingEnabled$7);
   }

   @Override
   public void N(boolean var1) {
      this.w.a(var1);
   }

   public com.d__2 O() {
      return this.w;
   }

   public pD_3 n$pD_3() {
      return this.cc;
   }

   @Override
   public void Y(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: aload 0
      // 04: aload 1
      // 05: putfield com/pA_3.j Ljava/lang/String;
      // 08: istore 2
      // 09: aload 0
      // 0a: getfield com/pA_3.c Lcom/xn_4;
      // 0d: iload 2
      // 0e: ifne 26
      // 11: ifnull 2f
      // 14: goto 1b
      // 17: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield com/pA_3.c Lcom/xn_4;
      // 1f: goto 26
      // 22: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 0
      // 27: getfield com/pA_3.j Ljava/lang/String;
      // 2a: invokeinterface com/xn_4.z (Ljava/lang/String;)V 2
      // 2f: return
   }

   @Override
   public List n$List() {
      return List.of(
         new com.aD(this.t.V(), this::lambda$getActions$8).c(this::L),
         new com.aR(this, this.t.f(), this::r).u(Integer.valueOf(a(20337, 7489253290795128302L))),
         new com.aD(this.t.y(), this::lambda$getActions$9).u(a(25435, 3457714252384172427L)).c(this::lambda$getActions$10),
         new com.aD(this.t.Z(), this::lambda$getActions$11),
         new com.aD(this.t.J(), this::lambda$getActions$12).u(a(21323, 3818715481401969031L)).c(this::lambda$getActions$13).P(true),
         new com.aD(this.t.z(), this::lambda$getActions$14).c(this::lambda$getActions$15).P(true),
         new com.aD(this.t.m(), this::lambda$getActions$16).c(this::lambda$getActions$17),
         new com.aD(this.t.K(), this::lambda$getActions$18).c(this::lambda$getActions$19).P(true),
         new com.aD(this.t.H(), this::lambda$getActions$20)
      );
   }

   public void E() {
      this.u = new rU_3(new XE(0, -this.V.H()), new XE(this.N.R(), this.V.k()));
   }

   @NotNull
   private Boolean L$Boolean() {
      String var1 = this.l();
      if (var1 != null) {
         try {
            URI var2 = new URI(var1);
            var2.toURL();
            return true;
         } catch (Exception var3) {
         }
      }

      return false;
   }

   @Nullable
   private String l$String() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/pA_3.u Lcom/rU_3;
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifnull 74
      // 0f: goto 16
      // 12: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/pA_3.u Lcom/rU_3;
      // 1a: goto 21
      // 1d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 0
      // 22: getfield com/pA_3.N Lcom/OT;
      // 25: invokevirtual com/OT.R ()I
      // 28: invokevirtual com/rU_3.K (I)Lcom/KB;
      // 2b: astore 2
      // 2c: aload 2
      // 2d: getfield com/KB.X Ljava/lang/Object;
      // 30: iload 1
      // 31: ifeq 62
      // 34: ifnonnull 57
      // 37: goto 3e
      // 3a: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: aload 2
      // 3f: getfield com/KB.S Ljava/lang/Object;
      // 42: iload 1
      // 43: ifeq 62
      // 46: goto 4d
      // 49: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: ifnull 74
      // 50: goto 57
      // 53: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56: athrow
      // 57: aload 2
      // 58: getfield com/KB.X Ljava/lang/Object;
      // 5b: goto 62
      // 5e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: checkcast com/XE
      // 65: aload 2
      // 66: getfield com/KB.S Ljava/lang/Object;
      // 69: checkcast com/XE
      // 6c: aload 0
      // 6d: getfield com/pA_3.V Lcom/im_4;
      // 70: invokestatic com/a7.v (Lcom/XE;Lcom/XE;Lcom/im_4;)Ljava/lang/String;
      // 73: areturn
      // 74: aconst_null
      // 75: areturn
   }

   protected boolean C$boolean() {
      int var1 = _y_2.y();

      try {
         boolean var10000 = Desktop.isDesktopSupported();
         if (var1 != 0) {
            return var10000;
         }

         if (!var10000) {
            return false;
         }
      } catch (Exception var5) {
         throw a(var5);
      }

      try {
         String var2 = this.l();

         try {
            if (var2 != null) {
               Desktop.getDesktop().browse(new URI(var2));
            }
         } catch (Exception var3) {
            throw a(var3);
         }
      } catch (Exception var4) {
      }

      return false;
   }

   public void n$void() {
      this.X(true);
   }

   protected void X(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield com/pA_3.V Lcom/im_4;
      // 08: iload 2
      // 09: ifeq 24
      // 0c: invokevirtual com/im_4.T ()Z
      // 0f: ifne f3
      // 12: goto 19
      // 15: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield com/pA_3.V Lcom/im_4;
      // 1d: goto 24
      // 20: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: invokevirtual com/im_4.c ()V
      // 27: aload 0
      // 28: iload 2
      // 29: ifeq e7
      // 2c: getfield com/pA_3.cE Lcom/ab_2;
      // 2f: ifnull d7
      // 32: goto 39
      // 35: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: iload 1
      // 3a: iload 2
      // 3b: ifeq 6a
      // 3e: goto 45
      // 41: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: ifeq a5
      // 48: goto 4f
      // 4b: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: aload 0
      // 50: iload 2
      // 51: ifeq e7
      // 54: goto 5b
      // 57: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: getfield com/pA_3.cE Lcom/ab_2;
      // 5e: invokeinterface com/ab_2.I ()I 1
      // 63: goto 6a
      // 66: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69: athrow
      // 6a: ifle d7
      // 6d: aload 0
      // 6e: getfield com/pA_3.V Lcom/im_4;
      // 71: aload 0
      // 72: getfield com/pA_3.cE Lcom/ab_2;
      // 75: invokeinterface com/ab_2.I ()I 1
      // 7a: bipush 1
      // 7b: isub
      // 7c: invokevirtual com/im_4.D (I)Lcom/dC_3;
      // 7f: astore 3
      // 80: aload 0
      // 81: getfield com/pA_3.V Lcom/im_4;
      // 84: invokevirtual com/im_4.W ()V
      // 87: aload 0
      // 88: getfield com/pA_3.cE Lcom/ab_2;
      // 8b: bipush 0
      // 8c: invokeinterface com/ab_2.q (I)V 2
      // 91: aload 0
      // 92: getfield com/pA_3.w Lcom/d__2;
      // 95: bipush 1
      // 96: invokevirtual com/d__2.J (I)V
      // 99: aload 0
      // 9a: getfield com/pA_3.V Lcom/im_4;
      // 9d: aload 3
      // 9e: invokevirtual com/im_4.j (Lcom/dC_3;)V
      // a1: iload 2
      // a2: ifne d7
      // a5: aload 0
      // a6: getfield com/pA_3.V Lcom/im_4;
      // a9: invokevirtual com/im_4.W ()V
      // ac: aload 0
      // ad: getfield com/pA_3.cE Lcom/ab_2;
      // b0: bipush 0
      // b1: invokeinterface com/ab_2.i (I)V 2
      // b6: aload 0
      // b7: getfield com/pA_3.cE Lcom/ab_2;
      // ba: bipush 1
      // bb: invokeinterface com/ab_2.q (I)V 2
      // c0: aload 0
      // c1: getfield com/pA_3.w Lcom/d__2;
      // c4: bipush 0
      // c5: invokevirtual com/d__2.z (I)V
      // c8: aload 0
      // c9: getfield com/pA_3.w Lcom/d__2;
      // cc: bipush 1
      // cd: invokevirtual com/d__2.J (I)V
      // d0: goto d7
      // d3: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d6: athrow
      // d7: aload 0
      // d8: getfield com/pA_3.i Ljavax/swing/BoundedRangeModel;
      // db: bipush 0
      // dc: invokeinterface javax/swing/BoundedRangeModel.setValue (I)V 2
      // e1: aload 0
      // e2: bipush 1
      // e3: invokespecial com/pA_3.l (Z)V
      // e6: aload 0
      // e7: aload 0
      // e8: getfield com/pA_3.i Ljavax/swing/BoundedRangeModel;
      // eb: invokeinterface javax/swing/BoundedRangeModel.getValue ()I 1
      // f0: putfield com/pA_3.P I
      // f3: return
   }

   @Override
   public com.cS_3 c$comcS_3() {
      return this.R;
   }

   @Override
   public void Y(com.cS_3 var1) {
      this.R = var1;
   }

   private boolean u(KeyEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/_y_2.y ()I
      // 003: istore 2
      // 004: aload 0
      // 005: invokespecial com/pA_3.e ()Z
      // 008: iload 2
      // 009: ifne 020
      // 00c: ifeq 01c
      // 00f: goto 016
      // 012: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: bipush 0
      // 017: ireturn
      // 018: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 1
      // 01d: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 020: istore 3
      // 021: aload 1
      // 022: invokevirtual java/awt/event/KeyEvent.getKeyChar ()C
      // 025: istore 4
      // 027: aload 0
      // 028: aload 1
      // 029: putfield com/pA_3.cr Ljava/awt/event/KeyEvent;
      // 02c: iload 3
      // 02d: sipush 14606
      // 030: ldc2_w 7639814560544170960
      // 033: invokestatic com/pA_3.a (IJ)I
      // 036: iload 2
      // 037: ifne 088
      // 03a: if_icmpne 07d
      // 03d: goto 044
      // 040: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 043: athrow
      // 044: iload 4
      // 046: sipush 8389
      // 049: ldc2_w 6054907174772357660
      // 04c: invokestatic com/pA_3.a (IJ)I
      // 04f: iload 2
      // 050: ifne 088
      // 053: goto 05a
      // 056: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: if_icmpne 07d
      // 05d: goto 064
      // 060: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: aload 0
      // 065: getfield com/pA_3.cc Lcom/E0;
      // 068: bipush 1
      // 069: newarray 8
      // 06b: dup
      // 06c: bipush 0
      // 06d: sipush 28490
      // 070: ldc2_w 2987198948788467087
      // 073: invokestatic com/pA_3.a (IJ)I
      // 076: bastore
      // 077: bipush 1
      // 078: invokevirtual com/E0.L ([BZ)V
      // 07b: bipush 1
      // 07c: ireturn
      // 07d: iload 4
      // 07f: sipush 17162
      // 082: ldc2_w 6332241477127166453
      // 085: invokestatic com/pA_3.a (IJ)I
      // 088: iload 2
      // 089: ifne 0aa
      // 08c: if_icmpne 0d1
      // 08f: goto 096
      // 092: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 095: athrow
      // 096: aload 1
      // 097: invokevirtual java/awt/event/KeyEvent.getModifiersEx ()I
      // 09a: sipush 10243
      // 09d: ldc2_w 1355689121900311257
      // 0a0: invokestatic com/pA_3.a (IJ)I
      // 0a3: goto 0aa
      // 0a6: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a9: athrow
      // 0aa: iand
      // 0ab: iload 2
      // 0ac: ifne 0d0
      // 0af: ifeq 0d1
      // 0b2: goto 0b9
      // 0b5: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b8: athrow
      // 0b9: aload 0
      // 0ba: getfield com/pA_3.cc Lcom/E0;
      // 0bd: bipush 1
      // 0be: newarray 8
      // 0c0: dup
      // 0c1: bipush 0
      // 0c2: bipush 0
      // 0c3: bastore
      // 0c4: bipush 1
      // 0c5: invokevirtual com/E0.L ([BZ)V
      // 0c8: bipush 1
      // 0c9: goto 0d0
      // 0cc: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cf: athrow
      // 0d0: ireturn
      // 0d1: aload 0
      // 0d2: getfield com/pA_3.cc Lcom/E0;
      // 0d5: iload 3
      // 0d6: aload 1
      // 0d7: invokevirtual java/awt/event/KeyEvent.getModifiers ()I
      // 0da: invokevirtual com/E0.O (II)[B
      // 0dd: astore 5
      // 0df: aload 5
      // 0e1: ifnull 34e
      // 0e4: aload 1
      // 0e5: invokevirtual java/awt/event/KeyEvent.getModifiers ()I
      // 0e8: iload 2
      // 0e9: ifne 31a
      // 0ec: goto 0f3
      // 0ef: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: ifne 307
      // 0f6: goto 0fd
      // 0f9: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: getfield com/pA_3.L Lcom/_y_2;
      // 101: invokevirtual com/_y_2.G ()Lcom/DI;
      // 104: astore 6
      // 106: iload 2
      // 107: ifne 311
      // 10a: aload 6
      // 10c: ifnull 307
      // 10f: goto 116
      // 112: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: aload 6
      // 118: invokevirtual com/DI.H ()Llv_4;
      // 11b: astore 7
      // 11d: iload 2
      // 11e: ifne 311
      // 121: aload 7
      // 123: ifnull 307
      // 126: goto 12d
      // 129: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12c: athrow
      // 12d: invokestatic com/c.f ()[Ljava/lang/Object;
      // 130: ldc2_w 270389152141252877
      // 133: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 136: swap
      // 137: aconst_null
      // 138: swap
      // 139: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 13c: goto 143
      // 13f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 142: athrow
      // 143: invokestatic com/c.f ()[Ljava/lang/Object;
      // 146: ldc2_w 410905379772103887
      // 149: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 14c: dup_x2
      // 14d: pop
      // 14e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 151: goto 158
      // 154: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 157: athrow
      // 158: aload 7
      // 15a: invokestatic com/c.f ()[Ljava/lang/Object;
      // 15d: ldc2_w 292557478156152530
      // 160: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 163: dup_x2
      // 164: pop
      // 165: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 168: goto 16f
      // 16b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 16e: athrow
      // 16f: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 172: ldc2_w 343419559142469673
      // 175: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 178: dup_x2
      // 179: pop
      // 17a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 17d: checkcast lv_4
      // 180: goto 187
      // 183: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 186: athrow
      // 187: astore 7
      // 189: bipush 0
      // 18a: istore 8
      // 18c: iload 3
      // 18d: sipush 2182
      // 190: ldc2_w 1305540605763424855
      // 193: invokestatic com/pA_3.a (IJ)I
      // 196: iload 2
      // 197: ifne 1d4
      // 19a: if_icmpeq 1c3
      // 19d: goto 1a4
      // 1a0: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a3: athrow
      // 1a4: iload 3
      // 1a5: iload 2
      // 1a6: ifne 31a
      // 1a9: goto 1b0
      // 1ac: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1af: athrow
      // 1b0: sipush 14606
      // 1b3: ldc2_w 7639814560544170960
      // 1b6: invokestatic com/pA_3.a (IJ)I
      // 1b9: if_icmpne 307
      // 1bc: goto 1c3
      // 1bf: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c2: athrow
      // 1c3: iload 3
      // 1c4: sipush 2182
      // 1c7: ldc2_w 1305540605763424855
      // 1ca: invokestatic com/pA_3.a (IJ)I
      // 1cd: goto 1d4
      // 1d0: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d3: athrow
      // 1d4: iload 2
      // 1d5: ifne 221
      // 1d8: if_icmpne 205
      // 1db: goto 1e2
      // 1de: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e1: athrow
      // 1e2: aload 7
      // 1e4: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1e7: ldc2_w 380273998966419876
      // 1ea: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1ed: dup_x2
      // 1ee: pop
      // 1ef: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1f2: checkcast java/lang/Integer
      // 1f5: invokevirtual java/lang/Integer.intValue ()I
      // 1f8: goto 1ff
      // 1fb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1fe: athrow
      // 1ff: istore 8
      // 201: iload 2
      // 202: ifeq 243
      // 205: iload 3
      // 206: iload 2
      // 207: ifne 245
      // 20a: goto 211
      // 20d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 210: athrow
      // 211: sipush 14606
      // 214: ldc2_w 7639814560544170960
      // 217: invokestatic com/pA_3.a (IJ)I
      // 21a: goto 221
      // 21d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 220: athrow
      // 221: if_icmpne 243
      // 224: aload 7
      // 226: invokestatic com/c.f ()[Ljava/lang/Object;
      // 229: ldc2_w 204862003733180970
      // 22c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 22f: dup_x2
      // 230: pop
      // 231: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 234: checkcast java/lang/Integer
      // 237: invokevirtual java/lang/Integer.intValue ()I
      // 23a: goto 241
      // 23d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 240: athrow
      // 241: istore 8
      // 243: iload 8
      // 245: iload 2
      // 246: ifne 299
      // 249: ifne 290
      // 24c: goto 253
      // 24f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 252: athrow
      // 253: aload 0
      // 254: getfield com/pA_3.cc Lcom/E0;
      // 257: bipush 1
      // 258: newarray 8
      // 25a: dup
      // 25b: bipush 0
      // 25c: sipush 9982
      // 25f: ldc2_w 7045004594113887292
      // 262: invokestatic com/pA_3.a (IJ)I
      // 265: bastore
      // 266: invokevirtual com/E0.a ([B)V
      // 269: aload 0
      // 26a: getfield com/pA_3.cc Lcom/E0;
      // 26d: sipush 8950
      // 270: sipush 20754
      // 273: invokestatic com/pA_3.a (II)Ljava/lang/String;
      // 276: sipush 8948
      // 279: sipush 22757
      // 27c: invokestatic com/pA_3.a (II)Ljava/lang/String;
      // 27f: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 282: invokevirtual com/E0.a ([B)V
      // 285: iload 2
      // 286: ifeq 2fe
      // 289: goto 290
      // 28c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28f: athrow
      // 290: iload 8
      // 292: goto 299
      // 295: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 298: athrow
      // 299: bipush 1
      // 29a: iload 2
      // 29b: ifne 2de
      // 29e: if_icmpne 2c9
      // 2a1: goto 2a8
      // 2a4: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a7: athrow
      // 2a8: aload 0
      // 2a9: getfield com/pA_3.cc Lcom/E0;
      // 2ac: bipush 1
      // 2ad: newarray 8
      // 2af: dup
      // 2b0: bipush 0
      // 2b1: sipush 14606
      // 2b4: ldc2_w 7639814560544170960
      // 2b7: invokestatic com/pA_3.a (IJ)I
      // 2ba: bastore
      // 2bb: invokevirtual com/E0.a ([B)V
      // 2be: iload 2
      // 2bf: ifeq 2fe
      // 2c2: goto 2c9
      // 2c5: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c8: athrow
      // 2c9: iload 8
      // 2cb: iload 2
      // 2cc: ifne 306
      // 2cf: goto 2d6
      // 2d2: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d5: athrow
      // 2d6: bipush 2
      // 2d7: goto 2de
      // 2da: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2dd: athrow
      // 2de: if_icmpne 2fe
      // 2e1: aload 0
      // 2e2: getfield com/pA_3.cc Lcom/E0;
      // 2e5: bipush 1
      // 2e6: newarray 8
      // 2e8: dup
      // 2e9: bipush 0
      // 2ea: sipush 2182
      // 2ed: ldc2_w 1305540605763424855
      // 2f0: invokestatic com/pA_3.a (IJ)I
      // 2f3: bastore
      // 2f4: invokevirtual com/E0.a ([B)V
      // 2f7: goto 2fe
      // 2fa: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fd: athrow
      // 2fe: aload 0
      // 2ff: getfield com/pA_3.cc Lcom/E0;
      // 302: invokevirtual com/E0.K ()V
      // 305: bipush 1
      // 306: ireturn
      // 307: aload 0
      // 308: getfield com/pA_3.cc Lcom/E0;
      // 30b: aload 5
      // 30d: bipush 1
      // 30e: invokevirtual com/E0.L ([BZ)V
      // 311: aload 0
      // 312: getfield com/pA_3.t Lcom/rx_4;
      // 315: invokeinterface com/rx_4.F ()Z 1
      // 31a: iload 2
      // 31b: ifne 34d
      // 31e: ifeq 34c
      // 321: goto 328
      // 324: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 327: athrow
      // 328: iload 3
      // 329: invokestatic com/pA_3.u (I)Z
      // 32c: iload 2
      // 32d: ifne 34d
      // 330: goto 337
      // 333: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 336: athrow
      // 337: ifeq 34c
      // 33a: goto 341
      // 33d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 340: athrow
      // 341: aload 0
      // 342: invokespecial com/pA_3.R ()V
      // 345: goto 34c
      // 348: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34b: athrow
      // 34c: bipush 1
      // 34d: ireturn
      // 34e: aload 1
      // 34f: invokestatic com/pA_3.W (Ljava/awt/event/KeyEvent;)Z
      // 352: iload 2
      // 353: ifne 3c4
      // 356: ifeq 3bf
      // 359: goto 360
      // 35c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35f: athrow
      // 360: iload 4
      // 362: invokestatic java/lang/Character.isDefined (C)Z
      // 365: iload 2
      // 366: ifne 3c4
      // 369: goto 370
      // 36c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36f: athrow
      // 370: ifeq 3bf
      // 373: goto 37a
      // 376: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 379: athrow
      // 37a: aload 0
      // 37b: getfield com/pA_3.t Lcom/rx_4;
      // 37e: invokeinterface com/rx_4.A ()Z 1
      // 383: iload 2
      // 384: ifne 3c4
      // 387: goto 38e
      // 38a: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38d: athrow
      // 38e: ifeq 3bf
      // 391: goto 398
      // 394: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 397: athrow
      // 398: aload 0
      // 399: getfield com/pA_3.cc Lcom/E0;
      // 39c: new java/lang/String
      // 39f: dup
      // 3a0: bipush 2
      // 3a1: newarray 5
      // 3a3: dup
      // 3a4: bipush 0
      // 3a5: sipush 19061
      // 3a8: ldc2_w 3405883887614087355
      // 3ab: invokestatic com/pA_3.a (IJ)I
      // 3ae: castore
      // 3af: dup
      // 3b0: bipush 1
      // 3b1: aload 1
      // 3b2: invokestatic com/pA_3.l (Ljava/awt/event/KeyEvent;)C
      // 3b5: castore
      // 3b6: invokespecial java/lang/String.<init> ([C)V
      // 3b9: bipush 1
      // 3ba: invokevirtual com/E0.s (Ljava/lang/String;Z)V
      // 3bd: bipush 1
      // 3be: ireturn
      // 3bf: iload 4
      // 3c1: invokestatic java/lang/Character.isISOControl (C)Z
      // 3c4: iload 2
      // 3c5: ifne 3de
      // 3c8: ifeq 3df
      // 3cb: goto 3d2
      // 3ce: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d1: athrow
      // 3d2: aload 0
      // 3d3: aload 1
      // 3d4: invokespecial com/pA_3.n (Ljava/awt/event/KeyEvent;)Z
      // 3d7: goto 3de
      // 3da: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3dd: athrow
      // 3de: ireturn
      // 3df: goto 3f5
      // 3e2: astore 3
      // 3e3: getstatic com/pA_3.cl Lorg/slf4j/Logger;
      // 3e6: sipush 8945
      // 3e9: sipush -12734
      // 3ec: invokestatic com/pA_3.a (II)Ljava/lang/String;
      // 3ef: aload 3
      // 3f0: invokeinterface org/slf4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 3f5: bipush 0
      // 3f6: ireturn
   }

   private static char l(@NotNull KeyEvent param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual java/awt/event/KeyEvent.getModifiersEx ()I
      // 08: sipush 23895
      // 0b: ldc2_w 3985978740999931822
      // 0e: invokestatic com/pA_3.a (IJ)I
      // 11: iand
      // 12: iload 1
      // 13: ifne 35
      // 16: ifeq 2d
      // 19: goto 20
      // 1c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 24: i2c
      // 25: invokestatic java/lang/Character.toUpperCase (C)C
      // 28: ireturn
      // 29: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: aload 0
      // 2e: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 31: i2c
      // 32: invokestatic java/lang/Character.toLowerCase (C)C
      // 35: ireturn
   }

   private static boolean W(@NotNull KeyEvent param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: aload 0
      // 04: invokevirtual java/awt/event/KeyEvent.getModifiersEx ()I
      // 07: istore 2
      // 08: istore 1
      // 09: iload 2
      // 0a: sipush 9381
      // 0d: ldc2_w 8054169350329351806
      // 10: invokestatic com/pA_3.a (IJ)I
      // 13: iand
      // 14: iload 1
      // 15: ifne 34
      // 18: ifeq 86
      // 1b: goto 22
      // 1e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: iload 2
      // 23: sipush 30026
      // 26: ldc2_w 6131735450241626033
      // 29: invokestatic com/pA_3.a (IJ)I
      // 2c: iand
      // 2d: goto 34
      // 30: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: iload 1
      // 35: ifne 54
      // 38: ifne 86
      // 3b: goto 42
      // 3e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: iload 2
      // 43: sipush 20807
      // 46: ldc2_w 1566352125640494002
      // 49: invokestatic com/pA_3.a (IJ)I
      // 4c: iand
      // 4d: goto 54
      // 50: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: iload 1
      // 55: ifne 74
      // 58: ifne 86
      // 5b: goto 62
      // 5e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: iload 2
      // 63: sipush 13931
      // 66: ldc2_w 6217271788376272022
      // 69: invokestatic com/pA_3.a (IJ)I
      // 6c: iand
      // 6d: goto 74
      // 70: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73: athrow
      // 74: iload 1
      // 75: ifne 83
      // 78: ifne 86
      // 7b: goto 82
      // 7e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 81: athrow
      // 82: bipush 1
      // 83: goto 87
      // 86: bipush 0
      // 87: ireturn
   }

   private boolean n(@NotNull KeyEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokestatic com/pA_3.W (Ljava/awt/event/KeyEvent;)Z
      // 08: iload 2
      // 09: ifeq 3e
      // 0c: ifeq 3a
      // 0f: goto 16
      // 12: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/pA_3.t Lcom/rx_4;
      // 1a: invokeinterface com/rx_4.A ()Z 1
      // 1f: iload 2
      // 20: ifeq 3e
      // 23: goto 2a
      // 26: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: ifeq 3a
      // 2d: goto 34
      // 30: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: bipush 0
      // 35: ireturn
      // 36: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: aload 1
      // 3b: invokevirtual java/awt/event/KeyEvent.getKeyChar ()C
      // 3e: istore 3
      // 3f: bipush 1
      // 40: newarray 5
      // 42: dup
      // 43: bipush 0
      // 44: iload 3
      // 45: castore
      // 46: astore 4
      // 48: iload 3
      // 49: iload 2
      // 4a: ifeq a3
      // 4d: sipush 21196
      // 50: ldc2_w 6893532493504497744
      // 53: invokestatic com/pA_3.a (IJ)I
      // 56: if_icmpne 89
      // 59: goto 60
      // 5c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f: athrow
      // 60: aload 1
      // 61: invokevirtual java/awt/event/KeyEvent.getModifiersEx ()I
      // 64: sipush 21903
      // 67: ldc2_w 4275880943809482574
      // 6a: invokestatic com/pA_3.a (IJ)I
      // 6d: iand
      // 6e: iload 2
      // 6f: ifeq a3
      // 72: goto 79
      // 75: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78: athrow
      // 79: ifeq 89
      // 7c: goto 83
      // 7f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 82: athrow
      // 83: bipush 0
      // 84: ireturn
      // 85: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 88: athrow
      // 89: aload 0
      // 8a: getfield com/pA_3.cc Lcom/E0;
      // 8d: new java/lang/String
      // 90: dup
      // 91: aload 4
      // 93: invokespecial java/lang/String.<init> ([C)V
      // 96: bipush 1
      // 97: invokevirtual com/E0.s (Ljava/lang/String;Z)V
      // 9a: aload 0
      // 9b: getfield com/pA_3.t Lcom/rx_4;
      // 9e: invokeinterface com/rx_4.F ()Z 1
      // a3: iload 2
      // a4: ifeq bd
      // a7: ifeq bc
      // aa: goto b1
      // ad: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b0: athrow
      // b1: aload 0
      // b2: invokespecial com/pA_3.R ()V
      // b5: goto bc
      // b8: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bb: athrow
      // bc: bipush 1
      // bd: ireturn
   }

   private static boolean u(int param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/_y_2.y ()I
      // 003: istore 1
      // 004: iload 0
      // 005: iload 1
      // 006: ifne 179
      // 009: sipush 20934
      // 00c: ldc2_w 5639302271626824463
      // 00f: invokestatic com/pA_3.a (IJ)I
      // 012: if_icmpeq 171
      // 015: goto 01c
      // 018: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: iload 0
      // 01d: iload 1
      // 01e: ifne 179
      // 021: goto 028
      // 024: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: sipush 15830
      // 02b: ldc2_w 4679694503128606480
      // 02e: invokestatic com/pA_3.a (IJ)I
      // 031: if_icmpeq 171
      // 034: goto 03b
      // 037: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03a: athrow
      // 03b: iload 0
      // 03c: iload 1
      // 03d: ifne 179
      // 040: goto 047
      // 043: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 046: athrow
      // 047: sipush 31909
      // 04a: ldc2_w 2355902596028819057
      // 04d: invokestatic com/pA_3.a (IJ)I
      // 050: if_icmpeq 171
      // 053: goto 05a
      // 056: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: iload 0
      // 05b: iload 1
      // 05c: ifne 179
      // 05f: goto 066
      // 062: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 065: athrow
      // 066: sipush 30466
      // 069: ldc2_w 701018757644938732
      // 06c: invokestatic com/pA_3.a (IJ)I
      // 06f: if_icmpeq 171
      // 072: goto 079
      // 075: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 078: athrow
      // 079: iload 0
      // 07a: iload 1
      // 07b: ifne 179
      // 07e: goto 085
      // 081: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 084: athrow
      // 085: sipush 10091
      // 088: ldc2_w 9214893830608436662
      // 08b: invokestatic com/pA_3.a (IJ)I
      // 08e: if_icmpeq 171
      // 091: goto 098
      // 094: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 097: athrow
      // 098: iload 0
      // 099: iload 1
      // 09a: ifne 179
      // 09d: goto 0a4
      // 0a0: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a3: athrow
      // 0a4: sipush 19709
      // 0a7: ldc2_w 5495874836332729879
      // 0aa: invokestatic com/pA_3.a (IJ)I
      // 0ad: if_icmpeq 171
      // 0b0: goto 0b7
      // 0b3: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b6: athrow
      // 0b7: iload 0
      // 0b8: iload 1
      // 0b9: ifne 179
      // 0bc: goto 0c3
      // 0bf: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c2: athrow
      // 0c3: sipush 14606
      // 0c6: ldc2_w 7639814560544170960
      // 0c9: invokestatic com/pA_3.a (IJ)I
      // 0cc: if_icmpeq 171
      // 0cf: goto 0d6
      // 0d2: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d5: athrow
      // 0d6: iload 0
      // 0d7: iload 1
      // 0d8: ifne 179
      // 0db: goto 0e2
      // 0de: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e1: athrow
      // 0e2: sipush 3818
      // 0e5: ldc2_w 4017640413363442733
      // 0e8: invokestatic com/pA_3.a (IJ)I
      // 0eb: if_icmpeq 171
      // 0ee: goto 0f5
      // 0f1: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f4: athrow
      // 0f5: iload 0
      // 0f6: iload 1
      // 0f7: ifne 179
      // 0fa: goto 101
      // 0fd: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 100: athrow
      // 101: sipush 27623
      // 104: ldc2_w 314566508295155990
      // 107: invokestatic com/pA_3.a (IJ)I
      // 10a: if_icmpeq 171
      // 10d: goto 114
      // 110: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 113: athrow
      // 114: iload 0
      // 115: iload 1
      // 116: ifne 179
      // 119: goto 120
      // 11c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11f: athrow
      // 120: sipush 26961
      // 123: ldc2_w 7495493721258455949
      // 126: invokestatic com/pA_3.a (IJ)I
      // 129: if_icmpeq 171
      // 12c: goto 133
      // 12f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 132: athrow
      // 133: iload 0
      // 134: iload 1
      // 135: ifne 179
      // 138: goto 13f
      // 13b: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13e: athrow
      // 13f: sipush 590
      // 142: ldc2_w 1313863485245102260
      // 145: invokestatic com/pA_3.a (IJ)I
      // 148: if_icmpeq 171
      // 14b: goto 152
      // 14e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 151: athrow
      // 152: iload 0
      // 153: iload 1
      // 154: ifne 179
      // 157: goto 15e
      // 15a: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15d: athrow
      // 15e: sipush 3444
      // 161: ldc2_w 1495277792869619617
      // 164: invokestatic com/pA_3.a (IJ)I
      // 167: if_icmpne 17c
      // 16a: goto 171
      // 16d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 170: athrow
      // 171: bipush 1
      // 172: goto 179
      // 175: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 178: athrow
      // 179: goto 17d
      // 17c: bipush 0
      // 17d: ireturn
   }

   private boolean f(KeyEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: istore 2
      // 04: aload 0
      // 05: invokespecial com/pA_3.e ()Z
      // 08: iload 2
      // 09: ifeq 23
      // 0c: ifeq 1c
      // 0f: goto 16
      // 12: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 1
      // 1d: invokevirtual java/awt/event/KeyEvent.getKeyChar ()C
      // 20: invokestatic java/lang/Character.isISOControl (C)Z
      // 23: iload 2
      // 24: ifeq 4b
      // 27: ifne 4a
      // 2a: goto 31
      // 2d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: aload 0
      // 32: aload 1
      // 33: invokespecial com/pA_3.n (Ljava/awt/event/KeyEvent;)Z
      // 36: ireturn
      // 37: astore 3
      // 38: getstatic com/pA_3.cl Lorg/slf4j/Logger;
      // 3b: sipush 8951
      // 3e: sipush 719
      // 41: invokestatic com/pA_3.a (II)Ljava/lang/String;
      // 44: aload 3
      // 45: invokeinterface org/slf4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 4a: bipush 0
      // 4b: ireturn
   }

   boolean Z(KeyEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 1
      // 001: istore 3
      // 002: invokestatic com/_y_2.y ()I
      // 005: aload 1
      // 006: invokestatic javax/swing/KeyStroke.getKeyStrokeForEvent (Ljava/awt/event/KeyEvent;)Ljavax/swing/KeyStroke;
      // 009: astore 4
      // 00b: istore 2
      // 00c: aload 4
      // 00e: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 011: ldc2_w 219793214144533914
      // 014: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 017: swap
      // 018: aconst_null
      // 019: swap
      // 01a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 01d: checkcast zG
      // 020: goto 027
      // 023: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 026: athrow
      // 027: astore 5
      // 029: aload 5
      // 02b: iload 2
      // 02c: ifne 03d
      // 02f: ifnull 19c
      // 032: goto 039
      // 035: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 038: athrow
      // 039: bipush 0
      // 03a: istore 3
      // 03b: aload 5
      // 03d: invokestatic com/c.f ()[Ljava/lang/Object;
      // 040: ldc2_w 468069908955066583
      // 043: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 046: dup_x2
      // 047: pop
      // 048: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 04b: checkcast java/lang/Integer
      // 04e: invokevirtual java/lang/Integer.intValue ()I
      // 051: goto 058
      // 054: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 057: athrow
      // 058: istore 6
      // 05a: iload 6
      // 05c: ldc2_w 518223218338208363
      // 05f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 062: aconst_null
      // 063: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 066: iload 2
      // 067: ifne 098
      // 06a: if_icmpne 085
      // 06d: goto 074
      // 070: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073: athrow
      // 074: aload 0
      // 075: bipush 0
      // 076: invokevirtual com/pA_3.A (Z)Z
      // 079: pop
      // 07a: iload 2
      // 07b: ifeq 19c
      // 07e: goto 085
      // 081: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 084: athrow
      // 085: iload 6
      // 087: ldc2_w 263914437926532128
      // 08a: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 08d: aconst_null
      // 08e: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 091: goto 098
      // 094: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 097: athrow
      // 098: iload 2
      // 099: ifne 0c3
      // 09c: if_icmpne 0b0
      // 09f: goto 0a6
      // 0a2: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: invokevirtual com/pA_3.y ()V
      // 0aa: bipush 0
      // 0ab: istore 3
      // 0ac: iload 2
      // 0ad: ifeq 19c
      // 0b0: iload 6
      // 0b2: ldc2_w 460316126853161418
      // 0b5: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0b8: aconst_null
      // 0b9: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0bc: goto 0c3
      // 0bf: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c2: athrow
      // 0c3: iload 2
      // 0c4: ifne 0f3
      // 0c7: if_icmpne 0e0
      // 0ca: goto 0d1
      // 0cd: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: invokevirtual com/pA_3.v ()V
      // 0d5: iload 2
      // 0d6: ifeq 19c
      // 0d9: goto 0e0
      // 0dc: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df: athrow
      // 0e0: iload 6
      // 0e2: ldc2_w 466286588116172621
      // 0e5: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0e8: aconst_null
      // 0e9: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0ec: goto 0f3
      // 0ef: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: iload 2
      // 0f4: ifne 147
      // 0f7: if_icmpne 129
      // 0fa: goto 101
      // 0fd: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 100: athrow
      // 101: aload 0
      // 102: getfield com/pA_3.L Lcom/_y_2;
      // 105: invokevirtual com/_y_2.x ()LU;
      // 108: invokestatic com/c.f ()[Ljava/lang/Object;
      // 10b: ldc2_w 222971910568398589
      // 10e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 111: dup_x2
      // 112: pop
      // 113: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 116: pop
      // 117: goto 11e
      // 11a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 11d: athrow
      // 11e: iload 2
      // 11f: ifeq 19c
      // 122: goto 129
      // 125: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 128: athrow
      // 129: iload 6
      // 12b: iload 2
      // 12c: ifne 1a0
      // 12f: goto 136
      // 132: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 135: athrow
      // 136: ldc2_w 124046016677888699
      // 139: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 13c: aconst_null
      // 13d: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 140: goto 147
      // 143: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 146: athrow
      // 147: if_icmpne 19c
      // 14a: aload 0
      // 14b: getfield com/pA_3.L Lcom/_y_2;
      // 14e: invokevirtual com/_y_2.G ()Lcom/DI;
      // 151: astore 7
      // 153: aload 7
      // 155: invokevirtual com/DI.t ()Z
      // 158: iload 2
      // 159: ifne 19b
      // 15c: ifne 193
      // 15f: goto 166
      // 162: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 165: athrow
      // 166: aload 7
      // 168: invokevirtual com/DI.i ()Z
      // 16b: iload 2
      // 16c: ifne 19b
      // 16f: goto 176
      // 172: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 175: athrow
      // 176: ifne 193
      // 179: goto 180
      // 17c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17f: athrow
      // 180: aload 0
      // 181: getfield com/pA_3.L Lcom/_y_2;
      // 184: invokevirtual com/_y_2.O ()Z
      // 187: pop
      // 188: iload 2
      // 189: ifeq 19c
      // 18c: goto 193
      // 18f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 192: athrow
      // 193: bipush 1
      // 194: goto 19b
      // 197: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19a: athrow
      // 19b: istore 3
      // 19c: aload 1
      // 19d: invokevirtual java/awt/event/KeyEvent.isAltDown ()Z
      // 1a0: iload 2
      // 1a1: ifne 1c8
      // 1a4: ifne 1c7
      // 1a7: goto 1ae
      // 1aa: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ad: athrow
      // 1ae: aload 1
      // 1af: invokevirtual java/awt/event/KeyEvent.isMetaDown ()Z
      // 1b2: iload 2
      // 1b3: ifne 1ca
      // 1b6: goto 1bd
      // 1b9: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bc: athrow
      // 1bd: ifeq 1c9
      // 1c0: goto 1c7
      // 1c3: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c6: athrow
      // 1c7: bipush 0
      // 1c8: istore 3
      // 1c9: iload 3
      // 1ca: ifne 1cd
      // 1cd: iload 3
      // 1ce: ireturn
   }

   boolean i(KeyEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/_y_2.y ()I
      // 003: aload 1
      // 004: invokestatic javax/swing/KeyStroke.getKeyStrokeForEvent (Ljava/awt/event/KeyEvent;)Ljavax/swing/KeyStroke;
      // 007: astore 3
      // 008: istore 2
      // 009: aload 3
      // 00a: invokevirtual javax/swing/KeyStroke.getModifiers ()I
      // 00d: iload 2
      // 00e: ifne 110
      // 011: ifne 10f
      // 014: goto 01b
      // 017: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: aload 1
      // 01c: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 01f: istore 4
      // 021: iload 4
      // 023: sipush 31892
      // 026: ldc2_w 8207080409332213258
      // 029: invokestatic com/pA_3.a (IJ)I
      // 02c: iload 2
      // 02d: ifne 08e
      // 030: if_icmpne 083
      // 033: goto 03a
      // 036: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 039: athrow
      // 03a: invokestatic java/lang/System.currentTimeMillis ()J
      // 03d: aload 0
      // 03e: getfield com/pA_3.h J
      // 041: lsub
      // 042: lstore 5
      // 044: aload 0
      // 045: getfield com/pA_3.cw I
      // 048: sipush 24823
      // 04b: ldc2_w 4846036050657573434
      // 04e: invokestatic com/pA_3.a (IJ)I
      // 051: iload 2
      // 052: ifne 08e
      // 055: if_icmpne 083
      // 058: goto 05f
      // 05b: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05e: athrow
      // 05f: aload 0
      // 060: getfield com/pA_3.cQ Z
      // 063: iload 2
      // 064: ifne 085
      // 067: goto 06e
      // 06a: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06d: athrow
      // 06e: ifeq 083
      // 071: goto 078
      // 074: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: aload 0
      // 079: invokevirtual com/pA_3.e ()V
      // 07c: goto 083
      // 07f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 082: athrow
      // 083: iload 4
      // 085: sipush 6575
      // 088: ldc2_w 3845226340508205932
      // 08b: invokestatic com/pA_3.a (IJ)I
      // 08e: iload 2
      // 08f: ifne 0bb
      // 092: if_icmpne 107
      // 095: goto 09c
      // 098: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09b: athrow
      // 09c: aload 0
      // 09d: iload 2
      // 09e: ifne 101
      // 0a1: goto 0a8
      // 0a4: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a7: athrow
      // 0a8: getfield com/pA_3.I I
      // 0ab: sipush 12242
      // 0ae: ldc2_w 1489795501300364599
      // 0b1: invokestatic com/pA_3.a (IJ)I
      // 0b4: goto 0bb
      // 0b7: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ba: athrow
      // 0bb: if_icmpne 100
      // 0be: invokestatic java/lang/System.currentTimeMillis ()J
      // 0c1: aload 0
      // 0c2: getfield com/pA_3.C J
      // 0c5: lsub
      // 0c6: lstore 5
      // 0c8: lload 5
      // 0ca: sipush 13230
      // 0cd: ldc2_w 6702412725534740752
      // 0d0: invokestatic com/pA_3.b (IJ)J
      // 0d3: lcmp
      // 0d4: ifge 100
      // 0d7: aload 0
      // 0d8: getfield com/pA_3.L Lcom/_y_2;
      // 0db: invokevirtual com/_y_2.H ()LF_;
      // 0de: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0e1: ldc2_w 444392071806916948
      // 0e4: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0e7: dup_x2
      // 0e8: pop
      // 0e9: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0ec: checkcast Dv_2
      // 0ef: goto 0f6
      // 0f2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0f5: athrow
      // 0f6: invokevirtual Dv_2.requestFocus ()V
      // 0f9: goto 100
      // 0fc: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ff: athrow
      // 100: aload 0
      // 101: invokestatic java/lang/System.currentTimeMillis ()J
      // 104: putfield com/pA_3.C J
      // 107: aload 0
      // 108: aload 1
      // 109: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 10c: putfield com/pA_3.I I
      // 10f: bipush 1
      // 110: ireturn
   }

   public boolean u$boolean() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: invokestatic java/lang/System.currentTimeMillis ()J
      // 06: aload 0
      // 07: getfield com/pA_3.ce J
      // 0a: lsub
      // 0b: lstore 2
      // 0c: istore 1
      // 0d: lload 2
      // 0e: sipush 26412
      // 11: ldc2_w 8347743596245845392
      // 14: invokestatic com/pA_3.b (IJ)J
      // 17: lcmp
      // 18: iload 1
      // 19: ifeq 2d
      // 1c: ifle 2c
      // 1f: goto 26
      // 22: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: bipush 0
      // 27: ireturn
      // 28: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: bipush 1
      // 2d: ireturn
   }

   public Pr_2 N$Pr_2() {
      return this.H;
   }

   public void Y(Pr_2 var1) {
      this.H = var1;
   }

   private void T$void() {
      this.w(false);
   }

   private void P$void() {
      this.w(true);
   }

   public void b(boolean param1, boolean param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield com/pA_3.u Lcom/rU_3;
      // 08: iload 3
      // 09: ifeq 21
      // 0c: ifnull 61
      // 0f: goto 16
      // 12: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/pA_3.u Lcom/rU_3;
      // 1a: goto 21
      // 1d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 0
      // 22: getfield com/pA_3.N Lcom/OT;
      // 25: invokevirtual com/OT.R ()I
      // 28: invokevirtual com/rU_3.K (I)Lcom/KB;
      // 2b: astore 4
      // 2d: aload 0
      // 2e: aload 4
      // 30: getfield com/KB.X Ljava/lang/Object;
      // 33: checkcast com/XE
      // 36: aload 4
      // 38: getfield com/KB.S Ljava/lang/Object;
      // 3b: checkcast com/XE
      // 3e: iload 2
      // 3f: invokespecial com/pA_3.u (Lcom/XE;Lcom/XE;Z)V
      // 42: iload 3
      // 43: ifeq 5d
      // 46: iload 1
      // 47: ifeq 61
      // 4a: goto 51
      // 4d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: aload 0
      // 52: aconst_null
      // 53: putfield com/pA_3.u Lcom/rU_3;
      // 56: goto 5d
      // 59: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: aload 0
      // 5e: invokevirtual com/pA_3.repaint ()V
      // 61: return
   }

   private boolean r(@Nullable KeyEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 14
      // 09: ifnull 54
      // 0c: goto 13
      // 0f: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 1
      // 14: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 17: sipush 28249
      // 1a: ldc2_w 7117702566464058511
      // 1d: invokestatic com/pA_3.a (IJ)I
      // 20: iload 2
      // 21: ifne 4d
      // 24: if_icmpne 54
      // 27: goto 2e
      // 2a: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: aload 1
      // 2f: invokevirtual java/awt/event/KeyEvent.getModifiersEx ()I
      // 32: iload 2
      // 33: ifne 51
      // 36: goto 3d
      // 39: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: sipush 20807
      // 40: ldc2_w 1566352125640494002
      // 43: invokestatic com/pA_3.a (IJ)I
      // 46: goto 4d
      // 49: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: if_icmpne 54
      // 50: bipush 1
      // 51: goto 55
      // 54: bipush 0
      // 55: istore 3
      // 56: iload 3
      // 57: ifeq 70
      // 5a: aload 0
      // 5b: getfield com/pA_3.u Lcom/rU_3;
      // 5e: ifnonnull 70
      // 61: goto 68
      // 64: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67: athrow
      // 68: bipush 1
      // 69: goto 71
      // 6c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f: athrow
      // 70: bipush 0
      // 71: istore 4
      // 73: aload 0
      // 74: iload 3
      // 75: bipush 0
      // 76: invokevirtual com/pA_3.b (ZZ)V
      // 79: iload 4
      // 7b: iload 2
      // 7c: ifne 8a
      // 7f: ifne 8d
      // 82: goto 89
      // 85: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 88: athrow
      // 89: bipush 1
      // 8a: goto 8e
      // 8d: bipush 0
      // 8e: ireturn
   }

   private void i() {
      this.b(false, true);
   }

   @Override
   protected void processInputMethodEvent(InputMethodEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: aload 1
      // 04: invokevirtual java/awt/event/InputMethodEvent.getCommittedCharacterCount ()I
      // 07: istore 3
      // 08: istore 2
      // 09: iload 2
      // 0a: ifeq 24
      // 0d: iload 3
      // 0e: ifle c8
      // 11: goto 18
      // 14: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 0
      // 19: aconst_null
      // 1a: putfield com/pA_3.cf Ljava/lang/String;
      // 1d: goto 24
      // 20: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 1
      // 25: invokevirtual java/awt/event/InputMethodEvent.getText ()Ljava/text/AttributedCharacterIterator;
      // 28: astore 4
      // 2a: aload 4
      // 2c: ifnull c4
      // 2f: new java/lang/StringBuilder
      // 32: dup
      // 33: invokespecial java/lang/StringBuilder.<init> ()V
      // 36: astore 5
      // 38: aload 4
      // 3a: invokeinterface java/text/AttributedCharacterIterator.first ()C 1
      // 3f: istore 6
      // 41: iload 3
      // 42: ifle a8
      // 45: iload 6
      // 47: iload 2
      // 48: ifeq ad
      // 4b: iload 2
      // 4c: ifeq 9f
      // 4f: goto 56
      // 52: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: sipush 12678
      // 59: ldc2_w 4931331269067123566
      // 5c: invokestatic com/pA_3.a (IJ)I
      // 5f: if_icmplt 98
      // 62: goto 69
      // 65: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68: athrow
      // 69: iload 6
      // 6b: iload 2
      // 6c: ifeq 9f
      // 6f: goto 76
      // 72: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75: athrow
      // 76: sipush 15152
      // 79: ldc2_w 2459836026063495597
      // 7c: invokestatic com/pA_3.a (IJ)I
      // 7f: if_icmpeq 98
      // 82: goto 89
      // 85: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 88: athrow
      // 89: aload 5
      // 8b: iload 6
      // 8d: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 90: pop
      // 91: goto 98
      // 94: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 97: athrow
      // 98: aload 4
      // 9a: invokeinterface java/text/AttributedCharacterIterator.next ()C 1
      // 9f: istore 6
      // a1: iinc 3 -1
      // a4: iload 2
      // a5: ifne 41
      // a8: aload 5
      // aa: invokevirtual java/lang/StringBuilder.length ()I
      // ad: ifle c4
      // b0: aload 0
      // b1: getfield com/pA_3.cc Lcom/E0;
      // b4: aload 5
      // b6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b9: bipush 1
      // ba: invokevirtual com/E0.s (Ljava/lang/String;Z)V
      // bd: goto c4
      // c0: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c3: athrow
      // c4: iload 2
      // c5: ifne da
      // c8: aload 0
      // c9: aload 1
      // ca: invokevirtual java/awt/event/InputMethodEvent.getText ()Ljava/text/AttributedCharacterIterator;
      // cd: invokestatic com/pA_3.y (Ljava/text/AttributedCharacterIterator;)Ljava/lang/String;
      // d0: putfield com/pA_3.cf Ljava/lang/String;
      // d3: goto da
      // d6: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d9: athrow
      // da: return
   }

   private static String y(@Nullable AttributedCharacterIterator param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: istore 1
      // 04: aload 0
      // 05: ifnonnull 0e
      // 08: aconst_null
      // 09: areturn
      // 0a: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d: athrow
      // 0e: new java/lang/StringBuilder
      // 11: dup
      // 12: invokespecial java/lang/StringBuilder.<init> ()V
      // 15: astore 2
      // 16: aload 0
      // 17: invokeinterface java/text/AttributedCharacterIterator.first ()C 1
      // 1c: istore 3
      // 1d: iload 3
      // 1e: sipush 10414
      // 21: ldc2_w 6876554608234541644
      // 24: invokestatic com/pA_3.a (IJ)I
      // 27: if_icmpeq 79
      // 2a: iload 3
      // 2b: iload 1
      // 2c: ifne 74
      // 2f: sipush 17162
      // 32: ldc2_w 6332241477127166453
      // 35: invokestatic com/pA_3.a (IJ)I
      // 38: if_icmplt 6e
      // 3b: goto 42
      // 3e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: iload 3
      // 43: iload 1
      // 44: ifne 74
      // 47: goto 4e
      // 4a: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: sipush 14606
      // 51: ldc2_w 7639814560544170960
      // 54: invokestatic com/pA_3.a (IJ)I
      // 57: if_icmpeq 6e
      // 5a: goto 61
      // 5d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: aload 2
      // 62: iload 3
      // 63: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 66: pop
      // 67: goto 6e
      // 6a: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d: athrow
      // 6e: aload 0
      // 6f: invokeinterface java/text/AttributedCharacterIterator.next ()C 1
      // 74: istore 3
      // 75: iload 1
      // 76: ifeq 1d
      // 79: aload 2
      // 7a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7d: areturn
   }

   @Override
   public InputMethodRequests getInputMethodRequests() {
      return new n__2(this, null);
   }

   public void H$void() {
      this.cF.stop();
   }

   @Override
   public void h(Graphics param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic java/lang/System.currentTimeMillis ()J
      // 003: lstore 3
      // 004: aload 0
      // 005: getfield com/pA_3.H Lcom/Pr_2;
      // 008: invokevirtual com/Pr_2.S ()V
      // 00b: aload 0
      // 00c: aload 0
      // 00d: getfield com/pA_3.O Lkx_4;
      // 010: invokestatic com/c.f ()[Ljava/lang/Object;
      // 013: ldc2_w 149968465491171480
      // 016: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 019: dup_x2
      // 01a: pop
      // 01b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 01e: checkcast nY
      // 021: goto 028
      // 024: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 027: athrow
      // 028: putfield com/pA_3.cM LnY;
      // 02b: aload 1
      // 02c: checkcast java/awt/Graphics2D
      // 02f: astore 5
      // 031: aload 0
      // 032: aload 5
      // 034: invokevirtual java/awt/Graphics2D.getTransform ()Ljava/awt/geom/AffineTransform;
      // 037: invokevirtual java/awt/geom/AffineTransform.getScaleX ()D
      // 03a: d2f
      // 03b: putfield com/pA_3.y F
      // 03e: invokestatic com/_y_2.M ()I
      // 041: aload 5
      // 043: getstatic java/awt/RenderingHints.KEY_TEXT_ANTIALIASING Ljava/awt/RenderingHints$Key;
      // 046: getstatic java/awt/RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB Ljava/lang/Object;
      // 049: invokevirtual java/awt/Graphics2D.setRenderingHint (Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
      // 04c: istore 2
      // 04d: aload 5
      // 04f: aload 0
      // 050: getfield com/pA_3.cM LnY;
      // 053: invokestatic com/c.f ()[Ljava/lang/Object;
      // 056: ldc2_w 345089686683358688
      // 059: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 05c: dup_x2
      // 05d: pop
      // 05e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 061: checkcast java/awt/Color
      // 064: goto 06b
      // 067: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 06a: athrow
      // 06b: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 06e: invokestatic com/c.f ()[Ljava/lang/Object;
      // 071: ldc2_w 270389152141252877
      // 074: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 077: swap
      // 078: aconst_null
      // 079: swap
      // 07a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 07d: goto 084
      // 080: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 083: athrow
      // 084: invokestatic com/c.f ()[Ljava/lang/Object;
      // 087: ldc2_w 306266403902896148
      // 08a: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 08d: dup_x2
      // 08e: pop
      // 08f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 092: goto 099
      // 095: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 098: athrow
      // 099: invokestatic com/c.f ()[Ljava/lang/Object;
      // 09c: ldc2_w 224406316798891066
      // 09f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0a2: dup_x2
      // 0a3: pop
      // 0a4: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0a7: checkcast java/lang/Boolean
      // 0aa: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0ad: goto 0b4
      // 0b0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b3: athrow
      // 0b4: iload 2
      // 0b5: ifeq 0fb
      // 0b8: ifne 0d8
      // 0bb: goto 0c2
      // 0be: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c1: athrow
      // 0c2: aload 5
      // 0c4: bipush 0
      // 0c5: bipush 0
      // 0c6: aload 0
      // 0c7: invokevirtual com/pA_3.getWidth ()I
      // 0ca: aload 0
      // 0cb: invokevirtual com/pA_3.getHeight ()I
      // 0ce: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 0d1: goto 0d8
      // 0d4: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d7: athrow
      // 0d8: aload 0
      // 0d9: getfield com/pA_3.V Lcom/im_4;
      // 0dc: aload 0
      // 0dd: getfield com/pA_3.P I
      // 0e0: aload 0
      // 0e1: getfield com/pA_3.N Lcom/OT;
      // 0e4: invokevirtual com/OT.c ()I
      // 0e7: new com/Ep_2
      // 0ea: dup
      // 0eb: aload 0
      // 0ec: aload 5
      // 0ee: invokespecial com/Ep_2.<init> (Lcom/pA_3;Ljava/awt/Graphics2D;)V
      // 0f1: invokevirtual com/im_4.q (IILcom/Lf_2;)V
      // 0f4: aload 0
      // 0f5: getfield com/pA_3.w Lcom/d__2;
      // 0f8: invokevirtual com/d__2.O ()I
      // 0fb: istore 6
      // 0fd: aload 0
      // 0fe: getfield com/pA_3.P I
      // 101: aload 0
      // 102: invokevirtual com/pA_3.L ()I
      // 105: iadd
      // 106: iload 2
      // 107: ifeq 1a5
      // 10a: iload 6
      // 10c: if_icmple 190
      // 10f: goto 116
      // 112: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: aload 0
      // 117: getfield com/pA_3.w Lcom/d__2;
      // 11a: invokevirtual com/d__2.Q ()I
      // 11d: istore 7
      // 11f: aload 0
      // 120: getfield com/pA_3.V Lcom/im_4;
      // 123: iload 7
      // 125: iload 6
      // 127: invokevirtual com/im_4.X (II)Lcom/KB;
      // 12a: astore 8
      // 12c: aload 8
      // 12e: getfield com/KB.S Ljava/lang/Object;
      // 131: iload 2
      // 132: ifeq 14b
      // 135: ifnull 151
      // 138: goto 13f
      // 13b: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13e: athrow
      // 13f: aload 8
      // 141: getfield com/KB.S Ljava/lang/Object;
      // 144: goto 14b
      // 147: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14a: athrow
      // 14b: checkcast com/YP
      // 14e: goto 158
      // 151: aload 0
      // 152: getfield com/pA_3.cY Lcom/ov_4;
      // 155: invokevirtual com/ov_4.U ()Lcom/YP;
      // 158: astore 9
      // 15a: aload 0
      // 15b: aload 9
      // 15d: invokespecial com/pA_3.Y (Lcom/YP;)Lcom/YP;
      // 160: astore 10
      // 162: aload 0
      // 163: iload 7
      // 165: iload 6
      // 167: invokespecial com/pA_3.l (II)Z
      // 16a: istore 11
      // 16c: aload 0
      // 16d: getfield com/pA_3.w Lcom/d__2;
      // 170: aload 8
      // 172: getfield com/KB.X Ljava/lang/Object;
      // 175: checkcast java/lang/Character
      // 178: invokevirtual java/lang/Character.toString ()Ljava/lang/String;
      // 17b: aload 5
      // 17d: iload 11
      // 17f: ifeq 18b
      // 182: aload 10
      // 184: goto 18d
      // 187: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18a: athrow
      // 18b: aload 9
      // 18d: invokevirtual com/d__2.Z (Ljava/lang/String;Ljava/awt/Graphics2D;Lcom/YP;)V
      // 190: aload 0
      // 191: aload 5
      // 193: invokespecial com/pA_3.d (Ljava/awt/Graphics2D;)V
      // 196: aload 0
      // 197: aload 5
      // 199: aload 0
      // 19a: invokevirtual com/pA_3.getWidth ()I
      // 19d: aload 0
      // 19e: invokevirtual com/pA_3.getHeight ()I
      // 1a1: invokespecial com/pA_3.D (Ljava/awt/Graphics2D;II)V
      // 1a4: bipush 0
      // 1a5: istore 7
      // 1a7: iload 7
      // 1a9: aload 0
      // 1aa: getfield com/pA_3.V Lcom/im_4;
      // 1ad: invokevirtual com/im_4.O ()I
      // 1b0: if_icmpge 1de
      // 1b3: aload 0
      // 1b4: getfield com/pA_3.V Lcom/im_4;
      // 1b7: invokevirtual com/im_4.O ()I
      // 1ba: bipush 1
      // 1bb: isub
      // 1bc: iload 7
      // 1be: isub
      // 1bf: istore 8
      // 1c1: aload 0
      // 1c2: getfield com/pA_3.V Lcom/im_4;
      // 1c5: iload 8
      // 1c7: invokevirtual com/im_4.D (I)Lcom/dC_3;
      // 1ca: astore 9
      // 1cc: iinc 7 1
      // 1cf: iload 2
      // 1d0: ifeq 251
      // 1d3: iload 2
      // 1d4: ifne 1a7
      // 1d7: goto 1de
      // 1da: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1dd: athrow
      // 1de: aload 0
      // 1df: iload 2
      // 1e0: ifeq 24b
      // 1e3: getfield com/pA_3.cv LzB;
      // 1e6: ifnull 24a
      // 1e9: goto 1f0
      // 1ec: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ef: athrow
      // 1f0: aload 0
      // 1f1: getfield com/pA_3.L Lcom/_y_2;
      // 1f4: invokevirtual com/_y_2.O ()Lcom/pA_3;
      // 1f7: invokevirtual com/pA_3.c ()Ljava/awt/event/KeyEvent;
      // 1fa: astore 7
      // 1fc: iload 2
      // 1fd: ifeq 251
      // 200: aload 7
      // 202: ifnull 24a
      // 205: goto 20c
      // 208: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20b: athrow
      // 20c: aload 7
      // 20e: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 211: istore 8
      // 213: iload 2
      // 214: ifeq 251
      // 217: iload 8
      // 219: sipush 20863
      // 21c: ldc2_w 7415982398466050957
      // 21f: invokestatic com/pA_3.a (IJ)I
      // 222: if_icmpne 24a
      // 225: goto 22c
      // 228: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22b: athrow
      // 22c: aload 0
      // 22d: getfield com/pA_3.cv LzB;
      // 230: invokestatic com/c.f ()[Ljava/lang/Object;
      // 233: ldc2_w 533907123292002924
      // 236: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 239: dup_x2
      // 23a: pop
      // 23b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 23e: checkcast java/lang/String
      // 241: goto 248
      // 244: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 247: athrow
      // 248: astore 9
      // 24a: aload 0
      // 24b: invokestatic java/lang/System.currentTimeMillis ()J
      // 24e: putfield com/pA_3.cb J
      // 251: return
   }

   private com.YP S(com.YP var1) {
      com.YP var2 = var1.q();
      com.YP var3 = this.t.Y();
      var2.d(var3.s());
      var2.p(var3.K());
      var2.t(true);
      var2.Z(true);
      return var2;
   }

   @Override
   public void lostOwnership(Clipboard var1, Transferable var2) {
   }

   public _y_2 X$_y_2() {
      return this.L;
   }

   public void U(_y_2 var1) {
      this.L = var1;
   }

   public IR d$IR() {
      return this.s;
   }

   public void Y(IR var1) {
      this.s = var1;
   }

   boolean E$boolean() {
      return this.ca;
   }

   public void o() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 9b
      // 09: getfield com/pA_3.ca Z
      // 0c: ifeq 82
      // 0f: goto 16
      // 12: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 50
      // 1b: goto 22
      // 1e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: getfield com/pA_3.l Lcom/WZ;
      // 25: ifnull 3d
      // 28: goto 2f
      // 2b: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield com/pA_3.l Lcom/WZ;
      // 33: invokevirtual com/WZ.Y ()V
      // 36: goto 3d
      // 39: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: aload 0
      // 3e: bipush 0
      // 3f: putfield com/pA_3.ca Z
      // 42: aload 0
      // 43: getfield com/pA_3.i Ljavax/swing/BoundedRangeModel;
      // 46: aload 0
      // 47: getfield com/pA_3.p Ljavax/swing/event/ChangeListener;
      // 4a: invokeinterface javax/swing/BoundedRangeModel.removeChangeListener (Ljavax/swing/event/ChangeListener;)V 2
      // 4f: aload 0
      // 50: iload 1
      // 51: ifne 9b
      // 54: getfield com/pA_3.b LgH;
      // 57: ifnull 82
      // 5a: goto 61
      // 5d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: aload 0
      // 62: getfield com/pA_3.b LgH;
      // 65: invokestatic com/c.f ()[Ljava/lang/Object;
      // 68: ldc2_w 624731062495880669
      // 6b: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 6e: dup_x2
      // 6f: pop
      // 70: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 73: pop
      // 74: goto 7b
      // 77: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7a: athrow
      // 7b: goto 82
      // 7e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 81: athrow
      // 82: aload 0
      // 83: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 86: ldc2_w 242617331513341262
      // 89: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 8c: swap
      // 8d: aconst_null
      // 8e: swap
      // 8f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 92: pop
      // 93: goto 9a
      // 96: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 99: athrow
      // 9a: aload 0
      // 9b: invokevirtual com/pA_3.Z ()V
      // 9e: return
   }

   public void j() {
      this.c_ = null;
      this.ck = null;
      this.cL = null;
      this.Z = null;
      this.c4 = null;
      this.N = null;
      this.cc = null;
      this.x = null;
      this.c0 = null;
      this.u = null;
      this.v = null;
      this.c = null;
      this.t = null;
      this.V = null;
      this.cY = null;
      this.w = null;
      this.i = null;
      this.cT = null;
      this.j = null;
      this.R = null;
      this.cf = null;
      this.cF = null;
      this.D = null;
      this.Q = null;
      this.cE = null;
      this.l = null;
      this.cV = null;
      this.c2 = null;
      this.B = null;
      this.W = null;
      this.a = null;
      this.cp = null;
      this.e = null;
      this.s = null;
      this.cv = null;
      this.cH = null;
      this.L = null;
      this.O = null;
      this.cM = null;
      this.d = null;
      this.cr = null;
      this.f = null;
      this.cs = null;
      this.K = null;
      this.S = null;
      this.q = null;
      this.m = null;
      this.H = null;
      this.p = null;
      this.G = null;
      this.b = null;
   }

   public void Z$void() {
      Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
      Object[] var10001 = com.c.a(new _D(this), com.c.c(222883478649268280L).getInt(null));
      Method var10003 = com.c.d(266288712085965362L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   private boolean lambda$getActions$20(KeyEvent var1) {
      this.t();
      return true;
   }

   private Boolean lambda$getActions$19() {
      int var1 = _y_2.M();

      try {
         boolean var10000 = this.V.T();
         if (var1 == 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (IllegalStateException var2) {
         throw a(var2);
      }

      return false;
   }

   private boolean lambda$getActions$18(KeyEvent var1) {
      this.p();
      return true;
   }

   private Boolean lambda$getActions$17() {
      int var1 = _y_2.M();

      try {
         boolean var10000 = this.V.T();
         if (var1 == 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (IllegalStateException var2) {
         throw a(var2);
      }

      return false;
   }

   private boolean lambda$getActions$16(KeyEvent var1) {
      this.q();
      return true;
   }

   private Boolean lambda$getActions$15() {
      int var1 = _y_2.M();

      try {
         boolean var10000 = this.V.T();
         if (var1 == 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (IllegalStateException var2) {
         throw a(var2);
      }

      return false;
   }

   private boolean lambda$getActions$14(KeyEvent var1) {
      this.f();
      return true;
   }

   private Boolean lambda$getActions$13() {
      int var1 = _y_2.y();

      try {
         boolean var10000 = this.V.T();
         if (var1 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (IllegalStateException var2) {
         throw a(var2);
      }

      return false;
   }

   private boolean lambda$getActions$12(KeyEvent var1) {
      this.n();
      return true;
   }

   private boolean lambda$getActions$11(KeyEvent var1) {
      this.E();
      return true;
   }

   private Boolean lambda$getActions$10() {
      try {
         if (this.C() != null) {
            return true;
         }
      } catch (IllegalStateException var1) {
         throw a(var1);
      }

      return false;
   }

   private boolean lambda$getActions$9(KeyEvent var1) {
      this.T();
      return true;
   }

   private boolean lambda$getActions$8(KeyEvent var1) {
      return this.C();
   }

   private void lambda$setScrollingEnabled$7() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: aload 0
      // 04: bipush 1
      // 05: invokespecial com/pA_3.l (Z)V
      // 08: istore 1
      // 09: aload 0
      // 0a: getfield com/pA_3.T Z
      // 0d: iload 1
      // 0e: ifeq 3d
      // 11: aload 0
      // 12: getfield com/pA_3.V Lcom/im_4;
      // 15: invokevirtual com/im_4.T ()Z
      // 18: if_icmpeq 65
      // 1b: goto 22
      // 1e: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 0
      // 23: aload 0
      // 24: getfield com/pA_3.V Lcom/im_4;
      // 27: invokevirtual com/im_4.T ()Z
      // 2a: putfield com/pA_3.T Z
      // 2d: aload 0
      // 2e: getfield com/pA_3.t Lcom/rx_4;
      // 31: invokeinterface com/rx_4.a ()Z 1
      // 36: goto 3d
      // 39: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: ifeq 65
      // 40: new javax/swing/Timer
      // 43: dup
      // 44: sipush 3818
      // 47: ldc2_w 4017640413363442733
      // 4a: invokestatic com/pA_3.a (IJ)I
      // 4d: invokedynamic actionPerformed ()Ljava/awt/event/ActionListener; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/awt/event/ActionEvent;)V, com/pA_3.lambda$setScrollingEnabled$5 (Ljava/awt/event/ActionEvent;)V, (Ljava/awt/event/ActionEvent;)V ]
      // 52: invokespecial javax/swing/Timer.<init> (ILjava/awt/event/ActionListener;)V
      // 55: astore 2
      // 56: aload 2
      // 57: aload 0
      // 58: aload 2
      // 59: invokedynamic actionPerformed (Lcom/pA_3;Ljavax/swing/Timer;)Ljava/awt/event/ActionListener; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/awt/event/ActionEvent;)V, com/pA_3.lambda$setScrollingEnabled$6 (Ljavax/swing/Timer;Ljava/awt/event/ActionEvent;)V, (Ljava/awt/event/ActionEvent;)V ]
      // 5e: invokevirtual javax/swing/Timer.addActionListener (Ljava/awt/event/ActionListener;)V
      // 61: aload 2
      // 62: invokevirtual javax/swing/Timer.start ()V
      // 65: return
   }

   private void lambda$setScrollingEnabled$6(Timer var1, ActionEvent var2) {
      this.d();
      var1.stop();
   }

   private static void lambda$setScrollingEnabled$5(ActionEvent var0) {
   }

   private void lambda$addTerminalMouseListener$4(iY_3 param1, MouseWheelEvent param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield com/pA_3.t Lcom/rx_4;
      // 08: invokeinterface com/rx_4.t ()Z 1
      // 0d: iload 3
      // 0e: ifne 63
      // 11: ifeq 5c
      // 14: goto 1b
      // 17: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 2
      // 1d: invokevirtual com/pA_3.b (Ljava/awt/event/MouseEvent;)Z
      // 20: iload 3
      // 21: ifne 63
      // 24: goto 2b
      // 27: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: ifeq 5c
      // 2e: goto 35
      // 31: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: aload 0
      // 36: aconst_null
      // 37: putfield com/pA_3.u Lcom/rU_3;
      // 3a: aload 0
      // 3b: aload 2
      // 3c: invokevirtual java/awt/event/MouseWheelEvent.getPoint ()Ljava/awt/Point;
      // 3f: invokespecial com/pA_3.z (Ljava/awt/Point;)Lcom/XE;
      // 42: astore 4
      // 44: aload 1
      // 45: aload 4
      // 47: getfield com/XE.q I
      // 4a: aload 4
      // 4c: getfield com/XE.r I
      // 4f: new com/E5
      // 52: dup
      // 53: aload 2
      // 54: invokespecial com/E5.<init> (Ljava/awt/event/MouseWheelEvent;)V
      // 57: invokeinterface com/iY_3.i (IILcom/Eo_2;)V 4
      // 5c: aload 0
      // 5d: getfield com/pA_3.V Lcom/im_4;
      // 60: invokevirtual com/im_4.T ()Z
      // 63: iload 3
      // 64: ifne 81
      // 67: ifeq f5
      // 6a: goto 71
      // 6d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 70: athrow
      // 71: aload 0
      // 72: getfield com/pA_3.t Lcom/rx_4;
      // 75: invokeinterface com/rx_4.b ()Z 1
      // 7a: goto 81
      // 7d: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80: athrow
      // 81: iload 3
      // 82: ifne 9a
      // 85: ifeq f5
      // 88: goto 8f
      // 8b: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8e: athrow
      // 8f: aload 2
      // 90: invokevirtual java/awt/event/MouseWheelEvent.getWheelRotation ()I
      // 93: goto 9a
      // 96: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 99: athrow
      // 9a: ifge b4
      // 9d: aload 0
      // 9e: getfield com/pA_3.cc Lcom/E0;
      // a1: sipush 17221
      // a4: ldc2_w 1421851152661535119
      // a7: invokestatic com/pA_3.a (IJ)I
      // aa: bipush 0
      // ab: invokevirtual com/E0.O (II)[B
      // ae: astore 4
      // b0: iload 3
      // b1: ifeq c7
      // b4: aload 0
      // b5: getfield com/pA_3.cc Lcom/E0;
      // b8: sipush 11902
      // bb: ldc2_w 8749279593381508278
      // be: invokestatic com/pA_3.a (IJ)I
      // c1: bipush 0
      // c2: invokevirtual com/E0.O (II)[B
      // c5: astore 4
      // c7: bipush 0
      // c8: istore 5
      // ca: iload 5
      // cc: aload 2
      // cd: invokevirtual java/awt/event/MouseWheelEvent.getUnitsToScroll ()I
      // d0: invokestatic java/lang/Math.abs (I)I
      // d3: if_icmpge f1
      // d6: aload 0
      // d7: getfield com/pA_3.cc Lcom/E0;
      // da: aload 4
      // dc: invokevirtual com/E0.J ([B)V
      // df: iinc 5 1
      // e2: iload 3
      // e3: ifne f5
      // e6: iload 3
      // e7: ifeq ca
      // ea: goto f1
      // ed: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // f0: athrow
      // f1: aload 2
      // f2: invokevirtual java/awt/event/MouseWheelEvent.consume ()V
      // f5: return
   }

   private void lambda$requestResize$3() {
      this.l(true);
   }

   private void lambda$requestResize$2(wF_3 var1) {
      this.c.c(var1);
   }

   private void lambda$init$1(ChangeEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: aload 0
      // 04: aload 0
      // 05: getfield com/pA_3.i Ljavax/swing/BoundedRangeModel;
      // 08: invokeinterface javax/swing/BoundedRangeModel.getValue ()I 1
      // 0d: putfield com/pA_3.P I
      // 10: aload 0
      // 11: bipush 1
      // 12: putfield com/pA_3.cS Z
      // 15: istore 2
      // 16: aload 0
      // 17: iload 2
      // 18: ifne 5a
      // 1b: getfield com/pA_3.u Lcom/rU_3;
      // 1e: ifnull 59
      // 21: goto 28
      // 24: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 0
      // 29: iload 2
      // 2a: ifne 5a
      // 2d: goto 34
      // 30: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: getfield com/pA_3.q LY3;
      // 37: invokevirtual Y3.isVisible ()Z
      // 3a: ifeq 59
      // 3d: goto 44
      // 40: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: aload 0
      // 45: invokevirtual com/pA_3.N ()V
      // 48: aload 0
      // 49: getfield com/pA_3.q LY3;
      // 4c: invokevirtual Y3.getParent ()Ljava/awt/Container;
      // 4f: invokevirtual java/awt/Container.doLayout ()V
      // 52: goto 59
      // 55: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58: athrow
      // 59: aload 0
      // 5a: invokevirtual com/pA_3.repaint ()V
      // 5d: return
   }

   private void lambda$init$0(JScrollBar param1, MouseWheelEvent param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 2
      // 06: iload 3
      // 07: ifne 20
      // 0a: invokevirtual com/pA_3.m (Ljava/awt/event/MouseEvent;)Z
      // 0d: ifeq 24
      // 10: goto 17
      // 13: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 0
      // 18: aload 2
      // 19: goto 20
      // 1c: invokestatic com/pA_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 1
      // 21: invokevirtual com/pA_3.i (Ljava/awt/event/MouseWheelEvent;Ljavax/swing/JScrollBar;)V
      // 24: return
   }

   static boolean Z(pA_3 var0, KeyEvent var1) {
      return var0.u(var1);
   }

   static boolean Y(pA_3 var0, KeyEvent var1) {
      return var0.f(var1);
   }

   static XE x(pA_3 var0, Point var1) {
      return var0.z(var1);
   }

   static rU_3 e(pA_3 var0) {
      return var0.u;
   }

   static XE A(pA_3 var0) {
      return var0.c0;
   }

   static XE f(pA_3 var0, XE var1) {
      return var0.c0 = var1;
   }

   static rU_3 t(pA_3 var0, rU_3 var1) {
      return var0.u = var1;
   }

   static rx_4 S(pA_3 var0) {
      return var0.t;
   }

   static void Z(pA_3 var0, int var1) {
      var0.b(var1);
   }

   static im_4 T(pA_3 var0) {
      return var0.V;
   }

   static void I(pA_3 var0) {
      var0.A();
   }

   static com.d__2 D(pA_3 var0) {
      return var0.w;
   }

   static BoundedRangeModel y(pA_3 var0) {
      return var0.i;
   }

   static String r(pA_3 var0) {
      return var0.C();
   }

   static E0 A$E0(pA_3 var0) {
      return var0.cc;
   }

   static void f(pA_3 var0, Point var1, boolean var2) {
      var0.u(var1, var2);
   }

   static com.oX_3 c(pA_3 var0) {
      return var0.B;
   }

   static com.oX_3 M(pA_3 var0, com.oX_3 var1) {
      return var0.B = var1;
   }

   static boolean D(pA_3 var0, MouseEvent var1) {
      return var0.B(var1);
   }

   static com.Yw_2 C(pA_3 var0, Point var1) {
      return var0.s(var1);
   }

   static void O(pA_3 var0) {
      var0.i();
   }

   static boolean C(pA_3 var0, boolean var1) {
      return var0.cz = var1;
   }

   static void Z(pA_3 var0, Component var1, boolean var2) {
      var0.J(var1, var2);
   }

   static void H(pA_3 var0, boolean var1) {
      var0.l(var1);
   }

   static AtomicBoolean p(pA_3 var0) {
      return var0.Q;
   }

   static void V(pA_3 var0) {
      var0.h();
   }

   static Logger t$Logger() {
      return cl;
   }

   static boolean H(pA_3 var0) {
      return var0.cq;
   }

   static boolean u(pA_3 var0, boolean var1) {
      return var0.cq = var1;
   }

   static com.Wq_2 H$comWq_2(pA_3 var0) {
      return var0.W;
   }

   static int k(pA_3 var0) {
      return var0.P();
   }

   static com.YP Y(pA_3 var0, com.YP var1) {
      return var0.y(var1);
   }

   static com.ov_4 Z(pA_3 var0) {
      return var0.cY;
   }

   static Color t(pA_3 var0, Et_2 var1) {
      return var0.r(var1);
   }

   static void M(pA_3 var0, int var1, int var2, j_2 var3, com.YP var4, Graphics2D var5, boolean var6, boolean var7) {
      var0.R(var1, var2, var3, var4, var5, var6, var7);
   }

   static void G(pA_3 var0, int var1, int var2, com.YP var3, j_2 var4, Graphics2D var5) {
      var0.r(var1, var2, var3, var4, var5);
   }

   static com.WZ o(pA_3 var0) {
      return var0.l;
   }

   static com.YP a(pA_3 var0, com.YP var1) {
      return var0.Z(var1);
   }

   static rU_3 Y(pA_3 var0) {
      return var0.e;
   }

   static com.YP l(pA_3 var0, com.YP var1) {
      return var0.S(var1);
   }

   static com.YP S(pA_3 var0, com.YP var1) {
      return var0.Y(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var21 = new String[15];
      int var19 = 0;
      String var18 = "\u0098¾\u0081#\u0018Q@¬'\t_¸äf\u0083+m\u0012\u008ac\u0007\u008a\u009b\u0086\u0004I\u0083\u001c\u0087©\u0014&\u0013\u0004\u0012ï¶áª\u0005àdî-Ú\u0006讉缴聈暟囃爈\u0018\u009aNÑòä¡î§v\u008a\u0092q\u00053áR\u0086\u000e\u0097îIõ|d\u0002粏跟\u0002柞抢%AókøB\u0083óéqL1n;ºD}O52àË-\u00868z\u008fSNhR\u0098#Þàºæ£\u0004籨赾道亅\u00029\u000f\bÏ\u009f\u0089\u0082\u0005Àq\u000f\u0004溺窤缽嬬\u0002奡劯";
      int var20 = "\u0098¾\u0081#\u0018Q@¬'\t_¸äf\u0083+m\u0012\u008ac\u0007\u008a\u009b\u0086\u0004I\u0083\u001c\u0087©\u0014&\u0013\u0004\u0012ï¶áª\u0005àdî-Ú\u0006讉缴聈暟囃爈\u0018\u009aNÑòä¡î§v\u008a\u0092q\u00053áR\u0086\u000e\u0097îIõ|d\u0002粏跟\u0002柞抢%AókøB\u0083óéqL1n;ºD}O52àË-\u00868z\u008fSNhR\u0098#Þàºæ£\u0004籨赾道亅\u00029\u000f\bÏ\u009f\u0089\u0082\u0005Àq\u000f\u0004溺窤缽嬬\u0002奡劯"
         .length();
      char var17 = 3;
      int var25 = -1;

      label79:
      while (true) {
         byte var10000 = 28;
         String var10001 = var18.substring(++var25, var25 + var17);
         byte var10002 = -1;

         while (true) {
            label74: {
               char[] var49 = var10001.toCharArray();
               int var10004 = var49.length;
               int var22 = 0;
               byte var52 = var10000;
               var43 = var49;
               int var32 = var10004;
               byte var60;
               char[] var67;
               int var10006;
               if (var10004 <= 1) {
                  var67 = var49;
                  var60 = var10000;
                  var10006 = var22;
               } else {
                  var52 = var10000;
                  var32 = var10004;
                  if (var10004 <= var22) {
                     break label74;
                  }

                  var67 = var49;
                  var60 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var76 = var67[var10006];
                  byte var77;
                  switch (var22 % 7) {
                     case 0:
                        var77 = 107;
                        break;
                     case 1:
                        var77 = 98;
                        break;
                     case 2:
                        var77 = 46;
                        break;
                     case 3:
                        var77 = 6;
                        break;
                     case 4:
                        var77 = 59;
                        break;
                     case 5:
                        var77 = 97;
                        break;
                     default:
                        var77 = 12;
                  }

                  var67[var10006] = (char)(var76 ^ var60 ^ var77);
                  var22++;
                  if (var52 == 0) {
                     var10006 = var52;
                     var67 = var43;
                     var60 = var52;
                  } else {
                     if (var32 <= var22) {
                        break;
                     }

                     var67 = var43;
                     var60 = var52;
                     var10006 = var22;
                  }
               }
            }

            String var54 = new String(var43).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var54;
                  if ((var25 += var17) >= var20) {
                     ab = var21;
                     bb = new String[15];
                     long var8 = 2055102573854366655L;
                     long[] var14 = new long[69];
                     int var11 = 0;
                     String var12 = "\u0013y\u0004|\u008c\u00838\u0010\u0001\u0018æÀõ\u008f\u0096Ô¢\u008bëË\u0094Sh\u0011°À\u0081MÃÎ&\u0001«\u0091½\u0014Ó.)æ\tjÁ\nä¬§ÁP\u0018¾].Ò\u0006\b\u00adV6\u0001ÏÑ¡\u008d¬º\u00979émosE\u0001d\u001bqØL\u001dÉ%¢=Ú#}ë¨0h5ÿ\u0012\u008c<\u0080âpr$å\u0090\u0010kyÊWÙ\u0080(\u0083\u0011q\r¢ÿ½bd]ðêÑ\u0085ô\tàq°â\u0014ÈâK\u001f%U\u001dqÓ0W§\u008cKÆ¬|«Rs.\u000etîÓºá\u0097\u0014öY§\u0006JB\u0016W¡GJü+\u0080â·Mµ\u00827\u0080¯!ÝS\u0091\u0096¢ÊP\u0096¬ÉùsOÀ¼\u00877ý\u008bHb\\\u008f\u0098\u009e²®\u0003æ\u0003á7-\nx\u0015ü`n\u001ejÊïò:³§\u0098\u0089¡\u008dÈÑc\u0018Â]ks\b]\u008e-Ù\u0085i\u001b]^4Õñ\u0006\n=Ôõh]©2¤°Ëï¼BjýÇØNÃË\u0013\u008f&·+\u0098I\u00ad7i/\u0090\u0085\u0096úð\u0083*\u0011s N\u0093ÆÔ\u000e\u0091B_bi¢_imp3\u0005Ð\u001bÜQ\u009b§´È\u0003¨H\n\u0080| Jz'ß¥¤dÎ:¦\u0017êzíº\u000eR\u0092nP\u008d¿\u0086î]\"\u008aÐ8¤\u0003\u000b·8#?W\b,¬þ\u0093Æ²õ\u008cÑ°ó\u0092¾j\u008d}°\u0011ù\u0085ÛvtÛM\u001fuw=\u0016C©:\u000e\u0017\u0006QEËók\u0082Åß4\u0019¬1Äú\u0004\u009e\nM3\u008f\u0003ÜöÈì?\u0092}\u00941\u0093y\u00110ñ\u0087S\u008bþ\u00ad\u001c\u009aú7\u0082qÉL\u008c\u0085d\u001c\u007fp¢îèÆ©È·Zç¼àCj\u0006\u008c\u0017¯qo.\u0099¼tå?\u0085ñV\f\rµ;\u0096\u0007x\u0016-oe(+p3\u008bh\u0010\u0013È\u000f\u009bÓt\u0088³[\u0017×2Äý§X>Üù%PN\u0012\u0013ª\u008b»\u0089fS\u008f";
                     int var13 = "\u0013y\u0004|\u008c\u00838\u0010\u0001\u0018æÀõ\u008f\u0096Ô¢\u008bëË\u0094Sh\u0011°À\u0081MÃÎ&\u0001«\u0091½\u0014Ó.)æ\tjÁ\nä¬§ÁP\u0018¾].Ò\u0006\b\u00adV6\u0001ÏÑ¡\u008d¬º\u00979émosE\u0001d\u001bqØL\u001dÉ%¢=Ú#}ë¨0h5ÿ\u0012\u008c<\u0080âpr$å\u0090\u0010kyÊWÙ\u0080(\u0083\u0011q\r¢ÿ½bd]ðêÑ\u0085ô\tàq°â\u0014ÈâK\u001f%U\u001dqÓ0W§\u008cKÆ¬|«Rs.\u000etîÓºá\u0097\u0014öY§\u0006JB\u0016W¡GJü+\u0080â·Mµ\u00827\u0080¯!ÝS\u0091\u0096¢ÊP\u0096¬ÉùsOÀ¼\u00877ý\u008bHb\\\u008f\u0098\u009e²®\u0003æ\u0003á7-\nx\u0015ü`n\u001ejÊïò:³§\u0098\u0089¡\u008dÈÑc\u0018Â]ks\b]\u008e-Ù\u0085i\u001b]^4Õñ\u0006\n=Ôõh]©2¤°Ëï¼BjýÇØNÃË\u0013\u008f&·+\u0098I\u00ad7i/\u0090\u0085\u0096úð\u0083*\u0011s N\u0093ÆÔ\u000e\u0091B_bi¢_imp3\u0005Ð\u001bÜQ\u009b§´È\u0003¨H\n\u0080| Jz'ß¥¤dÎ:¦\u0017êzíº\u000eR\u0092nP\u008d¿\u0086î]\"\u008aÐ8¤\u0003\u000b·8#?W\b,¬þ\u0093Æ²õ\u008cÑ°ó\u0092¾j\u008d}°\u0011ù\u0085ÛvtÛM\u001fuw=\u0016C©:\u000e\u0017\u0006QEËók\u0082Åß4\u0019¬1Äú\u0004\u009e\nM3\u008f\u0003ÜöÈì?\u0092}\u00941\u0093y\u00110ñ\u0087S\u008bþ\u00ad\u001c\u009aú7\u0082qÉL\u008c\u0085d\u001c\u007fp¢îèÆ©È·Zç¼àCj\u0006\u008c\u0017¯qo.\u0099¼tå?\u0085ñV\f\rµ;\u0096\u0007x\u0016-oe(+p3\u008bh\u0010\u0013È\u000f\u009bÓt\u0088³[\u0017×2Äý§X>Üù%PN\u0012\u0013ª\u008b»\u0089fS\u008f"
                        .length();
                     byte var10 = 0;

                     label53:
                     while (true) {
                        byte var34 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var34, var10).getBytes("ISO-8859-1");
                        long[] var27 = var14;
                        int var35 = var11++;
                        long var47 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var55 = -1;

                        while (true) {
                           long var65 = var47 ^ var8;
                           switch (var55) {
                              case 0:
                                 var27[var35] = var65;
                                 if (var10 >= var13) {
                                    db = var14;
                                    eb = new Integer[69];
                                    long var0 = 3141786312796678947L;
                                    long[] var6 = new long[3];
                                    int var3 = 0;
                                    String var4 = "X@ú\u0093ü(¯G\u001aü\u0080^\u0002&yÞv\u009a\u001eÝ\u0085à{Ç";
                                    int var5 = "X@ú\u0093ü(¯G\u001aü\u0080^\u0002&yÞv\u009a\u001eÝ\u0085à{Ç".length();
                                    byte var2 = 0;

                                    do {
                                       byte var37 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                                       int var38 = var3++;
                                       var65 = (
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
                                       byte var57 = -1;
                                       var6[var38] = var65;
                                    } while (var2 < var5);

                                    fb = var6;
                                    gb = new Long[3];
                                    cl = LoggerFactory.getLogger(pA_3.class);
                                    z = 0.05;
                                    J = new HashMap();
                                    return;
                                 }
                                 break;
                              default:
                                 var27[var35] = var65;
                                 if (var10 < var13) {
                                    continue label53;
                                 }

                                 var12 = "\u0007H\u0085)0\u00adºmY\u008eánók\u000fù";
                                 var13 = "\u0007H\u0085)0\u00adºmY\u008eánók\u000fù".length();
                                 var10 = 0;
                           }

                           byte var36 = var10;
                           var10 += 8;
                           var15 = var12.substring(var36, var10).getBytes("ISO-8859-1");
                           var27 = var14;
                           var35 = var11++;
                           var47 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var55 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var25);
                  break;
               default:
                  var21[var19++] = var54;
                  if ((var25 += var17) < var20) {
                     var17 = var18.charAt(var25);
                     continue label79;
                  }

                  var18 = " È\u0083ÝEÜ\u0006²<ÑC\u000e\u000f";
                  var20 = " È\u0083ÝEÜ\u0006²<ÑC\u000e\u000f".length();
                  var17 = 6;
                  var25 = -1;
            }

            var10000 = 70;
            var10001 = var18.substring(++var25, var25 + var17);
            var10002 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 8950) & 65535;
      if (bb[var2] == null) {
         char[] var3 = ab[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 29;
               break;
            case 1:
               var10000 = 254;
               break;
            case 2:
               var10000 = 132;
               break;
            case 3:
               var10000 = 116;
               break;
            case 4:
               var10000 = 120;
               break;
            case 5:
               var10000 = 231;
               break;
            case 6:
               var10000 = 24;
               break;
            case 7:
               var10000 = 197;
               break;
            case 8:
               var10000 = 28;
               break;
            case 9:
               var10000 = 27;
               break;
            case 10:
               var10000 = 237;
               break;
            case 11:
               var10000 = 238;
               break;
            case 12:
               var10000 = 22;
               break;
            case 13:
               var10000 = 228;
               break;
            case 14:
               var10000 = 235;
               break;
            case 15:
               var10000 = 206;
               break;
            case 16:
               var10000 = 112;
               break;
            case 17:
               var10000 = 42;
               break;
            case 18:
               var10000 = 83;
               break;
            case 19:
               var10000 = 169;
               break;
            case 20:
               var10000 = 81;
               break;
            case 21:
               var10000 = 66;
               break;
            case 22:
               var10000 = 179;
               break;
            case 23:
               var10000 = 233;
               break;
            case 24:
               var10000 = 201;
               break;
            case 25:
               var10000 = 23;
               break;
            case 26:
               var10000 = 104;
               break;
            case 27:
               var10000 = 190;
               break;
            case 28:
               var10000 = 76;
               break;
            case 29:
               var10000 = 102;
               break;
            case 30:
               var10000 = 222;
               break;
            case 31:
               var10000 = 60;
               break;
            case 32:
               var10000 = 227;
               break;
            case 33:
               var10000 = 64;
               break;
            case 34:
               var10000 = 85;
               break;
            case 35:
               var10000 = 174;
               break;
            case 36:
               var10000 = 240;
               break;
            case 37:
               var10000 = 13;
               break;
            case 38:
               var10000 = 30;
               break;
            case 39:
               var10000 = 122;
               break;
            case 40:
               var10000 = 141;
               break;
            case 41:
               var10000 = 34;
               break;
            case 42:
               var10000 = 18;
               break;
            case 43:
               var10000 = 253;
               break;
            case 44:
               var10000 = 90;
               break;
            case 45:
               var10000 = 217;
               break;
            case 46:
               var10000 = 84;
               break;
            case 47:
               var10000 = 129;
               break;
            case 48:
               var10000 = 82;
               break;
            case 49:
               var10000 = 26;
               break;
            case 50:
               var10000 = 31;
               break;
            case 51:
               var10000 = 226;
               break;
            case 52:
               var10000 = 153;
               break;
            case 53:
               var10000 = 32;
               break;
            case 54:
               var10000 = 207;
               break;
            case 55:
               var10000 = 124;
               break;
            case 56:
               var10000 = 198;
               break;
            case 57:
               var10000 = 215;
               break;
            case 58:
               var10000 = 187;
               break;
            case 59:
               var10000 = 149;
               break;
            case 60:
               var10000 = 195;
               break;
            case 61:
               var10000 = 8;
               break;
            case 62:
               var10000 = 242;
               break;
            case 63:
               var10000 = 92;
               break;
            case 64:
               var10000 = 50;
               break;
            case 65:
               var10000 = 191;
               break;
            case 66:
               var10000 = 14;
               break;
            case 67:
               var10000 = 250;
               break;
            case 68:
               var10000 = 219;
               break;
            case 69:
               var10000 = 150;
               break;
            case 70:
               var10000 = 114;
               break;
            case 71:
               var10000 = 136;
               break;
            case 72:
               var10000 = 1;
               break;
            case 73:
               var10000 = 185;
               break;
            case 74:
               var10000 = 17;
               break;
            case 75:
               var10000 = 155;
               break;
            case 76:
               var10000 = 164;
               break;
            case 77:
               var10000 = 61;
               break;
            case 78:
               var10000 = 39;
               break;
            case 79:
               var10000 = 19;
               break;
            case 80:
               var10000 = 77;
               break;
            case 81:
               var10000 = 134;
               break;
            case 82:
               var10000 = 200;
               break;
            case 83:
               var10000 = 160;
               break;
            case 84:
               var10000 = 0;
               break;
            case 85:
               var10000 = 163;
               break;
            case 86:
               var10000 = 5;
               break;
            case 87:
               var10000 = 249;
               break;
            case 88:
               var10000 = 111;
               break;
            case 89:
               var10000 = 101;
               break;
            case 90:
               var10000 = 33;
               break;
            case 91:
               var10000 = 91;
               break;
            case 92:
               var10000 = 208;
               break;
            case 93:
               var10000 = 63;
               break;
            case 94:
               var10000 = 55;
               break;
            case 95:
               var10000 = 58;
               break;
            case 96:
               var10000 = 131;
               break;
            case 97:
               var10000 = 45;
               break;
            case 98:
               var10000 = 44;
               break;
            case 99:
               var10000 = 203;
               break;
            case 100:
               var10000 = 142;
               break;
            case 101:
               var10000 = 193;
               break;
            case 102:
               var10000 = 241;
               break;
            case 103:
               var10000 = 16;
               break;
            case 104:
               var10000 = 245;
               break;
            case 105:
               var10000 = 12;
               break;
            case 106:
               var10000 = 139;
               break;
            case 107:
               var10000 = 74;
               break;
            case 108:
               var10000 = 11;
               break;
            case 109:
               var10000 = 183;
               break;
            case 110:
               var10000 = 2;
               break;
            case 111:
               var10000 = 165;
               break;
            case 112:
               var10000 = 182;
               break;
            case 113:
               var10000 = 166;
               break;
            case 114:
               var10000 = 97;
               break;
            case 115:
               var10000 = 145;
               break;
            case 116:
               var10000 = 15;
               break;
            case 117:
               var10000 = 123;
               break;
            case 118:
               var10000 = 106;
               break;
            case 119:
               var10000 = 59;
               break;
            case 120:
               var10000 = 214;
               break;
            case 121:
               var10000 = 109;
               break;
            case 122:
               var10000 = 230;
               break;
            case 123:
               var10000 = 168;
               break;
            case 124:
               var10000 = 21;
               break;
            case 125:
               var10000 = 178;
               break;
            case 126:
               var10000 = 88;
               break;
            case 127:
               var10000 = 72;
               break;
            case 128:
               var10000 = 67;
               break;
            case 129:
               var10000 = 48;
               break;
            case 130:
               var10000 = 151;
               break;
            case 131:
               var10000 = 196;
               break;
            case 132:
               var10000 = 232;
               break;
            case 133:
               var10000 = 234;
               break;
            case 134:
               var10000 = 157;
               break;
            case 135:
               var10000 = 133;
               break;
            case 136:
               var10000 = 110;
               break;
            case 137:
               var10000 = 51;
               break;
            case 138:
               var10000 = 43;
               break;
            case 139:
               var10000 = 211;
               break;
            case 140:
               var10000 = 236;
               break;
            case 141:
               var10000 = 180;
               break;
            case 142:
               var10000 = 212;
               break;
            case 143:
               var10000 = 99;
               break;
            case 144:
               var10000 = 46;
               break;
            case 145:
               var10000 = 87;
               break;
            case 146:
               var10000 = 181;
               break;
            case 147:
               var10000 = 36;
               break;
            case 148:
               var10000 = 189;
               break;
            case 149:
               var10000 = 167;
               break;
            case 150:
               var10000 = 49;
               break;
            case 151:
               var10000 = 239;
               break;
            case 152:
               var10000 = 100;
               break;
            case 153:
               var10000 = 9;
               break;
            case 154:
               var10000 = 205;
               break;
            case 155:
               var10000 = 255;
               break;
            case 156:
               var10000 = 188;
               break;
            case 157:
               var10000 = 135;
               break;
            case 158:
               var10000 = 146;
               break;
            case 159:
               var10000 = 140;
               break;
            case 160:
               var10000 = 3;
               break;
            case 161:
               var10000 = 154;
               break;
            case 162:
               var10000 = 175;
               break;
            case 163:
               var10000 = 173;
               break;
            case 164:
               var10000 = 148;
               break;
            case 165:
               var10000 = 247;
               break;
            case 166:
               var10000 = 137;
               break;
            case 167:
               var10000 = 7;
               break;
            case 168:
               var10000 = 47;
               break;
            case 169:
               var10000 = 246;
               break;
            case 170:
               var10000 = 156;
               break;
            case 171:
               var10000 = 80;
               break;
            case 172:
               var10000 = 70;
               break;
            case 173:
               var10000 = 127;
               break;
            case 174:
               var10000 = 172;
               break;
            case 175:
               var10000 = 96;
               break;
            case 176:
               var10000 = 68;
               break;
            case 177:
               var10000 = 210;
               break;
            case 178:
               var10000 = 229;
               break;
            case 179:
               var10000 = 244;
               break;
            case 180:
               var10000 = 171;
               break;
            case 181:
               var10000 = 130;
               break;
            case 182:
               var10000 = 204;
               break;
            case 183:
               var10000 = 248;
               break;
            case 184:
               var10000 = 73;
               break;
            case 185:
               var10000 = 225;
               break;
            case 186:
               var10000 = 144;
               break;
            case 187:
               var10000 = 20;
               break;
            case 188:
               var10000 = 118;
               break;
            case 189:
               var10000 = 121;
               break;
            case 190:
               var10000 = 170;
               break;
            case 191:
               var10000 = 158;
               break;
            case 192:
               var10000 = 159;
               break;
            case 193:
               var10000 = 194;
               break;
            case 194:
               var10000 = 176;
               break;
            case 195:
               var10000 = 213;
               break;
            case 196:
               var10000 = 65;
               break;
            case 197:
               var10000 = 25;
               break;
            case 198:
               var10000 = 79;
               break;
            case 199:
               var10000 = 108;
               break;
            case 200:
               var10000 = 177;
               break;
            case 201:
               var10000 = 71;
               break;
            case 202:
               var10000 = 4;
               break;
            case 203:
               var10000 = 252;
               break;
            case 204:
               var10000 = 35;
               break;
            case 205:
               var10000 = 192;
               break;
            case 206:
               var10000 = 202;
               break;
            case 207:
               var10000 = 199;
               break;
            case 208:
               var10000 = 41;
               break;
            case 209:
               var10000 = 78;
               break;
            case 210:
               var10000 = 38;
               break;
            case 211:
               var10000 = 10;
               break;
            case 212:
               var10000 = 162;
               break;
            case 213:
               var10000 = 95;
               break;
            case 214:
               var10000 = 117;
               break;
            case 215:
               var10000 = 113;
               break;
            case 216:
               var10000 = 125;
               break;
            case 217:
               var10000 = 138;
               break;
            case 218:
               var10000 = 220;
               break;
            case 219:
               var10000 = 147;
               break;
            case 220:
               var10000 = 93;
               break;
            case 221:
               var10000 = 98;
               break;
            case 222:
               var10000 = 40;
               break;
            case 223:
               var10000 = 216;
               break;
            case 224:
               var10000 = 89;
               break;
            case 225:
               var10000 = 143;
               break;
            case 226:
               var10000 = 224;
               break;
            case 227:
               var10000 = 184;
               break;
            case 228:
               var10000 = 56;
               break;
            case 229:
               var10000 = 119;
               break;
            case 230:
               var10000 = 69;
               break;
            case 231:
               var10000 = 251;
               break;
            case 232:
               var10000 = 223;
               break;
            case 233:
               var10000 = 105;
               break;
            case 234:
               var10000 = 161;
               break;
            case 235:
               var10000 = 75;
               break;
            case 236:
               var10000 = 126;
               break;
            case 237:
               var10000 = 62;
               break;
            case 238:
               var10000 = 186;
               break;
            case 239:
               var10000 = 94;
               break;
            case 240:
               var10000 = 218;
               break;
            case 241:
               var10000 = 53;
               break;
            case 242:
               var10000 = 221;
               break;
            case 243:
               var10000 = 209;
               break;
            case 244:
               var10000 = 37;
               break;
            case 245:
               var10000 = 54;
               break;
            case 246:
               var10000 = 86;
               break;
            case 247:
               var10000 = 152;
               break;
            case 248:
               var10000 = 6;
               break;
            case 249:
               var10000 = 57;
               break;
            case 250:
               var10000 = 103;
               break;
            case 251:
               var10000 = 107;
               break;
            case 252:
               var10000 = 115;
               break;
            case 253:
               var10000 = 52;
               break;
            case 254:
               var10000 = 243;
               break;
            default:
               var10000 = 128;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         bb[var2] = new String(var3).intern();
      }

      return bb[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6878;
      if (eb[var3] == null) {
         eb[var3] = (int)(db[var3] ^ var1);
      }

      return eb[var3];
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 25276) & 32767;
      if (gb[var3] == null) {
         gb[var3] = fb[var3] ^ var1;
      }

      return gb[var3];
   }
}





