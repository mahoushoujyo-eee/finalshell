package com.finalshell.core;

import java.io.IOException;
import java.io.OutputStream;

public class AU extends A2 {
   public OutputStream W;

   public AU(OutputStream var1) {
      this.W = var1;
   }

   public void p(byte var1) throws IOException {
      this.W.write(var1);
   }

   public void I(byte[] var1) throws IOException {
      this.W.write(var1);
      this.W.flush();
   }

   public void C(Ub2 param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Mp2.o ()[Ljava/lang/String;
      // 003: aload 1
      // 004: invokevirtual com/finalshell/core/Ub2.R ()Lcom/finalshell/core/Ky2;
      // 007: astore 3
      // 008: astore 2
      // 009: aconst_null
      // 00a: astore 4
      // 00c: aload 1
      // 00d: aload 2
      // 00e: ifnull 026
      // 011: instanceof com/finalshell/core/Uw2
      // 014: ifeq 02e
      // 017: goto 01e
      // 01a: invokestatic com/finalshell/core/AU.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 01d: athrow
      // 01e: aload 1
      // 01f: goto 026
      // 022: invokestatic com/finalshell/core/AU.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 025: athrow
      // 026: checkcast com/finalshell/core/Uw2
      // 029: invokevirtual com/finalshell/core/Uw2.f ()Lcom/finalshell/ui/model/Yu4;
      // 02c: astore 4
      // 02e: aload 4
      // 030: ifnull 076
      // 033: bipush 0
      // 034: istore 5
      // 036: iload 5
      // 038: aload 4
      // 03a: invokevirtual com/finalshell/ui/model/Yu4.c$int ()I
      // 03d: if_icmpge 063
      // 040: aload 0
      // 041: getstatic com/finalshell/ui/model/X9.ZPAD Lcom/finalshell/ui/model/X9;
      // 044: invokevirtual com/finalshell/ui/model/X9.r ()B
      // 047: invokevirtual com/finalshell/core/AU.p (B)V
      // 04a: iinc 5 1
      // 04d: aload 2
      // 04e: ifnull 06d
      // 051: aload 2
      // 052: ifnonnull 036
      // 055: goto 05c
      // 058: invokestatic com/finalshell/core/AU.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 05b: athrow
      // 05c: bipush 5
      // 05d: anewarray 75
      // 060: invokestatic com/finalshell/ui/panel/Ky4.K ([Ljava/lang/String;)V
      // 063: aload 0
      // 064: getstatic com/finalshell/ui/model/X9.ZDLE Lcom/finalshell/ui/model/X9;
      // 067: invokevirtual com/finalshell/ui/model/X9.r ()B
      // 06a: invokevirtual com/finalshell/core/AU.p (B)V
      // 06d: aload 0
      // 06e: aload 4
      // 070: invokevirtual com/finalshell/ui/model/Yu4.T ()B
      // 073: invokevirtual com/finalshell/core/AU.p (B)V
      // 076: bipush 0
      // 077: istore 5
      // 079: aload 3
      // 07a: invokeinterface com/finalshell/core/Ky2.K ()Z 1
      // 07f: ifeq 09e
      // 082: iinc 5 1
      // 085: aload 0
      // 086: aload 3
      // 087: invokeinterface com/finalshell/core/Ky2.c ()B 1
      // 08c: invokevirtual com/finalshell/core/AU.p (B)V
      // 08f: aload 2
      // 090: ifnull 0e6
      // 093: aload 2
      // 094: ifnonnull 079
      // 097: goto 09e
      // 09a: invokestatic com/finalshell/core/AU.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 09d: athrow
      // 09e: aload 4
      // 0a0: aload 2
      // 0a1: ifnull 0b0
      // 0a4: ifnull 0e6
      // 0a7: goto 0ae
      // 0aa: invokestatic com/finalshell/core/AU.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0ad: athrow
      // 0ae: aload 4
      // 0b0: invokevirtual com/finalshell/ui/model/Yu4.d ()Z
      // 0b3: aload 2
      // 0b4: ifnull 0f5
      // 0b7: ifeq 0e6
      // 0ba: goto 0c1
      // 0bd: invokestatic com/finalshell/core/AU.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: getstatic com/finalshell/ui/model/KD3.CR Lcom/finalshell/ui/model/KD3;
      // 0c5: invokevirtual com/finalshell/ui/model/KD3.m$byte ()B
      // 0c8: invokevirtual com/finalshell/core/AU.p (B)V
      // 0cb: aload 0
      // 0cc: getstatic com/finalshell/ui/model/KD3.LF Lcom/finalshell/ui/model/KD3;
      // 0cf: invokevirtual com/finalshell/ui/model/KD3.m$byte ()B
      // 0d2: invokevirtual com/finalshell/core/AU.p (B)V
      // 0d5: aload 0
      // 0d6: getstatic com/finalshell/ui/model/KD3.XON Lcom/finalshell/ui/model/KD3;
      // 0d9: invokevirtual com/finalshell/ui/model/KD3.m$byte ()B
      // 0dc: invokevirtual com/finalshell/core/AU.p (B)V
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/AU.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0e5: athrow
      // 0e6: aload 1
      // 0e7: aload 2
      // 0e8: ifnull 0f9
      // 0eb: instanceof com/finalshell/core/UK
      // 0ee: goto 0f5
      // 0f1: invokestatic com/finalshell/core/AU.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0f4: athrow
      // 0f5: ifeq 116
      // 0f8: aload 1
      // 0f9: checkcast com/finalshell/core/UK
      // 0fc: invokevirtual com/finalshell/core/UK.e ()Lcom/finalshell/ui/model/X9;
      // 0ff: getstatic com/finalshell/ui/model/X9.ZCRCW Lcom/finalshell/ui/model/X9;
      // 102: if_acmpne 116
      // 105: aload 0
      // 106: getstatic com/finalshell/ui/model/KD3.XON Lcom/finalshell/ui/model/KD3;
      // 109: invokevirtual com/finalshell/ui/model/KD3.m$byte ()B
      // 10c: invokevirtual com/finalshell/core/AU.p (B)V
      // 10f: goto 116
      // 112: invokestatic com/finalshell/core/AU.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 115: athrow
      // 116: aload 0
      // 117: getfield com/finalshell/core/AU.W Ljava/io/OutputStream;
      // 11a: invokevirtual java/io/OutputStream.flush ()V
      // 11d: return
   }

   @Override
   public void H(Object var1) throws IOException {
      this.C((Ub2)var1);
   }

   public static IOException a(IOException var0) {
      return var0;
   }
}





