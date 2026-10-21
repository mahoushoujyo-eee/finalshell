package com.finalshell.core;

import java.awt.Composite;

public abstract class RA3 implements Composite {
   public float l;
   public static String B;
   public static String b;

   public RA3() {
      this(1.0F);
   }

   public RA3(float param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RA3.c ()Ljava/lang/String;
      // 03: aload 0
      // 04: invokespecial java/lang/Object.<init> ()V
      // 07: astore 2
      // 08: fload 1
      // 09: fconst_0
      // 0a: fcmpg
      // 0b: aload 2
      // 0c: ifnonnull 23
      // 0f: iflt 26
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/RA3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18: athrow
      // 19: fload 1
      // 1a: fconst_1
      // 1b: fcmpl
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/RA3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 22: athrow
      // 23: ifle 35
      // 26: new java/lang/IllegalArgumentException
      // 29: dup
      // 2a: getstatic com/finalshell/core/RA3.b Ljava/lang/String;
      // 2d: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 30: athrow
      // 31: invokestatic com/finalshell/core/RA3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34: athrow
      // 35: aload 0
      // 36: fload 1
      // 37: putfield com/finalshell/core/RA3.l F
      // 3a: return
   }

   public float k() {
      return this.l;
   }

   @Override
   public int hashCode() {
      return Float.floatToIntBits(this.l);
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RA3.c ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnonnull 1d
      // 09: instanceof com/finalshell/core/RA3
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/RA3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic com/finalshell/core/RA3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b: athrow
      // 1c: aload 1
      // 1d: checkcast com/finalshell/core/RA3
      // 20: astore 3
      // 21: aload 0
      // 22: getfield com/finalshell/core/RA3.l F
      // 25: aload 3
      // 26: getfield com/finalshell/core/RA3.l F
      // 29: fcmpl
      // 2a: aload 2
      // 2b: ifnonnull 3f
      // 2e: ifeq 3e
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/RA3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 37: athrow
      // 38: bipush 0
      // 39: ireturn
      // 3a: invokestatic com/finalshell/core/RA3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3d: athrow
      // 3e: bipush 1
      // 3f: ireturn
   }

   public static void C(String var0) {
      B = var0;
   }

   public static String c() {
      return B;
   }

   public static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      if (c() != null) {
         C("WrXAJ");
      }

      char[] var10003 = "\u00023`w\u0002.\u007f?\u0007K@\by/1\u0018R\\\fcb%\u0007V\u0014\u000f&/2\u0011VC\b&apD\u0002U\u0003'/a".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 90;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 90;
         var10006 = var0;
      } else {
         var6 = 90;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            return;
         }

         var10005 = var10003;
         var10 = 90;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 10;
               break;
            case 1:
               var23 = 46;
               break;
            case 2:
               var23 = 120;
               break;
            case 3:
               var23 = 110;
               break;
            case 4:
               var23 = 55;
               break;
            case 5:
               var23 = 25;
               break;
            default:
               var23 = 85;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               b = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





