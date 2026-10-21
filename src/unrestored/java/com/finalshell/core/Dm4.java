package com.finalshell.core;

import com.finalshell.crypto.ConnectHost;
import com.finalshell.io.ED;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

public abstract class Dm4 {
   public static int H;
   public static Vector I;
   public int t;
   public volatile int V = -1;
   public byte[] Y = E8.J(a(31478, -13144));
   public volatile int y = a(1122, 6484861095692639415L);
   public volatile int e = this.y;
   public volatile int B = a(32488, 917304917054842422L);
   public volatile long z = 0L;
   public volatile int c = 0;
   public Cs4 o = null;
   public Thread Z = null;
   public volatile boolean K = false;
   public volatile boolean E = false;
   public volatile boolean S = false;
   public volatile boolean X = false;
   public volatile boolean m = false;
   public volatile int d = -1;
   public volatile int b = 0;
   public volatile int j = 0;
   public ConnectHost w;
   public int r = 0;
   public static boolean k;
   public static String[] ab;
   public static String[] bb;
   public static long[] hb;
   public static Integer[] ib;
   public static long nb;

   public static Dm4 a(String param0, ConnectHost param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: aconst_null
      // 004: astore 3
      // 005: istore 2
      // 006: aload 0
      // 007: sipush 31482
      // 00a: sipush 10888
      // 00d: invokestatic com/finalshell/core/Dm4.a (II)Ljava/lang/String;
      // 010: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 013: ifeq 01e
      // 016: new com/finalshell/core/Dq4
      // 019: dup
      // 01a: invokespecial com/finalshell/core/Dq4.<init> ()V
      // 01d: astore 3
      // 01e: aload 0
      // 01f: sipush 31473
      // 022: sipush -1801
      // 025: invokestatic com/finalshell/core/Dm4.a (II)Ljava/lang/String;
      // 028: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 02b: iload 2
      // 02c: ifne 04e
      // 02f: ifeq 041
      // 032: goto 039
      // 035: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 038: athrow
      // 039: new com/finalshell/core/DQ3
      // 03c: dup
      // 03d: invokespecial com/finalshell/core/DQ3.<init> ()V
      // 040: astore 3
      // 041: aload 0
      // 042: sipush 31476
      // 045: sipush -6987
      // 048: invokestatic com/finalshell/core/Dm4.a (II)Ljava/lang/String;
      // 04b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 04e: iload 2
      // 04f: ifne 071
      // 052: ifeq 064
      // 055: goto 05c
      // 058: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05b: athrow
      // 05c: new com/finalshell/core/DB3
      // 05f: dup
      // 060: invokespecial com/finalshell/core/DB3.<init> ()V
      // 063: astore 3
      // 064: aload 0
      // 065: sipush 31479
      // 068: sipush -4206
      // 06b: invokestatic com/finalshell/core/Dm4.a (II)Ljava/lang/String;
      // 06e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 071: iload 2
      // 072: ifne 094
      // 075: ifeq 087
      // 078: goto 07f
      // 07b: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07e: athrow
      // 07f: new com/finalshell/core/De4
      // 082: dup
      // 083: invokespecial com/finalshell/core/De4.<init> ()V
      // 086: astore 3
      // 087: aload 0
      // 088: sipush 31471
      // 08b: sipush 19577
      // 08e: invokestatic com/finalshell/core/Dm4.a (II)Ljava/lang/String;
      // 091: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 094: iload 2
      // 095: ifne 0b7
      // 098: ifeq 0aa
      // 09b: goto 0a2
      // 09e: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a1: athrow
      // 0a2: new com/finalshell/core/Dt4
      // 0a5: dup
      // 0a6: invokespecial com/finalshell/core/Dt4.<init> ()V
      // 0a9: astore 3
      // 0aa: aload 0
      // 0ab: sipush 31485
      // 0ae: sipush -4197
      // 0b1: invokestatic com/finalshell/core/Dm4.a (II)Ljava/lang/String;
      // 0b4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b7: iload 2
      // 0b8: ifne 0da
      // 0bb: ifeq 0cd
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4: athrow
      // 0c5: new com/finalshell/core/DZ3
      // 0c8: dup
      // 0c9: invokespecial com/finalshell/core/DZ3.<init> ()V
      // 0cc: astore 3
      // 0cd: aload 0
      // 0ce: sipush 31480
      // 0d1: sipush 18193
      // 0d4: invokestatic com/finalshell/core/Dm4.a (II)Ljava/lang/String;
      // 0d7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0da: iload 2
      // 0db: ifne 0fd
      // 0de: ifeq 0f0
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e7: athrow
      // 0e8: new com/finalshell/core/DS3
      // 0eb: dup
      // 0ec: invokespecial com/finalshell/core/DS3.<init> ()V
      // 0ef: astore 3
      // 0f0: aload 0
      // 0f1: sipush 31477
      // 0f4: sipush -20088
      // 0f7: invokestatic com/finalshell/core/Dm4.a (II)Ljava/lang/String;
      // 0fa: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0fd: iload 2
      // 0fe: ifne 120
      // 101: ifeq 113
      // 104: goto 10b
      // 107: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10a: athrow
      // 10b: new com/finalshell/core/DY3
      // 10e: dup
      // 10f: invokespecial com/finalshell/core/DY3.<init> ()V
      // 112: astore 3
      // 113: aload 0
      // 114: sipush 31486
      // 117: sipush 19156
      // 11a: invokestatic com/finalshell/core/Dm4.a (II)Ljava/lang/String;
      // 11d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 120: iload 2
      // 121: ifne 143
      // 124: ifeq 136
      // 127: goto 12e
      // 12a: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12d: athrow
      // 12e: new com/finalshell/core/Dg4
      // 131: dup
      // 132: invokespecial com/finalshell/core/Dg4.<init> ()V
      // 135: astore 3
      // 136: aload 0
      // 137: sipush 31484
      // 13a: sipush -12776
      // 13d: invokestatic com/finalshell/core/Dm4.a (II)Ljava/lang/String;
      // 140: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 143: ifeq 14e
      // 146: new com/finalshell/core/DX3
      // 149: dup
      // 14a: invokespecial com/finalshell/core/DX3.<init> ()V
      // 14d: astore 3
      // 14e: aload 3
      // 14f: iload 2
      // 150: ifne 169
      // 153: ifnonnull 163
      // 156: goto 15d
      // 159: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15c: athrow
      // 15d: aconst_null
      // 15e: areturn
      // 15f: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 162: athrow
      // 163: aload 3
      // 164: aload 1
      // 165: invokevirtual com/finalshell/core/Dm4.D (Lcom/finalshell/crypto/ConnectHost;)V
      // 168: aload 3
      // 169: areturn
   }

