package com.finalshell.ui.panel;

import com.finalshell.core.A6_2;
import com.finalshell.core.A7;
import com.finalshell.core.AD_2;
import com.finalshell.core.AR;
import com.finalshell.core.Ab2;
import com.finalshell.core.Bs2_2;
import com.finalshell.core.CS3_2;
import com.finalshell.core.Ca4_2;
import com.finalshell.core.Connect_2;
import com.finalshell.core.D2;
import com.finalshell.core.DV3;
import com.finalshell.core.D__2;
import com.finalshell.core.E0;
import com.finalshell.core.Et2;
import com.finalshell.core.GH_2;
import com.finalshell.core.Gj2;
import com.finalshell.core.IY3;
import com.finalshell.core.Im4;
import com.finalshell.core.K3;
import com.finalshell.core.KI;
import com.finalshell.core.Kx4_2;
import com.finalshell.core.LG3;
import com.finalshell.core.Le2;
import com.finalshell.core.Lt4;
import com.finalshell.core.NO3;
import com.finalshell.core.NY;
import com.finalshell.core.N__2;
import com.finalshell.core.Nl2_2;
import com.finalshell.core.Nt2;
import com.finalshell.core.OT;
import com.finalshell.core.OX3;
import com.finalshell.core.Ov4;
import com.finalshell.core.PD3;
import com.finalshell.core.Pr2;
import com.finalshell.core.QP_2;
import com.finalshell.core.RU3;
import com.finalshell.core.Rx4;
import com.finalshell.core.S3;
import com.finalshell.core.Ua2;
import com.finalshell.core.WZ;
import com.finalshell.core.Wq2_2;
import com.finalshell.core.XE;
import com.finalshell.core.XF3;
import com.finalshell.core.Xn4;
import com.finalshell.core.YA3;
import com.finalshell.core.YO3;
import com.finalshell.core.YP;
import com.finalshell.core.Yw2;
import com.finalshell.core.ZB_2;
import com.finalshell.crypto.ConnectHost;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Bl2;
import com.finalshell.task.D;
import com.finalshell.task.Lg2_2;
import com.finalshell.task.Ny4;
import com.finalshell.task.WZ3;
import com.finalshell.task.Yu2;
import com.finalshell.ui.adapter.GD;
import com.finalshell.ui.adapter.Oo2;
import com.finalshell.ui.adapter.Oq4;
import com.finalshell.ui.adapter.Q9;
import com.finalshell.ui.adapter.Yk2;
import com.finalshell.ui.listener.B9;
import com.finalshell.ui.listener.CV;
import com.finalshell.ui.listener.Dz4;
import com.finalshell.ui.listener.ET3;
import com.finalshell.ui.listener.FK;
import com.finalshell.ui.listener.Hb2;
import com.finalshell.ui.listener.I;
import com.finalshell.ui.listener.Lt2;
import com.finalshell.ui.listener.Ly4;
import com.finalshell.ui.listener.SB;
import com.finalshell.ui.listener.SU;
import com.finalshell.ui.listener.Sc2;
import com.finalshell.ui.listener.Wg2;
import com.finalshell.ui.listener.Wu2;
import com.finalshell.ui.listener.XH;
import com.finalshell.ui.listener.YU3;
import com.finalshell.ui.model.RP3;
import com.finalshell.ui.model.SY;
import com.finalshell.ui.model.WF3;
import com.finalshell.ui.model.YT;
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

public class SetBackgroundImagePanel extends JComponent implements DV3, CS3_2, ClipboardOwner, D2 {
   public static Logger cl;
   public static double z;
   public Font c_;
   public Font ck;
   public Font cL;
   public Font Z;
   public int cW = 0;
   public int cJ = 0;
   public Dimension c4 = new Dimension();
   public boolean cd;
   public OT N;
   public boolean cq = false;
   public E0 cc = null;
   public YT x = YT.MOUSE_REPORTING_NONE;
   public XE c0 = null;
   public RU3 u = null;
   public A6_2 v;
   public Xn4 c;
   public Rx4 t;
   public Im4 V;
   public Ov4 cY;
   public D__2 w = new D__2(this);
   public BoundedRangeModel i = new DefaultBoundedRangeModel(0, a(5921, 385034442389622210L), 0, a(5921, 385034442389622210L));
   public boolean X = true;
   public int P;
   public List cT = new CopyOnWriteArrayList();
   public String j = a(8956, -13003);
   public CS3_2 R;
   public String cf;
   public Timer cF;
   public AtomicInteger D;
   public AtomicBoolean Q;
   public int cK;
   public int c5;
   public Ab2 cE;
   public WZ l;
   public YA3 cV;
   public int Y;
   public I c2;
   public OX3 B;
   public Wq2_2 W;
   public volatile boolean r;
   public boolean T;
   public boolean cz;
   @Nullable
   public YP a;
   @Nullable
   public YP cp;
   public RU3 e;
   public int F;
   public int cy;
   public Connect_2 s;
   public ZB_2 cv;
   public boolean n;
   public int c6;
   public String cH;
   public ConnectionProperty L;
   public Kx4_2 O;
   public NY cM;
   public K3 d;
   public KeyEvent cr;
   public long E;
   public boolean g;
   public boolean o;
   public Object f;
   public StringBuffer cs;
   public long M;
   public XE K;
   public boolean cj;
   public ConnectHost S;
   public Y3 q;
   public Lt4 m;
   public int cw;
   public long h;
   public boolean cQ;
   public static HashMap J;
   public Pr2 H;
   public boolean k;
   public boolean c8;
   public boolean A;
   public ChangeListener p;
   public Clipboard G;
   public boolean cS;
   public int U;
   public GH_2 b;
   public int I;
   public long C;
   public long ce;
   public float y;
   public long cb;
   public boolean ca;
   public static String[] ab;
   public static String[] bb;
   public static long[] db;
   public static Integer[] eb;
   public static long[] fb;
   public static Long[] gb;

   public SetBackgroundImagePanel(@NotNull Rx4 var1, @NotNull Im4 var2, @NotNull Ov4 var3) {
      long var10;
      Object[] var7;
      Object[] var9;
      int var10000 = ConnectionProperty.M$int();
      this.D = new AtomicInteger(0);
      this.Q = new AtomicBoolean(true);
      this.cK = a(1039, 8977415319888338665L);
      this.c5 = a(24345, 3875527706677560814L);
      this.cV = null;
      this.Y = 0;
      this.c2 = new I(this);
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
         this.H = new Pr2(this);
         this.k = false;
         this.c8 = false;
         this.A = false;
         Registry.emptyArgs();
         long var5 = 270389152141252877L;
         Object var10002 = Ref.h2(270389152141252877L, var5);
         Kx4_2 var10003 = (Kx4_2)(Registry.emptyArgs());
         long var8 = 399585344452154517L;
         var7 = var10003;
         var10003 = Ref.h(399585344452154517L, var7, var8);

         try {
            var10003 = (Kx4_2)var10003;
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }

         ((SetBackgroundImagePanel)var10002).O = var10003;
         this.cS = false;
         this.U = 0;
         this.I = -1;
         this.y = 1.0F;
         this.ca = true;
         this.t = var1;
         this.V = var2;
         this.cY = var3;
         this.N = new OT(var2.B$int(), var2.O());
         this.cK = this.t.n();
         this.v = this.U$a6();
         this.l(true);
         this.enableEvents(b(14408, 3559354844437830389L));
         this.enableInputMethods(true);
         var2.P(this::repaint);
         var2.Y(this::repaint);
         this.m = new Lt4(this, this);
         var10003 = Registry.packArgs(true);
         var10 = 117930650841340028L;
         var9 = var10003;
         Ref.h(117930650841340028L, var9, var10);

         try {
            ;
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         if (Ky4.F$arrString() != null) {
            ConnectionProperty.W(++var4);
         }
      } catch (IllegalStateException var13) {
         throw a(var13);
      }
   }

