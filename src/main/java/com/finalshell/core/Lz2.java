package com.finalshell.core;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;

public class Lz2 extends ByteToMessageDecoder {
   public final int P = a(943, 6257116824906351519L);
   public static int d;
   public static int D;
   public static int F;
   public static int i;
   public static int x;
   public int p;
   public int t;
   public int I;
   public static long[] a;
   public static Integer[] b;

   static {
      __vfClinit__();
   }

   public Lz2() {
      this.p = d;
      this.t = 0;
   }

   @Override
   public void decode(ChannelHandlerContext param1, ByteBuf param2, List param3) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/XU.t ()[I
      // 003: aload 2
      // 004: invokevirtual io/netty/buffer/ByteBuf.readableBytes ()I
      // 007: istore 5
      // 009: astore 4
      // 00b: aload 0
      // 00c: getfield com/finalshell/core/Lz2.p I
      // 00f: getstatic com/finalshell/core/Lz2.d I
      // 012: aload 4
      // 014: ifnull 0ce
      // 017: if_icmpne 0c0
      // 01a: goto 021
      // 01d: invokestatic com/finalshell/core/Lz2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 020: athrow
      // 021: iload 5
      // 023: aload 4
      // 025: ifnull 064
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/core/Lz2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: getstatic com/finalshell/core/Lz2.i I
      // 032: if_icmplt 12e
      // 035: goto 03c
      // 038: invokestatic com/finalshell/core/Lz2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03b: athrow
      // 03c: aload 0
      // 03d: aload 2
      // 03e: invokevirtual io/netty/buffer/ByteBuf.readInt ()I
      // 041: putfield com/finalshell/core/Lz2.I I
      // 044: aload 4
      // 046: ifnull 0bb
      // 049: goto 050
      // 04c: invokestatic com/finalshell/core/Lz2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04f: athrow
      // 050: getstatic com/finalshell/core/Ai2.k Ljava/util/HashSet;
      // 053: aload 0
      // 054: getfield com/finalshell/core/Lz2.I I
      // 057: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05a: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 05d: goto 064
      // 060: invokestatic com/finalshell/core/Lz2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: ifeq 0ad
      // 067: aload 2
      // 068: invokevirtual io/netty/buffer/ByteBuf.readInt ()I
      // 06b: istore 6
      // 06d: aload 4
      // 06f: ifnull 0a8
      // 072: iload 6
      // 074: getstatic com/finalshell/core/Lz2.x I
      // 077: if_icmpgt 09a
      // 07a: goto 081
      // 07d: invokestatic com/finalshell/core/Lz2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 080: athrow
      // 081: aload 0
      // 082: iload 6
      // 084: putfield com/finalshell/core/Lz2.t I
      // 087: aload 0
      // 088: getstatic com/finalshell/core/Lz2.D I
      // 08b: putfield com/finalshell/core/Lz2.p I
      // 08e: aload 4
      // 090: ifnonnull 12e
      // 093: goto 09a
      // 096: invokestatic com/finalshell/core/Lz2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 099: athrow
      // 09a: aload 0
      // 09b: getstatic com/finalshell/core/Lz2.F I
      // 09e: putfield com/finalshell/core/Lz2.p I
      // 0a1: goto 0a8
      // 0a4: invokestatic com/finalshell/core/Lz2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a7: athrow
      // 0a8: aload 4
      // 0aa: ifnonnull 12e
      // 0ad: aload 0
      // 0ae: getstatic com/finalshell/core/Lz2.F I
      // 0b1: putfield com/finalshell/core/Lz2.p I
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/core/Lz2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ba: athrow
      // 0bb: aload 4
      // 0bd: ifnonnull 12e
      // 0c0: aload 0
      // 0c1: getfield com/finalshell/core/Lz2.p I
      // 0c4: getstatic com/finalshell/core/Lz2.D I
      // 0c7: goto 0ce
      // 0ca: invokestatic com/finalshell/core/Lz2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cd: athrow
      // 0ce: aload 4
      // 0d0: ifnull 0f6
      // 0d3: if_icmpne 12e
      // 0d6: goto 0dd
      // 0d9: invokestatic com/finalshell/core/Lz2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc: athrow
      // 0dd: iload 5
      // 0df: aload 4
      // 0e1: ifnull 104
      // 0e4: goto 0eb
      // 0e7: invokestatic com/finalshell/core/Lz2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: getfield com/finalshell/core/Lz2.t I
      // 0ef: goto 0f6
      // 0f2: invokestatic com/finalshell/core/Lz2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f5: athrow
      // 0f6: if_icmplt 12e
      // 0f9: aload 0
      // 0fa: getfield com/finalshell/core/Lz2.t I
      // 0fd: goto 104
      // 100: invokestatic com/finalshell/core/Lz2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 103: athrow
      // 104: newarray 8
      // 106: astore 6
      // 108: aload 2
      // 109: aload 6
      // 10b: invokevirtual io/netty/buffer/ByteBuf.readBytes ([B)Lio/netty/buffer/ByteBuf;
      // 10e: pop
      // 10f: new com/finalshell/core/XU
      // 112: dup
      // 113: aload 0
      // 114: getfield com/finalshell/core/Lz2.I I
      // 117: aload 6
      // 119: invokespecial com/finalshell/core/XU.<init> (I[B)V
      // 11c: astore 7
      // 11e: aload 3
      // 11f: aload 7
      // 121: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 126: pop
      // 127: aload 0
      // 128: getstatic com/finalshell/core/Lz2.d I
      // 12b: putfield com/finalshell/core/Lz2.p I
      // 12e: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16433;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 4590530025213234999L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "\u0014uö\u0011;o\u0091»\u0097K\u0018\u001b¹0L #ò²!`\u0087Ã\u0007a\u0095\u009e\u0092\u0098KÏq";
      int var5 = "\u0014uö\u0011;o\u0091»\u0097K\u0018\u001b¹0L #ò²!`\u0087Ã\u0007a\u0095\u009e\u0092\u0098KÏq".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[6];
                     d = a(3081, 8184612348273511482L);
                     D = a(127, 9069897809625497677L);
                     F = a(27552, 6434105922001218452L);
                     i = a(21149, 3495315532774511272L);
                     x = a(24253, 3209757171674914444L);
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "±n0r?w\u009d\u0097òÉ\u008d\u0082S\u0087%3";
                  var5 = "±n0r?w\u009d\u0097òÉ\u008d\u0082S\u0087%3".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





