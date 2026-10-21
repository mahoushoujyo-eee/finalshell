package com.finalshell.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class E8 {
   public static byte[] D;
   public static String[] l;
   public static byte[] z;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public static byte b(byte param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifeq 23
      // 09: sipush 4776
      // 0c: ldc2_w 8410335057298550477
      // 0f: invokestatic com/finalshell/core/E8.a (IJ)I
      // 12: if_icmpne 22
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: bipush 0
      // 1d: ireturn
      // 1e: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: bipush 0
      // 23: istore 2
      // 24: iload 2
      // 25: getstatic com/finalshell/core/E8.D [B
      // 28: arraylength
      // 29: if_icmpge 5c
      // 2c: iload 0
      // 2d: iload 1
      // 2e: ifeq 5d
      // 31: iload 1
      // 32: ifeq 54
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: getstatic com/finalshell/core/E8.D [B
      // 3f: iload 2
      // 40: baload
      // 41: if_icmpne 55
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: iload 2
      // 4c: i2b
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53: athrow
      // 54: ireturn
      // 55: iinc 2 1
      // 58: iload 1
      // 59: ifne 24
      // 5c: bipush 0
      // 5d: ireturn
   }

   public static byte[] M(byte[] param0, int param1, int param2) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: istore 3
      // 004: iload 2
      // 005: newarray 8
      // 007: astore 4
      // 009: bipush 0
      // 00a: istore 5
      // 00c: iload 1
      // 00d: istore 6
      // 00f: iload 6
      // 011: iload 1
      // 012: iload 2
      // 013: iadd
      // 014: if_icmpge 119
      // 017: aload 4
      // 019: iload 5
      // 01b: aload 0
      // 01c: iload 6
      // 01e: baload
      // 01f: invokestatic com/finalshell/core/E8.b (B)B
      // 022: bipush 2
      // 023: ishl
      // 024: aload 0
      // 025: iload 6
      // 027: bipush 1
      // 028: iadd
      // 029: baload
      // 02a: invokestatic com/finalshell/core/E8.b (B)B
      // 02d: sipush 26720
      // 030: ldc2_w 7423455987235099656
      // 033: invokestatic com/finalshell/core/E8.a (IJ)I
      // 036: iand
      // 037: bipush 4
      // 038: iushr
      // 039: ior
      // 03a: i2b
      // 03b: bastore
      // 03c: aload 0
      // 03d: iload 6
      // 03f: bipush 2
      // 040: iadd
      // 041: baload
      // 042: iload 3
      // 043: ifeq 11b
      // 046: sipush 15916
      // 049: ldc2_w 3015113820697674319
      // 04c: invokestatic com/finalshell/core/E8.a (IJ)I
      // 04f: iload 3
      // 050: ifeq 0c6
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 059: athrow
      // 05a: if_icmpne 072
      // 05d: goto 064
      // 060: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 063: athrow
      // 064: iinc 5 1
      // 067: iload 3
      // 068: ifne 119
      // 06b: goto 072
      // 06e: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 071: athrow
      // 072: aload 4
      // 074: iload 5
      // 076: bipush 1
      // 077: iadd
      // 078: aload 0
      // 079: iload 6
      // 07b: bipush 1
      // 07c: iadd
      // 07d: baload
      // 07e: invokestatic com/finalshell/core/E8.b (B)B
      // 081: sipush 29585
      // 084: ldc2_w 8702645499554893799
      // 087: invokestatic com/finalshell/core/E8.a (IJ)I
      // 08a: iand
      // 08b: bipush 4
      // 08c: ishl
      // 08d: aload 0
      // 08e: iload 6
      // 090: bipush 2
      // 091: iadd
      // 092: baload
      // 093: invokestatic com/finalshell/core/E8.b (B)B
      // 096: sipush 24011
      // 099: ldc2_w 6371763980785492405
      // 09c: invokestatic com/finalshell/core/E8.a (IJ)I
      // 09f: iand
      // 0a0: bipush 2
      // 0a1: iushr
      // 0a2: ior
      // 0a3: i2b
      // 0a4: bastore
      // 0a5: aload 0
      // 0a6: iload 6
      // 0a8: bipush 3
      // 0a9: iadd
      // 0aa: iload 3
      // 0ab: ifeq 0e4
      // 0ae: goto 0b5
      // 0b1: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b4: athrow
      // 0b5: baload
      // 0b6: sipush 15916
      // 0b9: ldc2_w 3015113820697674319
      // 0bc: invokestatic com/finalshell/core/E8.a (IJ)I
      // 0bf: goto 0c6
      // 0c2: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: if_icmpne 0d7
      // 0c9: iinc 5 2
      // 0cc: iload 3
      // 0cd: ifne 119
      // 0d0: goto 0d7
      // 0d3: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d6: athrow
      // 0d7: aload 4
      // 0d9: iload 5
      // 0db: bipush 2
      // 0dc: iadd
      // 0dd: goto 0e4
      // 0e0: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: iload 6
      // 0e7: bipush 2
      // 0e8: iadd
      // 0e9: baload
      // 0ea: invokestatic com/finalshell/core/E8.b (B)B
      // 0ed: bipush 3
      // 0ee: iand
      // 0ef: sipush 17821
      // 0f2: ldc2_w 8564882182880311793
      // 0f5: invokestatic com/finalshell/core/E8.a (IJ)I
      // 0f8: ishl
      // 0f9: aload 0
      // 0fa: iload 6
      // 0fc: bipush 3
      // 0fd: iadd
      // 0fe: baload
      // 0ff: invokestatic com/finalshell/core/E8.b (B)B
      // 102: sipush 11994
      // 105: ldc2_w 1948266982505042606
      // 108: invokestatic com/finalshell/core/E8.a (IJ)I
      // 10b: iand
      // 10c: ior
      // 10d: i2b
      // 10e: bastore
      // 10f: iinc 5 3
      // 112: iinc 6 4
      // 115: iload 3
      // 116: ifne 00f
      // 119: iload 5
      // 11b: newarray 8
      // 11d: astore 6
      // 11f: aload 4
      // 121: bipush 0
      // 122: aload 6
      // 124: bipush 0
      // 125: iload 5
      // 127: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 12a: aload 6
      // 12c: areturn
      // 12d: astore 4
      // 12f: new com/finalshell/core/Pc2
      // 132: dup
      // 133: sipush 11705
      // 136: sipush -26095
      // 139: invokestatic com/finalshell/core/E8.a (II)Ljava/lang/String;
      // 13c: aload 4
      // 13e: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 141: athrow
   }

   public static byte[] V(byte[] param0, int param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 2
      // 001: bipush 2
      // 002: imul
      // 003: newarray 8
      // 005: astore 5
      // 007: iload 2
      // 008: bipush 3
      // 009: idiv
      // 00a: bipush 3
      // 00b: imul
      // 00c: iload 1
      // 00d: iadd
      // 00e: istore 9
      // 010: bipush 0
      // 011: istore 6
      // 013: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 016: iload 1
      // 017: istore 7
      // 019: istore 4
      // 01b: iload 7
      // 01d: iload 9
      // 01f: if_icmpge 0d6
      // 022: aload 0
      // 023: iload 7
      // 025: baload
      // 026: bipush 2
      // 027: iushr
      // 028: sipush 11994
      // 02b: ldc2_w 1948266982505042606
      // 02e: invokestatic com/finalshell/core/E8.a (IJ)I
      // 031: iand
      // 032: istore 8
      // 034: aload 5
      // 036: iload 6
      // 038: iinc 6 1
      // 03b: getstatic com/finalshell/core/E8.D [B
      // 03e: iload 8
      // 040: baload
      // 041: bastore
      // 042: aload 0
      // 043: iload 7
      // 045: baload
      // 046: bipush 3
      // 047: iand
      // 048: bipush 4
      // 049: ishl
      // 04a: aload 0
      // 04b: iload 7
      // 04d: bipush 1
      // 04e: iadd
      // 04f: baload
      // 050: bipush 4
      // 051: iushr
      // 052: sipush 29585
      // 055: ldc2_w 8702645499554893799
      // 058: invokestatic com/finalshell/core/E8.a (IJ)I
      // 05b: iand
      // 05c: ior
      // 05d: istore 8
      // 05f: aload 5
      // 061: iload 6
      // 063: iinc 6 1
      // 066: getstatic com/finalshell/core/E8.D [B
      // 069: iload 8
      // 06b: baload
      // 06c: bastore
      // 06d: aload 0
      // 06e: iload 7
      // 070: bipush 1
      // 071: iadd
      // 072: baload
      // 073: sipush 29585
      // 076: ldc2_w 8702645499554893799
      // 079: invokestatic com/finalshell/core/E8.a (IJ)I
      // 07c: iand
      // 07d: bipush 2
      // 07e: ishl
      // 07f: aload 0
      // 080: iload 7
      // 082: bipush 2
      // 083: iadd
      // 084: baload
      // 085: sipush 17821
      // 088: ldc2_w 8564882182880311793
      // 08b: invokestatic com/finalshell/core/E8.a (IJ)I
      // 08e: iushr
      // 08f: bipush 3
      // 090: iand
      // 091: ior
      // 092: istore 8
      // 094: aload 5
      // 096: iload 6
      // 098: iinc 6 1
      // 09b: getstatic com/finalshell/core/E8.D [B
      // 09e: iload 8
      // 0a0: baload
      // 0a1: bastore
      // 0a2: aload 0
      // 0a3: iload 7
      // 0a5: bipush 2
      // 0a6: iadd
      // 0a7: baload
      // 0a8: sipush 11994
      // 0ab: ldc2_w 1948266982505042606
      // 0ae: invokestatic com/finalshell/core/E8.a (IJ)I
      // 0b1: iand
      // 0b2: istore 8
      // 0b4: aload 5
      // 0b6: iload 6
      // 0b8: iinc 6 1
      // 0bb: getstatic com/finalshell/core/E8.D [B
      // 0be: iload 8
      // 0c0: baload
      // 0c1: bastore
      // 0c2: iinc 7 3
      // 0c5: iload 4
      // 0c7: ifeq 0de
      // 0ca: iload 4
      // 0cc: ifne 01b
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: iload 1
      // 0d7: iload 2
      // 0d8: iadd
      // 0d9: iload 9
      // 0db: isub
      // 0dc: istore 9
      // 0de: iload 9
      // 0e0: bipush 1
      // 0e1: iload 4
      // 0e3: ifeq 186
      // 0e6: if_icmpne 170
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ef: athrow
      // 0f0: aload 0
      // 0f1: iload 7
      // 0f3: baload
      // 0f4: bipush 2
      // 0f5: iushr
      // 0f6: sipush 11994
      // 0f9: ldc2_w 1948266982505042606
      // 0fc: invokestatic com/finalshell/core/E8.a (IJ)I
      // 0ff: iand
      // 100: istore 8
      // 102: aload 5
      // 104: iload 6
      // 106: iinc 6 1
      // 109: getstatic com/finalshell/core/E8.D [B
      // 10c: iload 8
      // 10e: baload
      // 10f: bastore
      // 110: aload 0
      // 111: iload 7
      // 113: baload
      // 114: bipush 3
      // 115: iand
      // 116: bipush 4
      // 117: ishl
      // 118: sipush 11994
      // 11b: ldc2_w 1948266982505042606
      // 11e: invokestatic com/finalshell/core/E8.a (IJ)I
      // 121: iand
      // 122: istore 8
      // 124: aload 5
      // 126: iload 6
      // 128: iinc 6 1
      // 12b: getstatic com/finalshell/core/E8.D [B
      // 12e: iload 8
      // 130: baload
      // 131: bastore
      // 132: iload 3
      // 133: iload 4
      // 135: ifeq 22a
      // 138: ifeq 228
      // 13b: goto 142
      // 13e: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 141: athrow
      // 142: aload 5
      // 144: iload 6
      // 146: iinc 6 1
      // 149: sipush 15916
      // 14c: ldc2_w 3015113820697674319
      // 14f: invokestatic com/finalshell/core/E8.a (IJ)I
      // 152: bastore
      // 153: aload 5
      // 155: iload 6
      // 157: iinc 6 1
      // 15a: sipush 15916
      // 15d: ldc2_w 3015113820697674319
      // 160: invokestatic com/finalshell/core/E8.a (IJ)I
      // 163: bastore
      // 164: iload 4
      // 166: ifne 228
      // 169: goto 170
      // 16c: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16f: athrow
      // 170: iload 9
      // 172: iload 4
      // 174: ifeq 22a
      // 177: goto 17e
      // 17a: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17d: athrow
      // 17e: bipush 2
      // 17f: goto 186
      // 182: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 185: athrow
      // 186: if_icmpne 228
      // 189: aload 0
      // 18a: iload 7
      // 18c: baload
      // 18d: bipush 2
      // 18e: iushr
      // 18f: sipush 11994
      // 192: ldc2_w 1948266982505042606
      // 195: invokestatic com/finalshell/core/E8.a (IJ)I
      // 198: iand
      // 199: istore 8
      // 19b: aload 5
      // 19d: iload 6
      // 19f: iinc 6 1
      // 1a2: getstatic com/finalshell/core/E8.D [B
      // 1a5: iload 8
      // 1a7: baload
      // 1a8: bastore
      // 1a9: aload 0
      // 1aa: iload 7
      // 1ac: baload
      // 1ad: bipush 3
      // 1ae: iand
      // 1af: bipush 4
      // 1b0: ishl
      // 1b1: aload 0
      // 1b2: iload 7
      // 1b4: bipush 1
      // 1b5: iadd
      // 1b6: baload
      // 1b7: bipush 4
      // 1b8: iushr
      // 1b9: sipush 29585
      // 1bc: ldc2_w 8702645499554893799
      // 1bf: invokestatic com/finalshell/core/E8.a (IJ)I
      // 1c2: iand
      // 1c3: ior
      // 1c4: istore 8
      // 1c6: aload 5
      // 1c8: iload 6
      // 1ca: iinc 6 1
      // 1cd: getstatic com/finalshell/core/E8.D [B
      // 1d0: iload 8
      // 1d2: baload
      // 1d3: bastore
      // 1d4: aload 0
      // 1d5: iload 7
      // 1d7: bipush 1
      // 1d8: iadd
      // 1d9: baload
      // 1da: sipush 29585
      // 1dd: ldc2_w 8702645499554893799
      // 1e0: invokestatic com/finalshell/core/E8.a (IJ)I
      // 1e3: iand
      // 1e4: bipush 2
      // 1e5: ishl
      // 1e6: sipush 11994
      // 1e9: ldc2_w 1948266982505042606
      // 1ec: invokestatic com/finalshell/core/E8.a (IJ)I
      // 1ef: iand
      // 1f0: istore 8
      // 1f2: aload 5
      // 1f4: iload 6
      // 1f6: iinc 6 1
      // 1f9: getstatic com/finalshell/core/E8.D [B
      // 1fc: iload 8
      // 1fe: baload
      // 1ff: bastore
      // 200: iload 3
      // 201: iload 4
      // 203: ifeq 22a
      // 206: ifeq 228
      // 209: goto 210
      // 20c: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20f: athrow
      // 210: aload 5
      // 212: iload 6
      // 214: iinc 6 1
      // 217: sipush 15916
      // 21a: ldc2_w 3015113820697674319
      // 21d: invokestatic com/finalshell/core/E8.a (IJ)I
      // 220: bastore
      // 221: goto 228
      // 224: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 227: athrow
      // 228: iload 6
      // 22a: newarray 8
      // 22c: astore 10
      // 22e: aload 5
      // 230: bipush 0
      // 231: aload 10
      // 233: bipush 0
      // 234: iload 6
      // 236: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 239: aload 10
      // 23b: areturn
   }

   public static String[] b(String param0, String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 1d: astore 3
      // 1e: new java/util/Vector
      // 21: dup
      // 22: invokespecial java/util/Vector.<init> ()V
      // 25: astore 4
      // 27: bipush 0
      // 28: istore 5
      // 2a: aload 0
      // 2b: aload 1
      // 2c: iload 5
      // 2e: invokevirtual java/lang/String.indexOf (Ljava/lang/String;I)I
      // 31: istore 6
      // 33: iload 6
      // 35: iflt 5d
      // 38: aload 4
      // 3a: aload 3
      // 3b: iload 5
      // 3d: iload 6
      // 3f: iload 5
      // 41: isub
      // 42: invokestatic com/finalshell/core/E8.O ([BII)Ljava/lang/String;
      // 45: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 48: iload 6
      // 4a: bipush 1
      // 4b: iadd
      // 4c: istore 5
      // 4e: iload 2
      // 4f: ifeq 6d
      // 52: iload 2
      // 53: ifne 2a
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: aload 4
      // 5f: aload 3
      // 60: iload 5
      // 62: aload 3
      // 63: arraylength
      // 64: iload 5
      // 66: isub
      // 67: invokestatic com/finalshell/core/E8.O ([BII)Ljava/lang/String;
      // 6a: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 6d: goto 70
      // 70: aload 4
      // 72: invokevirtual java/util/Vector.size ()I
      // 75: anewarray 81
      // 78: astore 7
      // 7a: bipush 0
      // 7b: istore 8
      // 7d: iload 8
      // 7f: aload 7
      // 81: arraylength
      // 82: if_icmpge a6
      // 85: aload 7
      // 87: iload 2
      // 88: ifeq a8
      // 8b: iload 8
      // 8d: aload 4
      // 8f: iload 8
      // 91: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 94: checkcast java/lang/String
      // 97: aastore
      // 98: iinc 8 1
      // 9b: iload 2
      // 9c: ifne 7d
      // 9f: goto a6
      // a2: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a5: athrow
      // a6: aload 7
      // a8: areturn
   }

   public static boolean j(byte[] var0, byte[] var1) {
      return f(var0, 0, var1, 0);
   }

   public static boolean f(byte[] param0, int param1, byte[] param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: istore 4
      // 05: aload 2
      // 06: arraylength
      // 07: iload 4
      // 09: ifne c8
      // 0c: ifle c1
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 2
      // 17: bipush 0
      // 18: baload
      // 19: iload 4
      // 1b: ifne c8
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: sipush 23980
      // 28: ldc2_w 1818655426690458078
      // 2b: invokestatic com/finalshell/core/E8.a (IJ)I
      // 2e: if_icmpne c1
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 0
      // 39: arraylength
      // 3a: iload 4
      // 3c: ifne c0
      // 3f: goto 46
      // 42: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: ifle bf
      // 49: goto 50
      // 4c: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: aload 0
      // 51: bipush 0
      // 52: baload
      // 53: iload 4
      // 55: ifne c0
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: sipush 8738
      // 62: ldc2_w 2259344066868895307
      // 65: invokestatic com/finalshell/core/E8.a (IJ)I
      // 68: if_icmpne bf
      // 6b: goto 72
      // 6e: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: aload 0
      // 73: arraylength
      // 74: iload 4
      // 76: ifne be
      // 79: goto 80
      // 7c: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f: athrow
      // 80: bipush 2
      // 81: if_icmpne b3
      // 84: goto 8b
      // 87: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8a: athrow
      // 8b: aload 0
      // 8c: bipush 1
      // 8d: baload
      // 8e: iload 4
      // 90: ifne be
      // 93: goto 9a
      // 96: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 99: athrow
      // 9a: sipush 10566
      // 9d: ldc2_w 5206456139520496949
      // a0: invokestatic com/finalshell/core/E8.a (IJ)I
      // a3: if_icmpne b3
      // a6: goto ad
      // a9: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ac: athrow
      // ad: bipush 1
      // ae: ireturn
      // af: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b2: athrow
      // b3: aload 0
      // b4: iload 1
      // b5: bipush 1
      // b6: iadd
      // b7: aload 2
      // b8: iload 3
      // b9: bipush 1
      // ba: iadd
      // bb: invokestatic com/finalshell/core/E8.b ([BI[BI)Z
      // be: ireturn
      // bf: bipush 0
      // c0: ireturn
      // c1: aload 0
      // c2: iload 1
      // c3: aload 2
      // c4: iload 3
      // c5: invokestatic com/finalshell/core/E8.b ([BI[BI)Z
      // c8: ireturn
   }

   public static boolean b(byte[] param0, int param1, byte[] param2, int param3) {
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
      // 004: arraylength
      // 005: istore 5
      // 007: istore 4
      // 009: iload 5
      // 00b: iload 4
      // 00d: ifeq 022
      // 010: ifne 020
      // 013: goto 01a
      // 016: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 019: athrow
      // 01a: bipush 0
      // 01b: ireturn
      // 01c: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01f: athrow
      // 020: aload 2
      // 021: arraylength
      // 022: istore 6
      // 024: iload 1
      // 025: istore 7
      // 027: iload 3
      // 028: istore 8
      // 02a: iload 7
      // 02c: iload 5
      // 02e: if_icmpge 37a
      // 031: iload 8
      // 033: iload 6
      // 035: iload 4
      // 037: ifeq 37e
      // 03a: iload 4
      // 03c: ifeq 37e
      // 03f: goto 046
      // 042: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 045: athrow
      // 046: if_icmpge 37a
      // 049: goto 050
      // 04c: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04f: athrow
      // 050: aload 0
      // 051: iload 7
      // 053: baload
      // 054: sipush 6806
      // 057: ldc2_w 893519810492688116
      // 05a: invokestatic com/finalshell/core/E8.a (IJ)I
      // 05d: iload 4
      // 05f: ifeq 0df
      // 062: goto 069
      // 065: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 068: athrow
      // 069: if_icmpne 0d2
      // 06c: goto 073
      // 06f: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: iload 7
      // 075: bipush 1
      // 076: iadd
      // 077: iload 5
      // 079: iload 4
      // 07b: ifeq 0a0
      // 07e: goto 085
      // 081: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: if_icmpne 095
      // 088: goto 08f
      // 08b: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08e: athrow
      // 08f: bipush 0
      // 090: ireturn
      // 091: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 094: athrow
      // 095: iinc 7 1
      // 098: aload 0
      // 099: iload 7
      // 09b: baload
      // 09c: aload 2
      // 09d: iload 8
      // 09f: baload
      // 0a0: iload 4
      // 0a2: ifeq 0ca
      // 0a5: if_icmpeq 0b5
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ae: athrow
      // 0af: bipush 0
      // 0b0: ireturn
      // 0b1: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b4: athrow
      // 0b5: iload 7
      // 0b7: aload 0
      // 0b8: iload 7
      // 0ba: baload
      // 0bb: invokestatic com/finalshell/core/E8.x (B)I
      // 0be: iadd
      // 0bf: istore 7
      // 0c1: iload 8
      // 0c3: aload 2
      // 0c4: iload 8
      // 0c6: baload
      // 0c7: invokestatic com/finalshell/core/E8.x (B)I
      // 0ca: iadd
      // 0cb: istore 8
      // 0cd: iload 4
      // 0cf: ifne 02a
      // 0d2: aload 0
      // 0d3: iload 7
      // 0d5: baload
      // 0d6: sipush 24917
      // 0d9: ldc2_w 2513168636762365220
      // 0dc: invokestatic com/finalshell/core/E8.a (IJ)I
      // 0df: iload 4
      // 0e1: ifeq 2de
      // 0e4: if_icmpne 2d1
      // 0e7: goto 0ee
      // 0ea: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ed: athrow
      // 0ee: iload 7
      // 0f0: iload 5
      // 0f2: if_icmpge 133
      // 0f5: goto 0fc
      // 0f8: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb: athrow
      // 0fc: aload 0
      // 0fd: iload 7
      // 0ff: baload
      // 100: sipush 24917
      // 103: ldc2_w 2513168636762365220
      // 106: invokestatic com/finalshell/core/E8.a (IJ)I
      // 109: iload 4
      // 10b: ifeq 143
      // 10e: iload 4
      // 110: ifeq 143
      // 113: goto 11a
      // 116: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 119: athrow
      // 11a: if_icmpne 133
      // 11d: goto 124
      // 120: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 123: athrow
      // 124: iinc 7 1
      // 127: iload 4
      // 129: ifne 0ee
      // 12c: goto 133
      // 12f: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 132: athrow
      // 133: iload 5
      // 135: iload 4
      // 137: ifeq 150
      // 13a: iload 7
      // 13c: goto 143
      // 13f: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 142: athrow
      // 143: if_icmpne 14c
      // 146: bipush 1
      // 147: ireturn
      // 148: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14b: athrow
      // 14c: aload 0
      // 14d: iload 7
      // 14f: baload
      // 150: istore 9
      // 152: iload 9
      // 154: sipush 11994
      // 157: ldc2_w 1948266982505042606
      // 15a: invokestatic com/finalshell/core/E8.a (IJ)I
      // 15d: iload 4
      // 15f: ifeq 1c2
      // 162: if_icmpne 1b7
      // 165: goto 16c
      // 168: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16b: athrow
      // 16c: iload 8
      // 16e: iload 6
      // 170: if_icmpge 1b5
      // 173: goto 17a
      // 176: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 179: athrow
      // 17a: aload 0
      // 17b: iload 7
      // 17d: aload 2
      // 17e: iload 8
      // 180: invokestatic com/finalshell/core/E8.b ([BI[BI)Z
      // 183: iload 4
      // 185: ifeq 1b6
      // 188: iload 4
      // 18a: ifeq 1ae
      // 18d: goto 194
      // 190: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 193: athrow
      // 194: ifeq 1a4
      // 197: goto 19e
      // 19a: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19d: athrow
      // 19e: bipush 1
      // 19f: ireturn
      // 1a0: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a3: athrow
      // 1a4: iload 8
      // 1a6: aload 2
      // 1a7: iload 8
      // 1a9: baload
      // 1aa: invokestatic com/finalshell/core/E8.x (B)I
      // 1ad: iadd
      // 1ae: istore 8
      // 1b0: iload 4
      // 1b2: ifne 16c
      // 1b5: bipush 0
      // 1b6: ireturn
      // 1b7: iload 9
      // 1b9: sipush 6806
      // 1bc: ldc2_w 893519810492688116
      // 1bf: invokestatic com/finalshell/core/E8.a (IJ)I
      // 1c2: iload 4
      // 1c4: ifeq 26e
      // 1c7: if_icmpne 26a
      // 1ca: goto 1d1
      // 1cd: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d0: athrow
      // 1d1: iload 7
      // 1d3: bipush 1
      // 1d4: iadd
      // 1d5: iload 4
      // 1d7: ifeq 1fa
      // 1da: goto 1e1
      // 1dd: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e0: athrow
      // 1e1: iload 5
      // 1e3: if_icmpne 1f3
      // 1e6: goto 1ed
      // 1e9: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ec: athrow
      // 1ed: bipush 0
      // 1ee: ireturn
      // 1ef: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f2: athrow
      // 1f3: iinc 7 1
      // 1f6: aload 0
      // 1f7: iload 7
      // 1f9: baload
      // 1fa: istore 9
      // 1fc: iload 8
      // 1fe: iload 6
      // 200: if_icmpge 268
      // 203: iload 9
      // 205: iload 4
      // 207: ifeq 269
      // 20a: aload 2
      // 20b: iload 8
      // 20d: baload
      // 20e: iload 4
      // 210: ifeq 260
      // 213: goto 21a
      // 216: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 219: athrow
      // 21a: if_icmpne 257
      // 21d: goto 224
      // 220: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 223: athrow
      // 224: aload 0
      // 225: iload 7
      // 227: iload 9
      // 229: invokestatic com/finalshell/core/E8.x (B)I
      // 22c: iadd
      // 22d: aload 2
      // 22e: iload 8
      // 230: aload 2
      // 231: iload 8
      // 233: baload
      // 234: invokestatic com/finalshell/core/E8.x (B)I
      // 237: iadd
      // 238: invokestatic com/finalshell/core/E8.b ([BI[BI)Z
      // 23b: iload 4
      // 23d: ifeq 261
      // 240: goto 247
      // 243: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 246: athrow
      // 247: ifeq 257
      // 24a: goto 251
      // 24d: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 250: athrow
      // 251: bipush 1
      // 252: ireturn
      // 253: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 256: athrow
      // 257: iload 8
      // 259: aload 2
      // 25a: iload 8
      // 25c: baload
      // 25d: invokestatic com/finalshell/core/E8.x (B)I
      // 260: iadd
      // 261: istore 8
      // 263: iload 4
      // 265: ifne 1fc
      // 268: bipush 0
      // 269: ireturn
      // 26a: iload 8
      // 26c: iload 6
      // 26e: if_icmpge 2cf
      // 271: iload 9
      // 273: iload 4
      // 275: ifeq 2d0
      // 278: goto 27f
      // 27b: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27e: athrow
      // 27f: aload 2
      // 280: iload 8
      // 282: baload
      // 283: iload 4
      // 285: ifeq 2c7
      // 288: goto 28f
      // 28b: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28e: athrow
      // 28f: if_icmpne 2be
      // 292: goto 299
      // 295: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 298: athrow
      // 299: aload 0
      // 29a: iload 7
      // 29c: aload 2
      // 29d: iload 8
      // 29f: invokestatic com/finalshell/core/E8.b ([BI[BI)Z
      // 2a2: iload 4
      // 2a4: ifeq 2c8
      // 2a7: goto 2ae
      // 2aa: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ad: athrow
      // 2ae: ifeq 2be
      // 2b1: goto 2b8
      // 2b4: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b7: athrow
      // 2b8: bipush 1
      // 2b9: ireturn
      // 2ba: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2bd: athrow
      // 2be: iload 8
      // 2c0: aload 2
      // 2c1: iload 8
      // 2c3: baload
      // 2c4: invokestatic com/finalshell/core/E8.x (B)I
      // 2c7: iadd
      // 2c8: istore 8
      // 2ca: iload 4
      // 2cc: ifne 26a
      // 2cf: bipush 0
      // 2d0: ireturn
      // 2d1: aload 0
      // 2d2: iload 7
      // 2d4: baload
      // 2d5: sipush 11994
      // 2d8: ldc2_w 1948266982505042606
      // 2db: invokestatic com/finalshell/core/E8.a (IJ)I
      // 2de: iload 4
      // 2e0: ifeq 309
      // 2e3: if_icmpne 301
      // 2e6: goto 2ed
      // 2e9: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ec: athrow
      // 2ed: iinc 7 1
      // 2f0: iload 8
      // 2f2: aload 2
      // 2f3: iload 8
      // 2f5: baload
      // 2f6: invokestatic com/finalshell/core/E8.x (B)I
      // 2f9: iadd
      // 2fa: istore 8
      // 2fc: iload 4
      // 2fe: ifne 02a
      // 301: aload 0
      // 302: iload 7
      // 304: baload
      // 305: aload 2
      // 306: iload 8
      // 308: baload
      // 309: iload 4
      // 30b: ifeq 33a
      // 30e: if_icmpeq 31e
      // 311: goto 318
      // 314: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 317: athrow
      // 318: bipush 0
      // 319: ireturn
      // 31a: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31d: athrow
      // 31e: iload 7
      // 320: aload 0
      // 321: iload 7
      // 323: baload
      // 324: invokestatic com/finalshell/core/E8.x (B)I
      // 327: iadd
      // 328: istore 7
      // 32a: iload 8
      // 32c: aload 2
      // 32d: iload 8
      // 32f: baload
      // 330: invokestatic com/finalshell/core/E8.x (B)I
      // 333: iadd
      // 334: istore 8
      // 336: iload 8
      // 338: iload 6
      // 33a: iload 4
      // 33c: ifeq 34d
      // 33f: if_icmplt 02a
      // 342: goto 349
      // 345: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 348: athrow
      // 349: iload 7
      // 34b: iload 5
      // 34d: iload 4
      // 34f: ifeq 36f
      // 352: if_icmplt 362
      // 355: goto 35c
      // 358: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35b: athrow
      // 35c: bipush 1
      // 35d: ireturn
      // 35e: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 361: athrow
      // 362: aload 0
      // 363: iload 7
      // 365: baload
      // 366: sipush 24917
      // 369: ldc2_w 2513168636762365220
      // 36c: invokestatic com/finalshell/core/E8.a (IJ)I
      // 36f: iload 4
      // 371: ifeq 02e
      // 374: if_icmpne 02a
      // 377: goto 37a
      // 37a: iload 7
      // 37c: iload 5
      // 37e: iload 4
      // 380: ifeq 3bd
      // 383: if_icmpne 3ad
      // 386: goto 38d
      // 389: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38c: athrow
      // 38d: iload 8
      // 38f: iload 6
      // 391: iload 4
      // 393: ifeq 3bd
      // 396: goto 39d
      // 399: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39c: athrow
      // 39d: if_icmpne 3ad
      // 3a0: goto 3a7
      // 3a3: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a6: athrow
      // 3a7: bipush 1
      // 3a8: ireturn
      // 3a9: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ac: athrow
      // 3ad: iload 8
      // 3af: iload 4
      // 3b1: ifeq 40f
      // 3b4: iload 6
      // 3b6: goto 3bd
      // 3b9: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3bc: athrow
      // 3bd: if_icmplt 40e
      // 3c0: aload 0
      // 3c1: iload 7
      // 3c3: baload
      // 3c4: iload 4
      // 3c6: ifeq 40f
      // 3c9: goto 3d0
      // 3cc: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3cf: athrow
      // 3d0: sipush 24917
      // 3d3: ldc2_w 2513168636762365220
      // 3d6: invokestatic com/finalshell/core/E8.a (IJ)I
      // 3d9: if_icmpne 40e
      // 3dc: goto 3e3
      // 3df: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e2: athrow
      // 3e3: bipush 1
      // 3e4: istore 9
      // 3e6: iload 7
      // 3e8: iload 5
      // 3ea: if_icmpge 40b
      // 3ed: aload 0
      // 3ee: iload 7
      // 3f0: iinc 7 1
      // 3f3: baload
      // 3f4: sipush 24917
      // 3f7: ldc2_w 2513168636762365220
      // 3fa: invokestatic com/finalshell/core/E8.a (IJ)I
      // 3fd: if_icmpeq 3e6
      // 400: bipush 0
      // 401: iload 4
      // 403: ifeq 3f4
      // 406: istore 9
      // 408: goto 40b
      // 40b: iload 9
      // 40d: ireturn
      // 40e: bipush 0
      // 40f: ireturn
   }

   public static String W(String param0) {
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
      // 004: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 007: astore 2
      // 008: bipush 0
      // 009: istore 3
      // 00a: istore 1
      // 00b: bipush 0
      // 00c: istore 4
      // 00e: iload 4
      // 010: aload 2
      // 011: arraylength
      // 012: if_icmpge 07e
      // 015: aload 2
      // 016: iload 4
      // 018: baload
      // 019: istore 5
      // 01b: iload 5
      // 01d: sipush 1809
      // 020: ldc2_w 6695924883380304737
      // 023: invokestatic com/finalshell/core/E8.a (IJ)I
      // 026: iload 1
      // 027: ifeq 096
      // 02a: iload 1
      // 02b: ifeq 051
      // 02e: goto 035
      // 031: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 034: athrow
      // 035: if_icmpeq 074
      // 038: goto 03f
      // 03b: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03e: athrow
      // 03f: iload 5
      // 041: sipush 18665
      // 044: ldc2_w 7181991324655596676
      // 047: invokestatic com/finalshell/core/E8.a (IJ)I
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 050: athrow
      // 051: iload 1
      // 052: ifeq 071
      // 055: if_icmpeq 074
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05e: athrow
      // 05f: iload 5
      // 061: sipush 24917
      // 064: ldc2_w 2513168636762365220
      // 067: invokestatic com/finalshell/core/E8.a (IJ)I
      // 06a: goto 071
      // 06d: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070: athrow
      // 071: if_icmpne 077
      // 074: iinc 3 1
      // 077: iinc 4 1
      // 07a: iload 1
      // 07b: ifne 00e
      // 07e: iload 3
      // 07f: iload 1
      // 080: ifeq 097
      // 083: ifne 093
      // 086: goto 08d
      // 089: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c: athrow
      // 08d: aload 0
      // 08e: areturn
      // 08f: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 092: athrow
      // 093: aload 2
      // 094: arraylength
      // 095: iload 3
      // 096: iadd
      // 097: newarray 8
      // 099: astore 4
      // 09b: bipush 0
      // 09c: istore 5
      // 09e: bipush 0
      // 09f: istore 6
      // 0a1: iload 5
      // 0a3: aload 2
      // 0a4: arraylength
      // 0a5: if_icmpge 129
      // 0a8: aload 2
      // 0a9: iload 1
      // 0aa: ifeq 12b
      // 0ad: iload 5
      // 0af: baload
      // 0b0: istore 7
      // 0b2: iload 7
      // 0b4: sipush 6806
      // 0b7: ldc2_w 893519810492688116
      // 0ba: invokestatic com/finalshell/core/E8.a (IJ)I
      // 0bd: iload 1
      // 0be: ifeq 0dd
      // 0c1: if_icmpeq 100
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: iload 7
      // 0cd: sipush 11994
      // 0d0: ldc2_w 1948266982505042606
      // 0d3: invokestatic com/finalshell/core/E8.a (IJ)I
      // 0d6: goto 0dd
      // 0d9: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dc: athrow
      // 0dd: iload 1
      // 0de: ifeq 0fd
      // 0e1: if_icmpeq 100
      // 0e4: goto 0eb
      // 0e7: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ea: athrow
      // 0eb: iload 7
      // 0ed: sipush 24917
      // 0f0: ldc2_w 2513168636762365220
      // 0f3: invokestatic com/finalshell/core/E8.a (IJ)I
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: if_icmpne 118
      // 100: aload 4
      // 102: iload 6
      // 104: iinc 6 1
      // 107: sipush 6806
      // 10a: ldc2_w 893519810492688116
      // 10d: invokestatic com/finalshell/core/E8.a (IJ)I
      // 110: bastore
      // 111: goto 118
      // 114: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 117: athrow
      // 118: aload 4
      // 11a: iload 6
      // 11c: iinc 6 1
      // 11f: iload 7
      // 121: bastore
      // 122: iinc 5 1
      // 125: iload 1
      // 126: ifne 0a1
      // 129: aload 4
      // 12b: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 12e: areturn
   }

   public static String v(String param0) {
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
      // 04: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 07: astore 2
      // 08: istore 1
      // 09: aload 2
      // 0a: invokestatic com/finalshell/core/E8.V ([B)[B
      // 0d: astore 3
      // 0e: aload 2
      // 0f: iload 1
      // 10: ifne 27
      // 13: arraylength
      // 14: aload 3
      // 15: arraylength
      // 16: if_icmpne 26
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 0
      // 21: areturn
      // 22: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 3
      // 27: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 2a: areturn
   }

   public static byte[] V(byte[] param0) {
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
      // 04: arraylength
      // 05: istore 2
      // 06: istore 1
      // 07: bipush 0
      // 08: istore 3
      // 09: iload 3
      // 0a: iload 2
      // 0b: if_icmpge 73
      // 0e: aload 0
      // 0f: iload 3
      // 10: baload
      // 11: sipush 6806
      // 14: ldc2_w 893519810492688116
      // 17: invokestatic com/finalshell/core/E8.a (IJ)I
      // 1a: iload 1
      // 1b: ifeq 81
      // 1e: iload 1
      // 1f: ifeq 3e
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: if_icmpne 6c
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: iload 3
      // 34: bipush 1
      // 35: iadd
      // 36: iload 2
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: if_icmpne 4c
      // 41: iload 1
      // 42: ifne 73
      // 45: goto 4c
      // 48: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: aload 0
      // 4d: iload 3
      // 4e: bipush 1
      // 4f: iadd
      // 50: aload 0
      // 51: iload 3
      // 52: aload 0
      // 53: arraylength
      // 54: iload 3
      // 55: bipush 1
      // 56: iadd
      // 57: isub
      // 58: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 5b: iinc 2 -1
      // 5e: iinc 3 1
      // 61: iload 1
      // 62: ifne 09
      // 65: goto 6c
      // 68: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: iinc 3 1
      // 6f: iload 1
      // 70: ifne 09
      // 73: iload 2
      // 74: iload 1
      // 75: ifeq 8b
      // 78: aload 0
      // 79: arraylength
      // 7a: goto 81
      // 7d: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80: athrow
      // 81: if_icmpne 8a
      // 84: aload 0
      // 85: areturn
      // 86: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 89: athrow
      // 8a: iload 2
      // 8b: newarray 8
      // 8d: astore 4
      // 8f: aload 0
      // 90: bipush 0
      // 91: aload 4
      // 93: bipush 0
      // 94: iload 2
      // 95: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 98: aload 4
      // 9a: areturn
   }

   public static String s(Y_2 param0, byte[] param1, boolean param2, boolean param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: istore 4
      // 005: aload 0
      // 006: invokeinterface com/finalshell/core/Y_2.t ()V 1
      // 00b: aload 0
      // 00c: aload 1
      // 00d: bipush 0
      // 00e: aload 1
      // 00f: arraylength
      // 010: invokeinterface com/finalshell/core/Y_2.p ([BII)V 4
      // 015: aload 0
      // 016: invokeinterface com/finalshell/core/Y_2.O ()[B 1
      // 01b: astore 5
      // 01d: new java/lang/StringBuilder
      // 020: dup
      // 021: invokespecial java/lang/StringBuilder.<init> ()V
      // 024: astore 6
      // 026: iload 2
      // 027: iload 4
      // 029: ifne 052
      // 02c: ifeq 051
      // 02f: goto 036
      // 032: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 035: athrow
      // 036: aload 6
      // 038: aload 0
      // 039: invokeinterface com/finalshell/core/Y_2.D ()Ljava/lang/String; 1
      // 03e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 041: pop
      // 042: aload 6
      // 044: ldc ":"
      // 046: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 049: pop
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 050: athrow
      // 051: iload 3
      // 052: iload 4
      // 054: ifne 08a
      // 057: ifne 089
      // 05a: goto 061
      // 05d: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 060: athrow
      // 061: aload 0
      // 062: invokeinterface com/finalshell/core/Y_2.D ()Ljava/lang/String; 1
      // 067: sipush 11703
      // 06a: sipush -1727
      // 06d: invokestatic com/finalshell/core/E8.a (II)Ljava/lang/String;
      // 070: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 073: iload 4
      // 075: ifne 08a
      // 078: goto 07f
      // 07b: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07e: athrow
      // 07f: ifeq 111
      // 082: goto 089
      // 085: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 088: athrow
      // 089: bipush 0
      // 08a: istore 8
      // 08c: iload 8
      // 08e: aload 5
      // 090: arraylength
      // 091: if_icmpge 10c
      // 094: aload 5
      // 096: iload 8
      // 098: baload
      // 099: sipush 19574
      // 09c: ldc2_w 493883100047061016
      // 09f: invokestatic com/finalshell/core/E8.a (IJ)I
      // 0a2: iand
      // 0a3: istore 7
      // 0a5: aload 6
      // 0a7: getstatic com/finalshell/core/E8.l [Ljava/lang/String;
      // 0aa: iload 7
      // 0ac: bipush 4
      // 0ad: iushr
      // 0ae: sipush 29585
      // 0b1: ldc2_w 8702645499554893799
      // 0b4: invokestatic com/finalshell/core/E8.a (IJ)I
      // 0b7: iand
      // 0b8: aaload
      // 0b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bc: pop
      // 0bd: aload 6
      // 0bf: getstatic com/finalshell/core/E8.l [Ljava/lang/String;
      // 0c2: iload 7
      // 0c4: sipush 29585
      // 0c7: ldc2_w 8702645499554893799
      // 0ca: invokestatic com/finalshell/core/E8.a (IJ)I
      // 0cd: iand
      // 0ce: aaload
      // 0cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d2: pop
      // 0d3: iload 4
      // 0d5: ifne 12c
      // 0d8: iload 4
      // 0da: ifne 107
      // 0dd: goto 0e4
      // 0e0: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e3: athrow
      // 0e4: iload 8
      // 0e6: bipush 1
      // 0e7: iadd
      // 0e8: aload 5
      // 0ea: arraylength
      // 0eb: if_icmpge 104
      // 0ee: goto 0f5
      // 0f1: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f4: athrow
      // 0f5: aload 6
      // 0f7: ldc ":"
      // 0f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fc: pop
      // 0fd: goto 104
      // 100: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 103: athrow
      // 104: iinc 8 1
      // 107: iload 4
      // 109: ifeq 08c
      // 10c: iload 4
      // 10e: ifeq 12c
      // 111: aload 5
      // 113: bipush 0
      // 114: aload 5
      // 116: arraylength
      // 117: bipush 0
      // 118: invokestatic com/finalshell/core/E8.V ([BIIZ)[B
      // 11b: astore 7
      // 11d: aload 6
      // 11f: aload 7
      // 121: bipush 0
      // 122: aload 7
      // 124: arraylength
      // 125: invokestatic com/finalshell/core/E8.O ([BII)Ljava/lang/String;
      // 128: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12b: pop
      // 12c: aload 6
      // 12e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 131: areturn
      // 132: astore 5
      // 134: sipush 11697
      // 137: sipush -27010
      // 13a: invokestatic com/finalshell/core/E8.a (II)Ljava/lang/String;
      // 13d: areturn
   }

   public static boolean I(byte[] param0, byte[] param1) {
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
      // 04: arraylength
      // 05: istore 3
      // 06: istore 2
      // 07: iload 3
      // 08: iload 2
      // 09: ifeq 1f
      // 0c: aload 1
      // 0d: arraylength
      // 0e: if_icmpeq 1e
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: bipush 0
      // 19: ireturn
      // 1a: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: istore 4
      // 21: iload 4
      // 23: iload 3
      // 24: if_icmpge 58
      // 27: aload 0
      // 28: iload 4
      // 2a: baload
      // 2b: iload 2
      // 2c: ifeq 59
      // 2f: iload 2
      // 30: ifeq 50
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 1
      // 3b: iload 4
      // 3d: baload
      // 3e: if_icmpeq 51
      // 41: goto 48
      // 44: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: bipush 0
      // 49: goto 50
      // 4c: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: ireturn
      // 51: iinc 4 1
      // 54: iload 2
      // 55: ifne 21
      // 58: bipush 1
      // 59: ireturn
   }

   public static Socket k(String param0, int param1, int param2) throws Pc2 {
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
      // 004: astore 4
      // 006: istore 3
      // 007: iload 2
      // 008: ifne 02e
      // 00b: new java/net/Socket
      // 00e: dup
      // 00f: aload 0
      // 010: iload 1
      // 011: invokespecial java/net/Socket.<init> (Ljava/lang/String;I)V
      // 014: astore 4
      // 016: aload 4
      // 018: areturn
      // 019: astore 5
      // 01b: aload 5
      // 01d: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 020: astore 6
      // 022: new com/finalshell/core/Pc2
      // 025: dup
      // 026: aload 6
      // 028: aload 5
      // 02a: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 02d: athrow
      // 02e: aload 0
      // 02f: astore 5
      // 031: iload 1
      // 032: istore 6
      // 034: bipush 1
      // 035: anewarray 188
      // 038: astore 7
      // 03a: bipush 1
      // 03b: anewarray 144
      // 03e: astore 8
      // 040: ldc ""
      // 042: astore 9
      // 044: new java/lang/Thread
      // 047: dup
      // 048: aload 7
      // 04a: aload 5
      // 04c: iload 6
      // 04e: aload 8
      // 050: invokedynamic run ([Ljava/net/Socket;Ljava/lang/String;I[Ljava/lang/Exception;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/finalshell/core/E8.lambda$createSocket$0 ([Ljava/net/Socket;Ljava/lang/String;I[Ljava/lang/Exception;)V, ()V ]
      // 055: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;)V
      // 058: astore 10
      // 05a: aload 10
      // 05c: new java/lang/StringBuilder
      // 05f: dup
      // 060: invokespecial java/lang/StringBuilder.<init> ()V
      // 063: sipush 11702
      // 066: sipush 5033
      // 069: invokestatic com/finalshell/core/E8.a (II)Ljava/lang/String;
      // 06c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06f: aload 0
      // 070: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 073: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 076: invokevirtual java/lang/Thread.setName (Ljava/lang/String;)V
      // 079: aload 10
      // 07b: invokevirtual java/lang/Thread.start ()V
      // 07e: aload 10
      // 080: iload 2
      // 081: i2l
      // 082: invokevirtual java/lang/Thread.join (J)V
      // 085: sipush 11700
      // 088: sipush -9353
      // 08b: invokestatic com/finalshell/core/E8.a (II)Ljava/lang/String;
      // 08e: astore 9
      // 090: goto 095
      // 093: astore 11
      // 095: aload 7
      // 097: bipush 0
      // 098: aaload
      // 099: iload 3
      // 09a: ifne 0b2
      // 09d: ifnull 0d3
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: aload 7
      // 0a9: bipush 0
      // 0aa: aaload
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b1: athrow
      // 0b2: iload 3
      // 0b3: ifne 0ce
      // 0b6: invokevirtual java/net/Socket.isConnected ()Z
      // 0b9: ifeq 0d3
      // 0bc: goto 0c3
      // 0bf: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c2: athrow
      // 0c3: aload 7
      // 0c5: bipush 0
      // 0c6: aaload
      // 0c7: goto 0ce
      // 0ca: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cd: athrow
      // 0ce: astore 4
      // 0d0: goto 121
      // 0d3: new java/lang/StringBuilder
      // 0d6: dup
      // 0d7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0da: aload 9
      // 0dc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0df: sipush 11701
      // 0e2: sipush -14648
      // 0e5: invokestatic com/finalshell/core/E8.a (II)Ljava/lang/String;
      // 0e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0eb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ee: astore 9
      // 0f0: iload 3
      // 0f1: ifne 110
      // 0f4: aload 8
      // 0f6: bipush 0
      // 0f7: aaload
      // 0f8: ifnull 10b
      // 0fb: goto 102
      // 0fe: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 101: athrow
      // 102: aload 8
      // 104: bipush 0
      // 105: aaload
      // 106: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 109: astore 9
      // 10b: aload 10
      // 10d: invokevirtual java/lang/Thread.interrupt ()V
      // 110: aconst_null
      // 111: astore 10
      // 113: new com/finalshell/core/Pc2
      // 116: dup
      // 117: aload 9
      // 119: aload 8
      // 11b: bipush 0
      // 11c: aaload
      // 11d: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 120: athrow
      // 121: aload 4
      // 123: areturn
   }

   public static byte[] t(String var0, Charset var1) {
      try {
         if (var0 == null) {
            return null;
         }
      } catch (ArrayIndexOutOfBoundsException var2) {
         throw new RuntimeException(a(var2));
      }

      return var0.getBytes(var1);
   }

   public static byte[] J(String var0) {
      return t(var0, StandardCharsets.UTF_8);
   }

   public static String y(byte[] var0, Charset var1) {
      return d(var0, 0, var0.length, var1);
   }

   public static String d(byte[] var0, int var1, int var2, Charset var3) {
      return new String(var0, var1, var2, var3);
   }

   public static String B(byte[] var0) {
      return d(var0, 0, var0.length, StandardCharsets.UTF_8);
   }

   public static String O(byte[] var0, int var1, int var2) {
      return d(var0, var1, var2, StandardCharsets.UTF_8);
   }

   public static String j(byte[] param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: new java/lang/StringBuilder
      // 06: dup
      // 07: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a: astore 2
      // 0b: istore 1
      // 0c: bipush 0
      // 0d: istore 3
      // 0e: iload 3
      // 0f: aload 0
      // 10: arraylength
      // 11: if_icmpge 98
      // 14: aload 0
      // 15: iload 3
      // 16: baload
      // 17: sipush 19712
      // 1a: ldc2_w 7633737285965361529
      // 1d: invokestatic com/finalshell/core/E8.a (IJ)I
      // 20: iand
      // 21: invokestatic java/lang/Integer.toHexString (I)Ljava/lang/String;
      // 24: astore 4
      // 26: aload 2
      // 27: iload 1
      // 28: ifeq 99
      // 2b: new java/lang/StringBuilder
      // 2e: dup
      // 2f: invokespecial java/lang/StringBuilder.<init> ()V
      // 32: sipush 11698
      // 35: sipush -32767
      // 38: invokestatic com/finalshell/core/E8.a (II)Ljava/lang/String;
      // 3b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e: aload 4
      // 40: iload 1
      // 41: ifeq 5c
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: invokevirtual java/lang/String.length ()I
      // 4e: bipush 1
      // 4f: if_icmpne 5f
      // 52: ldc_w "0"
      // 55: goto 5c
      // 58: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: goto 61
      // 5f: ldc ""
      // 61: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 64: aload 4
      // 66: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 69: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6f: pop
      // 70: iload 1
      // 71: ifeq 94
      // 74: iload 3
      // 75: bipush 1
      // 76: iadd
      // 77: aload 0
      // 78: arraylength
      // 79: if_icmpge 91
      // 7c: goto 83
      // 7f: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 82: athrow
      // 83: aload 2
      // 84: ldc ":"
      // 86: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 89: pop
      // 8a: goto 91
      // 8d: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 90: athrow
      // 91: iinc 3 1
      // 94: iload 1
      // 95: ifne 0e
      // 98: aload 2
      // 99: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9c: areturn
   }

   public static void Q(byte[] var0) {
      boolean var1 = Dm4.J$boolean();

      try {
         if (var0 == null) {
            return;
         }
      } catch (ArrayIndexOutOfBoundsException var3) {
         throw new RuntimeException(a(var3));
      }

      int var2 = 0;

      while (var2 < var0.length) {
         var0[var2] = 0;
         var2++;
         if (var1) {
            break;
         }
      }
   }

   public static String z(String param0, String[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ldc_w ","
      // 04: invokestatic com/finalshell/core/E8.b (Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
      // 07: astore 3
      // 08: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 0b: aconst_null
      // 0c: astore 4
      // 0e: istore 2
      // 0f: bipush 0
      // 10: istore 5
      // 12: iload 5
      // 14: aload 3
      // 15: arraylength
      // 16: if_icmpge 94
      // 19: bipush 0
      // 1a: istore 6
      // 1c: iload 6
      // 1e: aload 1
      // 1f: arraylength
      // 20: if_icmpge 4e
      // 23: aload 3
      // 24: iload 5
      // 26: aaload
      // 27: aload 1
      // 28: iload 6
      // 2a: aaload
      // 2b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2e: iload 2
      // 2f: ifeq 14
      // 32: ifeq 40
      // 35: iload 2
      // 36: ifne 8d
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: iinc 6 1
      // 43: iload 2
      // 44: ifne 1c
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: aload 4
      // 50: iload 2
      // 51: ifeq 8b
      // 54: ifnonnull 68
      // 57: goto 5e
      // 5a: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: aload 3
      // 5f: iload 5
      // 61: aaload
      // 62: astore 4
      // 64: iload 2
      // 65: ifne 8d
      // 68: new java/lang/StringBuilder
      // 6b: dup
      // 6c: invokespecial java/lang/StringBuilder.<init> ()V
      // 6f: aload 4
      // 71: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 74: ldc_w ","
      // 77: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7a: aload 3
      // 7b: iload 5
      // 7d: aaload
      // 7e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 81: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 84: goto 8b
      // 87: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8a: athrow
      // 8b: astore 4
      // 8d: iinc 5 1
      // 90: iload 2
      // 91: ifne 12
      // 94: aload 4
      // 96: areturn
   }

   public static String V(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: ldc_w "~"
      // 08: iload 1
      // 09: ifne 24
      // 0c: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0f: ifeq 34
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: ldc_w "~"
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: sipush 11699
      // 27: sipush 20940
      // 2a: invokestatic com/finalshell/core/E8.a (II)Ljava/lang/String;
      // 2d: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 30: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 33: astore 0
      // 34: goto 38
      // 37: astore 2
      // 38: aload 0
      // 39: areturn
   }

   public static int x(byte param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 1
      // 04: iload 0
      // 05: sipush 10603
      // 08: ldc2_w 2646540651424797956
      // 0b: invokestatic com/finalshell/core/E8.a (IJ)I
      // 0e: iand
      // 0f: i2b
      // 10: iload 1
      // 11: ifeq 30
      // 14: ifne 24
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: bipush 1
      // 1f: ireturn
      // 20: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: iload 0
      // 25: sipush 11466
      // 28: ldc2_w 507383949629083824
      // 2b: invokestatic com/finalshell/core/E8.a (IJ)I
      // 2e: iand
      // 2f: i2b
      // 30: sipush 8925
      // 33: ldc2_w 3212473583561268919
      // 36: invokestatic com/finalshell/core/E8.a (IJ)I
      // 39: iload 1
      // 3a: ifeq 6d
      // 3d: if_icmpne 4d
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: bipush 2
      // 48: ireturn
      // 49: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: iload 0
      // 4e: sipush 14137
      // 51: ldc2_w 1509517364683918168
      // 54: invokestatic com/finalshell/core/E8.a (IJ)I
      // 57: iand
      // 58: i2b
      // 59: iload 1
      // 5a: ifeq 77
      // 5d: sipush 8279
      // 60: ldc2_w 1845077881001565232
      // 63: invokestatic com/finalshell/core/E8.a (IJ)I
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: if_icmpne 76
      // 70: bipush 3
      // 71: ireturn
      // 72: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 75: athrow
      // 76: bipush 1
      // 77: ireturn
   }

   public static byte[] w(String var0) throws IOException {
      var0 = V(var0);
      boolean var10000 = Dm4.F$boolean();
      File var2 = new File(var0);
      boolean var1 = var10000;
      FileInputStream var3 = new FileInputStream(var0);

      byte[] var11;
      try {
         byte[] var4 = new byte[(int)var2.length()];
         int var5 = 0;

         do {
            int var6 = var3.read(var4, var5, var4.length - var5);
            if (var6 <= 0) {
               try {
                  if (!var1) {
                     continue;
                  }

                  if (var1) {
                     break;
                  }
               } catch (Throwable var8) {
                  throw new RuntimeException(a(var8));
               }
            }

            var5 += var6;
         } while (var1);

         var11 = var4;
      } catch (Throwable var9) {
         try {
            var3.close();
         } catch (Throwable var7) {
            var9.addSuppressed(var7);
         }

         throw var9;
      }

      var3.close();
      return var11;
   }

   public static boolean Y(byte[] param0, byte[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: arraylength
      // 06: iload 2
      // 07: ifne 1d
      // 0a: aload 1
      // 0b: arraylength
      // 0c: if_icmpeq 1c
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: bipush 0
      // 1d: istore 3
      // 1e: bipush 0
      // 1f: istore 4
      // 21: iload 4
      // 23: aload 0
      // 24: arraylength
      // 25: if_icmpge 46
      // 28: iload 3
      // 29: aload 0
      // 2a: iload 4
      // 2c: baload
      // 2d: aload 1
      // 2e: iload 4
      // 30: baload
      // 31: ixor
      // 32: ior
      // 33: istore 3
      // 34: iinc 4 1
      // 37: iload 2
      // 38: ifne 59
      // 3b: iload 2
      // 3c: ifeq 21
      // 3f: goto 46
      // 42: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: iload 3
      // 47: iload 2
      // 48: ifne 56
      // 4b: ifne 59
      // 4e: goto 55
      // 51: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: bipush 1
      // 56: goto 5a
      // 59: bipush 0
      // 5a: ireturn
   }

   public static String F(String var0) {
      try {
         return System.getenv(var0);
      } catch (SecurityException var2) {
         return null;
      }
   }

   public static String T(String var0) {
      try {
         return System.getProperty(var0);
      } catch (SecurityException var2) {
         return null;
      }
   }

   public static String V(String var0, String var1) {
      try {
         return System.getProperty(var0, var1);
      } catch (SecurityException var3) {
         return var1;
      }
   }

   public static void lambda$createSocket$0(Socket[] param0, String param1, int param2, Exception[] param3) {
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
      // 04: bipush 0
      // 05: aconst_null
      // 06: aastore
      // 07: istore 4
      // 09: aload 0
      // 0a: bipush 0
      // 0b: new java/net/Socket
      // 0e: dup
      // 0f: aload 1
      // 10: iload 2
      // 11: invokespecial java/net/Socket.<init> (Ljava/lang/String;I)V
      // 14: aastore
      // 15: goto 5c
      // 18: astore 5
      // 1a: aload 3
      // 1b: bipush 0
      // 1c: aload 5
      // 1e: aastore
      // 1f: aload 0
      // 20: bipush 0
      // 21: iload 4
      // 23: ifne 5a
      // 26: aaload
      // 27: ifnull 58
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: aload 0
      // 32: bipush 0
      // 33: iload 4
      // 35: ifne 5a
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: aaload
      // 40: invokevirtual java/net/Socket.isConnected ()Z
      // 43: ifeq 58
      // 46: goto 4d
      // 49: invokestatic com/finalshell/core/E8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: aload 0
      // 4e: bipush 0
      // 4f: aaload
      // 50: invokevirtual java/net/Socket.close ()V
      // 53: goto 58
      // 56: astore 6
      // 58: aload 0
      // 59: bipush 0
      // 5a: aconst_null
      // 5b: aastore
      // 5c: return
   }

   static {
      __vfClinit__();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 11697) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 124;
               break;
            case 1:
               var10000 = 191;
               break;
            case 2:
               var10000 = 141;
               break;
            case 3:
               var10000 = 226;
               break;
            case 4:
               var10000 = 186;
               break;
            case 5:
               var10000 = 55;
               break;
            case 6:
               var10000 = 118;
               break;
            case 7:
               var10000 = 130;
               break;
            case 8:
               var10000 = 215;
               break;
            case 9:
               var10000 = 108;
               break;
            case 10:
               var10000 = 150;
               break;
            case 11:
               var10000 = 56;
               break;
            case 12:
               var10000 = 125;
               break;
            case 13:
               var10000 = 236;
               break;
            case 14:
               var10000 = 67;
               break;
            case 15:
               var10000 = 23;
               break;
            case 16:
               var10000 = 89;
               break;
            case 17:
               var10000 = 71;
               break;
            case 18:
               var10000 = 84;
               break;
            case 19:
               var10000 = 177;
               break;
            case 20:
               var10000 = 166;
               break;
            case 21:
               var10000 = 62;
               break;
            case 22:
               var10000 = 156;
               break;
            case 23:
               var10000 = 95;
               break;
            case 24:
               var10000 = 137;
               break;
            case 25:
               var10000 = 165;
               break;
            case 26:
               var10000 = 204;
               break;
            case 27:
               var10000 = 219;
               break;
            case 28:
               var10000 = 4;
               break;
            case 29:
               var10000 = 173;
               break;
            case 30:
               var10000 = 80;
               break;
            case 31:
               var10000 = 131;
               break;
            case 32:
               var10000 = 111;
               break;
            case 33:
               var10000 = 255;
               break;
            case 34:
               var10000 = 187;
               break;
            case 35:
               var10000 = 227;
               break;
            case 36:
               var10000 = 87;
               break;
            case 37:
               var10000 = 2;
               break;
            case 38:
               var10000 = 59;
               break;
            case 39:
               var10000 = 46;
               break;
            case 40:
               var10000 = 48;
               break;
            case 41:
               var10000 = 8;
               break;
            case 42:
               var10000 = 39;
               break;
            case 43:
               var10000 = 70;
               break;
            case 44:
               var10000 = 223;
               break;
            case 45:
               var10000 = 222;
               break;
            case 46:
               var10000 = 182;
               break;
            case 47:
               var10000 = 88;
               break;
            case 48:
               var10000 = 58;
               break;
            case 49:
               var10000 = 218;
               break;
            case 50:
               var10000 = 152;
               break;
            case 51:
               var10000 = 174;
               break;
            case 52:
               var10000 = 157;
               break;
            case 53:
               var10000 = 205;
               break;
            case 54:
               var10000 = 149;
               break;
            case 55:
               var10000 = 180;
               break;
            case 56:
               var10000 = 175;
               break;
            case 57:
               var10000 = 47;
               break;
            case 58:
               var10000 = 202;
               break;
            case 59:
               var10000 = 76;
               break;
            case 60:
               var10000 = 20;
               break;
            case 61:
               var10000 = 25;
               break;
            case 62:
               var10000 = 123;
               break;
            case 63:
               var10000 = 68;
               break;
            case 64:
               var10000 = 235;
               break;
            case 65:
               var10000 = 147;
               break;
            case 66:
               var10000 = 93;
               break;
            case 67:
               var10000 = 198;
               break;
            case 68:
               var10000 = 117;
               break;
            case 69:
               var10000 = 183;
               break;
            case 70:
               var10000 = 107;
               break;
            case 71:
               var10000 = 53;
               break;
            case 72:
               var10000 = 178;
               break;
            case 73:
               var10000 = 193;
               break;
            case 74:
               var10000 = 244;
               break;
            case 75:
               var10000 = 128;
               break;
            case 76:
               var10000 = 247;
               break;
            case 77:
               var10000 = 104;
               break;
            case 78:
               var10000 = 26;
               break;
            case 79:
               var10000 = 57;
               break;
            case 80:
               var10000 = 42;
               break;
            case 81:
               var10000 = 7;
               break;
            case 82:
               var10000 = 29;
               break;
            case 83:
               var10000 = 168;
               break;
            case 84:
               var10000 = 49;
               break;
            case 85:
               var10000 = 65;
               break;
            case 86:
               var10000 = 194;
               break;
            case 87:
               var10000 = 96;
               break;
            case 88:
               var10000 = 78;
               break;
            case 89:
               var10000 = 209;
               break;
            case 90:
               var10000 = 151;
               break;
            case 91:
               var10000 = 35;
               break;
            case 92:
               var10000 = 115;
               break;
            case 93:
               var10000 = 210;
               break;
            case 94:
               var10000 = 241;
               break;
            case 95:
               var10000 = 18;
               break;
            case 96:
               var10000 = 113;
               break;
            case 97:
               var10000 = 189;
               break;
            case 98:
               var10000 = 192;
               break;
            case 99:
               var10000 = 153;
               break;
            case 100:
               var10000 = 94;
               break;
            case 101:
               var10000 = 231;
               break;
            case 102:
               var10000 = 83;
               break;
            case 103:
               var10000 = 188;
               break;
            case 104:
               var10000 = 90;
               break;
            case 105:
               var10000 = 159;
               break;
            case 106:
               var10000 = 91;
               break;
            case 107:
               var10000 = 213;
               break;
            case 108:
               var10000 = 171;
               break;
            case 109:
               var10000 = 221;
               break;
            case 110:
               var10000 = 114;
               break;
            case 111:
               var10000 = 160;
               break;
            case 112:
               var10000 = 225;
               break;
            case 113:
               var10000 = 145;
               break;
            case 114:
               var10000 = 79;
               break;
            case 115:
               var10000 = 112;
               break;
            case 116:
               var10000 = 63;
               break;
            case 117:
               var10000 = 199;
               break;
            case 118:
               var10000 = 21;
               break;
            case 119:
               var10000 = 252;
               break;
            case 120:
               var10000 = 66;
               break;
            case 121:
               var10000 = 179;
               break;
            case 122:
               var10000 = 138;
               break;
            case 123:
               var10000 = 74;
               break;
            case 124:
               var10000 = 144;
               break;
            case 125:
               var10000 = 245;
               break;
            case 126:
               var10000 = 211;
               break;
            case 127:
               var10000 = 97;
               break;
            case 128:
               var10000 = 82;
               break;
            case 129:
               var10000 = 120;
               break;
            case 130:
               var10000 = 34;
               break;
            case 131:
               var10000 = 16;
               break;
            case 132:
               var10000 = 142;
               break;
            case 133:
               var10000 = 0;
               break;
            case 134:
               var10000 = 36;
               break;
            case 135:
               var10000 = 228;
               break;
            case 136:
               var10000 = 129;
               break;
            case 137:
               var10000 = 167;
               break;
            case 138:
               var10000 = 11;
               break;
            case 139:
               var10000 = 200;
               break;
            case 140:
               var10000 = 38;
               break;
            case 141:
               var10000 = 41;
               break;
            case 142:
               var10000 = 99;
               break;
            case 143:
               var10000 = 196;
               break;
            case 144:
               var10000 = 127;
               break;
            case 145:
               var10000 = 230;
               break;
            case 146:
               var10000 = 50;
               break;
            case 147:
               var10000 = 176;
               break;
            case 148:
               var10000 = 181;
               break;
            case 149:
               var10000 = 154;
               break;
            case 150:
               var10000 = 251;
               break;
            case 151:
               var10000 = 164;
               break;
            case 152:
               var10000 = 220;
               break;
            case 153:
               var10000 = 239;
               break;
            case 154:
               var10000 = 61;
               break;
            case 155:
               var10000 = 214;
               break;
            case 156:
               var10000 = 1;
               break;
            case 157:
               var10000 = 30;
               break;
            case 158:
               var10000 = 250;
               break;
            case 159:
               var10000 = 110;
               break;
            case 160:
               var10000 = 15;
               break;
            case 161:
               var10000 = 246;
               break;
            case 162:
               var10000 = 40;
               break;
            case 163:
               var10000 = 229;
               break;
            case 164:
               var10000 = 3;
               break;
            case 165:
               var10000 = 102;
               break;
            case 166:
               var10000 = 249;
               break;
            case 167:
               var10000 = 13;
               break;
            case 168:
               var10000 = 52;
               break;
            case 169:
               var10000 = 237;
               break;
            case 170:
               var10000 = 33;
               break;
            case 171:
               var10000 = 81;
               break;
            case 172:
               var10000 = 163;
               break;
            case 173:
               var10000 = 132;
               break;
            case 174:
               var10000 = 27;
               break;
            case 175:
               var10000 = 240;
               break;
            case 176:
               var10000 = 60;
               break;
            case 177:
               var10000 = 190;
               break;
            case 178:
               var10000 = 69;
               break;
            case 179:
               var10000 = 155;
               break;
            case 180:
               var10000 = 109;
               break;
            case 181:
               var10000 = 45;
               break;
            case 182:
               var10000 = 24;
               break;
            case 183:
               var10000 = 9;
               break;
            case 184:
               var10000 = 19;
               break;
            case 185:
               var10000 = 43;
               break;
            case 186:
               var10000 = 162;
               break;
            case 187:
               var10000 = 77;
               break;
            case 188:
               var10000 = 73;
               break;
            case 189:
               var10000 = 135;
               break;
            case 190:
               var10000 = 121;
               break;
            case 191:
               var10000 = 17;
               break;
            case 192:
               var10000 = 212;
               break;
            case 193:
               var10000 = 197;
               break;
            case 194:
               var10000 = 224;
               break;
            case 195:
               var10000 = 207;
               break;
            case 196:
               var10000 = 98;
               break;
            case 197:
               var10000 = 31;
               break;
            case 198:
               var10000 = 85;
               break;
            case 199:
               var10000 = 14;
               break;
            case 200:
               var10000 = 206;
               break;
            case 201:
               var10000 = 139;
               break;
            case 202:
               var10000 = 169;
               break;
            case 203:
               var10000 = 253;
               break;
            case 204:
               var10000 = 64;
               break;
            case 205:
               var10000 = 22;
               break;
            case 206:
               var10000 = 243;
               break;
            case 207:
               var10000 = 254;
               break;
            case 208:
               var10000 = 185;
               break;
            case 209:
               var10000 = 72;
               break;
            case 210:
               var10000 = 54;
               break;
            case 211:
               var10000 = 146;
               break;
            case 212:
               var10000 = 161;
               break;
            case 213:
               var10000 = 6;
               break;
            case 214:
               var10000 = 119;
               break;
            case 215:
               var10000 = 44;
               break;
            case 216:
               var10000 = 5;
               break;
            case 217:
               var10000 = 201;
               break;
            case 218:
               var10000 = 92;
               break;
            case 219:
               var10000 = 143;
               break;
            case 220:
               var10000 = 122;
               break;
            case 221:
               var10000 = 106;
               break;
            case 222:
               var10000 = 208;
               break;
            case 223:
               var10000 = 203;
               break;
            case 224:
               var10000 = 148;
               break;
            case 225:
               var10000 = 217;
               break;
            case 226:
               var10000 = 140;
               break;
            case 227:
               var10000 = 234;
               break;
            case 228:
               var10000 = 51;
               break;
            case 229:
               var10000 = 133;
               break;
            case 230:
               var10000 = 10;
               break;
            case 231:
               var10000 = 103;
               break;
            case 232:
               var10000 = 100;
               break;
            case 233:
               var10000 = 126;
               break;
            case 234:
               var10000 = 233;
               break;
            case 235:
               var10000 = 170;
               break;
            case 236:
               var10000 = 195;
               break;
            case 237:
               var10000 = 28;
               break;
            case 238:
               var10000 = 216;
               break;
            case 239:
               var10000 = 105;
               break;
            case 240:
               var10000 = 101;
               break;
            case 241:
               var10000 = 86;
               break;
            case 242:
               var10000 = 134;
               break;
            case 243:
               var10000 = 232;
               break;
            case 244:
               var10000 = 75;
               break;
            case 245:
               var10000 = 32;
               break;
            case 246:
               var10000 = 12;
               break;
            case 247:
               var10000 = 158;
               break;
            case 248:
               var10000 = 242;
               break;
            case 249:
               var10000 = 248;
               break;
            case 250:
               var10000 = 136;
               break;
            case 251:
               var10000 = 184;
               break;
            case 252:
               var10000 = 37;
               break;
            case 253:
               var10000 = 116;
               break;
            case 254:
               var10000 = 238;
               break;
            default:
               var10000 = 172;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31869;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var34;
      String[] var13 = new String[9];
      int var11 = 0;
      String var10 = "¶Æ\u008dAý\t)\u0089\u00adl\u009aý\u0000\bÍ¨\u0001\u001b=\u0001ìÎSB\u0083vm¶¯91Ñ¾Å\u0001Ðh\u000fjX×üwö\u0096\u0088\u0097¨b»Â,qó{Ïï\u001b.Â3\u008d^óåA-¯c\tû>}N®JÔ÷È\u0002\u0007\u0084\u0019Ì\u009a[\\ç.\u0090àðÄ\u008b5q\u0081\u0007ÒáÀBî\u008aùÈûþ\t.\u0017î%\u0094Ïá®S\u0003½4Ú";
      int var12 = "¶Æ\u008dAý\t)\u0089\u00adl\u009aý\u0000\bÍ¨\u0001\u001b=\u0001ìÎSB\u0083vm¶¯91Ñ¾Å\u0001Ðh\u000fjX×üwö\u0096\u0088\u0097¨b»Â,qó{Ïï\u001b.Â3\u008d^óåA-¯c\tû>}N®JÔ÷È\u0002\u0007\u0084\u0019Ì\u009a[\\ç.\u0090àðÄ\u008b5q\u0081\u0007ÒáÀBî\u008aùÈûþ\t.\u0017î%\u0094Ïá®S\u0003½4Ú"
         .length();
      char var9 = 3;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 88;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var40 = var10001.toCharArray();
               int var10004 = var40.length;
               int var14 = 0;
               byte var43 = var10000;
               var34 = var40;
               int var25 = var10004;
               byte var50;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var40;
                  var50 = var10000;
                  var10006 = var14;
               } else {
                  var43 = var10000;
                  var25 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var56 = var40;
                  var50 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var65 = var56[var10006];
                  byte var66;
                  switch (var14 % 7) {
                     case 0:
                        var66 = 5;
                        break;
                     case 1:
                        var66 = 77;
                        break;
                     case 2:
                        var66 = 79;
                        break;
                     case 3:
                        var66 = 28;
                        break;
                     case 4:
                        var66 = 92;
                        break;
                     case 5:
                        var66 = 7;
                        break;
                     default:
                        var66 = 93;
                  }

                  var56[var10006] = (char)(var65 ^ var50 ^ var66);
                  var14++;
                  if (var43 == 0) {
                     var10006 = var43;
                     var56 = var34;
                     var50 = var43;
                  } else {
                     if (var25 <= var14) {
                        break;
                     }

                     var56 = var34;
                     var50 = var43;
                     var10006 = var14;
                  }
               }
            }

            String var45 = new String(var34).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var45;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     b = new String[9];
                     long var0 = 5670698096544853523L;
                     long[] var6 = new long[32];
                     int var3 = 0;
                     String var4 = ".~¤\u0093\u0000Êo|\u0086\u009eWÃI¢\u0089Ü\u0014lö#_rKé\u008aSø¬\u0012S\u000f\u009a\u0003\u0099YX\u000f\u0094\u009f\u0095MI!)cÀÄZâ\u0083Vd\u0081^ªoô\u008a\u000f¥[j~CØ\u00ad¬z\u0082\u0010\u008e\u000b\u0003¢\u0017ÍBßü\u0082\u0015uøðK\u0017Æt]bOáî\u0015!ûÈ\f\u008an\u0087Õ³\u001d*3V\u0082½\u009eÕ.\u0007±\u007fg×Ï{\fpàjZ]²\u008fã¼\u001c\u009fH\u001f\u0002\u009a¨Â2>\u0005¼\u00ad\u0017ääNGC\u009aÄ{\u0097µp¸¡ÛÕ\u009eô×*¡\u009b\u009a\u0011pv4\u0019»rmï:+\u0082\u008d/ÖÿòAÑJW1%\u0018\u008b\u000fdÖ\u008dî:uA@ã\u00adþç{>Ìý\u0099\u0091\u000f@ï\u0096ò\u008dÃìò\u001b½\u0081ü1±Ä\u00adº½iNå»£!êy/Øb%";
                     int var5 = ".~¤\u0093\u0000Êo|\u0086\u009eWÃI¢\u0089Ü\u0014lö#_rKé\u008aSø¬\u0012S\u000f\u009a\u0003\u0099YX\u000f\u0094\u009f\u0095MI!)cÀÄZâ\u0083Vd\u0081^ªoô\u008a\u000f¥[j~CØ\u00ad¬z\u0082\u0010\u008e\u000b\u0003¢\u0017ÍBßü\u0082\u0015uøðK\u0017Æt]bOáî\u0015!ûÈ\f\u008an\u0087Õ³\u001d*3V\u0082½\u009eÕ.\u0007±\u007fg×Ï{\fpàjZ]²\u008fã¼\u001c\u009fH\u001f\u0002\u009a¨Â2>\u0005¼\u00ad\u0017ääNGC\u009aÄ{\u0097µp¸¡ÛÕ\u009eô×*¡\u009b\u009a\u0011pv4\u0019»rmï:+\u0082\u008d/ÖÿòAÑJW1%\u0018\u008b\u000fdÖ\u008dî:uA@ã\u00adþç{>Ìý\u0099\u0091\u000f@ï\u0096ò\u008dÃìò\u001b½\u0081ü1±Ä\u00adº½iNå»£!êy/Øb%"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var27 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var27, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                        long[] var19 = var6;
                        int var28 = var3++;
                        long var38 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var46 = -1;

                        while (true) {
                           long var55 = var38 ^ var0;
                           switch (var46) {
                              case 0:
                                 var19[var28] = var55;
                                 if (var2 >= var5) {
                                    c = var6;
                                    d = new Integer[32];
                                    D = J(a(11696, 28144));
                                    String[] var20 = new String[a(23677, 8342391636304240648L)];
                                    var20[0] = "0";
                                    var20[1] = "1";
                                    var20[2] = "2";
                                    var20[3] = "3";
                                    var20[4] = "4";
                                    var20[5] = "5";
                                    var20[a(12368, 7637535171466644528L)] = "6";
                                    var20[a(5686, 954186777911552590L)] = "7";
                                    var20[a(6541, 191017951459567090L)] = "8";
                                    var20[a(15643, 3916446449994318182L)] = "9";
                                    var20[a(30733, 4481765165902365814L)] = "a";
                                    var20[a(23480, 6609531955726297028L)] = "b";
                                    var20[a(5029, 2596769444633538510L)] = "c";
                                    var20[a(12259, 613637469388592007L)] = "d";
                                    var20[a(5150, 7209212031400798313L)] = "e";
                                    var20[a(25547, 6698249452093054893L)] = "f";
                                    l = var20;
                                    z = J("");
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var28] = var55;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "E·Ø¹Y\u0004la\u007fÕ\u009aèQ:È»";
                                 var5 = "E·Ø¹Y\u0004la\u007fÕ\u009aèQ:È»".length();
                                 var2 = 0;
                           }

                           byte var29 = var2;
                           var2 += 8;
                           var7 = var4.substring(var29, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                           var19 = var6;
                           var28 = var3++;
                           var38 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var46 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var45;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "þ÷\n¢\u00adä¹\u0003ð=\b\u0002\u0016\u001d7\u001f{®¼È\u001bÅ5\u008c\u0092zÔ\u0091óWP7È\u008eÐÈ¿@µ6Ñw\u0097\u0017«aO";
                  var12 = "þ÷\n¢\u00adä¹\u0003ð=\b\u0002\u0016\u001d7\u001f{®¼È\u001bÅ5\u008c\u0092zÔ\u0091óWP7È\u008eÐÈ¿@µ6Ñw\u0097\u0017«aO".length();
                  var9 = 15;
                  var17 = -1;
            }

            var10000 = 62;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





