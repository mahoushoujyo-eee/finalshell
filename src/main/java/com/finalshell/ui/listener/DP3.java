package com.finalshell.ui.listener;

import com.finalshell.core.Cl4_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

public class DP3 implements ActionListener {
   DP3() {
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void actionPerformed(ActionEvent var1) {
      String var10000 = Cl4_2.I();
      Object var3 = Cl4_2.V;
      synchronized (Cl4_2.V){} // $VF: monitorenter 
      String var2 = var10000;

      try {
         Iterator var4 = Cl4_2.J.iterator();

         while (true) {
            if (var4.hasNext()) {
               String var5 = (String)var4.next();
               Cl4_2.Y(var5);
               if (var2 != null) {
                  break;
               }

               if (var2 == null) {
                  continue;
               }
            }

            Cl4_2.J.clear();
            // $VF: monitorexit
            break;
         }
      } finally {
         // $VF: monitorexit
      }
   }
}





