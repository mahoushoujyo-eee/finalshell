package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AppendCarriageReturnCRPanel;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JSplitPane;

public class TR3 implements PropertyChangeListener {
   public final AppendCarriageReturnCRPanel Y;

   public TR3(AppendCarriageReturnCRPanel var1) {
      this.Y = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      Registry.emptyArgs();
      long var4 = 270389152141252877L;
      Ref.h2(270389152141252877L, var4);
      Object[] var10002 = Registry.emptyArgs();
      long var7 = 306266403902896148L;
      Object[] var6 = var10002;
      Ref.h(306266403902896148L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      Object var8 = 219089076937185728L;
      Ref.g(219089076937185728L, var8);
      Object var10 = 256433469970092898L;
      int var3 = ((JSplitPane)Ref.g(256433469970092898L, var10)).getDividerLocation();
      Object[] var10005 = Registry.packArgs(var3);
      long var13 = 456655109771838364L;
      Object[] var12 = var10005;
      Ref.h(456655109771838364L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }
   }
}





