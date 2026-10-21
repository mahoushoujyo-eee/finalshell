package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.QG;
import java.awt.Component;
import java.awt.Container;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JMenuBar;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;

public class O1 extends MouseInputAdapter {
   public Toolkit k;
   public Component e;
   public JMenuBar n;
   public QG F;
   public Container M;

   public O1(Component var1, JMenuBar var2, QG var3, Container var4) {
      Toolkit var10001 = Toolkit.getDefaultToolkit();
      long var6 = 119064898244233181L;
      Toolkit var5 = var10001;
      Ref.s(119064898244233181L, var5, var6);
      long var8 = 404207294526928584L;
      Ref.s(404207294526928584L, var1, var8);
      long var10 = 242487389787666318L;
      Ref.s(242487389787666318L, var2, var10);
      long var12 = 486361035811796603L;
      Ref.s(486361035811796603L, var3, var12);
      long var14 = 227260023880111667L;
      Ref.s(227260023880111667L, var4, var14);
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      Object[] var10001 = Registry.packArgs(var1, false);
      long var3 = 393469291456928971L;
      Object[] var2 = var10001;
      Ref.h(393469291456928971L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      Object[] var10001 = Registry.packArgs(var1, false);
      long var3 = 393469291456928971L;
      Object[] var2 = var10001;
      Ref.h(393469291456928971L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      Object[] var10001 = Registry.packArgs(var1, false);
      long var3 = 393469291456928971L;
      Object[] var2 = var10001;
      Ref.h(393469291456928971L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      Object[] var10001 = Registry.packArgs(var1, false);
      long var3 = 393469291456928971L;
      Object[] var2 = var10001;
      Ref.h(393469291456928971L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      Object[] var10001 = Registry.packArgs(var1, false);
      long var3 = 393469291456928971L;
      Object[] var2 = var10001;
      Ref.h(393469291456928971L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Object[] var10001 = Registry.packArgs(var1, false);
      long var3 = 393469291456928971L;
      Object[] var2 = var10001;
      Ref.h(393469291456928971L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      Object[] var10001 = Registry.packArgs(var1, true);
      long var3 = 393469291456928971L;
      Object[] var2 = var10001;
      Ref.h(393469291456928971L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void K(MouseEvent var1, boolean var2) {
      Point var4;
      Component var10003;
      label48: {
         label51: {
            com.finalshell.ui.panel.AA.z();
            var4 = var1.getPoint();
            Object var9 = 227260023880111667L;
            Container var5 = (Container)Ref.g(227260023880111667L, var9);
            Object var11 = 486361035811796603L;
            QG var10002 = (QG)Ref.g(486361035811796603L, var11);
            Object var13 = 227260023880111667L;
            Point var6 = SwingUtilities.convertPoint(var4, this, (Container)Ref.g(227260023880111667L, var13));
            var10003 = (Component)(var6.y);
            if (this == null) {
               if (var6.y >= 0) {
                  Component var7 = SwingUtilities.getDeepestComponentAt(var5, var6.x, var6.y);
                  var10003 = var7;
                  if (this == null) {
                     if (var7 == null) {
                        break label51;
                     }

                     var10003 = var7;
                  }

                  Object var17 = 404207294526928584L;
                  boolean var28 = this.equals((Component)Ref.g(404207294526928584L, var17));
                  if (this != null) {
                     break label48;
                  }

                  if (var28) {
                     Object var19 = 486361035811796603L;
                     Point var8 = SwingUtilities.convertPoint((QG)Ref.g(486361035811796603L, var19), var4, var7);
                     var7.dispatchEvent(
                        new MouseEvent(var7, var1.getID(), var1.getWhen(), var1.getModifiers(), var8.x, var8.y, var1.getClickCount(), var1.isPopupTrigger())
                     );
                  }
                  break label51;
               }

               var10003 = (Component)(var6.y);
               Object var15 = 242487389787666318L;
               int var10004 = 0 + ((JMenuBar)Ref.g(242487389787666318L, var15)).getHeight();
            }

            if (this != null) {
               break label48;
            }

            if (var10003 >= 0) {
            }
         }

         var10003 = (Component)var2;
      }

      if (var10003 == null) {
         Object var21 = 486361035811796603L;
         Ref.g(486361035811796603L, var21);
         Object[] var10005 = Registry.packArgs(var4);
         long var24 = 500772640425106444L;
         Object[] var23 = var10005;
         Ref.h(500772640425106444L, var23, var24);

         try {
            ;
         } catch (InvocationTargetException var27) {
            throw var27.getTargetException();
         }

         Object var25 = 486361035811796603L;
         ((QG)Ref.g(486361035811796603L, var25)).repaint();
      }
   }
}





