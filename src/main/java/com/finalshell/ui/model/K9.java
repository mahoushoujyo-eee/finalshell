package com.finalshell.ui.model;

import com.finalshell.core.Lv4_2;
import com.finalshell.core.Yf2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

public class K9 implements Comparator {
   final Yf2 Y;

   K9(Yf2 var1) {
      this.Y = var1;
   }

   public int C(Lv4_2 param1, Lv4_2 param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: Invalid argument: OBJECT
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ConstExprent.getZeroConstant(ConstExprent.java:599)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:391)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:256)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:146)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:47)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:302)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Lv4_2.H$arrint ()[I
      // 003: aload 1
      // 004: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 007: ldc2_w 622590009271170486
      // 00a: astore 9
      // 00c: astore 8
      // 00e: ldc2_w 622590009271170486
      // 011: aload 8
      // 013: aload 9
      // 015: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 018: checkcast java/lang/Long
      // 01b: invokevirtual java/lang/Long.longValue ()J
      // 01e: goto 025
      // 021: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 024: athrow
      // 025: lstore 4
      // 027: astore 3
      // 028: aload 1
      // 029: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 02c: ldc2_w 365199820804367683
      // 02f: astore 11
      // 031: astore 10
      // 033: ldc2_w 365199820804367683
      // 036: aload 10
      // 038: aload 11
      // 03a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 03d: checkcast java/lang/Long
      // 040: invokevirtual java/lang/Long.longValue ()J
      // 043: goto 04a
      // 046: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 049: athrow
      // 04a: aload 3
      // 04b: ifnull 0ba
      // 04e: aload 1
      // 04f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 052: ldc2_w 622590009271170486
      // 055: astore 13
      // 057: astore 12
      // 059: ldc2_w 622590009271170486
      // 05c: aload 12
      // 05e: aload 13
      // 060: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 063: checkcast java/lang/Long
      // 066: invokevirtual java/lang/Long.longValue ()J
      // 069: goto 070
      // 06c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 06f: athrow
      // 070: lcmp
      // 071: ifle 098
      // 074: aload 1
      // 075: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 078: ldc2_w 365199820804367683
      // 07b: astore 15
      // 07d: astore 14
      // 07f: ldc2_w 365199820804367683
      // 082: aload 14
      // 084: aload 15
      // 086: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 089: checkcast java/lang/Long
      // 08c: invokevirtual java/lang/Long.longValue ()J
      // 08f: goto 096
      // 092: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 095: athrow
      // 096: lstore 4
      // 098: aload 2
      // 099: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 09c: ldc2_w 622590009271170486
      // 09f: astore 17
      // 0a1: astore 16
      // 0a3: ldc2_w 622590009271170486
      // 0a6: aload 16
      // 0a8: aload 17
      // 0aa: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0ad: checkcast java/lang/Long
      // 0b0: invokevirtual java/lang/Long.longValue ()J
      // 0b3: goto 0ba
      // 0b6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: lstore 6
      // 0bc: aload 2
      // 0bd: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0c0: ldc2_w 365199820804367683
      // 0c3: astore 19
      // 0c5: astore 18
      // 0c7: ldc2_w 365199820804367683
      // 0ca: aload 18
      // 0cc: aload 19
      // 0ce: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0d1: checkcast java/lang/Long
      // 0d4: invokevirtual java/lang/Long.longValue ()J
      // 0d7: goto 0de
      // 0da: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: aload 2
      // 0df: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0e2: ldc2_w 622590009271170486
      // 0e5: astore 21
      // 0e7: astore 20
      // 0e9: ldc2_w 622590009271170486
      // 0ec: aload 20
      // 0ee: aload 21
      // 0f0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0f3: checkcast java/lang/Long
      // 0f6: invokevirtual java/lang/Long.longValue ()J
      // 0f9: goto 100
      // 0fc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: lcmp
      // 101: aload 3
      // 102: ifnull 133
      // 105: ifle 12c
      // 108: aload 2
      // 109: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 10c: ldc2_w 365199820804367683
      // 10f: astore 23
      // 111: astore 22
      // 113: ldc2_w 365199820804367683
      // 116: aload 22
      // 118: aload 23
      // 11a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 11d: checkcast java/lang/Long
      // 120: invokevirtual java/lang/Long.longValue ()J
      // 123: goto 12a
      // 126: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 129: athrow
      // 12a: lstore 6
      // 12c: lload 6
      // 12e: lload 4
      // 130: invokestatic java/lang/Long.compare (JJ)I
      // 133: ireturn
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = Registry.packArgs((Lv4_2)var1, (Lv4_2)var2);
      long var4 = 369838979687248377L;
      Object[] var3 = var10001;
      var10001 = Ref.h(369838979687248377L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





