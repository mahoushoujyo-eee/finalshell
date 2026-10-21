package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.EditorSelectionDialog;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.FileBrowserAddressBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

public class FU3 implements ActionListener {
   public final int G;
   public final EditorSelectionDialog r;

   public FU3(EditorSelectionDialog var1, int var2) {
      this.r = var1;
      this.G = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var10000 = FileBrowserAddressBar.i();
      Object var3 = 0;
      Object var2 = var10000;
      Object var12 = 121430004283033522L;
      Ref.g(121430004283033522L, var12);
      Object var14 = 546550992201866353L;
      Ref.g(546550992201866353L, var14);
      Object[] var10003 = Registry.emptyArgs();
      long var17 = 479006944855319308L;
      Object[] var16 = var10003;
      Ref.h(479006944855319308L, var16, var17);

      try {
         ;
      } catch (InvocationTargetException var136) {
         throw var136.getTargetException();
      }

      label375: {
         label379: {
            var10003 = Registry.lookupField(310907260019797101L).getInt(this);
            int var10004 = Registry.lookupField(243490669497898236L).getInt(null);
            if (var2 == null) {
               if (var10003 == var10004) {
                  Object var18 = 121430004283033522L;
                  Ref.g(121430004283033522L, var18);
                  Object var20 = 546550992201866353L;
                  Ref.g(546550992201866353L, var20);
                  Object var10006 = Registry.emptyArgs();
                  long var23 = 126176237984401993L;
                  Object var22 = var10006;
                  var10006 = Ref.h(126176237984401993L, var22, var23);

                  try {
                     var10006 = (com.finalshell.core.Km2)var10006;
                  } catch (InvocationTargetException var135) {
                     throw var135.getTargetException();
                  }

                  label381: {
                     com.finalshell.core.Km2 var5 = var10006;
                     int var6 = var5.getSelectedRow();
                     if (var6 > -1) {
                        Object[] var10007 = Registry.packArgs(var6);
                        long var25 = 303488344973038628L;
                        Object[] var24 = var10007;
                        Tf4 var7 = (Tf4)Ref.h(303488344973038628L, var24, var25);
                        String var10008 = (String)(Registry.emptyArgs());
                        long var27 = 498856411508641826L;
                        Object var26 = var10008;
                        var10008 = Ref.h(498856411508641826L, var26, var27);

                        try {
                           var10008 = (String)var10008;
                        } catch (InvocationTargetException var134) {
                           throw var134.getTargetException();
                        }

                        label365: {
                           String var8 = var10008;
                           File var9 = new File(var8);
                           FU3 var167 = var9.exists();
                           if (var2 == null) {
                              if (var167 == null) {
                                 break label365;
                              }

                              var167 = this;
                              Object var28 = 121430004283033522L;
                              Ref.g(121430004283033522L, var28);
                              long var31 = 518641299092321834L;
                              Ref.s(518641299092321834L, var8, var31);
                              boolean var10010 = true;
                           }

                           var3 = var167;
                        }

                        if (var2 == null) {
                           break label381;
                        }
                     }

                     Object[] var164 = Registry.emptyArgs();
                     long var33 = 208260183617353218L;
                     Object[] var32 = var164;
                     Ref.h(208260183617353218L, var32, var33);

                     try {
                        ;
                     } catch (InvocationTargetException var133) {
                        throw var133.getTargetException();
                     }

                     String var168 = (String)(Registry.emptyArgs());
                     long var35 = 498856411508641826L;
                     Object var34 = var168;
                     var168 = Ref.h(498856411508641826L, var34, var35);

                     try {
                        var168 = (String)var168;
                     } catch (InvocationTargetException var132) {
                        throw var132.getTargetException();
                     }

                     String var141 = var168;
                     File var144 = new File(var141);
                     FU3 var171 = var144.exists();
                     if (var2 == null) {
                        if (var171 == null) {
                           break label381;
                        }

                        var171 = var144.isDirectory();
                     }

                     if (var2 == null) {
                        if (var171 == null) {
                           break label381;
                        }

                        var171 = var144.isFile();
                     }

                     if (var2 == null) {
                        if (var171 == null) {
                           break label381;
                        }

                        var171 = this;
                        Object var36 = 121430004283033522L;
                        Ref.g(121430004283033522L, var36);
                        long var39 = 518641299092321834L;
                        Ref.s(518641299092321834L, var141, var39);
                        boolean var173 = true;
                     }

                     var3 = var171;
                  }

                  if (var2 == null) {
                     break label379;
                  }
               }

               var10003 = Registry.lookupField(310907260019797101L).getInt(this);
               var10004 = Registry.lookupField(530934992944035866L).getInt(null);
            }

            if (var2 == null) {
               if (var10003 == var10004) {
                  Object var40 = 121430004283033522L;
                  Ref.g(121430004283033522L, var40);
                  Object var42 = 546550992201866353L;
                  Ref.g(546550992201866353L, var42);
                  Object var158 = Registry.emptyArgs();
                  long var45 = 126176237984401993L;
                  Object var44 = var158;
                  var158 = Ref.h(126176237984401993L, var44, var45);

                  try {
                     var158 = (com.finalshell.core.Km2)var158;
                  } catch (InvocationTargetException var131) {
                     throw var131.getTargetException();
                  }

                  com.finalshell.core.Km2 var137 = var158;
                  int var139 = var137.getSelectedRow();
                  label332:
                  if (var139 > -1) {
                     Object var46 = 121430004283033522L;
                     Ref.g(121430004283033522L, var46);
                     Object var48 = 546550992201866353L;
                     Ref.g(546550992201866353L, var48);
                     Object[] var10009 = Registry.emptyArgs();
                     long var51 = 420275156100745042L;
                     Object[] var50 = var10009;
                     Ref.h(420275156100745042L, var50, var51);

                     try {
                        ;
                     } catch (InvocationTargetException var130) {
                        throw var130.getTargetException();
                     }

                     Object[] var174 = Registry.packArgs(var139);
                     long var53 = 303488344973038628L;
                     Object[] var52 = var174;
                     var174 = Ref.h(303488344973038628L, var52, var53);

                     try {
                        var174 = (Object[])((Object)var174);
                     } catch (InvocationTargetException var129) {
                        throw var129.getTargetException();
                     }

                     Object var184;
                     label385: {
                        Object var142 = var174;
                        boolean var177 = var142.getClass().equals(Tf4.class);
                        if (var2 == null) {
                           if (var177) {
                              var184 = Registry.packArgs(var139);
                              long var55 = 303488344973038628L;
                              Object[] var54 = (Object[])var184;
                              Tf4 var145 = (Tf4)Ref.h(303488344973038628L, var54, var55);
                              String var10012 = (String)(Registry.emptyArgs());
                              long var57 = 498856411508641826L;
                              Object var56 = var10012;
                              var10012 = Ref.h(498856411508641826L, var56, var57);

                              try {
                                 var10012 = (String)var10012;
                              } catch (InvocationTargetException var128) {
                                 throw var128.getTargetException();
                              }

                              String var10 = var10012;
                              File var11 = new File(var10);
                              if (var11.exists()) {
                                 Object[] var10013 = Registry.packArgs(var10, true, true);
                                 long var59 = 413727787977868950L;
                                 Object[] var58 = var10013;
                                 Ref.h(413727787977868950L, var58, var59);

                                 try {
                                    ;
                                 } catch (InvocationTargetException var127) {
                                    throw var127.getTargetException();
                                 }
                              }

                              if (var2 == null) {
                                 break label332;
                              }
                           }

                           Class var178 = var142.getClass();
                           var184 = var2;
                           if (var2 == null) {
                              break label385;
                           }

                           var177 = var178.equals(Ck4.class);
                        }

                        if (!var177) {
                           break label332;
                        }

                        var184 = Registry.packArgs(var139);
                        long var61 = 303488344973038628L;
                        Object[] var60 = (Object[])var184;
                        var184 = Ref.h(303488344973038628L, var60, var61);

                        try {
                           var184 = var184;
                        } catch (InvocationTargetException var126) {
                           throw var126.getTargetException();
                        }
                     }

                     Ck4 var146 = (Ck4)var184;
                     String var193 = (String)(Registry.emptyArgs());
                     long var63 = 605430732347023634L;
                     Object var62 = var193;
                     var193 = Ref.h(605430732347023634L, var62, var63);

                     try {
                        var193 = (String)var193;
                     } catch (InvocationTargetException var125) {
                        throw var125.getTargetException();
                     }

                     String var149 = var193;
                     File var152 = new File(var149);
                     FU3 var196 = var152.exists();
                     if (var2 == null) {
                        if (var196 == null) {
                           break label332;
                        }

                        var196 = this;
                        Object var64 = 121430004283033522L;
                        Ref.g(121430004283033522L, var64);
                        long var67 = 518641299092321834L;
                        Ref.s(518641299092321834L, var149, var67);
                        boolean var10014 = true;
                     }

                     var3 = var196;
                  }

                  if (var2 == null) {
                     break label379;
                  }
               }

               var10003 = Registry.lookupField(310907260019797101L).getInt(this);
               var10004 = Registry.lookupField(117752090945034800L).getInt(null);
            }

            if (var2 == null) {
               if (var10003 == var10004) {
                  Object var68 = 121430004283033522L;
                  Ref.g(121430004283033522L, var68);
                  Object var70 = 546550992201866353L;
                  Ref.g(546550992201866353L, var70);
                  Object var161 = Registry.emptyArgs();
                  long var73 = 126176237984401993L;
                  Object var72 = var161;
                  var161 = Ref.h(126176237984401993L, var72, var73);

                  try {
                     var161 = (com.finalshell.core.Km2)var161;
                  } catch (InvocationTargetException var124) {
                     throw var124.getTargetException();
                  }

                  com.finalshell.core.Km2 var138 = var161;
                  int var140 = var138.getSelectedRow();
                  label301:
                  if (var140 > -1) {
                     Object var74 = 121430004283033522L;
                     Ref.g(121430004283033522L, var74);
                     Object var76 = 546550992201866353L;
                     Ref.g(546550992201866353L, var76);
                     Object[] var172 = Registry.emptyArgs();
                     long var79 = 420275156100745042L;
                     Object[] var78 = var172;
                     Ref.h(420275156100745042L, var78, var79);

                     try {
                        ;
                     } catch (InvocationTargetException var123) {
                        throw var123.getTargetException();
                     }

                     Object[] var179 = Registry.packArgs(var140);
                     long var81 = 303488344973038628L;
                     Object[] var80 = var179;
                     var179 = Ref.h(303488344973038628L, var80, var81);

                     try {
                        var179 = (Object[])((Object)var179);
                     } catch (InvocationTargetException var122) {
                        throw var122.getTargetException();
                     }

                     Object var188;
                     label391: {
                        Object var143 = var179;
                        boolean var182 = var143.getClass().equals(Tf4.class);
                        if (var2 == null) {
                           if (var182) {
                              var188 = Registry.packArgs(var140);
                              long var83 = 303488344973038628L;
                              Object[] var82 = (Object[])var188;
                              Tf4 var147 = (Tf4)Ref.h(303488344973038628L, var82, var83);
                              String var197 = (String)(Registry.emptyArgs());
                              long var85 = 498856411508641826L;
                              Object var84 = var197;
                              var197 = Ref.h(498856411508641826L, var84, var85);

                              try {
                                 var197 = (String)var197;
                              } catch (InvocationTargetException var121) {
                                 throw var121.getTargetException();
                              }

                              label394: {
                                 String var150 = var197;
                                 File var153 = new File(var150);
                                 var197 = var153.exists();
                                 if (var2 == null) {
                                    if (var197 == null) {
                                       break label394;
                                    }

                                    var197 = Registry.emptyArgs();
                                    long var86 = 454647487873911743L;
                                    Object var205 = Ref.h2(454647487873911743L, var86);

                                    try {
                                    } catch (InvocationTargetException var120) {
                                       throw var120.getTargetException();
                                    }
                                 }

                                 label396: {
                                    if (var2 == null) {
                                       if (var197 == null) {
                                          break label396;
                                       }

                                       var197 = Registry.packArgs(var153);
                                       long var88 = 401544505347980134L;
                                       Object var206 = Ref.h2(401544505347980134L, var88);

                                       try {
                                       } catch (InvocationTargetException var119) {
                                          throw var119.getTargetException();
                                       }
                                    }

                                    label281: {
                                       if (var2 == null) {
                                          if (var197 == null) {
                                             break label281;
                                          }

                                          var197 = this;
                                          Object var90 = 121430004283033522L;
                                          Ref.g(121430004283033522L, var90);
                                          long var93 = 518641299092321834L;
                                          Ref.s(518641299092321834L, var150, var93);
                                          boolean var208 = true;
                                       }

                                       var3 = var197;
                                       if (var2 == null) {
                                          break label394;
                                       }
                                    }

                                    Object[] var207 = Registry.packArgs(var150, true, true);
                                    long var95 = 413727787977868950L;
                                    Object[] var94 = var207;
                                    Ref.h(413727787977868950L, var94, var95);

                                    try {
                                       ;
                                    } catch (InvocationTargetException var118) {
                                       throw var118.getTargetException();
                                    }

                                    if (var2 == null) {
                                       break label394;
                                    }
                                 }

                                 Object[] var209 = Registry.packArgs(var150, true, true);
                                 long var97 = 413727787977868950L;
                                 Object[] var96 = var209;
                                 Ref.h(413727787977868950L, var96, var97);

                                 try {
                                    ;
                                 } catch (InvocationTargetException var117) {
                                    throw var117.getTargetException();
                                 }
                              }

                              if (var2 == null) {
                                 break label301;
                              }
                           }

                           Class var183 = var143.getClass();
                           var188 = var2;
                           if (var2 == null) {
                              break label391;
                           }

                           var182 = var183.equals(Ck4.class);
                        }

                        if (!var182) {
                           break label301;
                        }

                        var188 = Registry.packArgs(var140);
                        long var99 = 303488344973038628L;
                        Object[] var98 = (Object[])var188;
                        var188 = Ref.h(303488344973038628L, var98, var99);

                        try {
                           var188 = var188;
                        } catch (InvocationTargetException var116) {
                           throw var116.getTargetException();
                        }
                     }

                     Ck4 var148 = (Ck4)var188;
                     String var201 = (String)(Registry.emptyArgs());
                     long var101 = 605430732347023634L;
                     Object var100 = var201;
                     var201 = Ref.h(605430732347023634L, var100, var101);

                     try {
                        var201 = (String)var201;
                     } catch (InvocationTargetException var115) {
                        throw var115.getTargetException();
                     }

                     String var151 = var201;
                     File var154 = new File(var151);
                     FU3 var204 = var154.exists();
                     if (var2 == null) {
                        if (var204 == null) {
                           break label301;
                        }

                        var204 = this;
                        Object var102 = 121430004283033522L;
                        Ref.g(121430004283033522L, var102);
                        long var105 = 518641299092321834L;
                        Ref.s(518641299092321834L, var151, var105);
                        boolean var210 = true;
                     }

                     var3 = var204;
                  }

                  if (var2 == null) {
                     break label379;
                  }
               }

               var10003 = Registry.lookupField(310907260019797101L).getInt(this);
               if (var2 == null) {
                  break label375;
               }

               var10004 = Registry.lookupField(317162390314131527L).getInt(null);
            }

            if (var10003 == var10004) {
               Object var106 = 121430004283033522L;
               Ref.g(121430004283033522L, var106);
               Object[] var10005 = Registry.emptyArgs();
               long var109 = 190925019033578435L;
               Object[] var108 = var10005;
               Ref.h(190925019033578435L, var108, var109);

               try {
                  ;
               } catch (InvocationTargetException var114) {
                  throw var114.getTargetException();
               }
            }
         }

         var10003 = (Object[])var3;
      }

      if (var10003 != null) {
         Object var110 = 121430004283033522L;
         Registry.lookupField(633665384138343849L).setInt(Ref.g(121430004283033522L, var110), Registry.lookupField(564170828581134815L).getInt(null));
         Object var112 = 121430004283033522L;
         ((EditorSelectionDialog)Ref.g(121430004283033522L, var112)).setVisible(false);
      }
   }
}





