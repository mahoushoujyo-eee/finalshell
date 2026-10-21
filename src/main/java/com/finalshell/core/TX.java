package com.finalshell.core;

import java.util.EventObject;

public class TX extends EventObject {
   public final int N;
   public final boolean l;
   public final boolean P;

   public TX(XJ_2 var1, int var2, boolean var3, boolean var4) {
      super(var1);
      this.N = var2;
      this.l = var4;
      this.P = var3;
   }

   public int C() {
      return this.N;
   }

   public boolean H() {
      return this.l;
   }

   public boolean O() {
      return this.P;
   }
}





