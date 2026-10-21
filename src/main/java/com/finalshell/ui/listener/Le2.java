package com.finalshell.ui.listener;

import com.finalshell.core.LI3_2;
import com.finalshell.core.T32;
import com.finalshell.core.U82;
import com.finalshell.core.Uo2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.TerminateProcessPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class Le2 implements MouseListener {
   final JMenuItem K;
   final JMenuItem x;
   final JPopupMenu i;
   final TerminateProcessPanel Y;

   Le2(TerminateProcessPanel var1, JMenuItem var2, JMenuItem var3, JPopupMenu var4) {
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
      Le2 var10004;
      label195: {
         Object var3;
         byte var10005;
         label196: {
            label197: {
               int var10000 = (Uo2.k()) ? 1 : 0;
               var3 = true;
               var2 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
               var4 = true;
               Le2 var83 = var1.getButton();
               if (var2) {
                  if (var83 != 1) {
                     var10000 = var1.getButton();
                     if (!var2) {
                        break label196;
                     }

                     if (var10000 != 3) {
                        break label197;
                     }
                  }

                  var83 = this;
                  Object var11 = 165909131428208332L;
                  Ref.g(165909131428208332L, var11);
                  Object var13 = 342129762932297171L;
                  ((Uo2)Ref.g(342129762932297171L, var13)).rowAtPoint(var1.getPoint());
               }

               Le2 var5 = var83;
               Object var15 = 165909131428208332L;
               Ref.g(165909131428208332L, var15);
               Object var17 = 342129762932297171L;
               int var6 = ((Uo2)Ref.g(342129762932297171L, var17)).convertRowIndexToModel((int)var5);
               if (var1.getButton() == 3) {
               }

               Object var19 = 165909131428208332L;
               Ref.g(165909131428208332L, var19);
               Object var21 = 342129762932297171L;
               ((Uo2)Ref.g(342129762932297171L, var21)).getSelectionModel().setSelectionInterval(var6, var6);
               var10004 = var5;
               var10005 = -1;
               if (!var2) {
                  break label196;
               }

               if (var5 > -1) {
                  Object var23 = 165909131428208332L;
                  Ref.g(165909131428208332L, var23);
                  Object var25 = 435109479173232140L;
                  Ref.g(435109479173232140L, var25);
                  ArrayList var10007 = Registry.emptyArgs();
                  long var28 = 245965692335108743L;
                  Object[] var27 = var10007;
                  var10007 = Ref.h(245965692335108743L, var27, var28);

                  try {
                     var10007 = (ArrayList)var10007;
                  } catch (InvocationTargetException var82) {
                     throw var82.getTargetException();
                  }

                  LI3_2 var7 = (LI3_2)var10007.get(var6);
                  if (var2) {
                     if (var7 == null) {
                        return;
                     }

                     Object var29 = 165909131428208332L;
                     Registry.lookupField(356967793820925117L).setInt(Ref.g(165909131428208332L, var29), var6);
                     Object var31 = 165909131428208332L;
                     Ref.g(165909131428208332L, var31);
                     Object[] var10011 = Registry.emptyArgs();
                     long var34 = 419335026051024288L;
                     Object[] var33 = var10011;
                     var10011 = Ref.h(419335026051024288L, var33, var34);

                     try {
                        var95 = (Integer)var10011;
                     } catch (InvocationTargetException var81) {
                        throw var81.getTargetException();
                     }

                     Registry.lookupField(480311688723572747L).setInt(var7, var95);
                  }

                  U82 var10008 = (U82)(Registry.emptyArgs());
                  long var36 = 382054480216091309L;
                  Object[] var35 = var10008;
                  var10008 = Ref.h(382054480216091309L, var35, var36);

                  try {
                     var10008 = (U82)var10008;
                  } catch (InvocationTargetException var80) {
                     throw var80.getTargetException();
                  }

                  U82 var8;
                  var8 = var10008;
                  label174:
                  if (var1.getButton() == 1) {
                     Object var37 = 165909131428208332L;
                     Ref.g(165909131428208332L, var37);
                     Object var39 = 625890154666924805L;
                     Ref.g(625890154666924805L, var39);
                     Object[] var96 = Registry.emptyArgs();
                     long var42 = 612851846225679981L;
                     Object[] var41 = var96;
                     Ref.h(612851846225679981L, var41, var42);

                     try {
                        ;
                     } catch (InvocationTargetException var79) {
                        throw var79.getTargetException();
                     }

                     Object[] var10013 = Registry.emptyArgs();
                     long var44 = 419335026051024288L;
                     Object[] var43 = var10013;
                     var10013 = Ref.h(419335026051024288L, var43, var44);

                     try {
                        var98 = (Integer)var10013;
                     } catch (InvocationTargetException var78) {
                        throw var78.getTargetException();
                     }

                     var10013 = Registry.packArgs(var98);
                     long var46 = 296800993237687739L;
                     Object[] var45 = var10013;
                     var10013 = Ref.h(296800993237687739L, var45, var46);

                     try {
                        var10013 = (T32)var10013;
                     } catch (InvocationTargetException var77) {
                        throw var77.getTargetException();
                     }

                     label171: {
                        T32 var10 = var10013;
                        if (var2) {
                           if (var10 == null) {
                              break label171;
                           }

                           Object[] var10014 = Registry.emptyArgs();
                           long var48 = 435870864495479080L;
                           Object[] var47 = var10014;
                           Ref.h(435870864495479080L, var47, var48);
                           Object[] var10015 = Registry.packArgs(var10);
                           long var50 = 176011466134249595L;
                           Object[] var49 = var10015;
                           Ref.h(176011466134249595L, var49, var50);

                           try {
                              ;
                           } catch (InvocationTargetException var76) {
                              throw var76.getTargetException();
                           }
                        }

                        if (var2) {
                           break label174;
                        }
                     }

                     if (var2 && var8 != null) {
                        Object[] var102 = Registry.packArgs(var8);
                        long var52 = 606681976671335066L;
                        Object[] var51 = var102;
                        Ref.h(606681976671335066L, var51, var52);
                     }
                  }

                  String var10009 = (String)(Registry.emptyArgs());
                  long var54 = 577747074549625554L;
                  Object[] var53 = var10009;
                  var10009 = Ref.h(577747074549625554L, var53, var54);

                  try {
                     var10009 = (String)var10009;
                  } catch (InvocationTargetException var75) {
                     throw var75.getTargetException();
                  }

                  label202: {
                     label158: {
                        label203: {
                           if (var2) {
                              if (var10009 == null) {
                                 break label203;
                              }

                              var10009 = var8;
                              Object[] var10010 = Registry.emptyArgs();
                              long var56 = 577747074549625554L;
                              Object[] var55 = var10010;
                              Ref.h(577747074549625554L, var55, var56);

                              try {
                                 ;
                              } catch (InvocationTargetException var74) {
                                 throw var74.getTargetException();
                              }
                           }

                           if (!var2) {
                              break label202;
                           }

                           if (!var10009.equals("")) {
                              break label158;
                           }
                        }

                        var4 = false;
                     }

                     var10009 = var8;
                     Object[] var93 = Registry.emptyArgs();
                     long var58 = 372900192662778876L;
                     Object[] var57 = var93;
                     Ref.h(372900192662778876L, var57, var58);

                     try {
                        ;
                     } catch (InvocationTargetException var73) {
                        throw var73.getTargetException();
                     }
                  }

                  if (var10009 == null) {
                     var3 = false;
                  }
               }
            }

            var10004 = var1.getButton();
            if (!var2) {
               break label195;
            }

            var10005 = 3;
         }

         if (var10004 != var10005) {
            return;
         }

         var10004 = (Le2)var3;
      }

      label136: {
         if (var10004 != false) {
            Object var59 = 516502371225412576L;
            ((JMenuItem)Ref.g(516502371225412576L, var59)).setEnabled(true);
            if (var2) {
               break label136;
            }
         }

         Object var61 = 516502371225412576L;
         ((JMenuItem)Ref.g(516502371225412576L, var61)).setEnabled(false);
      }

      label131: {
         if (var4) {
            Object var63 = 477744390832255001L;
            ((JMenuItem)Ref.g(477744390832255001L, var63)).setEnabled(true);
            if (var2) {
               break label131;
            }
         }

         Object var65 = 477744390832255001L;
         ((JMenuItem)Ref.g(477744390832255001L, var65)).setEnabled(false);
      }

      Object var67 = 504755468125392398L;
      JPopupMenu var87 = (JPopupMenu)Ref.g(504755468125392398L, var67);
      Object var69 = 165909131428208332L;
      Object var92 = Ref.g(165909131428208332L, var69);
      Object var71 = 342129762932297171L;
      var92.show((Uo2)Ref.g(342129762932297171L, var71), var1.getX(), var1.getY());
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





