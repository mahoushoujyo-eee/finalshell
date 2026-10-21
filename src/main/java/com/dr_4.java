package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.io.Serializable;

@XStreamAlias("SettingsGroupState")
public class dr_4 implements Serializable {
   @XStreamAsAttribute
   private _w_2 Y;
   private Throwable s;

   public dr_4() {
      this(_w_2.none, null);
   }

   public dr_4(_w_2 var1) {
      this(var1, null);
   }

   public dr_4(_w_2 var1, Throwable var2) {
      this.J(var1);
      this.V(var2);
   }

   public _w_2 L() {
      return this.Y;
   }

   public void J(_w_2 var1) {
      this.Y = var1;
   }

   public Throwable c() {
      return this.s;
   }

   public void V(Throwable var1) {
      this.s = var1;
   }
}





