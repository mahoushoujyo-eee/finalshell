package com.finalshell.task;

import com.finalshell.core.IG;
import com.finalshell.core.X_2_2;
import com.finalshell.core.ZB;
import com.finalshell.core.ZY;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.concurrent.Callable;

public class RR3 implements Callable {
   final IG x;

   RR3(IG var1) {
      this.x = var1;
   }

   public Void k() {
      IG.q(this.x).k(Timestamp.class, ZB.p);
      IG.q(this.x).k(Date.class, ZB.H);
      IG.q(this.x).k(Time.class, X_2_2.l);
      IG.q(this.x).k(java.util.Date.class, ZY.f);
      return null;
   }

   @Override
   public Object call() throws Exception {
      return this.k();
   }
}





