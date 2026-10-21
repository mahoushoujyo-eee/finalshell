package com.finalshell.ui.listener;

import com.finalshell.core.Qe2_2;
import com.finalshell.ui.panel.KV3;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;

public class Sp2 implements ItemListener {
   public final Date c;
   public final KV3 Q;

   public Sp2(KV3 var1, Date var2) {
      this.Q = var1;
      this.c = var2;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      Qe2_2 var2 = (Qe2_2)var1.getSource();
      if (var2.isSelected()) {
         this.Q.J(this.c);
      }
   }
}





