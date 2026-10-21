package com.finalshell.task;

import java.net.InetAddress;

public class Qt2 implements Runnable {
   final FH3 Q;
   public final InetAddress e;
   public static long[] a;
   public static Integer[] b;

   Qt2(FH3 var1, InetAddress var2) {
      this.Q = var1;
      this.e = var2;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XQ_2.B ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/task/Qt2.Q Lcom/finalshell/task/FH3;
      // 08: invokestatic com/finalshell/task/FH3.P (Lcom/finalshell/task/FH3;)Lcom/finalshell/core/DX3_2;
      // 0b: aload 1
      // 0c: ifnull 28
      // 0f: getfield com/finalshell/core/DX3_2.w Z
      // 12: ifeq 21
      // 15: goto 1c
      // 18: invokestatic com/finalshell/task/Qt2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: return
      // 1d: invokestatic com/finalshell/task/Qt2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 0
      // 22: getfield com/finalshell/task/Qt2.Q Lcom/finalshell/task/FH3;
      // 25: invokestatic com/finalshell/task/FH3.P (Lcom/finalshell/task/FH3;)Lcom/finalshell/core/DX3_2;
      // 28: dup
      // 29: getfield com/finalshell/core/DX3_2.A I
      // 2c: bipush 1
      // 2d: iadd
      // 2e: putfield com/finalshell/core/DX3_2.A I
      // 31: new org/icmp4j/j
      // 34: dup
      // 35: invokespecial org/icmp4j/j.<init> ()V
      // 38: astore 2
      // 39: invokestatic com/finalshell/core/Xq2.A ()Lcom/finalshell/core/Xq2;
      // 3c: aload 0
      // 3d: getfield com/finalshell/task/Qt2.e Ljava/net/InetAddress;
      // 40: aload 0
      // 41: getfield com/finalshell/task/Qt2.Q Lcom/finalshell/task/FH3;
      // 44: invokestatic com/finalshell/task/FH3.P (Lcom/finalshell/task/FH3;)Lcom/finalshell/core/DX3_2;
      // 47: getfield com/finalshell/core/DX3_2.K S
      // 4a: aload 0
      // 4b: getfield com/finalshell/task/Qt2.Q Lcom/finalshell/task/FH3;
      // 4e: invokestatic com/finalshell/task/FH3.P (Lcom/finalshell/task/FH3;)Lcom/finalshell/core/DX3_2;
      // 51: invokevirtual com/finalshell/core/Xq2.p (Ljava/net/InetAddress;ILcom/finalshell/core/Q0;)Lorg/icmp4j/j;
      // 54: astore 2
      // 55: goto 59
      // 58: astore 3
      // 59: aload 2
      // 5a: aload 0
      // 5b: getfield com/finalshell/task/Qt2.Q Lcom/finalshell/task/FH3;
      // 5e: invokestatic com/finalshell/task/FH3.P (Lcom/finalshell/task/FH3;)Lcom/finalshell/core/DX3_2;
      // 61: getfield com/finalshell/core/DX3_2.A I
      // 64: invokevirtual org/icmp4j/j.n (I)V
      // 67: aload 2
      // 68: astore 3
      // 69: getstatic com/finalshell/core/XQ_2.x Lcom/finalshell/core/D82_2;
      // 6c: new com/finalshell/task/Lx2
      // 6f: dup
      // 70: aload 0
      // 71: aload 3
      // 72: invokespecial com/finalshell/task/Lx2.<init> (Lcom/finalshell/task/Qt2;Lorg/icmp4j/j;)V
      // 75: sipush 29194
      // 78: ldc2_w 9068389979354858305
      // 7b: invokestatic com/finalshell/task/Qt2.a (IJ)I
      // 7e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;I)[Ljava/lang/Object;
      // 81: ldc2_w 266288712085965362
      // 84: astore 5
      // 86: astore 4
      // 88: ldc2_w 266288712085965362
      // 8b: aload 4
      // 8d: aload 5
      // 8f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 92: goto 99
      // 95: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 98: athrow
      // 99: pop
      // 9a: aload 0
      // 9b: getfield com/finalshell/task/Qt2.Q Lcom/finalshell/task/FH3;
      // 9e: invokestatic com/finalshell/task/FH3.P (Lcom/finalshell/task/FH3;)Lcom/finalshell/core/DX3_2;
      // a1: dup
      // a2: getfield com/finalshell/core/DX3_2.K S
      // a5: bipush 1
      // a6: iadd
      // a7: i2s
      // a8: putfield com/finalshell/core/DX3_2.K S
      // ab: aload 0
      // ac: getfield com/finalshell/task/Qt2.Q Lcom/finalshell/task/FH3;
      // af: invokestatic com/finalshell/task/FH3.P (Lcom/finalshell/task/FH3;)Lcom/finalshell/core/DX3_2;
      // b2: aload 1
      // b3: ifnull da
      // b6: getfield com/finalshell/core/DX3_2.K S
      // b9: sipush 17708
      // bc: ldc2_w 7282457621599564902
      // bf: invokestatic com/finalshell/task/Qt2.a (IJ)I
      // c2: if_icmpne e0
      // c5: goto cc
      // c8: invokestatic com/finalshell/task/Qt2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cb: athrow
      // cc: aload 0
      // cd: getfield com/finalshell/task/Qt2.Q Lcom/finalshell/task/FH3;
      // d0: invokestatic com/finalshell/task/FH3.P (Lcom/finalshell/task/FH3;)Lcom/finalshell/core/DX3_2;
      // d3: goto da
      // d6: invokestatic com/finalshell/task/Qt2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d9: athrow
      // da: invokestatic com/finalshell/core/DX3_2.I ()S
      // dd: putfield com/finalshell/core/DX3_2.K S
      // e0: return
   }

   static FH3 A(Qt2 var0) {
      return var0.Q;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29003;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 5599926709614369977L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "Ýý\u0097húáÜ|ß¼OØ]\u008e\u0017 ";
      int var5 = "Ýý\u0097húáÜ|ß¼OØ]\u008e\u0017 ".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
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
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[2];
   }
}





