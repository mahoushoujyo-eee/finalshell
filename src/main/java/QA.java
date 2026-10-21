class QA implements Runnable {
   final uR_3 L;
   private static final long a;
   private static final long[] b;
   private static final Long[] c;

   QA(uR_3 var1) {
      this.L = var1;
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
      // 000: invokestatic WT.y ()[Ljava/lang/String;
      // 003: sipush 20500
      // 006: ldc2_w 6667209510206160763
      // 009: invokestatic QA.a (IJ)J
      // 00c: lstore 2
      // 00d: astore 1
      // 00e: invokestatic java/lang/System.currentTimeMillis ()J
      // 011: aload 0
      // 012: ldc2_w 525647601846067930
      // 015: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 018: swap
      // 019: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 01c: ldc2_w 530790365418171386
      // 01f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 022: swap
      // 023: invokevirtual java/lang/reflect/Field.getLong (Ljava/lang/Object;)J
      // 026: lsub
      // 027: lconst_1
      // 028: lload 2
      // 029: lmul
      // 02a: lcmp
      // 02b: aload 1
      // 02c: ifnonnull 07e
      // 02f: ifle 22c
      // 032: goto 039
      // 035: invokestatic QA.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 038: athrow
      // 039: aload 0
      // 03a: ldc2_w 525647601846067930
      // 03d: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 040: swap
      // 041: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 044: checkcast uR_3
      // 047: aload 1
      // 048: ifnonnull 21b
      // 04b: goto 052
      // 04e: invokestatic QA.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 051: athrow
      // 052: ldc2_w 609415999077358020
      // 055: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 058: swap
      // 059: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 05c: invokestatic com/c.f ()[Ljava/lang/Object;
      // 05f: ldc2_w 262117569331123961
      // 062: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 065: dup_x2
      // 066: pop
      // 067: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 06a: checkcast java/lang/Boolean
      // 06d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 070: goto 077
      // 073: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 076: athrow
      // 077: goto 07e
      // 07a: invokestatic QA.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 07d: athrow
      // 07e: ifne 20d
      // 081: aload 0
      // 082: ldc2_w 525647601846067930
      // 085: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 088: swap
      // 089: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 08c: checkcast uR_3
      // 08f: aload 1
      // 090: ifnonnull 21b
      // 093: goto 09a
      // 096: invokestatic QA.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 099: athrow
      // 09a: ldc2_w 609415999077358020
      // 09d: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0a0: swap
      // 0a1: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0a4: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0a7: ldc2_w 529735557312904033
      // 0aa: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0ad: dup_x2
      // 0ae: pop
      // 0af: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0b2: checkcast java/lang/Boolean
      // 0b5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0b8: goto 0bf
      // 0bb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0be: athrow
      // 0bf: ifne 20d
      // 0c2: goto 0c9
      // 0c5: invokestatic QA.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0c8: athrow
      // 0c9: aload 0
      // 0ca: ldc2_w 525647601846067930
      // 0cd: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0d0: swap
      // 0d1: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0d4: ldc2_w 434677565278618930
      // 0d7: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0da: swap
      // 0db: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0de: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0e1: ldc2_w 180191510188721772
      // 0e4: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0e7: dup_x2
      // 0e8: pop
      // 0e9: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0ec: pop
      // 0ed: goto 0f4
      // 0f0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0f3: athrow
      // 0f4: bipush 0
      // 0f5: istore 4
      // 0f7: iload 4
      // 0f9: getstatic QA.a J
      // 0fc: l2i
      // 0fd: if_icmpge 20d
      // 100: sipush 18751
      // 103: ldc2_w 1094906347186300497
      // 106: invokestatic QA.a (IJ)J
      // 109: invokestatic java/lang/Thread.sleep (J)V
      // 10c: aload 1
      // 10d: ifnonnull 22c
      // 110: goto 11a
      // 113: astore 5
      // 115: aload 5
      // 117: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 11a: aload 0
      // 11b: ldc2_w 525647601846067930
      // 11e: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 121: swap
      // 122: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 125: ldc2_w 609415999077358020
      // 128: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 12b: swap
      // 12c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 12f: invokestatic com/c.f ()[Ljava/lang/Object;
      // 132: ldc2_w 529735557312904033
      // 135: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 138: dup_x2
      // 139: pop
      // 13a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 13d: checkcast java/lang/Boolean
      // 140: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 143: goto 14a
      // 146: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 149: athrow
      // 14a: aload 1
      // 14b: ifnonnull 185
      // 14e: ifeq 206
      // 151: goto 158
      // 154: invokestatic QA.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 157: athrow
      // 158: aload 0
      // 159: ldc2_w 525647601846067930
      // 15c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 15f: swap
      // 160: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 163: ldc2_w 434677565278618930
      // 166: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 169: swap
      // 16a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 16d: checkcast WT
      // 170: aload 1
      // 171: ifnonnull 1ef
      // 174: goto 17b
      // 177: invokestatic QA.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 17a: athrow
      // 17b: invokevirtual WT.isVisible ()Z
      // 17e: goto 185
      // 181: invokestatic QA.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 184: athrow
      // 185: ifne 206
      // 188: aload 0
      // 189: ldc2_w 525647601846067930
      // 18c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 18f: swap
      // 190: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 193: ldc2_w 434677565278618930
      // 196: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 199: swap
      // 19a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 19d: checkcast WT
      // 1a0: aconst_null
      // 1a1: invokevirtual WT.setLocationRelativeTo (Ljava/awt/Component;)V
      // 1a4: aload 0
      // 1a5: ldc2_w 525647601846067930
      // 1a8: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1ab: swap
      // 1ac: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1af: ldc2_w 434677565278618930
      // 1b2: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1b5: swap
      // 1b6: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1b9: bipush 1
      // 1ba: invokestatic com/c.a (Z)[Ljava/lang/Object;
      // 1bd: ldc2_w 351503280654568600
      // 1c0: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1c3: dup_x2
      // 1c4: pop
      // 1c5: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1c8: pop
      // 1c9: goto 1d0
      // 1cc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1cf: athrow
      // 1d0: aload 0
      // 1d1: ldc2_w 525647601846067930
      // 1d4: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1d7: swap
      // 1d8: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1db: ldc2_w 434677565278618930
      // 1de: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1e1: swap
      // 1e2: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1e5: checkcast WT
      // 1e8: goto 1ef
      // 1eb: invokestatic QA.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1ee: athrow
      // 1ef: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1f2: ldc2_w 214213921318960935
      // 1f5: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1f8: swap
      // 1f9: aconst_null
      // 1fa: swap
      // 1fb: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1fe: pop
      // 1ff: goto 206
      // 202: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 205: athrow
      // 206: iinc 4 1
      // 209: aload 1
      // 20a: ifnull 0f7
      // 20d: aload 0
      // 20e: ldc2_w 525647601846067930
      // 211: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 214: swap
      // 215: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 218: checkcast uR_3
      // 21b: invokestatic java/lang/System.currentTimeMillis ()J
      // 21e: dup2_x1
      // 21f: pop2
      // 220: ldc2_w 530790365418171386
      // 223: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 226: swap
      // 227: dup2_x2
      // 228: pop2
      // 229: invokevirtual java/lang/reflect/Field.setLong (Ljava/lang/Object;J)V
      // 22c: return
   }

   private static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      long var8 = 1987669997443141524L;
      long var10002 = -9114433563472900186L ^ var8;
      int var10001 = -1;
      a = var10002;
      long var0 = 8852650952532560489L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "&\\@\u009aõ\u0096ÿ\u0092uë\f¦Üf,\\";
      int var5 = "&\\@\u009aõ\u0096ÿ\u0092uë\f¦Üf,\\".length();
      byte var2 = 0;

      do {
         var10001 = var2;
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

      b = var6;
      c = new Long[2];
   }

   private static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 28527) & 32767;
      if (c[var3] == null) {
         c[var3] = b[var3] ^ var1;
      }

      return c[var3];
   }
}





