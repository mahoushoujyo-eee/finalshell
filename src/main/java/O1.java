import java.awt.Component;
import java.awt.Container;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JMenuBar;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;

class O1 extends MouseInputAdapter {
   Toolkit k;
   Component e;
   JMenuBar n;
   QG F;
   Container M;

   public O1(Component var1, JMenuBar var2, QG var3, Container var4) {
      com.c.c(119064898244233181L).set(this, Toolkit.getDefaultToolkit());
      com.c.c(404207294526928584L).set(this, var1);
      com.c.c(242487389787666318L).set(this, var2);
      com.c.c(486361035811796603L).set(this, var3);
      com.c.c(227260023880111667L).set(this, var4);
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      Object[] var10001 = com.c.a(var1, false);
      Method var10003 = com.c.d(393469291456928971L);
      Object[] var10002 = var10001;
      O1 var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      Object[] var10001 = com.c.a(var1, false);
      Method var10003 = com.c.d(393469291456928971L);
      Object[] var10002 = var10001;
      O1 var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      Object[] var10001 = com.c.a(var1, false);
      Method var10003 = com.c.d(393469291456928971L);
      Object[] var10002 = var10001;
      O1 var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      Object[] var10001 = com.c.a(var1, false);
      Method var10003 = com.c.d(393469291456928971L);
      Object[] var10002 = var10001;
      O1 var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      Object[] var10001 = com.c.a(var1, false);
      Method var10003 = com.c.d(393469291456928971L);
      Object[] var10002 = var10001;
      O1 var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Object[] var10001 = com.c.a(var1, false);
      Method var10003 = com.c.d(393469291456928971L);
      Object[] var10002 = var10001;
      O1 var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      Object[] var10001 = com.c.a(var1, true);
      Method var10003 = com.c.d(393469291456928971L);
      Object[] var10002 = var10001;
      O1 var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   private void K(MouseEvent var1, boolean var2) {
      Point var4;
      int var10;
      label48: {
         label51: {
            String var10000 = aA.z();
            var4 = var1.getPoint();
            Container var5 = (Container)com.c.c(227260023880111667L).get(this);
            String var3 = var10000;
            Point var6 = SwingUtilities.convertPoint((QG)com.c.c(486361035811796603L).get(this), var4, (Container)com.c.c(227260023880111667L).get(this));
            var10 = var6.y;
            if (var3 == null) {
               if (var6.y >= 0) {
                  Component var7 = SwingUtilities.getDeepestComponentAt(var5, var6.x, var6.y);
                  Component var11 = var7;
                  if (var3 == null) {
                     if (var7 == null) {
                        break label51;
                     }

                     var11 = var7;
                  }

                  var10 = var11.equals((Component)com.c.c(404207294526928584L).get(this));
                  if (var3 != null) {
                     break label48;
                  }

                  if (var10 != 0) {
                     Point var8 = SwingUtilities.convertPoint((QG)com.c.c(486361035811796603L).get(this), var4, var7);
                     var7.dispatchEvent(
                        new MouseEvent(var7, var1.getID(), var1.getWhen(), var1.getModifiers(), var8.x, var8.y, var1.getClickCount(), var1.isPopupTrigger())
                     );
                  }
                  break label51;
               }

               var10 = var6.y + ((JMenuBar)com.c.c(242487389787666318L).get(this)).getHeight();
            }

            if (var3 != null) {
               break label48;
            }

            if (var10 >= 0) {
            }
         }

         var10 = var2;
      }

      if (var10 != 0) {
         Object var12 = com.c.c(486361035811796603L).get(this);
         Object[] var10001 = com.c.a(var4);
         Method var10003 = com.c.d(500772640425106444L);
         Object[] var10002 = var10001;
         var10001 = (Object[])var12;
         Method var13 = var10003;

         try {
            var13.invoke(var10001, var10002);
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         ((QG)com.c.c(486361035811796603L).get(this)).repaint();
      }
   }
}





