package com.finalshell.task;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

public class V8 implements Runnable {
   public final BT3 s;
   public static long a;

   public V8(BT3 var1) {
      this.s = var1;
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
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 1
      // 004: aload 0
      // 005: ldc2_w 298303209040243949
      // 008: astore 3
      // 009: ldc2_w 298303209040243949
      // 00c: aload 3
      // 00d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 010: ldc2_w 500337766327596840
      // 013: astore 5
      // 015: ldc2_w 500337766327596840
      // 018: aload 5
      // 01a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 01d: ldc2_w 417188137775278471
      // 020: astore 7
      // 022: ldc2_w 417188137775278471
      // 025: aload 7
      // 027: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 02a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 02d: ldc2_w 582109538642750681
      // 030: astore 10
      // 032: astore 9
      // 034: ldc2_w 582109538642750681
      // 037: aload 9
      // 039: aload 10
      // 03b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 03e: checkcast java/lang/Boolean
      // 041: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 044: goto 04b
      // 047: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 04a: athrow
      // 04b: ifne 064
      // 04e: getstatic com/finalshell/task/V8.a J
      // 051: invokestatic java/lang/Thread.sleep (J)V
      // 054: aload 1
      // 055: ifnull 11f
      // 058: goto 004
      // 05b: astore 2
      // 05c: aload 2
      // 05d: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 060: aload 1
      // 061: ifnonnull 004
      // 064: aload 0
      // 065: ldc2_w 298303209040243949
      // 068: astore 11
      // 06a: ldc2_w 298303209040243949
      // 06d: aload 11
      // 06f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 072: ldc2_w 500337766327596840
      // 075: astore 13
      // 077: ldc2_w 500337766327596840
      // 07a: aload 13
      // 07c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 07f: new com/finalshell/ui/dialog/KQ
      // 082: dup
      // 083: ldc2_w 245459929255404945
      // 086: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 089: aconst_null
      // 08a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 08d: checkcast javax/swing/JDialog
      // 090: invokespecial com/finalshell/ui/dialog/KQ.<init> (Ljava/awt/Window;)V
      // 093: ldc2_w 162368686609180120
      // 096: astore 16
      // 098: astore 15
      // 09a: ldc2_w 162368686609180120
      // 09d: aload 15
      // 09f: aload 16
      // 0a1: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0a4: aload 0
      // 0a5: ldc2_w 298303209040243949
      // 0a8: astore 17
      // 0aa: ldc2_w 298303209040243949
      // 0ad: aload 17
      // 0af: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0b2: ldc2_w 500337766327596840
      // 0b5: astore 19
      // 0b7: ldc2_w 500337766327596840
      // 0ba: aload 19
      // 0bc: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0bf: ldc2_w 162368686609180120
      // 0c2: astore 21
      // 0c4: ldc2_w 162368686609180120
      // 0c7: aload 21
      // 0c9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0cc: ldc2_w 199832172921665052
      // 0cf: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0d2: aconst_null
      // 0d3: dup2_x1
      // 0d4: pop2
      // 0d5: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0d8: aload 0
      // 0d9: ldc2_w 298303209040243949
      // 0dc: astore 23
      // 0de: ldc2_w 298303209040243949
      // 0e1: aload 23
      // 0e3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0e6: ldc2_w 500337766327596840
      // 0e9: astore 25
      // 0eb: ldc2_w 500337766327596840
      // 0ee: aload 25
      // 0f0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f3: aload 0
      // 0f4: ldc2_w 298303209040243949
      // 0f7: astore 27
      // 0f9: ldc2_w 298303209040243949
      // 0fc: aload 27
      // 0fe: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 101: ldc2_w 500337766327596840
      // 104: astore 29
      // 106: ldc2_w 500337766327596840
      // 109: aload 29
      // 10b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 10e: ldc2_w 340664143127479268
      // 111: astore 32
      // 113: astore 31
      // 115: ldc2_w 340664143127479268
      // 118: aload 31
      // 11a: aload 32
      // 11c: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 11f: aload 0
      // 120: ldc2_w 298303209040243949
      // 123: astore 33
      // 125: ldc2_w 298303209040243949
      // 128: aload 33
      // 12a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 12d: ldc2_w 500337766327596840
      // 130: astore 35
      // 132: ldc2_w 500337766327596840
      // 135: aload 35
      // 137: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 13a: checkcast com/finalshell/core/YT3_2
      // 13d: aload 1
      // 13e: ifnull 223
      // 141: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 144: ldc2_w 385643251219565463
      // 147: astore 37
      // 149: ldc2_w 385643251219565463
      // 14c: aload 37
      // 14e: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 151: goto 158
      // 154: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 157: athrow
      // 158: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 15b: ldc2_w 204000105621842013
      // 15e: astore 40
      // 160: astore 39
      // 162: ldc2_w 204000105621842013
      // 165: aload 39
      // 167: aload 40
      // 169: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 16c: goto 173
      // 16f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 172: athrow
      // 173: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 176: ldc2_w 330094358428833085
      // 179: astore 41
      // 17b: ldc2_w 330094358428833085
      // 17e: aload 41
      // 180: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 183: checkcast java/lang/Boolean
      // 186: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 189: goto 190
      // 18c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 18f: athrow
      // 190: ifne 23f
      // 193: goto 19a
      // 196: invokestatic com/finalshell/task/V8.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 199: athrow
      // 19a: new com/finalshell/core/Op2
      // 19d: dup
      // 19e: invokespecial com/finalshell/core/Op2.<init> ()V
      // 1a1: ldc2_w 134126643734273122
      // 1a4: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1a7: aconst_null
      // 1a8: dup2_x1
      // 1a9: pop2
      // 1aa: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 1ad: aload 0
      // 1ae: ldc2_w 298303209040243949
      // 1b1: astore 43
      // 1b3: ldc2_w 298303209040243949
      // 1b6: aload 43
      // 1b8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1bb: ldc2_w 500337766327596840
      // 1be: astore 45
      // 1c0: ldc2_w 500337766327596840
      // 1c3: aload 45
      // 1c5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1c8: ldc2_w 340664143127479268
      // 1cb: astore 47
      // 1cd: ldc2_w 340664143127479268
      // 1d0: aload 47
      // 1d2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1d5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1d8: ldc2_w 348231076130900481
      // 1db: astore 50
      // 1dd: astore 49
      // 1df: ldc2_w 348231076130900481
      // 1e2: aload 49
      // 1e4: aload 50
      // 1e6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e9: goto 1f0
      // 1ec: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ef: athrow
      // 1f0: pop
      // 1f1: aload 0
      // 1f2: ldc2_w 298303209040243949
      // 1f5: astore 51
      // 1f7: ldc2_w 298303209040243949
      // 1fa: aload 51
      // 1fc: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1ff: ldc2_w 500337766327596840
      // 202: astore 53
      // 204: ldc2_w 500337766327596840
      // 207: aload 53
      // 209: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 20c: ldc2_w 340664143127479268
      // 20f: astore 55
      // 211: ldc2_w 340664143127479268
      // 214: aload 55
      // 216: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 219: checkcast com/finalshell/core/CS3
      // 21c: goto 223
      // 21f: invokestatic com/finalshell/task/V8.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 222: athrow
      // 223: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 226: ldc2_w 143676735372710041
      // 229: astore 58
      // 22b: astore 57
      // 22d: ldc2_w 143676735372710041
      // 230: aload 57
      // 232: aload 58
      // 234: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 237: goto 23e
      // 23a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 23d: athrow
      // 23e: pop
      // 23f: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 7014986197023391717L;
      long var10002 = 7014986197023391727L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





