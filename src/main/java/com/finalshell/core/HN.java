package com.finalshell.core;

import java.io.IOException;
import org.jetbrains.annotations.Nullable;

public class HN extends HV {
   public final Fv2_2 l;
   @Nullable
   public final Runnable n;
   public static long[] a;
   public static Integer[] c;

   public HN(Fv2_2 var1, @Nullable Runnable var2) {
      super(new char[a(18788, 3622483169953994870L)], 0, 0);
      this.l = var1;
      this.n = var2;
   }

   public HN(Fv2_2 var1) {
      super(new char[a(11404, 3461059375089171871L)], 0, 0);
      this.l = var1;
      this.n = null;
   }

   public void q() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dx4.g ()Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/core/HN.l Lcom/finalshell/core/Fv2_2;
      // 07: bipush 0
      // 08: invokeinterface com/finalshell/core/Fv2_2.R (Z)V 2
      // 0d: astore 1
      // 0e: aload 0
      // 0f: bipush 0
      // 10: putfield com/finalshell/core/HN.X I
      // 13: aload 0
      // 14: getfield com/finalshell/core/HN.l Lcom/finalshell/core/Fv2_2;
      // 17: invokeinterface com/finalshell/core/Fv2_2.A ()Z 1
      // 1c: aload 1
      // 1d: ifnonnull 7c
      // 20: ifne 53
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/HN.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 29: athrow
      // 2a: aload 0
      // 2b: aload 1
      // 2c: ifnonnull 6e
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/HN.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 35: athrow
      // 36: getfield com/finalshell/core/HN.n Ljava/lang/Runnable;
      // 39: ifnull 53
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/HN.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 42: athrow
      // 43: aload 0
      // 44: getfield com/finalshell/core/HN.n Ljava/lang/Runnable;
      // 47: invokeinterface java/lang/Runnable.run ()V 1
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/HN.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 52: athrow
      // 53: aload 0
      // 54: aload 0
      // 55: getfield com/finalshell/core/HN.l Lcom/finalshell/core/Fv2_2;
      // 58: aload 0
      // 59: getfield com/finalshell/core/HN.K [C
      // 5c: aload 0
      // 5d: getfield com/finalshell/core/HN.X I
      // 60: aload 0
      // 61: getfield com/finalshell/core/HN.K [C
      // 64: arraylength
      // 65: invokeinterface com/finalshell/core/Fv2_2.x ([CII)I 4
      // 6a: putfield com/finalshell/core/HN.t I
      // 6d: aload 0
      // 6e: aload 1
      // 6f: ifnonnull 80
      // 72: getfield com/finalshell/core/HN.t I
      // 75: goto 7c
      // 78: invokestatic com/finalshell/core/HN.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 7b: athrow
      // 7c: ifgt 8c
      // 7f: aload 0
      // 80: bipush 0
      // 81: putfield com/finalshell/core/HN.t I
      // 84: new com/finalshell/io/P
      // 87: dup
      // 88: invokespecial com/finalshell/io/P.<init> ()V
      // 8b: athrow
      // 8c: return
   }

   @Override
   public char C() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dx4.g ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 35
      // 09: getfield com/finalshell/core/HN.t I
      // 0c: ifeq 34
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/HN.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/HN.l Lcom/finalshell/core/Fv2_2;
      // 1a: invokeinterface com/finalshell/core/Fv2_2.l ()Z 1
      // 1f: aload 1
      // 20: ifnonnull 3c
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/HN.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 29: athrow
      // 2a: ifeq 38
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/HN.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 33: athrow
      // 34: aload 0
      // 35: invokespecial com/finalshell/core/HN.q ()V
      // 38: aload 0
      // 39: invokespecial com/finalshell/core/HV.C ()C
      // 3c: ireturn
   }

   @Override
   public String a(int param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dx4.g ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 3c
      // 09: getfield com/finalshell/core/HN.t I
      // 0c: ifeq 34
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/HN.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 15: athrow
      // 16: aload 0
      // 17: aload 2
      // 18: ifnonnull 40
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/HN.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 21: athrow
      // 22: getfield com/finalshell/core/HN.l Lcom/finalshell/core/Fv2_2;
      // 25: invokeinterface com/finalshell/core/Fv2_2.l ()Z 1
      // 2a: ifeq 3f
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/HN.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 33: athrow
      // 34: aload 0
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/HN.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 3b: athrow
      // 3c: invokespecial com/finalshell/core/HN.q ()V
      // 3f: aload 0
      // 40: iload 1
      // 41: invokespecial com/finalshell/core/HV.a (I)Ljava/lang/String;
      // 44: areturn
   }

   @Override
   public String toString() {
      return Sd2.Z(new String(this.K, this.X, this.t));
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4370;
      if (c[var3] == null) {
         c[var3] = (int)(a[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var0 = 796296958058265422L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "n\u009f\u001e>]9'8|ùa<NpÂÑ";
      int var5 = "n\u009f\u001e>]9'8|ùa<NpÂÑ".length();
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
      c = new Integer[2];
   }
}





