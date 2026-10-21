package com.finalshell.ui.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.io.Serializable;

@XStreamAlias("NodeState")
public class B2_2 implements Serializable, Cloneable {
   @XStreamAsAttribute
   public boolean C;
   @XStreamAsAttribute
   public boolean r;

   public B2_2() {
      this.C = false;
      this.r = false;
   }

   public B2_2(boolean var1, boolean var2) {
      this.C = var1;
      this.r = var2;
   }

   public boolean P() {
      return this.C;
   }

   public void H(boolean var1) {
      this.C = var1;
   }

   public boolean a() {
      return this.r;
   }

   public void f(boolean var1) {
      this.r = var1;
   }

   public B2_2 w() {
      return new B2_2(this.C, this.r);
   }

   @Override
   public Object clone() throws CloneNotSupportedException {
      return this.w();
   }
}





