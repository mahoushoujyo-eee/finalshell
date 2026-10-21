package com.finalshell.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

public abstract class Ls4 {
   int P = 0;
   public static byte[] v;
   public static byte[] t;
   protected String m = a(14807, 18318);
   Xe2 Q = null;
   protected EU G;
   public Bx2 T;
   public Y_2 u;
   public Y_2 l;
   public I82 x;
   public byte[] F;
   static byte[][] r;
   public static byte[] A;
   protected boolean E = false;
   protected byte[] R = null;
   public byte[] W = null;
   public byte[] Z = null;
   public static String[] S;
   public static String[] ab;
   public static long[] db;
   public static Integer[] eb;

   public static Ls4 B(Xe2 var0, int var1) throws Pc2 {
      return A(var0, var1, a(10822, 6613962286574133603L));
   }

   public static Ls4 A(Xe2 param0, int param1, int param2) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: aconst_null
      // 04: astore 4
      // 06: istore 3
      // 07: iload 1
      // 08: bipush 1
      // 09: iload 3
      // 0a: ifeq 26
      // 0d: if_icmpne 24
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: new com/finalshell/core/L22
      // 1a: dup
      // 1b: aload 0
      // 1c: invokespecial com/finalshell/core/L22.<init> (Lcom/finalshell/core/Xe2;)V
      // 1f: astore 4
      // 21: goto 92
      // 24: iload 1
      // 25: bipush 2
      // 26: iload 3
      // 27: ifeq 43
      // 2a: if_icmpne 41
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: new com/finalshell/core/LW3
      // 37: dup
      // 38: aload 0
      // 39: invokespecial com/finalshell/core/LW3.<init> (Lcom/finalshell/core/Xe2;)V
      // 3c: astore 4
      // 3e: goto 92
      // 41: iload 1
      // 42: bipush 3
      // 43: iload 3
      // 44: ifeq 60
      // 47: if_icmpne 5e
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: new com/finalshell/core/L32
      // 54: dup
      // 55: aload 0
      // 56: invokespecial com/finalshell/core/L32.<init> (Lcom/finalshell/core/Xe2;)V
      // 59: astore 4
      // 5b: goto 92
      // 5e: iload 1
      // 5f: bipush 5
      // 60: iload 3
      // 61: ifeq 85
      // 64: if_icmpne 7b
      // 67: goto 6e
      // 6a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d: athrow
      // 6e: new com/finalshell/core/LC3
      // 71: dup
      // 72: aload 0
      // 73: invokespecial com/finalshell/core/LC3.<init> (Lcom/finalshell/core/Xe2;)V
      // 76: astore 4
      // 78: goto 92
      // 7b: iload 1
      // 7c: sipush 8387
      // 7f: ldc2_w 333182178166074270
      // 82: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 85: if_icmpne 92
      // 88: new com/finalshell/core/Lo4
      // 8b: dup
      // 8c: aload 0
      // 8d: invokespecial com/finalshell/core/Lo4.<init> (Lcom/finalshell/core/Xe2;)V
      // 90: astore 4
      // 92: aload 4
      // 94: iload 3
      // 95: ifeq b1
      // 98: ifnull af
      // 9b: goto a2
      // 9e: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a1: athrow
      // a2: aload 4
      // a4: iload 2
      // a5: invokevirtual com/finalshell/core/Ls4.K (I)V
      // a8: goto af
      // ab: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ae: athrow
      // af: aload 4
      // b1: areturn
   }

   abstract void K(int var1) throws Pc2;

   abstract byte[] Y();

   abstract byte[] d();

   public abstract int r$int();

   public abstract byte[] l(byte[] var1);

   public abstract byte[] e(byte[] var1, String var2);

   public abstract Al2 R();

   public abstract Al2 a$al_2(String var1);

   public abstract byte[] T$arrbyte() throws Pc2;

   public String a$String() {
      return this.m;
   }

   public void a$void(String var1) {
      this.m = var1;
   }

   public Ls4(Xe2 var1) {
      this.Q = var1;
   }

   abstract byte[] r$arrbyte();

   public void L(OutputStream var1) {
      this.Q(var1, null);
   }

   public void Q(OutputStream param1, byte[] param2) {
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
      // 004: aload 2
      // 005: iload 3
      // 006: ifeq 01c
      // 009: ifnonnull 018
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 012: athrow
      // 013: aload 0
      // 014: getfield com/finalshell/core/Ls4.F [B
      // 017: astore 2
      // 018: aload 0
      // 019: invokevirtual com/finalshell/core/Ls4.r$arrbyte ()[B
      // 01c: astore 4
      // 01e: bipush 1
      // 01f: anewarray 133
      // 022: astore 5
      // 024: aload 0
      // 025: aload 4
      // 027: aload 5
      // 029: aload 2
      // 02a: invokespecial com/finalshell/core/Ls4.Q ([B[[B[B)[B
      // 02d: astore 6
      // 02f: aload 6
      // 031: iload 3
      // 032: ifeq 051
      // 035: aload 4
      // 037: if_acmpeq 04d
      // 03a: goto 041
      // 03d: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 040: athrow
      // 041: aload 4
      // 043: invokestatic com/finalshell/core/E8.Q ([B)V
      // 046: goto 04d
      // 049: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04c: athrow
      // 04d: aload 5
      // 04f: bipush 0
      // 050: aaload
      // 051: astore 7
      // 053: aload 6
      // 055: bipush 0
      // 056: aload 6
      // 058: arraylength
      // 059: bipush 1
      // 05a: invokestatic com/finalshell/core/E8.V ([BIIZ)[B
      // 05d: astore 8
      // 05f: aload 1
      // 060: aload 0
      // 061: invokevirtual com/finalshell/core/Ls4.Y ()[B
      // 064: invokevirtual java/io/OutputStream.write ([B)V
      // 067: aload 1
      // 068: getstatic com/finalshell/core/Ls4.t [B
      // 06b: invokevirtual java/io/OutputStream.write ([B)V
      // 06e: iload 3
      // 06f: ifeq 09d
      // 072: aload 2
      // 073: ifnull 0f8
      // 076: goto 07d
      // 079: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07c: athrow
      // 07d: aload 1
      // 07e: getstatic com/finalshell/core/Ls4.r [[B
      // 081: bipush 0
      // 082: aaload
      // 083: invokevirtual java/io/OutputStream.write ([B)V
      // 086: aload 1
      // 087: getstatic com/finalshell/core/Ls4.t [B
      // 08a: invokevirtual java/io/OutputStream.write ([B)V
      // 08d: aload 1
      // 08e: getstatic com/finalshell/core/Ls4.r [[B
      // 091: bipush 1
      // 092: aaload
      // 093: invokevirtual java/io/OutputStream.write ([B)V
      // 096: goto 09d
      // 099: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09c: athrow
      // 09d: bipush 0
      // 09e: istore 9
      // 0a0: iload 9
      // 0a2: aload 7
      // 0a4: arraylength
      // 0a5: if_icmpge 0ea
      // 0a8: aload 1
      // 0a9: aload 7
      // 0ab: iload 9
      // 0ad: baload
      // 0ae: bipush 4
      // 0af: iushr
      // 0b0: sipush 21394
      // 0b3: ldc2_w 2338689909883279498
      // 0b6: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0b9: iand
      // 0ba: i2b
      // 0bb: invokestatic com/finalshell/core/Ls4.o (B)B
      // 0be: invokevirtual java/io/OutputStream.write (I)V
      // 0c1: aload 1
      // 0c2: aload 7
      // 0c4: iload 9
      // 0c6: baload
      // 0c7: sipush 21394
      // 0ca: ldc2_w 2338689909883279498
      // 0cd: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0d0: iand
      // 0d1: i2b
      // 0d2: invokestatic com/finalshell/core/Ls4.o (B)B
      // 0d5: invokevirtual java/io/OutputStream.write (I)V
      // 0d8: iinc 9 1
      // 0db: iload 3
      // 0dc: ifeq 0f1
      // 0df: iload 3
      // 0e0: ifne 0a0
      // 0e3: goto 0ea
      // 0e6: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9: athrow
      // 0ea: aload 1
      // 0eb: getstatic com/finalshell/core/Ls4.t [B
      // 0ee: invokevirtual java/io/OutputStream.write ([B)V
      // 0f1: aload 1
      // 0f2: getstatic com/finalshell/core/Ls4.t [B
      // 0f5: invokevirtual java/io/OutputStream.write ([B)V
      // 0f8: bipush 0
      // 0f9: istore 9
      // 0fb: iload 9
      // 0fd: aload 8
      // 0ff: arraylength
      // 100: if_icmpge 15e
      // 103: iload 3
      // 104: ifeq 16d
      // 107: iload 9
      // 109: sipush 26031
      // 10c: ldc2_w 8895145466325511915
      // 10f: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 112: iadd
      // 113: aload 8
      // 115: arraylength
      // 116: if_icmpge 146
      // 119: goto 120
      // 11c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11f: athrow
      // 120: aload 1
      // 121: aload 8
      // 123: iload 9
      // 125: sipush 22829
      // 128: ldc2_w 1786670457775559199
      // 12b: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 12e: invokevirtual java/io/OutputStream.write ([BII)V
      // 131: aload 1
      // 132: getstatic com/finalshell/core/Ls4.t [B
      // 135: invokevirtual java/io/OutputStream.write ([B)V
      // 138: iinc 9 64
      // 13b: iload 3
      // 13c: ifne 0fb
      // 13f: goto 146
      // 142: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 145: athrow
      // 146: aload 1
      // 147: aload 8
      // 149: iload 9
      // 14b: aload 8
      // 14d: arraylength
      // 14e: iload 9
      // 150: isub
      // 151: invokevirtual java/io/OutputStream.write ([BII)V
      // 154: aload 1
      // 155: getstatic com/finalshell/core/Ls4.t [B
      // 158: invokevirtual java/io/OutputStream.write ([B)V
      // 15b: goto 15e
      // 15e: aload 1
      // 15f: aload 0
      // 160: invokevirtual com/finalshell/core/Ls4.d ()[B
      // 163: invokevirtual java/io/OutputStream.write ([B)V
      // 166: aload 1
      // 167: getstatic com/finalshell/core/Ls4.t [B
      // 16a: invokevirtual java/io/OutputStream.write ([B)V
      // 16d: goto 1ac
      // 170: astore 9
      // 172: aload 0
      // 173: getfield com/finalshell/core/Ls4.Q Lcom/finalshell/core/Xe2;
      // 176: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 179: bipush 3
      // 17a: iload 3
      // 17b: ifeq 19c
      // 17e: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 183: ifeq 1ac
      // 186: goto 18d
      // 189: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18c: athrow
      // 18d: aload 0
      // 18e: getfield com/finalshell/core/Ls4.Q Lcom/finalshell/core/Xe2;
      // 191: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 194: bipush 3
      // 195: goto 19c
      // 198: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19b: athrow
      // 19c: sipush 14781
      // 19f: sipush 5874
      // 1a2: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 1a5: aload 9
      // 1a7: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 1ac: return
   }

   abstract byte[] A();

   public abstract int y();

   public String T$String() {
      return E8.B(this.A());
   }

   public byte[] O() {
      return this.Z;
   }

   public void e(OutputStream param1, String param2) {
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
      // 04: invokevirtual com/finalshell/core/Ls4.O ()[B
      // 07: astore 4
      // 09: istore 3
      // 0a: aload 4
      // 0c: bipush 0
      // 0d: aload 4
      // 0f: arraylength
      // 10: bipush 1
      // 11: invokestatic com/finalshell/core/E8.V ([BIIZ)[B
      // 14: astore 5
      // 16: aload 1
      // 17: aload 0
      // 18: invokevirtual com/finalshell/core/Ls4.A ()[B
      // 1b: invokevirtual java/io/OutputStream.write ([B)V
      // 1e: aload 1
      // 1f: getstatic com/finalshell/core/Ls4.A [B
      // 22: invokevirtual java/io/OutputStream.write ([B)V
      // 25: aload 1
      // 26: aload 5
      // 28: bipush 0
      // 29: aload 5
      // 2b: arraylength
      // 2c: invokevirtual java/io/OutputStream.write ([BII)V
      // 2f: aload 1
      // 30: getstatic com/finalshell/core/Ls4.A [B
      // 33: invokevirtual java/io/OutputStream.write ([B)V
      // 36: aload 1
      // 37: aload 2
      // 38: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 3b: invokevirtual java/io/OutputStream.write ([B)V
      // 3e: aload 1
      // 3f: getstatic com/finalshell/core/Ls4.t [B
      // 42: invokevirtual java/io/OutputStream.write ([B)V
      // 45: goto 84
      // 48: astore 6
      // 4a: aload 0
      // 4b: getfield com/finalshell/core/Ls4.Q Lcom/finalshell/core/Xe2;
      // 4e: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 51: bipush 3
      // 52: iload 3
      // 53: ifne 74
      // 56: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 5b: ifeq 84
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: aload 0
      // 66: getfield com/finalshell/core/Ls4.Q Lcom/finalshell/core/Xe2;
      // 69: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 6c: bipush 3
      // 6d: goto 74
      // 70: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73: athrow
      // 74: sipush 14815
      // 77: sipush -28342
      // 7a: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 7d: aload 6
      // 7f: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 84: return
   }

   public void L(String var1, String var2) throws FileNotFoundException, IOException {
      FileOutputStream var3 = new FileOutputStream(var1);

      try {
         this.e(var3, var2);
      } catch (Throwable var7) {
         try {
            var3.close();
         } catch (Throwable var6) {
            var7.addSuppressed(var6);
         }

         throw var7;
      }

      var3.close();
   }

   public void X(OutputStream param1, String param2) {
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
      // 004: invokevirtual com/finalshell/core/Ls4.O ()[B
      // 007: astore 4
      // 009: istore 3
      // 00a: aload 4
      // 00c: bipush 0
      // 00d: aload 4
      // 00f: arraylength
      // 010: bipush 1
      // 011: invokestatic com/finalshell/core/E8.V ([BIIZ)[B
      // 014: astore 5
      // 016: aload 1
      // 017: sipush 14836
      // 01a: sipush 5609
      // 01d: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 020: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 023: invokevirtual java/io/OutputStream.write ([B)V
      // 026: aload 1
      // 027: getstatic com/finalshell/core/Ls4.t [B
      // 02a: invokevirtual java/io/OutputStream.write ([B)V
      // 02d: aload 1
      // 02e: new java/lang/StringBuilder
      // 031: dup
      // 032: invokespecial java/lang/StringBuilder.<init> ()V
      // 035: sipush 14796
      // 038: sipush -8641
      // 03b: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 03e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 041: aload 2
      // 042: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 045: ldc "\""
      // 047: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 04d: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 050: invokevirtual java/io/OutputStream.write ([B)V
      // 053: aload 1
      // 054: getstatic com/finalshell/core/Ls4.t [B
      // 057: invokevirtual java/io/OutputStream.write ([B)V
      // 05a: bipush 0
      // 05b: istore 6
      // 05d: iload 6
      // 05f: aload 5
      // 061: arraylength
      // 062: if_icmpge 0b5
      // 065: sipush 16731
      // 068: ldc2_w 5855289576881293903
      // 06b: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 06e: istore 7
      // 070: iload 3
      // 071: ifne 0cb
      // 074: aload 5
      // 076: arraylength
      // 077: iload 6
      // 079: isub
      // 07a: iload 7
      // 07c: iload 3
      // 07d: ifne 0ae
      // 080: goto 087
      // 083: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: if_icmpge 099
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: aload 5
      // 093: arraylength
      // 094: iload 6
      // 096: isub
      // 097: istore 7
      // 099: aload 1
      // 09a: aload 5
      // 09c: iload 6
      // 09e: iload 7
      // 0a0: invokevirtual java/io/OutputStream.write ([BII)V
      // 0a3: aload 1
      // 0a4: getstatic com/finalshell/core/Ls4.t [B
      // 0a7: invokevirtual java/io/OutputStream.write ([B)V
      // 0aa: iload 6
      // 0ac: iload 7
      // 0ae: iadd
      // 0af: istore 6
      // 0b1: iload 3
      // 0b2: ifeq 05d
      // 0b5: aload 1
      // 0b6: sipush 14812
      // 0b9: bipush -71
      // 0bb: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0be: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 0c1: invokevirtual java/io/OutputStream.write ([B)V
      // 0c4: aload 1
      // 0c5: getstatic com/finalshell/core/Ls4.t [B
      // 0c8: invokevirtual java/io/OutputStream.write ([B)V
      // 0cb: goto 10a
      // 0ce: astore 6
      // 0d0: aload 0
      // 0d1: getfield com/finalshell/core/Ls4.Q Lcom/finalshell/core/Xe2;
      // 0d4: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 0d7: bipush 3
      // 0d8: iload 3
      // 0d9: ifne 0fa
      // 0dc: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 0e1: ifeq 10a
      // 0e4: goto 0eb
      // 0e7: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: getfield com/finalshell/core/Ls4.Q Lcom/finalshell/core/Xe2;
      // 0ef: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 0f2: bipush 3
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f9: athrow
      // 0fa: sipush 14832
      // 0fd: sipush 28437
      // 100: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 103: aload 6
      // 105: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 10a: return
   }

   public void P(String var1, String var2) throws FileNotFoundException, IOException {
      FileOutputStream var3 = new FileOutputStream(var1);

      try {
         this.X(var3, var2);
      } catch (Throwable var7) {
         try {
            var3.close();
         } catch (Throwable var6) {
            var7.addSuppressed(var6);
         }

         throw var7;
      }

      var3.close();
   }

   public void F(String var1) throws FileNotFoundException, IOException {
      this.I(var1, null);
   }

   public void I(String var1, byte[] var2) throws FileNotFoundException, IOException {
      FileOutputStream var3 = new FileOutputStream(var1);

      try {
         this.Q(var3, var2);
      } catch (Throwable var7) {
         try {
            var3.close();
         } catch (Throwable var6) {
            var7.addSuppressed(var6);
         }

         throw var7;
      }

      var3.close();
   }

   public String E() {
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
      // 06: ifne 26
      // 09: getfield com/finalshell/core/Ls4.l Lcom/finalshell/core/Y_2;
      // 0c: ifnonnull 25
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: invokespecial com/finalshell/core/Ls4.I ()Lcom/finalshell/core/Y_2;
      // 1b: putfield com/finalshell/core/Ls4.l Lcom/finalshell/core/Y_2;
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 0
      // 26: invokevirtual com/finalshell/core/Ls4.O ()[B
      // 29: astore 2
      // 2a: aload 2
      // 2b: ifnonnull 34
      // 2e: aconst_null
      // 2f: areturn
      // 30: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aload 0
      // 35: getfield com/finalshell/core/Ls4.l Lcom/finalshell/core/Y_2;
      // 38: aload 2
      // 39: bipush 0
      // 3a: bipush 1
      // 3b: invokestatic com/finalshell/core/E8.s (Lcom/finalshell/core/Y_2;[BZZ)Ljava/lang/String;
      // 3e: areturn
   }

   public byte[] Q(byte[] param1, byte[][] param2, byte[] param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: istore 4
      // 005: aload 3
      // 006: iload 4
      // 008: ifeq 016
      // 00b: ifnonnull 017
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014: athrow
      // 015: aload 1
      // 016: areturn
      // 017: aload 0
      // 018: iload 4
      // 01a: ifeq 032
      // 01d: getfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 020: ifnonnull 039
      // 023: goto 02a
      // 026: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 029: athrow
      // 02a: aload 0
      // 02b: goto 032
      // 02e: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: aload 0
      // 033: invokespecial com/finalshell/core/Ls4.G ()Lcom/finalshell/core/EU;
      // 036: putfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 039: aload 2
      // 03a: bipush 0
      // 03b: aload 0
      // 03c: getfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 03f: invokeinterface com/finalshell/core/EU.w ()I 1
      // 044: newarray 8
      // 046: dup_x2
      // 047: aastore
      // 048: astore 5
      // 04a: aload 0
      // 04b: getfield com/finalshell/core/Ls4.x Lcom/finalshell/core/I82;
      // 04e: iload 4
      // 050: ifeq 070
      // 053: ifnonnull 06c
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: aload 0
      // 05e: aload 0
      // 05f: invokespecial com/finalshell/core/Ls4.S ()Lcom/finalshell/core/I82;
      // 062: putfield com/finalshell/core/Ls4.x Lcom/finalshell/core/I82;
      // 065: goto 06c
      // 068: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06b: athrow
      // 06c: aload 0
      // 06d: getfield com/finalshell/core/Ls4.x Lcom/finalshell/core/I82;
      // 070: aload 5
      // 072: bipush 0
      // 073: aload 5
      // 075: arraylength
      // 076: invokeinterface com/finalshell/core/I82.Y ([BII)V 4
      // 07b: aload 0
      // 07c: aload 3
      // 07d: aload 5
      // 07f: invokevirtual com/finalshell/core/Ls4.p ([B[B)[B
      // 082: astore 6
      // 084: aload 1
      // 085: astore 7
      // 087: aload 0
      // 088: getfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 08b: invokeinterface com/finalshell/core/EU.w ()I 1
      // 090: istore 8
      // 092: aload 7
      // 094: arraylength
      // 095: iload 8
      // 097: idiv
      // 098: bipush 1
      // 099: iadd
      // 09a: iload 8
      // 09c: imul
      // 09d: newarray 8
      // 09f: astore 9
      // 0a1: aload 7
      // 0a3: bipush 0
      // 0a4: aload 9
      // 0a6: bipush 0
      // 0a7: aload 7
      // 0a9: arraylength
      // 0aa: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0ad: iload 8
      // 0af: aload 7
      // 0b1: arraylength
      // 0b2: iload 8
      // 0b4: irem
      // 0b5: isub
      // 0b6: istore 10
      // 0b8: aload 9
      // 0ba: arraylength
      // 0bb: bipush 1
      // 0bc: isub
      // 0bd: istore 11
      // 0bf: aload 9
      // 0c1: arraylength
      // 0c2: iload 10
      // 0c4: isub
      // 0c5: iload 11
      // 0c7: if_icmpgt 0e6
      // 0ca: aload 9
      // 0cc: iload 11
      // 0ce: iload 10
      // 0d0: i2b
      // 0d1: bastore
      // 0d2: iinc 11 -1
      // 0d5: iload 4
      // 0d7: ifeq 10a
      // 0da: iload 4
      // 0dc: ifne 0bf
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5: athrow
      // 0e6: aload 9
      // 0e8: astore 7
      // 0ea: aload 0
      // 0eb: getfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 0ee: bipush 0
      // 0ef: aload 6
      // 0f1: aload 5
      // 0f3: invokeinterface com/finalshell/core/EU.z (I[B[B)V 4
      // 0f8: aload 0
      // 0f9: getfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 0fc: aload 7
      // 0fe: bipush 0
      // 0ff: aload 7
      // 101: arraylength
      // 102: aload 7
      // 104: bipush 0
      // 105: invokeinterface com/finalshell/core/EU.X ([BII[BI)V 6
      // 10a: goto 14a
      // 10d: astore 8
      // 10f: iload 4
      // 111: ifeq 14f
      // 114: aload 0
      // 115: getfield com/finalshell/core/Ls4.Q Lcom/finalshell/core/Xe2;
      // 118: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 11b: bipush 3
      // 11c: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 121: ifeq 14a
      // 124: goto 12b
      // 127: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12a: athrow
      // 12b: aload 0
      // 12c: getfield com/finalshell/core/Ls4.Q Lcom/finalshell/core/Xe2;
      // 12f: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 132: bipush 3
      // 133: sipush 14828
      // 136: sipush -20586
      // 139: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 13c: aload 8
      // 13e: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 143: goto 14a
      // 146: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 149: athrow
      // 14a: aload 6
      // 14c: invokestatic com/finalshell/core/E8.Q ([B)V
      // 14f: aload 7
      // 151: areturn
   }

   abstract boolean I(byte[] var1);

   public byte[] l(byte[] param1, byte[] param2, byte[] param3) {
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
      // 05: aload 0
      // 06: aload 2
      // 07: aload 3
      // 08: invokevirtual com/finalshell/core/Ls4.p ([B[B)[B
      // 0b: astore 5
      // 0d: aload 0
      // 0e: getfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 11: bipush 1
      // 12: aload 5
      // 14: aload 3
      // 15: invokeinterface com/finalshell/core/EU.z (I[B[B)V 4
      // 1a: aload 5
      // 1c: invokestatic com/finalshell/core/E8.Q ([B)V
      // 1f: aload 1
      // 20: arraylength
      // 21: newarray 8
      // 23: astore 6
      // 25: aload 0
      // 26: getfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 29: aload 1
      // 2a: bipush 0
      // 2b: aload 1
      // 2c: arraylength
      // 2d: aload 6
      // 2f: bipush 0
      // 30: invokeinterface com/finalshell/core/EU.X ([BII[BI)V 6
      // 35: aload 6
      // 37: areturn
      // 38: astore 5
      // 3a: aload 0
      // 3b: getfield com/finalshell/core/Ls4.Q Lcom/finalshell/core/Xe2;
      // 3e: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 41: bipush 3
      // 42: iload 4
      // 44: ifne 65
      // 47: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 4c: ifeq 75
      // 4f: goto 56
      // 52: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: aload 0
      // 57: getfield com/finalshell/core/Ls4.Q Lcom/finalshell/core/Xe2;
      // 5a: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 5d: bipush 3
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: sipush 14782
      // 68: sipush 30658
      // 6b: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 6e: aload 5
      // 70: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 75: aconst_null
      // 76: areturn
   }

   int L(byte[] var1, int var2, int var3) {
      var1[var2++] = (byte)a(14773, 1655428507611296485L);
      return this.m(var1, var2, var3);
   }

   int O(byte[] var1, int var2, byte[] var3) {
      var1[var2++] = 2;
      var2 = this.m(var1, var2, var3.length);
      System.arraycopy(var3, 0, var1, var2, var3.length);
      return var2 + var3.length;
   }

   int h(byte[] var1, int var2, byte[] var3) {
      var1[var2++] = 4;
      var2 = this.m(var1, var2, var3.length);
      System.arraycopy(var3, 0, var1, var2, var3.length);
      return var2 + var3.length;
   }

   int c(byte[] var1, byte var2, int var3, byte[] var4) {
      var1[var3++] = var2;
      var3 = this.m(var1, var3, var4.length);
      System.arraycopy(var4, 0, var1, var3, var4.length);
      return var3 + var4.length;
   }

   int M(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: bipush 1
      // 04: istore 3
      // 05: istore 2
      // 06: iload 1
      // 07: iload 2
      // 08: ifeq 25
      // 0b: sipush 27110
      // 0e: ldc2_w 6203105557342986913
      // 11: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 14: if_icmpgt 24
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: iload 3
      // 1f: ireturn
      // 20: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: iload 1
      // 25: ifle 46
      // 28: iload 1
      // 29: sipush 153
      // 2c: ldc2_w 7498189791869422522
      // 2f: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 32: iushr
      // 33: iload 2
      // 34: ifeq 47
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: istore 1
      // 3f: iinc 3 1
      // 42: iload 2
      // 43: ifne 24
      // 46: iload 3
      // 47: ireturn
   }

   int m(byte[] param1, int param2, int param3) {
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
      // 04: iload 3
      // 05: invokevirtual com/finalshell/core/Ls4.M (I)I
      // 08: bipush 1
      // 09: isub
      // 0a: istore 5
      // 0c: istore 4
      // 0e: iload 5
      // 10: iload 4
      // 12: ifeq 44
      // 15: ifne 2d
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 1
      // 20: iload 2
      // 21: iinc 2 1
      // 24: iload 3
      // 25: i2b
      // 26: bastore
      // 27: iload 2
      // 28: ireturn
      // 29: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: aload 1
      // 2e: iload 2
      // 2f: iinc 2 1
      // 32: sipush 13402
      // 35: ldc2_w 4893306148090543986
      // 38: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 3b: iload 5
      // 3d: ior
      // 3e: i2b
      // 3f: bastore
      // 40: iload 2
      // 41: iload 5
      // 43: iadd
      // 44: istore 6
      // 46: iload 5
      // 48: ifle 78
      // 4b: aload 1
      // 4c: iload 2
      // 4d: iload 5
      // 4f: iadd
      // 50: bipush 1
      // 51: isub
      // 52: iload 3
      // 53: sipush 27785
      // 56: ldc2_w 4162268758915491775
      // 59: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 5c: iand
      // 5d: i2b
      // 5e: bastore
      // 5f: iload 3
      // 60: sipush 13149
      // 63: ldc2_w 7229790906152810594
      // 66: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 69: iushr
      // 6a: iload 4
      // 6c: ifeq 7a
      // 6f: istore 3
      // 70: iinc 5 -1
      // 73: iload 4
      // 75: ifne 46
      // 78: iload 6
      // 7a: ireturn
   }

   public I82 S() {
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
      // 05: getfield com/finalshell/core/Ls4.x Lcom/finalshell/core/I82;
      // 08: iload 1
      // 09: ifne 83
      // 0c: ifnonnull 7f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: sipush 14788
      // 19: sipush 26630
      // 1c: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 1f: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 22: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 25: ldc_w com/finalshell/core/I82
      // 28: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 2b: astore 2
      // 2c: aload 0
      // 2d: aload 2
      // 2e: bipush 0
      // 2f: anewarray 323
      // 32: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 35: bipush 0
      // 36: anewarray 4
      // 39: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 3c: checkcast com/finalshell/core/I82
      // 3f: putfield com/finalshell/core/Ls4.x Lcom/finalshell/core/I82;
      // 42: goto 7f
      // 45: astore 2
      // 46: aload 0
      // 47: iload 1
      // 48: ifne 80
      // 4b: getfield com/finalshell/core/Ls4.Q Lcom/finalshell/core/Xe2;
      // 4e: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 51: bipush 3
      // 52: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 57: ifeq 7f
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: aload 0
      // 62: getfield com/finalshell/core/Ls4.Q Lcom/finalshell/core/Xe2;
      // 65: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 68: bipush 3
      // 69: sipush 14780
      // 6c: sipush -29866
      // 6f: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 72: aload 2
      // 73: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: aload 0
      // 80: getfield com/finalshell/core/Ls4.x Lcom/finalshell/core/I82;
      // 83: areturn
   }

   public Y_2 I() {
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
      // 04: sipush 14804
      // 07: sipush -17461
      // 0a: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0d: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 10: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 13: ldc_w com/finalshell/core/Y_2
      // 16: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 19: astore 2
      // 1a: aload 0
      // 1b: aload 2
      // 1c: bipush 0
      // 1d: anewarray 323
      // 20: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 23: bipush 0
      // 24: anewarray 4
      // 27: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 2a: checkcast com/finalshell/core/Y_2
      // 2d: putfield com/finalshell/core/Ls4.l Lcom/finalshell/core/Y_2;
      // 30: aload 0
      // 31: getfield com/finalshell/core/Ls4.l Lcom/finalshell/core/Y_2;
      // 34: invokeinterface com/finalshell/core/Y_2.t ()V 1
      // 39: goto 76
      // 3c: astore 2
      // 3d: aload 0
      // 3e: iload 1
      // 3f: ifne 77
      // 42: getfield com/finalshell/core/Ls4.Q Lcom/finalshell/core/Xe2;
      // 45: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 48: bipush 3
      // 49: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 4e: ifeq 76
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: aload 0
      // 59: getfield com/finalshell/core/Ls4.Q Lcom/finalshell/core/Xe2;
      // 5c: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 5f: bipush 3
      // 60: sipush 14810
      // 63: sipush -7838
      // 66: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 69: aload 2
      // 6a: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 6f: goto 76
      // 72: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75: athrow
      // 76: aload 0
      // 77: getfield com/finalshell/core/Ls4.l Lcom/finalshell/core/Y_2;
      // 7a: areturn
   }

   public EU G() {
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
      // 04: sipush 14802
      // 07: sipush -14926
      // 0a: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0d: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 10: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 13: ldc_w com/finalshell/core/EU
      // 16: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 19: astore 2
      // 1a: aload 0
      // 1b: aload 2
      // 1c: bipush 0
      // 1d: anewarray 323
      // 20: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 23: bipush 0
      // 24: anewarray 4
      // 27: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 2a: checkcast com/finalshell/core/EU
      // 2d: putfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 30: goto 6d
      // 33: astore 2
      // 34: aload 0
      // 35: iload 1
      // 36: ifeq 6e
      // 39: getfield com/finalshell/core/Ls4.Q Lcom/finalshell/core/Xe2;
      // 3c: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 3f: bipush 3
      // 40: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 45: ifeq 6d
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield com/finalshell/core/Ls4.Q Lcom/finalshell/core/Xe2;
      // 53: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 56: bipush 3
      // 57: sipush 14798
      // 5a: sipush 31950
      // 5d: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 60: aload 2
      // 61: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c: athrow
      // 6d: aload 0
      // 6e: getfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 71: areturn
   }

   synchronized byte[] p(byte[] param1, byte[] param2) {
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
      // 005: iload 3
      // 006: ifeq 026
      // 009: getfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 00c: ifnonnull 025
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: aload 0
      // 017: aload 0
      // 018: invokespecial com/finalshell/core/Ls4.G ()Lcom/finalshell/core/EU;
      // 01b: putfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 01e: goto 025
      // 021: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: aload 0
      // 026: iload 3
      // 027: ifeq 047
      // 02a: getfield com/finalshell/core/Ls4.l Lcom/finalshell/core/Y_2;
      // 02d: ifnonnull 046
      // 030: goto 037
      // 033: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 036: athrow
      // 037: aload 0
      // 038: aload 0
      // 039: invokespecial com/finalshell/core/Ls4.I ()Lcom/finalshell/core/Y_2;
      // 03c: putfield com/finalshell/core/Ls4.l Lcom/finalshell/core/Y_2;
      // 03f: goto 046
      // 042: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 045: athrow
      // 046: aload 0
      // 047: getfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 04a: invokeinterface com/finalshell/core/EU.u ()I 1
      // 04f: newarray 8
      // 051: astore 4
      // 053: aload 0
      // 054: getfield com/finalshell/core/Ls4.l Lcom/finalshell/core/Y_2;
      // 057: invokeinterface com/finalshell/core/Y_2.e ()I 1
      // 05c: istore 5
      // 05e: aload 4
      // 060: arraylength
      // 061: iload 5
      // 063: idiv
      // 064: iload 5
      // 066: imul
      // 067: aload 4
      // 069: arraylength
      // 06a: iload 5
      // 06c: irem
      // 06d: iload 3
      // 06e: ifeq 07c
      // 071: ifne 07f
      // 074: goto 07b
      // 077: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07a: athrow
      // 07b: bipush 0
      // 07c: goto 081
      // 07f: iload 5
      // 081: iadd
      // 082: newarray 8
      // 084: astore 6
      // 086: aconst_null
      // 087: astore 7
      // 089: aload 0
      // 08a: getfield com/finalshell/core/Ls4.P I
      // 08d: iload 3
      // 08e: ifeq 149
      // 091: ifne 145
      // 094: goto 09b
      // 097: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09a: athrow
      // 09b: bipush 0
      // 09c: istore 8
      // 09e: iload 8
      // 0a0: iload 5
      // 0a2: iadd
      // 0a3: aload 6
      // 0a5: arraylength
      // 0a6: if_icmpgt 136
      // 0a9: aload 7
      // 0ab: iload 3
      // 0ac: ifeq 138
      // 0af: ifnull 0cf
      // 0b2: goto 0b9
      // 0b5: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b8: athrow
      // 0b9: aload 0
      // 0ba: getfield com/finalshell/core/Ls4.l Lcom/finalshell/core/Y_2;
      // 0bd: aload 7
      // 0bf: bipush 0
      // 0c0: aload 7
      // 0c2: arraylength
      // 0c3: invokeinterface com/finalshell/core/Y_2.p ([BII)V 4
      // 0c8: goto 0cf
      // 0cb: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: getfield com/finalshell/core/Ls4.l Lcom/finalshell/core/Y_2;
      // 0d3: aload 1
      // 0d4: bipush 0
      // 0d5: aload 1
      // 0d6: arraylength
      // 0d7: invokeinterface com/finalshell/core/Y_2.p ([BII)V 4
      // 0dc: aload 0
      // 0dd: getfield com/finalshell/core/Ls4.l Lcom/finalshell/core/Y_2;
      // 0e0: aload 2
      // 0e1: bipush 0
      // 0e2: aload 2
      // 0e3: iload 3
      // 0e4: ifeq 10c
      // 0e7: arraylength
      // 0e8: sipush 13149
      // 0eb: ldc2_w 7229790906152810594
      // 0ee: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0f1: if_icmple 10b
      // 0f4: goto 0fb
      // 0f7: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fa: athrow
      // 0fb: sipush 13149
      // 0fe: ldc2_w 7229790906152810594
      // 101: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 104: goto 10d
      // 107: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10a: athrow
      // 10b: aload 2
      // 10c: arraylength
      // 10d: invokeinterface com/finalshell/core/Y_2.p ([BII)V 4
      // 112: aload 0
      // 113: getfield com/finalshell/core/Ls4.l Lcom/finalshell/core/Y_2;
      // 116: invokeinterface com/finalshell/core/Y_2.O ()[B 1
      // 11b: astore 7
      // 11d: aload 7
      // 11f: bipush 0
      // 120: aload 6
      // 122: iload 8
      // 124: aload 7
      // 126: arraylength
      // 127: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 12a: iload 8
      // 12c: aload 7
      // 12e: arraylength
      // 12f: iadd
      // 130: istore 8
      // 132: iload 3
      // 133: ifne 09e
      // 136: aload 6
      // 138: bipush 0
      // 139: aload 4
      // 13b: bipush 0
      // 13c: aload 4
      // 13e: arraylength
      // 13f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 142: goto 318
      // 145: aload 0
      // 146: getfield com/finalshell/core/Ls4.P I
      // 149: bipush 4
      // 14a: iload 3
      // 14b: ifeq 19c
      // 14e: if_icmpne 197
      // 151: goto 158
      // 154: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 157: athrow
      // 158: aload 0
      // 159: getfield com/finalshell/core/Ls4.T Lcom/finalshell/core/Bx2;
      // 15c: aload 1
      // 15d: aload 0
      // 15e: getfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 161: invokeinterface com/finalshell/core/EU.u ()I 1
      // 166: aload 0
      // 167: getfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 16a: invokeinterface com/finalshell/core/EU.w ()I 1
      // 16f: iadd
      // 170: invokeinterface com/finalshell/core/Bx2.m ([BI)[B 3
      // 175: astore 7
      // 177: aload 7
      // 179: bipush 0
      // 17a: aload 4
      // 17c: bipush 0
      // 17d: aload 4
      // 17f: arraylength
      // 180: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 183: aload 7
      // 185: aload 4
      // 187: arraylength
      // 188: aload 2
      // 189: bipush 0
      // 18a: aload 2
      // 18b: arraylength
      // 18c: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 18f: aload 7
      // 191: invokestatic com/finalshell/core/E8.Q ([B)V
      // 194: goto 318
      // 197: aload 0
      // 198: getfield com/finalshell/core/Ls4.P I
      // 19b: bipush 1
      // 19c: iload 3
      // 19d: ifeq 22e
      // 1a0: if_icmpne 229
      // 1a3: goto 1aa
      // 1a6: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a9: athrow
      // 1aa: bipush 0
      // 1ab: istore 8
      // 1ad: iload 8
      // 1af: iload 5
      // 1b1: iadd
      // 1b2: aload 6
      // 1b4: arraylength
      // 1b5: if_icmpgt 21a
      // 1b8: aload 7
      // 1ba: iload 3
      // 1bb: ifeq 21c
      // 1be: iload 3
      // 1bf: ifeq 203
      // 1c2: goto 1c9
      // 1c5: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c8: athrow
      // 1c9: ifnull 1e9
      // 1cc: goto 1d3
      // 1cf: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d2: athrow
      // 1d3: aload 0
      // 1d4: getfield com/finalshell/core/Ls4.l Lcom/finalshell/core/Y_2;
      // 1d7: aload 7
      // 1d9: bipush 0
      // 1da: aload 7
      // 1dc: arraylength
      // 1dd: invokeinterface com/finalshell/core/Y_2.p ([BII)V 4
      // 1e2: goto 1e9
      // 1e5: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e8: athrow
      // 1e9: aload 0
      // 1ea: getfield com/finalshell/core/Ls4.l Lcom/finalshell/core/Y_2;
      // 1ed: aload 1
      // 1ee: bipush 0
      // 1ef: aload 1
      // 1f0: arraylength
      // 1f1: invokeinterface com/finalshell/core/Y_2.p ([BII)V 4
      // 1f6: aload 0
      // 1f7: getfield com/finalshell/core/Ls4.l Lcom/finalshell/core/Y_2;
      // 1fa: invokeinterface com/finalshell/core/Y_2.O ()[B 1
      // 1ff: astore 7
      // 201: aload 7
      // 203: bipush 0
      // 204: aload 6
      // 206: iload 8
      // 208: aload 7
      // 20a: arraylength
      // 20b: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 20e: iload 8
      // 210: aload 7
      // 212: arraylength
      // 213: iadd
      // 214: istore 8
      // 216: iload 3
      // 217: ifne 1ad
      // 21a: aload 6
      // 21c: bipush 0
      // 21d: aload 4
      // 21f: bipush 0
      // 220: aload 4
      // 222: arraylength
      // 223: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 226: goto 318
      // 229: aload 0
      // 22a: getfield com/finalshell/core/Ls4.P I
      // 22d: bipush 2
      // 22e: iload 3
      // 22f: ifeq 2cf
      // 232: if_icmpne 2bf
      // 235: goto 23c
      // 238: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23b: athrow
      // 23c: bipush 4
      // 23d: newarray 8
      // 23f: astore 8
      // 241: aload 0
      // 242: getfield com/finalshell/core/Ls4.u Lcom/finalshell/core/Y_2;
      // 245: aload 8
      // 247: bipush 0
      // 248: aload 8
      // 24a: arraylength
      // 24b: invokeinterface com/finalshell/core/Y_2.p ([BII)V 4
      // 250: aload 0
      // 251: getfield com/finalshell/core/Ls4.u Lcom/finalshell/core/Y_2;
      // 254: aload 1
      // 255: bipush 0
      // 256: aload 1
      // 257: arraylength
      // 258: invokeinterface com/finalshell/core/Y_2.p ([BII)V 4
      // 25d: aload 0
      // 25e: getfield com/finalshell/core/Ls4.u Lcom/finalshell/core/Y_2;
      // 261: invokeinterface com/finalshell/core/Y_2.O ()[B 1
      // 266: astore 7
      // 268: aload 7
      // 26a: bipush 0
      // 26b: aload 4
      // 26d: bipush 0
      // 26e: aload 7
      // 270: arraylength
      // 271: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 274: aload 7
      // 276: invokestatic com/finalshell/core/E8.Q ([B)V
      // 279: aload 8
      // 27b: bipush 3
      // 27c: bipush 1
      // 27d: bastore
      // 27e: aload 0
      // 27f: getfield com/finalshell/core/Ls4.u Lcom/finalshell/core/Y_2;
      // 282: aload 8
      // 284: bipush 0
      // 285: aload 8
      // 287: arraylength
      // 288: invokeinterface com/finalshell/core/Y_2.p ([BII)V 4
      // 28d: aload 0
      // 28e: getfield com/finalshell/core/Ls4.u Lcom/finalshell/core/Y_2;
      // 291: aload 1
      // 292: bipush 0
      // 293: aload 1
      // 294: arraylength
      // 295: invokeinterface com/finalshell/core/Y_2.p ([BII)V 4
      // 29a: aload 0
      // 29b: getfield com/finalshell/core/Ls4.u Lcom/finalshell/core/Y_2;
      // 29e: invokeinterface com/finalshell/core/Y_2.O ()[B 1
      // 2a3: astore 7
      // 2a5: aload 7
      // 2a7: bipush 0
      // 2a8: aload 4
      // 2aa: aload 7
      // 2ac: arraylength
      // 2ad: aload 4
      // 2af: arraylength
      // 2b0: aload 7
      // 2b2: arraylength
      // 2b3: isub
      // 2b4: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 2b7: aload 7
      // 2b9: invokestatic com/finalshell/core/E8.Q ([B)V
      // 2bc: goto 318
      // 2bf: aload 0
      // 2c0: iload 3
      // 2c1: ifeq 2d3
      // 2c4: getfield com/finalshell/core/Ls4.P I
      // 2c7: bipush 5
      // 2c8: goto 2cf
      // 2cb: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ce: athrow
      // 2cf: if_icmpne 318
      // 2d2: aload 0
      // 2d3: getfield com/finalshell/core/Ls4.T Lcom/finalshell/core/Bx2;
      // 2d6: aload 1
      // 2d7: aload 0
      // 2d8: getfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 2db: invokeinterface com/finalshell/core/EU.u ()I 1
      // 2e0: aload 0
      // 2e1: getfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 2e4: invokeinterface com/finalshell/core/EU.w ()I 1
      // 2e9: iadd
      // 2ea: sipush 21792
      // 2ed: ldc2_w 9178665888569040435
      // 2f0: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 2f3: iadd
      // 2f4: invokeinterface com/finalshell/core/Bx2.m ([BI)[B 3
      // 2f9: astore 7
      // 2fb: aload 7
      // 2fd: bipush 0
      // 2fe: aload 4
      // 300: bipush 0
      // 301: aload 4
      // 303: arraylength
      // 304: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 307: aload 7
      // 309: aload 4
      // 30b: arraylength
      // 30c: aload 2
      // 30d: bipush 0
      // 30e: aload 2
      // 30f: arraylength
      // 310: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 313: aload 7
      // 315: invokestatic com/finalshell/core/E8.Q ([B)V
      // 318: goto 357
      // 31b: astore 7
      // 31d: aload 0
      // 31e: getfield com/finalshell/core/Ls4.Q Lcom/finalshell/core/Xe2;
      // 321: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 324: bipush 3
      // 325: iload 3
      // 326: ifeq 347
      // 329: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 32e: ifeq 357
      // 331: goto 338
      // 334: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 337: athrow
      // 338: aload 0
      // 339: getfield com/finalshell/core/Ls4.Q Lcom/finalshell/core/Xe2;
      // 33c: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 33f: bipush 3
      // 340: goto 347
      // 343: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 346: athrow
      // 347: sipush 14831
      // 34a: sipush -29690
      // 34d: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 350: aload 7
      // 352: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 357: aload 4
      // 359: areturn
   }

   @Deprecated
   public void q(String param1) {
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
      // 05: ifeq 30
      // 08: aload 1
      // 09: ifnull 21
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 1
      // 14: invokevirtual java/lang/String.length ()I
      // 17: ifne 34
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 0
      // 22: aconst_null
      // 23: checkcast [B
      // 26: invokevirtual com/finalshell/core/Ls4.E ([B)V
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: iload 2
      // 31: ifne 43
      // 34: aload 0
      // 35: aload 1
      // 36: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 39: invokevirtual com/finalshell/core/Ls4.E ([B)V
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: return
   }

   @Deprecated
   public void E(byte[] param1) {
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
      // 05: ifeq 26
      // 08: aload 1
      // 09: ifnull 21
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 1
      // 14: arraylength
      // 15: ifne 21
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aconst_null
      // 20: astore 1
      // 21: aload 0
      // 22: aload 1
      // 23: putfield com/finalshell/core/Ls4.F [B
      // 26: return
   }

   public boolean t() {
      return this.E;
   }

   public boolean j(String param1) {
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
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 14
      // 09: ifnull 25
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 1
      // 14: invokevirtual java/lang/String.length ()I
      // 17: iload 2
      // 18: ifne 4c
      // 1b: ifne 44
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 0
      // 26: getfield com/finalshell/core/Ls4.E Z
      // 29: iload 2
      // 2a: ifne 3f
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: ifne 42
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: bipush 1
      // 3f: goto 43
      // 42: bipush 0
      // 43: ireturn
      // 44: aload 0
      // 45: aload 1
      // 46: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 49: invokevirtual com/finalshell/core/Ls4.d ([B)Z
      // 4c: ireturn
   }

   public boolean d(byte[] param1) {
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
      // 05: getfield com/finalshell/core/Ls4.E Z
      // 08: iload 2
      // 09: ifeq 17
      // 0c: ifne 18
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: bipush 1
      // 17: ireturn
      // 18: aload 1
      // 19: iload 2
      // 1a: ifeq 4a
      // 1d: ifnonnull 46
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: aload 0
      // 28: getfield com/finalshell/core/Ls4.E Z
      // 2b: iload 2
      // 2c: ifeq 41
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: ifne 44
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: bipush 1
      // 41: goto 45
      // 44: bipush 0
      // 45: ireturn
      // 46: aload 1
      // 47: arraylength
      // 48: newarray 8
      // 4a: astore 3
      // 4b: aload 1
      // 4c: bipush 0
      // 4d: aload 3
      // 4e: bipush 0
      // 4f: aload 3
      // 50: arraylength
      // 51: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 54: aload 3
      // 55: astore 1
      // 56: aconst_null
      // 57: astore 4
      // 59: aload 0
      // 5a: aload 0
      // 5b: getfield com/finalshell/core/Ls4.R [B
      // 5e: aload 1
      // 5f: aload 0
      // 60: getfield com/finalshell/core/Ls4.W [B
      // 63: invokespecial com/finalshell/core/Ls4.l ([B[B[B)[B
      // 66: astore 4
      // 68: iload 2
      // 69: ifeq 98
      // 6c: aload 0
      // 6d: aload 4
      // 6f: invokevirtual com/finalshell/core/Ls4.I ([B)Z
      // 72: ifeq 8f
      // 75: goto 7c
      // 78: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b: athrow
      // 7c: aload 0
      // 7d: bipush 0
      // 7e: putfield com/finalshell/core/Ls4.E Z
      // 81: aload 0
      // 82: getfield com/finalshell/core/Ls4.R [B
      // 85: invokestatic com/finalshell/core/E8.Q ([B)V
      // 88: goto 8f
      // 8b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8e: athrow
      // 8f: aload 1
      // 90: invokestatic com/finalshell/core/E8.Q ([B)V
      // 93: aload 4
      // 95: invokestatic com/finalshell/core/E8.Q ([B)V
      // 98: goto a9
      // 9b: astore 5
      // 9d: aload 1
      // 9e: invokestatic com/finalshell/core/E8.Q ([B)V
      // a1: aload 4
      // a3: invokestatic com/finalshell/core/E8.Q ([B)V
      // a6: aload 5
      // a8: athrow
      // a9: aload 0
      // aa: getfield com/finalshell/core/Ls4.E Z
      // ad: iload 2
      // ae: ifeq bc
      // b1: ifne bf
      // b4: goto bb
      // b7: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ba: athrow
      // bb: bipush 1
      // bc: goto c0
      // bf: bipush 0
      // c0: ireturn
   }

   public static Ls4 G(Xe2 var0, String var1) throws Pc2 {
      String var2 = var1 + a(14752, 22570);
      if (!new File(var2).exists()) {
         var2 = null;
      }

      return X(var0, var1, var2);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static Ls4 X(Xe2 var0, String var1, String var2) throws Pc2 {
      boolean var10000 = Dm4.F$boolean();
      Object var4 = null;
      byte[] var5 = null;
      boolean var3 = var10000;

      try {
         var4 = E8.w(var1);
      } catch (IOException var17) {
      String var23;
      String var23;
         throw new Pc2(var17.toString(), var17);
      }

      String var6 = var2;

      label89: {
         label84: {
            label83: {
               label82: {
                  try {
                     var23 = var2;
                     if (!var3) {
                        break label83;
                     }

                     if (var2 != null) {
                        break label82;
                     }
                  } catch (IOException var20) {
                     throw a(var20);
                  }

                  var6 = var1 + a(14794, -8953);
               }

               try {
                  var23 = var6;
               } catch (IOException var19) {
                  var24 = var19;
                  boolean var10001 = false;
                  break label84;
               }
            }

            try {
               var5 = E8.w(var23);
               break label89;
            } catch (IOException var18) {
               var24 = var18;
               boolean var25 = false;
            }
         }

         IOException var7 = var24;

         try {
            if (var2 != null) {
               throw new Pc2(var7.toString(), var7);
            }
         } catch (IOException var16) {
            throw a(var16);
         }
      }

      Ls4 var22;
      try {
         var22 = h(var0, (byte[])var4, var5);
      } finally {
         E8.Q((byte[])var4);
      }

      return var22;
   }

   public static Ls4 h(Xe2 param0, byte[] param1, byte[] param2) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 0000: sipush 13149
      // 0003: ldc2_w 7229790906152810594
      // 0006: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0009: newarray 8
      // 000b: astore 4
      // 000d: bipush 1
      // 000e: istore 5
      // 0010: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 0013: aconst_null
      // 0014: astore 6
      // 0016: aconst_null
      // 0017: astore 7
      // 0019: bipush 0
      // 001a: istore 8
      // 001c: bipush 0
      // 001d: istore 9
      // 001f: ldc_w ""
      // 0022: astore 10
      // 0024: aconst_null
      // 0025: astore 11
      // 0027: istore 3
      // 0028: aload 2
      // 0029: iload 3
      // 002a: ifne 0281
      // 002d: ifnonnull 0280
      // 0030: goto 0037
      // 0033: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0036: athrow
      // 0037: aload 1
      // 0038: iload 3
      // 0039: ifne 0281
      // 003c: goto 0043
      // 003f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0042: athrow
      // 0043: ifnull 0280
      // 0046: goto 004d
      // 0049: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 004c: athrow
      // 004d: aload 1
      // 004e: iload 3
      // 004f: ifne 0281
      // 0052: goto 0059
      // 0055: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0058: athrow
      // 0059: arraylength
      // 005a: sipush 11498
      // 005d: ldc2_w 6442559047213639596
      // 0060: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0063: if_icmple 0280
      // 0066: goto 006d
      // 0069: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 006c: athrow
      // 006d: aload 1
      // 006e: iload 3
      // 006f: ifne 0281
      // 0072: goto 0079
      // 0075: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0078: athrow
      // 0079: bipush 0
      // 007a: baload
      // 007b: ifne 0280
      // 007e: goto 0085
      // 0081: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0084: athrow
      // 0085: aload 1
      // 0086: iload 3
      // 0087: ifne 0281
      // 008a: goto 0091
      // 008d: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0090: athrow
      // 0091: bipush 1
      // 0092: baload
      // 0093: ifne 0280
      // 0096: goto 009d
      // 0099: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 009c: athrow
      // 009d: aload 1
      // 009e: iload 3
      // 009f: ifne 0281
      // 00a2: goto 00a9
      // 00a5: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 00a8: athrow
      // 00a9: bipush 2
      // 00aa: baload
      // 00ab: ifne 0280
      // 00ae: goto 00b5
      // 00b1: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 00b4: athrow
      // 00b5: aload 1
      // 00b6: bipush 3
      // 00b7: baload
      // 00b8: sipush 16913
      // 00bb: ldc2_w 2499155976670578968
      // 00be: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 00c1: iload 3
      // 00c2: ifne 00e9
      // 00c5: goto 00cc
      // 00c8: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 00cb: athrow
      // 00cc: if_icmpeq 0139
      // 00cf: goto 00d6
      // 00d2: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 00d5: athrow
      // 00d6: aload 1
      // 00d7: bipush 3
      // 00d8: baload
      // 00d9: sipush 15618
      // 00dc: ldc2_w 2580383166163678747
      // 00df: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 00e2: goto 00e9
      // 00e5: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 00e8: athrow
      // 00e9: iload 3
      // 00ea: ifne 010a
      // 00ed: if_icmpeq 0139
      // 00f0: goto 00f7
      // 00f3: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 00f6: athrow
      // 00f7: aload 1
      // 00f8: bipush 3
      // 00f9: baload
      // 00fa: sipush 6684
      // 00fd: ldc2_w 1049572706121470278
      // 0100: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0103: goto 010a
      // 0106: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0109: athrow
      // 010a: iload 3
      // 010b: ifne 0136
      // 010e: if_icmpeq 0139
      // 0111: goto 0118
      // 0114: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0117: athrow
      // 0118: aload 1
      // 0119: iload 3
      // 011a: ifne 0281
      // 011d: goto 0124
      // 0120: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0123: athrow
      // 0124: bipush 3
      // 0125: baload
      // 0126: sipush 29890
      // 0129: ldc2_w 391035477517221848
      // 012c: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 012f: goto 0136
      // 0132: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0135: athrow
      // 0136: if_icmpne 0280
      // 0139: new com/finalshell/core/UJ
      // 013c: dup
      // 013d: aload 1
      // 013e: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 0141: astore 12
      // 0143: aload 12
      // 0145: aload 1
      // 0146: arraylength
      // 0147: invokevirtual com/finalshell/core/UJ.S (I)V
      // 014a: aload 12
      // 014c: invokevirtual com/finalshell/core/UJ.S ()[B
      // 014f: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 0152: astore 13
      // 0154: aload 12
      // 0156: invokevirtual com/finalshell/core/UJ.a ()V
      // 0159: aconst_null
      // 015a: astore 14
      // 015c: aload 13
      // 015e: sipush 14800
      // 0161: sipush -32375
      // 0164: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0167: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 016a: iload 3
      // 016b: ifne 0191
      // 016e: ifeq 0183
      // 0171: goto 0178
      // 0174: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0177: athrow
      // 0178: aload 0
      // 0179: aload 12
      // 017b: invokestatic com/finalshell/core/LW3.i (Lcom/finalshell/core/Xe2;Lcom/finalshell/core/UJ;)Lcom/finalshell/core/Ls4;
      // 017e: astore 14
      // 0180: goto 027d
      // 0183: aload 13
      // 0185: sipush 14825
      // 0188: sipush -13372
      // 018b: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 018e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0191: iload 3
      // 0192: ifne 01b8
      // 0195: ifeq 01aa
      // 0198: goto 019f
      // 019b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 019e: athrow
      // 019f: aload 0
      // 01a0: aload 12
      // 01a2: invokestatic com/finalshell/core/L22.c (Lcom/finalshell/core/Xe2;Lcom/finalshell/core/UJ;)Lcom/finalshell/core/Ls4;
      // 01a5: astore 14
      // 01a7: goto 027d
      // 01aa: aload 13
      // 01ac: sipush 14758
      // 01af: sipush 23862
      // 01b2: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 01b5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 01b8: iload 3
      // 01b9: ifne 01db
      // 01bc: ifne 020c
      // 01bf: goto 01c6
      // 01c2: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01c5: athrow
      // 01c6: aload 13
      // 01c8: sipush 14803
      // 01cb: sipush -3237
      // 01ce: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 01d1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 01d4: goto 01db
      // 01d7: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01da: athrow
      // 01db: iload 3
      // 01dc: ifne 01fe
      // 01df: ifne 020c
      // 01e2: goto 01e9
      // 01e5: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01e8: athrow
      // 01e9: aload 13
      // 01eb: sipush 14816
      // 01ee: sipush 6957
      // 01f1: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 01f4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 01f7: goto 01fe
      // 01fa: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01fd: athrow
      // 01fe: iload 3
      // 01ff: ifne 0225
      // 0202: ifeq 0217
      // 0205: goto 020c
      // 0208: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 020b: athrow
      // 020c: aload 0
      // 020d: aload 12
      // 020f: invokestatic com/finalshell/core/L32.m (Lcom/finalshell/core/Xe2;Lcom/finalshell/core/UJ;)Lcom/finalshell/core/Ls4;
      // 0212: astore 14
      // 0214: goto 027d
      // 0217: aload 13
      // 0219: sipush 14835
      // 021c: sipush 27575
      // 021f: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0222: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0225: iload 3
      // 0226: ifne 024c
      // 0229: ifeq 023e
      // 022c: goto 0233
      // 022f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0232: athrow
      // 0233: aload 0
      // 0234: aload 12
      // 0236: invokestatic com/finalshell/core/LC3.p (Lcom/finalshell/core/Xe2;Lcom/finalshell/core/UJ;)Lcom/finalshell/core/Ls4;
      // 0239: astore 14
      // 023b: goto 027d
      // 023e: aload 13
      // 0240: sipush 14753
      // 0243: sipush -14704
      // 0246: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0249: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 024c: ifeq 025a
      // 024f: aload 0
      // 0250: aload 12
      // 0252: invokestatic com/finalshell/core/Lo4.v (Lcom/finalshell/core/Xe2;Lcom/finalshell/core/UJ;)Lcom/finalshell/core/Ls4;
      // 0255: astore 14
      // 0257: goto 027d
      // 025a: new com/finalshell/core/Pc2
      // 025d: dup
      // 025e: new java/lang/StringBuilder
      // 0261: dup
      // 0262: invokespecial java/lang/StringBuilder.<init> ()V
      // 0265: sipush 14811
      // 0268: sipush -29775
      // 026b: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 026e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0271: aload 13
      // 0273: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0276: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0279: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 027c: athrow
      // 027d: aload 14
      // 027f: areturn
      // 0280: aload 1
      // 0281: astore 12
      // 0283: aload 12
      // 0285: iload 3
      // 0286: ifne 02b0
      // 0289: ifnull 02ae
      // 028c: goto 0293
      // 028f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0292: athrow
      // 0293: aload 0
      // 0294: aload 12
      // 0296: invokestatic com/finalshell/core/Ls4.J (Lcom/finalshell/core/Xe2;[B)Lcom/finalshell/core/Ls4;
      // 0299: astore 13
      // 029b: aload 13
      // 029d: iload 3
      // 029e: ifne 02ad
      // 02a1: ifnull 02ae
      // 02a4: goto 02ab
      // 02a7: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02aa: athrow
      // 02ab: aload 13
      // 02ad: areturn
      // 02ae: aload 12
      // 02b0: iload 3
      // 02b1: ifne 02c0
      // 02b4: ifnull 02c4
      // 02b7: goto 02be
      // 02ba: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02bd: athrow
      // 02be: aload 12
      // 02c0: arraylength
      // 02c1: goto 02c5
      // 02c4: bipush 0
      // 02c5: istore 13
      // 02c7: bipush 0
      // 02c8: istore 14
      // 02ca: iload 14
      // 02cc: iload 13
      // 02ce: if_icmpge 03ad
      // 02d1: aload 12
      // 02d3: iload 14
      // 02d5: baload
      // 02d6: sipush 9259
      // 02d9: ldc2_w 5195331499882278673
      // 02dc: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 02df: iload 3
      // 02e0: ifne 0301
      // 02e3: goto 02ea
      // 02e6: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e9: athrow
      // 02ea: if_icmpne 03a3
      // 02ed: goto 02f4
      // 02f0: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02f3: athrow
      // 02f4: iload 14
      // 02f6: bipush 4
      // 02f7: iadd
      // 02f8: iload 13
      // 02fa: goto 0301
      // 02fd: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0300: athrow
      // 0301: iload 3
      // 0302: ifne 0326
      // 0305: if_icmpge 03a3
      // 0308: goto 030f
      // 030b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030e: athrow
      // 030f: aload 12
      // 0311: iload 14
      // 0313: bipush 1
      // 0314: iadd
      // 0315: baload
      // 0316: sipush 21996
      // 0319: ldc2_w 8489794514723184369
      // 031c: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 031f: goto 0326
      // 0322: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0325: athrow
      // 0326: iload 3
      // 0327: ifne 034b
      // 032a: if_icmpne 03a3
      // 032d: goto 0334
      // 0330: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0333: athrow
      // 0334: aload 12
      // 0336: iload 14
      // 0338: bipush 2
      // 0339: iadd
      // 033a: baload
      // 033b: sipush 21996
      // 033e: ldc2_w 8489794514723184369
      // 0341: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0344: goto 034b
      // 0347: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 034a: athrow
      // 034b: iload 3
      // 034c: ifne 0370
      // 034f: if_icmpne 03a3
      // 0352: goto 0359
      // 0355: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0358: athrow
      // 0359: aload 12
      // 035b: iload 14
      // 035d: bipush 3
      // 035e: iadd
      // 035f: baload
      // 0360: sipush 21996
      // 0363: ldc2_w 8489794514723184369
      // 0366: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0369: goto 0370
      // 036c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 036f: athrow
      // 0370: iload 3
      // 0371: ifne 0395
      // 0374: if_icmpne 03a3
      // 0377: goto 037e
      // 037a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 037d: athrow
      // 037e: aload 12
      // 0380: iload 14
      // 0382: bipush 4
      // 0383: iadd
      // 0384: baload
      // 0385: sipush 21996
      // 0388: ldc2_w 8489794514723184369
      // 038b: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 038e: goto 0395
      // 0391: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0394: athrow
      // 0395: if_icmpne 03a3
      // 0398: iload 3
      // 0399: ifeq 03ad
      // 039c: goto 03a3
      // 039f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03a2: athrow
      // 03a3: iinc 14 1
      // 03a6: goto 02ca
      // 03a9: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03ac: athrow
      // 03ad: iload 14
      // 03af: iload 13
      // 03b1: if_icmpge 11b8
      // 03b4: aload 12
      // 03b6: iload 14
      // 03b8: baload
      // 03b9: iload 3
      // 03ba: ifne 11c6
      // 03bd: sipush 18274
      // 03c0: ldc2_w 2561167755053796420
      // 03c3: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 03c6: iload 3
      // 03c7: ifne 0960
      // 03ca: goto 03d1
      // 03cd: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03d0: athrow
      // 03d1: if_icmpne 0952
      // 03d4: goto 03db
      // 03d7: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03da: athrow
      // 03db: iload 14
      // 03dd: bipush 3
      // 03de: iadd
      // 03df: iload 13
      // 03e1: iload 3
      // 03e2: ifne 0960
      // 03e5: goto 03ec
      // 03e8: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03eb: athrow
      // 03ec: if_icmpge 0952
      // 03ef: goto 03f6
      // 03f2: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f5: athrow
      // 03f6: aload 12
      // 03f8: iload 14
      // 03fa: bipush 1
      // 03fb: iadd
      // 03fc: baload
      // 03fd: sipush 13505
      // 0400: ldc2_w 1183619644898934682
      // 0403: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0406: iload 3
      // 0407: ifne 0960
      // 040a: goto 0411
      // 040d: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0410: athrow
      // 0411: if_icmpne 0952
      // 0414: goto 041b
      // 0417: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 041a: athrow
      // 041b: aload 12
      // 041d: iload 14
      // 041f: bipush 2
      // 0420: iadd
      // 0421: baload
      // 0422: sipush 1999
      // 0425: ldc2_w 1871424088210033901
      // 0428: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 042b: iload 3
      // 042c: ifne 0960
      // 042f: goto 0436
      // 0432: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0435: athrow
      // 0436: if_icmpne 0952
      // 0439: goto 0440
      // 043c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 043f: athrow
      // 0440: aload 12
      // 0442: iload 14
      // 0444: bipush 3
      // 0445: iadd
      // 0446: baload
      // 0447: sipush 2859
      // 044a: ldc2_w 2261867498056466438
      // 044d: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0450: iload 3
      // 0451: ifne 0960
      // 0454: goto 045b
      // 0457: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 045a: athrow
      // 045b: if_icmpne 0952
      // 045e: goto 0465
      // 0461: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0464: athrow
      // 0465: iinc 14 6
      // 0468: iload 14
      // 046a: bipush 2
      // 046b: iadd
      // 046c: iload 13
      // 046e: iload 3
      // 046f: ifne 04a6
      // 0472: goto 0479
      // 0475: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0478: athrow
      // 0479: if_icmplt 0498
      // 047c: goto 0483
      // 047f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0482: athrow
      // 0483: new com/finalshell/core/Pc2
      // 0486: dup
      // 0487: sipush 14808
      // 048a: sipush 3151
      // 048d: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0490: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 0493: athrow
      // 0494: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0497: athrow
      // 0498: aload 12
      // 049a: iload 14
      // 049c: baload
      // 049d: sipush 13105
      // 04a0: ldc2_w 2239208090822473729
      // 04a3: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 04a6: iload 3
      // 04a7: ifne 051a
      // 04aa: if_icmpne 0505
      // 04ad: goto 04b4
      // 04b0: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04b3: athrow
      // 04b4: aload 12
      // 04b6: iload 14
      // 04b8: bipush 1
      // 04b9: iadd
      // 04ba: baload
      // 04bb: sipush 30786
      // 04be: ldc2_w 5537969977913258775
      // 04c1: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 04c4: iload 3
      // 04c5: ifne 051a
      // 04c8: goto 04cf
      // 04cb: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04ce: athrow
      // 04cf: if_icmpne 0505
      // 04d2: goto 04d9
      // 04d5: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04d8: athrow
      // 04d9: aload 12
      // 04db: iload 14
      // 04dd: bipush 2
      // 04de: iadd
      // 04df: baload
      // 04e0: sipush 24697
      // 04e3: ldc2_w 6251920274664532834
      // 04e6: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 04e9: iload 3
      // 04ea: ifne 051a
      // 04ed: goto 04f4
      // 04f0: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04f3: athrow
      // 04f4: if_icmpne 0505
      // 04f7: goto 04fe
      // 04fa: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04fd: athrow
      // 04fe: bipush 1
      // 04ff: istore 8
      // 0501: iload 3
      // 0502: ifeq 094b
      // 0505: aload 12
      // 0507: iload 14
      // 0509: baload
      // 050a: sipush 16093
      // 050d: ldc2_w 3402377838021539289
      // 0510: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0513: goto 051a
      // 0516: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0519: athrow
      // 051a: iload 3
      // 051b: ifne 058e
      // 051e: if_icmpne 0579
      // 0521: goto 0528
      // 0524: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0527: athrow
      // 0528: aload 12
      // 052a: iload 14
      // 052c: bipush 1
      // 052d: iadd
      // 052e: baload
      // 052f: sipush 23661
      // 0532: ldc2_w 2623436264991528828
      // 0535: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0538: iload 3
      // 0539: ifne 058e
      // 053c: goto 0543
      // 053f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0542: athrow
      // 0543: if_icmpne 0579
      // 0546: goto 054d
      // 0549: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 054c: athrow
      // 054d: aload 12
      // 054f: iload 14
      // 0551: bipush 2
      // 0552: iadd
      // 0553: baload
      // 0554: sipush 24697
      // 0557: ldc2_w 6251920274664532834
      // 055a: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 055d: iload 3
      // 055e: ifne 058e
      // 0561: goto 0568
      // 0564: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0567: athrow
      // 0568: if_icmpne 0579
      // 056b: goto 0572
      // 056e: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0571: athrow
      // 0572: bipush 2
      // 0573: istore 8
      // 0575: iload 3
      // 0576: ifeq 094b
      // 0579: aload 12
      // 057b: iload 14
      // 057d: baload
      // 057e: sipush 16095
      // 0581: ldc2_w 5012832626146899446
      // 0584: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0587: goto 058e
      // 058a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 058d: athrow
      // 058e: iload 3
      // 058f: ifne 05dd
      // 0592: if_icmpne 05c8
      // 0595: goto 059c
      // 0598: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059b: athrow
      // 059c: aload 12
      // 059e: iload 14
      // 05a0: bipush 1
      // 05a1: iadd
      // 05a2: baload
      // 05a3: sipush 20103
      // 05a6: ldc2_w 3519231187567543740
      // 05a9: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 05ac: iload 3
      // 05ad: ifne 05dd
      // 05b0: goto 05b7
      // 05b3: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05b6: athrow
      // 05b7: if_icmpne 05c8
      // 05ba: goto 05c1
      // 05bd: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c0: athrow
      // 05c1: bipush 3
      // 05c2: istore 8
      // 05c4: iload 3
      // 05c5: ifeq 094b
      // 05c8: aload 12
      // 05ca: iload 14
      // 05cc: baload
      // 05cd: sipush 23661
      // 05d0: ldc2_w 2623436264991528828
      // 05d3: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 05d6: goto 05dd
      // 05d9: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05dc: athrow
      // 05dd: iload 3
      // 05de: ifne 0654
      // 05e1: if_icmpne 063f
      // 05e4: goto 05eb
      // 05e7: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05ea: athrow
      // 05eb: aload 12
      // 05ed: iload 14
      // 05ef: bipush 1
      // 05f0: iadd
      // 05f1: baload
      // 05f2: sipush 23661
      // 05f5: ldc2_w 2623436264991528828
      // 05f8: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 05fb: iload 3
      // 05fc: ifne 0654
      // 05ff: goto 0606
      // 0602: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0605: athrow
      // 0606: if_icmpne 063f
      // 0609: goto 0610
      // 060c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 060f: athrow
      // 0610: aload 12
      // 0612: iload 14
      // 0614: bipush 2
      // 0615: iadd
      // 0616: baload
      // 0617: sipush 32578
      // 061a: ldc2_w 7671628464369054804
      // 061d: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0620: iload 3
      // 0621: ifne 0654
      // 0624: goto 062b
      // 0627: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 062a: athrow
      // 062b: if_icmpne 063f
      // 062e: goto 0635
      // 0631: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0634: athrow
      // 0635: bipush 4
      // 0636: istore 8
      // 0638: bipush 1
      // 0639: istore 9
      // 063b: iload 3
      // 063c: ifeq 094b
      // 063f: iload 14
      // 0641: sipush 8719
      // 0644: ldc2_w 2300790314217662746
      // 0647: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 064a: iadd
      // 064b: iload 13
      // 064d: goto 0654
      // 0650: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0653: athrow
      // 0654: iload 3
      // 0655: ifne 079b
      // 0658: if_icmpge 077b
      // 065b: goto 0662
      // 065e: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0661: athrow
      // 0662: aload 12
      // 0664: iload 14
      // 0666: baload
      // 0667: sipush 15693
      // 066a: ldc2_w 4459450450045269568
      // 066d: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0670: iload 3
      // 0671: ifne 079b
      // 0674: goto 067b
      // 0677: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 067a: athrow
      // 067b: if_icmpne 077b
      // 067e: goto 0685
      // 0681: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0684: athrow
      // 0685: aload 12
      // 0687: iload 14
      // 0689: bipush 1
      // 068a: iadd
      // 068b: baload
      // 068c: sipush 10740
      // 068f: ldc2_w 3041300376241627899
      // 0692: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0695: iload 3
      // 0696: ifne 079b
      // 0699: goto 06a0
      // 069c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 069f: athrow
      // 06a0: if_icmpne 077b
      // 06a3: goto 06aa
      // 06a6: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06a9: athrow
      // 06aa: aload 12
      // 06ac: iload 14
      // 06ae: bipush 2
      // 06af: iadd
      // 06b0: baload
      // 06b1: sipush 6664
      // 06b4: ldc2_w 4599137185193382152
      // 06b7: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 06ba: iload 3
      // 06bb: ifne 079b
      // 06be: goto 06c5
      // 06c1: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c4: athrow
      // 06c5: if_icmpne 077b
      // 06c8: goto 06cf
      // 06cb: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06ce: athrow
      // 06cf: aload 12
      // 06d1: iload 14
      // 06d3: bipush 3
      // 06d4: iadd
      // 06d5: baload
      // 06d6: sipush 23592
      // 06d9: ldc2_w 2779095597158438658
      // 06dc: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 06df: iload 3
      // 06e0: ifne 079b
      // 06e3: goto 06ea
      // 06e6: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06e9: athrow
      // 06ea: if_icmpne 077b
      // 06ed: goto 06f4
      // 06f0: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06f3: athrow
      // 06f4: aload 12
      // 06f6: iload 14
      // 06f8: bipush 4
      // 06f9: iadd
      // 06fa: baload
      // 06fb: sipush 24697
      // 06fe: ldc2_w 6251920274664532834
      // 0701: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0704: iload 3
      // 0705: ifne 079b
      // 0708: goto 070f
      // 070b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 070e: athrow
      // 070f: if_icmpne 077b
      // 0712: goto 0719
      // 0715: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0718: athrow
      // 0719: aload 12
      // 071b: iload 14
      // 071d: bipush 5
      // 071e: iadd
      // 071f: baload
      // 0720: sipush 9375
      // 0723: ldc2_w 1023435484431118254
      // 0726: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0729: iload 3
      // 072a: ifne 079b
      // 072d: goto 0734
      // 0730: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0733: athrow
      // 0734: if_icmpne 077b
      // 0737: goto 073e
      // 073a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073d: athrow
      // 073e: aload 12
      // 0740: iload 14
      // 0742: sipush 8719
      // 0745: ldc2_w 2300790314217662746
      // 0748: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 074b: iadd
      // 074c: baload
      // 074d: sipush 16095
      // 0750: ldc2_w 5012832626146899446
      // 0753: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0756: iload 3
      // 0757: ifne 079b
      // 075a: goto 0761
      // 075d: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0760: athrow
      // 0761: if_icmpne 077b
      // 0764: goto 076b
      // 0767: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 076a: athrow
      // 076b: bipush 4
      // 076c: istore 8
      // 076e: bipush 3
      // 076f: istore 9
      // 0771: bipush 0
      // 0772: istore 5
      // 0774: iinc 14 3
      // 0777: iload 3
      // 0778: ifeq 094b
      // 077b: iload 14
      // 077d: sipush 13149
      // 0780: ldc2_w 7229790906152810594
      // 0783: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0786: iadd
      // 0787: iload 3
      // 0788: ifne 091e
      // 078b: goto 0792
      // 078e: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0791: athrow
      // 0792: iload 13
      // 0794: goto 079b
      // 0797: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 079a: athrow
      // 079b: if_icmpge 090e
      // 079e: aload 12
      // 07a0: iload 14
      // 07a2: baload
      // 07a3: iload 3
      // 07a4: ifne 091e
      // 07a7: goto 07ae
      // 07aa: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07ad: athrow
      // 07ae: sipush 16095
      // 07b1: ldc2_w 5012832626146899446
      // 07b4: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 07b7: if_icmpne 090e
      // 07ba: goto 07c1
      // 07bd: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07c0: athrow
      // 07c1: aload 12
      // 07c3: iload 14
      // 07c5: bipush 1
      // 07c6: iadd
      // 07c7: baload
      // 07c8: iload 3
      // 07c9: ifne 091e
      // 07cc: goto 07d3
      // 07cf: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07d2: athrow
      // 07d3: sipush 20437
      // 07d6: ldc2_w 1502467788542051578
      // 07d9: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 07dc: if_icmpne 090e
      // 07df: goto 07e6
      // 07e2: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07e5: athrow
      // 07e6: aload 12
      // 07e8: iload 14
      // 07ea: bipush 2
      // 07eb: iadd
      // 07ec: baload
      // 07ed: iload 3
      // 07ee: ifne 091e
      // 07f1: goto 07f8
      // 07f4: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f7: athrow
      // 07f8: sipush 15884
      // 07fb: ldc2_w 635477039506748754
      // 07fe: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0801: if_icmpne 090e
      // 0804: goto 080b
      // 0807: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 080a: athrow
      // 080b: aload 12
      // 080d: iload 14
      // 080f: bipush 3
      // 0810: iadd
      // 0811: baload
      // 0812: iload 3
      // 0813: ifne 091e
      // 0816: goto 081d
      // 0819: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 081c: athrow
      // 081d: sipush 10740
      // 0820: ldc2_w 3041300376241627899
      // 0823: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0826: if_icmpne 090e
      // 0829: goto 0830
      // 082c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 082f: athrow
      // 0830: aload 12
      // 0832: iload 14
      // 0834: bipush 4
      // 0835: iadd
      // 0836: baload
      // 0837: iload 3
      // 0838: ifne 091e
      // 083b: goto 0842
      // 083e: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0841: athrow
      // 0842: sipush 23209
      // 0845: ldc2_w 3046708869322707446
      // 0848: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 084b: if_icmpne 090e
      // 084e: goto 0855
      // 0851: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0854: athrow
      // 0855: aload 12
      // 0857: iload 14
      // 0859: bipush 5
      // 085a: iadd
      // 085b: baload
      // 085c: iload 3
      // 085d: ifne 091e
      // 0860: goto 0867
      // 0863: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0866: athrow
      // 0867: sipush 12913
      // 086a: ldc2_w 1569207235808327970
      // 086d: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0870: if_icmpne 090e
      // 0873: goto 087a
      // 0876: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0879: athrow
      // 087a: aload 12
      // 087c: iload 14
      // 087e: sipush 8719
      // 0881: ldc2_w 2300790314217662746
      // 0884: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0887: iadd
      // 0888: baload
      // 0889: iload 3
      // 088a: ifne 091e
      // 088d: goto 0894
      // 0890: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0893: athrow
      // 0894: sipush 22618
      // 0897: ldc2_w 8087045211128435559
      // 089a: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 089d: if_icmpne 090e
      // 08a0: goto 08a7
      // 08a3: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08a6: athrow
      // 08a7: aload 12
      // 08a9: iload 14
      // 08ab: sipush 16306
      // 08ae: ldc2_w 1397713470097519840
      // 08b1: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 08b4: iadd
      // 08b5: baload
      // 08b6: iload 3
      // 08b7: ifne 091e
      // 08ba: goto 08c1
      // 08bd: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c0: athrow
      // 08c1: sipush 16095
      // 08c4: ldc2_w 5012832626146899446
      // 08c7: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 08ca: if_icmpne 090e
      // 08cd: goto 08d4
      // 08d0: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08d3: athrow
      // 08d4: aload 12
      // 08d6: iload 14
      // 08d8: sipush 13149
      // 08db: ldc2_w 7229790906152810594
      // 08de: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 08e1: iadd
      // 08e2: baload
      // 08e3: iload 3
      // 08e4: ifne 091e
      // 08e7: goto 08ee
      // 08ea: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08ed: athrow
      // 08ee: sipush 674
      // 08f1: ldc2_w 8374714161534618082
      // 08f4: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 08f7: if_icmpne 090e
      // 08fa: goto 0901
      // 08fd: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0900: athrow
      // 0901: bipush 4
      // 0902: istore 8
      // 0904: bipush 3
      // 0905: istore 9
      // 0907: iinc 14 5
      // 090a: iload 3
      // 090b: ifeq 094b
      // 090e: aload 12
      // 0910: iload 14
      // 0912: iload 13
      // 0914: invokestatic com/finalshell/core/Ls4.v ([BII)Z
      // 0917: goto 091e
      // 091a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 091d: athrow
      // 091e: iload 3
      // 091f: ifne 0930
      // 0922: ifeq 0936
      // 0925: goto 092c
      // 0928: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 092b: athrow
      // 092c: bipush 4
      // 092d: istore 8
      // 092f: bipush 4
      // 0930: istore 9
      // 0932: iload 3
      // 0933: ifeq 094b
      // 0936: new com/finalshell/core/Pc2
      // 0939: dup
      // 093a: sipush 14808
      // 093d: sipush 3151
      // 0940: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0943: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 0946: athrow
      // 0947: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094a: athrow
      // 094b: iinc 14 3
      // 094e: iload 3
      // 094f: ifeq 03ad
      // 0952: aload 12
      // 0954: iload 14
      // 0956: baload
      // 0957: sipush 24697
      // 095a: ldc2_w 6251920274664532834
      // 095d: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0960: iload 3
      // 0961: ifne 0b2c
      // 0964: if_icmpne 0b1e
      // 0967: goto 096e
      // 096a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096d: athrow
      // 096e: iload 14
      // 0970: sipush 16306
      // 0973: ldc2_w 1397713470097519840
      // 0976: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0979: iadd
      // 097a: iload 13
      // 097c: iload 3
      // 097d: ifne 0b2c
      // 0980: goto 0987
      // 0983: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0986: athrow
      // 0987: if_icmpge 0b1e
      // 098a: goto 0991
      // 098d: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0990: athrow
      // 0991: aload 12
      // 0993: iload 14
      // 0995: bipush 1
      // 0996: iadd
      // 0997: baload
      // 0998: sipush 16095
      // 099b: ldc2_w 5012832626146899446
      // 099e: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 09a1: iload 3
      // 09a2: ifne 0b2c
      // 09a5: goto 09ac
      // 09a8: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09ab: athrow
      // 09ac: if_icmpne 0b1e
      // 09af: goto 09b6
      // 09b2: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09b5: athrow
      // 09b6: aload 12
      // 09b8: iload 14
      // 09ba: bipush 2
      // 09bb: iadd
      // 09bc: baload
      // 09bd: sipush 23661
      // 09c0: ldc2_w 2623436264991528828
      // 09c3: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 09c6: iload 3
      // 09c7: ifne 0b2c
      // 09ca: goto 09d1
      // 09cd: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09d0: athrow
      // 09d1: if_icmpne 0b1e
      // 09d4: goto 09db
      // 09d7: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09da: athrow
      // 09db: aload 12
      // 09dd: iload 14
      // 09df: bipush 3
      // 09e0: iadd
      // 09e1: baload
      // 09e2: sipush 21996
      // 09e5: ldc2_w 8489794514723184369
      // 09e8: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 09eb: iload 3
      // 09ec: ifne 0b2c
      // 09ef: goto 09f6
      // 09f2: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09f5: athrow
      // 09f6: if_icmpne 0b1e
      // 09f9: goto 0a00
      // 09fc: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09ff: athrow
      // 0a00: aload 12
      // 0a02: iload 14
      // 0a04: bipush 4
      // 0a05: iadd
      // 0a06: baload
      // 0a07: sipush 1526
      // 0a0a: ldc2_w 1038944294053236452
      // 0a0d: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0a10: iload 3
      // 0a11: ifne 0b2c
      // 0a14: goto 0a1b
      // 0a17: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a1a: athrow
      // 0a1b: if_icmpne 0b1e
      // 0a1e: goto 0a25
      // 0a21: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a24: athrow
      // 0a25: aload 12
      // 0a27: iload 14
      // 0a29: bipush 5
      // 0a2a: iadd
      // 0a2b: baload
      // 0a2c: sipush 11185
      // 0a2f: ldc2_w 6502155801312354478
      // 0a32: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0a35: iload 3
      // 0a36: ifne 0b2c
      // 0a39: goto 0a40
      // 0a3c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a3f: athrow
      // 0a40: if_icmpne 0b1e
      // 0a43: goto 0a4a
      // 0a46: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a49: athrow
      // 0a4a: aload 12
      // 0a4c: iload 14
      // 0a4e: sipush 8719
      // 0a51: ldc2_w 2300790314217662746
      // 0a54: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0a57: iadd
      // 0a58: baload
      // 0a59: sipush 18529
      // 0a5c: ldc2_w 2288687143571096399
      // 0a5f: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0a62: iload 3
      // 0a63: ifne 0b2c
      // 0a66: goto 0a6d
      // 0a69: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a6c: athrow
      // 0a6d: if_icmpne 0b1e
      // 0a70: goto 0a77
      // 0a73: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a76: athrow
      // 0a77: aload 12
      // 0a79: iload 14
      // 0a7b: sipush 16306
      // 0a7e: ldc2_w 1397713470097519840
      // 0a81: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0a84: iadd
      // 0a85: baload
      // 0a86: sipush 21996
      // 0a89: ldc2_w 8489794514723184369
      // 0a8c: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0a8f: iload 3
      // 0a90: ifne 0b2c
      // 0a93: goto 0a9a
      // 0a96: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a99: athrow
      // 0a9a: if_icmpne 0b1e
      // 0a9d: goto 0aa4
      // 0aa0: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0aa3: athrow
      // 0aa4: iinc 14 8
      // 0aa7: sipush 14845
      // 0aaa: sipush -8074
      // 0aad: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0ab0: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 0ab3: iload 3
      // 0ab4: ifne 0ade
      // 0ab7: goto 0abe
      // 0aba: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0abd: athrow
      // 0abe: invokestatic com/finalshell/crypto/ConnectHost.X (Ljava/lang/String;)Z
      // 0ac1: ifeq 0b0d
      // 0ac4: goto 0acb
      // 0ac7: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0aca: athrow
      // 0acb: sipush 14845
      // 0ace: sipush -8074
      // 0ad1: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0ad4: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 0ad7: goto 0ade
      // 0ada: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0add: athrow
      // 0ade: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 0ae1: ldc_w com/finalshell/core/EU
      // 0ae4: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 0ae7: astore 15
      // 0ae9: aload 15
      // 0aeb: bipush 0
      // 0aec: anewarray 323
      // 0aef: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 0af2: bipush 0
      // 0af3: anewarray 4
      // 0af6: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 0af9: checkcast com/finalshell/core/EU
      // 0afc: astore 11
      // 0afe: aload 11
      // 0b00: invokeinterface com/finalshell/core/EU.w ()I 1
      // 0b05: newarray 8
      // 0b07: astore 4
      // 0b09: iload 3
      // 0b0a: ifeq 03ad
      // 0b0d: new com/finalshell/core/Pc2
      // 0b10: dup
      // 0b11: sipush 14847
      // 0b14: sipush 27403
      // 0b17: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0b1a: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 0b1d: athrow
      // 0b1e: aload 12
      // 0b20: iload 14
      // 0b22: baload
      // 0b23: sipush 24697
      // 0b26: ldc2_w 6251920274664532834
      // 0b29: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0b2c: iload 3
      // 0b2d: ifne 0cf8
      // 0b30: if_icmpne 0cea
      // 0b33: goto 0b3a
      // 0b36: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b39: athrow
      // 0b3a: iload 14
      // 0b3c: sipush 16306
      // 0b3f: ldc2_w 1397713470097519840
      // 0b42: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0b45: iadd
      // 0b46: iload 13
      // 0b48: iload 3
      // 0b49: ifne 0cf8
      // 0b4c: goto 0b53
      // 0b4f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b52: athrow
      // 0b53: if_icmpge 0cea
      // 0b56: goto 0b5d
      // 0b59: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b5c: athrow
      // 0b5d: aload 12
      // 0b5f: iload 14
      // 0b61: bipush 1
      // 0b62: iadd
      // 0b63: baload
      // 0b64: sipush 16095
      // 0b67: ldc2_w 5012832626146899446
      // 0b6a: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0b6d: iload 3
      // 0b6e: ifne 0cf8
      // 0b71: goto 0b78
      // 0b74: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b77: athrow
      // 0b78: if_icmpne 0cea
      // 0b7b: goto 0b82
      // 0b7e: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b81: athrow
      // 0b82: aload 12
      // 0b84: iload 14
      // 0b86: bipush 2
      // 0b87: iadd
      // 0b88: baload
      // 0b89: sipush 23661
      // 0b8c: ldc2_w 2623436264991528828
      // 0b8f: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0b92: iload 3
      // 0b93: ifne 0cf8
      // 0b96: goto 0b9d
      // 0b99: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b9c: athrow
      // 0b9d: if_icmpne 0cea
      // 0ba0: goto 0ba7
      // 0ba3: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ba6: athrow
      // 0ba7: aload 12
      // 0ba9: iload 14
      // 0bab: bipush 3
      // 0bac: iadd
      // 0bad: baload
      // 0bae: sipush 21996
      // 0bb1: ldc2_w 8489794514723184369
      // 0bb4: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0bb7: iload 3
      // 0bb8: ifne 0cf8
      // 0bbb: goto 0bc2
      // 0bbe: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bc1: athrow
      // 0bc2: if_icmpne 0cea
      // 0bc5: goto 0bcc
      // 0bc8: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bcb: athrow
      // 0bcc: aload 12
      // 0bce: iload 14
      // 0bd0: bipush 4
      // 0bd1: iadd
      // 0bd2: baload
      // 0bd3: sipush 20663
      // 0bd6: ldc2_w 5298670743960591264
      // 0bd9: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0bdc: iload 3
      // 0bdd: ifne 0cf8
      // 0be0: goto 0be7
      // 0be3: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be6: athrow
      // 0be7: if_icmpne 0cea
      // 0bea: goto 0bf1
      // 0bed: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bf0: athrow
      // 0bf1: aload 12
      // 0bf3: iload 14
      // 0bf5: bipush 5
      // 0bf6: iadd
      // 0bf7: baload
      // 0bf8: sipush 19967
      // 0bfb: ldc2_w 1261430376592803517
      // 0bfe: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0c01: iload 3
      // 0c02: ifne 0cf8
      // 0c05: goto 0c0c
      // 0c08: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c0b: athrow
      // 0c0c: if_icmpne 0cea
      // 0c0f: goto 0c16
      // 0c12: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c15: athrow
      // 0c16: aload 12
      // 0c18: iload 14
      // 0c1a: sipush 8719
      // 0c1d: ldc2_w 2300790314217662746
      // 0c20: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0c23: iadd
      // 0c24: baload
      // 0c25: sipush 27629
      // 0c28: ldc2_w 3683137660059033838
      // 0c2b: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0c2e: iload 3
      // 0c2f: ifne 0cf8
      // 0c32: goto 0c39
      // 0c35: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c38: athrow
      // 0c39: if_icmpne 0cea
      // 0c3c: goto 0c43
      // 0c3f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c42: athrow
      // 0c43: aload 12
      // 0c45: iload 14
      // 0c47: sipush 16306
      // 0c4a: ldc2_w 1397713470097519840
      // 0c4d: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0c50: iadd
      // 0c51: baload
      // 0c52: sipush 21996
      // 0c55: ldc2_w 8489794514723184369
      // 0c58: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0c5b: iload 3
      // 0c5c: ifne 0cf8
      // 0c5f: goto 0c66
      // 0c62: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c65: athrow
      // 0c66: if_icmpne 0cea
      // 0c69: goto 0c70
      // 0c6c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c6f: athrow
      // 0c70: iinc 14 8
      // 0c73: sipush 14762
      // 0c76: sipush 15173
      // 0c79: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0c7c: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 0c7f: iload 3
      // 0c80: ifne 0caa
      // 0c83: goto 0c8a
      // 0c86: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c89: athrow
      // 0c8a: invokestatic com/finalshell/crypto/ConnectHost.X (Ljava/lang/String;)Z
      // 0c8d: ifeq 0cd9
      // 0c90: goto 0c97
      // 0c93: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c96: athrow
      // 0c97: sipush 14801
      // 0c9a: sipush -11637
      // 0c9d: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0ca0: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 0ca3: goto 0caa
      // 0ca6: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ca9: athrow
      // 0caa: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 0cad: ldc_w com/finalshell/core/EU
      // 0cb0: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 0cb3: astore 15
      // 0cb5: aload 15
      // 0cb7: bipush 0
      // 0cb8: anewarray 323
      // 0cbb: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 0cbe: bipush 0
      // 0cbf: anewarray 4
      // 0cc2: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 0cc5: checkcast com/finalshell/core/EU
      // 0cc8: astore 11
      // 0cca: aload 11
      // 0ccc: invokeinterface com/finalshell/core/EU.w ()I 1
      // 0cd1: newarray 8
      // 0cd3: astore 4
      // 0cd5: iload 3
      // 0cd6: ifeq 03ad
      // 0cd9: new com/finalshell/core/Pc2
      // 0cdc: dup
      // 0cdd: sipush 14797
      // 0ce0: sipush 23636
      // 0ce3: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0ce6: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 0ce9: athrow
      // 0cea: aload 12
      // 0cec: iload 14
      // 0cee: baload
      // 0cef: sipush 24697
      // 0cf2: ldc2_w 6251920274664532834
      // 0cf5: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0cf8: iload 3
      // 0cf9: ifne 0ec4
      // 0cfc: if_icmpne 0eb6
      // 0cff: goto 0d06
      // 0d02: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d05: athrow
      // 0d06: iload 14
      // 0d08: sipush 16306
      // 0d0b: ldc2_w 1397713470097519840
      // 0d0e: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0d11: iadd
      // 0d12: iload 13
      // 0d14: iload 3
      // 0d15: ifne 0ec4
      // 0d18: goto 0d1f
      // 0d1b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d1e: athrow
      // 0d1f: if_icmpge 0eb6
      // 0d22: goto 0d29
      // 0d25: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d28: athrow
      // 0d29: aload 12
      // 0d2b: iload 14
      // 0d2d: bipush 1
      // 0d2e: iadd
      // 0d2f: baload
      // 0d30: sipush 16095
      // 0d33: ldc2_w 5012832626146899446
      // 0d36: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0d39: iload 3
      // 0d3a: ifne 0ec4
      // 0d3d: goto 0d44
      // 0d40: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d43: athrow
      // 0d44: if_icmpne 0eb6
      // 0d47: goto 0d4e
      // 0d4a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4d: athrow
      // 0d4e: aload 12
      // 0d50: iload 14
      // 0d52: bipush 2
      // 0d53: iadd
      // 0d54: baload
      // 0d55: sipush 23661
      // 0d58: ldc2_w 2623436264991528828
      // 0d5b: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0d5e: iload 3
      // 0d5f: ifne 0ec4
      // 0d62: goto 0d69
      // 0d65: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d68: athrow
      // 0d69: if_icmpne 0eb6
      // 0d6c: goto 0d73
      // 0d6f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d72: athrow
      // 0d73: aload 12
      // 0d75: iload 14
      // 0d77: bipush 3
      // 0d78: iadd
      // 0d79: baload
      // 0d7a: sipush 21996
      // 0d7d: ldc2_w 8489794514723184369
      // 0d80: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0d83: iload 3
      // 0d84: ifne 0ec4
      // 0d87: goto 0d8e
      // 0d8a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d8d: athrow
      // 0d8e: if_icmpne 0eb6
      // 0d91: goto 0d98
      // 0d94: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d97: athrow
      // 0d98: aload 12
      // 0d9a: iload 14
      // 0d9c: bipush 4
      // 0d9d: iadd
      // 0d9e: baload
      // 0d9f: sipush 31975
      // 0da2: ldc2_w 5987859931129558988
      // 0da5: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0da8: iload 3
      // 0da9: ifne 0ec4
      // 0dac: goto 0db3
      // 0daf: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0db2: athrow
      // 0db3: if_icmpne 0eb6
      // 0db6: goto 0dbd
      // 0db9: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dbc: athrow
      // 0dbd: aload 12
      // 0dbf: iload 14
      // 0dc1: bipush 5
      // 0dc2: iadd
      // 0dc3: baload
      // 0dc4: sipush 27629
      // 0dc7: ldc2_w 3683137660059033838
      // 0dca: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0dcd: iload 3
      // 0dce: ifne 0ec4
      // 0dd1: goto 0dd8
      // 0dd4: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dd7: athrow
      // 0dd8: if_icmpne 0eb6
      // 0ddb: goto 0de2
      // 0dde: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de1: athrow
      // 0de2: aload 12
      // 0de4: iload 14
      // 0de6: sipush 8719
      // 0de9: ldc2_w 2300790314217662746
      // 0dec: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0def: iadd
      // 0df0: baload
      // 0df1: sipush 13286
      // 0df4: ldc2_w 3408189054885525750
      // 0df7: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0dfa: iload 3
      // 0dfb: ifne 0ec4
      // 0dfe: goto 0e05
      // 0e01: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e04: athrow
      // 0e05: if_icmpne 0eb6
      // 0e08: goto 0e0f
      // 0e0b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e0e: athrow
      // 0e0f: aload 12
      // 0e11: iload 14
      // 0e13: sipush 16306
      // 0e16: ldc2_w 1397713470097519840
      // 0e19: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0e1c: iadd
      // 0e1d: baload
      // 0e1e: sipush 21996
      // 0e21: ldc2_w 8489794514723184369
      // 0e24: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0e27: iload 3
      // 0e28: ifne 0ec4
      // 0e2b: goto 0e32
      // 0e2e: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e31: athrow
      // 0e32: if_icmpne 0eb6
      // 0e35: goto 0e3c
      // 0e38: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e3b: athrow
      // 0e3c: iinc 14 8
      // 0e3f: sipush 14778
      // 0e42: sipush -25443
      // 0e45: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0e48: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 0e4b: iload 3
      // 0e4c: ifne 0e76
      // 0e4f: goto 0e56
      // 0e52: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e55: athrow
      // 0e56: invokestatic com/finalshell/crypto/ConnectHost.X (Ljava/lang/String;)Z
      // 0e59: ifeq 0ea5
      // 0e5c: goto 0e63
      // 0e5f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e62: athrow
      // 0e63: sipush 14784
      // 0e66: sipush -7096
      // 0e69: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0e6c: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 0e6f: goto 0e76
      // 0e72: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e75: athrow
      // 0e76: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 0e79: ldc_w com/finalshell/core/EU
      // 0e7c: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 0e7f: astore 15
      // 0e81: aload 15
      // 0e83: bipush 0
      // 0e84: anewarray 323
      // 0e87: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 0e8a: bipush 0
      // 0e8b: anewarray 4
      // 0e8e: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 0e91: checkcast com/finalshell/core/EU
      // 0e94: astore 11
      // 0e96: aload 11
      // 0e98: invokeinterface com/finalshell/core/EU.w ()I 1
      // 0e9d: newarray 8
      // 0e9f: astore 4
      // 0ea1: iload 3
      // 0ea2: ifeq 03ad
      // 0ea5: new com/finalshell/core/Pc2
      // 0ea8: dup
      // 0ea9: sipush 14777
      // 0eac: sipush -30366
      // 0eaf: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0eb2: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 0eb5: athrow
      // 0eb6: aload 12
      // 0eb8: iload 14
      // 0eba: baload
      // 0ebb: sipush 15884
      // 0ebe: ldc2_w 635477039506748754
      // 0ec1: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0ec4: iload 3
      // 0ec5: ifne 0fba
      // 0ec8: if_icmpne 0fac
      // 0ecb: goto 0ed2
      // 0ece: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ed1: athrow
      // 0ed2: iload 14
      // 0ed4: bipush 3
      // 0ed5: iadd
      // 0ed6: iload 13
      // 0ed8: iload 3
      // 0ed9: ifne 0fba
      // 0edc: goto 0ee3
      // 0edf: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ee2: athrow
      // 0ee3: if_icmpge 0fac
      // 0ee6: goto 0eed
      // 0ee9: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0eec: athrow
      // 0eed: aload 12
      // 0eef: iload 14
      // 0ef1: bipush 1
      // 0ef2: iadd
      // 0ef3: baload
      // 0ef4: sipush 12296
      // 0ef7: ldc2_w 9019184063415974729
      // 0efa: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0efd: iload 3
      // 0efe: ifne 0fba
      // 0f01: goto 0f08
      // 0f04: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f07: athrow
      // 0f08: if_icmpne 0fac
      // 0f0b: goto 0f12
      // 0f0e: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f11: athrow
      // 0f12: aload 12
      // 0f14: iload 14
      // 0f16: bipush 2
      // 0f17: iadd
      // 0f18: baload
      // 0f19: sipush 15884
      // 0f1c: ldc2_w 635477039506748754
      // 0f1f: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0f22: iload 3
      // 0f23: ifne 0fba
      // 0f26: goto 0f2d
      // 0f29: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2c: athrow
      // 0f2d: if_icmpne 0fac
      // 0f30: goto 0f37
      // 0f33: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f36: athrow
      // 0f37: aload 12
      // 0f39: iload 14
      // 0f3b: bipush 3
      // 0f3c: iadd
      // 0f3d: baload
      // 0f3e: sipush 2451
      // 0f41: ldc2_w 6195074457907479185
      // 0f44: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0f47: iload 3
      // 0f48: ifne 0fba
      // 0f4b: goto 0f52
      // 0f4e: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f51: athrow
      // 0f52: if_icmpne 0fac
      // 0f55: goto 0f5c
      // 0f58: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f5b: athrow
      // 0f5c: iinc 14 4
      // 0f5f: bipush 0
      // 0f60: istore 15
      // 0f62: iload 15
      // 0f64: aload 4
      // 0f66: arraylength
      // 0f67: if_icmpge 0fa8
      // 0f6a: aload 4
      // 0f6c: iload 15
      // 0f6e: aload 12
      // 0f70: iload 14
      // 0f72: iinc 14 1
      // 0f75: baload
      // 0f76: invokestatic com/finalshell/core/Ls4.W (B)B
      // 0f79: bipush 4
      // 0f7a: ishl
      // 0f7b: sipush 714
      // 0f7e: ldc2_w 6079390062994049438
      // 0f81: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0f84: iand
      // 0f85: aload 12
      // 0f87: iload 14
      // 0f89: iinc 14 1
      // 0f8c: baload
      // 0f8d: invokestatic com/finalshell/core/Ls4.W (B)B
      // 0f90: sipush 32668
      // 0f93: ldc2_w 2125845722715174056
      // 0f96: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0f99: iand
      // 0f9a: iadd
      // 0f9b: i2b
      // 0f9c: bastore
      // 0f9d: iinc 15 1
      // 0fa0: iload 3
      // 0fa1: ifne 03ad
      // 0fa4: iload 3
      // 0fa5: ifeq 0f62
      // 0fa8: iload 3
      // 0fa9: ifeq 03ad
      // 0fac: aload 12
      // 0fae: iload 14
      // 0fb0: baload
      // 0fb1: sipush 17717
      // 0fb4: ldc2_w 5788020884913720895
      // 0fb7: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0fba: iload 3
      // 0fbb: ifne 1025
      // 0fbe: if_icmpne 1017
      // 0fc1: goto 0fc8
      // 0fc4: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc7: athrow
      // 0fc8: iload 14
      // 0fca: bipush 1
      // 0fcb: iadd
      // 0fcc: aload 12
      // 0fce: arraylength
      // 0fcf: iload 3
      // 0fd0: ifne 1025
      // 0fd3: goto 0fda
      // 0fd6: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd9: athrow
      // 0fda: if_icmpge 1017
      // 0fdd: goto 0fe4
      // 0fe0: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fe3: athrow
      // 0fe4: aload 12
      // 0fe6: iload 14
      // 0fe8: bipush 1
      // 0fe9: iadd
      // 0fea: baload
      // 0feb: sipush 7986
      // 0fee: ldc2_w 1137286668398613566
      // 0ff1: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0ff4: iload 3
      // 0ff5: ifne 1025
      // 0ff8: goto 0fff
      // 0ffb: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ffe: athrow
      // 0fff: if_icmpne 1017
      // 1002: goto 1009
      // 1005: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1008: athrow
      // 1009: iinc 14 1
      // 100c: iload 3
      // 100d: ifeq 03ad
      // 1010: goto 1017
      // 1013: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1016: athrow
      // 1017: aload 12
      // 1019: iload 14
      // 101b: baload
      // 101c: sipush 7986
      // 101f: ldc2_w 1137286668398613566
      // 1022: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1025: iload 3
      // 1026: ifne 1041
      // 1029: if_icmpne 11aa
      // 102c: goto 1033
      // 102f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1032: athrow
      // 1033: iload 14
      // 1035: bipush 1
      // 1036: iadd
      // 1037: aload 12
      // 1039: arraylength
      // 103a: goto 1041
      // 103d: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1040: athrow
      // 1041: iload 3
      // 1042: ifne 1066
      // 1045: if_icmpge 11aa
      // 1048: goto 104f
      // 104b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 104e: athrow
      // 104f: aload 12
      // 1051: iload 14
      // 1053: bipush 1
      // 1054: iadd
      // 1055: baload
      // 1056: sipush 7986
      // 1059: ldc2_w 1137286668398613566
      // 105c: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 105f: goto 1066
      // 1062: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1065: athrow
      // 1066: iload 3
      // 1067: ifne 10a4
      // 106a: if_icmpne 1082
      // 106d: goto 1074
      // 1070: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1073: athrow
      // 1074: iinc 14 2
      // 1077: iload 3
      // 1078: ifeq 11b8
      // 107b: goto 1082
      // 107e: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1081: athrow
      // 1082: aload 12
      // 1084: iload 14
      // 1086: bipush 1
      // 1087: iadd
      // 1088: baload
      // 1089: iload 3
      // 108a: ifne 10fe
      // 108d: goto 1094
      // 1090: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1093: athrow
      // 1094: sipush 17717
      // 1097: ldc2_w 5788020884913720895
      // 109a: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 109d: goto 10a4
      // 10a0: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10a3: athrow
      // 10a4: if_icmpne 10f6
      // 10a7: iload 14
      // 10a9: bipush 2
      // 10aa: iadd
      // 10ab: iload 3
      // 10ac: ifne 10fe
      // 10af: goto 10b6
      // 10b2: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10b5: athrow
      // 10b6: aload 12
      // 10b8: arraylength
      // 10b9: if_icmpge 10f6
      // 10bc: goto 10c3
      // 10bf: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10c2: athrow
      // 10c3: aload 12
      // 10c5: iload 14
      // 10c7: bipush 2
      // 10c8: iadd
      // 10c9: baload
      // 10ca: iload 3
      // 10cb: ifne 10fe
      // 10ce: goto 10d5
      // 10d1: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10d4: athrow
      // 10d5: sipush 7986
      // 10d8: ldc2_w 1137286668398613566
      // 10db: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 10de: if_icmpne 10f6
      // 10e1: goto 10e8
      // 10e4: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10e7: athrow
      // 10e8: iinc 14 3
      // 10eb: iload 3
      // 10ec: ifeq 11b8
      // 10ef: goto 10f6
      // 10f2: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10f5: athrow
      // 10f6: bipush 0
      // 10f7: goto 10fe
      // 10fa: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10fd: athrow
      // 10fe: istore 15
      // 1100: iload 14
      // 1102: bipush 1
      // 1103: iadd
      // 1104: istore 16
      // 1106: iload 16
      // 1108: aload 12
      // 110a: arraylength
      // 110b: if_icmpge 1171
      // 110e: aload 12
      // 1110: iload 16
      // 1112: baload
      // 1113: sipush 7986
      // 1116: ldc2_w 1137286668398613566
      // 1119: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 111c: iload 3
      // 111d: ifne 03b1
      // 1120: iload 3
      // 1121: ifne 1159
      // 1124: if_icmpne 1139
      // 1127: goto 112e
      // 112a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 112d: athrow
      // 112e: iload 3
      // 112f: ifeq 1171
      // 1132: goto 1139
      // 1135: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1138: athrow
      // 1139: aload 12
      // 113b: iload 16
      // 113d: baload
      // 113e: iload 3
      // 113f: ifne 115d
      // 1142: goto 1149
      // 1145: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1148: athrow
      // 1149: sipush 7318
      // 114c: ldc2_w 6446075296154965952
      // 114f: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1152: goto 1159
      // 1155: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1158: athrow
      // 1159: if_icmpne 1163
      // 115c: bipush 1
      // 115d: istore 15
      // 115f: iload 3
      // 1160: ifeq 1171
      // 1163: iinc 16 1
      // 1166: iload 3
      // 1167: ifeq 1106
      // 116a: goto 1171
      // 116d: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1170: athrow
      // 1171: iload 15
      // 1173: iload 3
      // 1174: ifne 118d
      // 1177: ifne 11aa
      // 117a: goto 1181
      // 117d: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1180: athrow
      // 1181: iinc 14 1
      // 1184: iload 9
      // 1186: goto 118d
      // 1189: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 118c: athrow
      // 118d: iload 3
      // 118e: ifne 11a4
      // 1191: bipush 3
      // 1192: if_icmpeq 11b8
      // 1195: goto 119c
      // 1198: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 119b: athrow
      // 119c: bipush 0
      // 119d: goto 11a4
      // 11a0: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11a3: athrow
      // 11a4: istore 5
      // 11a6: iload 3
      // 11a7: ifeq 11b8
      // 11aa: iinc 14 1
      // 11ad: iload 3
      // 11ae: ifeq 03ad
      // 11b1: goto 11b8
      // 11b4: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11b7: athrow
      // 11b8: aload 12
      // 11ba: ifnull 1381
      // 11bd: iload 8
      // 11bf: goto 11c6
      // 11c2: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11c5: athrow
      // 11c6: iload 3
      // 11c7: ifne 11eb
      // 11ca: ifne 11e9
      // 11cd: goto 11d4
      // 11d0: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11d3: athrow
      // 11d4: new com/finalshell/core/Pc2
      // 11d7: dup
      // 11d8: sipush 14808
      // 11db: sipush 3151
      // 11de: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 11e1: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 11e4: athrow
      // 11e5: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11e8: athrow
      // 11e9: iload 14
      // 11eb: istore 15
      // 11ed: iload 14
      // 11ef: iload 13
      // 11f1: if_icmpge 1229
      // 11f4: aload 12
      // 11f6: iload 14
      // 11f8: baload
      // 11f9: sipush 21996
      // 11fc: ldc2_w 8489794514723184369
      // 11ff: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1202: iload 3
      // 1203: ifne 122d
      // 1206: if_icmpne 121b
      // 1209: goto 1210
      // 120c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 120f: athrow
      // 1210: iload 3
      // 1211: ifeq 1229
      // 1214: goto 121b
      // 1217: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 121a: athrow
      // 121b: iinc 14 1
      // 121e: iload 3
      // 121f: ifeq 11ed
      // 1222: goto 1229
      // 1225: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1228: athrow
      // 1229: iload 13
      // 122b: iload 14
      // 122d: isub
      // 122e: iload 3
      // 122f: ifne 1248
      // 1232: ifeq 1256
      // 1235: goto 123c
      // 1238: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 123b: athrow
      // 123c: iload 14
      // 123e: iload 15
      // 1240: isub
      // 1241: goto 1248
      // 1244: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1247: athrow
      // 1248: iload 3
      // 1249: ifne 1270
      // 124c: ifne 126b
      // 124f: goto 1256
      // 1252: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1255: athrow
      // 1256: new com/finalshell/core/Pc2
      // 1259: dup
      // 125a: sipush 14808
      // 125d: sipush 3151
      // 1260: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 1263: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 1266: athrow
      // 1267: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 126a: athrow
      // 126b: iload 14
      // 126d: iload 15
      // 126f: isub
      // 1270: newarray 8
      // 1272: astore 16
      // 1274: aload 12
      // 1276: iload 15
      // 1278: aload 16
      // 127a: bipush 0
      // 127b: aload 16
      // 127d: arraylength
      // 127e: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1281: aload 16
      // 1283: astore 17
      // 1285: bipush 0
      // 1286: istore 15
      // 1288: bipush 0
      // 1289: istore 14
      // 128b: aload 17
      // 128d: arraylength
      // 128e: istore 18
      // 1290: iload 14
      // 1292: iload 18
      // 1294: if_icmpge 1366
      // 1297: aload 17
      // 1299: iload 14
      // 129b: baload
      // 129c: sipush 7986
      // 129f: ldc2_w 1137286668398613566
      // 12a2: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 12a5: iload 3
      // 12a6: ifne 136a
      // 12a9: iload 3
      // 12aa: ifne 134a
      // 12ad: goto 12b4
      // 12b0: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12b3: athrow
      // 12b4: if_icmpne 133c
      // 12b7: goto 12be
      // 12ba: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12bd: athrow
      // 12be: aload 17
      // 12c0: iload 14
      // 12c2: bipush 1
      // 12c3: isub
      // 12c4: baload
      // 12c5: iload 3
      // 12c6: ifne 12eb
      // 12c9: goto 12d0
      // 12cc: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12cf: athrow
      // 12d0: sipush 17717
      // 12d3: ldc2_w 5788020884913720895
      // 12d6: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 12d9: if_icmpne 12ee
      // 12dc: goto 12e3
      // 12df: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12e2: athrow
      // 12e3: bipush 1
      // 12e4: goto 12eb
      // 12e7: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12ea: athrow
      // 12eb: goto 12ef
      // 12ee: bipush 0
      // 12ef: istore 19
      // 12f1: aload 17
      // 12f3: iload 14
      // 12f5: bipush 1
      // 12f6: iadd
      // 12f7: aload 17
      // 12f9: iload 14
      // 12fb: iload 19
      // 12fd: iload 3
      // 12fe: ifne 130c
      // 1301: ifeq 130f
      // 1304: goto 130b
      // 1307: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 130a: athrow
      // 130b: bipush 1
      // 130c: goto 1310
      // 130f: bipush 0
      // 1310: isub
      // 1311: iload 18
      // 1313: iload 14
      // 1315: bipush 1
      // 1316: iadd
      // 1317: isub
      // 1318: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 131b: iload 3
      // 131c: ifne 1338
      // 131f: iload 19
      // 1321: ifeq 1335
      // 1324: goto 132b
      // 1327: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 132a: athrow
      // 132b: iinc 18 -1
      // 132e: goto 1335
      // 1331: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1334: athrow
      // 1335: iinc 18 -1
      // 1338: iload 3
      // 1339: ifeq 1290
      // 133c: aload 17
      // 133e: iload 14
      // 1340: baload
      // 1341: sipush 21996
      // 1344: ldc2_w 8489794514723184369
      // 1347: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 134a: if_icmpne 1358
      // 134d: iload 3
      // 134e: ifeq 1366
      // 1351: goto 1358
      // 1354: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1357: athrow
      // 1358: iinc 14 1
      // 135b: iload 3
      // 135c: ifeq 1290
      // 135f: goto 1366
      // 1362: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1365: athrow
      // 1366: iload 14
      // 1368: iload 15
      // 136a: isub
      // 136b: ifle 137c
      // 136e: aload 17
      // 1370: iload 15
      // 1372: iload 14
      // 1374: iload 15
      // 1376: isub
      // 1377: invokestatic com/finalshell/core/E8.M ([BII)[B
      // 137a: astore 6
      // 137c: aload 17
      // 137e: invokestatic com/finalshell/core/E8.Q ([B)V
      // 1381: iload 9
      // 1383: bipush 4
      // 1384: if_icmpne 138e
      // 1387: aload 0
      // 1388: aload 6
      // 138a: invokestatic com/finalshell/core/Ls4.Q (Lcom/finalshell/core/Xe2;[B)Lcom/finalshell/core/Ls4;
      // 138d: areturn
      // 138e: aload 6
      // 1390: iload 3
      // 1391: ifne 154e
      // 1394: ifnull 154d
      // 1397: goto 139e
      // 139a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 139d: athrow
      // 139e: aload 6
      // 13a0: iload 3
      // 13a1: ifne 154e
      // 13a4: goto 13ab
      // 13a7: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13aa: athrow
      // 13ab: arraylength
      // 13ac: bipush 4
      // 13ad: if_icmple 154d
      // 13b0: goto 13b7
      // 13b3: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13b6: athrow
      // 13b7: aload 6
      // 13b9: iload 3
      // 13ba: ifne 154e
      // 13bd: goto 13c4
      // 13c0: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13c3: athrow
      // 13c4: bipush 0
      // 13c5: baload
      // 13c6: sipush 29208
      // 13c9: ldc2_w 3526762144639793446
      // 13cc: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 13cf: if_icmpne 154d
      // 13d2: goto 13d9
      // 13d5: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13d8: athrow
      // 13d9: aload 6
      // 13db: iload 3
      // 13dc: ifne 154e
      // 13df: goto 13e6
      // 13e2: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13e5: athrow
      // 13e6: bipush 1
      // 13e7: baload
      // 13e8: sipush 21656
      // 13eb: ldc2_w 9136637806575263648
      // 13ee: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 13f1: if_icmpne 154d
      // 13f4: goto 13fb
      // 13f7: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13fa: athrow
      // 13fb: aload 6
      // 13fd: iload 3
      // 13fe: ifne 154e
      // 1401: goto 1408
      // 1404: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1407: athrow
      // 1408: bipush 2
      // 1409: baload
      // 140a: sipush 31439
      // 140d: ldc2_w 1830851121782895100
      // 1410: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1413: if_icmpne 154d
      // 1416: goto 141d
      // 1419: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 141c: athrow
      // 141d: aload 6
      // 141f: iload 3
      // 1420: ifne 154e
      // 1423: goto 142a
      // 1426: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1429: athrow
      // 142a: bipush 3
      // 142b: baload
      // 142c: sipush 30006
      // 142f: ldc2_w 370359274300161585
      // 1432: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1435: if_icmpne 154d
      // 1438: goto 143f
      // 143b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 143e: athrow
      // 143f: new com/finalshell/core/UJ
      // 1442: dup
      // 1443: aload 6
      // 1445: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 1448: astore 15
      // 144a: aload 15
      // 144c: invokevirtual com/finalshell/core/UJ.d ()I
      // 144f: pop
      // 1450: aload 15
      // 1452: invokevirtual com/finalshell/core/UJ.d ()I
      // 1455: pop
      // 1456: aload 15
      // 1458: invokevirtual com/finalshell/core/UJ.S ()[B
      // 145b: astore 16
      // 145d: aload 15
      // 145f: invokevirtual com/finalshell/core/UJ.S ()[B
      // 1462: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 1465: astore 17
      // 1467: aload 17
      // 1469: sipush 14830
      // 146c: sipush 18540
      // 146f: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 1472: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1475: iload 3
      // 1476: ifne 14e1
      // 1479: ifeq 14d3
      // 147c: goto 1483
      // 147f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1482: athrow
      // 1483: aload 15
      // 1485: invokevirtual com/finalshell/core/UJ.d ()I
      // 1488: pop
      // 1489: aload 6
      // 148b: arraylength
      // 148c: aload 15
      // 148e: invokevirtual com/finalshell/core/UJ.R ()I
      // 1491: isub
      // 1492: newarray 8
      // 1494: astore 18
      // 1496: aload 15
      // 1498: aload 18
      // 149a: invokevirtual com/finalshell/core/UJ.W ([B)V
      // 149d: aload 18
      // 149f: astore 6
      // 14a1: bipush 1
      // 14a2: istore 5
      // 14a4: new com/finalshell/core/Pc2
      // 14a7: dup
      // 14a8: new java/lang/StringBuilder
      // 14ab: dup
      // 14ac: invokespecial java/lang/StringBuilder.<init> ()V
      // 14af: sipush 14826
      // 14b2: sipush -27773
      // 14b5: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 14b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14bb: aload 17
      // 14bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14c0: sipush 14818
      // 14c3: sipush 20804
      // 14c6: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 14c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14cc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 14cf: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 14d2: athrow
      // 14d3: aload 17
      // 14d5: sipush 14809
      // 14d8: sipush 983
      // 14db: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 14de: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 14e1: iload 3
      // 14e2: ifne 1507
      // 14e5: ifeq 151a
      // 14e8: goto 14ef
      // 14eb: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14ee: athrow
      // 14ef: aload 15
      // 14f1: invokevirtual com/finalshell/core/UJ.d ()I
      // 14f4: pop
      // 14f5: aload 15
      // 14f7: invokevirtual com/finalshell/core/UJ.d ()I
      // 14fa: pop
      // 14fb: bipush 0
      // 14fc: istore 5
      // 14fe: aload 6
      // 1500: arraylength
      // 1501: aload 15
      // 1503: invokevirtual com/finalshell/core/UJ.R ()I
      // 1506: isub
      // 1507: newarray 8
      // 1509: astore 18
      // 150b: aload 15
      // 150d: aload 18
      // 150f: invokevirtual com/finalshell/core/UJ.W ([B)V
      // 1512: aload 18
      // 1514: astore 6
      // 1516: iload 3
      // 1517: ifeq 154d
      // 151a: new com/finalshell/core/Pc2
      // 151d: dup
      // 151e: new java/lang/StringBuilder
      // 1521: dup
      // 1522: invokespecial java/lang/StringBuilder.<init> ()V
      // 1525: sipush 14826
      // 1528: sipush -27773
      // 152b: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 152e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1531: aload 17
      // 1533: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1536: sipush 14822
      // 1539: sipush -28773
      // 153c: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 153f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1542: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1545: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 1548: athrow
      // 1549: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 154c: athrow
      // 154d: aload 2
      // 154e: iload 3
      // 154f: ifne 1566
      // 1552: ifnull 1d74
      // 1555: goto 155c
      // 1558: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 155b: athrow
      // 155c: aload 2
      // 155d: astore 12
      // 155f: aload 12
      // 1561: arraylength
      // 1562: istore 13
      // 1564: aload 12
      // 1566: arraylength
      // 1567: bipush 4
      // 1568: iload 3
      // 1569: ifne 1855
      // 156c: if_icmple 1848
      // 156f: goto 1576
      // 1572: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1575: athrow
      // 1576: aload 12
      // 1578: bipush 0
      // 1579: baload
      // 157a: sipush 21996
      // 157d: ldc2_w 8489794514723184369
      // 1580: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1583: iload 3
      // 1584: ifne 1855
      // 1587: goto 158e
      // 158a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 158d: athrow
      // 158e: if_icmpne 1848
      // 1591: goto 1598
      // 1594: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1597: athrow
      // 1598: aload 12
      // 159a: bipush 1
      // 159b: baload
      // 159c: sipush 21996
      // 159f: ldc2_w 8489794514723184369
      // 15a2: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 15a5: iload 3
      // 15a6: ifne 1855
      // 15a9: goto 15b0
      // 15ac: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15af: athrow
      // 15b0: if_icmpne 1848
      // 15b3: goto 15ba
      // 15b6: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15b9: athrow
      // 15ba: aload 12
      // 15bc: bipush 2
      // 15bd: baload
      // 15be: sipush 21996
      // 15c1: ldc2_w 8489794514723184369
      // 15c4: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 15c7: iload 3
      // 15c8: ifne 1855
      // 15cb: goto 15d2
      // 15ce: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15d1: athrow
      // 15d2: if_icmpne 1848
      // 15d5: goto 15dc
      // 15d8: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15db: athrow
      // 15dc: aload 12
      // 15de: bipush 3
      // 15df: baload
      // 15e0: sipush 21996
      // 15e3: ldc2_w 8489794514723184369
      // 15e6: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 15e9: iload 3
      // 15ea: ifne 1855
      // 15ed: goto 15f4
      // 15f0: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15f3: athrow
      // 15f4: if_icmpne 1848
      // 15f7: goto 15fe
      // 15fa: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15fd: athrow
      // 15fe: bipush 1
      // 15ff: istore 15
      // 1601: bipush 0
      // 1602: istore 14
      // 1604: iinc 14 1
      // 1607: aload 12
      // 1609: arraylength
      // 160a: iload 14
      // 160c: if_icmple 1620
      // 160f: aload 12
      // 1611: iload 14
      // 1613: baload
      // 1614: sipush 7986
      // 1617: ldc2_w 1137286668398613566
      // 161a: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 161d: if_icmpne 1604
      // 1620: aload 12
      // 1622: arraylength
      // 1623: iload 3
      // 1624: ifne 163c
      // 1627: iload 14
      // 1629: iload 3
      // 162a: ifne 161d
      // 162d: goto 1634
      // 1630: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1633: athrow
      // 1634: if_icmpgt 163a
      // 1637: bipush 0
      // 1638: istore 15
      // 163a: iload 15
      // 163c: ifeq 1709
      // 163f: aload 12
      // 1641: iload 14
      // 1643: baload
      // 1644: iload 3
      // 1645: ifne 166e
      // 1648: goto 164f
      // 164b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 164e: athrow
      // 164f: sipush 7986
      // 1652: ldc2_w 1137286668398613566
      // 1655: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1658: iload 3
      // 1659: ifne 1719
      // 165c: goto 1663
      // 165f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1662: athrow
      // 1663: if_icmpne 16fb
      // 1666: goto 166d
      // 1669: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 166c: athrow
      // 166d: bipush 0
      // 166e: istore 16
      // 1670: iload 14
      // 1672: bipush 1
      // 1673: iadd
      // 1674: istore 17
      // 1676: iload 17
      // 1678: aload 12
      // 167a: arraylength
      // 167b: if_icmpge 16e8
      // 167e: aload 12
      // 1680: iload 17
      // 1682: baload
      // 1683: sipush 7986
      // 1686: ldc2_w 1137286668398613566
      // 1689: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 168c: iload 3
      // 168d: ifne 1719
      // 1690: iload 3
      // 1691: ifne 16d0
      // 1694: goto 169b
      // 1697: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 169a: athrow
      // 169b: if_icmpne 16b0
      // 169e: goto 16a5
      // 16a1: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16a4: athrow
      // 16a5: iload 3
      // 16a6: ifeq 16e8
      // 16a9: goto 16b0
      // 16ac: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16af: athrow
      // 16b0: aload 12
      // 16b2: iload 17
      // 16b4: baload
      // 16b5: iload 3
      // 16b6: ifne 16d4
      // 16b9: goto 16c0
      // 16bc: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16bf: athrow
      // 16c0: sipush 7318
      // 16c3: ldc2_w 6446075296154965952
      // 16c6: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 16c9: goto 16d0
      // 16cc: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16cf: athrow
      // 16d0: if_icmpne 16da
      // 16d3: bipush 1
      // 16d4: istore 16
      // 16d6: iload 3
      // 16d7: ifeq 16e8
      // 16da: iinc 17 1
      // 16dd: iload 3
      // 16de: ifeq 1676
      // 16e1: goto 16e8
      // 16e4: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16e7: athrow
      // 16e8: iload 16
      // 16ea: ifne 16fb
      // 16ed: iinc 14 1
      // 16f0: iload 3
      // 16f1: ifeq 1709
      // 16f4: goto 16fb
      // 16f7: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16fa: athrow
      // 16fb: iinc 14 1
      // 16fe: iload 3
      // 16ff: ifeq 163a
      // 1702: goto 1709
      // 1705: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1708: athrow
      // 1709: aload 12
      // 170b: arraylength
      // 170c: iload 3
      // 170d: ifne 1721
      // 1710: iload 14
      // 1712: goto 1719
      // 1715: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1718: athrow
      // 1719: if_icmpgt 171f
      // 171c: bipush 0
      // 171d: istore 15
      // 171f: iload 14
      // 1721: istore 16
      // 1723: iload 15
      // 1725: ifeq 17b4
      // 1728: iload 14
      // 172a: iload 3
      // 172b: ifne 17b6
      // 172e: iload 3
      // 172f: ifne 17b6
      // 1732: goto 1739
      // 1735: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1738: athrow
      // 1739: iload 13
      // 173b: if_icmpge 17b4
      // 173e: goto 1745
      // 1741: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1744: athrow
      // 1745: aload 12
      // 1747: iload 14
      // 1749: baload
      // 174a: sipush 7986
      // 174d: ldc2_w 1137286668398613566
      // 1750: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1753: iload 3
      // 1754: ifne 1798
      // 1757: goto 175e
      // 175a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 175d: athrow
      // 175e: if_icmpne 178a
      // 1761: goto 1768
      // 1764: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1767: athrow
      // 1768: aload 12
      // 176a: iload 14
      // 176c: bipush 1
      // 176d: iadd
      // 176e: aload 12
      // 1770: iload 14
      // 1772: iload 13
      // 1774: iload 14
      // 1776: isub
      // 1777: bipush 1
      // 1778: isub
      // 1779: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 177c: iinc 13 -1
      // 177f: iload 3
      // 1780: ifeq 1723
      // 1783: goto 178a
      // 1786: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1789: athrow
      // 178a: aload 12
      // 178c: iload 14
      // 178e: baload
      // 178f: sipush 21996
      // 1792: ldc2_w 8489794514723184369
      // 1795: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1798: if_icmpne 17a6
      // 179b: iload 3
      // 179c: ifeq 17b4
      // 179f: goto 17a6
      // 17a2: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17a5: athrow
      // 17a6: iinc 14 1
      // 17a9: iload 3
      // 17aa: ifeq 1723
      // 17ad: goto 17b4
      // 17b0: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17b3: athrow
      // 17b4: iload 15
      // 17b6: ifeq 1845
      // 17b9: aload 12
      // 17bb: iload 16
      // 17bd: iload 14
      // 17bf: iload 16
      // 17c1: isub
      // 17c2: invokestatic com/finalshell/core/E8.M ([BII)[B
      // 17c5: astore 7
      // 17c7: aload 1
      // 17c8: iload 3
      // 17c9: ifne 17f0
      // 17cc: ifnull 17ee
      // 17cf: goto 17d6
      // 17d2: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17d5: athrow
      // 17d6: iload 8
      // 17d8: bipush 4
      // 17d9: iload 3
      // 17da: ifne 1803
      // 17dd: goto 17e4
      // 17e0: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17e3: athrow
      // 17e4: if_icmpne 1845
      // 17e7: goto 17ee
      // 17ea: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17ed: athrow
      // 17ee: aload 7
      // 17f0: sipush 13149
      // 17f3: ldc2_w 7229790906152810594
      // 17f6: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 17f9: baload
      // 17fa: sipush 25037
      // 17fd: ldc2_w 2859429576376953555
      // 1800: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1803: iload 3
      // 1804: ifne 183f
      // 1807: if_icmpne 1818
      // 180a: goto 1811
      // 180d: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1810: athrow
      // 1811: bipush 1
      // 1812: istore 8
      // 1814: iload 3
      // 1815: ifeq 1845
      // 1818: aload 7
      // 181a: sipush 13149
      // 181d: ldc2_w 7229790906152810594
      // 1820: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1823: baload
      // 1824: iload 3
      // 1825: ifne 1843
      // 1828: goto 182f
      // 182b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 182e: athrow
      // 182f: sipush 11183
      // 1832: ldc2_w 7464982302374846707
      // 1835: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1838: goto 183f
      // 183b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 183e: athrow
      // 183f: if_icmpne 1845
      // 1842: bipush 2
      // 1843: istore 8
      // 1845: goto 1d3b
      // 1848: aload 12
      // 184a: bipush 0
      // 184b: baload
      // 184c: sipush 8234
      // 184f: ldc2_w 8157913603708775181
      // 1852: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1855: iload 3
      // 1856: ifne 1b50
      // 1859: if_icmpne 1b43
      // 185c: goto 1863
      // 185f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1862: athrow
      // 1863: aload 12
      // 1865: bipush 1
      // 1866: baload
      // 1867: sipush 11017
      // 186a: ldc2_w 5982305436754042960
      // 186d: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1870: iload 3
      // 1871: ifne 1b50
      // 1874: goto 187b
      // 1877: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 187a: athrow
      // 187b: if_icmpne 1b43
      // 187e: goto 1885
      // 1881: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1884: athrow
      // 1885: aload 12
      // 1887: bipush 2
      // 1888: baload
      // 1889: sipush 12153
      // 188c: ldc2_w 4662509020701353024
      // 188f: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1892: iload 3
      // 1893: ifne 1b50
      // 1896: goto 189d
      // 1899: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 189c: athrow
      // 189d: if_icmpne 1b43
      // 18a0: goto 18a7
      // 18a3: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18a6: athrow
      // 18a7: aload 12
      // 18a9: bipush 3
      // 18aa: baload
      // 18ab: sipush 21996
      // 18ae: ldc2_w 8489794514723184369
      // 18b1: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 18b4: iload 3
      // 18b5: ifne 1b50
      // 18b8: goto 18bf
      // 18bb: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18be: athrow
      // 18bf: if_icmpne 1b43
      // 18c2: goto 18c9
      // 18c5: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18c8: athrow
      // 18c9: aload 1
      // 18ca: iload 3
      // 18cb: ifne 18e1
      // 18ce: goto 18d5
      // 18d1: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18d4: athrow
      // 18d5: ifnonnull 19f5
      // 18d8: goto 18df
      // 18db: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18de: athrow
      // 18df: aload 12
      // 18e1: arraylength
      // 18e2: iload 3
      // 18e3: ifne 19f6
      // 18e6: sipush 16306
      // 18e9: ldc2_w 1397713470097519840
      // 18ec: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 18ef: if_icmple 19f5
      // 18f2: goto 18f9
      // 18f5: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18f8: athrow
      // 18f9: aload 12
      // 18fb: bipush 4
      // 18fc: baload
      // 18fd: sipush 7773
      // 1900: ldc2_w 2034455763004904817
      // 1903: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1906: iload 3
      // 1907: ifne 1936
      // 190a: goto 1911
      // 190d: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1910: athrow
      // 1911: if_icmpne 1922
      // 1914: goto 191b
      // 1917: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 191a: athrow
      // 191b: bipush 1
      // 191c: istore 8
      // 191e: iload 3
      // 191f: ifeq 19f5
      // 1922: aload 12
      // 1924: bipush 4
      // 1925: baload
      // 1926: sipush 8077
      // 1929: ldc2_w 2634455730935190746
      // 192c: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 192f: goto 1936
      // 1932: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1935: athrow
      // 1936: iload 3
      // 1937: ifne 195f
      // 193a: if_icmpne 194b
      // 193d: goto 1944
      // 1940: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1943: athrow
      // 1944: bipush 2
      // 1945: istore 8
      // 1947: iload 3
      // 1948: ifeq 19f5
      // 194b: aload 12
      // 194d: bipush 4
      // 194e: baload
      // 194f: sipush 9253
      // 1952: ldc2_w 2491912848447139616
      // 1955: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1958: goto 195f
      // 195b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 195e: athrow
      // 195f: iload 3
      // 1960: ifne 19bd
      // 1963: if_icmpne 199e
      // 1966: goto 196d
      // 1969: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 196c: athrow
      // 196d: aload 12
      // 196f: sipush 8719
      // 1972: ldc2_w 2300790314217662746
      // 1975: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1978: baload
      // 1979: sipush 27629
      // 197c: ldc2_w 3683137660059033838
      // 197f: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1982: iload 3
      // 1983: ifne 19bd
      // 1986: goto 198d
      // 1989: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 198c: athrow
      // 198d: if_icmpne 199e
      // 1990: goto 1997
      // 1993: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1996: athrow
      // 1997: bipush 5
      // 1998: istore 8
      // 199a: iload 3
      // 199b: ifeq 19f5
      // 199e: aload 12
      // 19a0: bipush 4
      // 19a1: baload
      // 19a2: iload 3
      // 19a3: ifne 19f6
      // 19a6: goto 19ad
      // 19a9: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19ac: athrow
      // 19ad: sipush 13927
      // 19b0: ldc2_w 3685381311191973211
      // 19b3: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 19b6: goto 19bd
      // 19b9: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19bc: athrow
      // 19bd: if_icmpne 19f5
      // 19c0: aload 12
      // 19c2: sipush 8719
      // 19c5: ldc2_w 2300790314217662746
      // 19c8: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 19cb: baload
      // 19cc: iload 3
      // 19cd: ifne 19f6
      // 19d0: goto 19d7
      // 19d3: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19d6: athrow
      // 19d7: sipush 21669
      // 19da: ldc2_w 6950068005911666565
      // 19dd: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 19e0: if_icmpne 19f5
      // 19e3: goto 19ea
      // 19e6: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19e9: athrow
      // 19ea: sipush 8719
      // 19ed: ldc2_w 2300790314217662746
      // 19f0: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 19f3: istore 8
      // 19f5: bipush 0
      // 19f6: istore 14
      // 19f8: iload 14
      // 19fa: iload 13
      // 19fc: if_icmpge 1a34
      // 19ff: aload 12
      // 1a01: iload 14
      // 1a03: baload
      // 1a04: sipush 21792
      // 1a07: ldc2_w 9178665888569040435
      // 1a0a: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1a0d: iload 3
      // 1a0e: ifne 1a46
      // 1a11: if_icmpne 1a26
      // 1a14: goto 1a1b
      // 1a17: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a1a: athrow
      // 1a1b: iload 3
      // 1a1c: ifeq 1a34
      // 1a1f: goto 1a26
      // 1a22: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a25: athrow
      // 1a26: iinc 14 1
      // 1a29: iload 3
      // 1a2a: ifeq 19f8
      // 1a2d: goto 1a34
      // 1a30: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a33: athrow
      // 1a34: iinc 14 1
      // 1a37: iload 14
      // 1a39: iload 3
      // 1a3a: ifne 1a4b
      // 1a3d: iload 13
      // 1a3f: goto 1a46
      // 1a42: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a45: athrow
      // 1a46: if_icmpge 1a97
      // 1a49: iload 14
      // 1a4b: istore 15
      // 1a4d: iload 14
      // 1a4f: iload 13
      // 1a51: if_icmpge 1a89
      // 1a54: aload 12
      // 1a56: iload 14
      // 1a58: iload 3
      // 1a59: ifne 1a8d
      // 1a5c: baload
      // 1a5d: sipush 21792
      // 1a60: ldc2_w 9178665888569040435
      // 1a63: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1a66: if_icmpne 1a7b
      // 1a69: goto 1a70
      // 1a6c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a6f: athrow
      // 1a70: iload 3
      // 1a71: ifeq 1a89
      // 1a74: goto 1a7b
      // 1a77: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a7a: athrow
      // 1a7b: iinc 14 1
      // 1a7e: iload 3
      // 1a7f: ifeq 1a4d
      // 1a82: goto 1a89
      // 1a85: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a88: athrow
      // 1a89: aload 12
      // 1a8b: iload 15
      // 1a8d: iload 14
      // 1a8f: iload 15
      // 1a91: isub
      // 1a92: invokestatic com/finalshell/core/E8.M ([BII)[B
      // 1a95: astore 7
      // 1a97: iload 14
      // 1a99: iinc 14 1
      // 1a9c: iload 3
      // 1a9d: ifne 1ab5
      // 1aa0: iload 13
      // 1aa2: if_icmpge 1d3b
      // 1aa5: goto 1aac
      // 1aa8: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1aab: athrow
      // 1aac: iload 14
      // 1aae: goto 1ab5
      // 1ab1: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ab4: athrow
      // 1ab5: istore 15
      // 1ab7: iload 14
      // 1ab9: iload 13
      // 1abb: if_icmpge 1af3
      // 1abe: aload 12
      // 1ac0: iload 14
      // 1ac2: baload
      // 1ac3: sipush 7986
      // 1ac6: ldc2_w 1137286668398613566
      // 1ac9: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1acc: iload 3
      // 1acd: ifne 1b2f
      // 1ad0: if_icmpne 1ae5
      // 1ad3: goto 1ada
      // 1ad6: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ad9: athrow
      // 1ada: iload 3
      // 1adb: ifeq 1af3
      // 1ade: goto 1ae5
      // 1ae1: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ae4: athrow
      // 1ae5: iinc 14 1
      // 1ae8: iload 3
      // 1ae9: ifeq 1ab7
      // 1aec: goto 1af3
      // 1aef: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1af2: athrow
      // 1af3: iload 14
      // 1af5: iload 3
      // 1af6: ifne 1b2d
      // 1af9: ifle 1b2b
      // 1afc: goto 1b03
      // 1aff: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b02: athrow
      // 1b03: aload 12
      // 1b05: iload 14
      // 1b07: bipush 1
      // 1b08: isub
      // 1b09: baload
      // 1b0a: sipush 17717
      // 1b0d: ldc2_w 5788020884913720895
      // 1b10: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1b13: iload 3
      // 1b14: ifne 1b2f
      // 1b17: goto 1b1e
      // 1b1a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b1d: athrow
      // 1b1e: if_icmpne 1b2b
      // 1b21: goto 1b28
      // 1b24: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b27: athrow
      // 1b28: iinc 14 -1
      // 1b2b: iload 15
      // 1b2d: iload 14
      // 1b2f: if_icmpge 1b40
      // 1b32: aload 12
      // 1b34: iload 15
      // 1b36: iload 14
      // 1b38: iload 15
      // 1b3a: isub
      // 1b3b: invokestatic com/finalshell/core/E8.O ([BII)Ljava/lang/String;
      // 1b3e: astore 10
      // 1b40: goto 1d3b
      // 1b43: aload 12
      // 1b45: bipush 0
      // 1b46: baload
      // 1b47: sipush 13927
      // 1b4a: ldc2_w 3685381311191973211
      // 1b4d: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1b50: iload 3
      // 1b51: ifne 1b72
      // 1b54: if_icmpne 1d3b
      // 1b57: goto 1b5e
      // 1b5a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b5d: athrow
      // 1b5e: aload 12
      // 1b60: bipush 1
      // 1b61: baload
      // 1b62: sipush 24110
      // 1b65: ldc2_w 8828411710262023434
      // 1b68: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1b6b: goto 1b72
      // 1b6e: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b71: athrow
      // 1b72: iload 3
      // 1b73: ifne 1b94
      // 1b76: if_icmpne 1d3b
      // 1b79: goto 1b80
      // 1b7c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b7f: athrow
      // 1b80: aload 12
      // 1b82: bipush 2
      // 1b83: baload
      // 1b84: sipush 7773
      // 1b87: ldc2_w 2034455763004904817
      // 1b8a: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1b8d: goto 1b94
      // 1b90: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b93: athrow
      // 1b94: iload 3
      // 1b95: ifne 1bc1
      // 1b98: if_icmpne 1d3b
      // 1b9b: goto 1ba2
      // 1b9e: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ba1: athrow
      // 1ba2: aload 12
      // 1ba4: iload 3
      // 1ba5: ifne 1bc5
      // 1ba8: goto 1baf
      // 1bab: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bae: athrow
      // 1baf: bipush 3
      // 1bb0: baload
      // 1bb1: sipush 11017
      // 1bb4: ldc2_w 5982305436754042960
      // 1bb7: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1bba: goto 1bc1
      // 1bbd: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bc0: athrow
      // 1bc1: if_icmpne 1d3b
      // 1bc4: aload 1
      // 1bc5: iload 3
      // 1bc6: ifne 1bd5
      // 1bc9: ifnonnull 1bf0
      // 1bcc: goto 1bd3
      // 1bcf: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bd2: athrow
      // 1bd3: aload 12
      // 1bd5: arraylength
      // 1bd6: iload 3
      // 1bd7: ifne 1bf1
      // 1bda: sipush 16306
      // 1bdd: ldc2_w 1397713470097519840
      // 1be0: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1be3: if_icmple 1bf0
      // 1be6: goto 1bed
      // 1be9: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bec: athrow
      // 1bed: bipush 3
      // 1bee: istore 8
      // 1bf0: bipush 0
      // 1bf1: istore 14
      // 1bf3: iload 14
      // 1bf5: iload 13
      // 1bf7: if_icmpge 1c2f
      // 1bfa: aload 12
      // 1bfc: iload 14
      // 1bfe: baload
      // 1bff: sipush 21792
      // 1c02: ldc2_w 9178665888569040435
      // 1c05: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1c08: iload 3
      // 1c09: ifne 1c41
      // 1c0c: if_icmpne 1c21
      // 1c0f: goto 1c16
      // 1c12: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c15: athrow
      // 1c16: iload 3
      // 1c17: ifeq 1c2f
      // 1c1a: goto 1c21
      // 1c1d: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c20: athrow
      // 1c21: iinc 14 1
      // 1c24: iload 3
      // 1c25: ifeq 1bf3
      // 1c28: goto 1c2f
      // 1c2b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c2e: athrow
      // 1c2f: iinc 14 1
      // 1c32: iload 14
      // 1c34: iload 3
      // 1c35: ifne 1c46
      // 1c38: iload 13
      // 1c3a: goto 1c41
      // 1c3d: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c40: athrow
      // 1c41: if_icmpge 1c92
      // 1c44: iload 14
      // 1c46: istore 15
      // 1c48: iload 14
      // 1c4a: iload 13
      // 1c4c: if_icmpge 1c84
      // 1c4f: aload 12
      // 1c51: iload 14
      // 1c53: iload 3
      // 1c54: ifne 1c88
      // 1c57: baload
      // 1c58: sipush 21792
      // 1c5b: ldc2_w 9178665888569040435
      // 1c5e: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1c61: if_icmpne 1c76
      // 1c64: goto 1c6b
      // 1c67: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c6a: athrow
      // 1c6b: iload 3
      // 1c6c: ifeq 1c84
      // 1c6f: goto 1c76
      // 1c72: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c75: athrow
      // 1c76: iinc 14 1
      // 1c79: iload 3
      // 1c7a: ifeq 1c48
      // 1c7d: goto 1c84
      // 1c80: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c83: athrow
      // 1c84: aload 12
      // 1c86: iload 15
      // 1c88: iload 14
      // 1c8a: iload 15
      // 1c8c: isub
      // 1c8d: invokestatic com/finalshell/core/E8.M ([BII)[B
      // 1c90: astore 7
      // 1c92: iload 14
      // 1c94: iinc 14 1
      // 1c97: iload 3
      // 1c98: ifne 1cb0
      // 1c9b: iload 13
      // 1c9d: if_icmpge 1d3b
      // 1ca0: goto 1ca7
      // 1ca3: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ca6: athrow
      // 1ca7: iload 14
      // 1ca9: goto 1cb0
      // 1cac: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1caf: athrow
      // 1cb0: istore 15
      // 1cb2: iload 14
      // 1cb4: iload 13
      // 1cb6: if_icmpge 1cee
      // 1cb9: aload 12
      // 1cbb: iload 14
      // 1cbd: baload
      // 1cbe: sipush 7986
      // 1cc1: ldc2_w 1137286668398613566
      // 1cc4: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1cc7: iload 3
      // 1cc8: ifne 1d2a
      // 1ccb: if_icmpne 1ce0
      // 1cce: goto 1cd5
      // 1cd1: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cd4: athrow
      // 1cd5: iload 3
      // 1cd6: ifeq 1cee
      // 1cd9: goto 1ce0
      // 1cdc: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cdf: athrow
      // 1ce0: iinc 14 1
      // 1ce3: iload 3
      // 1ce4: ifeq 1cb2
      // 1ce7: goto 1cee
      // 1cea: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ced: athrow
      // 1cee: iload 14
      // 1cf0: iload 3
      // 1cf1: ifne 1d28
      // 1cf4: ifle 1d26
      // 1cf7: goto 1cfe
      // 1cfa: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cfd: athrow
      // 1cfe: aload 12
      // 1d00: iload 14
      // 1d02: bipush 1
      // 1d03: isub
      // 1d04: baload
      // 1d05: sipush 17717
      // 1d08: ldc2_w 5788020884913720895
      // 1d0b: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1d0e: iload 3
      // 1d0f: ifne 1d2a
      // 1d12: goto 1d19
      // 1d15: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d18: athrow
      // 1d19: if_icmpne 1d26
      // 1d1c: goto 1d23
      // 1d1f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d22: athrow
      // 1d23: iinc 14 -1
      // 1d26: iload 15
      // 1d28: iload 14
      // 1d2a: if_icmpge 1d3b
      // 1d2d: aload 12
      // 1d2f: iload 15
      // 1d31: iload 14
      // 1d33: iload 15
      // 1d35: isub
      // 1d36: invokestatic com/finalshell/core/E8.O ([BII)Ljava/lang/String;
      // 1d39: astore 10
      // 1d3b: goto 1d74
      // 1d3e: astore 15
      // 1d40: aload 0
      // 1d41: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 1d44: bipush 2
      // 1d45: iload 3
      // 1d46: ifne 1d64
      // 1d49: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 1d4e: ifeq 1d74
      // 1d51: goto 1d58
      // 1d54: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d57: athrow
      // 1d58: aload 0
      // 1d59: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 1d5c: bipush 2
      // 1d5d: goto 1d64
      // 1d60: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d63: athrow
      // 1d64: sipush 14756
      // 1d67: sipush 8805
      // 1d6a: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 1d6d: aload 15
      // 1d6f: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 1d74: aconst_null
      // 1d75: astore 15
      // 1d77: iload 8
      // 1d79: bipush 1
      // 1d7a: iload 3
      // 1d7b: ifne 1d98
      // 1d7e: if_icmpne 1d95
      // 1d81: goto 1d88
      // 1d84: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d87: athrow
      // 1d88: new com/finalshell/core/L22
      // 1d8b: dup
      // 1d8c: aload 0
      // 1d8d: invokespecial com/finalshell/core/L22.<init> (Lcom/finalshell/core/Xe2;)V
      // 1d90: astore 15
      // 1d92: goto 1e2a
      // 1d95: iload 8
      // 1d97: bipush 2
      // 1d98: iload 3
      // 1d99: ifne 1db6
      // 1d9c: if_icmpne 1db3
      // 1d9f: goto 1da6
      // 1da2: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1da5: athrow
      // 1da6: new com/finalshell/core/LW3
      // 1da9: dup
      // 1daa: aload 0
      // 1dab: invokespecial com/finalshell/core/LW3.<init> (Lcom/finalshell/core/Xe2;)V
      // 1dae: astore 15
      // 1db0: goto 1e2a
      // 1db3: iload 8
      // 1db5: bipush 3
      // 1db6: iload 3
      // 1db7: ifne 1dd5
      // 1dba: if_icmpne 1dd2
      // 1dbd: goto 1dc4
      // 1dc0: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1dc3: athrow
      // 1dc4: new com/finalshell/core/L32
      // 1dc7: dup
      // 1dc8: aload 0
      // 1dc9: aload 2
      // 1dca: invokespecial com/finalshell/core/L32.<init> (Lcom/finalshell/core/Xe2;[B)V
      // 1dcd: astore 15
      // 1dcf: goto 1e2a
      // 1dd2: iload 8
      // 1dd4: bipush 5
      // 1dd5: iload 3
      // 1dd6: ifne 1dfd
      // 1dd9: if_icmpne 1df2
      // 1ddc: goto 1de3
      // 1ddf: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1de2: athrow
      // 1de3: new com/finalshell/core/LC3
      // 1de6: dup
      // 1de7: aload 0
      // 1de8: aload 2
      // 1de9: aconst_null
      // 1dea: invokespecial com/finalshell/core/LC3.<init> (Lcom/finalshell/core/Xe2;[B[B)V
      // 1ded: astore 15
      // 1def: goto 1e2a
      // 1df2: iload 8
      // 1df4: sipush 8719
      // 1df7: ldc2_w 2300790314217662746
      // 1dfa: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1dfd: iload 3
      // 1dfe: ifne 1e1d
      // 1e01: if_icmpne 1e1a
      // 1e04: goto 1e0b
      // 1e07: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e0a: athrow
      // 1e0b: new com/finalshell/core/Lo4
      // 1e0e: dup
      // 1e0f: aload 0
      // 1e10: aload 2
      // 1e11: aconst_null
      // 1e12: invokespecial com/finalshell/core/Lo4.<init> (Lcom/finalshell/core/Xe2;[B[B)V
      // 1e15: astore 15
      // 1e17: goto 1e2a
      // 1e1a: iload 9
      // 1e1c: bipush 3
      // 1e1d: if_icmpne 1e2a
      // 1e20: new com/finalshell/core/L52
      // 1e23: dup
      // 1e24: aload 0
      // 1e25: invokespecial com/finalshell/core/L52.<init> (Lcom/finalshell/core/Xe2;)V
      // 1e28: astore 15
      // 1e2a: aload 15
      // 1e2c: iload 3
      // 1e2d: ifne 1ed0
      // 1e30: ifnull 1ece
      // 1e33: goto 1e3a
      // 1e36: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e39: athrow
      // 1e3a: aload 15
      // 1e3c: iload 5
      // 1e3e: putfield com/finalshell/core/Ls4.E Z
      // 1e41: aload 15
      // 1e43: aload 7
      // 1e45: putfield com/finalshell/core/Ls4.Z [B
      // 1e48: aload 15
      // 1e4a: iload 9
      // 1e4c: putfield com/finalshell/core/Ls4.P I
      // 1e4f: aload 15
      // 1e51: aload 10
      // 1e53: putfield com/finalshell/core/Ls4.m Ljava/lang/String;
      // 1e56: aload 15
      // 1e58: aload 11
      // 1e5a: putfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 1e5d: iload 5
      // 1e5f: iload 3
      // 1e60: ifne 1eac
      // 1e63: goto 1e6a
      // 1e66: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e69: athrow
      // 1e6a: ifeq 1e93
      // 1e6d: goto 1e74
      // 1e70: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e73: athrow
      // 1e74: aload 15
      // 1e76: bipush 1
      // 1e77: putfield com/finalshell/core/Ls4.E Z
      // 1e7a: aload 15
      // 1e7c: aload 4
      // 1e7e: putfield com/finalshell/core/Ls4.W [B
      // 1e81: aload 15
      // 1e83: aload 6
      // 1e85: putfield com/finalshell/core/Ls4.R [B
      // 1e88: iload 3
      // 1e89: ifeq 1ece
      // 1e8c: goto 1e93
      // 1e8f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e92: athrow
      // 1e93: aload 15
      // 1e95: iload 3
      // 1e96: ifne 1eb1
      // 1e99: goto 1ea0
      // 1e9c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e9f: athrow
      // 1ea0: aload 6
      // 1ea2: invokevirtual com/finalshell/core/Ls4.I ([B)Z
      // 1ea5: goto 1eac
      // 1ea8: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1eab: athrow
      // 1eac: ifeq 1eb9
      // 1eaf: aload 15
      // 1eb1: bipush 0
      // 1eb2: putfield com/finalshell/core/Ls4.E Z
      // 1eb5: iload 3
      // 1eb6: ifeq 1ece
      // 1eb9: new com/finalshell/core/Pc2
      // 1ebc: dup
      // 1ebd: sipush 14808
      // 1ec0: sipush 3151
      // 1ec3: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 1ec6: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 1ec9: athrow
      // 1eca: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ecd: athrow
      // 1ece: aload 15
      // 1ed0: areturn
      // 1ed1: astore 12
      // 1ed3: aload 6
      // 1ed5: invokestatic com/finalshell/core/E8.Q ([B)V
      // 1ed8: aload 12
      // 1eda: iload 3
      // 1edb: ifne 1ef4
      // 1ede: instanceof com/finalshell/core/Pc2
      // 1ee1: ifeq 1ef8
      // 1ee4: goto 1eeb
      // 1ee7: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1eea: athrow
      // 1eeb: aload 12
      // 1eed: goto 1ef4
      // 1ef0: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ef3: athrow
      // 1ef4: checkcast com/finalshell/core/Pc2
      // 1ef7: athrow
      // 1ef8: new com/finalshell/core/Pc2
      // 1efb: dup
      // 1efc: aload 12
      // 1efe: invokevirtual java/lang/Throwable.toString ()Ljava/lang/String;
      // 1f01: aload 12
      // 1f03: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 1f06: athrow
   }

   static Ls4 Q(Xe2 param0, byte[] param1) throws Pc2 {
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
      // 004: aload 1
      // 005: ifnonnull 01d
      // 008: new com/finalshell/core/Pc2
      // 00b: dup
      // 00c: sipush 14808
      // 00f: sipush 3151
      // 012: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 015: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 018: athrow
      // 019: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01c: athrow
      // 01d: new com/finalshell/core/UJ
      // 020: dup
      // 021: aload 1
      // 022: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 025: astore 3
      // 026: getstatic com/finalshell/core/Ls4.v [B
      // 029: arraylength
      // 02a: newarray 8
      // 02c: astore 4
      // 02e: aload 3
      // 02f: aload 4
      // 031: invokevirtual com/finalshell/core/UJ.W ([B)V
      // 034: getstatic com/finalshell/core/Ls4.v [B
      // 037: iload 2
      // 038: ifeq 063
      // 03b: aload 4
      // 03d: invokestatic com/finalshell/core/E8.Y ([B[B)Z
      // 040: ifne 05f
      // 043: goto 04a
      // 046: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 049: athrow
      // 04a: new com/finalshell/core/Pc2
      // 04d: dup
      // 04e: sipush 14761
      // 051: sipush -13629
      // 054: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 057: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 05a: athrow
      // 05b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05e: athrow
      // 05f: aload 3
      // 060: invokevirtual com/finalshell/core/UJ.S ()[B
      // 063: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 066: astore 5
      // 068: aload 3
      // 069: invokevirtual com/finalshell/core/UJ.S ()[B
      // 06c: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 06f: astore 6
      // 071: aload 3
      // 072: invokevirtual com/finalshell/core/UJ.S ()[B
      // 075: astore 7
      // 077: aload 3
      // 078: invokevirtual com/finalshell/core/UJ.d ()I
      // 07b: istore 8
      // 07d: iload 8
      // 07f: bipush 1
      // 080: if_icmpeq 098
      // 083: new com/finalshell/core/Pc2
      // 086: dup
      // 087: sipush 14783
      // 08a: sipush -18435
      // 08d: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 090: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 093: athrow
      // 094: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 097: athrow
      // 098: aload 3
      // 099: invokevirtual com/finalshell/core/UJ.S ()[B
      // 09c: astore 9
      // 09e: aload 0
      // 09f: aload 9
      // 0a1: aconst_null
      // 0a2: invokestatic com/finalshell/core/Ls4.R (Lcom/finalshell/core/Xe2;[BLjava/lang/String;)Lcom/finalshell/core/Ls4;
      // 0a5: astore 10
      // 0a7: aload 10
      // 0a9: sipush 14809
      // 0ac: sipush 983
      // 0af: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0b2: aload 5
      // 0b4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b7: iload 2
      // 0b8: ifeq 0c6
      // 0bb: ifne 0c9
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4: athrow
      // 0c5: bipush 1
      // 0c6: goto 0ca
      // 0c9: bipush 0
      // 0ca: putfield com/finalshell/core/Ls4.E Z
      // 0cd: aload 10
      // 0cf: aload 9
      // 0d1: putfield com/finalshell/core/Ls4.Z [B
      // 0d4: aload 10
      // 0d6: sipush 3055
      // 0d9: ldc2_w 7930236659902922995
      // 0dc: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0df: putfield com/finalshell/core/Ls4.P I
      // 0e2: aload 10
      // 0e4: ldc_w ""
      // 0e7: putfield com/finalshell/core/Ls4.m Ljava/lang/String;
      // 0ea: aload 10
      // 0ec: aload 3
      // 0ed: invokevirtual com/finalshell/core/UJ.S ()[B
      // 0f0: putfield com/finalshell/core/Ls4.R [B
      // 0f3: aload 10
      // 0f5: getfield com/finalshell/core/Ls4.E Z
      // 0f8: iload 2
      // 0f9: ifeq 159
      // 0fc: ifne 13f
      // 0ff: aload 10
      // 101: iload 2
      // 102: ifeq 135
      // 105: goto 10c
      // 108: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10b: athrow
      // 10c: aload 10
      // 10e: getfield com/finalshell/core/Ls4.R [B
      // 111: invokevirtual com/finalshell/core/Ls4.I ([B)Z
      // 114: ifne 133
      // 117: goto 11e
      // 11a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11d: athrow
      // 11e: new com/finalshell/core/Pc2
      // 121: dup
      // 122: sipush 14808
      // 125: sipush 3151
      // 128: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 12b: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 12e: athrow
      // 12f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 132: athrow
      // 133: aload 10
      // 135: getfield com/finalshell/core/Ls4.R [B
      // 138: invokestatic com/finalshell/core/E8.Q ([B)V
      // 13b: iload 2
      // 13c: ifne 28d
      // 13f: aload 5
      // 141: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 144: iload 2
      // 145: ifeq 161
      // 148: goto 14f
      // 14b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14e: athrow
      // 14f: invokestatic com/finalshell/crypto/ConnectHost.X (Ljava/lang/String;)Z
      // 152: goto 159
      // 155: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 158: athrow
      // 159: ifeq 1cb
      // 15c: aload 5
      // 15e: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 161: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 164: ldc_w com/finalshell/core/EU
      // 167: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 16a: astore 11
      // 16c: aload 10
      // 16e: aload 11
      // 170: bipush 0
      // 171: anewarray 323
      // 174: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 177: bipush 0
      // 178: anewarray 4
      // 17b: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 17e: checkcast com/finalshell/core/EU
      // 181: putfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 184: aload 10
      // 186: aload 10
      // 188: getfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 18b: invokeinterface com/finalshell/core/EU.w ()I 1
      // 190: newarray 8
      // 192: putfield com/finalshell/core/Ls4.W [B
      // 195: goto 1fa
      // 198: astore 11
      // 19a: new com/finalshell/core/Pc2
      // 19d: dup
      // 19e: new java/lang/StringBuilder
      // 1a1: dup
      // 1a2: invokespecial java/lang/StringBuilder.<init> ()V
      // 1a5: sipush 14838
      // 1a8: sipush -12158
      // 1ab: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 1ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b1: aload 5
      // 1b3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b6: sipush 14757
      // 1b9: sipush -20226
      // 1bc: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 1bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c5: aload 11
      // 1c7: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 1ca: athrow
      // 1cb: new com/finalshell/core/Pc2
      // 1ce: dup
      // 1cf: new java/lang/StringBuilder
      // 1d2: dup
      // 1d3: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d6: sipush 14826
      // 1d9: sipush -27773
      // 1dc: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 1df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e2: aload 5
      // 1e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e7: sipush 14839
      // 1ea: sipush 5981
      // 1ed: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 1f0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1f6: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 1f9: athrow
      // 1fa: new com/finalshell/core/UJ
      // 1fd: dup
      // 1fe: aload 7
      // 200: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 203: astore 11
      // 205: aload 11
      // 207: invokevirtual com/finalshell/core/UJ.S ()[B
      // 20a: astore 12
      // 20c: aload 11
      // 20e: invokevirtual com/finalshell/core/UJ.d ()I
      // 211: istore 13
      // 213: aload 6
      // 215: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 218: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 21b: ldc_w com/finalshell/core/Ip_2
      // 21e: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 221: astore 14
      // 223: aload 14
      // 225: bipush 0
      // 226: anewarray 323
      // 229: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 22c: bipush 0
      // 22d: anewarray 4
      // 230: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 233: checkcast com/finalshell/core/Ip_2
      // 236: astore 15
      // 238: aload 15
      // 23a: aload 12
      // 23c: iload 13
      // 23e: invokeinterface com/finalshell/core/Ip_2.Z ([BI)V 3
      // 243: aload 10
      // 245: aload 15
      // 247: putfield com/finalshell/core/Ls4.T Lcom/finalshell/core/Bx2;
      // 24a: goto 28d
      // 24d: astore 11
      // 24f: aload 11
      // 251: invokevirtual java/lang/Throwable.printStackTrace ()V
      // 254: new com/finalshell/core/Pc2
      // 257: dup
      // 258: new java/lang/StringBuilder
      // 25b: dup
      // 25c: invokespecial java/lang/StringBuilder.<init> ()V
      // 25f: sipush 14833
      // 262: sipush -2393
      // 265: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 268: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26b: aload 6
      // 26d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 270: sipush 14837
      // 273: sipush -6528
      // 276: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 279: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27c: aload 6
      // 27e: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 281: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 284: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 287: aload 11
      // 289: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 28c: athrow
      // 28d: aload 10
      // 28f: areturn
      // 290: astore 11
      // 292: aload 10
      // 294: getfield com/finalshell/core/Ls4.R [B
      // 297: invokestatic com/finalshell/core/E8.Q ([B)V
      // 29a: aload 11
      // 29c: athrow
   }

   public static boolean v(byte[] param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: sipush 14776
      // 06: sipush -26241
      // 09: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0c: astore 4
      // 0e: istore 3
      // 0f: iload 1
      // 10: aload 4
      // 12: invokevirtual java/lang/String.length ()I
      // 15: iadd
      // 16: iload 3
      // 17: ifeq 40
      // 1a: iload 2
      // 1b: if_icmpge 52
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 4
      // 27: aload 0
      // 28: iload 1
      // 29: iload 1
      // 2a: aload 4
      // 2c: invokevirtual java/lang/String.length ()I
      // 2f: iadd
      // 30: invokestatic java/util/Arrays.copyOfRange ([BII)[B
      // 33: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 36: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: iload 3
      // 41: ifeq 4f
      // 44: ifeq 52
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: bipush 1
      // 4f: goto 53
      // 52: bipush 0
      // 53: ireturn
   }

   public static byte W(byte param0) {
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
      // 04: sipush 28817
      // 07: ldc2_w 8072918356037778335
      // 0a: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0d: iload 0
      // 0e: iload 1
      // 0f: ifne 60
      // 12: if_icmpgt 4c
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: iload 0
      // 1d: sipush 16104
      // 20: ldc2_w 2721751173817464291
      // 23: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 26: iload 1
      // 27: ifne 60
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: if_icmpgt 4c
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: iload 0
      // 3c: sipush 28817
      // 3f: ldc2_w 8072918356037778335
      // 42: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 45: isub
      // 46: i2b
      // 47: ireturn
      // 48: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: iload 0
      // 4d: sipush 12136
      // 50: ldc2_w 4815045677553181806
      // 53: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 56: isub
      // 57: sipush 7986
      // 5a: ldc2_w 1137286668398613566
      // 5d: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 60: iadd
      // 61: i2b
      // 62: ireturn
   }

   public static byte o(byte param0) {
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
      // 04: bipush 0
      // 05: iload 0
      // 06: iload 1
      // 07: ifne 58
      // 0a: if_icmpgt 44
      // 0d: goto 14
      // 10: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13: athrow
      // 14: iload 0
      // 15: sipush 9142
      // 18: ldc2_w 1666523528356817127
      // 1b: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1e: iload 1
      // 1f: ifne 58
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: if_icmpgt 44
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: iload 0
      // 34: sipush 28817
      // 37: ldc2_w 8072918356037778335
      // 3a: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 3d: iadd
      // 3e: i2b
      // 3f: ireturn
      // 40: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: iload 0
      // 45: sipush 7986
      // 48: ldc2_w 1137286668398613566
      // 4b: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 4e: isub
      // 4f: sipush 5908
      // 52: ldc2_w 7778351699048127516
      // 55: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 58: iadd
      // 59: i2b
      // 5a: ireturn
   }

   public void a$void() {
      E8.Q(this.F);
   }

   @Override
   public void finalize() {
      this.a$void();
   }

   static Ls4 J(Xe2 param0, byte[] param1) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 3
      // 002: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 005: aconst_null
      // 006: astore 4
      // 008: aconst_null
      // 009: astore 5
      // 00b: bipush 0
      // 00c: istore 6
      // 00e: new com/finalshell/core/UJ
      // 011: dup
      // 012: aload 1
      // 013: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 016: astore 7
      // 018: istore 2
      // 019: new java/util/HashMap
      // 01c: dup
      // 01d: invokespecial java/util/HashMap.<init> ()V
      // 020: astore 8
      // 022: aload 7
      // 024: aload 8
      // 026: invokestatic com/finalshell/core/Ls4.p (Lcom/finalshell/core/UJ;Ljava/util/Map;)Z
      // 029: ifne 022
      // 02c: goto 033
      // 02f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: aload 8
      // 035: sipush 14805
      // 038: sipush -19895
      // 03b: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 03e: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 043: checkcast java/lang/String
      // 046: astore 10
      // 048: aload 10
      // 04a: iload 2
      // 04b: ifne 06f
      // 04e: ifnonnull 07f
      // 051: goto 058
      // 054: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: aload 8
      // 05a: sipush 14834
      // 05d: sipush -28794
      // 060: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 063: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 068: checkcast java/lang/String
      // 06b: astore 10
      // 06d: aload 10
      // 06f: ifnonnull 078
      // 072: aconst_null
      // 073: areturn
      // 074: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: bipush 5
      // 079: istore 9
      // 07b: iload 2
      // 07c: ifeq 082
      // 07f: bipush 2
      // 080: istore 9
      // 082: aload 8
      // 084: sipush 14785
      // 087: sipush 24000
      // 08a: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 08d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 092: checkcast java/lang/String
      // 095: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 098: istore 6
      // 09a: aload 7
      // 09c: iload 6
      // 09e: invokestatic com/finalshell/core/Ls4.U (Lcom/finalshell/core/UJ;I)[B
      // 0a1: astore 3
      // 0a2: aload 7
      // 0a4: aload 8
      // 0a6: invokestatic com/finalshell/core/Ls4.p (Lcom/finalshell/core/UJ;Ljava/util/Map;)Z
      // 0a9: ifne 0a2
      // 0ac: goto 0b3
      // 0af: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b2: athrow
      // 0b3: aload 8
      // 0b5: sipush 14844
      // 0b8: sipush -10413
      // 0bb: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0be: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0c3: checkcast java/lang/String
      // 0c6: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0c9: istore 6
      // 0cb: aload 7
      // 0cd: iload 6
      // 0cf: invokestatic com/finalshell/core/Ls4.U (Lcom/finalshell/core/UJ;I)[B
      // 0d2: astore 5
      // 0d4: aload 7
      // 0d6: aload 8
      // 0d8: invokestatic com/finalshell/core/Ls4.p (Lcom/finalshell/core/UJ;Ljava/util/Map;)Z
      // 0db: ifne 0d4
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: aload 5
      // 0e7: bipush 0
      // 0e8: aload 5
      // 0ea: arraylength
      // 0eb: invokestatic com/finalshell/core/E8.M ([BII)[B
      // 0ee: astore 4
      // 0f0: aload 3
      // 0f1: bipush 0
      // 0f2: aload 3
      // 0f3: arraylength
      // 0f4: invokestatic com/finalshell/core/E8.M ([BII)[B
      // 0f7: astore 3
      // 0f8: aload 0
      // 0f9: aload 3
      // 0fa: aload 10
      // 0fc: invokestatic com/finalshell/core/Ls4.R (Lcom/finalshell/core/Xe2;[BLjava/lang/String;)Lcom/finalshell/core/Ls4;
      // 0ff: astore 11
      // 101: aload 11
      // 103: aload 8
      // 105: sipush 14789
      // 108: sipush -26793
      // 10b: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 10e: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 113: checkcast java/lang/String
      // 116: sipush 14759
      // 119: sipush -10915
      // 11c: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 11f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 122: iload 2
      // 123: ifne 131
      // 126: ifne 134
      // 129: goto 130
      // 12c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12f: athrow
      // 130: bipush 1
      // 131: goto 135
      // 134: bipush 0
      // 135: putfield com/finalshell/core/Ls4.E Z
      // 138: aload 11
      // 13a: aload 3
      // 13b: putfield com/finalshell/core/Ls4.Z [B
      // 13e: aload 11
      // 140: iload 9
      // 142: putfield com/finalshell/core/Ls4.P I
      // 145: aload 11
      // 147: aload 8
      // 149: sipush 14786
      // 14c: sipush -218
      // 14f: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 152: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 157: checkcast java/lang/String
      // 15a: putfield com/finalshell/core/Ls4.m Ljava/lang/String;
      // 15d: aload 11
      // 15f: getfield com/finalshell/core/Ls4.E Z
      // 162: iload 2
      // 163: ifne 515
      // 166: ifeq 500
      // 169: goto 170
      // 16c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16f: athrow
      // 170: sipush 14793
      // 173: sipush -7426
      // 176: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 179: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 17c: iload 2
      // 17d: ifne 1a0
      // 180: goto 187
      // 183: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 186: athrow
      // 187: invokestatic com/finalshell/crypto/ConnectHost.X (Ljava/lang/String;)Z
      // 18a: ifeq 1ec
      // 18d: goto 194
      // 190: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 193: athrow
      // 194: sipush 14845
      // 197: sipush -8074
      // 19a: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 19d: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 1a0: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 1a3: ldc_w com/finalshell/core/EU
      // 1a6: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 1a9: astore 12
      // 1ab: aload 11
      // 1ad: aload 12
      // 1af: bipush 0
      // 1b0: anewarray 323
      // 1b3: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 1b6: bipush 0
      // 1b7: anewarray 4
      // 1ba: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 1bd: checkcast com/finalshell/core/EU
      // 1c0: putfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 1c3: aload 11
      // 1c5: aload 11
      // 1c7: getfield com/finalshell/core/Ls4.G Lcom/finalshell/core/EU;
      // 1ca: invokeinterface com/finalshell/core/EU.w ()I 1
      // 1cf: newarray 8
      // 1d1: putfield com/finalshell/core/Ls4.W [B
      // 1d4: goto 1fd
      // 1d7: astore 12
      // 1d9: new com/finalshell/core/Pc2
      // 1dc: dup
      // 1dd: sipush 14766
      // 1e0: sipush 1026
      // 1e3: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 1e6: aload 12
      // 1e8: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 1eb: athrow
      // 1ec: new com/finalshell/core/Pc2
      // 1ef: dup
      // 1f0: sipush 14821
      // 1f3: sipush -28926
      // 1f6: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 1f9: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 1fc: athrow
      // 1fd: iload 9
      // 1ff: bipush 2
      // 200: if_icmpne 255
      // 203: sipush 14795
      // 206: sipush -15797
      // 209: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 20c: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 20f: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 212: ldc_w com/finalshell/core/Y_2
      // 215: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 218: astore 12
      // 21a: aload 12
      // 21c: bipush 0
      // 21d: anewarray 323
      // 220: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 223: bipush 0
      // 224: anewarray 4
      // 227: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 22a: checkcast com/finalshell/core/Y_2
      // 22d: astore 13
      // 22f: aload 13
      // 231: invokeinterface com/finalshell/core/Y_2.t ()V 1
      // 236: aload 11
      // 238: aload 13
      // 23a: putfield com/finalshell/core/Ls4.u Lcom/finalshell/core/Y_2;
      // 23d: goto 4f5
      // 240: astore 12
      // 242: new com/finalshell/core/Pc2
      // 245: dup
      // 246: sipush 14823
      // 249: sipush 942
      // 24c: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 24f: aload 12
      // 251: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 254: athrow
      // 255: aload 8
      // 257: sipush 14760
      // 25a: sipush 12751
      // 25d: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 260: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 265: checkcast java/lang/String
      // 268: astore 12
      // 26a: aload 8
      // 26c: sipush 14813
      // 26f: sipush 5540
      // 272: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 275: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 27a: checkcast java/lang/String
      // 27d: astore 13
      // 27f: aload 12
      // 281: iload 2
      // 282: ifne 291
      // 285: ifnull 2cb
      // 288: goto 28f
      // 28b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28e: athrow
      // 28f: aload 13
      // 291: iload 2
      // 292: ifne 2a1
      // 295: ifnull 2cb
      // 298: goto 29f
      // 29b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29e: athrow
      // 29f: aload 13
      // 2a1: iload 2
      // 2a2: ifne 2e2
      // 2a5: ifnull 2e0
      // 2a8: goto 2af
      // 2ab: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ae: athrow
      // 2af: aload 13
      // 2b1: iload 2
      // 2b2: ifne 2e2
      // 2b5: goto 2bc
      // 2b8: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2bb: athrow
      // 2bc: invokevirtual java/lang/String.length ()I
      // 2bf: bipush 2
      // 2c0: irem
      // 2c1: ifeq 2e0
      // 2c4: goto 2cb
      // 2c7: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ca: athrow
      // 2cb: new com/finalshell/core/Pc2
      // 2ce: dup
      // 2cf: sipush 14764
      // 2d2: sipush -16662
      // 2d5: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 2d8: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 2db: athrow
      // 2dc: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2df: athrow
      // 2e0: aload 12
      // 2e2: astore 15
      // 2e4: bipush -1
      // 2e5: istore 16
      // 2e7: aload 15
      // 2e9: invokevirtual java/lang/String.hashCode ()I
      // 2ec: iload 2
      // 2ed: ifne 394
      // 2f0: lookupswitch 162 3 -1530598888 124 920457159 40 920457164 82
      // 314: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 317: athrow
      // 318: aload 15
      // 31a: sipush 14827
      // 31d: sipush -30957
      // 320: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 323: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 326: iload 2
      // 327: ifne 394
      // 32a: goto 331
      // 32d: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 330: athrow
      // 331: ifeq 392
      // 334: goto 33b
      // 337: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33a: athrow
      // 33b: bipush 0
      // 33c: istore 16
      // 33e: iload 2
      // 33f: ifeq 392
      // 342: aload 15
      // 344: sipush 14787
      // 347: sipush -14922
      // 34a: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 34d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 350: iload 2
      // 351: ifne 394
      // 354: goto 35b
      // 357: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35a: athrow
      // 35b: ifeq 392
      // 35e: goto 365
      // 361: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 364: athrow
      // 365: bipush 1
      // 366: istore 16
      // 368: iload 2
      // 369: ifeq 392
      // 36c: aload 15
      // 36e: sipush 14843
      // 371: sipush 1719
      // 374: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 377: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 37a: iload 2
      // 37b: ifne 394
      // 37e: goto 385
      // 381: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 384: athrow
      // 385: ifeq 392
      // 388: goto 38f
      // 38b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38e: athrow
      // 38f: bipush 2
      // 390: istore 16
      // 392: iload 16
      // 394: iload 2
      // 395: ifne 3b9
      // 398: tableswitch 53 0 2 32 39 46
      // 3b4: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b7: athrow
      // 3b8: bipush 0
      // 3b9: istore 14
      // 3bb: iload 2
      // 3bc: ifeq 3e2
      // 3bf: bipush 1
      // 3c0: istore 14
      // 3c2: iload 2
      // 3c3: ifeq 3e2
      // 3c6: bipush 2
      // 3c7: istore 14
      // 3c9: iload 2
      // 3ca: ifeq 3e2
      // 3cd: new com/finalshell/core/Pc2
      // 3d0: dup
      // 3d1: sipush 14824
      // 3d4: sipush -22621
      // 3d7: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 3da: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 3dd: athrow
      // 3de: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e1: athrow
      // 3e2: aload 8
      // 3e4: sipush 14754
      // 3e7: sipush 7524
      // 3ea: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 3ed: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3f2: checkcast java/lang/String
      // 3f5: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 3f8: istore 15
      // 3fa: aload 8
      // 3fc: sipush 14841
      // 3ff: sipush -31487
      // 402: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 405: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 40a: checkcast java/lang/String
      // 40d: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 410: istore 16
      // 412: aload 8
      // 414: sipush 14765
      // 417: sipush -14180
      // 41a: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 41d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 422: checkcast java/lang/String
      // 425: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 428: istore 17
      // 42a: aload 13
      // 42c: invokevirtual java/lang/String.length ()I
      // 42f: bipush 2
      // 430: idiv
      // 431: newarray 8
      // 433: astore 18
      // 435: bipush 0
      // 436: istore 19
      // 438: iload 19
      // 43a: aload 18
      // 43c: arraylength
      // 43d: if_icmpge 475
      // 440: iload 19
      // 442: bipush 2
      // 443: imul
      // 444: istore 20
      // 446: aload 18
      // 448: iload 19
      // 44a: aload 13
      // 44c: iload 20
      // 44e: iload 20
      // 450: bipush 2
      // 451: iadd
      // 452: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 455: sipush 27757
      // 458: ldc2_w 6351846066871478069
      // 45b: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 45e: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
      // 461: i2b
      // 462: bastore
      // 463: iinc 19 1
      // 466: iload 2
      // 467: ifne 4fc
      // 46a: iload 2
      // 46b: ifeq 438
      // 46e: goto 475
      // 471: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 474: athrow
      // 475: sipush 14846
      // 478: sipush 28053
      // 47b: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 47e: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 481: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 484: ldc_w com/finalshell/core/Dr2
      // 487: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 48a: astore 19
      // 48c: aload 19
      // 48e: bipush 0
      // 48f: anewarray 323
      // 492: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 495: bipush 0
      // 496: anewarray 4
      // 499: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 49c: checkcast com/finalshell/core/Dr2
      // 49f: astore 20
      // 4a1: aload 20
      // 4a3: aload 18
      // 4a5: iload 16
      // 4a7: iload 14
      // 4a9: bipush 0
      // 4aa: newarray 8
      // 4ac: bipush 0
      // 4ad: newarray 8
      // 4af: iload 15
      // 4b1: iload 17
      // 4b3: sipush 15512
      // 4b6: ldc2_w 3116020423141849007
      // 4b9: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 4bc: invokeinterface com/finalshell/core/Dr2.t ([BII[B[BIII)V 9
      // 4c1: aload 11
      // 4c3: aload 20
      // 4c5: putfield com/finalshell/core/Ls4.T Lcom/finalshell/core/Bx2;
      // 4c8: goto 4f5
      // 4cb: astore 15
      // 4cd: new com/finalshell/core/Pc2
      // 4d0: dup
      // 4d1: sipush 14824
      // 4d4: sipush -22621
      // 4d7: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 4da: aload 15
      // 4dc: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 4df: athrow
      // 4e0: astore 15
      // 4e2: new com/finalshell/core/Pc2
      // 4e5: dup
      // 4e6: sipush 14817
      // 4e9: sipush -21410
      // 4ec: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 4ef: aload 15
      // 4f1: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 4f4: athrow
      // 4f5: aload 11
      // 4f7: aload 4
      // 4f9: putfield com/finalshell/core/Ls4.R [B
      // 4fc: iload 2
      // 4fd: ifeq 532
      // 500: aload 11
      // 502: aload 4
      // 504: putfield com/finalshell/core/Ls4.R [B
      // 507: aload 11
      // 509: aload 4
      // 50b: invokevirtual com/finalshell/core/Ls4.I ([B)Z
      // 50e: goto 515
      // 511: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 514: athrow
      // 515: ifne 52d
      // 518: new com/finalshell/core/Pc2
      // 51b: dup
      // 51c: sipush 14767
      // 51f: sipush 4019
      // 522: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 525: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 528: athrow
      // 529: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52c: athrow
      // 52d: aload 4
      // 52f: invokestatic com/finalshell/core/E8.Q ([B)V
      // 532: aload 11
      // 534: astore 12
      // 536: aload 5
      // 538: invokestatic com/finalshell/core/E8.Q ([B)V
      // 53b: aload 12
      // 53d: areturn
      // 53e: astore 11
      // 540: aload 4
      // 542: invokestatic com/finalshell/core/E8.Q ([B)V
      // 545: aload 11
      // 547: athrow
      // 548: astore 21
      // 54a: aload 5
      // 54c: invokestatic com/finalshell/core/E8.Q ([B)V
      // 54f: aload 21
      // 551: athrow
   }

   public static Ls4 R(Xe2 param0, byte[] param1, String param2) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: new com/finalshell/core/UJ
      // 006: dup
      // 007: aload 1
      // 008: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 00b: astore 4
      // 00d: aload 4
      // 00f: aload 1
      // 010: arraylength
      // 011: invokevirtual com/finalshell/core/UJ.S (I)V
      // 014: aload 4
      // 016: invokevirtual com/finalshell/core/UJ.S ()[B
      // 019: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 01c: astore 5
      // 01e: istore 3
      // 01f: aload 2
      // 020: iload 3
      // 021: ifne 04c
      // 024: ifnull 04a
      // 027: goto 02e
      // 02a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02d: athrow
      // 02e: aload 2
      // 02f: ldc_w ""
      // 032: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 035: iload 3
      // 036: ifne 05e
      // 039: goto 040
      // 03c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: ifeq 051
      // 043: goto 04a
      // 046: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 049: athrow
      // 04a: aload 5
      // 04c: astore 2
      // 04d: iload 3
      // 04e: ifeq 0a9
      // 051: aload 2
      // 052: aload 5
      // 054: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: iload 3
      // 05f: ifne 0b6
      // 062: ifne 0a9
      // 065: goto 06c
      // 068: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06b: athrow
      // 06c: new com/finalshell/core/Pc2
      // 06f: dup
      // 070: new java/lang/StringBuilder
      // 073: dup
      // 074: invokespecial java/lang/StringBuilder.<init> ()V
      // 077: sipush 14763
      // 07a: sipush 29038
      // 07d: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 080: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 083: aload 5
      // 085: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 088: sipush 14791
      // 08b: sipush -9083
      // 08e: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 091: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 094: aload 2
      // 095: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 098: ldc_w "]"
      // 09b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a1: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 0a4: athrow
      // 0a5: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: aload 2
      // 0aa: sipush 14799
      // 0ad: sipush 25444
      // 0b0: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0b3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b6: iload 3
      // 0b7: ifne 0ff
      // 0ba: ifeq 0f2
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c3: athrow
      // 0c4: aload 4
      // 0c6: invokevirtual com/finalshell/core/UJ.d ()I
      // 0c9: newarray 8
      // 0cb: astore 6
      // 0cd: aload 4
      // 0cf: aload 6
      // 0d1: invokevirtual com/finalshell/core/UJ.W ([B)V
      // 0d4: aload 4
      // 0d6: invokevirtual com/finalshell/core/UJ.d ()I
      // 0d9: newarray 8
      // 0db: astore 7
      // 0dd: aload 4
      // 0df: aload 7
      // 0e1: invokevirtual com/finalshell/core/UJ.W ([B)V
      // 0e4: new com/finalshell/core/LW3
      // 0e7: dup
      // 0e8: aload 0
      // 0e9: aload 7
      // 0eb: aload 6
      // 0ed: aconst_null
      // 0ee: invokespecial com/finalshell/core/LW3.<init> (Lcom/finalshell/core/Xe2;[B[B[B)V
      // 0f1: areturn
      // 0f2: aload 2
      // 0f3: sipush 14792
      // 0f6: sipush 1366
      // 0f9: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 0fc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ff: iload 3
      // 100: ifne 16c
      // 103: ifeq 15f
      // 106: goto 10d
      // 109: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10c: athrow
      // 10d: aload 4
      // 10f: invokevirtual com/finalshell/core/UJ.d ()I
      // 112: newarray 8
      // 114: astore 6
      // 116: aload 4
      // 118: aload 6
      // 11a: invokevirtual com/finalshell/core/UJ.W ([B)V
      // 11d: aload 4
      // 11f: invokevirtual com/finalshell/core/UJ.d ()I
      // 122: newarray 8
      // 124: astore 7
      // 126: aload 4
      // 128: aload 7
      // 12a: invokevirtual com/finalshell/core/UJ.W ([B)V
      // 12d: aload 4
      // 12f: invokevirtual com/finalshell/core/UJ.d ()I
      // 132: newarray 8
      // 134: astore 8
      // 136: aload 4
      // 138: aload 8
      // 13a: invokevirtual com/finalshell/core/UJ.W ([B)V
      // 13d: aload 4
      // 13f: invokevirtual com/finalshell/core/UJ.d ()I
      // 142: newarray 8
      // 144: astore 9
      // 146: aload 4
      // 148: aload 9
      // 14a: invokevirtual com/finalshell/core/UJ.W ([B)V
      // 14d: new com/finalshell/core/L22
      // 150: dup
      // 151: aload 0
      // 152: aload 6
      // 154: aload 7
      // 156: aload 8
      // 158: aload 9
      // 15a: aconst_null
      // 15b: invokespecial com/finalshell/core/L22.<init> (Lcom/finalshell/core/Xe2;[B[B[B[B[B)V
      // 15e: areturn
      // 15f: aload 2
      // 160: sipush 14819
      // 163: sipush 28313
      // 166: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 169: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 16c: iload 3
      // 16d: ifne 18e
      // 170: ifne 1be
      // 173: goto 17a
      // 176: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 179: athrow
      // 17a: aload 2
      // 17b: sipush 14840
      // 17e: sipush -16528
      // 181: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 184: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 187: goto 18e
      // 18a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18d: athrow
      // 18e: iload 3
      // 18f: ifne 1b0
      // 192: ifne 1be
      // 195: goto 19c
      // 198: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19b: athrow
      // 19c: aload 2
      // 19d: sipush 14820
      // 1a0: sipush 18651
      // 1a3: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 1a6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1a9: goto 1b0
      // 1ac: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1af: athrow
      // 1b0: iload 3
      // 1b1: ifne 212
      // 1b4: ifeq 205
      // 1b7: goto 1be
      // 1ba: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bd: athrow
      // 1be: aload 4
      // 1c0: invokevirtual com/finalshell/core/UJ.S ()[B
      // 1c3: astore 6
      // 1c5: aload 4
      // 1c7: invokevirtual com/finalshell/core/UJ.d ()I
      // 1ca: istore 7
      // 1cc: aload 4
      // 1ce: invokevirtual com/finalshell/core/UJ.r ()I
      // 1d1: istore 8
      // 1d3: iload 7
      // 1d5: bipush 1
      // 1d6: isub
      // 1d7: bipush 2
      // 1d8: idiv
      // 1d9: newarray 8
      // 1db: astore 9
      // 1dd: iload 7
      // 1df: bipush 1
      // 1e0: isub
      // 1e1: bipush 2
      // 1e2: idiv
      // 1e3: newarray 8
      // 1e5: astore 10
      // 1e7: aload 4
      // 1e9: aload 9
      // 1eb: invokevirtual com/finalshell/core/UJ.W ([B)V
      // 1ee: aload 4
      // 1f0: aload 10
      // 1f2: invokevirtual com/finalshell/core/UJ.W ([B)V
      // 1f5: new com/finalshell/core/L32
      // 1f8: dup
      // 1f9: aload 0
      // 1fa: aload 6
      // 1fc: aload 9
      // 1fe: aload 10
      // 200: aconst_null
      // 201: invokespecial com/finalshell/core/L32.<init> (Lcom/finalshell/core/Xe2;[B[B[B[B)V
      // 204: areturn
      // 205: aload 2
      // 206: sipush 14755
      // 209: sipush 14048
      // 20c: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 20f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 212: iload 3
      // 213: ifne 24e
      // 216: ifne 242
      // 219: goto 220
      // 21c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21f: athrow
      // 220: aload 2
      // 221: sipush 14790
      // 224: sipush 8756
      // 227: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 22a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 22d: iload 3
      // 22e: ifne 24e
      // 231: goto 238
      // 234: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 237: athrow
      // 238: ifeq 285
      // 23b: goto 242
      // 23e: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 241: athrow
      // 242: aload 4
      // 244: invokevirtual com/finalshell/core/UJ.d ()I
      // 247: goto 24e
      // 24a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24d: athrow
      // 24e: newarray 8
      // 250: astore 6
      // 252: aload 4
      // 254: aload 6
      // 256: invokevirtual com/finalshell/core/UJ.W ([B)V
      // 259: aload 2
      // 25a: sipush 14755
      // 25d: sipush 14048
      // 260: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 263: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 266: ifeq 279
      // 269: new com/finalshell/core/LC3
      // 26c: dup
      // 26d: aload 0
      // 26e: aload 6
      // 270: aconst_null
      // 271: invokespecial com/finalshell/core/LC3.<init> (Lcom/finalshell/core/Xe2;[B[B)V
      // 274: areturn
      // 275: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 278: athrow
      // 279: new com/finalshell/core/Lo4
      // 27c: dup
      // 27d: aload 0
      // 27e: aload 6
      // 280: aconst_null
      // 281: invokespecial com/finalshell/core/Lo4.<init> (Lcom/finalshell/core/Xe2;[B[B)V
      // 284: areturn
      // 285: new com/finalshell/core/Pc2
      // 288: dup
      // 289: new java/lang/StringBuilder
      // 28c: dup
      // 28d: invokespecial java/lang/StringBuilder.<init> ()V
      // 290: sipush 14806
      // 293: sipush 17973
      // 296: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 299: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29c: aload 2
      // 29d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a0: sipush 14814
      // 2a3: sipush 7703
      // 2a6: invokestatic com/finalshell/core/Ls4.a (II)Ljava/lang/String;
      // 2a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ac: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2af: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 2b2: athrow
   }

   public static byte[] U(UJ param0, int param1) {
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
      // 004: getfield com/finalshell/core/UJ.g [B
      // 007: astore 3
      // 008: istore 2
      // 009: aload 0
      // 00a: getfield com/finalshell/core/UJ.X I
      // 00d: istore 4
      // 00f: aconst_null
      // 010: astore 5
      // 012: iload 4
      // 014: istore 6
      // 016: iload 1
      // 017: iinc 1 -1
      // 01a: ifle 142
      // 01d: aload 3
      // 01e: iload 2
      // 01f: ifeq 144
      // 022: arraylength
      // 023: iload 6
      // 025: if_icmple 0fc
      // 028: aload 3
      // 029: iload 6
      // 02b: iinc 6 1
      // 02e: baload
      // 02f: istore 7
      // 031: iload 7
      // 033: sipush 17717
      // 036: ldc2_w 5788020884913720895
      // 039: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 03c: iload 2
      // 03d: ifeq 10b
      // 040: iload 2
      // 041: ifeq 082
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04a: athrow
      // 04b: if_icmpeq 075
      // 04e: goto 055
      // 051: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 054: athrow
      // 055: iload 7
      // 057: sipush 7986
      // 05a: ldc2_w 1137286668398613566
      // 05d: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 060: iload 2
      // 061: ifeq 082
      // 064: goto 06b
      // 067: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06a: athrow
      // 06b: if_icmpne 0f1
      // 06e: goto 075
      // 071: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 074: athrow
      // 075: iload 6
      // 077: iload 4
      // 079: isub
      // 07a: bipush 1
      // 07b: goto 082
      // 07e: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 081: athrow
      // 082: isub
      // 083: istore 8
      // 085: aload 5
      // 087: iload 2
      // 088: ifeq 09c
      // 08b: ifnonnull 0aa
      // 08e: goto 095
      // 091: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094: athrow
      // 095: iload 8
      // 097: newarray 8
      // 099: astore 5
      // 09b: aload 3
      // 09c: iload 4
      // 09e: aload 5
      // 0a0: bipush 0
      // 0a1: iload 8
      // 0a3: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0a6: iload 2
      // 0a7: ifne 0fc
      // 0aa: iload 8
      // 0ac: iload 2
      // 0ad: ifeq 0fe
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b6: athrow
      // 0b7: ifle 0fc
      // 0ba: goto 0c1
      // 0bd: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c0: athrow
      // 0c1: aload 5
      // 0c3: arraylength
      // 0c4: iload 8
      // 0c6: iadd
      // 0c7: newarray 8
      // 0c9: astore 9
      // 0cb: aload 5
      // 0cd: bipush 0
      // 0ce: aload 9
      // 0d0: bipush 0
      // 0d1: aload 5
      // 0d3: arraylength
      // 0d4: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0d7: aload 3
      // 0d8: iload 4
      // 0da: aload 9
      // 0dc: aload 5
      // 0de: arraylength
      // 0df: iload 8
      // 0e1: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0e4: aload 5
      // 0e6: invokestatic com/finalshell/core/E8.Q ([B)V
      // 0e9: aload 9
      // 0eb: astore 5
      // 0ed: iload 2
      // 0ee: ifne 0fc
      // 0f1: iload 2
      // 0f2: ifne 01d
      // 0f5: goto 0fc
      // 0f8: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fb: athrow
      // 0fc: iload 6
      // 0fe: iload 2
      // 0ff: ifeq 13c
      // 102: aload 3
      // 103: arraylength
      // 104: goto 10b
      // 107: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10a: athrow
      // 10b: if_icmpge 13a
      // 10e: aload 3
      // 10f: iload 6
      // 111: baload
      // 112: iload 2
      // 113: ifeq 13c
      // 116: goto 11d
      // 119: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11c: athrow
      // 11d: sipush 7986
      // 120: ldc2_w 1137286668398613566
      // 123: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 126: if_icmpne 13a
      // 129: goto 130
      // 12c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12f: athrow
      // 130: iinc 6 1
      // 133: goto 13a
      // 136: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 139: athrow
      // 13a: iload 6
      // 13c: istore 4
      // 13e: iload 2
      // 13f: ifne 016
      // 142: aload 5
      // 144: iload 2
      // 145: ifeq 161
      // 148: ifnull 15f
      // 14b: goto 152
      // 14e: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 151: athrow
      // 152: aload 0
      // 153: iload 4
      // 155: putfield com/finalshell/core/UJ.X I
      // 158: goto 15f
      // 15b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15e: athrow
      // 15f: aload 5
      // 161: areturn
   }

   public static boolean p(UJ param0, Map param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield com/finalshell/core/UJ.g [B
      // 004: astore 3
      // 005: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 008: aload 0
      // 009: getfield com/finalshell/core/UJ.X I
      // 00c: istore 4
      // 00e: aconst_null
      // 00f: astore 5
      // 011: aconst_null
      // 012: astore 6
      // 014: istore 2
      // 015: iload 4
      // 017: istore 7
      // 019: iload 7
      // 01b: aload 3
      // 01c: arraylength
      // 01d: if_icmpge 12a
      // 020: aload 3
      // 021: iload 7
      // 023: baload
      // 024: sipush 4757
      // 027: ldc2_w 8019435346455583136
      // 02a: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 02d: iload 2
      // 02e: ifeq 071
      // 031: goto 038
      // 034: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 037: athrow
      // 038: if_icmpeq 064
      // 03b: goto 042
      // 03e: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 041: athrow
      // 042: aload 3
      // 043: iload 7
      // 045: baload
      // 046: sipush 24183
      // 049: ldc2_w 8568850088040830258
      // 04c: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 04f: iload 2
      // 050: ifeq 0c5
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: if_icmpne 0a6
      // 05d: goto 064
      // 060: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: iload 7
      // 066: bipush 1
      // 067: iadd
      // 068: aload 3
      // 069: arraylength
      // 06a: goto 071
      // 06d: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 070: athrow
      // 071: iload 2
      // 072: ifeq 095
      // 075: if_icmpge 12a
      // 078: goto 07f
      // 07b: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07e: athrow
      // 07f: aload 3
      // 080: iload 7
      // 082: bipush 1
      // 083: iadd
      // 084: baload
      // 085: sipush 7986
      // 088: ldc2_w 1137286668398613566
      // 08b: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 08e: goto 095
      // 091: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094: athrow
      // 095: if_icmpne 12a
      // 098: iinc 7 1
      // 09b: iload 2
      // 09c: ifne 12a
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a5: athrow
      // 0a6: aload 3
      // 0a7: iload 7
      // 0a9: iload 2
      // 0aa: ifeq 0d2
      // 0ad: goto 0b4
      // 0b0: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: baload
      // 0b5: sipush 4583
      // 0b8: ldc2_w 7301487692803693254
      // 0bb: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4: athrow
      // 0c5: if_icmpne 124
      // 0c8: aload 3
      // 0c9: iload 4
      // 0cb: goto 0d2
      // 0ce: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d1: athrow
      // 0d2: iload 7
      // 0d4: iload 4
      // 0d6: isub
      // 0d7: invokestatic com/finalshell/core/E8.O ([BII)Ljava/lang/String;
      // 0da: astore 5
      // 0dc: iinc 7 1
      // 0df: iload 7
      // 0e1: iload 2
      // 0e2: ifeq 11f
      // 0e5: aload 3
      // 0e6: arraylength
      // 0e7: if_icmpge 11d
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f0: athrow
      // 0f1: aload 3
      // 0f2: iload 7
      // 0f4: baload
      // 0f5: iload 2
      // 0f6: ifeq 11f
      // 0f9: goto 100
      // 0fc: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ff: athrow
      // 100: sipush 7327
      // 103: ldc2_w 3578940580507113374
      // 106: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 109: if_icmpne 11d
      // 10c: goto 113
      // 10f: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 112: athrow
      // 113: iinc 7 1
      // 116: goto 11d
      // 119: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11c: athrow
      // 11d: iload 7
      // 11f: istore 4
      // 121: goto 12a
      // 124: iinc 7 1
      // 127: goto 019
      // 12a: aload 5
      // 12c: ifnonnull 135
      // 12f: bipush 0
      // 130: ireturn
      // 131: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 134: athrow
      // 135: iload 4
      // 137: istore 7
      // 139: iload 7
      // 13b: aload 3
      // 13c: arraylength
      // 13d: if_icmpge 1e6
      // 140: aload 3
      // 141: iload 7
      // 143: iload 2
      // 144: ifeq 18e
      // 147: goto 14e
      // 14a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14d: athrow
      // 14e: baload
      // 14f: sipush 17717
      // 152: ldc2_w 5788020884913720895
      // 155: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 158: if_icmpeq 184
      // 15b: goto 162
      // 15e: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 161: athrow
      // 162: aload 3
      // 163: iload 7
      // 165: iload 2
      // 166: ifeq 18e
      // 169: goto 170
      // 16c: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16f: athrow
      // 170: baload
      // 171: sipush 7986
      // 174: ldc2_w 1137286668398613566
      // 177: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 17a: if_icmpne 1e0
      // 17d: goto 184
      // 180: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 183: athrow
      // 184: aload 3
      // 185: iload 4
      // 187: goto 18e
      // 18a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18d: athrow
      // 18e: iload 7
      // 190: iload 4
      // 192: isub
      // 193: invokestatic com/finalshell/core/E8.O ([BII)Ljava/lang/String;
      // 196: astore 6
      // 198: iinc 7 1
      // 19b: iload 7
      // 19d: iload 2
      // 19e: ifeq 1db
      // 1a1: aload 3
      // 1a2: arraylength
      // 1a3: if_icmpge 1d9
      // 1a6: goto 1ad
      // 1a9: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ac: athrow
      // 1ad: aload 3
      // 1ae: iload 7
      // 1b0: baload
      // 1b1: iload 2
      // 1b2: ifeq 1db
      // 1b5: goto 1bc
      // 1b8: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bb: athrow
      // 1bc: sipush 7986
      // 1bf: ldc2_w 1137286668398613566
      // 1c2: invokestatic com/finalshell/core/Ls4.a (IJ)I
      // 1c5: if_icmpne 1d9
      // 1c8: goto 1cf
      // 1cb: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ce: athrow
      // 1cf: iinc 7 1
      // 1d2: goto 1d9
      // 1d5: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d8: athrow
      // 1d9: iload 7
      // 1db: istore 4
      // 1dd: goto 1e6
      // 1e0: iinc 7 1
      // 1e3: goto 139
      // 1e6: aload 6
      // 1e8: iload 2
      // 1e9: ifeq 210
      // 1ec: ifnull 20e
      // 1ef: goto 1f6
      // 1f2: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f5: athrow
      // 1f6: aload 1
      // 1f7: aload 5
      // 1f9: aload 6
      // 1fb: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 200: pop
      // 201: aload 0
      // 202: iload 4
      // 204: putfield com/finalshell/core/UJ.X I
      // 207: goto 20e
      // 20a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20d: athrow
      // 20e: aload 5
      // 210: iload 2
      // 211: ifeq 220
      // 214: ifnull 22b
      // 217: goto 21e
      // 21a: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21d: athrow
      // 21e: aload 6
      // 220: ifnull 22b
      // 223: bipush 1
      // 224: goto 22c
      // 227: invokestatic com/finalshell/core/Ls4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22a: athrow
      // 22b: bipush 0
      // 22c: ireturn
   }

   void n(Ls4 var1) {
      this.Z = var1.Z;
      this.P = var1.P;
      this.m = var1.m;
      this.G = var1.G;
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 14828) & 65535;
      if (ab[var2] == null) {
         char[] var3 = S[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 24;
               break;
            case 1:
               var10000 = 49;
               break;
            case 2:
               var10000 = 161;
               break;
            case 3:
               var10000 = 225;
               break;
            case 4:
               var10000 = 254;
               break;
            case 5:
               var10000 = 203;
               break;
            case 6:
               var10000 = 248;
               break;
            case 7:
               var10000 = 4;
               break;
            case 8:
               var10000 = 47;
               break;
            case 9:
               var10000 = 128;
               break;
            case 10:
               var10000 = 163;
               break;
            case 11:
               var10000 = 29;
               break;
            case 12:
               var10000 = 44;
               break;
            case 13:
               var10000 = 67;
               break;
            case 14:
               var10000 = 77;
               break;
            case 15:
               var10000 = 152;
               break;
            case 16:
               var10000 = 68;
               break;
            case 17:
               var10000 = 102;
               break;
            case 18:
               var10000 = 182;
               break;
            case 19:
               var10000 = 73;
               break;
            case 20:
               var10000 = 79;
               break;
            case 21:
               var10000 = 13;
               break;
            case 22:
               var10000 = 95;
               break;
            case 23:
               var10000 = 5;
               break;
            case 24:
               var10000 = 133;
               break;
            case 25:
               var10000 = 249;
               break;
            case 26:
               var10000 = 251;
               break;
            case 27:
               var10000 = 60;
               break;
            case 28:
               var10000 = 33;
               break;
            case 29:
               var10000 = 228;
               break;
            case 30:
               var10000 = 6;
               break;
            case 31:
               var10000 = 31;
               break;
            case 32:
               var10000 = 217;
               break;
            case 33:
               var10000 = 214;
               break;
            case 34:
               var10000 = 208;
               break;
            case 35:
               var10000 = 192;
               break;
            case 36:
               var10000 = 98;
               break;
            case 37:
               var10000 = 91;
               break;
            case 38:
               var10000 = 174;
               break;
            case 39:
               var10000 = 177;
               break;
            case 40:
               var10000 = 76;
               break;
            case 41:
               var10000 = 16;
               break;
            case 42:
               var10000 = 132;
               break;
            case 43:
               var10000 = 65;
               break;
            case 44:
               var10000 = 210;
               break;
            case 45:
               var10000 = 149;
               break;
            case 46:
               var10000 = 200;
               break;
            case 47:
               var10000 = 53;
               break;
            case 48:
               var10000 = 51;
               break;
            case 49:
               var10000 = 137;
               break;
            case 50:
               var10000 = 14;
               break;
            case 51:
               var10000 = 253;
               break;
            case 52:
               var10000 = 223;
               break;
            case 53:
               var10000 = 198;
               break;
            case 54:
               var10000 = 237;
               break;
            case 55:
               var10000 = 212;
               break;
            case 56:
               var10000 = 154;
               break;
            case 57:
               var10000 = 99;
               break;
            case 58:
               var10000 = 61;
               break;
            case 59:
               var10000 = 3;
               break;
            case 60:
               var10000 = 94;
               break;
            case 61:
               var10000 = 126;
               break;
            case 62:
               var10000 = 226;
               break;
            case 63:
               var10000 = 111;
               break;
            case 64:
               var10000 = 183;
               break;
            case 65:
               var10000 = 153;
               break;
            case 66:
               var10000 = 142;
               break;
            case 67:
               var10000 = 148;
               break;
            case 68:
               var10000 = 129;
               break;
            case 69:
               var10000 = 0;
               break;
            case 70:
               var10000 = 138;
               break;
            case 71:
               var10000 = 84;
               break;
            case 72:
               var10000 = 55;
               break;
            case 73:
               var10000 = 184;
               break;
            case 74:
               var10000 = 8;
               break;
            case 75:
               var10000 = 188;
               break;
            case 76:
               var10000 = 83;
               break;
            case 77:
               var10000 = 234;
               break;
            case 78:
               var10000 = 12;
               break;
            case 79:
               var10000 = 112;
               break;
            case 80:
               var10000 = 130;
               break;
            case 81:
               var10000 = 186;
               break;
            case 82:
               var10000 = 221;
               break;
            case 83:
               var10000 = 64;
               break;
            case 84:
               var10000 = 233;
               break;
            case 85:
               var10000 = 93;
               break;
            case 86:
               var10000 = 63;
               break;
            case 87:
               var10000 = 34;
               break;
            case 88:
               var10000 = 158;
               break;
            case 89:
               var10000 = 35;
               break;
            case 90:
               var10000 = 171;
               break;
            case 91:
               var10000 = 40;
               break;
            case 92:
               var10000 = 18;
               break;
            case 93:
               var10000 = 46;
               break;
            case 94:
               var10000 = 41;
               break;
            case 95:
               var10000 = 120;
               break;
            case 96:
               var10000 = 165;
               break;
            case 97:
               var10000 = 145;
               break;
            case 98:
               var10000 = 2;
               break;
            case 99:
               var10000 = 156;
               break;
            case 100:
               var10000 = 9;
               break;
            case 101:
               var10000 = 215;
               break;
            case 102:
               var10000 = 244;
               break;
            case 103:
               var10000 = 144;
               break;
            case 104:
               var10000 = 119;
               break;
            case 105:
               var10000 = 135;
               break;
            case 106:
               var10000 = 92;
               break;
            case 107:
               var10000 = 113;
               break;
            case 108:
               var10000 = 88;
               break;
            case 109:
               var10000 = 118;
               break;
            case 110:
               var10000 = 25;
               break;
            case 111:
               var10000 = 30;
               break;
            case 112:
               var10000 = 230;
               break;
            case 113:
               var10000 = 220;
               break;
            case 114:
               var10000 = 81;
               break;
            case 115:
               var10000 = 90;
               break;
            case 116:
               var10000 = 238;
               break;
            case 117:
               var10000 = 207;
               break;
            case 118:
               var10000 = 109;
               break;
            case 119:
               var10000 = 56;
               break;
            case 120:
               var10000 = 206;
               break;
            case 121:
               var10000 = 122;
               break;
            case 122:
               var10000 = 227;
               break;
            case 123:
               var10000 = 167;
               break;
            case 124:
               var10000 = 209;
               break;
            case 125:
               var10000 = 20;
               break;
            case 126:
               var10000 = 71;
               break;
            case 127:
               var10000 = 147;
               break;
            case 128:
               var10000 = 250;
               break;
            case 129:
               var10000 = 143;
               break;
            case 130:
               var10000 = 36;
               break;
            case 131:
               var10000 = 86;
               break;
            case 132:
               var10000 = 236;
               break;
            case 133:
               var10000 = 15;
               break;
            case 134:
               var10000 = 216;
               break;
            case 135:
               var10000 = 19;
               break;
            case 136:
               var10000 = 7;
               break;
            case 137:
               var10000 = 45;
               break;
            case 138:
               var10000 = 232;
               break;
            case 139:
               var10000 = 245;
               break;
            case 140:
               var10000 = 124;
               break;
            case 141:
               var10000 = 114;
               break;
            case 142:
               var10000 = 107;
               break;
            case 143:
               var10000 = 100;
               break;
            case 144:
               var10000 = 173;
               break;
            case 145:
               var10000 = 28;
               break;
            case 146:
               var10000 = 37;
               break;
            case 147:
               var10000 = 74;
               break;
            case 148:
               var10000 = 240;
               break;
            case 149:
               var10000 = 87;
               break;
            case 150:
               var10000 = 97;
               break;
            case 151:
               var10000 = 197;
               break;
            case 152:
               var10000 = 213;
               break;
            case 153:
               var10000 = 180;
               break;
            case 154:
               var10000 = 136;
               break;
            case 155:
               var10000 = 78;
               break;
            case 156:
               var10000 = 58;
               break;
            case 157:
               var10000 = 175;
               break;
            case 158:
               var10000 = 134;
               break;
            case 159:
               var10000 = 38;
               break;
            case 160:
               var10000 = 59;
               break;
            case 161:
               var10000 = 193;
               break;
            case 162:
               var10000 = 32;
               break;
            case 163:
               var10000 = 241;
               break;
            case 164:
               var10000 = 194;
               break;
            case 165:
               var10000 = 106;
               break;
            case 166:
               var10000 = 115;
               break;
            case 167:
               var10000 = 247;
               break;
            case 168:
               var10000 = 105;
               break;
            case 169:
               var10000 = 101;
               break;
            case 170:
               var10000 = 187;
               break;
            case 171:
               var10000 = 196;
               break;
            case 172:
               var10000 = 75;
               break;
            case 173:
               var10000 = 239;
               break;
            case 174:
               var10000 = 82;
               break;
            case 175:
               var10000 = 66;
               break;
            case 176:
               var10000 = 222;
               break;
            case 177:
               var10000 = 199;
               break;
            case 178:
               var10000 = 211;
               break;
            case 179:
               var10000 = 54;
               break;
            case 180:
               var10000 = 179;
               break;
            case 181:
               var10000 = 157;
               break;
            case 182:
               var10000 = 204;
               break;
            case 183:
               var10000 = 50;
               break;
            case 184:
               var10000 = 80;
               break;
            case 185:
               var10000 = 146;
               break;
            case 186:
               var10000 = 110;
               break;
            case 187:
               var10000 = 162;
               break;
            case 188:
               var10000 = 224;
               break;
            case 189:
               var10000 = 246;
               break;
            case 190:
               var10000 = 96;
               break;
            case 191:
               var10000 = 17;
               break;
            case 192:
               var10000 = 151;
               break;
            case 193:
               var10000 = 117;
               break;
            case 194:
               var10000 = 160;
               break;
            case 195:
               var10000 = 166;
               break;
            case 196:
               var10000 = 159;
               break;
            case 197:
               var10000 = 85;
               break;
            case 198:
               var10000 = 141;
               break;
            case 199:
               var10000 = 104;
               break;
            case 200:
               var10000 = 172;
               break;
            case 201:
               var10000 = 201;
               break;
            case 202:
               var10000 = 170;
               break;
            case 203:
               var10000 = 155;
               break;
            case 204:
               var10000 = 1;
               break;
            case 205:
               var10000 = 242;
               break;
            case 206:
               var10000 = 235;
               break;
            case 207:
               var10000 = 231;
               break;
            case 208:
               var10000 = 168;
               break;
            case 209:
               var10000 = 10;
               break;
            case 210:
               var10000 = 164;
               break;
            case 211:
               var10000 = 218;
               break;
            case 212:
               var10000 = 219;
               break;
            case 213:
               var10000 = 26;
               break;
            case 214:
               var10000 = 189;
               break;
            case 215:
               var10000 = 255;
               break;
            case 216:
               var10000 = 140;
               break;
            case 217:
               var10000 = 176;
               break;
            case 218:
               var10000 = 202;
               break;
            case 219:
               var10000 = 89;
               break;
            case 220:
               var10000 = 69;
               break;
            case 221:
               var10000 = 27;
               break;
            case 222:
               var10000 = 243;
               break;
            case 223:
               var10000 = 205;
               break;
            case 224:
               var10000 = 125;
               break;
            case 225:
               var10000 = 191;
               break;
            case 226:
               var10000 = 62;
               break;
            case 227:
               var10000 = 52;
               break;
            case 228:
               var10000 = 22;
               break;
            case 229:
               var10000 = 57;
               break;
            case 230:
               var10000 = 181;
               break;
            case 231:
               var10000 = 139;
               break;
            case 232:
               var10000 = 23;
               break;
            case 233:
               var10000 = 116;
               break;
            case 234:
               var10000 = 70;
               break;
            case 235:
               var10000 = 229;
               break;
            case 236:
               var10000 = 103;
               break;
            case 237:
               var10000 = 150;
               break;
            case 238:
               var10000 = 252;
               break;
            case 239:
               var10000 = 123;
               break;
            case 240:
               var10000 = 169;
               break;
            case 241:
               var10000 = 21;
               break;
            case 242:
               var10000 = 48;
               break;
            case 243:
               var10000 = 190;
               break;
            case 244:
               var10000 = 195;
               break;
            case 245:
               var10000 = 131;
               break;
            case 246:
               var10000 = 43;
               break;
            case 247:
               var10000 = 178;
               break;
            case 248:
               var10000 = 127;
               break;
            case 249:
               var10000 = 11;
               break;
            case 250:
               var10000 = 39;
               break;
            case 251:
               var10000 = 108;
               break;
            case 252:
               var10000 = 121;
               break;
            case 253:
               var10000 = 72;
               break;
            case 254:
               var10000 = 42;
               break;
            default:
               var10000 = 185;
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

         ab[var2] = new String(var3).intern();
      }

      return ab[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19220;
      if (eb[var3] == null) {
         eb[var3] = (int)(db[var3] ^ var1);
      }

      return eb[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[88];
      int var11 = 0;
      String var10 = "aqß\u007f\u0086\u0092G\u0004½j [VÄvÊÜwVWË\u000f¢\\\u0083ë\u0096UÙP+×jB\u0095\u008fÀ\bøÃ\u001f\u0093[ôÿ8&jÓ¾+ª\u0018ÂU\r@4\u0015\u009bph¸uO(³:Ã°x0\u0096¯\u000e\u008f\u009aÌ\u001d¨.g\u000b½y\u0016æýú\r×}\u0001\u0001·F¬Ç\u00886XÜ~ç¿U·\u008e\u0007\u001e'\u0086¤\u008d\u0097T\u0007\u001d×ì¦Ú;Ì\u0007B5v\u0085wøW\u0013Pñ\u00972'\u008e¤ûö\u0018ÎEÀ\u0006â³£J\u008a=\"[Ï^\u000f~à)\u0019\u0002º\u0007ê8©â-nG¦|r\u0098QÉ!¥5?õkø\u0098Æ5÷p\u0005/¦æ9F]k\u008cU\u001a\u009f^O`Ë|PÐå\u0087\u00adË&,5@Á\u001c\u00170Knþ¬Âb±>\n\u0080ï\u0089/\u0082C8>{$%\u0018·\u009fÿ\u0089ª¡\u0085ÛÖ\u001a\u0003\u0003w@\u007f\u009fE-\u0001È»\u0015c&½9\u0003@t;7T\u0090¢\u008b\u0005u½\u0018¶L¼\u0002Xè\u0011DkÜn\u008câM\rå½\u001dÊ~¤$Á{\u0013°\u0090\u008b\u001e¤\u000bÔKø\u000e\u000f\u0087ø^å¸C+\u0096.\u0000$\u0081Þ?Æ)\u0096oHÊ1Î\u0019^\u0081ÍéÄ\u009d\u0003±µW\u009cMø\u0087±}Q»\u0005Ä\tð¤|È\u0002À\u001bQ\\Q4,'M\u0083½_\u0004Bèß|æx5}\u009aèý\u0084m#\u000b\f7ý\u0005õ<\u00ad\u001b¼\u0019Â³\u0088\u0099wR7\nña¯»_\u0013 y\u0099#æ¬\u009c¿ñ\u0090.TÜ$a÷ÔÅ\u0084\r> Ä.áñj#Öµ\u0001Ë\b\n\u0012¸L\u009cý)\u007f|\u001bÓ\u0006 k\u001eNz\u0081'¨z2u?\u009a±\b\u0084N\u0013ã\u0086C$\u008d\u009c\u0083q\u001bºÅGîÏår\u0089S\u008dÁ\u0093H[V\u0084W\u0081Ñ\u0013ÞYF'\u001d,ã¯\u001e\u0092Ó\u0014c,\u0096ö+èX\r%º\u009atêÆ\u00ad6Bß\u0006ßV\u0016\u0003ùe\u0010_¡dP¡~\u00adÚEÒ\u0085êU_¾5¶ö\bÕ¡\u0084\u0017)ª\u0091\u008f\u001f¡¥¡aÀ\u001e\u0007DZY{£à{Ý\u0010¯\u0003±+\u000b)?uö\u0089ë\u0010¾¹B\u001cévZÚdè%u!Ìx\u0014ÖÙ\u0093\u0004\t1\u0094Úè\u0095\u0007\u0086\u0094\u0088nk\u0007~2\u0080\u001aW¬}\u0011\\\u007fìû²Ìÿñz\\\u0013\u0006»\u009b>L¼\u001a¤}gþ\u0091¢¥\u0002áª¹_?Ý\f\u007f\bÎA\u0096\u0011\u009aX\u0007:Ã\u0004w?¾_\u0015ßÝÅDc\u00835A\"wÐÅ\u000f\u009dÏ½(%x\u0090\u008b\u000bö\n\u009b\u0001/4`\u0091S °\n¦Û¢ä\u00adÊv\n\n.'\u000b1F\u001c±·`\u00ad¾úTun\u00919Ô3Ï\t\u0016µd¦ÚócõY£\u0097ßÐ\u008b3.\u0089X 0\u0017\u008cÉbh1p±Xcáý6-åÒ\u008a°\u008b\u0007ö²\u000f_\u0007\u0012#\u0007$«\u0087V\u0007V\u0097\u008f²¬Up\nè8\u0013\u008c\u0016+\u0002<´Û\u0004\u009bÛÝ\u0017\u00053ï*Åe\u0006/î\u0087\u0084`í\n\u001fÄ]9\u0081\u0093l¯\u0006ï\tåÇù¸c\u0003ïvi ½'\u0015ßsòùçj\u001b\u009f¨Nß-wº\u009eW\u0092\u0086\u0085sê\u0080èt>Îê·¿\nËcwä\u009dK\u0094ÿf£\f\u008c<\u0099@(r\u0012Ç½cæà\u0007Ì7ïy\u0004yC\u0007\u0019\u0015\u001d\u0081\u001ax÷\u001d.DP]þ\u009eË°À¹\u001f\u001a\u0010\\ìäµ_©\u0095\u000b\u0018\u001eH~\n>\u009a¨\u000b\u001c\u008c½²\u000e\u001e1.Ñ s\u0011H6nÒâéõU)Ë8\u008eî£á3\u0092\u001a²z¥\u001eÉ¾®\u0081\u0080Ú\u0095Qº\u001c¼G\u001eÉ\u0083vI\u0086S\u0084[³\u0012÷\u0005ü\u0012\u0017\u009e\u0019}¥ÉÓ/§W\u0016e^£\u0004\u001eó>é\u0015QçÙ\u00adFÈ_O¾\u0003FjZn<ûm®´;Í\u0018þ*ø\u007ffÛ\u009a áK¿C\u001b\\\u009bW\u0097¾+K\u0098âr\u0085\u0003\"k\u0081\u0015(\u0094;m¼¦Îå]ã?WòÏp÷ßl\u0086¹U\t¶»\u0099îMx]öë\na\u0097\u009fcäö\r±\u0011»\u0007¹ñr~\u0005Ì\u0083\næ\u008bÒù\"â\t\u0081Õl\b@Ò\b±¹°£°\u0013\u000e \\\u0018^Ë\u008bS\u0013\rrçWR\u00109û\u0011B\u0016þÅù\n·\u009d\r\u001d6Å\u009c·\u008e8\u0098\u001dfß¼R×n\u0012\u00061þ\u0005fè<ópfRÀ\u0093â5â\u0004\u0005=\"ÐÏ/\u000fPàì\u0019ºº\u0010êÚ©¾-åG×|\\\u0098\u0094É\u0099¥\"?\u0017k¤\u0098M5\u0086p+/cæ\u0081FJknUF\u009fÕO\u0011ËRP\u0015å?\u00adÜ&\u0012¥v¶|^S0Ä\u0080þwÉ3\u008b\u0084þ\fÐ\u000eùAT¼Ä\u0082X:_RW2\u0087\u0012\u001aìâ»îÿ\u0001\u0004\u008e\u0019µ´úÔñ%\u001d\u0087Æ4Q³8\u0087j4r\nÃýv7¶;\u009bº\u0087\u000b\u0011\u000e4íFªO\u0080\u0019O\u0090;\u0014Âv¡\u008e\u0096\u001aS£\u0099%NÙ^m\u009eGQñÞ~Hì\u0080¼PØ3S\u001c>²ä\u0011¶\u0001±4\u00195\u008aÎÔ»Æú\u0001\u0004i¿V\u0013 ¯\u0089ùä÷ÜÔùý/ùü\u0091eAT\u0013\u0094\u0004@Éõ®\u0004:\u0002é,\t\u0098RV\n\u0096UQ¼¾\r>zùl\u0086Å K÷Ð(ô\u0006\u000bt.Ë\u0085%¤!\u0083{âµ\u0017Â¸«F\bµ\u0096à\u0087öaÔ¾¹ \u0001þëÆ×\u008füj\u001b\u008d^B\u009a5.1\u0093s\u0098ë\u0019u\u0015Ef!êoï¶ûà\u0095Î¯^\u00151MÕøÇbo\u001a¸©\u0081(CÀÔJ\u0088gÜU\u009a:p´£Kc\u0017·ÿ\u000bF@ù[P\u00adâ\u0099¾*<\u001f\u009bÞÀM\u000fãxª¬)~rZ¢\u00856ÁÉ\u008dþ\u0085qyRÀSOYå\u0014M\u0013¨ÒIpã\u0018\t\u0000òd¼ \u0098Ç\u001c¾àÅÅ\u000e^!]5\u008c\u009e°¼\u00ad\u0002'½¦\u0090îké;fÕ\u00839ZÃt\u008ch\u008eRÔî\u000e{Ñ9\u001d\u001f(Ö\u0018f¨îeôóqã?G";
      int var12 = "aqß\u007f\u0086\u0092G\u0004½j [VÄvÊÜwVWË\u000f¢\\\u0083ë\u0096UÙP+×jB\u0095\u008fÀ\bøÃ\u001f\u0093[ôÿ8&jÓ¾+ª\u0018ÂU\r@4\u0015\u009bph¸uO(³:Ã°x0\u0096¯\u000e\u008f\u009aÌ\u001d¨.g\u000b½y\u0016æýú\r×}\u0001\u0001·F¬Ç\u00886XÜ~ç¿U·\u008e\u0007\u001e'\u0086¤\u008d\u0097T\u0007\u001d×ì¦Ú;Ì\u0007B5v\u0085wøW\u0013Pñ\u00972'\u008e¤ûö\u0018ÎEÀ\u0006â³£J\u008a=\"[Ï^\u000f~à)\u0019\u0002º\u0007ê8©â-nG¦|r\u0098QÉ!¥5?õkø\u0098Æ5÷p\u0005/¦æ9F]k\u008cU\u001a\u009f^O`Ë|PÐå\u0087\u00adË&,5@Á\u001c\u00170Knþ¬Âb±>\n\u0080ï\u0089/\u0082C8>{$%\u0018·\u009fÿ\u0089ª¡\u0085ÛÖ\u001a\u0003\u0003w@\u007f\u009fE-\u0001È»\u0015c&½9\u0003@t;7T\u0090¢\u008b\u0005u½\u0018¶L¼\u0002Xè\u0011DkÜn\u008câM\rå½\u001dÊ~¤$Á{\u0013°\u0090\u008b\u001e¤\u000bÔKø\u000e\u000f\u0087ø^å¸C+\u0096.\u0000$\u0081Þ?Æ)\u0096oHÊ1Î\u0019^\u0081ÍéÄ\u009d\u0003±µW\u009cMø\u0087±}Q»\u0005Ä\tð¤|È\u0002À\u001bQ\\Q4,'M\u0083½_\u0004Bèß|æx5}\u009aèý\u0084m#\u000b\f7ý\u0005õ<\u00ad\u001b¼\u0019Â³\u0088\u0099wR7\nña¯»_\u0013 y\u0099#æ¬\u009c¿ñ\u0090.TÜ$a÷ÔÅ\u0084\r> Ä.áñj#Öµ\u0001Ë\b\n\u0012¸L\u009cý)\u007f|\u001bÓ\u0006 k\u001eNz\u0081'¨z2u?\u009a±\b\u0084N\u0013ã\u0086C$\u008d\u009c\u0083q\u001bºÅGîÏår\u0089S\u008dÁ\u0093H[V\u0084W\u0081Ñ\u0013ÞYF'\u001d,ã¯\u001e\u0092Ó\u0014c,\u0096ö+èX\r%º\u009atêÆ\u00ad6Bß\u0006ßV\u0016\u0003ùe\u0010_¡dP¡~\u00adÚEÒ\u0085êU_¾5¶ö\bÕ¡\u0084\u0017)ª\u0091\u008f\u001f¡¥¡aÀ\u001e\u0007DZY{£à{Ý\u0010¯\u0003±+\u000b)?uö\u0089ë\u0010¾¹B\u001cévZÚdè%u!Ìx\u0014ÖÙ\u0093\u0004\t1\u0094Úè\u0095\u0007\u0086\u0094\u0088nk\u0007~2\u0080\u001aW¬}\u0011\\\u007fìû²Ìÿñz\\\u0013\u0006»\u009b>L¼\u001a¤}gþ\u0091¢¥\u0002áª¹_?Ý\f\u007f\bÎA\u0096\u0011\u009aX\u0007:Ã\u0004w?¾_\u0015ßÝÅDc\u00835A\"wÐÅ\u000f\u009dÏ½(%x\u0090\u008b\u000bö\n\u009b\u0001/4`\u0091S °\n¦Û¢ä\u00adÊv\n\n.'\u000b1F\u001c±·`\u00ad¾úTun\u00919Ô3Ï\t\u0016µd¦ÚócõY£\u0097ßÐ\u008b3.\u0089X 0\u0017\u008cÉbh1p±Xcáý6-åÒ\u008a°\u008b\u0007ö²\u000f_\u0007\u0012#\u0007$«\u0087V\u0007V\u0097\u008f²¬Up\nè8\u0013\u008c\u0016+\u0002<´Û\u0004\u009bÛÝ\u0017\u00053ï*Åe\u0006/î\u0087\u0084`í\n\u001fÄ]9\u0081\u0093l¯\u0006ï\tåÇù¸c\u0003ïvi ½'\u0015ßsòùçj\u001b\u009f¨Nß-wº\u009eW\u0092\u0086\u0085sê\u0080èt>Îê·¿\nËcwä\u009dK\u0094ÿf£\f\u008c<\u0099@(r\u0012Ç½cæà\u0007Ì7ïy\u0004yC\u0007\u0019\u0015\u001d\u0081\u001ax÷\u001d.DP]þ\u009eË°À¹\u001f\u001a\u0010\\ìäµ_©\u0095\u000b\u0018\u001eH~\n>\u009a¨\u000b\u001c\u008c½²\u000e\u001e1.Ñ s\u0011H6nÒâéõU)Ë8\u008eî£á3\u0092\u001a²z¥\u001eÉ¾®\u0081\u0080Ú\u0095Qº\u001c¼G\u001eÉ\u0083vI\u0086S\u0084[³\u0012÷\u0005ü\u0012\u0017\u009e\u0019}¥ÉÓ/§W\u0016e^£\u0004\u001eó>é\u0015QçÙ\u00adFÈ_O¾\u0003FjZn<ûm®´;Í\u0018þ*ø\u007ffÛ\u009a áK¿C\u001b\\\u009bW\u0097¾+K\u0098âr\u0085\u0003\"k\u0081\u0015(\u0094;m¼¦Îå]ã?WòÏp÷ßl\u0086¹U\t¶»\u0099îMx]öë\na\u0097\u009fcäö\r±\u0011»\u0007¹ñr~\u0005Ì\u0083\næ\u008bÒù\"â\t\u0081Õl\b@Ò\b±¹°£°\u0013\u000e \\\u0018^Ë\u008bS\u0013\rrçWR\u00109û\u0011B\u0016þÅù\n·\u009d\r\u001d6Å\u009c·\u008e8\u0098\u001dfß¼R×n\u0012\u00061þ\u0005fè<ópfRÀ\u0093â5â\u0004\u0005=\"ÐÏ/\u000fPàì\u0019ºº\u0010êÚ©¾-åG×|\\\u0098\u0094É\u0099¥\"?\u0017k¤\u0098M5\u0086p+/cæ\u0081FJknUF\u009fÕO\u0011ËRP\u0015å?\u00adÜ&\u0012¥v¶|^S0Ä\u0080þwÉ3\u008b\u0084þ\fÐ\u000eùAT¼Ä\u0082X:_RW2\u0087\u0012\u001aìâ»îÿ\u0001\u0004\u008e\u0019µ´úÔñ%\u001d\u0087Æ4Q³8\u0087j4r\nÃýv7¶;\u009bº\u0087\u000b\u0011\u000e4íFªO\u0080\u0019O\u0090;\u0014Âv¡\u008e\u0096\u001aS£\u0099%NÙ^m\u009eGQñÞ~Hì\u0080¼PØ3S\u001c>²ä\u0011¶\u0001±4\u00195\u008aÎÔ»Æú\u0001\u0004i¿V\u0013 ¯\u0089ùä÷ÜÔùý/ùü\u0091eAT\u0013\u0094\u0004@Éõ®\u0004:\u0002é,\t\u0098RV\n\u0096UQ¼¾\r>zùl\u0086Å K÷Ð(ô\u0006\u000bt.Ë\u0085%¤!\u0083{âµ\u0017Â¸«F\bµ\u0096à\u0087öaÔ¾¹ \u0001þëÆ×\u008füj\u001b\u008d^B\u009a5.1\u0093s\u0098ë\u0019u\u0015Ef!êoï¶ûà\u0095Î¯^\u00151MÕøÇbo\u001a¸©\u0081(CÀÔJ\u0088gÜU\u009a:p´£Kc\u0017·ÿ\u000bF@ù[P\u00adâ\u0099¾*<\u001f\u009bÞÀM\u000fãxª¬)~rZ¢\u00856ÁÉ\u008dþ\u0085qyRÀSOYå\u0014M\u0013¨ÒIpã\u0018\t\u0000òd¼ \u0098Ç\u001c¾àÅÅ\u000e^!]5\u008c\u009e°¼\u00ad\u0002'½¦\u0090îké;fÕ\u00839ZÃt\u008ch\u008eRÔî\u000e{Ñ9\u001d\u001f(Ö\u0018f¨îeôóqã?G"
         .length();
      char var9 = 21;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 18;
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
                        var65 = 26;
                        break;
                     case 1:
                        var65 = 42;
                        break;
                     case 2:
                        var65 = 35;
                        break;
                     case 3:
                        var65 = 101;
                        break;
                     case 4:
                        var65 = 104;
                        break;
                     case 5:
                        var65 = 4;
                        break;
                     default:
                        var65 = 35;
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
                     S = var13;
                     ab = new String[88];
                     long var0 = 2076544597333440843L;
                     long[] var6 = new long[87];
                     int var3 = 0;
                     String var4 = "J/ë(Û^sB\u0004\fxQéÊ\u0090W\u001d£\n\\\u0017.ÍW\u00ad\u0094\u0081\u0096ÿÖbÚç\u007f\u008dQ{\u0083\u0081\u0085]L/~\u0005ândbõ´n\u0098&·\u009dâ{o\u000b\u0094wçX!4\u00156ö\u001b¹¼t\u0018\u0097²vrg\u0097\u0083þXéìaSüEº\u009dãw'\u0019Ðé¥%Z*2áÎ@ºÒ\u001a_Å\u008fYè\u0003K;Ç\u00adÆ\u0080aO¨q³!Òht\u0081êüÖ¿\u008cÀÛÏ\u009aSB¼\u0096\u000e\u0094_;í\u007f\u0086\u009dDR\u008aÞ\bäA¸\u0091Ñ#=n8í(\nkÜÜdÙ\u000b®õy\u0000\u0095\u001f¨û;öõ\u0091\u0006c\"þY\u0097\u0098äô«)ÿ-\u007f\u0090v]Z\u008c7\u008f[Ë`Ëû,\fBä©ÿÚð\tt\u001bâj¶÷:\u008b\u0081%\u0016\u0016\u0011á\u0093\u008fîpT×ßac1\u0083÷yË<7Î\u00864\u008c\u0091\u0010B\u000f\rÁèMì(ô\u0092JXâ æ]V©+\u001e\u008dÞ\u000b\u0005Âr\u0092îk\u008e÷ñÕd\u008b#÷\u0081\u000e¾\u0094[\n¸[\u0016±Ô.«\u0087\u00825k\u0014ºim\u001dÍÑ·N×£ëýç%\u0004u\u0088d§\u001cï\u0085jxSä/\u008b\nÜ@R\u001c*C\u0004\u0005Æ\u0081!¶\u0082ÈPz\u0002f\u0084\u0000GÈ\u008bx¥\u009dcg\u0010(¬0±\u0096w¹É\u009e3½ |´ÌUÜ2ÝAì\"ÁÏ\u0086}eD\u001c(¦=¯³ÆzuM\\l*\u008f\u00153\u00925~Ø 2m|æú\u001b\u000elª\t#£·\u008b<ÏÌ-\u008eµá\u0000V\u0011~V\u0086²ù\u0010Ä/òåw¬^¢ý7\u0086Bø¹\u0004\u009e\u0087%¹îßú2s\u0099ñ\u0082jÔýÿ|,\u0092Ð\"{\u0006¹9\u0090\u008b\u008có©\u008cøì\u0011Æ\u009a\u0085+î\u001fy\u009c·dó\u0095N¶»a\u0099\u0097O\u009c0%9¾\u0091BR\u001cÊ\u000fñ+\u009d;\u0012ì.±ôê|,®²\u00adã¶\u0015ùüßi\u000b\u009eö,áméÙ\u0011¥)\u0093\f Î \r¬è\u0098\u0011[\u0091\u0003\u00009\u0086z¦!\u007fñ\u0099Êa\u0084Ý¯ÓD\u0092Ó£Û¨\u0004\u000eç\u008cZná\u009a+>Sèäå3\u0087ó\u000f\u0086Þnö\u008cÿ\u0090sÌ\u0019hì\u008ex#\u0096\u0000(\u0006\u0084 Ü ï\u000f\u0006\u0094\u000eÀ\u0012+}\u0092×àWU\u0005ýsols\u008cU\u0014g\u0091õ\u001eì\"TUw½þÛ\u0095Ï,\u009dH\u0089ä°í";
                     int var5 = "J/ë(Û^sB\u0004\fxQéÊ\u0090W\u001d£\n\\\u0017.ÍW\u00ad\u0094\u0081\u0096ÿÖbÚç\u007f\u008dQ{\u0083\u0081\u0085]L/~\u0005ândbõ´n\u0098&·\u009dâ{o\u000b\u0094wçX!4\u00156ö\u001b¹¼t\u0018\u0097²vrg\u0097\u0083þXéìaSüEº\u009dãw'\u0019Ðé¥%Z*2áÎ@ºÒ\u001a_Å\u008fYè\u0003K;Ç\u00adÆ\u0080aO¨q³!Òht\u0081êüÖ¿\u008cÀÛÏ\u009aSB¼\u0096\u000e\u0094_;í\u007f\u0086\u009dDR\u008aÞ\bäA¸\u0091Ñ#=n8í(\nkÜÜdÙ\u000b®õy\u0000\u0095\u001f¨û;öõ\u0091\u0006c\"þY\u0097\u0098äô«)ÿ-\u007f\u0090v]Z\u008c7\u008f[Ë`Ëû,\fBä©ÿÚð\tt\u001bâj¶÷:\u008b\u0081%\u0016\u0016\u0011á\u0093\u008fîpT×ßac1\u0083÷yË<7Î\u00864\u008c\u0091\u0010B\u000f\rÁèMì(ô\u0092JXâ æ]V©+\u001e\u008dÞ\u000b\u0005Âr\u0092îk\u008e÷ñÕd\u008b#÷\u0081\u000e¾\u0094[\n¸[\u0016±Ô.«\u0087\u00825k\u0014ºim\u001dÍÑ·N×£ëýç%\u0004u\u0088d§\u001cï\u0085jxSä/\u008b\nÜ@R\u001c*C\u0004\u0005Æ\u0081!¶\u0082ÈPz\u0002f\u0084\u0000GÈ\u008bx¥\u009dcg\u0010(¬0±\u0096w¹É\u009e3½ |´ÌUÜ2ÝAì\"ÁÏ\u0086}eD\u001c(¦=¯³ÆzuM\\l*\u008f\u00153\u00925~Ø 2m|æú\u001b\u000elª\t#£·\u008b<ÏÌ-\u008eµá\u0000V\u0011~V\u0086²ù\u0010Ä/òåw¬^¢ý7\u0086Bø¹\u0004\u009e\u0087%¹îßú2s\u0099ñ\u0082jÔýÿ|,\u0092Ð\"{\u0006¹9\u0090\u008b\u008có©\u008cøì\u0011Æ\u009a\u0085+î\u001fy\u009c·dó\u0095N¶»a\u0099\u0097O\u009c0%9¾\u0091BR\u001cÊ\u000fñ+\u009d;\u0012ì.±ôê|,®²\u00adã¶\u0015ùüßi\u000b\u009eö,áméÙ\u0011¥)\u0093\f Î \r¬è\u0098\u0011[\u0091\u0003\u00009\u0086z¦!\u007fñ\u0099Êa\u0084Ý¯ÓD\u0092Ó£Û¨\u0004\u000eç\u008cZná\u009a+>Sèäå3\u0087ó\u000f\u0086Þnö\u008cÿ\u0090sÌ\u0019hì\u008ex#\u0096\u0000(\u0006\u0084 Ü ï\u000f\u0006\u0094\u000eÀ\u0012+}\u0092×àWU\u0005ýsols\u008cU\u0014g\u0091õ\u001eì\"TUw½þÛ\u0095Ï,\u009dH\u0089ä°í"
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
                                    db = var6;
                                    eb = new Integer[87];
                                    v = E8.J(a(14829, -12416));
                                    t = E8.J("\n");
                                    r = new byte[][]{E8.J(a(14842, -12168)), E8.J(a(14779, 25865))};
                                    A = E8.J(" ");
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\u0096B\u0084]\u009b\u0095\u0002@Ñ\u0098ìf\u00adã\u007fÏ";
                                 var5 = "\u0096B\u0084]\u009b\u0095\u0002@Ñ\u0098ìf\u00adã\u007fÏ".length();
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

                  var10 = "{L\u0080à\u0082*\u00962Çû\u0017\u0018\u0085Uá|Ã\u0016\u009f\u00ad\u0080\u001dÌ%Æóë\u0007\u0013\u009dmæî\u0005";
                  var12 = "{L\u0080à\u0082*\u00962Çû\u0017\u0018\u0085Uá|Ã\u0016\u009f\u00ad\u0080\u001dÌ%Æóë\u0007\u0013\u009dmæî\u0005".length();
                  var9 = '\n';
                  var17 = -1;
            }

            var10000 = 126;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}






