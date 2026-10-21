import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.RowFilter.Entry;

class Lj_2 extends Entry {
   int h;
   final dM_3 n;

   private Lj_2(dM_3 var1) {
      this.n = var1;
   }

   @Override
   public Object getModel() {
      Method var10000 = (Method)com.c.c(184860797152005685L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(566043907753096060L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(118919302056896338L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         return var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   @Override
   public int getValueCount() {
      Method var10000 = (Method)com.c.c(184860797152005685L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(566043907753096060L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(401679078758232861L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   @Override
   public Object getValue(int var1) {
      Method var10000 = (Method)com.c.c(184860797152005685L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(566043907753096060L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10001 = com.c.a(com.c.c(238213257117654142L).getInt(this), var1);
      var10003 = com.c.d(533716037937215783L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         return var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public String getStringValue(int var1) {
      Method var10000 = (Method)com.c.c(184860797152005685L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(566043907753096060L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10001 = com.c.a(com.c.c(238213257117654142L).getInt(this), var1);
      var10003 = com.c.d(607512343893312129L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         return (String)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public Object getIdentifier() {
      Method var10000 = (Method)com.c.c(184860797152005685L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(566043907753096060L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var10001 = com.c.a(com.c.c(238213257117654142L).getInt(this));
      var10003 = com.c.d(535790739651468868L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         return var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   Lj_2(dM_3 var1, ut_4 var2) {
      this(var1);
   }
}





