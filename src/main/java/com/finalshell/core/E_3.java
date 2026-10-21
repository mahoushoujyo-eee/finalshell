package com.finalshell.core;

import java.io.IOException;
import java.io.OutputStream;

public class E_3 implements H_4 {
   public static boolean T;
   public final H_4 I;
   public final M_5 k;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public E_3(M_5 var1, H_4 var2) {
      this.k = var1;
      this.I = var2;
   }

   @Override
   public OutputStream X(String param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/D22_2.b ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: getfield com/finalshell/core/E_3.I Lcom/finalshell/core/H_4;
      // 07: aload 1
      // 08: invokeinterface com/finalshell/core/H_4.X (Ljava/lang/String;)Ljava/io/OutputStream; 2
      // 0d: astore 3
      // 0e: astore 2
      // 0f: getstatic com/finalshell/core/E_3.T Z
      // 12: aload 2
      // 13: ifnull 39
      // 16: ifne 48
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/E_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1f: athrow
      // 20: aload 1
      // 21: aload 2
      // 22: ifnull 70
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/E_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 2b: athrow
      // 2c: getstatic com/finalshell/core/E_3.a Ljava/lang/String;
      // 2f: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 32: goto 39
      // 35: invokestatic com/finalshell/core/E_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 38: athrow
      // 39: ifne 48
      // 3c: new java/lang/AssertionError
      // 3f: dup
      // 40: invokespecial java/lang/AssertionError.<init> ()V
      // 43: athrow
      // 44: invokestatic com/finalshell/core/E_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 47: athrow
      // 48: aload 1
      // 49: bipush 0
      // 4a: aload 1
      // 4b: invokevirtual java/lang/String.length ()I
      // 4e: sipush 2576
      // 51: ldc2_w 3401687132664766364
      // 54: invokestatic com/finalshell/core/E_3.a (IJ)I
      // 57: isub
      // 58: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 5b: sipush 24309
      // 5e: ldc2_w 2128834021764975483
      // 61: invokestatic com/finalshell/core/E_3.a (IJ)I
      // 64: sipush 3386
      // 67: ldc2_w 6058176889694951607
      // 6a: invokestatic com/finalshell/core/E_3.a (IJ)I
      // 6d: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 70: astore 4
      // 72: invokestatic com/finalshell/core/M_5.m ()Ljava/util/regex/Pattern;
      // 75: aload 4
      // 77: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 7a: invokevirtual java/util/regex/Matcher.matches ()Z
      // 7d: ifeq 8e
      // 80: new com/finalshell/io/G
      // 83: dup
      // 84: aload 0
      // 85: aload 3
      // 86: invokespecial com/finalshell/io/G.<init> (Lcom/finalshell/core/E_3;Ljava/io/OutputStream;)V
      // 89: areturn
      // 8a: invokestatic com/finalshell/core/E_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 8d: athrow
      // 8e: aload 3
      // 8f: areturn
   }

   @Override
   public boolean A(String var1) {
      return this.I.A(var1);
   }

   static {
      __vfClinit__();
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5516;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "H\r\u0015Z\u001c\u007f".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 58;
      char[] var10002 = var10003;
      int var16 = var10004;
      char[] var31;
      byte var37;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var31 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 58;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 92;
               break;
            case 1:
               var37 = 84;
               break;
            case 2:
               var37 = 67;
               break;
            case 3:
               var37 = 1;
               break;
            case 4:
               var37 = 85;
               break;
            case 5:
               var37 = 54;
               break;
            default:
               var37 = 28;
         }
      } else {
         var25 = 58;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 8815217580317574880L;
            long[] var14 = new long[3];
            int var11 = 0;
            String var12 = "gÏen·\u001b\u0099zJó®Ý´$\u001ey@fí¤©\u008aÍ´";
            int var13 = "gÏen·\u001b\u0099zJó®Ý´$\u001ey@fí¤©\u008aÍ´".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes("ISO-8859-1");
               var21 = var11++;
               long var35 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var9;
               byte var30 = -1;
               var14[var21] = var35;
            } while (var10 < var13);

            b = var14;
            c = new Integer[3];
            T = !M_5.class.desiredAssertionStatus();
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 58;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 92;
               break;
            case 1:
               var37 = 84;
               break;
            case 2:
               var37 = 67;
               break;
            case 3:
               var37 = 1;
               break;
            case 4:
               var37 = 85;
               break;
            case 5:
               var37 = 54;
               break;
            default:
               var37 = 28;
         }
      }

      while (true) {
         var31[var10005] = (char)(var10006 ^ var10007 ^ var37);
         var8++;
         if (var25 == 0) {
            var31 = var10002;
            var10005 = var25;
            char var40 = var10002[var25];
            var10007 = var25;
            var10006 = var40;
            switch (var8 % 7) {
               case 0:
                  var37 = 92;
                  break;
               case 1:
                  var37 = 84;
                  break;
               case 2:
                  var37 = 67;
                  break;
               case 3:
                  var37 = 1;
                  break;
               case 4:
                  var37 = 85;
                  break;
               case 5:
                  var37 = 54;
                  break;
               default:
                  var37 = 28;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 8815217580317574880L;
               long[] var6 = new long[3];
               int var3 = 0;
               String var4 = "gÏen·\u001b\u0099zJó®Ý´$\u001ey@fí¤©\u008aÍ´";
               int var5 = "gÏen·\u001b\u0099zJó®Ý´$\u001ey@fí¤©\u008aÍ´".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
                  var18 = var3++;
                  long var34 = (
                        ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L
                     )
                     ^ var0;
                  byte var28 = -1;
                  var6[var18] = var34;
               } while (var2 < var5);

               b = var6;
               c = new Integer[3];
               T = !M_5.class.desiredAssertionStatus();
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 92;
                  break;
               case 1:
                  var37 = 84;
                  break;
               case 2:
                  var37 = 67;
                  break;
               case 3:
                  var37 = 1;
                  break;
               case 4:
                  var37 = 85;
                  break;
               case 5:
                  var37 = 54;
                  break;
               default:
                  var37 = 28;
            }
         }
      }
   }
}





