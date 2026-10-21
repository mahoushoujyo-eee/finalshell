package com.finalshell.ui.model;

import com.finalshell.core.C_9;
import com.finalshell.core.Z_5;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class X implements Iterator {
   public final Z_5 b;
   public static Object o;
   @C_9
   public static Object A;
   @C_9
   public Object E;
   public static String a;

   public X(Z_5 var1) {
      this.E = o;
      this.b = var1;
   }

   @Override
   public boolean hasNext() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/F3_3.G ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/finalshell/ui/model/X.E Ljava/lang/Object;
      // 08: getstatic com/finalshell/ui/model/X.o Ljava/lang/Object;
      // 0b: iload 1
      // 0c: ifne 34
      // 0f: if_acmpne 2d
      // 12: goto 19
      // 15: invokestatic com/finalshell/ui/model/X.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 18: athrow
      // 19: aload 0
      // 1a: aload 0
      // 1b: getfield com/finalshell/ui/model/X.b Lcom/finalshell/core/Z_5;
      // 1e: invokeinterface com/finalshell/core/Z_5.h ()Ljava/lang/Object; 1
      // 23: putfield com/finalshell/ui/model/X.E Ljava/lang/Object;
      // 26: goto 2d
      // 29: invokestatic com/finalshell/ui/model/X.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield com/finalshell/ui/model/X.E Ljava/lang/Object;
      // 31: getstatic com/finalshell/ui/model/X.A Ljava/lang/Object;
      // 34: if_acmpeq 3f
      // 37: bipush 1
      // 38: goto 40
      // 3b: invokestatic com/finalshell/ui/model/X.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 3e: athrow
      // 3f: bipush 0
      // 40: ireturn
   }

   @Override
   public Object next() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/F3_3.s ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/finalshell/ui/model/X.E Ljava/lang/Object;
      // 08: getstatic com/finalshell/ui/model/X.o Ljava/lang/Object;
      // 0b: iload 1
      // 0c: ifeq 3f
      // 0f: if_acmpne 2d
      // 12: goto 19
      // 15: invokestatic com/finalshell/ui/model/X.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 18: athrow
      // 19: aload 0
      // 1a: aload 0
      // 1b: getfield com/finalshell/ui/model/X.b Lcom/finalshell/core/Z_5;
      // 1e: invokeinterface com/finalshell/core/Z_5.h ()Ljava/lang/Object; 1
      // 23: putfield com/finalshell/ui/model/X.E Ljava/lang/Object;
      // 26: goto 2d
      // 29: invokestatic com/finalshell/ui/model/X.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield com/finalshell/ui/model/X.E Ljava/lang/Object;
      // 31: iload 1
      // 32: ifeq 52
      // 35: getstatic com/finalshell/ui/model/X.A Ljava/lang/Object;
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/ui/model/X.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 3e: athrow
      // 3f: if_acmpne 4e
      // 42: new java/util/NoSuchElementException
      // 45: dup
      // 46: invokespecial java/util/NoSuchElementException.<init> ()V
      // 49: athrow
      // 4a: invokestatic com/finalshell/ui/model/X.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 4d: athrow
      // 4e: aload 0
      // 4f: getfield com/finalshell/ui/model/X.E Ljava/lang/Object;
      // 52: astore 2
      // 53: aload 0
      // 54: iload 1
      // 55: ifeq 8e
      // 58: getstatic com/finalshell/ui/model/X.o Ljava/lang/Object;
      // 5b: putfield com/finalshell/ui/model/X.E Ljava/lang/Object;
      // 5e: getstatic com/finalshell/ui/model/X.L Z
      // 61: ifne 8d
      // 64: goto 6b
      // 67: invokestatic com/finalshell/ui/model/X.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 6a: athrow
      // 6b: aload 2
      // 6c: iload 1
      // 6d: ifeq 8e
      // 70: goto 77
      // 73: invokestatic com/finalshell/ui/model/X.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 76: athrow
      // 77: ifnonnull 8d
      // 7a: goto 81
      // 7d: invokestatic com/finalshell/ui/model/X.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 80: athrow
      // 81: new java/lang/AssertionError
      // 84: dup
      // 85: invokespecial java/lang/AssertionError.<init> ()V
      // 88: athrow
      // 89: invokestatic com/finalshell/ui/model/X.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 8c: athrow
      // 8d: aload 2
      // 8e: areturn
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException(a);
   }

   static {
      __vfClinit__();
   }

   public static NoSuchElementException a(NoSuchElementException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      boolean L;
      char[] var10003 = " mBsk}".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var9 = 74;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var13;
      byte var17;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var13 = var10003;
         var10005 = var0;
         char var10008 = var10003[var0];
         var10007 = 74;
         var10006 = var10008;
         switch (var0 % 7) {
            case 0:
               var17 = 24;
               break;
            case 1:
               var17 = 66;
               break;
            case 2:
               var17 = 101;
               break;
            case 3:
               var17 = 86;
               break;
            case 4:
               var17 = 87;
               break;
            case 5:
               var17 = 82;
               break;
            default:
               var17 = 40;
         }
      } else {
         var9 = 74;
         var4 = var10004;
         if (var10004 <= var0) {
            String var12 = new String(var10003).intern();
            byte var7 = -1;
            a = var12;

            boolean var3;
            label69: {
               try {
                  if (!X.class.desiredAssertionStatus()) {
                     var3 = true;
                     break label69;
                  }
               } catch (NoSuchElementException var2) {
                  throw a(var2);
               }

               var3 = false;
            }

            L = var3;
            o = new Object();
            A = null;
            return;
         }

         var13 = var10003;
         var10005 = var0;
         char var18 = var10003[var0];
         var10007 = 74;
         var10006 = var18;
         switch (var0 % 7) {
            case 0:
               var17 = 24;
               break;
            case 1:
               var17 = 66;
               break;
            case 2:
               var17 = 101;
               break;
            case 3:
               var17 = 86;
               break;
            case 4:
               var17 = 87;
               break;
            case 5:
               var17 = 82;
               break;
            default:
               var17 = 40;
         }
      }

      while (true) {
         var13[var10005] = (char)(var10006 ^ var10007 ^ var17);
         var0++;
         if (var9 == 0) {
            var13 = var10002;
            var10005 = var9;
            char var20 = var10002[var9];
            var10007 = var9;
            var10006 = var20;
            switch (var0 % 7) {
               case 0:
                  var17 = 24;
                  break;
               case 1:
                  var17 = 66;
                  break;
               case 2:
                  var17 = 101;
                  break;
               case 3:
                  var17 = 86;
                  break;
               case 4:
                  var17 = 87;
                  break;
               case 5:
                  var17 = 82;
                  break;
               default:
                  var17 = 40;
            }
         } else {
            if (var4 <= var0) {
               String var11 = new String(var10002).intern();
               byte var6 = -1;
               a = var11;

               boolean var10000;
               label33: {
                  try {
                     if (!X.class.desiredAssertionStatus()) {
                        var10000 = true;
                        break label33;
                     }
                  } catch (NoSuchElementException var1) {
                     throw a(var1);
                  }

                  var10000 = false;
               }

               L = var10000;
               o = new Object();
               A = null;
               return;
            }

            var13 = var10002;
            var10005 = var0;
            char var19 = var10002[var0];
            var10007 = var9;
            var10006 = var19;
            switch (var0 % 7) {
               case 0:
                  var17 = 24;
                  break;
               case 1:
                  var17 = 66;
                  break;
               case 2:
                  var17 = 101;
                  break;
               case 3:
                  var17 = 86;
                  break;
               case 4:
                  var17 = 87;
                  break;
               case 5:
                  var17 = 82;
                  break;
               default:
                  var17 = 40;
            }
         }
      }
   }
}





