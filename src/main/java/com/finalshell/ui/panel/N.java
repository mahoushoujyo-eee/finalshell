package com.finalshell.ui.panel;

import com.finalshell.core.It4;
import com.finalshell.core.PN3;
import com.finalshell.core.WH3;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;

public class N extends Cn2 {
   public N(@NotNull PN3 var1, @NotNull Function var2) {
      super(var1, var2::apply);
   }

   @Override
   public ConnectionProperty x() {
      return new ConnectionProperty(this.f());
   }

   @Override
   protected WH3 m() {
      return new It4();
   }
}





