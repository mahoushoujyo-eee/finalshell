package com.finalshell.core;

import java.util.Collections;
import java.util.List;
import javax.swing.KeyStroke;
import org.jetbrains.annotations.NotNull;

public class ZT {
   public final String t;
   public final List x;

   public ZT(@NotNull String var1, @NotNull KeyStroke var2) {
      this(var1, Collections.singletonList(var2));
   }

   public ZT(@NotNull String var1, @NotNull List var2) {
      this.t = var1;
      this.x = var2;
   }

   @NotNull
   public String s() {
      return this.t;
   }

   @NotNull
   public List j() {
      return this.x;
   }
}





