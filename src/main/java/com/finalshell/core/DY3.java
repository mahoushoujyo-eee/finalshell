package com.finalshell.core;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

public class DY3 extends Dq4 {
   public boolean s = false;
   public int f = 1;
   public int[] g = new int[1];
   public UJ G;
   public YU C;
   public UJ W;
   public YU i;
   public int N = c(30850, 4813681780350687789L);
   public int fp = c(6677, 6590545006375172285L);
   public String p = String.valueOf(this.N);
   public Hashtable x = null;
   public InputStream U = null;
   public boolean n = false;
   public boolean fb = false;
   public boolean O = false;
   public static String fy;
   public static char fs;
   public static boolean v;
   public String q;
   public String a;
   public String T;
   public Charset Q = StandardCharsets.UTF_8;
   public boolean fn = true;
   public Y4 fB = new Y4(this, c(15661, 1784212626451488697L));
   public static String[] eb;
   public static String[] gb;
   public static long[] lb;
   public static Integer[] mb;
   public static long[] ob;
   public static Long[] pb;

   public void K(int param1) throws Pc2 {
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
      // 04: iload 2
      // 05: ifeq 27
      // 08: iload 1
      // 09: ifle 2b
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: new com/finalshell/core/Y4
      // 17: dup
      // 18: aload 0
      // 19: iload 1
      // 1a: invokespecial com/finalshell/core/Y4.<init> (Lcom/finalshell/core/DY3;I)V
      // 1d: putfield com/finalshell/core/DY3.fB Lcom/finalshell/core/Y4;
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: iload 2
      // 28: ifne 5d
      // 2b: new com/finalshell/core/Pc2
      // 2e: dup
      // 2f: new java/lang/StringBuilder
      // 32: dup
      // 33: invokespecial java/lang/StringBuilder.<init> ()V
      // 36: sipush 10310
      // 39: sipush 13087
      // 3c: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 3f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 42: iload 1
      // 43: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 46: sipush 10329
      // 49: sipush 19718
      // 4c: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 4f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 52: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 55: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 58: athrow
      // 59: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: return
   }

   public int B$int() {
      return this.fB.D();
   }

   public DY3() {
      this.M(c(1666, 5175224341428134964L));
      this.Q(c(27629, 2287605882420103521L));
      this.f(c(1064, 4987536805927282341L));
   }

