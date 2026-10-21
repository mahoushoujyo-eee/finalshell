package com.finalshell.ui.listener;

import com.finalshell.core.Az2;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class KX extends FocusAdapter {
   public final Az2 J;

   public KX(Az2 var1) {
      this.J = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      this.J.N(var1);
   }
}





