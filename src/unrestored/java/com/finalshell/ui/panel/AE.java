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
      Ref.s(290595356218507398L, this, false);
   }

   @Override
   public int getDividerLocation() {
      int var1 = super.getDividerLocation();
      if (((Boolean)Ref.g(290595356218507398L, this)).booleanValue()) {
      }

      return var1;
   }

   public boolean b() {
      return ((Boolean)Ref.g(290595356218507398L, this)).booleanValue();
   }

   public void B(boolean var1) {
      Integer var6;
      Object var10002 = Registry.emptyArgs();
      long var3 = 608818074819783119L;
      Object var2 = var10002;
      var10002 = Ref.h(608818074819783119L, var2, var3);

      try {
         var6 = (Integer)var10002;
      } catch (InvocationTargetException var4) {
         throw new RuntimeException(var4.getTargetException());
      }

      Ref.s(535667801898263180L, this, var6);
      Ref.s(290595356218507398L, this, var1);
   }
}