   public static Dm4 A(int param0, ConnectHost param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: getstatic com/finalshell/core/Dm4.I Ljava/util/Vector;
      // 06: dup
      // 07: astore 3
      // 08: monitorenter
      // 09: istore 2
      // 0a: bipush 0
      // 0b: istore 4
      // 0d: iload 4
      // 0f: getstatic com/finalshell/core/Dm4.I Ljava/util/Vector;
      // 12: invokevirtual java/util/Vector.size ()I
      // 15: if_icmpge 72
      // 18: getstatic com/finalshell/core/Dm4.I Ljava/util/Vector;
      // 1b: iload 4
      // 1d: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 20: checkcast com/finalshell/core/Dm4
      // 23: astore 5
      // 25: iload 2
      // 26: ifne 74
      // 29: iload 2
      // 2a: ifne 6e
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aload 5
      // 36: getfield com/finalshell/core/Dm4.t I
      // 39: iload 0
      // 3a: if_icmpne 6b
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: aload 5
      // 46: iload 2
      // 47: ifne 6a
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: getfield com/finalshell/core/Dm4.w Lcom/finalshell/crypto/ConnectHost;
      // 54: aload 1
      // 55: if_acmpne 6b
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: aload 5
      // 61: aload 3
      // 62: monitorexit
      // 63: goto 6a
      // 66: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69: athrow
      // 6a: areturn
      // 6b: iinc 4 1
      // 6e: iload 2
      // 6f: ifeq 0d
      // 72: aload 3
      // 73: monitorexit
      // 74: goto 7e
      // 77: astore 6
      // 79: aload 3
      // 7a: monitorexit
      // 7b: aload 6
      // 7d: athrow
      // 7e: aconst_null
      // 7f: areturn
   }

   public static void x(Dm4 var0) {
      synchronized (I) {
         I.removeElement(var0);
      }
   }

   public Dm4() {
      synchronized (I) {
         this.t = H++;
         I.addElement(this);
      }
   }

   public synchronized void N(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: aload 0
      // 04: iload 1
      // 05: putfield com/finalshell/core/Dm4.V I
      // 08: istore 2
      // 09: aload 0
      // 0a: iload 2
      // 0b: ifne 23
      // 0e: getfield com/finalshell/core/Dm4.r I
      // 11: ifle 26
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 0
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: invokevirtual java/lang/Object.notifyAll ()V
      // 26: return
   }

   public int J$int() {
      return this.V;
   }

   public void n() throws Pc2 {
   }

   public void I() throws Pc2 {
      this.I(0);
   }

