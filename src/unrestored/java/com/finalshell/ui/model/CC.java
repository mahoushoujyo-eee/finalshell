package com.finalshell.ui.model;

import com.finalshell.core.Km2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class CC implements Comparator {
   public final Comparator j;
   public final O8 f;
   public String i;
   public final String u;
   public final Km2 I;
   public static long[] a;
   public static Long[] b;

   public CC(Km2 var1, String var2) {
      this.I = var1;
      this.u = var2;
      this.j = Collator.getInstance(Locale.CHINA);
      this.f = new O8();
      Object var3 = 471239662253057273L;
      Object var10002 = Ref.g(471239662253057273L, var3);
      long var6 = 578749406631711268L;
      Object var5 = var10002;
      Ref.s(578749406631711268L, var5, var6);
   }

   @Override
   public int compare(Object var1, Object var2) {
      Long var129;
      Long var132;
      Long var138;
      Long var141;
      Integer var152;
      Integer var156;
      Integer var159;
      Long var165;
      Long var168;
      Integer var170;
      Integer var173;
      Integer var175;
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
      Object var22;
      Object var23;
      CC var117;
      label294: {
         label297: {
            String var10000 = Km2.U$String();
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
            var22 = false;
            var23 = false;
            var117 = (CC)(var1.getClass().equals(Tf4.class));
            if (var3 == null) {
               if (var117 == null) {
                  Tf4 var24 = (Tf4)var1;
                  short var118 = 15601;
                  String var10002 = (String)(Registry.emptyArgs());
                  long var26 = 179612178163941306L;
                  Object var25 = var10002;
                  var10002 = Ref.h(179612178163941306L, var25, var26);

                  try {
                     var10002 = (String)var10002;
                  } catch (InvocationTargetException var113) {
                     throw var113.getTargetException();
                  }

                  var4 = var10002;
                  var6 = a((int)var24, 4441317280584684305L);
                  var22 = true;
                  var10002 = Registry.emptyArgs();
                  long var28 = 548714014728507656L;
                  Object var27 = var10002;
                  var10002 = Ref.h(548714014728507656L, var27, var28);

                  try {
                     var129 = (Long)var10002;
                  } catch (InvocationTargetException var112) {
                     throw var112.getTargetException();
                  }

                  var10 = var129;
                  Object var10003 = Registry.emptyArgs();
                  long var30 = 549229823689592892L;
                  Object var29 = var10003;
                  var10003 = Ref.h(549229823689592892L, var29, var30);

                  try {
                     var152 = (Integer)var10003;
                  } catch (InvocationTargetException var111) {
                     throw var111.getTargetException();
                  }

                  var14 = (long)var152;
                  Object var10004 = Registry.emptyArgs();
                  long var32 = 428016133386020772L;
                  Object var31 = var10004;
                  var10004 = Ref.h(428016133386020772L, var31, var32);

                  try {
                     var159 = (Integer)var10004;
                  } catch (InvocationTargetException var110) {
                     throw var110.getTargetException();
                  }

                  var18 = var159;
                  if (var3 == null) {
                     break label297;
                  }
               }

               var117 = (CC)(var1.getClass().equals(Ck4.class));
            }

            if (var3 != null) {
               break label294;
            }

            if (var117 == null) {
               Ck4 var114 = (Ck4)var1;
               String var10001 = (String)(Registry.emptyArgs());
               long var34 = 396085629172753019L;
               Object var33 = var10001;
               var10001 = Ref.h(396085629172753019L, var33, var34);

               try {
                  var10001 = (String)var10001;
               } catch (InvocationTargetException var109) {
                  throw var109.getTargetException();
               }

               var4 = var10001;
               Object var130 = Registry.emptyArgs();
               long var36 = 556117124296734693L;
               Object var35 = var130;
               var130 = Ref.h(556117124296734693L, var35, var36);

               try {
                  var132 = (Long)var130;
               } catch (InvocationTargetException var108) {
                  throw var108.getTargetException();
               }

               var6 = var132;
               Object[] var153 = Registry.emptyArgs();
               long var38 = 396085629172753019L;
               Object[] var37 = var153;
               Registry.packArgs(Ref.h(396085629172753019L, var37, var38));
               long var39 = 407232484227459369L;
               Object var160 = Ref.h2(407232484227459369L, var39);

               try {
                  var160 = (String)var160;
               } catch (InvocationTargetException var107) {
                  throw var107.getTargetException();
               }

               var20 = (String)var160;
               Object var10005 = Registry.emptyArgs();
               long var42 = 309552269024527186L;
               Object var41 = var10005;
               var10005 = Ref.h(309552269024527186L, var41, var42);

               try {
                  var165 = (Long)var10005;
               } catch (InvocationTargetException var106) {
                  throw var106.getTargetException();
               }

               var10 = var165;
               Object var10006 = Registry.emptyArgs();
               long var44 = 498445835749817375L;
               Object var43 = var10006;
               var10006 = Ref.h(498445835749817375L, var43, var44);

               try {
                  var170 = (Integer)var10006;
               } catch (InvocationTargetException var105) {
                  throw var105.getTargetException();
               }

               var14 = (long)var170;
               Object var10007 = Registry.emptyArgs();
               long var46 = 403273169707556690L;
               Object var45 = var10007;
               var10007 = Ref.h(403273169707556690L, var45, var46);

               try {
                  var175 = (Integer)var10007;
               } catch (InvocationTargetException var104) {
                  throw var104.getTargetException();
               }

               var18 = var175;
            }
         }

         var117 = (CC)(var2.getClass().equals(Tf4.class));
      }

      label282: {
         label300: {
            if (var3 == null) {
               if (var117 == null) {
                  Tf4 var115 = (Tf4)var2;
                  short var119 = 3196;
                  String var133 = (String)(Registry.emptyArgs());
                  long var48 = 179612178163941306L;
                  Object var47 = var133;
                  var133 = Ref.h(179612178163941306L, var47, var48);

                  try {
                     var133 = (String)var133;
                  } catch (InvocationTargetException var103) {
                     throw var103.getTargetException();
                  }

                  var5 = var133;
                  var8 = a((int)var115, 8685686214648652701L);
                  var23 = true;
                  var133 = Registry.emptyArgs();
                  long var50 = 548714014728507656L;
                  Object var49 = var133;
                  var133 = Ref.h(548714014728507656L, var49, var50);

                  try {
                     var138 = (Long)var133;
                  } catch (InvocationTargetException var102) {
                     throw var102.getTargetException();
                  }

                  var12 = var138;
                  Object var154 = Registry.emptyArgs();
                  long var52 = 549229823689592892L;
                  Object var51 = var154;
                  var154 = Ref.h(549229823689592892L, var51, var52);

                  try {
                     var156 = (Integer)var154;
                  } catch (InvocationTargetException var101) {
                     throw var101.getTargetException();
                  }

                  var16 = (long)var156;
                  if (var3 == null) {
                     break label300;
                  }
               }

               var117 = (CC)(var2.getClass().equals(Ck4.class));
            }

            if (var3 != null) {
               break label282;
            }

            if (var117 == null) {
               Ck4 var116 = (Ck4)var2;
               String var122 = (String)(Registry.emptyArgs());
               long var54 = 396085629172753019L;
               Object var53 = var122;
               var122 = Ref.h(396085629172753019L, var53, var54);

               try {
                  var122 = (String)var122;
               } catch (InvocationTargetException var100) {
                  throw var100.getTargetException();
               }

               var5 = var122;
               Object var139 = Registry.emptyArgs();
               long var56 = 556117124296734693L;
               Object var55 = var139;
               var139 = Ref.h(556117124296734693L, var55, var56);

               try {
                  var141 = (Long)var139;
               } catch (InvocationTargetException var99) {
                  throw var99.getTargetException();
               }

               var8 = var141;
               Object[] var157 = Registry.emptyArgs();
               long var58 = 396085629172753019L;
               Object[] var57 = var157;
               Registry.packArgs(Ref.h(396085629172753019L, var57, var58));
               long var59 = 407232484227459369L;
               Object var162 = Ref.h2(407232484227459369L, var59);

               try {
                  var162 = (String)var162;
               } catch (InvocationTargetException var98) {
                  throw var98.getTargetException();
               }

               var21 = (String)var162;
               Object var166 = Registry.emptyArgs();
               long var62 = 309552269024527186L;
               Object var61 = var166;
               var166 = Ref.h(309552269024527186L, var61, var62);

               try {
                  var168 = (Long)var166;
               } catch (InvocationTargetException var97) {
                  throw var97.getTargetException();
               }

               var12 = var168;
               Object var171 = Registry.emptyArgs();
               long var64 = 498445835749817375L;
               Object var63 = var171;
               var171 = Ref.h(498445835749817375L, var63, var64);

               try {
                  var173 = (Integer)var171;
               } catch (InvocationTargetException var96) {
                  throw var96.getTargetException();
               }

               var16 = (long)var173;
            }
         }

         var117 = (CC)var22;
      }

      label270:
      if (var3 == null) {
         if (var117 == null) {
            var117 = (CC)var23;
            if (var3 != null) {
               break label270;
            }

            if (var23 == null) {
               return -1;
            }
         }

         var117 = (CC)var22;
      }

      label263:
      if (var3 == null) {
         if (var117 == null) {
            var117 = (CC)var23;
            if (var3 != null) {
               break label263;
            }

            if (var23 == null) {
               return 1;
            }
         }

         var117 = this;
         Object var65 = 578749406631711268L;
         ((String)Ref.g(578749406631711268L, var65)).equals((String)Registry.lookupField(120798900280429031L).get(null));
      }

      if (var3 == null) {
         if (var117 == null) {
            Object var67 = 316557178524622543L;
            return ((Comparator)Ref.g(316557178524622543L, var67)).compare(var4, var5);
         }

         var117 = this;
         Object var69 = 578749406631711268L;
         ((String)Ref.g(578749406631711268L, var69)).equals((String)Registry.lookupField(255728535682922342L).get(null));
      }

      if (var3 == null) {
         if (var117 == null) {
            Object var71 = 366794114718761223L;
            Ref.g(366794114718761223L, var71);
            Object var148 = Registry.packArgs(Long.valueOf(var6), Long.valueOf(var8));
            long var74 = 262915954633911742L;
            Object var73 = var148;
            var148 = Ref.h(262915954633911742L, var73, var74);

            try {
               var150 = (Integer)var148;
            } catch (InvocationTargetException var93) {
               throw var93.getTargetException();
            }

            return (int)(var150);
         }

         var117 = this;
         Object var75 = 578749406631711268L;
         ((String)Ref.g(578749406631711268L, var75)).equals((String)Registry.lookupField(163942508468345506L).get(null));
      }

      if (var3 == null) {
         if (var117 == null) {
            Object var77 = 316557178524622543L;
            return ((Comparator)Ref.g(316557178524622543L, var77)).compare(var20, var21);
         }

         var117 = this;
         Object var79 = 578749406631711268L;
         ((String)Ref.g(578749406631711268L, var79)).equals((String)Registry.lookupField(186089693526780221L).get(null));
      }

      if (var3 == null) {
         if (var117 == null) {
            Object var81 = 366794114718761223L;
            Ref.g(366794114718761223L, var81);
            Object var145 = Registry.packArgs(Long.valueOf(var10), Long.valueOf(var12));
            long var84 = 262915954633911742L;
            Object var83 = var145;
            var145 = Ref.h(262915954633911742L, var83, var84);

            try {
               var147 = (Integer)var145;
            } catch (InvocationTargetException var94) {
               throw var94.getTargetException();
            }

            return (int)(var147);
         }

         var117 = this;
         Object var85 = 578749406631711268L;
         ((String)Ref.g(578749406631711268L, var85)).equals((String)Registry.lookupField(132517039764639145L).get(null));
      }

      if (var3 == null) {
         if (var117 == null) {
            Object var87 = 366794114718761223L;
            Ref.g(366794114718761223L, var87);
            Object var142 = Registry.packArgs(Long.valueOf(var14), Long.valueOf(var16));
            long var90 = 262915954633911742L;
            Object var89 = var142;
            var142 = Ref.h(262915954633911742L, var89, var90);

            try {
               var144 = (Integer)var142;
            } catch (InvocationTargetException var95) {
               throw var95.getTargetException();
            }

            return (int)(var144);
         }

         var117 = this;
         Object var91 = 578749406631711268L;
         ((String)Ref.g(578749406631711268L, var91)).equals((String)Registry.lookupField(505372407712304708L).get(null));
      }

      if (var3 == null) {
         if (var117 == null) {
            return Integer.compare(var18, var18);
         }

         var117 = (CC)(true);
      }

      return (int)var117;
   }

   static {
      __vfClinit__();
   }

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 28640) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }

   public static void __vfClinit__() {
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
   private static Object var150;
   private static Object var147;
   private static Object var144;
}





