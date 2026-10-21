package com.finalshell.core;

import java.io.IOException;

public abstract class P__2 implements FO_2 {
   protected final Y42 a;
   protected final QT w;
   public boolean n = false;
   int B = 0;
   public static long[] i;
   public static Integer[] j;

   public P__2(Y42 var1, QT var2) {
      this.a = var1;
      this.w = var2;
   }

   @Override
   public boolean u() {
      String var1 = Dx4.g();
      boolean var10000 = this.n;
      if (var1 == null) {
         var10000 = !this.n;
      }

      return var10000;
   }

   @Override
   public void I() {
      this.n = false;
   }

   public abstract Cj4 r();

   public abstract boolean Q();

   protected abstract void C(char var1, QT var2) throws IOException;

   @Override
   public void C() throws IOException {
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
      // 05: getfield com/finalshell/core/P__2.a Lcom/finalshell/core/Y42;
      // 08: invokeinterface com/finalshell/core/Y42.O ()I 1
      // 0d: aload 1
      // 0e: ifnonnull 42
      // 11: ifne 32
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/P__2.a (Lcom/finalshell/io/P;)Lcom/finalshell/io/P;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield com/finalshell/core/P__2.a Lcom/finalshell/core/Y42;
      // 1f: invokeinterface com/finalshell/core/Y42.C ()C 1
      // 24: istore 2
      // 25: aload 0
      // 26: iload 2
      // 27: aload 0
      // 28: getfield com/finalshell/core/P__2.w Lcom/finalshell/core/QT;
      // 2b: invokevirtual com/finalshell/core/P__2.o (CLcom/finalshell/core/QT;)V
      // 2e: aload 1
      // 2f: ifnull ef
      // 32: aload 0
      // 33: getfield com/finalshell/core/P__2.a Lcom/finalshell/core/Y42;
      // 36: invokeinterface com/finalshell/core/Y42.O ()I 1
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/P__2.a (Lcom/finalshell/io/P;)Lcom/finalshell/io/P;
      // 41: athrow
      // 42: aload 1
      // 43: ifnonnull 88
      // 46: sipush 9316
      // 49: ldc2_w 5918974700195754420
      // 4c: invokestatic com/finalshell/core/P__2.a (IJ)I
      // 4f: if_icmpeq 80
      // 52: goto 59
      // 55: invokestatic com/finalshell/core/P__2.a (Lcom/finalshell/io/P;)Lcom/finalshell/io/P;
      // 58: athrow
      // 59: aload 0
      // 5a: getfield com/finalshell/core/P__2.a Lcom/finalshell/core/Y42;
      // 5d: invokeinterface com/finalshell/core/Y42.O ()I 1
      // 62: aload 1
      // 63: ifnonnull 88
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/P__2.a (Lcom/finalshell/io/P;)Lcom/finalshell/io/P;
      // 6c: athrow
      // 6d: sipush 32691
      // 70: ldc2_w 7223682465914448482
      // 73: invokestatic com/finalshell/core/P__2.a (IJ)I
      // 76: if_icmpne ef
      // 79: goto 80
      // 7c: invokestatic com/finalshell/core/P__2.a (Lcom/finalshell/io/P;)Lcom/finalshell/io/P;
      // 7f: athrow
      // 80: bipush 0
      // 81: goto 88
      // 84: invokestatic com/finalshell/core/P__2.a (Lcom/finalshell/io/P;)Lcom/finalshell/io/P;
      // 87: athrow
      // 88: istore 2
      // 89: aload 0
      // 8a: getfield com/finalshell/core/P__2.B I
      // 8d: aload 1
      // 8e: ifnonnull e0
      // 91: ifne d2
      // 94: goto 9b
      // 97: invokestatic com/finalshell/core/P__2.a (Lcom/finalshell/io/P;)Lcom/finalshell/io/P;
      // 9a: athrow
      // 9b: aload 0
      // 9c: invokevirtual com/finalshell/core/P__2.r ()Lcom/finalshell/core/Cj4;
      // 9f: astore 3
      // a0: aload 3
      // a1: invokevirtual com/finalshell/core/Cj4.f$To_2 ()Lcom/finalshell/io/To2;
      // a4: astore 4
      // a6: aload 4
      // a8: invokevirtual com/finalshell/io/To2.W ()Z
      // ab: istore 5
      // ad: iload 5
      // af: aload 1
      // b0: ifnonnull e0
      // b3: ifeq d2
      // b6: goto bd
      // b9: invokestatic com/finalshell/core/P__2.a (Lcom/finalshell/io/P;)Lcom/finalshell/io/P;
      // bc: athrow
      // bd: aload 0
      // be: invokevirtual com/finalshell/core/P__2.Q ()Z
      // c1: istore 2
      // c2: aload 0
      // c3: getfield com/finalshell/core/P__2.a Lcom/finalshell/core/Y42;
      // c6: bipush 0
      // c7: invokeinterface com/finalshell/core/Y42.o (I)V 2
      // cc: aload 4
      // ce: bipush 0
      // cf: invokevirtual com/finalshell/io/To2.U (Z)V
      // d2: aload 0
      // d3: aload 0
      // d4: getfield com/finalshell/core/P__2.a Lcom/finalshell/core/Y42;
      // d7: invokeinterface com/finalshell/core/Y42.O ()I 1
      // dc: putfield com/finalshell/core/P__2.B I
      // df: iload 2
      // e0: ifne ef
      // e3: new com/finalshell/io/P
      // e6: dup
      // e7: invokespecial com/finalshell/io/P.<init> ()V
      // ea: athrow
      // eb: invokestatic com/finalshell/core/P__2.a (Lcom/finalshell/io/P;)Lcom/finalshell/io/P;
      // ee: athrow
      // ef: goto f8
      // f2: astore 2
      // f3: aload 0
      // f4: bipush 1
      // f5: putfield com/finalshell/core/P__2.n Z
      // f8: return
   }

   protected abstract void o(char var1, QT var2) throws IOException;

   public static com.finalshell.io.P a(com.finalshell.io.P var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5585;
      if (j[var3] == null) {
         j[var3] = (int)(i[var3] ^ var1);
      }

      return j[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2246546256365630860L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "éþ:\u000bÉ$_úÑ|´Jé\u0099\u00042";
      int var5 = "éþ:\u000bÉ$_úÑ|´Jé\u0099\u00042".length();
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

      i = var6;
      j = new Integer[2];
   }
}





