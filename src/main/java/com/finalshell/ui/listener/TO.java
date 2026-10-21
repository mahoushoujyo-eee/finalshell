package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.O32;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.model.Kl4;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.FileBrowserAddressBar;
import com.finalshell.ui.panel.ConnectionInfoPanel;
import com.finalshell.ui.panel.SetExternalEditorPanel;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

public class TO implements MouseListener {
   public final boolean D;
   public final ConnectionInfoPanel U;
   public final FileBrowserAddressBar O;
   public final com.finalshell.core.Km2 b;
   public static long a;

   public TO(com.finalshell.core.Km2 var1, boolean var2, ConnectionInfoPanel var3, FileBrowserAddressBar var4) {
      this.b = var1;
      this.D = var2;
      this.U = var3;
      this.O = var4;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.getButton() == 3) {
         Object var2 = 396507593444187971L;
         Ref.g(396507593444187971L, var2);
         Point var10002 = var1.getLocationOnScreen();
         long var5 = 140993979563084749L;
         Point var4 = var10002;
         Ref.s(140993979563084749L, var4, var5);
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      boolean var115;
      boolean var120;
      String var2;
      String var3;
      TO var107;
      Object var10003;
      label229: {
         String var106;
         label246: {
            var2 = com.finalshell.core.Km2.U$String();
            int var10000 = var1.getButton();
            byte var10001 = 3;
            if (var2 == null) {
               if (var10000 == 3) {
                  Object var10 = 396507593444187971L;
                  Ref.g(396507593444187971L, var10);
                  Point var10002 = var1.getLocationOnScreen();
                  long var13 = 493953348619799745L;
                  Point var12 = var10002;
                  Ref.s(493953348619799745L, var12, var13);
                  Object var14 = 396507593444187971L;
                  var10003 = Ref.g(396507593444187971L, var14);
                  Object[] var10004 = Registry.emptyArgs();
                  long var17 = 628221387193261187L;
                  Object[] var16 = var10004;
                  Ref.h(628221387193261187L, var16, var17);

                  try {
                     ;
                  } catch (InvocationTargetException var103) {
                     throw var103.getTargetException();
                  }
               }

               var10000 = var1.getButton();
               var106 = var2;
               if (var2 != null) {
                  break label246;
               }

               var10001 = 1;
            }

            if (var10000 == var10001) {
               Object var18 = 396507593444187971L;
               var3 = ((com.finalshell.core.Km2)Ref.g(396507593444187971L, var18)).rowAtPoint(var1.getPoint());
               Object var20 = 396507593444187971L;
               if (!((com.finalshell.core.Km2)Ref.g(396507593444187971L, var20)).isRowSelected((int)var3)) {
               }

               var107 = var1.getClickCount();
               var10003 = 2;
               if (var2 != null) {
                  break label229;
               }

               label183:
               if (var107 == null) {
                  Object var22 = 396507593444187971L;
                  var10003 = Ref.g(396507593444187971L, var22);
                  Object[] var111 = Registry.packArgs((int)var3);
                  long var25 = 303488344973038628L;
                  Object[] var24 = var111;
                  var111 = Ref.h(303488344973038628L, var24, var25);

                  try {
                     var111 = (Object[])((Object)var111);
                  } catch (InvocationTargetException var102) {
                     throw var102.getTargetException();
                  }

                  Object var4 = var111;
                  boolean var114 = var4.getClass().equals(Tf4.class);
                  if (var2 == null) {
                     if (var114) {
                        Tf4 var5 = (Tf4)var4;
                        Registry.emptyArgs();
                        long var26 = 454647487873911743L;
                        Object var10005 = Ref.h2(454647487873911743L, var26);

                        try {
                           var115 = (Boolean)var10005;
                        } catch (InvocationTargetException var101) {
                           throw var101.getTargetException();
                        }

                        label236: {
                           label237: {
                              label238: {
                                 label239: {
                                    if (var2 == null) {
                                       if (!var115) {
                                          break label237;
                                       }

                                       if (var2 != null) {
                                          break label239;
                                       }

                                       var115 = Registry.lookupField(332277969307150886L).getBoolean(this);
                                    }

                                    if (var115) {
                                       break label238;
                                    }
                                 }

                                 Object var28 = 487924346083543578L;
                                 Ref.g(487924346083543578L, var28);
                                 Object[] var10008 = Registry.emptyArgs();
                                 long var31 = 498856411508641826L;
                                 Object[] var30 = var10008;
                                 var10008 = Registry.packArgs(Ref.h(498856411508641826L, var30, var31), true, true);
                                 long var33 = 413727787977868950L;
                                 Object[] var32 = var10008;
                                 Ref.h(413727787977868950L, var32, var33);

                                 try {
                                    ;
                                 } catch (InvocationTargetException var100) {
                                    throw var100.getTargetException();
                                 }

                                 if (var2 == null) {
                                    break label236;
                                 }
                              }

                              String var10006 = (String)(Registry.emptyArgs());
                              long var35 = 498856411508641826L;
                              Object var34 = var10006;
                              var10006 = Ref.h(498856411508641826L, var34, var35);

                              try {
                                 var10006 = (String)var10006;
                              } catch (InvocationTargetException var99) {
                                 throw var99.getTargetException();
                              }

                              String var6 = var10006;
                              File var7 = new File(var6);
                              Registry.packArgs(var7);
                              long var36 = 401544505347980134L;
                              Object var10007 = Ref.h2(401544505347980134L, var36);

                              try {
                                 var120 = (Boolean)var10007;
                              } catch (InvocationTargetException var98) {
                                 throw var98.getTargetException();
                              }

                              if (!var120) {
                                 Object var38 = 487924346083543578L;
                                 Ref.g(487924346083543578L, var38);
                                 Object[] var10010 = Registry.emptyArgs();
                                 long var41 = 498856411508641826L;
                                 Object[] var40 = var10010;
                                 var10010 = Registry.packArgs(Ref.h(498856411508641826L, var40, var41), true, true);
                                 long var43 = 413727787977868950L;
                                 Object[] var42 = var10010;
                                 Ref.h(413727787977868950L, var42, var43);

                                 try {
                                    ;
                                 } catch (InvocationTargetException var97) {
                                    throw var97.getTargetException();
                                 }
                              }

                              if (var2 == null) {
                                 break label236;
                              }
                           }

                           Object var44 = 487924346083543578L;
                           Ref.g(487924346083543578L, var44);
                           Object[] var127 = Registry.emptyArgs();
                           long var47 = 498856411508641826L;
                           Object[] var46 = var127;
                           var127 = Registry.packArgs(Ref.h(498856411508641826L, var46, var47), true, true);
                           long var49 = 413727787977868950L;
                           Object[] var48 = var127;
                           Ref.h(413727787977868950L, var48, var49);

                           try {
                              ;
                           } catch (InvocationTargetException var96) {
                              throw var96.getTargetException();
                           }
                        }

                        label241: {
                           Object var50 = 446500590941177335L;
                           FileBrowserAddressBar var10009 = (FileBrowserAddressBar)Ref.g(446500590941177335L, var50);
                           if (var2 == null) {
                              if (var10009 == null) {
                                 break label241;
                              }

                              Object var52 = 446500590941177335L;
                              FileBrowserAddressBar var129 = (FileBrowserAddressBar)Ref.g(446500590941177335L, var52);
                           }

                           Object[] var10011 = Registry.emptyArgs();
                           long var55 = 498856411508641826L;
                           Object[] var54 = var10011;
                           var10011 = Registry.packArgs(Ref.h(498856411508641826L, var54, var55), true);
                           long var57 = 203282927631494339L;
                           Object[] var56 = var10011;
                           Ref.h(203282927631494339L, var56, var57);

                           try {
                              ;
                           } catch (InvocationTargetException var95) {
                              throw var95.getTargetException();
                           }
                        }

                        if (var2 == null) {
                           break label183;
                        }
                     }

                     var114 = var4.getClass().equals(Ck4.class);
                  }

                  if (var114) {
                  }
               }
            }

            Object var58 = 396507593444187971L;
            var106 = ((com.finalshell.core.Km2)Ref.g(396507593444187971L, var58)).rowAtPoint(var1.getPoint());
         }

         var3 = var106;
         var1.getButton();
         var107 = 3;
      }

      if (var2 == null) {
         label174: {
            if (var107 == var10003) {
               var107 = this;
               Object var60 = 396507593444187971L;
               var10003 = ((com.finalshell.core.Km2)Ref.g(396507593444187971L, var60)).isRowSelected((int)var3);
               if (var2 == null) {
                  if (var10003 == null) {
                     Object var62 = 396507593444187971L;
                     ((com.finalshell.core.Km2)Ref.g(396507593444187971L, var62)).getSelectionModel().setSelectionInterval((int)var3, (int)var3);
                  }

                  var10003 = this;
                  Object var64 = 396507593444187971L;
                  Registry.lookupField(511537538001441169L).getBoolean(Ref.g(396507593444187971L, var64));
               }

               if (var2 != null) {
                  break label174;
               }

               if (var10003 == null) {
                  Object var66 = 396507593444187971L;
                  Ref.g(396507593444187971L, var66);
                  Object var68 = 485948784714883245L;
                  com.finalshell.core.Km2 var121 = (com.finalshell.core.Km2)Ref.g(485948784714883245L, var68);
                  Object var70 = 396507593444187971L;
                  Object var125 = Ref.g(396507593444187971L, var70);
                  Object var72 = 612091313834066062L;
                  Kl4 var130 = (Kl4)Ref.g(612091313834066062L, var72);
                  Object var74 = 487924346083543578L;
var125 = new O32(var130, this, (ConnectionInfoPanel)Ref.g(487924346083543578L, var74));
                  this.show((Component)var1.getSource(), var1.getX(), var1.getY());
               }
            }

            var107 = var1.getButton();
         }

         var10003 = true;
      }

      label167: {
         if (var107 == var10003) {
            System.currentTimeMillis();
            Object var76 = 396507593444187971L;
            long var104 = this - Registry.lookupField(363492891300853480L).getLong(Ref.g(396507593444187971L, var76));
            if (var104 > a) {
               int var105 = var1.getClickCount();
               var10003 = this;
               Object var78 = 396507593444187971L;
               Registry.lookupField(386014461835255743L).setInt(Ref.g(396507593444187971L, var78), var105);
               Object var80 = 396507593444187971L;
               int var8 = ((com.finalshell.core.Km2)Ref.g(396507593444187971L, var80)).columnAtPoint(var1.getPoint());
               Object var82 = 396507593444187971L;
               com.finalshell.core.Km2 var118 = (com.finalshell.core.Km2)Ref.g(396507593444187971L, var82);
               if (var2 != null) {
                  break label167;
               }

               int var9 = var118.convertColumnIndexToModel(var8);
               if (var9 == 0) {
                  int var119 = var105;
                  byte var122 = 1;
                  if (var2 == null) {
                     if (var105 == 1) {
                        Object var84 = 396507593444187971L;
                        Registry.lookupField(425527513845441827L).setBoolean(Ref.g(396507593444187971L, var84), false);
                        Registry.lookupField(388376917454860932L).get(null);
                        Object[] var124 = Registry.packArgs(new O32(this, (int)var3, var8));
                        long var87 = 434592463220957006L;
                        Object[] var86 = var124;
                        Ref.h(434592463220957006L, var86, var87);

                        try {
                           ;
                        } catch (InvocationTargetException var94) {
                           throw var94.getTargetException();
                        }
                     }

                     var119 = var105;
                     var122 = 2;
                  }

                  if (var119 == var122) {
                     Object var88 = 396507593444187971L;
                     Registry.lookupField(425527513845441827L).setBoolean(Ref.g(396507593444187971L, var88), true);
                  }
               }
            }
         }

         Object var90 = 396507593444187971L;
         var10003 = (com.finalshell.core.Km2)Ref.g(396507593444187971L, var90);
      }

      var10003 = ((com.finalshell.core.Km2)var10003).getCellEditor();
      if (var2 == null) {
         if (var10003 == null) {
            return;
         }

         var10003 = this;
         Object var92 = 396507593444187971L;
         ((com.finalshell.core.Km2)Ref.g(396507593444187971L, var92)).getCellEditor();
      }

      var10003.stopCellEditing();
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 2165292594098707291L;
      long var10002 = 2165292594098707281L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





