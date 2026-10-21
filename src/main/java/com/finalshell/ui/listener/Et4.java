package com.finalshell.ui.listener;

import com.finalshell.core.Qe2_2;
import com.finalshell.ui.panel.KV3;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;

public class Et4 implements ItemListener {
   final Date e;
   final KV3 i;

   Et4(KV3 var1, Date var2) {
      this.i = var1;
      this.e = var2;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      Qe2_2 var2 = (Qe2_2)var1.getSource();
      if (var2.isSelected()) {
         this.i.J(this.e);
      }
   }
}





