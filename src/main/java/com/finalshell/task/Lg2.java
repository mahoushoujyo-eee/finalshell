package com.finalshell.task;

import com.finalshell.core.Tb4;

public class Lg2 implements Runnable {
   final Tb4 r;
   public static long[] a;
   public static Integer[] b;

   Lg2(Tb4 var1) {
      this.r = var1;
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
      // 000: invokestatic com/finalshell/ui/model/BS.t ()I
      // 003: sipush 29858
      // 006: ldc2_w 6711013880233515367
      // 009: invokestatic com/finalshell/task/Lg2.a (IJ)I
      // 00c: newarray 8
      // 00e: astore 2
      // 00f: istore 1
      // 010: bipush 0
      // 011: istore 3
      // 012: aload 0
      // 013: ldc2_w 313609180921589822
      // 016: astore 12
      // 018: ldc2_w 313609180921589822
      // 01b: aload 12
      // 01d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 020: ldc2_w 441418071335236039
      // 023: astore 14
      // 025: ldc2_w 441418071335236039
      // 028: aload 14
      // 02a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 02d: checkcast java/io/InputStream
      // 030: aload 2
      // 031: invokevirtual java/io/InputStream.read ([B)I
      // 034: dup
      // 035: istore 3
      // 036: ifle 0f5
      // 039: sipush 15201
      // 03c: ldc2_w 1465714969097180837
      // 03f: invokestatic com/finalshell/task/Lg2.a (IJ)I
      // 042: iload 3
      // 043: imul
      // 044: aload 0
      // 045: ldc2_w 313609180921589822
      // 048: astore 16
      // 04a: ldc2_w 313609180921589822
      // 04d: aload 16
      // 04f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 052: ldc2_w 375641075699496300
      // 055: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 058: swap
      // 059: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 05c: idiv
      // 05d: i2l
      // 05e: lstore 4
      // 060: invokestatic java/lang/System.currentTimeMillis ()J
      // 063: lstore 6
      // 065: aload 0
      // 066: ldc2_w 313609180921589822
      // 069: astore 18
      // 06b: ldc2_w 313609180921589822
      // 06e: aload 18
      // 070: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 073: ldc2_w 340350589392341061
      // 076: astore 20
      // 078: ldc2_w 340350589392341061
      // 07b: aload 20
      // 07d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 080: checkcast java/io/OutputStream
      // 083: aload 2
      // 084: bipush 0
      // 085: iload 3
      // 086: invokevirtual java/io/OutputStream.write ([BII)V
      // 089: invokestatic java/lang/System.currentTimeMillis ()J
      // 08c: lload 6
      // 08e: lsub
      // 08f: lstore 8
      // 091: aload 0
      // 092: ldc2_w 313609180921589822
      // 095: astore 22
      // 097: ldc2_w 313609180921589822
      // 09a: aload 22
      // 09c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 09f: checkcast com/finalshell/core/Tb4
      // 0a2: iload 1
      // 0a3: ifne 106
      // 0a6: ldc2_w 375641075699496300
      // 0a9: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0ac: swap
      // 0ad: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0b0: iload 1
      // 0b1: ifne 0dc
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/task/Lg2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0ba: athrow
      // 0bb: ifle 0f1
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/task/Lg2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0c4: athrow
      // 0c5: lload 8
      // 0c7: lload 4
      // 0c9: iload 1
      // 0ca: ifne 0e3
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/task/Lg2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0d3: athrow
      // 0d4: lcmp
      // 0d5: goto 0dc
      // 0d8: invokestatic com/finalshell/task/Lg2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0db: athrow
      // 0dc: ifge 0f1
      // 0df: lload 4
      // 0e1: lload 8
      // 0e3: lsub
      // 0e4: invokestatic java/lang/Thread.sleep (J)V
      // 0e7: goto 0f1
      // 0ea: astore 10
      // 0ec: aload 10
      // 0ee: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 0f1: iload 1
      // 0f2: ifeq 012
      // 0f5: aload 0
      // 0f6: ldc2_w 313609180921589822
      // 0f9: astore 24
      // 0fb: ldc2_w 313609180921589822
      // 0fe: aload 24
      // 100: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 103: checkcast com/finalshell/core/Tb4
      // 106: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 109: ldc2_w 607929959020247755
      // 10c: astore 27
      // 10e: astore 26
      // 110: ldc2_w 607929959020247755
      // 113: aload 26
      // 115: aload 27
      // 117: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 11a: pop
      // 11b: goto 122
      // 11e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 121: athrow
      // 122: goto 183
      // 125: astore 4
      // 127: aload 0
      // 128: ldc2_w 313609180921589822
      // 12b: astore 28
      // 12d: ldc2_w 313609180921589822
      // 130: aload 28
      // 132: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 135: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 138: ldc2_w 607929959020247755
      // 13b: astore 31
      // 13d: astore 30
      // 13f: ldc2_w 607929959020247755
      // 142: aload 30
      // 144: aload 31
      // 146: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 149: pop
      // 14a: goto 151
      // 14d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 150: athrow
      // 151: goto 183
      // 154: astore 11
      // 156: aload 0
      // 157: ldc2_w 313609180921589822
      // 15a: astore 32
      // 15c: ldc2_w 313609180921589822
      // 15f: aload 32
      // 161: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 164: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 167: ldc2_w 607929959020247755
      // 16a: astore 35
      // 16c: astore 34
      // 16e: ldc2_w 607929959020247755
      // 171: aload 34
      // 173: aload 35
      // 175: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 178: pop
      // 179: goto 180
      // 17c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 17f: athrow
      // 180: aload 11
      // 182: athrow
      // 183: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11717;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 7582271357641438273L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ÀÍB\u008eÀßí&\u00840\u000fa%Ô¡\f";
      int var5 = "ÀÍB\u008eÀßí&\u00840\u000fa%Ô¡\f".length();
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
}





