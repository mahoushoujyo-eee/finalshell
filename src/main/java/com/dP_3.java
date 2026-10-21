package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

class dP_3 implements ActionListener {
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void actionPerformed(ActionEvent var1) {
      String var10000 = com.cl_4.I();
      Object var3 = com.cl_4.V;
      synchronized (com.cl_4.V){} // $VF: monitorenter 
      String var2 = var10000;

      try {
         Iterator var4 = com.cl_4.J.iterator();

         while (true) {
            if (var4.hasNext()) {
               String var5 = (String)var4.next();
               com.cl_4.Y(var5);
               if (var2 != null) {
                  break;
               }

               if (var2 == null) {
                  continue;
               }
            }

            com.cl_4.J.clear();
            // $VF: monitorexit
            break;
         }
      } finally {
         // $VF: monitorexit
      }
   }
}





