package com.finalshell.ui.adapter;

import com.finalshell.core.Km2;
import com.finalshell.core.Ty2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Mg2;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.Address;
import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.Color;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

public class FolderAdapter extends DefaultTableCellRenderer {
   Border X;
   SimpleDateFormat p;
   Address e;
   HashMap Q;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public FolderAdapter() {
      Border var10001 = BorderFactory.createEmptyBorder(4, 4, 4, 2);
      long var2 = 438642701836156454L;
      Border var1 = var10001;
      Ref.s(438642701836156454L, var1, var2);
      SimpleDateFormat var10002 = new SimpleDateFormat(a(19740, 12595));
      long var4 = 294038036363208614L;
      SimpleDateFormat var3 = var10002;
      Ref.s(294038036363208614L, var3, var4);
      HashMap var10003 = new HashMap();
      long var6 = 465884130222660170L;
      HashMap var5 = var10003;
      Ref.s(465884130222660170L, var5, var6);
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      String var7;
      Component var8;
      JLabel var9;
      Icon var11;
      int var12;
      int var15;
      HashMap var17;
      label598: {
         var8 = super.getTableCellRendererComponent(var1, var2, (boolean)var3, var4, var5, var6);
         var9 = (JLabel)var8;
         Object var10 = null;
         var11 = null;
         var12 = 2;
         String var10000 = Km2.U$String();
         boolean var13 = false;
         Km2 var14 = (Km2)var1;
         var15 = var1.convertColumnIndexToModel(var6);
         Object var16 = null;
         var17 = null;
         var7 = var10000;
         Object var22 = 545626806393068332L;
         Address var10001 = (Address)Ref.g(545626806393068332L, var22);
         if (var7 == null) {
            if (var10001 == null) {
               break label598;
            }

            Object var24 = 545626806393068332L;
            Address var10002 = (Address)Ref.g(545626806393068332L, var24);
         }

         ConnectionProperty var168 = Registry.emptyArgs();
         long var27 = 205360729747621821L;
         Object[] var26 = var168;
         var168 = Ref.h(205360729747621821L, var26, var27);

         try {
            var168 = (ConnectionProperty)var168;
         } catch (InvocationTargetException var161) {
            throw var161.getTargetException();
         }

         Ty2 var171 = var168.M$Ty_2();
         if (var7 == null) {
            if (var171 == null) {
               break label598;
            }

            Object var28 = 545626806393068332L;
            Ref.g(545626806393068332L, var28);
            ConnectionProperty var10004 = Registry.emptyArgs();
            long var31 = 205360729747621821L;
            Object[] var30 = var10004;
            var10004 = Ref.h(205360729747621821L, var30, var31);

            try {
               var10004 = (ConnectionProperty)var10004;
            } catch (InvocationTargetException var160) {
               throw var160.getTargetException();
            }

            var10004.M$Ty_2();
         }

         Object[] var10003 = Registry.emptyArgs();
         long var33 = 121632250293569146L;
         Object[] var32 = var10003;
         Ref.h(121632250293569146L, var32, var33);
         Object[] var174 = Registry.emptyArgs();
         long var35 = 521173731948826631L;
         Object[] var34 = var174;
         Ref.h(521173731948826631L, var34, var35);

         try {
            ;
         } catch (InvocationTargetException var159) {
            throw var159.getTargetException();
         }

         Object var36 = 545626806393068332L;
         Ref.g(545626806393068332L, var36);
         ConnectionProperty var10006 = Registry.emptyArgs();
         long var39 = 205360729747621821L;
         Object[] var38 = var10006;
         var10006 = Ref.h(205360729747621821L, var38, var39);

         try {
            var10006 = (ConnectionProperty)var10006;
         } catch (InvocationTargetException var158) {
            throw var158.getTargetException();
         }

         var10006.M$Ty_2();
         Object[] var10007 = Registry.emptyArgs();
         long var41 = 121632250293569146L;
         Object[] var40 = var10007;
         Ref.h(121632250293569146L, var40, var41);
         HashMap var10008 = (HashMap)(Registry.emptyArgs());
         long var43 = 573616341324590279L;
         Object[] var42 = var10008;
         var10008 = Ref.h(573616341324590279L, var42, var43);

         try {
            var10008 = (HashMap)var10008;
         } catch (InvocationTargetException var157) {
            throw var157.getTargetException();
         }

         var17 = var10008;
      }

      label600: {
         Object var179 = var2;
         if (var7 == null) {
            if (var2 == null) {
               break label600;
            }

            var179 = var2;
         }

         label601: {
            boolean var180 = var179.getClass().equals(Ck4.class);
            if (var7 == null) {
               if (var180) {
                  Ck4 var162 = (Ck4)var2;
                  Object[] var184 = Registry.emptyArgs();
                  long var45 = 272998330038223631L;
                  Object[] var44 = var184;
                  Ref.h(272998330038223631L, var44, var45);

                  try {
                     ;
                  } catch (InvocationTargetException var156) {
                     throw var156.getTargetException();
                  }

                  Object var238;
                  Object var268;
                  label604: {
                     label605: {
                        label563: {
                           Object var164;
                           label606: {
                              var164 = "";
                              int var185 = var15;
                              if (var7 == null) {
                                 if (var15 == 0) {
                                    String var198 = (String)(Registry.emptyArgs());
                                    long var47 = 580695022383982904L;
                                    Object[] var46 = var198;
                                    var198 = Ref.h(580695022383982904L, var46, var47);

                                    try {
                                       var198 = (String)var198;
                                    } catch (InvocationTargetException var155) {
                                       throw var155.getTargetException();
                                    }

                                    if (var7 == null) {
                                       if (var198 != null) {
                                          String var224 = (String)(Registry.emptyArgs());
                                          long var49 = 580695022383982904L;
                                          Object[] var48 = var224;
                                          var224 = Ref.h(580695022383982904L, var48, var49);

                                          try {
                                             var224 = (String)var224;
                                          } catch (InvocationTargetException var154) {
                                             throw var154.getTargetException();
                                          }

                                          var164 = var224;
                                          if (var7 == null) {
                                             break label606;
                                          }
                                       }

                                       var198 = var162;
                                       Object[] var227 = Registry.emptyArgs();
                                       long var51 = 396085629172753019L;
                                       Object[] var50 = var227;
                                       Ref.h(396085629172753019L, var50, var51);

                                       try {
                                          ;
                                       } catch (InvocationTargetException var153) {
                                          throw var153.getTargetException();
                                       }
                                    }

                                    var164 = var198;
                                    if (var7 == null) {
                                       break label606;
                                    }
                                 }

                                 var185 = var15;
                              }

                              int var201 = 1;
                              if (var7 == null) {
                                 if (var185 == 1) {
                                    var12 = 4;
                                    Object[] var202 = Registry.emptyArgs();
                                    long var53 = 556117124296734693L;
                                    Object[] var52 = var202;
                                    Object var203 = Ref.h(556117124296734693L, var52, var53);

                                    try {
                                       var204 = (Long)var203;
                                    } catch (InvocationTargetException var152) {
                                       throw var152.getTargetException();
                                    }

                                    Registry.e(var204);
                                    long var54 = 408529162510360196L;
                                    var238 = Ref.h2(408529162510360196L, var54);

                                    try {
                                       var229 = (String)var238;
                                    } catch (InvocationTargetException var151) {
                                       throw var151.getTargetException();
                                    }

                                    var164 = var229;
                                    if (var7 == null) {
                                       break label606;
                                    }
                                 }

                                 var185 = var15;
                                 var201 = 2;
                              }

                              if (var7 == null) {
                                 if (var185 == var201) {
                                    new StringBuilder();
                                    Object[] var230 = Registry.emptyArgs();
                                    long var57 = 556117124296734693L;
                                    Object[] var56 = var230;
                                    var230 = Ref.h(556117124296734693L, var56, var57);

                                    try {
                                       var232 = (Long)var230;
                                    } catch (InvocationTargetException var150) {
                                       throw var150.getTargetException();
                                    }

                                    var164 = var162.append(var232).append("").toString();
                                    new StringBuilder().append(" ");
                                    var268 = Registry.emptyArgs();
                                    long var59 = 396085629172753019L;
                                    Object[] var58 = (Object[])var268;
                                    var268 = Registry.packArgs(Ref.h(396085629172753019L, var58, var59));
                                    long var60 = 407232484227459369L;
                                    Object var270 = Ref.h2(407232484227459369L, var60);

                                    try {
                                       var270 = (String)var270;
                                    } catch (InvocationTargetException var149) {
                                       throw var149.getTargetException();
                                    }

                                    var164 = var268.append((String)var270).toString();
                                    if (var7 == null) {
                                       break label606;
                                    }
                                 }

                                 var185 = var15;
                                 var201 = 3;
                              }

                              if (var7 == null) {
                                 if (var185 == var201) {
                                    Object[] var205 = Registry.emptyArgs();
                                    long var63 = 309552269024527186L;
                                    Object[] var62 = var205;
                                    Object var206 = Ref.h(309552269024527186L, var62, var63);

                                    try {
                                       var207 = (Long)var206;
                                    } catch (InvocationTargetException var148) {
      String var233;
      String var233;
                                       throw var148.getTargetException();
                                    }

                                    long var283;
                                    var201 = (var283 = var207 - 0L) == 0L ? 0 : (var283 < 0L ? -1 : 1);
                                    var233 = var7;
                                    if (var7 != null) {
                                       break label605;
                                    }

                                    if (var201 <= 0) {
                                       break label606;
                                    }

                                    new StringBuilder().append(" ");
                                    Object var64 = 294038036363208614L;
                                    var268 = (SimpleDateFormat)Ref.g(294038036363208614L, var64);
                                    Date var272;
                                    Object[] var278 = Registry.emptyArgs();
                                    long var67 = 309552269024527186L;
                                    Object[] var66 = var278;
                                    var278 = Ref.h(309552269024527186L, var66, var67);

                                    try {
                                       var280 = (Long)var278;
                                    } catch (InvocationTargetException var147) {
                                       throw var147.getTargetException();
                                    }

new SimpleDateFormat(var280);
                                    var164 = var268.append(var272.format(var272)).toString();
                                    if (var7 == null) {
                                       break label606;
                                    }
                                 }

                                 var185 = var15;
                                 var201 = 4;
                              }

                              var233 = var7;
                              if (var7 == null) {
                                 if (var185 == var201) {
                                    var12 = 2;
                                    if (var7 != null) {
                                       break label563;
                                    }

                                    Object[] var209 = Registry.emptyArgs();
                                    long var69 = 277545572359582529L;
                                    Object[] var68 = var209;
                                    Object var210 = Ref.h(277545572359582529L, var68, var69);

                                    try {
                                       var211 = (String)var210;
                                    } catch (InvocationTargetException var146) {
                                       throw var146.getTargetException();
                                    }

                                    if (var211 == null) {
                                       break label606;
                                    }

                                    new StringBuilder().append(" ");
                                    var268 = Registry.emptyArgs();
                                    long var71 = 277545572359582529L;
                                    Object[] var70 = (Object[])var268;
                                    var268 = Ref.h(277545572359582529L, var70, var71);

                                    try {
                                       var268 = (String)var268;
                                    } catch (InvocationTargetException var145) {
                                       throw var145.getTargetException();
                                    }

                                    var164 = var162.append((String)var268).toString();
                                    var233 = var7;
                                    if (var7 == null) {
                                       break label606;
                                    }
                                 }

                                 var185 = var15;
                                 if (var7 != null) {
                                    break label605;
                                 }

                                 var201 = 5;
                              }

                              if (var185 == var201) {
                                 var12 = 2;
                                 Object[] var234 = Registry.emptyArgs();
                                 long var73 = 403273169707556690L;
                                 Object[] var72 = var234;
                                 var234 = Ref.h(403273169707556690L, var72, var73);

                                 try {
                                    var236 = (Integer)var234;
                                 } catch (InvocationTargetException var144) {
                                    throw var144.getTargetException();
                                 }

                                 String var166 = (String)var162.get(var236);
                                 Object var212 = var166;
                                 if (var7 == null) {
                                    if (var166 == null) {
                                       new StringBuilder().append("");
                                       var268 = Registry.emptyArgs();
                                       long var75 = 403273169707556690L;
                                       Object[] var74 = (Object[])var268;
                                       var268 = Ref.h(403273169707556690L, var74, var75);

                                       try {
                                          var259 = (Integer)var268;
                                       } catch (InvocationTargetException var143) {
                                          throw var143.getTargetException();
                                       }

                                       var166 = var162.append(var259).toString();
                                    }

                                    var212 = var17;
                                    var268 = Registry.emptyArgs();
                                    long var77 = 609029129493991799L;
                                    Object[] var76 = (Object[])var268;
                                    var268 = Ref.h(609029129493991799L, var76, var77);

                                    try {
                                       var262 = (Integer)var268;
                                    } catch (InvocationTargetException var142) {
                                       throw var142.getTargetException();
                                    }

                                    String var237 = (String)var162.get(var262);
                                 }

                                 Object var167 = var212;
                                 Object var213 = var167;
                                 if (var7 == null) {
                                    if (var167 == null) {
                                       new StringBuilder().append("");
                                       var268 = Registry.emptyArgs();
                                       long var79 = 609029129493991799L;
                                       Object[] var78 = (Object[])var268;
                                       var268 = Ref.h(609029129493991799L, var78, var79);

                                       try {
                                          var265 = (Integer)var268;
                                       } catch (InvocationTargetException var141) {
                                          throw var141.getTargetException();
                                       }

                                       var167 = var162.append(var265).toString();
                                    }

                                    var213 = " " + var166 + "/" + var167;
                                 }

                                 var164 = var213;
                              }
                           }

                           var9.setText((String)var164);
                        }

                        Object var80 = 465884130222660170L;
                        HashMap var214 = (HashMap)Ref.g(465884130222660170L, var80);
                        var238 = var162;
                        var268 = Registry.emptyArgs();
                        long var83 = 605430732347023634L;
                        Object[] var82 = (Object[])var268;
                        var268 = Ref.h(605430732347023634L, var82, var83);

                        try {
                           var268 = (String)var268;
                        } catch (InvocationTargetException var140) {
                           throw var140.getTargetException();
                        }

                        if (var7 != null) {
                           break label604;
                        }

                        var233 = var162.containsKey(var268);
                     }

                     if (var233 == false) {
                        Object var84 = 465884130222660170L;
                        var268 = (HashMap)Ref.g(465884130222660170L, var84);
                        HashMap var10014 = Registry.emptyArgs();
                        long var87 = 605430732347023634L;
                        Object[] var86 = var10014;
                        var10014 = Ref.h(605430732347023634L, var86, var87);

                        try {
                           var10014 = (String)var10014;
                        } catch (InvocationTargetException var139) {
                           throw var139.getTargetException();
                        }

                        Object[] var10015 = Registry.packArgs(var162);
                        long var88 = 420211340852268698L;
                        Object var281 = Ref.h2(420211340852268698L, var88);

                        try {
                           var281 = (Icon)var281;
                        } catch (InvocationTargetException var138) {
                           throw var138.getTargetException();
                        }

                        var10014.put(var10015, var281);
                     }

                     var238 = this;
                     Object var90 = 465884130222660170L;
                     var268 = (HashMap)Ref.g(465884130222660170L, var90);
                     Object[] var275 = Registry.emptyArgs();
                     long var93 = 605430732347023634L;
                     Object[] var92 = var275;
                     Ref.h(605430732347023634L, var92, var93);

                     try {
                        ;
                     } catch (InvocationTargetException var137) {
                        throw var137.getTargetException();
                     }
                  }

                  var11 = (Icon)var238.get(var268);
                  break label600;
               }

               var179 = var2.getClass();
               if (var7 != null) {
                  break label601;
               }

               var180 = var179.equals(Tf4.class);
            }

            if (!var180) {
               break label600;
            }

            var179 = var2;
         }

         Tf4 var18 = (Tf4)var179;
         Object[] var10009 = Registry.emptyArgs();
         long var95 = 543633160597441792L;
         Object[] var94 = var10009;
         Ref.h(543633160597441792L, var94, var95);

         try {
            ;
         } catch (InvocationTargetException var136) {
            throw var136.getTargetException();
         }

         Object var19;
         label620: {
            var19 = "";
            int var183 = var15;
            if (var7 == null) {
               if (var15 == 0) {
                  Object[] var195 = Registry.emptyArgs();
                  long var97 = 242892459251541809L;
                  Object[] var96 = var195;
                  var195 = Ref.h(242892459251541809L, var96, var97);

                  try {
                     var195 = (String)var195;
                  } catch (InvocationTargetException var135) {
                     throw var135.getTargetException();
                  }

                  label484: {
                     if (var7 == null) {
                        if (var195 != null) {
                           Object[] var218 = Registry.emptyArgs();
                           long var99 = 242892459251541809L;
                           Object[] var98 = var218;
                           var218 = Ref.h(242892459251541809L, var98, var99);

                           try {
                              var218 = (String)var218;
                           } catch (InvocationTargetException var134) {
                              throw var134.getTargetException();
                           }

                           var19 = var218;
                           if (var7 == null) {
                              break label484;
                           }
                        }

                        var195 = var18;
                        Object[] var221 = Registry.emptyArgs();
                        long var101 = 179612178163941306L;
                        Object[] var100 = var221;
                        Ref.h(179612178163941306L, var100, var101);

                        try {
                           ;
                        } catch (InvocationTargetException var133) {
                           throw var133.getTargetException();
                        }
                     }

                     var19 = var195;
                  }

                  Registry.packArgs(var18);
                  long var102 = 244109252701542571L;
                  Object var222 = Ref.h2(244109252701542571L, var102);

                  try {
                     var222 = (Icon)var222;
                  } catch (InvocationTargetException var132) {
                     throw var132.getTargetException();
                  }

                  var11 = (Icon)var222;
                  break label620;
               }

               var183 = var15;
            }

            byte var10010 = 1;
            if (var7 == null) {
               if (var183 == 1) {
                  var9.setHorizontalAlignment(4);
                  var19 = "";
                  if (var7 == null) {
                     break label620;
                  }
               }

               var183 = var15;
               var10010 = 2;
            }

            if (var7 == null) {
               if (var183 == var10010) {
                  var19 = a(19741, -11245);
                  if (var7 == null) {
                     break label620;
                  }
               }

               var183 = var15;
               var10010 = 3;
            }

            if (var7 == null) {
               if (var183 == var10010) {
                  Object[] var187 = Registry.emptyArgs();
                  long var105 = 548714014728507656L;
                  Object[] var104 = var187;
                  Object var188 = Ref.h(548714014728507656L, var104, var105);

                  try {
                     var189 = (Long)var188;
                  } catch (InvocationTargetException var131) {
                     throw var131.getTargetException();
                  }

                  if (var189 <= 0L) {
                     break label620;
                  }

                  new StringBuilder().append(" ");
                  Object var106 = 294038036363208614L;
                  SimpleDateFormat var10012 = (SimpleDateFormat)Ref.g(294038036363208614L, var106);
                  Date var10013;
                  Object[] var10016 = Registry.emptyArgs();
                  long var109 = 548714014728507656L;
                  Object[] var108 = var10016;
                  var10016 = Ref.h(548714014728507656L, var108, var109);

                  try {
                     var277 = (Long)var10016;
                  } catch (InvocationTargetException var130) {
                     throw var130.getTargetException();
                  }

new SimpleDateFormat(var277);
                  var19 = var10012.append(var10013.format(var10013)).toString();
                  if (var7 == null) {
                     break label620;
                  }
               }

               var183 = var15;
               var10010 = 4;
            }

            label625: {
               if (var7 == null) {
                  if (var183 == var10010) {
                     var12 = 2;
                     Object[] var190 = Registry.emptyArgs();
                     long var111 = 375336992326046344L;
                     Object[] var110 = var190;
                     Object var191 = Ref.h(375336992326046344L, var110, var111);

                     try {
                        var192 = (String)var191;
                     } catch (InvocationTargetException var129) {
                        throw var129.getTargetException();
                     }

                     if (var7 == null) {
                        if (var192 == null) {
                           break label620;
                        }

                        var192 = new StringBuilder().append(" ");
                        Object[] var239 = Registry.emptyArgs();
                        long var113 = 375336992326046344L;
                        Object[] var112 = var239;
                        var239 = Ref.h(375336992326046344L, var112, var113);

                        try {
                           var239 = (String)var239;
                        } catch (InvocationTargetException var128) {
                           throw var128.getTargetException();
                        }

                        var18.append((String)var239).toString();
                     }

                     var19 = var192;
                     if (var7 == null) {
                        break label620;
                     }
                  }

                  var183 = var15;
                  if (var7 != null) {
                     break label625;
                  }

                  var10010 = 5;
               }

               if (var183 != var10010) {
                  break label620;
               }

               var183 = 2;
            }

            var12 = var183;
            Object[] var10011 = Registry.emptyArgs();
            long var115 = 428016133386020772L;
            Object[] var114 = var10011;
            var10011 = Ref.h(428016133386020772L, var114, var115);

            try {
               var216 = (Integer)var10011;
            } catch (InvocationTargetException var127) {
               throw var127.getTargetException();
            }

            String var20 = (String)var18.get(var216);
            Object var193 = var20;
            if (var7 == null) {
               if (var20 == null) {
                  new StringBuilder().append("");
                  Object[] var242 = Registry.emptyArgs();
                  long var117 = 428016133386020772L;
                  Object[] var116 = var242;
                  var242 = Ref.h(428016133386020772L, var116, var117);

                  try {
                     var244 = (Integer)var242;
                  } catch (InvocationTargetException var126) {
                     throw var126.getTargetException();
                  }

                  var20 = var18.append(var244).toString();
               }

               var193 = var17;
               Object[] var245 = Registry.emptyArgs();
               long var119 = 599763612119130140L;
               Object[] var118 = var245;
               var245 = Ref.h(599763612119130140L, var118, var119);

               try {
                  var247 = (Integer)var245;
               } catch (InvocationTargetException var125) {
                  throw var125.getTargetException();
               }

               String var217 = (String)var18.get(var247);
            }

            Object var21 = var193;
            Object var194 = var21;
            if (var7 == null) {
               if (var21 == null) {
                  new StringBuilder().append("");
                  Object[] var248 = Registry.emptyArgs();
                  long var121 = 599763612119130140L;
                  Object[] var120 = var248;
                  var248 = Ref.h(599763612119130140L, var120, var121);

                  try {
                     var250 = (Integer)var248;
                  } catch (InvocationTargetException var124) {
                     throw var124.getTargetException();
                  }

                  var21 = var18.append(var250).toString();
               }

               var194 = " " + var20 + "/" + var21;
            }

            var19 = var194;
         }

         var9.setText((String)var19);
      }

      label451: {
         JLabel var182 = var9;
         if (var7 == null) {
            var9.setHorizontalAlignment(var12);
            if (var15 == 0) {
               var9.setIcon(var11);
               if (var7 == null) {
                  break label451;
               }
            }

            var182 = var9;
         }

         var182.setIcon(null);
      }

      Object var122 = 438642701836156454L;
      this.setBorder((Border)Ref.g(438642701836156454L, var122));
      int var186 = var3;
      if (var7 == null) {
         if (var3 != 0) {
            var9.setOpaque(true);
            var9.setForeground(Color.black);
            if (var7 == null) {
               return var8;
            }
         }

         var9.setForeground(Color.black);
         var186 = var5 % 2;
      }

      int var163 = var186;
      if (var7 == null) {
         if (var163 == 0) {
            var9.setOpaque(false);
            if (var7 == null) {
               return var8;
            }
         }

         var9.setOpaque(true);
      }

      var9.setBackground(new Color(a(22607, 619760827949364534L), a(7597, 8268658189964308695L), a(7597, 8268658189964308695L), a(18155, 1400861709417524112L)));
      return var8;
   }

