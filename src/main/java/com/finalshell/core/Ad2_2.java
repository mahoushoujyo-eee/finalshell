package com.finalshell.core;

import com.finalshell.ui.model.Oc2;

public class Ad2_2 implements A0_2 {
   public final int[] B;

   public Ad2_2(int[] var1) {
      this.B = var1;
   }

   @Override
   public Object Y(Ph4 var1, Object var2, Object var3) {
      Oc2 var5 = new Oc2(this.B.length);
      String var10000 = Hi2.C();
      int var6 = 0;
      String var4 = var10000;

      while (true) {
         if (var6 < this.B.length) {
      Oc2 var9;
            Object var7 = var1.n(var3, this.B[var6]);

            try {
               var9 = var5;
               if (var4 != null) {
                  break;
               }

               var5.add(var7);
               var6++;
               if (var4 == null) {
                  continue;
               }
            } catch (UnsupportedOperationException var8) {
      Oc2 var9;
               throw a(var8);
            }
         }

         var9 = var5;
         break;
      }

      return var9;
   }

   @Override
   public void Z(Ph4 param1, Yn4 param2, KE param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 4
      // 05: aload 3
      // 06: aload 4
      // 08: ifnonnull 23
      // 0b: getfield com/finalshell/core/KE.o Z
      // 0e: ifeq e2
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/Ad2_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 17: athrow
      // 18: aload 2
      // 19: invokevirtual com/finalshell/core/Yn4.M ()Ljava/lang/Object;
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/Ad2_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 22: athrow
      // 23: astore 5
      // 25: aload 5
      // 27: instanceof java/util/List
      // 2a: aload 4
      // 2c: ifnonnull 45
      // 2f: ifeq e2
      // 32: goto 39
      // 35: invokestatic com/finalshell/core/Ad2_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield com/finalshell/core/Ad2_2.B [I
      // 3d: arraylength
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/Ad2_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 44: athrow
      // 45: newarray 10
      // 47: astore 6
      // 49: aload 0
      // 4a: getfield com/finalshell/core/Ad2_2.B [I
      // 4d: bipush 0
      // 4e: aload 6
      // 50: bipush 0
      // 51: aload 6
      // 53: arraylength
      // 54: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 57: aload 6
      // 59: bipush 0
      // 5a: iaload
      // 5b: aload 4
      // 5d: ifnonnull 6b
      // 60: iflt 6e
      // 63: goto 6a
      // 66: invokestatic com/finalshell/core/Ad2_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 69: athrow
      // 6a: bipush 1
      // 6b: goto 6f
      // 6e: bipush 0
      // 6f: istore 7
      // 71: aload 5
      // 73: checkcast java/util/List
      // 76: astore 8
      // 78: iload 7
      // 7a: aload 4
      // 7c: ifnonnull 99
      // 7f: ifeq e2
      // 82: goto 89
      // 85: invokestatic com/finalshell/core/Ad2_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 88: athrow
      // 89: aload 8
      // 8b: invokeinterface java/util/List.size ()I 1
      // 90: bipush 1
      // 91: isub
      // 92: goto 99
      // 95: invokestatic com/finalshell/core/Ad2_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 98: athrow
      // 99: istore 9
      // 9b: iload 9
      // 9d: iflt db
      // a0: aload 4
      // a2: ifnonnull e1
      // a5: aload 6
      // a7: aload 4
      // a9: ifnonnull d2
      // ac: goto b3
      // af: invokestatic com/finalshell/core/Ad2_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // b2: athrow
      // b3: iload 9
      // b5: invokestatic java/util/Arrays.binarySearch ([II)I
      // b8: ifge d3
      // bb: goto c2
      // be: invokestatic com/finalshell/core/Ad2_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // c1: athrow
      // c2: aload 8
      // c4: iload 9
      // c6: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // cb: goto d2
      // ce: invokestatic com/finalshell/core/Ad2_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // d1: athrow
      // d2: pop
      // d3: iinc 9 -1
      // d6: aload 4
      // d8: ifnull 9b
      // db: aload 3
      // dc: aload 8
      // de: putfield com/finalshell/core/KE.t Ljava/lang/Object;
      // e1: return
      // e2: new java/lang/UnsupportedOperationException
      // e5: dup
      // e6: invokespecial java/lang/UnsupportedOperationException.<init> ()V
      // e9: athrow
   }

   public static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }
}






