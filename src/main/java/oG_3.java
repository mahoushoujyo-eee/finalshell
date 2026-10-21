import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class oG_3 extends JComponent {
   J6 V;
   xv_2 c;
   JComponent U;
   JComponent B;
   MouseMotionListener i;
   private static int[] S;

   public oG_3() {
      com.c.c(624144783403132922L).set(this, new J6());
      Method var10000 = (Method)com.c.c(624144783403132922L).get(this);
      Object[] var10001 = com.c.a(this);
      Method var10003 = com.c.d(212765592803240724L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      this.setLayout((J6)com.c.c(624144783403132922L).get(this));
   }

   public xv_2 x() {
      return (xv_2)com.c.c(146654817128359149L).get(this);
   }

   public void n(xv_2 var1, JComponent var2) {
      int[] var3 = T();
      JComponent var10000 = var2;
      if (var3 != null) {
         if (var2 != null) {
            this.remove(var2);
         }

         com.c.c(531600943936954170L).set(this, var2);
         this.add(var2);
         var10000 = (JComponent)com.c.c(492790688939709681L).get(this);
      }

      if (var3 != null) {
         if (var10000 != null) {
            this.remove((JComponent)com.c.c(492790688939709681L).get(this));
            ((JComponent)com.c.c(492790688939709681L).get(this)).removeMouseMotionListener((MouseMotionListener)com.c.c(585750342217941055L).get(this));
         }

         com.c.c(146654817128359149L).set(this, var1);
         com.c.c(492790688939709681L).set(this, (JComponent)var1);
         this.add((JComponent)com.c.c(492790688939709681L).get(this));
         com.c.c(585750342217941055L).set(this, new Vl_2(this));
         ((JComponent)com.c.c(492790688939709681L).get(this)).addMouseMotionListener((MouseMotionListener)com.c.c(585750342217941055L).get(this));
         var10000 = (JComponent)com.c.c(492790688939709681L).get(this);
      }

      var10000.addMouseListener(new aa_2(this));
      if (var3 == null) {
         com.ky_4.K(new String[5]);
      }
   }

   public void O() {
      Point var2 = MouseInfo.getPointerInfo().getLocation();
      SwingUtilities.convertPointFromScreen(var2, (JComponent)com.c.c(492790688939709681L).get(this));
      Method var10000 = (Method)com.c.c(146654817128359149L).get(this);
      Object[] var10001 = com.c.a(var2);
      Method var10003 = com.c.d(615346511791845692L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var9 = (Rectangle)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      Rectangle var3 = var9;
      int[] var10 = T();
      var10001 = (Object[])com.c.c(624144783403132922L).get(this);
      var10002 = com.c.a(var3);
      Method var10004 = com.c.d(446814861903208557L);
      Object[] var27 = var10002;
      var10002 = var10001;
      Method var18 = var10004;

      try {
         var18.invoke(var10002, var27);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      int[] var1 = var10;
      var10000 = (Method)com.c.c(146654817128359149L).get(this);
      var10001 = com.c.f();
      var10003 = com.c.d(628582821169604628L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var13 = (JComponent)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      if (var1 == null) {
         var13.setVisible(true);
      } else if (!var13.isVisible()) {
         var10000 = (Method)com.c.c(146654817128359149L).get(this);
         var10001 = com.c.f();
         var10003 = com.c.d(628582821169604628L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         label29:
         try {
            var13 = (JComponent)var10000.invoke(var10001, var10002);
            break label29;
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }
   }

   void U() {
      Point var1 = this.getMousePosition();
      ((JComponent)com.c.c(531600943936954170L).get(this)).setVisible(var1 != null);
      ((JComponent)com.c.c(492790688939709681L).get(this)).repaint();
   }

   public JComponent t() {
      return (JComponent)com.c.c(492790688939709681L).get(this);
   }

   public JComponent g() {
      return (JComponent)com.c.c(531600943936954170L).get(this);
   }

   public static void B(int[] var0) {
      S = var0;
   }

   public static int[] T() {
      return S;
   }

   static {
      if (T() == null) {
         B(new int[2]);
      }
   }
}





