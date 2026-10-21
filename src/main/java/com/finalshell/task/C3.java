package com.finalshell.task;

public class C3 implements Runnable {
   public static long a;
   public static long[] b;
   public static Long[] c;

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
      // 000: invokestatic com/finalshell/ui/panel/F8.y ()[Ljava/lang/String;
      // 003: sipush 26053
      // 006: ldc2_w 3321171622737765642
      // 009: invokestatic com/finalshell/task/C3.a (IJ)J
      // 00c: lstore 2
      // 00d: astore 1
      // 00e: invokestatic java/lang/System.currentTimeMillis ()J
      // 011: ldc2_w 383251759444111355
      // 014: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 017: aconst_null
      // 018: invokevirtual java/lang/reflect/Field.getLong (Ljava/lang/Object;)J
      // 01b: lsub
      // 01c: lconst_1
      // 01d: lload 2
      // 01e: lmul
      // 01f: lcmp
      // 020: ifge 219
      // 023: ldc2_w 529321737223656579
      // 026: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 029: aconst_null
      // 02a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 02d: checkcast com/finalshell/ui/frame/UpdateFrame
      // 030: ifnull 219
      // 033: goto 03a
      // 036: invokestatic com/finalshell/task/C3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 039: athrow
      // 03a: invokestatic java/lang/System.currentTimeMillis ()J
      // 03d: ldc2_w 439310380079510832
      // 040: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 043: aconst_null
      // 044: invokevirtual java/lang/reflect/Field.getLong (Ljava/lang/Object;)J
      // 047: lsub
      // 048: lconst_1
      // 049: lload 2
      // 04a: lmul
      // 04b: lcmp
      // 04c: ifle 219
      // 04f: goto 056
      // 052: invokestatic com/finalshell/task/C3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 055: athrow
      // 056: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 059: ldc2_w 270389152141252877
      // 05c: astore 7
      // 05e: ldc2_w 270389152141252877
      // 061: aload 7
      // 063: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 066: goto 06d
      // 069: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 06c: athrow
      // 06d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 070: ldc2_w 479882039388176646
      // 073: astore 10
      // 075: astore 9
      // 077: ldc2_w 479882039388176646
      // 07a: aload 9
      // 07c: aload 10
      // 07e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 081: checkcast com/finalshell/core/Yy4_2
      // 084: goto 08b
      // 087: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08a: athrow
      // 08b: astore 4
      // 08d: aload 4
      // 08f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 092: ldc2_w 187198425743999659
      // 095: astore 12
      // 097: astore 11
      // 099: ldc2_w 187198425743999659
      // 09c: aload 11
      // 09e: aload 12
      // 0a0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a3: checkcast java/lang/Boolean
      // 0a6: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0a9: goto 0b0
      // 0ac: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0af: athrow
      // 0b0: aload 1
      // 0b1: ifnonnull 0e8
      // 0b4: ifne 20a
      // 0b7: goto 0be
      // 0ba: invokestatic com/finalshell/task/C3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0bd: athrow
      // 0be: aload 4
      // 0c0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0c3: ldc2_w 547240307566989756
      // 0c6: astore 14
      // 0c8: astore 13
      // 0ca: ldc2_w 547240307566989756
      // 0cd: aload 13
      // 0cf: aload 14
      // 0d1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0d4: checkcast java/lang/Boolean
      // 0d7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0da: goto 0e1
      // 0dd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/task/C3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0e7: athrow
      // 0e8: aload 1
      // 0e9: ifnonnull 124
      // 0ec: ifne 20a
      // 0ef: goto 0f6
      // 0f2: invokestatic com/finalshell/task/C3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0f5: athrow
      // 0f6: ldc2_w 529321737223656579
      // 0f9: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0fc: aconst_null
      // 0fd: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 100: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 103: ldc2_w 558988037493500446
      // 106: astore 16
      // 108: astore 15
      // 10a: ldc2_w 558988037493500446
      // 10d: aload 15
      // 10f: aload 16
      // 111: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 114: pop
      // 115: goto 11c
      // 118: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 11b: athrow
      // 11c: bipush 0
      // 11d: goto 124
      // 120: invokestatic com/finalshell/task/C3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 123: athrow
      // 124: istore 5
      // 126: iload 5
      // 128: getstatic com/finalshell/task/C3.a J
      // 12b: l2i
      // 12c: if_icmpge 20a
      // 12f: sipush 11276
      // 132: ldc2_w 7754499588254936258
      // 135: invokestatic com/finalshell/task/C3.a (IJ)J
      // 138: invokestatic java/lang/Thread.sleep (J)V
      // 13b: aload 1
      // 13c: ifnonnull 219
      // 13f: goto 149
      // 142: astore 6
      // 144: aload 6
      // 146: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 149: aload 4
      // 14b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 14e: ldc2_w 547240307566989756
      // 151: astore 18
      // 153: astore 17
      // 155: ldc2_w 547240307566989756
      // 158: aload 17
      // 15a: aload 18
      // 15c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 15f: checkcast java/lang/Boolean
      // 162: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 165: goto 16c
      // 168: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 16b: athrow
      // 16c: aload 1
      // 16d: ifnonnull 19c
      // 170: ifeq 203
      // 173: goto 17a
      // 176: invokestatic com/finalshell/task/C3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 179: athrow
      // 17a: ldc2_w 529321737223656579
      // 17d: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 180: aconst_null
      // 181: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 184: checkcast com/finalshell/ui/frame/UpdateFrame
      // 187: aload 1
      // 188: ifnonnull 1eb
      // 18b: goto 192
      // 18e: invokestatic com/finalshell/task/C3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 191: athrow
      // 192: invokevirtual com/finalshell/ui/frame/UpdateFrame.isVisible ()Z
      // 195: goto 19c
      // 198: invokestatic com/finalshell/task/C3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 19b: athrow
      // 19c: ifne 203
      // 19f: ldc2_w 529321737223656579
      // 1a2: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1a5: aconst_null
      // 1a6: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1a9: checkcast com/finalshell/ui/frame/UpdateFrame
      // 1ac: aconst_null
      // 1ad: invokevirtual com/finalshell/ui/frame/UpdateFrame.setLocationRelativeTo (Ljava/awt/Component;)V
      // 1b0: ldc2_w 529321737223656579
      // 1b3: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1b6: aconst_null
      // 1b7: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1ba: bipush 1
      // 1bb: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 1be: ldc2_w 610529704363663802
      // 1c1: astore 20
      // 1c3: astore 19
      // 1c5: ldc2_w 610529704363663802
      // 1c8: aload 19
      // 1ca: aload 20
      // 1cc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1cf: pop
      // 1d0: goto 1d7
      // 1d3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1d6: athrow
      // 1d7: ldc2_w 529321737223656579
      // 1da: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1dd: aconst_null
      // 1de: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1e1: checkcast com/finalshell/ui/frame/UpdateFrame
      // 1e4: goto 1eb
      // 1e7: invokestatic com/finalshell/task/C3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1ea: athrow
      // 1eb: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1ee: ldc2_w 214213921318960935
      // 1f1: astore 21
      // 1f3: ldc2_w 214213921318960935
      // 1f6: aload 21
      // 1f8: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1fb: pop
      // 1fc: goto 203
      // 1ff: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 202: athrow
      // 203: iinc 5 1
      // 206: aload 1
      // 207: ifnull 126
      // 20a: invokestatic java/lang/System.currentTimeMillis ()J
      // 20d: ldc2_w 439310380079510832
      // 210: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 213: aconst_null
      // 214: dup2_x2
      // 215: pop2
      // 216: invokevirtual java/lang/reflect/Field.setLong (Ljava/lang/Object;J)V
      // 219: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 207) & 32767;
      if (c[var3] == null) {
         c[var3] = b[var3] ^ var1;
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var8 = 8087108803887025739L;
      long var10002 = -9084487852194083207L ^ var8;
      int var10001 = -1;
      a = var10002;
      long var0 = 6965780921769082607L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "N¼G)\u000f\u007f\u0007å\u000b6è\u009dÉä\u0012I";
      int var5 = "N¼G)\u000f\u007f\u0007å\u000b6è\u009dÉä\u0012I".length();
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
}





