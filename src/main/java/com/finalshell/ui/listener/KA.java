package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.As2;
import com.finalshell.ui.panel.ShowDeletedPanel;
import com.finalshell.ui.panel.UV3;
import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JScrollPane;

public class KA implements ComponentListener {
   public final As2 e;
   public final ShowDeletedPanel X;
   public final UV3 t;

   public KA(UV3 var1, As2 var2, ShowDeletedPanel var3) {
      this.t = var1;
      this.e = var2;
      this.X = var3;
   }

   @Override
   public void componentShown(ComponentEvent var1) {
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      Object var2 = 516811165826976343L;
      Ref.g(516811165826976343L, var2);
      Object var4 = 245865577968263330L;
      JScrollPane var10002 = (JScrollPane)Ref.g(245865577968263330L, var4);
      Object var6 = 581273268055337842L;
      Object var10004 = Ref.g(581273268055337842L, var6);
      Dimension var10005 = (Dimension)(Registry.emptyArgs());
      long var9 = 560618790206606193L;
      Object var8 = var10005;
      var10005 = Ref.h(560618790206606193L, var8, var9);

      try {
         var10005 = (Dimension)var10005;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      var10004.setPreferredSize(var10005);
      Object var10 = 516811165826976343L;
      ((UV3)Ref.g(516811165826976343L, var10)).getParent().validate();
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10006 = Registry.packArgs(new com.finalshell.task.G(this));
      long var13 = 434592463220957006L;
      Object[] var12 = var10006;
      Ref.h(434592463220957006L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
   }

   @Override
   public void componentHidden(ComponentEvent var1) {
   }
}





