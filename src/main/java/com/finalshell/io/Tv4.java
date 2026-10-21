package com.finalshell.io;

import com.finalshell.core.X3_3;
import com.finalshell.core.XA;
import com.finalshell.ui.panel.Ky4;
import java.io.IOException;
import java.io.InputStream;
import jtermios.K;
import jtermios.j;
import jtermios.p;
import jtermios.x_2;

public class Tv4 extends InputStream {
   public int[] p;
   public byte[] P;
   public int X;
   public int e;
   public final K[] u;
   public byte[] R;
   public x_2 S;
   public p s;
   public int B;
   public boolean x;
   public int l;
   public boolean Z;
   public int f;
   public boolean Q;
   public int Y;
   final X3_3 K;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   Tv4(X3_3 var1) {
      Ky4[] var10000 = XA.P();
      this.K = var1;
      Ky4[] var2 = var10000;
      super();
      this.p = new int[]{0};
      this.P = new byte[a(8353, 365282560026429949L)];
      this.X = -1;
      this.e = -1;
      this.u = new K[]{new K(), new K()};
      this.S = j.P();
      this.s = new p();
      this.u[0].W = X3_3.i(this.K);
      this.u[0].n = j.I;
      this.u[1].W = X3_3.Y$int(this.K);
      this.u[1].n = j.I;
      Tv4 var4 = this;
      int var10001 = (X3_3.n$boolean(this.K)) ? 1 : 0;
      if (var2 != null) {
         var10001 = var10001 != 0 ? 2 : 1;
      }

      try {
         var4.B = var10001;
         this.R = new byte[1];
         if (Ky4.F$arrString() != null) {
            XA.E(new Ky4[5]);
         }
      } catch (IllegalArgumentException var3) {
         throw a(var3);
      }
   }

   @Override
   public final int available() throws IOException {
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
      // 05: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 08: invokestatic com/finalshell/core/X3_3.i (Lcom/finalshell/core/X3_3;)I
      // 0b: aload 1
      // 0c: ifnull 37
      // 0f: ifge 1f
      // 12: goto 19
      // 15: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: bipush 0
      // 1a: ireturn
      // 1b: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 23: invokestatic com/finalshell/core/X3_3.W (Lcom/finalshell/core/X3_3;)V
      // 26: aload 0
      // 27: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 2a: invokestatic com/finalshell/core/X3_3.i (Lcom/finalshell/core/X3_3;)I
      // 2d: getstatic jtermios/j.Hj I
      // 30: aload 0
      // 31: getfield com/finalshell/io/Tv4.p [I
      // 34: invokestatic jtermios/j.K (II[I)I
      // 37: aload 1
      // 38: ifnull 67
      // 3b: ifge 61
      // 3e: goto 45
      // 41: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: aload 0
      // 46: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 49: invokevirtual com/finalshell/core/X3_3.W$void ()V
      // 4c: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 4f: invokestatic com/sun/jna/Native.getLastError ()I
      // 52: invokevirtual java/io/PrintStream.println (I)V
      // 55: new java/io/IOException
      // 58: dup
      // 59: invokespecial java/io/IOException.<init> ()V
      // 5c: athrow
      // 5d: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: aload 0
      // 62: getfield com/finalshell/io/Tv4.p [I
      // 65: bipush 0
      // 66: iaload
      // 67: ireturn
   }

