package com.finalshell.core;

import java.util.List;
import org.pcap4j.packet.LengthBuilder;

public final class BB3 implements LengthBuilder {
   public byte v;
   public boolean C;
   public List O;

   public BB3() {
   }

   public BB3(Fi2 var1) {
      this.v = Fi2.j(var1);
   }

   public BB3 u(byte var1) {
      this.v = var1;
      return this;
   }

   public BB3 E(List var1) {
      this.O = var1;
      return this;
   }

   public BB3 a(boolean var1) {
      this.C = var1;
      return this;
   }

   public Fi2 D() {
      return new Fi2(this, null);
   }

   @Override
   public Object build() {
      return this.D();
   }

   @Override
   public LengthBuilder correctLengthAtBuild(boolean var1) {
      return this.a(var1);
   }

   static List B(BB3 var0) {
      return var0.O;
   }

   static boolean t(BB3 var0) {
      return var0.C;
   }

   static byte A(BB3 var0) {
      return var0.v;
   }

   BB3(Fi2 var1, BB3 var2) {
      this(var1);
   }
}