   public void I(int param1) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: aload 0
      // 04: iload 1
      // 05: putfield com/finalshell/core/Dm4.j I
      // 08: istore 2
      // 09: aload 0
      // 0a: invokevirtual com/finalshell/core/Dm4.M ()V
      // 0d: aload 0
      // 0e: invokevirtual com/finalshell/core/Dm4.t ()V
      // 11: goto 49
      // 14: astore 3
      // 15: aload 0
      // 16: bipush 0
      // 17: putfield com/finalshell/core/Dm4.X Z
      // 1a: aload 0
      // 1b: invokevirtual com/finalshell/core/Dm4.r ()V
      // 1e: aload 3
      // 1f: iload 2
      // 20: ifeq 38
      // 23: instanceof com/finalshell/core/Pc2
      // 26: ifeq 3c
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: aload 3
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: checkcast com/finalshell/core/Pc2
      // 3b: athrow
      // 3c: new com/finalshell/core/Pc2
      // 3f: dup
      // 40: aload 3
      // 41: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 44: aload 3
      // 45: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 48: athrow
      // 49: return
   }

   public void R(boolean var1) {
   }

   public void t() throws Pc2 {
   }

   public boolean g() {
      return this.E;
   }

   public void D(UJ var1) {
      this.N(var1.d());
      this.X(var1.K());
      this.A(var1.d());
   }

   public void X(InputStream var1) {
      this.o.r(var1, false);
   }

   public void D(InputStream var1, boolean var2) {
      this.o.r(var1, var2);
   }

   public void D(OutputStream var1) {
      this.o.U(var1, false);
   }

   public void I(OutputStream var1, boolean var2) {
      this.o.U(var1, var2);
   }

   public void j(OutputStream var1) {
      this.o.m(var1, false);
   }

   public void l(OutputStream var1, boolean var2) {
      this.o.m(var1, var2);
   }

   public InputStream s() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: sipush 23285
      // 06: ldc2_w 2487399264033260065
      // 09: invokestatic com/finalshell/core/Dm4.a (IJ)I
      // 0c: istore 2
      // 0d: istore 1
      // 0e: aload 0
      // 0f: invokevirtual com/finalshell/core/Dm4.T ()Lcom/finalshell/crypto/ConnectHost;
      // 12: sipush 31481
      // 15: sipush 24086
      // 18: invokestatic com/finalshell/core/Dm4.a (II)Ljava/lang/String;
      // 1b: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 1e: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 21: istore 2
      // 22: goto 26
      // 25: astore 3
      // 26: new com/finalshell/io/Gu2
      // 29: dup
      // 2a: sipush 6955
      // 2d: ldc2_w 8167358497773978612
      // 30: invokestatic com/finalshell/core/Dm4.a (IJ)I
      // 33: iload 2
      // 34: invokespecial com/finalshell/io/Gu2.<init> (II)V
      // 37: astore 3
      // 38: sipush 6955
      // 3b: ldc2_w 8167358497773978612
      // 3e: invokestatic com/finalshell/core/Dm4.a (IJ)I
      // 41: iload 1
      // 42: ifne 58
      // 45: iload 2
      // 46: if_icmpge 5b
      // 49: goto 50
      // 4c: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: bipush 1
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: goto 5c
      // 5b: bipush 0
      // 5c: istore 4
      // 5e: aload 0
      // 5f: getfield com/finalshell/core/Dm4.o Lcom/finalshell/core/Cs4;
      // 62: new com/finalshell/io/GB
      // 65: dup
      // 66: aload 3
      // 67: iload 4
      // 69: invokespecial com/finalshell/io/GB.<init> (Ljava/io/PipedInputStream;Z)V
      // 6c: bipush 0
      // 6d: invokevirtual com/finalshell/core/Cs4.U (Ljava/io/OutputStream;Z)V
      // 70: aload 3
      // 71: areturn
   }

   public InputStream b() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: sipush 6955
      // 06: ldc2_w 8167358497773978612
      // 09: invokestatic com/finalshell/core/Dm4.a (IJ)I
      // 0c: istore 2
      // 0d: istore 1
      // 0e: aload 0
      // 0f: invokevirtual com/finalshell/core/Dm4.T ()Lcom/finalshell/crypto/ConnectHost;
      // 12: sipush 31475
      // 15: sipush 19311
      // 18: invokestatic com/finalshell/core/Dm4.a (II)Ljava/lang/String;
      // 1b: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 1e: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 21: istore 2
      // 22: goto 26
      // 25: astore 3
      // 26: new com/finalshell/io/Gu2
      // 29: dup
      // 2a: sipush 6955
      // 2d: ldc2_w 8167358497773978612
      // 30: invokestatic com/finalshell/core/Dm4.a (IJ)I
      // 33: iload 2
      // 34: invokespecial com/finalshell/io/Gu2.<init> (II)V
      // 37: astore 3
      // 38: sipush 6955
      // 3b: ldc2_w 8167358497773978612
      // 3e: invokestatic com/finalshell/core/Dm4.a (IJ)I
      // 41: iload 1
      // 42: ifne 58
      // 45: iload 2
      // 46: if_icmpge 5b
      // 49: goto 50
      // 4c: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: bipush 1
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: goto 5c
      // 5b: bipush 0
      // 5c: istore 4
      // 5e: aload 0
      // 5f: getfield com/finalshell/core/Dm4.o Lcom/finalshell/core/Cs4;
      // 62: new com/finalshell/io/GB
      // 65: dup
      // 66: aload 3
      // 67: iload 4
      // 69: invokespecial com/finalshell/io/GB.<init> (Ljava/io/PipedInputStream;Z)V
      // 6c: bipush 0
      // 6d: invokevirtual com/finalshell/core/Cs4.m (Ljava/io/OutputStream;Z)V
      // 70: aload 3
      // 71: areturn
   }

   public OutputStream j() throws IOException {
      return new ED(this, this);
   }

   public void M(int var1) {
      this.y = var1;
   }

   public void Q(int var1) {
      this.e = var1;
   }

   public void f(int var1) {
      this.B = var1;
   }

   public synchronized void X(long var1) {
      this.z = var1;
   }

   public synchronized void p(long param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: aload 0
      // 04: dup
      // 05: getfield com/finalshell/core/Dm4.z J
      // 08: lload 1
      // 09: ladd
      // 0a: putfield com/finalshell/core/Dm4.z J
      // 0d: istore 3
      // 0e: aload 0
      // 0f: iload 3
      // 10: ifeq 28
      // 13: getfield com/finalshell/core/Dm4.r I
      // 16: ifle 2b
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: invokevirtual java/lang/Object.notifyAll ()V
      // 2b: return
   }

   public void A(int var1) {
      this.c = var1;
   }

   public abstract void S();

   public void Q(byte[] var1) throws IOException {
      this.Y(var1, 0, var1.length);
   }

   public void Y(byte[] var1, int var2, int var3) throws IOException {
      try {
         this.o.z(var1, var2, var3);
      } catch (NullPointerException var5) {
      }
   }

   public void n(byte[] var1, int var2, int var3) throws IOException {
      try {
         this.o.m(var1, var2, var3);
      } catch (NullPointerException var5) {
      }
   }

   public void x$void() {
      this.E = true;

      try {
         this.o.l();
      } catch (NullPointerException var2) {
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void F$void() {
      boolean var1 = J$boolean();

      int var10000;
      label63: {
         try {
            var10000 = (this.K) ? 1 : 0;
            if (var1) {
               break label63;
            }

            if (this.K) {
               return;
            }
         } catch (Exception var11) {
            throw new RuntimeException(a(var11));
         }

         this.K = true;
         var10000 = this.J$int();
      }

      int var2 = var10000;

      try {
         if (var2 == -1) {
            return;
         }
      } catch (Exception var10) {
         throw new RuntimeException(a(var10));
      }

      try {
         UJ var3 = new UJ(a(29718, 2704755700029418692L));
         YU var4 = new YU(var3);
         var4.M();
         var3.V((byte)a(8523, 8341248835478632854L));
         var3.u(var2);
         Dm4 var5 = this;
         synchronized (this) {
            Dm4 var12 = this;
            if (!var1) {
               try {
                  if (!var12.S) {
                     this.T().D(var4);
                  }
               } catch (Exception var7) {
                  throw new RuntimeException(a(var7));
               }

               var12 = var5;
            }

            // $VF: monitorexit
         }
      } catch (Exception var9) {
      }
   }

   public void A() {
      boolean var1 = J$boolean();

      int var10000;
      label47: {
         try {
            var10000 = (this.S) ? 1 : 0;
            if (var1) {
               break label47;
            }

            if (this.S) {
               return;
            }
         } catch (Exception var10) {
            throw new RuntimeException(a(var10));
         }

         this.S = true;
         this.K = this.E = true;
         var10000 = this.J$int();
      }

      int var2 = var10000;

      try {
         if (var2 == -1) {
            return;
         }
      } catch (Exception var9) {
         throw new RuntimeException(a(var9));
      }

      try {
         UJ var3 = new UJ(a(4754, 7380252956790852171L));
         YU var4 = new YU(var3);
         var4.M();
         var3.V((byte)a(27732, 7055423388881876098L));
         var3.u(var2);
         synchronized (this) {
            this.T().D(var4);
         }
      } catch (Exception var8) {
      }
   }

   public boolean B() {
      return this.S;
   }

   public static void h(ConnectHost param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: aconst_null
      // 04: astore 2
      // 05: istore 1
      // 06: bipush 0
      // 07: istore 3
      // 08: getstatic com/finalshell/core/Dm4.I Ljava/util/Vector;
      // 0b: dup
      // 0c: astore 4
      // 0e: monitorenter
      // 0f: getstatic com/finalshell/core/Dm4.I Ljava/util/Vector;
      // 12: invokevirtual java/util/Vector.size ()I
      // 15: anewarray 2
      // 18: astore 2
      // 19: bipush 0
      // 1a: istore 5
      // 1c: iload 5
      // 1e: getstatic com/finalshell/core/Dm4.I Ljava/util/Vector;
      // 21: invokevirtual java/util/Vector.size ()I
      // 24: if_icmpge 63
      // 27: getstatic com/finalshell/core/Dm4.I Ljava/util/Vector;
      // 2a: iload 5
      // 2c: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 2f: checkcast com/finalshell/core/Dm4
      // 32: astore 6
      // 34: iload 1
      // 35: ifne 66
      // 38: aload 6
      // 3a: getfield com/finalshell/core/Dm4.w Lcom/finalshell/crypto/ConnectHost;
      // 3d: aload 0
      // 3e: if_acmpne 57
      // 41: goto 48
      // 44: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: aload 2
      // 49: iload 3
      // 4a: iinc 3 1
      // 4d: aload 6
      // 4f: aastore
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56: athrow
      // 57: goto 5c
      // 5a: astore 6
      // 5c: iinc 5 1
      // 5f: iload 1
      // 60: ifeq 1c
      // 63: aload 4
      // 65: monitorexit
      // 66: goto 71
      // 69: astore 7
      // 6b: aload 4
      // 6d: monitorexit
      // 6e: aload 7
      // 70: athrow
      // 71: bipush 0
      // 72: istore 4
      // 74: iload 4
      // 76: iload 3
      // 77: if_icmpge 88
      // 7a: aload 2
      // 7b: iload 4
      // 7d: aaload
      // 7e: invokevirtual com/finalshell/core/Dm4.r ()V
      // 81: iinc 4 1
      // 84: iload 1
      // 85: ifeq 74
      // 88: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void r() {
      boolean var1 = J$boolean();

      try {
         Dm4 var2 = this;
         synchronized (this) {
            Dm4 var10000 = this;
            if (!var1) {
               if (!this.X) {
                  return;
               }

               this.X = false;
               var10000 = var2;
            }

            // $VF: monitorexit
         }

         this.A();
         this.E = this.K = true;
         this.Z = null;

         try {
            Cs4 var13 = this.o;
            if (!var1) {
               try {
                  if (var13 == null) {
                     return;
                  }

                  var13 = this.o;
               } catch (Exception var9) {
                  throw new RuntimeException(a(var9));
               }
            }

            var13.Z();
         } catch (Exception var10) {
         }
      } finally {
         x(this);
      }
   }

   public boolean L() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: aload 0
      // 04: getfield com/finalshell/core/Dm4.w Lcom/finalshell/crypto/ConnectHost;
      // 07: astore 2
      // 08: istore 1
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifeq 19
      // 0e: ifnull 49
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 2
      // 19: invokevirtual com/finalshell/crypto/ConnectHost.t$boolean ()Z
      // 1c: iload 1
      // 1d: ifeq 35
      // 20: ifeq 47
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield com/finalshell/core/Dm4.X Z
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: iload 1
      // 36: ifeq 44
      // 39: ifeq 47
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: bipush 1
      // 44: goto 48
      // 47: bipush 0
      // 48: ireturn
      // 49: bipush 0
      // 4a: ireturn
   }

   public void H(String var1) throws Exception {
      QF var2 = new QF();
      var2.i(var1);
      var2.Q(this.T(), this);
   }

   public void j(int var1) {
      this.d = var1;
   }

   public int o() {
      return this.d;
   }

   public void D(ConnectHost var1) {
      this.w = var1;
   }

   public ConnectHost T() throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: aload 0
      // 04: getfield com/finalshell/core/Dm4.w Lcom/finalshell/crypto/ConnectHost;
      // 07: astore 2
      // 08: istore 1
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifne 2e
      // 0e: ifnonnull 2d
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: new com/finalshell/core/Pc2
      // 1b: dup
      // 1c: sipush 31487
      // 1f: sipush -5349
      // 22: invokestatic com/finalshell/core/Dm4.a (II)Ljava/lang/String;
      // 25: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 28: athrow
      // 29: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: aload 2
      // 2e: areturn
   }

   public int x$int() {
      return this.t;
   }

   public void l() throws Exception {
      UJ var1 = new UJ(a(24661, 4647585161351919753L));
      YU var2 = new YU(var1);
      var2.M();
      var1.V((byte)a(14830, 1798764512791339318L));
      var1.u(this.J$int());
      var1.u(this.t);
      var1.u(this.e);
      var1.u(this.B);
      this.T().D(var2);
   }

   public void d(int var1) {
      try {
         UJ var2 = new UJ(a(19428, 5169469720928867124L));
         YU var3 = new YU(var2);
         var3.M();
         var2.V((byte)a(30558, 5435808119330795401L));
         var2.u(this.J$int());
         var2.u(var1);
         var2.q(E8.J(a(31483, 32695)));
         var2.q(E8.z);
         this.T().D(var3);
      } catch (Exception var4) {
      }
   }

   public YU V() {
      UJ var1 = new UJ(a(19428, 5169469720928867124L));
      YU var2 = new YU(var1);
      var2.M();
      var1.V((byte)a(17773, 3043630360600567228L));
      var1.q(this.Y);
      var1.u(this.t);
      var1.u(this.e);
      var1.u(this.B);
      return var2;
   }

   public void M() throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: aload 0
      // 004: invokevirtual com/finalshell/core/Dm4.T ()Lcom/finalshell/crypto/ConnectHost;
      // 007: astore 2
      // 008: istore 1
      // 009: aload 2
      // 00a: invokevirtual com/finalshell/crypto/ConnectHost.t$boolean ()Z
      // 00d: ifne 025
      // 010: new com/finalshell/core/Pc2
      // 013: dup
      // 014: sipush 31469
      // 017: sipush -14373
      // 01a: invokestatic com/finalshell/core/Dm4.a (II)Ljava/lang/String;
      // 01d: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 020: athrow
      // 021: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: aload 0
      // 026: invokevirtual com/finalshell/core/Dm4.V ()Lcom/finalshell/core/YU;
      // 029: astore 3
      // 02a: sipush 30977
      // 02d: aload 2
      // 02e: aload 3
      // 02f: invokevirtual com/finalshell/crypto/ConnectHost.D (Lcom/finalshell/core/YU;)V
      // 032: ldc2_w 8463628717929390546
      // 035: invokestatic com/finalshell/core/Dm4.a (IJ)I
      // 038: istore 4
      // 03a: invokestatic java/lang/System.currentTimeMillis ()J
      // 03d: lstore 5
      // 03f: aload 0
      // 040: getfield com/finalshell/core/Dm4.j I
      // 043: i2l
      // 044: lstore 7
      // 046: lload 7
      // 048: lconst_0
      // 049: lcmp
      // 04a: iload 1
      // 04b: ifeq 059
      // 04e: ifeq 05b
      // 051: goto 058
      // 054: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: bipush 1
      // 059: istore 4
      // 05b: aload 0
      // 05c: dup
      // 05d: astore 9
      // 05f: monitorenter
      // 060: aload 0
      // 061: invokevirtual com/finalshell/core/Dm4.J$int ()I
      // 064: bipush -1
      // 065: if_icmpne 11d
      // 068: aload 2
      // 069: invokevirtual com/finalshell/crypto/ConnectHost.t$boolean ()Z
      // 06c: iload 1
      // 06d: ifeq 12f
      // 070: iload 1
      // 071: ifeq 087
      // 074: goto 07b
      // 077: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07a: athrow
      // 07b: ifeq 11d
      // 07e: goto 085
      // 081: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 084: athrow
      // 085: iload 4
      // 087: iload 1
      // 088: ifeq 0a0
      // 08b: ifle 11d
      // 08e: goto 095
      // 091: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094: athrow
      // 095: lload 7
      // 097: lconst_0
      // 098: lcmp
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09f: athrow
      // 0a0: iload 1
      // 0a1: ifeq 0e2
      // 0a4: ifle 0d3
      // 0a7: goto 0ae
      // 0aa: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ad: athrow
      // 0ae: invokestatic java/lang/System.currentTimeMillis ()J
      // 0b1: lload 5
      // 0b3: lsub
      // 0b4: lload 7
      // 0b6: lcmp
      // 0b7: iload 1
      // 0b8: ifeq 0e2
      // 0bb: goto 0c2
      // 0be: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c1: athrow
      // 0c2: ifle 0d3
      // 0c5: goto 0cc
      // 0c8: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cb: athrow
      // 0cc: bipush 0
      // 0cd: istore 4
      // 0cf: iload 1
      // 0d0: ifne 060
      // 0d3: lload 7
      // 0d5: iload 1
      // 0d6: ifeq 0e8
      // 0d9: lconst_0
      // 0da: lcmp
      // 0db: goto 0e2
      // 0de: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e1: athrow
      // 0e2: ifne 0eb
      // 0e5: getstatic com/finalshell/core/Dm4.nb J
      // 0e8: goto 0ed
      // 0eb: lload 7
      // 0ed: lstore 10
      // 0ef: aload 0
      // 0f0: bipush 1
      // 0f1: putfield com/finalshell/core/Dm4.r I
      // 0f4: aload 0
      // 0f5: lload 10
      // 0f7: invokevirtual java/lang/Object.wait (J)V
      // 0fa: aload 0
      // 0fb: bipush 0
      // 0fc: putfield com/finalshell/core/Dm4.r I
      // 0ff: goto 116
      // 102: astore 10
      // 104: aload 0
      // 105: bipush 0
      // 106: putfield com/finalshell/core/Dm4.r I
      // 109: goto 116
      // 10c: astore 12
      // 10e: aload 0
      // 10f: bipush 0
      // 110: putfield com/finalshell/core/Dm4.r I
      // 113: aload 12
      // 115: athrow
      // 116: iinc 4 -1
      // 119: iload 1
      // 11a: ifne 060
      // 11d: aload 9
      // 11f: monitorexit
      // 120: goto 12b
      // 123: astore 13
      // 125: aload 9
      // 127: monitorexit
      // 128: aload 13
      // 12a: athrow
      // 12b: aload 2
      // 12c: invokevirtual com/finalshell/crypto/ConnectHost.t$boolean ()Z
      // 12f: iload 1
      // 130: ifeq 156
      // 133: ifne 152
      // 136: goto 13d
      // 139: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13c: athrow
      // 13d: new com/finalshell/core/Pc2
      // 140: dup
      // 141: sipush 31472
      // 144: sipush -13214
      // 147: invokestatic com/finalshell/core/Dm4.a (II)Ljava/lang/String;
      // 14a: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 14d: athrow
      // 14e: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 151: athrow
      // 152: aload 0
      // 153: invokevirtual com/finalshell/core/Dm4.J$int ()I
      // 156: iload 1
      // 157: ifeq 189
      // 15a: bipush -1
      // 15b: if_icmpne 17a
      // 15e: goto 165
      // 161: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 164: athrow
      // 165: new com/finalshell/core/Pc2
      // 168: dup
      // 169: sipush 31474
      // 16c: sipush 3886
      // 16f: invokestatic com/finalshell/core/Dm4.a (II)Ljava/lang/String;
      // 172: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 175: athrow
      // 176: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 179: athrow
      // 17a: aload 0
      // 17b: iload 1
      // 17c: ifeq 1a2
      // 17f: getfield com/finalshell/core/Dm4.m Z
      // 182: goto 189
      // 185: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 188: athrow
      // 189: ifne 1a1
      // 18c: new com/finalshell/core/Pc2
      // 18f: dup
      // 190: sipush 31470
      // 193: sipush 24420
      // 196: invokestatic com/finalshell/core/Dm4.a (II)Ljava/lang/String;
      // 199: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 19c: athrow
      // 19d: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a0: athrow
      // 1a1: aload 0
      // 1a2: bipush 1
      // 1a3: putfield com/finalshell/core/Dm4.X Z
      // 1a6: return
   }

   static {
      __vfClinit__();
   }

   public static void K(boolean var0) {
      k = var0;
   }

   public static boolean F$boolean() {
      return k;
   }

   public static boolean J$boolean() {
      boolean var0 = F$boolean();

      try {
         return !var0;
      } catch (NullPointerException var1) {
         throw new RuntimeException(a(var1));
      }
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 31487) & 65535;
      if (bb[var2] == null) {
         char[] var3 = ab[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 171;
               break;
            case 1:
               var10000 = 34;
               break;
            case 2:
               var10000 = 17;
               break;
            case 3:
               var10000 = 61;
               break;
            case 4:
               var10000 = 41;
               break;
            case 5:
               var10000 = 91;
               break;
            case 6:
               var10000 = 118;
               break;
            case 7:
               var10000 = 149;
               break;
            case 8:
               var10000 = 251;
               break;
            case 9:
               var10000 = 81;
               break;
            case 10:
               var10000 = 179;
               break;
            case 11:
               var10000 = 21;
               break;
            case 12:
               var10000 = 252;
               break;
            case 13:
               var10000 = 191;
               break;
            case 14:
               var10000 = 253;
               break;
            case 15:
               var10000 = 33;
               break;
            case 16:
               var10000 = 243;
               break;
            case 17:
               var10000 = 145;
               break;
            case 18:
               var10000 = 210;
               break;
            case 19:
               var10000 = 70;
               break;
            case 20:
               var10000 = 211;
               break;
            case 21:
               var10000 = 37;
               break;
            case 22:
               var10000 = 133;
               break;
            case 23:
               var10000 = 146;
               break;
            case 24:
               var10000 = 121;
               break;
            case 25:
               var10000 = 98;
               break;
            case 26:
               var10000 = 151;
               break;
            case 27:
               var10000 = 124;
               break;
            case 28:
               var10000 = 175;
               break;
            case 29:
               var10000 = 5;
               break;
            case 30:
               var10000 = 196;
               break;
            case 31:
               var10000 = 245;
               break;
            case 32:
               var10000 = 231;
               break;
            case 33:
               var10000 = 49;
               break;
            case 34:
               var10000 = 184;
               break;
            case 35:
               var10000 = 236;
               break;
            case 36:
               var10000 = 244;
               break;
            case 37:
               var10000 = 126;
               break;
            case 38:
               var10000 = 83;
               break;
            case 39:
               var10000 = 52;
               break;
            case 40:
               var10000 = 216;
               break;
            case 41:
               var10000 = 104;
               break;
            case 42:
               var10000 = 232;
               break;
            case 43:
               var10000 = 87;
               break;
            case 44:
               var10000 = 246;
               break;
            case 45:
               var10000 = 72;
               break;
            case 46:
               var10000 = 135;
               break;
            case 47:
               var10000 = 57;
               break;
            case 48:
               var10000 = 214;
               break;
            case 49:
               var10000 = 44;
               break;
            case 50:
               var10000 = 16;
               break;
            case 51:
               var10000 = 66;
               break;
            case 52:
               var10000 = 224;
               break;
            case 53:
               var10000 = 117;
               break;
            case 54:
               var10000 = 8;
               break;
            case 55:
               var10000 = 92;
               break;
            case 56:
               var10000 = 139;
               break;
            case 57:
               var10000 = 173;
               break;
            case 58:
               var10000 = 11;
               break;
            case 59:
               var10000 = 102;
               break;
            case 60:
               var10000 = 77;
               break;
            case 61:
               var10000 = 212;
               break;
            case 62:
               var10000 = 111;
               break;
            case 63:
               var10000 = 112;
               break;
            case 64:
               var10000 = 22;
               break;
            case 65:
               var10000 = 2;
               break;
            case 66:
               var10000 = 120;
               break;
            case 67:
               var10000 = 9;
               break;
            case 68:
               var10000 = 137;
               break;
            case 69:
               var10000 = 79;
               break;
            case 70:
               var10000 = 56;
               break;
            case 71:
               var10000 = 213;
               break;
            case 72:
               var10000 = 144;
               break;
            case 73:
               var10000 = 58;
               break;
            case 74:
               var10000 = 190;
               break;
            case 75:
               var10000 = 205;
               break;
            case 76:
               var10000 = 199;
               break;
            case 77:
               var10000 = 51;
               break;
            case 78:
               var10000 = 63;
               break;
            case 79:
               var10000 = 140;
               break;
            case 80:
               var10000 = 204;
               break;
            case 81:
               var10000 = 240;
               break;
            case 82:
               var10000 = 166;
               break;
            case 83:
               var10000 = 39;
               break;
            case 84:
               var10000 = 193;
               break;
            case 85:
               var10000 = 106;
               break;
            case 86:
               var10000 = 226;
               break;
            case 87:
               var10000 = 247;
               break;
            case 88:
               var10000 = 64;
               break;
            case 89:
               var10000 = 74;
               break;
            case 90:
               var10000 = 100;
               break;
            case 91:
               var10000 = 96;
               break;
            case 92:
               var10000 = 125;
               break;
            case 93:
               var10000 = 80;
               break;
            case 94:
               var10000 = 1;
               break;
            case 95:
               var10000 = 40;
               break;
            case 96:
               var10000 = 30;
               break;
            case 97:
               var10000 = 181;
               break;
            case 98:
               var10000 = 203;
               break;
            case 99:
               var10000 = 154;
               break;
            case 100:
               var10000 = 6;
               break;
            case 101:
               var10000 = 207;
               break;
            case 102:
               var10000 = 67;
               break;
            case 103:
               var10000 = 47;
               break;
            case 104:
               var10000 = 107;
               break;
            case 105:
               var10000 = 209;
               break;
            case 106:
               var10000 = 97;
               break;
            case 107:
               var10000 = 208;
               break;
            case 108:
               var10000 = 27;
               break;
            case 109:
               var10000 = 229;
               break;
            case 110:
               var10000 = 186;
               break;
            case 111:
               var10000 = 183;
               break;
            case 112:
               var10000 = 109;
               break;
            case 113:
               var10000 = 4;
               break;
            case 114:
               var10000 = 141;
               break;
            case 115:
               var10000 = 85;
               break;
            case 116:
               var10000 = 178;
               break;
            case 117:
               var10000 = 59;
               break;
            case 118:
               var10000 = 156;
               break;
            case 119:
               var10000 = 3;
               break;
            case 120:
               var10000 = 26;
               break;
            case 121:
               var10000 = 68;
               break;
            case 122:
               var10000 = 185;
               break;
            case 123:
               var10000 = 45;
               break;
            case 124:
               var10000 = 250;
               break;
            case 125:
               var10000 = 241;
               break;
            case 126:
               var10000 = 194;
               break;
            case 127:
               var10000 = 238;
               break;
            case 128:
               var10000 = 147;
               break;
            case 129:
               var10000 = 10;
               break;
            case 130:
               var10000 = 192;
               break;
            case 131:
               var10000 = 114;
               break;
            case 132:
               var10000 = 206;
               break;
            case 133:
               var10000 = 227;
               break;
            case 134:
               var10000 = 218;
               break;
            case 135:
               var10000 = 242;
               break;
            case 136:
               var10000 = 165;
               break;
            case 137:
               var10000 = 86;
               break;
            case 138:
               var10000 = 202;
               break;
            case 139:
               var10000 = 195;
               break;
            case 140:
               var10000 = 130;
               break;
            case 141:
               var10000 = 157;
               break;
            case 142:
               var10000 = 249;
               break;
            case 143:
               var10000 = 115;
               break;
            case 144:
               var10000 = 94;
               break;
            case 145:
               var10000 = 43;
               break;
            case 146:
               var10000 = 255;
               break;
            case 147:
               var10000 = 15;
               break;
            case 148:
               var10000 = 13;
               break;
            case 149:
               var10000 = 160;
               break;
            case 150:
               var10000 = 89;
               break;
            case 151:
               var10000 = 54;
               break;
            case 152:
               var10000 = 239;
               break;
            case 153:
               var10000 = 167;
               break;
            case 154:
               var10000 = 0;
               break;
            case 155:
               var10000 = 73;
               break;
            case 156:
               var10000 = 132;
               break;
            case 157:
               var10000 = 163;
               break;
            case 158:
               var10000 = 69;
               break;
            case 159:
               var10000 = 38;
               break;
            case 160:
               var10000 = 162;
               break;
            case 161:
               var10000 = 233;
               break;
            case 162:
               var10000 = 254;
               break;
            case 163:
               var10000 = 110;
               break;
            case 164:
               var10000 = 170;
               break;
            case 165:
               var10000 = 180;
               break;
            case 166:
               var10000 = 42;
               break;
            case 167:
               var10000 = 78;
               break;
            case 168:
               var10000 = 99;
               break;
            case 169:
               var10000 = 219;
               break;
            case 170:
               var10000 = 237;
               break;
            case 171:
               var10000 = 155;
               break;
            case 172:
               var10000 = 150;
               break;
            case 173:
               var10000 = 177;
               break;
            case 174:
               var10000 = 55;
               break;
            case 175:
               var10000 = 123;
               break;
            case 176:
               var10000 = 136;
               break;
            case 177:
               var10000 = 32;
               break;
            case 178:
               var10000 = 131;
               break;
            case 179:
               var10000 = 143;
               break;
            case 180:
               var10000 = 29;
               break;
            case 181:
               var10000 = 188;
               break;
            case 182:
               var10000 = 75;
               break;
            case 183:
               var10000 = 142;
               break;
            case 184:
               var10000 = 230;
               break;
            case 185:
               var10000 = 103;
               break;
            case 186:
               var10000 = 46;
               break;
            case 187:
               var10000 = 215;
               break;
            case 188:
               var10000 = 138;
               break;
            case 189:
               var10000 = 172;
               break;
            case 190:
               var10000 = 217;
               break;
            case 191:
               var10000 = 134;
               break;
            case 192:
               var10000 = 127;
               break;
            case 193:
               var10000 = 128;
               break;
            case 194:
               var10000 = 198;
               break;
            case 195:
               var10000 = 7;
               break;
            case 196:
               var10000 = 93;
               break;
            case 197:
               var10000 = 176;
               break;
            case 198:
               var10000 = 23;
               break;
            case 199:
               var10000 = 164;
               break;
            case 200:
               var10000 = 148;
               break;
            case 201:
               var10000 = 14;
               break;
            case 202:
               var10000 = 50;
               break;
            case 203:
               var10000 = 105;
               break;
            case 204:
               var10000 = 113;
               break;
            case 205:
               var10000 = 88;
               break;
            case 206:
               var10000 = 31;
               break;
            case 207:
               var10000 = 60;
               break;
            case 208:
               var10000 = 24;
               break;
            case 209:
               var10000 = 20;
               break;
            case 210:
               var10000 = 71;
               break;
            case 211:
               var10000 = 12;
               break;
            case 212:
               var10000 = 116;
               break;
            case 213:
               var10000 = 35;
               break;
            case 214:
               var10000 = 248;
               break;
            case 215:
               var10000 = 225;
               break;
            case 216:
               var10000 = 222;
               break;
            case 217:
               var10000 = 19;
               break;
            case 218:
               var10000 = 76;
               break;
            case 219:
               var10000 = 201;
               break;
            case 220:
               var10000 = 48;
               break;
            case 221:
               var10000 = 223;
               break;
            case 222:
               var10000 = 174;
               break;
            case 223:
               var10000 = 82;
               break;
            case 224:
               var10000 = 28;
               break;
            case 225:
               var10000 = 168;
               break;
            case 226:
               var10000 = 62;
               break;
            case 227:
               var10000 = 95;
               break;
            case 228:
               var10000 = 220;
               break;
            case 229:
               var10000 = 53;
               break;
            case 230:
               var10000 = 228;
               break;
            case 231:
               var10000 = 18;
               break;
            case 232:
               var10000 = 182;
               break;
            case 233:
               var10000 = 129;
               break;
            case 234:
               var10000 = 84;
               break;
            case 235:
               var10000 = 152;
               break;
            case 236:
               var10000 = 65;
               break;
            case 237:
               var10000 = 169;
               break;
            case 238:
               var10000 = 101;
               break;
            case 239:
               var10000 = 197;
               break;
            case 240:
               var10000 = 119;
               break;
            case 241:
               var10000 = 122;
               break;
            case 242:
               var10000 = 90;
               break;
            case 243:
               var10000 = 153;
               break;
            case 244:
               var10000 = 108;
               break;
            case 245:
               var10000 = 161;
               break;
            case 246:
               var10000 = 158;
               break;
            case 247:
               var10000 = 221;
               break;
            case 248:
               var10000 = 189;
               break;
            case 249:
               var10000 = 200;
               break;
            case 250:
               var10000 = 235;
               break;
            case 251:
               var10000 = 159;
               break;
            case 252:
               var10000 = 187;
               break;
            case 253:
               var10000 = 25;
               break;
            case 254:
               var10000 = 234;
               break;
            default:
               var10000 = 36;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6356;
      if (ib[var3] == null) {
         ib[var3] = (int)(hb[var3] ^ var1);
      }

      return ib[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var36;
      String[] var15 = new String[19];
      int var13 = 0;
      String var12 = "ÉgmQg#\u008b¡\u009fY\u0090æ\"F\u0081wXÅdâä¸\u0099f\t\u0005Ñå\u0095U§Åë\u000b\fu\u0084\u000e¶ \u0010kë¢Í5\t\u001eëdÝªZ\u0093$\u009c\\Æ\u0013;½\u000b\u007fÇ6\u009cufÛLO\t>ê\u008f\u0016\u0012\u0084\u000b)6øÑH\u0084\u00014%\u009d&\u0007\u0007û´Â\\Qì\u0015Ñí¸¨·´\u008f'ßZd4¿v_2G\u000e\u008bÝ\u001d\u000f \u009bæ\u0081? \u0083*Ø\u009b\u0080&áïU\u0003\u00ad\u000bÉ\u0003öÓ!\u0004{_<6\u0004\u009b\u001då°\u0015ÆnZØëº\u0004æ®bJ3z\u0096ç.P\u008di\u00adA\u0016\u0088¬E\u00995\u008e$_(\u0086f\u001dü9Z\u0096%2\n\u0091Ë²\u0005\u009aÊ\u0011W9\u000f£W WÎã¾¹9ZD\u008c¸C\u009c\u0016x\u0011\f\u0096è\u00ad¿ú6Ø\"0\u0007¬\u0097\u000b\u0018\u0013\u008e\u001f\u0018æ";
      int var14 = "ÉgmQg#\u008b¡\u009fY\u0090æ\"F\u0081wXÅdâä¸\u0099f\t\u0005Ñå\u0095U§Åë\u000b\fu\u0084\u000e¶ \u0010kë¢Í5\t\u001eëdÝªZ\u0093$\u009c\\Æ\u0013;½\u000b\u007fÇ6\u009cufÛLO\t>ê\u008f\u0016\u0012\u0084\u000b)6øÑH\u0084\u00014%\u009d&\u0007\u0007û´Â\\Qì\u0015Ñí¸¨·´\u008f'ßZd4¿v_2G\u000e\u008bÝ\u001d\u000f \u009bæ\u0081? \u0083*Ø\u009b\u0080&áïU\u0003\u00ad\u000bÉ\u0003öÓ!\u0004{_<6\u0004\u009b\u001då°\u0015ÆnZØëº\u0004æ®bJ3z\u0096ç.P\u008di\u00adA\u0016\u0088¬E\u00995\u008e$_(\u0086f\u001dü9Z\u0096%2\n\u0091Ë²\u0005\u009aÊ\u0011W9\u000f£W WÎã¾¹9ZD\u008c¸C\u009c\u0016x\u0011\f\u0096è\u00ad¿ú6Ø\"0\u0007¬\u0097\u000b\u0018\u0013\u008e\u001f\u0018æ"
         .length();
      char var11 = 24;
      int var19 = -1;
      K(true);

      label70:
      while (true) {
         byte var10000 = 112;
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
                        var69 = 80;
                        break;
                     case 1:
                        var69 = 24;
                        break;
                     case 2:
                        var69 = 78;
                        break;
                     case 3:
                        var69 = 122;
                        break;
                     case 4:
                        var69 = 9;
                        break;
                     case 5:
                        var69 = 74;
                        break;
                     default:
                        var69 = 18;
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
                     long var2 = 5583979705031186087L;
                     long[] var8 = new long[14];
                     int var5 = 0;
                     String var6 = "ÿV¤bt\u001a\u0014\u0086^1\u0091\u001a5ÍJ\u0010\u0089\u0013\u008fþ=\u0016¢DV\u0086ï\u001eìº¹r\u0018±ëâ¦E\u0085[F\u0092t#8o\u000bA&,ËéO(º\u0007K0ºwÕ¦0¥ 0ÎÿR\u009e.æ\u001f_*ßâ\u0087ïQ/\u008a¦n\u009c\u009ap\u0091\u0003ðQ\u0096\"IUS";
                     int var7 = "ÿV¤bt\u001a\u0014\u0086^1\u0091\u001a5ÍJ\u0010\u0089\u0013\u008fþ=\u0016¢DV\u0086ï\u001eìº¹r\u0018±ëâ¦E\u0085[F\u0092t#8o\u000bA&,ËéO(º\u0007K0ºwÕ¦0¥ 0ÎÿR\u009e.æ\u001f_*ßâ\u0087ïQ/\u008a¦n\u009c\u009ap\u0091\u0003ðQ\u0096\"IUS"
                        .length();
                     byte var4 = 0;

                     label44:
                     while (true) {
                        byte var28 = var4;
                        var4 += 8;
                        byte[] var9 = var6.substring(var28, var4).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
                                    hb = var8;
                                    ib = new Integer[14];
                                    long var0 = 5397740930153499556L;
                                    long var42 = 5397740930153499566L ^ var0;
                                    byte var31 = -1;
                                    nb = var42;
                                    H = 0;
                                    I = new Vector();
                                    return;
                                 }
                                 break;
                              default:
                                 var21[var29] = var58;
                                 if (var4 < var7) {
                                    continue label44;
                                 }

                                 var6 = "¾\u0013bV\u0094ÞwÊ¨¬(Ö\u009dT\\\u0088";
                                 var7 = "¾\u0013bV\u0094ÞwÊ¨¬(Ö\u009dT\\\u0088".length();
                                 var4 = 0;
                           }

                           byte var30 = var4;
                           var4 += 8;
                           var9 = var6.substring(var30, var4).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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

                  var12 = "`(¤õõÿÀ\u008dH \u00965\u001eÀúUÍ¶ëý\u000bÃ\u000fÍ\u007f\u0011®\u0014 \u0019=16¹ýû\u0091\b";
                  var14 = "`(¤õõÿÀ\u008dH \u00965\u001eÀúUÍ¶ëý\u000bÃ\u000fÍ\u007f\u0011®\u0014 \u0019=16¹ýû\u0091\b".length();
                  var11 = 22;
                  var19 = -1;
            }

            var10000 = 111;
            var10001 = var12.substring(++var19, var19 + var11);
            var10002 = 0;
         }
      }
   }
}





