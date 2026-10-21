package com.finalshell.core;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.security.AccessController;
import java.util.Properties;

public class S7 {
   public static Properties S;
   public static Charset v;
   public static char[] y;
   public static boolean[] K;
   public static boolean[] t;
   public static byte[] j;
   public static byte[] q;
   public static boolean[] V;
   public static boolean[] M;
   public static char[] Q;
   public static char[] n;
   static char[] R;
   static char[] T;
   static char[] D;
   static int[] f;
   public static char[] z;
   public static int[] b;
   public static String[] a;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;
   public static long[] g;
   public static Long[] h;

   public static String A(String var0) {
      String var1 = null;

      try {
         var1 = System.getProperty(var0);
      } catch (SecurityException var3) {
      }

      try {
         if (var1 == null) {
            return S.getProperty(var0);
         }
      } catch (SecurityException var4) {
         throw a(var4);
      }

      return var1;
   }

   public static void U() {
      InputStream var0 = AccessController.doPrivileged(new Cm4_2());

      try {
         if (null != var0) {
            try {
               S.load(var0);
               var0.close();
            } catch (IOException var2) {
            }
         }
      } catch (SecurityException var3) {
         throw a(var3);
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static void o(Closeable var0) {
      int var1 = Ph2.w();

      Closeable var10000;
      label29: {
         try {
            var10000 = var0;
            if (var1 == 0) {
               break label29;
            }

            if (var0 == null) {
               return;
            }
         } catch (Exception var5) {
            throw a(var5);
         }

         try {
            var10000 = var0;
         } catch (Exception var4) {
            boolean var10001 = false;
            return;
         }
      }

      try {
         var10000.close();
      } catch (Exception var3) {
         boolean var6 = false;
      }
   }

   public static int u(long param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: sipush 30954
      // 06: ldc2_w 1277004930445314900
      // 09: invokestatic com/finalshell/core/S7.b (IJ)J
      // 0c: lstore 3
      // 0d: istore 2
      // 0e: bipush 1
      // 0f: istore 5
      // 11: iload 5
      // 13: sipush 19937
      // 16: ldc2_w 1202565405225530849
      // 19: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1c: if_icmpge 55
      // 1f: lload 0
      // 20: lload 3
      // 21: iload 2
      // 22: ifne 4c
      // 25: lcmp
      // 26: iload 2
      // 27: ifne 5e
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: ifge 42
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: iload 5
      // 3d: ireturn
      // 3e: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: sipush 28756
      // 45: ldc2_w 3225719394983609320
      // 48: invokestatic com/finalshell/core/S7.b (IJ)J
      // 4b: lload 3
      // 4c: lmul
      // 4d: lstore 3
      // 4e: iinc 5 1
      // 51: iload 2
      // 52: ifeq 11
      // 55: sipush 19937
      // 58: ldc2_w 1202565405225530849
      // 5b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 5e: ireturn
   }

   public static void v(long param0, int param2, char[] param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.w ()I
      // 003: iload 2
      // 004: istore 8
      // 006: istore 4
      // 008: bipush 0
      // 009: istore 9
      // 00b: lload 0
      // 00c: lconst_0
      // 00d: lcmp
      // 00e: iload 4
      // 010: ifeq 036
      // 013: ifge 02b
      // 016: goto 01d
      // 019: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01c: athrow
      // 01d: sipush 20758
      // 020: ldc2_w 2920632921900427611
      // 023: invokestatic com/finalshell/core/S7.a (IJ)I
      // 026: istore 9
      // 028: lload 0
      // 029: lneg
      // 02a: lstore 0
      // 02b: lload 0
      // 02c: sipush 31133
      // 02f: ldc2_w 3330889308276394530
      // 032: invokestatic com/finalshell/core/S7.b (IJ)J
      // 035: lcmp
      // 036: ifle 088
      // 039: lload 0
      // 03a: sipush 24100
      // 03d: ldc2_w 1447399721853398425
      // 040: invokestatic com/finalshell/core/S7.b (IJ)J
      // 043: ldiv
      // 044: lstore 5
      // 046: lload 0
      // 047: lload 5
      // 049: sipush 17642
      // 04c: ldc2_w 3973525135493741602
      // 04f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 052: lshl
      // 053: lload 5
      // 055: bipush 5
      // 056: lshl
      // 057: ladd
      // 058: lload 5
      // 05a: bipush 2
      // 05b: lshl
      // 05c: ladd
      // 05d: lsub
      // 05e: l2i
      // 05f: istore 7
      // 061: lload 5
      // 063: iload 4
      // 065: ifeq 089
      // 068: lstore 0
      // 069: aload 3
      // 06a: iinc 8 -1
      // 06d: iload 8
      // 06f: getstatic com/finalshell/core/S7.D [C
      // 072: iload 7
      // 074: caload
      // 075: castore
      // 076: aload 3
      // 077: iinc 8 -1
      // 07a: iload 8
      // 07c: getstatic com/finalshell/core/S7.T [C
      // 07f: iload 7
      // 081: caload
      // 082: castore
      // 083: iload 4
      // 085: ifne 02b
      // 088: lload 0
      // 089: l2i
      // 08a: istore 11
      // 08c: iload 11
      // 08e: sipush 5752
      // 091: ldc2_w 7362215925145988627
      // 094: invokestatic com/finalshell/core/S7.a (IJ)I
      // 097: if_icmplt 0f2
      // 09a: iload 11
      // 09c: sipush 21026
      // 09f: ldc2_w 9163288788220816089
      // 0a2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0a5: idiv
      // 0a6: istore 10
      // 0a8: iload 11
      // 0aa: iload 10
      // 0ac: sipush 17642
      // 0af: ldc2_w 3973525135493741602
      // 0b2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0b5: ishl
      // 0b6: iload 10
      // 0b8: bipush 5
      // 0b9: ishl
      // 0ba: iadd
      // 0bb: iload 10
      // 0bd: bipush 2
      // 0be: ishl
      // 0bf: iadd
      // 0c0: isub
      // 0c1: istore 7
      // 0c3: iload 10
      // 0c5: istore 11
      // 0c7: aload 3
      // 0c8: iinc 8 -1
      // 0cb: iload 8
      // 0cd: getstatic com/finalshell/core/S7.D [C
      // 0d0: iload 7
      // 0d2: caload
      // 0d3: castore
      // 0d4: aload 3
      // 0d5: iinc 8 -1
      // 0d8: iload 8
      // 0da: getstatic com/finalshell/core/S7.T [C
      // 0dd: iload 7
      // 0df: caload
      // 0e0: castore
      // 0e1: iload 4
      // 0e3: ifeq 129
      // 0e6: iload 4
      // 0e8: ifne 08c
      // 0eb: goto 0f2
      // 0ee: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f1: athrow
      // 0f2: iload 11
      // 0f4: sipush 17034
      // 0f7: ldc2_w 8061912221053401724
      // 0fa: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0fd: imul
      // 0fe: sipush 19937
      // 101: ldc2_w 1202565405225530849
      // 104: invokestatic com/finalshell/core/S7.a (IJ)I
      // 107: iushr
      // 108: istore 10
      // 10a: iload 11
      // 10c: iload 10
      // 10e: bipush 3
      // 10f: ishl
      // 110: iload 10
      // 112: bipush 1
      // 113: ishl
      // 114: iadd
      // 115: isub
      // 116: istore 7
      // 118: aload 3
      // 119: iinc 8 -1
      // 11c: iload 8
      // 11e: getstatic com/finalshell/core/S7.R [C
      // 121: iload 7
      // 123: caload
      // 124: castore
      // 125: iload 10
      // 127: istore 11
      // 129: iload 11
      // 12b: ifne 0f2
      // 12e: goto 131
      // 131: iload 9
      // 133: ifeq 146
      // 136: aload 3
      // 137: iinc 8 -1
      // 13a: iload 8
      // 13c: iload 9
      // 13e: castore
      // 13f: goto 146
      // 142: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 145: athrow
      // 146: return
   }

   public static void E(int param0, int param1, char[] param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: iload 1
      // 04: istore 6
      // 06: istore 3
      // 07: bipush 0
      // 08: istore 7
      // 0a: iload 0
      // 0b: iload 3
      // 0c: ifne 28
      // 0f: ifge 27
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: sipush 9789
      // 1c: ldc2_w 6813733451080457837
      // 1f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 22: istore 7
      // 24: iload 0
      // 25: ineg
      // 26: istore 0
      // 27: iload 0
      // 28: sipush 5752
      // 2b: ldc2_w 7362215925145988627
      // 2e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 31: if_icmplt 87
      // 34: iload 0
      // 35: sipush 24103
      // 38: ldc2_w 1775575711360820854
      // 3b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 3e: idiv
      // 3f: istore 4
      // 41: iload 0
      // 42: iload 4
      // 44: sipush 17642
      // 47: ldc2_w 3973525135493741602
      // 4a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 4d: ishl
      // 4e: iload 4
      // 50: bipush 5
      // 51: ishl
      // 52: iadd
      // 53: iload 4
      // 55: bipush 2
      // 56: ishl
      // 57: iadd
      // 58: isub
      // 59: istore 5
      // 5b: iload 4
      // 5d: istore 0
      // 5e: aload 2
      // 5f: iinc 6 -1
      // 62: iload 6
      // 64: getstatic com/finalshell/core/S7.D [C
      // 67: iload 5
      // 69: caload
      // 6a: castore
      // 6b: aload 2
      // 6c: iinc 6 -1
      // 6f: iload 6
      // 71: getstatic com/finalshell/core/S7.T [C
      // 74: iload 5
      // 76: caload
      // 77: castore
      // 78: iload 3
      // 79: ifne bb
      // 7c: iload 3
      // 7d: ifeq 27
      // 80: goto 87
      // 83: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86: athrow
      // 87: iload 0
      // 88: sipush 4912
      // 8b: ldc2_w 1971078967715490809
      // 8e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 91: imul
      // 92: sipush 19937
      // 95: ldc2_w 1202565405225530849
      // 98: invokestatic com/finalshell/core/S7.a (IJ)I
      // 9b: iushr
      // 9c: istore 4
      // 9e: iload 0
      // 9f: iload 4
      // a1: bipush 3
      // a2: ishl
      // a3: iload 4
      // a5: bipush 1
      // a6: ishl
      // a7: iadd
      // a8: isub
      // a9: istore 5
      // ab: aload 2
      // ac: iinc 6 -1
      // af: iload 6
      // b1: getstatic com/finalshell/core/S7.R [C
      // b4: iload 5
      // b6: caload
      // b7: castore
      // b8: iload 4
      // ba: istore 0
      // bb: iload 0
      // bc: ifne 87
      // bf: goto c2
      // c2: iload 7
      // c4: ifeq d7
      // c7: aload 2
      // c8: iinc 6 -1
      // cb: iload 6
      // cd: iload 7
      // cf: castore
      // d0: goto d7
      // d3: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d6: athrow
      // d7: return
   }

   public static void Z(byte param0, int param1, char[] param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: iload 0
      // 04: istore 4
      // 06: istore 3
      // 07: iload 1
      // 08: istore 7
      // 0a: bipush 0
      // 0b: istore 8
      // 0d: iload 4
      // 0f: iload 3
      // 10: ifeq 43
      // 13: ifge 2d
      // 16: goto 1d
      // 19: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: sipush 9789
      // 20: ldc2_w 6813733451080457837
      // 23: invokestatic com/finalshell/core/S7.a (IJ)I
      // 26: istore 8
      // 28: iload 4
      // 2a: ineg
      // 2b: istore 4
      // 2d: iload 4
      // 2f: sipush 4912
      // 32: ldc2_w 1971078967715490809
      // 35: invokestatic com/finalshell/core/S7.a (IJ)I
      // 38: imul
      // 39: sipush 19937
      // 3c: ldc2_w 1202565405225530849
      // 3f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 42: iushr
      // 43: istore 5
      // 45: iload 4
      // 47: iload 5
      // 49: bipush 3
      // 4a: ishl
      // 4b: iload 5
      // 4d: bipush 1
      // 4e: ishl
      // 4f: iadd
      // 50: isub
      // 51: istore 6
      // 53: aload 2
      // 54: iinc 7 -1
      // 57: iload 7
      // 59: getstatic com/finalshell/core/S7.R [C
      // 5c: iload 6
      // 5e: caload
      // 5f: castore
      // 60: iload 5
      // 62: istore 4
      // 64: iload 4
      // 66: ifne 2d
      // 69: goto 6c
      // 6c: iload 8
      // 6e: ifeq 81
      // 71: aload 2
      // 72: iinc 7 -1
      // 75: iload 7
      // 77: iload 8
      // 79: castore
      // 7a: goto 81
      // 7d: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80: athrow
      // 81: return
   }

   public static int x(int param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: bipush 0
      // 04: istore 2
      // 05: istore 1
      // 06: iload 0
      // 07: getstatic com/finalshell/core/S7.f [I
      // 0a: iload 2
      // 0b: iaload
      // 0c: if_icmpgt 22
      // 0f: iload 1
      // 10: ifne 25
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: iload 2
      // 1b: bipush 1
      // 1c: iadd
      // 1d: ireturn
      // 1e: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: iinc 2 1
      // 25: goto 06
   }

   public static void a(CharsetDecoder param0, ByteBuffer param1, CharBuffer param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: bipush 1
      // 08: invokevirtual java/nio/charset/CharsetDecoder.decode (Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;
      // 0b: astore 4
      // 0d: aload 4
      // 0f: invokevirtual java/nio/charset/CoderResult.isUnderflow ()Z
      // 12: iload 3
      // 13: ifeq 43
      // 16: ifne 2c
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 4
      // 22: invokevirtual java/nio/charset/CoderResult.throwException ()V
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 0
      // 2d: aload 2
      // 2e: invokevirtual java/nio/charset/CharsetDecoder.flush (Ljava/nio/CharBuffer;)Ljava/nio/charset/CoderResult;
      // 31: astore 4
      // 33: aload 4
      // 35: iload 3
      // 36: ifeq 48
      // 39: invokevirtual java/nio/charset/CoderResult.isUnderflow ()Z
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: ifne 4b
      // 46: aload 4
      // 48: invokevirtual java/nio/charset/CoderResult.throwException ()V
      // 4b: goto 78
      // 4e: astore 4
      // 50: new com/finalshell/core/Hi2
      // 53: dup
      // 54: new java/lang/StringBuilder
      // 57: dup
      // 58: invokespecial java/lang/StringBuilder.<init> ()V
      // 5b: sipush 16336
      // 5e: sipush 17219
      // 61: invokestatic com/finalshell/core/S7.a (II)Ljava/lang/String;
      // 64: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 67: aload 4
      // 69: invokevirtual java/nio/charset/CharacterCodingException.getMessage ()Ljava/lang/String;
      // 6c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 72: aload 4
      // 74: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 77: athrow
      // 78: return
   }

   public static boolean p(char param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifne 23
      // 09: getstatic com/finalshell/core/S7.K [Z
      // 0c: arraylength
      // 0d: if_icmpge 35
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: getstatic com/finalshell/core/S7.K [Z
      // 1a: iload 0
      // 1b: baload
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: iload 1
      // 24: ifne 32
      // 27: ifeq 35
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: bipush 1
      // 32: goto 36
      // 35: bipush 0
      // 36: ireturn
   }

   public static boolean h(char param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifeq 23
      // 09: getstatic com/finalshell/core/S7.t [Z
      // 0c: arraylength
      // 0d: if_icmpge 35
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: getstatic com/finalshell/core/S7.t [Z
      // 1a: iload 0
      // 1b: baload
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: iload 1
      // 24: ifeq 32
      // 27: ifeq 35
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: bipush 1
      // 32: goto 36
      // 35: bipush 0
      // 36: ireturn
   }

   public static byte[] U(char[] param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.w ()I
      // 003: istore 3
      // 004: iload 2
      // 005: iload 3
      // 006: ifeq 01c
      // 009: ifne 01b
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: bipush 0
      // 014: newarray 8
      // 016: areturn
      // 017: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01a: athrow
      // 01b: iload 1
      // 01c: istore 4
      // 01e: iload 1
      // 01f: iload 2
      // 020: iadd
      // 021: bipush 1
      // 022: isub
      // 023: istore 5
      // 025: iload 4
      // 027: iload 5
      // 029: if_icmpge 05b
      // 02c: getstatic com/finalshell/core/S7.b [I
      // 02f: aload 0
      // 030: iload 4
      // 032: caload
      // 033: iaload
      // 034: iload 3
      // 035: ifeq 05d
      // 038: iload 3
      // 039: ifeq 05d
      // 03c: goto 043
      // 03f: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 042: athrow
      // 043: ifge 05b
      // 046: goto 04d
      // 049: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04c: athrow
      // 04d: iinc 4 1
      // 050: iload 3
      // 051: ifne 025
      // 054: goto 05b
      // 057: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: iload 5
      // 05d: ifle 096
      // 060: getstatic com/finalshell/core/S7.b [I
      // 063: aload 0
      // 064: iload 5
      // 066: caload
      // 067: iaload
      // 068: iload 3
      // 069: ifeq 09a
      // 06c: goto 073
      // 06f: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: iload 3
      // 074: ifeq 09a
      // 077: goto 07e
      // 07a: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: ifge 096
      // 081: goto 088
      // 084: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 087: athrow
      // 088: iinc 5 -1
      // 08b: iload 3
      // 08c: ifne 05b
      // 08f: goto 096
      // 092: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 095: athrow
      // 096: aload 0
      // 097: iload 5
      // 099: caload
      // 09a: sipush 30240
      // 09d: ldc2_w 2286155561746763280
      // 0a0: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0a3: iload 3
      // 0a4: ifeq 0d2
      // 0a7: if_icmpne 0e1
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: iload 5
      // 0b4: bipush 1
      // 0b5: isub
      // 0b6: caload
      // 0b7: iload 3
      // 0b8: ifeq 0de
      // 0bb: goto 0c2
      // 0be: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c1: athrow
      // 0c2: sipush 23011
      // 0c5: ldc2_w 5758432979682828614
      // 0c8: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0cb: goto 0d2
      // 0ce: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d1: athrow
      // 0d2: if_icmpne 0dd
      // 0d5: bipush 2
      // 0d6: goto 0e2
      // 0d9: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dc: athrow
      // 0dd: bipush 1
      // 0de: goto 0e2
      // 0e1: bipush 0
      // 0e2: istore 6
      // 0e4: iload 5
      // 0e6: iload 4
      // 0e8: isub
      // 0e9: bipush 1
      // 0ea: iadd
      // 0eb: istore 7
      // 0ed: iload 2
      // 0ee: sipush 13380
      // 0f1: ldc2_w 5636173156929424522
      // 0f4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0f7: iload 3
      // 0f8: ifeq 120
      // 0fb: if_icmple 14a
      // 0fe: goto 105
      // 101: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 104: athrow
      // 105: aload 0
      // 106: sipush 8203
      // 109: ldc2_w 2791172401761900618
      // 10c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 10f: caload
      // 110: sipush 5707
      // 113: ldc2_w 8406000456809344541
      // 116: invokestatic com/finalshell/core/S7.a (IJ)I
      // 119: goto 120
      // 11c: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11f: athrow
      // 120: iload 3
      // 121: ifeq 140
      // 124: if_icmpne 144
      // 127: goto 12e
      // 12a: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12d: athrow
      // 12e: iload 7
      // 130: sipush 15272
      // 133: ldc2_w 2195731090564694832
      // 136: invokestatic com/finalshell/core/S7.a (IJ)I
      // 139: goto 140
      // 13c: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13f: athrow
      // 140: idiv
      // 141: goto 145
      // 144: bipush 0
      // 145: bipush 1
      // 146: ishl
      // 147: goto 14b
      // 14a: bipush 0
      // 14b: istore 8
      // 14d: iload 7
      // 14f: iload 8
      // 151: isub
      // 152: sipush 17642
      // 155: ldc2_w 3973525135493741602
      // 158: invokestatic com/finalshell/core/S7.a (IJ)I
      // 15b: imul
      // 15c: bipush 3
      // 15d: ishr
      // 15e: iload 6
      // 160: isub
      // 161: istore 9
      // 163: iload 9
      // 165: newarray 8
      // 167: astore 10
      // 169: bipush 0
      // 16a: istore 11
      // 16c: bipush 0
      // 16d: istore 12
      // 16f: iload 9
      // 171: bipush 3
      // 172: idiv
      // 173: bipush 3
      // 174: imul
      // 175: istore 13
      // 177: iload 11
      // 179: iload 13
      // 17b: if_icmpge 251
      // 17e: getstatic com/finalshell/core/S7.b [I
      // 181: aload 0
      // 182: iload 4
      // 184: iinc 4 1
      // 187: caload
      // 188: iaload
      // 189: sipush 1558
      // 18c: ldc2_w 2915472958089854672
      // 18f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 192: ishl
      // 193: getstatic com/finalshell/core/S7.b [I
      // 196: aload 0
      // 197: iload 4
      // 199: iinc 4 1
      // 19c: caload
      // 19d: iaload
      // 19e: sipush 215
      // 1a1: ldc2_w 8160882664965077241
      // 1a4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1a7: ishl
      // 1a8: ior
      // 1a9: getstatic com/finalshell/core/S7.b [I
      // 1ac: aload 0
      // 1ad: iload 4
      // 1af: iinc 4 1
      // 1b2: caload
      // 1b3: iaload
      // 1b4: sipush 17642
      // 1b7: ldc2_w 3973525135493741602
      // 1ba: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1bd: ishl
      // 1be: ior
      // 1bf: getstatic com/finalshell/core/S7.b [I
      // 1c2: aload 0
      // 1c3: iload 4
      // 1c5: iinc 4 1
      // 1c8: caload
      // 1c9: iaload
      // 1ca: ior
      // 1cb: istore 14
      // 1cd: aload 10
      // 1cf: iload 11
      // 1d1: iinc 11 1
      // 1d4: iload 14
      // 1d6: sipush 4457
      // 1d9: ldc2_w 1183996692873996555
      // 1dc: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1df: ishr
      // 1e0: i2b
      // 1e1: bastore
      // 1e2: aload 10
      // 1e4: iload 11
      // 1e6: iinc 11 1
      // 1e9: iload 14
      // 1eb: sipush 4229
      // 1ee: ldc2_w 7790544441193916521
      // 1f1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1f4: ishr
      // 1f5: i2b
      // 1f6: bastore
      // 1f7: aload 10
      // 1f9: iload 11
      // 1fb: iinc 11 1
      // 1fe: iload 14
      // 200: i2b
      // 201: bastore
      // 202: iload 8
      // 204: iload 3
      // 205: ifeq 253
      // 208: iload 3
      // 209: ifeq 229
      // 20c: goto 213
      // 20f: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 212: athrow
      // 213: ifle 24d
      // 216: goto 21d
      // 219: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21c: athrow
      // 21d: iinc 12 1
      // 220: iload 12
      // 222: goto 229
      // 225: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 228: athrow
      // 229: iload 3
      // 22a: ifeq 24b
      // 22d: sipush 2916
      // 230: ldc2_w 1854934925089174446
      // 233: invokestatic com/finalshell/core/S7.a (IJ)I
      // 236: if_icmpne 24d
      // 239: goto 240
      // 23c: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23f: athrow
      // 240: iinc 4 2
      // 243: bipush 0
      // 244: goto 24b
      // 247: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24a: athrow
      // 24b: istore 12
      // 24d: iload 3
      // 24e: ifne 177
      // 251: iload 11
      // 253: iload 3
      // 254: ifeq 267
      // 257: iload 9
      // 259: if_icmpge 2e5
      // 25c: goto 263
      // 25f: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 262: athrow
      // 263: bipush 0
      // 264: istore 12
      // 266: bipush 0
      // 267: istore 13
      // 269: iload 4
      // 26b: iload 5
      // 26d: iload 6
      // 26f: isub
      // 270: if_icmpgt 2ac
      // 273: iload 12
      // 275: getstatic com/finalshell/core/S7.b [I
      // 278: aload 0
      // 279: iload 4
      // 27b: iinc 4 1
      // 27e: caload
      // 27f: iaload
      // 280: sipush 1558
      // 283: ldc2_w 2915472958089854672
      // 286: invokestatic com/finalshell/core/S7.a (IJ)I
      // 289: iload 13
      // 28b: sipush 17642
      // 28e: ldc2_w 3973525135493741602
      // 291: invokestatic com/finalshell/core/S7.a (IJ)I
      // 294: imul
      // 295: isub
      // 296: ishl
      // 297: ior
      // 298: istore 12
      // 29a: iinc 13 1
      // 29d: iload 3
      // 29e: ifeq 2b7
      // 2a1: iload 3
      // 2a2: ifne 269
      // 2a5: goto 2ac
      // 2a8: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ab: athrow
      // 2ac: sipush 4739
      // 2af: ldc2_w 5831792552873355921
      // 2b2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2b5: istore 13
      // 2b7: iload 11
      // 2b9: iload 9
      // 2bb: if_icmpge 2e5
      // 2be: aload 10
      // 2c0: iload 3
      // 2c1: ifeq 2e7
      // 2c4: goto 2cb
      // 2c7: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ca: athrow
      // 2cb: iload 11
      // 2cd: iinc 11 1
      // 2d0: iload 12
      // 2d2: iload 13
      // 2d4: ishr
      // 2d5: i2b
      // 2d6: bastore
      // 2d7: iinc 13 -8
      // 2da: iload 3
      // 2db: ifne 2b7
      // 2de: goto 2e5
      // 2e1: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e4: athrow
      // 2e5: aload 10
      // 2e7: areturn
   }

   public static byte[] s(String param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.w ()I
      // 003: istore 3
      // 004: iload 2
      // 005: iload 3
      // 006: ifeq 01c
      // 009: ifne 01b
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: bipush 0
      // 014: newarray 8
      // 016: areturn
      // 017: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01a: athrow
      // 01b: iload 1
      // 01c: istore 4
      // 01e: iload 1
      // 01f: iload 2
      // 020: iadd
      // 021: bipush 1
      // 022: isub
      // 023: istore 5
      // 025: iload 4
      // 027: iload 5
      // 029: if_icmpge 05d
      // 02c: getstatic com/finalshell/core/S7.b [I
      // 02f: aload 0
      // 030: iload 4
      // 032: invokevirtual java/lang/String.charAt (I)C
      // 035: iaload
      // 036: iload 3
      // 037: ifeq 05f
      // 03a: iload 3
      // 03b: ifeq 05f
      // 03e: goto 045
      // 041: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 044: athrow
      // 045: ifge 05d
      // 048: goto 04f
      // 04b: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: iinc 4 1
      // 052: iload 3
      // 053: ifne 025
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05c: athrow
      // 05d: iload 5
      // 05f: ifle 09a
      // 062: getstatic com/finalshell/core/S7.b [I
      // 065: aload 0
      // 066: iload 5
      // 068: invokevirtual java/lang/String.charAt (I)C
      // 06b: iaload
      // 06c: iload 3
      // 06d: ifeq 0a0
      // 070: goto 077
      // 073: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 076: athrow
      // 077: iload 3
      // 078: ifeq 0a0
      // 07b: goto 082
      // 07e: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 081: athrow
      // 082: ifge 09a
      // 085: goto 08c
      // 088: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08b: athrow
      // 08c: iinc 5 -1
      // 08f: iload 3
      // 090: ifne 05d
      // 093: goto 09a
      // 096: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 099: athrow
      // 09a: aload 0
      // 09b: iload 5
      // 09d: invokevirtual java/lang/String.charAt (I)C
      // 0a0: sipush 23011
      // 0a3: ldc2_w 5758432979682828614
      // 0a6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0a9: iload 3
      // 0aa: ifeq 0da
      // 0ad: if_icmpne 0e9
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b6: athrow
      // 0b7: aload 0
      // 0b8: iload 5
      // 0ba: bipush 1
      // 0bb: isub
      // 0bc: invokevirtual java/lang/String.charAt (I)C
      // 0bf: iload 3
      // 0c0: ifeq 0e6
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c9: athrow
      // 0ca: sipush 23011
      // 0cd: ldc2_w 5758432979682828614
      // 0d0: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0d3: goto 0da
      // 0d6: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d9: athrow
      // 0da: if_icmpne 0e5
      // 0dd: bipush 2
      // 0de: goto 0ea
      // 0e1: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e4: athrow
      // 0e5: bipush 1
      // 0e6: goto 0ea
      // 0e9: bipush 0
      // 0ea: istore 6
      // 0ec: iload 5
      // 0ee: iload 4
      // 0f0: isub
      // 0f1: bipush 1
      // 0f2: iadd
      // 0f3: istore 7
      // 0f5: iload 2
      // 0f6: sipush 8203
      // 0f9: ldc2_w 2791172401761900618
      // 0fc: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0ff: iload 3
      // 100: ifeq 12a
      // 103: if_icmple 154
      // 106: goto 10d
      // 109: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10c: athrow
      // 10d: aload 0
      // 10e: sipush 8203
      // 111: ldc2_w 2791172401761900618
      // 114: invokestatic com/finalshell/core/S7.a (IJ)I
      // 117: invokevirtual java/lang/String.charAt (I)C
      // 11a: sipush 22597
      // 11d: ldc2_w 5988630053160427604
      // 120: invokestatic com/finalshell/core/S7.a (IJ)I
      // 123: goto 12a
      // 126: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 129: athrow
      // 12a: iload 3
      // 12b: ifeq 14a
      // 12e: if_icmpne 14e
      // 131: goto 138
      // 134: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 137: athrow
      // 138: iload 7
      // 13a: sipush 8975
      // 13d: ldc2_w 1664705615479036905
      // 140: invokestatic com/finalshell/core/S7.a (IJ)I
      // 143: goto 14a
      // 146: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 149: athrow
      // 14a: idiv
      // 14b: goto 14f
      // 14e: bipush 0
      // 14f: bipush 1
      // 150: ishl
      // 151: goto 155
      // 154: bipush 0
      // 155: istore 8
      // 157: iload 7
      // 159: iload 8
      // 15b: isub
      // 15c: sipush 17642
      // 15f: ldc2_w 3973525135493741602
      // 162: invokestatic com/finalshell/core/S7.a (IJ)I
      // 165: imul
      // 166: bipush 3
      // 167: ishr
      // 168: iload 6
      // 16a: isub
      // 16b: istore 9
      // 16d: iload 9
      // 16f: newarray 8
      // 171: astore 10
      // 173: bipush 0
      // 174: istore 11
      // 176: bipush 0
      // 177: istore 12
      // 179: iload 9
      // 17b: bipush 3
      // 17c: idiv
      // 17d: bipush 3
      // 17e: imul
      // 17f: istore 13
      // 181: iload 11
      // 183: iload 13
      // 185: if_icmpge 263
      // 188: getstatic com/finalshell/core/S7.b [I
      // 18b: aload 0
      // 18c: iload 4
      // 18e: iinc 4 1
      // 191: invokevirtual java/lang/String.charAt (I)C
      // 194: iaload
      // 195: sipush 1558
      // 198: ldc2_w 2915472958089854672
      // 19b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 19e: ishl
      // 19f: getstatic com/finalshell/core/S7.b [I
      // 1a2: aload 0
      // 1a3: iload 4
      // 1a5: iinc 4 1
      // 1a8: invokevirtual java/lang/String.charAt (I)C
      // 1ab: iaload
      // 1ac: sipush 215
      // 1af: ldc2_w 8160882664965077241
      // 1b2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1b5: ishl
      // 1b6: ior
      // 1b7: getstatic com/finalshell/core/S7.b [I
      // 1ba: aload 0
      // 1bb: iload 4
      // 1bd: iinc 4 1
      // 1c0: invokevirtual java/lang/String.charAt (I)C
      // 1c3: iaload
      // 1c4: sipush 17642
      // 1c7: ldc2_w 3973525135493741602
      // 1ca: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1cd: ishl
      // 1ce: ior
      // 1cf: getstatic com/finalshell/core/S7.b [I
      // 1d2: aload 0
      // 1d3: iload 4
      // 1d5: iinc 4 1
      // 1d8: invokevirtual java/lang/String.charAt (I)C
      // 1db: iaload
      // 1dc: ior
      // 1dd: istore 14
      // 1df: aload 10
      // 1e1: iload 11
      // 1e3: iinc 11 1
      // 1e6: iload 14
      // 1e8: sipush 4739
      // 1eb: ldc2_w 5831792552873355921
      // 1ee: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1f1: ishr
      // 1f2: i2b
      // 1f3: bastore
      // 1f4: aload 10
      // 1f6: iload 11
      // 1f8: iinc 11 1
      // 1fb: iload 14
      // 1fd: sipush 29230
      // 200: ldc2_w 2245239911286966921
      // 203: invokestatic com/finalshell/core/S7.a (IJ)I
      // 206: ishr
      // 207: i2b
      // 208: bastore
      // 209: aload 10
      // 20b: iload 11
      // 20d: iinc 11 1
      // 210: iload 14
      // 212: i2b
      // 213: bastore
      // 214: iload 8
      // 216: iload 3
      // 217: ifeq 265
      // 21a: iload 3
      // 21b: ifeq 23b
      // 21e: goto 225
      // 221: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 224: athrow
      // 225: ifle 25f
      // 228: goto 22f
      // 22b: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22e: athrow
      // 22f: iinc 12 1
      // 232: iload 12
      // 234: goto 23b
      // 237: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23a: athrow
      // 23b: iload 3
      // 23c: ifeq 25d
      // 23f: sipush 19937
      // 242: ldc2_w 1202565405225530849
      // 245: invokestatic com/finalshell/core/S7.a (IJ)I
      // 248: if_icmpne 25f
      // 24b: goto 252
      // 24e: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 251: athrow
      // 252: iinc 4 2
      // 255: bipush 0
      // 256: goto 25d
      // 259: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25c: athrow
      // 25d: istore 12
      // 25f: iload 3
      // 260: ifne 181
      // 263: iload 11
      // 265: iload 3
      // 266: ifeq 279
      // 269: iload 9
      // 26b: if_icmpge 2f9
      // 26e: goto 275
      // 271: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 274: athrow
      // 275: bipush 0
      // 276: istore 12
      // 278: bipush 0
      // 279: istore 13
      // 27b: iload 4
      // 27d: iload 5
      // 27f: iload 6
      // 281: isub
      // 282: if_icmpgt 2c0
      // 285: iload 12
      // 287: getstatic com/finalshell/core/S7.b [I
      // 28a: aload 0
      // 28b: iload 4
      // 28d: iinc 4 1
      // 290: invokevirtual java/lang/String.charAt (I)C
      // 293: iaload
      // 294: sipush 1558
      // 297: ldc2_w 2915472958089854672
      // 29a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 29d: iload 13
      // 29f: sipush 17642
      // 2a2: ldc2_w 3973525135493741602
      // 2a5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2a8: imul
      // 2a9: isub
      // 2aa: ishl
      // 2ab: ior
      // 2ac: istore 12
      // 2ae: iinc 13 1
      // 2b1: iload 3
      // 2b2: ifeq 2cb
      // 2b5: iload 3
      // 2b6: ifne 27b
      // 2b9: goto 2c0
      // 2bc: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2bf: athrow
      // 2c0: sipush 4739
      // 2c3: ldc2_w 5831792552873355921
      // 2c6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2c9: istore 13
      // 2cb: iload 11
      // 2cd: iload 9
      // 2cf: if_icmpge 2f9
      // 2d2: aload 10
      // 2d4: iload 3
      // 2d5: ifeq 2fb
      // 2d8: goto 2df
      // 2db: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2de: athrow
      // 2df: iload 11
      // 2e1: iinc 11 1
      // 2e4: iload 12
      // 2e6: iload 13
      // 2e8: ishr
      // 2e9: i2b
      // 2ea: bastore
      // 2eb: iinc 13 -8
      // 2ee: iload 3
      // 2ef: ifne 2cb
      // 2f2: goto 2f9
      // 2f5: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f8: athrow
      // 2f9: aload 10
      // 2fb: areturn
   }

   public static byte[] T(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.w ()I
      // 003: aload 0
      // 004: invokevirtual java/lang/String.length ()I
      // 007: istore 2
      // 008: istore 1
      // 009: iload 2
      // 00a: iload 1
      // 00b: ifeq 021
      // 00e: ifne 020
      // 011: goto 018
      // 014: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 017: athrow
      // 018: bipush 0
      // 019: newarray 8
      // 01b: areturn
      // 01c: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01f: athrow
      // 020: bipush 0
      // 021: istore 3
      // 022: iload 2
      // 023: bipush 1
      // 024: isub
      // 025: istore 4
      // 027: iload 3
      // 028: iload 4
      // 02a: if_icmpge 067
      // 02d: getstatic com/finalshell/core/S7.b [I
      // 030: aload 0
      // 031: iload 3
      // 032: invokevirtual java/lang/String.charAt (I)C
      // 035: sipush 9612
      // 038: ldc2_w 7621973282498960825
      // 03b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 03e: iand
      // 03f: iaload
      // 040: iload 1
      // 041: ifeq 069
      // 044: iload 1
      // 045: ifeq 069
      // 048: goto 04f
      // 04b: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: ifge 067
      // 052: goto 059
      // 055: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058: athrow
      // 059: iinc 3 1
      // 05c: iload 1
      // 05d: ifne 027
      // 060: goto 067
      // 063: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 066: athrow
      // 067: iload 4
      // 069: ifle 0ae
      // 06c: getstatic com/finalshell/core/S7.b [I
      // 06f: aload 0
      // 070: iload 4
      // 072: invokevirtual java/lang/String.charAt (I)C
      // 075: sipush 21789
      // 078: ldc2_w 2147178615075286279
      // 07b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 07e: iand
      // 07f: iaload
      // 080: iload 1
      // 081: ifeq 0b4
      // 084: goto 08b
      // 087: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08a: athrow
      // 08b: iload 1
      // 08c: ifeq 0b4
      // 08f: goto 096
      // 092: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 095: athrow
      // 096: ifge 0ae
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09f: athrow
      // 0a0: iinc 4 -1
      // 0a3: iload 1
      // 0a4: ifne 067
      // 0a7: goto 0ae
      // 0aa: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: iload 4
      // 0b1: invokevirtual java/lang/String.charAt (I)C
      // 0b4: sipush 23011
      // 0b7: ldc2_w 5758432979682828614
      // 0ba: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0bd: iload 1
      // 0be: ifeq 0ee
      // 0c1: if_icmpne 0fd
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: iload 4
      // 0ce: bipush 1
      // 0cf: isub
      // 0d0: invokevirtual java/lang/String.charAt (I)C
      // 0d3: iload 1
      // 0d4: ifeq 0fa
      // 0d7: goto 0de
      // 0da: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: sipush 23011
      // 0e1: ldc2_w 5758432979682828614
      // 0e4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0e7: goto 0ee
      // 0ea: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ed: athrow
      // 0ee: if_icmpne 0f9
      // 0f1: bipush 2
      // 0f2: goto 0fe
      // 0f5: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f8: athrow
      // 0f9: bipush 1
      // 0fa: goto 0fe
      // 0fd: bipush 0
      // 0fe: istore 5
      // 100: iload 4
      // 102: iload 3
      // 103: isub
      // 104: bipush 1
      // 105: iadd
      // 106: istore 6
      // 108: iload 2
      // 109: sipush 8203
      // 10c: ldc2_w 2791172401761900618
      // 10f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 112: iload 1
      // 113: ifeq 13d
      // 116: if_icmple 167
      // 119: goto 120
      // 11c: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11f: athrow
      // 120: aload 0
      // 121: sipush 8203
      // 124: ldc2_w 2791172401761900618
      // 127: invokestatic com/finalshell/core/S7.a (IJ)I
      // 12a: invokevirtual java/lang/String.charAt (I)C
      // 12d: sipush 22597
      // 130: ldc2_w 5988630053160427604
      // 133: invokestatic com/finalshell/core/S7.a (IJ)I
      // 136: goto 13d
      // 139: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13c: athrow
      // 13d: iload 1
      // 13e: ifeq 15d
      // 141: if_icmpne 161
      // 144: goto 14b
      // 147: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14a: athrow
      // 14b: iload 6
      // 14d: sipush 8975
      // 150: ldc2_w 1664705615479036905
      // 153: invokestatic com/finalshell/core/S7.a (IJ)I
      // 156: goto 15d
      // 159: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15c: athrow
      // 15d: idiv
      // 15e: goto 162
      // 161: bipush 0
      // 162: bipush 1
      // 163: ishl
      // 164: goto 168
      // 167: bipush 0
      // 168: istore 7
      // 16a: iload 6
      // 16c: iload 7
      // 16e: isub
      // 16f: sipush 17642
      // 172: ldc2_w 3973525135493741602
      // 175: invokestatic com/finalshell/core/S7.a (IJ)I
      // 178: imul
      // 179: bipush 3
      // 17a: ishr
      // 17b: iload 5
      // 17d: isub
      // 17e: istore 8
      // 180: iload 8
      // 182: newarray 8
      // 184: astore 9
      // 186: bipush 0
      // 187: istore 10
      // 189: bipush 0
      // 18a: istore 11
      // 18c: iload 8
      // 18e: bipush 3
      // 18f: idiv
      // 190: bipush 3
      // 191: imul
      // 192: istore 12
      // 194: iload 10
      // 196: iload 12
      // 198: if_icmpge 272
      // 19b: getstatic com/finalshell/core/S7.b [I
      // 19e: aload 0
      // 19f: iload 3
      // 1a0: iinc 3 1
      // 1a3: invokevirtual java/lang/String.charAt (I)C
      // 1a6: iaload
      // 1a7: sipush 1558
      // 1aa: ldc2_w 2915472958089854672
      // 1ad: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1b0: ishl
      // 1b1: getstatic com/finalshell/core/S7.b [I
      // 1b4: aload 0
      // 1b5: iload 3
      // 1b6: iinc 3 1
      // 1b9: invokevirtual java/lang/String.charAt (I)C
      // 1bc: iaload
      // 1bd: sipush 215
      // 1c0: ldc2_w 8160882664965077241
      // 1c3: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1c6: ishl
      // 1c7: ior
      // 1c8: getstatic com/finalshell/core/S7.b [I
      // 1cb: aload 0
      // 1cc: iload 3
      // 1cd: iinc 3 1
      // 1d0: invokevirtual java/lang/String.charAt (I)C
      // 1d3: iaload
      // 1d4: sipush 17642
      // 1d7: ldc2_w 3973525135493741602
      // 1da: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1dd: ishl
      // 1de: ior
      // 1df: getstatic com/finalshell/core/S7.b [I
      // 1e2: aload 0
      // 1e3: iload 3
      // 1e4: iinc 3 1
      // 1e7: invokevirtual java/lang/String.charAt (I)C
      // 1ea: iaload
      // 1eb: ior
      // 1ec: istore 13
      // 1ee: aload 9
      // 1f0: iload 10
      // 1f2: iinc 10 1
      // 1f5: iload 13
      // 1f7: sipush 4739
      // 1fa: ldc2_w 5831792552873355921
      // 1fd: invokestatic com/finalshell/core/S7.a (IJ)I
      // 200: ishr
      // 201: i2b
      // 202: bastore
      // 203: aload 9
      // 205: iload 10
      // 207: iinc 10 1
      // 20a: iload 13
      // 20c: sipush 29230
      // 20f: ldc2_w 2245239911286966921
      // 212: invokestatic com/finalshell/core/S7.a (IJ)I
      // 215: ishr
      // 216: i2b
      // 217: bastore
      // 218: aload 9
      // 21a: iload 10
      // 21c: iinc 10 1
      // 21f: iload 13
      // 221: i2b
      // 222: bastore
      // 223: iload 7
      // 225: iload 1
      // 226: ifeq 274
      // 229: iload 1
      // 22a: ifeq 24a
      // 22d: goto 234
      // 230: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 233: athrow
      // 234: ifle 26e
      // 237: goto 23e
      // 23a: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23d: athrow
      // 23e: iinc 11 1
      // 241: iload 11
      // 243: goto 24a
      // 246: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 249: athrow
      // 24a: iload 1
      // 24b: ifeq 26c
      // 24e: sipush 19937
      // 251: ldc2_w 1202565405225530849
      // 254: invokestatic com/finalshell/core/S7.a (IJ)I
      // 257: if_icmpne 26e
      // 25a: goto 261
      // 25d: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 260: athrow
      // 261: iinc 3 2
      // 264: bipush 0
      // 265: goto 26c
      // 268: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26b: athrow
      // 26c: istore 11
      // 26e: iload 1
      // 26f: ifne 194
      // 272: iload 10
      // 274: iload 1
      // 275: ifeq 288
      // 278: iload 8
      // 27a: if_icmpge 306
      // 27d: goto 284
      // 280: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 283: athrow
      // 284: bipush 0
      // 285: istore 11
      // 287: bipush 0
      // 288: istore 12
      // 28a: iload 3
      // 28b: iload 4
      // 28d: iload 5
      // 28f: isub
      // 290: if_icmpgt 2cd
      // 293: iload 11
      // 295: getstatic com/finalshell/core/S7.b [I
      // 298: aload 0
      // 299: iload 3
      // 29a: iinc 3 1
      // 29d: invokevirtual java/lang/String.charAt (I)C
      // 2a0: iaload
      // 2a1: sipush 1558
      // 2a4: ldc2_w 2915472958089854672
      // 2a7: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2aa: iload 12
      // 2ac: sipush 17642
      // 2af: ldc2_w 3973525135493741602
      // 2b2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2b5: imul
      // 2b6: isub
      // 2b7: ishl
      // 2b8: ior
      // 2b9: istore 11
      // 2bb: iinc 12 1
      // 2be: iload 1
      // 2bf: ifeq 2d8
      // 2c2: iload 1
      // 2c3: ifne 28a
      // 2c6: goto 2cd
      // 2c9: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2cc: athrow
      // 2cd: sipush 4739
      // 2d0: ldc2_w 5831792552873355921
      // 2d3: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2d6: istore 12
      // 2d8: iload 10
      // 2da: iload 8
      // 2dc: if_icmpge 306
      // 2df: aload 9
      // 2e1: iload 1
      // 2e2: ifeq 308
      // 2e5: goto 2ec
      // 2e8: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2eb: athrow
      // 2ec: iload 10
      // 2ee: iinc 10 1
      // 2f1: iload 11
      // 2f3: iload 12
      // 2f5: ishr
      // 2f6: i2b
      // 2f7: bastore
      // 2f8: iinc 12 -8
      // 2fb: iload 1
      // 2fc: ifne 2d8
      // 2ff: goto 306
      // 302: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 305: athrow
      // 306: aload 9
      // 308: areturn
   }

   public static int u(char[] param0, int param1, int param2, byte[] param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 1
      // 001: iload 2
      // 002: iadd
      // 003: istore 5
      // 005: invokestatic com/finalshell/core/Ph2.w ()I
      // 008: bipush 0
      // 009: istore 6
      // 00b: istore 4
      // 00d: iload 6
      // 00f: iload 2
      // 010: aload 3
      // 011: arraylength
      // 012: invokestatic java/lang/Math.min (II)I
      // 015: iadd
      // 016: istore 7
      // 018: iload 6
      // 01a: iload 7
      // 01c: if_icmpge 060
      // 01f: aload 0
      // 020: iload 1
      // 021: caload
      // 022: sipush 7048
      // 025: ldc2_w 1920671161994470306
      // 028: invokestatic com/finalshell/core/S7.a (IJ)I
      // 02b: iload 4
      // 02d: ifeq 063
      // 030: iload 4
      // 032: ifeq 063
      // 035: goto 03c
      // 038: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03b: athrow
      // 03c: if_icmpge 060
      // 03f: goto 046
      // 042: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 045: athrow
      // 046: aload 3
      // 047: iload 6
      // 049: iinc 6 1
      // 04c: aload 0
      // 04d: iload 1
      // 04e: iinc 1 1
      // 051: caload
      // 052: i2b
      // 053: bastore
      // 054: iload 4
      // 056: ifne 018
      // 059: goto 060
      // 05c: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05f: athrow
      // 060: iload 1
      // 061: iload 5
      // 063: if_icmpge 3de
      // 066: aload 0
      // 067: iload 1
      // 068: iinc 1 1
      // 06b: caload
      // 06c: istore 8
      // 06e: iload 8
      // 070: iload 4
      // 072: ifeq 3e0
      // 075: sipush 7048
      // 078: ldc2_w 1920671161994470306
      // 07b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 07e: iload 4
      // 080: ifeq 0bc
      // 083: goto 08a
      // 086: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 089: athrow
      // 08a: if_icmpge 0aa
      // 08d: goto 094
      // 090: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 093: athrow
      // 094: aload 3
      // 095: iload 6
      // 097: iinc 6 1
      // 09a: iload 8
      // 09c: i2b
      // 09d: bastore
      // 09e: iload 4
      // 0a0: ifne 3d9
      // 0a3: goto 0aa
      // 0a6: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: iload 8
      // 0ac: sipush 11647
      // 0af: ldc2_w 760191503932937639
      // 0b2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0b5: goto 0bc
      // 0b8: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bb: athrow
      // 0bc: iload 4
      // 0be: ifeq 125
      // 0c1: if_icmpge 113
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: aload 3
      // 0cc: iload 6
      // 0ce: iinc 6 1
      // 0d1: sipush 31998
      // 0d4: ldc2_w 5231802193664902346
      // 0d7: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0da: iload 8
      // 0dc: sipush 17642
      // 0df: ldc2_w 3973525135493741602
      // 0e2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0e5: ishr
      // 0e6: ior
      // 0e7: i2b
      // 0e8: bastore
      // 0e9: aload 3
      // 0ea: iload 6
      // 0ec: iinc 6 1
      // 0ef: sipush 7048
      // 0f2: ldc2_w 1920671161994470306
      // 0f5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0f8: iload 8
      // 0fa: sipush 29228
      // 0fd: ldc2_w 7112756475600964348
      // 100: invokestatic com/finalshell/core/S7.a (IJ)I
      // 103: iand
      // 104: ior
      // 105: i2b
      // 106: bastore
      // 107: iload 4
      // 109: ifne 3d9
      // 10c: goto 113
      // 10f: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 112: athrow
      // 113: iload 8
      // 115: sipush 20470
      // 118: ldc2_w 6896995236365154222
      // 11b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 11e: goto 125
      // 121: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 124: athrow
      // 125: iload 4
      // 127: ifeq 146
      // 12a: if_icmplt 36e
      // 12d: goto 134
      // 130: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 133: athrow
      // 134: iload 8
      // 136: sipush 10997
      // 139: ldc2_w 389940006082433836
      // 13c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 13f: goto 146
      // 142: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 145: athrow
      // 146: iload 4
      // 148: ifeq 15e
      // 14b: if_icmpge 36e
      // 14e: goto 155
      // 151: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 154: athrow
      // 155: iload 1
      // 156: bipush 1
      // 157: goto 15e
      // 15a: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15d: athrow
      // 15e: isub
      // 15f: istore 10
      // 161: iload 8
      // 163: sipush 20470
      // 166: ldc2_w 6896995236365154222
      // 169: invokestatic com/finalshell/core/S7.a (IJ)I
      // 16c: iload 4
      // 16e: ifeq 26e
      // 171: if_icmplt 250
      // 174: goto 17b
      // 177: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17a: athrow
      // 17b: iload 8
      // 17d: sipush 22125
      // 180: ldc2_w 5429687591818866615
      // 183: invokestatic com/finalshell/core/S7.a (IJ)I
      // 186: iload 4
      // 188: ifeq 26e
      // 18b: goto 192
      // 18e: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 191: athrow
      // 192: if_icmpge 250
      // 195: goto 19c
      // 198: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19b: athrow
      // 19c: iload 5
      // 19e: iload 10
      // 1a0: isub
      // 1a1: iload 4
      // 1a3: ifeq 1cd
      // 1a6: goto 1ad
      // 1a9: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ac: athrow
      // 1ad: bipush 2
      // 1ae: if_icmpge 1c0
      // 1b1: goto 1b8
      // 1b4: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b7: athrow
      // 1b8: bipush -1
      // 1b9: istore 9
      // 1bb: iload 4
      // 1bd: ifne 2b2
      // 1c0: aload 0
      // 1c1: iload 10
      // 1c3: bipush 1
      // 1c4: iadd
      // 1c5: caload
      // 1c6: goto 1cd
      // 1c9: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cc: athrow
      // 1cd: istore 11
      // 1cf: iload 4
      // 1d1: ifeq 248
      // 1d4: iload 11
      // 1d6: sipush 22125
      // 1d9: ldc2_w 5429687591818866615
      // 1dc: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1df: if_icmplt 231
      // 1e2: goto 1e9
      // 1e5: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e8: athrow
      // 1e9: iload 11
      // 1eb: sipush 10997
      // 1ee: ldc2_w 389940006082433836
      // 1f1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1f4: iload 4
      // 1f6: ifeq 229
      // 1f9: goto 200
      // 1fc: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ff: athrow
      // 200: if_icmpge 231
      // 203: goto 20a
      // 206: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 209: athrow
      // 20a: iload 8
      // 20c: sipush 19431
      // 20f: ldc2_w 3995733026905961425
      // 212: invokestatic com/finalshell/core/S7.a (IJ)I
      // 215: ishl
      // 216: iload 11
      // 218: iadd
      // 219: sipush 6394
      // 21c: ldc2_w 2543604385199218868
      // 21f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 222: goto 229
      // 225: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 228: athrow
      // 229: iadd
      // 22a: istore 9
      // 22c: iload 4
      // 22e: ifne 24b
      // 231: aload 3
      // 232: iload 6
      // 234: iinc 6 1
      // 237: sipush 17065
      // 23a: ldc2_w 8505440891111619271
      // 23d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 240: bastore
      // 241: goto 248
      // 244: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 247: athrow
      // 248: goto 060
      // 24b: iload 4
      // 24d: ifne 2b2
      // 250: iload 8
      // 252: iload 4
      // 254: ifeq 2b0
      // 257: goto 25e
      // 25a: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25d: athrow
      // 25e: sipush 22125
      // 261: ldc2_w 5429687591818866615
      // 264: invokestatic com/finalshell/core/S7.a (IJ)I
      // 267: goto 26e
      // 26a: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26d: athrow
      // 26e: if_icmplt 2ae
      // 271: iload 8
      // 273: iload 4
      // 275: ifeq 2b0
      // 278: goto 27f
      // 27b: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27e: athrow
      // 27f: sipush 10997
      // 282: ldc2_w 389940006082433836
      // 285: invokestatic com/finalshell/core/S7.a (IJ)I
      // 288: if_icmpge 2ae
      // 28b: goto 292
      // 28e: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 291: athrow
      // 292: aload 3
      // 293: iload 6
      // 295: iinc 6 1
      // 298: sipush 17065
      // 29b: ldc2_w 8505440891111619271
      // 29e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2a1: bastore
      // 2a2: iload 4
      // 2a4: ifne 060
      // 2a7: goto 2ae
      // 2aa: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ad: athrow
      // 2ae: iload 8
      // 2b0: istore 9
      // 2b2: iload 9
      // 2b4: ifge 2d3
      // 2b7: aload 3
      // 2b8: iload 6
      // 2ba: iinc 6 1
      // 2bd: sipush 17065
      // 2c0: ldc2_w 8505440891111619271
      // 2c3: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2c6: bastore
      // 2c7: iload 4
      // 2c9: ifne 369
      // 2cc: goto 2d3
      // 2cf: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d2: athrow
      // 2d3: aload 3
      // 2d4: iload 6
      // 2d6: iinc 6 1
      // 2d9: sipush 30108
      // 2dc: ldc2_w 5926304669874851135
      // 2df: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2e2: iload 9
      // 2e4: sipush 1558
      // 2e7: ldc2_w 2915472958089854672
      // 2ea: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2ed: ishr
      // 2ee: ior
      // 2ef: i2b
      // 2f0: bastore
      // 2f1: aload 3
      // 2f2: iload 6
      // 2f4: iinc 6 1
      // 2f7: sipush 7048
      // 2fa: ldc2_w 1920671161994470306
      // 2fd: invokestatic com/finalshell/core/S7.a (IJ)I
      // 300: iload 9
      // 302: sipush 215
      // 305: ldc2_w 8160882664965077241
      // 308: invokestatic com/finalshell/core/S7.a (IJ)I
      // 30b: ishr
      // 30c: sipush 17065
      // 30f: ldc2_w 8505440891111619271
      // 312: invokestatic com/finalshell/core/S7.a (IJ)I
      // 315: iand
      // 316: ior
      // 317: i2b
      // 318: bastore
      // 319: aload 3
      // 31a: iload 6
      // 31c: iinc 6 1
      // 31f: sipush 7048
      // 322: ldc2_w 1920671161994470306
      // 325: invokestatic com/finalshell/core/S7.a (IJ)I
      // 328: iload 9
      // 32a: sipush 17642
      // 32d: ldc2_w 3973525135493741602
      // 330: invokestatic com/finalshell/core/S7.a (IJ)I
      // 333: ishr
      // 334: sipush 17065
      // 337: ldc2_w 8505440891111619271
      // 33a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 33d: iand
      // 33e: ior
      // 33f: i2b
      // 340: bastore
      // 341: aload 3
      // 342: iload 6
      // 344: iinc 6 1
      // 347: sipush 7048
      // 34a: ldc2_w 1920671161994470306
      // 34d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 350: iload 9
      // 352: sipush 17065
      // 355: ldc2_w 8505440891111619271
      // 358: invokestatic com/finalshell/core/S7.a (IJ)I
      // 35b: iand
      // 35c: ior
      // 35d: i2b
      // 35e: bastore
      // 35f: iinc 1 1
      // 362: goto 369
      // 365: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 368: athrow
      // 369: iload 4
      // 36b: ifne 3d9
      // 36e: aload 3
      // 36f: iload 6
      // 371: iinc 6 1
      // 374: sipush 10380
      // 377: ldc2_w 1022578237356953724
      // 37a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 37d: iload 8
      // 37f: sipush 215
      // 382: ldc2_w 8160882664965077241
      // 385: invokestatic com/finalshell/core/S7.a (IJ)I
      // 388: ishr
      // 389: ior
      // 38a: i2b
      // 38b: bastore
      // 38c: aload 3
      // 38d: iload 6
      // 38f: iinc 6 1
      // 392: sipush 7048
      // 395: ldc2_w 1920671161994470306
      // 398: invokestatic com/finalshell/core/S7.a (IJ)I
      // 39b: iload 8
      // 39d: sipush 17642
      // 3a0: ldc2_w 3973525135493741602
      // 3a3: invokestatic com/finalshell/core/S7.a (IJ)I
      // 3a6: ishr
      // 3a7: sipush 17065
      // 3aa: ldc2_w 8505440891111619271
      // 3ad: invokestatic com/finalshell/core/S7.a (IJ)I
      // 3b0: iand
      // 3b1: ior
      // 3b2: i2b
      // 3b3: bastore
      // 3b4: aload 3
      // 3b5: iload 6
      // 3b7: iinc 6 1
      // 3ba: sipush 7048
      // 3bd: ldc2_w 1920671161994470306
      // 3c0: invokestatic com/finalshell/core/S7.a (IJ)I
      // 3c3: iload 8
      // 3c5: sipush 17065
      // 3c8: ldc2_w 8505440891111619271
      // 3cb: invokestatic com/finalshell/core/S7.a (IJ)I
      // 3ce: iand
      // 3cf: ior
      // 3d0: i2b
      // 3d1: bastore
      // 3d2: goto 3d9
      // 3d5: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d8: athrow
      // 3d9: iload 4
      // 3db: ifne 060
      // 3de: iload 6
      // 3e0: ireturn
   }

   /** @deprecated */
   public static int U(byte[] param0, int param1, int param2, char[] param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 1
      // 001: iload 2
      // 002: iadd
      // 003: istore 5
      // 005: invokestatic com/finalshell/core/Ph2.w ()I
      // 008: bipush 0
      // 009: istore 6
      // 00b: istore 4
      // 00d: iload 2
      // 00e: aload 3
      // 00f: arraylength
      // 010: invokestatic java/lang/Math.min (II)I
      // 013: istore 7
      // 015: iload 6
      // 017: iload 7
      // 019: if_icmpge 054
      // 01c: aload 0
      // 01d: iload 1
      // 01e: baload
      // 01f: iload 4
      // 021: ifeq 055
      // 024: iload 4
      // 026: ifeq 055
      // 029: goto 030
      // 02c: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02f: athrow
      // 030: iflt 054
      // 033: goto 03a
      // 036: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: aload 3
      // 03b: iload 6
      // 03d: iinc 6 1
      // 040: aload 0
      // 041: iload 1
      // 042: iinc 1 1
      // 045: baload
      // 046: i2c
      // 047: castore
      // 048: iload 4
      // 04a: ifne 015
      // 04d: goto 054
      // 050: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 053: athrow
      // 054: iload 1
      // 055: iload 5
      // 057: if_icmpge 456
      // 05a: aload 0
      // 05b: iload 1
      // 05c: iinc 1 1
      // 05f: baload
      // 060: istore 8
      // 062: iload 8
      // 064: iload 4
      // 066: ifeq 458
      // 069: iload 4
      // 06b: ifeq 0a0
      // 06e: goto 075
      // 071: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 074: athrow
      // 075: iflt 095
      // 078: goto 07f
      // 07b: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07e: athrow
      // 07f: aload 3
      // 080: iload 6
      // 082: iinc 6 1
      // 085: iload 8
      // 087: i2c
      // 088: castore
      // 089: iload 4
      // 08b: ifne 451
      // 08e: goto 095
      // 091: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 094: athrow
      // 095: iload 8
      // 097: bipush 5
      // 098: ishr
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09f: athrow
      // 0a0: sipush 25965
      // 0a3: ldc2_w 3646533113884712233
      // 0a6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0a9: iload 4
      // 0ab: ifeq 15a
      // 0ae: if_icmpne 14d
      // 0b1: goto 0b8
      // 0b4: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b7: athrow
      // 0b8: iload 8
      // 0ba: sipush 14754
      // 0bd: ldc2_w 3860449086999380304
      // 0c0: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0c3: iand
      // 0c4: iload 4
      // 0c6: ifeq 151
      // 0c9: goto 0d0
      // 0cc: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cf: athrow
      // 0d0: ifeq 14d
      // 0d3: goto 0da
      // 0d6: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d9: athrow
      // 0da: iload 1
      // 0db: iload 4
      // 0dd: ifeq 14c
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: iload 5
      // 0e9: if_icmpge 14b
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: iload 1
      // 0f5: iinc 1 1
      // 0f8: baload
      // 0f9: istore 9
      // 0fb: iload 4
      // 0fd: ifeq 146
      // 100: iload 9
      // 102: sipush 7306
      // 105: ldc2_w 7213365956915782833
      // 108: invokestatic com/finalshell/core/S7.a (IJ)I
      // 10b: iand
      // 10c: sipush 22260
      // 10f: ldc2_w 5983914093274672844
      // 112: invokestatic com/finalshell/core/S7.a (IJ)I
      // 115: if_icmpeq 125
      // 118: goto 11f
      // 11b: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11e: athrow
      // 11f: bipush -1
      // 120: ireturn
      // 121: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 124: athrow
      // 125: aload 3
      // 126: iload 6
      // 128: iinc 6 1
      // 12b: iload 8
      // 12d: sipush 18814
      // 130: ldc2_w 6897336902380433896
      // 133: invokestatic com/finalshell/core/S7.a (IJ)I
      // 136: ishl
      // 137: iload 9
      // 139: ixor
      // 13a: sipush 4904
      // 13d: ldc2_w 495501907614264048
      // 140: invokestatic com/finalshell/core/S7.a (IJ)I
      // 143: ixor
      // 144: i2c
      // 145: castore
      // 146: iload 4
      // 148: ifne 054
      // 14b: bipush -1
      // 14c: ireturn
      // 14d: iload 8
      // 14f: bipush 4
      // 150: ishr
      // 151: sipush 29409
      // 154: ldc2_w 8388682208248334911
      // 157: invokestatic com/finalshell/core/S7.a (IJ)I
      // 15a: iload 4
      // 15c: ifeq 2dc
      // 15f: if_icmpne 2c3
      // 162: goto 169
      // 165: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 168: athrow
      // 169: iload 1
      // 16a: bipush 1
      // 16b: iadd
      // 16c: iload 4
      // 16e: ifeq 2c2
      // 171: goto 178
      // 174: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 177: athrow
      // 178: iload 5
      // 17a: if_icmpge 2c1
      // 17d: goto 184
      // 180: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 183: athrow
      // 184: aload 0
      // 185: iload 1
      // 186: iinc 1 1
      // 189: baload
      // 18a: istore 9
      // 18c: aload 0
      // 18d: iload 1
      // 18e: iinc 1 1
      // 191: baload
      // 192: istore 10
      // 194: iload 8
      // 196: sipush 247
      // 199: ldc2_w 2271371776906983613
      // 19c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 19f: iload 4
      // 1a1: ifeq 201
      // 1a4: if_icmpne 1d9
      // 1a7: goto 1ae
      // 1aa: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ad: athrow
      // 1ae: iload 9
      // 1b0: sipush 26731
      // 1b3: ldc2_w 6476609445877780578
      // 1b6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1b9: iand
      // 1ba: iload 4
      // 1bc: ifeq 230
      // 1bf: goto 1c6
      // 1c2: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c5: athrow
      // 1c6: sipush 7048
      // 1c9: ldc2_w 1920671161994470306
      // 1cc: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1cf: if_icmpeq 22f
      // 1d2: goto 1d9
      // 1d5: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d8: athrow
      // 1d9: iload 9
      // 1db: sipush 31998
      // 1de: ldc2_w 5231802193664902346
      // 1e1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1e4: iand
      // 1e5: iload 4
      // 1e7: ifeq 230
      // 1ea: goto 1f1
      // 1ed: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f0: athrow
      // 1f1: sipush 7048
      // 1f4: ldc2_w 1920671161994470306
      // 1f7: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1fa: goto 201
      // 1fd: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 200: athrow
      // 201: if_icmpne 22f
      // 204: iload 10
      // 206: sipush 31998
      // 209: ldc2_w 5231802193664902346
      // 20c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 20f: iand
      // 210: sipush 7048
      // 213: ldc2_w 1920671161994470306
      // 216: invokestatic com/finalshell/core/S7.a (IJ)I
      // 219: iload 4
      // 21b: ifeq 256
      // 21e: goto 225
      // 221: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 224: athrow
      // 225: if_icmpeq 231
      // 228: goto 22f
      // 22b: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22e: athrow
      // 22f: bipush -1
      // 230: ireturn
      // 231: iload 8
      // 233: sipush 16960
      // 236: ldc2_w 5108268302475246306
      // 239: invokestatic com/finalshell/core/S7.a (IJ)I
      // 23c: ishl
      // 23d: iload 9
      // 23f: sipush 17642
      // 242: ldc2_w 3973525135493741602
      // 245: invokestatic com/finalshell/core/S7.a (IJ)I
      // 248: ishl
      // 249: ixor
      // 24a: iload 10
      // 24c: sipush 29288
      // 24f: ldc2_w 8575046871310469852
      // 252: invokestatic com/finalshell/core/S7.a (IJ)I
      // 255: ixor
      // 256: ixor
      // 257: i2c
      // 258: istore 11
      // 25a: iload 11
      // 25c: sipush 20662
      // 25f: ldc2_w 4890151448308230363
      // 262: invokestatic com/finalshell/core/S7.a (IJ)I
      // 265: iload 4
      // 267: ifeq 292
      // 26a: if_icmplt 299
      // 26d: goto 274
      // 270: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 273: athrow
      // 274: iload 11
      // 276: iload 4
      // 278: ifeq 296
      // 27b: goto 282
      // 27e: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 281: athrow
      // 282: sipush 3337
      // 285: ldc2_w 5851986801879250269
      // 288: invokestatic com/finalshell/core/S7.a (IJ)I
      // 28b: goto 292
      // 28e: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 291: athrow
      // 292: if_icmpge 299
      // 295: bipush 1
      // 296: goto 29a
      // 299: bipush 0
      // 29a: istore 12
      // 29c: iload 4
      // 29e: ifeq 2bc
      // 2a1: iload 12
      // 2a3: ifeq 2b3
      // 2a6: goto 2ad
      // 2a9: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ac: athrow
      // 2ad: bipush -1
      // 2ae: ireturn
      // 2af: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b2: athrow
      // 2b3: aload 3
      // 2b4: iload 6
      // 2b6: iinc 6 1
      // 2b9: iload 11
      // 2bb: castore
      // 2bc: iload 4
      // 2be: ifne 054
      // 2c1: bipush -1
      // 2c2: ireturn
      // 2c3: iload 8
      // 2c5: bipush 3
      // 2c6: ishr
      // 2c7: iload 4
      // 2c9: ifeq 450
      // 2cc: sipush 29409
      // 2cf: ldc2_w 8388682208248334911
      // 2d2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2d5: goto 2dc
      // 2d8: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2db: athrow
      // 2dc: if_icmpne 44f
      // 2df: iload 1
      // 2e0: bipush 2
      // 2e1: iadd
      // 2e2: iload 4
      // 2e4: ifeq 44e
      // 2e7: goto 2ee
      // 2ea: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ed: athrow
      // 2ee: iload 5
      // 2f0: if_icmpge 44d
      // 2f3: goto 2fa
      // 2f6: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f9: athrow
      // 2fa: aload 0
      // 2fb: iload 1
      // 2fc: iinc 1 1
      // 2ff: baload
      // 300: istore 9
      // 302: aload 0
      // 303: iload 1
      // 304: iinc 1 1
      // 307: baload
      // 308: istore 10
      // 30a: aload 0
      // 30b: iload 1
      // 30c: iinc 1 1
      // 30f: baload
      // 310: istore 11
      // 312: iload 8
      // 314: sipush 4051
      // 317: ldc2_w 5761074013237442459
      // 31a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 31d: ishl
      // 31e: iload 9
      // 320: sipush 215
      // 323: ldc2_w 8160882664965077241
      // 326: invokestatic com/finalshell/core/S7.a (IJ)I
      // 329: ishl
      // 32a: ixor
      // 32b: iload 10
      // 32d: sipush 17642
      // 330: ldc2_w 3973525135493741602
      // 333: invokestatic com/finalshell/core/S7.a (IJ)I
      // 336: ishl
      // 337: ixor
      // 338: iload 11
      // 33a: sipush 21918
      // 33d: ldc2_w 5202814070051450287
      // 340: invokestatic com/finalshell/core/S7.a (IJ)I
      // 343: ixor
      // 344: ixor
      // 345: istore 12
      // 347: iload 9
      // 349: sipush 31998
      // 34c: ldc2_w 5231802193664902346
      // 34f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 352: iand
      // 353: iload 4
      // 355: ifeq 40b
      // 358: sipush 7048
      // 35b: ldc2_w 1920671161994470306
      // 35e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 361: if_icmpne 403
      // 364: goto 36b
      // 367: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36a: athrow
      // 36b: iload 10
      // 36d: sipush 31998
      // 370: ldc2_w 5231802193664902346
      // 373: invokestatic com/finalshell/core/S7.a (IJ)I
      // 376: iand
      // 377: iload 4
      // 379: ifeq 40b
      // 37c: goto 383
      // 37f: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 382: athrow
      // 383: sipush 7048
      // 386: ldc2_w 1920671161994470306
      // 389: invokestatic com/finalshell/core/S7.a (IJ)I
      // 38c: if_icmpne 403
      // 38f: goto 396
      // 392: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 395: athrow
      // 396: iload 11
      // 398: sipush 31998
      // 39b: ldc2_w 5231802193664902346
      // 39e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 3a1: iand
      // 3a2: iload 4
      // 3a4: ifeq 40b
      // 3a7: goto 3ae
      // 3aa: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ad: athrow
      // 3ae: sipush 7048
      // 3b1: ldc2_w 1920671161994470306
      // 3b4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 3b7: if_icmpne 403
      // 3ba: goto 3c1
      // 3bd: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c0: athrow
      // 3c1: iload 12
      // 3c3: iload 4
      // 3c5: ifeq 40b
      // 3c8: goto 3cf
      // 3cb: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ce: athrow
      // 3cf: sipush 842
      // 3d2: ldc2_w 2582728952370527063
      // 3d5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 3d8: if_icmplt 403
      // 3db: goto 3e2
      // 3de: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e1: athrow
      // 3e2: iload 12
      // 3e4: iload 4
      // 3e6: ifeq 40b
      // 3e9: goto 3f0
      // 3ec: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ef: athrow
      // 3f0: sipush 22960
      // 3f3: ldc2_w 2735846473978945940
      // 3f6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 3f9: if_icmplt 40c
      // 3fc: goto 403
      // 3ff: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 402: athrow
      // 403: bipush -1
      // 404: goto 40b
      // 407: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40a: athrow
      // 40b: ireturn
      // 40c: aload 3
      // 40d: iload 6
      // 40f: iinc 6 1
      // 412: iload 12
      // 414: sipush 1447
      // 417: ldc2_w 4274875129024839048
      // 41a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 41d: iushr
      // 41e: sipush 6142
      // 421: ldc2_w 7541178593825026007
      // 424: invokestatic com/finalshell/core/S7.a (IJ)I
      // 427: iadd
      // 428: i2c
      // 429: castore
      // 42a: aload 3
      // 42b: iload 6
      // 42d: iinc 6 1
      // 430: iload 12
      // 432: sipush 13448
      // 435: ldc2_w 1166146174184180914
      // 438: invokestatic com/finalshell/core/S7.a (IJ)I
      // 43b: iand
      // 43c: sipush 21429
      // 43f: ldc2_w 30915347489729313
      // 442: invokestatic com/finalshell/core/S7.a (IJ)I
      // 445: iadd
      // 446: i2c
      // 447: castore
      // 448: iload 4
      // 44a: ifne 054
      // 44d: bipush -1
      // 44e: ireturn
      // 44f: bipush -1
      // 450: ireturn
      // 451: iload 4
      // 453: ifne 054
      // 456: iload 6
      // 458: ireturn
   }

   /** @deprecated */
   public static String G(Reader param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: new java/lang/StringBuilder
      // 06: dup
      // 07: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a: astore 2
      // 0b: istore 1
      // 0c: sipush 312
      // 0f: ldc2_w 1103220296849914303
      // 12: invokestatic com/finalshell/core/S7.a (IJ)I
      // 15: newarray 5
      // 17: astore 3
      // 18: aload 0
      // 19: aload 3
      // 1a: bipush 0
      // 1b: aload 3
      // 1c: arraylength
      // 1d: invokevirtual java/io/Reader.read ([CII)I
      // 20: istore 4
      // 22: iload 4
      // 24: ifge 36
      // 27: iload 1
      // 28: ifeq 46
      // 2b: iload 1
      // 2c: ifne 4a
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: aload 2
      // 37: aload 3
      // 38: bipush 0
      // 39: iload 4
      // 3b: invokevirtual java/lang/StringBuilder.append ([CII)Ljava/lang/StringBuilder;
      // 3e: pop
      // 3f: goto 46
      // 42: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: iload 1
      // 47: ifne 18
      // 4a: goto 60
      // 4d: astore 3
      // 4e: new com/finalshell/core/Hi2
      // 51: dup
      // 52: sipush 16339
      // 55: sipush -27317
      // 58: invokestatic com/finalshell/core/S7.a (II)Ljava/lang/String;
      // 5b: aload 3
      // 5c: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 5f: athrow
      // 60: aload 2
      // 61: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 64: areturn
   }

   public static boolean g(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 14
      // 09: ifnull 25
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/lang/String.length ()I
      // 17: iload 1
      // 18: ifne 2c
      // 1b: ifne 2b
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: bipush 0
      // 26: ireturn
      // 27: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: bipush 0
      // 2c: istore 2
      // 2d: aload 0
      // 2e: invokevirtual java/lang/String.length ()I
      // 31: istore 3
      // 32: iload 2
      // 33: iload 3
      // 34: if_icmpge 85
      // 37: aload 0
      // 38: iload 2
      // 39: invokevirtual java/lang/String.charAt (I)C
      // 3c: istore 4
      // 3e: iload 1
      // 3f: ifne 81
      // 42: iload 4
      // 44: iload 1
      // 45: ifne 86
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: sipush 31969
      // 52: ldc2_w 6775301332646561012
      // 55: invokestatic com/finalshell/core/S7.a (IJ)I
      // 58: if_icmpeq 7e
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61: athrow
      // 62: iload 4
      // 64: invokestatic com/finalshell/core/S7.h (C)Z
      // 67: iload 1
      // 68: ifne 7d
      // 6b: goto 72
      // 6e: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: ifne 7e
      // 75: goto 7c
      // 78: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7b: athrow
      // 7c: bipush 0
      // 7d: ireturn
      // 7e: iinc 2 1
      // 81: iload 1
      // 82: ifeq 32
      // 85: bipush 1
      // 86: ireturn
   }

   static {
      __vfClinit__();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 16339) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 56;
               break;
            case 1:
               var10000 = 133;
               break;
            case 2:
               var10000 = 110;
               break;
            case 3:
               var10000 = 233;
               break;
            case 4:
               var10000 = 124;
               break;
            case 5:
               var10000 = 30;
               break;
            case 6:
               var10000 = 187;
               break;
            case 7:
               var10000 = 194;
               break;
            case 8:
               var10000 = 98;
               break;
            case 9:
               var10000 = 148;
               break;
            case 10:
               var10000 = 193;
               break;
            case 11:
               var10000 = 246;
               break;
            case 12:
               var10000 = 232;
               break;
            case 13:
               var10000 = 163;
               break;
            case 14:
               var10000 = 207;
               break;
            case 15:
               var10000 = 122;
               break;
            case 16:
               var10000 = 102;
               break;
            case 17:
               var10000 = 18;
               break;
            case 18:
               var10000 = 85;
               break;
            case 19:
               var10000 = 131;
               break;
            case 20:
               var10000 = 52;
               break;
            case 21:
               var10000 = 60;
               break;
            case 22:
               var10000 = 200;
               break;
            case 23:
               var10000 = 96;
               break;
            case 24:
               var10000 = 230;
               break;
            case 25:
               var10000 = 72;
               break;
            case 26:
               var10000 = 95;
               break;
            case 27:
               var10000 = 35;
               break;
            case 28:
               var10000 = 82;
               break;
            case 29:
               var10000 = 77;
               break;
            case 30:
               var10000 = 198;
               break;
            case 31:
               var10000 = 103;
               break;
            case 32:
               var10000 = 64;
               break;
            case 33:
               var10000 = 239;
               break;
            case 34:
               var10000 = 142;
               break;
            case 35:
               var10000 = 66;
               break;
            case 36:
               var10000 = 191;
               break;
            case 37:
               var10000 = 99;
               break;
            case 38:
               var10000 = 156;
               break;
            case 39:
               var10000 = 185;
               break;
            case 40:
               var10000 = 104;
               break;
            case 41:
               var10000 = 19;
               break;
            case 42:
               var10000 = 228;
               break;
            case 43:
               var10000 = 1;
               break;
            case 44:
               var10000 = 237;
               break;
            case 45:
               var10000 = 166;
               break;
            case 46:
               var10000 = 219;
               break;
            case 47:
               var10000 = 87;
               break;
            case 48:
               var10000 = 149;
               break;
            case 49:
               var10000 = 235;
               break;
            case 50:
               var10000 = 58;
               break;
            case 51:
               var10000 = 40;
               break;
            case 52:
               var10000 = 217;
               break;
            case 53:
               var10000 = 3;
               break;
            case 54:
               var10000 = 243;
               break;
            case 55:
               var10000 = 144;
               break;
            case 56:
               var10000 = 201;
               break;
            case 57:
               var10000 = 89;
               break;
            case 58:
               var10000 = 184;
               break;
            case 59:
               var10000 = 158;
               break;
            case 60:
               var10000 = 17;
               break;
            case 61:
               var10000 = 69;
               break;
            case 62:
               var10000 = 162;
               break;
            case 63:
               var10000 = 68;
               break;
            case 64:
               var10000 = 91;
               break;
            case 65:
               var10000 = 140;
               break;
            case 66:
               var10000 = 223;
               break;
            case 67:
               var10000 = 42;
               break;
            case 68:
               var10000 = 16;
               break;
            case 69:
               var10000 = 100;
               break;
            case 70:
               var10000 = 32;
               break;
            case 71:
               var10000 = 49;
               break;
            case 72:
               var10000 = 224;
               break;
            case 73:
               var10000 = 253;
               break;
            case 74:
               var10000 = 54;
               break;
            case 75:
               var10000 = 220;
               break;
            case 76:
               var10000 = 175;
               break;
            case 77:
               var10000 = 29;
               break;
            case 78:
               var10000 = 13;
               break;
            case 79:
               var10000 = 152;
               break;
            case 80:
               var10000 = 164;
               break;
            case 81:
               var10000 = 88;
               break;
            case 82:
               var10000 = 168;
               break;
            case 83:
               var10000 = 218;
               break;
            case 84:
               var10000 = 174;
               break;
            case 85:
               var10000 = 2;
               break;
            case 86:
               var10000 = 157;
               break;
            case 87:
               var10000 = 24;
               break;
            case 88:
               var10000 = 120;
               break;
            case 89:
               var10000 = 206;
               break;
            case 90:
               var10000 = 249;
               break;
            case 91:
               var10000 = 177;
               break;
            case 92:
               var10000 = 28;
               break;
            case 93:
               var10000 = 153;
               break;
            case 94:
               var10000 = 61;
               break;
            case 95:
               var10000 = 254;
               break;
            case 96:
               var10000 = 21;
               break;
            case 97:
               var10000 = 234;
               break;
            case 98:
               var10000 = 180;
               break;
            case 99:
               var10000 = 117;
               break;
            case 100:
               var10000 = 116;
               break;
            case 101:
               var10000 = 27;
               break;
            case 102:
               var10000 = 43;
               break;
            case 103:
               var10000 = 31;
               break;
            case 104:
               var10000 = 242;
               break;
            case 105:
               var10000 = 236;
               break;
            case 106:
               var10000 = 130;
               break;
            case 107:
               var10000 = 186;
               break;
            case 108:
               var10000 = 192;
               break;
            case 109:
               var10000 = 128;
               break;
            case 110:
               var10000 = 108;
               break;
            case 111:
               var10000 = 78;
               break;
            case 112:
               var10000 = 216;
               break;
            case 113:
               var10000 = 121;
               break;
            case 114:
               var10000 = 20;
               break;
            case 115:
               var10000 = 47;
               break;
            case 116:
               var10000 = 183;
               break;
            case 117:
               var10000 = 188;
               break;
            case 118:
               var10000 = 41;
               break;
            case 119:
               var10000 = 90;
               break;
            case 120:
               var10000 = 173;
               break;
            case 121:
               var10000 = 167;
               break;
            case 122:
               var10000 = 202;
               break;
            case 123:
               var10000 = 9;
               break;
            case 124:
               var10000 = 172;
               break;
            case 125:
               var10000 = 213;
               break;
            case 126:
               var10000 = 106;
               break;
            case 127:
               var10000 = 203;
               break;
            case 128:
               var10000 = 179;
               break;
            case 129:
               var10000 = 226;
               break;
            case 130:
               var10000 = 14;
               break;
            case 131:
               var10000 = 6;
               break;
            case 132:
               var10000 = 129;
               break;
            case 133:
               var10000 = 154;
               break;
            case 134:
               var10000 = 48;
               break;
            case 135:
               var10000 = 70;
               break;
            case 136:
               var10000 = 0;
               break;
            case 137:
               var10000 = 59;
               break;
            case 138:
               var10000 = 134;
               break;
            case 139:
               var10000 = 75;
               break;
            case 140:
               var10000 = 147;
               break;
            case 141:
               var10000 = 189;
               break;
            case 142:
               var10000 = 97;
               break;
            case 143:
               var10000 = 94;
               break;
            case 144:
               var10000 = 67;
               break;
            case 145:
               var10000 = 170;
               break;
            case 146:
               var10000 = 74;
               break;
            case 147:
               var10000 = 53;
               break;
            case 148:
               var10000 = 25;
               break;
            case 149:
               var10000 = 255;
               break;
            case 150:
               var10000 = 4;
               break;
            case 151:
               var10000 = 212;
               break;
            case 152:
               var10000 = 15;
               break;
            case 153:
               var10000 = 197;
               break;
            case 154:
               var10000 = 26;
               break;
            case 155:
               var10000 = 240;
               break;
            case 156:
               var10000 = 113;
               break;
            case 157:
               var10000 = 161;
               break;
            case 158:
               var10000 = 119;
               break;
            case 159:
               var10000 = 231;
               break;
            case 160:
               var10000 = 238;
               break;
            case 161:
               var10000 = 199;
               break;
            case 162:
               var10000 = 93;
               break;
            case 163:
               var10000 = 182;
               break;
            case 164:
               var10000 = 45;
               break;
            case 165:
               var10000 = 143;
               break;
            case 166:
               var10000 = 39;
               break;
            case 167:
               var10000 = 209;
               break;
            case 168:
               var10000 = 76;
               break;
            case 169:
               var10000 = 225;
               break;
            case 170:
               var10000 = 178;
               break;
            case 171:
               var10000 = 111;
               break;
            case 172:
               var10000 = 51;
               break;
            case 173:
               var10000 = 44;
               break;
            case 174:
               var10000 = 123;
               break;
            case 175:
               var10000 = 244;
               break;
            case 176:
               var10000 = 222;
               break;
            case 177:
               var10000 = 127;
               break;
            case 178:
               var10000 = 205;
               break;
            case 179:
               var10000 = 241;
               break;
            case 180:
               var10000 = 105;
               break;
            case 181:
               var10000 = 221;
               break;
            case 182:
               var10000 = 169;
               break;
            case 183:
               var10000 = 245;
               break;
            case 184:
               var10000 = 83;
               break;
            case 185:
               var10000 = 118;
               break;
            case 186:
               var10000 = 215;
               break;
            case 187:
               var10000 = 181;
               break;
            case 188:
               var10000 = 171;
               break;
            case 189:
               var10000 = 135;
               break;
            case 190:
               var10000 = 214;
               break;
            case 191:
               var10000 = 23;
               break;
            case 192:
               var10000 = 34;
               break;
            case 193:
               var10000 = 7;
               break;
            case 194:
               var10000 = 190;
               break;
            case 195:
               var10000 = 38;
               break;
            case 196:
               var10000 = 227;
               break;
            case 197:
               var10000 = 136;
               break;
            case 198:
               var10000 = 138;
               break;
            case 199:
               var10000 = 62;
               break;
            case 200:
               var10000 = 55;
               break;
            case 201:
               var10000 = 204;
               break;
            case 202:
               var10000 = 248;
               break;
            case 203:
               var10000 = 250;
               break;
            case 204:
               var10000 = 46;
               break;
            case 205:
               var10000 = 251;
               break;
            case 206:
               var10000 = 50;
               break;
            case 207:
               var10000 = 132;
               break;
            case 208:
               var10000 = 92;
               break;
            case 209:
               var10000 = 211;
               break;
            case 210:
               var10000 = 33;
               break;
            case 211:
               var10000 = 229;
               break;
            case 212:
               var10000 = 126;
               break;
            case 213:
               var10000 = 252;
               break;
            case 214:
               var10000 = 79;
               break;
            case 215:
               var10000 = 137;
               break;
            case 216:
               var10000 = 65;
               break;
            case 217:
               var10000 = 57;
               break;
            case 218:
               var10000 = 109;
               break;
            case 219:
               var10000 = 86;
               break;
            case 220:
               var10000 = 150;
               break;
            case 221:
               var10000 = 101;
               break;
            case 222:
               var10000 = 12;
               break;
            case 223:
               var10000 = 151;
               break;
            case 224:
               var10000 = 146;
               break;
            case 225:
               var10000 = 176;
               break;
            case 226:
               var10000 = 5;
               break;
            case 227:
               var10000 = 112;
               break;
            case 228:
               var10000 = 165;
               break;
            case 229:
               var10000 = 196;
               break;
            case 230:
               var10000 = 36;
               break;
            case 231:
               var10000 = 155;
               break;
            case 232:
               var10000 = 145;
               break;
            case 233:
               var10000 = 81;
               break;
            case 234:
               var10000 = 37;
               break;
            case 235:
               var10000 = 141;
               break;
            case 236:
               var10000 = 8;
               break;
            case 237:
               var10000 = 84;
               break;
            case 238:
               var10000 = 160;
               break;
            case 239:
               var10000 = 208;
               break;
            case 240:
               var10000 = 107;
               break;
            case 241:
               var10000 = 73;
               break;
            case 242:
               var10000 = 80;
               break;
            case 243:
               var10000 = 159;
               break;
            case 244:
               var10000 = 139;
               break;
            case 245:
               var10000 = 10;
               break;
            case 246:
               var10000 = 195;
               break;
            case 247:
               var10000 = 22;
               break;
            case 248:
               var10000 = 125;
               break;
            case 249:
               var10000 = 247;
               break;
            case 250:
               var10000 = 71;
               break;
            case 251:
               var10000 = 11;
               break;
            case 252:
               var10000 = 115;
               break;
            case 253:
               var10000 = 63;
               break;
            case 254:
               var10000 = 114;
               break;
            default:
               var10000 = 210;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30938;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 29629) & 32767;
      if (h[var3] == null) {
         h[var3] = g[var3] ^ var1;
      }

      return h[var3];
   }

   public static void __vfClinit__() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 0000: bipush 4
      // 0001: anewarray 225
      // 0004: astore 21
      // 0006: bipush 0
      // 0007: istore 19
      // 0009: ldc_w "8Ôø\u008aÄöñM\u0015Y<\u001eV¬ó|~\u00808q\u0093úP\u0014îbZ&ù@:TÏy!\u0099·\t¨\u0088\u0083è#¯3\u009a3æø¬JáYZrôaÔþh\u0017>ú9\u0084Ô\u0007s6WU\u0000¥´:c\u0099Ü¦§\u008c[JÙq&\u0092\u001ct\u009að\u00873="
      // 000c: dup
      // 000d: astore 18
      // 000f: invokevirtual java/lang/String.length ()I
      // 0012: istore 20
      // 0014: bipush 29
      // 0016: istore 17
      // 0018: bipush -1
      // 0019: istore 16
      // 001b: bipush 75
      // 001d: iinc 16 1
      // 0020: aload 18
      // 0022: iload 16
      // 0024: dup
      // 0025: iload 17
      // 0027: iadd
      // 0028: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 002b: bipush -1
      // 002c: goto 00a9
      // 002f: aload 21
      // 0031: swap
      // 0032: iload 19
      // 0034: iinc 19 1
      // 0037: swap
      // 0038: aastore
      // 0039: iload 16
      // 003b: iload 17
      // 003d: iadd
      // 003e: dup
      // 003f: istore 16
      // 0041: iload 20
      // 0043: if_icmpge 0052
      // 0046: aload 18
      // 0048: iload 16
      // 004a: invokevirtual java/lang/String.charAt (I)C
      // 004d: istore 17
      // 004f: goto 001b
      // 0052: ldc_w "\u0088Ã\u0006:Ì\u0013®îÆ®è¾i¬?P±xªl\u001ej#RÂ"
      // 0055: dup
      // 0056: astore 18
      // 0058: invokevirtual java/lang/String.length ()I
      // 005b: istore 20
      // 005d: bipush 5
      // 005e: istore 17
      // 0060: bipush -1
      // 0061: istore 16
      // 0063: bipush 98
      // 0065: iinc 16 1
      // 0068: aload 18
      // 006a: iload 16
      // 006c: dup
      // 006d: iload 17
      // 006f: iadd
      // 0070: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0073: bipush 0
      // 0074: goto 00a9
      // 0077: aload 21
      // 0079: swap
      // 007a: iload 19
      // 007c: iinc 19 1
      // 007f: swap
      // 0080: aastore
      // 0081: iload 16
      // 0083: iload 17
      // 0085: iadd
      // 0086: dup
      // 0087: istore 16
      // 0089: iload 20
      // 008b: if_icmpge 009a
      // 008e: aload 18
      // 0090: iload 16
      // 0092: invokevirtual java/lang/String.charAt (I)C
      // 0095: istore 17
      // 0097: goto 0063
      // 009a: aload 21
      // 009c: putstatic com/finalshell/core/S7.a [Ljava/lang/String;
      // 009f: bipush 4
      // 00a0: anewarray 225
      // 00a3: putstatic com/finalshell/core/S7.c [Ljava/lang/String;
      // 00a6: goto 0148
      // 00a9: dup_x2
      // 00aa: pop
      // 00ab: invokevirtual java/lang/String.toCharArray ()[C
      // 00ae: dup_x1
      // 00af: arraylength
      // 00b0: dup_x2
      // 00b1: pop
      // 00b2: bipush 0
      // 00b3: istore 22
      // 00b5: dup2_x1
      // 00b6: pop2
      // 00b7: dup_x2
      // 00b8: bipush 1
      // 00b9: if_icmpgt 0120
      // 00bc: dup2
      // 00bd: swap
      // 00be: iload 22
      // 00c0: dup2_x1
      // 00c1: caload
      // 00c2: swap
      // 00c3: iload 22
      // 00c5: bipush 7
      // 00c7: irem
      // 00c8: tableswitch 70 0 5 40 45 50 55 60 65
      // 00f0: bipush 125
      // 00f2: goto 0110
      // 00f5: bipush 60
      // 00f7: goto 0110
      // 00fa: bipush 47
      // 00fc: goto 0110
      // 00ff: bipush 24
      // 0101: goto 0110
      // 0104: bipush 113
      // 0106: goto 0110
      // 0109: bipush 29
      // 010b: goto 0110
      // 010e: bipush 53
      // 0110: ixor
      // 0111: ixor
      // 0112: i2c
      // 0113: castore
      // 0114: iinc 22 1
      // 0117: dup
      // 0118: ifne 0120
      // 011b: dup2
      // 011c: dup_x1
      // 011d: goto 00c0
      // 0120: dup2_x1
      // 0121: pop2
      // 0122: dup_x2
      // 0123: iload 22
      // 0125: if_icmpgt 00bc
      // 0128: pop
      // 0129: new java/lang/String
      // 012c: dup_x1
      // 012d: swap
      // 012e: invokespecial java/lang/String.<init> ([C)V
      // 0131: invokevirtual java/lang/String.intern ()Ljava/lang/String;
      // 0134: swap
      // 0135: pop
      // 0136: swap
      // 0137: tableswitch -264 0 0 -192
      // 0148: ldc2_w 3434643660526438380
      // 014b: lstore 8
      // 014d: sipush 263
      // 0150: newarray 11
      // 0152: astore 14
      // 0154: bipush 0
      // 0155: istore 11
      // 0157: ldc_w "\u0017k¦ \u0086³\u0098ï\u0012¤\u0092Â\u0086Ì¸ æ\u0006\u0013ä\u001a\u0088\u009aK\u0099\n8ßÁ\u0012\u0082v\u0097£\u0097>8\u000e2-ê¡\u008f\u001b¤\u000eµ\u0015óØÃNE\u0088\u0013;ù¯9\u0099O\u00887æ_'Q\u0081>\u009aÂ,ÿÏ\u0013\u001dàw\u001eX5\u0017$\u009cm·Í/\u0019ã¯ï¬½g\u009e8m»à\u008d(R\u0010½ÝO\u001dA´m\u001bÞkfe\u0094ÀsjËÜJ\u008e\u001b\u0080>ùAO²Y¸Þ4QºÐ?Ï¹8Kµ,l\u001d\u0099ì\u0089{ÈDÕpÅ\u008dUàØ|\u0080/éìç\u000b*®\u0099>@ô\u0018\u0091½+ÀÏ\u0082\u008câI\bð÷Óóü¶\u001dU1Ã³¯û¤\u0081¿©Rå3¥²\u0005\u0001i\u0092\\¬+ñýø[Ì_j×¬öÃ¾\nû>P\u008a9.¡C3J\u009c±\u001e|õø\fÔÍk: \u0005Ú\\ÂI\u0088ËµCù\u0006\u008d\u0090Jý\u0084£]pÇ¿\u0081mQÚÁ\u0088õº\rô»*ãÒ\u0098\u0087ìSô¼ªÌ\u008b?â\u0010¼u\u008b\u000e\u0013\u00ad+\u0012°\u0005\u009cßþN\u009eåÛtÍ:ï\u001cJ\u009c`Ø±Éµ\u008b\u00ad\u0086¢iëøµ¸\u009c4ÙZj`ù\u0003\r\u0017pÜçà\u001bZ:Z\\\u009f\u007f¾\u009c±ý±]z×_Ø4p#Æ\t·f¶ÊQxS@\u008b\u0090Ý/\u0004\u0097YCä\tÒ<s\u0013S\t5\u0007i=õ\u000f~=Â\u0013Ñõ\u0004ñ\u0089hËe\u001b3\u0010yÕ\u008bÅÞÁÙaö!s°eP\\\fFÄÜhìà\u009bø/\u008d*ì¾¬·\u001aé®dä3É·'ÔÞ\u001a»$CYië\u001d©@ìJÌ\u0091oþhÉÈ0L:Wkv\u0017OêÁ\u0080\u001cK/wÇ¼\u0000`Ê\u0085ë±§räæ¶\u009e\u0083'\u0090¿\u0012§ñ?vó\bÝRú2´,\u0097â\u0080L\u008bÄå)\"¾¯(Ú\u0004\u00924,o.Ü\\\u0018\u0081\u001c\u001cYg\u0092õ\u0010!\u001cµIÚêub¿\u0094æ]¥\b\u008cwb×\u0091æ\u0000\u008fÊ³ÊÉÉj\bÌÔÁ\u0094¸\u0080'ØÃs´Í<äb\b´5ù¿>d\n\u009eLôys´a´PI-ö\u0002\u009e\u0085\u0006E\u0091©SÞ»ÓM1r\u0082°ÍI\u001c-v\u008d®P;íy\u001cÖ+3ð~@:ýdï¬ÿ\u0091CMfò²\u0010µmÜ\u0080µÈ)©mõ\u0088@\u008fÕð<lò\u009do\t;\\¶s\u000ere´v/nû\\\u0017WN¾\u0011JbÀã\n'&Ã7\u001a\u008e5Ú\u008c\u0004¥\u0006ßÃé\u009a\"HD,Äñõêæ__´\u0095.QÝUêW¹éÌî§ydý\u0004¶S/\u001f\u0007G¨\ræ\u0089 \u001cÐ\u0000Ipzc\u0001\u00900Q¤N\u001a\u0014\b\u007fJvKs\u0089`lS\u000fG\r«`\u0082Øé¾æª1Kìút}¾\u0013éä\u0081lAý¹Xi\u0016PÀ®/ëÝz\u0005ªdÚç\u008eÎ±\u008d,y\u0013îK7@5!îÎyU¾cå\u008c\u0019\u0089\u009e\u0097½]@>\u008f\u008az´d;/IãÌ¤>\u009aN6D\u0082Ñ¹²Qkf:çø\u0084T¤\u008eÒ°<ç\u009c\u0084«x¦8\u001aÆ_ã\u0098©\u000bEÖÙ:,=|ëZ%ÇÿÄÞ»Ðð\u0018ªþzíÔÜÆï£Xý\u00986åmy\u0086ÍÐM\u0011\u0010zæ<Ð\u0014ùàÁÅ\u0019ÊYú+\u0092ÂwÄ1·\u0099áÕ}\u0002oÂ_ûõ\u0018Ê#÷\u0012#+yÌ\\À£B¥V*éLµ\u001b}IÒ®\")B´Ú\u0099\u001f\u0080sÍmÍ¼\u000e'DÖ\u0097vÏP\u0018\u001c+Zf\u0097\u0092xO*\u0084\u0093z\u0082$+sv\u0019Y?U|^Åi\u001a¢(B\u0017óy\u000f«¶-¤\u0084nEÈ\u0091Ýs\u0010¹¡lçÑÒð#¿\u0085ÇÖÒ\u0087Ð\u0080vÕ\u0003\u00ad\u0003\\O*.\u00870\u0084\u0090èÌá$³ \u0086-\u001c\u0007B9\u0093iÓ*a\u0019¬7'p\u00ad\u0088Àáþ\u0094ÜØ£Ú]©üÖn²@\u0007\u0011Wir\u0084\u0000:\u008fðR±y¨\u0012VÚÁXF\u0086¬yÕ\u0007%@±eÚví\u0002\u0098*\u0099¼$O\u00ad\u0090y°en\u009f\u009ep\u000b³ä\u0084¨_,ßûõ\u0003Xpãh×\b6[\u0080¶\u0090-Áê7µ¦ûc®Ç&\u0096n\u009a\u0086\f\u0096K\u009b¬óÂ\u0010ì¥Ê\u0085û\u0015\u009c\tl(_çiLï\u0004ÞnNê]\u009fê\u001e¢\u0085uP:_¯?ÛÄ\u0007ÂºßVã\u0097ÔÎÎ\u008a%;øöÝ\tc2¢&\u001f4,3Í-%\"Kô'ð'U\\L\u0013¨\u0014'v\u0012l\u000f©ÛWÖã\u0017\u0083\u0003\u0000 ØpÑ\u008e@º\t#\u0090Bæ@©\u0005m\u009d²ÃÎ2apÞ¨<ù;\u000ejÎ\u000f0|ð=\u0012Ý¹Üp\u0099J}ÌÕ\u0015á.\u0018Jàý_¥Ñ\u0085j\u0096  ûÈ\u0006²\u0000«9þõNç\u009d\u0087\u001c¢·p\u000e\u0092\u0016M¸Õúã\u00ad>ÎXäN\u0098K-\u0017våÜD\u009búÈîõ¦\u0083¡´)ÿ´Ý\u00adÜLù`¶K<Ùø÷ç\u000bXü\u008dy>\u000fsý\u0014¤¶6A<J×à\u0089¼PáâÃ\u001e\u0017IËì@uÿ77 \u0015\u0095d&D.÷ Ì\u001eþ\u0091íM¡Vã\u0013ì\f\u0016Å\u009529?Ï\u0080HH\u009eS\u0015\u0017/\u0095&\u0093?\u0091\u0019\u0080O®£8ÿîBB\u0095®\u0092\u0003¡\u0018Jy\u009c\u0086Ë\rÖ\u000bÔ·VÏYj\u0014&\u008aP\u0086+òîAº° 6µÚH\u0000ð}\u0005\u0085ë\u009cØ\u0019ç\"¬\u009f#\u0094BÓFé\u009coª}\u0004\u0092\u0011§¢0E\u0097æ\u0084Þ[Údn\u0091¼»áüú\u000f\u008eq-m\u0006\u0002f\u0015kà¥æ=ÚµB9*Î/H\u0094k³ÒbçµÊ?FU\u001e\u0005&3¤°¹<ÿ4 \u0081TÅ¡:m®Î\u000f\u0081\"\u001d\u0011\t\u0018Ã6ûã\u000eË 'ìVþ\u0004¯px\u001e&?@%Z\u0086B\r \u000034¦{ÉÅ×nÅKkw`9þÝ\u0005Û\u0084|Fy\u0086Á_N\u0092V£rIë\u009491tÄÄÐ\u0094¸ y§\u0091Á64Ì&\u00020R©Lq\u0006þp\u0089f\u001dò\u001e.\u0098N ?Ä3\u0017IA0Dé°w\u0018¢ì\u001eì¤\u008eTà\u009d\bâ#±M£QQ\u0082ßÛ*\u009cÊ,\u008dª\u001e\u0091gÔ\b¡\u0002StQ\u009be£\u009däÎbqÛ®é ¤ ¤\u0087\u007f\u0089\t°¤fj£ÚtÇÜÿ\u0002¸¹º\u0091A\u001füWQÏ\u0011\u001eÈ\u000bÈÿ K\u0000¢É¡¤7\u0081\u001b,5\u00adLÖ(<\u0002! {G\u0017·\u0005âÜ\u008aÉÁ\u009c\u0088\u007fÂ\u008eSõÃËt\bÝµ¿t7 wäñ\fÐÑ\u0011ÿ\u0086Ô\b\u000b8CæÐH(÷ug\u009aªà÷íùÖ½¤ÎtüÉ+\u0007\u0087\u0082ö>\u0010-ÿ\u0088¬<'{kòeÛ\u0001\u007fûÏ£4+\u0099[?\u0019\u0098;EÖç\u0014ºn~¬Ç\u009f\u009e\u0084î\\ï\u00168ð¿\u008d¡]Deê:¬\u0014\u0092p[¨1cÁ\u008f\u001d\u0003ìFR¥\u001fÞ³6¥\u0012¹7¶\u0003MÈ§¸X¬PûDÈ\u009aq\u008f\u0018«t$\u0092\u0002º«\u0001J-æxAÍON\u009ea\u0081f'°HÌä\f´[ô¸eúLÂrÕ±=\u008d©'Y¢\u009c\u0086yão©øôÀ\u001ev\u0093ß\u0007`\u000e\u0094"
      // 015a: dup
      // 015b: astore 12
      // 015d: invokevirtual java/lang/String.length ()I
      // 0160: istore 13
      // 0162: bipush 0
      // 0163: istore 10
      // 0165: aload 12
      // 0167: iload 10
      // 0169: iinc 10 8
      // 016c: iload 10
      // 016e: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0171: ldc_w "ISO-8859-1"
      // 0174: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 0177: astore 15
      // 0179: aload 14
      // 017b: iload 11
      // 017d: iinc 11 1
      // 0180: aload 15
      // 0182: bipush 0
      // 0183: baload
      // 0184: i2l
      // 0185: ldc2_w 255
      // 0188: land
      // 0189: bipush 56
      // 018b: lshl
      // 018c: aload 15
      // 018e: bipush 1
      // 018f: baload
      // 0190: i2l
      // 0191: ldc2_w 255
      // 0194: land
      // 0195: bipush 48
      // 0197: lshl
      // 0198: lor
      // 0199: aload 15
      // 019b: bipush 2
      // 019c: baload
      // 019d: i2l
      // 019e: ldc2_w 255
      // 01a1: land
      // 01a2: bipush 40
      // 01a4: lshl
      // 01a5: lor
      // 01a6: aload 15
      // 01a8: bipush 3
      // 01a9: baload
      // 01aa: i2l
      // 01ab: ldc2_w 255
      // 01ae: land
      // 01af: bipush 32
      // 01b1: lshl
      // 01b2: lor
      // 01b3: aload 15
      // 01b5: bipush 4
      // 01b6: baload
      // 01b7: i2l
      // 01b8: ldc2_w 255
      // 01bb: land
      // 01bc: bipush 24
      // 01be: lshl
      // 01bf: lor
      // 01c0: aload 15
      // 01c2: bipush 5
      // 01c3: baload
      // 01c4: i2l
      // 01c5: ldc2_w 255
      // 01c8: land
      // 01c9: bipush 16
      // 01cb: lshl
      // 01cc: lor
      // 01cd: aload 15
      // 01cf: bipush 6
      // 01d1: baload
      // 01d2: i2l
      // 01d3: ldc2_w 255
      // 01d6: land
      // 01d7: bipush 8
      // 01d9: lshl
      // 01da: lor
      // 01db: aload 15
      // 01dd: bipush 7
      // 01df: baload
      // 01e0: i2l
      // 01e1: ldc2_w 255
      // 01e4: land
      // 01e5: lor
      // 01e6: bipush -1
      // 01e7: goto 029e
      // 01ea: lastore
      // 01eb: iload 10
      // 01ed: iload 13
      // 01ef: if_icmplt 0165
      // 01f2: ldc_w "4\u009bÝVëó\u0098ÅB ð\u0081\u0087ølë"
      // 01f5: dup
      // 01f6: astore 12
      // 01f8: invokevirtual java/lang/String.length ()I
      // 01fb: istore 13
      // 01fd: bipush 0
      // 01fe: istore 10
      // 0200: aload 12
      // 0202: iload 10
      // 0204: iinc 10 8
      // 0207: iload 10
      // 0209: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 020c: ldc_w "ISO-8859-1"
      // 020f: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 0212: astore 15
      // 0214: aload 14
      // 0216: iload 11
      // 0218: iinc 11 1
      // 021b: aload 15
      // 021d: bipush 0
      // 021e: baload
      // 021f: i2l
      // 0220: ldc2_w 255
      // 0223: land
      // 0224: bipush 56
      // 0226: lshl
      // 0227: aload 15
      // 0229: bipush 1
      // 022a: baload
      // 022b: i2l
      // 022c: ldc2_w 255
      // 022f: land
      // 0230: bipush 48
      // 0232: lshl
      // 0233: lor
      // 0234: aload 15
      // 0236: bipush 2
      // 0237: baload
      // 0238: i2l
      // 0239: ldc2_w 255
      // 023c: land
      // 023d: bipush 40
      // 023f: lshl
      // 0240: lor
      // 0241: aload 15
      // 0243: bipush 3
      // 0244: baload
      // 0245: i2l
      // 0246: ldc2_w 255
      // 0249: land
      // 024a: bipush 32
      // 024c: lshl
      // 024d: lor
      // 024e: aload 15
      // 0250: bipush 4
      // 0251: baload
      // 0252: i2l
      // 0253: ldc2_w 255
      // 0256: land
      // 0257: bipush 24
      // 0259: lshl
      // 025a: lor
      // 025b: aload 15
      // 025d: bipush 5
      // 025e: baload
      // 025f: i2l
      // 0260: ldc2_w 255
      // 0263: land
      // 0264: bipush 16
      // 0266: lshl
      // 0267: lor
      // 0268: aload 15
      // 026a: bipush 6
      // 026c: baload
      // 026d: i2l
      // 026e: ldc2_w 255
      // 0271: land
      // 0272: bipush 8
      // 0274: lshl
      // 0275: lor
      // 0276: aload 15
      // 0278: bipush 7
      // 027a: baload
      // 027b: i2l
      // 027c: ldc2_w 255
      // 027f: land
      // 0280: lor
      // 0281: bipush 0
      // 0282: goto 029e
      // 0285: lastore
      // 0286: iload 10
      // 0288: iload 13
      // 028a: if_icmplt 0200
      // 028d: aload 14
      // 028f: putstatic com/finalshell/core/S7.d [J
      // 0292: sipush 263
      // 0295: anewarray 362
      // 0298: putstatic com/finalshell/core/S7.e [Ljava/lang/Integer;
      // 029b: goto 02b8
      // 029e: dup_x2
      // 029f: pop
      // 02a0: lload 8
      // 02a2: lxor
      // 02a3: dup2_x1
      // 02a4: pop2
      // 02a5: tableswitch -187 0 0 -32
      // 02b8: ldc2_w 4557117755200296181
      // 02bb: lstore 0
      // 02bc: bipush 4
      // 02bd: newarray 11
      // 02bf: astore 6
      // 02c1: bipush 0
      // 02c2: istore 3
      // 02c3: ldc_w "+(\u0010\u0014ûDù\b\u0013ú,ÆÝ@×\u0017"
      // 02c6: dup
      // 02c7: astore 4
      // 02c9: invokevirtual java/lang/String.length ()I
      // 02cc: istore 5
      // 02ce: bipush 0
      // 02cf: istore 2
      // 02d0: aload 4
      // 02d2: iload 2
      // 02d3: iinc 2 8
      // 02d6: iload 2
      // 02d7: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 02da: ldc_w "ISO-8859-1"
      // 02dd: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 02e0: astore 7
      // 02e2: aload 6
      // 02e4: iload 3
      // 02e5: iinc 3 1
      // 02e8: aload 7
      // 02ea: bipush 0
      // 02eb: baload
      // 02ec: i2l
      // 02ed: ldc2_w 255
      // 02f0: land
      // 02f1: bipush 56
      // 02f3: lshl
      // 02f4: aload 7
      // 02f6: bipush 1
      // 02f7: baload
      // 02f8: i2l
      // 02f9: ldc2_w 255
      // 02fc: land
      // 02fd: bipush 48
      // 02ff: lshl
      // 0300: lor
      // 0301: aload 7
      // 0303: bipush 2
      // 0304: baload
      // 0305: i2l
      // 0306: ldc2_w 255
      // 0309: land
      // 030a: bipush 40
      // 030c: lshl
      // 030d: lor
      // 030e: aload 7
      // 0310: bipush 3
      // 0311: baload
      // 0312: i2l
      // 0313: ldc2_w 255
      // 0316: land
      // 0317: bipush 32
      // 0319: lshl
      // 031a: lor
      // 031b: aload 7
      // 031d: bipush 4
      // 031e: baload
      // 031f: i2l
      // 0320: ldc2_w 255
      // 0323: land
      // 0324: bipush 24
      // 0326: lshl
      // 0327: lor
      // 0328: aload 7
      // 032a: bipush 5
      // 032b: baload
      // 032c: i2l
      // 032d: ldc2_w 255
      // 0330: land
      // 0331: bipush 16
      // 0333: lshl
      // 0334: lor
      // 0335: aload 7
      // 0337: bipush 6
      // 0339: baload
      // 033a: i2l
      // 033b: ldc2_w 255
      // 033e: land
      // 033f: bipush 8
      // 0341: lshl
      // 0342: lor
      // 0343: aload 7
      // 0345: bipush 7
      // 0347: baload
      // 0348: i2l
      // 0349: ldc2_w 255
      // 034c: land
      // 034d: lor
      // 034e: bipush -1
      // 034f: goto 03fe
      // 0352: lastore
      // 0353: iload 2
      // 0354: iload 5
      // 0356: if_icmplt 02d0
      // 0359: ldc_w "\u0011\u0007\u0090YÌ_!(.\u0086÷CÁË_«"
      // 035c: dup
      // 035d: astore 4
      // 035f: invokevirtual java/lang/String.length ()I
      // 0362: istore 5
      // 0364: bipush 0
      // 0365: istore 2
      // 0366: aload 4
      // 0368: iload 2
      // 0369: iinc 2 8
      // 036c: iload 2
      // 036d: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0370: ldc_w "ISO-8859-1"
      // 0373: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 0376: astore 7
      // 0378: aload 6
      // 037a: iload 3
      // 037b: iinc 3 1
      // 037e: aload 7
      // 0380: bipush 0
      // 0381: baload
      // 0382: i2l
      // 0383: ldc2_w 255
      // 0386: land
      // 0387: bipush 56
      // 0389: lshl
      // 038a: aload 7
      // 038c: bipush 1
      // 038d: baload
      // 038e: i2l
      // 038f: ldc2_w 255
      // 0392: land
      // 0393: bipush 48
      // 0395: lshl
      // 0396: lor
      // 0397: aload 7
      // 0399: bipush 2
      // 039a: baload
      // 039b: i2l
      // 039c: ldc2_w 255
      // 039f: land
      // 03a0: bipush 40
      // 03a2: lshl
      // 03a3: lor
      // 03a4: aload 7
      // 03a6: bipush 3
      // 03a7: baload
      // 03a8: i2l
      // 03a9: ldc2_w 255
      // 03ac: land
      // 03ad: bipush 32
      // 03af: lshl
      // 03b0: lor
      // 03b1: aload 7
      // 03b3: bipush 4
      // 03b4: baload
      // 03b5: i2l
      // 03b6: ldc2_w 255
      // 03b9: land
      // 03ba: bipush 24
      // 03bc: lshl
      // 03bd: lor
      // 03be: aload 7
      // 03c0: bipush 5
      // 03c1: baload
      // 03c2: i2l
      // 03c3: ldc2_w 255
      // 03c6: land
      // 03c7: bipush 16
      // 03c9: lshl
      // 03ca: lor
      // 03cb: aload 7
      // 03cd: bipush 6
      // 03cf: baload
      // 03d0: i2l
      // 03d1: ldc2_w 255
      // 03d4: land
      // 03d5: bipush 8
      // 03d7: lshl
      // 03d8: lor
      // 03d9: aload 7
      // 03db: bipush 7
      // 03dd: baload
      // 03de: i2l
      // 03df: ldc2_w 255
      // 03e2: land
      // 03e3: lor
      // 03e4: bipush 0
      // 03e5: goto 03fe
      // 03e8: lastore
      // 03e9: iload 2
      // 03ea: iload 5
      // 03ec: if_icmplt 0366
      // 03ef: aload 6
      // 03f1: putstatic com/finalshell/core/S7.g [J
      // 03f4: bipush 4
      // 03f5: anewarray 375
      // 03f8: putstatic com/finalshell/core/S7.h [Ljava/lang/Long;
      // 03fb: goto 0418
      // 03fe: dup_x2
      // 03ff: pop
      // 0400: lload 0
      // 0401: lxor
      // 0402: dup2_x1
      // 0403: pop2
      // 0404: tableswitch -178 0 0 -28
      // 0418: sipush 16337
      // 041b: new java/util/Properties
      // 041e: dup
      // 041f: invokespecial java/util/Properties.<init> ()V
      // 0422: putstatic com/finalshell/core/S7.S Ljava/util/Properties;
      // 0425: sipush -25194
      // 0428: invokestatic com/finalshell/core/S7.a (II)Ljava/lang/String;
      // 042b: invokestatic java/nio/charset/Charset.forName (Ljava/lang/String;)Ljava/nio/charset/Charset;
      // 042e: putstatic com/finalshell/core/S7.v Ljava/nio/charset/Charset;
      // 0431: sipush 4739
      // 0434: ldc2_w 5831792552873355921
      // 0437: invokestatic com/finalshell/core/S7.a (IJ)I
      // 043a: newarray 5
      // 043c: dup
      // 043d: bipush 0
      // 043e: sipush 27857
      // 0441: ldc2_w 3901722322491773992
      // 0444: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0447: castore
      // 0448: dup
      // 0449: bipush 1
      // 044a: sipush 21153
      // 044d: ldc2_w 6125507247327980072
      // 0450: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0453: castore
      // 0454: dup
      // 0455: bipush 2
      // 0456: sipush 27799
      // 0459: ldc2_w 2174907893077283840
      // 045c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 045f: castore
      // 0460: dup
      // 0461: bipush 3
      // 0462: sipush 28840
      // 0465: ldc2_w 5167475098250479861
      // 0468: invokestatic com/finalshell/core/S7.a (IJ)I
      // 046b: castore
      // 046c: dup
      // 046d: bipush 4
      // 046e: sipush 29837
      // 0471: ldc2_w 8361026311011470388
      // 0474: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0477: castore
      // 0478: dup
      // 0479: bipush 5
      // 047a: sipush 25582
      // 047d: ldc2_w 7814693686912785301
      // 0480: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0483: castore
      // 0484: dup
      // 0485: sipush 17642
      // 0488: ldc2_w 3973525135493741602
      // 048b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 048e: sipush 9588
      // 0491: ldc2_w 2034625318898621902
      // 0494: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0497: castore
      // 0498: dup
      // 0499: sipush 9078
      // 049c: ldc2_w 7826287565034707851
      // 049f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 04a2: sipush 29556
      // 04a5: ldc2_w 1092280456903166772
      // 04a8: invokestatic com/finalshell/core/S7.a (IJ)I
      // 04ab: castore
      // 04ac: dup
      // 04ad: sipush 29230
      // 04b0: ldc2_w 2245239911286966921
      // 04b3: invokestatic com/finalshell/core/S7.a (IJ)I
      // 04b6: sipush 18902
      // 04b9: ldc2_w 1969450918035665175
      // 04bc: invokestatic com/finalshell/core/S7.a (IJ)I
      // 04bf: castore
      // 04c0: dup
      // 04c1: sipush 6592
      // 04c4: ldc2_w 6723853783207305686
      // 04c7: invokestatic com/finalshell/core/S7.a (IJ)I
      // 04ca: sipush 7396
      // 04cd: ldc2_w 2141474821379843091
      // 04d0: invokestatic com/finalshell/core/S7.a (IJ)I
      // 04d3: castore
      // 04d4: dup
      // 04d5: sipush 19431
      // 04d8: ldc2_w 3995733026905961425
      // 04db: invokestatic com/finalshell/core/S7.a (IJ)I
      // 04de: sipush 29295
      // 04e1: ldc2_w 9013662457395448332
      // 04e4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 04e7: castore
      // 04e8: dup
      // 04e9: sipush 28353
      // 04ec: ldc2_w 6560688942296405750
      // 04ef: invokestatic com/finalshell/core/S7.a (IJ)I
      // 04f2: sipush 30156
      // 04f5: ldc2_w 8965398202934693163
      // 04f8: invokestatic com/finalshell/core/S7.a (IJ)I
      // 04fb: castore
      // 04fc: dup
      // 04fd: sipush 215
      // 0500: ldc2_w 8160882664965077241
      // 0503: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0506: sipush 30280
      // 0509: ldc2_w 7951853241955487300
      // 050c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 050f: castore
      // 0510: dup
      // 0511: sipush 22597
      // 0514: ldc2_w 5988630053160427604
      // 0517: invokestatic com/finalshell/core/S7.a (IJ)I
      // 051a: sipush 24438
      // 051d: ldc2_w 929664313512208158
      // 0520: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0523: castore
      // 0524: dup
      // 0525: sipush 6511
      // 0528: ldc2_w 8103372283768299994
      // 052b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 052e: sipush 31703
      // 0531: ldc2_w 4581637467285881676
      // 0534: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0537: castore
      // 0538: dup
      // 0539: sipush 17459
      // 053c: ldc2_w 3667802084429216959
      // 053f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0542: sipush 10162
      // 0545: ldc2_w 8631479393772232491
      // 0548: invokestatic com/finalshell/core/S7.a (IJ)I
      // 054b: castore
      // 054c: putstatic com/finalshell/core/S7.y [C
      // 054f: sipush 8279
      // 0552: ldc2_w 8776086126881986704
      // 0555: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0558: newarray 4
      // 055a: putstatic com/finalshell/core/S7.K [Z
      // 055d: sipush 21599
      // 0560: ldc2_w 3522224416701787170
      // 0563: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0566: newarray 4
      // 0568: putstatic com/finalshell/core/S7.t [Z
      // 056b: bipush 0
      // 056c: istore 23
      // 056e: iload 23
      // 0570: getstatic com/finalshell/core/S7.K [Z
      // 0573: arraylength
      // 0574: if_icmpge 061b
      // 0577: iload 23
      // 0579: sipush 2663
      // 057c: ldc2_w 4383746037785260728
      // 057f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0582: if_icmplt 05af
      // 0585: goto 058c
      // 0588: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058b: athrow
      // 058c: iload 23
      // 058e: sipush 3048
      // 0591: ldc2_w 68792392140616571
      // 0594: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0597: if_icmpgt 05af
      // 059a: goto 05a1
      // 059d: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a0: athrow
      // 05a1: getstatic com/finalshell/core/S7.K [Z
      // 05a4: iload 23
      // 05a6: bipush 1
      // 05a7: bastore
      // 05a8: goto 0611
      // 05ab: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05ae: athrow
      // 05af: iload 23
      // 05b1: sipush 11370
      // 05b4: ldc2_w 8524651344486847670
      // 05b7: invokestatic com/finalshell/core/S7.a (IJ)I
      // 05ba: if_icmplt 05e0
      // 05bd: iload 23
      // 05bf: sipush 4206
      // 05c2: ldc2_w 6049152865958815967
      // 05c5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 05c8: if_icmpgt 05e0
      // 05cb: goto 05d2
      // 05ce: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d1: athrow
      // 05d2: getstatic com/finalshell/core/S7.K [Z
      // 05d5: iload 23
      // 05d7: bipush 1
      // 05d8: bastore
      // 05d9: goto 0611
      // 05dc: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05df: athrow
      // 05e0: iload 23
      // 05e2: sipush 15644
      // 05e5: ldc2_w 1240509841897375173
      // 05e8: invokestatic com/finalshell/core/S7.a (IJ)I
      // 05eb: if_icmpeq 0603
      // 05ee: iload 23
      // 05f0: sipush 20137
      // 05f3: ldc2_w 5445849252821284417
      // 05f6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 05f9: if_icmpne 0611
      // 05fc: goto 0603
      // 05ff: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0602: athrow
      // 0603: getstatic com/finalshell/core/S7.K [Z
      // 0606: iload 23
      // 0608: bipush 1
      // 0609: bastore
      // 060a: goto 0611
      // 060d: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0610: athrow
      // 0611: iload 23
      // 0613: bipush 1
      // 0614: iadd
      // 0615: i2c
      // 0616: istore 23
      // 0618: goto 056e
      // 061b: bipush 0
      // 061c: istore 23
      // 061e: iload 23
      // 0620: getstatic com/finalshell/core/S7.t [Z
      // 0623: arraylength
      // 0624: if_icmpge 06e7
      // 0627: iload 23
      // 0629: sipush 2663
      // 062c: ldc2_w 4383746037785260728
      // 062f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0632: if_icmplt 065f
      // 0635: goto 063c
      // 0638: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 063b: athrow
      // 063c: iload 23
      // 063e: sipush 12276
      // 0641: ldc2_w 4651341756621379338
      // 0644: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0647: if_icmpgt 065f
      // 064a: goto 0651
      // 064d: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0650: athrow
      // 0651: getstatic com/finalshell/core/S7.t [Z
      // 0654: iload 23
      // 0656: bipush 1
      // 0657: bastore
      // 0658: goto 06dd
      // 065b: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 065e: athrow
      // 065f: iload 23
      // 0661: sipush 24676
      // 0664: ldc2_w 6451437090994624546
      // 0667: invokestatic com/finalshell/core/S7.a (IJ)I
      // 066a: if_icmplt 0690
      // 066d: iload 23
      // 066f: sipush 18568
      // 0672: ldc2_w 434742340025430158
      // 0675: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0678: if_icmpgt 0690
      // 067b: goto 0682
      // 067e: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0681: athrow
      // 0682: getstatic com/finalshell/core/S7.t [Z
      // 0685: iload 23
      // 0687: bipush 1
      // 0688: bastore
      // 0689: goto 06dd
      // 068c: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 068f: athrow
      // 0690: iload 23
      // 0692: sipush 28021
      // 0695: ldc2_w 3686819205896836515
      // 0698: invokestatic com/finalshell/core/S7.a (IJ)I
      // 069b: if_icmpne 06ac
      // 069e: getstatic com/finalshell/core/S7.t [Z
      // 06a1: iload 23
      // 06a3: bipush 1
      // 06a4: bastore
      // 06a5: goto 06dd
      // 06a8: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06ab: athrow
      // 06ac: iload 23
      // 06ae: sipush 3570
      // 06b1: ldc2_w 186475829377889640
      // 06b4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 06b7: if_icmplt 06dd
      // 06ba: iload 23
      // 06bc: sipush 19563
      // 06bf: ldc2_w 981167762409370815
      // 06c2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 06c5: if_icmpgt 06dd
      // 06c8: goto 06cf
      // 06cb: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06ce: athrow
      // 06cf: getstatic com/finalshell/core/S7.t [Z
      // 06d2: iload 23
      // 06d4: bipush 1
      // 06d5: bastore
      // 06d6: goto 06dd
      // 06d9: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06dc: athrow
      // 06dd: iload 23
      // 06df: bipush 1
      // 06e0: iadd
      // 06e1: i2c
      // 06e2: istore 23
      // 06e4: goto 061e
      // 06e7: invokestatic com/finalshell/core/S7.U ()V
      // 06ea: goto 06ef
      // 06ed: astore 23
      // 06ef: sipush 26080
      // 06f2: ldc2_w 867074579376610577
      // 06f5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 06f8: newarray 8
      // 06fa: putstatic com/finalshell/core/S7.j [B
      // 06fd: sipush 23424
      // 0700: ldc2_w 5449325115920229321
      // 0703: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0706: newarray 8
      // 0708: putstatic com/finalshell/core/S7.q [B
      // 070b: sipush 23424
      // 070e: ldc2_w 5449325115920229321
      // 0711: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0714: newarray 4
      // 0716: putstatic com/finalshell/core/S7.V [Z
      // 0719: sipush 23424
      // 071c: ldc2_w 5449325115920229321
      // 071f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0722: newarray 4
      // 0724: putstatic com/finalshell/core/S7.M [Z
      // 0727: sipush 32401
      // 072a: ldc2_w 3898702027750409902
      // 072d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0730: newarray 5
      // 0732: putstatic com/finalshell/core/S7.Q [C
      // 0735: getstatic com/finalshell/core/S7.j [B
      // 0738: bipush 0
      // 0739: bipush 4
      // 073a: bastore
      // 073b: getstatic com/finalshell/core/S7.j [B
      // 073e: bipush 1
      // 073f: bipush 4
      // 0740: bastore
      // 0741: getstatic com/finalshell/core/S7.j [B
      // 0744: bipush 2
      // 0745: bipush 4
      // 0746: bastore
      // 0747: getstatic com/finalshell/core/S7.j [B
      // 074a: bipush 3
      // 074b: bipush 4
      // 074c: bastore
      // 074d: getstatic com/finalshell/core/S7.j [B
      // 0750: bipush 4
      // 0751: bipush 4
      // 0752: bastore
      // 0753: getstatic com/finalshell/core/S7.j [B
      // 0756: bipush 5
      // 0757: bipush 4
      // 0758: bastore
      // 0759: getstatic com/finalshell/core/S7.j [B
      // 075c: sipush 17642
      // 075f: ldc2_w 3973525135493741602
      // 0762: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0765: bipush 4
      // 0766: bastore
      // 0767: getstatic com/finalshell/core/S7.j [B
      // 076a: sipush 25120
      // 076d: ldc2_w 6587103157852772946
      // 0770: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0773: bipush 4
      // 0774: bastore
      // 0775: getstatic com/finalshell/core/S7.j [B
      // 0778: sipush 29230
      // 077b: ldc2_w 2245239911286966921
      // 077e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0781: bipush 1
      // 0782: bastore
      // 0783: getstatic com/finalshell/core/S7.j [B
      // 0786: sipush 27609
      // 0789: ldc2_w 3655570642081551163
      // 078c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 078f: bipush 1
      // 0790: bastore
      // 0791: getstatic com/finalshell/core/S7.j [B
      // 0794: sipush 19431
      // 0797: ldc2_w 3995733026905961425
      // 079a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 079d: bipush 1
      // 079e: bastore
      // 079f: getstatic com/finalshell/core/S7.j [B
      // 07a2: sipush 28542
      // 07a5: ldc2_w 7267679887026886515
      // 07a8: invokestatic com/finalshell/core/S7.a (IJ)I
      // 07ab: bipush 4
      // 07ac: bastore
      // 07ad: getstatic com/finalshell/core/S7.j [B
      // 07b0: sipush 215
      // 07b3: ldc2_w 8160882664965077241
      // 07b6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 07b9: bipush 1
      // 07ba: bastore
      // 07bb: getstatic com/finalshell/core/S7.j [B
      // 07be: sipush 22597
      // 07c1: ldc2_w 5988630053160427604
      // 07c4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 07c7: bipush 1
      // 07c8: bastore
      // 07c9: getstatic com/finalshell/core/S7.j [B
      // 07cc: sipush 8790
      // 07cf: ldc2_w 8922097230023744155
      // 07d2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 07d5: bipush 1
      // 07d6: bastore
      // 07d7: getstatic com/finalshell/core/S7.j [B
      // 07da: sipush 17417
      // 07dd: ldc2_w 1604173603247045752
      // 07e0: invokestatic com/finalshell/core/S7.a (IJ)I
      // 07e3: bipush 1
      // 07e4: bastore
      // 07e5: getstatic com/finalshell/core/S7.q [B
      // 07e8: bipush 0
      // 07e9: bipush 4
      // 07ea: bastore
      // 07eb: getstatic com/finalshell/core/S7.q [B
      // 07ee: bipush 1
      // 07ef: bipush 4
      // 07f0: bastore
      // 07f1: getstatic com/finalshell/core/S7.q [B
      // 07f4: bipush 2
      // 07f5: bipush 4
      // 07f6: bastore
      // 07f7: getstatic com/finalshell/core/S7.q [B
      // 07fa: bipush 3
      // 07fb: bipush 4
      // 07fc: bastore
      // 07fd: getstatic com/finalshell/core/S7.q [B
      // 0800: bipush 4
      // 0801: bipush 4
      // 0802: bastore
      // 0803: getstatic com/finalshell/core/S7.q [B
      // 0806: bipush 5
      // 0807: bipush 4
      // 0808: bastore
      // 0809: getstatic com/finalshell/core/S7.q [B
      // 080c: sipush 17642
      // 080f: ldc2_w 3973525135493741602
      // 0812: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0815: bipush 4
      // 0816: bastore
      // 0817: getstatic com/finalshell/core/S7.q [B
      // 081a: sipush 25120
      // 081d: ldc2_w 6587103157852772946
      // 0820: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0823: bipush 4
      // 0824: bastore
      // 0825: getstatic com/finalshell/core/S7.q [B
      // 0828: sipush 29230
      // 082b: ldc2_w 2245239911286966921
      // 082e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0831: bipush 1
      // 0832: bastore
      // 0833: getstatic com/finalshell/core/S7.q [B
      // 0836: sipush 27609
      // 0839: ldc2_w 3655570642081551163
      // 083c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 083f: bipush 1
      // 0840: bastore
      // 0841: getstatic com/finalshell/core/S7.q [B
      // 0844: sipush 19431
      // 0847: ldc2_w 3995733026905961425
      // 084a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 084d: bipush 1
      // 084e: bastore
      // 084f: getstatic com/finalshell/core/S7.q [B
      // 0852: sipush 28542
      // 0855: ldc2_w 7267679887026886515
      // 0858: invokestatic com/finalshell/core/S7.a (IJ)I
      // 085b: bipush 4
      // 085c: bastore
      // 085d: getstatic com/finalshell/core/S7.q [B
      // 0860: sipush 215
      // 0863: ldc2_w 8160882664965077241
      // 0866: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0869: bipush 1
      // 086a: bastore
      // 086b: getstatic com/finalshell/core/S7.q [B
      // 086e: sipush 22597
      // 0871: ldc2_w 5988630053160427604
      // 0874: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0877: bipush 1
      // 0878: bastore
      // 0879: getstatic com/finalshell/core/S7.q [B
      // 087c: sipush 6917
      // 087f: ldc2_w 7015247155460694818
      // 0882: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0885: bipush 1
      // 0886: bastore
      // 0887: getstatic com/finalshell/core/S7.q [B
      // 088a: sipush 11652
      // 088d: ldc2_w 4116055093006226811
      // 0890: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0893: bipush 1
      // 0894: bastore
      // 0895: sipush 8553
      // 0898: ldc2_w 5208731264043899322
      // 089b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 089e: istore 23
      // 08a0: iload 23
      // 08a2: sipush 21391
      // 08a5: ldc2_w 7883214807808453377
      // 08a8: invokestatic com/finalshell/core/S7.a (IJ)I
      // 08ab: if_icmpgt 08c6
      // 08ae: getstatic com/finalshell/core/S7.j [B
      // 08b1: iload 23
      // 08b3: bipush 4
      // 08b4: bastore
      // 08b5: getstatic com/finalshell/core/S7.q [B
      // 08b8: iload 23
      // 08ba: bipush 4
      // 08bb: bastore
      // 08bc: iinc 23 1
      // 08bf: goto 08a0
      // 08c2: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c5: athrow
      // 08c6: sipush 3205
      // 08c9: ldc2_w 1865469021743084676
      // 08cc: invokestatic com/finalshell/core/S7.a (IJ)I
      // 08cf: istore 23
      // 08d1: iload 23
      // 08d3: sipush 19458
      // 08d6: ldc2_w 4012607601700549724
      // 08d9: invokestatic com/finalshell/core/S7.a (IJ)I
      // 08dc: if_icmpge 08f7
      // 08df: getstatic com/finalshell/core/S7.j [B
      // 08e2: iload 23
      // 08e4: bipush 4
      // 08e5: bastore
      // 08e6: getstatic com/finalshell/core/S7.q [B
      // 08e9: iload 23
      // 08eb: bipush 4
      // 08ec: bastore
      // 08ed: iinc 23 1
      // 08f0: goto 08d1
      // 08f3: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f6: athrow
      // 08f7: bipush 0
      // 08f8: istore 23
      // 08fa: iload 23
      // 08fc: sipush 23424
      // 08ff: ldc2_w 5449325115920229321
      // 0902: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0905: if_icmpge 0945
      // 0908: getstatic com/finalshell/core/S7.V [Z
      // 090b: iload 23
      // 090d: getstatic com/finalshell/core/S7.j [B
      // 0910: iload 23
      // 0912: baload
      // 0913: ifeq 0925
      // 0916: goto 091d
      // 0919: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 091c: athrow
      // 091d: bipush 1
      // 091e: goto 0926
      // 0921: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0924: athrow
      // 0925: bipush 0
      // 0926: bastore
      // 0927: getstatic com/finalshell/core/S7.M [Z
      // 092a: iload 23
      // 092c: getstatic com/finalshell/core/S7.q [B
      // 092f: iload 23
      // 0931: baload
      // 0932: ifeq 093d
      // 0935: bipush 1
      // 0936: goto 093e
      // 0939: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 093c: athrow
      // 093d: bipush 0
      // 093e: bastore
      // 093f: iinc 23 1
      // 0942: goto 08fa
      // 0945: getstatic com/finalshell/core/S7.Q [C
      // 0948: bipush 0
      // 0949: sipush 3570
      // 094c: ldc2_w 186475829377889640
      // 094f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0952: castore
      // 0953: sipush 16338
      // 0956: getstatic com/finalshell/core/S7.Q [C
      // 0959: bipush 1
      // 095a: sipush 16654
      // 095d: ldc2_w 8574482885912836352
      // 0960: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0963: castore
      // 0964: sipush 18741
      // 0967: getstatic com/finalshell/core/S7.Q [C
      // 096a: bipush 2
      // 096b: sipush 15387
      // 096e: ldc2_w 4897812516075979903
      // 0971: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0974: castore
      // 0975: getstatic com/finalshell/core/S7.Q [C
      // 0978: bipush 3
      // 0979: sipush 29613
      // 097c: ldc2_w 8327380352311004078
      // 097f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0982: castore
      // 0983: getstatic com/finalshell/core/S7.Q [C
      // 0986: bipush 4
      // 0987: sipush 21423
      // 098a: ldc2_w 7188274520085212119
      // 098d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0990: castore
      // 0991: getstatic com/finalshell/core/S7.Q [C
      // 0994: bipush 5
      // 0995: sipush 31543
      // 0998: ldc2_w 7535909877894513425
      // 099b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 099e: castore
      // 099f: getstatic com/finalshell/core/S7.Q [C
      // 09a2: sipush 17642
      // 09a5: ldc2_w 3973525135493741602
      // 09a8: invokestatic com/finalshell/core/S7.a (IJ)I
      // 09ab: sipush 12047
      // 09ae: ldc2_w 2695385713178367904
      // 09b1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 09b4: castore
      // 09b5: getstatic com/finalshell/core/S7.Q [C
      // 09b8: sipush 25120
      // 09bb: ldc2_w 6587103157852772946
      // 09be: invokestatic com/finalshell/core/S7.a (IJ)I
      // 09c1: sipush 21546
      // 09c4: ldc2_w 5426761049271774337
      // 09c7: invokestatic com/finalshell/core/S7.a (IJ)I
      // 09ca: castore
      // 09cb: getstatic com/finalshell/core/S7.Q [C
      // 09ce: sipush 29230
      // 09d1: ldc2_w 2245239911286966921
      // 09d4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 09d7: sipush 24782
      // 09da: ldc2_w 7683020969731889229
      // 09dd: invokestatic com/finalshell/core/S7.a (IJ)I
      // 09e0: castore
      // 09e1: getstatic com/finalshell/core/S7.Q [C
      // 09e4: sipush 27609
      // 09e7: ldc2_w 3655570642081551163
      // 09ea: invokestatic com/finalshell/core/S7.a (IJ)I
      // 09ed: sipush 10314
      // 09f0: ldc2_w 6817456974547865838
      // 09f3: invokestatic com/finalshell/core/S7.a (IJ)I
      // 09f6: castore
      // 09f7: getstatic com/finalshell/core/S7.Q [C
      // 09fa: sipush 19431
      // 09fd: ldc2_w 3995733026905961425
      // 0a00: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0a03: sipush 26513
      // 0a06: ldc2_w 7695173997695639492
      // 0a09: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0a0c: castore
      // 0a0d: getstatic com/finalshell/core/S7.Q [C
      // 0a10: sipush 28542
      // 0a13: ldc2_w 7267679887026886515
      // 0a16: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0a19: sipush 18101
      // 0a1c: ldc2_w 7446810541429636645
      // 0a1f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0a22: castore
      // 0a23: getstatic com/finalshell/core/S7.Q [C
      // 0a26: sipush 215
      // 0a29: ldc2_w 8160882664965077241
      // 0a2c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0a2f: sipush 29073
      // 0a32: ldc2_w 3088827381487962501
      // 0a35: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0a38: castore
      // 0a39: getstatic com/finalshell/core/S7.Q [C
      // 0a3c: sipush 22597
      // 0a3f: ldc2_w 5988630053160427604
      // 0a42: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0a45: sipush 19110
      // 0a48: ldc2_w 4386745932629619408
      // 0a4b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0a4e: castore
      // 0a4f: getstatic com/finalshell/core/S7.Q [C
      // 0a52: sipush 32456
      // 0a55: ldc2_w 2698850499816130138
      // 0a58: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0a5b: sipush 32456
      // 0a5e: ldc2_w 2698850499816130138
      // 0a61: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0a64: castore
      // 0a65: getstatic com/finalshell/core/S7.Q [C
      // 0a68: sipush 29877
      // 0a6b: ldc2_w 769137449996749950
      // 0a6e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0a71: sipush 29877
      // 0a74: ldc2_w 769137449996749950
      // 0a77: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0a7a: castore
      // 0a7b: getstatic com/finalshell/core/S7.Q [C
      // 0a7e: sipush 11665
      // 0a81: ldc2_w 7548408504322446771
      // 0a84: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0a87: sipush 19328
      // 0a8a: ldc2_w 2737502463315948408
      // 0a8d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0a90: castore
      // 0a91: getstatic com/finalshell/core/S7.Q [C
      // 0a94: sipush 6917
      // 0a97: ldc2_w 7015247155460694818
      // 0a9a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0a9d: sipush 6917
      // 0aa0: ldc2_w 7015247155460694818
      // 0aa3: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0aa6: castore
      // 0aa7: sipush 21056
      // 0aaa: ldc2_w 1596430545448708759
      // 0aad: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0ab0: newarray 5
      // 0ab2: dup
      // 0ab3: bipush 0
      // 0ab4: sipush 3570
      // 0ab7: ldc2_w 186475829377889640
      // 0aba: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0abd: castore
      // 0abe: dup
      // 0abf: bipush 1
      // 0ac0: sipush 3570
      // 0ac3: ldc2_w 186475829377889640
      // 0ac6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0ac9: castore
      // 0aca: dup
      // 0acb: bipush 2
      // 0acc: sipush 3570
      // 0acf: ldc2_w 186475829377889640
      // 0ad2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0ad5: castore
      // 0ad6: dup
      // 0ad7: bipush 3
      // 0ad8: sipush 16654
      // 0adb: ldc2_w 8574482885912836352
      // 0ade: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0ae1: castore
      // 0ae2: dup
      // 0ae3: bipush 4
      // 0ae4: sipush 3570
      // 0ae7: ldc2_w 186475829377889640
      // 0aea: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0aed: castore
      // 0aee: dup
      // 0aef: bipush 5
      // 0af0: sipush 15387
      // 0af3: ldc2_w 4897812516075979903
      // 0af6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0af9: castore
      // 0afa: dup
      // 0afb: sipush 17642
      // 0afe: ldc2_w 3973525135493741602
      // 0b01: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0b04: sipush 3570
      // 0b07: ldc2_w 186475829377889640
      // 0b0a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0b0d: castore
      // 0b0e: dup
      // 0b0f: sipush 25120
      // 0b12: ldc2_w 6587103157852772946
      // 0b15: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0b18: sipush 29613
      // 0b1b: ldc2_w 8327380352311004078
      // 0b1e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0b21: castore
      // 0b22: dup
      // 0b23: sipush 29230
      // 0b26: ldc2_w 2245239911286966921
      // 0b29: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0b2c: sipush 3570
      // 0b2f: ldc2_w 186475829377889640
      // 0b32: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0b35: castore
      // 0b36: dup
      // 0b37: sipush 27609
      // 0b3a: ldc2_w 3655570642081551163
      // 0b3d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0b40: sipush 21423
      // 0b43: ldc2_w 7188274520085212119
      // 0b46: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0b49: castore
      // 0b4a: dup
      // 0b4b: sipush 19431
      // 0b4e: ldc2_w 3995733026905961425
      // 0b51: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0b54: sipush 3570
      // 0b57: ldc2_w 186475829377889640
      // 0b5a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0b5d: castore
      // 0b5e: dup
      // 0b5f: sipush 28542
      // 0b62: ldc2_w 7267679887026886515
      // 0b65: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0b68: sipush 31543
      // 0b6b: ldc2_w 7535909877894513425
      // 0b6e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0b71: castore
      // 0b72: dup
      // 0b73: sipush 215
      // 0b76: ldc2_w 8160882664965077241
      // 0b79: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0b7c: sipush 3570
      // 0b7f: ldc2_w 186475829377889640
      // 0b82: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0b85: castore
      // 0b86: dup
      // 0b87: sipush 22597
      // 0b8a: ldc2_w 5988630053160427604
      // 0b8d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0b90: sipush 12047
      // 0b93: ldc2_w 2695385713178367904
      // 0b96: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0b99: castore
      // 0b9a: dup
      // 0b9b: sipush 8553
      // 0b9e: ldc2_w 5208731264043899322
      // 0ba1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0ba4: sipush 3570
      // 0ba7: ldc2_w 186475829377889640
      // 0baa: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0bad: castore
      // 0bae: dup
      // 0baf: sipush 30676
      // 0bb2: ldc2_w 5956089045550829544
      // 0bb5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0bb8: sipush 21546
      // 0bbb: ldc2_w 5426761049271774337
      // 0bbe: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0bc1: castore
      // 0bc2: dup
      // 0bc3: sipush 4739
      // 0bc6: ldc2_w 5831792552873355921
      // 0bc9: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0bcc: sipush 3570
      // 0bcf: ldc2_w 186475829377889640
      // 0bd2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0bd5: castore
      // 0bd6: dup
      // 0bd7: sipush 13940
      // 0bda: ldc2_w 5882368694275853901
      // 0bdd: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0be0: sipush 15193
      // 0be3: ldc2_w 2389375293862495046
      // 0be6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0be9: castore
      // 0bea: dup
      // 0beb: sipush 1558
      // 0bee: ldc2_w 2915472958089854672
      // 0bf1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0bf4: sipush 3570
      // 0bf7: ldc2_w 186475829377889640
      // 0bfa: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0bfd: castore
      // 0bfe: dup
      // 0bff: sipush 19937
      // 0c02: ldc2_w 1202565405225530849
      // 0c05: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0c08: sipush 19563
      // 0c0b: ldc2_w 981167762409370815
      // 0c0e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0c11: castore
      // 0c12: dup
      // 0c13: sipush 15653
      // 0c16: ldc2_w 8235749187098920206
      // 0c19: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0c1c: sipush 3570
      // 0c1f: ldc2_w 186475829377889640
      // 0c22: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0c25: castore
      // 0c26: dup
      // 0c27: sipush 8177
      // 0c2a: ldc2_w 3624983001373665273
      // 0c2d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0c30: sipush 2663
      // 0c33: ldc2_w 4383746037785260728
      // 0c36: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0c39: castore
      // 0c3a: dup
      // 0c3b: sipush 7343
      // 0c3e: ldc2_w 7105609156718257323
      // 0c41: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0c44: sipush 3570
      // 0c47: ldc2_w 186475829377889640
      // 0c4a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0c4d: castore
      // 0c4e: dup
      // 0c4f: sipush 29859
      // 0c52: ldc2_w 4250412518551424214
      // 0c55: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0c58: sipush 18785
      // 0c5b: ldc2_w 7059161105789628815
      // 0c5e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0c61: castore
      // 0c62: dup
      // 0c63: sipush 20014
      // 0c66: ldc2_w 2418117900177913547
      // 0c69: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0c6c: sipush 3570
      // 0c6f: ldc2_w 186475829377889640
      // 0c72: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0c75: castore
      // 0c76: dup
      // 0c77: sipush 12106
      // 0c7a: ldc2_w 1501005830442244052
      // 0c7d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0c80: sipush 18184
      // 0c83: ldc2_w 4483245699943153660
      // 0c86: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0c89: castore
      // 0c8a: dup
      // 0c8b: sipush 11343
      // 0c8e: ldc2_w 388966532241872037
      // 0c91: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0c94: sipush 3570
      // 0c97: ldc2_w 186475829377889640
      // 0c9a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0c9d: castore
      // 0c9e: dup
      // 0c9f: sipush 10840
      // 0ca2: ldc2_w 5382104931535508185
      // 0ca5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0ca8: sipush 22251
      // 0cab: ldc2_w 183965713644596742
      // 0cae: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0cb1: castore
      // 0cb2: dup
      // 0cb3: sipush 30696
      // 0cb6: ldc2_w 5192147204309225456
      // 0cb9: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0cbc: sipush 3570
      // 0cbf: ldc2_w 186475829377889640
      // 0cc2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0cc5: castore
      // 0cc6: dup
      // 0cc7: sipush 3035
      // 0cca: ldc2_w 6161648239379870504
      // 0ccd: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0cd0: sipush 16563
      // 0cd3: ldc2_w 2682085708563560504
      // 0cd6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0cd9: castore
      // 0cda: dup
      // 0cdb: sipush 6826
      // 0cde: ldc2_w 2332032890832216784
      // 0ce1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0ce4: sipush 3570
      // 0ce7: ldc2_w 186475829377889640
      // 0cea: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0ced: castore
      // 0cee: dup
      // 0cef: sipush 26611
      // 0cf2: ldc2_w 2662960648625135594
      // 0cf5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0cf8: sipush 2193
      // 0cfb: ldc2_w 4252108287588298828
      // 0cfe: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0d01: castore
      // 0d02: dup
      // 0d03: sipush 13347
      // 0d06: ldc2_w 2773720600232905865
      // 0d09: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0d0c: sipush 16654
      // 0d0f: ldc2_w 8574482885912836352
      // 0d12: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0d15: castore
      // 0d16: dup
      // 0d17: sipush 2487
      // 0d1a: ldc2_w 443505632337686867
      // 0d1d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0d20: sipush 3570
      // 0d23: ldc2_w 186475829377889640
      // 0d26: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0d29: castore
      // 0d2a: dup
      // 0d2b: sipush 32456
      // 0d2e: ldc2_w 2698850499816130138
      // 0d31: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0d34: sipush 16654
      // 0d37: ldc2_w 8574482885912836352
      // 0d3a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0d3d: castore
      // 0d3e: dup
      // 0d3f: sipush 32049
      // 0d42: ldc2_w 3018818137599706595
      // 0d45: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0d48: sipush 16654
      // 0d4b: ldc2_w 8574482885912836352
      // 0d4e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0d51: castore
      // 0d52: dup
      // 0d53: sipush 28560
      // 0d56: ldc2_w 2736387800709601080
      // 0d59: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0d5c: sipush 16654
      // 0d5f: ldc2_w 8574482885912836352
      // 0d62: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0d65: castore
      // 0d66: dup
      // 0d67: sipush 22662
      // 0d6a: ldc2_w 1192820477849280599
      // 0d6d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0d70: sipush 15387
      // 0d73: ldc2_w 4897812516075979903
      // 0d76: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0d79: castore
      // 0d7a: dup
      // 0d7b: sipush 32007
      // 0d7e: ldc2_w 4942936367835219225
      // 0d81: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0d84: sipush 16654
      // 0d87: ldc2_w 8574482885912836352
      // 0d8a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0d8d: castore
      // 0d8e: dup
      // 0d8f: sipush 29877
      // 0d92: ldc2_w 769137449996749950
      // 0d95: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0d98: sipush 29613
      // 0d9b: ldc2_w 8327380352311004078
      // 0d9e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0da1: castore
      // 0da2: dup
      // 0da3: sipush 15550
      // 0da6: ldc2_w 7285622954068427975
      // 0da9: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0dac: sipush 16654
      // 0daf: ldc2_w 8574482885912836352
      // 0db2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0db5: castore
      // 0db6: dup
      // 0db7: sipush 2592
      // 0dba: ldc2_w 4058182933648339624
      // 0dbd: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0dc0: sipush 21423
      // 0dc3: ldc2_w 7188274520085212119
      // 0dc6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0dc9: castore
      // 0dca: dup
      // 0dcb: sipush 27425
      // 0dce: ldc2_w 3783559701446759206
      // 0dd1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0dd4: sipush 16654
      // 0dd7: ldc2_w 8574482885912836352
      // 0dda: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0ddd: castore
      // 0dde: dup
      // 0ddf: sipush 26696
      // 0de2: ldc2_w 2759768357714726951
      // 0de5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0de8: sipush 31543
      // 0deb: ldc2_w 7535909877894513425
      // 0dee: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0df1: castore
      // 0df2: dup
      // 0df3: sipush 14606
      // 0df6: ldc2_w 6364494626673410305
      // 0df9: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0dfc: sipush 16654
      // 0dff: ldc2_w 8574482885912836352
      // 0e02: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0e05: castore
      // 0e06: dup
      // 0e07: sipush 9789
      // 0e0a: ldc2_w 6813733451080457837
      // 0e0d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0e10: sipush 12047
      // 0e13: ldc2_w 2695385713178367904
      // 0e16: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0e19: castore
      // 0e1a: dup
      // 0e1b: sipush 25506
      // 0e1e: ldc2_w 2930152344143633154
      // 0e21: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0e24: sipush 16654
      // 0e27: ldc2_w 8574482885912836352
      // 0e2a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0e2d: castore
      // 0e2e: dup
      // 0e2f: sipush 19328
      // 0e32: ldc2_w 2737502463315948408
      // 0e35: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0e38: sipush 21546
      // 0e3b: ldc2_w 5426761049271774337
      // 0e3e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0e41: castore
      // 0e42: dup
      // 0e43: sipush 3570
      // 0e46: ldc2_w 186475829377889640
      // 0e49: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0e4c: sipush 16654
      // 0e4f: ldc2_w 8574482885912836352
      // 0e52: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0e55: castore
      // 0e56: dup
      // 0e57: sipush 16654
      // 0e5a: ldc2_w 8574482885912836352
      // 0e5d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0e60: sipush 15193
      // 0e63: ldc2_w 2389375293862495046
      // 0e66: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0e69: castore
      // 0e6a: dup
      // 0e6b: sipush 15387
      // 0e6e: ldc2_w 4897812516075979903
      // 0e71: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0e74: sipush 16654
      // 0e77: ldc2_w 8574482885912836352
      // 0e7a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0e7d: castore
      // 0e7e: dup
      // 0e7f: sipush 29613
      // 0e82: ldc2_w 8327380352311004078
      // 0e85: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0e88: sipush 19563
      // 0e8b: ldc2_w 981167762409370815
      // 0e8e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0e91: castore
      // 0e92: dup
      // 0e93: sipush 21423
      // 0e96: ldc2_w 7188274520085212119
      // 0e99: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0e9c: sipush 16654
      // 0e9f: ldc2_w 8574482885912836352
      // 0ea2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0ea5: castore
      // 0ea6: dup
      // 0ea7: sipush 31543
      // 0eaa: ldc2_w 7535909877894513425
      // 0ead: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0eb0: sipush 2663
      // 0eb3: ldc2_w 4383746037785260728
      // 0eb6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0eb9: castore
      // 0eba: dup
      // 0ebb: sipush 12047
      // 0ebe: ldc2_w 2695385713178367904
      // 0ec1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0ec4: sipush 16654
      // 0ec7: ldc2_w 8574482885912836352
      // 0eca: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0ecd: castore
      // 0ece: dup
      // 0ecf: sipush 21546
      // 0ed2: ldc2_w 5426761049271774337
      // 0ed5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0ed8: sipush 18785
      // 0edb: ldc2_w 7059161105789628815
      // 0ede: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0ee1: castore
      // 0ee2: dup
      // 0ee3: sipush 15193
      // 0ee6: ldc2_w 2389375293862495046
      // 0ee9: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0eec: sipush 16654
      // 0eef: ldc2_w 8574482885912836352
      // 0ef2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0ef5: castore
      // 0ef6: dup
      // 0ef7: sipush 19563
      // 0efa: ldc2_w 981167762409370815
      // 0efd: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0f00: sipush 18184
      // 0f03: ldc2_w 4483245699943153660
      // 0f06: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0f09: castore
      // 0f0a: dup
      // 0f0b: sipush 17064
      // 0f0e: ldc2_w 1094932302035892818
      // 0f11: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0f14: sipush 16654
      // 0f17: ldc2_w 8574482885912836352
      // 0f1a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0f1d: castore
      // 0f1e: dup
      // 0f1f: sipush 23002
      // 0f22: ldc2_w 4151433421475029342
      // 0f25: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0f28: sipush 22251
      // 0f2b: ldc2_w 183965713644596742
      // 0f2e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0f31: castore
      // 0f32: dup
      // 0f33: sipush 17718
      // 0f36: ldc2_w 438627729052122547
      // 0f39: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0f3c: sipush 16654
      // 0f3f: ldc2_w 8574482885912836352
      // 0f42: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0f45: castore
      // 0f46: dup
      // 0f47: sipush 23011
      // 0f4a: ldc2_w 5758432979682828614
      // 0f4d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0f50: sipush 16563
      // 0f53: ldc2_w 2682085708563560504
      // 0f56: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0f59: castore
      // 0f5a: dup
      // 0f5b: sipush 19676
      // 0f5e: ldc2_w 9164554119732245767
      // 0f61: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0f64: sipush 16654
      // 0f67: ldc2_w 8574482885912836352
      // 0f6a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0f6d: castore
      // 0f6e: dup
      // 0f6f: sipush 17065
      // 0f72: ldc2_w 8505440891111619271
      // 0f75: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0f78: sipush 2193
      // 0f7b: ldc2_w 4252108287588298828
      // 0f7e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0f81: castore
      // 0f82: dup
      // 0f83: sipush 5704
      // 0f86: ldc2_w 4519106587962109678
      // 0f89: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0f8c: sipush 15387
      // 0f8f: ldc2_w 4897812516075979903
      // 0f92: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0f95: castore
      // 0f96: dup
      // 0f97: sipush 2663
      // 0f9a: ldc2_w 4383746037785260728
      // 0f9d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0fa0: sipush 3570
      // 0fa3: ldc2_w 186475829377889640
      // 0fa6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0fa9: castore
      // 0faa: dup
      // 0fab: sipush 18785
      // 0fae: ldc2_w 7059161105789628815
      // 0fb1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0fb4: sipush 15387
      // 0fb7: ldc2_w 4897812516075979903
      // 0fba: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0fbd: castore
      // 0fbe: dup
      // 0fbf: sipush 18184
      // 0fc2: ldc2_w 4483245699943153660
      // 0fc5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0fc8: sipush 16654
      // 0fcb: ldc2_w 8574482885912836352
      // 0fce: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0fd1: castore
      // 0fd2: dup
      // 0fd3: sipush 22251
      // 0fd6: ldc2_w 183965713644596742
      // 0fd9: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0fdc: sipush 15387
      // 0fdf: ldc2_w 4897812516075979903
      // 0fe2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0fe5: castore
      // 0fe6: dup
      // 0fe7: sipush 16563
      // 0fea: ldc2_w 2682085708563560504
      // 0fed: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0ff0: sipush 15387
      // 0ff3: ldc2_w 4897812516075979903
      // 0ff6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 0ff9: castore
      // 0ffa: dup
      // 0ffb: sipush 2193
      // 0ffe: ldc2_w 4252108287588298828
      // 1001: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1004: sipush 15387
      // 1007: ldc2_w 4897812516075979903
      // 100a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 100d: castore
      // 100e: dup
      // 100f: sipush 10142
      // 1012: ldc2_w 3584567914298761028
      // 1015: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1018: sipush 29613
      // 101b: ldc2_w 8327380352311004078
      // 101e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1021: castore
      // 1022: dup
      // 1023: sipush 7892
      // 1026: ldc2_w 1154625376319989497
      // 1029: invokestatic com/finalshell/core/S7.a (IJ)I
      // 102c: sipush 15387
      // 102f: ldc2_w 4897812516075979903
      // 1032: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1035: castore
      // 1036: dup
      // 1037: sipush 24479
      // 103a: ldc2_w 2585269231730992935
      // 103d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1040: sipush 21423
      // 1043: ldc2_w 7188274520085212119
      // 1046: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1049: castore
      // 104a: dup
      // 104b: sipush 12821
      // 104e: ldc2_w 5391248613197400688
      // 1051: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1054: sipush 15387
      // 1057: ldc2_w 4897812516075979903
      // 105a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 105d: castore
      // 105e: dup
      // 105f: sipush 27329
      // 1062: ldc2_w 8394172492225516210
      // 1065: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1068: sipush 31543
      // 106b: ldc2_w 7535909877894513425
      // 106e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1071: castore
      // 1072: dup
      // 1073: sipush 8203
      // 1076: ldc2_w 2791172401761900618
      // 1079: invokestatic com/finalshell/core/S7.a (IJ)I
      // 107c: sipush 15387
      // 107f: ldc2_w 4897812516075979903
      // 1082: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1085: castore
      // 1086: dup
      // 1087: sipush 3255
      // 108a: ldc2_w 8480612591136634007
      // 108d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1090: sipush 12047
      // 1093: ldc2_w 2695385713178367904
      // 1096: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1099: castore
      // 109a: dup
      // 109b: sipush 8975
      // 109e: ldc2_w 1664705615479036905
      // 10a1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 10a4: sipush 15387
      // 10a7: ldc2_w 4897812516075979903
      // 10aa: invokestatic com/finalshell/core/S7.a (IJ)I
      // 10ad: castore
      // 10ae: dup
      // 10af: sipush 30556
      // 10b2: ldc2_w 5874260231553388349
      // 10b5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 10b8: sipush 21546
      // 10bb: ldc2_w 5426761049271774337
      // 10be: invokestatic com/finalshell/core/S7.a (IJ)I
      // 10c1: castore
      // 10c2: dup
      // 10c3: sipush 21472
      // 10c6: ldc2_w 1105705110532402154
      // 10c9: invokestatic com/finalshell/core/S7.a (IJ)I
      // 10cc: sipush 15387
      // 10cf: ldc2_w 4897812516075979903
      // 10d2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 10d5: castore
      // 10d6: dup
      // 10d7: sipush 2443
      // 10da: ldc2_w 4924057729870918025
      // 10dd: invokestatic com/finalshell/core/S7.a (IJ)I
      // 10e0: sipush 15193
      // 10e3: ldc2_w 2389375293862495046
      // 10e6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 10e9: castore
      // 10ea: dup
      // 10eb: sipush 32471
      // 10ee: ldc2_w 640191503365899899
      // 10f1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 10f4: sipush 15387
      // 10f7: ldc2_w 4897812516075979903
      // 10fa: invokestatic com/finalshell/core/S7.a (IJ)I
      // 10fd: castore
      // 10fe: dup
      // 10ff: sipush 29452
      // 1102: ldc2_w 2759576877660179294
      // 1105: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1108: sipush 19563
      // 110b: ldc2_w 981167762409370815
      // 110e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1111: castore
      // 1112: dup
      // 1113: sipush 30244
      // 1116: ldc2_w 3205044514282212889
      // 1119: invokestatic com/finalshell/core/S7.a (IJ)I
      // 111c: sipush 15387
      // 111f: ldc2_w 4897812516075979903
      // 1122: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1125: castore
      // 1126: dup
      // 1127: sipush 14504
      // 112a: ldc2_w 5791889130042802427
      // 112d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1130: sipush 2663
      // 1133: ldc2_w 4383746037785260728
      // 1136: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1139: castore
      // 113a: dup
      // 113b: sipush 21133
      // 113e: ldc2_w 6806369281270459217
      // 1141: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1144: sipush 15387
      // 1147: ldc2_w 4897812516075979903
      // 114a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 114d: castore
      // 114e: dup
      // 114f: sipush 32565
      // 1152: ldc2_w 5064042799757035397
      // 1155: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1158: sipush 18785
      // 115b: ldc2_w 7059161105789628815
      // 115e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1161: castore
      // 1162: dup
      // 1163: sipush 21578
      // 1166: ldc2_w 1815355392160443561
      // 1169: invokestatic com/finalshell/core/S7.a (IJ)I
      // 116c: sipush 15387
      // 116f: ldc2_w 4897812516075979903
      // 1172: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1175: castore
      // 1176: dup
      // 1177: sipush 20651
      // 117a: ldc2_w 4883785133056370763
      // 117d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1180: sipush 18184
      // 1183: ldc2_w 4483245699943153660
      // 1186: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1189: castore
      // 118a: dup
      // 118b: sipush 12276
      // 118e: ldc2_w 4651341756621379338
      // 1191: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1194: sipush 15387
      // 1197: ldc2_w 4897812516075979903
      // 119a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 119d: castore
      // 119e: dup
      // 119f: sipush 25720
      // 11a2: ldc2_w 2901518956572417079
      // 11a5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 11a8: sipush 22251
      // 11ab: ldc2_w 183965713644596742
      // 11ae: invokestatic com/finalshell/core/S7.a (IJ)I
      // 11b1: castore
      // 11b2: dup
      // 11b3: sipush 6917
      // 11b6: ldc2_w 7015247155460694818
      // 11b9: invokestatic com/finalshell/core/S7.a (IJ)I
      // 11bc: sipush 15387
      // 11bf: ldc2_w 4897812516075979903
      // 11c2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 11c5: castore
      // 11c6: dup
      // 11c7: sipush 20929
      // 11ca: ldc2_w 3097620516605602285
      // 11cd: invokestatic com/finalshell/core/S7.a (IJ)I
      // 11d0: sipush 16563
      // 11d3: ldc2_w 2682085708563560504
      // 11d6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 11d9: castore
      // 11da: dup
      // 11db: sipush 26680
      // 11de: ldc2_w 9033988385244680409
      // 11e1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 11e4: sipush 15387
      // 11e7: ldc2_w 4897812516075979903
      // 11ea: invokestatic com/finalshell/core/S7.a (IJ)I
      // 11ed: castore
      // 11ee: dup
      // 11ef: sipush 28021
      // 11f2: ldc2_w 3686819205896836515
      // 11f5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 11f8: sipush 2193
      // 11fb: ldc2_w 4252108287588298828
      // 11fe: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1201: castore
      // 1202: putstatic com/finalshell/core/S7.n [C
      // 1205: sipush 28560
      // 1208: ldc2_w 2736387800709601080
      // 120b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 120e: newarray 5
      // 1210: dup
      // 1211: bipush 0
      // 1212: sipush 3570
      // 1215: ldc2_w 186475829377889640
      // 1218: invokestatic com/finalshell/core/S7.a (IJ)I
      // 121b: castore
      // 121c: dup
      // 121d: bipush 1
      // 121e: sipush 16654
      // 1221: ldc2_w 8574482885912836352
      // 1224: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1227: castore
      // 1228: dup
      // 1229: bipush 2
      // 122a: sipush 15387
      // 122d: ldc2_w 4897812516075979903
      // 1230: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1233: castore
      // 1234: dup
      // 1235: bipush 3
      // 1236: sipush 29613
      // 1239: ldc2_w 8327380352311004078
      // 123c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 123f: castore
      // 1240: dup
      // 1241: bipush 4
      // 1242: sipush 21423
      // 1245: ldc2_w 7188274520085212119
      // 1248: invokestatic com/finalshell/core/S7.a (IJ)I
      // 124b: castore
      // 124c: dup
      // 124d: bipush 5
      // 124e: sipush 31543
      // 1251: ldc2_w 7535909877894513425
      // 1254: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1257: castore
      // 1258: dup
      // 1259: sipush 17642
      // 125c: ldc2_w 3973525135493741602
      // 125f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1262: sipush 12047
      // 1265: ldc2_w 2695385713178367904
      // 1268: invokestatic com/finalshell/core/S7.a (IJ)I
      // 126b: castore
      // 126c: dup
      // 126d: sipush 25120
      // 1270: ldc2_w 6587103157852772946
      // 1273: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1276: sipush 21546
      // 1279: ldc2_w 5426761049271774337
      // 127c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 127f: castore
      // 1280: dup
      // 1281: sipush 29230
      // 1284: ldc2_w 2245239911286966921
      // 1287: invokestatic com/finalshell/core/S7.a (IJ)I
      // 128a: sipush 15193
      // 128d: ldc2_w 2389375293862495046
      // 1290: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1293: castore
      // 1294: dup
      // 1295: sipush 27609
      // 1298: ldc2_w 3655570642081551163
      // 129b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 129e: sipush 19563
      // 12a1: ldc2_w 981167762409370815
      // 12a4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 12a7: castore
      // 12a8: dup
      // 12a9: sipush 19431
      // 12ac: ldc2_w 3995733026905961425
      // 12af: invokestatic com/finalshell/core/S7.a (IJ)I
      // 12b2: sipush 24676
      // 12b5: ldc2_w 6451437090994624546
      // 12b8: invokestatic com/finalshell/core/S7.a (IJ)I
      // 12bb: castore
      // 12bc: dup
      // 12bd: sipush 28542
      // 12c0: ldc2_w 7267679887026886515
      // 12c3: invokestatic com/finalshell/core/S7.a (IJ)I
      // 12c6: sipush 31743
      // 12c9: ldc2_w 8265164723454280575
      // 12cc: invokestatic com/finalshell/core/S7.a (IJ)I
      // 12cf: castore
      // 12d0: dup
      // 12d1: sipush 215
      // 12d4: ldc2_w 8160882664965077241
      // 12d7: invokestatic com/finalshell/core/S7.a (IJ)I
      // 12da: sipush 16114
      // 12dd: ldc2_w 6984324431105312304
      // 12e0: invokestatic com/finalshell/core/S7.a (IJ)I
      // 12e3: castore
      // 12e4: dup
      // 12e5: sipush 22597
      // 12e8: ldc2_w 5988630053160427604
      // 12eb: invokestatic com/finalshell/core/S7.a (IJ)I
      // 12ee: sipush 24103
      // 12f1: ldc2_w 1775575711360820854
      // 12f4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 12f7: castore
      // 12f8: dup
      // 12f9: sipush 8553
      // 12fc: ldc2_w 5208731264043899322
      // 12ff: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1302: sipush 4724
      // 1305: ldc2_w 3467001477666433581
      // 1308: invokestatic com/finalshell/core/S7.a (IJ)I
      // 130b: castore
      // 130c: dup
      // 130d: sipush 30676
      // 1310: ldc2_w 5956089045550829544
      // 1313: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1316: sipush 28502
      // 1319: ldc2_w 2154740991162980106
      // 131c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 131f: castore
      // 1320: dup
      // 1321: sipush 4739
      // 1324: ldc2_w 5831792552873355921
      // 1327: invokestatic com/finalshell/core/S7.a (IJ)I
      // 132a: sipush 23212
      // 132d: ldc2_w 6696557605221245520
      // 1330: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1333: castore
      // 1334: dup
      // 1335: sipush 31240
      // 1338: ldc2_w 8643570179020620392
      // 133b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 133e: sipush 32576
      // 1341: ldc2_w 4377248719883962174
      // 1344: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1347: castore
      // 1348: dup
      // 1349: sipush 1558
      // 134c: ldc2_w 2915472958089854672
      // 134f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1352: sipush 29941
      // 1355: ldc2_w 7392953051473054768
      // 1358: invokestatic com/finalshell/core/S7.a (IJ)I
      // 135b: castore
      // 135c: dup
      // 135d: sipush 19937
      // 1360: ldc2_w 1202565405225530849
      // 1363: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1366: sipush 3281
      // 1369: ldc2_w 1685242245515801676
      // 136c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 136f: castore
      // 1370: dup
      // 1371: sipush 1436
      // 1374: ldc2_w 1583665784747654488
      // 1377: invokestatic com/finalshell/core/S7.a (IJ)I
      // 137a: sipush 23108
      // 137d: ldc2_w 7863474970210280170
      // 1380: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1383: castore
      // 1384: dup
      // 1385: sipush 2666
      // 1388: ldc2_w 6468706646099620568
      // 138b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 138e: sipush 7651
      // 1391: ldc2_w 9038881232675104166
      // 1394: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1397: castore
      // 1398: dup
      // 1399: sipush 20238
      // 139c: ldc2_w 9167095845291177860
      // 139f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 13a2: sipush 6581
      // 13a5: ldc2_w 8824198512073236926
      // 13a8: invokestatic com/finalshell/core/S7.a (IJ)I
      // 13ab: castore
      // 13ac: dup
      // 13ad: sipush 12465
      // 13b0: ldc2_w 2473427269576149359
      // 13b3: invokestatic com/finalshell/core/S7.a (IJ)I
      // 13b6: sipush 25581
      // 13b9: ldc2_w 2946928390100032324
      // 13bc: invokestatic com/finalshell/core/S7.a (IJ)I
      // 13bf: castore
      // 13c0: dup
      // 13c1: sipush 13871
      // 13c4: ldc2_w 7071966724962799252
      // 13c7: invokestatic com/finalshell/core/S7.a (IJ)I
      // 13ca: sipush 19458
      // 13cd: ldc2_w 6741065371820733581
      // 13d0: invokestatic com/finalshell/core/S7.a (IJ)I
      // 13d3: castore
      // 13d4: dup
      // 13d5: sipush 12900
      // 13d8: ldc2_w 5474620062827039449
      // 13db: invokestatic com/finalshell/core/S7.a (IJ)I
      // 13de: sipush 5454
      // 13e1: ldc2_w 6619751150468066565
      // 13e4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 13e7: castore
      // 13e8: dup
      // 13e9: sipush 22907
      // 13ec: ldc2_w 3408899665999077836
      // 13ef: invokestatic com/finalshell/core/S7.a (IJ)I
      // 13f2: sipush 7947
      // 13f5: ldc2_w 4402876106475923228
      // 13f8: invokestatic com/finalshell/core/S7.a (IJ)I
      // 13fb: castore
      // 13fc: dup
      // 13fd: sipush 20909
      // 1400: ldc2_w 5884136630793218486
      // 1403: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1406: sipush 13487
      // 1409: ldc2_w 8134125405685599430
      // 140c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 140f: castore
      // 1410: dup
      // 1411: sipush 254
      // 1414: ldc2_w 1928851718655768741
      // 1417: invokestatic com/finalshell/core/S7.a (IJ)I
      // 141a: sipush 24650
      // 141d: ldc2_w 8626107750709237818
      // 1420: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1423: castore
      // 1424: dup
      // 1425: sipush 2587
      // 1428: ldc2_w 5072776505336951383
      // 142b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 142e: sipush 18042
      // 1431: ldc2_w 9163293602662432491
      // 1434: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1437: castore
      // 1438: dup
      // 1439: sipush 6826
      // 143c: ldc2_w 2332032890832216784
      // 143f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1442: sipush 22227
      // 1445: ldc2_w 5420404786866433621
      // 1448: invokestatic com/finalshell/core/S7.a (IJ)I
      // 144b: castore
      // 144c: dup
      // 144d: sipush 26611
      // 1450: ldc2_w 2662960648625135594
      // 1453: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1456: sipush 10613
      // 1459: ldc2_w 7786854547876532682
      // 145c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 145f: castore
      // 1460: dup
      // 1461: sipush 24797
      // 1464: ldc2_w 448430736190675098
      // 1467: invokestatic com/finalshell/core/S7.a (IJ)I
      // 146a: sipush 28469
      // 146d: ldc2_w 3635002100499847072
      // 1470: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1473: castore
      // 1474: dup
      // 1475: sipush 5815
      // 1478: ldc2_w 6494113799228452552
      // 147b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 147e: sipush 24025
      // 1481: ldc2_w 6191773752426210644
      // 1484: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1487: castore
      // 1488: dup
      // 1489: sipush 32456
      // 148c: ldc2_w 2698850499816130138
      // 148f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1492: sipush 29569
      // 1495: ldc2_w 3132828126280715040
      // 1498: invokestatic com/finalshell/core/S7.a (IJ)I
      // 149b: castore
      // 149c: dup
      // 149d: sipush 15065
      // 14a0: ldc2_w 4686944891820032613
      // 14a3: invokestatic com/finalshell/core/S7.a (IJ)I
      // 14a6: sipush 18568
      // 14a9: ldc2_w 434742340025430158
      // 14ac: invokestatic com/finalshell/core/S7.a (IJ)I
      // 14af: castore
      // 14b0: putstatic com/finalshell/core/S7.R [C
      // 14b3: sipush 24103
      // 14b6: ldc2_w 1775575711360820854
      // 14b9: invokestatic com/finalshell/core/S7.a (IJ)I
      // 14bc: newarray 5
      // 14be: dup
      // 14bf: bipush 0
      // 14c0: sipush 3570
      // 14c3: ldc2_w 186475829377889640
      // 14c6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 14c9: castore
      // 14ca: dup
      // 14cb: bipush 1
      // 14cc: sipush 3570
      // 14cf: ldc2_w 186475829377889640
      // 14d2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 14d5: castore
      // 14d6: dup
      // 14d7: bipush 2
      // 14d8: sipush 3570
      // 14db: ldc2_w 186475829377889640
      // 14de: invokestatic com/finalshell/core/S7.a (IJ)I
      // 14e1: castore
      // 14e2: dup
      // 14e3: bipush 3
      // 14e4: sipush 3570
      // 14e7: ldc2_w 186475829377889640
      // 14ea: invokestatic com/finalshell/core/S7.a (IJ)I
      // 14ed: castore
      // 14ee: dup
      // 14ef: bipush 4
      // 14f0: sipush 3570
      // 14f3: ldc2_w 186475829377889640
      // 14f6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 14f9: castore
      // 14fa: dup
      // 14fb: bipush 5
      // 14fc: sipush 3570
      // 14ff: ldc2_w 186475829377889640
      // 1502: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1505: castore
      // 1506: dup
      // 1507: sipush 17642
      // 150a: ldc2_w 3973525135493741602
      // 150d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1510: sipush 3570
      // 1513: ldc2_w 186475829377889640
      // 1516: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1519: castore
      // 151a: dup
      // 151b: sipush 25120
      // 151e: ldc2_w 6587103157852772946
      // 1521: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1524: sipush 3570
      // 1527: ldc2_w 186475829377889640
      // 152a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 152d: castore
      // 152e: dup
      // 152f: sipush 29230
      // 1532: ldc2_w 2245239911286966921
      // 1535: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1538: sipush 3570
      // 153b: ldc2_w 186475829377889640
      // 153e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1541: castore
      // 1542: dup
      // 1543: sipush 27609
      // 1546: ldc2_w 3655570642081551163
      // 1549: invokestatic com/finalshell/core/S7.a (IJ)I
      // 154c: sipush 3570
      // 154f: ldc2_w 186475829377889640
      // 1552: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1555: castore
      // 1556: dup
      // 1557: sipush 19431
      // 155a: ldc2_w 3995733026905961425
      // 155d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1560: sipush 16654
      // 1563: ldc2_w 8574482885912836352
      // 1566: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1569: castore
      // 156a: dup
      // 156b: sipush 28542
      // 156e: ldc2_w 7267679887026886515
      // 1571: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1574: sipush 16654
      // 1577: ldc2_w 8574482885912836352
      // 157a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 157d: castore
      // 157e: dup
      // 157f: sipush 215
      // 1582: ldc2_w 8160882664965077241
      // 1585: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1588: sipush 16654
      // 158b: ldc2_w 8574482885912836352
      // 158e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1591: castore
      // 1592: dup
      // 1593: sipush 22597
      // 1596: ldc2_w 5988630053160427604
      // 1599: invokestatic com/finalshell/core/S7.a (IJ)I
      // 159c: sipush 16654
      // 159f: ldc2_w 8574482885912836352
      // 15a2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 15a5: castore
      // 15a6: dup
      // 15a7: sipush 8553
      // 15aa: ldc2_w 5208731264043899322
      // 15ad: invokestatic com/finalshell/core/S7.a (IJ)I
      // 15b0: sipush 16654
      // 15b3: ldc2_w 8574482885912836352
      // 15b6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 15b9: castore
      // 15ba: dup
      // 15bb: sipush 30676
      // 15be: ldc2_w 5956089045550829544
      // 15c1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 15c4: sipush 16654
      // 15c7: ldc2_w 8574482885912836352
      // 15ca: invokestatic com/finalshell/core/S7.a (IJ)I
      // 15cd: castore
      // 15ce: dup
      // 15cf: sipush 4739
      // 15d2: ldc2_w 5831792552873355921
      // 15d5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 15d8: sipush 16654
      // 15db: ldc2_w 8574482885912836352
      // 15de: invokestatic com/finalshell/core/S7.a (IJ)I
      // 15e1: castore
      // 15e2: dup
      // 15e3: sipush 31240
      // 15e6: ldc2_w 8643570179020620392
      // 15e9: invokestatic com/finalshell/core/S7.a (IJ)I
      // 15ec: sipush 16654
      // 15ef: ldc2_w 8574482885912836352
      // 15f2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 15f5: castore
      // 15f6: dup
      // 15f7: sipush 1558
      // 15fa: ldc2_w 2915472958089854672
      // 15fd: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1600: sipush 16654
      // 1603: ldc2_w 8574482885912836352
      // 1606: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1609: castore
      // 160a: dup
      // 160b: sipush 19937
      // 160e: ldc2_w 1202565405225530849
      // 1611: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1614: sipush 16654
      // 1617: ldc2_w 8574482885912836352
      // 161a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 161d: castore
      // 161e: dup
      // 161f: sipush 1436
      // 1622: ldc2_w 1583665784747654488
      // 1625: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1628: sipush 15387
      // 162b: ldc2_w 4897812516075979903
      // 162e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1631: castore
      // 1632: dup
      // 1633: sipush 2666
      // 1636: ldc2_w 6468706646099620568
      // 1639: invokestatic com/finalshell/core/S7.a (IJ)I
      // 163c: sipush 15387
      // 163f: ldc2_w 4897812516075979903
      // 1642: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1645: castore
      // 1646: dup
      // 1647: sipush 20238
      // 164a: ldc2_w 9167095845291177860
      // 164d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1650: sipush 15387
      // 1653: ldc2_w 4897812516075979903
      // 1656: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1659: castore
      // 165a: dup
      // 165b: sipush 12465
      // 165e: ldc2_w 2473427269576149359
      // 1661: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1664: sipush 15387
      // 1667: ldc2_w 4897812516075979903
      // 166a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 166d: castore
      // 166e: dup
      // 166f: sipush 13871
      // 1672: ldc2_w 7071966724962799252
      // 1675: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1678: sipush 15387
      // 167b: ldc2_w 4897812516075979903
      // 167e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1681: castore
      // 1682: dup
      // 1683: sipush 12900
      // 1686: ldc2_w 5474620062827039449
      // 1689: invokestatic com/finalshell/core/S7.a (IJ)I
      // 168c: sipush 15387
      // 168f: ldc2_w 4897812516075979903
      // 1692: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1695: castore
      // 1696: dup
      // 1697: sipush 22907
      // 169a: ldc2_w 3408899665999077836
      // 169d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 16a0: sipush 15387
      // 16a3: ldc2_w 4897812516075979903
      // 16a6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 16a9: castore
      // 16aa: dup
      // 16ab: sipush 20909
      // 16ae: ldc2_w 5884136630793218486
      // 16b1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 16b4: sipush 15387
      // 16b7: ldc2_w 4897812516075979903
      // 16ba: invokestatic com/finalshell/core/S7.a (IJ)I
      // 16bd: castore
      // 16be: dup
      // 16bf: sipush 254
      // 16c2: ldc2_w 1928851718655768741
      // 16c5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 16c8: sipush 15387
      // 16cb: ldc2_w 4897812516075979903
      // 16ce: invokestatic com/finalshell/core/S7.a (IJ)I
      // 16d1: castore
      // 16d2: dup
      // 16d3: sipush 2587
      // 16d6: ldc2_w 5072776505336951383
      // 16d9: invokestatic com/finalshell/core/S7.a (IJ)I
      // 16dc: sipush 15387
      // 16df: ldc2_w 4897812516075979903
      // 16e2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 16e5: castore
      // 16e6: dup
      // 16e7: sipush 6826
      // 16ea: ldc2_w 2332032890832216784
      // 16ed: invokestatic com/finalshell/core/S7.a (IJ)I
      // 16f0: sipush 29613
      // 16f3: ldc2_w 8327380352311004078
      // 16f6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 16f9: castore
      // 16fa: dup
      // 16fb: sipush 26611
      // 16fe: ldc2_w 2662960648625135594
      // 1701: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1704: sipush 29613
      // 1707: ldc2_w 8327380352311004078
      // 170a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 170d: castore
      // 170e: dup
      // 170f: sipush 24797
      // 1712: ldc2_w 448430736190675098
      // 1715: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1718: sipush 29613
      // 171b: ldc2_w 8327380352311004078
      // 171e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1721: castore
      // 1722: dup
      // 1723: sipush 5815
      // 1726: ldc2_w 6494113799228452552
      // 1729: invokestatic com/finalshell/core/S7.a (IJ)I
      // 172c: sipush 29613
      // 172f: ldc2_w 8327380352311004078
      // 1732: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1735: castore
      // 1736: dup
      // 1737: sipush 32456
      // 173a: ldc2_w 2698850499816130138
      // 173d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1740: sipush 29613
      // 1743: ldc2_w 8327380352311004078
      // 1746: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1749: castore
      // 174a: dup
      // 174b: sipush 15065
      // 174e: ldc2_w 4686944891820032613
      // 1751: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1754: sipush 29613
      // 1757: ldc2_w 8327380352311004078
      // 175a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 175d: castore
      // 175e: dup
      // 175f: sipush 28560
      // 1762: ldc2_w 2736387800709601080
      // 1765: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1768: sipush 29613
      // 176b: ldc2_w 8327380352311004078
      // 176e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1771: castore
      // 1772: dup
      // 1773: sipush 24041
      // 1776: ldc2_w 2102703235999245686
      // 1779: invokestatic com/finalshell/core/S7.a (IJ)I
      // 177c: sipush 29613
      // 177f: ldc2_w 8327380352311004078
      // 1782: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1785: castore
      // 1786: dup
      // 1787: sipush 2360
      // 178a: ldc2_w 731847633927664014
      // 178d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1790: sipush 29613
      // 1793: ldc2_w 8327380352311004078
      // 1796: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1799: castore
      // 179a: dup
      // 179b: sipush 29877
      // 179e: ldc2_w 769137449996749950
      // 17a1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 17a4: sipush 29613
      // 17a7: ldc2_w 8327380352311004078
      // 17aa: invokestatic com/finalshell/core/S7.a (IJ)I
      // 17ad: castore
      // 17ae: dup
      // 17af: sipush 17584
      // 17b2: ldc2_w 7192673270105750659
      // 17b5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 17b8: sipush 21423
      // 17bb: ldc2_w 7188274520085212119
      // 17be: invokestatic com/finalshell/core/S7.a (IJ)I
      // 17c1: castore
      // 17c2: dup
      // 17c3: sipush 10778
      // 17c6: ldc2_w 1846284221723890265
      // 17c9: invokestatic com/finalshell/core/S7.a (IJ)I
      // 17cc: sipush 21423
      // 17cf: ldc2_w 7188274520085212119
      // 17d2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 17d5: castore
      // 17d6: dup
      // 17d7: sipush 30210
      // 17da: ldc2_w 8524088374286061262
      // 17dd: invokestatic com/finalshell/core/S7.a (IJ)I
      // 17e0: sipush 21423
      // 17e3: ldc2_w 7188274520085212119
      // 17e6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 17e9: castore
      // 17ea: dup
      // 17eb: sipush 17695
      // 17ee: ldc2_w 6780217667835575621
      // 17f1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 17f4: sipush 21423
      // 17f7: ldc2_w 7188274520085212119
      // 17fa: invokestatic com/finalshell/core/S7.a (IJ)I
      // 17fd: castore
      // 17fe: dup
      // 17ff: sipush 20412
      // 1802: ldc2_w 67643488147814371
      // 1805: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1808: sipush 21423
      // 180b: ldc2_w 7188274520085212119
      // 180e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1811: castore
      // 1812: dup
      // 1813: sipush 9789
      // 1816: ldc2_w 6813733451080457837
      // 1819: invokestatic com/finalshell/core/S7.a (IJ)I
      // 181c: sipush 21423
      // 181f: ldc2_w 7188274520085212119
      // 1822: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1825: castore
      // 1826: dup
      // 1827: sipush 31969
      // 182a: ldc2_w 6775301332646561012
      // 182d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1830: sipush 21423
      // 1833: ldc2_w 7188274520085212119
      // 1836: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1839: castore
      // 183a: dup
      // 183b: sipush 19328
      // 183e: ldc2_w 2737502463315948408
      // 1841: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1844: sipush 21423
      // 1847: ldc2_w 7188274520085212119
      // 184a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 184d: castore
      // 184e: dup
      // 184f: sipush 3570
      // 1852: ldc2_w 186475829377889640
      // 1855: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1858: sipush 21423
      // 185b: ldc2_w 7188274520085212119
      // 185e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1861: castore
      // 1862: dup
      // 1863: sipush 16654
      // 1866: ldc2_w 8574482885912836352
      // 1869: invokestatic com/finalshell/core/S7.a (IJ)I
      // 186c: sipush 21423
      // 186f: ldc2_w 7188274520085212119
      // 1872: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1875: castore
      // 1876: dup
      // 1877: sipush 15387
      // 187a: ldc2_w 4897812516075979903
      // 187d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1880: sipush 31543
      // 1883: ldc2_w 7535909877894513425
      // 1886: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1889: castore
      // 188a: dup
      // 188b: sipush 29613
      // 188e: ldc2_w 8327380352311004078
      // 1891: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1894: sipush 31543
      // 1897: ldc2_w 7535909877894513425
      // 189a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 189d: castore
      // 189e: dup
      // 189f: sipush 21423
      // 18a2: ldc2_w 7188274520085212119
      // 18a5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 18a8: sipush 31543
      // 18ab: ldc2_w 7535909877894513425
      // 18ae: invokestatic com/finalshell/core/S7.a (IJ)I
      // 18b1: castore
      // 18b2: dup
      // 18b3: sipush 31543
      // 18b6: ldc2_w 7535909877894513425
      // 18b9: invokestatic com/finalshell/core/S7.a (IJ)I
      // 18bc: sipush 31543
      // 18bf: ldc2_w 7535909877894513425
      // 18c2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 18c5: castore
      // 18c6: dup
      // 18c7: sipush 12047
      // 18ca: ldc2_w 2695385713178367904
      // 18cd: invokestatic com/finalshell/core/S7.a (IJ)I
      // 18d0: sipush 31543
      // 18d3: ldc2_w 7535909877894513425
      // 18d6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 18d9: castore
      // 18da: dup
      // 18db: sipush 21546
      // 18de: ldc2_w 5426761049271774337
      // 18e1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 18e4: sipush 31543
      // 18e7: ldc2_w 7535909877894513425
      // 18ea: invokestatic com/finalshell/core/S7.a (IJ)I
      // 18ed: castore
      // 18ee: dup
      // 18ef: sipush 15193
      // 18f2: ldc2_w 2389375293862495046
      // 18f5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 18f8: sipush 31543
      // 18fb: ldc2_w 7535909877894513425
      // 18fe: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1901: castore
      // 1902: dup
      // 1903: sipush 19563
      // 1906: ldc2_w 981167762409370815
      // 1909: invokestatic com/finalshell/core/S7.a (IJ)I
      // 190c: sipush 31543
      // 190f: ldc2_w 7535909877894513425
      // 1912: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1915: castore
      // 1916: dup
      // 1917: sipush 30207
      // 191a: ldc2_w 6249287951380188666
      // 191d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1920: sipush 31543
      // 1923: ldc2_w 7535909877894513425
      // 1926: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1929: castore
      // 192a: dup
      // 192b: sipush 9691
      // 192e: ldc2_w 3031765212954811737
      // 1931: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1934: sipush 31543
      // 1937: ldc2_w 7535909877894513425
      // 193a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 193d: castore
      // 193e: dup
      // 193f: sipush 9930
      // 1942: ldc2_w 2247103227626151701
      // 1945: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1948: sipush 12047
      // 194b: ldc2_w 2695385713178367904
      // 194e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1951: castore
      // 1952: dup
      // 1953: sipush 23011
      // 1956: ldc2_w 5758432979682828614
      // 1959: invokestatic com/finalshell/core/S7.a (IJ)I
      // 195c: sipush 12047
      // 195f: ldc2_w 2695385713178367904
      // 1962: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1965: castore
      // 1966: dup
      // 1967: sipush 11403
      // 196a: ldc2_w 2437952374923285741
      // 196d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1970: sipush 12047
      // 1973: ldc2_w 2695385713178367904
      // 1976: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1979: castore
      // 197a: dup
      // 197b: sipush 17065
      // 197e: ldc2_w 8505440891111619271
      // 1981: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1984: sipush 12047
      // 1987: ldc2_w 2695385713178367904
      // 198a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 198d: castore
      // 198e: dup
      // 198f: sipush 24224
      // 1992: ldc2_w 8873883753299814108
      // 1995: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1998: sipush 12047
      // 199b: ldc2_w 2695385713178367904
      // 199e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 19a1: castore
      // 19a2: dup
      // 19a3: sipush 2663
      // 19a6: ldc2_w 4383746037785260728
      // 19a9: invokestatic com/finalshell/core/S7.a (IJ)I
      // 19ac: sipush 12047
      // 19af: ldc2_w 2695385713178367904
      // 19b2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 19b5: castore
      // 19b6: dup
      // 19b7: sipush 18785
      // 19ba: ldc2_w 7059161105789628815
      // 19bd: invokestatic com/finalshell/core/S7.a (IJ)I
      // 19c0: sipush 12047
      // 19c3: ldc2_w 2695385713178367904
      // 19c6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 19c9: castore
      // 19ca: dup
      // 19cb: sipush 18184
      // 19ce: ldc2_w 4483245699943153660
      // 19d1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 19d4: sipush 12047
      // 19d7: ldc2_w 2695385713178367904
      // 19da: invokestatic com/finalshell/core/S7.a (IJ)I
      // 19dd: castore
      // 19de: dup
      // 19df: sipush 22251
      // 19e2: ldc2_w 183965713644596742
      // 19e5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 19e8: sipush 12047
      // 19eb: ldc2_w 2695385713178367904
      // 19ee: invokestatic com/finalshell/core/S7.a (IJ)I
      // 19f1: castore
      // 19f2: dup
      // 19f3: sipush 16563
      // 19f6: ldc2_w 2682085708563560504
      // 19f9: invokestatic com/finalshell/core/S7.a (IJ)I
      // 19fc: sipush 12047
      // 19ff: ldc2_w 2695385713178367904
      // 1a02: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1a05: castore
      // 1a06: dup
      // 1a07: sipush 2193
      // 1a0a: ldc2_w 4252108287588298828
      // 1a0d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1a10: sipush 21546
      // 1a13: ldc2_w 5426761049271774337
      // 1a16: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1a19: castore
      // 1a1a: dup
      // 1a1b: sipush 26773
      // 1a1e: ldc2_w 7466392842129674434
      // 1a21: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1a24: sipush 21546
      // 1a27: ldc2_w 5426761049271774337
      // 1a2a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1a2d: castore
      // 1a2e: dup
      // 1a2f: sipush 8836
      // 1a32: ldc2_w 9116825966867831463
      // 1a35: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1a38: sipush 21546
      // 1a3b: ldc2_w 5426761049271774337
      // 1a3e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1a41: castore
      // 1a42: dup
      // 1a43: sipush 6736
      // 1a46: ldc2_w 1251542828607693379
      // 1a49: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1a4c: sipush 21546
      // 1a4f: ldc2_w 5426761049271774337
      // 1a52: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1a55: castore
      // 1a56: dup
      // 1a57: sipush 4824
      // 1a5a: ldc2_w 825090830435642090
      // 1a5d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1a60: sipush 21546
      // 1a63: ldc2_w 5426761049271774337
      // 1a66: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1a69: castore
      // 1a6a: dup
      // 1a6b: sipush 2012
      // 1a6e: ldc2_w 8366586163824525063
      // 1a71: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1a74: sipush 21546
      // 1a77: ldc2_w 5426761049271774337
      // 1a7a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1a7d: castore
      // 1a7e: dup
      // 1a7f: sipush 8203
      // 1a82: ldc2_w 2791172401761900618
      // 1a85: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1a88: sipush 21546
      // 1a8b: ldc2_w 5426761049271774337
      // 1a8e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1a91: castore
      // 1a92: dup
      // 1a93: sipush 20440
      // 1a96: ldc2_w 5172216125283284911
      // 1a99: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1a9c: sipush 21546
      // 1a9f: ldc2_w 5426761049271774337
      // 1aa2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1aa5: castore
      // 1aa6: dup
      // 1aa7: sipush 8975
      // 1aaa: ldc2_w 1664705615479036905
      // 1aad: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1ab0: sipush 21546
      // 1ab3: ldc2_w 5426761049271774337
      // 1ab6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1ab9: castore
      // 1aba: dup
      // 1abb: sipush 23196
      // 1abe: ldc2_w 5070844906949976623
      // 1ac1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1ac4: sipush 21546
      // 1ac7: ldc2_w 5426761049271774337
      // 1aca: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1acd: castore
      // 1ace: dup
      // 1acf: sipush 22820
      // 1ad2: ldc2_w 6343531690172752184
      // 1ad5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1ad8: sipush 15193
      // 1adb: ldc2_w 2389375293862495046
      // 1ade: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1ae1: castore
      // 1ae2: dup
      // 1ae3: sipush 23426
      // 1ae6: ldc2_w 8794699937222763324
      // 1ae9: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1aec: sipush 15193
      // 1aef: ldc2_w 2389375293862495046
      // 1af2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1af5: castore
      // 1af6: dup
      // 1af7: sipush 11980
      // 1afa: ldc2_w 808507784137102851
      // 1afd: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1b00: sipush 15193
      // 1b03: ldc2_w 2389375293862495046
      // 1b06: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1b09: castore
      // 1b0a: dup
      // 1b0b: sipush 31124
      // 1b0e: ldc2_w 6895763767346692475
      // 1b11: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1b14: sipush 15193
      // 1b17: ldc2_w 2389375293862495046
      // 1b1a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1b1d: castore
      // 1b1e: dup
      // 1b1f: sipush 1824
      // 1b22: ldc2_w 7526674904609652551
      // 1b25: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1b28: sipush 15193
      // 1b2b: ldc2_w 2389375293862495046
      // 1b2e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1b31: castore
      // 1b32: dup
      // 1b33: sipush 23648
      // 1b36: ldc2_w 9101144564328244244
      // 1b39: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1b3c: sipush 15193
      // 1b3f: ldc2_w 2389375293862495046
      // 1b42: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1b45: castore
      // 1b46: dup
      // 1b47: sipush 406
      // 1b4a: ldc2_w 3767263824864475459
      // 1b4d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1b50: sipush 15193
      // 1b53: ldc2_w 2389375293862495046
      // 1b56: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1b59: castore
      // 1b5a: dup
      // 1b5b: sipush 19515
      // 1b5e: ldc2_w 382747400677438585
      // 1b61: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1b64: sipush 15193
      // 1b67: ldc2_w 2389375293862495046
      // 1b6a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1b6d: castore
      // 1b6e: dup
      // 1b6f: sipush 17686
      // 1b72: ldc2_w 2528729746332859772
      // 1b75: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1b78: sipush 15193
      // 1b7b: ldc2_w 2389375293862495046
      // 1b7e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1b81: castore
      // 1b82: dup
      // 1b83: sipush 16118
      // 1b86: ldc2_w 8512291825406985939
      // 1b89: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1b8c: sipush 15193
      // 1b8f: ldc2_w 2389375293862495046
      // 1b92: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1b95: castore
      // 1b96: dup
      // 1b97: sipush 12276
      // 1b9a: ldc2_w 4651341756621379338
      // 1b9d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1ba0: sipush 19563
      // 1ba3: ldc2_w 981167762409370815
      // 1ba6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1ba9: castore
      // 1baa: dup
      // 1bab: sipush 10267
      // 1bae: ldc2_w 193748105508507886
      // 1bb1: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1bb4: sipush 19563
      // 1bb7: ldc2_w 981167762409370815
      // 1bba: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1bbd: castore
      // 1bbe: dup
      // 1bbf: sipush 6917
      // 1bc2: ldc2_w 7015247155460694818
      // 1bc5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1bc8: sipush 19563
      // 1bcb: ldc2_w 981167762409370815
      // 1bce: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1bd1: castore
      // 1bd2: dup
      // 1bd3: sipush 20929
      // 1bd6: ldc2_w 3097620516605602285
      // 1bd9: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1bdc: sipush 19563
      // 1bdf: ldc2_w 981167762409370815
      // 1be2: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1be5: castore
      // 1be6: dup
      // 1be7: sipush 32104
      // 1bea: ldc2_w 3144124938221979077
      // 1bed: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1bf0: sipush 19563
      // 1bf3: ldc2_w 981167762409370815
      // 1bf6: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1bf9: castore
      // 1bfa: dup
      // 1bfb: sipush 28021
      // 1bfe: ldc2_w 3686819205896836515
      // 1c01: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1c04: sipush 19563
      // 1c07: ldc2_w 981167762409370815
      // 1c0a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1c0d: castore
      // 1c0e: dup
      // 1c0f: sipush 17076
      // 1c12: ldc2_w 5337207120134158964
      // 1c15: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1c18: sipush 19563
      // 1c1b: ldc2_w 981167762409370815
      // 1c1e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1c21: castore
      // 1c22: dup
      // 1c23: sipush 24676
      // 1c26: ldc2_w 6451437090994624546
      // 1c29: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1c2c: sipush 19563
      // 1c2f: ldc2_w 981167762409370815
      // 1c32: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1c35: castore
      // 1c36: dup
      // 1c37: sipush 31743
      // 1c3a: ldc2_w 8265164723454280575
      // 1c3d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1c40: sipush 19563
      // 1c43: ldc2_w 981167762409370815
      // 1c46: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1c49: castore
      // 1c4a: dup
      // 1c4b: sipush 8692
      // 1c4e: ldc2_w 4762556360350685592
      // 1c51: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1c54: sipush 19563
      // 1c57: ldc2_w 981167762409370815
      // 1c5a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1c5d: castore
      // 1c5e: putstatic com/finalshell/core/S7.T [C
      // 1c61: sipush 24103
      // 1c64: ldc2_w 1775575711360820854
      // 1c67: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1c6a: newarray 5
      // 1c6c: dup
      // 1c6d: bipush 0
      // 1c6e: sipush 3570
      // 1c71: ldc2_w 186475829377889640
      // 1c74: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1c77: castore
      // 1c78: dup
      // 1c79: bipush 1
      // 1c7a: sipush 16654
      // 1c7d: ldc2_w 8574482885912836352
      // 1c80: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1c83: castore
      // 1c84: dup
      // 1c85: bipush 2
      // 1c86: sipush 15387
      // 1c89: ldc2_w 4897812516075979903
      // 1c8c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1c8f: castore
      // 1c90: dup
      // 1c91: bipush 3
      // 1c92: sipush 29613
      // 1c95: ldc2_w 8327380352311004078
      // 1c98: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1c9b: castore
      // 1c9c: dup
      // 1c9d: bipush 4
      // 1c9e: sipush 21423
      // 1ca1: ldc2_w 7188274520085212119
      // 1ca4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1ca7: castore
      // 1ca8: dup
      // 1ca9: bipush 5
      // 1caa: sipush 31543
      // 1cad: ldc2_w 7535909877894513425
      // 1cb0: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1cb3: castore
      // 1cb4: dup
      // 1cb5: sipush 17642
      // 1cb8: ldc2_w 3973525135493741602
      // 1cbb: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1cbe: sipush 12047
      // 1cc1: ldc2_w 2695385713178367904
      // 1cc4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1cc7: castore
      // 1cc8: dup
      // 1cc9: sipush 25120
      // 1ccc: ldc2_w 6587103157852772946
      // 1ccf: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1cd2: sipush 21546
      // 1cd5: ldc2_w 5426761049271774337
      // 1cd8: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1cdb: castore
      // 1cdc: dup
      // 1cdd: sipush 29230
      // 1ce0: ldc2_w 2245239911286966921
      // 1ce3: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1ce6: sipush 15193
      // 1ce9: ldc2_w 2389375293862495046
      // 1cec: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1cef: castore
      // 1cf0: dup
      // 1cf1: sipush 27609
      // 1cf4: ldc2_w 3655570642081551163
      // 1cf7: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1cfa: sipush 19563
      // 1cfd: ldc2_w 981167762409370815
      // 1d00: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1d03: castore
      // 1d04: dup
      // 1d05: sipush 19431
      // 1d08: ldc2_w 3995733026905961425
      // 1d0b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1d0e: sipush 3570
      // 1d11: ldc2_w 186475829377889640
      // 1d14: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1d17: castore
      // 1d18: dup
      // 1d19: sipush 28542
      // 1d1c: ldc2_w 7267679887026886515
      // 1d1f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1d22: sipush 16654
      // 1d25: ldc2_w 8574482885912836352
      // 1d28: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1d2b: castore
      // 1d2c: dup
      // 1d2d: sipush 215
      // 1d30: ldc2_w 8160882664965077241
      // 1d33: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1d36: sipush 15387
      // 1d39: ldc2_w 4897812516075979903
      // 1d3c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1d3f: castore
      // 1d40: dup
      // 1d41: sipush 22597
      // 1d44: ldc2_w 5988630053160427604
      // 1d47: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1d4a: sipush 29613
      // 1d4d: ldc2_w 8327380352311004078
      // 1d50: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1d53: castore
      // 1d54: dup
      // 1d55: sipush 8553
      // 1d58: ldc2_w 5208731264043899322
      // 1d5b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1d5e: sipush 21423
      // 1d61: ldc2_w 7188274520085212119
      // 1d64: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1d67: castore
      // 1d68: dup
      // 1d69: sipush 30676
      // 1d6c: ldc2_w 5956089045550829544
      // 1d6f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1d72: sipush 31543
      // 1d75: ldc2_w 7535909877894513425
      // 1d78: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1d7b: castore
      // 1d7c: dup
      // 1d7d: sipush 4739
      // 1d80: ldc2_w 5831792552873355921
      // 1d83: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1d86: sipush 12047
      // 1d89: ldc2_w 2695385713178367904
      // 1d8c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1d8f: castore
      // 1d90: dup
      // 1d91: sipush 31240
      // 1d94: ldc2_w 8643570179020620392
      // 1d97: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1d9a: sipush 21546
      // 1d9d: ldc2_w 5426761049271774337
      // 1da0: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1da3: castore
      // 1da4: dup
      // 1da5: sipush 1558
      // 1da8: ldc2_w 2915472958089854672
      // 1dab: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1dae: sipush 15193
      // 1db1: ldc2_w 2389375293862495046
      // 1db4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1db7: castore
      // 1db8: dup
      // 1db9: sipush 19937
      // 1dbc: ldc2_w 1202565405225530849
      // 1dbf: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1dc2: sipush 19563
      // 1dc5: ldc2_w 981167762409370815
      // 1dc8: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1dcb: castore
      // 1dcc: dup
      // 1dcd: sipush 1436
      // 1dd0: ldc2_w 1583665784747654488
      // 1dd3: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1dd6: sipush 3570
      // 1dd9: ldc2_w 186475829377889640
      // 1ddc: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1ddf: castore
      // 1de0: dup
      // 1de1: sipush 2666
      // 1de4: ldc2_w 6468706646099620568
      // 1de7: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1dea: sipush 16654
      // 1ded: ldc2_w 8574482885912836352
      // 1df0: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1df3: castore
      // 1df4: dup
      // 1df5: sipush 20238
      // 1df8: ldc2_w 9167095845291177860
      // 1dfb: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1dfe: sipush 15387
      // 1e01: ldc2_w 4897812516075979903
      // 1e04: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1e07: castore
      // 1e08: dup
      // 1e09: sipush 12465
      // 1e0c: ldc2_w 2473427269576149359
      // 1e0f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1e12: sipush 29613
      // 1e15: ldc2_w 8327380352311004078
      // 1e18: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1e1b: castore
      // 1e1c: dup
      // 1e1d: sipush 13871
      // 1e20: ldc2_w 7071966724962799252
      // 1e23: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1e26: sipush 21423
      // 1e29: ldc2_w 7188274520085212119
      // 1e2c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1e2f: castore
      // 1e30: dup
      // 1e31: sipush 12900
      // 1e34: ldc2_w 5474620062827039449
      // 1e37: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1e3a: sipush 31543
      // 1e3d: ldc2_w 7535909877894513425
      // 1e40: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1e43: castore
      // 1e44: dup
      // 1e45: sipush 22907
      // 1e48: ldc2_w 3408899665999077836
      // 1e4b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1e4e: sipush 12047
      // 1e51: ldc2_w 2695385713178367904
      // 1e54: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1e57: castore
      // 1e58: dup
      // 1e59: sipush 20909
      // 1e5c: ldc2_w 5884136630793218486
      // 1e5f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1e62: sipush 21546
      // 1e65: ldc2_w 5426761049271774337
      // 1e68: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1e6b: castore
      // 1e6c: dup
      // 1e6d: sipush 254
      // 1e70: ldc2_w 1928851718655768741
      // 1e73: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1e76: sipush 15193
      // 1e79: ldc2_w 2389375293862495046
      // 1e7c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1e7f: castore
      // 1e80: dup
      // 1e81: sipush 2587
      // 1e84: ldc2_w 5072776505336951383
      // 1e87: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1e8a: sipush 19563
      // 1e8d: ldc2_w 981167762409370815
      // 1e90: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1e93: castore
      // 1e94: dup
      // 1e95: sipush 6826
      // 1e98: ldc2_w 2332032890832216784
      // 1e9b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1e9e: sipush 3570
      // 1ea1: ldc2_w 186475829377889640
      // 1ea4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1ea7: castore
      // 1ea8: dup
      // 1ea9: sipush 26611
      // 1eac: ldc2_w 2662960648625135594
      // 1eaf: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1eb2: sipush 16654
      // 1eb5: ldc2_w 8574482885912836352
      // 1eb8: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1ebb: castore
      // 1ebc: dup
      // 1ebd: sipush 24797
      // 1ec0: ldc2_w 448430736190675098
      // 1ec3: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1ec6: sipush 15387
      // 1ec9: ldc2_w 4897812516075979903
      // 1ecc: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1ecf: castore
      // 1ed0: dup
      // 1ed1: sipush 5815
      // 1ed4: ldc2_w 6494113799228452552
      // 1ed7: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1eda: sipush 29613
      // 1edd: ldc2_w 8327380352311004078
      // 1ee0: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1ee3: castore
      // 1ee4: dup
      // 1ee5: sipush 32456
      // 1ee8: ldc2_w 2698850499816130138
      // 1eeb: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1eee: sipush 21423
      // 1ef1: ldc2_w 7188274520085212119
      // 1ef4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1ef7: castore
      // 1ef8: dup
      // 1ef9: sipush 15065
      // 1efc: ldc2_w 4686944891820032613
      // 1eff: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1f02: sipush 31543
      // 1f05: ldc2_w 7535909877894513425
      // 1f08: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1f0b: castore
      // 1f0c: dup
      // 1f0d: sipush 28560
      // 1f10: ldc2_w 2736387800709601080
      // 1f13: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1f16: sipush 12047
      // 1f19: ldc2_w 2695385713178367904
      // 1f1c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1f1f: castore
      // 1f20: dup
      // 1f21: sipush 24041
      // 1f24: ldc2_w 2102703235999245686
      // 1f27: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1f2a: sipush 21546
      // 1f2d: ldc2_w 5426761049271774337
      // 1f30: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1f33: castore
      // 1f34: dup
      // 1f35: sipush 2360
      // 1f38: ldc2_w 731847633927664014
      // 1f3b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1f3e: sipush 15193
      // 1f41: ldc2_w 2389375293862495046
      // 1f44: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1f47: castore
      // 1f48: dup
      // 1f49: sipush 29877
      // 1f4c: ldc2_w 769137449996749950
      // 1f4f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1f52: sipush 19563
      // 1f55: ldc2_w 981167762409370815
      // 1f58: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1f5b: castore
      // 1f5c: dup
      // 1f5d: sipush 17584
      // 1f60: ldc2_w 7192673270105750659
      // 1f63: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1f66: sipush 3570
      // 1f69: ldc2_w 186475829377889640
      // 1f6c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1f6f: castore
      // 1f70: dup
      // 1f71: sipush 10778
      // 1f74: ldc2_w 1846284221723890265
      // 1f77: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1f7a: sipush 16654
      // 1f7d: ldc2_w 8574482885912836352
      // 1f80: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1f83: castore
      // 1f84: dup
      // 1f85: sipush 30210
      // 1f88: ldc2_w 8524088374286061262
      // 1f8b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1f8e: sipush 15387
      // 1f91: ldc2_w 4897812516075979903
      // 1f94: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1f97: castore
      // 1f98: dup
      // 1f99: sipush 17695
      // 1f9c: ldc2_w 6780217667835575621
      // 1f9f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1fa2: sipush 29613
      // 1fa5: ldc2_w 8327380352311004078
      // 1fa8: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1fab: castore
      // 1fac: dup
      // 1fad: sipush 20412
      // 1fb0: ldc2_w 67643488147814371
      // 1fb3: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1fb6: sipush 21423
      // 1fb9: ldc2_w 7188274520085212119
      // 1fbc: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1fbf: castore
      // 1fc0: dup
      // 1fc1: sipush 9789
      // 1fc4: ldc2_w 6813733451080457837
      // 1fc7: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1fca: sipush 31543
      // 1fcd: ldc2_w 7535909877894513425
      // 1fd0: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1fd3: castore
      // 1fd4: dup
      // 1fd5: sipush 31969
      // 1fd8: ldc2_w 6775301332646561012
      // 1fdb: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1fde: sipush 12047
      // 1fe1: ldc2_w 2695385713178367904
      // 1fe4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1fe7: castore
      // 1fe8: dup
      // 1fe9: sipush 19328
      // 1fec: ldc2_w 2737502463315948408
      // 1fef: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1ff2: sipush 21546
      // 1ff5: ldc2_w 5426761049271774337
      // 1ff8: invokestatic com/finalshell/core/S7.a (IJ)I
      // 1ffb: castore
      // 1ffc: dup
      // 1ffd: sipush 3570
      // 2000: ldc2_w 186475829377889640
      // 2003: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2006: sipush 15193
      // 2009: ldc2_w 2389375293862495046
      // 200c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 200f: castore
      // 2010: dup
      // 2011: sipush 16654
      // 2014: ldc2_w 8574482885912836352
      // 2017: invokestatic com/finalshell/core/S7.a (IJ)I
      // 201a: sipush 19563
      // 201d: ldc2_w 981167762409370815
      // 2020: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2023: castore
      // 2024: dup
      // 2025: sipush 15387
      // 2028: ldc2_w 4897812516075979903
      // 202b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 202e: sipush 3570
      // 2031: ldc2_w 186475829377889640
      // 2034: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2037: castore
      // 2038: dup
      // 2039: sipush 29613
      // 203c: ldc2_w 8327380352311004078
      // 203f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2042: sipush 16654
      // 2045: ldc2_w 8574482885912836352
      // 2048: invokestatic com/finalshell/core/S7.a (IJ)I
      // 204b: castore
      // 204c: dup
      // 204d: sipush 21423
      // 2050: ldc2_w 7188274520085212119
      // 2053: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2056: sipush 15387
      // 2059: ldc2_w 4897812516075979903
      // 205c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 205f: castore
      // 2060: dup
      // 2061: sipush 31543
      // 2064: ldc2_w 7535909877894513425
      // 2067: invokestatic com/finalshell/core/S7.a (IJ)I
      // 206a: sipush 29613
      // 206d: ldc2_w 8327380352311004078
      // 2070: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2073: castore
      // 2074: dup
      // 2075: sipush 12047
      // 2078: ldc2_w 2695385713178367904
      // 207b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 207e: sipush 21423
      // 2081: ldc2_w 7188274520085212119
      // 2084: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2087: castore
      // 2088: dup
      // 2089: sipush 21546
      // 208c: ldc2_w 5426761049271774337
      // 208f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2092: sipush 31543
      // 2095: ldc2_w 7535909877894513425
      // 2098: invokestatic com/finalshell/core/S7.a (IJ)I
      // 209b: castore
      // 209c: dup
      // 209d: sipush 15193
      // 20a0: ldc2_w 2389375293862495046
      // 20a3: invokestatic com/finalshell/core/S7.a (IJ)I
      // 20a6: sipush 12047
      // 20a9: ldc2_w 2695385713178367904
      // 20ac: invokestatic com/finalshell/core/S7.a (IJ)I
      // 20af: castore
      // 20b0: dup
      // 20b1: sipush 19563
      // 20b4: ldc2_w 981167762409370815
      // 20b7: invokestatic com/finalshell/core/S7.a (IJ)I
      // 20ba: sipush 21546
      // 20bd: ldc2_w 5426761049271774337
      // 20c0: invokestatic com/finalshell/core/S7.a (IJ)I
      // 20c3: castore
      // 20c4: dup
      // 20c5: sipush 30207
      // 20c8: ldc2_w 6249287951380188666
      // 20cb: invokestatic com/finalshell/core/S7.a (IJ)I
      // 20ce: sipush 15193
      // 20d1: ldc2_w 2389375293862495046
      // 20d4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 20d7: castore
      // 20d8: dup
      // 20d9: sipush 9691
      // 20dc: ldc2_w 3031765212954811737
      // 20df: invokestatic com/finalshell/core/S7.a (IJ)I
      // 20e2: sipush 19563
      // 20e5: ldc2_w 981167762409370815
      // 20e8: invokestatic com/finalshell/core/S7.a (IJ)I
      // 20eb: castore
      // 20ec: dup
      // 20ed: sipush 9930
      // 20f0: ldc2_w 2247103227626151701
      // 20f3: invokestatic com/finalshell/core/S7.a (IJ)I
      // 20f6: sipush 3570
      // 20f9: ldc2_w 186475829377889640
      // 20fc: invokestatic com/finalshell/core/S7.a (IJ)I
      // 20ff: castore
      // 2100: dup
      // 2101: sipush 23011
      // 2104: ldc2_w 5758432979682828614
      // 2107: invokestatic com/finalshell/core/S7.a (IJ)I
      // 210a: sipush 16654
      // 210d: ldc2_w 8574482885912836352
      // 2110: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2113: castore
      // 2114: dup
      // 2115: sipush 11403
      // 2118: ldc2_w 2437952374923285741
      // 211b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 211e: sipush 15387
      // 2121: ldc2_w 4897812516075979903
      // 2124: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2127: castore
      // 2128: dup
      // 2129: sipush 17065
      // 212c: ldc2_w 8505440891111619271
      // 212f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2132: sipush 29613
      // 2135: ldc2_w 8327380352311004078
      // 2138: invokestatic com/finalshell/core/S7.a (IJ)I
      // 213b: castore
      // 213c: dup
      // 213d: sipush 24224
      // 2140: ldc2_w 8873883753299814108
      // 2143: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2146: sipush 21423
      // 2149: ldc2_w 7188274520085212119
      // 214c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 214f: castore
      // 2150: dup
      // 2151: sipush 2663
      // 2154: ldc2_w 4383746037785260728
      // 2157: invokestatic com/finalshell/core/S7.a (IJ)I
      // 215a: sipush 31543
      // 215d: ldc2_w 7535909877894513425
      // 2160: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2163: castore
      // 2164: dup
      // 2165: sipush 18785
      // 2168: ldc2_w 7059161105789628815
      // 216b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 216e: sipush 12047
      // 2171: ldc2_w 2695385713178367904
      // 2174: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2177: castore
      // 2178: dup
      // 2179: sipush 18184
      // 217c: ldc2_w 4483245699943153660
      // 217f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2182: sipush 21546
      // 2185: ldc2_w 5426761049271774337
      // 2188: invokestatic com/finalshell/core/S7.a (IJ)I
      // 218b: castore
      // 218c: dup
      // 218d: sipush 22251
      // 2190: ldc2_w 183965713644596742
      // 2193: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2196: sipush 15193
      // 2199: ldc2_w 2389375293862495046
      // 219c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 219f: castore
      // 21a0: dup
      // 21a1: sipush 16563
      // 21a4: ldc2_w 2682085708563560504
      // 21a7: invokestatic com/finalshell/core/S7.a (IJ)I
      // 21aa: sipush 19563
      // 21ad: ldc2_w 981167762409370815
      // 21b0: invokestatic com/finalshell/core/S7.a (IJ)I
      // 21b3: castore
      // 21b4: dup
      // 21b5: sipush 2193
      // 21b8: ldc2_w 4252108287588298828
      // 21bb: invokestatic com/finalshell/core/S7.a (IJ)I
      // 21be: sipush 3570
      // 21c1: ldc2_w 186475829377889640
      // 21c4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 21c7: castore
      // 21c8: dup
      // 21c9: sipush 26773
      // 21cc: ldc2_w 7466392842129674434
      // 21cf: invokestatic com/finalshell/core/S7.a (IJ)I
      // 21d2: sipush 16654
      // 21d5: ldc2_w 8574482885912836352
      // 21d8: invokestatic com/finalshell/core/S7.a (IJ)I
      // 21db: castore
      // 21dc: dup
      // 21dd: sipush 8836
      // 21e0: ldc2_w 9116825966867831463
      // 21e3: invokestatic com/finalshell/core/S7.a (IJ)I
      // 21e6: sipush 15387
      // 21e9: ldc2_w 4897812516075979903
      // 21ec: invokestatic com/finalshell/core/S7.a (IJ)I
      // 21ef: castore
      // 21f0: dup
      // 21f1: sipush 6736
      // 21f4: ldc2_w 1251542828607693379
      // 21f7: invokestatic com/finalshell/core/S7.a (IJ)I
      // 21fa: sipush 29613
      // 21fd: ldc2_w 8327380352311004078
      // 2200: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2203: castore
      // 2204: dup
      // 2205: sipush 4824
      // 2208: ldc2_w 825090830435642090
      // 220b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 220e: sipush 21423
      // 2211: ldc2_w 7188274520085212119
      // 2214: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2217: castore
      // 2218: dup
      // 2219: sipush 2012
      // 221c: ldc2_w 8366586163824525063
      // 221f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2222: sipush 31543
      // 2225: ldc2_w 7535909877894513425
      // 2228: invokestatic com/finalshell/core/S7.a (IJ)I
      // 222b: castore
      // 222c: dup
      // 222d: sipush 8203
      // 2230: ldc2_w 2791172401761900618
      // 2233: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2236: sipush 12047
      // 2239: ldc2_w 2695385713178367904
      // 223c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 223f: castore
      // 2240: dup
      // 2241: sipush 20440
      // 2244: ldc2_w 5172216125283284911
      // 2247: invokestatic com/finalshell/core/S7.a (IJ)I
      // 224a: sipush 21546
      // 224d: ldc2_w 5426761049271774337
      // 2250: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2253: castore
      // 2254: dup
      // 2255: sipush 8975
      // 2258: ldc2_w 1664705615479036905
      // 225b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 225e: sipush 15193
      // 2261: ldc2_w 2389375293862495046
      // 2264: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2267: castore
      // 2268: dup
      // 2269: sipush 23196
      // 226c: ldc2_w 5070844906949976623
      // 226f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2272: sipush 19563
      // 2275: ldc2_w 981167762409370815
      // 2278: invokestatic com/finalshell/core/S7.a (IJ)I
      // 227b: castore
      // 227c: dup
      // 227d: sipush 22820
      // 2280: ldc2_w 6343531690172752184
      // 2283: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2286: sipush 3570
      // 2289: ldc2_w 186475829377889640
      // 228c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 228f: castore
      // 2290: dup
      // 2291: sipush 23426
      // 2294: ldc2_w 8794699937222763324
      // 2297: invokestatic com/finalshell/core/S7.a (IJ)I
      // 229a: sipush 16654
      // 229d: ldc2_w 8574482885912836352
      // 22a0: invokestatic com/finalshell/core/S7.a (IJ)I
      // 22a3: castore
      // 22a4: dup
      // 22a5: sipush 11980
      // 22a8: ldc2_w 808507784137102851
      // 22ab: invokestatic com/finalshell/core/S7.a (IJ)I
      // 22ae: sipush 15387
      // 22b1: ldc2_w 4897812516075979903
      // 22b4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 22b7: castore
      // 22b8: dup
      // 22b9: sipush 31124
      // 22bc: ldc2_w 6895763767346692475
      // 22bf: invokestatic com/finalshell/core/S7.a (IJ)I
      // 22c2: sipush 29613
      // 22c5: ldc2_w 8327380352311004078
      // 22c8: invokestatic com/finalshell/core/S7.a (IJ)I
      // 22cb: castore
      // 22cc: dup
      // 22cd: sipush 1824
      // 22d0: ldc2_w 7526674904609652551
      // 22d3: invokestatic com/finalshell/core/S7.a (IJ)I
      // 22d6: sipush 21423
      // 22d9: ldc2_w 7188274520085212119
      // 22dc: invokestatic com/finalshell/core/S7.a (IJ)I
      // 22df: castore
      // 22e0: dup
      // 22e1: sipush 23648
      // 22e4: ldc2_w 9101144564328244244
      // 22e7: invokestatic com/finalshell/core/S7.a (IJ)I
      // 22ea: sipush 31543
      // 22ed: ldc2_w 7535909877894513425
      // 22f0: invokestatic com/finalshell/core/S7.a (IJ)I
      // 22f3: castore
      // 22f4: dup
      // 22f5: sipush 406
      // 22f8: ldc2_w 3767263824864475459
      // 22fb: invokestatic com/finalshell/core/S7.a (IJ)I
      // 22fe: sipush 12047
      // 2301: ldc2_w 2695385713178367904
      // 2304: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2307: castore
      // 2308: dup
      // 2309: sipush 19515
      // 230c: ldc2_w 382747400677438585
      // 230f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2312: sipush 21546
      // 2315: ldc2_w 5426761049271774337
      // 2318: invokestatic com/finalshell/core/S7.a (IJ)I
      // 231b: castore
      // 231c: dup
      // 231d: sipush 17686
      // 2320: ldc2_w 2528729746332859772
      // 2323: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2326: sipush 15193
      // 2329: ldc2_w 2389375293862495046
      // 232c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 232f: castore
      // 2330: dup
      // 2331: sipush 16118
      // 2334: ldc2_w 8512291825406985939
      // 2337: invokestatic com/finalshell/core/S7.a (IJ)I
      // 233a: sipush 19563
      // 233d: ldc2_w 981167762409370815
      // 2340: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2343: castore
      // 2344: dup
      // 2345: sipush 12276
      // 2348: ldc2_w 4651341756621379338
      // 234b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 234e: sipush 3570
      // 2351: ldc2_w 186475829377889640
      // 2354: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2357: castore
      // 2358: dup
      // 2359: sipush 10267
      // 235c: ldc2_w 193748105508507886
      // 235f: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2362: sipush 16654
      // 2365: ldc2_w 8574482885912836352
      // 2368: invokestatic com/finalshell/core/S7.a (IJ)I
      // 236b: castore
      // 236c: dup
      // 236d: sipush 6917
      // 2370: ldc2_w 7015247155460694818
      // 2373: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2376: sipush 15387
      // 2379: ldc2_w 4897812516075979903
      // 237c: invokestatic com/finalshell/core/S7.a (IJ)I
      // 237f: castore
      // 2380: dup
      // 2381: sipush 20929
      // 2384: ldc2_w 3097620516605602285
      // 2387: invokestatic com/finalshell/core/S7.a (IJ)I
      // 238a: sipush 29613
      // 238d: ldc2_w 8327380352311004078
      // 2390: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2393: castore
      // 2394: dup
      // 2395: sipush 32104
      // 2398: ldc2_w 3144124938221979077
      // 239b: invokestatic com/finalshell/core/S7.a (IJ)I
      // 239e: sipush 21423
      // 23a1: ldc2_w 7188274520085212119
      // 23a4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 23a7: castore
      // 23a8: dup
      // 23a9: sipush 28021
      // 23ac: ldc2_w 3686819205896836515
      // 23af: invokestatic com/finalshell/core/S7.a (IJ)I
      // 23b2: sipush 31543
      // 23b5: ldc2_w 7535909877894513425
      // 23b8: invokestatic com/finalshell/core/S7.a (IJ)I
      // 23bb: castore
      // 23bc: dup
      // 23bd: sipush 17076
      // 23c0: ldc2_w 5337207120134158964
      // 23c3: invokestatic com/finalshell/core/S7.a (IJ)I
      // 23c6: sipush 12047
      // 23c9: ldc2_w 2695385713178367904
      // 23cc: invokestatic com/finalshell/core/S7.a (IJ)I
      // 23cf: castore
      // 23d0: dup
      // 23d1: sipush 24676
      // 23d4: ldc2_w 6451437090994624546
      // 23d7: invokestatic com/finalshell/core/S7.a (IJ)I
      // 23da: sipush 21546
      // 23dd: ldc2_w 5426761049271774337
      // 23e0: invokestatic com/finalshell/core/S7.a (IJ)I
      // 23e3: castore
      // 23e4: dup
      // 23e5: sipush 31743
      // 23e8: ldc2_w 8265164723454280575
      // 23eb: invokestatic com/finalshell/core/S7.a (IJ)I
      // 23ee: sipush 15193
      // 23f1: ldc2_w 2389375293862495046
      // 23f4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 23f7: castore
      // 23f8: dup
      // 23f9: sipush 8692
      // 23fc: ldc2_w 4762556360350685592
      // 23ff: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2402: sipush 19563
      // 2405: ldc2_w 981167762409370815
      // 2408: invokestatic com/finalshell/core/S7.a (IJ)I
      // 240b: castore
      // 240c: putstatic com/finalshell/core/S7.D [C
      // 240f: sipush 19431
      // 2412: ldc2_w 3995733026905961425
      // 2415: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2418: newarray 10
      // 241a: dup
      // 241b: bipush 0
      // 241c: sipush 27609
      // 241f: ldc2_w 3655570642081551163
      // 2422: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2425: iastore
      // 2426: dup
      // 2427: bipush 1
      // 2428: sipush 8692
      // 242b: ldc2_w 4762556360350685592
      // 242e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2431: iastore
      // 2432: dup
      // 2433: bipush 2
      // 2434: sipush 17719
      // 2437: ldc2_w 7707823389736025566
      // 243a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 243d: iastore
      // 243e: dup
      // 243f: bipush 3
      // 2440: sipush 22236
      // 2443: ldc2_w 8130159481306951372
      // 2446: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2449: iastore
      // 244a: dup
      // 244b: bipush 4
      // 244c: sipush 15537
      // 244f: ldc2_w 4041734171319223410
      // 2452: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2455: iastore
      // 2456: dup
      // 2457: bipush 5
      // 2458: sipush 12346
      // 245b: ldc2_w 5161637504678742043
      // 245e: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2461: iastore
      // 2462: dup
      // 2463: sipush 17642
      // 2466: ldc2_w 3973525135493741602
      // 2469: invokestatic com/finalshell/core/S7.a (IJ)I
      // 246c: sipush 28273
      // 246f: ldc2_w 2831578006937769551
      // 2472: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2475: iastore
      // 2476: dup
      // 2477: sipush 25120
      // 247a: ldc2_w 6587103157852772946
      // 247d: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2480: sipush 20614
      // 2483: ldc2_w 1333759346159986797
      // 2486: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2489: iastore
      // 248a: dup
      // 248b: sipush 29230
      // 248e: ldc2_w 2245239911286966921
      // 2491: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2494: sipush 493
      // 2497: ldc2_w 2455716339695712625
      // 249a: invokestatic com/finalshell/core/S7.a (IJ)I
      // 249d: iastore
      // 249e: dup
      // 249f: sipush 27609
      // 24a2: ldc2_w 3655570642081551163
      // 24a5: invokestatic com/finalshell/core/S7.a (IJ)I
      // 24a8: sipush 31772
      // 24ab: ldc2_w 162665172310819892
      // 24ae: invokestatic com/finalshell/core/S7.a (IJ)I
      // 24b1: iastore
      // 24b2: putstatic com/finalshell/core/S7.f [I
      // 24b5: invokestatic com/finalshell/core/S7.a (II)Ljava/lang/String;
      // 24b8: invokevirtual java/lang/String.toCharArray ()[C
      // 24bb: putstatic com/finalshell/core/S7.z [C
      // 24be: sipush 21599
      // 24c1: ldc2_w 3522224416701787170
      // 24c4: invokestatic com/finalshell/core/S7.a (IJ)I
      // 24c7: newarray 10
      // 24c9: putstatic com/finalshell/core/S7.b [I
      // 24cc: getstatic com/finalshell/core/S7.b [I
      // 24cf: bipush -1
      // 24d0: invokestatic java/util/Arrays.fill ([II)V
      // 24d3: bipush 0
      // 24d4: istore 23
      // 24d6: getstatic com/finalshell/core/S7.z [C
      // 24d9: arraylength
      // 24da: istore 24
      // 24dc: iload 23
      // 24de: iload 24
      // 24e0: if_icmpge 24f9
      // 24e3: getstatic com/finalshell/core/S7.b [I
      // 24e6: getstatic com/finalshell/core/S7.z [C
      // 24e9: iload 23
      // 24eb: caload
      // 24ec: iload 23
      // 24ee: iastore
      // 24ef: iinc 23 1
      // 24f2: goto 24dc
      // 24f5: invokestatic com/finalshell/core/S7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24f8: athrow
      // 24f9: getstatic com/finalshell/core/S7.b [I
      // 24fc: sipush 23011
      // 24ff: ldc2_w 5758432979682828614
      // 2502: invokestatic com/finalshell/core/S7.a (IJ)I
      // 2505: bipush 0
      // 2506: iastore
      // 2507: return
   }
}





