package com.finalshell.core;

import java.io.IOException;
import java.lang.reflect.Type;

public class Wi4 implements Ak2, X4 {
   public static Wi4 l;
   public static String a;
   public static long b;

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
      // 00: invokestatic com/finalshell/core/ZS.p ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 4
      // 05: aload 2
      // 06: ldc java/util/OptionalInt
      // 08: aload 4
      // 0a: ifnonnull 4b
      // 0d: if_acmpne 48
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 1
      // 18: ldc java/lang/Integer
      // 1a: invokevirtual com/finalshell/core/Yn4.M (Ljava/lang/Class;)Ljava/lang/Object;
      // 1d: astore 5
      // 1f: aload 5
      // 21: invokestatic com/finalshell/core/B8_2.Y (Ljava/lang/Object;)Ljava/lang/Integer;
      // 24: astore 6
      // 26: aload 6
      // 28: aload 4
      // 2a: ifnonnull 41
      // 2d: ifnonnull 3f
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: invokestatic java/util/OptionalInt.empty ()Ljava/util/OptionalInt;
      // 3a: areturn
      // 3b: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: aload 6
      // 41: invokevirtual java/lang/Integer.intValue ()I
      // 44: invokestatic java/util/OptionalInt.of (I)Ljava/util/OptionalInt;
      // 47: areturn
      // 48: aload 2
      // 49: ldc java/util/OptionalLong
      // 4b: aload 4
      // 4d: ifnonnull 9a
      // 50: if_acmpne 8b
      // 53: goto 5a
      // 56: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59: athrow
      // 5a: aload 1
      // 5b: ldc java/lang/Long
      // 5d: invokevirtual com/finalshell/core/Yn4.M (Ljava/lang/Class;)Ljava/lang/Object;
      // 60: astore 5
      // 62: aload 5
      // 64: invokestatic com/finalshell/core/B8_2.s (Ljava/lang/Object;)Ljava/lang/Long;
      // 67: astore 6
      // 69: aload 6
      // 6b: aload 4
      // 6d: ifnonnull 84
      // 70: ifnonnull 82
      // 73: goto 7a
      // 76: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 79: athrow
      // 7a: invokestatic java/util/OptionalLong.empty ()Ljava/util/OptionalLong;
      // 7d: areturn
      // 7e: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 81: athrow
      // 82: aload 6
      // 84: invokevirtual java/lang/Long.longValue ()J
      // 87: invokestatic java/util/OptionalLong.of (J)Ljava/util/OptionalLong;
      // 8a: areturn
      // 8b: aload 2
      // 8c: aload 4
      // 8e: ifnonnull d8
      // 91: ldc java/util/OptionalDouble
      // 93: goto 9a
      // 96: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 99: athrow
      // 9a: if_acmpne ce
      // 9d: aload 1
      // 9e: ldc java/lang/Double
      // a0: invokevirtual com/finalshell/core/Yn4.M (Ljava/lang/Class;)Ljava/lang/Object;
      // a3: astore 5
      // a5: aload 5
      // a7: invokestatic com/finalshell/core/B8_2.Z (Ljava/lang/Object;)Ljava/lang/Double;
      // aa: astore 6
      // ac: aload 6
      // ae: aload 4
      // b0: ifnonnull c7
      // b3: ifnonnull c5
      // b6: goto bd
      // b9: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bc: athrow
      // bd: invokestatic java/util/OptionalDouble.empty ()Ljava/util/OptionalDouble;
      // c0: areturn
      // c1: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c4: athrow
      // c5: aload 6
      // c7: invokevirtual java/lang/Double.doubleValue ()D
      // ca: invokestatic java/util/OptionalDouble.of (D)Ljava/util/OptionalDouble;
      // cd: areturn
      // ce: aload 2
      // cf: invokestatic com/finalshell/core/B8_2.u (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
      // d2: astore 2
      // d3: aload 1
      // d4: aload 2
      // d5: invokevirtual com/finalshell/core/Yn4.o (Ljava/lang/reflect/Type;)Ljava/lang/Object;
      // d8: astore 5
      // da: aload 5
      // dc: aload 4
      // de: ifnonnull f5
      // e1: ifnonnull f3
      // e4: goto eb
      // e7: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ea: athrow
      // eb: invokestatic java/util/Optional.empty ()Ljava/util/Optional;
      // ee: areturn
      // ef: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // f2: athrow
      // f3: aload 5
      // f5: invokestatic java/util/Optional.of (Ljava/lang/Object;)Ljava/util/Optional;
      // f8: areturn
   }

   @Override
   public int j() {
      return (int)b;
   }

   @Override
   public void u(NL3 param1, Object param2, Object param3, Type param4, int param5) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/ZS.p ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 6
      // 005: aload 2
      // 006: aload 6
      // 008: ifnonnull 01f
      // 00b: ifnonnull 01e
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014: athrow
      // 015: aload 1
      // 016: invokevirtual com/finalshell/core/NL3.e ()V
      // 019: return
      // 01a: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: aload 2
      // 01f: instanceof java/util/Optional
      // 022: aload 6
      // 024: ifnonnull 068
      // 027: ifeq 064
      // 02a: goto 031
      // 02d: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: aload 2
      // 032: checkcast java/util/Optional
      // 035: astore 7
      // 037: aload 7
      // 039: aload 6
      // 03b: ifnonnull 057
      // 03e: invokevirtual java/util/Optional.isPresent ()Z
      // 041: ifeq 05a
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04a: athrow
      // 04b: aload 7
      // 04d: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
      // 050: goto 057
      // 053: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 056: athrow
      // 057: goto 05b
      // 05a: aconst_null
      // 05b: astore 8
      // 05d: aload 1
      // 05e: aload 8
      // 060: invokevirtual com/finalshell/core/NL3.B (Ljava/lang/Object;)V
      // 063: return
      // 064: aload 2
      // 065: instanceof java/util/OptionalDouble
      // 068: aload 6
      // 06a: ifnonnull 0bd
      // 06d: ifeq 0b9
      // 070: goto 077
      // 073: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 076: athrow
      // 077: aload 2
      // 078: checkcast java/util/OptionalDouble
      // 07b: astore 7
      // 07d: aload 7
      // 07f: aload 6
      // 081: ifnonnull 09a
      // 084: invokevirtual java/util/OptionalDouble.isPresent ()Z
      // 087: ifeq 0ad
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: aload 7
      // 093: goto 09a
      // 096: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 099: athrow
      // 09a: invokevirtual java/util/OptionalDouble.getAsDouble ()D
      // 09d: dstore 8
      // 09f: aload 1
      // 0a0: dload 8
      // 0a2: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 0a5: invokevirtual com/finalshell/core/NL3.B (Ljava/lang/Object;)V
      // 0a8: aload 6
      // 0aa: ifnull 0b8
      // 0ad: aload 1
      // 0ae: invokevirtual com/finalshell/core/NL3.e ()V
      // 0b1: goto 0b8
      // 0b4: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b7: athrow
      // 0b8: return
      // 0b9: aload 2
      // 0ba: instanceof java/util/OptionalInt
      // 0bd: aload 6
      // 0bf: ifnonnull 11e
      // 0c2: ifeq 10e
      // 0c5: goto 0cc
      // 0c8: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cb: athrow
      // 0cc: aload 2
      // 0cd: checkcast java/util/OptionalInt
      // 0d0: astore 7
      // 0d2: aload 7
      // 0d4: invokevirtual java/util/OptionalInt.isPresent ()Z
      // 0d7: aload 6
      // 0d9: ifnonnull 0f2
      // 0dc: ifeq 102
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5: athrow
      // 0e6: aload 7
      // 0e8: invokevirtual java/util/OptionalInt.getAsInt ()I
      // 0eb: goto 0f2
      // 0ee: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1: athrow
      // 0f2: istore 8
      // 0f4: aload 1
      // 0f5: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 0f8: iload 8
      // 0fa: invokevirtual com/finalshell/io/YM3.v (I)V
      // 0fd: aload 6
      // 0ff: ifnull 10d
      // 102: aload 1
      // 103: invokevirtual com/finalshell/core/NL3.e ()V
      // 106: goto 10d
      // 109: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10c: athrow
      // 10d: return
      // 10e: aload 2
      // 10f: aload 6
      // 111: ifnonnull 122
      // 114: instanceof java/util/OptionalLong
      // 117: goto 11e
      // 11a: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11d: athrow
      // 11e: ifeq 163
      // 121: aload 2
      // 122: checkcast java/util/OptionalLong
      // 125: astore 7
      // 127: aload 7
      // 129: aload 6
      // 12b: ifnonnull 144
      // 12e: invokevirtual java/util/OptionalLong.isPresent ()Z
      // 131: ifeq 157
      // 134: goto 13b
      // 137: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13a: athrow
      // 13b: aload 7
      // 13d: goto 144
      // 140: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 143: athrow
      // 144: invokevirtual java/util/OptionalLong.getAsLong ()J
      // 147: lstore 8
      // 149: aload 1
      // 14a: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 14d: lload 8
      // 14f: invokevirtual com/finalshell/io/YM3.i (J)V
      // 152: aload 6
      // 154: ifnull 162
      // 157: aload 1
      // 158: invokevirtual com/finalshell/core/NL3.e ()V
      // 15b: goto 162
      // 15e: invokestatic com/finalshell/core/Wi4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 161: athrow
      // 162: return
      // 163: new com/finalshell/core/Hi2
      // 166: dup
      // 167: new java/lang/StringBuilder
      // 16a: dup
      // 16b: invokespecial java/lang/StringBuilder.<init> ()V
      // 16e: getstatic com/finalshell/core/Wi4.a Ljava/lang/String;
      // 171: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 174: aload 2
      // 175: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 178: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 17b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 17e: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 181: athrow
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = ".;_ |\t\u00020;Yt/\u0013\u00024=Dnn\u0010Rzt".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 123;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 123;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 59;
               break;
            case 1:
               var21 = 47;
               break;
            case 2:
               var21 = 80;
               break;
            case 3:
               var21 = 123;
               break;
            case 4:
               var21 = 116;
               break;
            case 5:
               var21 = 7;
               break;
            default:
               var21 = 9;
         }
      } else {
         var13 = 123;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 9031439970598650324L;
            long var12 = -5007924980260011560L ^ var3;
            var8 = -1;
            b = var12;
            l = new Wi4();
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 123;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 59;
               break;
            case 1:
               var21 = 47;
               break;
            case 2:
               var21 = 80;
               break;
            case 3:
               var21 = 123;
               break;
            case 4:
               var21 = 116;
               break;
            case 5:
               var21 = 7;
               break;
            default:
               var21 = 9;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 59;
                  break;
               case 1:
                  var21 = 47;
                  break;
               case 2:
                  var21 = 80;
                  break;
               case 3:
                  var21 = 123;
                  break;
               case 4:
                  var21 = 116;
                  break;
               case 5:
                  var21 = 7;
                  break;
               default:
                  var21 = 9;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 9031439970598650324L;
               long var11 = -5007924980260011560L ^ var0;
               var6 = -1;
               b = var11;
               l = new Wi4();
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 59;
                  break;
               case 1:
                  var21 = 47;
                  break;
               case 2:
                  var21 = 80;
                  break;
               case 3:
                  var21 = 123;
                  break;
               case 4:
                  var21 = 116;
                  break;
               case 5:
                  var21 = 7;
                  break;
               default:
                  var21 = 9;
            }
         }
      }
   }
}





