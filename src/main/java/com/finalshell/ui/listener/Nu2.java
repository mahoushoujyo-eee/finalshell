package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AA;
import com.finalshell.ui.panel.As2;
import com.finalshell.ui.panel.Connection5;
import com.finalshell.ui.panel.RouteTracePanel2;
import com.finalshell.ui.panel.Tv2;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.DefaultMutableTreeNode;

public class Nu2 implements MouseMotionListener {
   public final Connection5 J;
   public static long a;

   public Nu2(Connection5 var1) {
      this.J = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      String var2 = AA.z();
      Object var11 = 468723888490930522L;
      Connection5 var10001 = (Connection5)Ref.g(468723888490930522L, var11);
      if (var2 == null) {
         Object var13 = 624888273314831754L;
         if ((As2)Ref.g(624888273314831754L, var13) != null) {
            Object var3;
            label111: {
               var3 = false;
               Object var15 = 468723888490930522L;
               Ref.g(468723888490930522L, var15);
               Object var17 = 486701759580007258L;
               Object var10004 = (RouteTracePanel2)Ref.g(486701759580007258L, var17);
               if (var2 == null) {
                  if (var10004 == null) {
                     break label111;
                  }

                  var10004 = this;
                  Object var19 = 468723888490930522L;
                  Ref.g(468723888490930522L, var19);
                  Object var21 = 486701759580007258L;
                  RouteTracePanel2 var10006 = (RouteTracePanel2)Ref.g(486701759580007258L, var21);
               }

               var3 = ((RouteTracePanel2)var10004).isVisible();
            }

            Nu2 var91 = (Nu2)var3;
            if (var2 == null) {
               if (var3 == null) {
                  Object var23 = 468723888490930522L;
                  Ref.g(468723888490930522L, var23);
                  Object var25 = 624888273314831754L;
                  Ref.g(624888273314831754L, var25);
                  Tv2 var106 = Registry.emptyArgs();
                  long var28 = 196767746087547704L;
                  Object[] var27 = var106;
                  var106 = Ref.h(196767746087547704L, var27, var28);

                  try {
                     var106 = (Tv2)var106;
                  } catch (InvocationTargetException var83) {
                     throw var83.getTargetException();
                  }

                  var106.setVisible(false);
                  return;
               }

               var91 = this;
               Object var29 = 468723888490930522L;
               Ref.g(468723888490930522L, var29);
               Object[] var93 = Registry.packArgs(var1.getPoint());
               long var32 = 379754982100791858L;
               Object[] var31 = var93;
               var93 = Ref.h(379754982100791858L, var31, var32);

               try {
               } catch (InvocationTargetException var90) {
                  throw var90.getTargetException();
               }
            }

            Nu2 var4;
            label120: {
               var4 = var91;
               var91 = var4;
               if (var2 == null) {
                  if (var4 <= 0) {
                     Object var33 = 468723888490930522L;
                     Ref.g(468723888490930522L, var33);
                     Object var35 = 624888273314831754L;
                     Ref.g(624888273314831754L, var35);
                     Tv2 var103 = Registry.emptyArgs();
                     long var38 = 196767746087547704L;
                     Object[] var37 = var103;
                     var103 = Ref.h(196767746087547704L, var37, var38);

                     try {
                        var103 = (Tv2)var103;
                     } catch (InvocationTargetException var84) {
                        throw var84.getTargetException();
                     }

                     var103.setVisible(false);
                     return;
                  }

                  var91 = this;
                  Object var39 = 468723888490930522L;
                  Ref.g(468723888490930522L, var39);
                  Object var41 = 593306439561595691L;
                  Connection5 var95 = (Connection5)Ref.g(593306439561595691L, var41);
                  if (var2 != null) {
                     break label120;
                  }

                  int var96 = var95.getWidth() - var1.getX();
               }

               if (var91 < 5) {
                  Object var43 = 468723888490930522L;
                  Ref.g(468723888490930522L, var43);
                  Object var45 = 624888273314831754L;
                  Ref.g(624888273314831754L, var45);
                  Tv2 var10007 = Registry.emptyArgs();
                  long var48 = 196767746087547704L;
                  Object[] var47 = var10007;
                  var10007 = Ref.h(196767746087547704L, var47, var48);

                  try {
                     var10007 = (Tv2)var10007;
                  } catch (InvocationTargetException var85) {
                     throw var85.getTargetException();
                  }

                  var10007.setVisible(false);
                  return;
               }

               Object var49 = 468723888490930522L;
               Ref.g(468723888490930522L, var49);
               Object var51 = 593306439561595691L;
               Connection5 var97 = (Connection5)Ref.g(593306439561595691L, var51);
            }

            DefaultMutableTreeNode var100 = (DefaultMutableTreeNode)(Registry.packArgs((int)var4));
            long var54 = 313360281912871059L;
            Object[] var53 = var100;
            var100 = Ref.h(313360281912871059L, var53, var54);

            try {
               var100 = (DefaultMutableTreeNode)var100;
            } catch (InvocationTargetException var89) {
               throw var89.getTargetException();
            }

            DefaultMutableTreeNode var5 = var100;
            Object var55 = 468723888490930522L;
            Ref.g(468723888490930522L, var55);
            Object var57 = 593306439561595691L;
            Rectangle var6 = ((Connection5)Ref.g(593306439561595691L, var57)).getRowBounds((int)var4);
            Object var59 = 468723888490930522L;
            Ref.g(468723888490930522L, var59);
            Object var61 = 624888273314831754L;
            Ref.g(624888273314831754L, var61);
            Tv2 var10012 = (Tv2)(Registry.emptyArgs());
            long var64 = 196767746087547704L;
            Object[] var63 = var10012;
            var10012 = Ref.h(196767746087547704L, var63, var64);

            try {
               var10012 = (Tv2)var10012;
            } catch (InvocationTargetException var88) {
               throw var88.getTargetException();
            }

            Tv2 var7 = var10012;
            int var8 = var7.getPreferredSize().width;
            Object var65 = 468723888490930522L;
            int var9 = ((Connection5)Ref.g(468723888490930522L, var65)).getWidth() - var8 + (int)a;
            Rectangle var10 = new Rectangle(var9, var6.y + (var6.height - var7.getPreferredSize().height) / 2, var8, var7.getPreferredSize().height);
            Object var67 = 468723888490930522L;
            Ref.g(468723888490930522L, var67);
            Object var69 = 624888273314831754L;
            Ref.g(624888273314831754L, var69);
            Object[] var10016 = Registry.emptyArgs();
            long var72 = 365890984302619917L;
            Object[] var71 = var10016;
            Ref.h(365890984302619917L, var71, var72);
            Object[] var10017 = Registry.packArgs(var10, var5);
            long var74 = 487349169158243555L;
            Object[] var73 = var10017;
            Ref.h(487349169158243555L, var73, var74);

            try {
               ;
            } catch (InvocationTargetException var87) {
               throw var87.getTargetException();
            }

            Object var75 = 468723888490930522L;
            Ref.g(468723888490930522L, var75);
            Object var77 = 624888273314831754L;
            Ref.g(624888273314831754L, var77);
            Tv2 var10020 = Registry.emptyArgs();
            long var80 = 196767746087547704L;
            Object[] var79 = var10020;
            var10020 = Ref.h(196767746087547704L, var79, var80);

            try {
               var10020 = (Tv2)var10020;
            } catch (InvocationTargetException var86) {
               throw var86.getTargetException();
            }

            var10020.setVisible(true);
         }

         Object var81 = 468723888490930522L;
         Connection5 var10003 = (Connection5)Ref.g(468723888490930522L, var81);
      }

      Registry.lookupField(137395258222385003L).setBoolean(var10001, false);
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      Object var2 = 468723888490930522L;
      Registry.lookupField(137395258222385003L).setBoolean(Ref.g(468723888490930522L, var2), false);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 6369184685716270362L;
      long var10002 = 7287735958193696018L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





