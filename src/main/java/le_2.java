import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

class Le_2 implements MouseListener {
   final JMenuItem K;
   final JMenuItem x;
   final JPopupMenu i;
   final xc_2 Y;

   Le_2(xc_2 var1, JMenuItem var2, JMenuItem var3, JPopupMenu var4) {
      this.Y = var1;
      this.K = var2;
      this.x = var3;
      this.i = var4;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      boolean var2;
      boolean var4;
      int var24;
      label205: {
         byte var3;
         int var10001;
         label206: {
            label207: {
               int var10000 = Uo_2.k();
               var3 = 1;
               var2 = (boolean)var10000;
               var4 = true;
               var10000 = var1.getButton();
               if (var2) {
                  if (var10000 != 1) {
                     var24 = var1.getButton();
                     var10001 = 3;
                     if (!var2) {
                        break label206;
                     }

                     if (var24 != 3) {
                        break label207;
                     }
                  }

                  var10000 = ((Uo_2)com.c.c(342129762932297171L).get(com.c.c(165909131428208332L).get(this))).rowAtPoint(var1.getPoint());
               }

               int var5 = var10000;
               int var6 = ((Uo_2)com.c.c(342129762932297171L).get(com.c.c(165909131428208332L).get(this))).convertRowIndexToModel(var5);
               if (var1.getButton() == 3) {
               }

               ((Uo_2)com.c.c(342129762932297171L).get(com.c.c(165909131428208332L).get(this))).getSelectionModel().setSelectionInterval(var6, var6);
               var24 = var5;
               var10001 = -1;
               if (!var2) {
                  break label206;
               }

               if (var5 > -1) {
                  Object var25 = com.c.c(435109479173232140L).get(com.c.c(165909131428208332L).get(this));
                  Object[] var46 = com.c.f();
                  Method var10003 = com.c.d(245965692335108743L);
                  Object[] var10002 = var46;
                  Object var47 = var25;
                  Method var26 = var10003;

                  try {
                     var27 = (ArrayList)var26.invoke(var47, var10002);
                  } catch (InvocationTargetException var22) {
                     throw var22.getTargetException();
                  }

                  lI_3 var7 = (lI_3)var27.get(var6);
                  lI_3 var28 = var7;
                  if (var2) {
                     if (var7 == null) {
                        return;
                     }

                     com.c.c(356967793820925117L).setInt(com.c.c(165909131428208332L).get(this), var6);
                     Object var29 = com.c.c(165909131428208332L).get(this);
                     var10002 = com.c.f();
                     Method var10004 = com.c.d(419335026051024288L);
                     Object[] var83 = var10002;
                     lI_3 var71 = var7;
                     Method var48 = var10004;

                     try {
                        var10001 = (Integer)var48.invoke(var71, var83);
                     } catch (InvocationTargetException var21) {
                        throw var21.getTargetException();
                     }

                     com.c.c(480311688723572747L).setInt(var29, var10001);
                     var28 = var7;
                  }

                  Object[] var50 = com.c.f();
                  var10003 = com.c.d(382054480216091309L);
                  var10002 = var50;
                  lI_3 var51 = var28;
                  Method var30 = var10003;

                  try {
                     var31 = (u8_2)var30.invoke(var51, var10002);
                  } catch (InvocationTargetException var20) {
                     throw var20.getTargetException();
                  }

                  u8_2 var8;
                  label185: {
                     var8 = var31;
                     label184:
                     if (var1.getButton() == 1) {
                        Object var32 = com.c.c(625890154666924805L).get(com.c.c(165909131428208332L).get(this));
                        Object[] var52 = com.c.f();
                        var10003 = com.c.d(612851846225679981L);
                        var10002 = var52;
                        Object var53 = var32;
                        Method var33 = var10003;

                        try {
                           var34 = (dG_3)var33.invoke(var53, var10002);
                        } catch (InvocationTargetException var19) {
                           throw var19.getTargetException();
                        }

                        dG_3 var9 = var34;
                        var10002 = com.c.f();
                        Method var94 = com.c.d(419335026051024288L);
                        Object[] var86 = var10002;
                        lI_3 var75 = var7;
                        Method var54 = var94;

                        try {
                           var10001 = (Integer)var54.invoke(var75, var86);
                        } catch (InvocationTargetException var18) {
                           throw var18.getTargetException();
                        }

                        Object[] var56 = com.c.a(var10001);
                        var10003 = com.c.d(296800993237687739L);
                        var10002 = var56;
                        dG_3 var57 = var9;
                        Method var35 = var10003;

                        try {
                           var36 = (t3_2)var35.invoke(var57, var10002);
                        } catch (InvocationTargetException var17) {
                           throw var17.getTargetException();
                        }

                        label181: {
                           t3_2 var10 = var36;
                           if (var2) {
                              if (var10 == null) {
                                 break label181;
                              }

                              Object[] var58 = com.c.f();
                              var10003 = com.c.d(435870864495479080L);
                              var10002 = var58;
                              dG_3 var59 = var9;
                              Method var37 = var10003;

                              try {
                                 var38 = var37.invoke(var59, var10002);
                              } catch (InvocationTargetException var16) {
                                 throw var16.getTargetException();
                              }

                              Object[] var60 = com.c.a(var10);
                              var10003 = com.c.d(176011466134249595L);
                              var10002 = var60;
                              Object var61 = var38;
                              Method var39 = var10003;

                              try {
                                 var39.invoke(var61, var10002);
                              } catch (InvocationTargetException var15) {
                                 throw var15.getTargetException();
                              }
                           }

                           if (var2) {
                              break label184;
                           }
                        }

                        var40 = var8;
                        if (!var2) {
                           break label185;
                        }

                        if (var8 != null) {
                           Object[] var62 = com.c.a(var8);
                           var10003 = com.c.d(606681976671335066L);
                           var10002 = var62;
                           dG_3 var63 = var9;
                           Method var41 = var10003;

                           try {
                              var41.invoke(var63, var10002);
                           } catch (InvocationTargetException var14) {
                              throw var14.getTargetException();
                           }
                        }
                     }

                     var40 = var8;
                  }

                  Object[] var64 = com.c.f();
                  var10003 = com.c.d(577747074549625554L);
                  var10002 = var64;
                  u8_2 var65 = var40;
                  Method var42 = var10003;

                  try {
                     var43 = (String)var42.invoke(var65, var10002);
                  } catch (InvocationTargetException var13) {
                     throw var13.getTargetException();
                  }

                  label213: {
                     label168: {
                        label214: {
                           if (var2) {
                              if (var43 == null) {
                                 break label214;
                              }

                              Object[] var66 = com.c.f();
                              var10003 = com.c.d(577747074549625554L);
                              var10002 = var66;
                              u8_2 var67 = var8;
                              Method var44 = var10003;

                              try {
                                 var43 = (String)var44.invoke(var67, var10002);
                              } catch (InvocationTargetException var12) {
                                 throw var12.getTargetException();
                              }
                           }

                           if (!var2) {
                              break label213;
                           }

                           if (!var43.equals("")) {
                              break label168;
                           }
                        }

                        var4 = false;
                     }

                     Object[] var68 = com.c.f();
                     var10003 = com.c.d(372900192662778876L);
                     var10002 = var68;
                     u8_2 var69 = var8;
                     Method var45 = var10003;

                     try {
                        var43 = (String)var45.invoke(var69, var10002);
                     } catch (InvocationTargetException var11) {
                        throw var11.getTargetException();
                     }
                  }

                  if (var43 == null) {
                     var3 = 0;
                  }
               }
            }

            var24 = var1.getButton();
            if (!var2) {
               break label205;
            }

            var10001 = 3;
         }

         if (var24 != var10001) {
            return;
         }

         var24 = var3;
      }

      label146: {
         if (var24 != 0) {
            ((JMenuItem)com.c.c(516502371225412576L).get(this)).setEnabled(true);
            if (var2) {
               break label146;
            }
         }

         ((JMenuItem)com.c.c(516502371225412576L).get(this)).setEnabled(false);
      }

      label141: {
         if (var4) {
            ((JMenuItem)com.c.c(477744390832255001L).get(this)).setEnabled(true);
            if (var2) {
               break label141;
            }
         }

         ((JMenuItem)com.c.c(477744390832255001L).get(this)).setEnabled(false);
      }

      ((JPopupMenu)com.c.c(504755468125392398L).get(this))
         .show((Uo_2)com.c.c(342129762932297171L).get(com.c.c(165909131428208332L).get(this)), var1.getX(), var1.getY());
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





