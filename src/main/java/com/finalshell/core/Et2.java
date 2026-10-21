package com.finalshell.core;

import java.util.Objects;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Et2 {
   public static Et2 I;
   public static Et2 E;
   public final int u;
   public final XF3 k;
   public final Supplier m;
   public static String a;

   public Et2(int var1) {
      this(var1, null, null);
   }

   public Et2(int var1, int var2, int var3) {
      this(-1, new XF3(var1, var2, var3), null);
   }

   public Et2(@NotNull Supplier var1) {
      this(-1, null, var1);
   }

   public Et2(int param1, @Nullable XF3 param2, @Nullable Supplier param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: iload 1
      // 05: bipush -1
      // 06: if_icmpeq 43
      // 09: getstatic com/finalshell/core/Et2.h Z
      // 0c: ifne 26
      // 0f: aload 2
      // 10: ifnull 26
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19: athrow
      // 1a: new java/lang/AssertionError
      // 1d: dup
      // 1e: invokespecial java/lang/AssertionError.<init> ()V
      // 21: athrow
      // 22: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25: athrow
      // 26: getstatic com/finalshell/core/Et2.h Z
      // 29: ifne 88
      // 2c: aload 3
      // 2d: ifnull 88
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 36: athrow
      // 37: new java/lang/AssertionError
      // 3a: dup
      // 3b: invokespecial java/lang/AssertionError.<init> ()V
      // 3e: athrow
      // 3f: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42: athrow
      // 43: aload 2
      // 44: ifnull 6b
      // 47: getstatic com/finalshell/core/Et2.h Z
      // 4a: ifne 88
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 53: athrow
      // 54: aload 3
      // 55: ifnull 88
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5e: athrow
      // 5f: new java/lang/AssertionError
      // 62: dup
      // 63: invokespecial java/lang/AssertionError.<init> ()V
      // 66: athrow
      // 67: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6a: athrow
      // 6b: getstatic com/finalshell/core/Et2.h Z
      // 6e: ifne 88
      // 71: aload 3
      // 72: ifnonnull 88
      // 75: goto 7c
      // 78: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7b: athrow
      // 7c: new java/lang/AssertionError
      // 7f: dup
      // 80: invokespecial java/lang/AssertionError.<init> ()V
      // 83: athrow
      // 84: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 87: athrow
      // 88: aload 0
      // 89: iload 1
      // 8a: putfield com/finalshell/core/Et2.u I
      // 8d: aload 0
      // 8e: aload 2
      // 8f: putfield com/finalshell/core/Et2.k Lcom/finalshell/core/XF3;
      // 92: aload 0
      // 93: aload 3
      // 94: putfield com/finalshell/core/Et2.m Ljava/util/function/Supplier;
      // 97: return
   }

   @NotNull
   public static Et2 W(int var0) {
      return new Et2(var0);
   }

   public static Et2 U(int var0, int var1, int var2) {
      return new Et2(var0, var1, var2);
   }

   public boolean h() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dx4.g ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/Et2.u I
      // 08: aload 1
      // 09: ifnonnull 1f
      // 0c: bipush -1
      // 0d: if_icmpeq 22
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16: athrow
      // 17: bipush 1
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e: athrow
      // 1f: goto 23
      // 22: bipush 0
      // 23: ireturn
   }

   @NotNull
   public XF3 d() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dx4.g ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 26
      // 09: invokevirtual com/finalshell/core/Et2.h ()Z
      // 0c: ifeq 25
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: new java/lang/IllegalArgumentException
      // 19: dup
      // 1a: getstatic com/finalshell/core/Et2.a Ljava/lang/String;
      // 1d: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 20: athrow
      // 21: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24: athrow
      // 25: aload 0
      // 26: getfield com/finalshell/core/Et2.k Lcom/finalshell/core/XF3;
      // 29: aload 1
      // 2a: ifnonnull 51
      // 2d: ifnull 42
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 36: athrow
      // 37: aload 0
      // 38: getfield com/finalshell/core/Et2.k Lcom/finalshell/core/XF3;
      // 3b: goto 54
      // 3e: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 41: athrow
      // 42: aload 0
      // 43: getfield com/finalshell/core/Et2.m Ljava/util/function/Supplier;
      // 46: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 49: checkcast java/util/function/Supplier
      // 4c: invokeinterface java/util/function/Supplier.get ()Ljava/lang/Object; 1
      // 51: checkcast com/finalshell/core/XF3
      // 54: areturn
   }

   public int q() {
      return this.u;
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
      // 00: invokestatic com/finalshell/core/Dx4.g ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19: athrow
      // 1a: aload 1
      // 1b: ifnull 3b
      // 1e: aload 0
      // 1f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 22: aload 2
      // 23: ifnonnull 42
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c: athrow
      // 2d: aload 1
      // 2e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 31: if_acmpeq 41
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a: athrow
      // 3b: bipush 0
      // 3c: ireturn
      // 3d: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 40: athrow
      // 41: aload 1
      // 42: checkcast com/finalshell/core/Et2
      // 45: astore 3
      // 46: aload 0
      // 47: getfield com/finalshell/core/Et2.u I
      // 4a: aload 2
      // 4b: ifnonnull 6e
      // 4e: aload 3
      // 4f: getfield com/finalshell/core/Et2.u I
      // 52: if_icmpne 80
      // 55: goto 5c
      // 58: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5b: athrow
      // 5c: aload 0
      // 5d: getfield com/finalshell/core/Et2.k Lcom/finalshell/core/XF3;
      // 60: aload 3
      // 61: getfield com/finalshell/core/Et2.k Lcom/finalshell/core/XF3;
      // 64: invokestatic java/util/Objects.equals (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 67: goto 6e
      // 6a: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6d: athrow
      // 6e: aload 2
      // 6f: ifnonnull 7d
      // 72: ifeq 80
      // 75: goto 7c
      // 78: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7b: athrow
      // 7c: bipush 1
      // 7d: goto 81
      // 80: bipush 0
      // 81: ireturn
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.u, this.k);
   }

   @Nullable
   public static Et2 R(@Nullable XF3 param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dx4.g ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: invokestatic com/finalshell/core/Et2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18: athrow
      // 19: aload 0
      // 1a: invokevirtual com/finalshell/core/XF3.U ()I
      // 1d: aload 0
      // 1e: invokevirtual com/finalshell/core/XF3.K ()I
      // 21: aload 0
      // 22: invokevirtual com/finalshell/core/XF3.E$int ()I
      // 25: invokestatic com/finalshell/core/Et2.U (III)Lcom/finalshell/core/Et2;
      // 28: areturn
   }

   static {
      __vfClinit__();
   }

   public static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      boolean h;
      char[] var10003 = "E UPCA:uoPQU\u0004+c+\u0019\\^\r<toJP\u0011\u0000sv.UZE\u00156&&J\u001f_\u00046b*]".toCharArray();
      int var10004 = var10003.length;
      int var4 = 0;
      byte var19 = 55;
      char[] var10002 = var10003;
      int var10 = var10004;
      char[] var23;
      byte var27;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var23 = var10003;
         var10005 = var4;
         char var10008 = var10003[var4];
         var10007 = 55;
         var10006 = var10008;
         switch (var4 % 7) {
            case 0:
               var27 = 49;
               break;
            case 1:
               var27 = 120;
               break;
            case 2:
               var27 = 14;
               break;
            case 3:
               var27 = 8;
               break;
            case 4:
               var27 = 6;
               break;
            case 5:
               var27 = 86;
               break;
            default:
               var27 = 100;
         }
      } else {
         var19 = 55;
         var10 = var10004;
         if (var10004 <= var4) {
            String var22 = new String(var10003).intern();
            byte var14 = -1;
            a = var22;
            long var8 = 4857096518171312323L;
            long var18 = 1559959139892019404L ^ var8;
            var14 = -1;
            long var7 = var18;

            boolean var9;
            label72: {
               try {
                  if (!Et2.class.desiredAssertionStatus()) {
                     var9 = true;
                     break label72;
                  }
               } catch (IllegalArgumentException var6) {
                  throw a(var6);
               }

               var9 = false;
            }

            h = var9;
            I = W(0);
            E = W((int)var7);
            return;
         }

         var23 = var10003;
         var10005 = var4;
         char var28 = var10003[var4];
         var10007 = 55;
         var10006 = var28;
         switch (var4 % 7) {
            case 0:
               var27 = 49;
               break;
            case 1:
               var27 = 120;
               break;
            case 2:
               var27 = 14;
               break;
            case 3:
               var27 = 8;
               break;
            case 4:
               var27 = 6;
               break;
            case 5:
               var27 = 86;
               break;
            default:
               var27 = 100;
         }
      }

      while (true) {
         var23[var10005] = (char)(var10006 ^ var10007 ^ var27);
         var4++;
         if (var19 == 0) {
            var23 = var10002;
            var10005 = var19;
            char var30 = var10002[var19];
            var10007 = var19;
            var10006 = var30;
            switch (var4 % 7) {
               case 0:
                  var27 = 49;
                  break;
               case 1:
                  var27 = 120;
                  break;
               case 2:
                  var27 = 14;
                  break;
               case 3:
                  var27 = 8;
                  break;
               case 4:
                  var27 = 6;
                  break;
               case 5:
                  var27 = 86;
                  break;
               default:
                  var27 = 100;
            }
         } else {
            if (var10 <= var4) {
               String var21 = new String(var10002).intern();
               byte var12 = -1;
               a = var21;
               long var2 = 4857096518171312323L;
               long var17 = 1559959139892019404L ^ var2;
               var12 = -1;
               long var0 = var17;

               boolean var10000;
               label36: {
                  try {
                     if (!Et2.class.desiredAssertionStatus()) {
                        var10000 = true;
                        break label36;
                     }
                  } catch (IllegalArgumentException var5) {
                     throw a(var5);
                  }

                  var10000 = false;
               }

               h = var10000;
               I = W(0);
               E = W((int)var0);
               return;
            }

            var23 = var10002;
            var10005 = var4;
            char var29 = var10002[var4];
            var10007 = var19;
            var10006 = var29;
            switch (var4 % 7) {
               case 0:
                  var27 = 49;
                  break;
               case 1:
                  var27 = 120;
                  break;
               case 2:
                  var27 = 14;
                  break;
               case 3:
                  var27 = 8;
                  break;
               case 4:
                  var27 = 6;
                  break;
               case 5:
                  var27 = 86;
                  break;
               default:
                  var27 = 100;
            }
         }
      }
   }
}





