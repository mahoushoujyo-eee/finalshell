public class ba_4 extends bN_3 {
   private static Exception U;
   private static Thread K;
   private static Thread b;
   private static final String a;
   private static final long[] c;
   private static final Integer[] f;

   static void j() throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic bN_3.Z ()I
      // 03: istore 0
      // 04: getstatic ba_4.a Ljava/lang/String;
      // 07: invokestatic ba_4.r (Ljava/lang/String;)V
      // 0a: invokestatic ba_4.m ()V
      // 0d: getstatic ba_4.V LxJ;
      // 10: sipush 20076
      // 13: ldc2_w 1568960342651072139
      // 16: invokestatic ba_4.b (IJ)I
      // 19: sipush 2378
      // 1c: ldc2_w 5611403705771043246
      // 1f: invokestatic ba_4.b (IJ)I
      // 22: bipush 1
      // 23: bipush 0
      // 24: invokevirtual xJ.M (IIII)V
      // 27: sipush 22915
      // 2a: new java/lang/Thread
      // 2d: dup
      // 2e: new my_2
      // 31: dup
      // 32: invokespecial my_2.<init> ()V
      // 35: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;)V
      // 38: putstatic ba_4.K Ljava/lang/Thread;
      // 3b: ldc2_w 4229428051158235493
      // 3e: new java/lang/Thread
      // 41: dup
      // 42: new n1
      // 45: dup
      // 46: invokespecial n1.<init> ()V
      // 49: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;)V
      // 4c: putstatic ba_4.b Ljava/lang/Thread;
      // 4f: getstatic ba_4.b Ljava/lang/Thread;
      // 52: invokevirtual java/lang/Thread.start ()V
      // 55: invokestatic ba_4.b (IJ)I
      // 58: invokestatic ba_4.D (I)V
      // 5b: getstatic ba_4.K Ljava/lang/Thread;
      // 5e: invokevirtual java/lang/Thread.start ()V
      // 61: getstatic ba_4.K Ljava/lang/Thread;
      // 64: invokevirtual java/lang/Thread.isAlive ()Z
      // 67: ifne 89
      // 6a: getstatic ba_4.b Ljava/lang/Thread;
      // 6d: invokevirtual java/lang/Thread.isAlive ()Z
      // 70: iload 0
      // 71: ifeq 92
      // 74: iload 0
      // 75: ifeq 92
      // 78: goto 7f
      // 7b: invokestatic ba_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: ifeq 99
      // 82: goto 89
      // 85: invokestatic ba_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 88: athrow
      // 89: sipush 30384
      // 8c: ldc2_w 8343782300682507861
      // 8f: invokestatic ba_4.b (IJ)I
      // 92: invokestatic ba_4.D (I)V
      // 95: iload 0
      // 96: ifne 61
      // 99: getstatic ba_4.U Ljava/lang/Exception;
      // 9c: iload 0
      // 9d: ifeq ad
      // a0: ifnull ae
      // a3: goto aa
      // a6: invokestatic ba_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a9: athrow
      // aa: getstatic ba_4.U Ljava/lang/Exception;
      // ad: athrow
      // ae: invokestatic ba_4.i ()V
      // b1: invokestatic ba_4.Y ()V
      // b4: goto bd
      // b7: astore 1
      // b8: invokestatic ba_4.Y ()V
      // bb: aload 1
      // bc: athrow
      // bd: return
   }

   static Exception A() {
      return U;
   }

   static Exception c(Exception var0) {
      U = var0;
      return var0;
   }

   static Thread y() {
      return K;
   }

   static Thread D() {
      return b;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "^?<\u0004V$e*.'\u0002\u0005w e6+PK$<c7*\u001f\u0015p".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 11;
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
         var10007 = 11;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 1;
               break;
            case 1:
               var50 = 81;
               break;
            case 2:
               var50 = 68;
               break;
            case 3:
               var50 = 123;
               break;
            case 4:
               var50 = 107;
               break;
            case 5:
               var50 = 15;
               break;
            default:
               var50 = 67;
         }
      } else {
         var34 = 11;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 5822284846316411058L;
            long[] var14 = new long[4];
            int var11 = 0;
            String var12 = "dr\u0080\u001eÞ\u008b\u000e\u0083\rüÉ-Ð\u001fq\u0014";
            int var13 = "dr\u0080\u001eÞ\u008b\u000e\u0083\rüÉ-Ð\u001fq\u0014".length();
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
                           c = var14;
                           f = new Integer[4];
                           U = null;
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "v{êf?³²9#»\u009c\u0080=\u008f¡³";
                        var13 = "v{êf?³²9#»\u009c\u0080=\u008f¡³".length();
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
         var10007 = 11;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 1;
               break;
            case 1:
               var50 = 81;
               break;
            case 2:
               var50 = 68;
               break;
            case 3:
               var50 = 123;
               break;
            case 4:
               var50 = 107;
               break;
            case 5:
               var50 = 15;
               break;
            default:
               var50 = 67;
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
                  var50 = 1;
                  break;
               case 1:
                  var50 = 81;
                  break;
               case 2:
                  var50 = 68;
                  break;
               case 3:
                  var50 = 123;
                  break;
               case 4:
                  var50 = 107;
                  break;
               case 5:
                  var50 = 15;
                  break;
               default:
                  var50 = 67;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 5822284846316411058L;
               long[] var6 = new long[4];
               int var3 = 0;
               String var4 = "dr\u0080\u001eÞ\u008b\u000e\u0083\rüÉ-Ð\u001fq\u0014";
               int var5 = "dr\u0080\u001eÞ\u008b\u000e\u0083\rüÉ-Ð\u001fq\u0014".length();
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
                              c = var6;
                              f = new Integer[4];
                              U = null;
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "v{êf?³²9#»\u009c\u0080=\u008f¡³";
                           var5 = "v{êf?³²9#»\u009c\u0080=\u008f¡³".length();
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
                  var50 = 1;
                  break;
               case 1:
                  var50 = 81;
                  break;
               case 2:
                  var50 = 68;
                  break;
               case 3:
                  var50 = 123;
                  break;
               case 4:
                  var50 = 107;
                  break;
               case 5:
                  var50 = 15;
                  break;
               default:
                  var50 = 67;
            }
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8421;
      if (f[var3] == null) {
         f[var3] = (int)(c[var3] ^ var1);
      }

      return f[var3];
   }
}





