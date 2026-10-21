package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Jl2;
import com.finalshell.ui.model.O0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TimeZone;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class Le4_2 {
   public static String H;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public static String q() {
      Registry.packArgs(a(13993, 8092416306206077742L));
      long var0 = 502006739469260406L;
      Object var10001 = Ref.h2(502006739469260406L, var0);

      try {
         return (String)var10001;
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public static void S(String var0) throws Exception {
      long var10;
      Object[] var12;
      long var13;
      Object[] var6;
      Object[] var8;
      Registry.packArgs(var0);
      long var2 = 466665856241452304L;
      Object var10001 = Ref.h2(466665856241452304L, var2);

      try {
         var10001 = (String)var10001;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      String var1 = (String)var10001;
      Registry.emptyArgs();
      long var4 = 270389152141252877L;
      Ref.h2(270389152141252877L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 375944019649708240L;
      var6 = var10003;
      Ref.h(375944019649708240L, var6, var7);
      Object[] var10004 = Registry.packArgs(var1);
      long var9 = 433142676825596742L;
      var8 = var10004;
      Ref.h(433142676825596742L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      Registry.emptyArgs();
      var10 = 270389152141252877L;
      Ref.h2(270389152141252877L, var10);
      Object[] var10006 = Registry.emptyArgs();
      var13 = 578864097947885485L;
      var12 = var10006;
      Ref.h(578864097947885485L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }
   }

   public static byte[] U() throws IOException, Exception {
      Registry.emptyArgs();
      long var2 = 270389152141252877L;
      Ref.h2(270389152141252877L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 375944019649708240L;
      Object[] var4 = var10002;
      Ref.h(375944019649708240L, var4, var5);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 318293696412897294L;
      Object[] var6 = var10003;
      Registry.packArgs(Ref.h(318293696412897294L, var6, var7));
      long var8 = 556691693894836467L;
      Object var10004 = Ref.h2(556691693894836467L, var8);

      try {
         var10004 = (String)var10004;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      String var0 = (String)var10004;
      Registry.packArgs(var0);
      long var10 = 397336479715995013L;
      B var10005 = (B)Ref.h2(397336479715995013L, var10);

      try {
         var10005 = (byte[])var10005;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      return (byte[])var10005;
   }

   public static String L(byte[] var0) {
      Registry.packArgs(var0);
      long var2 = 181927678435110934L;
      Object var10001 = Ref.h2(181927678435110934L, var2);

      try {
         var10001 = (String)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      return ((java.lang.String)var10001).substring(0, a(29559, 783906915426678515L));
   }

   public static byte[] d(String var0) {
      String var1 = var0 + a(-30865, 24730);
      Registry.packArgs(var0, var1);
      long var2 = 328263650508233536L;
      Object var10001 = Ref.h2(328263650508233536L, var2);

      try {
         return (byte[])var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public static byte[] F(String var0, String var1) {
      Mac var8;
      boolean var10000 = Ln4_2.R();
      String var3 = var1;
      boolean var2 = var10000;
      byte[] var4 = null;

      try {
         Mac var5 = Mac.getInstance(a(-30875, 26535));

         label24: {
            try {
               var8 = var5;
               if (var2) {
                  break label24;
               }

               var5.init(new SecretKeySpec(var3.getBytes(a(-30858, 16504)), a(-30873, 12710)));
               if (var0 == null) {
                  return var4;
               }
            } catch (Exception var6) {
               throw a(var6);
            }

            var8 = var5;
         }

         var4 = var8.doFinal(var0.getBytes(a(-30868, -27223)));
      } catch (Exception var7) {
         var7.printStackTrace();
      }

      return var4;
   }

   public static void M(Y9 var0, ArrayList var1, Ln4_2 var2) {
      Ln4_2 var10;
      long var12;
      Object var13;
      Object[] var15;
      long var26;
      Object[] var29;
      Object[] var33;
      long var42;
      int var6;
      Integer var68;
      Integer var71;
      Integer var74;
      Integer var76;
      Ln4_2 var8;
      Integer var80;
      Integer var82;
      Object var63;
      boolean var3 = Ln4_2.R();
      Y9 var10000 = var1.size();
      if (var3) {
         Y9 var4 = var10000;
         var63 = Registry.emptyArgs();
         long var14 = 338529256540953583L;
         var13 = var63;
         var63 = Ref.h(338529256540953583L, var13, var14);

         try {
            var65 = (Integer)var63;
         } catch (InvocationTargetException var58) {
            throw var58.getTargetException();
         }

         int var5 = var65;
         var6 = 0;
         if (var5 != var4) {
            label160: {
               Ln4_2 var7 = (Ln4_2)var1.get(0);
               var8 = (Ln4_2)var1.get(1);
               Y9 var66 = var4;
               if (!var3) {
                  if (var4 == null) {
                     Object var10002 = Registry.emptyArgs();
                     long var16 = 145535910876897139L;
                     var15 = var10002;
                     var10002 = Ref.h(145535910876897139L, var15, var16);

                     try {
                        var68 = (Integer)var10002;
                     } catch (InvocationTargetException var57) {
                        throw var57.getTargetException();
                     }

                     Registry.packArgs(var68);
                     long var17 = 540549253090973627L;
                     Object var10003 = Ref.h2(540549253090973627L, var17);

                     try {
                        var74 = (Integer)var10003;
                     } catch (InvocationTargetException var56) {
                        throw var56.getTargetException();
                     }

                     var6 = var74;
                     Object[] var10004 = Registry.packArgs(var6);
                     long var20 = 470936572593593753L;
                     Object[] var19 = var10004;
                     Ref.h(470936572593593753L, var19, var20);

                     try {
                        ;
                     } catch (InvocationTargetException var55) {
                        throw var55.getTargetException();
                     }

                     if (!var3) {
                        break label160;
                     }
                  }

                  var66 = var4;
               }

               if (var66 == var1.size() - 1) {
                  Ln4_2 var9 = (Ln4_2)var1.get(var1.size() - 2);
                  Object var69 = Registry.emptyArgs();
                  long var22 = 145535910876897139L;
                  Object var21 = var69;
                  var69 = Ref.h(145535910876897139L, var21, var22);

                  try {
                     var71 = (Integer)var69;
                  } catch (InvocationTargetException var54) {
                     throw var54.getTargetException();
                  }

                  Registry.packArgs(var71);
                  long var23 = 153746706510242688L;
                  Object var75 = Ref.h2(153746706510242688L, var23);

                  try {
                     var76 = (Integer)var75;
                  } catch (InvocationTargetException var53) {
                     throw var53.getTargetException();
                  }

                  var6 = var76;
                  Object[] var77 = Registry.packArgs(var6);
                  var26 = 470936572593593753L;
                  Object[] var25 = var77;
                  Ref.h(470936572593593753L, var25, var26);

                  try {
                     ;
                  } catch (InvocationTargetException var52) {
                     throw var52.getTargetException();
                  }

                  if (!var3) {
                     break label160;
                  }
               }

               Ln4_2 var61 = (Ln4_2)var1.get(var4 - 1);
               var10 = (Ln4_2)var1.get(var4 + 1);
               Object[] var72 = Registry.emptyArgs();
               long var28 = 145535910876897139L;
               Object[] var27 = var72;
               var72 = Ref.h(145535910876897139L, var27, var28);

               try {
               } catch (InvocationTargetException var51) {
                  throw var51.getTargetException();
               }

               Object var78 = Registry.emptyArgs();
               long var30 = 145535910876897139L;
               var29 = var78;
               var78 = Ref.h(145535910876897139L, var29, var30);

               try {
                  var80 = (Integer)var78;
               } catch (InvocationTargetException var50) {
                  throw var50.getTargetException();
               }

               Registry.packArgs((int)var10, var80);
               long var31 = 186880599905062406L;
               var78 = Ref.h2(186880599905062406L, var31);

               try {
                  var82 = (Integer)var78;
               } catch (InvocationTargetException var49) {
                  throw var49.getTargetException();
               }

               var6 = var82;
            }

            Object[] var10005 = Registry.packArgs(var6);
            long var34 = 470936572593593753L;
            var33 = var10005;
            Ref.h(470936572593593753L, var33, var34);

            try {
               ;
            } catch (InvocationTargetException var48) {
               throw var48.getTargetException();
            }

            Object[] var10006 = Registry.e(System.currentTimeMillis());
            long var36 = 632351682711676131L;
            Object[] var35 = var10006;
            Ref.h(632351682711676131L, var35, var36);

            try {
               ;
            } catch (InvocationTargetException var47) {
               throw var47.getTargetException();
            }

            Registry.packArgs(var1);
            long var37 = 126626936328477255L;
            Ref.h2(126626936328477255L, var37);

            try {
               ;
            } catch (InvocationTargetException var46) {
               throw var46.getTargetException();
            }

            Registry.emptyArgs();
            long var39 = 270389152141252877L;
            Ref.h2(270389152141252877L, var39);
            Object[] var10009 = Registry.emptyArgs();
            var42 = 612604310671515822L;
            Object[] var41 = var10009;
            Ref.h(612604310671515822L, var41, var42);
            Object[] var10010 = Registry.emptyArgs();
            long var44 = 200561288808923907L;
            Object[] var43 = var10010;
            Ref.h(200561288808923907L, var43, var44);

            try {
               ;
            } catch (InvocationTargetException var45) {
               throw var45.getTargetException();
            }
         }
      } else if (var10000 > 1) {
         var10000 = var0;
         Object[] var10001 = Registry.emptyArgs();
         var12 = 345387814509849729L;
         Object[] var11 = var10001;
         var10001 = Ref.h(345387814509849729L, var11, var12);

         label135:
         try {
            break label135;
         } catch (InvocationTargetException var59) {
            throw var59.getTargetException();
         }
      }
   }

   public static long w(String var0) {
      long var10;
      String var5;
      int var8;
      int var10000 = (Ln4_2.i()) ? 1 : 0;
      int var2 = var0.lastIndexOf(".");
      boolean var1 = (var10000) != 0;
      if (var2 > -1) {
         var0 = var0.substring(0, var2 - 1);
      }

      long var3 = 0L;
      var5 = null;
      String var6 = a(-30862, -28824);
      String var7 = var0.substring(var6.length());
      var8 = var7.indexOf("_");
      var10000 = var8;
      if (var1) {
         if (var8 <= -1) {
            return var3;
         }

         var10000 = var7.indexOf("_", var8 + 1);
      }

      int var9 = var10000;
      if (var9 != -1) {
         var5 = var7.substring(var8 + 1, var9);
      } else {
         var5 = var7.substring(var8 + 1);
      }

      Registry.packArgs(var5);
      var10 = 580562102365722287L;
      Object var10001 = Ref.h2(580562102365722287L, var10);

      try {
         var15 = (Long)var10001;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      return var15;
   }

   public static String z(String var0) {
      int var5;
      int var1 = var0.lastIndexOf(".");
      if (var1 > -1) {
         var0 = var0.substring(0, var1 - 1);
      }

      String var2 = null;
      String var3 = a(-30855, -2582);
      String var4 = var0.substring(var3.length());
      var5 = var4.indexOf("_");
      if (var5 > -1) {
         var2 = var4.substring(0, var5);
      }

      return var2;
   }

   public static boolean H(Ln4_2 param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ln4_2.i ()Z
      // 003: bipush 0
      // 004: istore 2
      // 005: istore 1
      // 006: aload 0
      // 007: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 00a: ldc2_w 194080076253066315
      // 00d: astore 8
      // 00f: astore 7
      // 011: ldc2_w 194080076253066315
      // 014: aload 7
      // 016: aload 8
      // 018: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 01b: goto 022
      // 01e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 021: athrow
      // 022: pop
      // 023: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 026: ldc2_w 270389152141252877
      // 029: astore 9
      // 02b: ldc2_w 270389152141252877
      // 02e: aload 9
      // 030: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 033: goto 03a
      // 036: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 039: athrow
      // 03a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 03d: ldc2_w 445913128761932285
      // 040: astore 12
      // 042: astore 11
      // 044: ldc2_w 445913128761932285
      // 047: aload 11
      // 049: aload 12
      // 04b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 04e: goto 055
      // 051: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 054: athrow
      // 055: aload 0
      // 056: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 059: ldc2_w 194080076253066315
      // 05c: astore 14
      // 05e: astore 13
      // 060: ldc2_w 194080076253066315
      // 063: aload 13
      // 065: aload 14
      // 067: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 06a: goto 071
      // 06d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 070: athrow
      // 071: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 074: ldc2_w 342864006414696382
      // 077: astore 16
      // 079: astore 15
      // 07b: ldc2_w 342864006414696382
      // 07e: aload 15
      // 080: aload 16
      // 082: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 085: checkcast java/lang/Long
      // 088: invokevirtual java/lang/Long.longValue ()J
      // 08b: goto 092
      // 08e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 091: athrow
      // 092: lstore 3
      // 093: aload 0
      // 094: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 097: ldc2_w 250994717747568331
      // 09a: astore 18
      // 09c: astore 17
      // 09e: ldc2_w 250994717747568331
      // 0a1: aload 17
      // 0a3: aload 18
      // 0a5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a8: checkcast java/lang/Long
      // 0ab: invokevirtual java/lang/Long.longValue ()J
      // 0ae: goto 0b5
      // 0b1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b4: athrow
      // 0b5: lstore 5
      // 0b7: lload 3
      // 0b8: lconst_0
      // 0b9: lcmp
      // 0ba: iload 1
      // 0bb: ifeq 0d3
      // 0be: ifle 176
      // 0c1: goto 0c8
      // 0c4: invokestatic com/finalshell/core/Le4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c7: athrow
      // 0c8: lload 5
      // 0ca: lconst_0
      // 0cb: lcmp
      // 0cc: goto 0d3
      // 0cf: invokestatic com/finalshell/core/Le4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d2: athrow
      // 0d3: iload 1
      // 0d4: ifeq 0ec
      // 0d7: ifle 176
      // 0da: goto 0e1
      // 0dd: invokestatic com/finalshell/core/Le4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e0: athrow
      // 0e1: lload 3
      // 0e2: lload 5
      // 0e4: lcmp
      // 0e5: goto 0ec
      // 0e8: invokestatic com/finalshell/core/Le4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0eb: athrow
      // 0ec: iload 1
      // 0ed: ifeq 125
      // 0f0: ifle 170
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/core/Le4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f9: athrow
      // 0fa: lload 3
      // 0fb: aload 0
      // 0fc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0ff: ldc2_w 365199820804367683
      // 102: astore 20
      // 104: astore 19
      // 106: ldc2_w 365199820804367683
      // 109: aload 19
      // 10b: aload 20
      // 10d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 110: checkcast java/lang/Long
      // 113: invokevirtual java/lang/Long.longValue ()J
      // 116: goto 11d
      // 119: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 11c: athrow
      // 11d: lcmp
      // 11e: goto 125
      // 121: invokestatic com/finalshell/core/Le4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 124: athrow
      // 125: iload 1
      // 126: ifeq 15e
      // 129: ifle 170
      // 12c: goto 133
      // 12f: invokestatic com/finalshell/core/Le4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 132: athrow
      // 133: lload 3
      // 134: aload 0
      // 135: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 138: ldc2_w 129455468056315956
      // 13b: astore 22
      // 13d: astore 21
      // 13f: ldc2_w 129455468056315956
      // 142: aload 21
      // 144: aload 22
      // 146: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 149: checkcast java/lang/Long
      // 14c: invokevirtual java/lang/Long.longValue ()J
      // 14f: goto 156
      // 152: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 155: athrow
      // 156: lcmp
      // 157: goto 15e
      // 15a: invokestatic com/finalshell/core/Le4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15d: athrow
      // 15e: iload 1
      // 15f: ifeq 16d
      // 162: ifle 170
      // 165: goto 16c
      // 168: invokestatic com/finalshell/core/Le4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16b: athrow
      // 16c: bipush 1
      // 16d: goto 171
      // 170: bipush 0
      // 171: istore 2
      // 172: iload 2
      // 173: ifeq 176
      // 176: goto 17e
      // 179: astore 3
      // 17a: aload 3
      // 17b: invokevirtual java/lang/Exception.printStackTrace ()V
      // 17e: iload 2
      // 17f: ireturn
   }

   public static boolean T(L1 var0) {
      long var10;
      long var12;
      long var15;
      Object[] var8;
      Ln4_2.R();
      int var2 = 0;
      Object[] var10002 = Registry.emptyArgs();
      long var9 = 542058094445767607L;
      var8 = var10002;
      var10002 = Registry.packArgs(Ref.h(542058094445767607L, var8, var9));
      var10 = 417955638237048558L;
      Object var10003 = Ref.h2(417955638237048558L, var10);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      String var3 = (String)var10003;
      Object[] var1 = var10002;
      Registry.emptyArgs();
      var12 = 270389152141252877L;
      Ref.h2(270389152141252877L, var12);
      Object[] var10004 = Registry.emptyArgs();
      var15 = 445913128761932285L;
      Object[] var14 = var10004;
      Ref.h(445913128761932285L, var14, var15);
      Object var10005 = Registry.packArgs(var3);
      long var17 = 342864006414696382L;
      Object var16 = var10005;
      var10005 = Ref.h(342864006414696382L, var16, var17);

      try {
         var26 = (Long)var10005;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      long var4 = var26;
      long var31;
      int var27 = (var31 = var4 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
      if (var1 == null) {
         if (var27 > 0) {
            Object var10006 = Registry.emptyArgs();
            long var19 = 162488024198852693L;
            Object var18 = var10006;
            var10006 = Ref.h(162488024198852693L, var18, var19);

            try {
               var29 = (Long)var10006;
            } catch (InvocationTargetException var20) {
               throw var20.getTargetException();
            }

            long var6 = var29;
            long var32;
            int var30 = (var32 = var4 - var6) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var1 == null) {
               var30 = var30 > 0 ? 1 : 0;
            }

            var2 = var30;
            if (var2 != 0) {
            }
         }

         var27 = var2;
      }

      return var27 != 0;
   }

   public static String x(long var0) {
      SimpleDateFormat var2 = new SimpleDateFormat((String)Registry.lookupField(173797753744067359L).get(null));
      return var2.format(new Date(var0));
   }

   public static long s(String var0) {
      SimpleDateFormat var1 = new SimpleDateFormat((String)Registry.lookupField(173797753744067359L).get(null));
      var1.setTimeZone(TimeZone.getTimeZone(a(-30861, -15624)));
      Date var2 = null;

      try {
         var2 = var1.parse(var0);
      } catch (ParseException var4) {
         var4.printStackTrace();
      }

      return var2.getTime();
   }

   public static String M(String var0) {
      int var1 = var0.indexOf("_");
      String var2 = null;
      if (var1 > -1) {
         var2 = var0.substring(0, var1 - 1);
      }

      return var2;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static ArrayList J(ArrayList var0, ArrayList var1, Ln4_2 var2) {
      Iterator var10;
      Object[] var12;
      long var13;
      long var15;
      long var26;
      boolean var40;
      HashSet var6;
      HashMap var8;
      boolean var10000 = Ln4_2.i();
      var6 = new HashSet();
      HashMap var7 = new HashMap();
      var8 = new HashMap();
      boolean var3 = var10000;
      ArrayList var9 = new ArrayList();
      var10 = var0.iterator();

      while (true) {
         if (var10.hasNext()) {
            Ln4_2 var11 = (Ln4_2)var10.next();
            String var10002 = (String)(Registry.emptyArgs());
            var13 = 194080076253066315L;
            var12 = var10002;
            var10002 = Ref.h(194080076253066315L, var12, var13);

            try {
               var10002 = (String)var10002;
            } catch (InvocationTargetException var35) {
               throw var35.getTargetException();
            }

            var11.put(var10002, var11);
            if (!var3) {
               break;
            }

            if (var3) {
               continue;
            }
         }

         var10 = var1.iterator();
         break;
      }

      while (true) {
         if (var10.hasNext()) {
            Ln4_2 var37 = (Ln4_2)var10.next();
            var40 = (boolean)(var8);
            String var46 = (String)(Registry.emptyArgs());
            var15 = 194080076253066315L;
            Object var14 = var46;
            var46 = Ref.h(194080076253066315L, var14, var15);

            try {
               var46 = (String)var46;
            } catch (InvocationTargetException var33) {
               throw var33.getTargetException();
            }

            var37.put(var46, var37);
            String var10003 = (String)(Registry.emptyArgs());
            long var17 = 194080076253066315L;
            Object var16 = var10003;
            var10003 = Ref.h(194080076253066315L, var16, var17);

            try {
               var10003 = (String)var10003;
            } catch (InvocationTargetException var32) {
               throw var32.getTargetException();
            }

            boolean var49 = var37.containsKey(var10003);
            if (!var3) {
               break;
            }

            if (var3) {
               if (var49) {
                  String var10004 = (String)(Registry.emptyArgs());
                  long var19 = 194080076253066315L;
                  Object var18 = var10004;
                  var10004 = Ref.h(194080076253066315L, var18, var19);

                  try {
                     var10004 = (String)var10004;
                  } catch (InvocationTargetException var34) {
                     throw var34.getTargetException();
                  }

                  var37.add(var10004);
               }
            }

            if (var3) {
               continue;
            }
         }

         var10 = var0.iterator();
         var40 = var10.hasNext();
         break;
      }

      label130:
      while (true) {
         label156: {
            if (var40 != false) {
               Ln4_2 var38 = (Ln4_2)var10.next();
               var40 = (boolean)(var6);
               String var50 = (String)(Registry.emptyArgs());
               long var21 = 194080076253066315L;
               Object var20 = var50;
               var50 = Ref.h(194080076253066315L, var20, var21);

               try {
                  var50 = (String)var50;
               } catch (InvocationTargetException var31) {
                  throw var31.getTargetException();
               }

               boolean var10001 = var38.contains(var50);
               if (!var3) {
                  break label156;
               }

               if (var3) {
                  if (!var10001) {
                     var9.add(var38);
                  }
               }

               if (var3) {
                  var10.hasNext();
                  continue;
               }
            }

            var10 = var1.iterator();
            var40 = var10.hasNext();
         }

         while (true) {
            if (var40 == false) {
               break label130;
            }

            Ln4_2 var39 = (Ln4_2)var10.next();
            var40 = (boolean)(var6);
            String var53 = (String)(Registry.emptyArgs());
            long var23 = 194080076253066315L;
            Object var22 = var53;
            var53 = Ref.h(194080076253066315L, var22, var23);

            try {
               var53 = (String)var53;
            } catch (InvocationTargetException var30) {
               throw var30.getTargetException();
            }

            boolean var41 = var39.contains(var53);
            if (var3) {
               if (!var41) {
                  var9.add(var39);
               }
            }

            if (!var3) {
               break label130;
            }

            var10.hasNext();
         }
      }

      Registry.packArgs(var0, var1, var2, var7, var8, var6, var9);
      long var24 = 458116842536415420L;
      Object var42 = Ref.h2(458116842536415420L, var24);

      try {
         var42 = (ArrayList)var42;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      ArrayList var36 = (ArrayList)var42;
      Registry.packArgs(var36);
      var26 = 126626936328477255L;
      Ref.h2(126626936328477255L, var26);

      try {
         return var36;
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }
   }

   public static boolean s(Ln4_2 param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: Invalid argument: OBJECT
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ConstExprent.getZeroConstant(ConstExprent.java:599)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:391)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:256)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:146)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:47)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:302)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ln4_2.i ()Z
      // 03: bipush 0
      // 04: istore 2
      // 05: istore 1
      // 06: aload 0
      // 07: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0a: ldc2_w 293679099616976536
      // 0d: astore 4
      // 0f: astore 3
      // 10: ldc2_w 293679099616976536
      // 13: aload 3
      // 14: aload 4
      // 16: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 19: checkcast java/lang/Long
      // 1c: invokevirtual java/lang/Long.longValue ()J
      // 1f: goto 26
      // 22: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 0
      // 27: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2a: ldc2_w 250994717747568331
      // 2d: astore 6
      // 2f: astore 5
      // 31: ldc2_w 250994717747568331
      // 34: aload 5
      // 36: aload 6
      // 38: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3b: checkcast java/lang/Long
      // 3e: invokevirtual java/lang/Long.longValue ()J
      // 41: goto 48
      // 44: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 47: athrow
      // 48: lcmp
      // 49: iload 1
      // 4a: ifeq eb
      // 4d: ifle ea
      // 50: aload 0
      // 51: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 54: ldc2_w 293679099616976536
      // 57: astore 8
      // 59: astore 7
      // 5b: ldc2_w 293679099616976536
      // 5e: aload 7
      // 60: aload 8
      // 62: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 65: checkcast java/lang/Long
      // 68: invokevirtual java/lang/Long.longValue ()J
      // 6b: goto 72
      // 6e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 71: athrow
      // 72: aload 0
      // 73: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 76: ldc2_w 425033738737227335
      // 79: astore 10
      // 7b: astore 9
      // 7d: ldc2_w 425033738737227335
      // 80: aload 9
      // 82: aload 10
      // 84: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 87: checkcast java/lang/Long
      // 8a: invokevirtual java/lang/Long.longValue ()J
      // 8d: goto 94
      // 90: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 93: athrow
      // 94: lcmp
      // 95: iload 1
      // 96: ifeq eb
      // 99: ifle ea
      // 9c: aload 0
      // 9d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // a0: ldc2_w 293679099616976536
      // a3: astore 12
      // a5: astore 11
      // a7: ldc2_w 293679099616976536
      // aa: aload 11
      // ac: aload 12
      // ae: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // b1: checkcast java/lang/Long
      // b4: invokevirtual java/lang/Long.longValue ()J
      // b7: goto be
      // ba: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // bd: athrow
      // be: aload 0
      // bf: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // c2: ldc2_w 365199820804367683
      // c5: astore 14
      // c7: astore 13
      // c9: ldc2_w 365199820804367683
      // cc: aload 13
      // ce: aload 14
      // d0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // d3: checkcast java/lang/Long
      // d6: invokevirtual java/lang/Long.longValue ()J
      // d9: goto e0
      // dc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // df: athrow
      // e0: lcmp
      // e1: iload 1
      // e2: ifeq eb
      // e5: ifle ea
      // e8: bipush 1
      // e9: istore 2
      // ea: iload 2
      // eb: ireturn
   }

   public static boolean j(Ln4_2 var0, Ln4_2 var1) {
      boolean var10;
      boolean var12;
      long var6;
      boolean var10000 = Ln4_2.R();
      boolean var3 = false;
      boolean var2 = var10000;
      Registry.packArgs(var0, var1);
      long var4 = 277259145237763747L;
      Z var10001 = (Z)Ref.h2(277259145237763747L, var4);

      try {
         var10 = (Boolean)var10001;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      if (!var2) {
         if (!var10) {
            var10001 = Registry.packArgs(var1, var0);
            var6 = 277259145237763747L;
            Object var10002 = Ref.h2(277259145237763747L, var6);

            try {
               var12 = (Boolean)var10002;
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            if (var2) {
               return (boolean)var10001;
            }

            if (!var12) {
               return var3;
            }
         }

         var10 = true;
      }

      return var10;
   }

   public static boolean t(Ln4_2 param0, Ln4_2 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: Invalid argument: OBJECT
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ConstExprent.getZeroConstant(ConstExprent.java:599)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:391)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:256)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:146)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:47)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:302)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ln4_2.i ()Z
      // 03: bipush 0
      // 04: istore 3
      // 05: istore 2
      // 06: aload 0
      // 07: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0a: ldc2_w 293679099616976536
      // 0d: astore 7
      // 0f: astore 6
      // 11: ldc2_w 293679099616976536
      // 14: aload 6
      // 16: aload 7
      // 18: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1b: checkcast java/lang/Long
      // 1e: invokevirtual java/lang/Long.longValue ()J
      // 21: goto 28
      // 24: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 27: athrow
      // 28: lstore 4
      // 2a: aload 0
      // 2b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2e: ldc2_w 344808824174229373
      // 31: astore 8
      // 33: ldc2_w 344808824174229373
      // 36: aload 8
      // 38: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 3b: checkcast java/lang/Boolean
      // 3e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 41: goto 48
      // 44: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 47: athrow
      // 48: iload 2
      // 49: ifeq d6
      // 4c: ifeq d5
      // 4f: lload 4
      // 51: aload 1
      // 52: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 55: ldc2_w 250994717747568331
      // 58: astore 11
      // 5a: astore 10
      // 5c: ldc2_w 250994717747568331
      // 5f: aload 10
      // 61: aload 11
      // 63: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 66: checkcast java/lang/Long
      // 69: invokevirtual java/lang/Long.longValue ()J
      // 6c: goto 73
      // 6f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 72: athrow
      // 73: lcmp
      // 74: iload 2
      // 75: ifeq d6
      // 78: ifle d5
      // 7b: lload 4
      // 7d: aload 1
      // 7e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 81: ldc2_w 425033738737227335
      // 84: astore 13
      // 86: astore 12
      // 88: ldc2_w 425033738737227335
      // 8b: aload 12
      // 8d: aload 13
      // 8f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 92: checkcast java/lang/Long
      // 95: invokevirtual java/lang/Long.longValue ()J
      // 98: goto 9f
      // 9b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 9e: athrow
      // 9f: lcmp
      // a0: iload 2
      // a1: ifeq d6
      // a4: ifle d5
      // a7: lload 4
      // a9: aload 1
      // aa: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // ad: ldc2_w 365199820804367683
      // b0: astore 15
      // b2: astore 14
      // b4: ldc2_w 365199820804367683
      // b7: aload 14
      // b9: aload 15
      // bb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // be: checkcast java/lang/Long
      // c1: invokevirtual java/lang/Long.longValue ()J
      // c4: goto cb
      // c7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // ca: athrow
      // cb: lcmp
      // cc: iload 2
      // cd: ifeq d6
      // d0: ifle d5
      // d3: bipush 1
      // d4: istore 3
      // d5: iload 3
      // d6: ireturn
   }

   public static ArrayList d(ArrayList param0, ArrayList param1, Ln4_2 param2, HashMap param3, HashMap param4, HashSet param5, ArrayList param6) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: Invalid argument: OBJECT
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ConstExprent.getZeroConstant(ConstExprent.java:599)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:391)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:256)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:146)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:47)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:302)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ln4_2.R ()Z
      // 003: aload 0
      // 004: astore 8
      // 006: aload 1
      // 007: astore 9
      // 009: aload 6
      // 00b: astore 10
      // 00d: new java/util/ArrayList
      // 010: dup
      // 011: invokespecial java/util/ArrayList.<init> ()V
      // 014: astore 11
      // 016: aload 10
      // 018: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 01b: astore 12
      // 01d: istore 7
      // 01f: aload 12
      // 021: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 026: ifeq 054
      // 029: aload 12
      // 02b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 030: checkcast com/finalshell/core/Ln4_2
      // 033: astore 13
      // 035: bipush 0
      // 036: istore 14
      // 038: iload 14
      // 03a: iload 7
      // 03c: ifne 062
      // 03f: iload 7
      // 041: ifne 04e
      // 044: ifne 04f
      // 047: aload 11
      // 049: aload 13
      // 04b: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 04e: pop
      // 04f: iload 7
      // 051: ifeq 01f
      // 054: aload 5
      // 056: invokevirtual java/util/HashSet.iterator ()Ljava/util/Iterator;
      // 059: astore 12
      // 05b: aload 12
      // 05d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 062: ifeq 623
      // 065: aload 12
      // 067: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 06c: checkcast java/lang/String
      // 06f: astore 13
      // 071: aload 3
      // 072: aload 13
      // 074: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 077: checkcast com/finalshell/core/Ln4_2
      // 07a: astore 14
      // 07c: aload 4
      // 07e: aload 13
      // 080: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 083: checkcast com/finalshell/core/Ln4_2
      // 086: astore 15
      // 088: bipush 0
      // 089: istore 16
      // 08b: iload 16
      // 08d: ifne 61e
      // 090: aload 14
      // 092: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 095: ldc2_w 286931176286176762
      // 098: astore 34
      // 09a: astore 33
      // 09c: ldc2_w 286931176286176762
      // 09f: aload 33
      // 0a1: aload 34
      // 0a3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a6: checkcast java/lang/String
      // 0a9: goto 0b0
      // 0ac: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0af: athrow
      // 0b0: astore 17
      // 0b2: aload 14
      // 0b4: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0b7: ldc2_w 425033738737227335
      // 0ba: astore 36
      // 0bc: astore 35
      // 0be: ldc2_w 425033738737227335
      // 0c1: aload 35
      // 0c3: aload 36
      // 0c5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0c8: checkcast java/lang/Long
      // 0cb: invokevirtual java/lang/Long.longValue ()J
      // 0ce: goto 0d5
      // 0d1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0d4: athrow
      // 0d5: lstore 18
      // 0d7: aload 14
      // 0d9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0dc: ldc2_w 250994717747568331
      // 0df: astore 38
      // 0e1: astore 37
      // 0e3: ldc2_w 250994717747568331
      // 0e6: aload 37
      // 0e8: aload 38
      // 0ea: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0ed: checkcast java/lang/Long
      // 0f0: invokevirtual java/lang/Long.longValue ()J
      // 0f3: goto 0fa
      // 0f6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0f9: athrow
      // 0fa: lstore 20
      // 0fc: aload 14
      // 0fe: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 101: ldc2_w 365199820804367683
      // 104: astore 40
      // 106: astore 39
      // 108: ldc2_w 365199820804367683
      // 10b: aload 39
      // 10d: aload 40
      // 10f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 112: checkcast java/lang/Long
      // 115: invokevirtual java/lang/Long.longValue ()J
      // 118: goto 11f
      // 11b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 11e: athrow
      // 11f: lstore 22
      // 121: aload 14
      // 123: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 126: ldc2_w 622590009271170486
      // 129: astore 42
      // 12b: astore 41
      // 12d: ldc2_w 622590009271170486
      // 130: aload 41
      // 132: aload 42
      // 134: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 137: checkcast java/lang/Long
      // 13a: invokevirtual java/lang/Long.longValue ()J
      // 13d: goto 144
      // 140: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 143: athrow
      // 144: lstore 24
      // 146: aload 14
      // 148: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 14b: ldc2_w 145535910876897139
      // 14e: astore 44
      // 150: astore 43
      // 152: ldc2_w 145535910876897139
      // 155: aload 43
      // 157: aload 44
      // 159: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 15c: checkcast java/lang/Integer
      // 15f: invokevirtual java/lang/Integer.intValue ()I
      // 162: goto 169
      // 165: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 168: athrow
      // 169: istore 26
      // 16b: aload 14
      // 16d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 170: ldc2_w 486394744877445362
      // 173: astore 46
      // 175: astore 45
      // 177: ldc2_w 486394744877445362
      // 17a: aload 45
      // 17c: aload 46
      // 17e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 181: checkcast java/lang/Long
      // 184: invokevirtual java/lang/Long.longValue ()J
      // 187: goto 18e
      // 18a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 18d: athrow
      // 18e: lstore 27
      // 190: aload 14
      // 192: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 195: ldc2_w 129455468056315956
      // 198: astore 48
      // 19a: astore 47
      // 19c: ldc2_w 129455468056315956
      // 19f: aload 47
      // 1a1: aload 48
      // 1a3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1a6: checkcast java/lang/Long
      // 1a9: invokevirtual java/lang/Long.longValue ()J
      // 1ac: goto 1b3
      // 1af: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1b2: athrow
      // 1b3: lstore 29
      // 1b5: aload 14
      // 1b7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1ba: ldc2_w 413442976446181537
      // 1bd: astore 50
      // 1bf: astore 49
      // 1c1: ldc2_w 413442976446181537
      // 1c4: aload 49
      // 1c6: aload 50
      // 1c8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1cb: checkcast java/lang/String
      // 1ce: goto 1d5
      // 1d1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1d4: athrow
      // 1d5: astore 31
      // 1d7: aload 14
      // 1d9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1dc: ldc2_w 425033738737227335
      // 1df: astore 52
      // 1e1: astore 51
      // 1e3: ldc2_w 425033738737227335
      // 1e6: aload 51
      // 1e8: aload 52
      // 1ea: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ed: checkcast java/lang/Long
      // 1f0: invokevirtual java/lang/Long.longValue ()J
      // 1f3: goto 1fa
      // 1f6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1f9: athrow
      // 1fa: lstore 18
      // 1fc: aload 15
      // 1fe: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 201: ldc2_w 425033738737227335
      // 204: astore 54
      // 206: astore 53
      // 208: ldc2_w 425033738737227335
      // 20b: aload 53
      // 20d: aload 54
      // 20f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 212: checkcast java/lang/Long
      // 215: invokevirtual java/lang/Long.longValue ()J
      // 218: goto 21f
      // 21b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 21e: athrow
      // 21f: aload 14
      // 221: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 224: ldc2_w 425033738737227335
      // 227: astore 56
      // 229: astore 55
      // 22b: ldc2_w 425033738737227335
      // 22e: aload 55
      // 230: aload 56
      // 232: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 235: checkcast java/lang/Long
      // 238: invokevirtual java/lang/Long.longValue ()J
      // 23b: goto 242
      // 23e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 241: athrow
      // 242: lcmp
      // 243: iload 7
      // 245: ifne 2fe
      // 248: ifle 292
      // 24b: aload 15
      // 24d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 250: ldc2_w 286931176286176762
      // 253: astore 58
      // 255: astore 57
      // 257: ldc2_w 286931176286176762
      // 25a: aload 57
      // 25c: aload 58
      // 25e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 261: checkcast java/lang/String
      // 264: goto 26b
      // 267: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 26a: athrow
      // 26b: astore 17
      // 26d: aload 15
      // 26f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 272: ldc2_w 425033738737227335
      // 275: astore 60
      // 277: astore 59
      // 279: ldc2_w 425033738737227335
      // 27c: aload 59
      // 27e: aload 60
      // 280: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 283: checkcast java/lang/Long
      // 286: invokevirtual java/lang/Long.longValue ()J
      // 289: goto 290
      // 28c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 28f: athrow
      // 290: lstore 18
      // 292: aload 14
      // 294: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 297: ldc2_w 622590009271170486
      // 29a: astore 62
      // 29c: astore 61
      // 29e: ldc2_w 622590009271170486
      // 2a1: aload 61
      // 2a3: aload 62
      // 2a5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2a8: checkcast java/lang/Long
      // 2ab: invokevirtual java/lang/Long.longValue ()J
      // 2ae: goto 2b5
      // 2b1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2b4: athrow
      // 2b5: lstore 24
      // 2b7: aload 15
      // 2b9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2bc: ldc2_w 622590009271170486
      // 2bf: astore 64
      // 2c1: astore 63
      // 2c3: ldc2_w 622590009271170486
      // 2c6: aload 63
      // 2c8: aload 64
      // 2ca: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2cd: checkcast java/lang/Long
      // 2d0: invokevirtual java/lang/Long.longValue ()J
      // 2d3: goto 2da
      // 2d6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2d9: athrow
      // 2da: aload 14
      // 2dc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2df: ldc2_w 622590009271170486
      // 2e2: astore 66
      // 2e4: astore 65
      // 2e6: ldc2_w 622590009271170486
      // 2e9: aload 65
      // 2eb: aload 66
      // 2ed: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2f0: checkcast java/lang/Long
      // 2f3: invokevirtual java/lang/Long.longValue ()J
      // 2f6: goto 2fd
      // 2f9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2fc: athrow
      // 2fd: lcmp
      // 2fe: iload 7
      // 300: ifne 372
      // 303: ifle 32b
      // 306: aload 15
      // 308: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 30b: ldc2_w 622590009271170486
      // 30e: astore 68
      // 310: astore 67
      // 312: ldc2_w 622590009271170486
      // 315: aload 67
      // 317: aload 68
      // 319: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 31c: checkcast java/lang/Long
      // 31f: invokevirtual java/lang/Long.longValue ()J
      // 322: goto 329
      // 325: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 328: athrow
      // 329: lstore 24
      // 32b: aload 15
      // 32d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 330: ldc2_w 129455468056315956
      // 333: astore 70
      // 335: astore 69
      // 337: ldc2_w 129455468056315956
      // 33a: aload 69
      // 33c: aload 70
      // 33e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 341: checkcast java/lang/Long
      // 344: invokevirtual java/lang/Long.longValue ()J
      // 347: goto 34e
      // 34a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 34d: athrow
      // 34e: aload 14
      // 350: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 353: ldc2_w 129455468056315956
      // 356: astore 72
      // 358: astore 71
      // 35a: ldc2_w 129455468056315956
      // 35d: aload 71
      // 35f: aload 72
      // 361: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 364: checkcast java/lang/Long
      // 367: invokevirtual java/lang/Long.longValue ()J
      // 36a: goto 371
      // 36d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 370: athrow
      // 371: lcmp
      // 372: iload 7
      // 374: ifne 40d
      // 377: ifle 3c1
      // 37a: aload 15
      // 37c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 37f: ldc2_w 129455468056315956
      // 382: astore 74
      // 384: astore 73
      // 386: ldc2_w 129455468056315956
      // 389: aload 73
      // 38b: aload 74
      // 38d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 390: checkcast java/lang/Long
      // 393: invokevirtual java/lang/Long.longValue ()J
      // 396: goto 39d
      // 399: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 39c: athrow
      // 39d: lstore 29
      // 39f: aload 15
      // 3a1: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3a4: ldc2_w 413442976446181537
      // 3a7: astore 76
      // 3a9: astore 75
      // 3ab: ldc2_w 413442976446181537
      // 3ae: aload 75
      // 3b0: aload 76
      // 3b2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3b5: checkcast java/lang/String
      // 3b8: goto 3bf
      // 3bb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3be: athrow
      // 3bf: astore 31
      // 3c1: aload 15
      // 3c3: iload 7
      // 3c5: ifne 45c
      // 3c8: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3cb: ldc2_w 486394744877445362
      // 3ce: astore 78
      // 3d0: astore 77
      // 3d2: ldc2_w 486394744877445362
      // 3d5: aload 77
      // 3d7: aload 78
      // 3d9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3dc: checkcast java/lang/Long
      // 3df: invokevirtual java/lang/Long.longValue ()J
      // 3e2: goto 3e9
      // 3e5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3e8: athrow
      // 3e9: aload 14
      // 3eb: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3ee: ldc2_w 486394744877445362
      // 3f1: astore 80
      // 3f3: astore 79
      // 3f5: ldc2_w 486394744877445362
      // 3f8: aload 79
      // 3fa: aload 80
      // 3fc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3ff: checkcast java/lang/Long
      // 402: invokevirtual java/lang/Long.longValue ()J
      // 405: goto 40c
      // 408: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 40b: athrow
      // 40c: lcmp
      // 40d: ifle 45a
      // 410: aload 15
      // 412: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 415: ldc2_w 486394744877445362
      // 418: astore 82
      // 41a: astore 81
      // 41c: ldc2_w 486394744877445362
      // 41f: aload 81
      // 421: aload 82
      // 423: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 426: checkcast java/lang/Long
      // 429: invokevirtual java/lang/Long.longValue ()J
      // 42c: goto 433
      // 42f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 432: athrow
      // 433: lstore 27
      // 435: aload 15
      // 437: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 43a: ldc2_w 145535910876897139
      // 43d: astore 84
      // 43f: astore 83
      // 441: ldc2_w 145535910876897139
      // 444: aload 83
      // 446: aload 84
      // 448: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 44b: checkcast java/lang/Integer
      // 44e: invokevirtual java/lang/Integer.intValue ()I
      // 451: goto 458
      // 454: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 457: athrow
      // 458: istore 26
      // 45a: aload 14
      // 45c: astore 32
      // 45e: aload 15
      // 460: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 463: ldc2_w 365199820804367683
      // 466: astore 86
      // 468: astore 85
      // 46a: ldc2_w 365199820804367683
      // 46d: aload 85
      // 46f: aload 86
      // 471: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 474: checkcast java/lang/Long
      // 477: invokevirtual java/lang/Long.longValue ()J
      // 47a: goto 481
      // 47d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 480: athrow
      // 481: aload 14
      // 483: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 486: ldc2_w 365199820804367683
      // 489: astore 88
      // 48b: astore 87
      // 48d: ldc2_w 365199820804367683
      // 490: aload 87
      // 492: aload 88
      // 494: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 497: checkcast java/lang/Long
      // 49a: invokevirtual java/lang/Long.longValue ()J
      // 49d: goto 4a4
      // 4a0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4a3: athrow
      // 4a4: lcmp
      // 4a5: iload 7
      // 4a7: ifne 61d
      // 4aa: ifle 4d6
      // 4ad: aload 15
      // 4af: astore 32
      // 4b1: aload 15
      // 4b3: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4b6: ldc2_w 365199820804367683
      // 4b9: astore 90
      // 4bb: astore 89
      // 4bd: ldc2_w 365199820804367683
      // 4c0: aload 89
      // 4c2: aload 90
      // 4c4: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4c7: checkcast java/lang/Long
      // 4ca: invokevirtual java/lang/Long.longValue ()J
      // 4cd: goto 4d4
      // 4d0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4d3: athrow
      // 4d4: lstore 22
      // 4d6: aload 32
      // 4d8: aload 13
      // 4da: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4dd: ldc2_w 416906230259364838
      // 4e0: astore 92
      // 4e2: astore 91
      // 4e4: ldc2_w 416906230259364838
      // 4e7: aload 91
      // 4e9: aload 92
      // 4eb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4ee: pop
      // 4ef: goto 4f6
      // 4f2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4f5: athrow
      // 4f6: aload 32
      // 4f8: lload 20
      // 4fa: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 4fd: ldc2_w 632174181210947576
      // 500: astore 94
      // 502: astore 93
      // 504: ldc2_w 632174181210947576
      // 507: aload 93
      // 509: aload 94
      // 50b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 50e: pop
      // 50f: goto 516
      // 512: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 515: athrow
      // 516: aload 32
      // 518: lload 22
      // 51a: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 51d: ldc2_w 448034136929726083
      // 520: astore 96
      // 522: astore 95
      // 524: ldc2_w 448034136929726083
      // 527: aload 95
      // 529: aload 96
      // 52b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 52e: pop
      // 52f: goto 536
      // 532: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 535: athrow
      // 536: aload 32
      // 538: lload 24
      // 53a: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 53d: ldc2_w 561144248899778332
      // 540: astore 98
      // 542: astore 97
      // 544: ldc2_w 561144248899778332
      // 547: aload 97
      // 549: aload 98
      // 54b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 54e: pop
      // 54f: goto 556
      // 552: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 555: athrow
      // 556: aload 32
      // 558: aload 31
      // 55a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 55d: ldc2_w 579965879482954180
      // 560: astore 100
      // 562: astore 99
      // 564: ldc2_w 579965879482954180
      // 567: aload 99
      // 569: aload 100
      // 56b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 56e: pop
      // 56f: goto 576
      // 572: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 575: athrow
      // 576: aload 32
      // 578: lload 29
      // 57a: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 57d: ldc2_w 275634842768439116
      // 580: astore 102
      // 582: astore 101
      // 584: ldc2_w 275634842768439116
      // 587: aload 101
      // 589: aload 102
      // 58b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 58e: pop
      // 58f: goto 596
      // 592: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 595: athrow
      // 596: aload 32
      // 598: aload 17
      // 59a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 59d: ldc2_w 193904661956891993
      // 5a0: astore 104
      // 5a2: astore 103
      // 5a4: ldc2_w 193904661956891993
      // 5a7: aload 103
      // 5a9: aload 104
      // 5ab: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5ae: pop
      // 5af: goto 5b6
      // 5b2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5b5: athrow
      // 5b6: aload 32
      // 5b8: lload 18
      // 5ba: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 5bd: ldc2_w 379623615202365815
      // 5c0: astore 106
      // 5c2: astore 105
      // 5c4: ldc2_w 379623615202365815
      // 5c7: aload 105
      // 5c9: aload 106
      // 5cb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5ce: pop
      // 5cf: goto 5d6
      // 5d2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5d5: athrow
      // 5d6: aload 32
      // 5d8: iload 26
      // 5da: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 5dd: ldc2_w 470936572593593753
      // 5e0: astore 108
      // 5e2: astore 107
      // 5e4: ldc2_w 470936572593593753
      // 5e7: aload 107
      // 5e9: aload 108
      // 5eb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5ee: pop
      // 5ef: goto 5f6
      // 5f2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5f5: athrow
      // 5f6: aload 32
      // 5f8: lload 27
      // 5fa: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 5fd: ldc2_w 632351682711676131
      // 600: astore 110
      // 602: astore 109
      // 604: ldc2_w 632351682711676131
      // 607: aload 109
      // 609: aload 110
      // 60b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 60e: pop
      // 60f: goto 616
      // 612: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 615: athrow
      // 616: aload 11
      // 618: aload 32
      // 61a: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 61d: pop
      // 61e: iload 7
      // 620: ifeq 05b
      // 623: aload 11
      // 625: areturn
   }

   public static void O(ArrayList var0) {
      Collections.sort(var0, new Jl2());
   }

   public static void b(Ln4_2 var0, O0 var1) {
      Object[] var10;
      Object[] var12;
      long var13;
      long var15;
      Integer var42;
      Long var48;
      long var5;
      Long var51;
      Long var54;
      Long var57;
      Object[] var6;
      Long var60;
      Long var63;
      Long var65;
      Object[] var8;
      String var10001 = a(-30856, 16677);
      String var10003 = (String)(Registry.emptyArgs());
      long var3 = 194080076253066315L;
      Object var2 = var10003;
      var10003 = Ref.h(194080076253066315L, var2, var3);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      var10001.C(var0, var10003);
      String var10002 = a(-30866, 14376);
      String var10004 = (String)(Registry.emptyArgs());
      var5 = 413442976446181537L;
      Object var4 = var10004;
      var10004 = Ref.h(413442976446181537L, var4, var5);

      try {
         var10004 = (String)var10004;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      var10002.C(var0, var10004);
      String var37 = a(-30853, 20553);
      Object var10005 = Registry.emptyArgs();
      long var7 = 145535910876897139L;
      var6 = var10005;
      var10005 = Ref.h(145535910876897139L, var6, var7);

      try {
         var42 = (Integer)var10005;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      var37.C(var0, var42);
      String var40 = a(-30863, 7289);
      String var10006 = (String)(Registry.emptyArgs());
      long var9 = 286931176286176762L;
      var8 = var10006;
      var10006 = Ref.h(286931176286176762L, var8, var9);

      try {
         var10006 = (String)var10006;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      var40.C(var0, var10006);
      String var43 = a(-30871, 20620);
      Object var10007 = Registry.emptyArgs();
      long var11 = 250994717747568331L;
      var10 = var10007;
      var10007 = Ref.h(250994717747568331L, var10, var11);

      try {
         var48 = (Long)var10007;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }

      var43.C(var0, var48);
      String var46 = a(-30860, 24382);
      Object var10008 = Registry.emptyArgs();
      var13 = 425033738737227335L;
      var12 = var10008;
      var10008 = Ref.h(425033738737227335L, var12, var13);

      try {
         var51 = (Long)var10008;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      var46.C(var0, var51);
      String var49 = a(-30854, 19401);
      Object var10009 = Registry.emptyArgs();
      var15 = 365199820804367683L;
      Object var14 = var10009;
      var10009 = Ref.h(365199820804367683L, var14, var15);

      try {
         var54 = (Long)var10009;
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      var49.C(var0, var54);
      String var52 = a(-30852, -24884);
      Object var10010 = Registry.emptyArgs();
      long var17 = 622590009271170486L;
      Object var16 = var10010;
      var10010 = Ref.h(622590009271170486L, var16, var17);

      try {
         var57 = (Long)var10010;
      } catch (InvocationTargetException var27) {
         throw var27.getTargetException();
      }

      var52.C(var0, var57);
      String var55 = a(-30879, 11737);
      Object var10011 = Registry.emptyArgs();
      long var19 = 293679099616976536L;
      Object var18 = var10011;
      var10011 = Ref.h(293679099616976536L, var18, var19);

      try {
         var60 = (Long)var10011;
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }

      var55.C(var0, var60);
      String var58 = a(-30864, 30164);
      Object var10012 = Registry.emptyArgs();
      long var21 = 486394744877445362L;
      Object var20 = var10012;
      var10012 = Ref.h(486394744877445362L, var20, var21);

      try {
         var63 = (Long)var10012;
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      var58.C(var0, var63);
      String var61 = a(-30849, -23602);
      Object var10013 = Registry.emptyArgs();
      long var23 = 129455468056315956L;
      Object var22 = var10013;
      var10013 = Ref.h(129455468056315956L, var22, var23);

      try {
         var65 = (Long)var10013;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      var61.C(var0, var65);
   }

   public static void B(Ln4_2 var0, O0 var1) {
      Object[] var10;
      Object[] var12;
      long var13;
      long var15;
      long var5;
      Object[] var6;
      Object[] var8;
      Ln4_2.i();
      Object[] var10002 = Registry.packArgs(var1.C$String(a(-30867, 1361)));
      var5 = 416906230259364838L;
      Object[] var4 = var10002;
      Ref.h(416906230259364838L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      Ln4_2 var10001;
      label125: {
         String var3 = var1.C$String(a(-30874, -11363));
         if (var0 == null) {
            if (var3 != null) {
               var10001 = (Ln4_2)(var3.equals(a(-30857, -9105)));
               if (var0 == null) {
                  break label125;
               }

               if (var10001 == null) {
                  var3 = a(-30869, -27987);
               }
            }

            var10002 = Registry.packArgs(var3);
            long var7 = 579965879482954180L;
            var6 = var10002;
            Ref.h(579965879482954180L, var6, var7);

            try {
               ;
            } catch (InvocationTargetException var35) {
               throw var35.getTargetException();
            }
         }

         var10001 = (Ln4_2)(var1.containsKey(a(-30907, -14136)));
      }

      if (var0 == null) {
         if (var10001 == null) {
            var10002 = Registry.packArgs(var1.b(a(-30907, -14136)));
            long var9 = 470936572593593753L;
            var8 = var10002;
            Ref.h(470936572593593753L, var8, var9);

            try {
               ;
            } catch (InvocationTargetException var34) {
               throw var34.getTargetException();
            }
         }

         var10001 = (Ln4_2)(var1.containsKey(a(-30859, -11238)));
      }

      if (var0 == null) {
         if (var10001 == null) {
            var1.C(a(-30859, -11238), var1.C$String(a(-30867, 1361)));
         }

         var10001 = var0;
         var10002 = Registry.packArgs(var1.C$String(a(-30859, -11238)));
         long var11 = 193904661956891993L;
         var10 = var10002;
         Ref.h(193904661956891993L, var10, var11);

         try {
            ;
         } catch (InvocationTargetException var33) {
            throw var33.getTargetException();
         }

         Object[] var10003 = Registry.e(var1.I(a(-30851, -7230)));
         var13 = 632174181210947576L;
         var12 = var10003;
         Ref.h(632174181210947576L, var12, var13);

         try {
            ;
         } catch (InvocationTargetException var32) {
            throw var32.getTargetException();
         }

         Object[] var10004 = Registry.e(var1.I(a(-30870, -27534)));
         var15 = 379623615202365815L;
         Object[] var14 = var10004;
         Ref.h(379623615202365815L, var14, var15);

         try {
            ;
         } catch (InvocationTargetException var31) {
            throw var31.getTargetException();
         }

         Object[] var10005 = Registry.e(var1.I(a(-30878, -32561)));
         long var17 = 226286836651614495L;
         Object[] var16 = var10005;
         Ref.h(226286836651614495L, var16, var17);

         try {
            ;
         } catch (InvocationTargetException var30) {
            throw var30.getTargetException();
         }

         Object[] var10006 = Registry.e(var1.I(a(-30876, 19869)));
         long var19 = 632351682711676131L;
         Object[] var18 = var10006;
         Ref.h(632351682711676131L, var18, var19);

         try {
            ;
         } catch (InvocationTargetException var29) {
            throw var29.getTargetException();
         }

         Object[] var10007 = Registry.e(var1.I(a(-30877, 9926)));
         long var21 = 448034136929726083L;
         Object[] var20 = var10007;
         Ref.h(448034136929726083L, var20, var21);

         try {
            ;
         } catch (InvocationTargetException var28) {
            throw var28.getTargetException();
         }

         if (var0 == null) {
            return;
         }

         var1.containsKey(a(-30872, 31801));
      }

      if (var10001 == null) {
         var10002 = Registry.e(var1.I(a(-30872, 31801)));
         long var23 = 561144248899778332L;
         Object[] var22 = var10002;
         Ref.h(561144248899778332L, var22, var23);

         try {
            ;
         } catch (InvocationTargetException var27) {
            throw var27.getTargetException();
         }
      }

      var10002 = Registry.e(var1.I(a(-30880, 19717)));
      long var25 = 275634842768439116L;
      Object[] var24 = var10002;
      Ref.h(275634842768439116L, var24, var25);

      try {
         ;
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }
   }

   public static int h(int var0) {
      Registry.packArgs(0, var0);
      long var2 = 186880599905062406L;
      Object var10001 = Ref.h2(186880599905062406L, var2);

      try {
         var5 = (Integer)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      return var5;
   }

   public static int T(int var0) {
      int var1 = a(13968, 8248790901929079574L);
      Registry.packArgs(var0, var1);
      long var3 = 186880599905062406L;
      Object var10001 = Ref.h2(186880599905062406L, var3);

      try {
         var6 = (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      return var6;
   }

   public static int f(int var0, int var1) {
      int var2 = var1 - var0;
      int var3 = (int)((float)var2 * 1.0F / 30.0F);
      return var0 + var2 / a(25074, 6407857658995221623L) + new Random().nextInt((int)((float)var2 * 1.0F / 30.0F));
   }

   public static int[] l(int var0) {
      Integer var13;
      Integer var15;
      long var6;
      int var10000 = (Ln4_2.R()) ? 1 : 0;
      int[] var2 = new int[var0];
      boolean var1 = (var10000) != 0;
      var10000 = var0;
      if (!var1) {
         if (var0 > 0) {
            Object[] var10002 = Registry.packArgs(0);
            long var4 = 153746706510242688L;
            Object var10003 = Ref.h2(153746706510242688L, var4);

            try {
               var13 = (Integer)var10003;
            } catch (InvocationTargetException var9) {
               throw var9.getTargetException();
            }

            ((Object[])false)[var10002] = (boolean)var13;
         }

         var10000 = var0;
      }

      if (!var1) {
         if (var10000 <= 1) {
            return var2;
         }

         var10000 = 1;
      }

      int var3 = var10000;

      while (var3 < var0) {
         if (var1) {
            return var2;
         }

         Object[] var12 = Registry.packArgs(var2[var3 - 1]);
         var6 = 153746706510242688L;
         Object var14 = Ref.h2(153746706510242688L, var6);

         try {
            var15 = (Integer)var14;
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }

         ((Object[])var3)[var12] = var15;
         var3++;
         if (var1) {
            break;
         }
      }

      return var2;
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var6;
      int var8;
      int var2 = (var0 ^ -30875) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 173;
               break;
            case 1:
               var10000 = 124;
               break;
            case 2:
               var10000 = 59;
               break;
            case 3:
               var10000 = 180;
               break;
            case 4:
               var10000 = 8;
               break;
            case 5:
               var10000 = 200;
               break;
            case 6:
               var10000 = 80;
               break;
            case 7:
               var10000 = 82;
               break;
            case 8:
               var10000 = 91;
               break;
            case 9:
               var10000 = 95;
               break;
            case 10:
               var10000 = 105;
               break;
            case 11:
               var10000 = 94;
               break;
            case 12:
               var10000 = 191;
               break;
            case 13:
               var10000 = 203;
               break;
            case 14:
               var10000 = 10;
               break;
            case 15:
               var10000 = 107;
               break;
            case 16:
               var10000 = 110;
               break;
            case 17:
               var10000 = 126;
               break;
            case 18:
               var10000 = 251;
               break;
            case 19:
               var10000 = 209;
               break;
            case 20:
               var10000 = 14;
               break;
            case 21:
               var10000 = 64;
               break;
            case 22:
               var10000 = 172;
               break;
            case 23:
               var10000 = 54;
               break;
            case 24:
               var10000 = 5;
               break;
            case 25:
               var10000 = 89;
               break;
            case 26:
               var10000 = 137;
               break;
            case 27:
               var10000 = 233;
               break;
            case 28:
               var10000 = 85;
               break;
            case 29:
               var10000 = 205;
               break;
            case 30:
               var10000 = 230;
               break;
            case 31:
               var10000 = 96;
               break;
            case 32:
               var10000 = 32;
               break;
            case 33:
               var10000 = 189;
               break;
            case 34:
               var10000 = 174;
               break;
            case 35:
               var10000 = 34;
               break;
            case 36:
               var10000 = 183;
               break;
            case 37:
               var10000 = 222;
               break;
            case 38:
               var10000 = 125;
               break;
            case 39:
               var10000 = 159;
               break;
            case 40:
               var10000 = 211;
               break;
            case 41:
               var10000 = 181;
               break;
            case 42:
               var10000 = 114;
               break;
            case 43:
               var10000 = 102;
               break;
            case 44:
               var10000 = 72;
               break;
            case 45:
               var10000 = 115;
               break;
            case 46:
               var10000 = 33;
               break;
            case 47:
               var10000 = 255;
               break;
            case 48:
               var10000 = 193;
               break;
            case 49:
               var10000 = 139;
               break;
            case 50:
               var10000 = 161;
               break;
            case 51:
               var10000 = 188;
               break;
            case 52:
               var10000 = 6;
               break;
            case 53:
               var10000 = 158;
               break;
            case 54:
               var10000 = 84;
               break;
            case 55:
               var10000 = 157;
               break;
            case 56:
               var10000 = 177;
               break;
            case 57:
               var10000 = 195;
               break;
            case 58:
               var10000 = 212;
               break;
            case 59:
               var10000 = 220;
               break;
            case 60:
               var10000 = 129;
               break;
            case 61:
               var10000 = 12;
               break;
            case 62:
               var10000 = 119;
               break;
            case 63:
               var10000 = 227;
               break;
            case 64:
               var10000 = 104;
               break;
            case 65:
               var10000 = 51;
               break;
            case 66:
               var10000 = 164;
               break;
            case 67:
               var10000 = 187;
               break;
            case 68:
               var10000 = 156;
               break;
            case 69:
               var10000 = 15;
               break;
            case 70:
               var10000 = 237;
               break;
            case 71:
               var10000 = 206;
               break;
            case 72:
               var10000 = 253;
               break;
            case 73:
               var10000 = 101;
               break;
            case 74:
               var10000 = 62;
               break;
            case 75:
               var10000 = 79;
               break;
            case 76:
               var10000 = 140;
               break;
            case 77:
               var10000 = 150;
               break;
            case 78:
               var10000 = 88;
               break;
            case 79:
               var10000 = 179;
               break;
            case 80:
               var10000 = 229;
               break;
            case 81:
               var10000 = 93;
               break;
            case 82:
               var10000 = 252;
               break;
            case 83:
               var10000 = 235;
               break;
            case 84:
               var10000 = 65;
               break;
            case 85:
               var10000 = 113;
               break;
            case 86:
               var10000 = 22;
               break;
            case 87:
               var10000 = 112;
               break;
            case 88:
               var10000 = 231;
               break;
            case 89:
               var10000 = 118;
               break;
            case 90:
               var10000 = 223;
               break;
            case 91:
               var10000 = 90;
               break;
            case 92:
               var10000 = 52;
               break;
            case 93:
               var10000 = 74;
               break;
            case 94:
               var10000 = 103;
               break;
            case 95:
               var10000 = 148;
               break;
            case 96:
               var10000 = 116;
               break;
            case 97:
               var10000 = 50;
               break;
            case 98:
               var10000 = 109;
               break;
            case 99:
               var10000 = 97;
               break;
            case 100:
               var10000 = 141;
               break;
            case 101:
               var10000 = 244;
               break;
            case 102:
               var10000 = 2;
               break;
            case 103:
               var10000 = 30;
               break;
            case 104:
               var10000 = 36;
               break;
            case 105:
               var10000 = 218;
               break;
            case 106:
               var10000 = 100;
               break;
            case 107:
               var10000 = 132;
               break;
            case 108:
               var10000 = 221;
               break;
            case 109:
               var10000 = 204;
               break;
            case 110:
               var10000 = 241;
               break;
            case 111:
               var10000 = 43;
               break;
            case 112:
               var10000 = 21;
               break;
            case 113:
               var10000 = 199;
               break;
            case 114:
               var10000 = 170;
               break;
            case 115:
               var10000 = 111;
               break;
            case 116:
               var10000 = 56;
               break;
            case 117:
               var10000 = 194;
               break;
            case 118:
               var10000 = 238;
               break;
            case 119:
               var10000 = 160;
               break;
            case 120:
               var10000 = 232;
               break;
            case 121:
               var10000 = 61;
               break;
            case 122:
               var10000 = 165;
               break;
            case 123:
               var10000 = 76;
               break;
            case 124:
               var10000 = 142;
               break;
            case 125:
               var10000 = 25;
               break;
            case 126:
               var10000 = 163;
               break;
            case 127:
               var10000 = 48;
               break;
            case 128:
               var10000 = 53;
               break;
            case 129:
               var10000 = 152;
               break;
            case 130:
               var10000 = 45;
               break;
            case 131:
               var10000 = 83;
               break;
            case 132:
               var10000 = 69;
               break;
            case 133:
               var10000 = 248;
               break;
            case 134:
               var10000 = 202;
               break;
            case 135:
               var10000 = 28;
               break;
            case 136:
               var10000 = 166;
               break;
            case 137:
               var10000 = 249;
               break;
            case 138:
               var10000 = 9;
               break;
            case 139:
               var10000 = 144;
               break;
            case 140:
               var10000 = 24;
               break;
            case 141:
               var10000 = 49;
               break;
            case 142:
               var10000 = 13;
               break;
            case 143:
               var10000 = 236;
               break;
            case 144:
               var10000 = 182;
               break;
            case 145:
               var10000 = 68;
               break;
            case 146:
               var10000 = 38;
               break;
            case 147:
               var10000 = 146;
               break;
            case 148:
               var10000 = 215;
               break;
            case 149:
               var10000 = 171;
               break;
            case 150:
               var10000 = 46;
               break;
            case 151:
               var10000 = 134;
               break;
            case 152:
               var10000 = 145;
               break;
            case 153:
               var10000 = 213;
               break;
            case 154:
               var10000 = 27;
               break;
            case 155:
               var10000 = 210;
               break;
            case 156:
               var10000 = 77;
               break;
            case 157:
               var10000 = 208;
               break;
            case 158:
               var10000 = 162;
               break;
            case 159:
               var10000 = 70;
               break;
            case 160:
               var10000 = 3;
               break;
            case 161:
               var10000 = 120;
               break;
            case 162:
               var10000 = 55;
               break;
            case 163:
               var10000 = 11;
               break;
            case 164:
               var10000 = 99;
               break;
            case 165:
               var10000 = 254;
               break;
            case 166:
               var10000 = 81;
               break;
            case 167:
               var10000 = 40;
               break;
            case 168:
               var10000 = 20;
               break;
            case 169:
               var10000 = 122;
               break;
            case 170:
               var10000 = 44;
               break;
            case 171:
               var10000 = 234;
               break;
            case 172:
               var10000 = 149;
               break;
            case 173:
               var10000 = 41;
               break;
            case 174:
               var10000 = 138;
               break;
            case 175:
               var10000 = 75;
               break;
            case 176:
               var10000 = 154;
               break;
            case 177:
               var10000 = 228;
               break;
            case 178:
               var10000 = 127;
               break;
            case 179:
               var10000 = 168;
               break;
            case 180:
               var10000 = 226;
               break;
            case 181:
               var10000 = 108;
               break;
            case 182:
               var10000 = 35;
               break;
            case 183:
               var10000 = 117;
               break;
            case 184:
               var10000 = 243;
               break;
            case 185:
               var10000 = 242;
               break;
            case 186:
               var10000 = 192;
               break;
            case 187:
               var10000 = 39;
               break;
            case 188:
               var10000 = 143;
               break;
            case 189:
               var10000 = 185;
               break;
            case 190:
               var10000 = 37;
               break;
            case 191:
               var10000 = 29;
               break;
            case 192:
               var10000 = 207;
               break;
            case 193:
               var10000 = 201;
               break;
            case 194:
               var10000 = 196;
               break;
            case 195:
               var10000 = 92;
               break;
            case 196:
               var10000 = 186;
               break;
            case 197:
               var10000 = 216;
               break;
            case 198:
               var10000 = 98;
               break;
            case 199:
               var10000 = 31;
               break;
            case 200:
               var10000 = 42;
               break;
            case 201:
               var10000 = 23;
               break;
            case 202:
               var10000 = 245;
               break;
            case 203:
               var10000 = 26;
               break;
            case 204:
               var10000 = 197;
               break;
            case 205:
               var10000 = 224;
               break;
            case 206:
               var10000 = 178;
               break;
            case 207:
               var10000 = 169;
               break;
            case 208:
               var10000 = 123;
               break;
            case 209:
               var10000 = 214;
               break;
            case 210:
               var10000 = 153;
               break;
            case 211:
               var10000 = 135;
               break;
            case 212:
               var10000 = 219;
               break;
            case 213:
               var10000 = 184;
               break;
            case 214:
               var10000 = 130;
               break;
            case 215:
               var10000 = 128;
               break;
            case 216:
               var10000 = 57;
               break;
            case 217:
               var10000 = 18;
               break;
            case 218:
               var10000 = 121;
               break;
            case 219:
               var10000 = 17;
               break;
            case 220:
               var10000 = 19;
               break;
            case 221:
               var10000 = 225;
               break;
            case 222:
               var10000 = 136;
               break;
            case 223:
               var10000 = 78;
               break;
            case 224:
               var10000 = 16;
               break;
            case 225:
               var10000 = 4;
               break;
            case 226:
               var10000 = 217;
               break;
            case 227:
               var10000 = 66;
               break;
            case 228:
               var10000 = 247;
               break;
            case 229:
               var10000 = 60;
               break;
            case 230:
               var10000 = 167;
               break;
            case 231:
               var10000 = 73;
               break;
            case 232:
               var10000 = 155;
               break;
            case 233:
               var10000 = 133;
               break;
            case 234:
               var10000 = 250;
               break;
            case 235:
               var10000 = 87;
               break;
            case 236:
               var10000 = 7;
               break;
            case 237:
               var10000 = 240;
               break;
            case 238:
               var10000 = 151;
               break;
            case 239:
               var10000 = 198;
               break;
            case 240:
               var10000 = 58;
               break;
            case 241:
               var10000 = 147;
               break;
            case 242:
               var10000 = 86;
               break;
            case 243:
               var10000 = 1;
               break;
            case 244:
               var10000 = 47;
               break;
            case 245:
               var10000 = 63;
               break;
            case 246:
               var10000 = 175;
               break;
            case 247:
               var10000 = 71;
               break;
            case 248:
               var10000 = 131;
               break;
            case 249:
               var10000 = 106;
               break;
            case 250:
               var10000 = 67;
               break;
            case 251:
               var10000 = 246;
               break;
            case 252:
               var10000 = 0;
               break;
            case 253:
               var10000 = 190;
               break;
            case 254:
               var10000 = 176;
               break;
            default:
               var10000 = 239;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17797;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String var10;
      boolean var12;
      String[] var13;
      byte var26;
      char[] var33;
      byte var42;
      boolean var5;
      long var54;
      long[] var6;
      int var65;
      var13 = new String[33];
      int var11 = 0;
      var10 = "\"¾\u0010BÝ\u0007â\u001b½U\t5à½Ü\u0015\u001d^¼W\n¶\u001f\u0082v\u008f\u0081¨ËôO\t^Ì³\u0087åEa³A\u000bÌ`i\u0096yv«û\u0015\u009cµ\u0012\u000e.¹Û¤ÎIÞP\u0010#_Do½\u008dT¦\rìwM3æC2ÀmðFHá\u000bñØÎ\u0081\u008d\u00945§Æ\u0017Ï\u0002ç/\u0005µñ{û\u0018\u0012\u0094|h\u009e\u0012Íái\u009cêíÁdgD\u000b\u008f\u008c\t\u009fç\u008bââé\u0081&]\u000bÑý$Ôøº\u009bb\u0013¯u\u000b&\u0002\u009e\u001cn1®Çµ\u001b¡\u00043²A\u0096\u000bi!\u000bºnwsÛ\u000e\u0098Ö\u0004p@´\u0016\u000b=r\u0081Ð?:YrK\u00ad~\u0004M\u008b¼«\u0005jZ\u0084ªÃ\u0004+þßÁ\tì(\u0086År>²ØÊ\u0003éÛõ\b\u008b\u0088ðI\u0012RV>\u000b¬å\u008b×\rÚ%nÄ.\u008f\u000bÔ\u009dÀï¥O×\b\u009aâD\u0012YdS\u0092ùçâû%´\u008dË\u0091ý\u0007ß\u0003ì\u0011d\u0099×* V¥Â©\u008c/|^\u001d\rP¿\b»ÜöÃÒ\u0003N\u0014\u0002\u001a\u0002\u0005\u0086åBÓ\u0013";
      var12 = (boolean)("\"¾\u0010BÝ\u0007â\u001b½U\t5à½Ü\u0015\u001d^¼W\n¶\u001f\u0082v\u008f\u0081¨ËôO\t^Ì³\u0087åEa³A\u000bÌ`i\u0096yv«û\u0015\u009cµ\u0012\u000e.¹Û¤ÎIÞP\u0010#_Do½\u008dT¦\rìwM3æC2ÀmðFHá\u000bñØÎ\u0081\u008d\u00945§Æ\u0017Ï\u0002ç/\u0005µñ{û\u0018\u0012\u0094|h\u009e\u0012Íái\u009cêíÁdgD\u000b\u008f\u008c\t\u009fç\u008bââé\u0081&]\u000bÑý$Ôøº\u009bb\u0013¯u\u000b&\u0002\u009e\u001cn1®Çµ\u001b¡\u00043²A\u0096\u000bi!\u000bºnwsÛ\u000e\u0098Ö\u0004p@´\u0016\u000b=r\u0081Ð?:YrK\u00ad~\u0004M\u008b¼«\u0005jZ\u0084ªÃ\u0004+þßÁ\tì(\u0086År>²ØÊ\u0003éÛõ\b\u008b\u0088ðI\u0012RV>\u000b¬å\u008b×\rÚ%nÄ.\u008f\u000bÔ\u009dÀï¥O×\b\u009aâD\u0012YdS\u0092ùçâû%´\u008dË\u0091ý\u0007ß\u0003ì\u0011d\u0099×* V¥Â©\u008c/|^\u001d\rP¿\b»ÜöÃÒ\u0003N\u0014\u0002\u001a\u0002\u0005\u0086åBÓ\u0013");
         // [VF] .length();
      char var9 = '\n';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 50;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  switch (var14 % 7) {
                     case 0:
                        var65 = 123;
                        break;
                     case 1:
                        var65 = 2;
                        break;
                     case 2:
                        var65 = 111;
                        break;
                     case 3:
                        var65 = 2;
                        break;
                     case 4:
                        var65 = 88;
                        break;
                     case 5:
                        var65 = 60;
                        break;
                     default:
                        var65 = 94;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     b = new String[33];
                     long var0 = 5849965110289064889L;
                     var6 = new long[4];
                     int var3 = 0;
                     String var4 = "þÎ¨}Ô\u0098GÐÂr ®UÏÕB";
                     var5 = ("þÎ¨}Ô\u0098GÐÂr ®UÏÕB".length()) != 0;
                     byte var2 = 0;

                     label44:
                     while (true) {
                        var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    c = var6;
                                    d = new Integer[4];
                                    Registry.lookupField(173797753744067359L).set(null, a(-30850, 17351));
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\u0004Ó\u0091e²È\u0090\u0087aºç+\u008b>oP";
                                 var5 = ("\u0004Ó\u0091e²È\u0090\u0087aºç+\u008b>oP".length()) != 0;
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "C\u0086ÏzÁ\u001d¡|h\u0010\u0091#l\u0005\u000fk\u0004u¬";
                  var12 = ("C\u0086ÏzÁ\u001d¡|h\u0010\u0091#l\u0005\u000fk\u0004u¬".length()) != 0;
                  var9 = '\r';
                  var17 = -1;
            }

            var10000 = 74;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
   private static Object var29;
}





