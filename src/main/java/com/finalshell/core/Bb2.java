package com.finalshell.core;

import com.finalshell.ui.model.O0;
import com.finalshell.ui.model.Oc2;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

public class Bb2 implements RW {
   public Xe2 l = null;
   public String H = null;
   public Vector U = null;
   public FP r;
   public static byte[] K;
   public static byte[] z;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public Bb2(Xe2 var1) {
      this.l = var1;
      this.X();
      this.U = new Vector();
   }

   public void G(String param1) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: istore 2
      // 004: aload 0
      // 005: aload 1
      // 006: putfield com/finalshell/core/Bb2.H Ljava/lang/String;
      // 009: new java/io/File
      // 00c: dup
      // 00d: aload 1
      // 00e: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 011: astore 3
      // 012: aload 3
      // 013: invokevirtual java/io/File.length ()J
      // 016: l2i
      // 017: newarray 8
      // 019: astore 4
      // 01b: new java/io/FileInputStream
      // 01e: dup
      // 01f: aload 3
      // 020: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 023: astore 5
      // 025: new java/io/DataInputStream
      // 028: dup
      // 029: aload 5
      // 02b: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 02e: astore 6
      // 030: aload 6
      // 032: aload 4
      // 034: invokevirtual java/io/DataInputStream.readFully ([B)V
      // 037: aload 6
      // 039: invokevirtual java/io/DataInputStream.close ()V
      // 03c: new java/lang/String
      // 03f: dup
      // 040: aload 4
      // 042: sipush 15193
      // 045: sipush -14194
      // 048: invokestatic com/finalshell/core/Bb2.a (II)Ljava/lang/String;
      // 04b: invokespecial java/lang/String.<init> ([BLjava/lang/String;)V
      // 04e: astore 7
      // 050: aload 7
      // 052: invokestatic com/finalshell/ui/model/O0.y (Ljava/lang/String;)Lcom/finalshell/ui/model/O0;
      // 055: astore 8
      // 057: aload 8
      // 059: sipush 15179
      // 05c: sipush 31362
      // 05f: invokestatic com/finalshell/core/Bb2.a (II)Ljava/lang/String;
      // 062: invokevirtual com/finalshell/ui/model/O0.J (Ljava/lang/String;)Lcom/finalshell/ui/model/Oc2;
      // 065: astore 9
      // 067: bipush 0
      // 068: istore 10
      // 06a: iload 10
      // 06c: aload 9
      // 06e: invokevirtual com/finalshell/ui/model/Oc2.size ()I
      // 071: if_icmpge 155
      // 074: aload 9
      // 076: iload 10
      // 078: invokevirtual com/finalshell/ui/model/Oc2.V (I)Lcom/finalshell/ui/model/O0;
      // 07b: astore 11
      // 07d: aconst_null
      // 07e: astore 12
      // 080: aload 11
      // 082: sipush 15181
      // 085: sipush 32729
      // 088: invokestatic com/finalshell/core/Bb2.a (II)Ljava/lang/String;
      // 08b: invokevirtual com/finalshell/ui/model/O0.C$String (Ljava/lang/String;)Ljava/lang/String;
      // 08e: astore 13
      // 090: aload 11
      // 092: sipush 15174
      // 095: sipush -4981
      // 098: invokestatic com/finalshell/core/Bb2.a (II)Ljava/lang/String;
      // 09b: invokevirtual com/finalshell/ui/model/O0.C$String (Ljava/lang/String;)Ljava/lang/String;
      // 09e: astore 14
      // 0a0: bipush -1
      // 0a1: istore 15
      // 0a3: aload 14
      // 0a5: invokestatic com/finalshell/core/DQ.v (Ljava/lang/String;)I
      // 0a8: istore 16
      // 0aa: iload 2
      // 0ab: ifne 159
      // 0ae: iload 16
      // 0b0: iload 2
      // 0b1: ifne 0cf
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ba: athrow
      // 0bb: bipush -1
      // 0bc: if_icmpeq 0d1
      // 0bf: goto 0c6
      // 0c2: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: iload 16
      // 0c8: goto 0cf
      // 0cb: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ce: athrow
      // 0cf: istore 15
      // 0d1: aload 11
      // 0d3: sipush 15180
      // 0d6: sipush -27617
      // 0d9: invokestatic com/finalshell/core/Bb2.a (II)Ljava/lang/String;
      // 0dc: invokevirtual com/finalshell/ui/model/O0.C$String (Ljava/lang/String;)Ljava/lang/String;
      // 0df: astore 17
      // 0e1: ldc ""
      // 0e3: astore 18
      // 0e5: aload 17
      // 0e7: iload 2
      // 0e8: ifne 10b
      // 0eb: bipush 0
      // 0ec: invokevirtual java/lang/String.charAt (I)C
      // 0ef: sipush 26072
      // 0f2: ldc2_w 8194788261751058682
      // 0f5: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 0f8: if_icmpne 10d
      // 0fb: goto 102
      // 0fe: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 101: athrow
      // 102: aload 17
      // 104: goto 10b
      // 107: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10a: athrow
      // 10b: astore 18
      // 10d: new com/finalshell/core/Dg2
      // 110: dup
      // 111: aload 0
      // 112: aload 18
      // 114: aload 17
      // 116: iload 15
      // 118: aload 11
      // 11a: sipush 15181
      // 11d: sipush 32729
      // 120: invokestatic com/finalshell/core/Bb2.a (II)Ljava/lang/String;
      // 123: invokevirtual com/finalshell/ui/model/O0.C$String (Ljava/lang/String;)Ljava/lang/String;
      // 126: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 129: bipush 0
      // 12a: aload 13
      // 12c: invokevirtual java/lang/String.length ()I
      // 12f: invokestatic com/finalshell/core/E8.M ([BII)[B
      // 132: aload 11
      // 134: sipush 15176
      // 137: sipush 24892
      // 13a: invokestatic com/finalshell/core/Bb2.a (II)Ljava/lang/String;
      // 13d: invokevirtual com/finalshell/ui/model/O0.C$String (Ljava/lang/String;)Ljava/lang/String;
      // 140: invokespecial com/finalshell/core/Dg2.<init> (Lcom/finalshell/core/Bb2;Ljava/lang/String;Ljava/lang/String;I[BLjava/lang/String;)V
      // 143: astore 12
      // 145: aload 0
      // 146: getfield com/finalshell/core/Bb2.U Ljava/util/Vector;
      // 149: aload 12
      // 14b: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 14e: iinc 10 1
      // 151: iload 2
      // 152: ifeq 06a
      // 155: goto 159
      // 158: astore 3
      // 159: return
   }

   public void I(InputStream param1) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: aload 0
      // 004: getfield com/finalshell/core/Bb2.U Ljava/util/Vector;
      // 007: invokevirtual java/util/Vector.removeAllElements ()V
      // 00a: istore 2
      // 00b: new java/lang/StringBuilder
      // 00e: dup
      // 00f: invokespecial java/lang/StringBuilder.<init> ()V
      // 012: astore 3
      // 013: bipush 0
      // 014: istore 6
      // 016: aload 1
      // 017: astore 7
      // 019: aconst_null
      // 01a: astore 9
      // 01c: sipush 24727
      // 01f: ldc2_w 7159615857381569968
      // 022: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 025: newarray 8
      // 027: astore 11
      // 029: bipush 0
      // 02a: istore 12
      // 02c: bipush 0
      // 02d: istore 12
      // 02f: aload 7
      // 031: invokevirtual java/io/InputStream.read ()I
      // 034: istore 5
      // 036: iload 5
      // 038: bipush -1
      // 039: if_icmpne 062
      // 03c: iload 12
      // 03e: iload 2
      // 03f: ifne 06b
      // 042: iload 2
      // 043: ifne 126
      // 046: goto 04d
      // 049: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04c: athrow
      // 04d: ifne 125
      // 050: goto 057
      // 053: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 056: athrow
      // 057: iload 2
      // 058: ifeq 702
      // 05b: goto 062
      // 05e: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 061: athrow
      // 062: iload 5
      // 064: goto 06b
      // 067: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06a: athrow
      // 06b: sipush 4146
      // 06e: ldc2_w 2161207822891713809
      // 071: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 074: iload 2
      // 075: ifne 098
      // 078: if_icmpne 08d
      // 07b: goto 082
      // 07e: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 081: athrow
      // 082: iload 2
      // 083: ifeq 02f
      // 086: goto 08d
      // 089: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c: athrow
      // 08d: iload 5
      // 08f: sipush 24428
      // 092: ldc2_w 4336071062343862860
      // 095: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 098: iload 2
      // 099: ifne 0c8
      // 09c: if_icmpne 0b1
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a5: athrow
      // 0a6: iload 2
      // 0a7: ifeq 125
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: aload 11
      // 0b3: iload 2
      // 0b4: ifne 118
      // 0b7: goto 0be
      // 0ba: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bd: athrow
      // 0be: arraylength
      // 0bf: iload 12
      // 0c1: goto 0c8
      // 0c4: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c7: athrow
      // 0c8: if_icmpgt 116
      // 0cb: iload 12
      // 0cd: sipush 23762
      // 0d0: ldc2_w 7868693327029357051
      // 0d3: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 0d6: iload 2
      // 0d7: ifne 101
      // 0da: goto 0e1
      // 0dd: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: if_icmple 0f6
      // 0e4: goto 0eb
      // 0e7: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ea: athrow
      // 0eb: iload 2
      // 0ec: ifeq 125
      // 0ef: goto 0f6
      // 0f2: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f5: athrow
      // 0f6: aload 11
      // 0f8: arraylength
      // 0f9: bipush 2
      // 0fa: goto 101
      // 0fd: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 100: athrow
      // 101: imul
      // 102: newarray 8
      // 104: astore 13
      // 106: aload 11
      // 108: bipush 0
      // 109: aload 13
      // 10b: bipush 0
      // 10c: aload 11
      // 10e: arraylength
      // 10f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 112: aload 13
      // 114: astore 11
      // 116: aload 11
      // 118: iload 12
      // 11a: iinc 12 1
      // 11d: iload 5
      // 11f: i2b
      // 120: bastore
      // 121: iload 2
      // 122: ifeq 02f
      // 125: bipush 0
      // 126: istore 5
      // 128: iload 5
      // 12a: iload 12
      // 12c: if_icmpge 1b1
      // 12f: aload 11
      // 131: iload 5
      // 133: baload
      // 134: istore 4
      // 136: iload 2
      // 137: ifne 17d
      // 13a: iload 4
      // 13c: sipush 24137
      // 13f: ldc2_w 6947470045141486439
      // 142: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 145: iload 2
      // 146: ifne 1b5
      // 149: goto 150
      // 14c: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14f: athrow
      // 150: if_icmpeq 17a
      // 153: goto 15a
      // 156: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 159: athrow
      // 15a: iload 4
      // 15c: sipush 30417
      // 15f: ldc2_w 9152972682709558270
      // 162: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 165: iload 2
      // 166: ifne 18c
      // 169: goto 170
      // 16c: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16f: athrow
      // 170: if_icmpne 181
      // 173: goto 17a
      // 176: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 179: athrow
      // 17a: iinc 5 1
      // 17d: iload 2
      // 17e: ifeq 128
      // 181: iload 4
      // 183: sipush 2420
      // 186: ldc2_w 103651800742042706
      // 189: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 18c: iload 2
      // 18d: ifne 1b5
      // 190: if_icmpne 1b1
      // 193: goto 19a
      // 196: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 199: athrow
      // 19a: aload 0
      // 19b: aload 11
      // 19d: bipush 0
      // 19e: iload 12
      // 1a0: invokestatic com/finalshell/core/E8.O ([BII)Ljava/lang/String;
      // 1a3: invokespecial com/finalshell/core/Bb2.v (Ljava/lang/String;)V
      // 1a6: iload 2
      // 1a7: ifeq 02c
      // 1aa: goto 1b1
      // 1ad: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b0: athrow
      // 1b1: iload 5
      // 1b3: iload 12
      // 1b5: if_icmplt 1cf
      // 1b8: aload 0
      // 1b9: aload 11
      // 1bb: bipush 0
      // 1bc: iload 12
      // 1be: invokestatic com/finalshell/core/E8.O ([BII)Ljava/lang/String;
      // 1c1: invokespecial com/finalshell/core/Bb2.v (Ljava/lang/String;)V
      // 1c4: iload 2
      // 1c5: ifeq 02c
      // 1c8: goto 1cf
      // 1cb: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ce: athrow
      // 1cf: aload 3
      // 1d0: bipush 0
      // 1d1: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 1d4: iload 5
      // 1d6: iload 12
      // 1d8: if_icmpge 235
      // 1db: aload 11
      // 1dd: iload 5
      // 1df: iinc 5 1
      // 1e2: baload
      // 1e3: istore 4
      // 1e5: iload 4
      // 1e7: sipush 16113
      // 1ea: ldc2_w 7526733444494273499
      // 1ed: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 1f0: iload 2
      // 1f1: ifne 039
      // 1f4: iload 2
      // 1f5: ifne 214
      // 1f8: if_icmpeq 235
      // 1fb: goto 202
      // 1fe: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 201: athrow
      // 202: iload 4
      // 204: sipush 3228
      // 207: ldc2_w 4337836552701876657
      // 20a: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 20d: goto 214
      // 210: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 213: athrow
      // 214: if_icmpne 222
      // 217: iload 2
      // 218: ifeq 235
      // 21b: goto 222
      // 21e: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 221: athrow
      // 222: aload 3
      // 223: iload 4
      // 225: i2c
      // 226: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 229: pop
      // 22a: iload 2
      // 22b: ifeq 1d4
      // 22e: goto 235
      // 231: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 234: athrow
      // 235: aload 3
      // 236: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 239: astore 8
      // 23b: iload 2
      // 23c: ifne 27a
      // 23f: iload 5
      // 241: iload 12
      // 243: if_icmpge 267
      // 246: goto 24d
      // 249: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24c: athrow
      // 24d: aload 8
      // 24f: invokevirtual java/lang/String.length ()I
      // 252: iload 2
      // 253: ifne 280
      // 256: goto 25d
      // 259: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25c: athrow
      // 25d: ifne 27e
      // 260: goto 267
      // 263: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 266: athrow
      // 267: aload 0
      // 268: aload 11
      // 26a: bipush 0
      // 26b: iload 12
      // 26d: invokestatic com/finalshell/core/E8.O ([BII)Ljava/lang/String;
      // 270: invokespecial com/finalshell/core/Bb2.v (Ljava/lang/String;)V
      // 273: goto 27a
      // 276: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 279: athrow
      // 27a: iload 2
      // 27b: ifeq 02c
      // 27e: iload 5
      // 280: iload 12
      // 282: if_icmpge 2cc
      // 285: aload 11
      // 287: iload 5
      // 289: baload
      // 28a: istore 4
      // 28c: iload 2
      // 28d: ifne 2c8
      // 290: iload 4
      // 292: sipush 16113
      // 295: ldc2_w 7526733444494273499
      // 298: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 29b: iload 2
      // 29c: ifne 039
      // 29f: goto 2a6
      // 2a2: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a5: athrow
      // 2a6: if_icmpeq 2be
      // 2a9: iload 4
      // 2ab: sipush 3228
      // 2ae: ldc2_w 4337836552701876657
      // 2b1: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 2b4: if_icmpne 2cc
      // 2b7: goto 2be
      // 2ba: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2bd: athrow
      // 2be: iinc 5 1
      // 2c1: goto 2c8
      // 2c4: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c7: athrow
      // 2c8: iload 2
      // 2c9: ifeq 27e
      // 2cc: ldc ""
      // 2ce: astore 13
      // 2d0: aload 8
      // 2d2: bipush 0
      // 2d3: invokevirtual java/lang/String.charAt (I)C
      // 2d6: iload 2
      // 2d7: ifne 406
      // 2da: sipush 27630
      // 2dd: ldc2_w 5520670468914839238
      // 2e0: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 2e3: if_icmpne 400
      // 2e6: goto 2ed
      // 2e9: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ec: athrow
      // 2ed: aload 8
      // 2ef: astore 13
      // 2f1: aload 3
      // 2f2: bipush 0
      // 2f3: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 2f6: iload 5
      // 2f8: iload 12
      // 2fa: if_icmpge 35e
      // 2fd: aload 11
      // 2ff: iload 5
      // 301: iinc 5 1
      // 304: baload
      // 305: istore 4
      // 307: iload 4
      // 309: sipush 16113
      // 30c: ldc2_w 7526733444494273499
      // 30f: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 312: iload 2
      // 313: ifne 373
      // 316: iload 2
      // 317: ifne 373
      // 31a: goto 321
      // 31d: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 320: athrow
      // 321: if_icmpeq 35e
      // 324: goto 32b
      // 327: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32a: athrow
      // 32b: iload 4
      // 32d: sipush 3228
      // 330: ldc2_w 4337836552701876657
      // 333: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 336: if_icmpne 34b
      // 339: goto 340
      // 33c: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33f: athrow
      // 340: iload 2
      // 341: ifeq 35e
      // 344: goto 34b
      // 347: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34a: athrow
      // 34b: aload 3
      // 34c: iload 4
      // 34e: i2c
      // 34f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 352: pop
      // 353: iload 2
      // 354: ifeq 2f6
      // 357: goto 35e
      // 35a: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35d: athrow
      // 35e: aload 3
      // 35f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 362: astore 8
      // 364: iload 2
      // 365: ifne 3a3
      // 368: iload 5
      // 36a: iload 12
      // 36c: goto 373
      // 36f: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 372: athrow
      // 373: if_icmpge 390
      // 376: aload 8
      // 378: invokevirtual java/lang/String.length ()I
      // 37b: iload 2
      // 37c: ifne 3a9
      // 37f: goto 386
      // 382: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 385: athrow
      // 386: ifne 3a7
      // 389: goto 390
      // 38c: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38f: athrow
      // 390: aload 0
      // 391: aload 11
      // 393: bipush 0
      // 394: iload 12
      // 396: invokestatic com/finalshell/core/E8.O ([BII)Ljava/lang/String;
      // 399: invokespecial com/finalshell/core/Bb2.v (Ljava/lang/String;)V
      // 39c: goto 3a3
      // 39f: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a2: athrow
      // 3a3: iload 2
      // 3a4: ifeq 02c
      // 3a7: iload 5
      // 3a9: iload 12
      // 3ab: if_icmpge 400
      // 3ae: aload 11
      // 3b0: iload 5
      // 3b2: baload
      // 3b3: istore 4
      // 3b5: iload 2
      // 3b6: ifne 3fc
      // 3b9: iload 4
      // 3bb: sipush 16113
      // 3be: ldc2_w 7526733444494273499
      // 3c1: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 3c4: iload 2
      // 3c5: ifne 039
      // 3c8: goto 3cf
      // 3cb: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ce: athrow
      // 3cf: if_icmpeq 3f2
      // 3d2: iload 4
      // 3d4: iload 2
      // 3d5: ifne 406
      // 3d8: goto 3df
      // 3db: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3de: athrow
      // 3df: sipush 3228
      // 3e2: ldc2_w 4337836552701876657
      // 3e5: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 3e8: if_icmpne 400
      // 3eb: goto 3f2
      // 3ee: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f1: athrow
      // 3f2: iinc 5 1
      // 3f5: goto 3fc
      // 3f8: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3fb: athrow
      // 3fc: iload 2
      // 3fd: ifeq 3a7
      // 400: aload 3
      // 401: bipush 0
      // 402: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 405: bipush -1
      // 406: istore 10
      // 408: iload 5
      // 40a: iload 12
      // 40c: if_icmpge 469
      // 40f: aload 11
      // 411: iload 5
      // 413: iinc 5 1
      // 416: baload
      // 417: istore 4
      // 419: iload 4
      // 41b: sipush 16113
      // 41e: ldc2_w 7526733444494273499
      // 421: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 424: iload 2
      // 425: ifne 039
      // 428: iload 2
      // 429: ifne 448
      // 42c: if_icmpeq 469
      // 42f: goto 436
      // 432: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 435: athrow
      // 436: iload 4
      // 438: sipush 3228
      // 43b: ldc2_w 4337836552701876657
      // 43e: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 441: goto 448
      // 444: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 447: athrow
      // 448: if_icmpne 456
      // 44b: iload 2
      // 44c: ifeq 469
      // 44f: goto 456
      // 452: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 455: athrow
      // 456: aload 3
      // 457: iload 4
      // 459: i2c
      // 45a: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 45d: pop
      // 45e: iload 2
      // 45f: ifeq 408
      // 462: goto 469
      // 465: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 468: athrow
      // 469: aload 3
      // 46a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 46d: astore 14
      // 46f: aload 14
      // 471: invokestatic com/finalshell/core/DQ.v (Ljava/lang/String;)I
      // 474: iload 2
      // 475: ifne 497
      // 478: bipush -1
      // 479: if_icmpeq 48e
      // 47c: goto 483
      // 47f: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 482: athrow
      // 483: aload 14
      // 485: invokestatic com/finalshell/core/DQ.v (Ljava/lang/String;)I
      // 488: istore 10
      // 48a: iload 2
      // 48b: ifeq 499
      // 48e: iload 12
      // 490: goto 497
      // 493: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 496: athrow
      // 497: istore 5
      // 499: iload 5
      // 49b: iload 12
      // 49d: iload 2
      // 49e: ifne 4c6
      // 4a1: if_icmplt 4c2
      // 4a4: goto 4ab
      // 4a7: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4aa: athrow
      // 4ab: aload 0
      // 4ac: aload 11
      // 4ae: bipush 0
      // 4af: iload 12
      // 4b1: invokestatic com/finalshell/core/E8.O ([BII)Ljava/lang/String;
      // 4b4: invokespecial com/finalshell/core/Bb2.v (Ljava/lang/String;)V
      // 4b7: iload 2
      // 4b8: ifeq 02c
      // 4bb: goto 4c2
      // 4be: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c1: athrow
      // 4c2: iload 5
      // 4c4: iload 12
      // 4c6: if_icmpge 517
      // 4c9: aload 11
      // 4cb: iload 5
      // 4cd: baload
      // 4ce: istore 4
      // 4d0: iload 2
      // 4d1: ifne 513
      // 4d4: iload 4
      // 4d6: sipush 16113
      // 4d9: ldc2_w 7526733444494273499
      // 4dc: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 4df: iload 2
      // 4e0: ifne 520
      // 4e3: goto 4ea
      // 4e6: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e9: athrow
      // 4ea: if_icmpeq 509
      // 4ed: goto 4f4
      // 4f0: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f3: athrow
      // 4f4: iload 4
      // 4f6: sipush 3228
      // 4f9: ldc2_w 4337836552701876657
      // 4fc: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 4ff: if_icmpne 517
      // 502: goto 509
      // 505: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 508: athrow
      // 509: iinc 5 1
      // 50c: goto 513
      // 50f: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 512: athrow
      // 513: iload 2
      // 514: ifeq 4c2
      // 517: aload 3
      // 518: bipush 0
      // 519: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 51c: iload 5
      // 51e: iload 12
      // 520: if_icmpge 5d3
      // 523: aload 11
      // 525: iload 5
      // 527: iinc 5 1
      // 52a: baload
      // 52b: istore 4
      // 52d: iload 4
      // 52f: sipush 2906
      // 532: ldc2_w 9045241454939020923
      // 535: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 538: iload 2
      // 539: ifne 607
      // 53c: iload 2
      // 53d: ifne 567
      // 540: goto 547
      // 543: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 546: athrow
      // 547: if_icmpne 55c
      // 54a: goto 551
      // 54d: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 550: athrow
      // 551: iload 2
      // 552: ifeq 51c
      // 555: goto 55c
      // 558: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55b: athrow
      // 55c: iload 4
      // 55e: sipush 9686
      // 561: ldc2_w 4877997833636720893
      // 564: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 567: iload 2
      // 568: ifne 59d
      // 56b: if_icmpne 580
      // 56e: goto 575
      // 571: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 574: athrow
      // 575: iload 2
      // 576: ifeq 5d3
      // 579: goto 580
      // 57c: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57f: athrow
      // 580: iload 4
      // 582: iload 2
      // 583: ifne 5de
      // 586: goto 58d
      // 589: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58c: athrow
      // 58d: sipush 16113
      // 590: ldc2_w 7526733444494273499
      // 593: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 596: goto 59d
      // 599: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59c: athrow
      // 59d: if_icmpeq 5d3
      // 5a0: iload 4
      // 5a2: sipush 3228
      // 5a5: ldc2_w 4337836552701876657
      // 5a8: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 5ab: if_icmpne 5c0
      // 5ae: goto 5b5
      // 5b1: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b4: athrow
      // 5b5: iload 2
      // 5b6: ifeq 5d3
      // 5b9: goto 5c0
      // 5bc: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5bf: athrow
      // 5c0: aload 3
      // 5c1: iload 4
      // 5c3: i2c
      // 5c4: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 5c7: pop
      // 5c8: iload 2
      // 5c9: ifeq 51c
      // 5cc: goto 5d3
      // 5cf: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d2: athrow
      // 5d3: aload 3
      // 5d4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5d7: astore 9
      // 5d9: aload 9
      // 5db: invokevirtual java/lang/String.length ()I
      // 5de: iload 2
      // 5df: ifne 605
      // 5e2: ifne 603
      // 5e5: goto 5ec
      // 5e8: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5eb: athrow
      // 5ec: aload 0
      // 5ed: aload 11
      // 5ef: bipush 0
      // 5f0: iload 12
      // 5f2: invokestatic com/finalshell/core/E8.O ([BII)Ljava/lang/String;
      // 5f5: invokespecial com/finalshell/core/Bb2.v (Ljava/lang/String;)V
      // 5f8: iload 2
      // 5f9: ifeq 02c
      // 5fc: goto 603
      // 5ff: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 602: athrow
      // 603: iload 5
      // 605: iload 12
      // 607: if_icmpge 651
      // 60a: aload 11
      // 60c: iload 5
      // 60e: baload
      // 60f: istore 4
      // 611: iload 2
      // 612: ifne 64d
      // 615: iload 4
      // 617: sipush 16113
      // 61a: ldc2_w 7526733444494273499
      // 61d: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 620: iload 2
      // 621: ifne 039
      // 624: goto 62b
      // 627: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62a: athrow
      // 62b: if_icmpeq 643
      // 62e: iload 4
      // 630: sipush 3228
      // 633: ldc2_w 4337836552701876657
      // 636: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 639: if_icmpne 651
      // 63c: goto 643
      // 63f: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 642: athrow
      // 643: iinc 5 1
      // 646: goto 64d
      // 649: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64c: athrow
      // 64d: iload 2
      // 64e: ifeq 603
      // 651: aconst_null
      // 652: astore 15
      // 654: iload 5
      // 656: iload 12
      // 658: if_icmpge 6d2
      // 65b: aload 3
      // 65c: bipush 0
      // 65d: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 660: goto 667
      // 663: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 666: athrow
      // 667: iload 5
      // 669: iload 12
      // 66b: if_icmpge 6cc
      // 66e: aload 11
      // 670: iload 5
      // 672: iinc 5 1
      // 675: baload
      // 676: istore 4
      // 678: iload 4
      // 67a: sipush 2906
      // 67d: ldc2_w 9045241454939020923
      // 680: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 683: iload 2
      // 684: ifne 039
      // 687: iload 2
      // 688: ifne 6ab
      // 68b: if_icmpne 6a0
      // 68e: goto 695
      // 691: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 694: athrow
      // 695: iload 2
      // 696: ifeq 667
      // 699: goto 6a0
      // 69c: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69f: athrow
      // 6a0: iload 4
      // 6a2: sipush 9686
      // 6a5: ldc2_w 4877997833636720893
      // 6a8: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 6ab: if_icmpne 6b9
      // 6ae: iload 2
      // 6af: ifeq 6cc
      // 6b2: goto 6b9
      // 6b5: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b8: athrow
      // 6b9: aload 3
      // 6ba: iload 4
      // 6bc: i2c
      // 6bd: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 6c0: pop
      // 6c1: iload 2
      // 6c2: ifeq 667
      // 6c5: goto 6cc
      // 6c8: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6cb: athrow
      // 6cc: aload 3
      // 6cd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6d0: astore 15
      // 6d2: aconst_null
      // 6d3: astore 16
      // 6d5: new com/finalshell/core/Dg2
      // 6d8: dup
      // 6d9: aload 0
      // 6da: aload 13
      // 6dc: aload 8
      // 6de: iload 10
      // 6e0: aload 9
      // 6e2: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 6e5: bipush 0
      // 6e6: aload 9
      // 6e8: invokevirtual java/lang/String.length ()I
      // 6eb: invokestatic com/finalshell/core/E8.M ([BII)[B
      // 6ee: aload 15
      // 6f0: invokespecial com/finalshell/core/Dg2.<init> (Lcom/finalshell/core/Bb2;Ljava/lang/String;Ljava/lang/String;I[BLjava/lang/String;)V
      // 6f3: astore 16
      // 6f5: aload 0
      // 6f6: getfield com/finalshell/core/Bb2.U Ljava/util/Vector;
      // 6f9: aload 16
      // 6fb: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 6fe: iload 2
      // 6ff: ifeq 02c
      // 702: iload 6
      // 704: ifeq 71c
      // 707: new com/finalshell/core/Pc2
      // 70a: dup
      // 70b: sipush 15178
      // 70e: sipush -12454
      // 711: invokestatic com/finalshell/core/Bb2.a (II)Ljava/lang/String;
      // 714: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 717: athrow
      // 718: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71b: athrow
      // 71c: aload 7
      // 71e: iload 2
      // 71f: ifne 72e
      // 722: ifnull 75a
      // 725: goto 72c
      // 728: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 72b: athrow
      // 72c: aload 7
      // 72e: invokevirtual java/io/InputStream.close ()V
      // 731: goto 75a
      // 734: astore 8
      // 736: aload 7
      // 738: iload 2
      // 739: ifne 748
      // 73c: ifnull 757
      // 73f: goto 746
      // 742: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 745: athrow
      // 746: aload 7
      // 748: invokevirtual java/io/InputStream.close ()V
      // 74b: goto 757
      // 74e: astore 9
      // 750: aload 8
      // 752: aload 9
      // 754: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 757: aload 8
      // 759: athrow
      // 75a: goto 78e
      // 75d: astore 7
      // 75f: aload 7
      // 761: iload 2
      // 762: ifne 77b
      // 765: instanceof com/finalshell/core/Pc2
      // 768: ifeq 77f
      // 76b: goto 772
      // 76e: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 771: athrow
      // 772: aload 7
      // 774: goto 77b
      // 777: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77a: athrow
      // 77b: checkcast com/finalshell/core/Pc2
      // 77e: athrow
      // 77f: new com/finalshell/core/Pc2
      // 782: dup
      // 783: aload 7
      // 785: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 788: aload 7
      // 78a: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 78d: athrow
      // 78e: return
   }

   public void v(String var1) throws Pc2 {
      DQ var2 = new DQ(var1, -1, null);
      this.U.addElement(var2);
   }

   public String A() {
      return this.H;
   }

   @Override
   public String O() {
      return this.H;
   }

   @Override
   public int e(String param1, byte[] param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: bipush 1
      // 004: istore 4
      // 006: istore 3
      // 007: aload 1
      // 008: ifnonnull 012
      // 00b: iload 4
      // 00d: ireturn
      // 00e: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 011: athrow
      // 012: aconst_null
      // 013: astore 5
      // 015: new com/finalshell/core/DQ
      // 018: dup
      // 019: aload 1
      // 01a: bipush 0
      // 01b: aload 2
      // 01c: invokespecial com/finalshell/core/DQ.<init> (Ljava/lang/String;I[B)V
      // 01f: astore 5
      // 021: goto 057
      // 024: astore 6
      // 026: aload 0
      // 027: getfield com/finalshell/core/Bb2.l Lcom/finalshell/core/Xe2;
      // 02a: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 02d: bipush 0
      // 02e: new java/lang/StringBuilder
      // 031: dup
      // 032: invokespecial java/lang/StringBuilder.<init> ()V
      // 035: sipush 15168
      // 038: sipush -28917
      // 03b: invokestatic com/finalshell/core/Bb2.a (II)Ljava/lang/String;
      // 03e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 041: aload 1
      // 042: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 045: ldc "'"
      // 047: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 04d: aload 6
      // 04f: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 054: iload 4
      // 056: ireturn
      // 057: aload 0
      // 058: getfield com/finalshell/core/Bb2.U Ljava/util/Vector;
      // 05b: dup
      // 05c: astore 6
      // 05e: monitorenter
      // 05f: bipush 0
      // 060: istore 7
      // 062: iload 7
      // 064: aload 0
      // 065: getfield com/finalshell/core/Bb2.U Ljava/util/Vector;
      // 068: invokevirtual java/util/Vector.size ()I
      // 06b: if_icmpge 0e7
      // 06e: aload 0
      // 06f: getfield com/finalshell/core/Bb2.U Ljava/util/Vector;
      // 072: iload 7
      // 074: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 077: checkcast com/finalshell/core/DQ
      // 07a: astore 8
      // 07c: iload 3
      // 07d: ifne 0e3
      // 080: aload 8
      // 082: aload 1
      // 083: invokevirtual com/finalshell/core/DQ.p (Ljava/lang/String;)Z
      // 086: iload 3
      // 087: ifne 0f7
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 090: athrow
      // 091: ifeq 0e0
      // 094: goto 09b
      // 097: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09a: athrow
      // 09b: aload 8
      // 09d: getfield com/finalshell/core/DQ.h I
      // 0a0: iload 3
      // 0a1: ifne 0ca
      // 0a4: goto 0ab
      // 0a7: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0aa: athrow
      // 0ab: aload 5
      // 0ad: getfield com/finalshell/core/DQ.h I
      // 0b0: if_icmpne 0e0
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: aload 8
      // 0bc: getfield com/finalshell/core/DQ.v [B
      // 0bf: aload 2
      // 0c0: invokestatic com/finalshell/core/E8.I ([B[B)Z
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c9: athrow
      // 0ca: iload 3
      // 0cb: ifne 0de
      // 0ce: ifeq 0dd
      // 0d1: goto 0d8
      // 0d4: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d7: athrow
      // 0d8: bipush 0
      // 0d9: aload 6
      // 0db: monitorexit
      // 0dc: ireturn
      // 0dd: bipush 2
      // 0de: istore 4
      // 0e0: iinc 7 1
      // 0e3: iload 3
      // 0e4: ifeq 062
      // 0e7: aload 6
      // 0e9: monitorexit
      // 0ea: goto 0f5
      // 0ed: astore 9
      // 0ef: aload 6
      // 0f1: monitorexit
      // 0f2: aload 9
      // 0f4: athrow
      // 0f5: iload 4
      // 0f7: iload 3
      // 0f8: ifne 163
      // 0fb: bipush 1
      // 0fc: if_icmpne 161
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 105: athrow
      // 106: aload 1
      // 107: ldc_w "["
      // 10a: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 10d: iload 3
      // 10e: ifne 163
      // 111: goto 118
      // 114: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 117: athrow
      // 118: ifeq 161
      // 11b: goto 122
      // 11e: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 121: athrow
      // 122: aload 1
      // 123: sipush 15177
      // 126: sipush 17279
      // 129: invokestatic com/finalshell/core/Bb2.a (II)Ljava/lang/String;
      // 12c: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 12f: iload 3
      // 130: ifne 163
      // 133: goto 13a
      // 136: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 139: athrow
      // 13a: bipush 1
      // 13b: if_icmple 161
      // 13e: goto 145
      // 141: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 144: athrow
      // 145: aload 0
      // 146: aload 1
      // 147: bipush 1
      // 148: aload 1
      // 149: sipush 15175
      // 14c: sipush 23046
      // 14f: invokestatic com/finalshell/core/Bb2.a (II)Ljava/lang/String;
      // 152: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 155: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 158: aload 2
      // 159: invokevirtual com/finalshell/core/Bb2.e (Ljava/lang/String;[B)I
      // 15c: ireturn
      // 15d: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 160: athrow
      // 161: iload 4
      // 163: ireturn
   }

   @Override
   public void Y(DQ param1, Gq2 param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getfield com/finalshell/core/DQ.h I
      // 04: istore 4
      // 06: aload 1
      // 07: invokevirtual com/finalshell/core/DQ.c ()Ljava/lang/String;
      // 0a: astore 5
      // 0c: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 0f: aconst_null
      // 10: astore 6
      // 12: istore 3
      // 13: aload 0
      // 14: getfield com/finalshell/core/Bb2.U Ljava/util/Vector;
      // 17: dup
      // 18: astore 7
      // 1a: monitorenter
      // 1b: bipush 0
      // 1c: istore 8
      // 1e: iload 8
      // 20: aload 0
      // 21: getfield com/finalshell/core/Bb2.U Ljava/util/Vector;
      // 24: invokevirtual java/util/Vector.size ()I
      // 27: if_icmpge 70
      // 2a: aload 0
      // 2b: getfield com/finalshell/core/Bb2.U Ljava/util/Vector;
      // 2e: iload 8
      // 30: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 33: checkcast com/finalshell/core/DQ
      // 36: astore 6
      // 38: iload 3
      // 39: ifne 6c
      // 3c: aload 6
      // 3e: iload 3
      // 3f: ifne 7f
      // 42: goto 49
      // 45: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: aload 5
      // 4b: invokevirtual com/finalshell/core/DQ.p (Ljava/lang/String;)Z
      // 4e: ifeq 69
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: aload 6
      // 5a: getfield com/finalshell/core/DQ.h I
      // 5d: iload 4
      // 5f: if_icmpne 69
      // 62: goto 69
      // 65: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: iinc 8 1
      // 6c: iload 3
      // 6d: ifeq 1e
      // 70: aload 7
      // 72: monitorexit
      // 73: goto 7e
      // 76: astore 9
      // 78: aload 7
      // 7a: monitorexit
      // 7b: aload 9
      // 7d: athrow
      // 7e: aload 1
      // 7f: astore 6
      // 81: aload 0
      // 82: getfield com/finalshell/core/Bb2.U Ljava/util/Vector;
      // 85: aload 6
      // 87: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 8a: aload 0
      // 8b: aload 2
      // 8c: invokevirtual com/finalshell/core/Bb2.w (Lcom/finalshell/core/Gq2;)V
      // 8f: return
   }

   public void w(Gq2 param1) {
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
      // 04: invokevirtual com/finalshell/core/Bb2.O ()Ljava/lang/String;
      // 07: astore 3
      // 08: istore 2
      // 09: iload 2
      // 0a: ifeq 22
      // 0d: aload 3
      // 0e: ifnonnull 1d
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: return
      // 19: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 0
      // 1e: aload 3
      // 1f: invokevirtual com/finalshell/core/Bb2.M (Ljava/lang/String;)V
      // 22: goto 27
      // 25: astore 4
      // 27: return
   }

   @Override
   public DQ[] G() {
      return this.R(null, (String)null);
   }

   @Override
   public DQ[] R(String param1, String param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: aload 0
      // 004: getfield com/finalshell/core/Bb2.U Ljava/util/Vector;
      // 007: dup
      // 008: astore 4
      // 00a: monitorenter
      // 00b: istore 3
      // 00c: new java/util/ArrayList
      // 00f: dup
      // 010: invokespecial java/util/ArrayList.<init> ()V
      // 013: astore 5
      // 015: bipush 0
      // 016: istore 6
      // 018: iload 6
      // 01a: aload 0
      // 01b: getfield com/finalshell/core/Bb2.U Ljava/util/Vector;
      // 01e: invokevirtual java/util/Vector.size ()I
      // 021: if_icmpge 0b8
      // 024: aload 0
      // 025: getfield com/finalshell/core/Bb2.U Ljava/util/Vector;
      // 028: iload 6
      // 02a: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 02d: checkcast com/finalshell/core/DQ
      // 030: astore 7
      // 032: aload 7
      // 034: getfield com/finalshell/core/DQ.h I
      // 037: iload 3
      // 038: ifne 0bf
      // 03b: bipush -1
      // 03c: if_icmpne 051
      // 03f: goto 046
      // 042: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 045: athrow
      // 046: iload 3
      // 047: ifeq 0b1
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 050: athrow
      // 051: aload 1
      // 052: ifnull 0a0
      // 055: goto 05c
      // 058: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05b: athrow
      // 05c: aload 7
      // 05e: aload 1
      // 05f: invokevirtual com/finalshell/core/DQ.p (Ljava/lang/String;)Z
      // 062: ifeq 0b1
      // 065: goto 06c
      // 068: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06b: athrow
      // 06c: aload 2
      // 06d: iload 3
      // 06e: ifne 08e
      // 071: goto 078
      // 074: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 077: athrow
      // 078: ifnull 0a0
      // 07b: goto 082
      // 07e: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 081: athrow
      // 082: aload 7
      // 084: invokevirtual com/finalshell/core/DQ.J ()Ljava/lang/String;
      // 087: goto 08e
      // 08a: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08d: athrow
      // 08e: aload 2
      // 08f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 092: iload 3
      // 093: ifne 0b0
      // 096: ifeq 0b1
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09f: athrow
      // 0a0: aload 5
      // 0a2: aload 7
      // 0a4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0a9: goto 0b0
      // 0ac: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0af: athrow
      // 0b0: pop
      // 0b1: iinc 6 1
      // 0b4: iload 3
      // 0b5: ifeq 018
      // 0b8: aload 5
      // 0ba: invokeinterface java/util/List.size ()I 1
      // 0bf: anewarray 114
      // 0c2: astore 6
      // 0c4: bipush 0
      // 0c5: istore 7
      // 0c7: iload 7
      // 0c9: aload 5
      // 0cb: invokeinterface java/util/List.size ()I 1
      // 0d0: if_icmpge 0f6
      // 0d3: aload 6
      // 0d5: iload 7
      // 0d7: aload 5
      // 0d9: iload 7
      // 0db: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0e0: checkcast com/finalshell/core/DQ
      // 0e3: aastore
      // 0e4: iinc 7 1
      // 0e7: iload 3
      // 0e8: ifne 186
      // 0eb: iload 3
      // 0ec: ifeq 0c7
      // 0ef: goto 0f6
      // 0f2: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f5: athrow
      // 0f6: aload 1
      // 0f7: iload 3
      // 0f8: ifne 106
      // 0fb: ifnull 186
      // 0fe: goto 105
      // 101: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 104: athrow
      // 105: aload 1
      // 106: ldc_w "["
      // 109: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 10c: iload 3
      // 10d: ifne 12e
      // 110: ifeq 186
      // 113: goto 11a
      // 116: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 119: athrow
      // 11a: aload 1
      // 11b: sipush 15175
      // 11e: sipush 23046
      // 121: invokestatic com/finalshell/core/Bb2.a (II)Ljava/lang/String;
      // 124: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 127: goto 12e
      // 12a: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12d: athrow
      // 12e: bipush 1
      // 12f: if_icmple 186
      // 132: aload 0
      // 133: aload 1
      // 134: bipush 1
      // 135: aload 1
      // 136: sipush 15175
      // 139: sipush 23046
      // 13c: invokestatic com/finalshell/core/Bb2.a (II)Ljava/lang/String;
      // 13f: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 142: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 145: aload 2
      // 146: invokevirtual com/finalshell/core/Bb2.R (Ljava/lang/String;Ljava/lang/String;)[Lcom/finalshell/core/DQ;
      // 149: astore 7
      // 14b: aload 7
      // 14d: iload 3
      // 14e: ifne 18b
      // 151: arraylength
      // 152: ifle 186
      // 155: goto 15c
      // 158: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15b: athrow
      // 15c: aload 6
      // 15e: arraylength
      // 15f: aload 7
      // 161: arraylength
      // 162: iadd
      // 163: anewarray 114
      // 166: astore 8
      // 168: aload 6
      // 16a: bipush 0
      // 16b: aload 8
      // 16d: bipush 0
      // 16e: aload 6
      // 170: arraylength
      // 171: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 174: aload 7
      // 176: bipush 0
      // 177: aload 8
      // 179: aload 6
      // 17b: arraylength
      // 17c: aload 7
      // 17e: arraylength
      // 17f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 182: aload 8
      // 184: astore 6
      // 186: aload 6
      // 188: aload 4
      // 18a: monitorexit
      // 18b: areturn
      // 18c: astore 9
      // 18e: aload 4
      // 190: monitorexit
      // 191: aload 9
      // 193: athrow
   }

   @Override
   public void Y(String var1, String var2) {
      this.n(var1, var2, null);
   }

   @Override
   public void n(String param1, String param2, byte[] param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: bipush 0
      // 004: istore 5
      // 006: aload 0
      // 007: getfield com/finalshell/core/Bb2.U Ljava/util/Vector;
      // 00a: dup
      // 00b: astore 6
      // 00d: monitorenter
      // 00e: istore 4
      // 010: bipush 0
      // 011: istore 7
      // 013: iload 7
      // 015: aload 0
      // 016: getfield com/finalshell/core/Bb2.U Ljava/util/Vector;
      // 019: invokevirtual java/util/Vector.size ()I
      // 01c: if_icmpge 150
      // 01f: aload 0
      // 020: getfield com/finalshell/core/Bb2.U Ljava/util/Vector;
      // 023: iload 7
      // 025: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 028: checkcast com/finalshell/core/DQ
      // 02b: astore 8
      // 02d: iload 4
      // 02f: ifeq 153
      // 032: aload 1
      // 033: iload 4
      // 035: ifeq 0b2
      // 038: goto 03f
      // 03b: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03e: athrow
      // 03f: ifnull 0a6
      // 042: goto 049
      // 045: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 048: athrow
      // 049: aload 8
      // 04b: aload 1
      // 04c: invokevirtual com/finalshell/core/DQ.p (Ljava/lang/String;)Z
      // 04f: ifeq 148
      // 052: goto 059
      // 055: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058: athrow
      // 059: aload 2
      // 05a: iload 4
      // 05c: ifeq 0b2
      // 05f: goto 066
      // 062: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 065: athrow
      // 066: ifnull 0a6
      // 069: goto 070
      // 06c: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06f: athrow
      // 070: aload 8
      // 072: invokevirtual com/finalshell/core/DQ.J ()Ljava/lang/String;
      // 075: aload 2
      // 076: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 079: ifeq 148
      // 07c: goto 083
      // 07f: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 082: athrow
      // 083: aload 3
      // 084: iload 4
      // 086: ifeq 09b
      // 089: goto 090
      // 08c: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: ifnull 0a6
      // 093: goto 09a
      // 096: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 099: athrow
      // 09a: aload 3
      // 09b: aload 8
      // 09d: getfield com/finalshell/core/DQ.v [B
      // 0a0: invokestatic com/finalshell/core/E8.I ([B[B)Z
      // 0a3: ifeq 148
      // 0a6: aload 8
      // 0a8: invokevirtual com/finalshell/core/DQ.c ()Ljava/lang/String;
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b1: athrow
      // 0b2: astore 9
      // 0b4: iload 4
      // 0b6: ifeq 12d
      // 0b9: aload 1
      // 0ba: ifnull 119
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: aload 9
      // 0c6: aload 1
      // 0c7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ca: iload 4
      // 0cc: ifeq 129
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: ifne 119
      // 0d9: goto 0e0
      // 0dc: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0df: athrow
      // 0e0: aload 8
      // 0e2: iload 4
      // 0e4: ifeq 13b
      // 0e7: goto 0ee
      // 0ea: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ed: athrow
      // 0ee: instanceof com/finalshell/core/Dg2
      // 0f1: ifeq 132
      // 0f4: goto 0fb
      // 0f7: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fa: athrow
      // 0fb: aload 8
      // 0fd: checkcast com/finalshell/core/Dg2
      // 100: iload 4
      // 102: ifeq 13b
      // 105: goto 10c
      // 108: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10b: athrow
      // 10c: invokevirtual com/finalshell/core/Dg2.d ()Z
      // 10f: ifeq 132
      // 112: goto 119
      // 115: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 118: athrow
      // 119: aload 0
      // 11a: getfield com/finalshell/core/Bb2.U Ljava/util/Vector;
      // 11d: aload 8
      // 11f: invokevirtual java/util/Vector.removeElement (Ljava/lang/Object;)Z
      // 122: goto 129
      // 125: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 128: athrow
      // 129: pop
      // 12a: iinc 7 -1
      // 12d: iload 4
      // 12f: ifne 145
      // 132: aload 8
      // 134: goto 13b
      // 137: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13a: athrow
      // 13b: aload 0
      // 13c: aload 9
      // 13e: aload 1
      // 13f: invokevirtual com/finalshell/core/Bb2.L (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 142: putfield com/finalshell/core/DQ.Y Ljava/lang/String;
      // 145: bipush 1
      // 146: istore 5
      // 148: iinc 7 1
      // 14b: iload 4
      // 14d: ifne 013
      // 150: aload 6
      // 152: monitorexit
      // 153: goto 15e
      // 156: astore 10
      // 158: aload 6
      // 15a: monitorexit
      // 15b: aload 10
      // 15d: athrow
      // 15e: iload 5
      // 160: ifeq 16c
      // 163: aload 0
      // 164: invokevirtual com/finalshell/core/Bb2.W ()V
      // 167: goto 16c
      // 16a: astore 6
      // 16c: return
   }

   public void W() throws IOException {
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
      // 05: iload 1
      // 06: ifne 1e
      // 09: getfield com/finalshell/core/Bb2.H Ljava/lang/String;
      // 0c: ifnull 25
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield com/finalshell/core/Bb2.H Ljava/lang/String;
      // 22: invokevirtual com/finalshell/core/Bb2.M (Ljava/lang/String;)V
      // 25: return
   }

   public synchronized void M(String var1) throws IOException {
      try {
         if (var1 == null) {
            return;
         }
      } catch (Throwable var7) {
         throw a(var7);
      }

      FileOutputStream var2 = new FileOutputStream(E8.V(var1));

      try {
         this.v(var2);
      } catch (Throwable var6) {
         try {
            var2.close();
         } catch (Throwable var5) {
            var6.addSuppressed(var5);
         }

         throw var6;
      }

      var2.close();
   }

   public void v(OutputStream var1) throws IOException {
      boolean var2 = Dm4.J$boolean();

      try {
         synchronized (this.U) {
            O0 var5 = new O0();
            Oc2 var6 = new Oc2();
            var5.C(a(15194, -14522), var6);
            int var7 = 0;

            while (var7 < this.U.size()) {
               O0 var8 = new O0();
               var6.add(var8);
               DQ var3 = (DQ)this.U.elementAt(var7);
               String var9 = var3.T();
               String var10 = var3.c();
               String var11 = var3.J();
               String var12 = var3.y();

               try {
                  var8.C(a(15192, 21505), var9);
                  var8.C(a(15172, 4983), var10);
                  var8.C(a(15170, -16896), var11);
                  var8.C(a(15195, -13177), var12);
                  var8.C(a(15197, -22174), var3.C());
                  var7++;
                  if (var2) {
                     return;
                  }

                  if (var2) {
                     break;
                  }
               } catch (Exception var14) {
                  throw a(var14);
               }
            }

            var1.write(var5.toString().getBytes(a(15196, -11679)));
         }
      } catch (Exception var16) {
         System.err.println(var16);
      }
   }

   public void L(OutputStream param1, DQ param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: invokevirtual com/finalshell/core/DQ.T ()Ljava/lang/String;
      // 04: astore 4
      // 06: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 09: aload 2
      // 0a: invokevirtual com/finalshell/core/DQ.c ()Ljava/lang/String;
      // 0d: astore 5
      // 0f: aload 2
      // 10: invokevirtual com/finalshell/core/DQ.J ()Ljava/lang/String;
      // 13: astore 6
      // 15: istore 3
      // 16: aload 2
      // 17: invokevirtual com/finalshell/core/DQ.y ()Ljava/lang/String;
      // 1a: astore 7
      // 1c: aload 6
      // 1e: sipush 15173
      // 21: sipush 8591
      // 24: invokestatic com/finalshell/core/Bb2.a (II)Ljava/lang/String;
      // 27: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2a: iload 3
      // 2b: ifne 5d
      // 2e: ifeq 4d
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 1
      // 39: aload 5
      // 3b: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 3e: invokevirtual java/io/OutputStream.write ([B)V
      // 41: aload 1
      // 42: getstatic com/finalshell/core/Bb2.z [B
      // 45: invokevirtual java/io/OutputStream.write ([B)V
      // 48: return
      // 49: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: aload 4
      // 4f: iload 3
      // 50: ifne af
      // 53: invokevirtual java/lang/String.length ()I
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: ifeq 77
      // 60: aload 1
      // 61: aload 4
      // 63: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 66: invokevirtual java/io/OutputStream.write ([B)V
      // 69: aload 1
      // 6a: getstatic com/finalshell/core/Bb2.K [B
      // 6d: invokevirtual java/io/OutputStream.write ([B)V
      // 70: goto 77
      // 73: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 76: athrow
      // 77: aload 1
      // 78: aload 5
      // 7a: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 7d: invokevirtual java/io/OutputStream.write ([B)V
      // 80: aload 1
      // 81: getstatic com/finalshell/core/Bb2.K [B
      // 84: invokevirtual java/io/OutputStream.write ([B)V
      // 87: aload 1
      // 88: aload 6
      // 8a: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 8d: invokevirtual java/io/OutputStream.write ([B)V
      // 90: aload 1
      // 91: getstatic com/finalshell/core/Bb2.K [B
      // 94: invokevirtual java/io/OutputStream.write ([B)V
      // 97: aload 1
      // 98: aload 2
      // 99: invokevirtual com/finalshell/core/DQ.C ()Ljava/lang/String;
      // 9c: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 9f: invokevirtual java/io/OutputStream.write ([B)V
      // a2: iload 3
      // a3: ifne d0
      // a6: aload 7
      // a8: goto af
      // ab: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ae: athrow
      // af: ifnull c9
      // b2: aload 1
      // b3: getstatic com/finalshell/core/Bb2.K [B
      // b6: invokevirtual java/io/OutputStream.write ([B)V
      // b9: aload 1
      // ba: aload 7
      // bc: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // bf: invokevirtual java/io/OutputStream.write ([B)V
      // c2: goto c9
      // c5: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c8: athrow
      // c9: aload 1
      // ca: getstatic com/finalshell/core/Bb2.z [B
      // cd: invokevirtual java/io/OutputStream.write ([B)V
      // d0: return
   }

   public String L(String param1, String param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 4
      // 03: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 06: aload 2
      // 07: invokevirtual java/lang/String.length ()I
      // 0a: istore 5
      // 0c: istore 3
      // 0d: aload 1
      // 0e: invokevirtual java/lang/String.length ()I
      // 11: istore 6
      // 13: iload 4
      // 15: iload 6
      // 17: if_icmpge 9d
      // 1a: aload 1
      // 1b: sipush 28914
      // 1e: ldc2_w 1340561495199573470
      // 21: invokestatic com/finalshell/core/Bb2.a (IJ)I
      // 24: iload 4
      // 26: invokevirtual java/lang/String.indexOf (II)I
      // 29: istore 7
      // 2b: iload 7
      // 2d: iload 3
      // 2e: ifeq 70
      // 31: bipush -1
      // 32: iload 3
      // 33: ifeq be
      // 36: goto 3d
      // 39: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: if_icmpne 52
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: iload 3
      // 48: ifne 9d
      // 4b: goto 52
      // 4e: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: aload 2
      // 53: iload 3
      // 54: ifeq 9c
      // 57: goto 5e
      // 5a: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: aload 1
      // 5f: iload 4
      // 61: iload 7
      // 63: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 66: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 69: goto 70
      // 6c: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: ifne 7d
      // 73: iload 7
      // 75: bipush 1
      // 76: iadd
      // 77: istore 4
      // 79: iload 3
      // 7a: ifne 13
      // 7d: new java/lang/StringBuilder
      // 80: dup
      // 81: invokespecial java/lang/StringBuilder.<init> ()V
      // 84: aload 1
      // 85: bipush 0
      // 86: iload 4
      // 88: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 8b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8e: aload 1
      // 8f: iload 7
      // 91: bipush 1
      // 92: iadd
      // 93: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 96: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 99: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9c: areturn
      // 9d: aload 1
      // 9e: iload 3
      // 9f: ifeq f0
      // a2: aload 2
      // a3: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // a6: ifeq ef
      // a9: goto b0
      // ac: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // af: athrow
      // b0: iload 6
      // b2: iload 4
      // b4: isub
      // b5: iload 5
      // b7: goto be
      // ba: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bd: athrow
      // be: if_icmpne ef
      // c1: aload 1
      // c2: bipush 0
      // c3: iload 5
      // c5: iload 6
      // c7: iload 3
      // c8: ifeq ea
      // cb: goto d2
      // ce: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d1: athrow
      // d2: if_icmpne e4
      // d5: goto dc
      // d8: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // db: athrow
      // dc: bipush 0
      // dd: goto eb
      // e0: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e3: athrow
      // e4: iload 6
      // e6: iload 5
      // e8: isub
      // e9: bipush 1
      // ea: isub
      // eb: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // ee: areturn
      // ef: aload 1
      // f0: areturn
   }

   public FP X() throws IllegalArgumentException {
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
      // 05: getfield com/finalshell/core/Bb2.r Lcom/finalshell/core/FP;
      // 08: iload 1
      // 09: ifne 35
      // 0c: ifnonnull 31
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: sipush 15169
      // 1b: sipush 2380
      // 1e: invokestatic com/finalshell/core/Bb2.a (II)Ljava/lang/String;
      // 21: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 24: invokevirtual com/finalshell/core/Bb2.X (Ljava/lang/String;)Lcom/finalshell/core/FP;
      // 27: putfield com/finalshell/core/Bb2.r Lcom/finalshell/core/FP;
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/Bb2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: aload 0
      // 32: getfield com/finalshell/core/Bb2.r Lcom/finalshell/core/FP;
      // 35: areturn
   }

   public FP X(String var1) throws IllegalArgumentException {
      try {
         java.lang.Class var2 = java.lang.Class.forName(var1).asSubclass(FP.class);
         return (FP)var2.getDeclaredConstructor().newInstance();
      } catch (Exception var3) {
         this.l.p().c(3, a(15183, 15459) + var1, var3);
         throw new IllegalArgumentException(a(15171, -15420) + var1 + a(15182, 7961), var3);
      }
   }

   public DQ m(String var1, byte[] var2) throws Pc2 {
      Dg2 var3 = new Dg2(this, var1, var2);
      var3.u();
      return var3;
   }

   public static Xe2 W(Bb2 var0) {
      return var0.l;
   }

   static {
      __vfClinit__();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 15176) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 89;
               break;
            case 1:
               var10000 = 181;
               break;
            case 2:
               var10000 = 176;
               break;
            case 3:
               var10000 = 61;
               break;
            case 4:
               var10000 = 59;
               break;
            case 5:
               var10000 = 123;
               break;
            case 6:
               var10000 = 246;
               break;
            case 7:
               var10000 = 127;
               break;
            case 8:
               var10000 = 105;
               break;
            case 9:
               var10000 = 29;
               break;
            case 10:
               var10000 = 13;
               break;
            case 11:
               var10000 = 213;
               break;
            case 12:
               var10000 = 184;
               break;
            case 13:
               var10000 = 252;
               break;
            case 14:
               var10000 = 108;
               break;
            case 15:
               var10000 = 233;
               break;
            case 16:
               var10000 = 70;
               break;
            case 17:
               var10000 = 205;
               break;
            case 18:
               var10000 = 45;
               break;
            case 19:
               var10000 = 104;
               break;
            case 20:
               var10000 = 157;
               break;
            case 21:
               var10000 = 224;
               break;
            case 22:
               var10000 = 158;
               break;
            case 23:
               var10000 = 57;
               break;
            case 24:
               var10000 = 148;
               break;
            case 25:
               var10000 = 172;
               break;
            case 26:
               var10000 = 138;
               break;
            case 27:
               var10000 = 139;
               break;
            case 28:
               var10000 = 117;
               break;
            case 29:
               var10000 = 167;
               break;
            case 30:
               var10000 = 96;
               break;
            case 31:
               var10000 = 81;
               break;
            case 32:
               var10000 = 2;
               break;
            case 33:
               var10000 = 47;
               break;
            case 34:
               var10000 = 36;
               break;
            case 35:
               var10000 = 140;
               break;
            case 36:
               var10000 = 137;
               break;
            case 37:
               var10000 = 166;
               break;
            case 38:
               var10000 = 208;
               break;
            case 39:
               var10000 = 56;
               break;
            case 40:
               var10000 = 194;
               break;
            case 41:
               var10000 = 107;
               break;
            case 42:
               var10000 = 37;
               break;
            case 43:
               var10000 = 48;
               break;
            case 44:
               var10000 = 106;
               break;
            case 45:
               var10000 = 128;
               break;
            case 46:
               var10000 = 197;
               break;
            case 47:
               var10000 = 124;
               break;
            case 48:
               var10000 = 173;
               break;
            case 49:
               var10000 = 78;
               break;
            case 50:
               var10000 = 114;
               break;
            case 51:
               var10000 = 67;
               break;
            case 52:
               var10000 = 147;
               break;
            case 53:
               var10000 = 254;
               break;
            case 54:
               var10000 = 80;
               break;
            case 55:
               var10000 = 33;
               break;
            case 56:
               var10000 = 71;
               break;
            case 57:
               var10000 = 112;
               break;
            case 58:
               var10000 = 199;
               break;
            case 59:
               var10000 = 43;
               break;
            case 60:
               var10000 = 186;
               break;
            case 61:
               var10000 = 16;
               break;
            case 62:
               var10000 = 162;
               break;
            case 63:
               var10000 = 225;
               break;
            case 64:
               var10000 = 185;
               break;
            case 65:
               var10000 = 79;
               break;
            case 66:
               var10000 = 119;
               break;
            case 67:
               var10000 = 52;
               break;
            case 68:
               var10000 = 25;
               break;
            case 69:
               var10000 = 85;
               break;
            case 70:
               var10000 = 154;
               break;
            case 71:
               var10000 = 17;
               break;
            case 72:
               var10000 = 87;
               break;
            case 73:
               var10000 = 211;
               break;
            case 74:
               var10000 = 209;
               break;
            case 75:
               var10000 = 237;
               break;
            case 76:
               var10000 = 179;
               break;
            case 77:
               var10000 = 93;
               break;
            case 78:
               var10000 = 83;
               break;
            case 79:
               var10000 = 150;
               break;
            case 80:
               var10000 = 249;
               break;
            case 81:
               var10000 = 74;
               break;
            case 82:
               var10000 = 1;
               break;
            case 83:
               var10000 = 232;
               break;
            case 84:
               var10000 = 35;
               break;
            case 85:
               var10000 = 142;
               break;
            case 86:
               var10000 = 10;
               break;
            case 87:
               var10000 = 7;
               break;
            case 88:
               var10000 = 190;
               break;
            case 89:
               var10000 = 84;
               break;
            case 90:
               var10000 = 0;
               break;
            case 91:
               var10000 = 196;
               break;
            case 92:
               var10000 = 60;
               break;
            case 93:
               var10000 = 223;
               break;
            case 94:
               var10000 = 28;
               break;
            case 95:
               var10000 = 4;
               break;
            case 96:
               var10000 = 40;
               break;
            case 97:
               var10000 = 130;
               break;
            case 98:
               var10000 = 126;
               break;
            case 99:
               var10000 = 6;
               break;
            case 100:
               var10000 = 9;
               break;
            case 101:
               var10000 = 62;
               break;
            case 102:
               var10000 = 3;
               break;
            case 103:
               var10000 = 230;
               break;
            case 104:
               var10000 = 134;
               break;
            case 105:
               var10000 = 50;
               break;
            case 106:
               var10000 = 5;
               break;
            case 107:
               var10000 = 136;
               break;
            case 108:
               var10000 = 90;
               break;
            case 109:
               var10000 = 58;
               break;
            case 110:
               var10000 = 153;
               break;
            case 111:
               var10000 = 19;
               break;
            case 112:
               var10000 = 174;
               break;
            case 113:
               var10000 = 109;
               break;
            case 114:
               var10000 = 235;
               break;
            case 115:
               var10000 = 76;
               break;
            case 116:
               var10000 = 51;
               break;
            case 117:
               var10000 = 229;
               break;
            case 118:
               var10000 = 248;
               break;
            case 119:
               var10000 = 182;
               break;
            case 120:
               var10000 = 66;
               break;
            case 121:
               var10000 = 15;
               break;
            case 122:
               var10000 = 216;
               break;
            case 123:
               var10000 = 38;
               break;
            case 124:
               var10000 = 227;
               break;
            case 125:
               var10000 = 228;
               break;
            case 126:
               var10000 = 82;
               break;
            case 127:
               var10000 = 146;
               break;
            case 128:
               var10000 = 21;
               break;
            case 129:
               var10000 = 64;
               break;
            case 130:
               var10000 = 143;
               break;
            case 131:
               var10000 = 101;
               break;
            case 132:
               var10000 = 122;
               break;
            case 133:
               var10000 = 221;
               break;
            case 134:
               var10000 = 94;
               break;
            case 135:
               var10000 = 226;
               break;
            case 136:
               var10000 = 222;
               break;
            case 137:
               var10000 = 115;
               break;
            case 138:
               var10000 = 255;
               break;
            case 139:
               var10000 = 44;
               break;
            case 140:
               var10000 = 14;
               break;
            case 141:
               var10000 = 54;
               break;
            case 142:
               var10000 = 97;
               break;
            case 143:
               var10000 = 131;
               break;
            case 144:
               var10000 = 201;
               break;
            case 145:
               var10000 = 180;
               break;
            case 146:
               var10000 = 152;
               break;
            case 147:
               var10000 = 32;
               break;
            case 148:
               var10000 = 165;
               break;
            case 149:
               var10000 = 175;
               break;
            case 150:
               var10000 = 30;
               break;
            case 151:
               var10000 = 86;
               break;
            case 152:
               var10000 = 132;
               break;
            case 153:
               var10000 = 111;
               break;
            case 154:
               var10000 = 26;
               break;
            case 155:
               var10000 = 241;
               break;
            case 156:
               var10000 = 202;
               break;
            case 157:
               var10000 = 159;
               break;
            case 158:
               var10000 = 151;
               break;
            case 159:
               var10000 = 135;
               break;
            case 160:
               var10000 = 238;
               break;
            case 161:
               var10000 = 210;
               break;
            case 162:
               var10000 = 68;
               break;
            case 163:
               var10000 = 63;
               break;
            case 164:
               var10000 = 204;
               break;
            case 165:
               var10000 = 155;
               break;
            case 166:
               var10000 = 168;
               break;
            case 167:
               var10000 = 118;
               break;
            case 168:
               var10000 = 220;
               break;
            case 169:
               var10000 = 145;
               break;
            case 170:
               var10000 = 149;
               break;
            case 171:
               var10000 = 178;
               break;
            case 172:
               var10000 = 170;
               break;
            case 173:
               var10000 = 12;
               break;
            case 174:
               var10000 = 55;
               break;
            case 175:
               var10000 = 183;
               break;
            case 176:
               var10000 = 244;
               break;
            case 177:
               var10000 = 18;
               break;
            case 178:
               var10000 = 207;
               break;
            case 179:
               var10000 = 193;
               break;
            case 180:
               var10000 = 53;
               break;
            case 181:
               var10000 = 103;
               break;
            case 182:
               var10000 = 91;
               break;
            case 183:
               var10000 = 95;
               break;
            case 184:
               var10000 = 34;
               break;
            case 185:
               var10000 = 219;
               break;
            case 186:
               var10000 = 23;
               break;
            case 187:
               var10000 = 214;
               break;
            case 188:
               var10000 = 121;
               break;
            case 189:
               var10000 = 247;
               break;
            case 190:
               var10000 = 125;
               break;
            case 191:
               var10000 = 72;
               break;
            case 192:
               var10000 = 234;
               break;
            case 193:
               var10000 = 251;
               break;
            case 194:
               var10000 = 69;
               break;
            case 195:
               var10000 = 191;
               break;
            case 196:
               var10000 = 20;
               break;
            case 197:
               var10000 = 236;
               break;
            case 198:
               var10000 = 212;
               break;
            case 199:
               var10000 = 195;
               break;
            case 200:
               var10000 = 99;
               break;
            case 201:
               var10000 = 171;
               break;
            case 202:
               var10000 = 200;
               break;
            case 203:
               var10000 = 100;
               break;
            case 204:
               var10000 = 141;
               break;
            case 205:
               var10000 = 188;
               break;
            case 206:
               var10000 = 231;
               break;
            case 207:
               var10000 = 187;
               break;
            case 208:
               var10000 = 250;
               break;
            case 209:
               var10000 = 156;
               break;
            case 210:
               var10000 = 24;
               break;
            case 211:
               var10000 = 41;
               break;
            case 212:
               var10000 = 163;
               break;
            case 213:
               var10000 = 77;
               break;
            case 214:
               var10000 = 22;
               break;
            case 215:
               var10000 = 192;
               break;
            case 216:
               var10000 = 160;
               break;
            case 217:
               var10000 = 129;
               break;
            case 218:
               var10000 = 98;
               break;
            case 219:
               var10000 = 102;
               break;
            case 220:
               var10000 = 133;
               break;
            case 221:
               var10000 = 217;
               break;
            case 222:
               var10000 = 120;
               break;
            case 223:
               var10000 = 177;
               break;
            case 224:
               var10000 = 88;
               break;
            case 225:
               var10000 = 253;
               break;
            case 226:
               var10000 = 75;
               break;
            case 227:
               var10000 = 243;
               break;
            case 228:
               var10000 = 116;
               break;
            case 229:
               var10000 = 242;
               break;
            case 230:
               var10000 = 169;
               break;
            case 231:
               var10000 = 240;
               break;
            case 232:
               var10000 = 198;
               break;
            case 233:
               var10000 = 27;
               break;
            case 234:
               var10000 = 245;
               break;
            case 235:
               var10000 = 8;
               break;
            case 236:
               var10000 = 110;
               break;
            case 237:
               var10000 = 113;
               break;
            case 238:
               var10000 = 42;
               break;
            case 239:
               var10000 = 49;
               break;
            case 240:
               var10000 = 189;
               break;
            case 241:
               var10000 = 92;
               break;
            case 242:
               var10000 = 65;
               break;
            case 243:
               var10000 = 144;
               break;
            case 244:
               var10000 = 218;
               break;
            case 245:
               var10000 = 239;
               break;
            case 246:
               var10000 = 164;
               break;
            case 247:
               var10000 = 31;
               break;
            case 248:
               var10000 = 46;
               break;
            case 249:
               var10000 = 203;
               break;
            case 250:
               var10000 = 206;
               break;
            case 251:
               var10000 = 73;
               break;
            case 252:
               var10000 = 39;
               break;
            case 253:
               var10000 = 11;
               break;
            case 254:
               var10000 = 161;
               break;
            default:
               var10000 = 215;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5418;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[22];
      int var11 = 0;
      String var10 = "Ú£áÁøÌ¸\u00026c\u001a^\u000e^OFb\u001eFæ~F\u0093\u0086\"ÚUWÔ\u000e¤Uç¡Ë3¬\t[j¥á\u0097ð5´E\u0004©;ûË\u0003íK\u001a\u0011V\u0012S\u0098¦$R÷CÅx´\u0093ÚñÛ¨!!mF6\u0088×Ê\u007fÁí\u0089\u0096\\\u001fÏ¤\u0018\u0004ùê\r¿óF$\u000e\u009a\u0093\u008fÏ»\u009d+8´+ä-\u0082B]åRÆÄõ2\u00ad_§\u008eø3\u0010D\u0019Ø\u0004\n;ë<\u0018ù¶æöù-&:ì\u0014Ý\u0019\u000bWØ4ã\u0081N\tr\u0011Ýn,ªB\t\u0090ÞÎ\"Øbá\b»\u0004\u0080ÁBQ\u0011;5\u0088+\f«¢\u0087\u001c\u0018ý÷ÏF\rYÛ\u0004üiQ\u0081\u0007×p\u0096\u009dÞ9)\u0004\u001c¾Ñ¾\u0002It\u0006\r°ËjAc\u0005X\u0019n®>\t\u0007\u008d.\u001dæo\u001bG\u0080\u0007\u001fØY®ï!Z";
      int var12 = "Ú£áÁøÌ¸\u00026c\u001a^\u000e^OFb\u001eFæ~F\u0093\u0086\"ÚUWÔ\u000e¤Uç¡Ë3¬\t[j¥á\u0097ð5´E\u0004©;ûË\u0003íK\u001a\u0011V\u0012S\u0098¦$R÷CÅx´\u0093ÚñÛ¨!!mF6\u0088×Ê\u007fÁí\u0089\u0096\\\u001fÏ¤\u0018\u0004ùê\r¿óF$\u000e\u009a\u0093\u008fÏ»\u009d+8´+ä-\u0082B]åRÆÄõ2\u00ad_§\u008eø3\u0010D\u0019Ø\u0004\n;ë<\u0018ù¶æöù-&:ì\u0014Ý\u0019\u000bWØ4ã\u0081N\tr\u0011Ýn,ªB\t\u0090ÞÎ\"Øbá\b»\u0004\u0080ÁBQ\u0011;5\u0088+\f«¢\u0087\u001c\u0018ý÷ÏF\rYÛ\u0004üiQ\u0081\u0007×p\u0096\u009dÞ9)\u0004\u001c¾Ñ¾\u0002It\u0006\r°ËjAc\u0005X\u0019n®>\t\u0007\u008d.\u001dæo\u001bG\u0080\u0007\u001fØY®ï!Z"
         .length();
      char var9 = 7;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 77;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var33;
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
                        var65 = 91;
                        break;
                     case 1:
                        var65 = 85;
                        break;
                     case 2:
                        var65 = 87;
                        break;
                     case 3:
                        var65 = 20;
                        break;
                     case 4:
                        var65 = 111;
                        break;
                     case 5:
                        var65 = 60;
                        break;
                     default:
                        var65 = 19;
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
                     b = new String[22];
                     long var0 = 3525204293363952183L;
                     long[] var6 = new long[14];
                     int var3 = 0;
                     String var4 = "æ\u0086:\u0086Ü\u0081ÁÌ\u009a&\t\u0002û©ZÀ\u001c\u009fÆ*\u000f\u000b\u0094±§ËRò®±\u008bÌÄÝ1ÚÂð¡p\u001eùæ)\u00adb\tÀ\u009c¬¿(jL\u000fÅ\u00adð\u0014Ê\u0003#ó\u008fü\u0012~=5\u0095\u009a\u008d\u0088\u0099bðÛâo+9H\bPýx qî\n¨VWäôA";
                     int var5 = "æ\u0086:\u0086Ü\u0081ÁÌ\u009a&\t\u0002û©ZÀ\u001c\u009fÆ*\u000f\u000b\u0094±§ËRò®±\u008bÌÄÝ1ÚÂð¡p\u001eùæ)\u00adb\tÀ\u009c¬¿(jL\u000fÅ\u00adð\u0014Ê\u0003#ó\u008fü\u0012~=5\u0095\u009a\u008d\u0088\u0099bðÛâo+9H\bPýx qî\n¨VWäôA"
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
                                    d = new Integer[14];
                                    K = new byte[]{(byte)a(16113, 7526733444494273499L)};
                                    z = E8.J("\n");
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "Ãk¸,Ù,öF\u009ct¯¿ÁØ\u009b\u0087";
                                 var5 = "Ãk¸,Ù,öF\u009ct¯¿ÁØ\u009b\u0087".length();
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

                  var10 = "¥Û\u00143´\u0003\u0097Ü\u0090";
                  var12 = "¥Û\u00143´\u0003\u0097Ü\u0090".length();
                  var9 = 5;
                  var17 = -1;
            }

            var10000 = 1;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





