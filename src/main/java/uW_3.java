import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.JPopupMenu;

class uW_3 implements MouseListener {
   final JPopupMenu O;
   final O3 M;

   uW_3(O3 var1, JPopupMenu var2) {
      this.M = var1;
      this.O = var2;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int var19;
      int var10001;
      label110: {
         label113: {
            int[] var10000 = CE.S();
            boolean var3 = true;
            boolean var4 = true;
            int[] var2 = var10000;
            var19 = var1.getButton();
            if (var2 != null) {
               if (var19 != 1) {
                  var19 = var1.getButton();
                  var10001 = 3;
                  if (var2 == null) {
                     break label110;
                  }

                  if (var19 != 3) {
                     break label113;
                  }
               }

               var19 = ((UT)com.c.c(483411846868584119L).get(com.c.c(455973235717218907L).get(this))).rowAtPoint(var1.getPoint());
            }

            int var5 = var19;
            int var6 = ((UT)com.c.c(483411846868584119L).get(com.c.c(455973235717218907L).get(this))).convertRowIndexToModel(var5);
            ((UT)com.c.c(483411846868584119L).get(com.c.c(455973235717218907L).get(this))).getSelectionModel().setSelectionInterval(var5, var5);
            var19 = var5;
            var10001 = -1;
            if (var2 == null) {
               break label110;
            }

            if (var5 > -1) {
               Object var20 = com.c.c(541329565900929595L).get(com.c.c(455973235717218907L).get(this));
               Object[] var33 = com.c.f();
               Method var10003 = com.c.d(312359756468558646L);
               Object[] var10002 = var33;
               Object var34 = var20;
               Method var21 = var10003;

               try {
                  var22 = (ArrayList)var21.invoke(var34, var10002);
               } catch (InvocationTargetException var17) {
                  throw var17.getTargetException();
               }

               kw_4 var7 = (kw_4)var22.get(var6);
               com.c.c(310361548260550163L).setInt(com.c.c(455973235717218907L).get(this), var6);
               Object var23 = com.c.c(455973235717218907L).get(this);
               var10002 = com.c.f();
               Method var10004 = com.c.d(134324574424375296L);
               Object[] var58 = var10002;
               kw_4 var50 = var7;
               Method var35 = var10004;

               try {
                  var10001 = (Integer)var35.invoke(var50, var58);
               } catch (InvocationTargetException var16) {
                  throw var16.getTargetException();
               }

               com.c.c(367920313249113539L).setInt(var23, var10001);
               var19 = var1.getButton();
               var10001 = 1;
               if (var2 == null) {
                  break label110;
               }

               label99:
               if (var19 == 1) {
                  Object var24 = com.c.c(263483255831840976L).get(com.c.c(455973235717218907L).get(this));
                  Object[] var37 = com.c.f();
                  var10003 = com.c.d(129994171961210369L);
                  var10002 = var37;
                  Object var38 = var24;
                  Method var25 = var10003;

                  try {
                     var26 = (yX_3)var25.invoke(var38, var10002);
                  } catch (InvocationTargetException var15) {
                     throw var15.getTargetException();
                  }

                  yX_3 var8 = var26;
                  var10002 = com.c.f();
                  var10004 = com.c.d(539126826743258386L);
                  Object[] var60 = var10002;
                  kw_4 var53 = var7;
                  Method var39 = var10004;

                  try {
                     var40 = var39.invoke(var53, var60);
                  } catch (InvocationTargetException var14) {
                     throw var14.getTargetException();
                  }

                  Object[] var41 = com.c.a(var40);
                  var10003 = com.c.d(205706428666299254L);
                  var10002 = var41;
                  yX_3 var42 = var8;
                  Method var27 = var10003;

                  try {
                     var28 = (t3_2)var27.invoke(var42, var10002);
                  } catch (InvocationTargetException var13) {
                     throw var13.getTargetException();
                  }

                  label96: {
                     t3_2 var9 = var28;
                     if (var2 != null) {
                        if (var9 == null) {
                           break label96;
                        }

                        Object[] var43 = com.c.f();
                        var10003 = com.c.d(170300959715393981L);
                        var10002 = var43;
                        yX_3 var44 = var8;
                        Method var29 = var10003;

                        try {
                           var30 = var29.invoke(var44, var10002);
                        } catch (InvocationTargetException var12) {
                           throw var12.getTargetException();
                        }

                        Object[] var45 = com.c.a(var9);
                        var10003 = com.c.d(176011466134249595L);
                        var10002 = var45;
                        Object var46 = var30;
                        Method var31 = var10003;

                        try {
                           var31.invoke(var46, var10002);
                        } catch (InvocationTargetException var11) {
                           throw var11.getTargetException();
                        }
                     }

                     if (var2 != null) {
                        break label99;
                     }
                  }

                  Object[] var47 = com.c.a(var7);
                  var10003 = com.c.d(144196230116570335L);
                  var10002 = var47;
                  yX_3 var48 = var8;
                  Method var32 = var10003;

                  try {
                     var32.invoke(var48, var10002);
                  } catch (InvocationTargetException var10) {
                     throw var10.getTargetException();
                  }
               }
            }
         }

         var19 = var1.getButton();
         var10001 = 3;
      }

      if (var19 == var10001) {
         ((JPopupMenu)com.c.c(214842250184228339L).get(this))
            .show((UT)com.c.c(483411846868584119L).get(com.c.c(455973235717218907L).get(this)), var1.getX(), var1.getY());
      }
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





