package com.finalshell.task;

import com.finalshell.core.WC_2;

public class SQ implements Runnable {
   final int m;
   final WC_2 n;

   SQ(WC_2 var1, int var2) {
      this.n = var1;
      this.m = var2;
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
      // 000: invokestatic com/finalshell/core/WC_2.V ()[I
      // 003: aload 0
      // 004: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 007: aload 0
      // 008: getfield com/finalshell/task/SQ.m I
      // 00b: bipush 1
      // 00c: invokevirtual com/finalshell/core/WC_2.R (IZ)V
      // 00f: astore 1
      // 010: aload 0
      // 011: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 014: aload 1
      // 015: ifnonnull 039
      // 018: invokevirtual com/finalshell/core/WC_2.E ()J
      // 01b: lconst_0
      // 01c: lcmp
      // 01d: ifge 035
      // 020: goto 027
      // 023: invokestatic com/finalshell/task/SQ.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 026: athrow
      // 027: aload 0
      // 028: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 02b: invokevirtual com/finalshell/core/WC_2.k ()J
      // 02e: goto 03c
      // 031: invokestatic com/finalshell/task/SQ.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 034: athrow
      // 035: aload 0
      // 036: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 039: invokevirtual com/finalshell/core/WC_2.E ()J
      // 03c: lstore 2
      // 03d: lload 2
      // 03e: lconst_0
      // 03f: lcmp
      // 040: aload 1
      // 041: ifnonnull 077
      // 044: ifle 06b
      // 047: goto 04e
      // 04a: invokestatic com/finalshell/task/SQ.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 04d: athrow
      // 04e: aload 0
      // 04f: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 052: invokestatic java/lang/System.currentTimeMillis ()J
      // 055: putfield com/finalshell/core/WC_2.E J
      // 058: aload 0
      // 059: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 05c: lload 2
      // 05d: putfield com/finalshell/core/WC_2.t J
      // 060: lload 2
      // 061: invokestatic java/lang/Thread.sleep (J)V
      // 064: goto 06b
      // 067: invokestatic com/finalshell/task/SQ.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 06a: athrow
      // 06b: aload 0
      // 06c: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 06f: bipush -1
      // 070: aload 0
      // 071: getfield com/finalshell/task/SQ.m I
      // 074: invokevirtual com/finalshell/core/WC_2.E (II)Z
      // 077: aload 1
      // 078: ifnonnull 0a6
      // 07b: ifeq 16e
      // 07e: goto 085
      // 081: invokestatic com/finalshell/task/SQ.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 084: athrow
      // 085: aload 0
      // 086: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 089: bipush 0
      // 08a: putfield com/finalshell/core/WC_2.N I
      // 08d: aload 0
      // 08e: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 091: aload 1
      // 092: ifnonnull 165
      // 095: goto 09c
      // 098: invokestatic com/finalshell/task/SQ.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 09b: athrow
      // 09c: getfield com/finalshell/core/WC_2.p Z
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/task/SQ.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0a5: athrow
      // 0a6: ifeq 156
      // 0a9: aload 0
      // 0aa: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 0ad: aload 0
      // 0ae: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 0b1: getfield com/finalshell/core/WC_2.N I
      // 0b4: aload 0
      // 0b5: getfield com/finalshell/task/SQ.m I
      // 0b8: invokevirtual com/finalshell/core/WC_2.E (II)Z
      // 0bb: ifeq 16e
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/task/SQ.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 0c9: aload 0
      // 0ca: getfield com/finalshell/task/SQ.m I
      // 0cd: invokevirtual com/finalshell/core/WC_2.X (I)V
      // 0d0: aload 0
      // 0d1: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 0d4: dup
      // 0d5: getfield com/finalshell/core/WC_2.N I
      // 0d8: bipush 1
      // 0d9: iadd
      // 0da: putfield com/finalshell/core/WC_2.N I
      // 0dd: aload 0
      // 0de: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 0e1: aload 0
      // 0e2: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 0e5: getfield com/finalshell/core/WC_2.N I
      // 0e8: aload 1
      // 0e9: ifnonnull 17a
      // 0ec: aload 0
      // 0ed: getfield com/finalshell/task/SQ.m I
      // 0f0: invokevirtual com/finalshell/core/WC_2.E (II)Z
      // 0f3: aload 1
      // 0f4: ifnonnull 12e
      // 0f7: goto 0fe
      // 0fa: invokestatic com/finalshell/task/SQ.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0fd: athrow
      // 0fe: ifne 113
      // 101: goto 108
      // 104: invokestatic com/finalshell/task/SQ.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 107: athrow
      // 108: aload 1
      // 109: ifnull 16e
      // 10c: goto 113
      // 10f: invokestatic com/finalshell/task/SQ.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 112: athrow
      // 113: aload 0
      // 114: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 117: invokevirtual com/finalshell/core/WC_2.k ()J
      // 11a: aload 1
      // 11b: ifnonnull 138
      // 11e: goto 125
      // 121: invokestatic com/finalshell/task/SQ.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 124: athrow
      // 125: lconst_0
      // 126: lcmp
      // 127: goto 12e
      // 12a: invokestatic com/finalshell/task/SQ.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 12d: athrow
      // 12e: ifle 0a9
      // 131: aload 0
      // 132: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 135: invokevirtual com/finalshell/core/WC_2.k ()J
      // 138: lstore 4
      // 13a: aload 0
      // 13b: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 13e: invokestatic java/lang/System.currentTimeMillis ()J
      // 141: putfield com/finalshell/core/WC_2.E J
      // 144: aload 0
      // 145: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 148: lload 4
      // 14a: putfield com/finalshell/core/WC_2.t J
      // 14d: lload 4
      // 14f: invokestatic java/lang/Thread.sleep (J)V
      // 152: aload 1
      // 153: ifnull 0a9
      // 156: aload 0
      // 157: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 15a: aload 0
      // 15b: getfield com/finalshell/task/SQ.m I
      // 15e: invokevirtual com/finalshell/core/WC_2.X (I)V
      // 161: aload 0
      // 162: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 165: dup
      // 166: getfield com/finalshell/core/WC_2.N I
      // 169: bipush 1
      // 16a: iadd
      // 16b: putfield com/finalshell/core/WC_2.N I
      // 16e: goto 172
      // 171: astore 2
      // 172: aload 0
      // 173: getfield com/finalshell/task/SQ.n Lcom/finalshell/core/WC_2;
      // 176: aload 0
      // 177: getfield com/finalshell/task/SQ.m I
      // 17a: invokevirtual com/finalshell/core/WC_2.L (I)V
      // 17d: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }
}





