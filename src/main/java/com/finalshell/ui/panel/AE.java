package com.finalshell.ui.panel;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JSplitPane;

public class AE extends JSplitPane {
   public boolean N;
   public int s;

   public AE(int var1) {
      super(var1);
      Registry.lookupField(290595356218507398L).setBoolean(this, false);
   }

   @Override
   public int getDividerLocation() {
      int var1 = super.getDividerLocation();
      if (Registry.lookupField(290595356218507398L).getBoolean(this)) {
      }

      return var1;
   }

   public boolean b() {
      return Registry.lookupField(290595356218507398L).getBoolean(this);
   }

   public void B(boolean var1) {
      Object[] var10002 = Registry.emptyArgs();
      long var3 = 608818074819783119L;
      Object[] var2 = var10002;
      var10002 = Ref.h(608818074819783119L, var2, var3);

      try {
         var6 = (Integer)var10002;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      Registry.lookupField(535667801898263180L).setInt(this, var6);
      Registry.lookupField(290595356218507398L).setBoolean(this, var1);
   }
}





