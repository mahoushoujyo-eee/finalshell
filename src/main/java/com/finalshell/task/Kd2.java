package com.finalshell.task;

public class Kd2 implements Runnable {
   final com.finalshell.core.Dw4 O;
   public static long a;

   Kd2(com.finalshell.core.Dw4 var1) {
      this.O = var1;
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
      // 000: invokestatic com/finalshell/core/L9.X ()[I
      // 003: bipush 0
      // 004: istore 2
      // 005: astore 1
      // 006: iload 2
      // 007: aload 1
      // 008: ifnonnull 111
      // 00b: bipush 5
      // 00c: if_icmpge 0f9
      // 00f: goto 016
      // 012: invokestatic com/finalshell/task/Kd2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: aload 0
      // 017: ldc2_w 188463863722214745
      // 01a: astore 5
      // 01c: ldc2_w 188463863722214745
      // 01f: aload 5
      // 021: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 024: ldc2_w 175400870153177569
      // 027: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 02a: swap
      // 02b: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 02e: aload 1
      // 02f: ifnonnull 111
      // 032: goto 039
      // 035: invokestatic com/finalshell/task/Kd2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 038: athrow
      // 039: ifeq 0f9
      // 03c: goto 043
      // 03f: invokestatic com/finalshell/task/Kd2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 042: athrow
      // 043: aload 0
      // 044: ldc2_w 188463863722214745
      // 047: astore 7
      // 049: ldc2_w 188463863722214745
      // 04c: aload 7
      // 04e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 051: aload 0
      // 052: ldc2_w 188463863722214745
      // 055: astore 9
      // 057: ldc2_w 188463863722214745
      // 05a: aload 9
      // 05c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 05f: ldc2_w 188881920873049499
      // 062: astore 11
      // 064: ldc2_w 188881920873049499
      // 067: aload 11
      // 069: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 06c: checkcast java/lang/String
      // 06f: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 072: ldc2_w 315004095662248503
      // 075: astore 14
      // 077: astore 13
      // 079: ldc2_w 315004095662248503
      // 07c: aload 13
      // 07e: aload 14
      // 080: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 083: aload 0
      // 084: ldc2_w 188463863722214745
      // 087: astore 15
      // 089: ldc2_w 188463863722214745
      // 08c: aload 15
      // 08e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 091: aload 0
      // 092: ldc2_w 188463863722214745
      // 095: astore 17
      // 097: ldc2_w 188463863722214745
      // 09a: aload 17
      // 09c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 09f: ldc2_w 315004095662248503
      // 0a2: astore 19
      // 0a4: ldc2_w 315004095662248503
      // 0a7: aload 19
      // 0a9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0ac: checkcast java/net/InetAddress
      // 0af: invokevirtual java/net/InetAddress.getHostAddress ()Ljava/lang/String;
      // 0b2: ldc2_w 488976998546483488
      // 0b5: astore 22
      // 0b7: astore 21
      // 0b9: ldc2_w 488976998546483488
      // 0bc: aload 21
      // 0be: aload 22
      // 0c0: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0c3: aload 0
      // 0c4: ldc2_w 188463863722214745
      // 0c7: astore 23
      // 0c9: ldc2_w 188463863722214745
      // 0cc: aload 23
      // 0ce: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d1: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0d4: ldc2_w 198439350693815063
      // 0d7: astore 26
      // 0d9: astore 25
      // 0db: ldc2_w 198439350693815063
      // 0de: aload 25
      // 0e0: aload 26
      // 0e2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0e5: pop
      // 0e6: goto 0ed
      // 0e9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: goto 0f9
      // 0f0: invokestatic com/finalshell/task/Kd2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f3: athrow
      // 0f4: astore 3
      // 0f5: aload 3
      // 0f6: invokevirtual java/net/UnknownHostException.printStackTrace ()V
      // 0f9: aload 0
      // 0fa: ldc2_w 188463863722214745
      // 0fd: astore 27
      // 0ff: ldc2_w 188463863722214745
      // 102: aload 27
      // 104: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 107: ldc2_w 175400870153177569
      // 10a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 10d: swap
      // 10e: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 111: ifeq 19d
      // 114: bipush 0
      // 115: istore 2
      // 116: aload 0
      // 117: ldc2_w 188463863722214745
      // 11a: astore 29
      // 11c: ldc2_w 188463863722214745
      // 11f: aload 29
      // 121: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 124: ldc2_w 145412445008776377
      // 127: astore 31
      // 129: ldc2_w 145412445008776377
      // 12c: aload 31
      // 12e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 131: checkcast java/util/ArrayList
      // 134: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 137: astore 3
      // 138: aload 3
      // 139: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 13e: ifeq 18b
      // 141: aload 3
      // 142: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 147: checkcast com/finalshell/core/L9
      // 14a: astore 4
      // 14c: ldc2_w 388376917454860932
      // 14f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 152: aconst_null
      // 153: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 156: new com/finalshell/task/LY
      // 159: dup
      // 15a: aload 0
      // 15b: aload 4
      // 15d: invokespecial com/finalshell/task/LY.<init> (Lcom/finalshell/task/Kd2;Lcom/finalshell/core/L9;)V
      // 160: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 163: ldc2_w 434592463220957006
      // 166: astore 34
      // 168: astore 33
      // 16a: ldc2_w 434592463220957006
      // 16d: aload 33
      // 16f: aload 34
      // 171: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 174: pop
      // 175: goto 17c
      // 178: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 17b: athrow
      // 17c: aload 1
      // 17d: ifnonnull 191
      // 180: aload 1
      // 181: ifnull 138
      // 184: goto 18b
      // 187: invokestatic com/finalshell/task/Kd2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18a: athrow
      // 18b: getstatic com/finalshell/task/Kd2.a J
      // 18e: invokestatic java/lang/Thread.sleep (J)V
      // 191: goto 199
      // 194: astore 3
      // 195: aload 3
      // 196: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 199: aload 1
      // 19a: ifnull 0f9
      // 19d: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 6354878816794246229L;
      long var10002 = 6354878816794247101L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





