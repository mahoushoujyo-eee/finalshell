package com.finalshell.ui.listener;

import com.finalshell.core.K5_2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JTree.DropLocation;

public class P3 implements PropertyChangeListener {
   public final K5_2 K;

   public P3(K5_2 var1) {
      this.K = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      String var10000 = com.finalshell.ui.panel.S.d();
      DropLocation var3 = (DropLocation)var1.getOldValue();
      String var2 = var10000;
      DropLocation var5 = var3;
      if (var2 != null) {
         if (var3 != null) {
            K5_2.B(this.K).repaint(this.K.p(var3.getPath()));
         }

         var5 = (DropLocation)var1.getNewValue();
      }

      DropLocation var4 = var5;
      if (var4 != null) {
         K5_2.K(this.K).repaint(this.K.p(var4.getPath()));
      }
   }
}





