package com.finalshell.core;

import javax.crypto.Mac;

public abstract class Ye4 implements FP {
   protected String N;
   protected int c;
   protected String a;
   protected boolean v;
   public Mac m;
   public final byte[] V = new byte[4];
   public static long[] h;
   public static Integer[] i;

   Ye4() {
   }

   @Override
   public int h() {
      return this.c;
   }

   @Override
   public void L(byte[] param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Y12.D ()Z
      // 03: istore 2
      // 04: aload 1
      // 05: arraylength
      // 06: iload 2
      // 07: ifne 23
      // 0a: aload 0
      // 0b: getfield com/finalshell/core/Ye4.c I
      // 0e: if_icmple 33
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/Ye4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 0
      // 19: getfield com/finalshell/core/Ye4.c I
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/Ye4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: newarray 8
      // 25: astore 3
      // 26: aload 1
      // 27: bipush 0
      // 28: aload 3
      // 29: bipush 0
      // 2a: aload 0
      // 2b: getfield com/finalshell/core/Ye4.c I
      // 2e: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 31: aload 3
      // 32: astore 1
      // 33: new javax/crypto/spec/SecretKeySpec
      // 36: dup
      // 37: aload 1
      // 38: aload 0
      // 39: getfield com/finalshell/core/Ye4.a Ljava/lang/String;
      // 3c: invokespecial javax/crypto/spec/SecretKeySpec.<init> ([BLjava/lang/String;)V
      // 3f: astore 3
      // 40: aload 0
      // 41: aload 0
      // 42: getfield com/finalshell/core/Ye4.a Ljava/lang/String;
      // 45: invokestatic javax/crypto/Mac.getInstance (Ljava/lang/String;)Ljavax/crypto/Mac;
      // 48: putfield com/finalshell/core/Ye4.m Ljavax/crypto/Mac;
      // 4b: aload 0
      // 4c: getfield com/finalshell/core/Ye4.m Ljavax/crypto/Mac;
      // 4f: aload 3
      // 50: invokevirtual javax/crypto/Mac.init (Ljava/security/Key;)V
      // 53: return
   }

   @Override
   public void H(int var1) {
      this.V[0] = (byte)(var1 >>> a(31186, 54014925996639547L));
      this.V[1] = (byte)(var1 >>> a(28375, 3846864861336031804L));
      this.V[2] = (byte)(var1 >>> a(1556, 6301083332872747772L));
      this.V[3] = (byte)var1;
      this.o(this.V, 0, 4);
   }

   @Override
   public void o(byte[] var1, int var2, int var3) {
      this.m.update(var1, var2, var3);
   }

   @Override
   public void U(byte[] param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Y12.D ()Z
      // 03: istore 3
      // 04: aload 0
      // 05: getfield com/finalshell/core/Ye4.m Ljavax/crypto/Mac;
      // 08: aload 1
      // 09: iload 2
      // 0a: invokevirtual javax/crypto/Mac.doFinal ([BI)V
      // 0d: goto 40
      // 10: astore 4
      // 12: invokestatic com/finalshell/core/Xe2.W ()Lcom/finalshell/core/GN;
      // 15: bipush 3
      // 16: iload 3
      // 17: ifne 34
      // 1a: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 1f: ifeq 40
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/Ye4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: invokestatic com/finalshell/core/Xe2.W ()Lcom/finalshell/core/GN;
      // 2c: bipush 3
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/Ye4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aload 4
      // 36: invokevirtual javax/crypto/ShortBufferException.getMessage ()Ljava/lang/String;
      // 39: aload 4
      // 3b: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 40: return
   }

   @Override
   public String k() {
      return this.N;
   }

   @Override
   public boolean P() {
      return this.v;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15593;
      if (i[var3] == null) {
         i[var3] = (int)(h[var3] ^ var1);
      }

      return i[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2728769624800263676L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "\b¼ßHÜ\u00818ß¥Z\u00972<\u001bÇ\bºL5\u008f\u0096Å¯Ð";
      int var5 = "\b¼ßHÜ\u00818ß¥Z\u00972<\u001bÇ\bºL5\u008f\u0096Å¯Ð".length();
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

      h = var6;
      i = new Integer[3];
   }
}





