package com.finalshell.io;

import com.finalshell.core.Dh2;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class QJ extends FilterInputStream {
   protected final Dh2 k;
   protected byte[] f;
   public boolean w;
   protected boolean n;
   public boolean W;
   protected boolean L;
   public byte[] E;
   public byte[] y;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;
   public static long[] e;
   public static Long[] g;

   QJ(InputStream var1) throws IOException {
      this(var1, false);
   }

   QJ(InputStream var1, boolean var2) throws IOException {
      this(var1, new Dh2(var2));
      this.L = true;
   }

   QJ(InputStream var1, Dh2 var2) throws IOException {
      this(var1, var2, a(23509, 3142985755786231048L));
   }

   QJ(InputStream var1, Dh2 var2, int var3) throws IOException {
      this(var1, var2, var3, true);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   QJ(InputStream var1, Dh2 var2, int var3, boolean var4) throws IOException {
      label30: {
         super(var1);
         this.w = false;
         this.n = false;
         this.W = true;
         this.L = false;
         this.E = new byte[1];
         this.y = new byte[a(17988, 8678541723860115610L)];
         if (var1 != null) {
            try {
               if (var2 != null) {
                  break label30;
               }
            } catch (IOException var7) {
               boolean var10001 = false;
               throw a(var7);
            }
         }

         try {
            throw new NullPointerException();
         } catch (IOException var6) {
            boolean var8 = false;
            throw a(var6);
         }
      }

      try {
         if (var3 <= 0) {
            throw new IllegalArgumentException(a(-3300, 24472));
         }
      } catch (IOException var5) {
         throw a(var5);
      }

      this.k = var2;
      this.f = new byte[var3];
      this.W = var4;
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
      // 00: invokestatic com/finalshell/core/Nm4.g ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/io/QJ.w Z
      // 08: aload 1
      // 09: ifnonnull 35
      // 0c: ifeq 2b
      // 0f: goto 16
      // 12: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: new java/io/IOException
      // 19: dup
      // 1a: sipush -3298
      // 1d: sipush 31006
      // 20: invokestatic com/finalshell/io/QJ.a (II)Ljava/lang/String;
      // 23: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 26: athrow
      // 27: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: aload 0
      // 2c: aload 0
      // 2d: getfield com/finalshell/io/QJ.E [B
      // 30: bipush 0
      // 31: bipush 1
      // 32: invokevirtual com/finalshell/io/QJ.read ([BII)I
      // 35: bipush -1
      // 36: aload 1
      // 37: ifnonnull 5b
      // 3a: if_icmpne 4c
      // 3d: goto 44
      // 40: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: bipush -1
      // 45: goto 5c
      // 48: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: aload 0
      // 4d: getfield com/finalshell/io/QJ.E [B
      // 50: bipush 0
      // 51: baload
      // 52: sipush 18116
      // 55: ldc2_w 1556239961970876443
      // 58: invokestatic com/finalshell/io/QJ.a (IJ)I
      // 5b: iand
      // 5c: ireturn
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
      // 000: invokestatic com/finalshell/core/Nm4.g ()[I
      // 003: astore 4
      // 005: aload 0
      // 006: getfield com/finalshell/io/QJ.w Z
      // 009: ifeq 021
      // 00c: new java/io/IOException
      // 00f: dup
      // 010: sipush -3301
      // 013: sipush -14251
      // 016: invokestatic com/finalshell/io/QJ.a (II)Ljava/lang/String;
      // 019: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 01c: athrow
      // 01d: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 020: athrow
      // 021: aload 1
      // 022: ifnonnull 031
      // 025: new java/lang/NullPointerException
      // 028: dup
      // 029: invokespecial java/lang/NullPointerException.<init> ()V
      // 02c: athrow
      // 02d: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: iload 2
      // 032: aload 4
      // 034: ifnonnull 042
      // 037: iflt 065
      // 03a: goto 041
      // 03d: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 040: athrow
      // 041: iload 3
      // 042: aload 4
      // 044: ifnonnull 052
      // 047: iflt 065
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: iload 3
      // 052: aload 4
      // 054: ifnonnull 072
      // 057: aload 1
      // 058: arraylength
      // 059: iload 2
      // 05a: isub
      // 05b: if_icmple 071
      // 05e: goto 065
      // 061: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 064: athrow
      // 065: new java/lang/IndexOutOfBoundsException
      // 068: dup
      // 069: invokespecial java/lang/IndexOutOfBoundsException.<init> ()V
      // 06c: athrow
      // 06d: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 070: athrow
      // 071: iload 3
      // 072: aload 4
      // 074: ifnonnull 08b
      // 077: ifne 087
      // 07a: goto 081
      // 07d: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 080: athrow
      // 081: bipush 0
      // 082: ireturn
      // 083: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: aload 0
      // 088: getfield com/finalshell/io/QJ.n Z
      // 08b: aload 4
      // 08d: ifnonnull 0a1
      // 090: ifeq 0a0
      // 093: goto 09a
      // 096: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 099: athrow
      // 09a: bipush -1
      // 09b: ireturn
      // 09c: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09f: athrow
      // 0a0: bipush 0
      // 0a1: istore 5
      // 0a3: aload 0
      // 0a4: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 0a7: aload 1
      // 0a8: iload 2
      // 0a9: iload 3
      // 0aa: invokevirtual com/finalshell/core/Dh2.U ([BII)V
      // 0ad: aload 0
      // 0ae: getfield com/finalshell/io/QJ.n Z
      // 0b1: ifne 182
      // 0b4: aload 0
      // 0b5: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 0b8: getfield com/finalshell/core/Dh2.L I
      // 0bb: aload 4
      // 0bd: ifnonnull 184
      // 0c0: aload 4
      // 0c2: ifnonnull 0e9
      // 0c5: goto 0cc
      // 0c8: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cb: athrow
      // 0cc: ifne 0e1
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: invokevirtual com/finalshell/io/QJ.f ()V
      // 0da: goto 0e1
      // 0dd: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 0e5: bipush 0
      // 0e6: invokevirtual com/finalshell/core/Dh2.Q (I)I
      // 0e9: istore 6
      // 0eb: iload 5
      // 0ed: aload 0
      // 0ee: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 0f1: getfield com/finalshell/core/Dh2.V I
      // 0f4: iload 2
      // 0f5: isub
      // 0f6: iadd
      // 0f7: istore 5
      // 0f9: aload 0
      // 0fa: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 0fd: getfield com/finalshell/core/Dh2.V I
      // 100: istore 2
      // 101: iload 6
      // 103: aload 4
      // 105: ifnonnull 167
      // 108: lookupswitch 88 3 -3 40 1 59 2 59
      // 12c: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12f: athrow
      // 130: new java/io/IOException
      // 133: dup
      // 134: aload 0
      // 135: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 138: getfield com/finalshell/core/Dh2.t Ljava/lang/String;
      // 13b: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 13e: athrow
      // 13f: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 142: athrow
      // 143: aload 0
      // 144: bipush 1
      // 145: putfield com/finalshell/io/QJ.n Z
      // 148: iload 6
      // 14a: aload 4
      // 14c: ifnonnull 167
      // 14f: bipush 2
      // 150: if_icmpne 160
      // 153: goto 15a
      // 156: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 159: athrow
      // 15a: bipush -1
      // 15b: ireturn
      // 15c: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15f: athrow
      // 160: aload 0
      // 161: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 164: getfield com/finalshell/core/Dh2.g I
      // 167: ifne 176
      // 16a: aload 4
      // 16c: ifnull 182
      // 16f: goto 176
      // 172: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 175: athrow
      // 176: aload 4
      // 178: ifnull 0ad
      // 17b: goto 182
      // 17e: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 181: athrow
      // 182: iload 5
      // 184: ireturn
   }

   @Override
   public int available() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nm4.g ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/io/QJ.w Z
      // 08: aload 1
      // 09: ifnonnull 2f
      // 0c: ifeq 2b
      // 0f: goto 16
      // 12: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: new java/io/IOException
      // 19: dup
      // 1a: sipush -3301
      // 1d: sipush -14251
      // 20: invokestatic com/finalshell/io/QJ.a (II)Ljava/lang/String;
      // 23: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 26: athrow
      // 27: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield com/finalshell/io/QJ.n Z
      // 2f: aload 1
      // 30: ifnonnull 44
      // 33: ifeq 43
      // 36: goto 3d
      // 39: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: bipush 0
      // 3e: ireturn
      // 3f: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: bipush 1
      // 44: ireturn
   }

   @Override
   public long skip(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nm4.g ()[I
      // 03: astore 3
      // 04: lload 1
      // 05: lconst_0
      // 06: lcmp
      // 07: aload 3
      // 08: ifnonnull 2e
      // 0b: ifge 2a
      // 0e: goto 15
      // 11: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: new java/lang/IllegalArgumentException
      // 18: dup
      // 19: sipush -3299
      // 1c: sipush -15858
      // 1f: invokestatic com/finalshell/io/QJ.a (II)Ljava/lang/String;
      // 22: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 25: athrow
      // 26: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield com/finalshell/io/QJ.w Z
      // 2e: aload 3
      // 2f: ifnonnull 5f
      // 32: ifeq 51
      // 35: goto 3c
      // 38: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: new java/io/IOException
      // 3f: dup
      // 40: sipush -3301
      // 43: sipush -14251
      // 46: invokestatic com/finalshell/io/QJ.a (II)Ljava/lang/String;
      // 49: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 4c: athrow
      // 4d: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: lload 1
      // 52: sipush 3857
      // 55: ldc2_w 8325819572702381323
      // 58: invokestatic com/finalshell/io/QJ.b (IJ)J
      // 5b: invokestatic java/lang/Math.min (JJ)J
      // 5e: l2i
      // 5f: istore 4
      // 61: bipush 0
      // 62: istore 5
      // 64: iload 5
      // 66: iload 4
      // 68: if_icmpge d9
      // 6b: iload 4
      // 6d: iload 5
      // 6f: isub
      // 70: istore 6
      // 72: iload 6
      // 74: aload 3
      // 75: ifnonnull db
      // 78: aload 0
      // 79: getfield com/finalshell/io/QJ.y [B
      // 7c: arraylength
      // 7d: aload 3
      // 7e: ifnonnull a9
      // 81: goto 88
      // 84: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 87: athrow
      // 88: if_icmple 99
      // 8b: goto 92
      // 8e: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 91: athrow
      // 92: aload 0
      // 93: getfield com/finalshell/io/QJ.y [B
      // 96: arraylength
      // 97: istore 6
      // 99: aload 0
      // 9a: aload 0
      // 9b: getfield com/finalshell/io/QJ.y [B
      // 9e: bipush 0
      // 9f: iload 6
      // a1: invokevirtual com/finalshell/io/QJ.read ([BII)I
      // a4: istore 6
      // a6: iload 6
      // a8: bipush -1
      // a9: aload 3
      // aa: ifnonnull d2
      // ad: if_icmpne c7
      // b0: goto b7
      // b3: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b6: athrow
      // b7: aload 0
      // b8: bipush 1
      // b9: putfield com/finalshell/io/QJ.n Z
      // bc: aload 3
      // bd: ifnull d9
      // c0: goto c7
      // c3: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c6: athrow
      // c7: iload 5
      // c9: iload 6
      // cb: goto d2
      // ce: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d1: athrow
      // d2: iadd
      // d3: istore 5
      // d5: aload 3
      // d6: ifnull 64
      // d9: iload 5
      // db: i2l
      // dc: lreturn
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
      // 00: invokestatic com/finalshell/core/Nm4.g ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/io/QJ.w Z
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifne 63
      // 0f: goto 16
      // 12: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/io/QJ.L Z
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 1
      // 22: ifnonnull 4d
      // 25: ifeq 3e
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 33: invokevirtual com/finalshell/core/Dh2.v ()I
      // 36: pop
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: aload 0
      // 3f: aload 1
      // 40: ifnonnull 5f
      // 43: getfield com/finalshell/io/QJ.W Z
      // 46: goto 4d
      // 49: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: ifeq 5e
      // 50: aload 0
      // 51: getfield com/finalshell/io/QJ.in Ljava/io/InputStream;
      // 54: invokevirtual java/io/InputStream.close ()V
      // 57: goto 5e
      // 5a: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d: athrow
      // 5e: aload 0
      // 5f: bipush 1
      // 60: putfield com/finalshell/io/QJ.w Z
      // 63: return
   }

   protected void f() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nm4.g ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/io/QJ.w Z
      // 08: aload 1
      // 09: ifnonnull 3c
      // 0c: ifeq 2b
      // 0f: goto 16
      // 12: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: new java/io/IOException
      // 19: dup
      // 1a: sipush -3301
      // 1d: sipush -14251
      // 20: invokestatic com/finalshell/io/QJ.a (II)Ljava/lang/String;
      // 23: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 26: athrow
      // 27: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield com/finalshell/io/QJ.in Ljava/io/InputStream;
      // 2f: aload 0
      // 30: getfield com/finalshell/io/QJ.f [B
      // 33: bipush 0
      // 34: aload 0
      // 35: getfield com/finalshell/io/QJ.f [B
      // 38: arraylength
      // 39: invokevirtual java/io/InputStream.read ([BII)I
      // 3c: istore 2
      // 3d: aload 1
      // 3e: ifnonnull e7
      // 41: iload 2
      // 42: bipush -1
      // 43: if_icmpne d9
      // 46: goto 4d
      // 49: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 51: getfield com/finalshell/core/Dh2.T Lcom/finalshell/core/A4_3;
      // 54: getfield com/finalshell/core/A4_3.y I
      // 57: aload 1
      // 58: ifnonnull b0
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: ifne 95
      // 65: goto 6c
      // 68: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b: athrow
      // 6c: aload 0
      // 6d: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 70: invokevirtual com/finalshell/core/Dh2.h$boolean ()Z
      // 73: aload 1
      // 74: ifnonnull b0
      // 77: goto 7e
      // 7a: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d: athrow
      // 7e: ifne 95
      // 81: goto 88
      // 84: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 87: athrow
      // 88: aload 0
      // 89: getfield com/finalshell/io/QJ.f [B
      // 8c: bipush 0
      // 8d: bipush 0
      // 8e: bastore
      // 8f: bipush 1
      // 90: istore 2
      // 91: aload 1
      // 92: ifnull d9
      // 95: aload 0
      // 96: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 99: getfield com/finalshell/core/Dh2.T Lcom/finalshell/core/A4_3;
      // 9c: getfield com/finalshell/core/A4_3.i J
      // 9f: sipush 23181
      // a2: ldc2_w 169652044764762262
      // a5: invokestatic com/finalshell/io/QJ.b (IJ)J
      // a8: lcmp
      // a9: goto b0
      // ac: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // af: athrow
      // b0: ifeq c8
      // b3: new java/io/IOException
      // b6: dup
      // b7: sipush -3297
      // ba: sipush 27914
      // bd: invokestatic com/finalshell/io/QJ.a (II)Ljava/lang/String;
      // c0: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // c3: athrow
      // c4: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c7: athrow
      // c8: new java/io/EOFException
      // cb: dup
      // cc: sipush -3302
      // cf: sipush -5392
      // d2: invokestatic com/finalshell/io/QJ.a (II)Ljava/lang/String;
      // d5: invokespecial java/io/EOFException.<init> (Ljava/lang/String;)V
      // d8: athrow
      // d9: aload 0
      // da: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // dd: aload 0
      // de: getfield com/finalshell/io/QJ.f [B
      // e1: bipush 0
      // e2: iload 2
      // e3: bipush 1
      // e4: invokevirtual com/finalshell/core/Dh2.Z ([BIIZ)V
      // e7: return
   }

   @Override
   public boolean markSupported() {
      return false;
   }

   @Override
   public synchronized void mark(int var1) {
   }

   @Override
   public synchronized void reset() throws IOException {
      throw new IOException(a(-3304, -8201));
   }

   long m() {
      return this.k.z();
   }

   long K() {
      return this.k.N();
   }

   byte[] X() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nm4.g ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 08: getfield com/finalshell/core/Dh2.L I
      // 0b: aload 1
      // 0c: ifnonnull 26
      // 0f: ifgt 1f
      // 12: goto 19
      // 15: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aconst_null
      // 1a: areturn
      // 1b: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 23: getfield com/finalshell/core/Dh2.L I
      // 26: newarray 8
      // 28: astore 2
      // 29: aload 0
      // 2a: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 2d: getfield com/finalshell/core/Dh2.x [B
      // 30: aload 0
      // 31: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 34: getfield com/finalshell/core/Dh2.f I
      // 37: aload 2
      // 38: bipush 0
      // 39: aload 0
      // 3a: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 3d: getfield com/finalshell/core/Dh2.L I
      // 40: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 43: aload 2
      // 44: areturn
   }

   void q() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nm4.g ()[I
      // 03: ldc ""
      // 05: invokevirtual java/lang/String.getBytes ()[B
      // 08: astore 2
      // 09: aload 0
      // 0a: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 0d: aload 2
      // 0e: bipush 0
      // 0f: bipush 0
      // 10: bipush 0
      // 11: invokevirtual com/finalshell/core/Dh2.Z ([BIIZ)V
      // 14: aload 0
      // 15: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 18: aload 2
      // 19: bipush 0
      // 1a: bipush 0
      // 1b: invokevirtual com/finalshell/core/Dh2.U ([BII)V
      // 1e: astore 1
      // 1f: aload 0
      // 20: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 23: bipush 0
      // 24: invokevirtual com/finalshell/core/Dh2.Q (I)I
      // 27: istore 3
      // 28: aload 0
      // 29: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 2c: getfield com/finalshell/core/Dh2.T Lcom/finalshell/core/A4_3;
      // 2f: invokevirtual com/finalshell/core/A4_3.z ()Z
      // 32: aload 1
      // 33: ifnonnull 42
      // 36: ifne 41
      // 39: goto 40
      // 3c: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: return
      // 41: bipush 1
      // 42: newarray 8
      // 44: astore 4
      // 46: aload 0
      // 47: getfield com/finalshell/io/QJ.in Ljava/io/InputStream;
      // 4a: aload 4
      // 4c: invokevirtual java/io/InputStream.read ([B)I
      // 4f: istore 5
      // 51: iload 5
      // 53: ifgt 67
      // 56: new java/io/IOException
      // 59: dup
      // 5a: sipush -3303
      // 5d: sipush 24090
      // 60: invokestatic com/finalshell/io/QJ.a (II)Ljava/lang/String;
      // 63: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 66: athrow
      // 67: aload 0
      // 68: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 6b: aload 4
      // 6d: invokevirtual com/finalshell/core/Dh2.b ([B)V
      // 70: aload 0
      // 71: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 74: bipush 0
      // 75: invokevirtual com/finalshell/core/Dh2.Q (I)I
      // 78: istore 3
      // 79: iload 3
      // 7a: aload 1
      // 7b: ifnonnull a5
      // 7e: ifeq 9b
      // 81: goto 88
      // 84: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 87: athrow
      // 88: new java/io/IOException
      // 8b: dup
      // 8c: aload 0
      // 8d: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 90: getfield com/finalshell/core/Dh2.t Ljava/lang/String;
      // 93: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 96: athrow
      // 97: invokestatic com/finalshell/io/QJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9a: athrow
      // 9b: aload 0
      // 9c: getfield com/finalshell/io/QJ.k Lcom/finalshell/core/Dh2;
      // 9f: getfield com/finalshell/core/Dh2.T Lcom/finalshell/core/A4_3;
      // a2: invokevirtual com/finalshell/core/A4_3.z ()Z
      // a5: ifne 46
      // a8: return
   }

   Dh2 h() {
      return this.k;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -3304) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 192;
               break;
            case 1:
               var10000 = 38;
               break;
            case 2:
               var10000 = 235;
               break;
            case 3:
               var10000 = 67;
               break;
            case 4:
               var10000 = 142;
               break;
            case 5:
               var10000 = 186;
               break;
            case 6:
               var10000 = 166;
               break;
            case 7:
               var10000 = 29;
               break;
            case 8:
               var10000 = 206;
               break;
            case 9:
               var10000 = 254;
               break;
            case 10:
               var10000 = 189;
               break;
            case 11:
               var10000 = 26;
               break;
            case 12:
               var10000 = 127;
               break;
            case 13:
               var10000 = 47;
               break;
            case 14:
               var10000 = 204;
               break;
            case 15:
               var10000 = 109;
               break;
            case 16:
               var10000 = 233;
               break;
            case 17:
               var10000 = 149;
               break;
            case 18:
               var10000 = 51;
               break;
            case 19:
               var10000 = 176;
               break;
            case 20:
               var10000 = 30;
               break;
            case 21:
               var10000 = 242;
               break;
            case 22:
               var10000 = 155;
               break;
            case 23:
               var10000 = 99;
               break;
            case 24:
               var10000 = 129;
               break;
            case 25:
               var10000 = 5;
               break;
            case 26:
               var10000 = 20;
               break;
            case 27:
               var10000 = 102;
               break;
            case 28:
               var10000 = 207;
               break;
            case 29:
               var10000 = 162;
               break;
            case 30:
               var10000 = 69;
               break;
            case 31:
               var10000 = 58;
               break;
            case 32:
               var10000 = 25;
               break;
            case 33:
               var10000 = 55;
               break;
            case 34:
               var10000 = 13;
               break;
            case 35:
               var10000 = 227;
               break;
            case 36:
               var10000 = 248;
               break;
            case 37:
               var10000 = 122;
               break;
            case 38:
               var10000 = 52;
               break;
            case 39:
               var10000 = 208;
               break;
            case 40:
               var10000 = 85;
               break;
            case 41:
               var10000 = 216;
               break;
            case 42:
               var10000 = 56;
               break;
            case 43:
               var10000 = 197;
               break;
            case 44:
               var10000 = 224;
               break;
            case 45:
               var10000 = 50;
               break;
            case 46:
               var10000 = 89;
               break;
            case 47:
               var10000 = 217;
               break;
            case 48:
               var10000 = 212;
               break;
            case 49:
               var10000 = 187;
               break;
            case 50:
               var10000 = 76;
               break;
            case 51:
               var10000 = 179;
               break;
            case 52:
               var10000 = 36;
               break;
            case 53:
               var10000 = 126;
               break;
            case 54:
               var10000 = 121;
               break;
            case 55:
               var10000 = 141;
               break;
            case 56:
               var10000 = 246;
               break;
            case 57:
               var10000 = 220;
               break;
            case 58:
               var10000 = 253;
               break;
            case 59:
               var10000 = 100;
               break;
            case 60:
               var10000 = 147;
               break;
            case 61:
               var10000 = 17;
               break;
            case 62:
               var10000 = 223;
               break;
            case 63:
               var10000 = 1;
               break;
            case 64:
               var10000 = 241;
               break;
            case 65:
               var10000 = 98;
               break;
            case 66:
               var10000 = 88;
               break;
            case 67:
               var10000 = 16;
               break;
            case 68:
               var10000 = 185;
               break;
            case 69:
               var10000 = 90;
               break;
            case 70:
               var10000 = 169;
               break;
            case 71:
               var10000 = 152;
               break;
            case 72:
               var10000 = 82;
               break;
            case 73:
               var10000 = 148;
               break;
            case 74:
               var10000 = 14;
               break;
            case 75:
               var10000 = 209;
               break;
            case 76:
               var10000 = 92;
               break;
            case 77:
               var10000 = 71;
               break;
            case 78:
               var10000 = 172;
               break;
            case 79:
               var10000 = 60;
               break;
            case 80:
               var10000 = 137;
               break;
            case 81:
               var10000 = 105;
               break;
            case 82:
               var10000 = 195;
               break;
            case 83:
               var10000 = 7;
               break;
            case 84:
               var10000 = 110;
               break;
            case 85:
               var10000 = 238;
               break;
            case 86:
               var10000 = 2;
               break;
            case 87:
               var10000 = 140;
               break;
            case 88:
               var10000 = 165;
               break;
            case 89:
               var10000 = 205;
               break;
            case 90:
               var10000 = 210;
               break;
            case 91:
               var10000 = 201;
               break;
            case 92:
               var10000 = 117;
               break;
            case 93:
               var10000 = 221;
               break;
            case 94:
               var10000 = 113;
               break;
            case 95:
               var10000 = 57;
               break;
            case 96:
               var10000 = 178;
               break;
            case 97:
               var10000 = 200;
               break;
            case 98:
               var10000 = 198;
               break;
            case 99:
               var10000 = 252;
               break;
            case 100:
               var10000 = 28;
               break;
            case 101:
               var10000 = 108;
               break;
            case 102:
               var10000 = 139;
               break;
            case 103:
               var10000 = 128;
               break;
            case 104:
               var10000 = 247;
               break;
            case 105:
               var10000 = 245;
               break;
            case 106:
               var10000 = 167;
               break;
            case 107:
               var10000 = 232;
               break;
            case 108:
               var10000 = 163;
               break;
            case 109:
               var10000 = 9;
               break;
            case 110:
               var10000 = 164;
               break;
            case 111:
               var10000 = 174;
               break;
            case 112:
               var10000 = 222;
               break;
            case 113:
               var10000 = 40;
               break;
            case 114:
               var10000 = 229;
               break;
            case 115:
               var10000 = 240;
               break;
            case 116:
               var10000 = 236;
               break;
            case 117:
               var10000 = 131;
               break;
            case 118:
               var10000 = 37;
               break;
            case 119:
               var10000 = 101;
               break;
            case 120:
               var10000 = 12;
               break;
            case 121:
               var10000 = 78;
               break;
            case 122:
               var10000 = 243;
               break;
            case 123:
               var10000 = 35;
               break;
            case 124:
               var10000 = 250;
               break;
            case 125:
               var10000 = 111;
               break;
            case 126:
               var10000 = 3;
               break;
            case 127:
               var10000 = 124;
               break;
            case 128:
               var10000 = 156;
               break;
            case 129:
               var10000 = 63;
               break;
            case 130:
               var10000 = 8;
               break;
            case 131:
               var10000 = 31;
               break;
            case 132:
               var10000 = 157;
               break;
            case 133:
               var10000 = 134;
               break;
            case 134:
               var10000 = 214;
               break;
            case 135:
               var10000 = 191;
               break;
            case 136:
               var10000 = 239;
               break;
            case 137:
               var10000 = 230;
               break;
            case 138:
               var10000 = 59;
               break;
            case 139:
               var10000 = 74;
               break;
            case 140:
               var10000 = 168;
               break;
            case 141:
               var10000 = 96;
               break;
            case 142:
               var10000 = 182;
               break;
            case 143:
               var10000 = 6;
               break;
            case 144:
               var10000 = 218;
               break;
            case 145:
               var10000 = 94;
               break;
            case 146:
               var10000 = 41;
               break;
            case 147:
               var10000 = 11;
               break;
            case 148:
               var10000 = 86;
               break;
            case 149:
               var10000 = 219;
               break;
            case 150:
               var10000 = 73;
               break;
            case 151:
               var10000 = 213;
               break;
            case 152:
               var10000 = 249;
               break;
            case 153:
               var10000 = 150;
               break;
            case 154:
               var10000 = 173;
               break;
            case 155:
               var10000 = 24;
               break;
            case 156:
               var10000 = 231;
               break;
            case 157:
               var10000 = 153;
               break;
            case 158:
               var10000 = 32;
               break;
            case 159:
               var10000 = 22;
               break;
            case 160:
               var10000 = 151;
               break;
            case 161:
               var10000 = 45;
               break;
            case 162:
               var10000 = 44;
               break;
            case 163:
               var10000 = 136;
               break;
            case 164:
               var10000 = 211;
               break;
            case 165:
               var10000 = 135;
               break;
            case 166:
               var10000 = 159;
               break;
            case 167:
               var10000 = 68;
               break;
            case 168:
               var10000 = 234;
               break;
            case 169:
               var10000 = 226;
               break;
            case 170:
               var10000 = 91;
               break;
            case 171:
               var10000 = 93;
               break;
            case 172:
               var10000 = 66;
               break;
            case 173:
               var10000 = 132;
               break;
            case 174:
               var10000 = 77;
               break;
            case 175:
               var10000 = 54;
               break;
            case 176:
               var10000 = 79;
               break;
            case 177:
               var10000 = 103;
               break;
            case 178:
               var10000 = 175;
               break;
            case 179:
               var10000 = 27;
               break;
            case 180:
               var10000 = 184;
               break;
            case 181:
               var10000 = 61;
               break;
            case 182:
               var10000 = 70;
               break;
            case 183:
               var10000 = 180;
               break;
            case 184:
               var10000 = 171;
               break;
            case 185:
               var10000 = 95;
               break;
            case 186:
               var10000 = 107;
               break;
            case 187:
               var10000 = 42;
               break;
            case 188:
               var10000 = 138;
               break;
            case 189:
               var10000 = 65;
               break;
            case 190:
               var10000 = 114;
               break;
            case 191:
               var10000 = 251;
               break;
            case 192:
               var10000 = 177;
               break;
            case 193:
               var10000 = 154;
               break;
            case 194:
               var10000 = 118;
               break;
            case 195:
               var10000 = 46;
               break;
            case 196:
               var10000 = 215;
               break;
            case 197:
               var10000 = 115;
               break;
            case 198:
               var10000 = 203;
               break;
            case 199:
               var10000 = 34;
               break;
            case 200:
               var10000 = 225;
               break;
            case 201:
               var10000 = 194;
               break;
            case 202:
               var10000 = 133;
               break;
            case 203:
               var10000 = 146;
               break;
            case 204:
               var10000 = 75;
               break;
            case 205:
               var10000 = 39;
               break;
            case 206:
               var10000 = 10;
               break;
            case 207:
               var10000 = 15;
               break;
            case 208:
               var10000 = 53;
               break;
            case 209:
               var10000 = 161;
               break;
            case 210:
               var10000 = 228;
               break;
            case 211:
               var10000 = 106;
               break;
            case 212:
               var10000 = 104;
               break;
            case 213:
               var10000 = 83;
               break;
            case 214:
               var10000 = 81;
               break;
            case 215:
               var10000 = 160;
               break;
            case 216:
               var10000 = 0;
               break;
            case 217:
               var10000 = 123;
               break;
            case 218:
               var10000 = 21;
               break;
            case 219:
               var10000 = 158;
               break;
            case 220:
               var10000 = 80;
               break;
            case 221:
               var10000 = 196;
               break;
            case 222:
               var10000 = 255;
               break;
            case 223:
               var10000 = 72;
               break;
            case 224:
               var10000 = 33;
               break;
            case 225:
               var10000 = 23;
               break;
            case 226:
               var10000 = 145;
               break;
            case 227:
               var10000 = 18;
               break;
            case 228:
               var10000 = 4;
               break;
            case 229:
               var10000 = 144;
               break;
            case 230:
               var10000 = 170;
               break;
            case 231:
               var10000 = 188;
               break;
            case 232:
               var10000 = 119;
               break;
            case 233:
               var10000 = 43;
               break;
            case 234:
               var10000 = 244;
               break;
            case 235:
               var10000 = 48;
               break;
            case 236:
               var10000 = 193;
               break;
            case 237:
               var10000 = 87;
               break;
            case 238:
               var10000 = 116;
               break;
            case 239:
               var10000 = 199;
               break;
            case 240:
               var10000 = 183;
               break;
            case 241:
               var10000 = 49;
               break;
            case 242:
               var10000 = 62;
               break;
            case 243:
               var10000 = 19;
               break;
            case 244:
               var10000 = 120;
               break;
            case 245:
               var10000 = 237;
               break;
            case 246:
               var10000 = 97;
               break;
            case 247:
               var10000 = 190;
               break;
            case 248:
               var10000 = 143;
               break;
            case 249:
               var10000 = 125;
               break;
            case 250:
               var10000 = 64;
               break;
            case 251:
               var10000 = 112;
               break;
            case 252:
               var10000 = 84;
               break;
            case 253:
               var10000 = 130;
               break;
            case 254:
               var10000 = 181;
               break;
            default:
               var10000 = 202;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26335;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 2586) & 32767;
      if (g[var3] == null) {
         g[var3] = e[var3] ^ var1;
      }

      return g[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[8];
      int var19 = 0;
      String var18 = "\u0099ZsW\u009fÔ\u0007+òþ\u008d©°¹J\u0000êW\u0014±Õ>]«\bXºz\u0086ç®q!#åÿÔ\u001eÁ\u009b~0\u001bj°\"\u0016²¿oGuú\u008c\\èu\u008cÞGG¹í\u0000\u001fU\u009e½,\rXË²Üéu\u000bó\u0097ìZ\u0098x\"êãçûÑí\u0088\fâ\u0014Gu\u0006¤\u008d\u0085~\u0012l\u0006xh_¢l\u009eOa_Þ\u0082êß\u0084\u0014q)\u0018·\u001e\u0098\u0014Ì¤Ñá¬\u0000ªìªàÁ)\u0091";
      int var20 = "\u0099ZsW\u009fÔ\u0007+òþ\u008d©°¹J\u0000êW\u0014±Õ>]«\bXºz\u0086ç®q!#åÿÔ\u001eÁ\u009b~0\u001bj°\"\u0016²¿oGuú\u008c\\èu\u008cÞGG¹í\u0000\u001fU\u009e½,\rXË²Üéu\u000bó\u0097ìZ\u0098x\"êãçûÑí\u0088\fâ\u0014Gu\u0006¤\u008d\u0085~\u0012l\u0006xh_¢l\u009eOa_Þ\u0082êß\u0084\u0014q)\u0018·\u001e\u0098\u0014Ì¤Ñá¬\u0000ªìªàÁ)\u0091"
         .length();
      char var17 = 24;
      int var24 = -1;

      label71:
      while (true) {
         byte var10000 = 111;
         String var10001 = var18.substring(++var24, var24 + var17);
         byte var10002 = -1;

         while (true) {
      char[] var40;
            label66: {
               char[] var44 = var10001.toCharArray();
               int var10004 = var44.length;
               int var22 = 0;
               byte var47 = var10000;
               var40 = var44;
               int var30 = var10004;
               byte var54;
               char[] var60;
               int var10006;
               if (var10004 <= 1) {
                  var60 = var44;
                  var54 = var10000;
                  var10006 = var22;
               } else {
                  var47 = var10000;
                  var30 = var10004;
                  if (var10004 <= var22) {
                     break label66;
                  }

                  var60 = var44;
                  var54 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var69 = var60[var10006];
                  byte var70;
                  switch (var22 % 7) {
                     case 0:
                        var70 = 24;
                        break;
                     case 1:
                        var70 = 63;
                        break;
                     case 2:
                        var70 = 115;
                        break;
                     case 3:
                        var70 = 95;
                        break;
                     case 4:
                        var70 = 14;
                        break;
                     case 5:
                        var70 = 35;
                        break;
                     default:
                        var70 = 24;
                  }

                  var60[var10006] = (char)(var69 ^ var54 ^ var70);
                  var22++;
                  if (var47 == 0) {
                     var10006 = var47;
                     var60 = var40;
                     var54 = var47;
                  } else {
                     if (var30 <= var22) {
                        break;
                     }

                     var60 = var40;
                     var54 = var47;
                     var10006 = var22;
                  }
               }
            }

            String var49 = new String(var40).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var49;
                  if ((var24 += var17) >= var20) {
                     a = var21;
                     b = new String[8];
                     long var8 = 6109739940571584177L;
                     long[] var14 = new long[3];
                     int var11 = 0;
                     String var12 = "®\u0096\u0094-íC¶UûÍ|\u0099`ß´+ð\u000e\u009a[h\t)¹";
                     int var13 = "®\u0096\u0094-íC¶UûÍ|\u0099`ß´+ð\u000e\u009a[h\t)¹".length();
                     byte var10 = 0;

                     do {
                        byte var32 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var32, var10).getBytes("ISO-8859-1");
                        int var33 = var11++;
                        long var58 = (
                              ((long)var15[0] & 255L) << 56
                                 | ((long)var15[1] & 255L) << 48
                                 | ((long)var15[2] & 255L) << 40
                                 | ((long)var15[3] & 255L) << 32
                                 | ((long)var15[4] & 255L) << 24
                                 | ((long)var15[5] & 255L) << 16
                                 | ((long)var15[6] & 255L) << 8
                                 | (long)var15[7] & 255L
                           )
                           ^ var8;
                        byte var50 = -1;
                        var14[var33] = var58;
                     } while (var10 < var13);

                     c = var14;
                     d = new Integer[3];
                     long var0 = 1994948756419656421L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "h$;\u0099r\u0094@\u0011æ\n=\u000e;à\u0095\u008c";
                     int var5 = "h$;\u0099r\u0094@\u0011æ\n=\u000e;à\u0095\u008c".length();
                     byte var2 = 0;

                     do {
                        byte var34 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                        int var35 = var3++;
                        long var59 = (
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
                        byte var51 = -1;
                        var6[var35] = var59;
                     } while (var2 < var5);

                     e = var6;
                     g = new Long[2];
                     return;
                  }

                  var17 = var18.charAt(var24);
                  break;
               default:
                  var21[var19++] = var49;
                  if ((var24 += var17) < var20) {
                     var17 = var18.charAt(var24);
                     continue label71;
                  }

                  var18 = "´Ù\u0007¶w\u0010ðwÀT\u0098§\b\u0013\u008aÃN\u009cäy\u0006¬\u0001+Aä\u009dMùt:p2";
                  var20 = "´Ù\u0007¶w\u0010ðwÀT\u0098§\b\u0013\u008aÃN\u009cäy\u0006¬\u0001+Aä\u009dMùt:p2".length();
                  var17 = '\r';
                  var24 = -1;
            }

            var10000 = 102;
            var10001 = var18.substring(++var24, var24 + var17);
            var10002 = 0;
         }
      }
   }
}





