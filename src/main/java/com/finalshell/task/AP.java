package com.finalshell.task;

import com.finalshell.core.L9;
import com.finalshell.ui.panel.RouteTracePanel;

public class AP implements Runnable {
   public final String Q;
   public final L9 s;
   public final RouteTracePanel x;
   public static long a;
   public static long b;

   public AP(String var1, L9 var2, RouteTracePanel var3) {
      this.Q = var1;
      this.s = var2;
      this.x = var3;
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
      // 003: bipush 0
      // 004: istore 2
      // 005: astore 1
      // 006: iload 2
      // 007: getstatic com/finalshell/task/AP.a J
      // 00a: l2i
      // 00b: if_icmpge 0f9
      // 00e: aload 0
      // 00f: ldc2_w 352717609616669744
      // 012: astore 5
      // 014: ldc2_w 352717609616669744
      // 017: aload 5
      // 019: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 01c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 01f: ldc2_w 310988506867275920
      // 022: astore 7
      // 024: ldc2_w 310988506867275920
      // 027: aload 7
      // 029: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 02c: checkcast java/lang/String
      // 02f: goto 036
      // 032: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 035: athrow
      // 036: astore 3
      // 037: aload 1
      // 038: ifnull 11b
      // 03b: aload 1
      // 03c: ifnull 0e8
      // 03f: goto 046
      // 042: invokestatic com/finalshell/task/AP.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 045: athrow
      // 046: aload 3
      // 047: ifnull 0e2
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/task/AP.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 050: athrow
      // 051: ldc2_w 214628155357142695
      // 054: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 057: aconst_null
      // 058: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 05b: checkcast java/util/HashMap
      // 05e: aload 0
      // 05f: ldc2_w 352717609616669744
      // 062: astore 9
      // 064: ldc2_w 352717609616669744
      // 067: aload 9
      // 069: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 06c: checkcast java/lang/String
      // 06f: aload 3
      // 070: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 073: pop
      // 074: aload 0
      // 075: ldc2_w 459320414346008704
      // 078: astore 11
      // 07a: ldc2_w 459320414346008704
      // 07d: aload 11
      // 07f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 082: aload 3
      // 083: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 086: ldc2_w 578949176184911929
      // 089: astore 14
      // 08b: astore 13
      // 08d: ldc2_w 578949176184911929
      // 090: aload 13
      // 092: aload 14
      // 094: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 097: pop
      // 098: goto 09f
      // 09b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 09e: athrow
      // 09f: aload 0
      // 0a0: ldc2_w 315642702741398491
      // 0a3: astore 15
      // 0a5: ldc2_w 315642702741398491
      // 0a8: aload 15
      // 0aa: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0ad: aload 0
      // 0ae: ldc2_w 459320414346008704
      // 0b1: astore 17
      // 0b3: ldc2_w 459320414346008704
      // 0b6: aload 17
      // 0b8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0bb: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0be: ldc2_w 137222181119797019
      // 0c1: astore 20
      // 0c3: astore 19
      // 0c5: ldc2_w 137222181119797019
      // 0c8: aload 19
      // 0ca: aload 20
      // 0cc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0cf: pop
      // 0d0: goto 0d7
      // 0d3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0d6: athrow
      // 0d7: aload 1
      // 0d8: ifnonnull 0f9
      // 0db: goto 0e2
      // 0de: invokestatic com/finalshell/task/AP.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0e1: athrow
      // 0e2: getstatic com/finalshell/task/AP.b J
      // 0e5: invokestatic java/lang/Thread.sleep (J)V
      // 0e8: goto 0f2
      // 0eb: astore 4
      // 0ed: aload 4
      // 0ef: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 0f2: iinc 2 1
      // 0f5: aload 1
      // 0f6: ifnonnull 006
      // 0f9: ldc2_w 219500707619661044
      // 0fc: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0ff: aconst_null
      // 100: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 103: checkcast java/util/HashSet
      // 106: aload 0
      // 107: ldc2_w 352717609616669744
      // 10a: astore 21
      // 10c: ldc2_w 352717609616669744
      // 10f: aload 21
      // 111: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 114: checkcast java/lang/String
      // 117: invokevirtual java/util/HashSet.remove (Ljava/lang/Object;)Z
      // 11a: pop
      // 11b: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var2 = 3135460603703768721L;
      long var10002 = 9071338322852230811L ^ var2;
      byte var10001 = -1;
      a = var10002;
      long var0 = 1227919196501493805L;
      var10002 = 1227919196501494233L ^ var0;
      var10001 = -1;
      b = var10002;
   }
}





