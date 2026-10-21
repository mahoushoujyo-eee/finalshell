package com.finalshell.core;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Dp2 implements CN {
   public static String K;
   public String q;
   public final List E = new ArrayList();
   public static long[] a;
   public static Integer[] b;

   public Dp2() {
   }

   public Dp2(String var1) {
      this.q = var1;
   }

   public String w() {
      return this.q;
   }

   public void u(String var1) {
      this.q = var1;
   }

   public List C() {
      return this.E;
   }

   public void w(Object var1) {
      this.E.add(var1);
   }

   public String U() {
      return this.toString();
   }

   @Override
   public void G(NL3 param1, Object param2, Type param3, int param4) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: aload 1
      // 04: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 07: astore 6
      // 09: astore 5
      // 0b: iload 4
      // 0d: getstatic com/finalshell/ui/model/EP.BrowserSecure Lcom/finalshell/ui/model/EP;
      // 10: getfield com/finalshell/ui/model/EP.mask I
      // 13: iand
      // 14: aload 5
      // 16: ifnonnull 35
      // 19: ifne 44
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/Dp2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 22: athrow
      // 23: aload 6
      // 25: getstatic com/finalshell/ui/model/EP.BrowserSecure Lcom/finalshell/ui/model/EP;
      // 28: getfield com/finalshell/ui/model/EP.mask I
      // 2b: invokevirtual com/finalshell/io/YM3.y (I)Z
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/Dp2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 34: athrow
      // 35: aload 5
      // 37: ifnonnull 6b
      // 3a: ifeq 53
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/Dp2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 43: athrow
      // 44: aload 6
      // 46: getstatic com/finalshell/core/Dp2.K Ljava/lang/String;
      // 49: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/Dp2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 52: athrow
      // 53: aload 6
      // 55: aload 0
      // 56: getfield com/finalshell/core/Dp2.q Ljava/lang/String;
      // 59: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 5c: aload 6
      // 5e: sipush 2516
      // 61: ldc2_w 4150125024023071732
      // 64: invokestatic com/finalshell/core/Dp2.a (IJ)I
      // 67: invokevirtual com/finalshell/io/YM3.write (I)V
      // 6a: bipush 0
      // 6b: istore 7
      // 6d: iload 7
      // 6f: aload 0
      // 70: getfield com/finalshell/core/Dp2.E Ljava/util/List;
      // 73: invokeinterface java/util/List.size ()I 1
      // 78: if_icmpge b8
      // 7b: aload 5
      // 7d: ifnonnull c6
      // 80: iload 7
      // 82: ifeq a1
      // 85: goto 8c
      // 88: invokestatic com/finalshell/core/Dp2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 8b: athrow
      // 8c: aload 6
      // 8e: sipush 17417
      // 91: ldc2_w 2924465150041097771
      // 94: invokestatic com/finalshell/core/Dp2.a (IJ)I
      // 97: invokevirtual com/finalshell/io/YM3.write (I)V
      // 9a: goto a1
      // 9d: invokestatic com/finalshell/core/Dp2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // a0: athrow
      // a1: aload 1
      // a2: aload 0
      // a3: getfield com/finalshell/core/Dp2.E Ljava/util/List;
      // a6: iload 7
      // a8: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // ad: invokevirtual com/finalshell/core/NL3.B (Ljava/lang/Object;)V
      // b0: iinc 7 1
      // b3: aload 5
      // b5: ifnull 6d
      // b8: aload 6
      // ba: sipush 31139
      // bd: ldc2_w 7648251198181227394
      // c0: invokestatic com/finalshell/core/Dp2.a (IJ)I
      // c3: invokevirtual com/finalshell/io/YM3.write (I)V
      // c6: return
   }

   @Override
   public String toString() {
      return Ok2.x(this);
   }

   static {
      __vfClinit__();
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16928;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "|}w$".toCharArray();
      int var10004 = var10003.length;
      int var9 = 0;
      byte var27 = 35;
      char[] var10002 = var10003;
      int var18 = var10004;
      char[] var33;
      byte var39;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var33 = var10003;
         var10005 = var9;
         char var10008 = var10003[var9];
         var10007 = 35;
         var10006 = var10008;
         switch (var9 % 7) {
            case 0:
               var39 = 112;
               break;
            case 1:
               var39 = 116;
               break;
            case 2:
               var39 = 126;
               break;
            case 3:
               var39 = 40;
               break;
            case 4:
               var39 = 66;
               break;
            case 5:
               var39 = 53;
               break;
            default:
               var39 = 119;
         }
      } else {
         var27 = 35;
         var18 = var10004;
         if (var10004 <= var9) {
            String var31 = new String(var10003).intern();
            int var23 = -1;
            String var17 = var31;
            long var10 = 4154287846610835539L;
            long[] var15 = new long[3];
            int var12 = 0;
            String var13 = "\u008e¦RÌ©¬Ó\u008f\u0093\u008d'Jsz#ø\u0002jìÇ\u0005Ã\u009eT";
            int var14 = "\u008e¦RÌ©¬Ó\u008f\u0093\u008d'Jsz#ø\u0002jìÇ\u0005Ã\u009eT".length();
            byte var11 = 0;

            do {
               var23 = var11;
               var11 += 8;
               byte[] var16 = var13.substring(var23, var11).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
               var23 = var12++;
               long var37 = (
                     ((long)var16[0] & 255L) << 56
                        | ((long)var16[1] & 255L) << 48
                        | ((long)var16[2] & 255L) << 40
                        | ((long)var16[3] & 255L) << 32
                        | ((long)var16[4] & 255L) << 24
                        | ((long)var16[5] & 255L) << 16
                        | ((long)var16[6] & 255L) << 8
                        | (long)var16[7] & 255L
                  )
                  ^ var10;
               byte var32 = -1;
               var15[var23] = var37;
            } while (var11 < var14);

            a = var15;
            b = new Integer[3];
            K = var17;
            return;
         }

         var33 = var10003;
         var10005 = var9;
         char var40 = var10003[var9];
         var10007 = 35;
         var10006 = var40;
         switch (var9 % 7) {
            case 0:
               var39 = 112;
               break;
            case 1:
               var39 = 116;
               break;
            case 2:
               var39 = 126;
               break;
            case 3:
               var39 = 40;
               break;
            case 4:
               var39 = 66;
               break;
            case 5:
               var39 = 53;
               break;
            default:
               var39 = 119;
         }
      }

      while (true) {
         var33[var10005] = (char)(var10006 ^ var10007 ^ var39);
         var9++;
         if (var27 == 0) {
            var33 = var10002;
            var10005 = var27;
            char var42 = var10002[var27];
            var10007 = var27;
            var10006 = var42;
            switch (var9 % 7) {
               case 0:
                  var39 = 112;
                  break;
               case 1:
                  var39 = 116;
                  break;
               case 2:
                  var39 = 126;
                  break;
               case 3:
                  var39 = 40;
                  break;
               case 4:
                  var39 = 66;
                  break;
               case 5:
                  var39 = 53;
                  break;
               default:
                  var39 = 119;
            }
         } else {
            if (var18 <= var9) {
               String var29 = new String(var10002).intern();
               int var20 = -1;
               String var8 = var29;
               long var0 = 4154287846610835539L;
               long[] var6 = new long[3];
               int var3 = 0;
               String var4 = "\u008e¦RÌ©¬Ó\u008f\u0093\u008d'Jsz#ø\u0002jìÇ\u0005Ã\u009eT";
               int var5 = "\u008e¦RÌ©¬Ó\u008f\u0093\u008d'Jsz#ø\u0002jìÇ\u0005Ã\u009eT".length();
               byte var2 = 0;

               do {
                  var20 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var20, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  var20 = var3++;
                  long var36 = (
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
                  byte var30 = -1;
                  var6[var20] = var36;
               } while (var2 < var5);

               a = var6;
               b = new Integer[3];
               K = var8;
               return;
            }

            var33 = var10002;
            var10005 = var9;
            char var41 = var10002[var9];
            var10007 = var27;
            var10006 = var41;
            switch (var9 % 7) {
               case 0:
                  var39 = 112;
                  break;
               case 1:
                  var39 = 116;
                  break;
               case 2:
                  var39 = 126;
                  break;
               case 3:
                  var39 = 40;
                  break;
               case 4:
                  var39 = 66;
                  break;
               case 5:
                  var39 = 53;
                  break;
               default:
                  var39 = 119;
            }
         }
      }
   }
}





