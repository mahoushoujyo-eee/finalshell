package com;

import java.io.IOException;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class dc_4 {
   private final List o;
   private final StringBuilder J;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public dc_4(@NotNull com.y4_2 param1) throws IOException {
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
      // 04: invokestatic com/pv_4.r ()Ljava/lang/String;
      // 07: aload 0
      // 08: new java/lang/StringBuilder
      // 0b: dup
      // 0c: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f: putfield com/dc_4.J Ljava/lang/StringBuilder;
      // 12: astore 2
      // 13: new java/lang/StringBuilder
      // 16: dup
      // 17: invokespecial java/lang/StringBuilder.<init> ()V
      // 1a: astore 3
      // 1b: bipush 0
      // 1c: istore 4
      // 1e: new java/util/ArrayList
      // 21: dup
      // 22: invokespecial java/util/ArrayList.<init> ()V
      // 25: astore 5
      // 27: iload 4
      // 29: ifne e1
      // 2c: aload 1
      // 2d: invokeinterface com/y4_2.C ()C 1
      // 32: istore 6
      // 34: aload 0
      // 35: getfield com/dc_4.J Ljava/lang/StringBuilder;
      // 38: iload 6
      // 3a: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 3d: pop
      // 3e: aload 0
      // 3f: invokespecial com/dc_4.i ()Z
      // 42: istore 4
      // 44: aload 2
      // 45: ifnonnull ea
      // 48: iload 6
      // 4a: aload 2
      // 4b: ifnonnull 81
      // 4e: goto 55
      // 51: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: sipush 4703
      // 58: ldc2_w 5200354280727613957
      // 5b: invokestatic com/dc_4.a (IJ)I
      // 5e: if_icmpeq 7f
      // 61: goto 68
      // 64: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67: athrow
      // 68: iload 4
      // 6a: aload 2
      // 6b: ifnonnull 81
      // 6e: goto 75
      // 71: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: ifeq cf
      // 78: goto 7f
      // 7b: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: iload 4
      // 81: aload 2
      // 82: ifnonnull c5
      // 85: ifeq ba
      // 88: goto 8f
      // 8b: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8e: athrow
      // 8f: aload 0
      // 90: invokespecial com/dc_4.x ()Z
      // 93: aload 2
      // 94: ifnonnull c5
      // 97: goto 9e
      // 9a: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9d: athrow
      // 9e: ifeq ba
      // a1: goto a8
      // a4: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a7: athrow
      // a8: aload 3
      // a9: aload 3
      // aa: invokevirtual java/lang/StringBuilder.length ()I
      // ad: bipush 1
      // ae: isub
      // af: invokevirtual java/lang/StringBuilder.deleteCharAt (I)Ljava/lang/StringBuilder;
      // b2: pop
      // b3: goto ba
      // b6: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b9: athrow
      // ba: aload 5
      // bc: aload 3
      // bd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // c0: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // c5: pop
      // c6: aload 3
      // c7: bipush 0
      // c8: invokevirtual java/lang/StringBuilder.setLength (I)V
      // cb: aload 2
      // cc: ifnull dd
      // cf: aload 3
      // d0: iload 6
      // d2: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // d5: pop
      // d6: goto dd
      // d9: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // dc: athrow
      // dd: aload 2
      // de: ifnull 27
      // e1: aload 0
      // e2: aload 5
      // e4: invokestatic java/util/List.copyOf (Ljava/util/Collection;)Ljava/util/List;
      // e7: putfield com/dc_4.o Ljava/util/List;
      // ea: return
   }

   private boolean i() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/pv_4.r ()Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/dc_4.J Ljava/lang/StringBuilder;
      // 07: invokevirtual java/lang/StringBuilder.length ()I
      // 0a: istore 2
      // 0b: astore 1
      // 0c: iload 2
      // 0d: aload 1
      // 0e: ifnonnull 7d
      // 11: ifle 7c
      // 14: goto 1b
      // 17: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield com/dc_4.J Ljava/lang/StringBuilder;
      // 1f: iload 2
      // 20: bipush 1
      // 21: isub
      // 22: invokevirtual java/lang/StringBuilder.charAt (I)C
      // 25: istore 3
      // 26: iload 3
      // 27: aload 1
      // 28: ifnonnull 77
      // 2b: sipush 25427
      // 2e: ldc2_w 4673262366854537994
      // 31: invokestatic com/dc_4.a (IJ)I
      // 34: if_icmpeq 76
      // 37: goto 3e
      // 3a: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: iload 3
      // 3f: aload 1
      // 40: ifnonnull 77
      // 43: goto 4a
      // 46: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49: athrow
      // 4a: sipush 4876
      // 4d: ldc2_w 923668366579733335
      // 50: invokestatic com/dc_4.a (IJ)I
      // 53: if_icmpeq 76
      // 56: goto 5d
      // 59: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: aload 0
      // 5e: invokespecial com/dc_4.x ()Z
      // 61: aload 1
      // 62: ifnonnull 77
      // 65: goto 6c
      // 68: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b: athrow
      // 6c: ifeq 7a
      // 6f: goto 76
      // 72: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75: athrow
      // 76: bipush 1
      // 77: goto 7b
      // 7a: bipush 0
      // 7b: ireturn
      // 7c: bipush 0
      // 7d: ireturn
   }

   private boolean x() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/pv_4.r ()Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/dc_4.J Ljava/lang/StringBuilder;
      // 07: invokevirtual java/lang/StringBuilder.length ()I
      // 0a: istore 2
      // 0b: astore 1
      // 0c: iload 2
      // 0d: bipush 1
      // 0e: aload 1
      // 0f: ifnonnull 36
      // 12: if_icmple 70
      // 15: goto 1c
      // 18: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield com/dc_4.J Ljava/lang/StringBuilder;
      // 20: iload 2
      // 21: bipush 2
      // 22: isub
      // 23: invokevirtual java/lang/StringBuilder.charAt (I)C
      // 26: sipush 16805
      // 29: ldc2_w 7696474351951135229
      // 2c: invokestatic com/dc_4.a (IJ)I
      // 2f: goto 36
      // 32: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: aload 1
      // 37: ifnonnull 69
      // 3a: if_icmpne 70
      // 3d: goto 44
      // 40: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: aload 0
      // 45: getfield com/dc_4.J Ljava/lang/StringBuilder;
      // 48: iload 2
      // 49: bipush 1
      // 4a: isub
      // 4b: invokevirtual java/lang/StringBuilder.charAt (I)C
      // 4e: aload 1
      // 4f: ifnonnull 6d
      // 52: goto 59
      // 55: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58: athrow
      // 59: sipush 9696
      // 5c: ldc2_w 830349177438545341
      // 5f: invokestatic com/dc_4.a (IJ)I
      // 62: goto 69
      // 65: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68: athrow
      // 69: if_icmpne 70
      // 6c: bipush 1
      // 6d: goto 71
      // 70: bipush 0
      // 71: ireturn
   }

   @Nullable
   public String O(int var1) {
      try {
         if (var1 < this.o.size()) {
            return (String)this.o.get(var1);
         }
      } catch (NumberFormatException var2) {
         throw a(var2);
      }

      return null;
   }

   @NotNull
   public List B() {
      return this.o;
   }

   public int N(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/pv_4.r ()Ljava/lang/String;
      // 03: astore 3
      // 04: iload 1
      // 05: aload 3
      // 06: ifnonnull 34
      // 09: aload 0
      // 0a: getfield com/dc_4.o Ljava/util/List;
      // 0d: invokeinterface java/util/List.size ()I 1
      // 12: if_icmpge 33
      // 15: goto 1c
      // 18: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 0
      // 1e: getfield com/dc_4.o Ljava/util/List;
      // 21: iload 1
      // 22: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 27: checkcast java/lang/String
      // 2a: iload 2
      // 2b: invokespecial com/dc_4.w (Ljava/lang/String;I)I
      // 2e: ireturn
      // 2f: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: iload 2
      // 34: ireturn
   }

   private int w(@NotNull String param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/pv_4.r ()Ljava/lang/String;
      // 03: astore 3
      // 04: aload 1
      // 05: invokevirtual java/lang/String.isEmpty ()Z
      // 08: aload 3
      // 09: ifnonnull 40
      // 0c: ifne 3f
      // 0f: goto 16
      // 12: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 1
      // 17: aload 1
      // 18: invokevirtual java/lang/String.length ()I
      // 1b: bipush 1
      // 1c: isub
      // 1d: invokevirtual java/lang/String.charAt (I)C
      // 20: invokestatic java/lang/Character.isDigit (C)Z
      // 23: aload 3
      // 24: ifnonnull 40
      // 27: goto 2e
      // 2a: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: ifeq 3f
      // 31: goto 38
      // 34: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: aload 1
      // 39: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 3c: ireturn
      // 3d: astore 4
      // 3f: iload 2
      // 40: ireturn
   }

   @NotNull
   public String T(@NotNull String var1) {
      return a + var1 + this.k();
   }

   @Override
   public String toString() {
      return Sd_2.Z(this.J.toString());
   }

   @NotNull
   private String k() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/pv_4.r ()Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/dc_4.J Ljava/lang/StringBuilder;
      // 07: invokevirtual java/lang/StringBuilder.length ()I
      // 0a: istore 2
      // 0b: astore 1
      // 0c: aload 0
      // 0d: aload 1
      // 0e: ifnonnull 2e
      // 11: invokespecial com/dc_4.x ()Z
      // 14: ifeq 2d
      // 17: goto 1e
      // 1a: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield com/dc_4.J Ljava/lang/StringBuilder;
      // 22: iload 2
      // 23: bipush 2
      // 24: isub
      // 25: invokevirtual java/lang/StringBuilder.substring (I)Ljava/lang/String;
      // 28: areturn
      // 29: invokestatic com/dc_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield com/dc_4.J Ljava/lang/StringBuilder;
      // 31: iload 2
      // 32: bipush 1
      // 33: isub
      // 34: invokevirtual java/lang/StringBuilder.substring (I)Ljava/lang/String;
      // 37: areturn
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u0002#".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 65;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 65;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 88;
               break;
            case 1:
               var50 = 63;
               break;
            case 2:
               var50 = 38;
               break;
            case 3:
               var50 = 88;
               break;
            case 4:
               var50 = 5;
               break;
            case 5:
               var50 = 114;
               break;
            default:
               var50 = 96;
         }
      } else {
         var34 = 65;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 8895128055267731908L;
            long[] var14 = new long[5];
            int var11 = 0;
            String var12 = "è\u000bI\u009f«HÊÉù¤%ÌG+è\"I!Õí-\u0098:\u000f";
            int var13 = "è\u000bI\u009f«HÊÉù¤%ÌG+è\"I!Õí-\u0098:\u000f".length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes("ISO-8859-1");
               long[] var18 = var14;
               var25 = var11++;
               long var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           b = var14;
                           c = new Integer[5];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "Ç\"ñ\u009c\u0015+»úó\u0005\u0093Ç\r\u001b\f%";
                        var13 = "Ç\"ñ\u009c\u0015+»úó\u0005\u0093Ç\r\u001b\f%".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes("ISO-8859-1");
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 65;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 88;
               break;
            case 1:
               var50 = 63;
               break;
            case 2:
               var50 = 38;
               break;
            case 3:
               var50 = 88;
               break;
            case 4:
               var50 = 5;
               break;
            case 5:
               var50 = 114;
               break;
            default:
               var50 = 96;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 88;
                  break;
               case 1:
                  var50 = 63;
                  break;
               case 2:
                  var50 = 38;
                  break;
               case 3:
                  var50 = 88;
                  break;
               case 4:
                  var50 = 5;
                  break;
               case 5:
                  var50 = 114;
                  break;
               default:
                  var50 = 96;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 8895128055267731908L;
               long[] var6 = new long[5];
               int var3 = 0;
               String var4 = "è\u000bI\u009f«HÊÉù¤%ÌG+è\"I!Õí-\u0098:\u000f";
               int var5 = "è\u000bI\u009f«HÊÉù¤%ÌG+è\"I!Õí-\u0098:\u000f".length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[5];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "Ç\"ñ\u009c\u0015+»úó\u0005\u0093Ç\r\u001b\f%";
                           var5 = "Ç\"ñ\u009c\u0015+»úó\u0005\u0093Ç\r\u001b\f%".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 88;
                  break;
               case 1:
                  var50 = 63;
                  break;
               case 2:
                  var50 = 38;
                  break;
               case 3:
                  var50 = 88;
                  break;
               case 4:
                  var50 = 5;
                  break;
               case 5:
                  var50 = 114;
                  break;
               default:
                  var50 = 96;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 89;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





