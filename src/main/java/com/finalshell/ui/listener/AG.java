package com.finalshell.ui.listener;

import com.finalshell.core.FX3;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.RouteTracePanel3;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JPopupMenu;

public class AG implements ActionListener {
   public final FX3 q;
   public final String D;
   public final JPopupMenu N;
   public final com.finalshell.ui.panel.W8 S;
   public final RouteTracePanel3 m;

   public AG(RouteTracePanel3 var1, FX3 var2, String var3, JPopupMenu var4, com.finalshell.ui.panel.W8 var5) {
      this.m = var1;
      this.q = var2;
      this.D = var3;
      this.N = var4;
      this.S = var5;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var4 = 199036356961837208L;
      Ref.g(199036356961837208L, var4);
      Object var6 = 308573825510407868L;
      Object[] var10003 = Registry.packArgs(Ref.g(308573825510407868L, var6));
      long var9 = 452642608051992089L;
      Object[] var8 = var10003;
      Ref.h(452642608051992089L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      Object var10 = 352329716694519879L;
      Ref.g(352329716694519879L, var10);
      Object[] var10005 = Registry.emptyArgs();
      long var13 = 136665046032231527L;
      Object[] var12 = var10005;
      Ref.h(136665046032231527L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      Object var14 = 398950747833943895L;
      JPopupMenu var10006 = (JPopupMenu)Ref.g(398950747833943895L, var14);
      Object var16 = 249387698434160646L;
      this.remove((com.finalshell.ui.panel.W8)Ref.g(249387698434160646L, var16));
      Object var18 = 398950747833943895L;
      ((JPopupMenu)Ref.g(398950747833943895L, var18)).validate();
      Object var20 = 398950747833943895L;
      ((JPopupMenu)Ref.g(398950747833943895L, var20)).pack();
      Object var22 = 398950747833943895L;
      Dimension var2 = ((JPopupMenu)Ref.g(398950747833943895L, var22)).getPreferredSize();
      Object var24 = 352329716694519879L;
      Ref.g(352329716694519879L, var24);
      Object var26 = 308573825510407868L;
      Object[] var10013 = Registry.packArgs(Ref.g(308573825510407868L, var26));
      long var29 = 399675325010309536L;
      Object[] var28 = var10013;
      var10013 = Ref.h(399675325010309536L, var28, var29);

      try {
         var10013 = (com.finalshell.ui.panel.W8)var10013;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      com.finalshell.ui.panel.W8 var3 = var10013;
      Object var30 = 352329716694519879L;
      Ref.g(352329716694519879L, var30);
      Object var32 = 375737987500155781L;
      ((ArrayList)Ref.g(375737987500155781L, var32)).remove(var3);
   }
}





