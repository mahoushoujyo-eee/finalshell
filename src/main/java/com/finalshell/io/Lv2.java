package com.finalshell.io;

import com.finalshell.core.DY3;
import com.finalshell.core.PO3;
import com.finalshell.core.S_2_2;
import java.io.IOException;
import java.io.OutputStream;

public class Lv2 extends OutputStream {
   public boolean P;
   public boolean m;
   public int[] e;
   public int N;
   public int C;
   public int F;
   public int b;
   public S_2_2 G;
   public byte[] r;
   public final byte[] t;
   public final long[] y;
   public final PO3 g;
   public final DY3 l;
   public static String[] a;
   public static String[] c;
   public static long d;

   public Lv2(DY3 var1, byte[] var2, long[] var3, PO3 var4) {
      this.l = var1;
      this.t = var2;
      this.y = var3;
      this.g = var4;
      this.P = true;
      this.m = false;
      this.e = new int[1];
      this.N = 0;
      this.C = 0;
      this.F = 0;
      this.b = 0;
      this.G = new S_2_2();
      this.r = new byte[1];
   }

   @Override
   public void write(byte[] var1) throws IOException {
      this.write(var1, 0, var1.length);
   }

   @Override
   public void write(byte[] param1, int param2, int param3) throws IOException {
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
      // 005: aload 0
      // 006: getfield com/finalshell/io/Lv2.P Z
      // 009: iload 4
      // 00b: ifeq 03e
      // 00e: ifeq 03a
      // 011: goto 018
      // 014: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: aload 0
      // 019: aload 0
      // 01a: getfield com/finalshell/io/Lv2.l Lcom/finalshell/core/DY3;
      // 01d: invokestatic com/finalshell/core/DY3.X (Lcom/finalshell/core/DY3;)I
      // 020: putfield com/finalshell/io/Lv2.N I
      // 023: aload 0
      // 024: aload 0
      // 025: getfield com/finalshell/io/Lv2.l Lcom/finalshell/core/DY3;
      // 028: invokestatic com/finalshell/core/DY3.X (Lcom/finalshell/core/DY3;)I
      // 02b: putfield com/finalshell/io/Lv2.C I
      // 02e: aload 0
      // 02f: bipush 0
      // 030: putfield com/finalshell/io/Lv2.P Z
      // 033: goto 03a
      // 036: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 039: athrow
      // 03a: aload 0
      // 03b: getfield com/finalshell/io/Lv2.m Z
      // 03e: iload 4
      // 040: ifeq 063
      // 043: ifeq 062
      // 046: goto 04d
      // 049: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04c: athrow
      // 04d: new java/io/IOException
      // 050: dup
      // 051: sipush 21167
      // 054: sipush 32421
      // 057: invokestatic com/finalshell/io/Lv2.a (II)Ljava/lang/String;
      // 05a: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 05d: athrow
      // 05e: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: iload 3
      // 063: istore 5
      // 065: iload 5
      // 067: ifle 19b
      // 06a: aload 0
      // 06b: getfield com/finalshell/io/Lv2.l Lcom/finalshell/core/DY3;
      // 06e: aload 0
      // 06f: getfield com/finalshell/io/Lv2.t [B
      // 072: aload 0
      // 073: getfield com/finalshell/io/Lv2.y [J
      // 076: bipush 0
      // 077: laload
      // 078: aload 1
      // 079: iload 2
      // 07a: iload 5
      // 07c: invokestatic com/finalshell/core/DY3.t (Lcom/finalshell/core/DY3;[BJ[BII)I
      // 07f: istore 6
      // 081: aload 0
      // 082: dup
      // 083: getfield com/finalshell/io/Lv2.b I
      // 086: bipush 1
      // 087: iadd
      // 088: putfield com/finalshell/io/Lv2.b I
      // 08b: aload 0
      // 08c: getfield com/finalshell/io/Lv2.y [J
      // 08f: bipush 0
      // 090: dup2
      // 091: laload
      // 092: iload 6
      // 094: i2l
      // 095: ladd
      // 096: lastore
      // 097: iload 2
      // 098: iload 6
      // 09a: iadd
      // 09b: istore 2
      // 09c: iload 5
      // 09e: iload 6
      // 0a0: isub
      // 0a1: istore 5
      // 0a3: aload 0
      // 0a4: getfield com/finalshell/io/Lv2.l Lcom/finalshell/core/DY3;
      // 0a7: invokestatic com/finalshell/core/DY3.X (Lcom/finalshell/core/DY3;)I
      // 0aa: bipush 1
      // 0ab: isub
      // 0ac: iload 4
      // 0ae: ifeq 1cc
      // 0b1: iload 4
      // 0b3: ifeq 100
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: getfield com/finalshell/io/Lv2.N I
      // 0c1: if_icmpeq 0ef
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: getfield com/finalshell/io/Lv2.l Lcom/finalshell/core/DY3;
      // 0cf: invokestatic com/finalshell/core/DY3.P (Lcom/finalshell/core/DY3;)Ljava/io/InputStream;
      // 0d2: invokevirtual java/io/InputStream.available ()I
      // 0d5: iload 4
      // 0d7: ifeq 100
      // 0da: goto 0e1
      // 0dd: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e0: athrow
      // 0e1: getstatic com/finalshell/io/Lv2.d J
      // 0e4: l2i
      // 0e5: if_icmplt 196
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: getfield com/finalshell/io/Lv2.l Lcom/finalshell/core/DY3;
      // 0f3: invokestatic com/finalshell/core/DY3.P (Lcom/finalshell/core/DY3;)Ljava/io/InputStream;
      // 0f6: invokevirtual java/io/InputStream.available ()I
      // 0f9: goto 100
      // 0fc: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ff: athrow
      // 100: ifle 196
      // 103: aload 0
      // 104: getfield com/finalshell/io/Lv2.l Lcom/finalshell/core/DY3;
      // 107: aload 0
      // 108: getfield com/finalshell/io/Lv2.e [I
      // 10b: aload 0
      // 10c: getfield com/finalshell/io/Lv2.G Lcom/finalshell/core/S_2_2;
      // 10f: invokestatic com/finalshell/core/DY3.q (Lcom/finalshell/core/DY3;[ILcom/finalshell/core/S_2_2;)Z
      // 112: iload 4
      // 114: ifeq 067
      // 117: goto 11e
      // 11a: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11d: athrow
      // 11e: iload 4
      // 120: ifeq 142
      // 123: ifeq 196
      // 126: goto 12d
      // 129: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12c: athrow
      // 12d: aload 0
      // 12e: aload 0
      // 12f: getfield com/finalshell/io/Lv2.e [I
      // 132: bipush 0
      // 133: iaload
      // 134: putfield com/finalshell/io/Lv2.C I
      // 137: aload 0
      // 138: getfield com/finalshell/io/Lv2.N I
      // 13b: goto 142
      // 13e: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 141: athrow
      // 142: aload 0
      // 143: getfield com/finalshell/io/Lv2.C I
      // 146: iload 4
      // 148: ifeq 175
      // 14b: if_icmpgt 178
      // 14e: goto 155
      // 151: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 154: athrow
      // 155: aload 0
      // 156: iload 4
      // 158: ifeq 188
      // 15b: goto 162
      // 15e: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 161: athrow
      // 162: getfield com/finalshell/io/Lv2.C I
      // 165: aload 0
      // 166: getfield com/finalshell/io/Lv2.l Lcom/finalshell/core/DY3;
      // 169: invokestatic com/finalshell/core/DY3.X (Lcom/finalshell/core/DY3;)I
      // 16c: bipush 1
      // 16d: isub
      // 16e: goto 175
      // 171: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 174: athrow
      // 175: if_icmple 187
      // 178: new com/finalshell/core/Dn2_2
      // 17b: dup
      // 17c: bipush 4
      // 17d: ldc ""
      // 17f: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 182: athrow
      // 183: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 186: athrow
      // 187: aload 0
      // 188: dup
      // 189: getfield com/finalshell/io/Lv2.F I
      // 18c: bipush 1
      // 18d: iadd
      // 18e: putfield com/finalshell/io/Lv2.F I
      // 191: iload 4
      // 193: ifne 0ef
      // 196: iload 4
      // 198: ifne 065
      // 19b: aload 0
      // 19c: getfield com/finalshell/io/Lv2.g Lcom/finalshell/core/PO3;
      // 19f: iload 4
      // 1a1: ifeq 1c5
      // 1a4: ifnull 1e4
      // 1a7: goto 1ae
      // 1aa: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ad: athrow
      // 1ae: aload 0
      // 1af: iload 4
      // 1b1: ifeq 1d0
      // 1b4: goto 1bb
      // 1b7: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ba: athrow
      // 1bb: getfield com/finalshell/io/Lv2.g Lcom/finalshell/core/PO3;
      // 1be: goto 1c5
      // 1c1: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c4: athrow
      // 1c5: iload 3
      // 1c6: i2l
      // 1c7: invokeinterface com/finalshell/core/PO3.o (J)Z 3
      // 1cc: ifne 1e4
      // 1cf: aload 0
      // 1d0: invokevirtual com/finalshell/io/Lv2.close ()V
      // 1d3: new java/io/IOException
      // 1d6: dup
      // 1d7: sipush 21165
      // 1da: sipush -470
      // 1dd: invokestatic com/finalshell/io/Lv2.a (II)Ljava/lang/String;
      // 1e0: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 1e3: athrow
      // 1e4: goto 1fd
      // 1e7: astore 5
      // 1e9: aload 5
      // 1eb: athrow
      // 1ec: astore 5
      // 1ee: new java/io/IOException
      // 1f1: dup
      // 1f2: aload 5
      // 1f4: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 1f7: aload 5
      // 1f9: invokespecial java/io/IOException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 1fc: athrow
      // 1fd: return
   }