   public void E() {
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 230987427823841170L;
      Object[] var1 = var10001;
      Ref.h(230987427823841170L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public Address Q$F6() {
      Object var1 = 545626806393068332L;
      return (Address)Ref.g(545626806393068332L, var1);
   }

   public void K(Address var1) {
      long var3 = 545626806393068332L;
      Ref.s(545626806393068332L, var1, var3);
   }

   public void S() {
      long var2 = 438642701836156454L;
      Object var1 = null;
      Ref.s(438642701836156454L, var1, var2);
      long var4 = 294038036363208614L;
      Object var3 = null;
      Ref.s(294038036363208614L, var3, var4);
      long var6 = 545626806393068332L;
      Object var5 = null;
      Ref.s(545626806393068332L, var5, var6);
      long var8 = 465884130222660170L;
      Object var7 = null;
      Ref.s(465884130222660170L, var7, var8);
   }

   public void Q$void() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new Mg2(this), Registry.lookupField(222883478649268280L).getInt(null));
      long var2 = 266288712085965362L;
      Object[] var1 = var10001;
      Ref.h(266288712085965362L, var1, var2);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 19740) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 63;
               break;
            case 1:
               var10000 = 0;
               break;
            case 2:
               var10000 = 3;
               break;
            case 3:
               var10000 = 247;
               break;
            case 4:
               var10000 = 18;
               break;
            case 5:
               var10000 = 103;
               break;
            case 6:
               var10000 = 200;
               break;
            case 7:
               var10000 = 53;
               break;
            case 8:
               var10000 = 164;
               break;
            case 9:
               var10000 = 16;
               break;
            case 10:
               var10000 = 51;
               break;
            case 11:
               var10000 = 136;
               break;
            case 12:
               var10000 = 196;
               break;
            case 13:
               var10000 = 216;
               break;
            case 14:
               var10000 = 85;
               break;
            case 15:
               var10000 = 80;
               break;
            case 16:
               var10000 = 210;
               break;
            case 17:
               var10000 = 79;
               break;
            case 18:
               var10000 = 98;
               break;
            case 19:
               var10000 = 11;
               break;
            case 20:
               var10000 = 107;
               break;
            case 21:
               var10000 = 245;
               break;
            case 22:
               var10000 = 56;
               break;
            case 23:
               var10000 = 221;
               break;
            case 24:
               var10000 = 47;
               break;
            case 25:
               var10000 = 126;
               break;
            case 26:
               var10000 = 181;
               break;
            case 27:
               var10000 = 109;
               break;
            case 28:
               var10000 = 75;
               break;
            case 29:
               var10000 = 133;
               break;
            case 30:
               var10000 = 9;
               break;
            case 31:
               var10000 = 224;
               break;
            case 32:
               var10000 = 102;
               break;
            case 33:
               var10000 = 230;
               break;
            case 34:
               var10000 = 42;
               break;
            case 35:
               var10000 = 101;
               break;
            case 36:
               var10000 = 46;
               break;
            case 37:
               var10000 = 127;
               break;
            case 38:
               var10000 = 241;
               break;
            case 39:
               var10000 = 88;
               break;
            case 40:
               var10000 = 106;
               break;
            case 41:
               var10000 = 250;
               break;
            case 42:
               var10000 = 229;
               break;
            case 43:
               var10000 = 104;
               break;
            case 44:
               var10000 = 180;
               break;
            case 45:
               var10000 = 73;
               break;
            case 46:
               var10000 = 143;
               break;
            case 47:
               var10000 = 35;
               break;
            case 48:
               var10000 = 249;
               break;
            case 49:
               var10000 = 194;
               break;
            case 50:
               var10000 = 97;
               break;
            case 51:
               var10000 = 235;
               break;
            case 52:
               var10000 = 52;
               break;
            case 53:
               var10000 = 36;
               break;
            case 54:
               var10000 = 149;
               break;
            case 55:
               var10000 = 252;
               break;
            case 56:
               var10000 = 218;
               break;
            case 57:
               var10000 = 13;
               break;
            case 58:
               var10000 = 170;
               break;
            case 59:
               var10000 = 115;
               break;
            case 60:
               var10000 = 112;
               break;
            case 61:
               var10000 = 191;
               break;
            case 62:
               var10000 = 169;
               break;
            case 63:
               var10000 = 190;
               break;
            case 64:
               var10000 = 211;
               break;
            case 65:
               var10000 = 153;
               break;
            case 66:
               var10000 = 185;
               break;
            case 67:
               var10000 = 171;
               break;
            case 68:
               var10000 = 38;
               break;
            case 69:
               var10000 = 195;
               break;
            case 70:
               var10000 = 206;
               break;
            case 71:
               var10000 = 232;
               break;
            case 72:
               var10000 = 183;
               break;
            case 73:
               var10000 = 39;
               break;
            case 74:
               var10000 = 222;
               break;
            case 75:
               var10000 = 202;
               break;
            case 76:
               var10000 = 150;
               break;
            case 77:
               var10000 = 121;
               break;
            case 78:
               var10000 = 239;
               break;
            case 79:
               var10000 = 111;
               break;
            case 80:
               var10000 = 29;
               break;
            case 81:
               var10000 = 223;
               break;
            case 82:
               var10000 = 33;
               break;
            case 83:
               var10000 = 50;
               break;
            case 84:
               var10000 = 168;
               break;
            case 85:
               var10000 = 198;
               break;
            case 86:
               var10000 = 178;
               break;
            case 87:
               var10000 = 237;
               break;
            case 88:
               var10000 = 186;
               break;
            case 89:
               var10000 = 30;
               break;
            case 90:
               var10000 = 165;
               break;
            case 91:
               var10000 = 67;
               break;
            case 92:
               var10000 = 68;
               break;
            case 93:
               var10000 = 113;
               break;
            case 94:
               var10000 = 192;
               break;
            case 95:
               var10000 = 227;
               break;
            case 96:
               var10000 = 8;
               break;
            case 97:
               var10000 = 152;
               break;
            case 98:
               var10000 = 205;
               break;
            case 99:
               var10000 = 209;
               break;
            case 100:
               var10000 = 134;
               break;
            case 101:
               var10000 = 147;
               break;
            case 102:
               var10000 = 184;
               break;
            case 103:
               var10000 = 208;
               break;
            case 104:
               var10000 = 243;
               break;
            case 105:
               var10000 = 59;
               break;
            case 106:
               var10000 = 92;
               break;
            case 107:
               var10000 = 72;
               break;
            case 108:
               var10000 = 77;
               break;
            case 109:
               var10000 = 108;
               break;
            case 110:
               var10000 = 100;
               break;
            case 111:
               var10000 = 74;
               break;
            case 112:
               var10000 = 238;
               break;
            case 113:
               var10000 = 212;
               break;
            case 114:
               var10000 = 172;
               break;
            case 115:
               var10000 = 66;
               break;
            case 116:
               var10000 = 37;
               break;
            case 117:
               var10000 = 1;
               break;
            case 118:
               var10000 = 132;
               break;
            case 119:
               var10000 = 163;
               break;
            case 120:
               var10000 = 60;
               break;
            case 121:
               var10000 = 173;
               break;
            case 122:
               var10000 = 167;
               break;
            case 123:
               var10000 = 197;
               break;
            case 124:
               var10000 = 139;
               break;
            case 125:
               var10000 = 20;
               break;
            case 126:
               var10000 = 120;
               break;
            case 127:
               var10000 = 214;
               break;
            case 128:
               var10000 = 23;
               break;
            case 129:
               var10000 = 49;
               break;
            case 130:
               var10000 = 166;
               break;
            case 131:
               var10000 = 240;
               break;
            case 132:
               var10000 = 204;
               break;
            case 133:
               var10000 = 84;
               break;
            case 134:
               var10000 = 177;
               break;
            case 135:
               var10000 = 25;
               break;
            case 136:
               var10000 = 93;
               break;
            case 137:
               var10000 = 40;
               break;
            case 138:
               var10000 = 110;
               break;
            case 139:
               var10000 = 76;
               break;
            case 140:
               var10000 = 65;
               break;
            case 141:
               var10000 = 123;
               break;
            case 142:
               var10000 = 12;
               break;
            case 143:
               var10000 = 203;
               break;
            case 144:
               var10000 = 145;
               break;
            case 145:
               var10000 = 248;
               break;
            case 146:
               var10000 = 157;
               break;
            case 147:
               var10000 = 255;
               break;
            case 148:
               var10000 = 21;
               break;
            case 149:
               var10000 = 160;
               break;
            case 150:
               var10000 = 114;
               break;
            case 151:
               var10000 = 91;
               break;
            case 152:
               var10000 = 193;
               break;
            case 153:
               var10000 = 55;
               break;
            case 154:
               var10000 = 189;
               break;
            case 155:
               var10000 = 182;
               break;
            case 156:
               var10000 = 135;
               break;
            case 157:
               var10000 = 24;
               break;
            case 158:
               var10000 = 175;
               break;
            case 159:
               var10000 = 246;
               break;
            case 160:
               var10000 = 94;
               break;
            case 161:
               var10000 = 22;
               break;
            case 162:
               var10000 = 244;
               break;
            case 163:
               var10000 = 174;
               break;
            case 164:
               var10000 = 19;
               break;
            case 165:
               var10000 = 242;
               break;
            case 166:
               var10000 = 41;
               break;
            case 167:
               var10000 = 54;
               break;
            case 168:
               var10000 = 6;
               break;
            case 169:
               var10000 = 119;
               break;
            case 170:
               var10000 = 44;
               break;
            case 171:
               var10000 = 48;
               break;
            case 172:
               var10000 = 137;
               break;
            case 173:
               var10000 = 125;
               break;
            case 174:
               var10000 = 219;
               break;
            case 175:
               var10000 = 158;
               break;
            case 176:
               var10000 = 131;
               break;
            case 177:
               var10000 = 89;
               break;
            case 178:
               var10000 = 15;
               break;
            case 179:
               var10000 = 201;
               break;
            case 180:
               var10000 = 124;
               break;
            case 181:
               var10000 = 151;
               break;
            case 182:
               var10000 = 128;
               break;
            case 183:
               var10000 = 96;
               break;
            case 184:
               var10000 = 220;
               break;
            case 185:
               var10000 = 105;
               break;
            case 186:
               var10000 = 90;
               break;
            case 187:
               var10000 = 142;
               break;
            case 188:
               var10000 = 45;
               break;
            case 189:
               var10000 = 156;
               break;
            case 190:
               var10000 = 116;
               break;
            case 191:
               var10000 = 226;
               break;
            case 192:
               var10000 = 199;
               break;
            case 193:
               var10000 = 87;
               break;
            case 194:
               var10000 = 161;
               break;
            case 195:
               var10000 = 86;
               break;
            case 196:
               var10000 = 231;
               break;
            case 197:
               var10000 = 61;
               break;
            case 198:
               var10000 = 146;
               break;
            case 199:
               var10000 = 233;
               break;
            case 200:
               var10000 = 188;
               break;
            case 201:
               var10000 = 99;
               break;
            case 202:
               var10000 = 155;
               break;
            case 203:
               var10000 = 162;
               break;
            case 204:
               var10000 = 83;
               break;
            case 205:
               var10000 = 187;
               break;
            case 206:
               var10000 = 138;
               break;
            case 207:
               var10000 = 130;
               break;
            case 208:
               var10000 = 70;
               break;
            case 209:
               var10000 = 57;
               break;
            case 210:
               var10000 = 64;
               break;
            case 211:
               var10000 = 144;
               break;
            case 212:
               var10000 = 254;
               break;
            case 213:
               var10000 = 234;
               break;
            case 214:
               var10000 = 118;
               break;
            case 215:
               var10000 = 78;
               break;
            case 216:
               var10000 = 159;
               break;
            case 217:
               var10000 = 34;
               break;
            case 218:
               var10000 = 236;
               break;
            case 219:
               var10000 = 251;
               break;
            case 220:
               var10000 = 17;
               break;
            case 221:
               var10000 = 7;
               break;
            case 222:
               var10000 = 213;
               break;
            case 223:
               var10000 = 81;
               break;
            case 224:
               var10000 = 71;
               break;
            case 225:
               var10000 = 148;
               break;
            case 226:
               var10000 = 62;
               break;
            case 227:
               var10000 = 31;
               break;
            case 228:
               var10000 = 10;
               break;
            case 229:
               var10000 = 58;
               break;
            case 230:
               var10000 = 122;
               break;
            case 231:
               var10000 = 179;
               break;
            case 232:
               var10000 = 2;
               break;
            case 233:
               var10000 = 117;
               break;
            case 234:
               var10000 = 28;
               break;
            case 235:
               var10000 = 26;
               break;
            case 236:
               var10000 = 215;
               break;
            case 237:
               var10000 = 225;
               break;
            case 238:
               var10000 = 27;
               break;
            case 239:
               var10000 = 207;
               break;
            case 240:
               var10000 = 217;
               break;
            case 241:
               var10000 = 32;
               break;
            case 242:
               var10000 = 228;
               break;
            case 243:
               var10000 = 253;
               break;
            case 244:
               var10000 = 129;
               break;
            case 245:
               var10000 = 4;
               break;
            case 246:
               var10000 = 43;
               break;
            case 247:
               var10000 = 14;
               break;
            case 248:
               var10000 = 82;
               break;
            case 249:
               var10000 = 69;
               break;
            case 250:
               var10000 = 176;
               break;
            case 251:
               var10000 = 140;
               break;
            case 252:
               var10000 = 95;
               break;
            case 253:
               var10000 = 5;
               break;
            case 254:
               var10000 = 141;
               break;
            default:
               var10000 = 154;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28027;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "Ä\u0085m(N/WVÐ¾eíñßjQ\u0004\t攢丩妽";
      int var12 = "Ä\u0085m(N/WVÐ¾eíñßjQ\u0004\t攢丩妽".length();
      char var9 = 16;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label47: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var23 = 49;
            var10002 = var10003;
            int var16 = var10004;
            byte var27;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var27 = 49;
               var10006 = var14;
            } else {
               var23 = 49;
               var16 = var10004;
               if (var10004 <= var14) {
                  break label47;
               }

               var10005 = var10003;
               var27 = 49;
               var10006 = var14;
            }

            while (true) {
               char var40 = var10005[var10006];
               byte var41;
               switch (var14 % 7) {
                  case 0:
                     var41 = 15;
                     break;
                  case 1:
                     var41 = 76;
                     break;
                  case 2:
                     var41 = 44;
                     break;
                  case 3:
                     var41 = 41;
                     break;
                  case 4:
                     var41 = 8;
                     break;
                  case 5:
                     var41 = 3;
                     break;
                  default:
                     var41 = 15;
               }

               var10005[var10006] = (char)(var40 ^ var27 ^ var41);
               var14++;
               if (var23 == 0) {
                  var10006 = var23;
                  var10005 = var10002;
                  var27 = var23;
               } else {
                  if (var16 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var27 = var23;
                  var10006 = var14;
               }
            }
         }

         String var25 = new String(var10002).intern();
         int var18 = -1;
         var13[var11++] = var25;
         if ((var8 += var9) >= var12) {
            a = var13;
            b = new String[2];
            long var0 = 5687650794393504883L;
            long[] var6 = new long[3];
            int var3 = 0;
            String var4 = "<\u000fö\u000f/\f'é5qÓUÓ¹|ÀK\u001f\u0083,-Ô¹!";
            int var5 = "<\u000fö\u000f/\f'é5qÓUÓ¹|ÀK\u001f\u0083,-Ô¹!".length();
            byte var2 = 0;

            do {
               var18 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
               var18 = var3++;
               long var31 = (
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
               byte var26 = -1;
               var6[var18] = var31;
            } while (var2 < var5);

            c = var6;
            d = new Integer[3];
            return;
         }

         var9 = var10.charAt(var8);
      }
   }
}






