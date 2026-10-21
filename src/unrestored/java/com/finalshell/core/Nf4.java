package com.finalshell.core;

import com.finalshell.ui.model.O0;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicLong;

public class Nf4 implements Ak2, X4 {
   public static Nf4 K;
   public static String a;
   public static long[] b;
   public static Integer[] c;
   public static long[] d;
   public static Long[] e;

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
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 1
      // 04: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 07: astore 7
      // 09: astore 6
      // 0b: aload 2
      // 0c: aload 6
      // 0e: ifnull 37
      // 11: ifnonnull 2f
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/Nf4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 7
      // 1d: getstatic com/finalshell/ui/model/EP.WriteNullNumberAsZero Lcom/finalshell/ui/model/EP;
      // 20: invokevirtual com/finalshell/io/YM3.x (Lcom/finalshell/ui/model/EP;)V
      // 23: aload 6
      // 25: ifnonnull d3
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/Nf4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 2
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/Nf4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: checkcast java/lang/Long
      // 3a: invokevirtual java/lang/Long.longValue ()J
      // 3d: lstore 8
      // 3f: aload 7
      // 41: lload 8
      // 43: invokevirtual com/finalshell/io/YM3.i (J)V
      // 46: aload 7
      // 48: getstatic com/finalshell/ui/model/EP.WriteClassName Lcom/finalshell/ui/model/EP;
      // 4b: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 4e: aload 6
      // 50: ifnull 70
      // 53: ifeq d3
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/Nf4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: lload 8
      // 5f: sipush 16959
      // 62: ldc2_w 987461947919264311
      // 65: invokestatic com/finalshell/core/Nf4.b (IJ)J
      // 68: lcmp
      // 69: goto 70
      // 6c: invokestatic com/finalshell/core/Nf4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f: athrow
      // 70: aload 6
      // 72: ifnull 92
      // 75: ifgt d3
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/core/Nf4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: lload 8
      // 81: sipush 11781
      // 84: ldc2_w 3365732554877142540
      // 87: invokestatic com/finalshell/core/Nf4.b (IJ)J
      // 8a: lcmp
      // 8b: goto 92
      // 8e: invokestatic com/finalshell/core/Nf4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 91: athrow
      // 92: iflt d3
      // 95: aload 4
      // 97: ldc java/lang/Long
      // 99: aload 6
      // 9b: ifnull bb
      // 9e: goto a5
      // a1: invokestatic com/finalshell/core/Nf4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a4: athrow
      // a5: if_acmpeq d3
      // a8: goto af
      // ab: invokestatic com/finalshell/core/Nf4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ae: athrow
      // af: aload 4
      // b1: getstatic java/lang/Long.TYPE Ljava/lang/Class;
      // b4: goto bb
      // b7: invokestatic com/finalshell/core/Nf4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ba: athrow
      // bb: if_acmpeq d3
      // be: aload 7
      // c0: sipush 19245
      // c3: ldc2_w 3390058184579769011
      // c6: invokestatic com/finalshell/core/Nf4.a (IJ)I
      // c9: invokevirtual com/finalshell/io/YM3.write (I)V
      // cc: goto d3
      // cf: invokestatic com/finalshell/core/Nf4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d2: athrow
      // d3: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public Object z(Yn4 var1, Type var2, Object var3) {
      int var21;
      String var10000 = Nv4.o();
      P7 var5 = var1.N;
      String var4 = var10000;

      Long var6;
      try {
         label99: {
            int var7 = var5.P();

            int var10001;
            label109: {
               label100: {
                  try {
                     var21 = var7;
                     var10001 = 2;
                     if (var4 == null) {
                        break label109;
                     }

                     if (var7 != 2) {
                        break label100;
                     }
                  } catch (Exception var16) {
                     throw new RuntimeException(a(var16));
                  }

                  long var8 = var5.f();
                  var5.S(a(26847, 2591465812442005824L));
                  var6 = var8;

                  try {
                     if (var4 != null) {
                        break label99;
                     }
                  } catch (Exception var15) {
                     boolean var25 = false;
                     throw new RuntimeException(a(var15));
                  }
               }

               try {
                  var21 = var7;
                  var10001 = 3;
               } catch (Exception var14) {
                  boolean var26 = false;
                  throw new RuntimeException(a(var14));
               }
            }

            label110: {
               label101: {
                  try {
                     if (var4 == null) {
                        break label110;
                     }

                     if (var21 != var10001) {
                        break label101;
                     }
                  } catch (Exception var13) {
                     throw new RuntimeException(a(var13));
                  }

                  BigDecimal var18 = var5.c$BigDecimal();
                  var6 = B8_2.X(var18);

                  try {
                     var5.S(a(13077, 7943825789294615177L));
                     if (var4 != null) {
                        break label99;
                     }
                  } catch (Exception var12) {
                     boolean var27 = false;
                     throw new RuntimeException(a(var12));
                  }
               }

               try {
                  var21 = var7;
                  var10001 = a(5189, 3309280662843047384L);
               } catch (Exception var11) {
                  boolean var28 = false;
                  throw new RuntimeException(a(var11));
               }
            }

            label59: {
               if (var21 == var10001) {
                  O0 var19 = new O0(true);
                  var1.u(var19);
                  var6 = B8_2.s(var19);
                  if (var4 != null) {
                     break label59;
                  }
               }

               Object var20 = var1.M();
               var6 = B8_2.s(var20);
            }

            if (var6 == null) {
               return null;
            }
         }
      } catch (Exception var17) {
         throw new Hi2(a + var3, var17);
      }

