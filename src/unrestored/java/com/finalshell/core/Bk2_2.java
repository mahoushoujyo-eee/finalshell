package com.finalshell.core;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

public class Bk2_2 implements Ak2, X4 {
   public static Bk2_2 G;
   public static long a;

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void u(NL3 var1, Object var2, Object var3, Type var4, int var5) throws IOException {
      String var6 = Nv4.o();

      Object var7;
      label37: {
         Object var10000;
         label44: {
            label41: {
               try {
                  var10000 = var2;
                  if (var6 == null) {
                     break label44;
                  }

                  if (!(var2 instanceof AtomicReference)) {
                     break label41;
                  }
               } catch (RuntimeException var11) {
                  throw new RuntimeException(a(var11));
               }

               AtomicReference var8 = (AtomicReference)var2;
               var7 = var8.get();

               try {
                  if (var6 != null) {
                     break label37;
                  }
               } catch (RuntimeException var10) {
                  boolean var10001 = false;
                  throw new RuntimeException(a(var10));
               }
            }

            try {
               var10000 = ((Reference)var2).get();
            } catch (RuntimeException var9) {
               boolean var13 = false;
               throw new RuntimeException(a(var9));
            }
         }

         var7 = var10000;
      }

      var1.B(var7);
   }

   @Override
   public Object z(Yn4 param1, Type param2, Object param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 2
      // 04: checkcast java/lang/reflect/ParameterizedType
      // 07: astore 5
      // 09: astore 4
      // 0b: aload 5
      // 0d: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 12: bipush 0
      // 13: aaload
      // 14: astore 6
      // 16: aload 1
      // 17: aload 6
      // 19: invokevirtual com/finalshell/core/Yn4.o (Ljava/lang/reflect/Type;)Ljava/lang/Object;
      // 1c: astore 7
      // 1e: aload 5
      // 20: invokeinterface java/lang/reflect/ParameterizedType.getRawType ()Ljava/lang/reflect/Type; 1
      // 25: astore 8
      // 27: aload 8
      // 29: ldc java/util/concurrent/atomic/AtomicReference
      // 2b: aload 4
      // 2d: ifnull 4c
      // 30: if_acmpne 48
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/Bk2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: new java/util/concurrent/atomic/AtomicReference
      // 3d: dup
      // 3e: aload 7
      // 40: invokespecial java/util/concurrent/atomic/AtomicReference.<init> (Ljava/lang/Object;)V
      // 43: areturn
      // 44: invokestatic com/finalshell/core/Bk2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: aload 8
      // 4a: ldc java/lang/ref/WeakReference
      // 4c: aload 4
      // 4e: ifnull 6d
      // 51: if_acmpne 69
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/Bk2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: new java/lang/ref/WeakReference
      // 5e: dup
      // 5f: aload 7
      // 61: invokespecial java/lang/ref/WeakReference.<init> (Ljava/lang/Object;)V
      // 64: areturn
      // 65: invokestatic com/finalshell/core/Bk2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68: athrow
      // 69: aload 8
      // 6b: ldc java/lang/ref/SoftReference
      // 6d: if_acmpne 7e
      // 70: new java/lang/ref/SoftReference
      // 73: dup
      // 74: aload 7
      // 76: invokespecial java/lang/ref/SoftReference.<init> (Ljava/lang/Object;)V
      // 79: areturn
      // 7a: invokestatic com/finalshell/core/Bk2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d: athrow
      // 7e: new java/lang/UnsupportedOperationException
      // 81: dup
      // 82: aload 8
      // 84: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 87: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 8a: athrow
   }

   @Override
   public int j() {
      return (int)a;
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static void __vfClinit__() {
      long var0 = 5052890908347983415L;
      long var10002 = 7637711061552064059L ^ var0;
      byte var10001 = -1;
      a = var10002;
      G = new Bk2_2();
   }
}





