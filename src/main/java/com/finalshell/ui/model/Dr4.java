package com.finalshell.ui.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.io.Serializable;

@XStreamAlias("SettingsGroupState")
public class Dr4 implements Serializable {
   @XStreamAsAttribute
   public W2 Y;
   public Throwable s;

   public Dr4() {
      this(W2.none, null);
   }

   public Dr4(W2 var1) {
      this(var1, null);
   }

   public Dr4(W2 var1, Throwable var2) {
      this.J(var1);
      this.V(var2);
   }

   public W2 L() {
      return this.Y;
   }

   public void J(W2 var1) {
      this.Y = var1;
   }

   public Throwable c() {
      return this.s;
   }

   public void V(Throwable var1) {
      this.s = var1;
   }
}