   public void k$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: new java/util/ArrayList
      // 06: dup
      // 07: invokespecial java/util/ArrayList.<init> ()V
      // 0a: astore 2
      // 0b: istore 1
      // 0c: aload 0
      // 0d: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cT Ljava/util/List;
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
      // 2f: ldc_w com/finalshell/ui/listener/I
      // 32: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 35: iload 1
      // 36: ifeq 6a
      // 39: iload 1
      // 3a: ifeq 5b
      // 3d: goto 44
      // 40: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: ifeq 5c
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: aload 2
      // 4f: aload 4
      // 51: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 54: goto 5b
      // 57: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: pop
      // 5c: iload 1
      // 5d: ifne 16
      // 60: aload 0
      // 61: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cT Ljava/util/List;
      // 64: aload 2
      // 65: invokeinterface java/util/List.removeAll (Ljava/util/Collection;)Z 2
      // 6a: pop
      // 6b: aload 0
      // 6c: new com/finalshell/ui/listener/I
      // 6f: dup
      // 70: aload 0
      // 71: invokespecial com/finalshell/ui/listener/I.<init> (Lcom/finalshell/ui/panel/SetBackgroundImagePanel;)V
      // 74: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.addKeyListener (Ljava/awt/event/KeyListener;)V
      // 77: return
   }

   public OT v$OT() {
      return this.N;
   }

   public boolean V$boolean() {
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
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 1
      // 06: iload 2
      // 07: ifeq 21
      // 0a: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.g Z
      // 0d: iload 1
      // 0e: ifne 24
      // 11: goto 18
      // 14: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 0
      // 19: bipush 0
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.o Z
      // 24: return
   }

   public boolean g$boolean() {
      return this.o;
   }

   public void b$void(boolean var1) {
      if (var1) {
      }

      this.o = var1;
      if (!var1) {
      }
   }

   public Y3 Z$Y3() {
      return this.q;
   }

   public void F(Y3 var1) {
      this.q = var1;
   }

   public KeyEvent c$KeyEvent() {
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

   public void C$void() {
      this.cr = null;
      this.E = 0L;
      this.g = false;
      this.o = false;
      this.cq = false;
   }

   public void l$void() {
      this.G();
   }

   public void D() {
      this.b();
      this.Q();
      this.setPreferredSize(new Dimension(this.g$int(), this.J$int()));
      this.setFocusable(true);
      this.enableInputMethods(true);
      this.setDoubleBuffered(true);
      this.setFocusTraversalKeysEnabled(false);
      this.addMouseMotionListener(new Hb2(this));
      this.addMouseWheelListener(new B9(this));
      this.addMouseListener(new YU3(this));
      this.addComponentListener(new Sc2(this));
      this.addFocusListener(new CV(this));
      this.p = new Wg2(this);
      this.i.addChangeListener(this.p);
      this.J$void();
   }

   public void z(int var1, int var2) {
      JPopupMenu var3 = this.C$JPopupMenu();
      var3.show(this, var1, var2);
   }

   public JPopupMenu C$JPopupMenu() {
      long var7;
      long var9;
      JPopupMenu var1 = new JPopupMenu();
      Object[] var10001 = Registry.packArgs(Registry.lookupField(518223218338208363L).getInt(null), new Oo2(this, a(8954, -25906)));
      long var3 = 458639668206483981L;
      JPopupMenu var10002 = (JPopupMenu)Ref.h2(458639668206483981L, var3);

      try {
         var10002 = (JMenuItem)var10002;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      var10001.add((JMenuItem)var10002);
      var10002 = Registry.packArgs(Registry.lookupField(263914437926532128L).getInt(null), new Yk2(this, a(8947, -25754)));
      long var5 = 458639668206483981L;
      JPopupMenu var10003 = (JPopupMenu)Ref.h2(458639668206483981L, var5);

      try {
         var10003 = (JMenuItem)var10003;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      var10002.add((JMenuItem)var10003);
      var10003 = Registry.packArgs(0, new Oq4(this, a(8958, 28867)));
      var7 = 458639668206483981L;
      JPopupMenu var10004 = (JPopupMenu)Ref.h2(458639668206483981L, var7);

      try {
         var10004 = (JMenuItem)var10004;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      var10003.add((JMenuItem)var10004);
      var1.addSeparator();
      var10004 = Registry.packArgs(Registry.lookupField(460316126853161418L).getInt(null), new Q9(this, a(8944, -26558)));
      var9 = 458639668206483981L;
      JPopupMenu var10005 = (JPopupMenu)Ref.h2(458639668206483981L, var9);

      try {
         var10005 = (JMenuItem)var10005;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      var10004.add((JMenuItem)var10005);
      var1.addSeparator();
      var10005 = Registry.packArgs(Registry.lookupField(519772657709926580L).getInt(null), new GD(this, a(8957, 24712)));
      long var11 = 458639668206483981L;
      Object var10006 = Ref.h2(458639668206483981L, var11);

      try {
         var10006 = (JMenuItem)var10006;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      var10005.add((JMenuItem)var10006);
      var1.addSeparator();
      JMenuItem var2 = new JMenuItem(a(8949, 5939));
      var2.setForeground(new Color(a(5895, 7533047664870002152L), 0, a(17063, 1733742218729281603L)));
      var1.add(var2);
      var2.addActionListener(new Lt2(this));
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
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: aload 0
      // 04: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.L Lcom/finalshell/ui/panel/ConnectionProperty;
      // 07: invokevirtual com/finalshell/ui/panel/ConnectionProperty.Q ()V
      // 0a: istore 1
      // 0b: aload 0
      // 0c: iload 1
      // 0d: ifne 25
      // 10: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.u Lcom/finalshell/core/RU3;
      // 13: ifnull 3c
      // 16: goto 1d
      // 19: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: aload 0
      // 1e: goto 25
      // 21: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.J$String ()Ljava/lang/String;
      // 28: astore 2
      // 29: aload 2
      // 2a: ifnull 3c
      // 2d: aload 0
      // 2e: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.L Lcom/finalshell/ui/panel/ConnectionProperty;
      // 31: aload 2
      // 32: invokevirtual com/finalshell/ui/panel/ConnectionProperty.l (Ljava/lang/String;)V
      // 35: goto 3c
      // 38: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: return
   }

   public void r() {
      this.requestFocus();
      this.r(this.C$String());
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
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: aload 0
      // 04: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.requestFocus ()V
      // 07: istore 1
      // 08: aload 0
      // 09: bipush 0
      // 0a: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.A (Z)Z
      // 0d: pop
      // 0e: aload 0
      // 0f: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.J$String ()Ljava/lang/String;
      // 12: astore 2
      // 13: aload 2
      // 14: iload 1
      // 15: ifne 3d
      // 18: ifnull 32
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 0
      // 23: aload 2
      // 24: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.r (Ljava/lang/String;)V
      // 27: iload 1
      // 28: ifeq 43
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: aload 0
      // 33: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.C$String ()Ljava/lang/String;
      // 36: goto 3d
      // 39: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: astore 2
      // 3e: aload 0
      // 3f: aload 2
      // 40: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.r (Ljava/lang/String;)V
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
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: aload 0
      // 04: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.requestFocus ()V
      // 07: istore 2
      // 08: aload 0
      // 09: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.u Lcom/finalshell/core/RU3;
      // 0c: iload 2
      // 0d: ifeq 25
      // 10: ifnull 62
      // 13: goto 1a
      // 16: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.u Lcom/finalshell/core/RU3;
      // 1e: goto 25
      // 21: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 0
      // 26: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.N Lcom/finalshell/core/OT;
      // 29: invokevirtual com/finalshell/core/OT.R ()I
      // 2c: invokevirtual com/finalshell/core/RU3.K (I)Lcom/finalshell/core/KB;
      // 2f: astore 3
      // 30: aload 0
      // 31: aload 3
      // 32: getfield com/finalshell/core/KB.X Ljava/lang/Object;
      // 35: checkcast com/finalshell/core/XE
      // 38: aload 3
      // 39: getfield com/finalshell/core/KB.S Ljava/lang/Object;
      // 3c: checkcast com/finalshell/core/XE
      // 3f: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.r (Lcom/finalshell/core/XE;Lcom/finalshell/core/XE;)V
      // 42: iload 1
      // 43: iload 2
      // 44: ifeq 61
      // 47: ifeq 60
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: aload 0
      // 52: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.V$void ()V
      // 55: aload 0
      // 56: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.repaint ()V
      // 59: goto 60
      // 5c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f: athrow
      // 60: bipush 1
      // 61: ireturn
      // 62: bipush 0
      // 63: ireturn
   }

   public void e$void() {
      SwingUtilities.invokeLater(new Lg2_2(this));
   }

   public void V$void() {
      this.u = null;
      this.N$void();
   }

   public void N$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifne 166
      // 009: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.isShowing ()Z
      // 00c: ifeq 15e
      // 00f: goto 016
      // 012: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: aload 0
      // 017: iload 1
      // 018: ifne 166
      // 01b: goto 022
      // 01e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 021: athrow
      // 022: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.u Lcom/finalshell/core/RU3;
      // 025: ifnull 15e
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 0
      // 030: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.u Lcom/finalshell/core/RU3;
      // 033: invokevirtual com/finalshell/core/RU3.e ()Lcom/finalshell/core/XE;
      // 036: getfield com/finalshell/core/XE.r I
      // 039: aload 0
      // 03a: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.i Ljavax/swing/BoundedRangeModel;
      // 03d: invokeinterface javax/swing/BoundedRangeModel.getValue ()I 1
      // 042: isub
      // 043: bipush 1
      // 044: iadd
      // 045: istore 2
      // 046: new com/finalshell/core/XE
      // 049: dup
      // 04a: aload 0
      // 04b: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.u Lcom/finalshell/core/RU3;
      // 04e: invokevirtual com/finalshell/core/RU3.e ()Lcom/finalshell/core/XE;
      // 051: getfield com/finalshell/core/XE.q I
      // 054: aload 0
      // 055: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c4 Ljava/awt/Dimension;
      // 058: getfield java/awt/Dimension.width I
      // 05b: imul
      // 05c: iload 2
      // 05d: aload 0
      // 05e: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c4 Ljava/awt/Dimension;
      // 061: getfield java/awt/Dimension.height I
      // 064: imul
      // 065: invokespecial com/finalshell/core/XE.<init> (II)V
      // 068: astore 3
      // 069: new com/finalshell/core/XE
      // 06c: dup
      // 06d: aload 0
      // 06e: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.K Lcom/finalshell/core/XE;
      // 071: getfield com/finalshell/core/XE.q I
      // 074: sipush 18426
      // 077: ldc2_w 2303050399558163741
      // 07a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 07d: iadd
      // 07e: aload 3
      // 07f: getfield com/finalshell/core/XE.r I
      // 082: sipush 12242
      // 085: ldc2_w 1489795501300364599
      // 088: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 08b: iadd
      // 08c: invokespecial com/finalshell/core/XE.<init> (II)V
      // 08f: astore 4
      // 091: new java/awt/Rectangle
      // 094: dup
      // 095: invokespecial java/awt/Rectangle.<init> ()V
      // 098: astore 5
      // 09a: aload 5
      // 09c: aload 4
      // 09e: getfield com/finalshell/core/XE.q I
      // 0a1: putfield java/awt/Rectangle.x I
      // 0a4: aload 5
      // 0a6: aload 4
      // 0a8: getfield com/finalshell/core/XE.r I
      // 0ab: putfield java/awt/Rectangle.y I
      // 0ae: aload 5
      // 0b0: aload 0
      // 0b1: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.q Lcom/finalshell/ui/panel/Y3;
      // 0b4: invokevirtual com/finalshell/ui/panel/Y3.getPreferredSize ()Ljava/awt/Dimension;
      // 0b7: getfield java/awt/Dimension.width I
      // 0ba: putfield java/awt/Rectangle.width I
      // 0bd: aload 5
      // 0bf: aload 0
      // 0c0: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.q Lcom/finalshell/ui/panel/Y3;
      // 0c3: invokevirtual com/finalshell/ui/panel/Y3.getPreferredSize ()Ljava/awt/Dimension;
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
      // 0e9: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ec: athrow
      // 0ed: aload 5
      // 0ef: aload 6
      // 0f1: invokevirtual java/awt/Container.getWidth ()I
      // 0f4: aload 5
      // 0f6: getfield java/awt/Rectangle.width I
      // 0f9: isub
      // 0fa: putfield java/awt/Rectangle.x I
      // 0fd: goto 104
      // 100: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 103: athrow
      // 104: iload 2
      // 105: aload 0
      // 106: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.N Lcom/finalshell/core/OT;
      // 109: invokevirtual com/finalshell/core/OT.c ()I
      // 10c: if_icmpne 134
      // 10f: aload 5
      // 111: dup
      // 112: getfield java/awt/Rectangle.y I
      // 115: aload 0
      // 116: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c4 Ljava/awt/Dimension;
      // 119: getfield java/awt/Dimension.height I
      // 11c: aload 0
      // 11d: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.q Lcom/finalshell/ui/panel/Y3;
      // 120: invokevirtual com/finalshell/ui/panel/Y3.getPreferredSize ()Ljava/awt/Dimension;
      // 123: getfield java/awt/Dimension.height I
      // 126: iadd
      // 127: bipush 3
      // 128: iadd
      // 129: isub
      // 12a: putfield java/awt/Rectangle.y I
      // 12d: goto 134
      // 130: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 133: athrow
      // 134: aload 0
      // 135: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.q Lcom/finalshell/ui/panel/Y3;
      // 138: aload 5
      // 13a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 13d: ldc2_w 603812236548708747
      // 140: astore 8
      // 142: astore 7
      // 144: ldc2_w 603812236548708747
      // 147: aload 7
      // 149: aload 8
      // 14b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 14e: pop
      // 14f: goto 156
      // 152: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 155: athrow
      // 156: aload 0
      // 157: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.W$void ()V
      // 15a: iload 1
      // 15b: ifeq 169
      // 15e: aload 0
      // 15f: goto 166
      // 162: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 165: athrow
      // 166: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.x ()V
      // 169: return
   }

   public void x() {
      this.q.setVisible(false);
      this.cj = false;
   }

   public void W$void() {
      this.q.setVisible(true);
   }

   public void Q() {
      this.G = Toolkit.getDefaultToolkit().getSystemClipboard();
   }

   public String J$String() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: aconst_null
      // 04: astore 2
      // 05: istore 1
      // 06: aload 0
      // 07: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.u Lcom/finalshell/core/RU3;
      // 0a: iload 1
      // 0b: ifeq 23
      // 0e: ifnull 76
      // 11: goto 18
      // 14: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 0
      // 19: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.u Lcom/finalshell/core/RU3;
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: aload 0
      // 24: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.N Lcom/finalshell/core/OT;
      // 27: invokevirtual com/finalshell/core/OT.R ()I
      // 2a: invokevirtual com/finalshell/core/RU3.K (I)Lcom/finalshell/core/KB;
      // 2d: astore 3
      // 2e: aload 3
      // 2f: getfield com/finalshell/core/KB.X Ljava/lang/Object;
      // 32: iload 1
      // 33: ifeq 4b
      // 36: ifnull 76
      // 39: goto 40
      // 3c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 3
      // 41: getfield com/finalshell/core/KB.S Ljava/lang/Object;
      // 44: goto 4b
      // 47: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: iload 1
      // 4c: ifeq 64
      // 4f: ifnull 76
      // 52: goto 59
      // 55: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58: athrow
      // 59: aload 3
      // 5a: getfield com/finalshell/core/KB.X Ljava/lang/Object;
      // 5d: goto 64
      // 60: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 63: athrow
      // 64: checkcast com/finalshell/core/XE
      // 67: aload 3
      // 68: getfield com/finalshell/core/KB.S Ljava/lang/Object;
      // 6b: checkcast com/finalshell/core/XE
      // 6e: aload 0
      // 6f: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 72: invokestatic com/finalshell/core/A7.v (Lcom/finalshell/core/XE;Lcom/finalshell/core/XE;Lcom/finalshell/core/Im4;)Ljava/lang/String;
      // 75: astore 2
      // 76: aload 2
      // 77: areturn
   }

   public void r(XE var1, XE var2) {
      int var3 = ConnectionProperty.y();

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

      String var4 = A7.v(var10000, var2, this.V);

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

   public void C(StringSelection param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: invokestatic java/awt/Toolkit.getDefaultToolkit ()Ljava/awt/Toolkit;
      // 06: invokevirtual java/awt/Toolkit.getSystemClipboard ()Ljava/awt/datatransfer/Clipboard;
      // 09: astore 3
      // 0a: istore 2
      // 0b: aload 3
      // 0c: iload 2
      // 0d: ifeq 2d
      // 10: ifnull 27
      // 13: goto 1a
      // 16: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: aload 3
      // 1b: aload 1
      // 1c: aload 0
      // 1d: invokevirtual java/awt/datatransfer/Clipboard.setContents (Ljava/awt/datatransfer/Transferable;Ljava/awt/datatransfer/ClipboardOwner;)V
      // 20: goto 27
      // 23: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: invokestatic java/awt/Toolkit.getDefaultToolkit ()Ljava/awt/Toolkit;
      // 2a: invokevirtual java/awt/Toolkit.getSystemSelection ()Ljava/awt/datatransfer/Clipboard;
      // 2d: astore 4
      // 2f: aload 4
      // 31: iload 2
      // 32: ifeq 41
      // 35: ifnull 46
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: aload 4
      // 41: aload 1
      // 42: aload 0
      // 43: invokevirtual java/awt/datatransfer/Clipboard.setContents (Ljava/awt/datatransfer/Transferable;Ljava/awt/datatransfer/ClipboardOwner;)V
      // 46: return
   }

   public void K() {
      KeyEvent var1 = new KeyEvent(
         this, a(22342, 1641791032517774729L), System.currentTimeMillis(), 0, a(3818, 4017640413363442733L), (char)a(3818, 4017640413363442733L)
      );
      this.dispatchEvent(var1);
   }

   public void r(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: aload 1
      // 04: astore 3
      // 05: istore 2
      // 06: iload 2
      // 07: ifne 22
      // 0a: aload 3
      // 0b: ifnonnull 1a
      // 0e: goto 15
      // 11: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: return
      // 16: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cc Lcom/finalshell/core/E0;
      // 1e: aload 3
      // 1f: invokevirtual com/finalshell/core/E0.D (Ljava/lang/String;)V
      // 22: goto 27
      // 25: astore 4
      // 27: return
   }

   public void x(String var1, boolean var2) {
      this.v(var1, var2, true);
   }

   public void v(String var1, boolean var2, boolean var3) {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new WZ3(this, var1, var3, var2));
      long var5 = 434592463220957006L;
      Object[] var4 = var10001;
      Ref.h(434592463220957006L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public String A$String() throws IOException, UnsupportedFlavorException {
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
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cT Ljava/util/List;
      // 08: iload 2
      // 09: ifeq 21
      // 0c: ifnull 28
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cT Ljava/util/List;
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 1
      // 22: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 27: pop
      // 28: return
   }

   public void b() {
      int var10000 = ConnectionProperty.y();
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
         this.m$void();
         this.A$void();
         break;
      }
   }

   public void m$void() {
      long var10;
      Registry.packArgs(1, 1);
      var10 = 225394079158613941L;
      Object var10001 = Ref.h2(225394079158613941L, var10);

      try {
         var10001 = (BufferedImage)var10001;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }

      BufferedImage var1 = (BufferedImage)var10001;
      Graphics2D var2 = var1.createGraphics();
      Registry.emptyArgs();
      long var12 = 270389152141252877L;
      Ref.h2(270389152141252877L, var12);
      Nl2_2 var10003 = (Nl2_2)(Registry.emptyArgs());
      long var15 = 121346227073341697L;
      Object var14 = var10003;
      var10003 = Ref.h(121346227073341697L, var14, var15);

      try {
         var10003 = (Nl2_2)var10003;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      Nl2_2 var3 = var10003;
      K3 var10005 = (K3)(Registry.emptyArgs());
      long var17 = 446211275215857466L;
      Object var16 = var10005;
      var10005 = Ref.h(446211275215857466L, var16, var17);

      try {
         var10005 = (K3)var10005;
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      var3.d = var10005;
      var10005 = Registry.emptyArgs();
      long var19 = 570146297653439641L;
      Object var18 = var10005;
      Ref.h(570146297653439641L, var18, var19);
      Font var10006 = (Font)(Registry.emptyArgs());
      long var21 = 419129657143452339L;
      Object var20 = var10006;
      var10006 = Ref.h(419129657143452339L, var20, var21);

      try {
         var10006 = (Font)var10006;
      } catch (InvocationTargetException var27) {
         throw var27.getTargetException();
      }

      Font var4 = var10006;
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
      Object[] var10007 = Registry.emptyArgs();
      long var23 = 381284008132314530L;
      Object[] var22 = var10007;
      Ref.h(381284008132314530L, var22, var23);
      Font var10008 = (Font)(Registry.emptyArgs());
      long var25 = 419129657143452339L;
      Object var24 = var10008;
      var10008 = Ref.h(419129657143452339L, var24, var25);

      try {
         var10008 = (Font)var10008;
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }

      Font var8 = var10008;
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

   public void k(@NotNull Wq2_2 var1) {
      this.W = var1;
   }

   @NotNull
   public A6_2 U$a6() {
      return new KI();
   }

   public Xn4 q$xn_4() {
      return this.c;
   }

   @Override
   public void repaint() {
      this.Q.set(true);
   }

   public void h() {
      super.repaint();
   }

   public void d$void() {
      this.L$void();
      this.A$void();
   }

   public void L$void() {
      this.c_ = this.s();
      this.cL = this.c_.deriveFont(1);
      this.ck = this.c_.deriveFont(2);
      this.Z = this.c_.deriveFont(3);
      this.m$void();
   }

   public void A(@NotNull JScrollBar var1) {
      this.b();
      this.Q();
      this.L$void();
      this.setPreferredSize(new Dimension(this.g$int(), this.J$int()));
      this.setFocusable(true);
      this.enableInputMethods(true);
      this.setDoubleBuffered(true);
      this.setFocusTraversalKeysEnabled(false);
      this.addMouseMotionListener(new XH(this));
      this.addMouseWheelListener(this::lambda$init$0);
      this.addMouseListener(new Wu2(this));
      this.addComponentListener(new Dz4(this));
      this.addHierarchyListener(new ET3(this));
      this.cz = this.t.w();
      this.addFocusListener(new FK(this));
      this.i.addChangeListener(this::lambda$init$1);
      this.J$void();
   }

   public boolean B(@NotNull MouseEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.Y I
      // 08: sipush 13238
      // 0b: ldc2_w 1922841304603175238
      // 0e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 11: iload 2
      // 12: ifne 36
      // 15: if_icmpne 3d
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 1
      // 20: invokevirtual java/awt/event/MouseEvent.getButton ()I
      // 23: iload 2
      // 24: ifne 3a
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: bipush 1
      // 2f: goto 36
      // 32: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: if_icmpne 3d
      // 39: bipush 1
      // 3a: goto 3e
      // 3d: bipush 0
      // 3e: ireturn
   }

   public void i(@NotNull MouseWheelEvent param1, @NotNull JScrollBar param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: istore 3
      // 04: aload 1
      // 05: invokevirtual java/awt/event/MouseWheelEvent.isShiftDown ()Z
      // 08: iload 3
      // 09: ifne 21
      // 0c: ifne 4f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual java/awt/event/MouseWheelEvent.getUnitsToScroll ()I
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: iload 3
      // 22: ifne 4c
      // 25: ifeq 4f
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 1
      // 30: iload 3
      // 31: ifne 59
      // 34: goto 3b
      // 37: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: invokevirtual java/awt/event/MouseWheelEvent.getPreciseWheelRotation ()D
      // 3e: invokestatic java/lang/Math.abs (D)D
      // 41: ldc2_w 0.01
      // 44: dcmpg
      // 45: goto 4c
      // 48: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: ifge 50
      // 4f: return
      // 50: aload 0
      // 51: aload 1
      // 52: invokevirtual java/awt/event/MouseWheelEvent.getUnitsToScroll ()I
      // 55: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.b (I)V
      // 58: aload 1
      // 59: invokevirtual java/awt/event/MouseWheelEvent.consume ()V
      // 5c: return
   }

   public void u(@NotNull Point param1, boolean param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 003: aload 0
      // 004: aload 1
      // 005: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.t (Ljava/awt/Point;)Lcom/finalshell/core/Le2;
      // 008: astore 4
      // 00a: aload 0
      // 00b: aload 4
      // 00d: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.S (Lcom/finalshell/core/Le2;)Lcom/finalshell/core/Yw2;
      // 010: astore 5
      // 012: istore 3
      // 013: aload 5
      // 015: iload 3
      // 016: ifeq 025
      // 019: ifnull 02b
      // 01c: goto 023
      // 01f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: aload 5
      // 025: invokevirtual com/finalshell/core/Yw2.g ()Lcom/finalshell/core/YA3;
      // 028: goto 02c
      // 02b: aconst_null
      // 02c: astore 6
      // 02e: aload 6
      // 030: invokestatic com/finalshell/core/YO3.e (Lcom/finalshell/core/YA3;)Lcom/finalshell/core/OX3;
      // 033: astore 7
      // 035: iload 3
      // 036: ifeq 095
      // 039: aload 7
      // 03b: aload 0
      // 03c: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.B Lcom/finalshell/core/OX3;
      // 03f: if_acmpeq 08f
      // 042: goto 049
      // 045: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 048: athrow
      // 049: aload 0
      // 04a: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.B Lcom/finalshell/core/OX3;
      // 04d: iload 3
      // 04e: ifeq 074
      // 051: goto 058
      // 054: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: ifnull 072
      // 05b: goto 062
      // 05e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: aload 0
      // 063: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.B Lcom/finalshell/core/OX3;
      // 066: invokeinterface com/finalshell/core/OX3.a ()V 1
      // 06b: goto 072
      // 06e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071: athrow
      // 072: aload 7
      // 074: ifnull 08f
      // 077: aload 0
      // 078: aload 4
      // 07a: aload 5
      // 07c: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.j (Lcom/finalshell/core/Le2;Lcom/finalshell/core/Yw2;)Lcom/finalshell/core/Ws2;
      // 07f: astore 8
      // 081: aload 7
      // 083: aload 0
      // 084: aload 0
      // 085: aload 8
      // 087: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.C (Lcom/finalshell/core/Ws2;)Ljava/awt/Rectangle;
      // 08a: invokeinterface com/finalshell/core/OX3.a (Ljavax/swing/JComponent;Ljava/awt/Rectangle;)V 3
      // 08f: aload 0
      // 090: aload 7
      // 092: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.B Lcom/finalshell/core/OX3;
      // 095: iload 3
      // 096: ifeq 10a
      // 099: aload 5
      // 09b: ifnull 105
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: aload 5
      // 0a7: invokevirtual com/finalshell/core/Yw2.i ()Lcom/finalshell/ui/model/KO;
      // 0aa: getstatic com/finalshell/ui/model/KO.ALWAYS Lcom/finalshell/ui/model/KO;
      // 0ad: iload 3
      // 0ae: ifeq 0d1
      // 0b1: goto 0b8
      // 0b4: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b7: athrow
      // 0b8: if_acmpeq 0ea
      // 0bb: goto 0c2
      // 0be: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c1: athrow
      // 0c2: aload 5
      // 0c4: invokevirtual com/finalshell/core/Yw2.i ()Lcom/finalshell/ui/model/KO;
      // 0c7: getstatic com/finalshell/ui/model/KO.HOVER Lcom/finalshell/ui/model/KO;
      // 0ca: goto 0d1
      // 0cd: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d0: athrow
      // 0d1: if_acmpne 105
      // 0d4: iload 2
      // 0d5: iload 3
      // 0d6: ifeq 119
      // 0d9: goto 0e0
      // 0dc: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df: athrow
      // 0e0: ifeq 105
      // 0e3: goto 0ea
      // 0e6: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9: athrow
      // 0ea: aload 0
      // 0eb: sipush 19833
      // 0ee: ldc2_w 335476109381261230
      // 0f1: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 0f4: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.x (I)V
      // 0f7: aload 0
      // 0f8: aload 5
      // 0fa: invokevirtual com/finalshell/core/Yw2.g ()Lcom/finalshell/core/YA3;
      // 0fd: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.cV Lcom/finalshell/core/YA3;
      // 100: return
      // 101: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 104: athrow
      // 105: aload 0
      // 106: aconst_null
      // 107: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.cV Lcom/finalshell/core/YA3;
      // 10a: aload 0
      // 10b: iload 3
      // 10c: ifeq 129
      // 10f: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.Y I
      // 112: goto 119
      // 115: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 118: athrow
      // 119: ifeq 12c
      // 11c: aload 0
      // 11d: bipush 0
      // 11e: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.x (I)V
      // 121: aload 0
      // 122: goto 129
      // 125: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 128: athrow
      // 129: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.repaint ()V
      // 12c: return
   }

   @NotNull
   public com.finalshell.core.Ws2 j(@NotNull Le2 var1, @NotNull Yw2 var2) {
      int var10000 = ConnectionProperty.y();
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

      while (var5 < this.V.B$int() - 1) {
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

      return new com.finalshell.core.Ws2(var1.G(), var4, var5);
   }

   public void J(Component var1, boolean var2) {
      PointerInfo var7;
      int var10000 = ConnectionProperty.M$int();
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
   public Yw2 s(@NotNull Point var1) {
      return this.S(this.t(var1));
   }

   @Nullable
   public Yw2 S(@Nullable Le2 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 14
      // 09: ifnull a9
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 1
      // 14: invokevirtual com/finalshell/core/Le2.N ()I
      // 17: iload 2
      // 18: ifne 30
      // 1b: iflt a9
      // 1e: goto 25
      // 21: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 1
      // 26: invokevirtual com/finalshell/core/Le2.N ()I
      // 29: goto 30
      // 2c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: aload 0
      // 31: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 34: invokevirtual com/finalshell/core/Im4.B$int ()I
      // 37: iload 2
      // 38: ifne 58
      // 3b: if_icmpge a9
      // 3e: goto 45
      // 41: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: aload 1
      // 46: invokevirtual com/finalshell/core/Le2.G ()I
      // 49: aload 0
      // 4a: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 4d: invokevirtual com/finalshell/core/Im4.H ()I
      // 50: ineg
      // 51: goto 58
      // 54: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: iload 2
      // 59: ifne 78
      // 5c: if_icmplt a9
      // 5f: goto 66
      // 62: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: aload 1
      // 67: invokevirtual com/finalshell/core/Le2.G ()I
      // 6a: aload 0
      // 6b: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 6e: invokevirtual com/finalshell/core/Im4.O ()I
      // 71: goto 78
      // 74: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 77: athrow
      // 78: if_icmpgt a9
      // 7b: aload 0
      // 7c: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 7f: aload 1
      // 80: invokevirtual com/finalshell/core/Le2.N ()I
      // 83: aload 1
      // 84: invokevirtual com/finalshell/core/Le2.G ()I
      // 87: invokevirtual com/finalshell/core/Im4.l (II)Lcom/finalshell/core/YP;
      // 8a: astore 3
      // 8b: aload 3
      // 8c: iload 2
      // 8d: ifne a5
      // 90: instanceof com/finalshell/core/Yw2
      // 93: ifeq a9
      // 96: goto 9d
      // 99: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9c: athrow
      // 9d: aload 3
      // 9e: goto a5
      // a1: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a4: athrow
      // a5: checkcast com/finalshell/core/Yw2
      // a8: areturn
      // a9: aconst_null
      // aa: areturn
   }

   public void x(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: istore 2
      // 04: iload 2
      // 05: ifne 23
      // 08: iload 1
      // 09: aload 0
      // 0a: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.Y I
      // 0d: if_icmpeq 32
      // 10: goto 17
      // 13: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 0
      // 18: iload 1
      // 19: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.Y I
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: aload 0
      // 24: new java/awt/Cursor
      // 27: dup
      // 28: aload 0
      // 29: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.Y I
      // 2c: invokespecial java/awt/Cursor.<init> (I)V
      // 2f: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.setCursor (Ljava/awt/Cursor;)V
      // 32: return
   }

   public void J$void() {
      Object var10001 = Registry.lookupField(388376917454860932L).get(null);
      GH_2 var10002 = (GH_2)(Registry.packArgs(new Bl2(this), a(10759, 3200006095109402836L) / this.cK));
      long var2 = 201859364639460244L;
      Object var1 = var10002;
      var10002 = Ref.h(201859364639460244L, var1, var2);

      try {
         var10002 = (GH_2)var10002;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      ((SetBackgroundImagePanel)var10001).b = var10002;
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
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.t Lcom/finalshell/core/Rx4;
      // 08: invokeinterface com/finalshell/core/Rx4.Z ()Z 1
      // 0d: iload 2
      // 0e: ifeq 40
      // 11: ifne 38
      // 14: goto 1b
      // 17: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 0
      // 1c: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.X$boolean ()Z
      // 1f: iload 2
      // 20: ifeq 40
      // 23: goto 2a
      // 26: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 1
      // 2b: invokevirtual java/awt/event/MouseEvent.isShiftDown ()Z
      // 2e: if_icmpne 43
      // 31: goto 38
      // 34: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: bipush 1
      // 39: goto 40
      // 3c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: istore 2
      // 04: aload 0
      // 05: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.X$boolean ()Z
      // 08: iload 2
      // 09: ifeq 21
      // 0c: ifeq 33
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual java/awt/event/MouseEvent.isShiftDown ()Z
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: iload 2
      // 22: ifeq 30
      // 25: ifne 33
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   public boolean W$boolean() {
      return QP_2.D();
   }

   public void V(int var1) {
      this.c5 = var1;
   }

   public void t(Ab2 var1) {
      this.cE = var1;
   }

   public void z(WZ var1) {
      this.l = var1;
      this.repaint();
   }

   public WZ f$WZ() {
      return this.l;
   }

   @Nullable
   public WZ I$WZ() {
      return this.b$WZ(false);
   }

   @Nullable
   public WZ e$WZ() {
      return this.b$WZ(true);
   }

   @Nullable
   public WZ b$WZ(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.l Lcom/finalshell/core/WZ;
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifnull f9
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.l Lcom/finalshell/core/WZ;
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: invokevirtual com/finalshell/core/WZ.B ()Ljava/util/List;
      // 24: invokeinterface java/util/List.isEmpty ()Z 1
      // 29: iload 2
      // 2a: ifne 38
      // 2d: ifne f9
      // 30: goto 37
      // 33: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: iload 1
      // 38: ifeq 49
      // 3b: aload 0
      // 3c: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.l Lcom/finalshell/core/WZ;
      // 3f: invokevirtual com/finalshell/core/WZ.T ()Lcom/finalshell/core/PE3;
      // 42: goto 50
      // 45: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48: athrow
      // 49: aload 0
      // 4a: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.l Lcom/finalshell/core/WZ;
      // 4d: invokevirtual com/finalshell/core/WZ.U ()Lcom/finalshell/core/PE3;
      // 50: astore 3
      // 51: aload 0
      // 52: new com/finalshell/core/RU3
      // 55: dup
      // 56: new com/finalshell/core/XE
      // 59: dup
      // 5a: aload 3
      // 5b: invokevirtual com/finalshell/core/PE3.s ()Lcom/finalshell/core/XE;
      // 5e: getfield com/finalshell/core/XE.q I
      // 61: aload 3
      // 62: invokevirtual com/finalshell/core/PE3.s ()Lcom/finalshell/core/XE;
      // 65: getfield com/finalshell/core/XE.r I
      // 68: aload 0
      // 69: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 6c: invokevirtual com/finalshell/core/Im4.H ()I
      // 6f: isub
      // 70: invokespecial com/finalshell/core/XE.<init> (II)V
      // 73: new com/finalshell/core/XE
      // 76: dup
      // 77: aload 3
      // 78: invokevirtual com/finalshell/core/PE3.E ()Lcom/finalshell/core/XE;
      // 7b: getfield com/finalshell/core/XE.q I
      // 7e: aload 3
      // 7f: invokevirtual com/finalshell/core/PE3.E ()Lcom/finalshell/core/XE;
      // 82: getfield com/finalshell/core/XE.r I
      // 85: aload 0
      // 86: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 89: invokevirtual com/finalshell/core/Im4.H ()I
      // 8c: isub
      // 8d: invokespecial com/finalshell/core/XE.<init> (II)V
      // 90: invokespecial com/finalshell/core/RU3.<init> (Lcom/finalshell/core/XE;Lcom/finalshell/core/XE;)V
      // 93: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.e Lcom/finalshell/core/RU3;
      // 96: aload 0
      // 97: iload 2
      // 98: ifne e7
      // 9b: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.e Lcom/finalshell/core/RU3;
      // 9e: invokevirtual com/finalshell/core/RU3.N ()Lcom/finalshell/core/XE;
      // a1: getfield com/finalshell/core/XE.r I
      // a4: aload 0
      // a5: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.H$im_4 ()Lcom/finalshell/core/Im4;
      // a8: invokevirtual com/finalshell/core/Im4.O ()I
      // ab: bipush 2
      // ac: idiv
      // ad: if_icmpge df
      // b0: goto b7
      // b3: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b6: athrow
      // b7: aload 0
      // b8: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.i Ljavax/swing/BoundedRangeModel;
      // bb: aload 0
      // bc: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.e Lcom/finalshell/core/RU3;
      // bf: invokevirtual com/finalshell/core/RU3.N ()Lcom/finalshell/core/XE;
      // c2: getfield com/finalshell/core/XE.r I
      // c5: aload 0
      // c6: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.H$im_4 ()Lcom/finalshell/core/Im4;
      // c9: invokevirtual com/finalshell/core/Im4.O ()I
      // cc: bipush 2
      // cd: idiv
      // ce: isub
      // cf: invokeinterface javax/swing/BoundedRangeModel.setValue (I)V 2
      // d4: iload 2
      // d5: ifeq f0
      // d8: goto df
      // db: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // de: athrow
      // df: aload 0
      // e0: goto e7
      // e3: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e6: athrow
      // e7: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.i Ljavax/swing/BoundedRangeModel;
      // ea: bipush 0
      // eb: invokeinterface javax/swing/BoundedRangeModel.setValue (I)V 2
      // f0: aload 0
      // f1: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.repaint ()V
      // f4: aload 0
      // f5: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.l Lcom/finalshell/core/WZ;
      // f8: areturn
      // f9: aconst_null
      // fa: areturn
   }

   @Override
   public void W(YT var1) {
      this.x = var1;
   }

   public boolean X$boolean() {
      try {
         if (this.x != YT.MOUSE_REPORTING_NONE) {
            return true;
         }
      } catch (IllegalStateException var1) {
         throw a(var1);
      }

      return false;
   }

   public void R$void() {
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

   public void f$void() {
      this.b(-this.N.c());
   }

   public void q$void() {
      this.b(this.N.c());
   }

   public void p$void() {
      this.b(-1);
   }

   public void t$void() {
      this.b(1);
   }

   public void b(int var1) {
      this.i.setValue(this.i.getValue() + var1);
   }

   public Font s() {
      return (Font)(this.t.Z());
   }

   @NotNull
   public XE z(Point var1) {
      Le2 var2 = this.t(var1);
      return new XE(var2.N(), var2.G());
   }

   @NotNull
   public Le2 t(@NotNull Point var1) {
      int var2 = Math.min((var1.x - this.p$int()) / this.c4.width, this.U$int() - 1);
      var2 = Math.max(0, var2);
      int var3 = Math.min(var1.y / this.c4.height, this.L$int() - 1) + this.P;
      return new Le2(var3, var2);
   }

   public void u(@Nullable XE var1, @Nullable XE var2, boolean var3) {
      int var4 = ConnectionProperty.M$int();

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

      String var5 = A7.v(var10000, var2, this.V);

      try {
         if (var5.length() != 0) {
            this.v.L(var5, var3);
         }
      } catch (IllegalStateException var6) {
         throw a(var6);
      }
   }

   public void w(boolean var1) {
      SetBackgroundImagePanel var10;
      boolean var9;
      int var10000 = ConnectionProperty.y();
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
                     var9 = QP_2.l;
                     if (var2 != 0) {
                        break label55;
                     }

                     if (QP_2.l) {
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
   public String C$String() {
      return this.v.y(false);
   }

   public void l(Graphics2D var1, BufferedImage var2, int var3, int var4, ImageObserver var5) {
      var1.drawImage(var2, var3, var4, var2.getWidth(), var2.getHeight(), var5);
   }

   public BufferedImage L(int var1, int var2) {
      return new BufferedImage(var1, var2, 1);
   }

   @Nullable
   public OT n$OT() {
      int var10000 = ConnectionProperty.y();
      int var2 = (this.getWidth() - this.p$int()) / this.c4.width;
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
            return new OT(var2, var3);
         }
      } catch (IllegalStateException var4) {
         throw a(var4);
      }

      return null;
   }

   public void G() {
      SwingUtilities.invokeLater(new Ny4(this));
   }

   public void A$void() {
      SwingUtilities.invokeLater(new Yu2(this));
   }

   public void v(E0 var1) {
      this.cc = var1;
      this.A$void();
   }

   public void G(@NotNull KeyListener var1) {
      this.cT.add(var1);
   }

   public void q(@NotNull KeyListener var1) {
      this.cT.remove(var1);
   }

   @Override
   public void c(@NotNull OT param1, WF3 param2, int param3, int param4, NO3 param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: istore 6
      // 05: iload 6
      // 07: ifne 4d
      // 0a: aload 1
      // 0b: aload 0
      // 0c: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.N Lcom/finalshell/core/OT;
      // 0f: invokevirtual com/finalshell/core/OT.equals (Ljava/lang/Object;)Z
      // 12: ifne 7a
      // 15: goto 1c
      // 18: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 20: aload 1
      // 21: aload 2
      // 22: iload 3
      // 23: iload 4
      // 25: aload 5
      // 27: aload 0
      // 28: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.u Lcom/finalshell/core/RU3;
      // 2b: invokevirtual com/finalshell/core/Im4.h (Lcom/finalshell/core/OT;Lcom/finalshell/ui/model/WF3;IILcom/finalshell/core/NO3;Lcom/finalshell/core/RU3;)V
      // 2e: aload 0
      // 2f: aload 1
      // 30: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.N Lcom/finalshell/core/OT;
      // 33: aload 0
      // 34: new java/awt/Dimension
      // 37: dup
      // 38: aload 0
      // 39: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.g$int ()I
      // 3c: aload 0
      // 3d: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.J$int ()I
      // 40: invokespecial java/awt/Dimension.<init> (II)V
      // 43: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.setPreferredSize (Ljava/awt/Dimension;)V
      // 46: goto 4d
      // 49: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: aload 0
      // 4e: iload 6
      // 50: ifne 72
      // 53: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c Lcom/finalshell/core/Xn4;
      // 56: ifnull 71
      // 59: goto 60
      // 5c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f: athrow
      // 60: aload 0
      // 61: aload 2
      // 62: invokedynamic run (Lcom/finalshell/ui/panel/SetBackgroundImagePanel;Lcom/finalshell/ui/model/WF3;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/finalshell/ui/panel/SetBackgroundImagePanel.lambda$requestResize$2 (Lcom/finalshell/ui/model/WF3;)V, ()V ]
      // 67: invokestatic javax/swing/SwingUtilities.invokeLater (Ljava/lang/Runnable;)V
      // 6a: goto 71
      // 6d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 70: athrow
      // 71: aload 0
      // 72: invokedynamic run (Lcom/finalshell/ui/panel/SetBackgroundImagePanel;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/finalshell/ui/panel/SetBackgroundImagePanel.lambda$requestResize$3 ()V, ()V ]
      // 77: invokestatic javax/swing/SwingUtilities.invokeLater (Ljava/lang/Runnable;)V
      // 7a: return
   }

   public void H(Xn4 var1) {
      this.c = var1;
   }

   public float S$float() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 3e
      // 09: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 0c: invokevirtual com/finalshell/core/Im4.T$boolean ()Z
      // 0f: ifeq 3d
      // 12: goto 19
      // 15: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.t Lcom/finalshell/core/Rx4;
      // 1d: iload 1
      // 1e: ifeq 41
      // 21: goto 28
      // 24: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: invokeinterface com/finalshell/core/Rx4.a ()Z 1
      // 2d: ifeq 3d
      // 30: goto 37
      // 33: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: fconst_1
      // 38: freturn
      // 39: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.t Lcom/finalshell/core/Rx4;
      // 41: invokeinterface com/finalshell/core/Rx4.N ()F 1
      // 46: freturn
   }

   public static boolean g(FontMetrics param0) {
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
      // 02: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 05: bipush -1
      // 06: istore 3
      // 07: bipush 0
      // 08: istore 4
      // 0a: istore 1
      // 0b: iload 4
      // 0d: sipush 20807
      // 10: ldc2_w 1566352125640494002
      // 13: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 16: if_icmpge a4
      // 19: iload 4
      // 1b: invokestatic java/lang/Character.isValidCodePoint (I)Z
      // 1e: iload 1
      // 1f: ifne a5
      // 22: iload 1
      // 23: ifne 41
      // 26: goto 2d
      // 29: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: ifeq 9d
      // 30: goto 37
      // 33: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: iload 4
      // 39: i2c
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: istore 5
      // 43: iload 1
      // 44: ifne a0
      // 47: iload 5
      // 49: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.p (C)Z
      // 4c: ifeq 9d
      // 4f: goto 56
      // 52: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      // 6a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d: athrow
      // 6e: iload 6
      // 70: iload 1
      // 71: ifne 8e
      // 74: goto 7b
      // 77: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a: athrow
      // 7b: iload 3
      // 7c: if_icmpeq 9d
      // 7f: goto 86
      // 82: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 85: athrow
      // 86: bipush 0
      // 87: goto 8e
      // 8a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8d: athrow
      // 8e: istore 2
      // 8f: iload 1
      // 90: ifeq a4
      // 93: iload 6
      // 95: goto 9c
      // 98: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9b: athrow
      // 9c: istore 3
      // 9d: iinc 4 1
      // a0: iload 1
      // a1: ifeq 0b
      // a4: iload 2
      // a5: ireturn
   }

   public static boolean p(char var0) {
      return Character.isLetterOrDigit(var0);
   }

   public void W(Graphics param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 1e
      // 09: instanceof java/awt/Graphics2D
      // 0c: ifeq 5f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 1
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: checkcast java/awt/Graphics2D
      // 21: astore 3
      // 22: aload 0
      // 23: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.t Lcom/finalshell/core/Rx4;
      // 26: iload 2
      // 27: ifne 43
      // 2a: invokeinterface com/finalshell/core/Rx4.D ()Z 1
      // 2f: ifeq 46
      // 32: goto 39
      // 35: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: getstatic java/awt/RenderingHints.VALUE_TEXT_ANTIALIAS_ON Ljava/lang/Object;
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
   public Color r(@NotNull Et2 var1) {
      return LG3.H(this.R$S3().o(var1));
   }

   @NotNull
   @Override
   public Color getForeground() {
      return this.s(this.cY.A());
   }

   @NotNull
   public Color s$Color(@NotNull Et2 var1) {
      return LG3.H(this.R$S3().Y(var1));
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
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: invokestatic java/lang/System.currentTimeMillis ()J
      // 06: lstore 3
      // 07: istore 2
      // 08: iload 2
      // 09: ifne 48
      // 0c: ldc2_w 413132319533195410
      // 0f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 12: aconst_null
      // 13: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 16: ifeq 4c
      // 19: goto 20
      // 1c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.m Lcom/finalshell/core/Lt4;
      // 24: aload 1
      // 25: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 28: ldc2_w 478374544918577864
      // 2b: astore 6
      // 2d: astore 5
      // 2f: ldc2_w 478374544918577864
      // 32: aload 5
      // 34: aload 6
      // 36: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 39: pop
      // 3a: goto 41
      // 3d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 40: athrow
      // 41: goto 48
      // 44: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: iload 2
      // 49: ifeq 58
      // 4c: aload 0
      // 4d: aload 1
      // 4e: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.h (Ljava/awt/Graphics;)V
      // 51: goto 58
      // 54: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: aload 0
      // 59: iload 2
      // 5a: ifne 8e
      // 5d: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 60: invokevirtual com/finalshell/core/Im4.u ()Z
      // 63: ifne 86
      // 66: goto 6d
      // 69: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c: athrow
      // 6d: aload 0
      // 6e: iload 2
      // 6f: ifne 8e
      // 72: goto 79
      // 75: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78: athrow
      // 79: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cS Z
      // 7c: ifeq ba
      // 7f: goto 86
      // 82: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 85: athrow
      // 86: aload 0
      // 87: goto 8e
      // 8a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8d: athrow
      // 8e: iload 2
      // 8f: ifne b6
      // 92: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.L Lcom/finalshell/ui/panel/ConnectionProperty;
      // 95: ifnull ad
      // 98: goto 9f
      // 9b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9e: athrow
      // 9f: aload 0
      // a0: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.L Lcom/finalshell/ui/panel/ConnectionProperty;
      // a3: invokevirtual com/finalshell/ui/panel/ConnectionProperty.l$void ()V
      // a6: goto ad
      // a9: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ac: athrow
      // ad: aload 0
      // ae: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // b1: bipush 0
      // b2: invokevirtual com/finalshell/core/Im4.d (Z)V
      // b5: aload 0
      // b6: bipush 0
      // b7: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.cS Z
      // ba: return
   }

   public void g$void() {
      this.a = null;
      this.cp = null;
   }

   @NotNull
   public YP Y(@NotNull YP param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 23
      // 09: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.t Lcom/finalshell/core/Rx4;
      // 0c: invokeinterface com/finalshell/core/Rx4.m ()Z 1
      // 11: ifeq 28
      // 14: goto 1b
      // 17: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 0
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: aload 1
      // 24: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.y (Lcom/finalshell/core/YP;)Lcom/finalshell/core/YP;
      // 27: areturn
      // 28: aload 1
      // 29: invokevirtual com/finalshell/core/YP.n ()Lcom/finalshell/core/AG;
      // 2c: astore 3
      // 2d: aload 0
      // 2e: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.J$YP ()Lcom/finalshell/core/YP;
      // 31: astore 4
      // 33: aload 3
      // 34: aload 4
      // 36: invokevirtual com/finalshell/core/YP.s ()Lcom/finalshell/core/Et2;
      // 39: invokevirtual com/finalshell/core/AG.j (Lcom/finalshell/core/Et2;)Lcom/finalshell/core/AG;
      // 3c: pop
      // 3d: aload 3
      // 3e: aload 4
      // 40: invokevirtual com/finalshell/core/YP.K ()Lcom/finalshell/core/Et2;
      // 43: invokevirtual com/finalshell/core/AG.c (Lcom/finalshell/core/Et2;)Lcom/finalshell/core/AG;
      // 46: pop
      // 47: aload 3
      // 48: iload 2
      // 49: ifeq 67
      // 4c: instanceof com/finalshell/core/Am2
      // 4f: ifeq 66
      // 52: goto 59
      // 55: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58: athrow
      // 59: aload 3
      // 5a: checkcast com/finalshell/core/Am2
      // 5d: bipush 1
      // 5e: invokevirtual com/finalshell/core/Am2.I (Z)Lcom/finalshell/core/Yw2;
      // 61: areturn
      // 62: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: aload 3
      // 67: invokevirtual com/finalshell/core/AG.y ()Lcom/finalshell/core/YP;
      // 6a: areturn
   }

   @NotNull
   public YP J$YP() {
      int var10000 = ConnectionProperty.M$int();
      YP var2 = this.a;
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
   public YP m$YP() {
      int var10000 = ConnectionProperty.M$int();
      YP var2 = this.cp;
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
   public YP Z(@NotNull YP var1) {
      YP var2 = var1.q$YP();
      YP var3 = this.t.i();
      var2.d(var3.s());
      var2.p(var3.K());
      var2.t(true);
      return var2;
   }

   public void d(Graphics2D param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: istore 2
      // 04: aload 0
      // 05: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.e$boolean ()Z
      // 08: iload 2
      // 09: ifeq 33
      // 0c: ifeq dd
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.w Lcom/finalshell/core/D__2;
      // 1a: invokevirtual com/finalshell/core/D__2.Q ()I
      // 1d: bipush 1
      // 1e: iadd
      // 1f: aload 0
      // 20: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c4 Ljava/awt/Dimension;
      // 23: getfield java/awt/Dimension.width I
      // 26: imul
      // 27: aload 0
      // 28: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.p$int ()I
      // 2b: iadd
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: istore 3
      // 34: aload 0
      // 35: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.w Lcom/finalshell/core/D__2;
      // 38: invokevirtual com/finalshell/core/D__2.O ()I
      // 3b: bipush 1
      // 3c: iadd
      // 3d: istore 4
      // 3f: iload 4
      // 41: aload 0
      // 42: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c4 Ljava/awt/Dimension;
      // 45: getfield java/awt/Dimension.height I
      // 48: imul
      // 49: bipush 3
      // 4a: isub
      // 4b: istore 5
      // 4d: aload 0
      // 4e: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cf Ljava/lang/String;
      // 51: invokevirtual java/lang/String.length ()I
      // 54: aload 0
      // 55: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c4 Ljava/awt/Dimension;
      // 58: getfield java/awt/Dimension.width I
      // 5b: imul
      // 5c: istore 6
      // 5e: aload 1
      // 5f: aload 0
      // 60: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.getBackground ()Ljava/awt/Color;
      // 63: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 66: aload 1
      // 67: iload 3
      // 68: iload 4
      // 6a: bipush 1
      // 6b: isub
      // 6c: aload 0
      // 6d: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c4 Ljava/awt/Dimension;
      // 70: getfield java/awt/Dimension.height I
      // 73: imul
      // 74: bipush 3
      // 75: isub
      // 76: iload 6
      // 78: aload 0
      // 79: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c4 Ljava/awt/Dimension;
      // 7c: getfield java/awt/Dimension.height I
      // 7f: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 82: aload 1
      // 83: aload 0
      // 84: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.getForeground ()Ljava/awt/Color;
      // 87: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 8a: aload 1
      // 8b: aload 0
      // 8c: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c_ Ljava/awt/Font;
      // 8f: invokevirtual java/awt/Graphics2D.setFont (Ljava/awt/Font;)V
      // 92: aload 1
      // 93: aload 0
      // 94: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cf Ljava/lang/String;
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

   public boolean e$boolean() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cf Ljava/lang/String;
      // 08: iload 1
      // 09: ifne 21
      // 0c: ifnull 36
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cf Ljava/lang/String;
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: invokevirtual java/lang/String.length ()I
      // 24: iload 1
      // 25: ifne 33
      // 28: ifle 36
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   public boolean l(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.u Lcom/finalshell/core/RU3;
      // 08: iload 3
      // 09: ifeq 21
      // 0c: ifnull 3f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.u Lcom/finalshell/core/RU3;
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: new com/finalshell/core/XE
      // 24: dup
      // 25: iload 1
      // 26: iload 2
      // 27: invokespecial com/finalshell/core/XE.<init> (II)V
      // 2a: invokevirtual com/finalshell/core/RU3.s (Lcom/finalshell/core/XE;)Z
      // 2d: iload 3
      // 2e: ifeq 3c
      // 31: ifeq 3f
      // 34: goto 3b
      // 37: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      int var10000 = ConnectionProperty.M$int();
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
      return this.c4.width * this.N.R() + this.p$int();
   }

   public int J$int() {
      return this.c4.height * this.N.c();
   }

   @Override
   public int U$int() {
      return this.N.R();
   }

   public int L$int() {
      return this.N.c();
   }

   @Override
   public String U$String() {
      return this.j;
   }

   @Nullable
   public XF3 k$xF_3() {
      return LG3.l(this.getForeground());
   }

   @Nullable
   public XF3 T$xF_3() {
      return LG3.l(this.getBackground());
   }

   public int p$int() {
      return 0;
   }

   public void N(IY3 var1) {
      this.addMouseListener(new SU(this, var1));
      this.addMouseWheelListener(this::lambda$addTerminalMouseListener$4);
      this.addMouseMotionListener(new SB(this, var1));
   }

   @NotNull
   public KeyListener I$KeyListener() {
      return this.c2;
   }

   public int P$int() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c5 I
      // 08: iload 1
      // 09: ifne 37
      // 0c: aload 0
      // 0d: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.t Lcom/finalshell/core/Rx4;
      // 10: invokeinterface com/finalshell/core/Rx4.b ()I 1
      // 15: if_icmpeq 33
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 0
      // 21: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.t Lcom/finalshell/core/Rx4;
      // 24: invokeinterface com/finalshell/core/Rx4.b ()I 1
      // 29: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.V (I)V
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: aload 0
      // 34: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c5 I
      // 37: ireturn
   }

   public void w(Graphics2D var1, BufferedImage var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      var1.drawImage(var2, var3, var4, var5, var6, var7, var8, var9, var10, null);
   }

   @NotNull
   public YP y(@NotNull YP param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: new com/finalshell/core/AG
      // 06: dup
      // 07: aload 1
      // 08: invokespecial com/finalshell/core/AG.<init> (Lcom/finalshell/core/YP;)V
      // 0b: astore 3
      // 0c: istore 2
      // 0d: aload 3
      // 0e: getstatic com/finalshell/ui/model/SY.INVERSE Lcom/finalshell/ui/model/SY;
      // 11: aload 1
      // 12: getstatic com/finalshell/ui/model/SY.INVERSE Lcom/finalshell/ui/model/SY;
      // 15: invokevirtual com/finalshell/core/YP.v (Lcom/finalshell/ui/model/SY;)Z
      // 18: iload 2
      // 19: ifeq 27
      // 1c: ifne 2a
      // 1f: goto 26
      // 22: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: bipush 1
      // 27: goto 2b
      // 2a: bipush 0
      // 2b: invokevirtual com/finalshell/core/AG.c (Lcom/finalshell/ui/model/SY;Z)Lcom/finalshell/core/AG;
      // 2e: pop
      // 2f: aload 1
      // 30: invokevirtual com/finalshell/core/YP.K ()Lcom/finalshell/core/Et2;
      // 33: iload 2
      // 34: ifeq 63
      // 37: ifnonnull 54
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 3
      // 42: aload 0
      // 43: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cY Lcom/finalshell/core/Ov4;
      // 46: invokevirtual com/finalshell/core/Ov4.A ()Lcom/finalshell/core/Et2;
      // 49: invokevirtual com/finalshell/core/AG.c (Lcom/finalshell/core/Et2;)Lcom/finalshell/core/AG;
      // 4c: pop
      // 4d: goto 54
      // 50: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: aload 1
      // 55: iload 2
      // 56: ifeq 7d
      // 59: invokevirtual com/finalshell/core/YP.s ()Lcom/finalshell/core/Et2;
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62: athrow
      // 63: ifnonnull 79
      // 66: aload 3
      // 67: aload 0
      // 68: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cY Lcom/finalshell/core/Ov4;
      // 6b: invokevirtual com/finalshell/core/Ov4.c ()Lcom/finalshell/core/Et2;
      // 6e: invokevirtual com/finalshell/core/AG.j (Lcom/finalshell/core/Et2;)Lcom/finalshell/core/AG;
      // 71: pop
      // 72: goto 79
      // 75: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78: athrow
      // 79: aload 3
      // 7a: invokevirtual com/finalshell/core/AG.y ()Lcom/finalshell/core/YP;
      // 7d: areturn
   }

   public void I(int var1, int var2, YP var3, com.finalshell.ui.model.J2 var4, Graphics2D var5, boolean var6) {
      this.z(var1, var2, var3, var4, var5, true, var6, true);
   }

   public void r(int var1, int var2, YP var3, com.finalshell.ui.model.J2 var4, Graphics2D var5) {
      this.I(var1, var2, var3, var4, var5, false);
   }

   public void z(int param1, int param2, YP param3, com.finalshell.ui.model.J2 param4, Graphics2D param5, boolean param6, boolean param7, boolean param8) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 003: iload 1
      // 004: aload 0
      // 005: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c4 Ljava/awt/Dimension;
      // 008: getfield java/awt/Dimension.width I
      // 00b: imul
      // 00c: istore 10
      // 00e: istore 9
      // 010: iload 2
      // 011: aload 0
      // 012: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c4 Ljava/awt/Dimension;
      // 015: getfield java/awt/Dimension.height I
      // 018: imul
      // 019: iload 6
      // 01b: iload 9
      // 01d: ifne 036
      // 020: ifeq 032
      // 023: goto 02a
      // 026: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 029: athrow
      // 02a: bipush 0
      // 02b: goto 038
      // 02e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: aload 0
      // 033: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cJ I
      // 036: bipush 2
      // 037: idiv
      // 038: iadd
      // 039: istore 11
      // 03b: aload 4
      // 03d: invokevirtual com/finalshell/ui/model/J2.r ()[C
      // 040: aload 4
      // 042: invokevirtual com/finalshell/ui/model/J2.o ()I
      // 045: aload 4
      // 047: invokevirtual com/finalshell/ui/model/J2.length ()I
      // 04a: aload 0
      // 04b: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.t Lcom/finalshell/core/Rx4;
      // 04e: invokeinterface com/finalshell/core/Rx4.L ()Z 1
      // 053: invokestatic com/finalshell/core/Sd2.s ([CIIZ)I
      // 056: istore 12
      // 058: aload 0
      // 059: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c4 Ljava/awt/Dimension;
      // 05c: getfield java/awt/Dimension.height I
      // 05f: iload 6
      // 061: iload 9
      // 063: ifne 071
      // 066: ifeq 074
      // 069: goto 070
      // 06c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06f: athrow
      // 070: bipush 0
      // 071: goto 078
      // 074: aload 0
      // 075: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cJ I
      // 078: isub
      // 079: aload 0
      // 07a: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.getHeight ()I
      // 07d: iload 11
      // 07f: isub
      // 080: invokestatic java/lang/Math.min (II)I
      // 083: istore 13
      // 085: iload 12
      // 087: aload 0
      // 088: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c4 Ljava/awt/Dimension;
      // 08b: getfield java/awt/Dimension.width I
      // 08e: imul
      // 08f: aload 0
      // 090: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.getWidth ()I
      // 093: iload 10
      // 095: isub
      // 096: invokestatic java/lang/Math.min (II)I
      // 099: istore 14
      // 09b: aload 3
      // 09c: instanceof com/finalshell/core/Yw2
      // 09f: iload 9
      // 0a1: ifne 114
      // 0a4: ifeq 112
      // 0a7: goto 0ae
      // 0aa: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ad: athrow
      // 0ae: aload 3
      // 0af: checkcast com/finalshell/core/Yw2
      // 0b2: astore 15
      // 0b4: aload 15
      // 0b6: iload 9
      // 0b8: ifne 111
      // 0bb: invokevirtual com/finalshell/core/Yw2.i ()Lcom/finalshell/ui/model/KO;
      // 0be: getstatic com/finalshell/ui/model/KO.ALWAYS Lcom/finalshell/ui/model/KO;
      // 0c1: if_acmpeq 105
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: aload 15
      // 0ce: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.e (Lcom/finalshell/core/Yw2;)Z
      // 0d1: iload 9
      // 0d3: ifne 114
      // 0d6: goto 0dd
      // 0d9: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc: athrow
      // 0dd: ifeq 112
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e6: athrow
      // 0e7: aload 15
      // 0e9: iload 9
      // 0eb: ifne 111
      // 0ee: goto 0f5
      // 0f1: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f4: athrow
      // 0f5: invokevirtual com/finalshell/core/Yw2.i ()Lcom/finalshell/ui/model/KO;
      // 0f8: getstatic com/finalshell/ui/model/KO.HOVER Lcom/finalshell/ui/model/KO;
      // 0fb: if_acmpne 112
      // 0fe: goto 105
      // 101: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 104: athrow
      // 105: aload 15
      // 107: invokevirtual com/finalshell/core/Yw2.k ()Lcom/finalshell/core/YP;
      // 10a: goto 111
      // 10d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 110: athrow
      // 111: astore 3
      // 112: iload 10
      // 114: iload 9
      // 116: ifne 125
      // 119: iflt 165
      // 11c: goto 123
      // 11f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 122: athrow
      // 123: iload 10
      // 125: iload 9
      // 127: ifne 141
      // 12a: aload 0
      // 12b: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.getWidth ()I
      // 12e: if_icmpgt 165
      // 131: goto 138
      // 134: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 137: athrow
      // 138: iload 11
      // 13a: goto 141
      // 13d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 140: athrow
      // 141: iload 9
      // 143: ifne 152
      // 146: iflt 165
      // 149: goto 150
      // 14c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14f: athrow
      // 150: iload 11
      // 152: iload 9
      // 154: ifne 192
      // 157: aload 0
      // 158: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.getHeight ()I
      // 15b: if_icmple 16a
      // 15e: goto 165
      // 161: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 164: athrow
      // 165: return
      // 166: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 169: athrow
      // 16a: aload 5
      // 16c: aload 0
      // 16d: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cM Lcom/finalshell/core/NY;
      // 170: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 173: ldc2_w 345089686683358688
      // 176: astore 21
      // 178: astore 20
      // 17a: ldc2_w 345089686683358688
      // 17d: aload 20
      // 17f: aload 21
      // 181: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 184: checkcast java/awt/Color
      // 187: goto 18e
      // 18a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 18d: athrow
      // 18e: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 191: bipush 0
      // 192: istore 15
      // 194: bipush 1
      // 195: istore 16
      // 197: aload 3
      // 198: getstatic com/finalshell/ui/model/SY.INVERSE Lcom/finalshell/ui/model/SY;
      // 19b: invokevirtual com/finalshell/core/YP.v (Lcom/finalshell/ui/model/SY;)Z
      // 19e: iload 9
      // 1a0: ifne 22a
      // 1a3: ifeq 2a8
      // 1a6: goto 1ad
      // 1a9: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ac: athrow
      // 1ad: bipush 1
      // 1ae: istore 15
      // 1b0: aload 5
      // 1b2: aload 0
      // 1b3: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cM Lcom/finalshell/core/NY;
      // 1b6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1b9: ldc2_w 454783995894914749
      // 1bc: astore 23
      // 1be: astore 22
      // 1c0: ldc2_w 454783995894914749
      // 1c3: aload 22
      // 1c5: aload 23
      // 1c7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ca: checkcast java/awt/Color
      // 1cd: goto 1d4
      // 1d0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1d3: athrow
      // 1d4: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 1d7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1da: ldc2_w 270389152141252877
      // 1dd: astore 24
      // 1df: ldc2_w 270389152141252877
      // 1e2: aload 24
      // 1e4: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e7: goto 1ee
      // 1ea: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ed: athrow
      // 1ee: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1f1: ldc2_w 306266403902896148
      // 1f4: astore 27
      // 1f6: astore 26
      // 1f8: ldc2_w 306266403902896148
      // 1fb: aload 26
      // 1fd: aload 27
      // 1ff: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 202: goto 209
      // 205: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 208: athrow
      // 209: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 20c: ldc2_w 224406316798891066
      // 20f: astore 29
      // 211: astore 28
      // 213: ldc2_w 224406316798891066
      // 216: aload 28
      // 218: aload 29
      // 21a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 21d: checkcast java/lang/Boolean
      // 220: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 223: goto 22a
      // 226: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 229: athrow
      // 22a: iload 9
      // 22c: ifne 257
      // 22f: ifeq 253
      // 232: goto 239
      // 235: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 238: athrow
      // 239: aload 5
      // 23b: invokevirtual java/awt/Graphics2D.getColor ()Ljava/awt/Color;
      // 23e: astore 17
      // 240: aload 5
      // 242: aload 17
      // 244: sipush 6012
      // 247: ldc2_w 5448107624863829411
      // 24a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 24d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.C (Ljava/awt/Color;I)Ljava/awt/Color;
      // 250: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 253: aload 3
      // 254: invokevirtual com/finalshell/core/YP.r ()Z
      // 257: iload 9
      // 259: ifne 46d
      // 25c: ifeq 46b
      // 25f: goto 266
      // 262: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 265: athrow
      // 266: new java/awt/Color
      // 269: dup
      // 26a: aload 0
      // 26b: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.R$S3 ()Lcom/finalshell/core/S3;
      // 26e: aload 0
      // 26f: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cY Lcom/finalshell/core/Ov4;
      // 272: aload 3
      // 273: invokevirtual com/finalshell/core/YP.K ()Lcom/finalshell/core/Et2;
      // 276: invokevirtual com/finalshell/core/Ov4.A (Lcom/finalshell/core/Et2;)Lcom/finalshell/core/Et2;
      // 279: invokevirtual com/finalshell/core/S3.Q (Lcom/finalshell/core/Et2;)Lcom/finalshell/core/XF3;
      // 27c: invokevirtual com/finalshell/core/XF3.p ()I
      // 27f: invokespecial java/awt/Color.<init> (I)V
      // 282: sipush 15929
      // 285: ldc2_w 2442573579829159122
      // 288: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 28b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.C (Ljava/awt/Color;I)Ljava/awt/Color;
      // 28e: astore 17
      // 290: aload 5
      // 292: aload 17
      // 294: sipush 3619
      // 297: ldc2_w 8118941228298376377
      // 29a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 29d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.C (Ljava/awt/Color;I)Ljava/awt/Color;
      // 2a0: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 2a3: iload 9
      // 2a5: ifeq 46b
      // 2a8: new java/awt/Color
      // 2ab: dup
      // 2ac: aload 0
      // 2ad: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.R$S3 ()Lcom/finalshell/core/S3;
      // 2b0: aload 0
      // 2b1: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cY Lcom/finalshell/core/Ov4;
      // 2b4: aload 3
      // 2b5: invokevirtual com/finalshell/core/YP.Z ()Lcom/finalshell/core/Et2;
      // 2b8: invokevirtual com/finalshell/core/Ov4.R (Lcom/finalshell/core/Et2;)Lcom/finalshell/core/Et2;
      // 2bb: invokevirtual com/finalshell/core/S3.Q (Lcom/finalshell/core/Et2;)Lcom/finalshell/core/XF3;
      // 2be: invokevirtual com/finalshell/core/XF3.p ()I
      // 2c1: invokespecial java/awt/Color.<init> (I)V
      // 2c4: sipush 3619
      // 2c7: ldc2_w 8118941228298376377
      // 2ca: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 2cd: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.C (Ljava/awt/Color;I)Ljava/awt/Color;
      // 2d0: astore 17
      // 2d2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2d5: ldc2_w 270389152141252877
      // 2d8: astore 30
      // 2da: ldc2_w 270389152141252877
      // 2dd: aload 30
      // 2df: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2e2: goto 2e9
      // 2e5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2e8: athrow
      // 2e9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2ec: ldc2_w 306266403902896148
      // 2ef: astore 33
      // 2f1: astore 32
      // 2f3: ldc2_w 306266403902896148
      // 2f6: aload 32
      // 2f8: aload 33
      // 2fa: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2fd: goto 304
      // 300: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 303: athrow
      // 304: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 307: ldc2_w 224406316798891066
      // 30a: astore 35
      // 30c: astore 34
      // 30e: ldc2_w 224406316798891066
      // 311: aload 34
      // 313: aload 35
      // 315: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 318: checkcast java/lang/Boolean
      // 31b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 31e: goto 325
      // 321: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 324: athrow
      // 325: ifne 3d9
      // 328: aload 3
      // 329: invokevirtual com/finalshell/core/YP.Z ()Lcom/finalshell/core/Et2;
      // 32c: astore 18
      // 32e: aload 3
      // 32f: invokevirtual com/finalshell/core/YP.w ()Z
      // 332: iload 9
      // 334: ifne 399
      // 337: ifne 392
      // 33a: goto 341
      // 33d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 340: athrow
      // 341: aload 18
      // 343: iload 9
      // 345: ifne 35b
      // 348: goto 34f
      // 34b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34e: athrow
      // 34f: ifnull 392
      // 352: goto 359
      // 355: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 358: athrow
      // 359: aload 18
      // 35b: invokevirtual com/finalshell/core/Et2.q ()I
      // 35e: iload 9
      // 360: ifne 399
      // 363: bipush -1
      // 364: if_icmpne 392
      // 367: goto 36e
      // 36a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36d: athrow
      // 36e: aload 0
      // 36f: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cM Lcom/finalshell/core/NY;
      // 372: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 375: ldc2_w 345089686683358688
      // 378: astore 37
      // 37a: astore 36
      // 37c: ldc2_w 345089686683358688
      // 37f: aload 36
      // 381: aload 37
      // 383: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 386: checkcast java/awt/Color
      // 389: goto 390
      // 38c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 38f: athrow
      // 390: astore 17
      // 392: aload 3
      // 393: getstatic com/finalshell/core/YP.r Lcom/finalshell/core/YP;
      // 396: invokevirtual com/finalshell/core/YP.equals (Ljava/lang/Object;)Z
      // 399: ifeq 3c0
      // 39c: aload 0
      // 39d: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cM Lcom/finalshell/core/NY;
      // 3a0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3a3: ldc2_w 345089686683358688
      // 3a6: astore 39
      // 3a8: astore 38
      // 3aa: ldc2_w 345089686683358688
      // 3ad: aload 38
      // 3af: aload 39
      // 3b1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3b4: checkcast java/awt/Color
      // 3b7: goto 3be
      // 3ba: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3bd: athrow
      // 3be: astore 17
      // 3c0: aload 5
      // 3c2: aload 17
      // 3c4: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 3c7: aload 5
      // 3c9: iload 10
      // 3cb: iload 11
      // 3cd: iload 14
      // 3cf: iload 13
      // 3d1: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 3d4: iload 9
      // 3d6: ifeq 46b
      // 3d9: aload 3
      // 3da: invokevirtual com/finalshell/core/YP.Z ()Lcom/finalshell/core/Et2;
      // 3dd: astore 18
      // 3df: aload 18
      // 3e1: iload 9
      // 3e3: ifne 3f2
      // 3e6: ifnull 405
      // 3e9: goto 3f0
      // 3ec: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ef: athrow
      // 3f0: aload 18
      // 3f2: invokevirtual com/finalshell/core/Et2.q ()I
      // 3f5: iload 9
      // 3f7: ifne 441
      // 3fa: bipush -1
      // 3fb: if_icmpeq 43d
      // 3fe: goto 405
      // 401: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 404: athrow
      // 405: aload 3
      // 406: getstatic com/finalshell/core/YP.r Lcom/finalshell/core/YP;
      // 409: invokevirtual com/finalshell/core/YP.equals (Ljava/lang/Object;)Z
      // 40c: iload 9
      // 40e: ifne 441
      // 411: goto 418
      // 414: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 417: athrow
      // 418: ifne 43d
      // 41b: goto 422
      // 41e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 421: athrow
      // 422: aload 5
      // 424: aload 17
      // 426: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 429: aload 5
      // 42b: iload 10
      // 42d: iload 11
      // 42f: iload 14
      // 431: iload 13
      // 433: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 436: goto 43d
      // 439: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43c: athrow
      // 43d: aload 3
      // 43e: invokevirtual com/finalshell/core/YP.w ()Z
      // 441: iload 9
      // 443: ifne 46d
      // 446: ifeq 46b
      // 449: goto 450
      // 44c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44f: athrow
      // 450: aload 5
      // 452: aload 17
      // 454: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 457: aload 5
      // 459: iload 10
      // 45b: iload 11
      // 45d: iload 14
      // 45f: iload 13
      // 461: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 464: goto 46b
      // 467: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46a: athrow
      // 46b: iload 7
      // 46d: iload 9
      // 46f: ifne 545
      // 472: ifne 540
      // 475: goto 47c
      // 478: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47b: athrow
      // 47c: aload 3
      // 47d: invokevirtual com/finalshell/core/YP.u ()Z
      // 480: iload 9
      // 482: ifne 509
      // 485: goto 48c
      // 488: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48b: athrow
      // 48c: ifeq 4af
      // 48f: goto 496
      // 492: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 495: athrow
      // 496: aload 5
      // 498: iload 10
      // 49a: iload 11
      // 49c: iload 14
      // 49e: iload 13
      // 4a0: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 4a3: iload 9
      // 4a5: ifeq 540
      // 4a8: goto 4af
      // 4ab: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ae: athrow
      // 4af: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4b2: ldc2_w 270389152141252877
      // 4b5: astore 40
      // 4b7: ldc2_w 270389152141252877
      // 4ba: aload 40
      // 4bc: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 4bf: goto 4c6
      // 4c2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4c5: athrow
      // 4c6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4c9: ldc2_w 306266403902896148
      // 4cc: astore 43
      // 4ce: astore 42
      // 4d0: ldc2_w 306266403902896148
      // 4d3: aload 42
      // 4d5: aload 43
      // 4d7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4da: goto 4e1
      // 4dd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4e0: athrow
      // 4e1: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4e4: ldc2_w 224406316798891066
      // 4e7: astore 45
      // 4e9: astore 44
      // 4eb: ldc2_w 224406316798891066
      // 4ee: aload 44
      // 4f0: aload 45
      // 4f2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4f5: checkcast java/lang/Boolean
      // 4f8: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4fb: goto 502
      // 4fe: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 501: athrow
      // 502: goto 509
      // 505: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 508: athrow
      // 509: iload 9
      // 50b: ifne 531
      // 50e: ifeq 530
      // 511: goto 518
      // 514: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 517: athrow
      // 518: iload 15
      // 51a: iload 9
      // 51c: ifne 545
      // 51f: goto 526
      // 522: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 525: athrow
      // 526: ifeq 540
      // 529: goto 530
      // 52c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52f: athrow
      // 530: bipush 0
      // 531: istore 16
      // 533: aload 5
      // 535: iload 10
      // 537: iload 11
      // 539: iload 14
      // 53b: iload 13
      // 53d: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 540: aload 4
      // 542: invokevirtual com/finalshell/ui/model/J2.Y ()Z
      // 545: ifeq 549
      // 548: return
      // 549: new java/awt/Color
      // 54c: dup
      // 54d: aload 0
      // 54e: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.R$S3 ()Lcom/finalshell/core/S3;
      // 551: aload 0
      // 552: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cY Lcom/finalshell/core/Ov4;
      // 555: aload 3
      // 556: invokevirtual com/finalshell/core/YP.K ()Lcom/finalshell/core/Et2;
      // 559: invokevirtual com/finalshell/core/Ov4.A (Lcom/finalshell/core/Et2;)Lcom/finalshell/core/Et2;
      // 55c: invokevirtual com/finalshell/core/S3.Q (Lcom/finalshell/core/Et2;)Lcom/finalshell/core/XF3;
      // 55f: invokevirtual com/finalshell/core/XF3.p ()I
      // 562: invokespecial java/awt/Color.<init> (I)V
      // 565: sipush 3619
      // 568: ldc2_w 8118941228298376377
      // 56b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 56e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.C (Ljava/awt/Color;I)Ljava/awt/Color;
      // 571: astore 17
      // 573: aload 5
      // 575: aload 17
      // 577: sipush 3619
      // 57a: ldc2_w 8118941228298376377
      // 57d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 580: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.C (Ljava/awt/Color;I)Ljava/awt/Color;
      // 583: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 586: aload 0
      // 587: iload 1
      // 588: iload 2
      // 589: aload 4
      // 58b: aload 3
      // 58c: aload 5
      // 58e: iload 16
      // 590: iload 8
      // 592: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.R (IILcom/finalshell/ui/model/J2;Lcom/finalshell/core/YP;Ljava/awt/Graphics2D;ZZ)V
      // 595: aload 3
      // 596: getstatic com/finalshell/ui/model/SY.UNDERLINED Lcom/finalshell/ui/model/SY;
      // 599: invokevirtual com/finalshell/core/YP.v (Lcom/finalshell/ui/model/SY;)Z
      // 59c: iload 9
      // 59e: ifne 5c9
      // 5a1: ifeq 5ed
      // 5a4: goto 5ab
      // 5a7: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5aa: athrow
      // 5ab: iload 2
      // 5ac: bipush 1
      // 5ad: iadd
      // 5ae: aload 0
      // 5af: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c4 Ljava/awt/Dimension;
      // 5b2: getfield java/awt/Dimension.height I
      // 5b5: imul
      // 5b6: aload 0
      // 5b7: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cJ I
      // 5ba: bipush 2
      // 5bb: idiv
      // 5bc: isub
      // 5bd: aload 0
      // 5be: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cW I
      // 5c1: isub
      // 5c2: goto 5c9
      // 5c5: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c8: athrow
      // 5c9: istore 18
      // 5cb: iload 18
      // 5cd: bipush 2
      // 5ce: isub
      // 5cf: istore 19
      // 5d1: aload 5
      // 5d3: iload 10
      // 5d5: iload 19
      // 5d7: iload 1
      // 5d8: iload 12
      // 5da: iadd
      // 5db: aload 0
      // 5dc: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c4 Ljava/awt/Dimension;
      // 5df: getfield java/awt/Dimension.width I
      // 5e2: imul
      // 5e3: aload 0
      // 5e4: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.p$int ()I
      // 5e7: iadd
      // 5e8: iload 19
      // 5ea: invokevirtual java/awt/Graphics2D.drawLine (IIII)V
      // 5ed: return
   }

   public static Color F(XF3 var0, int var1) {
      return new Color(var0.U(), var0.K(), var0.E$int(), var1);
   }

   public static Color C(Color var0, int var1) {
      return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), var1);
   }

   public boolean e(@NotNull Yw2 var1) {
      try {
         if (this.cV == var1.g()) {
            return true;
         }
      } catch (IllegalStateException var2) {
         throw a(var2);
      }

      return false;
   }

   public void R(
      int param1, int param2, @NotNull com.finalshell.ui.model.J2 param3, @NotNull YP param4, @NotNull Graphics2D param5, boolean param6, boolean param7
   ) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 003: bipush 1
      // 004: istore 9
      // 006: bipush 0
      // 007: istore 10
      // 009: istore 8
      // 00b: bipush 0
      // 00c: istore 11
      // 00e: aload 0
      // 00f: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.t Lcom/finalshell/core/Rx4;
      // 012: invokeinterface com/finalshell/core/Rx4.s ()Z 1
      // 017: iload 8
      // 019: ifne 035
      // 01c: ifeq 043
      // 01f: goto 026
      // 022: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025: athrow
      // 026: aload 4
      // 028: getstatic com/finalshell/ui/model/SY.BOLD Lcom/finalshell/ui/model/SY;
      // 02b: invokevirtual com/finalshell/core/YP.v (Lcom/finalshell/ui/model/SY;)Z
      // 02e: goto 035
      // 031: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 034: athrow
      // 035: ifeq 043
      // 038: aload 3
      // 039: invokestatic com/finalshell/core/Sd2.G (Lcom/finalshell/ui/model/J2;)Lcom/finalshell/ui/model/J2;
      // 03c: astore 12
      // 03e: iload 8
      // 040: ifeq 046
      // 043: aload 3
      // 044: astore 12
      // 046: aload 5
      // 048: aload 0
      // 049: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cM Lcom/finalshell/core/NY;
      // 04c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 04f: ldc2_w 357445816026915918
      // 052: astore 37
      // 054: astore 36
      // 056: ldc2_w 357445816026915918
      // 059: aload 36
      // 05b: aload 37
      // 05d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 060: checkcast java/awt/Color
      // 063: goto 06a
      // 066: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 069: athrow
      // 06a: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 06d: aload 4
      // 06f: getstatic com/finalshell/ui/model/SY.INVERSE Lcom/finalshell/ui/model/SY;
      // 072: invokevirtual com/finalshell/core/YP.v (Lcom/finalshell/ui/model/SY;)Z
      // 075: iload 8
      // 077: ifne 14b
      // 07a: ifeq 13f
      // 07d: goto 084
      // 080: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 083: athrow
      // 084: aload 4
      // 086: invokevirtual com/finalshell/core/YP.a ()Z
      // 089: iload 8
      // 08b: ifne 0fd
      // 08e: goto 095
      // 091: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094: athrow
      // 095: ifeq 0f1
      // 098: goto 09f
      // 09b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09e: athrow
      // 09f: aload 4
      // 0a1: invokevirtual com/finalshell/core/YP.r ()Z
      // 0a4: iload 8
      // 0a6: ifne 1ac
      // 0a9: goto 0b0
      // 0ac: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0af: athrow
      // 0b0: ifeq 1a7
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b9: athrow
      // 0ba: new java/awt/Color
      // 0bd: dup
      // 0be: aload 0
      // 0bf: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.R$S3 ()Lcom/finalshell/core/S3;
      // 0c2: aload 0
      // 0c3: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cY Lcom/finalshell/core/Ov4;
      // 0c6: aload 4
      // 0c8: invokevirtual com/finalshell/core/YP.s ()Lcom/finalshell/core/Et2;
      // 0cb: invokevirtual com/finalshell/core/Ov4.A (Lcom/finalshell/core/Et2;)Lcom/finalshell/core/Et2;
      // 0ce: invokevirtual com/finalshell/core/S3.Q (Lcom/finalshell/core/Et2;)Lcom/finalshell/core/XF3;
      // 0d1: invokevirtual com/finalshell/core/XF3.p ()I
      // 0d4: invokespecial java/awt/Color.<init> (I)V
      // 0d7: sipush 3619
      // 0da: ldc2_w 8118941228298376377
      // 0dd: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 0e0: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.C (Ljava/awt/Color;I)Ljava/awt/Color;
      // 0e3: astore 13
      // 0e5: aload 5
      // 0e7: aload 13
      // 0e9: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 0ec: iload 8
      // 0ee: ifeq 1a7
      // 0f1: aload 4
      // 0f3: invokevirtual com/finalshell/core/YP.r ()Z
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: iload 8
      // 0ff: ifne 1ac
      // 102: ifeq 1a7
      // 105: goto 10c
      // 108: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10b: athrow
      // 10c: aload 5
      // 10e: aload 0
      // 10f: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cM Lcom/finalshell/core/NY;
      // 112: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 115: ldc2_w 345089686683358688
      // 118: astore 39
      // 11a: astore 38
      // 11c: ldc2_w 345089686683358688
      // 11f: aload 38
      // 121: aload 39
      // 123: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 126: checkcast java/awt/Color
      // 129: goto 130
      // 12c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 12f: athrow
      // 130: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 133: iload 8
      // 135: ifeq 1a7
      // 138: goto 13f
      // 13b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13e: athrow
      // 13f: aload 4
      // 141: invokevirtual com/finalshell/core/YP.r ()Z
      // 144: goto 14b
      // 147: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14a: athrow
      // 14b: iload 8
      // 14d: ifne 166
      // 150: ifne 175
      // 153: goto 15a
      // 156: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 159: athrow
      // 15a: aload 4
      // 15c: invokevirtual com/finalshell/core/YP.w ()Z
      // 15f: goto 166
      // 162: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 165: athrow
      // 166: iload 8
      // 168: ifne 1ac
      // 16b: ifeq 1a7
      // 16e: goto 175
      // 171: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 174: athrow
      // 175: new java/awt/Color
      // 178: dup
      // 179: aload 0
      // 17a: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.R$S3 ()Lcom/finalshell/core/S3;
      // 17d: aload 0
      // 17e: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cY Lcom/finalshell/core/Ov4;
      // 181: aload 4
      // 183: invokevirtual com/finalshell/core/YP.K ()Lcom/finalshell/core/Et2;
      // 186: invokevirtual com/finalshell/core/Ov4.A (Lcom/finalshell/core/Et2;)Lcom/finalshell/core/Et2;
      // 189: invokevirtual com/finalshell/core/S3.Q (Lcom/finalshell/core/Et2;)Lcom/finalshell/core/XF3;
      // 18c: invokevirtual com/finalshell/core/XF3.p ()I
      // 18f: invokespecial java/awt/Color.<init> (I)V
      // 192: sipush 3619
      // 195: ldc2_w 8118941228298376377
      // 198: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 19b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.C (Ljava/awt/Color;I)Ljava/awt/Color;
      // 19e: astore 13
      // 1a0: aload 5
      // 1a2: aload 13
      // 1a4: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 1a7: iload 10
      // 1a9: iload 9
      // 1ab: iadd
      // 1ac: aload 3
      // 1ad: invokevirtual com/finalshell/ui/model/J2.length ()I
      // 1b0: if_icmpgt 647
      // 1b3: bipush 0
      // 1b4: istore 13
      // 1b6: aload 12
      // 1b8: invokevirtual com/finalshell/ui/model/J2.r ()[C
      // 1bb: aload 3
      // 1bc: invokevirtual com/finalshell/ui/model/J2.o ()I
      // 1bf: iload 10
      // 1c1: iadd
      // 1c2: caload
      // 1c3: istore 14
      // 1c5: iload 8
      // 1c7: ifne 64d
      // 1ca: aload 12
      // 1cc: invokevirtual com/finalshell/ui/model/J2.r ()[C
      // 1cf: aload 3
      // 1d0: invokevirtual com/finalshell/ui/model/J2.o ()I
      // 1d3: iload 10
      // 1d5: iadd
      // 1d6: caload
      // 1d7: iload 8
      // 1d9: ifne 209
      // 1dc: goto 1e3
      // 1df: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e2: athrow
      // 1e3: sipush 15592
      // 1e6: ldc2_w 5014524581788788246
      // 1e9: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 1ec: if_icmpne 207
      // 1ef: goto 1f6
      // 1f2: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f5: athrow
      // 1f6: iload 10
      // 1f8: iload 9
      // 1fa: iadd
      // 1fb: istore 10
      // 1fd: iload 11
      // 1ff: iload 9
      // 201: iadd
      // 202: istore 11
      // 204: bipush 1
      // 205: istore 13
      // 207: iload 13
      // 209: iload 8
      // 20b: ifne 234
      // 20e: ifeq 224
      // 211: goto 218
      // 214: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 217: athrow
      // 218: iload 8
      // 21a: ifeq 1a7
      // 21d: goto 224
      // 220: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 223: athrow
      // 224: aload 0
      // 225: iload 8
      // 227: ifne 279
      // 22a: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.k Z
      // 22d: goto 234
      // 230: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 233: athrow
      // 234: ifne 278
      // 237: aload 0
      // 238: iload 8
      // 23a: ifne 279
      // 23d: goto 244
      // 240: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 243: athrow
      // 244: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c8 Z
      // 247: ifne 278
      // 24a: goto 251
      // 24d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 250: athrow
      // 251: iload 7
      // 253: ifeq 278
      // 256: goto 25d
      // 259: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25c: athrow
      // 25d: aload 0
      // 25e: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.H Lcom/finalshell/core/Pr2;
      // 261: iload 14
      // 263: iload 1
      // 264: iload 11
      // 266: iadd
      // 267: iload 2
      // 268: iload 14
      // 26a: bipush 0
      // 26b: invokestatic com/finalshell/core/Sd2.U (IZ)Z
      // 26e: invokevirtual com/finalshell/core/Pr2.h (CIIZ)V
      // 271: goto 278
      // 274: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 277: athrow
      // 278: aload 0
      // 279: aload 3
      // 27a: iload 10
      // 27c: iload 9
      // 27e: iadd
      // 27f: bipush 1
      // 280: isub
      // 281: invokevirtual com/finalshell/ui/model/J2.charAt (I)C
      // 284: aload 4
      // 286: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.q (CLcom/finalshell/core/YP;)Ljava/awt/Font;
      // 289: astore 15
      // 28b: aload 5
      // 28d: aload 15
      // 28f: invokevirtual java/awt/Graphics2D.setFont (Ljava/awt/Font;)V
      // 292: aload 5
      // 294: aload 15
      // 296: invokevirtual java/awt/Graphics2D.getFontMetrics (Ljava/awt/Font;)Ljava/awt/FontMetrics;
      // 299: invokevirtual java/awt/FontMetrics.getDescent ()I
      // 29c: istore 16
      // 29e: aload 0
      // 29f: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.F I
      // 2a2: istore 16
      // 2a4: aload 15
      // 2a6: invokevirtual java/awt/Font.getName ()Ljava/lang/String;
      // 2a9: aload 0
      // 2aa: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.d Lcom/finalshell/core/K3;
      // 2ad: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2b0: ldc2_w 570146297653439641
      // 2b3: astore 41
      // 2b5: astore 40
      // 2b7: ldc2_w 570146297653439641
      // 2ba: aload 40
      // 2bc: aload 41
      // 2be: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2c1: goto 2c8
      // 2c4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2c7: athrow
      // 2c8: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2cb: ldc2_w 141793837555606825
      // 2ce: astore 43
      // 2d0: astore 42
      // 2d2: ldc2_w 141793837555606825
      // 2d5: aload 42
      // 2d7: aload 43
      // 2d9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2dc: checkcast java/awt/Font
      // 2df: goto 2e6
      // 2e2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2e5: athrow
      // 2e6: invokevirtual java/awt/Font.getName ()Ljava/lang/String;
      // 2e9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2ec: iload 8
      // 2ee: ifne 357
      // 2f1: ifeq 340
      // 2f4: goto 2fb
      // 2f7: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fa: athrow
      // 2fb: aload 0
      // 2fc: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.d Lcom/finalshell/core/K3;
      // 2ff: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 302: ldc2_w 570146297653439641
      // 305: astore 45
      // 307: astore 44
      // 309: ldc2_w 570146297653439641
      // 30c: aload 44
      // 30e: aload 45
      // 310: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 313: goto 31a
      // 316: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 319: athrow
      // 31a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 31d: ldc2_w 191936527957858294
      // 320: astore 47
      // 322: astore 46
      // 324: ldc2_w 191936527957858294
      // 327: aload 46
      // 329: aload 47
      // 32b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 32e: checkcast java/lang/Integer
      // 331: invokevirtual java/lang/Integer.intValue ()I
      // 334: goto 33b
      // 337: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 33a: athrow
      // 33b: istore 16
      // 33d: iinc 16 1
      // 340: iload 2
      // 341: bipush 1
      // 342: iadd
      // 343: aload 0
      // 344: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c4 Ljava/awt/Dimension;
      // 347: getfield java/awt/Dimension.height I
      // 34a: imul
      // 34b: aload 0
      // 34c: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cJ I
      // 34f: bipush 2
      // 350: idiv
      // 351: isub
      // 352: iload 16
      // 354: isub
      // 355: bipush 4
      // 356: iadd
      // 357: istore 17
      // 359: iload 1
      // 35a: iload 11
      // 35c: iadd
      // 35d: aload 0
      // 35e: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c4 Ljava/awt/Dimension;
      // 361: getfield java/awt/Dimension.width I
      // 364: imul
      // 365: istore 18
      // 367: iload 6
      // 369: iload 8
      // 36b: ifne 601
      // 36e: ifeq 5ff
      // 371: goto 378
      // 374: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 377: athrow
      // 378: aload 5
      // 37a: invokevirtual java/awt/Graphics2D.getColor ()Ljava/awt/Color;
      // 37d: astore 19
      // 37f: aload 5
      // 381: invokevirtual java/awt/Graphics2D.getFontMetrics ()Ljava/awt/FontMetrics;
      // 384: astore 20
      // 386: aload 20
      // 388: iload 14
      // 38a: invokevirtual java/awt/FontMetrics.charWidth (C)I
      // 38d: istore 21
      // 38f: aload 20
      // 391: invokevirtual java/awt/FontMetrics.getHeight ()I
      // 394: istore 22
      // 396: iload 14
      // 398: sipush 17162
      // 39b: ldc2_w 6332241477127166453
      // 39e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 3a1: if_icmpeq 5f8
      // 3a4: aload 19
      // 3a6: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.s (Ljava/awt/Color;)Ljava/awt/Color;
      // 3a9: astore 23
      // 3ab: new java/awt/Color
      // 3ae: dup
      // 3af: aload 23
      // 3b1: invokevirtual java/awt/Color.getRed ()I
      // 3b4: aload 23
      // 3b6: invokevirtual java/awt/Color.getGreen ()I
      // 3b9: aload 23
      // 3bb: invokevirtual java/awt/Color.getBlue ()I
      // 3be: sipush 3619
      // 3c1: ldc2_w 8118941228298376377
      // 3c4: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 3c7: invokespecial java/awt/Color.<init> (IIII)V
      // 3ca: astore 23
      // 3cc: aload 23
      // 3ce: astore 24
      // 3d0: aload 23
      // 3d2: invokevirtual java/awt/Color.getRed ()I
      // 3d5: aload 23
      // 3d7: invokevirtual java/awt/Color.getGreen ()I
      // 3da: imul
      // 3db: aload 23
      // 3dd: invokevirtual java/awt/Color.getBlue ()I
      // 3e0: imul
      // 3e1: istore 25
      // 3e3: new java/lang/StringBuilder
      // 3e6: dup
      // 3e7: invokespecial java/lang/StringBuilder.<init> ()V
      // 3ea: iload 14
      // 3ec: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 3ef: aload 15
      // 3f1: invokevirtual java/awt/Font.getName ()Ljava/lang/String;
      // 3f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f7: ldc_w ""
      // 3fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3fd: aload 15
      // 3ff: invokevirtual java/awt/Font.getStyle ()I
      // 402: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 405: ldc_w ""
      // 408: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 40b: aload 15
      // 40d: invokevirtual java/awt/Font.getSize ()I
      // 410: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 413: iload 25
      // 415: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 418: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 41b: astore 26
      // 41d: iload 10
      // 41f: istore 27
      // 421: bipush 4
      // 422: istore 28
      // 424: aconst_null
      // 425: astore 29
      // 427: getstatic com/finalshell/ui/panel/SetBackgroundImagePanel.J Ljava/util/HashMap;
      // 42a: aload 26
      // 42c: iload 8
      // 42e: ifne 581
      // 431: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
      // 434: ifne 57c
      // 437: goto 43e
      // 43a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43d: athrow
      // 43e: iload 21
      // 440: iload 28
      // 442: bipush 2
      // 443: imul
      // 444: iadd
      // 445: i2f
      // 446: aload 0
      // 447: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.y F
      // 44a: fmul
      // 44b: f2i
      // 44c: iload 22
      // 44e: iload 28
      // 450: bipush 2
      // 451: imul
      // 452: iadd
      // 453: i2f
      // 454: aload 0
      // 455: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.y F
      // 458: fmul
      // 459: f2i
      // 45a: invokestatic com/finalshell/reflect/Registry.packArgs (II)[Ljava/lang/Object;
      // 45d: ldc2_w 401056956354921780
      // 460: astore 48
      // 462: ldc2_w 401056956354921780
      // 465: aload 48
      // 467: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 46a: checkcast java/awt/image/BufferedImage
      // 46d: goto 474
      // 470: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 473: athrow
      // 474: astore 29
      // 476: new com/finalshell/core/XC
      // 479: dup
      // 47a: aload 0
      // 47b: aload 24
      // 47d: aload 15
      // 47f: iload 22
      // 481: iload 28
      // 483: aload 12
      // 485: aload 3
      // 486: iload 27
      // 488: iload 9
      // 48a: invokespecial com/finalshell/core/XC.<init> (Lcom/finalshell/ui/panel/SetBackgroundImagePanel;Ljava/awt/Color;Ljava/awt/Font;IILcom/finalshell/ui/model/J2;Lcom/finalshell/ui/model/J2;II)V
      // 48d: astore 30
      // 48f: aload 29
      // 491: invokevirtual java/awt/image/BufferedImage.createGraphics ()Ljava/awt/Graphics2D;
      // 494: astore 31
      // 496: new com/finalshell/core/Lt4
      // 499: dup
      // 49a: aconst_null
      // 49b: aload 30
      // 49d: invokespecial com/finalshell/core/Lt4.<init> (Ljava/awt/Component;Lcom/finalshell/core/D2;)V
      // 4a0: astore 32
      // 4a2: aload 32
      // 4a4: bipush 1
      // 4a5: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 4a8: ldc2_w 117930650841340028
      // 4ab: astore 51
      // 4ad: astore 50
      // 4af: ldc2_w 117930650841340028
      // 4b2: aload 50
      // 4b4: aload 51
      // 4b6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4b9: pop
      // 4ba: goto 4c1
      // 4bd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4c0: athrow
      // 4c1: aload 32
      // 4c3: aload 31
      // 4c5: aload 0
      // 4c6: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.y F
      // 4c9: aload 29
      // 4cb: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 4ce: aload 29
      // 4d0: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 4d3: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;FII)[Ljava/lang/Object;
      // 4d6: ldc2_w 319180977424850283
      // 4d9: astore 53
      // 4db: astore 52
      // 4dd: ldc2_w 319180977424850283
      // 4e0: aload 52
      // 4e2: aload 53
      // 4e4: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4e7: pop
      // 4e8: goto 4ef
      // 4eb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4ee: athrow
      // 4ef: aload 29
      // 4f1: iload 28
      // 4f3: i2f
      // 4f4: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;F)[Ljava/lang/Object;
      // 4f7: ldc2_w 470093029960713275
      // 4fa: astore 54
      // 4fc: ldc2_w 470093029960713275
      // 4ff: aload 54
      // 501: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 504: checkcast java/awt/image/BufferedImage
      // 507: goto 50e
      // 50a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 50d: athrow
      // 50e: astore 29
      // 510: aload 29
      // 512: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 515: aload 29
      // 517: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 51a: invokestatic com/finalshell/reflect/Registry.packArgs (II)[Ljava/lang/Object;
      // 51d: ldc2_w 401056956354921780
      // 520: astore 56
      // 522: ldc2_w 401056956354921780
      // 525: aload 56
      // 527: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 52a: checkcast java/awt/image/BufferedImage
      // 52d: goto 534
      // 530: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 533: athrow
      // 534: astore 33
      // 536: aload 33
      // 538: invokevirtual java/awt/image/BufferedImage.createGraphics ()Ljava/awt/Graphics2D;
      // 53b: astore 34
      // 53d: bipush 0
      // 53e: istore 35
      // 540: iload 35
      // 542: bipush 4
      // 543: if_icmpge 565
      // 546: aload 34
      // 548: aload 29
      // 54a: bipush 0
      // 54b: bipush 0
      // 54c: aconst_null
      // 54d: invokevirtual java/awt/Graphics2D.drawImage (Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
      // 550: pop
      // 551: iinc 35 1
      // 554: iload 8
      // 556: ifne 579
      // 559: iload 8
      // 55b: ifeq 540
      // 55e: goto 565
      // 561: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 564: athrow
      // 565: aload 34
      // 567: invokevirtual java/awt/Graphics2D.dispose ()V
      // 56a: aload 33
      // 56c: astore 29
      // 56e: getstatic com/finalshell/ui/panel/SetBackgroundImagePanel.J Ljava/util/HashMap;
      // 571: aload 26
      // 573: aload 29
      // 575: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 578: pop
      // 579: goto 589
      // 57c: getstatic com/finalshell/ui/panel/SetBackgroundImagePanel.J Ljava/util/HashMap;
      // 57f: aload 26
      // 581: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 584: checkcast java/awt/image/BufferedImage
      // 587: astore 29
      // 589: aload 5
      // 58b: invokevirtual java/awt/Graphics2D.getTransform ()Ljava/awt/geom/AffineTransform;
      // 58e: astore 30
      // 590: new java/awt/geom/AffineTransform
      // 593: dup
      // 594: dconst_1
      // 595: dconst_0
      // 596: dconst_0
      // 597: dconst_1
      // 598: aload 30
      // 59a: invokevirtual java/awt/geom/AffineTransform.getTranslateX ()D
      // 59d: aload 30
      // 59f: invokevirtual java/awt/geom/AffineTransform.getTranslateY ()D
      // 5a2: invokespecial java/awt/geom/AffineTransform.<init> (DDDDDD)V
      // 5a5: astore 31
      // 5a7: aload 5
      // 5a9: aload 31
      // 5ab: invokevirtual java/awt/Graphics2D.setTransform (Ljava/awt/geom/AffineTransform;)V
      // 5ae: aload 5
      // 5b0: aload 29
      // 5b2: iload 18
      // 5b4: iload 28
      // 5b6: isub
      // 5b7: i2f
      // 5b8: aload 0
      // 5b9: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.y F
      // 5bc: fmul
      // 5bd: f2i
      // 5be: iload 17
      // 5c0: iload 22
      // 5c2: isub
      // 5c3: iload 28
      // 5c5: isub
      // 5c6: i2f
      // 5c7: aload 0
      // 5c8: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.y F
      // 5cb: fmul
      // 5cc: f2i
      // 5cd: aconst_null
      // 5ce: invokevirtual java/awt/Graphics2D.drawImage (Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
      // 5d1: pop
      // 5d2: new java/awt/geom/AffineTransform
      // 5d5: dup
      // 5d6: aload 0
      // 5d7: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.y F
      // 5da: f2d
      // 5db: dconst_0
      // 5dc: dconst_0
      // 5dd: aload 0
      // 5de: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.y F
      // 5e1: f2d
      // 5e2: aload 30
      // 5e4: invokevirtual java/awt/geom/AffineTransform.getTranslateX ()D
      // 5e7: aload 30
      // 5e9: invokevirtual java/awt/geom/AffineTransform.getTranslateY ()D
      // 5ec: invokespecial java/awt/geom/AffineTransform.<init> (DDDDDD)V
      // 5ef: astore 32
      // 5f1: aload 5
      // 5f3: aload 32
      // 5f5: invokevirtual java/awt/Graphics2D.setTransform (Ljava/awt/geom/AffineTransform;)V
      // 5f8: aload 5
      // 5fa: aload 19
      // 5fc: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 5ff: iload 14
      // 601: sipush 17162
      // 604: ldc2_w 6332241477127166453
      // 607: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 60a: iload 8
      // 60c: ifne 63f
      // 60f: if_icmpeq 634
      // 612: goto 619
      // 615: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 618: athrow
      // 619: iload 18
      // 61b: istore 19
      // 61d: aload 5
      // 61f: aload 12
      // 621: invokevirtual com/finalshell/ui/model/J2.r ()[C
      // 624: aload 3
      // 625: invokevirtual com/finalshell/ui/model/J2.o ()I
      // 628: iload 10
      // 62a: iadd
      // 62b: iload 9
      // 62d: iload 19
      // 62f: iload 17
      // 631: invokevirtual java/awt/Graphics2D.drawChars ([CIIII)V
      // 634: iload 11
      // 636: iload 9
      // 638: iadd
      // 639: istore 11
      // 63b: iload 10
      // 63d: iload 9
      // 63f: iadd
      // 640: istore 10
      // 642: iload 8
      // 644: ifeq 1a7
      // 647: aload 5
      // 649: aconst_null
      // 64a: invokevirtual java/awt/Graphics2D.setClip (Ljava/awt/Shape;)V
      // 64d: return
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
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: istore 1
      // 04: iload 0
      // 05: sipush 22270
      // 08: ldc2_w 4742328348634565651
      // 0b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 0e: iload 1
      // 0f: ifne 38
      // 12: if_icmplt 3f
      // 15: goto 1c
      // 18: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: iload 0
      // 1d: iload 1
      // 1e: ifne 3c
      // 21: goto 28
      // 24: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: sipush 29844
      // 2b: ldc2_w 6503920570390933088
      // 2e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 31: goto 38
      // 34: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: if_icmpgt 3f
      // 3b: bipush 1
      // 3c: goto 40
      // 3f: bipush 0
      // 40: ireturn
   }

   public Font q(char param1, YP param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.d Lcom/finalshell/core/K3;
      // 004: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 007: ldc2_w 570146297653439641
      // 00a: astore 18
      // 00c: astore 17
      // 00e: ldc2_w 570146297653439641
      // 011: aload 17
      // 013: aload 18
      // 015: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 018: checkcast com/finalshell/core/Um4
      // 01b: goto 022
      // 01e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 021: athrow
      // 022: astore 4
      // 024: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 027: aload 0
      // 028: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.d Lcom/finalshell/core/K3;
      // 02b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 02e: ldc2_w 381284008132314530
      // 031: astore 20
      // 033: astore 19
      // 035: ldc2_w 381284008132314530
      // 038: aload 19
      // 03a: aload 20
      // 03c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 03f: checkcast com/finalshell/core/Um4
      // 042: goto 049
      // 045: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 048: athrow
      // 049: astore 5
      // 04b: istore 3
      // 04c: aload 0
      // 04d: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.d Lcom/finalshell/core/K3;
      // 050: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 053: ldc2_w 483859120374051683
      // 056: astore 22
      // 058: astore 21
      // 05a: ldc2_w 483859120374051683
      // 05d: aload 21
      // 05f: aload 22
      // 061: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 064: checkcast com/finalshell/core/Um4
      // 067: goto 06e
      // 06a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: astore 6
      // 070: aconst_null
      // 071: astore 7
      // 073: aconst_null
      // 074: astore 8
      // 076: bipush 0
      // 077: istore 9
      // 079: iload 1
      // 07a: istore 10
      // 07c: aload 4
      // 07e: iload 3
      // 07f: ifeq 0b7
      // 082: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 085: ldc2_w 439979510325483015
      // 088: astore 24
      // 08a: astore 23
      // 08c: ldc2_w 439979510325483015
      // 08f: aload 23
      // 091: aload 24
      // 093: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 096: checkcast java/awt/Font
      // 099: goto 0a0
      // 09c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 09f: athrow
      // 0a0: iload 1
      // 0a1: invokevirtual java/awt/Font.canDisplay (C)Z
      // 0a4: ifeq 0b5
      // 0a7: goto 0ae
      // 0aa: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ad: athrow
      // 0ae: aload 4
      // 0b0: astore 7
      // 0b2: goto 0b9
      // 0b5: aload 6
      // 0b7: astore 7
      // 0b9: iload 1
      // 0ba: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.B (C)Z
      // 0bd: iload 3
      // 0be: ifeq 109
      // 0c1: ifeq 108
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ca: athrow
      // 0cb: aload 5
      // 0cd: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0d0: ldc2_w 439979510325483015
      // 0d3: astore 26
      // 0d5: astore 25
      // 0d7: ldc2_w 439979510325483015
      // 0da: aload 25
      // 0dc: aload 26
      // 0de: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0e1: checkcast java/awt/Font
      // 0e4: goto 0eb
      // 0e7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ea: athrow
      // 0eb: iload 1
      // 0ec: invokevirtual java/awt/Font.canDisplay (C)Z
      // 0ef: iload 3
      // 0f0: ifeq 109
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f9: athrow
      // 0fa: ifeq 108
      // 0fd: goto 104
      // 100: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 103: athrow
      // 104: aload 5
      // 106: astore 7
      // 108: iload 1
      // 109: iload 3
      // 10a: ifeq 128
      // 10d: sipush 21066
      // 110: ldc2_w 5011282699961747627
      // 113: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 116: if_icmpne 12e
      // 119: goto 120
      // 11c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11f: athrow
      // 120: bipush 0
      // 121: goto 128
      // 124: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 127: athrow
      // 128: istore 9
      // 12a: aload 6
      // 12c: astore 7
      // 12e: aconst_null
      // 12f: astore 11
      // 131: aconst_null
      // 132: astore 12
      // 134: aconst_null
      // 135: astore 13
      // 137: aconst_null
      // 138: astore 14
      // 13a: iload 9
      // 13c: ifeq 1ca
      // 13f: aload 4
      // 141: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 144: ldc2_w 141793837555606825
      // 147: astore 28
      // 149: astore 27
      // 14b: ldc2_w 141793837555606825
      // 14e: aload 27
      // 150: aload 28
      // 152: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 155: checkcast java/awt/Font
      // 158: goto 15f
      // 15b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 15e: athrow
      // 15f: astore 11
      // 161: aload 4
      // 163: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 166: ldc2_w 141793837555606825
      // 169: astore 30
      // 16b: astore 29
      // 16d: ldc2_w 141793837555606825
      // 170: aload 29
      // 172: aload 30
      // 174: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 177: checkcast java/awt/Font
      // 17a: goto 181
      // 17d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 180: athrow
      // 181: astore 12
      // 183: aload 4
      // 185: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 188: ldc2_w 141793837555606825
      // 18b: astore 32
      // 18d: astore 31
      // 18f: ldc2_w 141793837555606825
      // 192: aload 31
      // 194: aload 32
      // 196: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 199: checkcast java/awt/Font
      // 19c: goto 1a3
      // 19f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1a2: athrow
      // 1a3: astore 13
      // 1a5: aload 4
      // 1a7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1aa: ldc2_w 141793837555606825
      // 1ad: astore 34
      // 1af: astore 33
      // 1b1: ldc2_w 141793837555606825
      // 1b4: aload 33
      // 1b6: aload 34
      // 1b8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1bb: checkcast java/awt/Font
      // 1be: goto 1c5
      // 1c1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c4: athrow
      // 1c5: astore 14
      // 1c7: goto 252
      // 1ca: aload 7
      // 1cc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1cf: ldc2_w 439979510325483015
      // 1d2: astore 36
      // 1d4: astore 35
      // 1d6: ldc2_w 439979510325483015
      // 1d9: aload 35
      // 1db: aload 36
      // 1dd: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e0: checkcast java/awt/Font
      // 1e3: goto 1ea
      // 1e6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e9: athrow
      // 1ea: astore 11
      // 1ec: aload 7
      // 1ee: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1f1: ldc2_w 419129657143452339
      // 1f4: astore 38
      // 1f6: astore 37
      // 1f8: ldc2_w 419129657143452339
      // 1fb: aload 37
      // 1fd: aload 38
      // 1ff: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 202: checkcast java/awt/Font
      // 205: goto 20c
      // 208: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 20b: athrow
      // 20c: astore 12
      // 20e: aload 7
      // 210: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 213: ldc2_w 623013086778579706
      // 216: astore 40
      // 218: astore 39
      // 21a: ldc2_w 623013086778579706
      // 21d: aload 39
      // 21f: aload 40
      // 221: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 224: checkcast java/awt/Font
      // 227: goto 22e
      // 22a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 22d: athrow
      // 22e: astore 13
      // 230: aload 7
      // 232: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 235: ldc2_w 185524484641884370
      // 238: astore 42
      // 23a: astore 41
      // 23c: ldc2_w 185524484641884370
      // 23f: aload 41
      // 241: aload 42
      // 243: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 246: checkcast java/awt/Font
      // 249: goto 250
      // 24c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 24f: athrow
      // 250: astore 14
      // 252: aload 2
      // 253: getstatic com/finalshell/ui/model/SY.BOLD Lcom/finalshell/ui/model/SY;
      // 256: invokevirtual com/finalshell/core/YP.v (Lcom/finalshell/ui/model/SY;)Z
      // 259: istore 15
      // 25b: aload 2
      // 25c: getstatic com/finalshell/ui/model/SY.ITALIC Lcom/finalshell/ui/model/SY;
      // 25f: invokevirtual com/finalshell/core/YP.v (Lcom/finalshell/ui/model/SY;)Z
      // 262: istore 16
      // 264: iload 15
      // 266: iload 3
      // 267: ifeq 28c
      // 26a: ifeq 28a
      // 26d: goto 274
      // 270: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 273: athrow
      // 274: iload 16
      // 276: ifeq 287
      // 279: goto 280
      // 27c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27f: athrow
      // 280: aload 14
      // 282: areturn
      // 283: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 286: athrow
      // 287: aload 12
      // 289: areturn
      // 28a: iload 16
      // 28c: ifeq 296
      // 28f: aload 13
      // 291: areturn
      // 292: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 295: athrow
      // 296: aload 11
      // 298: areturn
   }

   public static int P(char[] param0, int param1, int param2) {
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
      // 03: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
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
      // 1f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: sipush 15592
      // 26: ldc2_w 5014524581788788246
      // 29: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 2c: if_icmpeq 48
      // 2f: goto 36
      // 32: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: aload 0
      // 37: iload 4
      // 39: iinc 4 1
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      // 59: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 5c: invokestatic java/util/Arrays.fill ([CIIC)V
      // 5f: iload 4
      // 61: ireturn
   }

   public static int C(char[] param0, @NotNull BreakIterator param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 2
      // 07: iload 3
      // 08: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.g ([CII)Z
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
      // 24: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: if_icmpne 3e
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: iload 4
      // 34: ifne 8f
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: iload 5
      // 40: iload 3
      // 41: isub
      // 42: iload 4
      // 44: ifeq 89
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: bipush 1
      // 4f: goto 56
      // 52: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: if_icmpne 85
      // 59: aload 0
      // 5a: iload 3
      // 5b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.z ([CI)Z
      // 5e: iload 4
      // 60: ifeq 89
      // 63: goto 6a
      // 66: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69: athrow
      // 6a: ifne 85
      // 6d: goto 74
      // 70: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73: athrow
      // 74: aload 1
      // 75: invokevirtual java/text/BreakIterator.previous ()I
      // 78: pop
      // 79: iload 4
      // 7b: ifne 8f
      // 7e: goto 85
      // 81: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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

   public static boolean g(char[] param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: istore 3
      // 04: iload 2
      // 05: iload 1
      // 06: isub
      // 07: iload 3
      // 08: ifeq 22
      // 0b: bipush 1
      // 0c: if_icmple 1c
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: bipush 1
      // 17: ireturn
      // 18: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: iload 1
      // 1e: iload 2
      // 1f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.T ([CII)Z
      // 22: iload 3
      // 23: ifeq 37
      // 26: ifeq 36
      // 29: goto 30
      // 2c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: bipush 1
      // 31: ireturn
      // 32: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: iload 2
      // 37: aload 0
      // 38: arraylength
      // 39: iload 3
      // 3a: ifeq 65
      // 3d: if_icmpge 6c
      // 40: goto 47
      // 43: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: aload 0
      // 48: iload 2
      // 49: caload
      // 4a: iload 3
      // 4b: ifeq 69
      // 4e: goto 55
      // 51: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: sipush 29388
      // 58: ldc2_w 6863381746941913136
      // 5b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 5e: goto 65
      // 61: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: if_icmpne 6c
      // 68: bipush 1
      // 69: goto 6d
      // 6c: bipush 0
      // 6d: ireturn
   }

   public static boolean z(char[] param0, int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 1
      // 06: iload 1
      // 07: bipush 1
      // 08: iadd
      // 09: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.T ([CII)Z
      // 0c: iload 2
      // 0d: ifne 23
      // 10: ifeq 20
      // 13: goto 1a
      // 16: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: bipush 1
      // 1b: ireturn
      // 1c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: iload 1
      // 22: caload
      // 23: iload 2
      // 24: ifne 43
      // 27: sipush 15592
      // 2a: ldc2_w 5014524581788788246
      // 2d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 30: if_icmpne 40
      // 33: goto 3a
      // 36: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: bipush 1
      // 3b: ireturn
      // 3c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      // 53: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56: athrow
      // 57: bipush 1
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: goto 63
      // 62: bipush 0
      // 63: ireturn
   }

   public static boolean T(char[] param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: istore 3
      // 04: iload 2
      // 05: iload 1
      // 06: isub
      // 07: iload 3
      // 08: ifne de
      // 0b: bipush 1
      // 0c: if_icmpne dd
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      // 27: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 2a: if_icmplt dd
      // 2d: goto 34
      // 30: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: iload 4
      // 36: iload 3
      // 37: ifne dc
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: sipush 16451
      // 44: ldc2_w 1099435533531568775
      // 47: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 4a: if_icmple d4
      // 4d: goto 54
      // 50: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: iload 4
      // 56: sipush 10783
      // 59: ldc2_w 1332219417578647807
      // 5c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 5f: iload 3
      // 60: ifne b1
      // 63: goto 6a
      // 66: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69: athrow
      // 6a: if_icmplt 94
      // 6d: goto 74
      // 70: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73: athrow
      // 74: iload 4
      // 76: iload 3
      // 77: ifne dc
      // 7a: goto 81
      // 7d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80: athrow
      // 81: sipush 3208
      // 84: ldc2_w 8849915831524169288
      // 87: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 8a: if_icmple d4
      // 8d: goto 94
      // 90: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 93: athrow
      // 94: iload 4
      // 96: iload 3
      // 97: ifne de
      // 9a: goto a1
      // 9d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a0: athrow
      // a1: sipush 9989
      // a4: ldc2_w 5082574847427919325
      // a7: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // aa: goto b1
      // ad: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b0: athrow
      // b1: if_icmplt dd
      // b4: iload 4
      // b6: iload 3
      // b7: ifne de
      // ba: goto c1
      // bd: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c0: athrow
      // c1: sipush 8697
      // c4: ldc2_w 3217464807087094578
      // c7: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // ca: if_icmpgt dd
      // cd: goto d4
      // d0: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d3: athrow
      // d4: bipush 1
      // d5: goto dc
      // d8: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // db: athrow
      // dc: ireturn
      // dd: bipush 0
      // de: ireturn
   }

   @NotNull
   public Color p(@NotNull YP var1) {
      Color var2 = this.s(this.cY.A(var1.O()));
      if (var1.v(SY.DIM)) {
         Color var3 = this.r(this.cY.R(var1.Z()));
         var2 = new Color((var2.getRed() + var3.getRed()) / 2, (var2.getGreen() + var3.getGreen()) / 2, (var2.getBlue() + var3.getBlue()) / 2, var2.getAlpha());
      }

      return var2;
   }

   @NotNull
   public Font h(char[] param1, int param2, int param3, @NotNull YP param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: aload 4
      // 05: getstatic com/finalshell/ui/model/SY.BOLD Lcom/finalshell/ui/model/SY;
      // 08: invokevirtual com/finalshell/core/YP.v (Lcom/finalshell/ui/model/SY;)Z
      // 0b: istore 6
      // 0d: istore 5
      // 0f: aload 4
      // 11: getstatic com/finalshell/ui/model/SY.ITALIC Lcom/finalshell/ui/model/SY;
      // 14: invokevirtual com/finalshell/core/YP.v (Lcom/finalshell/ui/model/SY;)Z
      // 17: istore 7
      // 19: iload 6
      // 1b: iload 5
      // 1d: ifeq 70
      // 20: ifeq 6e
      // 23: goto 2a
      // 26: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.t Lcom/finalshell/core/Rx4;
      // 2e: invokeinterface com/finalshell/core/Rx4.s ()Z 1
      // 33: iload 5
      // 35: ifeq 70
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: ifeq 6e
      // 42: goto 49
      // 45: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48: athrow
      // 49: aload 1
      // 4a: iload 2
      // 4b: caload
      // 4c: invokestatic com/finalshell/core/XP.U (C)Z
      // 4f: iload 5
      // 51: ifeq 70
      // 54: goto 5b
      // 57: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: ifeq 6e
      // 5e: goto 65
      // 61: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: aload 0
      // 66: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c_ Ljava/awt/Font;
      // 69: areturn
      // 6a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d: athrow
      // 6e: iload 6
      // 70: iload 5
      // 72: ifeq 9f
      // 75: ifeq 9d
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: iload 7
      // 81: ifeq 96
      // 84: goto 8b
      // 87: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8a: athrow
      // 8b: aload 0
      // 8c: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.Z Ljava/awt/Font;
      // 8f: goto b1
      // 92: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 95: athrow
      // 96: aload 0
      // 97: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cL Ljava/awt/Font;
      // 9a: goto b1
      // 9d: iload 7
      // 9f: ifeq ad
      // a2: aload 0
      // a3: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.ck Ljava/awt/Font;
      // a6: goto b1
      // a9: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ac: athrow
      // ad: aload 0
      // ae: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c_ Ljava/awt/Font;
      // b1: areturn
   }

   public S3 R$S3() {
      Object[] var7;
      Registry.emptyArgs();
      long var1 = 270389152141252877L;
      Ref.h2(270389152141252877L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 399585344452154517L;
      Object[] var3 = var10002;
      Ref.h(399585344452154517L, var3, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 149968465491171480L;
      Object[] var5 = var10003;
      Ref.h(149968465491171480L, var5, var6);
      Object var10004 = Registry.emptyArgs();
      long var8 = 371660004622157698L;
      var7 = var10004;
      var10004 = Ref.h(371660004622157698L, var7, var8);

      try {
         return (S3)var10004;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   public void D(Graphics2D var1, int var2, int var3) {
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
      int var10000 = ConnectionProperty.M$int();
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
            Nt2 var4 = new Nt2(this, var2, var3);
            this.V.P(var4);
            this.i.addChangeListener(new Ly4(this, var4));
            var8 = false;
         }
      } finally {
         if (var8) {
            this.V.h$void();
         }
      }

      this.V.h$void();
   }

   public void l(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: aload 0
      // 04: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.D Ljava/util/concurrent/atomic/AtomicInteger;
      // 07: bipush 0
      // 08: invokevirtual java/util/concurrent/atomic/AtomicInteger.getAndSet (I)I
      // 0b: istore 3
      // 0c: istore 2
      // 0d: iload 3
      // 0e: iload 2
      // 0f: ifne 42
      // 12: ifne 33
      // 15: goto 1c
      // 18: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: iload 1
      // 1d: iload 2
      // 1e: ifne 42
      // 21: goto 28
      // 24: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: ifne 33
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: return
      // 33: aload 0
      // 34: iload 2
      // 35: ifne d2
      // 38: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.X Z
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: ifeq ca
      // 45: aload 0
      // 46: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.i Ljavax/swing/BoundedRangeModel;
      // 49: invokeinterface javax/swing/BoundedRangeModel.getValue ()I 1
      // 4e: istore 4
      // 50: aload 0
      // 51: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 54: invokevirtual com/finalshell/core/Im4.H ()I
      // 57: istore 5
      // 59: iload 2
      // 5a: ifne 8c
      // 5d: iload 4
      // 5f: ifne 90
      // 62: goto 69
      // 65: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68: athrow
      // 69: aload 0
      // 6a: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.i Ljavax/swing/BoundedRangeModel;
      // 6d: bipush 0
      // 6e: aload 0
      // 6f: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.N Lcom/finalshell/core/OT;
      // 72: invokevirtual com/finalshell/core/OT.c ()I
      // 75: iload 5
      // 77: ineg
      // 78: aload 0
      // 79: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.N Lcom/finalshell/core/OT;
      // 7c: invokevirtual com/finalshell/core/OT.c ()I
      // 7f: bipush 0
      // 80: invokeinterface javax/swing/BoundedRangeModel.setRangeProperties (IIIIZ)V 6
      // 85: goto 8c
      // 88: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8b: athrow
      // 8c: iload 2
      // 8d: ifeq c6
      // 90: aload 0
      // 91: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.i Ljavax/swing/BoundedRangeModel;
      // 94: iload 4
      // 96: iload 3
      // 97: iadd
      // 98: iload 5
      // 9a: ineg
      // 9b: invokestatic java/lang/Math.max (II)I
      // 9e: aload 0
      // 9f: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.N Lcom/finalshell/core/OT;
      // a2: invokevirtual com/finalshell/core/OT.c ()I
      // a5: invokestatic java/lang/Math.min (II)I
      // a8: aload 0
      // a9: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.N Lcom/finalshell/core/OT;
      // ac: invokevirtual com/finalshell/core/OT.c ()I
      // af: iload 5
      // b1: ineg
      // b2: aload 0
      // b3: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.N Lcom/finalshell/core/OT;
      // b6: invokevirtual com/finalshell/core/OT.c ()I
      // b9: bipush 0
      // ba: invokeinterface javax/swing/BoundedRangeModel.setRangeProperties (IIIIZ)V 6
      // bf: goto c6
      // c2: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c5: athrow
      // c6: iload 2
      // c7: ifeq eb
      // ca: aload 0
      // cb: goto d2
      // ce: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d1: athrow
      // d2: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.i Ljavax/swing/BoundedRangeModel;
      // d5: bipush 0
      // d6: aload 0
      // d7: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.N Lcom/finalshell/core/OT;
      // da: invokevirtual com/finalshell/core/OT.c ()I
      // dd: bipush 0
      // de: aload 0
      // df: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.N Lcom/finalshell/core/OT;
      // e2: invokevirtual com/finalshell/core/OT.c ()I
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
   public void e(RP3 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: aload 0
      // 04: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.w Lcom/finalshell/core/D__2;
      // 07: aload 1
      // 08: invokevirtual com/finalshell/core/D__2.p (Lcom/finalshell/ui/model/RP3;)V
      // 0b: istore 2
      // 0c: getstatic com/finalshell/core/O92.Q [I
      // 0f: aload 1
      // 10: invokevirtual com/finalshell/ui/model/RP3.ordinal ()I
      // 13: iaload
      // 14: iload 2
      // 15: ifeq 53
      // 18: tableswitch 80 1 6 64 44 64 44 64 44
      // 40: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: aload 0
      // 45: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.w Lcom/finalshell/core/D__2;
      // 48: bipush 0
      // 49: invokestatic com/finalshell/core/D__2.p (Lcom/finalshell/core/D__2;Z)Z
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: pop
      // 54: iload 2
      // 55: ifne 68
      // 58: aload 0
      // 59: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.w Lcom/finalshell/core/D__2;
      // 5c: bipush 1
      // 5d: invokestatic com/finalshell/core/D__2.p (Lcom/finalshell/core/D__2;Z)Z
      // 60: pop
      // 61: goto 68
      // 64: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67: athrow
      // 68: return
   }

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
   public Rectangle u(@NotNull Bs2_2 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: aload 1
      // 04: invokevirtual com/finalshell/core/Bs2_2.A ()Lcom/finalshell/core/DC3;
      // 07: astore 3
      // 08: istore 2
      // 09: aload 0
      // 0a: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 0d: aload 3
      // 0e: invokevirtual com/finalshell/core/Im4.R (Lcom/finalshell/core/DC3;)I
      // 11: istore 4
      // 13: iload 4
      // 15: iload 2
      // 16: ifne 2e
      // 19: iflt 4d
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: aload 1
      // 24: invokevirtual com/finalshell/core/Bs2_2.L ()Z
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: ifne 4d
      // 31: aload 0
      // 32: new com/finalshell/core/Ws2
      // 35: dup
      // 36: iload 4
      // 38: aload 1
      // 39: invokevirtual com/finalshell/core/Bs2_2.m ()I
      // 3c: aload 1
      // 3d: invokevirtual com/finalshell/core/Bs2_2.r ()I
      // 40: bipush 1
      // 41: iadd
      // 42: invokespecial com/finalshell/core/Ws2.<init> (III)V
      // 45: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.C (Lcom/finalshell/core/Ws2;)Ljava/awt/Rectangle;
      // 48: areturn
      // 49: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: aconst_null
      // 4e: areturn
   }

   @NotNull
   public Rectangle C(@NotNull com.finalshell.core.Ws2 var1) {
      Point var2 = new Point(var1.I() * this.c4.width + this.p$int(), var1.k() * this.c4.height);
      return new Rectangle(var2, new Dimension(this.c4.width * var1.j(), this.c4.height));
   }

   @Deprecated
   public BoundedRangeModel B() {
      return this.i;
   }

   @NotNull
   public BoundedRangeModel u$BoundedRangeModel() {
      return this.i;
   }

   public Im4 H$im_4() {
      return this.V;
   }

   public RU3 f$rU_3() {
      return this.u;
   }

   public boolean H$boolean() {
      return this.t.L();
   }

   @Override
   public void z(boolean var1) {
      this.r = var1;
   }

   public Ua2 k$ua_2() {
      return this.V.x();
   }

   @Override
   public void G(boolean var1) {
      this.w.d(var1);
   }

   @NotNull
   public JPopupMenu S(@NotNull CS3_2 var1) {
      JPopupMenu var2 = new JPopupMenu();
      AD_2.m(var2, var1);
      return var2;
   }

   @NotNull
   public CS3_2 A(@Nullable YA3 var1, @NotNull MouseEvent var2) {
      Ca4_2 var3 = YO3.G(var1);

      try {
         return (CS3_2)(var3 != null ? new Gj2(this, var3, var2) : this);
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

   public D__2 O() {
      return this.w;
   }

   public PD3 n$pD_3() {
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
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: aload 0
      // 04: aload 1
      // 05: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.j Ljava/lang/String;
      // 08: istore 2
      // 09: aload 0
      // 0a: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c Lcom/finalshell/core/Xn4;
      // 0d: iload 2
      // 0e: ifne 26
      // 11: ifnull 2f
      // 14: goto 1b
      // 17: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.c Lcom/finalshell/core/Xn4;
      // 1f: goto 26
      // 22: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 0
      // 27: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.j Ljava/lang/String;
      // 2a: invokeinterface com/finalshell/core/Xn4.z (Ljava/lang/String;)V 2
      // 2f: return
   }

   public List n$List() {
      return List.of(
         new AD_2(this.t.V(), this::lambda$getActions$8).c(this::L$Boolean),
         new AR(this, this.t.f(), this::r).u(Integer.valueOf(a(20337, 7489253290795128302L))),
         new AD_2(this.t.y(), this::lambda$getActions$9).u(a(25435, 3457714252384172427L)).c(this::lambda$getActions$10),
         new AD_2(this.t.Z(), this::lambda$getActions$11),
         new AD_2(this.t.J(), this::lambda$getActions$12).u(a(21323, 3818715481401969031L)).c(this::lambda$getActions$13).P(true),
         new AD_2(this.t.z(), this::lambda$getActions$14).c(this::lambda$getActions$15).P(true),
         new AD_2(this.t.m(), this::lambda$getActions$16).c(this::lambda$getActions$17),
         new AD_2(this.t.K(), this::lambda$getActions$18).c(this::lambda$getActions$19).P(true),
         new AD_2(this.t.H(), this::lambda$getActions$20)
      );
   }

   public void E$void() {
      this.u = new RU3(new XE(0, -this.V.H()), new XE(this.N.R(), this.V.k()));
   }

   @NotNull
   public Boolean L$Boolean() {
      String var1 = this.l$String();
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
   public String l$String() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.u Lcom/finalshell/core/RU3;
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifnull 74
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.u Lcom/finalshell/core/RU3;
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 0
      // 22: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.N Lcom/finalshell/core/OT;
      // 25: invokevirtual com/finalshell/core/OT.R ()I
      // 28: invokevirtual com/finalshell/core/RU3.K (I)Lcom/finalshell/core/KB;
      // 2b: astore 2
      // 2c: aload 2
      // 2d: getfield com/finalshell/core/KB.X Ljava/lang/Object;
      // 30: iload 1
      // 31: ifeq 62
      // 34: ifnonnull 57
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: aload 2
      // 3f: getfield com/finalshell/core/KB.S Ljava/lang/Object;
      // 42: iload 1
      // 43: ifeq 62
      // 46: goto 4d
      // 49: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: ifnull 74
      // 50: goto 57
      // 53: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56: athrow
      // 57: aload 2
      // 58: getfield com/finalshell/core/KB.X Ljava/lang/Object;
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: checkcast com/finalshell/core/XE
      // 65: aload 2
      // 66: getfield com/finalshell/core/KB.S Ljava/lang/Object;
      // 69: checkcast com/finalshell/core/XE
      // 6c: aload 0
      // 6d: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 70: invokestatic com/finalshell/core/A7.v (Lcom/finalshell/core/XE;Lcom/finalshell/core/XE;Lcom/finalshell/core/Im4;)Ljava/lang/String;
      // 73: areturn
      // 74: aconst_null
      // 75: areturn
   }

   public boolean C$boolean() {
      int var1 = ConnectionProperty.y();

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
         String var2 = this.l$String();

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

   public void X(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 08: iload 2
      // 09: ifeq 24
      // 0c: invokevirtual com/finalshell/core/Im4.T$boolean ()Z
      // 0f: ifne f3
      // 12: goto 19
      // 15: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 1d: goto 24
      // 20: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: invokevirtual com/finalshell/core/Im4.c$void ()V
      // 27: aload 0
      // 28: iload 2
      // 29: ifeq e7
      // 2c: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cE Lcom/finalshell/core/Ab2;
      // 2f: ifnull d7
      // 32: goto 39
      // 35: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: iload 1
      // 3a: iload 2
      // 3b: ifeq 6a
      // 3e: goto 45
      // 41: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: ifeq a5
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: aload 0
      // 50: iload 2
      // 51: ifeq e7
      // 54: goto 5b
      // 57: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cE Lcom/finalshell/core/Ab2;
      // 5e: invokeinterface com/finalshell/core/Ab2.I ()I 1
      // 63: goto 6a
      // 66: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69: athrow
      // 6a: ifle d7
      // 6d: aload 0
      // 6e: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 71: aload 0
      // 72: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cE Lcom/finalshell/core/Ab2;
      // 75: invokeinterface com/finalshell/core/Ab2.I ()I 1
      // 7a: bipush 1
      // 7b: isub
      // 7c: invokevirtual com/finalshell/core/Im4.D (I)Lcom/finalshell/core/DC3;
      // 7f: astore 3
      // 80: aload 0
      // 81: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 84: invokevirtual com/finalshell/core/Im4.W$void ()V
      // 87: aload 0
      // 88: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cE Lcom/finalshell/core/Ab2;
      // 8b: bipush 0
      // 8c: invokeinterface com/finalshell/core/Ab2.q (I)V 2
      // 91: aload 0
      // 92: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.w Lcom/finalshell/core/D__2;
      // 95: bipush 1
      // 96: invokevirtual com/finalshell/core/D__2.J (I)V
      // 99: aload 0
      // 9a: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 9d: aload 3
      // 9e: invokevirtual com/finalshell/core/Im4.j (Lcom/finalshell/core/DC3;)V
      // a1: iload 2
      // a2: ifne d7
      // a5: aload 0
      // a6: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // a9: invokevirtual com/finalshell/core/Im4.W$void ()V
      // ac: aload 0
      // ad: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cE Lcom/finalshell/core/Ab2;
      // b0: bipush 0
      // b1: invokeinterface com/finalshell/core/Ab2.i (I)V 2
      // b6: aload 0
      // b7: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cE Lcom/finalshell/core/Ab2;
      // ba: bipush 1
      // bb: invokeinterface com/finalshell/core/Ab2.q (I)V 2
      // c0: aload 0
      // c1: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.w Lcom/finalshell/core/D__2;
      // c4: bipush 0
      // c5: invokevirtual com/finalshell/core/D__2.z (I)V
      // c8: aload 0
      // c9: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.w Lcom/finalshell/core/D__2;
      // cc: bipush 1
      // cd: invokevirtual com/finalshell/core/D__2.J (I)V
      // d0: goto d7
      // d3: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d6: athrow
      // d7: aload 0
      // d8: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.i Ljavax/swing/BoundedRangeModel;
      // db: bipush 0
      // dc: invokeinterface javax/swing/BoundedRangeModel.setValue (I)V 2
      // e1: aload 0
      // e2: bipush 1
      // e3: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.l (Z)V
      // e6: aload 0
      // e7: aload 0
      // e8: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.i Ljavax/swing/BoundedRangeModel;
      // eb: invokeinterface javax/swing/BoundedRangeModel.getValue ()I 1
      // f0: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.P I
      // f3: return
   }

   public CS3_2 c$cS_3() {
      return this.R;
   }

   @Override
   public void Y(CS3_2 var1) {
      this.R = var1;
   }

   public boolean u(KeyEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 003: istore 2
      // 004: aload 0
      // 005: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.e$boolean ()Z
      // 008: iload 2
      // 009: ifne 020
      // 00c: ifeq 01c
      // 00f: goto 016
      // 012: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: bipush 0
      // 017: ireturn
      // 018: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 1
      // 01d: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 020: istore 3
      // 021: aload 1
      // 022: invokevirtual java/awt/event/KeyEvent.getKeyChar ()C
      // 025: istore 4
      // 027: aload 0
      // 028: aload 1
      // 029: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.cr Ljava/awt/event/KeyEvent;
      // 02c: iload 3
      // 02d: sipush 14606
      // 030: ldc2_w 7639814560544170960
      // 033: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 036: iload 2
      // 037: ifne 088
      // 03a: if_icmpne 07d
      // 03d: goto 044
      // 040: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 043: athrow
      // 044: iload 4
      // 046: sipush 8389
      // 049: ldc2_w 6054907174772357660
      // 04c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 04f: iload 2
      // 050: ifne 088
      // 053: goto 05a
      // 056: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: if_icmpne 07d
      // 05d: goto 064
      // 060: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: aload 0
      // 065: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cc Lcom/finalshell/core/E0;
      // 068: bipush 1
      // 069: newarray 8
      // 06b: dup
      // 06c: bipush 0
      // 06d: sipush 28490
      // 070: ldc2_w 2987198948788467087
      // 073: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 076: bastore
      // 077: bipush 1
      // 078: invokevirtual com/finalshell/core/E0.L ([BZ)V
      // 07b: bipush 1
      // 07c: ireturn
      // 07d: iload 4
      // 07f: sipush 17162
      // 082: ldc2_w 6332241477127166453
      // 085: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 088: iload 2
      // 089: ifne 0aa
      // 08c: if_icmpne 0d1
      // 08f: goto 096
      // 092: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 095: athrow
      // 096: aload 1
      // 097: invokevirtual java/awt/event/KeyEvent.getModifiersEx ()I
      // 09a: sipush 10243
      // 09d: ldc2_w 1355689121900311257
      // 0a0: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 0a3: goto 0aa
      // 0a6: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a9: athrow
      // 0aa: iand
      // 0ab: iload 2
      // 0ac: ifne 0d0
      // 0af: ifeq 0d1
      // 0b2: goto 0b9
      // 0b5: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b8: athrow
      // 0b9: aload 0
      // 0ba: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cc Lcom/finalshell/core/E0;
      // 0bd: bipush 1
      // 0be: newarray 8
      // 0c0: dup
      // 0c1: bipush 0
      // 0c2: bipush 0
      // 0c3: bastore
      // 0c4: bipush 1
      // 0c5: invokevirtual com/finalshell/core/E0.L ([BZ)V
      // 0c8: bipush 1
      // 0c9: goto 0d0
      // 0cc: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cf: athrow
      // 0d0: ireturn
      // 0d1: aload 0
      // 0d2: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cc Lcom/finalshell/core/E0;
      // 0d5: iload 3
      // 0d6: aload 1
      // 0d7: invokevirtual java/awt/event/KeyEvent.getModifiers ()I
      // 0da: invokevirtual com/finalshell/core/E0.O (II)[B
      // 0dd: astore 5
      // 0df: aload 5
      // 0e1: ifnull 36d
      // 0e4: aload 1
      // 0e5: invokevirtual java/awt/event/KeyEvent.getModifiers ()I
      // 0e8: iload 2
      // 0e9: ifne 339
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: ifne 326
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.L Lcom/finalshell/ui/panel/ConnectionProperty;
      // 101: invokevirtual com/finalshell/ui/panel/ConnectionProperty.G$DI ()Lcom/finalshell/crypto/ConnectHost;
      // 104: astore 6
      // 106: iload 2
      // 107: ifne 330
      // 10a: aload 6
      // 10c: ifnull 326
      // 10f: goto 116
      // 112: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: aload 6
      // 118: invokevirtual com/finalshell/crypto/ConnectHost.H ()Lcom/finalshell/core/Lv4_2;
      // 11b: astore 7
      // 11d: iload 2
      // 11e: ifne 330
      // 121: aload 7
      // 123: ifnull 326
      // 126: goto 12d
      // 129: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12c: athrow
      // 12d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 130: ldc2_w 270389152141252877
      // 133: astore 9
      // 135: ldc2_w 270389152141252877
      // 138: aload 9
      // 13a: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 13d: goto 144
      // 140: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 143: athrow
      // 144: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 147: ldc2_w 410905379772103887
      // 14a: astore 12
      // 14c: astore 11
      // 14e: ldc2_w 410905379772103887
      // 151: aload 11
      // 153: aload 12
      // 155: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 158: goto 15f
      // 15b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 15e: athrow
      // 15f: aload 7
      // 161: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 164: ldc2_w 292557478156152530
      // 167: astore 14
      // 169: astore 13
      // 16b: ldc2_w 292557478156152530
      // 16e: aload 13
      // 170: aload 14
      // 172: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 175: goto 17c
      // 178: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 17b: athrow
      // 17c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 17f: ldc2_w 343419559142469673
      // 182: astore 16
      // 184: astore 15
      // 186: ldc2_w 343419559142469673
      // 189: aload 15
      // 18b: aload 16
      // 18d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 190: checkcast com/finalshell/core/Lv4_2
      // 193: goto 19a
      // 196: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 199: athrow
      // 19a: astore 7
      // 19c: bipush 0
      // 19d: istore 8
      // 19f: iload 3
      // 1a0: sipush 2182
      // 1a3: ldc2_w 1305540605763424855
      // 1a6: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 1a9: iload 2
      // 1aa: ifne 1e7
      // 1ad: if_icmpeq 1d6
      // 1b0: goto 1b7
      // 1b3: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b6: athrow
      // 1b7: iload 3
      // 1b8: iload 2
      // 1b9: ifne 339
      // 1bc: goto 1c3
      // 1bf: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c2: athrow
      // 1c3: sipush 14606
      // 1c6: ldc2_w 7639814560544170960
      // 1c9: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 1cc: if_icmpne 326
      // 1cf: goto 1d6
      // 1d2: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d5: athrow
      // 1d6: iload 3
      // 1d7: sipush 2182
      // 1da: ldc2_w 1305540605763424855
      // 1dd: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 1e0: goto 1e7
      // 1e3: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e6: athrow
      // 1e7: iload 2
      // 1e8: ifne 23a
      // 1eb: if_icmpne 21e
      // 1ee: goto 1f5
      // 1f1: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f4: athrow
      // 1f5: aload 7
      // 1f7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1fa: ldc2_w 380273998966419876
      // 1fd: astore 18
      // 1ff: astore 17
      // 201: ldc2_w 380273998966419876
      // 204: aload 17
      // 206: aload 18
      // 208: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 20b: checkcast java/lang/Integer
      // 20e: invokevirtual java/lang/Integer.intValue ()I
      // 211: goto 218
      // 214: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 217: athrow
      // 218: istore 8
      // 21a: iload 2
      // 21b: ifeq 262
      // 21e: iload 3
      // 21f: iload 2
      // 220: ifne 264
      // 223: goto 22a
      // 226: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 229: athrow
      // 22a: sipush 14606
      // 22d: ldc2_w 7639814560544170960
      // 230: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 233: goto 23a
      // 236: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 239: athrow
      // 23a: if_icmpne 262
      // 23d: aload 7
      // 23f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 242: ldc2_w 204862003733180970
      // 245: astore 20
      // 247: astore 19
      // 249: ldc2_w 204862003733180970
      // 24c: aload 19
      // 24e: aload 20
      // 250: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 253: checkcast java/lang/Integer
      // 256: invokevirtual java/lang/Integer.intValue ()I
      // 259: goto 260
      // 25c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 25f: athrow
      // 260: istore 8
      // 262: iload 8
      // 264: iload 2
      // 265: ifne 2b8
      // 268: ifne 2af
      // 26b: goto 272
      // 26e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 271: athrow
      // 272: aload 0
      // 273: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cc Lcom/finalshell/core/E0;
      // 276: bipush 1
      // 277: newarray 8
      // 279: dup
      // 27a: bipush 0
      // 27b: sipush 9982
      // 27e: ldc2_w 7045004594113887292
      // 281: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 284: bastore
      // 285: invokevirtual com/finalshell/core/E0.a ([B)V
      // 288: aload 0
      // 289: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cc Lcom/finalshell/core/E0;
      // 28c: sipush 8950
      // 28f: sipush 20754
      // 292: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (II)Ljava/lang/String;
      // 295: sipush 8948
      // 298: sipush 22757
      // 29b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (II)Ljava/lang/String;
      // 29e: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 2a1: invokevirtual com/finalshell/core/E0.a ([B)V
      // 2a4: iload 2
      // 2a5: ifeq 31d
      // 2a8: goto 2af
      // 2ab: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ae: athrow
      // 2af: iload 8
      // 2b1: goto 2b8
      // 2b4: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b7: athrow
      // 2b8: bipush 1
      // 2b9: iload 2
      // 2ba: ifne 2fd
      // 2bd: if_icmpne 2e8
      // 2c0: goto 2c7
      // 2c3: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c6: athrow
      // 2c7: aload 0
      // 2c8: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cc Lcom/finalshell/core/E0;
      // 2cb: bipush 1
      // 2cc: newarray 8
      // 2ce: dup
      // 2cf: bipush 0
      // 2d0: sipush 14606
      // 2d3: ldc2_w 7639814560544170960
      // 2d6: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 2d9: bastore
      // 2da: invokevirtual com/finalshell/core/E0.a ([B)V
      // 2dd: iload 2
      // 2de: ifeq 31d
      // 2e1: goto 2e8
      // 2e4: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e7: athrow
      // 2e8: iload 8
      // 2ea: iload 2
      // 2eb: ifne 325
      // 2ee: goto 2f5
      // 2f1: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f4: athrow
      // 2f5: bipush 2
      // 2f6: goto 2fd
      // 2f9: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fc: athrow
      // 2fd: if_icmpne 31d
      // 300: aload 0
      // 301: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cc Lcom/finalshell/core/E0;
      // 304: bipush 1
      // 305: newarray 8
      // 307: dup
      // 308: bipush 0
      // 309: sipush 2182
      // 30c: ldc2_w 1305540605763424855
      // 30f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 312: bastore
      // 313: invokevirtual com/finalshell/core/E0.a ([B)V
      // 316: goto 31d
      // 319: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31c: athrow
      // 31d: aload 0
      // 31e: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cc Lcom/finalshell/core/E0;
      // 321: invokevirtual com/finalshell/core/E0.K ()V
      // 324: bipush 1
      // 325: ireturn
      // 326: aload 0
      // 327: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cc Lcom/finalshell/core/E0;
      // 32a: aload 5
      // 32c: bipush 1
      // 32d: invokevirtual com/finalshell/core/E0.L ([BZ)V
      // 330: aload 0
      // 331: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.t Lcom/finalshell/core/Rx4;
      // 334: invokeinterface com/finalshell/core/Rx4.F ()Z 1
      // 339: iload 2
      // 33a: ifne 36c
      // 33d: ifeq 36b
      // 340: goto 347
      // 343: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 346: athrow
      // 347: iload 3
      // 348: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.u (I)Z
      // 34b: iload 2
      // 34c: ifne 36c
      // 34f: goto 356
      // 352: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 355: athrow
      // 356: ifeq 36b
      // 359: goto 360
      // 35c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35f: athrow
      // 360: aload 0
      // 361: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.R$void ()V
      // 364: goto 36b
      // 367: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36a: athrow
      // 36b: bipush 1
      // 36c: ireturn
      // 36d: aload 1
      // 36e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.W (Ljava/awt/event/KeyEvent;)Z
      // 371: iload 2
      // 372: ifne 3e3
      // 375: ifeq 3de
      // 378: goto 37f
      // 37b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37e: athrow
      // 37f: iload 4
      // 381: invokestatic java/lang/Character.isDefined (C)Z
      // 384: iload 2
      // 385: ifne 3e3
      // 388: goto 38f
      // 38b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38e: athrow
      // 38f: ifeq 3de
      // 392: goto 399
      // 395: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 398: athrow
      // 399: aload 0
      // 39a: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.t Lcom/finalshell/core/Rx4;
      // 39d: invokeinterface com/finalshell/core/Rx4.A ()Z 1
      // 3a2: iload 2
      // 3a3: ifne 3e3
      // 3a6: goto 3ad
      // 3a9: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ac: athrow
      // 3ad: ifeq 3de
      // 3b0: goto 3b7
      // 3b3: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b6: athrow
      // 3b7: aload 0
      // 3b8: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cc Lcom/finalshell/core/E0;
      // 3bb: new java/lang/String
      // 3be: dup
      // 3bf: bipush 2
      // 3c0: newarray 5
      // 3c2: dup
      // 3c3: bipush 0
      // 3c4: sipush 19061
      // 3c7: ldc2_w 3405883887614087355
      // 3ca: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 3cd: castore
      // 3ce: dup
      // 3cf: bipush 1
      // 3d0: aload 1
      // 3d1: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.l (Ljava/awt/event/KeyEvent;)C
      // 3d4: castore
      // 3d5: invokespecial java/lang/String.<init> ([C)V
      // 3d8: bipush 1
      // 3d9: invokevirtual com/finalshell/core/E0.s (Ljava/lang/String;Z)V
      // 3dc: bipush 1
      // 3dd: ireturn
      // 3de: iload 4
      // 3e0: invokestatic java/lang/Character.isISOControl (C)Z
      // 3e3: iload 2
      // 3e4: ifne 3fd
      // 3e7: ifeq 3fe
      // 3ea: goto 3f1
      // 3ed: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f0: athrow
      // 3f1: aload 0
      // 3f2: aload 1
      // 3f3: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.n (Ljava/awt/event/KeyEvent;)Z
      // 3f6: goto 3fd
      // 3f9: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3fc: athrow
      // 3fd: ireturn
      // 3fe: goto 414
      // 401: astore 3
      // 402: getstatic com/finalshell/ui/panel/SetBackgroundImagePanel.cl Lorg/slf4j/Logger;
      // 405: sipush 8945
      // 408: sipush -12734
      // 40b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (II)Ljava/lang/String;
      // 40e: aload 3
      // 40f: invokeinterface org/slf4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 414: bipush 0
      // 415: ireturn
   }

   public static char l(@NotNull KeyEvent param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual java/awt/event/KeyEvent.getModifiersEx ()I
      // 08: sipush 23895
      // 0b: ldc2_w 3985978740999931822
      // 0e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 11: iand
      // 12: iload 1
      // 13: ifne 35
      // 16: ifeq 2d
      // 19: goto 20
      // 1c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 24: i2c
      // 25: invokestatic java/lang/Character.toUpperCase (C)C
      // 28: ireturn
      // 29: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: aload 0
      // 2e: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 31: i2c
      // 32: invokestatic java/lang/Character.toLowerCase (C)C
      // 35: ireturn
   }

   public static boolean W(@NotNull KeyEvent param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: aload 0
      // 04: invokevirtual java/awt/event/KeyEvent.getModifiersEx ()I
      // 07: istore 2
      // 08: istore 1
      // 09: iload 2
      // 0a: sipush 9381
      // 0d: ldc2_w 8054169350329351806
      // 10: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 13: iand
      // 14: iload 1
      // 15: ifne 34
      // 18: ifeq 86
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: iload 2
      // 23: sipush 30026
      // 26: ldc2_w 6131735450241626033
      // 29: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 2c: iand
      // 2d: goto 34
      // 30: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: iload 1
      // 35: ifne 54
      // 38: ifne 86
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: iload 2
      // 43: sipush 20807
      // 46: ldc2_w 1566352125640494002
      // 49: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 4c: iand
      // 4d: goto 54
      // 50: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: iload 1
      // 55: ifne 74
      // 58: ifne 86
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: iload 2
      // 63: sipush 13931
      // 66: ldc2_w 6217271788376272022
      // 69: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 6c: iand
      // 6d: goto 74
      // 70: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73: athrow
      // 74: iload 1
      // 75: ifne 83
      // 78: ifne 86
      // 7b: goto 82
      // 7e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 81: athrow
      // 82: bipush 1
      // 83: goto 87
      // 86: bipush 0
      // 87: ireturn
   }

   public boolean n(@NotNull KeyEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.W (Ljava/awt/event/KeyEvent;)Z
      // 08: iload 2
      // 09: ifeq 3e
      // 0c: ifeq 3a
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.t Lcom/finalshell/core/Rx4;
      // 1a: invokeinterface com/finalshell/core/Rx4.A ()Z 1
      // 1f: iload 2
      // 20: ifeq 3e
      // 23: goto 2a
      // 26: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: ifeq 3a
      // 2d: goto 34
      // 30: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: bipush 0
      // 35: ireturn
      // 36: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      // 53: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 56: if_icmpne 89
      // 59: goto 60
      // 5c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f: athrow
      // 60: aload 1
      // 61: invokevirtual java/awt/event/KeyEvent.getModifiersEx ()I
      // 64: sipush 21903
      // 67: ldc2_w 4275880943809482574
      // 6a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 6d: iand
      // 6e: iload 2
      // 6f: ifeq a3
      // 72: goto 79
      // 75: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78: athrow
      // 79: ifeq 89
      // 7c: goto 83
      // 7f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 82: athrow
      // 83: bipush 0
      // 84: ireturn
      // 85: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 88: athrow
      // 89: aload 0
      // 8a: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cc Lcom/finalshell/core/E0;
      // 8d: new java/lang/String
      // 90: dup
      // 91: aload 4
      // 93: invokespecial java/lang/String.<init> ([C)V
      // 96: bipush 1
      // 97: invokevirtual com/finalshell/core/E0.s (Ljava/lang/String;Z)V
      // 9a: aload 0
      // 9b: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.t Lcom/finalshell/core/Rx4;
      // 9e: invokeinterface com/finalshell/core/Rx4.F ()Z 1
      // a3: iload 2
      // a4: ifeq bd
      // a7: ifeq bc
      // aa: goto b1
      // ad: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b0: athrow
      // b1: aload 0
      // b2: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.R$void ()V
      // b5: goto bc
      // b8: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bb: athrow
      // bc: bipush 1
      // bd: ireturn
   }

   public static boolean u(int param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 003: istore 1
      // 004: iload 0
      // 005: iload 1
      // 006: ifne 179
      // 009: sipush 20934
      // 00c: ldc2_w 5639302271626824463
      // 00f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 012: if_icmpeq 171
      // 015: goto 01c
      // 018: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: iload 0
      // 01d: iload 1
      // 01e: ifne 179
      // 021: goto 028
      // 024: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: sipush 15830
      // 02b: ldc2_w 4679694503128606480
      // 02e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 031: if_icmpeq 171
      // 034: goto 03b
      // 037: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03a: athrow
      // 03b: iload 0
      // 03c: iload 1
      // 03d: ifne 179
      // 040: goto 047
      // 043: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 046: athrow
      // 047: sipush 31909
      // 04a: ldc2_w 2355902596028819057
      // 04d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 050: if_icmpeq 171
      // 053: goto 05a
      // 056: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: iload 0
      // 05b: iload 1
      // 05c: ifne 179
      // 05f: goto 066
      // 062: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 065: athrow
      // 066: sipush 30466
      // 069: ldc2_w 701018757644938732
      // 06c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 06f: if_icmpeq 171
      // 072: goto 079
      // 075: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 078: athrow
      // 079: iload 0
      // 07a: iload 1
      // 07b: ifne 179
      // 07e: goto 085
      // 081: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 084: athrow
      // 085: sipush 10091
      // 088: ldc2_w 9214893830608436662
      // 08b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 08e: if_icmpeq 171
      // 091: goto 098
      // 094: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 097: athrow
      // 098: iload 0
      // 099: iload 1
      // 09a: ifne 179
      // 09d: goto 0a4
      // 0a0: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a3: athrow
      // 0a4: sipush 19709
      // 0a7: ldc2_w 5495874836332729879
      // 0aa: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 0ad: if_icmpeq 171
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b6: athrow
      // 0b7: iload 0
      // 0b8: iload 1
      // 0b9: ifne 179
      // 0bc: goto 0c3
      // 0bf: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c2: athrow
      // 0c3: sipush 14606
      // 0c6: ldc2_w 7639814560544170960
      // 0c9: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 0cc: if_icmpeq 171
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d5: athrow
      // 0d6: iload 0
      // 0d7: iload 1
      // 0d8: ifne 179
      // 0db: goto 0e2
      // 0de: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e1: athrow
      // 0e2: sipush 3818
      // 0e5: ldc2_w 4017640413363442733
      // 0e8: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 0eb: if_icmpeq 171
      // 0ee: goto 0f5
      // 0f1: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f4: athrow
      // 0f5: iload 0
      // 0f6: iload 1
      // 0f7: ifne 179
      // 0fa: goto 101
      // 0fd: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 100: athrow
      // 101: sipush 27623
      // 104: ldc2_w 314566508295155990
      // 107: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 10a: if_icmpeq 171
      // 10d: goto 114
      // 110: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 113: athrow
      // 114: iload 0
      // 115: iload 1
      // 116: ifne 179
      // 119: goto 120
      // 11c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11f: athrow
      // 120: sipush 26961
      // 123: ldc2_w 7495493721258455949
      // 126: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 129: if_icmpeq 171
      // 12c: goto 133
      // 12f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 132: athrow
      // 133: iload 0
      // 134: iload 1
      // 135: ifne 179
      // 138: goto 13f
      // 13b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13e: athrow
      // 13f: sipush 590
      // 142: ldc2_w 1313863485245102260
      // 145: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 148: if_icmpeq 171
      // 14b: goto 152
      // 14e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 151: athrow
      // 152: iload 0
      // 153: iload 1
      // 154: ifne 179
      // 157: goto 15e
      // 15a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15d: athrow
      // 15e: sipush 3444
      // 161: ldc2_w 1495277792869619617
      // 164: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 167: if_icmpne 17c
      // 16a: goto 171
      // 16d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 170: athrow
      // 171: bipush 1
      // 172: goto 179
      // 175: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 178: athrow
      // 179: goto 17d
      // 17c: bipush 0
      // 17d: ireturn
   }

   public boolean f(KeyEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: istore 2
      // 04: aload 0
      // 05: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.e$boolean ()Z
      // 08: iload 2
      // 09: ifeq 23
      // 0c: ifeq 1c
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 1
      // 1d: invokevirtual java/awt/event/KeyEvent.getKeyChar ()C
      // 20: invokestatic java/lang/Character.isISOControl (C)Z
      // 23: iload 2
      // 24: ifeq 4b
      // 27: ifne 4a
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: aload 0
      // 32: aload 1
      // 33: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.n (Ljava/awt/event/KeyEvent;)Z
      // 36: ireturn
      // 37: astore 3
      // 38: getstatic com/finalshell/ui/panel/SetBackgroundImagePanel.cl Lorg/slf4j/Logger;
      // 3b: sipush 8951
      // 3e: sipush 719
      // 41: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (II)Ljava/lang/String;
      // 44: aload 3
      // 45: invokeinterface org/slf4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 4a: bipush 0
      // 4b: ireturn
   }

   public boolean Z(KeyEvent param1) {
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
      // 002: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 005: aload 1
      // 006: invokestatic javax/swing/KeyStroke.getKeyStrokeForEvent (Ljava/awt/event/KeyEvent;)Ljavax/swing/KeyStroke;
      // 009: astore 4
      // 00b: istore 2
      // 00c: aload 4
      // 00e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 011: ldc2_w 219793214144533914
      // 014: astore 8
      // 016: ldc2_w 219793214144533914
      // 019: aload 8
      // 01b: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 01e: checkcast com/finalshell/core/ZG_2
      // 021: goto 028
      // 024: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 027: athrow
      // 028: astore 5
      // 02a: aload 5
      // 02c: iload 2
      // 02d: ifne 03e
      // 030: ifnull 1a9
      // 033: goto 03a
      // 036: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 039: athrow
      // 03a: bipush 0
      // 03b: istore 3
      // 03c: aload 5
      // 03e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 041: ldc2_w 468069908955066583
      // 044: astore 11
      // 046: astore 10
      // 048: ldc2_w 468069908955066583
      // 04b: aload 10
      // 04d: aload 11
      // 04f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 052: checkcast java/lang/Integer
      // 055: invokevirtual java/lang/Integer.intValue ()I
      // 058: goto 05f
      // 05b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05e: athrow
      // 05f: istore 6
      // 061: iload 6
      // 063: ldc2_w 518223218338208363
      // 066: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 069: aconst_null
      // 06a: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 06d: iload 2
      // 06e: ifne 09f
      // 071: if_icmpne 08c
      // 074: goto 07b
      // 077: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07a: athrow
      // 07b: aload 0
      // 07c: bipush 0
      // 07d: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.A (Z)Z
      // 080: pop
      // 081: iload 2
      // 082: ifeq 1a9
      // 085: goto 08c
      // 088: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08b: athrow
      // 08c: iload 6
      // 08e: ldc2_w 263914437926532128
      // 091: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 094: aconst_null
      // 095: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 098: goto 09f
      // 09b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09e: athrow
      // 09f: iload 2
      // 0a0: ifne 0ca
      // 0a3: if_icmpne 0b7
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ac: athrow
      // 0ad: aload 0
      // 0ae: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.y ()V
      // 0b1: bipush 0
      // 0b2: istore 3
      // 0b3: iload 2
      // 0b4: ifeq 1a9
      // 0b7: iload 6
      // 0b9: ldc2_w 460316126853161418
      // 0bc: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0bf: aconst_null
      // 0c0: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c9: athrow
      // 0ca: iload 2
      // 0cb: ifne 0fa
      // 0ce: if_icmpne 0e7
      // 0d1: goto 0d8
      // 0d4: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d7: athrow
      // 0d8: aload 0
      // 0d9: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.v$void ()V
      // 0dc: iload 2
      // 0dd: ifeq 1a9
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e6: athrow
      // 0e7: iload 6
      // 0e9: ldc2_w 466286588116172621
      // 0ec: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0ef: aconst_null
      // 0f0: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f9: athrow
      // 0fa: iload 2
      // 0fb: ifne 154
      // 0fe: if_icmpne 136
      // 101: goto 108
      // 104: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 107: athrow
      // 108: aload 0
      // 109: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.L Lcom/finalshell/ui/panel/ConnectionProperty;
      // 10c: invokevirtual com/finalshell/ui/panel/ConnectionProperty.x$U ()Lcom/finalshell/ui/frame/U;
      // 10f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 112: ldc2_w 222971910568398589
      // 115: astore 13
      // 117: astore 12
      // 119: ldc2_w 222971910568398589
      // 11c: aload 12
      // 11e: aload 13
      // 120: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 123: pop
      // 124: goto 12b
      // 127: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 12a: athrow
      // 12b: iload 2
      // 12c: ifeq 1a9
      // 12f: goto 136
      // 132: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 135: athrow
      // 136: iload 6
      // 138: iload 2
      // 139: ifne 1ad
      // 13c: goto 143
      // 13f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 142: athrow
      // 143: ldc2_w 124046016677888699
      // 146: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 149: aconst_null
      // 14a: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 14d: goto 154
      // 150: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 153: athrow
      // 154: if_icmpne 1a9
      // 157: aload 0
      // 158: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.L Lcom/finalshell/ui/panel/ConnectionProperty;
      // 15b: invokevirtual com/finalshell/ui/panel/ConnectionProperty.G$DI ()Lcom/finalshell/crypto/ConnectHost;
      // 15e: astore 7
      // 160: aload 7
      // 162: invokevirtual com/finalshell/crypto/ConnectHost.t$boolean ()Z
      // 165: iload 2
      // 166: ifne 1a8
      // 169: ifne 1a0
      // 16c: goto 173
      // 16f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 172: athrow
      // 173: aload 7
      // 175: invokevirtual com/finalshell/crypto/ConnectHost.i$boolean ()Z
      // 178: iload 2
      // 179: ifne 1a8
      // 17c: goto 183
      // 17f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 182: athrow
      // 183: ifne 1a0
      // 186: goto 18d
      // 189: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18c: athrow
      // 18d: aload 0
      // 18e: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.L Lcom/finalshell/ui/panel/ConnectionProperty;
      // 191: invokevirtual com/finalshell/ui/panel/ConnectionProperty.O$boolean ()Z
      // 194: pop
      // 195: iload 2
      // 196: ifeq 1a9
      // 199: goto 1a0
      // 19c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19f: athrow
      // 1a0: bipush 1
      // 1a1: goto 1a8
      // 1a4: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a7: athrow
      // 1a8: istore 3
      // 1a9: aload 1
      // 1aa: invokevirtual java/awt/event/KeyEvent.isAltDown ()Z
      // 1ad: iload 2
      // 1ae: ifne 1d5
      // 1b1: ifne 1d4
      // 1b4: goto 1bb
      // 1b7: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ba: athrow
      // 1bb: aload 1
      // 1bc: invokevirtual java/awt/event/KeyEvent.isMetaDown ()Z
      // 1bf: iload 2
      // 1c0: ifne 1d7
      // 1c3: goto 1ca
      // 1c6: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c9: athrow
      // 1ca: ifeq 1d6
      // 1cd: goto 1d4
      // 1d0: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d3: athrow
      // 1d4: bipush 0
      // 1d5: istore 3
      // 1d6: iload 3
      // 1d7: ifne 1da
      // 1da: iload 3
      // 1db: ireturn
   }

   public boolean i(KeyEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 003: aload 1
      // 004: invokestatic javax/swing/KeyStroke.getKeyStrokeForEvent (Ljava/awt/event/KeyEvent;)Ljavax/swing/KeyStroke;
      // 007: astore 3
      // 008: istore 2
      // 009: aload 3
      // 00a: invokevirtual javax/swing/KeyStroke.getModifiers ()I
      // 00d: iload 2
      // 00e: ifne 116
      // 011: ifne 115
      // 014: goto 01b
      // 017: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: aload 1
      // 01c: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 01f: istore 4
      // 021: iload 4
      // 023: sipush 31892
      // 026: ldc2_w 8207080409332213258
      // 029: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 02c: iload 2
      // 02d: ifne 08e
      // 030: if_icmpne 083
      // 033: goto 03a
      // 036: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 039: athrow
      // 03a: invokestatic java/lang/System.currentTimeMillis ()J
      // 03d: aload 0
      // 03e: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.h J
      // 041: lsub
      // 042: lstore 5
      // 044: aload 0
      // 045: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cw I
      // 048: sipush 24823
      // 04b: ldc2_w 4846036050657573434
      // 04e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 051: iload 2
      // 052: ifne 08e
      // 055: if_icmpne 083
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05e: athrow
      // 05f: aload 0
      // 060: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cQ Z
      // 063: iload 2
      // 064: ifne 085
      // 067: goto 06e
      // 06a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06d: athrow
      // 06e: ifeq 083
      // 071: goto 078
      // 074: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: aload 0
      // 079: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.e$void ()V
      // 07c: goto 083
      // 07f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 082: athrow
      // 083: iload 4
      // 085: sipush 6575
      // 088: ldc2_w 3845226340508205932
      // 08b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 08e: iload 2
      // 08f: ifne 0bb
      // 092: if_icmpne 10d
      // 095: goto 09c
      // 098: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09b: athrow
      // 09c: aload 0
      // 09d: iload 2
      // 09e: ifne 107
      // 0a1: goto 0a8
      // 0a4: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a7: athrow
      // 0a8: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.I I
      // 0ab: sipush 12242
      // 0ae: ldc2_w 1489795501300364599
      // 0b1: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ba: athrow
      // 0bb: if_icmpne 106
      // 0be: invokestatic java/lang/System.currentTimeMillis ()J
      // 0c1: aload 0
      // 0c2: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.C J
      // 0c5: lsub
      // 0c6: lstore 5
      // 0c8: lload 5
      // 0ca: sipush 13230
      // 0cd: ldc2_w 6702412725534740752
      // 0d0: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.b (IJ)J
      // 0d3: lcmp
      // 0d4: ifge 106
      // 0d7: aload 0
      // 0d8: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.L Lcom/finalshell/ui/panel/ConnectionProperty;
      // 0db: invokevirtual com/finalshell/ui/panel/ConnectionProperty.H$F_ ()Lcom/finalshell/ui/dialog/Backspace;
      // 0de: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0e1: ldc2_w 444392071806916948
      // 0e4: astore 8
      // 0e6: astore 7
      // 0e8: ldc2_w 444392071806916948
      // 0eb: aload 7
      // 0ed: aload 8
      // 0ef: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0f2: checkcast com/finalshell/core/Dv2
      // 0f5: goto 0fc
      // 0f8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0fb: athrow
      // 0fc: invokevirtual com/finalshell/core/Dv2.requestFocus ()V
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: aload 0
      // 107: invokestatic java/lang/System.currentTimeMillis ()J
      // 10a: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.C J
      // 10d: aload 0
      // 10e: aload 1
      // 10f: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 112: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.I I
      // 115: bipush 1
      // 116: ireturn
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
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: invokestatic java/lang/System.currentTimeMillis ()J
      // 06: aload 0
      // 07: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.ce J
      // 0a: lsub
      // 0b: lstore 2
      // 0c: istore 1
      // 0d: lload 2
      // 0e: sipush 26412
      // 11: ldc2_w 8347743596245845392
      // 14: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.b (IJ)J
      // 17: lcmp
      // 18: iload 1
      // 19: ifeq 2d
      // 1c: ifle 2c
      // 1f: goto 26
      // 22: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: bipush 0
      // 27: ireturn
      // 28: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: bipush 1
      // 2d: ireturn
   }

   public Pr2 N$Pr_2() {
      return this.H;
   }

   public void Y(Pr2 var1) {
      this.H = var1;
   }

   public void T$void() {
      this.w(false);
   }

   public void P$void() {
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
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.u Lcom/finalshell/core/RU3;
      // 08: iload 3
      // 09: ifeq 21
      // 0c: ifnull 61
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.u Lcom/finalshell/core/RU3;
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 0
      // 22: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.N Lcom/finalshell/core/OT;
      // 25: invokevirtual com/finalshell/core/OT.R ()I
      // 28: invokevirtual com/finalshell/core/RU3.K (I)Lcom/finalshell/core/KB;
      // 2b: astore 4
      // 2d: aload 0
      // 2e: aload 4
      // 30: getfield com/finalshell/core/KB.X Ljava/lang/Object;
      // 33: checkcast com/finalshell/core/XE
      // 36: aload 4
      // 38: getfield com/finalshell/core/KB.S Ljava/lang/Object;
      // 3b: checkcast com/finalshell/core/XE
      // 3e: iload 2
      // 3f: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.u (Lcom/finalshell/core/XE;Lcom/finalshell/core/XE;Z)V
      // 42: iload 3
      // 43: ifeq 5d
      // 46: iload 1
      // 47: ifeq 61
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: aload 0
      // 52: aconst_null
      // 53: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.u Lcom/finalshell/core/RU3;
      // 56: goto 5d
      // 59: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: aload 0
      // 5e: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.repaint ()V
      // 61: return
   }

   public boolean r(@Nullable KeyEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 14
      // 09: ifnull 54
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 1
      // 14: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 17: sipush 28249
      // 1a: ldc2_w 7117702566464058511
      // 1d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 20: iload 2
      // 21: ifne 4d
      // 24: if_icmpne 54
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: aload 1
      // 2f: invokevirtual java/awt/event/KeyEvent.getModifiersEx ()I
      // 32: iload 2
      // 33: ifne 51
      // 36: goto 3d
      // 39: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: sipush 20807
      // 40: ldc2_w 1566352125640494002
      // 43: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 46: goto 4d
      // 49: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: if_icmpne 54
      // 50: bipush 1
      // 51: goto 55
      // 54: bipush 0
      // 55: istore 3
      // 56: iload 3
      // 57: ifeq 70
      // 5a: aload 0
      // 5b: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.u Lcom/finalshell/core/RU3;
      // 5e: ifnonnull 70
      // 61: goto 68
      // 64: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67: athrow
      // 68: bipush 1
      // 69: goto 71
      // 6c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f: athrow
      // 70: bipush 0
      // 71: istore 4
      // 73: aload 0
      // 74: iload 3
      // 75: bipush 0
      // 76: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.b (ZZ)V
      // 79: iload 4
      // 7b: iload 2
      // 7c: ifne 8a
      // 7f: ifne 8d
      // 82: goto 89
      // 85: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 88: athrow
      // 89: bipush 1
      // 8a: goto 8e
      // 8d: bipush 0
      // 8e: ireturn
   }

   public void i() {
      this.b(false, true);
   }

   @Override
   public void processInputMethodEvent(InputMethodEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: aload 1
      // 04: invokevirtual java/awt/event/InputMethodEvent.getCommittedCharacterCount ()I
      // 07: istore 3
      // 08: istore 2
      // 09: iload 2
      // 0a: ifeq 24
      // 0d: iload 3
      // 0e: ifle c8
      // 11: goto 18
      // 14: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 0
      // 19: aconst_null
      // 1a: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.cf Ljava/lang/String;
      // 1d: goto 24
      // 20: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      // 52: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: sipush 12678
      // 59: ldc2_w 4931331269067123566
      // 5c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 5f: if_icmplt 98
      // 62: goto 69
      // 65: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68: athrow
      // 69: iload 6
      // 6b: iload 2
      // 6c: ifeq 9f
      // 6f: goto 76
      // 72: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75: athrow
      // 76: sipush 15152
      // 79: ldc2_w 2459836026063495597
      // 7c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 7f: if_icmpeq 98
      // 82: goto 89
      // 85: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 88: athrow
      // 89: aload 5
      // 8b: iload 6
      // 8d: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 90: pop
      // 91: goto 98
      // 94: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      // b1: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cc Lcom/finalshell/core/E0;
      // b4: aload 5
      // b6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b9: bipush 1
      // ba: invokevirtual com/finalshell/core/E0.s (Ljava/lang/String;Z)V
      // bd: goto c4
      // c0: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c3: athrow
      // c4: iload 2
      // c5: ifne da
      // c8: aload 0
      // c9: aload 1
      // ca: invokevirtual java/awt/event/InputMethodEvent.getText ()Ljava/text/AttributedCharacterIterator;
      // cd: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.y (Ljava/text/AttributedCharacterIterator;)Ljava/lang/String;
      // d0: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.cf Ljava/lang/String;
      // d3: goto da
      // d6: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d9: athrow
      // da: return
   }

   public static String y(@Nullable AttributedCharacterIterator param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: istore 1
      // 04: aload 0
      // 05: ifnonnull 0e
      // 08: aconst_null
      // 09: areturn
      // 0a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      // 24: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 27: if_icmpeq 79
      // 2a: iload 3
      // 2b: iload 1
      // 2c: ifne 74
      // 2f: sipush 17162
      // 32: ldc2_w 6332241477127166453
      // 35: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 38: if_icmplt 6e
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: iload 3
      // 43: iload 1
      // 44: ifne 74
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: sipush 14606
      // 51: ldc2_w 7639814560544170960
      // 54: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 57: if_icmpeq 6e
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: aload 2
      // 62: iload 3
      // 63: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 66: pop
      // 67: goto 6e
      // 6a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      return new N__2(this, null);
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
      // 005: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.H Lcom/finalshell/core/Pr2;
      // 008: invokevirtual com/finalshell/core/Pr2.S ()V
      // 00b: aload 0
      // 00c: aload 0
      // 00d: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.O Lcom/finalshell/core/Kx4_2;
      // 010: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 013: ldc2_w 149968465491171480
      // 016: astore 13
      // 018: astore 12
      // 01a: ldc2_w 149968465491171480
      // 01d: aload 12
      // 01f: aload 13
      // 021: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 024: checkcast com/finalshell/core/NY
      // 027: goto 02e
      // 02a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02d: athrow
      // 02e: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.cM Lcom/finalshell/core/NY;
      // 031: aload 1
      // 032: checkcast java/awt/Graphics2D
      // 035: astore 5
      // 037: aload 0
      // 038: aload 5
      // 03a: invokevirtual java/awt/Graphics2D.getTransform ()Ljava/awt/geom/AffineTransform;
      // 03d: invokevirtual java/awt/geom/AffineTransform.getScaleX ()D
      // 040: d2f
      // 041: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.y F
      // 044: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 047: aload 5
      // 049: getstatic java/awt/RenderingHints.KEY_TEXT_ANTIALIASING Ljava/awt/RenderingHints$Key;
      // 04c: getstatic java/awt/RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB Ljava/lang/Object;
      // 04f: invokevirtual java/awt/Graphics2D.setRenderingHint (Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
      // 052: istore 2
      // 053: aload 5
      // 055: aload 0
      // 056: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cM Lcom/finalshell/core/NY;
      // 059: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 05c: ldc2_w 345089686683358688
      // 05f: astore 15
      // 061: astore 14
      // 063: ldc2_w 345089686683358688
      // 066: aload 14
      // 068: aload 15
      // 06a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 06d: checkcast java/awt/Color
      // 070: goto 077
      // 073: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 076: athrow
      // 077: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 07a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 07d: ldc2_w 270389152141252877
      // 080: astore 16
      // 082: ldc2_w 270389152141252877
      // 085: aload 16
      // 087: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 08a: goto 091
      // 08d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 090: athrow
      // 091: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 094: ldc2_w 306266403902896148
      // 097: astore 19
      // 099: astore 18
      // 09b: ldc2_w 306266403902896148
      // 09e: aload 18
      // 0a0: aload 19
      // 0a2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a5: goto 0ac
      // 0a8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0af: ldc2_w 224406316798891066
      // 0b2: astore 21
      // 0b4: astore 20
      // 0b6: ldc2_w 224406316798891066
      // 0b9: aload 20
      // 0bb: aload 21
      // 0bd: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0c0: checkcast java/lang/Boolean
      // 0c3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0c6: goto 0cd
      // 0c9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0cc: athrow
      // 0cd: iload 2
      // 0ce: ifeq 114
      // 0d1: ifne 0f1
      // 0d4: goto 0db
      // 0d7: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0da: athrow
      // 0db: aload 5
      // 0dd: bipush 0
      // 0de: bipush 0
      // 0df: aload 0
      // 0e0: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.getWidth ()I
      // 0e3: aload 0
      // 0e4: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.getHeight ()I
      // 0e7: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f0: athrow
      // 0f1: aload 0
      // 0f2: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 0f5: aload 0
      // 0f6: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.P I
      // 0f9: aload 0
      // 0fa: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.N Lcom/finalshell/core/OT;
      // 0fd: invokevirtual com/finalshell/core/OT.c ()I
      // 100: new com/finalshell/core/Ep2
      // 103: dup
      // 104: aload 0
      // 105: aload 5
      // 107: invokespecial com/finalshell/core/Ep2.<init> (Lcom/finalshell/ui/panel/SetBackgroundImagePanel;Ljava/awt/Graphics2D;)V
      // 10a: invokevirtual com/finalshell/core/Im4.q (IILcom/finalshell/core/Lf2;)V
      // 10d: aload 0
      // 10e: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.w Lcom/finalshell/core/D__2;
      // 111: invokevirtual com/finalshell/core/D__2.O ()I
      // 114: istore 6
      // 116: aload 0
      // 117: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.P I
      // 11a: aload 0
      // 11b: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.L$int ()I
      // 11e: iadd
      // 11f: iload 2
      // 120: ifeq 1be
      // 123: iload 6
      // 125: if_icmple 1a9
      // 128: goto 12f
      // 12b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12e: athrow
      // 12f: aload 0
      // 130: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.w Lcom/finalshell/core/D__2;
      // 133: invokevirtual com/finalshell/core/D__2.Q ()I
      // 136: istore 7
      // 138: aload 0
      // 139: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 13c: iload 7
      // 13e: iload 6
      // 140: invokevirtual com/finalshell/core/Im4.X (II)Lcom/finalshell/core/KB;
      // 143: astore 8
      // 145: aload 8
      // 147: getfield com/finalshell/core/KB.S Ljava/lang/Object;
      // 14a: iload 2
      // 14b: ifeq 164
      // 14e: ifnull 16a
      // 151: goto 158
      // 154: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 157: athrow
      // 158: aload 8
      // 15a: getfield com/finalshell/core/KB.S Ljava/lang/Object;
      // 15d: goto 164
      // 160: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 163: athrow
      // 164: checkcast com/finalshell/core/YP
      // 167: goto 171
      // 16a: aload 0
      // 16b: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cY Lcom/finalshell/core/Ov4;
      // 16e: invokevirtual com/finalshell/core/Ov4.U ()Lcom/finalshell/core/YP;
      // 171: astore 9
      // 173: aload 0
      // 174: aload 9
      // 176: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.Y (Lcom/finalshell/core/YP;)Lcom/finalshell/core/YP;
      // 179: astore 10
      // 17b: aload 0
      // 17c: iload 7
      // 17e: iload 6
      // 180: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.l (II)Z
      // 183: istore 11
      // 185: aload 0
      // 186: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.w Lcom/finalshell/core/D__2;
      // 189: aload 8
      // 18b: getfield com/finalshell/core/KB.X Ljava/lang/Object;
      // 18e: checkcast java/lang/Character
      // 191: invokevirtual java/lang/Character.toString ()Ljava/lang/String;
      // 194: aload 5
      // 196: iload 11
      // 198: ifeq 1a4
      // 19b: aload 10
      // 19d: goto 1a6
      // 1a0: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a3: athrow
      // 1a4: aload 9
      // 1a6: invokevirtual com/finalshell/core/D__2.Z (Ljava/lang/String;Ljava/awt/Graphics2D;Lcom/finalshell/core/YP;)V
      // 1a9: aload 0
      // 1aa: aload 5
      // 1ac: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.d (Ljava/awt/Graphics2D;)V
      // 1af: aload 0
      // 1b0: aload 5
      // 1b2: aload 0
      // 1b3: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.getWidth ()I
      // 1b6: aload 0
      // 1b7: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.getHeight ()I
      // 1ba: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.D (Ljava/awt/Graphics2D;II)V
      // 1bd: bipush 0
      // 1be: istore 7
      // 1c0: iload 7
      // 1c2: aload 0
      // 1c3: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 1c6: invokevirtual com/finalshell/core/Im4.O ()I
      // 1c9: if_icmpge 1f7
      // 1cc: aload 0
      // 1cd: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 1d0: invokevirtual com/finalshell/core/Im4.O ()I
      // 1d3: bipush 1
      // 1d4: isub
      // 1d5: iload 7
      // 1d7: isub
      // 1d8: istore 8
      // 1da: aload 0
      // 1db: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 1de: iload 8
      // 1e0: invokevirtual com/finalshell/core/Im4.D (I)Lcom/finalshell/core/DC3;
      // 1e3: astore 9
      // 1e5: iinc 7 1
      // 1e8: iload 2
      // 1e9: ifeq 270
      // 1ec: iload 2
      // 1ed: ifne 1c0
      // 1f0: goto 1f7
      // 1f3: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f6: athrow
      // 1f7: aload 0
      // 1f8: iload 2
      // 1f9: ifeq 26a
      // 1fc: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cv Lcom/finalshell/core/ZB_2;
      // 1ff: ifnull 269
      // 202: goto 209
      // 205: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 208: athrow
      // 209: aload 0
      // 20a: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.L Lcom/finalshell/ui/panel/ConnectionProperty;
      // 20d: invokevirtual com/finalshell/ui/panel/ConnectionProperty.O$pA_3 ()Lcom/finalshell/ui/panel/SetBackgroundImagePanel;
      // 210: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.c$KeyEvent ()Ljava/awt/event/KeyEvent;
      // 213: astore 7
      // 215: iload 2
      // 216: ifeq 270
      // 219: aload 7
      // 21b: ifnull 269
      // 21e: goto 225
      // 221: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 224: athrow
      // 225: aload 7
      // 227: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 22a: istore 8
      // 22c: iload 2
      // 22d: ifeq 270
      // 230: iload 8
      // 232: sipush 20863
      // 235: ldc2_w 7415982398466050957
      // 238: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 23b: if_icmpne 269
      // 23e: goto 245
      // 241: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 244: athrow
      // 245: aload 0
      // 246: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cv Lcom/finalshell/core/ZB_2;
      // 249: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 24c: ldc2_w 533907123292002924
      // 24f: astore 23
      // 251: astore 22
      // 253: ldc2_w 533907123292002924
      // 256: aload 22
      // 258: aload 23
      // 25a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 25d: checkcast java/lang/String
      // 260: goto 267
      // 263: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 266: athrow
      // 267: astore 9
      // 269: aload 0
      // 26a: invokestatic java/lang/System.currentTimeMillis ()J
      // 26d: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.cb J
      // 270: return
   }

   public YP S(YP var1) {
      YP var2 = var1.q$YP();
      YP var3 = this.t.Y();
      var2.d(var3.s());
      var2.p(var3.K());
      var2.t(true);
      var2.Z(true);
      return var2;
   }

   @Override
   public void lostOwnership(Clipboard var1, Transferable var2) {
   }

   public ConnectionProperty X$_y_2() {
      return this.L;
   }

   public void U(ConnectionProperty var1) {
      this.L = var1;
   }

   public Connect_2 d$IR() {
      return this.s;
   }

   public void Y(Connect_2 var1) {
      this.s = var1;
   }

   public boolean E$boolean() {
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
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 9e
      // 09: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.ca Z
      // 0c: ifeq 84
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 50
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.l Lcom/finalshell/core/WZ;
      // 25: ifnull 3d
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.l Lcom/finalshell/core/WZ;
      // 33: invokevirtual com/finalshell/core/WZ.Y ()V
      // 36: goto 3d
      // 39: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: aload 0
      // 3e: bipush 0
      // 3f: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.ca Z
      // 42: aload 0
      // 43: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.i Ljavax/swing/BoundedRangeModel;
      // 46: aload 0
      // 47: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.p Ljavax/swing/event/ChangeListener;
      // 4a: invokeinterface javax/swing/BoundedRangeModel.removeChangeListener (Ljavax/swing/event/ChangeListener;)V 2
      // 4f: aload 0
      // 50: iload 1
      // 51: ifne 9e
      // 54: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.b Lcom/finalshell/core/GH_2;
      // 57: ifnull 84
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: aload 0
      // 62: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.b Lcom/finalshell/core/GH_2;
      // 65: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 68: ldc2_w 624731062495880669
      // 6b: astore 3
      // 6c: astore 2
      // 6d: ldc2_w 624731062495880669
      // 70: aload 2
      // 71: aload 3
      // 72: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 75: pop
      // 76: goto 7d
      // 79: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7c: athrow
      // 7d: goto 84
      // 80: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83: athrow
      // 84: aload 0
      // 85: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 88: ldc2_w 242617331513341262
      // 8b: astore 4
      // 8d: ldc2_w 242617331513341262
      // 90: aload 4
      // 92: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 95: pop
      // 96: goto 9d
      // 99: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 9c: athrow
      // 9d: aload 0
      // 9e: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.Z$void ()V
      // a1: return
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
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new D(this), Registry.lookupField(222883478649268280L).getInt(null));
      long var2 = 266288712085965362L;
      Object[] var1 = var10001;
      Ref.h(266288712085965362L, var1, var2);
   }

   public boolean lambda$getActions$20(KeyEvent var1) {
      this.t$void();
      return true;
   }

   public Boolean lambda$getActions$19() {
      int var1 = ConnectionProperty.M$int();

      try {
         boolean var10000 = this.V.T$boolean();
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

   public boolean lambda$getActions$18(KeyEvent var1) {
      this.p$void();
      return true;
   }

   public Boolean lambda$getActions$17() {
      int var1 = ConnectionProperty.M$int();

      try {
         boolean var10000 = this.V.T$boolean();
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

   public boolean lambda$getActions$16(KeyEvent var1) {
      this.q$void();
      return true;
   }

   public Boolean lambda$getActions$15() {
      int var1 = ConnectionProperty.M$int();

      try {
         boolean var10000 = this.V.T$boolean();
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

   public boolean lambda$getActions$14(KeyEvent var1) {
      this.f$void();
      return true;
   }

   public Boolean lambda$getActions$13() {
      int var1 = ConnectionProperty.y();

      try {
         boolean var10000 = this.V.T$boolean();
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

   public boolean lambda$getActions$12(KeyEvent var1) {
      this.n$void();
      return true;
   }

   public boolean lambda$getActions$11(KeyEvent var1) {
      this.E$void();
      return true;
   }

   public Boolean lambda$getActions$10() {
      try {
         if (this.C$String() != null) {
            return true;
         }
      } catch (IllegalStateException var1) {
         throw a(var1);
      }

      return false;
   }

   public boolean lambda$getActions$9(KeyEvent var1) {
      this.T$void();
      return true;
   }

   public boolean lambda$getActions$8(KeyEvent var1) {
      return this.C$boolean();
   }

   public void lambda$setScrollingEnabled$7() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: aload 0
      // 04: bipush 1
      // 05: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.l (Z)V
      // 08: istore 1
      // 09: aload 0
      // 0a: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.T Z
      // 0d: iload 1
      // 0e: ifeq 3d
      // 11: aload 0
      // 12: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 15: invokevirtual com/finalshell/core/Im4.T$boolean ()Z
      // 18: if_icmpeq 65
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 0
      // 23: aload 0
      // 24: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 27: invokevirtual com/finalshell/core/Im4.T$boolean ()Z
      // 2a: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.T Z
      // 2d: aload 0
      // 2e: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.t Lcom/finalshell/core/Rx4;
      // 31: invokeinterface com/finalshell/core/Rx4.a ()Z 1
      // 36: goto 3d
      // 39: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: ifeq 65
      // 40: new javax/swing/Timer
      // 43: dup
      // 44: sipush 3818
      // 47: ldc2_w 4017640413363442733
      // 4a: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // 4d: invokedynamic actionPerformed ()Ljava/awt/event/ActionListener; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/awt/event/ActionEvent;)V, com/finalshell/ui/panel/SetBackgroundImagePanel.lambda$setScrollingEnabled$5 (Ljava/awt/event/ActionEvent;)V, (Ljava/awt/event/ActionEvent;)V ]
      // 52: invokespecial javax/swing/Timer.<init> (ILjava/awt/event/ActionListener;)V
      // 55: astore 2
      // 56: aload 2
      // 57: aload 0
      // 58: aload 2
      // 59: invokedynamic actionPerformed (Lcom/finalshell/ui/panel/SetBackgroundImagePanel;Ljavax/swing/Timer;)Ljava/awt/event/ActionListener; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/awt/event/ActionEvent;)V, com/finalshell/ui/panel/SetBackgroundImagePanel.lambda$setScrollingEnabled$6 (Ljavax/swing/Timer;Ljava/awt/event/ActionEvent;)V, (Ljava/awt/event/ActionEvent;)V ]
      // 5e: invokevirtual javax/swing/Timer.addActionListener (Ljava/awt/event/ActionListener;)V
      // 61: aload 2
      // 62: invokevirtual javax/swing/Timer.start ()V
      // 65: return
   }

   public void lambda$setScrollingEnabled$6(Timer var1, ActionEvent var2) {
      this.d$void();
      var1.stop();
   }

   public static void lambda$setScrollingEnabled$5(ActionEvent var0) {
   }

   public void lambda$addTerminalMouseListener$4(IY3 param1, MouseWheelEvent param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.t Lcom/finalshell/core/Rx4;
      // 08: invokeinterface com/finalshell/core/Rx4.t ()Z 1
      // 0d: iload 3
      // 0e: ifne 63
      // 11: ifeq 5c
      // 14: goto 1b
      // 17: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 2
      // 1d: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.b (Ljava/awt/event/MouseEvent;)Z
      // 20: iload 3
      // 21: ifne 63
      // 24: goto 2b
      // 27: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: ifeq 5c
      // 2e: goto 35
      // 31: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: aload 0
      // 36: aconst_null
      // 37: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.u Lcom/finalshell/core/RU3;
      // 3a: aload 0
      // 3b: aload 2
      // 3c: invokevirtual java/awt/event/MouseWheelEvent.getPoint ()Ljava/awt/Point;
      // 3f: invokespecial com/finalshell/ui/panel/SetBackgroundImagePanel.z (Ljava/awt/Point;)Lcom/finalshell/core/XE;
      // 42: astore 4
      // 44: aload 1
      // 45: aload 4
      // 47: getfield com/finalshell/core/XE.q I
      // 4a: aload 4
      // 4c: getfield com/finalshell/core/XE.r I
      // 4f: new com/finalshell/core/E5
      // 52: dup
      // 53: aload 2
      // 54: invokespecial com/finalshell/core/E5.<init> (Ljava/awt/event/MouseWheelEvent;)V
      // 57: invokeinterface com/finalshell/core/IY3.i (IILcom/finalshell/core/Eo2;)V 4
      // 5c: aload 0
      // 5d: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.V Lcom/finalshell/core/Im4;
      // 60: invokevirtual com/finalshell/core/Im4.T$boolean ()Z
      // 63: iload 3
      // 64: ifne 81
      // 67: ifeq f5
      // 6a: goto 71
      // 6d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 70: athrow
      // 71: aload 0
      // 72: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.t Lcom/finalshell/core/Rx4;
      // 75: invokeinterface com/finalshell/core/Rx4.b ()Z 1
      // 7a: goto 81
      // 7d: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80: athrow
      // 81: iload 3
      // 82: ifne 9a
      // 85: ifeq f5
      // 88: goto 8f
      // 8b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8e: athrow
      // 8f: aload 2
      // 90: invokevirtual java/awt/event/MouseWheelEvent.getWheelRotation ()I
      // 93: goto 9a
      // 96: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 99: athrow
      // 9a: ifge b4
      // 9d: aload 0
      // 9e: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cc Lcom/finalshell/core/E0;
      // a1: sipush 17221
      // a4: ldc2_w 1421851152661535119
      // a7: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // aa: bipush 0
      // ab: invokevirtual com/finalshell/core/E0.O (II)[B
      // ae: astore 4
      // b0: iload 3
      // b1: ifeq c7
      // b4: aload 0
      // b5: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cc Lcom/finalshell/core/E0;
      // b8: sipush 11902
      // bb: ldc2_w 8749279593381508278
      // be: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (IJ)I
      // c1: bipush 0
      // c2: invokevirtual com/finalshell/core/E0.O (II)[B
      // c5: astore 4
      // c7: bipush 0
      // c8: istore 5
      // ca: iload 5
      // cc: aload 2
      // cd: invokevirtual java/awt/event/MouseWheelEvent.getUnitsToScroll ()I
      // d0: invokestatic java/lang/Math.abs (I)I
      // d3: if_icmpge f1
      // d6: aload 0
      // d7: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.cc Lcom/finalshell/core/E0;
      // da: aload 4
      // dc: invokevirtual com/finalshell/core/E0.J ([B)V
      // df: iinc 5 1
      // e2: iload 3
      // e3: ifne f5
      // e6: iload 3
      // e7: ifeq ca
      // ea: goto f1
      // ed: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // f0: athrow
      // f1: aload 2
      // f2: invokevirtual java/awt/event/MouseWheelEvent.consume ()V
      // f5: return
   }

   public void lambda$requestResize$3() {
      this.l(true);
   }

   public void lambda$requestResize$2(WF3 var1) {
      this.c.c(var1);
   }

   public void lambda$init$1(ChangeEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: aload 0
      // 04: aload 0
      // 05: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.i Ljavax/swing/BoundedRangeModel;
      // 08: invokeinterface javax/swing/BoundedRangeModel.getValue ()I 1
      // 0d: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.P I
      // 10: aload 0
      // 11: bipush 1
      // 12: putfield com/finalshell/ui/panel/SetBackgroundImagePanel.cS Z
      // 15: istore 2
      // 16: aload 0
      // 17: iload 2
      // 18: ifne 5a
      // 1b: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.u Lcom/finalshell/core/RU3;
      // 1e: ifnull 59
      // 21: goto 28
      // 24: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 0
      // 29: iload 2
      // 2a: ifne 5a
      // 2d: goto 34
      // 30: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.q Lcom/finalshell/ui/panel/Y3;
      // 37: invokevirtual com/finalshell/ui/panel/Y3.isVisible ()Z
      // 3a: ifeq 59
      // 3d: goto 44
      // 40: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: aload 0
      // 45: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.N$void ()V
      // 48: aload 0
      // 49: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.q Lcom/finalshell/ui/panel/Y3;
      // 4c: invokevirtual com/finalshell/ui/panel/Y3.getParent ()Ljava/awt/Container;
      // 4f: invokevirtual java/awt/Container.doLayout ()V
      // 52: goto 59
      // 55: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58: athrow
      // 59: aload 0
      // 5a: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.repaint ()V
      // 5d: return
   }

   public void lambda$init$0(JScrollBar param1, MouseWheelEvent param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 2
      // 06: iload 3
      // 07: ifne 20
      // 0a: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.m (Ljava/awt/event/MouseEvent;)Z
      // 0d: ifeq 24
      // 10: goto 17
      // 13: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 0
      // 18: aload 2
      // 19: goto 20
      // 1c: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 1
      // 21: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.i (Ljava/awt/event/MouseWheelEvent;Ljavax/swing/JScrollBar;)V
      // 24: return
   }

   public static boolean Z(SetBackgroundImagePanel var0, KeyEvent var1) {
      return var0.u(var1);
   }

   public static boolean Y(SetBackgroundImagePanel var0, KeyEvent var1) {
      return var0.f(var1);
   }

   public static XE x(SetBackgroundImagePanel var0, Point var1) {
      return var0.z(var1);
   }

   public static RU3 e(SetBackgroundImagePanel var0) {
      return var0.u;
   }

   public static XE A$XE(SetBackgroundImagePanel var0) {
      return var0.c0;
   }

   public static XE f(SetBackgroundImagePanel var0, XE var1) {
      return var0.c0 = var1;
   }

   public static RU3 t(SetBackgroundImagePanel var0, RU3 var1) {
      return var0.u = var1;
   }

   public static Rx4 S(SetBackgroundImagePanel var0) {
      return var0.t;
   }

   public static void Z(SetBackgroundImagePanel var0, int var1) {
      var0.b(var1);
   }

   public static Im4 T(SetBackgroundImagePanel var0) {
      return var0.V;
   }

   public static void I(SetBackgroundImagePanel var0) {
      var0.A$void();
   }

   public static D__2 D(SetBackgroundImagePanel var0) {
      return var0.w;
   }

   public static BoundedRangeModel y(SetBackgroundImagePanel var0) {
      return var0.i;
   }

   public static String r(SetBackgroundImagePanel var0) {
      return var0.C$String();
   }

   public static E0 A$E0(SetBackgroundImagePanel var0) {
      return var0.cc;
   }

   public static void f(SetBackgroundImagePanel var0, Point var1, boolean var2) {
      var0.u(var1, var2);
   }

   public static OX3 c(SetBackgroundImagePanel var0) {
      return var0.B;
   }

   public static OX3 M(SetBackgroundImagePanel var0, OX3 var1) {
      return var0.B = var1;
   }

   public static boolean D(SetBackgroundImagePanel var0, MouseEvent var1) {
      return var0.B(var1);
   }

   public static Yw2 C(SetBackgroundImagePanel var0, Point var1) {
      return var0.s(var1);
   }

   public static void O(SetBackgroundImagePanel var0) {
      var0.i();
   }

   public static boolean C(SetBackgroundImagePanel var0, boolean var1) {
      return var0.cz = var1;
   }

   public static void Z(SetBackgroundImagePanel var0, Component var1, boolean var2) {
      var0.J(var1, var2);
   }

   public static void H(SetBackgroundImagePanel var0, boolean var1) {
      var0.l(var1);
   }

   public static AtomicBoolean p(SetBackgroundImagePanel var0) {
      return var0.Q;
   }

   public static void V(SetBackgroundImagePanel var0) {
      var0.h();
   }

   public static Logger t$Logger() {
      return cl;
   }

   public static boolean H$boolean(SetBackgroundImagePanel var0) {
      return var0.cq;
   }

   public static boolean u(SetBackgroundImagePanel var0, boolean var1) {
      return var0.cq = var1;
   }

   public static Wq2_2 H$Wq_2(SetBackgroundImagePanel var0) {
      return var0.W;
   }

   public static int k(SetBackgroundImagePanel var0) {
      return var0.P$int();
   }

   public static YP Y(SetBackgroundImagePanel var0, YP var1) {
      return var0.y(var1);
   }

   public static Ov4 Z(SetBackgroundImagePanel var0) {
      return var0.cY;
   }

   public static Color t(SetBackgroundImagePanel var0, Et2 var1) {
      return var0.r(var1);
   }

   public static void M(SetBackgroundImagePanel var0, int var1, int var2, com.finalshell.ui.model.J2 var3, YP var4, Graphics2D var5, boolean var6, boolean var7) {
      var0.R(var1, var2, var3, var4, var5, var6, var7);
   }

   public static void G(SetBackgroundImagePanel var0, int var1, int var2, YP var3, com.finalshell.ui.model.J2 var4, Graphics2D var5) {
      var0.r(var1, var2, var3, var4, var5);
   }

   public static WZ o(SetBackgroundImagePanel var0) {
      return var0.l;
   }

   public static YP a(SetBackgroundImagePanel var0, YP var1) {
      return var0.Z(var1);
   }

   public static RU3 Y(SetBackgroundImagePanel var0) {
      return var0.e;
   }

   public static YP l(SetBackgroundImagePanel var0, YP var1) {
      return var0.S(var1);
   }

   public static YP S(SetBackgroundImagePanel var0, YP var1) {
      return var0.Y(var1);
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6878;
      if (eb[var3] == null) {
         eb[var3] = (int)(db[var3] ^ var1);
      }

      return eb[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 25276) & 32767;
      if (gb[var3] == null) {
         gb[var3] = fb[var3] ^ var1;
      }

      return gb[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var43;
      byte[] var7;
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
                                       var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
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
                                    cl = LoggerFactory.getLogger(SetBackgroundImagePanel.class);
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
   private static Object d;
}





