package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.io.Serializable;

@XStreamAlias("langInfo")
public class IJ implements Serializable {
   @XStreamAsAttribute
   private String j;
   @XStreamAsAttribute
   private String x;
   @XStreamAsAttribute
   private String K;
   @XStreamAsAttribute
   private String M;

   public String k() {
      return this.j;
   }

   public void a(String var1) {
      this.j = var1;
   }

   public String y() {
      return this.x;
   }

   public void t(String var1) {
      this.x = var1;
   }

   public String h() {
      return this.K;
   }

   public void F(String var1) {
      this.K = var1;
   }

   public String I() {
      return this.M;
   }

   public void O(String var1) {
      this.M = var1;
   }
}





