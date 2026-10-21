package com.finalshell.ui.panel;

import com.finalshell.core.J6;
import com.finalshell.core.Xv2_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.Aa2;
import com.finalshell.ui.listener.Vl2;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class OG3 extends JComponent {
   public J6 V;
   public Xv2_2 c;
   public JComponent U;
   public JComponent B;
   public MouseMotionListener i;
   public static int[] S;

   public OG3() {
      J6 var10001 = new J6();
      long var2 = 624144783403132922L;
      J6 var1 = var10001;
      Ref.s(624144783403132922L, var1, var2);
      Object var3 = 624144783403132922L;
      Ref.g(624144783403132922L, var3);
      Object[] var10003 = Registry.packArgs(this);
      long var6 = 212765592803240724L;
      Object[] var5 = var10003;
      Ref.h(212765592803240724L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      Object var7 = 624144783403132922L;
      this.setLayout((J6)Ref.g(624144783403132922L, var7));
   }

   public Xv2_2 x() {
      Object var1 = 146654817128359149L;
      return (Xv2_2)Ref.g(146654817128359149L, var1);
   }

   public void n(Xv2_2 var1, JComponent var2) {
      int[] var3 = T();
      Object var10000 = var2;
      if (var3 != null) {
         if (var2 != null) {
            this.remove(var2);
         }

         var10000 = this;
         long var5 = 531600943936954170L;
         Ref.s(531600943936954170L, var2, var5);
         this.add(var2);
         Object var6 = 492790688939709681L;
         JComponent var10002 = (JComponent)Ref.g(492790688939709681L, var6);
      }

      if (var3 != null) {
         if (var10000 != null) {
            Object var8 = 492790688939709681L;
            this.remove((JComponent)Ref.g(492790688939709681L, var8));
            Object var10 = 492790688939709681L;
            JComponent var28 = (JComponent)Ref.g(492790688939709681L, var10);
            Object var12 = 585750342217941055L;
            this.removeMouseMotionListener((MouseMotionListener)Ref.g(585750342217941055L, var12));
         }

         var10000 = this;
         long var15 = 146654817128359149L;
         Ref.s(146654817128359149L, var1, var15);
         JComponent var29 = (JComponent)var1;
         long var17 = 492790688939709681L;
         JComponent var16 = var29;
         Ref.s(492790688939709681L, var16, var17);
         Object var18 = 492790688939709681L;
         this.add((JComponent)Ref.g(492790688939709681L, var18));
         Vl2 var10004 = new Vl2(this);
         long var21 = 585750342217941055L;
         Vl2 var20 = var10004;
         Ref.s(585750342217941055L, var20, var21);
         Object var22 = 492790688939709681L;
         JComponent var10005 = (JComponent)Ref.g(492790688939709681L, var22);
         Object var24 = 585750342217941055L;
         this.addMouseMotionListener((MouseMotionListener)Ref.g(585750342217941055L, var24));
         Object var26 = 492790688939709681L;
         JComponent var10007 = (JComponent)Ref.g(492790688939709681L, var26);
      }

      var10000.addMouseListener(new Aa2(this));
      if (var3 == null) {
         Ky4.K(new String[5]);
      }
   }

   public void O() {
      Point var2 = MouseInfo.getPointerInfo().getLocation();
      Object var4 = 492790688939709681L;
      SwingUtilities.convertPointFromScreen(this, (JComponent)Ref.g(492790688939709681L, var4));
      Object var6 = 146654817128359149L;
      Ref.g(146654817128359149L, var6);
      Rectangle var10003 = (Rectangle)(Registry.packArgs(var2));
      long var9 = 615346511791845692L;
      Object[] var8 = var10003;
      var10003 = Ref.h(615346511791845692L, var8, var9);

      try {
         var10003 = (Rectangle)var10003;
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      Rectangle var3 = var10003;
      T();
      Object var10 = 624144783403132922L;
      Object var10005 = Ref.g(624144783403132922L, var10);
      Object[] var10006 = Registry.packArgs(var3);
      long var13 = 446814861903208557L;
      Object[] var12 = var10006;
      Ref.h(446814861903208557L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      Object var1 = var10005;
      Object var14 = 146654817128359149L;
      Ref.g(146654817128359149L, var14);
      JComponent var10007 = Registry.emptyArgs();
      long var17 = 628582821169604628L;
      Object[] var16 = var10007;
      var10007 = Ref.h(628582821169604628L, var16, var17);

      try {
         var10007 = (JComponent)var10007;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      if (var1 == null) {
         var10007.setVisible(true);
      } else if (!var10007.isVisible()) {
         var10007 = this;
         Object var18 = 146654817128359149L;
         Ref.g(146654817128359149L, var18);
         Object[] var10009 = Registry.emptyArgs();
         long var21 = 628582821169604628L;
         Object[] var20 = var10009;
         Ref.h(628582821169604628L, var20, var21);

         label29:
         try {
            break label29;
         } catch (InvocationTargetException var22) {
            throw var22.getTargetException();
         }
      }
   }

   public void U() {
      Point var1 = this.getMousePosition();
      Object var2 = 531600943936954170L;
      ((JComponent)Ref.g(531600943936954170L, var2)).setVisible(var1 != null);
      Object var4 = 492790688939709681L;
      ((JComponent)Ref.g(492790688939709681L, var4)).repaint();
   }

   public JComponent t() {
      Object var1 = 492790688939709681L;
      return (JComponent)Ref.g(492790688939709681L, var1);
   }

   public JComponent g() {
      Object var1 = 531600943936954170L;
      return (JComponent)Ref.g(531600943936954170L, var1);
   }

   public static void B(int[] var0) {
      S = var0;
   }

   public static int[] T() {
      return S;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (T() == null) {
         B(new int[2]);
      }
   }
}





