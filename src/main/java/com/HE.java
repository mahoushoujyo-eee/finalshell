package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XStreamAlias("ResourceList")
public class HE implements Serializable {
   @XStreamImplicit
   private List i = new ArrayList();

   public void m(com.F2 var1) {
      this.i.add(var1);
   }

   public void B(com.F2 var1) {
      this.i.remove(var1);
   }

   public com.F2 i(int var1) {
      return (com.F2)this.i.get(var1);
   }

   public List i() {
      return this.i;
   }

   public void G(List var1) {
      this.i = var1;
   }
}





