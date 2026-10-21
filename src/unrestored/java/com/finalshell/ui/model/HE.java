package com.finalshell.ui.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XStreamAlias("ResourceList")
public class HE implements Serializable {
   @XStreamImplicit
   public List i = new ArrayList();

   public void m(F2 var1) {
      this.i.add(var1);
   }

   public void B(F2 var1) {
      this.i.remove(var1);
   }

   public F2 i(int var1) {
      return (F2)this.i.get(var1);
   }

   public List i() {
      return this.i;
   }

   public void G(List var1) {
      this.i = var1;
   }
}





