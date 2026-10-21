package com.finalshell.task;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

import com.finalshell.core.M6;

public class Gm2 implements Runnable {
   public final boolean v;
   public final M6 J;
   public static long a;

   public Gm2(M6 var1, boolean var2) {
      this.J = var1;
      this.v = var2;
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
      // 00: invokestatic com/finalshell/ui/panel/F8.y ()[Ljava/lang/String;
      // 03: invokestatic java/lang/System.currentTimeMillis ()J
      // 06: lstore 2
      // 07: astore 1
      // 08: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0b: ldc2_w 270389152141252877
      // 0e: astore 5
      // 10: ldc2_w 270389152141252877
      // 13: aload 5
      // 15: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 18: goto 1f
      // 1b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 22: ldc2_w 372117228997658439
      // 25: astore 8
      // 27: astore 7
      // 29: ldc2_w 372117228997658439
      // 2c: aload 7
      // 2e: aload 8
      // 30: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 33: checkcast java/lang/Boolean
      // 36: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 39: goto 40
      // 3c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3f: athrow
      // 40: ifeq 97
      // 43: aload 0
      // 44: ldc2_w 311559939483638983
      // 47: astore 9
      // 49: ldc2_w 311559939483638983
      // 4c: aload 9
      // 4e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 51: ldc2_w 362106988670708490
      // 54: astore 11
      // 56: ldc2_w 362106988670708490
      // 59: aload 11
      // 5b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 5e: checkcast com/finalshell/ui/frame/U
      // 61: aload 1
      // 62: ifnonnull d4
      // 65: goto 6c
      // 68: invokestatic com/finalshell/task/Gm2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 6b: athrow
      // 6c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 6f: ldc2_w 404378438847958764
      // 72: astore 14
      // 74: astore 13
      // 76: ldc2_w 404378438847958764
      // 79: aload 13
      // 7b: aload 14
      // 7d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 80: checkcast java/lang/Boolean
      // 83: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 86: goto 8d
      // 89: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: ifne ab
      // 90: goto 97
      // 93: invokestatic com/finalshell/task/Gm2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 96: athrow
      // 97: getstatic com/finalshell/task/Gm2.a J
      // 9a: invokestatic java/lang/Thread.sleep (J)V
      // 9d: goto 08
      // a0: astore 4
      // a2: aload 4
      // a4: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // a7: aload 1
      // a8: ifnull 08
      // ab: new com/finalshell/task/YW
      // ae: dup
      // af: aload 0
      // b0: invokespecial com/finalshell/task/YW.<init> (Lcom/finalshell/task/Gm2;)V
      // b3: invokestatic javax/swing/SwingUtilities.invokeLater (Ljava/lang/Runnable;)V
      // b6: aload 0
      // b7: ldc2_w 311559939483638983
      // ba: astore 15
      // bc: ldc2_w 311559939483638983
      // bf: aload 15
      // c1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // c4: ldc2_w 362106988670708490
      // c7: astore 17
      // c9: ldc2_w 362106988670708490
      // cc: aload 17
      // ce: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // d1: checkcast com/finalshell/ui/frame/U
      // d4: aload 0
      // d5: ldc2_w 143803085661710313
      // d8: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // db: swap
      // dc: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // df: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // e2: ldc2_w 137802873496160902
      // e5: astore 20
      // e7: astore 19
      // e9: ldc2_w 137802873496160902
      // ec: aload 19
      // ee: aload 20
      // f0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // f3: pop
      // f4: goto fb
      // f7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // fa: athrow
      // fb: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 523192404160442864L;
      long var10002 = 523192404160442866L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





