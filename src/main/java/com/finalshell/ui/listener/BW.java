package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Bq2;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.lang.reflect.InvocationTargetException;

public class BW implements ComponentListener {
   public final Bq2 p;
   public final com.finalshell.ui.frame.MainFrame u;
   public final YN3 s;

   public BW(YN3 var1, Bq2 var2, com.finalshell.ui.frame.MainFrame var3) {
      this.s = var1;
      this.p = var2;
      this.u = var3;
   }

   @Override
   public void componentShown(ComponentEvent var1) {
      Point var2 = new Point();
      Point var3 = MouseInfo.getPointerInfo().getLocation();
      Object var5 = 235474809631262608L;
      Point var4 = ((Bq2)Ref.g(235474809631262608L, var5)).getLocationOnScreen();
      Object var7 = 297636157862580024L;
      int var10004 = 0 - ((com.finalshell.ui.frame.MainFrame)Ref.g(297636157862580024L, var7)).getLocationOnScreen().x;
      Object var9 = 312271273134902461L;
      Object var10006 = Ref.g(312271273134902461L, var9);
      Object var11 = 479413945485822457L;
      Object var10007 = Ref.g(479413945485822457L, var11);
      Object var13 = 161378981027509202L;
      super.x = var10006 - (var10007 + ((Point)Ref.g(161378981027509202L, var13)).x);
      Object var15 = 297636157862580024L;
      int var10008 = 0 - ((com.finalshell.ui.frame.MainFrame)Ref.g(297636157862580024L, var15)).getLocationOnScreen().y;
      Object var17 = 312271273134902461L;
      Object var10010 = Ref.g(312271273134902461L, var17);
      Object var19 = 479413945485822457L;
      Object var10011 = Ref.g(479413945485822457L, var19);
      Object var21 = 161378981027509202L;
      super.y = var10010 - (var10011 + ((Point)Ref.g(161378981027509202L, var21)).y);
      Object var23 = 297636157862580024L;
      ((com.finalshell.ui.frame.MainFrame)Ref.g(297636157862580024L, var23)).setLocation(var2);
      Object var25 = 297636157862580024L;
      Registry.packArgs(Ref.g(297636157862580024L, var25));
      long var27 = 214213921318960935L;
      Ref.h2(214213921318960935L, var27);

      try {
         ;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      Object var29 = 297636157862580024L;
      ((com.finalshell.ui.frame.MainFrame)Ref.g(297636157862580024L, var29)).removeComponentListener(this);
   }

   @Override
   public void componentResized(ComponentEvent var1) {
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
   }

   @Override
   public void componentHidden(ComponentEvent var1) {
   }
   private static Object x;
   private static Object y;
}





