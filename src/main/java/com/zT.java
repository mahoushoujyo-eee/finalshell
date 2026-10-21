package com;

import java.util.Collections;
import java.util.List;
import javax.swing.KeyStroke;
import org.jetbrains.annotations.NotNull;

public class zT {
   private final String t;
   private final List x;

   public zT(@NotNull String var1, @NotNull KeyStroke var2) {
      this(var1, Collections.singletonList(var2));
   }

   public zT(@NotNull String var1, @NotNull List var2) {
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





