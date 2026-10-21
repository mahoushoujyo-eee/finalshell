package com.finalshell.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.TooManyListenersException;
import jtermios.j;

public class X3_3 extends XJ_2 {
   final boolean e;
   final boolean U;
   public Thread J;
   public volatile FW3 s;
   public volatile OutputStream i;
   public volatile InputStream g;
   public volatile int j;
   public volatile boolean A;
   public volatile int n;
   public volatile int x;
   public byte[] W;
   public volatile int k;
   public volatile int Y;
   public volatile int q;
   public volatile int o;
   public volatile int N;
   public volatile Object h;
   public volatile boolean I;
   public volatile boolean D;
   public volatile int X;
   public volatile int H;
   public volatile boolean v;
   public volatile int f;
   public volatile boolean b;
   public volatile boolean T;
   public volatile boolean t;
   public volatile boolean V;
   public volatile boolean K;
   public volatile boolean F;
   public volatile boolean c;
   public volatile boolean r;
   public volatile boolean S;
   public volatile boolean B;
   public volatile boolean E;
   public volatile boolean O;
   public volatile boolean G;
   public volatile boolean w;
   public volatile boolean R;
   public int[] u;
   public int y;
   public jtermios.X Z;
   public int Q;
   public static String[] a;
   public static String[] d;
   public static long[] l;
   public static Integer[] p;
   public static long[] z;
   public static Long[] C;

   public void K(boolean param1, boolean param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 3
      // 04: iload 1
      // 05: aload 3
      // 06: ifnull 66
      // 09: ifeq 65
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 0
      // 14: getfield com/finalshell/core/X3_3.T Z
      // 17: aload 3
      // 18: ifnull 66
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: ifeq 65
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield com/finalshell/core/X3_3.t Z
      // 30: aload 3
      // 31: ifnull 66
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: ifne 65
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: aload 0
      // 46: bipush 1
      // 47: putfield com/finalshell/core/X3_3.t Z
      // 4a: aload 0
      // 4b: getfield com/finalshell/core/X3_3.s Lcom/finalshell/core/FW3;
      // 4e: new com/finalshell/core/TX
      // 51: dup
      // 52: aload 0
      // 53: bipush 1
      // 54: bipush 0
      // 55: bipush 1
      // 56: invokespecial com/finalshell/core/TX.<init> (Lcom/finalshell/core/XJ_2;IZZ)V
      // 59: invokeinterface com/finalshell/core/FW3.w (Lcom/finalshell/core/TX;)V 2
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: iload 2
      // 66: aload 3
      // 67: ifnull 7f
      // 6a: ifeq c6
      // 6d: goto 74
      // 70: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73: athrow
      // 74: aload 0
      // 75: getfield com/finalshell/core/X3_3.V Z
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: aload 3
      // 80: ifnull a3
      // 83: ifeq c6
      // 86: goto 8d
      // 89: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8c: athrow
      // 8d: aload 0
      // 8e: aload 3
      // 8f: ifnull b3
      // 92: goto 99
      // 95: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 98: athrow
      // 99: getfield com/finalshell/core/X3_3.K Z
      // 9c: goto a3
      // 9f: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a2: athrow
      // a3: ifne c6
      // a6: aload 0
      // a7: bipush 1
      // a8: putfield com/finalshell/core/X3_3.K Z
      // ab: aload 0
      // ac: goto b3
      // af: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b2: athrow
      // b3: getfield com/finalshell/core/X3_3.s Lcom/finalshell/core/FW3;
      // b6: new com/finalshell/core/TX
      // b9: dup
      // ba: aload 0
      // bb: bipush 2
      // bc: bipush 0
      // bd: bipush 1
      // be: invokespecial com/finalshell/core/TX.<init> (Lcom/finalshell/core/XJ_2;IZZ)V
      // c1: invokeinterface com/finalshell/core/FW3.w (Lcom/finalshell/core/TX;)V 2
      // c6: return
   }

