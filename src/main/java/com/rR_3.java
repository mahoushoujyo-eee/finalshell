package com;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.concurrent.Callable;

class rR_3 implements Callable {
   final IG x;

   rR_3(IG var1) {
      this.x = var1;
   }

   public Void k() {
      IG.q(this.x).k(Timestamp.class, com.zB.p);
      IG.q(this.x).k(Date.class, com.zB.H);
      IG.q(this.x).k(Time.class, com.x_2.l);
      IG.q(this.x).k(java.util.Date.class, com.zY.f);
      return null;
   }

   @Override
   public Object call() throws Exception {
      return this.k();
   }
}





