package com;

class St_2 implements Runnable {
   final pA_3 h;
   final pv_4 p;
   private static final long[] a;
   private static final Long[] b;

   St_2(pv_4 var1, pA_3 var2) {
      this.p = var1;
      this.h = var2;
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
      // 00: invokestatic com/pv_4.r ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/St_2.p Lcom/pv_4;
      // 08: getfield com/pv_4.N Z
      // 0b: ifeq 8f
      // 0e: aload 0
      // 0f: getfield com/St_2.p Lcom/pv_4;
      // 12: getfield com/pv_4.D J
      // 15: aload 1
      // 16: ifnonnull 80
      // 19: goto 20
      // 1c: invokestatic com/St_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield com/St_2.p Lcom/pv_4;
      // 24: getfield com/pv_4.u J
      // 27: lcmp
      // 28: ifle 77
      // 2b: goto 32
      // 2e: invokestatic com/St_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 31: athrow
      // 32: invokestatic java/lang/System.currentTimeMillis ()J
      // 35: aload 0
      // 36: getfield com/St_2.p Lcom/pv_4;
      // 39: getfield com/pv_4.u J
      // 3c: lsub
      // 3d: aload 1
      // 3e: ifnonnull 80
      // 41: goto 48
      // 44: invokestatic com/St_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 47: athrow
      // 48: sipush 22532
      // 4b: ldc2_w 8434462274215841486
      // 4e: invokestatic com/St_2.a (IJ)J
      // 51: lcmp
      // 52: ifle 77
      // 55: goto 5c
      // 58: invokestatic com/St_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 5b: athrow
      // 5c: aload 0
      // 5d: getfield com/St_2.p Lcom/pv_4;
      // 60: invokestatic java/lang/System.currentTimeMillis ()J
      // 63: putfield com/pv_4.u J
      // 66: aload 0
      // 67: getfield com/St_2.h Lcom/pA_3;
      // 6a: invokevirtual com/pA_3.X ()Lcom/_y_2;
      // 6d: invokevirtual com/_y_2.i ()V
      // 70: goto 77
      // 73: invokestatic com/St_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 76: athrow
      // 77: sipush 220
      // 7a: ldc2_w 7996534373689153047
      // 7d: invokestatic com/St_2.a (IJ)J
      // 80: invokestatic java/lang/Thread.sleep (J)V
      // 83: goto 04
      // 86: astore 2
      // 87: aload 2
      // 88: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 8b: aload 1
      // 8c: ifnull 04
      // 8f: return
   }

   private static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      long var0 = 2750877374834824345L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "S .¥å¡Ú3HÔqÀòA\u0002ê";
      int var5 = "S .¥å¡Ú3HÔqÀòA\u0002ê".length();
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
      b = new Long[2];
   }

   private static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 22218) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }
}





