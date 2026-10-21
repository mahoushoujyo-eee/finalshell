package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ConnectionInfoPanel;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeWillExpandListener;
import javax.swing.tree.ExpandVetoException;

public class LD implements TreeWillExpandListener {
   public final ConnectionInfoPanel Y;

   public LD(ConnectionInfoPanel var1) {
      this.Y = var1;
   }

   @Override
   public void treeWillExpand(TreeExpansionEvent var1) throws ExpandVetoException {
      Object var2 = 607072940737459709L;
      Ref.g(607072940737459709L, var2);
      Object[] var10002 = Registry.packArgs(var1);
      long var5 = 521558993785244327L;
      Object[] var4 = var10002;
      Ref.h(521558993785244327L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   @Override
   public void treeWillCollapse(TreeExpansionEvent var1) throws ExpandVetoException {
   }
}





