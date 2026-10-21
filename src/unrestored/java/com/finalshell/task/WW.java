package com.finalshell.task;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

import com.finalshell.core.UM3;
import com.finalshell.ui.frame.UpdateFrame;

public class WW implements Runnable {
   public final UpdateFrame x;
   public final UM3 F;
   public static long a;
   public static long[] b;
   public static Long[] c;

   public WW(UM3 var1, UpdateFrame var2) {
      this.F = var1;
      this.x = var2;
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
      // 000: invokestatic com/finalshell/ui/frame/UpdateFrame.q ()[Ljava/lang/String;
      // 003: sipush 22416
      // 006: ldc2_w 2412097208438520462
      // 009: invokestatic com/finalshell/task/WW.a (IJ)J
      // 00c: lstore 2
      // 00d: aload 0
      // 00e: ldc2_w 535110847058590972
      // 011: astore 8
      // 013: ldc2_w 535110847058590972
      // 016: aload 8
      // 018: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 01b: new com/finalshell/core/TL3
      // 01e: dup
      // 01f: invokespecial com/finalshell/core/TL3.<init> ()V
      // 022: ldc2_w 288433188176852978
      // 025: astore 11
      // 027: astore 10
      // 029: ldc2_w 288433188176852978
      // 02c: aload 10
      // 02e: aload 11
      // 030: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 033: astore 1
      // 034: aload 0
      // 035: ldc2_w 535110847058590972
      // 038: astore 12
      // 03a: ldc2_w 535110847058590972
      // 03d: aload 12
      // 03f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 042: ldc2_w 288433188176852978
      // 045: astore 14
      // 047: ldc2_w 288433188176852978
      // 04a: aload 14
      // 04c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 04f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 052: ldc2_w 281153446161300471
      // 055: astore 17
      // 057: astore 16
      // 059: ldc2_w 281153446161300471
      // 05c: aload 16
      // 05e: aload 17
      // 060: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 063: checkcast org/apache/hc/client5/http/classic/HttpClient
      // 066: goto 06d
      // 069: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 06c: athrow
      // 06d: astore 4
      // 06f: aload 0
      // 070: ldc2_w 535110847058590972
      // 073: astore 18
      // 075: ldc2_w 535110847058590972
      // 078: aload 18
      // 07a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 07d: ldc2_w 288433188176852978
      // 080: astore 20
      // 082: ldc2_w 288433188176852978
      // 085: aload 20
      // 087: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 08a: aload 4
      // 08c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 08f: ldc2_w 151476884239499892
      // 092: astore 23
      // 094: astore 22
      // 096: ldc2_w 151476884239499892
      // 099: aload 22
      // 09b: aload 23
      // 09d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a0: pop
      // 0a1: goto 0a8
      // 0a4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a7: athrow
      // 0a8: invokestatic java/lang/System.currentTimeMillis ()J
      // 0ab: aload 0
      // 0ac: ldc2_w 535110847058590972
      // 0af: astore 24
      // 0b1: ldc2_w 535110847058590972
      // 0b4: aload 24
      // 0b6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0b9: ldc2_w 540062281616474130
      // 0bc: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0bf: swap
      // 0c0: invokevirtual java/lang/reflect/Field.getLong (Ljava/lang/Object;)J
      // 0c3: lsub
      // 0c4: lconst_1
      // 0c5: lload 2
      // 0c6: lmul
      // 0c7: lcmp
      // 0c8: ifle 2eb
      // 0cb: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0ce: ldc2_w 270389152141252877
      // 0d1: astore 26
      // 0d3: ldc2_w 270389152141252877
      // 0d6: aload 26
      // 0d8: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0db: goto 0e2
      // 0de: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e1: athrow
      // 0e2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0e5: ldc2_w 479882039388176646
      // 0e8: astore 29
      // 0ea: astore 28
      // 0ec: ldc2_w 479882039388176646
      // 0ef: aload 28
      // 0f1: aload 29
      // 0f3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0f6: checkcast com/finalshell/core/Yy4_2
      // 0f9: goto 100
      // 0fc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: astore 5
      // 102: aload 5
      // 104: aload 0
      // 105: ldc2_w 535110847058590972
      // 108: astore 30
      // 10a: ldc2_w 535110847058590972
      // 10d: aload 30
      // 10f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 112: ldc2_w 288433188176852978
      // 115: astore 32
      // 117: ldc2_w 288433188176852978
      // 11a: aload 32
      // 11c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 11f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 122: ldc2_w 511889062229052250
      // 125: astore 35
      // 127: astore 34
      // 129: ldc2_w 511889062229052250
      // 12c: aload 34
      // 12e: aload 35
      // 130: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 133: pop
      // 134: goto 13b
      // 137: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 13a: athrow
      // 13b: aload 5
      // 13d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 140: ldc2_w 187198425743999659
      // 143: astore 37
      // 145: astore 36
      // 147: ldc2_w 187198425743999659
      // 14a: aload 36
      // 14c: aload 37
      // 14e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 151: checkcast java/lang/Boolean
      // 154: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 157: goto 15e
      // 15a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 15d: athrow
      // 15e: aload 1
      // 15f: ifnonnull 196
      // 162: ifne 2cc
      // 165: goto 16c
      // 168: invokestatic com/finalshell/task/WW.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 16b: athrow
      // 16c: aload 5
      // 16e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 171: ldc2_w 547240307566989756
      // 174: astore 39
      // 176: astore 38
      // 178: ldc2_w 547240307566989756
      // 17b: aload 38
      // 17d: aload 39
      // 17f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 182: checkcast java/lang/Boolean
      // 185: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 188: goto 18f
      // 18b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 18e: athrow
      // 18f: goto 196
      // 192: invokestatic com/finalshell/task/WW.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 195: athrow
      // 196: aload 1
      // 197: ifnonnull 1d6
      // 19a: ifne 2cc
      // 19d: goto 1a4
      // 1a0: invokestatic com/finalshell/task/WW.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1a3: athrow
      // 1a4: aload 0
      // 1a5: ldc2_w 451899109082434119
      // 1a8: astore 40
      // 1aa: ldc2_w 451899109082434119
      // 1ad: aload 40
      // 1af: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1b2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1b5: ldc2_w 558988037493500446
      // 1b8: astore 43
      // 1ba: astore 42
      // 1bc: ldc2_w 558988037493500446
      // 1bf: aload 42
      // 1c1: aload 43
      // 1c3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1c6: pop
      // 1c7: goto 1ce
      // 1ca: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1cd: athrow
      // 1ce: bipush 0
      // 1cf: goto 1d6
      // 1d2: invokestatic com/finalshell/task/WW.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1d5: athrow
      // 1d6: istore 6
      // 1d8: iload 6
      // 1da: getstatic com/finalshell/task/WW.a J
      // 1dd: l2i
      // 1de: if_icmpge 2cc
      // 1e1: sipush 13147
      // 1e4: ldc2_w 6942859828494605892
      // 1e7: invokestatic com/finalshell/task/WW.a (IJ)J
      // 1ea: invokestatic java/lang/Thread.sleep (J)V
      // 1ed: aload 1
      // 1ee: ifnonnull 2eb
      // 1f1: goto 1fb
      // 1f4: astore 7
      // 1f6: aload 7
      // 1f8: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 1fb: aload 5
      // 1fd: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 200: ldc2_w 547240307566989756
      // 203: astore 45
      // 205: astore 44
      // 207: ldc2_w 547240307566989756
      // 20a: aload 44
      // 20c: aload 45
      // 20e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 211: checkcast java/lang/Boolean
      // 214: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 217: goto 21e
      // 21a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 21d: athrow
      // 21e: aload 1
      // 21f: ifnonnull 252
      // 222: ifeq 2c5
      // 225: goto 22c
      // 228: invokestatic com/finalshell/task/WW.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 22b: athrow
      // 22c: aload 0
      // 22d: ldc2_w 451899109082434119
      // 230: astore 46
      // 232: ldc2_w 451899109082434119
      // 235: aload 46
      // 237: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 23a: checkcast com/finalshell/ui/frame/UpdateFrame
      // 23d: aload 1
      // 23e: ifnonnull 2ad
      // 241: goto 248
      // 244: invokestatic com/finalshell/task/WW.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 247: athrow
      // 248: invokevirtual com/finalshell/ui/frame/UpdateFrame.isVisible ()Z
      // 24b: goto 252
      // 24e: invokestatic com/finalshell/task/WW.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 251: athrow
      // 252: ifne 2c5
      // 255: aload 0
      // 256: ldc2_w 451899109082434119
      // 259: astore 48
      // 25b: ldc2_w 451899109082434119
      // 25e: aload 48
      // 260: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 263: checkcast com/finalshell/ui/frame/UpdateFrame
      // 266: aconst_null
      // 267: invokevirtual com/finalshell/ui/frame/UpdateFrame.setLocationRelativeTo (Ljava/awt/Component;)V
      // 26a: aload 0
      // 26b: ldc2_w 451899109082434119
      // 26e: astore 50
      // 270: ldc2_w 451899109082434119
      // 273: aload 50
      // 275: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 278: bipush 1
      // 279: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 27c: ldc2_w 610529704363663802
      // 27f: astore 53
      // 281: astore 52
      // 283: ldc2_w 610529704363663802
      // 286: aload 52
      // 288: aload 53
      // 28a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 28d: pop
      // 28e: goto 295
      // 291: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 294: athrow
      // 295: aload 0
      // 296: ldc2_w 451899109082434119
      // 299: astore 54
      // 29b: ldc2_w 451899109082434119
      // 29e: aload 54
      // 2a0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2a3: checkcast com/finalshell/ui/frame/UpdateFrame
      // 2a6: goto 2ad
      // 2a9: invokestatic com/finalshell/task/WW.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 2ac: athrow
      // 2ad: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2b0: ldc2_w 214213921318960935
      // 2b3: astore 56
      // 2b5: ldc2_w 214213921318960935
      // 2b8: aload 56
      // 2ba: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2bd: pop
      // 2be: goto 2c5
      // 2c1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2c4: athrow
      // 2c5: iinc 6 1
      // 2c8: aload 1
      // 2c9: ifnull 1d8
      // 2cc: aload 0
      // 2cd: ldc2_w 535110847058590972
      // 2d0: astore 58
      // 2d2: ldc2_w 535110847058590972
      // 2d5: aload 58
      // 2d7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2da: invokestatic java/lang/System.currentTimeMillis ()J
      // 2dd: dup2_x1
      // 2de: pop2
      // 2df: ldc2_w 540062281616474130
      // 2e2: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2e5: swap
      // 2e6: dup2_x2
      // 2e7: pop2
      // 2e8: invokevirtual java/lang/reflect/Field.setLong (Ljava/lang/Object;J)V
      // 2eb: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 11550) & 32767;
      if (c[var3] == null) {
         c[var3] = b[var3] ^ var1;
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var8 = 117857613449041625L;
      long var10002 = -896967605826054421L ^ var8;
      int var10001 = -1;
      a = var10002;
      long var0 = 1382739955694580007L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "2I\u0007\b~|\u0017©si\u0084\u0093I*/\u0007";
      int var5 = "2I\u0007\b~|\u0017©si\u0084\u0093I*/\u0007".length();
      byte var2 = 0;

      do {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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





