import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.table.TableCellEditor;

class TO implements MouseListener {
   final boolean D;
   final a3 U;
   final F6 O;
   final Km_2 b;
   private static final long a;

   TO(Km_2 var1, boolean var2, a3 var3, F6 var4) {
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
         com.c.c(140993979563084749L).set(com.c.c(396507593444187971L).get(this), var1.getLocationOnScreen());
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String var2;
      int var3;
      int var29;
      byte var58;
      label249: {
         label267: {
            var2 = Km_2.U();
            var29 = var1.getButton();
            var58 = 3;
            if (var2 == null) {
               if (var29 == 3) {
                  com.c.c(493953348619799745L).set(com.c.c(396507593444187971L).get(this), var1.getLocationOnScreen());
                  Object var27 = com.c.c(396507593444187971L).get(this);
                  Object[] var56 = com.c.f();
                  Method var10003 = com.c.d(628221387193261187L);
                  Object[] var10002 = var56;
                  Object var57 = var27;
                  Method var28 = var10003;

                  try {
                     var28.invoke(var57, var10002);
                  } catch (InvocationTargetException var23) {
                     throw var23.getTargetException();
                  }
               }

               var29 = var1.getButton();
               if (var2 != null) {
                  break label267;
               }

               var58 = 1;
            }

            if (var29 == var58) {
               var3 = ((Km_2)com.c.c(396507593444187971L).get(this)).rowAtPoint(var1.getPoint());
               if (!((Km_2)com.c.c(396507593444187971L).get(this)).isRowSelected(var3)) {
               }

               var29 = var1.getClickCount();
               var58 = 2;
               if (var2 != null) {
                  break label249;
               }

               label203:
               if (var29 == 2) {
                  Object var30 = com.c.c(396507593444187971L).get(this);
                  Object[] var59 = com.c.a(var3);
                  Method var105 = com.c.d(303488344973038628L);
                  Object[] var86 = var59;
                  Object var60 = var30;
                  Method var31 = var105;

                  try {
                     var32 = var31.invoke(var60, var86);
                  } catch (InvocationTargetException var22) {
                     throw var22.getTargetException();
                  }

                  Object var4 = var32;
                  boolean var33 = var4.getClass().equals(tf_4.class);
                  if (var2 == null) {
                     if (var33) {
                        tf_4 var5 = (tf_4)var4;
                        Object[] var34 = com.c.f();
                        Method var35 = com.c.d(454647487873911743L);
                        var86 = var34;
                        Object var62 = null;

                        try {
                           var33 = (Boolean)var35.invoke(var62, var86);
                        } catch (InvocationTargetException var21) {
                           throw var21.getTargetException();
                        }

                        label256: {
                           label257: {
                              label258: {
                                 label259: {
                                    if (var2 == null) {
                                       if (!var33) {
                                          break label257;
                                       }

                                       var37 = this;
                                       if (var2 != null) {
                                          break label259;
                                       }

                                       var33 = com.c.c(332277969307150886L).getBoolean(this);
                                    }

                                    if (var33) {
                                       break label258;
                                    }

                                    var37 = this;
                                 }

                                 Object var38 = com.c.c(487924346083543578L).get(var37);
                                 var86 = com.c.f();
                                 Method var10004 = com.c.d(498856411508641826L);
                                 Object[] var106 = var86;
                                 tf_4 var90 = var5;
                                 Method var63 = var10004;

                                 try {
                                    var64 = var63.invoke(var90, var106);
                                 } catch (InvocationTargetException var20) {
                                    throw var20.getTargetException();
                                 }

                                 Object[] var65 = com.c.a(var64, true, true);
                                 var105 = com.c.d(413727787977868950L);
                                 var86 = var65;
                                 Object var66 = var38;
                                 Method var39 = var105;

                                 try {
                                    var39.invoke(var66, var86);
                                 } catch (InvocationTargetException var19) {
                                    throw var19.getTargetException();
                                 }

                                 if (var2 == null) {
                                    break label256;
                                 }
                              }

                              Object[] var67 = com.c.f();
                              var105 = com.c.d(498856411508641826L);
                              var86 = var67;
                              tf_4 var68 = var5;
                              Method var40 = var105;

                              try {
                                 var41 = (String)var40.invoke(var68, var86);
                              } catch (InvocationTargetException var18) {
                                 throw var18.getTargetException();
                              }

                              String var6 = var41;
                              File var7 = new File(var6);
                              Object[] var42 = com.c.a(var7);
                              Method var43 = com.c.d(401544505347980134L);
                              var86 = var42;
                              Object var70 = null;

                              try {
                                 var33 = (Boolean)var43.invoke(var70, var86);
                              } catch (InvocationTargetException var17) {
                                 throw var17.getTargetException();
                              }

                              if (!var33) {
                                 Object var45 = com.c.c(487924346083543578L).get(this);
                                 var86 = com.c.f();
                                 Method var116 = com.c.d(498856411508641826L);
                                 Object[] var109 = var86;
                                 tf_4 var96 = var5;
                                 Method var71 = var116;

                                 try {
                                    var72 = var71.invoke(var96, var109);
                                 } catch (InvocationTargetException var16) {
                                    throw var16.getTargetException();
                                 }

                                 Object[] var73 = com.c.a(var72, true, true);
                                 var105 = com.c.d(413727787977868950L);
                                 var86 = var73;
                                 Object var74 = var45;
                                 Method var46 = var105;

                                 try {
                                    var46.invoke(var74, var86);
                                 } catch (InvocationTargetException var15) {
                                    throw var15.getTargetException();
                                 }
                              }

                              if (var2 == null) {
                                 break label256;
                              }
                           }

                           Object var47 = com.c.c(487924346083543578L).get(this);
                           var86 = com.c.f();
                           Method var117 = com.c.d(498856411508641826L);
                           Object[] var111 = var86;
                           tf_4 var99 = var5;
                           Method var75 = var117;

                           try {
                              var76 = var75.invoke(var99, var111);
                           } catch (InvocationTargetException var14) {
                              throw var14.getTargetException();
                           }

                           Object[] var77 = com.c.a(var76, true, true);
                           var105 = com.c.d(413727787977868950L);
                           var86 = var77;
                           Object var78 = var47;
                           Method var48 = var105;

                           try {
                              var48.invoke(var78, var86);
                           } catch (InvocationTargetException var13) {
                              throw var13.getTargetException();
                           }
                        }

                        label262: {
                           F6 var49 = (F6)com.c.c(446500590941177335L).get(this);
                           if (var2 == null) {
                              if (var49 == null) {
                                 break label262;
                              }

                              var49 = (F6)com.c.c(446500590941177335L).get(this);
                           }

                           var86 = com.c.f();
                           Method var118 = com.c.d(498856411508641826L);
                           Object[] var113 = var86;
                           tf_4 var102 = var5;
                           Method var79 = var118;

                           try {
                              var80 = var79.invoke(var102, var113);
                           } catch (InvocationTargetException var12) {
                              throw var12.getTargetException();
                           }

                           Object[] var81 = com.c.a(var80, true);
                           var105 = com.c.d(203282927631494339L);
                           var86 = var81;
                           F6 var82 = var49;
                           Method var50 = var105;

                           try {
                              var50.invoke(var82, var86);
                           } catch (InvocationTargetException var11) {
                              throw var11.getTargetException();
                           }
                        }

                        if (var2 == null) {
                           break label203;
                        }
                     }

                     var33 = var4.getClass().equals(ck_4.class);
                  }

                  if (var33) {
                  }
               }
            }

            var29 = ((Km_2)com.c.c(396507593444187971L).get(this)).rowAtPoint(var1.getPoint());
         }

         var3 = var29;
         var29 = var1.getButton();
         var58 = 3;
      }

      if (var2 == null) {
         label194: {
            if (var29 == var58) {
               var29 = ((Km_2)com.c.c(396507593444187971L).get(this)).isRowSelected(var3);
               if (var2 == null) {
                  if (var29 == 0) {
                     ((Km_2)com.c.c(396507593444187971L).get(this)).getSelectionModel().setSelectionInterval(var3, var3);
                  }

                  var29 = com.c.c(511537538001441169L).getBoolean(com.c.c(396507593444187971L).get(this));
               }

               if (var2 != null) {
                  break label194;
               }

               if (var29 != 0) {
                  nx_2 var24 = new nx_2(
                     (Km_2)com.c.c(485948784714883245L).get(com.c.c(396507593444187971L).get(this)),
                     (kl_4)com.c.c(612091313834066062L).get(com.c.c(396507593444187971L).get(this)),
                     (a3)com.c.c(487924346083543578L).get(this)
                  );
                  var24.show((Component)var1.getSource(), var1.getX(), var1.getY());
               }
            }

            var29 = var1.getButton();
         }

         var58 = 1;
      }

      label187: {
         if (var29 == var58) {
            long var25 = System.currentTimeMillis() - com.c.c(363492891300853480L).getLong(com.c.c(396507593444187971L).get(this));
            if (var25 > a) {
               int var26 = var1.getClickCount();
               com.c.c(386014461835255743L).setInt(com.c.c(396507593444187971L).get(this), var26);
               int var8 = ((Km_2)com.c.c(396507593444187971L).get(this)).columnAtPoint(var1.getPoint());
               var51 = (Km_2)com.c.c(396507593444187971L).get(this);
               if (var2 != null) {
                  break label187;
               }

               int var9 = var51.convertColumnIndexToModel(var8);
               if (var9 == 0) {
                  var29 = var26;
                  var58 = 1;
                  if (var2 == null) {
                     if (var26 == 1) {
                        com.c.c(425527513845441827L).setBoolean(com.c.c(396507593444187971L).get(this), false);
                        Object var53 = com.c.c(388376917454860932L).get(null);
                        Object[] var84 = com.c.a(new o3_2(this, var3, var8));
                        Method var115 = com.c.d(434592463220957006L);
                        Object[] var104 = var84;
                        Object var85 = var53;
                        Method var54 = var115;

                        try {
                           var54.invoke(var85, var104);
                        } catch (InvocationTargetException var10) {
                           throw var10.getTargetException();
                        }
                     }

                     var29 = var26;
                     var58 = 2;
                  }

                  if (var29 == var58) {
                     com.c.c(425527513845441827L).setBoolean(com.c.c(396507593444187971L).get(this), true);
                  }
               }
            }
         }

         var51 = (Km_2)com.c.c(396507593444187971L).get(this);
      }

      TableCellEditor var55 = var51.getCellEditor();
      if (var2 == null) {
         if (var55 == null) {
            return;
         }

         var55 = ((Km_2)com.c.c(396507593444187971L).get(this)).getCellEditor();
      }

      var55.stopCellEditing();
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   static {
      long var0 = 2165292594098707291L;
      long var10002 = 2165292594098707281L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





