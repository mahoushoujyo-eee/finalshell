package com.finalshell.task;

import com.finalshell.ui.panel.Address;

public class DF3 implements Runnable {
   public final Address h;

   public DF3(Address var1) {
      this.h = var1;
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
      // 000: invokestatic com/finalshell/ui/panel/Address.g ()Z
      // 003: istore 1
      // 004: aload 0
      // 005: ldc2_w 219869986007226463
      // 008: astore 4
      // 00a: ldc2_w 219869986007226463
      // 00d: aload 4
      // 00f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 012: ldc2_w 460354311900945697
      // 015: astore 6
      // 017: ldc2_w 460354311900945697
      // 01a: aload 6
      // 01c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 01f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 022: ldc2_w 135220879492188512
      // 025: astore 9
      // 027: astore 8
      // 029: ldc2_w 135220879492188512
      // 02c: aload 8
      // 02e: aload 9
      // 030: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 033: pop
      // 034: goto 03b
      // 037: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 03a: athrow
      // 03b: aload 0
      // 03c: ldc2_w 219869986007226463
      // 03f: astore 10
      // 041: ldc2_w 219869986007226463
      // 044: aload 10
      // 046: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 049: checkcast com/finalshell/ui/panel/Address
      // 04c: iload 1
      // 04d: ifne 0f2
      // 050: ldc2_w 188383599609663881
      // 053: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 056: swap
      // 057: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 05a: ifeq 08f
      // 05d: goto 064
      // 060: invokestatic com/finalshell/task/DF3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: aload 0
      // 065: ldc2_w 219869986007226463
      // 068: astore 12
      // 06a: ldc2_w 219869986007226463
      // 06d: aload 12
      // 06f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 072: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 075: ldc2_w 270852994370383093
      // 078: astore 15
      // 07a: astore 14
      // 07c: ldc2_w 270852994370383093
      // 07f: aload 14
      // 081: aload 15
      // 083: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 086: pop
      // 087: goto 08e
      // 08a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08d: athrow
      // 08e: return
      // 08f: aload 0
      // 090: ldc2_w 219869986007226463
      // 093: astore 16
      // 095: ldc2_w 219869986007226463
      // 098: aload 16
      // 09a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 09d: ldc2_w 627973027287447539
      // 0a0: astore 18
      // 0a2: ldc2_w 627973027287447539
      // 0a5: aload 18
      // 0a7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0aa: aload 0
      // 0ab: ldc2_w 219869986007226463
      // 0ae: astore 20
      // 0b0: ldc2_w 219869986007226463
      // 0b3: aload 20
      // 0b5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0b8: ldc2_w 460354311900945697
      // 0bb: astore 22
      // 0bd: ldc2_w 460354311900945697
      // 0c0: aload 22
      // 0c2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c5: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0c8: ldc2_w 507553163126236819
      // 0cb: astore 25
      // 0cd: astore 24
      // 0cf: ldc2_w 507553163126236819
      // 0d2: aload 24
      // 0d4: aload 25
      // 0d6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0d9: pop
      // 0da: goto 0e1
      // 0dd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: ldc2_w 219869986007226463
      // 0e5: astore 26
      // 0e7: ldc2_w 219869986007226463
      // 0ea: aload 26
      // 0ec: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0ef: checkcast com/finalshell/ui/panel/Address
      // 0f2: ldc2_w 460354311900945697
      // 0f5: astore 28
      // 0f7: ldc2_w 460354311900945697
      // 0fa: aload 28
      // 0fc: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0ff: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 102: ldc2_w 207264048673842448
      // 105: astore 31
      // 107: astore 30
      // 109: ldc2_w 207264048673842448
      // 10c: aload 30
      // 10e: aload 31
      // 110: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 113: checkcast java/lang/String
      // 116: goto 11d
      // 119: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 11c: athrow
      // 11d: astore 2
      // 11e: aload 2
      // 11f: astore 3
      // 120: aload 0
      // 121: ldc2_w 219869986007226463
      // 124: astore 32
      // 126: ldc2_w 219869986007226463
      // 129: aload 32
      // 12b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 12e: checkcast com/finalshell/ui/panel/Address
      // 131: iload 1
      // 132: ifne 1a5
      // 135: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 138: ldc2_w 533121148343758733
      // 13b: astore 35
      // 13d: astore 34
      // 13f: ldc2_w 533121148343758733
      // 142: aload 34
      // 144: aload 35
      // 146: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 149: checkcast java/lang/Boolean
      // 14c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 14f: goto 156
      // 152: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 155: athrow
      // 156: ifne 1c2
      // 159: goto 160
      // 15c: invokestatic com/finalshell/task/DF3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15f: athrow
      // 160: aload 0
      // 161: ldc2_w 219869986007226463
      // 164: astore 36
      // 166: ldc2_w 219869986007226463
      // 169: aload 36
      // 16b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 16e: aload 3
      // 16f: bipush 0
      // 170: bipush 0
      // 171: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;ZZ)[Ljava/lang/Object;
      // 174: ldc2_w 324338769529465951
      // 177: astore 39
      // 179: astore 38
      // 17b: ldc2_w 324338769529465951
      // 17e: aload 38
      // 180: aload 39
      // 182: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 185: pop
      // 186: goto 18d
      // 189: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 18c: athrow
      // 18d: aload 0
      // 18e: ldc2_w 219869986007226463
      // 191: astore 40
      // 193: ldc2_w 219869986007226463
      // 196: aload 40
      // 198: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 19b: checkcast com/finalshell/ui/panel/Address
      // 19e: goto 1a5
      // 1a1: invokestatic com/finalshell/task/DF3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a4: athrow
      // 1a5: bipush 1
      // 1a6: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 1a9: ldc2_w 170139764071507832
      // 1ac: astore 43
      // 1ae: astore 42
      // 1b0: ldc2_w 170139764071507832
      // 1b3: aload 42
      // 1b5: aload 43
      // 1b7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ba: pop
      // 1bb: goto 1c2
      // 1be: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c1: athrow
      // 1c2: goto 1c6
      // 1c5: astore 2
      // 1c6: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }
}





