package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class Nz2_2 {
   public String y;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public Nz2_2(String var1) {
      long var3 = 556778404271106573L;
      Ref.s(556778404271106573L, var1, var3);
   }

   public void e(KV var1) {
      boolean var190;
      ArrayList var201;
      HashSet var204;
      Long var221;
      Integer var224;
      Long var228;
      Integer var230;
      Long var234;
      Long var236;
      YA3_2 var30;
      Object var34 = 556778404271106573L;
      Registry.packArgs(Ref.g(556778404271106573L, var34));
      long var36 = 492930666611970668L;
      Object var10002 = Ref.h2(492930666611970668L, var36);

      try {
         var10002 = (String[])var10002;
      } catch (InvocationTargetException var158) {
         throw var158.getTargetException();
      }

      String[] var3 = (String[])var10002;
      ArrayList var4 = new ArrayList();
      Hashtable var5 = new Hashtable();
      Object[] var10003 = Registry.emptyArgs();
      long var39 = 422469711202687666L;
      Object[] var38 = var10003;
      Ref.h(422469711202687666L, var38, var39);

      try {
         ;
      } catch (InvocationTargetException var157) {
         throw var157.getTargetException();
      }

      ArrayList var10004 = (ArrayList)(Registry.emptyArgs());
      long var41 = 564970639717807891L;
      Object var40 = var10004;
      var10004 = Ref.h(564970639717807891L, var40, var41);

      try {
         var10004 = (ArrayList)var10004;
      } catch (InvocationTargetException var156) {
         throw var156.getTargetException();
      }

      ArrayList var7 = var10004;
      String var180 = W2.F();
      HashSet var8 = new HashSet();
      ArrayList var9 = new ArrayList();
      String var2 = var180;
      HashMap var10005 = (HashMap)(Registry.emptyArgs());
      long var43 = 549555459408113402L;
      Object var42 = var10005;
      var10005 = Ref.h(549555459408113402L, var42, var43);

      try {
         var10005 = (HashMap)var10005;
      } catch (InvocationTargetException var155) {
         throw var155.getTargetException();
      }

      HashMap var10 = var10005;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;

      while (var13 < var3.length) {
         String var14 = var3[var13].trim();
         if (var2 != null) {
            label488:
            if (var14.startsWith(a(8072, -21782)) | var14.startsWith(a(8078, -4280))) {
               String[] var15;
               String var16;
               int var17;
               label507: {
                  var15 = var14.split(a(8070, 2328));
                  var16 = var15[3];
                  var17 = Integer.parseInt(var16.substring(var16.lastIndexOf(":") + 1));
                  String var18 = var15[4];
                  boolean var183 = var16.startsWith(a(8075, -27506));
                  if (var2 != null) {
                     if (var183) {
                        var16 = var16.substring(a(8076, -7680).length());
                     }

                     var10005 = (HashMap)(var18);
                     if (var2 == null) {
                        break label507;
                     }

                     var183 = var18.startsWith(a(8076, -7680));
                  }

                  if (var183) {
                     var18 = var18.substring(a(8076, -7680).length());
                  }

                  var10005 = (HashMap)(var16.substring(0, var16.lastIndexOf(":")));
               }

               String var19 = var10005;
               String var20 = var15[5];
               int var21 = var15[a(22703, 1777099439116973973L)].indexOf("/");
               String var22 = null;
               String var23 = null;
               if (var21 > 0) {
                  var23 = var15[a(22086, 6976786919063943549L)].substring(var21 + 1);
                  var22 = var15[a(22086, 6976786919063943549L)].substring(0, var21);
               }

               String var185 = var22;
               if (var2 != null) {
                  if (var22 == null) {
                     break label488;
                  }

                  var185 = var22;
               }

               int var24 = Integer.parseInt(var185);
               String var25 = var20.toUpperCase();
               boolean var186 = var25.equals(a(8074, 29057));
               label481:
               if (var2 != null) {
                  if (var186) {
                     Kw4 var26 = new Kw4();
                     var4.add(var26);
                     Object[] var10006 = Registry.packArgs(var23);
                     long var45 = 604698491530896175L;
                     Object[] var44 = var10006;
                     Ref.h(604698491530896175L, var44, var45);

                     try {
                        ;
                     } catch (InvocationTargetException var154) {
                        throw var154.getTargetException();
                     }

                     Object[] var10007 = Registry.packArgs(Registry.lookupField(126529082137801604L).getInt(null));
                     long var47 = 396111798097550562L;
                     Object[] var46 = var10007;
                     Ref.h(396111798097550562L, var46, var47);

                     try {
                        ;
                     } catch (InvocationTargetException var153) {
                        throw var153.getTargetException();
                     }

                     Object[] var10008 = Registry.packArgs(true);
                     long var49 = 451342210458553967L;
                     Object[] var48 = var10008;
                     Ref.h(451342210458553967L, var48, var49);

                     try {
                        ;
                     } catch (InvocationTargetException var152) {
                        throw var152.getTargetException();
                     }

                     Object[] var10009 = Registry.packArgs(var24);
                     long var51 = 528761183810844736L;
                     Object[] var50 = var10009;
                     Ref.h(528761183810844736L, var50, var51);

                     try {
                        ;
                     } catch (InvocationTargetException var151) {
                        throw var151.getTargetException();
                     }

                     Object[] var10010 = Registry.packArgs(var19);
                     long var53 = 175105964555233220L;
                     Object[] var52 = var10010;
                     Ref.h(175105964555233220L, var52, var53);

                     try {
                        ;
                     } catch (InvocationTargetException var150) {
                        throw var150.getTargetException();
                     }

                     Object[] var10011 = Registry.packArgs(var17);
                     long var55 = 141683116081092164L;
                     Object[] var54 = var10011;
                     Ref.h(141683116081092164L, var54, var55);

                     try {
                        ;
                     } catch (InvocationTargetException var149) {
                        throw var149.getTargetException();
                     }

                     new StringBuilder();
                     String var10014 = (String)(Registry.emptyArgs());
                     long var57 = 516374718951189974L;
                     Object var56 = var10014;
                     var10014 = Ref.h(516374718951189974L, var56, var57);

                     try {
                        var10014 = (String)var10014;
                     } catch (InvocationTargetException var148) {
                        throw var148.getTargetException();
                     }

                     var26.append((String)var10014).append(":");
                     Object var10015 = Registry.emptyArgs();
                     long var59 = 528143184018704864L;
                     Object var58 = var10015;
                     var10015 = Ref.h(528143184018704864L, var58, var59);

                     try {
                        var224 = (Integer)var10015;
                     } catch (InvocationTargetException var147) {
                        throw var147.getTargetException();
                     }

                     var10014 = Registry.packArgs(var26.append(var224).toString());
                     long var61 = 601147292856178678L;
                     Object var60 = var10014;
                     Ref.h(601147292856178678L, var60, var61);

                     try {
                        ;
                     } catch (InvocationTargetException var146) {
                        throw var146.getTargetException();
                     }

                     var8.add(var17);
                     if (var17 == a(29020, 8296348846758223460L)) {
                     }

                     var5.put(var16, var26);
                     if (var2 != null) {
                        break label481;
                     }

                     Ky4.K(new String[2]);
                  }

                  var9.add(var14);
               }
            }

            var13++;
         }

         if (var2 == null) {
            break;
         }
      }

      HashMap var159 = new HashMap();
      Iterator var160 = var9.iterator();

      while (true) {
         if (var160.hasNext()) {
            String var161 = (String)var160.next();
            String[] var162 = var161.split(a(8079, 5523));
            String var163 = var162[3];
            int var165 = Integer.parseInt(var163.substring(var163.lastIndexOf(":") + 1));
            String var166 = var162[4];
            int var167 = Integer.parseInt(var166.substring(var166.lastIndexOf(":") + 1));
            String var168 = var162[5];
            int var169 = var162[a(22086, 6976786919063943549L)].indexOf("/");
            String var170 = null;
            String var171 = null;
            if (var2 == null) {
               break;
            }

            if (var169 > 0) {
               var171 = var162[a(22086, 6976786919063943549L)].substring(var169 + 1);
               var170 = var162[a(22086, 6976786919063943549L)].substring(0, var169);
            }

            label512: {
               String var187 = var170;
               if (var2 != null) {
                  if (var170 == null) {
                     break label512;
                  }

                  var187 = var170;
               }

               int var172;
               String var173;
               label513: {
                  var172 = Integer.parseInt(var187);
                  var173 = var168.toUpperCase();
                  boolean var188 = var163.startsWith(a(8076, -7680));
                  if (var2 != null) {
                     if (var188) {
                        var163 = var163.substring(a(8076, -7680).length());
                     }

                     var10005 = (HashMap)(var166);
                     if (var2 == null) {
                        break label513;
                     }

                     var188 = var166.startsWith(a(8076, -7680));
                  }

                  if (var188) {
                     var166 = var166.substring(a(8076, -7680).length());
                  }

                  var10005 = (HashMap)(var163.substring(0, var163.lastIndexOf(":")));
               }

               String var27;
               String var28;
               boolean var29;
               var27 = (String)(var10005);
               var28 = var166.substring(0, var166.lastIndexOf(":"));
               var29 = false;
               var190 = var7.contains(var27);
               label455:
               if (var2 != null) {
                  if (var190) {
                     var190 = var8.contains(var165);
                     if (var2 == null) {
                        break label455;
                     }

                     if (var190) {
                        var29 = true;
                     }
                  }

                  var190 = var173.equals(a(8077, -32683));
               }

               if (var190) {
                  var30 = new YA3_2();
                  Object[] var191 = Registry.packArgs(var172);
                  long var63 = 277986980064793686L;
                  Object[] var62 = var191;
                  Ref.h(277986980064793686L, var62, var63);

                  try {
                     ;
                  } catch (InvocationTargetException var145) {
                     throw var145.getTargetException();
                  }

                  Object[] var193 = Registry.packArgs(var27);
                  long var65 = 165778912932304548L;
                  Object[] var64 = var193;
                  Ref.h(165778912932304548L, var64, var65);

                  try {
                     ;
                  } catch (InvocationTargetException var144) {
                     throw var144.getTargetException();
                  }

                  Object[] var194 = Registry.packArgs(var165);
                  long var67 = 569160279931635609L;
                  Object[] var66 = var194;
                  Ref.h(569160279931635609L, var66, var67);

                  try {
                     ;
                  } catch (InvocationTargetException var143) {
                     throw var143.getTargetException();
                  }

                  Object[] var195 = Registry.packArgs(var28);
                  long var69 = 519553512271450803L;
                  Object[] var68 = var195;
                  Ref.h(519553512271450803L, var68, var69);

                  try {
                     ;
                  } catch (InvocationTargetException var142) {
                     throw var142.getTargetException();
                  }

                  Object[] var196 = Registry.packArgs(var167);
                  long var71 = 167333188508035389L;
                  Object[] var70 = var196;
                  Ref.h(167333188508035389L, var70, var71);

                  try {
                     ;
                  } catch (InvocationTargetException var141) {
                     throw var141.getTargetException();
                  }

                  Object[] var197 = Registry.packArgs(var27 + ":" + var165 + ">" + var28 + ":" + var167);
                  long var73 = 517881715633737386L;
                  Object[] var72 = var197;
                  Ref.h(517881715633737386L, var72, var73);

                  try {
                     ;
                  } catch (InvocationTargetException var140) {
                     throw var140.getTargetException();
                  }

                  Kw4 var206;
                  label447: {
                     Kw4 var174;
                     label515: {
                        var174 = null;
                        if (var2 != null) {
                           if (var29) {
                              Object[] var205 = Registry.packArgs(Registry.lookupField(252289193443733586L).getInt(null));
                              long var75 = 255008046329032237L;
                              Object[] var74 = var205;
                              Ref.h(255008046329032237L, var74, var75);

                              try {
                                 ;
                              } catch (InvocationTargetException var139) {
                                 throw var139.getTargetException();
                              }

                              var11++;
                              var174 = (Kw4)var5.get(var27 + ":" + var165);
                              var206 = var174;
                              label438:
                              if (var2 != null) {
                                 if (var174 == null) {
                                    String var32 = a(8073, -19169) + var165;
                                    var174 = (Kw4)var5.get(var32);
                                    var206 = var174;
                                    if (var2 == null) {
                                       break label438;
                                    }

                                    if (var174 == null) {
                                       var32 = a(8071, -16582) + var165;
                                       var174 = (Kw4)var5.get(var32);
                                    }
                                 }

                                 var206 = var174;
                              }

                              if (var2 == null) {
                                 break label447;
                              }

                              if (var206 != null) {
                                 ArrayList var207 = Registry.emptyArgs();
                                 long var77 = 279562214327125641L;
                                 Object var76 = var207;
                                 var207 = Ref.h(279562214327125641L, var76, var77);

                                 try {
                                    var207 = (ArrayList)var207;
                                 } catch (InvocationTargetException var138) {
                                    throw var138.getTargetException();
                                 }

                                 var207.add(var30);
                                 HashSet var214 = Registry.emptyArgs();
                                 long var79 = 398648618049357234L;
                                 Object var78 = var214;
                                 var214 = Ref.h(398648618049357234L, var78, var79);

                                 try {
                                    var214 = (HashSet)var214;
                                 } catch (InvocationTargetException var137) {
                                    throw var137.getTargetException();
                                 }

                                 var214.add(var28);
                              }
                              break label515;
                           }

                           var12++;
                           Object[] var10012 = Registry.packArgs(Registry.lookupField(591847900175052583L).getInt(null));
                           long var81 = 255008046329032237L;
                           Object[] var80 = var10012;
                           Ref.h(255008046329032237L, var80, var81);

                           try {
                              ;
                           } catch (InvocationTargetException var136) {
                              throw var136.getTargetException();
                           }
                        }

                        var174 = (Kw4)var159.get(var172);
                        if (var2 != null) {
                           if (var174 == null) {
                              var174 = new Kw4();
                              Object[] var198 = Registry.packArgs(Registry.lookupField(384522389032676406L).getInt(null));
                              long var83 = 396111798097550562L;
                              Object[] var82 = var198;
                              Ref.h(396111798097550562L, var82, var83);

                              try {
                                 ;
                              } catch (InvocationTargetException var135) {
                                 throw var135.getTargetException();
                              }

                              Object[] var10013 = Registry.packArgs(var172);
                              long var85 = 528761183810844736L;
                              Object[] var84 = var10013;
                              Ref.h(528761183810844736L, var84, var85);

                              try {
                                 ;
                              } catch (InvocationTargetException var134) {
                                 throw var134.getTargetException();
                              }

                              Object[] var213 = Registry.packArgs(var171);
                              long var87 = 604698491530896175L;
                              Object[] var86 = var213;
                              Ref.h(604698491530896175L, var86, var87);

                              try {
                                 ;
                              } catch (InvocationTargetException var133) {
                                 throw var133.getTargetException();
                              }

                              new StringBuilder();
                              Object var10017 = Registry.emptyArgs();
                              long var89 = 134324574424375296L;
                              Object var88 = var10017;
                              var10017 = Ref.h(134324574424375296L, var88, var89);

                              try {
                                 var230 = (Integer)var10017;
                              } catch (InvocationTargetException var132) {
                                 throw var132.getTargetException();
                              }

                              Object[] var10016 = Registry.packArgs(var174.append(var230).append("").toString());
                              long var91 = 601147292856178678L;
                              Object[] var90 = var10016;
                              Ref.h(601147292856178678L, var90, var91);

                              try {
                                 ;
                              } catch (InvocationTargetException var131) {
                                 throw var131.getTargetException();
                              }

                              var159.put(var172, var174);
                              var4.add(var174);
                           }

                           Object[] var199 = Registry.emptyArgs();
                           long var93 = 279562214327125641L;
                           Object[] var92 = var199;
                           var206 = (Kw4)Ref.h(279562214327125641L, var92, var93);

                           try {
                              var201 = (ArrayList)var206;
                           } catch (InvocationTargetException var130) {
                              throw var130.getTargetException();
                           }

                           var201.add(var30);
                        }

                        Object[] var202 = Registry.emptyArgs();
                        long var95 = 398648618049357234L;
                        Object[] var94 = var202;
                        var206 = (Kw4)Ref.h(398648618049357234L, var94, var95);

                        try {
                           var204 = (HashSet)var206;
                        } catch (InvocationTargetException var129) {
                           throw var129.getTargetException();
                        }

                        var204.add(var28);
                     }

                     var206 = var174;
                  }

                  label423:
                  if (var206 != null) {
                     String var176 = var27 + ":" + var165 + ">" + var28 + ":" + var167;
                     OZ var33 = (OZ)var10.get(var176);
                     if (var2 != null) {
                        if (var33 == null) {
                           break label423;
                        }

                        Object[] var217 = Registry.emptyArgs();
                        long var97 = 165254620646467988L;
                        Object[] var96 = var217;
                        var217 = Ref.h(165254620646467988L, var96, var97);

                        try {
                        } catch (InvocationTargetException var128) {
                           throw var128.getTargetException();
                        }

                        Object var226 = Registry.emptyArgs();
                        long var99 = 189130403447250799L;
                        Object var98 = var226;
                        var226 = Ref.h(189130403447250799L, var98, var99);

                        try {
                           var228 = (Long)var226;
                        } catch (InvocationTargetException var127) {
                           throw var127.getTargetException();
                        }

                        Object[] var225 = Registry.e(var33 + var228);
                        long var101 = 233850027477174692L;
                        Object[] var100 = var225;
                        Ref.h(233850027477174692L, var100, var101);

                        try {
                           ;
                        } catch (InvocationTargetException var126) {
                           throw var126.getTargetException();
                        }

                        Object[] var231 = Registry.emptyArgs();
                        long var103 = 361501567714445109L;
                        Object[] var102 = var231;
                        var231 = Ref.h(361501567714445109L, var102, var103);

                        try {
                        } catch (InvocationTargetException var125) {
                           throw var125.getTargetException();
                        }

                        Object var10019 = Registry.emptyArgs();
                        long var105 = 150303758740753425L;
                        Object var104 = var10019;
                        var10019 = Ref.h(150303758740753425L, var104, var105);

                        try {
                           var234 = (Long)var10019;
                        } catch (InvocationTargetException var124) {
                           throw var124.getTargetException();
                        }

                        Object[] var10018 = Registry.e(var33 + var234);
                        long var107 = 359513859375642121L;
                        Object[] var106 = var10018;
                        Ref.h(359513859375642121L, var106, var107);

                        try {
                           ;
                        } catch (InvocationTargetException var123) {
                           throw var123.getTargetException();
                        }

                        Object var10020 = Registry.emptyArgs();
                        long var109 = 189130403447250799L;
                        Object var108 = var10020;
                        var10020 = Ref.h(189130403447250799L, var108, var109);

                        try {
                           var236 = (Long)var10020;
                        } catch (InvocationTargetException var122) {
                           throw var122.getTargetException();
                        }

                        var10020 = Registry.e(var236);
                        long var111 = 254817285381558947L;
                        Object var110 = var10020;
                        Ref.h(254817285381558947L, var110, var111);

                        try {
                           ;
                        } catch (InvocationTargetException var121) {
                           throw var121.getTargetException();
                        }
                     }

                     Object var219 = Registry.emptyArgs();
                     long var113 = 150303758740753425L;
                     Object var112 = var219;
                     var219 = Ref.h(150303758740753425L, var112, var113);

                     try {
                        var221 = (Long)var219;
                     } catch (InvocationTargetException var120) {
                        throw var120.getTargetException();
                     }

                     var219 = Registry.e(var221);
                     long var115 = 346841464348319226L;
                     Object var114 = var219;
                     Ref.h(346841464348319226L, var114, var115);

                     try {
                        ;
                     } catch (InvocationTargetException var119) {
                        throw var119.getTargetException();
                     }
                  }
               }
            }

            if (var2 != null) {
               continue;
            }
         }

         Object[] var192 = Registry.packArgs(var4);
         long var117 = 421809174249991012L;
         Object[] var116 = var192;
         Ref.h(421809174249991012L, var116, var117);

         try {
            break;
         } catch (InvocationTargetException var118) {
            throw var118.getTargetException();
         }
      }
   }

   public String p(int var1, KV var2) {
      String var10000 = W2.F();
      Object var4 = null;
      String var3 = var10000;
      U82 var10001 = (U82)(Registry.packArgs(var1));
      long var7 = 397583903343830359L;
      Object var6 = var10001;
      var10001 = Ref.h(397583903343830359L, var6, var7);

      try {
         var10001 = (U82)var10001;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      U82 var5 = var10001;
      if (var3 == null || var5 != null) {
         LI3_2 var10002 = (LI3_2)(Registry.emptyArgs());
         long var9 = 412318774197756267L;
         Object var8 = var10002;
         var10002 = Ref.h(412318774197756267L, var8, var9);

         try {
            var10002 = (LI3_2)var10002;
         } catch (InvocationTargetException var21) {
            throw var21.getTargetException();
         }

         if (var3 != null) {
            if (var10002 == null) {
               return (String)var4;
            }

            Object[] var10003 = Registry.emptyArgs();
            long var11 = 412318774197756267L;
            Object[] var10 = var10003;
            Ref.h(412318774197756267L, var10, var11);

            try {
               ;
            } catch (InvocationTargetException var20) {
               throw var20.getTargetException();
            }
         }

         String var27 = (String)(Registry.emptyArgs());
         long var13 = 505915899939017355L;
         Object var12 = var27;
         var27 = Ref.h(505915899939017355L, var12, var13);

         try {
            var27 = (String)var27;
         } catch (InvocationTargetException var19) {
            throw var19.getTargetException();
         }

         if (var3 != null) {
            if (var27 == null) {
               return (String)var4;
            }

            var27 = (String)(var5);
            Object[] var10004 = Registry.emptyArgs();
            long var15 = 412318774197756267L;
            Object[] var14 = var10004;
            Ref.h(412318774197756267L, var14, var15);
            Object[] var10005 = Registry.emptyArgs();
            long var17 = 505915899939017355L;
            Object[] var16 = var10005;
            Ref.h(505915899939017355L, var16, var17);

            try {
               ;
            } catch (InvocationTargetException var18) {
               throw var18.getTargetException();
            }
         }

         var4 = var27;
      }

      return (String)var4;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 8079) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 100;
               break;
            case 1:
               var10000 = 188;
               break;
            case 2:
               var10000 = 103;
               break;
            case 3:
               var10000 = 49;
               break;
            case 4:
               var10000 = 251;
               break;
            case 5:
               var10000 = 60;
               break;
            case 6:
               var10000 = 37;
               break;
            case 7:
               var10000 = 72;
               break;
            case 8:
               var10000 = 155;
               break;
            case 9:
               var10000 = 217;
               break;
            case 10:
               var10000 = 208;
               break;
            case 11:
               var10000 = 249;
               break;
            case 12:
               var10000 = 112;
               break;
            case 13:
               var10000 = 24;
               break;
            case 14:
               var10000 = 175;
               break;
            case 15:
               var10000 = 99;
               break;
            case 16:
               var10000 = 215;
               break;
            case 17:
               var10000 = 71;
               break;
            case 18:
               var10000 = 171;
               break;
            case 19:
               var10000 = 39;
               break;
            case 20:
               var10000 = 253;
               break;
            case 21:
               var10000 = 21;
               break;
            case 22:
               var10000 = 152;
               break;
            case 23:
               var10000 = 104;
               break;
            case 24:
               var10000 = 114;
               break;
            case 25:
               var10000 = 246;
               break;
            case 26:
               var10000 = 131;
               break;
            case 27:
               var10000 = 247;
               break;
            case 28:
               var10000 = 118;
               break;
            case 29:
               var10000 = 41;
               break;
            case 30:
               var10000 = 83;
               break;
            case 31:
               var10000 = 161;
               break;
            case 32:
               var10000 = 250;
               break;
            case 33:
               var10000 = 115;
               break;
            case 34:
               var10000 = 22;
               break;
            case 35:
               var10000 = 173;
               break;
            case 36:
               var10000 = 162;
               break;
            case 37:
               var10000 = 142;
               break;
            case 38:
               var10000 = 78;
               break;
            case 39:
               var10000 = 196;
               break;
            case 40:
               var10000 = 232;
               break;
            case 41:
               var10000 = 201;
               break;
            case 42:
               var10000 = 136;
               break;
            case 43:
               var10000 = 105;
               break;
            case 44:
               var10000 = 5;
               break;
            case 45:
               var10000 = 69;
               break;
            case 46:
               var10000 = 88;
               break;
            case 47:
               var10000 = 48;
               break;
            case 48:
               var10000 = 134;
               break;
            case 49:
               var10000 = 154;
               break;
            case 50:
               var10000 = 200;
               break;
            case 51:
               var10000 = 133;
               break;
            case 52:
               var10000 = 74;
               break;
            case 53:
               var10000 = 7;
               break;
            case 54:
               var10000 = 93;
               break;
            case 55:
               var10000 = 67;
               break;
            case 56:
               var10000 = 138;
               break;
            case 57:
               var10000 = 8;
               break;
            case 58:
               var10000 = 198;
               break;
            case 59:
               var10000 = 62;
               break;
            case 60:
               var10000 = 211;
               break;
            case 61:
               var10000 = 157;
               break;
            case 62:
               var10000 = 166;
               break;
            case 63:
               var10000 = 3;
               break;
            case 64:
               var10000 = 106;
               break;
            case 65:
               var10000 = 77;
               break;
            case 66:
               var10000 = 227;
               break;
            case 67:
               var10000 = 86;
               break;
            case 68:
               var10000 = 156;
               break;
            case 69:
               var10000 = 168;
               break;
            case 70:
               var10000 = 178;
               break;
            case 71:
               var10000 = 140;
               break;
            case 72:
               var10000 = 16;
               break;
            case 73:
               var10000 = 80;
               break;
            case 74:
               var10000 = 179;
               break;
            case 75:
               var10000 = 226;
               break;
            case 76:
               var10000 = 128;
               break;
            case 77:
               var10000 = 19;
               break;
            case 78:
               var10000 = 212;
               break;
            case 79:
               var10000 = 213;
               break;
            case 80:
               var10000 = 255;
               break;
            case 81:
               var10000 = 141;
               break;
            case 82:
               var10000 = 121;
               break;
            case 83:
               var10000 = 40;
               break;
            case 84:
               var10000 = 79;
               break;
            case 85:
               var10000 = 197;
               break;
            case 86:
               var10000 = 47;
               break;
            case 87:
               var10000 = 214;
               break;
            case 88:
               var10000 = 169;
               break;
            case 89:
               var10000 = 87;
               break;
            case 90:
               var10000 = 243;
               break;
            case 91:
               var10000 = 29;
               break;
            case 92:
               var10000 = 187;
               break;
            case 93:
               var10000 = 124;
               break;
            case 94:
               var10000 = 159;
               break;
            case 95:
               var10000 = 219;
               break;
            case 96:
               var10000 = 163;
               break;
            case 97:
               var10000 = 254;
               break;
            case 98:
               var10000 = 28;
               break;
            case 99:
               var10000 = 234;
               break;
            case 100:
               var10000 = 184;
               break;
            case 101:
               var10000 = 210;
               break;
            case 102:
               var10000 = 180;
               break;
            case 103:
               var10000 = 143;
               break;
            case 104:
               var10000 = 202;
               break;
            case 105:
               var10000 = 224;
               break;
            case 106:
               var10000 = 203;
               break;
            case 107:
               var10000 = 132;
               break;
            case 108:
               var10000 = 193;
               break;
            case 109:
               var10000 = 46;
               break;
            case 110:
               var10000 = 160;
               break;
            case 111:
               var10000 = 94;
               break;
            case 112:
               var10000 = 81;
               break;
            case 113:
               var10000 = 44;
               break;
            case 114:
               var10000 = 20;
               break;
            case 115:
               var10000 = 109;
               break;
            case 116:
               var10000 = 236;
               break;
            case 117:
               var10000 = 126;
               break;
            case 118:
               var10000 = 73;
               break;
            case 119:
               var10000 = 42;
               break;
            case 120:
               var10000 = 66;
               break;
            case 121:
               var10000 = 98;
               break;
            case 122:
               var10000 = 170;
               break;
            case 123:
               var10000 = 150;
               break;
            case 124:
               var10000 = 52;
               break;
            case 125:
               var10000 = 185;
               break;
            case 126:
               var10000 = 144;
               break;
            case 127:
               var10000 = 153;
               break;
            case 128:
               var10000 = 57;
               break;
            case 129:
               var10000 = 192;
               break;
            case 130:
               var10000 = 14;
               break;
            case 131:
               var10000 = 10;
               break;
            case 132:
               var10000 = 164;
               break;
            case 133:
               var10000 = 139;
               break;
            case 134:
               var10000 = 61;
               break;
            case 135:
               var10000 = 17;
               break;
            case 136:
               var10000 = 54;
               break;
            case 137:
               var10000 = 11;
               break;
            case 138:
               var10000 = 191;
               break;
            case 139:
               var10000 = 146;
               break;
            case 140:
               var10000 = 252;
               break;
            case 141:
               var10000 = 32;
               break;
            case 142:
               var10000 = 230;
               break;
            case 143:
               var10000 = 2;
               break;
            case 144:
               var10000 = 0;
               break;
            case 145:
               var10000 = 85;
               break;
            case 146:
               var10000 = 167;
               break;
            case 147:
               var10000 = 25;
               break;
            case 148:
               var10000 = 174;
               break;
            case 149:
               var10000 = 245;
               break;
            case 150:
               var10000 = 38;
               break;
            case 151:
               var10000 = 241;
               break;
            case 152:
               var10000 = 45;
               break;
            case 153:
               var10000 = 205;
               break;
            case 154:
               var10000 = 68;
               break;
            case 155:
               var10000 = 82;
               break;
            case 156:
               var10000 = 107;
               break;
            case 157:
               var10000 = 194;
               break;
            case 158:
               var10000 = 75;
               break;
            case 159:
               var10000 = 165;
               break;
            case 160:
               var10000 = 53;
               break;
            case 161:
               var10000 = 148;
               break;
            case 162:
               var10000 = 183;
               break;
            case 163:
               var10000 = 111;
               break;
            case 164:
               var10000 = 26;
               break;
            case 165:
               var10000 = 190;
               break;
            case 166:
               var10000 = 50;
               break;
            case 167:
               var10000 = 176;
               break;
            case 168:
               var10000 = 149;
               break;
            case 169:
               var10000 = 240;
               break;
            case 170:
               var10000 = 116;
               break;
            case 171:
               var10000 = 84;
               break;
            case 172:
               var10000 = 6;
               break;
            case 173:
               var10000 = 117;
               break;
            case 174:
               var10000 = 9;
               break;
            case 175:
               var10000 = 129;
               break;
            case 176:
               var10000 = 55;
               break;
            case 177:
               var10000 = 225;
               break;
            case 178:
               var10000 = 120;
               break;
            case 179:
               var10000 = 220;
               break;
            case 180:
               var10000 = 125;
               break;
            case 181:
               var10000 = 23;
               break;
            case 182:
               var10000 = 122;
               break;
            case 183:
               var10000 = 195;
               break;
            case 184:
               var10000 = 123;
               break;
            case 185:
               var10000 = 172;
               break;
            case 186:
               var10000 = 231;
               break;
            case 187:
               var10000 = 137;
               break;
            case 188:
               var10000 = 151;
               break;
            case 189:
               var10000 = 30;
               break;
            case 190:
               var10000 = 233;
               break;
            case 191:
               var10000 = 13;
               break;
            case 192:
               var10000 = 59;
               break;
            case 193:
               var10000 = 130;
               break;
            case 194:
               var10000 = 119;
               break;
            case 195:
               var10000 = 33;
               break;
            case 196:
               var10000 = 204;
               break;
            case 197:
               var10000 = 242;
               break;
            case 198:
               var10000 = 186;
               break;
            case 199:
               var10000 = 237;
               break;
            case 200:
               var10000 = 91;
               break;
            case 201:
               var10000 = 101;
               break;
            case 202:
               var10000 = 95;
               break;
            case 203:
               var10000 = 218;
               break;
            case 204:
               var10000 = 238;
               break;
            case 205:
               var10000 = 34;
               break;
            case 206:
               var10000 = 145;
               break;
            case 207:
               var10000 = 199;
               break;
            case 208:
               var10000 = 15;
               break;
            case 209:
               var10000 = 102;
               break;
            case 210:
               var10000 = 189;
               break;
            case 211:
               var10000 = 43;
               break;
            case 212:
               var10000 = 182;
               break;
            case 213:
               var10000 = 4;
               break;
            case 214:
               var10000 = 70;
               break;
            case 215:
               var10000 = 90;
               break;
            case 216:
               var10000 = 65;
               break;
            case 217:
               var10000 = 158;
               break;
            case 218:
               var10000 = 181;
               break;
            case 219:
               var10000 = 177;
               break;
            case 220:
               var10000 = 216;
               break;
            case 221:
               var10000 = 12;
               break;
            case 222:
               var10000 = 228;
               break;
            case 223:
               var10000 = 113;
               break;
            case 224:
               var10000 = 1;
               break;
            case 225:
               var10000 = 127;
               break;
            case 226:
               var10000 = 18;
               break;
            case 227:
               var10000 = 76;
               break;
            case 228:
               var10000 = 248;
               break;
            case 229:
               var10000 = 209;
               break;
            case 230:
               var10000 = 36;
               break;
            case 231:
               var10000 = 207;
               break;
            case 232:
               var10000 = 223;
               break;
            case 233:
               var10000 = 235;
               break;
            case 234:
               var10000 = 221;
               break;
            case 235:
               var10000 = 56;
               break;
            case 236:
               var10000 = 92;
               break;
            case 237:
               var10000 = 229;
               break;
            case 238:
               var10000 = 206;
               break;
            case 239:
               var10000 = 64;
               break;
            case 240:
               var10000 = 35;
               break;
            case 241:
               var10000 = 147;
               break;
            case 242:
               var10000 = 63;
               break;
            case 243:
               var10000 = 27;
               break;
            case 244:
               var10000 = 239;
               break;
            case 245:
               var10000 = 51;
               break;
            case 246:
               var10000 = 110;
               break;
            case 247:
               var10000 = 108;
               break;
            case 248:
               var10000 = 135;
               break;
            case 249:
               var10000 = 58;
               break;
            case 250:
               var10000 = 96;
               break;
            case 251:
               var10000 = 222;
               break;
            case 252:
               var10000 = 31;
               break;
            case 253:
               var10000 = 97;
               break;
            case 254:
               var10000 = 89;
               break;
            default:
               var10000 = 244;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12090;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var30;
      String[] var13 = new String[10];
      int var11 = 0;
      String var10 = "\u0094\\\u0087\u0003Æ\u0007\u009a\u000bVÜ\u009a-b\u000f]H{\u009c¤\u0007t?|2î\u0005\u001f\u0007_\f\u0019TBÉ\u008a\u0006ß\u0083\u0084\u008aAN\b³ª\u0099^\u0098\u0081GÞ\u0003Úä8";
      int var12 = "\u0094\\\u0087\u0003Æ\u0007\u009a\u000bVÜ\u009a-b\u000f]H{\u009c¤\u0007t?|2î\u0005\u001f\u0007_\f\u0019TBÉ\u008a\u0006ß\u0083\u0084\u008aAN\b³ª\u0099^\u0098\u0081GÞ\u0003Úä8"
         .length();
      char var9 = 3;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 120;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 6;
                        break;
                     case 1:
                        var58 = 111;
                        break;
                     case 2:
                        var58 = 94;
                        break;
                     case 3:
                        var58 = 84;
                        break;
                     case 4:
                        var58 = 17;
                        break;
                     case 5:
                        var58 = 114;
                        break;
                     default:
                        var58 = 7;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     a = var13;
                     b = new String[10];
                     long var0 = 2945474438442102764L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "#\u00adº¯aIX\u007f\u0087\u0000Ê\u0088^0V\u0097%Î²â©ëýW";
                     int var5 = "#\u00adº¯aIX\u007f\u0087\u0000Ê\u0088^0V\u0097%Î²â©ëýW".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
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
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     c = var6;
                     d = new Integer[3];
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "â\u0016Õ\u0003â\u0095n";
                  var12 = "â\u0016Õ\u0003â\u0095n".length();
                  var9 = 3;
                  var16 = -1;
            }

            var10000 = 18;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





