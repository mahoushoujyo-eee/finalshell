import java.awt.Color;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

public class f1_2 extends DefaultTableCellRenderer {
   Border e;
   SimpleDateFormat r;
   cU_3 W;
   boolean M;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   f1_2(boolean var1) {
      com.c.c(607718560474337302L).set(this, BorderFactory.createEmptyBorder(0, a(27908, 845788551031903414L), 2, 4));
      com.c.c(217799869889012573L).set(this, new SimpleDateFormat(a));
      com.c.c(458673123597668154L).set(this, new cU_3());
      com.c.c(329059055424013782L).setBoolean(this, var1);
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      boolean var7 = Uo_2.k();
      if (var7) {
         if (var2 != null) {
            cU_3 var8 = (cU_3)com.c.c(458673123597668154L).get(this);
            Object var9 = null;
            Object var10 = null;
            byte var11 = 2;
            boolean var12 = false;
            Uo_2 var13 = (Uo_2)var1;
            int var14 = var1.convertColumnIndexToModel(var6);
            var8.setAlignmentX((float)var11);
            var8.setHorizontalAlignment(2);
            lI_3 var15 = null;
            Object[] var10001 = com.c.a(false);
            Method var10003 = com.c.d(277230421274009311L);
            Object[] var10002 = var10001;
            cU_3 var127 = var8;
            Method var10000 = var10003;

            try {
               var10000.invoke(var127, var10002);
            } catch (InvocationTargetException var61) {
               throw var61.getTargetException();
            }

            var10001 = com.c.a(false);
            var10003 = com.c.d(470566827426873505L);
            var10002 = var10001;
            cU_3 var129 = var8;
            var10000 = var10003;

            try {
               var10000.invoke(var129, var10002);
            } catch (InvocationTargetException var60) {
               throw var60.getTargetException();
            }

            var10001 = com.c.a(false);
            var10003 = com.c.d(300077136152019384L);
            var10002 = var10001;
            cU_3 var131 = var8;
            var10000 = var10003;

            try {
               var10000.invoke(var131, var10002);
            } catch (InvocationTargetException var59) {
               throw var59.getTargetException();
            }

            var10001 = com.c.a(var15);
            var10003 = com.c.d(246302729129552507L);
            var10002 = var10001;
            cU_3 var133 = var8;
            var10000 = var10003;

            try {
               var10000.invoke(var133, var10002);
            } catch (InvocationTargetException var58) {
               throw var58.getTargetException();
            }

            label639: {
               Method var70 = var2.getClass();
               if (var7) {
                  if (!var70.equals(lI_3.class)) {
                     break label639;
                  }

                  var70 = (Method)var2;
               }

               var15 = (lI_3)var70;
               var10001 = com.c.f();
               var10003 = com.c.d(382054480216091309L);
               var10002 = var10001;
               lI_3 var135 = var15;
               var70 = var10003;

               try {
                  var72 = (u8_2)var70.invoke(var135, var10002);
               } catch (InvocationTargetException var57) {
                  throw var57.getTargetException();
               }

               String var17;
               label640: {
                  u8_2 var16 = var72;
                  var17 = "";
                  int var73 = com.c.c(329059055424013782L).getBoolean(this);
                  if (var7) {
                     if (var73 == 0) {
                        int var74 = var14;
                        if (var7) {
                           if (var14 == 0) {
                              StringBuilder var75 = new StringBuilder();
                              var10002 = com.c.f();
                              Method var10004 = com.c.d(419335026051024288L);
                              Object[] var277 = var10002;
                              lI_3 var220 = var15;
                              Method var136 = var10004;

                              try {
                                 var137 = (Integer)var136.invoke(var220, var277);
                              } catch (InvocationTargetException var56) {
                                 throw var56.getTargetException();
                              }

                              var17 = var75.append(var137).append("").toString();
                              if (var7) {
                                 break label640;
                              }
                           }

                           var74 = var14;
                        }

                        byte var138 = 1;
                        if (var7) {
                           if (var74 == 1) {
                              var10001 = com.c.f();
                              var10003 = com.c.d(287512880066147760L);
                              var10002 = var10001;
                              lI_3 var140 = var15;
                              var70 = var10003;

                              try {
                                 var77 = (String)var70.invoke(var140, var10002);
                              } catch (InvocationTargetException var55) {
                                 throw var55.getTargetException();
                              }

                              var17 = var77;
                              if (var7) {
                                 break label640;
                              }
                           }

                           var74 = var14;
                           var138 = 2;
                        }

                        if (var7) {
                           if (var74 == var138) {
                              StringBuilder var78 = new StringBuilder();
                              var10002 = com.c.f();
                              Method var317 = com.c.d(225195147661966806L);
                              Object[] var279 = var10002;
                              lI_3 var223 = var15;
                              Method var141 = var317;

                              try {
                                 var142 = (Long)var141.invoke(var223, var279);
                              } catch (InvocationTargetException var54) {
                                 throw var54.getTargetException();
                              }

                              var10001 = com.c.e(var142);
                              Method var144 = com.c.d(148259110884974759L);
                              Object[] var281 = var10001;
                              var10002 = null;

                              try {
                                 var10001 = (String)var144.invoke(var10002, var281);
                              } catch (InvocationTargetException var53) {
                                 throw var53.getTargetException();
                              }

                              var17 = var78.append((String)var10001).append(" ").toString();
                              var10001 = com.c.a(true);
                              var10003 = com.c.d(470566827426873505L);
                              var10002 = var10001;
                              cU_3 var147 = var8;
                              var70 = var10003;

                              try {
                                 var70.invoke(var147, var10002);
                              } catch (InvocationTargetException var52) {
                                 throw var52.getTargetException();
                              }

                              var8.setHorizontalAlignment(4);
                              if (var7) {
                                 break label640;
                              }
                           }

                           var74 = var14;
                           var138 = 3;
                        }

                        if (var7) {
                           if (var74 == var138) {
                              StringBuilder var80 = new StringBuilder();
                              var10002 = com.c.f();
                              Method var318 = com.c.d(218205101142805647L);
                              Object[] var283 = var10002;
                              lI_3 var228 = var15;
                              Method var148 = var318;

                              try {
                                 var149 = (Float)var148.invoke(var228, var283);
                              } catch (InvocationTargetException var51) {
                                 throw var51.getTargetException();
                              }

                              var10001 = com.c.a(var149);
                              Method var151 = com.c.d(122164552401629502L);
                              Object[] var285 = var10001;
                              var10002 = null;

                              try {
                                 var10001 = (String)var151.invoke(var10002, var285);
                              } catch (InvocationTargetException var50) {
                                 throw var50.getTargetException();
                              }

                              var17 = var80.append((String)var10001).append("").toString();
                              var10001 = com.c.a(true);
                              var10003 = com.c.d(277230421274009311L);
                              var10002 = var10001;
                              cU_3 var154 = var8;
                              var70 = var10003;

                              try {
                                 var70.invoke(var154, var10002);
                              } catch (InvocationTargetException var49) {
                                 throw var49.getTargetException();
                              }

                              var8.setHorizontalAlignment(4);
                              if (var7) {
                                 break label640;
                              }
                           }

                           var74 = var14;
                           var138 = 4;
                        }

                        if (var7) {
                           if (var74 == var138) {
                              var10001 = com.c.f();
                              var10003 = com.c.d(505915899939017355L);
                              var10002 = var10001;
                              lI_3 var156 = var15;
                              var70 = var10003;

                              try {
                                 var83 = (String)var70.invoke(var156, var10002);
                              } catch (InvocationTargetException var48) {
                                 throw var48.getTargetException();
                              }

                              label647: {
                                 label648: {
                                    label607: {
                                       var17 = var83;
                                       if (var7) {
                                          if (var16 != null) {
                                             var10001 = com.c.f();
                                             var10003 = com.c.d(372900192662778876L);
                                             var10002 = var10001;
                                             u8_2 var158 = var16;
                                             var70 = var10003;

                                             try {
                                                var85 = (String)var70.invoke(var158, var10002);
                                             } catch (InvocationTargetException var47) {
                                                throw var47.getTargetException();
                                             }

                                             String var18 = var85;
                                             var86 = var18;
                                             if (!var7) {
                                                break label607;
                                             }

                                             if (var18 != null) {
                                                var17 = var18.trim();
                                                var10001 = com.c.f();
                                                var10003 = com.c.d(577747074549625554L);
                                                var10002 = var10001;
                                                u8_2 var160 = var16;
                                                var70 = var10003;

                                                try {
                                                   var88 = (String)var70.invoke(var160, var10002);
                                                } catch (InvocationTargetException var46) {
                                                   throw var46.getTargetException();
                                                }

                                                String var19 = var88;
                                                var86 = var19;
                                                if (!var7) {
                                                   break label607;
                                                }

                                                if (var19 != null) {
                                                   var89 = var19.equals("");
                                                   if (!var7) {
                                                      break label648;
                                                   }

                                                   if (!var89) {
                                                      var89 = var17.startsWith(var19);
                                                      if (!var7) {
                                                         break label648;
                                                      }

                                                      if (var89) {
                                                         StringBuilder var90 = new StringBuilder();
                                                         var10002 = com.c.f();
                                                         Method var319 = com.c.d(505915899939017355L);
                                                         Object[] var290 = var10002;
                                                         lI_3 var236 = var15;
                                                         Method var161 = var319;

                                                         try {
                                                            var10001 = (String)var161.invoke(var236, var290);
                                                         } catch (InvocationTargetException var45) {
                                                            throw var45.getTargetException();
                                                         }

                                                         var17 = var90.append((String)var10001).append(" ").append(var17.substring(var19.length())).toString();
                                                      }
                                                   }
                                                }
                                             }
                                          }

                                          var17 = var17.trim();
                                       }

                                       var86 = var17;
                                    }

                                    if (!var7) {
                                       break label647;
                                    }

                                    var10002 = com.c.f();
                                    Method var320 = com.c.d(505915899939017355L);
                                    Object[] var291 = var10002;
                                    lI_3 var238 = var15;
                                    Method var163 = var320;

                                    try {
                                       var10001 = (String)var163.invoke(var238, var291);
                                    } catch (InvocationTargetException var44) {
                                       throw var44.getTargetException();
                                    }

                                    var89 = var86.equals(var10001);
                                 }

                                 if (var89) {
                                    break label640;
                                 }

                                 StringBuilder var91 = new StringBuilder();
                                 var10002 = com.c.f();
                                 Method var321 = com.c.d(505915899939017355L);
                                 Object[] var292 = var10002;
                                 lI_3 var240 = var15;
                                 Method var165 = var321;

                                 try {
                                    var10001 = (String)var165.invoke(var240, var292);
                                 } catch (InvocationTargetException var43) {
                                    throw var43.getTargetException();
                                 }

                                 var86 = var91.append((String)var10001).append("┋").append(var17).toString();
                              }

                              var17 = var86;
                              if (var7) {
                                 break label640;
                              }
                           }

                           var74 = var14;
                           var138 = 5;
                        }

                        if (var74 != var138) {
                           break label640;
                        }

                        u8_2 var92 = var16;
                        if (var7) {
                           if (var16 == null) {
                              break label640;
                           }

                           var92 = var16;
                        }

                        var10001 = com.c.f();
                        var10003 = com.c.d(577747074549625554L);
                        var10002 = var10001;
                        u8_2 var168 = var92;
                        var70 = var10003;

                        try {
                           var94 = (String)var70.invoke(var168, var10002);
                        } catch (InvocationTargetException var42) {
                           throw var42.getTargetException();
                        }

                        if (var7) {
                           if (var94 == null) {
                              break label640;
                           }

                           var10001 = com.c.f();
                           var10003 = com.c.d(577747074549625554L);
                           var10002 = var10001;
                           u8_2 var170 = var16;
                           var70 = var10003;

                           try {
                              var94 = (String)var70.invoke(var170, var10002);
                           } catch (InvocationTargetException var41) {
                              throw var41.getTargetException();
                           }
                        }

                        var17 = var94;
                        if (var7) {
                           break label640;
                        }
                     }

                     var73 = var14;
                  }

                  if (var7) {
                     if (var73 == 0) {
                        StringBuilder var96 = new StringBuilder();
                        var10002 = com.c.f();
                        Method var322 = com.c.d(419335026051024288L);
                        Object[] var295 = var10002;
                        lI_3 var244 = var15;
                        Method var171 = var322;

                        try {
                           var172 = (Integer)var171.invoke(var244, var295);
                        } catch (InvocationTargetException var40) {
                           throw var40.getTargetException();
                        }

                        var17 = var96.append(var172).append("").toString();
                        if (var7) {
                           break label640;
                        }
                     }

                     var73 = var14;
                  }

                  byte var173 = 1;
                  if (var7) {
                     if (var73 == 1) {
                        var10001 = com.c.f();
                        var10003 = com.c.d(505915899939017355L);
                        var10002 = var10001;
                        lI_3 var175 = var15;
                        var70 = var10003;

                        try {
                           var98 = (String)var70.invoke(var175, var10002);
                        } catch (InvocationTargetException var39) {
                           throw var39.getTargetException();
                        }

                        label655: {
                           label656: {
                              label572: {
                                 var17 = var98;
                                 if (var7) {
                                    if (var16 != null) {
                                       var10001 = com.c.f();
                                       var10003 = com.c.d(372900192662778876L);
                                       var10002 = var10001;
                                       u8_2 var177 = var16;
                                       var70 = var10003;

                                       try {
                                          var100 = (String)var70.invoke(var177, var10002);
                                       } catch (InvocationTargetException var38) {
                                          throw var38.getTargetException();
                                       }

                                       String var63 = var100;
                                       var101 = var63;
                                       if (!var7) {
                                          break label572;
                                       }

                                       if (var63 != null) {
                                          var17 = var63.trim();
                                          var10001 = com.c.f();
                                          var10003 = com.c.d(577747074549625554L);
                                          var10002 = var10001;
                                          u8_2 var179 = var16;
                                          var70 = var10003;

                                          try {
                                             var103 = (String)var70.invoke(var179, var10002);
                                          } catch (InvocationTargetException var37) {
                                             throw var37.getTargetException();
                                          }

                                          String var65 = var103;
                                          var101 = var65;
                                          if (!var7) {
                                             break label572;
                                          }

                                          if (var65 != null) {
                                             var104 = var65.equals("");
                                             if (!var7) {
                                                break label656;
                                             }

                                             if (!var104) {
                                                var104 = var17.startsWith(var65);
                                                if (!var7) {
                                                   break label656;
                                                }

                                                if (var104) {
                                                   StringBuilder var105 = new StringBuilder();
                                                   var10002 = com.c.f();
                                                   Method var323 = com.c.d(505915899939017355L);
                                                   Object[] var299 = var10002;
                                                   lI_3 var249 = var15;
                                                   Method var180 = var323;

                                                   try {
                                                      var10001 = (String)var180.invoke(var249, var299);
                                                   } catch (InvocationTargetException var36) {
                                                      throw var36.getTargetException();
                                                   }

                                                   var17 = var105.append((String)var10001).append(" ").append(var17.substring(var65.length())).toString();
                                                }
                                             }
                                          }
                                       }
                                    }

                                    var17 = var17.trim();
                                 }

                                 var101 = var17;
                              }

                              if (!var7) {
                                 break label655;
                              }

                              var10002 = com.c.f();
                              Method var324 = com.c.d(505915899939017355L);
                              Object[] var300 = var10002;
                              lI_3 var251 = var15;
                              Method var182 = var324;

                              try {
                                 var10001 = (String)var182.invoke(var251, var300);
                              } catch (InvocationTargetException var35) {
                                 throw var35.getTargetException();
                              }

                              var104 = var101.equals(var10001);
                           }

                           if (var104) {
                              break label640;
                           }

                           StringBuilder var106 = new StringBuilder();
                           var10002 = com.c.f();
                           Method var325 = com.c.d(505915899939017355L);
                           Object[] var301 = var10002;
                           lI_3 var253 = var15;
                           Method var184 = var325;

                           try {
                              var10001 = (String)var184.invoke(var253, var301);
                           } catch (InvocationTargetException var34) {
                              throw var34.getTargetException();
                           }

                           var101 = var106.append((String)var10001).append("┋").append(var17).toString();
                        }

                        var17 = var101;
                        if (var7) {
                           break label640;
                        }
                     }

                     var73 = var14;
                     var173 = 2;
                  }

                  if (var7) {
                     if (var73 == var173) {
                        var10001 = com.c.f();
                        var10003 = com.c.d(546705127727737678L);
                        var10002 = var10001;
                        lI_3 var187 = var15;
                        var70 = var10003;

                        try {
                           var108 = (String)var70.invoke(var187, var10002);
                        } catch (InvocationTargetException var33) {
                           throw var33.getTargetException();
                        }

                        var17 = var108;
                        var10001 = com.c.a(true);
                        var10003 = com.c.d(470566827426873505L);
                        var10002 = var10001;
                        cU_3 var189 = var8;
                        var70 = var10003;

                        try {
                           var70.invoke(var189, var10002);
                        } catch (InvocationTargetException var32) {
                           throw var32.getTargetException();
                        }

                        var8.setHorizontalAlignment(4);
                        if (var7) {
                           break label640;
                        }
                     }

                     var73 = var14;
                     var173 = 3;
                  }

                  if (var7) {
                     if (var73 == var173) {
                        StringBuilder var110 = new StringBuilder();
                        var10002 = com.c.f();
                        Method var326 = com.c.d(218205101142805647L);
                        Object[] var304 = var10002;
                        lI_3 var257 = var15;
                        Method var190 = var326;

                        try {
                           var191 = (Float)var190.invoke(var257, var304);
                        } catch (InvocationTargetException var31) {
                           throw var31.getTargetException();
                        }

                        var10001 = com.c.a(var191);
                        Method var193 = com.c.d(122164552401629502L);
                        Object[] var306 = var10001;
                        var10002 = null;

                        try {
                           var10001 = (String)var193.invoke(var10002, var306);
                        } catch (InvocationTargetException var30) {
                           throw var30.getTargetException();
                        }

                        var17 = var110.append((String)var10001).append("").toString();
                        var10001 = com.c.a(true);
                        var10003 = com.c.d(277230421274009311L);
                        var10002 = var10001;
                        cU_3 var196 = var8;
                        var70 = var10003;

                        try {
                           var70.invoke(var196, var10002);
                        } catch (InvocationTargetException var29) {
                           throw var29.getTargetException();
                        }

                        var8.setHorizontalAlignment(4);
                        if (var7) {
                           break label640;
                        }
                     }

                     var73 = var14;
                     var173 = 4;
                  }

                  label467:
                  if (var73 == var173) {
                     var10001 = com.c.f();
                     var10003 = com.c.d(505915899939017355L);
                     var10002 = var10001;
                     lI_3 var198 = var15;
                     var70 = var10003;

                     try {
                        var113 = (String)var70.invoke(var198, var10002);
                     } catch (InvocationTargetException var28) {
                        throw var28.getTargetException();
                     }

                     label662: {
                        label663: {
                           label540: {
                              var17 = var113;
                              if (var7) {
                                 if (var16 != null) {
                                    var10001 = com.c.f();
                                    var10003 = com.c.d(372900192662778876L);
                                    var10002 = var10001;
                                    u8_2 var200 = var16;
                                    var70 = var10003;

                                    try {
                                       var115 = (String)var70.invoke(var200, var10002);
                                    } catch (InvocationTargetException var27) {
                                       throw var27.getTargetException();
                                    }

                                    String var64 = var115;
                                    var116 = var64;
                                    if (!var7) {
                                       break label540;
                                    }

                                    if (var64 != null) {
                                       var17 = var64.trim();
                                       var10001 = com.c.f();
                                       var10003 = com.c.d(577747074549625554L);
                                       var10002 = var10001;
                                       u8_2 var202 = var16;
                                       var70 = var10003;

                                       try {
                                          var118 = (String)var70.invoke(var202, var10002);
                                       } catch (InvocationTargetException var26) {
                                          throw var26.getTargetException();
                                       }

                                       String var66 = var118;
                                       var116 = var66;
                                       if (!var7) {
                                          break label540;
                                       }

                                       if (var66 != null) {
                                          var119 = var66.equals("");
                                          if (!var7) {
                                             break label663;
                                          }

                                          if (!var119) {
                                             var119 = var17.startsWith(var66);
                                             if (!var7) {
                                                break label663;
                                             }

                                             if (var119) {
                                                StringBuilder var120 = new StringBuilder();
                                                var10002 = com.c.f();
                                                Method var327 = com.c.d(505915899939017355L);
                                                Object[] var311 = var10002;
                                                lI_3 var265 = var15;
                                                Method var203 = var327;

                                                try {
                                                   var10001 = (String)var203.invoke(var265, var311);
                                                } catch (InvocationTargetException var25) {
                                                   throw var25.getTargetException();
                                                }

                                                var17 = var120.append((String)var10001).append(" ").append(var17.substring(var66.length())).toString();
                                             }
                                          }
                                       }
                                    }
                                 }

                                 var17 = var17.trim();
                              }

                              var116 = var17;
                           }

                           if (!var7) {
                              break label662;
                           }

                           var10002 = com.c.f();
                           Method var328 = com.c.d(505915899939017355L);
                           Object[] var312 = var10002;
                           lI_3 var267 = var15;
                           Method var205 = var328;

                           try {
                              var10001 = (String)var205.invoke(var267, var312);
                           } catch (InvocationTargetException var24) {
                              throw var24.getTargetException();
                           }

                           var119 = var116.equals(var10001);
                        }

                        if (var119) {
                           break label467;
                        }

                        StringBuilder var121 = new StringBuilder();
                        var10002 = com.c.f();
                        Method var329 = com.c.d(505915899939017355L);
                        Object[] var313 = var10002;
                        lI_3 var269 = var15;
                        Method var207 = var329;

                        try {
                           var10001 = (String)var207.invoke(var269, var313);
                        } catch (InvocationTargetException var23) {
                           throw var23.getTargetException();
                        }

                        var116 = var121.append((String)var10001).append("┋").append(var17).toString();
                     }

                     var17 = var116;
                  }
               }

               var8.setText(var17);
            }

            label667: {
               var8.setBorder((Border)com.c.c(607718560474337302L).get(this));
               cU_3 var122 = var8;
               if (var7) {
                  var10001 = com.c.a(var15);
                  var10003 = com.c.d(160445587339969154L);
                  var10002 = var10001;
                  cU_3 var210 = var8;
                  var10000 = var10003;

                  try {
                     var10000.invoke(var210, var10002);
                  } catch (InvocationTargetException var22) {
                     throw var22.getTargetException();
                  }

                  if (var6 == 1) {
                     var10001 = com.c.a(true);
                     var10003 = com.c.d(512937506758615496L);
                     var10002 = var10001;
                     cU_3 var212 = var8;
                     var10000 = var10003;

                     try {
                        var10000.invoke(var212, var10002);
                     } catch (InvocationTargetException var21) {
                        throw var21.getTargetException();
                     }

                     if (var7) {
                        break label667;
                     }
                  }

                  var122 = var8;
               }

               var10001 = com.c.a(false);
               var10003 = com.c.d(512937506758615496L);
               var10002 = var10001;
               cU_3 var214 = var122;
               var10000 = var10003;

               try {
                  var10000.invoke(var214, var10002);
               } catch (InvocationTargetException var20) {
                  throw var20.getTargetException();
               }
            }

            int var126 = var3;
            if (var7) {
               if (var3 != 0) {
                  var8.setBackground((Color)com.c.c(623875439513009390L).get(null));
                  var8.setForeground((Color)com.c.c(513155505692963448L).get(null));
                  var8.setOpaque(true);
                  if (var7) {
                     return var8;
                  }
               }

               var126 = var5 % 2;
            }

            int var62 = var126;
            var8.setForeground(new Color(a(7118, 7348843612794724985L), a(996, 8567518723189979728L), a(996, 8567518723189979728L)));
            if (var7) {
               if (var62 == 0) {
                  var8.setOpaque(false);
                  if (var7) {
                     return var8;
                  }
               }

               var8.setOpaque(true);
            }

            var8.setBackground(
               new Color(a(4667, 8230845895931210632L), a(7334, 5591307223923270928L), a(7334, 5591307223923270928L), a(3494, 2046706939004171283L))
            );
            return var8;
         }

         ((cU_3)com.c.c(458673123597668154L).get(this)).setText("");
      }

      return (cU_3)com.c.c(458673123597668154L).get(this);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "}@ W\ts\u0013+]=\u000envdiT".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 86;
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
         var10007 = 86;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 82;
               break;
            case 1:
               var50 = 111;
               break;
            case 2:
               var50 = 15;
               break;
            case 3:
               var50 = 120;
               break;
            case 4:
               var50 = 112;
               break;
            case 5:
               var50 = 104;
               break;
            default:
               var50 = 8;
         }
      } else {
         var34 = 86;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 150113868117163652L;
            long[] var14 = new long[6];
            int var11 = 0;
            String var12 = "Í\fu\u0097ò|\u009cÏ\u0018Ä\u0014\u000bXþ\u001bðÔ\"GarP\n\u009d#½\u0011h^Ä\u0084æ";
            int var13 = "Í\fu\u0097ò|\u009cÏ\u0018Ä\u0014\u000bXþ\u001bðÔ\"GarP\n\u009d#½\u0011h^Ä\u0084æ".length();
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
                           b = var14;
                           c = new Integer[6];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "èDU\u0000K\r\u0095h¿\u0012e\u008f3¢ê:";
                        var13 = "èDU\u0000K\r\u0095h¿\u0012e\u008f3¢ê:".length();
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
         var10007 = 86;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 82;
               break;
            case 1:
               var50 = 111;
               break;
            case 2:
               var50 = 15;
               break;
            case 3:
               var50 = 120;
               break;
            case 4:
               var50 = 112;
               break;
            case 5:
               var50 = 104;
               break;
            default:
               var50 = 8;
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
                  var50 = 82;
                  break;
               case 1:
                  var50 = 111;
                  break;
               case 2:
                  var50 = 15;
                  break;
               case 3:
                  var50 = 120;
                  break;
               case 4:
                  var50 = 112;
                  break;
               case 5:
                  var50 = 104;
                  break;
               default:
                  var50 = 8;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 150113868117163652L;
               long[] var6 = new long[6];
               int var3 = 0;
               String var4 = "Í\fu\u0097ò|\u009cÏ\u0018Ä\u0014\u000bXþ\u001bðÔ\"GarP\n\u009d#½\u0011h^Ä\u0084æ";
               int var5 = "Í\fu\u0097ò|\u009cÏ\u0018Ä\u0014\u000bXþ\u001bðÔ\"GarP\n\u009d#½\u0011h^Ä\u0084æ".length();
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
                              b = var6;
                              c = new Integer[6];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "èDU\u0000K\r\u0095h¿\u0012e\u008f3¢ê:";
                           var5 = "èDU\u0000K\r\u0095h¿\u0012e\u008f3¢ê:".length();
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
                  var50 = 82;
                  break;
               case 1:
                  var50 = 111;
                  break;
               case 2:
                  var50 = 15;
                  break;
               case 3:
                  var50 = 120;
                  break;
               case 4:
                  var50 = 112;
                  break;
               case 5:
                  var50 = 104;
                  break;
               default:
                  var50 = 8;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14775;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





