import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

class CC implements Comparator {
   final Comparator j;
   final O8 f;
   String i;
   final String u;
   final Km_2 I;
   private static final long[] a;
   private static final Long[] b;

   CC(Km_2 var1, String var2) {
      this.I = var1;
      this.u = var2;
      this.j = Collator.getInstance(Locale.CHINA);
      this.f = new O8();
      com.c.c(578749406631711268L).set(this, com.c.c(471239662253057273L).get(this));
   }

   @Override
   public int compare(Object var1, Object var2) {
      String var3;
      String var4;
      String var5;
      long var6;
      long var8;
      long var10;
      long var12;
      long var14;
      long var16;
      int var18;
      String var20;
      String var21;
      byte var22;
      byte var23;
      int var51;
      label304: {
         label307: {
            String var10000 = Km_2.U();
            var4 = "";
            var3 = var10000;
            var5 = "";
            var6 = 0L;
            var8 = 0L;
            var10 = 0L;
            var12 = 0L;
            var14 = 0L;
            var16 = 0L;
            var18 = 0;
            boolean var19 = false;
            var20 = "";
            var21 = "";
            var22 = 0;
            var23 = 0;
            var51 = var1.getClass().equals(tf_4.class);
            if (var3 == null) {
               if (var51 != 0) {
                  tf_4 var24 = (tf_4)var1;
                  Object[] var10002 = com.c.f();
                  Method var10004 = com.c.d(179612178163941306L);
                  Object[] var10003 = var10002;
                  tf_4 var144 = var24;
                  Method var10001 = var10004;

                  try {
                     var99 = (String)var10001.invoke(var144, var10003);
                  } catch (InvocationTargetException var47) {
                     throw var47.getTargetException();
                  }

                  var4 = var99;
                  var6 = a(15601, 4441317280584684305L);
                  var22 = 1;
                  Object[] var100 = com.c.f();
                  Method var170 = com.c.d(548714014728507656L);
                  var10002 = var100;
                  tf_4 var101 = var24;
                  Method var52 = var170;

                  try {
                     var53 = (Long)var52.invoke(var101, var10002);
                  } catch (InvocationTargetException var46) {
                     throw var46.getTargetException();
                  }

                  var10 = var53;
                  Object[] var102 = com.c.f();
                  Method var171 = com.c.d(549229823689592892L);
                  var10002 = var102;
                  tf_4 var103 = var24;
                  Method var54 = var171;

                  try {
                     var51 = (Integer)var54.invoke(var103, var10002);
                  } catch (InvocationTargetException var45) {
                     throw var45.getTargetException();
                  }

                  var14 = (long)var51;
                  Object[] var104 = com.c.f();
                  Method var172 = com.c.d(428016133386020772L);
                  var10002 = var104;
                  tf_4 var105 = var24;
                  Method var56 = var172;

                  try {
                     var51 = (Integer)var56.invoke(var105, var10002);
                  } catch (InvocationTargetException var44) {
                     throw var44.getTargetException();
                  }

                  var18 = var51;
                  if (var3 == null) {
                     break label307;
                  }
               }

               var51 = var1.getClass().equals(ck_4.class);
            }

            if (var3 != null) {
               break label304;
            }

            if (var51 != 0) {
               ck_4 var48 = (ck_4)var1;
               Object[] var106 = com.c.f();
               Method var173 = com.c.d(396085629172753019L);
               Object[] var148 = var106;
               ck_4 var107 = var48;
               Method var58 = var173;

               try {
                  var59 = (String)var58.invoke(var107, var148);
               } catch (InvocationTargetException var43) {
                  throw var43.getTargetException();
               }

               var4 = var59;
               var106 = com.c.f();
               var173 = com.c.d(556117124296734693L);
               var148 = var106;
               ck_4 var109 = var48;
               Method var60 = var173;

               try {
                  var61 = (Long)var60.invoke(var109, var148);
               } catch (InvocationTargetException var42) {
                  throw var42.getTargetException();
               }

               var6 = var61;
               var106 = com.c.f();
               var173 = com.c.d(396085629172753019L);
               var148 = var106;
               ck_4 var111 = var48;
               Method var62 = var173;

               try {
                  var63 = var62.invoke(var111, var148);
               } catch (InvocationTargetException var41) {
                  throw var41.getTargetException();
               }

               Object[] var64 = com.c.a(var63);
               Method var65 = com.c.d(407232484227459369L);
               var148 = var64;
               var106 = null;

               try {
                  var66 = (String)var65.invoke(var106, var148);
               } catch (InvocationTargetException var40) {
                  throw var40.getTargetException();
               }

               var20 = var66;
               var106 = com.c.f();
               var173 = com.c.d(309552269024527186L);
               var148 = var106;
               ck_4 var115 = var48;
               Method var67 = var173;

               try {
                  var68 = (Long)var67.invoke(var115, var148);
               } catch (InvocationTargetException var39) {
                  throw var39.getTargetException();
               }

               var10 = var68;
               var106 = com.c.f();
               var173 = com.c.d(498445835749817375L);
               var148 = var106;
               ck_4 var117 = var48;
               Method var69 = var173;

               try {
                  var51 = (Integer)var69.invoke(var117, var148);
               } catch (InvocationTargetException var38) {
                  throw var38.getTargetException();
               }

               var14 = (long)var51;
               var106 = com.c.f();
               var173 = com.c.d(403273169707556690L);
               var148 = var106;
               ck_4 var119 = var48;
               Method var71 = var173;

               try {
                  var51 = (Integer)var71.invoke(var119, var148);
               } catch (InvocationTargetException var37) {
                  throw var37.getTargetException();
               }

               var18 = var51;
            }
         }

         var51 = var2.getClass().equals(tf_4.class);
      }

      label292: {
         label310: {
            if (var3 == null) {
               if (var51 != 0) {
                  tf_4 var49 = (tf_4)var2;
                  Object[] var156 = com.c.f();
                  Method var190 = com.c.d(179612178163941306L);
                  Object[] var179 = var156;
                  tf_4 var157 = var49;
                  Method var120 = var190;

                  try {
                     var121 = (String)var120.invoke(var157, var179);
                  } catch (InvocationTargetException var36) {
                     throw var36.getTargetException();
                  }

                  var5 = var121;
                  var8 = a(3196, 8685686214648652701L);
                  var23 = 1;
                  Object[] var122 = com.c.f();
                  Method var180 = com.c.d(548714014728507656L);
                  var156 = var122;
                  tf_4 var123 = var49;
                  Method var73 = var180;

                  try {
                     var74 = (Long)var73.invoke(var123, var156);
                  } catch (InvocationTargetException var35) {
                     throw var35.getTargetException();
                  }

                  var12 = var74;
                  Object[] var124 = com.c.f();
                  Method var181 = com.c.d(549229823689592892L);
                  var156 = var124;
                  tf_4 var125 = var49;
                  Method var75 = var181;

                  try {
                     var51 = (Integer)var75.invoke(var125, var156);
                  } catch (InvocationTargetException var34) {
                     throw var34.getTargetException();
                  }

                  var16 = (long)var51;
                  if (var3 == null) {
                     break label310;
                  }
               }

               var51 = var2.getClass().equals(ck_4.class);
            }

            if (var3 != null) {
               break label292;
            }

            if (var51 != 0) {
               ck_4 var50 = (ck_4)var2;
               Object[] var126 = com.c.f();
               Method var182 = com.c.d(396085629172753019L);
               Object[] var160 = var126;
               ck_4 var127 = var50;
               Method var77 = var182;

               try {
                  var78 = (String)var77.invoke(var127, var160);
               } catch (InvocationTargetException var33) {
                  throw var33.getTargetException();
               }

               var5 = var78;
               var126 = com.c.f();
               var182 = com.c.d(556117124296734693L);
               var160 = var126;
               ck_4 var129 = var50;
               Method var79 = var182;

               try {
                  var80 = (Long)var79.invoke(var129, var160);
               } catch (InvocationTargetException var32) {
                  throw var32.getTargetException();
               }

               var8 = var80;
               var126 = com.c.f();
               var182 = com.c.d(396085629172753019L);
               var160 = var126;
               ck_4 var131 = var50;
               Method var81 = var182;

               try {
                  var82 = var81.invoke(var131, var160);
               } catch (InvocationTargetException var31) {
                  throw var31.getTargetException();
               }

               Object[] var83 = com.c.a(var82);
               Method var84 = com.c.d(407232484227459369L);
               var160 = var83;
               var126 = null;

               try {
                  var85 = (String)var84.invoke(var126, var160);
               } catch (InvocationTargetException var30) {
                  throw var30.getTargetException();
               }

               var21 = var85;
               var126 = com.c.f();
               var182 = com.c.d(309552269024527186L);
               var160 = var126;
               ck_4 var135 = var50;
               Method var86 = var182;

               try {
                  var87 = (Long)var86.invoke(var135, var160);
               } catch (InvocationTargetException var29) {
                  throw var29.getTargetException();
               }

               var12 = var87;
               var126 = com.c.f();
               var182 = com.c.d(498445835749817375L);
               var160 = var126;
               ck_4 var137 = var50;
               Method var88 = var182;

               try {
                  var51 = (Integer)var88.invoke(var137, var160);
               } catch (InvocationTargetException var28) {
                  throw var28.getTargetException();
               }

               var16 = (long)var51;
            }
         }

         var51 = var22;
      }

      label280:
      if (var3 == null) {
         if (var51 != 0) {
            var51 = var23;
            if (var3 != null) {
               break label280;
            }

            if (var23 == 0) {
               return -1;
            }
         }

         var51 = var22;
      }

      label273:
      if (var3 == null) {
         if (var51 == 0) {
            var51 = var23;
            if (var3 != null) {
               break label273;
            }

            if (var23 != 0) {
               return 1;
            }
         }

         var51 = ((String)com.c.c(578749406631711268L).get(this)).equals((String)com.c.c(120798900280429031L).get(null));
      }

      if (var3 == null) {
         if (var51 != 0) {
            return ((Comparator)com.c.c(316557178524622543L).get(this)).compare(var4, var5);
         }

         var51 = ((String)com.c.c(578749406631711268L).get(this)).equals((String)com.c.c(255728535682922342L).get(null));
      }

      if (var3 == null) {
         if (var51 != 0) {
            Object var96 = com.c.c(366794114718761223L).get(this);
            Object[] var142 = com.c.a(Long.valueOf(var6), Long.valueOf(var8));
            Method var189 = com.c.d(262915954633911742L);
            Object[] var169 = var142;
            var142 = (Object[])var96;
            Method var97 = var189;

            try {
               var51 = (Integer)var97.invoke(var142, var169);
            } catch (InvocationTargetException var25) {
               throw var25.getTargetException();
            }

            return var51;
         }

         var51 = ((String)com.c.c(578749406631711268L).get(this)).equals((String)com.c.c(163942508468345506L).get(null));
      }

      if (var3 == null) {
         if (var51 != 0) {
            return ((Comparator)com.c.c(316557178524622543L).get(this)).compare(var20, var21);
         }

         var51 = ((String)com.c.c(578749406631711268L).get(this)).equals((String)com.c.c(186089693526780221L).get(null));
      }

      if (var3 == null) {
         if (var51 != 0) {
            Object var93 = com.c.c(366794114718761223L).get(this);
            Object[] var140 = com.c.a(Long.valueOf(var10), Long.valueOf(var12));
            Method var188 = com.c.d(262915954633911742L);
            Object[] var168 = var140;
            var140 = (Object[])var93;
            Method var94 = var188;

            try {
               var51 = (Integer)var94.invoke(var140, var168);
            } catch (InvocationTargetException var26) {
               throw var26.getTargetException();
            }

            return var51;
         }

         var51 = ((String)com.c.c(578749406631711268L).get(this)).equals((String)com.c.c(132517039764639145L).get(null));
      }

      if (var3 == null) {
         if (var51 != 0) {
            Object var90 = com.c.c(366794114718761223L).get(this);
            Object[] var138 = com.c.a(Long.valueOf(var14), Long.valueOf(var16));
            Method var187 = com.c.d(262915954633911742L);
            Object[] var167 = var138;
            var138 = (Object[])var90;
            Method var91 = var187;

            try {
               var51 = (Integer)var91.invoke(var138, var167);
            } catch (InvocationTargetException var27) {
               throw var27.getTargetException();
            }

            return var51;
         }

         var51 = ((String)com.c.c(578749406631711268L).get(this)).equals((String)com.c.c(505372407712304708L).get(null));
      }

      if (var3 == null) {
         if (var51 != 0) {
            return Integer.compare(var18, var18);
         }

         var51 = 1;
      }

      return var51;
   }

   static {
      long var0 = 2030168292669858016L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ÞqÞ8\u00ad+\f\u000e\u009bZ¥&_\u0085<\u0082";
      int var5 = "ÞqÞ8\u00ad+\f\u000e\u009bZ¥&_\u0085<\u0082".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
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
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Long[2];
   }

   private static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 28640) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }
}