   public synchronized void n() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 1
      // 004: aload 0
      // 005: getfield com/finalshell/core/X3_3.j I
      // 008: getstatic jtermios/j.d I
      // 00b: aload 0
      // 00c: getfield com/finalshell/core/X3_3.u [I
      // 00f: invokestatic jtermios/j.K (II[I)I
      // 012: aload 1
      // 013: ifnull 025
      // 016: ifge 021
      // 019: goto 020
      // 01c: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01f: athrow
      // 020: return
      // 021: aload 0
      // 022: getfield com/finalshell/core/X3_3.y I
      // 025: istore 2
      // 026: aload 0
      // 027: aload 0
      // 028: getfield com/finalshell/core/X3_3.u [I
      // 02b: bipush 0
      // 02c: iaload
      // 02d: putfield com/finalshell/core/X3_3.y I
      // 030: aload 0
      // 031: getfield com/finalshell/core/X3_3.y I
      // 034: istore 3
      // 035: iload 2
      // 036: iload 3
      // 037: ixor
      // 038: istore 4
      // 03a: iload 4
      // 03c: aload 1
      // 03d: ifnull 04f
      // 040: ifne 04b
      // 043: goto 04a
      // 046: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 049: athrow
      // 04a: return
      // 04b: aload 0
      // 04c: getfield com/finalshell/core/X3_3.c Z
      // 04f: aload 1
      // 050: ifnull 0ad
      // 053: ifeq 0a9
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: getstatic jtermios/j.HH I
      // 060: dup
      // 061: istore 5
      // 063: iload 4
      // 065: iand
      // 066: aload 1
      // 067: ifnull 0ad
      // 06a: ifeq 0a9
      // 06d: goto 074
      // 070: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073: athrow
      // 074: aload 0
      // 075: getfield com/finalshell/core/X3_3.s Lcom/finalshell/core/FW3;
      // 078: new com/finalshell/core/TX
      // 07b: dup
      // 07c: aload 0
      // 07d: bipush 3
      // 07e: iload 2
      // 07f: iload 5
      // 081: iand
      // 082: ifeq 094
      // 085: goto 08c
      // 088: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08b: athrow
      // 08c: bipush 1
      // 08d: goto 095
      // 090: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 093: athrow
      // 094: bipush 0
      // 095: iload 3
      // 096: iload 5
      // 098: iand
      // 099: ifeq 0a0
      // 09c: bipush 1
      // 09d: goto 0a1
      // 0a0: bipush 0
      // 0a1: invokespecial com/finalshell/core/TX.<init> (Lcom/finalshell/core/XJ_2;IZZ)V
      // 0a4: invokeinterface com/finalshell/core/FW3.w (Lcom/finalshell/core/TX;)V 2
      // 0a9: aload 0
      // 0aa: getfield com/finalshell/core/X3_3.r Z
      // 0ad: aload 1
      // 0ae: ifnull 10b
      // 0b1: ifeq 107
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ba: athrow
      // 0bb: getstatic jtermios/j.HZ I
      // 0be: dup
      // 0bf: istore 5
      // 0c1: iload 4
      // 0c3: iand
      // 0c4: aload 1
      // 0c5: ifnull 10b
      // 0c8: ifeq 107
      // 0cb: goto 0d2
      // 0ce: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d1: athrow
      // 0d2: aload 0
      // 0d3: getfield com/finalshell/core/X3_3.s Lcom/finalshell/core/FW3;
      // 0d6: new com/finalshell/core/TX
      // 0d9: dup
      // 0da: aload 0
      // 0db: bipush 4
      // 0dc: iload 2
      // 0dd: iload 5
      // 0df: iand
      // 0e0: ifeq 0f2
      // 0e3: goto 0ea
      // 0e6: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9: athrow
      // 0ea: bipush 1
      // 0eb: goto 0f3
      // 0ee: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1: athrow
      // 0f2: bipush 0
      // 0f3: iload 3
      // 0f4: iload 5
      // 0f6: iand
      // 0f7: ifeq 0fe
      // 0fa: bipush 1
      // 0fb: goto 0ff
      // 0fe: bipush 0
      // 0ff: invokespecial com/finalshell/core/TX.<init> (Lcom/finalshell/core/XJ_2;IZZ)V
      // 102: invokeinterface com/finalshell/core/FW3.w (Lcom/finalshell/core/TX;)V 2
      // 107: aload 0
      // 108: getfield com/finalshell/core/X3_3.F Z
      // 10b: aload 1
      // 10c: ifnull 169
      // 10f: ifeq 165
      // 112: goto 119
      // 115: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 118: athrow
      // 119: getstatic jtermios/j.S I
      // 11c: dup
      // 11d: istore 5
      // 11f: iload 4
      // 121: iand
      // 122: aload 1
      // 123: ifnull 169
      // 126: ifeq 165
      // 129: goto 130
      // 12c: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12f: athrow
      // 130: aload 0
      // 131: getfield com/finalshell/core/X3_3.s Lcom/finalshell/core/FW3;
      // 134: new com/finalshell/core/TX
      // 137: dup
      // 138: aload 0
      // 139: bipush 5
      // 13a: iload 2
      // 13b: iload 5
      // 13d: iand
      // 13e: ifeq 150
      // 141: goto 148
      // 144: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 147: athrow
      // 148: bipush 1
      // 149: goto 151
      // 14c: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14f: athrow
      // 150: bipush 0
      // 151: iload 3
      // 152: iload 5
      // 154: iand
      // 155: ifeq 15c
      // 158: bipush 1
      // 159: goto 15d
      // 15c: bipush 0
      // 15d: invokespecial com/finalshell/core/TX.<init> (Lcom/finalshell/core/XJ_2;IZZ)V
      // 160: invokeinterface com/finalshell/core/FW3.w (Lcom/finalshell/core/TX;)V 2
      // 165: aload 0
      // 166: getfield com/finalshell/core/X3_3.S Z
      // 169: aload 1
      // 16a: ifnull 17a
      // 16d: ifeq 1c0
      // 170: goto 177
      // 173: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 176: athrow
      // 177: getstatic jtermios/j.U I
      // 17a: dup
      // 17b: istore 5
      // 17d: iload 4
      // 17f: iand
      // 180: ifeq 1c0
      // 183: aload 0
      // 184: getfield com/finalshell/core/X3_3.s Lcom/finalshell/core/FW3;
      // 187: new com/finalshell/core/TX
      // 18a: dup
      // 18b: aload 0
      // 18c: sipush 14228
      // 18f: ldc2_w 1738142357779616089
      // 192: invokestatic com/finalshell/core/X3_3.a (IJ)I
      // 195: iload 2
      // 196: iload 5
      // 198: iand
      // 199: ifeq 1ab
      // 19c: goto 1a3
      // 19f: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a2: athrow
      // 1a3: bipush 1
      // 1a4: goto 1ac
      // 1a7: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1aa: athrow
      // 1ab: bipush 0
      // 1ac: iload 3
      // 1ad: iload 5
      // 1af: iand
      // 1b0: ifeq 1b7
      // 1b3: bipush 1
      // 1b4: goto 1b8
      // 1b7: bipush 0
      // 1b8: invokespecial com/finalshell/core/TX.<init> (Lcom/finalshell/core/XJ_2;IZZ)V
      // 1bb: invokeinterface com/finalshell/core/FW3.w (Lcom/finalshell/core/TX;)V 2
      // 1c0: return
   }

   @Override
   public synchronized void k(FW3 param1) throws TooManyListenersException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: invokespecial com/finalshell/core/X3_3.Q ()V
      // 07: astore 2
      // 08: aload 1
      // 09: aload 2
      // 0a: ifnull 3b
      // 0d: ifnonnull 2c
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: new java/lang/IllegalArgumentException
      // 1a: dup
      // 1b: sipush -17186
      // 1e: sipush 29336
      // 21: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 24: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 27: athrow
      // 28: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: aload 0
      // 2d: aload 2
      // 2e: ifnull 50
      // 31: getfield com/finalshell/core/X3_3.s Lcom/finalshell/core/FW3;
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: ifnull 4a
      // 3e: new java/util/TooManyListenersException
      // 41: dup
      // 42: invokespecial java/util/TooManyListenersException.<init> ()V
      // 45: athrow
      // 46: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49: athrow
      // 4a: aload 0
      // 4b: aload 1
      // 4c: putfield com/finalshell/core/X3_3.s Lcom/finalshell/core/FW3;
      // 4f: aload 0
      // 50: aload 2
      // 51: ifnull 6e
      // 54: getfield com/finalshell/core/X3_3.R Z
      // 57: ifne 74
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: aload 0
      // 62: bipush 1
      // 63: putfield com/finalshell/core/X3_3.R Z
      // 66: aload 0
      // 67: goto 6e
      // 6a: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d: athrow
      // 6e: getfield com/finalshell/core/X3_3.J Ljava/lang/Thread;
      // 71: invokevirtual java/lang/Thread.start ()V
      // 74: return
   }

   public synchronized int Y$int() {
      this.Q();
      return this.k;
   }

   @Override
   public synchronized int J() {
      this.Q();
      return this.Y;
   }

   @Override
   public synchronized int F() {
      this.Q();
      return this.q;
   }

   public synchronized int N$int() {
      this.Q();
      return this.o;
   }

   public synchronized int W$int() {
      this.Q();
      return this.N;
   }

   public synchronized boolean q$boolean() {
      this.Q();
      return this.Y(jtermios.j.U);
   }

   @Override
   public synchronized boolean m() {
      this.Q();
      return this.Y(jtermios.j.HH);
   }

   @Override
   public synchronized boolean s$boolean() {
      this.Q();
      return this.Y(jtermios.j.HZ);
   }

   @Override
   public synchronized boolean w() {
      this.Q();
      return this.Y(jtermios.j.Hx);
   }

   @Override
   public synchronized boolean U() {
      this.Q();
      return this.Y(jtermios.j.S);
   }

   @Override
   public synchronized boolean B() {
      this.Q();
      return this.Y(jtermios.j.H_);
   }

   @Override
   public synchronized void v(boolean var1) {
      this.Q();
      this.G = var1;
   }

   @Override
   public synchronized void W(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: invokespecial com/finalshell/core/X3_3.Q ()V
      // 07: astore 2
      // 08: aload 2
      // 09: ifnull 2e
      // 0c: iload 1
      // 0d: ifeq 25
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 0
      // 18: getstatic jtermios/j.HH I
      // 1b: invokespecial com/finalshell/core/X3_3.X (I)V
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 0
      // 26: iload 1
      // 27: putfield com/finalshell/core/X3_3.c Z
      // 2a: aload 0
      // 2b: invokespecial com/finalshell/core/X3_3.y ()V
      // 2e: return
   }

   @Override
   public synchronized void n(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: invokespecial com/finalshell/core/X3_3.Q ()V
      // 07: astore 2
      // 08: aload 2
      // 09: ifnull 2e
      // 0c: iload 1
      // 0d: ifeq 25
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 0
      // 18: getstatic jtermios/j.U I
      // 1b: invokespecial com/finalshell/core/X3_3.X (I)V
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 0
      // 26: iload 1
      // 27: putfield com/finalshell/core/X3_3.S Z
      // 2a: aload 0
      // 2b: invokespecial com/finalshell/core/X3_3.y ()V
      // 2e: return
   }

   @Override
   public synchronized void o(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: invokespecial com/finalshell/core/X3_3.Q ()V
      // 07: astore 2
      // 08: aload 2
      // 09: ifnull 2e
      // 0c: iload 1
      // 0d: ifeq 25
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 0
      // 18: getstatic jtermios/j.HZ I
      // 1b: invokespecial com/finalshell/core/X3_3.X (I)V
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 0
      // 26: iload 1
      // 27: putfield com/finalshell/core/X3_3.r Z
      // 2a: aload 0
      // 2b: invokespecial com/finalshell/core/X3_3.y ()V
      // 2e: return
   }

   @Override
   public synchronized void e(boolean var1) {
      this.Q();
      this.T = var1;
      this.y();
   }

   @Override
   public synchronized void C(boolean var1) {
      this.Q();
      this.O = var1;
   }

   @Override
   public synchronized void c(boolean var1) {
      this.Q();
      this.V = var1;
      this.y();
   }

   @Override
   public synchronized void I(boolean var1) {
      this.Q();
      this.B = var1;
   }

   @Override
   public synchronized void h(boolean var1) {
      this.Q();
      this.E = var1;
   }

   @Override
   public synchronized void O(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: invokespecial com/finalshell/core/X3_3.Q ()V
      // 07: astore 2
      // 08: aload 2
      // 09: ifnull 2e
      // 0c: iload 1
      // 0d: ifeq 25
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 0
      // 18: getstatic jtermios/j.S I
      // 1b: invokespecial com/finalshell/core/X3_3.X (I)V
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 0
      // 26: iload 1
      // 27: putfield com/finalshell/core/X3_3.F Z
      // 2a: aload 0
      // 2b: invokespecial com/finalshell/core/X3_3.y ()V
      // 2e: return
   }

   @Override
   public synchronized void s$void() {
      this.Q();
      this.s = null;
   }

   @Override
   public synchronized void W(int var1) {
      this.Q();
      jtermios.j.r(this.j, var1);
   }

   @Override
   public synchronized void H(boolean var1) {
      this.Q();
      this.p(jtermios.j.Hx, var1);
   }

   @Override
   public synchronized void Q(boolean var1) {
      this.Q();
      this.p(jtermios.j.H_, var1);
   }

   public synchronized void N$void() {
      this.Q();
   }

   public synchronized void Y$void() {
      this.Q();
      synchronized (this.h) {
         this.v = false;
         this.D();
      }
   }

   @Override
   public synchronized void z() {
      this.Q();
      synchronized (this.h) {
         this.D = false;
         this.D();
      }
   }

   @Override
   public synchronized void V(int param1) throws Mw2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: invokespecial com/finalshell/core/X3_3.Q ()V
      // 07: astore 2
      // 08: iload 1
      // 09: aload 2
      // 0a: ifnull 58
      // 0d: ifge 49
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: new java/lang/IllegalArgumentException
      // 1a: dup
      // 1b: new java/lang/StringBuilder
      // 1e: dup
      // 1f: invokespecial java/lang/StringBuilder.<init> ()V
      // 22: sipush -17197
      // 25: sipush -139
      // 28: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 2b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e: iload 1
      // 2f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 32: sipush -17199
      // 35: sipush -10778
      // 38: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 3b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 41: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 44: athrow
      // 45: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48: athrow
      // 49: aload 0
      // 4a: aload 2
      // 4b: ifnull a5
      // 4e: getfield com/finalshell/core/X3_3.U Z
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: ifeq a1
      // 5b: iload 1
      // 5c: sipush 4175
      // 5f: ldc2_w 6300228040827287183
      // 62: invokestatic com/finalshell/core/X3_3.a (IJ)I
      // 65: if_icmple a1
      // 68: goto 6f
      // 6b: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e: athrow
      // 6f: new java/lang/IllegalArgumentException
      // 72: dup
      // 73: new java/lang/StringBuilder
      // 76: dup
      // 77: invokespecial java/lang/StringBuilder.<init> ()V
      // 7a: sipush -17197
      // 7d: sipush -139
      // 80: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 83: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 86: iload 1
      // 87: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 8a: sipush -17213
      // 8d: sipush 11871
      // 90: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 93: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 96: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 99: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 9c: athrow
      // 9d: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a0: athrow
      // a1: aload 0
      // a2: getfield com/finalshell/core/X3_3.h Ljava/lang/Object;
      // a5: dup
      // a6: astore 3
      // a7: monitorenter
      // a8: aload 0
      // a9: bipush 1
      // aa: putfield com/finalshell/core/X3_3.v Z
      // ad: aload 0
      // ae: iload 1
      // af: putfield com/finalshell/core/X3_3.f I
      // b2: aload 0
      // b3: invokespecial com/finalshell/core/X3_3.D ()V
      // b6: aload 3
      // b7: monitorexit
      // b8: goto c2
      // bb: astore 4
      // bd: aload 3
      // be: monitorexit
      // bf: aload 4
      // c1: athrow
      // c2: return
   }

   @Override
   public synchronized void b(int param1) throws Mw2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: iload 1
      // 05: aload 2
      // 06: ifnull 46
      // 09: ifge 45
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: new java/lang/IllegalArgumentException
      // 16: dup
      // 17: new java/lang/StringBuilder
      // 1a: dup
      // 1b: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e: sipush -17191
      // 21: sipush 15924
      // 24: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 27: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a: iload 1
      // 2b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2e: sipush -17177
      // 31: sipush 4075
      // 34: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 37: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3d: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 40: athrow
      // 41: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: iload 1
      // 46: sipush 18370
      // 49: ldc2_w 4694990164775690499
      // 4c: invokestatic com/finalshell/core/X3_3.a (IJ)I
      // 4f: if_icmple 84
      // 52: new com/finalshell/core/Mw2
      // 55: dup
      // 56: new java/lang/StringBuilder
      // 59: dup
      // 5a: invokespecial java/lang/StringBuilder.<init> ()V
      // 5d: sipush -17197
      // 60: sipush -139
      // 63: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 66: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 69: iload 1
      // 6a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 6d: sipush -17190
      // 70: sipush -31420
      // 73: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 76: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 79: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7c: invokespecial com/finalshell/core/Mw2.<init> (Ljava/lang/String;)V
      // 7f: athrow
      // 80: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83: athrow
      // 84: aload 0
      // 85: invokespecial com/finalshell/core/X3_3.Q ()V
      // 88: aload 0
      // 89: getfield com/finalshell/core/X3_3.h Ljava/lang/Object;
      // 8c: dup
      // 8d: astore 3
      // 8e: monitorenter
      // 8f: aload 0
      // 90: bipush 1
      // 91: putfield com/finalshell/core/X3_3.D Z
      // 94: aload 0
      // 95: iload 1
      // 96: putfield com/finalshell/core/X3_3.X I
      // 99: aload 0
      // 9a: invokespecial com/finalshell/core/X3_3.D ()V
      // 9d: aload 3
      // 9e: monitorexit
      // 9f: goto a9
      // a2: astore 4
      // a4: aload 3
      // a5: monitorexit
      // a6: aload 4
      // a8: athrow
      // a9: return
   }

   @Override
   public synchronized void c(int var1) throws Mw2 {
      this.Q();
      throw new Mw2(a(-17189, 10935));
   }

   public void D() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 0
      // 06: getfield com/finalshell/core/X3_3.D Z
      // 09: aload 1
      // 0a: ifnull 3b
      // 0d: ifeq 30
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 0
      // 18: getfield com/finalshell/core/X3_3.X I
      // 1b: aload 1
      // 1c: ifnull 63
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: ifeq 62
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: aload 0
      // 31: getfield com/finalshell/core/X3_3.v Z
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: aload 1
      // 3c: ifnull 54
      // 3f: ifeq 66
      // 42: goto 49
      // 45: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48: athrow
      // 49: aload 0
      // 4a: getfield com/finalshell/core/X3_3.f I
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: aload 1
      // 55: ifnull 63
      // 58: ifne 66
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: bipush 1
      // 63: goto 67
      // 66: bipush 0
      // 67: putfield com/finalshell/core/X3_3.b Z
      // 6a: aload 0
      // 6b: aload 0
      // 6c: getfield com/finalshell/core/X3_3.X I
      // 6f: sipush 8411
      // 72: ldc2_w 4393384201336948240
      // 75: invokestatic com/finalshell/core/X3_3.a (IJ)I
      // 78: iadd
      // 79: sipush 21930
      // 7c: ldc2_w 9072970453623763812
      // 7f: invokestatic com/finalshell/core/X3_3.a (IJ)I
      // 82: idiv
      // 83: putfield com/finalshell/core/X3_3.H I
      // 86: aload 0
      // 87: bipush 1
      // 88: putfield com/finalshell/core/X3_3.I Z
      // 8b: return
   }

   @Override
   public synchronized int S$int() {
      this.Q();
      return 0;
   }

   @Override
   public synchronized int h() {
      this.Q();
      return 0;
   }

   @Override
   public synchronized void R(int param1) throws Mw2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: invokespecial com/finalshell/core/X3_3.Q ()V
      // 07: aload 0
      // 08: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 0b: dup
      // 0c: astore 3
      // 0d: monitorenter
      // 0e: astore 2
      // 0f: aload 0
      // 10: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 13: dup
      // 14: getfield jtermios/X.x I
      // 17: getstatic jtermios/j.HI I
      // 1a: bipush -1
      // 1b: ixor
      // 1c: iand
      // 1d: aload 2
      // 1e: ifnull 60
      // 21: putfield jtermios/X.x I
      // 24: iload 1
      // 25: bipush 3
      // 26: iand
      // 27: ifeq 4b
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: aload 0
      // 32: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 35: dup
      // 36: getfield jtermios/X.n I
      // 39: getstatic jtermios/j.P I
      // 3c: ior
      // 3d: putfield jtermios/X.n I
      // 40: aload 2
      // 41: ifnonnull 63
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 4f: dup
      // 50: getfield jtermios/X.n I
      // 53: getstatic jtermios/j.P I
      // 56: bipush -1
      // 57: ixor
      // 58: iand
      // 59: goto 60
      // 5c: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f: athrow
      // 60: putfield jtermios/X.n I
      // 63: iload 1
      // 64: bipush 4
      // 65: iand
      // 66: ifeq 83
      // 69: aload 0
      // 6a: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 6d: dup
      // 6e: getfield jtermios/X.x I
      // 71: getstatic jtermios/j.He I
      // 74: ior
      // 75: putfield jtermios/X.x I
      // 78: aload 2
      // 79: ifnonnull 9b
      // 7c: goto 83
      // 7f: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 82: athrow
      // 83: aload 0
      // 84: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 87: dup
      // 88: getfield jtermios/X.x I
      // 8b: getstatic jtermios/j.He I
      // 8e: bipush -1
      // 8f: ixor
      // 90: iand
      // 91: putfield jtermios/X.x I
      // 94: goto 9b
      // 97: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9a: athrow
      // 9b: iload 1
      // 9c: sipush 12646
      // 9f: ldc2_w 8741723040083318697
      // a2: invokestatic com/finalshell/core/X3_3.a (IJ)I
      // a5: iand
      // a6: ifeq c3
      // a9: aload 0
      // aa: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // ad: dup
      // ae: getfield jtermios/X.x I
      // b1: getstatic jtermios/j.HX I
      // b4: ior
      // b5: putfield jtermios/X.x I
      // b8: aload 2
      // b9: ifnonnull db
      // bc: goto c3
      // bf: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c2: athrow
      // c3: aload 0
      // c4: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // c7: dup
      // c8: getfield jtermios/X.x I
      // cb: getstatic jtermios/j.HX I
      // ce: bipush -1
      // cf: ixor
      // d0: iand
      // d1: putfield jtermios/X.x I
      // d4: goto db
      // d7: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // da: athrow
      // db: aload 0
      // dc: aload 0
      // dd: getfield com/finalshell/core/X3_3.j I
      // e0: getstatic jtermios/j.H4 I
      // e3: aload 0
      // e4: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // e7: invokestatic jtermios/j.l (IILjtermios/X;)I
      // ea: invokespecial com/finalshell/core/X3_3.C (I)V
      // ed: aload 0
      // ee: iload 1
      // ef: putfield com/finalshell/core/X3_3.q I
      // f2: aload 3
      // f3: monitorexit
      // f4: goto fe
      // f7: astore 4
      // f9: aload 3
      // fa: monitorexit
      // fb: aload 4
      // fd: athrow
      // fe: return
   }

   @Override
   public synchronized void M(int param1, int param2, int param3, int param4) throws Mw2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aload 0
      // 004: invokespecial com/finalshell/core/X3_3.Q ()V
      // 007: astore 5
      // 009: aload 0
      // 00a: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 00d: dup
      // 00e: astore 6
      // 010: monitorenter
      // 011: new jtermios/X
      // 014: dup
      // 015: invokespecial jtermios/X.<init> ()V
      // 018: astore 7
      // 01a: aload 7
      // 01c: aload 0
      // 01d: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 020: invokevirtual jtermios/X.P (Ljtermios/X;)V
      // 023: aload 0
      // 024: aload 0
      // 025: getfield com/finalshell/core/X3_3.j I
      // 028: aload 0
      // 029: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 02c: iload 1
      // 02d: invokestatic jtermios/j.S (ILjtermios/X;I)I
      // 030: invokespecial com/finalshell/core/X3_3.C (I)V
      // 033: iload 2
      // 034: aload 5
      // 036: ifnull 05b
      // 039: tableswitch 85 5 8 31 55 65 75
      // 058: getstatic jtermios/j.M I
      // 05b: istore 8
      // 05d: aload 5
      // 05f: ifnonnull 0b4
      // 062: bipush 1
      // 063: anewarray 297
      // 066: invokestatic com/finalshell/ui/panel/Ky4.K ([Ljava/lang/String;)V
      // 069: goto 070
      // 06c: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06f: athrow
      // 070: getstatic jtermios/j.W I
      // 073: istore 8
      // 075: aload 5
      // 077: ifnonnull 0b4
      // 07a: getstatic jtermios/j.H0 I
      // 07d: istore 8
      // 07f: aload 5
      // 081: ifnonnull 0b4
      // 084: getstatic jtermios/j.Ho I
      // 087: istore 8
      // 089: aload 5
      // 08b: ifnonnull 0b4
      // 08e: new com/finalshell/core/Mw2
      // 091: dup
      // 092: new java/lang/StringBuilder
      // 095: dup
      // 096: invokespecial java/lang/StringBuilder.<init> ()V
      // 099: sipush -17195
      // 09c: sipush -28255
      // 09f: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 0a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a5: iload 2
      // 0a6: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0a9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ac: invokespecial com/finalshell/core/Mw2.<init> (Ljava/lang/String;)V
      // 0af: athrow
      // 0b0: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: iload 3
      // 0b5: aload 5
      // 0b7: ifnull 0d9
      // 0ba: tableswitch 54 1 3 30 46 38
      // 0d4: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d7: athrow
      // 0d8: bipush 1
      // 0d9: istore 9
      // 0db: aload 5
      // 0dd: ifnonnull 116
      // 0e0: bipush 2
      // 0e1: istore 9
      // 0e3: aload 5
      // 0e5: ifnonnull 116
      // 0e8: bipush 2
      // 0e9: istore 9
      // 0eb: aload 5
      // 0ed: ifnonnull 116
      // 0f0: new com/finalshell/core/Mw2
      // 0f3: dup
      // 0f4: new java/lang/StringBuilder
      // 0f7: dup
      // 0f8: invokespecial java/lang/StringBuilder.<init> ()V
      // 0fb: sipush -17193
      // 0fe: sipush -13885
      // 101: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 104: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 107: iload 3
      // 108: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 10b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10e: invokespecial com/finalshell/core/Mw2.<init> (Ljava/lang/String;)V
      // 111: athrow
      // 112: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: aload 0
      // 117: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 11a: getfield jtermios/X.x I
      // 11d: getstatic jtermios/j.L I
      // 120: getstatic jtermios/j.Hs I
      // 123: ior
      // 124: bipush -1
      // 125: ixor
      // 126: iand
      // 127: istore 10
      // 129: aload 0
      // 12a: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 12d: getfield jtermios/X.n I
      // 130: getstatic jtermios/j.Hh I
      // 133: getstatic jtermios/j.D I
      // 136: ior
      // 137: getstatic jtermios/j.b I
      // 13a: ior
      // 13b: bipush -1
      // 13c: ixor
      // 13d: iand
      // 13e: istore 11
      // 140: iload 4
      // 142: tableswitch 130 0 4 34 59 46 80 109
      // 164: aload 5
      // 166: ifnonnull 1eb
      // 169: goto 170
      // 16c: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16f: athrow
      // 170: iload 11
      // 172: getstatic jtermios/j.Hh I
      // 175: ior
      // 176: istore 11
      // 178: aload 5
      // 17a: ifnonnull 1eb
      // 17d: iload 11
      // 17f: getstatic jtermios/j.Hh I
      // 182: ior
      // 183: istore 11
      // 185: iload 11
      // 187: getstatic jtermios/j.b I
      // 18a: ior
      // 18b: istore 11
      // 18d: aload 5
      // 18f: ifnonnull 1eb
      // 192: iload 11
      // 194: getstatic jtermios/j.Hh I
      // 197: ior
      // 198: istore 11
      // 19a: iload 11
      // 19c: getstatic jtermios/j.D I
      // 19f: ior
      // 1a0: istore 11
      // 1a2: iload 11
      // 1a4: getstatic jtermios/j.b I
      // 1a7: ior
      // 1a8: istore 11
      // 1aa: aload 5
      // 1ac: ifnonnull 1eb
      // 1af: iload 11
      // 1b1: getstatic jtermios/j.Hh I
      // 1b4: ior
      // 1b5: istore 11
      // 1b7: iload 11
      // 1b9: getstatic jtermios/j.D I
      // 1bc: ior
      // 1bd: istore 11
      // 1bf: aload 5
      // 1c1: ifnonnull 1eb
      // 1c4: new com/finalshell/core/Mw2
      // 1c7: dup
      // 1c8: new java/lang/StringBuilder
      // 1cb: dup
      // 1cc: invokespecial java/lang/StringBuilder.<init> ()V
      // 1cf: sipush -17210
      // 1d2: sipush -17708
      // 1d5: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 1d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1db: iload 4
      // 1dd: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1e0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1e3: invokespecial com/finalshell/core/Mw2.<init> (Ljava/lang/String;)V
      // 1e6: athrow
      // 1e7: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ea: athrow
      // 1eb: iload 11
      // 1ed: getstatic jtermios/j.HA I
      // 1f0: bipush -1
      // 1f1: ixor
      // 1f2: iand
      // 1f3: istore 11
      // 1f5: iload 11
      // 1f7: iload 8
      // 1f9: ior
      // 1fa: istore 11
      // 1fc: iload 9
      // 1fe: bipush 2
      // 1ff: aload 5
      // 201: ifnull 229
      // 204: if_icmpne 21b
      // 207: goto 20e
      // 20a: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20d: athrow
      // 20e: iload 11
      // 210: getstatic jtermios/j.N I
      // 213: ior
      // 214: istore 11
      // 216: aload 5
      // 218: ifnonnull 22c
      // 21b: iload 11
      // 21d: getstatic jtermios/j.N I
      // 220: bipush -1
      // 221: ixor
      // 222: goto 229
      // 225: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 228: athrow
      // 229: iand
      // 22a: istore 11
      // 22c: aload 0
      // 22d: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 230: iload 11
      // 232: putfield jtermios/X.n I
      // 235: aload 0
      // 236: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 239: iload 10
      // 23b: putfield jtermios/X.x I
      // 23e: aload 0
      // 23f: aload 5
      // 241: ifnull 281
      // 244: getfield com/finalshell/core/X3_3.j I
      // 247: getstatic jtermios/j.H4 I
      // 24a: aload 0
      // 24b: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 24e: invokestatic jtermios/j.l (IILjtermios/X;)I
      // 251: ifeq 270
      // 254: goto 25b
      // 257: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25a: athrow
      // 25b: new com/finalshell/core/Mw2
      // 25e: dup
      // 25f: sipush -17178
      // 262: sipush 19659
      // 265: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 268: invokespecial com/finalshell/core/Mw2.<init> (Ljava/lang/String;)V
      // 26b: athrow
      // 26c: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26f: athrow
      // 270: aload 0
      // 271: iload 1
      // 272: putfield com/finalshell/core/X3_3.k I
      // 275: aload 0
      // 276: iload 4
      // 278: putfield com/finalshell/core/X3_3.o I
      // 27b: aload 0
      // 27c: iload 2
      // 27d: putfield com/finalshell/core/X3_3.Y I
      // 280: aload 0
      // 281: iload 3
      // 282: putfield com/finalshell/core/X3_3.N I
      // 285: goto 2ed
      // 288: astore 8
      // 28a: aload 0
      // 28b: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 28e: aload 7
      // 290: invokevirtual jtermios/X.P (Ljtermios/X;)V
      // 293: aload 0
      // 294: aload 0
      // 295: getfield com/finalshell/core/X3_3.j I
      // 298: getstatic jtermios/j.H4 I
      // 29b: aload 0
      // 29c: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 29f: invokestatic jtermios/j.l (IILjtermios/X;)I
      // 2a2: invokespecial com/finalshell/core/X3_3.C (I)V
      // 2a5: aload 8
      // 2a7: athrow
      // 2a8: astore 8
      // 2aa: aload 0
      // 2ab: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 2ae: aload 7
      // 2b0: invokevirtual jtermios/X.P (Ljtermios/X;)V
      // 2b3: aload 0
      // 2b4: aload 0
      // 2b5: getfield com/finalshell/core/X3_3.j I
      // 2b8: getstatic jtermios/j.H4 I
      // 2bb: aload 0
      // 2bc: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 2bf: invokestatic jtermios/j.l (IILjtermios/X;)I
      // 2c2: invokespecial com/finalshell/core/X3_3.C (I)V
      // 2c5: aload 8
      // 2c7: aload 5
      // 2c9: ifnull 2e2
      // 2cc: instanceof com/finalshell/core/Xb2_2
      // 2cf: ifeq 2e3
      // 2d2: goto 2d9
      // 2d5: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d8: athrow
      // 2d9: aload 8
      // 2db: goto 2e2
      // 2de: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e1: athrow
      // 2e2: athrow
      // 2e3: new com/finalshell/core/Xb2_2
      // 2e6: dup
      // 2e7: aload 8
      // 2e9: invokespecial com/finalshell/core/Xb2_2.<init> (Ljava/lang/Exception;)V
      // 2ec: athrow
      // 2ed: aload 6
      // 2ef: monitorexit
      // 2f0: goto 2fb
      // 2f3: astore 12
      // 2f5: aload 6
      // 2f7: monitorexit
      // 2f8: aload 12
      // 2fa: athrow
      // 2fb: return
   }

   public int j() {
      return this.j;
   }

   @Override
   public synchronized OutputStream E$OutputStream() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: invokespecial com/finalshell/core/X3_3.Q ()V
      // 07: astore 1
      // 08: aload 0
      // 09: getfield com/finalshell/core/X3_3.i Ljava/io/OutputStream;
      // 0c: aload 1
      // 0d: ifnull 31
      // 10: ifnonnull 2d
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: aload 0
      // 1b: new com/finalshell/io/Az2
      // 1e: dup
      // 1f: aload 0
      // 20: invokespecial com/finalshell/io/Az2.<init> (Lcom/finalshell/core/X3_3;)V
      // 23: putfield com/finalshell/core/X3_3.i Ljava/io/OutputStream;
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield com/finalshell/core/X3_3.i Ljava/io/OutputStream;
      // 31: areturn
   }

   @Override
   public synchronized InputStream S$InputStream() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: invokespecial com/finalshell/core/X3_3.Q ()V
      // 07: astore 1
      // 08: aload 0
      // 09: getfield com/finalshell/core/X3_3.g Ljava/io/InputStream;
      // 0c: aload 1
      // 0d: ifnull 31
      // 10: ifnonnull 2d
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: aload 0
      // 1b: new com/finalshell/io/Tv4
      // 1e: dup
      // 1f: aload 0
      // 20: invokespecial com/finalshell/io/Tv4.<init> (Lcom/finalshell/core/X3_3;)V
      // 23: putfield com/finalshell/core/X3_3.g Ljava/io/InputStream;
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield com/finalshell/core/X3_3.g Ljava/io/InputStream;
      // 31: areturn
   }

   public synchronized int q$int() {
      this.Q();
      return 0;
   }

   @Override
   public synchronized int L() {
      this.Q();
      return this.f;
   }

   @Override
   public synchronized int E$int() {
      this.Q();
      return this.X;
   }

   @Override
   public synchronized boolean l() {
      this.Q();
      return false;
   }

   @Override
   public synchronized boolean x() {
      this.Q();
      return this.v;
   }

   @Override
   public synchronized boolean V() {
      this.Q();
      return this.D;
   }

   @Override
   public synchronized void A(int var1) {
      this.Q();
   }

   @Override
   public synchronized void Z(int var1) {
      this.Q();
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
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/X3_3.A Z
      // 08: aload 1
      // 09: ifnull 29
      // 0c: ifeq 2a
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/X3_3.n I
      // 1a: aload 0
      // 1b: getfield com/finalshell/core/X3_3.W [B
      // 1e: bipush 1
      // 1f: invokestatic jtermios/j.s (I[BI)I
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: pop
      // 2a: return
   }

   public synchronized void W$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aload 0
      // 004: getfield com/finalshell/core/X3_3.j I
      // 007: istore 2
      // 008: astore 1
      // 009: aload 1
      // 00a: ifnull 025
      // 00d: iload 2
      // 00e: bipush -1
      // 00f: if_icmpeq 374
      // 012: goto 019
      // 015: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 018: athrow
      // 019: aload 0
      // 01a: bipush -1
      // 01b: putfield com/finalshell/core/X3_3.j I
      // 01e: goto 025
      // 021: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: aload 0
      // 026: aload 1
      // 027: ifnull 046
      // 02a: getfield com/finalshell/core/X3_3.g Ljava/io/InputStream;
      // 02d: ifnull 045
      // 030: goto 037
      // 033: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 036: athrow
      // 037: aload 0
      // 038: getfield com/finalshell/core/X3_3.g Ljava/io/InputStream;
      // 03b: invokevirtual java/io/InputStream.close ()V
      // 03e: goto 045
      // 041: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 044: athrow
      // 045: aload 0
      // 046: aconst_null
      // 047: putfield com/finalshell/core/X3_3.g Ljava/io/InputStream;
      // 04a: goto 0a6
      // 04d: astore 3
      // 04e: getstatic jtermios/B.d Z
      // 051: aload 1
      // 052: ifnull 07e
      // 055: ifeq 090
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05e: athrow
      // 05f: bipush 1
      // 060: sipush -17214
      // 063: sipush -2590
      // 066: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 069: bipush 1
      // 06a: anewarray 374
      // 06d: dup
      // 06e: bipush 0
      // 06f: aload 3
      // 070: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 073: aastore
      // 074: invokestatic jtermios/B.U (ILjava/lang/String;[Ljava/lang/Object;)Z
      // 077: goto 07e
      // 07a: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07d: athrow
      // 07e: aload 1
      // 07f: ifnull 08d
      // 082: ifeq 090
      // 085: goto 08c
      // 088: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08b: athrow
      // 08c: bipush 1
      // 08d: goto 091
      // 090: bipush 0
      // 091: putstatic jtermios/B.d Z
      // 094: aload 0
      // 095: aconst_null
      // 096: putfield com/finalshell/core/X3_3.g Ljava/io/InputStream;
      // 099: goto 0a6
      // 09c: astore 4
      // 09e: aload 0
      // 09f: aconst_null
      // 0a0: putfield com/finalshell/core/X3_3.g Ljava/io/InputStream;
      // 0a3: aload 4
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: aload 1
      // 0a8: ifnull 0c7
      // 0ab: getfield com/finalshell/core/X3_3.i Ljava/io/OutputStream;
      // 0ae: ifnull 0c6
      // 0b1: goto 0b8
      // 0b4: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: getfield com/finalshell/core/X3_3.i Ljava/io/OutputStream;
      // 0bc: invokevirtual java/io/OutputStream.close ()V
      // 0bf: goto 0c6
      // 0c2: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: aconst_null
      // 0c8: putfield com/finalshell/core/X3_3.i Ljava/io/OutputStream;
      // 0cb: goto 127
      // 0ce: astore 3
      // 0cf: getstatic jtermios/B.d Z
      // 0d2: aload 1
      // 0d3: ifnull 0ff
      // 0d6: ifeq 111
      // 0d9: goto 0e0
      // 0dc: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df: athrow
      // 0e0: bipush 1
      // 0e1: sipush -17206
      // 0e4: sipush 23068
      // 0e7: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 0ea: bipush 1
      // 0eb: anewarray 374
      // 0ee: dup
      // 0ef: bipush 0
      // 0f0: aload 3
      // 0f1: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 0f4: aastore
      // 0f5: invokestatic jtermios/B.U (ILjava/lang/String;[Ljava/lang/Object;)Z
      // 0f8: goto 0ff
      // 0fb: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fe: athrow
      // 0ff: aload 1
      // 100: ifnull 10e
      // 103: ifeq 111
      // 106: goto 10d
      // 109: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10c: athrow
      // 10d: bipush 1
      // 10e: goto 112
      // 111: bipush 0
      // 112: putstatic jtermios/B.d Z
      // 115: aload 0
      // 116: aconst_null
      // 117: putfield com/finalshell/core/X3_3.i Ljava/io/OutputStream;
      // 11a: goto 127
      // 11d: astore 5
      // 11f: aload 0
      // 120: aconst_null
      // 121: putfield com/finalshell/core/X3_3.i Ljava/io/OutputStream;
      // 124: aload 5
      // 126: athrow
      // 127: aload 0
      // 128: invokespecial com/finalshell/core/X3_3.y ()V
      // 12b: iload 2
      // 12c: getstatic jtermios/j.i I
      // 12f: bipush 0
      // 130: invokestatic jtermios/j.f (III)I
      // 133: istore 3
      // 134: iload 3
      // 135: getstatic jtermios/j.J I
      // 138: ior
      // 139: istore 3
      // 13a: iload 2
      // 13b: getstatic jtermios/j.Hw I
      // 13e: iload 3
      // 13f: invokestatic jtermios/j.f (III)I
      // 142: istore 4
      // 144: iload 4
      // 146: aload 1
      // 147: ifnull 157
      // 14a: ifeq 1b2
      // 14d: goto 154
      // 150: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 153: athrow
      // 154: getstatic jtermios/B.d Z
      // 157: aload 1
      // 158: ifnull 19c
      // 15b: ifeq 1ae
      // 15e: goto 165
      // 161: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 164: athrow
      // 165: bipush 1
      // 166: sipush -17209
      // 169: sipush 17205
      // 16c: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 16f: bipush 4
      // 170: anewarray 374
      // 173: dup
      // 174: bipush 0
      // 175: iload 2
      // 176: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 179: aastore
      // 17a: dup
      // 17b: bipush 1
      // 17c: getstatic jtermios/j.Hw I
      // 17f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 182: aastore
      // 183: dup
      // 184: bipush 2
      // 185: iload 3
      // 186: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 189: aastore
      // 18a: dup
      // 18b: bipush 3
      // 18c: iload 4
      // 18e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 191: aastore
      // 192: invokestatic jtermios/B.U (ILjava/lang/String;[Ljava/lang/Object;)Z
      // 195: goto 19c
      // 198: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19b: athrow
      // 19c: aload 1
      // 19d: ifnull 1ab
      // 1a0: ifeq 1ae
      // 1a3: goto 1aa
      // 1a6: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a9: athrow
      // 1aa: bipush 1
      // 1ab: goto 1af
      // 1ae: bipush 0
      // 1af: putstatic jtermios/B.d Z
      // 1b2: aload 0
      // 1b3: getfield com/finalshell/core/X3_3.J Ljava/lang/Thread;
      // 1b6: aload 1
      // 1b7: ifnull 1cf
      // 1ba: ifnull 1d2
      // 1bd: goto 1c4
      // 1c0: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c3: athrow
      // 1c4: aload 0
      // 1c5: getfield com/finalshell/core/X3_3.J Ljava/lang/Thread;
      // 1c8: goto 1cf
      // 1cb: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ce: athrow
      // 1cf: invokevirtual java/lang/Thread.interrupt ()V
      // 1d2: iload 2
      // 1d3: invokestatic jtermios/j.m (I)I
      // 1d6: istore 5
      // 1d8: iload 5
      // 1da: aload 1
      // 1db: ifnull 243
      // 1de: ifge 23f
      // 1e1: goto 1e8
      // 1e4: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e7: athrow
      // 1e8: getstatic jtermios/B.d Z
      // 1eb: aload 1
      // 1ec: ifnull 229
      // 1ef: goto 1f6
      // 1f2: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f5: athrow
      // 1f6: ifeq 23b
      // 1f9: goto 200
      // 1fc: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ff: athrow
      // 200: bipush 1
      // 201: sipush -17200
      // 204: sipush -12002
      // 207: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 20a: bipush 2
      // 20b: anewarray 374
      // 20e: dup
      // 20f: bipush 0
      // 210: iload 5
      // 212: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 215: aastore
      // 216: dup
      // 217: bipush 1
      // 218: invokestatic jtermios/j.z ()I
      // 21b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 21e: aastore
      // 21f: invokestatic jtermios/B.U (ILjava/lang/String;[Ljava/lang/Object;)Z
      // 222: goto 229
      // 225: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 228: athrow
      // 229: aload 1
      // 22a: ifnull 238
      // 22d: ifeq 23b
      // 230: goto 237
      // 233: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 236: athrow
      // 237: bipush 1
      // 238: goto 23c
      // 23b: bipush 0
      // 23c: putstatic jtermios/B.d Z
      // 23f: aload 0
      // 240: getfield com/finalshell/core/X3_3.A Z
      // 243: aload 1
      // 244: ifnull 25c
      // 247: ifeq 32a
      // 24a: goto 251
      // 24d: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 250: athrow
      // 251: aload 0
      // 252: getfield com/finalshell/core/X3_3.x I
      // 255: invokestatic jtermios/j.m (I)I
      // 258: istore 5
      // 25a: iload 5
      // 25c: aload 1
      // 25d: ifnull 2cc
      // 260: ifge 2c1
      // 263: goto 26a
      // 266: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 269: athrow
      // 26a: getstatic jtermios/B.d Z
      // 26d: aload 1
      // 26e: ifnull 2ab
      // 271: goto 278
      // 274: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 277: athrow
      // 278: ifeq 2bd
      // 27b: goto 282
      // 27e: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 281: athrow
      // 282: bipush 1
      // 283: sipush -17185
      // 286: sipush 27101
      // 289: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 28c: bipush 2
      // 28d: anewarray 374
      // 290: dup
      // 291: bipush 0
      // 292: iload 5
      // 294: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 297: aastore
      // 298: dup
      // 299: bipush 1
      // 29a: invokestatic jtermios/j.z ()I
      // 29d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2a0: aastore
      // 2a1: invokestatic jtermios/B.U (ILjava/lang/String;[Ljava/lang/Object;)Z
      // 2a4: goto 2ab
      // 2a7: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2aa: athrow
      // 2ab: aload 1
      // 2ac: ifnull 2ba
      // 2af: ifeq 2bd
      // 2b2: goto 2b9
      // 2b5: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b8: athrow
      // 2b9: bipush 1
      // 2ba: goto 2be
      // 2bd: bipush 0
      // 2be: putstatic jtermios/B.d Z
      // 2c1: aload 0
      // 2c2: getfield com/finalshell/core/X3_3.n I
      // 2c5: invokestatic jtermios/j.m (I)I
      // 2c8: istore 5
      // 2ca: iload 5
      // 2cc: aload 1
      // 2cd: ifnull 2dd
      // 2d0: ifge 32a
      // 2d3: goto 2da
      // 2d6: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d9: athrow
      // 2da: getstatic jtermios/B.d Z
      // 2dd: aload 1
      // 2de: ifnull 314
      // 2e1: ifeq 326
      // 2e4: goto 2eb
      // 2e7: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ea: athrow
      // 2eb: bipush 1
      // 2ec: sipush -17185
      // 2ef: sipush 27101
      // 2f2: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 2f5: bipush 2
      // 2f6: anewarray 374
      // 2f9: dup
      // 2fa: bipush 0
      // 2fb: iload 5
      // 2fd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 300: aastore
      // 301: dup
      // 302: bipush 1
      // 303: invokestatic jtermios/j.z ()I
      // 306: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 309: aastore
      // 30a: invokestatic jtermios/B.U (ILjava/lang/String;[Ljava/lang/Object;)Z
      // 30d: goto 314
      // 310: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 313: athrow
      // 314: aload 1
      // 315: ifnull 323
      // 318: ifeq 326
      // 31b: goto 322
      // 31e: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 321: athrow
      // 322: bipush 1
      // 323: goto 327
      // 326: bipush 0
      // 327: putstatic jtermios/B.d Z
      // 32a: invokestatic java/lang/System.currentTimeMillis ()J
      // 32d: lstore 6
      // 32f: aload 0
      // 330: getfield com/finalshell/core/X3_3.w Z
      // 333: ifeq 370
      // 336: sipush 21233
      // 339: ldc2_w 936002773627529962
      // 33c: invokestatic com/finalshell/core/X3_3.b (IJ)J
      // 33f: invokestatic java/lang/Thread.sleep (J)V
      // 342: aload 1
      // 343: ifnull 374
      // 346: invokestatic java/lang/System.currentTimeMillis ()J
      // 349: lload 6
      // 34b: lsub
      // 34c: sipush 22830
      // 34f: ldc2_w 4374373006293819702
      // 352: invokestatic com/finalshell/core/X3_3.b (IJ)J
      // 355: lcmp
      // 356: ifle 364
      // 359: goto 360
      // 35c: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35f: athrow
      // 360: aload 1
      // 361: ifnonnull 370
      // 364: goto 32f
      // 367: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36a: athrow
      // 36b: astore 8
      // 36d: goto 370
      // 370: aload 0
      // 371: invokespecial com/finalshell/core/XJ_2.W ()V
      // 374: return
   }

   X3_3(String param1, int param2) throws O {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aload 0
      // 004: invokespecial com/finalshell/core/XJ_2.<init> ()V
      // 007: astore 3
      // 008: aload 0
      // 009: bipush -1
      // 00a: putfield com/finalshell/core/X3_3.j I
      // 00d: aload 0
      // 00e: bipush 0
      // 00f: putfield com/finalshell/core/X3_3.A Z
      // 012: aload 0
      // 013: bipush 0
      // 014: putfield com/finalshell/core/X3_3.n I
      // 017: aload 0
      // 018: bipush 0
      // 019: putfield com/finalshell/core/X3_3.x I
      // 01c: aload 0
      // 01d: bipush 1
      // 01e: newarray 8
      // 020: dup
      // 021: bipush 0
      // 022: bipush 0
      // 023: bastore
      // 024: putfield com/finalshell/core/X3_3.W [B
      // 027: aload 0
      // 028: new java/lang/Object
      // 02b: dup
      // 02c: invokespecial java/lang/Object.<init> ()V
      // 02f: putfield com/finalshell/core/X3_3.h Ljava/lang/Object;
      // 032: aload 0
      // 033: bipush 1
      // 034: putfield com/finalshell/core/X3_3.I Z
      // 037: aload 0
      // 038: bipush 1
      // 039: newarray 10
      // 03b: dup
      // 03c: bipush 0
      // 03d: bipush 0
      // 03e: iastore
      // 03f: putfield com/finalshell/core/X3_3.u [I
      // 042: aload 0
      // 043: new jtermios/X
      // 046: dup
      // 047: invokespecial jtermios/X.<init> ()V
      // 04a: putfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 04d: bipush 0
      // 04e: istore 4
      // 050: invokestatic jtermios/j.x ()Z
      // 053: aload 3
      // 054: ifnull 12e
      // 057: ifeq 106
      // 05a: goto 061
      // 05d: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 060: athrow
      // 061: sipush -17216
      // 064: sipush 13092
      // 067: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 06a: astore 5
      // 06c: sipush -17187
      // 06f: sipush 9581
      // 072: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 075: astore 6
      // 077: aload 5
      // 079: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 07c: aload 3
      // 07d: ifnull 0ea
      // 080: ifnull 0de
      // 083: goto 08a
      // 086: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 089: athrow
      // 08a: aload 5
      // 08c: invokestatic java/lang/Boolean.getBoolean (Ljava/lang/String;)Z
      // 08f: istore 4
      // 091: getstatic jtermios/B.d Z
      // 094: aload 3
      // 095: ifnull 0c4
      // 098: ifeq 0d6
      // 09b: goto 0a2
      // 09e: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a1: athrow
      // 0a2: bipush 1
      // 0a3: sipush -17211
      // 0a6: sipush 12379
      // 0a9: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 0ac: bipush 2
      // 0ad: anewarray 374
      // 0b0: dup
      // 0b1: bipush 0
      // 0b2: aload 5
      // 0b4: aastore
      // 0b5: dup
      // 0b6: bipush 1
      // 0b7: aload 6
      // 0b9: aastore
      // 0ba: invokestatic jtermios/B.U (ILjava/lang/String;[Ljava/lang/Object;)Z
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c3: athrow
      // 0c4: aload 3
      // 0c5: ifnull 0d3
      // 0c8: ifeq 0d6
      // 0cb: goto 0d2
      // 0ce: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d1: athrow
      // 0d2: bipush 1
      // 0d3: goto 0d7
      // 0d6: bipush 0
      // 0d7: putstatic jtermios/B.d Z
      // 0da: aload 3
      // 0db: ifnonnull 106
      // 0de: aload 6
      // 0e0: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 0e3: goto 0ea
      // 0e6: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9: athrow
      // 0ea: aload 3
      // 0eb: ifnull 0fa
      // 0ee: ifnull 103
      // 0f1: goto 0f8
      // 0f4: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f7: athrow
      // 0f8: aload 6
      // 0fa: invokestatic java/lang/Boolean.getBoolean (Ljava/lang/String;)Z
      // 0fd: istore 4
      // 0ff: aload 3
      // 100: ifnonnull 106
      // 103: bipush 1
      // 104: istore 4
      // 106: aload 0
      // 107: iload 4
      // 109: putfield com/finalshell/core/X3_3.e Z
      // 10c: aload 0
      // 10d: sipush -17202
      // 110: sipush 12476
      // 113: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 116: invokestatic java/lang/Boolean.getBoolean (Ljava/lang/String;)Z
      // 119: putfield com/finalshell/core/X3_3.U Z
      // 11c: aload 0
      // 11d: aload 1
      // 11e: putfield com/finalshell/core/X3_3.m Ljava/lang/String;
      // 121: iload 2
      // 122: bipush 5
      // 123: iadd
      // 124: sipush 2153
      // 127: ldc2_w 2313366625087860385
      // 12a: invokestatic com/finalshell/core/X3_3.a (IJ)I
      // 12d: idiv
      // 12e: istore 5
      // 130: aload 0
      // 131: aload 1
      // 132: getstatic jtermios/j.HV I
      // 135: getstatic jtermios/j.z I
      // 138: ior
      // 139: getstatic jtermios/j.J I
      // 13c: ior
      // 13d: invokestatic jtermios/j.D (Ljava/lang/String;I)I
      // 140: dup_x1
      // 141: putfield com/finalshell/core/X3_3.j I
      // 144: ifge 193
      // 147: invokestatic jtermios/j.z ()I
      // 14a: istore 6
      // 14c: sipush 13714
      // 14f: ldc2_w 5187370608266153355
      // 152: invokestatic com/finalshell/core/X3_3.b (IJ)J
      // 155: invokestatic java/lang/Thread.sleep (J)V
      // 158: aload 3
      // 159: ifnull 1bc
      // 15c: goto 170
      // 15f: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 162: athrow
      // 163: astore 7
      // 165: aload 7
      // 167: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 16a: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // 16d: invokevirtual java/lang/Thread.interrupt ()V
      // 170: iload 5
      // 172: iinc 5 -1
      // 175: ifge 18f
      // 178: new com/finalshell/core/O
      // 17b: dup
      // 17c: sipush -17207
      // 17f: sipush 3654
      // 182: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 185: iload 6
      // 187: invokespecial com/finalshell/core/O.<init> (Ljava/lang/String;I)V
      // 18a: athrow
      // 18b: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18e: athrow
      // 18f: aload 3
      // 190: ifnonnull 130
      // 193: aload 0
      // 194: sipush -17205
      // 197: sipush 9841
      // 19a: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 19d: sipush 13405
      // 1a0: ldc2_w 6298581611133801108
      // 1a3: invokestatic com/finalshell/core/X3_3.a (IJ)I
      // 1a6: invokestatic java/lang/Integer.getInteger (Ljava/lang/String;I)Ljava/lang/Integer;
      // 1a9: invokevirtual java/lang/Integer.intValue ()I
      // 1ac: putfield com/finalshell/core/X3_3.Q I
      // 1af: aload 0
      // 1b0: getfield com/finalshell/core/X3_3.j I
      // 1b3: getstatic jtermios/j.i I
      // 1b6: bipush 0
      // 1b7: invokestatic jtermios/j.f (III)I
      // 1ba: istore 6
      // 1bc: iload 6
      // 1be: aload 3
      // 1bf: ifnull 22e
      // 1c2: ifge 1d9
      // 1c5: goto 1cc
      // 1c8: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cb: athrow
      // 1cc: aload 0
      // 1cd: iload 6
      // 1cf: invokespecial com/finalshell/core/X3_3.C (I)V
      // 1d2: goto 1d9
      // 1d5: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d8: athrow
      // 1d9: iload 6
      // 1db: getstatic jtermios/j.J I
      // 1de: bipush -1
      // 1df: ixor
      // 1e0: iand
      // 1e1: istore 6
      // 1e3: aload 0
      // 1e4: aload 0
      // 1e5: getfield com/finalshell/core/X3_3.j I
      // 1e8: getstatic jtermios/j.Hw I
      // 1eb: iload 6
      // 1ed: invokestatic jtermios/j.f (III)I
      // 1f0: invokespecial com/finalshell/core/X3_3.C (I)V
      // 1f3: aload 0
      // 1f4: bipush 6
      // 1f6: ldc2_w 8599883641492678348
      // 1f9: invokestatic com/finalshell/core/X3_3.a (IJ)I
      // 1fc: putfield com/finalshell/core/X3_3.k I
      // 1ff: aload 0
      // 200: sipush 4530
      // 203: ldc2_w 427478883450926974
      // 206: invokestatic com/finalshell/core/X3_3.a (IJ)I
      // 209: putfield com/finalshell/core/X3_3.Y I
      // 20c: aload 0
      // 20d: bipush 0
      // 20e: putfield com/finalshell/core/X3_3.q I
      // 211: aload 0
      // 212: bipush 0
      // 213: putfield com/finalshell/core/X3_3.o I
      // 216: aload 0
      // 217: bipush 1
      // 218: putfield com/finalshell/core/X3_3.N I
      // 21b: aload 0
      // 21c: aload 0
      // 21d: getfield com/finalshell/core/X3_3.j I
      // 220: aload 0
      // 221: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 224: invokestatic jtermios/j.T (ILjtermios/X;)I
      // 227: invokespecial com/finalshell/core/X3_3.C (I)V
      // 22a: aload 0
      // 22b: getfield com/finalshell/core/X3_3.j I
      // 22e: aload 0
      // 22f: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 232: invokestatic jtermios/j.H (ILjtermios/X;)V
      // 235: aload 0
      // 236: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 239: dup
      // 23a: getfield jtermios/X.n I
      // 23d: getstatic jtermios/j.HN I
      // 240: getstatic jtermios/j.r I
      // 243: ior
      // 244: ior
      // 245: putfield jtermios/X.n I
      // 248: aload 0
      // 249: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 24c: dup
      // 24d: getfield jtermios/X.j I
      // 250: getstatic jtermios/j.HW I
      // 253: getstatic jtermios/j.HJ I
      // 256: ior
      // 257: getstatic jtermios/j.Hp I
      // 25a: ior
      // 25b: getstatic jtermios/j.X I
      // 25e: ior
      // 25f: bipush -1
      // 260: ixor
      // 261: iand
      // 262: putfield jtermios/X.j I
      // 265: aload 0
      // 266: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 269: dup
      // 26a: getfield jtermios/X.E I
      // 26d: getstatic jtermios/j.e I
      // 270: bipush -1
      // 271: ixor
      // 272: iand
      // 273: putfield jtermios/X.E I
      // 276: aload 0
      // 277: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 27a: getfield jtermios/X.L [B
      // 27d: getstatic jtermios/j.HS I
      // 280: getstatic jtermios/j.E I
      // 283: i2b
      // 284: bastore
      // 285: aload 0
      // 286: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 289: getfield jtermios/X.L [B
      // 28c: getstatic jtermios/j.HR I
      // 28f: getstatic jtermios/j.y I
      // 292: i2b
      // 293: bastore
      // 294: aload 0
      // 295: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 298: getfield jtermios/X.L [B
      // 29b: getstatic jtermios/j.HL I
      // 29e: bipush 0
      // 29f: bastore
      // 2a0: aload 0
      // 2a1: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 2a4: getfield jtermios/X.L [B
      // 2a7: getstatic jtermios/j.HQ I
      // 2aa: bipush 0
      // 2ab: bastore
      // 2ac: aload 0
      // 2ad: aload 0
      // 2ae: getfield com/finalshell/core/X3_3.j I
      // 2b1: getstatic jtermios/j.H4 I
      // 2b4: aload 0
      // 2b5: getfield com/finalshell/core/X3_3.Z Ljtermios/X;
      // 2b8: invokestatic jtermios/j.l (IILjtermios/X;)I
      // 2bb: invokespecial com/finalshell/core/X3_3.C (I)V
      // 2be: aload 0
      // 2bf: aload 0
      // 2c0: getfield com/finalshell/core/X3_3.k I
      // 2c3: aload 0
      // 2c4: getfield com/finalshell/core/X3_3.Y I
      // 2c7: aload 0
      // 2c8: getfield com/finalshell/core/X3_3.N I
      // 2cb: aload 0
      // 2cc: getfield com/finalshell/core/X3_3.o I
      // 2cf: invokevirtual com/finalshell/core/X3_3.M (IIII)V
      // 2d2: goto 2dc
      // 2d5: astore 7
      // 2d7: aload 7
      // 2d9: invokevirtual com/finalshell/core/Mw2.printStackTrace ()V
      // 2dc: aload 0
      // 2dd: bipush 0
      // 2de: invokevirtual com/finalshell/core/X3_3.R (I)V
      // 2e1: goto 2eb
      // 2e4: astore 7
      // 2e6: aload 7
      // 2e8: invokevirtual com/finalshell/core/Mw2.printStackTrace ()V
      // 2eb: aload 0
      // 2ec: getfield com/finalshell/core/X3_3.j I
      // 2ef: getstatic jtermios/j.d I
      // 2f2: aload 0
      // 2f3: getfield com/finalshell/core/X3_3.u [I
      // 2f6: invokestatic jtermios/j.K (II[I)I
      // 2f9: istore 7
      // 2fb: iload 7
      // 2fd: aload 3
      // 2fe: ifnull 32a
      // 301: ifne 320
      // 304: goto 30b
      // 307: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30a: athrow
      // 30b: aload 0
      // 30c: aload 0
      // 30d: getfield com/finalshell/core/X3_3.u [I
      // 310: bipush 0
      // 311: iaload
      // 312: putfield com/finalshell/core/X3_3.y I
      // 315: aload 3
      // 316: ifnonnull 377
      // 319: goto 320
      // 31c: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31f: athrow
      // 320: getstatic jtermios/B.d Z
      // 323: goto 32a
      // 326: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 329: athrow
      // 32a: aload 3
      // 32b: ifnull 361
      // 32e: ifeq 373
      // 331: goto 338
      // 334: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 337: athrow
      // 338: bipush 1
      // 339: sipush -17196
      // 33c: sipush 1836
      // 33f: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 342: bipush 2
      // 343: anewarray 374
      // 346: dup
      // 347: bipush 0
      // 348: iload 7
      // 34a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 34d: aastore
      // 34e: dup
      // 34f: bipush 1
      // 350: invokestatic jtermios/j.z ()I
      // 353: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 356: aastore
      // 357: invokestatic jtermios/B.U (ILjava/lang/String;[Ljava/lang/Object;)Z
      // 35a: goto 361
      // 35d: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 360: athrow
      // 361: aload 3
      // 362: ifnull 370
      // 365: ifeq 373
      // 368: goto 36f
      // 36b: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36e: athrow
      // 36f: bipush 1
      // 370: goto 374
      // 373: bipush 0
      // 374: putstatic jtermios/B.d Z
      // 377: sipush -17201
      // 37a: sipush 27743
      // 37d: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 380: astore 8
      // 382: aload 8
      // 384: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 387: aload 3
      // 388: ifnull 397
      // 38b: ifnull 3a8
      // 38e: goto 395
      // 391: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 394: athrow
      // 395: aload 8
      // 397: invokestatic java/lang/Boolean.getBoolean (Ljava/lang/String;)Z
      // 39a: aload 3
      // 39b: ifnull 3a9
      // 39e: ifeq 3f9
      // 3a1: goto 3a8
      // 3a4: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a7: athrow
      // 3a8: bipush 2
      // 3a9: newarray 10
      // 3ab: astore 9
      // 3ad: aload 3
      // 3ae: ifnull 3dc
      // 3b1: aload 9
      // 3b3: invokestatic jtermios/j.w ([I)I
      // 3b6: ifne 3f9
      // 3b9: goto 3c0
      // 3bc: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3bf: athrow
      // 3c0: aload 0
      // 3c1: bipush 1
      // 3c2: putfield com/finalshell/core/X3_3.A Z
      // 3c5: aload 0
      // 3c6: aload 9
      // 3c8: bipush 0
      // 3c9: iaload
      // 3ca: putfield com/finalshell/core/X3_3.x I
      // 3cd: aload 0
      // 3ce: aload 9
      // 3d0: bipush 1
      // 3d1: iaload
      // 3d2: putfield com/finalshell/core/X3_3.n I
      // 3d5: goto 3dc
      // 3d8: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3db: athrow
      // 3dc: aload 0
      // 3dd: aload 0
      // 3de: getfield com/finalshell/core/X3_3.x I
      // 3e1: getstatic jtermios/j.Hw I
      // 3e4: aload 0
      // 3e5: getfield com/finalshell/core/X3_3.x I
      // 3e8: getstatic jtermios/j.i I
      // 3eb: bipush 0
      // 3ec: invokestatic jtermios/j.f (III)I
      // 3ef: getstatic jtermios/j.J I
      // 3f2: ior
      // 3f3: invokestatic jtermios/j.f (III)I
      // 3f6: invokespecial com/finalshell/core/X3_3.C (I)V
      // 3f9: new com/finalshell/task/Y72
      // 3fc: dup
      // 3fd: aload 0
      // 3fe: invokespecial com/finalshell/task/Y72.<init> (Lcom/finalshell/core/X3_3;)V
      // 401: astore 9
      // 403: aload 0
      // 404: new java/lang/Thread
      // 407: dup
      // 408: aload 9
      // 40a: aload 0
      // 40b: invokevirtual com/finalshell/core/X3_3.F ()Ljava/lang/String;
      // 40e: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;Ljava/lang/String;)V
      // 411: putfield com/finalshell/core/X3_3.J Ljava/lang/Thread;
      // 414: aload 0
      // 415: getfield com/finalshell/core/X3_3.J Ljava/lang/Thread;
      // 418: bipush 1
      // 419: invokevirtual java/lang/Thread.setDaemon (Z)V
      // 41c: return
   }

   public synchronized void X(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: invokespecial com/finalshell/core/X3_3.Q ()V
      // 07: astore 2
      // 08: aload 0
      // 09: aload 2
      // 0a: ifnull 3b
      // 0d: getfield com/finalshell/core/X3_3.j I
      // 10: getstatic jtermios/j.d I
      // 13: aload 0
      // 14: getfield com/finalshell/core/X3_3.u [I
      // 17: invokestatic jtermios/j.K (II[I)I
      // 1a: bipush -1
      // 1b: if_icmpne 3a
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: new com/finalshell/core/Xb2_2
      // 28: dup
      // 29: sipush -17215
      // 2c: sipush 16458
      // 2f: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 32: invokespecial com/finalshell/core/Xb2_2.<init> (Ljava/lang/String;)V
      // 35: athrow
      // 36: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: aload 0
      // 3b: aload 0
      // 3c: getfield com/finalshell/core/X3_3.u [I
      // 3f: bipush 0
      // 40: iaload
      // 41: iload 1
      // 42: iand
      // 43: aload 0
      // 44: getfield com/finalshell/core/X3_3.y I
      // 47: iload 1
      // 48: bipush -1
      // 49: ixor
      // 4a: iand
      // 4b: iadd
      // 4c: putfield com/finalshell/core/X3_3.y I
      // 4f: return
   }

   public synchronized boolean Y(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: invokespecial com/finalshell/core/X3_3.Q ()V
      // 07: astore 2
      // 08: aload 0
      // 09: getfield com/finalshell/core/X3_3.j I
      // 0c: getstatic jtermios/j.d I
      // 0f: aload 0
      // 10: getfield com/finalshell/core/X3_3.u [I
      // 13: invokestatic jtermios/j.K (II[I)I
      // 16: bipush -1
      // 17: aload 2
      // 18: ifnull 41
      // 1b: if_icmpne 3a
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: new com/finalshell/core/Xb2_2
      // 28: dup
      // 29: sipush -17204
      // 2c: sipush 4902
      // 2f: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 32: invokespecial com/finalshell/core/Xb2_2.<init> (Ljava/lang/String;)V
      // 35: athrow
      // 36: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield com/finalshell/core/X3_3.u [I
      // 3e: bipush 0
      // 3f: iaload
      // 40: iload 1
      // 41: iand
      // 42: aload 2
      // 43: ifnull 51
      // 46: ifeq 54
      // 49: goto 50
      // 4c: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: bipush 1
      // 51: goto 55
      // 54: bipush 0
      // 55: ireturn
   }

   public synchronized void p(int param1, boolean param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: invokespecial com/finalshell/core/X3_3.Q ()V
      // 07: astore 3
      // 08: aload 0
      // 09: getfield com/finalshell/core/X3_3.j I
      // 0c: getstatic jtermios/j.d I
      // 0f: aload 0
      // 10: getfield com/finalshell/core/X3_3.u [I
      // 13: invokestatic jtermios/j.K (II[I)I
      // 16: aload 3
      // 17: ifnull 3b
      // 1a: bipush -1
      // 1b: if_icmpne 3a
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: new com/finalshell/core/Xb2_2
      // 28: dup
      // 29: sipush -17215
      // 2c: sipush 16458
      // 2f: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 32: invokespecial com/finalshell/core/Xb2_2.<init> (Ljava/lang/String;)V
      // 35: athrow
      // 36: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: iload 2
      // 3b: ifeq 53
      // 3e: aload 0
      // 3f: getfield com/finalshell/core/X3_3.u [I
      // 42: bipush 0
      // 43: dup2
      // 44: iaload
      // 45: iload 1
      // 46: ior
      // 47: iastore
      // 48: aload 3
      // 49: ifnonnull 66
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: aload 0
      // 54: getfield com/finalshell/core/X3_3.u [I
      // 57: bipush 0
      // 58: dup2
      // 59: iaload
      // 5a: iload 1
      // 5b: bipush -1
      // 5c: ixor
      // 5d: iand
      // 5e: iastore
      // 5f: goto 66
      // 62: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: aload 0
      // 67: getfield com/finalshell/core/X3_3.j I
      // 6a: getstatic jtermios/j.Hz I
      // 6d: aload 0
      // 6e: getfield com/finalshell/core/X3_3.u [I
      // 71: invokestatic jtermios/j.K (II[I)I
      // 74: bipush -1
      // 75: if_icmpne 8d
      // 78: new com/finalshell/core/Xb2_2
      // 7b: dup
      // 7c: sipush -17198
      // 7f: sipush -23278
      // 82: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 85: invokespecial com/finalshell/core/Xb2_2.<init> (Ljava/lang/String;)V
      // 88: athrow
      // 89: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8c: athrow
      // 8d: return
   }

   public void r() {
      throw new Xb2_2(a(-17194, 25431) + this.j + a(-17188, 321));
   }

   public void Q() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 1e
      // 09: getfield com/finalshell/core/X3_3.j I
      // 0c: ifge 21
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: invokespecial com/finalshell/core/X3_3.r ()V
      // 21: return
   }

   public void C(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: iload 1
      // 05: ifeq f9
      // 08: sipush -17208
      // 0b: sipush -19733
      // 0e: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 11: bipush 2
      // 12: anewarray 374
      // 15: dup
      // 16: bipush 0
      // 17: iload 1
      // 18: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1b: aastore
      // 1c: dup
      // 1d: bipush 1
      // 1e: bipush 1
      // 1f: invokestatic jtermios/B.w (I)Ljava/lang/String;
      // 22: aastore
      // 23: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 26: astore 3
      // 27: getstatic jtermios/B.d Z
      // 2a: aload 2
      // 2b: ifnull 54
      // 2e: ifeq 66
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: bipush 1
      // 39: sipush -17203
      // 3c: sipush -4263
      // 3f: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 42: bipush 1
      // 43: anewarray 374
      // 46: dup
      // 47: bipush 0
      // 48: aload 3
      // 49: aastore
      // 4a: invokestatic jtermios/B.U (ILjava/lang/String;[Ljava/lang/Object;)Z
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: aload 2
      // 55: ifnull 63
      // 58: ifeq 66
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: bipush 1
      // 63: goto 67
      // 66: bipush 0
      // 67: putstatic jtermios/B.d Z
      // 6a: aload 0
      // 6b: invokevirtual com/finalshell/core/X3_3.W$void ()V
      // 6e: goto f0
      // 71: astore 4
      // 73: sipush -17212
      // 76: aload 4
      // 78: invokevirtual java/lang/Exception.getStackTrace ()[Ljava/lang/StackTraceElement;
      // 7b: bipush 0
      // 7c: aaload
      // 7d: astore 5
      // 7f: sipush -8788
      // 82: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // 85: bipush 3
      // 86: anewarray 374
      // 89: dup
      // 8a: bipush 0
      // 8b: aload 4
      // 8d: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 90: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 93: aastore
      // 94: dup
      // 95: bipush 1
      // 96: aload 5
      // 98: invokevirtual java/lang/StackTraceElement.getClassName ()Ljava/lang/String;
      // 9b: aastore
      // 9c: dup
      // 9d: bipush 2
      // 9e: aload 5
      // a0: invokevirtual java/lang/StackTraceElement.getLineNumber ()I
      // a3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a6: aastore
      // a7: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // aa: astore 6
      // ac: getstatic jtermios/B.d Z
      // af: aload 2
      // b0: ifnull da
      // b3: ifeq ec
      // b6: goto bd
      // b9: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bc: athrow
      // bd: bipush 1
      // be: sipush -17192
      // c1: sipush 27733
      // c4: invokestatic com/finalshell/core/X3_3.a (II)Ljava/lang/String;
      // c7: bipush 1
      // c8: anewarray 374
      // cb: dup
      // cc: bipush 0
      // cd: aload 6
      // cf: aastore
      // d0: invokestatic jtermios/B.U (ILjava/lang/String;[Ljava/lang/Object;)Z
      // d3: goto da
      // d6: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d9: athrow
      // da: aload 2
      // db: ifnull e9
      // de: ifeq ec
      // e1: goto e8
      // e4: invokestatic com/finalshell/core/X3_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e7: athrow
      // e8: bipush 1
      // e9: goto ed
      // ec: bipush 0
      // ed: putstatic jtermios/B.d Z
      // f0: new com/finalshell/core/Xb2_2
      // f3: dup
      // f4: aload 3
      // f5: invokespecial com/finalshell/core/Xb2_2.<init> (Ljava/lang/String;)V
      // f8: athrow
      // f9: return
   }

   public boolean a() {
      return this.w;
   }

   static void W(X3_3 var0) {
      var0.Q();
   }

   static int i(X3_3 var0) {
      return var0.j;
   }

   static boolean J(X3_3 var0, boolean var1) {
      return var0.K = var1;
   }

   static int Y$int(X3_3 var0) {
      return var0.x;
   }

   static boolean n$boolean(X3_3 var0) {
      return var0.A;
   }

   static boolean p(X3_3 var0) {
      return var0.I;
   }

   static Object n$Object(X3_3 var0) {
      return var0.h;
   }

   static boolean s(X3_3 var0) {
      return var0.D;
   }

   static int m(X3_3 var0) {
      return var0.H;
   }

   static boolean x(X3_3 var0) {
      return var0.v;
   }

   static int I(X3_3 var0) {
      return var0.f;
   }

   static jtermios.X P$X(X3_3 var0) {
      return var0.Z;
   }

   static void c(X3_3 var0, int var1) {
      var0.C(var1);
   }

   static boolean H(X3_3 var0, boolean var1) {
      return var0.I = var1;
   }

   static boolean z(X3_3 var0, boolean var1) {
      return var0.t = var1;
   }

   static int B(X3_3 var0) {
      return var0.X;
   }

   static boolean Y$boolean(X3_3 var0) {
      return var0.b;
   }

   static boolean o(X3_3 var0, boolean var1) {
      return var0.w = var1;
   }

   static boolean L(X3_3 var0) {
      return var0.T;
   }

   static boolean T(X3_3 var0) {
      return var0.t;
   }

   static boolean r(X3_3 var0) {
      return var0.V;
   }

   static boolean l(X3_3 var0) {
      return var0.K;
   }

   static boolean C(X3_3 var0) {
      return var0.c;
   }

   static boolean P$boolean(X3_3 var0) {
      return var0.r;
   }

   static boolean c(X3_3 var0) {
      return var0.F;
   }

   static boolean g(X3_3 var0) {
      return var0.S;
   }

   static FW3 U(X3_3 var0) {
      return var0.s;
   }

   static void w(X3_3 var0, boolean var1, boolean var2) {
      var0.K(var1, var2);
   }

   static void j(X3_3 var0) {
      var0.n();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -17209) & 65535;
      if (d[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 183;
               break;
            case 1:
               var10000 = 6;
               break;
            case 2:
               var10000 = 55;
               break;
            case 3:
               var10000 = 13;
               break;
            case 4:
               var10000 = 92;
               break;
            case 5:
               var10000 = 162;
               break;
            case 6:
               var10000 = 87;
               break;
            case 7:
               var10000 = 233;
               break;
            case 8:
               var10000 = 86;
               break;
            case 9:
               var10000 = 168;
               break;
            case 10:
               var10000 = 57;
               break;
            case 11:
               var10000 = 117;
               break;
            case 12:
               var10000 = 173;
               break;
            case 13:
               var10000 = 227;
               break;
            case 14:
               var10000 = 7;
               break;
            case 15:
               var10000 = 172;
               break;
            case 16:
               var10000 = 38;
               break;
            case 17:
               var10000 = 123;
               break;
            case 18:
               var10000 = 122;
               break;
            case 19:
               var10000 = 192;
               break;
            case 20:
               var10000 = 10;
               break;
            case 21:
               var10000 = 59;
               break;
            case 22:
               var10000 = 158;
               break;
            case 23:
               var10000 = 5;
               break;
            case 24:
               var10000 = 129;
               break;
            case 25:
               var10000 = 52;
               break;
            case 26:
               var10000 = 1;
               break;
            case 27:
               var10000 = 111;
               break;
            case 28:
               var10000 = 127;
               break;
            case 29:
               var10000 = 235;
               break;
            case 30:
               var10000 = 8;
               break;
            case 31:
               var10000 = 105;
               break;
            case 32:
               var10000 = 104;
               break;
            case 33:
               var10000 = 75;
               break;
            case 34:
               var10000 = 109;
               break;
            case 35:
               var10000 = 119;
               break;
            case 36:
               var10000 = 207;
               break;
            case 37:
               var10000 = 81;
               break;
            case 38:
               var10000 = 171;
               break;
            case 39:
               var10000 = 39;
               break;
            case 40:
               var10000 = 77;
               break;
            case 41:
               var10000 = 223;
               break;
            case 42:
               var10000 = 73;
               break;
            case 43:
               var10000 = 103;
               break;
            case 44:
               var10000 = 205;
               break;
            case 45:
               var10000 = 16;
               break;
            case 46:
               var10000 = 177;
               break;
            case 47:
               var10000 = 28;
               break;
            case 48:
               var10000 = 186;
               break;
            case 49:
               var10000 = 131;
               break;
            case 50:
               var10000 = 102;
               break;
            case 51:
               var10000 = 181;
               break;
            case 52:
               var10000 = 244;
               break;
            case 53:
               var10000 = 145;
               break;
            case 54:
               var10000 = 48;
               break;
            case 55:
               var10000 = 135;
               break;
            case 56:
               var10000 = 95;
               break;
            case 57:
               var10000 = 118;
               break;
            case 58:
               var10000 = 27;
               break;
            case 59:
               var10000 = 126;
               break;
            case 60:
               var10000 = 43;
               break;
            case 61:
               var10000 = 152;
               break;
            case 62:
               var10000 = 225;
               break;
            case 63:
               var10000 = 179;
               break;
            case 64:
               var10000 = 74;
               break;
            case 65:
               var10000 = 64;
               break;
            case 66:
               var10000 = 147;
               break;
            case 67:
               var10000 = 21;
               break;
            case 68:
               var10000 = 79;
               break;
            case 69:
               var10000 = 124;
               break;
            case 70:
               var10000 = 70;
               break;
            case 71:
               var10000 = 29;
               break;
            case 72:
               var10000 = 37;
               break;
            case 73:
               var10000 = 224;
               break;
            case 74:
               var10000 = 215;
               break;
            case 75:
               var10000 = 136;
               break;
            case 76:
               var10000 = 226;
               break;
            case 77:
               var10000 = 252;
               break;
            case 78:
               var10000 = 120;
               break;
            case 79:
               var10000 = 220;
               break;
            case 80:
               var10000 = 63;
               break;
            case 81:
               var10000 = 4;
               break;
            case 82:
               var10000 = 251;
               break;
            case 83:
               var10000 = 60;
               break;
            case 84:
               var10000 = 11;
               break;
            case 85:
               var10000 = 25;
               break;
            case 86:
               var10000 = 142;
               break;
            case 87:
               var10000 = 133;
               break;
            case 88:
               var10000 = 130;
               break;
            case 89:
               var10000 = 85;
               break;
            case 90:
               var10000 = 76;
               break;
            case 91:
               var10000 = 229;
               break;
            case 92:
               var10000 = 34;
               break;
            case 93:
               var10000 = 230;
               break;
            case 94:
               var10000 = 213;
               break;
            case 95:
               var10000 = 26;
               break;
            case 96:
               var10000 = 246;
               break;
            case 97:
               var10000 = 125;
               break;
            case 98:
               var10000 = 58;
               break;
            case 99:
               var10000 = 112;
               break;
            case 100:
               var10000 = 24;
               break;
            case 101:
               var10000 = 153;
               break;
            case 102:
               var10000 = 3;
               break;
            case 103:
               var10000 = 170;
               break;
            case 104:
               var10000 = 204;
               break;
            case 105:
               var10000 = 40;
               break;
            case 106:
               var10000 = 146;
               break;
            case 107:
               var10000 = 250;
               break;
            case 108:
               var10000 = 84;
               break;
            case 109:
               var10000 = 36;
               break;
            case 110:
               var10000 = 249;
               break;
            case 111:
               var10000 = 128;
               break;
            case 112:
               var10000 = 49;
               break;
            case 113:
               var10000 = 9;
               break;
            case 114:
               var10000 = 44;
               break;
            case 115:
               var10000 = 65;
               break;
            case 116:
               var10000 = 240;
               break;
            case 117:
               var10000 = 200;
               break;
            case 118:
               var10000 = 140;
               break;
            case 119:
               var10000 = 61;
               break;
            case 120:
               var10000 = 17;
               break;
            case 121:
               var10000 = 208;
               break;
            case 122:
               var10000 = 175;
               break;
            case 123:
               var10000 = 219;
               break;
            case 124:
               var10000 = 169;
               break;
            case 125:
               var10000 = 194;
               break;
            case 126:
               var10000 = 121;
               break;
            case 127:
               var10000 = 161;
               break;
            case 128:
               var10000 = 19;
               break;
            case 129:
               var10000 = 203;
               break;
            case 130:
               var10000 = 185;
               break;
            case 131:
               var10000 = 254;
               break;
            case 132:
               var10000 = 150;
               break;
            case 133:
               var10000 = 56;
               break;
            case 134:
               var10000 = 159;
               break;
            case 135:
               var10000 = 97;
               break;
            case 136:
               var10000 = 71;
               break;
            case 137:
               var10000 = 46;
               break;
            case 138:
               var10000 = 202;
               break;
            case 139:
               var10000 = 217;
               break;
            case 140:
               var10000 = 188;
               break;
            case 141:
               var10000 = 137;
               break;
            case 142:
               var10000 = 174;
               break;
            case 143:
               var10000 = 178;
               break;
            case 144:
               var10000 = 113;
               break;
            case 145:
               var10000 = 80;
               break;
            case 146:
               var10000 = 190;
               break;
            case 147:
               var10000 = 82;
               break;
            case 148:
               var10000 = 41;
               break;
            case 149:
               var10000 = 50;
               break;
            case 150:
               var10000 = 191;
               break;
            case 151:
               var10000 = 12;
               break;
            case 152:
               var10000 = 167;
               break;
            case 153:
               var10000 = 54;
               break;
            case 154:
               var10000 = 253;
               break;
            case 155:
               var10000 = 90;
               break;
            case 156:
               var10000 = 83;
               break;
            case 157:
               var10000 = 93;
               break;
            case 158:
               var10000 = 206;
               break;
            case 159:
               var10000 = 198;
               break;
            case 160:
               var10000 = 209;
               break;
            case 161:
               var10000 = 51;
               break;
            case 162:
               var10000 = 238;
               break;
            case 163:
               var10000 = 22;
               break;
            case 164:
               var10000 = 68;
               break;
            case 165:
               var10000 = 138;
               break;
            case 166:
               var10000 = 210;
               break;
            case 167:
               var10000 = 151;
               break;
            case 168:
               var10000 = 32;
               break;
            case 169:
               var10000 = 18;
               break;
            case 170:
               var10000 = 35;
               break;
            case 171:
               var10000 = 134;
               break;
            case 172:
               var10000 = 72;
               break;
            case 173:
               var10000 = 216;
               break;
            case 174:
               var10000 = 184;
               break;
            case 175:
               var10000 = 144;
               break;
            case 176:
               var10000 = 88;
               break;
            case 177:
               var10000 = 139;
               break;
            case 178:
               var10000 = 149;
               break;
            case 179:
               var10000 = 218;
               break;
            case 180:
               var10000 = 164;
               break;
            case 181:
               var10000 = 47;
               break;
            case 182:
               var10000 = 115;
               break;
            case 183:
               var10000 = 165;
               break;
            case 184:
               var10000 = 160;
               break;
            case 185:
               var10000 = 156;
               break;
            case 186:
               var10000 = 107;
               break;
            case 187:
               var10000 = 101;
               break;
            case 188:
               var10000 = 110;
               break;
            case 189:
               var10000 = 189;
               break;
            case 190:
               var10000 = 255;
               break;
            case 191:
               var10000 = 14;
               break;
            case 192:
               var10000 = 196;
               break;
            case 193:
               var10000 = 201;
               break;
            case 194:
               var10000 = 239;
               break;
            case 195:
               var10000 = 33;
               break;
            case 196:
               var10000 = 221;
               break;
            case 197:
               var10000 = 176;
               break;
            case 198:
               var10000 = 98;
               break;
            case 199:
               var10000 = 232;
               break;
            case 200:
               var10000 = 15;
               break;
            case 201:
               var10000 = 116;
               break;
            case 202:
               var10000 = 20;
               break;
            case 203:
               var10000 = 154;
               break;
            case 204:
               var10000 = 212;
               break;
            case 205:
               var10000 = 30;
               break;
            case 206:
               var10000 = 247;
               break;
            case 207:
               var10000 = 108;
               break;
            case 208:
               var10000 = 214;
               break;
            case 209:
               var10000 = 241;
               break;
            case 210:
               var10000 = 193;
               break;
            case 211:
               var10000 = 114;
               break;
            case 212:
               var10000 = 237;
               break;
            case 213:
               var10000 = 245;
               break;
            case 214:
               var10000 = 180;
               break;
            case 215:
               var10000 = 187;
               break;
            case 216:
               var10000 = 45;
               break;
            case 217:
               var10000 = 197;
               break;
            case 218:
               var10000 = 91;
               break;
            case 219:
               var10000 = 182;
               break;
            case 220:
               var10000 = 89;
               break;
            case 221:
               var10000 = 62;
               break;
            case 222:
               var10000 = 69;
               break;
            case 223:
               var10000 = 243;
               break;
            case 224:
               var10000 = 143;
               break;
            case 225:
               var10000 = 42;
               break;
            case 226:
               var10000 = 236;
               break;
            case 227:
               var10000 = 155;
               break;
            case 228:
               var10000 = 31;
               break;
            case 229:
               var10000 = 228;
               break;
            case 230:
               var10000 = 99;
               break;
            case 231:
               var10000 = 100;
               break;
            case 232:
               var10000 = 78;
               break;
            case 233:
               var10000 = 199;
               break;
            case 234:
               var10000 = 66;
               break;
            case 235:
               var10000 = 2;
               break;
            case 236:
               var10000 = 94;
               break;
            case 237:
               var10000 = 23;
               break;
            case 238:
               var10000 = 242;
               break;
            case 239:
               var10000 = 222;
               break;
            case 240:
               var10000 = 53;
               break;
            case 241:
               var10000 = 211;
               break;
            case 242:
               var10000 = 234;
               break;
            case 243:
               var10000 = 195;
               break;
            case 244:
               var10000 = 157;
               break;
            case 245:
               var10000 = 248;
               break;
            case 246:
               var10000 = 166;
               break;
            case 247:
               var10000 = 132;
               break;
            case 248:
               var10000 = 67;
               break;
            case 249:
               var10000 = 163;
               break;
            case 250:
               var10000 = 231;
               break;
            case 251:
               var10000 = 141;
               break;
            case 252:
               var10000 = 96;
               break;
            case 253:
               var10000 = 0;
               break;
            case 254:
               var10000 = 106;
               break;
            default:
               var10000 = 148;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9928;
      if (p[var3] == null) {
         p[var3] = (int)(l[var3] ^ var1);
      }

      return p[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 14361) & 32767;
      if (C[var3] == null) {
         C[var3] = z[var3] ^ var1;
      }

      return C[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[34];
      int var19 = 0;
      String var18 = "Ðº»á\u0004ÚxiÅ\u0085¸¡îÅ\u000e\u0017Ún¯EAf\u0016næ¼¨ \tÓ¥\u0013]\u0096¢4Då,U\u001bq\u00934\u0004\u0018ve\u001bÇâf7Óø^JÌfú\u001fC®;\u008c\u009bq_÷³ÝË?ã¡±\u001bÌ\bÕ¦lô\"¹ú2\u0000\u001d\t\"\u0016«§ó¡ö_\u0004ðµ¾\u0093« \u009c]Ë^\u0092^\u001fý\u000bû**\u0094\u0017À\u009cy\u0095\u0082ÇßyÖ.Æ<§Ödü´ÿGN\u009f\u0016s,\u0080²üA3ÊPªã{.\u008eU\u008er1Ky2&Çó\u0017\u001bd6@°\u001e\u009bÍ\u009bÛÉU=pÕV,\\?§\u000b$(EG\u00937\u0094V\u009b+æ\n\u008c\u0088Àû\\ñ*#\u008a\u0099Ô\u0090\u0084v÷Ý4£2Ðº¿Ù|U\u0015ô»÷\u0004\u0014\u001cïÔAÝ\u0087è*\u0094¦Kó\u001d\u0019\u0085ñ\u0019\u000b`\b\u007fës\u00109¾`x_ÕbY\u0095=ÃÜð*\u009e\u0082¸¼\u0018Æ2±5Ü:ö\u0010bEãû¦ñ%\u0012þs>÷Û\u0002¸Â\u0003Ö\u00174$Ì Û/¤\u0003$ie¸ÃG±¹Üs\u0015Ï¿6\nCâv8©\u0014ÿ\u009aK÷\u0095[<àé\u0015\u0019¶J¥£(\u0019R\u009f\r\\òQÏÓ0-\u001cÈ \u0004-\u0015$H\u0088g\u008e_ \u0004ÿ\u0006Ü©\u0003-¤G9ÆôÙX\u0010æÏ+$¡µ>9a¾Æe±´îLô\u0097\u0000\u000f0\u000f\u0013t\n\u007fA:È\u0097ÛwJ:çdBÒT\u001bÒõ\u001fQ{)\u000e= 4XC\u0010àÝ\tFÉî\u0014¬¶\u0014³>øo\u0092ðïrëöO\u000bÒ®M\u0092Õqøb¢\t\u009d\u00131w¡\u0002IÙTÛGqCÞlö~\u001bÿù'\u000b\u0096Þ+:aWn¦p\u0091Ç&\u008bß3À¹þ¾À!^\u0002\u001bÕ¤\u0005\r»-\u0083-Äk¦Ïð\u0088j\u0080þ»ì\u0001sGÑ4\u001dh\t\u0019òÎ\u0093*ç\u000b\u008eà$\u0097s°UÉL\u0089\u0080Ð\u0085uàgM\u0006íN\bÔXg\u008eOÏ\u008d\u009e¢\u0019L\u0097-\u000e\u0000O\u008b\u0087\u0005\u0016D£ÎÌ%¦\u0016×£â\u0015Ïî2Æ\f\u0004'[¢·ps\u000eÒHx©\u00835\u008c?eP\u009dÔ,u25}J%Ø'\u0018\u0085\u001bÑðvÕÕðf¸\u0017Q>\u000eBÁô±¼\u0096\u001bÒ\u009fÃ\u0007ÏÑ'¥\u000b\u0003ú[³\u001crz\u0087TñQ\u0091çeáõ,[PO(íëÍ\u009e'0Âm2@½\u0083\u0014uEÇÛ\u0012ç/«Y2\u0084\u0015J+ª¼]ü\u0005E.\u00123# Ð&âú\u0082\u0015®\u0010Kvr;ÌÓÌÄøí^\u008e\u001d'7\u000f¬w\u000b[\u008bä\u001e©\u0006\u000fF<\u001aq¤ddk)õ\u0012\u0084#JïT\u001eBðNóÙìcyì©ö£k^g\u00050\u0010Äg}mKÇá`\u001bû¨´eì\u0006\t,\u008eä×1\u008f¹)F\tl\u0007`-ÿ0±t·\u0003þÌ1";
      int var20 = "Ðº»á\u0004ÚxiÅ\u0085¸¡îÅ\u000e\u0017Ún¯EAf\u0016næ¼¨ \tÓ¥\u0013]\u0096¢4Då,U\u001bq\u00934\u0004\u0018ve\u001bÇâf7Óø^JÌfú\u001fC®;\u008c\u009bq_÷³ÝË?ã¡±\u001bÌ\bÕ¦lô\"¹ú2\u0000\u001d\t\"\u0016«§ó¡ö_\u0004ðµ¾\u0093« \u009c]Ë^\u0092^\u001fý\u000bû**\u0094\u0017À\u009cy\u0095\u0082ÇßyÖ.Æ<§Ödü´ÿGN\u009f\u0016s,\u0080²üA3ÊPªã{.\u008eU\u008er1Ky2&Çó\u0017\u001bd6@°\u001e\u009bÍ\u009bÛÉU=pÕV,\\?§\u000b$(EG\u00937\u0094V\u009b+æ\n\u008c\u0088Àû\\ñ*#\u008a\u0099Ô\u0090\u0084v÷Ý4£2Ðº¿Ù|U\u0015ô»÷\u0004\u0014\u001cïÔAÝ\u0087è*\u0094¦Kó\u001d\u0019\u0085ñ\u0019\u000b`\b\u007fës\u00109¾`x_ÕbY\u0095=ÃÜð*\u009e\u0082¸¼\u0018Æ2±5Ü:ö\u0010bEãû¦ñ%\u0012þs>÷Û\u0002¸Â\u0003Ö\u00174$Ì Û/¤\u0003$ie¸ÃG±¹Üs\u0015Ï¿6\nCâv8©\u0014ÿ\u009aK÷\u0095[<àé\u0015\u0019¶J¥£(\u0019R\u009f\r\\òQÏÓ0-\u001cÈ \u0004-\u0015$H\u0088g\u008e_ \u0004ÿ\u0006Ü©\u0003-¤G9ÆôÙX\u0010æÏ+$¡µ>9a¾Æe±´îLô\u0097\u0000\u000f0\u000f\u0013t\n\u007fA:È\u0097ÛwJ:çdBÒT\u001bÒõ\u001fQ{)\u000e= 4XC\u0010àÝ\tFÉî\u0014¬¶\u0014³>øo\u0092ðïrëöO\u000bÒ®M\u0092Õqøb¢\t\u009d\u00131w¡\u0002IÙTÛGqCÞlö~\u001bÿù'\u000b\u0096Þ+:aWn¦p\u0091Ç&\u008bß3À¹þ¾À!^\u0002\u001bÕ¤\u0005\r»-\u0083-Äk¦Ïð\u0088j\u0080þ»ì\u0001sGÑ4\u001dh\t\u0019òÎ\u0093*ç\u000b\u008eà$\u0097s°UÉL\u0089\u0080Ð\u0085uàgM\u0006íN\bÔXg\u008eOÏ\u008d\u009e¢\u0019L\u0097-\u000e\u0000O\u008b\u0087\u0005\u0016D£ÎÌ%¦\u0016×£â\u0015Ïî2Æ\f\u0004'[¢·ps\u000eÒHx©\u00835\u008c?eP\u009dÔ,u25}J%Ø'\u0018\u0085\u001bÑðvÕÕðf¸\u0017Q>\u000eBÁô±¼\u0096\u001bÒ\u009fÃ\u0007ÏÑ'¥\u000b\u0003ú[³\u001crz\u0087TñQ\u0091çeáõ,[PO(íëÍ\u009e'0Âm2@½\u0083\u0014uEÇÛ\u0012ç/«Y2\u0084\u0015J+ª¼]ü\u0005E.\u00123# Ð&âú\u0082\u0015®\u0010Kvr;ÌÓÌÄøí^\u008e\u001d'7\u000f¬w\u000b[\u008bä\u001e©\u0006\u000fF<\u001aq¤ddk)õ\u0012\u0084#JïT\u001eBðNóÙìcyì©ö£k^g\u00050\u0010Äg}mKÇá`\u001bû¨´eì\u0006\t,\u008eä×1\u008f¹)F\tl\u0007`-ÿ0±t·\u0003þÌ1"
         .length();
      char var17 = 28;
      int var25 = -1;

      label79:
      while (true) {
         byte var10000 = 62;
         String var10001 = var18.substring(++var25, var25 + var17);
         byte var10002 = -1;

         while (true) {
      char[] var43;
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
                        var77 = 102;
                        break;
                     case 1:
                        var77 = 27;
                        break;
                     case 2:
                        var77 = 80;
                        break;
                     case 3:
                        var77 = 87;
                        break;
                     case 4:
                        var77 = 79;
                        break;
                     case 5:
                        var77 = 39;
                        break;
                     default:
                        var77 = 44;
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
                     a = var21;
                     d = new String[34];
                     long var8 = 3576947331666448438L;
                     long[] var14 = new long[10];
                     int var11 = 0;
                     String var12 = "\u000e{¹\u00adßÙ¾\u009d#ç©2,2\u0082Æ{ÊPÝ\u0014\u009f\u0093záÝ¥8æÂ\u0016E<\u00133P\u0019P'@d,»\u001c`Á\u0001i\u008eô§Å\u001d\u0099c6èvTk\u009dA\u0007\u0097";
                     int var13 = "\u000e{¹\u00adßÙ¾\u009d#ç©2,2\u0082Æ{ÊPÝ\u0014\u009f\u0093záÝ¥8æÂ\u0016E<\u00133P\u0019P'@d,»\u001c`Á\u0001i\u008eô§Å\u001d\u0099c6èvTk\u009dA\u0007\u0097"
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
                                    l = var14;
                                    p = new Integer[10];
                                    long var0 = 8724655467450904069L;
                                    long[] var6 = new long[3];
                                    int var3 = 0;
                                    String var4 = ">é\rù½\u0015#\u0084E Öþ\u0086'Èãuéj|\u001bÍÄê";
                                    int var5 = ">é\rù½\u0015#\u0084E Öþ\u0086'Èãuéj|\u001bÍÄê".length();
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

                                    z = var6;
                                    C = new Long[3];
                                    return;
                                 }
                                 break;
                              default:
                                 var27[var35] = var65;
                                 if (var10 < var13) {
                                    continue label53;
                                 }

                                 var12 = "*Ú\u008b\u000fe5¦F\u008f\u001a{å\u008f*\u0092©";
                                 var13 = "*Ú\u008b\u000fe5¦F\u008f\u001a{å\u008f*\u0092©".length();
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

                  var18 = "ªïEÊa\u00106ß[-ÏH::Ù\u0089Ý¹=[\u008cø";
                  var20 = "ªïEÊa\u00106ß[-ÏH::Ù\u0089Ý¹=[\u008cø".length();
                  var17 = 5;
                  var25 = -1;
            }

            var10000 = 45;
            var10001 = var18.substring(++var25, var25 + var17);
            var10002 = 0;
         }
      }
   }
}