      try {
         if (var2 == AtomicLong.class) {
            return new AtomicLong(var6);
         }
      } catch (Exception var10) {
         throw new RuntimeException(a(var10));
      }

      return var6;
   }

   @Override
   public int j() {
      return 2;
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10654;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 10248) & 32767;
      if (e[var3] == null) {
         e[var3] = d[var3] ^ var1;
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\n\"J\u0017Z\n|\u0014$\u0018\u0001M4|\bo\u0018\u0002V#\u007f\u001ec\u0002D".toCharArray();
      int var10004 = var10003.length;
      int var16 = 0;
      byte var53 = 38;
      char[] var10002 = var10003;
      int var34 = var10004;
      char[] var63;
      byte var73;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var63 = var10003;
         var10005 = var16;
         char var10008 = var10003[var16];
         var10007 = 38;
         var10006 = var10008;
         switch (var16 % 7) {
            case 0:
               var73 = 92;
               break;
            case 1:
               var73 = 101;
               break;
            case 2:
               var73 = 30;
               break;
            case 3:
               var73 = 66;
               break;
            case 4:
               var73 = 25;
               break;
            case 5:
               var73 = 96;
               break;
            default:
               var73 = 53;
         }
      } else {
         var53 = 38;
         var34 = var10004;
         if (var10004 <= var16) {
            String var59 = new String(var10003).intern();
            int var42 = -1;
            a = var59;
            long var24 = 7001742544990318785L;
            long[] var29 = new long[4];
            int var26 = 0;
            String var27 = "q\u009b#\u0091Q+R>\u0017L\u0085*lÏñ\u0091";
            int var28 = "q\u009b#\u0091Q+R>\u0017L\u0085*lÏñ\u0091".length();
            byte var25 = 0;

            label80:
            while (true) {
               var42 = var25;
               var25 += 8;
               byte[] var31 = var27.substring(var42, var25).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
               long[] var33 = var29;
               var42 = var26++;
               long var51 = ((long)var31[0] & 255L) << 56
                  | ((long)var31[1] & 255L) << 48
                  | ((long)var31[2] & 255L) << 40
                  | ((long)var31[3] & 255L) << 32
                  | ((long)var31[4] & 255L) << 24
                  | ((long)var31[5] & 255L) << 16
                  | ((long)var31[6] & 255L) << 8
                  | (long)var31[7] & 255L;
               byte var60 = -1;

               while (true) {
                  long var70 = var51 ^ var24;
                  switch (var60) {
                     case 0:
                        var33[var42] = var70;
                        if (var25 >= var28) {
                           b = var29;
                           c = new Integer[4];
                           long var17 = 1969704269030132951L;
                           long[] var22 = new long[2];
                           int var19 = 0;
                           String var20 = "\u0016áàðQ\u0012\u0019\u001fÊ\u001fO\u008aZw\nÛ";
                           int var21 = "\u0016áàðQ\u0012\u0019\u001fÊ\u001fO\u008aZw\nÛ".length();
                           byte var18 = 0;

                           do {
                              int var46 = var18;
                              var18 += 8;
                              byte[] var23 = var20.substring(var46, var18).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                              var46 = var19++;
                              long var71 = (
                                    ((long)var23[0] & 255L) << 56
                                       | ((long)var23[1] & 255L) << 48
                                       | ((long)var23[2] & 255L) << 40
                                       | ((long)var23[3] & 255L) << 32
                                       | ((long)var23[4] & 255L) << 24
                                       | ((long)var23[5] & 255L) << 16
                                       | ((long)var23[6] & 255L) << 8
                                       | (long)var23[7] & 255L
                                 )
                                 ^ var17;
                              byte var62 = -1;
                              var22[var46] = var71;
                           } while (var18 < var21);

                           d = var22;
                           e = new Long[2];
                           K = new Nf4();
                           return;
                        }
                        break;
                     default:
                        var33[var42] = var70;
                        if (var25 < var28) {
                           continue label80;
                        }

                        var27 = "\u0088,¹\u009fê\u009d*XO'\u0016U°7\r\u0015";
                        var28 = "\u0088,¹\u009fê\u009d*XO'\u0016U°7\r\u0015".length();
                        var25 = 0;
                  }

                  byte var45 = var25;
                  var25 += 8;
                  var31 = var27.substring(var45, var25).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  var33 = var29;
                  var42 = var26++;
                  var51 = ((long)var31[0] & 255L) << 56
                     | ((long)var31[1] & 255L) << 48
                     | ((long)var31[2] & 255L) << 40
                     | ((long)var31[3] & 255L) << 32
                     | ((long)var31[4] & 255L) << 24
                     | ((long)var31[5] & 255L) << 16
                     | ((long)var31[6] & 255L) << 8
                     | (long)var31[7] & 255L;
                  var60 = 0;
               }
            }
         }

         var63 = var10003;
         var10005 = var16;
         char var74 = var10003[var16];
         var10007 = 38;
         var10006 = var74;
         switch (var16 % 7) {
            case 0:
               var73 = 92;
               break;
            case 1:
               var73 = 101;
               break;
            case 2:
               var73 = 30;
               break;
            case 3:
               var73 = 66;
               break;
            case 4:
               var73 = 25;
               break;
            case 5:
               var73 = 96;
               break;
            default:
               var73 = 53;
         }
      }

      while (true) {
         var63[var10005] = (char)(var10006 ^ var10007 ^ var73);
         var16++;
         if (var53 == 0) {
            var63 = var10002;
            var10005 = var53;
            char var76 = var10002[var53];
            var10007 = var53;
            var10006 = var76;
            switch (var16 % 7) {
               case 0:
                  var73 = 92;
                  break;
               case 1:
                  var73 = 101;
                  break;
               case 2:
                  var73 = 30;
                  break;
               case 3:
                  var73 = 66;
                  break;
               case 4:
                  var73 = 25;
                  break;
               case 5:
                  var73 = 96;
                  break;
               default:
                  var73 = 53;
            }
         } else {
            if (var34 <= var16) {
               String var55 = new String(var10002).intern();
               int var36 = -1;
               a = var55;
               long var8 = 7001742544990318785L;
               long[] var14 = new long[4];
               int var11 = 0;
               String var12 = "q\u009b#\u0091Q+R>\u0017L\u0085*lÏñ\u0091";
               int var13 = "q\u009b#\u0091Q+R>\u0017L\u0085*lÏñ\u0091".length();
               byte var10 = 0;

               label46:
               while (true) {
                  var36 = var10;
                  var10 += 8;
                  byte[] var15 = var12.substring(var36, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  long[] var10000 = var14;
                  var36 = var11++;
                  long var49 = ((long)var15[0] & 255L) << 56
                     | ((long)var15[1] & 255L) << 48
                     | ((long)var15[2] & 255L) << 40
                     | ((long)var15[3] & 255L) << 32
                     | ((long)var15[4] & 255L) << 24
                     | ((long)var15[5] & 255L) << 16
                     | ((long)var15[6] & 255L) << 8
                     | (long)var15[7] & 255L;
                  byte var56 = -1;

                  while (true) {
                     long var67 = var49 ^ var8;
                     switch (var56) {
                        case 0:
                           var10000[var36] = var67;
                           if (var10 >= var13) {
                              b = var14;
                              c = new Integer[4];
                              long var0 = 1969704269030132951L;
                              long[] var6 = new long[2];
                              int var3 = 0;
                              String var4 = "\u0016áàðQ\u0012\u0019\u001fÊ\u001fO\u008aZw\nÛ";
                              int var5 = "\u0016áàðQ\u0012\u0019\u001fÊ\u001fO\u008aZw\nÛ".length();
                              byte var2 = 0;

                              do {
                                 int var40 = var2;
                                 var2 += 8;
                                 byte[] var7 = var4.substring(var40, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                                 var40 = var3++;
                                 long var68 = (
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
                                 byte var58 = -1;
                                 var6[var40] = var68;
                              } while (var2 < var5);

                              d = var6;
                              e = new Long[2];
                              K = new Nf4();
                              return;
                           }
                           break;
                        default:
                           var10000[var36] = var67;
                           if (var10 < var13) {
                              continue label46;
                           }

                           var12 = "\u0088,¹\u009fê\u009d*XO'\u0016U°7\r\u0015";
                           var13 = "\u0088,¹\u009fê\u009d*XO'\u0016U°7\r\u0015".length();
                           var10 = 0;
                     }

                     byte var39 = var10;
                     var10 += 8;
                     var15 = var12.substring(var39, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                     var10000 = var14;
                     var36 = var11++;
                     var49 = ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L;
                     var56 = 0;
                  }
               }
            }

            var63 = var10002;
            var10005 = var16;
            char var75 = var10002[var16];
            var10007 = var53;
            var10006 = var75;
            switch (var16 % 7) {
               case 0:
                  var73 = 92;
                  break;
               case 1:
                  var73 = 101;
                  break;
               case 2:
                  var73 = 30;
                  break;
               case 3:
                  var73 = 66;
                  break;
               case 4:
                  var73 = 25;
                  break;
               case 5:
                  var73 = 96;
                  break;
               default:
                  var73 = 53;
            }
         }
      }
   }
}





