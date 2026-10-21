package com.finalshell.core;

import java.lang.reflect.Type;

public class Wp4 implements X4 {
   public static Wp4 g;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   @Override
   public Object z(Yn4 param1, Type param2, Object param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/ZS.p ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aload 1
      // 004: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 007: astore 5
      // 009: astore 4
      // 00b: aload 5
      // 00d: invokeinterface com/finalshell/core/P7.P ()I 1
      // 012: sipush 29884
      // 015: ldc2_w 1102733755617054719
      // 018: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 01b: aload 4
      // 01d: ifnonnull 047
      // 020: if_icmpne 037
      // 023: goto 02a
      // 026: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 029: athrow
      // 02a: aload 5
      // 02c: invokeinterface com/finalshell/core/P7.K ()V 1
      // 031: aconst_null
      // 032: areturn
      // 033: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 036: athrow
      // 037: aload 5
      // 039: invokeinterface com/finalshell/core/P7.P ()I 1
      // 03e: sipush 9658
      // 041: ldc2_w 3538419063787544317
      // 044: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 047: aload 4
      // 049: ifnonnull 06d
      // 04c: if_icmpeq 09f
      // 04f: goto 056
      // 052: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 055: athrow
      // 056: aload 5
      // 058: invokeinterface com/finalshell/core/P7.P ()I 1
      // 05d: sipush 17376
      // 060: ldc2_w 1161856982901405871
      // 063: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 066: goto 06d
      // 069: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 06c: athrow
      // 06d: if_icmpeq 09f
      // 070: new com/finalshell/core/Hi2
      // 073: dup
      // 074: new java/lang/StringBuilder
      // 077: dup
      // 078: invokespecial java/lang/StringBuilder.<init> ()V
      // 07b: sipush -17178
      // 07e: sipush 27013
      // 081: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 084: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 087: aload 5
      // 089: invokeinterface com/finalshell/core/P7.P ()I 1
      // 08e: invokestatic com/finalshell/core/Ge2.g (I)Ljava/lang/String;
      // 091: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 094: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 097: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 09a: athrow
      // 09b: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 09e: athrow
      // 09f: aconst_null
      // 0a0: astore 6
      // 0a2: aconst_null
      // 0a3: astore 7
      // 0a5: aconst_null
      // 0a6: astore 8
      // 0a8: bipush 0
      // 0a9: istore 9
      // 0ab: aconst_null
      // 0ac: astore 10
      // 0ae: aconst_null
      // 0af: astore 11
      // 0b1: aconst_null
      // 0b2: astore 12
      // 0b4: aload 5
      // 0b6: aload 1
      // 0b7: invokevirtual com/finalshell/core/Yn4.K ()Lcom/finalshell/core/O12;
      // 0ba: invokeinterface com/finalshell/core/P7.Q (Lcom/finalshell/core/O12;)Ljava/lang/String; 2
      // 0bf: astore 13
      // 0c1: aload 13
      // 0c3: ifnonnull 15f
      // 0c6: aload 5
      // 0c8: invokeinterface com/finalshell/core/P7.P ()I 1
      // 0cd: sipush 17256
      // 0d0: ldc2_w 8110162451209074728
      // 0d3: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 0d6: aload 4
      // 0d8: ifnonnull 661
      // 0db: aload 4
      // 0dd: ifnonnull 130
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0e6: athrow
      // 0e7: if_icmpne 10d
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0f0: athrow
      // 0f1: aload 5
      // 0f3: sipush 18056
      // 0f6: ldc2_w 3012748455553613262
      // 0f9: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 0fc: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 101: aload 4
      // 103: ifnull 713
      // 106: goto 10d
      // 109: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 10c: athrow
      // 10d: aload 5
      // 10f: invokeinterface com/finalshell/core/P7.P ()I 1
      // 114: aload 4
      // 116: ifnonnull 175
      // 119: goto 120
      // 11c: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 11f: athrow
      // 120: sipush 18056
      // 123: ldc2_w 3012748455553613262
      // 126: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 129: goto 130
      // 12c: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 12f: athrow
      // 130: if_icmpne 15f
      // 133: aload 5
      // 135: getstatic com/finalshell/ui/model/Ks2_2.AllowArbitraryCommas Lcom/finalshell/ui/model/Ks2_2;
      // 138: invokeinterface com/finalshell/core/P7.w (Lcom/finalshell/ui/model/Ks2_2;)Z 2
      // 13d: aload 4
      // 13f: ifnonnull 175
      // 142: goto 149
      // 145: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 148: athrow
      // 149: ifeq 15f
      // 14c: goto 153
      // 14f: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 152: athrow
      // 153: aload 4
      // 155: ifnull 0b4
      // 158: goto 15f
      // 15b: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 15e: athrow
      // 15f: aload 5
      // 161: bipush 4
      // 162: invokeinterface com/finalshell/core/P7.e (I)V 2
      // 167: sipush -17183
      // 16a: sipush 21253
      // 16d: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 170: aload 13
      // 172: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 175: aload 4
      // 177: ifnonnull 1f8
      // 17a: ifeq 1ea
      // 17d: goto 184
      // 180: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 183: athrow
      // 184: aload 5
      // 186: invokeinterface com/finalshell/core/P7.P ()I 1
      // 18b: sipush 14096
      // 18e: ldc2_w 8787016485029563486
      // 191: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 194: aload 4
      // 196: ifnonnull 1c4
      // 199: goto 1a0
      // 19c: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 19f: athrow
      // 1a0: if_icmpne 1b0
      // 1a3: goto 1aa
      // 1a6: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 1a9: athrow
      // 1aa: aconst_null
      // 1ab: astore 6
      // 1ad: goto 6d3
      // 1b0: aload 5
      // 1b2: aload 4
      // 1b4: ifnonnull 1c9
      // 1b7: invokeinterface com/finalshell/core/P7.P ()I 1
      // 1bc: bipush 4
      // 1bd: goto 1c4
      // 1c0: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 1c3: athrow
      // 1c4: if_icmpne 1d5
      // 1c7: aload 5
      // 1c9: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 1ce: astore 6
      // 1d0: aload 4
      // 1d2: ifnull 6d3
      // 1d5: new com/finalshell/core/Hi2
      // 1d8: dup
      // 1d9: sipush -17176
      // 1dc: sipush -24945
      // 1df: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 1e2: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 1e5: athrow
      // 1e6: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 1e9: athrow
      // 1ea: sipush -17179
      // 1ed: sipush -7112
      // 1f0: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 1f3: aload 13
      // 1f5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1f8: aload 4
      // 1fa: ifnonnull 27b
      // 1fd: ifeq 26d
      // 200: goto 207
      // 203: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 206: athrow
      // 207: aload 5
      // 209: invokeinterface com/finalshell/core/P7.P ()I 1
      // 20e: sipush 14096
      // 211: ldc2_w 8787016485029563486
      // 214: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 217: aload 4
      // 219: ifnonnull 247
      // 21c: goto 223
      // 21f: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 222: athrow
      // 223: if_icmpne 233
      // 226: goto 22d
      // 229: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 22c: athrow
      // 22d: aconst_null
      // 22e: astore 7
      // 230: goto 6d3
      // 233: aload 5
      // 235: aload 4
      // 237: ifnonnull 24c
      // 23a: invokeinterface com/finalshell/core/P7.P ()I 1
      // 23f: bipush 4
      // 240: goto 247
      // 243: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 246: athrow
      // 247: if_icmpne 258
      // 24a: aload 5
      // 24c: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 251: astore 7
      // 253: aload 4
      // 255: ifnull 6d3
      // 258: new com/finalshell/core/Hi2
      // 25b: dup
      // 25c: sipush -17184
      // 25f: sipush -20448
      // 262: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 265: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 268: athrow
      // 269: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 26c: athrow
      // 26d: sipush -17173
      // 270: sipush 25217
      // 273: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 276: aload 13
      // 278: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 27b: aload 4
      // 27d: ifnonnull 2fe
      // 280: ifeq 2f0
      // 283: goto 28a
      // 286: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 289: athrow
      // 28a: aload 5
      // 28c: invokeinterface com/finalshell/core/P7.P ()I 1
      // 291: sipush 14096
      // 294: ldc2_w 8787016485029563486
      // 297: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 29a: aload 4
      // 29c: ifnonnull 2ca
      // 29f: goto 2a6
      // 2a2: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 2a5: athrow
      // 2a6: if_icmpne 2b6
      // 2a9: goto 2b0
      // 2ac: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 2af: athrow
      // 2b0: aconst_null
      // 2b1: astore 8
      // 2b3: goto 6d3
      // 2b6: aload 5
      // 2b8: aload 4
      // 2ba: ifnonnull 2cf
      // 2bd: invokeinterface com/finalshell/core/P7.P ()I 1
      // 2c2: bipush 4
      // 2c3: goto 2ca
      // 2c6: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 2c9: athrow
      // 2ca: if_icmpne 2db
      // 2cd: aload 5
      // 2cf: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 2d4: astore 8
      // 2d6: aload 4
      // 2d8: ifnull 6d3
      // 2db: new com/finalshell/core/Hi2
      // 2de: dup
      // 2df: sipush -17184
      // 2e2: sipush -20448
      // 2e5: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 2e8: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 2eb: athrow
      // 2ec: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 2ef: athrow
      // 2f0: sipush -17177
      // 2f3: sipush -19966
      // 2f6: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 2f9: aload 13
      // 2fb: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2fe: aload 4
      // 300: ifnonnull 39d
      // 303: ifeq 383
      // 306: goto 30d
      // 309: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 30c: athrow
      // 30d: aload 5
      // 30f: invokeinterface com/finalshell/core/P7.P ()I 1
      // 314: sipush 14096
      // 317: ldc2_w 8787016485029563486
      // 31a: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 31d: aload 4
      // 31f: ifnonnull 356
      // 322: goto 329
      // 325: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 328: athrow
      // 329: if_icmpne 33b
      // 32c: goto 333
      // 32f: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 332: athrow
      // 333: bipush 0
      // 334: istore 9
      // 336: aload 4
      // 338: ifnull 6d3
      // 33b: aload 5
      // 33d: invokeinterface com/finalshell/core/P7.P ()I 1
      // 342: aload 4
      // 344: ifnonnull 367
      // 347: goto 34e
      // 34a: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 34d: athrow
      // 34e: bipush 2
      // 34f: goto 356
      // 352: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 355: athrow
      // 356: if_icmpne 36e
      // 359: aload 5
      // 35b: invokeinterface com/finalshell/core/P7.G ()I 1
      // 360: goto 367
      // 363: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 366: athrow
      // 367: istore 9
      // 369: aload 4
      // 36b: ifnull 6d3
      // 36e: new com/finalshell/core/Hi2
      // 371: dup
      // 372: sipush -17184
      // 375: sipush -20448
      // 378: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 37b: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 37e: athrow
      // 37f: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 382: athrow
      // 383: sipush -17174
      // 386: sipush 26290
      // 389: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 38c: aload 13
      // 38e: aload 4
      // 390: ifnonnull 479
      // 393: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 396: goto 39d
      // 399: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 39c: athrow
      // 39d: ifeq 474
      // 3a0: aload 5
      // 3a2: invokeinterface com/finalshell/core/P7.P ()I 1
      // 3a7: sipush 14096
      // 3aa: ldc2_w 8787016485029563486
      // 3ad: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 3b0: aload 4
      // 3b2: ifnonnull 3f9
      // 3b5: goto 3bc
      // 3b8: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 3bb: athrow
      // 3bc: if_icmpne 3e2
      // 3bf: goto 3c6
      // 3c2: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 3c5: athrow
      // 3c6: aload 5
      // 3c8: sipush 18056
      // 3cb: ldc2_w 3012748455553613262
      // 3ce: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 3d1: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 3d6: aload 4
      // 3d8: ifnull 6d3
      // 3db: goto 3e2
      // 3de: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 3e1: athrow
      // 3e2: aload 5
      // 3e4: invokeinterface com/finalshell/core/P7.P ()I 1
      // 3e9: sipush 18928
      // 3ec: ldc2_w 466884026622554801
      // 3ef: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 3f2: goto 3f9
      // 3f5: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 3f8: athrow
      // 3f9: aload 4
      // 3fb: ifnonnull 447
      // 3fe: if_icmpne 424
      // 401: goto 408
      // 404: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 407: athrow
      // 408: aload 5
      // 40a: sipush 18056
      // 40d: ldc2_w 3012748455553613262
      // 410: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 413: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 418: aload 4
      // 41a: ifnull 6d3
      // 41d: goto 424
      // 420: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 423: athrow
      // 424: aload 5
      // 426: aload 4
      // 428: ifnonnull 44c
      // 42b: goto 432
      // 42e: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 431: athrow
      // 432: invokeinterface com/finalshell/core/P7.P ()I 1
      // 437: sipush 17138
      // 43a: ldc2_w 8346871064522209719
      // 43d: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 440: goto 447
      // 443: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 446: athrow
      // 447: if_icmpne 45f
      // 44a: aload 5
      // 44c: sipush 18056
      // 44f: ldc2_w 3012748455553613262
      // 452: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 455: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 45a: aload 4
      // 45c: ifnull 6d3
      // 45f: new com/finalshell/core/Hi2
      // 462: dup
      // 463: sipush -17184
      // 466: sipush -20448
      // 469: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 46c: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 46f: athrow
      // 470: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 473: athrow
      // 474: aload 13
      // 476: getstatic com/finalshell/core/Ok2.Z Ljava/lang/String;
      // 479: aload 4
      // 47b: ifnonnull 532
      // 47e: if_acmpne 527
      // 481: goto 488
      // 484: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 487: athrow
      // 488: aload 5
      // 48a: invokeinterface com/finalshell/core/P7.P ()I 1
      // 48f: bipush 4
      // 490: aload 4
      // 492: ifnonnull 503
      // 495: goto 49c
      // 498: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 49b: athrow
      // 49c: if_icmpne 4ec
      // 49f: goto 4a6
      // 4a2: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 4a5: athrow
      // 4a6: aload 5
      // 4a8: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 4ad: astore 14
      // 4af: aload 14
      // 4b1: sipush -17182
      // 4b4: sipush -21364
      // 4b7: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 4ba: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4bd: ifne 4e7
      // 4c0: new com/finalshell/core/Hi2
      // 4c3: dup
      // 4c4: new java/lang/StringBuilder
      // 4c7: dup
      // 4c8: invokespecial java/lang/StringBuilder.<init> ()V
      // 4cb: sipush -17180
      // 4ce: sipush -27838
      // 4d1: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 4d4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4d7: aload 14
      // 4d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4dc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4df: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 4e2: athrow
      // 4e3: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 4e6: athrow
      // 4e7: aload 4
      // 4e9: ifnull 6d3
      // 4ec: aload 5
      // 4ee: invokeinterface com/finalshell/core/P7.P ()I 1
      // 4f3: sipush 14096
      // 4f6: ldc2_w 8787016485029563486
      // 4f9: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 4fc: goto 503
      // 4ff: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 502: athrow
      // 503: aload 4
      // 505: ifnonnull 6ef
      // 508: if_icmpeq 6d3
      // 50b: goto 512
      // 50e: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 511: athrow
      // 512: new com/finalshell/core/Hi2
      // 515: dup
      // 516: sipush -17184
      // 519: sipush -20448
      // 51c: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 51f: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 522: athrow
      // 523: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 526: athrow
      // 527: sipush -17171
      // 52a: sipush -22026
      // 52d: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 530: aload 13
      // 532: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 535: aload 4
      // 537: ifnonnull 5b8
      // 53a: ifeq 5aa
      // 53d: goto 544
      // 540: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 543: athrow
      // 544: aload 5
      // 546: invokeinterface com/finalshell/core/P7.P ()I 1
      // 54b: sipush 14096
      // 54e: ldc2_w 8787016485029563486
      // 551: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 554: aload 4
      // 556: ifnonnull 584
      // 559: goto 560
      // 55c: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 55f: athrow
      // 560: if_icmpne 570
      // 563: goto 56a
      // 566: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 569: athrow
      // 56a: aconst_null
      // 56b: astore 10
      // 56d: goto 6d3
      // 570: aload 5
      // 572: aload 4
      // 574: ifnonnull 589
      // 577: invokeinterface com/finalshell/core/P7.P ()I 1
      // 57c: bipush 4
      // 57d: goto 584
      // 580: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 583: athrow
      // 584: if_icmpne 595
      // 587: aload 5
      // 589: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 58e: astore 10
      // 590: aload 4
      // 592: ifnull 6d3
      // 595: new com/finalshell/core/Hi2
      // 598: dup
      // 599: sipush -17184
      // 59c: sipush -20448
      // 59f: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 5a2: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 5a5: athrow
      // 5a6: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 5a9: athrow
      // 5aa: sipush -17181
      // 5ad: sipush 14425
      // 5b0: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 5b3: aload 13
      // 5b5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5b8: aload 4
      // 5ba: ifnonnull 63b
      // 5bd: ifeq 62d
      // 5c0: goto 5c7
      // 5c3: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 5c6: athrow
      // 5c7: aload 5
      // 5c9: invokeinterface com/finalshell/core/P7.P ()I 1
      // 5ce: sipush 14096
      // 5d1: ldc2_w 8787016485029563486
      // 5d4: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 5d7: aload 4
      // 5d9: ifnonnull 607
      // 5dc: goto 5e3
      // 5df: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 5e2: athrow
      // 5e3: if_icmpne 5f3
      // 5e6: goto 5ed
      // 5e9: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 5ec: athrow
      // 5ed: aconst_null
      // 5ee: astore 11
      // 5f0: goto 6d3
      // 5f3: aload 5
      // 5f5: aload 4
      // 5f7: ifnonnull 60c
      // 5fa: invokeinterface com/finalshell/core/P7.P ()I 1
      // 5ff: bipush 4
      // 600: goto 607
      // 603: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 606: athrow
      // 607: if_icmpne 618
      // 60a: aload 5
      // 60c: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 611: astore 11
      // 613: aload 4
      // 615: ifnull 6d3
      // 618: new com/finalshell/core/Hi2
      // 61b: dup
      // 61c: sipush -17184
      // 61f: sipush -20448
      // 622: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 625: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 628: athrow
      // 629: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 62c: athrow
      // 62d: sipush -17175
      // 630: sipush 23821
      // 633: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 636: aload 13
      // 638: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 63b: aload 4
      // 63d: ifnonnull 658
      // 640: ifeq 6b0
      // 643: goto 64a
      // 646: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 649: athrow
      // 64a: aload 5
      // 64c: invokeinterface com/finalshell/core/P7.P ()I 1
      // 651: goto 658
      // 654: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 657: athrow
      // 658: sipush 14096
      // 65b: ldc2_w 8787016485029563486
      // 65e: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 661: aload 4
      // 663: ifnonnull 68a
      // 666: if_icmpne 676
      // 669: goto 670
      // 66c: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 66f: athrow
      // 670: aconst_null
      // 671: astore 12
      // 673: goto 6d3
      // 676: aload 5
      // 678: aload 4
      // 67a: ifnonnull 68f
      // 67d: invokeinterface com/finalshell/core/P7.P ()I 1
      // 682: bipush 4
      // 683: goto 68a
      // 686: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 689: athrow
      // 68a: if_icmpne 69b
      // 68d: aload 5
      // 68f: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 694: astore 12
      // 696: aload 4
      // 698: ifnull 6d3
      // 69b: new com/finalshell/core/Hi2
      // 69e: dup
      // 69f: sipush -17184
      // 6a2: sipush -20448
      // 6a5: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 6a8: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 6ab: athrow
      // 6ac: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 6af: athrow
      // 6b0: new com/finalshell/core/Hi2
      // 6b3: dup
      // 6b4: new java/lang/StringBuilder
      // 6b7: dup
      // 6b8: invokespecial java/lang/StringBuilder.<init> ()V
      // 6bb: sipush -17172
      // 6be: sipush -26526
      // 6c1: invokestatic com/finalshell/core/Wp4.a (II)Ljava/lang/String;
      // 6c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6c7: aload 13
      // 6c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6cc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6cf: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 6d2: athrow
      // 6d3: aload 5
      // 6d5: aload 4
      // 6d7: ifnonnull 6f4
      // 6da: invokeinterface com/finalshell/core/P7.P ()I 1
      // 6df: sipush 26445
      // 6e2: ldc2_w 1917969228288465935
      // 6e5: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 6e8: goto 6ef
      // 6eb: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 6ee: athrow
      // 6ef: if_icmpne 707
      // 6f2: aload 5
      // 6f4: sipush 18056
      // 6f7: ldc2_w 3012748455553613262
      // 6fa: invokestatic com/finalshell/core/Wp4.a (IJ)I
      // 6fd: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 702: aload 4
      // 704: ifnull 713
      // 707: aload 4
      // 709: ifnull 0b4
      // 70c: goto 713
      // 70f: invokestatic com/finalshell/core/Wp4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 712: athrow
      // 713: new java/lang/StackTraceElement
      // 716: dup
      // 717: aload 6
      // 719: aload 7
      // 71b: aload 8
      // 71d: iload 9
      // 71f: invokespecial java/lang/StackTraceElement.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
      // 722: areturn
   }

