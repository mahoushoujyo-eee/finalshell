package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.GS;
import com.finalshell.ui.model.On4;
import com.finalshell.ui.model.PG3;
import com.finalshell.ui.model.RP3;
import com.finalshell.ui.model.WF3;
import com.finalshell.ui.model.YT;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.Ky4;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Connect_2 implements QT, IY3, Ab2 {
   public static Logger f;
   public static int a;
   public static int d;
   public int P;
   public int Z;
   public volatile int k = 0;
   public volatile int V = 1;
   public int A;
   public int S;
   public DV3 N;
   public Im4 O;
   public Ov4 j;
   public XQ U = null;
   public EnumSet w = EnumSet.noneOf(com.finalshell.ui.model.NZ.class);
   public Nk4 W;
   public Stack Y = new Stack();
   public XV3 G;
   public R3 F;
   public On4 e = On4.MOUSE_FORMAT_XTERM;
   @Nullable
   public PD3 D = null;
   public YT d2;
   public XE p;
   public boolean o;
   ConnectionProperty r;
   String z;
   String c;
   String m;
   int B;
   StringBuffer i;
   ArrayList u;
   String H;
   String X;
   boolean t;
   boolean K;
   boolean Q;
   long b;
   Thread L;
   int g;
   int M;
   long I;
   boolean J;
   String h;
   boolean dD;
   long R;
   String n;
   boolean y;
   String q;
   Object T;
   boolean dH;
   String E;
   public List l;
   int C;
   long s;
   int v;
   public XQ x;
   public static String[] ab;
   public static String[] bb;
   public static long[] cb;
   public static Integer[] db;
   public static long eb;

   public String i$String() {
      return this.H;
   }

   public String u() {
      return this.X;
   }

   public String U() {
      return this.h;
   }

   public Connect_2(DV3 var1, Im4 var2, Ov4 var3) {
      boolean var10000 = com.finalshell.ui.model.J2.P();
      this.d2 = YT.MOUSE_REPORTING_NONE;
      this.p = null;
      this.i = new StringBuffer();
      this.u = new ArrayList();
      this.t = true;
      this.K = false;
      this.Q = false;
      this.g = -1;
      this.M = 0;
      this.J = true;
      this.dD = false;
      this.n = "";
      this.y = true;
      this.T = new Object();
      this.dH = false;
      this.E = "";
      this.l = new CopyOnWriteArrayList();
      this.C = 0;
      this.v = a(25172, 5946706806784439709L);
      this.x = null;
      this.W = new Nk4(GS.t());
      this.N = var1;
      this.O = var2;
      this.j = var3;
      this.A = var1.U$int();
      this.S = var1.L();
      this.P = 1;
      boolean var4 = var10000;

      try {
         this.Z = this.S;
         this.G = new Xc2(this.A);
         this.F = new R3();
         this.V$void();
         if (var4) {
            Ky4.K(new String[2]);
         }
      } catch (IllegalArgumentException var5) {
         throw a(var5);
      }
   }

   public void G(ConnectionProperty var1) {
      this.r = var1;
   }

   public void A$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 04: invokevirtual com/finalshell/core/Im4.W$void ()V
      // 07: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 0a: aload 0
      // 0b: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 0e: invokevirtual com/finalshell/core/Im4.c$void ()V
      // 11: istore 1
      // 12: aload 0
      // 13: iload 1
      // 14: ifne 33
      // 17: getfield com/finalshell/core/Connect_2.L Ljava/lang/Thread;
      // 1a: ifnull 32
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 0
      // 25: getfield com/finalshell/core/Connect_2.L Ljava/lang/Thread;
      // 28: invokevirtual java/lang/Thread.interrupt ()V
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: aload 0
      // 33: invokevirtual com/finalshell/core/Connect_2.I$void ()V
      // 36: return
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
      // 00: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 56
      // 09: getfield com/finalshell/core/Connect_2.dH Z
      // 0c: ifeq 5b
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: bipush 0
      // 18: putfield com/finalshell/core/Connect_2.dH Z
      // 1b: aload 0
      // 1c: getfield com/finalshell/core/Connect_2.L Ljava/lang/Thread;
      // 1f: invokevirtual java/lang/Thread.interrupt ()V
      // 22: aload 0
      // 23: bipush 0
      // 24: invokevirtual com/finalshell/core/Connect_2.d (I)V
      // 27: aload 0
      // 28: getfield com/finalshell/core/Connect_2.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 2b: invokevirtual com/finalshell/ui/panel/ConnectionProperty.O$QT ()Lcom/finalshell/core/QT;
      // 2e: invokeinterface com/finalshell/core/QT.K ()V 1
      // 33: aload 0
      // 34: getfield com/finalshell/core/Connect_2.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 37: invokevirtual com/finalshell/ui/panel/ConnectionProperty.O$QT ()Lcom/finalshell/core/QT;
      // 3a: sipush -2816
      // 3d: sipush -6100
      // 40: invokestatic com/finalshell/core/Connect_2.a (II)Ljava/lang/String;
      // 43: invokeinterface com/finalshell/core/QT.a (Ljava/lang/String;)V 2
      // 48: aload 0
      // 49: getfield com/finalshell/core/Connect_2.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 4c: invokevirtual com/finalshell/ui/panel/ConnectionProperty.O$QT ()Lcom/finalshell/core/QT;
      // 4f: goto 56
      // 52: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: invokeinterface com/finalshell/core/QT.K ()V 1
      // 5b: return
   }

   public void l() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 54
      // 09: getfield com/finalshell/core/Connect_2.dH Z
      // 0c: ifne 5a
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Connect_2.N Lcom/finalshell/core/DV3;
      // 1a: bipush 1
      // 1b: invokeinterface com/finalshell/core/DV3.G (Z)V 2
      // 20: aload 0
      // 21: getfield com/finalshell/core/Connect_2.N Lcom/finalshell/core/DV3;
      // 24: bipush 1
      // 25: invokeinterface com/finalshell/core/DV3.N (Z)V 2
      // 2a: aload 0
      // 2b: bipush 1
      // 2c: putfield com/finalshell/core/Connect_2.dH Z
      // 2f: aload 0
      // 30: ldc ""
      // 32: putfield com/finalshell/core/Connect_2.n Ljava/lang/String;
      // 35: aload 0
      // 36: lconst_0
      // 37: putfield com/finalshell/core/Connect_2.R J
      // 3a: aload 0
      // 3b: ldc ""
      // 3d: putfield com/finalshell/core/Connect_2.h Ljava/lang/String;
      // 40: aload 0
      // 41: new com/finalshell/task/Gl2
      // 44: dup
      // 45: aload 0
      // 46: invokespecial com/finalshell/task/Gl2.<init> (Lcom/finalshell/core/Connect_2;)V
      // 49: putfield com/finalshell/core/Connect_2.L Ljava/lang/Thread;
      // 4c: aload 0
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: getfield com/finalshell/core/Connect_2.L Ljava/lang/Thread;
      // 57: invokevirtual java/lang/Thread.start ()V
      // 5a: return
   }

   void G() {
   }

   void N(String var1) {
   }

   public boolean z(com.finalshell.ui.model.NZ var1) {
      return this.w.contains(var1);
   }

   public void x$void() {
      this.N(a(-2795, -12347));
      this.t = false;
      this.N.G(true);
      this.N.N(false);
   }

   @Override
   public void k(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/finalshell/core/Connect_2.k I
      // 04: istore 3
      // 05: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 08: aload 0
      // 09: invokestatic java/lang/System.currentTimeMillis ()J
      // 0c: putfield com/finalshell/core/Connect_2.b J
      // 0f: istore 2
      // 10: aload 0
      // 11: aload 0
      // 12: aload 1
      // 13: invokespecial com/finalshell/core/Connect_2.l$arrchar (Ljava/lang/String;)[C
      // 16: invokespecial com/finalshell/core/Connect_2.u ([C)V
      // 19: aload 0
      // 1a: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 1d: aload 0
      // 1e: getfield com/finalshell/core/Connect_2.V I
      // 21: bipush 2
      // 22: isub
      // 23: invokevirtual com/finalshell/core/Im4.D (I)Lcom/finalshell/core/DC3;
      // 26: astore 4
      // 28: aload 0
      // 29: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 2c: aload 0
      // 2d: getfield com/finalshell/core/Connect_2.V I
      // 30: bipush 1
      // 31: isub
      // 32: invokevirtual com/finalshell/core/Im4.D (I)Lcom/finalshell/core/DC3;
      // 35: astore 5
      // 37: aload 5
      // 39: invokevirtual com/finalshell/core/DC3.V$String ()Ljava/lang/String;
      // 3c: astore 6
      // 3e: aload 4
      // 40: invokevirtual com/finalshell/core/DC3.V$String ()Ljava/lang/String;
      // 43: astore 7
      // 45: aload 0
      // 46: getfield com/finalshell/core/Connect_2.t Z
      // 49: iload 2
      // 4a: ifne 75
      // 4d: ifne aa
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56: athrow
      // 57: aload 6
      // 59: ldc_w "@"
      // 5c: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 5f: aload 6
      // 61: sipush -2807
      // 64: sipush -25050
      // 67: invokestatic com/finalshell/core/Connect_2.a (II)Ljava/lang/String;
      // 6a: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 6d: iand
      // 6e: goto 75
      // 71: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: iload 2
      // 76: ifne 9b
      // 79: ifne 9e
      // 7c: goto 83
      // 7f: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 82: athrow
      // 83: aload 6
      // 85: ldc_w "@"
      // 88: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 8b: aload 6
      // 8d: ldc_w "$"
      // 90: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 93: iand
      // 94: goto 9b
      // 97: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9a: athrow
      // 9b: ifeq aa
      // 9e: aload 0
      // 9f: bipush 1
      // a0: putfield com/finalshell/core/Connect_2.t Z
      // a3: goto aa
      // a6: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a9: athrow
      // aa: goto b4
      // ad: astore 4
      // af: aload 4
      // b1: invokevirtual java/lang/Exception.printStackTrace ()V
      // b4: aload 0
      // b5: aload 1
      // b6: putfield com/finalshell/core/Connect_2.E Ljava/lang/String;
      // b9: return
   }

   public void L(String var1) {
      this.K = true;
      boolean var10000 = com.finalshell.ui.model.J2.g();
      this.H = var1;
      String var3 = var1;
      Iterator var4 = this.u.iterator();
      boolean var2 = var10000;

      while (true) {
         if (var4.hasNext()) {
            String var5 = (String)var4.next();
            Registry.packArgs(var3, var5);
            long var6 = 366583999691715222L;
            Object var10001 = Ref.h2(366583999691715222L, var6);

            try {
               var10001 = (String)var10001;
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            var3 = (String)var10001;

            try {
               if (!var2) {
                  break;
               }

               if (var2) {
                  continue;
               }
            } catch (IllegalArgumentException var9) {
               throw a(var9);
            }
         }

         this.X = var3;
         break;
      }
   }

   void l$void(String var1) {
      String var2 = "";
      if (!var1.startsWith("/")) {
      }
   }

   @Override
   public void o(com.finalshell.ui.model.NZ param1, boolean param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 03: istore 3
      // 04: iload 2
      // 05: iload 3
      // 06: ifeq 36
      // 09: ifeq 27
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 0
      // 14: getfield com/finalshell/core/Connect_2.w Ljava/util/EnumSet;
      // 17: aload 1
      // 18: invokevirtual java/util/EnumSet.add (Ljava/lang/Object;)Z
      // 1b: pop
      // 1c: iload 3
      // 1d: ifne 37
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: aload 0
      // 28: getfield com/finalshell/core/Connect_2.w Ljava/util/EnumSet;
      // 2b: aload 1
      // 2c: invokevirtual java/util/EnumSet.remove (Ljava/lang/Object;)Z
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: pop
      // 37: aload 1
      // 38: aload 0
      // 39: iload 2
      // 3a: invokevirtual com/finalshell/ui/model/NZ.r (Lcom/finalshell/core/QT;Z)V
      // 3d: return
   }

   public void f() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/Connect_2.k I
      // 08: iload 1
      // 09: ifeq 49
      // 0c: aload 0
      // 0d: getfield com/finalshell/core/Connect_2.A I
      // 10: if_icmplt 6e
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: aload 0
      // 1b: bipush 0
      // 1c: putfield com/finalshell/core/Connect_2.k I
      // 1f: aload 0
      // 20: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 23: aload 0
      // 24: getfield com/finalshell/core/Connect_2.V I
      // 27: bipush 1
      // 28: isub
      // 29: invokevirtual com/finalshell/core/Im4.D (I)Lcom/finalshell/core/DC3;
      // 2c: aload 0
      // 2d: getfield com/finalshell/core/Connect_2.A I
      // 30: invokevirtual com/finalshell/core/DC3.d (I)V
      // 33: aload 0
      // 34: iload 1
      // 35: ifeq 65
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: invokevirtual com/finalshell/core/Connect_2.Q$boolean ()Z
      // 42: goto 49
      // 45: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48: athrow
      // 49: ifeq 6e
      // 4c: aload 0
      // 4d: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 50: aload 0
      // 51: getfield com/finalshell/core/Connect_2.V I
      // 54: bipush 1
      // 55: isub
      // 56: invokevirtual com/finalshell/core/Im4.D (I)Lcom/finalshell/core/DC3;
      // 59: bipush 1
      // 5a: invokevirtual com/finalshell/core/DC3.M (Z)V
      // 5d: aload 0
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: dup
      // 66: getfield com/finalshell/core/Connect_2.V I
      // 69: bipush 1
      // 6a: iadd
      // 6b: putfield com/finalshell/core/Connect_2.V I
      // 6e: return
   }

   public void E() {
      this.N.x(this.k, this.V);
      this.d();
   }

   public void u(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 03: aload 0
      // 04: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 07: invokevirtual com/finalshell/core/Im4.w ()V
      // 0a: istore 2
      // 0b: aload 0
      // 0c: getfield com/finalshell/core/Connect_2.o Z
      // 0f: iload 2
      // 10: ifne 80
      // 13: ifeq 6b
      // 16: goto 1d
      // 19: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: aload 1
      // 1e: arraylength
      // 1f: iload 2
      // 20: ifne 80
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: ifle 6b
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aload 0
      // 35: bipush 0
      // 36: putfield com/finalshell/core/Connect_2.o Z
      // 39: aload 0
      // 3a: getfield com/finalshell/core/Connect_2.V I
      // 3d: iload 2
      // 3e: ifne 80
      // 41: goto 48
      // 44: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: bipush 1
      // 49: if_icmple 6b
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: aload 0
      // 54: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 57: aload 0
      // 58: getfield com/finalshell/core/Connect_2.V I
      // 5b: bipush 2
      // 5c: isub
      // 5d: invokevirtual com/finalshell/core/Im4.D (I)Lcom/finalshell/core/DC3;
      // 60: bipush 0
      // 61: invokevirtual com/finalshell/core/DC3.M (Z)V
      // 64: goto 6b
      // 67: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a: athrow
      // 6b: aload 0
      // 6c: invokespecial com/finalshell/core/Connect_2.f ()V
      // 6f: aload 0
      // 70: invokevirtual com/finalshell/core/Connect_2.d ()V
      // 73: iload 2
      // 74: ifne b1
      // 77: aload 1
      // 78: arraylength
      // 79: goto 80
      // 7c: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f: athrow
      // 80: ifeq a6
      // 83: aload 0
      // 84: aload 1
      // 85: invokespecial com/finalshell/core/Connect_2.j ([C)Lcom/finalshell/ui/model/J2;
      // 88: astore 3
      // 89: aload 0
      // 8a: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 8d: aload 0
      // 8e: getfield com/finalshell/core/Connect_2.k I
      // 91: aload 0
      // 92: getfield com/finalshell/core/Connect_2.V I
      // 95: aload 3
      // 96: invokevirtual com/finalshell/core/Im4.h (IILcom/finalshell/ui/model/J2;)V
      // 99: aload 0
      // 9a: dup
      // 9b: getfield com/finalshell/core/Connect_2.k I
      // 9e: aload 3
      // 9f: invokevirtual com/finalshell/ui/model/J2.length ()I
      // a2: iadd
      // a3: putfield com/finalshell/core/Connect_2.k I
      // a6: aload 0
      // a7: invokespecial com/finalshell/core/Connect_2.E ()V
      // aa: aload 0
      // ab: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // ae: invokevirtual com/finalshell/core/Im4.h$void ()V
      // b1: goto c0
      // b4: astore 4
      // b6: aload 0
      // b7: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // ba: invokevirtual com/finalshell/core/Im4.h$void ()V
      // bd: aload 4
      // bf: athrow
      // c0: return
   }

   @Override
   public void v(char[] var1) throws UnsupportedEncodingException {
      this.k(new String(var1, 0, 2));
   }

   public char[] l$arrchar(String var1) {
      StringBuilder var3 = new StringBuilder();
      char[] var4 = var1.toCharArray();
      boolean var10000 = com.finalshell.ui.model.J2.P();
      int var5 = var4.length;
      boolean var2 = var10000;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            char var7 = var4[var6];

            try {
               var9 = var3.append(this.F.U(var7));
               if (var2) {
                  break;
               }

               var6++;
               if (!var2) {
                  continue;
               }
            } catch (IllegalArgumentException var8) {
      String var9;
      String var9;
               throw a(var8);
            }
         }

         var9 = var3;
         break;
      }

      return var9.toString().toCharArray();
   }

   @Override
   public void a(String var1) {
      boolean var10000 = com.finalshell.ui.model.J2.g();
      int var3 = var1.length();
      boolean var2 = var10000;
      int var4 = 0;

      while (var4 < var3) {
         int var5 = Math.min(this.w$int(), var3 - var4);
         this.k(var1.substring(var4, var4 + var5));
         this.f();
         this.d();
         var4 += var5;
         if (!var2) {
            break;
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void d() {
      int var10000 = com.finalshell.ui.model.J2.P();
      this.O.w();
      boolean var1 = (boolean)var10000;
      boolean var8 = (false /* VF: Semaphore variable */) != 0;

      label68: {
         try {
            int var10001;
            label65: {
               label64: {
                  try {
                     var8 = true;
                     var10000 = this.V;
                     var10001 = this.Z;
                     if (var1) {
                        break label65;
                     }

                     if (this.V <= this.Z) {
                        break label64;
                     }
                  } catch (IllegalArgumentException var11) {
                     throw a(var11);
                  }

                  int var2 = this.Z - this.V;
                  this.V = this.Z;
                  this.d(this.P, this.x$int(), var2);
                  this.N.x(this.k, this.V);
               }

               try {
                  var18 = this;
                  if (var1) {
                     var8 = false;
                     break label68;
                  }

                  var10000 = this.V;
                  var10001 = this.P;
               } catch (IllegalArgumentException var10) {
                  throw a(var10);
               }
            }

            try {
               if (var10000 < var10001) {
                  this.V = this.P;
                  var8 = false;
               } else {
                  var8 = false;
               }
            } catch (IllegalArgumentException var9) {
               throw a(var9);
            }
         } finally {
            if (var8) {
               this.O.h$void();
            }
         }

         var18 = this;
      }

      var18.O.h$void();
   }

   public void S() {
      this.D$void();
      this.M();
   }

   @Override
   public void M() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 03: aload 0
      // 04: bipush 1
      // 05: putfield com/finalshell/core/Connect_2.o Z
      // 08: aload 0
      // 09: dup
      // 0a: getfield com/finalshell/core/Connect_2.V I
      // 0d: bipush 1
      // 0e: iadd
      // 0f: putfield com/finalshell/core/Connect_2.V I
      // 12: aload 0
      // 13: invokevirtual com/finalshell/core/Connect_2.d ()V
      // 16: istore 1
      // 17: aload 0
      // 18: iload 1
      // 19: ifne 35
      // 1c: invokevirtual com/finalshell/core/Connect_2.V$boolean ()Z
      // 1f: ifeq 34
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: aload 0
      // 2a: invokevirtual com/finalshell/core/Connect_2.D$void ()V
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aload 0
      // 35: getfield com/finalshell/core/Connect_2.N Lcom/finalshell/core/DV3;
      // 38: aload 0
      // 39: getfield com/finalshell/core/Connect_2.k I
      // 3c: aload 0
      // 3d: getfield com/finalshell/core/Connect_2.V I
      // 40: invokeinterface com/finalshell/core/DV3.x (II)V 3
      // 45: return
   }

   @Override
   public void R(int var1) {
      this.F.f(var1);
   }

   @Override
   public void Q(int var1) {
      this.F.o(var1);
   }

   @Override
   public void K(int var1, char var2) {
      PX var3 = this.F.D(var1);
      this.F.k(var3, var2);
   }

   @Override
   public void X(int var1) {
      this.F.F(var1);
   }

   @Override
   public void l(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 03: istore 2
      // 04: iload 2
      // 05: ifeq 52
      // 08: iload 1
      // 09: bipush 1
      // 0a: if_icmpeq 2b
      // 0d: goto 14
      // 10: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13: athrow
      // 14: iload 1
      // 15: bipush 2
      // 16: iload 2
      // 17: ifeq 5f
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: if_icmpne 56
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield com/finalshell/core/Connect_2.F Lcom/finalshell/core/R3;
      // 2f: bipush 0
      // 30: getstatic com/finalshell/ui/model/PG3.ASCII Lcom/finalshell/ui/model/PG3;
      // 33: invokevirtual com/finalshell/core/R3.E (ILcom/finalshell/ui/model/PG3;)V
      // 36: aload 0
      // 37: getfield com/finalshell/core/Connect_2.F Lcom/finalshell/core/R3;
      // 3a: bipush 1
      // 3b: getstatic com/finalshell/ui/model/PG3.DEC_SUPPLEMENTAL Lcom/finalshell/ui/model/PG3;
      // 3e: invokevirtual com/finalshell/core/R3.E (ILcom/finalshell/ui/model/PG3;)V
      // 41: aload 0
      // 42: bipush 0
      // 43: invokevirtual com/finalshell/core/Connect_2.R (I)V
      // 46: aload 0
      // 47: bipush 1
      // 48: invokevirtual com/finalshell/core/Connect_2.Q (I)V
      // 4b: goto 52
      // 4e: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51: athrow
      // 52: iload 2
      // 53: ifne 8c
      // 56: iload 1
      // 57: bipush 3
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: if_icmpne 80
      // 62: aload 0
      // 63: bipush 0
      // 64: sipush 24257
      // 67: ldc2_w 7286141354745268492
      // 6a: invokestatic com/finalshell/core/Connect_2.a (IJ)I
      // 6d: invokevirtual com/finalshell/core/Connect_2.K (IC)V
      // 70: aload 0
      // 71: bipush 0
      // 72: invokevirtual com/finalshell/core/Connect_2.R (I)V
      // 75: iload 2
      // 76: ifne 8c
      // 79: goto 80
      // 7c: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f: athrow
      // 80: new java/lang/IllegalArgumentException
      // 83: dup
      // 84: invokespecial java/lang/IllegalArgumentException.<init> ()V
      // 87: athrow
      // 88: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8b: athrow
      // 8c: return
   }

   @Override
   public void X(String var1) {
      this.N.Y(var1);
   }

   @Override
   public void v() {
      String var1 = this.N.U$String();
      this.Y.push(var1);
   }

   @Override
   public void C() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/Connect_2.Y Ljava/util/Stack;
      // 08: iload 1
      // 09: ifne 27
      // 0c: invokevirtual java/util/Stack.empty ()Z
      // 0f: ifne 35
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield com/finalshell/core/Connect_2.Y Ljava/util/Stack;
      // 1d: invokevirtual java/util/Stack.pop ()Ljava/lang/Object;
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: checkcast java/lang/String
      // 2a: astore 2
      // 2b: aload 0
      // 2c: getfield com/finalshell/core/Connect_2.N Lcom/finalshell/core/DV3;
      // 2f: aload 2
      // 30: invokeinterface com/finalshell/core/DV3.Y (Ljava/lang/String;)V 2
      // 35: return
   }

   @Nullable
   @Override
   public XF3 D$xF_3() {
      return this.N.k();
   }

   @Nullable
   @Override
   public XF3 r() {
      return this.N.T();
   }

   @Override
   public void X(@NotNull Rh2 var1) {
      this.l.add(var1);
   }

   @Override
   public void c(@NotNull List var1) {
      boolean var10000 = com.finalshell.ui.model.J2.g();
      Iterator var3 = this.l.iterator();
      boolean var2 = var10000;

      while (var3.hasNext()) {
         Rh2 var4 = (Rh2)var3.next();
         var4.B(var1);
         if (!var2) {
            break;
         }
      }
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
      // 00: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 03: aload 0
      // 04: dup
      // 05: getfield com/finalshell/core/Connect_2.k I
      // 08: bipush 1
      // 09: isub
      // 0a: putfield com/finalshell/core/Connect_2.k I
      // 0d: istore 1
      // 0e: aload 0
      // 0f: iload 1
      // 10: ifeq 41
      // 13: getfield com/finalshell/core/Connect_2.k I
      // 16: ifge 3b
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: dup
      // 22: getfield com/finalshell/core/Connect_2.V I
      // 25: bipush 1
      // 26: isub
      // 27: putfield com/finalshell/core/Connect_2.V I
      // 2a: aload 0
      // 2b: aload 0
      // 2c: getfield com/finalshell/core/Connect_2.A I
      // 2f: bipush 1
      // 30: isub
      // 31: putfield com/finalshell/core/Connect_2.k I
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: aload 0
      // 3c: bipush -1
      // 3d: invokespecial com/finalshell/core/Connect_2.m (I)V
      // 40: aload 0
      // 41: getfield com/finalshell/core/Connect_2.N Lcom/finalshell/core/DV3;
      // 44: aload 0
      // 45: getfield com/finalshell/core/Connect_2.k I
      // 48: aload 0
      // 49: getfield com/finalshell/core/Connect_2.V I
      // 4c: invokeinterface com/finalshell/core/DV3.x (II)V 3
      // 51: return
   }

   @Override
   public void D$void() {
      this.k = 0;
      this.N.x(this.k, this.V);
      this.i$void();
   }

   public void i$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 003: aload 0
      // 004: getfield com/finalshell/core/Connect_2.T Ljava/lang/Object;
      // 007: dup
      // 008: astore 2
      // 009: monitorenter
      // 00a: istore 1
      // 00b: aload 0
      // 00c: bipush 1
      // 00d: putfield com/finalshell/core/Connect_2.dD Z
      // 010: aload 0
      // 011: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 014: aload 0
      // 015: getfield com/finalshell/core/Connect_2.V I
      // 018: bipush 1
      // 019: iadd
      // 01a: invokevirtual com/finalshell/core/Im4.D (I)Lcom/finalshell/core/DC3;
      // 01d: astore 3
      // 01e: aload 3
      // 01f: invokevirtual com/finalshell/core/DC3.V$String ()Ljava/lang/String;
      // 022: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 025: astore 4
      // 027: aload 4
      // 029: ldc ""
      // 02b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 02e: iload 1
      // 02f: ifeq 054
      // 032: ifne 03f
      // 035: goto 03c
      // 038: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03b: athrow
      // 03c: aload 2
      // 03d: monitorexit
      // 03e: return
      // 03f: aload 0
      // 040: getfield com/finalshell/core/Connect_2.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 043: invokevirtual com/finalshell/ui/panel/ConnectionProperty.O$pA_3 ()Lcom/finalshell/ui/panel/SetBackgroundImagePanel;
      // 046: iload 1
      // 047: ifeq 06a
      // 04a: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.V$boolean ()Z
      // 04d: goto 054
      // 050: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 053: athrow
      // 054: ifeq 063
      // 057: aload 0
      // 058: bipush 1
      // 059: putfield com/finalshell/core/Connect_2.J Z
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 062: athrow
      // 063: aload 0
      // 064: getfield com/finalshell/core/Connect_2.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 067: invokevirtual com/finalshell/ui/panel/ConnectionProperty.O$pA_3 ()Lcom/finalshell/ui/panel/SetBackgroundImagePanel;
      // 06a: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.c$KeyEvent ()Ljava/awt/event/KeyEvent;
      // 06d: astore 5
      // 06f: aload 5
      // 071: iload 1
      // 072: ifeq 098
      // 075: ifnonnull 08f
      // 078: goto 07f
      // 07b: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07e: athrow
      // 07f: aload 0
      // 080: bipush 0
      // 081: putfield com/finalshell/core/Connect_2.J Z
      // 084: iload 1
      // 085: ifne 100
      // 088: goto 08f
      // 08b: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08e: athrow
      // 08f: aload 5
      // 091: goto 098
      // 094: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 097: athrow
      // 098: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 09b: istore 6
      // 09d: invokestatic java/lang/System.currentTimeMillis ()J
      // 0a0: aload 0
      // 0a1: getfield com/finalshell/core/Connect_2.R J
      // 0a4: lsub
      // 0a5: lstore 7
      // 0a7: iload 6
      // 0a9: sipush 9464
      // 0ac: ldc2_w 4750108676163662648
      // 0af: invokestatic com/finalshell/core/Connect_2.a (IJ)I
      // 0b2: iload 1
      // 0b3: ifeq 0d5
      // 0b6: if_icmpeq 0f4
      // 0b9: goto 0c0
      // 0bc: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bf: athrow
      // 0c0: aload 5
      // 0c2: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 0c5: sipush 16727
      // 0c8: ldc2_w 7889870025155188373
      // 0cb: invokestatic com/finalshell/core/Connect_2.a (IJ)I
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: iload 1
      // 0d6: ifeq 0f0
      // 0d9: if_icmpne 100
      // 0dc: goto 0e3
      // 0df: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e2: athrow
      // 0e3: aload 5
      // 0e5: invokevirtual java/awt/event/KeyEvent.getModifiers ()I
      // 0e8: bipush 2
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ef: athrow
      // 0f0: iand
      // 0f1: ifeq 100
      // 0f4: aload 0
      // 0f5: bipush 0
      // 0f6: putfield com/finalshell/core/Connect_2.J Z
      // 0f9: goto 100
      // 0fc: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ff: athrow
      // 100: aload 0
      // 101: iload 1
      // 102: ifeq 11f
      // 105: getfield com/finalshell/core/Connect_2.h Ljava/lang/String;
      // 108: ifnonnull 11e
      // 10b: goto 112
      // 10e: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 111: athrow
      // 112: aload 0
      // 113: bipush 0
      // 114: putfield com/finalshell/core/Connect_2.J Z
      // 117: goto 11e
      // 11a: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11d: athrow
      // 11e: aload 0
      // 11f: iload 1
      // 120: ifeq 148
      // 123: getfield com/finalshell/core/Connect_2.J Z
      // 126: ifne 13e
      // 129: goto 130
      // 12c: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12f: athrow
      // 130: aload 0
      // 131: invokestatic java/lang/System.currentTimeMillis ()J
      // 134: putfield com/finalshell/core/Connect_2.R J
      // 137: goto 13e
      // 13a: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13d: athrow
      // 13e: aload 0
      // 13f: invokevirtual com/finalshell/core/Connect_2.R$void ()V
      // 142: aload 0
      // 143: bipush 0
      // 144: putfield com/finalshell/core/Connect_2.dD Z
      // 147: aload 2
      // 148: monitorexit
      // 149: goto 153
      // 14c: astore 9
      // 14e: aload 2
      // 14f: monitorexit
      // 150: aload 9
      // 152: athrow
      // 153: return
   }

   void R$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield com/finalshell/core/Connect_2.V I
      // 004: bipush 1
      // 005: isub
      // 006: istore 2
      // 007: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 00a: aload 0
      // 00b: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 00e: iload 2
      // 00f: invokevirtual com/finalshell/core/Im4.D (I)Lcom/finalshell/core/DC3;
      // 012: astore 3
      // 013: istore 1
      // 014: aload 3
      // 015: invokevirtual com/finalshell/core/DC3.V$String ()Ljava/lang/String;
      // 018: astore 4
      // 01a: aload 0
      // 01b: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 01e: aload 0
      // 01f: getfield com/finalshell/core/Connect_2.V I
      // 022: bipush 2
      // 023: isub
      // 024: invokevirtual com/finalshell/core/Im4.D (I)Lcom/finalshell/core/DC3;
      // 027: astore 5
      // 029: aload 0
      // 02a: getfield com/finalshell/core/Connect_2.V I
      // 02d: bipush 2
      // 02e: isub
      // 02f: istore 6
      // 031: aload 5
      // 033: iload 1
      // 034: ifne 073
      // 037: invokevirtual com/finalshell/core/DC3.G ()Z
      // 03a: ifeq 072
      // 03d: goto 044
      // 040: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 043: athrow
      // 044: aload 5
      // 046: invokevirtual com/finalshell/core/DC3.V$String ()Ljava/lang/String;
      // 049: astore 7
      // 04b: new java/lang/StringBuilder
      // 04e: dup
      // 04f: invokespecial java/lang/StringBuilder.<init> ()V
      // 052: aload 7
      // 054: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 057: aload 4
      // 059: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 05f: astore 4
      // 061: aload 0
      // 062: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 065: iload 6
      // 067: invokevirtual com/finalshell/core/Im4.D (I)Lcom/finalshell/core/DC3;
      // 06a: astore 5
      // 06c: iinc 6 -1
      // 06f: goto 072
      // 072: aload 3
      // 073: invokevirtual com/finalshell/core/DC3.V$String ()Ljava/lang/String;
      // 076: astore 7
      // 078: aload 4
      // 07a: astore 7
      // 07c: aload 0
      // 07d: getfield com/finalshell/core/Connect_2.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 080: invokevirtual com/finalshell/ui/panel/ConnectionProperty.O$pA_3 ()Lcom/finalshell/ui/panel/SetBackgroundImagePanel;
      // 083: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.c$KeyEvent ()Ljava/awt/event/KeyEvent;
      // 086: astore 8
      // 088: aload 8
      // 08a: iload 1
      // 08b: ifne 09a
      // 08e: ifnull 2fe
      // 091: goto 098
      // 094: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 097: athrow
      // 098: aload 8
      // 09a: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 09d: istore 9
      // 09f: bipush 0
      // 0a0: istore 10
      // 0a2: aload 0
      // 0a3: getfield com/finalshell/core/Connect_2.h Ljava/lang/String;
      // 0a6: iload 1
      // 0a7: ifne 0bf
      // 0aa: ifnull 2e2
      // 0ad: goto 0b4
      // 0b0: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: getfield com/finalshell/core/Connect_2.h Ljava/lang/String;
      // 0b8: goto 0bf
      // 0bb: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: ldc ""
      // 0c1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0c4: iload 1
      // 0c5: ifne 2e4
      // 0c8: ifne 2e2
      // 0cb: goto 0d2
      // 0ce: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d1: athrow
      // 0d2: iload 9
      // 0d4: iload 1
      // 0d5: ifne 2e4
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: sipush 9464
      // 0e2: ldc2_w 4750108676163662648
      // 0e5: invokestatic com/finalshell/core/Connect_2.a (IJ)I
      // 0e8: if_icmpne 2e2
      // 0eb: goto 0f2
      // 0ee: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: getfield com/finalshell/core/Connect_2.h Ljava/lang/String;
      // 0f6: invokevirtual java/lang/String.length ()I
      // 0f9: istore 11
      // 0fb: aload 4
      // 0fd: aload 0
      // 0fe: getfield com/finalshell/core/Connect_2.h Ljava/lang/String;
      // 101: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 104: istore 12
      // 106: iload 12
      // 108: iload 1
      // 109: ifne 2e4
      // 10c: bipush -1
      // 10d: if_icmple 2e2
      // 110: goto 117
      // 113: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 116: athrow
      // 117: aload 0
      // 118: aload 4
      // 11a: iload 11
      // 11c: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 11f: putfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 122: aload 0
      // 123: aload 0
      // 124: getfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 127: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 12a: ldc2_w 224692825278678287
      // 12d: astore 15
      // 12f: ldc2_w 224692825278678287
      // 132: aload 15
      // 134: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 137: checkcast java/lang/String
      // 13a: goto 141
      // 13d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 140: athrow
      // 141: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 144: putfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 147: aload 0
      // 148: getfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 14b: ldc_w "\n"
      // 14e: ldc ""
      // 150: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 153: pop
      // 154: aload 0
      // 155: aload 0
      // 156: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 159: invokevirtual com/finalshell/core/Im4.H ()I
      // 15c: iload 2
      // 15d: iadd
      // 15e: putfield com/finalshell/core/Connect_2.B I
      // 161: aload 0
      // 162: getfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 165: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 168: ldc ""
      // 16a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 16d: iload 1
      // 16e: ifne 2e4
      // 171: goto 178
      // 174: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 177: athrow
      // 178: ifne 2e2
      // 17b: goto 182
      // 17e: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 181: athrow
      // 182: sipush 20383
      // 185: ldc2_w 4107335223896741982
      // 188: invokestatic com/finalshell/core/Connect_2.a (IJ)I
      // 18b: istore 13
      // 18d: aload 0
      // 18e: getfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 191: new java/lang/StringBuilder
      // 194: dup
      // 195: invokespecial java/lang/StringBuilder.<init> ()V
      // 198: iload 13
      // 19a: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 19d: ldc ""
      // 19f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a5: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1a8: iload 1
      // 1a9: ifne 2e4
      // 1ac: ifne 2e2
      // 1af: goto 1b6
      // 1b2: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b5: athrow
      // 1b6: bipush 1
      // 1b7: istore 10
      // 1b9: aload 0
      // 1ba: bipush 0
      // 1bb: putfield com/finalshell/core/Connect_2.Q Z
      // 1be: invokestatic java/lang/System.currentTimeMillis ()J
      // 1c1: aload 0
      // 1c2: getfield com/finalshell/core/Connect_2.s J
      // 1c5: lsub
      // 1c6: getstatic com/finalshell/core/Connect_2.eb J
      // 1c9: lcmp
      // 1ca: iload 1
      // 1cb: ifne 1f9
      // 1ce: ifle 1eb
      // 1d1: goto 1d8
      // 1d4: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d7: athrow
      // 1d8: aload 0
      // 1d9: bipush 0
      // 1da: putfield com/finalshell/core/Connect_2.C I
      // 1dd: aload 0
      // 1de: invokestatic java/lang/System.currentTimeMillis ()J
      // 1e1: putfield com/finalshell/core/Connect_2.s J
      // 1e4: goto 1eb
      // 1e7: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ea: athrow
      // 1eb: aload 0
      // 1ec: dup
      // 1ed: getfield com/finalshell/core/Connect_2.C I
      // 1f0: bipush 1
      // 1f1: iadd
      // 1f2: putfield com/finalshell/core/Connect_2.C I
      // 1f5: aload 0
      // 1f6: getfield com/finalshell/core/Connect_2.C I
      // 1f9: iload 1
      // 1fa: ifne 2e4
      // 1fd: aload 0
      // 1fe: getfield com/finalshell/core/Connect_2.v I
      // 201: if_icmpgt 2e2
      // 204: goto 20b
      // 207: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20a: athrow
      // 20b: new com/finalshell/core/L1
      // 20e: dup
      // 20f: ldc ""
      // 211: aload 0
      // 212: getfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 215: invokespecial com/finalshell/core/L1.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 218: astore 14
      // 21a: aload 14
      // 21c: bipush 0
      // 21d: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 220: ldc2_w 124068231949608152
      // 223: astore 18
      // 225: astore 17
      // 227: ldc2_w 124068231949608152
      // 22a: aload 17
      // 22c: aload 18
      // 22e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 231: pop
      // 232: goto 239
      // 235: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 238: athrow
      // 239: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 23c: ldc2_w 270389152141252877
      // 23f: astore 19
      // 241: ldc2_w 270389152141252877
      // 244: aload 19
      // 246: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 249: goto 250
      // 24c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 24f: athrow
      // 250: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 253: ldc2_w 306266403902896148
      // 256: astore 22
      // 258: astore 21
      // 25a: ldc2_w 306266403902896148
      // 25d: aload 21
      // 25f: aload 22
      // 261: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 264: goto 26b
      // 267: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 26a: athrow
      // 26b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 26e: ldc2_w 568950058787001160
      // 271: astore 24
      // 273: astore 23
      // 275: ldc2_w 568950058787001160
      // 278: aload 23
      // 27a: aload 24
      // 27c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 27f: goto 286
      // 282: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 285: athrow
      // 286: aload 14
      // 288: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 28b: ldc2_w 331594575686452212
      // 28e: astore 26
      // 290: astore 25
      // 292: ldc2_w 331594575686452212
      // 295: aload 25
      // 297: aload 26
      // 299: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 29c: pop
      // 29d: goto 2a4
      // 2a0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2a3: athrow
      // 2a4: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2a7: ldc2_w 270389152141252877
      // 2aa: astore 27
      // 2ac: ldc2_w 270389152141252877
      // 2af: aload 27
      // 2b1: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2b4: goto 2bb
      // 2b7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2ba: athrow
      // 2bb: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2be: ldc2_w 578864097947885485
      // 2c1: astore 30
      // 2c3: astore 29
      // 2c5: ldc2_w 578864097947885485
      // 2c8: aload 29
      // 2ca: aload 30
      // 2cc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2cf: pop
      // 2d0: goto 2d7
      // 2d3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2d6: athrow
      // 2d7: aload 0
      // 2d8: getfield com/finalshell/core/Connect_2.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 2db: invokevirtual com/finalshell/ui/panel/ConnectionProperty.O$pA_3 ()Lcom/finalshell/ui/panel/SetBackgroundImagePanel;
      // 2de: bipush 1
      // 2df: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.b$void (Z)V
      // 2e2: iload 10
      // 2e4: ifeq 2fe
      // 2e7: aload 0
      // 2e8: bipush 0
      // 2e9: putfield com/finalshell/core/Connect_2.y Z
      // 2ec: aload 0
      // 2ed: new java/lang/StringBuffer
      // 2f0: dup
      // 2f1: invokespecial java/lang/StringBuffer.<init> ()V
      // 2f4: putfield com/finalshell/core/Connect_2.i Ljava/lang/StringBuffer;
      // 2f7: goto 2fe
      // 2fa: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fd: athrow
      // 2fe: return
   }

   public void x(String var1, String var2) {
      this.i.append(var2 + "\n");
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
      // 000: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 003: ldc ""
      // 005: astore 3
      // 006: istore 2
      // 007: aload 0
      // 008: aload 0
      // 009: getfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 00c: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 00f: putfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 012: aload 0
      // 013: getfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 016: ldc_w " "
      // 019: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 01c: istore 4
      // 01e: aconst_null
      // 01f: astore 5
      // 021: iload 4
      // 023: iload 2
      // 024: ifne 03a
      // 027: bipush -1
      // 028: if_icmple 0bb
      // 02b: goto 032
      // 02e: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: bipush -1
      // 033: goto 03a
      // 036: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 039: athrow
      // 03a: istore 6
      // 03c: iload 4
      // 03e: istore 7
      // 040: iload 7
      // 042: aload 0
      // 043: getfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 046: invokevirtual java/lang/String.length ()I
      // 049: if_icmpge 094
      // 04c: aload 0
      // 04d: getfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 050: iload 7
      // 052: iload 2
      // 053: ifne 099
      // 056: invokevirtual java/lang/String.charAt (I)C
      // 059: iload 2
      // 05a: ifne 080
      // 05d: goto 064
      // 060: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: sipush 13304
      // 067: ldc2_w 4301922201866495030
      // 06a: invokestatic com/finalshell/core/Connect_2.a (IJ)I
      // 06d: if_icmpeq 086
      // 070: goto 077
      // 073: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 076: athrow
      // 077: iload 7
      // 079: goto 080
      // 07c: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f: athrow
      // 080: istore 6
      // 082: iload 2
      // 083: ifeq 094
      // 086: iinc 7 1
      // 089: iload 2
      // 08a: ifeq 040
      // 08d: goto 094
      // 090: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 093: athrow
      // 094: aload 0
      // 095: getfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 098: bipush 0
      // 099: iload 4
      // 09b: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 09e: astore 5
      // 0a0: iload 6
      // 0a2: iload 2
      // 0a3: ifne 0d4
      // 0a6: bipush -1
      // 0a7: if_icmple 0bb
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: getfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 0b5: iload 6
      // 0b7: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0ba: astore 3
      // 0bb: aload 5
      // 0bd: iload 2
      // 0be: ifne 0d8
      // 0c1: sipush -2794
      // 0c4: sipush 29635
      // 0c7: invokestatic com/finalshell/core/Connect_2.a (II)Ljava/lang/String;
      // 0ca: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d3: athrow
      // 0d4: ifeq 1c2
      // 0d7: aload 3
      // 0d8: astore 6
      // 0da: aload 6
      // 0dc: ldc_w "/"
      // 0df: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e2: iload 2
      // 0e3: ifne 12b
      // 0e6: ifne 11c
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ef: athrow
      // 0f0: aload 6
      // 0f2: ldc_w "/"
      // 0f5: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0f8: iload 2
      // 0f9: ifne 12b
      // 0fc: goto 103
      // 0ff: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 102: athrow
      // 103: ifeq 11c
      // 106: goto 10d
      // 109: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10c: athrow
      // 10d: aload 6
      // 10f: bipush 0
      // 110: aload 6
      // 112: invokevirtual java/lang/String.length ()I
      // 115: bipush 1
      // 116: isub
      // 117: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 11a: astore 6
      // 11c: aload 0
      // 11d: iload 2
      // 11e: ifne 152
      // 121: getfield com/finalshell/core/Connect_2.K Z
      // 124: goto 12b
      // 127: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12a: athrow
      // 12b: ifne 143
      // 12e: aload 0
      // 12f: getfield com/finalshell/core/Connect_2.u Ljava/util/ArrayList;
      // 132: aload 6
      // 134: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 137: pop
      // 138: iload 2
      // 139: ifeq 1c2
      // 13c: goto 143
      // 13f: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 142: athrow
      // 143: aload 6
      // 145: ldc_w "~"
      // 148: aload 0
      // 149: getfield com/finalshell/core/Connect_2.H Ljava/lang/String;
      // 14c: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 14f: astore 6
      // 151: aload 0
      // 152: getfield com/finalshell/core/Connect_2.X Ljava/lang/String;
      // 155: aload 6
      // 157: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 15a: ldc2_w 366583999691715222
      // 15d: astore 9
      // 15f: ldc2_w 366583999691715222
      // 162: aload 9
      // 164: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 167: checkcast java/lang/String
      // 16a: goto 171
      // 16d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 170: athrow
      // 171: astore 7
      // 173: aload 0
      // 174: aload 7
      // 176: putfield com/finalshell/core/Connect_2.X Ljava/lang/String;
      // 179: aload 0
      // 17a: getfield com/finalshell/core/Connect_2.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 17d: invokevirtual com/finalshell/ui/panel/ConnectionProperty.q$s ()Lcom/finalshell/ui/panel/FilePanel;
      // 180: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 183: ldc2_w 239393919034688200
      // 186: astore 12
      // 188: astore 11
      // 18a: ldc2_w 239393919034688200
      // 18d: aload 11
      // 18f: aload 12
      // 191: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 194: checkcast com/finalshell/ui/panel/Address
      // 197: goto 19e
      // 19a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 19d: athrow
      // 19e: astore 8
      // 1a0: aload 8
      // 1a2: aload 7
      // 1a4: bipush 1
      // 1a5: bipush 0
      // 1a6: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;ZZ)[Ljava/lang/Object;
      // 1a9: ldc2_w 324338769529465951
      // 1ac: astore 14
      // 1ae: astore 13
      // 1b0: ldc2_w 324338769529465951
      // 1b3: aload 13
      // 1b5: aload 14
      // 1b7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ba: pop
      // 1bb: goto 1c2
      // 1be: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c1: athrow
      // 1c2: return
   }

   public void I(boolean var1) {
   }

   public DC3 D$dC_3() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 03: aload 0
      // 04: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 07: invokevirtual com/finalshell/core/Im4.k ()I
      // 0a: istore 2
      // 0b: istore 1
      // 0c: aload 0
      // 0d: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 10: invokevirtual com/finalshell/core/Im4.O ()I
      // 13: istore 3
      // 14: iload 2
      // 15: iload 1
      // 16: ifne 2c
      // 19: iload 3
      // 1a: if_icmple 2d
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: iload 3
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: istore 2
      // 2d: aload 0
      // 2e: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 31: iload 2
      // 32: bipush 1
      // 33: isub
      // 34: invokevirtual com/finalshell/core/Im4.D (I)Lcom/finalshell/core/DC3;
      // 37: astore 4
      // 39: aload 4
      // 3b: areturn
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
      // 00: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/Connect_2.k I
      // 08: iload 1
      // 09: ifeq 32
      // 0c: aload 0
      // 0d: getfield com/finalshell/core/Connect_2.A I
      // 10: if_icmplt 1f
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: return
      // 1b: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 23: aload 0
      // 24: getfield com/finalshell/core/Connect_2.V I
      // 27: bipush 1
      // 28: isub
      // 29: invokevirtual com/finalshell/core/Im4.D (I)Lcom/finalshell/core/DC3;
      // 2c: invokevirtual com/finalshell/core/DC3.V$String ()Ljava/lang/String;
      // 2f: invokevirtual java/lang/String.length ()I
      // 32: istore 2
      // 33: aload 0
      // 34: getfield com/finalshell/core/Connect_2.G Lcom/finalshell/core/XV3;
      // 37: aload 0
      // 38: getfield com/finalshell/core/Connect_2.k I
      // 3b: invokeinterface com/finalshell/core/XV3.U (I)I 2
      // 40: istore 3
      // 41: aload 0
      // 42: aload 0
      // 43: getfield com/finalshell/core/Connect_2.k I
      // 46: iload 2
      // 47: invokestatic java/lang/Math.max (II)I
      // 4a: putfield com/finalshell/core/Connect_2.k I
      // 4d: aload 0
      // 4e: iload 1
      // 4f: ifeq 8a
      // 52: getfield com/finalshell/core/Connect_2.k I
      // 55: iload 3
      // 56: if_icmpge 82
      // 59: goto 60
      // 5c: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f: athrow
      // 60: iload 3
      // 61: aload 0
      // 62: getfield com/finalshell/core/Connect_2.k I
      // 65: isub
      // 66: newarray 5
      // 68: astore 4
      // 6a: aload 4
      // 6c: sipush 13304
      // 6f: ldc2_w 4301922201866495030
      // 72: invokestatic com/finalshell/core/Connect_2.a (IJ)I
      // 75: invokestatic java/util/Arrays.fill ([CC)V
      // 78: aload 0
      // 79: aload 4
      // 7b: invokespecial com/finalshell/core/Connect_2.u ([C)V
      // 7e: iload 1
      // 7f: ifne 8e
      // 82: aload 0
      // 83: goto 8a
      // 86: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 89: athrow
      // 8a: iload 3
      // 8b: putfield com/finalshell/core/Connect_2.k I
      // 8e: aload 0
      // 8f: bipush 1
      // 90: invokespecial com/finalshell/core/Connect_2.m (I)V
      // 93: aload 0
      // 94: getfield com/finalshell/core/Connect_2.N Lcom/finalshell/core/DV3;
      // 97: aload 0
      // 98: getfield com/finalshell/core/Connect_2.k I
      // 9b: aload 0
      // 9c: getfield com/finalshell/core/Connect_2.V I
      // 9f: invokeinterface com/finalshell/core/DV3.x (II)V 3
      // a4: return
   }

   @Override
   public void d(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 003: aload 0
      // 004: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 007: invokevirtual com/finalshell/core/Im4.w ()V
      // 00a: istore 2
      // 00b: iload 1
      // 00c: iload 2
      // 00d: ifne 0d8
      // 010: tableswitch 158 0 2 32 103 137
      // 02c: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02f: athrow
      // 030: aload 0
      // 031: getfield com/finalshell/core/Connect_2.k I
      // 034: iload 2
      // 035: ifne 06a
      // 038: goto 03f
      // 03b: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03e: athrow
      // 03f: aload 0
      // 040: getfield com/finalshell/core/Connect_2.A I
      // 043: if_icmpge 066
      // 046: goto 04d
      // 049: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04c: athrow
      // 04d: aload 0
      // 04e: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 051: aload 0
      // 052: getfield com/finalshell/core/Connect_2.k I
      // 055: bipush -1
      // 056: aload 0
      // 057: getfield com/finalshell/core/Connect_2.V I
      // 05a: bipush 1
      // 05b: isub
      // 05c: invokevirtual com/finalshell/core/Im4.y (III)V
      // 05f: goto 066
      // 062: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 065: athrow
      // 066: aload 0
      // 067: getfield com/finalshell/core/Connect_2.V I
      // 06a: istore 3
      // 06b: aload 0
      // 06c: getfield com/finalshell/core/Connect_2.S I
      // 06f: bipush 1
      // 070: isub
      // 071: istore 4
      // 073: iload 2
      // 074: ifeq 0dc
      // 077: aload 0
      // 078: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 07b: bipush 0
      // 07c: aload 0
      // 07d: getfield com/finalshell/core/Connect_2.k I
      // 080: bipush 1
      // 081: iadd
      // 082: aload 0
      // 083: getfield com/finalshell/core/Connect_2.V I
      // 086: bipush 1
      // 087: isub
      // 088: invokevirtual com/finalshell/core/Im4.y (III)V
      // 08b: bipush 0
      // 08c: istore 3
      // 08d: aload 0
      // 08e: getfield com/finalshell/core/Connect_2.V I
      // 091: bipush 1
      // 092: isub
      // 093: istore 4
      // 095: iload 2
      // 096: ifeq 0dc
      // 099: bipush 0
      // 09a: istore 3
      // 09b: aload 0
      // 09c: getfield com/finalshell/core/Connect_2.S I
      // 09f: bipush 1
      // 0a0: isub
      // 0a1: istore 4
      // 0a3: aload 0
      // 0a4: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 0a7: invokevirtual com/finalshell/core/Im4.B$void ()V
      // 0aa: iload 2
      // 0ab: ifeq 0dc
      // 0ae: getstatic com/finalshell/core/Connect_2.f Lorg/slf4j/Logger;
      // 0b1: new java/lang/StringBuilder
      // 0b4: dup
      // 0b5: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b8: sipush -2805
      // 0bb: sipush 20347
      // 0be: invokestatic com/finalshell/core/Connect_2.a (II)Ljava/lang/String;
      // 0c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c4: iload 1
      // 0c5: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0c8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0cb: invokeinterface org/slf4j/Logger.warn (Ljava/lang/String;)V 2
      // 0d0: bipush 1
      // 0d1: goto 0d8
      // 0d4: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d7: athrow
      // 0d8: istore 3
      // 0d9: bipush 1
      // 0da: istore 4
      // 0dc: iload 3
      // 0dd: iload 4
      // 0df: if_icmpeq 0f0
      // 0e2: aload 0
      // 0e3: iload 3
      // 0e4: iload 4
      // 0e6: invokevirtual com/finalshell/core/Connect_2.b (II)V
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ef: athrow
      // 0f0: aload 0
      // 0f1: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 0f4: invokevirtual com/finalshell/core/Im4.h$void ()V
      // 0f7: goto 106
      // 0fa: astore 5
      // 0fc: aload 0
      // 0fd: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 100: invokevirtual com/finalshell/core/Im4.h$void ()V
      // 103: aload 5
      // 105: athrow
      // 106: return
   }

   public void b(int var1, int var2) {
      this.O.w();

      try {
         this.O.U(var1, var2);
      } finally {
         this.O.h$void();
      }
   }

   @Override
   public void w$void() {
      this.b(0, this.S - 1);
   }

   @Override
   public void X(boolean var1) {
      this.N.G(var1);
   }

   @Override
   public void W(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 03: aload 0
      // 04: new java/lang/StringBuilder
      // 07: dup
      // 08: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b: sipush -2808
      // 0e: sipush -24549
      // 11: invokestatic com/finalshell/core/Connect_2.a (II)Ljava/lang/String;
      // 14: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17: iload 1
      // 18: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 1b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1e: invokevirtual com/finalshell/core/Connect_2.N (Ljava/lang/String;)V
      // 21: istore 2
      // 22: aload 0
      // 23: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 26: iload 1
      // 27: invokevirtual com/finalshell/core/Im4.P (Z)V
      // 2a: aload 0
      // 2b: iload 2
      // 2c: ifne 8d
      // 2f: getfield com/finalshell/core/Connect_2.N Lcom/finalshell/core/DV3;
      // 32: bipush 1
      // 33: invokeinterface com/finalshell/core/DV3.x (Z)V 2
      // 38: iload 1
      // 39: ifne 85
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: aload 0
      // 44: iload 2
      // 45: ifne 7d
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: getfield com/finalshell/core/Connect_2.x Lcom/finalshell/core/XQ;
      // 52: ifnull 94
      // 55: goto 5c
      // 58: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b: athrow
      // 5c: aload 0
      // 5d: aload 0
      // 5e: getfield com/finalshell/core/Connect_2.x Lcom/finalshell/core/XQ;
      // 61: invokevirtual com/finalshell/core/Connect_2.n (Lcom/finalshell/core/XQ;)V
      // 64: aload 0
      // 65: getfield com/finalshell/core/Connect_2.N Lcom/finalshell/core/DV3;
      // 68: aload 0
      // 69: getfield com/finalshell/core/Connect_2.k I
      // 6c: aload 0
      // 6d: getfield com/finalshell/core/Connect_2.V I
      // 70: invokeinterface com/finalshell/core/DV3.x (II)V 3
      // 75: aload 0
      // 76: goto 7d
      // 79: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7c: athrow
      // 7d: aconst_null
      // 7e: putfield com/finalshell/core/Connect_2.x Lcom/finalshell/core/XQ;
      // 81: iload 2
      // 82: ifeq 94
      // 85: aload 0
      // 86: goto 8d
      // 89: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8c: athrow
      // 8d: aload 0
      // 8e: invokespecial com/finalshell/core/Connect_2.e$XQ ()Lcom/finalshell/core/XQ;
      // 91: putfield com/finalshell/core/Connect_2.x Lcom/finalshell/core/XQ;
      // 94: return
   }

   @Override
   public byte[] r(int var1, int var2) {
      return this.W.C(var1, var2);
   }

   @Override
   public void V(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 03: istore 2
      // 04: iload 2
      // 05: ifeq 21
      // 08: iload 1
      // 09: ifeq 25
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 0
      // 14: getfield com/finalshell/core/Connect_2.W Lcom/finalshell/core/Nk4;
      // 17: invokevirtual com/finalshell/core/Nk4.J ()V
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: iload 2
      // 22: ifne 33
      // 25: aload 0
      // 26: getfield com/finalshell/core/Connect_2.W Lcom/finalshell/core/Nk4;
      // 29: invokevirtual com/finalshell/core/Nk4.E ()V
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: return
   }

   @Override
   public void x(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 03: istore 2
      // 04: iload 2
      // 05: ifne 21
      // 08: iload 1
      // 09: ifeq 25
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 0
      // 14: getfield com/finalshell/core/Connect_2.W Lcom/finalshell/core/Nk4;
      // 17: invokevirtual com/finalshell/core/Nk4.K ()V
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: iload 2
      // 22: ifeq 33
      // 25: aload 0
      // 26: getfield com/finalshell/core/Connect_2.W Lcom/finalshell/core/Nk4;
      // 29: invokevirtual com/finalshell/core/Nk4.S ()V
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: return
   }

   @Override
   public void P(boolean var1) {
      this.W.r(var1);
   }

   @Override
   public void b(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 03: aload 0
      // 04: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 07: invokevirtual com/finalshell/core/Im4.w ()V
      // 0a: istore 2
      // 0b: iload 1
      // 0c: iload 2
      // 0d: ifeq 46
      // 10: tableswitch 166 0 2 32 107 140
      // 2c: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: aload 0
      // 31: iload 2
      // 32: ifeq 67
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: getfield com/finalshell/core/Connect_2.k I
      // 3f: goto 46
      // 42: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45: athrow
      // 46: aload 0
      // 47: getfield com/finalshell/core/Connect_2.A I
      // 4a: if_icmpge 66
      // 4d: aload 0
      // 4e: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 51: aload 0
      // 52: getfield com/finalshell/core/Connect_2.k I
      // 55: bipush -1
      // 56: aload 0
      // 57: getfield com/finalshell/core/Connect_2.V I
      // 5a: bipush 1
      // 5b: isub
      // 5c: invokevirtual com/finalshell/core/Im4.y (III)V
      // 5f: goto 66
      // 62: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: aload 0
      // 67: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 6a: aload 0
      // 6b: getfield com/finalshell/core/Connect_2.V I
      // 6e: bipush 1
      // 6f: isub
      // 70: invokevirtual com/finalshell/core/Im4.D (I)Lcom/finalshell/core/DC3;
      // 73: bipush 0
      // 74: invokevirtual com/finalshell/core/DC3.M (Z)V
      // 77: iload 2
      // 78: ifne df
      // 7b: aload 0
      // 7c: getfield com/finalshell/core/Connect_2.k I
      // 7f: bipush 1
      // 80: iadd
      // 81: aload 0
      // 82: getfield com/finalshell/core/Connect_2.A I
      // 85: invokestatic java/lang/Math.min (II)I
      // 88: istore 3
      // 89: aload 0
      // 8a: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 8d: bipush 0
      // 8e: iload 3
      // 8f: aload 0
      // 90: getfield com/finalshell/core/Connect_2.V I
      // 93: bipush 1
      // 94: isub
      // 95: invokevirtual com/finalshell/core/Im4.y (III)V
      // 98: iload 2
      // 99: ifne df
      // 9c: aload 0
      // 9d: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // a0: bipush 0
      // a1: bipush -1
      // a2: aload 0
      // a3: getfield com/finalshell/core/Connect_2.V I
      // a6: bipush 1
      // a7: isub
      // a8: invokevirtual com/finalshell/core/Im4.y (III)V
      // ab: iload 2
      // ac: ifne df
      // af: goto b6
      // b2: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b5: athrow
      // b6: getstatic com/finalshell/core/Connect_2.f Lorg/slf4j/Logger;
      // b9: new java/lang/StringBuilder
      // bc: dup
      // bd: invokespecial java/lang/StringBuilder.<init> ()V
      // c0: sipush -2815
      // c3: sipush 31533
      // c6: invokestatic com/finalshell/core/Connect_2.a (II)Ljava/lang/String;
      // c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cc: iload 1
      // cd: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // d0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // d3: invokeinterface org/slf4j/Logger.warn (Ljava/lang/String;)V 2
      // d8: goto df
      // db: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // de: athrow
      // df: aload 0
      // e0: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // e3: invokevirtual com/finalshell/core/Im4.h$void ()V
      // e6: goto f5
      // e9: astore 4
      // eb: aload 0
      // ec: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // ef: invokevirtual com/finalshell/core/Im4.h$void ()V
      // f2: aload 4
      // f4: athrow
      // f5: return
   }

   @Override
   public void J(int var1) {
      this.O.w();

      try {
         this.O.O(this.k, this.V - 1, var1);
      } finally {
         this.O.h$void();
      }
   }

   @Override
   public void u(int var1) {
      this.O.w();

      try {
         int var2 = Math.min(var1, this.A - this.k);
         this.O.X(this.k, this.V - 1, var2);
      } finally {
         this.O.h$void();
      }
   }

   @Override
   public void e(int var1) {
      this.O.w();

      try {
         this.O.y(this.k, this.k + var1, this.V - 1);
      } finally {
         this.O.h$void();
      }
   }

   @Override
   public void P() {
      this.G.c(this.k);
   }

   @Override
   public void B() {
      this.G.n();
   }

   @Override
   public void n() {
      this.G.h(this.k);
   }

   @Override
   public void M(int var1) {
      this.O.w();

      try {
         this.O.S(this.V - 1, var1, this.Z);
      } finally {
         this.O.h$void();
      }
   }

   @Override
   public void x(int var1) {
      this.O.w();

      try {
         this.O.o(this.V - 1, var1, this.Z);
      } finally {
         this.O.h$void();
      }
   }

   @Override
   public void i(boolean var1) {
      this.N.N(var1);
   }

   @Override
   public void E(int var1) {
      this.O.w();

      try {
         this.o = true;
         this.V -= var1;
         this.V = Math.max(this.V, this.o$int());
         this.m(-1);
         this.N.x(this.k, this.V);
      } finally {
         this.O.h$void();
      }
   }

   @Override
   public void T(int var1) {
      this.O.w();

      try {
         this.o = true;
         this.V += var1;
         this.V = Math.min(this.V, this.a());
         this.m(-1);
         this.N.x(this.k, this.V);
      } finally {
         this.O.h$void();
      }
   }

   public void o$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 03: aload 0
      // 04: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 07: invokevirtual com/finalshell/core/Im4.w ()V
      // 0a: istore 1
      // 0b: aload 0
      // 0c: iload 1
      // 0d: ifne 50
      // 10: getfield com/finalshell/core/Connect_2.V I
      // 13: aload 0
      // 14: getfield com/finalshell/core/Connect_2.Z I
      // 17: if_icmpne 39
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 0
      // 22: aload 0
      // 23: getfield com/finalshell/core/Connect_2.P I
      // 26: aload 0
      // 27: invokespecial com/finalshell/core/Connect_2.x$int ()I
      // 2a: bipush -1
      // 2b: invokespecial com/finalshell/core/Connect_2.d (III)V
      // 2e: iload 1
      // 2f: ifeq 60
      // 32: goto 39
      // 35: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: aload 0
      // 3a: dup
      // 3b: getfield com/finalshell/core/Connect_2.V I
      // 3e: bipush 1
      // 3f: iadd
      // 40: putfield com/finalshell/core/Connect_2.V I
      // 43: aload 0
      // 44: bipush -1
      // 45: invokespecial com/finalshell/core/Connect_2.m (I)V
      // 48: aload 0
      // 49: goto 50
      // 4c: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: getfield com/finalshell/core/Connect_2.N Lcom/finalshell/core/DV3;
      // 53: aload 0
      // 54: getfield com/finalshell/core/Connect_2.k I
      // 57: aload 0
      // 58: getfield com/finalshell/core/Connect_2.V I
      // 5b: invokeinterface com/finalshell/core/DV3.x (II)V 3
      // 60: aload 0
      // 61: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 64: invokevirtual com/finalshell/core/Im4.h$void ()V
      // 67: goto 74
      // 6a: astore 2
      // 6b: aload 0
      // 6c: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 6f: invokevirtual com/finalshell/core/Im4.h$void ()V
      // 72: aload 2
      // 73: athrow
      // 74: return
   }

   public void d(int var1, int var2, int var3) {
      this.N.l(var1, var2, var3);
      this.O.C(var1, var3, var1 + var2 - 1);
   }

   @Override
   public void K() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 03: aload 0
      // 04: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 07: invokevirtual com/finalshell/core/Im4.w ()V
      // 0a: istore 1
      // 0b: aload 0
      // 0c: bipush 0
      // 0d: putfield com/finalshell/core/Connect_2.k I
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 46
      // 15: getfield com/finalshell/core/Connect_2.V I
      // 18: aload 0
      // 19: getfield com/finalshell/core/Connect_2.Z I
      // 1c: if_icmpne 3e
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 0
      // 27: aload 0
      // 28: getfield com/finalshell/core/Connect_2.P I
      // 2b: aload 0
      // 2c: invokespecial com/finalshell/core/Connect_2.x$int ()I
      // 2f: bipush -1
      // 30: invokespecial com/finalshell/core/Connect_2.d (III)V
      // 33: iload 1
      // 34: ifeq 4f
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: aload 0
      // 3f: goto 46
      // 42: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45: athrow
      // 46: dup
      // 47: getfield com/finalshell/core/Connect_2.V I
      // 4a: bipush 1
      // 4b: iadd
      // 4c: putfield com/finalshell/core/Connect_2.V I
      // 4f: aload 0
      // 50: getfield com/finalshell/core/Connect_2.N Lcom/finalshell/core/DV3;
      // 53: aload 0
      // 54: getfield com/finalshell/core/Connect_2.k I
      // 57: aload 0
      // 58: getfield com/finalshell/core/Connect_2.V I
      // 5b: invokeinterface com/finalshell/core/DV3.x (II)V 3
      // 60: aload 0
      // 61: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 64: invokevirtual com/finalshell/core/Im4.h$void ()V
      // 67: goto 74
      // 6a: astore 2
      // 6b: aload 0
      // 6c: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 6f: invokevirtual com/finalshell/core/Im4.h$void ()V
      // 72: aload 2
      // 73: athrow
      // 74: return
   }

   public int x$int() {
      return this.Z - this.P + 1;
   }

   public void e$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 03: aload 0
      // 04: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 07: invokevirtual com/finalshell/core/Im4.w ()V
      // 0a: istore 1
      // 0b: aload 0
      // 0c: iload 1
      // 0d: ifeq 4b
      // 10: getfield com/finalshell/core/Connect_2.V I
      // 13: aload 0
      // 14: getfield com/finalshell/core/Connect_2.P I
      // 17: if_icmpne 39
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 0
      // 22: aload 0
      // 23: getfield com/finalshell/core/Connect_2.P I
      // 26: aload 0
      // 27: invokespecial com/finalshell/core/Connect_2.x$int ()I
      // 2a: bipush 1
      // 2b: invokespecial com/finalshell/core/Connect_2.d (III)V
      // 2e: iload 1
      // 2f: ifne 5b
      // 32: goto 39
      // 35: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: aload 0
      // 3a: dup
      // 3b: getfield com/finalshell/core/Connect_2.V I
      // 3e: bipush 1
      // 3f: isub
      // 40: putfield com/finalshell/core/Connect_2.V I
      // 43: aload 0
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: getfield com/finalshell/core/Connect_2.N Lcom/finalshell/core/DV3;
      // 4e: aload 0
      // 4f: getfield com/finalshell/core/Connect_2.k I
      // 52: aload 0
      // 53: getfield com/finalshell/core/Connect_2.V I
      // 56: invokeinterface com/finalshell/core/DV3.x (II)V 3
      // 5b: aload 0
      // 5c: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 5f: invokevirtual com/finalshell/core/Im4.h$void ()V
      // 62: goto 6f
      // 65: astore 2
      // 66: aload 0
      // 67: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 6a: invokevirtual com/finalshell/core/Im4.h$void ()V
      // 6d: aload 2
      // 6e: athrow
      // 6f: return
   }

   public int o$int() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual com/finalshell/core/Connect_2.q ()Z
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifeq 24
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Connect_2.P I
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 1
      // 25: ireturn
   }

   public int a() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 22
      // 09: invokevirtual com/finalshell/core/Connect_2.q ()Z
      // 0c: ifeq 21
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Connect_2.Z I
      // 1a: goto 25
      // 1d: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 0
      // 22: getfield com/finalshell/core/Connect_2.S I
      // 25: ireturn
   }

   @Override
   public void Z(int var1) {
      this.k += var1;
      this.k = Math.min(this.k, this.A - 1);
      this.m(1);
      this.N.x(this.k, this.V);
   }

   @Override
   public void p(int var1) {
      this.k -= var1;
      this.k = Math.max(this.k, 0);
      this.m(-1);
      this.N.x(this.k, this.V);
   }

   @Override
   public void R(RP3 var1) {
      this.N.e(var1);
   }

   @Override
   public void A(int var1) {
      this.i(var1, this.V);
   }

   @Override
   public void n(int var1) {
      this.V = var1;
      this.m(-1);
      this.N.x(this.k, this.V);
   }

   @Override
   public void i(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifeq 35
      // 09: invokevirtual com/finalshell/core/Connect_2.q ()Z
      // 0c: ifeq 2d
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: iload 2
      // 18: aload 0
      // 19: invokespecial com/finalshell/core/Connect_2.o$int ()I
      // 1c: iadd
      // 1d: bipush 1
      // 1e: isub
      // 1f: putfield com/finalshell/core/Connect_2.V I
      // 22: iload 3
      // 23: ifne 39
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: aload 0
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: iload 2
      // 36: putfield com/finalshell/core/Connect_2.V I
      // 39: aload 0
      // 3a: iload 3
      // 3b: ifeq 8c
      // 3e: getfield com/finalshell/core/Connect_2.V I
      // 41: aload 0
      // 42: invokespecial com/finalshell/core/Connect_2.a ()I
      // 45: if_icmple 5e
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: aload 0
      // 50: aload 0
      // 51: invokespecial com/finalshell/core/Connect_2.a ()I
      // 54: putfield com/finalshell/core/Connect_2.V I
      // 57: goto 5e
      // 5a: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d: athrow
      // 5e: aload 0
      // 5f: bipush 0
      // 60: iload 1
      // 61: bipush 1
      // 62: isub
      // 63: invokestatic java/lang/Math.max (II)I
      // 66: putfield com/finalshell/core/Connect_2.k I
      // 69: aload 0
      // 6a: aload 0
      // 6b: getfield com/finalshell/core/Connect_2.k I
      // 6e: aload 0
      // 6f: getfield com/finalshell/core/Connect_2.A I
      // 72: bipush 1
      // 73: isub
      // 74: invokestatic java/lang/Math.min (II)I
      // 77: putfield com/finalshell/core/Connect_2.k I
      // 7a: aload 0
      // 7b: bipush 0
      // 7c: aload 0
      // 7d: getfield com/finalshell/core/Connect_2.V I
      // 80: invokestatic java/lang/Math.max (II)I
      // 83: putfield com/finalshell/core/Connect_2.V I
      // 86: aload 0
      // 87: bipush -1
      // 88: invokespecial com/finalshell/core/Connect_2.m (I)V
      // 8b: aload 0
      // 8c: getfield com/finalshell/core/Connect_2.N Lcom/finalshell/core/DV3;
      // 8f: aload 0
      // 90: getfield com/finalshell/core/Connect_2.k I
      // 93: aload 0
      // 94: getfield com/finalshell/core/Connect_2.V I
      // 97: invokeinterface com/finalshell/core/DV3.x (II)V 3
      // 9c: return
   }

   @Override
   public void x(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 03: istore 3
      // 04: iload 3
      // 05: ifne 62
      // 08: iload 1
      // 09: iload 2
      // 0a: if_icmple 47
      // 0d: goto 14
      // 10: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13: athrow
      // 14: getstatic com/finalshell/core/Connect_2.f Lorg/slf4j/Logger;
      // 17: new java/lang/StringBuilder
      // 1a: dup
      // 1b: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e: sipush -2813
      // 21: sipush 14229
      // 24: invokestatic com/finalshell/core/Connect_2.a (II)Ljava/lang/String;
      // 27: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a: iload 1
      // 2b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2e: ldc_w ">"
      // 31: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 34: iload 2
      // 35: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 38: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3b: invokeinterface org/slf4j/Logger.error (Ljava/lang/String;)V 2
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: aload 0
      // 48: bipush 1
      // 49: iload 1
      // 4a: invokestatic java/lang/Math.max (II)I
      // 4d: putfield com/finalshell/core/Connect_2.P I
      // 50: aload 0
      // 51: aload 0
      // 52: getfield com/finalshell/core/Connect_2.S I
      // 55: iload 2
      // 56: invokestatic java/lang/Math.min (II)I
      // 59: putfield com/finalshell/core/Connect_2.Z I
      // 5c: aload 0
      // 5d: bipush 1
      // 5e: bipush 1
      // 5f: invokevirtual com/finalshell/core/Connect_2.i (II)V
      // 62: return
   }

   @Override
   public void N(int var1) {
      this.g(-var1);
   }

   @Override
   public void g(int var1) {
      this.O.w();

      try {
         this.d(this.P, this.x$int(), var1);
      } finally {
         this.O.h$void();
      }
   }

   @Override
   public void j() {
      this.x(1, this.S);
   }

   @Override
   public void c(YP var1) {
      this.j.W(var1);
   }

   @Override
   public void Y() {
      this.N.I();
   }

   @Override
   public int w$int() {
      return this.A - this.k;
   }

   @Override
   public void h() {
      this.U = this.e$XQ();
   }

   public XQ e$XQ() {
      return new XQ(this.k, this.V, this.j.U(), this.Q$boolean(), this.q(), this.F);
   }

   @Override
   public void t() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 46
      // 09: getfield com/finalshell/core/Connect_2.U Lcom/finalshell/core/XQ;
      // 0c: ifnull 29
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: getfield com/finalshell/core/Connect_2.U Lcom/finalshell/core/XQ;
      // 1b: invokevirtual com/finalshell/core/Connect_2.n (Lcom/finalshell/core/XQ;)V
      // 1e: iload 1
      // 1f: ifne 4c
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: aload 0
      // 2a: getstatic com/finalshell/ui/model/NZ.OriginMode Lcom/finalshell/ui/model/NZ;
      // 2d: bipush 0
      // 2e: invokevirtual com/finalshell/core/Connect_2.o (Lcom/finalshell/ui/model/NZ;Z)V
      // 31: aload 0
      // 32: bipush 1
      // 33: bipush 1
      // 34: invokevirtual com/finalshell/core/Connect_2.i (II)V
      // 37: aload 0
      // 38: getfield com/finalshell/core/Connect_2.j Lcom/finalshell/core/Ov4;
      // 3b: invokevirtual com/finalshell/core/Ov4.L ()V
      // 3e: aload 0
      // 3f: goto 46
      // 42: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45: athrow
      // 46: getfield com/finalshell/core/Connect_2.F Lcom/finalshell/core/R3;
      // 49: invokevirtual com/finalshell/core/R3.o ()V
      // 4c: aload 0
      // 4d: getfield com/finalshell/core/Connect_2.N Lcom/finalshell/core/DV3;
      // 50: aload 0
      // 51: getfield com/finalshell/core/Connect_2.k I
      // 54: aload 0
      // 55: getfield com/finalshell/core/Connect_2.V I
      // 58: invokeinterface com/finalshell/core/DV3.x (II)V 3
      // 5d: return
   }

   public void n(@NotNull XQ var1) {
      boolean var10000 = com.finalshell.ui.model.J2.g();
      this.k = var1.e$int();
      this.V = var1.q();
      boolean var2 = var10000;
      this.m(-1);
      this.j.W(var1.e$YP());
      this.o(com.finalshell.ui.model.NZ.AutoWrap, var1.Z());
      this.o(com.finalshell.ui.model.NZ.OriginMode, var1.u());
      PG3[] var3 = var1.E();
      int var4 = 0;

      int var10001;
      label40: {
         while (true) {
            if (var4 < var3.length) {
               try {
                  this.F.E(var4, var3[var4]);
                  var4++;
                  if (!var2) {
                     break;
                  }

                  if (var2) {
                     continue;
                  }
               } catch (IllegalArgumentException var7) {
                  throw a(var7);
               }
            }

            try {
               this.F.f(var1.g());
               var8 = this.F;
               var10001 = var1.S();
               if (!var2) {
                  break label40;
               }

               var8.o(var10001);
               break;
            } catch (IllegalArgumentException var6) {
               throw a(var6);
            }
         }

         try {
            if (var1.Y() < 0) {
               return;
            }

            var8 = this.F;
            var10001 = var1.Y();
         } catch (IllegalArgumentException var5) {
            throw a(var5);
         }
      }

      var8.F(var10001);
   }

   public void V$void() {
      this.F.o();
      this.j.L();
      this.O.W$void();
      this.N.x(true);
      this.m();
      this.F();
      this.i(1, 1);
   }

   public void F() {
      this.d(YT.MOUSE_REPORTING_NONE);
      this.L(On4.MOUSE_FORMAT_XTERM);
   }

   public void m() {
      this.w.clear();
      this.o(com.finalshell.ui.model.NZ.AutoWrap, true);
      this.o(com.finalshell.ui.model.NZ.AutoNewLine, false);
      this.o(com.finalshell.ui.model.NZ.CursorVisible, true);
      this.o(com.finalshell.ui.model.NZ.CursorBlinking, true);
   }

   public boolean G(@NotNull com.finalshell.ui.model.NZ var1) {
      return this.w.contains(var1);
   }

   public boolean V$boolean() {
      return this.w.contains(com.finalshell.ui.model.NZ.AutoNewLine);
   }

   public boolean q() {
      return this.w.contains(com.finalshell.ui.model.NZ.OriginMode);
   }

   public boolean Q$boolean() {
      return this.w.contains(com.finalshell.ui.model.NZ.AutoWrap);
   }

   public byte[] X(int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: sipush -2806
      // 003: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 006: new java/lang/StringBuilder
      // 009: dup
      // 00a: invokespecial java/lang/StringBuilder.<init> ()V
      // 00d: astore 5
      // 00f: istore 4
      // 011: sipush 16985
      // 014: invokestatic com/finalshell/core/Connect_2.a (II)Ljava/lang/String;
      // 017: astore 6
      // 019: iload 4
      // 01b: ifne 17d
      // 01e: getstatic com/finalshell/core/Iu2.P [I
      // 021: aload 0
      // 022: getfield com/finalshell/core/Connect_2.e Lcom/finalshell/ui/model/On4;
      // 025: invokevirtual com/finalshell/ui/model/On4.ordinal ()I
      // 028: iaload
      // 029: tableswitch 329 1 4 35 123 188 329
      // 048: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04b: athrow
      // 04c: aload 5
      // 04e: sipush -2801
      // 051: sipush -29025
      // 054: invokestatic com/finalshell/core/Connect_2.a (II)Ljava/lang/String;
      // 057: bipush 3
      // 058: anewarray 4
      // 05b: dup
      // 05c: bipush 0
      // 05d: sipush 6895
      // 060: ldc2_w 3803122291068587308
      // 063: invokestatic com/finalshell/core/Connect_2.a (IJ)I
      // 066: iload 1
      // 067: iadd
      // 068: i2c
      // 069: invokestatic java/lang/Character.valueOf (C)Ljava/lang/Character;
      // 06c: aastore
      // 06d: dup
      // 06e: bipush 1
      // 06f: sipush 13304
      // 072: ldc2_w 4301922201866495030
      // 075: invokestatic com/finalshell/core/Connect_2.a (IJ)I
      // 078: iload 2
      // 079: iadd
      // 07a: i2c
      // 07b: invokestatic java/lang/Character.valueOf (C)Ljava/lang/Character;
      // 07e: aastore
      // 07f: dup
      // 080: bipush 2
      // 081: sipush 13304
      // 084: ldc2_w 4301922201866495030
      // 087: invokestatic com/finalshell/core/Connect_2.a (IJ)I
      // 08a: iload 3
      // 08b: iadd
      // 08c: i2c
      // 08d: invokestatic java/lang/Character.valueOf (C)Ljava/lang/Character;
      // 090: aastore
      // 091: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 094: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 097: pop
      // 098: iload 4
      // 09a: ifeq 1c9
      // 09d: goto 0a4
      // 0a0: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a3: athrow
      // 0a4: aload 5
      // 0a6: sipush -2810
      // 0a9: sipush 31254
      // 0ac: invokestatic com/finalshell/core/Connect_2.a (II)Ljava/lang/String;
      // 0af: bipush 3
      // 0b0: anewarray 4
      // 0b3: dup
      // 0b4: bipush 0
      // 0b5: sipush 13304
      // 0b8: ldc2_w 4301922201866495030
      // 0bb: invokestatic com/finalshell/core/Connect_2.a (IJ)I
      // 0be: iload 1
      // 0bf: iadd
      // 0c0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c3: aastore
      // 0c4: dup
      // 0c5: bipush 1
      // 0c6: iload 2
      // 0c7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ca: aastore
      // 0cb: dup
      // 0cc: bipush 2
      // 0cd: iload 3
      // 0ce: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d1: aastore
      // 0d2: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d8: pop
      // 0d9: iload 4
      // 0db: ifeq 1c9
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: iload 1
      // 0e6: sipush 31532
      // 0e9: ldc2_w 970416736240053482
      // 0ec: invokestatic com/finalshell/core/Connect_2.a (IJ)I
      // 0ef: iand
      // 0f0: ifeq 13b
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f9: athrow
      // 0fa: aload 5
      // 0fc: sipush -2796
      // 0ff: sipush -13970
      // 102: invokestatic com/finalshell/core/Connect_2.a (II)Ljava/lang/String;
      // 105: bipush 3
      // 106: anewarray 4
      // 109: dup
      // 10a: bipush 0
      // 10b: iload 1
      // 10c: sipush 4309
      // 10f: ldc2_w 5314941769028880153
      // 112: invokestatic com/finalshell/core/Connect_2.a (IJ)I
      // 115: ixor
      // 116: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 119: aastore
      // 11a: dup
      // 11b: bipush 1
      // 11c: iload 2
      // 11d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 120: aastore
      // 121: dup
      // 122: bipush 2
      // 123: iload 3
      // 124: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 127: aastore
      // 128: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 12b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12e: pop
      // 12f: iload 4
      // 131: ifeq 1c9
      // 134: goto 13b
      // 137: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13a: athrow
      // 13b: aload 5
      // 13d: sipush -2814
      // 140: sipush 16259
      // 143: invokestatic com/finalshell/core/Connect_2.a (II)Ljava/lang/String;
      // 146: bipush 3
      // 147: anewarray 4
      // 14a: dup
      // 14b: bipush 0
      // 14c: iload 1
      // 14d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 150: aastore
      // 151: dup
      // 152: bipush 1
      // 153: iload 2
      // 154: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 157: aastore
      // 158: dup
      // 159: bipush 2
      // 15a: iload 3
      // 15b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 15e: aastore
      // 15f: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 162: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 165: pop
      // 166: iload 4
      // 168: ifeq 1c9
      // 16b: goto 172
      // 16e: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 171: athrow
      // 172: sipush -2809
      // 175: sipush -10647
      // 178: invokestatic com/finalshell/core/Connect_2.a (II)Ljava/lang/String;
      // 17b: astore 6
      // 17d: aload 5
      // 17f: sipush -2802
      // 182: sipush 15970
      // 185: invokestatic com/finalshell/core/Connect_2.a (II)Ljava/lang/String;
      // 188: bipush 3
      // 189: anewarray 4
      // 18c: dup
      // 18d: bipush 0
      // 18e: sipush 13304
      // 191: ldc2_w 4301922201866495030
      // 194: invokestatic com/finalshell/core/Connect_2.a (IJ)I
      // 197: iload 1
      // 198: iadd
      // 199: i2c
      // 19a: invokestatic java/lang/Character.valueOf (C)Ljava/lang/Character;
      // 19d: aastore
      // 19e: dup
      // 19f: bipush 1
      // 1a0: sipush 13304
      // 1a3: ldc2_w 4301922201866495030
      // 1a6: invokestatic com/finalshell/core/Connect_2.a (IJ)I
      // 1a9: iload 2
      // 1aa: iadd
      // 1ab: i2c
      // 1ac: invokestatic java/lang/Character.valueOf (C)Ljava/lang/Character;
      // 1af: aastore
      // 1b0: dup
      // 1b1: bipush 2
      // 1b2: sipush 13304
      // 1b5: ldc2_w 4301922201866495030
      // 1b8: invokestatic com/finalshell/core/Connect_2.a (IJ)I
      // 1bb: iload 3
      // 1bc: iadd
      // 1bd: i2c
      // 1be: invokestatic java/lang/Character.valueOf (C)Ljava/lang/Character;
      // 1c1: aastore
      // 1c2: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 1c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c8: pop
      // 1c9: getstatic com/finalshell/core/Connect_2.f Lorg/slf4j/Logger;
      // 1cc: new java/lang/StringBuilder
      // 1cf: dup
      // 1d0: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d3: aload 0
      // 1d4: getfield com/finalshell/core/Connect_2.e Lcom/finalshell/ui/model/On4;
      // 1d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1da: sipush -2803
      // 1dd: sipush 1054
      // 1e0: invokestatic com/finalshell/core/Connect_2.a (II)Ljava/lang/String;
      // 1e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e6: aload 6
      // 1e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1eb: sipush -2812
      // 1ee: sipush 23659
      // 1f1: invokestatic com/finalshell/core/Connect_2.a (II)Ljava/lang/String;
      // 1f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f7: iload 1
      // 1f8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1fb: sipush -2811
      // 1fe: sipush -8881
      // 201: invokestatic com/finalshell/core/Connect_2.a (II)Ljava/lang/String;
      // 204: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 207: iload 2
      // 208: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 20b: ldc_w "x"
      // 20e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 211: iload 3
      // 212: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 215: sipush -2804
      // 218: sipush -7152
      // 21b: invokestatic com/finalshell/core/Connect_2.a (II)Ljava/lang/String;
      // 21e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 221: aload 5
      // 223: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 226: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 229: invokeinterface org/slf4j/Logger.debug (Ljava/lang/String;)V 2
      // 22e: aload 5
      // 230: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 233: aload 6
      // 235: invokestatic java/nio/charset/Charset.forName (Ljava/lang/String;)Ljava/nio/charset/Charset;
      // 238: invokevirtual java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
      // 23b: areturn
   }

   public boolean E(YT[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 21
      // 09: getfield com/finalshell/core/Connect_2.d2 Lcom/finalshell/ui/model/YT;
      // 0c: getstatic com/finalshell/ui/model/YT.MOUSE_REPORTING_NONE Lcom/finalshell/ui/model/YT;
      // 0f: if_acmpeq 32
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: iload 2
      // 22: ifeq 39
      // 25: getfield com/finalshell/core/Connect_2.D Lcom/finalshell/core/PD3;
      // 28: ifnonnull 38
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: aload 0
      // 39: getfield com/finalshell/core/Connect_2.d2 Lcom/finalshell/ui/model/YT;
      // 3c: getstatic com/finalshell/ui/model/YT.MOUSE_REPORTING_ALL_MOTION Lcom/finalshell/ui/model/YT;
      // 3f: if_acmpne 48
      // 42: bipush 1
      // 43: ireturn
      // 44: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: aload 1
      // 49: astore 3
      // 4a: aload 3
      // 4b: arraylength
      // 4c: istore 4
      // 4e: bipush 0
      // 4f: istore 5
      // 51: iload 5
      // 53: iload 4
      // 55: if_icmpge 7f
      // 58: aload 3
      // 59: iload 5
      // 5b: aaload
      // 5c: astore 6
      // 5e: iload 2
      // 5f: ifeq 7b
      // 62: aload 0
      // 63: getfield com/finalshell/core/Connect_2.d2 Lcom/finalshell/ui/model/YT;
      // 66: aload 6
      // 68: if_acmpne 78
      // 6b: goto 72
      // 6e: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71: athrow
      // 72: bipush 1
      // 73: ireturn
      // 74: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 77: athrow
      // 78: iinc 5 1
      // 7b: iload 2
      // 7c: ifne 51
      // 7f: bipush 0
      // 80: ireturn
   }

   @Override
   public void u(int param1, int param2, @NotNull EC param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 03: istore 4
      // 05: aload 0
      // 06: bipush 2
      // 07: anewarray 148
      // 0a: dup
      // 0b: bipush 0
      // 0c: getstatic com/finalshell/ui/model/YT.MOUSE_REPORTING_NORMAL Lcom/finalshell/ui/model/YT;
      // 0f: aastore
      // 10: dup
      // 11: bipush 1
      // 12: getstatic com/finalshell/ui/model/YT.MOUSE_REPORTING_BUTTON_MOTION Lcom/finalshell/ui/model/YT;
      // 15: aastore
      // 16: invokespecial com/finalshell/core/Connect_2.E ([Lcom/finalshell/ui/model/YT;)Z
      // 19: iload 4
      // 1b: ifne 33
      // 1e: ifeq ca
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 3
      // 29: invokevirtual com/finalshell/core/EC.O ()I
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: istore 5
      // 35: iload 5
      // 37: bipush -1
      // 38: iload 4
      // 3a: ifne 5d
      // 3d: if_icmpeq ca
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: iload 5
      // 49: iload 4
      // 4b: ifne 7a
      // 4e: goto 55
      // 51: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: bipush 4
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: if_icmpeq 79
      // 60: iload 5
      // 62: bipush 5
      // 63: iload 4
      // 65: ifne 97
      // 68: goto 6f
      // 6b: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e: athrow
      // 6f: if_icmpne 91
      // 72: goto 79
      // 75: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78: athrow
      // 79: bipush 4
      // 7a: istore 6
      // 7c: iload 5
      // 7e: iload 6
      // 80: isub
      // 81: istore 5
      // 83: iload 5
      // 85: sipush 4151
      // 88: ldc2_w 934655854567147507
      // 8b: invokestatic com/finalshell/core/Connect_2.a (IJ)I
      // 8e: ior
      // 8f: istore 5
      // 91: iload 5
      // 93: aload 3
      // 94: invokevirtual com/finalshell/core/EC.C ()I
      // 97: ior
      // 98: istore 5
      // 9a: aload 0
      // 9b: getfield com/finalshell/core/Connect_2.D Lcom/finalshell/core/PD3;
      // 9e: iload 4
      // a0: ifne b8
      // a3: ifnull ca
      // a6: goto ad
      // a9: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ac: athrow
      // ad: aload 0
      // ae: getfield com/finalshell/core/Connect_2.D Lcom/finalshell/core/PD3;
      // b1: goto b8
      // b4: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b7: athrow
      // b8: aload 0
      // b9: iload 5
      // bb: iload 1
      // bc: bipush 1
      // bd: iadd
      // be: iload 2
      // bf: bipush 1
      // c0: iadd
      // c1: invokespecial com/finalshell/core/Connect_2.X (III)[B
      // c4: bipush 1
      // c5: invokeinterface com/finalshell/core/PD3.L ([BZ)V 3
      // ca: return
   }

   @Override
   public void z(int param1, int param2, @NotNull EC param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 03: istore 4
      // 05: aload 0
      // 06: iload 4
      // 08: ifne a1
      // 0b: bipush 2
      // 0c: anewarray 148
      // 0f: dup
      // 10: bipush 0
      // 11: getstatic com/finalshell/ui/model/YT.MOUSE_REPORTING_NORMAL Lcom/finalshell/ui/model/YT;
      // 14: aastore
      // 15: dup
      // 16: bipush 1
      // 17: getstatic com/finalshell/ui/model/YT.MOUSE_REPORTING_BUTTON_MOTION Lcom/finalshell/ui/model/YT;
      // 1a: aastore
      // 1b: invokespecial com/finalshell/core/Connect_2.E ([Lcom/finalshell/ui/model/YT;)Z
      // 1e: ifeq a0
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 3
      // 29: invokevirtual com/finalshell/core/EC.O ()I
      // 2c: istore 5
      // 2e: iload 4
      // 30: ifne a5
      // 33: iload 5
      // 35: bipush -1
      // 36: if_icmpeq a0
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield com/finalshell/core/Connect_2.e Lcom/finalshell/ui/model/On4;
      // 44: getstatic com/finalshell/ui/model/On4.MOUSE_FORMAT_SGR Lcom/finalshell/ui/model/On4;
      // 47: if_acmpne 64
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: iload 5
      // 53: sipush 4309
      // 56: ldc2_w 5314941769028880153
      // 59: invokestatic com/finalshell/core/Connect_2.a (IJ)I
      // 5c: ior
      // 5d: istore 5
      // 5f: iload 4
      // 61: ifeq 67
      // 64: bipush 3
      // 65: istore 5
      // 67: iload 5
      // 69: aload 3
      // 6a: invokevirtual com/finalshell/core/EC.C ()I
      // 6d: ior
      // 6e: istore 5
      // 70: aload 0
      // 71: iload 4
      // 73: ifne a1
      // 76: getfield com/finalshell/core/Connect_2.D Lcom/finalshell/core/PD3;
      // 79: ifnull a0
      // 7c: goto 83
      // 7f: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 82: athrow
      // 83: aload 0
      // 84: getfield com/finalshell/core/Connect_2.D Lcom/finalshell/core/PD3;
      // 87: aload 0
      // 88: iload 5
      // 8a: iload 1
      // 8b: bipush 1
      // 8c: iadd
      // 8d: iload 2
      // 8e: bipush 1
      // 8f: iadd
      // 90: invokespecial com/finalshell/core/Connect_2.X (III)[B
      // 93: bipush 1
      // 94: invokeinterface com/finalshell/core/PD3.L ([BZ)V 3
      // 99: goto a0
      // 9c: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9f: athrow
      // a0: aload 0
      // a1: aconst_null
      // a2: putfield com/finalshell/core/Connect_2.p Lcom/finalshell/core/XE;
      // a5: return
   }

   @Override
   public void R(int param1, int param2, @NotNull EC param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 03: istore 4
      // 05: aload 0
      // 06: iload 4
      // 08: ifeq 40
      // 0b: getfield com/finalshell/core/Connect_2.p Lcom/finalshell/core/XE;
      // 0e: ifnull 3f
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 0
      // 19: getfield com/finalshell/core/Connect_2.p Lcom/finalshell/core/XE;
      // 1c: new com/finalshell/core/XE
      // 1f: dup
      // 20: iload 1
      // 21: iload 2
      // 22: invokespecial com/finalshell/core/XE.<init> (II)V
      // 25: invokevirtual com/finalshell/core/XE.equals (Ljava/lang/Object;)Z
      // 28: iload 4
      // 2a: ifeq 59
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: ifeq 3f
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: return
      // 3f: aload 0
      // 40: iload 4
      // 42: ifeq 93
      // 45: bipush 1
      // 46: anewarray 148
      // 49: dup
      // 4a: bipush 0
      // 4b: getstatic com/finalshell/ui/model/YT.MOUSE_REPORTING_ALL_MOTION Lcom/finalshell/ui/model/YT;
      // 4e: aastore
      // 4f: invokespecial com/finalshell/core/Connect_2.E ([Lcom/finalshell/ui/model/YT;)Z
      // 52: goto 59
      // 55: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58: athrow
      // 59: ifeq 92
      // 5c: aload 0
      // 5d: iload 4
      // 5f: ifeq 93
      // 62: goto 69
      // 65: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68: athrow
      // 69: getfield com/finalshell/core/Connect_2.D Lcom/finalshell/core/PD3;
      // 6c: ifnull 92
      // 6f: goto 76
      // 72: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75: athrow
      // 76: aload 0
      // 77: getfield com/finalshell/core/Connect_2.D Lcom/finalshell/core/PD3;
      // 7a: aload 0
      // 7b: bipush 3
      // 7c: iload 1
      // 7d: bipush 1
      // 7e: iadd
      // 7f: iload 2
      // 80: bipush 1
      // 81: iadd
      // 82: invokespecial com/finalshell/core/Connect_2.X (III)[B
      // 85: bipush 1
      // 86: invokeinterface com/finalshell/core/PD3.L ([BZ)V 3
      // 8b: goto 92
      // 8e: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 91: athrow
      // 92: aload 0
      // 93: new com/finalshell/core/XE
      // 96: dup
      // 97: iload 1
      // 98: iload 2
      // 99: invokespecial com/finalshell/core/XE.<init> (II)V
      // 9c: putfield com/finalshell/core/Connect_2.p Lcom/finalshell/core/XE;
      // 9f: return
   }

   @Override
   public void G(int param1, int param2, @NotNull EC param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 03: istore 4
      // 05: aload 0
      // 06: iload 4
      // 08: ifne 40
      // 0b: getfield com/finalshell/core/Connect_2.p Lcom/finalshell/core/XE;
      // 0e: ifnull 3f
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 0
      // 19: getfield com/finalshell/core/Connect_2.p Lcom/finalshell/core/XE;
      // 1c: new com/finalshell/core/XE
      // 1f: dup
      // 20: iload 1
      // 21: iload 2
      // 22: invokespecial com/finalshell/core/XE.<init> (II)V
      // 25: invokevirtual com/finalshell/core/XE.equals (Ljava/lang/Object;)Z
      // 28: iload 4
      // 2a: ifne 59
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: ifeq 3f
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: return
      // 3f: aload 0
      // 40: iload 4
      // 42: ifne bc
      // 45: bipush 1
      // 46: anewarray 148
      // 49: dup
      // 4a: bipush 0
      // 4b: getstatic com/finalshell/ui/model/YT.MOUSE_REPORTING_BUTTON_MOTION Lcom/finalshell/ui/model/YT;
      // 4e: aastore
      // 4f: invokespecial com/finalshell/core/Connect_2.E ([Lcom/finalshell/ui/model/YT;)Z
      // 52: goto 59
      // 55: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58: athrow
      // 59: ifeq bb
      // 5c: aload 3
      // 5d: invokevirtual com/finalshell/core/EC.O ()I
      // 60: istore 5
      // 62: iload 4
      // 64: ifne c8
      // 67: iload 5
      // 69: bipush -1
      // 6a: if_icmpeq bb
      // 6d: goto 74
      // 70: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73: athrow
      // 74: iload 5
      // 76: sipush 13304
      // 79: ldc2_w 4301922201866495030
      // 7c: invokestatic com/finalshell/core/Connect_2.a (IJ)I
      // 7f: ior
      // 80: istore 5
      // 82: iload 5
      // 84: aload 3
      // 85: invokevirtual com/finalshell/core/EC.C ()I
      // 88: ior
      // 89: istore 5
      // 8b: aload 0
      // 8c: iload 4
      // 8e: ifne bc
      // 91: getfield com/finalshell/core/Connect_2.D Lcom/finalshell/core/PD3;
      // 94: ifnull bb
      // 97: goto 9e
      // 9a: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9d: athrow
      // 9e: aload 0
      // 9f: getfield com/finalshell/core/Connect_2.D Lcom/finalshell/core/PD3;
      // a2: aload 0
      // a3: iload 5
      // a5: iload 1
      // a6: bipush 1
      // a7: iadd
      // a8: iload 2
      // a9: bipush 1
      // aa: iadd
      // ab: invokespecial com/finalshell/core/Connect_2.X (III)[B
      // ae: bipush 1
      // af: invokeinterface com/finalshell/core/PD3.L ([BZ)V 3
      // b4: goto bb
      // b7: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ba: athrow
      // bb: aload 0
      // bc: new com/finalshell/core/XE
      // bf: dup
      // c0: iload 1
      // c1: iload 2
      // c2: invokespecial com/finalshell/core/XE.<init> (II)V
      // c5: putfield com/finalshell/core/Connect_2.p Lcom/finalshell/core/XE;
      // c8: return
   }

   @Override
   public void i(int var1, int var2, @NotNull Eo2 var3) {
      this.u(var1, var2, var3);
   }

   @Override
   public void e(PD3 var1) {
      this.D = var1;
   }

   @Override
   public void d(@NotNull YT var1) {
      this.d2 = var1;
      this.N.W(var1);
   }

   @Override
   public void h(boolean var1) {
      this.W.D(var1);
   }

   @Override
   public void I(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: getfield com/finalshell/core/Connect_2.D Lcom/finalshell/core/PD3;
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifnull 28
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Connect_2.D Lcom/finalshell/core/PD3;
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 1
      // 22: bipush 0
      // 23: invokeinterface com/finalshell/core/PD3.s (Ljava/lang/String;Z)V 3
      // 28: return
   }

   @Override
   public void R(byte[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: getfield com/finalshell/core/Connect_2.D Lcom/finalshell/core/PD3;
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifnull 28
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Connect_2.D Lcom/finalshell/core/PD3;
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 1
      // 22: bipush 0
      // 23: invokeinterface com/finalshell/core/PD3.L ([BZ)V 3
      // 28: return
   }

   @Override
   public void T(@NotNull String var1) {
      boolean var10000 = com.finalshell.ui.model.J2.P();
      YP var3 = this.j.U();
      In4 var4 = this.O.p();
      boolean var2 = var10000;

      label20: {
         try {
            var7 = var4;
            if (var2) {
               break label20;
            }

            if (var4 == null) {
               return;
            }
         } catch (IllegalArgumentException var6) {
            throw a(var6);
         }

         var7 = var4;
      }

      List var5 = var7.Y(var1);
      var5.stream().filter(Connect_2::lambda$setLinkUriStarted$0).findFirst().ifPresent(this::lambda$setLinkUriStarted$1);
   }

   @Override
   public void s() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 03: aload 0
      // 04: getfield com/finalshell/core/Connect_2.j Lcom/finalshell/core/Ov4;
      // 07: invokevirtual com/finalshell/core/Ov4.U ()Lcom/finalshell/core/YP;
      // 0a: astore 2
      // 0b: istore 1
      // 0c: aload 2
      // 0d: iload 1
      // 0e: ifne 2c
      // 11: instanceof com/finalshell/core/Yw2
      // 14: ifeq 40
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 2
      // 1f: checkcast com/finalshell/core/Yw2
      // 22: invokevirtual com/finalshell/core/Yw2.J ()Lcom/finalshell/core/YP;
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: astore 3
      // 2d: aload 3
      // 2e: ifnull 40
      // 31: aload 0
      // 32: getfield com/finalshell/core/Connect_2.j Lcom/finalshell/core/Ov4;
      // 35: aload 3
      // 36: invokevirtual com/finalshell/core/Ov4.W (Lcom/finalshell/core/YP;)V
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: return
   }

   @Override
   public void v(boolean var1) {
      this.N.z(var1);
   }

   @Override
   public void L(On4 var1) {
      this.e = var1;
   }

   public void m(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: getfield com/finalshell/core/Connect_2.V I
      // 08: iload 2
      // 09: ifne 39
      // 0c: aload 0
      // 0d: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 10: invokevirtual com/finalshell/core/Im4.H ()I
      // 13: ineg
      // 14: if_icmple ae
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield com/finalshell/core/Connect_2.O Lcom/finalshell/core/Im4;
      // 22: aload 0
      // 23: getfield com/finalshell/core/Connect_2.k I
      // 26: aload 0
      // 27: getfield com/finalshell/core/Connect_2.V I
      // 2a: bipush 1
      // 2b: isub
      // 2c: invokevirtual com/finalshell/core/Im4.E (II)C
      // 2f: invokestatic java/lang/Character.isLowSurrogate (C)Z
      // 32: goto 39
      // 35: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: iload 2
      // 3a: ifne 48
      // 3d: ifeq ae
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: iload 1
      // 48: iload 2
      // 49: ifne 6c
      // 4c: ifle 9d
      // 4f: goto 56
      // 52: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: aload 0
      // 57: iload 2
      // 58: ifne 90
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: getfield com/finalshell/core/Connect_2.k I
      // 65: goto 6c
      // 68: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b: athrow
      // 6c: aload 0
      // 6d: getfield com/finalshell/core/Connect_2.A I
      // 70: if_icmpne 88
      // 73: aload 0
      // 74: dup
      // 75: getfield com/finalshell/core/Connect_2.k I
      // 78: bipush 1
      // 79: isub
      // 7a: putfield com/finalshell/core/Connect_2.k I
      // 7d: iload 2
      // 7e: ifeq ae
      // 81: goto 88
      // 84: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 87: athrow
      // 88: aload 0
      // 89: goto 90
      // 8c: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8f: athrow
      // 90: dup
      // 91: getfield com/finalshell/core/Connect_2.k I
      // 94: bipush 1
      // 95: iadd
      // 96: putfield com/finalshell/core/Connect_2.k I
      // 99: iload 2
      // 9a: ifeq ae
      // 9d: aload 0
      // 9e: dup
      // 9f: getfield com/finalshell/core/Connect_2.k I
      // a2: bipush 1
      // a3: isub
      // a4: putfield com/finalshell/core/Connect_2.k I
      // a7: goto ae
      // aa: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ad: athrow
      // ae: return
   }

   public int N$int() {
      return this.k;
   }

   @Override
   public void i(int var1) {
      this.k = var1;
      this.m(-1);
   }

   public int I$int() {
      return this.V;
   }

   @Override
   public void q(int var1) {
      this.V = var1;
      this.m(-1);
   }

   public void R(String var1) {
      this.k(var1);
   }

   @Override
   public void m(@NotNull OT var1, @NotNull WF3 var2) {
      this.z(var1, var2, CompletableFuture.completedFuture(null));
   }

   @Override
   public void z(@NotNull OT var1, @NotNull WF3 var2, @NotNull CompletableFuture var3) {
      this.Z(V(var1), var2, var3);
   }

   public void Z(@NotNull OT param1, @NotNull WF3 param2, @NotNull CompletableFuture param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 03: aload 0
      // 04: getfield com/finalshell/core/Connect_2.S I
      // 07: istore 5
      // 09: istore 4
      // 0b: aload 1
      // 0c: invokevirtual com/finalshell/core/OT.R ()I
      // 0f: aload 0
      // 10: getfield com/finalshell/core/Connect_2.A I
      // 13: iload 4
      // 15: ifne 49
      // 18: if_icmpne 41
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 1
      // 23: invokevirtual com/finalshell/core/OT.c ()I
      // 26: aload 0
      // 27: getfield com/finalshell/core/Connect_2.S I
      // 2a: iload 4
      // 2c: ifne 49
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: if_icmpne 41
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: return
      // 41: aload 1
      // 42: invokevirtual com/finalshell/core/OT.R ()I
      // 45: aload 0
      // 46: getfield com/finalshell/core/Connect_2.A I
      // 49: if_icmpne 60
      // 4c: aload 0
      // 4d: aload 1
      // 4e: aload 2
      // 4f: iload 5
      // 51: invokespecial com/finalshell/core/Connect_2.L (Lcom/finalshell/core/OT;Lcom/finalshell/ui/model/WF3;I)V
      // 54: iload 4
      // 56: ifeq 86
      // 59: goto 60
      // 5c: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f: athrow
      // 60: aload 0
      // 61: aload 1
      // 62: invokevirtual com/finalshell/core/OT.R ()I
      // 65: putfield com/finalshell/core/Connect_2.A I
      // 68: aload 0
      // 69: aload 1
      // 6a: invokevirtual com/finalshell/core/OT.c ()I
      // 6d: putfield com/finalshell/core/Connect_2.S I
      // 70: aload 3
      // 71: aload 0
      // 72: aload 1
      // 73: aload 2
      // 74: iload 5
      // 76: invokedynamic run (Lcom/finalshell/core/Connect_2;Lcom/finalshell/core/OT;Lcom/finalshell/ui/model/WF3;I)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/finalshell/core/Connect_2.lambda$resizeInternal$2 (Lcom/finalshell/core/OT;Lcom/finalshell/ui/model/WF3;I)V, ()V ]
      // 7b: invokevirtual java/util/concurrent/CompletableFuture.thenRun (Ljava/lang/Runnable;)Ljava/util/concurrent/CompletableFuture;
      // 7e: pop
      // 7f: goto 86
      // 82: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 85: athrow
      // 86: return
   }

   public void L(@NotNull OT var1, @NotNull WF3 var2, int var3) {
      this.N.c(var1, var2, this.k, this.V, this::lambda$doResize$3);
      this.Z = this.Z + (this.S - var3);
      if (this.S - var3 < 0) {
      }
   }

   @NotNull
   public static OT V(@NotNull OT var0) {
      return new OT(Math.max(a, var0.R()), Math.max(d, var0.c()));
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void w(char var1) {
      boolean var10000 = com.finalshell.ui.model.J2.P();
      this.O.w();
      boolean var2 = var10000;
      boolean var8 = false /* VF: Semaphore variable */;

      try {
         var8 = true;
         char[] var3 = new char[this.A];
         Arrays.fill(var3, var1);
         int var4 = 1;

         while (true) {
            if (var4 <= this.S) {
               try {
                  this.O.h(0, var4, this.j(var3));
                  var4++;
                  if (var2) {
                     var8 = false;
                     return;
                  }

                  if (!var2) {
                     continue;
                  }

                  var8 = false;
                  break;
               } catch (IllegalArgumentException var9) {
                  throw a(var9);
               }
            }

            var8 = false;
            break;
         }
      } finally {
         if (var8) {
            this.O.h$void();
         }
      }

      this.O.h$void();
   }

   @NotNull
   public com.finalshell.ui.model.J2 j(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 03: aload 1
      // 04: bipush 0
      // 05: aload 1
      // 06: arraylength
      // 07: aload 0
      // 08: getfield com/finalshell/core/Connect_2.N Lcom/finalshell/core/DV3;
      // 0b: invokeinterface com/finalshell/core/DV3.H ()Z 1
      // 10: invokestatic com/finalshell/core/Sd2.u ([CIIZ)I
      // 13: istore 3
      // 14: istore 2
      // 15: iload 3
      // 16: iload 2
      // 17: ifeq 2f
      // 1a: ifle a2
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 1
      // 25: arraylength
      // 26: iload 3
      // 27: iadd
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: newarray 5
      // 31: astore 4
      // 33: bipush 0
      // 34: istore 5
      // 36: bipush 0
      // 37: istore 6
      // 39: iload 6
      // 3b: aload 1
      // 3c: arraylength
      // 3d: if_icmpge 9e
      // 40: aload 4
      // 42: iload 5
      // 44: aload 1
      // 45: iload 6
      // 47: caload
      // 48: castore
      // 49: aload 1
      // 4a: iload 6
      // 4c: invokestatic java/lang/Character.codePointAt ([CI)I
      // 4f: istore 7
      // 51: iload 7
      // 53: aload 0
      // 54: getfield com/finalshell/core/Connect_2.N Lcom/finalshell/core/DV3;
      // 57: invokeinterface com/finalshell/core/DV3.H ()Z 1
      // 5c: invokestatic com/finalshell/core/Sd2.U (IZ)Z
      // 5f: istore 8
      // 61: iload 2
      // 62: ifeq a5
      // 65: iload 2
      // 66: ifeq 9a
      // 69: goto 70
      // 6c: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f: athrow
      // 70: iload 8
      // 72: ifeq 94
      // 75: goto 7c
      // 78: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b: athrow
      // 7c: iinc 5 1
      // 7f: aload 4
      // 81: iload 5
      // 83: sipush 5580
      // 86: ldc2_w 9183414307772318219
      // 89: invokestatic com/finalshell/core/Connect_2.a (IJ)I
      // 8c: castore
      // 8d: goto 94
      // 90: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 93: athrow
      // 94: iinc 5 1
      // 97: iinc 6 1
      // 9a: iload 2
      // 9b: ifne 39
      // 9e: iload 2
      // 9f: ifne a5
      // a2: aload 1
      // a3: astore 4
      // a5: new com/finalshell/ui/model/J2
      // a8: dup
      // a9: aload 4
      // ab: bipush 0
      // ac: aload 4
      // ae: arraylength
      // af: invokespecial com/finalshell/ui/model/J2.<init> ([CII)V
      // b2: areturn
   }

   public int R$int() {
      return this.A;
   }

   @Override
   public int b() {
      return this.S;
   }

   @Override
   public int z() {
      return this.k + 1;
   }

   public int A$int() {
      return this.V;
   }

   public Ov4 I$ov_4() {
      return this.j;
   }

   public WZ S(@NotNull String var1, boolean var2) {
      try {
         if (var1.length() == 0) {
            return null;
         }
      } catch (IllegalArgumentException var4) {
         throw a(var4);
      }

      Dx4 var3 = new Dx4(var1, var2);
      this.O.q(-this.O.H(), -1, new Lc4(this, var3));
      return var3.i();
   }

   public void X() {
      this.N = null;
      this.O = null;
      this.j = null;
      this.U = null;
      this.w = null;
      this.W = null;
      this.Y = null;
      this.G = null;
      this.F = null;
      this.e = null;
      this.D = null;
      this.d2 = null;
      this.p = null;
      this.r = null;
      this.z = null;
      this.c = null;
      this.m = null;
      this.i = null;
      this.u = null;
      this.H = null;
      this.X = null;
      this.L = null;
      this.h = null;
      this.n = null;
      this.q = null;
      this.T = null;
      this.E = null;
      this.l = null;
      this.x = null;
   }

   public void I$void() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new com.finalshell.task.YI3(this), Registry.lookupField(222883478649268280L).getInt(null));
      long var2 = 266288712085965362L;
      Object[] var1 = var10001;
      Ref.h(266288712085965362L, var1, var2);
   }

   public void lambda$doResize$3(int var1, int var2, int var3, int var4) {
      this.A = var1;
      this.S = var2;
      this.V = var4;
      this.k = Math.min(var3, this.A - 1);
      this.N.x(this.k, this.V);
      this.G.K(this.A);
   }

   public void lambda$resizeInternal$2(OT var1, WF3 var2, int var3) {
      this.L(var1, var2, var3);
   }

   public void lambda$setLinkUriStarted$1(YP var1, O2_3 var2) {
      this.j.W(new Yw2(var1, var2.O()));
   }

   public static boolean lambda$setLinkUriStarted$0(String param0, O2_3 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual com/finalshell/core/O2_3.U ()I
      // 08: iload 2
      // 09: ifeq 21
      // 0c: ifne 3e
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual com/finalshell/core/O2_3.c ()I
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: iload 2
      // 22: ifeq 3b
      // 25: aload 0
      // 26: invokevirtual java/lang/String.length ()I
      // 29: if_icmpne 3e
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: bipush 1
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/Connect_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: goto 3f
      // 3e: bipush 0
      // 3f: ireturn
   }

   static int W(Connect_2 var0) {
      return var0.V;
   }

   static Im4 y(Connect_2 var0) {
      return var0.O;
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -2812) & 65535;
      if (bb[var2] == null) {
         char[] var3 = ab[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 150;
               break;
            case 1:
               var10000 = 198;
               break;
            case 2:
               var10000 = 171;
               break;
            case 3:
               var10000 = 173;
               break;
            case 4:
               var10000 = 19;
               break;
            case 5:
               var10000 = 105;
               break;
            case 6:
               var10000 = 5;
               break;
            case 7:
               var10000 = 252;
               break;
            case 8:
               var10000 = 4;
               break;
            case 9:
               var10000 = 178;
               break;
            case 10:
               var10000 = 136;
               break;
            case 11:
               var10000 = 230;
               break;
            case 12:
               var10000 = 82;
               break;
            case 13:
               var10000 = 46;
               break;
            case 14:
               var10000 = 219;
               break;
            case 15:
               var10000 = 56;
               break;
            case 16:
               var10000 = 156;
               break;
            case 17:
               var10000 = 223;
               break;
            case 18:
               var10000 = 215;
               break;
            case 19:
               var10000 = 123;
               break;
            case 20:
               var10000 = 57;
               break;
            case 21:
               var10000 = 183;
               break;
            case 22:
               var10000 = 212;
               break;
            case 23:
               var10000 = 242;
               break;
            case 24:
               var10000 = 104;
               break;
            case 25:
               var10000 = 133;
               break;
            case 26:
               var10000 = 71;
               break;
            case 27:
               var10000 = 58;
               break;
            case 28:
               var10000 = 78;
               break;
            case 29:
               var10000 = 129;
               break;
            case 30:
               var10000 = 200;
               break;
            case 31:
               var10000 = 145;
               break;
            case 32:
               var10000 = 22;
               break;
            case 33:
               var10000 = 36;
               break;
            case 34:
               var10000 = 228;
               break;
            case 35:
               var10000 = 188;
               break;
            case 36:
               var10000 = 63;
               break;
            case 37:
               var10000 = 158;
               break;
            case 38:
               var10000 = 170;
               break;
            case 39:
               var10000 = 35;
               break;
            case 40:
               var10000 = 80;
               break;
            case 41:
               var10000 = 185;
               break;
            case 42:
               var10000 = 232;
               break;
            case 43:
               var10000 = 197;
               break;
            case 44:
               var10000 = 30;
               break;
            case 45:
               var10000 = 86;
               break;
            case 46:
               var10000 = 116;
               break;
            case 47:
               var10000 = 238;
               break;
            case 48:
               var10000 = 128;
               break;
            case 49:
               var10000 = 247;
               break;
            case 50:
               var10000 = 244;
               break;
            case 51:
               var10000 = 108;
               break;
            case 52:
               var10000 = 66;
               break;
            case 53:
               var10000 = 42;
               break;
            case 54:
               var10000 = 233;
               break;
            case 55:
               var10000 = 69;
               break;
            case 56:
               var10000 = 135;
               break;
            case 57:
               var10000 = 0;
               break;
            case 58:
               var10000 = 210;
               break;
            case 59:
               var10000 = 205;
               break;
            case 60:
               var10000 = 8;
               break;
            case 61:
               var10000 = 62;
               break;
            case 62:
               var10000 = 195;
               break;
            case 63:
               var10000 = 239;
               break;
            case 64:
               var10000 = 27;
               break;
            case 65:
               var10000 = 48;
               break;
            case 66:
               var10000 = 190;
               break;
            case 67:
               var10000 = 117;
               break;
            case 68:
               var10000 = 53;
               break;
            case 69:
               var10000 = 93;
               break;
            case 70:
               var10000 = 140;
               break;
            case 71:
               var10000 = 211;
               break;
            case 72:
               var10000 = 11;
               break;
            case 73:
               var10000 = 88;
               break;
            case 74:
               var10000 = 126;
               break;
            case 75:
               var10000 = 151;
               break;
            case 76:
               var10000 = 218;
               break;
            case 77:
               var10000 = 24;
               break;
            case 78:
               var10000 = 161;
               break;
            case 79:
               var10000 = 32;
               break;
            case 80:
               var10000 = 94;
               break;
            case 81:
               var10000 = 243;
               break;
            case 82:
               var10000 = 2;
               break;
            case 83:
               var10000 = 28;
               break;
            case 84:
               var10000 = 40;
               break;
            case 85:
               var10000 = 245;
               break;
            case 86:
               var10000 = 120;
               break;
            case 87:
               var10000 = 29;
               break;
            case 88:
               var10000 = 26;
               break;
            case 89:
               var10000 = 255;
               break;
            case 90:
               var10000 = 55;
               break;
            case 91:
               var10000 = 83;
               break;
            case 92:
               var10000 = 146;
               break;
            case 93:
               var10000 = 52;
               break;
            case 94:
               var10000 = 112;
               break;
            case 95:
               var10000 = 147;
               break;
            case 96:
               var10000 = 254;
               break;
            case 97:
               var10000 = 160;
               break;
            case 98:
               var10000 = 144;
               break;
            case 99:
               var10000 = 77;
               break;
            case 100:
               var10000 = 90;
               break;
            case 101:
               var10000 = 9;
               break;
            case 102:
               var10000 = 177;
               break;
            case 103:
               var10000 = 166;
               break;
            case 104:
               var10000 = 119;
               break;
            case 105:
               var10000 = 213;
               break;
            case 106:
               var10000 = 250;
               break;
            case 107:
               var10000 = 14;
               break;
            case 108:
               var10000 = 180;
               break;
            case 109:
               var10000 = 122;
               break;
            case 110:
               var10000 = 13;
               break;
            case 111:
               var10000 = 229;
               break;
            case 112:
               var10000 = 127;
               break;
            case 113:
               var10000 = 235;
               break;
            case 114:
               var10000 = 87;
               break;
            case 115:
               var10000 = 236;
               break;
            case 116:
               var10000 = 141;
               break;
            case 117:
               var10000 = 220;
               break;
            case 118:
               var10000 = 179;
               break;
            case 119:
               var10000 = 75;
               break;
            case 120:
               var10000 = 33;
               break;
            case 121:
               var10000 = 240;
               break;
            case 122:
               var10000 = 92;
               break;
            case 123:
               var10000 = 51;
               break;
            case 124:
               var10000 = 214;
               break;
            case 125:
               var10000 = 176;
               break;
            case 126:
               var10000 = 64;
               break;
            case 127:
               var10000 = 169;
               break;
            case 128:
               var10000 = 7;
               break;
            case 129:
               var10000 = 70;
               break;
            case 130:
               var10000 = 174;
               break;
            case 131:
               var10000 = 241;
               break;
            case 132:
               var10000 = 143;
               break;
            case 133:
               var10000 = 79;
               break;
            case 134:
               var10000 = 103;
               break;
            case 135:
               var10000 = 142;
               break;
            case 136:
               var10000 = 50;
               break;
            case 137:
               var10000 = 59;
               break;
            case 138:
               var10000 = 137;
               break;
            case 139:
               var10000 = 253;
               break;
            case 140:
               var10000 = 202;
               break;
            case 141:
               var10000 = 157;
               break;
            case 142:
               var10000 = 76;
               break;
            case 143:
               var10000 = 15;
               break;
            case 144:
               var10000 = 60;
               break;
            case 145:
               var10000 = 118;
               break;
            case 146:
               var10000 = 221;
               break;
            case 147:
               var10000 = 168;
               break;
            case 148:
               var10000 = 101;
               break;
            case 149:
               var10000 = 23;
               break;
            case 150:
               var10000 = 102;
               break;
            case 151:
               var10000 = 167;
               break;
            case 152:
               var10000 = 153;
               break;
            case 153:
               var10000 = 184;
               break;
            case 154:
               var10000 = 199;
               break;
            case 155:
               var10000 = 95;
               break;
            case 156:
               var10000 = 234;
               break;
            case 157:
               var10000 = 191;
               break;
            case 158:
               var10000 = 67;
               break;
            case 159:
               var10000 = 231;
               break;
            case 160:
               var10000 = 85;
               break;
            case 161:
               var10000 = 203;
               break;
            case 162:
               var10000 = 193;
               break;
            case 163:
               var10000 = 124;
               break;
            case 164:
               var10000 = 181;
               break;
            case 165:
               var10000 = 192;
               break;
            case 166:
               var10000 = 224;
               break;
            case 167:
               var10000 = 248;
               break;
            case 168:
               var10000 = 175;
               break;
            case 169:
               var10000 = 237;
               break;
            case 170:
               var10000 = 148;
               break;
            case 171:
               var10000 = 172;
               break;
            case 172:
               var10000 = 227;
               break;
            case 173:
               var10000 = 20;
               break;
            case 174:
               var10000 = 1;
               break;
            case 175:
               var10000 = 196;
               break;
            case 176:
               var10000 = 251;
               break;
            case 177:
               var10000 = 34;
               break;
            case 178:
               var10000 = 164;
               break;
            case 179:
               var10000 = 84;
               break;
            case 180:
               var10000 = 121;
               break;
            case 181:
               var10000 = 111;
               break;
            case 182:
               var10000 = 187;
               break;
            case 183:
               var10000 = 216;
               break;
            case 184:
               var10000 = 225;
               break;
            case 185:
               var10000 = 162;
               break;
            case 186:
               var10000 = 226;
               break;
            case 187:
               var10000 = 130;
               break;
            case 188:
               var10000 = 61;
               break;
            case 189:
               var10000 = 96;
               break;
            case 190:
               var10000 = 201;
               break;
            case 191:
               var10000 = 186;
               break;
            case 192:
               var10000 = 98;
               break;
            case 193:
               var10000 = 194;
               break;
            case 194:
               var10000 = 222;
               break;
            case 195:
               var10000 = 44;
               break;
            case 196:
               var10000 = 38;
               break;
            case 197:
               var10000 = 18;
               break;
            case 198:
               var10000 = 206;
               break;
            case 199:
               var10000 = 189;
               break;
            case 200:
               var10000 = 115;
               break;
            case 201:
               var10000 = 154;
               break;
            case 202:
               var10000 = 74;
               break;
            case 203:
               var10000 = 132;
               break;
            case 204:
               var10000 = 155;
               break;
            case 205:
               var10000 = 217;
               break;
            case 206:
               var10000 = 16;
               break;
            case 207:
               var10000 = 68;
               break;
            case 208:
               var10000 = 139;
               break;
            case 209:
               var10000 = 208;
               break;
            case 210:
               var10000 = 152;
               break;
            case 211:
               var10000 = 3;
               break;
            case 212:
               var10000 = 165;
               break;
            case 213:
               var10000 = 21;
               break;
            case 214:
               var10000 = 65;
               break;
            case 215:
               var10000 = 54;
               break;
            case 216:
               var10000 = 100;
               break;
            case 217:
               var10000 = 37;
               break;
            case 218:
               var10000 = 43;
               break;
            case 219:
               var10000 = 73;
               break;
            case 220:
               var10000 = 182;
               break;
            case 221:
               var10000 = 17;
               break;
            case 222:
               var10000 = 81;
               break;
            case 223:
               var10000 = 149;
               break;
            case 224:
               var10000 = 249;
               break;
            case 225:
               var10000 = 209;
               break;
            case 226:
               var10000 = 138;
               break;
            case 227:
               var10000 = 12;
               break;
            case 228:
               var10000 = 163;
               break;
            case 229:
               var10000 = 109;
               break;
            case 230:
               var10000 = 207;
               break;
            case 231:
               var10000 = 39;
               break;
            case 232:
               var10000 = 10;
               break;
            case 233:
               var10000 = 45;
               break;
            case 234:
               var10000 = 41;
               break;
            case 235:
               var10000 = 204;
               break;
            case 236:
               var10000 = 110;
               break;
            case 237:
               var10000 = 113;
               break;
            case 238:
               var10000 = 107;
               break;
            case 239:
               var10000 = 97;
               break;
            case 240:
               var10000 = 131;
               break;
            case 241:
               var10000 = 6;
               break;
            case 242:
               var10000 = 106;
               break;
            case 243:
               var10000 = 47;
               break;
            case 244:
               var10000 = 72;
               break;
            case 245:
               var10000 = 134;
               break;
            case 246:
               var10000 = 159;
               break;
            case 247:
               var10000 = 89;
               break;
            case 248:
               var10000 = 31;
               break;
            case 249:
               var10000 = 246;
               break;
            case 250:
               var10000 = 91;
               break;
            case 251:
               var10000 = 125;
               break;
            case 252:
               var10000 = 25;
               break;
            case 253:
               var10000 = 114;
               break;
            case 254:
               var10000 = 99;
               break;
            default:
               var10000 = 49;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22469;
      if (db[var3] == null) {
         db[var3] = (int)(cb[var3] ^ var1);
      }

      return db[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var15 = new String[19];
      int var13 = 0;
      String var12 = "Aj\u0000\\\u0095Å®\u0093¥äà\u0002\u001d¬\u000bÎQÒ.9à\u000f{@\u0001\u0094\nU\tÓe=ô½EeÑ\u0004輤挠敺彅\u001f\u008bQ«¬ÁÖ9\u000b½nyýJù<\u001cùîF\u007f¼ý¶f§\u0096¸\u0089nºI\f\u0003¼rÒH\bÔäL\u0007áõ:\u008a<©uÿ\u0003]\u0097\u0092Af=f\u0015È\u0089 \u0001\u008d&`\u008a!\\Ô¶Xd\u0016¥õ\u008e°Ú\u009eÇ±\u000007³K\u0083\u008dÏ©lB\u0096|\u007f\u0092å}Á(]\u0089\u0003\u0001\u001br\u0002ÉÔ\t¸÷t»Ð;f\u001eÌ\t¹ÙT~Ô\u0083æ\tÜ\u0013+\u0083\u008d|Íz-\u001anHJø\u0019³\u0092§Ë|I\u0002\u0007¯\u0005/$\n'.\"N\u0092\u0013ÔÖÙÛêáRòz;\t\u0012\u0002<-þ\u0007«úT\u0092îú*×õ\u00ad£AJ\u0012\f]É¹|1Ýû^©P]?";
      int var14 = "Aj\u0000\\\u0095Å®\u0093¥äà\u0002\u001d¬\u000bÎQÒ.9à\u000f{@\u0001\u0094\nU\tÓe=ô½EeÑ\u0004輤挠敺彅\u001f\u008bQ«¬ÁÖ9\u000b½nyýJù<\u001cùîF\u007f¼ý¶f§\u0096¸\u0089nºI\f\u0003¼rÒH\bÔäL\u0007áõ:\u008a<©uÿ\u0003]\u0097\u0092Af=f\u0015È\u0089 \u0001\u008d&`\u008a!\\Ô¶Xd\u0016¥õ\u008e°Ú\u009eÇ±\u000007³K\u0083\u008dÏ©lB\u0096|\u007f\u0092å}Á(]\u0089\u0003\u0001\u001br\u0002ÉÔ\t¸÷t»Ð;f\u001eÌ\t¹ÙT~Ô\u0083æ\tÜ\u0013+\u0083\u008d|Íz-\u001anHJø\u0019³\u0092§Ë|I\u0002\u0007¯\u0005/$\n'.\"N\u0092\u0013ÔÖÙÛêáRòz;\t\u0012\u0002<-þ\u0007«úT\u0092îú*×õ\u00ad£AJ\u0012\f]É¹|1Ýû^©P]?"
         .length();
      char var11 = 11;
      int var19 = -1;

      label70:
      while (true) {
         byte var10000 = 24;
         String var10001 = var12.substring(++var19, var19 + var11);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var43 = var10001.toCharArray();
               int var10004 = var43.length;
               int var16 = 0;
               byte var46 = var10000;
               var36 = var43;
               int var26 = var10004;
               byte var53;
               char[] var59;
               int var10006;
               if (var10004 <= 1) {
                  var59 = var43;
                  var53 = var10000;
                  var10006 = var16;
               } else {
                  var46 = var10000;
                  var26 = var10004;
                  if (var10004 <= var16) {
                     break label65;
                  }

                  var59 = var43;
                  var53 = var10000;
                  var10006 = var16;
               }

               while (true) {
                  char var68 = var59[var10006];
                  byte var69;
                  switch (var16 % 7) {
                     case 0:
                        var69 = 8;
                        break;
                     case 1:
                        var69 = 59;
                        break;
                     case 2:
                        var69 = 76;
                        break;
                     case 3:
                        var69 = 44;
                        break;
                     case 4:
                        var69 = 75;
                        break;
                     case 5:
                        var69 = 118;
                        break;
                     default:
                        var69 = 98;
                  }

                  var59[var10006] = (char)(var68 ^ var53 ^ var69);
                  var16++;
                  if (var46 == 0) {
                     var10006 = var46;
                     var59 = var36;
                     var53 = var46;
                  } else {
                     if (var26 <= var16) {
                        break;
                     }

                     var59 = var36;
                     var53 = var46;
                     var10006 = var16;
                  }
               }
            }

            String var48 = new String(var36).intern();
            switch (var10002) {
               case 0:
                  var15[var13++] = var48;
                  if ((var19 += var11) >= var14) {
                     ab = var15;
                     bb = new String[19];
                     long var2 = 4198127134739778865L;
                     long[] var8 = new long[13];
                     int var5 = 0;
                     String var6 = "}\u0018íÐ4\u008dÓª\u0094»á¡Ú¡\n\u0082OT~ØÔ\u0015o:\u0010\u0087\u0088P£¹a[Áþ·\u0019\rÇª\u00923¢M\u0006\u0093+¾\u0003Q\u0018É\u0013\u0000\u0094\u0080=hµz\u000b¡w[çH<N\u0082\u008c÷Ä\u007ff\u0083\u009a\u0084üÍ\u008a¨\u000e\u0014ñ@/eGÑ";
                     int var7 = "}\u0018íÐ4\u008dÓª\u0094»á¡Ú¡\n\u0082OT~ØÔ\u0015o:\u0010\u0087\u0088P£¹a[Áþ·\u0019\rÇª\u00923¢M\u0006\u0093+¾\u0003Q\u0018É\u0013\u0000\u0094\u0080=hµz\u000b¡w[çH<N\u0082\u008c÷Ä\u007ff\u0083\u009a\u0084üÍ\u008a¨\u000e\u0014ñ@/eGÑ"
                        .length();
                     byte var4 = 0;

                     label44:
                     while (true) {
                        byte var28 = var4;
                        var4 += 8;
                        byte[] var9 = var6.substring(var28, var4).getBytes("ISO-8859-1");
                        long[] var21 = var8;
                        int var29 = var5++;
                        long var40 = ((long)var9[0] & 255L) << 56
                           | ((long)var9[1] & 255L) << 48
                           | ((long)var9[2] & 255L) << 40
                           | ((long)var9[3] & 255L) << 32
                           | ((long)var9[4] & 255L) << 24
                           | ((long)var9[5] & 255L) << 16
                           | ((long)var9[6] & 255L) << 8
                           | (long)var9[7] & 255L;
                        byte var49 = -1;

                        while (true) {
                           long var58 = var40 ^ var2;
                           switch (var49) {
                              case 0:
                                 var21[var29] = var58;
                                 if (var4 >= var7) {
                                    cb = var8;
                                    db = new Integer[13];
                                    long var0 = 7533973909462191033L;
                                    long var42 = 7533973909462190161L ^ var0;
                                    byte var31 = -1;
                                    eb = var42;
                                    f = LoggerFactory.getLogger(Connect_2.class.getName());
                                    a = a(23850, 3864876180565035749L);
                                    d = a(18780, 6761194691306856089L);
                                    return;
                                 }
                                 break;
                              default:
                                 var21[var29] = var58;
                                 if (var4 < var7) {
                                    continue label44;
                                 }

                                 var6 = "Ú\u0089\b?Ù\u0089©'^ûÂ¤\u009dßx¦";
                                 var7 = "Ú\u0089\b?Ù\u0089©'^ûÂ¤\u009dßx¦".length();
                                 var4 = 0;
                           }

                           byte var30 = var4;
                           var4 += 8;
                           var9 = var6.substring(var30, var4).getBytes("ISO-8859-1");
                           var21 = var8;
                           var29 = var5++;
                           var40 = ((long)var9[0] & 255L) << 56
                              | ((long)var9[1] & 255L) << 48
                              | ((long)var9[2] & 255L) << 40
                              | ((long)var9[3] & 255L) << 32
                              | ((long)var9[4] & 255L) << 24
                              | ((long)var9[5] & 255L) << 16
                              | ((long)var9[6] & 255L) << 8
                              | (long)var9[7] & 255L;
                           var49 = 0;
                        }
                     }
                  }

                  var11 = var12.charAt(var19);
                  break;
               default:
                  var15[var13++] = var48;
                  if ((var19 += var11) < var14) {
                     var11 = var12.charAt(var19);
                     continue label70;
                  }

                  var12 = "£kµ\u0016\u0011GÒÿú\u0018iH \u0081\u0082Æc\u000e6|r\rA/!ßí\u0098D8\u000eôï¼ßÂ\u0002UÑ";
                  var14 = "£kµ\u0016\u0011GÒÿú\u0018iH \u0081\u0082Æc\u000e6|r\rA/!ßí\u0098D8\u000eôï¼ßÂ\u0002UÑ".length();
                  var11 = '$';
                  var19 = -1;
            }

            var10000 = 49;
            var10001 = var12.substring(++var19, var19 + var11);
            var10002 = 0;
         }
      }
   }
}






