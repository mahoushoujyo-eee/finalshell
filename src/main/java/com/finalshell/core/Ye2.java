package com.finalshell.core;

import org.bouncycastle.crypto.BufferedBlockCipher;

public abstract class Ye2 implements EU {
   public BufferedBlockCipher G;
   public static long[] a;
   public static Integer[] b;

   @Override
   public int w() {
      return a(9789, 5678904237608000688L);
   }

   @Override
   public void z(int param1, byte[] param2, byte[] param3) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/K4.z ()Ljava/lang/String;
      // 03: astore 4
      // 05: aload 3
      // 06: arraylength
      // 07: aload 4
      // 09: ifnonnull 3e
      // 0c: sipush 19837
      // 0f: ldc2_w 2800404477494835185
      // 12: invokestatic com/finalshell/core/Ye2.a (IJ)I
      // 15: if_icmple 3a
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/Ye2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: sipush 9789
      // 22: ldc2_w 5678904237608000688
      // 25: invokestatic com/finalshell/core/Ye2.a (IJ)I
      // 28: newarray 8
      // 2a: astore 5
      // 2c: aload 3
      // 2d: bipush 0
      // 2e: aload 5
      // 30: bipush 0
      // 31: aload 5
      // 33: arraylength
      // 34: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 37: aload 5
      // 39: astore 3
      // 3a: aload 0
      // 3b: invokevirtual com/finalshell/core/Ye2.u ()I
      // 3e: istore 6
      // 40: aload 2
      // 41: arraylength
      // 42: aload 4
      // 44: ifnonnull 5c
      // 47: iload 6
      // 49: if_icmple 6e
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/Ye2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: iload 6
      // 55: goto 5c
      // 58: invokestatic com/finalshell/core/Ye2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b: athrow
      // 5c: newarray 8
      // 5e: astore 5
      // 60: aload 2
      // 61: bipush 0
      // 62: aload 5
      // 64: bipush 0
      // 65: aload 5
      // 67: arraylength
      // 68: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 6b: aload 5
      // 6d: astore 2
      // 6e: new org/bouncycastle/crypto/params/ParametersWithIV
      // 71: dup
      // 72: new org/bouncycastle/crypto/params/KeyParameter
      // 75: dup
      // 76: aload 2
      // 77: bipush 0
      // 78: aload 2
      // 79: arraylength
      // 7a: invokespecial org/bouncycastle/crypto/params/KeyParameter.<init> ([BII)V
      // 7d: aload 3
      // 7e: bipush 0
      // 7f: aload 3
      // 80: arraylength
      // 81: invokespecial org/bouncycastle/crypto/params/ParametersWithIV.<init> (Lorg/bouncycastle/crypto/CipherParameters;[BII)V
      // 84: astore 7
      // 86: aload 0
      // 87: new org/bouncycastle/crypto/BufferedBlockCipher
      // 8a: dup
      // 8b: new org/bouncycastle/crypto/modes/CBCBlockCipher
      // 8e: dup
      // 8f: new org/bouncycastle/crypto/engines/TwofishEngine
      // 92: dup
      // 93: invokespecial org/bouncycastle/crypto/engines/TwofishEngine.<init> ()V
      // 96: invokespecial org/bouncycastle/crypto/modes/CBCBlockCipher.<init> (Lorg/bouncycastle/crypto/BlockCipher;)V
      // 99: invokespecial org/bouncycastle/crypto/BufferedBlockCipher.<init> (Lorg/bouncycastle/crypto/BlockCipher;)V
      // 9c: putfield com/finalshell/core/Ye2.G Lorg/bouncycastle/crypto/BufferedBlockCipher;
      // 9f: aload 0
      // a0: getfield com/finalshell/core/Ye2.G Lorg/bouncycastle/crypto/BufferedBlockCipher;
      // a3: iload 1
      // a4: aload 4
      // a6: ifnonnull b4
      // a9: ifne b7
      // ac: goto b3
      // af: invokestatic com/finalshell/core/Ye2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b2: athrow
      // b3: bipush 1
      // b4: goto b8
      // b7: bipush 0
      // b8: aload 7
      // ba: invokevirtual org/bouncycastle/crypto/BufferedBlockCipher.init (ZLorg/bouncycastle/crypto/CipherParameters;)V
      // bd: goto ca
      // c0: astore 7
      // c2: aload 0
      // c3: aconst_null
      // c4: putfield com/finalshell/core/Ye2.G Lorg/bouncycastle/crypto/BufferedBlockCipher;
      // c7: aload 7
      // c9: athrow
      // ca: return
   }

   @Override
   public void X(byte[] var1, int var2, int var3, byte[] var4, int var5) throws Exception {
      this.G.processBytes(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean Y() {
      return true;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31373;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8437144389119974668L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "{ù(Ê\\8Á¬\u0012fTÇDS*í";
      int var5 = "{ù(Ê\\8Á¬\u0012fTÇDS*í".length();
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





