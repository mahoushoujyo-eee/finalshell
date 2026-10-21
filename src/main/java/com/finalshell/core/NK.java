package com.finalshell.core;

import org.bouncycastle.crypto.modes.SICBlockCipher;

public abstract class NK implements EU {
   public SICBlockCipher y;
   public static long[] a;
   public static Integer[] b;

   @Override
   public int w() {
      return a(25680, 8896557438840124926L);
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
      // 0c: sipush 4065
      // 0f: ldc2_w 4114277951348235854
      // 12: invokestatic com/finalshell/core/NK.a (IJ)I
      // 15: if_icmple 3a
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/NK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: sipush 4065
      // 22: ldc2_w 4114277951348235854
      // 25: invokestatic com/finalshell/core/NK.a (IJ)I
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
      // 3b: invokevirtual com/finalshell/core/NK.u ()I
      // 3e: istore 6
      // 40: aload 2
      // 41: arraylength
      // 42: aload 4
      // 44: ifnonnull 5c
      // 47: iload 6
      // 49: if_icmple 6e
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/NK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: iload 6
      // 55: goto 5c
      // 58: invokestatic com/finalshell/core/NK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      // 87: new org/bouncycastle/crypto/modes/SICBlockCipher
      // 8a: dup
      // 8b: new org/bouncycastle/crypto/engines/TwofishEngine
      // 8e: dup
      // 8f: invokespecial org/bouncycastle/crypto/engines/TwofishEngine.<init> ()V
      // 92: invokespecial org/bouncycastle/crypto/modes/SICBlockCipher.<init> (Lorg/bouncycastle/crypto/BlockCipher;)V
      // 95: putfield com/finalshell/core/NK.y Lorg/bouncycastle/crypto/modes/SICBlockCipher;
      // 98: aload 0
      // 99: getfield com/finalshell/core/NK.y Lorg/bouncycastle/crypto/modes/SICBlockCipher;
      // 9c: iload 1
      // 9d: aload 4
      // 9f: ifnonnull ad
      // a2: ifne b0
      // a5: goto ac
      // a8: invokestatic com/finalshell/core/NK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ab: athrow
      // ac: bipush 1
      // ad: goto b1
      // b0: bipush 0
      // b1: aload 7
      // b3: invokevirtual org/bouncycastle/crypto/modes/SICBlockCipher.init (ZLorg/bouncycastle/crypto/CipherParameters;)V
      // b6: goto c3
      // b9: astore 7
      // bb: aload 0
      // bc: aconst_null
      // bd: putfield com/finalshell/core/NK.y Lorg/bouncycastle/crypto/modes/SICBlockCipher;
      // c0: aload 7
      // c2: athrow
      // c3: return
   }

   @Override
   public void X(byte[] var1, int var2, int var3, byte[] var4, int var5) throws Exception {
      this.y.processBytes(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean Y() {
      return false;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20910;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 5570044209373346366L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "H)\u009a{»\u0007ÏÐps\u008c©ç¾$`";
      int var5 = "H)\u009a{»\u0007ÏÐps\u008c©ç¾$`".length();
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





