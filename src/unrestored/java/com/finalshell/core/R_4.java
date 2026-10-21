package com.finalshell.core;

import java.nio.charset.Charset;

public final class R_4 {
   public static String o;
   public static String[] a;
   public static String[] b;
   public static long c;

   public static void main(String[] param0) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/finalshell/core/K_4.y Ljava/io/File;
      // 003: astore 2
      // 004: bipush 0
      // 005: anewarray 28
      // 008: astore 3
      // 009: invokestatic com/finalshell/core/K_5.y ()[Ljava/lang/String;
      // 00c: bipush 1
      // 00d: anewarray 28
      // 010: dup
      // 011: bipush 0
      // 012: new java/io/File
      // 015: dup
      // 016: ldc "."
      // 018: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 01b: aastore
      // 01c: astore 4
      // 01e: bipush 0
      // 01f: anewarray 28
      // 022: astore 5
      // 024: aconst_null
      // 025: astore 6
      // 027: invokestatic java/nio/charset/Charset.defaultCharset ()Ljava/nio/charset/Charset;
      // 02a: astore 7
      // 02c: bipush 0
      // 02d: istore 8
      // 02f: bipush 1
      // 030: istore 9
      // 032: bipush 1
      // 033: istore 10
      // 035: bipush 0
      // 036: istore 11
      // 038: bipush 0
      // 039: istore 12
      // 03b: astore 1
      // 03c: bipush 0
      // 03d: istore 13
      // 03f: iload 13
      // 041: aload 0
      // 042: arraylength
      // 043: if_icmpge 356
      // 046: aload 0
      // 047: iload 13
      // 049: aaload
      // 04a: astore 14
      // 04c: aload 14
      // 04e: bipush 0
      // 04f: invokevirtual java/lang/String.charAt (I)C
      // 052: aload 1
      // 053: ifnull 080
      // 056: getstatic com/finalshell/core/R_4.c J
      // 059: l2i
      // 05a: aload 1
      // 05b: ifnull 35a
      // 05e: goto 065
      // 061: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 064: athrow
      // 065: if_icmpeq 072
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06e: athrow
      // 06f: goto 356
      // 072: sipush 25465
      // 075: sipush -4019
      // 078: invokestatic com/finalshell/core/R_4.a (II)Ljava/lang/String;
      // 07b: aload 14
      // 07d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 080: aload 1
      // 081: ifnull 0b6
      // 084: ifeq 0a1
      // 087: goto 08e
      // 08a: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08d: athrow
      // 08e: new java/io/File
      // 091: dup
      // 092: aload 0
      // 093: iinc 13 1
      // 096: iload 13
      // 098: aaload
      // 099: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 09c: astore 2
      // 09d: aload 1
      // 09e: ifnonnull 34f
      // 0a1: sipush 25454
      // 0a4: sipush -1175
      // 0a7: invokestatic com/finalshell/core/R_4.a (II)Ljava/lang/String;
      // 0aa: aload 14
      // 0ac: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0af: goto 0b6
      // 0b2: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b5: athrow
      // 0b6: aload 1
      // 0b7: ifnull 0e8
      // 0ba: ifeq 0d3
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: iinc 13 1
      // 0c8: iload 13
      // 0ca: aaload
      // 0cb: invokestatic com/finalshell/core/N_5.H (Ljava/lang/String;)[Ljava/io/File;
      // 0ce: astore 3
      // 0cf: aload 1
      // 0d0: ifnonnull 34f
      // 0d3: sipush 25450
      // 0d6: sipush 17894
      // 0d9: invokestatic com/finalshell/core/R_4.a (II)Ljava/lang/String;
      // 0dc: aload 14
      // 0de: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e7: athrow
      // 0e8: aload 1
      // 0e9: ifnull 11b
      // 0ec: ifeq 106
      // 0ef: goto 0f6
      // 0f2: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f5: athrow
      // 0f6: aload 0
      // 0f7: iinc 13 1
      // 0fa: iload 13
      // 0fc: aaload
      // 0fd: invokestatic com/finalshell/core/N_5.H (Ljava/lang/String;)[Ljava/io/File;
      // 100: astore 4
      // 102: aload 1
      // 103: ifnonnull 34f
      // 106: sipush 25466
      // 109: sipush -29902
      // 10c: invokestatic com/finalshell/core/R_4.a (II)Ljava/lang/String;
      // 10f: aload 14
      // 111: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 114: goto 11b
      // 117: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11a: athrow
      // 11b: aload 1
      // 11c: ifnull 14e
      // 11f: ifeq 139
      // 122: goto 129
      // 125: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 128: athrow
      // 129: aload 0
      // 12a: iinc 13 1
      // 12d: iload 13
      // 12f: aaload
      // 130: invokestatic com/finalshell/core/N_5.H (Ljava/lang/String;)[Ljava/io/File;
      // 133: astore 5
      // 135: aload 1
      // 136: ifnonnull 34f
      // 139: sipush 25448
      // 13c: sipush -11805
      // 13f: invokestatic com/finalshell/core/R_4.a (II)Ljava/lang/String;
      // 142: aload 14
      // 144: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 147: goto 14e
      // 14a: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14d: athrow
      // 14e: aload 1
      // 14f: ifnull 181
      // 152: ifeq 16c
      // 155: goto 15c
      // 158: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15b: athrow
      // 15c: aload 0
      // 15d: iinc 13 1
      // 160: iload 13
      // 162: aaload
      // 163: invokestatic com/finalshell/core/N_5.H (Ljava/lang/String;)[Ljava/io/File;
      // 166: astore 6
      // 168: aload 1
      // 169: ifnonnull 34f
      // 16c: sipush 25471
      // 16f: sipush 16166
      // 172: invokestatic com/finalshell/core/R_4.a (II)Ljava/lang/String;
      // 175: aload 14
      // 177: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 17a: goto 181
      // 17d: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 180: athrow
      // 181: aload 1
      // 182: ifnull 1b4
      // 185: ifeq 19f
      // 188: goto 18f
      // 18b: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18e: athrow
      // 18f: aload 0
      // 190: iinc 13 1
      // 193: iload 13
      // 195: aaload
      // 196: invokestatic java/nio/charset/Charset.forName (Ljava/lang/String;)Ljava/nio/charset/Charset;
      // 199: astore 7
      // 19b: aload 1
      // 19c: ifnonnull 34f
      // 19f: sipush 25447
      // 1a2: sipush 16130
      // 1a5: invokestatic com/finalshell/core/R_4.a (II)Ljava/lang/String;
      // 1a8: aload 14
      // 1aa: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1ad: goto 1b4
      // 1b0: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b3: athrow
      // 1b4: aload 1
      // 1b5: ifnull 1de
      // 1b8: ifeq 1c9
      // 1bb: goto 1c2
      // 1be: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c1: athrow
      // 1c2: bipush 1
      // 1c3: istore 8
      // 1c5: aload 1
      // 1c6: ifnonnull 34f
      // 1c9: sipush 25449
      // 1cc: sipush 3629
      // 1cf: invokestatic com/finalshell/core/R_4.a (II)Ljava/lang/String;
      // 1d2: aload 14
      // 1d4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1d7: goto 1de
      // 1da: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1dd: athrow
      // 1de: aload 1
      // 1df: ifnull 20e
      // 1e2: ifeq 1f9
      // 1e5: goto 1ec
      // 1e8: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1eb: athrow
      // 1ec: bipush 1
      // 1ed: istore 9
      // 1ef: bipush 1
      // 1f0: istore 10
      // 1f2: bipush 1
      // 1f3: istore 11
      // 1f5: aload 1
      // 1f6: ifnonnull 34f
      // 1f9: aload 14
      // 1fb: sipush 25442
      // 1fe: sipush -8285
      // 201: invokestatic com/finalshell/core/R_4.a (II)Ljava/lang/String;
      // 204: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 207: goto 20e
      // 20a: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20d: athrow
      // 20e: aload 1
      // 20f: ifnull 2c2
      // 212: ifeq 2ad
      // 215: goto 21c
      // 218: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21b: athrow
      // 21c: aload 14
      // 21e: sipush 25467
      // 221: sipush 17063
      // 224: invokestatic com/finalshell/core/R_4.a (II)Ljava/lang/String;
      // 227: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 22a: bipush -1
      // 22b: aload 1
      // 22c: ifnull 258
      // 22f: goto 236
      // 232: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 235: athrow
      // 236: if_icmpeq 249
      // 239: goto 240
      // 23c: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23f: athrow
      // 240: bipush 0
      // 241: dup
      // 242: istore 11
      // 244: dup
      // 245: istore 10
      // 247: istore 9
      // 249: aload 14
      // 24b: sipush 25444
      // 24e: sipush 12482
      // 251: invokestatic com/finalshell/core/R_4.a (II)Ljava/lang/String;
      // 254: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 257: bipush -1
      // 258: aload 1
      // 259: ifnull 278
      // 25c: if_icmpeq 269
      // 25f: goto 266
      // 262: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 265: athrow
      // 266: bipush 1
      // 267: istore 9
      // 269: aload 14
      // 26b: sipush 25443
      // 26e: sipush -2268
      // 271: invokestatic com/finalshell/core/R_4.a (II)Ljava/lang/String;
      // 274: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 277: bipush -1
      // 278: aload 1
      // 279: ifnull 2a3
      // 27c: if_icmpeq 289
      // 27f: goto 286
      // 282: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 285: athrow
      // 286: bipush 1
      // 287: istore 10
      // 289: aload 14
      // 28b: sipush 25452
      // 28e: sipush -8991
      // 291: invokestatic com/finalshell/core/R_4.a (II)Ljava/lang/String;
      // 294: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 297: aload 1
      // 298: ifnull 2a7
      // 29b: bipush -1
      // 29c: goto 2a3
      // 29f: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a2: athrow
      // 2a3: if_icmpeq 34f
      // 2a6: bipush 1
      // 2a7: istore 11
      // 2a9: aload 1
      // 2aa: ifnonnull 34f
      // 2ad: sipush 25464
      // 2b0: sipush 16214
      // 2b3: invokestatic com/finalshell/core/R_4.a (II)Ljava/lang/String;
      // 2b6: aload 14
      // 2b8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2bb: goto 2c2
      // 2be: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c1: athrow
      // 2c2: aload 1
      // 2c3: ifnull 2ec
      // 2c6: ifeq 2d7
      // 2c9: goto 2d0
      // 2cc: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cf: athrow
      // 2d0: bipush 1
      // 2d1: istore 12
      // 2d3: aload 1
      // 2d4: ifnonnull 34f
      // 2d7: sipush 25451
      // 2da: sipush 16455
      // 2dd: invokestatic com/finalshell/core/R_4.a (II)Ljava/lang/String;
      // 2e0: aload 14
      // 2e2: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2e5: goto 2ec
      // 2e8: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2eb: athrow
      // 2ec: aload 1
      // 2ed: ifnull 34c
      // 2f0: ifeq 317
      // 2f3: goto 2fa
      // 2f6: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f9: athrow
      // 2fa: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 2fd: getstatic com/finalshell/core/R_4.o Ljava/lang/String;
      // 300: aconst_null
      // 301: checkcast [Ljava/lang/Object;
      // 304: invokevirtual java/io/PrintStream.printf (Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
      // 307: pop
      // 308: bipush 1
      // 309: invokestatic java/lang/System.exit (I)V
      // 30c: aload 1
      // 30d: ifnonnull 34f
      // 310: goto 317
      // 313: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 316: athrow
      // 317: getstatic java/lang/System.err Ljava/io/PrintStream;
      // 31a: new java/lang/StringBuilder
      // 31d: dup
      // 31e: invokespecial java/lang/StringBuilder.<init> ()V
      // 321: sipush 25453
      // 324: sipush 18811
      // 327: invokestatic com/finalshell/core/R_4.a (II)Ljava/lang/String;
      // 32a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32d: aload 14
      // 32f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 332: sipush 25455
      // 335: sipush 3990
      // 338: invokestatic com/finalshell/core/R_4.a (II)Ljava/lang/String;
      // 33b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 33e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 341: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 344: bipush 1
      // 345: goto 34c
      // 348: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34b: athrow
      // 34c: invokestatic java/lang/System.exit (I)V
      // 34f: iinc 13 1
      // 352: aload 1
      // 353: ifnonnull 03f
      // 356: iload 13
      // 358: aload 0
      // 359: arraylength
      // 35a: aload 1
      // 35b: ifnull 386
      // 35e: if_icmpne 382
      // 361: goto 368
      // 364: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 367: athrow
      // 368: getstatic java/lang/System.err Ljava/io/PrintStream;
      // 36b: sipush 25446
      // 36e: sipush -31836
      // 371: invokestatic com/finalshell/core/R_4.a (II)Ljava/lang/String;
      // 374: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 377: bipush 1
      // 378: invokestatic java/lang/System.exit (I)V
      // 37b: goto 382
      // 37e: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 381: athrow
      // 382: aload 0
      // 383: arraylength
      // 384: iload 13
      // 386: isub
      // 387: anewarray 28
      // 38a: astore 14
      // 38c: iload 13
      // 38e: istore 15
      // 390: iload 15
      // 392: aload 0
      // 393: arraylength
      // 394: if_icmpge 3b1
      // 397: aload 14
      // 399: iload 15
      // 39b: iload 13
      // 39d: isub
      // 39e: new java/io/File
      // 3a1: dup
      // 3a2: aload 0
      // 3a3: iload 15
      // 3a5: aaload
      // 3a6: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 3a9: aastore
      // 3aa: iinc 15 1
      // 3ad: aload 1
      // 3ae: ifnonnull 390
      // 3b1: ldc com/finalshell/core/R_4
      // 3b3: invokevirtual java/lang/Class.getClassLoader ()Ljava/lang/ClassLoader;
      // 3b6: invokestatic com/finalshell/core/Z3_2.A (Ljava/lang/ClassLoader;)Lcom/finalshell/core/U_2_2;
      // 3b9: invokeinterface com/finalshell/core/U_2_2.x ()Lcom/finalshell/core/K_4; 1
      // 3be: astore 15
      // 3c0: aload 15
      // 3c2: aload 3
      // 3c3: invokeinterface com/finalshell/core/K_4.l ([Ljava/io/File;)V 2
      // 3c8: aload 15
      // 3ca: aload 4
      // 3cc: invokeinterface com/finalshell/core/K_4.R ([Ljava/io/File;)V 2
      // 3d1: aload 15
      // 3d3: aload 5
      // 3d5: invokeinterface com/finalshell/core/K_4.B ([Ljava/io/File;)V 2
      // 3da: aload 1
      // 3db: ifnull 43b
      // 3de: aload 6
      // 3e0: ifnull 3fa
      // 3e3: goto 3ea
      // 3e6: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e9: athrow
      // 3ea: aload 15
      // 3ec: aload 6
      // 3ee: invokeinterface com/finalshell/core/K_4.Q ([Ljava/io/File;)V 2
      // 3f3: goto 3fa
      // 3f6: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f9: athrow
      // 3fa: aload 15
      // 3fc: aload 2
      // 3fd: iload 12
      // 3ff: invokeinterface com/finalshell/core/K_4.Z (Ljava/io/File;Z)V 3
      // 404: aload 15
      // 406: aload 7
      // 408: invokeinterface com/finalshell/core/K_4.M (Ljava/nio/charset/Charset;)V 2
      // 40d: aload 15
      // 40f: iload 8
      // 411: invokeinterface com/finalshell/core/K_4.U (Z)V 2
      // 416: aload 15
      // 418: iload 9
      // 41a: invokeinterface com/finalshell/core/K_4.Z (Z)V 2
      // 41f: aload 15
      // 421: iload 10
      // 423: invokeinterface com/finalshell/core/K_4.e (Z)V 2
      // 428: aload 15
      // 42a: iload 11
      // 42c: invokeinterface com/finalshell/core/K_4.r (Z)V 2
      // 431: aload 15
      // 433: aload 14
      // 435: invokeinterface com/finalshell/core/K_4.W ([Ljava/io/File;)Z 2
      // 43a: pop
      // 43b: goto 476
      // 43e: astore 16
      // 440: aload 1
      // 441: ifnull 45c
      // 444: iload 8
      // 446: ifeq 460
      // 449: goto 450
      // 44c: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44f: athrow
      // 450: aload 16
      // 452: invokevirtual java/lang/Exception.printStackTrace ()V
      // 455: goto 45c
      // 458: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45b: athrow
      // 45c: aload 1
      // 45d: ifnonnull 472
      // 460: getstatic java/lang/System.err Ljava/io/PrintStream;
      // 463: aload 16
      // 465: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 468: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 46b: goto 472
      // 46e: invokestatic com/finalshell/core/R_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 471: athrow
      // 472: bipush 1
      // 473: invokestatic java/lang/System.exit (I)V
      // 476: return
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 25451) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 65;
               break;
            case 1:
               var10000 = 158;
               break;
            case 2:
               var10000 = 217;
               break;
            case 3:
               var10000 = 72;
               break;
            case 4:
               var10000 = 137;
               break;
            case 5:
               var10000 = 82;
               break;
            case 6:
               var10000 = 28;
               break;
            case 7:
               var10000 = 81;
               break;
            case 8:
               var10000 = 58;
               break;
            case 9:
               var10000 = 84;
               break;
            case 10:
               var10000 = 96;
               break;
            case 11:
               var10000 = 5;
               break;
            case 12:
               var10000 = 179;
               break;
            case 13:
               var10000 = 17;
               break;
            case 14:
               var10000 = 67;
               break;
            case 15:
               var10000 = 25;
               break;
            case 16:
               var10000 = 100;
               break;
            case 17:
               var10000 = 153;
               break;
            case 18:
               var10000 = 15;
               break;
            case 19:
               var10000 = 52;
               break;
            case 20:
               var10000 = 238;
               break;
            case 21:
               var10000 = 186;
               break;
            case 22:
               var10000 = 93;
               break;
            case 23:
               var10000 = 87;
               break;
            case 24:
               var10000 = 162;
               break;
            case 25:
               var10000 = 64;
               break;
            case 26:
               var10000 = 78;
               break;
            case 27:
               var10000 = 160;
               break;
            case 28:
               var10000 = 122;
               break;
            case 29:
               var10000 = 206;
               break;
            case 30:
               var10000 = 68;
               break;
            case 31:
               var10000 = 35;
               break;
            case 32:
               var10000 = 32;
               break;
            case 33:
               var10000 = 45;
               break;
            case 34:
               var10000 = 250;
               break;
            case 35:
               var10000 = 201;
               break;
            case 36:
               var10000 = 181;
               break;
            case 37:
               var10000 = 97;
               break;
            case 38:
               var10000 = 92;
               break;
            case 39:
               var10000 = 115;
               break;
            case 40:
               var10000 = 198;
               break;
            case 41:
               var10000 = 230;
               break;
            case 42:
               var10000 = 142;
               break;
            case 43:
               var10000 = 121;
               break;
            case 44:
               var10000 = 144;
               break;
            case 45:
               var10000 = 124;
               break;
            case 46:
               var10000 = 6;
               break;
            case 47:
               var10000 = 83;
               break;
            case 48:
               var10000 = 140;
               break;
            case 49:
               var10000 = 61;
               break;
            case 50:
               var10000 = 44;
               break;
            case 51:
               var10000 = 56;
               break;
            case 52:
               var10000 = 159;
               break;
            case 53:
               var10000 = 133;
               break;
            case 54:
               var10000 = 204;
               break;
            case 55:
               var10000 = 49;
               break;
            case 56:
               var10000 = 119;
               break;
            case 57:
               var10000 = 246;
               break;
            case 58:
               var10000 = 231;
               break;
            case 59:
               var10000 = 187;
               break;
            case 60:
               var10000 = 254;
               break;
            case 61:
               var10000 = 24;
               break;
            case 62:
               var10000 = 157;
               break;
            case 63:
               var10000 = 209;
               break;
            case 64:
               var10000 = 223;
               break;
            case 65:
               var10000 = 55;
               break;
            case 66:
               var10000 = 123;
               break;
            case 67:
               var10000 = 152;
               break;
            case 68:
               var10000 = 59;
               break;
            case 69:
               var10000 = 165;
               break;
            case 70:
               var10000 = 54;
               break;
            case 71:
               var10000 = 105;
               break;
            case 72:
               var10000 = 251;
               break;
            case 73:
               var10000 = 10;
               break;
            case 74:
               var10000 = 107;
               break;
            case 75:
               var10000 = 188;
               break;
            case 76:
               var10000 = 180;
               break;
            case 77:
               var10000 = 242;
               break;
            case 78:
               var10000 = 129;
               break;
            case 79:
               var10000 = 226;
               break;
            case 80:
               var10000 = 216;
               break;
            case 81:
               var10000 = 116;
               break;
            case 82:
               var10000 = 141;
               break;
            case 83:
               var10000 = 101;
               break;
            case 84:
               var10000 = 174;
               break;
            case 85:
               var10000 = 147;
               break;
            case 86:
               var10000 = 88;
               break;
            case 87:
               var10000 = 22;
               break;
            case 88:
               var10000 = 69;
               break;
            case 89:
               var10000 = 86;
               break;
            case 90:
               var10000 = 214;
               break;
            case 91:
               var10000 = 178;
               break;
            case 92:
               var10000 = 218;
               break;
            case 93:
               var10000 = 213;
               break;
            case 94:
               var10000 = 199;
               break;
            case 95:
               var10000 = 14;
               break;
            case 96:
               var10000 = 196;
               break;
            case 97:
               var10000 = 189;
               break;
            case 98:
               var10000 = 228;
               break;
            case 99:
               var10000 = 34;
               break;
            case 100:
               var10000 = 36;
               break;
            case 101:
               var10000 = 202;
               break;
            case 102:
               var10000 = 77;
               break;
            case 103:
               var10000 = 146;
               break;
            case 104:
               var10000 = 70;
               break;
            case 105:
               var10000 = 29;
               break;
            case 106:
               var10000 = 50;
               break;
            case 107:
               var10000 = 43;
               break;
            case 108:
               var10000 = 136;
               break;
            case 109:
               var10000 = 163;
               break;
            case 110:
               var10000 = 161;
               break;
            case 111:
               var10000 = 234;
               break;
            case 112:
               var10000 = 173;
               break;
            case 113:
               var10000 = 239;
               break;
            case 114:
               var10000 = 249;
               break;
            case 115:
               var10000 = 164;
               break;
            case 116:
               var10000 = 148;
               break;
            case 117:
               var10000 = 20;
               break;
            case 118:
               var10000 = 112;
               break;
            case 119:
               var10000 = 40;
               break;
            case 120:
               var10000 = 244;
               break;
            case 121:
               var10000 = 197;
               break;
            case 122:
               var10000 = 208;
               break;
            case 123:
               var10000 = 62;
               break;
            case 124:
               var10000 = 73;
               break;
            case 125:
               var10000 = 127;
               break;
            case 126:
               var10000 = 3;
               break;
            case 127:
               var10000 = 80;
               break;
            case 128:
               var10000 = 225;
               break;
            case 129:
               var10000 = 167;
               break;
            case 130:
               var10000 = 103;
               break;
            case 131:
               var10000 = 42;
               break;
            case 132:
               var10000 = 120;
               break;
            case 133:
               var10000 = 27;
               break;
            case 134:
               var10000 = 154;
               break;
            case 135:
               var10000 = 229;
               break;
            case 136:
               var10000 = 114;
               break;
            case 137:
               var10000 = 155;
               break;
            case 138:
               var10000 = 166;
               break;
            case 139:
               var10000 = 203;
               break;
            case 140:
               var10000 = 60;
               break;
            case 141:
               var10000 = 143;
               break;
            case 142:
               var10000 = 255;
               break;
            case 143:
               var10000 = 8;
               break;
            case 144:
               var10000 = 47;
               break;
            case 145:
               var10000 = 232;
               break;
            case 146:
               var10000 = 108;
               break;
            case 147:
               var10000 = 221;
               break;
            case 148:
               var10000 = 134;
               break;
            case 149:
               var10000 = 16;
               break;
            case 150:
               var10000 = 210;
               break;
            case 151:
               var10000 = 2;
               break;
            case 152:
               var10000 = 18;
               break;
            case 153:
               var10000 = 91;
               break;
            case 154:
               var10000 = 236;
               break;
            case 155:
               var10000 = 237;
               break;
            case 156:
               var10000 = 211;
               break;
            case 157:
               var10000 = 150;
               break;
            case 158:
               var10000 = 182;
               break;
            case 159:
               var10000 = 193;
               break;
            case 160:
               var10000 = 33;
               break;
            case 161:
               var10000 = 205;
               break;
            case 162:
               var10000 = 138;
               break;
            case 163:
               var10000 = 212;
               break;
            case 164:
               var10000 = 12;
               break;
            case 165:
               var10000 = 94;
               break;
            case 166:
               var10000 = 253;
               break;
            case 167:
               var10000 = 13;
               break;
            case 168:
               var10000 = 74;
               break;
            case 169:
               var10000 = 38;
               break;
            case 170:
               var10000 = 171;
               break;
            case 171:
               var10000 = 172;
               break;
            case 172:
               var10000 = 168;
               break;
            case 173:
               var10000 = 71;
               break;
            case 174:
               var10000 = 0;
               break;
            case 175:
               var10000 = 4;
               break;
            case 176:
               var10000 = 247;
               break;
            case 177:
               var10000 = 139;
               break;
            case 178:
               var10000 = 37;
               break;
            case 179:
               var10000 = 240;
               break;
            case 180:
               var10000 = 90;
               break;
            case 181:
               var10000 = 51;
               break;
            case 182:
               var10000 = 149;
               break;
            case 183:
               var10000 = 75;
               break;
            case 184:
               var10000 = 98;
               break;
            case 185:
               var10000 = 57;
               break;
            case 186:
               var10000 = 118;
               break;
            case 187:
               var10000 = 215;
               break;
            case 188:
               var10000 = 243;
               break;
            case 189:
               var10000 = 195;
               break;
            case 190:
               var10000 = 95;
               break;
            case 191:
               var10000 = 190;
               break;
            case 192:
               var10000 = 185;
               break;
            case 193:
               var10000 = 63;
               break;
            case 194:
               var10000 = 26;
               break;
            case 195:
               var10000 = 117;
               break;
            case 196:
               var10000 = 109;
               break;
            case 197:
               var10000 = 19;
               break;
            case 198:
               var10000 = 53;
               break;
            case 199:
               var10000 = 99;
               break;
            case 200:
               var10000 = 11;
               break;
            case 201:
               var10000 = 125;
               break;
            case 202:
               var10000 = 170;
               break;
            case 203:
               var10000 = 106;
               break;
            case 204:
               var10000 = 104;
               break;
            case 205:
               var10000 = 130;
               break;
            case 206:
               var10000 = 151;
               break;
            case 207:
               var10000 = 113;
               break;
            case 208:
               var10000 = 30;
               break;
            case 209:
               var10000 = 135;
               break;
            case 210:
               var10000 = 191;
               break;
            case 211:
               var10000 = 23;
               break;
            case 212:
               var10000 = 48;
               break;
            case 213:
               var10000 = 46;
               break;
            case 214:
               var10000 = 89;
               break;
            case 215:
               var10000 = 39;
               break;
            case 216:
               var10000 = 248;
               break;
            case 217:
               var10000 = 76;
               break;
            case 218:
               var10000 = 85;
               break;
            case 219:
               var10000 = 194;
               break;
            case 220:
               var10000 = 207;
               break;
            case 221:
               var10000 = 7;
               break;
            case 222:
               var10000 = 176;
               break;
            case 223:
               var10000 = 145;
               break;
            case 224:
               var10000 = 156;
               break;
            case 225:
               var10000 = 66;
               break;
            case 226:
               var10000 = 219;
               break;
            case 227:
               var10000 = 21;
               break;
            case 228:
               var10000 = 79;
               break;
            case 229:
               var10000 = 224;
               break;
            case 230:
               var10000 = 102;
               break;
            case 231:
               var10000 = 132;
               break;
            case 232:
               var10000 = 220;
               break;
            case 233:
               var10000 = 177;
               break;
            case 234:
               var10000 = 1;
               break;
            case 235:
               var10000 = 233;
               break;
            case 236:
               var10000 = 111;
               break;
            case 237:
               var10000 = 110;
               break;
            case 238:
               var10000 = 184;
               break;
            case 239:
               var10000 = 200;
               break;
            case 240:
               var10000 = 222;
               break;
            case 241:
               var10000 = 126;
               break;
            case 242:
               var10000 = 245;
               break;
            case 243:
               var10000 = 235;
               break;
            case 244:
               var10000 = 31;
               break;
            case 245:
               var10000 = 175;
               break;
            case 246:
               var10000 = 9;
               break;
            case 247:
               var10000 = 252;
               break;
            case 248:
               var10000 = 131;
               break;
            case 249:
               var10000 = 192;
               break;
            case 250:
               var10000 = 41;
               break;
            case 251:
               var10000 = 227;
               break;
            case 252:
               var10000 = 128;
               break;
            case 253:
               var10000 = 241;
               break;
            case 254:
               var10000 = 169;
               break;
            default:
               var10000 = 183;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var23;
      String[] var7 = new String[21];
      int var5 = 0;
      String var4 = "?\"%\u009e\u0004\n\u009cêXà\u0080°ky«%\u0002\u0019ç\u000eT\"BÖ§©tHÐ\u0018¤f\fÿ\u000f)þL$Æ\u0095ÒÕ\u009f\u009bÍc\u0092¹\u0011\u000bÙBóó\u0097T½æÓù\u008c\"¸¢µAð\u001c`|\"y¶g\u00adqí\u0080}b\u0018÷\u0096iS\u008d\u0098+''\u0001?\u009a\u001eèÐ\u0004\r2D«\u0005\u0006!`ÖÅ\u0003¢ûÉ͏\u009bÑXåYåË¸ \u0012kØ[\t çþä\u0011YàP \u009d\u008e\u0088ìæH1ù\u001cñ\u001bí¾ô\\\u0080@TW27eÃìtbIËÍ\\·\u008cÊ>E1\u0007iZ=´x\u0018_\u00139Üà\u001cý¦\rÉ½ÜåUõÉ0ö\u0011\u0016\t\u0015<4\u0095\u0091znÐ\f\u009f;ü\u0016ûË\u0097®\u008fî¥X/|å§\u0092C0}>¯=\u0095Ê\u001e\u0083\u008d\u0005ÏC\u008d\u001e\u001dr;}®:ºFÔrÙÏÇõñ~¨Ý\u0002\u0004#\u008bjOGGo\u001dÐñ\u0006Áq\u0094J\u0099òò\u0018§PÌ0Ïß\u0087\u0018\u0084ul\u0018RÓx$Ì$!\u0095;æO\u009d¨\u0094êøDö}TöÊRbÓñ\u0099\u0004{Ox!$óî \u0013\u0010\u00021.t\u008dvé\u008cûà\u0006Å\u000e\t^^òMÛV7N§\u0088Ó¾\u0017\u0089è?\\\u0012jõÝ{ÕL\u001e\bF\u00883\"\u0094\u001dÒ/a|\u0091l\bÅÎ¯\u0011ÞõÆ(½Z£s\u000bkN0\u0000$dÙ|\u000bù9+ªå\u001cÄ\n\u009cdã\u0017\u000bâIr\u009e,Æ½ØM{ÄÃB'=³B[ñÖµvÍ¡\u007f>æ\u0087\u000e4Hbs\rG\u0010$È;zlA³\"ØÃîE\u008f´\u000e'm\u0080¦«\u00153[5S\u009c,Iý¨M\u0007\u0001´t¡\u000f\u0014½ð-\u0085òE8K¿\u009bãFì³ópÍPÄòÒR\u0014øÉ\r.iî\u009f\u008eï\u000b\u0085F\u00198¹qc\u009fy\u0097\u0094\u001b¸,+æ\u0007ÉØ9è\t\u001d\u0004Þ\\âT>tQ®\u0085í¹§\u00adyx[¨R\u0012\u0018ÝÚ¤w\u00adWKÍ\u001b#ø á\u0002¸ÀSmD\u0019å\u008ff«öÈÉÑ\u0012í_+ùr÷e)±³$aL\u0007^ý]\u00ad¼\u001aùQ\u008aiïv\u0019;X6¸\u0011\u0081¯\u0095\u009aâ}¨Yú\u0087n£}®3õèî\r\f\u0005w~\fû\u001b\u0004q\u0097æÙ\u000b&÷Öé\u0012\u0016\u0095ß$é\u0093õ>,\u001f»$Ì\u0000\u009e\tmø8ê\u008aø>Oé\u001dËLÕ¸é§çm\u009aÒÅÜo ¿FpÄ6¥\u0018x\u00ad\u0081å m NÖ\u009daZ\u0006\u0004ðéña\u0006n3µbS¡2\u009b¢d\u009cÀ\u0001À\u001eßx\u007f\bæ¾\u0004/Iè#\u0085\rÅW\u0006ge\u0083ü^k=\u0082\u000ba2\u009c\u009c\u000f³o&ý\u0000DMøÁ{\u0001<þ\u0090\u001795:0U\u0011b\t\u009b<å\u0095«z=×ø\u009a Rù¤DÅ;oæj\u009bnÒ\u0006c|ífOG\u009eÃ\fæ\u0002Ù°cB\u001bZ\u0000\u0007\\ØÕfäÝrÙ\u0091ë\u0000#ÃÄÀ\u0089\n&\u0089ïæàJ\u000e^\tàö\u0001H2\u001e\u008eè\u0006\u0000V\u0012Ý\u008a\u0090\u0086\\\u0003å×\u0099`´ã\u000e\u008d\u0005\u009bf<ýÊ\u000eë\u008e[N\u009fR\\\u009dW8ôËÇÔ®û»\"Æ\tï\u009dð\u0003\u0087Ó®\u0007-ª©\u0005Îx«ËõÅ{Å\u0085ä\u001c\u009af«\u0087\b ¼u;î)+\f\u0004ìNñ\u009f\bJ\u0083\u008biÃì3i3Ä\u0093\u0010PPðìµ\b¶}\u0082ûgþÉ\u008a§µGv\u0012Î'¨=ÌÓe\u0017-\u0018?\u0015¼>zpu?jrBön\u00039û\u0088¯\u008d_zÝm>3\u0019ß'Ñ¯8\u00adÙ\u00067\u008eá`\u00890\u009a\u0096\u0003¶km·÷zwãX0±Ïl}é\u001eÖøÞ-\u0084o_.8«ý\u0004ÜÌÇ¦¥L\u008fÄ\u009c/¼1\nÎû ÄSÅ¡Ömlá7õ²\fáÌ_#L\u009bVøÔ§\u008b¬'\bçJ\u0006\u0001¸g4MM\u0004{Æ\u008dì\b\u0093ë\u00ad\u0013¿c{H\u0002c\u0010";
      int var6 = "?\"%\u009e\u0004\n\u009cêXà\u0080°ky«%\u0002\u0019ç\u000eT\"BÖ§©tHÐ\u0018¤f\fÿ\u000f)þL$Æ\u0095ÒÕ\u009f\u009bÍc\u0092¹\u0011\u000bÙBóó\u0097T½æÓù\u008c\"¸¢µAð\u001c`|\"y¶g\u00adqí\u0080}b\u0018÷\u0096iS\u008d\u0098+''\u0001?\u009a\u001eèÐ\u0004\r2D«\u0005\u0006!`ÖÅ\u0003¢ûÉ͏\u009bÑXåYåË¸ \u0012kØ[\t çþä\u0011YàP \u009d\u008e\u0088ìæH1ù\u001cñ\u001bí¾ô\\\u0080@TW27eÃìtbIËÍ\\·\u008cÊ>E1\u0007iZ=´x\u0018_\u00139Üà\u001cý¦\rÉ½ÜåUõÉ0ö\u0011\u0016\t\u0015<4\u0095\u0091znÐ\f\u009f;ü\u0016ûË\u0097®\u008fî¥X/|å§\u0092C0}>¯=\u0095Ê\u001e\u0083\u008d\u0005ÏC\u008d\u001e\u001dr;}®:ºFÔrÙÏÇõñ~¨Ý\u0002\u0004#\u008bjOGGo\u001dÐñ\u0006Áq\u0094J\u0099òò\u0018§PÌ0Ïß\u0087\u0018\u0084ul\u0018RÓx$Ì$!\u0095;æO\u009d¨\u0094êøDö}TöÊRbÓñ\u0099\u0004{Ox!$óî \u0013\u0010\u00021.t\u008dvé\u008cûà\u0006Å\u000e\t^^òMÛV7N§\u0088Ó¾\u0017\u0089è?\\\u0012jõÝ{ÕL\u001e\bF\u00883\"\u0094\u001dÒ/a|\u0091l\bÅÎ¯\u0011ÞõÆ(½Z£s\u000bkN0\u0000$dÙ|\u000bù9+ªå\u001cÄ\n\u009cdã\u0017\u000bâIr\u009e,Æ½ØM{ÄÃB'=³B[ñÖµvÍ¡\u007f>æ\u0087\u000e4Hbs\rG\u0010$È;zlA³\"ØÃîE\u008f´\u000e'm\u0080¦«\u00153[5S\u009c,Iý¨M\u0007\u0001´t¡\u000f\u0014½ð-\u0085òE8K¿\u009bãFì³ópÍPÄòÒR\u0014øÉ\r.iî\u009f\u008eï\u000b\u0085F\u00198¹qc\u009fy\u0097\u0094\u001b¸,+æ\u0007ÉØ9è\t\u001d\u0004Þ\\âT>tQ®\u0085í¹§\u00adyx[¨R\u0012\u0018ÝÚ¤w\u00adWKÍ\u001b#ø á\u0002¸ÀSmD\u0019å\u008ff«öÈÉÑ\u0012í_+ùr÷e)±³$aL\u0007^ý]\u00ad¼\u001aùQ\u008aiïv\u0019;X6¸\u0011\u0081¯\u0095\u009aâ}¨Yú\u0087n£}®3õèî\r\f\u0005w~\fû\u001b\u0004q\u0097æÙ\u000b&÷Öé\u0012\u0016\u0095ß$é\u0093õ>,\u001f»$Ì\u0000\u009e\tmø8ê\u008aø>Oé\u001dËLÕ¸é§çm\u009aÒÅÜo ¿FpÄ6¥\u0018x\u00ad\u0081å m NÖ\u009daZ\u0006\u0004ðéña\u0006n3µbS¡2\u009b¢d\u009cÀ\u0001À\u001eßx\u007f\bæ¾\u0004/Iè#\u0085\rÅW\u0006ge\u0083ü^k=\u0082\u000ba2\u009c\u009c\u000f³o&ý\u0000DMøÁ{\u0001<þ\u0090\u001795:0U\u0011b\t\u009b<å\u0095«z=×ø\u009a Rù¤DÅ;oæj\u009bnÒ\u0006c|ífOG\u009eÃ\fæ\u0002Ù°cB\u001bZ\u0000\u0007\\ØÕfäÝrÙ\u0091ë\u0000#ÃÄÀ\u0089\n&\u0089ïæàJ\u000e^\tàö\u0001H2\u001e\u008eè\u0006\u0000V\u0012Ý\u008a\u0090\u0086\\\u0003å×\u0099`´ã\u000e\u008d\u0005\u009bf<ýÊ\u000eë\u008e[N\u009fR\\\u009dW8ôËÇÔ®û»\"Æ\tï\u009dð\u0003\u0087Ó®\u0007-ª©\u0005Îx«ËõÅ{Å\u0085ä\u001c\u009af«\u0087\b ¼u;î)+\f\u0004ìNñ\u009f\bJ\u0083\u008biÃì3i3Ä\u0093\u0010PPðìµ\b¶}\u0082ûgþÉ\u008a§µGv\u0012Î'¨=ÌÓe\u0017-\u0018?\u0015¼>zpu?jrBön\u00039û\u0088¯\u008d_zÝm>3\u0019ß'Ñ¯8\u00adÙ\u00067\u008eá`\u00890\u009a\u0096\u0003¶km·÷zwãX0±Ïl}é\u001eÖøÞ-\u0084o_.8«ý\u0004ÜÌÇ¦¥L\u008fÄ\u009c/¼1\nÎû ÄSÅ¡Ömlá7õ²\fáÌ_#L\u009bVøÔ§\u008b¬'\bçJ\u0006\u0001¸g4MM\u0004{Æ\u008dì\b\u0093ë\u00ad\u0013¿c{H\u0002c\u0010"
         .length();
      char var3 = 5;
      int var10 = -1;

      label52:
      while (true) {
         byte var10000 = 54;
         String var10001 = var4.substring(++var10, var10 + var3);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var8 = 0;
               byte var31 = var10000;
               var23 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               } else {
                  var31 = var10000;
                  var16 = var10004;
                  if (var10004 <= var8) {
                     break label47;
                  }

                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               }

               while (true) {
                  char var49 = var40[var10006];
                  byte var50;
                  switch (var8 % 7) {
                     case 0:
                        var50 = 15;
                        break;
                     case 1:
                        var50 = 88;
                        break;
                     case 2:
                        var50 = 62;
                        break;
                     case 3:
                        var50 = 40;
                        break;
                     case 4:
                        var50 = 46;
                        break;
                     case 5:
                        var50 = 103;
                        break;
                     default:
                        var50 = 35;
                  }

                  var40[var10006] = (char)(var49 ^ var36 ^ var50);
                  var8++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var23;
                     var36 = var31;
                  } else {
                     if (var16 <= var8) {
                        break;
                     }

                     var40 = var23;
                     var36 = var31;
                     var10006 = var8;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var7[var5++] = var33;
                  if ((var10 += var3) >= var6) {
                     a = var7;
                     b = new String[21];
                     long var0 = 4192508933519688073L;
                     long var27 = 166428241179427236L ^ var0;
                     byte var18 = -1;
                     c = var27;
                     o = a(25445, 11162) + R_4.class.getName() + a(25441, 28172) + Charset.defaultCharset() + a(25440, 15397);
                     return;
                  }

                  var3 = var4.charAt(var10);
                  break;
               default:
                  var7[var5++] = var33;
                  if ((var10 += var3) < var6) {
                     var3 = var4.charAt(var10);
                     continue label52;
                  }

                  var4 = "L]Å¨\u0093N]t\tª\\\u0012|\u0019øP\u0004k";
                  var6 = "L]Å¨\u0093N]t\tª\\\u0012|\u0019øP\u0004k".length();
                  var3 = '\b';
                  var10 = -1;
            }

            var10000 = 112;
            var10001 = var4.substring(++var10, var10 + var3);
            var10002 = 0;
         }
      }
   }
}





