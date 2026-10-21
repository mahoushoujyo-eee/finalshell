package com.m;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.io.Serializable;

@XStreamAlias("NodeState")
public class b_2 implements Serializable, Cloneable {
   @XStreamAsAttribute
   protected boolean C;
   @XStreamAsAttribute
   protected boolean r;

   public b_2() {
      this.C = false;
      this.r = false;
   }

   public b_2(boolean var1, boolean var2) {
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

   protected b_2 w() {
      return new b_2(this.C, this.r);
   }

   @Override
   protected Object clone() throws CloneNotSupportedException {
      return this.w();
   }
}





