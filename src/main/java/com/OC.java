package com;

import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigInteger;

public class OC implements com.ak_2, X4 {
   private static final BigInteger n;
   private static final BigInteger r;
   public static final com.OC Y;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   @Override
   public void u(nL_3 param1, Object param2, Object param3, Type param4, int param5) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/nv_4.o ()Ljava/lang/String;
      // 03: aload 1
      // 04: getfield com/nL_3.w Lcom/yM_3;
      // 07: astore 7
      // 09: astore 6
      // 0b: aload 2
      // 0c: aload 6
      // 0e: ifnull 29
      // 11: ifnonnull 28
      // 14: goto 1b
      // 17: invokestatic com/OC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 7
      // 1d: getstatic com/EP.WriteNullNumberAsZero Lcom/EP;
      // 20: invokevirtual com/yM_3.x (Lcom/EP;)V
      // 23: return
      // 24: invokestatic com/OC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 2
      // 29: checkcast java/math/BigInteger
      // 2c: astore 8
      // 2e: aload 8
      // 30: invokevirtual java/math/BigInteger.toString ()Ljava/lang/String;
      // 33: astore 9
      // 35: aload 6
      // 37: ifnull b8
      // 3a: aload 9
      // 3c: invokevirtual java/lang/String.length ()I
      // 3f: sipush 29975
      // 42: ldc2_w 3999781338737589749
      // 45: invokestatic com/OC.a (IJ)I
      // 48: if_icmplt b1
      // 4b: goto 52
      // 4e: invokestatic com/OC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51: athrow
      // 52: iload 5
      // 54: aload 7
      // 56: getfield com/yM_3.q I
      // 59: getstatic com/EP.BrowserCompatible Lcom/EP;
      // 5c: invokestatic com/EP.a (IILcom/EP;)Z
      // 5f: aload 6
      // 61: ifnull 84
      // 64: goto 6b
      // 67: invokestatic com/OC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a: athrow
      // 6b: ifeq b1
      // 6e: goto 75
      // 71: invokestatic com/OC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: aload 8
      // 77: getstatic com/OC.n Ljava/math/BigInteger;
      // 7a: invokevirtual java/math/BigInteger.compareTo (Ljava/math/BigInteger;)I
      // 7d: goto 84
      // 80: invokestatic com/OC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83: athrow
      // 84: aload 6
      // 86: ifnull a2
      // 89: iflt a5
      // 8c: goto 93
      // 8f: invokestatic com/OC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 92: athrow
      // 93: aload 8
      // 95: getstatic com/OC.r Ljava/math/BigInteger;
      // 98: invokevirtual java/math/BigInteger.compareTo (Ljava/math/BigInteger;)I
      // 9b: goto a2
      // 9e: invokestatic com/OC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a1: athrow
      // a2: ifle b1
      // a5: aload 7
      // a7: aload 9
      // a9: invokevirtual com/yM_3.y (Ljava/lang/String;)V
      // ac: return
      // ad: invokestatic com/OC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b0: athrow
      // b1: aload 7
      // b3: aload 9
      // b5: invokevirtual com/yM_3.write (Ljava/lang/String;)V
      // b8: return
   }

   @Override
   public Object z(com.yn_4 var1, Type var2, Object var3) {
      return T(var1);
   }

   public static Object T(com.yn_4 param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/nv_4.o ()Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/yn_4.N Lcom/P7;
      // 07: astore 2
      // 08: astore 1
      // 09: aload 2
      // 0a: aload 1
      // 0b: ifnull 60
      // 0e: invokeinterface com/P7.P ()I 1
      // 13: bipush 2
      // 14: if_icmpne 5c
      // 17: goto 1e
      // 1a: invokestatic com/OC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 2
      // 1f: invokeinterface com/P7.c ()Ljava/lang/String; 1
      // 24: astore 3
      // 25: aload 2
      // 26: sipush 9565
      // 29: ldc2_w 7149477802582470078
      // 2c: invokestatic com/OC.a (IJ)I
      // 2f: invokeinterface com/P7.S (I)V 2
      // 34: aload 3
      // 35: invokevirtual java/lang/String.length ()I
      // 38: sipush 9120
      // 3b: ldc2_w 913574915494964033
      // 3e: invokestatic com/OC.a (IJ)I
      // 41: if_icmple 53
      // 44: new com/Hi_2
      // 47: dup
      // 48: getstatic com/OC.a Ljava/lang/String;
      // 4b: invokespecial com/Hi_2.<init> (Ljava/lang/String;)V
      // 4e: athrow
      // 4f: invokestatic com/OC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: new java/math/BigInteger
      // 56: dup
      // 57: aload 3
      // 58: invokespecial java/math/BigInteger.<init> (Ljava/lang/String;)V
      // 5b: areturn
      // 5c: aload 0
      // 5d: invokevirtual com/yn_4.M ()Ljava/lang/Object;
      // 60: astore 3
      // 61: aload 3
      // 62: aload 1
      // 63: ifnull 79
      // 66: ifnonnull 78
      // 69: goto 70
      // 6c: invokestatic com/OC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f: athrow
      // 70: aconst_null
      // 71: goto 7c
      // 74: invokestatic com/OC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 77: athrow
      // 78: aload 3
      // 79: invokestatic com/B8.I (Ljava/lang/Object;)Ljava/math/BigInteger;
      // 7c: areturn
   }

   @Override
   public int j() {
      return 2;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\fkVq@Y\u001bHaC}_^\u001b\u0007y".toCharArray();
      int var10004 = var10003.length;
      int var16 = 0;
      byte var44 = 46;
      char[] var10002 = var10003;
      int var31 = var10004;
      char[] var52;
      byte var60;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var52 = var10003;
         var10005 = var16;
         char var10008 = var10003[var16];
         var10007 = 46;
         var10006 = var10008;
         switch (var16 % 7) {
            case 0:
               var60 = 70;
               break;
            case 1:
               var60 = 32;
               break;
            case 2:
               var60 = 27;
               break;
            case 3:
               var60 = 54;
               break;
            case 4:
               var60 = 3;
               break;
            case 5:
               var60 = 22;
               break;
            default:
               var60 = 89;
         }
      } else {
         var44 = 46;
         var31 = var10004;
         if (var10004 <= var16) {
            String var49 = new String(var10003).intern();
            int var38 = -1;
            a = var49;
            long var24 = 7256059134324069995L;
            long[] var29 = new long[3];
            int var26 = 0;
            String var27 = "¼Ë®]2ê»Å\u0003'H\u00050-ë\u008e$\u0011\u009dF;UBÕ";
            int var28 = "¼Ë®]2ê»Å\u0003'H\u00050-ë\u008e$\u0011\u009dF;UBÕ".length();
            byte var25 = 0;

            do {
               var38 = var25;
               var25 += 8;
               byte[] var30 = var27.substring(var38, var25).getBytes("ISO-8859-1");
               var38 = var26++;
               long var57 = (
                     ((long)var30[0] & 255L) << 56
                        | ((long)var30[1] & 255L) << 48
                        | ((long)var30[2] & 255L) << 40
                        | ((long)var30[3] & 255L) << 32
                        | ((long)var30[4] & 255L) << 24
                        | ((long)var30[5] & 255L) << 16
                        | ((long)var30[6] & 255L) << 8
                        | (long)var30[7] & 255L
                  )
                  ^ var24;
               byte var50 = -1;
               var29[var38] = var57;
            } while (var25 < var28);

            b = var29;
            c = new Integer[3];
            long var18 = 8102878438887834094L;
            long[] var17 = new long[2];
            int var20 = 0;
            String var21 = "\u008f\u00935\u0002`\u0014ÁïplÊý\u009fë>\u0011";
            int var22 = "\u008f\u00935\u0002`\u0014ÁïplÊý\u009fë>\u0011".length();
            byte var19 = 0;

            do {
               int var41 = var19;
               var19 += 8;
               byte[] var23 = var21.substring(var41, var19).getBytes("ISO-8859-1");
               var41 = var20++;
               long var58 = (
                     ((long)var23[0] & 255L) << 56
                        | ((long)var23[1] & 255L) << 48
                        | ((long)var23[2] & 255L) << 40
                        | ((long)var23[3] & 255L) << 32
                        | ((long)var23[4] & 255L) << 24
                        | ((long)var23[5] & 255L) << 16
                        | ((long)var23[6] & 255L) << 8
                        | (long)var23[7] & 255L
                  )
                  ^ var18;
               byte var51 = -1;
               var17[var41] = var58;
            } while (var19 < var22);

            n = BigInteger.valueOf(var17[0]);
            r = BigInteger.valueOf(var17[1]);
            Y = new com.OC();
            return;
         }

         var52 = var10003;
         var10005 = var16;
         char var61 = var10003[var16];
         var10007 = 46;
         var10006 = var61;
         switch (var16 % 7) {
            case 0:
               var60 = 70;
               break;
            case 1:
               var60 = 32;
               break;
            case 2:
               var60 = 27;
               break;
            case 3:
               var60 = 54;
               break;
            case 4:
               var60 = 3;
               break;
            case 5:
               var60 = 22;
               break;
            default:
               var60 = 89;
         }
      }

      while (true) {
         var52[var10005] = (char)(var10006 ^ var10007 ^ var60);
         var16++;
         if (var44 == 0) {
            var52 = var10002;
            var10005 = var44;
            char var63 = var10002[var44];
            var10007 = var44;
            var10006 = var63;
            switch (var16 % 7) {
               case 0:
                  var60 = 70;
                  break;
               case 1:
                  var60 = 32;
                  break;
               case 2:
                  var60 = 27;
                  break;
               case 3:
                  var60 = 54;
                  break;
               case 4:
                  var60 = 3;
                  break;
               case 5:
                  var60 = 22;
                  break;
               default:
                  var60 = 89;
            }
         } else {
            if (var31 <= var16) {
               String var46 = new String(var10002).intern();
               int var33 = -1;
               a = var46;
               long var8 = 7256059134324069995L;
               long[] var14 = new long[3];
               int var11 = 0;
               String var12 = "¼Ë®]2ê»Å\u0003'H\u00050-ë\u008e$\u0011\u009dF;UBÕ";
               int var13 = "¼Ë®]2ê»Å\u0003'H\u00050-ë\u008e$\u0011\u009dF;UBÕ".length();
               byte var10 = 0;

               do {
                  var33 = var10;
                  var10 += 8;
                  byte[] var15 = var12.substring(var33, var10).getBytes("ISO-8859-1");
                  var33 = var11++;
                  long var55 = (
                        ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L
                     )
                     ^ var8;
                  byte var47 = -1;
                  var14[var33] = var55;
               } while (var10 < var13);

               b = var14;
               c = new Integer[3];
               long var1 = 8102878438887834094L;
               long[] var0 = new long[2];
               int var4 = 0;
               String var5 = "\u008f\u00935\u0002`\u0014ÁïplÊý\u009fë>\u0011";
               int var6 = "\u008f\u00935\u0002`\u0014ÁïplÊý\u009fë>\u0011".length();
               byte var3 = 0;

               do {
                  int var36 = var3;
                  var3 += 8;
                  byte[] var7 = var5.substring(var36, var3).getBytes("ISO-8859-1");
                  var36 = var4++;
                  long var56 = (
                        ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L
                     )
                     ^ var1;
                  byte var48 = -1;
                  var0[var36] = var56;
               } while (var3 < var6);

               n = BigInteger.valueOf(var0[0]);
               r = BigInteger.valueOf(var0[1]);
               Y = new com.OC();
               return;
            }

            var52 = var10002;
            var10005 = var16;
            char var62 = var10002[var16];
            var10007 = var44;
            var10006 = var62;
            switch (var16 % 7) {
               case 0:
                  var60 = 70;
                  break;
               case 1:
                  var60 = 32;
                  break;
               case 2:
                  var60 = 27;
                  break;
               case 3:
                  var60 = 54;
                  break;
               case 4:
                  var60 = 3;
                  break;
               case 5:
                  var60 = 22;
                  break;
               default:
                  var60 = 89;
            }
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18659;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





