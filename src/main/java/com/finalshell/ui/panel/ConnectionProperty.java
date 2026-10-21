package com.finalshell.ui.panel;

import com.finalshell.core.AD_2;
import com.finalshell.core.AN_2;
import com.finalshell.core.AZ;
import com.finalshell.core.Ap2_2;
import com.finalshell.core.Bc2_2;
import com.finalshell.core.CB;
import com.finalshell.core.CS3_2;
import com.finalshell.core.Cj4;
import com.finalshell.core.Connect_2;
import com.finalshell.core.D9;
import com.finalshell.core.DV3;
import com.finalshell.core.Dv2;
import com.finalshell.core.E0;
import com.finalshell.core.EO;
import com.finalshell.core.FM;
import com.finalshell.core.Fv2_2;
import com.finalshell.core.GP;
import com.finalshell.core.HH;
import com.finalshell.core.HN;
import com.finalshell.core.Im4;
import com.finalshell.core.In4;
import com.finalshell.core.Lv4_2;
import com.finalshell.core.Ms2;
import com.finalshell.core.NY;
import com.finalshell.core.OT;
import com.finalshell.core.Ov4;
import com.finalshell.core.Pr2;
import com.finalshell.core.QT;
import com.finalshell.core.Rx4;
import com.finalshell.core.Sd2;
import com.finalshell.core.T32;
import com.finalshell.core.Ty2;
import com.finalshell.core.UO;
import com.finalshell.core.UR_2;
import com.finalshell.core.Uc2;
import com.finalshell.core.Ug2;
import com.finalshell.core.W82;
import com.finalshell.core.WZ;
import com.finalshell.core.Wq2_2;
import com.finalshell.core.XF3;
import com.finalshell.core.XX3;
import com.finalshell.core.Xn4;
import com.finalshell.core.Y2;
import com.finalshell.core.Yl4;
import com.finalshell.core.Ym2;
import com.finalshell.core.Yo2;
import com.finalshell.crypto.ConnectHost;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Bv2_2;
import com.finalshell.task.Ly2;
import com.finalshell.ui.dialog.Backspace;
import com.finalshell.ui.dialog.Ff2;
import com.finalshell.ui.listener.A3;
import com.finalshell.ui.listener.C22;
import com.finalshell.ui.listener.FR;
import com.finalshell.ui.listener.Gr2;
import com.finalshell.ui.listener.Gv2;
import com.finalshell.ui.listener.PN;
import com.finalshell.ui.listener.Rb4;
import com.finalshell.ui.listener.SJ;
import com.finalshell.ui.listener.T1;
import com.finalshell.ui.listener.TV;
import com.finalshell.ui.listener.Zr2;
import com.finalshell.ui.model.LN;
import com.finalshell.ui.model.NZ;
import com.finalshell.ui.model.US;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.lang.reflect.InvocationTargetException;
import java.net.SocketException;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnectionProperty extends F8 implements W82, FM, CS3_2, Ms2 {
   public static Logger w;
   public SetBackgroundImagePanel kj;
   public JScrollBar v;
   public Connect_2 O;
   public AtomicBoolean kJ;
   public AZ j;
   public Wq2_2 W;
   public D9 G;
   public PN kz;
   public Cj4 L;
   public E0 V;
   public Thread E;
   public Rx4 kC;
   public CS3_2 Z;
   public JLayeredPane b;
   public In4 Q;
   public List kq;
   public com.finalshell.ui.frame.U kD;
   public ConnectionProperty U;
   public ConnectionProperty kk;
   public FilePanel ks;
   public boolean s;
   public float k;
   public int kP;
   public int d;
   public Lv4_2 C;
   public String X;
   public boolean kS;
   public CB kL;
   public Ty2 N;
   public Ov4 kl;
   public KM3 kY;
   public T32 kM;
   public ConnectHost P;
   public JPanel kW;
   public GP kp;
   public Y3 M;
   public int h;
   public int r;
   public int kc;
   public GP k8;
   public Ff2 l;
   public Backspace x;
   public Dv2 k7;
   public GP kb;
   public Uc2 I;
   public int k2;
   public static String i;
   public static BufferedImage z;
   public static BufferedImage Y;
   public Dimension o;
   public XX3 m;
   public int k0;
   public int T;
   public int a;
   public boolean g;
   public float y;
   public static RenderingHints n;
   public int u;
   public int t;
   public int F;
   public int B;
   public Object A;
   public boolean k5;
   public Y2 J;
   public JScrollBar e;
   public Bq_2 kN;
   public BS kQ;
   public String D;
   public static int S;
   public static String[] ab;
   public static String[] bb;
   public static long[] eb;
   public static Integer[] fb;

   public static synchronized void b$void() {
      Registry.packArgs(n$String());
      long var0 = 447583865571692266L;
      Object var10001 = Ref.h2(447583865571692266L, var0);

      try {
         var10001 = (String)var10001;
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      i = (String)var10001;
   }

   public static synchronized String l$String() {
      return i;
   }

   public static synchronized String n$String() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 003: new java/lang/StringBuffer
      // 006: dup
      // 007: invokespecial java/lang/StringBuffer.<init> ()V
      // 00a: astore 1
      // 00b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 00e: ldc2_w 270389152141252877
      // 011: astore 10
      // 013: ldc2_w 270389152141252877
      // 016: aload 10
      // 018: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 01b: goto 022
      // 01e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 021: athrow
      // 022: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 025: ldc2_w 306266403902896148
      // 028: astore 13
      // 02a: astore 12
      // 02c: ldc2_w 306266403902896148
      // 02f: aload 12
      // 031: aload 13
      // 033: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 036: checkcast com/finalshell/core/U62
      // 039: goto 040
      // 03c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 03f: athrow
      // 040: astore 2
      // 041: istore 0
      // 042: invokestatic java/net/NetworkInterface.getNetworkInterfaces ()Ljava/util/Enumeration;
      // 045: astore 4
      // 047: new java/util/HashSet
      // 04a: dup
      // 04b: invokespecial java/util/HashSet.<init> ()V
      // 04e: astore 6
      // 050: aload 4
      // 052: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 057: ifeq 168
      // 05a: aload 4
      // 05c: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 061: checkcast java/net/NetworkInterface
      // 064: astore 5
      // 066: iload 0
      // 067: ifeq 24e
      // 06a: aload 5
      // 06c: iload 0
      // 06d: ifeq 086
      // 070: goto 077
      // 073: invokestatic com/finalshell/ui/panel/ConnectionProperty.a (Ljava/net/SocketException;)Ljava/net/SocketException;
      // 076: athrow
      // 077: invokevirtual java/net/NetworkInterface.isLoopback ()Z
      // 07a: ifne 050
      // 07d: goto 084
      // 080: invokestatic com/finalshell/ui/panel/ConnectionProperty.a (Ljava/net/SocketException;)Ljava/net/SocketException;
      // 083: athrow
      // 084: aload 5
      // 086: invokevirtual java/net/NetworkInterface.getHardwareAddress ()[B
      // 089: astore 7
      // 08b: aload 7
      // 08d: iload 0
      // 08e: ifeq 09d
      // 091: ifnull 164
      // 094: goto 09b
      // 097: invokestatic com/finalshell/ui/panel/ConnectionProperty.a (Ljava/net/SocketException;)Ljava/net/SocketException;
      // 09a: athrow
      // 09b: aload 7
      // 09d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0a0: ldc2_w 569067797285016864
      // 0a3: astore 14
      // 0a5: ldc2_w 569067797285016864
      // 0a8: aload 14
      // 0aa: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0ad: checkcast java/lang/Boolean
      // 0b0: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0b3: goto 0ba
      // 0b6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: ifne 164
      // 0bd: new java/lang/StringBuilder
      // 0c0: dup
      // 0c1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c4: astore 8
      // 0c6: bipush 0
      // 0c7: istore 9
      // 0c9: iload 9
      // 0cb: aload 7
      // 0cd: arraylength
      // 0ce: if_icmpge 11c
      // 0d1: aload 8
      // 0d3: iload 0
      // 0d4: ifeq 11e
      // 0d7: sipush -24866
      // 0da: sipush -28985
      // 0dd: invokestatic com/finalshell/ui/panel/ConnectionProperty.a (II)Ljava/lang/String;
      // 0e0: bipush 2
      // 0e1: anewarray 232
      // 0e4: dup
      // 0e5: bipush 0
      // 0e6: aload 7
      // 0e8: iload 9
      // 0ea: baload
      // 0eb: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 0ee: aastore
      // 0ef: dup
      // 0f0: bipush 1
      // 0f1: iload 9
      // 0f3: aload 7
      // 0f5: arraylength
      // 0f6: bipush 1
      // 0f7: isub
      // 0f8: if_icmpge 10b
      // 0fb: goto 102
      // 0fe: invokestatic com/finalshell/ui/panel/ConnectionProperty.a (Ljava/net/SocketException;)Ljava/net/SocketException;
      // 101: athrow
      // 102: ldc "-"
      // 104: goto 10d
      // 107: invokestatic com/finalshell/ui/panel/ConnectionProperty.a (Ljava/net/SocketException;)Ljava/net/SocketException;
      // 10a: athrow
      // 10b: ldc ""
      // 10d: aastore
      // 10e: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 111: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 114: pop
      // 115: iinc 9 1
      // 118: iload 0
      // 119: ifne 0c9
      // 11c: aload 8
      // 11e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 121: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 124: astore 9
      // 126: aload 6
      // 128: aload 9
      // 12a: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 12d: iload 0
      // 12e: ifeq 149
      // 131: ifne 164
      // 134: goto 13b
      // 137: invokestatic com/finalshell/ui/panel/ConnectionProperty.a (Ljava/net/SocketException;)Ljava/net/SocketException;
      // 13a: athrow
      // 13b: aload 6
      // 13d: aload 9
      // 13f: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 142: goto 149
      // 145: invokestatic com/finalshell/ui/panel/ConnectionProperty.a (Ljava/net/SocketException;)Ljava/net/SocketException;
      // 148: athrow
      // 149: pop
      // 14a: aload 1
      // 14b: new java/lang/StringBuilder
      // 14e: dup
      // 14f: invokespecial java/lang/StringBuilder.<init> ()V
      // 152: aload 9
      // 154: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 157: ldc_w "#"
      // 15a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 160: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 163: pop
      // 164: iload 0
      // 165: ifne 050
      // 168: goto 172
      // 16b: astore 4
      // 16d: aload 4
      // 16f: invokevirtual java/net/SocketException.printStackTrace ()V
      // 172: aload 1
      // 173: sipush -24880
      // 176: sipush -10664
      // 179: invokestatic com/finalshell/ui/panel/ConnectionProperty.a (II)Ljava/lang/String;
      // 17c: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 17f: pop
      // 180: aload 1
      // 181: new java/lang/StringBuilder
      // 184: dup
      // 185: invokespecial java/lang/StringBuilder.<init> ()V
      // 188: sipush -24876
      // 18b: sipush 25261
      // 18e: invokestatic com/finalshell/ui/panel/ConnectionProperty.a (II)Ljava/lang/String;
      // 191: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 194: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 197: sipush -24888
      // 19a: sipush 22703
      // 19d: invokestatic com/finalshell/ui/panel/ConnectionProperty.a (II)Ljava/lang/String;
      // 1a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a6: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1a9: pop
      // 1aa: aload 1
      // 1ab: new java/lang/StringBuilder
      // 1ae: dup
      // 1af: invokespecial java/lang/StringBuilder.<init> ()V
      // 1b2: sipush -24889
      // 1b5: sipush -31630
      // 1b8: invokestatic com/finalshell/ui/panel/ConnectionProperty.a (II)Ljava/lang/String;
      // 1bb: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 1be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c1: sipush -24865
      // 1c4: sipush -23336
      // 1c7: invokestatic com/finalshell/ui/panel/ConnectionProperty.a (II)Ljava/lang/String;
      // 1ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d0: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1d3: pop
      // 1d4: aload 1
      // 1d5: new java/lang/StringBuilder
      // 1d8: dup
      // 1d9: invokespecial java/lang/StringBuilder.<init> ()V
      // 1dc: aload 2
      // 1dd: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1e0: ldc2_w 204000105621842013
      // 1e3: astore 17
      // 1e5: astore 16
      // 1e7: ldc2_w 204000105621842013
      // 1ea: aload 16
      // 1ec: aload 17
      // 1ee: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1f1: checkcast java/lang/String
      // 1f4: goto 1fb
      // 1f7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1fa: athrow
      // 1fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fe: sipush -24883
      // 201: sipush 26612
      // 204: invokestatic com/finalshell/ui/panel/ConnectionProperty.a (II)Ljava/lang/String;
      // 207: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 20d: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 210: pop
      // 211: aload 1
      // 212: new java/lang/StringBuilder
      // 215: dup
      // 216: invokespecial java/lang/StringBuilder.<init> ()V
      // 219: aload 2
      // 21a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 21d: ldc2_w 191807067392725406
      // 220: astore 19
      // 222: astore 18
      // 224: ldc2_w 191807067392725406
      // 227: aload 18
      // 229: aload 19
      // 22b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 22e: checkcast java/lang/String
      // 231: goto 238
      // 234: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 237: athrow
      // 238: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 23b: sipush -24892
      // 23e: sipush -22159
      // 241: invokestatic com/finalshell/ui/panel/ConnectionProperty.a (II)Ljava/lang/String;
      // 244: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 247: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 24a: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 24d: pop
      // 24e: aload 1
      // 24f: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 252: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 255: ldc2_w 417955638237048558
      // 258: astore 20
      // 25a: ldc2_w 417955638237048558
      // 25d: aload 20
      // 25f: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 262: checkcast java/lang/String
      // 265: goto 26c
      // 268: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 26b: athrow
      // 26c: astore 4
      // 26e: new java/lang/StringBuilder
      // 271: dup
      // 272: invokespecial java/lang/StringBuilder.<init> ()V
      // 275: aload 2
      // 276: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 279: ldc2_w 191807067392725406
      // 27c: astore 23
      // 27e: astore 22
      // 280: ldc2_w 191807067392725406
      // 283: aload 22
      // 285: aload 23
      // 287: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 28a: checkcast java/lang/String
      // 28d: goto 294
      // 290: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 293: athrow
      // 294: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 297: sipush 29654
      // 29a: ldc2_w 3157404892382703694
      // 29d: invokestatic com/finalshell/ui/panel/ConnectionProperty.b (IJ)I
      // 2a0: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2a3: ldc_w "*"
      // 2a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a9: aload 2
      // 2aa: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2ad: ldc2_w 204000105621842013
      // 2b0: astore 25
      // 2b2: astore 24
      // 2b4: ldc2_w 204000105621842013
      // 2b7: aload 24
      // 2b9: aload 25
      // 2bb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2be: checkcast java/lang/String
      // 2c1: goto 2c8
      // 2c4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2c7: athrow
      // 2c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2cb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ce: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2d1: ldc2_w 417955638237048558
      // 2d4: astore 26
      // 2d6: ldc2_w 417955638237048558
      // 2d9: aload 26
      // 2db: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2de: checkcast java/lang/String
      // 2e1: goto 2e8
      // 2e4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2e7: athrow
      // 2e8: bipush 0
      // 2e9: sipush 24630
      // 2ec: ldc2_w 1815819135368995772
      // 2ef: invokestatic com/finalshell/ui/panel/ConnectionProperty.b (IJ)I
      // 2f2: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 2f5: astore 5
      // 2f7: new java/lang/StringBuilder
      // 2fa: dup
      // 2fb: invokespecial java/lang/StringBuilder.<init> ()V
      // 2fe: aload 2
      // 2ff: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 302: ldc2_w 204000105621842013
      // 305: astore 29
      // 307: astore 28
      // 309: ldc2_w 204000105621842013
      // 30c: aload 28
      // 30e: aload 29
      // 310: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 313: checkcast java/lang/String
      // 316: goto 31d
      // 319: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 31c: athrow
      // 31d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 320: ldc_w "@"
      // 323: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 326: aload 5
      // 328: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32b: aload 4
      // 32d: bipush 0
      // 32e: sipush 32369
      // 331: ldc2_w 343410956083903968
      // 334: invokestatic com/finalshell/ui/panel/ConnectionProperty.b (IJ)I
      // 337: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 33a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 33d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 340: astore 4
      // 342: aload 4
      // 344: areturn
   }

   public ConnectionProperty(@NotNull Rx4 var1) {
      this(b(3778, 6574025406202793303L), b(11731, 920127827315617359L), var1);
   }

   public ConnectionProperty(int var1, int var2, Rx4 var3) {
   super();
      int var10000 = M$int();
      this.kJ = new AtomicBoolean();
      this.kq = new CopyOnWriteArrayList();
      this.s = true;
      this.k = 0.6F;
      this.d = new Random().nextInt();
      this.kS = false;
      int var4 = var10000;
      this.h = 1;
      this.r = b(6739, 256056104267930056L);
      this.kc = this.h;
      this.k2 = new Random().nextInt();
      this.setBorder(null);
      this.U = this;
      this.m = new XX3();
      this.T = 0;
      this.a = b(22154, 6717061833032242433L);
      this.g = false;
      this.y = 1.0F;
      n = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      n.put(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
      n.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
      n.put(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
      this.A = new Object();
      this.k5 = false;
      this.kN = null;
      this.D = a(-24887, -2723);
      Registry.emptyArgs();
      long var17 = 270389152141252877L;
      Ref.h2(270389152141252877L, var17);
      Object[] var10003 = Registry.emptyArgs();
      long var20 = 332056532434062105L;
      Object[] var19 = var10003;
      Ref.h(332056532434062105L, var19, var20);
      Object[] var10004 = Registry.emptyArgs();
      long var22 = 143530106198249902L;
      Object[] var21 = var10004;
      var10004 = Registry.packArgs(Ref.h(143530106198249902L, var21, var22));
      long var24 = 348300936400245960L;
      Object[] var23 = var10004;
      Ref.h(348300936400245960L, var23, var24);

      try {
         ;
      } catch (InvocationTargetException var54) {
         throw var54.getTargetException();
      }

      this.kC = var3;
      Ov4 var5 = this.d$ov_4();
      this.Q = new In4(var3.F(), var3.u());
      Im4 var6 = new Im4(var1, var2, var5, var3.X(), this.Q);
      this.Q.G(var6);
      this.kj = this.F(this.kC, var5, var6);
      this.O = new Connect_2(this.kj, var6, var5);
      this.O.G(this);
      this.kj.U(this);
      this.j = new AZ(this.O, var6, var3);
      this.W = new Wq2_2(this.j);
      UO var7 = new UO(this.W::Y, Wq2_2.p);
      this.W.L(var7);
      this.kj.k(this.W);
      this.O.o(NZ.AltSendsEscape, this.kC.A());
      this.kj.N(this.O);
      this.kj.Y(this);
      this.kj.t(this.O);
      this.kz = this.k(this.O);
      this.kj.G(this.kz);
      this.v = this.t$JScrollBar();
      this.b = new JLayeredPane();
      this.b.setFocusable(false);
      this.setFocusable(false);
      this.b.setLayout(new AN_2(null));
      this.b.add(this.kj, AN_2.I);
      this.b.add(this.v, AN_2.v);
      this.kY = new KM3();
      Hj2 var8 = new Hj2(this.kj);
      this.kY.H(var8);
      this.b.add(this.kY, AN_2.I);
      this.setLayout(new MigLayout(a(-24879, -10655), a(-24874, -3498), a(-24885, -21668)));
      this.add(this.b, a(-24882, -32262));
      this.kW = new SP();
      this.kW.setBackground(new Color(b(15917, 8313445711006465456L), b(26856, 2176266695700196215L), b(26856, 2176266695700196215L)));
      this.kW.setLayout(new MigLayout(a(-24890, -8855), a(-24868, 18226), a(-24886, 32178)));
      this.kW.setBorder(BorderFactory.createEmptyBorder(5, 0, b(20368, 4292849074312186904L), 0));
      this.add(this.kW, a(-24895, -3344));
      this.kW.add(new JLabel(), a(-24896, 8599));
      Object[] var10005 = Registry.packArgs(a(-24871, -29832), false);
      long var25 = 176987068897787958L;
      Object var10006 = Ref.h2(176987068897787958L, var25);

      try {
         var10006 = (Dv2)var10006;
      } catch (InvocationTargetException var53) {
         throw var53.getTargetException();
      }

      var10005.k7 = (Dv2)var10006;
      this.kW.add(this.k7, a(-24894, 9263));
      this.l = new Ff2(this.kj, this.k7);
      this.x = new Backspace(this.kj, this.l, this.k7);
      var10006 = Registry.packArgs(this.x);
      long var28 = 125680002081187591L;
      Object[] var27 = (Object[])var10006;
      Ref.h(125680002081187591L, var27, var28);

      try {
         ;
      } catch (InvocationTargetException var52) {
         throw var52.getTargetException();
      }

      this.kp = g("\uf0e7", true);
      this.kp.setToolTipText(a(-24884, 4938));
      this.kp.setFocusable(false);
      this.kp.setFont((Font)Registry.lookupField(568130515263631326L).get(null));
      this.kp.V(0, 2, 2, 2);
      this.kp.addActionListener(new Rb4(this));
      this.kW.add(this.kp);
      GP var9 = g("\uf0c5", true);
      var9.setToolTipText(a(-24877, -9486));
      var9.setFocusable(false);
      this.kW.add(var9);
      var9.addActionListener(new A3(this));
      GP var10 = g("\uf0ea", true);
      var10.setToolTipText(a(-24867, 3511));
      var10.setFocusable(false);
      this.kW.add(var10);
      var10.addActionListener(new C22(this));
      RenderingHints var11 = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      GP var12 = g("\uf002", true);
      var12.setToolTipText(a(-24875, 22595));
      var12.setFocusable(false);
      Object[] var10007 = Registry.packArgs(var11);
      long var30 = 170479436712564229L;
      Object[] var29 = var10007;
      Ref.h(170479436712564229L, var29, var30);

      try {
         ;
      } catch (InvocationTargetException var51) {
         throw var51.getTargetException();
      }

      this.kW.add(var12);
      var12.addActionListener(new T1(this));
      GP var13 = g("\uf013", true);
      var13.setToolTipText(a(-24873, -12767));
      var13.V(0, 0, 1, 0);
      var13.setFont((Font)Registry.lookupField(568130515263631326L).get(null));
      var13.setFocusable(false);
      Object[] var10008 = Registry.packArgs(var11);
      long var32 = 170479436712564229L;
      Object[] var31 = var10008;
      Ref.h(170479436712564229L, var31, var32);

      try {
         ;
      } catch (InvocationTargetException var50) {
         throw var50.getTargetException();
      }

      this.kW.add(var13);
      var13.addActionListener(new FR(this));
      GP var14 = g("\uf07c", true);
      var14.setFocusable(false);
      var14.setToolTipText(a(-24893, -20984));
      Object[] var10009 = Registry.packArgs(var11);
      long var34 = 170479436712564229L;
      Object[] var33 = var10009;
      Ref.h(170479436712564229L, var33, var34);

      try {
         ;
      } catch (InvocationTargetException var49) {
         throw var49.getTargetException();
      }

      var14.addActionListener(new Zr2(this));
      GP var15 = g("\uf04b", true);
      var15.setToolTipText(a(-24878, 24767));
      var15.setFocusable(false);
      Object[] var10010 = Registry.packArgs(var11);
      long var36 = 170479436712564229L;
      Object[] var35 = var10010;
      Ref.h(170479436712564229L, var35, var36);

      try {
         ;
      } catch (InvocationTargetException var48) {
         throw var48.getTargetException();
      }

      var15.addActionListener(new TV(this));
      this.kb = g("\uf062", true);
      this.kb.setToolTipText(a(-24891, 102));
      this.kb.setFocusable(false);
      Object[] var10011 = Registry.packArgs(var11);
      long var38 = 170479436712564229L;
      Object[] var37 = var10011;
      Ref.h(170479436712564229L, var37, var38);

      try {
         ;
      } catch (InvocationTargetException var47) {
         throw var47.getTargetException();
      }

      String var16 = "\uf062";
      if (var4 != 0) {
         Object[] var10012 = Registry.emptyArgs();
         long var40 = 483219322811206313L;
         Object[] var39 = var10012;
         Ref.h(483219322811206313L, var39, var40);
         Object[] var10013 = Registry.emptyArgs();
         long var42 = 571514335693873067L;
         Object[] var41 = var10013;
         var10013 = Ref.h(571514335693873067L, var41, var42);

         try {
            var59 = (Boolean)var10013;
         } catch (InvocationTargetException var46) {
            throw var46.getTargetException();
         }

         if (var59) {
            var16 = "\uf063";
         }

         this.kb.setText(var16);
         this.kW.add(this.kb);
         this.kb.addActionListener(new SJ(this));
         this.k8 = g("\uf2d0", true);
         this.k8.setToolTipText(a(-24881, -23814));
         this.k8.V(0, 0, 1, 0);
         this.k8.setFont((Font)Registry.lookupField(164046876459002055L).get(null));
         this.k8.setFocusable(false);
         Object[] var10014 = Registry.packArgs(var11);
         long var44 = 170479436712564229L;
         Object[] var43 = var10014;
         Ref.h(170479436712564229L, var43, var44);

         try {
            ;
         } catch (InvocationTargetException var45) {
            throw var45.getTargetException();
         }

         this.kW.add(this.k8);
         this.k8.addActionListener(new Gr2(this));
         this.kj.setVisible(true);
         this.r();
         this.setBackground(this.kj.getBackground());
         this.n$void();
         this.M$void();
         this.v.setModel(this.kj.u$BoundedRangeModel());
         this.kJ.set(false);
         this.kj.A(this.v);
      }

      this.kj.setVisible(true);
      if (var4 == 0) {
         Ky4.K(new String[4]);
      }
   }

   public static void c(BufferedImage var0, BufferedImage var1) {
      v$void();
      z = var1;
      Y = var0;
   }

   public void l$void() {
      this.repaint();
      this.kW.repaint();
   }

   public BufferedImage B(Ap2_2 var1, int var2, int var3) {
      int var10000 = M$int();
      String var5 = var2 + "-" + var3;
      int var4 = var10000;
      HashMap var10001 = Registry.emptyArgs();
      long var19 = 154023799716952351L;
      Object[] var18 = var10001;
      var10001 = Ref.h(154023799716952351L, var18, var19);

      try {
         var10001 = (HashMap)var10001;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      BufferedImage var6 = (BufferedImage)var10001.get(var5);
      BufferedImage var33 = var6;
      if (var4 != 0) {
         if (var6 == null) {
            int var7 = this.a + this.k0 / 2;
            Registry.packArgs(this.y, var7, 2 * var7);
            long var20 = 363377265675420359L;
            Object var10002 = Ref.h2(363377265675420359L, var20);

            try {
               var10002 = (BufferedImage)var10002;
            } catch (InvocationTargetException var28) {
               throw var28.getTargetException();
            }

            BufferedImage var8 = (BufferedImage)var10002;
            Graphics2D var9 = (Graphics2D)var8.getGraphics();
            double var10 = (double)(var1.n + var1.t);
            double var12 = (double)(var1.Q - this.a);
            double var14 = (double)var7;
            double var16 = (double)(2 * var7);
            Uc2 var10004 = this.I;
            BufferedImage var10005 = (BufferedImage)(Registry.emptyArgs());
            long var23 = 168242036098089983L;
            Object[] var22 = var10005;
            var10005 = Ref.h(168242036098089983L, var22, var23);

            try {
               var10005 = (BufferedImage)var10005;
            } catch (InvocationTargetException var27) {
               throw var27.getTargetException();
            }

            var9.Y(
               var10004,
               var10005,
               0,
               0,
               (int)((float)var7 * this.y),
               (int)((float)(2 * var7) * this.y),
               (int)var10,
               (int)var12,
               (int)(var10 + var14),
               (int)(var12 + var16),
               null
            );
            var8 = XX3.C(var8, true);
            var6 = var8;
            var9.dispose();
            Object[] var35 = Registry.emptyArgs();
            long var25 = 154023799716952351L;
            Object[] var24 = var35;
            var10004 = (Uc2)Ref.h(154023799716952351L, var24, var25);

            try {
               var37 = (HashMap)var10004;
            } catch (InvocationTargetException var26) {
               throw var26.getTargetException();
            }

            var37.put(var5, var8);
         }

         var33 = var6;
      }

      return var33;
   }

   public BufferedImage W(Ap2_2 var1, int var2, int var3) {
      M$int();
      String var5 = var2 + "-" + var3;
      Uc2 var10001 = this.I;
      HashMap var10002 = Registry.emptyArgs();
      long var15 = 488609953321778838L;
      Object[] var14 = var10002;
      var10002 = Ref.h(488609953321778838L, var14, var15);

      try {
         var10002 = (HashMap)var10002;
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      BufferedImage var6 = (BufferedImage)var10002.get(var5);
      Uc2 var4 = var10001;
      BufferedImage var27 = var6;
      if (var4 == null) {
         if (var6 == null) {
            int var7 = this.a + this.k0 / 2;
            Registry.packArgs(this.y, var7, 2 * var7);
            long var16 = 363377265675420359L;
            var10002 = (HashMap)Ref.h2(363377265675420359L, var16);

            try {
               var31 = (BufferedImage)var10002;
            } catch (InvocationTargetException var24) {
               throw var24.getTargetException();
            }

            BufferedImage var8 = var31;
            Graphics2D var9 = (Graphics2D)var8.getGraphics();
            int var10 = var1.n - var7;
            int var11 = var1.Q - this.a;
            int var13 = 2 * var7;
            Uc2 var10004 = this.I;
            BufferedImage var10005 = (BufferedImage)(Registry.emptyArgs());
            long var19 = 168242036098089983L;
            Object[] var18 = var10005;
            var10005 = Ref.h(168242036098089983L, var18, var19);

            try {
               var10005 = (BufferedImage)var10005;
            } catch (InvocationTargetException var23) {
               throw var23.getTargetException();
            }

            var9.Y(var10004, var10005, 0, 0, (int)((float)var7 * this.y), (int)((float)(2 * var7) * this.y), var10, var11, var10 + var7, var11 + var13, null);
            if (var10 < 0) {
            }

            var9.setColor(Color.yellow);
            var8 = XX3.C(var8, false);
            var6 = var8;
            Object[] var32 = Registry.emptyArgs();
            long var21 = 488609953321778838L;
            Object[] var20 = var32;
            var10004 = (Uc2)Ref.h(488609953321778838L, var20, var21);

            try {
               var34 = (HashMap)var10004;
            } catch (InvocationTargetException var22) {
               throw var22.getTargetException();
            }

            var34.put(var5, var8);
         }

         var27 = var6;
      }

      return var27;
   }

   public BufferedImage S(int var1) {
      y();
      Uc2 var10001 = this.I;
      HashMap var10002 = Registry.emptyArgs();
      long var8 = 620288665172364692L;
      Object[] var7 = var10002;
      var10002 = Ref.h(620288665172364692L, var7, var8);

      try {
         var10002 = (HashMap)var10002;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      BufferedImage var3 = (BufferedImage)var10002.get(var1);
      Uc2 var2 = var10001;
      BufferedImage var20 = var3;
      if (var2 == null) {
         if (var3 == null) {
            Pr2 var4 = this.kj.N$Pr_2();
            int var5 = var1 * this.k0 + Hj2.f.top;
            Registry.packArgs(this.y, this.getWidth(), this.k0 + this.a);
            long var9 = 363377265675420359L;
            var10002 = (HashMap)Ref.h2(363377265675420359L, var9);

            try {
               var24 = (BufferedImage)var10002;
            } catch (InvocationTargetException var17) {
               throw var17.getTargetException();
            }

            var3 = var24;
            Graphics2D var6 = (Graphics2D)var3.getGraphics();
            Uc2 var10004 = this.I;
            BufferedImage var10005 = (BufferedImage)(Registry.emptyArgs());
            long var12 = 168242036098089983L;
            Object[] var11 = var10005;
            var10005 = Ref.h(168242036098089983L, var11, var12);

            try {
               var10005 = (BufferedImage)var10005;
            } catch (InvocationTargetException var16) {
               throw var16.getTargetException();
            }

            var6.Y(var10004, var10005, 0, 0, var3.getWidth(), var3.getHeight(), 0, var5 + this.k0, var3.getWidth(), var5 + this.k0 + this.a, null);
            var3 = XX3.G(var3, true);
            var6.dispose();
            Object[] var25 = Registry.emptyArgs();
            long var14 = 620288665172364692L;
            Object[] var13 = var25;
            var10004 = (Uc2)Ref.h(620288665172364692L, var13, var14);

            try {
               var27 = (HashMap)var10004;
            } catch (InvocationTargetException var15) {
               throw var15.getTargetException();
            }

            var27.put(var1, var3);
         }

         var20 = var3;
      }

      return var20;
   }

   public BufferedImage q(int var1) {
      M$int();
      Uc2 var10001 = this.I;
      HashMap var10002 = Registry.emptyArgs();
      long var7 = 176879981672674185L;
      Object[] var6 = var10002;
      var10002 = Ref.h(176879981672674185L, var6, var7);

      try {
         var10002 = (HashMap)var10002;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      BufferedImage var3 = (BufferedImage)var10002.get(var1);
      Uc2 var2 = var10001;
      BufferedImage var19 = var3;
      if (var2 == null) {
         if (var3 == null) {
            int var4 = var1 * this.k0 + Hj2.f.top;
            Registry.packArgs(this.y, this.getWidth(), this.k0 + this.a);
            long var8 = 363377265675420359L;
            var10002 = (HashMap)Ref.h2(363377265675420359L, var8);

            try {
               var23 = (BufferedImage)var10002;
            } catch (InvocationTargetException var16) {
               throw var16.getTargetException();
            }

            var3 = var23;
            Graphics2D var5 = (Graphics2D)var3.getGraphics();
            Uc2 var10004 = this.I;
            BufferedImage var10005 = (BufferedImage)(Registry.emptyArgs());
            long var11 = 168242036098089983L;
            Object[] var10 = var10005;
            var10005 = Ref.h(168242036098089983L, var10, var11);

            try {
               var10005 = (BufferedImage)var10005;
            } catch (InvocationTargetException var15) {
               throw var15.getTargetException();
            }

            var5.Y(var10004, var10005, 0, 0, var3.getWidth(), var3.getHeight(), 0, var4 + this.k0 - this.a, var3.getWidth(), var4 + this.k0, null);
            var3 = XX3.G(var3, false);
            Object[] var24 = Registry.emptyArgs();
            long var13 = 176879981672674185L;
            Object[] var12 = var24;
            var10004 = (Uc2)Ref.h(176879981672674185L, var12, var13);

            try {
               var26 = (HashMap)var10004;
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }

            var26.put(var1, var3);
         }

         var19 = var3;
      }

      return var19;
   }

   public void Y(Graphics2D var1, Image var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, ImageObserver var11) {
      var1.drawImage(
         var2,
         var3,
         var4,
         var5,
         var6,
         (int)((float)var7 * this.y),
         (int)((float)var8 * this.y),
         (int)((float)var9 * this.y),
         (int)((float)var10 * this.y),
         var11
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void paintComponent(Graphics var1) {
      Object var2;
      Graphics2D var3;
      int var6;
      boolean var99;
      label335: {
         label331: {
            label336: {
               super.paintComponent(var1);
               Dimension var10000 = y();
               var3 = (Graphics2D)var1;
               var2 = var10000;
               this.y = (float)var3.getTransform().getScaleX();
               long var4 = System.currentTimeMillis();
               var6 = 0;
               var10000 = this.o;
               if (var2 == null) {
                  if (this.o == null) {
                     break label336;
                  }

                  var10000 = this.getSize();
               }

               int var97 = var10000.width;
               if (var2 == null) {
                  if (var10000.width == this.o.width) {
                     if (var2 != null) {
                        break label335;
                     }

                     if (this.getSize().height == this.o.height) {
                        break label331;
                     }
                  }

                  var97 = 1;
               }

               var6 = var97;
               if (var2 == null) {
                  break label331;
               }
            }

            var6 = 1;
         }

         Registry.emptyArgs();
         long var27 = 270389152141252877L;
         Ref.h2(270389152141252877L, var27);
         Object[] var10002 = Registry.emptyArgs();
         long var30 = 306266403902896148L;
         Object[] var29 = var10002;
         Ref.h(306266403902896148L, var29, var30);
         Object[] var10003 = Registry.emptyArgs();
         long var32 = 224406316798891066L;
         Object[] var31 = var10003;
         Object var98 = Ref.h(224406316798891066L, var31, var32);

         try {
            var99 = (Boolean)var98;
         } catch (InvocationTargetException var61) {
            throw var61.getTargetException();
         }
      }

      boolean var7 = (boolean)var99;
      if (!var7) {
         Registry.emptyArgs();
         long var89 = 270389152141252877L;
         Ref.h2(270389152141252877L, var89);
         Object[] var104 = Registry.emptyArgs();
         long var91 = 399585344452154517L;
         Object[] var90 = var104;
         Ref.h(399585344452154517L, var90, var91);
         NY var109 = (NY)(Registry.emptyArgs());
         long var93 = 149968465491171480L;
         Object[] var92 = var109;
         var109 = Ref.h(149968465491171480L, var92, var93);

         try {
            var109 = (NY)var109;
         } catch (InvocationTargetException var62) {
            throw var62.getTargetException();
         }

         NY var67 = var109;
         Color var121 = (Color)(Registry.emptyArgs());
         long var95 = 345089686683358688L;
         Object[] var94 = var121;
         var121 = Ref.h(345089686683358688L, var94, var95);

         try {
            var121 = (Color)var121;
         } catch (InvocationTargetException var63) {
            throw var63.getTargetException();
         }

         var67.setColor(var121);
         var3.fillRect(0, 0, this.getWidth(), this.getHeight());
      } else {
         label353: {
            if (z != null) {
               label340: {
                  var3.setRenderingHints(n);
                  this.u = (int)(this.y * (float)this.getWidth());
                  this.t = (int)(this.y * (float)this.getHeight());
                  var99 = (var6) != 0;
                  label308:
                  if (var2 == null) {
                     if (var6 == 0) {
                        var99 = this.k5;
                        if (var2 != null) {
                           break label308;
                        }

                        if (!this.k5) {
                           break label340;
                        }
                     }

                     this.j();
                     var99 = (this.u) != 0;
                  }

                  Registry.packArgs(var99, this.t);
                  long var33 = 393044433502132546L;
                  Object var10004 = Ref.h2(393044433502132546L, var33);

                  try {
                     var10004 = (Uc2)var10004;
                  } catch (InvocationTargetException var60) {
                     throw var60.getTargetException();
                  }

                  label341: {
                     Uc2 var8 = (Uc2)var10004;
                     if (var2 == null) {
                        if (var8 == null) {
                           Object[] var10005 = Registry.packArgs(z, Y, n, this.u, this.t);
                           long var35 = 266518540506038545L;
                           Object var10006 = Ref.h2(266518540506038545L, var35);

                           try {
                              var10006 = (Uc2)var10006;
                           } catch (InvocationTargetException var59) {
                              throw var59.getTargetException();
                           }

                           var10005.I = (Uc2)var10006;
                           if (var2 == null) {
                              break label341;
                           }
                        }

                        this.I = var8;
                     }

                     Object[] var102 = Registry.emptyArgs();
                     long var38 = 190504784764553274L;
                     Object[] var37 = var102;
                     Ref.h(190504784764553274L, var37, var38);

                     try {
                        ;
                     } catch (InvocationTargetException var58) {
                        throw var58.getTargetException();
                     }
                  }

                  Registry.packArgs(this.I, this.k2);
                  long var39 = 437509730807629483L;
                  Ref.h2(437509730807629483L, var39);

                  try {
                     ;
                  } catch (InvocationTargetException var57) {
                     throw var57.getTargetException();
                  }

                  this.F = this.u;
                  this.B = this.t;
                  this.k5 = false;
                  boolean var64 = false;
               }

               long var65 = System.currentTimeMillis();
               Uc2 var10007 = this.I;
               BufferedImage var10008 = (BufferedImage)(Registry.emptyArgs());
               long var42 = 246564164248981875L;
               Object[] var41 = var10008;
               var10008 = Ref.h(246564164248981875L, var41, var42);

               try {
                  var10008 = (BufferedImage)var10008;
               } catch (InvocationTargetException var56) {
                  throw var56.getTargetException();
               }

               label343: {
                  var10007.drawImage(var10008, 0, 0, this.getWidth(), this.getHeight(), this);
                  Pr2 var10 = this.kj.N$Pr_2();
                  OT var112 = var10.j();
                  if (var2 == null) {
                     if (var112 == null) {
                        break label343;
                     }

                     var112 = var10.j();
                  }

                  int var11 = var112.c();
                  this.k0 = var10.F();
                  HashMap var12 = var10.R();
                  int var13 = 0;

                  label288:
                  while (true) {
                     Ap2_2 var14;
                     Object var113;
                     if (var13 < var11) {
                        var14 = (Ap2_2)var12.get(var13);
                        var113 = var14;
                        if (var2 == null) {
                           label345: {
                              if (var2 == null) {
                                 if (var14 == null) {
                                    var113 = (Ap2_2)var2;
                                    if (var2 == null) {
                                       break label345;
                                    }

                                    var113 = var14;
                                 } else {
                                    var113 = var14;
                                 }
                              }

                              int var15 = (var113.K - this.T) * var10.m() + Hj2.f.left;
                              int var16 = var13 * var10.F() + Hj2.f.top;
                              int var17 = (var14.J - var14.K + 1 + 2 * this.T) * var10.m();
                              int var18 = var10.F();
                              var14.n = var15;
                              var14.Q = var16;
                              var14.t = var17;
                              var14.H = var18;
                              var113 = this;
                              Uc2 var10009 = this.I;
                              BufferedImage var10010 = (BufferedImage)(Registry.emptyArgs());
                              long var44 = 168242036098089983L;
                              Object[] var43 = var10010;
                              var10010 = Ref.h(168242036098089983L, var43, var44);

                              try {
                                 var10010 = (BufferedImage)var10010;
                              } catch (InvocationTargetException var55) {
                                 throw var55.getTargetException();
                              }

                              var3.Y(var10009, var10010, var15, var16, var15 + var17, var16 + var18, var15, var16, var15 + var17, var16 + var18, null);
                           }

                           var13++;
                           if (var2 == null) {
                              continue;
                           }

                           var13 = 0;
                           if (var13 >= var11) {
                              break;
                           }

                           var14 = (Ap2_2)var12.get(var13);
                           if (var2 == null) {
                              return;
                           }
                        }
                     } else {
                        var13 = 0;
                        if (var13 >= var11) {
                           break;
                        }

                        var14 = (Ap2_2)var12.get(var13);
                        if (var2 != null) {
                           return;
                        }

                        var113 = var14;
                     }

                     while (true) {
                        label348: {
                           if (var2 == null) {
                              if (var113 == null) {
                                 if (var2 == null) {
                                    var13++;
                                    if (var2 == null) {
                                       break label288;
                                    }
                                    break label348;
                                 }

                                 var113 = var14;
                              } else {
                                 var113 = var14;
                              }
                           }

                           int var68 = var113.n;
                           int var69 = var14.Q;
                           int var70 = var14.t;
                           int var71 = this.a + this.k0 / 2;
                           BufferedImage var19 = this.B(var14, var13, var14.J);
                           var3.drawImage(
                              var19,
                              var68 + var70 - 1,
                              var69 - this.a,
                              var68 + var70 + var71 - 1,
                              var69 - this.a + 2 * var71,
                              0,
                              0,
                              var19.getWidth(),
                              var19.getHeight(),
                              null
                           );
                           var71 = this.a + this.k0 / 2;
                           var19 = this.W(var14, var13, var14.K);
                           var3.drawImage(
                              var19, var68 - var71, var69 - this.a, var68, var69 - this.a + 2 * var71, 0, 0, var19.getWidth(), var19.getHeight(), null
                           );
                           BufferedImage var73 = this.S(var13);
                           var19 = this.q(var13);
                           Ap2_2 var20 = (Ap2_2)var12.get(var13 - 1);
                           Ap2_2 var21 = (Ap2_2)var12.get(var13 + 1);
                           int var22 = 0;
                           int var23 = 0;
                           int var24 = 0;
                           var113 = var21;
                           if (var2 == null) {
                              label281:
                              if (var21 != null) {
                                 int var25 = var21.J - var14.J;
                                 label278:
                                 if (var2 == null) {
                                    if (var25 < 0) {
                                       var24 = var69 + this.k0;
                                       if (var2 == null) {
                                          if (var14.K < var21.J) {
                                             var22 = (var21.J + 1 + this.T) * var10.m() + Hj2.f.left;
                                             var23 = (var14.J - var21.J) * var10.m();
                                             if (var2 == null) {
                                                var22 = var68;
                                                var23 = var70;
                                             }
                                          } else {
                                             var22 = var68;
                                             var23 = var70;
                                          }
                                       } else {
                                          var23 = var14.K;
                                       }

                                       var24 = var69 + this.k0;
                                       var3.drawImage(var73, var22, var24, var22 + var23, var24 + this.a, var22, 0, var22 + var23, var73.getHeight(), null);
                                       if (var2 == null) {
                                          break label278;
                                       }
                                    }

                                    var22 = (var14.V() + 1 + this.T) * var10.m() + Hj2.f.left;
                                    var24 = var69 + this.k0 - this.a;
                                    var23 = (var21.V() - var14.V()) * var10.m();
                                    var3.drawImage(var19, var22, var24, var22 + var23, var24 + this.a, var22, 0, var22 + var23, var19.getHeight(), null);
                                 }

                                 var25 = var21.K - var14.K;
                                 int var115 = var25;
                                 if (var2 == null) {
                                    if (var25 < 0) {
                                       var24 = var69 + this.k0 - this.a;
                                       var22 = var21.n;
                                       if (var2 == null) {
                                          if (var21.J >= var14.K) {
                                             var23 = (var14.K - var21.K) * var10.m();
                                             if (var2 == null) {
                                                var23 = var21.t;
                                             }
                                          } else {
                                             var23 = var21.t;
                                          }
                                       } else {
                                          var23 = var21.J;
                                       }

                                       BufferedImage var26 = this.q(var13);
                                       if (var26 != null) {
                                          var3.drawImage(var26, var22, var24, var22 + var23, var24 + this.a, var22, 0, var22 + var23, var73.getHeight(), null);
                                       }

                                       if (var2 == null) {
                                          var113 = var21;
                                          break label281;
                                       }

                                       var22 = var68;
                                       var24 = var69 + this.k0;
                                       var115 = (var21.K - var14.K) * var10.m();
                                    } else {
                                       var22 = var68;
                                       var24 = var69 + this.k0;
                                       var115 = (var21.K - var14.K) * var10.m();
                                    }
                                 }

                                 var23 = var115;
                                 BufferedImage var88 = this.S(var13);
                                 var3.drawImage(var88, var22, var24, var22 + var23, var24 + this.a, var22, 0, var22 + var23, var19.getHeight(), null);
                                 var113 = var21;
                              } else {
                                 var113 = var21;
                              }
                           }

                           if (var2 == null) {
                              if (var113 == null) {
                                 var24 = var69 + this.k0;
                                 var24 = var69 + this.k0;
                                 var3.drawImage(var73, var68, var24, var68 + var70, var24 + this.a, var68, 0, var68 + var70, var73.getHeight(), null);
                              }

                              var113 = var20;
                           }

                           if (var113 == null) {
                              var24 = var69 - this.a;
                              BufferedImage var87 = this.q(var13 - 1);
                              if (var2 == null) {
                                 if (var87 != null) {
                                    var3.drawImage(var87, var68, var24, var68 + var70, var24 + this.a, var68, 0, var68 + var70, var87.getHeight(), null);
                                 }

                                 var13++;
                              }
                           } else {
                              var13++;
                           }

                           if (var2 == null) {
                              break label288;
                           }
                        }

                        if (var13 >= var11) {
                           break label288;
                        }

                        var14 = (Ap2_2)var12.get(var13);
                        if (var2 == null) {
                           return;
                        }

                        var113 = var14;
                     }
                  }
               }

               if (var2 == null) {
                  break label353;
               }
            }

            Registry.emptyArgs();
            long var45 = 270389152141252877L;
            Ref.h2(270389152141252877L, var45);
            Object[] var103 = Registry.emptyArgs();
            long var48 = 399585344452154517L;
            Object[] var47 = var103;
            Ref.h(399585344452154517L, var47, var48);
            NY var106 = (NY)(Registry.emptyArgs());
            long var50 = 149968465491171480L;
            Object[] var49 = var106;
            var106 = Ref.h(149968465491171480L, var49, var50);

            try {
               var106 = (NY)var106;
            } catch (InvocationTargetException var54) {
               throw var54.getTargetException();
            }

            NY var66 = var106;
            Color var118 = (Color)(Registry.emptyArgs());
            long var52 = 345089686683358688L;
            Object[] var51 = var118;
            var118 = Ref.h(345089686683358688L, var51, var52);

            try {
               var118 = (Color)var118;
            } catch (InvocationTargetException var53) {
               throw var53.getTargetException();
            }

            var66.setColor(var118);
            var3.fillRect(0, 0, this.getWidth(), this.getHeight());
         }
      }

      this.o = this.getSize();
   }

   @Override
   public void repaint() {
      super.repaint();
   }

   public void s(String var1) {
      WZ var2 = this.O.S(var1, false);
      this.kj.z(var2);
      this.G.o(var2);
      this.v.repaint();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void i$void() {
      int var10000 = M$int();
      Object var2 = this.A;
      synchronized (this.A){} // $VF: monitorenter 
      int var1 = var10000;

      try {
         label85: {
            boolean var3;
            label90: {
               var3 = false;
               D9 var9 = this.G;
               if (var1 != 0) {
                  if (this.G == null) {
                     break label90;
                  }

                  var9 = this.G;
               }

               var10 = var9.l().isVisible();
               if (var1 == 0) {
                  break label85;
               }

               if (var10) {
                  String var4 = this.G.I();
                  var10 = var4.equals("");
                  if (var1 == 0) {
                     break label85;
                  }

                  if (!var10) {
      BufferedImage var10;
      BufferedImage var10;
                     var4 = this.O(var4);
                     this.s(var4);
                     var3 = true;
                  }
               }
            }

            var10 = var3;
         }

         label72: {
            if (!var10) {
               var11 = this.kj.f$WZ();
               if (var1 == 0) {
                  break label72;
               }

               if (var11 != null) {
                  this.kj.z(null);
                  ConnectionProperty var12 = this;
                  if (var1 != 0) {
                     if (this.G != null) {
                        this.G.o(null);
                     }

                     var12 = this;
                  }

                  var12.v.repaint();
               }
            }

            var11 = var2;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   public String O(String var1) {
      int var10000 = y();
      String var3 = "";
      int var4 = 0;
      int var2 = var10000;

      while (true) {
         if (var4 < var1.length()) {
            char var5 = var1.charAt(var4);
            var6 = var3 + var5;
            if (var2 != 0) {
               break;
            }

            var3 = var6;
            if (var2 == 0) {
               if (Sd2.U(var5, true)) {
                  var3 = var3 + b(15029, 8833880272044423483L);
               }

               var4++;
            }

            if (var2 == 0) {
               continue;
            }
         }

         var6 = var3;
         break;
      }

      return var6;
   }

   public void F() {
      int var1 = M$int();
      Uc2 var10000 = this.I;
      if (var1 == 0) {
         Registry.packArgs(var10000, this.k2);
         long var4 = 427396605320189647L;
         Ref.h2(427396605320189647L, var4);

         try {
            ;
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         this.I = null;
      } else if (this.I != null) {
         var10000 = this.I;
         Object[] var10001 = Registry.emptyArgs();
         long var3 = 552452973171057584L;
         Object[] var2 = var10001;
         Ref.h(552452973171057584L, var2, var3);

         label23:
         try {
            break label23;
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }
      }
   }

   public void j() {
      int var1 = M$int();
      Uc2 var10000 = this.I;
      if (var1 != 0) {
         if (this.I == null) {
            return;
         }

         var10000 = this.I;
      }

      Registry.packArgs(var10000, this.k2);
      long var2 = 427396605320189647L;
      Ref.h2(427396605320189647L, var2);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      this.I = null;
   }

   public static void v$void() {
      int var0 = y();
      BufferedImage var10000 = z;
      if (var0 == 0) {
         if (z != null) {
            z.getGraphics().dispose();
            z = null;
         }

         var10000 = Y;
      }

      if (var0 == 0) {
         if (var10000 == null) {
            return;
         }

         var10000 = Y;
      }

      var10000.getGraphics().dispose();
      Y = null;
   }

   public void T$void() {
      int var10000 = y();
      String var2 = "\uf062";
      int var1 = var10000;
      if (var1 == 0) {
         Object[] var10001 = Registry.emptyArgs();
         long var4 = 483219322811206313L;
         Object[] var3 = var10001;
         Ref.h(483219322811206313L, var3, var4);
         Object[] var10002 = Registry.emptyArgs();
         long var6 = 571514335693873067L;
         Object[] var5 = var10002;
         var10002 = Ref.h(571514335693873067L, var5, var6);

         try {
            var9 = (Boolean)var10002;
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         if (var9) {
            var2 = "\uf063";
         }
      }

      this.kb.setText(var2);
   }

   public void Y$void() {
      int var10000 = M$int();
      ConnectHost var2 = this.U.s$Fv_2().e();
      int var1 = var10000;
      ConnectHost var6 = var2;
      if (var1 != 0) {
         if (var2 == null) {
            return;
         }

         var6 = var2;
      }

      label24: {
         if (var1 != 0) {
            if (!var6.t$boolean()) {
               break label24;
            }

            var6 = var2;
         }

         var6.G();
      }

      Object[] var10001 = Registry.packArgs(this.U);
      long var4 = 185296114512803953L;
      Object[] var3 = var10001;
      Ref.h(185296114512803953L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public boolean O$boolean() {
      int var1;
      int var8;
      label45: {
         label48: {
            var8 = M$int();
            ConnectHost var2 = this.G$DI();
            var1 = var8;
            ConnectHost var7 = var2;
            if (var1 != 0) {
               if (var2 == null) {
                  break label48;
               }

               var7 = var2;
            }

            var8 = var7.t$boolean();
            if (var1 != 0) {
               if (var8) {
                  break label48;
               }

               var8 = var2.i$boolean();
            }

            if (var1 == 0) {
               break label45;
            }

            if (!var8) {
               var8 = 1;
               break label45;
            }
         }

         var8 = 0;
      }

      boolean var3 = (boolean)var8;
      boolean var9 = (var3) != 0;
      if (var1 != 0) {
         if (var3) {
            Object[] var10001 = Registry.packArgs(this.U);
            long var5 = 185296114512803953L;
            Object[] var4 = var10001;
            Ref.h(185296114512803953L, var4, var5);

            try {
               ;
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }
         }

         var9 = var3;
      }

      return var9;
   }

   public boolean V$boolean() {
      int var1;
      int var8;
      label45: {
         label48: {
            var8 = y();
            ConnectHost var2 = this.G$DI();
            var1 = var8;
            ConnectHost var7 = var2;
            if (var1 == 0) {
               if (var2 == null) {
                  break label48;
               }

               var7 = var2;
            }

            var8 = var7.t$boolean();
            if (var1 == 0) {
               if (var8) {
                  break label48;
               }

               var8 = var2.i$boolean();
            }

            if (var1 != 0) {
               break label45;
            }

            if (!var8) {
               var8 = 1;
               break label45;
            }
         }

         var8 = 0;
      }

      boolean var3 = (boolean)var8;
      boolean var9 = (var3) != 0;
      if (var1 == 0) {
         if (var3) {
            Registry.lookupField(388376917454860932L).get(null);
            Object[] var10001 = Registry.packArgs(new Bv2_2(this));
            long var5 = 434592463220957006L;
            Object[] var4 = var10001;
            Ref.h(434592463220957006L, var4, var5);

            try {
               ;
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }
         }

         var9 = var3;
      }

      return var9;
   }

   public void U() {
      int var1 = y();
      Object var10000 = this;
      if (var1 == 0) {
         var10000 = this.kD;
         Object[] var10001 = Registry.emptyArgs();
         long var3 = 577438617729885268L;
         Object[] var2 = var10001;
         var10001 = Ref.h(577438617729885268L, var2, var3);

         try {
            var6 = (Boolean)var10001;
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         if (var6) {
            this.k8.setText("\uf2d2");
            if (var1 == 0) {
               return;
            }
         }
      }

      ((ConnectionProperty)var10000).k8.setText("\uf2d0");
   }

   public void d$void() {
      int var1 = M$int();
      if (var1 == 0 || this.ks != null) {
         Object[] var10001 = Registry.emptyArgs();
         long var3 = 276614605741566746L;
         Object[] var2 = var10001;
         Ref.h(276614605741566746L, var2, var3);

         try {
            ;
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }
   }

   public void N$void() {
      int var1 = y();
      if (var1 != 0 || this.ks != null) {
         Object[] var10001 = Registry.emptyArgs();
         long var3 = 425852043545574804L;
         Object[] var2 = var10001;
         Ref.h(425852043545574804L, var2, var3);

         try {
            ;
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }
   }

   public boolean x$boolean() {
      boolean var2 = false;
      int var10000 = M$int();
      ConnectHost var3 = this.s$Fv_2().e();
      int var1 = var10000;
      ConnectHost var4 = var3;
      if (var1 != 0) {
         if (var3 == null) {
            return var2;
         }

         var4 = var3;
      }

      boolean var5 = var4.t$boolean();
      if (var1 == 0) {
         return var5;
      } else {
         if (var5) {
            var2 = true;
         }

         return var2;
      }
   }

   public void f() {
      int var1 = M$int();
      ConnectionProperty var10000 = this;
      if (var1 != 0) {
         if (!this.x$boolean()) {
            return;
         }

         var10000 = this;
      }

      var10000.s$Fv_2().e().G();
   }

   public boolean R() {
      boolean var2 = false;
      int var10000 = y();
      ConnectHost var3 = this.s$Fv_2().e();
      int var1 = var10000;
      ConnectHost var4 = var3;
      if (var1 == 0) {
         if (var3 == null) {
            return var2;
         }

         var4 = var3;
      }

      boolean var5 = var4.t$boolean();
      if (var1 != 0) {
         return var5;
      } else {
         if (!var5) {
            var5 = var3.i$boolean();
            if (var1 != 0) {
               return var5;
            }

            if (!var5) {
               var2 = true;
            }
         }

         return var2;
      }
   }

   public void M$void() {
      int var1;
      ConnectHost var2;
      label70: {
         int var10000 = M$int();
         var2 = null;
         Object var3 = null;
         var1 = var10000;
         Cj4 var8 = this.L;
         if (var1 != 0) {
            if (this.L == null) {
               break label70;
            }

            var8 = this.L;
         }

         var2 = var8.e();
         var3 = this.L.E();
      }

      label73: {
         label63: {
            ConnectionProperty var9 = this;
            if (var1 != 0) {
               if (this.L != null) {
                  break label63;
               }

               var9 = this;
            }

            var9.kp.setEnabled(false);
            if (var1 != 0) {
               break label73;
            }
         }

         label74: {
            ConnectHost var10 = var2;
            if (var1 != 0) {
               if (var2 == null) {
                  break label74;
               }

               var10 = var2;
            }

            boolean var11 = var10.t$boolean();
            if (var1 != 0) {
               if (var11) {
                  this.kp.setEnabled(true);
                  this.kp
                     .setForeground(
                        new Color(b(12885, 1876428350276104665L), b(26856, 2176266695700196215L), b(31572, 1260881872611489990L), b(8626, 2804569102082335272L))
                     );
                  if (var1 != 0) {
                     break label73;
                  }
               }

               var11 = var2.i$boolean();
            }

            if (var11) {
               this.kp.setEnabled(false);
               this.kp
                  .setForeground(
                     new Color(b(28894, 8264491818421891923L), b(9237, 1808066251772716956L), b(31572, 1260881872611489990L), b(16841, 4659263369232286278L))
                  );
               if (var1 != 0) {
                  break label73;
               }
            }

            this.kp.setEnabled(true);
            this.kp
               .setForeground(
                  new Color(b(10312, 2931098428869405656L), b(15127, 6311930962237094020L), b(16196, 5165013484950682845L), b(19836, 3118598093948817131L))
               );
            if (var1 != 0) {
               break label73;
            }
         }

         this.kp.setEnabled(true);
      }

      if (var1 == 0 || this.kM != null) {
         Object[] var10001 = Registry.emptyArgs();
         long var5 = 176235325809488947L;
         Object[] var4 = var10001;
         Ref.h(176235325809488947L, var4, var5);

         try {
            ;
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }
      }
   }

   public void n$void() {
      this.k5 = true;
      y();
      Registry.emptyArgs();
      long var4 = 270389152141252877L;
      Ref.h2(270389152141252877L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 399585344452154517L;
      Object[] var6 = var10003;
      var10003 = Ref.h(399585344452154517L, var6, var7);
      Object[] var10004 = Registry.emptyArgs();
      long var9 = 149968465491171480L;
      Object[] var8 = var10004;
      var10004 = Ref.h(149968465491171480L, var8, var9);

      try {
         var10004 = (NY)var10004;
      } catch (InvocationTargetException var44) {
         throw var44.getTargetException();
      }

      NY var2 = var10004;
      Object var1 = var10003;
      this.O$pA_3().b();
      this.O$pA_3().repaint();
      Color var48;
      ConnectionProperty var10007 = Registry.emptyArgs();
      long var11 = 605008073331144146L;
      Object[] var10 = var10007;
      var10007 = Ref.h(605008073331144146L, var10, var11);

      try {
         var10007 = (XF3)var10007;
      } catch (InvocationTargetException var43) {
         throw var43.getTargetException();
      }

      var2 = new Object(var10007.p());
      var48.setBackground(var48);
      ConnectionProperty var49 = this;
      if (var1 == null) {
         if (this.q$s() != null) {
            this.q$s();
            Object[] var10005 = Registry.emptyArgs();
            long var13 = 354504405546043996L;
            Object[] var12 = var10005;
            Ref.h(354504405546043996L, var12, var13);
            Object[] var10006 = Registry.emptyArgs();
            long var15 = 415642889349902360L;
            Object[] var14 = var10006;
            Ref.h(415642889349902360L, var14, var15);

            try {
               ;
            } catch (InvocationTargetException var42) {
               throw var42.getTargetException();
            }
         }

         var49 = this;
      }

      label151: {
         label146: {
            Object var51;
            label152: {
               if (var1 == null) {
                  if (var49.kD == null) {
                     break label146;
                  }

                  var51 = var1;
                  if (var1 == null) {
                     break label152;
                  }
               }

               Object[] var52 = Registry.emptyArgs();
               long var17 = 577438617729885268L;
               Object[] var16 = var52;
               var52 = Ref.h(577438617729885268L, var16, var17);

               try {
                  var54 = (Boolean)var52;
               } catch (InvocationTargetException var41) {
                  throw var41.getTargetException();
               }

               if (!var54) {
                  break label146;
               }

               var51 = this;
            }

            ((ConnectionProperty)var51).setBorder(null);
            if (var1 == null) {
               break label151;
            }
         }

         Color var3;
         label131: {
            var3 = new Color(b(24277, 3885012068565589315L), b(5102, 3033349893925785709L), b(5102, 3033349893925785709L));
            if (var1 == null) {
               Registry.emptyArgs();
               long var18 = 270389152141252877L;
               Ref.h2(270389152141252877L, var18);
               var10007 = Registry.emptyArgs();
               long var21 = 306266403902896148L;
               Object[] var20 = var10007;
               Ref.h(306266403902896148L, var20, var21);
               Object[] var10008 = Registry.emptyArgs();
               long var23 = 577875833820570498L;
               Object[] var22 = var10008;
               var10008 = Ref.h(577875833820570498L, var22, var23);

               try {
                  var62 = (Boolean)var10008;
               } catch (InvocationTargetException var40) {
                  throw var40.getTargetException();
               }

               if (!var62) {
                  break label131;
               }

               this.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 0, var3));
            }

            if (var1 == null) {
               break label151;
            }
         }

         this.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, var3));
      }

      Color var55;
      Object[] var10009 = Registry.emptyArgs();
      long var25 = 307147474512918572L;
      Object[] var24 = var10009;
      var10009 = Ref.h(307147474512918572L, var24, var25);

      try {
         var10009 = (XF3)var10009;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }

      var2 = new Object(var10009.p());
      var55.setForeground(var55);
      Color var59;
      Object[] var10010 = Registry.emptyArgs();
      long var27 = 605008073331144146L;
      Object[] var26 = var10010;
      var10010 = Ref.h(605008073331144146L, var26, var27);

      try {
         var10010 = (XF3)var10010;
      } catch (InvocationTargetException var38) {
         throw var38.getTargetException();
      }

      var2 = new Object(var10010.p());
      var59.setBackground(var59);
      var10007 = this;
      if (var1 == null) {
         var10007 = this.k7;
         Color var63;
         Object[] var10011 = Registry.emptyArgs();
         long var29 = 307147474512918572L;
         Object[] var28 = var10011;
         var10011 = Ref.h(307147474512918572L, var28, var29);

         try {
            var10011 = (XF3)var10011;
         } catch (InvocationTargetException var37) {
            throw var37.getTargetException();
         }

         var2 = new Object(var10011.p());
         var63.setCaretColor(var63);
         Registry.emptyArgs();
         long var30 = 270389152141252877L;
         Ref.h2(270389152141252877L, var30);
         var10010 = Registry.emptyArgs();
         long var33 = 306266403902896148L;
         Object[] var32 = var10010;
         Ref.h(306266403902896148L, var32, var33);
         var10011 = Registry.emptyArgs();
         long var35 = 224406316798891066L;
         Object[] var34 = var10011;
         var10011 = Ref.h(224406316798891066L, var34, var35);

         try {
            var73 = (Boolean)var10011;
         } catch (InvocationTargetException var36) {
            throw var36.getTargetException();
         }

         if (var73) {
            return;
         }
      }

      var10007.j();
   }

   public static GP g(String var0, boolean var1) {
      Registry.packArgs(var0);
      long var5 = 430295779561981133L;
      Object var10001 = Ref.h2(430295779561981133L, var5);

      try {
         var10001 = (GP)var10001;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      GP var3 = (GP)var10001;
      int var9 = y();
      Color var4 = (Color)Registry.lookupField(430697627377283751L).get(null);
      int var2 = var9;
      if (var2 == 0) {
         if (var1) {
            var4 = new Color(b(26856, 2176266695700196215L), b(26856, 2176266695700196215L), b(26856, 2176266695700196215L), b(19621, 5901431551834427185L));
         }

         var3.setForeground(var4);
         var3.t(new Color(b(12483, 1771628594758185795L), b(2448, 3933951253185907217L), b(8171, 5117605362525002857L)));
         var3.setBorder(BorderFactory.createEmptyBorder(0, 3, 0, 3));
      }

      return var3;
   }

   public static GP K(String var0) {
      return g(var0, false);
   }

   public JScrollBar G$JScrollBar() {
      return this.v;
   }

   public Ov4 T$ov_4() {
      return this.kl;
   }

   public void C$void() {
      this.kj.requestFocus();
   }

   public JScrollBar t$JScrollBar() {
      this.e = new JScrollBar();
      this.J = new Ym2(this);
      this.e.addAdjustmentListener(new Gv2(this));
      return this.e;
   }

   public void Z() {
      this.V.r().N();
      this.O.y();
      this.kj.C$void();
   }

   public void c$void() {
      this.V.r().s();
      this.O.l();
      this.kj.l$void();
   }

   public Ov4 d$ov_4() {
      Ov4 var1 = new Ov4();
      var1.t(this.kC.Q());
      return var1;
   }

   public SetBackgroundImagePanel F(@NotNull Rx4 var1, @NotNull Ov4 var2, @NotNull Im4 var3) {
      return new SetBackgroundImagePanel(var1, var3, var2);
   }

   @Deprecated(
      forRemoval = true
   )
   public PN k(Connect_2 var1) {
      return new PN(var1);
   }

   public DV3 g$dV_3() {
      return this.O$pA_3();
   }

   public SetBackgroundImagePanel O$pA_3() {
      return this.kj;
   }

   public Wq2_2 Y$Wq_2() {
      return this.W;
   }

   public void Y(@NotNull Fv2_2 var1) {
      US var3;
      label17: {
         label16: {
            int var10000 = y();
            this.L = (Cj4)var1;
            int var2 = var10000;
            this.L.m(this);
            Fv2_2 var5 = var1;
            if (var2 == 0) {
               if (!(var1 instanceof Yo2)) {
                  break label16;
               }

               var5 = var1;
            }

            List var4 = ((Yo2)var5).P();
            var3 = Ug2.s(var4);
            if (var2 == 0) {
               break label17;
            }
         }

         var3 = US.Unknown;
      }

      this.j.O(var3);
      this.V = this.y(this.O, this.L);
      this.kj.v(this.V);
   }

   public E0 y(@NotNull Connect_2 var1, @NotNull Fv2_2 var2) {
      return new E0(var1, var2, new HN(var2, this.W::O), this.W, this.kj);
   }

   public Fv2_2 s$Fv_2() {
      return this.L;
   }

   public QT O$QT() {
      return this.O;
   }

   @Override
   public void N(int var1) {
      label16: {
         int var2 = M$int();
         ConnectionProperty var10000 = this;
         if (var2 != 0) {
            if (this.kJ.get()) {
               break label16;
            }

            this.E = new Thread(new Ly2(this, var1));
            var10000 = this;
         }

         var10000.E.start();
         if (var2 != 0) {
            return;
         }
      }

      w.error(a(-24872, -25555));
   }

   public void W() {
      int var1 = y();
      ConnectionProperty var10000 = this;
      if (var1 == 0) {
         if (!this.kJ.get()) {
            return;
         }

         var10000 = this;
      }

      Thread var2 = var10000.E;
      if (var1 == 0) {
         if (var10000.E == null) {
            return;
         }

         var2 = this.E;
      }

      var2.interrupt();
   }

   public boolean I() {
      return this.kJ.get();
   }

   @Override
   public String c(LN var1, int var2) {
      return var1.W(this, var2);
   }

   public Im4 b$im_4() {
      return this.kj.H$im_4();
   }

   @Override
   public boolean requestFocusInWindow() {
      return this.kj.requestFocusInWindow();
   }

   @Override
   public void requestFocus() {
      this.kj.requestFocus();
   }

   public boolean v$boolean() {
      int var1 = M$int();
      boolean var10000 = this.I();
      if (var1 != 0) {
         var10000 = !var10000;
      }

      return var10000;
   }

   @Override
   public void W(Xn4 var1) {
      this.kj.H(var1);
   }

   @Override
   public ConnectionProperty f(Fv2_2 var1) {
      this.Y(var1);
      return this;
   }

   public JComponent M$JComponent() {
      return this;
   }

   public void q$void() {
      int var1 = y();
      Object var10000 = this;
      if (var1 == 0) {
         if (this.kS) {
            Registry.lookupField(440862887533695589L).get(null);
            Object[] var10001 = Registry.packArgs(this.kj);
            long var4 = 555197314594527477L;
            Object[] var3 = var10001;
            Ref.h(555197314594527477L, var3, var4);

            try {
               ;
            } catch (InvocationTargetException var38) {
               throw var38.getTargetException();
            }
         }

         this.W();
         var10000 = this.x;
         Object[] var39 = Registry.emptyArgs();
         long var6 = 558740654349097084L;
         Object[] var5 = var39;
         Ref.h(558740654349097084L, var5, var6);

         try {
            ;
         } catch (InvocationTargetException var37) {
            throw var37.getTargetException();
         }
      }

      if (var1 == 0) {
         if (((ConnectionProperty)var10000).V != null) {
            this.V.O();
         }

         var10000 = this;
      }

      if (var1 == 0) {
         if (((ConnectionProperty)var10000).L != null) {
            this.L.a();
         }

         var10000 = this;
      }

      if (var1 == 0) {
         if (((ConnectionProperty)var10000).O != null) {
            this.O.A$void();
         }

         var10000 = this;
      }

      if (var1 == 0) {
         if (((ConnectionProperty)var10000).kj != null) {
            this.kj.o();
         }

         var10000 = this.M;
         Object[] var40 = Registry.emptyArgs();
         long var8 = 185732389770126914L;
         Object[] var7 = var40;
         Ref.h(185732389770126914L, var7, var8);

         try {
            ;
         } catch (InvocationTargetException var36) {
            throw var36.getTargetException();
         }

         Object[] var10002 = Registry.emptyArgs();
         long var10 = 251467691578193043L;
         Object[] var9 = var10002;
         Ref.h(251467691578193043L, var9, var10);

         try {
            ;
         } catch (InvocationTargetException var35) {
            throw var35.getTargetException();
         }
      }

      if (var1 == 0) {
         if (var10000 != null) {
            this.kk.q$void();
         }

         var10000 = this;
      }

      if (var1 == 0) {
         if (((ConnectionProperty)var10000).N != null) {
            Object[] var41 = Registry.emptyArgs();
            long var12 = 543828975723397941L;
            Object[] var11 = var41;
            Ref.h(543828975723397941L, var11, var12);

            try {
               ;
            } catch (InvocationTargetException var34) {
               throw var34.getTargetException();
            }
         }

         var10000 = this;
      }

      if (var1 == 0) {
         if (((ConnectionProperty)var10000).kL != null) {
            Object[] var42 = Registry.emptyArgs();
            long var14 = 507279509275228372L;
            Object[] var13 = var42;
            Ref.h(507279509275228372L, var13, var14);

            try {
               ;
            } catch (InvocationTargetException var33) {
               throw var33.getTargetException();
            }
         }

         var10000 = this;
      }

      if (var1 == 0) {
         if (((ConnectionProperty)var10000).M != null) {
            Object[] var43 = Registry.emptyArgs();
            long var16 = 185732389770126914L;
            Object[] var15 = var43;
            Ref.h(185732389770126914L, var15, var16);

            try {
               ;
            } catch (InvocationTargetException var32) {
               throw var32.getTargetException();
            }
         }

         var10000 = this;
      }

      FilePanel var2 = ((ConnectionProperty)var10000).q$s();
      if (var1 == 0) {
         if (var2 != null) {
            Object[] var44 = Registry.emptyArgs();
            long var18 = 596995871768363771L;
            Object[] var17 = var44;
            Ref.h(596995871768363771L, var17, var18);

            try {
               ;
            } catch (InvocationTargetException var31) {
               throw var31.getTargetException();
            }
         }

         Registry.packArgs(this.b);
         long var19 = 242617331513341262L;
         Ref.h2(242617331513341262L, var19);

         try {
            ;
         } catch (InvocationTargetException var30) {
            throw var30.getTargetException();
         }

         this.j();
         Registry.packArgs(this.kY);
         long var21 = 242617331513341262L;
         Ref.h2(242617331513341262L, var21);

         try {
            ;
         } catch (InvocationTargetException var29) {
            throw var29.getTargetException();
         }

         this.J.C(this.e);
         Registry.packArgs(this.e);
         long var23 = 242617331513341262L;
         Ref.h2(242617331513341262L, var23);

         try {
            ;
         } catch (InvocationTargetException var28) {
            throw var28.getTargetException();
         }

         Registry.packArgs(this);
         long var25 = 242617331513341262L;
         Ref.h2(242617331513341262L, var25);

         try {
            ;
         } catch (InvocationTargetException var27) {
            throw var27.getTargetException();
         }

         System.gc();
         this.K();
      }
   }

   public List n$List() {
      return List.of(new AD_2(this.kC.h(), this::lambda$getActions$0).u(b(10740, 6265738062572415594L)));
   }

   public void l(String var1) {
      this.G.J(var1);
   }

   public void r() {
      int var1 = y();
      ConnectionProperty var10000 = this;
      if (var1 == 0) {
         if (this.kQ == null) {
            this.M = new Y3(this.kj);
            this.kQ = new BS(this.M);
            this.kj.F(this.M);
            EO var2 = new EO(this);
            this.kY.b(this.kQ, var2);
         }

         this.kY.validate();
         var10000 = this;
      }

      var10000.kY.doLayout();
   }

   public void z() {
      this.kQ.setVisible(false);
   }

   public void w() {
      Bq_2 var1 = this.G.l();
      var1.setVisible(false);
      this.b.revalidate();
      this.b.repaint();
      this.G = null;
      this.kj.z(null);
      this.kj.requestFocusInWindow();
   }

   public void Q() {
      label35: {
         int var10000 = y();
         this.kj.requestFocus();
         int var1 = var10000;
         D9 var2 = this.G;
         if (var1 == 0) {
            if (this.G == null) {
               ConnectionProperty var3 = this;
               if (var1 == 0) {
                  if (this.kN == null) {
                     this.kN = new Bq_2(this.U, this.kj);
                     this.kN.requestFocus();
                     this.kY.S(this.kN, 4, 1);
                  }

                  var3 = this;
               }

               var3.G = this.kN;
               if (var1 == 0) {
                  break label35;
               }
            }

            var2 = this.G;
         }

         Bq_2 var4 = var2.l();
         if (var1 == 0) {
            if (var4.r()) {
               this.G.l().setVisible(false);
               this.kj.requestFocusInWindow();
               if (var1 == 0) {
                  break label35;
               }
            }

            var4 = this.G.l();
         }

         var4.setVisible(true);
      }

      this.kY.validate();
      this.kY.doLayout();
      this.G.l().requestFocus();
      this.kN.s();
   }

   @NotNull
   public HH V$HH() {
      return new Xv4(this);
   }

   public void W(String var1, boolean var2) {
      WZ var3 = this.O.S(var1, var2);
      this.kj.z(var3);
      this.G.o(var3);
      this.v.repaint();
   }

   public CS3_2 c$cS_3() {
      return this.Z;
   }

   @Override
   public void Y(CS3_2 var1) {
      this.Z = var1;
   }

   public String p() {
      return this.D;
   }

   public void o(String var1) {
      this.D = var1;
   }

   public void s$void() {
      this.G.l().setVisible(false);
      this.kj.requestFocusInWindow();
      this.kN.s();
   }

   public com.finalshell.ui.frame.U x$U() {
      return this.kD;
   }

   public void W(com.finalshell.ui.frame.U var1) {
      this.kD = var1;
   }

   @Override
   public void M(Yl4 var1) {
      int var2 = M$int();
      if (var2 == 0 || this.kD != null) {
         Object[] var10001 = Registry.packArgs(var1);
         long var4 = 204214907302393435L;
         Object[] var3 = var10001;
         Ref.h(204214907302393435L, var3, var4);

         try {
            ;
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }
      }
   }

   public FilePanel q$s() {
      return this.ks;
   }

   public void K(FilePanel var1) {
      this.ks = var1;
   }

   public boolean u() {
      return this.s;
   }

   public void h(boolean var1) {
      this.s = var1;
   }

   public float H$float() {
      return this.k;
   }

   public void y(float var1) {
      this.k = var1;
   }

   public int O$int() {
      return this.kP;
   }

   public void M(int var1) {
      this.kP = var1;
   }

   public int N$int() {
      return this.d;
   }

   public Lv4_2 a() {
      return this.C;
   }

   public void H(Lv4_2 var1) {
      this.C = var1;
   }

   public Connect_2 J$IR() {
      return this.O;
   }

   public boolean g$boolean() {
      return this.kS;
   }

   public void o(boolean var1) {
      int var2 = y();
      ConnectionProperty var10000 = this;
      if (var2 == 0) {
         this.kS = var1;
         if (!var1) {
            return;
         }

         var10000 = this;
      }

      if (var2 == 0) {
         if (var10000.kL != null) {
            return;
         }

         var10000 = this;
      }

      var10000.kL = new CB(this.U);
   }

   public ConnectionProperty N$_y_2() {
      return this.kk;
   }

   public void W(ConnectionProperty var1) {
      this.kk = var1;
   }

   public CB t$CB() {
      return this.kL;
   }

   public void p(CB var1) {
      this.kL = var1;
   }

   public void V(Ty2 var1) {
      this.N = var1;
   }

   public Ty2 M$Ty_2() {
      return this.N;
   }

   @Override
   public T32 X() {
      return this.kM;
   }

   @Override
   public void U(T32 var1) {
      this.kM = var1;
   }

   public ConnectHost i$DI() {
      return this.P;
   }

   public void t(ConnectHost var1) {
      this.P = var1;
   }

   public ConnectHost G$DI() {
      int var10000 = M$int();
      Object var2 = null;
      int var1 = var10000;
      Fv2_2 var3 = this.U.s$Fv_2();
      if (var1 != 0) {
         if (var3 == null) {
            return (ConnectHost)var2;
         }

         var3 = this.U.s$Fv_2();
      }

      return var3.e();
   }

   public void o$void() {
      this.kj.requestFocus();
   }

   public Ff2 o$Ff_2() {
      return this.l;
   }

   public void c(Ff2 var1) {
      this.l = var1;
   }

   public Backspace H$F_() {
      return this.x;
   }

   public void J(Backspace var1) {
      this.x = var1;
   }

   @Deprecated
   @Nullable
   public E0 C$E0() {
      return this.V;
   }

   public void A(Bc2_2 var1) {
      this.Q.p(var1);
   }

   @Override
   public void r(UR_2 var1) {
      this.kq.add(var1);
   }

   @Override
   public void T(UR_2 var1) {
      this.kq.remove(var1);
   }

   @Override
   public void h$void() {
      this.kj = null;
      this.v = null;
      this.O = null;
      this.kJ = null;
      this.j = null;
      this.W = null;
      this.G = null;
      this.kz = null;
      this.L = null;
      this.V = null;
      this.E = null;
      this.kC = null;
      this.Z = null;
      this.b = null;
      this.Q = null;
      this.kq = null;
      this.kD = null;
      this.U = null;
      this.kk = null;
      this.ks = null;
      this.C = null;
      this.X = null;
      this.kL = null;
      this.N = null;
      this.kl = null;
      this.kY = null;
      this.kM = null;
      this.P = null;
      this.kW = null;
      this.kp = null;
      this.M = null;
      this.k8 = null;
      this.l = null;
      this.x = null;
      this.k7 = null;
      this.kb = null;
      this.I = null;
      this.o = null;
      this.m = null;
      this.A = null;
      this.J = null;
      this.e = null;
      this.kN = null;
      this.kQ = null;
      this.D = null;
   }

   @Override
   public void K() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new com.finalshell.task.X(this), Registry.lookupField(222883478649268280L).getInt(null));
      long var2 = 266288712085965362L;
      Object[] var1 = var10001;
      Ref.h(266288712085965362L, var1, var2);
   }

   public boolean lambda$getActions$0(KeyEvent var1) {
      this.Q();
      return true;
   }

   public static JLayeredPane j(ConnectionProperty var0) {
      return var0.b;
   }

   public static Cj4 D(ConnectionProperty var0) {
      return var0.L;
   }

   public static PN q(ConnectionProperty var0) {
      return var0.kz;
   }

   public static E0 s(ConnectionProperty var0) {
      return var0.V;
   }

   public static Logger J$Logger() {
      return w;
   }

   public static List f(ConnectionProperty var0) {
      return var0.kq;
   }

   static {
      __vfClinit__();
   }

   public static void W(int var0) {
      S = var0;
   }

   public static int y() {
      return S;
   }

   public static int M$int() {
      int var0 = y();
      return var0 == 0 ? 36 : 0;
   }

   public static SocketException a(SocketException var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -24892) & 65535;
      if (bb[var2] == null) {
         char[] var3 = ab[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 117;
               break;
            case 1:
               var10000 = 254;
               break;
            case 2:
               var10000 = 116;
               break;
            case 3:
               var10000 = 228;
               break;
            case 4:
               var10000 = 22;
               break;
            case 5:
               var10000 = 144;
               break;
            case 6:
               var10000 = 68;
               break;
            case 7:
               var10000 = 214;
               break;
            case 8:
               var10000 = 131;
               break;
            case 9:
               var10000 = 24;
               break;
            case 10:
               var10000 = 241;
               break;
            case 11:
               var10000 = 222;
               break;
            case 12:
               var10000 = 204;
               break;
            case 13:
               var10000 = 129;
               break;
            case 14:
               var10000 = 3;
               break;
            case 15:
               var10000 = 114;
               break;
            case 16:
               var10000 = 158;
               break;
            case 17:
               var10000 = 86;
               break;
            case 18:
               var10000 = 192;
               break;
            case 19:
               var10000 = 164;
               break;
            case 20:
               var10000 = 63;
               break;
            case 21:
               var10000 = 210;
               break;
            case 22:
               var10000 = 119;
               break;
            case 23:
               var10000 = 236;
               break;
            case 24:
               var10000 = 251;
               break;
            case 25:
               var10000 = 132;
               break;
            case 26:
               var10000 = 230;
               break;
            case 27:
               var10000 = 125;
               break;
            case 28:
               var10000 = 159;
               break;
            case 29:
               var10000 = 10;
               break;
            case 30:
               var10000 = 169;
               break;
            case 31:
               var10000 = 180;
               break;
            case 32:
               var10000 = 143;
               break;
            case 33:
               var10000 = 235;
               break;
            case 34:
               var10000 = 51;
               break;
            case 35:
               var10000 = 140;
               break;
            case 36:
               var10000 = 145;
               break;
            case 37:
               var10000 = 232;
               break;
            case 38:
               var10000 = 246;
               break;
            case 39:
               var10000 = 101;
               break;
            case 40:
               var10000 = 147;
               break;
            case 41:
               var10000 = 110;
               break;
            case 42:
               var10000 = 203;
               break;
            case 43:
               var10000 = 8;
               break;
            case 44:
               var10000 = 196;
               break;
            case 45:
               var10000 = 218;
               break;
            case 46:
               var10000 = 49;
               break;
            case 47:
               var10000 = 29;
               break;
            case 48:
               var10000 = 76;
               break;
            case 49:
               var10000 = 102;
               break;
            case 50:
               var10000 = 200;
               break;
            case 51:
               var10000 = 209;
               break;
            case 52:
               var10000 = 40;
               break;
            case 53:
               var10000 = 55;
               break;
            case 54:
               var10000 = 98;
               break;
            case 55:
               var10000 = 75;
               break;
            case 56:
               var10000 = 247;
               break;
            case 57:
               var10000 = 91;
               break;
            case 58:
               var10000 = 13;
               break;
            case 59:
               var10000 = 122;
               break;
            case 60:
               var10000 = 175;
               break;
            case 61:
               var10000 = 166;
               break;
            case 62:
               var10000 = 39;
               break;
            case 63:
               var10000 = 19;
               break;
            case 64:
               var10000 = 26;
               break;
            case 65:
               var10000 = 34;
               break;
            case 66:
               var10000 = 229;
               break;
            case 67:
               var10000 = 202;
               break;
            case 68:
               var10000 = 157;
               break;
            case 69:
               var10000 = 170;
               break;
            case 70:
               var10000 = 27;
               break;
            case 71:
               var10000 = 135;
               break;
            case 72:
               var10000 = 124;
               break;
            case 73:
               var10000 = 90;
               break;
            case 74:
               var10000 = 141;
               break;
            case 75:
               var10000 = 118;
               break;
            case 76:
               var10000 = 223;
               break;
            case 77:
               var10000 = 32;
               break;
            case 78:
               var10000 = 179;
               break;
            case 79:
               var10000 = 224;
               break;
            case 80:
               var10000 = 109;
               break;
            case 81:
               var10000 = 100;
               break;
            case 82:
               var10000 = 0;
               break;
            case 83:
               var10000 = 7;
               break;
            case 84:
               var10000 = 150;
               break;
            case 85:
               var10000 = 41;
               break;
            case 86:
               var10000 = 17;
               break;
            case 87:
               var10000 = 59;
               break;
            case 88:
               var10000 = 104;
               break;
            case 89:
               var10000 = 225;
               break;
            case 90:
               var10000 = 115;
               break;
            case 91:
               var10000 = 73;
               break;
            case 92:
               var10000 = 151;
               break;
            case 93:
               var10000 = 126;
               break;
            case 94:
               var10000 = 16;
               break;
            case 95:
               var10000 = 189;
               break;
            case 96:
               var10000 = 69;
               break;
            case 97:
               var10000 = 201;
               break;
            case 98:
               var10000 = 4;
               break;
            case 99:
               var10000 = 95;
               break;
            case 100:
               var10000 = 18;
               break;
            case 101:
               var10000 = 248;
               break;
            case 102:
               var10000 = 42;
               break;
            case 103:
               var10000 = 205;
               break;
            case 104:
               var10000 = 108;
               break;
            case 105:
               var10000 = 77;
               break;
            case 106:
               var10000 = 165;
               break;
            case 107:
               var10000 = 207;
               break;
            case 108:
               var10000 = 153;
               break;
            case 109:
               var10000 = 183;
               break;
            case 110:
               var10000 = 85;
               break;
            case 111:
               var10000 = 123;
               break;
            case 112:
               var10000 = 138;
               break;
            case 113:
               var10000 = 78;
               break;
            case 114:
               var10000 = 178;
               break;
            case 115:
               var10000 = 97;
               break;
            case 116:
               var10000 = 70;
               break;
            case 117:
               var10000 = 245;
               break;
            case 118:
               var10000 = 176;
               break;
            case 119:
               var10000 = 64;
               break;
            case 120:
               var10000 = 250;
               break;
            case 121:
               var10000 = 186;
               break;
            case 122:
               var10000 = 80;
               break;
            case 123:
               var10000 = 130;
               break;
            case 124:
               var10000 = 156;
               break;
            case 125:
               var10000 = 53;
               break;
            case 126:
               var10000 = 161;
               break;
            case 127:
               var10000 = 84;
               break;
            case 128:
               var10000 = 25;
               break;
            case 129:
               var10000 = 173;
               break;
            case 130:
               var10000 = 152;
               break;
            case 131:
               var10000 = 255;
               break;
            case 132:
               var10000 = 193;
               break;
            case 133:
               var10000 = 47;
               break;
            case 134:
               var10000 = 133;
               break;
            case 135:
               var10000 = 121;
               break;
            case 136:
               var10000 = 82;
               break;
            case 137:
               var10000 = 242;
               break;
            case 138:
               var10000 = 57;
               break;
            case 139:
               var10000 = 160;
               break;
            case 140:
               var10000 = 134;
               break;
            case 141:
               var10000 = 15;
               break;
            case 142:
               var10000 = 168;
               break;
            case 143:
               var10000 = 44;
               break;
            case 144:
               var10000 = 2;
               break;
            case 145:
               var10000 = 21;
               break;
            case 146:
               var10000 = 136;
               break;
            case 147:
               var10000 = 50;
               break;
            case 148:
               var10000 = 120;
               break;
            case 149:
               var10000 = 38;
               break;
            case 150:
               var10000 = 191;
               break;
            case 151:
               var10000 = 93;
               break;
            case 152:
               var10000 = 87;
               break;
            case 153:
               var10000 = 28;
               break;
            case 154:
               var10000 = 252;
               break;
            case 155:
               var10000 = 139;
               break;
            case 156:
               var10000 = 154;
               break;
            case 157:
               var10000 = 231;
               break;
            case 158:
               var10000 = 66;
               break;
            case 159:
               var10000 = 99;
               break;
            case 160:
               var10000 = 128;
               break;
            case 161:
               var10000 = 187;
               break;
            case 162:
               var10000 = 67;
               break;
            case 163:
               var10000 = 74;
               break;
            case 164:
               var10000 = 89;
               break;
            case 165:
               var10000 = 220;
               break;
            case 166:
               var10000 = 94;
               break;
            case 167:
               var10000 = 52;
               break;
            case 168:
               var10000 = 227;
               break;
            case 169:
               var10000 = 215;
               break;
            case 170:
               var10000 = 43;
               break;
            case 171:
               var10000 = 11;
               break;
            case 172:
               var10000 = 216;
               break;
            case 173:
               var10000 = 54;
               break;
            case 174:
               var10000 = 148;
               break;
            case 175:
               var10000 = 149;
               break;
            case 176:
               var10000 = 96;
               break;
            case 177:
               var10000 = 105;
               break;
            case 178:
               var10000 = 226;
               break;
            case 179:
               var10000 = 213;
               break;
            case 180:
               var10000 = 107;
               break;
            case 181:
               var10000 = 172;
               break;
            case 182:
               var10000 = 174;
               break;
            case 183:
               var10000 = 177;
               break;
            case 184:
               var10000 = 212;
               break;
            case 185:
               var10000 = 14;
               break;
            case 186:
               var10000 = 12;
               break;
            case 187:
               var10000 = 106;
               break;
            case 188:
               var10000 = 61;
               break;
            case 189:
               var10000 = 155;
               break;
            case 190:
               var10000 = 65;
               break;
            case 191:
               var10000 = 167;
               break;
            case 192:
               var10000 = 171;
               break;
            case 193:
               var10000 = 185;
               break;
            case 194:
               var10000 = 83;
               break;
            case 195:
               var10000 = 199;
               break;
            case 196:
               var10000 = 6;
               break;
            case 197:
               var10000 = 35;
               break;
            case 198:
               var10000 = 37;
               break;
            case 199:
               var10000 = 79;
               break;
            case 200:
               var10000 = 9;
               break;
            case 201:
               var10000 = 56;
               break;
            case 202:
               var10000 = 60;
               break;
            case 203:
               var10000 = 111;
               break;
            case 204:
               var10000 = 197;
               break;
            case 205:
               var10000 = 243;
               break;
            case 206:
               var10000 = 188;
               break;
            case 207:
               var10000 = 208;
               break;
            case 208:
               var10000 = 195;
               break;
            case 209:
               var10000 = 162;
               break;
            case 210:
               var10000 = 137;
               break;
            case 211:
               var10000 = 62;
               break;
            case 212:
               var10000 = 184;
               break;
            case 213:
               var10000 = 190;
               break;
            case 214:
               var10000 = 206;
               break;
            case 215:
               var10000 = 240;
               break;
            case 216:
               var10000 = 211;
               break;
            case 217:
               var10000 = 20;
               break;
            case 218:
               var10000 = 33;
               break;
            case 219:
               var10000 = 45;
               break;
            case 220:
               var10000 = 31;
               break;
            case 221:
               var10000 = 194;
               break;
            case 222:
               var10000 = 71;
               break;
            case 223:
               var10000 = 46;
               break;
            case 224:
               var10000 = 181;
               break;
            case 225:
               var10000 = 1;
               break;
            case 226:
               var10000 = 217;
               break;
            case 227:
               var10000 = 5;
               break;
            case 228:
               var10000 = 238;
               break;
            case 229:
               var10000 = 127;
               break;
            case 230:
               var10000 = 113;
               break;
            case 231:
               var10000 = 142;
               break;
            case 232:
               var10000 = 233;
               break;
            case 233:
               var10000 = 103;
               break;
            case 234:
               var10000 = 23;
               break;
            case 235:
               var10000 = 48;
               break;
            case 236:
               var10000 = 58;
               break;
            case 237:
               var10000 = 221;
               break;
            case 238:
               var10000 = 72;
               break;
            case 239:
               var10000 = 253;
               break;
            case 240:
               var10000 = 239;
               break;
            case 241:
               var10000 = 198;
               break;
            case 242:
               var10000 = 81;
               break;
            case 243:
               var10000 = 92;
               break;
            case 244:
               var10000 = 163;
               break;
            case 245:
               var10000 = 146;
               break;
            case 246:
               var10000 = 36;
               break;
            case 247:
               var10000 = 234;
               break;
            case 248:
               var10000 = 237;
               break;
            case 249:
               var10000 = 249;
               break;
            case 250:
               var10000 = 244;
               break;
            case 251:
               var10000 = 30;
               break;
            case 252:
               var10000 = 88;
               break;
            case 253:
               var10000 = 112;
               break;
            case 254:
               var10000 = 182;
               break;
            default:
               var10000 = 219;
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

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17304;
      if (fb[var3] == null) {
         fb[var3] = (int)(eb[var3] ^ var1);
      }

      return fb[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[30];
      int var11 = 0;
      String var10 = "bCÁë3\u0002庺梒\u0010\"õâ.a\u009dñ/Ã[*0£\u0006Ð\u000e\u0007\u0005«\u009d_~'\u009c\tü\u0018óeª\u0094\u0004<\u0016\u000f thèÙ%c\tÝ\u008bD\u0095%\u0092P\u000f»þ\u001b¹·\u000f¢Eg=÷·\u001a÷ÿ\u0004攋亐符瑪\u0002辱描\u0003\u009e\n\u008c\"!êH;Ý_ãNÈ\u007fI½Ç¦\u0019a~v5\u0000^õò:E4L\u00875\u0013=ï\u000bS\u0002再岾\u0003*vË\u0005Þ+óÀ\u009c\u0005ÂCÉ\u0093\u0006\r¥ÝNí0\nT\u0090ÎE\u0007h\u000e\u0007:ßzÞ\u0091÷\u001d\u0002柘戚\u0010\u007fä+\u009fP¬Ë\u00ad\u0014(y:ÍíbD\u0004迁捛峲怋\u0005P¾:´Q\u000eÜ\"=Ô\u009aÂ\u008eÅ,/×·\u001c÷\u0002君亩\u0002妿勰 \u001a}ÒTeh\u0006Ö9æ\u001a\u0088\f}1ûÜ)b¬K\u0088û\u0080\u0084/rO\u0095\u0010\u008e?\u0002籒赈\u0006òð|&\u008a\u0006\u0004Ø¹ÇF";
      int var12 = "bCÁë3\u0002庺梒\u0010\"õâ.a\u009dñ/Ã[*0£\u0006Ð\u000e\u0007\u0005«\u009d_~'\u009c\tü\u0018óeª\u0094\u0004<\u0016\u000f thèÙ%c\tÝ\u008bD\u0095%\u0092P\u000f»þ\u001b¹·\u000f¢Eg=÷·\u001a÷ÿ\u0004攋亐符瑪\u0002辱描\u0003\u009e\n\u008c\"!êH;Ý_ãNÈ\u007fI½Ç¦\u0019a~v5\u0000^õò:E4L\u00875\u0013=ï\u000bS\u0002再岾\u0003*vË\u0005Þ+óÀ\u009c\u0005ÂCÉ\u0093\u0006\r¥ÝNí0\nT\u0090ÎE\u0007h\u000e\u0007:ßzÞ\u0091÷\u001d\u0002柘戚\u0010\u007fä+\u009fP¬Ë\u00ad\u0014(y:ÍíbD\u0004迁捛峲怋\u0005P¾:´Q\u000eÜ\"=Ô\u009aÂ\u008eÅ,/×·\u001c÷\u0002君亩\u0002妿勰 \u001a}ÒTeh\u0006Ö9æ\u001a\u0088\f}1ûÜ)b¬K\u0088û\u0080\u0084/rO\u0095\u0010\u008e?\u0002籒赈\u0006òð|&\u008a\u0006\u0004Ø¹ÇF"
         .length();
      char var9 = 5;
      int var17 = -1;
      W(0);

      label70:
      while (true) {
         byte var10000 = 88;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 69;
                        break;
                     case 1:
                        var65 = 9;
                        break;
                     case 2:
                        var65 = 106;
                        break;
                     case 3:
                        var65 = 36;
                        break;
                     case 4:
                        var65 = 74;
                        break;
                     case 5:
                        var65 = 53;
                        break;
                     default:
                        var65 = 29;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     ab = var13;
                     bb = new String[30];
                     long var0 = 8281488511029061715L;
                     long[] var6 = new long[28];
                     int var3 = 0;
                     String var4 = "\u0011Ãj\u00801Ð\u0098\u0010¯-\u0017gAËÔ¼9ëôÊZúÊ³ºrOFþ(q\u0099 =\u0095\u0089(DÆ\u0004TÔ©¨\u008fUU\u0019)¤O»|\u0018B\u007f¤cN\"êä\u0083Þáú^\u0091¡*Ãtû\u0092F¦\u009e\u0006\u0015»`¤\u0003$\u0097á\u0010\u0081\u0086(\"]Í³ÐåÔa\u0086\u009bÞ\u0002'ôÅj\u0084¥ÖAåTæ\u001b\f-é¨µÓk\"\u009d2ìZ&\u0006ÿS`\u0093{ã¤F3¼{4D\u0015O\u0013O Élc[\u000bçNe¶0ce=Lä\u0093ìtÿðY\u009e\u0004\"\u0017åáu\u001bd \u001e¢¾ÜÔ±hÒÌM¸YI*Ý§lÂ@g!Ûñ:ºÚ{\u000e\u0084âö";
                     int var5 = "\u0011Ãj\u00801Ð\u0098\u0010¯-\u0017gAËÔ¼9ëôÊZúÊ³ºrOFþ(q\u0099 =\u0095\u0089(DÆ\u0004TÔ©¨\u008fUU\u0019)¤O»|\u0018B\u007f¤cN\"êä\u0083Þáú^\u0091¡*Ãtû\u0092F¦\u009e\u0006\u0015»`¤\u0003$\u0097á\u0010\u0081\u0086(\"]Í³ÐåÔa\u0086\u009bÞ\u0002'ôÅj\u0084¥ÖAåTæ\u001b\f-é¨µÓk\"\u009d2ìZ&\u0006ÿS`\u0093{ã¤F3¼{4D\u0015O\u0013O Élc[\u000bçNe¶0ce=Lä\u0093ìtÿðY\u009e\u0004\"\u0017åáu\u001bd \u001e¢¾ÜÔ±hÒÌM¸YI*Ý§lÂ@g!Ûñ:ºÚ{\u000e\u0084âö"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    eb = var6;
                                    fb = new Integer[28];
                                    w = LoggerFactory.getLogger(ConnectionProperty.class);
                                    n = null;
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "#öÒ\u001bê²t`\u0084ÎÂ6U·øý";
                                 var5 = "#öÒ\u001bê²t`\u0084ÎÂ6U·øý".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "ã\u0005\u0003^b.2KL\u0097Å\u0090´.\u0082¦2à[\u0016¨Bm}Ê\u0002mEÑ\u009b9?\tþ²54ëªÁb\t\bó>ôF\u008f`\u0015}\u0006\u0095é#)咳乻輞农î n\b卭凷Uâ©u分捬\"\fmÆ卵变\u0095Ê\u0094\t赪弴x咮丈ÅÐ8+兡闆窏厅X\\";
                  var12 = "ã\u0005\u0003^b.2KL\u0097Å\u0090´.\u0082¦2à[\u0016¨Bm}Ê\u0002mEÑ\u009b9?\tþ²54ëªÁb\t\bó>ôF\u008f`\u0015}\u0006\u0095é#)咳乻輞农î n\b卭凷Uâ©u分捬\"\fmÆ卵变\u0095Ê\u0094\t赪弴x咮丈ÅÐ8+兡闆窏厅X\\"
                     .length();
                  var9 = '7';
                  var17 = -1;
            }

            var10000 = 46;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}






