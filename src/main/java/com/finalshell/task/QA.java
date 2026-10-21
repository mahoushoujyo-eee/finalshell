package com.finalshell.task;

import com.finalshell.core.UR3;

public class QA implements Runnable {
   final UR3 L;
   public static long a;
   public static long[] b;
   public static Long[] c;

   QA(UR3 var1) {
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
      // 000: invokestatic com/finalshell/ui/dialog/UpdateDialog.y ()[Ljava/lang/String;
      // 003: sipush 20500
      // 006: ldc2_w 6667209510206160763
      // 009: invokestatic com/finalshell/task/QA.a (IJ)J
      // 00c: lstore 2
      // 00d: astore 1
      // 00e: invokestatic java/lang/System.currentTimeMillis ()J
      // 011: aload 0
      // 012: ldc2_w 525647601846067930
      // 015: astore 6
      // 017: ldc2_w 525647601846067930
      // 01a: aload 6
      // 01c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 01f: ldc2_w 530790365418171386
      // 022: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 025: swap
      // 026: invokevirtual java/lang/reflect/Field.getLong (Ljava/lang/Object;)J
      // 029: lsub
      // 02a: lconst_1
      // 02b: lload 2
      // 02c: lmul
      // 02d: lcmp
      // 02e: aload 1
      // 02f: ifnonnull 08d
      // 032: ifle 281
      // 035: goto 03c
      // 038: invokestatic com/finalshell/task/QA.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 03b: athrow
      // 03c: aload 0
      // 03d: ldc2_w 525647601846067930
      // 040: astore 8
      // 042: ldc2_w 525647601846067930
      // 045: aload 8
      // 047: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 04a: checkcast com/finalshell/core/UR3
      // 04d: aload 1
      // 04e: ifnonnull 270
      // 051: goto 058
      // 054: invokestatic com/finalshell/task/QA.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 057: athrow
      // 058: ldc2_w 609415999077358020
      // 05b: astore 10
      // 05d: ldc2_w 609415999077358020
      // 060: aload 10
      // 062: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 065: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 068: ldc2_w 262117569331123961
      // 06b: astore 13
      // 06d: astore 12
      // 06f: ldc2_w 262117569331123961
      // 072: aload 12
      // 074: aload 13
      // 076: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 079: checkcast java/lang/Boolean
      // 07c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 07f: goto 086
      // 082: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 085: athrow
      // 086: goto 08d
      // 089: invokestatic com/finalshell/task/QA.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 08c: athrow
      // 08d: ifne 25f
      // 090: aload 0
      // 091: ldc2_w 525647601846067930
      // 094: astore 14
      // 096: ldc2_w 525647601846067930
      // 099: aload 14
      // 09b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 09e: checkcast com/finalshell/core/UR3
      // 0a1: aload 1
      // 0a2: ifnonnull 270
      // 0a5: goto 0ac
      // 0a8: invokestatic com/finalshell/task/QA.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0ab: athrow
      // 0ac: ldc2_w 609415999077358020
      // 0af: astore 16
      // 0b1: ldc2_w 609415999077358020
      // 0b4: aload 16
      // 0b6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0b9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0bc: ldc2_w 529735557312904033
      // 0bf: astore 19
      // 0c1: astore 18
      // 0c3: ldc2_w 529735557312904033
      // 0c6: aload 18
      // 0c8: aload 19
      // 0ca: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0cd: checkcast java/lang/Boolean
      // 0d0: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d3: goto 0da
      // 0d6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0d9: athrow
      // 0da: ifne 25f
      // 0dd: goto 0e4
      // 0e0: invokestatic com/finalshell/task/QA.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: ldc2_w 525647601846067930
      // 0e8: astore 20
      // 0ea: ldc2_w 525647601846067930
      // 0ed: aload 20
      // 0ef: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f2: ldc2_w 434677565278618930
      // 0f5: astore 22
      // 0f7: ldc2_w 434677565278618930
      // 0fa: aload 22
      // 0fc: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0ff: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 102: ldc2_w 180191510188721772
      // 105: astore 25
      // 107: astore 24
      // 109: ldc2_w 180191510188721772
      // 10c: aload 24
      // 10e: aload 25
      // 110: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 113: pop
      // 114: goto 11b
      // 117: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 11a: athrow
      // 11b: bipush 0
      // 11c: istore 4
      // 11e: iload 4
      // 120: getstatic com/finalshell/task/QA.a J
      // 123: l2i
      // 124: if_icmpge 25f
      // 127: sipush 18751
      // 12a: ldc2_w 1094906347186300497
      // 12d: invokestatic com/finalshell/task/QA.a (IJ)J
      // 130: invokestatic java/lang/Thread.sleep (J)V
      // 133: aload 1
      // 134: ifnonnull 281
      // 137: goto 141
      // 13a: astore 5
      // 13c: aload 5
      // 13e: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 141: aload 0
      // 142: ldc2_w 525647601846067930
      // 145: astore 26
      // 147: ldc2_w 525647601846067930
      // 14a: aload 26
      // 14c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 14f: ldc2_w 609415999077358020
      // 152: astore 28
      // 154: ldc2_w 609415999077358020
      // 157: aload 28
      // 159: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 15c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 15f: ldc2_w 529735557312904033
      // 162: astore 31
      // 164: astore 30
      // 166: ldc2_w 529735557312904033
      // 169: aload 30
      // 16b: aload 31
      // 16d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 170: checkcast java/lang/Boolean
      // 173: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 176: goto 17d
      // 179: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 17c: athrow
      // 17d: aload 1
      // 17e: ifnonnull 1be
      // 181: ifeq 258
      // 184: goto 18b
      // 187: invokestatic com/finalshell/task/QA.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 18a: athrow
      // 18b: aload 0
      // 18c: ldc2_w 525647601846067930
      // 18f: astore 32
      // 191: ldc2_w 525647601846067930
      // 194: aload 32
      // 196: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 199: ldc2_w 434677565278618930
      // 19c: astore 34
      // 19e: ldc2_w 434677565278618930
      // 1a1: aload 34
      // 1a3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1a6: checkcast com/finalshell/ui/dialog/UpdateDialog
      // 1a9: aload 1
      // 1aa: ifnonnull 240
      // 1ad: goto 1b4
      // 1b0: invokestatic com/finalshell/task/QA.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1b3: athrow
      // 1b4: invokevirtual com/finalshell/ui/dialog/UpdateDialog.isVisible ()Z
      // 1b7: goto 1be
      // 1ba: invokestatic com/finalshell/task/QA.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1bd: athrow
      // 1be: ifne 258
      // 1c1: aload 0
      // 1c2: ldc2_w 525647601846067930
      // 1c5: astore 36
      // 1c7: ldc2_w 525647601846067930
      // 1ca: aload 36
      // 1cc: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1cf: ldc2_w 434677565278618930
      // 1d2: astore 38
      // 1d4: ldc2_w 434677565278618930
      // 1d7: aload 38
      // 1d9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1dc: checkcast com/finalshell/ui/dialog/UpdateDialog
      // 1df: aconst_null
      // 1e0: invokevirtual com/finalshell/ui/dialog/UpdateDialog.setLocationRelativeTo (Ljava/awt/Component;)V
      // 1e3: aload 0
      // 1e4: ldc2_w 525647601846067930
      // 1e7: astore 40
      // 1e9: ldc2_w 525647601846067930
      // 1ec: aload 40
      // 1ee: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1f1: ldc2_w 434677565278618930
      // 1f4: astore 42
      // 1f6: ldc2_w 434677565278618930
      // 1f9: aload 42
      // 1fb: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1fe: bipush 1
      // 1ff: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 202: ldc2_w 351503280654568600
      // 205: astore 45
      // 207: astore 44
      // 209: ldc2_w 351503280654568600
      // 20c: aload 44
      // 20e: aload 45
      // 210: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 213: pop
      // 214: goto 21b
      // 217: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 21a: athrow
      // 21b: aload 0
      // 21c: ldc2_w 525647601846067930
      // 21f: astore 46
      // 221: ldc2_w 525647601846067930
      // 224: aload 46
      // 226: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 229: ldc2_w 434677565278618930
      // 22c: astore 48
      // 22e: ldc2_w 434677565278618930
      // 231: aload 48
      // 233: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 236: checkcast com/finalshell/ui/dialog/UpdateDialog
      // 239: goto 240
      // 23c: invokestatic com/finalshell/task/QA.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 23f: athrow
      // 240: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 243: ldc2_w 214213921318960935
      // 246: astore 50
      // 248: ldc2_w 214213921318960935
      // 24b: aload 50
      // 24d: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 250: pop
      // 251: goto 258
      // 254: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 257: athrow
      // 258: iinc 4 1
      // 25b: aload 1
      // 25c: ifnull 11e
      // 25f: aload 0
      // 260: ldc2_w 525647601846067930
      // 263: astore 52
      // 265: ldc2_w 525647601846067930
      // 268: aload 52
      // 26a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 26d: checkcast com/finalshell/core/UR3
      // 270: invokestatic java/lang/System.currentTimeMillis ()J
      // 273: dup2_x1
      // 274: pop2
      // 275: ldc2_w 530790365418171386
      // 278: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 27b: swap
      // 27c: dup2_x2
      // 27d: pop2
      // 27e: invokevirtual java/lang/reflect/Field.setLong (Ljava/lang/Object;J)V
      // 281: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 28527) & 32767;
      if (c[var3] == null) {
         c[var3] = b[var3] ^ var1;
      }

      return c[var3];
   }

   public static void __vfClinit__() {
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
}





