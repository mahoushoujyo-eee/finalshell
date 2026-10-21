package com.finalshell.task;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

import com.finalshell.core.SpeedTestService;

public class Ur4 implements Runnable {
   public final SpeedTestService m;
   public static long a;

   public Ur4(SpeedTestService var1) {
      this.m = var1;
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
      // 000: invokestatic com/finalshell/ui/frame/SpeedTestFrame.K ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 1
      // 004: aload 0
      // 005: ldc2_w 281572689581770824
      // 008: astore 3
      // 009: ldc2_w 281572689581770824
      // 00c: aload 3
      // 00d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 010: ldc2_w 588222327077575093
      // 013: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 016: swap
      // 017: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 01a: ifeq 12d
      // 01d: getstatic com/finalshell/task/Ur4.a J
      // 020: invokestatic java/lang/Thread.sleep (J)V
      // 023: goto 02b
      // 026: astore 2
      // 027: aload 2
      // 028: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 02b: aload 0
      // 02c: ldc2_w 281572689581770824
      // 02f: astore 5
      // 031: ldc2_w 281572689581770824
      // 034: aload 5
      // 036: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 039: checkcast com/finalshell/core/LF3_2
      // 03c: aload 1
      // 03d: ifnull 0ca
      // 040: ldc2_w 206342559758395463
      // 043: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 046: swap
      // 047: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 04a: ifeq 0b2
      // 04d: goto 054
      // 050: invokestatic com/finalshell/task/Ur4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 053: athrow
      // 054: aload 0
      // 055: ldc2_w 281572689581770824
      // 058: astore 7
      // 05a: ldc2_w 281572689581770824
      // 05d: aload 7
      // 05f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 062: ldc2_w 229111671699256395
      // 065: astore 9
      // 067: ldc2_w 229111671699256395
      // 06a: aload 9
      // 06c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 06f: checkcast com/finalshell/core/KV
      // 072: aload 0
      // 073: ldc2_w 281572689581770824
      // 076: astore 11
      // 078: ldc2_w 281572689581770824
      // 07b: aload 11
      // 07d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 080: ldc2_w 279787951265204347
      // 083: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 086: swap
      // 087: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 08a: i2l
      // 08b: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 08e: ldc2_w 265805081255352154
      // 091: astore 14
      // 093: astore 13
      // 095: ldc2_w 265805081255352154
      // 098: aload 13
      // 09a: aload 14
      // 09c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 09f: pop
      // 0a0: goto 0a7
      // 0a3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: aload 1
      // 0a8: ifnonnull 10f
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/task/Ur4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: ldc2_w 281572689581770824
      // 0b6: astore 15
      // 0b8: ldc2_w 281572689581770824
      // 0bb: aload 15
      // 0bd: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c0: checkcast com/finalshell/core/LF3_2
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/task/Ur4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0c9: athrow
      // 0ca: ldc2_w 229111671699256395
      // 0cd: astore 17
      // 0cf: ldc2_w 229111671699256395
      // 0d2: aload 17
      // 0d4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d7: checkcast com/finalshell/core/KV
      // 0da: aload 0
      // 0db: ldc2_w 281572689581770824
      // 0de: astore 19
      // 0e0: ldc2_w 281572689581770824
      // 0e3: aload 19
      // 0e5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0e8: ldc2_w 279787951265204347
      // 0eb: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0ee: swap
      // 0ef: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0f2: i2l
      // 0f3: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 0f6: ldc2_w 554414886210283126
      // 0f9: astore 22
      // 0fb: astore 21
      // 0fd: ldc2_w 554414886210283126
      // 100: aload 21
      // 102: aload 22
      // 104: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 107: pop
      // 108: goto 10f
      // 10b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 10e: athrow
      // 10f: aload 0
      // 110: ldc2_w 281572689581770824
      // 113: astore 23
      // 115: ldc2_w 281572689581770824
      // 118: aload 23
      // 11a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 11d: bipush 0
      // 11e: ldc2_w 279787951265204347
      // 121: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 124: dup_x2
      // 125: pop
      // 126: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 129: aload 1
      // 12a: ifnonnull 004
      // 12d: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 7196922524210270402L;
      long var10002 = 7196922524210273735L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





