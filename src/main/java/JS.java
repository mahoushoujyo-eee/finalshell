import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

class JS implements Comparator {
   final Comparator p;
   final O8 S;
   final Om_2 k;
   String q;
   final String J;
   final Uo_2 H;

   JS(Uo_2 var1, String var2) {
      this.H = var1;
      this.J = var2;
      this.p = Collator.getInstance(Locale.CHINA);
      this.S = new O8();
      this.k = new Om_2();
      com.c.c(320721692123201197L).set(this, com.c.c(325207296847062303L).get(this));
   }

   public int d(lI_3 var1, lI_3 var2) {
      boolean var3 = Uo_2.k();
      int var10000 = ((String)com.c.c(320721692123201197L).get(this)).equals((String)com.c.c(226109021265139345L).get(null));
      if (var3) {
         label244:
         if (var10000 == 0) {
            byte var27 = ((String)com.c.c(320721692123201197L).get(this)).equals((String)com.c.c(246644705461640101L).get(null));
            if (var3) {
               if (var27 != 0) {
                  break label244;
               }

               var27 = ((String)com.c.c(320721692123201197L).get(this)).equals((String)com.c.c(572421534966713491L).get(null));
            }

            if (var3) {
               if (var27 != 0) {
                  Comparator var47 = (Comparator)com.c.c(396791488371189674L).get(this);
                  Object[] var99 = com.c.f();
                  Method var135 = com.c.d(287512880066147760L);
                  Object[] var124 = var99;
                  lI_3 var100 = var1;
                  Method var75 = var135;

                  try {
                     var76 = (String)var75.invoke(var100, var124);
                  } catch (InvocationTargetException var9) {
                     throw var9.getTargetException();
                  }

                  var124 = com.c.f();
                  Method var141 = com.c.d(287512880066147760L);
                  Object[] var136 = var124;
                  lI_3 var126 = var2;
                  Method var101 = var141;

                  try {
                     var99 = (String)var101.invoke(var126, var136);
                  } catch (InvocationTargetException var8) {
                     throw var8.getTargetException();
                  }

                  return var47.compare(var76, var99);
               }

               var27 = ((String)com.c.c(320721692123201197L).get(this)).equals((String)com.c.c(261433743018117933L).get(null));
            }

            if (var3) {
               if (var27 != 0) {
                  Object var45 = com.c.c(576337950600267201L).get(this);
                  Object[] var94 = com.c.f();
                  Method var133 = com.c.d(419335026051024288L);
                  Object[] var120 = var94;
                  lI_3 var95 = var1;
                  Method var70 = var133;

                  try {
                     var71 = (Integer)var70.invoke(var95, var120);
                  } catch (InvocationTargetException var12) {
                     throw var12.getTargetException();
                  }

                  Integer var72 = var71;
                  var120 = com.c.f();
                  Method var140 = com.c.d(419335026051024288L);
                  Object[] var134 = var120;
                  lI_3 var122 = var2;
                  Method var96 = var140;

                  try {
                     var97 = (Integer)var96.invoke(var122, var134);
                  } catch (InvocationTargetException var11) {
                     throw var11.getTargetException();
                  }

                  Object[] var73 = com.c.a(var72, Integer.valueOf(var97));
                  Method var123 = com.c.d(227703286706087580L);
                  var94 = var73;
                  var70 = (Method)var45;
                  Method var46 = var123;

                  try {
                     return (Integer)var46.invoke(var70, var94);
                  } catch (InvocationTargetException var10) {
                     throw var10.getTargetException();
                  }
               }

               var27 = ((String)com.c.c(320721692123201197L).get(this)).equals((String)com.c.c(223954321575685381L).get(null));
            }

            if (var3) {
               if (var27 != 0) {
                  Object var43 = com.c.c(148056146191951030L).get(this);
                  Object[] var89 = com.c.f();
                  Method var131 = com.c.d(225195147661966806L);
                  Object[] var116 = var89;
                  lI_3 var90 = var1;
                  Method var65 = var131;

                  try {
                     var66 = (Long)var65.invoke(var90, var116);
                  } catch (InvocationTargetException var15) {
                     throw var15.getTargetException();
                  }

                  Long var67 = var66;
                  var116 = com.c.f();
                  Method var139 = com.c.d(225195147661966806L);
                  Object[] var132 = var116;
                  lI_3 var118 = var2;
                  Method var91 = var139;

                  try {
                     var92 = (Long)var91.invoke(var118, var132);
                  } catch (InvocationTargetException var14) {
                     throw var14.getTargetException();
                  }

                  Object[] var68 = com.c.a(var67, Long.valueOf(var92));
                  Method var119 = com.c.d(262915954633911742L);
                  var89 = var68;
                  var65 = (Method)var43;
                  Method var44 = var119;

                  try {
                     return (Integer)var44.invoke(var65, var89);
                  } catch (InvocationTargetException var13) {
                     throw var13.getTargetException();
                  }
               }

               var27 = ((String)com.c.c(320721692123201197L).get(this)).equals((String)com.c.c(304424680129435401L).get(null));
            }

            if (var3) {
               if (var27 != 0) {
                  Object var41 = com.c.c(576337950600267201L).get(this);
                  Object[] var84 = com.c.f();
                  Method var10004 = com.c.d(218205101142805647L);
                  Object[] var112 = var84;
                  lI_3 var85 = var1;
                  Method var60 = var10004;

                  try {
                     var61 = (Float)var60.invoke(var85, var112);
                  } catch (InvocationTargetException var18) {
                     throw var18.getTargetException();
                  }

                  Float var62 = var61;
                  var112 = com.c.f();
                  Method var10005 = com.c.d(218205101142805647L);
                  Object[] var130 = var112;
                  lI_3 var114 = var2;
                  Method var86 = var10005;

                  try {
                     var87 = (Float)var86.invoke(var114, var130);
                  } catch (InvocationTargetException var17) {
                     throw var17.getTargetException();
                  }

                  Object[] var63 = com.c.a(var62, Float.valueOf(var87));
                  Method var115 = com.c.d(449672458813842211L);
                  var84 = var63;
                  var60 = (Method)var41;
                  Method var42 = var115;

                  try {
                     return (Integer)var42.invoke(var60, var84);
                  } catch (InvocationTargetException var16) {
                     throw var16.getTargetException();
                  }
               }

               var27 = ((String)com.c.c(320721692123201197L).get(this)).equals((String)com.c.c(264695503300239111L).get(null));
            }

            if (var3) {
               if (var27 != 0) {
                  String var4 = "";
                  Object[] var10001 = com.c.f();
                  Method var10003 = com.c.d(382054480216091309L);
                  Object[] var10002 = var10001;
                  lI_3 var49 = var1;
                  Method var28 = var10003;

                  try {
                     var29 = (u8_2)var28.invoke(var49, var10002);
                  } catch (InvocationTargetException var24) {
                     throw var24.getTargetException();
                  }

                  label223: {
                     label256: {
                        u8_2 var5 = var29;
                        u8_2 var30 = var5;
                        if (var3) {
                           if (var5 == null) {
                              break label256;
                           }

                           var30 = var5;
                        }

                        var10001 = com.c.f();
                        var10003 = com.c.d(577747074549625554L);
                        var10002 = var10001;
                        u8_2 var51 = var30;
                        Method var31 = var10003;

                        try {
                           var32 = (String)var31.invoke(var51, var10002);
                        } catch (InvocationTargetException var23) {
                           throw var23.getTargetException();
                        }

                        if (!var3) {
                           break label223;
                        }

                        if (var32 != null) {
                           var10001 = com.c.f();
                           var10003 = com.c.d(577747074549625554L);
                           var10002 = var10001;
                           u8_2 var53 = var5;
                           Method var33 = var10003;

                           try {
                              var34 = (String)var33.invoke(var53, var10002);
                           } catch (InvocationTargetException var22) {
                              throw var22.getTargetException();
                           }

                           var4 = var34;
                        }
                     }

                     var32 = "";
                  }

                  String var6 = var32;
                  var10001 = com.c.f();
                  var10003 = com.c.d(382054480216091309L);
                  var10002 = var10001;
                  lI_3 var55 = var2;
                  Method var35 = var10003;

                  try {
                     var36 = (u8_2)var35.invoke(var55, var10002);
                  } catch (InvocationTargetException var21) {
                     throw var21.getTargetException();
                  }

                  u8_2 var7 = var36;
                  u8_2 var37 = var7;
                  if (var3) {
                     if (var7 == null) {
                        return ((Comparator)com.c.c(396791488371189674L).get(this)).compare(var4, var6);
                     }

                     var37 = var7;
                  }

                  var10001 = com.c.f();
                  var10003 = com.c.d(577747074549625554L);
                  var10002 = var10001;
                  u8_2 var57 = var37;
                  Method var38 = var10003;

                  try {
                     var39 = (String)var38.invoke(var57, var10002);
                  } catch (InvocationTargetException var20) {
                     throw var20.getTargetException();
                  }

                  if (var3) {
                     if (var39 == null) {
                        return ((Comparator)com.c.c(396791488371189674L).get(this)).compare(var4, var6);
                     }

                     var10001 = com.c.f();
                     var10003 = com.c.d(577747074549625554L);
                     var10002 = var10001;
                     u8_2 var59 = var7;
                     Method var40 = var10003;

                     try {
                        var39 = (String)var40.invoke(var59, var10002);
                     } catch (InvocationTargetException var19) {
                        throw var19.getTargetException();
                     }
                  }

                  var6 = var39;
                  return ((Comparator)com.c.c(396791488371189674L).get(this)).compare(var4, var6);
               }

               var27 = 1;
            }

            return var27;
         }

         Comparator var48 = (Comparator)com.c.c(396791488371189674L).get(this);
         Object[] var103 = com.c.f();
         Method var137 = com.c.d(505915899939017355L);
         Object[] var127 = var103;
         lI_3 var104 = var1;
         Method var77 = var137;

         try {
            var78 = (String)var77.invoke(var104, var127);
         } catch (InvocationTargetException var26) {
            throw var26.getTargetException();
         }

         var127 = com.c.f();
         Method var142 = com.c.d(505915899939017355L);
         Object[] var138 = var127;
         lI_3 var129 = var2;
         Method var105 = var142;

         try {
            var103 = (String)var105.invoke(var129, var138);
         } catch (InvocationTargetException var25) {
            throw var25.getTargetException();
         }

         var10000 = var48.compare(var78, var103);
      }

      return var10000;
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = com.c.a((lI_3)var1, (lI_3)var2);
      Method var10003 = com.c.d(621138583241391558L);
      Object[] var10002 = var10001;
      JS var4 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