   public HashMap C(ArrayList param1) throws Dn2_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: new java/util/HashMap
      // 006: dup
      // 007: invokespecial java/util/HashMap.<init> ()V
      // 00a: astore 3
      // 00b: istore 2
      // 00c: bipush 0
      // 00d: istore 4
      // 00f: aload 1
      // 010: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 013: astore 5
      // 015: aload 5
      // 017: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 01c: ifeq 066
      // 01f: aload 5
      // 021: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 026: checkcast java/lang/String
      // 029: astore 6
      // 02b: iinc 4 1
      // 02e: aload 0
      // 02f: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 032: checkcast com/finalshell/io/Gu2
      // 035: invokevirtual com/finalshell/io/Gu2.w ()V
      // 038: aload 0
      // 039: aload 6
      // 03b: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 03e: astore 6
      // 040: aload 0
      // 041: aload 6
      // 043: invokespecial com/finalshell/core/DY3.P (Ljava/lang/String;)Ljava/lang/String;
      // 046: astore 6
      // 048: aload 6
      // 04a: aload 0
      // 04b: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 04e: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 051: astore 7
      // 053: aload 0
      // 054: sipush 14831
      // 057: ldc2_w 2087666690219301713
      // 05a: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 05d: aload 7
      // 05f: invokespecial com/finalshell/core/DY3.p (B[B)V
      // 062: iload 2
      // 063: ifeq 015
      // 066: bipush 0
      // 067: istore 5
      // 069: iload 5
      // 06b: iload 4
      // 06d: if_icmpge 120
      // 070: aload 1
      // 071: iload 5
      // 073: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 076: checkcast java/lang/String
      // 079: astore 6
      // 07b: new com/finalshell/core/S_2_2
      // 07e: dup
      // 07f: invokespecial com/finalshell/core/S_2_2.<init> ()V
      // 082: astore 7
      // 084: aload 0
      // 085: aload 0
      // 086: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 089: aload 7
      // 08b: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 08e: astore 7
      // 090: aload 7
      // 092: getfield com/finalshell/core/S_2_2.W I
      // 095: istore 8
      // 097: aload 7
      // 099: getfield com/finalshell/core/S_2_2.T I
      // 09c: istore 9
      // 09e: aload 0
      // 09f: iload 2
      // 0a0: ifne 108
      // 0a3: aload 0
      // 0a4: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0a7: iload 8
      // 0a9: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 0ac: iload 2
      // 0ad: ifne 140
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b6: athrow
      // 0b7: iload 9
      // 0b9: sipush 16469
      // 0bc: ldc2_w 2577773764916978397
      // 0bf: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 0c2: if_icmpeq 100
      // 0c5: goto 0cc
      // 0c8: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cb: athrow
      // 0cc: iload 9
      // 0ce: iload 2
      // 0cf: ifne 0fa
      // 0d2: goto 0d9
      // 0d5: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d8: athrow
      // 0d9: sipush 3538
      // 0dc: ldc2_w 5198299354818211702
      // 0df: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 0e2: if_icmpne 119
      // 0e5: goto 0ec
      // 0e8: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0f0: invokevirtual com/finalshell/core/UJ.d ()I
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f9: athrow
      // 0fa: istore 10
      // 0fc: iload 2
      // 0fd: ifeq 119
      // 100: aload 0
      // 101: goto 108
      // 104: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 107: athrow
      // 108: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 10b: invokestatic com/finalshell/core/C_p_2.Z (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/C_p_2;
      // 10e: astore 10
      // 110: aload 3
      // 111: aload 6
      // 113: aload 10
      // 115: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 118: pop
      // 119: iinc 5 1
      // 11c: iload 2
      // 11d: ifeq 069
      // 120: goto 140
      // 123: astore 5
      // 125: aload 5
      // 127: invokevirtual java/lang/Exception.printStackTrace ()V
      // 12a: new com/finalshell/core/Dn2_2
      // 12d: dup
      // 12e: sipush 17406
      // 131: ldc2_w 813384261767045501
      // 134: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 137: aload 5
      // 139: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 13c: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 13f: athrow
      // 140: aload 3
      // 141: areturn
   }

   @Override
   void n() {
   }

   @Override
   public void t() throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: istore 1
      // 004: new java/io/PipedOutputStream
      // 007: dup
      // 008: invokespecial java/io/PipedOutputStream.<init> ()V
      // 00b: astore 2
      // 00c: aload 0
      // 00d: getfield com/finalshell/core/DY3.o Lcom/finalshell/core/Cs4;
      // 010: aload 2
      // 011: invokevirtual com/finalshell/core/Cs4.H (Ljava/io/OutputStream;)V
      // 014: new com/finalshell/io/Gu2
      // 017: dup
      // 018: aload 2
      // 019: aload 0
      // 01a: getfield com/finalshell/core/DY3.fB Lcom/finalshell/core/Y4;
      // 01d: invokevirtual com/finalshell/core/Y4.D ()I
      // 020: aload 0
      // 021: getfield com/finalshell/core/DY3.c I
      // 024: imul
      // 025: invokespecial com/finalshell/io/Gu2.<init> (Ljava/io/PipedOutputStream;I)V
      // 028: astore 3
      // 029: aload 0
      // 02a: getfield com/finalshell/core/DY3.o Lcom/finalshell/core/Cs4;
      // 02d: aload 3
      // 02e: invokevirtual com/finalshell/core/Cs4.U (Ljava/io/InputStream;)V
      // 031: aload 0
      // 032: aload 0
      // 033: getfield com/finalshell/core/DY3.o Lcom/finalshell/core/Cs4;
      // 036: getfield com/finalshell/core/Cs4.I Ljava/io/InputStream;
      // 039: putfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 03c: aload 0
      // 03d: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 040: ifnonnull 058
      // 043: new com/finalshell/core/Pc2
      // 046: dup
      // 047: sipush 10308
      // 04a: sipush -7896
      // 04d: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 050: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 053: athrow
      // 054: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 057: athrow
      // 058: new com/finalshell/core/QN
      // 05b: dup
      // 05c: invokespecial com/finalshell/core/QN.<init> ()V
      // 05f: astore 4
      // 061: aload 4
      // 063: aload 0
      // 064: invokevirtual com/finalshell/core/DY3.T ()Lcom/finalshell/crypto/ConnectHost;
      // 067: aload 0
      // 068: invokevirtual com/finalshell/core/Qi2.Q (Lcom/finalshell/crypto/ConnectHost;Lcom/finalshell/core/Dm4;)V
      // 06b: aload 0
      // 06c: new com/finalshell/core/UJ
      // 06f: dup
      // 070: aload 0
      // 071: getfield com/finalshell/core/DY3.B I
      // 074: invokespecial com/finalshell/core/UJ.<init> (I)V
      // 077: putfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 07a: aload 0
      // 07b: new com/finalshell/core/YU
      // 07e: dup
      // 07f: aload 0
      // 080: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 083: invokespecial com/finalshell/core/YU.<init> (Lcom/finalshell/core/UJ;)V
      // 086: putfield com/finalshell/core/DY3.C Lcom/finalshell/core/YU;
      // 089: aload 0
      // 08a: new com/finalshell/core/UJ
      // 08d: dup
      // 08e: aload 0
      // 08f: getfield com/finalshell/core/DY3.c I
      // 092: invokespecial com/finalshell/core/UJ.<init> (I)V
      // 095: putfield com/finalshell/core/DY3.W Lcom/finalshell/core/UJ;
      // 098: aload 0
      // 099: new com/finalshell/core/YU
      // 09c: dup
      // 09d: aload 0
      // 09e: getfield com/finalshell/core/DY3.W Lcom/finalshell/core/UJ;
      // 0a1: invokespecial com/finalshell/core/YU.<init> (Lcom/finalshell/core/UJ;)V
      // 0a4: putfield com/finalshell/core/DY3.i Lcom/finalshell/core/YU;
      // 0a7: bipush 0
      // 0a8: istore 5
      // 0aa: aload 0
      // 0ab: invokespecial com/finalshell/core/DY3.Z ()V
      // 0ae: new com/finalshell/core/S_2_2
      // 0b1: dup
      // 0b2: invokespecial com/finalshell/core/S_2_2.<init> ()V
      // 0b5: astore 9
      // 0b7: aload 0
      // 0b8: aload 0
      // 0b9: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0bc: aload 9
      // 0be: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 0c1: astore 9
      // 0c3: aload 9
      // 0c5: getfield com/finalshell/core/S_2_2.W I
      // 0c8: istore 6
      // 0ca: iload 6
      // 0cc: iload 1
      // 0cd: ifeq 110
      // 0d0: sipush 8742
      // 0d3: ldc2_w 556316536112136347
      // 0d6: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 0d9: if_icmple 10b
      // 0dc: goto 0e3
      // 0df: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e2: athrow
      // 0e3: new com/finalshell/core/Dn2_2
      // 0e6: dup
      // 0e7: bipush 4
      // 0e8: new java/lang/StringBuilder
      // 0eb: dup
      // 0ec: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ef: sipush 10324
      // 0f2: sipush 5359
      // 0f5: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 0f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fb: iload 6
      // 0fd: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 100: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 103: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 106: athrow
      // 107: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10a: athrow
      // 10b: aload 9
      // 10d: getfield com/finalshell/core/S_2_2.T I
      // 110: istore 7
      // 112: aload 0
      // 113: aload 9
      // 115: getfield com/finalshell/core/S_2_2.w I
      // 118: putfield com/finalshell/core/DY3.fp I
      // 11b: aload 0
      // 11c: iload 1
      // 11d: ifeq 1a2
      // 120: new java/util/Hashtable
      // 123: dup
      // 124: invokespecial java/util/Hashtable.<init> ()V
      // 127: putfield com/finalshell/core/DY3.x Ljava/util/Hashtable;
      // 12a: iload 6
      // 12c: ifle 192
      // 12f: goto 136
      // 132: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 135: athrow
      // 136: aload 0
      // 137: aload 0
      // 138: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 13b: iload 6
      // 13d: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 140: aconst_null
      // 141: astore 10
      // 143: aconst_null
      // 144: astore 11
      // 146: iload 6
      // 148: ifle 192
      // 14b: aload 0
      // 14c: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 14f: invokevirtual com/finalshell/core/UJ.S ()[B
      // 152: astore 10
      // 154: iload 6
      // 156: bipush 4
      // 157: aload 10
      // 159: arraylength
      // 15a: iadd
      // 15b: isub
      // 15c: istore 6
      // 15e: aload 0
      // 15f: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 162: invokevirtual com/finalshell/core/UJ.S ()[B
      // 165: astore 11
      // 167: iload 6
      // 169: bipush 4
      // 16a: aload 11
      // 16c: arraylength
      // 16d: iadd
      // 16e: isub
      // 16f: istore 6
      // 171: aload 0
      // 172: getfield com/finalshell/core/DY3.x Ljava/util/Hashtable;
      // 175: aload 10
      // 177: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 17a: aload 11
      // 17c: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 17f: invokevirtual java/util/Hashtable.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 182: pop
      // 183: iload 1
      // 184: ifeq 1ea
      // 187: iload 1
      // 188: ifne 146
      // 18b: goto 192
      // 18e: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 191: athrow
      // 192: aload 0
      // 193: getfield com/finalshell/core/DY3.x Ljava/util/Hashtable;
      // 196: sipush 10326
      // 199: sipush 9063
      // 19c: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 19f: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1a2: iload 1
      // 1a3: ifeq 1fa
      // 1a6: ifnull 1ea
      // 1a9: goto 1b0
      // 1ac: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1af: athrow
      // 1b0: aload 0
      // 1b1: getfield com/finalshell/core/DY3.x Ljava/util/Hashtable;
      // 1b4: sipush 10318
      // 1b7: sipush 30491
      // 1ba: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 1bd: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1c0: checkcast java/lang/String
      // 1c3: iload 1
      // 1c4: ifeq 1fa
      // 1c7: goto 1ce
      // 1ca: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cd: athrow
      // 1ce: ldc_w "1"
      // 1d1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1d4: ifeq 1ea
      // 1d7: goto 1de
      // 1da: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1dd: athrow
      // 1de: aload 0
      // 1df: bipush 1
      // 1e0: putfield com/finalshell/core/DY3.n Z
      // 1e3: goto 1ea
      // 1e6: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e9: athrow
      // 1ea: aload 0
      // 1eb: getfield com/finalshell/core/DY3.x Ljava/util/Hashtable;
      // 1ee: sipush 10306
      // 1f1: sipush 25147
      // 1f4: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 1f7: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1fa: iload 1
      // 1fb: ifeq 25d
      // 1fe: ifnull 242
      // 201: goto 208
      // 204: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 207: athrow
      // 208: aload 0
      // 209: getfield com/finalshell/core/DY3.x Ljava/util/Hashtable;
      // 20c: sipush 10317
      // 20f: sipush 12148
      // 212: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 215: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 218: checkcast java/lang/String
      // 21b: iload 1
      // 21c: ifeq 25d
      // 21f: goto 226
      // 222: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 225: athrow
      // 226: ldc_w "2"
      // 229: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 22c: ifeq 242
      // 22f: goto 236
      // 232: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 235: athrow
      // 236: aload 0
      // 237: bipush 1
      // 238: putfield com/finalshell/core/DY3.fb Z
      // 23b: goto 242
      // 23e: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 241: athrow
      // 242: aload 0
      // 243: iload 1
      // 244: ifeq 29b
      // 247: getfield com/finalshell/core/DY3.x Ljava/util/Hashtable;
      // 24a: sipush 10313
      // 24d: sipush -2947
      // 250: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 253: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 256: goto 25d
      // 259: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25c: athrow
      // 25d: ifnull 29a
      // 260: aload 0
      // 261: iload 1
      // 262: ifeq 29b
      // 265: goto 26c
      // 268: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26b: athrow
      // 26c: getfield com/finalshell/core/DY3.x Ljava/util/Hashtable;
      // 26f: sipush 10359
      // 272: sipush -20651
      // 275: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 278: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 27b: checkcast java/lang/String
      // 27e: ldc_w "1"
      // 281: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 284: ifeq 29a
      // 287: goto 28e
      // 28a: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28d: athrow
      // 28e: aload 0
      // 28f: bipush 1
      // 290: putfield com/finalshell/core/DY3.O Z
      // 293: goto 29a
      // 296: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 299: athrow
      // 29a: aload 0
      // 29b: new java/io/File
      // 29e: dup
      // 29f: ldc_w "."
      // 2a2: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 2a5: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 2a8: putfield com/finalshell/core/DY3.T Ljava/lang/String;
      // 2ab: goto 2da
      // 2ae: astore 2
      // 2af: aload 2
      // 2b0: iload 1
      // 2b1: ifeq 2c9
      // 2b4: instanceof com/finalshell/core/Pc2
      // 2b7: ifeq 2cd
      // 2ba: goto 2c1
      // 2bd: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c0: athrow
      // 2c1: aload 2
      // 2c2: goto 2c9
      // 2c5: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c8: athrow
      // 2c9: checkcast com/finalshell/core/Pc2
      // 2cc: athrow
      // 2cd: new com/finalshell/core/Pc2
      // 2d0: dup
      // 2d1: aload 2
      // 2d2: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 2d5: aload 2
      // 2d6: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 2d9: athrow
      // 2da: return
   }

   public void O() {
      this.r();
   }

   public void B$void() {
      this.r();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void m$void(String var1) throws Dn2_2 {
      boolean var10000 = Dm4.J$boolean();
      var1 = this.U(var1);
      boolean var2 = var10000;

      label39: {
         label32: {
            try {
               var8 = new File(var1);
               if (var2) {
                  break label32;
               }

               if (!var8.isDirectory()) {
                  throw new Dn2_2(2, c(10355, 24064));
               }
            } catch (Exception var6) {
               throw a(var6);
            }

            try {
               var8 = new File(var1);
            } catch (Exception var5) {
               boolean var10001 = false;
               break label39;
            }
         }

         try {
            var1 = var8.getCanonicalPath();
         } catch (Exception var4) {
            boolean var9 = false;
         }
      }

      this.T = var1;
   }

   public void r$void(String param1) throws Dn2_2 {
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
      // 05: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 08: checkcast com/finalshell/io/Gu2
      // 0b: invokevirtual com/finalshell/io/Gu2.w ()V
      // 0e: aload 0
      // 0f: aload 1
      // 10: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 13: astore 1
      // 14: aload 0
      // 15: aload 1
      // 16: invokespecial com/finalshell/core/DY3.P (Ljava/lang/String;)Ljava/lang/String;
      // 19: astore 1
      // 1a: aload 0
      // 1b: aload 1
      // 1c: invokespecial com/finalshell/core/DY3.r$arrbyte (Ljava/lang/String;)[B
      // 1f: astore 3
      // 20: aload 0
      // 21: aload 3
      // 22: invokespecial com/finalshell/core/DY3.Y ([B)Lcom/finalshell/core/C_p_2;
      // 25: astore 4
      // 27: aload 4
      // 29: invokevirtual com/finalshell/core/C_p_2.d ()I
      // 2c: bipush 4
      // 2d: iand
      // 2e: iload 2
      // 2f: ifne 68
      // 32: ifne 63
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: new com/finalshell/core/Dn2_2
      // 3f: dup
      // 40: bipush 4
      // 41: new java/lang/StringBuilder
      // 44: dup
      // 45: invokespecial java/lang/StringBuilder.<init> ()V
      // 48: sipush 10319
      // 4b: sipush -22200
      // 4e: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 51: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 54: aload 1
      // 55: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 58: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5b: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 5e: athrow
      // 5f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 4
      // 65: invokevirtual com/finalshell/core/C_p_2.e$boolean ()Z
      // 68: ifne 92
      // 6b: new com/finalshell/core/Dn2_2
      // 6e: dup
      // 6f: bipush 4
      // 70: new java/lang/StringBuilder
      // 73: dup
      // 74: invokespecial java/lang/StringBuilder.<init> ()V
      // 77: sipush 10358
      // 7a: sipush -19959
      // 7d: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 80: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 83: aload 1
      // 84: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 87: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8a: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 8d: athrow
      // 8e: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 91: athrow
      // 92: aload 0
      // 93: aload 3
      // 94: aload 0
      // 95: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 98: invokestatic com/finalshell/core/E8.y ([BLjava/nio/charset/Charset;)Ljava/lang/String;
      // 9b: invokespecial com/finalshell/core/DY3.h (Ljava/lang/String;)V
      // 9e: goto ce
      // a1: astore 3
      // a2: aload 3
      // a3: iload 2
      // a4: ifne bc
      // a7: instanceof com/finalshell/core/Dn2_2
      // aa: ifeq c0
      // ad: goto b4
      // b0: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b3: athrow
      // b4: aload 3
      // b5: goto bc
      // b8: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bb: athrow
      // bc: checkcast com/finalshell/core/Dn2_2
      // bf: athrow
      // c0: new com/finalshell/core/Dn2_2
      // c3: dup
      // c4: bipush 4
      // c5: aload 3
      // c6: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // c9: aload 3
      // ca: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // cd: athrow
      // ce: return
   }

   public void t(String var1, String var2) throws Dn2_2 {
      this.d(var1, var2, null, 0);
   }

   public void b(String var1, String var2, int var3) throws Dn2_2 {
      this.d(var1, var2, null, var3);
   }

   public void S(String var1, String var2, PO3 var3) throws Dn2_2 {
      this.d(var1, var2, var3, 0);
   }

   public void d(String param1, String param2, PO3 param3, int param4) throws Dn2_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: istore 5
      // 005: aload 0
      // 006: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 009: checkcast com/finalshell/io/Gu2
      // 00c: invokevirtual com/finalshell/io/Gu2.w ()V
      // 00f: aload 0
      // 010: aload 1
      // 011: invokespecial com/finalshell/core/DY3.U (Ljava/lang/String;)Ljava/lang/String;
      // 014: astore 1
      // 015: aload 0
      // 016: aload 2
      // 017: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 01a: astore 2
      // 01b: aload 0
      // 01c: aload 2
      // 01d: invokespecial com/finalshell/core/DY3.k$Vector (Ljava/lang/String;)Ljava/util/Vector;
      // 020: astore 6
      // 022: aload 6
      // 024: invokevirtual java/util/Vector.size ()I
      // 027: istore 7
      // 029: iload 7
      // 02b: iload 5
      // 02d: ifeq 092
      // 030: bipush 1
      // 031: if_icmpeq 083
      // 034: goto 03b
      // 037: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03a: athrow
      // 03b: iload 7
      // 03d: iload 5
      // 03f: ifeq 05f
      // 042: goto 049
      // 045: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 048: athrow
      // 049: ifne 075
      // 04c: goto 053
      // 04f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 052: athrow
      // 053: aload 0
      // 054: aload 2
      // 055: invokespecial com/finalshell/core/DY3.A (Ljava/lang/String;)Z
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05e: athrow
      // 05f: ifeq 070
      // 062: new com/finalshell/core/Dn2_2
      // 065: dup
      // 066: bipush 4
      // 067: aload 2
      // 068: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 06b: athrow
      // 06c: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06f: athrow
      // 070: aload 2
      // 071: invokestatic com/finalshell/core/E8.v (Ljava/lang/String;)Ljava/lang/String;
      // 074: astore 2
      // 075: new com/finalshell/core/Dn2_2
      // 078: dup
      // 079: bipush 4
      // 07a: aload 6
      // 07c: invokevirtual java/util/Vector.toString ()Ljava/lang/String;
      // 07f: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 082: athrow
      // 083: aload 6
      // 085: bipush 0
      // 086: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 089: checkcast java/lang/String
      // 08c: astore 2
      // 08d: aload 0
      // 08e: aload 2
      // 08f: invokespecial com/finalshell/core/DY3.m$boolean (Ljava/lang/String;)Z
      // 092: istore 8
      // 094: aload 0
      // 095: aload 1
      // 096: invokespecial com/finalshell/core/DY3.V$Vector (Ljava/lang/String;)Ljava/util/Vector;
      // 099: astore 6
      // 09b: aload 6
      // 09d: invokevirtual java/util/Vector.size ()I
      // 0a0: istore 7
      // 0a2: aconst_null
      // 0a3: astore 9
      // 0a5: iload 8
      // 0a7: iload 5
      // 0a9: ifeq 0fe
      // 0ac: ifeq 0fc
      // 0af: goto 0b6
      // 0b2: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b5: athrow
      // 0b6: aload 2
      // 0b7: iload 5
      // 0b9: ifeq 0ee
      // 0bc: goto 0c3
      // 0bf: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c2: athrow
      // 0c3: ldc_w "/"
      // 0c6: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0c9: ifne 0ef
      // 0cc: goto 0d3
      // 0cf: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d2: athrow
      // 0d3: new java/lang/StringBuilder
      // 0d6: dup
      // 0d7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0da: aload 2
      // 0db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0de: ldc_w "/"
      // 0e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e7: goto 0ee
      // 0ea: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ed: athrow
      // 0ee: astore 2
      // 0ef: new java/lang/StringBuilder
      // 0f2: dup
      // 0f3: aload 2
      // 0f4: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 0f7: astore 9
      // 0f9: goto 118
      // 0fc: iload 7
      // 0fe: bipush 1
      // 0ff: if_icmple 118
      // 102: new com/finalshell/core/Dn2_2
      // 105: dup
      // 106: bipush 4
      // 107: sipush 10323
      // 10a: sipush 26501
      // 10d: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 110: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 113: athrow
      // 114: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 117: athrow
      // 118: bipush 0
      // 119: istore 10
      // 11b: iload 10
      // 11d: iload 7
      // 11f: if_icmpge 2f2
      // 122: aload 6
      // 124: iload 10
      // 126: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 129: checkcast java/lang/String
      // 12c: astore 11
      // 12e: aconst_null
      // 12f: astore 12
      // 131: iload 5
      // 133: ifeq 328
      // 136: iload 8
      // 138: iload 5
      // 13a: ifeq 15d
      // 13d: goto 144
      // 140: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 143: athrow
      // 144: ifeq 1fa
      // 147: goto 14e
      // 14a: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14d: athrow
      // 14e: aload 11
      // 150: getstatic com/finalshell/core/DY3.fs C
      // 153: invokevirtual java/lang/String.lastIndexOf (I)I
      // 156: goto 15d
      // 159: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15c: athrow
      // 15d: istore 13
      // 15f: getstatic com/finalshell/core/DY3.v Z
      // 162: iload 5
      // 164: ifeq 1b3
      // 167: ifeq 1b1
      // 16a: goto 171
      // 16d: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 170: athrow
      // 171: aload 11
      // 173: sipush 1452
      // 176: ldc2_w 3411373113395504906
      // 179: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 17c: invokevirtual java/lang/String.lastIndexOf (I)I
      // 17f: istore 14
      // 181: iload 14
      // 183: bipush -1
      // 184: iload 5
      // 186: ifeq 1b4
      // 189: if_icmpeq 1b1
      // 18c: goto 193
      // 18f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 192: athrow
      // 193: iload 14
      // 195: iload 13
      // 197: iload 5
      // 199: ifeq 1b4
      // 19c: goto 1a3
      // 19f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a2: athrow
      // 1a3: if_icmple 1b1
      // 1a6: goto 1ad
      // 1a9: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ac: athrow
      // 1ad: iload 14
      // 1af: istore 13
      // 1b1: iload 13
      // 1b3: bipush -1
      // 1b4: if_icmpne 1cb
      // 1b7: aload 9
      // 1b9: aload 11
      // 1bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1be: pop
      // 1bf: iload 5
      // 1c1: ifne 1e1
      // 1c4: goto 1cb
      // 1c7: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ca: athrow
      // 1cb: aload 9
      // 1cd: aload 11
      // 1cf: iload 13
      // 1d1: bipush 1
      // 1d2: iadd
      // 1d3: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d9: pop
      // 1da: goto 1e1
      // 1dd: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e0: athrow
      // 1e1: aload 9
      // 1e3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1e6: astore 12
      // 1e8: aload 9
      // 1ea: aload 2
      // 1eb: invokevirtual java/lang/String.length ()I
      // 1ee: aload 12
      // 1f0: invokevirtual java/lang/String.length ()I
      // 1f3: invokevirtual java/lang/StringBuilder.delete (II)Ljava/lang/StringBuilder;
      // 1f6: pop
      // 1f7: goto 1fd
      // 1fa: aload 2
      // 1fb: astore 12
      // 1fd: lconst_0
      // 1fe: lstore 13
      // 200: iload 4
      // 202: bipush 1
      // 203: if_icmpne 26d
      // 206: aload 0
      // 207: aload 12
      // 209: invokespecial com/finalshell/core/DY3.n (Ljava/lang/String;)Lcom/finalshell/core/C_p_2;
      // 20c: astore 15
      // 20e: aload 15
      // 210: invokevirtual com/finalshell/core/C_p_2.v ()J
      // 213: lstore 13
      // 215: goto 21a
      // 218: astore 15
      // 21a: new java/io/File
      // 21d: dup
      // 21e: aload 11
      // 220: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 223: invokevirtual java/io/File.length ()J
      // 226: lstore 15
      // 228: lload 15
      // 22a: lload 13
      // 22c: lcmp
      // 22d: iload 5
      // 22f: ifeq 269
      // 232: ifge 264
      // 235: goto 23c
      // 238: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23b: athrow
      // 23c: new com/finalshell/core/Dn2_2
      // 23f: dup
      // 240: bipush 4
      // 241: new java/lang/StringBuilder
      // 244: dup
      // 245: invokespecial java/lang/StringBuilder.<init> ()V
      // 248: sipush 10322
      // 24b: sipush -13544
      // 24e: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 251: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 254: aload 12
      // 256: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 259: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 25c: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 25f: athrow
      // 260: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 263: athrow
      // 264: lload 15
      // 266: lload 13
      // 268: lcmp
      // 269: ifne 26d
      // 26c: return
      // 26d: aload 3
      // 26e: iload 5
      // 270: ifeq 27e
      // 273: ifnull 2b6
      // 276: goto 27d
      // 279: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27c: athrow
      // 27d: aload 3
      // 27e: bipush 0
      // 27f: aload 11
      // 281: aload 12
      // 283: new java/io/File
      // 286: dup
      // 287: aload 11
      // 289: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 28c: invokevirtual java/io/File.length ()J
      // 28f: invokeinterface com/finalshell/core/PO3.b (ILjava/lang/String;Ljava/lang/String;J)V 6
      // 294: iload 4
      // 296: iload 5
      // 298: ifeq 2b5
      // 29b: bipush 1
      // 29c: if_icmpne 2b6
      // 29f: goto 2a6
      // 2a2: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a5: athrow
      // 2a6: aload 3
      // 2a7: lload 13
      // 2a9: invokeinterface com/finalshell/core/PO3.o (J)Z 3
      // 2ae: goto 2b5
      // 2b1: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b4: athrow
      // 2b5: pop
      // 2b6: new java/io/FileInputStream
      // 2b9: dup
      // 2ba: aload 11
      // 2bc: invokespecial java/io/FileInputStream.<init> (Ljava/lang/String;)V
      // 2bf: astore 15
      // 2c1: aload 0
      // 2c2: aload 15
      // 2c4: aload 12
      // 2c6: aload 3
      // 2c7: iload 4
      // 2c9: invokevirtual com/finalshell/core/DY3.M (Ljava/io/InputStream;Ljava/lang/String;Lcom/finalshell/core/PO3;I)V
      // 2cc: aload 15
      // 2ce: invokevirtual java/io/InputStream.close ()V
      // 2d1: goto 2ea
      // 2d4: astore 16
      // 2d6: aload 15
      // 2d8: invokevirtual java/io/InputStream.close ()V
      // 2db: goto 2e7
      // 2de: astore 17
      // 2e0: aload 16
      // 2e2: aload 17
      // 2e4: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 2e7: aload 16
      // 2e9: athrow
      // 2ea: iinc 10 1
      // 2ed: iload 5
      // 2ef: ifne 11b
      // 2f2: goto 328
      // 2f5: astore 6
      // 2f7: aload 6
      // 2f9: iload 5
      // 2fb: ifeq 314
      // 2fe: instanceof com/finalshell/core/Dn2_2
      // 301: ifeq 318
      // 304: goto 30b
      // 307: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30a: athrow
      // 30b: aload 6
      // 30d: goto 314
      // 310: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 313: athrow
      // 314: checkcast com/finalshell/core/Dn2_2
      // 317: athrow
      // 318: new com/finalshell/core/Dn2_2
      // 31b: dup
      // 31c: bipush 4
      // 31d: aload 6
      // 31f: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 322: aload 6
      // 324: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 327: athrow
      // 328: return
   }

   public void R(InputStream var1, String var2) throws Dn2_2 {
      this.Y(var1, var2, null, 0);
   }

   public void I(InputStream var1, String var2, int var3) throws Dn2_2 {
      this.Y(var1, var2, null, var3);
   }

   public void u(InputStream var1, String var2, PO3 var3) throws Dn2_2 {
      this.Y(var1, var2, var3, 0);
   }

   public void Y(InputStream param1, String param2, PO3 param3, int param4) throws Dn2_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: istore 5
      // 005: aload 0
      // 006: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 009: checkcast com/finalshell/io/Gu2
      // 00c: invokevirtual com/finalshell/io/Gu2.w ()V
      // 00f: aload 0
      // 010: aload 2
      // 011: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 014: astore 2
      // 015: aload 0
      // 016: aload 2
      // 017: invokespecial com/finalshell/core/DY3.k$Vector (Ljava/lang/String;)Ljava/util/Vector;
      // 01a: astore 6
      // 01c: aload 6
      // 01e: invokevirtual java/util/Vector.size ()I
      // 021: istore 7
      // 023: iload 5
      // 025: ifeq 087
      // 028: iload 7
      // 02a: bipush 1
      // 02b: if_icmpeq 07d
      // 02e: goto 035
      // 031: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 034: athrow
      // 035: iload 7
      // 037: iload 5
      // 039: ifeq 059
      // 03c: goto 043
      // 03f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 042: athrow
      // 043: ifne 06f
      // 046: goto 04d
      // 049: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04c: athrow
      // 04d: aload 0
      // 04e: aload 2
      // 04f: invokespecial com/finalshell/core/DY3.A (Ljava/lang/String;)Z
      // 052: goto 059
      // 055: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058: athrow
      // 059: ifeq 06a
      // 05c: new com/finalshell/core/Dn2_2
      // 05f: dup
      // 060: bipush 4
      // 061: aload 2
      // 062: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 065: athrow
      // 066: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 069: athrow
      // 06a: aload 2
      // 06b: invokestatic com/finalshell/core/E8.v (Ljava/lang/String;)Ljava/lang/String;
      // 06e: astore 2
      // 06f: new com/finalshell/core/Dn2_2
      // 072: dup
      // 073: bipush 4
      // 074: aload 6
      // 076: invokevirtual java/util/Vector.toString ()Ljava/lang/String;
      // 079: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 07c: athrow
      // 07d: aload 6
      // 07f: bipush 0
      // 080: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 083: checkcast java/lang/String
      // 086: astore 2
      // 087: iload 5
      // 089: ifeq 0bb
      // 08c: aload 3
      // 08d: ifnull 0b2
      // 090: goto 097
      // 093: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 096: athrow
      // 097: aload 3
      // 098: bipush 0
      // 099: ldc_w "-"
      // 09c: aload 2
      // 09d: sipush 12019
      // 0a0: ldc2_w 4841697866002794215
      // 0a3: invokestatic com/finalshell/core/DY3.d (IJ)J
      // 0a6: invokeinterface com/finalshell/core/PO3.b (ILjava/lang/String;Ljava/lang/String;J)V 6
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: aload 1
      // 0b4: aload 2
      // 0b5: aload 3
      // 0b6: iload 4
      // 0b8: invokevirtual com/finalshell/core/DY3.M (Ljava/io/InputStream;Ljava/lang/String;Lcom/finalshell/core/PO3;I)V
      // 0bb: goto 13f
      // 0be: astore 6
      // 0c0: aload 6
      // 0c2: instanceof com/finalshell/core/Dn2_2
      // 0c5: iload 5
      // 0c7: ifeq 0ef
      // 0ca: ifeq 12f
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d3: athrow
      // 0d4: aload 6
      // 0d6: checkcast com/finalshell/core/Dn2_2
      // 0d9: iload 5
      // 0db: ifeq 12e
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e4: athrow
      // 0e5: getfield com/finalshell/core/Dn2_2.Y I
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: bipush 4
      // 0f0: if_icmpne 129
      // 0f3: aload 0
      // 0f4: aload 2
      // 0f5: invokespecial com/finalshell/core/DY3.m$boolean (Ljava/lang/String;)Z
      // 0f8: ifeq 129
      // 0fb: goto 102
      // 0fe: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 101: athrow
      // 102: new com/finalshell/core/Dn2_2
      // 105: dup
      // 106: bipush 4
      // 107: new java/lang/StringBuilder
      // 10a: dup
      // 10b: invokespecial java/lang/StringBuilder.<init> ()V
      // 10e: aload 2
      // 10f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 112: sipush 10307
      // 115: sipush 2385
      // 118: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 11b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 121: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 124: athrow
      // 125: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 128: athrow
      // 129: aload 6
      // 12b: checkcast com/finalshell/core/Dn2_2
      // 12e: athrow
      // 12f: new com/finalshell/core/Dn2_2
      // 132: dup
      // 133: bipush 4
      // 134: aload 6
      // 136: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 139: aload 6
      // 13b: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 13e: athrow
      // 13f: return
   }

   public void M(InputStream param1, String param2, PO3 param3, int param4) throws Dn2_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: istore 5
      // 005: aload 0
      // 006: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 009: checkcast com/finalshell/io/Gu2
      // 00c: invokevirtual com/finalshell/io/Gu2.w ()V
      // 00f: aload 2
      // 010: aload 0
      // 011: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 014: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 017: astore 6
      // 019: lconst_0
      // 01a: lstore 7
      // 01c: iload 4
      // 01e: bipush 1
      // 01f: iload 5
      // 021: ifne 038
      // 024: if_icmpeq 047
      // 027: goto 02e
      // 02a: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02d: athrow
      // 02e: iload 4
      // 030: bipush 2
      // 031: goto 038
      // 034: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 037: athrow
      // 038: iload 5
      // 03a: ifne 06a
      // 03d: if_icmpne 05b
      // 040: goto 047
      // 043: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 046: athrow
      // 047: aload 0
      // 048: aload 6
      // 04a: invokespecial com/finalshell/core/DY3.Y ([B)Lcom/finalshell/core/C_p_2;
      // 04d: astore 9
      // 04f: aload 9
      // 051: invokevirtual com/finalshell/core/C_p_2.v ()J
      // 054: lstore 7
      // 056: goto 05b
      // 059: astore 9
      // 05b: iload 4
      // 05d: iload 5
      // 05f: ifne 0cc
      // 062: bipush 1
      // 063: goto 06a
      // 066: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 069: athrow
      // 06a: if_icmpne 0ca
      // 06d: lload 7
      // 06f: lconst_0
      // 070: lcmp
      // 071: iload 5
      // 073: ifne 0cc
      // 076: goto 07d
      // 079: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07c: athrow
      // 07d: ifle 0ca
      // 080: goto 087
      // 083: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 086: athrow
      // 087: aload 1
      // 088: lload 7
      // 08a: invokevirtual java/io/InputStream.skip (J)J
      // 08d: lstore 9
      // 08f: lload 9
      // 091: lload 7
      // 093: lcmp
      // 094: iload 5
      // 096: ifne 0cc
      // 099: ifge 0ca
      // 09c: goto 0a3
      // 09f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a2: athrow
      // 0a3: new com/finalshell/core/Dn2_2
      // 0a6: dup
      // 0a7: bipush 4
      // 0a8: new java/lang/StringBuilder
      // 0ab: dup
      // 0ac: invokespecial java/lang/StringBuilder.<init> ()V
      // 0af: sipush 10322
      // 0b2: sipush -13544
      // 0b5: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 0b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bb: aload 2
      // 0bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c2: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 0c5: athrow
      // 0c6: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c9: athrow
      // 0ca: iload 4
      // 0cc: ifne 0e1
      // 0cf: aload 0
      // 0d0: aload 6
      // 0d2: invokespecial com/finalshell/core/DY3.u ([B)V
      // 0d5: iload 5
      // 0d7: ifeq 0ee
      // 0da: goto 0e1
      // 0dd: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: aload 6
      // 0e4: invokespecial com/finalshell/core/DY3.y ([B)V
      // 0e7: goto 0ee
      // 0ea: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ed: athrow
      // 0ee: new com/finalshell/core/S_2_2
      // 0f1: dup
      // 0f2: invokespecial com/finalshell/core/S_2_2.<init> ()V
      // 0f5: astore 9
      // 0f7: aload 0
      // 0f8: aload 0
      // 0f9: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0fc: aload 9
      // 0fe: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 101: astore 9
      // 103: aload 9
      // 105: getfield com/finalshell/core/S_2_2.W I
      // 108: istore 10
      // 10a: aload 9
      // 10c: getfield com/finalshell/core/S_2_2.T I
      // 10f: istore 11
      // 111: aload 0
      // 112: aload 0
      // 113: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 116: iload 10
      // 118: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 11b: iload 11
      // 11d: sipush 20436
      // 120: ldc2_w 5788056615437413713
      // 123: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 126: iload 5
      // 128: ifne 195
      // 12b: if_icmpeq 17e
      // 12e: goto 135
      // 131: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 134: athrow
      // 135: iload 11
      // 137: sipush 12002
      // 13a: ldc2_w 1941196815231405135
      // 13d: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 140: iload 5
      // 142: ifne 195
      // 145: goto 14c
      // 148: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14b: athrow
      // 14c: if_icmpeq 17e
      // 14f: goto 156
      // 152: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 155: athrow
      // 156: new com/finalshell/core/Dn2_2
      // 159: dup
      // 15a: bipush 4
      // 15b: new java/lang/StringBuilder
      // 15e: dup
      // 15f: invokespecial java/lang/StringBuilder.<init> ()V
      // 162: sipush 10354
      // 165: sipush 14937
      // 168: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 16b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16e: iload 11
      // 170: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 173: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 176: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 179: athrow
      // 17a: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17d: athrow
      // 17e: iload 11
      // 180: iload 5
      // 182: ifne 1a6
      // 185: sipush 20436
      // 188: ldc2_w 5788056615437413713
      // 18b: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 18e: goto 195
      // 191: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 194: athrow
      // 195: if_icmpne 1b2
      // 198: aload 0
      // 199: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 19c: invokevirtual com/finalshell/core/UJ.d ()I
      // 19f: goto 1a6
      // 1a2: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a5: athrow
      // 1a6: istore 12
      // 1a8: aload 0
      // 1a9: aload 0
      // 1aa: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 1ad: iload 12
      // 1af: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // 1b2: aload 0
      // 1b3: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 1b6: invokevirtual com/finalshell/core/UJ.S ()[B
      // 1b9: astore 12
      // 1bb: aconst_null
      // 1bc: astore 13
      // 1be: bipush 1
      // 1bf: istore 14
      // 1c1: aload 0
      // 1c2: getfield com/finalshell/core/DY3.w Lcom/finalshell/crypto/ConnectHost;
      // 1c5: invokevirtual com/finalshell/crypto/ConnectHost.D ()I
      // 1c8: istore 15
      // 1ca: iload 14
      // 1cc: iload 5
      // 1ce: ifne 1fb
      // 1d1: ifne 1ff
      // 1d4: goto 1db
      // 1d7: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1da: athrow
      // 1db: aload 0
      // 1dc: getfield com/finalshell/core/DY3.W Lcom/finalshell/core/UJ;
      // 1df: getfield com/finalshell/core/UJ.g [B
      // 1e2: arraylength
      // 1e3: sipush 20058
      // 1e6: ldc2_w 4916386186292833512
      // 1e9: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 1ec: aload 12
      // 1ee: arraylength
      // 1ef: iadd
      // 1f0: iload 15
      // 1f2: iadd
      // 1f3: isub
      // 1f4: goto 1fb
      // 1f7: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fa: athrow
      // 1fb: newarray 8
      // 1fd: astore 13
      // 1ff: lconst_0
      // 200: lstore 16
      // 202: iload 4
      // 204: bipush 1
      // 205: iload 5
      // 207: ifne 22a
      // 20a: if_icmpeq 22d
      // 20d: goto 214
      // 210: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 213: athrow
      // 214: iload 4
      // 216: iload 5
      // 218: ifne 238
      // 21b: goto 222
      // 21e: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 221: athrow
      // 222: bipush 2
      // 223: goto 22a
      // 226: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 229: athrow
      // 22a: if_icmpne 234
      // 22d: lload 16
      // 22f: lload 7
      // 231: ladd
      // 232: lstore 16
      // 234: aload 0
      // 235: getfield com/finalshell/core/DY3.f I
      // 238: istore 18
      // 23a: bipush 0
      // 23b: istore 19
      // 23d: bipush 0
      // 23e: istore 20
      // 240: bipush 0
      // 241: istore 21
      // 243: iload 14
      // 245: iload 5
      // 247: ifne 284
      // 24a: ifne 25e
      // 24d: goto 254
      // 250: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 253: athrow
      // 254: aload 13
      // 256: arraylength
      // 257: istore 21
      // 259: iload 5
      // 25b: ifeq 286
      // 25e: aload 0
      // 25f: getfield com/finalshell/core/DY3.W Lcom/finalshell/core/UJ;
      // 262: getfield com/finalshell/core/UJ.g [B
      // 265: astore 13
      // 267: sipush 32560
      // 26a: ldc2_w 5876552777072614817
      // 26d: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 270: aload 12
      // 272: arraylength
      // 273: iadd
      // 274: istore 20
      // 276: aload 0
      // 277: getfield com/finalshell/core/DY3.W Lcom/finalshell/core/UJ;
      // 27a: getfield com/finalshell/core/UJ.g [B
      // 27d: arraylength
      // 27e: iload 20
      // 280: isub
      // 281: iload 15
      // 283: isub
      // 284: istore 21
      // 286: aload 0
      // 287: getfield com/finalshell/core/DY3.fB Lcom/finalshell/core/Y4;
      // 28a: invokevirtual com/finalshell/core/Y4.D ()I
      // 28d: istore 22
      // 28f: bipush 0
      // 290: istore 23
      // 292: bipush 0
      // 293: istore 24
      // 295: iload 20
      // 297: istore 25
      // 299: iload 21
      // 29b: istore 26
      // 29d: aload 1
      // 29e: aload 13
      // 2a0: iload 25
      // 2a2: iload 26
      // 2a4: invokevirtual java/io/InputStream.read ([BII)I
      // 2a7: istore 23
      // 2a9: iload 23
      // 2ab: ifle 2c3
      // 2ae: iload 25
      // 2b0: iload 23
      // 2b2: iadd
      // 2b3: istore 25
      // 2b5: iload 26
      // 2b7: iload 23
      // 2b9: isub
      // 2ba: istore 26
      // 2bc: iload 24
      // 2be: iload 23
      // 2c0: iadd
      // 2c1: istore 24
      // 2c3: iload 26
      // 2c5: iload 5
      // 2c7: ifne 2e7
      // 2ca: ifle 2e0
      // 2cd: goto 2d4
      // 2d0: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d3: athrow
      // 2d4: iload 23
      // 2d6: ifgt 29d
      // 2d9: goto 2e0
      // 2dc: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2df: athrow
      // 2e0: iload 24
      // 2e2: iload 5
      // 2e4: ifne 2c1
      // 2e7: iload 5
      // 2e9: ifne 30b
      // 2ec: ifgt 302
      // 2ef: goto 2f6
      // 2f2: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f5: athrow
      // 2f6: iload 5
      // 2f8: ifeq 56a
      // 2fb: goto 302
      // 2fe: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 301: athrow
      // 302: iload 24
      // 304: goto 30b
      // 307: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30a: athrow
      // 30b: istore 27
      // 30d: iload 27
      // 30f: ifle 52e
      // 312: aload 0
      // 313: getfield com/finalshell/core/DY3.f I
      // 316: bipush 1
      // 317: isub
      // 318: iload 18
      // 31a: iload 5
      // 31c: ifne 570
      // 31f: iload 5
      // 321: ifne 36a
      // 324: goto 32b
      // 327: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32a: athrow
      // 32b: if_icmpeq 357
      // 32e: goto 335
      // 331: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 334: athrow
      // 335: aload 0
      // 336: getfield com/finalshell/core/DY3.f I
      // 339: iload 18
      // 33b: isub
      // 33c: iload 19
      // 33e: isub
      // 33f: iload 5
      // 341: ifne 4bf
      // 344: goto 34b
      // 347: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34a: athrow
      // 34b: iload 22
      // 34d: if_icmplt 4bd
      // 350: goto 357
      // 353: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 356: athrow
      // 357: aload 0
      // 358: getfield com/finalshell/core/DY3.f I
      // 35b: iload 18
      // 35d: isub
      // 35e: iload 19
      // 360: isub
      // 361: iload 22
      // 363: goto 36a
      // 366: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 369: athrow
      // 36a: if_icmplt 4bd
      // 36d: aload 0
      // 36e: aload 0
      // 36f: getfield com/finalshell/core/DY3.g [I
      // 372: aload 9
      // 374: invokespecial com/finalshell/core/DY3.c ([ILcom/finalshell/core/S_2_2;)Z
      // 377: iload 5
      // 379: ifne 4bf
      // 37c: goto 383
      // 37f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 382: athrow
      // 383: iload 5
      // 385: ifne 4bf
      // 388: goto 38f
      // 38b: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38e: athrow
      // 38f: ifeq 4bd
      // 392: goto 399
      // 395: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 398: athrow
      // 399: aload 0
      // 39a: getfield com/finalshell/core/DY3.g [I
      // 39d: bipush 0
      // 39e: iaload
      // 39f: istore 28
      // 3a1: iload 18
      // 3a3: iload 28
      // 3a5: iload 5
      // 3a7: ifne 3eb
      // 3aa: if_icmpgt 3d2
      // 3ad: goto 3b4
      // 3b0: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b3: athrow
      // 3b4: iload 28
      // 3b6: aload 0
      // 3b7: getfield com/finalshell/core/DY3.f I
      // 3ba: bipush 1
      // 3bb: isub
      // 3bc: iload 5
      // 3be: ifne 3eb
      // 3c1: goto 3c8
      // 3c4: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c7: athrow
      // 3c8: if_icmple 4b5
      // 3cb: goto 3d2
      // 3ce: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d1: athrow
      // 3d2: iload 28
      // 3d4: iload 5
      // 3d6: ifne 40e
      // 3d9: goto 3e0
      // 3dc: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3df: athrow
      // 3e0: aload 0
      // 3e1: getfield com/finalshell/core/DY3.f I
      // 3e4: goto 3eb
      // 3e7: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ea: athrow
      // 3eb: if_icmpne 469
      // 3ee: aload 0
      // 3ef: invokevirtual com/finalshell/core/DY3.T ()Lcom/finalshell/crypto/ConnectHost;
      // 3f2: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 3f5: bipush 3
      // 3f6: iload 5
      // 3f8: ifne 420
      // 3fb: goto 402
      // 3fe: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 401: athrow
      // 402: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 407: goto 40e
      // 40a: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40d: athrow
      // 40e: ifeq 4b5
      // 411: aload 0
      // 412: invokevirtual com/finalshell/core/DY3.T ()Lcom/finalshell/crypto/ConnectHost;
      // 415: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 418: bipush 3
      // 419: goto 420
      // 41c: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41f: athrow
      // 420: new java/lang/StringBuilder
      // 423: dup
      // 424: invokespecial java/lang/StringBuilder.<init> ()V
      // 427: sipush 10327
      // 42a: sipush 19704
      // 42d: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 430: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 433: iload 18
      // 435: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 438: sipush 10321
      // 43b: sipush -22363
      // 43e: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 441: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 444: aload 0
      // 445: getfield com/finalshell/core/DY3.f I
      // 448: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 44b: sipush 10352
      // 44e: sipush 23831
      // 451: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 454: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 457: iload 28
      // 459: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 45c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 45f: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 464: iload 5
      // 466: ifeq 4b5
      // 469: new com/finalshell/core/Dn2_2
      // 46c: dup
      // 46d: bipush 4
      // 46e: new java/lang/StringBuilder
      // 471: dup
      // 472: invokespecial java/lang/StringBuilder.<init> ()V
      // 475: sipush 10305
      // 478: sipush 28365
      // 47b: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 47e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 481: iload 18
      // 483: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 486: sipush 10357
      // 489: sipush 4546
      // 48c: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 48f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 492: aload 0
      // 493: getfield com/finalshell/core/DY3.f I
      // 496: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 499: sipush 10309
      // 49c: sipush 20922
      // 49f: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 4a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4a5: iload 28
      // 4a7: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 4aa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4ad: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 4b0: athrow
      // 4b1: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b4: athrow
      // 4b5: iinc 19 1
      // 4b8: iload 5
      // 4ba: ifeq 357
      // 4bd: iload 14
      // 4bf: iload 5
      // 4c1: ifne 527
      // 4c4: ifeq 516
      // 4c7: goto 4ce
      // 4ca: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4cd: athrow
      // 4ce: iload 27
      // 4d0: aload 0
      // 4d1: aload 12
      // 4d3: lload 16
      // 4d5: aload 13
      // 4d7: bipush 0
      // 4d8: iload 27
      // 4da: invokespecial com/finalshell/core/DY3.c ([BJ[BII)I
      // 4dd: isub
      // 4de: istore 27
      // 4e0: aload 13
      // 4e2: iload 5
      // 4e4: ifne 508
      // 4e7: aload 0
      // 4e8: getfield com/finalshell/core/DY3.W Lcom/finalshell/core/UJ;
      // 4eb: getfield com/finalshell/core/UJ.g [B
      // 4ee: if_acmpeq 30d
      // 4f1: goto 4f8
      // 4f4: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f7: athrow
      // 4f8: aload 0
      // 4f9: getfield com/finalshell/core/DY3.W Lcom/finalshell/core/UJ;
      // 4fc: getfield com/finalshell/core/UJ.g [B
      // 4ff: astore 13
      // 501: aload 0
      // 502: getfield com/finalshell/core/DY3.W Lcom/finalshell/core/UJ;
      // 505: getfield com/finalshell/core/UJ.g [B
      // 508: arraylength
      // 509: iload 20
      // 50b: isub
      // 50c: iload 15
      // 50e: isub
      // 50f: istore 21
      // 511: iload 5
      // 513: ifeq 30d
      // 516: iload 27
      // 518: aload 0
      // 519: aload 12
      // 51b: lload 16
      // 51d: aload 13
      // 51f: iload 20
      // 521: iload 27
      // 523: invokespecial com/finalshell/core/DY3.c ([BJ[BII)I
      // 526: isub
      // 527: istore 27
      // 529: iload 5
      // 52b: ifeq 30d
      // 52e: lload 16
      // 530: iload 24
      // 532: i2l
      // 533: ladd
      // 534: lstore 16
      // 536: aload 3
      // 537: iload 5
      // 539: ifne 547
      // 53c: ifnull 55e
      // 53f: goto 546
      // 542: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 545: athrow
      // 546: aload 3
      // 547: iload 24
      // 549: i2l
      // 54a: invokeinterface com/finalshell/core/PO3.o (J)Z 3
      // 54f: ifne 55e
      // 552: iload 5
      // 554: ifeq 56a
      // 557: goto 55e
      // 55a: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55d: athrow
      // 55e: iload 5
      // 560: ifeq 28f
      // 563: goto 56a
      // 566: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 569: athrow
      // 56a: aload 0
      // 56b: getfield com/finalshell/core/DY3.f I
      // 56e: iload 18
      // 570: isub
      // 571: istore 23
      // 573: iload 23
      // 575: iload 19
      // 577: if_icmple 5ab
      // 57a: aload 0
      // 57b: aconst_null
      // 57c: aload 9
      // 57e: invokespecial com/finalshell/core/DY3.c ([ILcom/finalshell/core/S_2_2;)Z
      // 581: iload 5
      // 583: ifne 5c9
      // 586: ifne 59c
      // 589: goto 590
      // 58c: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58f: athrow
      // 590: iload 5
      // 592: ifeq 5ab
      // 595: goto 59c
      // 598: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59b: athrow
      // 59c: iinc 19 1
      // 59f: iload 5
      // 5a1: ifeq 573
      // 5a4: goto 5ab
      // 5a7: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5aa: athrow
      // 5ab: aload 3
      // 5ac: iload 5
      // 5ae: ifne 5bc
      // 5b1: ifnull 5c1
      // 5b4: goto 5bb
      // 5b7: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5ba: athrow
      // 5bb: aload 3
      // 5bc: invokeinterface com/finalshell/core/PO3.c ()V 1
      // 5c1: aload 0
      // 5c2: aload 12
      // 5c4: aload 9
      // 5c6: invokespecial com/finalshell/core/DY3.F ([BLcom/finalshell/core/S_2_2;)Z
      // 5c9: pop
      // 5ca: goto 600
      // 5cd: astore 6
      // 5cf: aload 6
      // 5d1: iload 5
      // 5d3: ifne 5ec
      // 5d6: instanceof com/finalshell/core/Dn2_2
      // 5d9: ifeq 5f0
      // 5dc: goto 5e3
      // 5df: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e2: athrow
      // 5e3: aload 6
      // 5e5: goto 5ec
      // 5e8: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5eb: athrow
      // 5ec: checkcast com/finalshell/core/Dn2_2
      // 5ef: athrow
      // 5f0: new com/finalshell/core/Dn2_2
      // 5f3: dup
      // 5f4: bipush 4
      // 5f5: aload 6
      // 5f7: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 5fa: aload 6
      // 5fc: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 5ff: athrow
      // 600: return
   }

   public OutputStream Q(String var1) throws Dn2_2 {
      return this.Z(var1, (PO3)null, 0);
   }

   public OutputStream W(String var1, int var2) throws Dn2_2 {
      return this.Z(var1, (PO3)null, var2);
   }

   public OutputStream Z(String var1, PO3 var2, int var3) throws Dn2_2 {
      return this.U(var1, var2, var3, 0L);
   }

   public OutputStream U(String param1, PO3 param2, int param3, long param4) throws Dn2_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: istore 6
      // 005: aload 0
      // 006: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 009: checkcast com/finalshell/io/Gu2
      // 00c: invokevirtual com/finalshell/io/Gu2.w ()V
      // 00f: aload 0
      // 010: aload 1
      // 011: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 014: astore 1
      // 015: aload 0
      // 016: aload 1
      // 017: invokespecial com/finalshell/core/DY3.P (Ljava/lang/String;)Ljava/lang/String;
      // 01a: iload 6
      // 01c: ifeq 050
      // 01f: astore 1
      // 020: aload 0
      // 021: aload 1
      // 022: invokespecial com/finalshell/core/DY3.m$boolean (Ljava/lang/String;)Z
      // 025: ifeq 04f
      // 028: new com/finalshell/core/Dn2_2
      // 02b: dup
      // 02c: bipush 4
      // 02d: new java/lang/StringBuilder
      // 030: dup
      // 031: invokespecial java/lang/StringBuilder.<init> ()V
      // 034: aload 1
      // 035: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 038: sipush 10304
      // 03b: sipush -30107
      // 03e: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 041: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 044: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 047: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 04a: athrow
      // 04b: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: aload 1
      // 050: aload 0
      // 051: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 054: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 057: astore 7
      // 059: lconst_0
      // 05a: lstore 8
      // 05c: iload 3
      // 05d: bipush 1
      // 05e: iload 6
      // 060: ifeq 076
      // 063: if_icmpeq 079
      // 066: goto 06d
      // 069: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06c: athrow
      // 06d: iload 3
      // 06e: bipush 2
      // 06f: goto 076
      // 072: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 075: athrow
      // 076: if_icmpne 08d
      // 079: aload 0
      // 07a: aload 7
      // 07c: invokespecial com/finalshell/core/DY3.Y ([B)Lcom/finalshell/core/C_p_2;
      // 07f: astore 10
      // 081: aload 10
      // 083: invokevirtual com/finalshell/core/C_p_2.v ()J
      // 086: lstore 8
      // 088: goto 08d
      // 08b: astore 10
      // 08d: aload 2
      // 08e: iload 6
      // 090: ifeq 09e
      // 093: ifnull 0b1
      // 096: goto 09d
      // 099: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: aload 2
      // 09e: bipush 0
      // 09f: ldc_w "-"
      // 0a2: aload 1
      // 0a3: sipush 7749
      // 0a6: ldc2_w 7474160006877296208
      // 0a9: invokestatic com/finalshell/core/DY3.d (IJ)J
      // 0ac: invokeinterface com/finalshell/core/PO3.b (ILjava/lang/String;Ljava/lang/String;J)V 6
      // 0b1: iload 3
      // 0b2: ifne 0c7
      // 0b5: aload 0
      // 0b6: aload 7
      // 0b8: invokespecial com/finalshell/core/DY3.u ([B)V
      // 0bb: iload 6
      // 0bd: ifne 0d4
      // 0c0: goto 0c7
      // 0c3: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: aload 7
      // 0ca: invokespecial com/finalshell/core/DY3.y ([B)V
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d3: athrow
      // 0d4: new com/finalshell/core/S_2_2
      // 0d7: dup
      // 0d8: invokespecial com/finalshell/core/S_2_2.<init> ()V
      // 0db: astore 10
      // 0dd: aload 0
      // 0de: aload 0
      // 0df: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0e2: aload 10
      // 0e4: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 0e7: astore 10
      // 0e9: aload 10
      // 0eb: getfield com/finalshell/core/S_2_2.W I
      // 0ee: istore 11
      // 0f0: aload 10
      // 0f2: getfield com/finalshell/core/S_2_2.T I
      // 0f5: istore 12
      // 0f7: aload 0
      // 0f8: aload 0
      // 0f9: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0fc: iload 11
      // 0fe: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 101: iload 12
      // 103: sipush 20436
      // 106: ldc2_w 5788056615437413713
      // 109: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 10c: iload 6
      // 10e: ifeq 163
      // 111: if_icmpeq 14c
      // 114: goto 11b
      // 117: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11a: athrow
      // 11b: iload 12
      // 11d: sipush 12002
      // 120: ldc2_w 1941196815231405135
      // 123: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 126: iload 6
      // 128: ifeq 163
      // 12b: goto 132
      // 12e: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 131: athrow
      // 132: if_icmpeq 14c
      // 135: goto 13c
      // 138: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13b: athrow
      // 13c: new com/finalshell/core/Dn2_2
      // 13f: dup
      // 140: bipush 4
      // 141: ldc_w ""
      // 144: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 147: athrow
      // 148: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14b: athrow
      // 14c: iload 12
      // 14e: iload 6
      // 150: ifeq 174
      // 153: sipush 20436
      // 156: ldc2_w 5788056615437413713
      // 159: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 15c: goto 163
      // 15f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 162: athrow
      // 163: if_icmpne 180
      // 166: aload 0
      // 167: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 16a: invokevirtual com/finalshell/core/UJ.d ()I
      // 16d: goto 174
      // 170: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 173: athrow
      // 174: istore 13
      // 176: aload 0
      // 177: aload 0
      // 178: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 17b: iload 13
      // 17d: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // 180: aload 0
      // 181: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 184: invokevirtual com/finalshell/core/UJ.S ()[B
      // 187: astore 13
      // 189: iload 3
      // 18a: bipush 1
      // 18b: iload 6
      // 18d: ifeq 1af
      // 190: if_icmpeq 1b2
      // 193: goto 19a
      // 196: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 199: athrow
      // 19a: iload 3
      // 19b: iload 6
      // 19d: ifeq 1ba
      // 1a0: goto 1a7
      // 1a3: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a6: athrow
      // 1a7: bipush 2
      // 1a8: goto 1af
      // 1ab: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ae: athrow
      // 1af: if_icmpne 1b9
      // 1b2: lload 4
      // 1b4: lload 8
      // 1b6: ladd
      // 1b7: lstore 4
      // 1b9: bipush 1
      // 1ba: newarray 11
      // 1bc: astore 14
      // 1be: aload 14
      // 1c0: bipush 0
      // 1c1: lload 4
      // 1c3: lastore
      // 1c4: new com/finalshell/io/Lv2
      // 1c7: dup
      // 1c8: aload 0
      // 1c9: aload 13
      // 1cb: aload 14
      // 1cd: aload 2
      // 1ce: invokespecial com/finalshell/io/Lv2.<init> (Lcom/finalshell/core/DY3;[B[JLcom/finalshell/core/PO3;)V
      // 1d1: astore 15
      // 1d3: aload 15
      // 1d5: areturn
      // 1d6: astore 7
      // 1d8: aload 7
      // 1da: iload 6
      // 1dc: ifeq 1f5
      // 1df: instanceof com/finalshell/core/Dn2_2
      // 1e2: ifeq 1f9
      // 1e5: goto 1ec
      // 1e8: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1eb: athrow
      // 1ec: aload 7
      // 1ee: goto 1f5
      // 1f1: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f4: athrow
      // 1f5: checkcast com/finalshell/core/Dn2_2
      // 1f8: athrow
      // 1f9: new com/finalshell/core/Dn2_2
      // 1fc: dup
      // 1fd: bipush 4
      // 1fe: aload 7
      // 200: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 203: aload 7
      // 205: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 208: athrow
   }

   public void Y(String var1, String var2) throws Dn2_2 {
      this.K(var1, var2, null, 0);
   }

   public void Z(String var1, String var2, PO3 var3) throws Dn2_2 {
      this.K(var1, var2, var3, 0);
   }

   public void K(String param1, String param2, PO3 param3, int param4) throws Dn2_2 {
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
      // 004: istore 6
      // 006: istore 5
      // 008: aconst_null
      // 009: astore 7
      // 00b: aload 0
      // 00c: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 00f: checkcast com/finalshell/io/Gu2
      // 012: invokevirtual com/finalshell/io/Gu2.w ()V
      // 015: aload 0
      // 016: aload 1
      // 017: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 01a: astore 1
      // 01b: aload 0
      // 01c: aload 2
      // 01d: invokespecial com/finalshell/core/DY3.U (Ljava/lang/String;)Ljava/lang/String;
      // 020: astore 2
      // 021: aload 0
      // 022: aload 1
      // 023: invokespecial com/finalshell/core/DY3.k$Vector (Ljava/lang/String;)Ljava/util/Vector;
      // 026: astore 8
      // 028: aload 8
      // 02a: invokevirtual java/util/Vector.size ()I
      // 02d: istore 9
      // 02f: iload 9
      // 031: ifne 04a
      // 034: new com/finalshell/core/Dn2_2
      // 037: dup
      // 038: bipush 2
      // 039: sipush 10316
      // 03c: sipush 6369
      // 03f: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 042: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 045: athrow
      // 046: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 049: athrow
      // 04a: new java/io/File
      // 04d: dup
      // 04e: aload 2
      // 04f: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 052: astore 10
      // 054: aload 10
      // 056: invokevirtual java/io/File.isDirectory ()Z
      // 059: istore 11
      // 05b: aconst_null
      // 05c: astore 12
      // 05e: iload 11
      // 060: iload 5
      // 062: ifeq 0b7
      // 065: ifeq 0b5
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: aload 2
      // 070: iload 5
      // 072: ifeq 0a7
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07b: athrow
      // 07c: getstatic com/finalshell/core/DY3.fy Ljava/lang/String;
      // 07f: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 082: ifne 0a8
      // 085: goto 08c
      // 088: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08b: athrow
      // 08c: new java/lang/StringBuilder
      // 08f: dup
      // 090: invokespecial java/lang/StringBuilder.<init> ()V
      // 093: aload 2
      // 094: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 097: getstatic com/finalshell/core/DY3.fy Ljava/lang/String;
      // 09a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: astore 2
      // 0a8: new java/lang/StringBuilder
      // 0ab: dup
      // 0ac: aload 2
      // 0ad: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 0b0: astore 12
      // 0b2: goto 0d1
      // 0b5: iload 9
      // 0b7: bipush 1
      // 0b8: if_icmple 0d1
      // 0bb: new com/finalshell/core/Dn2_2
      // 0be: dup
      // 0bf: bipush 4
      // 0c0: sipush 10356
      // 0c3: sipush -13752
      // 0c6: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 0c9: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 0cc: athrow
      // 0cd: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: bipush 0
      // 0d2: istore 13
      // 0d4: iload 13
      // 0d6: iload 9
      // 0d8: if_icmpge 384
      // 0db: aload 8
      // 0dd: iload 13
      // 0df: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 0e2: checkcast java/lang/String
      // 0e5: astore 14
      // 0e7: aload 0
      // 0e8: aload 14
      // 0ea: invokespecial com/finalshell/core/DY3.n (Ljava/lang/String;)Lcom/finalshell/core/C_p_2;
      // 0ed: astore 15
      // 0ef: iload 5
      // 0f1: ifeq 419
      // 0f4: aload 15
      // 0f6: invokevirtual com/finalshell/core/C_p_2.e$boolean ()Z
      // 0f9: ifeq 12b
      // 0fc: goto 103
      // 0ff: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 102: athrow
      // 103: new com/finalshell/core/Dn2_2
      // 106: dup
      // 107: bipush 4
      // 108: new java/lang/StringBuilder
      // 10b: dup
      // 10c: invokespecial java/lang/StringBuilder.<init> ()V
      // 10f: sipush 10360
      // 112: sipush -3494
      // 115: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 118: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11b: aload 14
      // 11d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 120: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 123: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 126: athrow
      // 127: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12a: athrow
      // 12b: aconst_null
      // 12c: astore 7
      // 12e: iload 11
      // 130: iload 5
      // 132: ifeq 154
      // 135: ifeq 254
      // 138: goto 13f
      // 13b: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13e: athrow
      // 13f: aload 14
      // 141: sipush 26778
      // 144: ldc2_w 8051104864195250722
      // 147: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 14a: invokevirtual java/lang/String.lastIndexOf (I)I
      // 14d: goto 154
      // 150: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 153: athrow
      // 154: istore 16
      // 156: iload 5
      // 158: ifeq 177
      // 15b: iload 16
      // 15d: bipush -1
      // 15e: if_icmpne 17c
      // 161: goto 168
      // 164: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 167: athrow
      // 168: aload 12
      // 16a: aload 14
      // 16c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16f: pop
      // 170: goto 177
      // 173: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 176: athrow
      // 177: iload 5
      // 179: ifne 192
      // 17c: aload 12
      // 17e: aload 14
      // 180: iload 16
      // 182: bipush 1
      // 183: iadd
      // 184: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 187: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18a: pop
      // 18b: goto 192
      // 18e: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 191: athrow
      // 192: aload 12
      // 194: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 197: astore 7
      // 199: iload 5
      // 19b: ifeq 251
      // 19e: aload 7
      // 1a0: sipush 10353
      // 1a3: sipush 18922
      // 1a6: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 1a9: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 1ac: bipush -1
      // 1ad: if_icmpeq 242
      // 1b0: goto 1b7
      // 1b3: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b6: athrow
      // 1b7: new java/io/File
      // 1ba: dup
      // 1bb: aload 2
      // 1bc: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 1bf: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 1c2: astore 17
      // 1c4: new java/io/File
      // 1c7: dup
      // 1c8: aload 7
      // 1ca: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 1cd: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 1d0: astore 18
      // 1d2: aload 18
      // 1d4: invokevirtual java/lang/String.length ()I
      // 1d7: iload 5
      // 1d9: ifeq 217
      // 1dc: aload 17
      // 1de: invokevirtual java/lang/String.length ()I
      // 1e1: if_icmple 21a
      // 1e4: goto 1eb
      // 1e7: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ea: athrow
      // 1eb: aload 18
      // 1ed: bipush 0
      // 1ee: aload 17
      // 1f0: invokevirtual java/lang/String.length ()I
      // 1f3: bipush 1
      // 1f4: iadd
      // 1f5: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1f8: new java/lang/StringBuilder
      // 1fb: dup
      // 1fc: invokespecial java/lang/StringBuilder.<init> ()V
      // 1ff: aload 17
      // 201: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 204: getstatic com/finalshell/core/DY3.fy Ljava/lang/String;
      // 207: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 20d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 210: goto 217
      // 213: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 216: athrow
      // 217: ifne 242
      // 21a: new com/finalshell/core/Dn2_2
      // 21d: dup
      // 21e: bipush 4
      // 21f: new java/lang/StringBuilder
      // 222: dup
      // 223: invokespecial java/lang/StringBuilder.<init> ()V
      // 226: sipush 10328
      // 229: sipush 18837
      // 22c: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 22f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 232: aload 14
      // 234: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 237: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 23a: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 23d: athrow
      // 23e: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 241: athrow
      // 242: aload 12
      // 244: aload 2
      // 245: invokevirtual java/lang/String.length ()I
      // 248: aload 7
      // 24a: invokevirtual java/lang/String.length ()I
      // 24d: invokevirtual java/lang/StringBuilder.delete (II)Ljava/lang/StringBuilder;
      // 250: pop
      // 251: goto 257
      // 254: aload 2
      // 255: astore 7
      // 257: new java/io/File
      // 25a: dup
      // 25b: aload 7
      // 25d: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 260: astore 16
      // 262: iload 4
      // 264: bipush 1
      // 265: if_icmpne 2bb
      // 268: aload 15
      // 26a: invokevirtual com/finalshell/core/C_p_2.v ()J
      // 26d: lstore 17
      // 26f: aload 16
      // 271: invokevirtual java/io/File.length ()J
      // 274: lstore 19
      // 276: lload 19
      // 278: lload 17
      // 27a: lcmp
      // 27b: iload 5
      // 27d: ifeq 2b7
      // 280: ifle 2b2
      // 283: goto 28a
      // 286: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 289: athrow
      // 28a: new com/finalshell/core/Dn2_2
      // 28d: dup
      // 28e: bipush 4
      // 28f: new java/lang/StringBuilder
      // 292: dup
      // 293: invokespecial java/lang/StringBuilder.<init> ()V
      // 296: sipush 10331
      // 299: sipush 13651
      // 29c: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 29f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a2: aload 7
      // 2a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2aa: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 2ad: athrow
      // 2ae: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b1: athrow
      // 2b2: lload 19
      // 2b4: lload 17
      // 2b6: lcmp
      // 2b7: ifne 2bb
      // 2ba: return
      // 2bb: aload 3
      // 2bc: iload 5
      // 2be: ifeq 2cc
      // 2c1: ifnull 300
      // 2c4: goto 2cb
      // 2c7: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ca: athrow
      // 2cb: aload 3
      // 2cc: bipush 1
      // 2cd: aload 14
      // 2cf: aload 7
      // 2d1: aload 15
      // 2d3: invokevirtual com/finalshell/core/C_p_2.v ()J
      // 2d6: invokeinterface com/finalshell/core/PO3.b (ILjava/lang/String;Ljava/lang/String;J)V 6
      // 2db: iload 4
      // 2dd: iload 5
      // 2df: ifeq 309
      // 2e2: bipush 1
      // 2e3: if_icmpne 300
      // 2e6: goto 2ed
      // 2e9: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ec: athrow
      // 2ed: aload 3
      // 2ee: aload 16
      // 2f0: invokevirtual java/io/File.length ()J
      // 2f3: invokeinterface com/finalshell/core/PO3.o (J)Z 3
      // 2f8: pop
      // 2f9: goto 300
      // 2fc: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ff: athrow
      // 300: aload 16
      // 302: invokevirtual java/io/File.exists ()Z
      // 305: istore 6
      // 307: iload 4
      // 309: ifne 31c
      // 30c: new java/io/FileOutputStream
      // 30f: dup
      // 310: aload 7
      // 312: invokespecial java/io/FileOutputStream.<init> (Ljava/lang/String;)V
      // 315: goto 326
      // 318: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31b: athrow
      // 31c: new java/io/FileOutputStream
      // 31f: dup
      // 320: aload 7
      // 322: bipush 1
      // 323: invokespecial java/io/FileOutputStream.<init> (Ljava/lang/String;Z)V
      // 326: astore 17
      // 328: aload 0
      // 329: aload 14
      // 32b: aload 17
      // 32d: aload 3
      // 32e: iload 4
      // 330: new java/io/File
      // 333: dup
      // 334: aload 7
      // 336: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 339: invokevirtual java/io/File.length ()J
      // 33c: invokespecial com/finalshell/core/DY3.U (Ljava/lang/String;Ljava/io/OutputStream;Lcom/finalshell/core/PO3;IJ)V
      // 33f: iload 5
      // 341: ifeq 37f
      // 344: aload 17
      // 346: ifnull 37c
      // 349: aload 17
      // 34b: invokevirtual java/io/OutputStream.close ()V
      // 34e: goto 37c
      // 351: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 354: athrow
      // 355: astore 18
      // 357: aload 17
      // 359: iload 5
      // 35b: ifeq 36a
      // 35e: ifnull 379
      // 361: goto 368
      // 364: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 367: athrow
      // 368: aload 17
      // 36a: invokevirtual java/io/OutputStream.close ()V
      // 36d: goto 379
      // 370: astore 19
      // 372: aload 18
      // 374: aload 19
      // 376: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 379: aload 18
      // 37b: athrow
      // 37c: iinc 13 1
      // 37f: iload 5
      // 381: ifne 0d4
      // 384: goto 419
      // 387: astore 8
      // 389: iload 6
      // 38b: iload 5
      // 38d: ifeq 400
      // 390: ifne 3ef
      // 393: goto 39a
      // 396: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 399: athrow
      // 39a: aload 7
      // 39c: ifnull 3ef
      // 39f: goto 3a6
      // 3a2: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a5: athrow
      // 3a6: new java/io/File
      // 3a9: dup
      // 3aa: aload 7
      // 3ac: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 3af: astore 9
      // 3b1: aload 9
      // 3b3: invokevirtual java/io/File.exists ()Z
      // 3b6: iload 5
      // 3b8: ifeq 400
      // 3bb: ifeq 3ef
      // 3be: goto 3c5
      // 3c1: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c4: athrow
      // 3c5: aload 9
      // 3c7: invokevirtual java/io/File.length ()J
      // 3ca: lconst_0
      // 3cb: lcmp
      // 3cc: iload 5
      // 3ce: ifeq 400
      // 3d1: goto 3d8
      // 3d4: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d7: athrow
      // 3d8: ifne 3ef
      // 3db: goto 3e2
      // 3de: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e1: athrow
      // 3e2: aload 9
      // 3e4: invokevirtual java/io/File.delete ()Z
      // 3e7: pop
      // 3e8: goto 3ef
      // 3eb: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ee: athrow
      // 3ef: aload 8
      // 3f1: iload 5
      // 3f3: ifeq 405
      // 3f6: instanceof com/finalshell/core/Dn2_2
      // 3f9: goto 400
      // 3fc: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ff: athrow
      // 400: ifeq 409
      // 403: aload 8
      // 405: checkcast com/finalshell/core/Dn2_2
      // 408: athrow
      // 409: new com/finalshell/core/Dn2_2
      // 40c: dup
      // 40d: bipush 4
      // 40e: aload 8
      // 410: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 413: aload 8
      // 415: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 418: athrow
      // 419: return
   }

   public void L(String var1, OutputStream var2) throws Dn2_2 {
      this.m(var1, var2, null, 0, 0L);
   }

   public void c(String var1, OutputStream var2, PO3 var3) throws Dn2_2 {
      this.m(var1, var2, var3, 0, 0L);
   }

   public void m(String param1, OutputStream param2, PO3 param3, int param4, long param5) throws Dn2_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: istore 7
      // 05: aload 0
      // 06: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 09: checkcast com/finalshell/io/Gu2
      // 0c: invokevirtual com/finalshell/io/Gu2.w ()V
      // 0f: aload 0
      // 10: aload 1
      // 11: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 14: astore 1
      // 15: aload 0
      // 16: aload 1
      // 17: invokespecial com/finalshell/core/DY3.P (Ljava/lang/String;)Ljava/lang/String;
      // 1a: astore 1
      // 1b: iload 7
      // 1d: ifne 75
      // 20: aload 3
      // 21: ifnull 6a
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 0
      // 2c: aload 1
      // 2d: invokespecial com/finalshell/core/DY3.n (Ljava/lang/String;)Lcom/finalshell/core/C_p_2;
      // 30: astore 8
      // 32: aload 3
      // 33: bipush 1
      // 34: aload 1
      // 35: sipush 10320
      // 38: sipush -9957
      // 3b: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 3e: aload 8
      // 40: invokevirtual com/finalshell/core/C_p_2.v ()J
      // 43: invokeinterface com/finalshell/core/PO3.b (ILjava/lang/String;Ljava/lang/String;J)V 6
      // 48: iload 7
      // 4a: ifne 75
      // 4d: iload 4
      // 4f: bipush 1
      // 50: if_icmpne 6a
      // 53: goto 5a
      // 56: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: aload 3
      // 5b: lload 5
      // 5d: invokeinterface com/finalshell/core/PO3.o (J)Z 3
      // 62: pop
      // 63: goto 6a
      // 66: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: aload 0
      // 6b: aload 1
      // 6c: aload 2
      // 6d: aload 3
      // 6e: iload 4
      // 70: lload 5
      // 72: invokespecial com/finalshell/core/DY3.U (Ljava/lang/String;Ljava/io/OutputStream;Lcom/finalshell/core/PO3;IJ)V
      // 75: goto ab
      // 78: astore 8
      // 7a: aload 8
      // 7c: iload 7
      // 7e: ifne 97
      // 81: instanceof com/finalshell/core/Dn2_2
      // 84: ifeq 9b
      // 87: goto 8e
      // 8a: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8d: athrow
      // 8e: aload 8
      // 90: goto 97
      // 93: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 96: athrow
      // 97: checkcast com/finalshell/core/Dn2_2
      // 9a: athrow
      // 9b: new com/finalshell/core/Dn2_2
      // 9e: dup
      // 9f: bipush 4
      // a0: aload 8
      // a2: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // a5: aload 8
      // a7: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // aa: athrow
      // ab: return
   }

   public void U(String param1, OutputStream param2, PO3 param3, int param4, long param5) throws Dn2_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: aload 1
      // 004: aload 0
      // 005: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 008: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 00b: astore 8
      // 00d: istore 7
      // 00f: aload 0
      // 010: aload 8
      // 012: invokespecial com/finalshell/core/DY3.k ([B)V
      // 015: new com/finalshell/core/S_2_2
      // 018: dup
      // 019: invokespecial com/finalshell/core/S_2_2.<init> ()V
      // 01c: astore 9
      // 01e: aload 0
      // 01f: aload 0
      // 020: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 023: aload 9
      // 025: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 028: astore 9
      // 02a: aload 9
      // 02c: getfield com/finalshell/core/S_2_2.W I
      // 02f: istore 10
      // 031: aload 9
      // 033: getfield com/finalshell/core/S_2_2.T I
      // 036: istore 11
      // 038: aload 0
      // 039: aload 0
      // 03a: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 03d: iload 10
      // 03f: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 042: iload 11
      // 044: sipush 20436
      // 047: ldc2_w 5788056615437413713
      // 04a: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 04d: iload 7
      // 04f: ifeq 0a4
      // 052: if_icmpeq 08d
      // 055: goto 05c
      // 058: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05b: athrow
      // 05c: iload 11
      // 05e: sipush 12002
      // 061: ldc2_w 1941196815231405135
      // 064: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 067: iload 7
      // 069: ifeq 0a4
      // 06c: goto 073
      // 06f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: if_icmpeq 08d
      // 076: goto 07d
      // 079: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07c: athrow
      // 07d: new com/finalshell/core/Dn2_2
      // 080: dup
      // 081: bipush 4
      // 082: ldc_w ""
      // 085: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 088: athrow
      // 089: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c: athrow
      // 08d: iload 11
      // 08f: iload 7
      // 091: ifeq 0b5
      // 094: sipush 20436
      // 097: ldc2_w 5788056615437413713
      // 09a: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 09d: goto 0a4
      // 0a0: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a3: athrow
      // 0a4: if_icmpne 0c1
      // 0a7: aload 0
      // 0a8: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0ab: invokevirtual com/finalshell/core/UJ.d ()I
      // 0ae: goto 0b5
      // 0b1: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b4: athrow
      // 0b5: istore 12
      // 0b7: aload 0
      // 0b8: aload 0
      // 0b9: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0bc: iload 12
      // 0be: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // 0c1: aload 0
      // 0c2: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0c5: invokevirtual com/finalshell/core/UJ.S ()[B
      // 0c8: astore 12
      // 0ca: lconst_0
      // 0cb: lstore 13
      // 0cd: iload 4
      // 0cf: iload 7
      // 0d1: ifeq 0e7
      // 0d4: bipush 1
      // 0d5: if_icmpne 0e6
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0de: athrow
      // 0df: lload 13
      // 0e1: lload 5
      // 0e3: ladd
      // 0e4: lstore 13
      // 0e6: bipush 1
      // 0e7: istore 15
      // 0e9: aload 0
      // 0ea: getfield com/finalshell/core/DY3.fB Lcom/finalshell/core/Y4;
      // 0ed: invokevirtual com/finalshell/core/Y4.w ()V
      // 0f0: lload 13
      // 0f2: lstore 16
      // 0f4: aload 0
      // 0f5: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0f8: getfield com/finalshell/core/UJ.g [B
      // 0fb: arraylength
      // 0fc: sipush 31176
      // 0ff: ldc2_w 7275538956556606279
      // 102: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 105: isub
      // 106: istore 18
      // 108: aload 0
      // 109: getfield com/finalshell/core/DY3.fp I
      // 10c: iload 7
      // 10e: ifeq 12d
      // 111: ifne 126
      // 114: goto 11b
      // 117: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11a: athrow
      // 11b: sipush 14901
      // 11e: ldc2_w 4137220279947090103
      // 121: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 124: istore 18
      // 126: aload 0
      // 127: getfield com/finalshell/core/DY3.fB Lcom/finalshell/core/Y4;
      // 12a: invokevirtual com/finalshell/core/Y4.J ()I
      // 12d: iload 15
      // 12f: if_icmpge 159
      // 132: aload 0
      // 133: aload 12
      // 135: lload 16
      // 137: iload 18
      // 139: aload 0
      // 13a: getfield com/finalshell/core/DY3.fB Lcom/finalshell/core/Y4;
      // 13d: invokespecial com/finalshell/core/DY3.b ([BJILcom/finalshell/core/Y4;)V
      // 140: lload 16
      // 142: iload 18
      // 144: i2l
      // 145: ladd
      // 146: lstore 16
      // 148: iload 7
      // 14a: ifeq 173
      // 14d: iload 7
      // 14f: ifne 126
      // 152: goto 159
      // 155: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 158: athrow
      // 159: aload 0
      // 15a: aload 0
      // 15b: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 15e: aload 9
      // 160: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 163: astore 9
      // 165: aload 9
      // 167: getfield com/finalshell/core/S_2_2.W I
      // 16a: istore 10
      // 16c: aload 9
      // 16e: getfield com/finalshell/core/S_2_2.T I
      // 171: istore 11
      // 173: aconst_null
      // 174: astore 19
      // 176: aload 0
      // 177: getfield com/finalshell/core/DY3.fB Lcom/finalshell/core/Y4;
      // 17a: aload 9
      // 17c: getfield com/finalshell/core/S_2_2.w I
      // 17f: invokevirtual com/finalshell/core/Y4.y (I)Lcom/finalshell/core/O3;
      // 182: astore 19
      // 184: goto 1ac
      // 187: astore 20
      // 189: aload 20
      // 18b: getfield com/finalshell/core/OU3.Y J
      // 18e: lstore 16
      // 190: aload 0
      // 191: aload 9
      // 193: getfield com/finalshell/core/S_2_2.W I
      // 196: i2l
      // 197: invokespecial com/finalshell/core/DY3.s (J)V
      // 19a: aload 0
      // 19b: getfield com/finalshell/core/DY3.fB Lcom/finalshell/core/Y4;
      // 19e: aload 9
      // 1a0: aload 0
      // 1a1: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 1a4: invokevirtual com/finalshell/core/Y4.W (Lcom/finalshell/core/S_2_2;Lcom/finalshell/core/UJ;)V
      // 1a7: iload 7
      // 1a9: ifne 126
      // 1ac: iload 11
      // 1ae: sipush 20436
      // 1b1: ldc2_w 5788056615437413713
      // 1b4: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 1b7: iload 7
      // 1b9: ifeq 213
      // 1bc: if_icmpne 1fc
      // 1bf: goto 1c6
      // 1c2: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c5: athrow
      // 1c6: aload 0
      // 1c7: aload 0
      // 1c8: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 1cb: iload 10
      // 1cd: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 1d0: aload 0
      // 1d1: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 1d4: invokevirtual com/finalshell/core/UJ.d ()I
      // 1d7: istore 20
      // 1d9: iload 20
      // 1db: bipush 1
      // 1dc: if_icmpne 1eb
      // 1df: iload 7
      // 1e1: ifne 3c2
      // 1e4: goto 1eb
      // 1e7: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ea: athrow
      // 1eb: aload 0
      // 1ec: aload 0
      // 1ed: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 1f0: iload 20
      // 1f2: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // 1f5: goto 1fc
      // 1f8: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fb: athrow
      // 1fc: iload 11
      // 1fe: iload 7
      // 200: ifeq 248
      // 203: sipush 11720
      // 206: ldc2_w 1225705409704677219
      // 209: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 20c: goto 213
      // 20f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 212: athrow
      // 213: if_icmpeq 222
      // 216: iload 7
      // 218: ifne 3c2
      // 21b: goto 222
      // 21e: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 221: athrow
      // 222: aload 0
      // 223: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 226: invokevirtual com/finalshell/core/UJ.a ()V
      // 229: aload 0
      // 22a: aload 0
      // 22b: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 22e: getfield com/finalshell/core/UJ.g [B
      // 231: bipush 0
      // 232: bipush 4
      // 233: invokespecial com/finalshell/core/DY3.x ([BII)I
      // 236: pop
      // 237: iinc 10 -4
      // 23a: aload 0
      // 23b: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 23e: invokevirtual com/finalshell/core/UJ.d ()I
      // 241: goto 248
      // 244: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 247: athrow
      // 248: istore 20
      // 24a: iload 10
      // 24c: iload 20
      // 24e: isub
      // 24f: istore 21
      // 251: iload 20
      // 253: istore 22
      // 255: iload 22
      // 257: ifle 340
      // 25a: iload 22
      // 25c: istore 23
      // 25e: iload 23
      // 260: iload 7
      // 262: ifeq 29e
      // 265: aload 0
      // 266: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 269: getfield com/finalshell/core/UJ.g [B
      // 26c: arraylength
      // 26d: iload 7
      // 26f: ifeq 3b7
      // 272: goto 279
      // 275: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 278: athrow
      // 279: if_icmple 28d
      // 27c: goto 283
      // 27f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 282: athrow
      // 283: aload 0
      // 284: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 287: getfield com/finalshell/core/UJ.g [B
      // 28a: arraylength
      // 28b: istore 23
      // 28d: aload 0
      // 28e: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 291: aload 0
      // 292: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 295: getfield com/finalshell/core/UJ.g [B
      // 298: bipush 0
      // 299: iload 23
      // 29b: invokevirtual java/io/InputStream.read ([BII)I
      // 29e: istore 24
      // 2a0: iload 24
      // 2a2: iload 7
      // 2a4: ifeq 2d8
      // 2a7: ifge 2bd
      // 2aa: goto 2b1
      // 2ad: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b0: athrow
      // 2b1: iload 7
      // 2b3: ifne 3c2
      // 2b6: goto 2bd
      // 2b9: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2bc: athrow
      // 2bd: aload 2
      // 2be: aload 0
      // 2bf: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 2c2: getfield com/finalshell/core/UJ.g [B
      // 2c5: bipush 0
      // 2c6: iload 24
      // 2c8: invokevirtual java/io/OutputStream.write ([BII)V
      // 2cb: lload 13
      // 2cd: iload 24
      // 2cf: i2l
      // 2d0: ladd
      // 2d1: lstore 13
      // 2d3: iload 22
      // 2d5: iload 24
      // 2d7: isub
      // 2d8: istore 22
      // 2da: aload 3
      // 2db: iload 7
      // 2dd: ifeq 2eb
      // 2e0: ifnull 334
      // 2e3: goto 2ea
      // 2e6: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e9: athrow
      // 2ea: aload 3
      // 2eb: iload 24
      // 2ed: i2l
      // 2ee: invokeinterface com/finalshell/core/PO3.o (J)Z 3
      // 2f3: iload 7
      // 2f5: ifeq 31e
      // 2f8: ifne 334
      // 2fb: goto 302
      // 2fe: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 301: athrow
      // 302: aload 0
      // 303: iload 22
      // 305: i2l
      // 306: invokespecial com/finalshell/core/DY3.s (J)V
      // 309: iload 7
      // 30b: ifeq 3c6
      // 30e: goto 315
      // 311: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 314: athrow
      // 315: iload 21
      // 317: goto 31e
      // 31a: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31d: athrow
      // 31e: ifle 3c2
      // 321: aload 0
      // 322: iload 21
      // 324: i2l
      // 325: invokespecial com/finalshell/core/DY3.s (J)V
      // 328: iload 7
      // 32a: ifne 3c2
      // 32d: goto 334
      // 330: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 333: athrow
      // 334: iload 7
      // 336: ifne 255
      // 339: goto 340
      // 33c: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33f: athrow
      // 340: iload 21
      // 342: iload 7
      // 344: ifeq 368
      // 347: ifle 35f
      // 34a: goto 351
      // 34d: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 350: athrow
      // 351: aload 0
      // 352: iload 21
      // 354: i2l
      // 355: invokespecial com/finalshell/core/DY3.s (J)V
      // 358: goto 35f
      // 35b: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35e: athrow
      // 35f: iload 20
      // 361: i2l
      // 362: aload 19
      // 364: getfield com/finalshell/core/O3.C J
      // 367: lcmp
      // 368: iload 7
      // 36a: ifeq 3b0
      // 36d: ifge 3ae
      // 370: goto 377
      // 373: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 376: athrow
      // 377: aload 0
      // 378: getfield com/finalshell/core/DY3.fB Lcom/finalshell/core/Y4;
      // 37b: aload 9
      // 37d: aload 0
      // 37e: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 381: invokevirtual com/finalshell/core/Y4.W (Lcom/finalshell/core/S_2_2;Lcom/finalshell/core/UJ;)V
      // 384: aload 0
      // 385: aload 12
      // 387: aload 19
      // 389: getfield com/finalshell/core/O3.P J
      // 38c: iload 20
      // 38e: i2l
      // 38f: ladd
      // 390: aload 19
      // 392: getfield com/finalshell/core/O3.C J
      // 395: iload 20
      // 397: i2l
      // 398: lsub
      // 399: l2i
      // 39a: aload 0
      // 39b: getfield com/finalshell/core/DY3.fB Lcom/finalshell/core/Y4;
      // 39e: invokespecial com/finalshell/core/DY3.b ([BJILcom/finalshell/core/Y4;)V
      // 3a1: aload 19
      // 3a3: getfield com/finalshell/core/O3.P J
      // 3a6: aload 19
      // 3a8: getfield com/finalshell/core/O3.C J
      // 3ab: ladd
      // 3ac: lstore 16
      // 3ae: iload 15
      // 3b0: aload 0
      // 3b1: getfield com/finalshell/core/DY3.fB Lcom/finalshell/core/Y4;
      // 3b4: invokevirtual com/finalshell/core/Y4.D ()I
      // 3b7: if_icmpge 3bd
      // 3ba: iinc 15 1
      // 3bd: iload 7
      // 3bf: ifne 126
      // 3c2: aload 2
      // 3c3: invokevirtual java/io/OutputStream.flush ()V
      // 3c6: iload 7
      // 3c8: ifeq 3f9
      // 3cb: aload 3
      // 3cc: ifnull 3e3
      // 3cf: goto 3d6
      // 3d2: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d5: athrow
      // 3d6: aload 3
      // 3d7: invokeinterface com/finalshell/core/PO3.c ()V 1
      // 3dc: goto 3e3
      // 3df: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e2: athrow
      // 3e3: aload 0
      // 3e4: getfield com/finalshell/core/DY3.fB Lcom/finalshell/core/Y4;
      // 3e7: aload 9
      // 3e9: aload 0
      // 3ea: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 3ed: invokevirtual com/finalshell/core/Y4.W (Lcom/finalshell/core/S_2_2;Lcom/finalshell/core/UJ;)V
      // 3f0: aload 0
      // 3f1: aload 12
      // 3f3: aload 9
      // 3f5: invokespecial com/finalshell/core/DY3.F ([BLcom/finalshell/core/S_2_2;)Z
      // 3f8: pop
      // 3f9: goto 42f
      // 3fc: astore 9
      // 3fe: aload 9
      // 400: iload 7
      // 402: ifeq 41b
      // 405: instanceof com/finalshell/core/Dn2_2
      // 408: ifeq 41f
      // 40b: goto 412
      // 40e: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 411: athrow
      // 412: aload 9
      // 414: goto 41b
      // 417: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41a: athrow
      // 41b: checkcast com/finalshell/core/Dn2_2
      // 41e: athrow
      // 41f: new com/finalshell/core/Dn2_2
      // 422: dup
      // 423: bipush 4
      // 424: aload 9
      // 426: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 429: aload 9
      // 42b: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 42e: athrow
      // 42f: return
   }

   public InputStream e(String var1) throws Dn2_2 {
      return this.l(var1, null, 0L);
   }

   public InputStream w(String var1, PO3 var2) throws Dn2_2 {
      return this.l(var1, var2, 0L);
   }

   @Deprecated
   public InputStream S(String var1, int var2) throws Dn2_2 {
      return this.l(var1, null, 0L);
   }

   @Deprecated
   public InputStream f(String var1, PO3 var2, int var3) throws Dn2_2 {
      return this.l(var1, var2, 0L);
   }

   public InputStream l(String param1, PO3 param2, long param3) throws Dn2_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: istore 5
      // 005: aload 0
      // 006: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 009: checkcast com/finalshell/io/Gu2
      // 00c: invokevirtual com/finalshell/io/Gu2.w ()V
      // 00f: aload 0
      // 010: aload 1
      // 011: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 014: astore 1
      // 015: aload 0
      // 016: aload 1
      // 017: invokespecial com/finalshell/core/DY3.P (Ljava/lang/String;)Ljava/lang/String;
      // 01a: astore 1
      // 01b: aload 1
      // 01c: aload 0
      // 01d: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 020: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 023: astore 6
      // 025: aload 0
      // 026: aload 6
      // 028: invokespecial com/finalshell/core/DY3.Y ([B)Lcom/finalshell/core/C_p_2;
      // 02b: astore 7
      // 02d: iload 5
      // 02f: ifne 060
      // 032: aload 2
      // 033: ifnull 05a
      // 036: goto 03d
      // 039: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: aload 2
      // 03e: bipush 1
      // 03f: aload 1
      // 040: sipush 10334
      // 043: sipush -32698
      // 046: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 049: aload 7
      // 04b: invokevirtual com/finalshell/core/C_p_2.v ()J
      // 04e: invokeinterface com/finalshell/core/PO3.b (ILjava/lang/String;Ljava/lang/String;J)V 6
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 059: athrow
      // 05a: aload 0
      // 05b: aload 6
      // 05d: invokespecial com/finalshell/core/DY3.k ([B)V
      // 060: new com/finalshell/core/S_2_2
      // 063: dup
      // 064: invokespecial com/finalshell/core/S_2_2.<init> ()V
      // 067: astore 8
      // 069: aload 0
      // 06a: aload 0
      // 06b: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 06e: aload 8
      // 070: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 073: astore 8
      // 075: aload 8
      // 077: getfield com/finalshell/core/S_2_2.W I
      // 07a: istore 9
      // 07c: aload 8
      // 07e: getfield com/finalshell/core/S_2_2.T I
      // 081: istore 10
      // 083: aload 0
      // 084: aload 0
      // 085: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 088: iload 9
      // 08a: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 08d: iload 10
      // 08f: sipush 20436
      // 092: ldc2_w 5788056615437413713
      // 095: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 098: iload 5
      // 09a: ifne 0ed
      // 09d: if_icmpeq 0d6
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: iload 10
      // 0a9: bipush 0
      // 0aa: ldc2_w 6042050183331996320
      // 0ad: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 0b0: iload 5
      // 0b2: ifne 0ed
      // 0b5: goto 0bc
      // 0b8: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bb: athrow
      // 0bc: if_icmpeq 0d6
      // 0bf: goto 0c6
      // 0c2: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: new com/finalshell/core/Dn2_2
      // 0c9: dup
      // 0ca: bipush 4
      // 0cb: ldc_w ""
      // 0ce: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 0d1: athrow
      // 0d2: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: iload 10
      // 0d8: iload 5
      // 0da: ifne 0fe
      // 0dd: sipush 20436
      // 0e0: ldc2_w 5788056615437413713
      // 0e3: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 0e6: goto 0ed
      // 0e9: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: if_icmpne 10a
      // 0f0: aload 0
      // 0f1: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0f4: invokevirtual com/finalshell/core/UJ.d ()I
      // 0f7: goto 0fe
      // 0fa: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fd: athrow
      // 0fe: istore 11
      // 100: aload 0
      // 101: aload 0
      // 102: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 105: iload 11
      // 107: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // 10a: aload 0
      // 10b: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 10e: invokevirtual com/finalshell/core/UJ.S ()[B
      // 111: astore 11
      // 113: aload 0
      // 114: getfield com/finalshell/core/DY3.fB Lcom/finalshell/core/Y4;
      // 117: invokevirtual com/finalshell/core/Y4.w ()V
      // 11a: new com/finalshell/io/X52
      // 11d: dup
      // 11e: aload 0
      // 11f: lload 3
      // 120: aload 2
      // 121: aload 11
      // 123: invokespecial com/finalshell/io/X52.<init> (Lcom/finalshell/core/DY3;JLcom/finalshell/core/PO3;[B)V
      // 126: astore 12
      // 128: aload 12
      // 12a: areturn
      // 12b: astore 6
      // 12d: aload 6
      // 12f: iload 5
      // 131: ifne 14a
      // 134: instanceof com/finalshell/core/Dn2_2
      // 137: ifeq 14e
      // 13a: goto 141
      // 13d: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 140: athrow
      // 141: aload 6
      // 143: goto 14a
      // 146: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 149: athrow
      // 14a: checkcast com/finalshell/core/Dn2_2
      // 14d: athrow
      // 14e: new com/finalshell/core/Dn2_2
      // 151: dup
      // 152: bipush 4
      // 153: aload 6
      // 155: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 158: aload 6
      // 15a: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 15d: athrow
   }

   public Vector M$Vector(String var1) throws Dn2_2 {
      Vector var2 = new Vector();
      Eu2 var3 = new Eu2(this, var2);
      this.Z(var1, var3);
      return var2;
   }

   public void Z(String param1, Er4 param2) throws Dn2_2 {
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
      // 004: aload 0
      // 005: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 008: checkcast com/finalshell/io/Gu2
      // 00b: invokevirtual com/finalshell/io/Gu2.w ()V
      // 00e: aload 0
      // 00f: aload 1
      // 010: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 013: astore 1
      // 014: aconst_null
      // 015: astore 4
      // 017: new java/util/Vector
      // 01a: dup
      // 01b: invokespecial java/util/Vector.<init> ()V
      // 01e: astore 5
      // 020: aload 1
      // 021: sipush 1452
      // 024: ldc2_w 3411373113395504906
      // 027: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 02a: invokevirtual java/lang/String.lastIndexOf (I)I
      // 02d: istore 6
      // 02f: aload 1
      // 030: bipush 0
      // 031: iload 6
      // 033: iload 3
      // 034: ifeq 042
      // 037: ifne 045
      // 03a: goto 041
      // 03d: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 040: athrow
      // 041: bipush 1
      // 042: goto 047
      // 045: iload 6
      // 047: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 04a: astore 7
      // 04c: aload 1
      // 04d: iload 6
      // 04f: bipush 1
      // 050: iadd
      // 051: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 054: astore 8
      // 056: aload 7
      // 058: invokestatic com/finalshell/core/E8.v (Ljava/lang/String;)Ljava/lang/String;
      // 05b: astore 7
      // 05d: bipush 1
      // 05e: anewarray 667
      // 061: astore 9
      // 063: aload 0
      // 064: aload 8
      // 066: aload 9
      // 068: invokespecial com/finalshell/core/DY3.n (Ljava/lang/String;[[B)Z
      // 06b: istore 10
      // 06d: iload 10
      // 06f: ifeq 07b
      // 072: aload 9
      // 074: bipush 0
      // 075: aaload
      // 076: astore 4
      // 078: goto 0d7
      // 07b: aload 1
      // 07c: invokestatic com/finalshell/core/E8.v (Ljava/lang/String;)Ljava/lang/String;
      // 07f: astore 11
      // 081: aload 0
      // 082: aload 11
      // 084: invokespecial com/finalshell/core/DY3.n (Ljava/lang/String;)Lcom/finalshell/core/C_p_2;
      // 087: astore 12
      // 089: aload 12
      // 08b: invokevirtual com/finalshell/core/C_p_2.e$boolean ()Z
      // 08e: iload 3
      // 08f: ifeq 0b2
      // 092: ifeq 0a7
      // 095: goto 09c
      // 098: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09b: athrow
      // 09c: aconst_null
      // 09d: astore 4
      // 09f: aload 11
      // 0a1: astore 7
      // 0a3: iload 3
      // 0a4: ifne 0d7
      // 0a7: aload 0
      // 0a8: getfield com/finalshell/core/DY3.fn Z
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b1: athrow
      // 0b2: ifeq 0c5
      // 0b5: aload 9
      // 0b7: bipush 0
      // 0b8: aaload
      // 0b9: astore 4
      // 0bb: aload 4
      // 0bd: invokestatic com/finalshell/core/E8.V ([B)[B
      // 0c0: astore 4
      // 0c2: goto 0d7
      // 0c5: aload 8
      // 0c7: invokestatic com/finalshell/core/E8.v (Ljava/lang/String;)Ljava/lang/String;
      // 0ca: astore 8
      // 0cc: aload 8
      // 0ce: aload 0
      // 0cf: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 0d2: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 0d5: astore 4
      // 0d7: aload 0
      // 0d8: aload 7
      // 0da: aload 0
      // 0db: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 0de: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 0e1: invokespecial com/finalshell/core/DY3.I ([B)V
      // 0e4: new com/finalshell/core/S_2_2
      // 0e7: dup
      // 0e8: invokespecial com/finalshell/core/S_2_2.<init> ()V
      // 0eb: astore 11
      // 0ed: aload 0
      // 0ee: aload 0
      // 0ef: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0f2: aload 11
      // 0f4: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 0f7: astore 11
      // 0f9: aload 11
      // 0fb: getfield com/finalshell/core/S_2_2.W I
      // 0fe: istore 12
      // 100: aload 11
      // 102: getfield com/finalshell/core/S_2_2.T I
      // 105: istore 13
      // 107: aload 0
      // 108: aload 0
      // 109: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 10c: iload 12
      // 10e: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 111: iload 13
      // 113: sipush 20436
      // 116: ldc2_w 5788056615437413713
      // 119: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 11c: iload 3
      // 11d: ifeq 170
      // 120: if_icmpeq 15a
      // 123: goto 12a
      // 126: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 129: athrow
      // 12a: iload 13
      // 12c: sipush 12002
      // 12f: ldc2_w 1941196815231405135
      // 132: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 135: iload 3
      // 136: ifeq 170
      // 139: goto 140
      // 13c: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13f: athrow
      // 140: if_icmpeq 15a
      // 143: goto 14a
      // 146: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 149: athrow
      // 14a: new com/finalshell/core/Dn2_2
      // 14d: dup
      // 14e: bipush 4
      // 14f: ldc_w ""
      // 152: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 155: athrow
      // 156: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 159: athrow
      // 15a: iload 13
      // 15c: iload 3
      // 15d: ifeq 187
      // 160: sipush 20436
      // 163: ldc2_w 5788056615437413713
      // 166: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 169: goto 170
      // 16c: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16f: athrow
      // 170: if_icmpne 186
      // 173: aload 0
      // 174: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 177: invokevirtual com/finalshell/core/UJ.d ()I
      // 17a: istore 14
      // 17c: aload 0
      // 17d: aload 0
      // 17e: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 181: iload 14
      // 183: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // 186: bipush 0
      // 187: istore 14
      // 189: aload 0
      // 18a: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 18d: invokevirtual com/finalshell/core/UJ.S ()[B
      // 190: astore 15
      // 192: iload 14
      // 194: ifne 464
      // 197: aload 0
      // 198: aload 15
      // 19a: invokespecial com/finalshell/core/DY3.Z ([B)V
      // 19d: aload 0
      // 19e: aload 0
      // 19f: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 1a2: aload 11
      // 1a4: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 1a7: astore 11
      // 1a9: aload 11
      // 1ab: getfield com/finalshell/core/S_2_2.W I
      // 1ae: istore 12
      // 1b0: aload 11
      // 1b2: getfield com/finalshell/core/S_2_2.T I
      // 1b5: istore 13
      // 1b7: iload 13
      // 1b9: iload 3
      // 1ba: ifeq 46c
      // 1bd: sipush 20436
      // 1c0: ldc2_w 5788056615437413713
      // 1c3: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 1c6: iload 3
      // 1c7: ifeq 221
      // 1ca: goto 1d1
      // 1cd: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d0: athrow
      // 1d1: if_icmpeq 20b
      // 1d4: goto 1db
      // 1d7: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1da: athrow
      // 1db: iload 13
      // 1dd: sipush 28055
      // 1e0: ldc2_w 3253489545952923394
      // 1e3: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 1e6: iload 3
      // 1e7: ifeq 221
      // 1ea: goto 1f1
      // 1ed: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f0: athrow
      // 1f1: if_icmpeq 20b
      // 1f4: goto 1fb
      // 1f7: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fa: athrow
      // 1fb: new com/finalshell/core/Dn2_2
      // 1fe: dup
      // 1ff: bipush 4
      // 200: ldc_w ""
      // 203: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 206: athrow
      // 207: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20a: athrow
      // 20b: iload 13
      // 20d: iload 3
      // 20e: ifeq 278
      // 211: sipush 20436
      // 214: ldc2_w 5788056615437413713
      // 217: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 21a: goto 221
      // 21d: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 220: athrow
      // 221: if_icmpne 259
      // 224: aload 0
      // 225: aload 0
      // 226: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 229: iload 12
      // 22b: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 22e: aload 0
      // 22f: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 232: invokevirtual com/finalshell/core/UJ.d ()I
      // 235: istore 16
      // 237: iload 16
      // 239: bipush 1
      // 23a: if_icmpne 248
      // 23d: iload 3
      // 23e: ifne 464
      // 241: goto 248
      // 244: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 247: athrow
      // 248: aload 0
      // 249: aload 0
      // 24a: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 24d: iload 16
      // 24f: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // 252: goto 259
      // 255: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 258: athrow
      // 259: aload 0
      // 25a: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 25d: invokevirtual com/finalshell/core/UJ.a ()V
      // 260: aload 0
      // 261: aload 0
      // 262: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 265: getfield com/finalshell/core/UJ.g [B
      // 268: bipush 0
      // 269: bipush 4
      // 26a: invokespecial com/finalshell/core/DY3.x ([BII)I
      // 26d: pop
      // 26e: iinc 12 -4
      // 271: aload 0
      // 272: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 275: invokevirtual com/finalshell/core/UJ.d ()I
      // 278: istore 16
      // 27a: aload 0
      // 27b: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 27e: invokevirtual com/finalshell/core/UJ.m ()V
      // 281: iload 16
      // 283: ifle 460
      // 286: iload 12
      // 288: iload 3
      // 289: ifeq 194
      // 28c: iload 3
      // 28d: ifeq 2b0
      // 290: ifle 30e
      // 293: goto 29a
      // 296: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 299: athrow
      // 29a: aload 0
      // 29b: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 29e: invokevirtual com/finalshell/core/UJ.f ()V
      // 2a1: aload 0
      // 2a2: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 2a5: getfield com/finalshell/core/UJ.g [B
      // 2a8: arraylength
      // 2a9: goto 2b0
      // 2ac: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2af: athrow
      // 2b0: aload 0
      // 2b1: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 2b4: getfield com/finalshell/core/UJ.X I
      // 2b7: iload 12
      // 2b9: iadd
      // 2ba: iload 3
      // 2bb: ifeq 2e0
      // 2be: if_icmple 2d1
      // 2c1: goto 2c8
      // 2c4: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c7: athrow
      // 2c8: iload 12
      // 2ca: goto 2e1
      // 2cd: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d0: athrow
      // 2d1: aload 0
      // 2d2: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 2d5: getfield com/finalshell/core/UJ.g [B
      // 2d8: arraylength
      // 2d9: aload 0
      // 2da: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 2dd: getfield com/finalshell/core/UJ.X I
      // 2e0: isub
      // 2e1: istore 19
      // 2e3: aload 0
      // 2e4: aload 0
      // 2e5: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 2e8: getfield com/finalshell/core/UJ.g [B
      // 2eb: aload 0
      // 2ec: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 2ef: getfield com/finalshell/core/UJ.X I
      // 2f2: iload 19
      // 2f4: invokespecial com/finalshell/core/DY3.x ([BII)I
      // 2f7: istore 20
      // 2f9: aload 0
      // 2fa: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 2fd: dup
      // 2fe: getfield com/finalshell/core/UJ.X I
      // 301: iload 20
      // 303: iadd
      // 304: putfield com/finalshell/core/UJ.X I
      // 307: iload 12
      // 309: iload 20
      // 30b: isub
      // 30c: istore 12
      // 30e: aload 0
      // 30f: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 312: invokevirtual com/finalshell/core/UJ.S ()[B
      // 315: astore 19
      // 317: aconst_null
      // 318: astore 20
      // 31a: aload 0
      // 31b: iload 3
      // 31c: ifeq 335
      // 31f: getfield com/finalshell/core/DY3.fp I
      // 322: bipush 3
      // 323: if_icmpgt 33d
      // 326: goto 32d
      // 329: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32c: athrow
      // 32d: aload 0
      // 32e: goto 335
      // 331: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 334: athrow
      // 335: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 338: invokevirtual com/finalshell/core/UJ.S ()[B
      // 33b: astore 20
      // 33d: aload 0
      // 33e: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 341: invokestatic com/finalshell/core/C_p_2.Z (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/C_p_2;
      // 344: astore 21
      // 346: iload 14
      // 348: iload 3
      // 349: ifeq 366
      // 34c: bipush 1
      // 34d: if_icmpne 365
      // 350: goto 357
      // 353: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 356: athrow
      // 357: iinc 16 -1
      // 35a: iload 3
      // 35b: ifne 281
      // 35e: goto 365
      // 361: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 364: athrow
      // 365: bipush 0
      // 366: istore 22
      // 368: aconst_null
      // 369: astore 23
      // 36b: iload 3
      // 36c: ifeq 37e
      // 36f: aload 4
      // 371: ifnonnull 382
      // 374: goto 37b
      // 377: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37a: athrow
      // 37b: bipush 1
      // 37c: istore 22
      // 37e: iload 3
      // 37f: ifne 3d6
      // 382: iload 10
      // 384: iload 3
      // 385: ifeq 3a7
      // 388: goto 38f
      // 38b: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38e: athrow
      // 38f: ifne 3ad
      // 392: goto 399
      // 395: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 398: athrow
      // 399: aload 4
      // 39b: aload 19
      // 39d: invokestatic com/finalshell/core/E8.I ([B[B)Z
      // 3a0: goto 3a7
      // 3a3: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a6: athrow
      // 3a7: istore 22
      // 3a9: iload 3
      // 3aa: ifne 3d6
      // 3ad: aload 19
      // 3af: astore 24
      // 3b1: aload 0
      // 3b2: getfield com/finalshell/core/DY3.fn Z
      // 3b5: ifne 3cd
      // 3b8: aload 24
      // 3ba: aload 0
      // 3bb: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 3be: invokestatic com/finalshell/core/E8.y ([BLjava/nio/charset/Charset;)Ljava/lang/String;
      // 3c1: astore 23
      // 3c3: aload 23
      // 3c5: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 3c8: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 3cb: astore 24
      // 3cd: aload 4
      // 3cf: aload 24
      // 3d1: invokestatic com/finalshell/core/E8.j ([B[B)Z
      // 3d4: istore 22
      // 3d6: iload 22
      // 3d8: ifeq 459
      // 3db: aload 23
      // 3dd: iload 3
      // 3de: ifeq 402
      // 3e1: goto 3e8
      // 3e4: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e7: athrow
      // 3e8: ifnonnull 404
      // 3eb: goto 3f2
      // 3ee: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f1: athrow
      // 3f2: aload 19
      // 3f4: aload 0
      // 3f5: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 3f8: invokestatic com/finalshell/core/E8.y ([BLjava/nio/charset/Charset;)Ljava/lang/String;
      // 3fb: goto 402
      // 3fe: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 401: athrow
      // 402: astore 23
      // 404: aconst_null
      // 405: astore 24
      // 407: aload 20
      // 409: iload 3
      // 40a: ifeq 43b
      // 40d: ifnonnull 439
      // 410: goto 417
      // 413: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 416: athrow
      // 417: new java/lang/StringBuilder
      // 41a: dup
      // 41b: invokespecial java/lang/StringBuilder.<init> ()V
      // 41e: aload 21
      // 420: invokevirtual com/finalshell/core/C_p_2.toString ()Ljava/lang/String;
      // 423: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 426: ldc_w " "
      // 429: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 42c: aload 23
      // 42e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 431: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 434: astore 24
      // 436: goto 444
      // 439: aload 20
      // 43b: aload 0
      // 43c: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 43f: invokestatic com/finalshell/core/E8.y ([BLjava/nio/charset/Charset;)Ljava/lang/String;
      // 442: astore 24
      // 444: aload 2
      // 445: new com/finalshell/core/W4_2
      // 448: dup
      // 449: aload 23
      // 44b: aload 24
      // 44d: aload 21
      // 44f: invokespecial com/finalshell/core/W4_2.<init> (Ljava/lang/String;Ljava/lang/String;Lcom/finalshell/core/C_p_2;)V
      // 452: invokeinterface com/finalshell/core/Er4.n (Lcom/finalshell/core/W4_2;)I 2
      // 457: istore 14
      // 459: iinc 16 -1
      // 45c: iload 3
      // 45d: ifne 281
      // 460: iload 3
      // 461: ifne 192
      // 464: aload 0
      // 465: aload 15
      // 467: aload 11
      // 469: invokespecial com/finalshell/core/DY3.F ([BLcom/finalshell/core/S_2_2;)Z
      // 46c: pop
      // 46d: goto 4a2
      // 470: astore 4
      // 472: aload 4
      // 474: iload 3
      // 475: ifeq 48e
      // 478: instanceof com/finalshell/core/Dn2_2
      // 47b: ifeq 492
      // 47e: goto 485
      // 481: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 484: athrow
      // 485: aload 4
      // 487: goto 48e
      // 48a: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48d: athrow
      // 48e: checkcast com/finalshell/core/Dn2_2
      // 491: athrow
      // 492: new com/finalshell/core/Dn2_2
      // 495: dup
      // 496: bipush 4
      // 497: aload 4
      // 499: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 49c: aload 4
      // 49e: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 4a1: athrow
      // 4a2: return
   }

   public String k$String(String param1) throws Dn2_2 {
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
      // 005: iload 2
      // 006: ifne 04c
      // 009: getfield com/finalshell/core/DY3.fp I
      // 00c: bipush 3
      // 00d: if_icmpge 035
      // 010: goto 017
      // 013: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 016: athrow
      // 017: new com/finalshell/core/Dn2_2
      // 01a: dup
      // 01b: sipush 23335
      // 01e: ldc2_w 5569429345955002771
      // 021: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 024: sipush 10314
      // 027: sipush 30247
      // 02a: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 02d: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 030: athrow
      // 031: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 034: athrow
      // 035: aload 0
      // 036: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 039: checkcast com/finalshell/io/Gu2
      // 03c: invokevirtual com/finalshell/io/Gu2.w ()V
      // 03f: aload 0
      // 040: aload 1
      // 041: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 044: astore 1
      // 045: aload 0
      // 046: aload 1
      // 047: invokespecial com/finalshell/core/DY3.P (Ljava/lang/String;)Ljava/lang/String;
      // 04a: astore 1
      // 04b: aload 0
      // 04c: aload 1
      // 04d: aload 0
      // 04e: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 051: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 054: invokespecial com/finalshell/core/DY3.b ([B)V
      // 057: new com/finalshell/core/S_2_2
      // 05a: dup
      // 05b: invokespecial com/finalshell/core/S_2_2.<init> ()V
      // 05e: astore 3
      // 05f: aload 0
      // 060: aload 0
      // 061: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 064: aload 3
      // 065: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 068: astore 3
      // 069: aload 3
      // 06a: getfield com/finalshell/core/S_2_2.W I
      // 06d: istore 4
      // 06f: aload 3
      // 070: getfield com/finalshell/core/S_2_2.T I
      // 073: istore 5
      // 075: aload 0
      // 076: aload 0
      // 077: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 07a: iload 4
      // 07c: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 07f: iload 5
      // 081: sipush 20436
      // 084: ldc2_w 5788056615437413713
      // 087: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 08a: iload 2
      // 08b: ifne 0de
      // 08e: if_icmpeq 0c8
      // 091: goto 098
      // 094: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: iload 5
      // 09a: sipush 3499
      // 09d: ldc2_w 7146245346187996948
      // 0a0: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 0a3: iload 2
      // 0a4: ifne 0de
      // 0a7: goto 0ae
      // 0aa: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ad: athrow
      // 0ae: if_icmpeq 0c8
      // 0b1: goto 0b8
      // 0b4: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b7: athrow
      // 0b8: new com/finalshell/core/Dn2_2
      // 0bb: dup
      // 0bc: bipush 4
      // 0bd: ldc_w ""
      // 0c0: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 0c3: athrow
      // 0c4: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c7: athrow
      // 0c8: iload 5
      // 0ca: iload 2
      // 0cb: ifne 140
      // 0ce: sipush 3499
      // 0d1: ldc2_w 7146245346187996948
      // 0d4: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 0d7: goto 0de
      // 0da: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: if_icmpne 139
      // 0e1: aload 0
      // 0e2: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0e5: invokevirtual com/finalshell/core/UJ.d ()I
      // 0e8: istore 6
      // 0ea: aconst_null
      // 0eb: astore 7
      // 0ed: bipush 0
      // 0ee: istore 8
      // 0f0: iload 8
      // 0f2: iload 6
      // 0f4: if_icmpge 12f
      // 0f7: aload 0
      // 0f8: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0fb: invokevirtual com/finalshell/core/UJ.S ()[B
      // 0fe: iload 2
      // 0ff: ifne 131
      // 102: astore 7
      // 104: aload 0
      // 105: iload 2
      // 106: ifne 121
      // 109: getfield com/finalshell/core/DY3.fp I
      // 10c: bipush 3
      // 10d: if_icmpgt 120
      // 110: goto 117
      // 113: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 116: athrow
      // 117: aload 0
      // 118: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 11b: invokevirtual com/finalshell/core/UJ.S ()[B
      // 11e: astore 9
      // 120: aload 0
      // 121: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 124: invokestatic com/finalshell/core/C_p_2.Z (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/C_p_2;
      // 127: pop
      // 128: iinc 8 1
      // 12b: iload 2
      // 12c: ifeq 0f0
      // 12f: aload 7
      // 131: aload 0
      // 132: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 135: invokestatic com/finalshell/core/E8.y ([BLjava/nio/charset/Charset;)Ljava/lang/String;
      // 138: areturn
      // 139: aload 0
      // 13a: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 13d: invokevirtual com/finalshell/core/UJ.d ()I
      // 140: istore 6
      // 142: aload 0
      // 143: aload 0
      // 144: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 147: iload 6
      // 149: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // 14c: goto 17c
      // 14f: astore 3
      // 150: aload 3
      // 151: iload 2
      // 152: ifne 16a
      // 155: instanceof com/finalshell/core/Dn2_2
      // 158: ifeq 16e
      // 15b: goto 162
      // 15e: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 161: athrow
      // 162: aload 3
      // 163: goto 16a
      // 166: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 169: athrow
      // 16a: checkcast com/finalshell/core/Dn2_2
      // 16d: athrow
      // 16e: new com/finalshell/core/Dn2_2
      // 171: dup
      // 172: bipush 4
      // 173: aload 3
      // 174: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 177: aload 3
      // 178: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 17b: athrow
      // 17c: aconst_null
      // 17d: areturn
   }

   public void S(String param1, String param2) throws Dn2_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifne 040
      // 009: getfield com/finalshell/core/DY3.fp I
      // 00c: bipush 3
      // 00d: if_icmpge 035
      // 010: goto 017
      // 013: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 016: athrow
      // 017: new com/finalshell/core/Dn2_2
      // 01a: dup
      // 01b: sipush 2125
      // 01e: ldc2_w 1948715921237175036
      // 021: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 024: sipush 10312
      // 027: sipush 2965
      // 02a: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 02d: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 030: athrow
      // 031: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 034: athrow
      // 035: aload 0
      // 036: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 039: checkcast com/finalshell/io/Gu2
      // 03c: invokevirtual com/finalshell/io/Gu2.w ()V
      // 03f: aload 0
      // 040: aload 1
      // 041: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 044: astore 4
      // 046: aload 0
      // 047: aload 2
      // 048: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 04b: astore 2
      // 04c: aload 0
      // 04d: aload 4
      // 04f: invokespecial com/finalshell/core/DY3.P (Ljava/lang/String;)Ljava/lang/String;
      // 052: astore 4
      // 054: aload 1
      // 055: iload 3
      // 056: ifne 0aa
      // 059: bipush 0
      // 05a: invokevirtual java/lang/String.charAt (I)C
      // 05d: sipush 1452
      // 060: ldc2_w 3411373113395504906
      // 063: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 066: if_icmpeq 0a1
      // 069: goto 070
      // 06c: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06f: athrow
      // 070: aload 0
      // 071: invokespecial com/finalshell/core/DY3.q ()Ljava/lang/String;
      // 074: astore 5
      // 076: aload 4
      // 078: aload 5
      // 07a: invokevirtual java/lang/String.length ()I
      // 07d: aload 5
      // 07f: ldc_w "/"
      // 082: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 085: iload 3
      // 086: ifne 094
      // 089: ifeq 097
      // 08c: goto 093
      // 08f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 092: athrow
      // 093: bipush 0
      // 094: goto 098
      // 097: bipush 1
      // 098: iadd
      // 099: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 09c: astore 1
      // 09d: iload 3
      // 09e: ifeq 0ab
      // 0a1: aload 4
      // 0a3: goto 0aa
      // 0a6: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: astore 1
      // 0ab: aload 0
      // 0ac: aload 2
      // 0ad: iload 3
      // 0ae: ifne 0d3
      // 0b1: invokespecial com/finalshell/core/DY3.A (Ljava/lang/String;)Z
      // 0b4: ifeq 0cc
      // 0b7: goto 0be
      // 0ba: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bd: athrow
      // 0be: new com/finalshell/core/Dn2_2
      // 0c1: dup
      // 0c2: bipush 4
      // 0c3: aload 2
      // 0c4: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 0c7: athrow
      // 0c8: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cb: athrow
      // 0cc: aload 2
      // 0cd: invokestatic com/finalshell/core/E8.v (Ljava/lang/String;)Ljava/lang/String;
      // 0d0: astore 2
      // 0d1: aload 0
      // 0d2: aload 1
      // 0d3: aload 0
      // 0d4: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 0d7: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 0da: aload 2
      // 0db: aload 0
      // 0dc: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 0df: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 0e2: invokespecial com/finalshell/core/DY3.O ([B[B)V
      // 0e5: new com/finalshell/core/S_2_2
      // 0e8: dup
      // 0e9: invokespecial com/finalshell/core/S_2_2.<init> ()V
      // 0ec: astore 5
      // 0ee: aload 0
      // 0ef: aload 0
      // 0f0: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0f3: aload 5
      // 0f5: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 0f8: astore 5
      // 0fa: aload 5
      // 0fc: getfield com/finalshell/core/S_2_2.W I
      // 0ff: istore 6
      // 101: aload 5
      // 103: getfield com/finalshell/core/S_2_2.T I
      // 106: istore 7
      // 108: aload 0
      // 109: aload 0
      // 10a: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 10d: iload 6
      // 10f: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 112: iload 7
      // 114: iload 3
      // 115: ifne 142
      // 118: sipush 20436
      // 11b: ldc2_w 5788056615437413713
      // 11e: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 121: if_icmpeq 13b
      // 124: goto 12b
      // 127: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12a: athrow
      // 12b: new com/finalshell/core/Dn2_2
      // 12e: dup
      // 12f: bipush 4
      // 130: ldc_w ""
      // 133: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 136: athrow
      // 137: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13a: athrow
      // 13b: aload 0
      // 13c: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 13f: invokevirtual com/finalshell/core/UJ.d ()I
      // 142: istore 8
      // 144: iload 3
      // 145: ifne 15f
      // 148: iload 8
      // 14a: ifne 155
      // 14d: goto 154
      // 150: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 153: athrow
      // 154: return
      // 155: aload 0
      // 156: aload 0
      // 157: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 15a: iload 8
      // 15c: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // 15f: goto 194
      // 162: astore 4
      // 164: aload 4
      // 166: iload 3
      // 167: ifne 180
      // 16a: instanceof com/finalshell/core/Dn2_2
      // 16d: ifeq 184
      // 170: goto 177
      // 173: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 176: athrow
      // 177: aload 4
      // 179: goto 180
      // 17c: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17f: athrow
      // 180: checkcast com/finalshell/core/Dn2_2
      // 183: athrow
      // 184: new com/finalshell/core/Dn2_2
      // 187: dup
      // 188: bipush 4
      // 189: aload 4
      // 18b: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 18e: aload 4
      // 190: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 193: athrow
      // 194: return
   }

   public void W(String param1, String param2) throws Dn2_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifne 03f
      // 009: getfield com/finalshell/core/DY3.O Z
      // 00c: ifne 034
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 015: athrow
      // 016: new com/finalshell/core/Dn2_2
      // 019: dup
      // 01a: sipush 2125
      // 01d: ldc2_w 1948715921237175036
      // 020: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 023: sipush 10332
      // 026: sipush -30092
      // 029: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 02c: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 02f: athrow
      // 030: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: aload 0
      // 035: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 038: checkcast com/finalshell/io/Gu2
      // 03b: invokevirtual com/finalshell/io/Gu2.w ()V
      // 03e: aload 0
      // 03f: aload 1
      // 040: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 043: astore 4
      // 045: aload 0
      // 046: aload 2
      // 047: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 04a: astore 2
      // 04b: aload 0
      // 04c: aload 4
      // 04e: invokespecial com/finalshell/core/DY3.P (Ljava/lang/String;)Ljava/lang/String;
      // 051: astore 4
      // 053: aload 1
      // 054: iload 3
      // 055: ifne 0a9
      // 058: bipush 0
      // 059: invokevirtual java/lang/String.charAt (I)C
      // 05c: sipush 1452
      // 05f: ldc2_w 3411373113395504906
      // 062: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 065: if_icmpeq 0a0
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: aload 0
      // 070: invokespecial com/finalshell/core/DY3.q ()Ljava/lang/String;
      // 073: astore 5
      // 075: aload 4
      // 077: aload 5
      // 079: invokevirtual java/lang/String.length ()I
      // 07c: aload 5
      // 07e: ldc_w "/"
      // 081: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 084: iload 3
      // 085: ifne 093
      // 088: ifeq 096
      // 08b: goto 092
      // 08e: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 091: athrow
      // 092: bipush 0
      // 093: goto 097
      // 096: bipush 1
      // 097: iadd
      // 098: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 09b: astore 1
      // 09c: iload 3
      // 09d: ifeq 0aa
      // 0a0: aload 4
      // 0a2: goto 0a9
      // 0a5: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a8: athrow
      // 0a9: astore 1
      // 0aa: aload 0
      // 0ab: aload 2
      // 0ac: iload 3
      // 0ad: ifne 0d2
      // 0b0: invokespecial com/finalshell/core/DY3.A (Ljava/lang/String;)Z
      // 0b3: ifeq 0cb
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: new com/finalshell/core/Dn2_2
      // 0c0: dup
      // 0c1: bipush 4
      // 0c2: aload 2
      // 0c3: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 0c6: athrow
      // 0c7: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: aload 2
      // 0cc: invokestatic com/finalshell/core/E8.v (Ljava/lang/String;)Ljava/lang/String;
      // 0cf: astore 2
      // 0d0: aload 0
      // 0d1: aload 1
      // 0d2: aload 0
      // 0d3: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 0d6: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 0d9: aload 2
      // 0da: aload 0
      // 0db: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 0de: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 0e1: invokespecial com/finalshell/core/DY3.T ([B[B)V
      // 0e4: new com/finalshell/core/S_2_2
      // 0e7: dup
      // 0e8: invokespecial com/finalshell/core/S_2_2.<init> ()V
      // 0eb: astore 5
      // 0ed: aload 0
      // 0ee: aload 0
      // 0ef: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0f2: aload 5
      // 0f4: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 0f7: astore 5
      // 0f9: aload 5
      // 0fb: getfield com/finalshell/core/S_2_2.W I
      // 0fe: istore 6
      // 100: aload 5
      // 102: getfield com/finalshell/core/S_2_2.T I
      // 105: istore 7
      // 107: aload 0
      // 108: aload 0
      // 109: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 10c: iload 6
      // 10e: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 111: iload 7
      // 113: iload 3
      // 114: ifne 141
      // 117: sipush 20436
      // 11a: ldc2_w 5788056615437413713
      // 11d: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 120: if_icmpeq 13a
      // 123: goto 12a
      // 126: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 129: athrow
      // 12a: new com/finalshell/core/Dn2_2
      // 12d: dup
      // 12e: bipush 4
      // 12f: ldc_w ""
      // 132: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 135: athrow
      // 136: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 139: athrow
      // 13a: aload 0
      // 13b: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 13e: invokevirtual com/finalshell/core/UJ.d ()I
      // 141: istore 8
      // 143: iload 3
      // 144: ifne 15e
      // 147: iload 8
      // 149: ifne 154
      // 14c: goto 153
      // 14f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 152: athrow
      // 153: return
      // 154: aload 0
      // 155: aload 0
      // 156: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 159: iload 8
      // 15b: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // 15e: goto 193
      // 161: astore 4
      // 163: aload 4
      // 165: iload 3
      // 166: ifne 17f
      // 169: instanceof com/finalshell/core/Dn2_2
      // 16c: ifeq 183
      // 16f: goto 176
      // 172: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 175: athrow
      // 176: aload 4
      // 178: goto 17f
      // 17b: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17e: athrow
      // 17f: checkcast com/finalshell/core/Dn2_2
      // 182: athrow
      // 183: new com/finalshell/core/Dn2_2
      // 186: dup
      // 187: bipush 4
      // 188: aload 4
      // 18a: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 18d: aload 4
      // 18f: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 192: athrow
      // 193: return
   }

   public void l(String param1, String param2) throws Dn2_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifne 052
      // 009: getfield com/finalshell/core/DY3.fp I
      // 00c: bipush 2
      // 00d: if_icmpge 035
      // 010: goto 017
      // 013: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 016: athrow
      // 017: new com/finalshell/core/Dn2_2
      // 01a: dup
      // 01b: sipush 2125
      // 01e: ldc2_w 1948715921237175036
      // 021: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 024: sipush 10333
      // 027: sipush -32547
      // 02a: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 02d: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 030: athrow
      // 031: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 034: athrow
      // 035: aload 0
      // 036: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 039: checkcast com/finalshell/io/Gu2
      // 03c: invokevirtual com/finalshell/io/Gu2.w ()V
      // 03f: aload 0
      // 040: aload 1
      // 041: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 044: astore 1
      // 045: aload 0
      // 046: aload 2
      // 047: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 04a: astore 2
      // 04b: aload 0
      // 04c: aload 1
      // 04d: invokespecial com/finalshell/core/DY3.P (Ljava/lang/String;)Ljava/lang/String;
      // 050: astore 1
      // 051: aload 0
      // 052: aload 2
      // 053: invokespecial com/finalshell/core/DY3.k$Vector (Ljava/lang/String;)Ljava/util/Vector;
      // 056: astore 4
      // 058: aload 4
      // 05a: invokevirtual java/util/Vector.size ()I
      // 05d: istore 5
      // 05f: iload 5
      // 061: bipush 2
      // 062: iload 3
      // 063: ifne 090
      // 066: if_icmplt 082
      // 069: goto 070
      // 06c: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06f: athrow
      // 070: new com/finalshell/core/Dn2_2
      // 073: dup
      // 074: bipush 4
      // 075: aload 4
      // 077: invokevirtual java/util/Vector.toString ()Ljava/lang/String;
      // 07a: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 07d: athrow
      // 07e: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 081: athrow
      // 082: iload 5
      // 084: iload 3
      // 085: ifne 0ad
      // 088: bipush 1
      // 089: goto 090
      // 08c: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: if_icmpne 0a1
      // 093: aload 4
      // 095: bipush 0
      // 096: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 099: checkcast java/lang/String
      // 09c: astore 2
      // 09d: iload 3
      // 09e: ifeq 0c3
      // 0a1: aload 0
      // 0a2: aload 2
      // 0a3: invokespecial com/finalshell/core/DY3.A (Ljava/lang/String;)Z
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ac: athrow
      // 0ad: ifeq 0be
      // 0b0: new com/finalshell/core/Dn2_2
      // 0b3: dup
      // 0b4: bipush 4
      // 0b5: aload 2
      // 0b6: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 0b9: athrow
      // 0ba: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bd: athrow
      // 0be: aload 2
      // 0bf: invokestatic com/finalshell/core/E8.v (Ljava/lang/String;)Ljava/lang/String;
      // 0c2: astore 2
      // 0c3: aload 0
      // 0c4: aload 1
      // 0c5: aload 0
      // 0c6: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 0c9: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 0cc: aload 2
      // 0cd: aload 0
      // 0ce: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 0d1: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 0d4: invokespecial com/finalshell/core/DY3.E ([B[B)V
      // 0d7: new com/finalshell/core/S_2_2
      // 0da: dup
      // 0db: invokespecial com/finalshell/core/S_2_2.<init> ()V
      // 0de: astore 6
      // 0e0: aload 0
      // 0e1: aload 0
      // 0e2: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0e5: aload 6
      // 0e7: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 0ea: astore 6
      // 0ec: aload 6
      // 0ee: getfield com/finalshell/core/S_2_2.W I
      // 0f1: istore 7
      // 0f3: aload 6
      // 0f5: getfield com/finalshell/core/S_2_2.T I
      // 0f8: istore 8
      // 0fa: aload 0
      // 0fb: aload 0
      // 0fc: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0ff: iload 7
      // 101: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 104: iload 8
      // 106: iload 3
      // 107: ifne 134
      // 10a: sipush 20436
      // 10d: ldc2_w 5788056615437413713
      // 110: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 113: if_icmpeq 12d
      // 116: goto 11d
      // 119: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11c: athrow
      // 11d: new com/finalshell/core/Dn2_2
      // 120: dup
      // 121: bipush 4
      // 122: ldc_w ""
      // 125: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 128: athrow
      // 129: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12c: athrow
      // 12d: aload 0
      // 12e: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 131: invokevirtual com/finalshell/core/UJ.d ()I
      // 134: istore 9
      // 136: iload 3
      // 137: ifne 151
      // 13a: iload 9
      // 13c: ifne 147
      // 13f: goto 146
      // 142: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 145: athrow
      // 146: return
      // 147: aload 0
      // 148: aload 0
      // 149: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 14c: iload 9
      // 14e: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // 151: goto 186
      // 154: astore 4
      // 156: aload 4
      // 158: iload 3
      // 159: ifne 172
      // 15c: instanceof com/finalshell/core/Dn2_2
      // 15f: ifeq 176
      // 162: goto 169
      // 165: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 168: athrow
      // 169: aload 4
      // 16b: goto 172
      // 16e: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 171: athrow
      // 172: checkcast com/finalshell/core/Dn2_2
      // 175: athrow
      // 176: new com/finalshell/core/Dn2_2
      // 179: dup
      // 17a: bipush 4
      // 17b: aload 4
      // 17d: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 180: aload 4
      // 182: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 185: athrow
      // 186: return
   }

   public void V$void(String param1) throws Dn2_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: istore 2
      // 004: aload 0
      // 005: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 008: checkcast com/finalshell/io/Gu2
      // 00b: invokevirtual com/finalshell/io/Gu2.w ()V
      // 00e: aload 0
      // 00f: aload 1
      // 010: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 013: astore 1
      // 014: aload 0
      // 015: aload 1
      // 016: invokespecial com/finalshell/core/DY3.k$Vector (Ljava/lang/String;)Ljava/util/Vector;
      // 019: astore 3
      // 01a: aload 3
      // 01b: invokevirtual java/util/Vector.size ()I
      // 01e: istore 4
      // 020: new com/finalshell/core/S_2_2
      // 023: dup
      // 024: invokespecial com/finalshell/core/S_2_2.<init> ()V
      // 027: astore 5
      // 029: bipush 0
      // 02a: istore 6
      // 02c: iload 6
      // 02e: iload 4
      // 030: if_icmpge 0d2
      // 033: aload 3
      // 034: iload 6
      // 036: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 039: checkcast java/lang/String
      // 03c: astore 1
      // 03d: aload 0
      // 03e: aload 1
      // 03f: aload 0
      // 040: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 043: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 046: invokespecial com/finalshell/core/DY3.v ([B)V
      // 049: aload 0
      // 04a: aload 0
      // 04b: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 04e: aload 5
      // 050: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 053: astore 5
      // 055: aload 5
      // 057: getfield com/finalshell/core/S_2_2.W I
      // 05a: istore 7
      // 05c: aload 5
      // 05e: getfield com/finalshell/core/S_2_2.T I
      // 061: istore 8
      // 063: aload 0
      // 064: aload 0
      // 065: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 068: iload 7
      // 06a: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 06d: iload 2
      // 06e: ifeq 102
      // 071: iload 8
      // 073: iload 2
      // 074: ifeq 0a8
      // 077: goto 07e
      // 07a: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: sipush 20436
      // 081: ldc2_w 5788056615437413713
      // 084: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 087: if_icmpeq 0a1
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 090: athrow
      // 091: new com/finalshell/core/Dn2_2
      // 094: dup
      // 095: bipush 4
      // 096: ldc_w ""
      // 099: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 09c: athrow
      // 09d: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0a5: invokevirtual com/finalshell/core/UJ.d ()I
      // 0a8: istore 9
      // 0aa: iload 2
      // 0ab: ifeq 0ce
      // 0ae: iload 9
      // 0b0: ifeq 0cb
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: aload 0
      // 0bc: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0bf: iload 9
      // 0c1: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: iinc 6 1
      // 0ce: iload 2
      // 0cf: ifne 02c
      // 0d2: goto 102
      // 0d5: astore 3
      // 0d6: aload 3
      // 0d7: iload 2
      // 0d8: ifeq 0f0
      // 0db: instanceof com/finalshell/core/Dn2_2
      // 0de: ifeq 0f4
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: aload 3
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ef: athrow
      // 0f0: checkcast com/finalshell/core/Dn2_2
      // 0f3: athrow
      // 0f4: new com/finalshell/core/Dn2_2
      // 0f7: dup
      // 0f8: bipush 4
      // 0f9: aload 3
      // 0fa: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 0fd: aload 3
      // 0fe: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 101: athrow
      // 102: return
   }

   public boolean m$boolean(String var1) {
      boolean var2 = Dm4.J$boolean();

      try {
         this.d(E8.t(var1, this.Q));
         S_2_2 var3 = new S_2_2();
         var3 = this.v(this.G, var3);
         int var4 = var3.W;
         int var5 = var3.T;

         DY3 var10000;
         label27: {
            try {
               var10000 = this;
               if (var2) {
                  break label27;
               }

               this.N(this.G, var4);
               if (var5 != c(6883, 6741289750491691087L)) {
                  return false;
               }
            } catch (Exception var7) {
               throw a(var7);
            }

            var10000 = this;
         }

         C_p_2 var6 = C_p_2.Z(var10000.G);
         return var6.e$boolean();
      } catch (Exception var8) {
         return false;
      }
   }

   public void p(int param1, String param2) throws Dn2_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 3
      // 04: aload 0
      // 05: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 08: checkcast com/finalshell/io/Gu2
      // 0b: invokevirtual com/finalshell/io/Gu2.w ()V
      // 0e: aload 0
      // 0f: aload 2
      // 10: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 13: astore 2
      // 14: aload 0
      // 15: aload 2
      // 16: invokespecial com/finalshell/core/DY3.k$Vector (Ljava/lang/String;)Ljava/util/Vector;
      // 19: astore 4
      // 1b: aload 4
      // 1d: invokevirtual java/util/Vector.size ()I
      // 20: istore 5
      // 22: bipush 0
      // 23: istore 6
      // 25: iload 6
      // 27: iload 5
      // 29: if_icmpge 68
      // 2c: aload 4
      // 2e: iload 6
      // 30: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 33: checkcast java/lang/String
      // 36: astore 2
      // 37: aload 0
      // 38: aload 2
      // 39: invokespecial com/finalshell/core/DY3.n (Ljava/lang/String;)Lcom/finalshell/core/C_p_2;
      // 3c: astore 7
      // 3e: aload 7
      // 40: bipush 0
      // 41: invokevirtual com/finalshell/core/C_p_2.c (I)V
      // 44: aload 7
      // 46: aload 7
      // 48: getfield com/finalshell/core/C_p_2.l I
      // 4b: iload 1
      // 4c: invokevirtual com/finalshell/core/C_p_2.T (II)V
      // 4f: aload 0
      // 50: aload 2
      // 51: aload 7
      // 53: invokespecial com/finalshell/core/DY3.o (Ljava/lang/String;Lcom/finalshell/core/C_p_2;)V
      // 56: iinc 6 1
      // 59: iload 3
      // 5a: ifeq 9d
      // 5d: iload 3
      // 5e: ifne 25
      // 61: goto 68
      // 64: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: goto 9d
      // 6b: astore 4
      // 6d: aload 4
      // 6f: iload 3
      // 70: ifeq 89
      // 73: instanceof com/finalshell/core/Dn2_2
      // 76: ifeq 8d
      // 79: goto 80
      // 7c: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f: athrow
      // 80: aload 4
      // 82: goto 89
      // 85: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 88: athrow
      // 89: checkcast com/finalshell/core/Dn2_2
      // 8c: athrow
      // 8d: new com/finalshell/core/Dn2_2
      // 90: dup
      // 91: bipush 4
      // 92: aload 4
      // 94: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 97: aload 4
      // 99: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 9c: athrow
      // 9d: return
   }

   public void N(int param1, String param2) throws Dn2_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 3
      // 04: aload 0
      // 05: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 08: checkcast com/finalshell/io/Gu2
      // 0b: invokevirtual com/finalshell/io/Gu2.w ()V
      // 0e: aload 0
      // 0f: aload 2
      // 10: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 13: astore 2
      // 14: aload 0
      // 15: aload 2
      // 16: invokespecial com/finalshell/core/DY3.k$Vector (Ljava/lang/String;)Ljava/util/Vector;
      // 19: astore 4
      // 1b: aload 4
      // 1d: invokevirtual java/util/Vector.size ()I
      // 20: istore 5
      // 22: bipush 0
      // 23: istore 6
      // 25: iload 6
      // 27: iload 5
      // 29: if_icmpge 68
      // 2c: aload 4
      // 2e: iload 6
      // 30: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 33: checkcast java/lang/String
      // 36: astore 2
      // 37: aload 0
      // 38: aload 2
      // 39: invokespecial com/finalshell/core/DY3.n (Ljava/lang/String;)Lcom/finalshell/core/C_p_2;
      // 3c: astore 7
      // 3e: aload 7
      // 40: bipush 0
      // 41: invokevirtual com/finalshell/core/C_p_2.c (I)V
      // 44: aload 7
      // 46: iload 1
      // 47: aload 7
      // 49: getfield com/finalshell/core/C_p_2.W I
      // 4c: invokevirtual com/finalshell/core/C_p_2.T (II)V
      // 4f: aload 0
      // 50: aload 2
      // 51: aload 7
      // 53: invokespecial com/finalshell/core/DY3.o (Ljava/lang/String;Lcom/finalshell/core/C_p_2;)V
      // 56: iinc 6 1
      // 59: iload 3
      // 5a: ifeq 9d
      // 5d: iload 3
      // 5e: ifne 25
      // 61: goto 68
      // 64: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: goto 9d
      // 6b: astore 4
      // 6d: aload 4
      // 6f: iload 3
      // 70: ifeq 89
      // 73: instanceof com/finalshell/core/Dn2_2
      // 76: ifeq 8d
      // 79: goto 80
      // 7c: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f: athrow
      // 80: aload 4
      // 82: goto 89
      // 85: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 88: athrow
      // 89: checkcast com/finalshell/core/Dn2_2
      // 8c: athrow
      // 8d: new com/finalshell/core/Dn2_2
      // 90: dup
      // 91: bipush 4
      // 92: aload 4
      // 94: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 97: aload 4
      // 99: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 9c: athrow
      // 9d: return
   }

   public void G(int param1, String param2) throws Dn2_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: istore 3
      // 04: aload 0
      // 05: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 08: checkcast com/finalshell/io/Gu2
      // 0b: invokevirtual com/finalshell/io/Gu2.w ()V
      // 0e: aload 0
      // 0f: aload 2
      // 10: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 13: astore 2
      // 14: aload 0
      // 15: aload 2
      // 16: invokespecial com/finalshell/core/DY3.k$Vector (Ljava/lang/String;)Ljava/util/Vector;
      // 19: astore 4
      // 1b: aload 4
      // 1d: invokevirtual java/util/Vector.size ()I
      // 20: istore 5
      // 22: bipush 0
      // 23: istore 6
      // 25: iload 6
      // 27: iload 5
      // 29: if_icmpge 63
      // 2c: aload 4
      // 2e: iload 6
      // 30: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 33: checkcast java/lang/String
      // 36: astore 2
      // 37: aload 0
      // 38: aload 2
      // 39: invokespecial com/finalshell/core/DY3.n (Ljava/lang/String;)Lcom/finalshell/core/C_p_2;
      // 3c: astore 7
      // 3e: aload 7
      // 40: bipush 0
      // 41: invokevirtual com/finalshell/core/C_p_2.c (I)V
      // 44: aload 7
      // 46: iload 1
      // 47: invokevirtual com/finalshell/core/C_p_2.r (I)V
      // 4a: aload 0
      // 4b: aload 2
      // 4c: aload 7
      // 4e: invokespecial com/finalshell/core/DY3.o (Ljava/lang/String;Lcom/finalshell/core/C_p_2;)V
      // 51: iinc 6 1
      // 54: iload 3
      // 55: ifne 98
      // 58: iload 3
      // 59: ifeq 25
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: goto 98
      // 66: astore 4
      // 68: aload 4
      // 6a: iload 3
      // 6b: ifne 84
      // 6e: instanceof com/finalshell/core/Dn2_2
      // 71: ifeq 88
      // 74: goto 7b
      // 77: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7a: athrow
      // 7b: aload 4
      // 7d: goto 84
      // 80: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 83: athrow
      // 84: checkcast com/finalshell/core/Dn2_2
      // 87: athrow
      // 88: new com/finalshell/core/Dn2_2
      // 8b: dup
      // 8c: bipush 4
      // 8d: aload 4
      // 8f: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 92: aload 4
      // 94: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 97: athrow
      // 98: return
   }

   public void C(String param1, int param2) throws Dn2_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: istore 3
      // 04: aload 0
      // 05: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 08: checkcast com/finalshell/io/Gu2
      // 0b: invokevirtual com/finalshell/io/Gu2.w ()V
      // 0e: aload 0
      // 0f: aload 1
      // 10: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 13: astore 1
      // 14: aload 0
      // 15: aload 1
      // 16: invokespecial com/finalshell/core/DY3.k$Vector (Ljava/lang/String;)Ljava/util/Vector;
      // 19: astore 4
      // 1b: aload 4
      // 1d: invokevirtual java/util/Vector.size ()I
      // 20: istore 5
      // 22: bipush 0
      // 23: istore 6
      // 25: iload 6
      // 27: iload 5
      // 29: if_icmpge 68
      // 2c: aload 4
      // 2e: iload 6
      // 30: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 33: checkcast java/lang/String
      // 36: astore 1
      // 37: aload 0
      // 38: aload 1
      // 39: invokespecial com/finalshell/core/DY3.n (Ljava/lang/String;)Lcom/finalshell/core/C_p_2;
      // 3c: astore 7
      // 3e: aload 7
      // 40: bipush 0
      // 41: invokevirtual com/finalshell/core/C_p_2.c (I)V
      // 44: aload 7
      // 46: aload 7
      // 48: invokevirtual com/finalshell/core/C_p_2.t ()I
      // 4b: iload 2
      // 4c: invokevirtual com/finalshell/core/C_p_2.j (II)V
      // 4f: aload 0
      // 50: aload 1
      // 51: aload 7
      // 53: invokespecial com/finalshell/core/DY3.o (Ljava/lang/String;Lcom/finalshell/core/C_p_2;)V
      // 56: iinc 6 1
      // 59: iload 3
      // 5a: ifne 9d
      // 5d: iload 3
      // 5e: ifeq 25
      // 61: goto 68
      // 64: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: goto 9d
      // 6b: astore 4
      // 6d: aload 4
      // 6f: iload 3
      // 70: ifne 89
      // 73: instanceof com/finalshell/core/Dn2_2
      // 76: ifeq 8d
      // 79: goto 80
      // 7c: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f: athrow
      // 80: aload 4
      // 82: goto 89
      // 85: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 88: athrow
      // 89: checkcast com/finalshell/core/Dn2_2
      // 8c: athrow
      // 8d: new com/finalshell/core/Dn2_2
      // 90: dup
      // 91: bipush 4
      // 92: aload 4
      // 94: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 97: aload 4
      // 99: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 9c: athrow
      // 9d: return
   }

   public void c$void(String param1) throws Dn2_2 {
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
      // 005: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 008: checkcast com/finalshell/io/Gu2
      // 00b: invokevirtual com/finalshell/io/Gu2.w ()V
      // 00e: aload 0
      // 00f: aload 1
      // 010: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 013: astore 1
      // 014: aload 0
      // 015: aload 1
      // 016: invokespecial com/finalshell/core/DY3.k$Vector (Ljava/lang/String;)Ljava/util/Vector;
      // 019: astore 3
      // 01a: aload 3
      // 01b: invokevirtual java/util/Vector.size ()I
      // 01e: istore 4
      // 020: new com/finalshell/core/S_2_2
      // 023: dup
      // 024: invokespecial com/finalshell/core/S_2_2.<init> ()V
      // 027: astore 5
      // 029: bipush 0
      // 02a: istore 6
      // 02c: iload 6
      // 02e: iload 4
      // 030: if_icmpge 0d2
      // 033: aload 3
      // 034: iload 6
      // 036: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 039: checkcast java/lang/String
      // 03c: astore 1
      // 03d: aload 0
      // 03e: aload 1
      // 03f: aload 0
      // 040: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 043: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 046: invokespecial com/finalshell/core/DY3.r ([B)V
      // 049: aload 0
      // 04a: aload 0
      // 04b: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 04e: aload 5
      // 050: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 053: astore 5
      // 055: aload 5
      // 057: getfield com/finalshell/core/S_2_2.W I
      // 05a: istore 7
      // 05c: aload 5
      // 05e: getfield com/finalshell/core/S_2_2.T I
      // 061: istore 8
      // 063: aload 0
      // 064: aload 0
      // 065: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 068: iload 7
      // 06a: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 06d: iload 2
      // 06e: ifne 102
      // 071: iload 8
      // 073: iload 2
      // 074: ifne 0a8
      // 077: goto 07e
      // 07a: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: sipush 20436
      // 081: ldc2_w 5788056615437413713
      // 084: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 087: if_icmpeq 0a1
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 090: athrow
      // 091: new com/finalshell/core/Dn2_2
      // 094: dup
      // 095: bipush 4
      // 096: ldc_w ""
      // 099: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 09c: athrow
      // 09d: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0a5: invokevirtual com/finalshell/core/UJ.d ()I
      // 0a8: istore 9
      // 0aa: iload 2
      // 0ab: ifne 0ce
      // 0ae: iload 9
      // 0b0: ifeq 0cb
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: aload 0
      // 0bc: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 0bf: iload 9
      // 0c1: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: iinc 6 1
      // 0ce: iload 2
      // 0cf: ifeq 02c
      // 0d2: goto 102
      // 0d5: astore 3
      // 0d6: aload 3
      // 0d7: iload 2
      // 0d8: ifne 0f0
      // 0db: instanceof com/finalshell/core/Dn2_2
      // 0de: ifeq 0f4
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: aload 3
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ef: athrow
      // 0f0: checkcast com/finalshell/core/Dn2_2
      // 0f3: athrow
      // 0f4: new com/finalshell/core/Dn2_2
      // 0f7: dup
      // 0f8: bipush 4
      // 0f9: aload 3
      // 0fa: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 0fd: aload 3
      // 0fe: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 101: athrow
      // 102: return
   }

   public void d(String param1) throws Dn2_2 {
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
      // 05: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 08: checkcast com/finalshell/io/Gu2
      // 0b: invokevirtual com/finalshell/io/Gu2.w ()V
      // 0e: aload 0
      // 0f: aload 1
      // 10: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 13: astore 1
      // 14: aload 0
      // 15: aload 1
      // 16: aload 0
      // 17: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 1a: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 1d: aconst_null
      // 1e: invokespecial com/finalshell/core/DY3.d ([BLcom/finalshell/core/C_p_2;)V
      // 21: new com/finalshell/core/S_2_2
      // 24: dup
      // 25: invokespecial com/finalshell/core/S_2_2.<init> ()V
      // 28: astore 3
      // 29: aload 0
      // 2a: aload 0
      // 2b: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 2e: aload 3
      // 2f: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 32: astore 3
      // 33: aload 3
      // 34: getfield com/finalshell/core/S_2_2.W I
      // 37: istore 4
      // 39: aload 3
      // 3a: getfield com/finalshell/core/S_2_2.T I
      // 3d: istore 5
      // 3f: aload 0
      // 40: aload 0
      // 41: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 44: iload 4
      // 46: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 49: iload 5
      // 4b: iload 2
      // 4c: ifne 79
      // 4f: sipush 20436
      // 52: ldc2_w 5788056615437413713
      // 55: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 58: if_icmpeq 72
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61: athrow
      // 62: new com/finalshell/core/Dn2_2
      // 65: dup
      // 66: bipush 4
      // 67: ldc_w ""
      // 6a: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 6d: athrow
      // 6e: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: aload 0
      // 73: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 76: invokevirtual com/finalshell/core/UJ.d ()I
      // 79: istore 6
      // 7b: iload 2
      // 7c: ifne 96
      // 7f: iload 6
      // 81: ifne 8c
      // 84: goto 8b
      // 87: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8a: athrow
      // 8b: return
      // 8c: aload 0
      // 8d: aload 0
      // 8e: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 91: iload 6
      // 93: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // 96: goto c6
      // 99: astore 3
      // 9a: aload 3
      // 9b: iload 2
      // 9c: ifne b4
      // 9f: instanceof com/finalshell/core/Dn2_2
      // a2: ifeq b8
      // a5: goto ac
      // a8: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ab: athrow
      // ac: aload 3
      // ad: goto b4
      // b0: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b3: athrow
      // b4: checkcast com/finalshell/core/Dn2_2
      // b7: athrow
      // b8: new com/finalshell/core/Dn2_2
      // bb: dup
      // bc: bipush 4
      // bd: aload 3
      // be: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // c1: aload 3
      // c2: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // c5: athrow
      // c6: return
   }

   public C_p_2 s(String param1) throws Dn2_2 {
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
      // 05: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 08: checkcast com/finalshell/io/Gu2
      // 0b: invokevirtual com/finalshell/io/Gu2.w ()V
      // 0e: aload 0
      // 0f: aload 1
      // 10: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 13: astore 1
      // 14: aload 0
      // 15: aload 1
      // 16: invokespecial com/finalshell/core/DY3.P (Ljava/lang/String;)Ljava/lang/String;
      // 19: astore 1
      // 1a: aload 0
      // 1b: aload 1
      // 1c: invokespecial com/finalshell/core/DY3.n (Ljava/lang/String;)Lcom/finalshell/core/C_p_2;
      // 1f: areturn
      // 20: astore 3
      // 21: aload 3
      // 22: iload 2
      // 23: ifne 3b
      // 26: instanceof com/finalshell/core/Dn2_2
      // 29: ifeq 3f
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aload 3
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: checkcast com/finalshell/core/Dn2_2
      // 3e: athrow
      // 3f: new com/finalshell/core/Dn2_2
      // 42: dup
      // 43: bipush 4
      // 44: aload 3
      // 45: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 48: aload 3
      // 49: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 4c: athrow
   }

   public C_p_2 Y(byte[] param1) throws Dn2_2 {
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
      // 05: aload 1
      // 06: invokespecial com/finalshell/core/DY3.d ([B)V
      // 09: new com/finalshell/core/S_2_2
      // 0c: dup
      // 0d: invokespecial com/finalshell/core/S_2_2.<init> ()V
      // 10: astore 3
      // 11: aload 0
      // 12: aload 0
      // 13: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 16: aload 3
      // 17: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 1a: astore 3
      // 1b: aload 3
      // 1c: getfield com/finalshell/core/S_2_2.W I
      // 1f: istore 4
      // 21: aload 3
      // 22: getfield com/finalshell/core/S_2_2.T I
      // 25: istore 5
      // 27: aload 0
      // 28: iload 2
      // 29: ifne 91
      // 2c: aload 0
      // 2d: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 30: iload 4
      // 32: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 35: iload 5
      // 37: sipush 6883
      // 3a: ldc2_w 6741289750491691087
      // 3d: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 40: if_icmpeq 90
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: iload 5
      // 4c: iload 2
      // 4d: ifne 78
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: sipush 20436
      // 5a: ldc2_w 5788056615437413713
      // 5d: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 60: if_icmpne 84
      // 63: goto 6a
      // 66: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: aload 0
      // 6b: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 6e: invokevirtual com/finalshell/core/UJ.d ()I
      // 71: goto 78
      // 74: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: istore 6
      // 7a: aload 0
      // 7b: aload 0
      // 7c: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 7f: iload 6
      // 81: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // 84: new com/finalshell/core/Dn2_2
      // 87: dup
      // 88: bipush 4
      // 89: ldc_w ""
      // 8c: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 8f: athrow
      // 90: aload 0
      // 91: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 94: invokestatic com/finalshell/core/C_p_2.Z (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/C_p_2;
      // 97: astore 6
      // 99: aload 6
      // 9b: areturn
      // 9c: astore 3
      // 9d: aload 3
      // 9e: iload 2
      // 9f: ifne b7
      // a2: instanceof com/finalshell/core/Dn2_2
      // a5: ifeq bb
      // a8: goto af
      // ab: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ae: athrow
      // af: aload 3
      // b0: goto b7
      // b3: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b6: athrow
      // b7: checkcast com/finalshell/core/Dn2_2
      // ba: athrow
      // bb: new com/finalshell/core/Dn2_2
      // be: dup
      // bf: bipush 4
      // c0: aload 3
      // c1: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // c4: aload 3
      // c5: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // c8: athrow
   }

   public C_p_2 n(String var1) throws Dn2_2 {
      return this.Y(E8.t(var1, this.Q));
   }

   public Kb2 g(String param1) throws Dn2_2 {
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
      // 05: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 08: checkcast com/finalshell/io/Gu2
      // 0b: invokevirtual com/finalshell/io/Gu2.w ()V
      // 0e: aload 0
      // 0f: aload 1
      // 10: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 13: astore 1
      // 14: aload 0
      // 15: aload 1
      // 16: invokespecial com/finalshell/core/DY3.P (Ljava/lang/String;)Ljava/lang/String;
      // 19: astore 1
      // 1a: aload 0
      // 1b: aload 1
      // 1c: invokespecial com/finalshell/core/DY3.c$Kb_2 (Ljava/lang/String;)Lcom/finalshell/core/Kb2;
      // 1f: areturn
      // 20: astore 3
      // 21: aload 3
      // 22: iload 2
      // 23: ifne 3b
      // 26: instanceof com/finalshell/core/Dn2_2
      // 29: ifeq 3f
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aload 3
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: checkcast com/finalshell/core/Dn2_2
      // 3e: athrow
      // 3f: new com/finalshell/core/Dn2_2
      // 42: dup
      // 43: bipush 4
      // 44: aload 3
      // 45: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 48: aload 3
      // 49: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 4c: athrow
   }

   public Kb2 X(byte[] param1) throws Dn2_2 {
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
      // 06: ifeq 35
      // 09: getfield com/finalshell/core/DY3.fb Z
      // 0c: ifne 34
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: new com/finalshell/core/Dn2_2
      // 19: dup
      // 1a: sipush 2125
      // 1d: ldc2_w 1948715921237175036
      // 20: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 23: sipush 10311
      // 26: sipush -2680
      // 29: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 2c: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 2f: athrow
      // 30: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: aload 0
      // 35: aload 1
      // 36: invokespecial com/finalshell/core/DY3.G ([B)V
      // 39: new com/finalshell/core/S_2_2
      // 3c: dup
      // 3d: invokespecial com/finalshell/core/S_2_2.<init> ()V
      // 40: astore 3
      // 41: aload 0
      // 42: aload 0
      // 43: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 46: aload 3
      // 47: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 4a: astore 3
      // 4b: aload 3
      // 4c: getfield com/finalshell/core/S_2_2.W I
      // 4f: istore 4
      // 51: aload 3
      // 52: getfield com/finalshell/core/S_2_2.T I
      // 55: istore 5
      // 57: aload 0
      // 58: iload 2
      // 59: ifeq c1
      // 5c: aload 0
      // 5d: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 60: iload 4
      // 62: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 65: iload 5
      // 67: sipush 19854
      // 6a: ldc2_w 3150312733324619524
      // 6d: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 70: if_icmpeq c0
      // 73: goto 7a
      // 76: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 79: athrow
      // 7a: iload 5
      // 7c: iload 2
      // 7d: ifeq a8
      // 80: goto 87
      // 83: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86: athrow
      // 87: sipush 20436
      // 8a: ldc2_w 5788056615437413713
      // 8d: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 90: if_icmpne b4
      // 93: goto 9a
      // 96: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 99: athrow
      // 9a: aload 0
      // 9b: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 9e: invokevirtual com/finalshell/core/UJ.d ()I
      // a1: goto a8
      // a4: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a7: athrow
      // a8: istore 6
      // aa: aload 0
      // ab: aload 0
      // ac: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // af: iload 6
      // b1: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // b4: new com/finalshell/core/Dn2_2
      // b7: dup
      // b8: bipush 4
      // b9: ldc_w ""
      // bc: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // bf: athrow
      // c0: aload 0
      // c1: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // c4: invokestatic com/finalshell/core/Kb2.M (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/Kb2;
      // c7: astore 6
      // c9: aload 6
      // cb: areturn
      // cc: astore 3
      // cd: aload 3
      // ce: iload 2
      // cf: ifeq e7
      // d2: instanceof com/finalshell/core/Dn2_2
      // d5: ifeq eb
      // d8: goto df
      // db: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // de: athrow
      // df: aload 3
      // e0: goto e7
      // e3: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e6: athrow
      // e7: checkcast com/finalshell/core/Dn2_2
      // ea: athrow
      // eb: new com/finalshell/core/Dn2_2
      // ee: dup
      // ef: bipush 4
      // f0: aload 3
      // f1: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // f4: aload 3
      // f5: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // f8: athrow
   }

   public Kb2 c$Kb_2(String var1) throws Dn2_2 {
      return this.X(E8.t(var1, this.Q));
   }

   public C_p_2 w(String param1) throws Dn2_2 {
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
      // 05: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 08: checkcast com/finalshell/io/Gu2
      // 0b: invokevirtual com/finalshell/io/Gu2.w ()V
      // 0e: aload 0
      // 0f: aload 1
      // 10: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 13: astore 1
      // 14: aload 0
      // 15: aload 1
      // 16: invokespecial com/finalshell/core/DY3.P (Ljava/lang/String;)Ljava/lang/String;
      // 19: astore 1
      // 1a: aload 0
      // 1b: aload 1
      // 1c: invokespecial com/finalshell/core/DY3.M$_p_2 (Ljava/lang/String;)Lcom/finalshell/core/C_p_2;
      // 1f: areturn
      // 20: astore 3
      // 21: aload 3
      // 22: iload 2
      // 23: ifeq 3b
      // 26: instanceof com/finalshell/core/Dn2_2
      // 29: ifeq 3f
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aload 3
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: checkcast com/finalshell/core/Dn2_2
      // 3e: athrow
      // 3f: new com/finalshell/core/Dn2_2
      // 42: dup
      // 43: bipush 4
      // 44: aload 3
      // 45: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 48: aload 3
      // 49: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 4c: athrow
   }

   public C_p_2 M$_p_2(String param1) throws Dn2_2 {
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
      // 05: aload 1
      // 06: aload 0
      // 07: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 0a: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 0d: invokespecial com/finalshell/core/DY3.w ([B)V
      // 10: new com/finalshell/core/S_2_2
      // 13: dup
      // 14: invokespecial com/finalshell/core/S_2_2.<init> ()V
      // 17: astore 3
      // 18: aload 0
      // 19: aload 0
      // 1a: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 1d: aload 3
      // 1e: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 21: astore 3
      // 22: aload 3
      // 23: getfield com/finalshell/core/S_2_2.W I
      // 26: istore 4
      // 28: aload 3
      // 29: getfield com/finalshell/core/S_2_2.T I
      // 2c: istore 5
      // 2e: aload 0
      // 2f: iload 2
      // 30: ifne 98
      // 33: aload 0
      // 34: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 37: iload 4
      // 39: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 3c: iload 5
      // 3e: sipush 6883
      // 41: ldc2_w 6741289750491691087
      // 44: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 47: if_icmpeq 97
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: iload 5
      // 53: iload 2
      // 54: ifne 7f
      // 57: goto 5e
      // 5a: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: sipush 20436
      // 61: ldc2_w 5788056615437413713
      // 64: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 67: if_icmpne 8b
      // 6a: goto 71
      // 6d: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 70: athrow
      // 71: aload 0
      // 72: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 75: invokevirtual com/finalshell/core/UJ.d ()I
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e: athrow
      // 7f: istore 6
      // 81: aload 0
      // 82: aload 0
      // 83: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 86: iload 6
      // 88: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // 8b: new com/finalshell/core/Dn2_2
      // 8e: dup
      // 8f: bipush 4
      // 90: ldc_w ""
      // 93: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 96: athrow
      // 97: aload 0
      // 98: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 9b: invokestatic com/finalshell/core/C_p_2.Z (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/C_p_2;
      // 9e: astore 6
      // a0: aload 6
      // a2: areturn
      // a3: astore 3
      // a4: aload 3
      // a5: iload 2
      // a6: ifne be
      // a9: instanceof com/finalshell/core/Dn2_2
      // ac: ifeq c2
      // af: goto b6
      // b2: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b5: athrow
      // b6: aload 3
      // b7: goto be
      // ba: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bd: athrow
      // be: checkcast com/finalshell/core/Dn2_2
      // c1: athrow
      // c2: new com/finalshell/core/Dn2_2
      // c5: dup
      // c6: bipush 4
      // c7: aload 3
      // c8: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // cb: aload 3
      // cc: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // cf: athrow
   }

   public byte[] r$arrbyte(String param1) throws Dn2_2, IOException, Exception {
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
      // 04: aload 1
      // 05: aload 0
      // 06: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 09: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 0c: invokespecial com/finalshell/core/DY3.m ([B)V
      // 0f: new com/finalshell/core/S_2_2
      // 12: dup
      // 13: invokespecial com/finalshell/core/S_2_2.<init> ()V
      // 16: astore 3
      // 17: aload 0
      // 18: aload 0
      // 19: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 1c: aload 3
      // 1d: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 20: astore 3
      // 21: aload 3
      // 22: getfield com/finalshell/core/S_2_2.W I
      // 25: istore 4
      // 27: aload 3
      // 28: getfield com/finalshell/core/S_2_2.T I
      // 2b: istore 5
      // 2d: istore 2
      // 2e: aload 0
      // 2f: aload 0
      // 30: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 33: iload 4
      // 35: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 38: iload 5
      // 3a: sipush 20436
      // 3d: ldc2_w 5788056615437413713
      // 40: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 43: iload 2
      // 44: ifeq 97
      // 47: if_icmpeq 81
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: iload 5
      // 53: sipush 3499
      // 56: ldc2_w 7146245346187996948
      // 59: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 5c: iload 2
      // 5d: ifeq 97
      // 60: goto 67
      // 63: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 66: athrow
      // 67: if_icmpeq 81
      // 6a: goto 71
      // 6d: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 70: athrow
      // 71: new com/finalshell/core/Dn2_2
      // 74: dup
      // 75: bipush 4
      // 76: ldc_w ""
      // 79: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 7c: athrow
      // 7d: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80: athrow
      // 81: iload 5
      // 83: iload 2
      // 84: ifeq b4
      // 87: sipush 20436
      // 8a: ldc2_w 5788056615437413713
      // 8d: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 90: goto 97
      // 93: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 96: athrow
      // 97: if_icmpne ad
      // 9a: aload 0
      // 9b: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 9e: invokevirtual com/finalshell/core/UJ.d ()I
      // a1: istore 6
      // a3: aload 0
      // a4: aload 0
      // a5: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // a8: iload 6
      // aa: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // ad: aload 0
      // ae: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // b1: invokevirtual com/finalshell/core/UJ.d ()I
      // b4: istore 6
      // b6: aconst_null
      // b7: astore 7
      // b9: iload 6
      // bb: iinc 6 -1
      // be: ifle f7
      // c1: aload 0
      // c2: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // c5: invokevirtual com/finalshell/core/UJ.S ()[B
      // c8: iload 2
      // c9: ifeq f9
      // cc: astore 7
      // ce: aload 0
      // cf: iload 2
      // d0: ifeq eb
      // d3: getfield com/finalshell/core/DY3.fp I
      // d6: bipush 3
      // d7: if_icmpgt ea
      // da: goto e1
      // dd: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e0: athrow
      // e1: aload 0
      // e2: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // e5: invokevirtual com/finalshell/core/UJ.S ()[B
      // e8: astore 8
      // ea: aload 0
      // eb: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // ee: invokestatic com/finalshell/core/C_p_2.Z (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/C_p_2;
      // f1: astore 8
      // f3: iload 2
      // f4: ifne b9
      // f7: aload 7
      // f9: areturn
   }

   public void J(String param1, C_p_2 param2) throws Dn2_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: istore 3
      // 04: aload 0
      // 05: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 08: checkcast com/finalshell/io/Gu2
      // 0b: invokevirtual com/finalshell/io/Gu2.w ()V
      // 0e: aload 0
      // 0f: aload 1
      // 10: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 13: astore 1
      // 14: aload 0
      // 15: aload 1
      // 16: invokespecial com/finalshell/core/DY3.k$Vector (Ljava/lang/String;)Ljava/util/Vector;
      // 19: astore 4
      // 1b: aload 4
      // 1d: invokevirtual java/util/Vector.size ()I
      // 20: istore 5
      // 22: bipush 0
      // 23: istore 6
      // 25: iload 6
      // 27: iload 5
      // 29: if_icmpge 4f
      // 2c: aload 4
      // 2e: iload 6
      // 30: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 33: checkcast java/lang/String
      // 36: astore 1
      // 37: aload 0
      // 38: aload 1
      // 39: aload 2
      // 3a: invokespecial com/finalshell/core/DY3.o (Ljava/lang/String;Lcom/finalshell/core/C_p_2;)V
      // 3d: iinc 6 1
      // 40: iload 3
      // 41: ifne 84
      // 44: iload 3
      // 45: ifeq 25
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: goto 84
      // 52: astore 4
      // 54: aload 4
      // 56: iload 3
      // 57: ifne 70
      // 5a: instanceof com/finalshell/core/Dn2_2
      // 5d: ifeq 74
      // 60: goto 67
      // 63: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 66: athrow
      // 67: aload 4
      // 69: goto 70
      // 6c: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: checkcast com/finalshell/core/Dn2_2
      // 73: athrow
      // 74: new com/finalshell/core/Dn2_2
      // 77: dup
      // 78: bipush 4
      // 79: aload 4
      // 7b: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 7e: aload 4
      // 80: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 83: athrow
      // 84: return
   }

   public void o(String param1, C_p_2 param2) throws Dn2_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: aload 0
      // 07: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 0a: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 0d: aload 2
      // 0e: invokespecial com/finalshell/core/DY3.t ([BLcom/finalshell/core/C_p_2;)V
      // 11: new com/finalshell/core/S_2_2
      // 14: dup
      // 15: invokespecial com/finalshell/core/S_2_2.<init> ()V
      // 18: astore 4
      // 1a: aload 0
      // 1b: aload 0
      // 1c: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 1f: aload 4
      // 21: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 24: astore 4
      // 26: aload 4
      // 28: getfield com/finalshell/core/S_2_2.W I
      // 2b: istore 5
      // 2d: aload 4
      // 2f: getfield com/finalshell/core/S_2_2.T I
      // 32: istore 6
      // 34: aload 0
      // 35: aload 0
      // 36: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 39: iload 5
      // 3b: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 3e: iload 6
      // 40: iload 3
      // 41: ifne 6e
      // 44: sipush 20436
      // 47: ldc2_w 5788056615437413713
      // 4a: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 4d: if_icmpeq 67
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: new com/finalshell/core/Dn2_2
      // 5a: dup
      // 5b: bipush 4
      // 5c: ldc_w ""
      // 5f: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 62: athrow
      // 63: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 66: athrow
      // 67: aload 0
      // 68: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 6b: invokevirtual com/finalshell/core/UJ.d ()I
      // 6e: istore 7
      // 70: iload 7
      // 72: ifeq 86
      // 75: aload 0
      // 76: aload 0
      // 77: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 7a: iload 7
      // 7c: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // 7f: goto 86
      // 82: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 85: athrow
      // 86: goto bb
      // 89: astore 4
      // 8b: aload 4
      // 8d: iload 3
      // 8e: ifne a7
      // 91: instanceof com/finalshell/core/Dn2_2
      // 94: ifeq ab
      // 97: goto 9e
      // 9a: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9d: athrow
      // 9e: aload 4
      // a0: goto a7
      // a3: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a6: athrow
      // a7: checkcast com/finalshell/core/Dn2_2
      // aa: athrow
      // ab: new com/finalshell/core/Dn2_2
      // ae: dup
      // af: bipush 4
      // b0: aload 4
      // b2: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // b5: aload 4
      // b7: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // ba: athrow
      // bb: return
   }

   public String k() throws Dn2_2 {
      return this.q();
   }

   public String S() {
      return this.T;
   }

   public String T() {
      return this.p;
   }

   public String X$String() throws Dn2_2 {
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
      // 05: getfield com/finalshell/core/DY3.a Ljava/lang/String;
      // 08: iload 1
      // 09: ifne 68
      // 0c: ifnonnull 64
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 1a: checkcast com/finalshell/io/Gu2
      // 1d: invokevirtual com/finalshell/io/Gu2.w ()V
      // 20: aload 0
      // 21: ldc_w ""
      // 24: invokespecial com/finalshell/core/DY3.r$arrbyte (Ljava/lang/String;)[B
      // 27: astore 2
      // 28: aload 0
      // 29: aload 2
      // 2a: aload 0
      // 2b: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 2e: invokestatic com/finalshell/core/E8.y ([BLjava/nio/charset/Charset;)Ljava/lang/String;
      // 31: putfield com/finalshell/core/DY3.a Ljava/lang/String;
      // 34: goto 64
      // 37: astore 2
      // 38: aload 2
      // 39: iload 1
      // 3a: ifne 52
      // 3d: instanceof com/finalshell/core/Dn2_2
      // 40: ifeq 56
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: aload 2
      // 4b: goto 52
      // 4e: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: checkcast com/finalshell/core/Dn2_2
      // 55: athrow
      // 56: new com/finalshell/core/Dn2_2
      // 59: dup
      // 5a: bipush 4
      // 5b: aload 2
      // 5c: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 5f: aload 2
      // 60: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 63: athrow
      // 64: aload 0
      // 65: getfield com/finalshell/core/DY3.a Ljava/lang/String;
      // 68: areturn
   }

   public String q() throws Dn2_2 {
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
      // 04: aload 0
      // 05: getfield com/finalshell/core/DY3.q Ljava/lang/String;
      // 08: iload 1
      // 09: ifeq 29
      // 0c: ifnonnull 25
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: invokevirtual com/finalshell/core/DY3.X$String ()Ljava/lang/String;
      // 1b: putfield com/finalshell/core/DY3.q Ljava/lang/String;
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 0
      // 26: getfield com/finalshell/core/DY3.q Ljava/lang/String;
      // 29: areturn
   }

   public void h(String var1) {
      this.q = var1;
   }

   public void d(byte[] param1, int param2, int param3) throws IOException, Dn2_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: bipush 0
      // 04: istore 5
      // 06: istore 4
      // 08: iload 3
      // 09: ifle 48
      // 0c: aload 0
      // 0d: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 10: aload 1
      // 11: iload 2
      // 12: iload 3
      // 13: invokevirtual java/io/InputStream.read ([BII)I
      // 16: istore 5
      // 18: iload 5
      // 1a: iload 4
      // 1c: ifeq 42
      // 1f: ifgt 39
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: new com/finalshell/core/Dn2_2
      // 2c: dup
      // 2d: bipush 4
      // 2e: ldc_w ""
      // 31: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 34: athrow
      // 35: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: iload 2
      // 3a: iload 5
      // 3c: iadd
      // 3d: istore 2
      // 3e: iload 3
      // 3f: iload 5
      // 41: isub
      // 42: istore 3
      // 43: iload 4
      // 45: ifne 08
      // 48: return
   }

   public boolean c(int[] param1, S_2_2 param2) throws IOException, Dn2_2 {
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
      // 04: aload 0
      // 05: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 08: aload 2
      // 09: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 0c: astore 2
      // 0d: istore 3
      // 0e: aload 2
      // 0f: getfield com/finalshell/core/S_2_2.W I
      // 12: istore 4
      // 14: aload 2
      // 15: getfield com/finalshell/core/S_2_2.T I
      // 18: istore 5
      // 1a: iload 3
      // 1b: ifne 41
      // 1e: aload 1
      // 1f: ifnull 37
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: aload 1
      // 2a: bipush 0
      // 2b: aload 2
      // 2c: getfield com/finalshell/core/S_2_2.w I
      // 2f: iastore
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 0
      // 38: aload 0
      // 39: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 3c: iload 4
      // 3e: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 41: iload 5
      // 43: iload 3
      // 44: ifne 71
      // 47: sipush 20436
      // 4a: ldc2_w 5788056615437413713
      // 4d: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 50: if_icmpeq 6a
      // 53: goto 5a
      // 56: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: new com/finalshell/core/Dn2_2
      // 5d: dup
      // 5e: bipush 4
      // 5f: ldc_w ""
      // 62: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 65: athrow
      // 66: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: aload 0
      // 6b: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 6e: invokevirtual com/finalshell/core/UJ.d ()I
      // 71: istore 6
      // 73: iload 6
      // 75: iload 3
      // 76: ifne 95
      // 79: ifeq 94
      // 7c: goto 83
      // 7f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 82: athrow
      // 83: aload 0
      // 84: aload 0
      // 85: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 88: iload 6
      // 8a: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // 8d: goto 94
      // 90: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 93: athrow
      // 94: bipush 1
      // 95: ireturn
   }

   public boolean F(byte[] var1, S_2_2 var2) throws Exception {
      this.L(var1);
      return this.c(null, var2);
   }

   public void Z() throws Exception {
      this.C.M();
      this.B((byte)1, 5);
      this.G.u(3);
      this.T().O(this.C, this, c(14931, 8638651301632202965L));
   }

   public void m(byte[] var1) throws Exception {
      this.p((byte)c(28906, 4288491440958247544L), var1);
   }

   public void d(byte[] var1) throws Exception {
      this.p((byte)c(15233, 6840930663707760897L), var1);
   }

   public void G(byte[] var1) throws Exception {
      this.Y((byte)0, var1, c(10317, 12148));
   }

   public void w(byte[] var1) throws Exception {
      this.p((byte)c(12265, 4051645934443023694L), var1);
   }

   public void B(byte[] var1) throws Exception {
      this.p((byte)c(2125, 1948715921237175036L), var1);
   }

   public void t(byte[] var1, C_p_2 var2) throws Exception {
      this.C.M();
      this.B((byte)c(14931, 8638651301632202965L), c(14931, 8638651301632202965L) + var1.length + var2.u$int());
      this.G.u(this.f++);
      this.G.q(var1);
      var2.c(this.G);
      this.T().O(this.C, this, c(14931, 8638651301632202965L) + var1.length + var2.u$int() + 4);
   }

   public void v(byte[] var1) throws Exception {
      this.p((byte)c(31176, 7275538956556606279L), var1);
   }

   public void d(byte[] param1, C_p_2 param2) throws Exception {
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
      // 04: getfield com/finalshell/core/DY3.C Lcom/finalshell/core/YU;
      // 07: invokevirtual com/finalshell/core/YU.M ()V
      // 0a: istore 3
      // 0b: aload 0
      // 0c: sipush 28627
      // 0f: ldc2_w 2678128139666066788
      // 12: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 15: sipush 20697
      // 18: ldc2_w 1092039400105095768
      // 1b: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 1e: aload 1
      // 1f: arraylength
      // 20: iadd
      // 21: aload 2
      // 22: iload 3
      // 23: ifeq 31
      // 26: ifnull 37
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: aload 2
      // 31: invokevirtual com/finalshell/core/C_p_2.u$int ()I
      // 34: goto 38
      // 37: bipush 4
      // 38: iadd
      // 39: invokespecial com/finalshell/core/DY3.B (BI)V
      // 3c: aload 0
      // 3d: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 40: aload 0
      // 41: dup
      // 42: getfield com/finalshell/core/DY3.f I
      // 45: dup_x1
      // 46: bipush 1
      // 47: iadd
      // 48: putfield com/finalshell/core/DY3.f I
      // 4b: invokevirtual com/finalshell/core/UJ.u (I)V
      // 4e: aload 0
      // 4f: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 52: iload 3
      // 53: ifeq 83
      // 56: aload 1
      // 57: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 5a: aload 2
      // 5b: ifnull 78
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64: athrow
      // 65: aload 2
      // 66: aload 0
      // 67: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 6a: invokevirtual com/finalshell/core/C_p_2.c (Lcom/finalshell/core/UJ;)V
      // 6d: iload 3
      // 6e: ifne 87
      // 71: goto 78
      // 74: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: aload 0
      // 79: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 7c: goto 83
      // 7f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 82: athrow
      // 83: bipush 0
      // 84: invokevirtual com/finalshell/core/UJ.u (I)V
      // 87: aload 0
      // 88: invokevirtual com/finalshell/core/DY3.T ()Lcom/finalshell/crypto/ConnectHost;
      // 8b: aload 0
      // 8c: getfield com/finalshell/core/DY3.C Lcom/finalshell/core/YU;
      // 8f: aload 0
      // 90: sipush 14931
      // 93: ldc2_w 8638651301632202965
      // 96: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 99: aload 1
      // 9a: arraylength
      // 9b: iadd
      // 9c: aload 2
      // 9d: iload 3
      // 9e: ifeq ac
      // a1: ifnull b2
      // a4: goto ab
      // a7: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // aa: athrow
      // ab: aload 2
      // ac: invokevirtual com/finalshell/core/C_p_2.u$int ()I
      // af: goto b3
      // b2: bipush 4
      // b3: iadd
      // b4: bipush 4
      // b5: iadd
      // b6: invokevirtual com/finalshell/crypto/ConnectHost.O (Lcom/finalshell/core/YU;Lcom/finalshell/core/Dm4;I)V
      // b9: return
   }

   public void r(byte[] var1) throws Exception {
      this.p((byte)c(11365, 4953227819788619484L), var1);
   }

   public void O(byte[] var1, byte[] var2) throws Exception {
      this.Z((byte)c(11086, 4848841866803726828L), var1, var2);
   }

   public void T(byte[] var1, byte[] var2) throws Exception {
      this.E((byte)0, var1, var2, c(10359, -20651));
   }

   public void b(byte[] var1) throws Exception {
      this.p((byte)c(5285, 1064785985990915605L), var1);
   }

   public void I(byte[] var1) throws Exception {
      this.p((byte)c(10805, 1022237448686815375L), var1);
   }

   public void Z(byte[] var1) throws Exception {
      this.p((byte)c(12800, 356559676760707216L), var1);
   }

   public void E(byte[] var1, byte[] var2) throws Exception {
      DY3 var10000;
      int var10001;
      byte[] var10002;
      byte[] var10003;
      String var10004;
      label16: {
         try {
            var10000 = this;
            var10001 = c(14336, 7548703057316764321L);
            var10002 = var1;
            var10003 = var2;
            if (this.n) {
               var10004 = c(10318, 30491);
               break label16;
            }
         } catch (Exception var3) {
            throw a(var3);
         }

         var10004 = null;
      }

      var10000.E((byte)var10001, var10002, var10003, var10004);
   }

   public void L(byte[] var1) throws Exception {
      this.p((byte)4, var1);
   }

   public void k(byte[] var1) throws Exception {
      this.C(var1, 1);
   }

   public void u(byte[] var1) throws Exception {
      this.C(var1, c(14290, 7809705418472215927L));
   }

   public void y(byte[] var1) throws Exception {
      this.C(var1, c(24462, 898171249510333706L));
   }

   public void C(byte[] var1, int var2) throws Exception {
      this.C.M();
      this.B((byte)3, c(15233, 6840930663707760897L) + var1.length);
      this.G.u(this.f++);
      this.G.q(var1);
      this.G.u(var2);
      this.G.u(0);
      this.T().O(this.C, this, c(15233, 6840930663707760897L) + var1.length + 4);
   }

   public void p(byte var1, byte[] var2) throws Exception {
      this.Y(var1, var2, (String)null);
   }

   public void Y(byte param1, byte[] param2, String param3) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: sipush 14931
      // 03: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 06: aload 0
      // 07: getfield com/finalshell/core/DY3.C Lcom/finalshell/core/YU;
      // 0a: invokevirtual com/finalshell/core/YU.M ()V
      // 0d: istore 4
      // 0f: ldc2_w 8638651301632202965
      // 12: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 15: aload 2
      // 16: arraylength
      // 17: iadd
      // 18: istore 5
      // 1a: iload 4
      // 1c: ifne 7b
      // 1f: aload 3
      // 20: ifnonnull 4f
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 0
      // 2b: iload 1
      // 2c: iload 5
      // 2e: invokespecial com/finalshell/core/DY3.B (BI)V
      // 31: aload 0
      // 32: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 35: aload 0
      // 36: dup
      // 37: getfield com/finalshell/core/DY3.f I
      // 3a: dup_x1
      // 3b: bipush 1
      // 3c: iadd
      // 3d: putfield com/finalshell/core/DY3.f I
      // 40: invokevirtual com/finalshell/core/UJ.u (I)V
      // 43: iload 4
      // 45: ifeq 86
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: iload 5
      // 51: bipush 4
      // 52: aload 3
      // 53: invokevirtual java/lang/String.length ()I
      // 56: iadd
      // 57: iadd
      // 58: istore 5
      // 5a: aload 0
      // 5b: sipush 24203
      // 5e: ldc2_w 2810375782177586216
      // 61: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 64: iload 5
      // 66: invokespecial com/finalshell/core/DY3.B (BI)V
      // 69: aload 0
      // 6a: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 6d: aload 0
      // 6e: dup
      // 6f: getfield com/finalshell/core/DY3.f I
      // 72: dup_x1
      // 73: bipush 1
      // 74: iadd
      // 75: putfield com/finalshell/core/DY3.f I
      // 78: invokevirtual com/finalshell/core/UJ.u (I)V
      // 7b: aload 0
      // 7c: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 7f: aload 3
      // 80: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 83: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 86: aload 0
      // 87: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 8a: aload 2
      // 8b: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 8e: aload 0
      // 8f: invokevirtual com/finalshell/core/DY3.T ()Lcom/finalshell/crypto/ConnectHost;
      // 92: aload 0
      // 93: getfield com/finalshell/core/DY3.C Lcom/finalshell/core/YU;
      // 96: aload 0
      // 97: iload 5
      // 99: bipush 4
      // 9a: iadd
      // 9b: invokevirtual com/finalshell/crypto/ConnectHost.O (Lcom/finalshell/core/YU;Lcom/finalshell/core/Dm4;I)V
      // 9e: return
   }

   public void Z(byte var1, byte[] var2, byte[] var3) throws Exception {
      this.E(var1, var2, var3, null);
   }

   public void E(byte param1, byte[] param2, byte[] param3, String param4) throws Exception {
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
      // 04: getfield com/finalshell/core/DY3.C Lcom/finalshell/core/YU;
      // 07: invokevirtual com/finalshell/core/YU.M ()V
      // 0a: sipush 31176
      // 0d: ldc2_w 7275538956556606279
      // 10: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 13: aload 2
      // 14: arraylength
      // 15: iadd
      // 16: aload 3
      // 17: arraylength
      // 18: iadd
      // 19: istore 6
      // 1b: istore 5
      // 1d: iload 5
      // 1f: ifne 80
      // 22: aload 4
      // 24: ifnonnull 53
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 0
      // 2f: iload 1
      // 30: iload 6
      // 32: invokespecial com/finalshell/core/DY3.B (BI)V
      // 35: aload 0
      // 36: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 39: aload 0
      // 3a: dup
      // 3b: getfield com/finalshell/core/DY3.f I
      // 3e: dup_x1
      // 3f: bipush 1
      // 40: iadd
      // 41: putfield com/finalshell/core/DY3.f I
      // 44: invokevirtual com/finalshell/core/UJ.u (I)V
      // 47: iload 5
      // 49: ifeq 8c
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52: athrow
      // 53: iload 6
      // 55: bipush 4
      // 56: aload 4
      // 58: invokevirtual java/lang/String.length ()I
      // 5b: iadd
      // 5c: iadd
      // 5d: istore 6
      // 5f: aload 0
      // 60: sipush 238
      // 63: ldc2_w 2378073910955270759
      // 66: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 69: iload 6
      // 6b: invokespecial com/finalshell/core/DY3.B (BI)V
      // 6e: aload 0
      // 6f: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 72: aload 0
      // 73: dup
      // 74: getfield com/finalshell/core/DY3.f I
      // 77: dup_x1
      // 78: bipush 1
      // 79: iadd
      // 7a: putfield com/finalshell/core/DY3.f I
      // 7d: invokevirtual com/finalshell/core/UJ.u (I)V
      // 80: aload 0
      // 81: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 84: aload 4
      // 86: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 89: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 8c: aload 0
      // 8d: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 90: aload 2
      // 91: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 94: aload 0
      // 95: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 98: aload 3
      // 99: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 9c: aload 0
      // 9d: invokevirtual com/finalshell/core/DY3.T ()Lcom/finalshell/crypto/ConnectHost;
      // a0: aload 0
      // a1: getfield com/finalshell/core/DY3.C Lcom/finalshell/core/YU;
      // a4: aload 0
      // a5: iload 6
      // a7: bipush 4
      // a8: iadd
      // a9: invokevirtual com/finalshell/crypto/ConnectHost.O (Lcom/finalshell/core/YU;Lcom/finalshell/core/Dm4;I)V
      // ac: return
   }

   public int c(byte[] param1, long param2, byte[] param4, int param5, int param6) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 6
      // 002: istore 8
      // 004: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 007: aload 0
      // 008: getfield com/finalshell/core/DY3.i Lcom/finalshell/core/YU;
      // 00b: invokevirtual com/finalshell/core/YU.M ()V
      // 00e: istore 7
      // 010: aload 0
      // 011: invokevirtual com/finalshell/core/DY3.T ()Lcom/finalshell/crypto/ConnectHost;
      // 014: astore 9
      // 016: aload 9
      // 018: invokevirtual com/finalshell/crypto/ConnectHost.D ()I
      // 01b: istore 10
      // 01d: aload 0
      // 01e: getfield com/finalshell/core/DY3.W Lcom/finalshell/core/UJ;
      // 021: getfield com/finalshell/core/UJ.g [B
      // 024: iload 7
      // 026: ifne 0d9
      // 029: arraylength
      // 02a: aload 0
      // 02b: getfield com/finalshell/core/DY3.W Lcom/finalshell/core/UJ;
      // 02e: getfield com/finalshell/core/UJ.X I
      // 031: sipush 26010
      // 034: ldc2_w 3126894702738999087
      // 037: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 03a: iadd
      // 03b: sipush 24147
      // 03e: ldc2_w 284199046114589945
      // 041: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 044: iadd
      // 045: aload 1
      // 046: arraylength
      // 047: iadd
      // 048: iload 6
      // 04a: iadd
      // 04b: iload 10
      // 04d: iadd
      // 04e: if_icmpge 084
      // 051: goto 058
      // 054: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 057: athrow
      // 058: aload 0
      // 059: getfield com/finalshell/core/DY3.W Lcom/finalshell/core/UJ;
      // 05c: getfield com/finalshell/core/UJ.g [B
      // 05f: arraylength
      // 060: aload 0
      // 061: getfield com/finalshell/core/DY3.W Lcom/finalshell/core/UJ;
      // 064: getfield com/finalshell/core/UJ.X I
      // 067: sipush 31176
      // 06a: ldc2_w 7275538956556606279
      // 06d: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 070: iadd
      // 071: sipush 2095
      // 074: ldc2_w 6387013520474958520
      // 077: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 07a: iadd
      // 07b: aload 1
      // 07c: arraylength
      // 07d: iadd
      // 07e: iload 10
      // 080: iadd
      // 081: isub
      // 082: istore 8
      // 084: aload 0
      // 085: aload 0
      // 086: getfield com/finalshell/core/DY3.W Lcom/finalshell/core/UJ;
      // 089: sipush 20150
      // 08c: ldc2_w 4398024867102338109
      // 08f: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 092: sipush 2095
      // 095: ldc2_w 6387013520474958520
      // 098: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 09b: aload 1
      // 09c: arraylength
      // 09d: iadd
      // 09e: iload 8
      // 0a0: iadd
      // 0a1: invokespecial com/finalshell/core/DY3.h (Lcom/finalshell/core/UJ;BI)V
      // 0a4: aload 0
      // 0a5: getfield com/finalshell/core/DY3.W Lcom/finalshell/core/UJ;
      // 0a8: aload 0
      // 0a9: dup
      // 0aa: getfield com/finalshell/core/DY3.f I
      // 0ad: dup_x1
      // 0ae: bipush 1
      // 0af: iadd
      // 0b0: putfield com/finalshell/core/DY3.f I
      // 0b3: invokevirtual com/finalshell/core/UJ.u (I)V
      // 0b6: aload 0
      // 0b7: getfield com/finalshell/core/DY3.W Lcom/finalshell/core/UJ;
      // 0ba: aload 1
      // 0bb: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 0be: aload 0
      // 0bf: getfield com/finalshell/core/DY3.W Lcom/finalshell/core/UJ;
      // 0c2: lload 2
      // 0c3: invokevirtual com/finalshell/core/UJ.V (J)V
      // 0c6: aload 0
      // 0c7: getfield com/finalshell/core/DY3.W Lcom/finalshell/core/UJ;
      // 0ca: iload 7
      // 0cc: ifne 10b
      // 0cf: getfield com/finalshell/core/UJ.g [B
      // 0d2: goto 0d9
      // 0d5: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d8: athrow
      // 0d9: aload 4
      // 0db: if_acmpeq 0f7
      // 0de: aload 0
      // 0df: getfield com/finalshell/core/DY3.W Lcom/finalshell/core/UJ;
      // 0e2: aload 4
      // 0e4: iload 5
      // 0e6: iload 8
      // 0e8: invokevirtual com/finalshell/core/UJ.l ([BII)V
      // 0eb: iload 7
      // 0ed: ifeq 110
      // 0f0: goto 0f7
      // 0f3: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: getfield com/finalshell/core/DY3.W Lcom/finalshell/core/UJ;
      // 0fb: iload 8
      // 0fd: invokevirtual com/finalshell/core/UJ.u (I)V
      // 100: aload 0
      // 101: getfield com/finalshell/core/DY3.W Lcom/finalshell/core/UJ;
      // 104: goto 10b
      // 107: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10a: athrow
      // 10b: iload 8
      // 10d: invokevirtual com/finalshell/core/UJ.S (I)V
      // 110: aload 9
      // 112: aload 0
      // 113: getfield com/finalshell/core/DY3.i Lcom/finalshell/core/YU;
      // 116: aload 0
      // 117: sipush 2095
      // 11a: ldc2_w 6387013520474958520
      // 11d: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 120: aload 1
      // 121: arraylength
      // 122: iadd
      // 123: iload 8
      // 125: iadd
      // 126: bipush 4
      // 127: iadd
      // 128: invokevirtual com/finalshell/crypto/ConnectHost.O (Lcom/finalshell/core/YU;Lcom/finalshell/core/Dm4;I)V
      // 12b: iload 8
      // 12d: ireturn
   }

   public void n(byte[] var1, long var2, int var4) throws Exception {
      this.b(var1, var2, var4, null);
   }

   public void b(byte[] var1, long var2, int var4, Y4 var5) throws Exception {
      int var8;
      this.C.M();
      boolean var10000 = Dm4.F$boolean();
      this.B((byte)5, c(2095, 6387013520474958520L) + var1.length);
      this.G.u(this.f++);
      this.G.q(var1);
      this.G.V(var2);
      this.G.u(var4);
      boolean var6 = var10000;

      label20: {
         try {
            this.T().O(this.C, this, c(2095, 6387013520474958520L) + var1.length + 4);
            var8 = var5;
            if (!var6) {
               break label20;
            }

            if (var5 == null) {
               return;
            }
         } catch (Exception var7) {
            throw a(var7);
         }

         var8 = var5;
      }

      var8.Y(this.f - 1, var2, var4);
   }

   public void h(UJ var1, byte var2, int var3) throws Exception {
      var1.V((byte)c(24830, 474644538712687208L));
      var1.u(this.V);
      var1.u(var3 + 4);
      var1.u(var3);
      var1.V(var2);
   }

   public void B(byte var1, int var2) throws Exception {
      this.h(this.G, var1, var2);
   }

   public Vector k$Vector(String param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: new java/util/Vector
      // 006: dup
      // 007: invokespecial java/util/Vector.<init> ()V
      // 00a: astore 3
      // 00b: bipush 0
      // 00c: istore 4
      // 00e: istore 2
      // 00f: aload 1
      // 010: sipush 1452
      // 013: ldc2_w 3411373113395504906
      // 016: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 019: invokevirtual java/lang/String.lastIndexOf (I)I
      // 01c: istore 5
      // 01e: iload 2
      // 01f: ifeq 03d
      // 022: iload 5
      // 024: ifge 03f
      // 027: goto 02e
      // 02a: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02d: athrow
      // 02e: aload 3
      // 02f: aload 1
      // 030: invokestatic com/finalshell/core/E8.v (Ljava/lang/String;)Ljava/lang/String;
      // 033: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 036: goto 03d
      // 039: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: aload 3
      // 03e: areturn
      // 03f: aload 1
      // 040: bipush 0
      // 041: iload 5
      // 043: iload 2
      // 044: ifeq 052
      // 047: ifne 055
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 050: athrow
      // 051: bipush 1
      // 052: goto 057
      // 055: iload 5
      // 057: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 05a: astore 6
      // 05c: aload 1
      // 05d: iload 5
      // 05f: bipush 1
      // 060: iadd
      // 061: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 064: astore 7
      // 066: aload 6
      // 068: invokestatic com/finalshell/core/E8.v (Ljava/lang/String;)Ljava/lang/String;
      // 06b: astore 6
      // 06d: aconst_null
      // 06e: astore 8
      // 070: bipush 1
      // 071: anewarray 667
      // 074: astore 9
      // 076: aload 0
      // 077: aload 7
      // 079: aload 9
      // 07b: invokespecial com/finalshell/core/DY3.n (Ljava/lang/String;[[B)Z
      // 07e: istore 10
      // 080: iload 10
      // 082: iload 2
      // 083: ifeq 0aa
      // 086: ifne 0e8
      // 089: goto 090
      // 08c: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: aload 6
      // 092: iload 2
      // 093: ifeq 0c9
      // 096: goto 09d
      // 099: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: ldc_w "/"
      // 0a0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a3: goto 0aa
      // 0a6: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: ifne 0cb
      // 0ad: new java/lang/StringBuilder
      // 0b0: dup
      // 0b1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b4: aload 6
      // 0b6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b9: ldc_w "/"
      // 0bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c2: goto 0c9
      // 0c5: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c8: athrow
      // 0c9: astore 6
      // 0cb: aload 3
      // 0cc: new java/lang/StringBuilder
      // 0cf: dup
      // 0d0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d3: aload 6
      // 0d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d8: aload 7
      // 0da: invokestatic com/finalshell/core/E8.v (Ljava/lang/String;)Ljava/lang/String;
      // 0dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e3: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 0e6: aload 3
      // 0e7: areturn
      // 0e8: aload 9
      // 0ea: bipush 0
      // 0eb: aaload
      // 0ec: astore 8
      // 0ee: aload 0
      // 0ef: aload 6
      // 0f1: aload 0
      // 0f2: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 0f5: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 0f8: invokespecial com/finalshell/core/DY3.I ([B)V
      // 0fb: new com/finalshell/core/S_2_2
      // 0fe: dup
      // 0ff: invokespecial com/finalshell/core/S_2_2.<init> ()V
      // 102: astore 11
      // 104: aload 0
      // 105: aload 0
      // 106: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 109: aload 11
      // 10b: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 10e: astore 11
      // 110: aload 11
      // 112: getfield com/finalshell/core/S_2_2.W I
      // 115: istore 12
      // 117: aload 11
      // 119: getfield com/finalshell/core/S_2_2.T I
      // 11c: istore 13
      // 11e: aload 0
      // 11f: aload 0
      // 120: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 123: iload 12
      // 125: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 128: iload 13
      // 12a: sipush 20436
      // 12d: ldc2_w 5788056615437413713
      // 130: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 133: iload 2
      // 134: ifeq 187
      // 137: if_icmpeq 171
      // 13a: goto 141
      // 13d: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 140: athrow
      // 141: iload 13
      // 143: sipush 12002
      // 146: ldc2_w 1941196815231405135
      // 149: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 14c: iload 2
      // 14d: ifeq 187
      // 150: goto 157
      // 153: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 156: athrow
      // 157: if_icmpeq 171
      // 15a: goto 161
      // 15d: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 160: athrow
      // 161: new com/finalshell/core/Dn2_2
      // 164: dup
      // 165: bipush 4
      // 166: ldc_w ""
      // 169: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 16c: athrow
      // 16d: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 170: athrow
      // 171: iload 13
      // 173: iload 2
      // 174: ifeq 198
      // 177: sipush 20436
      // 17a: ldc2_w 5788056615437413713
      // 17d: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 180: goto 187
      // 183: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 186: athrow
      // 187: if_icmpne 1a4
      // 18a: aload 0
      // 18b: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 18e: invokevirtual com/finalshell/core/UJ.d ()I
      // 191: goto 198
      // 194: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 197: athrow
      // 198: istore 4
      // 19a: aload 0
      // 19b: aload 0
      // 19c: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 19f: iload 4
      // 1a1: invokespecial com/finalshell/core/DY3.R (Lcom/finalshell/core/UJ;I)V
      // 1a4: aload 0
      // 1a5: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 1a8: invokevirtual com/finalshell/core/UJ.S ()[B
      // 1ab: astore 14
      // 1ad: aconst_null
      // 1ae: astore 15
      // 1b0: aload 0
      // 1b1: aload 14
      // 1b3: invokespecial com/finalshell/core/DY3.Z ([B)V
      // 1b6: aload 0
      // 1b7: aload 0
      // 1b8: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 1bb: aload 11
      // 1bd: invokespecial com/finalshell/core/DY3.v (Lcom/finalshell/core/UJ;Lcom/finalshell/core/S_2_2;)Lcom/finalshell/core/S_2_2;
      // 1c0: astore 11
      // 1c2: aload 11
      // 1c4: getfield com/finalshell/core/S_2_2.W I
      // 1c7: istore 12
      // 1c9: aload 11
      // 1cb: getfield com/finalshell/core/S_2_2.T I
      // 1ce: istore 13
      // 1d0: iload 13
      // 1d2: sipush 20436
      // 1d5: ldc2_w 5788056615437413713
      // 1d8: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 1db: if_icmpeq 212
      // 1de: iload 13
      // 1e0: sipush 3499
      // 1e3: ldc2_w 7146245346187996948
      // 1e6: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 1e9: iload 2
      // 1ea: ifeq 228
      // 1ed: iload 2
      // 1ee: ifeq 228
      // 1f1: goto 1f8
      // 1f4: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f7: athrow
      // 1f8: if_icmpeq 212
      // 1fb: goto 202
      // 1fe: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 201: athrow
      // 202: new com/finalshell/core/Dn2_2
      // 205: dup
      // 206: bipush 4
      // 207: ldc_w ""
      // 20a: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 20d: athrow
      // 20e: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 211: athrow
      // 212: iload 13
      // 214: iload 2
      // 215: ifeq 266
      // 218: sipush 20436
      // 21b: ldc2_w 5788056615437413713
      // 21e: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 221: goto 228
      // 224: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 227: athrow
      // 228: if_icmpne 240
      // 22b: aload 0
      // 22c: aload 0
      // 22d: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 230: iload 12
      // 232: invokespecial com/finalshell/core/DY3.N (Lcom/finalshell/core/UJ;I)V
      // 235: iload 2
      // 236: ifne 41b
      // 239: goto 240
      // 23c: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23f: athrow
      // 240: aload 0
      // 241: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 244: invokevirtual com/finalshell/core/UJ.a ()V
      // 247: aload 0
      // 248: aload 0
      // 249: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 24c: getfield com/finalshell/core/UJ.g [B
      // 24f: bipush 0
      // 250: bipush 4
      // 251: invokespecial com/finalshell/core/DY3.x ([BII)I
      // 254: pop
      // 255: iinc 12 -4
      // 258: aload 0
      // 259: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 25c: invokevirtual com/finalshell/core/UJ.d ()I
      // 25f: goto 266
      // 262: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 265: athrow
      // 266: istore 16
      // 268: aload 0
      // 269: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 26c: invokevirtual com/finalshell/core/UJ.m ()V
      // 26f: iload 16
      // 271: ifle 417
      // 274: iload 12
      // 276: iload 2
      // 277: ifeq 1d2
      // 27a: iload 2
      // 27b: ifeq 29e
      // 27e: ifle 321
      // 281: goto 288
      // 284: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 287: athrow
      // 288: aload 0
      // 289: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 28c: invokevirtual com/finalshell/core/UJ.f ()V
      // 28f: aload 0
      // 290: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 293: getfield com/finalshell/core/UJ.g [B
      // 296: arraylength
      // 297: goto 29e
      // 29a: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29d: athrow
      // 29e: aload 0
      // 29f: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 2a2: getfield com/finalshell/core/UJ.X I
      // 2a5: iload 12
      // 2a7: iadd
      // 2a8: iload 2
      // 2a9: ifeq 2ce
      // 2ac: if_icmple 2bf
      // 2af: goto 2b6
      // 2b2: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b5: athrow
      // 2b6: iload 12
      // 2b8: goto 2cf
      // 2bb: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2be: athrow
      // 2bf: aload 0
      // 2c0: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 2c3: getfield com/finalshell/core/UJ.g [B
      // 2c6: arraylength
      // 2c7: aload 0
      // 2c8: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 2cb: getfield com/finalshell/core/UJ.X I
      // 2ce: isub
      // 2cf: istore 19
      // 2d1: aload 0
      // 2d2: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 2d5: aload 0
      // 2d6: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 2d9: getfield com/finalshell/core/UJ.g [B
      // 2dc: aload 0
      // 2dd: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 2e0: getfield com/finalshell/core/UJ.X I
      // 2e3: iload 19
      // 2e5: invokevirtual java/io/InputStream.read ([BII)I
      // 2e8: istore 4
      // 2ea: iload 4
      // 2ec: iload 2
      // 2ed: ifeq 31f
      // 2f0: ifgt 305
      // 2f3: goto 2fa
      // 2f6: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f9: athrow
      // 2fa: iload 2
      // 2fb: ifne 417
      // 2fe: goto 305
      // 301: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 304: athrow
      // 305: aload 0
      // 306: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 309: dup
      // 30a: getfield com/finalshell/core/UJ.X I
      // 30d: iload 4
      // 30f: iadd
      // 310: putfield com/finalshell/core/UJ.X I
      // 313: iload 12
      // 315: iload 4
      // 317: isub
      // 318: goto 31f
      // 31b: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31e: athrow
      // 31f: istore 12
      // 321: aload 0
      // 322: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 325: invokevirtual com/finalshell/core/UJ.S ()[B
      // 328: astore 19
      // 32a: aload 0
      // 32b: iload 2
      // 32c: ifeq 347
      // 32f: getfield com/finalshell/core/DY3.fp I
      // 332: bipush 3
      // 333: if_icmpgt 346
      // 336: goto 33d
      // 339: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33c: athrow
      // 33d: aload 0
      // 33e: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 341: invokevirtual com/finalshell/core/UJ.S ()[B
      // 344: astore 17
      // 346: aload 0
      // 347: getfield com/finalshell/core/DY3.G Lcom/finalshell/core/UJ;
      // 34a: invokestatic com/finalshell/core/C_p_2.Z (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/C_p_2;
      // 34d: astore 20
      // 34f: aload 19
      // 351: astore 21
      // 353: aconst_null
      // 354: astore 22
      // 356: bipush 0
      // 357: istore 23
      // 359: aload 0
      // 35a: getfield com/finalshell/core/DY3.fn Z
      // 35d: ifne 375
      // 360: aload 19
      // 362: aload 0
      // 363: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 366: invokestatic com/finalshell/core/E8.y ([BLjava/nio/charset/Charset;)Ljava/lang/String;
      // 369: astore 22
      // 36b: aload 22
      // 36d: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 370: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 373: astore 21
      // 375: aload 8
      // 377: aload 21
      // 379: invokestatic com/finalshell/core/E8.j ([B[B)Z
      // 37c: istore 23
      // 37e: iload 2
      // 37f: ifeq 413
      // 382: iload 23
      // 384: ifeq 410
      // 387: goto 38e
      // 38a: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38d: athrow
      // 38e: aload 22
      // 390: iload 2
      // 391: ifeq 3b2
      // 394: goto 39b
      // 397: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39a: athrow
      // 39b: ifnonnull 3b0
      // 39e: goto 3a5
      // 3a1: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a4: athrow
      // 3a5: aload 19
      // 3a7: aload 0
      // 3a8: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 3ab: invokestatic com/finalshell/core/E8.y ([BLjava/nio/charset/Charset;)Ljava/lang/String;
      // 3ae: astore 22
      // 3b0: aload 15
      // 3b2: iload 2
      // 3b3: ifeq 3c6
      // 3b6: ifnonnull 3f8
      // 3b9: goto 3c0
      // 3bc: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3bf: athrow
      // 3c0: aload 6
      // 3c2: astore 15
      // 3c4: aload 15
      // 3c6: iload 2
      // 3c7: ifeq 3f6
      // 3ca: ldc_w "/"
      // 3cd: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 3d0: ifne 3f8
      // 3d3: goto 3da
      // 3d6: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d9: athrow
      // 3da: new java/lang/StringBuilder
      // 3dd: dup
      // 3de: invokespecial java/lang/StringBuilder.<init> ()V
      // 3e1: aload 15
      // 3e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e6: ldc_w "/"
      // 3e9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ec: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3ef: goto 3f6
      // 3f2: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f5: athrow
      // 3f6: astore 15
      // 3f8: aload 3
      // 3f9: new java/lang/StringBuilder
      // 3fc: dup
      // 3fd: invokespecial java/lang/StringBuilder.<init> ()V
      // 400: aload 15
      // 402: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 405: aload 22
      // 407: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 40a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 40d: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 410: iinc 16 -1
      // 413: iload 2
      // 414: ifne 26f
      // 417: iload 2
      // 418: ifne 1b0
      // 41b: aload 0
      // 41c: aload 14
      // 41e: aload 11
      // 420: invokespecial com/finalshell/core/DY3.F ([BLcom/finalshell/core/S_2_2;)Z
      // 423: ifeq 42c
      // 426: aload 3
      // 427: areturn
      // 428: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42b: athrow
      // 42c: aconst_null
      // 42d: areturn
   }

   public boolean F(byte[] var1) {
      int var10000 = (Dm4.F$boolean()) ? 1 : 0;
      int var3 = var1.length;
      int var4 = 0;
      boolean var2 = ((((boolean)var10000) != 0) != 0) != 0;

      while (true) {
         if (var4 < var3) {
            var10000 = var1[var4];
            if (!var2) {
               return var10000 != 0;
            }

            if (!var2) {
               return var10000 != 0;
            }

            if (var10000 == c(15072, 4602353752174090332L)) {
               break;
            }

            var10000 = var1[var4];
            int var10001 = c(11400, 7727791053168954913L);
            if (var2) {
               if (var10000 == var10001) {
                  break;
               }

               var10000 = var1[var4];
               var10001 = c(31947, 5665867178997030476L);
            }

            label34: {
               if (var2) {
                  if (var10000 != var10001) {
                     break label34;
                  }

                  var10000 = var4 + 1;
                  var10001 = var3;
               }

               if (var10000 < var10001) {
                  var4++;
               }
            }

            var4++;
            if (var2) {
               continue;
            }
         }

         return 0 != 0;
      }

      return 1 != 0;
   }

   public Vector V$Vector(String param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new java/util/Vector
      // 003: dup
      // 004: invokespecial java/util/Vector.<init> ()V
      // 007: astore 3
      // 008: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 00b: aload 1
      // 00c: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 00f: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 012: astore 4
      // 014: istore 2
      // 015: aload 4
      // 017: arraylength
      // 018: bipush 1
      // 019: isub
      // 01a: istore 5
      // 01c: iload 5
      // 01e: iflt 116
      // 021: aload 4
      // 023: iload 5
      // 025: baload
      // 026: iload 2
      // 027: ifeq 07c
      // 02a: sipush 9777
      // 02d: ldc2_w 4096886951296779394
      // 030: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 033: iload 2
      // 034: ifeq 16f
      // 037: goto 03e
      // 03a: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03d: athrow
      // 03e: if_icmpeq 079
      // 041: goto 048
      // 044: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: aload 4
      // 04a: iload 5
      // 04c: baload
      // 04d: iload 2
      // 04e: ifeq 07c
      // 051: goto 058
      // 054: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 057: athrow
      // 058: sipush 28997
      // 05b: ldc2_w 9128947600877294590
      // 05e: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 061: if_icmpeq 079
      // 064: goto 06b
      // 067: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06a: athrow
      // 06b: iinc 5 -1
      // 06e: iload 2
      // 06f: ifne 01c
      // 072: goto 079
      // 075: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 078: athrow
      // 079: getstatic com/finalshell/core/DY3.v Z
      // 07c: iload 2
      // 07d: ifeq 118
      // 080: ifne 116
      // 083: goto 08a
      // 086: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 089: athrow
      // 08a: iload 5
      // 08c: iload 2
      // 08d: ifeq 118
      // 090: goto 097
      // 093: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 096: athrow
      // 097: ifle 116
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a0: athrow
      // 0a1: aload 4
      // 0a3: iload 5
      // 0a5: bipush 1
      // 0a6: isub
      // 0a7: baload
      // 0a8: iload 2
      // 0a9: ifeq 118
      // 0ac: goto 0b3
      // 0af: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b2: athrow
      // 0b3: sipush 31947
      // 0b6: ldc2_w 5665867178997030476
      // 0b9: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 0bc: if_icmpne 116
      // 0bf: goto 0c6
      // 0c2: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: iinc 5 -1
      // 0c9: iload 5
      // 0cb: iload 2
      // 0cc: ifeq 118
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: ifle 116
      // 0d9: goto 0e0
      // 0dc: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0df: athrow
      // 0e0: aload 4
      // 0e2: iload 5
      // 0e4: bipush 1
      // 0e5: isub
      // 0e6: baload
      // 0e7: iload 2
      // 0e8: ifeq 118
      // 0eb: goto 0f2
      // 0ee: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f1: athrow
      // 0f2: sipush 31947
      // 0f5: ldc2_w 5665867178997030476
      // 0f8: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 0fb: if_icmpne 116
      // 0fe: goto 105
      // 101: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 104: athrow
      // 105: iinc 5 -1
      // 108: iinc 5 -1
      // 10b: iload 2
      // 10c: ifne 01c
      // 10f: goto 116
      // 112: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 115: athrow
      // 116: iload 5
      // 118: iload 2
      // 119: ifeq 147
      // 11c: ifge 145
      // 11f: goto 126
      // 122: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125: athrow
      // 126: aload 3
      // 127: getstatic com/finalshell/core/DY3.v Z
      // 12a: ifeq 13c
      // 12d: goto 134
      // 130: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 133: athrow
      // 134: aload 1
      // 135: goto 140
      // 138: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13b: athrow
      // 13c: aload 1
      // 13d: invokestatic com/finalshell/core/E8.v (Ljava/lang/String;)Ljava/lang/String;
      // 140: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 143: aload 3
      // 144: areturn
      // 145: iload 5
      // 147: iflt 1bb
      // 14a: aload 4
      // 14c: iload 5
      // 14e: baload
      // 14f: iload 2
      // 150: ifeq 1bd
      // 153: goto 15a
      // 156: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 159: athrow
      // 15a: iload 2
      // 15b: ifeq 1bd
      // 15e: goto 165
      // 161: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 164: athrow
      // 165: getstatic com/finalshell/core/DY3.fs C
      // 168: goto 16f
      // 16b: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16e: athrow
      // 16f: if_icmpeq 1bb
      // 172: getstatic com/finalshell/core/DY3.v Z
      // 175: iload 2
      // 176: ifeq 196
      // 179: goto 180
      // 17c: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17f: athrow
      // 180: ifeq 1ad
      // 183: goto 18a
      // 186: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 189: athrow
      // 18a: aload 4
      // 18c: iload 5
      // 18e: baload
      // 18f: goto 196
      // 192: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 195: athrow
      // 196: sipush 1452
      // 199: ldc2_w 3411373113395504906
      // 19c: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 19f: if_icmpne 1ad
      // 1a2: iload 2
      // 1a3: ifne 1bb
      // 1a6: goto 1ad
      // 1a9: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ac: athrow
      // 1ad: iinc 5 -1
      // 1b0: iload 2
      // 1b1: ifne 145
      // 1b4: goto 1bb
      // 1b7: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ba: athrow
      // 1bb: iload 5
      // 1bd: iload 2
      // 1be: ifeq 1ec
      // 1c1: ifge 1ea
      // 1c4: goto 1cb
      // 1c7: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ca: athrow
      // 1cb: aload 3
      // 1cc: getstatic com/finalshell/core/DY3.v Z
      // 1cf: ifeq 1e1
      // 1d2: goto 1d9
      // 1d5: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d8: athrow
      // 1d9: aload 1
      // 1da: goto 1e5
      // 1dd: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e0: athrow
      // 1e1: aload 1
      // 1e2: invokestatic com/finalshell/core/E8.v (Ljava/lang/String;)Ljava/lang/String;
      // 1e5: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 1e8: aload 3
      // 1e9: areturn
      // 1ea: iload 5
      // 1ec: iload 2
      // 1ed: ifeq 213
      // 1f0: ifne 20a
      // 1f3: goto 1fa
      // 1f6: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f9: athrow
      // 1fa: bipush 1
      // 1fb: newarray 8
      // 1fd: dup
      // 1fe: bipush 0
      // 1ff: getstatic com/finalshell/core/DY3.fs C
      // 202: i2b
      // 203: bastore
      // 204: astore 6
      // 206: iload 2
      // 207: ifne 222
      // 20a: iload 5
      // 20c: goto 213
      // 20f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 212: athrow
      // 213: newarray 8
      // 215: astore 6
      // 217: aload 4
      // 219: bipush 0
      // 21a: aload 6
      // 21c: bipush 0
      // 21d: iload 5
      // 21f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 222: aload 4
      // 224: arraylength
      // 225: iload 5
      // 227: isub
      // 228: bipush 1
      // 229: isub
      // 22a: newarray 8
      // 22c: astore 7
      // 22e: aload 4
      // 230: iload 5
      // 232: bipush 1
      // 233: iadd
      // 234: aload 7
      // 236: bipush 0
      // 237: aload 7
      // 239: arraylength
      // 23a: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 23d: new java/io/File
      // 240: dup
      // 241: aload 6
      // 243: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 246: invokestatic com/finalshell/core/E8.y ([BLjava/nio/charset/Charset;)Ljava/lang/String;
      // 249: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 24c: invokevirtual java/io/File.list ()[Ljava/lang/String;
      // 24f: astore 8
      // 251: new java/lang/StringBuilder
      // 254: dup
      // 255: invokespecial java/lang/StringBuilder.<init> ()V
      // 258: aload 6
      // 25a: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 25d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 260: getstatic com/finalshell/core/DY3.fy Ljava/lang/String;
      // 263: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 266: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 269: astore 9
      // 26b: bipush 0
      // 26c: istore 10
      // 26e: iload 10
      // 270: aload 8
      // 272: arraylength
      // 273: if_icmpge 2bd
      // 276: iload 2
      // 277: ifeq 2c2
      // 27a: aload 7
      // 27c: aload 8
      // 27e: iload 10
      // 280: aaload
      // 281: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 284: invokestatic com/finalshell/core/E8.t (Ljava/lang/String;Ljava/nio/charset/Charset;)[B
      // 287: invokestatic com/finalshell/core/E8.j ([B[B)Z
      // 28a: ifeq 2b6
      // 28d: goto 294
      // 290: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 293: athrow
      // 294: aload 3
      // 295: new java/lang/StringBuilder
      // 298: dup
      // 299: invokespecial java/lang/StringBuilder.<init> ()V
      // 29c: aload 9
      // 29e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a1: aload 8
      // 2a3: iload 10
      // 2a5: aaload
      // 2a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ac: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 2af: goto 2b6
      // 2b2: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b5: athrow
      // 2b6: iinc 10 1
      // 2b9: iload 2
      // 2ba: ifne 26e
      // 2bd: goto 2c2
      // 2c0: astore 8
      // 2c2: aload 3
      // 2c3: areturn
   }

   public void R(UJ param1, int param2) throws Dn2_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 3
      // 04: aload 0
      // 05: getfield com/finalshell/core/DY3.fp I
      // 08: bipush 3
      // 09: iload 3
      // 0a: ifeq 2e
      // 0d: if_icmplt 48
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: aload 1
      // 18: iload 3
      // 19: ifeq 32
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: invokevirtual com/finalshell/core/UJ.P ()I
      // 26: bipush 4
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: if_icmplt 48
      // 31: aload 1
      // 32: invokevirtual com/finalshell/core/UJ.S ()[B
      // 35: astore 4
      // 37: new com/finalshell/core/Dn2_2
      // 3a: dup
      // 3b: iload 2
      // 3c: aload 4
      // 3e: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 41: invokestatic com/finalshell/core/E8.y ([BLjava/nio/charset/Charset;)Ljava/lang/String;
      // 44: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 47: athrow
      // 48: new com/finalshell/core/Dn2_2
      // 4b: dup
      // 4c: iload 2
      // 4d: sipush 10330
      // 50: sipush 7118
      // 53: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 56: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 59: athrow
   }

   public static boolean r$boolean(String var0) {
      return new File(var0).isAbsolute();
   }

   @Override
   public void r() {
      super.r();
   }

   public boolean n(String var1, byte[][] var2) {
      boolean var10000 = Dm4.F$boolean();
      byte[] var4 = E8.t(var1, StandardCharsets.UTF_8);
      boolean var3 = var10000;
      byte[][] var5 = var2;
      if (var3) {
         if (var2 == null) {
            return this.F(var4);
         }

         var5 = var2;
      }

      var5[0] = var4;
      return this.F(var4);
   }

   public boolean A(String var1) {
      return this.n(var1, null);
   }

   public void N(UJ var1, int var2) throws IOException {
      var1.m();
      this.x(var1.g, 0, var2);
      var1.S(var2);
   }

   public int x(byte[] param1, int param2, int param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: bipush 0
      // 04: istore 5
      // 06: istore 4
      // 08: iload 2
      // 09: istore 6
      // 0b: iload 3
      // 0c: ifle 5c
      // 0f: aload 0
      // 10: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 13: aload 1
      // 14: iload 2
      // 15: iload 3
      // 16: invokevirtual java/io/InputStream.read ([BII)I
      // 19: istore 5
      // 1b: iload 5
      // 1d: iload 4
      // 1f: ifne 60
      // 22: iload 4
      // 24: ifne 56
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: ifgt 4d
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: new java/io/IOException
      // 3b: dup
      // 3c: sipush 10335
      // 3f: sipush 19210
      // 42: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 45: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 48: athrow
      // 49: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: iload 2
      // 4e: iload 5
      // 50: iadd
      // 51: istore 2
      // 52: iload 3
      // 53: iload 5
      // 55: isub
      // 56: istore 3
      // 57: iload 4
      // 59: ifeq 0b
      // 5c: iload 2
      // 5d: iload 6
      // 5f: isub
      // 60: ireturn
   }

   public void s(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: istore 3
      // 04: lload 1
      // 05: lconst_0
      // 06: lcmp
      // 07: ifle 41
      // 0a: aload 0
      // 0b: getfield com/finalshell/core/DY3.U Ljava/io/InputStream;
      // 0e: lload 1
      // 0f: invokevirtual java/io/InputStream.skip (J)J
      // 12: lstore 4
      // 14: lload 4
      // 16: lconst_0
      // 17: iload 3
      // 18: ifne 3b
      // 1b: lcmp
      // 1c: ifgt 31
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: iload 3
      // 27: ifeq 41
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: lload 1
      // 32: lload 4
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: lsub
      // 3c: lstore 1
      // 3d: iload 3
      // 3e: ifeq 04
      // 41: return
   }

   public S_2_2 v(UJ var1, S_2_2 var2) throws IOException {
      var1.a();
      int var3 = this.x(var1.g, 0, c(14931, 8638651301632202965L));
      var2.W = var1.d() - 5;
      var2.T = var1.r() & c(4067, 6401338196938517837L);
      var2.w = var1.d();
      return var2;
   }

   public String L(String param1) throws Dn2_2 {
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
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 2a
      // 09: bipush 0
      // 0a: invokevirtual java/lang/String.charAt (I)C
      // 0d: sipush 1452
      // 10: ldc2_w 3411373113395504906
      // 13: invokestatic com/finalshell/core/DY3.c (IJ)I
      // 16: if_icmpne 26
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 1
      // 21: areturn
      // 22: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 0
      // 27: invokespecial com/finalshell/core/DY3.q ()Ljava/lang/String;
      // 2a: astore 3
      // 2b: aload 3
      // 2c: iload 2
      // 2d: ifeq 6f
      // 30: ldc_w "/"
      // 33: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 36: ifeq 57
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: new java/lang/StringBuilder
      // 43: dup
      // 44: invokespecial java/lang/StringBuilder.<init> ()V
      // 47: aload 3
      // 48: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4b: aload 1
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 52: areturn
      // 53: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: new java/lang/StringBuilder
      // 5a: dup
      // 5b: invokespecial java/lang/StringBuilder.<init> ()V
      // 5e: aload 3
      // 5f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 62: ldc_w "/"
      // 65: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 68: aload 1
      // 69: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6f: areturn
   }

   public String U(String var1) {
      boolean var2 = Dm4.J$boolean();
      boolean var10000 = r$boolean(var1);
      if (!var2) {
         if (var10000) {
            return var1;
         }

         if (var2) {
            return this.T;
         }

         var10000 = this.T.endsWith(fy);
      }

      return var10000 ? this.T + var1 : this.T + fy + var1;
   }

   public String P(String param1) throws Dn2_2, Exception {
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
      // 04: aload 1
      // 05: invokespecial com/finalshell/core/DY3.k$Vector (Ljava/lang/String;)Ljava/util/Vector;
      // 08: astore 3
      // 09: istore 2
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifne 50
      // 0f: invokevirtual java/util/Vector.size ()I
      // 12: bipush 1
      // 13: if_icmpeq 4b
      // 16: goto 1d
      // 19: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: new com/finalshell/core/Dn2_2
      // 20: dup
      // 21: bipush 4
      // 22: new java/lang/StringBuilder
      // 25: dup
      // 26: invokespecial java/lang/StringBuilder.<init> ()V
      // 29: aload 1
      // 2a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d: sipush 10325
      // 30: sipush 3770
      // 33: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 36: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 39: aload 3
      // 3a: invokevirtual java/util/Vector.toString ()Ljava/lang/String;
      // 3d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 40: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 43: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 46: athrow
      // 47: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: aload 3
      // 4c: bipush 0
      // 4d: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 50: checkcast java/lang/String
      // 53: areturn
   }

   public int X$int() throws Dn2_2 {
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
      // 05: invokevirtual com/finalshell/core/DY3.L ()Z
      // 08: iload 1
      // 09: ifne 30
      // 0c: ifne 2c
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: new com/finalshell/core/Dn2_2
      // 19: dup
      // 1a: bipush 4
      // 1b: sipush 10315
      // 1e: sipush 19689
      // 21: invokestatic com/finalshell/core/DY3.c (II)Ljava/lang/String;
      // 24: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 27: athrow
      // 28: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield com/finalshell/core/DY3.fp I
      // 30: ireturn
   }

   @Deprecated
   public void v(String param1) throws Dn2_2 {
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
      // 05: aload 1
      // 06: invokestatic java/nio/charset/Charset.forName (Ljava/lang/String;)Ljava/nio/charset/Charset;
      // 09: invokevirtual com/finalshell/core/DY3.Q (Ljava/nio/charset/Charset;)V
      // 0c: goto 3c
      // 0f: astore 3
      // 10: aload 3
      // 11: iload 2
      // 12: ifne 2a
      // 15: instanceof com/finalshell/core/Dn2_2
      // 18: ifeq 2e
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: aload 3
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: checkcast com/finalshell/core/Dn2_2
      // 2d: athrow
      // 2e: new com/finalshell/core/Dn2_2
      // 31: dup
      // 32: bipush 4
      // 33: aload 3
      // 34: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 37: aload 3
      // 38: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 3b: athrow
      // 3c: return
   }

   public void Q(Charset var1) {
      this.Q = var1;
      this.fn = this.Q.equals(StandardCharsets.UTF_8);
   }

   public String b$String(String var1) {
      boolean var2 = Dm4.F$boolean();
      Object var10000 = this.x;
      if (var2) {
         if (this.x == null) {
            return null;
         }

         var10000 = this.x.get(var1);
      }

      return (String)var10000;
   }

   public String R(String param1) throws Dn2_2 {
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
      // 05: aload 0
      // 06: aload 1
      // 07: invokespecial com/finalshell/core/DY3.L (Ljava/lang/String;)Ljava/lang/String;
      // 0a: invokespecial com/finalshell/core/DY3.r$arrbyte (Ljava/lang/String;)[B
      // 0d: astore 3
      // 0e: aload 3
      // 0f: aload 0
      // 10: getfield com/finalshell/core/DY3.Q Ljava/nio/charset/Charset;
      // 13: invokestatic com/finalshell/core/E8.y ([BLjava/nio/charset/Charset;)Ljava/lang/String;
      // 16: areturn
      // 17: astore 3
      // 18: aload 3
      // 19: iload 2
      // 1a: ifeq 32
      // 1d: instanceof com/finalshell/core/Dn2_2
      // 20: ifeq 36
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 3
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/DY3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: checkcast com/finalshell/core/Dn2_2
      // 35: athrow
      // 36: new com/finalshell/core/Dn2_2
      // 39: dup
      // 3a: bipush 4
      // 3b: aload 3
      // 3c: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 3f: aload 3
      // 40: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;Ljava/lang/Throwable;)V
      // 43: athrow
   }

   @Override
   public void d(String var1, int var2, int var3, int var4, int var5) {
      super.d(var1, var2, var3, var4, var5);
   }

   public void b$void(String var1) {
      super.b(var1);
   }

   @Override
   public void F(int var1, int var2, int var3, int var4) {
      super.F(var1, var2, var3, var4);
   }

   @Override
   public void P(byte[] var1) {
      super.P(var1);
   }

   @Override
   public void u(boolean var1) {
      super.u(var1);
   }

   @Override
   public void C(byte[] var1, byte[] var2) {
      super.C(var1, var2);
   }

   @Override
   public void o(String var1, String var2) {
      super.o(var1, var2);
   }

   @Deprecated
   @Override
   public void F(Hashtable var1) {
      super.F(var1);
   }

   @Override
   public void R(boolean var1) {
      super.R(var1);
   }

   @Override
   public void y(boolean var1) {
      super.y(var1);
   }

   static int X(DY3 var0) {
      return var0.f;
   }

   static int t(DY3 var0, byte[] var1, long var2, byte[] var4, int var5, int var6) throws Exception {
      return var0.c(var1, var2, var4, var5, var6);
   }

   static InputStream P(DY3 var0) {
      return var0.U;
   }

   static boolean q(DY3 var0, int[] var1, S_2_2 var2) throws IOException, Dn2_2 {
      return var0.c(var1, var2);
   }

   static boolean a(DY3 var0, byte[] var1, S_2_2 var2) throws Exception {
      return var0.F(var1, var2);
   }

   static S_2_2 b(DY3 var0, UJ var1, S_2_2 var2) throws IOException {
      return var0.v(var1, var2);
   }

   static void B(DY3 var0, long var1) throws IOException {
      var0.s(var1);
   }

   static UJ Z(DY3 var0) {
      return var0.G;
   }

   static int l(DY3 var0) {
      return var0.fp;
   }

   static Y4 A(DY3 var0) {
      return var0.fB;
   }

   static void U(DY3 var0, byte[] var1, long var2, int var4, Y4 var5) throws Exception {
      var0.b(var1, var2, var4, var5);
   }

   static void N(DY3 var0, UJ var1, int var2) throws IOException {
      var0.N(var1, var2);
   }

   static int z(DY3 var0, byte[] var1, int var2, int var3) throws IOException {
      return var0.x(var1, var2, var3);
   }

   static {
      __vfClinit__();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String c(int var0, int var1) {
      int var2 = (var0 ^ 10320) & 65535;
      if (gb[var2] == null) {
         char[] var3 = eb[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 40;
               break;
            case 1:
               var10000 = 17;
               break;
            case 2:
               var10000 = 167;
               break;
            case 3:
               var10000 = 66;
               break;
            case 4:
               var10000 = 223;
               break;
            case 5:
               var10000 = 91;
               break;
            case 6:
               var10000 = 176;
               break;
            case 7:
               var10000 = 104;
               break;
            case 8:
               var10000 = 169;
               break;
            case 9:
               var10000 = 62;
               break;
            case 10:
               var10000 = 53;
               break;
            case 11:
               var10000 = 124;
               break;
            case 12:
               var10000 = 42;
               break;
            case 13:
               var10000 = 81;
               break;
            case 14:
               var10000 = 75;
               break;
            case 15:
               var10000 = 211;
               break;
            case 16:
               var10000 = 68;
               break;
            case 17:
               var10000 = 113;
               break;
            case 18:
               var10000 = 60;
               break;
            case 19:
               var10000 = 25;
               break;
            case 20:
               var10000 = 131;
               break;
            case 21:
               var10000 = 117;
               break;
            case 22:
               var10000 = 209;
               break;
            case 23:
               var10000 = 222;
               break;
            case 24:
               var10000 = 65;
               break;
            case 25:
               var10000 = 103;
               break;
            case 26:
               var10000 = 175;
               break;
            case 27:
               var10000 = 59;
               break;
            case 28:
               var10000 = 88;
               break;
            case 29:
               var10000 = 10;
               break;
            case 30:
               var10000 = 188;
               break;
            case 31:
               var10000 = 116;
               break;
            case 32:
               var10000 = 71;
               break;
            case 33:
               var10000 = 105;
               break;
            case 34:
               var10000 = 243;
               break;
            case 35:
               var10000 = 184;
               break;
            case 36:
               var10000 = 26;
               break;
            case 37:
               var10000 = 157;
               break;
            case 38:
               var10000 = 22;
               break;
            case 39:
               var10000 = 236;
               break;
            case 40:
               var10000 = 178;
               break;
            case 41:
               var10000 = 39;
               break;
            case 42:
               var10000 = 80;
               break;
            case 43:
               var10000 = 115;
               break;
            case 44:
               var10000 = 86;
               break;
            case 45:
               var10000 = 149;
               break;
            case 46:
               var10000 = 67;
               break;
            case 47:
               var10000 = 152;
               break;
            case 48:
               var10000 = 78;
               break;
            case 49:
               var10000 = 73;
               break;
            case 50:
               var10000 = 214;
               break;
            case 51:
               var10000 = 246;
               break;
            case 52:
               var10000 = 199;
               break;
            case 53:
               var10000 = 242;
               break;
            case 54:
               var10000 = 126;
               break;
            case 55:
               var10000 = 168;
               break;
            case 56:
               var10000 = 252;
               break;
            case 57:
               var10000 = 34;
               break;
            case 58:
               var10000 = 224;
               break;
            case 59:
               var10000 = 135;
               break;
            case 60:
               var10000 = 121;
               break;
            case 61:
               var10000 = 132;
               break;
            case 62:
               var10000 = 30;
               break;
            case 63:
               var10000 = 248;
               break;
            case 64:
               var10000 = 150;
               break;
            case 65:
               var10000 = 36;
               break;
            case 66:
               var10000 = 32;
               break;
            case 67:
               var10000 = 50;
               break;
            case 68:
               var10000 = 247;
               break;
            case 69:
               var10000 = 165;
               break;
            case 70:
               var10000 = 94;
               break;
            case 71:
               var10000 = 179;
               break;
            case 72:
               var10000 = 28;
               break;
            case 73:
               var10000 = 189;
               break;
            case 74:
               var10000 = 250;
               break;
            case 75:
               var10000 = 163;
               break;
            case 76:
               var10000 = 128;
               break;
            case 77:
               var10000 = 52;
               break;
            case 78:
               var10000 = 254;
               break;
            case 79:
               var10000 = 49;
               break;
            case 80:
               var10000 = 183;
               break;
            case 81:
               var10000 = 9;
               break;
            case 82:
               var10000 = 58;
               break;
            case 83:
               var10000 = 1;
               break;
            case 84:
               var10000 = 194;
               break;
            case 85:
               var10000 = 111;
               break;
            case 86:
               var10000 = 228;
               break;
            case 87:
               var10000 = 215;
               break;
            case 88:
               var10000 = 204;
               break;
            case 89:
               var10000 = 146;
               break;
            case 90:
               var10000 = 112;
               break;
            case 91:
               var10000 = 27;
               break;
            case 92:
               var10000 = 229;
               break;
            case 93:
               var10000 = 162;
               break;
            case 94:
               var10000 = 190;
               break;
            case 95:
               var10000 = 47;
               break;
            case 96:
               var10000 = 57;
               break;
            case 97:
               var10000 = 79;
               break;
            case 98:
               var10000 = 237;
               break;
            case 99:
               var10000 = 139;
               break;
            case 100:
               var10000 = 118;
               break;
            case 101:
               var10000 = 249;
               break;
            case 102:
               var10000 = 127;
               break;
            case 103:
               var10000 = 77;
               break;
            case 104:
               var10000 = 221;
               break;
            case 105:
               var10000 = 63;
               break;
            case 106:
               var10000 = 181;
               break;
            case 107:
               var10000 = 255;
               break;
            case 108:
               var10000 = 107;
               break;
            case 109:
               var10000 = 101;
               break;
            case 110:
               var10000 = 13;
               break;
            case 111:
               var10000 = 172;
               break;
            case 112:
               var10000 = 198;
               break;
            case 113:
               var10000 = 171;
               break;
            case 114:
               var10000 = 84;
               break;
            case 115:
               var10000 = 18;
               break;
            case 116:
               var10000 = 24;
               break;
            case 117:
               var10000 = 161;
               break;
            case 118:
               var10000 = 20;
               break;
            case 119:
               var10000 = 69;
               break;
            case 120:
               var10000 = 95;
               break;
            case 121:
               var10000 = 159;
               break;
            case 122:
               var10000 = 158;
               break;
            case 123:
               var10000 = 83;
               break;
            case 124:
               var10000 = 133;
               break;
            case 125:
               var10000 = 37;
               break;
            case 126:
               var10000 = 106;
               break;
            case 127:
               var10000 = 185;
               break;
            case 128:
               var10000 = 119;
               break;
            case 129:
               var10000 = 226;
               break;
            case 130:
               var10000 = 19;
               break;
            case 131:
               var10000 = 109;
               break;
            case 132:
               var10000 = 64;
               break;
            case 133:
               var10000 = 240;
               break;
            case 134:
               var10000 = 85;
               break;
            case 135:
               var10000 = 129;
               break;
            case 136:
               var10000 = 48;
               break;
            case 137:
               var10000 = 8;
               break;
            case 138:
               var10000 = 155;
               break;
            case 139:
               var10000 = 230;
               break;
            case 140:
               var10000 = 31;
               break;
            case 141:
               var10000 = 203;
               break;
            case 142:
               var10000 = 21;
               break;
            case 143:
               var10000 = 219;
               break;
            case 144:
               var10000 = 145;
               break;
            case 145:
               var10000 = 55;
               break;
            case 146:
               var10000 = 3;
               break;
            case 147:
               var10000 = 120;
               break;
            case 148:
               var10000 = 166;
               break;
            case 149:
               var10000 = 231;
               break;
            case 150:
               var10000 = 90;
               break;
            case 151:
               var10000 = 15;
               break;
            case 152:
               var10000 = 51;
               break;
            case 153:
               var10000 = 114;
               break;
            case 154:
               var10000 = 11;
               break;
            case 155:
               var10000 = 195;
               break;
            case 156:
               var10000 = 44;
               break;
            case 157:
               var10000 = 235;
               break;
            case 158:
               var10000 = 232;
               break;
            case 159:
               var10000 = 16;
               break;
            case 160:
               var10000 = 33;
               break;
            case 161:
               var10000 = 220;
               break;
            case 162:
               var10000 = 41;
               break;
            case 163:
               var10000 = 141;
               break;
            case 164:
               var10000 = 82;
               break;
            case 165:
               var10000 = 164;
               break;
            case 166:
               var10000 = 208;
               break;
            case 167:
               var10000 = 160;
               break;
            case 168:
               var10000 = 200;
               break;
            case 169:
               var10000 = 125;
               break;
            case 170:
               var10000 = 193;
               break;
            case 171:
               var10000 = 205;
               break;
            case 172:
               var10000 = 54;
               break;
            case 173:
               var10000 = 233;
               break;
            case 174:
               var10000 = 138;
               break;
            case 175:
               var10000 = 197;
               break;
            case 176:
               var10000 = 216;
               break;
            case 177:
               var10000 = 108;
               break;
            case 178:
               var10000 = 238;
               break;
            case 179:
               var10000 = 239;
               break;
            case 180:
               var10000 = 99;
               break;
            case 181:
               var10000 = 174;
               break;
            case 182:
               var10000 = 153;
               break;
            case 183:
               var10000 = 251;
               break;
            case 184:
               var10000 = 70;
               break;
            case 185:
               var10000 = 186;
               break;
            case 186:
               var10000 = 148;
               break;
            case 187:
               var10000 = 241;
               break;
            case 188:
               var10000 = 56;
               break;
            case 189:
               var10000 = 0;
               break;
            case 190:
               var10000 = 92;
               break;
            case 191:
               var10000 = 76;
               break;
            case 192:
               var10000 = 136;
               break;
            case 193:
               var10000 = 72;
               break;
            case 194:
               var10000 = 96;
               break;
            case 195:
               var10000 = 218;
               break;
            case 196:
               var10000 = 225;
               break;
            case 197:
               var10000 = 35;
               break;
            case 198:
               var10000 = 192;
               break;
            case 199:
               var10000 = 142;
               break;
            case 200:
               var10000 = 187;
               break;
            case 201:
               var10000 = 74;
               break;
            case 202:
               var10000 = 38;
               break;
            case 203:
               var10000 = 6;
               break;
            case 204:
               var10000 = 61;
               break;
            case 205:
               var10000 = 154;
               break;
            case 206:
               var10000 = 12;
               break;
            case 207:
               var10000 = 46;
               break;
            case 208:
               var10000 = 156;
               break;
            case 209:
               var10000 = 206;
               break;
            case 210:
               var10000 = 2;
               break;
            case 211:
               var10000 = 182;
               break;
            case 212:
               var10000 = 102;
               break;
            case 213:
               var10000 = 151;
               break;
            case 214:
               var10000 = 144;
               break;
            case 215:
               var10000 = 212;
               break;
            case 216:
               var10000 = 93;
               break;
            case 217:
               var10000 = 253;
               break;
            case 218:
               var10000 = 7;
               break;
            case 219:
               var10000 = 147;
               break;
            case 220:
               var10000 = 87;
               break;
            case 221:
               var10000 = 29;
               break;
            case 222:
               var10000 = 245;
               break;
            case 223:
               var10000 = 191;
               break;
            case 224:
               var10000 = 177;
               break;
            case 225:
               var10000 = 5;
               break;
            case 226:
               var10000 = 227;
               break;
            case 227:
               var10000 = 123;
               break;
            case 228:
               var10000 = 201;
               break;
            case 229:
               var10000 = 210;
               break;
            case 230:
               var10000 = 122;
               break;
            case 231:
               var10000 = 244;
               break;
            case 232:
               var10000 = 89;
               break;
            case 233:
               var10000 = 196;
               break;
            case 234:
               var10000 = 97;
               break;
            case 235:
               var10000 = 137;
               break;
            case 236:
               var10000 = 234;
               break;
            case 237:
               var10000 = 213;
               break;
            case 238:
               var10000 = 110;
               break;
            case 239:
               var10000 = 170;
               break;
            case 240:
               var10000 = 14;
               break;
            case 241:
               var10000 = 217;
               break;
            case 242:
               var10000 = 23;
               break;
            case 243:
               var10000 = 207;
               break;
            case 244:
               var10000 = 140;
               break;
            case 245:
               var10000 = 4;
               break;
            case 246:
               var10000 = 98;
               break;
            case 247:
               var10000 = 134;
               break;
            case 248:
               var10000 = 202;
               break;
            case 249:
               var10000 = 45;
               break;
            case 250:
               var10000 = 143;
               break;
            case 251:
               var10000 = 130;
               break;
            case 252:
               var10000 = 43;
               break;
            case 253:
               var10000 = 100;
               break;
            case 254:
               var10000 = 180;
               break;
            default:
               var10000 = 173;
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

         gb[var2] = new String(var3).intern();
      }

      return gb[var2];
   }

   public static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25252;
      if (mb[var3] == null) {
         mb[var3] = (int)(lb[var3] ^ var1);
      }

      return mb[var3];
   }

   public static long d(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 10261) & 32767;
      if (pb[var3] == null) {
         pb[var3] = ob[var3] ^ var1;
      }

      return pb[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[41];
      int var19 = 0;
      String var18 = "Òî\u0005úÔ_\u008aT\u0015Ìf\u001b\u0091\tÜ»²<Í\u000b³E¹m\u0089\fâ\u0081ïáAà\u0090\u0006\u0095\u009cáÃ\n\u009eQ\u0003Î\u0083 í\u001f=0¡«fR)6\u0092Üc\u0013W.4ü`µä¾è\u0002DÜÇ}g\rg\u008aÃJFOÿÜðóöé=\u009f»\u008b\u0017WW~%\u001e¥\u0013\u008e²ü\u0082Í9Pã7\u00847\u009f)ÛÏ§åû¦\u0081AÓºz³ÙZ\u0090\u00100W\u0010ò:~ãØó\u0010°\u009bL:Ý®\u0018ý\\ó\u001cP\u0081|hÝä\tÿÊ*Ô¢Ë\u0092âL\u001c:\u0007d\u0013\fÈæJôtVh\u0084ôðÛ%t\u0099·'\u0014Ö\u001e(ë´IðÖNì6\u0097`Z-UÆà'»\u0016\u000e¬Éÿæj\u0019k\u0096ù\u0013\u0018á/,*a\u0013Ç\u0096ö=ô\u0002¨\u008e\u0088Y¹\u001f0\u0013~º\\\u001c\u0007¨@³U\fRL\u0015ñr¼\u0013ý\u008c%¸ï\u008cq\u009b\n¼\u0084)1ö&m\u0015%JS\u001f?ø\rã;\u009fO·E\u008daÔYèQÒ#\u008bx&*ËEÅy\u0084~¼\u0018Íd<`\u00197Ù2Á\u007fÈÅ;«ÓÓÜ\u008b§w8«Ç^×ÉÂ\u0019ú\u008fk\\Çd\u0006Vpç(<g>\u001a\u009a·YÏð\u00826ñ\u001c!\u000f[ü#ú\u008d>v\u0002ã£\u0015\u0010®w\u007f¯,\b_\u009e÷\u000bØ£?¥\u0099½/niÇ\u000f\u001bCup\u0099aiÔ·úÕ©±Îx\u0013SÊ\r\n\u0089|ùiqÔNßòôc§x\u0016=\u0013Vr÷¼\u008e`iS_\u0013p9ß\u0084;£ \u008c-\u000f6ÍÐ¡-[ÿ\u0093e\u0012\u008f´úm\u0011\u000fâXs|\u0006\"|\u0018\u0007\u0015ø\u0090?þ¾\b0¢\u0002ÿ-ò´\u0092\u0011l\u001c¥tp\u0083ÍvÚæ\u009b\u00ad°{Í¯Å$ÿ\u0017Â\u0010(õ½áÅE#óµÝv\u0088\u0089é\u0018ôÙ|_½Ü+R\u009f®\u009e?¾ J>b8Â\u000e¢ø¤5¶µb\u0010êóaxàJÜb´N®éw\u0091Ú\u009fñ\u001cÀY¨\u00063\u0000\u0004¹vj;[|\"\u0093Ë\u001c\u0086¡ï D¼\u0081Ïî¸\u0002\u0014\u0092Z\u0004\u001e\u009b)\u008f¿\u0012ß\u0006W»#\u0012\u00110XÉ\u00028\u009e+)\\Õ¡\u0098'§BR¹v1\u0002c\u0080G?êß}Y\u0003\u001fÍIV×\u0010J/o%\u008f\u001d\u0007þ\u0015É¹p+\u0081\u000bÏCÆüa7%¾z\u0096\u0090\u001dÀåâ\u0085½\u0097ªLv\u000e}cLHXz\u0001äÉn\u0001\u0019Ì¤%b¥¡æ\f\u0087\u0005\u0016-Ø°Û\u008cx\u009dµÙ\u0013úZb¹<À?G\u0095\u0091)iô\u008e^â\u008c¤¸\u0018\u0094UÞ=õ¥ÈìKtÛí\u0090h\u009fê¢\u009bÏm¹\u001e³à\u0018\u008b2uP2\u0082¬©û\u007f)bå\u0092DÈè:ëL\u0086ÇÖÏ\b'Xà q\u0019?ï\u0002\u009cE\rõiÍ\u0093&=2vÚÒ\u00ad\"\u009d\u0011Ìõ\u007f3õs~ôÎ\u0092?8ÓÉ¯±O=§sîé\u0081n`ûêo\u008d\tRØ×\u0000zÓI×{Ý\u008aÇæâíÔ\u0096Û\bº>¨\u0091w\u0016:\u0094®3ñ·Nú\u0006#ßdm\u000f\bËèOjw\u0000i]©\u0005´Ê\u0096Im\u0018\u0089x5\u0019:«\u00ad\u008cÛÛ-öe\u0000T\u009aêp«\u0005\u008eî×ê";
      int var20 = "Òî\u0005úÔ_\u008aT\u0015Ìf\u001b\u0091\tÜ»²<Í\u000b³E¹m\u0089\fâ\u0081ïáAà\u0090\u0006\u0095\u009cáÃ\n\u009eQ\u0003Î\u0083 í\u001f=0¡«fR)6\u0092Üc\u0013W.4ü`µä¾è\u0002DÜÇ}g\rg\u008aÃJFOÿÜðóöé=\u009f»\u008b\u0017WW~%\u001e¥\u0013\u008e²ü\u0082Í9Pã7\u00847\u009f)ÛÏ§åû¦\u0081AÓºz³ÙZ\u0090\u00100W\u0010ò:~ãØó\u0010°\u009bL:Ý®\u0018ý\\ó\u001cP\u0081|hÝä\tÿÊ*Ô¢Ë\u0092âL\u001c:\u0007d\u0013\fÈæJôtVh\u0084ôðÛ%t\u0099·'\u0014Ö\u001e(ë´IðÖNì6\u0097`Z-UÆà'»\u0016\u000e¬Éÿæj\u0019k\u0096ù\u0013\u0018á/,*a\u0013Ç\u0096ö=ô\u0002¨\u008e\u0088Y¹\u001f0\u0013~º\\\u001c\u0007¨@³U\fRL\u0015ñr¼\u0013ý\u008c%¸ï\u008cq\u009b\n¼\u0084)1ö&m\u0015%JS\u001f?ø\rã;\u009fO·E\u008daÔYèQÒ#\u008bx&*ËEÅy\u0084~¼\u0018Íd<`\u00197Ù2Á\u007fÈÅ;«ÓÓÜ\u008b§w8«Ç^×ÉÂ\u0019ú\u008fk\\Çd\u0006Vpç(<g>\u001a\u009a·YÏð\u00826ñ\u001c!\u000f[ü#ú\u008d>v\u0002ã£\u0015\u0010®w\u007f¯,\b_\u009e÷\u000bØ£?¥\u0099½/niÇ\u000f\u001bCup\u0099aiÔ·úÕ©±Îx\u0013SÊ\r\n\u0089|ùiqÔNßòôc§x\u0016=\u0013Vr÷¼\u008e`iS_\u0013p9ß\u0084;£ \u008c-\u000f6ÍÐ¡-[ÿ\u0093e\u0012\u008f´úm\u0011\u000fâXs|\u0006\"|\u0018\u0007\u0015ø\u0090?þ¾\b0¢\u0002ÿ-ò´\u0092\u0011l\u001c¥tp\u0083ÍvÚæ\u009b\u00ad°{Í¯Å$ÿ\u0017Â\u0010(õ½áÅE#óµÝv\u0088\u0089é\u0018ôÙ|_½Ü+R\u009f®\u009e?¾ J>b8Â\u000e¢ø¤5¶µb\u0010êóaxàJÜb´N®éw\u0091Ú\u009fñ\u001cÀY¨\u00063\u0000\u0004¹vj;[|\"\u0093Ë\u001c\u0086¡ï D¼\u0081Ïî¸\u0002\u0014\u0092Z\u0004\u001e\u009b)\u008f¿\u0012ß\u0006W»#\u0012\u00110XÉ\u00028\u009e+)\\Õ¡\u0098'§BR¹v1\u0002c\u0080G?êß}Y\u0003\u001fÍIV×\u0010J/o%\u008f\u001d\u0007þ\u0015É¹p+\u0081\u000bÏCÆüa7%¾z\u0096\u0090\u001dÀåâ\u0085½\u0097ªLv\u000e}cLHXz\u0001äÉn\u0001\u0019Ì¤%b¥¡æ\f\u0087\u0005\u0016-Ø°Û\u008cx\u009dµÙ\u0013úZb¹<À?G\u0095\u0091)iô\u008e^â\u008c¤¸\u0018\u0094UÞ=õ¥ÈìKtÛí\u0090h\u009fê¢\u009bÏm¹\u001e³à\u0018\u008b2uP2\u0082¬©û\u007f)bå\u0092DÈè:ëL\u0086ÇÖÏ\b'Xà q\u0019?ï\u0002\u009cE\rõiÍ\u0093&=2vÚÒ\u00ad\"\u009d\u0011Ìõ\u007f3õs~ôÎ\u0092?8ÓÉ¯±O=§sîé\u0081n`ûêo\u008d\tRØ×\u0000zÓI×{Ý\u008aÇæâíÔ\u0096Û\bº>¨\u0091w\u0016:\u0094®3ñ·Nú\u0006#ßdm\u000f\bËèOjw\u0000i]©\u0005´Ê\u0096Im\u0018\u0089x5\u0019:«\u00ad\u008cÛÛ-öe\u0000T\u009aêp«\u0005\u008eî×ê"
         .length();
      char var17 = 2;
      int var25 = -1;

      label86:
      while (true) {
         byte var10000 = 50;
         String var10001 = var18.substring(++var25, var25 + var17);
         byte var10002 = -1;

         while (true) {
      char[] var43;
            label81: {
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
                     break label81;
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
                        var77 = 42;
                        break;
                     case 1:
                        var77 = 80;
                        break;
                     case 2:
                        var77 = 112;
                        break;
                     case 3:
                        var77 = 2;
                        break;
                     case 4:
                        var77 = 49;
                        break;
                     case 5:
                        var77 = 95;
                        break;
                     default:
                        var77 = 33;
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
                     eb = var21;
                     gb = new String[41];
                     long var8 = 4288877866547856724L;
                     long[] var14 = new long[55];
                     int var11 = 0;
                     String var12 = "7gòi\u0088\u008a*G6\u0096\u008eLlä\u00109èKÃB\u0084ß\"q¡I$\u0083þ¿\b\u001dÑþßÉ\u0014\b§\u0092Ë9p/®Û\u009fçó\u0006í\u0007ê~\f¬»d\u0007$\u0081o\u0006´\u0010\u008aGï\u0092\u0097=rÝÎg\u009fÊb\t}\nëÏK\u009b6(æ\u0089\u000e\u0014\u008d{\f_z#\fÂ\u0007å©½ê0Þ\u0007'Ö\r\u000bJ\u0001\u0005\u008b\u0088í´ù¸\u00116\u0095ã@&\nPSù§=_Ö|ÏÁ`¨ó~QÂv3$w~Oy¡`?nîÇ³XÈ>\u001cÊî[@S³RÞa¿¸\u0005ã¯ '\u009a(ð\f\u0001é\u009b\u009f*\u008eòàd\u0081ü#\u0085\u0004ÓI\u009b\u001d\"¶Ólû\u00159\u0005ÏÈ\u00019Ð\u000fq\u001e\u0014Ò¶q¸\u0091Ì*(õ~×\u009b\u009fYÏY>Z\u0014SJ\u008b\u008b\u0087cheK\u001d\u008a\u008dÐdÐ|róìÖ\u0095|}xª\u001a\u0016øT\u009e\u0015Hö~aè`j\u0087¿¶äÞ\u001d\u0088¶\u0084Ç*\u001c7[D2Kù\u0082§þ\u001cD\u000e\u0018\u0014\u0094S`w\u0005²?Åæ\u008fW\u0019ãÚìÙÙ\f\u001aeïöñü:?\u0000L5z;\u0081ùýå#ñL\u0019¤·v¯ÝT ã\u0081ó\u0017\u008c^\u001e¯\u001a oÙ¬gàâ¸ÛF\u009f}Øûàgõ-Qªê\u0099ðÅ\u0082ì¤féo\u0003w\u0094!\u0003ö\u009aý\u009b\u008fÐØ\"fJ>.\u0091\u0018cL\u0012Gb\u008c\u009aýgÇ\u0018/ùÕs\u0089í2\u0012\u0015È";
                     int var13 = "7gòi\u0088\u008a*G6\u0096\u008eLlä\u00109èKÃB\u0084ß\"q¡I$\u0083þ¿\b\u001dÑþßÉ\u0014\b§\u0092Ë9p/®Û\u009fçó\u0006í\u0007ê~\f¬»d\u0007$\u0081o\u0006´\u0010\u008aGï\u0092\u0097=rÝÎg\u009fÊb\t}\nëÏK\u009b6(æ\u0089\u000e\u0014\u008d{\f_z#\fÂ\u0007å©½ê0Þ\u0007'Ö\r\u000bJ\u0001\u0005\u008b\u0088í´ù¸\u00116\u0095ã@&\nPSù§=_Ö|ÏÁ`¨ó~QÂv3$w~Oy¡`?nîÇ³XÈ>\u001cÊî[@S³RÞa¿¸\u0005ã¯ '\u009a(ð\f\u0001é\u009b\u009f*\u008eòàd\u0081ü#\u0085\u0004ÓI\u009b\u001d\"¶Ólû\u00159\u0005ÏÈ\u00019Ð\u000fq\u001e\u0014Ò¶q¸\u0091Ì*(õ~×\u009b\u009fYÏY>Z\u0014SJ\u008b\u008b\u0087cheK\u001d\u008a\u008dÐdÐ|róìÖ\u0095|}xª\u001a\u0016øT\u009e\u0015Hö~aè`j\u0087¿¶äÞ\u001d\u0088¶\u0084Ç*\u001c7[D2Kù\u0082§þ\u001cD\u000e\u0018\u0014\u0094S`w\u0005²?Åæ\u008fW\u0019ãÚìÙÙ\f\u001aeïöñü:?\u0000L5z;\u0081ùýå#ñL\u0019¤·v¯ÝT ã\u0081ó\u0017\u008c^\u001e¯\u001a oÙ¬gàâ¸ÛF\u009f}Øûàgõ-Qªê\u0099ðÅ\u0082ì¤féo\u0003w\u0094!\u0003ö\u009aý\u009b\u008fÐØ\"fJ>.\u0091\u0018cL\u0012Gb\u008c\u009aýgÇ\u0018/ùÕs\u0089í2\u0012\u0015È"
                        .length();
                     byte var10 = 0;

                     label60:
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
                                    lb = var14;
                                    mb = new Integer[55];
                                    long var0 = 8009986555353751420L;
                                    long[] var6 = new long[2];
                                    int var3 = 0;
                                    String var4 = "÷oCG\u0084&\u0016ÓÓçå$,¡&d";
                                    int var5 = "÷oCG\u0084&\u0016ÓÓçå$,¡&d".length();
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

                                    ob = var6;
                                    pb = new Long[2];
                                    fy = File.separator;
                                    fs = File.separatorChar;
                                    v = (byte)File.separatorChar == c(31442, 3488254898753050716L);
                                    return;
                                 }
                                 break;
                              default:
                                 var27[var35] = var65;
                                 if (var10 < var13) {
                                    continue label60;
                                 }

                                 var12 = "G Æ¹µ¡XÒ\u0010ñúµ¸\u0000W<";
                                 var13 = "G Æ¹µ¡XÒ\u0010ñúµ¸\u0000W<".length();
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
                     continue label86;
                  }

                  var18 = "ÐÉåÅ\u000eû\u0094LØ\bö\u0004\fàMÀrË(Ù\u001f·¤ÉãRïýJ\u0007\u00adÃ\u000e$ò\u0004¼²§õÉ\u008d»U\u0005^\u001d´\u0019\u0002q´";
                  var20 = "ÐÉåÅ\u000eû\u0094LØ\bö\u0004\fàMÀrË(Ù\u001f·¤ÉãRïýJ\u0007\u00adÃ\u000e$ò\u0004¼²§õÉ\u008d»U\u0005^\u001d´\u0019\u0002q´".length();
                  var17 = 20;
                  var25 = -1;
            }

            var10000 = 30;
            var10001 = var18.substring(++var25, var25 + var17);
            var10002 = 0;
         }
      }
   }
}





