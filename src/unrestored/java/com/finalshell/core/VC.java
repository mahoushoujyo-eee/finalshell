package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class VC {
   public String h;
   public String f;
   public String x;

   public VC(String var1) {
      long var3 = 628672175147824801L;
      Ref.s(628672175147824801L, var1, var3);
   }

   public void P(KV var1) {
      Long var217;
      Long var227;
      Long var230;
      Long var236;
      Long var240;
      Long var248;
      Long var254;
      Long var262;
      Long var266;
      Long var270;
      Long var276;
      Long var279;
      Long var292;
      Long var297;
      Long var302;
      String[] var2 = KV.b$arrString();
      Object var17 = 144008674458598213L;
      Object var10001 = (String)Ref.g(144008674458598213L, var17);
      if (var2 == null) {
         if (var10001 == null) {
            return;
         }

         var10001 = this;
         Object var19 = 628672175147824801L;
         String var10002 = (String)Ref.g(628672175147824801L, var19);
      }

      VC var209 = var10001.equals((String)Registry.lookupField(517036517890312843L).get(null));
      if (var2 == null) {
         if (var209 == null) {
            Object var21 = 617838227313014025L;
            // [VF-super] super((String)Ref.g(617838227313014025L, var21));
            Object var23 = 144008674458598213L;
            // [VF-super] super((String)Ref.g(144008674458598213L, var23));
            Object[] var10004 = Registry.emptyArgs();
            long var26 = 353089397726719240L;
            Object[] var25 = var10004;
            Ref.h(353089397726719240L, var25, var26);

            try {
               ;
            } catch (InvocationTargetException var206) {
               throw var206.getTargetException();
            }

            Object[] var10005 = Registry.emptyArgs();
            long var28 = 353089397726719240L;
            Object[] var27 = var10005;
            Ref.h(353089397726719240L, var27, var28);

            try {
               ;
            } catch (InvocationTargetException var205) {
               throw var205.getTargetException();
            }

            ArrayList var10006 = (ArrayList)(Registry.emptyArgs());
            long var30 = 404630534603805086L;
            Object var29 = var10006;
            var10006 = Ref.h(404630534603805086L, var29, var30);

            try {
               var10006 = (ArrayList)var10006;
            } catch (InvocationTargetException var204) {
               throw var204.getTargetException();
            }

            for (N var9 : var10006) {
               String var10007 = (String)(Registry.emptyArgs());
               long var32 = 325825537657373656L;
               Object var31 = var10007;
               var10007 = Ref.h(325825537657373656L, var31, var32);

               try {
                  var10007 = (String)var10007;
               } catch (InvocationTargetException var190) {
                  throw var190.getTargetException();
               }

               String var10 = var10007;
               N var10008 = (N)(Registry.packArgs(var10));
               long var34 = 382412091935120220L;
               Object var33 = var10008;
               var10008 = Ref.h(382412091935120220L, var33, var34);

               try {
                  var10008 = (N)var10008;
               } catch (InvocationTargetException var189) {
                  throw var189.getTargetException();
               }

               N var11 = var10008;
               if (var2 != null) {
                  return;
               }

               if (var11 != null) {
                  UI3 var10009 = (UI3)(Registry.packArgs(var10));
                  long var36 = 128863411504517789L;
                  Object var35 = var10009;
                  var10009 = Ref.h(128863411504517789L, var35, var36);

                  try {
                     var10009 = (UI3)var10009;
                  } catch (InvocationTargetException var203) {
                     throw var203.getTargetException();
                  }

                  UI3 var12;
                  label548: {
                     var12 = var10009;
                     if (var2 == null) {
                        if (var12 != null) {
                           break label548;
                        }

                        var12 = new UI3();
                     }

                     Object[] var10010 = Registry.packArgs(var10);
                     long var38 = 614789459330733016L;
                     Object[] var37 = var10010;
                     Ref.h(614789459330733016L, var37, var38);

                     try {
                        ;
                     } catch (InvocationTargetException var202) {
                        throw var202.getTargetException();
                     }

                     ArrayList var10011 = Registry.emptyArgs();
                     long var40 = 580849036705130203L;
                     Object var39 = var10011;
                     var10011 = Ref.h(580849036705130203L, var39, var40);

                     try {
                        var10011 = (ArrayList)var10011;
                     } catch (InvocationTargetException var201) {
                        throw var201.getTargetException();
                     }

                     var10011.add(var12);
                  }

                  long var13 = Registry.lookupField(428744148812321032L).getLong(var9) - Registry.lookupField(428744148812321032L).getLong(var11);
                  long var15 = Registry.lookupField(315787338003670960L).getLong(var9) - Registry.lookupField(315787338003670960L).getLong(var11);
                  Object[] var10012 = Registry.e(var15);
                  long var42 = 310442509602164955L;
                  Object[] var41 = var10012;
                  Ref.h(310442509602164955L, var41, var42);

                  try {
                     ;
                  } catch (InvocationTargetException var200) {
                     throw var200.getTargetException();
                  }

                  Object[] var10013 = Registry.e(var13);
                  long var44 = 550903207497754205L;
                  Object[] var43 = var10013;
                  Ref.h(550903207497754205L, var43, var44);

                  try {
                     ;
                  } catch (InvocationTargetException var199) {
                     throw var199.getTargetException();
                  }

                  Object var10014 = Registry.emptyArgs();
                  long var46 = 154304842326423992L;
                  Object var45 = var10014;
                  var10014 = Ref.h(154304842326423992L, var45, var46);

                  try {
                     var279 = (Long)var10014;
                  } catch (InvocationTargetException var198) {
                     throw var198.getTargetException();
                  }

                  long var306;
                  UI3 var280 = (var306 = var279 - 0L) == 0L ? 0 : (var306 < 0L ? -1 : 1);
                  if (var2 == null) {
                     if (var280 == null) {
                        Object[] var10015 = Registry.e(Registry.lookupField(315787338003670960L).getLong(var11));
                        long var48 = 133459673991489049L;
                        Object[] var47 = var10015;
                        Ref.h(133459673991489049L, var47, var48);

                        try {
                           ;
                        } catch (InvocationTargetException var197) {
                           throw var197.getTargetException();
                        }
                     }

                     var280 = var12;
                     Object[] var286 = Registry.e(Registry.lookupField(315787338003670960L).getLong(var9));
                     long var50 = 329673182128778288L;
                     Object[] var49 = var286;
                     Ref.h(329673182128778288L, var49, var50);

                     try {
                        ;
                     } catch (InvocationTargetException var196) {
                        throw var196.getTargetException();
                     }

                     Object var10016 = Registry.emptyArgs();
                     long var52 = 416428535578363385L;
                     Object var51 = var10016;
                     var10016 = Ref.h(416428535578363385L, var51, var52);

                     try {
                        var297 = (Long)var10016;
                     } catch (InvocationTargetException var195) {
                        throw var195.getTargetException();
                     }

                     long var307;
                     int var298 = (var307 = var297 - 0L) == 0L ? 0 : (var307 < 0L ? -1 : 1);
                  }

                  if (var2 == null) {
                     if (var280 == null) {
                        Object[] var287 = Registry.e(Registry.lookupField(428744148812321032L).getLong(var11));
                        long var54 = 620383792453224883L;
                        Object[] var53 = var287;
                        Ref.h(620383792453224883L, var53, var54);

                        try {
                           ;
                        } catch (InvocationTargetException var194) {
                           throw var194.getTargetException();
                        }
                     }

                     var280 = var12;
                     Object[] var288 = Registry.e(Registry.lookupField(428744148812321032L).getLong(var9));
                     long var56 = 508361882806176515L;
                     Object[] var55 = var288;
                     Ref.h(508361882806176515L, var55, var56);

                     try {
                        ;
                     } catch (InvocationTargetException var193) {
                        throw var193.getTargetException();
                     }

                     Object[] var299 = Registry.emptyArgs();
                     long var58 = 350674985735262973L;
                     Object[] var57 = var299;
                     Ref.h(350674985735262973L, var57, var58);
                     String var10017 = Registry.emptyArgs();
                     long var60 = 325825537657373656L;
                     Object var59 = var10017;
                     var10017 = Ref.h(325825537657373656L, var59, var60);

                     try {
                        var10017 = (String)var10017;
                     } catch (InvocationTargetException var192) {
                        throw var192.getTargetException();
                     }

                     var10017.equals(var10);
                  }

                  if (var280 == null) {
                     Object[] var289 = Registry.packArgs(var12);
                     long var62 = 351459790059463760L;
                     Object[] var61 = var289;
                     Ref.h(351459790059463760L, var61, var62);

                     try {
                        ;
                     } catch (InvocationTargetException var191) {
                        throw var191.getTargetException();
                     }
                  }
               }

               if (var2 != null) {
                  break;
               }
            }

            if (var2 == null) {
               return;
            }
         }

         var209 = this;
         Object var63 = 628672175147824801L;
         ((String)Ref.g(628672175147824801L, var63)).equals((String)Registry.lookupField(325091899221814899L).get(null));
      }

      if (var2 == null) {
         if (var209 == null) {
            Object var65 = 617838227313014025L;
            // [VF-super] super((String)Ref.g(617838227313014025L, var65));
            Object var67 = 390578034059240075L;
            Object[] var212 = Registry.packArgs(Ref.g(390578034059240075L, var67));
            long var70 = 344002219967384120L;
            Object[] var69 = var212;
            Ref.h(344002219967384120L, var69, var70);

            try {
               ;
            } catch (InvocationTargetException var188) {
               throw var188.getTargetException();
            }

            Object var71 = 164467030324059875L;
            Object[] var224 = Registry.packArgs(Ref.g(164467030324059875L, var71));
            long var74 = 523129837546368984L;
            Object[] var73 = var224;
            Ref.h(523129837546368984L, var73, var74);

            try {
               ;
            } catch (InvocationTargetException var187) {
               throw var187.getTargetException();
            }

            if (var2 == null) {
               return;
            }
         }

         var209 = this;
         Object var75 = 628672175147824801L;
         ((String)Ref.g(628672175147824801L, var75)).equals((String)Registry.lookupField(386046141245462363L).get(null));
      }

      if (var2 == null) {
         if (var209 == null) {
            L6 var210;
            Object var77 = 617838227313014025L;
            // [VF-super] super((String)Ref.g(617838227313014025L, var77));
            L6 var3 = var210;
            Object var79 = 144008674458598213L;
            // [VF-super] super((String)Ref.g(144008674458598213L, var79));
            Object[] var213 = Registry.emptyArgs();
            long var82 = 431844181487482908L;
            Object[] var81 = var213;
            var213 = Ref.h(431844181487482908L, var81, var82);

            try {
            } catch (InvocationTargetException var186) {
               throw var186.getTargetException();
            }

            Object var225 = Registry.emptyArgs();
            long var84 = 431844181487482908L;
            Object var83 = var225;
            var225 = Ref.h(431844181487482908L, var83, var84);

            try {
               var227 = (Long)var225;
            } catch (InvocationTargetException var185) {
               throw var185.getTargetException();
            }

            long var221 = var3 - var227;
            Object var234 = Registry.emptyArgs();
            long var86 = 569917050297167373L;
            Object var85 = var234;
            var234 = Ref.h(569917050297167373L, var85, var86);

            try {
               var236 = (Long)var234;
            } catch (InvocationTargetException var184) {
               throw var184.getTargetException();
            }

            Object var246 = Registry.emptyArgs();
            long var88 = 569917050297167373L;
            Object var87 = var246;
            var246 = Ref.h(569917050297167373L, var87, var88);

            try {
               var248 = (Long)var246;
            } catch (InvocationTargetException var183) {
               throw var183.getTargetException();
            }

            float var237 = (float)(var236 - (var3 - var248));
            var246 = Registry.emptyArgs();
            long var90 = 431844181487482908L;
            Object var89 = var246;
            var246 = Ref.h(431844181487482908L, var89, var90);

            try {
               var251 = (Long)var246;
            } catch (InvocationTargetException var182) {
               throw var182.getTargetException();
            }

            Object var260 = Registry.emptyArgs();
            long var92 = 431844181487482908L;
            Object var91 = var260;
            var260 = Ref.h(431844181487482908L, var91, var92);

            try {
               var262 = (Long)var260;
            } catch (InvocationTargetException var181) {
               throw var181.getTargetException();
            }

            float var5 = var251 / (float)(var3 - var262);
            Object[] var256 = Registry.emptyArgs();
            long var94 = 140658926618382542L;
            Object[] var93 = var256;
            var256 = Ref.h(140658926618382542L, var93, var94);

            try {
            } catch (InvocationTargetException var180) {
               throw var180.getTargetException();
            }

            Object var268 = Registry.emptyArgs();
            long var96 = 140658926618382542L;
            Object var95 = var268;
            var268 = Ref.h(140658926618382542L, var95, var96);

            try {
               var270 = (Long)var268;
            } catch (InvocationTargetException var179) {
               throw var179.getTargetException();
            }

            float var263 = (float)(var3 - var270);
            Object var271 = Registry.emptyArgs();
            long var98 = 431844181487482908L;
            Object var97 = var271;
            var271 = Ref.h(431844181487482908L, var97, var98);

            try {
               var273 = (Long)var271;
            } catch (InvocationTargetException var178) {
               throw var178.getTargetException();
            }

            Object var290 = Registry.emptyArgs();
            long var100 = 431844181487482908L;
            Object var99 = var290;
            var290 = Ref.h(431844181487482908L, var99, var100);

            try {
               var292 = (Long)var290;
            } catch (InvocationTargetException var177) {
               throw var177.getTargetException();
            }

            float var6 = var273 / (float)(var3 - var292);
            Object[] var281 = Registry.packArgs(var5);
            long var102 = 298942617489864694L;
            Object[] var101 = var281;
            Ref.h(298942617489864694L, var101, var102);

            try {
               ;
            } catch (InvocationTargetException var176) {
               throw var176.getTargetException();
            }

            var290 = Registry.packArgs(var6);
            long var104 = 269281348868560068L;
            Object var103 = var290;
            Ref.h(269281348868560068L, var103, var104);

            try {
               ;
            } catch (InvocationTargetException var175) {
               throw var175.getTargetException();
            }

            if (var2 == null) {
               return;
            }
         }

         var209 = this;
         Object var105 = 628672175147824801L;
         ((String)Ref.g(628672175147824801L, var105)).equals((String)Registry.lookupField(216827239641511466L).get(null));
      }

      if (var2 == null) {
         if (var209 == null) {
            W4 var211;
            Object var107 = 144008674458598213L;
            // [VF-super] super((String)Ref.g(144008674458598213L, var107));
            W4 var207 = var211;
            Object var215 = Registry.emptyArgs();
            long var110 = 335912856259913016L;
            Object var109 = var215;
            var215 = Ref.h(335912856259913016L, var109, var110);

            try {
               var217 = (Long)var215;
            } catch (InvocationTargetException var174) {
               throw var174.getTargetException();
            }

            var215 = Registry.e(var217);
            long var112 = 344548872083957657L;
            Object var111 = var215;
            Ref.h(344548872083957657L, var111, var112);

            try {
               ;
            } catch (InvocationTargetException var173) {
               throw var173.getTargetException();
            }

            Object var228 = Registry.emptyArgs();
            long var114 = 184701427228203983L;
            Object var113 = var228;
            var228 = Ref.h(184701427228203983L, var113, var114);

            try {
               var230 = (Long)var228;
            } catch (InvocationTargetException var172) {
               throw var172.getTargetException();
            }

            var228 = Registry.e(var230);
            long var116 = 264352676291850035L;
            Object var115 = var228;
            Ref.h(264352676291850035L, var115, var116);

            try {
               ;
            } catch (InvocationTargetException var171) {
               throw var171.getTargetException();
            }

            Object var238 = Registry.emptyArgs();
            long var118 = 184701427228203983L;
            Object var117 = var238;
            var238 = Ref.h(184701427228203983L, var117, var118);

            try {
               var240 = (Long)var238;
            } catch (InvocationTargetException var170) {
               throw var170.getTargetException();
            }

            float var241 = (float)var240;
            Object var252 = Registry.emptyArgs();
            long var120 = 335912856259913016L;
            Object var119 = var252;
            var252 = Ref.h(335912856259913016L, var119, var120);

            try {
               var254 = (Long)var252;
            } catch (InvocationTargetException var169) {
               throw var169.getTargetException();
            }

            float var4 = var207 / (float)var254;
            var252 = Registry.packArgs(var4);
            long var122 = 189801268098422776L;
            Object var121 = var252;
            Ref.h(189801268098422776L, var121, var122);

            try {
               ;
            } catch (InvocationTargetException var168) {
               throw var168.getTargetException();
            }

            Object var264 = Registry.emptyArgs();
            long var124 = 569763756239989164L;
            Object var123 = var264;
            var264 = Ref.h(569763756239989164L, var123, var124);

            try {
               var266 = (Long)var264;
            } catch (InvocationTargetException var167) {
               throw var167.getTargetException();
            }

            var264 = Registry.e(var266);
            long var126 = 508080054683783709L;
            Object var125 = var264;
            Ref.h(508080054683783709L, var125, var126);

            try {
               ;
            } catch (InvocationTargetException var166) {
               throw var166.getTargetException();
            }

            Object var274 = Registry.emptyArgs();
            long var128 = 415937735200792127L;
            Object var127 = var274;
            var274 = Ref.h(415937735200792127L, var127, var128);

            try {
               var276 = (Long)var274;
            } catch (InvocationTargetException var165) {
               throw var165.getTargetException();
            }

            var274 = Registry.e(var276);
            long var130 = 202604738344160249L;
            Object var129 = var274;
            Ref.h(202604738344160249L, var129, var130);

            try {
               ;
            } catch (InvocationTargetException var164) {
               throw var164.getTargetException();
            }

            Long var282 = (Long)(Registry.emptyArgs());
            long var132 = 569763756239989164L;
            Object var131 = var282;
            var282 = Ref.h(569763756239989164L, var131, var132);

            try {
               var282 = (Long)var282;
            } catch (InvocationTargetException var163) {
               throw var163.getTargetException();
            }

            label554: {
               if (var2 == null) {
                  if (var282 <= 0L) {
                     break label554;
                  }

                  var282 = (Long)(var207);
                  Object[] var294 = Registry.emptyArgs();
                  long var134 = 415937735200792127L;
                  Object[] var133 = var294;
                  var294 = Ref.h(415937735200792127L, var133, var134);

                  try {
                  } catch (InvocationTargetException var162) {
                     throw var162.getTargetException();
                  }
               }

               float var285 = (float)var282;
               Object var300 = Registry.emptyArgs();
               long var136 = 569763756239989164L;
               Object var135 = var300;
               var300 = Ref.h(569763756239989164L, var135, var136);

               try {
                  var302 = (Long)var300;
               } catch (InvocationTargetException var161) {
                  throw var161.getTargetException();
               }

               float var208 = var207 / (float)var302;
               var300 = Registry.packArgs(var208);
               long var138 = 324295603362286312L;
               Object var137 = var300;
               Ref.h(324295603362286312L, var137, var138);

               try {
                  ;
               } catch (InvocationTargetException var160) {
                  throw var160.getTargetException();
               }
            }

            if (var2 == null) {
               return;
            }
         }

         var209 = this;
         Object var139 = 628672175147824801L;
         ((String)Ref.g(628672175147824801L, var139)).equals((String)Registry.lookupField(169956541374649600L).get(null));
      }

      if (var2 == null) {
         if (var209 == null) {
            // [VF] new E2_3;
            Object var141 = 144008674458598213L;
            // [VF-super] super((String)Ref.g(144008674458598213L, var141));
            Object[] var219 = Registry.emptyArgs();
            long var144 = 420783092781412923L;
            Object[] var143 = var219;
            var219 = Registry.packArgs(Ref.h(420783092781412923L, var143, var144));
            long var146 = 218780610777723188L;
            Object[] var145 = var219;
            Ref.h(218780610777723188L, var145, var146);

            try {
               ;
            } catch (InvocationTargetException var159) {
               throw var159.getTargetException();
            }

            if (var2 == null) {
               return;
            }
         }

         var209 = this;
         Object var147 = 628672175147824801L;
         ((String)Ref.g(628672175147824801L, var147)).equals((String)Registry.lookupField(450267072994591067L).get(null));
      }

      if (var2 == null) {
         if (var209 == null) {
            return;
         }

         var209 = this;
         Object var149 = 628672175147824801L;
         ((String)Ref.g(628672175147824801L, var149)).equals((String)Registry.lookupField(436214772255165451L).get(null));
      }

      if (var2 == null) {
         if (var209 == null) {
            // [VF] new Nz2_2;
            Object var151 = 144008674458598213L;
            // [VF-super] super((String)Ref.g(144008674458598213L, var151));
            if (var2 == null) {
               return;
            }
         }

         var209 = this;
         Object var153 = 628672175147824801L;
         ((String)Ref.g(628672175147824801L, var153)).equals((String)Registry.lookupField(327146804498928713L).get(null));
      }

      if (var2 == null) {
         if (var209 == null) {
            return;
         }

         var209 = this;
         Object var155 = 628672175147824801L;
         ((String)Ref.g(628672175147824801L, var155)).equals((String)Registry.lookupField(327146804498928713L).get(null));
      }

      if (var2 == null) {
         if (var209 == null) {
            return;
         }

         var209 = this;
         Object var157 = 628672175147824801L;
         ((String)Ref.g(628672175147824801L, var157)).equals((String)Registry.lookupField(184200262128901292L).get(null));
      }

      if (var209 == null) {
      }
   }

   public String d() {
      Object var1 = 628672175147824801L;
      return (String)Ref.g(628672175147824801L, var1);
   }

   public void N(String var1) {
      long var3 = 628672175147824801L;
      Ref.s(628672175147824801L, var1, var3);
   }

   public String E() {
      Object var1 = 617838227313014025L;
      return (String)Ref.g(617838227313014025L, var1);
   }

   public void I(String var1) {
      long var3 = 617838227313014025L;
      Ref.s(617838227313014025L, var1, var3);
   }

   public String g() {
      Object var1 = 144008674458598213L;
      return (String)Ref.g(144008674458598213L, var1);
   }

   public void i(String var1) {
      long var3 = 144008674458598213L;
      Ref.s(144008674458598213L, var1, var3);
   }
   private static Object var251;
   private static Object var273;
}