   @Override
   public void write(int var1) throws IOException {
      this.r[0] = (byte)var1;
      this.write(this.r, 0, 1);
   }

   @Override
   public void flush() throws IOException {
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
      // 05: getfield com/finalshell/io/Lv2.m Z
      // 08: iload 1
      // 09: ifne 2f
      // 0c: ifeq 2b
      // 0f: goto 16
      // 12: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: new java/io/IOException
      // 19: dup
      // 1a: sipush 21164
      // 1d: sipush -2805
      // 20: invokestatic com/finalshell/io/Lv2.a (II)Ljava/lang/String;
      // 23: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 26: athrow
      // 27: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield com/finalshell/io/Lv2.P Z
      // 2f: iload 1
      // 30: ifne 41
      // 33: ifne a5
      // 36: goto 3d
      // 39: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield com/finalshell/io/Lv2.b I
      // 41: aload 0
      // 42: getfield com/finalshell/io/Lv2.F I
      // 45: if_icmple 94
      // 48: iload 1
      // 49: ifne a5
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: aload 0
      // 54: iload 1
      // 55: ifne 87
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: getfield com/finalshell/io/Lv2.l Lcom/finalshell/core/DY3;
      // 62: aconst_null
      // 63: aload 0
      // 64: getfield com/finalshell/io/Lv2.G Lcom/finalshell/core/S_2_2;
      // 67: invokestatic com/finalshell/core/DY3.q (Lcom/finalshell/core/DY3;[ILcom/finalshell/core/S_2_2;)Z
      // 6a: ifne 7f
      // 6d: goto 74
      // 70: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73: athrow
      // 74: iload 1
      // 75: ifeq 94
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: aload 0
      // 80: goto 87
      // 83: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 86: athrow
      // 87: dup
      // 88: getfield com/finalshell/io/Lv2.F I
      // 8b: bipush 1
      // 8c: iadd
      // 8d: putfield com/finalshell/io/Lv2.F I
      // 90: iload 1
      // 91: ifeq 3d
      // 94: goto a5
      // 97: astore 2
      // 98: new java/io/IOException
      // 9b: dup
      // 9c: aload 2
      // 9d: invokevirtual com/finalshell/core/Dn2_2.toString ()Ljava/lang/String;
      // a0: aload 2
      // a1: invokespecial java/io/IOException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // a4: athrow
      // a5: return
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
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 20
      // 09: getfield com/finalshell/io/Lv2.m Z
      // 0c: ifeq 1b
      // 0f: goto 16
      // 12: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: return
      // 17: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 0
      // 1c: invokevirtual com/finalshell/io/Lv2.flush ()V
      // 1f: aload 0
      // 20: iload 1
      // 21: ifeq 42
      // 24: getfield com/finalshell/io/Lv2.g Lcom/finalshell/core/PO3;
      // 27: ifnull 41
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: aload 0
      // 32: getfield com/finalshell/io/Lv2.g Lcom/finalshell/core/PO3;
      // 35: invokeinterface com/finalshell/core/PO3.c ()V 1
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/io/Lv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 0
      // 42: getfield com/finalshell/io/Lv2.l Lcom/finalshell/core/DY3;
      // 45: aload 0
      // 46: getfield com/finalshell/io/Lv2.t [B
      // 49: aload 0
      // 4a: getfield com/finalshell/io/Lv2.G Lcom/finalshell/core/S_2_2;
      // 4d: invokestatic com/finalshell/core/DY3.a (Lcom/finalshell/core/DY3;[BLcom/finalshell/core/S_2_2;)Z
      // 50: pop
      // 51: goto 65
      // 54: astore 2
      // 55: aload 2
      // 56: athrow
      // 57: astore 2
      // 58: new java/io/IOException
      // 5b: dup
      // 5c: aload 2
      // 5d: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 60: aload 2
      // 61: invokespecial java/io/IOException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 64: athrow
      // 65: aload 0
      // 66: bipush 1
      // 67: putfield com/finalshell/io/Lv2.m Z
      // 6a: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 21165) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 237;
               break;
            case 1:
               var10000 = 76;
               break;
            case 2:
               var10000 = 106;
               break;
            case 3:
               var10000 = 187;
               break;
            case 4:
               var10000 = 191;
               break;
            case 5:
               var10000 = 42;
               break;
            case 6:
               var10000 = 217;
               break;
            case 7:
               var10000 = 219;
               break;
            case 8:
               var10000 = 203;
               break;
            case 9:
               var10000 = 196;
               break;
            case 10:
               var10000 = 199;
               break;
            case 11:
               var10000 = 254;
               break;
            case 12:
               var10000 = 221;
               break;
            case 13:
               var10000 = 192;
               break;
            case 14:
               var10000 = 142;
               break;
            case 15:
               var10000 = 244;
               break;
            case 16:
               var10000 = 249;
               break;
            case 17:
               var10000 = 232;
               break;
            case 18:
               var10000 = 150;
               break;
            case 19:
               var10000 = 170;
               break;
            case 20:
               var10000 = 77;
               break;
            case 21:
               var10000 = 102;
               break;
            case 22:
               var10000 = 123;
               break;
            case 23:
               var10000 = 137;
               break;
            case 24:
               var10000 = 45;
               break;
            case 25:
               var10000 = 214;
               break;
            case 26:
               var10000 = 22;
               break;
            case 27:
               var10000 = 245;
               break;
            case 28:
               var10000 = 122;
               break;
            case 29:
               var10000 = 223;
               break;
            case 30:
               var10000 = 101;
               break;
            case 31:
               var10000 = 242;
               break;
            case 32:
               var10000 = 145;
               break;
            case 33:
               var10000 = 37;
               break;
            case 34:
               var10000 = 186;
               break;
            case 35:
               var10000 = 231;
               break;
            case 36:
               var10000 = 164;
               break;
            case 37:
               var10000 = 3;
               break;
            case 38:
               var10000 = 43;
               break;
            case 39:
               var10000 = 132;
               break;
            case 40:
               var10000 = 54;
               break;
            case 41:
               var10000 = 251;
               break;
            case 42:
               var10000 = 109;
               break;
            case 43:
               var10000 = 6;
               break;
            case 44:
               var10000 = 180;
               break;
            case 45:
               var10000 = 179;
               break;
            case 46:
               var10000 = 29;
               break;
            case 47:
               var10000 = 20;
               break;
            case 48:
               var10000 = 241;
               break;
            case 49:
               var10000 = 11;
               break;
            case 50:
               var10000 = 24;
               break;
            case 51:
               var10000 = 243;
               break;
            case 52:
               var10000 = 149;
               break;
            case 53:
               var10000 = 12;
               break;
            case 54:
               var10000 = 23;
               break;
            case 55:
               var10000 = 98;
               break;
            case 56:
               var10000 = 174;
               break;
            case 57:
               var10000 = 172;
               break;
            case 58:
               var10000 = 133;
               break;
            case 59:
               var10000 = 118;
               break;
            case 60:
               var10000 = 31;
               break;
            case 61:
               var10000 = 51;
               break;
            case 62:
               var10000 = 104;
               break;
            case 63:
               var10000 = 213;
               break;
            case 64:
               var10000 = 215;
               break;
            case 65:
               var10000 = 225;
               break;
            case 66:
               var10000 = 27;
               break;
            case 67:
               var10000 = 82;
               break;
            case 68:
               var10000 = 131;
               break;
            case 69:
               var10000 = 236;
               break;
            case 70:
               var10000 = 190;
               break;
            case 71:
               var10000 = 113;
               break;
            case 72:
               var10000 = 162;
               break;
            case 73:
               var10000 = 175;
               break;
            case 74:
               var10000 = 126;
               break;
            case 75:
               var10000 = 25;
               break;
            case 76:
               var10000 = 157;
               break;
            case 77:
               var10000 = 66;
               break;
            case 78:
               var10000 = 247;
               break;
            case 79:
               var10000 = 58;
               break;
            case 80:
               var10000 = 120;
               break;
            case 81:
               var10000 = 167;
               break;
            case 82:
               var10000 = 99;
               break;
            case 83:
               var10000 = 85;
               break;
            case 84:
               var10000 = 41;
               break;
            case 85:
               var10000 = 53;
               break;
            case 86:
               var10000 = 235;
               break;
            case 87:
               var10000 = 4;
               break;
            case 88:
               var10000 = 141;
               break;
            case 89:
               var10000 = 207;
               break;
            case 90:
               var10000 = 151;
               break;
            case 91:
               var10000 = 34;
               break;
            case 92:
               var10000 = 114;
               break;
            case 93:
               var10000 = 71;
               break;
            case 94:
               var10000 = 161;
               break;
            case 95:
               var10000 = 238;
               break;
            case 96:
               var10000 = 73;
               break;
            case 97:
               var10000 = 171;
               break;
            case 98:
               var10000 = 63;
               break;
            case 99:
               var10000 = 152;
               break;
            case 100:
               var10000 = 210;
               break;
            case 101:
               var10000 = 136;
               break;
            case 102:
               var10000 = 13;
               break;
            case 103:
               var10000 = 208;
               break;
            case 104:
               var10000 = 124;
               break;
            case 105:
               var10000 = 211;
               break;
            case 106:
               var10000 = 61;
               break;
            case 107:
               var10000 = 177;
               break;
            case 108:
               var10000 = 91;
               break;
            case 109:
               var10000 = 87;
               break;
            case 110:
               var10000 = 88;
               break;
            case 111:
               var10000 = 107;
               break;
            case 112:
               var10000 = 112;
               break;
            case 113:
               var10000 = 138;
               break;
            case 114:
               var10000 = 84;
               break;
            case 115:
               var10000 = 130;
               break;
            case 116:
               var10000 = 154;
               break;
            case 117:
               var10000 = 194;
               break;
            case 118:
               var10000 = 5;
               break;
            case 119:
               var10000 = 178;
               break;
            case 120:
               var10000 = 64;
               break;
            case 121:
               var10000 = 21;
               break;
            case 122:
               var10000 = 94;
               break;
            case 123:
               var10000 = 52;
               break;
            case 124:
               var10000 = 212;
               break;
            case 125:
               var10000 = 47;
               break;
            case 126:
               var10000 = 16;
               break;
            case 127:
               var10000 = 97;
               break;
            case 128:
               var10000 = 48;
               break;
            case 129:
               var10000 = 182;
               break;
            case 130:
               var10000 = 159;
               break;
            case 131:
               var10000 = 216;
               break;
            case 132:
               var10000 = 30;
               break;
            case 133:
               var10000 = 78;
               break;
            case 134:
               var10000 = 234;
               break;
            case 135:
               var10000 = 166;
               break;
            case 136:
               var10000 = 60;
               break;
            case 137:
               var10000 = 128;
               break;
            case 138:
               var10000 = 67;
               break;
            case 139:
               var10000 = 146;
               break;
            case 140:
               var10000 = 153;
               break;
            case 141:
               var10000 = 116;
               break;
            case 142:
               var10000 = 125;
               break;
            case 143:
               var10000 = 147;
               break;
            case 144:
               var10000 = 184;
               break;
            case 145:
               var10000 = 226;
               break;
            case 146:
               var10000 = 57;
               break;
            case 147:
               var10000 = 83;
               break;
            case 148:
               var10000 = 44;
               break;
            case 149:
               var10000 = 79;
               break;
            case 150:
               var10000 = 206;
               break;
            case 151:
               var10000 = 246;
               break;
            case 152:
               var10000 = 198;
               break;
            case 153:
               var10000 = 92;
               break;
            case 154:
               var10000 = 160;
               break;
            case 155:
               var10000 = 156;
               break;
            case 156:
               var10000 = 240;
               break;
            case 157:
               var10000 = 248;
               break;
            case 158:
               var10000 = 204;
               break;
            case 159:
               var10000 = 75;
               break;
            case 160:
               var10000 = 36;
               break;
            case 161:
               var10000 = 26;
               break;
            case 162:
               var10000 = 9;
               break;
            case 163:
               var10000 = 163;
               break;
            case 164:
               var10000 = 115;
               break;
            case 165:
               var10000 = 220;
               break;
            case 166:
               var10000 = 176;
               break;
            case 167:
               var10000 = 49;
               break;
            case 168:
               var10000 = 224;
               break;
            case 169:
               var10000 = 189;
               break;
            case 170:
               var10000 = 218;
               break;
            case 171:
               var10000 = 197;
               break;
            case 172:
               var10000 = 168;
               break;
            case 173:
               var10000 = 90;
               break;
            case 174:
               var10000 = 86;
               break;
            case 175:
               var10000 = 173;
               break;
            case 176:
               var10000 = 55;
               break;
            case 177:
               var10000 = 121;
               break;
            case 178:
               var10000 = 8;
               break;
            case 179:
               var10000 = 255;
               break;
            case 180:
               var10000 = 155;
               break;
            case 181:
               var10000 = 18;
               break;
            case 182:
               var10000 = 209;
               break;
            case 183:
               var10000 = 7;
               break;
            case 184:
               var10000 = 68;
               break;
            case 185:
               var10000 = 32;
               break;
            case 186:
               var10000 = 50;
               break;
            case 187:
               var10000 = 250;
               break;
            case 188:
               var10000 = 1;
               break;
            case 189:
               var10000 = 205;
               break;
            case 190:
               var10000 = 72;
               break;
            case 191:
               var10000 = 40;
               break;
            case 192:
               var10000 = 169;
               break;
            case 193:
               var10000 = 100;
               break;
            case 194:
               var10000 = 81;
               break;
            case 195:
               var10000 = 233;
               break;
            case 196:
               var10000 = 111;
               break;
            case 197:
               var10000 = 193;
               break;
            case 198:
               var10000 = 148;
               break;
            case 199:
               var10000 = 143;
               break;
            case 200:
               var10000 = 252;
               break;
            case 201:
               var10000 = 28;
               break;
            case 202:
               var10000 = 134;
               break;
            case 203:
               var10000 = 14;
               break;
            case 204:
               var10000 = 181;
               break;
            case 205:
               var10000 = 35;
               break;
            case 206:
               var10000 = 105;
               break;
            case 207:
               var10000 = 110;
               break;
            case 208:
               var10000 = 117;
               break;
            case 209:
               var10000 = 129;
               break;
            case 210:
               var10000 = 183;
               break;
            case 211:
               var10000 = 10;
               break;
            case 212:
               var10000 = 89;
               break;
            case 213:
               var10000 = 65;
               break;
            case 214:
               var10000 = 0;
               break;
            case 215:
               var10000 = 239;
               break;
            case 216:
               var10000 = 139;
               break;
            case 217:
               var10000 = 33;
               break;
            case 218:
               var10000 = 119;
               break;
            case 219:
               var10000 = 2;
               break;
            case 220:
               var10000 = 38;
               break;
            case 221:
               var10000 = 15;
               break;
            case 222:
               var10000 = 62;
               break;
            case 223:
               var10000 = 69;
               break;
            case 224:
               var10000 = 230;
               break;
            case 225:
               var10000 = 96;
               break;
            case 226:
               var10000 = 80;
               break;
            case 227:
               var10000 = 127;
               break;
            case 228:
               var10000 = 74;
               break;
            case 229:
               var10000 = 103;
               break;
            case 230:
               var10000 = 56;
               break;
            case 231:
               var10000 = 144;
               break;
            case 232:
               var10000 = 227;
               break;
            case 233:
               var10000 = 70;
               break;
            case 234:
               var10000 = 140;
               break;
            case 235:
               var10000 = 19;
               break;
            case 236:
               var10000 = 228;
               break;
            case 237:
               var10000 = 185;
               break;
            case 238:
               var10000 = 165;
               break;
            case 239:
               var10000 = 222;
               break;
            case 240:
               var10000 = 93;
               break;
            case 241:
               var10000 = 201;
               break;
            case 242:
               var10000 = 39;
               break;
            case 243:
               var10000 = 158;
               break;
            case 244:
               var10000 = 46;
               break;
            case 245:
               var10000 = 17;
               break;
            case 246:
               var10000 = 202;
               break;
            case 247:
               var10000 = 188;
               break;
            case 248:
               var10000 = 195;
               break;
            case 249:
               var10000 = 135;
               break;
            case 250:
               var10000 = 200;
               break;
            case 251:
               var10000 = 253;
               break;
            case 252:
               var10000 = 108;
               break;
            case 253:
               var10000 = 229;
               break;
            case 254:
               var10000 = 95;
               break;
            default:
               var10000 = 59;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "\u0095\u0089@\u0087ã\bÄ\u0004\u0015\t>ÝÀË'\u0000Åê\u0014Aò\u001e~\u008bXªóê\u00020\u0015@Tô\u008dî\u008e¤ð~²Ó&LäÁ\u000bã\u0099ÃO\u0015";
      int var6 = "\u0095\u0089@\u0087ã\bÄ\u0004\u0015\t>ÝÀË'\u0000Åê\u0014Aò\u001e~\u008bXªóê\u00020\u0015@Tô\u008dî\u008e¤ð~²Ó&LäÁ\u000bã\u0099ÃO\u0015"
         .length();
      char var3 = '\b';
      int var2 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var4.substring(++var2, var2 + var3).toCharArray();
            int var10004 = var10003.length;
            int var8 = 0;
            byte var17 = 50;
            var10002 = var10003;
            int var10 = var10004;
            byte var20;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var20 = 50;
               var10006 = var8;
            } else {
               var17 = 50;
               var10 = var10004;
               if (var10004 <= var8) {
                  break label38;
               }

               var10005 = var10003;
               var20 = 50;
               var10006 = var8;
            }

            while (true) {
               char var32 = var10005[var10006];
               byte var33;
               switch (var8 % 7) {
                  case 0:
                     var33 = 53;
                     break;
                  case 1:
                     var33 = 31;
                     break;
                  case 2:
                     var33 = 65;
                     break;
                  case 3:
                     var33 = 15;
                     break;
                  case 4:
                     var33 = 113;
                     break;
                  case 5:
                     var33 = 14;
                     break;
                  default:
                     var33 = 78;
               }

               var10005[var10006] = (char)(var32 ^ var20 ^ var33);
               var8++;
               if (var17 == 0) {
                  var10006 = var17;
                  var10005 = var10002;
                  var20 = var17;
               } else {
                  if (var10 <= var8) {
                     break;
                  }

                  var10005 = var10002;
                  var20 = var17;
                  var10006 = var8;
               }
            }
         }

         String var19 = new String(var10002).intern();
         byte var12 = -1;
         var7[var5++] = var19;
         if ((var2 += var3) >= var6) {
            a = var7;
            c = new String[3];
            long var0 = 8042305452581365843L;
            long var16 = 4843252195196185683L ^ var0;
            var12 = -1;
            d = var16;
            return;
         }

         var3 = var4.charAt(var2);
      }
   }
}





