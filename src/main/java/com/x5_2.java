package com;

import java.io.IOException;
import java.io.InputStream;

class x5_2 extends InputStream {
   long k;
   boolean V;
   int j;
   byte[] m;
   byte[] Q;
   s_2 u;
   int Z;
   long n;
   final long G;
   final pO_3 O;
   final byte[] c;
   final com.dY_3 Y;
   private static final String[] a;
   private static final String[] b;
   private static final long[] d;
   private static final Integer[] e;

   x5_2(com.dY_3 var1, long var2, pO_3 var4, byte[] var5) {
      this.Y = var1;
      this.G = var2;
      this.O = var4;
      this.c = var5;
      this.k = this.G;
      this.V = false;
      this.j = 0;
      this.m = new byte[1];
      this.Q = new byte[a(1621, 3975562298513291096L)];
      this.u = new s_2();
      this.Z = 1;
      this.n = this.k;
   }

   @Override
   public int read() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/dm_4.F ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/x5_2.V Z
      // 08: iload 1
      // 09: ifeq 26
      // 0c: ifeq 1c
      // 0f: goto 16
      // 12: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: bipush -1
      // 17: ireturn
      // 18: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 0
      // 1e: getfield com/x5_2.m [B
      // 21: bipush 0
      // 22: bipush 1
      // 23: invokevirtual com/x5_2.read ([BII)I
      // 26: istore 2
      // 27: iload 2
      // 28: bipush -1
      // 29: iload 1
      // 2a: ifeq 4c
      // 2d: if_icmpne 3d
      // 30: goto 37
      // 33: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: bipush -1
      // 38: ireturn
      // 39: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield com/x5_2.m [B
      // 41: bipush 0
      // 42: baload
      // 43: sipush 21546
      // 46: ldc2_w 8361509018971415843
      // 49: invokestatic com/x5_2.a (IJ)I
      // 4c: iand
      // 4d: ireturn
   }

   @Override
   public int read(byte[] param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/dm_4.F ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: getfield com/x5_2.V Z
      // 08: iload 2
      // 09: ifeq 24
      // 0c: ifeq 1c
      // 0f: goto 16
      // 12: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: bipush -1
      // 17: ireturn
      // 18: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 1
      // 1e: bipush 0
      // 1f: aload 1
      // 20: arraylength
      // 21: invokevirtual com/x5_2.read ([BII)I
      // 24: ireturn
   }

   @Override
   public int read(byte[] param1, int param2, int param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/dm_4.F ()Z
      // 003: istore 4
      // 005: aload 0
      // 006: getfield com/x5_2.V Z
      // 009: iload 4
      // 00b: ifeq 019
      // 00e: ifeq 01a
      // 011: goto 018
      // 014: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: bipush -1
      // 019: ireturn
      // 01a: aload 1
      // 01b: ifnonnull 02a
      // 01e: new java/lang/NullPointerException
      // 021: dup
      // 022: invokespecial java/lang/NullPointerException.<init> ()V
      // 025: athrow
      // 026: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 029: athrow
      // 02a: iload 2
      // 02b: iload 4
      // 02d: ifeq 03b
      // 030: iflt 065
      // 033: goto 03a
      // 036: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 039: athrow
      // 03a: iload 3
      // 03b: iload 4
      // 03d: ifeq 054
      // 040: iflt 065
      // 043: goto 04a
      // 046: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 049: athrow
      // 04a: iload 2
      // 04b: iload 3
      // 04c: iadd
      // 04d: goto 054
      // 050: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 053: athrow
      // 054: iload 4
      // 056: ifeq 072
      // 059: aload 1
      // 05a: arraylength
      // 05b: if_icmple 071
      // 05e: goto 065
      // 061: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 064: athrow
      // 065: new java/lang/IndexOutOfBoundsException
      // 068: dup
      // 069: invokespecial java/lang/IndexOutOfBoundsException.<init> ()V
      // 06c: athrow
      // 06d: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 070: athrow
      // 071: iload 3
      // 072: iload 4
      // 074: ifeq 08b
      // 077: ifne 087
      // 07a: goto 081
      // 07d: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 080: athrow
      // 081: bipush 0
      // 082: ireturn
      // 083: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: aload 0
      // 088: getfield com/x5_2.j I
      // 08b: iload 4
      // 08d: ifeq 154
      // 090: ifle 13f
      // 093: goto 09a
      // 096: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 099: athrow
      // 09a: aload 0
      // 09b: getfield com/x5_2.j I
      // 09e: istore 5
      // 0a0: iload 5
      // 0a2: iload 3
      // 0a3: iload 4
      // 0a5: ifeq 0d3
      // 0a8: if_icmple 0b5
      // 0ab: goto 0b2
      // 0ae: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: iload 3
      // 0b3: istore 5
      // 0b5: aload 0
      // 0b6: iload 4
      // 0b8: ifeq 0f3
      // 0bb: getfield com/x5_2.Q [B
      // 0be: bipush 0
      // 0bf: aload 1
      // 0c0: iload 2
      // 0c1: iload 5
      // 0c3: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0c6: iload 5
      // 0c8: aload 0
      // 0c9: getfield com/x5_2.j I
      // 0cc: goto 0d3
      // 0cf: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d2: athrow
      // 0d3: if_icmpeq 0f2
      // 0d6: aload 0
      // 0d7: getfield com/x5_2.Q [B
      // 0da: iload 5
      // 0dc: aload 0
      // 0dd: getfield com/x5_2.Q [B
      // 0e0: bipush 0
      // 0e1: aload 0
      // 0e2: getfield com/x5_2.j I
      // 0e5: iload 5
      // 0e7: isub
      // 0e8: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0eb: goto 0f2
      // 0ee: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: iload 4
      // 0f5: ifeq 132
      // 0f8: getfield com/x5_2.O Lcom/pO_3;
      // 0fb: ifnull 131
      // 0fe: goto 105
      // 101: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 104: athrow
      // 105: aload 0
      // 106: getfield com/x5_2.O Lcom/pO_3;
      // 109: iload 5
      // 10b: i2l
      // 10c: invokeinterface com/pO_3.o (J)Z 3
      // 111: iload 4
      // 113: ifeq 13e
      // 116: goto 11d
      // 119: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11c: athrow
      // 11d: ifne 131
      // 120: goto 127
      // 123: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 126: athrow
      // 127: aload 0
      // 128: invokevirtual com/x5_2.close ()V
      // 12b: bipush -1
      // 12c: ireturn
      // 12d: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 130: athrow
      // 131: aload 0
      // 132: dup
      // 133: getfield com/x5_2.j I
      // 136: iload 5
      // 138: isub
      // 139: putfield com/x5_2.j I
      // 13c: iload 5
      // 13e: ireturn
      // 13f: aload 0
      // 140: getfield com/x5_2.Y Lcom/dY_3;
      // 143: invokestatic com/dY_3.Z (Lcom/dY_3;)Lcom/uJ;
      // 146: getfield com/uJ.g [B
      // 149: arraylength
      // 14a: sipush 31346
      // 14d: ldc2_w 2562398751666572153
      // 150: invokestatic com/x5_2.a (IJ)I
      // 153: isub
      // 154: iload 4
      // 156: ifeq 181
      // 159: iload 3
      // 15a: if_icmpge 17a
      // 15d: goto 164
      // 160: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 163: athrow
      // 164: aload 0
      // 165: getfield com/x5_2.Y Lcom/dY_3;
      // 168: invokestatic com/dY_3.Z (Lcom/dY_3;)Lcom/uJ;
      // 16b: getfield com/uJ.g [B
      // 16e: arraylength
      // 16f: sipush 17802
      // 172: ldc2_w 616220958800131202
      // 175: invokestatic com/x5_2.a (IJ)I
      // 178: isub
      // 179: istore 3
      // 17a: aload 0
      // 17b: getfield com/x5_2.Y Lcom/dY_3;
      // 17e: invokestatic com/dY_3.l (Lcom/dY_3;)I
      // 181: iload 4
      // 183: ifeq 1c4
      // 186: ifne 1ba
      // 189: goto 190
      // 18c: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18f: athrow
      // 190: iload 3
      // 191: iload 4
      // 193: ifeq 1c4
      // 196: goto 19d
      // 199: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19c: athrow
      // 19d: sipush 21995
      // 1a0: ldc2_w 7815967576441955557
      // 1a3: invokestatic com/x5_2.a (IJ)I
      // 1a6: if_icmple 1ba
      // 1a9: goto 1b0
      // 1ac: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1af: athrow
      // 1b0: sipush 21995
      // 1b3: ldc2_w 7815967576441955557
      // 1b6: invokestatic com/x5_2.a (IJ)I
      // 1b9: istore 3
      // 1ba: aload 0
      // 1bb: getfield com/x5_2.Y Lcom/dY_3;
      // 1be: invokestatic com/dY_3.A (Lcom/dY_3;)Lcom/Y4;
      // 1c1: invokevirtual com/Y4.J ()I
      // 1c4: ifeq 1c7
      // 1c7: aload 0
      // 1c8: getfield com/x5_2.Y Lcom/dY_3;
      // 1cb: invokestatic com/dY_3.Z (Lcom/dY_3;)Lcom/uJ;
      // 1ce: getfield com/uJ.g [B
      // 1d1: arraylength
      // 1d2: sipush 17802
      // 1d5: ldc2_w 616220958800131202
      // 1d8: invokestatic com/x5_2.a (IJ)I
      // 1db: isub
      // 1dc: istore 5
      // 1de: aload 0
      // 1df: getfield com/x5_2.Y Lcom/dY_3;
      // 1e2: invokestatic com/dY_3.l (Lcom/dY_3;)I
      // 1e5: iload 4
      // 1e7: ifeq 209
      // 1ea: ifne 1ff
      // 1ed: goto 1f4
      // 1f0: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f3: athrow
      // 1f4: sipush 21995
      // 1f7: ldc2_w 7815967576441955557
      // 1fa: invokestatic com/x5_2.a (IJ)I
      // 1fd: istore 5
      // 1ff: aload 0
      // 200: getfield com/x5_2.Y Lcom/dY_3;
      // 203: invokestatic com/dY_3.A (Lcom/dY_3;)Lcom/Y4;
      // 206: invokevirtual com/Y4.J ()I
      // 209: aload 0
      // 20a: getfield com/x5_2.Z I
      // 20d: if_icmpge 254
      // 210: aload 0
      // 211: getfield com/x5_2.Y Lcom/dY_3;
      // 214: aload 0
      // 215: getfield com/x5_2.c [B
      // 218: aload 0
      // 219: getfield com/x5_2.n J
      // 21c: iload 5
      // 21e: aload 0
      // 21f: getfield com/x5_2.Y Lcom/dY_3;
      // 222: invokestatic com/dY_3.A (Lcom/dY_3;)Lcom/Y4;
      // 225: invokestatic com/dY_3.U (Lcom/dY_3;[BJILcom/Y4;)V
      // 228: iload 4
      // 22a: ifeq 27e
      // 22d: goto 243
      // 230: astore 6
      // 232: new java/io/IOException
      // 235: dup
      // 236: sipush 28331
      // 239: sipush 10249
      // 23c: invokestatic com/x5_2.a (II)Ljava/lang/String;
      // 23f: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 242: athrow
      // 243: aload 0
      // 244: dup
      // 245: getfield com/x5_2.n J
      // 248: iload 5
      // 24a: i2l
      // 24b: ladd
      // 24c: putfield com/x5_2.n J
      // 24f: iload 4
      // 251: ifne 1ff
      // 254: aload 0
      // 255: aload 0
      // 256: getfield com/x5_2.Y Lcom/dY_3;
      // 259: aload 0
      // 25a: getfield com/x5_2.Y Lcom/dY_3;
      // 25d: invokestatic com/dY_3.Z (Lcom/dY_3;)Lcom/uJ;
      // 260: aload 0
      // 261: getfield com/x5_2.u Lcom/s_2;
      // 264: invokestatic com/dY_3.b (Lcom/dY_3;Lcom/uJ;Lcom/s_2;)Lcom/s_2;
      // 267: putfield com/x5_2.u Lcom/s_2;
      // 26a: aload 0
      // 26b: aload 0
      // 26c: getfield com/x5_2.u Lcom/s_2;
      // 26f: getfield com/s_2.W I
      // 272: putfield com/x5_2.j I
      // 275: aload 0
      // 276: getfield com/x5_2.u Lcom/s_2;
      // 279: getfield com/s_2.T I
      // 27c: istore 5
      // 27e: aload 0
      // 27f: getfield com/x5_2.u Lcom/s_2;
      // 282: getfield com/s_2.w I
      // 285: istore 6
      // 287: aconst_null
      // 288: astore 7
      // 28a: aload 0
      // 28b: getfield com/x5_2.Y Lcom/dY_3;
      // 28e: invokestatic com/dY_3.A (Lcom/dY_3;)Lcom/Y4;
      // 291: aload 0
      // 292: getfield com/x5_2.u Lcom/s_2;
      // 295: getfield com/s_2.w I
      // 298: invokevirtual com/Y4.y (I)Lcom/O3;
      // 29b: astore 7
      // 29d: goto 2f9
      // 2a0: astore 8
      // 2a2: aload 0
      // 2a3: aload 8
      // 2a5: getfield com/oU_3.Y J
      // 2a8: putfield com/x5_2.n J
      // 2ab: aload 0
      // 2ac: aload 0
      // 2ad: getfield com/x5_2.u Lcom/s_2;
      // 2b0: getfield com/s_2.W I
      // 2b3: i2l
      // 2b4: invokevirtual com/x5_2.skip (J)J
      // 2b7: pop2
      // 2b8: aload 0
      // 2b9: getfield com/x5_2.Y Lcom/dY_3;
      // 2bc: invokestatic com/dY_3.A (Lcom/dY_3;)Lcom/Y4;
      // 2bf: aload 0
      // 2c0: getfield com/x5_2.u Lcom/s_2;
      // 2c3: aload 0
      // 2c4: getfield com/x5_2.Y Lcom/dY_3;
      // 2c7: invokestatic com/dY_3.Z (Lcom/dY_3;)Lcom/uJ;
      // 2ca: invokevirtual com/Y4.W (Lcom/s_2;Lcom/uJ;)V
      // 2cd: bipush 0
      // 2ce: ireturn
      // 2cf: astore 8
      // 2d1: new java/io/IOException
      // 2d4: dup
      // 2d5: new java/lang/StringBuilder
      // 2d8: dup
      // 2d9: invokespecial java/lang/StringBuilder.<init> ()V
      // 2dc: sipush 28329
      // 2df: sipush 31055
      // 2e2: invokestatic com/x5_2.a (II)Ljava/lang/String;
      // 2e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e8: aload 8
      // 2ea: invokevirtual com/Dn_2.toString ()Ljava/lang/String;
      // 2ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2f3: aload 8
      // 2f5: invokespecial java/io/IOException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 2f8: athrow
      // 2f9: iload 5
      // 2fb: sipush 31892
      // 2fe: ldc2_w 770956517577231774
      // 301: invokestatic com/x5_2.a (IJ)I
      // 304: iload 4
      // 306: ifeq 360
      // 309: if_icmpeq 349
      // 30c: goto 313
      // 30f: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 312: athrow
      // 313: iload 5
      // 315: sipush 11196
      // 318: ldc2_w 6713879165440973488
      // 31b: invokestatic com/x5_2.a (IJ)I
      // 31e: iload 4
      // 320: ifeq 360
      // 323: goto 32a
      // 326: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 329: athrow
      // 32a: if_icmpeq 349
      // 32d: goto 334
      // 330: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 333: athrow
      // 334: new java/io/IOException
      // 337: dup
      // 338: sipush 28330
      // 33b: sipush 24905
      // 33e: invokestatic com/x5_2.a (II)Ljava/lang/String;
      // 341: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 344: athrow
      // 345: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 348: athrow
      // 349: iload 5
      // 34b: iload 4
      // 34d: ifeq 3de
      // 350: sipush 23302
      // 353: ldc2_w 3419757513495292425
      // 356: invokestatic com/x5_2.a (IJ)I
      // 359: goto 360
      // 35c: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35f: athrow
      // 360: if_icmpne 3b6
      // 363: aload 0
      // 364: getfield com/x5_2.Y Lcom/dY_3;
      // 367: aload 0
      // 368: getfield com/x5_2.Y Lcom/dY_3;
      // 36b: invokestatic com/dY_3.Z (Lcom/dY_3;)Lcom/uJ;
      // 36e: aload 0
      // 36f: getfield com/x5_2.j I
      // 372: invokestatic com/dY_3.N (Lcom/dY_3;Lcom/uJ;I)V
      // 375: aload 0
      // 376: getfield com/x5_2.Y Lcom/dY_3;
      // 379: invokestatic com/dY_3.Z (Lcom/dY_3;)Lcom/uJ;
      // 37c: invokevirtual com/uJ.d ()I
      // 37f: istore 8
      // 381: aload 0
      // 382: bipush 0
      // 383: putfield com/x5_2.j I
      // 386: iload 8
      // 388: iload 4
      // 38a: ifeq 3a4
      // 38d: bipush 1
      // 38e: if_icmpne 3a5
      // 391: goto 398
      // 394: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 397: athrow
      // 398: aload 0
      // 399: invokevirtual com/x5_2.close ()V
      // 39c: bipush -1
      // 39d: goto 3a4
      // 3a0: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a3: athrow
      // 3a4: ireturn
      // 3a5: new java/io/IOException
      // 3a8: dup
      // 3a9: sipush 28330
      // 3ac: sipush 24905
      // 3af: invokestatic com/x5_2.a (II)Ljava/lang/String;
      // 3b2: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 3b5: athrow
      // 3b6: aload 0
      // 3b7: getfield com/x5_2.Y Lcom/dY_3;
      // 3ba: invokestatic com/dY_3.Z (Lcom/dY_3;)Lcom/uJ;
      // 3bd: invokevirtual com/uJ.a ()V
      // 3c0: aload 0
      // 3c1: getfield com/x5_2.Y Lcom/dY_3;
      // 3c4: aload 0
      // 3c5: getfield com/x5_2.Y Lcom/dY_3;
      // 3c8: invokestatic com/dY_3.Z (Lcom/dY_3;)Lcom/uJ;
      // 3cb: getfield com/uJ.g [B
      // 3ce: bipush 0
      // 3cf: bipush 4
      // 3d0: invokestatic com/dY_3.z (Lcom/dY_3;[BII)I
      // 3d3: pop
      // 3d4: aload 0
      // 3d5: getfield com/x5_2.Y Lcom/dY_3;
      // 3d8: invokestatic com/dY_3.Z (Lcom/dY_3;)Lcom/uJ;
      // 3db: invokevirtual com/uJ.d ()I
      // 3de: istore 8
      // 3e0: aload 0
      // 3e1: dup
      // 3e2: getfield com/x5_2.j I
      // 3e5: bipush 4
      // 3e6: isub
      // 3e7: putfield com/x5_2.j I
      // 3ea: aload 0
      // 3eb: getfield com/x5_2.j I
      // 3ee: iload 8
      // 3f0: isub
      // 3f1: istore 9
      // 3f3: aload 0
      // 3f4: dup
      // 3f5: getfield com/x5_2.k J
      // 3f8: iload 8
      // 3fa: i2l
      // 3fb: ladd
      // 3fc: putfield com/x5_2.k J
      // 3ff: iload 8
      // 401: istore 10
      // 403: iload 10
      // 405: iload 4
      // 407: ifeq 608
      // 40a: ifle 607
      // 40d: goto 414
      // 410: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 413: athrow
      // 414: iload 10
      // 416: istore 11
      // 418: iload 11
      // 41a: iload 4
      // 41c: ifeq 43b
      // 41f: iload 3
      // 420: if_icmple 42d
      // 423: goto 42a
      // 426: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 429: athrow
      // 42a: iload 3
      // 42b: istore 11
      // 42d: aload 0
      // 42e: getfield com/x5_2.Y Lcom/dY_3;
      // 431: invokestatic com/dY_3.P (Lcom/dY_3;)Ljava/io/InputStream;
      // 434: aload 1
      // 435: iload 2
      // 436: iload 11
      // 438: invokevirtual java/io/InputStream.read ([BII)I
      // 43b: istore 12
      // 43d: iload 12
      // 43f: iload 4
      // 441: ifeq 463
      // 444: ifge 454
      // 447: goto 44e
      // 44a: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44d: athrow
      // 44e: bipush -1
      // 44f: ireturn
      // 450: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 453: athrow
      // 454: iload 10
      // 456: iload 12
      // 458: isub
      // 459: istore 10
      // 45b: aload 0
      // 45c: iload 10
      // 45e: putfield com/x5_2.j I
      // 461: iload 10
      // 463: iload 4
      // 465: ifeq 4fc
      // 468: ifle 4fa
      // 46b: goto 472
      // 46e: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 471: athrow
      // 472: aload 0
      // 473: getfield com/x5_2.Q [B
      // 476: arraylength
      // 477: iload 4
      // 479: ifeq 49f
      // 47c: goto 483
      // 47f: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 482: athrow
      // 483: iload 10
      // 485: if_icmpge 49e
      // 488: goto 48f
      // 48b: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48e: athrow
      // 48f: aload 0
      // 490: iload 10
      // 492: newarray 8
      // 494: putfield com/x5_2.Q [B
      // 497: goto 49e
      // 49a: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49d: athrow
      // 49e: bipush 0
      // 49f: istore 13
      // 4a1: iload 10
      // 4a3: istore 14
      // 4a5: iload 14
      // 4a7: ifle 4fa
      // 4aa: aload 0
      // 4ab: getfield com/x5_2.Y Lcom/dY_3;
      // 4ae: invokestatic com/dY_3.P (Lcom/dY_3;)Ljava/io/InputStream;
      // 4b1: aload 0
      // 4b2: getfield com/x5_2.Q [B
      // 4b5: iload 13
      // 4b7: iload 14
      // 4b9: invokevirtual java/io/InputStream.read ([BII)I
      // 4bc: istore 15
      // 4be: iload 15
      // 4c0: iload 4
      // 4c2: ifeq 4fc
      // 4c5: iload 4
      // 4c7: ifeq 4f3
      // 4ca: goto 4d1
      // 4cd: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d0: athrow
      // 4d1: ifgt 4e7
      // 4d4: goto 4db
      // 4d7: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4da: athrow
      // 4db: iload 4
      // 4dd: ifne 4fa
      // 4e0: goto 4e7
      // 4e3: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e6: athrow
      // 4e7: iload 13
      // 4e9: iload 15
      // 4eb: iadd
      // 4ec: istore 13
      // 4ee: iload 14
      // 4f0: iload 15
      // 4f2: isub
      // 4f3: istore 14
      // 4f5: iload 4
      // 4f7: ifne 4a5
      // 4fa: iload 9
      // 4fc: iload 4
      // 4fe: ifeq 529
      // 501: ifle 520
      // 504: goto 50b
      // 507: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50a: athrow
      // 50b: aload 0
      // 50c: getfield com/x5_2.Y Lcom/dY_3;
      // 50f: invokestatic com/dY_3.P (Lcom/dY_3;)Ljava/io/InputStream;
      // 512: iload 9
      // 514: i2l
      // 515: invokevirtual java/io/InputStream.skip (J)J
      // 518: pop2
      // 519: goto 520
      // 51c: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51f: athrow
      // 520: iload 8
      // 522: i2l
      // 523: aload 7
      // 525: getfield com/O3.C J
      // 528: lcmp
      // 529: iload 4
      // 52b: ifeq 5a7
      // 52e: ifge 597
      // 531: goto 538
      // 534: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 537: athrow
      // 538: aload 0
      // 539: getfield com/x5_2.Y Lcom/dY_3;
      // 53c: invokestatic com/dY_3.A (Lcom/dY_3;)Lcom/Y4;
      // 53f: aload 0
      // 540: getfield com/x5_2.u Lcom/s_2;
      // 543: aload 0
      // 544: getfield com/x5_2.Y Lcom/dY_3;
      // 547: invokestatic com/dY_3.Z (Lcom/dY_3;)Lcom/uJ;
      // 54a: invokevirtual com/Y4.W (Lcom/s_2;Lcom/uJ;)V
      // 54d: aload 0
      // 54e: getfield com/x5_2.Y Lcom/dY_3;
      // 551: aload 0
      // 552: getfield com/x5_2.c [B
      // 555: aload 7
      // 557: getfield com/O3.P J
      // 55a: iload 8
      // 55c: i2l
      // 55d: ladd
      // 55e: aload 7
      // 560: getfield com/O3.C J
      // 563: iload 8
      // 565: i2l
      // 566: lsub
      // 567: l2i
      // 568: aload 0
      // 569: getfield com/x5_2.Y Lcom/dY_3;
      // 56c: invokestatic com/dY_3.A (Lcom/dY_3;)Lcom/Y4;
      // 56f: invokestatic com/dY_3.U (Lcom/dY_3;[BJILcom/Y4;)V
      // 572: goto 588
      // 575: astore 13
      // 577: new java/io/IOException
      // 57a: dup
      // 57b: sipush 28330
      // 57e: sipush 24905
      // 581: invokestatic com/x5_2.a (II)Ljava/lang/String;
      // 584: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 587: athrow
      // 588: aload 0
      // 589: aload 7
      // 58b: getfield com/O3.P J
      // 58e: aload 7
      // 590: getfield com/O3.C J
      // 593: ladd
      // 594: putfield com/x5_2.n J
      // 597: aload 0
      // 598: iload 4
      // 59a: ifeq 5c6
      // 59d: getfield com/x5_2.Z I
      // 5a0: goto 5a7
      // 5a3: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a6: athrow
      // 5a7: aload 0
      // 5a8: getfield com/x5_2.Y Lcom/dY_3;
      // 5ab: invokestatic com/dY_3.A (Lcom/dY_3;)Lcom/Y4;
      // 5ae: invokevirtual com/Y4.D ()I
      // 5b1: if_icmpge 5c5
      // 5b4: aload 0
      // 5b5: dup
      // 5b6: getfield com/x5_2.Z I
      // 5b9: bipush 1
      // 5ba: iadd
      // 5bb: putfield com/x5_2.Z I
      // 5be: goto 5c5
      // 5c1: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c4: athrow
      // 5c5: aload 0
      // 5c6: getfield com/x5_2.O Lcom/pO_3;
      // 5c9: iload 4
      // 5cb: ifeq 5e3
      // 5ce: ifnull 604
      // 5d1: goto 5d8
      // 5d4: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d7: athrow
      // 5d8: aload 0
      // 5d9: getfield com/x5_2.O Lcom/pO_3;
      // 5dc: goto 5e3
      // 5df: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e2: athrow
      // 5e3: iload 12
      // 5e5: i2l
      // 5e6: invokeinterface com/pO_3.o (J)Z 3
      // 5eb: iload 4
      // 5ed: ifeq 606
      // 5f0: ifne 604
      // 5f3: goto 5fa
      // 5f6: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f9: athrow
      // 5fa: aload 0
      // 5fb: invokevirtual com/x5_2.close ()V
      // 5fe: bipush -1
      // 5ff: ireturn
      // 600: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 603: athrow
      // 604: iload 12
      // 606: ireturn
      // 607: bipush 0
      // 608: ireturn
   }

   @Override
   public void close() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/dm_4.J ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 21
      // 09: getfield com/x5_2.V Z
      // 0c: ifeq 1b
      // 0f: goto 16
      // 12: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: return
      // 17: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 0
      // 1c: bipush 1
      // 1d: putfield com/x5_2.V Z
      // 20: aload 0
      // 21: iload 1
      // 22: ifne 58
      // 25: getfield com/x5_2.O Lcom/pO_3;
      // 28: ifnull 42
      // 2b: goto 32
      // 2e: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: aload 0
      // 33: getfield com/x5_2.O Lcom/pO_3;
      // 36: invokeinterface com/pO_3.c ()V 1
      // 3b: goto 42
      // 3e: invokestatic com/x5_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: aload 0
      // 43: getfield com/x5_2.Y Lcom/dY_3;
      // 46: invokestatic com/dY_3.A (Lcom/dY_3;)Lcom/Y4;
      // 49: aload 0
      // 4a: getfield com/x5_2.u Lcom/s_2;
      // 4d: aload 0
      // 4e: getfield com/x5_2.Y Lcom/dY_3;
      // 51: invokestatic com/dY_3.Z (Lcom/dY_3;)Lcom/uJ;
      // 54: invokevirtual com/Y4.W (Lcom/s_2;Lcom/uJ;)V
      // 57: aload 0
      // 58: getfield com/x5_2.Y Lcom/dY_3;
      // 5b: aload 0
      // 5c: getfield com/x5_2.c [B
      // 5f: aload 0
      // 60: getfield com/x5_2.u Lcom/s_2;
      // 63: invokestatic com/dY_3.a (Lcom/dY_3;[BLcom/s_2;)Z
      // 66: pop
      // 67: goto 7b
      // 6a: astore 2
      // 6b: aload 2
      // 6c: athrow
      // 6d: astore 2
      // 6e: new java/io/IOException
      // 71: dup
      // 72: aload 2
      // 73: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 76: aload 2
      // 77: invokespecial java/io/IOException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 7a: athrow
      // 7b: return
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[3];
      int var11 = 0;
      String var10 = "ÏÓ¦£Í\u0005\u0019\f|X\u0096\u0007\b\u000b^¸ÒÆÉ";
      int var12 = "ÏÓ¦£Í\u0005\u0019\f|X\u0096\u0007\b\u000b^¸ÒÆÉ".length();
      char var9 = 5;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 126;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 126;
               var10006 = var14;
            } else {
               var27 = 126;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 126;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 25;
                     break;
                  case 1:
                     var47 = 51;
                     break;
                  case 2:
                     var47 = 118;
                     break;
                  case 3:
                     var47 = 93;
                     break;
                  case 4:
                     var47 = 40;
                     break;
                  case 5:
                     var47 = 115;
                     break;
                  default:
                     var47 = 59;
               }

               var10005[var10006] = (char)(var46 ^ var32 ^ var47);
               var14++;
               if (var27 == 0) {
                  var10006 = var27;
                  var10005 = var10002;
                  var32 = var27;
               } else {
                  if (var17 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var32 = var27;
                  var10006 = var14;
               }
            }
         }

         String var29 = new String(var10002).intern();
         int var19 = -1;
         var13[var11++] = var29;
         if ((var8 += var9) >= var12) {
            a = var13;
            b = new String[3];
            long var0 = 5647083561068770220L;
            long[] var6 = new long[8];
            int var3 = 0;
            String var4 = "~K¼D2\u001d\u0007#5®a\u0091\u0084w\u0096p,t\u008e\u0001}\u0005>W\u0086\u0011Ë\u0019ï\u008e8ØJvð\rËré{âÙ\nc\u0093\"@ô";
            int var5 = "~K¼D2\u001d\u0007#5®a\u0091\u0084w\u0096p,t\u008e\u0001}\u0005>W\u0086\u0011Ë\u0019ï\u008e8ØJvð\rËré{âÙ\nc\u0093\"@ô".length();
            byte var2 = 0;

            label40:
            while (true) {
               var19 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var19, var2).getBytes("ISO-8859-1");
               long[] var10000 = var6;
               var19 = var3++;
               long var25 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var30 = -1;

               while (true) {
                  long var37 = var25 ^ var0;
                  switch (var30) {
                     case 0:
                        var10000[var19] = var37;
                        if (var2 >= var5) {
                           d = var6;
                           e = new Integer[8];
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "\u0019\u009e\u0087KÓ¸\u0093IY\u0000Ø4K¯\u0099À";
                        var5 = "\u0019\u009e\u0087KÓ¸\u0093IY\u0000Ø4K¯\u0099À".length();
                        var2 = 0;
                  }

                  byte var22 = var2;
                  var2 += 8;
                  var7 = var4.substring(var22, var2).getBytes("ISO-8859-1");
                  var10000 = var6;
                  var19 = var3++;
                  var25 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var30 = 0;
               }
            }
         }

         var9 = var10.charAt(var8);
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 28331) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 86;
               break;
            case 1:
               var10000 = 64;
               break;
            case 2:
               var10000 = 237;
               break;
            case 3:
               var10000 = 54;
               break;
            case 4:
               var10000 = 87;
               break;
            case 5:
               var10000 = 148;
               break;
            case 6:
               var10000 = 39;
               break;
            case 7:
               var10000 = 172;
               break;
            case 8:
               var10000 = 239;
               break;
            case 9:
               var10000 = 115;
               break;
            case 10:
               var10000 = 242;
               break;
            case 11:
               var10000 = 123;
               break;
            case 12:
               var10000 = 162;
               break;
            case 13:
               var10000 = 166;
               break;
            case 14:
               var10000 = 90;
               break;
            case 15:
               var10000 = 209;
               break;
            case 16:
               var10000 = 30;
               break;
            case 17:
               var10000 = 88;
               break;
            case 18:
               var10000 = 246;
               break;
            case 19:
               var10000 = 7;
               break;
            case 20:
               var10000 = 106;
               break;
            case 21:
               var10000 = 144;
               break;
            case 22:
               var10000 = 225;
               break;
            case 23:
               var10000 = 37;
               break;
            case 24:
               var10000 = 170;
               break;
            case 25:
               var10000 = 93;
               break;
            case 26:
               var10000 = 250;
               break;
            case 27:
               var10000 = 215;
               break;
            case 28:
               var10000 = 13;
               break;
            case 29:
               var10000 = 18;
               break;
            case 30:
               var10000 = 190;
               break;
            case 31:
               var10000 = 141;
               break;
            case 32:
               var10000 = 174;
               break;
            case 33:
               var10000 = 29;
               break;
            case 34:
               var10000 = 4;
               break;
            case 35:
               var10000 = 63;
               break;
            case 36:
               var10000 = 143;
               break;
            case 37:
               var10000 = 120;
               break;
            case 38:
               var10000 = 71;
               break;
            case 39:
               var10000 = 210;
               break;
            case 40:
               var10000 = 8;
               break;
            case 41:
               var10000 = 156;
               break;
            case 42:
               var10000 = 163;
               break;
            case 43:
               var10000 = 254;
               break;
            case 44:
               var10000 = 175;
               break;
            case 45:
               var10000 = 147;
               break;
            case 46:
               var10000 = 16;
               break;
            case 47:
               var10000 = 248;
               break;
            case 48:
               var10000 = 222;
               break;
            case 49:
               var10000 = 11;
               break;
            case 50:
               var10000 = 121;
               break;
            case 51:
               var10000 = 42;
               break;
            case 52:
               var10000 = 241;
               break;
            case 53:
               var10000 = 136;
               break;
            case 54:
               var10000 = 132;
               break;
            case 55:
               var10000 = 134;
               break;
            case 56:
               var10000 = 57;
               break;
            case 57:
               var10000 = 104;
               break;
            case 58:
               var10000 = 206;
               break;
            case 59:
               var10000 = 56;
               break;
            case 60:
               var10000 = 15;
               break;
            case 61:
               var10000 = 165;
               break;
            case 62:
               var10000 = 238;
               break;
            case 63:
               var10000 = 43;
               break;
            case 64:
               var10000 = 224;
               break;
            case 65:
               var10000 = 66;
               break;
            case 66:
               var10000 = 49;
               break;
            case 67:
               var10000 = 98;
               break;
            case 68:
               var10000 = 44;
               break;
            case 69:
               var10000 = 51;
               break;
            case 70:
               var10000 = 67;
               break;
            case 71:
               var10000 = 157;
               break;
            case 72:
               var10000 = 0;
               break;
            case 73:
               var10000 = 107;
               break;
            case 74:
               var10000 = 10;
               break;
            case 75:
               var10000 = 17;
               break;
            case 76:
               var10000 = 50;
               break;
            case 77:
               var10000 = 102;
               break;
            case 78:
               var10000 = 185;
               break;
            case 79:
               var10000 = 12;
               break;
            case 80:
               var10000 = 85;
               break;
            case 81:
               var10000 = 198;
               break;
            case 82:
               var10000 = 233;
               break;
            case 83:
               var10000 = 32;
               break;
            case 84:
               var10000 = 146;
               break;
            case 85:
               var10000 = 6;
               break;
            case 86:
               var10000 = 82;
               break;
            case 87:
               var10000 = 77;
               break;
            case 88:
               var10000 = 181;
               break;
            case 89:
               var10000 = 197;
               break;
            case 90:
               var10000 = 110;
               break;
            case 91:
               var10000 = 192;
               break;
            case 92:
               var10000 = 75;
               break;
            case 93:
               var10000 = 133;
               break;
            case 94:
               var10000 = 177;
               break;
            case 95:
               var10000 = 131;
               break;
            case 96:
               var10000 = 191;
               break;
            case 97:
               var10000 = 230;
               break;
            case 98:
               var10000 = 124;
               break;
            case 99:
               var10000 = 216;
               break;
            case 100:
               var10000 = 244;
               break;
            case 101:
               var10000 = 65;
               break;
            case 102:
               var10000 = 212;
               break;
            case 103:
               var10000 = 38;
               break;
            case 104:
               var10000 = 196;
               break;
            case 105:
               var10000 = 31;
               break;
            case 106:
               var10000 = 226;
               break;
            case 107:
               var10000 = 182;
               break;
            case 108:
               var10000 = 97;
               break;
            case 109:
               var10000 = 168;
               break;
            case 110:
               var10000 = 140;
               break;
            case 111:
               var10000 = 69;
               break;
            case 112:
               var10000 = 68;
               break;
            case 113:
               var10000 = 189;
               break;
            case 114:
               var10000 = 76;
               break;
            case 115:
               var10000 = 232;
               break;
            case 116:
               var10000 = 99;
               break;
            case 117:
               var10000 = 201;
               break;
            case 118:
               var10000 = 92;
               break;
            case 119:
               var10000 = 169;
               break;
            case 120:
               var10000 = 235;
               break;
            case 121:
               var10000 = 114;
               break;
            case 122:
               var10000 = 208;
               break;
            case 123:
               var10000 = 21;
               break;
            case 124:
               var10000 = 193;
               break;
            case 125:
               var10000 = 219;
               break;
            case 126:
               var10000 = 46;
               break;
            case 127:
               var10000 = 40;
               break;
            case 128:
               var10000 = 173;
               break;
            case 129:
               var10000 = 167;
               break;
            case 130:
               var10000 = 100;
               break;
            case 131:
               var10000 = 223;
               break;
            case 132:
               var10000 = 105;
               break;
            case 133:
               var10000 = 9;
               break;
            case 134:
               var10000 = 176;
               break;
            case 135:
               var10000 = 183;
               break;
            case 136:
               var10000 = 130;
               break;
            case 137:
               var10000 = 179;
               break;
            case 138:
               var10000 = 118;
               break;
            case 139:
               var10000 = 161;
               break;
            case 140:
               var10000 = 228;
               break;
            case 141:
               var10000 = 251;
               break;
            case 142:
               var10000 = 27;
               break;
            case 143:
               var10000 = 229;
               break;
            case 144:
               var10000 = 245;
               break;
            case 145:
               var10000 = 199;
               break;
            case 146:
               var10000 = 113;
               break;
            case 147:
               var10000 = 249;
               break;
            case 148:
               var10000 = 139;
               break;
            case 149:
               var10000 = 73;
               break;
            case 150:
               var10000 = 109;
               break;
            case 151:
               var10000 = 214;
               break;
            case 152:
               var10000 = 149;
               break;
            case 153:
               var10000 = 116;
               break;
            case 154:
               var10000 = 187;
               break;
            case 155:
               var10000 = 101;
               break;
            case 156:
               var10000 = 79;
               break;
            case 157:
               var10000 = 59;
               break;
            case 158:
               var10000 = 22;
               break;
            case 159:
               var10000 = 211;
               break;
            case 160:
               var10000 = 80;
               break;
            case 161:
               var10000 = 227;
               break;
            case 162:
               var10000 = 178;
               break;
            case 163:
               var10000 = 55;
               break;
            case 164:
               var10000 = 200;
               break;
            case 165:
               var10000 = 205;
               break;
            case 166:
               var10000 = 28;
               break;
            case 167:
               var10000 = 1;
               break;
            case 168:
               var10000 = 60;
               break;
            case 169:
               var10000 = 127;
               break;
            case 170:
               var10000 = 158;
               break;
            case 171:
               var10000 = 150;
               break;
            case 172:
               var10000 = 2;
               break;
            case 173:
               var10000 = 154;
               break;
            case 174:
               var10000 = 128;
               break;
            case 175:
               var10000 = 47;
               break;
            case 176:
               var10000 = 243;
               break;
            case 177:
               var10000 = 70;
               break;
            case 178:
               var10000 = 252;
               break;
            case 179:
               var10000 = 152;
               break;
            case 180:
               var10000 = 202;
               break;
            case 181:
               var10000 = 89;
               break;
            case 182:
               var10000 = 135;
               break;
            case 183:
               var10000 = 125;
               break;
            case 184:
               var10000 = 247;
               break;
            case 185:
               var10000 = 159;
               break;
            case 186:
               var10000 = 155;
               break;
            case 187:
               var10000 = 74;
               break;
            case 188:
               var10000 = 36;
               break;
            case 189:
               var10000 = 72;
               break;
            case 190:
               var10000 = 45;
               break;
            case 191:
               var10000 = 19;
               break;
            case 192:
               var10000 = 62;
               break;
            case 193:
               var10000 = 204;
               break;
            case 194:
               var10000 = 122;
               break;
            case 195:
               var10000 = 231;
               break;
            case 196:
               var10000 = 20;
               break;
            case 197:
               var10000 = 138;
               break;
            case 198:
               var10000 = 25;
               break;
            case 199:
               var10000 = 184;
               break;
            case 200:
               var10000 = 34;
               break;
            case 201:
               var10000 = 236;
               break;
            case 202:
               var10000 = 188;
               break;
            case 203:
               var10000 = 160;
               break;
            case 204:
               var10000 = 14;
               break;
            case 205:
               var10000 = 53;
               break;
            case 206:
               var10000 = 221;
               break;
            case 207:
               var10000 = 129;
               break;
            case 208:
               var10000 = 23;
               break;
            case 209:
               var10000 = 58;
               break;
            case 210:
               var10000 = 94;
               break;
            case 211:
               var10000 = 240;
               break;
            case 212:
               var10000 = 119;
               break;
            case 213:
               var10000 = 3;
               break;
            case 214:
               var10000 = 207;
               break;
            case 215:
               var10000 = 186;
               break;
            case 216:
               var10000 = 95;
               break;
            case 217:
               var10000 = 142;
               break;
            case 218:
               var10000 = 24;
               break;
            case 219:
               var10000 = 145;
               break;
            case 220:
               var10000 = 96;
               break;
            case 221:
               var10000 = 220;
               break;
            case 222:
               var10000 = 137;
               break;
            case 223:
               var10000 = 213;
               break;
            case 224:
               var10000 = 253;
               break;
            case 225:
               var10000 = 203;
               break;
            case 226:
               var10000 = 84;
               break;
            case 227:
               var10000 = 33;
               break;
            case 228:
               var10000 = 180;
               break;
            case 229:
               var10000 = 153;
               break;
            case 230:
               var10000 = 108;
               break;
            case 231:
               var10000 = 112;
               break;
            case 232:
               var10000 = 234;
               break;
            case 233:
               var10000 = 35;
               break;
            case 234:
               var10000 = 103;
               break;
            case 235:
               var10000 = 41;
               break;
            case 236:
               var10000 = 164;
               break;
            case 237:
               var10000 = 26;
               break;
            case 238:
               var10000 = 195;
               break;
            case 239:
               var10000 = 61;
               break;
            case 240:
               var10000 = 111;
               break;
            case 241:
               var10000 = 151;
               break;
            case 242:
               var10000 = 48;
               break;
            case 243:
               var10000 = 83;
               break;
            case 244:
               var10000 = 5;
               break;
            case 245:
               var10000 = 194;
               break;
            case 246:
               var10000 = 126;
               break;
            case 247:
               var10000 = 217;
               break;
            case 248:
               var10000 = 218;
               break;
            case 249:
               var10000 = 52;
               break;
            case 250:
               var10000 = 91;
               break;
            case 251:
               var10000 = 255;
               break;
            case 252:
               var10000 = 81;
               break;
            case 253:
               var10000 = 117;
               break;
            case 254:
               var10000 = 171;
               break;
            default:
               var10000 = 78;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28936;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }
}





