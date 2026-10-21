package com.finalshell.core;

import com.finalshell.task.SQ;
import com.finalshell.ui.panel.Ky4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class WC_2 {
   public static String C;
   public static int O;
   public static boolean U;
   protected final List j;
   protected int o;
   protected int a;
   protected final Map r;
   protected long E;
   protected long t;
   protected int N;
   protected Thread d;
   protected long b;
   protected long H;
   protected boolean p;
   protected boolean M;
   protected boolean A;
   protected boolean Y;
   protected boolean T;
   protected String Q;
   protected String y;
   protected int h;
   public static int[] m;
   public static String[] c;
   public static String[] e;
   public static long[] f;
   public static Long[] g;

   public WC_2(String var1) {
      this(NE.X(var1));
   }

   public WC_2(long var1) {
      this(C, var1);
   }

   public WC_2(String var1, String var2) {
      this(var1, NE.X(var2));
   }

   public WC_2(String var1, long var2) {
      this(var1, var2, null);
   }

   public WC_2(long var1, long var3) {
      this(C, var1, var3);
   }

   public WC_2(String var1, long var2, long var4) {
      this(var1, var2, var4, null);
   }

   public WC_2(String var1, ActionListener var2) {
      this(NE.X(var1), var2);
   }

   public WC_2(long var1, ActionListener var3) {
      this(C, var1, var3);
   }

   public WC_2(String var1, String var2, ActionListener var3) {
      this(var1, NE.X(var2), var3);
   }

   public WC_2(String var1, long var2, ActionListener var4) {
      this(var1, var2, a(12212, 5598005336202504494L), var4);
   }

   public WC_2(long var1, long var3, ActionListener var5) {
      this(C, var1, var3, var5);
   }

   public WC_2(String var1, String var2, String var3, ActionListener var4) {
      this(var1, NE.X(var2), NE.X(var3), var4);
   }

   public WC_2(String var1, long var2, long var4, ActionListener var6) {
      int[] var10000 = V();
      this.j = new ArrayList(1);
      this.o = 0;
      this.r = new Hashtable();
      this.E = 0L;
      this.t = 0L;
      this.N = 0;
      this.d = null;
      this.p = true;
      this.M = true;
      this.A = true;
      this.Y = false;
      int[] var7 = var10000;

      try {
         this.T = false;
         this.Q = "";
         this.y = null;
         this.h = 0;
         this.m(var1);
         this.M(var2);
         this.o(var4);
         this.q(var6);
         if (var7 != null) {
            Ky4.K(new String[1]);
         }
      } catch (IllegalArgumentException var8) {
         throw a(var8);
      }
   }

   public long E() {
      return this.H;
   }

   public String W() {
      return NE.I(this.H);
   }

   public WC_2 A(String var1) {
      this.o(NE.X(var1));
      return this;
   }

   public WC_2 o(long param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/WC_2.V ()[I
      // 03: astore 3
      // 04: aload 3
      // 05: ifnonnull 55
      // 08: lload 1
      // 09: sipush 12727
      // 0c: ldc2_w 4168816998890403628
      // 0f: invokestatic com/finalshell/core/WC_2.a (IJ)J
      // 12: lcmp
      // 13: ifeq 50
      // 16: goto 1d
      // 19: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: lload 1
      // 1e: lconst_0
      // 1f: lcmp
      // 20: ifge 50
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: new java/lang/IllegalArgumentException
      // 2d: dup
      // 2e: new java/lang/StringBuilder
      // 31: dup
      // 32: invokespecial java/lang/StringBuilder.<init> ()V
      // 35: sipush 17030
      // 38: sipush 32504
      // 3b: invokestatic com/finalshell/core/WC_2.a (II)Ljava/lang/String;
      // 3e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 41: lload 1
      // 42: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 45: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 48: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 4b: athrow
      // 4c: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: aload 0
      // 51: lload 1
      // 52: putfield com/finalshell/core/WC_2.H J
      // 55: aload 0
      // 56: areturn
   }

   public long k() {
      return this.b;
   }

   public String y$String() {
      return NE.I(this.b);
   }

   public WC_2 P(String var1) {
      this.M(NE.X(var1));
      return this;
   }

   public WC_2 M(long param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/WC_2.V ()[I
      // 03: astore 3
      // 04: aload 3
      // 05: ifnonnull 40
      // 08: lload 1
      // 09: lconst_0
      // 0a: lcmp
      // 0b: ifge 3b
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: new java/lang/IllegalArgumentException
      // 18: dup
      // 19: new java/lang/StringBuilder
      // 1c: dup
      // 1d: invokespecial java/lang/StringBuilder.<init> ()V
      // 20: sipush 17029
      // 23: sipush 12396
      // 26: invokestatic com/finalshell/core/WC_2.a (II)Ljava/lang/String;
      // 29: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c: lload 1
      // 2d: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 30: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 33: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 36: athrow
      // 37: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: aload 0
      // 3c: lload 1
      // 3d: putfield com/finalshell/core/WC_2.b J
      // 40: aload 0
      // 41: areturn
   }

   public boolean y$boolean() {
      return this.p;
   }

   public WC_2 x(boolean var1) {
      this.p = var1;
      return this;
   }

   public boolean q$boolean() {
      return this.M;
   }

   public WC_2 Y(boolean var1) {
      this.M = var1;
      return this;
   }

   public boolean Z() {
      return this.A;
   }

   public WC_2 r(boolean var1) {
      this.A = var1;
      return this;
   }

   public boolean F() {
      return this.Y;
   }

   public WC_2 O(boolean var1) {
      this.Y = var1;
      return this;
   }

   public boolean v() {
      return this.T;
   }

   public WC_2 T(boolean var1) {
      this.T = var1;
      return this;
   }

   public String u$String() {
      return this.Q;
   }

   public WC_2 Q(String var1) {
      this.Q = var1;
      return this;
   }

   public int p() {
      return this.h;
   }

   public WC_2 e(int var1) {
      this.h = var1;
      return this;
   }

   public String J() {
      return this.y;
   }

   public WC_2 m(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/WC_2.V ()[I
      // 03: aload 0
      // 04: aload 1
      // 05: putfield com/finalshell/core/WC_2.y Ljava/lang/String;
      // 08: astore 2
      // 09: aload 0
      // 0a: aload 2
      // 0b: ifnonnull 2b
      // 0e: getfield com/finalshell/core/WC_2.d Ljava/lang/Thread;
      // 11: ifnull 2a
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield com/finalshell/core/WC_2.d Ljava/lang/Thread;
      // 1f: aload 1
      // 20: invokevirtual java/lang/Thread.setName (Ljava/lang/String;)V
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 0
      // 2b: areturn
   }

   public long m() {
      return System.currentTimeMillis() - this.E;
   }

   public long I() {
      return this.t - this.m();
   }

   public int o() {
      return this.N;
   }

   public int Q() {
      return this.N + 1;
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
      // 00: invokestatic com/finalshell/core/WC_2.V ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: invokevirtual com/finalshell/core/WC_2.p ()I
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifle 3e
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual com/finalshell/core/WC_2.Q ()I
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 1
      // 22: ifnonnull 3b
      // 25: aload 0
      // 26: invokevirtual com/finalshell/core/WC_2.p ()I
      // 29: if_icmpne 3e
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: bipush 1
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: goto 3f
      // 3e: bipush 0
      // 3f: ireturn
   }

   public WC_2 u$WC() {
      this.K();
      return this;
   }

   public WC_2 Y() {
      this.j();
      return this;
   }

   public WC_2 q$WC() {
      this.j();
      this.K();
      return this;
   }

   public WC_2 h(long var1) {
      this.j();
      this.o(var1);
      this.M(var1);
      this.K();
      return this;
   }

   public WC_2 m(long var1, long var3) {
      this.j();
      this.o(var1);
      this.M(var3);
      this.K();
      return this;
   }

   public WC_2 z(String var1) {
      this.j();
      this.A(var1);
      this.P(var1);
      this.K();
      return this;
   }

   public WC_2 e(String var1, String var2) {
      this.j();
      this.A(var1);
      this.P(var2);
      this.K();
      return this;
   }

   public synchronized boolean i() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/WC_2.V ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/WC_2.d Ljava/lang/Thread;
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifnull 36
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/WC_2.d Ljava/lang/Thread;
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: invokevirtual java/lang/Thread.isAlive ()Z
      // 24: aload 1
      // 25: ifnonnull 33
      // 28: ifeq 36
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   protected synchronized void K() {
      int[] var1 = V();

      int var10000;
      label22: {
         try {
            var10000 = (this.i()) ? 1 : 0;
            if (var1 != null) {
               break label22;
            }

            if (var10000 != 0) {
               return;
            }
         } catch (IllegalArgumentException var3) {
            throw a(var3);
         }

         this.a = this.o++;
         var10000 = this.a;
      }

      int var2 = var10000;
      this.d = new Thread(new SQ(this, var2), this.y);
      this.d.setDaemon(this.Y);
      this.d.start();
   }

   protected boolean E(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/WC_2.V ()[I
      // 03: astore 3
      // 04: aload 0
      // 05: getfield com/finalshell/core/WC_2.r Ljava/util/Map;
      // 08: iload 2
      // 09: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 11: checkcast java/lang/Boolean
      // 14: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 17: aload 3
      // 18: ifnonnull 32
      // 1b: ifeq 7e
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // 28: invokevirtual java/lang/Thread.isInterrupted ()Z
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: aload 3
      // 33: ifnonnull 4b
      // 36: ifne 7e
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield com/finalshell/core/WC_2.h I
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: aload 3
      // 4c: ifnonnull 7b
      // 4f: ifle 73
      // 52: goto 59
      // 55: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58: athrow
      // 59: aload 0
      // 5a: getfield com/finalshell/core/WC_2.h I
      // 5d: aload 3
      // 5e: ifnonnull 7b
      // 61: goto 68
      // 64: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67: athrow
      // 68: iload 1
      // 69: if_icmple 7e
      // 6c: goto 73
      // 6f: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72: athrow
      // 73: bipush 1
      // 74: goto 7b
      // 77: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a: athrow
      // 7b: goto 7f
      // 7e: bipush 0
      // 7f: ireturn
   }

   protected void R(int var1, boolean var2) {
      this.r.put(var1, var2);
   }

   protected void L(int var1) {
      this.r.remove(var1);
   }

   protected synchronized void j() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/WC_2.V ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/WC_2.d Ljava/lang/Thread;
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifnull 4f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/WC_2.d Ljava/lang/Thread;
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: invokevirtual java/lang/Thread.interrupt ()V
      // 24: aload 0
      // 25: aload 0
      // 26: getfield com/finalshell/core/WC_2.a I
      // 29: bipush 0
      // 2a: invokevirtual com/finalshell/core/WC_2.R (IZ)V
      // 2d: aload 0
      // 2e: aload 1
      // 2f: ifnonnull 40
      // 32: getfield com/finalshell/core/WC_2.T Z
      // 35: ifne 4f
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield com/finalshell/core/WC_2.d Ljava/lang/Thread;
      // 43: invokevirtual java/lang/Thread.join ()V
      // 46: goto 4f
      // 49: astore 2
      // 4a: aload 0
      // 4b: aload 2
      // 4c: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4f: return
   }

   public WC_2 q(ActionListener var1) {
      try {
         if (var1 != null) {
            this.j.add(var1);
         }

         return this;
      } catch (IllegalArgumentException var2) {
         throw a(var2);
      }
   }

   public WC_2 C(ActionListener var1) {
      try {
         if (var1 != null) {
            this.j.remove(var1);
         }

         return this;
      } catch (IllegalArgumentException var2) {
         throw a(var2);
      }
   }

   public List G() {
      return this.j;
   }

   public void X(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/WC_2.V ()[I
      // 003: astore 2
      // 004: aload 0
      // 005: aload 2
      // 006: ifnonnull 023
      // 009: getfield com/finalshell/core/WC_2.j Ljava/util/List;
      // 00c: invokeinterface java/util/List.size ()I 1
      // 011: ifle 105
      // 014: goto 01b
      // 017: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: aload 0
      // 01c: goto 023
      // 01f: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: invokevirtual com/finalshell/core/WC_2.w ()Ljava/awt/event/ActionEvent;
      // 026: astore 3
      // 027: aload 0
      // 028: getfield com/finalshell/core/WC_2.j Ljava/util/List;
      // 02b: invokestatic com/finalshell/core/AL_2.J (Ljava/util/Collection;)Ljava/util/ArrayList;
      // 02e: astore 4
      // 030: aload 0
      // 031: getfield com/finalshell/core/WC_2.A Z
      // 034: aload 2
      // 035: ifnonnull 04d
      // 038: ifeq 0da
      // 03b: goto 042
      // 03e: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 041: athrow
      // 042: aload 0
      // 043: getfield com/finalshell/core/WC_2.M Z
      // 046: goto 04d
      // 049: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04c: athrow
      // 04d: aload 2
      // 04e: ifnonnull 06b
      // 051: ifeq 087
      // 054: goto 05b
      // 057: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05a: athrow
      // 05b: aload 0
      // 05c: aload 0
      // 05d: getfield com/finalshell/core/WC_2.N I
      // 060: iload 1
      // 061: invokevirtual com/finalshell/core/WC_2.E (II)Z
      // 064: goto 06b
      // 067: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06a: athrow
      // 06b: ifeq 105
      // 06e: new com/finalshell/task/BW
      // 071: dup
      // 072: aload 0
      // 073: aload 4
      // 075: aload 3
      // 076: invokespecial com/finalshell/task/BW.<init> (Lcom/finalshell/core/WC_2;Ljava/util/List;Ljava/awt/event/ActionEvent;)V
      // 079: invokestatic com/finalshell/core/FV_2.G (Ljava/lang/Runnable;)V
      // 07c: aload 2
      // 07d: ifnull 105
      // 080: goto 087
      // 083: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: aload 4
      // 089: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 08e: astore 5
      // 090: aload 5
      // 092: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 097: ifeq 0d6
      // 09a: aload 5
      // 09c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a1: checkcast java/awt/event/ActionListener
      // 0a4: astore 6
      // 0a6: aload 2
      // 0a7: ifnonnull 105
      // 0aa: aload 0
      // 0ab: aload 0
      // 0ac: getfield com/finalshell/core/WC_2.N I
      // 0af: iload 1
      // 0b0: invokevirtual com/finalshell/core/WC_2.E (II)Z
      // 0b3: ifeq 0d2
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bc: athrow
      // 0bd: new com/finalshell/task/XZ3
      // 0c0: dup
      // 0c1: aload 0
      // 0c2: aload 6
      // 0c4: aload 3
      // 0c5: invokespecial com/finalshell/task/XZ3.<init> (Lcom/finalshell/core/WC_2;Ljava/awt/event/ActionListener;Ljava/awt/event/ActionEvent;)V
      // 0c8: invokestatic com/finalshell/core/FV_2.G (Ljava/lang/Runnable;)V
      // 0cb: goto 0d2
      // 0ce: invokestatic com/finalshell/core/WC_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d1: athrow
      // 0d2: aload 2
      // 0d3: ifnull 090
      // 0d6: aload 2
      // 0d7: ifnull 105
      // 0da: aload 4
      // 0dc: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0e1: astore 5
      // 0e3: aload 5
      // 0e5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ea: ifeq 105
      // 0ed: aload 5
      // 0ef: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0f4: checkcast java/awt/event/ActionListener
      // 0f7: astore 6
      // 0f9: aload 6
      // 0fb: aload 3
      // 0fc: invokeinterface java/awt/event/ActionListener.actionPerformed (Ljava/awt/event/ActionEvent;)V 2
      // 101: aload 2
      // 102: ifnull 0e3
      // 105: return
   }

   protected ActionEvent w() {
      return new ActionEvent(this, 0, this.Q, Gk2.r(), 0);
   }

   @Override
   public String toString() {
      return this.y + a(17027, 13678) + this.y$String() + a(17031, 14602) + this.W() + ")";
   }

   public static WC_2 m(String var0, ActionListener var1) {
      return A(NE.X(var0), var1);
   }

   public static WC_2 A(long var0, ActionListener var2) {
      return w(C, var0, var2);
   }

   public static WC_2 v(String var0, String var1, ActionListener var2) {
      return w(var0, NE.X(var1), var2);
   }

   public static WC_2 w(String var0, long var1, ActionListener var3) {
      return n(var0, var1, true, var3);
   }

   public static WC_2 R(String var0, boolean var1, ActionListener var2) {
      return d(NE.X(var0), var1, var2);
   }

   public static WC_2 d(long var0, boolean var2, ActionListener var3) {
      return n(C, var0, var2, var3);
   }

   public static WC_2 h(String var0, String var1, boolean var2, ActionListener var3) {
      return n(var0, NE.X(var1), var2, var3);
   }

   public static WC_2 n(String var0, long var1, boolean var3, ActionListener var4) {
      WC_2 var5 = new WC_2(var0, var1, var4);
      var5.x(false);
      var5.r(var3);
      var5.u$WC();
      return var5;
   }

   public static WC_2 q(String var0, ActionListener var1) {
      long var2 = NE.X(var0);
      return r(C, var2, var2, O, U, var1);
   }

   public static WC_2 g(String var0, int var1, ActionListener var2) {
      long var3 = NE.X(var0);
      return r(C, var3, var3, var1, U, var2);
   }

   public static WC_2 x(long var0, ActionListener var2) {
      return r(C, var0, var0, O, U, var2);
   }

   public static WC_2 V(long var0, int var2, ActionListener var3) {
      return r(C, var0, var0, var2, U, var3);
   }

   public static WC_2 c(String var0, String var1, ActionListener var2) {
      long var3 = NE.X(var1);
      return r(var0, var3, var3, O, U, var2);
   }

   public static WC_2 h(String var0, String var1, int var2, ActionListener var3) {
      long var4 = NE.X(var1);
      return r(var0, var4, var4, var2, U, var3);
   }

   public static WC_2 s(String var0, long var1, ActionListener var3) {
      return r(var0, var1, var1, O, U, var3);
   }

   public static WC_2 e(String var0, long var1, int var3, ActionListener var4) {
      return r(var0, var1, var1, var3, U, var4);
   }

   public static WC_2 N(String var0, boolean var1, ActionListener var2) {
      long var3 = NE.X(var0);
      return r(C, var3, var3, O, var1, var2);
   }

   public static WC_2 d(String var0, int var1, boolean var2, ActionListener var3) {
      long var4 = NE.X(var0);
      return r(C, var4, var4, var1, var2, var3);
   }

   public static WC_2 l(long var0, boolean var2, ActionListener var3) {
      return r(C, var0, var0, O, var2, var3);
   }

   public static WC_2 g(long var0, int var2, boolean var3, ActionListener var4) {
      return r(C, var0, var0, var2, var3, var4);
   }

   public static WC_2 R(String var0, String var1, boolean var2, ActionListener var3) {
      long var4 = NE.X(var1);
      return r(var0, var4, var4, O, var2, var3);
   }

   public static WC_2 D(String var0, String var1, int var2, boolean var3, ActionListener var4) {
      long var5 = NE.X(var1);
      return r(var0, var5, var5, var2, var3, var4);
   }

   public static WC_2 V(String var0, long var1, boolean var3, ActionListener var4) {
      return r(var0, var1, var1, O, var3, var4);
   }

   public static WC_2 N(String var0, long var1, int var3, boolean var4, ActionListener var5) {
      return r(var0, var1, var1, var3, var4, var5);
   }

   public static WC_2 E(long var0, long var2, ActionListener var4) {
      return r(C, var0, var2, O, U, var4);
   }

   public static WC_2 N(long var0, long var2, int var4, ActionListener var5) {
      return r(C, var0, var2, var4, U, var5);
   }

   public static WC_2 I(String var0, long var1, long var3, ActionListener var5) {
      return r(var0, var1, var3, O, U, var5);
   }

   public static WC_2 O(String var0, long var1, long var3, int var5, ActionListener var6) {
      return r(var0, var1, var3, var5, U, var6);
   }

   public static WC_2 M(long var0, long var2, boolean var4, ActionListener var5) {
      return r(C, var0, var2, O, var4, var5);
   }

   public static WC_2 L(long var0, long var2, int var4, boolean var5, ActionListener var6) {
      return r(C, var0, var2, var4, var5, var6);
   }

   public static WC_2 r(String var0, long var1, long var3, boolean var5, ActionListener var6) {
      return r(var0, var1, var3, O, var5, var6);
   }

   public static WC_2 r(String var0, long var1, long var3, int var5, boolean var6, ActionListener var7) {
      WC_2 var8 = new WC_2(var0, var1, var3, var7);
      var8.x(true);
      var8.r(var6);
      var8.e(var5);
      var8.u$WC();
      return var8;
   }

   public static WC_2 M(boolean var0, String var1, long var2, ActionListener var4) {
      return c(var0, var1, var2, var2, var4);
   }

   public static WC_2 c(boolean var0, String var1, long var2, long var4, ActionListener var6) {
      return v(var0, var1, var2, var4, O, var6);
   }

   public static WC_2 v(boolean var0, String var1, long var2, long var4, int var6, ActionListener var7) {
      WC_2 var8 = new WC_2(var1, var2, var4, var7);
      var8.x(true);
      var8.O(var0);
      var8.r(false);
      var8.e(var6);
      var8.u$WC();
      return var8;
   }

   static {
      __vfClinit__();
   }

   public static void I(int[] var0) {
      m = var0;
   }

   public static int[] V() {
      return m;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 17031) & 65535;
      if (e[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 175;
               break;
            case 1:
               var10000 = 85;
               break;
            case 2:
               var10000 = 31;
               break;
            case 3:
               var10000 = 152;
               break;
            case 4:
               var10000 = 52;
               break;
            case 5:
               var10000 = 239;
               break;
            case 6:
               var10000 = 115;
               break;
            case 7:
               var10000 = 13;
               break;
            case 8:
               var10000 = 94;
               break;
            case 9:
               var10000 = 134;
               break;
            case 10:
               var10000 = 8;
               break;
            case 11:
               var10000 = 244;
               break;
            case 12:
               var10000 = 250;
               break;
            case 13:
               var10000 = 219;
               break;
            case 14:
               var10000 = 151;
               break;
            case 15:
               var10000 = 225;
               break;
            case 16:
               var10000 = 165;
               break;
            case 17:
               var10000 = 45;
               break;
            case 18:
               var10000 = 100;
               break;
            case 19:
               var10000 = 235;
               break;
            case 20:
               var10000 = 104;
               break;
            case 21:
               var10000 = 177;
               break;
            case 22:
               var10000 = 136;
               break;
            case 23:
               var10000 = 105;
               break;
            case 24:
               var10000 = 184;
               break;
            case 25:
               var10000 = 117;
               break;
            case 26:
               var10000 = 208;
               break;
            case 27:
               var10000 = 167;
               break;
            case 28:
               var10000 = 93;
               break;
            case 29:
               var10000 = 157;
               break;
            case 30:
               var10000 = 81;
               break;
            case 31:
               var10000 = 144;
               break;
            case 32:
               var10000 = 34;
               break;
            case 33:
               var10000 = 164;
               break;
            case 34:
               var10000 = 179;
               break;
            case 35:
               var10000 = 79;
               break;
            case 36:
               var10000 = 86;
               break;
            case 37:
               var10000 = 159;
               break;
            case 38:
               var10000 = 19;
               break;
            case 39:
               var10000 = 23;
               break;
            case 40:
               var10000 = 121;
               break;
            case 41:
               var10000 = 116;
               break;
            case 42:
               var10000 = 241;
               break;
            case 43:
               var10000 = 216;
               break;
            case 44:
               var10000 = 92;
               break;
            case 45:
               var10000 = 206;
               break;
            case 46:
               var10000 = 24;
               break;
            case 47:
               var10000 = 80;
               break;
            case 48:
               var10000 = 194;
               break;
            case 49:
               var10000 = 236;
               break;
            case 50:
               var10000 = 142;
               break;
            case 51:
               var10000 = 120;
               break;
            case 52:
               var10000 = 217;
               break;
            case 53:
               var10000 = 18;
               break;
            case 54:
               var10000 = 162;
               break;
            case 55:
               var10000 = 22;
               break;
            case 56:
               var10000 = 249;
               break;
            case 57:
               var10000 = 78;
               break;
            case 58:
               var10000 = 69;
               break;
            case 59:
               var10000 = 133;
               break;
            case 60:
               var10000 = 145;
               break;
            case 61:
               var10000 = 193;
               break;
            case 62:
               var10000 = 54;
               break;
            case 63:
               var10000 = 180;
               break;
            case 64:
               var10000 = 53;
               break;
            case 65:
               var10000 = 17;
               break;
            case 66:
               var10000 = 187;
               break;
            case 67:
               var10000 = 6;
               break;
            case 68:
               var10000 = 68;
               break;
            case 69:
               var10000 = 143;
               break;
            case 70:
               var10000 = 56;
               break;
            case 71:
               var10000 = 129;
               break;
            case 72:
               var10000 = 185;
               break;
            case 73:
               var10000 = 49;
               break;
            case 74:
               var10000 = 245;
               break;
            case 75:
               var10000 = 200;
               break;
            case 76:
               var10000 = 106;
               break;
            case 77:
               var10000 = 166;
               break;
            case 78:
               var10000 = 28;
               break;
            case 79:
               var10000 = 212;
               break;
            case 80:
               var10000 = 103;
               break;
            case 81:
               var10000 = 123;
               break;
            case 82:
               var10000 = 154;
               break;
            case 83:
               var10000 = 130;
               break;
            case 84:
               var10000 = 168;
               break;
            case 85:
               var10000 = 122;
               break;
            case 86:
               var10000 = 7;
               break;
            case 87:
               var10000 = 95;
               break;
            case 88:
               var10000 = 58;
               break;
            case 89:
               var10000 = 15;
               break;
            case 90:
               var10000 = 248;
               break;
            case 91:
               var10000 = 0;
               break;
            case 92:
               var10000 = 201;
               break;
            case 93:
               var10000 = 237;
               break;
            case 94:
               var10000 = 135;
               break;
            case 95:
               var10000 = 173;
               break;
            case 96:
               var10000 = 222;
               break;
            case 97:
               var10000 = 228;
               break;
            case 98:
               var10000 = 229;
               break;
            case 99:
               var10000 = 36;
               break;
            case 100:
               var10000 = 33;
               break;
            case 101:
               var10000 = 199;
               break;
            case 102:
               var10000 = 155;
               break;
            case 103:
               var10000 = 107;
               break;
            case 104:
               var10000 = 77;
               break;
            case 105:
               var10000 = 88;
               break;
            case 106:
               var10000 = 224;
               break;
            case 107:
               var10000 = 141;
               break;
            case 108:
               var10000 = 188;
               break;
            case 109:
               var10000 = 148;
               break;
            case 110:
               var10000 = 231;
               break;
            case 111:
               var10000 = 125;
               break;
            case 112:
               var10000 = 43;
               break;
            case 113:
               var10000 = 4;
               break;
            case 114:
               var10000 = 98;
               break;
            case 115:
               var10000 = 60;
               break;
            case 116:
               var10000 = 47;
               break;
            case 117:
               var10000 = 161;
               break;
            case 118:
               var10000 = 254;
               break;
            case 119:
               var10000 = 101;
               break;
            case 120:
               var10000 = 242;
               break;
            case 121:
               var10000 = 112;
               break;
            case 122:
               var10000 = 233;
               break;
            case 123:
               var10000 = 1;
               break;
            case 124:
               var10000 = 230;
               break;
            case 125:
               var10000 = 150;
               break;
            case 126:
               var10000 = 27;
               break;
            case 127:
               var10000 = 62;
               break;
            case 128:
               var10000 = 232;
               break;
            case 129:
               var10000 = 174;
               break;
            case 130:
               var10000 = 51;
               break;
            case 131:
               var10000 = 30;
               break;
            case 132:
               var10000 = 29;
               break;
            case 133:
               var10000 = 149;
               break;
            case 134:
               var10000 = 114;
               break;
            case 135:
               var10000 = 203;
               break;
            case 136:
               var10000 = 211;
               break;
            case 137:
               var10000 = 20;
               break;
            case 138:
               var10000 = 97;
               break;
            case 139:
               var10000 = 109;
               break;
            case 140:
               var10000 = 83;
               break;
            case 141:
               var10000 = 210;
               break;
            case 142:
               var10000 = 16;
               break;
            case 143:
               var10000 = 255;
               break;
            case 144:
               var10000 = 197;
               break;
            case 145:
               var10000 = 11;
               break;
            case 146:
               var10000 = 2;
               break;
            case 147:
               var10000 = 181;
               break;
            case 148:
               var10000 = 111;
               break;
            case 149:
               var10000 = 118;
               break;
            case 150:
               var10000 = 220;
               break;
            case 151:
               var10000 = 108;
               break;
            case 152:
               var10000 = 55;
               break;
            case 153:
               var10000 = 234;
               break;
            case 154:
               var10000 = 132;
               break;
            case 155:
               var10000 = 156;
               break;
            case 156:
               var10000 = 61;
               break;
            case 157:
               var10000 = 50;
               break;
            case 158:
               var10000 = 46;
               break;
            case 159:
               var10000 = 131;
               break;
            case 160:
               var10000 = 73;
               break;
            case 161:
               var10000 = 160;
               break;
            case 162:
               var10000 = 38;
               break;
            case 163:
               var10000 = 139;
               break;
            case 164:
               var10000 = 74;
               break;
            case 165:
               var10000 = 146;
               break;
            case 166:
               var10000 = 72;
               break;
            case 167:
               var10000 = 247;
               break;
            case 168:
               var10000 = 205;
               break;
            case 169:
               var10000 = 252;
               break;
            case 170:
               var10000 = 243;
               break;
            case 171:
               var10000 = 163;
               break;
            case 172:
               var10000 = 183;
               break;
            case 173:
               var10000 = 110;
               break;
            case 174:
               var10000 = 172;
               break;
            case 175:
               var10000 = 213;
               break;
            case 176:
               var10000 = 71;
               break;
            case 177:
               var10000 = 186;
               break;
            case 178:
               var10000 = 196;
               break;
            case 179:
               var10000 = 91;
               break;
            case 180:
               var10000 = 84;
               break;
            case 181:
               var10000 = 9;
               break;
            case 182:
               var10000 = 59;
               break;
            case 183:
               var10000 = 39;
               break;
            case 184:
               var10000 = 176;
               break;
            case 185:
               var10000 = 214;
               break;
            case 186:
               var10000 = 207;
               break;
            case 187:
               var10000 = 158;
               break;
            case 188:
               var10000 = 119;
               break;
            case 189:
               var10000 = 113;
               break;
            case 190:
               var10000 = 63;
               break;
            case 191:
               var10000 = 102;
               break;
            case 192:
               var10000 = 140;
               break;
            case 193:
               var10000 = 37;
               break;
            case 194:
               var10000 = 192;
               break;
            case 195:
               var10000 = 169;
               break;
            case 196:
               var10000 = 251;
               break;
            case 197:
               var10000 = 26;
               break;
            case 198:
               var10000 = 147;
               break;
            case 199:
               var10000 = 189;
               break;
            case 200:
               var10000 = 32;
               break;
            case 201:
               var10000 = 191;
               break;
            case 202:
               var10000 = 124;
               break;
            case 203:
               var10000 = 171;
               break;
            case 204:
               var10000 = 87;
               break;
            case 205:
               var10000 = 170;
               break;
            case 206:
               var10000 = 182;
               break;
            case 207:
               var10000 = 246;
               break;
            case 208:
               var10000 = 90;
               break;
            case 209:
               var10000 = 48;
               break;
            case 210:
               var10000 = 215;
               break;
            case 211:
               var10000 = 66;
               break;
            case 212:
               var10000 = 12;
               break;
            case 213:
               var10000 = 44;
               break;
            case 214:
               var10000 = 5;
               break;
            case 215:
               var10000 = 198;
               break;
            case 216:
               var10000 = 57;
               break;
            case 217:
               var10000 = 70;
               break;
            case 218:
               var10000 = 64;
               break;
            case 219:
               var10000 = 223;
               break;
            case 220:
               var10000 = 25;
               break;
            case 221:
               var10000 = 195;
               break;
            case 222:
               var10000 = 75;
               break;
            case 223:
               var10000 = 99;
               break;
            case 224:
               var10000 = 204;
               break;
            case 225:
               var10000 = 218;
               break;
            case 226:
               var10000 = 89;
               break;
            case 227:
               var10000 = 14;
               break;
            case 228:
               var10000 = 67;
               break;
            case 229:
               var10000 = 138;
               break;
            case 230:
               var10000 = 82;
               break;
            case 231:
               var10000 = 202;
               break;
            case 232:
               var10000 = 41;
               break;
            case 233:
               var10000 = 253;
               break;
            case 234:
               var10000 = 65;
               break;
            case 235:
               var10000 = 190;
               break;
            case 236:
               var10000 = 127;
               break;
            case 237:
               var10000 = 10;
               break;
            case 238:
               var10000 = 221;
               break;
            case 239:
               var10000 = 96;
               break;
            case 240:
               var10000 = 40;
               break;
            case 241:
               var10000 = 42;
               break;
            case 242:
               var10000 = 227;
               break;
            case 243:
               var10000 = 76;
               break;
            case 244:
               var10000 = 209;
               break;
            case 245:
               var10000 = 226;
               break;
            case 246:
               var10000 = 3;
               break;
            case 247:
               var10000 = 21;
               break;
            case 248:
               var10000 = 238;
               break;
            case 249:
               var10000 = 153;
               break;
            case 250:
               var10000 = 126;
               break;
            case 251:
               var10000 = 35;
               break;
            case 252:
               var10000 = 137;
               break;
            case 253:
               var10000 = 240;
               break;
            case 254:
               var10000 = 178;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 18074) & 32767;
      if (g[var3] == null) {
         g[var3] = f[var3] ^ var1;
      }

      return g[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[5];
      int var11 = 0;
      String var10 = "e\u0099§\u001dÒ¼¬|¬\u0080røÜ\u0096Å\u001dá\u0017(\u00874Ü>\u008dc\u0013O\u000f*ZZñ¥ñ\u0016\u0091*¨ü¤K\u000f\u0094ñ£\u0012ÌT=(\u0089c[¨ÁC\u0088";
      int var12 = "e\u0099§\u001dÒ¼¬|¬\u0080røÜ\u0096Å\u001dá\u0017(\u00874Ü>\u008dc\u0013O\u000f*ZZñ¥ñ\u0016\u0091*¨ü¤K\u000f\u0094ñ£\u0012ÌT=(\u0089c[¨ÁC\u0088"
         .length();
      char var9 = 17;
      int var16 = -1;
      I(null);

      label61:
      while (true) {
         byte var10000 = 107;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var30;
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 67;
                        break;
                     case 1:
                        var58 = 77;
                        break;
                     case 2:
                        var58 = 73;
                        break;
                     case 3:
                        var58 = 65;
                        break;
                     case 4:
                        var58 = 67;
                        break;
                     case 5:
                        var58 = 28;
                        break;
                     default:
                        var58 = 79;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     c = var13;
                     e = new String[5];
                     long var0 = 8669330064997551113L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "Ê\u0000F\rp#\u009aØ¾jÆÅËL\u0004Ú";
                     int var5 = "Ê\u0000F\rp#\u009aØ¾jÆÅËL\u0004Ú".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
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
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     f = var6;
                     g = new Long[2];
                     C = a(17028, 23024);
                     O = 0;
                     U = true;
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "ÞK\u0086¿^Ón«\tÔ\u009fÕù÷\u0000â\u000e%";
                  var12 = "ÞK\u0086¿^Ón«\tÔ\u009fÕù÷\u0000â\u000e%".length();
                  var9 = '\b';
                  var16 = -1;
            }

            var10000 = 110;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





