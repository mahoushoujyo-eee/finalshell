package com.finalshell.core;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public abstract class Ps2 implements Cloneable, Closeable {
   public boolean o;
   public int p = -1;
   public char D;
   public com.finalshell.ui.model.HF r;
   public Boolean k;
   public int K = 0;
   public boolean w = false;
   public static long[] f;
   public static Integer[] g;

   public static Ps2 a(byte[] var0) {
      return new PC(var0);
   }

   public static Ps2 l(InputStream var0) {
      return new PI(var0);
   }

   public static Ps2 m(String var0) {
      return new P3(var0);
   }

   public static Ps2 g(Reader var0) {
      return new P2_2(var0);
   }

   public boolean A() {
      return this.w;
   }

   public Ps2 H(boolean var1) {
      this.w = var1;
      return this;
   }

   public com.finalshell.ui.model.HF L() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/Ps2.r Lcom/finalshell/ui/model/HF;
      // 08: aload 1
      // 09: ifnonnull 26
      // 0c: ifnonnull 22
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual com/finalshell/core/Ps2.y ()Z
      // 1a: pop
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 21: athrow
      // 22: aload 0
      // 23: getfield com/finalshell/core/Ps2.r Lcom/finalshell/ui/model/HF;
      // 26: areturn
   }

   public abstract void c();

   public boolean y() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 23
      // 09: getfield com/finalshell/core/Ps2.k Ljava/lang/Boolean;
      // 0c: ifnull 22
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Ps2.k Ljava/lang/Boolean;
      // 1a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1d: ireturn
      // 1e: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 21: athrow
      // 22: aload 0
      // 23: invokespecial com/finalshell/core/Ps2.z ()Z
      // 26: ifne 3a
      // 29: aload 0
      // 2a: bipush 0
      // 2b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2e: putfield com/finalshell/core/Ps2.k Ljava/lang/Boolean;
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 37: athrow
      // 38: bipush 0
      // 39: ireturn
      // 3a: aload 0
      // 3b: invokevirtual com/finalshell/core/Ps2.N ()V
      // 3e: aload 0
      // 3f: dup
      // 40: getfield com/finalshell/core/Ps2.K I
      // 43: bipush 1
      // 44: iadd
      // 45: putfield com/finalshell/core/Ps2.K I
      // 48: aload 0
      // 49: getfield com/finalshell/core/Ps2.o Z
      // 4c: aload 1
      // 4d: ifnonnull 6c
      // 50: ifeq 68
      // 53: goto 5a
      // 56: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 59: athrow
      // 5a: aload 0
      // 5b: bipush 1
      // 5c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5f: putfield com/finalshell/core/Ps2.k Ljava/lang/Boolean;
      // 62: bipush 1
      // 63: ireturn
      // 64: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 67: athrow
      // 68: aload 0
      // 69: getfield com/finalshell/core/Ps2.w Z
      // 6c: aload 1
      // 6d: ifnonnull a4
      // 70: ifeq 94
      // 73: goto 7a
      // 76: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 79: athrow
      // 7a: aload 0
      // 7b: invokevirtual com/finalshell/core/Ps2.N ()V
      // 7e: aload 0
      // 7f: getfield com/finalshell/core/Ps2.o Z
      // 82: ifeq 22
      // 85: goto 8c
      // 88: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 8b: athrow
      // 8c: aload 1
      // 8d: ifnonnull 38
      // 90: aload 1
      // 91: ifnull a5
      // 94: aload 0
      // 95: bipush 0
      // 96: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 99: putfield com/finalshell/core/Ps2.k Ljava/lang/Boolean;
      // 9c: bipush 0
      // 9d: goto a4
      // a0: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // a3: athrow
      // a4: ireturn
      // a5: aload 0
      // a6: bipush 1
      // a7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // aa: putfield com/finalshell/core/Ps2.k Ljava/lang/Boolean;
      // ad: bipush 1
      // ae: ireturn
   }

   @Override
   public void close() throws IOException {
   }

   public boolean z() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: astore 1
      // 004: aload 0
      // 005: getfield com/finalshell/core/Ps2.D C
      // 008: aload 1
      // 009: ifnonnull 946
      // 00c: lookupswitch 2361 18 34 1297 43 632 45 632 48 632 49 632 50 632 51 632 52 632 53 632 54 632 55 632 56 632 57 632 91 460 102 1762 110 2080 116 1481 123 160
      // 0a8: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0ab: athrow
      // 0ac: aload 0
      // 0ad: invokevirtual com/finalshell/core/Ps2.c ()V
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0b6: athrow
      // 0b7: aload 0
      // 0b8: getfield com/finalshell/core/Ps2.D C
      // 0bb: invokestatic com/finalshell/core/Ps2.O (C)Z
      // 0be: ifeq 0d4
      // 0c1: aload 0
      // 0c2: invokevirtual com/finalshell/core/Ps2.c ()V
      // 0c5: aload 1
      // 0c6: ifnonnull 100
      // 0c9: aload 1
      // 0ca: ifnull 0b7
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0d3: athrow
      // 0d4: aload 0
      // 0d5: getfield com/finalshell/core/Ps2.D C
      // 0d8: sipush 15919
      // 0db: ldc2_w 2765044779329031151
      // 0de: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 0e1: aload 1
      // 0e2: ifnonnull 10d
      // 0e5: if_icmpne 100
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: invokevirtual com/finalshell/core/Ps2.c ()V
      // 0f3: aload 0
      // 0f4: getstatic com/finalshell/ui/model/HF.Object Lcom/finalshell/ui/model/HF;
      // 0f7: putfield com/finalshell/core/Ps2.r Lcom/finalshell/ui/model/HF;
      // 0fa: bipush 1
      // 0fb: ireturn
      // 0fc: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0ff: athrow
      // 100: aload 0
      // 101: getfield com/finalshell/core/Ps2.D C
      // 104: sipush 27891
      // 107: ldc2_w 3773056323076184339
      // 10a: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 10d: if_icmpne 11f
      // 110: aload 0
      // 111: invokevirtual com/finalshell/core/Ps2.B ()V
      // 114: aload 1
      // 115: ifnull 125
      // 118: goto 11f
      // 11b: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 11e: athrow
      // 11f: bipush 0
      // 120: ireturn
      // 121: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 124: athrow
      // 125: aload 0
      // 126: invokevirtual com/finalshell/core/Ps2.N ()V
      // 129: aload 0
      // 12a: getfield com/finalshell/core/Ps2.D C
      // 12d: aload 1
      // 12e: ifnonnull 15b
      // 131: sipush 17339
      // 134: ldc2_w 5199875679209944647
      // 137: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 13a: if_icmpne 153
      // 13d: goto 144
      // 140: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 143: athrow
      // 144: aload 0
      // 145: invokevirtual com/finalshell/core/Ps2.c ()V
      // 148: aload 1
      // 149: ifnull 15c
      // 14c: goto 153
      // 14f: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 152: athrow
      // 153: bipush 0
      // 154: goto 15b
      // 157: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 15a: athrow
      // 15b: ireturn
      // 15c: aload 0
      // 15d: invokevirtual com/finalshell/core/Ps2.N ()V
      // 160: aload 0
      // 161: invokespecial com/finalshell/core/Ps2.z ()Z
      // 164: aload 1
      // 165: ifnonnull 180
      // 168: ifne 178
      // 16b: goto 172
      // 16e: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 171: athrow
      // 172: bipush 0
      // 173: ireturn
      // 174: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 177: athrow
      // 178: aload 0
      // 179: invokevirtual com/finalshell/core/Ps2.N ()V
      // 17c: aload 0
      // 17d: getfield com/finalshell/core/Ps2.D C
      // 180: sipush 8304
      // 183: ldc2_w 6565570601044972935
      // 186: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 189: aload 1
      // 18a: ifnonnull 1c2
      // 18d: if_icmpne 1aa
      // 190: goto 197
      // 193: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 196: athrow
      // 197: aload 0
      // 198: invokevirtual com/finalshell/core/Ps2.c ()V
      // 19b: aload 0
      // 19c: invokevirtual com/finalshell/core/Ps2.N ()V
      // 19f: aload 1
      // 1a0: ifnull 100
      // 1a3: goto 1aa
      // 1a6: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 1a9: athrow
      // 1aa: aload 0
      // 1ab: getfield com/finalshell/core/Ps2.D C
      // 1ae: aload 1
      // 1af: ifnonnull 1d7
      // 1b2: sipush 1280
      // 1b5: ldc2_w 7526342088994173166
      // 1b8: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 1bb: goto 1c2
      // 1be: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 1c1: athrow
      // 1c2: if_icmpne 1d6
      // 1c5: aload 0
      // 1c6: invokevirtual com/finalshell/core/Ps2.c ()V
      // 1c9: aload 0
      // 1ca: getstatic com/finalshell/ui/model/HF.Object Lcom/finalshell/ui/model/HF;
      // 1cd: putfield com/finalshell/core/Ps2.r Lcom/finalshell/ui/model/HF;
      // 1d0: bipush 1
      // 1d1: ireturn
      // 1d2: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 1d5: athrow
      // 1d6: bipush 0
      // 1d7: ireturn
      // 1d8: aload 0
      // 1d9: invokevirtual com/finalshell/core/Ps2.c ()V
      // 1dc: aload 0
      // 1dd: invokevirtual com/finalshell/core/Ps2.N ()V
      // 1e0: aload 0
      // 1e1: getfield com/finalshell/core/Ps2.D C
      // 1e4: aload 1
      // 1e5: ifnonnull 210
      // 1e8: sipush 4308
      // 1eb: ldc2_w 1046370825974949157
      // 1ee: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 1f1: if_icmpne 20c
      // 1f4: goto 1fb
      // 1f7: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 1fa: athrow
      // 1fb: aload 0
      // 1fc: invokevirtual com/finalshell/core/Ps2.c ()V
      // 1ff: aload 0
      // 200: getstatic com/finalshell/ui/model/HF.Array Lcom/finalshell/ui/model/HF;
      // 203: putfield com/finalshell/core/Ps2.r Lcom/finalshell/ui/model/HF;
      // 206: bipush 1
      // 207: ireturn
      // 208: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 20b: athrow
      // 20c: aload 0
      // 20d: invokespecial com/finalshell/core/Ps2.z ()Z
      // 210: ifne 224
      // 213: bipush 0
      // 214: aload 1
      // 215: ifnonnull 22c
      // 218: goto 21f
      // 21b: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 21e: athrow
      // 21f: ireturn
      // 220: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 223: athrow
      // 224: aload 0
      // 225: invokevirtual com/finalshell/core/Ps2.N ()V
      // 228: aload 0
      // 229: getfield com/finalshell/core/Ps2.D C
      // 22c: sipush 14454
      // 22f: ldc2_w 4503100137368259968
      // 232: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 235: aload 1
      // 236: ifnonnull 26e
      // 239: if_icmpne 256
      // 23c: goto 243
      // 23f: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 242: athrow
      // 243: aload 0
      // 244: invokevirtual com/finalshell/core/Ps2.c ()V
      // 247: aload 0
      // 248: invokevirtual com/finalshell/core/Ps2.N ()V
      // 24b: aload 1
      // 24c: ifnull 20c
      // 24f: goto 256
      // 252: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 255: athrow
      // 256: aload 0
      // 257: getfield com/finalshell/core/Ps2.D C
      // 25a: aload 1
      // 25b: ifnonnull 283
      // 25e: sipush 6752
      // 261: ldc2_w 5666227509290250138
      // 264: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 267: goto 26e
      // 26a: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 26d: athrow
      // 26e: if_icmpne 282
      // 271: aload 0
      // 272: invokevirtual com/finalshell/core/Ps2.c ()V
      // 275: aload 0
      // 276: getstatic com/finalshell/ui/model/HF.Array Lcom/finalshell/ui/model/HF;
      // 279: putfield com/finalshell/core/Ps2.r Lcom/finalshell/ui/model/HF;
      // 27c: bipush 1
      // 27d: ireturn
      // 27e: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 281: athrow
      // 282: bipush 0
      // 283: ireturn
      // 284: aload 0
      // 285: getfield com/finalshell/core/Ps2.D C
      // 288: sipush 20627
      // 28b: ldc2_w 6210184166153479523
      // 28e: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 291: aload 1
      // 292: ifnonnull 2e8
      // 295: if_icmpeq 2c1
      // 298: goto 29f
      // 29b: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 29e: athrow
      // 29f: aload 0
      // 2a0: getfield com/finalshell/core/Ps2.D C
      // 2a3: sipush 9398
      // 2a6: ldc2_w 4357531233380274511
      // 2a9: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 2ac: aload 1
      // 2ad: ifnonnull 320
      // 2b0: goto 2b7
      // 2b3: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 2b6: athrow
      // 2b7: if_icmpne 30f
      // 2ba: goto 2c1
      // 2bd: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 2c0: athrow
      // 2c1: aload 0
      // 2c2: invokevirtual com/finalshell/core/Ps2.c ()V
      // 2c5: aload 0
      // 2c6: invokevirtual com/finalshell/core/Ps2.N ()V
      // 2c9: aload 0
      // 2ca: getfield com/finalshell/core/Ps2.D C
      // 2cd: aload 1
      // 2ce: ifnonnull 30e
      // 2d1: goto 2d8
      // 2d4: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 2d7: athrow
      // 2d8: sipush 15096
      // 2db: ldc2_w 5488228377775312671
      // 2de: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 2e1: goto 2e8
      // 2e4: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 2e7: athrow
      // 2e8: if_icmplt 30d
      // 2eb: aload 0
      // 2ec: getfield com/finalshell/core/Ps2.D C
      // 2ef: sipush 28626
      // 2f2: ldc2_w 5222232605591558697
      // 2f5: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 2f8: aload 1
      // 2f9: ifnonnull 320
      // 2fc: goto 303
      // 2ff: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 302: athrow
      // 303: if_icmple 30f
      // 306: goto 30d
      // 309: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 30c: athrow
      // 30d: bipush 0
      // 30e: ireturn
      // 30f: aload 0
      // 310: invokevirtual com/finalshell/core/Ps2.c ()V
      // 313: aload 0
      // 314: getfield com/finalshell/core/Ps2.D C
      // 317: sipush 30319
      // 31a: ldc2_w 7128534389840036753
      // 31d: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 320: if_icmplt 33a
      // 323: aload 0
      // 324: getfield com/finalshell/core/Ps2.D C
      // 327: sipush 29288
      // 32a: ldc2_w 6934354623110039431
      // 32d: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 330: goto 337
      // 333: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 336: athrow
      // 337: if_icmple 30f
      // 33a: aload 0
      // 33b: getfield com/finalshell/core/Ps2.D C
      // 33e: sipush 5237
      // 341: ldc2_w 8666035870335803831
      // 344: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 347: aload 1
      // 348: ifnonnull 337
      // 34b: aload 1
      // 34c: ifnonnull 3fc
      // 34f: if_icmpne 3ef
      // 352: goto 359
      // 355: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 358: athrow
      // 359: aload 0
      // 35a: invokevirtual com/finalshell/core/Ps2.c ()V
      // 35d: aload 0
      // 35e: getfield com/finalshell/core/Ps2.D C
      // 361: aload 1
      // 362: ifnonnull 3a2
      // 365: goto 36c
      // 368: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 36b: athrow
      // 36c: sipush 30319
      // 36f: ldc2_w 7128534389840036753
      // 372: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 375: if_icmplt 3a1
      // 378: goto 37f
      // 37b: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 37e: athrow
      // 37f: aload 0
      // 380: getfield com/finalshell/core/Ps2.D C
      // 383: sipush 29288
      // 386: ldc2_w 6934354623110039431
      // 389: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 38c: aload 1
      // 38d: ifnonnull 3b0
      // 390: goto 397
      // 393: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 396: athrow
      // 397: if_icmple 3a3
      // 39a: goto 3a1
      // 39d: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 3a0: athrow
      // 3a1: bipush 0
      // 3a2: ireturn
      // 3a3: aload 0
      // 3a4: getfield com/finalshell/core/Ps2.D C
      // 3a7: sipush 30319
      // 3aa: ldc2_w 7128534389840036753
      // 3ad: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 3b0: if_icmplt 3ef
      // 3b3: aload 0
      // 3b4: getfield com/finalshell/core/Ps2.D C
      // 3b7: sipush 29288
      // 3ba: ldc2_w 6934354623110039431
      // 3bd: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 3c0: aload 1
      // 3c1: ifnonnull 3fc
      // 3c4: goto 3cb
      // 3c7: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 3ca: athrow
      // 3cb: aload 1
      // 3cc: ifnonnull 3fc
      // 3cf: goto 3d6
      // 3d2: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 3d5: athrow
      // 3d6: if_icmpgt 3ef
      // 3d9: goto 3e0
      // 3dc: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 3df: athrow
      // 3e0: aload 0
      // 3e1: invokevirtual com/finalshell/core/Ps2.c ()V
      // 3e4: aload 1
      // 3e5: ifnull 3a3
      // 3e8: goto 3ef
      // 3eb: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 3ee: athrow
      // 3ef: aload 0
      // 3f0: getfield com/finalshell/core/Ps2.D C
      // 3f3: sipush 2305
      // 3f6: ldc2_w 3278759674425064693
      // 3f9: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 3fc: aload 1
      // 3fd: ifnonnull 44f
      // 400: if_icmpeq 42c
      // 403: goto 40a
      // 406: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 409: athrow
      // 40a: aload 0
      // 40b: aload 1
      // 40c: ifnonnull 513
      // 40f: goto 416
      // 412: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 415: athrow
      // 416: getfield com/finalshell/core/Ps2.D C
      // 419: sipush 17259
      // 41c: ldc2_w 3822955090858112648
      // 41f: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 422: if_icmpne 512
      // 425: goto 42c
      // 428: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 42b: athrow
      // 42c: aload 0
      // 42d: invokevirtual com/finalshell/core/Ps2.c ()V
      // 430: aload 0
      // 431: aload 1
      // 432: ifnonnull 475
      // 435: goto 43c
      // 438: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 43b: athrow
      // 43c: getfield com/finalshell/core/Ps2.D C
      // 43f: sipush 4914
      // 442: ldc2_w 1167470922823116510
      // 445: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 448: goto 44f
      // 44b: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 44e: athrow
      // 44f: if_icmpeq 474
      // 452: aload 0
      // 453: getfield com/finalshell/core/Ps2.D C
      // 456: sipush 4042
      // 459: ldc2_w 6949777772372900396
      // 45c: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 45f: aload 1
      // 460: ifnonnull 490
      // 463: goto 46a
      // 466: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 469: athrow
      // 46a: if_icmpne 478
      // 46d: goto 474
      // 470: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 473: athrow
      // 474: aload 0
      // 475: invokevirtual com/finalshell/core/Ps2.c ()V
      // 478: aload 0
      // 479: getfield com/finalshell/core/Ps2.D C
      // 47c: aload 1
      // 47d: ifnonnull 4cc
      // 480: sipush 30319
      // 483: ldc2_w 7128534389840036753
      // 486: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 489: goto 490
      // 48c: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 48f: athrow
      // 490: if_icmplt 4c4
      // 493: aload 0
      // 494: getfield com/finalshell/core/Ps2.D C
      // 497: aload 1
      // 498: ifnonnull 4cc
      // 49b: goto 4a2
      // 49e: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 4a1: athrow
      // 4a2: sipush 29288
      // 4a5: ldc2_w 6934354623110039431
      // 4a8: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 4ab: if_icmpgt 4c4
      // 4ae: goto 4b5
      // 4b1: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 4b4: athrow
      // 4b5: aload 0
      // 4b6: invokevirtual com/finalshell/core/Ps2.c ()V
      // 4b9: aload 1
      // 4ba: ifnull 4cd
      // 4bd: goto 4c4
      // 4c0: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 4c3: athrow
      // 4c4: bipush 0
      // 4c5: goto 4cc
      // 4c8: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 4cb: athrow
      // 4cc: ireturn
      // 4cd: aload 0
      // 4ce: getfield com/finalshell/core/Ps2.D C
      // 4d1: sipush 30319
      // 4d4: ldc2_w 7128534389840036753
      // 4d7: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 4da: if_icmplt 512
      // 4dd: aload 0
      // 4de: aload 1
      // 4df: ifnonnull 513
      // 4e2: getfield com/finalshell/core/Ps2.D C
      // 4e5: aload 1
      // 4e6: ifnonnull 948
      // 4e9: goto 4f0
      // 4ec: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 4ef: athrow
      // 4f0: sipush 29288
      // 4f3: ldc2_w 6934354623110039431
      // 4f6: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 4f9: if_icmpgt 512
      // 4fc: goto 503
      // 4ff: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 502: athrow
      // 503: aload 0
      // 504: invokevirtual com/finalshell/core/Ps2.c ()V
      // 507: aload 1
      // 508: ifnull 4cd
      // 50b: goto 512
      // 50e: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 511: athrow
      // 512: aload 0
      // 513: getstatic com/finalshell/ui/model/HF.Value Lcom/finalshell/ui/model/HF;
      // 516: putfield com/finalshell/core/Ps2.r Lcom/finalshell/ui/model/HF;
      // 519: aload 1
      // 51a: ifnull 947
      // 51d: aload 0
      // 51e: invokevirtual com/finalshell/core/Ps2.c ()V
      // 521: goto 528
      // 524: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 527: athrow
      // 528: aload 0
      // 529: getfield com/finalshell/core/Ps2.o Z
      // 52c: ifeq 539
      // 52f: bipush 0
      // 530: aload 1
      // 531: ifnonnull 53d
      // 534: ireturn
      // 535: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 538: athrow
      // 539: aload 0
      // 53a: getfield com/finalshell/core/Ps2.D C
      // 53d: sipush 11097
      // 540: ldc2_w 7979616061877984922
      // 543: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 546: aload 1
      // 547: ifnonnull 5b9
      // 54a: if_icmpne 5a1
      // 54d: goto 554
      // 550: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 553: athrow
      // 554: aload 0
      // 555: invokevirtual com/finalshell/core/Ps2.c ()V
      // 558: aload 0
      // 559: aload 1
      // 55a: ifnonnull 59a
      // 55d: goto 564
      // 560: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 563: athrow
      // 564: getfield com/finalshell/core/Ps2.D C
      // 567: sipush 22824
      // 56a: ldc2_w 7284791296221473987
      // 56d: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 570: if_icmpne 599
      // 573: goto 57a
      // 576: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 579: athrow
      // 57a: aload 0
      // 57b: invokevirtual com/finalshell/core/Ps2.c ()V
      // 57e: aload 0
      // 57f: invokevirtual com/finalshell/core/Ps2.c ()V
      // 582: aload 0
      // 583: invokevirtual com/finalshell/core/Ps2.c ()V
      // 586: aload 0
      // 587: invokevirtual com/finalshell/core/Ps2.c ()V
      // 58a: aload 0
      // 58b: invokevirtual com/finalshell/core/Ps2.c ()V
      // 58e: aload 1
      // 58f: ifnull 528
      // 592: goto 599
      // 595: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 598: athrow
      // 599: aload 0
      // 59a: invokevirtual com/finalshell/core/Ps2.c ()V
      // 59d: aload 1
      // 59e: ifnull 528
      // 5a1: aload 0
      // 5a2: aload 1
      // 5a3: ifnonnull 5ce
      // 5a6: getfield com/finalshell/core/Ps2.D C
      // 5a9: sipush 27891
      // 5ac: ldc2_w 3773056323076184339
      // 5af: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 5b2: goto 5b9
      // 5b5: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 5b8: athrow
      // 5b9: if_icmpne 5cd
      // 5bc: aload 0
      // 5bd: invokevirtual com/finalshell/core/Ps2.c ()V
      // 5c0: aload 0
      // 5c1: getstatic com/finalshell/ui/model/HF.Value Lcom/finalshell/ui/model/HF;
      // 5c4: putfield com/finalshell/core/Ps2.r Lcom/finalshell/ui/model/HF;
      // 5c7: bipush 1
      // 5c8: ireturn
      // 5c9: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 5cc: athrow
      // 5cd: aload 0
      // 5ce: invokevirtual com/finalshell/core/Ps2.c ()V
      // 5d1: aload 1
      // 5d2: ifnull 528
      // 5d5: aload 0
      // 5d6: invokevirtual com/finalshell/core/Ps2.c ()V
      // 5d9: aload 0
      // 5da: getfield com/finalshell/core/Ps2.D C
      // 5dd: sipush 4490
      // 5e0: ldc2_w 6583395615128003703
      // 5e3: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 5e6: aload 1
      // 5e7: ifnonnull 60b
      // 5ea: if_icmpeq 5fa
      // 5ed: goto 5f4
      // 5f0: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 5f3: athrow
      // 5f4: bipush 0
      // 5f5: ireturn
      // 5f6: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 5f9: athrow
      // 5fa: aload 0
      // 5fb: invokevirtual com/finalshell/core/Ps2.c ()V
      // 5fe: aload 0
      // 5ff: getfield com/finalshell/core/Ps2.D C
      // 602: sipush 22824
      // 605: ldc2_w 7284791296221473987
      // 608: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 60b: aload 1
      // 60c: ifnonnull 63b
      // 60f: if_icmpeq 61f
      // 612: goto 619
      // 615: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 618: athrow
      // 619: bipush 0
      // 61a: ireturn
      // 61b: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 61e: athrow
      // 61f: aload 0
      // 620: invokevirtual com/finalshell/core/Ps2.c ()V
      // 623: aload 0
      // 624: getfield com/finalshell/core/Ps2.D C
      // 627: aload 1
      // 628: ifnonnull 64f
      // 62b: sipush 31481
      // 62e: ldc2_w 5790924647165775633
      // 631: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 634: goto 63b
      // 637: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 63a: athrow
      // 63b: if_icmpeq 644
      // 63e: bipush 0
      // 63f: ireturn
      // 640: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 643: athrow
      // 644: aload 0
      // 645: invokevirtual com/finalshell/core/Ps2.c ()V
      // 648: aload 0
      // 649: getfield com/finalshell/core/Ps2.D C
      // 64c: invokestatic com/finalshell/core/Ps2.O (C)Z
      // 64f: aload 1
      // 650: ifnonnull 6eb
      // 653: ifne 6dc
      // 656: goto 65d
      // 659: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 65c: athrow
      // 65d: aload 0
      // 65e: getfield com/finalshell/core/Ps2.D C
      // 661: aload 1
      // 662: ifnonnull 6eb
      // 665: goto 66c
      // 668: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 66b: athrow
      // 66c: sipush 14454
      // 66f: ldc2_w 4503100137368259968
      // 672: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 675: if_icmpeq 6dc
      // 678: goto 67f
      // 67b: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 67e: athrow
      // 67f: aload 0
      // 680: getfield com/finalshell/core/Ps2.D C
      // 683: aload 1
      // 684: ifnonnull 6eb
      // 687: goto 68e
      // 68a: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 68d: athrow
      // 68e: sipush 6752
      // 691: ldc2_w 5666227509290250138
      // 694: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 697: if_icmpeq 6dc
      // 69a: goto 6a1
      // 69d: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 6a0: athrow
      // 6a1: aload 0
      // 6a2: getfield com/finalshell/core/Ps2.D C
      // 6a5: aload 1
      // 6a6: ifnonnull 6eb
      // 6a9: goto 6b0
      // 6ac: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 6af: athrow
      // 6b0: sipush 1280
      // 6b3: ldc2_w 7526342088994173166
      // 6b6: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 6b9: if_icmpeq 6dc
      // 6bc: goto 6c3
      // 6bf: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 6c2: athrow
      // 6c3: aload 0
      // 6c4: getfield com/finalshell/core/Ps2.D C
      // 6c7: aload 1
      // 6c8: ifnonnull 6ed
      // 6cb: goto 6d2
      // 6ce: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 6d1: athrow
      // 6d2: ifne 6ec
      // 6d5: goto 6dc
      // 6d8: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 6db: athrow
      // 6dc: aload 0
      // 6dd: getstatic com/finalshell/ui/model/HF.Value Lcom/finalshell/ui/model/HF;
      // 6e0: putfield com/finalshell/core/Ps2.r Lcom/finalshell/ui/model/HF;
      // 6e3: bipush 1
      // 6e4: goto 6eb
      // 6e7: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 6ea: athrow
      // 6eb: ireturn
      // 6ec: bipush 0
      // 6ed: ireturn
      // 6ee: aload 0
      // 6ef: invokevirtual com/finalshell/core/Ps2.c ()V
      // 6f2: aload 0
      // 6f3: getfield com/finalshell/core/Ps2.D C
      // 6f6: sipush 25784
      // 6f9: ldc2_w 7795649546181333322
      // 6fc: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 6ff: aload 1
      // 700: ifnonnull 724
      // 703: if_icmpeq 713
      // 706: goto 70d
      // 709: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 70c: athrow
      // 70d: bipush 0
      // 70e: ireturn
      // 70f: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 712: athrow
      // 713: aload 0
      // 714: invokevirtual com/finalshell/core/Ps2.c ()V
      // 717: aload 0
      // 718: getfield com/finalshell/core/Ps2.D C
      // 71b: sipush 16217
      // 71e: ldc2_w 269701773117524664
      // 721: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 724: aload 1
      // 725: ifnonnull 749
      // 728: if_icmpeq 738
      // 72b: goto 732
      // 72e: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 731: athrow
      // 732: bipush 0
      // 733: ireturn
      // 734: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 737: athrow
      // 738: aload 0
      // 739: invokevirtual com/finalshell/core/Ps2.c ()V
      // 73c: aload 0
      // 73d: getfield com/finalshell/core/Ps2.D C
      // 740: sipush 2684
      // 743: ldc2_w 6118138688412499849
      // 746: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 749: aload 1
      // 74a: ifnonnull 779
      // 74d: if_icmpeq 75d
      // 750: goto 757
      // 753: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 756: athrow
      // 757: bipush 0
      // 758: ireturn
      // 759: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 75c: athrow
      // 75d: aload 0
      // 75e: invokevirtual com/finalshell/core/Ps2.c ()V
      // 761: aload 0
      // 762: getfield com/finalshell/core/Ps2.D C
      // 765: aload 1
      // 766: ifnonnull 78d
      // 769: sipush 31481
      // 76c: ldc2_w 5790924647165775633
      // 76f: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 772: goto 779
      // 775: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 778: athrow
      // 779: if_icmpeq 782
      // 77c: bipush 0
      // 77d: ireturn
      // 77e: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 781: athrow
      // 782: aload 0
      // 783: invokevirtual com/finalshell/core/Ps2.c ()V
      // 786: aload 0
      // 787: getfield com/finalshell/core/Ps2.D C
      // 78a: invokestatic com/finalshell/core/Ps2.O (C)Z
      // 78d: aload 1
      // 78e: ifnonnull 829
      // 791: ifne 81a
      // 794: goto 79b
      // 797: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 79a: athrow
      // 79b: aload 0
      // 79c: getfield com/finalshell/core/Ps2.D C
      // 79f: aload 1
      // 7a0: ifnonnull 829
      // 7a3: goto 7aa
      // 7a6: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 7a9: athrow
      // 7aa: sipush 14454
      // 7ad: ldc2_w 4503100137368259968
      // 7b0: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 7b3: if_icmpeq 81a
      // 7b6: goto 7bd
      // 7b9: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 7bc: athrow
      // 7bd: aload 0
      // 7be: getfield com/finalshell/core/Ps2.D C
      // 7c1: aload 1
      // 7c2: ifnonnull 829
      // 7c5: goto 7cc
      // 7c8: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 7cb: athrow
      // 7cc: sipush 6752
      // 7cf: ldc2_w 5666227509290250138
      // 7d2: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 7d5: if_icmpeq 81a
      // 7d8: goto 7df
      // 7db: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 7de: athrow
      // 7df: aload 0
      // 7e0: getfield com/finalshell/core/Ps2.D C
      // 7e3: aload 1
      // 7e4: ifnonnull 829
      // 7e7: goto 7ee
      // 7ea: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 7ed: athrow
      // 7ee: sipush 1280
      // 7f1: ldc2_w 7526342088994173166
      // 7f4: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 7f7: if_icmpeq 81a
      // 7fa: goto 801
      // 7fd: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 800: athrow
      // 801: aload 0
      // 802: getfield com/finalshell/core/Ps2.D C
      // 805: aload 1
      // 806: ifnonnull 82b
      // 809: goto 810
      // 80c: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 80f: athrow
      // 810: ifne 82a
      // 813: goto 81a
      // 816: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 819: athrow
      // 81a: aload 0
      // 81b: getstatic com/finalshell/ui/model/HF.Value Lcom/finalshell/ui/model/HF;
      // 81e: putfield com/finalshell/core/Ps2.r Lcom/finalshell/ui/model/HF;
      // 821: bipush 1
      // 822: goto 829
      // 825: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 828: athrow
      // 829: ireturn
      // 82a: bipush 0
      // 82b: ireturn
      // 82c: aload 0
      // 82d: invokevirtual com/finalshell/core/Ps2.c ()V
      // 830: aload 0
      // 831: getfield com/finalshell/core/Ps2.D C
      // 834: sipush 22824
      // 837: ldc2_w 7284791296221473987
      // 83a: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 83d: aload 1
      // 83e: ifnonnull 862
      // 841: if_icmpeq 851
      // 844: goto 84b
      // 847: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 84a: athrow
      // 84b: bipush 0
      // 84c: ireturn
      // 84d: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 850: athrow
      // 851: aload 0
      // 852: invokevirtual com/finalshell/core/Ps2.c ()V
      // 855: aload 0
      // 856: getfield com/finalshell/core/Ps2.D C
      // 859: sipush 15811
      // 85c: ldc2_w 3744861035820714025
      // 85f: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 862: aload 1
      // 863: ifnonnull 892
      // 866: if_icmpeq 876
      // 869: goto 870
      // 86c: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 86f: athrow
      // 870: bipush 0
      // 871: ireturn
      // 872: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 875: athrow
      // 876: aload 0
      // 877: invokevirtual com/finalshell/core/Ps2.c ()V
      // 87a: aload 0
      // 87b: getfield com/finalshell/core/Ps2.D C
      // 87e: aload 1
      // 87f: ifnonnull 8a6
      // 882: sipush 15811
      // 885: ldc2_w 3744861035820714025
      // 888: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 88b: goto 892
      // 88e: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 891: athrow
      // 892: if_icmpeq 89b
      // 895: bipush 0
      // 896: ireturn
      // 897: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 89a: athrow
      // 89b: aload 0
      // 89c: invokevirtual com/finalshell/core/Ps2.c ()V
      // 89f: aload 0
      // 8a0: getfield com/finalshell/core/Ps2.D C
      // 8a3: invokestatic com/finalshell/core/Ps2.O (C)Z
      // 8a6: aload 1
      // 8a7: ifnonnull 942
      // 8aa: ifne 933
      // 8ad: goto 8b4
      // 8b0: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 8b3: athrow
      // 8b4: aload 0
      // 8b5: getfield com/finalshell/core/Ps2.D C
      // 8b8: aload 1
      // 8b9: ifnonnull 942
      // 8bc: goto 8c3
      // 8bf: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 8c2: athrow
      // 8c3: sipush 14454
      // 8c6: ldc2_w 4503100137368259968
      // 8c9: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 8cc: if_icmpeq 933
      // 8cf: goto 8d6
      // 8d2: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 8d5: athrow
      // 8d6: aload 0
      // 8d7: getfield com/finalshell/core/Ps2.D C
      // 8da: aload 1
      // 8db: ifnonnull 942
      // 8de: goto 8e5
      // 8e1: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 8e4: athrow
      // 8e5: sipush 6752
      // 8e8: ldc2_w 5666227509290250138
      // 8eb: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 8ee: if_icmpeq 933
      // 8f1: goto 8f8
      // 8f4: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 8f7: athrow
      // 8f8: aload 0
      // 8f9: getfield com/finalshell/core/Ps2.D C
      // 8fc: aload 1
      // 8fd: ifnonnull 942
      // 900: goto 907
      // 903: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 906: athrow
      // 907: sipush 1280
      // 90a: ldc2_w 7526342088994173166
      // 90d: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 910: if_icmpeq 933
      // 913: goto 91a
      // 916: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 919: athrow
      // 91a: aload 0
      // 91b: getfield com/finalshell/core/Ps2.D C
      // 91e: aload 1
      // 91f: ifnonnull 944
      // 922: goto 929
      // 925: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 928: athrow
      // 929: ifne 943
      // 92c: goto 933
      // 92f: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 932: athrow
      // 933: aload 0
      // 934: getstatic com/finalshell/ui/model/HF.Value Lcom/finalshell/ui/model/HF;
      // 937: putfield com/finalshell/core/Ps2.r Lcom/finalshell/ui/model/HF;
      // 93a: bipush 1
      // 93b: goto 942
      // 93e: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 941: athrow
      // 942: ireturn
      // 943: bipush 0
      // 944: ireturn
      // 945: bipush 0
      // 946: ireturn
      // 947: bipush 1
      // 948: ireturn
   }

   public void B() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual com/finalshell/core/Ps2.c ()V
      // 07: astore 1
      // 08: aload 0
      // 09: getfield com/finalshell/core/Ps2.D C
      // 0c: sipush 11097
      // 0f: ldc2_w 7979616061877984922
      // 12: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 15: if_icmpne 69
      // 18: aload 0
      // 19: invokevirtual com/finalshell/core/Ps2.c ()V
      // 1c: aload 0
      // 1d: aload 1
      // 1e: ifnonnull 62
      // 21: getfield com/finalshell/core/Ps2.D C
      // 24: sipush 22824
      // 27: ldc2_w 7284791296221473987
      // 2a: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 2d: aload 1
      // 2e: ifnonnull 81
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 37: athrow
      // 38: if_icmpne 61
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 41: athrow
      // 42: aload 0
      // 43: invokevirtual com/finalshell/core/Ps2.c ()V
      // 46: aload 0
      // 47: invokevirtual com/finalshell/core/Ps2.c ()V
      // 4a: aload 0
      // 4b: invokevirtual com/finalshell/core/Ps2.c ()V
      // 4e: aload 0
      // 4f: invokevirtual com/finalshell/core/Ps2.c ()V
      // 52: aload 0
      // 53: invokevirtual com/finalshell/core/Ps2.c ()V
      // 56: aload 1
      // 57: ifnull 08
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 60: athrow
      // 61: aload 0
      // 62: invokevirtual com/finalshell/core/Ps2.c ()V
      // 65: aload 1
      // 66: ifnull 08
      // 69: aload 0
      // 6a: aload 1
      // 6b: ifnonnull 9b
      // 6e: getfield com/finalshell/core/Ps2.D C
      // 71: sipush 27891
      // 74: ldc2_w 3773056323076184339
      // 77: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 7a: goto 81
      // 7d: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 80: athrow
      // 81: if_icmpne 93
      // 84: aload 0
      // 85: invokevirtual com/finalshell/core/Ps2.c ()V
      // 88: aload 1
      // 89: ifnull a2
      // 8c: goto 93
      // 8f: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 92: athrow
      // 93: aload 0
      // 94: goto 9b
      // 97: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 9a: athrow
      // 9b: invokevirtual com/finalshell/core/Ps2.c ()V
      // 9e: aload 1
      // 9f: ifnull 08
      // a2: return
   }

   public boolean K() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual com/finalshell/core/Ps2.c ()V
      // 07: astore 1
      // 08: aload 0
      // 09: getfield com/finalshell/core/Ps2.o Z
      // 0c: ifne af
      // 0f: aload 0
      // 10: getfield com/finalshell/core/Ps2.D C
      // 13: aload 1
      // 14: ifnonnull b0
      // 17: sipush 25808
      // 1a: ldc2_w 1600914574462341437
      // 1d: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 20: aload 1
      // 21: ifnonnull 9a
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 2a: athrow
      // 2b: if_icmpne 82
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 34: athrow
      // 35: aload 0
      // 36: invokevirtual com/finalshell/core/Ps2.c ()V
      // 39: aload 0
      // 3a: aload 1
      // 3b: ifnonnull 7b
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 44: athrow
      // 45: getfield com/finalshell/core/Ps2.D C
      // 48: sipush 22729
      // 4b: ldc2_w 2999040263953771808
      // 4e: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 51: if_icmpne 7a
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 5a: athrow
      // 5b: aload 0
      // 5c: invokevirtual com/finalshell/core/Ps2.c ()V
      // 5f: aload 0
      // 60: invokevirtual com/finalshell/core/Ps2.c ()V
      // 63: aload 0
      // 64: invokevirtual com/finalshell/core/Ps2.c ()V
      // 67: aload 0
      // 68: invokevirtual com/finalshell/core/Ps2.c ()V
      // 6b: aload 0
      // 6c: invokevirtual com/finalshell/core/Ps2.c ()V
      // 6f: aload 1
      // 70: ifnull 08
      // 73: goto 7a
      // 76: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 79: athrow
      // 7a: aload 0
      // 7b: invokevirtual com/finalshell/core/Ps2.c ()V
      // 7e: aload 1
      // 7f: ifnull 08
      // 82: aload 0
      // 83: aload 1
      // 84: ifnonnull a8
      // 87: getfield com/finalshell/core/Ps2.D C
      // 8a: sipush 11927
      // 8d: ldc2_w 2642998640577649525
      // 90: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 93: goto 9a
      // 96: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 99: athrow
      // 9a: if_icmpne a7
      // 9d: aload 0
      // 9e: invokevirtual com/finalshell/core/Ps2.c ()V
      // a1: bipush 1
      // a2: ireturn
      // a3: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // a6: athrow
      // a7: aload 0
      // a8: invokevirtual com/finalshell/core/Ps2.c ()V
      // ab: aload 1
      // ac: ifnull 08
      // af: bipush 0
      // b0: ireturn
   }

   public void N() {
      String var1 = Hi2.C();

      while (O(this.D)) {
         this.c();
         if (var1 != null) {
            break;
         }
      }
   }

   public static final boolean O(char param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 1
      // 04: iload 0
      // 05: aload 1
      // 06: ifnonnull bf
      // 09: sipush 13248
      // 0c: ldc2_w 4323713100415534648
      // 0f: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 12: if_icmpeq b7
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 1b: athrow
      // 1c: iload 0
      // 1d: aload 1
      // 1e: ifnonnull bf
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 27: athrow
      // 28: sipush 14448
      // 2b: ldc2_w 7268954453945748913
      // 2e: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 31: if_icmpeq b7
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 3a: athrow
      // 3b: iload 0
      // 3c: aload 1
      // 3d: ifnonnull bf
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 46: athrow
      // 47: sipush 20132
      // 4a: ldc2_w 7003018534501710683
      // 4d: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 50: if_icmpeq b7
      // 53: goto 5a
      // 56: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 59: athrow
      // 5a: iload 0
      // 5b: aload 1
      // 5c: ifnonnull bf
      // 5f: goto 66
      // 62: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 65: athrow
      // 66: sipush 22537
      // 69: ldc2_w 4687129983972830700
      // 6c: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 6f: if_icmpeq b7
      // 72: goto 79
      // 75: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 78: athrow
      // 79: iload 0
      // 7a: aload 1
      // 7b: ifnonnull bf
      // 7e: goto 85
      // 81: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 84: athrow
      // 85: sipush 22877
      // 88: ldc2_w 2606629963833011374
      // 8b: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // 8e: if_icmpeq b7
      // 91: goto 98
      // 94: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 97: athrow
      // 98: iload 0
      // 99: aload 1
      // 9a: ifnonnull bf
      // 9d: goto a4
      // a0: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // a3: athrow
      // a4: sipush 31887
      // a7: ldc2_w 5290651545700288875
      // aa: invokestatic com/finalshell/core/Ps2.a (IJ)I
      // ad: if_icmpne c2
      // b0: goto b7
      // b3: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // b6: athrow
      // b7: bipush 1
      // b8: goto bf
      // bb: invokestatic com/finalshell/core/Ps2.b (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // be: athrow
      // bf: goto c3
      // c2: bipush 0
      // c3: ireturn
   }

   public static Hi2 b(Hi2 var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13795;
      if (g[var3] == null) {
         g[var3] = (int)(f[var3] ^ var1);
      }

      return g[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8897783394961030310L;
      long[] var6 = new long[36];
      int var3 = 0;
      String var4 = "Wc\u0006\u001e\u0087Û\nk¾\u0097)äX}çñ©\u0002\u009eÄ\u009cóörU\u0000Á§Ïz%\u0097ó³\u009drF\u0081s\u0089È\u0013±\f\u000f4F¡¾u\u0097'ÿÍ\u0011@õmZQJÓ5Å]F$\u007f\u0093&\u0010\u00105¼\u0019O¬Nôã\tÊ\u001c\fñ\u000b\u0091ónd)ø\u0002[³Ò\u0016²1ïÈ\n»\u0018\u0085\"v´\u0001\u0094Ì51S\u0097þ?\u0097\u00adÇ\u001fc;P\u0099}ZU\u000fØh{Î\"\u0090\u0004có\u008fFx\u0097\u00ad\u008d¯gÄr\u0018\u0094ÙÞç¢\u001f}lP\u0019è\u0012Mrx\u000e\ré\r\u0099\u000e÷·\u009aÜq\nµ\u0002¥À8cÃ\\CE¨ñ\u0090þ@6\u008aÅv,/º&¶e\u009e`±âÏÓa;\u0091)\u000e>HmÂò´bôÕýú¾\u0092!\u00adý\u0019v\u0007ð.û\u001afº\u0097?\u0007È\u0010\u0005=\u008e\u0094Ø£3Þó\u009e¾\u0085\nÛ\u008a8mù=8b`i\u0015Üuo-Ý?";
      int var5 = "Wc\u0006\u001e\u0087Û\nk¾\u0097)äX}çñ©\u0002\u009eÄ\u009cóörU\u0000Á§Ïz%\u0097ó³\u009drF\u0081s\u0089È\u0013±\f\u000f4F¡¾u\u0097'ÿÍ\u0011@õmZQJÓ5Å]F$\u007f\u0093&\u0010\u00105¼\u0019O¬Nôã\tÊ\u001c\fñ\u000b\u0091ónd)ø\u0002[³Ò\u0016²1ïÈ\n»\u0018\u0085\"v´\u0001\u0094Ì51S\u0097þ?\u0097\u00adÇ\u001fc;P\u0099}ZU\u000fØh{Î\"\u0090\u0004có\u008fFx\u0097\u00ad\u008d¯gÄr\u0018\u0094ÙÞç¢\u001f}lP\u0019è\u0012Mrx\u000e\ré\r\u0099\u000e÷·\u009aÜq\nµ\u0002¥À8cÃ\\CE¨ñ\u0090þ@6\u008aÅv,/º&¶e\u009e`±âÏÓa;\u0091)\u000e>HmÂò´bôÕýú¾\u0092!\u00adý\u0019v\u0007ð.û\u001afº\u0097?\u0007È\u0010\u0005=\u008e\u0094Ø£3Þó\u009e¾\u0085\nÛ\u008a8mù=8b`i\u0015Üuo-Ý?"
         .length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
                     f = var6;
                     g = new Integer[36];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = " ¢?YÂëq\u001ep9¡·Bñ÷4";
                  var5 = " ¢?YÂëq\u001ep9¡·Bñ÷4".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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