   @Override
   public int j() {
      return a(1379, 6652902309258231335L);
   }

   static {
      __vfClinit__();
   }

   public static Hi2 a(Hi2 var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -17183) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 101;
               break;
            case 1:
               var10000 = 214;
               break;
            case 2:
               var10000 = 166;
               break;
            case 3:
               var10000 = 228;
               break;
            case 4:
               var10000 = 32;
               break;
            case 5:
               var10000 = 91;
               break;
            case 6:
               var10000 = 148;
               break;
            case 7:
               var10000 = 191;
               break;
            case 8:
               var10000 = 167;
               break;
            case 9:
               var10000 = 61;
               break;
            case 10:
               var10000 = 24;
               break;
            case 11:
               var10000 = 93;
               break;
            case 12:
               var10000 = 18;
               break;
            case 13:
               var10000 = 210;
               break;
            case 14:
               var10000 = 34;
               break;
            case 15:
               var10000 = 178;
               break;
            case 16:
               var10000 = 160;
               break;
            case 17:
               var10000 = 6;
               break;
            case 18:
               var10000 = 103;
               break;
            case 19:
               var10000 = 194;
               break;
            case 20:
               var10000 = 9;
               break;
            case 21:
               var10000 = 136;
               break;
            case 22:
               var10000 = 183;
               break;
            case 23:
               var10000 = 67;
               break;
            case 24:
               var10000 = 60;
               break;
            case 25:
               var10000 = 20;
               break;
            case 26:
               var10000 = 224;
               break;
            case 27:
               var10000 = 70;
               break;
            case 28:
               var10000 = 177;
               break;
            case 29:
               var10000 = 29;
               break;
            case 30:
               var10000 = 68;
               break;
            case 31:
               var10000 = 180;
               break;
            case 32:
               var10000 = 106;
               break;
            case 33:
               var10000 = 242;
               break;
            case 34:
               var10000 = 81;
               break;
            case 35:
               var10000 = 185;
               break;
            case 36:
               var10000 = 245;
               break;
            case 37:
               var10000 = 39;
               break;
            case 38:
               var10000 = 50;
               break;
            case 39:
               var10000 = 65;
               break;
            case 40:
               var10000 = 119;
               break;
            case 41:
               var10000 = 201;
               break;
            case 42:
               var10000 = 44;
               break;
            case 43:
               var10000 = 227;
               break;
            case 44:
               var10000 = 112;
               break;
            case 45:
               var10000 = 225;
               break;
            case 46:
               var10000 = 46;
               break;
            case 47:
               var10000 = 27;
               break;
            case 48:
               var10000 = 181;
               break;
            case 49:
               var10000 = 63;
               break;
            case 50:
               var10000 = 233;
               break;
            case 51:
               var10000 = 107;
               break;
            case 52:
               var10000 = 80;
               break;
            case 53:
               var10000 = 174;
               break;
            case 54:
               var10000 = 19;
               break;
            case 55:
               var10000 = 255;
               break;
            case 56:
               var10000 = 161;
               break;
            case 57:
               var10000 = 231;
               break;
            case 58:
               var10000 = 41;
               break;
            case 59:
               var10000 = 56;
               break;
            case 60:
               var10000 = 192;
               break;
            case 61:
               var10000 = 128;
               break;
            case 62:
               var10000 = 209;
               break;
            case 63:
               var10000 = 132;
               break;
            case 64:
               var10000 = 165;
               break;
            case 65:
               var10000 = 86;
               break;
            case 66:
               var10000 = 230;
               break;
            case 67:
               var10000 = 126;
               break;
            case 68:
               var10000 = 202;
               break;
            case 69:
               var10000 = 15;
               break;
            case 70:
               var10000 = 48;
               break;
            case 71:
               var10000 = 69;
               break;
            case 72:
               var10000 = 156;
               break;
            case 73:
               var10000 = 235;
               break;
            case 74:
               var10000 = 40;
               break;
            case 75:
               var10000 = 28;
               break;
            case 76:
               var10000 = 102;
               break;
            case 77:
               var10000 = 37;
               break;
            case 78:
               var10000 = 213;
               break;
            case 79:
               var10000 = 164;
               break;
            case 80:
               var10000 = 133;
               break;
            case 81:
               var10000 = 219;
               break;
            case 82:
               var10000 = 158;
               break;
            case 83:
               var10000 = 134;
               break;
            case 84:
               var10000 = 184;
               break;
            case 85:
               var10000 = 137;
               break;
            case 86:
               var10000 = 35;
               break;
            case 87:
               var10000 = 4;
               break;
            case 88:
               var10000 = 238;
               break;
            case 89:
               var10000 = 170;
               break;
            case 90:
               var10000 = 173;
               break;
            case 91:
               var10000 = 17;
               break;
            case 92:
               var10000 = 200;
               break;
            case 93:
               var10000 = 168;
               break;
            case 94:
               var10000 = 111;
               break;
            case 95:
               var10000 = 244;
               break;
            case 96:
               var10000 = 123;
               break;
            case 97:
               var10000 = 77;
               break;
            case 98:
               var10000 = 153;
               break;
            case 99:
               var10000 = 99;
               break;
            case 100:
               var10000 = 51;
               break;
            case 101:
               var10000 = 109;
               break;
            case 102:
               var10000 = 175;
               break;
            case 103:
               var10000 = 239;
               break;
            case 104:
               var10000 = 8;
               break;
            case 105:
               var10000 = 85;
               break;
            case 106:
               var10000 = 49;
               break;
            case 107:
               var10000 = 252;
               break;
            case 108:
               var10000 = 236;
               break;
            case 109:
               var10000 = 222;
               break;
            case 110:
               var10000 = 95;
               break;
            case 111:
               var10000 = 78;
               break;
            case 112:
               var10000 = 71;
               break;
            case 113:
               var10000 = 195;
               break;
            case 114:
               var10000 = 33;
               break;
            case 115:
               var10000 = 157;
               break;
            case 116:
               var10000 = 229;
               break;
            case 117:
               var10000 = 23;
               break;
            case 118:
               var10000 = 131;
               break;
            case 119:
               var10000 = 212;
               break;
            case 120:
               var10000 = 16;
               break;
            case 121:
               var10000 = 97;
               break;
            case 122:
               var10000 = 30;
               break;
            case 123:
               var10000 = 90;
               break;
            case 124:
               var10000 = 176;
               break;
            case 125:
               var10000 = 249;
               break;
            case 126:
               var10000 = 206;
               break;
            case 127:
               var10000 = 54;
               break;
            case 128:
               var10000 = 187;
               break;
            case 129:
               var10000 = 57;
               break;
            case 130:
               var10000 = 26;
               break;
            case 131:
               var10000 = 205;
               break;
            case 132:
               var10000 = 55;
               break;
            case 133:
               var10000 = 155;
               break;
            case 134:
               var10000 = 159;
               break;
            case 135:
               var10000 = 240;
               break;
            case 136:
               var10000 = 232;
               break;
            case 137:
               var10000 = 172;
               break;
            case 138:
               var10000 = 89;
               break;
            case 139:
               var10000 = 58;
               break;
            case 140:
               var10000 = 188;
               break;
            case 141:
               var10000 = 125;
               break;
            case 142:
               var10000 = 171;
               break;
            case 143:
               var10000 = 146;
               break;
            case 144:
               var10000 = 113;
               break;
            case 145:
               var10000 = 193;
               break;
            case 146:
               var10000 = 162;
               break;
            case 147:
               var10000 = 226;
               break;
            case 148:
               var10000 = 105;
               break;
            case 149:
               var10000 = 79;
               break;
            case 150:
               var10000 = 42;
               break;
            case 151:
               var10000 = 88;
               break;
            case 152:
               var10000 = 143;
               break;
            case 153:
               var10000 = 124;
               break;
            case 154:
               var10000 = 216;
               break;
            case 155:
               var10000 = 211;
               break;
            case 156:
               var10000 = 169;
               break;
            case 157:
               var10000 = 92;
               break;
            case 158:
               var10000 = 243;
               break;
            case 159:
               var10000 = 141;
               break;
            case 160:
               var10000 = 207;
               break;
            case 161:
               var10000 = 96;
               break;
            case 162:
               var10000 = 83;
               break;
            case 163:
               var10000 = 197;
               break;
            case 164:
               var10000 = 203;
               break;
            case 165:
               var10000 = 122;
               break;
            case 166:
               var10000 = 104;
               break;
            case 167:
               var10000 = 108;
               break;
            case 168:
               var10000 = 217;
               break;
            case 169:
               var10000 = 25;
               break;
            case 170:
               var10000 = 115;
               break;
            case 171:
               var10000 = 82;
               break;
            case 172:
               var10000 = 59;
               break;
            case 173:
               var10000 = 22;
               break;
            case 174:
               var10000 = 5;
               break;
            case 175:
               var10000 = 94;
               break;
            case 176:
               var10000 = 182;
               break;
            case 177:
               var10000 = 13;
               break;
            case 178:
               var10000 = 73;
               break;
            case 179:
               var10000 = 190;
               break;
            case 180:
               var10000 = 138;
               break;
            case 181:
               var10000 = 75;
               break;
            case 182:
               var10000 = 38;
               break;
            case 183:
               var10000 = 152;
               break;
            case 184:
               var10000 = 221;
               break;
            case 185:
               var10000 = 45;
               break;
            case 186:
               var10000 = 196;
               break;
            case 187:
               var10000 = 76;
               break;
            case 188:
               var10000 = 72;
               break;
            case 189:
               var10000 = 3;
               break;
            case 190:
               var10000 = 129;
               break;
            case 191:
               var10000 = 117;
               break;
            case 192:
               var10000 = 154;
               break;
            case 193:
               var10000 = 144;
               break;
            case 194:
               var10000 = 247;
               break;
            case 195:
               var10000 = 223;
               break;
            case 196:
               var10000 = 21;
               break;
            case 197:
               var10000 = 142;
               break;
            case 198:
               var10000 = 218;
               break;
            case 199:
               var10000 = 31;
               break;
            case 200:
               var10000 = 12;
               break;
            case 201:
               var10000 = 220;
               break;
            case 202:
               var10000 = 43;
               break;
            case 203:
               var10000 = 1;
               break;
            case 204:
               var10000 = 98;
               break;
            case 205:
               var10000 = 2;
               break;
            case 206:
               var10000 = 53;
               break;
            case 207:
               var10000 = 248;
               break;
            case 208:
               var10000 = 241;
               break;
            case 209:
               var10000 = 198;
               break;
            case 210:
               var10000 = 10;
               break;
            case 211:
               var10000 = 84;
               break;
            case 212:
               var10000 = 140;
               break;
            case 213:
               var10000 = 208;
               break;
            case 214:
               var10000 = 47;
               break;
            case 215:
               var10000 = 151;
               break;
            case 216:
               var10000 = 74;
               break;
            case 217:
               var10000 = 52;
               break;
            case 218:
               var10000 = 246;
               break;
            case 219:
               var10000 = 139;
               break;
            case 220:
               var10000 = 14;
               break;
            case 221:
               var10000 = 150;
               break;
            case 222:
               var10000 = 0;
               break;
            case 223:
               var10000 = 100;
               break;
            case 224:
               var10000 = 62;
               break;
            case 225:
               var10000 = 66;
               break;
            case 226:
               var10000 = 163;
               break;
            case 227:
               var10000 = 250;
               break;
            case 228:
               var10000 = 11;
               break;
            case 229:
               var10000 = 121;
               break;
            case 230:
               var10000 = 110;
               break;
            case 231:
               var10000 = 118;
               break;
            case 232:
               var10000 = 114;
               break;
            case 233:
               var10000 = 147;
               break;
            case 234:
               var10000 = 36;
               break;
            case 235:
               var10000 = 234;
               break;
            case 236:
               var10000 = 130;
               break;
            case 237:
               var10000 = 251;
               break;
            case 238:
               var10000 = 149;
               break;
            case 239:
               var10000 = 253;
               break;
            case 240:
               var10000 = 199;
               break;
            case 241:
               var10000 = 215;
               break;
            case 242:
               var10000 = 179;
               break;
            case 243:
               var10000 = 189;
               break;
            case 244:
               var10000 = 135;
               break;
            case 245:
               var10000 = 120;
               break;
            case 246:
               var10000 = 116;
               break;
            case 247:
               var10000 = 127;
               break;
            case 248:
               var10000 = 7;
               break;
            case 249:
               var10000 = 64;
               break;
            case 250:
               var10000 = 87;
               break;
            case 251:
               var10000 = 145;
               break;
            case 252:
               var10000 = 237;
               break;
            case 253:
               var10000 = 186;
               break;
            case 254:
               var10000 = 254;
               break;
            default:
               var10000 = 204;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31559;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[14];
      int var11 = 0;
      String var10 = "á\u0005ry²ÙuA\u0085\f%æ÷µþ\u0091í°è\u008d\u0005=\r\u000e6EzîT5¶KLw9a\u001buGß\u008f¯u ±-\u009b6.;\u0003Ñ8nóPó\u001fKhÅêÔE\nS¶þ<\u0088#\u0082}¹§\u000fø\u001aL*\u0089b\u0003Î5B¾ÄÐÁ\u008e\nÜ04l©\u0094\u0080»¶\u000b\u000e\u0013$1í&\u009aöÑ\u008b¡i¸0T\u000fh\u008eC\b\u0094õ¿\u008a\u0012Y\u0093n\u008axé\fú¦\f½\u0081\u0090\u0002\u0090\u0015\u0089º½\bYîÍ·Ôû/Ç\f\u0015÷U\u0091ä¶6êUÜtX";
      int var12 = "á\u0005ry²ÙuA\u0085\f%æ÷µþ\u0091í°è\u008d\u0005=\r\u000e6EzîT5¶KLw9a\u001buGß\u008f¯u ±-\u009b6.;\u0003Ñ8nóPó\u001fKhÅêÔE\nS¶þ<\u0088#\u0082}¹§\u000fø\u001aL*\u0089b\u0003Î5B¾ÄÐÁ\u008e\nÜ04l©\u0094\u0080»¶\u000b\u000e\u0013$1í&\u009aöÑ\u008b¡i¸0T\u000fh\u008eC\b\u0094õ¿\u008a\u0012Y\u0093n\u008axé\fú¦\f½\u0081\u0090\u0002\u0090\u0015\u0089º½\bYîÍ·Ôû/Ç\f\u0015÷U\u0091ä¶6êUÜtX"
         .length();
      char var9 = '\t';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 13;
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
                        var65 = 52;
                        break;
                     case 1:
                        var65 = 109;
                        break;
                     case 2:
                        var65 = 10;
                        break;
                     case 3:
                        var65 = 74;
                        break;
                     case 4:
                        var65 = 47;
                        break;
                     case 5:
                        var65 = 64;
                        break;
                     default:
                        var65 = 22;
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
                     a = var13;
                     b = new String[14];
                     long var0 = 8124686281432442946L;
                     long[] var6 = new long[10];
                     int var3 = 0;
                     String var4 = "ESÄ¡GÃö³\u0097ÃÉùv¤\u0015\u009cë.ãÛ\u0016\u0090\u0011ò\u0003Óf;°óVi\"Ô×\u001b}&'µK\u0085µ»\u008a\u0006´@°Õ\u009bR\na\u001aõ\u0018õXgÃB\u0010g";
                     int var5 = "ESÄ¡GÃö³\u0097ÃÉùv¤\u0015\u009cë.ãÛ\u0016\u0090\u0011ò\u0003Óf;°óVi\"Ô×\u001b}&'µK\u0085µ»\u008a\u0006´@°Õ\u009bR\na\u001aõ\u0018õXgÃB\u0010g"
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
                                    c = var6;
                                    d = new Integer[10];
                                    g = new Wp4();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "Ði«\u0012Mà\u0010ýB7°\u001deõd\u0014";
                                 var5 = "Ði«\u0012Mà\u0010ýB7°\u001deõd\u0014".length();
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

                  var10 = "\t\u000f¬TÚ\u0098¢\"´E\u000fJ/\u0013\u0085k\u009eVX\u0096\u0099Ã¶v\u0086S";
                  var12 = "\t\u000f¬TÚ\u0098¢\"´E\u000fJ/\u0013\u0085k\u009eVX\u0096\u0099Ã¶v\u0086S".length();
                  var9 = '\n';
                  var17 = -1;
            }

            var10000 = 5;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





