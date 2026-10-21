package com.finalshell.ui.model;

import com.finalshell.core.LI3_2;
import com.finalshell.core.U82;
import com.finalshell.core.Uo2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class JS implements Comparator {
   public final Comparator p;
   public final O8 S;
   public final Om2 k;
   public String q;
   public final String J;
   public final Uo2 H;

   public JS(Uo2 var1, String var2) {
      this.H = var1;
      this.J = var2;
      this.p = Collator.getInstance(Locale.CHINA);
      this.S = new O8();
      this.k = new Om2();
      Object var3 = 325207296847062303L;
      Object var10002 = Ref.g(325207296847062303L, var3);
      long var6 = 320721692123201197L;
      Object var5 = var10002;
      Ref.s(320721692123201197L, var5, var6);
   }

   public int d(LI3_2 var1, LI3_2 var2) {
      Float var107;
      Long var110;
      Integer var113;
      Float var130;
      Long var133;
      Integer var136;
      boolean var3 = Uo2.k();
      Object var8 = 320721692123201197L;
      JS var10001 = ((String)Ref.g(320721692123201197L, var8)).equals((String)Registry.lookupField(226109021265139345L).get(null));
      if (var3) {
         label244:
         if (var10001 == null) {
            Object var10 = 320721692123201197L;
            JS var10002 = ((String)Ref.g(320721692123201197L, var10)).equals((String)Registry.lookupField(246644705461640101L).get(null));
            if (var3) {
               if (var10002 == null) {
                  break label244;
               }

               var10002 = this;
               Object var18 = 320721692123201197L;
               ((String)Ref.g(320721692123201197L, var18)).equals((String)Registry.lookupField(572421534966713491L).get(null));
            }

            if (var3) {
               if (var10002 == null) {
                  Object var20 = 396791488371189674L;
                  Comparator var94 = (Comparator)Ref.g(396791488371189674L, var20);
                  String var114 = (String)(Registry.emptyArgs());
                  long var23 = 287512880066147760L;
                  Object var22 = var114;
                  var114 = Ref.h(287512880066147760L, var22, var23);

                  try {
                     var114 = (String)var114;
                  } catch (InvocationTargetException var73) {
                     throw var73.getTargetException();
                  }

                  String var137 = (String)(Registry.emptyArgs());
                  long var25 = 287512880066147760L;
                  Object var24 = var137;
                  var137 = Ref.h(287512880066147760L, var24, var25);

                  try {
                     var137 = (String)var137;
                  } catch (InvocationTargetException var72) {
                     throw var72.getTargetException();
                  }

                  return var114.compare(var2, var137);
               }

               var10002 = this;
               Object var26 = 320721692123201197L;
               ((String)Ref.g(320721692123201197L, var26)).equals((String)Registry.lookupField(261433743018117933L).get(null));
            }

            if (var3) {
               if (var10002 == null) {
                  Object var28 = 576337950600267201L;
                  Ref.g(576337950600267201L, var28);
                  Object var111 = Registry.emptyArgs();
                  long var31 = 419335026051024288L;
                  Object var30 = var111;
                  var111 = Ref.h(419335026051024288L, var30, var31);

                  try {
                     var113 = (Integer)var111;
                  } catch (InvocationTargetException var76) {
                     throw var76.getTargetException();
                  }

                  Integer.valueOf(var113);
                  Object var134 = Registry.emptyArgs();
                  long var33 = 419335026051024288L;
                  Object var32 = var134;
                  var134 = Ref.h(419335026051024288L, var32, var33);

                  try {
                     var136 = (Integer)var134;
                  } catch (InvocationTargetException var75) {
                     throw var75.getTargetException();
                  }

                  Object var123 = Registry.packArgs(var2, Integer.valueOf(var136));
                  long var35 = 227703286706087580L;
                  Object var34 = var123;
                  var123 = Ref.h(227703286706087580L, var34, var35);

                  try {
                     return (Integer)var123;
                  } catch (InvocationTargetException var74) {
                     throw var74.getTargetException();
                  }
               }

               var10002 = this;
               Object var36 = 320721692123201197L;
               ((String)Ref.g(320721692123201197L, var36)).equals((String)Registry.lookupField(223954321575685381L).get(null));
            }

            if (var3) {
               if (var10002 == null) {
                  Object var38 = 148056146191951030L;
                  Ref.g(148056146191951030L, var38);
                  Object var108 = Registry.emptyArgs();
                  long var41 = 225195147661966806L;
                  Object var40 = var108;
                  var108 = Ref.h(225195147661966806L, var40, var41);

                  try {
                     var110 = (Long)var108;
                  } catch (InvocationTargetException var79) {
                     throw var79.getTargetException();
                  }

                  Long.valueOf(var110);
                  Object var131 = Registry.emptyArgs();
                  long var43 = 225195147661966806L;
                  Object var42 = var131;
                  var131 = Ref.h(225195147661966806L, var42, var43);

                  try {
                     var133 = (Long)var131;
                  } catch (InvocationTargetException var78) {
                     throw var78.getTargetException();
                  }

                  Object var121 = Registry.packArgs(var2, Long.valueOf(var133));
                  long var45 = 262915954633911742L;
                  Object var44 = var121;
                  var121 = Ref.h(262915954633911742L, var44, var45);

                  try {
                     return (Integer)var121;
                  } catch (InvocationTargetException var77) {
                     throw var77.getTargetException();
                  }
               }

               var10002 = this;
               Object var46 = 320721692123201197L;
               ((String)Ref.g(320721692123201197L, var46)).equals((String)Registry.lookupField(304424680129435401L).get(null));
            }

            if (var3) {
               if (var10002 == null) {
                  Object var48 = 576337950600267201L;
                  Ref.g(576337950600267201L, var48);
                  Object var105 = Registry.emptyArgs();
                  long var51 = 218205101142805647L;
                  Object var50 = var105;
                  var105 = Ref.h(218205101142805647L, var50, var51);

                  try {
                     var107 = (Float)var105;
                  } catch (InvocationTargetException var82) {
                     throw var82.getTargetException();
                  }

                  Float.valueOf(var107);
                  Object var128 = Registry.emptyArgs();
                  long var53 = 218205101142805647L;
                  Object var52 = var128;
                  var128 = Ref.h(218205101142805647L, var52, var53);

                  try {
                     var130 = (Float)var128;
                  } catch (InvocationTargetException var81) {
                     throw var81.getTargetException();
                  }

                  Object var119 = Registry.packArgs(var2, Float.valueOf(var130));
                  long var55 = 449672458813842211L;
                  Object var54 = var119;
                  var119 = Ref.h(449672458813842211L, var54, var55);

                  try {
                     return (Integer)var119;
                  } catch (InvocationTargetException var80) {
                     throw var80.getTargetException();
                  }
               }

               var10002 = this;
               Object var56 = 320721692123201197L;
               ((String)Ref.g(320721692123201197L, var56)).equals((String)Registry.lookupField(264695503300239111L).get(null));
            }

            if (var3) {
               if (var10002 == null) {
                  String var4 = "";
                  U82 var10003 = (U82)(Registry.emptyArgs());
                  long var59 = 382054480216091309L;
                  Object var58 = var10003;
                  var10003 = Ref.h(382054480216091309L, var58, var59);

                  try {
                     var10003 = (U82)var10003;
                  } catch (InvocationTargetException var88) {
                     throw var88.getTargetException();
                  }

                  String var96;
                  label267: {
                     U82 var5 = var10003;
                     if (!var3 || var5 != null) {
                        Object[] var10004 = Registry.emptyArgs();
                        long var61 = 577747074549625554L;
                        Object[] var60 = var10004;
                        var96 = (String)Ref.h(577747074549625554L, var60, var61);

                        try {
                           var96 = var96;
                        } catch (InvocationTargetException var87) {
                           throw var87.getTargetException();
                        }

                        if (!var3) {
                           break label267;
                        }

                        if (var96 != null) {
                           String var10005 = (String)(Registry.emptyArgs());
                           long var63 = 577747074549625554L;
                           Object var62 = var10005;
                           var10005 = Ref.h(577747074549625554L, var62, var63);

                           try {
                              var10005 = (String)var10005;
                           } catch (InvocationTargetException var86) {
                              throw var86.getTargetException();
                           }

                           var4 = var10005;
                        }
                     }

                     var96 = "";
                  }

                  Object var6 = var96;
                  U82 var102 = (U82)(Registry.emptyArgs());
                  long var65 = 382054480216091309L;
                  Object var64 = var102;
                  var102 = Ref.h(382054480216091309L, var64, var65);

                  try {
                     var102 = (U82)var102;
                  } catch (InvocationTargetException var85) {
                     throw var85.getTargetException();
                  }

                  U82 var7 = var102;
                  label210:
                  if (!var3 || var7 != null) {
                     String var10006 = (String)(Registry.emptyArgs());
                     long var67 = 577747074549625554L;
                     Object var66 = var10006;
                     var10006 = Ref.h(577747074549625554L, var66, var67);

                     try {
                        var10006 = (String)var10006;
                     } catch (InvocationTargetException var84) {
                        throw var84.getTargetException();
                     }

                     if (var3) {
                        if (var10006 == null) {
                           break label210;
                        }

                        var10006 = (String)(var7);
                        Object[] var10007 = Registry.emptyArgs();
                        long var69 = 577747074549625554L;
                        Object[] var68 = var10007;
                        Ref.h(577747074549625554L, var68, var69);

                        try {
                           ;
                        } catch (InvocationTargetException var83) {
                           throw var83.getTargetException();
                        }
                     }

                     var6 = var10006;
                  }

                  Object var70 = 396791488371189674L;
                  return ((Comparator)Ref.g(396791488371189674L, var70)).compare(var4, (String)var6);
               }

               var10002 = (JS)(true);
            }

            return (int)var10002;
         }

         var10001 = this;
         Object var12 = 396791488371189674L;
         Comparator var91 = (Comparator)Ref.g(396791488371189674L, var12);
         Comparator var97 = Registry.emptyArgs();
         long var15 = 505915899939017355L;
         Object var14 = var97;
         var97 = Ref.h(505915899939017355L, var14, var15);

         try {
            var97 = (String)var97;
         } catch (InvocationTargetException var90) {
            throw var90.getTargetException();
         }

         String var125 = (String)(Registry.emptyArgs());
         long var17 = 505915899939017355L;
         Object var16 = var125;
         var125 = Ref.h(505915899939017355L, var16, var17);

         try {
            var125 = (String)var125;
         } catch (InvocationTargetException var89) {
            throw var89.getTargetException();
         }

         var97.compare(var2, var125);
      }

      return (int)var10001;
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object var10001 = Registry.packArgs((LI3_2)var1, (LI3_2)var2);
      long var4 = 621138583241391558L;
      Object var3 = var10001;
      var10001 = Ref.h(621138583241391558L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





