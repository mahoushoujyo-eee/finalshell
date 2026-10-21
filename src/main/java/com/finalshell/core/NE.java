package com.finalshell.core;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public final class NE {
   public static List Y;
   public static Iw2 J;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;
   public static long[] e;
   public static Long[] f;

   public static String h(String var0) {
      return var0.replaceAll(a(31683, -30844), "");
   }

   public static Integer m(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: new java/lang/StringBuilder
      // 06: dup
      // 07: ldc ""
      // 09: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 0c: astore 2
      // 0d: astore 1
      // 0e: bipush 0
      // 0f: istore 3
      // 10: iload 3
      // 11: aload 0
      // 12: invokevirtual java/lang/String.length ()I
      // 15: if_icmpge 76
      // 18: aload 0
      // 19: iload 3
      // 1a: invokevirtual java/lang/String.charAt (I)C
      // 1d: istore 4
      // 1f: iload 4
      // 21: invokestatic java/lang/Character.isDigit (C)Z
      // 24: aload 1
      // 25: ifnonnull 7d
      // 28: aload 1
      // 29: ifnonnull 5a
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: ifeq 4f
      // 36: goto 3d
      // 39: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: aload 2
      // 3e: iload 4
      // 40: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 43: pop
      // 44: aload 1
      // 45: ifnull 68
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: aload 2
      // 50: invokevirtual java/lang/StringBuilder.length ()I
      // 53: goto 5a
      // 56: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: ifle 68
      // 5d: aload 1
      // 5e: ifnull 76
      // 61: goto 68
      // 64: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: iinc 3 1
      // 6b: aload 1
      // 6c: ifnull 10
      // 6f: goto 76
      // 72: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 75: athrow
      // 76: aload 2
      // 77: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7a: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 7d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 80: areturn
   }

   public static String H(String param0, int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: iload 1
      // 04: istore 3
      // 05: iload 1
      // 06: istore 4
      // 08: astore 2
      // 09: iload 4
      // 0b: aload 0
      // 0c: invokevirtual java/lang/String.length ()I
      // 0f: bipush 1
      // 10: isub
      // 11: if_icmpge 4d
      // 14: getstatic com/finalshell/core/NE.Y Ljava/util/List;
      // 17: aload 0
      // 18: iload 4
      // 1a: iload 4
      // 1c: bipush 1
      // 1d: iadd
      // 1e: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 21: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 26: aload 2
      // 27: ifnonnull 4e
      // 2a: aload 2
      // 2b: ifnonnull 4e
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: ifne 4d
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: iinc 4 1
      // 42: aload 2
      // 43: ifnull 09
      // 46: goto 4d
      // 49: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: iload 3
      // 4e: ifle 8f
      // 51: getstatic com/finalshell/core/NE.Y Ljava/util/List;
      // 54: aload 0
      // 55: iload 3
      // 56: bipush 1
      // 57: isub
      // 58: iload 3
      // 59: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 5c: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 61: aload 2
      // 62: ifnonnull 90
      // 65: goto 6c
      // 68: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: aload 2
      // 6d: ifnonnull 90
      // 70: goto 77
      // 73: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 76: athrow
      // 77: ifne 8f
      // 7a: goto 81
      // 7d: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80: athrow
      // 81: iinc 3 -1
      // 84: aload 2
      // 85: ifnull 4d
      // 88: goto 8f
      // 8b: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8e: athrow
      // 8f: iload 3
      // 90: iload 4
      // 92: if_icmpne 9d
      // 95: aconst_null
      // 96: goto a4
      // 99: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9c: athrow
      // 9d: aload 0
      // 9e: iload 3
      // 9f: iload 4
      // a1: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // a4: areturn
   }

   public static int a(String param0, int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: iload 1
      // 04: istore 3
      // 05: astore 2
      // 06: iload 3
      // 07: ifle 41
      // 0a: getstatic com/finalshell/core/NE.Y Ljava/util/List;
      // 0d: aload 0
      // 0e: iload 3
      // 0f: bipush 1
      // 10: isub
      // 11: iload 3
      // 12: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 15: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 1a: aload 2
      // 1b: ifnonnull 42
      // 1e: aload 2
      // 1f: ifnonnull 42
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: ifne 41
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: iinc 3 -1
      // 36: aload 2
      // 37: ifnull 06
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: iload 3
      // 42: ireturn
   }

   public static int S(String param0, int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: iload 1
      // 04: istore 3
      // 05: astore 2
      // 06: iload 3
      // 07: aload 0
      // 08: invokevirtual java/lang/String.length ()I
      // 0b: bipush 1
      // 0c: isub
      // 0d: if_icmpge 47
      // 10: getstatic com/finalshell/core/NE.Y Ljava/util/List;
      // 13: aload 0
      // 14: iload 3
      // 15: iload 3
      // 16: bipush 1
      // 17: iadd
      // 18: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1b: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 20: aload 2
      // 21: ifnonnull 48
      // 24: aload 2
      // 25: ifnonnull 48
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: ifne 47
      // 32: goto 39
      // 35: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: iinc 3 1
      // 3c: aload 2
      // 3d: ifnull 06
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: iload 3
      // 48: ireturn
   }

   public static String c(String var0, int var1) {
      String var10000 = FV_2.D();
      int var3 = 0;
      int var7 = 0;
      String var2 = var10000;

      while (true) {
         if (var3 < var1) {
            try {
               var10000 = var0;
               if (var2 != null) {
                  break;
               }

               if (var2 != null) {
                  return var0;
               }
            } catch (Gs2 var6) {
               throw a(var6);
            }

            var7 = var10000.indexOf("\n", var7);

            try {
               if (var7 != -1) {
                  var7++;
                  var3++;
                  if (var2 == null) {
                     continue;
                  }
               }
            } catch (Gs2 var5) {
               throw a(var5);
            }

            return "";
         }

         var10000 = var0.substring(var7);
         break;
      }

      return var10000;
   }

   public static List q(String var0, String var1) {
      return Arrays.asList(var0.split(var1));
   }

   public static Point z(String var0) {
      return Y(var0, ",");
   }

   public static Point Y(String var0, String var1) {
      String[] var2 = var0.split(var1);

      try {
         if (var2.length == 2) {
            return new Point(Integer.parseInt(var2[0].trim()), Integer.parseInt(var2[1].trim()));
         }
      } catch (Gs2 var3) {
         throw a(var3);
      }

      return null;
   }

   public static String H(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual java/lang/String.length ()I
      // 04: istore 2
      // 05: iload 2
      // 06: newarray 5
      // 08: astore 3
      // 09: aload 0
      // 0a: bipush 0
      // 0b: iload 2
      // 0c: aload 3
      // 0d: bipush 0
      // 0e: invokevirtual java/lang/String.getChars (II[CI)V
      // 11: bipush 0
      // 12: istore 4
      // 14: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 17: bipush 0
      // 18: istore 5
      // 1a: astore 1
      // 1b: iload 5
      // 1d: iload 2
      // 1e: if_icmpge 57
      // 21: aload 3
      // 22: iload 5
      // 24: caload
      // 25: istore 6
      // 27: aload 1
      // 28: ifnonnull 53
      // 2b: iload 6
      // 2d: sipush 19080
      // 30: ldc2_w 5903540064681723344
      // 33: invokestatic com/finalshell/core/NE.a (IJ)I
      // 36: if_icmplt 50
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: aload 3
      // 41: iload 4
      // 43: iload 6
      // 45: castore
      // 46: iinc 4 1
      // 49: goto 50
      // 4c: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: iinc 5 1
      // 53: aload 1
      // 54: ifnull 1b
      // 57: aload 0
      // 58: areturn
   }

   public static String w(String param0, int param1, boolean param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 3
      // 04: aload 0
      // 05: aload 3
      // 06: ifnonnull 1f
      // 09: invokevirtual java/lang/String.length ()I
      // 0c: iload 1
      // 0d: if_icmpgt 22
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: aload 0
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: goto 8f
      // 22: new java/lang/StringBuilder
      // 25: dup
      // 26: invokespecial java/lang/StringBuilder.<init> ()V
      // 29: aload 0
      // 2a: bipush 0
      // 2b: iload 1
      // 2c: aload 3
      // 2d: ifnonnull 43
      // 30: bipush 3
      // 31: if_icmple 5e
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: iload 2
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: aload 3
      // 44: ifnonnull 5b
      // 47: ifeq 5e
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: iload 1
      // 52: bipush 3
      // 53: isub
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: goto 5f
      // 5e: iload 1
      // 5f: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 62: aload 3
      // 63: ifnonnull 84
      // 66: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 69: iload 2
      // 6a: ifeq 87
      // 6d: goto 74
      // 70: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 73: athrow
      // 74: sipush 31692
      // 77: sipush 6411
      // 7a: invokestatic com/finalshell/core/NE.a (II)Ljava/lang/String;
      // 7d: goto 84
      // 80: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 83: athrow
      // 84: goto 89
      // 87: ldc ""
      // 89: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8f: areturn
   }

   public static String O(String param0, int param1, boolean param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 3
      // 04: aload 0
      // 05: aload 3
      // 06: ifnonnull 1f
      // 09: invokevirtual java/lang/String.length ()I
      // 0c: iload 1
      // 0d: if_icmpgt 22
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: aload 0
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: goto 85
      // 22: new java/lang/StringBuilder
      // 25: dup
      // 26: invokespecial java/lang/StringBuilder.<init> ()V
      // 29: iload 2
      // 2a: ifeq 3d
      // 2d: sipush 31688
      // 30: sipush -6818
      // 33: invokestatic com/finalshell/core/NE.a (II)Ljava/lang/String;
      // 36: goto 3f
      // 39: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: ldc ""
      // 3f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 42: aload 0
      // 43: aload 0
      // 44: invokevirtual java/lang/String.length ()I
      // 47: iload 1
      // 48: aload 3
      // 49: ifnonnull 5f
      // 4c: bipush 3
      // 4d: if_icmple 7a
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: iload 2
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: aload 3
      // 60: ifnonnull 77
      // 63: ifeq 7a
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: iload 1
      // 6e: bipush 3
      // 6f: isub
      // 70: goto 77
      // 73: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 76: athrow
      // 77: goto 7b
      // 7a: iload 1
      // 7b: isub
      // 7c: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 7f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 82: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 85: areturn
   }

   public static List D(String var0, String var1) {
      String var10000 = FV_2.D();
      ArrayList var3 = new ArrayList();
      String var2 = var10000;
      if (var0 != null) {
         StringTokenizer var4 = new StringTokenizer(var0, var1, false);

         while (var4.hasMoreTokens()) {
            try {
               if (var2 != null) {
                  return var3;
               }

               var3.add(var4.nextToken().trim());
               if (var2 != null) {
                  break;
               }
            } catch (Gs2 var5) {
               throw a(var5);
            }
         }
      }

      return var3;
   }

   public static List x(String var0, String var1) {
      String var6;
      ArrayList var8;
      String var10000 = FV_2.D();
      List var3 = D(var0, var1);
      String var2 = var10000;
      if (var3 == null) {
         return null;
      } else {
         ArrayList var4 = new ArrayList(var3.size());
         Iterator var5 = var3.iterator();

         while (true) {
            if (var5.hasNext()) {
               var6 = (String)var5.next();

               try {
                  var8 = var4;
                  if (var2 != null) {
                     break;
                  }

                  var4.add(Integer.parseInt(var6));
                  if (var2 == null) {
                     continue;
                  }
               } catch (Gs2 var7) {
                  throw a(var7);
               }
            }

            var8 = var4;
            break;
         }

         return var8;
      }
   }

   public static String I(List var0, String var1) {
      return b(var0, var1, J);
   }

   public static String b(List var0, String var1, C82 var2) {
      return y(var0, var1, var2, null);
   }

   public static String y(List param0, String param1, C82 param2, On2 param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 4
      // 05: aload 0
      // 06: aload 4
      // 08: ifnonnull 16
      // 0b: ifnull a7
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: aload 0
      // 16: invokeinterface java/util/List.size ()I 1
      // 1b: ifle a7
      // 1e: new java/lang/StringBuilder
      // 21: dup
      // 22: invokespecial java/lang/StringBuilder.<init> ()V
      // 25: astore 5
      // 27: bipush 0
      // 28: istore 6
      // 2a: aload 0
      // 2b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 30: astore 7
      // 32: aload 7
      // 34: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 39: ifeq a1
      // 3c: aload 7
      // 3e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 43: astore 8
      // 45: aload 3
      // 46: aload 4
      // 48: ifnonnull 56
      // 4b: ifnull 6c
      // 4e: goto 55
      // 51: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: aload 3
      // 56: aload 8
      // 58: invokeinterface com/finalshell/core/On2.n (Ljava/lang/Object;)Z 2
      // 5d: aload 4
      // 5f: ifnonnull 6e
      // 62: ifeq 9c
      // 65: goto 6c
      // 68: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: iload 6
      // 6e: aload 4
      // 70: ifnonnull 9a
      // 73: ifeq 8b
      // 76: goto 7d
      // 79: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7c: athrow
      // 7d: aload 5
      // 7f: aload 1
      // 80: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 83: pop
      // 84: goto 8b
      // 87: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8a: athrow
      // 8b: aload 5
      // 8d: aload 2
      // 8e: aload 8
      // 90: invokeinterface com/finalshell/core/C82.C (Ljava/lang/Object;)Ljava/lang/String; 2
      // 95: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 98: pop
      // 99: bipush 1
      // 9a: istore 6
      // 9c: aload 4
      // 9e: ifnull 32
      // a1: aload 5
      // a3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a6: areturn
      // a7: aconst_null
      // a8: areturn
   }

   public static String M(List param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 14
      // 09: ifnull 82
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: invokeinterface java/util/List.size ()I 1
      // 19: aload 1
      // 1a: ifnonnull 36
      // 1d: ifle 82
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: aload 0
      // 28: invokeinterface java/util/List.size ()I 1
      // 2d: bipush 1
      // 2e: isub
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: istore 2
      // 37: new java/lang/StringBuilder
      // 3a: dup
      // 3b: invokespecial java/lang/StringBuilder.<init> ()V
      // 3e: astore 3
      // 3f: bipush 0
      // 40: istore 4
      // 42: iload 4
      // 44: iload 2
      // 45: if_icmpgt 7d
      // 48: aload 3
      // 49: aload 0
      // 4a: iload 4
      // 4c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 51: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 54: pop
      // 55: aload 3
      // 56: aload 1
      // 57: ifnonnull 7e
      // 5a: iload 4
      // 5c: iload 2
      // 5d: if_icmpeq 70
      // 60: goto 67
      // 63: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 66: athrow
      // 67: ldc ","
      // 69: goto 72
      // 6c: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: ldc ""
      // 72: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 75: pop
      // 76: iinc 4 1
      // 79: aload 1
      // 7a: ifnull 42
      // 7d: aload 3
      // 7e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 81: areturn
      // 82: aconst_null
      // 83: areturn
   }

   public static List e(String var0, java.lang.Class var1) {
      String var2 = FV_2.D();
      if (var0 != null) {
         StringTokenizer var4 = new StringTokenizer(var0, ",", false);
         ArrayList var3 = new ArrayList();

         while (var4.hasMoreTokens()) {
            try {
               var3.add(Enum.valueOf(var1, var4.nextToken().trim()));
               if (var2 != null) {
                  return var3;
               }

               if (var2 != null) {
                  break;
               }
            } catch (Gs2 var5) {
               throw a(var5);
            }
         }

         if (var2 == null) {
            return var3;
         }
      }

      return new ArrayList(0);
   }

   public static String T(String param0, String[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnonnull 14
      // 09: ifnull 94
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 1
      // 14: arraylength
      // 15: ifle 94
      // 18: new java/lang/StringBuilder
      // 1b: dup
      // 1c: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f: astore 3
      // 20: bipush 0
      // 21: istore 4
      // 23: aload 1
      // 24: astore 5
      // 26: aload 5
      // 28: arraylength
      // 29: istore 6
      // 2b: bipush 0
      // 2c: istore 7
      // 2e: iload 7
      // 30: iload 6
      // 32: if_icmpge 8f
      // 35: aload 5
      // 37: iload 7
      // 39: aaload
      // 3a: astore 8
      // 3c: aload 2
      // 3d: ifnonnull 8b
      // 40: aload 8
      // 42: aload 2
      // 43: ifnonnull 93
      // 46: goto 4d
      // 49: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: invokestatic com/finalshell/core/NE.B (Ljava/lang/String;)Z
      // 50: ifne 88
      // 53: goto 5a
      // 56: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: iload 4
      // 5c: aload 2
      // 5d: ifnonnull 86
      // 60: goto 67
      // 63: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 66: athrow
      // 67: ifeq 7e
      // 6a: goto 71
      // 6d: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 70: athrow
      // 71: aload 3
      // 72: aload 0
      // 73: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 76: pop
      // 77: goto 7e
      // 7a: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7d: athrow
      // 7e: aload 3
      // 7f: aload 8
      // 81: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 84: pop
      // 85: bipush 1
      // 86: istore 4
      // 88: iinc 7 1
      // 8b: aload 2
      // 8c: ifnull 2e
      // 8f: aload 3
      // 90: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 93: areturn
      // 94: ldc ""
      // 96: areturn
   }

   public static boolean B(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 1e
      // 09: ifnull 2f
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: invokevirtual java/lang/String.isEmpty ()Z
      // 21: aload 1
      // 22: ifnonnull 30
      // 25: ifeq 33
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   public static String O(String var0, int var1) {
      StringBuilder var6;
      String var10000 = FV_2.D();
      StringBuilder var3 = new StringBuilder(var1);
      String var2 = var10000;

      while (true) {
         if (var1-- > 0) {
            try {
               var6 = var3.append(var0);
               if (var2 != null) {
                  break;
               }

               if (var2 == null) {
                  continue;
               }
            } catch (Gs2 var4) {
               throw a(var4);
            }
         }

         var6 = var3;
         break;
      }

      return var6.toString();
   }

   public static String p(String param0, boolean param1, String param2, C82 param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: astore 4
      // 005: iload 1
      // 006: ifeq 014
      // 009: aload 2
      // 00a: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 00d: goto 015
      // 010: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 013: athrow
      // 014: aload 2
      // 015: astore 5
      // 017: bipush 0
      // 018: istore 6
      // 01a: bipush 0
      // 01b: istore 7
      // 01d: new java/lang/StringBuilder
      // 020: dup
      // 021: aload 0
      // 022: invokevirtual java/lang/String.length ()I
      // 025: invokespecial java/lang/StringBuilder.<init> (I)V
      // 028: astore 8
      // 02a: bipush 0
      // 02b: istore 9
      // 02d: iload 9
      // 02f: aload 0
      // 030: invokevirtual java/lang/String.length ()I
      // 033: if_icmpge 14d
      // 036: aload 0
      // 037: iload 9
      // 039: invokevirtual java/lang/String.charAt (I)C
      // 03c: istore 10
      // 03e: aload 5
      // 040: aload 4
      // 042: ifnonnull 152
      // 045: iload 6
      // 047: invokevirtual java/lang/String.charAt (I)C
      // 04a: iload 1
      // 04b: aload 4
      // 04d: ifnonnull 06d
      // 050: goto 057
      // 053: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 056: athrow
      // 057: ifeq 070
      // 05a: goto 061
      // 05d: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 060: athrow
      // 061: iload 10
      // 063: invokestatic java/lang/Character.toLowerCase (C)C
      // 066: goto 06d
      // 069: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06c: athrow
      // 06d: goto 072
      // 070: iload 10
      // 072: if_icmpne 084
      // 075: iinc 6 1
      // 078: aload 4
      // 07a: ifnull 0c0
      // 07d: goto 084
      // 080: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 083: athrow
      // 084: aload 5
      // 086: bipush 0
      // 087: invokevirtual java/lang/String.charAt (I)C
      // 08a: iload 1
      // 08b: aload 4
      // 08d: ifnonnull 0ad
      // 090: goto 097
      // 093: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 096: athrow
      // 097: ifeq 0b0
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a0: athrow
      // 0a1: iload 10
      // 0a3: invokestatic java/lang/Character.toLowerCase (C)C
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ac: athrow
      // 0ad: goto 0b2
      // 0b0: iload 10
      // 0b2: if_icmpne 0bd
      // 0b5: bipush 1
      // 0b6: istore 6
      // 0b8: aload 4
      // 0ba: ifnull 0c0
      // 0bd: bipush 0
      // 0be: istore 6
      // 0c0: iload 6
      // 0c2: aload 5
      // 0c4: invokevirtual java/lang/String.length ()I
      // 0c7: aload 4
      // 0c9: ifnonnull 12f
      // 0cc: if_icmpne 120
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: iload 9
      // 0d8: aload 5
      // 0da: invokevirtual java/lang/String.length ()I
      // 0dd: isub
      // 0de: bipush 1
      // 0df: iadd
      // 0e0: istore 11
      // 0e2: aload 0
      // 0e3: iload 11
      // 0e5: iload 11
      // 0e7: aload 5
      // 0e9: invokevirtual java/lang/String.length ()I
      // 0ec: iadd
      // 0ed: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0f0: astore 12
      // 0f2: aload 8
      // 0f4: aload 0
      // 0f5: iload 7
      // 0f7: iload 11
      // 0f9: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ff: pop
      // 100: aload 8
      // 102: aload 3
      // 103: aload 12
      // 105: invokeinterface com/finalshell/core/C82.C (Ljava/lang/Object;)Ljava/lang/String; 2
      // 10a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10d: pop
      // 10e: iload 11
      // 110: aload 5
      // 112: invokevirtual java/lang/String.length ()I
      // 115: iadd
      // 116: istore 7
      // 118: bipush 0
      // 119: istore 6
      // 11b: aload 4
      // 11d: ifnull 145
      // 120: iload 9
      // 122: aload 0
      // 123: invokevirtual java/lang/String.length ()I
      // 126: bipush 1
      // 127: isub
      // 128: goto 12f
      // 12b: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12e: athrow
      // 12f: if_icmpne 145
      // 132: aload 8
      // 134: aload 0
      // 135: iload 7
      // 137: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 13a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13d: pop
      // 13e: goto 145
      // 141: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 144: athrow
      // 145: iinc 9 1
      // 148: aload 4
      // 14a: ifnull 02d
      // 14d: aload 8
      // 14f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 152: areturn
   }

   public static String K() {
      return N(null, null);
   }

   public static String E(String var0) {
      return N(var0, null);
   }

   public static String N(String var0, String var1) {
      StringBuilder var10000;
      String var10001;
      label28: {
         try {
            var10000 = new StringBuilder();
            if (var0 == null) {
               var10001 = a(31693, -28255);
               break label28;
            }
         } catch (Gs2 var3) {
            throw a(var3);
         }

         var10001 = var0;
      }

      try {
         var10000 = var10000.append(var10001).append("-").append(A(5)).append("-").append(A(5)).append("-").append(A(5)).append("-").append(A(5)).append("-");
         if (var1 == null) {
            return var10000.append(a(31680, -31658)).toString();
         }
      } catch (Gs2 var2) {
         throw a(var2);
      }

      return var10000.append(var1).toString();
   }

   public static String A(int var0) {
      StringBuilder var1 = new StringBuilder(var0);

      for (int var2 = 0; var2 < var0; var2++) {
         int var3 = 0;
         int var4 = a(5743, 5231743944052136253L);
         switch (Gw2.K(3)) {
            case 0:
               var3 = a(1950, 2084992801086359774L);
               var4 = a(30480, 8967552325923223633L);
               break;
            case 1:
               var3 = a(26286, 1483589171460844013L);
               var4 = a(14965, 4298132566287447304L);
               break;
            case 2:
               var3 = a(22186, 7702298524846234083L);
               var4 = a(32067, 7659907886289760773L);
         }

         var1.append((char)(Gw2.K(var4) + var3));
      }

      return var1.toString();
   }

   public static long X(String param0) throws Gs2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: astore 1
      // 004: lconst_0
      // 005: lstore 2
      // 006: aload 0
      // 007: ldc_w " "
      // 00a: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 00d: astore 4
      // 00f: aload 4
      // 011: astore 5
      // 013: aload 5
      // 015: arraylength
      // 016: istore 6
      // 018: bipush 0
      // 019: istore 7
      // 01b: iload 7
      // 01d: iload 6
      // 01f: if_icmpge 113
      // 022: aload 5
      // 024: iload 7
      // 026: aaload
      // 027: astore 8
      // 029: bipush 0
      // 02a: istore 9
      // 02c: iload 9
      // 02e: aload 8
      // 030: invokevirtual java/lang/String.length ()I
      // 033: if_icmpge 10c
      // 036: aload 8
      // 038: iload 9
      // 03a: invokevirtual java/lang/String.charAt (I)C
      // 03d: invokestatic java/lang/Character.isDigit (C)Z
      // 040: aload 1
      // 041: ifnonnull 01d
      // 044: aload 1
      // 045: ifnonnull 064
      // 048: ifne 0fe
      // 04b: goto 052
      // 04e: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 051: athrow
      // 052: aload 8
      // 054: bipush 0
      // 055: iload 9
      // 057: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 05a: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 05d: goto 064
      // 060: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 063: athrow
      // 064: istore 10
      // 066: aload 8
      // 068: iload 9
      // 06a: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 06d: invokestatic com/finalshell/ui/model/Ew2.valueOf (Ljava/lang/String;)Lcom/finalshell/ui/model/Ew2;
      // 070: astore 11
      // 072: aload 1
      // 073: ifnonnull 0b4
      // 076: getstatic com/finalshell/core/BB.h [I
      // 079: aload 11
      // 07b: invokevirtual com/finalshell/ui/model/Ew2.ordinal ()I
      // 07e: iaload
      // 07f: tableswitch 123 1 5 37 57 77 97 117
      // 0a0: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a3: athrow
      // 0a4: lload 2
      // 0a5: iload 10
      // 0a7: sipush 2922
      // 0aa: ldc2_w 6145140762777633855
      // 0ad: invokestatic com/finalshell/core/NE.a (IJ)I
      // 0b0: imul
      // 0b1: i2l
      // 0b2: ladd
      // 0b3: lstore 2
      // 0b4: aload 1
      // 0b5: ifnull 0fa
      // 0b8: lload 2
      // 0b9: iload 10
      // 0bb: sipush 28786
      // 0be: ldc2_w 5025365775197978413
      // 0c1: invokestatic com/finalshell/core/NE.a (IJ)I
      // 0c4: imul
      // 0c5: i2l
      // 0c6: ladd
      // 0c7: lstore 2
      // 0c8: aload 1
      // 0c9: ifnull 0fa
      // 0cc: lload 2
      // 0cd: iload 10
      // 0cf: sipush 2407
      // 0d2: ldc2_w 1487887020360451645
      // 0d5: invokestatic com/finalshell/core/NE.a (IJ)I
      // 0d8: imul
      // 0d9: i2l
      // 0da: ladd
      // 0db: lstore 2
      // 0dc: aload 1
      // 0dd: ifnull 0fa
      // 0e0: lload 2
      // 0e1: iload 10
      // 0e3: sipush 5149
      // 0e6: ldc2_w 6519506872396634945
      // 0e9: invokestatic com/finalshell/core/NE.a (IJ)I
      // 0ec: imul
      // 0ed: i2l
      // 0ee: ladd
      // 0ef: lstore 2
      // 0f0: aload 1
      // 0f1: ifnull 0fa
      // 0f4: lload 2
      // 0f5: iload 10
      // 0f7: i2l
      // 0f8: ladd
      // 0f9: lstore 2
      // 0fa: aload 1
      // 0fb: ifnull 10c
      // 0fe: iinc 9 1
      // 101: aload 1
      // 102: ifnull 02c
      // 105: goto 10c
      // 108: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10b: athrow
      // 10c: iinc 7 1
      // 10f: aload 1
      // 110: ifnull 01b
      // 113: lload 2
      // 114: lreturn
      // 115: astore 2
      // 116: new com/finalshell/core/Gs2
      // 119: dup
      // 11a: aload 2
      // 11b: invokespecial com/finalshell/core/Gs2.<init> (Ljava/lang/Throwable;)V
      // 11e: athrow
   }

   public static String I(long param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: astore 2
      // 004: lload 0
      // 005: aload 2
      // 006: ifnonnull 03c
      // 009: lconst_0
      // 00a: lcmp
      // 00b: ifgt 03b
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: new java/lang/IllegalArgumentException
      // 018: dup
      // 019: new java/lang/StringBuilder
      // 01c: dup
      // 01d: invokespecial java/lang/StringBuilder.<init> ()V
      // 020: sipush 31690
      // 023: sipush -14835
      // 026: invokestatic com/finalshell/core/NE.a (II)Ljava/lang/String;
      // 029: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02c: lload 0
      // 02d: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 030: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 033: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 036: athrow
      // 037: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03a: athrow
      // 03b: lload 0
      // 03c: lstore 3
      // 03d: lload 3
      // 03e: sipush 16603
      // 041: ldc2_w 5998727064005925846
      // 044: invokestatic com/finalshell/core/NE.b (IJ)J
      // 047: ldiv
      // 048: lstore 5
      // 04a: lload 3
      // 04b: lload 5
      // 04d: sipush 27599
      // 050: ldc2_w 4585332697408663749
      // 053: invokestatic com/finalshell/core/NE.b (IJ)J
      // 056: lmul
      // 057: lsub
      // 058: lstore 3
      // 059: lload 3
      // 05a: sipush 19248
      // 05d: ldc2_w 3053120762270896190
      // 060: invokestatic com/finalshell/core/NE.b (IJ)J
      // 063: ldiv
      // 064: lstore 7
      // 066: lload 3
      // 067: lload 7
      // 069: sipush 15343
      // 06c: ldc2_w 3760001400025719015
      // 06f: invokestatic com/finalshell/core/NE.b (IJ)J
      // 072: lmul
      // 073: lsub
      // 074: lstore 3
      // 075: lload 3
      // 076: sipush 17043
      // 079: ldc2_w 1219532866820069788
      // 07c: invokestatic com/finalshell/core/NE.b (IJ)J
      // 07f: ldiv
      // 080: lstore 9
      // 082: lload 3
      // 083: lload 9
      // 085: sipush 25636
      // 088: ldc2_w 8829180914353504040
      // 08b: invokestatic com/finalshell/core/NE.b (IJ)J
      // 08e: lmul
      // 08f: lsub
      // 090: lstore 3
      // 091: lload 3
      // 092: sipush 783
      // 095: ldc2_w 3994517412131510278
      // 098: invokestatic com/finalshell/core/NE.b (IJ)J
      // 09b: ldiv
      // 09c: lstore 11
      // 09e: lload 3
      // 09f: lload 11
      // 0a1: sipush 5673
      // 0a4: ldc2_w 4399696765851733282
      // 0a7: invokestatic com/finalshell/core/NE.b (IJ)J
      // 0aa: lmul
      // 0ab: lsub
      // 0ac: lstore 3
      // 0ad: lload 3
      // 0ae: lstore 13
      // 0b0: new java/lang/StringBuilder
      // 0b3: dup
      // 0b4: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b7: lload 5
      // 0b9: lconst_0
      // 0ba: lcmp
      // 0bb: ifle 0e0
      // 0be: new java/lang/StringBuilder
      // 0c1: dup
      // 0c2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c5: lload 5
      // 0c7: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 0ca: sipush 31694
      // 0cd: sipush 6112
      // 0d0: invokestatic com/finalshell/core/NE.a (II)Ljava/lang/String;
      // 0d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d9: goto 0e2
      // 0dc: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0df: athrow
      // 0e0: ldc ""
      // 0e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e5: lload 7
      // 0e7: lconst_0
      // 0e8: lcmp
      // 0e9: ifle 10e
      // 0ec: new java/lang/StringBuilder
      // 0ef: dup
      // 0f0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f3: lload 7
      // 0f5: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 0f8: sipush 31691
      // 0fb: sipush 12340
      // 0fe: invokestatic com/finalshell/core/NE.a (II)Ljava/lang/String;
      // 101: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 104: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 107: goto 110
      // 10a: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10d: athrow
      // 10e: ldc ""
      // 110: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 113: lload 9
      // 115: lconst_0
      // 116: lcmp
      // 117: ifle 13c
      // 11a: new java/lang/StringBuilder
      // 11d: dup
      // 11e: invokespecial java/lang/StringBuilder.<init> ()V
      // 121: lload 9
      // 123: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 126: sipush 31695
      // 129: sipush 17542
      // 12c: invokestatic com/finalshell/core/NE.a (II)Ljava/lang/String;
      // 12f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 132: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 135: goto 13e
      // 138: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13b: athrow
      // 13c: ldc ""
      // 13e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 141: lload 11
      // 143: lconst_0
      // 144: lcmp
      // 145: ifle 16a
      // 148: new java/lang/StringBuilder
      // 14b: dup
      // 14c: invokespecial java/lang/StringBuilder.<init> ()V
      // 14f: lload 11
      // 151: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 154: sipush 31682
      // 157: sipush 5473
      // 15a: invokestatic com/finalshell/core/NE.a (II)Ljava/lang/String;
      // 15d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 160: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 163: goto 16c
      // 166: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 169: athrow
      // 16a: ldc ""
      // 16c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16f: lload 13
      // 171: lconst_0
      // 172: lcmp
      // 173: ifle 198
      // 176: new java/lang/StringBuilder
      // 179: dup
      // 17a: invokespecial java/lang/StringBuilder.<init> ()V
      // 17d: lload 13
      // 17f: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 182: sipush 31689
      // 185: sipush 1876
      // 188: invokestatic com/finalshell/core/NE.a (II)Ljava/lang/String;
      // 18b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 191: goto 19a
      // 194: invokestatic com/finalshell/core/NE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 197: athrow
      // 198: ldc ""
      // 19a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a0: astore 15
      // 1a2: aload 15
      // 1a4: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 1a7: areturn
   }

   static {
      __vfClinit__();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var6;
      int var8;
      int var2 = (var0 ^ 31690) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 15;
               break;
            case 1:
               var10000 = 155;
               break;
            case 2:
               var10000 = 240;
               break;
            case 3:
               var10000 = 153;
               break;
            case 4:
               var10000 = 63;
               break;
            case 5:
               var10000 = 215;
               break;
            case 6:
               var10000 = 233;
               break;
            case 7:
               var10000 = 71;
               break;
            case 8:
               var10000 = 99;
               break;
            case 9:
               var10000 = 64;
               break;
            case 10:
               var10000 = 17;
               break;
            case 11:
               var10000 = 158;
               break;
            case 12:
               var10000 = 90;
               break;
            case 13:
               var10000 = 236;
               break;
            case 14:
               var10000 = 38;
               break;
            case 15:
               var10000 = 254;
               break;
            case 16:
               var10000 = 250;
               break;
            case 17:
               var10000 = 107;
               break;
            case 18:
               var10000 = 218;
               break;
            case 19:
               var10000 = 34;
               break;
            case 20:
               var10000 = 103;
               break;
            case 21:
               var10000 = 58;
               break;
            case 22:
               var10000 = 45;
               break;
            case 23:
               var10000 = 95;
               break;
            case 24:
               var10000 = 57;
               break;
            case 25:
               var10000 = 220;
               break;
            case 26:
               var10000 = 93;
               break;
            case 27:
               var10000 = 14;
               break;
            case 28:
               var10000 = 0;
               break;
            case 29:
               var10000 = 159;
               break;
            case 30:
               var10000 = 143;
               break;
            case 31:
               var10000 = 195;
               break;
            case 32:
               var10000 = 53;
               break;
            case 33:
               var10000 = 31;
               break;
            case 34:
               var10000 = 227;
               break;
            case 35:
               var10000 = 139;
               break;
            case 36:
               var10000 = 112;
               break;
            case 37:
               var10000 = 52;
               break;
            case 38:
               var10000 = 48;
               break;
            case 39:
               var10000 = 252;
               break;
            case 40:
               var10000 = 16;
               break;
            case 41:
               var10000 = 154;
               break;
            case 42:
               var10000 = 74;
               break;
            case 43:
               var10000 = 243;
               break;
            case 44:
               var10000 = 136;
               break;
            case 45:
               var10000 = 237;
               break;
            case 46:
               var10000 = 133;
               break;
            case 47:
               var10000 = 30;
               break;
            case 48:
               var10000 = 85;
               break;
            case 49:
               var10000 = 162;
               break;
            case 50:
               var10000 = 208;
               break;
            case 51:
               var10000 = 223;
               break;
            case 52:
               var10000 = 246;
               break;
            case 53:
               var10000 = 161;
               break;
            case 54:
               var10000 = 152;
               break;
            case 55:
               var10000 = 67;
               break;
            case 56:
               var10000 = 116;
               break;
            case 57:
               var10000 = 3;
               break;
            case 58:
               var10000 = 178;
               break;
            case 59:
               var10000 = 91;
               break;
            case 60:
               var10000 = 156;
               break;
            case 61:
               var10000 = 70;
               break;
            case 62:
               var10000 = 35;
               break;
            case 63:
               var10000 = 92;
               break;
            case 64:
               var10000 = 65;
               break;
            case 65:
               var10000 = 1;
               break;
            case 66:
               var10000 = 142;
               break;
            case 67:
               var10000 = 216;
               break;
            case 68:
               var10000 = 97;
               break;
            case 69:
               var10000 = 211;
               break;
            case 70:
               var10000 = 187;
               break;
            case 71:
               var10000 = 135;
               break;
            case 72:
               var10000 = 206;
               break;
            case 73:
               var10000 = 222;
               break;
            case 74:
               var10000 = 83;
               break;
            case 75:
               var10000 = 255;
               break;
            case 76:
               var10000 = 41;
               break;
            case 77:
               var10000 = 94;
               break;
            case 78:
               var10000 = 245;
               break;
            case 79:
               var10000 = 194;
               break;
            case 80:
               var10000 = 244;
               break;
            case 81:
               var10000 = 229;
               break;
            case 82:
               var10000 = 81;
               break;
            case 83:
               var10000 = 247;
               break;
            case 84:
               var10000 = 167;
               break;
            case 85:
               var10000 = 210;
               break;
            case 86:
               var10000 = 82;
               break;
            case 87:
               var10000 = 200;
               break;
            case 88:
               var10000 = 62;
               break;
            case 89:
               var10000 = 177;
               break;
            case 90:
               var10000 = 32;
               break;
            case 91:
               var10000 = 37;
               break;
            case 92:
               var10000 = 219;
               break;
            case 93:
               var10000 = 36;
               break;
            case 94:
               var10000 = 131;
               break;
            case 95:
               var10000 = 242;
               break;
            case 96:
               var10000 = 89;
               break;
            case 97:
               var10000 = 46;
               break;
            case 98:
               var10000 = 23;
               break;
            case 99:
               var10000 = 196;
               break;
            case 100:
               var10000 = 61;
               break;
            case 101:
               var10000 = 140;
               break;
            case 102:
               var10000 = 183;
               break;
            case 103:
               var10000 = 115;
               break;
            case 104:
               var10000 = 122;
               break;
            case 105:
               var10000 = 198;
               break;
            case 106:
               var10000 = 42;
               break;
            case 107:
               var10000 = 164;
               break;
            case 108:
               var10000 = 134;
               break;
            case 109:
               var10000 = 173;
               break;
            case 110:
               var10000 = 231;
               break;
            case 111:
               var10000 = 113;
               break;
            case 112:
               var10000 = 29;
               break;
            case 113:
               var10000 = 150;
               break;
            case 114:
               var10000 = 172;
               break;
            case 115:
               var10000 = 76;
               break;
            case 116:
               var10000 = 180;
               break;
            case 117:
               var10000 = 225;
               break;
            case 118:
               var10000 = 55;
               break;
            case 119:
               var10000 = 4;
               break;
            case 120:
               var10000 = 197;
               break;
            case 121:
               var10000 = 204;
               break;
            case 122:
               var10000 = 10;
               break;
            case 123:
               var10000 = 117;
               break;
            case 124:
               var10000 = 185;
               break;
            case 125:
               var10000 = 9;
               break;
            case 126:
               var10000 = 230;
               break;
            case 127:
               var10000 = 119;
               break;
            case 128:
               var10000 = 66;
               break;
            case 129:
               var10000 = 123;
               break;
            case 130:
               var10000 = 234;
               break;
            case 131:
               var10000 = 221;
               break;
            case 132:
               var10000 = 102;
               break;
            case 133:
               var10000 = 145;
               break;
            case 134:
               var10000 = 203;
               break;
            case 135:
               var10000 = 8;
               break;
            case 136:
               var10000 = 238;
               break;
            case 137:
               var10000 = 199;
               break;
            case 138:
               var10000 = 169;
               break;
            case 139:
               var10000 = 253;
               break;
            case 140:
               var10000 = 51;
               break;
            case 141:
               var10000 = 49;
               break;
            case 142:
               var10000 = 241;
               break;
            case 143:
               var10000 = 56;
               break;
            case 144:
               var10000 = 126;
               break;
            case 145:
               var10000 = 124;
               break;
            case 146:
               var10000 = 193;
               break;
            case 147:
               var10000 = 144;
               break;
            case 148:
               var10000 = 217;
               break;
            case 149:
               var10000 = 40;
               break;
            case 150:
               var10000 = 157;
               break;
            case 151:
               var10000 = 120;
               break;
            case 152:
               var10000 = 86;
               break;
            case 153:
               var10000 = 182;
               break;
            case 154:
               var10000 = 60;
               break;
            case 155:
               var10000 = 43;
               break;
            case 156:
               var10000 = 106;
               break;
            case 157:
               var10000 = 175;
               break;
            case 158:
               var10000 = 163;
               break;
            case 159:
               var10000 = 13;
               break;
            case 160:
               var10000 = 235;
               break;
            case 161:
               var10000 = 73;
               break;
            case 162:
               var10000 = 22;
               break;
            case 163:
               var10000 = 184;
               break;
            case 164:
               var10000 = 239;
               break;
            case 165:
               var10000 = 181;
               break;
            case 166:
               var10000 = 192;
               break;
            case 167:
               var10000 = 101;
               break;
            case 168:
               var10000 = 25;
               break;
            case 169:
               var10000 = 20;
               break;
            case 170:
               var10000 = 138;
               break;
            case 171:
               var10000 = 109;
               break;
            case 172:
               var10000 = 21;
               break;
            case 173:
               var10000 = 149;
               break;
            case 174:
               var10000 = 24;
               break;
            case 175:
               var10000 = 232;
               break;
            case 176:
               var10000 = 59;
               break;
            case 177:
               var10000 = 87;
               break;
            case 178:
               var10000 = 26;
               break;
            case 179:
               var10000 = 7;
               break;
            case 180:
               var10000 = 121;
               break;
            case 181:
               var10000 = 176;
               break;
            case 182:
               var10000 = 47;
               break;
            case 183:
               var10000 = 27;
               break;
            case 184:
               var10000 = 28;
               break;
            case 185:
               var10000 = 54;
               break;
            case 186:
               var10000 = 96;
               break;
            case 187:
               var10000 = 110;
               break;
            case 188:
               var10000 = 105;
               break;
            case 189:
               var10000 = 205;
               break;
            case 190:
               var10000 = 179;
               break;
            case 191:
               var10000 = 75;
               break;
            case 192:
               var10000 = 165;
               break;
            case 193:
               var10000 = 79;
               break;
            case 194:
               var10000 = 151;
               break;
            case 195:
               var10000 = 114;
               break;
            case 196:
               var10000 = 171;
               break;
            case 197:
               var10000 = 104;
               break;
            case 198:
               var10000 = 111;
               break;
            case 199:
               var10000 = 72;
               break;
            case 200:
               var10000 = 174;
               break;
            case 201:
               var10000 = 77;
               break;
            case 202:
               var10000 = 141;
               break;
            case 203:
               var10000 = 68;
               break;
            case 204:
               var10000 = 137;
               break;
            case 205:
               var10000 = 78;
               break;
            case 206:
               var10000 = 148;
               break;
            case 207:
               var10000 = 146;
               break;
            case 208:
               var10000 = 118;
               break;
            case 209:
               var10000 = 130;
               break;
            case 210:
               var10000 = 226;
               break;
            case 211:
               var10000 = 251;
               break;
            case 212:
               var10000 = 18;
               break;
            case 213:
               var10000 = 160;
               break;
            case 214:
               var10000 = 88;
               break;
            case 215:
               var10000 = 84;
               break;
            case 216:
               var10000 = 147;
               break;
            case 217:
               var10000 = 190;
               break;
            case 218:
               var10000 = 213;
               break;
            case 219:
               var10000 = 39;
               break;
            case 220:
               var10000 = 224;
               break;
            case 221:
               var10000 = 11;
               break;
            case 222:
               var10000 = 98;
               break;
            case 223:
               var10000 = 127;
               break;
            case 224:
               var10000 = 125;
               break;
            case 225:
               var10000 = 44;
               break;
            case 226:
               var10000 = 209;
               break;
            case 227:
               var10000 = 249;
               break;
            case 228:
               var10000 = 5;
               break;
            case 229:
               var10000 = 19;
               break;
            case 230:
               var10000 = 214;
               break;
            case 231:
               var10000 = 212;
               break;
            case 232:
               var10000 = 6;
               break;
            case 233:
               var10000 = 132;
               break;
            case 234:
               var10000 = 100;
               break;
            case 235:
               var10000 = 202;
               break;
            case 236:
               var10000 = 186;
               break;
            case 237:
               var10000 = 168;
               break;
            case 238:
               var10000 = 201;
               break;
            case 239:
               var10000 = 129;
               break;
            case 240:
               var10000 = 170;
               break;
            case 241:
               var10000 = 2;
               break;
            case 242:
               var10000 = 189;
               break;
            case 243:
               var10000 = 188;
               break;
            case 244:
               var10000 = 80;
               break;
            case 245:
               var10000 = 128;
               break;
            case 246:
               var10000 = 248;
               break;
            case 247:
               var10000 = 166;
               break;
            case 248:
               var10000 = 33;
               break;
            case 249:
               var10000 = 69;
               break;
            case 250:
               var10000 = 207;
               break;
            case 251:
               var10000 = 108;
               break;
            case 252:
               var10000 = 50;
               break;
            case 253:
               var10000 = 191;
               break;
            case 254:
               var10000 = 228;
               break;
            default:
               var10000 = 12;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20318;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 6924) & 32767;
      if (f[var3] == null) {
         f[var3] = e[var3] ^ var1;
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var47;
      long[] var6;
      long var8;
      String[] var21 = new String[11];
      int var19 = 0;
      String var18 = "«LÙìÆ\u001a}¸\u007fìÌ\u001c¢Ô½\u0002ø¿\u0003%¡Û\u0003Y9q\u0002«³\u0002üø\u0003#\u001a\u001b\u0006$-á\u0087ZÐ\u0002]Q";
      int var20 = "«LÙìÆ\u001a}¸\u007fìÌ\u001c¢Ô½\u0002ø¿\u0003%¡Û\u0003Y9q\u0002«³\u0002üø\u0003#\u001a\u001b\u0006$-á\u0087ZÐ\u0002]Q".length();
      char var17 = 15;
      int var26 = -1;

      label88:
      while (true) {
         byte var10000 = 42;
         String var10001 = var18.substring(++var26, var26 + var17);
         byte var10002 = -1;

         while (true) {
            label83: {
               char[] var55 = var10001.toCharArray();
               int var10004 = var55.length;
               int var22 = 0;
               byte var58 = var10000;
               var47 = var55;
               int var35 = var10004;
               byte var67;
               char[] var75;
               int var10006;
               if (var10004 <= 1) {
                  var75 = var55;
                  var67 = var10000;
                  var10006 = var22;
               } else {
                  var58 = var10000;
                  var35 = var10004;
                  if (var10004 <= var22) {
                     break label83;
                  }

                  var75 = var55;
                  var67 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var84 = var75[var10006];
                  byte var85;
                  switch (var22 % 7) {
                     case 0:
                        var85 = 117;
                        break;
                     case 1:
                        var85 = 126;
                        break;
                     case 2:
                        var85 = 123;
                        break;
                     case 3:
                        var85 = 7;
                        break;
                     case 4:
                        var85 = 41;
                        break;
                     case 5:
                        var85 = 44;
                        break;
                     default:
                        var85 = 106;
                  }

                  var75[var10006] = (char)(var84 ^ var67 ^ var85);
                  var22++;
                  if (var58 == 0) {
                     var10006 = var58;
                     var75 = var47;
                     var67 = var58;
                  } else {
                     if (var35 <= var22) {
                        break;
                     }

                     var75 = var47;
                     var67 = var58;
                     var10006 = var22;
                  }
               }
            }

            String var60 = new String(var47).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var60;
                  if ((var26 += var17) >= var20) {
                     a = var21;
                     b = new String[11];
                     var8 = 8347981160931060230L;
                     long[] var14 = new long[37];
                     int var11 = 0;
                     String var12 = "2rÜ$¿Àé¯Úåò=áÐ»«\u0013U³\u008d\u008f\u0019²¯\u001a¡\u0093¶uR/¤×ëÔ\u007fJ\u008dÆ[\u00ad\u0006·×¿sÎo\u001fç\u0085ÊðVïöÚï\u008cÈ\u001c\\òÍ¡U\u0006«%¿ÔA^\bzV¿v\u0095oQ+i±çî7`\u0018\u0017z\u008eÉöò9\u008dl/P\u0005õ³1!ñ\u0084DøP\u0098\u0007X\u0086/:\u0094ÐAó\u00920þ7Øñbw\u008b\u0018´(\u0014G\u009d\u0007L\u0015,\u0003g2è\\\u00ad\u0011\u0091¡\u0007ÀV\u008a\u0081U _ö\u001b><£æ¶Y¬¥ &Z\u0094\u0082Vä\u0013\u0006Æ\u007fàß\u0002n6ò\u0092\u000e)®éÏ\u008bs¤\u0011Ð\u0003µ\u0096qX\u0019¬\u0096jÕ\u008fÒ(±ïÀ)\u0018\fÆí[9_\n:m¨øü\u009b¼¡\u009f\u009bA~Æ¼&z\u0002]xÃ\u008a\u008bÐ?Ø\u000b\r\"è\u0090 jëã\u0093R]õï\u008cÓÏÁ\u00ad\u00922\u0083l\u008eA§<\u008d\u0084ËÑ´¨°*V";
                     int var13 = "2rÜ$¿Àé¯Úåò=áÐ»«\u0013U³\u008d\u008f\u0019²¯\u001a¡\u0093¶uR/¤×ëÔ\u007fJ\u008dÆ[\u00ad\u0006·×¿sÎo\u001fç\u0085ÊðVïöÚï\u008cÈ\u001c\\òÍ¡U\u0006«%¿ÔA^\bzV¿v\u0095oQ+i±çî7`\u0018\u0017z\u008eÉöò9\u008dl/P\u0005õ³1!ñ\u0084DøP\u0098\u0007X\u0086/:\u0094ÐAó\u00920þ7Øñbw\u008b\u0018´(\u0014G\u009d\u0007L\u0015,\u0003g2è\\\u00ad\u0011\u0091¡\u0007ÀV\u008a\u0081U _ö\u001b><£æ¶Y¬¥ &Z\u0094\u0082Vä\u0013\u0006Æ\u007fàß\u0002n6ò\u0092\u000e)®éÏ\u008bs¤\u0011Ð\u0003µ\u0096qX\u0019¬\u0096jÕ\u008fÒ(±ïÀ)\u0018\fÆí[9_\n:m¨øü\u009b¼¡\u009f\u009bA~Æ¼&z\u0002]xÃ\u008a\u008bÐ?Ø\u000b\r\"è\u0090 jëã\u0093R]õï\u008cÓÏÁ\u00ad\u00922\u0083l\u008eA§<\u008d\u0084ËÑ´¨°*V"
                        .length();
                     byte var10 = 0;

                     label62:
                     while (true) {
                        byte var37 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var37, var10).getBytes("ISO-8859-1");
                        long[] var28 = var14;
                        int var38 = var11++;
                        long var51 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var61 = -1;

                        while (true) {
                           long var72 = var51 ^ var8;
                           switch (var61) {
                              case 0:
                                 var28[var38] = var72;
                                 if (var10 >= var13) {
                                    c = var14;
                                    d = new Integer[37];
                                    long var0 = 5299507507319969930L;
                                    var6 = new long[8];
                                    int var3 = 0;
                                    String var4 = "3\f,¼Ãà\u008dÂ\u001a´c\u0084\u0095ì\u009f\\cÕ|×Áâ¦4Yg\u0007Q¬ë+v}¥\u0094¥áåVí~äÁ\u0093Ýd\u0083d";
                                    int var5 = "3\f,¼Ãà\u008dÂ\u001a´c\u0084\u0095ì\u009f\\cÕ|×Áâ¦4Yg\u0007Q¬ë+v}¥\u0094¥áåVí~äÁ\u0093Ýd\u0083d".length();
                                    byte var2 = 0;

                                    label52:
                                    while (true) {
                                       byte var40 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var40, var2).getBytes("ISO-8859-1");
                                       long[] var29 = var6;
                                       int var41 = var3++;
                                       long var53 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
                                       byte var63 = -1;

                                       while (true) {
                                          var72 = var53 ^ var0;
                                          switch (var63) {
                                             case 0:
                                                var29[var41] = var72;
                                                if (var2 >= var5) {
                                                   e = var6;
                                                   f = new Long[8];
                                                   String[] var30 = new String[a(22450, 2447396704374102251L)];
                                                   var30[0] = " ";
                                                   var30[1] = ".";
                                                   var30[2] = ",";
                                                   var30[3] = ":";
                                                   var30[4] = ";";
                                                   var30[5] = "/";
                                                   var30[a(25763, 6906786942854278131L)] = "\\";
                                                   var30[a(7024, 59832708882879549L)] = "\n";
                                                   var30[a(29640, 102588712377040004L)] = "\t";
                                                   var30[a(22485, 1528996239239288989L)] = "|";
                                                   var30[a(30480, 8967552325923223633L)] = "{";
                                                   var30[a(23988, 5143166813132690161L)] = "}";
                                                   var30[a(3580, 6801053931530142395L)] = "[";
                                                   var30[a(19706, 5905034868969046948L)] = "]";
                                                   var30[a(15708, 5577384847999136271L)] = "(";
                                                   var30[a(9092, 1422294075442326735L)] = ")";
                                                   var30[a(12334, 8452702970952580985L)] = "<";
                                                   var30[a(18392, 1800242119775586466L)] = ">";
                                                   var30[a(19719, 1164114883281683016L)] = "-";
                                                   var30[a(2297, 8602976591564457863L)] = "+";
                                                   var30[a(3896, 5230546006055239748L)] = "\"";
                                                   var30[a(27431, 5956272136598398076L)] = "'";
                                                   var30[a(18447, 982858211016312651L)] = "*";
                                                   var30[a(18231, 5410003839787173990L)] = "%";
                                                   var30[a(28937, 7916625809539677791L)] = "$";
                                                   var30[a(4651, 7810696704350281087L)] = "#";
                                                   var30[a(32067, 7659907886289760773L)] = "@";
                                                   var30[a(2788, 3284697325978568121L)] = "!";
                                                   var30[a(6632, 8603825648652637847L)] = "~";
                                                   var30[a(14418, 308768085072246556L)] = "^";
                                                   var30[a(1396, 9124085833070529086L)] = "&";
                                                   var30[a(23453, 1236539876941468895L)] = "?";
                                                   Y = Arrays.asList(var30);
                                                   J = new Iw2();
                                                   return;
                                                }
                                                break;
                                             default:
                                                var29[var41] = var72;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "v)þ4±r4Ot\u0085}\u001a\u001aU\u0096@";
                                                var5 = "v)þ4±r4Ot\u0085}\u001a\u001aU\u0096@".length();
                                                var2 = 0;
                                          }

                                          byte var42 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var42, var2).getBytes("ISO-8859-1");
                                          var29 = var6;
                                          var41 = var3++;
                                          var53 = ((long)var7[0] & 255L) << 56
                                             | ((long)var7[1] & 255L) << 48
                                             | ((long)var7[2] & 255L) << 40
                                             | ((long)var7[3] & 255L) << 32
                                             | ((long)var7[4] & 255L) << 24
                                             | ((long)var7[5] & 255L) << 16
                                             | ((long)var7[6] & 255L) << 8
                                             | (long)var7[7] & 255L;
                                          var63 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var28[var38] = var72;
                                 if (var10 < var13) {
                                    continue label62;
                                 }

                                 var12 = "\u0099\r¿@\u0003ë\u001f\u00144\u0089Z;\u0092\u0019bµ";
                                 var13 = "\u0099\r¿@\u0003ë\u001f\u00144\u0089Z;\u0092\u0019bµ".length();
                                 var10 = 0;
                           }

                           byte var39 = var10;
                           var10 += 8;
                           var15 = var12.substring(var39, var10).getBytes("ISO-8859-1");
                           var28 = var14;
                           var38 = var11++;
                           var51 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var61 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var26);
                  break;
               default:
                  var21[var19++] = var60;
                  if ((var26 += var17) < var20) {
                     var17 = var18.charAt(var26);
                     continue label88;
                  }

                  var18 = "\u000b-££\u0005Ûò¼\u0091C\u0002´`";
                  var20 = "\u000b-££\u0005Ûò¼\u0091C\u0002´`".length();
                  var17 = '\n';
                  var26 = -1;
            }

            var10000 = 86;
            var10001 = var18.substring(++var26, var26 + var17);
            var10002 = 0;
         }
      }
   }
}





