package com.finalshell.core;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.macs.HMac;

public abstract class KF implements FP {
   protected String Z;
   protected int N;
   protected Digest M;
   protected boolean i;
   public HMac C;
   public final byte[] l = new byte[4];
   public static long[] c;
   public static Integer[] d;

   KF() {
   }

   @Override
   public int h() {
      return this.N;
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
      // 00: invokestatic com/finalshell/core/K4.z ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: arraylength
      // 06: aload 2
      // 07: ifnonnull 23
      // 0a: aload 0
      // 0b: getfield com/finalshell/core/KF.N I
      // 0e: if_icmple 33
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/KF.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 0
      // 19: getfield com/finalshell/core/KF.N I
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/KF.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: newarray 8
      // 25: astore 3
      // 26: aload 1
      // 27: bipush 0
      // 28: aload 3
      // 29: bipush 0
      // 2a: aload 0
      // 2b: getfield com/finalshell/core/KF.N I
      // 2e: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 31: aload 3
      // 32: astore 1
      // 33: new org/bouncycastle/crypto/params/KeyParameter
      // 36: dup
      // 37: aload 1
      // 38: bipush 0
      // 39: aload 1
      // 3a: arraylength
      // 3b: invokespecial org/bouncycastle/crypto/params/KeyParameter.<init> ([BII)V
      // 3e: astore 3
      // 3f: aload 0
      // 40: new org/bouncycastle/crypto/macs/HMac
      // 43: dup
      // 44: aload 0
      // 45: getfield com/finalshell/core/KF.M Lorg/bouncycastle/crypto/Digest;
      // 48: invokespecial org/bouncycastle/crypto/macs/HMac.<init> (Lorg/bouncycastle/crypto/Digest;)V
      // 4b: putfield com/finalshell/core/KF.C Lorg/bouncycastle/crypto/macs/HMac;
      // 4e: aload 0
      // 4f: getfield com/finalshell/core/KF.C Lorg/bouncycastle/crypto/macs/HMac;
      // 52: aload 3
      // 53: invokevirtual org/bouncycastle/crypto/macs/HMac.init (Lorg/bouncycastle/crypto/CipherParameters;)V
      // 56: return
   }

   @Override
   public void H(int var1) {
      this.l[0] = (byte)(var1 >>> a(23333, 7783446884609124978L));
      this.l[1] = (byte)(var1 >>> a(8369, 8227531270450745829L));
      this.l[2] = (byte)(var1 >>> a(25374, 5359407350381859403L));
      this.l[3] = (byte)var1;
      this.o(this.l, 0, 4);
   }

   @Override
   public void o(byte[] var1, int var2, int var3) {
      this.C.update(var1, var2, var3);
   }

   @Override
   public void U(byte[] var1, int var2) {
      this.C.doFinal(var1, var2);
   }

   @Override
   public String k() {
      return this.Z;
   }

   @Override
   public boolean P() {
      return this.i;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12629;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8872236794754149876L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "ïÅ~6lX\u007f·-}\u0092\u0091óÚ<\u0001öÁKUoGÇ\u009e";
      int var5 = "ïÅ~6lX\u007f·-}\u0092\u0091óÚ<\u0001öÁKUoGÇ\u009e".length();
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

      c = var6;
      d = new Integer[3];
   }
}





