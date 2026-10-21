class ne_2 implements Runnable {
   final tb_4 K;
   private static final long[] a;
   private static final Integer[] b;

   ne_2(tb_4 var1) {
      this.K = var1;
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
      // 000: invokestatic BS.s ()I
      // 003: sipush 27267
      // 006: ldc2_w 5289021133741390152
      // 009: invokestatic ne_2.a (IJ)I
      // 00c: newarray 8
      // 00e: astore 2
      // 00f: istore 1
      // 010: bipush 0
      // 011: istore 3
      // 012: aload 0
      // 013: ldc2_w 377164492700698227
      // 016: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 019: swap
      // 01a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 01d: ldc2_w 387347256520815117
      // 020: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 023: swap
      // 024: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 027: checkcast java/io/InputStream
      // 02a: aload 2
      // 02b: invokevirtual java/io/InputStream.read ([B)I
      // 02e: dup
      // 02f: istore 3
      // 030: ifle 0e3
      // 033: sipush 23375
      // 036: ldc2_w 2045959138722695301
      // 039: invokestatic ne_2.a (IJ)I
      // 03c: iload 3
      // 03d: imul
      // 03e: aload 0
      // 03f: ldc2_w 377164492700698227
      // 042: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 045: swap
      // 046: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 049: ldc2_w 375641075699496300
      // 04c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 04f: swap
      // 050: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 053: idiv
      // 054: i2l
      // 055: lstore 4
      // 057: invokestatic java/lang/System.currentTimeMillis ()J
      // 05a: lstore 6
      // 05c: aload 0
      // 05d: ldc2_w 377164492700698227
      // 060: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 063: swap
      // 064: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 067: ldc2_w 221957569033400503
      // 06a: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 06d: swap
      // 06e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 071: checkcast java/io/OutputStream
      // 074: aload 2
      // 075: bipush 0
      // 076: iload 3
      // 077: invokevirtual java/io/OutputStream.write ([BII)V
      // 07a: invokestatic java/lang/System.currentTimeMillis ()J
      // 07d: lload 6
      // 07f: lsub
      // 080: lstore 8
      // 082: aload 0
      // 083: ldc2_w 377164492700698227
      // 086: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 089: swap
      // 08a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 08d: checkcast tb_4
      // 090: iload 1
      // 091: ifeq 0f1
      // 094: ldc2_w 375641075699496300
      // 097: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 09a: swap
      // 09b: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 09e: iload 1
      // 09f: ifeq 0ca
      // 0a2: goto 0a9
      // 0a5: invokestatic ne_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0a8: athrow
      // 0a9: ifle 0df
      // 0ac: goto 0b3
      // 0af: invokestatic ne_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0b2: athrow
      // 0b3: lload 8
      // 0b5: lload 4
      // 0b7: iload 1
      // 0b8: ifeq 0d1
      // 0bb: goto 0c2
      // 0be: invokestatic ne_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0c1: athrow
      // 0c2: lcmp
      // 0c3: goto 0ca
      // 0c6: invokestatic ne_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0c9: athrow
      // 0ca: ifge 0df
      // 0cd: lload 4
      // 0cf: lload 8
      // 0d1: lsub
      // 0d2: invokestatic java/lang/Thread.sleep (J)V
      // 0d5: goto 0df
      // 0d8: astore 10
      // 0da: aload 10
      // 0dc: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 0df: iload 1
      // 0e0: ifne 012
      // 0e3: aload 0
      // 0e4: ldc2_w 377164492700698227
      // 0e7: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0ea: swap
      // 0eb: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0ee: checkcast tb_4
      // 0f1: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0f4: ldc2_w 607929959020247755
      // 0f7: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0fa: dup_x2
      // 0fb: pop
      // 0fc: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0ff: pop
      // 100: goto 107
      // 103: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 106: athrow
      // 107: goto 156
      // 10a: astore 4
      // 10c: aload 0
      // 10d: ldc2_w 377164492700698227
      // 110: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 113: swap
      // 114: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 117: invokestatic com/c.f ()[Ljava/lang/Object;
      // 11a: ldc2_w 607929959020247755
      // 11d: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 120: dup_x2
      // 121: pop
      // 122: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 125: pop
      // 126: goto 12d
      // 129: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 12c: athrow
      // 12d: goto 156
      // 130: astore 11
      // 132: aload 0
      // 133: ldc2_w 377164492700698227
      // 136: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 139: swap
      // 13a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 13d: invokestatic com/c.f ()[Ljava/lang/Object;
      // 140: ldc2_w 607929959020247755
      // 143: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 146: dup_x2
      // 147: pop
      // 148: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 14b: pop
      // 14c: goto 153
      // 14f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 152: athrow
      // 153: aload 11
      // 155: athrow
      // 156: return
   }

   private static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      long var0 = 525863845301221386L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = ",\f\b]MW\u0001B\f)\u0006í»á³g";
      int var5 = ",\f\b]MW\u0001B\f)\u0006í»á³g".length();
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5067;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





