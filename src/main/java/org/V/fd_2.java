package org.v;

class fd_2 implements org.v.m_2 {
   final N6 w;
   final H_3 s;

   fd_2(H_3 var1, N6 var2) {
      this.s = var1;
      this.w = var2;
   }

   public hu_2 w(NS var1) {
      return this.s.Y((NS)this.w);
   }

   public hu_2 X(NU var1) {
      return this.s.Z((NU)this.w);
   }

   @Override
   public Object Q(NS var1) throws Throwable {
      return this.w(var1);
   }

   @Override
   public Object Y(NU var1) throws Throwable {
      return this.X(var1);
   }
}