   @Override
   public final int read() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: bipush 1
      // 04: newarray 8
      // 06: dup
      // 07: bipush 0
      // 08: bipush 0
      // 09: bastore
      // 0a: astore 2
      // 0b: astore 1
      // 0c: aload 0
      // 0d: aload 2
      // 0e: bipush 0
      // 0f: bipush 1
      // 10: invokevirtual com/finalshell/io/Tv4.read ([BII)I
      // 13: istore 3
      // 14: iload 3
      // 15: aload 1
      // 16: ifnull 37
      // 19: ifle 3a
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: aload 2
      // 24: bipush 0
      // 25: baload
      // 26: sipush 30035
      // 29: ldc2_w 7544839463936793614
      // 2c: invokestatic com/finalshell/io/Tv4.a (IJ)I
      // 2f: iand
      // 30: goto 37
      // 33: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: goto 3b
      // 3a: bipush -1
      // 3b: ireturn
   }

   @Override
   public void close() throws IOException {
      super.close();
   }

   public void B() throws IOException {
      throw new IOException(a(-18052, 9987));
   }

   @Override
   public final int read(byte[] param1, int param2, int param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/XA.P ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 4
      // 005: aload 1
      // 006: ifnonnull 01e
      // 009: new java/lang/IllegalArgumentException
      // 00c: dup
      // 00d: sipush -18054
      // 010: sipush 8481
      // 013: invokestatic com/finalshell/io/Tv4.a (II)Ljava/lang/String;
      // 016: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 019: athrow
      // 01a: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: iload 3
      // 01f: aload 4
      // 021: ifnull 035
      // 024: ifne 034
      // 027: goto 02e
      // 02a: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02d: athrow
      // 02e: bipush 0
      // 02f: ireturn
      // 030: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 033: athrow
      // 034: iload 2
      // 035: aload 4
      // 037: ifnull 045
      // 03a: iflt 06f
      // 03d: goto 044
      // 040: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 043: athrow
      // 044: iload 3
      // 045: aload 4
      // 047: ifnull 05e
      // 04a: iflt 06f
      // 04d: goto 054
      // 050: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 053: athrow
      // 054: iload 2
      // 055: iload 3
      // 056: iadd
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: aload 4
      // 060: ifnull 0bd
      // 063: aload 1
      // 064: arraylength
      // 065: if_icmple 0b6
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06e: athrow
      // 06f: new java/lang/IndexOutOfBoundsException
      // 072: dup
      // 073: new java/lang/StringBuilder
      // 076: dup
      // 077: invokespecial java/lang/StringBuilder.<init> ()V
      // 07a: sipush -18051
      // 07d: sipush -8457
      // 080: invokestatic com/finalshell/io/Tv4.a (II)Ljava/lang/String;
      // 083: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 086: aload 1
      // 087: arraylength
      // 088: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 08b: sipush -18055
      // 08e: sipush 7505
      // 091: invokestatic com/finalshell/io/Tv4.a (II)Ljava/lang/String;
      // 094: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 097: iload 2
      // 098: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 09b: sipush -18056
      // 09e: sipush 17120
      // 0a1: invokestatic com/finalshell/io/Tv4.a (II)Ljava/lang/String;
      // 0a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a7: iload 3
      // 0a8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0ab: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ae: invokespecial java/lang/IndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 0b1: athrow
      // 0b2: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 0ba: invokestatic com/finalshell/core/X3_3.i (Lcom/finalshell/core/X3_3;)I
      // 0bd: aload 4
      // 0bf: ifnull 0de
      // 0c2: ifge 0d7
      // 0c5: goto 0cc
      // 0c8: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: invokespecial com/finalshell/io/Tv4.B ()V
      // 0d0: goto 0d7
      // 0d3: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 0db: getfield com/finalshell/core/X3_3.U Z
      // 0de: aload 4
      // 0e0: ifnull 27e
      // 0e3: ifeq 277
      // 0e6: goto 0ed
      // 0e9: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 0f1: invokestatic com/finalshell/core/X3_3.p (Lcom/finalshell/core/X3_3;)Z
      // 0f4: aload 4
      // 0f6: ifnull 1d0
      // 0f9: goto 100
      // 0fc: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ff: athrow
      // 100: ifeq 1cf
      // 103: goto 10a
      // 106: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 109: athrow
      // 10a: aload 0
      // 10b: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 10e: invokestatic com/finalshell/core/X3_3.n$Object (Lcom/finalshell/core/X3_3;)Ljava/lang/Object;
      // 111: dup
      // 112: astore 5
      // 114: monitorenter
      // 115: aload 0
      // 116: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 119: invokestatic com/finalshell/core/X3_3.s (Lcom/finalshell/core/X3_3;)Z
      // 11c: aload 4
      // 11e: ifnull 132
      // 121: ifeq 135
      // 124: aload 0
      // 125: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 128: invokestatic com/finalshell/core/X3_3.m (Lcom/finalshell/core/X3_3;)I
      // 12b: goto 132
      // 12e: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 131: athrow
      // 132: goto 136
      // 135: bipush 0
      // 136: istore 6
      // 138: aload 0
      // 139: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 13c: invokestatic com/finalshell/core/X3_3.x (Lcom/finalshell/core/X3_3;)Z
      // 13f: aload 4
      // 141: ifnull 15c
      // 144: ifeq 15f
      // 147: goto 14e
      // 14a: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14d: athrow
      // 14e: aload 0
      // 14f: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 152: invokestatic com/finalshell/core/X3_3.I (Lcom/finalshell/core/X3_3;)I
      // 155: goto 15c
      // 158: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15b: athrow
      // 15c: goto 160
      // 15f: bipush 1
      // 160: istore 7
      // 162: aload 0
      // 163: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 166: invokestatic com/finalshell/core/X3_3.P$X (Lcom/finalshell/core/X3_3;)Ljtermios/X;
      // 169: dup
      // 16a: astore 8
      // 16c: monitorenter
      // 16d: aload 0
      // 16e: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 171: invokestatic com/finalshell/core/X3_3.P$X (Lcom/finalshell/core/X3_3;)Ljtermios/X;
      // 174: getfield jtermios/X.L [B
      // 177: getstatic jtermios/j.HQ I
      // 17a: iload 6
      // 17c: i2b
      // 17d: bastore
      // 17e: aload 0
      // 17f: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 182: invokestatic com/finalshell/core/X3_3.P$X (Lcom/finalshell/core/X3_3;)Ljtermios/X;
      // 185: getfield jtermios/X.L [B
      // 188: getstatic jtermios/j.HL I
      // 18b: iload 7
      // 18d: i2b
      // 18e: bastore
      // 18f: aload 0
      // 190: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 193: aload 0
      // 194: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 197: invokestatic com/finalshell/core/X3_3.i (Lcom/finalshell/core/X3_3;)I
      // 19a: getstatic jtermios/j.H4 I
      // 19d: aload 0
      // 19e: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 1a1: invokestatic com/finalshell/core/X3_3.P$X (Lcom/finalshell/core/X3_3;)Ljtermios/X;
      // 1a4: invokestatic jtermios/j.l (IILjtermios/X;)I
      // 1a7: invokestatic com/finalshell/core/X3_3.c (Lcom/finalshell/core/X3_3;I)V
      // 1aa: aload 8
      // 1ac: monitorexit
      // 1ad: goto 1b8
      // 1b0: astore 9
      // 1b2: aload 8
      // 1b4: monitorexit
      // 1b5: aload 9
      // 1b7: athrow
      // 1b8: aload 0
      // 1b9: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 1bc: bipush 0
      // 1bd: invokestatic com/finalshell/core/X3_3.H (Lcom/finalshell/core/X3_3;Z)Z
      // 1c0: pop
      // 1c1: aload 5
      // 1c3: monitorexit
      // 1c4: goto 1cf
      // 1c7: astore 10
      // 1c9: aload 5
      // 1cb: monitorexit
      // 1cc: aload 10
      // 1ce: athrow
      // 1cf: iload 2
      // 1d0: aload 4
      // 1d2: ifnull 269
      // 1d5: ifle 256
      // 1d8: goto 1df
      // 1db: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1de: athrow
      // 1df: iload 3
      // 1e0: aload 0
      // 1e1: getfield com/finalshell/io/Tv4.P [B
      // 1e4: aload 4
      // 1e6: ifnull 223
      // 1e9: goto 1f0
      // 1ec: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ef: athrow
      // 1f0: arraylength
      // 1f1: if_icmpge 211
      // 1f4: goto 1fb
      // 1f7: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fa: athrow
      // 1fb: aload 0
      // 1fc: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 1ff: invokestatic com/finalshell/core/X3_3.i (Lcom/finalshell/core/X3_3;)I
      // 202: aload 0
      // 203: getfield com/finalshell/io/Tv4.P [B
      // 206: iload 3
      // 207: invokestatic jtermios/j.h (I[BI)I
      // 20a: istore 5
      // 20c: aload 4
      // 20e: ifnonnull 22d
      // 211: aload 0
      // 212: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 215: invokestatic com/finalshell/core/X3_3.i (Lcom/finalshell/core/X3_3;)I
      // 218: aload 0
      // 219: getfield com/finalshell/io/Tv4.P [B
      // 21c: goto 223
      // 21f: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 222: athrow
      // 223: aload 0
      // 224: getfield com/finalshell/io/Tv4.P [B
      // 227: arraylength
      // 228: invokestatic jtermios/j.h (I[BI)I
      // 22b: istore 5
      // 22d: iload 5
      // 22f: aload 4
      // 231: ifnull 276
      // 234: ifle 26b
      // 237: goto 23e
      // 23a: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23d: athrow
      // 23e: aload 0
      // 23f: getfield com/finalshell/io/Tv4.P [B
      // 242: bipush 0
      // 243: aload 1
      // 244: iload 2
      // 245: iload 5
      // 247: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 24a: aload 4
      // 24c: ifnonnull 26b
      // 24f: goto 256
      // 252: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 255: athrow
      // 256: aload 0
      // 257: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 25a: invokestatic com/finalshell/core/X3_3.i (Lcom/finalshell/core/X3_3;)I
      // 25d: aload 1
      // 25e: iload 3
      // 25f: invokestatic jtermios/j.h (I[BI)I
      // 262: goto 269
      // 265: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 268: athrow
      // 269: istore 5
      // 26b: aload 0
      // 26c: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 26f: bipush 0
      // 270: invokestatic com/finalshell/core/X3_3.z (Lcom/finalshell/core/X3_3;Z)Z
      // 273: pop
      // 274: iload 5
      // 276: ireturn
      // 277: aload 0
      // 278: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 27b: invokestatic com/finalshell/core/X3_3.p (Lcom/finalshell/core/X3_3;)Z
      // 27e: aload 4
      // 280: ifnull 2f2
      // 283: ifeq 2f1
      // 286: goto 28d
      // 289: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28c: athrow
      // 28d: aload 0
      // 28e: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 291: invokestatic com/finalshell/core/X3_3.n$Object (Lcom/finalshell/core/X3_3;)Ljava/lang/Object;
      // 294: dup
      // 295: astore 5
      // 297: monitorenter
      // 298: aload 0
      // 299: aload 0
      // 29a: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 29d: invokestatic com/finalshell/core/X3_3.s (Lcom/finalshell/core/X3_3;)Z
      // 2a0: putfield com/finalshell/io/Tv4.x Z
      // 2a3: aload 0
      // 2a4: aload 0
      // 2a5: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 2a8: invokestatic com/finalshell/core/X3_3.B (Lcom/finalshell/core/X3_3;)I
      // 2ab: putfield com/finalshell/io/Tv4.l I
      // 2ae: aload 0
      // 2af: aload 0
      // 2b0: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 2b3: invokestatic com/finalshell/core/X3_3.x (Lcom/finalshell/core/X3_3;)Z
      // 2b6: putfield com/finalshell/io/Tv4.Z Z
      // 2b9: aload 0
      // 2ba: aload 0
      // 2bb: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 2be: invokestatic com/finalshell/core/X3_3.I (Lcom/finalshell/core/X3_3;)I
      // 2c1: putfield com/finalshell/io/Tv4.f I
      // 2c4: aload 0
      // 2c5: aload 0
      // 2c6: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 2c9: invokestatic com/finalshell/core/X3_3.Y$boolean (Lcom/finalshell/core/X3_3;)Z
      // 2cc: putfield com/finalshell/io/Tv4.Q Z
      // 2cf: aload 0
      // 2d0: aload 0
      // 2d1: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 2d4: invokestatic com/finalshell/core/X3_3.m (Lcom/finalshell/core/X3_3;)I
      // 2d7: putfield com/finalshell/io/Tv4.Y I
      // 2da: aload 0
      // 2db: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 2de: bipush 0
      // 2df: invokestatic com/finalshell/core/X3_3.H (Lcom/finalshell/core/X3_3;Z)Z
      // 2e2: pop
      // 2e3: aload 5
      // 2e5: monitorexit
      // 2e6: goto 2f1
      // 2e9: astore 11
      // 2eb: aload 5
      // 2ed: monitorexit
      // 2ee: aload 11
      // 2f0: athrow
      // 2f1: iload 3
      // 2f2: istore 5
      // 2f4: bipush 0
      // 2f5: istore 6
      // 2f7: aload 0
      // 2f8: getfield com/finalshell/io/Tv4.Q Z
      // 2fb: ifeq 318
      // 2fe: bipush 0
      // 2ff: istore 7
      // 301: bipush 0
      // 302: istore 8
      // 304: bipush 0
      // 305: istore 9
      // 307: aload 4
      // 309: ifnull 33d
      // 30c: aload 4
      // 30e: ifnonnull 3b4
      // 311: goto 318
      // 314: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 317: athrow
      // 318: aload 0
      // 319: getfield com/finalshell/io/Tv4.Z Z
      // 31c: aload 4
      // 31e: ifnull 33e
      // 321: goto 328
      // 324: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 327: athrow
      // 328: ifeq 33d
      // 32b: goto 332
      // 32e: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 331: athrow
      // 332: aload 0
      // 333: getfield com/finalshell/io/Tv4.f I
      // 336: istore 7
      // 338: aload 4
      // 33a: ifnonnull 340
      // 33d: bipush 1
      // 33e: istore 7
      // 340: iload 7
      // 342: iload 5
      // 344: aload 4
      // 346: ifnull 36e
      // 349: if_icmple 357
      // 34c: goto 353
      // 34f: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 352: athrow
      // 353: iload 5
      // 355: istore 7
      // 357: iload 7
      // 359: aload 4
      // 35b: ifnull 38a
      // 35e: sipush 3079
      // 361: ldc2_w 2638208008763925848
      // 364: invokestatic com/finalshell/io/Tv4.a (IJ)I
      // 367: goto 36e
      // 36a: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36d: athrow
      // 36e: if_icmpgt 37a
      // 371: iload 7
      // 373: istore 8
      // 375: aload 4
      // 377: ifnonnull 38c
      // 37a: sipush 30035
      // 37d: ldc2_w 7544839463936793614
      // 380: invokestatic com/finalshell/io/Tv4.a (IJ)I
      // 383: goto 38a
      // 386: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 389: athrow
      // 38a: istore 8
      // 38c: aload 0
      // 38d: getfield com/finalshell/io/Tv4.x Z
      // 390: aload 4
      // 392: ifnull 3b2
      // 395: ifeq 3aa
      // 398: goto 39f
      // 39b: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39e: athrow
      // 39f: aload 0
      // 3a0: getfield com/finalshell/io/Tv4.Y I
      // 3a3: istore 9
      // 3a5: aload 4
      // 3a7: ifnonnull 3b4
      // 3aa: bipush 0
      // 3ab: goto 3b2
      // 3ae: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b1: athrow
      // 3b2: istore 9
      // 3b4: iload 8
      // 3b6: aload 0
      // 3b7: getfield com/finalshell/io/Tv4.e I
      // 3ba: aload 4
      // 3bc: ifnull 3e2
      // 3bf: if_icmpne 3e5
      // 3c2: goto 3c9
      // 3c5: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c8: athrow
      // 3c9: iload 9
      // 3cb: aload 4
      // 3cd: ifnull 44c
      // 3d0: goto 3d7
      // 3d3: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d6: athrow
      // 3d7: aload 0
      // 3d8: getfield com/finalshell/io/Tv4.X I
      // 3db: goto 3e2
      // 3de: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e1: athrow
      // 3e2: if_icmpeq 44b
      // 3e5: aload 0
      // 3e6: iload 8
      // 3e8: putfield com/finalshell/io/Tv4.e I
      // 3eb: aload 0
      // 3ec: iload 9
      // 3ee: putfield com/finalshell/io/Tv4.X I
      // 3f1: aload 0
      // 3f2: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 3f5: invokestatic com/finalshell/core/X3_3.P$X (Lcom/finalshell/core/X3_3;)Ljtermios/X;
      // 3f8: dup
      // 3f9: astore 10
      // 3fb: monitorenter
      // 3fc: aload 0
      // 3fd: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 400: invokestatic com/finalshell/core/X3_3.P$X (Lcom/finalshell/core/X3_3;)Ljtermios/X;
      // 403: getfield jtermios/X.L [B
      // 406: getstatic jtermios/j.HQ I
      // 409: aload 0
      // 40a: getfield com/finalshell/io/Tv4.X I
      // 40d: i2b
      // 40e: bastore
      // 40f: aload 0
      // 410: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 413: invokestatic com/finalshell/core/X3_3.P$X (Lcom/finalshell/core/X3_3;)Ljtermios/X;
      // 416: getfield jtermios/X.L [B
      // 419: getstatic jtermios/j.HL I
      // 41c: aload 0
      // 41d: getfield com/finalshell/io/Tv4.e I
      // 420: i2b
      // 421: bastore
      // 422: aload 0
      // 423: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 426: aload 0
      // 427: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 42a: invokestatic com/finalshell/core/X3_3.i (Lcom/finalshell/core/X3_3;)I
      // 42d: getstatic jtermios/j.H4 I
      // 430: aload 0
      // 431: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 434: invokestatic com/finalshell/core/X3_3.P$X (Lcom/finalshell/core/X3_3;)Ljtermios/X;
      // 437: invokestatic jtermios/j.l (IILjtermios/X;)I
      // 43a: invokestatic com/finalshell/core/X3_3.c (Lcom/finalshell/core/X3_3;I)V
      // 43d: aload 10
      // 43f: monitorexit
      // 440: goto 44b
      // 443: astore 12
      // 445: aload 10
      // 447: monitorexit
      // 448: aload 12
      // 44a: athrow
      // 44b: bipush 0
      // 44c: istore 10
      // 44e: bipush 0
      // 44f: istore 11
      // 451: aload 0
      // 452: getfield com/finalshell/io/Tv4.Q Z
      // 455: aload 4
      // 457: ifnull 714
      // 45a: ifne 712
      // 45d: goto 464
      // 460: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 463: athrow
      // 464: aload 0
      // 465: getfield com/finalshell/io/Tv4.x Z
      // 468: aload 4
      // 46a: ifnull 489
      // 46d: goto 474
      // 470: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 473: athrow
      // 474: ifeq 48c
      // 477: goto 47e
      // 47a: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47d: athrow
      // 47e: aload 0
      // 47f: getfield com/finalshell/io/Tv4.l I
      // 482: goto 489
      // 485: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 488: athrow
      // 489: goto 495
      // 48c: sipush 11369
      // 48f: ldc2_w 8469893135880471856
      // 492: invokestatic com/finalshell/io/Tv4.a (IJ)I
      // 495: istore 13
      // 497: aload 0
      // 498: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 49b: getfield com/finalshell/core/X3_3.e Z
      // 49e: aload 4
      // 4a0: ifnull 597
      // 4a3: ifeq 574
      // 4a6: goto 4ad
      // 4a9: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ac: athrow
      // 4ad: aload 0
      // 4ae: getfield com/finalshell/io/Tv4.u [Ljtermios/K;
      // 4b1: aload 0
      // 4b2: getfield com/finalshell/io/Tv4.B I
      // 4b5: iload 13
      // 4b7: invokestatic jtermios/j.N ([Ljtermios/K;II)I
      // 4ba: istore 12
      // 4bc: iload 12
      // 4be: aload 4
      // 4c0: ifnull 4db
      // 4c3: iflt 4ea
      // 4c6: goto 4cd
      // 4c9: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4cc: athrow
      // 4cd: aload 0
      // 4ce: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 4d1: invokestatic com/finalshell/core/X3_3.i (Lcom/finalshell/core/X3_3;)I
      // 4d4: goto 4db
      // 4d7: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4da: athrow
      // 4db: aload 4
      // 4dd: ifnull 502
      // 4e0: ifge 4f5
      // 4e3: goto 4ea
      // 4e6: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e9: athrow
      // 4ea: aload 0
      // 4eb: invokespecial com/finalshell/io/Tv4.B ()V
      // 4ee: goto 4f5
      // 4f1: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f4: athrow
      // 4f5: aload 0
      // 4f6: getfield com/finalshell/io/Tv4.u [Ljtermios/K;
      // 4f9: bipush 1
      // 4fa: aaload
      // 4fb: getfield jtermios/K.m S
      // 4fe: getstatic jtermios/j.I S
      // 501: iand
      // 502: aload 4
      // 504: ifnull 531
      // 507: ifeq 528
      // 50a: goto 511
      // 50d: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 510: athrow
      // 511: aload 0
      // 512: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 515: invokestatic com/finalshell/core/X3_3.Y$int (Lcom/finalshell/core/X3_3;)I
      // 518: aload 0
      // 519: getfield com/finalshell/io/Tv4.R [B
      // 51c: bipush 1
      // 51d: invokestatic jtermios/j.h (I[BI)I
      // 520: pop
      // 521: goto 528
      // 524: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 527: athrow
      // 528: aload 0
      // 529: getfield com/finalshell/io/Tv4.u [Ljtermios/K;
      // 52c: bipush 0
      // 52d: aaload
      // 52e: getfield jtermios/K.m S
      // 531: istore 14
      // 533: iload 14
      // 535: getstatic jtermios/j.Q S
      // 538: iand
      // 539: aload 4
      // 53b: ifnull 559
      // 53e: ifeq 553
      // 541: goto 548
      // 544: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 547: athrow
      // 548: aload 0
      // 549: invokespecial com/finalshell/io/Tv4.B ()V
      // 54c: goto 553
      // 54f: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 552: athrow
      // 553: iload 14
      // 555: getstatic jtermios/j.I S
      // 558: iand
      // 559: aload 4
      // 55b: ifnull 569
      // 55e: ifeq 56c
      // 561: goto 568
      // 564: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 567: athrow
      // 568: bipush 1
      // 569: goto 56d
      // 56c: bipush 0
      // 56d: istore 10
      // 56f: aload 4
      // 571: ifnonnull 6e1
      // 574: aload 0
      // 575: getfield com/finalshell/io/Tv4.S Ljtermios/x_2;
      // 578: invokestatic jtermios/j.B (Ljtermios/x_2;)V
      // 57b: aload 0
      // 57c: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 57f: invokestatic com/finalshell/core/X3_3.i (Lcom/finalshell/core/X3_3;)I
      // 582: aload 0
      // 583: getfield com/finalshell/io/Tv4.S Ljtermios/x_2;
      // 586: invokestatic jtermios/j.U (ILjtermios/x_2;)V
      // 589: aload 0
      // 58a: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 58d: invokestatic com/finalshell/core/X3_3.i (Lcom/finalshell/core/X3_3;)I
      // 590: goto 597
      // 593: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 596: athrow
      // 597: istore 14
      // 599: aload 0
      // 59a: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 59d: invokestatic com/finalshell/core/X3_3.n$boolean (Lcom/finalshell/core/X3_3;)Z
      // 5a0: aload 4
      // 5a2: ifnull 5e7
      // 5a5: ifeq 5e5
      // 5a8: goto 5af
      // 5ab: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ae: athrow
      // 5af: aload 0
      // 5b0: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 5b3: invokestatic com/finalshell/core/X3_3.Y$int (Lcom/finalshell/core/X3_3;)I
      // 5b6: aload 0
      // 5b7: getfield com/finalshell/io/Tv4.S Ljtermios/x_2;
      // 5ba: invokestatic jtermios/j.U (ILjtermios/x_2;)V
      // 5bd: aload 0
      // 5be: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 5c1: invokestatic com/finalshell/core/X3_3.Y$int (Lcom/finalshell/core/X3_3;)I
      // 5c4: iload 14
      // 5c6: aload 4
      // 5c8: ifnull 5f0
      // 5cb: goto 5d2
      // 5ce: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d1: athrow
      // 5d2: if_icmple 5e5
      // 5d5: goto 5dc
      // 5d8: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5db: athrow
      // 5dc: aload 0
      // 5dd: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 5e0: invokestatic com/finalshell/core/X3_3.Y$int (Lcom/finalshell/core/X3_3;)I
      // 5e3: istore 14
      // 5e5: iload 13
      // 5e7: sipush 17986
      // 5ea: ldc2_w 492641883779444508
      // 5ed: invokestatic com/finalshell/io/Tv4.a (IJ)I
      // 5f0: aload 4
      // 5f2: ifnull 611
      // 5f5: if_icmplt 644
      // 5f8: goto 5ff
      // 5fb: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5fe: athrow
      // 5ff: iload 13
      // 601: sipush 20529
      // 604: ldc2_w 6070084195669457257
      // 607: invokestatic com/finalshell/io/Tv4.a (IJ)I
      // 60a: goto 611
      // 60d: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 610: athrow
      // 611: idiv
      // 612: istore 15
      // 614: aload 0
      // 615: getfield com/finalshell/io/Tv4.s Ljtermios/p;
      // 618: iload 15
      // 61a: i2l
      // 61b: putfield jtermios/p.f J
      // 61e: aload 0
      // 61f: getfield com/finalshell/io/Tv4.s Ljtermios/p;
      // 622: iload 13
      // 624: iload 15
      // 626: sipush 20529
      // 629: ldc2_w 6070084195669457257
      // 62c: invokestatic com/finalshell/io/Tv4.a (IJ)I
      // 62f: imul
      // 630: isub
      // 631: sipush 20529
      // 634: ldc2_w 6070084195669457257
      // 637: invokestatic com/finalshell/io/Tv4.a (IJ)I
      // 63a: imul
      // 63b: i2l
      // 63c: putfield jtermios/p.i J
      // 63f: aload 4
      // 641: ifnonnull 667
      // 644: aload 0
      // 645: getfield com/finalshell/io/Tv4.s Ljtermios/p;
      // 648: lconst_0
      // 649: putfield jtermios/p.f J
      // 64c: aload 0
      // 64d: getfield com/finalshell/io/Tv4.s Ljtermios/p;
      // 650: iload 13
      // 652: sipush 20529
      // 655: ldc2_w 6070084195669457257
      // 658: invokestatic com/finalshell/io/Tv4.a (IJ)I
      // 65b: imul
      // 65c: i2l
      // 65d: putfield jtermios/p.i J
      // 660: goto 667
      // 663: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 666: athrow
      // 667: iload 14
      // 669: bipush 1
      // 66a: iadd
      // 66b: aload 0
      // 66c: getfield com/finalshell/io/Tv4.S Ljtermios/x_2;
      // 66f: aconst_null
      // 670: aconst_null
      // 671: aload 0
      // 672: getfield com/finalshell/io/Tv4.s Ljtermios/p;
      // 675: invokestatic jtermios/j.N (ILjtermios/x_2;Ljtermios/x_2;Ljtermios/x_2;Ljtermios/p;)I
      // 678: istore 12
      // 67a: aload 0
      // 67b: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 67e: invokestatic com/finalshell/core/X3_3.i (Lcom/finalshell/core/X3_3;)I
      // 681: aload 4
      // 683: ifnull 69d
      // 686: ifge 69b
      // 689: goto 690
      // 68c: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68f: athrow
      // 690: aload 0
      // 691: invokespecial com/finalshell/io/Tv4.B ()V
      // 694: goto 69b
      // 697: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69a: athrow
      // 69b: iload 12
      // 69d: aload 4
      // 69f: ifnull 6df
      // 6a2: ifge 6d1
      // 6a5: goto 6ac
      // 6a8: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6ab: athrow
      // 6ac: new java/io/IOException
      // 6af: dup
      // 6b0: sipush -18050
      // 6b3: sipush 15739
      // 6b6: invokestatic com/finalshell/io/Tv4.a (II)Ljava/lang/String;
      // 6b9: bipush 1
      // 6ba: anewarray 293
      // 6bd: dup
      // 6be: bipush 0
      // 6bf: invokestatic jtermios/j.z ()I
      // 6c2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6c5: aastore
      // 6c6: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 6c9: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 6cc: athrow
      // 6cd: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d0: athrow
      // 6d1: aload 0
      // 6d2: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 6d5: invokestatic com/finalshell/core/X3_3.i (Lcom/finalshell/core/X3_3;)I
      // 6d8: aload 0
      // 6d9: getfield com/finalshell/io/Tv4.S Ljtermios/x_2;
      // 6dc: invokestatic jtermios/j.w (ILjtermios/x_2;)Z
      // 6df: istore 10
      // 6e1: iload 12
      // 6e3: aload 4
      // 6e5: ifnull 714
      // 6e8: ifne 712
      // 6eb: goto 6f2
      // 6ee: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f1: athrow
      // 6f2: aload 0
      // 6f3: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 6f6: invokestatic com/finalshell/core/X3_3.s (Lcom/finalshell/core/X3_3;)Z
      // 6f9: aload 4
      // 6fb: ifnull 714
      // 6fe: goto 705
      // 701: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 704: athrow
      // 705: ifeq 712
      // 708: goto 70f
      // 70b: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 70e: athrow
      // 70f: bipush 1
      // 710: istore 11
      // 712: iload 11
      // 714: aload 4
      // 716: ifnull 737
      // 719: ifeq 72f
      // 71c: goto 723
      // 71f: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 722: athrow
      // 723: aload 4
      // 725: ifnonnull 8a8
      // 728: goto 72f
      // 72b: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72e: athrow
      // 72f: bipush 0
      // 730: goto 737
      // 733: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 736: athrow
      // 737: istore 12
      // 739: iload 10
      // 73b: aload 4
      // 73d: ifnull 765
      // 740: ifne 764
      // 743: goto 74a
      // 746: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 749: athrow
      // 74a: aload 0
      // 74b: getfield com/finalshell/io/Tv4.Q Z
      // 74e: aload 4
      // 750: ifnull 819
      // 753: goto 75a
      // 756: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 759: athrow
      // 75a: ifeq 817
      // 75d: goto 764
      // 760: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 763: athrow
      // 764: iload 2
      // 765: aload 4
      // 767: ifnull 801
      // 76a: ifle 7ed
      // 76d: goto 774
      // 770: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 773: athrow
      // 774: iload 5
      // 776: aload 0
      // 777: getfield com/finalshell/io/Tv4.P [B
      // 77a: aload 4
      // 77c: ifnull 7ba
      // 77f: goto 786
      // 782: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 785: athrow
      // 786: arraylength
      // 787: if_icmpge 7a8
      // 78a: goto 791
      // 78d: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 790: athrow
      // 791: aload 0
      // 792: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 795: invokestatic com/finalshell/core/X3_3.i (Lcom/finalshell/core/X3_3;)I
      // 798: aload 0
      // 799: getfield com/finalshell/io/Tv4.P [B
      // 79c: iload 5
      // 79e: invokestatic jtermios/j.h (I[BI)I
      // 7a1: istore 12
      // 7a3: aload 4
      // 7a5: ifnonnull 7c4
      // 7a8: aload 0
      // 7a9: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 7ac: invokestatic com/finalshell/core/X3_3.i (Lcom/finalshell/core/X3_3;)I
      // 7af: aload 0
      // 7b0: getfield com/finalshell/io/Tv4.P [B
      // 7b3: goto 7ba
      // 7b6: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b9: athrow
      // 7ba: aload 0
      // 7bb: getfield com/finalshell/io/Tv4.P [B
      // 7be: arraylength
      // 7bf: invokestatic jtermios/j.h (I[BI)I
      // 7c2: istore 12
      // 7c4: iload 12
      // 7c6: aload 4
      // 7c8: ifnull 805
      // 7cb: ifle 803
      // 7ce: goto 7d5
      // 7d1: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d4: athrow
      // 7d5: aload 0
      // 7d6: getfield com/finalshell/io/Tv4.P [B
      // 7d9: bipush 0
      // 7da: aload 1
      // 7db: iload 2
      // 7dc: iload 12
      // 7de: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 7e1: aload 4
      // 7e3: ifnonnull 803
      // 7e6: goto 7ed
      // 7e9: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7ec: athrow
      // 7ed: aload 0
      // 7ee: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 7f1: invokestatic com/finalshell/core/X3_3.i (Lcom/finalshell/core/X3_3;)I
      // 7f4: aload 1
      // 7f5: iload 5
      // 7f7: invokestatic jtermios/j.h (I[BI)I
      // 7fa: goto 801
      // 7fd: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 800: athrow
      // 801: istore 12
      // 803: iload 12
      // 805: aload 4
      // 807: ifnull 819
      // 80a: ifne 817
      // 80d: goto 814
      // 810: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 813: athrow
      // 814: bipush 1
      // 815: istore 11
      // 817: iload 12
      // 819: aload 4
      // 81b: ifnull 856
      // 81e: ifge 84d
      // 821: goto 828
      // 824: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 827: athrow
      // 828: new java/io/IOException
      // 82b: dup
      // 82c: sipush -18053
      // 82f: sipush -29938
      // 832: invokestatic com/finalshell/io/Tv4.a (II)Ljava/lang/String;
      // 835: bipush 1
      // 836: anewarray 293
      // 839: dup
      // 83a: bipush 0
      // 83b: invokestatic jtermios/j.z ()I
      // 83e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 841: aastore
      // 842: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 845: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 848: athrow
      // 849: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 84c: athrow
      // 84d: iload 6
      // 84f: iload 12
      // 851: iadd
      // 852: istore 6
      // 854: iload 6
      // 856: aload 4
      // 858: ifnull 87c
      // 85b: iload 7
      // 85d: if_icmplt 873
      // 860: goto 867
      // 863: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 866: athrow
      // 867: aload 4
      // 869: ifnonnull 8a8
      // 86c: goto 873
      // 86f: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 872: athrow
      // 873: iload 11
      // 875: goto 87c
      // 878: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 87b: athrow
      // 87c: aload 4
      // 87e: ifnull 8a1
      // 881: ifeq 897
      // 884: goto 88b
      // 887: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 88a: athrow
      // 88b: aload 4
      // 88d: ifnonnull 8a8
      // 890: goto 897
      // 893: invokestatic com/finalshell/io/Tv4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 896: athrow
      // 897: iload 2
      // 898: iload 12
      // 89a: iadd
      // 89b: istore 2
      // 89c: iload 5
      // 89e: iload 12
      // 8a0: isub
      // 8a1: istore 5
      // 8a3: aload 4
      // 8a5: ifnonnull 2f7
      // 8a8: aload 0
      // 8a9: getfield com/finalshell/io/Tv4.K Lcom/finalshell/core/X3_3;
      // 8ac: bipush 0
      // 8ad: invokestatic com/finalshell/core/X3_3.z (Lcom/finalshell/core/X3_3;Z)Z
      // 8b0: pop
      // 8b1: iload 6
      // 8b3: ireturn
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -18056) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 82;
               break;
            case 1:
               var10000 = 148;
               break;
            case 2:
               var10000 = 127;
               break;
            case 3:
               var10000 = 253;
               break;
            case 4:
               var10000 = 126;
               break;
            case 5:
               var10000 = 175;
               break;
            case 6:
               var10000 = 168;
               break;
            case 7:
               var10000 = 195;
               break;
            case 8:
               var10000 = 109;
               break;
            case 9:
               var10000 = 98;
               break;
            case 10:
               var10000 = 87;
               break;
            case 11:
               var10000 = 29;
               break;
            case 12:
               var10000 = 194;
               break;
            case 13:
               var10000 = 120;
               break;
            case 14:
               var10000 = 192;
               break;
            case 15:
               var10000 = 137;
               break;
            case 16:
               var10000 = 104;
               break;
            case 17:
               var10000 = 151;
               break;
            case 18:
               var10000 = 31;
               break;
            case 19:
               var10000 = 199;
               break;
            case 20:
               var10000 = 160;
               break;
            case 21:
               var10000 = 150;
               break;
            case 22:
               var10000 = 92;
               break;
            case 23:
               var10000 = 73;
               break;
            case 24:
               var10000 = 20;
               break;
            case 25:
               var10000 = 224;
               break;
            case 26:
               var10000 = 67;
               break;
            case 27:
               var10000 = 165;
               break;
            case 28:
               var10000 = 5;
               break;
            case 29:
               var10000 = 95;
               break;
            case 30:
               var10000 = 101;
               break;
            case 31:
               var10000 = 209;
               break;
            case 32:
               var10000 = 196;
               break;
            case 33:
               var10000 = 26;
               break;
            case 34:
               var10000 = 116;
               break;
            case 35:
               var10000 = 17;
               break;
            case 36:
               var10000 = 177;
               break;
            case 37:
               var10000 = 188;
               break;
            case 38:
               var10000 = 178;
               break;
            case 39:
               var10000 = 185;
               break;
            case 40:
               var10000 = 96;
               break;
            case 41:
               var10000 = 122;
               break;
            case 42:
               var10000 = 180;
               break;
            case 43:
               var10000 = 139;
               break;
            case 44:
               var10000 = 129;
               break;
            case 45:
               var10000 = 164;
               break;
            case 46:
               var10000 = 15;
               break;
            case 47:
               var10000 = 169;
               break;
            case 48:
               var10000 = 58;
               break;
            case 49:
               var10000 = 80;
               break;
            case 50:
               var10000 = 11;
               break;
            case 51:
               var10000 = 130;
               break;
            case 52:
               var10000 = 158;
               break;
            case 53:
               var10000 = 99;
               break;
            case 54:
               var10000 = 243;
               break;
            case 55:
               var10000 = 105;
               break;
            case 56:
               var10000 = 136;
               break;
            case 57:
               var10000 = 65;
               break;
            case 58:
               var10000 = 47;
               break;
            case 59:
               var10000 = 106;
               break;
            case 60:
               var10000 = 14;
               break;
            case 61:
               var10000 = 249;
               break;
            case 62:
               var10000 = 241;
               break;
            case 63:
               var10000 = 179;
               break;
            case 64:
               var10000 = 111;
               break;
            case 65:
               var10000 = 254;
               break;
            case 66:
               var10000 = 216;
               break;
            case 67:
               var10000 = 176;
               break;
            case 68:
               var10000 = 220;
               break;
            case 69:
               var10000 = 174;
               break;
            case 70:
               var10000 = 248;
               break;
            case 71:
               var10000 = 240;
               break;
            case 72:
               var10000 = 52;
               break;
            case 73:
               var10000 = 22;
               break;
            case 74:
               var10000 = 237;
               break;
            case 75:
               var10000 = 75;
               break;
            case 76:
               var10000 = 233;
               break;
            case 77:
               var10000 = 218;
               break;
            case 78:
               var10000 = 214;
               break;
            case 79:
               var10000 = 32;
               break;
            case 80:
               var10000 = 133;
               break;
            case 81:
               var10000 = 45;
               break;
            case 82:
               var10000 = 1;
               break;
            case 83:
               var10000 = 3;
               break;
            case 84:
               var10000 = 42;
               break;
            case 85:
               var10000 = 187;
               break;
            case 86:
               var10000 = 57;
               break;
            case 87:
               var10000 = 153;
               break;
            case 88:
               var10000 = 10;
               break;
            case 89:
               var10000 = 44;
               break;
            case 90:
               var10000 = 144;
               break;
            case 91:
               var10000 = 183;
               break;
            case 92:
               var10000 = 131;
               break;
            case 93:
               var10000 = 152;
               break;
            case 94:
               var10000 = 39;
               break;
            case 95:
               var10000 = 56;
               break;
            case 96:
               var10000 = 112;
               break;
            case 97:
               var10000 = 205;
               break;
            case 98:
               var10000 = 60;
               break;
            case 99:
               var10000 = 9;
               break;
            case 100:
               var10000 = 231;
               break;
            case 101:
               var10000 = 68;
               break;
            case 102:
               var10000 = 159;
               break;
            case 103:
               var10000 = 30;
               break;
            case 104:
               var10000 = 242;
               break;
            case 105:
               var10000 = 114;
               break;
            case 106:
               var10000 = 83;
               break;
            case 107:
               var10000 = 18;
               break;
            case 108:
               var10000 = 4;
               break;
            case 109:
               var10000 = 115;
               break;
            case 110:
               var10000 = 72;
               break;
            case 111:
               var10000 = 229;
               break;
            case 112:
               var10000 = 118;
               break;
            case 113:
               var10000 = 13;
               break;
            case 114:
               var10000 = 43;
               break;
            case 115:
               var10000 = 54;
               break;
            case 116:
               var10000 = 7;
               break;
            case 117:
               var10000 = 245;
               break;
            case 118:
               var10000 = 63;
               break;
            case 119:
               var10000 = 138;
               break;
            case 120:
               var10000 = 147;
               break;
            case 121:
               var10000 = 201;
               break;
            case 122:
               var10000 = 217;
               break;
            case 123:
               var10000 = 219;
               break;
            case 124:
               var10000 = 128;
               break;
            case 125:
               var10000 = 6;
               break;
            case 126:
               var10000 = 88;
               break;
            case 127:
               var10000 = 250;
               break;
            case 128:
               var10000 = 61;
               break;
            case 129:
               var10000 = 102;
               break;
            case 130:
               var10000 = 228;
               break;
            case 131:
               var10000 = 69;
               break;
            case 132:
               var10000 = 8;
               break;
            case 133:
               var10000 = 74;
               break;
            case 134:
               var10000 = 21;
               break;
            case 135:
               var10000 = 124;
               break;
            case 136:
               var10000 = 212;
               break;
            case 137:
               var10000 = 223;
               break;
            case 138:
               var10000 = 190;
               break;
            case 139:
               var10000 = 206;
               break;
            case 140:
               var10000 = 16;
               break;
            case 141:
               var10000 = 255;
               break;
            case 142:
               var10000 = 49;
               break;
            case 143:
               var10000 = 208;
               break;
            case 144:
               var10000 = 234;
               break;
            case 145:
               var10000 = 167;
               break;
            case 146:
               var10000 = 173;
               break;
            case 147:
               var10000 = 86;
               break;
            case 148:
               var10000 = 81;
               break;
            case 149:
               var10000 = 235;
               break;
            case 150:
               var10000 = 163;
               break;
            case 151:
               var10000 = 154;
               break;
            case 152:
               var10000 = 119;
               break;
            case 153:
               var10000 = 36;
               break;
            case 154:
               var10000 = 64;
               break;
            case 155:
               var10000 = 76;
               break;
            case 156:
               var10000 = 166;
               break;
            case 157:
               var10000 = 213;
               break;
            case 158:
               var10000 = 211;
               break;
            case 159:
               var10000 = 51;
               break;
            case 160:
               var10000 = 41;
               break;
            case 161:
               var10000 = 252;
               break;
            case 162:
               var10000 = 55;
               break;
            case 163:
               var10000 = 145;
               break;
            case 164:
               var10000 = 182;
               break;
            case 165:
               var10000 = 155;
               break;
            case 166:
               var10000 = 135;
               break;
            case 167:
               var10000 = 171;
               break;
            case 168:
               var10000 = 84;
               break;
            case 169:
               var10000 = 103;
               break;
            case 170:
               var10000 = 93;
               break;
            case 171:
               var10000 = 0;
               break;
            case 172:
               var10000 = 107;
               break;
            case 173:
               var10000 = 89;
               break;
            case 174:
               var10000 = 193;
               break;
            case 175:
               var10000 = 71;
               break;
            case 176:
               var10000 = 200;
               break;
            case 177:
               var10000 = 79;
               break;
            case 178:
               var10000 = 251;
               break;
            case 179:
               var10000 = 12;
               break;
            case 180:
               var10000 = 239;
               break;
            case 181:
               var10000 = 24;
               break;
            case 182:
               var10000 = 46;
               break;
            case 183:
               var10000 = 62;
               break;
            case 184:
               var10000 = 2;
               break;
            case 185:
               var10000 = 181;
               break;
            case 186:
               var10000 = 146;
               break;
            case 187:
               var10000 = 142;
               break;
            case 188:
               var10000 = 110;
               break;
            case 189:
               var10000 = 232;
               break;
            case 190:
               var10000 = 91;
               break;
            case 191:
               var10000 = 191;
               break;
            case 192:
               var10000 = 113;
               break;
            case 193:
               var10000 = 59;
               break;
            case 194:
               var10000 = 37;
               break;
            case 195:
               var10000 = 157;
               break;
            case 196:
               var10000 = 246;
               break;
            case 197:
               var10000 = 94;
               break;
            case 198:
               var10000 = 90;
               break;
            case 199:
               var10000 = 236;
               break;
            case 200:
               var10000 = 238;
               break;
            case 201:
               var10000 = 140;
               break;
            case 202:
               var10000 = 198;
               break;
            case 203:
               var10000 = 156;
               break;
            case 204:
               var10000 = 161;
               break;
            case 205:
               var10000 = 70;
               break;
            case 206:
               var10000 = 132;
               break;
            case 207:
               var10000 = 244;
               break;
            case 208:
               var10000 = 33;
               break;
            case 209:
               var10000 = 48;
               break;
            case 210:
               var10000 = 204;
               break;
            case 211:
               var10000 = 23;
               break;
            case 212:
               var10000 = 210;
               break;
            case 213:
               var10000 = 117;
               break;
            case 214:
               var10000 = 143;
               break;
            case 215:
               var10000 = 215;
               break;
            case 216:
               var10000 = 149;
               break;
            case 217:
               var10000 = 35;
               break;
            case 218:
               var10000 = 189;
               break;
            case 219:
               var10000 = 184;
               break;
            case 220:
               var10000 = 66;
               break;
            case 221:
               var10000 = 186;
               break;
            case 222:
               var10000 = 78;
               break;
            case 223:
               var10000 = 53;
               break;
            case 224:
               var10000 = 34;
               break;
            case 225:
               var10000 = 27;
               break;
            case 226:
               var10000 = 221;
               break;
            case 227:
               var10000 = 50;
               break;
            case 228:
               var10000 = 226;
               break;
            case 229:
               var10000 = 170;
               break;
            case 230:
               var10000 = 247;
               break;
            case 231:
               var10000 = 222;
               break;
            case 232:
               var10000 = 97;
               break;
            case 233:
               var10000 = 28;
               break;
            case 234:
               var10000 = 40;
               break;
            case 235:
               var10000 = 77;
               break;
            case 236:
               var10000 = 172;
               break;
            case 237:
               var10000 = 162;
               break;
            case 238:
               var10000 = 25;
               break;
            case 239:
               var10000 = 134;
               break;
            case 240:
               var10000 = 227;
               break;
            case 241:
               var10000 = 108;
               break;
            case 242:
               var10000 = 123;
               break;
            case 243:
               var10000 = 121;
               break;
            case 244:
               var10000 = 230;
               break;
            case 245:
               var10000 = 202;
               break;
            case 246:
               var10000 = 19;
               break;
            case 247:
               var10000 = 125;
               break;
            case 248:
               var10000 = 225;
               break;
            case 249:
               var10000 = 141;
               break;
            case 250:
               var10000 = 38;
               break;
            case 251:
               var10000 = 100;
               break;
            case 252:
               var10000 = 203;
               break;
            case 253:
               var10000 = 85;
               break;
            case 254:
               var10000 = 207;
               break;
            default:
               var10000 = 197;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26972;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[7];
      int var11 = 0;
      String var10 = "KõNÉÄØé¶\bÇèÜ\u0001áÙÇ¥\u000b\u0011R\f\u000fí\u000fÆÄg1£\u0017\u0096Pé_û\u001càÄöu\"\u0017v¼ïÂÉó\u0011ã \"\u0004\r{ìBú¶Í)M\u0083\u008b\u001a5\f";
      int var12 = "KõNÉÄØé¶\bÇèÜ\u0001áÙÇ¥\u000b\u0011R\f\u000fí\u000fÆÄg1£\u0017\u0096Pé_û\u001càÄöu\"\u0017v¼ïÂÉó\u0011ã \"\u0004\r{ìBú¶Í)M\u0083\u008b\u001a5\f"
         .length();
      char var9 = '\b';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 84;
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
                        var65 = 4;
                        break;
                     case 1:
                        var65 = 80;
                        break;
                     case 2:
                        var65 = 56;
                        break;
                     case 3:
                        var65 = 44;
                        break;
                     case 4:
                        var65 = 122;
                        break;
                     case 5:
                        var65 = 109;
                        break;
                     default:
                        var65 = 3;
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
                     b = new String[7];
                     long var0 = 6566682203008177314L;
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = ";2¼Ðn+Õ_~<òTXc\u0088S0ã²2\u001b\t¸Vøg\u0002Ö:Øq\u0005";
                     int var5 = ";2¼Ðn+Õ_~<òTXc\u0088S0ã²2\u001b\t¸Vøg\u0002Ö:Øq\u0005".length();
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
                                    d = new Integer[6];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "¸j\u000fH°¹®#I;NÍ\u0001}®m";
                                 var5 = "¸j\u000fH°¹®#I;NÍ\u0001}®m".length();
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

                  var10 = "«\u008f)Æ;D`Ý\u001e ç\u0002[z\u0019Þ^¾í\u0084DW^{ïá§|\u000e\u008e\u0091\u0093\u0003ñwU@&5°";
                  var12 = "«\u008f)Æ;D`Ý\u001e ç\u0002[z\u0019Þ^¾í\u0084DW^{ïá§|\u000e\u008e\u0091\u0093\u0003ñwU@&5°".length();
                  var9 = 14;
                  var17 = -1;
            }

            var10000 = 13;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





