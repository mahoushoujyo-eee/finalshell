package com.finalshell.ui.listener;

import com.finalshell.core.Kw4;
import com.finalshell.core.T32;
import com.finalshell.core.UT;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.CE;
import com.finalshell.ui.panel.ProcessInfoPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JPopupMenu;

public class UW3 implements MouseListener {
   public final JPopupMenu O;
   public final ProcessInfoPanel M;

   public UW3(ProcessInfoPanel var1, JPopupMenu var2) {
      this.M = var1;
      this.O = var2;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Integer var68;
      UW3 var10004;
      Object var10005;
      label95: {
         label98: {
            int[] var10000 = CE.S$arrint();
            boolean var3 = true;
            boolean var4 = true;
            int[] var2 = var10000;
            UW3 var61 = var1.getButton();
            if (var2 != null) {
               if (var61 != null) {
                  int var62 = var1.getButton();
                  if (var2 == null) {
                     break label95;
                  }

                  if (var62 != 3) {
                     break label98;
                  }
               }

               var61 = this;
               Object var10 = 455973235717218907L;
               Ref.g(455973235717218907L, var10);
               Object var12 = 483411846868584119L;
               ((UT)Ref.g(483411846868584119L, var12)).rowAtPoint(var1.getPoint());
            }

            UW3 var5 = var61;
            Object var14 = 455973235717218907L;
            Ref.g(455973235717218907L, var14);
            Object var16 = 483411846868584119L;
            int var6 = ((UT)Ref.g(483411846868584119L, var16)).convertRowIndexToModel((int)var5);
            Object var18 = 455973235717218907L;
            Ref.g(455973235717218907L, var18);
            Object var20 = 483411846868584119L;
            ((UT)Ref.g(483411846868584119L, var20)).getSelectionModel().setSelectionInterval((int)var5, (int)var5);
            var10004 = var5;
            var10005 = -1;
            if (var2 == null) {
               break label95;
            }

            if (var5 > -1) {
               var10004 = this;
               Object var22 = 455973235717218907L;
               var10005 = Ref.g(455973235717218907L, var22);
               Object var24 = 541329565900929595L;
               Ref.g(541329565900929595L, var24);
               ArrayList var10007 = Registry.emptyArgs();
               long var27 = 312359756468558646L;
               Object var26 = var10007;
               var10007 = Ref.h(312359756468558646L, var26, var27);

               try {
                  var10007 = (ArrayList)var10007;
               } catch (InvocationTargetException var60) {
                  throw var60.getTargetException();
               }

               Kw4 var7 = (Kw4)var10007.get(var6);
               Object var28 = 455973235717218907L;
               Registry.lookupField(310361548260550163L).setInt(Ref.g(455973235717218907L, var28), var6);
               Object var30 = 455973235717218907L;
               Ref.g(455973235717218907L, var30);
               Object var10011 = Registry.emptyArgs();
               long var33 = 134324574424375296L;
               Object var32 = var10011;
               var10011 = Ref.h(134324574424375296L, var32, var33);

               try {
                  var68 = (Integer)var10011;
               } catch (InvocationTargetException var59) {
                  throw var59.getTargetException();
               }

               Registry.lookupField(367920313249113539L).setInt(var7, var68);
               int var10010 = var1.getButton();
               if (var2 == null) {
                  break label95;
               }

               label84:
               if (var10010 == 1) {
                  Object var34 = 455973235717218907L;
                  Ref.g(455973235717218907L, var34);
                  Object var36 = 263483255831840976L;
                  Ref.g(263483255831840976L, var36);
                  Object[] var10013 = Registry.emptyArgs();
                  long var39 = 129994171961210369L;
                  Object[] var38 = var10013;
                  Ref.h(129994171961210369L, var38, var39);

                  try {
                     ;
                  } catch (InvocationTargetException var58) {
                     throw var58.getTargetException();
                  }

                  T32 var10015 = (T32)(Registry.emptyArgs());
                  long var41 = 539126826743258386L;
                  Object var40 = var10015;
                  var10015 = Registry.packArgs(Ref.h(539126826743258386L, var40, var41));
                  long var43 = 205706428666299254L;
                  Object var42 = var10015;
                  var10015 = Ref.h(205706428666299254L, var42, var43);

                  try {
                     var10015 = (T32)var10015;
                  } catch (InvocationTargetException var57) {
                     throw var57.getTargetException();
                  }

                  label81: {
                     T32 var9 = var10015;
                     if (var2 != null) {
                        if (var9 == null) {
                           break label81;
                        }

                        Object[] var10016 = Registry.emptyArgs();
                        long var45 = 170300959715393981L;
                        Object[] var44 = var10016;
                        Ref.h(170300959715393981L, var44, var45);
                        Object[] var10017 = Registry.packArgs(var9);
                        long var47 = 176011466134249595L;
                        Object[] var46 = var10017;
                        Ref.h(176011466134249595L, var46, var47);

                        try {
                           ;
                        } catch (InvocationTargetException var56) {
                           throw var56.getTargetException();
                        }
                     }

                     if (var2 != null) {
                        break label84;
                     }
                  }

                  Object[] var72 = Registry.packArgs(var7);
                  long var49 = 144196230116570335L;
                  Object[] var48 = var72;
                  Ref.h(144196230116570335L, var48, var49);
               }
            }
         }

         var10004 = (UW3)(var1.getButton());
         var10005 = 3;
      }

      if (var10004 == var10005) {
         Object var50 = 214842250184228339L;
         var10005 = (JPopupMenu)Ref.g(214842250184228339L, var50);
         Object var52 = 455973235717218907L;
         Object var66 = Ref.g(455973235717218907L, var52);
         Object var54 = 483411846868584119L;
         var66.show((UT)Ref.g(483411846868584119L, var54), var1.getX(), var1.getY());
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





