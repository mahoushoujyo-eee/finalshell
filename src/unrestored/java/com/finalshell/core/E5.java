package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.event.MouseWheelEvent;
import org.jetbrains.annotations.NotNull;

public final class E5 extends Eo2 {
   public final MouseWheelEvent o;

   public E5(@NotNull MouseWheelEvent var1) {
   super(EW.c(var1), EW.c(var1));
      EW.V();
      this.o = var1;
      if (Ky4.F$arrString() != null) {
         EW.F("cUaUsc");
      }
   }

   @Override
   public String toString() {
      return this.o.toString();
   }
}





